/*****************************************************************************
 * Copyright (c) 2013 CEA LIST, 2014 Flanders' Make.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Klaas Gadeyne (Flanders' Make) klaas.gadeyne@flandersmake.be - Extended for CallBehaviorActions,
 *  see bug 453721 
 *****************************************************************************/
package org.eclipse.papyrus.uml.navigation.contributor;

import java.util.Collections;

import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.navigation.service.NavigableElement;
import org.eclipse.papyrus.infra.widgets.util.IRevealSemanticElement;
import org.eclipse.papyrus.infra.widgets.util.NavigationTarget;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Behavior;

/**
 * Navigates from a CallBehaviorAction to its Behavior declaration
 *
 * @author Klaas Gadeyne
 */
public class CBANavigableElement implements NavigableElement {

	protected final Behavior behavior;

	/**
	 *
	 * @param type
	 *            The Type to navigate to. May be null.
	 */
	public CBANavigableElement(Behavior behavior) {
		this.behavior = behavior;
	}

	public String getLabel() {
		String label = "Go to behavior" + getCBALabel();
		return label;
	}

	public String getDescription() {
		return "Go to the Behavior linked with to this CallBehaviorAction" + getCBALabel();
	}

	protected String getCBALabel() {
		if (behavior == null) {
			return " (Undefined)";
		} else {
			return " (" + behavior.getName() + ")";
		}
	}

	@Deprecated
	public void navigate(IRevealSemanticElement navigationContext) {
		if (!isEnabled()) {
			return;
		}

		navigationContext.revealSemanticElement(Collections.singletonList(behavior));
	}

	public Image getImage() {
		if (behavior == null) {
			return null;
		}

		try {
			return ServiceUtilsForEObject.getInstance().getServiceRegistry(behavior).getService(LabelProviderService.class).getLabelProvider().getImage(behavior);
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * Enabled when the behavior is defined
	 */
	public boolean isEnabled() {
		return behavior != null;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean navigate(NavigationTarget navigationContext) {
		if (!isEnabled()) {
			return false;
		}
		return navigationContext.revealElement(behavior);
	}
}
