package org.eclipse.papyrus.bpmn.diagram.common.factory;

import org.eclipse.papyrus.infra.gmfdiag.common.GmfEditorFactory;
import org.eclipse.papyrus.uml.diagram.activity.UmlActivityDiagramForMultiEditor;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityDiagramEditPart;

public class BpmnProcessDiagramFactory extends GmfEditorFactory {

	public BpmnProcessDiagramFactory() {
		super(UmlActivityDiagramForMultiEditor.class, ActivityDiagramEditPart.MODEL_ID);
	}

}
