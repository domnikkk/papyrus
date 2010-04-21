package org.eclipse.papyrus.modelexplorer;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmt.modisco.infra.browser.uicore.CustomizableModelLabelProvider;
import org.eclipse.papyrus.core.editorsfactory.IPageIconsRegistry;
import org.eclipse.papyrus.core.editorsfactory.PageIconsRegistry;
import org.eclipse.papyrus.core.services.ServiceException;
import org.eclipse.papyrus.core.utils.EditorUtils;
import org.eclipse.swt.graphics.Image;

/**
 * the label provider that inherits of modisco label provider
 * 
 */
public class MoDiscoLabelProvider extends CustomizableModelLabelProvider {
	private IPageIconsRegistry editorRegistry;

	public MoDiscoLabelProvider() {
		super(Activator.getDefault().getCustomizationManager());
	}

	// A virer
	public Image getImage(Object element) {
		if (element instanceof Diagram) {
			return getEditorRegistry().getEditorIcon(element);
		}
		return super.getImage(element);
	}

	/**
	 * Get the EditorRegistry used to create editor instances. This default
	 * implementation return the singleton eINSTANCE. This method can be
	 * subclassed to return another registry.
	 * 
	 * @return the singleton eINSTANCE of editor registry
	 * @throws ServiceException
	 */
	protected IPageIconsRegistry getEditorRegistry() {
		if (editorRegistry == null) {
			editorRegistry = createEditorRegistry();
		}
		return editorRegistry;
	}

	/**
	 * Return the EditorRegistry for nested editor descriptors. Subclass should
	 * implements this method in order to return the registry associated to the
	 * extension point namespace.
	 * 
	 * @return the EditorRegistry for nested editor descriptors
	 * @throws ServiceException
	 */
	protected IPageIconsRegistry createEditorRegistry() {
		try {
			return EditorUtils.getServiceRegistry().getService(
					IPageIconsRegistry.class);
		} catch (ServiceException e) {
			// Not found, return an empty one which return null for each
			// request.
			return new PageIconsRegistry();
		}
	}

	public String getText(Object element) {
		String text = null;

		if (element instanceof Diagram) {
			Diagram diagram = (Diagram) element;
			text = diagram.getName();
		} else {
			text = super.getText(element);
		}

		return text;
	}
}
