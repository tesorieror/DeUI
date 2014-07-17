/**
 */
package deui.tests;

import deui.DeuiFactory;
import deui.Hosting;

import deuiCommon.tests.IdentifiedElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hosting</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HostingTest extends IdentifiedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HostingTest.class);
	}

	/**
	 * Constructs a new Hosting test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hosting test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hosting getFixture() {
		return (Hosting)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeuiFactory.eINSTANCE.createHosting());
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

} //HostingTest
