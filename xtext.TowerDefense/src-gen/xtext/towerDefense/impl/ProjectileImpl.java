/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.towerDefense.Case;
import xtext.towerDefense.Energie;
import xtext.towerDefense.Projectile;
import xtext.towerDefense.TowerDefensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projectile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.impl.ProjectileImpl#getPortee <em>Portee</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.ProjectileImpl#getMasse <em>Masse</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.ProjectileImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.ProjectileImpl#getCase <em>Case</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.ProjectileImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.ProjectileImpl#getDegat <em>Degat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectileImpl extends PartieElementImpl implements Projectile
{
  /**
   * The default value of the '{@link #getPortee() <em>Portee</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortee()
   * @generated
   * @ordered
   */
  protected static final int PORTEE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPortee() <em>Portee</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortee()
   * @generated
   * @ordered
   */
  protected int portee = PORTEE_EDEFAULT;

  /**
   * The default value of the '{@link #getMasse() <em>Masse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasse()
   * @generated
   * @ordered
   */
  protected static final int MASSE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMasse() <em>Masse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasse()
   * @generated
   * @ordered
   */
  protected int masse = MASSE_EDEFAULT;

  /**
   * The default value of the '{@link #getVitesse() <em>Vitesse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse()
   * @generated
   * @ordered
   */
  protected static final int VITESSE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse()
   * @generated
   * @ordered
   */
  protected int vitesse = VITESSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCase() <em>Case</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected Case case_;

  /**
   * The cached value of the '{@link #getCible() <em>Cible</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCible()
   * @generated
   * @ordered
   */
  protected Case cible;

  /**
   * The cached value of the '{@link #getDegat() <em>Degat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegat()
   * @generated
   * @ordered
   */
  protected Energie degat;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectileImpl()
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
    return TowerDefensePackage.Literals.PROJECTILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPortee()
  {
    return portee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortee(int newPortee)
  {
    int oldPortee = portee;
    portee = newPortee;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.PROJECTILE__PORTEE, oldPortee, portee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMasse()
  {
    return masse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMasse(int newMasse)
  {
    int oldMasse = masse;
    masse = newMasse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.PROJECTILE__MASSE, oldMasse, masse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVitesse()
  {
    return vitesse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVitesse(int newVitesse)
  {
    int oldVitesse = vitesse;
    vitesse = newVitesse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.PROJECTILE__VITESSE, oldVitesse, vitesse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case getCase()
  {
    if (case_ != null && case_.eIsProxy())
    {
      InternalEObject oldCase = (InternalEObject)case_;
      case_ = (Case)eResolveProxy(oldCase);
      if (case_ != oldCase)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TowerDefensePackage.PROJECTILE__CASE, oldCase, case_));
      }
    }
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case basicGetCase()
  {
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCase(Case newCase)
  {
    Case oldCase = case_;
    case_ = newCase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.PROJECTILE__CASE, oldCase, case_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case getCible()
  {
    if (cible != null && cible.eIsProxy())
    {
      InternalEObject oldCible = (InternalEObject)cible;
      cible = (Case)eResolveProxy(oldCible);
      if (cible != oldCible)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TowerDefensePackage.PROJECTILE__CIBLE, oldCible, cible));
      }
    }
    return cible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case basicGetCible()
  {
    return cible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCible(Case newCible)
  {
    Case oldCible = cible;
    cible = newCible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.PROJECTILE__CIBLE, oldCible, cible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Energie getDegat()
  {
    return degat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDegat(Energie newDegat, NotificationChain msgs)
  {
    Energie oldDegat = degat;
    degat = newDegat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TowerDefensePackage.PROJECTILE__DEGAT, oldDegat, newDegat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDegat(Energie newDegat)
  {
    if (newDegat != degat)
    {
      NotificationChain msgs = null;
      if (degat != null)
        msgs = ((InternalEObject)degat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TowerDefensePackage.PROJECTILE__DEGAT, null, msgs);
      if (newDegat != null)
        msgs = ((InternalEObject)newDegat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TowerDefensePackage.PROJECTILE__DEGAT, null, msgs);
      msgs = basicSetDegat(newDegat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.PROJECTILE__DEGAT, newDegat, newDegat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TowerDefensePackage.PROJECTILE__DEGAT:
        return basicSetDegat(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TowerDefensePackage.PROJECTILE__PORTEE:
        return getPortee();
      case TowerDefensePackage.PROJECTILE__MASSE:
        return getMasse();
      case TowerDefensePackage.PROJECTILE__VITESSE:
        return getVitesse();
      case TowerDefensePackage.PROJECTILE__CASE:
        if (resolve) return getCase();
        return basicGetCase();
      case TowerDefensePackage.PROJECTILE__CIBLE:
        if (resolve) return getCible();
        return basicGetCible();
      case TowerDefensePackage.PROJECTILE__DEGAT:
        return getDegat();
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
      case TowerDefensePackage.PROJECTILE__PORTEE:
        setPortee((Integer)newValue);
        return;
      case TowerDefensePackage.PROJECTILE__MASSE:
        setMasse((Integer)newValue);
        return;
      case TowerDefensePackage.PROJECTILE__VITESSE:
        setVitesse((Integer)newValue);
        return;
      case TowerDefensePackage.PROJECTILE__CASE:
        setCase((Case)newValue);
        return;
      case TowerDefensePackage.PROJECTILE__CIBLE:
        setCible((Case)newValue);
        return;
      case TowerDefensePackage.PROJECTILE__DEGAT:
        setDegat((Energie)newValue);
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
      case TowerDefensePackage.PROJECTILE__PORTEE:
        setPortee(PORTEE_EDEFAULT);
        return;
      case TowerDefensePackage.PROJECTILE__MASSE:
        setMasse(MASSE_EDEFAULT);
        return;
      case TowerDefensePackage.PROJECTILE__VITESSE:
        setVitesse(VITESSE_EDEFAULT);
        return;
      case TowerDefensePackage.PROJECTILE__CASE:
        setCase((Case)null);
        return;
      case TowerDefensePackage.PROJECTILE__CIBLE:
        setCible((Case)null);
        return;
      case TowerDefensePackage.PROJECTILE__DEGAT:
        setDegat((Energie)null);
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
      case TowerDefensePackage.PROJECTILE__PORTEE:
        return portee != PORTEE_EDEFAULT;
      case TowerDefensePackage.PROJECTILE__MASSE:
        return masse != MASSE_EDEFAULT;
      case TowerDefensePackage.PROJECTILE__VITESSE:
        return vitesse != VITESSE_EDEFAULT;
      case TowerDefensePackage.PROJECTILE__CASE:
        return case_ != null;
      case TowerDefensePackage.PROJECTILE__CIBLE:
        return cible != null;
      case TowerDefensePackage.PROJECTILE__DEGAT:
        return degat != null;
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
    result.append(" (portee: ");
    result.append(portee);
    result.append(", masse: ");
    result.append(masse);
    result.append(", vitesse: ");
    result.append(vitesse);
    result.append(')');
    return result.toString();
  }

} //ProjectileImpl