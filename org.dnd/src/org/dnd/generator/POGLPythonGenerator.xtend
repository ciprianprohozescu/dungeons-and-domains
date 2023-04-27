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
		    game.current_state = to_state
		    
		    
		items = []
		adventure_entities = {}
		
		'''
		// Define Adventures, with States and Items
		for (e : input.resourceSet.allContents.toIterable.filter(org.dnd.pOGL.Adventure)) {
            program += e.visit
        }
        
        program += "\n"
        
        // Combine States and Items for export
        program += "\n"
        
        program += 
        '''
		class Game:
		    def __init__(self):
		        self.current_adventure = None
		        self.current_state = None
		        self.start_adventures = []
		        for adventure_name,adventure in adventure_entities.items():
		            for state_name, state in adventure["states"].items(): 
		                if state.modifier == "start":
		                    self.start_adventures.append((adventure_name, state)) 
		                    
		                
		
		        self.displayed_actions = []
		
		    def loadState(self):
		        size = os.get_terminal_size().columns
		        difference = 0
		        spaces = ""
		        length = len(self.current_state.description)
		        top_difference = (size - 7) // 2
		        top_difference = top_difference * "*"
		        if length < size - 4: 
		            difference = (size - length - 4) // 2
		            spaces = " " * difference
		            print("\n")
		            print(top_difference + " Scene " + top_difference)
		            print("* " + spaces + self.current_state.description + spaces + " *")
		            print("*" * size)
		        else: 
		            print(top_difference + " Scene " + top_difference)
		            rows = length // (size - 4) + 1
		            divisions_size = length // rows 
		            difference = (size - divisions_size - 4) // 2
		            spaces = " " * difference
		            for i in range(rows): 
		                print("* " + spaces + self.current_state.description[i * divisions_size: (i + 1) * divisions_size] + spaces + " *")
		                
		            print("*" * size)
		
		    def loadMenu(self):
		        print("\n")
		        print("----------MENU----------")
		        adventure_counter = 1
		        for i in self.start_adventures:
		            print(str(adventure_counter) + ') ' + i[0])
		            adventure_counter += 1
		        print("------------------------")
		        print("\n")
		        user_input = input("What adventure do you wanna play?: ")
		        if int(user_input) > len(self.start_adventures) or int(user_input) < 1:
		            print("Invalid input")
		            time.sleep(2)
		            os.system('cls')
		            self.loadMenu()
		        else:
		            self.current_state = self.start_adventures[int(user_input) - 1][1]
		            self.current_adventure = self.start_adventures[int(user_input) - 1]
		            os.system('cls')
		
		                
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
		        temp_items = []
		        print("\n")
		        print("----------INVENTORY----------")
		        for adventure in adventure_entities.values():
		            for item in adventure["items"].values():
		                if item.quantity > 0:
		                    print(item.name + ": " + str(item.quantity))
		                    temp_items.append(item)
		        if len(temp_items) == 0:
		            print("You have no items")
		        print("-----------------------------")
		        print("\n")
		                
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
		                is_legal = True 
		            else: 
		                os.system('cls')
		                self.refreshDisplay()
		                print('listen up bucko, please select a valid input')
		                action_choice = input("Choose action: ")
		
		
		    def refreshDisplay(self):
		        
		        self.loadState()
		        self.loadActions()
		        self.loadItems() 
		                    
		#add states and items to 
		        
		    def run(self):
		        os.system('cls')
		        self.loadMenu()
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
	private def dispatch visit(org.dnd.pOGL.Adventure adventure)'''
		adventure_entities["«adventure.name»"] = {"states": {}, "items": {}}
		«FOR definition : adventure.definitions.reject(org.dnd.pOGL.Action)»
		adventure_entities["«adventure.name»"][«definition.visit»
		«ENDFOR»
		
		«FOR definition : adventure.definitions.filter(org.dnd.pOGL.Action)»
		«visit(definition, adventure.name)»
		«ENDFOR»
		
		
	'''
	

	private def dispatch visit(org.dnd.pOGL.State state)'''
		"states"]["«state.name»"] = (State("«state.name»", "«state.description»"«IF state.optionalStateModifier !== null», "«state.optionalStateModifier»"«ENDIF»))
	'''
	
	private def dispatch visit(org.dnd.pOGL.Item item)'''
		"items"]["«item.name»"] = (Item("«item.name»"«IF item.eIsSet(POGLPackage.Literals.ITEM__VALUE)», «item.value»«ENDIF»))
	'''
	
    private def dispatch visit(org.dnd.pOGL.ItemManipulation itemManipulation, String adventure_name) '''
    	«IF itemManipulation.item.eIsSet(POGLPackage.Literals.FULLY_QUALIFIED_ITEM__ADVENTURE)»
    	adventure_entities["«itemManipulation.item.adventure.name»"]['items']["«itemManipulation.item.item.name»"].«itemManipulation.operator»(«itemManipulation.value»)
		«ELSE»
    	adventure_entities["«adventure_name»"]['items']["«itemManipulation.item.item.name»"].«itemManipulation.operator»(«itemManipulation.value»)
		«ENDIF»
    	
    '''
    
    private def dispatch visit(org.dnd.pOGL.MessageDisplay messageDisplay, String adventure_name) '''
    	print("ATTENTION: ")
    	print("+ " + "«messageDisplay.message»" + " +")
    	print("\n")
    '''
    
    private def dispatch visit(org.dnd.pOGL.ActionVisibilityChange actionVisibilityChange, String adventure_name) '''
    	«IF actionVisibilityChange.action.eIsSet(POGLPackage.Literals.FULLY_QUALIFIED_ACTION__ADVENTURE)»
    	adventure_entities["«actionVisibilityChange.action.adventure.name»"]['states']["«actionVisibilityChange.action.action.state.name»"].actions["«actionVisibilityChange.action.action.name»"]["is_hidden"] = «IF actionVisibilityChange.verb == 'reveal'»False«ELSE»True«ENDIF»
    	«ELSE»
    	adventure_entities["«adventure_name»"]['states']["«actionVisibilityChange.action.action.state.name»"].actions["«actionVisibilityChange.action.action.name»"]["is_hidden"] = «IF actionVisibilityChange.verb == 'reveal'»False«ELSE»True«ENDIF»
    	«ENDIF»
    '''
    
    private def dispatch visit(org.dnd.pOGL.StateTransition stateTransition, String adventure_name) '''
    	«IF stateTransition.state.eIsSet(POGLPackage.Literals.FULLY_QUALIFIED_STATE__ADVENTURE)»
    	goto(adventure_entities["«stateTransition.state.adventure.name»"]['states']["«stateTransition.state.state.name»"])
		«ELSE»
    	goto(adventure_entities["«adventure_name»"]['states']["«stateTransition.state.state.name»"])
		«ENDIF»
    '''

    private def dispatch visit(org.dnd.pOGL.Expression expression, String adventure_name) '''
        «visit(expression.left, adventure_name)» «expression.operator» «visit(expression.right, adventure_name)»'''
	//TODO Transform '=' to '=='
	
	
	private def dispatch visit(org.dnd.pOGL.Term term, String adventure_name) {
    	if (term.eIsSet(POGLPackage.Literals.TERM__TERM_INT))
    		return term.termInt
    	else if (term.eIsSet(POGLPackage.Literals.TERM__TERM_ITEM))
			if(term.termItem.eIsSet(POGLPackage.Literals.FULLY_QUALIFIED_ITEM__ADVENTURE))
    			return "adventure_entities['" + term.termItem.adventure.name + "']['items']['" + term.termItem.item.name + "'].quantity"
			else
				return "adventure_entities['" + adventure_name + "']['items']['" + term.termItem.item.name + "'].quantity"
    	else
    		return "0"
    }
	
	
    private def dispatch visit(org.dnd.pOGL.Check check, String adventure_name) {
		var content = "if " + visit(check.expression, adventure_name);
		for (expression : check.andExpressions) {
			content += " and " + visit(expression, adventure_name) 
		}
		return content + ":\n" + '''
	        	«FOR instruction : check.instructionsIfTrue»«visit(instruction, adventure_name)»«ENDFOR»
	        «IF check.eIsSet(POGLPackage.Literals.CHECK__INSTRUCTIONS_IF_FALSE)»
	        else:
	        	«FOR instruction : check.instructionsIfFalse»«visit(instruction, adventure_name)»«ENDFOR»
	        «ENDIF»
		'''
		
		}
	
	private def dispatch visit(org.dnd.pOGL.Action action, String adventure_name) '''
		def «action.name»():
			«FOR instruction : action.instructions»«visit(instruction, adventure_name)»«ENDFOR»
		
		adventure_entities["«adventure_name»"]['states']["«action.state.name»"].actions["«action.name»"] ={
			    "description": "«action.description»",
			    "is_hidden": «IF action.eIsSet(POGLPackage.Literals.ACTION__VISIBILITY)»True«ELSE»False«ENDIF»,
			    "function": «action.name»
		}
		
		
    '''
    
    
    
	
}