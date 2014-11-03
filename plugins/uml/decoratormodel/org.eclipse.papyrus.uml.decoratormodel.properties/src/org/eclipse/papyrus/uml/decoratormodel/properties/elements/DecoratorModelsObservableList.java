/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.properties.elements;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.databinding.observable.IObserving;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.ObservableList;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ResourceAdapter;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.papyrus.infra.widgets.editors.AbstractEditor;
import org.eclipse.papyrus.infra.widgets.editors.ICommitListener;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndexEvent;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.IDecoratorModelIndexListener;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * The list of a {@link Package}'s decorator models, both loaded and unloaded.
 */
public class DecoratorModelsObservableList extends ObservableList implements ICommitListener, IObserving {

	private final AtomicBoolean pendingCalculation = new AtomicBoolean();

	private Package package_;

	private TransactionalEditingDomain domain;

	private final List<Command> commands;

	private final ExecutorService realmExecutor;

	private final ResourceSetListener resourceSetListener;

	private final IDecoratorModelIndexListener indexListener;

	/**
	 * Initializes me in the default realm.
	 *
	 * @param package_
	 *            the package for which we track the decorator models
	 * @param domain
	 *            the editing domain context in which to execute commands
	 */
	public DecoratorModelsObservableList(Package package_, TransactionalEditingDomain domain) {
		this(Realm.getDefault(), package_, domain);
	}

	/**
	 * Initializes me.
	 *
	 * @param realm
	 *            the observable realm that owns me
	 * @param package_
	 *            the package for which we track the decorator models
	 * @param domain
	 *            the editing domain context in which to execute commands
	 */
	public DecoratorModelsObservableList(Realm realm, Package package_, TransactionalEditingDomain domain) {
		super(realm, Lists.newArrayList(), Object.class);

		this.package_ = package_;
		this.domain = domain;

		this.commands = Lists.newArrayListWithExpectedSize(1);

		this.realmExecutor = UIUtil.createObservableExecutor(realm);

		this.resourceSetListener = new ResourceAdapter.Transactional() {
			private NotificationFilter packageFilter;

			@Override
			protected NotificationFilter createFilter() {
				packageFilter = NotificationFilter.createFeatureFilter(UMLPackage.Literals.PACKAGE__PROFILE_APPLICATION);
				return super.createFilter().or(packageFilter);
			}

			@Override
			public void notifyChanged(Notification msg) {
				if (packageFilter.matches(msg)) {
					// Some externalized profiles may no longer be available
					calculate();
				} else {
					// Resource case
					super.notifyChanged(msg);
				}
			}

			@Override
			protected void handleResourceLoaded(Resource resource) {
				calculate();
			}

			@Override
			protected void handleResourceUnloaded(Resource resource) {
				calculate();
			}
		};
		domain.addResourceSetListener(resourceSetListener);

		this.indexListener = new IDecoratorModelIndexListener() {

			public void indexChanged(DecoratorModelIndexEvent event) {
				// Some unloaded decorator models may have changed
				calculate();
			}
		};
		DecoratorModelIndex.getInstance().addIndexListener(indexListener);

		calculate();
	}

	public Package getObserved() {
		return package_;
	}

	@Override
	public synchronized void dispose() {
		try {
			DecoratorModelIndex.getInstance().removeIndexListener(indexListener);
			if (domain != null) {
				domain.removeResourceSetListener(resourceSetListener);
			}
			if (!realmExecutor.isShutdown()) {
				realmExecutor.shutdownNow();
			}
		} finally {
			super.dispose();
		}
	}

	public void commit(AbstractEditor editor) {
		if (!commands.isEmpty()) {
			if (commands.size() == 1) {
				domain.getCommandStack().execute(commands.get(0));
			} else {
				domain.getCommandStack().execute(new CompoundCommand(commands));
			}
			commands.clear();
		}
	}

	void calculate() {
		if (!pendingCalculation.compareAndSet(false, true) || isDisposed()) {
			return;
		}

		// First, mark me stale
		getRealm().exec(new Runnable() {

			public void run() {
				setStale(true);
			}
		});

		// Then asynchronously compute my value
		ListenableFuture<Set<URI>> decoratorModelURIs = DecoratorModelUtils.getUnloadedDecoratorModelsAsync(package_);
		Futures.addCallback(decoratorModelURIs, new FutureCallback<Set<URI>>() {
			public void onSuccess(Set<URI> result) {
				if (isDisposed() || (domain == null) || (domain.getResourceSet() == null)) {
					return;
				}

				try {
					// compute all the unloaded models
					Set<Object> newValue = Sets.<Object> newHashSet(result);
					for (Resource next : domain.getResourceSet().getResources()) {
						if (next.isLoaded()) {
							newValue.remove(next.getURI());
						}
					}

					// now get the loaded ones
					for (ProfileApplication next : DecoratorModelUtils.getDecoratorModelProfileApplications(package_)) {
						newValue.add(next.eResource());
					}

					List<Object> newList = Lists.newArrayList(newValue);
					// because the ordering of all these sets is random, we must sort so that the list doesn't
					// change its ordering randomly each time
					sort(newList);

					setStale(false);
					updateWrappedList(newList);
				} finally {
					pendingCalculation.set(false);
				}
			}

			public void onFailure(Throwable t) {
				// TODO Auto-generated method stub
			}
		}, realmExecutor);
	}

	void sort(List<?> list) {
		Collections.sort(list, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				URI uri1 = getURI(o1);
				URI uri2 = getURI(o2);
				return uri1.toString().compareTo(uri2.toString());
			}

			URI getURI(Object o) {
				return (o instanceof Resource) ? ((Resource) o).getURI() : (URI) o;
			}
		});
	}
}
