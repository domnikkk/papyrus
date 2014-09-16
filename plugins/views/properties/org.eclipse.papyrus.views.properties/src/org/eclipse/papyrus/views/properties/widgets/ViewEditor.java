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
 *  Christian W. Damus (CEA) - bug 444227
 *  
 *****************************************************************************/
package org.eclipse.papyrus.views.properties.widgets;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.tools.databinding.IMultipleObservableValue;
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
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ScrollBar;

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

	private Map<Section, EditorSection> sections = new HashMap<Section, EditorSection>();

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
					if ((self != null) && !self.isDisposed()) {
						self.getDisplay().asyncExec(new Runnable() {

							public void run() {
								if (!self.isDisposed()) {
									checkInput();
								}
							}
						});
					}
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

		// We need to be able to repeat sections, so use an arbitrary discriminator to
		// present the same section multiple times as distinct sections
		int index = 0;
		if (observable instanceof IObservableValue) {
			IObservableValue observableValue = (IObservableValue) observable;
			if (observableValue instanceof IMultipleObservableValue) {
				IMultipleObservableValue multipleObservable = (IMultipleObservableValue) observableValue;
				display(displayEngine, multipleObservable.getObservedValues(), view, index++);
			} else {
				Object value = observableValue.getValue();
				display(displayEngine, value, view, index++);
			}
		} else if (observable instanceof IObservableList) {
			IObservableList observableList = (IObservableList) observable;
			for (Object value : observableList) {
				display(displayEngine, value, view, index++);
			}
		}

		// Any repeated sections that we had created for a previous selection and no longer need must be destroyed
		purgeUnusedSections(index);

		// A hack to force the containing scroll pane, if any (we expect to have one in the property sheet), to
		// recompute its client area and scrollbars
		for (Composite next = self; (next != null); next = next.getParent()) {
			if (next.getParent() instanceof ScrolledComposite) {
				final ScrolledComposite scrolled = (ScrolledComposite) next.getParent();
				next.layout();
				scrolled.layout();
				scrolled.getDisplay().asyncExec(new Runnable() {

					public void run() {
						resizeScrolledComposite(scrolled);
					}
				});
			}
		}

		updateControls();
	}

	private void purgeUnusedSections(int maxDiscriminator) {
		for (Iterator<Section> iter = sections.keySet().iterator(); iter.hasNext();) {
			Section section = iter.next();
			Object discriminator = DefaultDisplayEngine.getDiscriminator(section);
			if ((discriminator instanceof Number) && (((Number) discriminator).intValue() >= maxDiscriminator)) {
				sections.get(section).dispose();
				iter.remove();
			}
		}
	}

	/**
	 * Recompute the size of a {@code scrolled} composite's client area and adjust its scroll bars accordingly.
	 * 
	 * @param scrolled
	 *            a scrolled composite to force to adapt to a new layout
	 */
	private void resizeScrolledComposite(ScrolledComposite scrolled) {
		Point sizeConstraint = scrolled.getContent().getSize();
		sizeConstraint = scrolled.getContent().computeSize(SWT.DEFAULT, SWT.DEFAULT);
		scrolled.setMinSize(sizeConstraint);

		Rectangle clientArea = scrolled.getClientArea();

		ScrollBar vbar = scrolled.getVerticalBar();
		if (vbar != null) {
			vbar.setPageIncrement(clientArea.height - 5);
		}

		ScrollBar hbar = scrolled.getHorizontalBar();
		if (hbar != null) {
			hbar.setPageIncrement(clientArea.width - 5);
		}
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
	protected void display(DisplayEngine display, Object data, View view, Object discriminator) {
		display(display, Collections.singletonList(data), view, discriminator);
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
	protected void display(DisplayEngine display, List<Object> selectedElements, View view, Object discriminator) {
		for (Section section : view.getSections()) {
			// Distinguish this occurrence of the section
			section = DefaultDisplayEngine.discriminate(section, discriminator);

			EditorSection editorSection = sections.get(section);
			if (editorSection == null) {
				editorSection = new EditorSection(new XWTSection(section, view, display));
				sections.put(section, editorSection);
			}

			ISelection selection = new StructuredSelection(selectedElements);

			editorSection.setInput(selection);
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

	//
	// Nested types
	//

	/**
	 * An encapsulation of an XWT section with the composite that contains it within the {@link ViewEditor}'s parent composite.
	 */
	private class EditorSection {
		private final XWTSection xwt;
		private final Composite sectionComposite;

		EditorSection(XWTSection xwt) {
			this.xwt = xwt;
			this.sectionComposite = new Composite(self, SWT.NONE);

			xwt.createControls(sectionComposite, null);
		}

		void dispose() {
			if (!sectionComposite.isDisposed()) {
				xwt.dispose();
				sectionComposite.dispose();
			}
		}

		void setInput(ISelection selection) {
			xwt.setInput(null, selection);
			xwt.refresh();
		}
	}
}
