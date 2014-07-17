/**
 */
package deui;

import deuiCommon.IdentifiedElement;
import deuiCommon.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deui.Platform#getUiSystem <em>Ui System</em>}</li>
 *   <li>{@link deui.Platform#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @see deui.DeuiPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends NamedElement, IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Ui System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link deui.UISystem#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui System</em>' container reference.
	 * @see #setUiSystem(UISystem)
	 * @see deui.DeuiPackage#getPlatform_UiSystem()
	 * @see deui.UISystem#getPlatforms
	 * @model opposite="platforms" required="true" transient="false"
	 * @generated
	 */
	UISystem getUiSystem();

	/**
	 * Sets the value of the '{@link deui.Platform#getUiSystem <em>Ui System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui System</em>' container reference.
	 * @see #getUiSystem()
	 * @generated
	 */
	void setUiSystem(UISystem value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link deui.Implementation}.
	 * It is bidirectional and its opposite is '{@link deui.Implementation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see deui.DeuiPackage#getPlatform_Implements()
	 * @see deui.Implementation#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Implementation> getImplements();

} // Platform
