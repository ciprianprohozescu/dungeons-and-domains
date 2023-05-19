package org.dnd.validation;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.dnd.pOGL.Action;
import org.dnd.pOGL.Adventure;
import org.dnd.pOGL.Definition;
import org.dnd.pOGL.Expression;
import org.dnd.pOGL.Import;
import org.dnd.pOGL.Instruction;
import org.dnd.pOGL.Item;
import org.dnd.pOGL.ItemManipulation;
import org.dnd.pOGL.Program;
import org.dnd.pOGL.Module;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;


///*
// * generated by Xtext 2.29.0
// */
//
///**
// * This class contains custom validation rules. 
// *
// * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
// */
public class POGLValidator extends AbstractPOGLValidator {
	
	@Check
	public void checkAdventure(Program program) {
	    Map<String, String> adventureNames = new HashMap<String, String>();
	    Set<String> visitedFiles = new HashSet<>();
	    collectAdventureNames(program, adventureNames, visitedFiles);
	}

	private void collectAdventureNames(Program program, Map<String, String> adventureNames, Set<String> visitedFiles) {
		String currentProgramPath = program.eResource().getURI().toPlatformString(true);
	    String currentFilePath = Paths.get(currentProgramPath).toString();
	   
	    if (visitedFiles.contains(currentFilePath)) {
	        return;
	    }
	    
	    visitedFiles.add(currentFilePath);
	    for (Module module : program.getModules()) {
	        if (module.getModule() instanceof Adventure) {
	            Adventure adventure = (Adventure) module.getModule();
	            String adventureName = adventure.getName();
	            if (adventureName != null) {
	                if (adventureNames.containsKey(adventureName)) {
	                    error("Adventure name '" + adventureName + "' is already in use by file '" + adventureNames.get(adventureName) + "'", adventure, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
	                } else {
	                	adventureNames.put(adventureName, program.eResource().getURI().toPlatformString(true));
	                }
	            }
	        } else if (module.getModule() instanceof Import) {
	            Import importModule = (Import) module.getModule();
	            String importUri = importModule.getImportURI();
	            if (importUri != null && importUri.endsWith(".pogl")) {
	            	String folderPath = Paths.get(currentProgramPath).getParent().toString();
	            	URI importPlatformURI = URI.createPlatformResourceURI(folderPath + "/" + importUri, true);
	                Resource importedResource = importModule.eResource().getResourceSet().getResource(importPlatformURI, true);
	                Program importedProgram = (Program) importedResource.getContents().get(0);
	                collectAdventureNames(importedProgram, adventureNames, visitedFiles);
	            }
	        }
	    }
	}
	
	@Check
	public void checkDuplicateIdentifiers(Program program)
	{
		for (Module module : program.getModules())
		{
			if (module.getModule() instanceof Adventure) {
				Set<String> usedVariables = new HashSet<>();
				Adventure adventure = (Adventure) module.getModule();
				for (Definition definition : adventure.getDefinitions())
				{
					String defName = definition.getName();
					if (usedVariables.contains(defName)) {
						error("The identifier '" + defName + "' already exists within the adventure '" + adventure.getName() + "'", definition, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
					} 
					else {
						usedVariables.add(defName);
					}
				}
			}
		}
	}
	
	@Check
	public void checkUnusedVariables(Program program) {
  		for (Module module : program.getModules()) {
  			if (module.getModule() instanceof Adventure) {
  				Set<EObject> assignedVariables = new HashSet<>();
  		  		Set<EObject> usedVariables = new HashSet<>();
  		  		Adventure adventure = (Adventure) module.getModule();
  		  		for (Definition def : adventure.getDefinitions()) {
    				if (def instanceof Item) {
    					Item item = (Item) def;
     					assignedVariables.add(item);
    				}
     			}
  		  		
	  		  	for (Definition def : adventure.getDefinitions()) {
	 				if (def instanceof Action) {
	  					Action action = (Action) def;
	  					for (Instruction instr : action.getInstructions()) {
	  	                    if (instr instanceof ItemManipulation) {
	  	                    	ItemManipulation itemManipulation = (ItemManipulation) instr;
	  	                    	Item item = (Item) itemManipulation.getItem().getItem();
	  	                    	usedVariables.add(item);
	  	                    }
	  	                }
	  				}
	  			}
  			
	  			assignedVariables.removeAll(usedVariables);
	  			for (EObject unusedVariable : assignedVariables) {
	  				if (unusedVariable instanceof Item) {
	 					Item item = (Item) unusedVariable;
	  					warning("Unused item: " + item.getName(), item, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
	  				}
	  			}
  			}
  		}	
	}
}
