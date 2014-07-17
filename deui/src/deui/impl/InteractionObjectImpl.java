/**
 */
package deui.impl;

import deui.DeuiPackage;
import deui.Hosting;
import deui.Implementation;
import deui.InteractionDependency;
import deui.InteractionObject;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deui.impl.InteractionObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#getHostedBy <em>Hosted By</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#getHosts <em>Hosts</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#getUisystem <em>Uisystem</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#isIsContainer <em>Is Container</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#isIsComponent <em>Is Component</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#isIsInteractionSurface <em>Is Interaction Surface</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#getDependents <em>Dependents</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#getInteractionSurfaces <em>Interaction Surfaces</em>}</li>
 *   <li>{@link deui.impl.InteractionObjectImpl#getPlatforms <em>Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionObjectImpl extends NamedElementImpl implements InteractionObject {
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
	 * The cached value of the '{@link #getHostedBy() <em>Hosted By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Hosting> hostedBy;

	/**
	 * The cached value of the '{@link #getHosts() <em>Hosts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Hosting> hosts;

	/**
	 * The cached value of the '{@link #getImplementedBy() <em>Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected Implementation implementedBy;

	/**
	 * The cached setting delegate for the '{@link #isIsContainer() <em>Is Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainer()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_CONTAINER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DeuiPackage.Literals.INTERACTION_OBJECT__IS_CONTAINER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsComponent() <em>Is Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComponent()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_COMPONENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DeuiPackage.Literals.INTERACTION_OBJECT__IS_COMPONENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsInteractionSurface() <em>Is Interaction Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInteractionSurface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_INTERACTION_SURFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DeuiPackage.Literals.INTERACTION_OBJECT__IS_INTERACTION_SURFACE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDependents() <em>Dependents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionDependency> dependents;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionDependency> dependsOn;

	/**
	 * The cached setting delegate for the '{@link #getInteractionSurfaces() <em>Interaction Surfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionSurfaces()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INTERACTION_SURFACES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DeuiPackage.Literals.INTERACTION_OBJECT__INTERACTION_SURFACES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPlatforms() <em>Platforms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PLATFORMS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DeuiPackage.Literals.INTERACTION_OBJECT__PLATFORMS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeuiPackage.Literals.INTERACTION_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeuiPackage.INTERACTION_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hosting> getHostedBy() {
		if (hostedBy == null) {
			hostedBy = new EObjectWithInverseResolvingEList<Hosting>(Hosting.class, this, DeuiPackage.INTERACTION_OBJECT__HOSTED_BY, DeuiPackage.HOSTING__SOURCE);
		}
		return hostedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hosting> getHosts() {
		if (hosts == null) {
			hosts = new EObjectContainmentWithInverseEList<Hosting>(Hosting.class, this, DeuiPackage.INTERACTION_OBJECT__HOSTS, DeuiPackage.HOSTING__TARGET);
		}
		return hosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISystem getUisystem() {
		if (eContainerFeatureID() != DeuiPackage.INTERACTION_OBJECT__UISYSTEM) return null;
		return (UISystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUisystem(UISystem newUisystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUisystem, DeuiPackage.INTERACTION_OBJECT__UISYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUisystem(UISystem newUisystem) {
		if (newUisystem != eInternalContainer() || (eContainerFeatureID() != DeuiPackage.INTERACTION_OBJECT__UISYSTEM && newUisystem != null)) {
			if (EcoreUtil.isAncestor(this, newUisystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUisystem != null)
				msgs = ((InternalEObject)newUisystem).eInverseAdd(this, DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS, UISystem.class, msgs);
			msgs = basicSetUisystem(newUisystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeuiPackage.INTERACTION_OBJECT__UISYSTEM, newUisystem, newUisystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementedBy() {
		if (implementedBy != null && implementedBy.eIsProxy()) {
			InternalEObject oldImplementedBy = (InternalEObject)implementedBy;
			implementedBy = (Implementation)eResolveProxy(oldImplementedBy);
			if (implementedBy != oldImplementedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY, oldImplementedBy, implementedBy));
			}
		}
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation basicGetImplementedBy() {
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementedBy(Implementation newImplementedBy, NotificationChain msgs) {
		Implementation oldImplementedBy = implementedBy;
		implementedBy = newImplementedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY, oldImplementedBy, newImplementedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementedBy(Implementation newImplementedBy) {
		if (newImplementedBy != implementedBy) {
			NotificationChain msgs = null;
			if (implementedBy != null)
				msgs = ((InternalEObject)implementedBy).eInverseRemove(this, DeuiPackage.IMPLEMENTATION__TARGET, Implementation.class, msgs);
			if (newImplementedBy != null)
				msgs = ((InternalEObject)newImplementedBy).eInverseAdd(this, DeuiPackage.IMPLEMENTATION__TARGET, Implementation.class, msgs);
			msgs = basicSetImplementedBy(newImplementedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY, newImplementedBy, newImplementedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContainer() {
		return (Boolean)IS_CONTAINER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContainer(boolean newIsContainer) {
		IS_CONTAINER__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComponent() {
		return (Boolean)IS_COMPONENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComponent(boolean newIsComponent) {
		IS_COMPONENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInteractionSurface() {
		return (Boolean)IS_INTERACTION_SURFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInteractionSurface(boolean newIsInteractionSurface) {
		IS_INTERACTION_SURFACE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsInteractionSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionDependency> getDependents() {
		if (dependents == null) {
			dependents = new EObjectContainmentWithInverseEList<InteractionDependency>(InteractionDependency.class, this, DeuiPackage.INTERACTION_OBJECT__DEPENDENTS, DeuiPackage.INTERACTION_DEPENDENCY__TARGET);
		}
		return dependents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionDependency> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectWithInverseResolvingEList<InteractionDependency>(InteractionDependency.class, this, DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON, DeuiPackage.INTERACTION_DEPENDENCY__SOURCE);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InteractionObject> getInteractionSurfaces() {
		return (EList<InteractionObject>)INTERACTION_SURFACES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Platform> getPlatforms() {
		return (EList<Platform>)PLATFORMS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case DeuiPackage.INTERACTION_OBJECT__HOSTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHostedBy()).basicAdd(otherEnd, msgs);
			case DeuiPackage.INTERACTION_OBJECT__HOSTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHosts()).basicAdd(otherEnd, msgs);
			case DeuiPackage.INTERACTION_OBJECT__UISYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUisystem((UISystem)otherEnd, msgs);
			case DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY:
				if (implementedBy != null)
					msgs = ((InternalEObject)implementedBy).eInverseRemove(this, DeuiPackage.IMPLEMENTATION__TARGET, Implementation.class, msgs);
				return basicSetImplementedBy((Implementation)otherEnd, msgs);
			case DeuiPackage.INTERACTION_OBJECT__DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependents()).basicAdd(otherEnd, msgs);
			case DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
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
			case DeuiPackage.INTERACTION_OBJECT__HOSTED_BY:
				return ((InternalEList<?>)getHostedBy()).basicRemove(otherEnd, msgs);
			case DeuiPackage.INTERACTION_OBJECT__HOSTS:
				return ((InternalEList<?>)getHosts()).basicRemove(otherEnd, msgs);
			case DeuiPackage.INTERACTION_OBJECT__UISYSTEM:
				return basicSetUisystem(null, msgs);
			case DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY:
				return basicSetImplementedBy(null, msgs);
			case DeuiPackage.INTERACTION_OBJECT__DEPENDENTS:
				return ((InternalEList<?>)getDependents()).basicRemove(otherEnd, msgs);
			case DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
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
			case DeuiPackage.INTERACTION_OBJECT__UISYSTEM:
				return eInternalContainer().eInverseRemove(this, DeuiPackage.UI_SYSTEM__INTERACTION_OBJECTS, UISystem.class, msgs);
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
			case DeuiPackage.INTERACTION_OBJECT__ID:
				return getId();
			case DeuiPackage.INTERACTION_OBJECT__HOSTED_BY:
				return getHostedBy();
			case DeuiPackage.INTERACTION_OBJECT__HOSTS:
				return getHosts();
			case DeuiPackage.INTERACTION_OBJECT__UISYSTEM:
				return getUisystem();
			case DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY:
				if (resolve) return getImplementedBy();
				return basicGetImplementedBy();
			case DeuiPackage.INTERACTION_OBJECT__IS_CONTAINER:
				return isIsContainer();
			case DeuiPackage.INTERACTION_OBJECT__IS_COMPONENT:
				return isIsComponent();
			case DeuiPackage.INTERACTION_OBJECT__IS_INTERACTION_SURFACE:
				return isIsInteractionSurface();
			case DeuiPackage.INTERACTION_OBJECT__DEPENDENTS:
				return getDependents();
			case DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON:
				return getDependsOn();
			case DeuiPackage.INTERACTION_OBJECT__INTERACTION_SURFACES:
				return getInteractionSurfaces();
			case DeuiPackage.INTERACTION_OBJECT__PLATFORMS:
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
			case DeuiPackage.INTERACTION_OBJECT__ID:
				setId((Long)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__HOSTED_BY:
				getHostedBy().clear();
				getHostedBy().addAll((Collection<? extends Hosting>)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__HOSTS:
				getHosts().clear();
				getHosts().addAll((Collection<? extends Hosting>)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__UISYSTEM:
				setUisystem((UISystem)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY:
				setImplementedBy((Implementation)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__IS_CONTAINER:
				setIsContainer((Boolean)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__IS_COMPONENT:
				setIsComponent((Boolean)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__IS_INTERACTION_SURFACE:
				setIsInteractionSurface((Boolean)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__DEPENDENTS:
				getDependents().clear();
				getDependents().addAll((Collection<? extends InteractionDependency>)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends InteractionDependency>)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__INTERACTION_SURFACES:
				getInteractionSurfaces().clear();
				getInteractionSurfaces().addAll((Collection<? extends InteractionObject>)newValue);
				return;
			case DeuiPackage.INTERACTION_OBJECT__PLATFORMS:
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
			case DeuiPackage.INTERACTION_OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case DeuiPackage.INTERACTION_OBJECT__HOSTED_BY:
				getHostedBy().clear();
				return;
			case DeuiPackage.INTERACTION_OBJECT__HOSTS:
				getHosts().clear();
				return;
			case DeuiPackage.INTERACTION_OBJECT__UISYSTEM:
				setUisystem((UISystem)null);
				return;
			case DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY:
				setImplementedBy((Implementation)null);
				return;
			case DeuiPackage.INTERACTION_OBJECT__IS_CONTAINER:
				IS_CONTAINER__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case DeuiPackage.INTERACTION_OBJECT__IS_COMPONENT:
				IS_COMPONENT__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case DeuiPackage.INTERACTION_OBJECT__IS_INTERACTION_SURFACE:
				IS_INTERACTION_SURFACE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case DeuiPackage.INTERACTION_OBJECT__DEPENDENTS:
				getDependents().clear();
				return;
			case DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case DeuiPackage.INTERACTION_OBJECT__INTERACTION_SURFACES:
				getInteractionSurfaces().clear();
				return;
			case DeuiPackage.INTERACTION_OBJECT__PLATFORMS:
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
			case DeuiPackage.INTERACTION_OBJECT__ID:
				return id != ID_EDEFAULT;
			case DeuiPackage.INTERACTION_OBJECT__HOSTED_BY:
				return hostedBy != null && !hostedBy.isEmpty();
			case DeuiPackage.INTERACTION_OBJECT__HOSTS:
				return hosts != null && !hosts.isEmpty();
			case DeuiPackage.INTERACTION_OBJECT__UISYSTEM:
				return getUisystem() != null;
			case DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY:
				return implementedBy != null;
			case DeuiPackage.INTERACTION_OBJECT__IS_CONTAINER:
				return IS_CONTAINER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DeuiPackage.INTERACTION_OBJECT__IS_COMPONENT:
				return IS_COMPONENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DeuiPackage.INTERACTION_OBJECT__IS_INTERACTION_SURFACE:
				return IS_INTERACTION_SURFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DeuiPackage.INTERACTION_OBJECT__DEPENDENTS:
				return dependents != null && !dependents.isEmpty();
			case DeuiPackage.INTERACTION_OBJECT__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case DeuiPackage.INTERACTION_OBJECT__INTERACTION_SURFACES:
				return INTERACTION_SURFACES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DeuiPackage.INTERACTION_OBJECT__PLATFORMS:
				return PLATFORMS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case DeuiPackage.INTERACTION_OBJECT__ID: return DeuiCommonPackage.IDENTIFIED_ELEMENT__ID;
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
				case DeuiCommonPackage.IDENTIFIED_ELEMENT__ID: return DeuiPackage.INTERACTION_OBJECT__ID;
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

} //InteractionObjectImpl
