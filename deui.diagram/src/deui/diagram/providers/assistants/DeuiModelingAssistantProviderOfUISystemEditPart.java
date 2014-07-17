package deui.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import deui.diagram.providers.DeuiElementTypes;
import deui.diagram.providers.DeuiModelingAssistantProvider;

/**
 * @generated
 */
public class DeuiModelingAssistantProviderOfUISystemEditPart extends
		DeuiModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DeuiElementTypes.Platform_2001);
		types.add(DeuiElementTypes.InteractionObject_2002);
		return types;
	}

}
