/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xtext.towerDefense.TowerDefensePackage
 * @generated
 */
public interface TowerDefenseFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  TowerDefenseFactory eINSTANCE = xtext.towerDefense.impl.TowerDefenseFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Jeu</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jeu</em>'.
	 * @generated
	 */
  Jeu createJeu();

  /**
	 * Returns a new object of class '<em>Partie</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partie</em>'.
	 * @generated
	 */
  Partie createPartie();

  /**
	 * Returns a new object of class '<em>Partie Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partie Element</em>'.
	 * @generated
	 */
  PartieElement createPartieElement();

  /**
	 * Returns a new object of class '<em>Energie</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energie</em>'.
	 * @generated
	 */
  Energie createEnergie();

  /**
	 * Returns a new object of class '<em>Obstacle</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstacle</em>'.
	 * @generated
	 */
  Obstacle createObstacle();

  /**
	 * Returns a new object of class '<em>Mobile</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile</em>'.
	 * @generated
	 */
  Mobile createMobile();

  /**
	 * Returns a new object of class '<em>Projectile</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projectile</em>'.
	 * @generated
	 */
  Projectile createProjectile();

  /**
	 * Returns a new object of class '<em>Nature Terrain</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nature Terrain</em>'.
	 * @generated
	 */
  NatureTerrain createNatureTerrain();

  /**
	 * Returns a new object of class '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Niveau</em>'.
	 * @generated
	 */
  Niveau createNiveau();

  /**
	 * Returns a new object of class '<em>Carte</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carte</em>'.
	 * @generated
	 */
  Carte createCarte();

  /**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
  Case createCase();

  /**
	 * Returns a new object of class '<em>Vague</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vague</em>'.
	 * @generated
	 */
  Vague createVague();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  TowerDefensePackage getTowerDefensePackage();

} //TowerDefenseFactory
