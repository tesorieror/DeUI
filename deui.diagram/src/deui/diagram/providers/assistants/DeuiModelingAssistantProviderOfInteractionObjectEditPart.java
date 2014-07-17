package deui.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import deui.diagram.edit.parts.InteractionObjectEditPart;
import deui.diagram.providers.DeuiElementTypes;
import deui.diagram.providers.DeuiModelingAssistantProvider;

/**
 * @generated
 */
public class DeuiModelingAssistantProviderOfInteractionObjectEditPart extends
		DeuiModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((InteractionObjectEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			InteractionObjectEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DeuiElementTypes.Hosting_4001);
		types.add(DeuiElementTypes.InteractionDependency_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(InteractionObjectEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			InteractionObjectEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InteractionObjectEditPart) {
			types.add(DeuiElementTypes.Hosting_4001);
		}
		if (targetEditPart instanceof InteractionObjectEditPart) {
			types.add(DeuiElementTypes.InteractionDependency_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((InteractionObjectEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			InteractionObjectEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeuiElementTypes.Hosting_4001) {
			types.add(DeuiElementTypes.InteractionObject_2002);
		} else if (relationshipType == DeuiElementTypes.InteractionDependency_4003) {
			types.add(DeuiElementTypes.InteractionObject_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((InteractionObjectEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			InteractionObjectEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DeuiElementTypes.Hosting_4001);
		types.add(DeuiElementTypes.Implementation_4002);
		types.add(DeuiElementTypes.InteractionDependency_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((InteractionObjectEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			InteractionObjectEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeuiElementTypes.Hosting_4001) {
			types.add(DeuiElementTypes.InteractionObject_2002);
		} else if (relationshipType == DeuiElementTypes.Implementation_4002) {
			types.add(DeuiElementTypes.Platform_2001);
		} else if (relationshipType == DeuiElementTypes.InteractionDependency_4003) {
			types.add(DeuiElementTypes.InteractionObject_2002);
		}
		return types;
	}

}
