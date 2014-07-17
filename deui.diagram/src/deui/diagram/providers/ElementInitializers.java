package deui.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

import deui.DeuiPackage;
import deui.Hosting;
import deui.Implementation;
import deui.InteractionDependency;
import deui.InteractionObject;
import deui.Platform;
import deui.diagram.expressions.DeuiAbstractExpression;
import deui.diagram.expressions.DeuiOCLFactory;
import deui.diagram.part.DeuiDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Platform_2001(Platform instance) {
		try {
			Object value_0 = DeuiOCLFactory.getExpression(0,
					DeuiPackage.eINSTANCE.getPlatform(), null).evaluate(
					instance);

			value_0 = DeuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getELong());
			instance.setId(((Long) value_0).longValue());
			Object value_1 = DeuiOCLFactory.getExpression(1,
					DeuiPackage.eINSTANCE.getPlatform(), null).evaluate(
					instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InteractionObject_2002(InteractionObject instance) {
		try {
			Object value_0 = DeuiOCLFactory.getExpression(2,
					DeuiPackage.eINSTANCE.getInteractionObject(), null)
					.evaluate(instance);

			value_0 = DeuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getELong());
			instance.setId(((Long) value_0).longValue());
			Object value_1 = DeuiOCLFactory.getExpression(3,
					DeuiPackage.eINSTANCE.getInteractionObject(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Hosting_4001(Hosting instance) {
		try {
			Object value_0 = DeuiOCLFactory.getExpression(4,
					DeuiPackage.eINSTANCE.getHosting(), null)
					.evaluate(instance);

			value_0 = DeuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getELong());
			instance.setId(((Long) value_0).longValue());
		} catch (RuntimeException e) {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Implementation_4002(Implementation instance) {
		try {
			Object value_0 = DeuiOCLFactory.getExpression(5,
					DeuiPackage.eINSTANCE.getImplementation(), null).evaluate(
					instance);

			value_0 = DeuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getELong());
			instance.setId(((Long) value_0).longValue());
		} catch (RuntimeException e) {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InteractionDependency_4003(InteractionDependency instance) {
		try {
			Object value_0 = DeuiOCLFactory.getExpression(7,
					DeuiPackage.eINSTANCE.getInteractionDependency(), null)
					.evaluate(instance);

			value_0 = DeuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getELong());
			instance.setId(((Long) value_0).longValue());
		} catch (RuntimeException e) {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DeuiDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			DeuiDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
