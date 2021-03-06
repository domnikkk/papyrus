/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.service.palette;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.utils.EditorUtils;
import org.eclipse.papyrus.uml.appearance.helper.AppliedStereotypeHelper;
import org.eclipse.papyrus.uml.appearance.helper.UMLVisualInformationPapyrusConstant;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.papyrus.uml.diagram.common.service.IPapyrusPaletteConstant;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.uml2.uml.Profile;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Post action that manages the display of applied stereotypes.
 */
public class ChangeStereotypeDisplayPostAction extends GraphicalPostAction {

	/** list of stereotypes to display with their names */
	protected String displayKind = UMLVisualInformationPapyrusConstant.STEREOTYPE_TEXT_HORIZONTAL_PRESENTATION;

	/** place where to display stereotypes */
	protected String displayPlace = UMLVisualInformationPapyrusConstant.STEREOTYPE_COMPARTMENT_LOCATION;

	/** combo for configuration of the stereotype display direction */
	protected Combo directionCombo;

	/** combo for configuration of the stereotype display */
	protected Combo displayCombo;

	/** combo for configuration of the stereotype display place */
	protected Combo placeCombo;

	/** text display */
	protected static final String TEXT = "text";

	/** icon display */
	protected static final String ICON = "icon";

	/** icon display */
	protected static final String SHAPE = "shape";

	/** text and icon display */
	protected static final String TEXT_AND_ICON = "text and icon";

	/** list of available items in the stereotype display combo */
	protected static final List<String> DISPLAY_LIST = Arrays.asList(TEXT, ICON, TEXT_AND_ICON, SHAPE);

	/** horizontal display constant */
	private static final String HORIZONTAL = "horizontal";

	/** vertical display constant */
	private static final String VERTICAL = "vertical";

	/** list of available items in the stereotype direction combo */
	protected static final List<String> DIRECTION_LIST = Arrays.asList(HORIZONTAL, VERTICAL);

	/** in comment display constant */
	protected static final String COMMENT = "comment";

	/** compartment display constant */
	protected static final String COMPARTMENT = "compartment";

	/** in brace display constant */
	protected static final String BRACE = "brace";

	/** list of available items in the stereotype place combo */
	protected static final List<String> PLACE_LIST = Arrays.asList(COMMENT, COMPARTMENT, BRACE);

	/**
	 * @{inheritDoc
	 */
	@Override
	public void init(Node configurationNode, IAspectActionProvider factory) {
		super.init(configurationNode, factory);
		if (configurationNode == null) {
			return;
		}
		Node node = configurationNode.getAttributes().getNamedItem(IPapyrusPaletteConstant.DISPLAY_KIND);
		if (node != null) {
			displayKind = node.getNodeValue();
		}
		node = configurationNode.getAttributes().getNamedItem(IPapyrusPaletteConstant.DISPLAY_PLACE);
		if (node != null) {
			displayPlace = node.getNodeValue();
		}
	}

	/**
	 * @{inheritDoc
	 */
	@Override
	public void save(Node configurationNode) {
		if (configurationNode instanceof Element) {
			((Element) configurationNode).setAttribute(IPapyrusPaletteConstant.DISPLAY_KIND, displayKind);
			((Element) configurationNode).setAttribute(IPapyrusPaletteConstant.DISPLAY_PLACE, displayPlace);
		} else {
			Activator.log.error("configuration node is not an Element", null);
		}
	}

	/**
	 * @{inheritDoc
	 */
	@Override
	public ICommand getPostCommand(final IAdaptable viewAdapter) {

		final TransactionalEditingDomain editingDomain = EditorUtils.getTransactionalEditingDomain();
		return new AbstractTransactionalCommand(editingDomain, "Modify Stereotype Display", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				View view = (View) viewAdapter.getAdapter(View.class);

				if (view != null) {
					String stereotypetoDisplay = AppliedStereotypeHelper.getStereotypesToDisplay(view);
					AppliedStereotypeHelper.getAppliedStereotypeToDisplayCommand(editingDomain, view, stereotypetoDisplay, displayKind).execute();
				}
				return null;
			}
		};

	}

	/**
	 * @{inheritDoc
	 */
	@Override
	public Control createConfigurationComposite(Composite parent, IPaletteEntryProxy entryProxy, List<Profile> appliedProfiles) {
		this.appliedProfiles = appliedProfiles;
		this.entryProxy = entryProxy;
		Composite mainComposite = new Composite(parent, SWT.BORDER);
		GridLayout layout = new GridLayout(2, false);
		mainComposite.setLayout(layout);

		Label titleLabel = new Label(mainComposite, SWT.NONE);
		titleLabel.setText("Customize stereotype display");
		GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		titleLabel.setLayoutData(data);

		Label displayLabel = new Label(mainComposite, SWT.NONE);
		displayLabel.setText("Stereotype Display:");

		displayCombo = new Combo(mainComposite, SWT.READ_ONLY | SWT.BORDER);
		displayCombo.setItems(DISPLAY_LIST.toArray(new String[] {}));
		data = new GridData(SWT.FILL, SWT.CENTER, true, false);
		displayCombo.setLayoutData(data);
		displayCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateDisplayKindValue();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to do
			}
		});

		Label directionLabel = new Label(mainComposite, SWT.NONE);
		directionLabel.setText("Text alignement:");

		directionCombo = new Combo(mainComposite, SWT.READ_ONLY | SWT.BORDER);
		directionCombo.setItems(DIRECTION_LIST.toArray(new String[] {}));
		// data = new GridData(SWT.FILL, SWT.CENTER, true, false);
		directionCombo.setLayoutData(data);
		directionCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateDisplayKindValue();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to do
			}
		});

		Label placeLabel = new Label(mainComposite, SWT.NONE);
		placeLabel.setText("Display place:");

		placeCombo = new Combo(mainComposite, SWT.READ_ONLY | SWT.BORDER);
		placeCombo.add(UMLVisualInformationPapyrusConstant.STEREOTYPE_COMMENT_LOCATION);
		placeCombo.add(UMLVisualInformationPapyrusConstant.STEREOTYPE_COMPARTMENT_LOCATION);
		placeCombo.add(UMLVisualInformationPapyrusConstant.STEREOTYPE_BRACE_LOCATION);
		// data = new GridData(SWT.FILL, SWT.CENTER, true, false);
		placeCombo.setLayoutData(data);
		placeCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateDisplayPlaceValue();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to do
			}
		});

		updateCombos();

		return mainComposite;
	}

	/**
	 * Update the display place value according to the combo selection
	 */
	protected void updateDisplayPlaceValue() {
		int placeIndex = placeCombo.getSelectionIndex();
		String place = PLACE_LIST.get((placeIndex >= 0) ? placeIndex : 0);

		if (BRACE.equals(place)) {
			displayPlace = UMLVisualInformationPapyrusConstant.STEREOTYPE_BRACE_LOCATION;
		} else if (COMMENT.equals(place)) {
			displayPlace = UMLVisualInformationPapyrusConstant.STEREOTYPE_COMMENT_LOCATION;
		} else {
			displayPlace = UMLVisualInformationPapyrusConstant.STEREOTYPE_COMPARTMENT_LOCATION;
		}

		// be sure display is up to date
		updateCombos();
	}

	/**
	 * update the display kind value hold by this action, given the combo value
	 */
	protected void updateDisplayKindValue() {
		int displayIndex = displayCombo.getSelectionIndex();
		String display = DISPLAY_LIST.get((displayIndex >= 0) ? displayIndex : 0);
		int directionIndex = directionCombo.getSelectionIndex();
		String direction = DIRECTION_LIST.get((directionIndex >= 0) ? directionIndex : 0);
		if (ICON.equals(display)) {
			displayKind = UMLVisualInformationPapyrusConstant.ICON_STEREOTYPE_PRESENTATION;
		} else if (TEXT_AND_ICON.equals(display)) {
			displayKind = UMLVisualInformationPapyrusConstant.TEXT_ICON_STEREOTYPE_PRESENTATION;
		} else if (SHAPE.equals(display)) {
			displayKind = UMLVisualInformationPapyrusConstant.IMAGE_STEREOTYPE_PRESENTATION;
		} else {
			if (VERTICAL.equals(direction)) {
				displayKind = UMLVisualInformationPapyrusConstant.STEREOTYPE_TEXT_VERTICAL_PRESENTATION;
			} else {
				displayKind = UMLVisualInformationPapyrusConstant.STEREOTYPE_TEXT_HORIZONTAL_PRESENTATION;
			}
		}

		// be sure display corresponds to the real values
		updateCombos();
	}

	/**
	 * Updates the combo according to the current values hold by this action
	 */
	protected void updateCombos() {
		// udpate the direction and display combo
		/*
		 * VisualInformationPapyrusConstants.TEXT_ICON_STEREOTYPE_PRESENTATION,
		 * VisualInformationPapyrusConstants.ICON_STEREOTYPE_PRESENTATION,
		 * VisualInformationPapyrusConstants.IMAGE_STEREOTYPE_PRESENTATION,
		 * VisualInformationPapyrusConstant
		 * .STEREOTYPE_TEXT_HORIZONTAL_PRESENTATION,
		 * VisualInformationPapyrusConstant
		 * .STEREOTYPE_TEXT_VERTICAL_PRESENTATION
		 */
		if (UMLVisualInformationPapyrusConstant.TEXT_ICON_STEREOTYPE_PRESENTATION.equals(displayKind)) {
			displayCombo.select(DISPLAY_LIST.indexOf(TEXT_AND_ICON));
			directionCombo.select(DIRECTION_LIST.indexOf(HORIZONTAL));
			directionCombo.setEnabled(false);
		} else if (UMLVisualInformationPapyrusConstant.ICON_STEREOTYPE_PRESENTATION.equals(displayKind)) {
			displayCombo.select(DISPLAY_LIST.indexOf(ICON));
			directionCombo.select(DIRECTION_LIST.indexOf(HORIZONTAL));
			directionCombo.setEnabled(false);
		} else if (UMLVisualInformationPapyrusConstant.IMAGE_STEREOTYPE_PRESENTATION.equals(displayKind)) {
			displayCombo.select(DISPLAY_LIST.indexOf(SHAPE));
			directionCombo.select(DIRECTION_LIST.indexOf(HORIZONTAL));
			directionCombo.setEnabled(false);
		} else if (UMLVisualInformationPapyrusConstant.STEREOTYPE_TEXT_VERTICAL_PRESENTATION.equals(displayKind)) {
			displayCombo.select(DISPLAY_LIST.indexOf(TEXT));
			directionCombo.select(DIRECTION_LIST.indexOf(VERTICAL));
			directionCombo.setEnabled(true);
		} else {
			displayCombo.select(DISPLAY_LIST.indexOf(TEXT));
			directionCombo.select(DIRECTION_LIST.indexOf(HORIZONTAL));
			directionCombo.setEnabled(true);
		}

		// update the place combo
		/*
		 * VisualInformationPapyrusConstants.STEREOTYPE_COMMENT_LOCATION
		 * VisualInformationPapyrusConstants.STEREOTYPE_COMPARTMENT_LOCATION
		 * VisualInformationPapyrusConstants.STEREOTYPE_BRACE_LOCATION
		 */
		if (UMLVisualInformationPapyrusConstant.STEREOTYPE_COMMENT_LOCATION.equals(displayPlace)) {
			placeCombo.select(PLACE_LIST.indexOf(COMMENT));
		} else if (UMLVisualInformationPapyrusConstant.STEREOTYPE_BRACE_LOCATION.equals(displayPlace)) {
			placeCombo.select(PLACE_LIST.indexOf(BRACE));
		} else {
			placeCombo.select(PLACE_LIST.indexOf(COMPARTMENT));
		}
	}
}
