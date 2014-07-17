package deui.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import deui.diagram.edit.commands.HostingCreateCommand;
import deui.diagram.edit.commands.HostingReorientCommand;
import deui.diagram.edit.commands.ImplementationCreateCommand;
import deui.diagram.edit.commands.ImplementationReorientCommand;
import deui.diagram.edit.commands.InteractionDependencyCreateCommand;
import deui.diagram.edit.commands.InteractionDependencyReorientCommand;
import deui.diagram.edit.parts.HostingEditPart;
import deui.diagram.edit.parts.ImplementationEditPart;
import deui.diagram.edit.parts.InteractionDependencyEditPart;
import deui.diagram.part.DeuiVisualIDRegistry;
import deui.diagram.providers.DeuiElementTypes;

/**
 * @generated
 */
public class InteractionObjectItemSemanticEditPolicy extends
		DeuiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InteractionObjectItemSemanticEditPolicy() {
		super(DeuiElementTypes.InteractionObject_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DeuiVisualIDRegistry.getVisualID(incomingLink) == HostingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeuiVisualIDRegistry.getVisualID(incomingLink) == ImplementationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeuiVisualIDRegistry.getVisualID(incomingLink) == InteractionDependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DeuiVisualIDRegistry.getVisualID(outgoingLink) == HostingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeuiVisualIDRegistry.getVisualID(outgoingLink) == InteractionDependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DeuiElementTypes.Hosting_4001 == req.getElementType()) {
			return getGEFWrapper(new HostingCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (DeuiElementTypes.Implementation_4002 == req.getElementType()) {
			return null;
		}
		if (DeuiElementTypes.InteractionDependency_4003 == req.getElementType()) {
			return getGEFWrapper(new InteractionDependencyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DeuiElementTypes.Hosting_4001 == req.getElementType()) {
			return getGEFWrapper(new HostingCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (DeuiElementTypes.Implementation_4002 == req.getElementType()) {
			return getGEFWrapper(new ImplementationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeuiElementTypes.InteractionDependency_4003 == req.getElementType()) {
			return getGEFWrapper(new InteractionDependencyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case HostingEditPart.VISUAL_ID:
			return getGEFWrapper(new HostingReorientCommand(req));
		case ImplementationEditPart.VISUAL_ID:
			return getGEFWrapper(new ImplementationReorientCommand(req));
		case InteractionDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new InteractionDependencyReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
