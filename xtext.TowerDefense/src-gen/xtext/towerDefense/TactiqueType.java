/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tactique Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.towerDefense.TowerDefensePackage#getTactiqueType()
 * @model
 * @generated
 */
public enum TactiqueType implements Enumerator
{
  /**
   * The '<em><b>Proche</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCHE_VALUE
   * @generated
   * @ordered
   */
  PROCHE(0, "proche", "procheFirst"),

  /**
   * The '<em><b>Faible</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAIBLE_VALUE
   * @generated
   * @ordered
   */
  FAIBLE(1, "faible", "faibleFirst"),

  /**
   * The '<em><b>Fort</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FORT_VALUE
   * @generated
   * @ordered
   */
  FORT(2, "fort", "fortFirst");

  /**
   * The '<em><b>Proche</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Proche</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROCHE
   * @model name="proche" literal="procheFirst"
   * @generated
   * @ordered
   */
  public static final int PROCHE_VALUE = 0;

  /**
   * The '<em><b>Faible</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Faible</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FAIBLE
   * @model name="faible" literal="faibleFirst"
   * @generated
   * @ordered
   */
  public static final int FAIBLE_VALUE = 1;

  /**
   * The '<em><b>Fort</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fort</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FORT
   * @model name="fort" literal="fortFirst"
   * @generated
   * @ordered
   */
  public static final int FORT_VALUE = 2;

  /**
   * An array of all the '<em><b>Tactique Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TactiqueType[] VALUES_ARRAY =
    new TactiqueType[]
    {
      PROCHE,
      FAIBLE,
      FORT,
    };

  /**
   * A public read-only list of all the '<em><b>Tactique Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TactiqueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Tactique Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TactiqueType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TactiqueType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tactique Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TactiqueType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TactiqueType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tactique Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TactiqueType get(int value)
  {
    switch (value)
    {
      case PROCHE_VALUE: return PROCHE;
      case FAIBLE_VALUE: return FAIBLE;
      case FORT_VALUE: return FORT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TactiqueType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TactiqueType
