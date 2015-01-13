package org.eclipse.papyrus.example.diagram.simplediagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.eclipse.papyrus.example.diagram.simplediagram.providers.UMLElementTypes;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createUml1Group());
	}

	/**
	 * Creates "uml" palette tool group
	 * @generated
	 */
	private PaletteContainer createUml1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Uml1Group_title);
		paletteContainer.setId("createUml1Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(UMLDiagramEditorPlugin
				.findImageDescriptor("icons/obj16/Diagram_UML.gif")); //$NON-NLS-1$
		paletteContainer.setLargeIcon(UMLDiagramEditorPlugin
				.findImageDescriptor("icons/obj16/Diagram_UML.gif")); //$NON-NLS-1$
		paletteContainer.add(createComponent1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc,
				Collections.singletonList(UMLElementTypes.Component_2001));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UMLDiagramEditorPlugin
				.findImageDescriptor("icons/obj16/Component.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin
				.findImageDescriptor("icons/obj16/Component.gif")); //$NON-NLS-1$
		return entry;
	}

}
