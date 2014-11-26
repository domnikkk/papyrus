package org.eclipse.papyrus.uml.profile.drafter.ui.contentassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog;
import org.eclipse.uml2.uml.Type;

/**
 * A {@link IContentProposalProvider} providing {@link Type} names.
 * 
 * @author cedric dumoulin
 *
 * TODO : 20141126 not used - can be removed

 */
public class TypeContentProposalProvider implements IContentProposalProvider {

	/**
	 * The types that will be proposed.
	 */
	private ITypeCatalog typeCatalog;

	/**
	 * Constructor.
	 *
	 * @param stereotypes
	 */
	public TypeContentProposalProvider(ITypeCatalog typeCatalog) {
		this.typeCatalog = typeCatalog;
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
		
		List<TypeContentProposalBase> shortProposals = new ArrayList<TypeContentProposalBase>();
		List<TypeContentProposalBase> longProposals = new ArrayList<TypeContentProposalBase>();
		

		List<Type> types = typeCatalog.getTypes();
		
		for( Type type : types) {
			final String simpleName = type.getName();
			final String qualifiedName = type.getQualifiedName();

			if(match(simpleName, contents, position)) {
				shortProposals.add(new TypeShortNameContentProposal(type));
			}

			if(match(qualifiedName, contents, position)) {
				longProposals.add(new TypeQualifiedNameContentProposal(type));
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
