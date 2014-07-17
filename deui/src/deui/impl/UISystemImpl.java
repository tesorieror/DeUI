/**
 */
package deui.impl;

import deui.DeuiPackage;
import deui.InteractionObject;
import deui.Platform;
import deui.UISystem;

import deuiCommon.impl.NamedElementImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deui.impl.UISystemImpl#getInteractionObjects <em>Interaction Objects</em>}</li>
 *   <li>{@link deui.impl.UISystemImpl#getPlatforms <em>Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UISystemImpl extends NamedElementImpl implements UISystem {
	/**
	 * The cached value of the '{@link #getInteractionObjects() <em>Interaction Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionObject> interactionObjects;

	/**
	 * The cached value of the '{@link #getPlatforms() <em>Platforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Platform> platforms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeuiPackage.Literals.UI_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionObject> getInteractionObjects() {
		if (interactionObjects == null) {
			interactionObjects = new EObjectContainmentWithInverseEList<InteractionObject>(InteractionObject.class, this, DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS, DeuiPackage.INTERACTION_OBJECT__UISYSTEM);
		}
		return interactionObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Platform> getPlatforms() {
		if (platforms == null) {
			platforms = new EObjectContainmentWithInverseEList<Platform>(Platform.class, this, DeuiPackage.UI_SYSTEM__PLATFORMS, DeuiPackage.PLATFORM__UI_SYSTEM);
		}
		return platforms;
	}

	/**
	 * The cached invocation delegate for the '{@link #isDivisible() <em>Is Divisible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDivisible()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DIVISIBLE__EINVOCATION_DELEGATE = ((EOperation.Internal)DeuiPackage.Literals.UI_SYSTEM___IS_DIVISIBLE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDivisible() {
		try {
			return (Boolean)IS_DIVISIBLE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #hasDividedState() <em>Has Divided State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasDividedState()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_DIVIDED_STATE__EINVOCATION_DELEGATE = ((EOperation.Internal)DeuiPackage.Literals.UI_SYSTEM___HAS_DIVIDED_STATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasDividedState() {
		try {
			return (Boolean)HAS_DIVIDED_STATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #hasUnifiedState() <em>Has Unified State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasUnifiedState()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_UNIFIED_STATE__EINVOCATION_DELEGATE = ((EOperation.Internal)DeuiPackage.Literals.UI_SYSTEM___HAS_UNIFIED_STATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasUnifiedState() {
		try {
			return (Boolean)HAS_UNIFIED_STATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isDistributable() <em>Is Distributable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistributable()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DISTRIBUTABLE__EINVOCATION_DELEGATE = ((EOperation.Internal)DeuiPackage.Literals.UI_SYSTEM___IS_DISTRIBUTABLE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistributable() {
		try {
			return (Boolean)IS_DISTRIBUTABLE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #hasDistributedState() <em>Has Distributed State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasDistributedState()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_DISTRIBUTED_STATE__EINVOCATION_DELEGATE = ((EOperation.Internal)DeuiPackage.Literals.UI_SYSTEM___HAS_DISTRIBUTED_STATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasDistributedState() {
		try {
			return (Boolean)HAS_DISTRIBUTED_STATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #hasSinglePlatformState() <em>Has Single Platform State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSinglePlatformState()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_SINGLE_PLATFORM_STATE__EINVOCATION_DELEGATE = ((EOperation.Internal)DeuiPackage.Literals.UI_SYSTEM___HAS_SINGLE_PLATFORM_STATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSinglePlatformState() {
		try {
			return (Boolean)HAS_SINGLE_PLATFORM_STATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #distributionReport() <em>Distribution Report</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #distributionReport()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DISTRIBUTION_REPORT__EINVOCATION_DELEGATE = ((EOperation.Internal)DeuiPackage.Literals.UI_SYSTEM___DISTRIBUTION_REPORT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String distributionReport() {
		try {
			return (String)DISTRIBUTION_REPORT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionObjects()).basicAdd(otherEnd, msgs);
			case DeuiPackage.UI_SYSTEM__PLATFORMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlatforms()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS:
				return ((InternalEList<?>)getInteractionObjects()).basicRemove(otherEnd, msgs);
			case DeuiPackage.UI_SYSTEM__PLATFORMS:
				return ((InternalEList<?>)getPlatforms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS:
				return getInteractionObjects();
			case DeuiPackage.UI_SYSTEM__PLATFORMS:
				return getPlatforms();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS:
				getInteractionObjects().clear();
				getInteractionObjects().addAll((Collection<? extends InteractionObject>)newValue);
				return;
			case DeuiPackage.UI_SYSTEM__PLATFORMS:
				getPlatforms().clear();
				getPlatforms().addAll((Collection<? extends Platform>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS:
				getInteractionObjects().clear();
				return;
			case DeuiPackage.UI_SYSTEM__PLATFORMS:
				getPlatforms().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS:
				return interactionObjects != null && !interactionObjects.isEmpty();
			case DeuiPackage.UI_SYSTEM__PLATFORMS:
				return platforms != null && !platforms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DeuiPackage.UI_SYSTEM___IS_DIVISIBLE:
				return isDivisible();
			case DeuiPackage.UI_SYSTEM___HAS_DIVIDED_STATE:
				return hasDividedState();
			case DeuiPackage.UI_SYSTEM___HAS_UNIFIED_STATE:
				return hasUnifiedState();
			case DeuiPackage.UI_SYSTEM___IS_DISTRIBUTABLE:
				return isDistributable();
			case DeuiPackage.UI_SYSTEM___HAS_DISTRIBUTED_STATE:
				return hasDistributedState();
			case DeuiPackage.UI_SYSTEM___HAS_SINGLE_PLATFORM_STATE:
				return hasSinglePlatformState();
			case DeuiPackage.UI_SYSTEM___DISTRIBUTION_REPORT:
				return distributionReport();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UISystemImpl
