/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ElErrorCosmicoDePaserjStandaloneSetup extends ElErrorCosmicoDePaserjStandaloneSetupGenerated {

	public static void doSetup() {
		new ElErrorCosmicoDePaserjStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
