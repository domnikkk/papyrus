/*****************************************************************************
 * Copyright (c) 2009-2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Adapted Code from Eclipse GMF
 *  (AutoSizeAction, SizeBothAction, SizeHeightAction and SizeWidthAction)
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.menu.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.layout.LayoutUtils;
import org.eclipse.papyrus.uml.diagram.menu.actions.DistributeAffixedChildNodeLinkAction.AffixedChildNodeRepresentation;

/**
 *
 * This class provides commands to change the size of the selected {@link IGraphicalEditPart}
 *
 */
public class SizeAction {

	/** parameter for the autosize action */
	public static final String PARAMETER_AUTOSIZE = "parameter_autosize"; //$NON-NLS-1$

	/** parameter for the Same Height and Width action */
	public static final String PARAMETER_BOTH = "parameter_both"; //$NON-NLS-1$

	/** parameter for the same Height action */
	public static final String PARAMETER_HEIGHT = "parameter_height"; //$NON-NLS-1$

	/** parameter for the Same Width action */
	public static final String PARAMETER_WIDTH = "parameter_width"; //$NON-NLS-1$

	/** the size action type */
	protected int sizeActionType = 0;

	/** value for the AutoSize action */
	public static final int AUTOSIZE = 0;

	/** value for the Both (Same Height and Width) action */
	public static final int BOTH = AUTOSIZE + 1;

	/** value for the Same Height action */
	public static final int HEIGHT = BOTH + 1;

	/** value for the Same Width action */
	public static final int WIDTH = HEIGHT + 1;

	/** the selected elements */
	public List<IGraphicalEditPart> selectedElements;

	
	/**
	 *
	 * Constructor.
	 *
	 * @param parameter
	 *            the parameter for this action
	 * @param selectedElements
	 *            the selected elements for this action
	 */
	public SizeAction(String parameter, List<IGraphicalEditPart> selectedElements) {
		this.selectedElements = selectedElements;
		if (PARAMETER_AUTOSIZE.equals(parameter)) {
			this.sizeActionType = AUTOSIZE;
		} else if (PARAMETER_BOTH.equals(parameter)) {
			this.sizeActionType = BOTH;
		} else if (PARAMETER_HEIGHT.equals(parameter)) {
			this.sizeActionType = HEIGHT;
		} else if (PARAMETER_WIDTH.equals(parameter)) {
			this.sizeActionType = WIDTH;
		}
	}

	/**
	 * Return the command for this Action
	 *
	 * @return
	 *         The command for this Action
	 */
	public Command getCommand() {
		switch (this.sizeActionType) {
		case AUTOSIZE:
			return getAutoSizeCommand();
		case BOTH:
			return getBothCommand();
		case HEIGHT:
			return getHeightCommand();
		case WIDTH:
			return getWidthCommand();

		default:
			return UnexecutableCommand.INSTANCE;
		}

	}

	/**
	 * Return the command for the AutoSize Action
	 *
	 * @return
	 *         the command for the AutoSize Action
	 */
	protected Command getAutoSizeCommand() {
		// check if the element is selected
		if (this.selectedElements.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		} else {
			boolean foundNonAutosizedPart = false;
			List<IGraphicalEditPart> operationSet = selectedElements;

			CompoundCommand command = new CompoundCommand("AutoSize Command"); //$NON-NLS-1$

			for (IGraphicalEditPart editPart : selectedElements) {
				// Local variables
				int posRightParent = 0;
				int posDownParent = 0;
				Dimension delta;
				double[] zoomMargin = { 0, 0, 0, 0, 0, 0, 1.5, 2.5, 3.5, 4.5, 13.5 };

				// check if the editpart is autosized
				if (editPart instanceof GraphicalEditPart) {
					GraphicalEditPart graphicalEditPart = (GraphicalEditPart) editPart;

					Integer containerWidth = (Integer) graphicalEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width());
					Integer containerHeight = (Integer) graphicalEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height());

					List<?> listept = editPart.getChildren();
					if (containerWidth.intValue() != -1 || containerHeight.intValue() != -1 || !(listept.isEmpty())) {
						foundNonAutosizedPart = true;
						PrecisionRectangle boundsEditPart = LayoutUtils.getAbsolutePosition(graphicalEditPart);

						posRightParent = boundsEditPart.right();
						posDownParent = boundsEditPart.bottom();

					} else {
						return UnexecutableCommand.INSTANCE;
					}
				}

				// Function find editpart
				Dimension d = findSizeChildren(editPart);

				if (d.height > 0 && d.width > 0) {
					// Detected zoom
					ZoomAction zoomAction = new ZoomAction("Zoom", operationSet);
					ZoomManager zoomMngr = zoomAction.getZoomManager();
					if (zoomMngr == null) {
						return null;
					}
					double[] zoomLevel = zoomMngr.getZoomLevels();

					double currentZoomLevel = zoomMngr.getZoom();

					int index = findIndex(currentZoomLevel, zoomLevel);
					double cstZoom = 0;
					if (index != -1) {
						cstZoom = zoomMargin[index];
					}


					int newW = (int) ((posRightParent - d.width) - LayoutUtils.scrollBarSize - cstZoom);
					int newH = (int) ((posDownParent - d.height) - LayoutUtils.scrollBarSize - cstZoom);

					delta = new Dimension(-(newW), -(newH));

					// Prepare setBoundRequest
					ChangeBoundsRequest bRequest = new ChangeBoundsRequest();

					bRequest.setSizeDelta(delta);
					bRequest.setType(org.eclipse.gef.RequestConstants.REQ_RESIZE);
					Command resizeCommand = editPart.getCommand(bRequest);
					command.add(resizeCommand);

				} else {
					// Prepare setBoundRequest
					ChangeBoundsRequest bRequest = new ChangeBoundsRequest();
					bRequest.setResizeDirection(PositionConstants.BOTTOM);

					bRequest.setType(RequestConstants.REQ_AUTOSIZE);
					Command resizeCommand = editPart.getCommand(bRequest);
					command.add(resizeCommand);
				}

			}

			return command.isEmpty() || command.size() != (operationSet.size()) || !foundNonAutosizedPart ? UnexecutableCommand.INSTANCE : (Command) command;

		}
	}

	private Dimension findSizeChildren(IGraphicalEditPart editPart) {
		Dimension sizeChild = new Dimension(0, 0);
		int maxRight = 0;
		int maxDown = 0;

		// Contents of Edit Part selected
		List<EditPart> contents = editPart.getChildren();

		for (int index = 0; index < contents.size(); index++) {
			EditPart editPartCompar = contents.get(index);
			List<?> editPartChild = editPartCompar.getChildren();

			if (!editPartChild.isEmpty()) {

				for (int index2 = 0; index2 < editPartChild.size(); index2++) {
					if (editPartChild.get(index2) != null) {

						GraphicalEditPart graphicalEditPart = (GraphicalEditPart) editPartChild.get(index2);

						if (graphicalEditPart.getChildren().size() > 1 && !(editPartChild instanceof AffixedChildNodeRepresentation)) {
							PrecisionRectangle rectEditPartChild = LayoutUtils.getAbsolutePosition(graphicalEditPart);

							maxRight = (rectEditPartChild.right() > maxRight) ? rectEditPartChild.right() : maxRight;
							maxDown = (rectEditPartChild.bottom() > maxDown) ? rectEditPartChild.bottom() : maxDown;
							sizeChild = new Dimension(maxRight, maxDown);
						} else {
							return findSizeChildren(graphicalEditPart);

						}
					}
				}
			} else {
				sizeChild = new Dimension(0, 0);
			}

		}

		return sizeChild;
	}

	/**
	 * Find index.
	 *
	 * @param currentZoomLevel
	 *            the current zoom level
	 * @param zoomLevel
	 *            the zoom level
	 * @return the int
	 */
	private int findIndex(double currentZoomLevel, double[] zoomLevel) {
		for(int i = 0; i < zoomLevel.length; i++) {
			if(zoomLevel[i] == currentZoomLevel) {
				return i;
			}
		}

		return -1; // element not found
	}
	
	/**
	 * Return the command for the Same Height and Width Action
	 *
	 * @return
	 *         Return the command for the Same Height and Width Action
	 */
	protected Command getBothCommand() {
		return new SameBothSizeAction(selectedElements).getCommand();
	}
	
	/**
	 * Return the command for the Same Height Action
	 *
	 * @return
	 *         Return the command for the Same Height Action
	 */
	protected Command getHeightCommand() {
		return new SameHeightSizeAction(selectedElements).getCommand();
	}
	
	/**
	 * Return the command for the Same Width Action
	 *
	 * @return
	 *         the command for the Same Width Action
	 */
	protected Command getWidthCommand() {
		return new SameWidthSizeAction(selectedElements).getCommand();
	}
	
	/**
	 * Base group editParts resize action 
	 */
	protected static abstract class SameSizeAction {

		public final List<IGraphicalEditPart> mySelectedElements;
		
		public SameSizeAction(List<IGraphicalEditPart> selectedElements) {
			mySelectedElements = selectedElements;
		}
		
		/**
		 * Will to be resized width
		 * Default set to false;
		 */
		protected abstract boolean needResizeHeight();
		
		/**
		 * Will to be resized height
		 * Default set to false;
		 */
		protected abstract boolean needResizeWidth();
		
		/**
		 * Direction to expand selected figures.
		 * Return some of {@link PositionConstants}. 
		 */
		protected abstract int getResizeDirection();
		
		public Command getCommand() {
			if (!(this.mySelectedElements.size() > 1)) {
				return UnexecutableCommand.INSTANCE;
			}
			// Create a compound command to hold the resize commands
			CompoundCommand doResizeCmd = new CompoundCommand();

			// Create an iterator for the selection
			Iterator<IGraphicalEditPart> iter = mySelectedElements.iterator();

			// Get the Primary Selection
			int last = mySelectedElements.size() - 1;
			IGraphicalEditPart primary = mySelectedElements.get(last);

			Dimension primarySize = calculateEdiPartSize(primary);

			while (iter.hasNext()) {

				// For each figure in the selection (to be resize) a request is created for resize to new bounds in the defined direction.
				// The command for this resize is contributed by the edit part for the resize request.
				IGraphicalEditPart epToResize = iter.next();

				// Calculate delta resize
				Dimension delta = calculateDelta(epToResize, primarySize);
				
				//translateToAbsolute translate considering zoom
				primary.getFigure().translateToAbsolute(delta);
				
				Command resizeCommand = epToResize.getCommand(createResizeRequest(delta));
				// Previous implementation (following line) forced bounds on view instead of using resize command provided by the edit part.
				//
				// doResizeCmd.add(new ICommandProxy(new SetBoundsCommand(toResize.getEditingDomain(), "", new EObjectAdapter(resizeView), primarySize))); //$NON-NLS-1$
				//
				
				doResizeCmd.add(resizeCommand);
			}

			return doResizeCmd.unwrap();
		}
		
		protected Dimension calculateEdiPartSize(IGraphicalEditPart ep) {
			View primaryView = (View) ep.getModel();
			Integer width = (Integer) ViewUtil.getStructuralFeatureValue(primaryView, NotationPackage.eINSTANCE.getSize_Width());
			Integer height = (Integer) ViewUtil.getStructuralFeatureValue(primaryView, NotationPackage.eINSTANCE.getSize_Height());

			Dimension epSize;
			if (width.intValue() == -1 || height.intValue() == -1) {
				epSize = ep.getFigure().getSize().getCopy();
			} else {
				epSize = new Dimension(width.intValue(), height.intValue());
			}
			return epSize;
		}
		
		protected Dimension calculateDelta(IGraphicalEditPart toResize, Dimension newSize) {
			Dimension editPartSize = calculateEdiPartSize(toResize);
			
			int deltaWidth = needResizeWidth() ? deltaWidth = newSize.width - editPartSize.width : 0;
			int deltaHeight = needResizeHeight() ? newSize.height - editPartSize.height : 0;
			
			return new Dimension(deltaWidth, deltaHeight);
		}
		
		protected ChangeBoundsRequest createResizeRequest(Dimension delta) {
			ChangeBoundsRequest request = new ChangeBoundsRequest();
			request.setResizeDirection(getResizeDirection());
			request.setSizeDelta(delta);
			request.setType(org.eclipse.gef.RequestConstants.REQ_RESIZE);
			return request;
		}
	}

	/**
	 * Resize editParts height and width in the East-South direction
	 */
	protected static class SameBothSizeAction extends SameSizeAction {

		public SameBothSizeAction(List<IGraphicalEditPart> selectedElements) {
			super(selectedElements);
		}

		@Override
		protected boolean needResizeHeight() {
			return true;
		}

		@Override
		protected boolean needResizeWidth() {
			return true;
		}

		@Override
		protected int getResizeDirection() {
			return PositionConstants.SOUTH_EAST;
		}
	}

	/**
	 * * Resize editParts width in the East direction
	 */
	protected static class SameWidthSizeAction extends SameSizeAction {

		public SameWidthSizeAction(List<IGraphicalEditPart> selectedElements) {
			super(selectedElements);
		}

		@Override
		protected boolean needResizeHeight() {
			return false;
		}

		@Override
		protected boolean needResizeWidth() {
			return true;
		}

		@Override
		protected int getResizeDirection() {
			return PositionConstants.EAST;
		}
	}

	/**
	 * Resize editParts height in the South direction
	 */
	protected static class SameHeightSizeAction extends SameSizeAction {

		public SameHeightSizeAction(List<IGraphicalEditPart> selectedElements) {
			super(selectedElements);
		}

		@Override
		protected boolean needResizeHeight() {
			return true;
		}
		
		@Override
		protected boolean needResizeWidth() {
			return false;
		}

		@Override
		protected int getResizeDirection() {
			return PositionConstants.SOUTH;
		}
	}
}
