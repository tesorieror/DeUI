package deui.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import deui.diagram.edit.parts.DeuiEditPartFactory;
import deui.diagram.edit.parts.UISystemEditPart;
import deui.diagram.part.DeuiVisualIDRegistry;

/**
 * @generated
 */
public class DeuiEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DeuiEditPartProvider() {
		super(new DeuiEditPartFactory(), DeuiVisualIDRegistry.TYPED_INSTANCE,
				UISystemEditPart.MODEL_ID);
	}

}
