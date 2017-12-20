/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.Partie#getName <em>Name</em>}</li>
 *   <li>{@link xtext.towerDefense.Partie#getCases <em>Cases</em>}</li>
 *   <li>{@link xtext.towerDefense.Partie#getCartes <em>Cartes</em>}</li>
 *   <li>{@link xtext.towerDefense.Partie#getEnergies <em>Energies</em>}</li>
 *   <li>{@link xtext.towerDefense.Partie#getPartieElements <em>Partie Elements</em>}</li>
 *   <li>{@link xtext.towerDefense.Partie#getNiveaux <em>Niveaux</em>}</li>
 * </ul>
 *
 * @see xtext.towerDefense.TowerDefensePackage#getPartie()
 * @model
 * @generated
 */
public interface Partie extends EObject
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
	 * @see xtext.towerDefense.TowerDefensePackage#getPartie_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link xtext.towerDefense.Partie#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.towerDefense.Case}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see xtext.towerDefense.TowerDefensePackage#getPartie_Cases()
	 * @model containment="true"
	 * @generated
	 */
  EList<Case> getCases();

  /**
	 * Returns the value of the '<em><b>Cartes</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.towerDefense.Carte}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cartes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartes</em>' containment reference list.
	 * @see xtext.towerDefense.TowerDefensePackage#getPartie_Cartes()
	 * @model containment="true"
	 * @generated
	 */
  EList<Carte> getCartes();

  /**
	 * Returns the value of the '<em><b>Energies</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.towerDefense.Energie}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Energies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Energies</em>' containment reference list.
	 * @see xtext.towerDefense.TowerDefensePackage#getPartie_Energies()
	 * @model containment="true"
	 * @generated
	 */
  EList<Energie> getEnergies();

  /**
	 * Returns the value of the '<em><b>Partie Elements</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.towerDefense.PartieElement}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partie Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Partie Elements</em>' containment reference list.
	 * @see xtext.towerDefense.TowerDefensePackage#getPartie_PartieElements()
	 * @model containment="true"
	 * @generated
	 */
  EList<PartieElement> getPartieElements();

  /**
	 * Returns the value of the '<em><b>Niveaux</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.towerDefense.Niveau}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Niveaux</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveaux</em>' containment reference list.
	 * @see xtext.towerDefense.TowerDefensePackage#getPartie_Niveaux()
	 * @model containment="true"
	 * @generated
	 */
  EList<Niveau> getNiveaux();

} // Partie
