/**
 *
 */
package org.eclipse.papyrus.infra.core.lifecycleevents;

import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;

/**
 * Event sent whith a Save or SaveAs.
 *
 * @author cedric dumoulin
 *
 */
public class DoSaveEvent {

	final protected ServicesRegistry serviceRegistry;

	final protected IMultiDiagramEditor multiDiagramEditor;

	final protected boolean isAutoSave;

	/**
	 * Create an Event that is sent with a Save or SaveAs. The same event can be
	 * reused. Constructor.
	 *
	 * @param serviceRegistry
	 * @param multiDiagramEditor
	 */
	public DoSaveEvent(ServicesRegistry serviceRegistry, IMultiDiagramEditor multiDiagramEditor) {
		this(serviceRegistry, multiDiagramEditor, false);
	}

	/**
	 * Create an Event that is sent with a Save or SaveAs. The same event can be
	 * reused. Constructor.
	 *
	 * @param serviceRegistry
	 * @param multiDiagramEditor
	 * @param isAutoSave
	 */
	public DoSaveEvent(ServicesRegistry serviceRegistry, IMultiDiagramEditor multiDiagramEditor, boolean isAutoSave) {
		this.serviceRegistry = serviceRegistry;
		this.multiDiagramEditor = multiDiagramEditor;
		this.isAutoSave = isAutoSave;
	}

	/**
	 * @return the serviceRegistry
	 */
	public ServicesRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	/**
	 * @return the multiDiagramEditor
	 */
	public IMultiDiagramEditor getMultiDiagramEditor() {
		return multiDiagramEditor;
	}

	public boolean isAutoSave() {
		return isAutoSave;
	}

}
