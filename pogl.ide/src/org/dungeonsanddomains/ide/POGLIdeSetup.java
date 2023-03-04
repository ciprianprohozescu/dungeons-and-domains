/*
 * generated by Xtext 2.29.0
 */
package org.dungeonsanddomains.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.dungeonsanddomains.POGLRuntimeModule;
import org.dungeonsanddomains.POGLStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class POGLIdeSetup extends POGLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new POGLRuntimeModule(), new POGLIdeModule()));
	}
	
}
