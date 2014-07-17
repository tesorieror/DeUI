package deui.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import deui.Implementation;
import deui.InteractionObject;
import deui.Platform;
import deui.diagram.edit.policies.DeuiBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ImplementationReorientCommand extends EditElementCommand {

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
	public ImplementationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Implementation) {
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
		if (!(oldEnd instanceof Platform && newEnd instanceof Platform)) {
			return false;
		}
		InteractionObject target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Platform)) {
			return false;
		}
		Platform container = (Platform) getLink().eContainer();
		return DeuiBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistImplementation_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof InteractionObject && newEnd instanceof InteractionObject)) {
			return false;
		}
		Platform source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Platform)) {
			return false;
		}
		Platform container = (Platform) getLink().eContainer();
		return DeuiBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistImplementation_4002(container, getLink(), source,
						getNewTarget());
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
	protected Implementation getLink() {
		return (Implementation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Platform getOldSource() {
		return (Platform) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Platform getNewSource() {
		return (Platform) newEnd;
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
