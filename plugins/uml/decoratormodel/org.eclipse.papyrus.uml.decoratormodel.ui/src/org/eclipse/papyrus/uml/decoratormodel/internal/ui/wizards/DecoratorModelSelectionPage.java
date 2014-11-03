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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import static org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.AbstractProfileApplicationsPage.align;
import static org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.AbstractProfileApplicationsPage.button;
import static org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.AbstractProfileApplicationsPage.fill;
import static org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.AbstractProfileApplicationsPage.label;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.preferences.ProfileExternalizationUIPreferences;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers.DecoratorModelLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.common.eventbus.EventBus;

/**
 * @author damus
 *
 */
public class DecoratorModelSelectionPage extends WizardPage {
	private boolean showDontShowThis;

	protected CheckboxTableViewer table;

	private ResourceSet resourceSet;
	private Set<URI> input;
	private Set<IFile> initialSelections;

	private final EventBus bus;

	public DecoratorModelSelectionPage(EventBus bus) {
		this(bus, null);
	}

	public DecoratorModelSelectionPage(EventBus bus, ImageDescriptor titleImage) {
		this("selection", Messages.DecoratorModelSelectionPage_0, bus, titleImage); //$NON-NLS-1$
	}

	protected DecoratorModelSelectionPage(String name, String title, EventBus bus, ImageDescriptor titleImage) {
		super(name, title, titleImage);

		this.bus = bus;
	}

	@Override
	public void createControl(Composite parent) {
		Composite main = new Composite(parent, SWT.NONE);
		main.setLayout(new GridLayout());

		label(main, Messages.DecoratorModelSelectionPage_1);
		table = new CheckboxTableViewer(new Table(main, SWT.BORDER | SWT.CHECK | SWT.V_SCROLL | SWT.H_SCROLL));
		fill(table.getTable(), true, true);
		table.setLabelProvider(new DelegatingStyledCellLabelProvider(new DecoratorModelLabelProvider(resourceSet)));
		table.setContentProvider(new AvailableResourcesContentProvider());
		table.setInput(getInput());
		if (initialSelections != null) {
			table.setCheckedElements(Iterables.toArray(initialSelections, IFile.class));
		}
		table.addCheckStateListener(new ICheckStateListener() {

			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				validatePage();
			}
		});

		createSelectionButtons(main);

		if (showDontShowThis()) {
			createPreferenceArea(main);
		}

		setControl(main);

		validatePage();
	}

	IFile[] getCheckedFiles() {
		List<?> checked = (table == null) //
		? (initialSelections == null) ? Collections.emptyList() : ImmutableList.copyOf(initialSelections) //
				: Arrays.asList(table.getCheckedElements());
		return Iterables.toArray(Iterables.filter(checked, IFile.class), IFile.class);
	}

	protected void createSelectionButtons(Composite parent) {
		Composite buttons = new Composite(parent, SWT.NONE);
		align(buttons, SWT.TRAIL);

		RowLayout layout = new RowLayout();
		layout.marginLeft = 0;
		layout.marginTop = 0;
		layout.marginRight = 0;
		layout.marginBottom = 0;
		buttons.setLayout(layout);

		createSpecialSelectionButtons(buttons);

		class ButtonHandler extends SelectionAdapter {
			final boolean select;

			ButtonHandler(boolean select) {
				this.select = select;
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				table.setAllChecked(select);
				validatePage();
			}
		}

		button(buttons, Messages.DecoratorModelSelectionPage_2).addSelectionListener(new ButtonHandler(true));
		button(buttons, Messages.DecoratorModelSelectionPage_3).addSelectionListener(new ButtonHandler(false));
	}

	protected void createSpecialSelectionButtons(Composite buttons) {
		// Pass
	}

	protected void createPreferenceArea(Composite parent) {
		final boolean[] preference = { false };
		final Button dontShowThisButton = new Button(parent, SWT.CHECK);
		dontShowThisButton.setText(Messages.DecoratorModelSelectionPage_4);

		dontShowThisButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				preference[0] = dontShowThisButton.getSelection();
			}
		});
		dontShowThisButton.getShell().addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(DisposeEvent e) {
				storeDontShowThisPreference(preference[0]);
			}
		});
	}

	protected void storeDontShowThisPreference(boolean dontShowThisAgain) {
		ProfileExternalizationUIPreferences.setAutoPromptToLoadProfileApplications(!dontShowThisAgain);
	}

	public void setIsAutomaticPrompt(boolean autoPrompt) {
		showDontShowThis = autoPrompt;
	}

	protected boolean showDontShowThis() {
		return showDontShowThis;
	}

	public void setInput(Package package_, Set<URI> input) {
		this.input = input;

		if (package_ != null) {
			resourceSet = EMFHelper.getResourceSet(package_);
		}

		if (table != null) {
			table.setInput(input);
		}

		validatePage();
	}

	public Set<URI> getInput() {
		return input;
	}

	public void select(Iterable<URI> resources) {
		Set<IFile> files = urisToFiles(resources);
		if (!files.equals(this.initialSelections)) {
			this.initialSelections = urisToFiles(resources);

			if (table != null) {
				table.setCheckedElements(Iterables.toArray(files, IFile.class));
			}

			bus.post(initialSelections);

			validatePage();
		}
	}

	void validatePage() {
		setErrorMessage(null);
		IFile[] checked = getCheckedFiles();
		bus.post(getCheckedFiles());

		if ((input == null) || input.isEmpty()) {
			setErrorMessage(Messages.DecoratorModelSelectionPage_5);
			setPageComplete(false);
		} else if (checked.length == 0) {
			setPageComplete(false);
		} else {
			setPageComplete(true);
		}
	}

	static Set<IFile> urisToFiles(Iterable<URI> uris) {
		Set<IFile> result = Sets.newLinkedHashSet();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (URI next : uris) {
			if (next.isPlatformResource()) {
				IFile file = root.getFile(new Path(next.toPlatformString(true)));
				if ((file != null) && file.exists()) {
					result.add(file);
				}
			}
		}

		return result;
	}

	static IFile[] urisToFilesArray(Iterable<URI> uris) {
		return Iterables.toArray(urisToFiles(uris), IFile.class);
	}

	//
	// Nested types
	//

	static class AvailableResourcesContentProvider implements ITreeContentProvider {
		private final IFile[] none = {};

		@Override
		public Object[] getElements(Object inputElement) {
			IFile[] result = none;

			if (inputElement instanceof Collection<?>) {
				result = urisToFilesArray(Iterables.filter((Collection<?>) inputElement, URI.class));
				Arrays.sort(result, new Comparator<IFile>() {
					@Override
					public int compare(IFile o1, IFile o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
			}

			return result;
		}

		@Override
		public void dispose() {
			// Pass
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// Pass
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			// There is no tree structure
			return none;
		}

		@Override
		public Object getParent(Object element) {
			// There is no tree structure
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			// There is no tree structure
			return false;
		}
	}

}
