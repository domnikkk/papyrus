/*****************************************************************************
 * Copyright (c) 2009, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.papyrusgmfgenextension.popupaction;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenParsers;
import org.eclipse.gmf.codegen.gmfgen.PredefinedParser;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IViewPart;

/**
 * this class is used to add a label to display name from external node
 */
public class AddExternalNodeFloatingLabelDisplayBehavior extends Action {

	public static final String FIGURE_VIEWMAP_PATH = "org.eclipse.papyrus.infra.gmfdiag.common.figure.node.PapyrusWrappingLabel";//"org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel"; //$NON-NLS-1$

	public static final String LABEL_POLICY_CLASS = "org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.ExternalLabelPrimaryDragRoleEditPolicy"; //$NON-NLS-1$

	public static final String LABEL_POLICY_KEY = "org.eclipse.gef.EditPolicy.PRIMARY_DRAG_ROLE"; //$NON-NLS-1$

	public static final String DEFAULT_GETTER_NAME = "getFloatingNameLabel"; //$NON-NLS-1$

	public static final String DEFAULT_EDITPART_NAME_SUFFIX = "FloatingLabelEditPart"; //$NON-NLS-1$

	public static final String DEFAULT_EDITPOLICY_NAME_SUFFIX = "FloatingLabelItemSemanticEditPolicy"; //$NON-NLS-1$

	//	public static final String DEFAULT_WRAPPING_LABEL_CLASS = "org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel"; //$NON-NLS-1$

	public static final String DEFAULT_PARSER_PATTERN = ""; //$NON-NLS-1$

	public static final String GEN_CLASS_RT_CLASS = "Node"; //$NON-NLS-1$

	public static final String GEN_CLASS_FACET_META_FEATURE = "NamedElement"; //$NON-NLS-1$

	public static final String GEN_FEATURE_FACET_META_FEATURE = "name"; //$NON-NLS-1$

	public static final String URI_NOTATION_GENMODEL = "org.eclipse.gmf.runtime.notation/model/notation.genmodel"; //$NON-NLS-1$

	public static final String URI_UML_GENMODEL = "org.eclipse.uml2.uml/model/UML.genmodel"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
	 */
	public void init(IViewPart view) {
		// NO OP
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		// Parse selected GenLink(s) and add the desired CustomBehavior
		Iterator<EObject> it = getSelectedEObject().iterator();
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenNode) {
				// test if it has got a external node to display floating name
				if (!hasAnFloatingNameExternalNode((GenNode) eObject)) {
					createAnFloatingNameExternalNode((GenNode) eObject);
				}
			}
		}
	}

	/**
	 * creation an external node floating name
	 *
	 * @param genNode
	 *            the parent genNode
	 */
	private void createAnFloatingNameExternalNode(GenNode genNode) {
		// Create une external node label
		GenExternalNodeLabel label = GMFGenFactory.eINSTANCE.createGenExternalNodeLabel();

		// Set Name of the edit part
		// label.setEditPartClassName(genNode.getClassNamePrefix() + DEFAULT_EDITPART_NAME_SUFFIX);

		String editPartClassName = genNode.getEditPartClassName();
		int index = editPartClassName.indexOf("EditPart");
		String name = editPartClassName.substring(0, index) + DEFAULT_EDITPART_NAME_SUFFIX + editPartClassName.substring(index + "EditPart".length());
		label.setEditPartClassName(name);
		// Set item semantic edit policy
		label.setItemSemanticEditPolicyClassName(genNode.getClassNamePrefix() + DEFAULT_EDITPOLICY_NAME_SUFFIX);
		// Set the Read only
		label.setReadOnly(false);

		// Set GenLinkLabel VisualID with new unique ID
		int visualID = SetVisualIDWithUnusedValue.getNewVisualID(genNode.eResource(), GenLinkLabel.class);
		label.setVisualID(visualID);

		// Retrieve DiagramRunTimeClass in notation.genmodel (Node -> View)
		URI uri_notation = URI.createPlatformPluginURI(URI_NOTATION_GENMODEL, false);
		Resource notation = genNode.eResource().getResourceSet().getResource(uri_notation, true);
		label.setDiagramRunTimeClass(findGenClass(notation, GEN_CLASS_RT_CLASS));

		// Create Viewmap
		FigureViewmap viewmap = GMFGenFactory.eINSTANCE.createFigureViewmap();
		viewmap.setFigureQualifiedClassName(FIGURE_VIEWMAP_PATH);

		// Create FeatureLabelModelFacet
		FeatureLabelModelFacet facet = GMFGenFactory.eINSTANCE.createFeatureLabelModelFacet();
		facet.setEditPattern(DEFAULT_PARSER_PATTERN);
		facet.setEditorPattern(DEFAULT_PARSER_PATTERN);
		facet.setViewPattern(DEFAULT_PARSER_PATTERN);

		// Select NamedElement::name property in UML.genmodel for MetaFeatures
		URI uri_uml = URI.createPlatformPluginURI(URI_UML_GENMODEL, false);
		Resource uml = genNode.eResource().getResourceSet().getResource(uri_uml, true);
		facet.getMetaFeatures().add(findGenFeature(uml, GEN_CLASS_FACET_META_FEATURE, GEN_FEATURE_FACET_META_FEATURE));
		// Attach Predefined Parser MessageFormatParser
		// not good must find the predifined parser of the model...

		// Get the predefined parser.
		PredefinedParser parser = getPredefinedParser(genNode);
		facet.setParser(parser);

		// Attach created element one to another in the model
		label.setViewmap(viewmap);
		label.setModelFacet(facet);

		// Add custom Policy to have feedback
		// addCustomBehavior(label, LABEL_POLICY_KEY, LABEL_POLICY_CLASS);

		// edit policy which permit to take into account of specific locator of external label
		addCustomBehavior(genNode, "org.eclipse.gef.EditPolicy.LAYOUT_ROLE", "org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.GetChildLayoutEditPolicy");

		genNode.getLabels().add(label);
	}

	/**
	 * Gets the predefined parser.
	 *
	 * @param eObject
	 *            the e object
	 * @return the predefined parser
	 */
	private PredefinedParser getPredefinedParser(GenNode eObject) {
		PredefinedParser parser = null;
		// /get the ressource contents
		EList<EObject> ressourceContents = eObject.eResource().getContents();
		for (EObject ressourceContent : ressourceContents) {
			// get the Gen Editor Node
			if (ressourceContent instanceof GenEditorGenerator) {
				// Get Parsers node
				GenParsers genParsers = ((GenEditorGenerator) ressourceContent).getLabelParsers();
				for (EObject GenParsersContent : genParsers.eContents()) {
					// Get the predefined parser
					if (GenParsersContent instanceof PredefinedParser) {
						parser = (PredefinedParser) GenParsersContent;
					}
				}
			}
		}
		return parser;
	}

	/**
	 * Checks for a floating name external node.
	 *
	 * @param node
	 *            the node
	 * @return true, if successful
	 */
	public boolean hasAnFloatingNameExternalNode(GenNode node) {
		Iterator<GenNodeLabel> iterator = node.getLabels().iterator();
		while (iterator.hasNext()) {
			GenNodeLabel currentGenNodeLabel = iterator.next();
			// check each child node
			if (currentGenNodeLabel instanceof GenExternalNodeLabel) {
				if (isAnFloatingNameExternalNode((GenExternalNodeLabel) currentGenNodeLabel)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Checks if is an floating name external node.
	 *
	 * @param node
	 *            the node
	 * @return true, if is an floating name external node
	 */
	public boolean isAnFloatingNameExternalNode(GenExternalNodeLabel node) {
		// Look if the edit part name contains the default edit part name suffix
		if (node.getEditPartClassName().contains(DEFAULT_EDITPART_NAME_SUFFIX)) {
			return true;
		} else {
			return false;
		}
	}
}
