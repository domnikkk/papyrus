/*
 * Copyright (c) 2014 CEA and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.uml.diagram.modelexplorer.handler;

import org.eclipse.core.commands.State;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.INavigatorContentService;
import org.eclipse.ui.navigator.NavigatorContentServiceFactory;


/**
 * The computed toggle state of the Diagram View command.
 */
public class DiagramViewState extends State {

	public DiagramViewState() {
		super();
	}

	@Override
	public Object getValue() {
		Boolean result = false;

		CommonNavigator navigator = DiagramViewHandler.getCommonNavigator();
		CommonViewer viewer = (navigator == null) ? null : navigator.getCommonViewer();

		if (viewer != null) {
			INavigatorContentService navigatorContent = viewer.getNavigatorContentService();
			result = navigatorContent.isActive(DiagramViewHandler.DIAGRAM_CONTENTS);
		} else {
			// Don't have a ModelExplorer instance, just now
			INavigatorContentService contentService = NavigatorContentServiceFactory.INSTANCE.createContentService(ModelExplorerPageBookView.VIEW_ID);
			try {
				result = contentService.isActive(DiagramViewHandler.DIAGRAM_CONTENTS);
			} finally {
				contentService.dispose();
			}
		}

		return result;
	}
}
