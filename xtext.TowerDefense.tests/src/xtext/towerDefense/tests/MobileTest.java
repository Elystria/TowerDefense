/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.tests;

import junit.textui.TestRunner;

import xtext.towerDefense.Mobile;
import xtext.towerDefense.TowerDefenseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mobile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobileTest extends PartieElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MobileTest.class);
	}

	/**
	 * Constructs a new Mobile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mobile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mobile getFixture() {
		return (Mobile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TowerDefenseFactory.eINSTANCE.createMobile());
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

} //MobileTest