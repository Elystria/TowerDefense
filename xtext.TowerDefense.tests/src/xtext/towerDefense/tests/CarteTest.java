/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xtext.towerDefense.Carte;
import xtext.towerDefense.TowerDefenseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Carte</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarteTest extends TestCase {

	/**
	 * The fixture for this Carte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Carte fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CarteTest.class);
	}

	/**
	 * Constructs a new Carte test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Carte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Carte fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Carte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Carte getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TowerDefenseFactory.eINSTANCE.createCarte());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CarteTest