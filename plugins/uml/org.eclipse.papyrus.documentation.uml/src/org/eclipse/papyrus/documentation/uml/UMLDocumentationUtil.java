/*****************************************************************************
 * Copyright (c) 2012 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.documentation.uml;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.uml.profile.IUMLDocumentationConstants;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;


public class UMLDocumentationUtil {

	public static void removeDocumentationComment(Element element) {
		Comment documentationComment = getDocumentationComment(element);

		if(documentationComment != null) {
			Stereotype documentationStereotype = documentationComment.getAppliedStereotype(IUMLDocumentationConstants.STEREOTYPE_QUALIFIED_NAME);
			if(documentationStereotype != null) {
				documentationComment.unapplyStereotype(documentationStereotype);
			}
			element.getOwnedComments().remove(documentationComment);
			documentationComment = null;
		}
	}

	public static Comment getDocumentationComment(Element element) {
		for(Comment comment : element.getOwnedComments()) {
			Stereotype documentationStereotype = comment.getAppliedStereotype(IUMLDocumentationConstants.STEREOTYPE_QUALIFIED_NAME);
			if(documentationStereotype != null) {
				return comment;
			}
		}
		return null;
	}

	public static Comment getOrCreateDocumentationComment(Element element) {
		Comment documentationComment = getDocumentationComment(element);
		if (documentationComment == null) {
			documentationComment = createDocumentationComment(element);
		}
		return documentationComment;
	}

	public static Comment createDocumentationComment(Element element) {
		Comment documentationComment = UMLFactory.eINSTANCE.createComment();
		element.getOwnedComments().add(documentationComment);
		applyDocumentationStereotype(documentationComment);
		return documentationComment;
	}

	public static void applyDocumentationStereotype(Comment comment) {

		Profile documentationProfile = comment.getNearestPackage().getAppliedProfile(IUMLDocumentationConstants.PROFILE_NAME, true);

		if(documentationProfile == null) {
			ResourceSet rs = null;
			Resource resource = comment.eResource();
			if(resource != null) {
				rs = resource.getResourceSet();
			}
			if (rs == null) {
				rs = new ResourceSetImpl();
			}

			Resource papyrusProfileResource = rs.getResource(URI.createURI(IUMLDocumentationConstants.PROFILE_URI), true);

			if(papyrusProfileResource != null && !papyrusProfileResource.getContents().isEmpty() && papyrusProfileResource.getContents().get(0) instanceof Profile) {
				Profile papyrusProfile = (Profile)papyrusProfileResource.getContents().get(0);

				NamedElement possibleDocumentationProfile = papyrusProfile.getMember(IUMLDocumentationConstants.DOCUMENTATION_SUB_PROFILE_NAME);

				if (possibleDocumentationProfile instanceof Profile) {
					documentationProfile = (Profile)possibleDocumentationProfile;
					comment.getNearestPackage().applyProfile(documentationProfile);
				}
			}

		}

		if (documentationProfile != null) {
			Stereotype documentationStereotype = documentationProfile.getOwnedStereotype(IUMLDocumentationConstants.STEREOTYPE_NAME);

			if(documentationStereotype != null) {
				comment.applyStereotype(documentationStereotype);
			}
		}
	}
}
