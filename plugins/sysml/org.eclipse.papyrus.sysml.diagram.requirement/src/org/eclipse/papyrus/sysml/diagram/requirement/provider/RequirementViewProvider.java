/*****************************************************************************
 * Copyright (c) 2012 ATOS.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Olivier Mélois (ATOS) - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.papyrus.sysml.diagram.requirement.provider;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.EditPartService;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassAttributeCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassOperationCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.diagram.clazz.providers.UMLViewProvider;
import org.eclipse.papyrus.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.papyrus.preferences.utils.PreferenceConstantHelper;
import org.eclipse.papyrus.sysml.diagram.common.utils.SysMLGraphicalTypes;
import org.eclipse.papyrus.sysml.diagram.requirement.edit.part.RequirementDiagramEditPart;
import org.eclipse.papyrus.sysml.diagram.requirement.edit.part.RequirementInformationCompartmentEditPart;

public class RequirementViewProvider extends UMLViewProvider {

	protected boolean provides(CreateNodeViewOperation op) {

		// This provider is registered for Requirement Diagram only
		String diagramType = op.getContainerView().getDiagram().getType();
		if(!RequirementDiagramEditPart.DIAGRAM_ID.equals(diagramType)) {
			return false;
		}

		// This provider is registered for class only.
		IElementType elementType = (IElementType)op.getSemanticAdapter().getAdapter(IElementType.class);
		if((elementType == RequirementDiagramElementTypes.CLASS) || (elementType == RequirementDiagramElementTypes.CLASS_CN)) {
			return true;
		}

		// else : unknown element
		return false;

	}

	/**
	 * {@inheritDoc} Overridden to add an additional compartment.
	 */
	@Override
	public Node createClass_2008(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		//node.setType(UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		node.setType(SysMLGraphicalTypes.SHAPE_SYSML_REQUIREMENT_AS_CLASSIFER_ID);
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initForegroundFromPrefs(node, prefStore, "Class");
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Class");
		PreferenceInitializerForElementHelper.initBackgroundFromPrefs(node, prefStore, "Class");
		/*
		 * Addition of the compartment, and the labels it contains.
		 */
		Node compartment = createCompartment(node, SysMLGraphicalTypes.COMPARTMENT_SYSML_REQUIREMENT_IDINFO_AS_LIST_ID, true, true, true, true);
		createLabel(compartment, SysMLGraphicalTypes.LABEL_SYSML_REQUIREMENT_ID_ID);
		createLabel(compartment, SysMLGraphicalTypes.LABEL_SYSML_REQUIREMENT_TEXT_ID);
		/*
		 * Other compartments.
		 */
		createCompartment(node, UMLVisualIDRegistry.getType(ClassAttributeCompartmentEditPart.VISUAL_ID), true, true, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(ClassOperationCompartmentEditPart.VISUAL_ID), true, true, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(ClassNestedClassifierCompartmentEditPart.VISUAL_ID), true, true, true, true);

		initCompartmentsStatusFromPrefs(node, prefStore);
		return node;
	}

	/**
	 * Initializes the compartments visibility according to the preferences of the user.
	 * As there is no page for the Requirement object yet, this relies on the class' one.
	 */
	private static void initCompartmentsStatusFromPrefs(View view, final IPreferenceStore store) {
		EList<?> children = view.getPersistedChildren();
		if(children != null) {
			for(Object object : children) {

				// we look for the name of the compartment for this view
				EditPart dummyEP = EditPartService.getInstance().createGraphicEditPart((View)object);
				IGraphicalEditPart epp = (IGraphicalEditPart)dummyEP;
				IFigure fig1 = epp.getFigure();

				if(fig1 instanceof ResizableCompartmentFigure) {
					String compartmentName = ((ResizableCompartmentFigure)fig1).getCompartmentTitle();
					if(compartmentName != null) {
						String diagramKind = view.getDiagram().getType();
						String preferenceKey = PreferenceConstantHelper.getCompartmentElementConstant(diagramKind + "_" + "Class", compartmentName, PreferenceConstantHelper.COMPARTMENT_VISIBILITY); //$NON-NLS-1$
						boolean value = store.getBoolean(preferenceKey);

						//The info compartment has to be kept.
						if(!(epp instanceof RequirementInformationCompartmentEditPart)) {
							// the default value is true : nothing to
							if(!value) { 
								ENamedElement namedElement = PackageUtil.getElement("notation.View.visible"); //$NON-NLS-1$
								ViewUtil.setStructuralFeatureValue((View)object, (EStructuralFeature)namedElement, value);
							}
						}
						
						String compartmentNameVisibilityPreference = PreferenceConstantHelper.getCompartmentElementConstant(diagramKind + "_" + "Class", compartmentName, PreferenceConstantHelper.COMPARTMENT_NAME_VISIBILITY); //$NON-NLS-1$
						boolean showCompartmentName = store.getBoolean(compartmentNameVisibilityPreference);
						View childView = (View)object;
						TitleStyle style = (TitleStyle)childView.getStyle(NotationPackage.eINSTANCE.getTitleStyle());
						if(style != null) {
							style.setShowTitle(showCompartmentName);
						}
					}
				}
				dummyEP = null;
			}
		}
	}


}
