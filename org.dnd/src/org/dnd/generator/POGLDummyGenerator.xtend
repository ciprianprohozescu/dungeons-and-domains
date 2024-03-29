/*
 * generated by Xtext 2.29.0
 */
package org.dnd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class POGLDummyGenerator implements POGLAbstractGenerator {

	String program
	
	override void generate(Resource input, IFileSystemAccess2 fsa) {
		program = "Hello, World!"
        
        // Generate output file
        fsa.generateFile('dummy.txt', program)
	}
}
