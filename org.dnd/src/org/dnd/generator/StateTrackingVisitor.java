package org.dnd.generator;

public class StateTrackingVisitor implements Visitor {
	int noOfStates;
	
	StateTrackingVisitor() {
		noOfStates = 0;
	}

	@Override
	public void visit(Program program) {
		System.out.println("This is the start of the program.");
	}

	@Override
	public void visit(State state) {
		noOfStates++;
		System.out.println("State no. " + noOfStates + ": " + state.name);
	}
	
}
