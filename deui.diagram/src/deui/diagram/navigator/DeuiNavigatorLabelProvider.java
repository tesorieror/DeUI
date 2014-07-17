package deui.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import deui.Hosting;
import deui.Implementation;
import deui.InteractionDependency;
import deui.UISystem;
import deui.diagram.edit.parts.HostingEditPart;
import deui.diagram.edit.parts.ImplementationEditPart;
import deui.diagram.edit.parts.InteractionDependencyEditPart;
import deui.diagram.edit.parts.InteractionObjectEditPart;
import deui.diagram.edit.parts.InteractionObjectNameEditPart;
import deui.diagram.edit.parts.PlatformEditPart;
import deui.diagram.edit.parts.PlatformNameEditPart;
import deui.diagram.edit.parts.UISystemEditPart;
import deui.diagram.part.DeuiDiagramEditorPlugin;
import deui.diagram.part.DeuiVisualIDRegistry;
import deui.diagram.providers.DeuiElementTypes;
import deui.diagram.providers.DeuiParserProvider;

/**
 * @generated
 */
public class DeuiNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DeuiDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DeuiDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DeuiNavigatorItem
				&& !isOwnView(((DeuiNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DeuiNavigatorGroup) {
			DeuiNavigatorGroup group = (DeuiNavigatorGroup) element;
			return DeuiDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DeuiNavigatorItem) {
			DeuiNavigatorItem navigatorItem = (DeuiNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (DeuiVisualIDRegistry.getVisualID(view)) {
		case UISystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://deui/1.0?UISystem", DeuiElementTypes.UISystem_1000); //$NON-NLS-1$
		case PlatformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://deui/1.0?Platform", DeuiElementTypes.Platform_2001); //$NON-NLS-1$
		case InteractionObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://deui/1.0?InteractionObject", DeuiElementTypes.InteractionObject_2002); //$NON-NLS-1$
		case HostingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://deui/1.0?Hosting", DeuiElementTypes.Hosting_4001); //$NON-NLS-1$
		case ImplementationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://deui/1.0?Implementation", DeuiElementTypes.Implementation_4002); //$NON-NLS-1$
		case InteractionDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://deui/1.0?InteractionDependency", DeuiElementTypes.InteractionDependency_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DeuiDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DeuiElementTypes.isKnownElementType(elementType)) {
			image = DeuiElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof DeuiNavigatorGroup) {
			DeuiNavigatorGroup group = (DeuiNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DeuiNavigatorItem) {
			DeuiNavigatorItem navigatorItem = (DeuiNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DeuiVisualIDRegistry.getVisualID(view)) {
		case UISystemEditPart.VISUAL_ID:
			return getUISystem_1000Text(view);
		case PlatformEditPart.VISUAL_ID:
			return getPlatform_2001Text(view);
		case InteractionObjectEditPart.VISUAL_ID:
			return getInteractionObject_2002Text(view);
		case HostingEditPart.VISUAL_ID:
			return getHosting_4001Text(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002Text(view);
		case InteractionDependencyEditPart.VISUAL_ID:
			return getInteractionDependency_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getUISystem_1000Text(View view) {
		UISystem domainModelElement = (UISystem) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlatform_2001Text(View view) {
		IParser parser = DeuiParserProvider.getParser(
				DeuiElementTypes.Platform_2001,
				view.getElement() != null ? view.getElement() : view,
				DeuiVisualIDRegistry.getType(PlatformNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInteractionObject_2002Text(View view) {
		IParser parser = DeuiParserProvider.getParser(
				DeuiElementTypes.InteractionObject_2002,
				view.getElement() != null ? view.getElement() : view,
				DeuiVisualIDRegistry
						.getType(InteractionObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHosting_4001Text(View view) {
		Hosting domainModelElement = (Hosting) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImplementation_4002Text(View view) {
		Implementation domainModelElement = (Implementation) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInteractionDependency_4003Text(View view) {
		InteractionDependency domainModelElement = (InteractionDependency) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			DeuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return UISystemEditPart.MODEL_ID.equals(DeuiVisualIDRegistry
				.getModelID(view));
	}

}
