package deui.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import deui.diagram.part.DeuiVisualIDRegistry;

/**
 * @generated
 */
public class DeuiNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DeuiNavigatorItem) {
			DeuiNavigatorItem item = (DeuiNavigatorItem) element;
			return DeuiVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
