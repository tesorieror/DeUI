/**
 */
package deui.util;

import deui.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see deui.DeuiPackage
 * @generated
 */
public class DeuiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeuiValidator INSTANCE = new DeuiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "deui";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeuiValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DeuiPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DeuiPackage.UI_SYSTEM:
				return validateUISystem((UISystem)value, diagnostics, context);
			case DeuiPackage.INTERACTION_OBJECT:
				return validateInteractionObject((InteractionObject)value, diagnostics, context);
			case DeuiPackage.PLATFORM:
				return validatePlatform((Platform)value, diagnostics, context);
			case DeuiPackage.HOSTING:
				return validateHosting((Hosting)value, diagnostics, context);
			case DeuiPackage.IMPLEMENTATION:
				return validateImplementation((Implementation)value, diagnostics, context);
			case DeuiPackage.INTERACTION_DEPENDENCY:
				return validateInteractionDependency((InteractionDependency)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUISystem(UISystem uiSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uiSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionObject(InteractionObject interactionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionObject_componentCannotBeInteractionSurface(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionObject_cycle(interactionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionObject_desconnectedInteractionObject(interactionObject, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the componentCannotBeInteractionSurface constraint of '<em>Interaction Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_OBJECT__COMPONENT_CANNOT_BE_INTERACTION_SURFACE__EEXPRESSION = "isComponent implies not isInteractionSurface";

	/**
	 * Validates the componentCannotBeInteractionSurface constraint of '<em>Interaction Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionObject_componentCannotBeInteractionSurface(InteractionObject interactionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeuiPackage.Literals.INTERACTION_OBJECT,
				 interactionObject,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "componentCannotBeInteractionSurface",
				 INTERACTION_OBJECT__COMPONENT_CANNOT_BE_INTERACTION_SURFACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the cycle constraint of '<em>Interaction Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_OBJECT__CYCLE__EEXPRESSION = "not self->closure(hostedBy.target)->includes(self)";

	/**
	 * Validates the cycle constraint of '<em>Interaction Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionObject_cycle(InteractionObject interactionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeuiPackage.Literals.INTERACTION_OBJECT,
				 interactionObject,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "cycle",
				 INTERACTION_OBJECT__CYCLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the desconnectedInteractionObject constraint of '<em>Interaction Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_OBJECT__DESCONNECTED_INTERACTION_OBJECT__EEXPRESSION = "not isInteractionSurface implies not hostedBy->isEmpty()";

	/**
	 * Validates the desconnectedInteractionObject constraint of '<em>Interaction Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionObject_desconnectedInteractionObject(InteractionObject interactionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeuiPackage.Literals.INTERACTION_OBJECT,
				 interactionObject,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "desconnectedInteractionObject",
				 INTERACTION_OBJECT__DESCONNECTED_INTERACTION_OBJECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatform(Platform platform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(platform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHosting(Hosting hosting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hosting, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hosting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hosting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hosting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hosting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hosting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hosting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hosting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hosting, diagnostics, context);
		if (result || diagnostics != null) result &= validateHosting_hostingTheSameInteractionObjectTwice(hosting, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hostingTheSameInteractionObjectTwice constraint of '<em>Hosting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HOSTING__HOSTING_THE_SAME_INTERACTION_OBJECT_TWICE__EEXPRESSION = "source.hostedBy->forAll(h : Hosting | h <> self implies h.target <> self.target)";

	/**
	 * Validates the hostingTheSameInteractionObjectTwice constraint of '<em>Hosting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHosting_hostingTheSameInteractionObjectTwice(Hosting hosting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeuiPackage.Literals.HOSTING,
				 hosting,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hostingTheSameInteractionObjectTwice",
				 HOSTING__HOSTING_THE_SAME_INTERACTION_OBJECT_TWICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementation(Implementation implementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(implementation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementation_ImplementationOnInteractionSurface(implementation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ImplementationOnInteractionSurface constraint of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IMPLEMENTATION__IMPLEMENTATION_ON_INTERACTION_SURFACE__EEXPRESSION = "target.isInteractionSurface";

	/**
	 * Validates the ImplementationOnInteractionSurface constraint of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementation_ImplementationOnInteractionSurface(Implementation implementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeuiPackage.Literals.IMPLEMENTATION,
				 implementation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ImplementationOnInteractionSurface",
				 IMPLEMENTATION__IMPLEMENTATION_ON_INTERACTION_SURFACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionDependency(InteractionDependency interactionDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionDependency_dependenciesOnInteractionSurfaces(interactionDependency, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the dependenciesOnInteractionSurfaces constraint of '<em>Interaction Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_DEPENDENCY__DEPENDENCIES_ON_INTERACTION_SURFACES__EEXPRESSION = "source.isInteractionSurface and target.isInteractionSurface";

	/**
	 * Validates the dependenciesOnInteractionSurfaces constraint of '<em>Interaction Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionDependency_dependenciesOnInteractionSurfaces(InteractionDependency interactionDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeuiPackage.Literals.INTERACTION_DEPENDENCY,
				 interactionDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "dependenciesOnInteractionSurfaces",
				 INTERACTION_DEPENDENCY__DEPENDENCIES_ON_INTERACTION_SURFACES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DeuiValidator
