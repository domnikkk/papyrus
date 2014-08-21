package org.eclipse.papyrus.uml.textedit.connectionpointreference.xtext.serializer;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.textedit.connectionpointreference.xtext.services.UMLConnectionPointReferenceGrammarAccess;
import org.eclipse.papyrus.uml.textedit.connectionpointreference.xtext.uMLConnectionPointReference.ConnectionPointReferenceRule;
import org.eclipse.papyrus.uml.textedit.connectionpointreference.xtext.uMLConnectionPointReference.UMLConnectionPointReferencePackage;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class UMLConnectionPointReferenceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UMLConnectionPointReferenceGrammarAccess grammarAccess;

	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if (semanticObject.eClass().getEPackage() == UMLConnectionPointReferencePackage.eINSTANCE) {
			switch (semanticObject.eClass().getClassifierID()) {
			case UMLConnectionPointReferencePackage.CONNECTION_POINT_REFERENCE_RULE:
				if (context == grammarAccess.getConnectionPointReferenceRuleRule()) {
					sequence_ConnectionPointReferenceRule(context, (ConnectionPointReferenceRule) semanticObject);
					return;
				} else {
					break;
				}
			}
		}
		if (errorAcceptor != null) {
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
		}
	}

	/**
	 * Constraint:
	 * ((entry+=[Pseudostate|ID] entry+=[Pseudostate|ID]*) | (exit+=[Pseudostate|ID] exit+=[Pseudostate|ID]*))?
	 */
	protected void sequence_ConnectionPointReferenceRule(EObject context, ConnectionPointReferenceRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
