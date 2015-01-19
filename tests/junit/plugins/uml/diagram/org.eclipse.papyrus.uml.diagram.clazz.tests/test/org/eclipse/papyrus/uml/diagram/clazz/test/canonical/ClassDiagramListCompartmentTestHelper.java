package org.eclipse.papyrus.uml.diagram.clazz.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DefaultNamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.common.part.UmlGmfDiagramEditor;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestListCompartmentHelper;

public class ClassDiagramListCompartmentTestHelper extends TestListCompartmentHelper {

	/**
	 * Constructor.
	 *
	 * @param diagramEditPart
	 * @param diagramEditor
	 */
	public ClassDiagramListCompartmentTestHelper(DiagramEditPart diagramEditPart, UmlGmfDiagramEditor diagramEditor) {
		super(diagramEditPart, diagramEditor);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.ListCompartmentTestHelper#getDefaultNamedElementVisualId()
	 *
	 * @return
	 */
	@Override
	protected int getDefaultNamedElementVisualId() {
		return DefaultNamedElementEditPart.VISUAL_ID;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.ListCompartmentTestHelper#getElementType(int)
	 *
	 * @param childVID
	 * @return
	 */
	@Override
	protected IElementType getElementType(int childVID) {
		return UMLElementTypes.getElementType(childVID);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.ListCompartmentTestHelper#getVisualID(org.eclipse.gmf.runtime.notation.View)
	 *
	 * @param view
	 * @return
	 */
	@Override
	protected int getVisualID(View view) {
		return UMLVisualIDRegistry.getVisualID(view);
	}

}