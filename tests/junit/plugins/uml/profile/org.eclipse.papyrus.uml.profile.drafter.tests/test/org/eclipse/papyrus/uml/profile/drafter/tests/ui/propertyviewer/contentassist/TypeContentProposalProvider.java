package org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer.contentassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer.Type;
import org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer.TypeLibrary;

/**
 * A {@link IContentProposalProvider} providing {@link Type} names.
 * 
 * @author cedric dumoulin
 *
 */
public class TypeContentProposalProvider implements IContentProposalProvider {

	/**
	 * The types that will be proposed.
	 */
	private TypeLibrary typeCatalog;

	/**
	 * Constructor.
	 *
	 * @param stereotypes
	 */
	public TypeContentProposalProvider(TypeLibrary typeCatalog) {
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
		

		List<Type> types = typeCatalog.getTypes();
		
		for( Type type : types) {
			final String simpleName = type.getName();

			if(match(simpleName, contents, position)) {
				shortProposals.add(new TypeContentProposal(type));
			}
		}

		// Now concat both list
		Collections.sort(shortProposals);
		
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
