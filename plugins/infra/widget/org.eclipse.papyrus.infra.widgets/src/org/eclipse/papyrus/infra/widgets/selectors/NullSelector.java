package org.eclipse.papyrus.infra.widgets.selectors;

import org.eclipse.papyrus.infra.widgets.editors.IElementSelectionListener;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.swt.widgets.Composite;

/**
 * A Null implementation of the IElementSelector interface
 *
 * @author Camille Letavernier
 *
 */
public class NullSelector implements IElementSelector {

	private NullSelector() {

	}

	@Override
	public Object[] getSelectedElements() {
		return new Object[0];
	}

	@Override
	public void setSelectedElements(Object[] elements) {
		// Nothing
	}

	@Override
	public Object[] getAllElements() {
		return new Object[0];
	}

	@Override
	public void createControls(Composite parent) {
		// Nothing
	}

	@Override
	public void newObjectCreated(Object newObject) {
		// Nothing
	}

	@Override
	public void clearTemporaryElements() {
		// Nothing
	}

	@Override
	public void addElementSelectionListener(IElementSelectionListener listener) {
		// Nothing
	}

	@Override
	public void removeElementSelectionListener(IElementSelectionListener listener) {
		// Nothing
	}

	public final static NullSelector instance = new NullSelector();

}
