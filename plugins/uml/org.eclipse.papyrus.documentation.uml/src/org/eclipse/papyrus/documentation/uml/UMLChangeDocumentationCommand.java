/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.documentation.uml;

import java.util.Set;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.papyrus.documentation.IDocumentationChangedListener;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * A GEF Command use to update documentation using profiled Comment.
 * 
 */
public class UMLChangeDocumentationCommand extends AbstractCommand {

	private Element element;

	private String newCommentBody = null;

	private String oldCommentBody = null;

	private Comment documentationComment = null;

	private Set<IDocumentationChangedListener> documentationChangedListeners;

	public UMLChangeDocumentationCommand(Element element, String newDocumentation, Set<IDocumentationChangedListener> documentationChangedListeners) {
		super(org.eclipse.papyrus.documentation.Messages.ChangeDocCommandLabel);
		this.element = element;
		this.newCommentBody = newDocumentation;
		this.documentationChangedListeners = documentationChangedListeners;
	}

	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public boolean canUndo() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	public void execute() {
		documentationComment = UMLDocumentationUtil.getOrCreateDocumentationComment(element);

		// stores the previous doc
		oldCommentBody = documentationComment.getBody();

		redo();
	}

	private void notifyListeners() {
		for(IDocumentationChangedListener listener : documentationChangedListeners) {
			listener.documentationChanged(element);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void redo() {
		documentationComment.setBody(newCommentBody);
		notifyListeners();
	}

	/**
	 * {@inheritDoc}
	 */
	public void undo() {
		documentationComment.setBody(oldCommentBody);
		notifyListeners();
	}

}
