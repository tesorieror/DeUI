package deui.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import deui.diagram.part.DeuiVisualIDRegistry;

/**
 * @generated
 */
public class DeuiEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DeuiVisualIDRegistry.getVisualID(view)) {

			case UISystemEditPart.VISUAL_ID:
				return new UISystemEditPart(view);

			case PlatformEditPart.VISUAL_ID:
				return new PlatformEditPart(view);

			case PlatformNameEditPart.VISUAL_ID:
				return new PlatformNameEditPart(view);

			case InteractionObjectEditPart.VISUAL_ID:
				return new InteractionObjectEditPart(view);

			case InteractionObjectNameEditPart.VISUAL_ID:
				return new InteractionObjectNameEditPart(view);

			case HostingEditPart.VISUAL_ID:
				return new HostingEditPart(view);

			case ImplementationEditPart.VISUAL_ID:
				return new ImplementationEditPart(view);

			case InteractionDependencyEditPart.VISUAL_ID:
				return new InteractionDependencyEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
