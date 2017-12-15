/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtext.towerDefense.Energie;
import xtext.towerDefense.NatureTerrain;
import xtext.towerDefense.TYPE_TERRAIN;
import xtext.towerDefense.TowerDefensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nature Terrain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.impl.NatureTerrainImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.NatureTerrainImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.NatureTerrainImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.NatureTerrainImpl#getFatigue <em>Fatigue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NatureTerrainImpl extends MinimalEObjectImpl.Container implements NatureTerrain
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolume()
   * @generated
   * @ordered
   */
  protected static final int VOLUME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolume()
   * @generated
   * @ordered
   */
  protected int volume = VOLUME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final TYPE_TERRAIN TYPE_EDEFAULT = TYPE_TERRAIN.ENTREE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TYPE_TERRAIN type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFatigue() <em>Fatigue</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFatigue()
   * @generated
   * @ordered
   */
  protected Energie fatigue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NatureTerrainImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TowerDefensePackage.Literals.NATURE_TERRAIN;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.NATURE_TERRAIN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVolume()
  {
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolume(int newVolume)
  {
    int oldVolume = volume;
    volume = newVolume;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.NATURE_TERRAIN__VOLUME, oldVolume, volume));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPE_TERRAIN getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TYPE_TERRAIN newType)
  {
    TYPE_TERRAIN oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.NATURE_TERRAIN__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Energie getFatigue()
  {
    if (fatigue != null && fatigue.eIsProxy())
    {
      InternalEObject oldFatigue = (InternalEObject)fatigue;
      fatigue = (Energie)eResolveProxy(oldFatigue);
      if (fatigue != oldFatigue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TowerDefensePackage.NATURE_TERRAIN__FATIGUE, oldFatigue, fatigue));
      }
    }
    return fatigue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Energie basicGetFatigue()
  {
    return fatigue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFatigue(Energie newFatigue)
  {
    Energie oldFatigue = fatigue;
    fatigue = newFatigue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.NATURE_TERRAIN__FATIGUE, oldFatigue, fatigue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TowerDefensePackage.NATURE_TERRAIN__NAME:
        return getName();
      case TowerDefensePackage.NATURE_TERRAIN__VOLUME:
        return getVolume();
      case TowerDefensePackage.NATURE_TERRAIN__TYPE:
        return getType();
      case TowerDefensePackage.NATURE_TERRAIN__FATIGUE:
        if (resolve) return getFatigue();
        return basicGetFatigue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TowerDefensePackage.NATURE_TERRAIN__NAME:
        setName((String)newValue);
        return;
      case TowerDefensePackage.NATURE_TERRAIN__VOLUME:
        setVolume((Integer)newValue);
        return;
      case TowerDefensePackage.NATURE_TERRAIN__TYPE:
        setType((TYPE_TERRAIN)newValue);
        return;
      case TowerDefensePackage.NATURE_TERRAIN__FATIGUE:
        setFatigue((Energie)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TowerDefensePackage.NATURE_TERRAIN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TowerDefensePackage.NATURE_TERRAIN__VOLUME:
        setVolume(VOLUME_EDEFAULT);
        return;
      case TowerDefensePackage.NATURE_TERRAIN__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case TowerDefensePackage.NATURE_TERRAIN__FATIGUE:
        setFatigue((Energie)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TowerDefensePackage.NATURE_TERRAIN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TowerDefensePackage.NATURE_TERRAIN__VOLUME:
        return volume != VOLUME_EDEFAULT;
      case TowerDefensePackage.NATURE_TERRAIN__TYPE:
        return type != TYPE_EDEFAULT;
      case TowerDefensePackage.NATURE_TERRAIN__FATIGUE:
        return fatigue != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", volume: ");
    result.append(volume);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //NatureTerrainImpl
