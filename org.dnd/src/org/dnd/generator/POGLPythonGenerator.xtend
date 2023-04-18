package org.dnd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.dnd.pOGL.POGLPackage

class POGLPythonGenerator implements POGLAbstractGenerator {
	
	String program
	
	override void generate(Resource input, IFileSystemAccess2 fsa) {
		program = ""
      
        program += 
        '''
		import os
		
		
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
        
        program += 
        '''
		class Game:
		    def __init__(self):
		        for i in states: 
		            if i.modifier == "start":
		                self.current_state = i
		        self.displayed_actions = []
		    def loadState(self):
		        size = os.get_terminal_size().columns
		        difference = 0
		        spaces = ""
		        length = len(self.current_state.description)
		        if length < size - 4: 
		            difference = (size - length - 4) // 2
		            spaces = " " * difference
		            print("\n")
		            print("*" * size)
		            print("* " + spaces + self.current_state.description + spaces + " *")
		            print("*" * size)
		        else: 
		            print("*" * size)
		            rows = length // (size - 4) + 1
		            divisions_size = length // rows 
		            difference = (size - divisions_size - 4) // 2
		            spaces = " " * difference
		            for i in range(rows): 
		                print("* " + spaces + self.current_state.description[i * divisions_size: (i + 1) * divisions_size] + spaces + " *")
		                
		            print("*" * size)
		
		                
		    def loadActions(self): 
		        action_counter = 1
		        self.displayed_actions = []
		        print("\n")
		        print("What do you wanna do?")
		        print("\n")
		        print("----------ACTIONS----------")
		        for i in self.current_state.actions:        
		            if self.current_state.actions[i]["is_hidden"] == False: 
		                print(str(action_counter) + ") " + self.current_state.actions[i]["description"])
		                self.displayed_actions.append(self.current_state.actions[i]["function"])
		                action_counter += 1	
		        print("---------------------------")
		    def loadItems(self):
		        print("\n")
		        print("----------INVENTORY----------")
		        for i in items:
		            print(") " + i.name + ": " + str(i.quantity))
		        print("-----------------------------")
		        print("\n")
		    def updateCurrentState(self):
		         for i in states:
		            if i.name == self.current_state.name:
		                self.current_state == i
		                
		    def promptUser(self):
		        is_legal = False
		        self.refreshDisplay()
		        action_choice = input("Choose action: ")
		        while(is_legal == False): 
		            if action_choice.isnumeric() and int(action_choice) <= len(self.displayed_actions): 
		                os.system('cls')
		                print('\n')
		                self.displayed_actions[int(action_choice) - 1]()
		                self.displayed_actions = []
		                self.updateCurrentState()
		                #print(self.displayed_actions[int(action_choice) - 1])
		                is_legal = True 
		            else: 
		                self.refreshDisplay()
		                print('listen up bucko, please select a valid input')
		                action_choice = input("Choose action: ")
		
		
		    def refreshDisplay(self):
		        os.system('cls')
		        self.loadState()
		        self.loadActions()
		        self.loadItems() 
		                    
		
		        
		    def run(self):
		        game_state = True 
		        while(game_state):
		            self.promptUser()
		            if self.current_state.modifier == "final":
		                self.loadState()
		                game_state = False
		                print("THE GAME HAS ENDED")
		                
		game = Game()
		game.run()
        '''
        
        // Generate output file
        fsa.generateFile('python_pogl.py', program)
	}

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
			    "is_hidden": «IF action.eIsSet(POGLPackage.Literals.ACTION__VISIBILITY)»True«ELSE»False«ENDIF»,
			    "function": «action.name»
		}
		
		
    '''
    
    
    
	
}