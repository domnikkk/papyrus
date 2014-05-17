package org.eclipse.papyrus.editor;

import org.eclipse.gef.ui.views.palette.PaletteView;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IEditorPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageChangedListener;
import org.eclipse.papyrus.infra.core.sasheditor.internal.ActivePageTracker.IActiveEditorChangedListener;
import org.eclipse.papyrus.infra.core.sasheditor.internal.PagePart;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

/**
 * Synchronizes the detached palette view with the contents provided by the active inner editor
 */
/* package */class PapyrusPaletteSynchronizer implements IActiveEditorChangedListener, IPageChangedListener {

	private final PapyrusMultiDiagramEditor myMultiDiagramEditor;

	private IEditorPart myLastActivePart;

	public PapyrusPaletteSynchronizer(PapyrusMultiDiagramEditor multiEditor) {
		myMultiDiagramEditor = multiEditor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.papyrus.infra.core.sasheditor.internal.ActivePageTracker.IActiveEditorChangedListener
	 * #activeEditorChanged(org.eclipse.papyrus.infra.core.sasheditor.internal.PagePart,
	 * org.eclipse.papyrus.infra.core.sasheditor.internal.PagePart)
	 */
	public void activeEditorChanged(PagePart oldEditor, PagePart newEditor) {
		synchronizePaletteView(newEditor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.papyrus.infra.core.sasheditor.editor.IPageChangedListener#pageChanged(org.eclipse
	 * .papyrus.infra.core.sasheditor.editor.IPage)
	 */
	public void pageChanged(IPage newPage) {
		synchronizePaletteView(newPage);
	}

	/**
	 * If {@link PaletteView} is available, synchronizes it with the content provided by active
	 * inner page
	 * 
	 * @param activePage
	 *            inner page to synchronize palette view with
	 */
	private void synchronizePaletteView(IPage activePage) {
		PaletteView paletteView = findPaletteView();
		if (paletteView == null) {
			return;
		}

		// IEditorPage is not granted, it may be, e.g ErrorComponentPart
		IEditorPart activePart = activePage instanceof IEditorPage ? ((IEditorPage) activePage).getIEditorPart() : null;
		if (activePart == myLastActivePart) {
			return;
		}
		
		if (activePart == null) {
			paletteView.partClosed(myLastActivePart);
		} else {
			// multi-editor may be activated outside of this code
			// and palette view may already remember its (now outdated) palette
			// sending partClosed will enforce palette view to request fresh version
			paletteView.partClosed(myMultiDiagramEditor);
			paletteView.partActivated(activePart);
		}
		myLastActivePart = activePart;
	}

	/**
	 * Called when host editor is disposed, cleans up
	 */
	public void dispose() {
		if (myLastActivePart == null) {
			// nothing to do
			return;
		}
		PaletteView paletteView = findPaletteView();
		if (paletteView == null) {
			return;
		}
		paletteView.partClosed(myLastActivePart);
	}

	/**
	 * Finds the {@link PaletteView} at the same page as the host multi-editor
	 * 
	 * @return palette view or <code>null</code> if not found
	 */
	private PaletteView findPaletteView() {
		IWorkbenchPage samePage = myMultiDiagramEditor.getSite().getPage();
		return (PaletteView) samePage.findView(PaletteView.ID);
	}

}
