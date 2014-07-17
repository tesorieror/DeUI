package deui.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import deui.DeuiPackage;
import deui.Hosting;
import deui.Implementation;
import deui.InteractionDependency;
import deui.InteractionObject;
import deui.Platform;
import deui.UISystem;
import deui.diagram.edit.parts.HostingEditPart;
import deui.diagram.edit.parts.ImplementationEditPart;
import deui.diagram.edit.parts.InteractionDependencyEditPart;
import deui.diagram.edit.parts.InteractionObjectEditPart;
import deui.diagram.edit.parts.PlatformEditPart;
import deui.diagram.edit.parts.UISystemEditPart;
import deui.diagram.providers.DeuiElementTypes;

/**
 * @generated
 */
public class DeuiDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<DeuiNodeDescriptor> getSemanticChildren(View view) {
		switch (DeuiVisualIDRegistry.getVisualID(view)) {
		case UISystemEditPart.VISUAL_ID:
			return getUISystem_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiNodeDescriptor> getUISystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UISystem modelElement = (UISystem) view.getElement();
		LinkedList<DeuiNodeDescriptor> result = new LinkedList<DeuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPlatforms().iterator(); it
				.hasNext();) {
			Platform childElement = (Platform) it.next();
			int visualID = DeuiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PlatformEditPart.VISUAL_ID) {
				result.add(new DeuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInteractionObjects().iterator(); it
				.hasNext();) {
			InteractionObject childElement = (InteractionObject) it.next();
			int visualID = DeuiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InteractionObjectEditPart.VISUAL_ID) {
				result.add(new DeuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getContainedLinks(View view) {
		switch (DeuiVisualIDRegistry.getVisualID(view)) {
		case UISystemEditPart.VISUAL_ID:
			return getUISystem_1000ContainedLinks(view);
		case PlatformEditPart.VISUAL_ID:
			return getPlatform_2001ContainedLinks(view);
		case InteractionObjectEditPart.VISUAL_ID:
			return getInteractionObject_2002ContainedLinks(view);
		case HostingEditPart.VISUAL_ID:
			return getHosting_4001ContainedLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002ContainedLinks(view);
		case InteractionDependencyEditPart.VISUAL_ID:
			return getInteractionDependency_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getIncomingLinks(View view) {
		switch (DeuiVisualIDRegistry.getVisualID(view)) {
		case PlatformEditPart.VISUAL_ID:
			return getPlatform_2001IncomingLinks(view);
		case InteractionObjectEditPart.VISUAL_ID:
			return getInteractionObject_2002IncomingLinks(view);
		case HostingEditPart.VISUAL_ID:
			return getHosting_4001IncomingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002IncomingLinks(view);
		case InteractionDependencyEditPart.VISUAL_ID:
			return getInteractionDependency_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getOutgoingLinks(View view) {
		switch (DeuiVisualIDRegistry.getVisualID(view)) {
		case PlatformEditPart.VISUAL_ID:
			return getPlatform_2001OutgoingLinks(view);
		case InteractionObjectEditPart.VISUAL_ID:
			return getInteractionObject_2002OutgoingLinks(view);
		case HostingEditPart.VISUAL_ID:
			return getHosting_4001OutgoingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002OutgoingLinks(view);
		case InteractionDependencyEditPart.VISUAL_ID:
			return getInteractionDependency_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getUISystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getPlatform_2001ContainedLinks(
			View view) {
		Platform modelElement = (Platform) view.getElement();
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Implementation_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getInteractionObject_2002ContainedLinks(
			View view) {
		InteractionObject modelElement = (InteractionObject) view.getElement();
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Hosting_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InteractionDependency_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getHosting_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getImplementation_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getInteractionDependency_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getPlatform_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getInteractionObject_2002IncomingLinks(
			View view) {
		InteractionObject modelElement = (InteractionObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Hosting_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InteractionDependency_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getHosting_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getImplementation_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getInteractionDependency_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getPlatform_2001OutgoingLinks(
			View view) {
		Platform modelElement = (Platform) view.getElement();
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getInteractionObject_2002OutgoingLinks(
			View view) {
		InteractionObject modelElement = (InteractionObject) view.getElement();
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Hosting_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InteractionDependency_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getHosting_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getImplementation_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeuiLinkDescriptor> getInteractionDependency_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getContainedTypeModelFacetLinks_Hosting_4001(
			InteractionObject container) {
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		for (Iterator<?> links = container.getHosts().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Hosting) {
				continue;
			}
			Hosting link = (Hosting) linkObject;
			if (HostingEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InteractionObject dst = link.getTarget();
			InteractionObject src = link.getSource();
			result.add(new DeuiLinkDescriptor(src, dst, link,
					DeuiElementTypes.Hosting_4001, HostingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getContainedTypeModelFacetLinks_Implementation_4002(
			Platform container) {
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		for (Iterator<?> links = container.getImplements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) linkObject;
			if (ImplementationEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InteractionObject dst = link.getTarget();
			Platform src = link.getSource();
			result.add(new DeuiLinkDescriptor(src, dst, link,
					DeuiElementTypes.Implementation_4002,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getContainedTypeModelFacetLinks_InteractionDependency_4003(
			InteractionObject container) {
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		for (Iterator<?> links = container.getDependents().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InteractionDependency) {
				continue;
			}
			InteractionDependency link = (InteractionDependency) linkObject;
			if (InteractionDependencyEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InteractionObject dst = link.getTarget();
			InteractionObject src = link.getSource();
			result.add(new DeuiLinkDescriptor(src, dst, link,
					DeuiElementTypes.InteractionDependency_4003,
					InteractionDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getIncomingTypeModelFacetLinks_Hosting_4001(
			InteractionObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeuiPackage.eINSTANCE
					.getHosting_Target()
					|| false == setting.getEObject() instanceof Hosting) {
				continue;
			}
			Hosting link = (Hosting) setting.getEObject();
			if (HostingEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InteractionObject src = link.getSource();
			result.add(new DeuiLinkDescriptor(src, target, link,
					DeuiElementTypes.Hosting_4001, HostingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getIncomingTypeModelFacetLinks_Implementation_4002(
			InteractionObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeuiPackage.eINSTANCE
					.getImplementation_Target()
					|| false == setting.getEObject() instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) setting.getEObject();
			if (ImplementationEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Platform src = link.getSource();
			result.add(new DeuiLinkDescriptor(src, target, link,
					DeuiElementTypes.Implementation_4002,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getIncomingTypeModelFacetLinks_InteractionDependency_4003(
			InteractionObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DeuiPackage.eINSTANCE
					.getInteractionDependency_Target()
					|| false == setting.getEObject() instanceof InteractionDependency) {
				continue;
			}
			InteractionDependency link = (InteractionDependency) setting
					.getEObject();
			if (InteractionDependencyEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InteractionObject src = link.getSource();
			result.add(new DeuiLinkDescriptor(src, target, link,
					DeuiElementTypes.InteractionDependency_4003,
					InteractionDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getOutgoingTypeModelFacetLinks_Hosting_4001(
			InteractionObject source) {
		InteractionObject container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof InteractionObject) {
				container = (InteractionObject) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		for (Iterator<?> links = container.getHosts().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Hosting) {
				continue;
			}
			Hosting link = (Hosting) linkObject;
			if (HostingEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InteractionObject dst = link.getTarget();
			InteractionObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeuiLinkDescriptor(src, dst, link,
					DeuiElementTypes.Hosting_4001, HostingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getOutgoingTypeModelFacetLinks_Implementation_4002(
			Platform source) {
		Platform container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Platform) {
				container = (Platform) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		for (Iterator<?> links = container.getImplements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) linkObject;
			if (ImplementationEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InteractionObject dst = link.getTarget();
			Platform src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeuiLinkDescriptor(src, dst, link,
					DeuiElementTypes.Implementation_4002,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeuiLinkDescriptor> getOutgoingTypeModelFacetLinks_InteractionDependency_4003(
			InteractionObject source) {
		InteractionObject container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof InteractionObject) {
				container = (InteractionObject) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeuiLinkDescriptor> result = new LinkedList<DeuiLinkDescriptor>();
		for (Iterator<?> links = container.getDependents().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InteractionDependency) {
				continue;
			}
			InteractionDependency link = (InteractionDependency) linkObject;
			if (InteractionDependencyEditPart.VISUAL_ID != DeuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InteractionObject dst = link.getTarget();
			InteractionObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeuiLinkDescriptor(src, dst, link,
					DeuiElementTypes.InteractionDependency_4003,
					InteractionDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<DeuiNodeDescriptor> getSemanticChildren(View view) {
			return DeuiDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DeuiLinkDescriptor> getContainedLinks(View view) {
			return DeuiDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DeuiLinkDescriptor> getIncomingLinks(View view) {
			return DeuiDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DeuiLinkDescriptor> getOutgoingLinks(View view) {
			return DeuiDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
