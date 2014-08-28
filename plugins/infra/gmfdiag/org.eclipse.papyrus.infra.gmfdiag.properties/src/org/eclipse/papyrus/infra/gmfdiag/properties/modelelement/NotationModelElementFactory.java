/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 323802
 *  Christian W. Damus (CEA) - bug 417409
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.properties.modelelement;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.GradientData;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.NotationHelper;
import org.eclipse.papyrus.infra.gmfdiag.properties.Activator;
import org.eclipse.papyrus.infra.gmfdiag.properties.databinding.ObservableGradientData;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;
import org.eclipse.papyrus.views.properties.modelelement.AbstractEMFModelElementFactory;
import org.eclipse.papyrus.views.properties.modelelement.AbstractModelElement;
import org.eclipse.papyrus.views.properties.modelelement.AbstractModelElementFactory;

/**
 * A factory for handling the GMF Notation elements
 *
 * @author Camille Letavernier
 */
public class NotationModelElementFactory extends AbstractModelElementFactory<AbstractModelElement> {
	@Override
	protected AbstractModelElement doCreateFromSource(Object sourceElement, DataContextElement context) {

		if (sourceElement instanceof ObservableGradientData) {
			ObservableGradientData gradientData = (ObservableGradientData) sourceElement;
			return new GradientDataModelElement(gradientData, gradientData.getOwner());
		} else if (sourceElement instanceof GradientData) {
			return new GradientDataModelElement((GradientData) sourceElement);
		}
		View view = NotationHelper.findView(sourceElement);

		if (view != null) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(view);
			return new GMFModelElement(view, domain);
		}

		Activator.log.warn("The selected element cannot be resolved to a GMF View");
		return null;
	}

	@Override
	protected void updateModelElement(AbstractModelElement modelElement, Object newSourceElement) {
		if (modelElement instanceof GMFModelElement) {
			updateModelElement((GMFModelElement) modelElement, newSourceElement);
		} else if (modelElement instanceof GradientDataModelElement) {
			updateModelElement((GradientDataModelElement) modelElement, newSourceElement);
		}
	}

	void updateModelElement(GradientDataModelElement modelElement, Object newSourceElement) {
		if (newSourceElement instanceof ObservableGradientData) {
			ObservableGradientData ogd = (ObservableGradientData) newSourceElement;
			modelElement.sourceElement = ogd;
			modelElement.owner = ogd.getOwner();
		} else if (newSourceElement instanceof GradientData) {
			modelElement.sourceElement = (GradientData) newSourceElement;
			modelElement.owner = null;
		} else {
			throw new IllegalArgumentException("Cannot resolve GradientData selection: " + newSourceElement);
		}
	}

	void updateModelElement(GMFModelElement modelElement, Object newSourceElement) {
		View view = NotationHelper.findView(newSourceElement);
		if (view == null) {
			throw new IllegalArgumentException("Cannot resolve View selection: " + newSourceElement);
		}

		AbstractEMFModelElementFactory.updateEMFModelElement(modelElement, view);
	}
}
