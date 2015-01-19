/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer.contentassist.TypeContentProposal;
import org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer.contentassist.TypeContentProposalProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;


/**
 * A {@link TextCellEditor} with content assist.
 * 
 * @author cedric dumoulin
 *
 */
public class TypeSelectorCellEditor extends TextCellEditor {

	/**
	 * Type catalog used to propose existing types.
	 */
	protected TypeLibrary typeCatalog;
	
	protected Type type;
	
	/**
	 * Label provider for type names
	 */
	protected ILabelProvider typeLabelProvider;
	
	/**
	 * Constructor.
	 *
	 */
	public TypeSelectorCellEditor( TypeLibrary typeLibrary, ILabelProvider typeLabelProvider) {
		this.typeCatalog = typeLibrary;
		this.typeLabelProvider = typeLabelProvider;
		setDefaultType();
		// Try to install content assist
		// Content assist is not installed if this method is called for the first time from the Constructor.
		// This is because the typeCatalog is not set.
		// So constructors need to also try to set the content assist, after typeCatalog is set.
		installContentAssistantProvider();
	}

	/**
	 * Constructor.
	 *
	 * @param parent
	 * @param typeLibrary 
	 */
	public TypeSelectorCellEditor(Composite parent, TypeLibrary typeLibrary, ILabelProvider typeLabelProvider) {
		super(parent);
		this.typeCatalog = typeLibrary;
		this.typeLabelProvider = typeLabelProvider;
		setDefaultType();
		// Try to install content assist
		// Content assist is not installed if this method is called for the first time from the Constructor.
		// This is because the typeCatalog is not set.
		// So constructors need to also try to set the content assist, after typeCatalog is set.
		installContentAssistantProvider();
	}

	/**
	 * Constructor.
	 *
	 * @param parent
	 * @param style
	 */
	public TypeSelectorCellEditor(Composite parent, int style, TypeLibrary typeLibrary, ILabelProvider typeLabelProvider) {
		super(parent, style);
		this.typeCatalog = typeLibrary;
		this.typeLabelProvider = typeLabelProvider;
		setDefaultType();
		// Try to install content assist
		// Content assist is not installed if this method is called for the first time from the Constructor.
		// This is because the typeCatalog is not set.
		// So constructors need to also try to set the content assist, after typeCatalog is set.
		installContentAssistantProvider();
	}

	/**
	 * Call parent to create the {@link Text} and install contentAssist
	 * @see org.eclipse.jface.viewers.TextCellEditor#createControl(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 * @return
	 */
	protected Control createControl(Composite parent) {

		Control control = super.createControl(parent);
		// Try to install content assist
		// Content assist is not installed if this method is called for the first time from the Constructor.
		// This is because the typeCatalog is not set.
		// So constructors need to also try to set the content assist, after typeCatalog is set.
		installContentAssistantProvider();
		
		return control;
	}
	
	/**
	 * Install the ContentAssistant if all required property are already set.
	 * 
	 */
	protected void installContentAssistantProvider() {
		
		if( text==null || typeCatalog == null ) {
			return;
		}
		
		installContentAssistantProvider( new TypeContentProposalProvider(typeCatalog));
	}
	
	/**
	 * Install content assistant provider.
	 * 
	 * @param control The control to which content assist is installed.
	 *
	 * @param contentProposalProvider The associated {@link ContentProposalAdapter}.
	 */
	protected void installContentAssistantProvider( IContentProposalProvider contentProposalProvider) {
//		KeyStroke keyStroke = KeyStroke.getInstance("Ctrl+Space");
		KeyStroke keyStroke = null;
		char[] autoActivationCharacters = null;
		int autoActivationDelay = 500;

		ContentProposalAdapter adapter = new ContentProposalAdapter(text, new TextContentAdapter(), contentProposalProvider, keyStroke, autoActivationCharacters);
		adapter.setAutoActivationDelay(autoActivationDelay);

		// filter proposals as keys are pressed and proposals popup is present
		adapter.setFilterStyle(ContentProposalAdapter.FILTER_NONE);

		// replace all text
		adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_IGNORE);

		// Listener called when a selection is made.
		// Use the associated type to set the Type.
		adapter.addContentProposalListener(new IContentProposalListener() {
			
			@Override
			public void proposalAccepted(IContentProposal proposal) {
				// set the corresponding type
				if( proposal instanceof TypeContentProposal ) {
					TypeContentProposal typeProposal = (TypeContentProposal)proposal;
					setType(typeProposal.getType());
				}
				
			}
		});

	}

	public Type getType() {
		return type;
	}
	
	public void setType( Type type) {
		setValue(type);
	}
	
	public void setDefaultType() {
		setValue(typeCatalog.getDefaultType());
	}
	
	@Override
	protected void doSetValue(Object value) {
        Assert.isTrue(value != null && (value instanceof Type));
		type = (Type)value;
		super.doSetValue(typeLabelProvider.getText(type));
	}
	
	@Override
	protected Object doGetValue() {
		return type;
	}
}
