/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 443417
 *  
 *****************************************************************************/
package org.eclipse.papyrus.views.properties.widgets;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.tools.databinding.MultipleObservableValue;
import org.eclipse.papyrus.infra.widgets.editors.AbstractEditor;
import org.eclipse.papyrus.views.properties.Activator;
import org.eclipse.papyrus.views.properties.contexts.Context;
import org.eclipse.papyrus.views.properties.contexts.Section;
import org.eclipse.papyrus.views.properties.contexts.View;
import org.eclipse.papyrus.views.properties.modelelement.DataSource;
import org.eclipse.papyrus.views.properties.modelelement.DataSourceChangedEvent;
import org.eclipse.papyrus.views.properties.modelelement.IDataSourceListener;
import org.eclipse.papyrus.views.properties.runtime.ConfigurationManager;
import org.eclipse.papyrus.views.properties.runtime.DefaultDisplayEngine;
import org.eclipse.papyrus.views.properties.runtime.DisplayEngine;
import org.eclipse.papyrus.views.properties.widgets.layout.PropertiesLayout;
import org.eclipse.papyrus.views.properties.xwt.XWTSection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * An Editor for displaying a whole property {@link View} on a sub-object.
 * If the property is a list, there will be one view per element in the list.
 *
 * The view's tabs will be ignored : the sections are embedded in the caller's
 * tab.
 */
public class ViewEditor extends AbstractPropertyEditor {

	private String viewPath;

	private Composite self;

	private Map<Section, XWTSection> sections = new HashMap<Section, XWTSection>();

	private DisplayEngine displayEngine;

	private IDataSourceListener dataSourceListener;

	/**
	 * Constructor.
	 *
	 * @param parent
	 *            The composite in which the widget will be displayed
	 * @param style
	 *            The style for the widget
	 */
	public ViewEditor(Composite parent, int style) {
		self = new Composite(parent, SWT.NONE);
		PropertiesLayout layout = new PropertiesLayout(1, true);
		layout.horizontalSpacing = 0;
		layout.marginWidth = 0;
		self.setLayout(layout);

		addDisposeListener(self);
	}

	private void addDisposeListener(Control control) {
		control.addDisposeListener(new DisposeListener() {

			public void widgetDisposed(DisposeEvent e) {
				disposeDisplayEngine();
			}
		});
	}

	private void disposeDisplayEngine() {
		if (displayEngine != null) {
			displayEngine.dispose();
			displayEngine = null;
			sections.clear();
		}
	}

	@Override
	public void checkInput() {
		if (propertyPath != null && input != null && viewPath != null) {
			display();
		}
	}

	@Override
	protected void unhookDataSourceListener(DataSource oldInput) {
		oldInput.removeDataSourceListener(getDataSourceListener());
		super.unhookDataSourceListener(oldInput);
	}

	@Override
	protected void hookDataSourceListener(DataSource newInput) {
		super.hookDataSourceListener(newInput);
		newInput.addDataSourceListener(getDataSourceListener());
	}

	private IDataSourceListener getDataSourceListener() {
		if (dataSourceListener == null) {
			dataSourceListener = new IDataSourceListener() {

				public void dataSourceChanged(DataSourceChangedEvent event) {
					// The data source's selection changed. Re-display our nested sections, if appropriate
					checkInput();
				}
			};
		}

		return dataSourceListener;
	}

	/**
	 * Sets the number of columns for this editor. If the property is a list,
	 * there will be one view per element in the list : these views will be
	 * distributed in the given number of columns.
	 *
	 * @param numColumns
	 */
	public void setNumColumns(int numColumns) {
		((PropertiesLayout) self.getLayout()).numColumns = numColumns;
	}

	/**
	 * @return the number of columns for this editor.
	 */
	public int getNumColumns() {
		return ((PropertiesLayout) self.getLayout()).numColumns;
	}

	/**
	 * Sets the view for this editor. The view is represented by its viewPath, which is
	 * of form ContextName:ViewName
	 * e.g. : UML:Class
	 * The Context should be registered in the ConfigurationManager
	 *
	 * @param viewPath
	 *            The path of the view used to display the given property
	 */
	public void setView(String viewPath) {
		this.viewPath = viewPath;
		checkInput();
	}

	/**
	 * @return the qualified name of the view associated to this editor
	 */
	public String getView() {
		return viewPath;
	}

	private View resolveView() {
		String contextName = viewPath.substring(0, viewPath.indexOf(":")); //$NON-NLS-1$
		String viewName = viewPath.substring(viewPath.indexOf(":") + 1); //$NON-NLS-1$
		Context context = ConfigurationManager.getInstance().getContext(contextName);
		for (View view : context.getViews()) {
			if (view.getName().equals(viewName)) {
				return view;
			}
		}
		return null;
	}

	private void display() {
		View view = resolveView();

		if (view == null) {
			Activator.log.warn("Unabled to resolve view : " + viewPath); //$NON-NLS-1$
			return;
		}

		IObservable observable = getInputObservable();
		if (observable == null) {
			return;
		}

		if (displayEngine == null) {
			displayEngine = new DefaultDisplayEngine(false);
		}

		if (observable instanceof IObservableValue) {
			IObservableValue observableValue = (IObservableValue) observable;
			if (observableValue instanceof MultipleObservableValue) {
				MultipleObservableValue multipleObservable = (MultipleObservableValue) observableValue;
				display(displayEngine, multipleObservable.getObservedValues(), view);
			} else {
				Object value = observableValue.getValue();
				display(displayEngine, value, view);
			}
		} else if (observable instanceof IObservableList) {
			IObservableList observableList = (IObservableList) observable;
			for (Object value : observableList) {
				display(displayEngine, value, view);
			}
		}

		updateControls();
	}

	/**
	 * Displays the given view in the display engine, with the given object.
	 *
	 * @param display
	 *            The Display engine used to display the view. It should allow duplication,
	 *            as for list properties, the same section will be displayed for each element
	 *            in the list.
	 * @param data
	 *            The raw object for which we are displaying the view.
	 * @param view
	 *            The view to display
	 */
	protected void display(DisplayEngine display, Object data, View view) {
		display(display, Collections.singletonList(data), view);
	}

	/**
	 * Displays the given view in the display engine, with the given object.
	 *
	 * @param display
	 *            The Display engine used to display the view. It should allow duplication,
	 *            as for list properties, the same section will be displayed for each element
	 *            in the list.
	 * @param selectedElements
	 *            The list of objects for which we are displaying the view
	 * @param view
	 *            The view to display
	 */
	protected void display(DisplayEngine display, List<Object> selectedElements, View view) {
		for (Section section : view.getSections()) {
			XWTSection xwtSection = sections.get(section);
			if (xwtSection == null) {
				xwtSection = new XWTSection(section, view, display);
				sections.put(section, xwtSection);
				xwtSection.createControls(new Composite(self, SWT.NONE), null);
			}

			ISelection selection = new StructuredSelection(selectedElements);

			xwtSection.setInput(null, selection);
			xwtSection.refresh();
		}
	}

	/**
	 * Updates the displayed widgets to mark them as readOnly if needed.
	 */
	protected void updateControls() {
		for (Control container : self.getChildren()) {
			// TODO : Browse recursively ?
			if (container instanceof Composite) {
				for (Control control : ((Composite) container).getChildren()) {
					if (control instanceof AbstractEditor) {
						AbstractEditor editor = (AbstractEditor) control;
						editor.setReadOnly(getReadOnly() || editor.isReadOnly());
					}
				}
			}
		}

		self.setEnabled(!getReadOnly());
	}

	@Override
	protected IObservable getInputObservable() {
		// Override the generic behavior: ViewEditor doesn't rely on an AbstractEditor
		return input.getObservable(propertyPath);
	}

	@Override
	public void setReadOnly(boolean readOnly) {
		super.setReadOnly(readOnly);
		updateControls();
	}

	@Override
	protected void doBinding() {
		// Nothing to do here
	}

	@Override
	public Control getControl() {
		return self;
	}
}
