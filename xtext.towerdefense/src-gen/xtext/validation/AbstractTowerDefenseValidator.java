/*
 * generated by Xtext 2.12.0
 */
package xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTowerDefenseValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(xtext.towerDefense.TowerDefensePackage.eINSTANCE);
		return result;
	}
	
}
