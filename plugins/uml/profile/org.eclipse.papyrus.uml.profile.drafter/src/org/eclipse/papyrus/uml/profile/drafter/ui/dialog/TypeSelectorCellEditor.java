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

package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.papyrus.uml.profile.drafter.ui.contentassist.TypeContentProposalBase;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Type;


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
	protected ITypeCatalog typeCatalog;
	
	protected Type type;
	
	/**
	 * Constructor.
	 *
	 */
	public TypeSelectorCellEditor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor.
	 *
	 * @param parent
	 */
	public TypeSelectorCellEditor(Composite parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor.
	 *
	 * @param parent
	 * @param style
	 */
	public TypeSelectorCellEditor(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
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
		// Install content assist
		
		
		return control;
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
		adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);

		// Listener called when a selection is made.
		// Use the associated type to set the Type.
		adapter.addContentProposalListener(new IContentProposalListener() {
			
			@Override
			public void proposalAccepted(IContentProposal proposal) {
				// set the corresponding type
				if( proposal instanceof TypeContentProposalBase ) {
					TypeContentProposalBase typeProposal = (TypeContentProposalBase)proposal;
//					setType(typeProposal.getType());
				}
				
			}
		});

	}


}
