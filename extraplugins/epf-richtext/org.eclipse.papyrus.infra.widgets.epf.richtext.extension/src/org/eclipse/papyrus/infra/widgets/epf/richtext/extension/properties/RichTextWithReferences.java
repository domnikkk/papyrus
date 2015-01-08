/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 * 
 *****************************************************************************/
package org.eclipse.papyrus.infra.widgets.epf.richtext.extension.properties;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.emf.utils.TextReferencesHelper;
import org.eclipse.papyrus.infra.widgets.editors.ICommitListener;
import org.eclipse.papyrus.infra.widgets.epf.richtext.extension.RichTextValueEditor;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;
import org.eclipse.papyrus.views.properties.widgets.AbstractPropertyEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * A rich text property editor with support for TextReferences.
 * 
 * @author Mickael ADAM
 *
 * @see {@link org.eclipse.papyrus.infra.emf.utils.TextReferencesHelper}
 */
public class RichTextWithReferences extends AbstractPropertyEditor {

	/** The text references helper. */
	protected TextReferencesHelper textReferencesHelper;

	/** The editor. */
	protected RichTextEditorWithReferences editor;

	/**
	 * Instantiates a new rich text with references.
	 *
	 * @param parent
	 *        the parent
	 * @param style
	 *        the style
	 */
	public RichTextWithReferences(Composite parent, int style) {
		super();
		setEditor(editor = new RichTextEditorWithReferences(parent, style));
	}

	/**
	 * Sets the text references helper.
	 *
	 * @param helper
	 *        the new text references helper
	 */
	public void setTextReferencesHelper(TextReferencesHelper helper) {
		this.textReferencesHelper = helper;
		editor.setTextReferencesHelper(helper);
		//		installDropListener();
	}

	/**
	 * Do binding.
	 *
	 * @see org.eclipse.papyrus.views.properties.widgets.AbstractPropertyEditor#doBinding()
	 */
	@Override
	protected void doBinding() {
		super.doBinding();
		IStaticContentProvider provider = input.getContentProvider(propertyPath);
		if(provider != null) {
			editor.setReferenceBrowserContentProvider(provider);
		}
		if(getInputObservableValue() instanceof ICommitListener) {
			editor.addCommitListener((ICommitListener)getInputObservableValue());
		}
	}

	/**
	 * Gets the rich text editor.
	 *
	 * @return the rich text editor
	 */
	protected RichTextValueEditor getRichTextEditor() {
		return (RichTextValueEditor)valueEditor;
	}

	/**
	 * Sets the content provider.
	 *
	 * @param provider
	 *        the new content provider
	 */
	protected void setContentProvider(IStaticContentProvider provider) {
		editor.setReferenceBrowserContentProvider(provider);
	}

	/**
	 * Sets the label provider.
	 *
	 * @param labelProvider
	 *        the new label provider
	 */
	protected void setLabelProvider(ILabelProvider labelProvider) {
		editor.setLabelProvider(labelProvider);
	}
}
