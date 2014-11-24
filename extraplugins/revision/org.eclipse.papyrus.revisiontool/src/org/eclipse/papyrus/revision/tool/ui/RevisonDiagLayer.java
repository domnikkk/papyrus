/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.revision.tool.ui;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.papyrus.uml.diagram.common.part.UmlGmfDiagramEditor;
import org.eclipse.swt.internal.image.GIFFileFormat;

/**
 * this class is used to add figure in current diagrams for remove add or set during the revision mode
 *
 */
public class RevisonDiagLayer {

	/**
	 * constructor
	 * @param reviewResourceManager
	 */
	public void run(ReviewResourceManager reviewResourceManager){
		IMultiDiagramEditor multiDiagramEditor=null;
		try {
			multiDiagramEditor = reviewResourceManager.getServiceRegistry().getService(IMultiDiagramEditor.class);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		UmlGmfDiagramEditor diagramEditor = (UmlGmfDiagramEditor)multiDiagramEditor.getActiveEditor();
		DiagramEditPart	diagramEditPart = (DiagramEditPart)diagramEditor.getAdapter(DiagramEditPart.class);
		updateEditpart(reviewResourceManager, diagramEditPart);
	}

	/**
	 * update edipart
	 * @param reviewResourceManager
	 * @param editPart
	 */
	protected void updateEditpart(ReviewResourceManager reviewResourceManager,
			EditPart editPart) {
		for (Object subEditPart : editPart.getChildren()) {
			if( subEditPart instanceof GraphicalEditPart){
				EObject semanticEObject=((GraphicalEditPart)subEditPart).resolveSemanticElement();
				IFigure fig=((GraphicalEditPart) subEditPart).getFigure();
				if( !(subEditPart instanceof CompartmentEditPart)){
					updateFigures(reviewResourceManager, subEditPart, semanticEObject,fig);
				}
				updateEditpart(reviewResourceManager,(GraphicalEditPart) subEditPart);
			}
		}

		if( editPart instanceof DiagramEditPart){
			for (Object connetionEditPart :((DiagramEditPart) editPart).getConnections()) {
				if( connetionEditPart instanceof ConnectionEditPart){
					EObject semanticEObject=((ConnectionEditPart)connetionEditPart).resolveSemanticElement();
					IFigure fig=((ConnectionEditPart) connetionEditPart).getFigure();
					updateFigures(reviewResourceManager, connetionEditPart, semanticEObject,	fig);
				}
			}
		}
	}

	protected void updateFigures(ReviewResourceManager reviewResourceManager,
			Object editPart, EObject semanticEObject, IFigure fig) {
		Comparison comparison=reviewResourceManager.getDiffModel();
		RemovedFig removedFig=null;
		AddingFig addingFig=null;
		for (Object subFig : fig.getChildren()) {
			if(subFig instanceof RemovedFig){
				removedFig=(RemovedFig)subFig;
			}
			if(subFig instanceof AddingFig){
				addingFig=(AddingFig)subFig;
			}
		}

		if(comparison.getDifferences(semanticEObject).size()>0){
			if(comparison.getDifferences(semanticEObject).get(0).getKind().equals(DifferenceKind.DELETE)){
				if(removedFig==null){
					removedFig= new RemovedFig();
					fig.add(removedFig);
				}

				if(fig instanceof PolylineConnectionEx){
					Rectangle rect = new Rectangle(((PolylineConnectionEx)fig).getPoints().getFirstPoint(), ((PolylineConnectionEx)fig).getPoints().getLastPoint());
					if(rect.x==0 &&rect.y==0){
						if(editPart instanceof ConnectionEditPart){
							rect=((GraphicalEditPart)((ConnectionEditPart)editPart).getSource()).getFigure().getBounds().getCopy();
							rect=rect.getUnion(((GraphicalEditPart)((ConnectionEditPart)editPart).getTarget()).getFigure().getBounds());
						}
					}
					removedFig.setBounds(rect);

				}
				else{
					removedFig.setBounds(fig.getBounds());}
			}

			else if(comparison.getDifferences(semanticEObject).get(0).getKind().equals(DifferenceKind.ADD)){
				if(addingFig==null){
					addingFig= new AddingFig();
					fig.add(addingFig);
				}
				if(fig instanceof PolylineConnectionEx){
					Rectangle rect = new Rectangle(((PolylineConnectionEx)fig).getPoints().getFirstPoint(), ((PolylineConnectionEx)fig).getPoints().getLastPoint());
					if(rect.x==0 &&rect.y==0){
						if(editPart instanceof ConnectionEditPart){
							rect=((GraphicalEditPart)((ConnectionEditPart)editPart).getSource()).getFigure().getBounds().getCopy();
							rect=rect.getUnion(((GraphicalEditPart)((ConnectionEditPart)editPart).getTarget()).getFigure().getBounds());
						}
					}
					addingFig.setBounds(rect);
				}
				else{
					addingFig.setBounds(fig.getBounds());}
			}
			else{
				if(removedFig!=null){
					fig.remove(removedFig);
				}
				if(addingFig!=null){
					fig.remove(addingFig);
				}		
			}
		}
	}
}