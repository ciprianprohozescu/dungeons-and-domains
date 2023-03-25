package org.dnd.generator;

public class Program implements ASTObject {
	ASTObject[] definitions;

	@Override
	public void accept(Visitor visitor) {
		for (int i = 0; i < definitions.length; i++) {
			definitions[i].accept(visitor);
	    }
		visitor.visit(this);
	}
}
