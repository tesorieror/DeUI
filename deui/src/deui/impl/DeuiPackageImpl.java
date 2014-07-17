/**
 */
package deui.impl;

import deui.DeuiFactory;
import deui.DeuiPackage;
import deui.Hosting;
import deui.Implementation;
import deui.InteractionDependency;
import deui.InteractionObject;
import deui.Platform;
import deui.UISystem;

import deui.util.DeuiValidator;

import deuiCommon.DeuiCommonPackage;

import deuiCommon.impl.DeuiCommonPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeuiPackageImpl extends EPackageImpl implements DeuiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionDependencyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see deui.DeuiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeuiPackageImpl() {
		super(eNS_URI, DeuiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DeuiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeuiPackage init() {
		if (isInited) return (DeuiPackage)EPackage.Registry.INSTANCE.getEPackage(DeuiPackage.eNS_URI);

		// Obtain or create and register package
		DeuiPackageImpl theDeuiPackage = (DeuiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeuiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeuiPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DeuiCommonPackageImpl theDeuiCommonPackage = (DeuiCommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeuiCommonPackage.eNS_URI) instanceof DeuiCommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeuiCommonPackage.eNS_URI) : DeuiCommonPackage.eINSTANCE);

		// Create package meta-data objects
		theDeuiPackage.createPackageContents();
		theDeuiCommonPackage.createPackageContents();

		// Initialize created meta-data
		theDeuiPackage.initializePackageContents();
		theDeuiCommonPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDeuiPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DeuiValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDeuiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeuiPackage.eNS_URI, theDeuiPackage);
		return theDeuiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUISystem() {
		return uiSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUISystem_InteractionObjects() {
		return (EReference)uiSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUISystem_Platforms() {
		return (EReference)uiSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUISystem__IsDivisible() {
		return uiSystemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUISystem__HasDividedState() {
		return uiSystemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUISystem__HasUnifiedState() {
		return uiSystemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUISystem__IsDistributable() {
		return uiSystemEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUISystem__HasDistributedState() {
		return uiSystemEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUISystem__HasSinglePlatformState() {
		return uiSystemEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUISystem__DistributionReport() {
		return uiSystemEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionObject() {
		return interactionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionObject_HostedBy() {
		return (EReference)interactionObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionObject_Hosts() {
		return (EReference)interactionObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionObject_Uisystem() {
		return (EReference)interactionObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionObject_ImplementedBy() {
		return (EReference)interactionObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionObject_IsContainer() {
		return (EAttribute)interactionObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionObject_IsComponent() {
		return (EAttribute)interactionObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionObject_IsInteractionSurface() {
		return (EAttribute)interactionObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionObject_Dependents() {
		return (EReference)interactionObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionObject_DependsOn() {
		return (EReference)interactionObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionObject_InteractionSurfaces() {
		return (EReference)interactionObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionObject_Platforms() {
		return (EReference)interactionObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_UiSystem() {
		return (EReference)platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_Implements() {
		return (EReference)platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHosting() {
		return hostingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHosting_Target() {
		return (EReference)hostingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHosting_Source() {
		return (EReference)hostingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHosting_Optional() {
		return (EAttribute)hostingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Source() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Target() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionDependency() {
		return interactionDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionDependency_Source() {
		return (EReference)interactionDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionDependency_Target() {
		return (EReference)interactionDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeuiFactory getDeuiFactory() {
		return (DeuiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uiSystemEClass = createEClass(UI_SYSTEM);
		createEReference(uiSystemEClass, UI_SYSTEM__INTERACTION_OBJECTS);
		createEReference(uiSystemEClass, UI_SYSTEM__PLATFORMS);
		createEOperation(uiSystemEClass, UI_SYSTEM___IS_DIVISIBLE);
		createEOperation(uiSystemEClass, UI_SYSTEM___HAS_DIVIDED_STATE);
		createEOperation(uiSystemEClass, UI_SYSTEM___HAS_UNIFIED_STATE);
		createEOperation(uiSystemEClass, UI_SYSTEM___IS_DISTRIBUTABLE);
		createEOperation(uiSystemEClass, UI_SYSTEM___HAS_DISTRIBUTED_STATE);
		createEOperation(uiSystemEClass, UI_SYSTEM___HAS_SINGLE_PLATFORM_STATE);
		createEOperation(uiSystemEClass, UI_SYSTEM___DISTRIBUTION_REPORT);

		interactionObjectEClass = createEClass(INTERACTION_OBJECT);
		createEReference(interactionObjectEClass, INTERACTION_OBJECT__HOSTED_BY);
		createEReference(interactionObjectEClass, INTERACTION_OBJECT__HOSTS);
		createEReference(interactionObjectEClass, INTERACTION_OBJECT__UISYSTEM);
		createEReference(interactionObjectEClass, INTERACTION_OBJECT__IMPLEMENTED_BY);
		createEAttribute(interactionObjectEClass, INTERACTION_OBJECT__IS_CONTAINER);
		createEAttribute(interactionObjectEClass, INTERACTION_OBJECT__IS_COMPONENT);
		createEAttribute(interactionObjectEClass, INTERACTION_OBJECT__IS_INTERACTION_SURFACE);
		createEReference(interactionObjectEClass, INTERACTION_OBJECT__DEPENDENTS);
		createEReference(interactionObjectEClass, INTERACTION_OBJECT__DEPENDS_ON);
		createEReference(interactionObjectEClass, INTERACTION_OBJECT__INTERACTION_SURFACES);
		createEReference(interactionObjectEClass, INTERACTION_OBJECT__PLATFORMS);

		platformEClass = createEClass(PLATFORM);
		createEReference(platformEClass, PLATFORM__UI_SYSTEM);
		createEReference(platformEClass, PLATFORM__IMPLEMENTS);

		hostingEClass = createEClass(HOSTING);
		createEReference(hostingEClass, HOSTING__TARGET);
		createEReference(hostingEClass, HOSTING__SOURCE);
		createEAttribute(hostingEClass, HOSTING__OPTIONAL);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEReference(implementationEClass, IMPLEMENTATION__SOURCE);
		createEReference(implementationEClass, IMPLEMENTATION__TARGET);

		interactionDependencyEClass = createEClass(INTERACTION_DEPENDENCY);
		createEReference(interactionDependencyEClass, INTERACTION_DEPENDENCY__SOURCE);
		createEReference(interactionDependencyEClass, INTERACTION_DEPENDENCY__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DeuiCommonPackage theDeuiCommonPackage = (DeuiCommonPackage)EPackage.Registry.INSTANCE.getEPackage(DeuiCommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiSystemEClass.getESuperTypes().add(theDeuiCommonPackage.getNamedElement());
		interactionObjectEClass.getESuperTypes().add(theDeuiCommonPackage.getNamedElement());
		interactionObjectEClass.getESuperTypes().add(theDeuiCommonPackage.getIdentifiedElement());
		platformEClass.getESuperTypes().add(theDeuiCommonPackage.getNamedElement());
		platformEClass.getESuperTypes().add(theDeuiCommonPackage.getIdentifiedElement());
		hostingEClass.getESuperTypes().add(theDeuiCommonPackage.getIdentifiedElement());
		implementationEClass.getESuperTypes().add(theDeuiCommonPackage.getIdentifiedElement());
		interactionDependencyEClass.getESuperTypes().add(theDeuiCommonPackage.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(uiSystemEClass, UISystem.class, "UISystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUISystem_InteractionObjects(), this.getInteractionObject(), this.getInteractionObject_Uisystem(), "interactionObjects", null, 1, -1, UISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUISystem_Platforms(), this.getPlatform(), this.getPlatform_UiSystem(), "platforms", null, 1, -1, UISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUISystem__IsDivisible(), ecorePackage.getEBoolean(), "isDivisible", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUISystem__HasDividedState(), ecorePackage.getEBoolean(), "hasDividedState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUISystem__HasUnifiedState(), ecorePackage.getEBoolean(), "hasUnifiedState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUISystem__IsDistributable(), ecorePackage.getEBoolean(), "isDistributable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUISystem__HasDistributedState(), ecorePackage.getEBoolean(), "hasDistributedState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUISystem__HasSinglePlatformState(), ecorePackage.getEBoolean(), "hasSinglePlatformState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUISystem__DistributionReport(), ecorePackage.getEString(), "distributionReport", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interactionObjectEClass, InteractionObject.class, "InteractionObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionObject_HostedBy(), this.getHosting(), this.getHosting_Source(), "hostedBy", null, 0, -1, InteractionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionObject_Hosts(), this.getHosting(), this.getHosting_Target(), "hosts", null, 0, -1, InteractionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionObject_Uisystem(), this.getUISystem(), this.getUISystem_InteractionObjects(), "uisystem", null, 1, 1, InteractionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionObject_ImplementedBy(), this.getImplementation(), this.getImplementation_Target(), "implementedBy", null, 0, 1, InteractionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionObject_IsContainer(), ecorePackage.getEBoolean(), "isContainer", null, 1, 1, InteractionObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionObject_IsComponent(), ecorePackage.getEBoolean(), "isComponent", null, 1, 1, InteractionObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionObject_IsInteractionSurface(), ecorePackage.getEBoolean(), "isInteractionSurface", null, 1, 1, InteractionObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionObject_Dependents(), this.getInteractionDependency(), this.getInteractionDependency_Target(), "dependents", null, 0, -1, InteractionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionObject_DependsOn(), this.getInteractionDependency(), this.getInteractionDependency_Source(), "dependsOn", null, 0, -1, InteractionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionObject_InteractionSurfaces(), this.getInteractionObject(), null, "interactionSurfaces", null, 0, -1, InteractionObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionObject_Platforms(), this.getPlatform(), null, "platforms", null, 0, -1, InteractionObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatform_UiSystem(), this.getUISystem(), this.getUISystem_Platforms(), "uiSystem", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Implements(), this.getImplementation(), this.getImplementation_Source(), "implements", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostingEClass, Hosting.class, "Hosting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHosting_Target(), this.getInteractionObject(), this.getInteractionObject_Hosts(), "target", null, 1, 1, Hosting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHosting_Source(), this.getInteractionObject(), this.getInteractionObject_HostedBy(), "source", null, 1, 1, Hosting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHosting_Optional(), ecorePackage.getEBoolean(), "optional", null, 1, 1, Hosting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementation_Source(), this.getPlatform(), this.getPlatform_Implements(), "source", null, 1, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Target(), this.getInteractionObject(), this.getInteractionObject_ImplementedBy(), "target", null, 1, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionDependencyEClass, InteractionDependency.class, "InteractionDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionDependency_Source(), this.getInteractionObject(), this.getInteractionObject_DependsOn(), "source", null, 1, 1, InteractionDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionDependency_Target(), this.getInteractionObject(), this.getInteractionObject_Dependents(), "target", null, 1, 1, InteractionDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "deuiCommon", "deui-common.ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (interactionObjectEClass, 
		   source, 
		   new String[] {
			 "constraints", "componentCannotBeInteractionSurface cycle desconnectedInteractionObject"
		   });	
		addAnnotation
		  (hostingEClass, 
		   source, 
		   new String[] {
			 "constraints", "hostingTheSameInteractionObjectTwice"
		   });	
		addAnnotation
		  (implementationEClass, 
		   source, 
		   new String[] {
			 "constraints", "ImplementationOnInteractionSurface"
		   });	
		addAnnotation
		  (interactionDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "dependenciesOnInteractionSurfaces"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (getUISystem__IsDivisible(), 
		   source, 
		   new String[] {
			 "body", "self.interactionObjects->exists(io : InteractionObject | io.interactionSurfaces->size() > 1)"
		   });	
		addAnnotation
		  (getUISystem__HasDividedState(), 
		   source, 
		   new String[] {
			 "body", "self.interactionObjects->select(isInteractionSurface)->size() > 1"
		   });	
		addAnnotation
		  (getUISystem__HasUnifiedState(), 
		   source, 
		   new String[] {
			 "body", "not self.interactionObjects->select((isInteractionSurface and dependsOn->isEmpty()))->isEmpty()"
		   });	
		addAnnotation
		  (getUISystem__IsDistributable(), 
		   source, 
		   new String[] {
			 "body", "self.interactionObjects->exists(io : InteractionObject | io.platforms->size() > 1)"
		   });	
		addAnnotation
		  (getUISystem__HasDistributedState(), 
		   source, 
		   new String[] {
			 "body", "self.interactionObjects->exists(io1 : InteractionObject, io2 : InteractionObject | io1 <> io2 and not io1.platforms->symmetricDifference(io2.platforms)->isEmpty())"
		   });	
		addAnnotation
		  (getUISystem__HasSinglePlatformState(), 
		   source, 
		   new String[] {
			 "body", "not self.interactionObjects->iterate(io : InteractionObject; res : Set(Platform) = self.platforms | res->intersection(io.platforms))->isEmpty()"
		   });	
		addAnnotation
		  (getUISystem__DistributionReport(), 
		   source, 
		   new String[] {
			 "body", "\'Is Divisible: \' + self.isDivisible().toString() + \'\\n\' + \'Is Distributable: \' + self.isDistributable().toString() + \'\\n\' + \'Has Unified State: \' + self.hasUnifiedState().toString() + \'\\n\' + \'Has Divided State: \' + self.hasDividedState().toString() + \'\\n\' + \'Has Single Platform State: \' + self.hasSinglePlatformState().toString() + \'\\n\' + \'Has Distributed State: \' + self.hasDistributedState().toString() + \'\\n\'"
		   });	
		addAnnotation
		  (interactionObjectEClass, 
		   source, 
		   new String[] {
			 "componentCannotBeInteractionSurface", "isComponent implies not isInteractionSurface",
			 "cycle", "not self->closure(hostedBy.target)->includes(self)",
			 "desconnectedInteractionObject", "not isInteractionSurface implies not hostedBy->isEmpty()"
		   });	
		addAnnotation
		  (getInteractionObject_IsContainer(), 
		   source, 
		   new String[] {
			 "derivation", "not hosts->isEmpty()"
		   });	
		addAnnotation
		  (getInteractionObject_IsComponent(), 
		   source, 
		   new String[] {
			 "derivation", "hosts->isEmpty()"
		   });	
		addAnnotation
		  (getInteractionObject_IsInteractionSurface(), 
		   source, 
		   new String[] {
			 "derivation", "not hosts->isEmpty() and not implementedBy->isEmpty()"
		   });	
		addAnnotation
		  (getInteractionObject_InteractionSurfaces(), 
		   source, 
		   new String[] {
			 "derivation", "self->closure(hostedBy.target)->select(isInteractionSurface)"
		   });	
		addAnnotation
		  (getInteractionObject_Platforms(), 
		   source, 
		   new String[] {
			 "derivation", "self.interactionSurfaces.implementedBy->flatten().oclAsType(Implementation).source->asSet()->union(self.implementedBy->collect(source)->asSet())->asOrderedSet()"
		   });	
		addAnnotation
		  (hostingEClass, 
		   source, 
		   new String[] {
			 "hostingTheSameInteractionObjectTwice", "source.hostedBy->forAll(h : Hosting | h <> self implies h.target <> self.target)"
		   });	
		addAnnotation
		  (implementationEClass, 
		   source, 
		   new String[] {
			 "ImplementationOnInteractionSurface", "target.isInteractionSurface"
		   });	
		addAnnotation
		  (interactionDependencyEClass, 
		   source, 
		   new String[] {
			 "dependenciesOnInteractionSurfaces", "source.isInteractionSurface and target.isInteractionSurface"
		   });
	}

} //DeuiPackageImpl
