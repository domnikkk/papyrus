/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.revision.tool.ui;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.revision.tool.core.I_ReviewStereotype;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Package;

/**
 * content provider to display reviews
 *
 */
public class ReviewsTreeContentProvider implements ITreeContentProvider{

	private static Object[] EMPTY={};
	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		if( inputElement instanceof org.eclipse.uml2.uml.Package){
			Package package1=(Package)inputElement;
			if(package1.getAppliedStereotype(I_ReviewStereotype.REVIEWREPOSITORY_STEREOTYPE)!=null){
				return ((org.eclipse.uml2.uml.Package)inputElement).getOwnedComments().toArray();
			}
		}
		if(inputElement instanceof Comment ){
			Comment cmt=(Comment)inputElement;
			if(cmt.getApplicableStereotype(I_ReviewStereotype.REVIEW_STEREOTYPE)!=null){
				((Comment)inputElement).getOwnedComments().toArray();
			}
		}
		return  EMPTY;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if( parentElement instanceof org.eclipse.uml2.uml.Package){
			Package package1=(Package)parentElement;
			if(package1.getAppliedStereotype(I_ReviewStereotype.REVIEWREPOSITORY_STEREOTYPE)!=null){
				return ((org.eclipse.uml2.uml.Package)parentElement).getOwnedComments().toArray();
			}
		}
		if(parentElement instanceof Comment ){
			Comment cmt=(Comment)parentElement;
			if(cmt.getApplicableStereotype(I_ReviewStereotype.REVIEW_STEREOTYPE)!=null){
				return ((Comment)parentElement).getOwnedComments().toArray();
			}
		}
		return EMPTY;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof Comment ){
			return (((Comment)element).getOwnedComments().size()>0);
		}
		return false;
	}

}
