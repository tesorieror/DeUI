package deui.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import deui.diagram.providers.DeuiElementTypes;

/**
 * @generated
 */
public class DeuiPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDeui1Group());
	}

	/**
	 * Creates "deui" palette tool group
	 * @generated
	 */
	private PaletteContainer createDeui1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Deui1Group_title);
		paletteContainer.setId("createDeui1Group"); //$NON-NLS-1$
		paletteContainer.add(createInteractionObject1CreationTool());
		paletteContainer.add(createPlatform2CreationTool());
		paletteContainer.add(createHosting3CreationTool());
		paletteContainer.add(createImplementation4CreationTool());
		paletteContainer.add(createDependency5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInteractionObject1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.InteractionObject1CreationTool_title,
				Messages.InteractionObject1CreationTool_desc,
				Collections
						.singletonList(DeuiElementTypes.InteractionObject_2002));
		entry.setId("createInteractionObject1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeuiElementTypes
				.getImageDescriptor(DeuiElementTypes.InteractionObject_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlatform2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Platform2CreationTool_title,
				Messages.Platform2CreationTool_desc,
				Collections.singletonList(DeuiElementTypes.Platform_2001));
		entry.setId("createPlatform2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeuiElementTypes
				.getImageDescriptor(DeuiElementTypes.Platform_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHosting3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Hosting3CreationTool_title,
				Messages.Hosting3CreationTool_desc,
				Collections.singletonList(DeuiElementTypes.Hosting_4001));
		entry.setId("createHosting3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeuiElementTypes
				.getImageDescriptor(DeuiElementTypes.Hosting_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImplementation4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Implementation4CreationTool_title,
				Messages.Implementation4CreationTool_desc,
				Collections.singletonList(DeuiElementTypes.Implementation_4002));
		entry.setId("createImplementation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeuiElementTypes
				.getImageDescriptor(DeuiElementTypes.Implementation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Dependency5CreationTool_title,
				Messages.Dependency5CreationTool_desc,
				Collections
						.singletonList(DeuiElementTypes.InteractionDependency_4003));
		entry.setId("createDependency5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeuiElementTypes
				.getImageDescriptor(DeuiElementTypes.InteractionDependency_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
