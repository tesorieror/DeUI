/**
 */
package deui.impl;

import deui.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeuiFactoryImpl extends EFactoryImpl implements DeuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeuiFactory init() {
		try {
			DeuiFactory theDeuiFactory = (DeuiFactory)EPackage.Registry.INSTANCE.getEFactory(DeuiPackage.eNS_URI);
			if (theDeuiFactory != null) {
				return theDeuiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeuiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeuiPackage.UI_SYSTEM: return createUISystem();
			case DeuiPackage.INTERACTION_OBJECT: return createInteractionObject();
			case DeuiPackage.PLATFORM: return createPlatform();
			case DeuiPackage.HOSTING: return createHosting();
			case DeuiPackage.IMPLEMENTATION: return createImplementation();
			case DeuiPackage.INTERACTION_DEPENDENCY: return createInteractionDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISystem createUISystem() {
		UISystemImpl uiSystem = new UISystemImpl();
		return uiSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionObject createInteractionObject() {
		InteractionObjectImpl interactionObject = new InteractionObjectImpl();
		return interactionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hosting createHosting() {
		HostingImpl hosting = new HostingImpl();
		return hosting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionDependency createInteractionDependency() {
		InteractionDependencyImpl interactionDependency = new InteractionDependencyImpl();
		return interactionDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeuiPackage getDeuiPackage() {
		return (DeuiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeuiPackage getPackage() {
		return DeuiPackage.eINSTANCE;
	}

} //DeuiFactoryImpl
