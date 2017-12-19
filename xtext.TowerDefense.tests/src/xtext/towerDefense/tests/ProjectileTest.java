/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.tests;

import junit.textui.TestRunner;

import xtext.towerDefense.Projectile;
import xtext.towerDefense.TowerDefenseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Projectile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectileTest extends PartieElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectileTest.class);
	}

	/**
	 * Constructs a new Projectile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Projectile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Projectile getFixture() {
		return (Projectile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TowerDefenseFactory.eINSTANCE.createProjectile());
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

} //ProjectileTest
