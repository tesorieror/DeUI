/**
 */
package deui.impl;

import deui.DeuiPackage;
import deui.Implementation;
import deui.Platform;
import deui.UISystem;

import deuiCommon.DeuiCommonPackage;
import deuiCommon.IdentifiedElement;

import deuiCommon.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deui.impl.PlatformImpl#getId <em>Id</em>}</li>
 *   <li>{@link deui.impl.PlatformImpl#getUiSystem <em>Ui System</em>}</li>
 *   <li>{@link deui.impl.PlatformImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformImpl extends NamedElementImpl implements Platform {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementation> implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeuiPackage.Literals.PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeuiPackage.PLATFORM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISystem getUiSystem() {
		if (eContainerFeatureID() != DeuiPackage.PLATFORM__UI_SYSTEM) return null;
		return (UISystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUiSystem(UISystem newUiSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUiSystem, DeuiPackage.PLATFORM__UI_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiSystem(UISystem newUiSystem) {
		if (newUiSystem != eInternalContainer() || (eContainerFeatureID() != DeuiPackage.PLATFORM__UI_SYSTEM && newUiSystem != null)) {
			if (EcoreUtil.isAncestor(this, newUiSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUiSystem != null)
				msgs = ((InternalEObject)newUiSystem).eInverseAdd(this, DeuiPackage.UI_SYSTEM__PLATFORMS, UISystem.class, msgs);
			msgs = basicSetUiSystem(newUiSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeuiPackage.PLATFORM__UI_SYSTEM, newUiSystem, newUiSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectContainmentWithInverseEList<Implementation>(Implementation.class, this, DeuiPackage.PLATFORM__IMPLEMENTS, DeuiPackage.IMPLEMENTATION__SOURCE);
		}
		return implements_;
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
			case DeuiPackage.PLATFORM__UI_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUiSystem((UISystem)otherEnd, msgs);
			case DeuiPackage.PLATFORM__IMPLEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplements()).basicAdd(otherEnd, msgs);
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
			case DeuiPackage.PLATFORM__UI_SYSTEM:
				return basicSetUiSystem(null, msgs);
			case DeuiPackage.PLATFORM__IMPLEMENTS:
				return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
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
			case DeuiPackage.PLATFORM__UI_SYSTEM:
				return eInternalContainer().eInverseRemove(this, DeuiPackage.UI_SYSTEM__PLATFORMS, UISystem.class, msgs);
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
			case DeuiPackage.PLATFORM__ID:
				return getId();
			case DeuiPackage.PLATFORM__UI_SYSTEM:
				return getUiSystem();
			case DeuiPackage.PLATFORM__IMPLEMENTS:
				return getImplements();
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
			case DeuiPackage.PLATFORM__ID:
				setId((Long)newValue);
				return;
			case DeuiPackage.PLATFORM__UI_SYSTEM:
				setUiSystem((UISystem)newValue);
				return;
			case DeuiPackage.PLATFORM__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends Implementation>)newValue);
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
			case DeuiPackage.PLATFORM__ID:
				setId(ID_EDEFAULT);
				return;
			case DeuiPackage.PLATFORM__UI_SYSTEM:
				setUiSystem((UISystem)null);
				return;
			case DeuiPackage.PLATFORM__IMPLEMENTS:
				getImplements().clear();
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
			case DeuiPackage.PLATFORM__ID:
				return id != ID_EDEFAULT;
			case DeuiPackage.PLATFORM__UI_SYSTEM:
				return getUiSystem() != null;
			case DeuiPackage.PLATFORM__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (derivedFeatureID) {
				case DeuiPackage.PLATFORM__ID: return DeuiCommonPackage.IDENTIFIED_ELEMENT__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (baseFeatureID) {
				case DeuiCommonPackage.IDENTIFIED_ELEMENT__ID: return DeuiPackage.PLATFORM__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PlatformImpl
