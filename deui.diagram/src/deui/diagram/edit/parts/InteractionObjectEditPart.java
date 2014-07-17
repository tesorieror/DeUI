package deui.diagram.edit.parts;

import java.util.logging.Level;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Logger;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import deui.DeuiPackage;
import deui.InteractionObject;
import deui.diagram.edit.policies.InteractionObjectItemSemanticEditPolicy;
import deui.diagram.part.DeuiVisualIDRegistry;

/**
 * @generated
 */
public class InteractionObjectEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public InteractionObjectEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InteractionObjectItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that
		// would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new InteractionObjectFigure();
	}

	/**
	 * @generated
	 */
	public InteractionObjectFigure getPrimaryShape() {
		return (InteractionObjectFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InteractionObjectNameEditPart) {
			((InteractionObjectNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureInteractionObjectNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InteractionObjectNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(DeuiVisualIDRegistry
				.getType(InteractionObjectNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class InteractionObjectFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInteractionObjectNameFigure;

		/**
		 * @generated
		 */
		public InteractionObjectFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(2);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInteractionObjectNameFigure = new WrappingLabel();

			fFigureInteractionObjectNameFigure.setText("<...>");

			fFigureInteractionObjectNameFigure
					.setFont(FFIGUREINTERACTIONOBJECTNAMEFIGURE_FONT);

			GridData constraintFFigureInteractionObjectNameFigure = new GridData();
			constraintFFigureInteractionObjectNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureInteractionObjectNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureInteractionObjectNameFigure.horizontalIndent = 0;
			constraintFFigureInteractionObjectNameFigure.horizontalSpan = 1;
			constraintFFigureInteractionObjectNameFigure.verticalSpan = 1;
			constraintFFigureInteractionObjectNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureInteractionObjectNameFigure.grabExcessVerticalSpace = true;
			this.add(fFigureInteractionObjectNameFigure,
					constraintFFigureInteractionObjectNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInteractionObjectNameFigure() {
			return fFigureInteractionObjectNameFigure;
		}

		/*
		 * Update background and foreground colors
		 */

		@Override
		protected void outlineShape(Graphics graphics) {
			Color fColor = graphics.getForegroundColor();
			InteractionObject io = (InteractionObject) ((NodeImpl) getModel())
					.getElement();
			if (io.isIsInteractionSurface()) {
				graphics.setForegroundColor(INTERACTION_SURFACE_FORE);
			} else if (io.isIsContainer()) {
				graphics.setForegroundColor(CONTAINER_FORE);
			} else if (io.isIsComponent()) {
				graphics.setForegroundColor(COMPONENT_FORE);
			} else {
				// Logger.getLogger(getClass().getCanonicalName()).log(Level.INFO,
				// "No foreground set");
			}
			super.outlineShape(graphics);
			graphics.setForegroundColor(fColor);
		}

		@Override
		protected void fillShape(Graphics graphics) {
			Color bColor = graphics.getBackgroundColor();
			InteractionObject io = (InteractionObject) ((NodeImpl) getModel())
					.getElement();
			if (io.isIsInteractionSurface()) {
				graphics.setBackgroundColor(INTERACTION_SURFACE_BACK);
			} else if (io.isIsContainer()) {
				graphics.setBackgroundColor(CONTAINER_BACK);
			} else if (io.isIsComponent()) {
				graphics.setBackgroundColor(COMPONENT_BACK);
			} else {

				// Logger.getLogger(getClass().getCanonicalName()).log(Level.INFO,
				// "No background set");
			}
			super.fillShape(graphics);
			graphics.setBackgroundColor(bColor);
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREINTERACTIONOBJECTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/*
	 * Added code to support color change according to properties
	 */

	static final Color COMPONENT_FORE = new Color(null, 0, 0, 255);

	static final Color COMPONENT_BACK = new Color(null, 220, 220, 255);

	static final Color CONTAINER_FORE = new Color(null, 255, 255, 0);

	static final Color CONTAINER_BACK = new Color(null, 255, 255, 220);

	static final Color INTERACTION_SURFACE_FORE = new Color(null, 0, 255, 0);

	static final Color INTERACTION_SURFACE_BACK = new Color(null, 220, 255, 220);

	protected void handleNotificationEvent(Notification notification) {
		if (notification.getEventType() == Notification.ADD
				|| notification.getEventType() == Notification.REMOVE) {
			if (DeuiPackage.INTERACTION_OBJECT__HOSTS == notification
					.getFeatureID(InteractionObject.class)
					|| DeuiPackage.INTERACTION_OBJECT__HOSTED_BY == notification
							.getFeatureID(InteractionObject.class)
					|| DeuiPackage.INTERACTION_OBJECT__IMPLEMENTED_BY == notification
							.getFeatureID(InteractionObject.class)) {
				// getPrimaryShape().updateBackgroundColor();
				// getPrimaryShape().updateForegroundColor();
				getPrimaryShape().invalidate();
				getPrimaryShape().repaint();
			}
		}
		super.handleNotificationEvent(notification);
	}

}
