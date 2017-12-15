/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtext.towerDefense.Damier;
import xtext.towerDefense.TerrainDeJeu;
import xtext.towerDefense.TowerDefensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terrain De Jeu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.impl.TerrainDeJeuImpl#getDamier <em>Damier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerrainDeJeuImpl extends MinimalEObjectImpl.Container implements TerrainDeJeu
{
  /**
   * The cached value of the '{@link #getDamier() <em>Damier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDamier()
   * @generated
   * @ordered
   */
  protected Damier damier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerrainDeJeuImpl()
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
    return TowerDefensePackage.Literals.TERRAIN_DE_JEU;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Damier getDamier()
  {
    if (damier != null && damier.eIsProxy())
    {
      InternalEObject oldDamier = (InternalEObject)damier;
      damier = (Damier)eResolveProxy(oldDamier);
      if (damier != oldDamier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TowerDefensePackage.TERRAIN_DE_JEU__DAMIER, oldDamier, damier));
      }
    }
    return damier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Damier basicGetDamier()
  {
    return damier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDamier(Damier newDamier)
  {
    Damier oldDamier = damier;
    damier = newDamier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.TERRAIN_DE_JEU__DAMIER, oldDamier, damier));
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
      case TowerDefensePackage.TERRAIN_DE_JEU__DAMIER:
        if (resolve) return getDamier();
        return basicGetDamier();
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
      case TowerDefensePackage.TERRAIN_DE_JEU__DAMIER:
        setDamier((Damier)newValue);
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
      case TowerDefensePackage.TERRAIN_DE_JEU__DAMIER:
        setDamier((Damier)null);
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
      case TowerDefensePackage.TERRAIN_DE_JEU__DAMIER:
        return damier != null;
    }
    return super.eIsSet(featureID);
  }

} //TerrainDeJeuImpl
