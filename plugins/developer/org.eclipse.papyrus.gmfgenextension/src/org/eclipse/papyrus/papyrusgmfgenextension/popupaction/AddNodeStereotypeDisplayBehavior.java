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


package org.eclipse.papyrus.papyrusgmfgenextension.popupaction;

import java.util.Iterator;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.codegen.gmfgen.Behaviour;
import org.eclipse.gmf.codegen.gmfgen.CustomBehaviour;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes;
import org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment;
import org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IViewPart;

/**
 * this class is used to add a label to display applied stereotypes for external node
 */
public class AddNodeStereotypeDisplayBehavior extends Action {

	public static final String STEREOTYPE_LABEL_POLICY_KEY = "org.eclipse.papyrus.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY"; //$NON-NLS-1$

	public static final String STEREOTYPE_LABEL_POLICY_CLASS = "org.eclipse.papyrus.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy"; //$NON-NLS-1$


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
	public void run(IAction action) {

		// Parse selected GenLink(s) and add the desired CustomBehavior
		Iterator<EObject> it = getSelectedEObject().iterator();
		while(it.hasNext()) {
			EObject eObject = it.next();
			if(eObject instanceof GenNode) {
				//test if it has got a external node to display applied stereotype
				if(!hasCustomBehavior(((GenNode)eObject), STEREOTYPE_LABEL_POLICY_KEY)) {
					addCustomBehavior((GenNode)eObject, STEREOTYPE_LABEL_POLICY_KEY, STEREOTYPE_LABEL_POLICY_CLASS);
				}
			}
		}
	}





}
