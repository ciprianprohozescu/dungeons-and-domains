package org.dnd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.dnd.pOGL.POGLPackage

class POGLPythonGenerator implements POGLAbstractGenerator {
	
	String program
	
	override void generate(Resource input, IFileSystemAccess2 fsa) {
		program = ""
		
		// Instantiate Classes
		for (e : input.allContents.toIterable.filter(org.dnd.pOGL.Program)) {
            program += e.visit
        }
				
		// Define states
		for (e : input.allContents.toIterable.filter(org.dnd.pOGL.State)) {
            program += e.visit
        }
        
        //TODO Add all states and items to list
        
        program += "\n"
        
        // Define items
		for (e : input.allContents.toIterable.filter(org.dnd.pOGL.Item)) {
            program += e.visit
        }
        
        program += "\n"
        
        // Define actions
		for (e : input.allContents.toIterable.filter(org.dnd.pOGL.Action)) {
            program += e.visit 
        }
        program += "\n"
        
        // Combine States and Items for export
        program += "\n"
        
        // Generate output file
        fsa.generateFile('python_pogl.py', program)
	}
	
	private def dispatch visit(org.dnd.pOGL.Program program)'''
		class State:
		    def __init__(self, name: str, description: str, modifier: str = None):
		        self.name = name
		        self.description = description
		        self.modifier = modifier
		        self.actions = {}
		        
		        
		class Item:
		    def __init__(self, name: str, quantity: int = 0):
		        self.name = name
		        self.quantity = quantity
		    
		    def add(self, quantity: int):
		        self.quantity += quantity
		    
		    def remove(self, quantity: int):
		        self.quantity -= quantity
		        
		    def set(self, quantity: int):
		        self.quantity = quantity
		        
		        
		def goto(to_state: State):
		    # Placeholder
		    pass
		    
		    
		def return_entities():
			return states, items
			
		states = []
		items = []
		
		
	'''
	
	private def dispatch visit(org.dnd.pOGL.State state)'''
		«state.name» = State("«state.name»", "«state.description»"«IF state.optionalStateModifier !== null», "«state.optionalStateModifier»"«ENDIF»)
		states.append(«state.name»)
	'''
	
	private def dispatch visit(org.dnd.pOGL.Item item)'''
		«item.name» = Item ("«item.name»"«IF item.eIsSet(POGLPackage.Literals.ITEM__VALUE)», «item.value»«ENDIF»)
		items.append(«item.name»)
	'''
	
    private def dispatch visit(org.dnd.pOGL.ItemManipulation itemManipulation) '''
    	«itemManipulation.item.name».«itemManipulation.operator»(«itemManipulation.value»)
    '''
    
    private def dispatch visit(org.dnd.pOGL.MessageDisplay messageDisplay) '''
    	print("«messageDisplay.message»")
    '''
    
    private def dispatch visit(org.dnd.pOGL.ActionVisibilityChange actionVisibilityChange) '''
    	«actionVisibilityChange.action.state.name».actions["«actionVisibilityChange.action.name»"]["is_hidden"] = «IF actionVisibilityChange.verb == 'reveal'»False«ELSE»True«ENDIF»
    '''
    
    private def dispatch visit(org.dnd.pOGL.StateTransition stateTransition) '''
    	goto(«stateTransition.state.name»)
    '''

    private def dispatch visit(org.dnd.pOGL.Expression expression) '''
        «expression.left.visit» «expression.operator» «expression.right.visit»'''
	//TODO Transform '=' to '=='
	
	
	private def dispatch visit(org.dnd.pOGL.Term term) {
    	if (term.eIsSet(POGLPackage.Literals.TERM__TERM_INT))
    		return term.termInt
    	if (term.eIsSet(POGLPackage.Literals.TERM__TERM_ITEM))
    		return term.termItem.name + ".quantity"
    	return "0"
    }
	
	
    private def dispatch visit(org.dnd.pOGL.Check check) {
		var content = "if " + check.expression.visit;
		for (expression : check.andExpressions) {
			content += " and " + expression.visit 
		}
		return content + ":\n" + '''
	        	«FOR instruction : check.instructionsIfTrue»«instruction.visit»«ENDFOR»
	        «IF check.eIsSet(POGLPackage.Literals.CHECK__INSTRUCTIONS_IF_FALSE)»
	        else:
	        	«FOR instruction : check.instructionsIfFalse»«instruction.visit»«ENDFOR»
	        «ENDIF»
		'''
		
		}
	
	private def dispatch visit(org.dnd.pOGL.Action action) '''
		def «action.name»():
			«FOR instruction : action.instructions»«instruction.visit»«ENDFOR»
		
		«action.state.name».actions["«action.name»"] = {
			    "description": "«action.description»",
			    "is_hidden": «IF action.eIsSet(POGLPackage.Literals.ACTION__VISIBILITY)»False«ELSE»True«ENDIF»,
			    "function": «action.name»
		}
		
		
    '''
    
    
    
	
}