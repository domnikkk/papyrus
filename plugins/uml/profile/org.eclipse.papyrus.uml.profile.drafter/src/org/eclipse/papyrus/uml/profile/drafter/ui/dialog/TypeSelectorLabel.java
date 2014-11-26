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
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.uml.profile.drafter.ui.contentassist.TypeContentProposalBase;
import org.eclipse.papyrus.uml.profile.drafter.ui.contentassist.TypeContentProposalProvider;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Type;


/**
 * A Label used to select a uml {@link Type}.
 * 
 * @author cedric dumoulin
 * 
 * TODO : 20141126 not used - can be removed
 *
 */
public class TypeSelectorLabel extends Text {

	/**
	 * Type catalog used to propose existing types.
	 */
	protected ITypeCatalog typeProvider;
	
	protected ILabelProvider typeLabelProvider;
	
	protected Type type;
	
	/**
	 * Constructor.
	 *
	 * @param parent
	 * @param style
	 */
	public TypeSelectorLabel(Composite parent, int style, ITypeCatalog typeProvider, ILabelProvider typeLabelProvider, Type defaultType) {
		super(parent, style);
		
		this.typeProvider = typeProvider;
		this.typeLabelProvider = typeLabelProvider;
		// TODO: set first type
		setType(defaultType);
		
		// Set content assist
		installContentAssist();
	}

	/**
	 * Associate a ContentAssist based on the {@link ITypeCatalog}.
	 */
	private void installContentAssist() {
		installContentAssistantProvider( new TypeContentProposalProvider( typeProvider ));
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

		ContentProposalAdapter adapter = new ContentProposalAdapter(this, new TextContentAdapter(), contentProposalProvider, keyStroke, autoActivationCharacters);
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
					setType(typeProposal.getType());
				}
				
			}
		});

	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		
		String label = typeLabelProvider.getText(type);
		setText(label);
		
		setTypeInternal(type);
	}

	/**
	 * Set the type and throw an event.
	 * 
	 * @param type the type to set
	 */
	public void setTypeInternal(Type type) {
		this.type = type;
	}

	
}
