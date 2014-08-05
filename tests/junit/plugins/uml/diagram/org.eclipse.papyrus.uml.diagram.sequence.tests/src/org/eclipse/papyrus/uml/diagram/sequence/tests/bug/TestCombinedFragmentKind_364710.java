/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.tests.bug;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CombinedFragmentCombinedFragmentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CombinedFragmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CustomConsiderIgnoreFragmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CustomContinuationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionOperandEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.sequence.tests.ISequenceDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.sequence.tests.canonical.CreateSequenceDiagramCommand;
import org.eclipse.papyrus.uml.diagram.sequence.tests.canonical.TestTopNode;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Continuation;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * Currently, combined fragment kind can be changed only if the combined fragment
 * has a unique operand. Kind modification should be allowed in the case of a
 * combined fragment owing more than one operand when the modification is
 * compatible with the number of operands. For instance, the change of seq kind to
 * alt kind should be allowed.
 *
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=364710
 *
 */
public class TestCombinedFragmentKind_364710 extends TestTopNode {

	private static final String CHANGE_OPERATOR_KIND = "Change Operator Kind: ";

	private static final String CHANGE_CONTINUATION_SETTING = "Change Continuation Setting: ";

	private static final String COPY_TO_IMAGE = "Copy To Image: ";

	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateSequenceDiagramCommand();
	}

	@Override
	protected String getProjectName() {
		return ISequenceDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ISequenceDiagramTestsConstants.FILE_NAME;
	}

	@Test
	public void testConsiderIgnoreFragment() {
		createNode(UMLElementTypes.ConsiderIgnoreFragment_3007, getRootEditPart(), new Point(10, 80), new Dimension(100, 100));
		CustomConsiderIgnoreFragmentEditPart cep = (CustomConsiderIgnoreFragmentEditPart)getRootEditPart().getChildren().get(0);
		final CombinedFragmentCombinedFragmentCompartmentEditPart cfp = (CombinedFragmentCombinedFragmentCompartmentEditPart)cep.getChildren().get(0);

		// add operand
		createNode(UMLElementTypes.InteractionOperand_3005, cfp, new Point(30, 100), new Dimension(100, 100));
		assertTrue(CREATION + TEST_THE_EXECUTION, cfp.getChildren().size() == 2);

		CombinedFragment cf = (CombinedFragment)cep.resolveSemanticElement();
		InteractionOperatorKind[] list = { InteractionOperatorKind.IGNORE_LITERAL, InteractionOperatorKind.CONSIDER_LITERAL };
		for(int i = 0; i < list.length; i++) {
			changeOperatorKind(cep, cf, list[i]);
			assertTrue(CHANGE_OPERATOR_KIND + TEST_THE_EXECUTION, cf.getInteractionOperator() == list[i]);
		}
	}

	@Test
	public void testCombinedFragment() {
		createNode(UMLElementTypes.CombinedFragment_3004, getRootEditPart(), new Point(10, 80), new Dimension(100, 100));
		CombinedFragmentEditPart cep = (CombinedFragmentEditPart)getRootEditPart().getChildren().get(0);
		final CombinedFragmentCombinedFragmentCompartmentEditPart cfp = (CombinedFragmentCombinedFragmentCompartmentEditPart)cep.getChildren().get(0);

		// add operand
		createNode(UMLElementTypes.InteractionOperand_3005, cfp, new Point(30, 100), new Dimension(100, 100));
		assertTrue(CREATION + TEST_THE_EXECUTION, cfp.getChildren().size() == 2);

		CombinedFragment cf = (CombinedFragment)cep.resolveSemanticElement();
		InteractionOperatorKind[] list = { InteractionOperatorKind.ALT_LITERAL, InteractionOperatorKind.PAR_LITERAL, InteractionOperatorKind.STRICT_LITERAL, InteractionOperatorKind.CRITICAL_LITERAL, InteractionOperatorKind.ASSERT_LITERAL, InteractionOperatorKind.SEQ_LITERAL };
		for(int i = 0; i < list.length; i++) {
			changeOperatorKind(cep, cf, list[i]);
		}
	}

	@Test
	public void testCombinedFragmentContinuation() throws CoreException {
		createNode(UMLElementTypes.CombinedFragment_3004, getRootEditPart(), new Point(10, 80), new Dimension(100, 100));
		CombinedFragmentEditPart cep = (CombinedFragmentEditPart)getRootEditPart().getChildren().get(0);
		final CombinedFragmentCombinedFragmentCompartmentEditPart cfp = (CombinedFragmentCombinedFragmentCompartmentEditPart)cep.getChildren().get(0);

		CombinedFragment cf = (CombinedFragment)cep.resolveSemanticElement();
		changeOperatorKind(cep, cf, InteractionOperatorKind.ALT_LITERAL);
		
		// add continuation
		InteractionOperandEditPart op = (InteractionOperandEditPart)cfp.getChildren().get(0);
		createNode(UMLElementTypes.Continuation_3016, op, new Point(1, 1), new Dimension(20, 60));
		assertTrue(CREATION + TEST_THE_EXECUTION, op.getChildren().size() == 2);
		CustomContinuationEditPart ccep = (CustomContinuationEditPart)op.getChildren().get(1);
		Continuation continuation = (Continuation) ccep.resolveSemanticElement();
		changeContinuationSetting(ccep, continuation, false);

		// export to image
		CopyToImageUtil copyToImageUtil = new CopyToImageUtil();
		IPath path = project.getFile(getFileName() + '.' + ImageFileFormat.PNG.getName()).getRawLocation();
		copyToImageUtil.copyToImage(getDiagramEditPart(), path, ImageFileFormat.PNG, new NullProgressMonitor());
		assertTrue(COPY_TO_IMAGE + TEST_THE_EXECUTION, path.toFile().exists());
	}

	protected void changeOperatorKind(CombinedFragmentEditPart p, CombinedFragment cf, InteractionOperatorKind kind) {
		EAttribute feature = UMLPackage.eINSTANCE.getCombinedFragment_InteractionOperator();
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(cf);
		SetRequest request = new SetRequest(p.getEditingDomain(), cf, feature, kind);
		ICommand createGMFCommand = provider.getEditCommand(request);
		org.eclipse.emf.common.command.AbstractCommand emfCommand = new GMFtoEMFCommandWrapper(createGMFCommand);
		assertTrue(CHANGE_OPERATOR_KIND + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, emfCommand.canExecute() == true);
		getEMFCommandStack().execute(emfCommand);
		waitForComplete();
		assertTrue(CHANGE_OPERATOR_KIND + TEST_THE_EXECUTION, cf.getInteractionOperator() == kind);
	}

	protected void changeContinuationSetting(CustomContinuationEditPart p, Continuation cf, Boolean isSetting) {
		EAttribute feature = UMLPackage.eINSTANCE.getContinuation_Setting();
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(cf);
		SetRequest request = new SetRequest(p.getEditingDomain(), cf, feature, isSetting);
		ICommand createGMFCommand = provider.getEditCommand(request);
		org.eclipse.emf.common.command.AbstractCommand emfCommand = new GMFtoEMFCommandWrapper(createGMFCommand);
		assertTrue(CHANGE_CONTINUATION_SETTING + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, emfCommand.canExecute() == true);
		getEMFCommandStack().execute(emfCommand);
		waitForComplete();
		assertTrue(CHANGE_CONTINUATION_SETTING + TEST_THE_EXECUTION, cf.isSetting() == isSetting);
	}

	public void createNode(IElementType type, EditPart parentPart, Point location, Dimension size) {
		//CREATION
		CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, getRootEditPart().getDiagramPreferencesHint());
		requestcreation.setLocation(location);
		requestcreation.setSize(size);
		Command command = parentPart.getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true);

		getDiagramCommandStack().execute(command);
	}
}
