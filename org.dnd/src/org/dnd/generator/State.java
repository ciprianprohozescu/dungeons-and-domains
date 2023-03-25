package org.dnd.generator;

public class State implements ASTObject {
	String name;

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
