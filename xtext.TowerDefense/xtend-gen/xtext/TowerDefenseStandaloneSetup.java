/**
 * generated by Xtext 2.12.0
 */
package xtext;

import xtext.TowerDefenseStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TowerDefenseStandaloneSetup extends TowerDefenseStandaloneSetupGenerated {
  public static void doSetup() {
    new TowerDefenseStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
