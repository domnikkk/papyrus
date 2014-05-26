package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class NewSterotypeDialog2 extends Dialog {
	private Text text;
	private Text metaclassesInput;
	private Text text_1;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public NewSterotypeDialog2(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		RowLayout rl_container = new RowLayout(SWT.VERTICAL);
		rl_container.wrap = false;
		container.setLayout(rl_container);
		
		Composite quickSetGroup = new Composite(container, SWT.NONE);
		GridLayout gl_quickSetGroup = new GridLayout(2, false);
		gl_quickSetGroup.horizontalSpacing = 1;
		quickSetGroup.setLayout(gl_quickSetGroup);
		
		Label lblNewLabel = new Label(quickSetGroup, SWT.NONE);
		lblNewLabel.setSize(0, 20);
		lblNewLabel.setText("Quick Set");
		
		text = new Text(quickSetGroup, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_text.widthHint = 232;
		text.setLayoutData(gd_text);
		text.setSize(214, 26);
		
		Composite metaclassesGroup = new Composite(container, SWT.NONE);
		RowLayout rl_metaclassesGroup = new RowLayout(SWT.VERTICAL);
		rl_metaclassesGroup.fill = true;
		metaclassesGroup.setLayout(rl_metaclassesGroup);
		
		Composite composite = new Composite(metaclassesGroup, SWT.NONE);
		composite.setLayoutData(new RowData(396, SWT.DEFAULT));
		composite.setLayout(new GridLayout(3, false));
		
		Label metaclassesLabel = new Label(composite, SWT.NONE);
		metaclassesLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		metaclassesLabel.setText("New Metaclasses");
		
		metaclassesInput = new Text(composite, SWT.BORDER);
		metaclassesInput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnAdd = new Button(composite, SWT.NONE);
		btnAdd.setText("Add");
		
		List metaclassToAdd = new List(metaclassesGroup, SWT.BORDER);
		
		List existingMetaclass = new List(metaclassesGroup, SWT.BORDER);
		
		Composite extendedStereotypes = new Composite(container, SWT.NONE);
		RowLayout rl_extendedStereotypes = new RowLayout(SWT.VERTICAL);
		rl_extendedStereotypes.fill = true;
		extendedStereotypes.setLayout(rl_extendedStereotypes);
		
		Composite composite_2 = new Composite(extendedStereotypes, SWT.NONE);
		composite_2.setLayoutData(new RowData(396, -1));
		composite_2.setLayout(new GridLayout(3, false));
		
		Label lblExtendingMetaclasses = new Label(composite_2, SWT.NONE);
		lblExtendingMetaclasses.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblExtendingMetaclasses.setText("Extending Metaclasses");
		
		text_1 = new Text(composite_2, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button = new Button(composite_2, SWT.NONE);
		button.setText("Add");
		
		List extensionsToAdd = new List(extendedStereotypes, SWT.BORDER);
		
		List existingExtensions = new List(extendedStereotypes, SWT.BORDER);

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 541);
	}
}
