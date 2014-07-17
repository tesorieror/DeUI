package deui.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import deui.diagram.providers.DeuiElementTypes;

/**
 * @generated
 */
public class ImplementationItemSemanticEditPolicy extends
		DeuiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ImplementationItemSemanticEditPolicy() {
		super(DeuiElementTypes.Implementation_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
