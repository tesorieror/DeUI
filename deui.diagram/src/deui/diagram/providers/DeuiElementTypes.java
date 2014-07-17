package deui.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import deui.DeuiPackage;
import deui.diagram.edit.parts.HostingEditPart;
import deui.diagram.edit.parts.ImplementationEditPart;
import deui.diagram.edit.parts.InteractionDependencyEditPart;
import deui.diagram.edit.parts.InteractionObjectEditPart;
import deui.diagram.edit.parts.PlatformEditPart;
import deui.diagram.edit.parts.UISystemEditPart;
import deui.diagram.part.DeuiDiagramEditorPlugin;

/**
 * @generated
 */
public class DeuiElementTypes {

	/**
	 * @generated
	 */
	private DeuiElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DeuiDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType UISystem_1000 = getElementType("deui.diagram.UISystem_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Platform_2001 = getElementType("deui.diagram.Platform_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InteractionObject_2002 = getElementType("deui.diagram.InteractionObject_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Hosting_4001 = getElementType("deui.diagram.Hosting_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Implementation_4002 = getElementType("deui.diagram.Implementation_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InteractionDependency_4003 = getElementType("deui.diagram.InteractionDependency_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UISystem_1000, DeuiPackage.eINSTANCE.getUISystem());

			elements.put(Platform_2001, DeuiPackage.eINSTANCE.getPlatform());

			elements.put(InteractionObject_2002,
					DeuiPackage.eINSTANCE.getInteractionObject());

			elements.put(Hosting_4001, DeuiPackage.eINSTANCE.getHosting());

			elements.put(Implementation_4002,
					DeuiPackage.eINSTANCE.getImplementation());

			elements.put(InteractionDependency_4003,
					DeuiPackage.eINSTANCE.getInteractionDependency());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UISystem_1000);
			KNOWN_ELEMENT_TYPES.add(Platform_2001);
			KNOWN_ELEMENT_TYPES.add(InteractionObject_2002);
			KNOWN_ELEMENT_TYPES.add(Hosting_4001);
			KNOWN_ELEMENT_TYPES.add(Implementation_4002);
			KNOWN_ELEMENT_TYPES.add(InteractionDependency_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UISystemEditPart.VISUAL_ID:
			return UISystem_1000;
		case PlatformEditPart.VISUAL_ID:
			return Platform_2001;
		case InteractionObjectEditPart.VISUAL_ID:
			return InteractionObject_2002;
		case HostingEditPart.VISUAL_ID:
			return Hosting_4001;
		case ImplementationEditPart.VISUAL_ID:
			return Implementation_4002;
		case InteractionDependencyEditPart.VISUAL_ID:
			return InteractionDependency_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return deui.diagram.providers.DeuiElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return deui.diagram.providers.DeuiElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return deui.diagram.providers.DeuiElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
