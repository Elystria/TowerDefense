/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xtext.towerDefense.Carte;
import xtext.towerDefense.Case;
import xtext.towerDefense.Niveau;
import xtext.towerDefense.Partie;
import xtext.towerDefense.PartieElement;
import xtext.towerDefense.TowerDefensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.towerDefense.impl.PartieImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.PartieImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.PartieImpl#getCartes <em>Cartes</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.PartieImpl#getPartieElements <em>Partie Elements</em>}</li>
 *   <li>{@link xtext.towerDefense.impl.PartieImpl#getNiveaux <em>Niveaux</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartieImpl extends MinimalEObjectImpl.Container implements Partie
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
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
  protected EList<Case> cases;

  /**
	 * The cached value of the '{@link #getCartes() <em>Cartes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCartes()
	 * @generated
	 * @ordered
	 */
  protected EList<Carte> cartes;

  /**
	 * The cached value of the '{@link #getPartieElements() <em>Partie Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPartieElements()
	 * @generated
	 * @ordered
	 */
  protected EList<PartieElement> partieElements;

  /**
	 * The cached value of the '{@link #getNiveaux() <em>Niveaux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNiveaux()
	 * @generated
	 * @ordered
	 */
  protected EList<Niveau> niveaux;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PartieImpl()
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
		return TowerDefensePackage.Literals.PARTIE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TowerDefensePackage.PARTIE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Case> getCases()
  {
		if (cases == null) {
			cases = new EObjectContainmentEList<Case>(Case.class, this, TowerDefensePackage.PARTIE__CASES);
		}
		return cases;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Carte> getCartes()
  {
		if (cartes == null) {
			cartes = new EObjectContainmentEList<Carte>(Carte.class, this, TowerDefensePackage.PARTIE__CARTES);
		}
		return cartes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<PartieElement> getPartieElements()
  {
		if (partieElements == null) {
			partieElements = new EObjectContainmentEList<PartieElement>(PartieElement.class, this, TowerDefensePackage.PARTIE__PARTIE_ELEMENTS);
		}
		return partieElements;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Niveau> getNiveaux()
  {
		if (niveaux == null) {
			niveaux = new EObjectContainmentEList<Niveau>(Niveau.class, this, TowerDefensePackage.PARTIE__NIVEAUX);
		}
		return niveaux;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case TowerDefensePackage.PARTIE__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
			case TowerDefensePackage.PARTIE__CARTES:
				return ((InternalEList<?>)getCartes()).basicRemove(otherEnd, msgs);
			case TowerDefensePackage.PARTIE__PARTIE_ELEMENTS:
				return ((InternalEList<?>)getPartieElements()).basicRemove(otherEnd, msgs);
			case TowerDefensePackage.PARTIE__NIVEAUX:
				return ((InternalEList<?>)getNiveaux()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case TowerDefensePackage.PARTIE__NAME:
				return getName();
			case TowerDefensePackage.PARTIE__CASES:
				return getCases();
			case TowerDefensePackage.PARTIE__CARTES:
				return getCartes();
			case TowerDefensePackage.PARTIE__PARTIE_ELEMENTS:
				return getPartieElements();
			case TowerDefensePackage.PARTIE__NIVEAUX:
				return getNiveaux();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case TowerDefensePackage.PARTIE__NAME:
				setName((String)newValue);
				return;
			case TowerDefensePackage.PARTIE__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends Case>)newValue);
				return;
			case TowerDefensePackage.PARTIE__CARTES:
				getCartes().clear();
				getCartes().addAll((Collection<? extends Carte>)newValue);
				return;
			case TowerDefensePackage.PARTIE__PARTIE_ELEMENTS:
				getPartieElements().clear();
				getPartieElements().addAll((Collection<? extends PartieElement>)newValue);
				return;
			case TowerDefensePackage.PARTIE__NIVEAUX:
				getNiveaux().clear();
				getNiveaux().addAll((Collection<? extends Niveau>)newValue);
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
		switch (featureID) {
			case TowerDefensePackage.PARTIE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TowerDefensePackage.PARTIE__CASES:
				getCases().clear();
				return;
			case TowerDefensePackage.PARTIE__CARTES:
				getCartes().clear();
				return;
			case TowerDefensePackage.PARTIE__PARTIE_ELEMENTS:
				getPartieElements().clear();
				return;
			case TowerDefensePackage.PARTIE__NIVEAUX:
				getNiveaux().clear();
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
		switch (featureID) {
			case TowerDefensePackage.PARTIE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TowerDefensePackage.PARTIE__CASES:
				return cases != null && !cases.isEmpty();
			case TowerDefensePackage.PARTIE__CARTES:
				return cartes != null && !cartes.isEmpty();
			case TowerDefensePackage.PARTIE__PARTIE_ELEMENTS:
				return partieElements != null && !partieElements.isEmpty();
			case TowerDefensePackage.PARTIE__NIVEAUX:
				return niveaux != null && !niveaux.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PartieImpl
