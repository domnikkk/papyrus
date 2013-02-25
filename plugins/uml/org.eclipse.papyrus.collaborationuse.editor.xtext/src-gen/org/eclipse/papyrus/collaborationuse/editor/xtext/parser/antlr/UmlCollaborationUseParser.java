/*
* generated by Xtext
*/
package org.eclipse.papyrus.collaborationuse.editor.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.papyrus.collaborationuse.editor.xtext.services.UmlCollaborationUseGrammarAccess;

public class UmlCollaborationUseParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private UmlCollaborationUseGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.papyrus.collaborationuse.editor.xtext.parser.antlr.internal.InternalUmlCollaborationUseParser createParser(XtextTokenStream stream) {
		return new org.eclipse.papyrus.collaborationuse.editor.xtext.parser.antlr.internal.InternalUmlCollaborationUseParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "CollaborationUseRule";
	}
	
	public UmlCollaborationUseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(UmlCollaborationUseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}