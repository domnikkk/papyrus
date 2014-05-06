/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;


/**
 * this command is used to wrap a copy command. it allows set a new owner for views.
 */
public class DefaultDiagramPasteCommand extends AbstractTransactionalCommand {

	//TODO: should be provided configurable in prefs
	private static final int DEFAULT_AVOID_SUPERPOSITION_Y = 10;

	//TODO: should be provided configurable in prefs
	private static final int DEFAULT_AVOID_SUPERPOSITION_X = 10;

	/** the new container for the shape */
	protected View container = null;

	protected List<EObject> semanticList = new ArrayList<EObject>();

	protected List<EObject> viewList = new ArrayList<EObject>();

	protected ICommand editCommand;

	private CompoundCommand allDropCommand;

	private GraphicalEditPart targetEditPart;

	private List<EObject> objectToDrop;

	/**
	 * Constructor.
	 * 
	 * @param editingDomain
	 * @param label
	 * @param papyrusClipboard
	 * @param subCommand
	 * @param container
	 */
	public DefaultDiagramPasteCommand(TransactionalEditingDomain editingDomain, String label, PapyrusClipboard<Object> papyrusClipboard, GraphicalEditPart targetEditPart) {
		super(editingDomain, label, null);
		this.container = (View)targetEditPart.getModel();
		this.targetEditPart = targetEditPart;
		
		EcoreUtil.Copier copier = new EcoreUtil.Copier();

		List<EObject> rootElementInClipboard = EcoreUtil.filterDescendants(filterEObject(papyrusClipboard));
		copier.copyAll(rootElementInClipboard);
		copier.copyReferences();
		viewList.addAll(EcoreUtil.filterDescendants(copier.values()));
		for(Object eObject : rootElementInClipboard) {
			if(!(eObject instanceof View)) {
				viewList.remove(copier.get(eObject));
				semanticList.add(copier.get(eObject));
			}
		}
		
		// Inform the clipboard of the element created (used by strategies)	
		papyrusClipboard.addAllInternalToTargetCopy(transtypeCopier(copier));
		List<EObject> semanticRootList = EcoreUtil.filterDescendants(semanticList);
		MoveRequest moveRequest = new MoveRequest(container.getElement(), semanticRootList);
		
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container.getElement());
		if(provider != null) {	
			editCommand = provider.getEditCommand(moveRequest);
		}
		if (!papyrusClipboard.getContainerType().equals(targetEditPart.getNotationView().getType()) || viewList.isEmpty()){
			this.objectToDrop =  semanticRootList;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		editCommand.execute(progressMonitor, info);
		if (this.objectToDrop != null){ // try to drop the views
			constructDropRequest(targetEditPart, this.objectToDrop);
			if (allDropCommand != null && !allDropCommand.isEmpty()) {
				allDropCommand.execute();
			}
		} else if (viewList !=null && !viewList.isEmpty()){
			shiftLayoutList(container, viewList);
		}
		return editCommand.getCommandResult();
	}	
	
	
	/**
	 * Construct the drop request
	 * @param targetEditPart
	 * @param objectToDrop
	 */
	protected void constructDropRequest(GraphicalEditPart targetEditPart, List<EObject> objectToDrop) {
		DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();		
		if (container instanceof Diagram) { 
			Point cursorPosition = getCursorPosition(targetEditPart);
			allDropCommand = new CompoundCommand("Drop all semantics elements on diagram"); //$NON-NLS-1$
			for(EObject eObject : objectToDrop) {
				dropObjectsRequest.setObjects(Collections.singletonList(eObject));
				dropObjectsRequest.setLocation(cursorPosition);
				Command command = targetEditPart.getCommand(dropObjectsRequest);
				allDropCommand.add(command);
				cursorPosition = shiftLayout(cursorPosition);
			}
		} else if (!(container instanceof Diagram)){
			Rectangle bounds = targetEditPart.getFigure().getBounds();
			Point center = bounds.getCenter();
			allDropCommand = new CompoundCommand("Drop all semantics elements on a view"); //$NON-NLS-1$
			dropObjectsRequest.setObjects(objectToDrop);
			dropObjectsRequest.setLocation(center);
			Command command = targetEditPart.getCommand(dropObjectsRequest);
			if (command == null){
				command = lookForCommandInSubContainer(targetEditPart, objectToDrop);
			}
			allDropCommand.add(command);
		} 
	}

	
	/**
	 * Look in sub container for a dropcommand
	 * @param targetEditPart
	 * @param objectToDrop
	 * @return
	 */
	protected Command lookForCommandInSubContainer(GraphicalEditPart targetEditPart, List<EObject> objectToDrop) {	
		List children = targetEditPart.getChildren();
		DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();
		for(Object object : children) {
			if (object instanceof GraphicalEditPart) {
				GraphicalEditPart graphicalEditPart = (GraphicalEditPart) object;
				Point center = graphicalEditPart.getFigure().getBounds().getCenter();
				dropObjectsRequest.setLocation(center);
				dropObjectsRequest.setObjects(objectToDrop);
				Command command = graphicalEditPart.getCommand(dropObjectsRequest);
				if (command != null) {
					return command;
				}
			}
		}
		return null;
	}




	/**
	 * Shift the layout of all duplicate Views
	 * 
	 * @param values
	 */
	// TODO : move it in a View utility class 
	private void shiftLayoutList(View container, Collection<EObject> values) {
		//Collection values = duplicatedObject.values();
		Iterator<EObject> iterator = values.iterator();
		// for each view, a container is set if it is null 
		// if this is a shape a new position is set in order to avoid overlap
		while(iterator.hasNext()) {
			Object object = iterator.next();
			if(object instanceof View) {
				View duplicatedView = (View)object;
				if(object instanceof Shape) {
					LayoutConstraint layoutConstraint = ((Shape)object).getLayoutConstraint();
					if(layoutConstraint instanceof Bounds) {
						((Bounds)layoutConstraint).setX(((Bounds)layoutConstraint).getX() + DEFAULT_AVOID_SUPERPOSITION_X);
						((Bounds)layoutConstraint).setY(((Bounds)layoutConstraint).getY() + DEFAULT_AVOID_SUPERPOSITION_Y);
					}
				}
				if(duplicatedView.eContainer() == null && container != null) {
					ViewUtil.insertChildView(container, duplicatedView, ViewUtil.APPEND, true);
				}
			}
		}
	}
	
	
	// TODO : move it in a View utility class 
	/**
	 * Shift position to avoid overlap
	 * @param point
	 * @return
	 */
	protected Point shiftLayout(Point point){
		return new Point(point.x+DEFAULT_AVOID_SUPERPOSITION_X, point.y+DEFAULT_AVOID_SUPERPOSITION_Y);
	}
	
	/**
	 * @param targetEditPart
	 * @return
	 */
	// TODO : move it in utility class 
	protected Point getCursorPosition(GraphicalEditPart targetEditPart) {
		Display display = Display.getDefault();
		org.eclipse.swt.graphics.Point cursorLocation = display.getCursorLocation();
		EditPartViewer viewer = targetEditPart.getViewer();
		Control control = viewer.getControl();
		org.eclipse.swt.graphics.Point point = control.toControl(cursorLocation);
		FigureCanvas figureCanvas = (FigureCanvas) control;
		Point location = figureCanvas.getViewport().getViewLocation();
		return new Point(point.x + location.x, point.y + location.y);
	}
	
	
	/**
	 * @param collection
	 * @return
	 */
	// TODO : move it in utility class 
	protected Collection<EObject> filterEObject(Collection<Object> collection){
		List<EObject> eobjectList = new ArrayList<EObject>();
		for(Object object : collection) {
			if (object instanceof EObject){
				eobjectList.add((EObject)object);
			}
		}
		return eobjectList;
	}
	
	
	/**
	 * @param copier
	 * @return
	 */
	// TODO : move it in utility class 
	protected Map<Object, EObject> transtypeCopier(EcoreUtil.Copier copier) {
		Map<Object, EObject> map = new HashMap<Object, EObject>();
		Set<Entry<EObject, EObject>> entrySet = copier.entrySet();
		for(Entry<EObject, EObject> entry : entrySet) {
			map.put(entry.getValue(), entry.getValue());
		}
		return map;
	}
	
	
}
