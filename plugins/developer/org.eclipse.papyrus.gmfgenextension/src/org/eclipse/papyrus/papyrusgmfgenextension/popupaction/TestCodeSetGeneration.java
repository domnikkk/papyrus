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
public class TestCodeSetGeneration extends Action {

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
		out = out.append("\n*************************************************\nTopNode\n******************************************************\n");
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenTopLevelNode) {
				GenTopLevelNode genTopLevelNode = (GenTopLevelNode) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					String name = genTopLevelNode.getModelFacet().getMetaClass().getEcoreClass().getName();
					String visalId = "" + genTopLevelNode.getVisualID();
					out = out.append(
							"/**\n" +
									"* Test to manage " + name + ".\n" +
									"*/\n" +
									"@Test\n" +
									"public void testTo" + name + "() {\n" +
									"	testToManageNode(UMLElementTypes." + name + "_" + visalId + ", UMLPackage.eINSTANCE.get" + name + "(), UMLElementTypes." + name + "_" + visalId + ", false);\n" +
									"}\n"
							);
				}
			}
		}

		out = out.append("\n************************************************************************************************************************\n"
				+ "ChildNode\n"
				+ "************************************************************************************************************************\n");
		it = gmfgen.getAllContents();
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenChildNode && !(eObject instanceof GenChildLabelNode) && !(eObject instanceof GenChildSideAffixedNode)) {
				GenChildNode genTopLevelNode = (GenChildNode) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					String name = genTopLevelNode.getModelFacet().getMetaClass().getEcoreClass().getName();
					String visalId = "" + genTopLevelNode.getVisualID();
					out = out.append(
							"/**\n" +
									"* Test to manage " + name + ".\n" +
									"*/\n" +
									"@Test\n" +
									"public void testTo" + name + "() {\n" +
									"	testToManageNode(UMLElementTypes." + name + "_" + visalId + ", UMLPackage.eINSTANCE.get" + name + "(), container, true);\n" +

									"}\n"
							);
				}
			}
		}

		out = out.append("\n********************************************************************************************************************"
				+ "*\nChildLabelNode\n"
				+ "******************************************************************************************************************************\n");
		it = gmfgen.getAllContents();
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenChildLabelNode) {
				GenChildLabelNode genTopLevelNode = (GenChildLabelNode) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					String name = genTopLevelNode.getModelFacet().getMetaClass().getEcoreClass().getName();
					String visalId = "" + genTopLevelNode.getVisualID();
					out = out.append(
							"/**\n" +
									"* Test to manage " + name + ".\n" +
									"*/\n" +
									"@Test\n" +
									"public void testTo" + name + "() {\n" +
									"testToManageTopNodeWithMask(UMLElementTypes.Container,UMLElementTypes." + name + "_" + visalId + ", Compartment.VISUAL_ID,null);\n" +
									"}\n"
							);
				}
			}
		}

		out = out.append("\n**************************************************************************************************************\n"
				+ "AffixedNode\n"
				+ "*************************************************************************************************************************\n");
		it = gmfgen.getAllContents();
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenChildSideAffixedNode) {
				GenChildSideAffixedNode genTopLevelNode = (GenChildSideAffixedNode) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					String name = genTopLevelNode.getModelFacet().getMetaClass().getEcoreClass().getName();
					String visalId = "" + genTopLevelNode.getVisualID();
					out = out.append(
							"/**\n" +
									"* Test to manage " + name + ".\n" +
									"*/\n" +
									"@Test\n" +
									"public void testTo" + name + "() {\n" +
									"setTestAffixedNode(true);\n" +
									"	testToManageNode(UMLElementTypes." + name + "_" + visalId + ", UMLPackage.eINSTANCE.get" + name + "(), container, true);\n" +
									"setTestAffixedNode(false);\n" +
									"}\n"
							);

				}
			}
		}
		out = out.append("\n************************************************************************************************************\n"
				+ "Link\n"
				+ "*****************************************************************************************************************************\n");
		it = gmfgen.getAllContents();
		// topNode
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof GenLink) {
				GenLink genTopLevelNode = (GenLink) eObject;
				if (genTopLevelNode.getModelFacet() != null) {
					if (genTopLevelNode.getModelFacet() instanceof TypeLinkModelFacet) {
						String name = ((TypeLinkModelFacet) genTopLevelNode.getModelFacet()).getMetaClass().getEcoreClass().getName();
						String visalId = "" + genTopLevelNode.getVisualID();
						out = out.append(
								"/**\n" +
										"* Test to manage component.\n" +
										"*/\n" +
										"@Test\n" +
										"public void testTo" + name + "() {\n" +
										"testToManageLink(UMLElementTypes.source, UMLElementTypes.target, UMLElementTypes." + name + "_" + visalId + ", container, true);\n" +
										"}\n"
								);
					}
				}
			}
		}
		return out;
	}

}
