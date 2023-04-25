///*
// * generated by Xtext 2.29.0
// */
//package org.dnd.validation;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.dnd.pOGL.Action;
//import org.dnd.pOGL.Definition;
//import org.dnd.pOGL.Instruction;
//import org.dnd.pOGL.Item;
//import org.dnd.pOGL.ItemManipulation;
//import org.dnd.pOGL.Program;
//import org.dnd.pOGL.StateTransition;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.xtext.validation.Check;
//import org.eclipse.xtext.validation.ValidationMessageAcceptor;
//import org.jgrapht.Graph;
//import org.jgrapht.Graphs;
//import org.jgrapht.graph.DefaultDirectedGraph;
//import org.jgrapht.graph.DefaultEdge;
//
///**
// * This class contains custom validation rules. 
// *
// * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
// */
//public class POGLValidator extends AbstractPOGLValidator {
//
//	@Check
//	public void checkUnusedVariables(Program program) {
//		Set<EObject> assignedVariables = new HashSet<>();
//		Set<EObject> usedVariables = new HashSet<>();
//		for (Definition def : program.getDefinitions()) {
//			if (def.getDefinition() instanceof Item) { 
//				Item item = (Item) def.getDefinition();
//				assignedVariables.add(item);
//			}
//		}
//		
//		for (Definition def :program.getDefinitions()) {
//			if (def.getDefinition() instanceof Action) {
//				Action action = (Action) def.getDefinition();
//				for (Instruction instr : action.getInstructions()) {
//                    if (instr instanceof ItemManipulation) {
//                    	ItemManipulation itemManipulation = (ItemManipulation) instr;
//                    	Item item = itemManipulation.getItem();
//                    	usedVariables.add(item);
//                    }
//                }
//			}
//		}
//		
//		assignedVariables.removeAll(usedVariables);
//		for (EObject unusedVariable : assignedVariables) {
//			if (unusedVariable instanceof Item) {
//				Item item = (Item) unusedVariable;
//				warning("Unused item: " + item.getName(), item, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//			}
//		}
//	}
//	
//	@Check
//	public void checkUnreachableStates(Program program) {
//		Graph<org.dnd.pOGL.State, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
//		for (Definition def : program.getDefinitions()) {
//            if (def.getDefinition() instanceof org.dnd.pOGL.State) {
//            	org.dnd.pOGL.State state = (org.dnd.pOGL.State) def.getDefinition();
//                graph.addVertex(state);
//            } else if (def.getDefinition() instanceof Action) {
//            	Action action = (Action) def.getDefinition();
//                for (Instruction instr : action.getInstructions()) {
//                	/*
//                    if (instr.getType() instanceof StateTransition) {
//                    	StateTransition transition = (StateTransition) instr.getType();
//                        graph.addEdge(action.getState(), transition.getState());
//                    }
//                    */
//                   if (instr instanceof StateTransition) {
//                	   StateTransition transition = (StateTransition) instr;
//                       graph.addEdge(action.getState(), transition.getState());
//                   }
//                }
//            }
//        }
//		org.dnd.pOGL.State startState = findStartState(program);
//		if(startState == null) {
//			warning("There is no start state, all states are unreachable.", null, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//		}
//		else {
//	        Set<org.dnd.pOGL.State> unreachableStates = getUnreachableStates(graph, startState);
//	        for (org.dnd.pOGL.State unreachableState : unreachableStates) {
//	        	warning("Unreachable state: " + unreachableState.getName(), unreachableState, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//	        }
//		}
//	}
//	
//	private org.dnd.pOGL.State findStartState(Program program) {
//	    for (Definition definition : program.getDefinitions()) {
//	        if (definition.getDefinition() instanceof org.dnd.pOGL.State) {
//	            org.dnd.pOGL.State state = (org.dnd.pOGL.State) definition.getDefinition();
//	            if ("start".equals(state.getOptionalStateModifier())) {
//	                return state;
//	            }
//	        }
//	    }
//	    return null;
//	}
//	
//	Set<org.dnd.pOGL.State> getReachableStates(Graph<org.dnd.pOGL.State, DefaultEdge> graph, org.dnd.pOGL.State startState) {
//	    Set<org.dnd.pOGL.State> reachableStates = new HashSet<>();
//	    Deque<org.dnd.pOGL.State> stack = new ArrayDeque<>();
//	    stack.push(startState);
//	    while (!stack.isEmpty()) {
//	        org.dnd.pOGL.State currentState = stack.pop();
//	        if (!reachableStates.contains(currentState)) {
//	            reachableStates.add(currentState);
//	            for (org.dnd.pOGL.State neighborState : Graphs.successorListOf(graph, currentState)) {
//	                stack.push(neighborState);
//	            }
//	        }
//	    }
//	    return reachableStates;
//	}
//	
//	Set<org.dnd.pOGL.State> getUnreachableStates(Graph<org.dnd.pOGL.State, DefaultEdge> graph, org.dnd.pOGL.State startState) {
//	    Set<org.dnd.pOGL.State> reachableStates = getReachableStates(graph, startState);
//	    Set<org.dnd.pOGL.State> unreachableStates = new HashSet<>(graph.vertexSet());
//	    unreachableStates.removeAll(reachableStates);
//	    return unreachableStates;
//	}
//	
//	@Check
//	public void checkStartState(Program program) {
//		boolean foundStartState = false;
//		ArrayList<org.dnd.pOGL.State> statesExist = new ArrayList<>();
//		ArrayList<org.dnd.pOGL.State> statesUsed = new ArrayList<>();
//		for (Definition definition : program.getDefinitions()) {
//			if (definition.getDefinition() instanceof org.dnd.pOGL.State) {
//				org.dnd.pOGL.State state = (org.dnd.pOGL.State) definition.getDefinition();
//				statesExist.add(state);
//				if(state.getOptionalStateModifier().equals("start")) {
//					if(foundStartState)
//						error("There must only be one start state.", state, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//					foundStartState = true;
//					statesUsed.add(state);
//				}			
//			}
//		}
//	}
//	
//	@Check
//	public void checkDuplicateVariableNames(Program program) {
//		Set<String> names = new HashSet<String>();
//		for (Definition definition : program.getDefinitions()) {
//		    if (definition.getDefinition() instanceof org.dnd.pOGL.State) {
//		    	org.dnd.pOGL.State state = (org.dnd.pOGL.State) definition.getDefinition();
//		        String name = state.getName();
//		        if (name != null) {
//		            if (names.contains(name)) {
//		                error("Duplicate name: " + name, state, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//		            } else {
//		                names.add(name);
//		            }
//		        }
//		    } else if (definition.getDefinition() instanceof Item) {
//		        Item item = (Item) definition.getDefinition();
//		        String name = item.getName();
//		        if (name != null) {
//		            if (names.contains(name)) {
//		                error("Duplicate name: " + name, item, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//		            } else {
//		                names.add(name);
//		            }
//		        }
//		    } 
//		    else if (definition.getDefinition() instanceof Action) {
//		        Action action = (Action) definition.getDefinition();
//		        String name = action.getName();
//		        if (name != null) {
//		            if (names.contains(name)) {
//		                error("Duplicate name: " + name, action, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//		            } else {
//		                names.add(name);
//		            }
//		        }
//		    }
//		}
//	}
//}

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

import org.dnd.pOGL.Action;
import org.dnd.pOGL.Definition;
import org.dnd.pOGL.Instruction;
import org.dnd.pOGL.Item;
import org.dnd.pOGL.ItemManipulation;
import org.dnd.pOGL.Program;
import org.dnd.pOGL.StateTransition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class POGLValidator extends AbstractPOGLValidator {

//	@Check
//	public void checkUnusedVariables(Program program) {
//		Set<EObject> assignedVariables = new HashSet<>();
//		Set<EObject> usedVariables = new HashSet<>();
//		for (Definition def : program.getDefinitions()) {
//			if (def.getDefinition() instanceof Item) { 
//				Item item = (Item) def.getDefinition();
//				assignedVariables.add(item);
//			}
//		}
//		
//		for (Definition def :program.getDefinitions()) {
//			if (def.getDefinition() instanceof Action) {
//				Action action = (Action) def.getDefinition();
//				for (Instruction instr : action.getInstructions()) {
//                    if (instr instanceof ItemManipulation) {
//                    	ItemManipulation itemManipulation = (ItemManipulation) instr;
//                    	Item item = itemManipulation.getItem();
//                    	usedVariables.add(item);
//                    }
//                }
//			}
//		}
//		
//		assignedVariables.removeAll(usedVariables);
//		for (EObject unusedVariable : assignedVariables) {
//			if (unusedVariable instanceof Item) {
//				Item item = (Item) unusedVariable;
//				warning("Unused item: " + item.getName(), item, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//			}
//		}
//	}
//	
//	@Check
//	public void checkUnreachableStates(Program program) {
//		Graph<org.dnd.pOGL.State, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
//		for (Definition def : program.getDefinitions()) {
//            if (def.getDefinition() instanceof org.dnd.pOGL.State) {
//            	org.dnd.pOGL.State state = (org.dnd.pOGL.State) def.getDefinition();
//                graph.addVertex(state);
//            } else if (def.getDefinition() instanceof Action) {
//            	Action action = (Action) def.getDefinition();
//                for (Instruction instr : action.getInstructions()) {
//                	/*
//                    if (instr.getType() instanceof StateTransition) {
//                    	StateTransition transition = (StateTransition) instr.getType();
//                        graph.addEdge(action.getState(), transition.getState());
//                    }
//                    */
//                   if (instr instanceof StateTransition) {
//                	   StateTransition transition = (StateTransition) instr;
//                       graph.addEdge(action.getState(), transition.getState());
//                   }
//                }
//            }
//        }
//		org.dnd.pOGL.State startState = findStartState(program);
//		if(startState == null) {
//			warning("There is no start state, all states are unreachable.", null, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//		}
//		else {
//	        Set<org.dnd.pOGL.State> unreachableStates = getUnreachableStates(graph, startState);
//	        for (org.dnd.pOGL.State unreachableState : unreachableStates) {
//	        	warning("Unreachable state: " + unreachableState.getName(), unreachableState, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//	        }
//		}
//	}
//	
//	private org.dnd.pOGL.State findStartState(Program program) {
//	    for (Definition definition : program.getDefinitions()) {
//	        if (definition.getDefinition() instanceof org.dnd.pOGL.State) {
//	            org.dnd.pOGL.State state = (org.dnd.pOGL.State) definition.getDefinition();
//	            if ("start".equals(state.getOptionalStateModifier())) {
//	                return state;
//	            }
//	        }
//	    }
//	    return null;
//	}
//	
//	Set<org.dnd.pOGL.State> getReachableStates(Graph<org.dnd.pOGL.State, DefaultEdge> graph, org.dnd.pOGL.State startState) {
//	    Set<org.dnd.pOGL.State> reachableStates = new HashSet<>();
//	    Deque<org.dnd.pOGL.State> stack = new ArrayDeque<>();
//	    stack.push(startState);
//	    while (!stack.isEmpty()) {
//	        org.dnd.pOGL.State currentState = stack.pop();
//	        if (!reachableStates.contains(currentState)) {
//	            reachableStates.add(currentState);
//	            for (org.dnd.pOGL.State neighborState : Graphs.successorListOf(graph, currentState)) {
//	                stack.push(neighborState);
//	            }
//	        }
//	    }
//	    return reachableStates;
//	}
//	
//	Set<org.dnd.pOGL.State> getUnreachableStates(Graph<org.dnd.pOGL.State, DefaultEdge> graph, org.dnd.pOGL.State startState) {
//	    Set<org.dnd.pOGL.State> reachableStates = getReachableStates(graph, startState);
//	    Set<org.dnd.pOGL.State> unreachableStates = new HashSet<>(graph.vertexSet());
//	    unreachableStates.removeAll(reachableStates);
//	    return unreachableStates;
//	}
//	
//	@Check
//	public void checkStartState(Program program) {
//		boolean foundStartState = false;
//		ArrayList<org.dnd.pOGL.State> statesExist = new ArrayList<>();
//		ArrayList<org.dnd.pOGL.State> statesUsed = new ArrayList<>();
//		for (Definition definition : program.getDefinitions()) {
//			if (definition.getDefinition() instanceof org.dnd.pOGL.State) {
//				org.dnd.pOGL.State state = (org.dnd.pOGL.State) definition.getDefinition();
//				statesExist.add(state);
//				if(state.getOptionalStateModifier().equals("start")) {
//					if(foundStartState)
//						error("There must only be one start state.", state, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//					foundStartState = true;
//					statesUsed.add(state);
//				}			
//			}
//		}
//	}
//	
//	@Check
//	public void checkDuplicateVariableNames(Program program) {
//		Set<String> names = new HashSet<String>();
//		for (Definition definition : program.getDefinitions()) {
//		    if (definition.getDefinition() instanceof org.dnd.pOGL.State) {
//		    	org.dnd.pOGL.State state = (org.dnd.pOGL.State) definition.getDefinition();
//		        String name = state.getName();
//		        if (name != null) {
//		            if (names.contains(name)) {
//		                error("Duplicate name: " + name, state, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//		            } else {
//		                names.add(name);
//		            }
//		        }
//		    } else if (definition.getDefinition() instanceof Item) {
//		        Item item = (Item) definition.getDefinition();
//		        String name = item.getName();
//		        if (name != null) {
//		            if (names.contains(name)) {
//		                error("Duplicate name: " + name, item, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//		            } else {
//		                names.add(name);
//		            }
//		        }
//		    } 
//		    else if (definition.getDefinition() instanceof Action) {
//		        Action action = (Action) definition.getDefinition();
//		        String name = action.getName();
//		        if (name != null) {
//		            if (names.contains(name)) {
//		                error("Duplicate name: " + name, action, null, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
//		            } else {
//		                names.add(name);
//		            }
//		        }
//		    }
//		}
//	}
}
