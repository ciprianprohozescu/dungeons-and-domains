/*
 * generated by Xtext 2.29.0
 */
package org.dnd.validation;

import org.eclipse.xtext.validation.Check;
import org.dnd.pOGL.POGLPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class POGLValidator extends AbstractPOGLValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkGreetingStartsWithCapital(org.dnd.pOGL.State state) {
		if (!Character.isUpperCase(state.getName().charAt(0))) {
			warning("State name should start with a capital", POGLPackage.Literals.STATE__NAME, INVALID_NAME);
		}
	}
	
}
