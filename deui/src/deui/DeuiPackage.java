/**
 */
package deui;

import deuiCommon.DeuiCommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see deui.DeuiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import deuiCommon='deui-common.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DeuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://deui/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeuiPackage eINSTANCE = deui.impl.DeuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link deui.impl.UISystemImpl <em>UI System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deui.impl.UISystemImpl
	 * @see deui.impl.DeuiPackageImpl#getUISystem()
	 * @generated
	 */
	int UI_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM__NAME = DeuiCommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Interaction Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM__INTERACTION_OBJECTS = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM__PLATFORMS = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_FEATURE_COUNT = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Divisible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM___IS_DIVISIBLE = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Divided State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM___HAS_DIVIDED_STATE = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Unified State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM___HAS_UNIFIED_STATE = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Distributable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM___IS_DISTRIBUTABLE = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Distributed State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM___HAS_DISTRIBUTED_STATE = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Has Single Platform State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM___HAS_SINGLE_PLATFORM_STATE = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Distribution Report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM___DISTRIBUTION_REPORT = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>UI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_OPERATION_COUNT = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link deui.impl.InteractionObjectImpl <em>Interaction Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deui.impl.InteractionObjectImpl
	 * @see deui.impl.DeuiPackageImpl#getInteractionObject()
	 * @generated
	 */
	int INTERACTION_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__NAME = DeuiCommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__ID = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hosted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__HOSTED_BY = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__HOSTS = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uisystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__UISYSTEM = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__IMPLEMENTED_BY = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__IS_CONTAINER = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__IS_COMPONENT = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Interaction Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__IS_INTERACTION_SURFACE = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__DEPENDENTS = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__DEPENDS_ON = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Interaction Surfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__INTERACTION_SURFACES = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT__PLATFORMS = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Interaction Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT_FEATURE_COUNT = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Interaction Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OBJECT_OPERATION_COUNT = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deui.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deui.impl.PlatformImpl
	 * @see deui.impl.DeuiPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = DeuiCommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__ID = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ui System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__UI_SYSTEM = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__IMPLEMENTS = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = DeuiCommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = DeuiCommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deui.impl.HostingImpl <em>Hosting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deui.impl.HostingImpl
	 * @see deui.impl.DeuiPackageImpl#getHosting()
	 * @generated
	 */
	int HOSTING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__ID = DeuiCommonPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__TARGET = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__SOURCE = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__OPTIONAL = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hosting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_FEATURE_COUNT = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hosting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_OPERATION_COUNT = DeuiCommonPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deui.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deui.impl.ImplementationImpl
	 * @see deui.impl.DeuiPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__ID = DeuiCommonPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__SOURCE = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__TARGET = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = DeuiCommonPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deui.impl.InteractionDependencyImpl <em>Interaction Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deui.impl.InteractionDependencyImpl
	 * @see deui.impl.DeuiPackageImpl#getInteractionDependency()
	 * @generated
	 */
	int INTERACTION_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_DEPENDENCY__ID = DeuiCommonPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_DEPENDENCY__SOURCE = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_DEPENDENCY__TARGET = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_DEPENDENCY_FEATURE_COUNT = DeuiCommonPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interaction Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_DEPENDENCY_OPERATION_COUNT = DeuiCommonPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link deui.UISystem <em>UI System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI System</em>'.
	 * @see deui.UISystem
	 * @generated
	 */
	EClass getUISystem();

	/**
	 * Returns the meta object for the containment reference list '{@link deui.UISystem#getInteractionObjects <em>Interaction Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Objects</em>'.
	 * @see deui.UISystem#getInteractionObjects()
	 * @see #getUISystem()
	 * @generated
	 */
	EReference getUISystem_InteractionObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link deui.UISystem#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platforms</em>'.
	 * @see deui.UISystem#getPlatforms()
	 * @see #getUISystem()
	 * @generated
	 */
	EReference getUISystem_Platforms();

	/**
	 * Returns the meta object for the '{@link deui.UISystem#isDivisible() <em>Is Divisible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Divisible</em>' operation.
	 * @see deui.UISystem#isDivisible()
	 * @generated
	 */
	EOperation getUISystem__IsDivisible();

	/**
	 * Returns the meta object for the '{@link deui.UISystem#hasDividedState() <em>Has Divided State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Divided State</em>' operation.
	 * @see deui.UISystem#hasDividedState()
	 * @generated
	 */
	EOperation getUISystem__HasDividedState();

	/**
	 * Returns the meta object for the '{@link deui.UISystem#hasUnifiedState() <em>Has Unified State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Unified State</em>' operation.
	 * @see deui.UISystem#hasUnifiedState()
	 * @generated
	 */
	EOperation getUISystem__HasUnifiedState();

	/**
	 * Returns the meta object for the '{@link deui.UISystem#isDistributable() <em>Is Distributable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Distributable</em>' operation.
	 * @see deui.UISystem#isDistributable()
	 * @generated
	 */
	EOperation getUISystem__IsDistributable();

	/**
	 * Returns the meta object for the '{@link deui.UISystem#hasDistributedState() <em>Has Distributed State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Distributed State</em>' operation.
	 * @see deui.UISystem#hasDistributedState()
	 * @generated
	 */
	EOperation getUISystem__HasDistributedState();

	/**
	 * Returns the meta object for the '{@link deui.UISystem#hasSinglePlatformState() <em>Has Single Platform State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Single Platform State</em>' operation.
	 * @see deui.UISystem#hasSinglePlatformState()
	 * @generated
	 */
	EOperation getUISystem__HasSinglePlatformState();

	/**
	 * Returns the meta object for the '{@link deui.UISystem#distributionReport() <em>Distribution Report</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Distribution Report</em>' operation.
	 * @see deui.UISystem#distributionReport()
	 * @generated
	 */
	EOperation getUISystem__DistributionReport();

	/**
	 * Returns the meta object for class '{@link deui.InteractionObject <em>Interaction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Object</em>'.
	 * @see deui.InteractionObject
	 * @generated
	 */
	EClass getInteractionObject();

	/**
	 * Returns the meta object for the reference list '{@link deui.InteractionObject#getHostedBy <em>Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hosted By</em>'.
	 * @see deui.InteractionObject#getHostedBy()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EReference getInteractionObject_HostedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link deui.InteractionObject#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see deui.InteractionObject#getHosts()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EReference getInteractionObject_Hosts();

	/**
	 * Returns the meta object for the container reference '{@link deui.InteractionObject#getUisystem <em>Uisystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Uisystem</em>'.
	 * @see deui.InteractionObject#getUisystem()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EReference getInteractionObject_Uisystem();

	/**
	 * Returns the meta object for the reference '{@link deui.InteractionObject#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implemented By</em>'.
	 * @see deui.InteractionObject#getImplementedBy()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EReference getInteractionObject_ImplementedBy();

	/**
	 * Returns the meta object for the attribute '{@link deui.InteractionObject#isIsContainer <em>Is Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Container</em>'.
	 * @see deui.InteractionObject#isIsContainer()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EAttribute getInteractionObject_IsContainer();

	/**
	 * Returns the meta object for the attribute '{@link deui.InteractionObject#isIsComponent <em>Is Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Component</em>'.
	 * @see deui.InteractionObject#isIsComponent()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EAttribute getInteractionObject_IsComponent();

	/**
	 * Returns the meta object for the attribute '{@link deui.InteractionObject#isIsInteractionSurface <em>Is Interaction Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interaction Surface</em>'.
	 * @see deui.InteractionObject#isIsInteractionSurface()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EAttribute getInteractionObject_IsInteractionSurface();

	/**
	 * Returns the meta object for the containment reference list '{@link deui.InteractionObject#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependents</em>'.
	 * @see deui.InteractionObject#getDependents()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EReference getInteractionObject_Dependents();

	/**
	 * Returns the meta object for the reference list '{@link deui.InteractionObject#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see deui.InteractionObject#getDependsOn()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EReference getInteractionObject_DependsOn();

	/**
	 * Returns the meta object for the reference list '{@link deui.InteractionObject#getInteractionSurfaces <em>Interaction Surfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Surfaces</em>'.
	 * @see deui.InteractionObject#getInteractionSurfaces()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EReference getInteractionObject_InteractionSurfaces();

	/**
	 * Returns the meta object for the reference list '{@link deui.InteractionObject#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Platforms</em>'.
	 * @see deui.InteractionObject#getPlatforms()
	 * @see #getInteractionObject()
	 * @generated
	 */
	EReference getInteractionObject_Platforms();

	/**
	 * Returns the meta object for class '{@link deui.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see deui.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the container reference '{@link deui.Platform#getUiSystem <em>Ui System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ui System</em>'.
	 * @see deui.Platform#getUiSystem()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_UiSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link deui.Platform#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements</em>'.
	 * @see deui.Platform#getImplements()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Implements();

	/**
	 * Returns the meta object for class '{@link deui.Hosting <em>Hosting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hosting</em>'.
	 * @see deui.Hosting
	 * @generated
	 */
	EClass getHosting();

	/**
	 * Returns the meta object for the container reference '{@link deui.Hosting#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see deui.Hosting#getTarget()
	 * @see #getHosting()
	 * @generated
	 */
	EReference getHosting_Target();

	/**
	 * Returns the meta object for the reference '{@link deui.Hosting#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see deui.Hosting#getSource()
	 * @see #getHosting()
	 * @generated
	 */
	EReference getHosting_Source();

	/**
	 * Returns the meta object for the attribute '{@link deui.Hosting#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see deui.Hosting#isOptional()
	 * @see #getHosting()
	 * @generated
	 */
	EAttribute getHosting_Optional();

	/**
	 * Returns the meta object for class '{@link deui.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see deui.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the container reference '{@link deui.Implementation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see deui.Implementation#getSource()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Source();

	/**
	 * Returns the meta object for the reference '{@link deui.Implementation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see deui.Implementation#getTarget()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Target();

	/**
	 * Returns the meta object for class '{@link deui.InteractionDependency <em>Interaction Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Dependency</em>'.
	 * @see deui.InteractionDependency
	 * @generated
	 */
	EClass getInteractionDependency();

	/**
	 * Returns the meta object for the reference '{@link deui.InteractionDependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see deui.InteractionDependency#getSource()
	 * @see #getInteractionDependency()
	 * @generated
	 */
	EReference getInteractionDependency_Source();

	/**
	 * Returns the meta object for the container reference '{@link deui.InteractionDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see deui.InteractionDependency#getTarget()
	 * @see #getInteractionDependency()
	 * @generated
	 */
	EReference getInteractionDependency_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeuiFactory getDeuiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link deui.impl.UISystemImpl <em>UI System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deui.impl.UISystemImpl
		 * @see deui.impl.DeuiPackageImpl#getUISystem()
		 * @generated
		 */
		EClass UI_SYSTEM = eINSTANCE.getUISystem();

		/**
		 * The meta object literal for the '<em><b>Interaction Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SYSTEM__INTERACTION_OBJECTS = eINSTANCE.getUISystem_InteractionObjects();

		/**
		 * The meta object literal for the '<em><b>Platforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SYSTEM__PLATFORMS = eINSTANCE.getUISystem_Platforms();

		/**
		 * The meta object literal for the '<em><b>Is Divisible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_SYSTEM___IS_DIVISIBLE = eINSTANCE.getUISystem__IsDivisible();

		/**
		 * The meta object literal for the '<em><b>Has Divided State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_SYSTEM___HAS_DIVIDED_STATE = eINSTANCE.getUISystem__HasDividedState();

		/**
		 * The meta object literal for the '<em><b>Has Unified State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_SYSTEM___HAS_UNIFIED_STATE = eINSTANCE.getUISystem__HasUnifiedState();

		/**
		 * The meta object literal for the '<em><b>Is Distributable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_SYSTEM___IS_DISTRIBUTABLE = eINSTANCE.getUISystem__IsDistributable();

		/**
		 * The meta object literal for the '<em><b>Has Distributed State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_SYSTEM___HAS_DISTRIBUTED_STATE = eINSTANCE.getUISystem__HasDistributedState();

		/**
		 * The meta object literal for the '<em><b>Has Single Platform State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_SYSTEM___HAS_SINGLE_PLATFORM_STATE = eINSTANCE.getUISystem__HasSinglePlatformState();

		/**
		 * The meta object literal for the '<em><b>Distribution Report</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_SYSTEM___DISTRIBUTION_REPORT = eINSTANCE.getUISystem__DistributionReport();

		/**
		 * The meta object literal for the '{@link deui.impl.InteractionObjectImpl <em>Interaction Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deui.impl.InteractionObjectImpl
		 * @see deui.impl.DeuiPackageImpl#getInteractionObject()
		 * @generated
		 */
		EClass INTERACTION_OBJECT = eINSTANCE.getInteractionObject();

		/**
		 * The meta object literal for the '<em><b>Hosted By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OBJECT__HOSTED_BY = eINSTANCE.getInteractionObject_HostedBy();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OBJECT__HOSTS = eINSTANCE.getInteractionObject_Hosts();

		/**
		 * The meta object literal for the '<em><b>Uisystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OBJECT__UISYSTEM = eINSTANCE.getInteractionObject_Uisystem();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OBJECT__IMPLEMENTED_BY = eINSTANCE.getInteractionObject_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Is Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_OBJECT__IS_CONTAINER = eINSTANCE.getInteractionObject_IsContainer();

		/**
		 * The meta object literal for the '<em><b>Is Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_OBJECT__IS_COMPONENT = eINSTANCE.getInteractionObject_IsComponent();

		/**
		 * The meta object literal for the '<em><b>Is Interaction Surface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_OBJECT__IS_INTERACTION_SURFACE = eINSTANCE.getInteractionObject_IsInteractionSurface();

		/**
		 * The meta object literal for the '<em><b>Dependents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OBJECT__DEPENDENTS = eINSTANCE.getInteractionObject_Dependents();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OBJECT__DEPENDS_ON = eINSTANCE.getInteractionObject_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Interaction Surfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OBJECT__INTERACTION_SURFACES = eINSTANCE.getInteractionObject_InteractionSurfaces();

		/**
		 * The meta object literal for the '<em><b>Platforms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OBJECT__PLATFORMS = eINSTANCE.getInteractionObject_Platforms();

		/**
		 * The meta object literal for the '{@link deui.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deui.impl.PlatformImpl
		 * @see deui.impl.DeuiPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Ui System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__UI_SYSTEM = eINSTANCE.getPlatform_UiSystem();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__IMPLEMENTS = eINSTANCE.getPlatform_Implements();

		/**
		 * The meta object literal for the '{@link deui.impl.HostingImpl <em>Hosting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deui.impl.HostingImpl
		 * @see deui.impl.DeuiPackageImpl#getHosting()
		 * @generated
		 */
		EClass HOSTING = eINSTANCE.getHosting();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING__TARGET = eINSTANCE.getHosting_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING__SOURCE = eINSTANCE.getHosting_Source();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTING__OPTIONAL = eINSTANCE.getHosting_Optional();

		/**
		 * The meta object literal for the '{@link deui.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deui.impl.ImplementationImpl
		 * @see deui.impl.DeuiPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__SOURCE = eINSTANCE.getImplementation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__TARGET = eINSTANCE.getImplementation_Target();

		/**
		 * The meta object literal for the '{@link deui.impl.InteractionDependencyImpl <em>Interaction Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deui.impl.InteractionDependencyImpl
		 * @see deui.impl.DeuiPackageImpl#getInteractionDependency()
		 * @generated
		 */
		EClass INTERACTION_DEPENDENCY = eINSTANCE.getInteractionDependency();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_DEPENDENCY__SOURCE = eINSTANCE.getInteractionDependency_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_DEPENDENCY__TARGET = eINSTANCE.getInteractionDependency_Target();

	}

} //DeuiPackage
