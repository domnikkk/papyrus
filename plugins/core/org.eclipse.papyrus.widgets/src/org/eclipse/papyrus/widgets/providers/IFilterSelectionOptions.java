package org.eclipse.papyrus.widgets.providers;

/**
 * This interface allows to control if a filter specified for the model explorer
 * should be used in selection dialogs based on the model explorer
 * 
 * @author mvelten
 *
 */
public interface IFilterSelectionOptions {
	public static boolean USE_IN_SELECTION_DEFAULT = true;
	public static boolean FORCE_USE_IN_SELECTION_DEFAULT = false;

	/**
	 * If the filter is activated in the model explorer and this method return true
	 * the filter will be used in selection dialogs, otherwise it will be ignored
	 * 
	 * @return
	 */
	public boolean useInSelection();

	/**
	 * if this method return true the filter will be used in selection dialogs
	 *  regardless of if it is activated in the model explorer
	 * 
	 * @return
	 */
	public boolean forceUseInSelection();
}
