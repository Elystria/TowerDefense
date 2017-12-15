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
 * A representation of the literals of the enumeration '<em><b>Difficulte</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.towerDefense.TowerDefensePackage#getDifficulte()
 * @model
 * @generated
 */
public enum Difficulte implements Enumerator
{
  /**
   * The '<em><b>Facile</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FACILE_VALUE
   * @generated
   * @ordered
   */
  FACILE(0, "facile", "facile"),

  /**
   * The '<em><b>Moyen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOYEN_VALUE
   * @generated
   * @ordered
   */
  MOYEN(1, "moyen", "moyen"),

  /**
   * The '<em><b>Difficile</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIFFICILE_VALUE
   * @generated
   * @ordered
   */
  DIFFICILE(2, "difficile", "difficile");

  /**
   * The '<em><b>Facile</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Facile</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FACILE
   * @model name="facile"
   * @generated
   * @ordered
   */
  public static final int FACILE_VALUE = 0;

  /**
   * The '<em><b>Moyen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Moyen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOYEN
   * @model name="moyen"
   * @generated
   * @ordered
   */
  public static final int MOYEN_VALUE = 1;

  /**
   * The '<em><b>Difficile</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Difficile</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIFFICILE
   * @model name="difficile"
   * @generated
   * @ordered
   */
  public static final int DIFFICILE_VALUE = 2;

  /**
   * An array of all the '<em><b>Difficulte</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Difficulte[] VALUES_ARRAY =
    new Difficulte[]
    {
      FACILE,
      MOYEN,
      DIFFICILE,
    };

  /**
   * A public read-only list of all the '<em><b>Difficulte</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Difficulte> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Difficulte</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Difficulte get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Difficulte result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Difficulte</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Difficulte getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Difficulte result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Difficulte</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Difficulte get(int value)
  {
    switch (value)
    {
      case FACILE_VALUE: return FACILE;
      case MOYEN_VALUE: return MOYEN;
      case DIFFICILE_VALUE: return DIFFICILE;
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
  private Difficulte(int value, String name, String literal)
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
  
} //Difficulte
