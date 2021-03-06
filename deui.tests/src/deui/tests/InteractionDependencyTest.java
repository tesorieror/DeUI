/**
 */
package deui.tests;

import deui.DeuiFactory;
import deui.InteractionDependency;

import deuiCommon.tests.IdentifiedElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interaction Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionDependencyTest extends IdentifiedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InteractionDependencyTest.class);
	}

	/**
	 * Constructs a new Interaction Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionDependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interaction Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InteractionDependency getFixture() {
		return (InteractionDependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeuiFactory.eINSTANCE.createInteractionDependency());
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

} //InteractionDependencyTest
