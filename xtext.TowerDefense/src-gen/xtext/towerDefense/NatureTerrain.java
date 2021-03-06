/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nature Terrain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.NatureTerrain#getVolume <em>Volume</em>}</li>
 *   <li>{@link xtext.towerDefense.NatureTerrain#getType <em>Type</em>}</li>
 *   <li>{@link xtext.towerDefense.NatureTerrain#getFatigue <em>Fatigue</em>}</li>
 * </ul>
 *
 * @see xtext.towerDefense.TowerDefensePackage#getNatureTerrain()
 * @model
 * @generated
 */
public interface NatureTerrain extends PartieElement
{
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
   * @see xtext.towerDefense.TowerDefensePackage#getNatureTerrain_Volume()
   * @model
   * @generated
   */
  int getVolume();

  /**
   * Sets the value of the '{@link xtext.towerDefense.NatureTerrain#getVolume <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volume</em>' attribute.
   * @see #getVolume()
   * @generated
   */
  void setVolume(int value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.towerDefense.TYPE_TERRAIN}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see xtext.towerDefense.TYPE_TERRAIN
   * @see #setType(TYPE_TERRAIN)
   * @see xtext.towerDefense.TowerDefensePackage#getNatureTerrain_Type()
   * @model
   * @generated
   */
  TYPE_TERRAIN getType();

  /**
   * Sets the value of the '{@link xtext.towerDefense.NatureTerrain#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see xtext.towerDefense.TYPE_TERRAIN
   * @see #getType()
   * @generated
   */
  void setType(TYPE_TERRAIN value);

  /**
   * Returns the value of the '<em><b>Fatigue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fatigue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fatigue</em>' containment reference.
   * @see #setFatigue(Energie)
   * @see xtext.towerDefense.TowerDefensePackage#getNatureTerrain_Fatigue()
   * @model containment="true"
   * @generated
   */
  Energie getFatigue();

  /**
   * Sets the value of the '{@link xtext.towerDefense.NatureTerrain#getFatigue <em>Fatigue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fatigue</em>' containment reference.
   * @see #getFatigue()
   * @generated
   */
  void setFatigue(Energie value);

} // NatureTerrain
