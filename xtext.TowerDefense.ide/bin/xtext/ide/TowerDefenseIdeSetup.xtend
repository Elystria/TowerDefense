/*
 * generated by Xtext 2.12.0
 */
package xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import xtext.TowerDefenseRuntimeModule
import xtext.TowerDefenseStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TowerDefenseIdeSetup extends TowerDefenseStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TowerDefenseRuntimeModule, new TowerDefenseIdeModule))
	}
	
}
