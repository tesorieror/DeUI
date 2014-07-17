/**
 */
package deui;

import deuiCommon.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hosting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deui.Hosting#getTarget <em>Target</em>}</li>
 *   <li>{@link deui.Hosting#getSource <em>Source</em>}</li>
 *   <li>{@link deui.Hosting#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see deui.DeuiPackage#getHosting()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hostingTheSameInteractionObjectTwice'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hostingTheSameInteractionObjectTwice='source.hostedBy->forAll(h : Hosting | h <> self implies h.target <> self.target)'"
 * @generated
 */
public interface Hosting extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link deui.InteractionObject#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(InteractionObject)
	 * @see deui.DeuiPackage#getHosting_Target()
	 * @see deui.InteractionObject#getHosts
	 * @model opposite="hosts" required="true" transient="false"
	 * @generated
	 */
	InteractionObject getTarget();

	/**
	 * Sets the value of the '{@link deui.Hosting#getTarget <em>Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InteractionObject value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link deui.InteractionObject#getHostedBy <em>Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InteractionObject)
	 * @see deui.DeuiPackage#getHosting_Source()
	 * @see deui.InteractionObject#getHostedBy
	 * @model opposite="hostedBy" required="true"
	 * @generated
	 */
	InteractionObject getSource();

	/**
	 * Sets the value of the '{@link deui.Hosting#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InteractionObject value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see deui.DeuiPackage#getHosting_Optional()
	 * @model required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link deui.Hosting#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // Hosting
