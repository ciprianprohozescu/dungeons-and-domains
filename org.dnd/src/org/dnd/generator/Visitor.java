package org.dnd.generator;

public interface Visitor {
	public void visit(Program program);
	public void visit(State state);
}
