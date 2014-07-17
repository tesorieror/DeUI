/**
 */
package deui.impl;

import deui.DeuiPackage;
import deui.InteractionDependency;
import deui.InteractionObject;

import deuiCommon.impl.IdentifiedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deui.impl.InteractionDependencyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link deui.impl.InteractionDependencyImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionDependencyImpl extends IdentifiedElementImpl implements InteractionDependency {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected InteractionObject source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeuiPackage.Literals.INTERACTION_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionObject getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (InteractionObject)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeuiPackage.INTERACTION_DEPENDENCY__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionObject basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(InteractionObject newSource, NotificationChain msgs) {
		InteractionObject oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeuiPackage.INTERACTION_DEPENDENCY__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(InteractionObject newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON, InteractionObject.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON, InteractionObject.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeuiPackage.INTERACTION_DEPENDENCY__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionObject getTarget() {
		if (eContainerFeatureID() != DeuiPackage.INTERACTION_DEPENDENCY__TARGET) return null;
		return (InteractionObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InteractionObject newTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTarget, DeuiPackage.INTERACTION_DEPENDENCY__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(InteractionObject newTarget) {
		if (newTarget != eInternalContainer() || (eContainerFeatureID() != DeuiPackage.INTERACTION_DEPENDENCY__TARGET && newTarget != null)) {
			if (EcoreUtil.isAncestor(this, newTarget))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, DeuiPackage.INTERACTION_OBJECT__DEPENDENTS, InteractionObject.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeuiPackage.INTERACTION_DEPENDENCY__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeuiPackage.INTERACTION_DEPENDENCY__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON, InteractionObject.class, msgs);
				return basicSetSource((InteractionObject)otherEnd, msgs);
			case DeuiPackage.INTERACTION_DEPENDENCY__TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTarget((InteractionObject)otherEnd, msgs);
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
			case DeuiPackage.INTERACTION_DEPENDENCY__SOURCE:
				return basicSetSource(null, msgs);
			case DeuiPackage.INTERACTION_DEPENDENCY__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DeuiPackage.INTERACTION_DEPENDENCY__TARGET:
				return eInternalContainer().eInverseRemove(this, DeuiPackage.INTERACTION_OBJECT__DEPENDENTS, InteractionObject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeuiPackage.INTERACTION_DEPENDENCY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DeuiPackage.INTERACTION_DEPENDENCY__TARGET:
				return getTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeuiPackage.INTERACTION_DEPENDENCY__SOURCE:
				setSource((InteractionObject)newValue);
				return;
			case DeuiPackage.INTERACTION_DEPENDENCY__TARGET:
				setTarget((InteractionObject)newValue);
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
			case DeuiPackage.INTERACTION_DEPENDENCY__SOURCE:
				setSource((InteractionObject)null);
				return;
			case DeuiPackage.INTERACTION_DEPENDENCY__TARGET:
				setTarget((InteractionObject)null);
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
			case DeuiPackage.INTERACTION_DEPENDENCY__SOURCE:
				return source != null;
			case DeuiPackage.INTERACTION_DEPENDENCY__TARGET:
				return getTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionDependencyImpl
