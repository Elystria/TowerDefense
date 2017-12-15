/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projectile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.Projectile#getName <em>Name</em>}</li>
 *   <li>{@link xtext.towerDefense.Projectile#getPortee <em>Portee</em>}</li>
 *   <li>{@link xtext.towerDefense.Projectile#getMasse <em>Masse</em>}</li>
 *   <li>{@link xtext.towerDefense.Projectile#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link xtext.towerDefense.Projectile#getCase <em>Case</em>}</li>
 *   <li>{@link xtext.towerDefense.Projectile#getCible <em>Cible</em>}</li>
 *   <li>{@link xtext.towerDefense.Projectile#getDegat <em>Degat</em>}</li>
 * </ul>
 *
 * @see xtext.towerDefense.TowerDefensePackage#getProjectile()
 * @model
 * @generated
 */
public interface Projectile extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.towerDefense.TowerDefensePackage#getProjectile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Projectile#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Portee</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Portee</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Portee</em>' attribute.
   * @see #setPortee(int)
   * @see xtext.towerDefense.TowerDefensePackage#getProjectile_Portee()
   * @model
   * @generated
   */
  int getPortee();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Projectile#getPortee <em>Portee</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Portee</em>' attribute.
   * @see #getPortee()
   * @generated
   */
  void setPortee(int value);

  /**
   * Returns the value of the '<em><b>Masse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Masse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Masse</em>' attribute.
   * @see #setMasse(int)
   * @see xtext.towerDefense.TowerDefensePackage#getProjectile_Masse()
   * @model
   * @generated
   */
  int getMasse();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Projectile#getMasse <em>Masse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Masse</em>' attribute.
   * @see #getMasse()
   * @generated
   */
  void setMasse(int value);

  /**
   * Returns the value of the '<em><b>Vitesse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vitesse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vitesse</em>' attribute.
   * @see #setVitesse(int)
   * @see xtext.towerDefense.TowerDefensePackage#getProjectile_Vitesse()
   * @model
   * @generated
   */
  int getVitesse();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Projectile#getVitesse <em>Vitesse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse</em>' attribute.
   * @see #getVitesse()
   * @generated
   */
  void setVitesse(int value);

  /**
   * Returns the value of the '<em><b>Case</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' reference.
   * @see #setCase(Case)
   * @see xtext.towerDefense.TowerDefensePackage#getProjectile_Case()
   * @model
   * @generated
   */
  Case getCase();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Projectile#getCase <em>Case</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' reference.
   * @see #getCase()
   * @generated
   */
  void setCase(Case value);

  /**
   * Returns the value of the '<em><b>Cible</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cible</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cible</em>' reference.
   * @see #setCible(Case)
   * @see xtext.towerDefense.TowerDefensePackage#getProjectile_Cible()
   * @model
   * @generated
   */
  Case getCible();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Projectile#getCible <em>Cible</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cible</em>' reference.
   * @see #getCible()
   * @generated
   */
  void setCible(Case value);

  /**
   * Returns the value of the '<em><b>Degat</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Degat</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degat</em>' reference.
   * @see #setDegat(Energie)
   * @see xtext.towerDefense.TowerDefensePackage#getProjectile_Degat()
   * @model
   * @generated
   */
  Energie getDegat();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Projectile#getDegat <em>Degat</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degat</em>' reference.
   * @see #getDegat()
   * @generated
   */
  void setDegat(Energie value);

} // Projectile
