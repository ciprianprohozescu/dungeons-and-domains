package org.dnd.generator;

import java.util.ArrayList;

public class Action extends AST {
	String name;
	String visibility;
	String state;
	String description;
	ArrayList<AST> instructions;
	
	Action(String name, String visibility, String state, String description) {
		this.name = name;
		this.visibility = visibility;
		this.state = state;
		this.description = description;
	}
	
	public void prettyPrint() {
		System.out.println("action " + name + " " + visibility + " in " + state + " " + description + " do");
		for (int i = 0; i < instructions.size(); i++) {
			instructions.get(i).prettyPrint();
		}
		System.out.println("end");
	}
	
	public void typeCheck() {
		for (int i = 0; i < instructions.size(); i++) {
			instructions.get(i).typeCheck();
		}
	}
	
	public void generateCode() {
		for (int i = 0; i < instructions.size(); i++) {
			instructions.get(i).generateCode();
		}
	}
}
