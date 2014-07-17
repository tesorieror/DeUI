package deui.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import deui.DeuiPackage;
import deui.UISystem;
import deui.diagram.edit.parts.HostingEditPart;
import deui.diagram.edit.parts.ImplementationEditPart;
import deui.diagram.edit.parts.InteractionDependencyEditPart;
import deui.diagram.edit.parts.InteractionObjectEditPart;
import deui.diagram.edit.parts.InteractionObjectNameEditPart;
import deui.diagram.edit.parts.PlatformEditPart;
import deui.diagram.edit.parts.PlatformNameEditPart;
import deui.diagram.edit.parts.UISystemEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DeuiVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "deui.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UISystemEditPart.MODEL_ID.equals(view.getType())) {
				return UISystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return deui.diagram.part.DeuiVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DeuiDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DeuiPackage.eINSTANCE.getUISystem().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((UISystem) domainElement)) {
			return UISystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = deui.diagram.part.DeuiVisualIDRegistry
				.getModelID(containerView);
		if (!UISystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (UISystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = deui.diagram.part.DeuiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UISystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UISystemEditPart.VISUAL_ID:
			if (DeuiPackage.eINSTANCE.getPlatform().isSuperTypeOf(
					domainElement.eClass())) {
				return PlatformEditPart.VISUAL_ID;
			}
			if (DeuiPackage.eINSTANCE.getInteractionObject().isSuperTypeOf(
					domainElement.eClass())) {
				return InteractionObjectEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = deui.diagram.part.DeuiVisualIDRegistry
				.getModelID(containerView);
		if (!UISystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (UISystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = deui.diagram.part.DeuiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UISystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UISystemEditPart.VISUAL_ID:
			if (PlatformEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InteractionObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlatformEditPart.VISUAL_ID:
			if (PlatformNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InteractionObjectEditPart.VISUAL_ID:
			if (InteractionObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DeuiPackage.eINSTANCE.getHosting().isSuperTypeOf(
				domainElement.eClass())) {
			return HostingEditPart.VISUAL_ID;
		}
		if (DeuiPackage.eINSTANCE.getImplementation().isSuperTypeOf(
				domainElement.eClass())) {
			return ImplementationEditPart.VISUAL_ID;
		}
		if (DeuiPackage.eINSTANCE.getInteractionDependency().isSuperTypeOf(
				domainElement.eClass())) {
			return InteractionDependencyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(UISystem element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case UISystemEditPart.VISUAL_ID:
			return false;
		case PlatformEditPart.VISUAL_ID:
		case InteractionObjectEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return deui.diagram.part.DeuiVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return deui.diagram.part.DeuiVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return deui.diagram.part.DeuiVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return deui.diagram.part.DeuiVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return deui.diagram.part.DeuiVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return deui.diagram.part.DeuiVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
