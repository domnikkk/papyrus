/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file has been generated automatically in the Papyrus Test Framework.
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.timing.test.createFromPalette;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.timing.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.tests.CreateLinkOwnedBySourceFromPaletteTest;
import org.eclipse.papyrus.uml.diagram.timing.CreateTimingDiagramCommand;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.timing.test.ITimingDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionEditPartTN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationObservationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GeneralOrderingEditPart;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestTimingDiagramLinkOwnedBySourceGen.
 */
public class TestTimingDiagramLinkOwnedBySourceGen extends CreateLinkOwnedBySourceFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateTimingDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return ITimingDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ITimingDiagramTestsConstants.FILE_NAME;
	}

	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
