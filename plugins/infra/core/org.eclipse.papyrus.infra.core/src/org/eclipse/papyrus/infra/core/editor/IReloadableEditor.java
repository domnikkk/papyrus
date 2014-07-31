/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.core.editor;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.infra.core.editor.reload.IEditorReloadListener;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;


/**
 * An {@linkplain IAdaptable adapter protocol} for editors that know how to internally
 * reload themselves without disturbing the workbench window's perspective layout.
 */
public interface IReloadableEditor {

	/**
	 * Reloads me in-place in the perspective layout.
	 * 
	 * @param triggeringResources
	 *        the resources that have changed in some way, triggering re-load
	 * @param reason
	 *        the reason why the re-load is being requested
	 * @param dirtyPolicy
	 *        how the client would like to handle the case of a dirty editor
	 * 
	 * @throws CoreException
	 *         on any failure to unload, reload, or whatever
	 */
	void reloadEditor(Collection<? extends Resource> triggeringResources, ReloadReason reason, DirtyPolicy dirtyPolicy) throws CoreException;

	void addEditorReloadListener(IEditorReloadListener listener);

	void removeEditorReloadListener(IEditorReloadListener listener);

	/**
	 * An enumeration of the reason why some resources that an editor has loaded are triggering a re-load (or close).
	 */
	enum ReloadReason {
		/** Resources have changed in persistent storage. */
		RESOURCES_CHANGED,
		/** Resources have been deleted from persistent storage. */
		RESOURCES_DELETED;

		/**
		 * Queries whether, under ordinary circumstances, the editor should attempt to re-load to pick up changes in its dependent resources.
		 * 
		 * @param triggeringResources
		 *        the resources triggering re-load (or close)
		 * 
		 * @return whether the editor should re-load
		 */
		public boolean shouldReload(Collection<? extends Resource> triggeringResources) {
			return this != RESOURCES_DELETED;
		}
	}

	/**
	 * An enumeration of policies that clients may request to govern what to do with the editor before re-load (or close) if it should happen to be
	 * dirty. Note that editors are free to honour the requested policy or not, according to their needs.
	 */
	enum DirtyPolicy {
		/**
		 * Save the editor without prompting.
		 */
		SAVE,
		/**
		 * Do not save the editor; just discard pending changes and re-load (or close).
		 */
		DO_NOT_SAVE,
		/**
		 * Do not re-load (or close) the editor; just keep pending changes and deal with conflicts later.
		 */
		IGNORE,
		/**
		 * Prompt the user to inquire whether to save, discard pending changes, or not re-load (or close) at all.
		 * Note that the user prompt must always result in one of the other policies being actually applied.
		 */
		PROMPT_TO_SAVE
		{

			@Override
			public DirtyPolicy resolve(IEditorPart editor, final Collection<? extends Resource> triggeringResources, final ReloadReason reason) throws CoreException {
				final boolean dirty = editor.isDirty();

				if(!dirty) {
					if(reason.shouldReload(triggeringResources)) {
						// Just re-load it. Simple
						return DO_NOT_SAVE;
					} else if(isPrincipalResourceAffected(editor, triggeringResources)) {
						// Just close it. Also simple
						return DO_NOT_SAVE;
					}
				}

				final String editorName = getEditorName(editor);

				final boolean allReadOnly = allReadOnly(triggeringResources);
				final String promptTitle;
				final String promptIntro;
				final String saveOption;
				final String dontSaveOption;
				final String ignoreOption = "Ignore";

				switch(reason) {
				case RESOURCES_DELETED:
					promptTitle = "Resources Deleted";
					promptIntro = NLS.bind("Some resources used by \"{0}\" have been deleted.", editorName);
					saveOption = "Save and Close";
					dontSaveOption = "Close Editor";
					break;
				default:
					promptTitle = "Resources Changed";
					promptIntro = NLS.bind("Some resources used by \"{0}\" have changed.", editorName);
					saveOption = "Save and Re-open";
					dontSaveOption = "Re-open Editor";
					break;
				}

				Callable<DirtyPolicy> result;

				if(allReadOnly) {
					//Only read-only models have changed. We (most likely) won't save them within this current editor. As they are already loaded, we can just continue.
					result = new Callable<DirtyPolicy>() {

						@Override
						public DirtyPolicy call() {
							Shell parentShell = Display.getCurrent().getActiveShell();

							final String message;
							final String[] options;
							if(dirty) {
								message = promptIntro + " Note: all these resources are loaded in read-only mode and won't be overridden if you choose to save. Unsaved changes will be lost.";
								options = new String[]{ saveOption, dontSaveOption, ignoreOption };
							} else {
								message = promptIntro;
								options = new String[]{ dontSaveOption, ignoreOption };
							}

							final MessageDialog dialog = new MessageDialog(parentShell, promptTitle, null, message, MessageDialog.WARNING, options, 0) {

								protected void setShellStyle(int newShellStyle) {
									super.setShellStyle(newShellStyle | SWT.SHEET);
								}
							};
							final int answer = dialog.open();

							DirtyPolicy result;

							if(answer == SWT.DEFAULT) {
								// User hit Esc or dismissed the dialog with the window manager button. Ignore
								result = IGNORE;
							} else if(dirty) {
								result = values()[answer];
							} else {
								result = values()[answer + 1]; // Account for the missing "Save and Xxx" option
							}

							return result;
						}
					};
				} else {
					//At least one read-write resource has changed. Potential conflicts.
					result = new Callable<DirtyPolicy>() {

						@Override
						public DirtyPolicy call() {
							DirtyPolicy result = IGNORE;

							final Shell parentShell = Display.getCurrent().getActiveShell();
							final String action = reason.shouldReload(triggeringResources) ? "re-open" : "close";
							final String message;

							if(dirty) {
								message = promptIntro + NLS.bind(" Do you wish to {0} the current editor? Unsaved changes will be lost.", action);
							} else {
								message = promptIntro + NLS.bind(" Do you wish to {0} the current editor?", action);
							}

							final String[] options = { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL };
							final MessageDialog dialog = new MessageDialog(parentShell, promptTitle, null, message, MessageDialog.WARNING, options, 0) {

								protected void setShellStyle(int newShellStyle) {
									super.setShellStyle(newShellStyle | SWT.SHEET);
								}
							};
							if(dialog.open() == 0) {
								result = DO_NOT_SAVE;
							}

							return result;
						}
					};
				}

				try {
					return UIUtil.syncCall(result).get();
				} catch (ExecutionException e) {
					throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to determine dirty policy for editor re-load.", e));
				} catch (InterruptedException e) {
					throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Interrupted in determining dirty policy for editor re-load.", e));
				}
			}
		};

		/**
		 * Queries the default dirty policy currently in effect. The default-default is {@link #PROMPT_TO_SAVE}.
		 * 
		 * @return the default policy
		 */
		public static DirtyPolicy getDefault() {
			return PROMPT_TO_SAVE;
		}

		/**
		 * Resolves me to a specific actionable policy, based on the resources that are triggering re-load (or close) and the reason.
		 * 
		 * @param editor
		 *        the editor to be re-loaded
		 * @param triggeringResources
		 *        the resources (possibly an empty collection) that have changed
		 * @param reloadReason
		 *        the reason why re-load (or close) is triggered
		 * 
		 * @return the specific policy to implement in re-loading the editor
		 * 
		 * @throws CoreException
		 *         on failure to resolve the specific policy
		 */
		public DirtyPolicy resolve(IEditorPart editor, Collection<? extends Resource> triggeringResources, ReloadReason reason) throws CoreException {
			return this;
		}

		String getEditorName(IEditorPart editor) {
			ModelSet modelSet = getModelSet(editor);
			return (modelSet == null) ? editor.getTitle() : modelSet.getURIWithoutExtension().lastSegment();
		}

		private ModelSet getModelSet(IEditorPart editor) {
			ModelSet result = null;

			if(editor instanceof IMultiDiagramEditor) {
				try {
					result = ((IMultiDiagramEditor)editor).getServicesRegistry().getService(ModelSet.class);
				} catch (ServiceException e) {
					// No problem.  We have a fall-back
					Activator.log.error(e);
				}
			}

			return result;
		}

		boolean isPrincipalResourceAffected(IEditorPart editor, Collection<? extends Resource> triggeringResources) {
			boolean result = false;

			ModelSet modelSet = getModelSet(editor);
			if(modelSet != null) {
				URI principalURI = modelSet.getURIWithoutExtension();
				for(Resource next : triggeringResources) {
					if(next.getURI().trimFileExtension().equals(principalURI)) {
						result = true;
						break;
					}
				}
			} else {
				URI principalURI = getURI(editor.getEditorInput());
				if(principalURI != null) {
					for(Resource next : triggeringResources) {
						if(next.getURI().equals(principalURI)) {
							result = true;
							break;
						}
					}
				}
			}

			return result;
		}

		private URI getURI(IEditorInput input) {
			URI result = null;

			if(input instanceof URIEditorInput) {
				result = ((URIEditorInput)input).getURI();
			} else if(input instanceof IURIEditorInput) {
				result = URI.createURI(((IURIEditorInput)input).getURI().toString());
			}

			return result;
		}

		protected boolean allReadOnly(Collection<? extends Resource> resources) {
			for(Resource resource : resources) {
				EditingDomain domain = TransactionUtil.getEditingDomain(resource);
				if((domain == null) || !domain.isReadOnly(resource)) {
					return false;
				}
			}

			return true;
		}
	}

	/**
	 * A convenience adapter for editors that don't actually know how to reload themselves in place.
	 * It simply closes the editor and then opens it again on the original input.
	 */
	class Adapter implements IReloadableEditor {

		private final IEditorPart editor;

		public Adapter(IEditorPart editor) {
			super();

			this.editor = editor;
		}

		public static IReloadableEditor getAdapter(IMultiDiagramEditor editor) {
			return AdapterUtils.adapt(editor, IReloadableEditor.class, new Adapter(editor));
		}

		public void reloadEditor(Collection<? extends Resource> triggeringResources, ReloadReason reason, DirtyPolicy dirtyPolicy) throws CoreException {
			final IWorkbenchPage page = editor.getSite().getPage();
			final IEditorInput currentInput = editor.getEditorInput();

			final Display display = editor.getSite().getShell().getDisplay();

			final String editorId = editor.getSite().getId();

			final DirtyPolicy action = dirtyPolicy.resolve(editor, triggeringResources, reason);
			final boolean save = action == DirtyPolicy.SAVE;

			if(save && editor.isDirty()) {
				editor.doSave(new NullProgressMonitor());
			}

			if(action != DirtyPolicy.IGNORE) {
				page.closeEditor(editor, save);

				// If resources were deleted, we close and don't re-open
				if(reason.shouldReload(triggeringResources)) {
					display.asyncExec(new Runnable() {

						@Override
						public void run() {
							try {
								IDE.openEditor(page, currentInput, editorId);
							} catch (PartInitException ex) {
								Activator.log.error(ex);
							}
						}
					});
				}
			}
		}

		@Override
		public void addEditorReloadListener(IEditorReloadListener listener) {
			// Don't need to track these listeners because I never properly reload an editor
		}

		@Override
		public void removeEditorReloadListener(IEditorReloadListener listener) {
			// Don't need to track these listeners because I never properly reload an editor
		}
	}
}
