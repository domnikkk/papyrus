package org.eclipse.papyrus.example.diagram.simplediagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.eclipse.papyrus.example.diagram.simplediagram.edit.parts.ModelEditPart;
import org.eclipse.papyrus.example.diagram.simplediagram.edit.parts.UMLEditPartFactory;
import org.eclipse.papyrus.example.diagram.simplediagram.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class UMLEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public UMLEditPartProvider() {
		super(new UMLEditPartFactory(), UMLVisualIDRegistry.TYPED_INSTANCE,
				ModelEditPart.MODEL_ID);
	}

}
