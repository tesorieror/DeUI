/**
 */
package deui;

import deuiCommon.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deui.Implementation#getSource <em>Source</em>}</li>
 *   <li>{@link deui.Implementation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see deui.DeuiPackage#getImplementation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ImplementationOnInteractionSurface'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ImplementationOnInteractionSurface='target.isInteractionSurface'"
 * @generated
 */
public interface Implementation extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link deui.Platform#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Platform)
	 * @see deui.DeuiPackage#getImplementation_Source()
	 * @see deui.Platform#getImplements
	 * @model opposite="implements" required="true" transient="false"
	 * @generated
	 */
	Platform getSource();

	/**
	 * Sets the value of the '{@link deui.Implementation#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Platform value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link deui.InteractionObject#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(InteractionObject)
	 * @see deui.DeuiPackage#getImplementation_Target()
	 * @see deui.InteractionObject#getImplementedBy
	 * @model opposite="implementedBy" required="true"
	 * @generated
	 */
	InteractionObject getTarget();

	/**
	 * Sets the value of the '{@link deui.Implementation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InteractionObject value);

} // Implementation
