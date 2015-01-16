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
package org.eclipse.papyrus.revision.tool.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.papyrus.infra.widgets.editors.MultipleValueSelectorDialog;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;
import org.eclipse.papyrus.infra.widgets.selectors.ReferenceSelector;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.papyrus.revision.tool.ui.ReviewsEditor;
import org.eclipse.papyrus.uml.tools.providers.UMLContentProvider;
import org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This handler is used to connect a review to an element of the working model.
 */
public class HookReviewHandler extends RevisionAbstractHandler {
	protected static final String CHOOSE_ELEMENT_TO_COMMENT = "Choose Element to comment";
	/**
	 * The constructor.
	 */
	public HookReviewHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Element element=getSelection();
		IWorkbenchPart part=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if( part instanceof ReviewsEditor&& (element instanceof Comment)){
			ReviewsEditor reviewsEditor=(ReviewsEditor)part;
			ReviewResourceManager reviewResourceManager= reviewsEditor.getReviewResourceManager();

			final IStaticContentProvider provider =new UMLContentProvider(reviewResourceManager.getWorkingModel(), UMLPackage.eINSTANCE.getPackage_PackagedElement());
			ReferenceSelector selector = new ReferenceSelector();
			selector.setLabelProvider(new UMLLabelProvider());
			selector.setContentProvider(provider);
			final MultipleValueSelectorDialog dialog = new MultipleValueSelectorDialog(Display.getDefault().getActiveShell(),selector,CHOOSE_ELEMENT_TO_COMMENT);

			dialog.setLabelProvider(new UMLLabelProvider());
			dialog.setMessage(CHOOSE_ELEMENT_TO_COMMENT);
			dialog.setTitle(CHOOSE_ELEMENT_TO_COMMENT);
			dialog.create();
			if(dialog.open() == org.eclipse.jface.window.Window.OK) {
				RecordingCommand cmd= new RecordingCommand(((ReviewsEditor)part).getReviewResourceManager().getDomain(), CHOOSE_ELEMENT_TO_COMMENT) {
					@Override
					protected void doExecute() {
						Object[] result=dialog.getResult();
						for (Object object : result) {
							if(object instanceof Element){
								((Comment)element).getAnnotatedElements().add((Element) object);
							}
						}
					}
				};
				((ReviewsEditor)part).getReviewResourceManager().getDomain().getCommandStack().execute(cmd);
			}
			
			
			
		}
		return null;
	}

}
