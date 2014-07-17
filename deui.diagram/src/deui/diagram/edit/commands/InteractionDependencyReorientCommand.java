package deui.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import deui.InteractionDependency;
import deui.InteractionObject;
import deui.diagram.edit.policies.DeuiBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InteractionDependencyReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public InteractionDependencyReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InteractionDependency) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof InteractionObject && newEnd instanceof InteractionObject)) {
			return false;
		}
		InteractionObject target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof InteractionObject)) {
			return false;
		}
		InteractionObject container = (InteractionObject) getLink()
				.eContainer();
		return DeuiBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInteractionDependency_4003(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof InteractionObject && newEnd instanceof InteractionObject)) {
			return false;
		}
		InteractionObject source = getLink().getSource();
		if (!(getLink().eContainer() instanceof InteractionObject)) {
			return false;
		}
		InteractionObject container = (InteractionObject) getLink()
				.eContainer();
		return DeuiBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInteractionDependency_4003(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected InteractionDependency getLink() {
		return (InteractionDependency) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected InteractionObject getOldSource() {
		return (InteractionObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InteractionObject getNewSource() {
		return (InteractionObject) newEnd;
	}

	/**
	 * @generated
	 */
	protected InteractionObject getOldTarget() {
		return (InteractionObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InteractionObject getNewTarget() {
		return (InteractionObject) newEnd;
	}
}
