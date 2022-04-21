/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.upb.lp.isc.ElErrorCosmicoDePaserjRuntimeModule;
import edu.upb.lp.isc.ElErrorCosmicoDePaserjStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ElErrorCosmicoDePaserjIdeSetup extends ElErrorCosmicoDePaserjStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ElErrorCosmicoDePaserjRuntimeModule(), new ElErrorCosmicoDePaserjIdeModule()));
	}
	
}