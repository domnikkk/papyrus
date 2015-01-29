/*
 * Copyright (c) 2014, 2015 CEA, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *   Christian W. Damus - bug 458736
 *
 */
package org.eclipse.papyrus.uml.modelrepair.ui;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.providers.AdapterFactoryHierarchicContentProvider;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResourceSet;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.labelprovider.service.impl.LabelProviderServiceImpl;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.papyrus.infra.widgets.editors.TreeSelectorDialog;
import org.eclipse.papyrus.uml.modelrepair.Activator;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.ZombieStereotypesDescriptor;
import org.eclipse.papyrus.uml.modelrepair.ui.providers.NestedProfilesAdapterFactory;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Profile;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;


/**
 * This is the ZombieStereotypeDialogPresenter type. Enjoy.
 */
public class ZombieStereotypeDialogPresenter implements IZombieStereotypePresenter {

	private final Shell parentShell;

	private final ResourceSet modelSet;

	private final List<ZombieStereotypesDescriptor> zombieDescriptors = Lists.newArrayListWithExpectedSize(1);

	private final BrowseProfileSupplier dynamicProfileSupplier = new BrowseProfileSupplier();

	private volatile Runnable presentation;

	private Future<?> presentationFuture;

	private final Lock lock = new ReentrantLock();

	private final Condition pendingCond = lock.newCondition();

	private volatile boolean pending = false;

	private final ExecutorService uiExecutor;

	private ExecutorService pendingExecutor;

	public ZombieStereotypeDialogPresenter(Shell parentShell, ResourceSet modelSet) {
		super();

		this.parentShell = parentShell;
		this.modelSet = modelSet;

		uiExecutor = UIUtil.createUIExecutor(parentShell.getDisplay());
	}

	public void dispose() {
		detachPresentation();
		uiExecutor.shutdown();
		if (pendingExecutor != null) {
			pendingExecutor.shutdown();
		}
	}

	void detachPresentation() {
		lock.lock();
		try {
			zombieDescriptors.clear();
			presentation = null;
		} finally {
			lock.unlock();
		}
	}

	public Function<? super EPackage, Profile> getDynamicProfileSupplier() {
		return dynamicProfileSupplier;
	}

	public void addZombies(ZombieStereotypesDescriptor zombies) {
		lock.lock();
		try {
			zombieDescriptors.add(zombies);
			engagePresentation();
		} finally {
			lock.unlock();
		}
	}

	public void asyncAddZombies(Runnable runnable) {
		lock.lock();
		try {
			uiExecutor.execute(runnable);

			// Bump the presentation along until after this runnable has executed
			if (presentationFuture != null) {
				presentationFuture.cancel(false);
				presentation = null;
			}
			engagePresentation();
		} finally {
			lock.unlock();
		}
	}

	/**
	 * Engages the presentation of zombies if it is not already engaged.
	 * 
	 * @precondition The {@link #lock} is locked
	 */
	private void engagePresentation() {
		if (presentation == null) {
			if (!isPending()) {
				internalSetPending(true);
			}

			presentation = new Runnable() {

				public void run() {
					List<ZombieStereotypesDescriptor> zombies;

					lock.lock();
					try {
						if (presentation != this) {
							internalSetPending(false);
							return;
						}
						zombies = ImmutableList.copyOf(zombieDescriptors);
						detachPresentation();
					} finally {
						lock.unlock();
					}

					try {
						if (!zombies.isEmpty()) {
							try {
								ZombieStereotypesDialog zombieDialog = new ZombieStereotypesDialog(parentShell, modelSet, zombies);
								dynamicProfileSupplier.setParentWindow(zombieDialog);
								zombieDialog.setBlockOnOpen(true);
								zombieDialog.open();
							} catch (ServiceException e) {
								StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to open model repair dialog.", e), StatusManager.SHOW);
							} finally {
								dynamicProfileSupplier.setParentWindow(null);
							}
						}
					} finally {
						internalSetPending(false);
					}
				}
			};

			presentationFuture = uiExecutor.submit(presentation);
		}
	}

	public boolean isPending() {
		return pending;
	}

	public void awaitPending(boolean expected) throws InterruptedException {
		lock.lock();
		try {
			while (pending != expected) {
				pendingCond.await();
			}
		} finally {
			lock.unlock();
		}
	}

	public void onPendingDone(final Runnable runnable) {
		lock.lock();
		try {
			if (!pending) {
				// Just do it now
				runnable.run();
			} else {
				// Schedule a wait
				if (pendingExecutor == null) {
					pendingExecutor = Executors.newSingleThreadExecutor();
				}

				pendingExecutor.execute(new Runnable() {

					public void run() {
						try {
							awaitPending(false);
							runnable.run();
						} catch (InterruptedException e) {
							// Oh, well. This runnable won't happen
						}
					}
				});
			}
		} finally {
			lock.unlock();
		}
	}

	private void internalSetPending(boolean pending) {
		lock.lock();
		try {
			this.pending = pending;
			pendingCond.signalAll();
		} finally {
			lock.unlock();
		}
	}

	boolean hasNestedProfiles(Profile profile) {
		return Iterators.any(profile.eAllContents(), Predicates.instanceOf(Profile.class));
	}

	//
	// Nested types
	//

	private class BrowseProfileSupplier implements Function<EPackage, Profile> {

		private Window parentWindow;

		void setParentWindow(Window parentWindow) {
			this.parentWindow = parentWindow;
		}

		public Profile apply(EPackage schema) {
			Profile result = null;

			LabelProviderService labelProvider = null;
			boolean localProvider = false;
			try {
				labelProvider = ServiceUtilsForResourceSet.getInstance().getService(LabelProviderService.class, modelSet);
			} catch (ServiceException e) {
				labelProvider = new LabelProviderServiceImpl();
				localProvider = true;
			}

			final BrowseProfilesDialog dlg = new BrowseProfilesDialog(parentWindow.getShell(), schema, labelProvider);
			Future<URI> task = uiExecutor.submit(new Callable<URI>() {

				public URI call() {
					dlg.setBlockOnOpen(true);
					dlg.open();
					return dlg.getSelectedProfileURI();
				}
			});

			try {
				URI selectedProfileURI = task.get();
				if (selectedProfileURI != null) {
					result = EMFHelper.load(modelSet, selectedProfileURI, Profile.class);

					if ((result != null) && hasNestedProfiles(result)) {
						// Need to select a particular profile from this resource
						final TreeSelectorDialog selectorDlg = new TreeSelectorDialog(parentWindow.getShell());

						NestedProfilesAdapterFactory factory = new NestedProfilesAdapterFactory();
						ITreeContentProvider content = new AdapterFactoryHierarchicContentProvider(factory);
						ILabelProvider labels = new AdapterFactoryLabelProvider(factory);

						try {
							selectorDlg.setContentProvider(content);
							selectorDlg.setLabelProvider(labels);
							final Object dlgInput = result.eResource();

							Future<Profile> specific = uiExecutor.submit(new Callable<Profile>() {

								public Profile call() throws Exception {
									selectorDlg.setTitle("Select a Profile");
									selectorDlg.setDescription("Select a Profile from within the chosen resource.");
									selectorDlg.setHelpAvailable(false);
									selectorDlg.setBlockOnOpen(true);
									selectorDlg.setInput(dlgInput);
									selectorDlg.open();

									Profile result = null;

									Object[] selected = selectorDlg.getResult();
									if ((selected != null) && (selected.length > 0)) {
										result = (Profile) selected[0];
									}

									return result;
								}
							});

							result = specific.get();
						} finally {
							content.dispose();
							labels.dispose();
							factory.dispose();
						}
					}
				}
			} catch (ExecutionException e) {
				Activator.log.error("Profile selection dialog presentation failed.", e); //$NON-NLS-1$
			} catch (InterruptedException e) {
				Activator.log.error("Profile selection dialog presentation interrupted.", e); //$NON-NLS-1$
			} finally {
				if (localProvider) {
					try {
						labelProvider.disposeService();
					} catch (ServiceException e) {
						Activator.log.error(e);
					}
				}
			}

			return result;
		}
	}
}
