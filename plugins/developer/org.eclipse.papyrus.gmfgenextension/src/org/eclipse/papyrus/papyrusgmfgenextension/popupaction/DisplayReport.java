/*******************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are property of the CEA, their use is subject to specific agreement
 * with the CEA.
 *
 * Contributors:
 *    CEA LIST - initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.papyrusgmfgenextension.popupaction;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenChildSideAffixedNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewPart;

/**
 * Display the lis of nodes
 */
public class DisplayReport extends Action {

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

		Iterator<EObject> it = getSelectedEObject().iterator();
		while (it.hasNext()) {
			EObject eObject = it.next();

			// Action should not be available on objects that are not GenCommonBase
			if (eObject instanceof GenCommonBase) {
				GenCommonBase genCommonBase = (GenCommonBase) eObject;
				StringBuffer out = getTopNodes(genCommonBase.eResource());
				Shell shell = new Shell(Display.getCurrent());

				shell.setText("report");
				shell.setLayout(new FillLayout());
				Text text1 = new Text(shell, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
				text1.setText(out.toString());
				shell.pack();
				shell.open();

			}

		}
	}

	public StringBuffer getTopNodes(Resource gmfgen) {
		StringBuffer out = new StringBuffer();
		// Find the highest VisualID used by the chosen kind of node (given by clazz)
		Iterator<EObject> it = gmfgen.getAllContents();
		out = out.append("TopNode\n");
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenTopLevelNode) {
				GenTopLevelNode genTopLevelNode = (GenTopLevelNode) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					out = out.append(genTopLevelNode.getModelFacet().getMetaClass().getEcoreClass().getName() + " " + genTopLevelNode.getVisualID() + "\n");
				}
			}
		}

		out = out.append("\nChildNode\n");
		it = gmfgen.getAllContents();
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenChildNode) {
				GenChildNode genTopLevelNode = (GenChildNode) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					out = out.append(genTopLevelNode.getModelFacet().getMetaClass().getEcoreClass().getName() + " " + genTopLevelNode.getVisualID() + "\n");
				}
			}
		}

		out = out.append("\nChildLabelNode\n");
		it = gmfgen.getAllContents();
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenChildLabelNode) {
				GenChildLabelNode genTopLevelNode = (GenChildLabelNode) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					out = out.append(genTopLevelNode.getModelFacet().getMetaClass().getEcoreClass().getName() + " " + genTopLevelNode.getVisualID() + "\n");
				}
			}
		}

		out = out.append("\nAffixedNode\n");
		it = gmfgen.getAllContents();
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenChildSideAffixedNode) {
				GenChildSideAffixedNode genTopLevelNode = (GenChildSideAffixedNode) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					out = out.append(genTopLevelNode.getModelFacet().getMetaClass().getEcoreClass().getName() + " " + genTopLevelNode.getVisualID() + "\n");
				}
			}
		}
		out = out.append("\nLink\n");
		it = gmfgen.getAllContents();
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenLink) {
				GenLink genTopLevelNode = (GenLink) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					if (genTopLevelNode.getModelFacet() instanceof TypeLinkModelFacet) {
						out = out.append(((TypeLinkModelFacet) genTopLevelNode.getModelFacet()).getMetaClass().getEcoreClass().getName() + " " + genTopLevelNode.getVisualID() + "\n");
					}
				}
			}
		}
		return out;
	}

}
