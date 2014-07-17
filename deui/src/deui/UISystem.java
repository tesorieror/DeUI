/**
 */
package deui;

import deuiCommon.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deui.UISystem#getInteractionObjects <em>Interaction Objects</em>}</li>
 *   <li>{@link deui.UISystem#getPlatforms <em>Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @see deui.DeuiPackage#getUISystem()
 * @model
 * @generated
 */
public interface UISystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interaction Objects</b></em>' containment reference list.
	 * The list contents are of type {@link deui.InteractionObject}.
	 * It is bidirectional and its opposite is '{@link deui.InteractionObject#getUisystem <em>Uisystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Objects</em>' containment reference list.
	 * @see deui.DeuiPackage#getUISystem_InteractionObjects()
	 * @see deui.InteractionObject#getUisystem
	 * @model opposite="uisystem" containment="true" required="true"
	 * @generated
	 */
	EList<InteractionObject> getInteractionObjects();

	/**
	 * Returns the value of the '<em><b>Platforms</b></em>' containment reference list.
	 * The list contents are of type {@link deui.Platform}.
	 * It is bidirectional and its opposite is '{@link deui.Platform#getUiSystem <em>Ui System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platforms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' containment reference list.
	 * @see deui.DeuiPackage#getUISystem_Platforms()
	 * @see deui.Platform#getUiSystem
	 * @model opposite="uiSystem" containment="true" required="true"
	 * @generated
	 */
	EList<Platform> getPlatforms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.interactionObjects->exists(io : InteractionObject | io.interactionSurfaces->size() > 1)'"
	 * @generated
	 */
	boolean isDivisible();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.interactionObjects->select(isInteractionSurface)->size() > 1'"
	 * @generated
	 */
	boolean hasDividedState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.interactionObjects->select((isInteractionSurface and dependsOn->isEmpty()))->isEmpty()'"
	 * @generated
	 */
	boolean hasUnifiedState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.interactionObjects->exists(io : InteractionObject | io.platforms->size() > 1)'"
	 * @generated
	 */
	boolean isDistributable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.interactionObjects->exists(io1 : InteractionObject, io2 : InteractionObject | io1 <> io2 and not io1.platforms->symmetricDifference(io2.platforms)->isEmpty())'"
	 * @generated
	 */
	boolean hasDistributedState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.interactionObjects->iterate(io : InteractionObject; res : Set(Platform) = self.platforms | res->intersection(io.platforms))->isEmpty()'"
	 * @generated
	 */
	boolean hasSinglePlatformState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\'Is Divisible: \' + self.isDivisible().toString() + \'\\n\' + \'Is Distributable: \' + self.isDistributable().toString() + \'\\n\' + \'Has Unified State: \' + self.hasUnifiedState().toString() + \'\\n\' + \'Has Divided State: \' + self.hasDividedState().toString() + \'\\n\' + \'Has Single Platform State: \' + self.hasSinglePlatformState().toString() + \'\\n\' + \'Has Distributed State: \' + self.hasDistributedState().toString() + \'\\n\''"
	 * @generated
	 */
	String distributionReport();

} // UISystem
