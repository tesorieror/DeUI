/**
 */
package deui;

import deuiCommon.IdentifiedElement;
import deuiCommon.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deui.InteractionObject#getHostedBy <em>Hosted By</em>}</li>
 *   <li>{@link deui.InteractionObject#getHosts <em>Hosts</em>}</li>
 *   <li>{@link deui.InteractionObject#getUisystem <em>Uisystem</em>}</li>
 *   <li>{@link deui.InteractionObject#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link deui.InteractionObject#isIsContainer <em>Is Container</em>}</li>
 *   <li>{@link deui.InteractionObject#isIsComponent <em>Is Component</em>}</li>
 *   <li>{@link deui.InteractionObject#isIsInteractionSurface <em>Is Interaction Surface</em>}</li>
 *   <li>{@link deui.InteractionObject#getDependents <em>Dependents</em>}</li>
 *   <li>{@link deui.InteractionObject#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link deui.InteractionObject#getInteractionSurfaces <em>Interaction Surfaces</em>}</li>
 *   <li>{@link deui.InteractionObject#getPlatforms <em>Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @see deui.DeuiPackage#getInteractionObject()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='componentCannotBeInteractionSurface cycle desconnectedInteractionObject'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot componentCannotBeInteractionSurface='isComponent implies not isInteractionSurface' cycle='not self->closure(hostedBy.target)->includes(self)' desconnectedInteractionObject='not isInteractionSurface implies not hostedBy->isEmpty()'"
 * @generated
 */
public interface InteractionObject extends NamedElement, IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Hosted By</b></em>' reference list.
	 * The list contents are of type {@link deui.Hosting}.
	 * It is bidirectional and its opposite is '{@link deui.Hosting#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted By</em>' reference list.
	 * @see deui.DeuiPackage#getInteractionObject_HostedBy()
	 * @see deui.Hosting#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Hosting> getHostedBy();

	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link deui.Hosting}.
	 * It is bidirectional and its opposite is '{@link deui.Hosting#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' containment reference list.
	 * @see deui.DeuiPackage#getInteractionObject_Hosts()
	 * @see deui.Hosting#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<Hosting> getHosts();

	/**
	 * Returns the value of the '<em><b>Uisystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link deui.UISystem#getInteractionObjects <em>Interaction Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uisystem</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uisystem</em>' container reference.
	 * @see #setUisystem(UISystem)
	 * @see deui.DeuiPackage#getInteractionObject_Uisystem()
	 * @see deui.UISystem#getInteractionObjects
	 * @model opposite="interactionObjects" required="true" transient="false"
	 * @generated
	 */
	UISystem getUisystem();

	/**
	 * Sets the value of the '{@link deui.InteractionObject#getUisystem <em>Uisystem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uisystem</em>' container reference.
	 * @see #getUisystem()
	 * @generated
	 */
	void setUisystem(UISystem value);

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link deui.Implementation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference.
	 * @see #setImplementedBy(Implementation)
	 * @see deui.DeuiPackage#getInteractionObject_ImplementedBy()
	 * @see deui.Implementation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Implementation getImplementedBy();

	/**
	 * Sets the value of the '{@link deui.InteractionObject#getImplementedBy <em>Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented By</em>' reference.
	 * @see #getImplementedBy()
	 * @generated
	 */
	void setImplementedBy(Implementation value);

	/**
	 * Returns the value of the '<em><b>Is Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Container</em>' attribute.
	 * @see #setIsContainer(boolean)
	 * @see deui.DeuiPackage#getInteractionObject_IsContainer()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='not hosts->isEmpty()'"
	 * @generated
	 */
	boolean isIsContainer();

	/**
	 * Sets the value of the '{@link deui.InteractionObject#isIsContainer <em>Is Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Container</em>' attribute.
	 * @see #isIsContainer()
	 * @generated
	 */
	void setIsContainer(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Component</em>' attribute.
	 * @see #setIsComponent(boolean)
	 * @see deui.DeuiPackage#getInteractionObject_IsComponent()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='hosts->isEmpty()'"
	 * @generated
	 */
	boolean isIsComponent();

	/**
	 * Sets the value of the '{@link deui.InteractionObject#isIsComponent <em>Is Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Component</em>' attribute.
	 * @see #isIsComponent()
	 * @generated
	 */
	void setIsComponent(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Interaction Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Interaction Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Interaction Surface</em>' attribute.
	 * @see #setIsInteractionSurface(boolean)
	 * @see deui.DeuiPackage#getInteractionObject_IsInteractionSurface()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='not hosts->isEmpty() and not implementedBy->isEmpty()'"
	 * @generated
	 */
	boolean isIsInteractionSurface();

	/**
	 * Sets the value of the '{@link deui.InteractionObject#isIsInteractionSurface <em>Is Interaction Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interaction Surface</em>' attribute.
	 * @see #isIsInteractionSurface()
	 * @generated
	 */
	void setIsInteractionSurface(boolean value);

	/**
	 * Returns the value of the '<em><b>Dependents</b></em>' containment reference list.
	 * The list contents are of type {@link deui.InteractionDependency}.
	 * It is bidirectional and its opposite is '{@link deui.InteractionDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependents</em>' containment reference list.
	 * @see deui.DeuiPackage#getInteractionObject_Dependents()
	 * @see deui.InteractionDependency#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<InteractionDependency> getDependents();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link deui.InteractionDependency}.
	 * It is bidirectional and its opposite is '{@link deui.InteractionDependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see deui.DeuiPackage#getInteractionObject_DependsOn()
	 * @see deui.InteractionDependency#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<InteractionDependency> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Interaction Surfaces</b></em>' reference list.
	 * The list contents are of type {@link deui.InteractionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Surfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Surfaces</em>' reference list.
	 * @see deui.DeuiPackage#getInteractionObject_InteractionSurfaces()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self->closure(hostedBy.target)->select(isInteractionSurface)'"
	 * @generated
	 */
	EList<InteractionObject> getInteractionSurfaces();

	/**
	 * Returns the value of the '<em><b>Platforms</b></em>' reference list.
	 * The list contents are of type {@link deui.Platform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platforms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' reference list.
	 * @see deui.DeuiPackage#getInteractionObject_Platforms()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.interactionSurfaces.implementedBy->flatten().oclAsType(Implementation).source->asSet()->union(self.implementedBy->collect(source)->asSet())->asOrderedSet()'"
	 * @generated
	 */
	EList<Platform> getPlatforms();

} // InteractionObject
