package org.eclipse.papyrus.uml.textedit.parameter.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.textedit.common.xtext.serializer.UmlCommonSemanticSequencer;
import org.eclipse.papyrus.uml.textedit.common.xtext.umlCommon.BoundSpecification;
import org.eclipse.papyrus.uml.textedit.common.xtext.umlCommon.MultiplicityRule;
import org.eclipse.papyrus.uml.textedit.common.xtext.umlCommon.QualifiedName;
import org.eclipse.papyrus.uml.textedit.common.xtext.umlCommon.TypeRule;
import org.eclipse.papyrus.uml.textedit.common.xtext.umlCommon.UmlCommonPackage;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.services.UmlParameterGrammarAccess;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.BooleanValue;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.DefaultValueRule;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.DirectionRule;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.EffectRule;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.IntValue;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.ModifierSpecification;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.ModifiersRule;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.NoValue;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.NullValue;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.ParameterRule;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.RealValue;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.StringValue;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.UmlParameterPackage;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.umlParameter.VisibilityRule;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UmlParameterSemanticSequencer extends UmlCommonSemanticSequencer {

	@Inject
	private UmlParameterGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == UmlCommonPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UmlCommonPackage.BOUND_SPECIFICATION:
				if(context == grammarAccess.getBoundSpecificationRule()) {
					sequence_BoundSpecification(context, (BoundSpecification) semanticObject); 
					return; 
				}
				else break;
			case UmlCommonPackage.MULTIPLICITY_RULE:
				if(context == grammarAccess.getMultiplicityRuleRule()) {
					sequence_MultiplicityRule(context, (MultiplicityRule) semanticObject); 
					return; 
				}
				else break;
			case UmlCommonPackage.QUALIFIED_NAME:
				if(context == grammarAccess.getQualifiedNameRule()) {
					sequence_QualifiedName(context, (QualifiedName) semanticObject); 
					return; 
				}
				else break;
			case UmlCommonPackage.TYPE_RULE:
				if(context == grammarAccess.getTypeRuleRule()) {
					sequence_TypeRule(context, (TypeRule) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UmlParameterPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UmlParameterPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.DEFAULT_VALUE_RULE:
				if(context == grammarAccess.getDefaultValueRuleRule()) {
					sequence_DefaultValueRule(context, (DefaultValueRule) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.DIRECTION_RULE:
				if(context == grammarAccess.getDirectionRuleRule()) {
					sequence_DirectionRule(context, (DirectionRule) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.EFFECT_RULE:
				if(context == grammarAccess.getEffectRuleRule()) {
					sequence_EffectRule(context, (EffectRule) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.INT_VALUE:
				if(context == grammarAccess.getIntValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntValue(context, (IntValue) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.MODIFIER_SPECIFICATION:
				if(context == grammarAccess.getModifierSpecificationRule()) {
					sequence_ModifierSpecification(context, (ModifierSpecification) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.MODIFIERS_RULE:
				if(context == grammarAccess.getModifiersRuleRule()) {
					sequence_ModifiersRule(context, (ModifiersRule) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.NO_VALUE:
				if(context == grammarAccess.getNoValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NoValue(context, (NoValue) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.NULL_VALUE:
				if(context == grammarAccess.getNullValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NullValue(context, (NullValue) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.PARAMETER_RULE:
				if(context == grammarAccess.getParameterRuleRule()) {
					sequence_ParameterRule(context, (ParameterRule) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.REAL_VALUE:
				if(context == grammarAccess.getRealValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_RealValue(context, (RealValue) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.STRING_VALUE:
				if(context == grammarAccess.getStringValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case UmlParameterPackage.VISIBILITY_RULE:
				if(context == grammarAccess.getVisibilityRuleRule()) {
					sequence_VisibilityRule(context, (VisibilityRule) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     literalBoolean=BooleanLiterals
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmlParameterPackage.Literals.BOOLEAN_VALUE__LITERAL_BOOLEAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlParameterPackage.Literals.BOOLEAN_VALUE__LITERAL_BOOLEAN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0(), semanticObject.getLiteralBoolean());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     default=Value
	 */
	protected void sequence_DefaultValueRule(EObject context, DefaultValueRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmlParameterPackage.Literals.DEFAULT_VALUE_RULE__DEFAULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlParameterPackage.Literals.DEFAULT_VALUE_RULE__DEFAULT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0(), semanticObject.getDefault());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     direction=Direction
	 */
	protected void sequence_DirectionRule(EObject context, DirectionRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmlParameterPackage.Literals.DIRECTION_RULE__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlParameterPackage.Literals.DIRECTION_RULE__DIRECTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDirectionRuleAccess().getDirectionDirectionEnumRuleCall_0(), semanticObject.getDirection());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     effectKind=EffectKind
	 */
	protected void sequence_EffectRule(EObject context, EffectRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmlParameterPackage.Literals.EFFECT_RULE__EFFECT_KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlParameterPackage.Literals.EFFECT_RULE__EFFECT_KIND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEffectRuleAccess().getEffectKindEffectKindEnumRuleCall_2_0(), semanticObject.getEffectKind());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literalInteger=INT
	 */
	protected void sequence_IntValue(EObject context, IntValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmlParameterPackage.Literals.INT_VALUE__LITERAL_INTEGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlParameterPackage.Literals.INT_VALUE__LITERAL_INTEGER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntValueAccess().getLiteralIntegerINTTerminalRuleCall_0(), semanticObject.getLiteralInteger());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=ModifierKind
	 */
	protected void sequence_ModifierSpecification(EObject context, ModifierSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmlParameterPackage.Literals.MODIFIER_SPECIFICATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlParameterPackage.Literals.MODIFIER_SPECIFICATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((values+=ModifierSpecification values+=ModifierSpecification*)?)
	 */
	protected void sequence_ModifiersRule(EObject context, ModifiersRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NoValue}
	 */
	protected void sequence_NoValue(EObject context, NoValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullValue}
	 */
	protected void sequence_NullValue(EObject context, NullValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visibility=VisibilityRule? 
	 *         direction=DirectionRule? 
	 *         name=ID 
	 *         (type=TypeRule | typeUndefined?='<Undefined>')? 
	 *         multiplicity=MultiplicityRule? 
	 *         modifiers=ModifiersRule? 
	 *         effect=EffectRule? 
	 *         defaultValue=DefaultValueRule?
	 *     )
	 */
	protected void sequence_ParameterRule(EObject context, ParameterRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (integer=INT | fraction=INT | (integer=INT fraction=INT))
	 */
	protected void sequence_RealValue(EObject context, RealValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     literalString=STRING
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmlParameterPackage.Literals.STRING_VALUE__LITERAL_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlParameterPackage.Literals.STRING_VALUE__LITERAL_STRING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringValueAccess().getLiteralStringSTRINGTerminalRuleCall_0(), semanticObject.getLiteralString());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     visibility=VisibilityKind
	 */
	protected void sequence_VisibilityRule(EObject context, VisibilityRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmlParameterPackage.Literals.VISIBILITY_RULE__VISIBILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlParameterPackage.Literals.VISIBILITY_RULE__VISIBILITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0(), semanticObject.getVisibility());
		feeder.finish();
	}
}
