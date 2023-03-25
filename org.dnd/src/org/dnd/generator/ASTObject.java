package org.dnd.generator;

public interface ASTObject {
	public void accept(Visitor visitor);
}
