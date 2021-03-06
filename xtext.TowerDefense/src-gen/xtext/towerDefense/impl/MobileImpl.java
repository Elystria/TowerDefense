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
import xtext.towerDefense.Mobile;
import xtext.towerDefense.TactiqueType;
import xtext.towerDefense.TowerDefensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.impl.MobileImpl#getForce <em>Force</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.MobileImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.MobileImpl#getNumVague <em>Num Vague</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.MobileImpl#getCaseEntree <em>Case Entree</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.MobileImpl#getCaseSortie <em>Case Sortie</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.MobileImpl#getQuantiteEnergieMax <em>Quantite Energie Max</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.MobileImpl#getTactique <em>Tactique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobileImpl extends PartieElementImpl implements Mobile
{
  /**
   * The default value of the '{@link #getForce() <em>Force</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForce()
   * @generated
   * @ordered
   */
  protected static final int FORCE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getForce() <em>Force</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForce()
   * @generated
   * @ordered
   */
  protected int force = FORCE_EDEFAULT;

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
   * The default value of the '{@link #getNumVague() <em>Num Vague</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumVague()
   * @generated
   * @ordered
   */
  protected static final int NUM_VAGUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumVague() <em>Num Vague</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumVague()
   * @generated
   * @ordered
   */
  protected int numVague = NUM_VAGUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCaseEntree() <em>Case Entree</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseEntree()
   * @generated
   * @ordered
   */
  protected Case caseEntree;

  /**
   * The cached value of the '{@link #getCaseSortie() <em>Case Sortie</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseSortie()
   * @generated
   * @ordered
   */
  protected Case caseSortie;

  /**
   * The cached value of the '{@link #getQuantiteEnergieMax() <em>Quantite Energie Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantiteEnergieMax()
   * @generated
   * @ordered
   */
  protected Energie quantiteEnergieMax;

  /**
   * The default value of the '{@link #getTactique() <em>Tactique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTactique()
   * @generated
   * @ordered
   */
  protected static final TactiqueType TACTIQUE_EDEFAULT = TactiqueType.PROCHE;

  /**
   * The cached value of the '{@link #getTactique() <em>Tactique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTactique()
   * @generated
   * @ordered
   */
  protected TactiqueType tactique = TACTIQUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MobileImpl()
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
    return TowerDefensePackage.Literals.MOBILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getForce()
  {
    return force;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForce(int newForce)
  {
    int oldForce = force;
    force = newForce;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.MOBILE__FORCE, oldForce, force));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.MOBILE__VOLUME, oldVolume, volume));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumVague()
  {
    return numVague;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumVague(int newNumVague)
  {
    int oldNumVague = numVague;
    numVague = newNumVague;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.MOBILE__NUM_VAGUE, oldNumVague, numVague));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case getCaseEntree()
  {
    if (caseEntree != null && caseEntree.eIsProxy())
    {
      InternalEObject oldCaseEntree = (InternalEObject)caseEntree;
      caseEntree = (Case)eResolveProxy(oldCaseEntree);
      if (caseEntree != oldCaseEntree)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TowerDefensePackage.MOBILE__CASE_ENTREE, oldCaseEntree, caseEntree));
      }
    }
    return caseEntree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case basicGetCaseEntree()
  {
    return caseEntree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseEntree(Case newCaseEntree)
  {
    Case oldCaseEntree = caseEntree;
    caseEntree = newCaseEntree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.MOBILE__CASE_ENTREE, oldCaseEntree, caseEntree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case getCaseSortie()
  {
    if (caseSortie != null && caseSortie.eIsProxy())
    {
      InternalEObject oldCaseSortie = (InternalEObject)caseSortie;
      caseSortie = (Case)eResolveProxy(oldCaseSortie);
      if (caseSortie != oldCaseSortie)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TowerDefensePackage.MOBILE__CASE_SORTIE, oldCaseSortie, caseSortie));
      }
    }
    return caseSortie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case basicGetCaseSortie()
  {
    return caseSortie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseSortie(Case newCaseSortie)
  {
    Case oldCaseSortie = caseSortie;
    caseSortie = newCaseSortie;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.MOBILE__CASE_SORTIE, oldCaseSortie, caseSortie));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Energie getQuantiteEnergieMax()
  {
    return quantiteEnergieMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantiteEnergieMax(Energie newQuantiteEnergieMax, NotificationChain msgs)
  {
    Energie oldQuantiteEnergieMax = quantiteEnergieMax;
    quantiteEnergieMax = newQuantiteEnergieMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX, oldQuantiteEnergieMax, newQuantiteEnergieMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantiteEnergieMax(Energie newQuantiteEnergieMax)
  {
    if (newQuantiteEnergieMax != quantiteEnergieMax)
    {
      NotificationChain msgs = null;
      if (quantiteEnergieMax != null)
        msgs = ((InternalEObject)quantiteEnergieMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX, null, msgs);
      if (newQuantiteEnergieMax != null)
        msgs = ((InternalEObject)newQuantiteEnergieMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX, null, msgs);
      msgs = basicSetQuantiteEnergieMax(newQuantiteEnergieMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX, newQuantiteEnergieMax, newQuantiteEnergieMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TactiqueType getTactique()
  {
    return tactique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTactique(TactiqueType newTactique)
  {
    TactiqueType oldTactique = tactique;
    tactique = newTactique == null ? TACTIQUE_EDEFAULT : newTactique;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.MOBILE__TACTIQUE, oldTactique, tactique));
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
      case TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX:
        return basicSetQuantiteEnergieMax(null, msgs);
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
      case TowerDefensePackage.MOBILE__FORCE:
        return getForce();
      case TowerDefensePackage.MOBILE__VOLUME:
        return getVolume();
      case TowerDefensePackage.MOBILE__NUM_VAGUE:
        return getNumVague();
      case TowerDefensePackage.MOBILE__CASE_ENTREE:
        if (resolve) return getCaseEntree();
        return basicGetCaseEntree();
      case TowerDefensePackage.MOBILE__CASE_SORTIE:
        if (resolve) return getCaseSortie();
        return basicGetCaseSortie();
      case TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX:
        return getQuantiteEnergieMax();
      case TowerDefensePackage.MOBILE__TACTIQUE:
        return getTactique();
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
      case TowerDefensePackage.MOBILE__FORCE:
        setForce((Integer)newValue);
        return;
      case TowerDefensePackage.MOBILE__VOLUME:
        setVolume((Integer)newValue);
        return;
      case TowerDefensePackage.MOBILE__NUM_VAGUE:
        setNumVague((Integer)newValue);
        return;
      case TowerDefensePackage.MOBILE__CASE_ENTREE:
        setCaseEntree((Case)newValue);
        return;
      case TowerDefensePackage.MOBILE__CASE_SORTIE:
        setCaseSortie((Case)newValue);
        return;
      case TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX:
        setQuantiteEnergieMax((Energie)newValue);
        return;
      case TowerDefensePackage.MOBILE__TACTIQUE:
        setTactique((TactiqueType)newValue);
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
      case TowerDefensePackage.MOBILE__FORCE:
        setForce(FORCE_EDEFAULT);
        return;
      case TowerDefensePackage.MOBILE__VOLUME:
        setVolume(VOLUME_EDEFAULT);
        return;
      case TowerDefensePackage.MOBILE__NUM_VAGUE:
        setNumVague(NUM_VAGUE_EDEFAULT);
        return;
      case TowerDefensePackage.MOBILE__CASE_ENTREE:
        setCaseEntree((Case)null);
        return;
      case TowerDefensePackage.MOBILE__CASE_SORTIE:
        setCaseSortie((Case)null);
        return;
      case TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX:
        setQuantiteEnergieMax((Energie)null);
        return;
      case TowerDefensePackage.MOBILE__TACTIQUE:
        setTactique(TACTIQUE_EDEFAULT);
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
      case TowerDefensePackage.MOBILE__FORCE:
        return force != FORCE_EDEFAULT;
      case TowerDefensePackage.MOBILE__VOLUME:
        return volume != VOLUME_EDEFAULT;
      case TowerDefensePackage.MOBILE__NUM_VAGUE:
        return numVague != NUM_VAGUE_EDEFAULT;
      case TowerDefensePackage.MOBILE__CASE_ENTREE:
        return caseEntree != null;
      case TowerDefensePackage.MOBILE__CASE_SORTIE:
        return caseSortie != null;
      case TowerDefensePackage.MOBILE__QUANTITE_ENERGIE_MAX:
        return quantiteEnergieMax != null;
      case TowerDefensePackage.MOBILE__TACTIQUE:
        return tactique != TACTIQUE_EDEFAULT;
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
    result.append(" (force: ");
    result.append(force);
    result.append(", volume: ");
    result.append(volume);
    result.append(", numVague: ");
    result.append(numVague);
    result.append(", tactique: ");
    result.append(tactique);
    result.append(')');
    return result.toString();
  }

} //MobileImpl
