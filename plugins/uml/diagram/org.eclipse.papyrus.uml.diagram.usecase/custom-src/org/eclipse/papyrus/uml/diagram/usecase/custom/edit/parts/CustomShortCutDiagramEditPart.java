/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.editorsfactory.IPageIconsRegistry;
import org.eclipse.papyrus.infra.core.editorsfactory.PageIconsRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.ServiceUtilsForEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ShortCutDiagramEditPart;
import org.eclipse.swt.graphics.Image;

public class CustomShortCutDiagramEditPart extends ShortCutDiagramEditPart {

	public CustomShortCutDiagramEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	private IPageIconsRegistry editorRegistry;

	@Override
	public void refresh() {
		refreshIcons();
		super.refresh();
	}

	/**
	 * Get the EditorRegistry used to create editor instances. This default implementation return
	 * the singleton eINSTANCE. This method can be subclassed to return another registry.
	 *
	 * @return the singleton eINSTANCE of editor registry
	 * @throws ServiceException
	 */
	@Override
	protected IPageIconsRegistry getEditorRegistry() {
		if (editorRegistry == null) {
			editorRegistry = createEditorRegistry();
		}
		return editorRegistry;
	}

	/**
	 * Return the EditorRegistry for nested editor descriptors. Subclass should implements this
	 * method in order to return the registry associated to the extension point namespace.
	 *
	 * @return the EditorRegistry for nested editor descriptors
	 * @throws ServiceException
	 *
	 */
	@Override
	protected IPageIconsRegistry createEditorRegistry() {
		try {
			return ServiceUtilsForEditPart.getInstance().getService(IPageIconsRegistry.class, this);
		} catch (ServiceException e) {
			// Not found, return an empty one which return null for each request.
			return new PageIconsRegistry();
		}
	}

	@Override
	protected void refreshBounds() {
		int width = 34;
		int height = 20;
		Dimension size = new Dimension(width, height);
		int x = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		Point loc = new Point(x, y);
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(loc, size));
	}

	private void refreshIcons() {
		Image image;
		image = getEditorRegistry().getEditorIcon(resolveSemanticElement());
		getPrimaryShape().setIcon(image);
	}
}
