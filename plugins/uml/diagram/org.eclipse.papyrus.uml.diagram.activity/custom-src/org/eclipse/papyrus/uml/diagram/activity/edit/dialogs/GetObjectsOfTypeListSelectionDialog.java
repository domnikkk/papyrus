package org.eclipse.papyrus.uml.diagram.activity.edit.dialogs;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.core.modelsetquery.ModelSetQuery;
import org.eclipse.papyrus.uml.diagram.activity.part.Messages;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * Extends {@link ElementListSelectionDialog} with ability to add all elements of given type using {@link ModelSetQuery}
 */
public class GetObjectsOfTypeListSelectionDialog extends ElementListSelectionDialog {

	private final HashSet<EObject> myElementsOfType = new HashSet<EObject>();

	private final EObject mySourceObject;

	private final boolean myNeedsNullObject;

	/**
	 * Constructs the dialog instance with default generic message and title.
	 * 
	 * @param renderer
	 *        label provider to render the element options
	 * @param sourceObject
	 *        fixed source object that will be used as an anchor for all type queries using {@link ModelSetQuery}
	 * @param needNullObject
	 *        if <code>true</code>, the dialog will include additional null element (shown as empty string)
	 */
	public GetObjectsOfTypeListSelectionDialog(Shell parent, ILabelProvider renderer, EObject sourceObject, boolean needNullObject) {
		super(parent, renderer);
		mySourceObject = sourceObject;
		myNeedsNullObject = needNullObject;

		setMessage(Messages.UMLModelingAssistantProviderMessage);
		setTitle(Messages.UMLModelingAssistantProviderTitle);
		setMultipleSelection(false);
	}

	/**
	 * Queries the {@link ModelSetQuery} for all elements of given type and adds them to the choices
	 */
	public void addElementsOfType(EClassifier ofType) {
		myElementsOfType.addAll(ModelSetQuery.getObjectsOfType(mySourceObject, ofType));
	}

	@Override
	public int open() {
		Object[] elements = myNeedsNullObject ? new Object[myElementsOfType.size() + 1] : new Object[myElementsOfType.size()];
		myElementsOfType.toArray(elements);
		if(myNeedsNullObject) {
			elements[elements.length - 1] = "";
		}
		setElements(elements);
		setInitialSelections(new Object[]{ mySourceObject });
		return super.open();
	}
}
