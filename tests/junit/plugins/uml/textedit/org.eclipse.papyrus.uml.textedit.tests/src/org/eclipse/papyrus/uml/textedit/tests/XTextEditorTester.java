package org.eclipse.papyrus.uml.textedit.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.papyrus.uml.xtext.integration.DefaultXtextDirectEditorConfiguration;

public class XTextEditorTester<T extends EObject> {

	protected DefaultXtextDirectEditorConfiguration editor;

	public XTextEditorTester(DefaultXtextDirectEditorConfiguration editor){
		this.editor = editor;
	}

	public T parseText(T initialElement, String textToParse) throws Exception{
		IParser parser = editor.createParser(initialElement);
		ICommand parseCommand = parser.getParseCommand(new EObjectAdapter(initialElement), textToParse, 0);
		parseCommand.execute(new NullProgressMonitor(), null);

		return initialElement;
	}

	public String getInitialText(T element){
		return editor.getTextToEdit(element);
	}

}
