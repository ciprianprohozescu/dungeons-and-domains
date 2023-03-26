package org.dnd.generator;

public class StateTracker {
	public void trackStates(ASTObject program) {
		program.accept(new StateTrackingVisitor());
	}
}
