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
package org.eclipse.papyrus.infra.core.resource;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


/**
 * A convenient superclass for adapters on {@link ResourceSet}s that need to handle changes in {@link Resource}s.
 * The adapter automatically propagates itself to newly added resources and provides hooks for common resource events.
 */
public abstract class ResourceAdapter extends AdapterImpl {

	public ResourceAdapter() {
		super();
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// Don't need to track resources as targets (there are multiple)
		if(newTarget instanceof ResourceSet) {
			super.setTarget(newTarget);
		}
	}

	protected ResourceSet getResourceSet() {
		return (ResourceSet)getTarget();
	}

	@Override
	public void notifyChanged(Notification msg) {
		Object notifier = msg.getNotifier();

		if(!msg.isTouch()) {
			if(notifier instanceof ResourceSet) {
				if(msg.getFeatureID(ResourceSet.class) == ResourceSet.RESOURCE_SET__RESOURCES) {
					handleResourceSetResources(msg);
				}
			} else if(notifier instanceof Resource) {
				switch(msg.getFeatureID(Resource.class)) {
				case Resource.RESOURCE__IS_LOADED:
					switch(msg.getEventType()) {
					case Notification.SET:
					case Notification.UNSET:
						if(msg.getNewBooleanValue()) {
							handleResourceLoaded((Resource)notifier);
						} else {
							handleResourceUnloaded((Resource)notifier);
						}
						break;
					}
					break;
				case Resource.RESOURCE__URI:
					switch(msg.getEventType()) {
					case Notification.SET:
					case Notification.UNSET:
						handleResourceURI((Resource)notifier, (URI)msg.getOldValue(), (URI)msg.getNewValue());
						break;
					}
					break;
				case Resource.RESOURCE__CONTENTS:
					handleResourceContents(msg);
					break;
				}
			}
		}
	}

	protected void addAdapter(Notifier notifier) {
		EList<Adapter> adapters = notifier.eAdapters();
		if(!adapters.contains(this)) {
			adapters.add(this);
		}
	}

	protected void removeAdapter(Notifier notifier) {
		notifier.eAdapters().remove(this);
	}

	protected void handleResourceSetResources(Notification msg) {
		switch(msg.getEventType()) {
		case Notification.ADD:
		{
			Resource resource = (Resource)msg.getNewValue();
			addAdapter(resource);
			handleResourceAdded(resource);
		}
			break;
		case Notification.ADD_MANY:
			for(Object next : (Iterable<?>)msg.getNewValue()) {
				Resource resource = (Resource)next;
				addAdapter(resource);
				handleResourceAdded(resource);
			}
			break;
		case Notification.REMOVE:
		{
			Resource resource = (Resource)msg.getOldValue();
			try {
				handleResourceRemoved(resource);
			} finally {
				removeAdapter(resource);
			}
			break;
		}
		case Notification.REMOVE_MANY:
			for(Object next : (Iterable<?>)msg.getOldValue()) {
				Resource resource = (Resource)next;
				try {
					handleResourceRemoved(resource);
				} finally {
					removeAdapter(resource);
				}
			}
			break;
		case Notification.SET:
		{
			Resource oldResource = (Resource)msg.getOldValue();
			try {
				handleResourceRemoved(oldResource);
			} finally {
				removeAdapter(oldResource);
			}

			Resource newResource = (Resource)msg.getOldValue();
			addAdapter(newResource);
			handleResourceAdded(newResource);
			break;
		}
		}
	}

	protected void handleResourceContents(Notification msg) {
		Resource.Internal resource = (Resource.Internal)msg.getNotifier();

		// Don't report addition of roots when loading nor removal of roots when unloading
		// because loading and unloading are semantically more significant events
		if(resource.isLoaded() && !resource.isLoading()) {
			switch(msg.getEventType()) {
			case Notification.ADD:
				handleRootAdded(resource, (EObject)msg.getNewValue());
				break;
			case Notification.ADD_MANY:
				for(Object next : (Iterable<?>)msg.getNewValue()) {
					handleRootAdded(resource, (EObject)next);
				}
				break;
			case Notification.REMOVE:
				handleRootRemoved(resource, (EObject)msg.getOldValue());
				break;
			case Notification.REMOVE_MANY:
				for(Object next : (Iterable<?>)msg.getOldValue()) {
					handleRootRemoved(resource, (EObject)next);
				}
				break;
			case Notification.SET:
				handleRootRemoved(resource, (EObject)msg.getOldValue());
				handleRootAdded(resource, (EObject)msg.getNewValue());
				break;
			}
		}
	}

	protected void handleResourceAdded(Resource resource) {
		// Pass
	}

	protected void handleResourceRemoved(Resource resource) {
		// Pass
	}

	protected void handleResourceLoaded(Resource resource) {
		// Pass
	}

	protected void handleResourceUnloaded(Resource resource) {
		// Pass
	}

	protected void handleResourceURI(Resource resource, URI oldURI, URI newURI) {
		// Pass
	}

	protected void handleRootAdded(Resource resource, EObject root) {
		// Pass
	}

	protected void handleRootRemoved(Resource resource, EObject root) {
		// Pass
	}
}
