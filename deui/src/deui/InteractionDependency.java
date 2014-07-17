/**
 */
package deui;

import deuiCommon.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deui.InteractionDependency#getSource <em>Source</em>}</li>
 *   <li>{@link deui.InteractionDependency#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see deui.DeuiPackage#getInteractionDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='dependenciesOnInteractionSurfaces'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot dependenciesOnInteractionSurfaces='source.isInteractionSurface and target.isInteractionSurface'"
 * @generated
 */
public interface InteractionDependency extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link deui.InteractionObject#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InteractionObject)
	 * @see deui.DeuiPackage#getInteractionDependency_Source()
	 * @see deui.InteractionObject#getDependsOn
	 * @model opposite="dependsOn" required="true"
	 * @generated
	 */
	InteractionObject getSource();

	/**
	 * Sets the value of the '{@link deui.InteractionDependency#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InteractionObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link deui.InteractionObject#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(InteractionObject)
	 * @see deui.DeuiPackage#getInteractionDependency_Target()
	 * @see deui.InteractionObject#getDependents
	 * @model opposite="dependents" required="true" transient="false"
	 * @generated
	 */
	InteractionObject getTarget();

	/**
	 * Sets the value of the '{@link deui.InteractionDependency#getTarget <em>Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InteractionObject value);

} // InteractionDependency
