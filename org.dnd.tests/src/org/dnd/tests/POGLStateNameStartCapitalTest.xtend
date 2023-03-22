/*
 * generated by Xtext 2.29.0
 */
package org.dnd.tests

import com.google.inject.Inject
import org.dnd.pOGL.Program
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.dnd.pOGL.POGLPackage;
import org.dnd.validation.POGLValidator

@ExtendWith(InjectionExtension)
@InjectWith(POGLInjectorProvider)
class POGLStateNameStartCapitalTest {
	@Inject extension ParseHelper<Program>
	
	@Inject extension ValidationTestHelper
	
	 @Test
	 def testValidPOGL() {
	     "state Hello_xtext \"Hello, Xtext!\";".parse.assertNoIssues
	 }
	 
	 @Test
	 def testNameStartsWithCapitalWarning() {
	     "state hello_xtext \"Hello, Xtext!\";".parse.assertWarning(
	         POGLPackage.Literals.STATE,
	         POGLValidator.INVALID_NAME,
	         "Name should start with a capital"
	     )
	 }
}