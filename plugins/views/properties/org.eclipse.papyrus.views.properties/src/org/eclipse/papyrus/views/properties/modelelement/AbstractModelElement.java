/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Thibault Le Ouay t.leouay@sherpa-eng.com - Add binding implementation
 *  Christian W. Damus (CEA) - bug 417409
 *  
 *****************************************************************************/
package org.eclipse.papyrus.views.properties.modelelement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.databinding.observable.DisposeEvent;
import org.eclipse.core.databinding.observable.IDisposeListener;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.tools.databinding.DelegatingObservableValue;
import org.eclipse.papyrus.infra.tools.databinding.IDelegatingObservable;
import org.eclipse.papyrus.infra.tools.databinding.ReferenceCountedObservable;
import org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory;
import org.eclipse.papyrus.infra.widgets.providers.EmptyContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;
import org.eclipse.papyrus.views.properties.creation.PropertyEditorFactory;

/**
 * Provides a default implementation for ModelElement methods applied on the
 * modelElement's properties.
 * 
 * @author Camille Letavernier
 */
public abstract class AbstractModelElement implements ModelElement, IDataSourceListener {

	/**
	 * The DataSource owning this ModelElement
	 */
	protected DataSource dataSource;

	private final Map<String, IObservable> observables = new HashMap<String, IObservable>();

	private IDisposeListener observableDisposeListener;

	AbstractModelElementFactory<AbstractModelElement> factory;

	/**
	 * Constructor.
	 */
	protected AbstractModelElement() {
		super();
	}

	@SuppressWarnings("unchecked")
	void setFactory(AbstractModelElementFactory<? extends AbstractModelElement> factory) {
		this.factory = (AbstractModelElementFactory<AbstractModelElement>)factory;
	}

	public IStaticContentProvider getContentProvider(String propertyPath) {
		return EmptyContentProvider.instance;
	}

	public ILabelProvider getLabelProvider(String propertyPath) {
		return null;
	}

	public boolean isOrdered(String propertyPath) {
		return true;
	}

	public boolean isUnique(String propertyPath) {
		return false;
	}

	public boolean isMandatory(String propertyPath) {
		return false;
	}

	public boolean isEditable(String propertyPath) {
		return true;
	}

	public boolean forceRefresh(String propertyPath) {
		return false;
	}

	public void setDataSource(DataSource source) {
		if(this.dataSource != source) {
			if(this.dataSource != null) {
				this.dataSource.removeDataSourceListener(this);
			}

			this.dataSource = source;

			if(this.dataSource != null) {
				this.dataSource.addDataSourceListener(this);
			}
		}
	}

	public final void dataSourceChanged(DataSourceChangedEvent event) {
		if(event.getDataSource() == dataSource) {
			// The data source changed. Update for the new selection
			IStructuredSelection selection = dataSource.getSelection();
			if(selection.isEmpty()) {
				factory.updateModelElement(this, null);
			} else if(selection.size() == 1) {
				factory.updateModelElement(this, selection.getFirstElement());
			} else {
				updateMultipleSelection(selection);
			}

			// Update our observables
			for(Map.Entry<String, IObservable> next : observables.entrySet()) {
				IDelegatingObservable wrapper = ((IDelegatingObservable)next.getValue());
				wrapper.setDelegate(doGetObservable(next.getKey()));
			}
		}
	}

	void updateMultipleSelection(IStructuredSelection selection) {
		throw new IllegalArgumentException("multiple selection"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.papyrus.views.properties.modelelement.ModelElement#getValueFactory(java.lang.String)
	 * 
	 * @param propertyPath
	 * @return a default factory based on the property view configuration to
	 *         edit objects, as if they were selected in an editor
	 */
	public ReferenceValueFactory getValueFactory(String propertyPath) {
		return new PropertyEditorFactory();
	}

	public Object getDefaultValue(String propertyPath) {
		return null;
	}

	public boolean getDirectCreation(String propertyPath) {
		return false;
	}

	public final IObservable getObservable(String propertyPath) {
		if(!observables.containsKey(propertyPath)) {
			IObservable observable = doGetObservable(propertyPath);
			if(observable != null) {
				// Wrap it so that we may replace the delegate as needed
				observable = DelegatingObservableValue.wrap(observable);
				observable.addDisposeListener(getObservableDisposeListener());
				ReferenceCountedObservable.Util.retain(observable);
				observables.put(propertyPath, observable);
			}
		}
		return observables.get(propertyPath);
	}

	/**
	 * Creates the IObservable for the given propertyPath
	 * 
	 * @param propertyPath
	 *        The path of the property we want to observe
	 * @return
	 *         The new IObservable
	 */
	protected abstract IObservable doGetObservable(String propertyPath);

	public void dispose() {
		for(IObservable observable : observables.values()) {
			if(observableDisposeListener != null) {
				// Don't let the listener concurrently modify the map in case releasing triggers dispose
				observable.removeDisposeListener(observableDisposeListener);
			}
			
			ReferenceCountedObservable.Util.release(observable);			
		}
		
		observables.clear();
		observableDisposeListener = null;
	}

	public IValidator getValidator(String propertyPath) {
		return null;
	}

	private IDisposeListener getObservableDisposeListener() {
		if(observableDisposeListener == null) {
			observableDisposeListener = new IDisposeListener() {

				public void handleDispose(DisposeEvent event) {
					// Remove this property
					for(Iterator<Map.Entry<String, IObservable>> entries = observables.entrySet().iterator(); entries.hasNext();) {
						if(entries.next().getValue() == event.getObservable()) {
							entries.remove();
							break;
						}
					}
				}
			};
		}

		return observableDisposeListener;
	}

}
