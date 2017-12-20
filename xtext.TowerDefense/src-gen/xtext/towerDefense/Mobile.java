/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.Mobile#getForce <em>Force</em>}</li>
 *   <li>{@link xtext.towerDefense.Mobile#getVolume <em>Volume</em>}</li>
 *   <li>{@link xtext.towerDefense.Mobile#getNumVague <em>Num Vague</em>}</li>
 *   <li>{@link xtext.towerDefense.Mobile#getCaseEntree <em>Case Entree</em>}</li>
 *   <li>{@link xtext.towerDefense.Mobile#getCaseSortie <em>Case Sortie</em>}</li>
 *   <li>{@link xtext.towerDefense.Mobile#getQuantiteEnergieMax <em>Quantite Energie Max</em>}</li>
 *   <li>{@link xtext.towerDefense.Mobile#getTactique <em>Tactique</em>}</li>
 * </ul>
 *
 * @see xtext.towerDefense.TowerDefensePackage#getMobile()
 * @model
 * @generated
 */
public interface Mobile extends PartieElement
{
  /**
   * Returns the value of the '<em><b>Force</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Force</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Force</em>' attribute.
   * @see #setForce(int)
   * @see xtext.towerDefense.TowerDefensePackage#getMobile_Force()
   * @model
   * @generated
   */
  int getForce();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Mobile#getForce <em>Force</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Force</em>' attribute.
   * @see #getForce()
   * @generated
   */
  void setForce(int value);

  /**
   * Returns the value of the '<em><b>Volume</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Volume</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Volume</em>' attribute.
   * @see #setVolume(int)
   * @see xtext.towerDefense.TowerDefensePackage#getMobile_Volume()
   * @model
   * @generated
   */
  int getVolume();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Mobile#getVolume <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volume</em>' attribute.
   * @see #getVolume()
   * @generated
   */
  void setVolume(int value);

  /**
   * Returns the value of the '<em><b>Num Vague</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Vague</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Vague</em>' attribute.
   * @see #setNumVague(int)
   * @see xtext.towerDefense.TowerDefensePackage#getMobile_NumVague()
   * @model
   * @generated
   */
  int getNumVague();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Mobile#getNumVague <em>Num Vague</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Vague</em>' attribute.
   * @see #getNumVague()
   * @generated
   */
  void setNumVague(int value);

  /**
   * Returns the value of the '<em><b>Case Entree</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Entree</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Entree</em>' reference.
   * @see #setCaseEntree(Case)
   * @see xtext.towerDefense.TowerDefensePackage#getMobile_CaseEntree()
   * @model
   * @generated
   */
  Case getCaseEntree();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Mobile#getCaseEntree <em>Case Entree</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Entree</em>' reference.
   * @see #getCaseEntree()
   * @generated
   */
  void setCaseEntree(Case value);

  /**
   * Returns the value of the '<em><b>Case Sortie</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Sortie</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Sortie</em>' reference.
   * @see #setCaseSortie(Case)
   * @see xtext.towerDefense.TowerDefensePackage#getMobile_CaseSortie()
   * @model
   * @generated
   */
  Case getCaseSortie();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Mobile#getCaseSortie <em>Case Sortie</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Sortie</em>' reference.
   * @see #getCaseSortie()
   * @generated
   */
  void setCaseSortie(Case value);

  /**
   * Returns the value of the '<em><b>Quantite Energie Max</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantite Energie Max</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantite Energie Max</em>' reference.
   * @see #setQuantiteEnergieMax(Energie)
   * @see xtext.towerDefense.TowerDefensePackage#getMobile_QuantiteEnergieMax()
   * @model
   * @generated
   */
  Energie getQuantiteEnergieMax();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Mobile#getQuantiteEnergieMax <em>Quantite Energie Max</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantite Energie Max</em>' reference.
   * @see #getQuantiteEnergieMax()
   * @generated
   */
  void setQuantiteEnergieMax(Energie value);

  /**
   * Returns the value of the '<em><b>Tactique</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.towerDefense.TactiqueType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tactique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tactique</em>' attribute.
   * @see xtext.towerDefense.TactiqueType
   * @see #setTactique(TactiqueType)
   * @see xtext.towerDefense.TowerDefensePackage#getMobile_Tactique()
   * @model
   * @generated
   */
  TactiqueType getTactique();

  /**
   * Sets the value of the '{@link xtext.towerDefense.Mobile#getTactique <em>Tactique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tactique</em>' attribute.
   * @see xtext.towerDefense.TactiqueType
   * @see #getTactique()
   * @generated
   */
  void setTactique(TactiqueType value);

} // Mobile
