package org.eclipse.papyrus.robotml.diagram.common.factory;

import org.eclipse.papyrus.infra.gmfdiag.common.GmfEditorFactory;
import org.eclipse.papyrus.robotml.diagram.common.migration.RobotMLReconciler;
import org.eclipse.papyrus.uml.diagram.clazz.UmlClassDiagramForMultiEditor;


/**
 * This class is part of the migration of the RobotML diagrams, which,
 * since Papyrus 1.0 should be opened by the corresponding UML diagram editors,
 * in this particular case, {@link UmlClassDiagramForMultiEditor}
 * <p/>
 * This class registers the corresponding UML editor to the robot-ML type and allows the migration framework to proceed.
 * <p/>
 * The other component of the process is {@link RobotMLReconciler} which actually performs migration.
 */
public class RobotMLDatatype2ClassDiagramFactory extends GmfEditorFactory {

	public static final String OLD_ROBOT_ML_TYPE = "DatatypeDef";

	public RobotMLDatatype2ClassDiagramFactory() {
		super(UmlClassDiagramForMultiEditor.class, OLD_ROBOT_ML_TYPE);
	}

}
