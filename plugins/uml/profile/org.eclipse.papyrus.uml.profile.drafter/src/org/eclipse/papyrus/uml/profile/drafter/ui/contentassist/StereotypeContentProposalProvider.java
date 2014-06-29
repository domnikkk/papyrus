package org.eclipse.papyrus.uml.profile.drafter.ui.contentassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * @author cedric dumoulin
 *
 */
public class StereotypeContentProposalProvider implements IContentProposalProvider {

	/**
	 * List of {@link Stereotype}s  to provide as proposals.
	 */
	private List<Stereotype> stereotypes;
	
	
	/**
	 * Constructor.
	 *
	 * @param stereotypes
	 */
	public StereotypeContentProposalProvider(List<Stereotype> stereotypes) {
		this.stereotypes = stereotypes;
	}


	/**
	 * 
	 * @see org.eclipse.jface.fieldassist.IContentProposalProvider#getProposals(java.lang.String, int)
	 *
	 * @param contents
	 * @param position
	 * @return
	 */
	public IContentProposal[] getProposals(String contents, int position) {
		
		List<StereotypeContentProvider> proposals = new ArrayList<StereotypeContentProvider>();
		
		if(! stereotypes.isEmpty()) {
			for( Stereotype st : stereotypes) {
				final String simpleName = st.getName();
				final String qualifiedName = st.getQualifiedName();

				if(position < simpleName.length() && contents.substring(0, position).equalsIgnoreCase(simpleName.substring(0, position))) {
					proposals.add(new StereotypeContentProvider(st));
				}

				if(position < qualifiedName.length() && contents.substring(0, position).equalsIgnoreCase(qualifiedName.substring(0, position))) {
					proposals.add(new StereotypeContentProvider(st));
				}
				
			}
		}
		Collections.sort(proposals);
		return proposals.toArray(new StereotypeContentProvider[proposals.size()]);
	}

}
