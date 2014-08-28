package org.eclipse.papyrus.uml.alf.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.alf.services.CommonGrammarAccess;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class CommonSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CommonGrammarAccess grammarAccess;

	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if (errorAcceptor != null) {
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
		}
	}

}
