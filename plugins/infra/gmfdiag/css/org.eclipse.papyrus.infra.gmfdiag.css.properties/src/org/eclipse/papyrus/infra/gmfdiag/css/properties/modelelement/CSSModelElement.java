/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Mickaël Adam (ALL4TEC) mickael.adam@all4tec.net - bug 429642
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.properties.modelelement;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.ExtendedCSSEngine;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.ModelCSSEngine;
import org.eclipse.papyrus.infra.gmfdiag.css.notation.CSSDiagram;
import org.eclipse.papyrus.infra.gmfdiag.css.notation.CSSStyles;
import org.eclipse.papyrus.infra.gmfdiag.css.properties.creation.StyleSheetFactory;
import org.eclipse.papyrus.infra.gmfdiag.css.properties.databinding.DiagramStyleSheetObservableList;
import org.eclipse.papyrus.infra.gmfdiag.css.properties.databinding.ModelStyleSheetObservableList;
import org.eclipse.papyrus.infra.gmfdiag.css.properties.provider.CSSStyleSheetContentProvider;
import org.eclipse.papyrus.infra.gmfdiag.css.properties.provider.CSSStyleSheetLabelProvider;
import org.eclipse.papyrus.infra.gmfdiag.css.provider.CSSClassContentProvider;
import org.eclipse.papyrus.infra.gmfdiag.css.resource.CSSNotationResource;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.ModelStyleSheets;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StylesheetsFactory;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StylesheetsPackage;
import org.eclipse.papyrus.infra.gmfdiag.properties.modelelement.CustomStyleModelElement;
import org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory;
import org.eclipse.papyrus.infra.widgets.creation.StringEditionFactory;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;

import com.google.common.base.Optional;


public class CSSModelElement extends CustomStyleModelElement {

	public CSSModelElement(View source, DataContextElement context) {
		super(source, context);
	}

	public CSSModelElement(View source, EditingDomain domain, DataContextElement element) {
		super(source, domain, element);
	}

	@Override
	public ReferenceValueFactory getValueFactory(String propertyPath) {
		if(CSSStyles.CSS_DIAGRAM_STYLESHEETS_KEY.equals(propertyPath)) {
			return new StyleSheetFactory((View)this.source);
		}
		if(CSSStyles.CSS_MODEL_STYLESHEETS_KEY.equals(propertyPath)) {
			return new StyleSheetFactory((View)this.source);
		}
		if(CSSStyles.CSS_GMF_CLASS_KEY.equals(propertyPath)) {
			StringEditionFactory factory = new StringEditionFactory();
			factory.setContentProvider(getContentProvider(propertyPath));
			return factory;
		}

		return super.getValueFactory(propertyPath);
	}

	@Override
	public IObservable doGetObservable(String propertyPath) {
		if(CSSStyles.CSS_DIAGRAM_STYLESHEETS_KEY.equals(propertyPath)) {
			return new DiagramStyleSheetObservableList((View)source, domain, propertyPath);
		}
		if(CSSStyles.CSS_MODEL_STYLESHEETS_KEY.equals(propertyPath)) {
			//Get the resource
			final Resource notationResource = source.eResource();
			//The model styleSheet
			ModelStyleSheets modelStyleSheetsSource = null;
			//Get the model styleSheet Object
			Object modelStyleSheetObject = EcoreUtil.getObjectByType(notationResource.getContents(), StylesheetsPackage.Literals.MODEL_STYLE_SHEETS);
			//If the model styleSheet exist
			if(modelStyleSheetObject instanceof ModelStyleSheets) {
				// set modelStyleSheetsSource
				modelStyleSheetsSource = (ModelStyleSheets)modelStyleSheetObject;
			} else {
				//or create a model styleSheet
				modelStyleSheetsSource = StylesheetsFactory.eINSTANCE.createModelStyleSheets();
				//Optional used to pass the modelStyleSheetsSource on runnable without final
				final Optional<ModelStyleSheets> modelStyleSheetsOnOptional = Optional.of(modelStyleSheetsSource);
				try {
					TransactionHelper.run(domain, new Runnable() {

						public void run() {
							//Add modelStylesheet to the resource without command
							notationResource.getContents().add(modelStyleSheetsOnOptional.get());
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
				//Initialize the adapter of the engine to listen model styleSheet
				ExtendedCSSEngine engine = ((CSSNotationResource)notationResource).getModelEngine();
				if(engine instanceof ModelCSSEngine) {
					((ModelCSSEngine)engine).initAdapter();
				}
			}
			return new ModelStyleSheetObservableList(notationResource, modelStyleSheetsSource.getStylesheets(), domain, modelStyleSheetsSource, StylesheetsPackage.Literals.MODEL_STYLE_SHEETS__STYLESHEETS);
		}
		return super.doGetObservable(propertyPath);
	}

	@Override
	public ILabelProvider getLabelProvider(String propertyPath) {
		if(CSSStyles.CSS_DIAGRAM_STYLESHEETS_KEY.equals(propertyPath)) {
			return new CSSStyleSheetLabelProvider();
		}
		if(CSSStyles.CSS_MODEL_STYLESHEETS_KEY.equals(propertyPath)) {
			return new CSSStyleSheetLabelProvider();
		}
		return super.getLabelProvider(propertyPath);
	}

	@Override
	public IStaticContentProvider getContentProvider(String propertyPath) {
		if(propertyPath.equals(CSSStyles.CSS_DIAGRAM_STYLESHEETS_KEY)) {
			return new CSSStyleSheetContentProvider(source);
		}
		if(propertyPath.equals(CSSStyles.CSS_MODEL_STYLESHEETS_KEY)) {
			return new CSSStyleSheetContentProvider(source);
		}
		if(propertyPath.equals(CSSStyles.CSS_GMF_CLASS_KEY)) {
			Diagram diagram = ((View)source).getDiagram();
			if(diagram instanceof CSSDiagram) {

				EObject semanticElement = ((View)source).getElement();

				if(semanticElement != null) {
					//TODO: For Diagrams, we should use the right DiagramKind (See GMFElementAdapter)
					//Until then, we list all available classes (*)
					String elementName = source instanceof Diagram ? "*" : semanticElement.eClass().getName();
					return new CSSClassContentProvider(elementName, ((CSSDiagram)diagram).getEngine());
				}
			}

			return null;
		}

		return null;
	}

}
