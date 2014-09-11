package org.eclipse.papyrus.uml.profile.drafter.ui.contentassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * A {@link IContentProposalProvider} providing Stereotype names that can be applied to the specified {@link NamedElement}.
 * 
 * @author cedric dumoulin
 *
 */
public class PossibleStereotypeContentProposalProvider implements IContentProposalProvider {

	/**
	 * The uml element to which Stereotypes should be applied.
	 */
	private Element umlElement;
	
	/**
	 * Constructor.
	 *
	 * @param stereotypes
	 */
	public PossibleStereotypeContentProposalProvider(Element umlElement) {
		this.umlElement = umlElement;
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
		
		List<AbstractStereotypeContentProposal> shortProposals = new ArrayList<AbstractStereotypeContentProposal>();
		List<AbstractStereotypeContentProposal> longProposals = new ArrayList<AbstractStereotypeContentProposal>();
		
		// Get already applied stereotypes.
		List<Stereotype> appliedStereotypes = umlElement.getAppliedStereotypes();

		for( Stereotype st : appliedStereotypes) {
			final String simpleName = st.getName();
			final String qualifiedName = st.getQualifiedName();

			if(match(simpleName, contents, position)) {
				shortProposals.add(new StereotypeNameContentProposal(st));
			}

			if(match(qualifiedName, contents, position)) {
				longProposals.add(new StereotypeQualifiedNameContentProposal(st));
			}
			
		}

		// Get applicable stereotypes.
		List<Stereotype> applicableStereotypes = umlElement.getApplicableStereotypes();

		for( Stereotype st : applicableStereotypes) {
			if( appliedStereotypes.contains(st)) {
				// Skip if we have already added it
				continue;
			}
			
			final String simpleName = st.getName();
			final String qualifiedName = st.getQualifiedName();

			if(match(simpleName, contents, position)) {
				shortProposals.add(new StereotypeNameContentProposal(st));
			}

			if(match(qualifiedName, contents, position)) {
				longProposals.add(new StereotypeQualifiedNameContentProposal(st));
			}
			
		}


		// Now concat both list
		Collections.sort(shortProposals);
		Collections.sort(longProposals);
		
		shortProposals.addAll(longProposals);
		return shortProposals.toArray(new IContentProposal[shortProposals.size()]);
	}


	/**
	 * Return true if the actual proposal math the provided name. False otherwise.
	 * 
	 * @param name The name to check
	 * @param proposal The actual proposal of user
	 * @param position The cursor position in the user proposal.
	 * @return
	 */
	private boolean match(final String name, String proposal, int position) {
		return position < name.length() && proposal.substring(0, position).equalsIgnoreCase(name.substring(0, position));
	}

}
