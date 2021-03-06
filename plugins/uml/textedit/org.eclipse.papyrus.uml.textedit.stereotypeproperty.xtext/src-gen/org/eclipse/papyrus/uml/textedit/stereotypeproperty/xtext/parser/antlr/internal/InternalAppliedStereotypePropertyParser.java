package org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.parser.antlr.internal;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.services.AppliedStereotypePropertyGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

@SuppressWarnings("all")
public class InternalAppliedStereotypePropertyParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER_VALUE", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'*'", "'++'", "'--'", "'::'", "'<'", "','", "'>'", "'=>'", "'('", "')'",
			"'?'", "':'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'instanceof'", "'hastype'", "'<='", "'>='", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'/'", "'%'", "'!'", "'$'", "'~'", "'.'", "'['", "']'", "'->'", "'reduce'", "'ordered'",
			"'isUnique'", "'null'", "'this'", "'super'", "'new'", "'{'", "'..'", "'}'", "'allInstances'", "'/*@'", "'inline'", "'*/'", "'//@'", "';'", "'let'", "'if'", "'else'", "'or'", "'switch'", "'case'", "'default'", "'while'", "'do'", "'for'", "'in'",
			"'break'", "'return'", "'accept'", "'classify'", "'from'", "'to'", "'true'", "'false'", "'createLink'", "'destroyLink'", "'clearAssoc'", "'select'", "'reject'", "'collect'", "'iterate'", "'forAll'", "'exists'", "'one'", "'isolated'",
			"'determined'", "'assured'", "'parallel'", "'+='", "'-='", "'*='", "'%='", "'/='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='"
	};
	public static final int RULE_ID = 6;
	public static final int T__29 = 29;
	public static final int T__28 = 28;
	public static final int T__27 = 27;
	public static final int T__26 = 26;
	public static final int T__25 = 25;
	public static final int T__24 = 24;
	public static final int T__23 = 23;
	public static final int T__22 = 22;
	public static final int RULE_ANY_OTHER = 11;
	public static final int T__21 = 21;
	public static final int T__20 = 20;
	public static final int RULE_INTEGER_VALUE = 4;
	public static final int EOF = -1;
	public static final int T__93 = 93;
	public static final int T__19 = 19;
	public static final int T__94 = 94;
	public static final int T__91 = 91;
	public static final int T__92 = 92;
	public static final int T__16 = 16;
	public static final int T__15 = 15;
	public static final int T__90 = 90;
	public static final int T__18 = 18;
	public static final int T__17 = 17;
	public static final int T__12 = 12;
	public static final int T__14 = 14;
	public static final int T__13 = 13;
	public static final int T__99 = 99;
	public static final int T__98 = 98;
	public static final int T__97 = 97;
	public static final int T__96 = 96;
	public static final int T__95 = 95;
	public static final int T__80 = 80;
	public static final int T__81 = 81;
	public static final int T__82 = 82;
	public static final int T__83 = 83;
	public static final int T__85 = 85;
	public static final int T__84 = 84;
	public static final int T__87 = 87;
	public static final int T__86 = 86;
	public static final int T__89 = 89;
	public static final int T__88 = 88;
	public static final int RULE_ML_COMMENT = 7;
	public static final int RULE_STRING = 5;
	public static final int T__71 = 71;
	public static final int T__72 = 72;
	public static final int T__70 = 70;
	public static final int T__76 = 76;
	public static final int T__75 = 75;
	public static final int T__74 = 74;
	public static final int T__73 = 73;
	public static final int T__79 = 79;
	public static final int T__78 = 78;
	public static final int T__77 = 77;
	public static final int T__68 = 68;
	public static final int T__69 = 69;
	public static final int T__66 = 66;
	public static final int T__67 = 67;
	public static final int T__64 = 64;
	public static final int T__65 = 65;
	public static final int T__62 = 62;
	public static final int T__63 = 63;
	public static final int T__61 = 61;
	public static final int T__60 = 60;
	public static final int T__55 = 55;
	public static final int T__56 = 56;
	public static final int T__57 = 57;
	public static final int T__58 = 58;
	public static final int T__51 = 51;
	public static final int T__52 = 52;
	public static final int T__53 = 53;
	public static final int T__54 = 54;
	public static final int T__107 = 107;
	public static final int T__108 = 108;
	public static final int T__109 = 109;
	public static final int T__103 = 103;
	public static final int T__59 = 59;
	public static final int T__104 = 104;
	public static final int T__105 = 105;
	public static final int T__106 = 106;
	public static final int RULE_INT = 9;
	public static final int T__50 = 50;
	public static final int T__42 = 42;
	public static final int T__43 = 43;
	public static final int T__40 = 40;
	public static final int T__41 = 41;
	public static final int T__46 = 46;
	public static final int T__47 = 47;
	public static final int T__44 = 44;
	public static final int T__45 = 45;
	public static final int T__48 = 48;
	public static final int T__49 = 49;
	public static final int T__102 = 102;
	public static final int T__101 = 101;
	public static final int T__100 = 100;
	public static final int RULE_SL_COMMENT = 8;
	public static final int T__30 = 30;
	public static final int T__31 = 31;
	public static final int T__32 = 32;
	public static final int T__33 = 33;
	public static final int T__34 = 34;
	public static final int T__35 = 35;
	public static final int T__36 = 36;
	public static final int T__37 = 37;
	public static final int T__38 = 38;
	public static final int T__39 = 39;
	public static final int RULE_WS = 10;

	// delegates
	// delegators


	public InternalAppliedStereotypePropertyParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalAppliedStereotypePropertyParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}


	@Override
	public String[] getTokenNames() {
		return InternalAppliedStereotypePropertyParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g";
	}



	private AppliedStereotypePropertyGrammarAccess grammarAccess;

	public InternalAppliedStereotypePropertyParser(TokenStream input, AppliedStereotypePropertyGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}

	@Override
	protected String getFirstRuleName() {
		return "AppliedStereotypePropertyRule";
	}

	@Override
	protected AppliedStereotypePropertyGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}



	// $ANTLR start "entryRuleAppliedStereotypePropertyRule"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:68:1: entryRuleAppliedStereotypePropertyRule returns [EObject
	// current=null] : iv_ruleAppliedStereotypePropertyRule= ruleAppliedStereotypePropertyRule EOF ;
	public final EObject entryRuleAppliedStereotypePropertyRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAppliedStereotypePropertyRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:69:2: (iv_ruleAppliedStereotypePropertyRule=
			// ruleAppliedStereotypePropertyRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:70:2: iv_ruleAppliedStereotypePropertyRule=
			// ruleAppliedStereotypePropertyRule EOF
			{
				newCompositeNode(grammarAccess.getAppliedStereotypePropertyRuleRule());
				pushFollow(FOLLOW_ruleAppliedStereotypePropertyRule_in_entryRuleAppliedStereotypePropertyRule75);
				iv_ruleAppliedStereotypePropertyRule = ruleAppliedStereotypePropertyRule();

				state._fsp--;

				current = iv_ruleAppliedStereotypePropertyRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAppliedStereotypePropertyRule85);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAppliedStereotypePropertyRule"


	// $ANTLR start "ruleAppliedStereotypePropertyRule"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:77:1: ruleAppliedStereotypePropertyRule returns [EObject
	// current=null] : ( (lv_value_0_0= ruleExpressionValueRule ) ) ;
	public final EObject ruleAppliedStereotypePropertyRule() throws RecognitionException {
		EObject current = null;

		EObject lv_value_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:80:28: ( ( (lv_value_0_0= ruleExpressionValueRule ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:81:1: ( (lv_value_0_0= ruleExpressionValueRule ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:81:1: ( (lv_value_0_0= ruleExpressionValueRule ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:82:1: (lv_value_0_0= ruleExpressionValueRule )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:82:1: (lv_value_0_0= ruleExpressionValueRule )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:83:3: lv_value_0_0= ruleExpressionValueRule
					{

						newCompositeNode(grammarAccess.getAppliedStereotypePropertyRuleAccess().getValueExpressionValueRuleParserRuleCall_0());

						pushFollow(FOLLOW_ruleExpressionValueRule_in_ruleAppliedStereotypePropertyRule130);
						lv_value_0_0 = ruleExpressionValueRule();

						state._fsp--;


						if (current == null) {
							current = createModelElementForParent(grammarAccess.getAppliedStereotypePropertyRuleRule());
						}
						set(
								current,
								"value",
								lv_value_0_0,
								"ExpressionValueRule");
						afterParserOrEnumRuleCall();


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAppliedStereotypePropertyRule"


	// $ANTLR start "entryRuleExpressionValueRule"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:107:1: entryRuleExpressionValueRule returns [EObject current=null] :
	// iv_ruleExpressionValueRule= ruleExpressionValueRule EOF ;
	public final EObject entryRuleExpressionValueRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleExpressionValueRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:108:2: (iv_ruleExpressionValueRule= ruleExpressionValueRule
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:109:2: iv_ruleExpressionValueRule= ruleExpressionValueRule
			// EOF
			{
				newCompositeNode(grammarAccess.getExpressionValueRuleRule());
				pushFollow(FOLLOW_ruleExpressionValueRule_in_entryRuleExpressionValueRule165);
				iv_ruleExpressionValueRule = ruleExpressionValueRule();

				state._fsp--;

				current = iv_ruleExpressionValueRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleExpressionValueRule175);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleExpressionValueRule"


	// $ANTLR start "ruleExpressionValueRule"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:116:1: ruleExpressionValueRule returns [EObject current=null] :
	// (otherlv_0= '=' ( (lv_expression_1_0= ruleSequenceElement ) ) ) ;
	public final EObject ruleExpressionValueRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_expression_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:119:28: ( (otherlv_0= '=' ( (lv_expression_1_0=
			// ruleSequenceElement ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:120:1: (otherlv_0= '=' ( (lv_expression_1_0=
			// ruleSequenceElement ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:120:1: (otherlv_0= '=' ( (lv_expression_1_0=
				// ruleSequenceElement ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:120:3: otherlv_0= '=' ( (lv_expression_1_0=
				// ruleSequenceElement ) )
				{
					otherlv_0 = (Token) match(input, 12, FOLLOW_12_in_ruleExpressionValueRule212);

					newLeafNode(otherlv_0, grammarAccess.getExpressionValueRuleAccess().getEqualsSignKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:124:1: ( (lv_expression_1_0= ruleSequenceElement ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:125:1: (lv_expression_1_0= ruleSequenceElement )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:125:1: (lv_expression_1_0= ruleSequenceElement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:126:3: lv_expression_1_0= ruleSequenceElement
						{

							newCompositeNode(grammarAccess.getExpressionValueRuleAccess().getExpressionSequenceElementParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleSequenceElement_in_ruleExpressionValueRule233);
							lv_expression_1_0 = ruleSequenceElement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getExpressionValueRuleRule());
							}
							set(
									current,
									"expression",
									lv_expression_1_0,
									"SequenceElement");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleExpressionValueRule"


	// $ANTLR start "entryRuleLITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:152:1: entryRuleLITERAL returns [EObject current=null] :
	// iv_ruleLITERAL= ruleLITERAL EOF ;
	public final EObject entryRuleLITERAL() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLITERAL = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:153:2: (iv_ruleLITERAL= ruleLITERAL EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:154:2: iv_ruleLITERAL= ruleLITERAL EOF
			{
				newCompositeNode(grammarAccess.getLITERALRule());
				pushFollow(FOLLOW_ruleLITERAL_in_entryRuleLITERAL271);
				iv_ruleLITERAL = ruleLITERAL();

				state._fsp--;

				current = iv_ruleLITERAL;
				match(input, EOF, FOLLOW_EOF_in_entryRuleLITERAL281);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleLITERAL"


	// $ANTLR start "ruleLITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:161:1: ruleLITERAL returns [EObject current=null] :
	// (this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL | this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL | this_STRING_LITERAL_2= ruleSTRING_LITERAL ) ;
	public final EObject ruleLITERAL() throws RecognitionException {
		EObject current = null;

		EObject this_BOOLEAN_LITERAL_0 = null;

		EObject this_NUMBER_LITERAL_1 = null;

		EObject this_STRING_LITERAL_2 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:164:28: ( (this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL |
			// this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL | this_STRING_LITERAL_2= ruleSTRING_LITERAL ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:165:1: (this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL |
			// this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL | this_STRING_LITERAL_2= ruleSTRING_LITERAL )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:165:1: (this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL |
				// this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL | this_STRING_LITERAL_2= ruleSTRING_LITERAL )
				int alt1 = 3;
				switch (input.LA(1)) {
				case 83:
				case 84: {
					alt1 = 1;
				}
					break;
				case RULE_INTEGER_VALUE:
				case 13: {
					alt1 = 2;
				}
					break;
				case RULE_STRING: {
					alt1 = 3;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);

					throw nvae;
				}

				switch (alt1) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:166:5: this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL
				{

					newCompositeNode(grammarAccess.getLITERALAccess().getBOOLEAN_LITERALParserRuleCall_0());

					pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_ruleLITERAL328);
					this_BOOLEAN_LITERAL_0 = ruleBOOLEAN_LITERAL();

					state._fsp--;


					current = this_BOOLEAN_LITERAL_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:176:5: this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL
				{

					newCompositeNode(grammarAccess.getLITERALAccess().getNUMBER_LITERALParserRuleCall_1());

					pushFollow(FOLLOW_ruleNUMBER_LITERAL_in_ruleLITERAL355);
					this_NUMBER_LITERAL_1 = ruleNUMBER_LITERAL();

					state._fsp--;


					current = this_NUMBER_LITERAL_1;
					afterParserOrEnumRuleCall();


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:186:5: this_STRING_LITERAL_2= ruleSTRING_LITERAL
				{

					newCompositeNode(grammarAccess.getLITERALAccess().getSTRING_LITERALParserRuleCall_2());

					pushFollow(FOLLOW_ruleSTRING_LITERAL_in_ruleLITERAL382);
					this_STRING_LITERAL_2 = ruleSTRING_LITERAL();

					state._fsp--;


					current = this_STRING_LITERAL_2;
					afterParserOrEnumRuleCall();


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleLITERAL"


	// $ANTLR start "entryRuleBOOLEAN_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:202:1: entryRuleBOOLEAN_LITERAL returns [EObject current=null] :
	// iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF ;
	public final EObject entryRuleBOOLEAN_LITERAL() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBOOLEAN_LITERAL = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:203:2: (iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:204:2: iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF
			{
				newCompositeNode(grammarAccess.getBOOLEAN_LITERALRule());
				pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL417);
				iv_ruleBOOLEAN_LITERAL = ruleBOOLEAN_LITERAL();

				state._fsp--;

				current = iv_ruleBOOLEAN_LITERAL;
				match(input, EOF, FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL427);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleBOOLEAN_LITERAL"


	// $ANTLR start "ruleBOOLEAN_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:211:1: ruleBOOLEAN_LITERAL returns [EObject current=null] : (
	// (lv_value_0_0= ruleBooleanValue ) ) ;
	public final EObject ruleBOOLEAN_LITERAL() throws RecognitionException {
		EObject current = null;

		Enumerator lv_value_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:214:28: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:215:1: ( (lv_value_0_0= ruleBooleanValue ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:215:1: ( (lv_value_0_0= ruleBooleanValue ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:216:1: (lv_value_0_0= ruleBooleanValue )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:216:1: (lv_value_0_0= ruleBooleanValue )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:217:3: lv_value_0_0= ruleBooleanValue
					{

						newCompositeNode(grammarAccess.getBOOLEAN_LITERALAccess().getValueBooleanValueEnumRuleCall_0());

						pushFollow(FOLLOW_ruleBooleanValue_in_ruleBOOLEAN_LITERAL472);
						lv_value_0_0 = ruleBooleanValue();

						state._fsp--;


						if (current == null) {
							current = createModelElementForParent(grammarAccess.getBOOLEAN_LITERALRule());
						}
						set(
								current,
								"value",
								lv_value_0_0,
								"BooleanValue");
						afterParserOrEnumRuleCall();


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleBOOLEAN_LITERAL"


	// $ANTLR start "entryRuleNUMBER_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:241:1: entryRuleNUMBER_LITERAL returns [EObject current=null] :
	// iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
	public final EObject entryRuleNUMBER_LITERAL() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNUMBER_LITERAL = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:242:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:243:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
			{
				newCompositeNode(grammarAccess.getNUMBER_LITERALRule());
				pushFollow(FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL507);
				iv_ruleNUMBER_LITERAL = ruleNUMBER_LITERAL();

				state._fsp--;

				current = iv_ruleNUMBER_LITERAL;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNUMBER_LITERAL517);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNUMBER_LITERAL"


	// $ANTLR start "ruleNUMBER_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:250:1: ruleNUMBER_LITERAL returns [EObject current=null] :
	// (this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL | this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL ) ;
	public final EObject ruleNUMBER_LITERAL() throws RecognitionException {
		EObject current = null;

		EObject this_INTEGER_LITERAL_0 = null;

		EObject this_UNLIMITED_LITERAL_1 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:253:28: ( (this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL |
			// this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:254:1: (this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL |
			// this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:254:1: (this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL |
				// this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL )
				int alt2 = 2;
				int LA2_0 = input.LA(1);

				if ((LA2_0 == RULE_INTEGER_VALUE)) {
					alt2 = 1;
				}
				else if ((LA2_0 == 13)) {
					alt2 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);

					throw nvae;
				}
				switch (alt2) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:255:5: this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL
				{

					newCompositeNode(grammarAccess.getNUMBER_LITERALAccess().getINTEGER_LITERALParserRuleCall_0());

					pushFollow(FOLLOW_ruleINTEGER_LITERAL_in_ruleNUMBER_LITERAL564);
					this_INTEGER_LITERAL_0 = ruleINTEGER_LITERAL();

					state._fsp--;


					current = this_INTEGER_LITERAL_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:265:5: this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL
				{

					newCompositeNode(grammarAccess.getNUMBER_LITERALAccess().getUNLIMITED_LITERALParserRuleCall_1());

					pushFollow(FOLLOW_ruleUNLIMITED_LITERAL_in_ruleNUMBER_LITERAL591);
					this_UNLIMITED_LITERAL_1 = ruleUNLIMITED_LITERAL();

					state._fsp--;


					current = this_UNLIMITED_LITERAL_1;
					afterParserOrEnumRuleCall();


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleNUMBER_LITERAL"


	// $ANTLR start "entryRuleINTEGER_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:281:1: entryRuleINTEGER_LITERAL returns [EObject current=null] :
	// iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF ;
	public final EObject entryRuleINTEGER_LITERAL() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleINTEGER_LITERAL = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:282:2: (iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:283:2: iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF
			{
				newCompositeNode(grammarAccess.getINTEGER_LITERALRule());
				pushFollow(FOLLOW_ruleINTEGER_LITERAL_in_entryRuleINTEGER_LITERAL626);
				iv_ruleINTEGER_LITERAL = ruleINTEGER_LITERAL();

				state._fsp--;

				current = iv_ruleINTEGER_LITERAL;
				match(input, EOF, FOLLOW_EOF_in_entryRuleINTEGER_LITERAL636);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleINTEGER_LITERAL"


	// $ANTLR start "ruleINTEGER_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:290:1: ruleINTEGER_LITERAL returns [EObject current=null] : (
	// (lv_value_0_0= RULE_INTEGER_VALUE ) ) ;
	public final EObject ruleINTEGER_LITERAL() throws RecognitionException {
		EObject current = null;

		Token lv_value_0_0 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:293:28: ( ( (lv_value_0_0= RULE_INTEGER_VALUE ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:294:1: ( (lv_value_0_0= RULE_INTEGER_VALUE ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:294:1: ( (lv_value_0_0= RULE_INTEGER_VALUE ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:295:1: (lv_value_0_0= RULE_INTEGER_VALUE )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:295:1: (lv_value_0_0= RULE_INTEGER_VALUE )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:296:3: lv_value_0_0= RULE_INTEGER_VALUE
					{
						lv_value_0_0 = (Token) match(input, RULE_INTEGER_VALUE, FOLLOW_RULE_INTEGER_VALUE_in_ruleINTEGER_LITERAL677);

						newLeafNode(lv_value_0_0, grammarAccess.getINTEGER_LITERALAccess().getValueINTEGER_VALUETerminalRuleCall_0());


						if (current == null) {
							current = createModelElement(grammarAccess.getINTEGER_LITERALRule());
						}
						setWithLastConsumed(
								current,
								"value",
								lv_value_0_0,
								"INTEGER_VALUE");


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleINTEGER_LITERAL"


	// $ANTLR start "entryRuleUNLIMITED_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:320:1: entryRuleUNLIMITED_LITERAL returns [EObject current=null] :
	// iv_ruleUNLIMITED_LITERAL= ruleUNLIMITED_LITERAL EOF ;
	public final EObject entryRuleUNLIMITED_LITERAL() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleUNLIMITED_LITERAL = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:321:2: (iv_ruleUNLIMITED_LITERAL= ruleUNLIMITED_LITERAL EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:322:2: iv_ruleUNLIMITED_LITERAL= ruleUNLIMITED_LITERAL EOF
			{
				newCompositeNode(grammarAccess.getUNLIMITED_LITERALRule());
				pushFollow(FOLLOW_ruleUNLIMITED_LITERAL_in_entryRuleUNLIMITED_LITERAL717);
				iv_ruleUNLIMITED_LITERAL = ruleUNLIMITED_LITERAL();

				state._fsp--;

				current = iv_ruleUNLIMITED_LITERAL;
				match(input, EOF, FOLLOW_EOF_in_entryRuleUNLIMITED_LITERAL727);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleUNLIMITED_LITERAL"


	// $ANTLR start "ruleUNLIMITED_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:329:1: ruleUNLIMITED_LITERAL returns [EObject current=null] : (
	// (lv_value_0_0= '*' ) ) ;
	public final EObject ruleUNLIMITED_LITERAL() throws RecognitionException {
		EObject current = null;

		Token lv_value_0_0 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:332:28: ( ( (lv_value_0_0= '*' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:333:1: ( (lv_value_0_0= '*' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:333:1: ( (lv_value_0_0= '*' ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:334:1: (lv_value_0_0= '*' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:334:1: (lv_value_0_0= '*' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:335:3: lv_value_0_0= '*'
					{
						lv_value_0_0 = (Token) match(input, 13, FOLLOW_13_in_ruleUNLIMITED_LITERAL769);

						newLeafNode(lv_value_0_0, grammarAccess.getUNLIMITED_LITERALAccess().getValueAsteriskKeyword_0());


						if (current == null) {
							current = createModelElement(grammarAccess.getUNLIMITED_LITERALRule());
						}
						setWithLastConsumed(current, "value", lv_value_0_0, "*");


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleUNLIMITED_LITERAL"


	// $ANTLR start "entryRuleSTRING_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:356:1: entryRuleSTRING_LITERAL returns [EObject current=null] :
	// iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF ;
	public final EObject entryRuleSTRING_LITERAL() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSTRING_LITERAL = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:357:2: (iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:358:2: iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF
			{
				newCompositeNode(grammarAccess.getSTRING_LITERALRule());
				pushFollow(FOLLOW_ruleSTRING_LITERAL_in_entryRuleSTRING_LITERAL817);
				iv_ruleSTRING_LITERAL = ruleSTRING_LITERAL();

				state._fsp--;

				current = iv_ruleSTRING_LITERAL;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSTRING_LITERAL827);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSTRING_LITERAL"


	// $ANTLR start "ruleSTRING_LITERAL"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:365:1: ruleSTRING_LITERAL returns [EObject current=null] : (
	// (lv_value_0_0= RULE_STRING ) ) ;
	public final EObject ruleSTRING_LITERAL() throws RecognitionException {
		EObject current = null;

		Token lv_value_0_0 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:368:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:369:1: ( (lv_value_0_0= RULE_STRING ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:369:1: ( (lv_value_0_0= RULE_STRING ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:370:1: (lv_value_0_0= RULE_STRING )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:370:1: (lv_value_0_0= RULE_STRING )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:371:3: lv_value_0_0= RULE_STRING
					{
						lv_value_0_0 = (Token) match(input, RULE_STRING, FOLLOW_RULE_STRING_in_ruleSTRING_LITERAL868);

						newLeafNode(lv_value_0_0, grammarAccess.getSTRING_LITERALAccess().getValueSTRINGTerminalRuleCall_0());


						if (current == null) {
							current = createModelElement(grammarAccess.getSTRING_LITERALRule());
						}
						setWithLastConsumed(
								current,
								"value",
								lv_value_0_0,
								"STRING");


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSTRING_LITERAL"


	// $ANTLR start "entryRuleNameExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:395:1: entryRuleNameExpression returns [EObject current=null] :
	// iv_ruleNameExpression= ruleNameExpression EOF ;
	public final EObject entryRuleNameExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNameExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:396:2: (iv_ruleNameExpression= ruleNameExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:397:2: iv_ruleNameExpression= ruleNameExpression EOF
			{
				newCompositeNode(grammarAccess.getNameExpressionRule());
				pushFollow(FOLLOW_ruleNameExpression_in_entryRuleNameExpression908);
				iv_ruleNameExpression = ruleNameExpression();

				state._fsp--;

				current = iv_ruleNameExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNameExpression918);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNameExpression"


	// $ANTLR start "ruleNameExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:404:1: ruleNameExpression returns [EObject current=null] : ( ( ( ( (
	// (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | (
	// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleNameExpression() throws RecognitionException {
		EObject current = null;

		Token lv_prefixOp_0_1 = null;
		Token lv_prefixOp_0_2 = null;
		Token lv_id_2_0 = null;
		Token lv_id_4_0 = null;
		Token lv_postfixOp_7_1 = null;
		Token lv_postfixOp_7_2 = null;
		EObject lv_path_1_0 = null;

		EObject lv_path_3_0 = null;

		EObject lv_invocationCompletion_5_0 = null;

		EObject lv_sequenceConstructionCompletion_6_0 = null;

		EObject lv_suffix_8_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:407:28: ( ( ( ( ( ( (lv_prefixOp_0_1= '++' |
			// lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | (
			// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:408:1: ( ( ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2=
			// '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | (
			// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:408:1: ( ( ( ( ( (lv_prefixOp_0_1= '++' |
				// lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | (
				// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:408:2: ( ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2=
				// '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | (
				// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:408:2: ( ( ( ( (lv_prefixOp_0_1= '++' |
					// lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | (
					// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) )
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if (((LA8_0 >= 14 && LA8_0 <= 15))) {
						alt8 = 1;
					}
					else if ((LA8_0 == RULE_ID)) {
						alt8 = 2;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 8, 0, input);

						throw nvae;
					}
					switch (alt8) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:408:3: ( ( ( (lv_prefixOp_0_1= '++' |
					// lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:408:3: ( ( ( (lv_prefixOp_0_1= '++' |
						// lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:408:4: ( ( (lv_prefixOp_0_1= '++' |
						// lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:408:4: ( ( (lv_prefixOp_0_1= '++' |
							// lv_prefixOp_0_2= '--' ) ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:409:1: ( (lv_prefixOp_0_1= '++' |
							// lv_prefixOp_0_2= '--' ) )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:409:1: ( (lv_prefixOp_0_1= '++' |
								// lv_prefixOp_0_2= '--' ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:410:1: (lv_prefixOp_0_1= '++' |
								// lv_prefixOp_0_2= '--' )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:410:1: (lv_prefixOp_0_1= '++' |
									// lv_prefixOp_0_2= '--' )
									int alt3 = 2;
									int LA3_0 = input.LA(1);

									if ((LA3_0 == 14)) {
										alt3 = 1;
									}
									else if ((LA3_0 == 15)) {
										alt3 = 2;
									}
									else {
										NoViableAltException nvae =
												new NoViableAltException("", 3, 0, input);

										throw nvae;
									}
									switch (alt3) {
									case 1:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:411:3: lv_prefixOp_0_1= '++'
									{
										lv_prefixOp_0_1 = (Token) match(input, 14, FOLLOW_14_in_ruleNameExpression965);

										newLeafNode(lv_prefixOp_0_1, grammarAccess.getNameExpressionAccess().getPrefixOpPlusSignPlusSignKeyword_0_0_0_0_0());


										if (current == null) {
											current = createModelElement(grammarAccess.getNameExpressionRule());
										}
										setWithLastConsumed(current, "prefixOp", lv_prefixOp_0_1, null);


									}
										break;
									case 2:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:423:8: lv_prefixOp_0_2= '--'
									{
										lv_prefixOp_0_2 = (Token) match(input, 15, FOLLOW_15_in_ruleNameExpression994);

										newLeafNode(lv_prefixOp_0_2, grammarAccess.getNameExpressionAccess().getPrefixOpHyphenMinusHyphenMinusKeyword_0_0_0_0_1());


										if (current == null) {
											current = createModelElement(grammarAccess.getNameExpressionRule());
										}
										setWithLastConsumed(current, "prefixOp", lv_prefixOp_0_2, null);


									}
										break;

									}


								}


							}

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:438:2: ( (lv_path_1_0= ruleQualifiedNamePath
							// ) )?
							int alt4 = 2;
							int LA4_0 = input.LA(1);

							if ((LA4_0 == RULE_ID)) {
								int LA4_1 = input.LA(2);

								if ((LA4_1 == 17)) {
									int LA4_2 = input.LA(3);

									if ((LA4_2 == RULE_ID)) {
										int LA4_5 = input.LA(4);

										if ((LA4_5 == 20)) {
											alt4 = 1;
										}
									}
								}
								else if ((LA4_1 == 16)) {
									alt4 = 1;
								}
							}
							switch (alt4) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:439:1: (lv_path_1_0= ruleQualifiedNamePath )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:439:1: (lv_path_1_0=
								// ruleQualifiedNamePath )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:440:3: lv_path_1_0=
								// ruleQualifiedNamePath
								{

									newCompositeNode(grammarAccess.getNameExpressionAccess().getPathQualifiedNamePathParserRuleCall_0_0_1_0());

									pushFollow(FOLLOW_ruleQualifiedNamePath_in_ruleNameExpression1031);
									lv_path_1_0 = ruleQualifiedNamePath();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getNameExpressionRule());
									}
									set(
											current,
											"path",
											lv_path_1_0,
											"QualifiedNamePath");
									afterParserOrEnumRuleCall();


								}


							}
								break;

							}

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:456:3: ( (lv_id_2_0= RULE_ID ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:457:1: (lv_id_2_0= RULE_ID )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:457:1: (lv_id_2_0= RULE_ID )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:458:3: lv_id_2_0= RULE_ID
								{
									lv_id_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleNameExpression1049);

									newLeafNode(lv_id_2_0, grammarAccess.getNameExpressionAccess().getIdIDTerminalRuleCall_0_0_2_0());


									if (current == null) {
										current = createModelElement(grammarAccess.getNameExpressionRule());
									}
									setWithLastConsumed(
											current,
											"id",
											lv_id_2_0,
											"ID");


								}


							}


						}


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:475:6: ( ( (lv_path_3_0= ruleQualifiedNamePath ) )?
					// ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:475:6: ( ( (lv_path_3_0= ruleQualifiedNamePath )
						// )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:475:7: ( (lv_path_3_0= ruleQualifiedNamePath )
						// )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )?
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:475:7: ( (lv_path_3_0= ruleQualifiedNamePath
							// ) )?
							int alt5 = 2;
							int LA5_0 = input.LA(1);

							if ((LA5_0 == RULE_ID)) {
								int LA5_1 = input.LA(2);

								if ((LA5_1 == 17)) {
									int LA5_3 = input.LA(3);

									if ((LA5_3 == RULE_ID)) {
										int LA5_5 = input.LA(4);

										if ((LA5_5 == 20)) {
											alt5 = 1;
										}
									}
								}
								else if ((LA5_1 == 16)) {
									alt5 = 1;
								}
							}
							switch (alt5) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:476:1: (lv_path_3_0= ruleQualifiedNamePath )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:476:1: (lv_path_3_0=
								// ruleQualifiedNamePath )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:477:3: lv_path_3_0=
								// ruleQualifiedNamePath
								{

									newCompositeNode(grammarAccess.getNameExpressionAccess().getPathQualifiedNamePathParserRuleCall_0_1_0_0());

									pushFollow(FOLLOW_ruleQualifiedNamePath_in_ruleNameExpression1083);
									lv_path_3_0 = ruleQualifiedNamePath();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getNameExpressionRule());
									}
									set(
											current,
											"path",
											lv_path_3_0,
											"QualifiedNamePath");
									afterParserOrEnumRuleCall();


								}


							}
								break;

							}

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:493:3: ( (lv_id_4_0= RULE_ID ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:494:1: (lv_id_4_0= RULE_ID )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:494:1: (lv_id_4_0= RULE_ID )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:495:3: lv_id_4_0= RULE_ID
								{
									lv_id_4_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleNameExpression1101);

									newLeafNode(lv_id_4_0, grammarAccess.getNameExpressionAccess().getIdIDTerminalRuleCall_0_1_1_0());


									if (current == null) {
										current = createModelElement(grammarAccess.getNameExpressionRule());
									}
									setWithLastConsumed(
											current,
											"id",
											lv_id_4_0,
											"ID");


								}


							}

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:511:2: ( ( (lv_invocationCompletion_5_0=
							// ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )?
							int alt7 = 4;
							switch (input.LA(1)) {
							case 21: {
								alt7 = 1;
							}
								break;
							case 47: {
								int LA7_2 = input.LA(2);

								if ((LA7_2 == 48)) {
									int LA7_6 = input.LA(3);

									if ((LA7_6 == 57)) {
										alt7 = 2;
									}
								}
								else if (((LA7_2 >= RULE_INTEGER_VALUE && LA7_2 <= RULE_ID) || (LA7_2 >= 13 && LA7_2 <= 15) || LA7_2 == 21 || (LA7_2 >= 39 && LA7_2 <= 40) || (LA7_2 >= 43 && LA7_2 <= 45) || (LA7_2 >= 53 && LA7_2 <= 56) || (LA7_2 >= 83 && LA7_2 <= 84))) {
									alt7 = 2;
								}
							}
								break;
							case 57: {
								alt7 = 2;
							}
								break;
							case 14:
							case 15: {
								alt7 = 3;
							}
								break;
							}

							switch (alt7) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:511:3: ( (lv_invocationCompletion_5_0=
							// ruleTuple ) )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:511:3: ( (lv_invocationCompletion_5_0=
								// ruleTuple ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:512:1: (lv_invocationCompletion_5_0=
								// ruleTuple )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:512:1: (lv_invocationCompletion_5_0=
									// ruleTuple )
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:513:3: lv_invocationCompletion_5_0=
									// ruleTuple
									{

										newCompositeNode(grammarAccess.getNameExpressionAccess().getInvocationCompletionTupleParserRuleCall_0_1_2_0_0());

										pushFollow(FOLLOW_ruleTuple_in_ruleNameExpression1128);
										lv_invocationCompletion_5_0 = ruleTuple();

										state._fsp--;


										if (current == null) {
											current = createModelElementForParent(grammarAccess.getNameExpressionRule());
										}
										set(
												current,
												"invocationCompletion",
												lv_invocationCompletion_5_0,
												"Tuple");
										afterParserOrEnumRuleCall();


									}


								}


							}
								break;
							case 2:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:530:6: (
							// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:530:6: (
								// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:531:1:
								// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:531:1:
									// (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion )
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:532:3:
									// lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion
									{

										newCompositeNode(grammarAccess.getNameExpressionAccess().getSequenceConstructionCompletionSequenceConstructionOrAccessCompletionParserRuleCall_0_1_2_1_0());

										pushFollow(FOLLOW_ruleSequenceConstructionOrAccessCompletion_in_ruleNameExpression1155);
										lv_sequenceConstructionCompletion_6_0 = ruleSequenceConstructionOrAccessCompletion();

										state._fsp--;


										if (current == null) {
											current = createModelElementForParent(grammarAccess.getNameExpressionRule());
										}
										set(
												current,
												"sequenceConstructionCompletion",
												lv_sequenceConstructionCompletion_6_0,
												"SequenceConstructionOrAccessCompletion");
										afterParserOrEnumRuleCall();


									}


								}


							}
								break;
							case 3:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:549:6: ( ( (lv_postfixOp_7_1= '++' |
							// lv_postfixOp_7_2= '--' ) ) )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:549:6: ( ( (lv_postfixOp_7_1= '++' |
								// lv_postfixOp_7_2= '--' ) ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:550:1: ( (lv_postfixOp_7_1= '++' |
								// lv_postfixOp_7_2= '--' ) )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:550:1: ( (lv_postfixOp_7_1= '++' |
									// lv_postfixOp_7_2= '--' ) )
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:551:1: (lv_postfixOp_7_1= '++' |
									// lv_postfixOp_7_2= '--' )
									{
										// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:551:1: (lv_postfixOp_7_1= '++' |
										// lv_postfixOp_7_2= '--' )
										int alt6 = 2;
										int LA6_0 = input.LA(1);

										if ((LA6_0 == 14)) {
											alt6 = 1;
										}
										else if ((LA6_0 == 15)) {
											alt6 = 2;
										}
										else {
											NoViableAltException nvae =
													new NoViableAltException("", 6, 0, input);

											throw nvae;
										}
										switch (alt6) {
										case 1:
										// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:552:3: lv_postfixOp_7_1= '++'
										{
											lv_postfixOp_7_1 = (Token) match(input, 14, FOLLOW_14_in_ruleNameExpression1181);

											newLeafNode(lv_postfixOp_7_1, grammarAccess.getNameExpressionAccess().getPostfixOpPlusSignPlusSignKeyword_0_1_2_2_0_0());


											if (current == null) {
												current = createModelElement(grammarAccess.getNameExpressionRule());
											}
											setWithLastConsumed(current, "postfixOp", lv_postfixOp_7_1, null);


										}
											break;
										case 2:
										// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:564:8: lv_postfixOp_7_2= '--'
										{
											lv_postfixOp_7_2 = (Token) match(input, 15, FOLLOW_15_in_ruleNameExpression1210);

											newLeafNode(lv_postfixOp_7_2, grammarAccess.getNameExpressionAccess().getPostfixOpHyphenMinusHyphenMinusKeyword_0_1_2_2_0_1());


											if (current == null) {
												current = createModelElement(grammarAccess.getNameExpressionRule());
											}
											setWithLastConsumed(current, "postfixOp", lv_postfixOp_7_2, null);


										}
											break;

										}


									}


								}


							}
								break;

							}


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:579:6: ( (lv_suffix_8_0= ruleSuffixExpression ) )?
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if ((LA9_0 == 46 || LA9_0 == 49)) {
						alt9 = 1;
					}
					switch (alt9) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:580:1: (lv_suffix_8_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:580:1: (lv_suffix_8_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:581:3: lv_suffix_8_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getNameExpressionAccess().getSuffixSuffixExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleNameExpression1251);
							lv_suffix_8_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getNameExpressionRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_8_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleNameExpression"


	// $ANTLR start "entryRuleQualifiedNamePath"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:605:1: entryRuleQualifiedNamePath returns [EObject current=null] :
	// iv_ruleQualifiedNamePath= ruleQualifiedNamePath EOF ;
	public final EObject entryRuleQualifiedNamePath() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleQualifiedNamePath = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:606:2: (iv_ruleQualifiedNamePath= ruleQualifiedNamePath EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:607:2: iv_ruleQualifiedNamePath= ruleQualifiedNamePath EOF
			{
				newCompositeNode(grammarAccess.getQualifiedNamePathRule());
				pushFollow(FOLLOW_ruleQualifiedNamePath_in_entryRuleQualifiedNamePath1288);
				iv_ruleQualifiedNamePath = ruleQualifiedNamePath();

				state._fsp--;

				current = iv_ruleQualifiedNamePath;
				match(input, EOF, FOLLOW_EOF_in_entryRuleQualifiedNamePath1298);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleQualifiedNamePath"


	// $ANTLR start "ruleQualifiedNamePath"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:614:1: ruleQualifiedNamePath returns [EObject current=null] : ( (
	// (lv_namespace_0_0= ruleUnqualifiedName ) ) otherlv_1= '::' )+ ;
	public final EObject ruleQualifiedNamePath() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_namespace_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:617:28: ( ( ( (lv_namespace_0_0= ruleUnqualifiedName ) )
			// otherlv_1= '::' )+ )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:618:1: ( ( (lv_namespace_0_0= ruleUnqualifiedName ) )
			// otherlv_1= '::' )+
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:618:1: ( ( (lv_namespace_0_0= ruleUnqualifiedName ) )
				// otherlv_1= '::' )+
				int cnt10 = 0;
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == RULE_ID)) {
						int LA10_1 = input.LA(2);

						if ((LA10_1 == 17)) {
							int LA10_3 = input.LA(3);

							if ((LA10_3 == RULE_ID)) {
								int LA10_5 = input.LA(4);

								if ((LA10_5 == 20)) {
									alt10 = 1;
								}


							}


						}
						else if ((LA10_1 == 16)) {
							alt10 = 1;
						}


					}


					switch (alt10) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:618:2: ( (lv_namespace_0_0= ruleUnqualifiedName ) )
					// otherlv_1= '::'
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:618:2: ( (lv_namespace_0_0= ruleUnqualifiedName
						// ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:619:1: (lv_namespace_0_0= ruleUnqualifiedName )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:619:1: (lv_namespace_0_0=
							// ruleUnqualifiedName )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:620:3: lv_namespace_0_0= ruleUnqualifiedName
							{

								newCompositeNode(grammarAccess.getQualifiedNamePathAccess().getNamespaceUnqualifiedNameParserRuleCall_0_0());

								pushFollow(FOLLOW_ruleUnqualifiedName_in_ruleQualifiedNamePath1344);
								lv_namespace_0_0 = ruleUnqualifiedName();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getQualifiedNamePathRule());
								}
								add(
										current,
										"namespace",
										lv_namespace_0_0,
										"UnqualifiedName");
								afterParserOrEnumRuleCall();


							}


						}

						otherlv_1 = (Token) match(input, 16, FOLLOW_16_in_ruleQualifiedNamePath1356);

						newLeafNode(otherlv_1, grammarAccess.getQualifiedNamePathAccess().getColonColonKeyword_1());


					}
						break;

					default:
						if (cnt10 >= 1) {
							break loop10;
						}
						EarlyExitException eee =
								new EarlyExitException(10, input);
						throw eee;
					}
					cnt10++;
				} while (true);


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleQualifiedNamePath"


	// $ANTLR start "entryRuleUnqualifiedName"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:648:1: entryRuleUnqualifiedName returns [EObject current=null] :
	// iv_ruleUnqualifiedName= ruleUnqualifiedName EOF ;
	public final EObject entryRuleUnqualifiedName() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleUnqualifiedName = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:649:2: (iv_ruleUnqualifiedName= ruleUnqualifiedName EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:650:2: iv_ruleUnqualifiedName= ruleUnqualifiedName EOF
			{
				newCompositeNode(grammarAccess.getUnqualifiedNameRule());
				pushFollow(FOLLOW_ruleUnqualifiedName_in_entryRuleUnqualifiedName1393);
				iv_ruleUnqualifiedName = ruleUnqualifiedName();

				state._fsp--;

				current = iv_ruleUnqualifiedName;
				match(input, EOF, FOLLOW_EOF_in_entryRuleUnqualifiedName1403);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleUnqualifiedName"


	// $ANTLR start "ruleUnqualifiedName"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:657:1: ruleUnqualifiedName returns [EObject current=null] : ( (
	// (lv_name_0_0= RULE_ID ) ) ( (lv_templateBinding_1_0= ruleTemplateBinding ) )? ) ;
	public final EObject ruleUnqualifiedName() throws RecognitionException {
		EObject current = null;

		Token lv_name_0_0 = null;
		EObject lv_templateBinding_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:660:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (
			// (lv_templateBinding_1_0= ruleTemplateBinding ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:661:1: ( ( (lv_name_0_0= RULE_ID ) ) (
			// (lv_templateBinding_1_0= ruleTemplateBinding ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:661:1: ( ( (lv_name_0_0= RULE_ID ) ) (
				// (lv_templateBinding_1_0= ruleTemplateBinding ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:661:2: ( (lv_name_0_0= RULE_ID ) ) (
				// (lv_templateBinding_1_0= ruleTemplateBinding ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:661:2: ( (lv_name_0_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:662:1: (lv_name_0_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:662:1: (lv_name_0_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:663:3: lv_name_0_0= RULE_ID
						{
							lv_name_0_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleUnqualifiedName1445);

							newLeafNode(lv_name_0_0, grammarAccess.getUnqualifiedNameAccess().getNameIDTerminalRuleCall_0_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getUnqualifiedNameRule());
							}
							setWithLastConsumed(
									current,
									"name",
									lv_name_0_0,
									"ID");


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:679:2: ( (lv_templateBinding_1_0=
					// ruleTemplateBinding ) )?
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == 17)) {
						alt11 = 1;
					}
					switch (alt11) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:680:1: (lv_templateBinding_1_0= ruleTemplateBinding
					// )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:680:1: (lv_templateBinding_1_0=
						// ruleTemplateBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:681:3: lv_templateBinding_1_0=
						// ruleTemplateBinding
						{

							newCompositeNode(grammarAccess.getUnqualifiedNameAccess().getTemplateBindingTemplateBindingParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleTemplateBinding_in_ruleUnqualifiedName1471);
							lv_templateBinding_1_0 = ruleTemplateBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getUnqualifiedNameRule());
							}
							set(
									current,
									"templateBinding",
									lv_templateBinding_1_0,
									"TemplateBinding");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleUnqualifiedName"


	// $ANTLR start "entryRuleTemplateBinding"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:705:1: entryRuleTemplateBinding returns [EObject current=null] :
	// iv_ruleTemplateBinding= ruleTemplateBinding EOF ;
	public final EObject entryRuleTemplateBinding() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTemplateBinding = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:706:2: (iv_ruleTemplateBinding= ruleTemplateBinding EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:707:2: iv_ruleTemplateBinding= ruleTemplateBinding EOF
			{
				newCompositeNode(grammarAccess.getTemplateBindingRule());
				pushFollow(FOLLOW_ruleTemplateBinding_in_entryRuleTemplateBinding1508);
				iv_ruleTemplateBinding = ruleTemplateBinding();

				state._fsp--;

				current = iv_ruleTemplateBinding;
				match(input, EOF, FOLLOW_EOF_in_entryRuleTemplateBinding1518);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleTemplateBinding"


	// $ANTLR start "ruleTemplateBinding"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:714:1: ruleTemplateBinding returns [EObject current=null] :
	// (otherlv_0= '<' ( (lv_bindings_1_0= ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>' ) ;
	public final EObject ruleTemplateBinding() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_bindings_1_0 = null;

		EObject lv_bindings_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:717:28: ( (otherlv_0= '<' ( (lv_bindings_1_0=
			// ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:718:1: (otherlv_0= '<' ( (lv_bindings_1_0=
			// ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:718:1: (otherlv_0= '<' ( (lv_bindings_1_0=
				// ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:718:3: otherlv_0= '<' ( (lv_bindings_1_0=
				// ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>'
				{
					otherlv_0 = (Token) match(input, 17, FOLLOW_17_in_ruleTemplateBinding1555);

					newLeafNode(otherlv_0, grammarAccess.getTemplateBindingAccess().getLessThanSignKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:722:1: ( (lv_bindings_1_0= ruleNamedTemplateBinding
					// ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:723:1: (lv_bindings_1_0= ruleNamedTemplateBinding )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:723:1: (lv_bindings_1_0=
						// ruleNamedTemplateBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:724:3: lv_bindings_1_0= ruleNamedTemplateBinding
						{

							newCompositeNode(grammarAccess.getTemplateBindingAccess().getBindingsNamedTemplateBindingParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleNamedTemplateBinding_in_ruleTemplateBinding1576);
							lv_bindings_1_0 = ruleNamedTemplateBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getTemplateBindingRule());
							}
							add(
									current,
									"bindings",
									lv_bindings_1_0,
									"NamedTemplateBinding");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:740:2: (otherlv_2= ',' ( (lv_bindings_3_0=
					// ruleNamedTemplateBinding ) ) )*
					loop12: do {
						int alt12 = 2;
						int LA12_0 = input.LA(1);

						if ((LA12_0 == 18)) {
							alt12 = 1;
						}


						switch (alt12) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:740:4: otherlv_2= ',' ( (lv_bindings_3_0=
						// ruleNamedTemplateBinding ) )
						{
							otherlv_2 = (Token) match(input, 18, FOLLOW_18_in_ruleTemplateBinding1589);

							newLeafNode(otherlv_2, grammarAccess.getTemplateBindingAccess().getCommaKeyword_2_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:744:1: ( (lv_bindings_3_0=
							// ruleNamedTemplateBinding ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:745:1: (lv_bindings_3_0=
							// ruleNamedTemplateBinding )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:745:1: (lv_bindings_3_0=
								// ruleNamedTemplateBinding )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:746:3: lv_bindings_3_0=
								// ruleNamedTemplateBinding
								{

									newCompositeNode(grammarAccess.getTemplateBindingAccess().getBindingsNamedTemplateBindingParserRuleCall_2_1_0());

									pushFollow(FOLLOW_ruleNamedTemplateBinding_in_ruleTemplateBinding1610);
									lv_bindings_3_0 = ruleNamedTemplateBinding();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getTemplateBindingRule());
									}
									add(
											current,
											"bindings",
											lv_bindings_3_0,
											"NamedTemplateBinding");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop12;
						}
					} while (true);

					otherlv_4 = (Token) match(input, 19, FOLLOW_19_in_ruleTemplateBinding1624);

					newLeafNode(otherlv_4, grammarAccess.getTemplateBindingAccess().getGreaterThanSignKeyword_3());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleTemplateBinding"


	// $ANTLR start "entryRuleNamedTemplateBinding"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:774:1: entryRuleNamedTemplateBinding returns [EObject current=null]
	// : iv_ruleNamedTemplateBinding= ruleNamedTemplateBinding EOF ;
	public final EObject entryRuleNamedTemplateBinding() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNamedTemplateBinding = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:775:2: (iv_ruleNamedTemplateBinding=
			// ruleNamedTemplateBinding EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:776:2: iv_ruleNamedTemplateBinding= ruleNamedTemplateBinding
			// EOF
			{
				newCompositeNode(grammarAccess.getNamedTemplateBindingRule());
				pushFollow(FOLLOW_ruleNamedTemplateBinding_in_entryRuleNamedTemplateBinding1660);
				iv_ruleNamedTemplateBinding = ruleNamedTemplateBinding();

				state._fsp--;

				current = iv_ruleNamedTemplateBinding;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNamedTemplateBinding1670);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNamedTemplateBinding"


	// $ANTLR start "ruleNamedTemplateBinding"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:783:1: ruleNamedTemplateBinding returns [EObject current=null] : ( (
	// (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_actual_2_0= ruleQualifiedNameWithBinding ) ) ) ;
	public final EObject ruleNamedTemplateBinding() throws RecognitionException {
		EObject current = null;

		Token lv_formal_0_0 = null;
		Token otherlv_1 = null;
		EObject lv_actual_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:786:28: ( ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' (
			// (lv_actual_2_0= ruleQualifiedNameWithBinding ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:787:1: ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' (
			// (lv_actual_2_0= ruleQualifiedNameWithBinding ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:787:1: ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' (
				// (lv_actual_2_0= ruleQualifiedNameWithBinding ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:787:2: ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' (
				// (lv_actual_2_0= ruleQualifiedNameWithBinding ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:787:2: ( (lv_formal_0_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:788:1: (lv_formal_0_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:788:1: (lv_formal_0_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:789:3: lv_formal_0_0= RULE_ID
						{
							lv_formal_0_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleNamedTemplateBinding1712);

							newLeafNode(lv_formal_0_0, grammarAccess.getNamedTemplateBindingAccess().getFormalIDTerminalRuleCall_0_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getNamedTemplateBindingRule());
							}
							setWithLastConsumed(
									current,
									"formal",
									lv_formal_0_0,
									"ID");


						}


					}

					otherlv_1 = (Token) match(input, 20, FOLLOW_20_in_ruleNamedTemplateBinding1729);

					newLeafNode(otherlv_1, grammarAccess.getNamedTemplateBindingAccess().getEqualsSignGreaterThanSignKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:809:1: ( (lv_actual_2_0=
					// ruleQualifiedNameWithBinding ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:810:1: (lv_actual_2_0= ruleQualifiedNameWithBinding
					// )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:810:1: (lv_actual_2_0=
						// ruleQualifiedNameWithBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:811:3: lv_actual_2_0=
						// ruleQualifiedNameWithBinding
						{

							newCompositeNode(grammarAccess.getNamedTemplateBindingAccess().getActualQualifiedNameWithBindingParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleNamedTemplateBinding1750);
							lv_actual_2_0 = ruleQualifiedNameWithBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getNamedTemplateBindingRule());
							}
							set(
									current,
									"actual",
									lv_actual_2_0,
									"QualifiedNameWithBinding");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleNamedTemplateBinding"


	// $ANTLR start "entryRuleQualifiedNameWithBinding"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:835:1: entryRuleQualifiedNameWithBinding returns [EObject
	// current=null] : iv_ruleQualifiedNameWithBinding= ruleQualifiedNameWithBinding EOF ;
	public final EObject entryRuleQualifiedNameWithBinding() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleQualifiedNameWithBinding = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:836:2: (iv_ruleQualifiedNameWithBinding=
			// ruleQualifiedNameWithBinding EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:837:2: iv_ruleQualifiedNameWithBinding=
			// ruleQualifiedNameWithBinding EOF
			{
				newCompositeNode(grammarAccess.getQualifiedNameWithBindingRule());
				pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_entryRuleQualifiedNameWithBinding1786);
				iv_ruleQualifiedNameWithBinding = ruleQualifiedNameWithBinding();

				state._fsp--;

				current = iv_ruleQualifiedNameWithBinding;
				match(input, EOF, FOLLOW_EOF_in_entryRuleQualifiedNameWithBinding1796);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleQualifiedNameWithBinding"


	// $ANTLR start "ruleQualifiedNameWithBinding"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:844:1: ruleQualifiedNameWithBinding returns [EObject current=null] :
	// ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0= ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )? ) ;
	public final EObject ruleQualifiedNameWithBinding() throws RecognitionException {
		EObject current = null;

		Token lv_id_0_0 = null;
		Token otherlv_2 = null;
		EObject lv_binding_1_0 = null;

		EObject lv_remaining_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:847:28: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0=
			// ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:848:1: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0=
			// ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:848:1: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0=
				// ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:848:2: ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0=
				// ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:848:2: ( (lv_id_0_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:849:1: (lv_id_0_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:849:1: (lv_id_0_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:850:3: lv_id_0_0= RULE_ID
						{
							lv_id_0_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleQualifiedNameWithBinding1838);

							newLeafNode(lv_id_0_0, grammarAccess.getQualifiedNameWithBindingAccess().getIdIDTerminalRuleCall_0_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getQualifiedNameWithBindingRule());
							}
							setWithLastConsumed(
									current,
									"id",
									lv_id_0_0,
									"ID");


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:866:2: ( (lv_binding_1_0= ruleTemplateBinding ) )?
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if ((LA13_0 == 17)) {
						int LA13_1 = input.LA(2);

						if ((LA13_1 == RULE_ID)) {
							int LA13_3 = input.LA(3);

							if ((LA13_3 == 20)) {
								alt13 = 1;
							}
						}
					}
					switch (alt13) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:867:1: (lv_binding_1_0= ruleTemplateBinding )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:867:1: (lv_binding_1_0= ruleTemplateBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:868:3: lv_binding_1_0= ruleTemplateBinding
						{

							newCompositeNode(grammarAccess.getQualifiedNameWithBindingAccess().getBindingTemplateBindingParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleTemplateBinding_in_ruleQualifiedNameWithBinding1864);
							lv_binding_1_0 = ruleTemplateBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getQualifiedNameWithBindingRule());
							}
							set(
									current,
									"binding",
									lv_binding_1_0,
									"TemplateBinding");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:884:3: (otherlv_2= '::' ( (lv_remaining_3_0=
					// ruleQualifiedNameWithBinding ) ) )?
					int alt14 = 2;
					int LA14_0 = input.LA(1);

					if ((LA14_0 == 16)) {
						alt14 = 1;
					}
					switch (alt14) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:884:5: otherlv_2= '::' ( (lv_remaining_3_0=
					// ruleQualifiedNameWithBinding ) )
					{
						otherlv_2 = (Token) match(input, 16, FOLLOW_16_in_ruleQualifiedNameWithBinding1878);

						newLeafNode(otherlv_2, grammarAccess.getQualifiedNameWithBindingAccess().getColonColonKeyword_2_0());

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:888:1: ( (lv_remaining_3_0=
						// ruleQualifiedNameWithBinding ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:889:1: (lv_remaining_3_0=
						// ruleQualifiedNameWithBinding )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:889:1: (lv_remaining_3_0=
							// ruleQualifiedNameWithBinding )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:890:3: lv_remaining_3_0=
							// ruleQualifiedNameWithBinding
							{

								newCompositeNode(grammarAccess.getQualifiedNameWithBindingAccess().getRemainingQualifiedNameWithBindingParserRuleCall_2_1_0());

								pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameWithBinding1899);
								lv_remaining_3_0 = ruleQualifiedNameWithBinding();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getQualifiedNameWithBindingRule());
								}
								set(
										current,
										"remaining",
										lv_remaining_3_0,
										"QualifiedNameWithBinding");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleQualifiedNameWithBinding"


	// $ANTLR start "entryRuleTuple"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:914:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple=
	// ruleTuple EOF ;
	public final EObject entryRuleTuple() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTuple = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:915:2: (iv_ruleTuple= ruleTuple EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:916:2: iv_ruleTuple= ruleTuple EOF
			{
				newCompositeNode(grammarAccess.getTupleRule());
				pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple1937);
				iv_ruleTuple = ruleTuple();

				state._fsp--;

				current = iv_ruleTuple;
				match(input, EOF, FOLLOW_EOF_in_entryRuleTuple1947);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleTuple"


	// $ANTLR start "ruleTuple"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:923:1: ruleTuple returns [EObject current=null] : ( () otherlv_1=
	// '(' ( ( (lv_tupleElements_2_0= ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')' ) ;
	public final EObject ruleTuple() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		EObject lv_tupleElements_2_0 = null;

		EObject lv_tupleElements_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:926:28: ( ( () otherlv_1= '(' ( ( (lv_tupleElements_2_0=
			// ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:927:1: ( () otherlv_1= '(' ( ( (lv_tupleElements_2_0=
			// ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:927:1: ( () otherlv_1= '(' ( ( (lv_tupleElements_2_0=
				// ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:927:2: () otherlv_1= '(' ( ( (lv_tupleElements_2_0=
				// ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:927:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:928:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getTupleAccess().getTupleAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 21, FOLLOW_21_in_ruleTuple1993);

					newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:937:1: ( ( (lv_tupleElements_2_0= ruleTupleElement )
					// ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )?
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if (((LA16_0 >= RULE_INTEGER_VALUE && LA16_0 <= RULE_ID) || (LA16_0 >= 13 && LA16_0 <= 15) || LA16_0 == 21 || (LA16_0 >= 39 && LA16_0 <= 40) || (LA16_0 >= 43 && LA16_0 <= 45) || (LA16_0 >= 53 && LA16_0 <= 56) || (LA16_0 >= 83 && LA16_0 <= 84))) {
						alt16 = 1;
					}
					switch (alt16) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:937:2: ( (lv_tupleElements_2_0= ruleTupleElement ) )
					// (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )*
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:937:2: ( (lv_tupleElements_2_0= ruleTupleElement
						// ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:938:1: (lv_tupleElements_2_0= ruleTupleElement )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:938:1: (lv_tupleElements_2_0=
							// ruleTupleElement )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:939:3: lv_tupleElements_2_0=
							// ruleTupleElement
							{

								newCompositeNode(grammarAccess.getTupleAccess().getTupleElementsTupleElementParserRuleCall_2_0_0());

								pushFollow(FOLLOW_ruleTupleElement_in_ruleTuple2015);
								lv_tupleElements_2_0 = ruleTupleElement();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getTupleRule());
								}
								add(
										current,
										"tupleElements",
										lv_tupleElements_2_0,
										"TupleElement");
								afterParserOrEnumRuleCall();


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:955:2: (otherlv_3= ',' ( (lv_tupleElements_4_0=
						// ruleTupleElement ) ) )*
						loop15: do {
							int alt15 = 2;
							int LA15_0 = input.LA(1);

							if ((LA15_0 == 18)) {
								alt15 = 1;
							}


							switch (alt15) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:955:4: otherlv_3= ',' (
							// (lv_tupleElements_4_0= ruleTupleElement ) )
							{
								otherlv_3 = (Token) match(input, 18, FOLLOW_18_in_ruleTuple2028);

								newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_2_1_0());

								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:959:1: ( (lv_tupleElements_4_0=
								// ruleTupleElement ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:960:1: (lv_tupleElements_4_0=
								// ruleTupleElement )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:960:1: (lv_tupleElements_4_0=
									// ruleTupleElement )
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:961:3: lv_tupleElements_4_0=
									// ruleTupleElement
									{

										newCompositeNode(grammarAccess.getTupleAccess().getTupleElementsTupleElementParserRuleCall_2_1_1_0());

										pushFollow(FOLLOW_ruleTupleElement_in_ruleTuple2049);
										lv_tupleElements_4_0 = ruleTupleElement();

										state._fsp--;


										if (current == null) {
											current = createModelElementForParent(grammarAccess.getTupleRule());
										}
										add(
												current,
												"tupleElements",
												lv_tupleElements_4_0,
												"TupleElement");
										afterParserOrEnumRuleCall();


									}


								}


							}
								break;

							default:
								break loop15;
							}
						} while (true);


					}
						break;

					}

					otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleTuple2065);

					newLeafNode(otherlv_5, grammarAccess.getTupleAccess().getRightParenthesisKeyword_3());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleTuple"


	// $ANTLR start "entryRuleTupleElement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:989:1: entryRuleTupleElement returns [EObject current=null] :
	// iv_ruleTupleElement= ruleTupleElement EOF ;
	public final EObject entryRuleTupleElement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTupleElement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:990:2: (iv_ruleTupleElement= ruleTupleElement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:991:2: iv_ruleTupleElement= ruleTupleElement EOF
			{
				newCompositeNode(grammarAccess.getTupleElementRule());
				pushFollow(FOLLOW_ruleTupleElement_in_entryRuleTupleElement2101);
				iv_ruleTupleElement = ruleTupleElement();

				state._fsp--;

				current = iv_ruleTupleElement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleTupleElement2111);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleTupleElement"


	// $ANTLR start "ruleTupleElement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:998:1: ruleTupleElement returns [EObject current=null] : (
	// (lv_argument_0_0= ruleExpression ) ) ;
	public final EObject ruleTupleElement() throws RecognitionException {
		EObject current = null;

		EObject lv_argument_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1001:28: ( ( (lv_argument_0_0= ruleExpression ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1002:1: ( (lv_argument_0_0= ruleExpression ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1002:1: ( (lv_argument_0_0= ruleExpression ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1003:1: (lv_argument_0_0= ruleExpression )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1003:1: (lv_argument_0_0= ruleExpression )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1004:3: lv_argument_0_0= ruleExpression
					{

						newCompositeNode(grammarAccess.getTupleElementAccess().getArgumentExpressionParserRuleCall_0());

						pushFollow(FOLLOW_ruleExpression_in_ruleTupleElement2156);
						lv_argument_0_0 = ruleExpression();

						state._fsp--;


						if (current == null) {
							current = createModelElementForParent(grammarAccess.getTupleElementRule());
						}
						set(
								current,
								"argument",
								lv_argument_0_0,
								"Expression");
						afterParserOrEnumRuleCall();


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleTupleElement"


	// $ANTLR start "entryRuleExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1028:1: entryRuleExpression returns [EObject current=null] :
	// iv_ruleExpression= ruleExpression EOF ;
	public final EObject entryRuleExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1029:2: (iv_ruleExpression= ruleExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1030:2: iv_ruleExpression= ruleExpression EOF
			{
				newCompositeNode(grammarAccess.getExpressionRule());
				pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2191);
				iv_ruleExpression = ruleExpression();

				state._fsp--;

				current = iv_ruleExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleExpression2201);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleExpression"


	// $ANTLR start "ruleExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1037:1: ruleExpression returns [EObject current=null] :
	// this_ConditionalTestExpression_0= ruleConditionalTestExpression ;
	public final EObject ruleExpression() throws RecognitionException {
		EObject current = null;

		EObject this_ConditionalTestExpression_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1040:28: (this_ConditionalTestExpression_0=
			// ruleConditionalTestExpression )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1042:5: this_ConditionalTestExpression_0=
			// ruleConditionalTestExpression
			{

				newCompositeNode(grammarAccess.getExpressionAccess().getConditionalTestExpressionParserRuleCall());

				pushFollow(FOLLOW_ruleConditionalTestExpression_in_ruleExpression2247);
				this_ConditionalTestExpression_0 = ruleConditionalTestExpression();

				state._fsp--;


				current = this_ConditionalTestExpression_0;
				afterParserOrEnumRuleCall();


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleExpression"


	// $ANTLR start "entryRuleConditionalTestExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1058:1: entryRuleConditionalTestExpression returns [EObject
	// current=null] : iv_ruleConditionalTestExpression= ruleConditionalTestExpression EOF ;
	public final EObject entryRuleConditionalTestExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleConditionalTestExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1059:2: (iv_ruleConditionalTestExpression=
			// ruleConditionalTestExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1060:2: iv_ruleConditionalTestExpression=
			// ruleConditionalTestExpression EOF
			{
				newCompositeNode(grammarAccess.getConditionalTestExpressionRule());
				pushFollow(FOLLOW_ruleConditionalTestExpression_in_entryRuleConditionalTestExpression2281);
				iv_ruleConditionalTestExpression = ruleConditionalTestExpression();

				state._fsp--;

				current = iv_ruleConditionalTestExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleConditionalTestExpression2291);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleConditionalTestExpression"


	// $ANTLR start "ruleConditionalTestExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1067:1: ruleConditionalTestExpression returns [EObject current=null]
	// : ( ( (lv_exp_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )? ) ;
	public final EObject ruleConditionalTestExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_whenTrue_2_0 = null;

		EObject lv_whenFalse_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1070:28: ( ( ( (lv_exp_0_0= ruleConditionalOrExpression ) )
			// (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1071:1: ( ( (lv_exp_0_0= ruleConditionalOrExpression ) )
			// (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1071:1: ( ( (lv_exp_0_0= ruleConditionalOrExpression ) )
				// (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1071:2: ( (lv_exp_0_0= ruleConditionalOrExpression ) )
				// (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1071:2: ( (lv_exp_0_0= ruleConditionalOrExpression )
					// )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1072:1: (lv_exp_0_0= ruleConditionalOrExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1072:1: (lv_exp_0_0= ruleConditionalOrExpression
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1073:3: lv_exp_0_0= ruleConditionalOrExpression
						{

							newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getExpConditionalOrExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleConditionalTestExpression2337);
							lv_exp_0_0 = ruleConditionalOrExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
							}
							set(
									current,
									"exp",
									lv_exp_0_0,
									"ConditionalOrExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1089:2: (otherlv_1= '?' ( (lv_whenTrue_2_0=
					// ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )?
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if ((LA17_0 == 23)) {
						alt17 = 1;
					}
					switch (alt17) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1089:4: otherlv_1= '?' ( (lv_whenTrue_2_0=
					// ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) )
					{
						otherlv_1 = (Token) match(input, 23, FOLLOW_23_in_ruleConditionalTestExpression2350);

						newLeafNode(otherlv_1, grammarAccess.getConditionalTestExpressionAccess().getQuestionMarkKeyword_1_0());

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1093:1: ( (lv_whenTrue_2_0=
						// ruleConditionalTestExpression ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1094:1: (lv_whenTrue_2_0=
						// ruleConditionalTestExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1094:1: (lv_whenTrue_2_0=
							// ruleConditionalTestExpression )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1095:3: lv_whenTrue_2_0=
							// ruleConditionalTestExpression
							{

								newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getWhenTrueConditionalTestExpressionParserRuleCall_1_1_0());

								pushFollow(FOLLOW_ruleConditionalTestExpression_in_ruleConditionalTestExpression2371);
								lv_whenTrue_2_0 = ruleConditionalTestExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
								}
								set(
										current,
										"whenTrue",
										lv_whenTrue_2_0,
										"ConditionalTestExpression");
								afterParserOrEnumRuleCall();


							}


						}

						otherlv_3 = (Token) match(input, 24, FOLLOW_24_in_ruleConditionalTestExpression2383);

						newLeafNode(otherlv_3, grammarAccess.getConditionalTestExpressionAccess().getColonKeyword_1_2());

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1115:1: ( (lv_whenFalse_4_0=
						// ruleConditionalTestExpression ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1116:1: (lv_whenFalse_4_0=
						// ruleConditionalTestExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1116:1: (lv_whenFalse_4_0=
							// ruleConditionalTestExpression )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1117:3: lv_whenFalse_4_0=
							// ruleConditionalTestExpression
							{

								newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getWhenFalseConditionalTestExpressionParserRuleCall_1_3_0());

								pushFollow(FOLLOW_ruleConditionalTestExpression_in_ruleConditionalTestExpression2404);
								lv_whenFalse_4_0 = ruleConditionalTestExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
								}
								set(
										current,
										"whenFalse",
										lv_whenFalse_4_0,
										"ConditionalTestExpression");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleConditionalTestExpression"


	// $ANTLR start "entryRuleConditionalOrExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1141:1: entryRuleConditionalOrExpression returns [EObject
	// current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
	public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleConditionalOrExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1142:2: (iv_ruleConditionalOrExpression=
			// ruleConditionalOrExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1143:2: iv_ruleConditionalOrExpression=
			// ruleConditionalOrExpression EOF
			{
				newCompositeNode(grammarAccess.getConditionalOrExpressionRule());
				pushFollow(FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression2442);
				iv_ruleConditionalOrExpression = ruleConditionalOrExpression();

				state._fsp--;

				current = iv_ruleConditionalOrExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleConditionalOrExpression2452);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleConditionalOrExpression"


	// $ANTLR start "ruleConditionalOrExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1150:1: ruleConditionalOrExpression returns [EObject current=null] :
	// ( ( (lv_exp_0_0= ruleConditionalAndExpression ) ) (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )* ) ;
	public final EObject ruleConditionalOrExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1153:28: ( ( ( (lv_exp_0_0= ruleConditionalAndExpression ) )
			// (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1154:1: ( ( (lv_exp_0_0= ruleConditionalAndExpression ) )
			// (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1154:1: ( ( (lv_exp_0_0= ruleConditionalAndExpression )
				// ) (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1154:2: ( (lv_exp_0_0= ruleConditionalAndExpression ) )
				// (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1154:2: ( (lv_exp_0_0= ruleConditionalAndExpression
					// ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1155:1: (lv_exp_0_0= ruleConditionalAndExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1155:1: (lv_exp_0_0=
						// ruleConditionalAndExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1156:3: lv_exp_0_0= ruleConditionalAndExpression
						{

							newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getExpConditionalAndExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2498);
							lv_exp_0_0 = ruleConditionalAndExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"ConditionalAndExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1172:2: (otherlv_1= '||' ( (lv_exp_2_0=
					// ruleConditionalAndExpression ) ) )*
					loop18: do {
						int alt18 = 2;
						int LA18_0 = input.LA(1);

						if ((LA18_0 == 25)) {
							alt18 = 1;
						}


						switch (alt18) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1172:4: otherlv_1= '||' ( (lv_exp_2_0=
						// ruleConditionalAndExpression ) )
						{
							otherlv_1 = (Token) match(input, 25, FOLLOW_25_in_ruleConditionalOrExpression2511);

							newLeafNode(otherlv_1, grammarAccess.getConditionalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1176:1: ( (lv_exp_2_0=
							// ruleConditionalAndExpression ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1177:1: (lv_exp_2_0=
							// ruleConditionalAndExpression )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1177:1: (lv_exp_2_0=
								// ruleConditionalAndExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1178:3: lv_exp_2_0=
								// ruleConditionalAndExpression
								{

									newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getExpConditionalAndExpressionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2532);
									lv_exp_2_0 = ruleConditionalAndExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
									}
									add(
											current,
											"exp",
											lv_exp_2_0,
											"ConditionalAndExpression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop18;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleConditionalOrExpression"


	// $ANTLR start "entryRuleConditionalAndExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1202:1: entryRuleConditionalAndExpression returns [EObject
	// current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
	public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleConditionalAndExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1203:2: (iv_ruleConditionalAndExpression=
			// ruleConditionalAndExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1204:2: iv_ruleConditionalAndExpression=
			// ruleConditionalAndExpression EOF
			{
				newCompositeNode(grammarAccess.getConditionalAndExpressionRule());
				pushFollow(FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression2570);
				iv_ruleConditionalAndExpression = ruleConditionalAndExpression();

				state._fsp--;

				current = iv_ruleConditionalAndExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleConditionalAndExpression2580);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleConditionalAndExpression"


	// $ANTLR start "ruleConditionalAndExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1211:1: ruleConditionalAndExpression returns [EObject current=null]
	// : ( ( (lv_exp_0_0= ruleInclusiveOrExpression ) ) (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )* ) ;
	public final EObject ruleConditionalAndExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1214:28: ( ( ( (lv_exp_0_0= ruleInclusiveOrExpression ) )
			// (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1215:1: ( ( (lv_exp_0_0= ruleInclusiveOrExpression ) )
			// (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1215:1: ( ( (lv_exp_0_0= ruleInclusiveOrExpression ) )
				// (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1215:2: ( (lv_exp_0_0= ruleInclusiveOrExpression ) )
				// (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1215:2: ( (lv_exp_0_0= ruleInclusiveOrExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1216:1: (lv_exp_0_0= ruleInclusiveOrExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1216:1: (lv_exp_0_0= ruleInclusiveOrExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1217:3: lv_exp_0_0= ruleInclusiveOrExpression
						{

							newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getExpInclusiveOrExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleInclusiveOrExpression_in_ruleConditionalAndExpression2626);
							lv_exp_0_0 = ruleInclusiveOrExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"InclusiveOrExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1233:2: (otherlv_1= '&&' ( (lv_exp_2_0=
					// ruleInclusiveOrExpression ) ) )*
					loop19: do {
						int alt19 = 2;
						int LA19_0 = input.LA(1);

						if ((LA19_0 == 26)) {
							alt19 = 1;
						}


						switch (alt19) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1233:4: otherlv_1= '&&' ( (lv_exp_2_0=
						// ruleInclusiveOrExpression ) )
						{
							otherlv_1 = (Token) match(input, 26, FOLLOW_26_in_ruleConditionalAndExpression2639);

							newLeafNode(otherlv_1, grammarAccess.getConditionalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1237:1: ( (lv_exp_2_0=
							// ruleInclusiveOrExpression ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1238:1: (lv_exp_2_0=
							// ruleInclusiveOrExpression )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1238:1: (lv_exp_2_0=
								// ruleInclusiveOrExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1239:3: lv_exp_2_0=
								// ruleInclusiveOrExpression
								{

									newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getExpInclusiveOrExpressionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleInclusiveOrExpression_in_ruleConditionalAndExpression2660);
									lv_exp_2_0 = ruleInclusiveOrExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
									}
									add(
											current,
											"exp",
											lv_exp_2_0,
											"InclusiveOrExpression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop19;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleConditionalAndExpression"


	// $ANTLR start "entryRuleInclusiveOrExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1263:1: entryRuleInclusiveOrExpression returns [EObject
	// current=null] : iv_ruleInclusiveOrExpression= ruleInclusiveOrExpression EOF ;
	public final EObject entryRuleInclusiveOrExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleInclusiveOrExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1264:2: (iv_ruleInclusiveOrExpression=
			// ruleInclusiveOrExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1265:2: iv_ruleInclusiveOrExpression=
			// ruleInclusiveOrExpression EOF
			{
				newCompositeNode(grammarAccess.getInclusiveOrExpressionRule());
				pushFollow(FOLLOW_ruleInclusiveOrExpression_in_entryRuleInclusiveOrExpression2698);
				iv_ruleInclusiveOrExpression = ruleInclusiveOrExpression();

				state._fsp--;

				current = iv_ruleInclusiveOrExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleInclusiveOrExpression2708);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleInclusiveOrExpression"


	// $ANTLR start "ruleInclusiveOrExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1272:1: ruleInclusiveOrExpression returns [EObject current=null] : (
	// ( (lv_exp_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )* ) ;
	public final EObject ruleInclusiveOrExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1275:28: ( ( ( (lv_exp_0_0= ruleExclusiveOrExpression ) )
			// (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1276:1: ( ( (lv_exp_0_0= ruleExclusiveOrExpression ) )
			// (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1276:1: ( ( (lv_exp_0_0= ruleExclusiveOrExpression ) )
				// (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1276:2: ( (lv_exp_0_0= ruleExclusiveOrExpression ) )
				// (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1276:2: ( (lv_exp_0_0= ruleExclusiveOrExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1277:1: (lv_exp_0_0= ruleExclusiveOrExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1277:1: (lv_exp_0_0= ruleExclusiveOrExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1278:3: lv_exp_0_0= ruleExclusiveOrExpression
						{

							newCompositeNode(grammarAccess.getInclusiveOrExpressionAccess().getExpExclusiveOrExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleExclusiveOrExpression_in_ruleInclusiveOrExpression2754);
							lv_exp_0_0 = ruleExclusiveOrExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getInclusiveOrExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"ExclusiveOrExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1294:2: (otherlv_1= '|' ( (lv_exp_2_0=
					// ruleExclusiveOrExpression ) ) )*
					loop20: do {
						int alt20 = 2;
						int LA20_0 = input.LA(1);

						if ((LA20_0 == 27)) {
							alt20 = 1;
						}


						switch (alt20) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1294:4: otherlv_1= '|' ( (lv_exp_2_0=
						// ruleExclusiveOrExpression ) )
						{
							otherlv_1 = (Token) match(input, 27, FOLLOW_27_in_ruleInclusiveOrExpression2767);

							newLeafNode(otherlv_1, grammarAccess.getInclusiveOrExpressionAccess().getVerticalLineKeyword_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1298:1: ( (lv_exp_2_0=
							// ruleExclusiveOrExpression ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1299:1: (lv_exp_2_0=
							// ruleExclusiveOrExpression )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1299:1: (lv_exp_2_0=
								// ruleExclusiveOrExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1300:3: lv_exp_2_0=
								// ruleExclusiveOrExpression
								{

									newCompositeNode(grammarAccess.getInclusiveOrExpressionAccess().getExpExclusiveOrExpressionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleExclusiveOrExpression_in_ruleInclusiveOrExpression2788);
									lv_exp_2_0 = ruleExclusiveOrExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getInclusiveOrExpressionRule());
									}
									add(
											current,
											"exp",
											lv_exp_2_0,
											"ExclusiveOrExpression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop20;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleInclusiveOrExpression"


	// $ANTLR start "entryRuleExclusiveOrExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1324:1: entryRuleExclusiveOrExpression returns [EObject
	// current=null] : iv_ruleExclusiveOrExpression= ruleExclusiveOrExpression EOF ;
	public final EObject entryRuleExclusiveOrExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleExclusiveOrExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1325:2: (iv_ruleExclusiveOrExpression=
			// ruleExclusiveOrExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1326:2: iv_ruleExclusiveOrExpression=
			// ruleExclusiveOrExpression EOF
			{
				newCompositeNode(grammarAccess.getExclusiveOrExpressionRule());
				pushFollow(FOLLOW_ruleExclusiveOrExpression_in_entryRuleExclusiveOrExpression2826);
				iv_ruleExclusiveOrExpression = ruleExclusiveOrExpression();

				state._fsp--;

				current = iv_ruleExclusiveOrExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleExclusiveOrExpression2836);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleExclusiveOrExpression"


	// $ANTLR start "ruleExclusiveOrExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1333:1: ruleExclusiveOrExpression returns [EObject current=null] : (
	// ( (lv_exp_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )* ) ;
	public final EObject ruleExclusiveOrExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1336:28: ( ( ( (lv_exp_0_0= ruleAndExpression ) )
			// (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1337:1: ( ( (lv_exp_0_0= ruleAndExpression ) ) (otherlv_1=
			// '^' ( (lv_exp_2_0= ruleAndExpression ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1337:1: ( ( (lv_exp_0_0= ruleAndExpression ) )
				// (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1337:2: ( (lv_exp_0_0= ruleAndExpression ) ) (otherlv_1=
				// '^' ( (lv_exp_2_0= ruleAndExpression ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1337:2: ( (lv_exp_0_0= ruleAndExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1338:1: (lv_exp_0_0= ruleAndExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1338:1: (lv_exp_0_0= ruleAndExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1339:3: lv_exp_0_0= ruleAndExpression
						{

							newCompositeNode(grammarAccess.getExclusiveOrExpressionAccess().getExpAndExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleAndExpression_in_ruleExclusiveOrExpression2882);
							lv_exp_0_0 = ruleAndExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getExclusiveOrExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"AndExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1355:2: (otherlv_1= '^' ( (lv_exp_2_0=
					// ruleAndExpression ) ) )*
					loop21: do {
						int alt21 = 2;
						int LA21_0 = input.LA(1);

						if ((LA21_0 == 28)) {
							alt21 = 1;
						}


						switch (alt21) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1355:4: otherlv_1= '^' ( (lv_exp_2_0=
						// ruleAndExpression ) )
						{
							otherlv_1 = (Token) match(input, 28, FOLLOW_28_in_ruleExclusiveOrExpression2895);

							newLeafNode(otherlv_1, grammarAccess.getExclusiveOrExpressionAccess().getCircumflexAccentKeyword_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1359:1: ( (lv_exp_2_0= ruleAndExpression ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1360:1: (lv_exp_2_0= ruleAndExpression )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1360:1: (lv_exp_2_0= ruleAndExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1361:3: lv_exp_2_0= ruleAndExpression
								{

									newCompositeNode(grammarAccess.getExclusiveOrExpressionAccess().getExpAndExpressionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleAndExpression_in_ruleExclusiveOrExpression2916);
									lv_exp_2_0 = ruleAndExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getExclusiveOrExpressionRule());
									}
									add(
											current,
											"exp",
											lv_exp_2_0,
											"AndExpression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop21;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleExclusiveOrExpression"


	// $ANTLR start "entryRuleAndExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1385:1: entryRuleAndExpression returns [EObject current=null] :
	// iv_ruleAndExpression= ruleAndExpression EOF ;
	public final EObject entryRuleAndExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAndExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1386:2: (iv_ruleAndExpression= ruleAndExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1387:2: iv_ruleAndExpression= ruleAndExpression EOF
			{
				newCompositeNode(grammarAccess.getAndExpressionRule());
				pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2954);
				iv_ruleAndExpression = ruleAndExpression();

				state._fsp--;

				current = iv_ruleAndExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAndExpression2964);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAndExpression"


	// $ANTLR start "ruleAndExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1394:1: ruleAndExpression returns [EObject current=null] : ( (
	// (lv_exp_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )* ) ;
	public final EObject ruleAndExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1397:28: ( ( ( (lv_exp_0_0= ruleEqualityExpression ) )
			// (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1398:1: ( ( (lv_exp_0_0= ruleEqualityExpression ) )
			// (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1398:1: ( ( (lv_exp_0_0= ruleEqualityExpression ) )
				// (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1398:2: ( (lv_exp_0_0= ruleEqualityExpression ) )
				// (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1398:2: ( (lv_exp_0_0= ruleEqualityExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1399:1: (lv_exp_0_0= ruleEqualityExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1399:1: (lv_exp_0_0= ruleEqualityExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1400:3: lv_exp_0_0= ruleEqualityExpression
						{

							newCompositeNode(grammarAccess.getAndExpressionAccess().getExpEqualityExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression3010);
							lv_exp_0_0 = ruleEqualityExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"EqualityExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1416:2: (otherlv_1= '&' ( (lv_exp_2_0=
					// ruleEqualityExpression ) ) )*
					loop22: do {
						int alt22 = 2;
						int LA22_0 = input.LA(1);

						if ((LA22_0 == 29)) {
							alt22 = 1;
						}


						switch (alt22) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1416:4: otherlv_1= '&' ( (lv_exp_2_0=
						// ruleEqualityExpression ) )
						{
							otherlv_1 = (Token) match(input, 29, FOLLOW_29_in_ruleAndExpression3023);

							newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1420:1: ( (lv_exp_2_0=
							// ruleEqualityExpression ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1421:1: (lv_exp_2_0= ruleEqualityExpression
							// )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1421:1: (lv_exp_2_0=
								// ruleEqualityExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1422:3: lv_exp_2_0=
								// ruleEqualityExpression
								{

									newCompositeNode(grammarAccess.getAndExpressionAccess().getExpEqualityExpressionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression3044);
									lv_exp_2_0 = ruleEqualityExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getAndExpressionRule());
									}
									add(
											current,
											"exp",
											lv_exp_2_0,
											"EqualityExpression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop22;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAndExpression"


	// $ANTLR start "entryRuleEqualityExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1446:1: entryRuleEqualityExpression returns [EObject current=null] :
	// iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
	public final EObject entryRuleEqualityExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleEqualityExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1447:2: (iv_ruleEqualityExpression= ruleEqualityExpression
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1448:2: iv_ruleEqualityExpression= ruleEqualityExpression
			// EOF
			{
				newCompositeNode(grammarAccess.getEqualityExpressionRule());
				pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression3082);
				iv_ruleEqualityExpression = ruleEqualityExpression();

				state._fsp--;

				current = iv_ruleEqualityExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleEqualityExpression3092);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleEqualityExpression"


	// $ANTLR start "ruleEqualityExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1455:1: ruleEqualityExpression returns [EObject current=null] : ( (
	// (lv_exp_0_0= ruleClassificationExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )* ) ;
	public final EObject ruleEqualityExpression() throws RecognitionException {
		EObject current = null;

		Token lv_op_1_1 = null;
		Token lv_op_1_2 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1458:28: ( ( ( (lv_exp_0_0= ruleClassificationExpression ) )
			// ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1459:1: ( ( (lv_exp_0_0= ruleClassificationExpression ) ) (
			// ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1459:1: ( ( (lv_exp_0_0= ruleClassificationExpression )
				// ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1459:2: ( (lv_exp_0_0= ruleClassificationExpression ) )
				// ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1459:2: ( (lv_exp_0_0= ruleClassificationExpression
					// ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1460:1: (lv_exp_0_0= ruleClassificationExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1460:1: (lv_exp_0_0=
						// ruleClassificationExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1461:3: lv_exp_0_0= ruleClassificationExpression
						{

							newCompositeNode(grammarAccess.getEqualityExpressionAccess().getExpClassificationExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleClassificationExpression_in_ruleEqualityExpression3138);
							lv_exp_0_0 = ruleClassificationExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"ClassificationExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1477:2: ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) )
					// ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )*
					loop24: do {
						int alt24 = 2;
						int LA24_0 = input.LA(1);

						if (((LA24_0 >= 30 && LA24_0 <= 31))) {
							alt24 = 1;
						}


						switch (alt24) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1477:3: ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' )
						// ) ) ( (lv_exp_2_0= ruleClassificationExpression ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1477:3: ( ( (lv_op_1_1= '==' | lv_op_1_2=
							// '!=' ) ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1478:1: ( (lv_op_1_1= '==' | lv_op_1_2= '!='
							// ) )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1478:1: ( (lv_op_1_1= '==' | lv_op_1_2=
								// '!=' ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1479:1: (lv_op_1_1= '==' | lv_op_1_2=
								// '!=' )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1479:1: (lv_op_1_1= '==' |
									// lv_op_1_2= '!=' )
									int alt23 = 2;
									int LA23_0 = input.LA(1);

									if ((LA23_0 == 30)) {
										alt23 = 1;
									}
									else if ((LA23_0 == 31)) {
										alt23 = 2;
									}
									else {
										NoViableAltException nvae =
												new NoViableAltException("", 23, 0, input);

										throw nvae;
									}
									switch (alt23) {
									case 1:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1480:3: lv_op_1_1= '=='
									{
										lv_op_1_1 = (Token) match(input, 30, FOLLOW_30_in_ruleEqualityExpression3159);

										newLeafNode(lv_op_1_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_0_0_0());


										if (current == null) {
											current = createModelElement(grammarAccess.getEqualityExpressionRule());
										}
										addWithLastConsumed(current, "op", lv_op_1_1, null);


									}
										break;
									case 2:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1492:8: lv_op_1_2= '!='
									{
										lv_op_1_2 = (Token) match(input, 31, FOLLOW_31_in_ruleEqualityExpression3188);

										newLeafNode(lv_op_1_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_0_0_1());


										if (current == null) {
											current = createModelElement(grammarAccess.getEqualityExpressionRule());
										}
										addWithLastConsumed(current, "op", lv_op_1_2, null);


									}
										break;

									}


								}


							}

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1507:2: ( (lv_exp_2_0=
							// ruleClassificationExpression ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1508:1: (lv_exp_2_0=
							// ruleClassificationExpression )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1508:1: (lv_exp_2_0=
								// ruleClassificationExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1509:3: lv_exp_2_0=
								// ruleClassificationExpression
								{

									newCompositeNode(grammarAccess.getEqualityExpressionAccess().getExpClassificationExpressionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleClassificationExpression_in_ruleEqualityExpression3225);
									lv_exp_2_0 = ruleClassificationExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
									}
									add(
											current,
											"exp",
											lv_exp_2_0,
											"ClassificationExpression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop24;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleEqualityExpression"


	// $ANTLR start "entryRuleClassificationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1533:1: entryRuleClassificationExpression returns [EObject
	// current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
	public final EObject entryRuleClassificationExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleClassificationExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1534:2: (iv_ruleClassificationExpression=
			// ruleClassificationExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1535:2: iv_ruleClassificationExpression=
			// ruleClassificationExpression EOF
			{
				newCompositeNode(grammarAccess.getClassificationExpressionRule());
				pushFollow(FOLLOW_ruleClassificationExpression_in_entryRuleClassificationExpression3263);
				iv_ruleClassificationExpression = ruleClassificationExpression();

				state._fsp--;

				current = iv_ruleClassificationExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleClassificationExpression3273);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleClassificationExpression"


	// $ANTLR start "ruleClassificationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1542:1: ruleClassificationExpression returns [EObject current=null]
	// : ( ( (lv_exp_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )? ) ;
	public final EObject ruleClassificationExpression() throws RecognitionException {
		EObject current = null;

		Token lv_op_1_1 = null;
		Token lv_op_1_2 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_typeName_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1545:28: ( ( ( (lv_exp_0_0= ruleRelationalExpression ) ) ( (
			// ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1546:1: ( ( (lv_exp_0_0= ruleRelationalExpression ) ) ( ( (
			// (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1546:1: ( ( (lv_exp_0_0= ruleRelationalExpression ) ) (
				// ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1546:2: ( (lv_exp_0_0= ruleRelationalExpression ) ) ( (
				// ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1546:2: ( (lv_exp_0_0= ruleRelationalExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1547:1: (lv_exp_0_0= ruleRelationalExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1547:1: (lv_exp_0_0= ruleRelationalExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1548:3: lv_exp_0_0= ruleRelationalExpression
						{

							newCompositeNode(grammarAccess.getClassificationExpressionAccess().getExpRelationalExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleRelationalExpression_in_ruleClassificationExpression3319);
							lv_exp_0_0 = ruleRelationalExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
							}
							set(
									current,
									"exp",
									lv_exp_0_0,
									"RelationalExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1564:2: ( ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2=
					// 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )?
					int alt26 = 2;
					int LA26_0 = input.LA(1);

					if (((LA26_0 >= 32 && LA26_0 <= 33))) {
						alt26 = 1;
					}
					switch (alt26) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1564:3: ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2=
					// 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1564:3: ( ( (lv_op_1_1= 'instanceof' |
						// lv_op_1_2= 'hastype' ) ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1565:1: ( (lv_op_1_1= 'instanceof' | lv_op_1_2=
						// 'hastype' ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1565:1: ( (lv_op_1_1= 'instanceof' |
							// lv_op_1_2= 'hastype' ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1566:1: (lv_op_1_1= 'instanceof' |
							// lv_op_1_2= 'hastype' )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1566:1: (lv_op_1_1= 'instanceof' |
								// lv_op_1_2= 'hastype' )
								int alt25 = 2;
								int LA25_0 = input.LA(1);

								if ((LA25_0 == 32)) {
									alt25 = 1;
								}
								else if ((LA25_0 == 33)) {
									alt25 = 2;
								}
								else {
									NoViableAltException nvae =
											new NoViableAltException("", 25, 0, input);

									throw nvae;
								}
								switch (alt25) {
								case 1:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1567:3: lv_op_1_1= 'instanceof'
								{
									lv_op_1_1 = (Token) match(input, 32, FOLLOW_32_in_ruleClassificationExpression3340);

									newLeafNode(lv_op_1_1, grammarAccess.getClassificationExpressionAccess().getOpInstanceofKeyword_1_0_0_0());


									if (current == null) {
										current = createModelElement(grammarAccess.getClassificationExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_1, null);


								}
									break;
								case 2:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1579:8: lv_op_1_2= 'hastype'
								{
									lv_op_1_2 = (Token) match(input, 33, FOLLOW_33_in_ruleClassificationExpression3369);

									newLeafNode(lv_op_1_2, grammarAccess.getClassificationExpressionAccess().getOpHastypeKeyword_1_0_0_1());


									if (current == null) {
										current = createModelElement(grammarAccess.getClassificationExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_2, null);


								}
									break;

								}


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1594:2: ( (lv_typeName_2_0= ruleNameExpression )
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1595:1: (lv_typeName_2_0= ruleNameExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1595:1: (lv_typeName_2_0= ruleNameExpression
							// )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1596:3: lv_typeName_2_0= ruleNameExpression
							{

								newCompositeNode(grammarAccess.getClassificationExpressionAccess().getTypeNameNameExpressionParserRuleCall_1_1_0());

								pushFollow(FOLLOW_ruleNameExpression_in_ruleClassificationExpression3406);
								lv_typeName_2_0 = ruleNameExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
								}
								set(
										current,
										"typeName",
										lv_typeName_2_0,
										"NameExpression");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleClassificationExpression"


	// $ANTLR start "entryRuleRelationalExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1620:1: entryRuleRelationalExpression returns [EObject current=null]
	// : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
	public final EObject entryRuleRelationalExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRelationalExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1621:2: (iv_ruleRelationalExpression=
			// ruleRelationalExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1622:2: iv_ruleRelationalExpression=
			// ruleRelationalExpression EOF
			{
				newCompositeNode(grammarAccess.getRelationalExpressionRule());
				pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3444);
				iv_ruleRelationalExpression = ruleRelationalExpression();

				state._fsp--;

				current = iv_ruleRelationalExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleRelationalExpression3454);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleRelationalExpression"


	// $ANTLR start "ruleRelationalExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1629:1: ruleRelationalExpression returns [EObject current=null] : (
	// ( (lv_left_0_0= ruleShiftExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )? ) ;
	public final EObject ruleRelationalExpression() throws RecognitionException {
		EObject current = null;

		Token lv_op_1_1 = null;
		Token lv_op_1_2 = null;
		Token lv_op_1_3 = null;
		Token lv_op_1_4 = null;
		EObject lv_left_0_0 = null;

		EObject lv_right_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1632:28: ( ( ( (lv_left_0_0= ruleShiftExpression ) ) ( ( (
			// (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1633:1: ( ( (lv_left_0_0= ruleShiftExpression ) ) ( ( (
			// (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1633:1: ( ( (lv_left_0_0= ruleShiftExpression ) ) ( ( (
				// (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1633:2: ( (lv_left_0_0= ruleShiftExpression ) ) ( ( (
				// (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1633:2: ( (lv_left_0_0= ruleShiftExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1634:1: (lv_left_0_0= ruleShiftExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1634:1: (lv_left_0_0= ruleShiftExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1635:3: lv_left_0_0= ruleShiftExpression
						{

							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getLeftShiftExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleShiftExpression_in_ruleRelationalExpression3500);
							lv_left_0_0 = ruleShiftExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
							}
							set(
									current,
									"left",
									lv_left_0_0,
									"ShiftExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1651:2: ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' |
					// lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )?
					int alt28 = 2;
					int LA28_0 = input.LA(1);

					if ((LA28_0 == 17 || LA28_0 == 19 || (LA28_0 >= 34 && LA28_0 <= 35))) {
						alt28 = 1;
					}
					switch (alt28) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1651:3: ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' |
					// lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1651:3: ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' |
						// lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1652:1: ( (lv_op_1_1= '<' | lv_op_1_2= '>' |
						// lv_op_1_3= '<=' | lv_op_1_4= '>=' ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1652:1: ( (lv_op_1_1= '<' | lv_op_1_2= '>' |
							// lv_op_1_3= '<=' | lv_op_1_4= '>=' ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1653:1: (lv_op_1_1= '<' | lv_op_1_2= '>' |
							// lv_op_1_3= '<=' | lv_op_1_4= '>=' )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1653:1: (lv_op_1_1= '<' | lv_op_1_2= '>'
								// | lv_op_1_3= '<=' | lv_op_1_4= '>=' )
								int alt27 = 4;
								switch (input.LA(1)) {
								case 17: {
									alt27 = 1;
								}
									break;
								case 19: {
									alt27 = 2;
								}
									break;
								case 34: {
									alt27 = 3;
								}
									break;
								case 35: {
									alt27 = 4;
								}
									break;
								default:
									NoViableAltException nvae =
											new NoViableAltException("", 27, 0, input);

									throw nvae;
								}

								switch (alt27) {
								case 1:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1654:3: lv_op_1_1= '<'
								{
									lv_op_1_1 = (Token) match(input, 17, FOLLOW_17_in_ruleRelationalExpression3521);

									newLeafNode(lv_op_1_1, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_0_0_0());


									if (current == null) {
										current = createModelElement(grammarAccess.getRelationalExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_1, null);


								}
									break;
								case 2:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1666:8: lv_op_1_2= '>'
								{
									lv_op_1_2 = (Token) match(input, 19, FOLLOW_19_in_ruleRelationalExpression3550);

									newLeafNode(lv_op_1_2, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1());


									if (current == null) {
										current = createModelElement(grammarAccess.getRelationalExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_2, null);


								}
									break;
								case 3:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1678:8: lv_op_1_3= '<='
								{
									lv_op_1_3 = (Token) match(input, 34, FOLLOW_34_in_ruleRelationalExpression3579);

									newLeafNode(lv_op_1_3, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_2());


									if (current == null) {
										current = createModelElement(grammarAccess.getRelationalExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_3, null);


								}
									break;
								case 4:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1690:8: lv_op_1_4= '>='
								{
									lv_op_1_4 = (Token) match(input, 35, FOLLOW_35_in_ruleRelationalExpression3608);

									newLeafNode(lv_op_1_4, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_3());


									if (current == null) {
										current = createModelElement(grammarAccess.getRelationalExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_4, null);


								}
									break;

								}


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1705:2: ( (lv_right_2_0= ruleShiftExpression ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1706:1: (lv_right_2_0= ruleShiftExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1706:1: (lv_right_2_0= ruleShiftExpression )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1707:3: lv_right_2_0= ruleShiftExpression
							{

								newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightShiftExpressionParserRuleCall_1_1_0());

								pushFollow(FOLLOW_ruleShiftExpression_in_ruleRelationalExpression3645);
								lv_right_2_0 = ruleShiftExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
								}
								set(
										current,
										"right",
										lv_right_2_0,
										"ShiftExpression");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleRelationalExpression"


	// $ANTLR start "entryRuleShiftExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1731:1: entryRuleShiftExpression returns [EObject current=null] :
	// iv_ruleShiftExpression= ruleShiftExpression EOF ;
	public final EObject entryRuleShiftExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleShiftExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1732:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1733:2: iv_ruleShiftExpression= ruleShiftExpression EOF
			{
				newCompositeNode(grammarAccess.getShiftExpressionRule());
				pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression3683);
				iv_ruleShiftExpression = ruleShiftExpression();

				state._fsp--;

				current = iv_ruleShiftExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleShiftExpression3693);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleShiftExpression"


	// $ANTLR start "ruleShiftExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1740:1: ruleShiftExpression returns [EObject current=null] : ( (
	// (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )? ) ;
	public final EObject ruleShiftExpression() throws RecognitionException {
		EObject current = null;

		Token lv_op_1_1 = null;
		Token lv_op_1_2 = null;
		Token lv_op_1_3 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1743:28: ( ( ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( (
			// (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1744:1: ( ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( (
			// (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1744:1: ( ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( (
				// ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1744:2: ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( (
				// (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1744:2: ( (lv_exp_0_0= ruleAdditiveExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1745:1: (lv_exp_0_0= ruleAdditiveExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1745:1: (lv_exp_0_0= ruleAdditiveExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1746:3: lv_exp_0_0= ruleAdditiveExpression
						{

							newCompositeNode(grammarAccess.getShiftExpressionAccess().getExpAdditiveExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression3739);
							lv_exp_0_0 = ruleAdditiveExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"AdditiveExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1762:2: ( ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' |
					// lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )?
					int alt30 = 2;
					int LA30_0 = input.LA(1);

					if (((LA30_0 >= 36 && LA30_0 <= 38))) {
						alt30 = 1;
					}
					switch (alt30) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1762:3: ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' |
					// lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1762:3: ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' |
						// lv_op_1_3= '>>>' ) ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1763:1: ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' |
						// lv_op_1_3= '>>>' ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1763:1: ( (lv_op_1_1= '<<' | lv_op_1_2= '>>'
							// | lv_op_1_3= '>>>' ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1764:1: (lv_op_1_1= '<<' | lv_op_1_2= '>>' |
							// lv_op_1_3= '>>>' )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1764:1: (lv_op_1_1= '<<' | lv_op_1_2=
								// '>>' | lv_op_1_3= '>>>' )
								int alt29 = 3;
								switch (input.LA(1)) {
								case 36: {
									alt29 = 1;
								}
									break;
								case 37: {
									alt29 = 2;
								}
									break;
								case 38: {
									alt29 = 3;
								}
									break;
								default:
									NoViableAltException nvae =
											new NoViableAltException("", 29, 0, input);

									throw nvae;
								}

								switch (alt29) {
								case 1:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1765:3: lv_op_1_1= '<<'
								{
									lv_op_1_1 = (Token) match(input, 36, FOLLOW_36_in_ruleShiftExpression3760);

									newLeafNode(lv_op_1_1, grammarAccess.getShiftExpressionAccess().getOpLessThanSignLessThanSignKeyword_1_0_0_0());


									if (current == null) {
										current = createModelElement(grammarAccess.getShiftExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_1, null);


								}
									break;
								case 2:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1777:8: lv_op_1_2= '>>'
								{
									lv_op_1_2 = (Token) match(input, 37, FOLLOW_37_in_ruleShiftExpression3789);

									newLeafNode(lv_op_1_2, grammarAccess.getShiftExpressionAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_0_0_1());


									if (current == null) {
										current = createModelElement(grammarAccess.getShiftExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_2, null);


								}
									break;
								case 3:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1789:8: lv_op_1_3= '>>>'
								{
									lv_op_1_3 = (Token) match(input, 38, FOLLOW_38_in_ruleShiftExpression3818);

									newLeafNode(lv_op_1_3, grammarAccess.getShiftExpressionAccess().getOpGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_0_0_2());


									if (current == null) {
										current = createModelElement(grammarAccess.getShiftExpressionRule());
									}
									setWithLastConsumed(current, "op", lv_op_1_3, null);


								}
									break;

								}


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1804:2: ( (lv_exp_2_0= ruleAdditiveExpression )
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1805:1: (lv_exp_2_0= ruleAdditiveExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1805:1: (lv_exp_2_0= ruleAdditiveExpression
							// )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1806:3: lv_exp_2_0= ruleAdditiveExpression
							{

								newCompositeNode(grammarAccess.getShiftExpressionAccess().getExpAdditiveExpressionParserRuleCall_1_1_0());

								pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression3855);
								lv_exp_2_0 = ruleAdditiveExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
								}
								add(
										current,
										"exp",
										lv_exp_2_0,
										"AdditiveExpression");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleShiftExpression"


	// $ANTLR start "entryRuleAdditiveExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1830:1: entryRuleAdditiveExpression returns [EObject current=null] :
	// iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
	public final EObject entryRuleAdditiveExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAdditiveExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1831:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1832:2: iv_ruleAdditiveExpression= ruleAdditiveExpression
			// EOF
			{
				newCompositeNode(grammarAccess.getAdditiveExpressionRule());
				pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3893);
				iv_ruleAdditiveExpression = ruleAdditiveExpression();

				state._fsp--;

				current = iv_ruleAdditiveExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAdditiveExpression3903);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAdditiveExpression"


	// $ANTLR start "ruleAdditiveExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1839:1: ruleAdditiveExpression returns [EObject current=null] : ( (
	// (lv_exp_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )* ) ;
	public final EObject ruleAdditiveExpression() throws RecognitionException {
		EObject current = null;

		Token lv_op_1_1 = null;
		Token lv_op_1_2 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1842:28: ( ( ( (lv_exp_0_0= ruleMultiplicativeExpression ) )
			// ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1843:1: ( ( (lv_exp_0_0= ruleMultiplicativeExpression ) ) (
			// ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1843:1: ( ( (lv_exp_0_0= ruleMultiplicativeExpression )
				// ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1843:2: ( (lv_exp_0_0= ruleMultiplicativeExpression ) )
				// ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1843:2: ( (lv_exp_0_0= ruleMultiplicativeExpression
					// ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1844:1: (lv_exp_0_0= ruleMultiplicativeExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1844:1: (lv_exp_0_0=
						// ruleMultiplicativeExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1845:3: lv_exp_0_0= ruleMultiplicativeExpression
						{

							newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getExpMultiplicativeExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3949);
							lv_exp_0_0 = ruleMultiplicativeExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"MultiplicativeExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1861:2: ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) )
					// ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )*
					loop32: do {
						int alt32 = 2;
						int LA32_0 = input.LA(1);

						if (((LA32_0 >= 39 && LA32_0 <= 40))) {
							alt32 = 1;
						}


						switch (alt32) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1861:3: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
						// ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1861:3: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-'
							// ) ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1862:1: ( (lv_op_1_1= '+' | lv_op_1_2= '-' )
							// )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1862:1: ( (lv_op_1_1= '+' | lv_op_1_2=
								// '-' ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1863:1: (lv_op_1_1= '+' | lv_op_1_2= '-'
								// )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1863:1: (lv_op_1_1= '+' | lv_op_1_2=
									// '-' )
									int alt31 = 2;
									int LA31_0 = input.LA(1);

									if ((LA31_0 == 39)) {
										alt31 = 1;
									}
									else if ((LA31_0 == 40)) {
										alt31 = 2;
									}
									else {
										NoViableAltException nvae =
												new NoViableAltException("", 31, 0, input);

										throw nvae;
									}
									switch (alt31) {
									case 1:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1864:3: lv_op_1_1= '+'
									{
										lv_op_1_1 = (Token) match(input, 39, FOLLOW_39_in_ruleAdditiveExpression3970);

										newLeafNode(lv_op_1_1, grammarAccess.getAdditiveExpressionAccess().getOpPlusSignKeyword_1_0_0_0());


										if (current == null) {
											current = createModelElement(grammarAccess.getAdditiveExpressionRule());
										}
										addWithLastConsumed(current, "op", lv_op_1_1, null);


									}
										break;
									case 2:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1876:8: lv_op_1_2= '-'
									{
										lv_op_1_2 = (Token) match(input, 40, FOLLOW_40_in_ruleAdditiveExpression3999);

										newLeafNode(lv_op_1_2, grammarAccess.getAdditiveExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1());


										if (current == null) {
											current = createModelElement(grammarAccess.getAdditiveExpressionRule());
										}
										addWithLastConsumed(current, "op", lv_op_1_2, null);


									}
										break;

									}


								}


							}

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1891:2: ( (lv_exp_2_0=
							// ruleMultiplicativeExpression ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1892:1: (lv_exp_2_0=
							// ruleMultiplicativeExpression )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1892:1: (lv_exp_2_0=
								// ruleMultiplicativeExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1893:3: lv_exp_2_0=
								// ruleMultiplicativeExpression
								{

									newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getExpMultiplicativeExpressionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4036);
									lv_exp_2_0 = ruleMultiplicativeExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
									}
									add(
											current,
											"exp",
											lv_exp_2_0,
											"MultiplicativeExpression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop32;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAdditiveExpression"


	// $ANTLR start "entryRuleMultiplicativeExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1917:1: entryRuleMultiplicativeExpression returns [EObject
	// current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
	public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleMultiplicativeExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1918:2: (iv_ruleMultiplicativeExpression=
			// ruleMultiplicativeExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1919:2: iv_ruleMultiplicativeExpression=
			// ruleMultiplicativeExpression EOF
			{
				newCompositeNode(grammarAccess.getMultiplicativeExpressionRule());
				pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression4074);
				iv_ruleMultiplicativeExpression = ruleMultiplicativeExpression();

				state._fsp--;

				current = iv_ruleMultiplicativeExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleMultiplicativeExpression4084);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleMultiplicativeExpression"


	// $ANTLR start "ruleMultiplicativeExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1926:1: ruleMultiplicativeExpression returns [EObject current=null]
	// : ( ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )* ) ;
	public final EObject ruleMultiplicativeExpression() throws RecognitionException {
		EObject current = null;

		Token lv_op_1_1 = null;
		Token lv_op_1_2 = null;
		Token lv_op_1_3 = null;
		EObject lv_exp_0_0 = null;

		EObject lv_exp_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1929:28: ( ( ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( (
			// (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1930:1: ( ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( (
			// (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1930:1: ( ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( (
				// (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1930:2: ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( (
				// (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1930:2: ( (lv_exp_0_0= ruleUnaryExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1931:1: (lv_exp_0_0= ruleUnaryExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1931:1: (lv_exp_0_0= ruleUnaryExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1932:3: lv_exp_0_0= ruleUnaryExpression
						{

							newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExpUnaryExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression4130);
							lv_exp_0_0 = ruleUnaryExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
							}
							add(
									current,
									"exp",
									lv_exp_0_0,
									"UnaryExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1948:2: ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' |
					// lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )*
					loop34: do {
						int alt34 = 2;
						int LA34_0 = input.LA(1);

						if ((LA34_0 == 13 || (LA34_0 >= 41 && LA34_0 <= 42))) {
							alt34 = 1;
						}


						switch (alt34) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1948:3: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' |
						// lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1948:3: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/'
							// | lv_op_1_3= '%' ) ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1949:1: ( (lv_op_1_1= '*' | lv_op_1_2= '/' |
							// lv_op_1_3= '%' ) )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1949:1: ( (lv_op_1_1= '*' | lv_op_1_2=
								// '/' | lv_op_1_3= '%' ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1950:1: (lv_op_1_1= '*' | lv_op_1_2= '/'
								// | lv_op_1_3= '%' )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1950:1: (lv_op_1_1= '*' | lv_op_1_2=
									// '/' | lv_op_1_3= '%' )
									int alt33 = 3;
									switch (input.LA(1)) {
									case 13: {
										alt33 = 1;
									}
										break;
									case 41: {
										alt33 = 2;
									}
										break;
									case 42: {
										alt33 = 3;
									}
										break;
									default:
										NoViableAltException nvae =
												new NoViableAltException("", 33, 0, input);

										throw nvae;
									}

									switch (alt33) {
									case 1:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1951:3: lv_op_1_1= '*'
									{
										lv_op_1_1 = (Token) match(input, 13, FOLLOW_13_in_ruleMultiplicativeExpression4151);

										newLeafNode(lv_op_1_1, grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_0());


										if (current == null) {
											current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
										}
										addWithLastConsumed(current, "op", lv_op_1_1, null);


									}
										break;
									case 2:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1963:8: lv_op_1_2= '/'
									{
										lv_op_1_2 = (Token) match(input, 41, FOLLOW_41_in_ruleMultiplicativeExpression4180);

										newLeafNode(lv_op_1_2, grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1());


										if (current == null) {
											current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
										}
										addWithLastConsumed(current, "op", lv_op_1_2, null);


									}
										break;
									case 3:
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1975:8: lv_op_1_3= '%'
									{
										lv_op_1_3 = (Token) match(input, 42, FOLLOW_42_in_ruleMultiplicativeExpression4209);

										newLeafNode(lv_op_1_3, grammarAccess.getMultiplicativeExpressionAccess().getOpPercentSignKeyword_1_0_0_2());


										if (current == null) {
											current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
										}
										addWithLastConsumed(current, "op", lv_op_1_3, null);


									}
										break;

									}


								}


							}

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1990:2: ( (lv_exp_2_0= ruleUnaryExpression )
							// )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1991:1: (lv_exp_2_0= ruleUnaryExpression )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1991:1: (lv_exp_2_0= ruleUnaryExpression
								// )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:1992:3: lv_exp_2_0= ruleUnaryExpression
								{

									newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExpUnaryExpressionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression4246);
									lv_exp_2_0 = ruleUnaryExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
									}
									add(
											current,
											"exp",
											lv_exp_2_0,
											"UnaryExpression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop34;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleMultiplicativeExpression"


	// $ANTLR start "entryRuleUnaryExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2016:1: entryRuleUnaryExpression returns [EObject current=null] :
	// iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
	public final EObject entryRuleUnaryExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleUnaryExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2017:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2018:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
			{
				newCompositeNode(grammarAccess.getUnaryExpressionRule());
				pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4284);
				iv_ruleUnaryExpression = ruleUnaryExpression();

				state._fsp--;

				current = iv_ruleUnaryExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleUnaryExpression4294);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleUnaryExpression"


	// $ANTLR start "ruleUnaryExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2025:1: ruleUnaryExpression returns [EObject current=null] : ( ( (
	// (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) ) ) ;
	public final EObject ruleUnaryExpression() throws RecognitionException {
		EObject current = null;

		Token lv_op_0_1 = null;
		Token lv_op_0_2 = null;
		Token lv_op_0_3 = null;
		Token lv_op_0_4 = null;
		Token lv_op_0_5 = null;
		EObject lv_exp_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2028:28: ( ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' |
			// lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2029:1: ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3=
			// '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2029:1: ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' |
				// lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2029:2: ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' |
				// lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2029:2: ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' |
					// lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )?
					int alt36 = 2;
					int LA36_0 = input.LA(1);

					if (((LA36_0 >= 39 && LA36_0 <= 40) || (LA36_0 >= 43 && LA36_0 <= 45))) {
						alt36 = 1;
					}
					switch (alt36) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2030:1: ( (lv_op_0_1= '!' | lv_op_0_2= '-' |
					// lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2030:1: ( (lv_op_0_1= '!' | lv_op_0_2= '-' |
						// lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2031:1: (lv_op_0_1= '!' | lv_op_0_2= '-' |
						// lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2031:1: (lv_op_0_1= '!' | lv_op_0_2= '-' |
							// lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' )
							int alt35 = 5;
							switch (input.LA(1)) {
							case 43: {
								alt35 = 1;
							}
								break;
							case 40: {
								alt35 = 2;
							}
								break;
							case 39: {
								alt35 = 3;
							}
								break;
							case 44: {
								alt35 = 4;
							}
								break;
							case 45: {
								alt35 = 5;
							}
								break;
							default:
								NoViableAltException nvae =
										new NoViableAltException("", 35, 0, input);

								throw nvae;
							}

							switch (alt35) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2032:3: lv_op_0_1= '!'
							{
								lv_op_0_1 = (Token) match(input, 43, FOLLOW_43_in_ruleUnaryExpression4339);

								newLeafNode(lv_op_0_1, grammarAccess.getUnaryExpressionAccess().getOpExclamationMarkKeyword_0_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getUnaryExpressionRule());
								}
								setWithLastConsumed(current, "op", lv_op_0_1, null);


							}
								break;
							case 2:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2044:8: lv_op_0_2= '-'
							{
								lv_op_0_2 = (Token) match(input, 40, FOLLOW_40_in_ruleUnaryExpression4368);

								newLeafNode(lv_op_0_2, grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0_1());


								if (current == null) {
									current = createModelElement(grammarAccess.getUnaryExpressionRule());
								}
								setWithLastConsumed(current, "op", lv_op_0_2, null);


							}
								break;
							case 3:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2056:8: lv_op_0_3= '+'
							{
								lv_op_0_3 = (Token) match(input, 39, FOLLOW_39_in_ruleUnaryExpression4397);

								newLeafNode(lv_op_0_3, grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_0_0_2());


								if (current == null) {
									current = createModelElement(grammarAccess.getUnaryExpressionRule());
								}
								setWithLastConsumed(current, "op", lv_op_0_3, null);


							}
								break;
							case 4:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2068:8: lv_op_0_4= '$'
							{
								lv_op_0_4 = (Token) match(input, 44, FOLLOW_44_in_ruleUnaryExpression4426);

								newLeafNode(lv_op_0_4, grammarAccess.getUnaryExpressionAccess().getOpDollarSignKeyword_0_0_3());


								if (current == null) {
									current = createModelElement(grammarAccess.getUnaryExpressionRule());
								}
								setWithLastConsumed(current, "op", lv_op_0_4, null);


							}
								break;
							case 5:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2080:8: lv_op_0_5= '~'
							{
								lv_op_0_5 = (Token) match(input, 45, FOLLOW_45_in_ruleUnaryExpression4455);

								newLeafNode(lv_op_0_5, grammarAccess.getUnaryExpressionAccess().getOpTildeKeyword_0_0_4());


								if (current == null) {
									current = createModelElement(grammarAccess.getUnaryExpressionRule());
								}
								setWithLastConsumed(current, "op", lv_op_0_5, null);


							}
								break;

							}


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2095:3: ( (lv_exp_1_0= rulePrimaryExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2096:1: (lv_exp_1_0= rulePrimaryExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2096:1: (lv_exp_1_0= rulePrimaryExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2097:3: lv_exp_1_0= rulePrimaryExpression
						{

							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpPrimaryExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression4493);
							lv_exp_1_0 = rulePrimaryExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
							}
							set(
									current,
									"exp",
									lv_exp_1_0,
									"PrimaryExpression");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleUnaryExpression"


	// $ANTLR start "entryRulePrimaryExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2121:1: entryRulePrimaryExpression returns [EObject current=null] :
	// iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
	public final EObject entryRulePrimaryExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePrimaryExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2122:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2123:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
			{
				newCompositeNode(grammarAccess.getPrimaryExpressionRule());
				pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4529);
				iv_rulePrimaryExpression = rulePrimaryExpression();

				state._fsp--;

				current = iv_rulePrimaryExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRulePrimaryExpression4539);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRulePrimaryExpression"


	// $ANTLR start "rulePrimaryExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2130:1: rulePrimaryExpression returns [EObject current=null] : (
	// (lv_prefix_0_0= ruleValueSpecification ) ) ;
	public final EObject rulePrimaryExpression() throws RecognitionException {
		EObject current = null;

		EObject lv_prefix_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2133:28: ( ( (lv_prefix_0_0= ruleValueSpecification ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2134:1: ( (lv_prefix_0_0= ruleValueSpecification ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2134:1: ( (lv_prefix_0_0= ruleValueSpecification ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2135:1: (lv_prefix_0_0= ruleValueSpecification )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2135:1: (lv_prefix_0_0= ruleValueSpecification )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2136:3: lv_prefix_0_0= ruleValueSpecification
					{

						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrefixValueSpecificationParserRuleCall_0());

						pushFollow(FOLLOW_ruleValueSpecification_in_rulePrimaryExpression4584);
						lv_prefix_0_0 = ruleValueSpecification();

						state._fsp--;


						if (current == null) {
							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
						}
						set(
								current,
								"prefix",
								lv_prefix_0_0,
								"ValueSpecification");
						afterParserOrEnumRuleCall();


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "rulePrimaryExpression"


	// $ANTLR start "entryRuleSuffixExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2160:1: entryRuleSuffixExpression returns [EObject current=null] :
	// iv_ruleSuffixExpression= ruleSuffixExpression EOF ;
	public final EObject entryRuleSuffixExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSuffixExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2161:2: (iv_ruleSuffixExpression= ruleSuffixExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2162:2: iv_ruleSuffixExpression= ruleSuffixExpression EOF
			{
				newCompositeNode(grammarAccess.getSuffixExpressionRule());
				pushFollow(FOLLOW_ruleSuffixExpression_in_entryRuleSuffixExpression4619);
				iv_ruleSuffixExpression = ruleSuffixExpression();

				state._fsp--;

				current = iv_ruleSuffixExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSuffixExpression4629);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSuffixExpression"


	// $ANTLR start "ruleSuffixExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2169:1: ruleSuffixExpression returns [EObject current=null] :
	// (this_OperationCallExpression_0= ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression
	// | this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression ) ;
	public final EObject ruleSuffixExpression() throws RecognitionException {
		EObject current = null;

		EObject this_OperationCallExpression_0 = null;

		EObject this_PropertyCallExpression_1 = null;

		EObject this_LinkOperationExpression_2 = null;

		EObject this_SequenceOperationExpression_3 = null;

		EObject this_SequenceReductionExpression_4 = null;

		EObject this_SequenceExpansionExpression_5 = null;

		EObject this_ClassExtentExpression_6 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2172:28: ( (this_OperationCallExpression_0=
			// ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression |
			// this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2173:1: (this_OperationCallExpression_0=
			// ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression |
			// this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2173:1: (this_OperationCallExpression_0=
				// ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression |
				// this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression )
				int alt37 = 7;
				alt37 = dfa37.predict(input);
				switch (alt37) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2174:5: this_OperationCallExpression_0=
				// ruleOperationCallExpression
				{

					newCompositeNode(grammarAccess.getSuffixExpressionAccess().getOperationCallExpressionParserRuleCall_0());

					pushFollow(FOLLOW_ruleOperationCallExpression_in_ruleSuffixExpression4676);
					this_OperationCallExpression_0 = ruleOperationCallExpression();

					state._fsp--;


					current = this_OperationCallExpression_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2184:5: this_PropertyCallExpression_1=
				// rulePropertyCallExpression
				{

					newCompositeNode(grammarAccess.getSuffixExpressionAccess().getPropertyCallExpressionParserRuleCall_1());

					pushFollow(FOLLOW_rulePropertyCallExpression_in_ruleSuffixExpression4703);
					this_PropertyCallExpression_1 = rulePropertyCallExpression();

					state._fsp--;


					current = this_PropertyCallExpression_1;
					afterParserOrEnumRuleCall();


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2194:5: this_LinkOperationExpression_2=
				// ruleLinkOperationExpression
				{

					newCompositeNode(grammarAccess.getSuffixExpressionAccess().getLinkOperationExpressionParserRuleCall_2());

					pushFollow(FOLLOW_ruleLinkOperationExpression_in_ruleSuffixExpression4730);
					this_LinkOperationExpression_2 = ruleLinkOperationExpression();

					state._fsp--;


					current = this_LinkOperationExpression_2;
					afterParserOrEnumRuleCall();


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2204:5: this_SequenceOperationExpression_3=
				// ruleSequenceOperationExpression
				{

					newCompositeNode(grammarAccess.getSuffixExpressionAccess().getSequenceOperationExpressionParserRuleCall_3());

					pushFollow(FOLLOW_ruleSequenceOperationExpression_in_ruleSuffixExpression4757);
					this_SequenceOperationExpression_3 = ruleSequenceOperationExpression();

					state._fsp--;


					current = this_SequenceOperationExpression_3;
					afterParserOrEnumRuleCall();


				}
					break;
				case 5:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2214:5: this_SequenceReductionExpression_4=
				// ruleSequenceReductionExpression
				{

					newCompositeNode(grammarAccess.getSuffixExpressionAccess().getSequenceReductionExpressionParserRuleCall_4());

					pushFollow(FOLLOW_ruleSequenceReductionExpression_in_ruleSuffixExpression4784);
					this_SequenceReductionExpression_4 = ruleSequenceReductionExpression();

					state._fsp--;


					current = this_SequenceReductionExpression_4;
					afterParserOrEnumRuleCall();


				}
					break;
				case 6:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2224:5: this_SequenceExpansionExpression_5=
				// ruleSequenceExpansionExpression
				{

					newCompositeNode(grammarAccess.getSuffixExpressionAccess().getSequenceExpansionExpressionParserRuleCall_5());

					pushFollow(FOLLOW_ruleSequenceExpansionExpression_in_ruleSuffixExpression4811);
					this_SequenceExpansionExpression_5 = ruleSequenceExpansionExpression();

					state._fsp--;


					current = this_SequenceExpansionExpression_5;
					afterParserOrEnumRuleCall();


				}
					break;
				case 7:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2234:5: this_ClassExtentExpression_6=
				// ruleClassExtentExpression
				{

					newCompositeNode(grammarAccess.getSuffixExpressionAccess().getClassExtentExpressionParserRuleCall_6());

					pushFollow(FOLLOW_ruleClassExtentExpression_in_ruleSuffixExpression4838);
					this_ClassExtentExpression_6 = ruleClassExtentExpression();

					state._fsp--;


					current = this_ClassExtentExpression_6;
					afterParserOrEnumRuleCall();


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSuffixExpression"


	// $ANTLR start "entryRuleOperationCallExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2250:1: entryRuleOperationCallExpression returns [EObject
	// current=null] : iv_ruleOperationCallExpression= ruleOperationCallExpression EOF ;
	public final EObject entryRuleOperationCallExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleOperationCallExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2251:2: (iv_ruleOperationCallExpression=
			// ruleOperationCallExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2252:2: iv_ruleOperationCallExpression=
			// ruleOperationCallExpression EOF
			{
				newCompositeNode(grammarAccess.getOperationCallExpressionRule());
				pushFollow(FOLLOW_ruleOperationCallExpression_in_entryRuleOperationCallExpression4873);
				iv_ruleOperationCallExpression = ruleOperationCallExpression();

				state._fsp--;

				current = iv_ruleOperationCallExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleOperationCallExpression4883);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleOperationCallExpression"


	// $ANTLR start "ruleOperationCallExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2259:1: ruleOperationCallExpression returns [EObject current=null] :
	// (otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleOperationCallExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_operationName_1_0 = null;
		EObject lv_tuple_2_0 = null;

		EObject lv_suffix_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2262:28: ( (otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID
			// ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2263:1: (otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID ) )
			// ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2263:1: (otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID
				// ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2263:3: otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID
				// ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 46, FOLLOW_46_in_ruleOperationCallExpression4920);

					newLeafNode(otherlv_0, grammarAccess.getOperationCallExpressionAccess().getFullStopKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2267:1: ( (lv_operationName_1_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2268:1: (lv_operationName_1_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2268:1: (lv_operationName_1_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2269:3: lv_operationName_1_0= RULE_ID
						{
							lv_operationName_1_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleOperationCallExpression4937);

							newLeafNode(lv_operationName_1_0, grammarAccess.getOperationCallExpressionAccess().getOperationNameIDTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getOperationCallExpressionRule());
							}
							setWithLastConsumed(
									current,
									"operationName",
									lv_operationName_1_0,
									"ID");


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2285:2: ( (lv_tuple_2_0= ruleTuple ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2286:1: (lv_tuple_2_0= ruleTuple )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2286:1: (lv_tuple_2_0= ruleTuple )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2287:3: lv_tuple_2_0= ruleTuple
						{

							newCompositeNode(grammarAccess.getOperationCallExpressionAccess().getTupleTupleParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleTuple_in_ruleOperationCallExpression4963);
							lv_tuple_2_0 = ruleTuple();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getOperationCallExpressionRule());
							}
							set(
									current,
									"tuple",
									lv_tuple_2_0,
									"Tuple");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2303:2: ( (lv_suffix_3_0= ruleSuffixExpression ) )?
					int alt38 = 2;
					int LA38_0 = input.LA(1);

					if ((LA38_0 == 46 || LA38_0 == 49)) {
						alt38 = 1;
					}
					switch (alt38) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2304:1: (lv_suffix_3_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2304:1: (lv_suffix_3_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2305:3: lv_suffix_3_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getOperationCallExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleOperationCallExpression4984);
							lv_suffix_3_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getOperationCallExpressionRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_3_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleOperationCallExpression"


	// $ANTLR start "entryRulePropertyCallExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2329:1: entryRulePropertyCallExpression returns [EObject
	// current=null] : iv_rulePropertyCallExpression= rulePropertyCallExpression EOF ;
	public final EObject entryRulePropertyCallExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePropertyCallExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2330:2: (iv_rulePropertyCallExpression=
			// rulePropertyCallExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2331:2: iv_rulePropertyCallExpression=
			// rulePropertyCallExpression EOF
			{
				newCompositeNode(grammarAccess.getPropertyCallExpressionRule());
				pushFollow(FOLLOW_rulePropertyCallExpression_in_entryRulePropertyCallExpression5021);
				iv_rulePropertyCallExpression = rulePropertyCallExpression();

				state._fsp--;

				current = iv_rulePropertyCallExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRulePropertyCallExpression5031);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRulePropertyCallExpression"


	// $ANTLR start "rulePropertyCallExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2338:1: rulePropertyCallExpression returns [EObject current=null] :
	// (otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )? ) ;
	public final EObject rulePropertyCallExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_propertyName_1_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_index_3_0 = null;

		EObject lv_suffix_5_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2341:28: ( (otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID )
			// ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2342:1: (otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID ) )
			// (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2342:1: (otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID
				// ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2342:3: otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID )
				// ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 46, FOLLOW_46_in_rulePropertyCallExpression5068);

					newLeafNode(otherlv_0, grammarAccess.getPropertyCallExpressionAccess().getFullStopKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2346:1: ( (lv_propertyName_1_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2347:1: (lv_propertyName_1_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2347:1: (lv_propertyName_1_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2348:3: lv_propertyName_1_0= RULE_ID
						{
							lv_propertyName_1_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_rulePropertyCallExpression5085);

							newLeafNode(lv_propertyName_1_0, grammarAccess.getPropertyCallExpressionAccess().getPropertyNameIDTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getPropertyCallExpressionRule());
							}
							setWithLastConsumed(
									current,
									"propertyName",
									lv_propertyName_1_0,
									"ID");


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2364:2: (otherlv_2= '[' ( (lv_index_3_0=
					// ruleExpression ) ) otherlv_4= ']' )?
					int alt39 = 2;
					int LA39_0 = input.LA(1);

					if ((LA39_0 == 47)) {
						int LA39_1 = input.LA(2);

						if (((LA39_1 >= RULE_INTEGER_VALUE && LA39_1 <= RULE_ID) || (LA39_1 >= 13 && LA39_1 <= 15) || LA39_1 == 21 || (LA39_1 >= 39 && LA39_1 <= 40) || (LA39_1 >= 43 && LA39_1 <= 45) || (LA39_1 >= 53 && LA39_1 <= 56) || (LA39_1 >= 83 && LA39_1 <= 84))) {
							alt39 = 1;
						}
					}
					switch (alt39) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2364:4: otherlv_2= '[' ( (lv_index_3_0=
					// ruleExpression ) ) otherlv_4= ']'
					{
						otherlv_2 = (Token) match(input, 47, FOLLOW_47_in_rulePropertyCallExpression5103);

						newLeafNode(otherlv_2, grammarAccess.getPropertyCallExpressionAccess().getLeftSquareBracketKeyword_2_0());

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2368:1: ( (lv_index_3_0= ruleExpression ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2369:1: (lv_index_3_0= ruleExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2369:1: (lv_index_3_0= ruleExpression )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2370:3: lv_index_3_0= ruleExpression
							{

								newCompositeNode(grammarAccess.getPropertyCallExpressionAccess().getIndexExpressionParserRuleCall_2_1_0());

								pushFollow(FOLLOW_ruleExpression_in_rulePropertyCallExpression5124);
								lv_index_3_0 = ruleExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getPropertyCallExpressionRule());
								}
								set(
										current,
										"index",
										lv_index_3_0,
										"Expression");
								afterParserOrEnumRuleCall();


							}


						}

						otherlv_4 = (Token) match(input, 48, FOLLOW_48_in_rulePropertyCallExpression5136);

						newLeafNode(otherlv_4, grammarAccess.getPropertyCallExpressionAccess().getRightSquareBracketKeyword_2_2());


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2390:3: ( (lv_suffix_5_0= ruleSuffixExpression ) )?
					int alt40 = 2;
					int LA40_0 = input.LA(1);

					if ((LA40_0 == 46 || LA40_0 == 49)) {
						alt40 = 1;
					}
					switch (alt40) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2391:1: (lv_suffix_5_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2391:1: (lv_suffix_5_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2392:3: lv_suffix_5_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getPropertyCallExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_rulePropertyCallExpression5159);
							lv_suffix_5_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPropertyCallExpressionRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_5_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "rulePropertyCallExpression"


	// $ANTLR start "entryRuleLinkOperationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2416:1: entryRuleLinkOperationExpression returns [EObject
	// current=null] : iv_ruleLinkOperationExpression= ruleLinkOperationExpression EOF ;
	public final EObject entryRuleLinkOperationExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLinkOperationExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2417:2: (iv_ruleLinkOperationExpression=
			// ruleLinkOperationExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2418:2: iv_ruleLinkOperationExpression=
			// ruleLinkOperationExpression EOF
			{
				newCompositeNode(grammarAccess.getLinkOperationExpressionRule());
				pushFollow(FOLLOW_ruleLinkOperationExpression_in_entryRuleLinkOperationExpression5196);
				iv_ruleLinkOperationExpression = ruleLinkOperationExpression();

				state._fsp--;

				current = iv_ruleLinkOperationExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleLinkOperationExpression5206);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleLinkOperationExpression"


	// $ANTLR start "ruleLinkOperationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2425:1: ruleLinkOperationExpression returns [EObject current=null] :
	// (otherlv_0= '.' ( (lv_kind_1_0= ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) ) ) ;
	public final EObject ruleLinkOperationExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Enumerator lv_kind_1_0 = null;

		EObject lv_tuple_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2428:28: ( (otherlv_0= '.' ( (lv_kind_1_0=
			// ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2429:1: (otherlv_0= '.' ( (lv_kind_1_0=
			// ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2429:1: (otherlv_0= '.' ( (lv_kind_1_0=
				// ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2429:3: otherlv_0= '.' ( (lv_kind_1_0=
				// ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) )
				{
					otherlv_0 = (Token) match(input, 46, FOLLOW_46_in_ruleLinkOperationExpression5243);

					newLeafNode(otherlv_0, grammarAccess.getLinkOperationExpressionAccess().getFullStopKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2433:1: ( (lv_kind_1_0= ruleLinkOperationKind ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2434:1: (lv_kind_1_0= ruleLinkOperationKind )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2434:1: (lv_kind_1_0= ruleLinkOperationKind )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2435:3: lv_kind_1_0= ruleLinkOperationKind
						{

							newCompositeNode(grammarAccess.getLinkOperationExpressionAccess().getKindLinkOperationKindEnumRuleCall_1_0());

							pushFollow(FOLLOW_ruleLinkOperationKind_in_ruleLinkOperationExpression5264);
							lv_kind_1_0 = ruleLinkOperationKind();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getLinkOperationExpressionRule());
							}
							set(
									current,
									"kind",
									lv_kind_1_0,
									"LinkOperationKind");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2451:2: ( (lv_tuple_2_0= ruleLinkOperationTuple ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2452:1: (lv_tuple_2_0= ruleLinkOperationTuple )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2452:1: (lv_tuple_2_0= ruleLinkOperationTuple )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2453:3: lv_tuple_2_0= ruleLinkOperationTuple
						{

							newCompositeNode(grammarAccess.getLinkOperationExpressionAccess().getTupleLinkOperationTupleParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleLinkOperationTuple_in_ruleLinkOperationExpression5285);
							lv_tuple_2_0 = ruleLinkOperationTuple();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getLinkOperationExpressionRule());
							}
							set(
									current,
									"tuple",
									lv_tuple_2_0,
									"LinkOperationTuple");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleLinkOperationExpression"


	// $ANTLR start "entryRuleLinkOperationTuple"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2477:1: entryRuleLinkOperationTuple returns [EObject current=null] :
	// iv_ruleLinkOperationTuple= ruleLinkOperationTuple EOF ;
	public final EObject entryRuleLinkOperationTuple() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLinkOperationTuple = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2478:2: (iv_ruleLinkOperationTuple= ruleLinkOperationTuple
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2479:2: iv_ruleLinkOperationTuple= ruleLinkOperationTuple
			// EOF
			{
				newCompositeNode(grammarAccess.getLinkOperationTupleRule());
				pushFollow(FOLLOW_ruleLinkOperationTuple_in_entryRuleLinkOperationTuple5321);
				iv_ruleLinkOperationTuple = ruleLinkOperationTuple();

				state._fsp--;

				current = iv_ruleLinkOperationTuple;
				match(input, EOF, FOLLOW_EOF_in_entryRuleLinkOperationTuple5331);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleLinkOperationTuple"


	// $ANTLR start "ruleLinkOperationTuple"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2486:1: ruleLinkOperationTuple returns [EObject current=null] :
	// (otherlv_0= '(' ( (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')' ) ;
	public final EObject ruleLinkOperationTuple() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_linkOperationTupleElement_1_0 = null;

		EObject lv_linkOperationTupleElement_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2489:28: ( (otherlv_0= '(' (
			// (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2490:1: (otherlv_0= '(' ( (lv_linkOperationTupleElement_1_0=
			// ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2490:1: (otherlv_0= '(' (
				// (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2490:3: otherlv_0= '(' (
				// (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')'
				{
					otherlv_0 = (Token) match(input, 21, FOLLOW_21_in_ruleLinkOperationTuple5368);

					newLeafNode(otherlv_0, grammarAccess.getLinkOperationTupleAccess().getLeftParenthesisKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2494:1: ( (lv_linkOperationTupleElement_1_0=
					// ruleLinkOperationTupleElement ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2495:1: (lv_linkOperationTupleElement_1_0=
					// ruleLinkOperationTupleElement )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2495:1: (lv_linkOperationTupleElement_1_0=
						// ruleLinkOperationTupleElement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2496:3: lv_linkOperationTupleElement_1_0=
						// ruleLinkOperationTupleElement
						{

							newCompositeNode(grammarAccess.getLinkOperationTupleAccess().getLinkOperationTupleElementLinkOperationTupleElementParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleLinkOperationTupleElement_in_ruleLinkOperationTuple5389);
							lv_linkOperationTupleElement_1_0 = ruleLinkOperationTupleElement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getLinkOperationTupleRule());
							}
							add(
									current,
									"linkOperationTupleElement",
									lv_linkOperationTupleElement_1_0,
									"LinkOperationTupleElement");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2512:2: (otherlv_2= ',' (
					// (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )*
					loop41: do {
						int alt41 = 2;
						int LA41_0 = input.LA(1);

						if ((LA41_0 == 18)) {
							alt41 = 1;
						}


						switch (alt41) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2512:4: otherlv_2= ',' (
						// (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) )
						{
							otherlv_2 = (Token) match(input, 18, FOLLOW_18_in_ruleLinkOperationTuple5402);

							newLeafNode(otherlv_2, grammarAccess.getLinkOperationTupleAccess().getCommaKeyword_2_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2516:1: ( (lv_linkOperationTupleElement_3_0=
							// ruleLinkOperationTupleElement ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2517:1: (lv_linkOperationTupleElement_3_0=
							// ruleLinkOperationTupleElement )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2517:1:
								// (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2518:3:
								// lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement
								{

									newCompositeNode(grammarAccess.getLinkOperationTupleAccess().getLinkOperationTupleElementLinkOperationTupleElementParserRuleCall_2_1_0());

									pushFollow(FOLLOW_ruleLinkOperationTupleElement_in_ruleLinkOperationTuple5423);
									lv_linkOperationTupleElement_3_0 = ruleLinkOperationTupleElement();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getLinkOperationTupleRule());
									}
									add(
											current,
											"linkOperationTupleElement",
											lv_linkOperationTupleElement_3_0,
											"LinkOperationTupleElement");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop41;
						}
					} while (true);

					otherlv_4 = (Token) match(input, 22, FOLLOW_22_in_ruleLinkOperationTuple5437);

					newLeafNode(otherlv_4, grammarAccess.getLinkOperationTupleAccess().getRightParenthesisKeyword_3());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleLinkOperationTuple"


	// $ANTLR start "entryRuleLinkOperationTupleElement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2546:1: entryRuleLinkOperationTupleElement returns [EObject
	// current=null] : iv_ruleLinkOperationTupleElement= ruleLinkOperationTupleElement EOF ;
	public final EObject entryRuleLinkOperationTupleElement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLinkOperationTupleElement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2547:2: (iv_ruleLinkOperationTupleElement=
			// ruleLinkOperationTupleElement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2548:2: iv_ruleLinkOperationTupleElement=
			// ruleLinkOperationTupleElement EOF
			{
				newCompositeNode(grammarAccess.getLinkOperationTupleElementRule());
				pushFollow(FOLLOW_ruleLinkOperationTupleElement_in_entryRuleLinkOperationTupleElement5473);
				iv_ruleLinkOperationTupleElement = ruleLinkOperationTupleElement();

				state._fsp--;

				current = iv_ruleLinkOperationTupleElement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleLinkOperationTupleElement5483);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleLinkOperationTupleElement"


	// $ANTLR start "ruleLinkOperationTupleElement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2555:1: ruleLinkOperationTupleElement returns [EObject current=null]
	// : ( ( (lv_role_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= ruleExpression ) ) ) ;
	public final EObject ruleLinkOperationTupleElement() throws RecognitionException {
		EObject current = null;

		Token lv_role_0_0 = null;
		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		EObject lv_roleIndex_2_0 = null;

		EObject lv_object_5_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2558:28: ( ( ( (lv_role_0_0= RULE_ID ) ) (otherlv_1= '[' (
			// (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= ruleExpression ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2559:1: ( ( (lv_role_0_0= RULE_ID ) ) (otherlv_1= '[' (
			// (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= ruleExpression ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2559:1: ( ( (lv_role_0_0= RULE_ID ) ) (otherlv_1= '[' (
				// (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= ruleExpression ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2559:2: ( (lv_role_0_0= RULE_ID ) ) (otherlv_1= '[' (
				// (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= ruleExpression ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2559:2: ( (lv_role_0_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2560:1: (lv_role_0_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2560:1: (lv_role_0_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2561:3: lv_role_0_0= RULE_ID
						{
							lv_role_0_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleLinkOperationTupleElement5525);

							newLeafNode(lv_role_0_0, grammarAccess.getLinkOperationTupleElementAccess().getRoleIDTerminalRuleCall_0_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getLinkOperationTupleElementRule());
							}
							setWithLastConsumed(
									current,
									"role",
									lv_role_0_0,
									"ID");


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2577:2: (otherlv_1= '[' ( (lv_roleIndex_2_0=
					// ruleExpression ) ) otherlv_3= ']' )?
					int alt42 = 2;
					int LA42_0 = input.LA(1);

					if ((LA42_0 == 47)) {
						alt42 = 1;
					}
					switch (alt42) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2577:4: otherlv_1= '[' ( (lv_roleIndex_2_0=
					// ruleExpression ) ) otherlv_3= ']'
					{
						otherlv_1 = (Token) match(input, 47, FOLLOW_47_in_ruleLinkOperationTupleElement5543);

						newLeafNode(otherlv_1, grammarAccess.getLinkOperationTupleElementAccess().getLeftSquareBracketKeyword_1_0());

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2581:1: ( (lv_roleIndex_2_0= ruleExpression ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2582:1: (lv_roleIndex_2_0= ruleExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2582:1: (lv_roleIndex_2_0= ruleExpression )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2583:3: lv_roleIndex_2_0= ruleExpression
							{

								newCompositeNode(grammarAccess.getLinkOperationTupleElementAccess().getRoleIndexExpressionParserRuleCall_1_1_0());

								pushFollow(FOLLOW_ruleExpression_in_ruleLinkOperationTupleElement5564);
								lv_roleIndex_2_0 = ruleExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLinkOperationTupleElementRule());
								}
								set(
										current,
										"roleIndex",
										lv_roleIndex_2_0,
										"Expression");
								afterParserOrEnumRuleCall();


							}


						}

						otherlv_3 = (Token) match(input, 48, FOLLOW_48_in_ruleLinkOperationTupleElement5576);

						newLeafNode(otherlv_3, grammarAccess.getLinkOperationTupleElementAccess().getRightSquareBracketKeyword_1_2());


					}
						break;

					}

					otherlv_4 = (Token) match(input, 20, FOLLOW_20_in_ruleLinkOperationTupleElement5590);

					newLeafNode(otherlv_4, grammarAccess.getLinkOperationTupleElementAccess().getEqualsSignGreaterThanSignKeyword_2());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2607:1: ( (lv_object_5_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2608:1: (lv_object_5_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2608:1: (lv_object_5_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2609:3: lv_object_5_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getLinkOperationTupleElementAccess().getObjectExpressionParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleLinkOperationTupleElement5611);
							lv_object_5_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getLinkOperationTupleElementRule());
							}
							set(
									current,
									"object",
									lv_object_5_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleLinkOperationTupleElement"


	// $ANTLR start "entryRuleSequenceOperationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2633:1: entryRuleSequenceOperationExpression returns [EObject
	// current=null] : iv_ruleSequenceOperationExpression= ruleSequenceOperationExpression EOF ;
	public final EObject entryRuleSequenceOperationExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSequenceOperationExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2634:2: (iv_ruleSequenceOperationExpression=
			// ruleSequenceOperationExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2635:2: iv_ruleSequenceOperationExpression=
			// ruleSequenceOperationExpression EOF
			{
				newCompositeNode(grammarAccess.getSequenceOperationExpressionRule());
				pushFollow(FOLLOW_ruleSequenceOperationExpression_in_entryRuleSequenceOperationExpression5647);
				iv_ruleSequenceOperationExpression = ruleSequenceOperationExpression();

				state._fsp--;

				current = iv_ruleSequenceOperationExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSequenceOperationExpression5657);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSequenceOperationExpression"


	// $ANTLR start "ruleSequenceOperationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2642:1: ruleSequenceOperationExpression returns [EObject
	// current=null] : (otherlv_0= '->' ( (lv_operationName_1_0= ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleSequenceOperationExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_operationName_1_0 = null;

		EObject lv_tuple_2_0 = null;

		EObject lv_suffix_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2645:28: ( (otherlv_0= '->' ( (lv_operationName_1_0=
			// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2646:1: (otherlv_0= '->' ( (lv_operationName_1_0=
			// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2646:1: (otherlv_0= '->' ( (lv_operationName_1_0=
				// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2646:3: otherlv_0= '->' ( (lv_operationName_1_0=
				// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 49, FOLLOW_49_in_ruleSequenceOperationExpression5694);

					newLeafNode(otherlv_0, grammarAccess.getSequenceOperationExpressionAccess().getHyphenMinusGreaterThanSignKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2650:1: ( (lv_operationName_1_0=
					// ruleQualifiedNameWithBinding ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2651:1: (lv_operationName_1_0=
					// ruleQualifiedNameWithBinding )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2651:1: (lv_operationName_1_0=
						// ruleQualifiedNameWithBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2652:3: lv_operationName_1_0=
						// ruleQualifiedNameWithBinding
						{

							newCompositeNode(grammarAccess.getSequenceOperationExpressionAccess().getOperationNameQualifiedNameWithBindingParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleSequenceOperationExpression5715);
							lv_operationName_1_0 = ruleQualifiedNameWithBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSequenceOperationExpressionRule());
							}
							set(
									current,
									"operationName",
									lv_operationName_1_0,
									"QualifiedNameWithBinding");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2668:2: ( (lv_tuple_2_0= ruleTuple ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2669:1: (lv_tuple_2_0= ruleTuple )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2669:1: (lv_tuple_2_0= ruleTuple )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2670:3: lv_tuple_2_0= ruleTuple
						{

							newCompositeNode(grammarAccess.getSequenceOperationExpressionAccess().getTupleTupleParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleTuple_in_ruleSequenceOperationExpression5736);
							lv_tuple_2_0 = ruleTuple();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSequenceOperationExpressionRule());
							}
							set(
									current,
									"tuple",
									lv_tuple_2_0,
									"Tuple");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2686:2: ( (lv_suffix_3_0= ruleSuffixExpression ) )?
					int alt43 = 2;
					int LA43_0 = input.LA(1);

					if ((LA43_0 == 46 || LA43_0 == 49)) {
						alt43 = 1;
					}
					switch (alt43) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2687:1: (lv_suffix_3_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2687:1: (lv_suffix_3_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2688:3: lv_suffix_3_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getSequenceOperationExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleSequenceOperationExpression5757);
							lv_suffix_3_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSequenceOperationExpressionRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_3_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSequenceOperationExpression"


	// $ANTLR start "entryRuleSequenceReductionExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2712:1: entryRuleSequenceReductionExpression returns [EObject
	// current=null] : iv_ruleSequenceReductionExpression= ruleSequenceReductionExpression EOF ;
	public final EObject entryRuleSequenceReductionExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSequenceReductionExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2713:2: (iv_ruleSequenceReductionExpression=
			// ruleSequenceReductionExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2714:2: iv_ruleSequenceReductionExpression=
			// ruleSequenceReductionExpression EOF
			{
				newCompositeNode(grammarAccess.getSequenceReductionExpressionRule());
				pushFollow(FOLLOW_ruleSequenceReductionExpression_in_entryRuleSequenceReductionExpression5794);
				iv_ruleSequenceReductionExpression = ruleSequenceReductionExpression();

				state._fsp--;

				current = iv_ruleSequenceReductionExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSequenceReductionExpression5804);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSequenceReductionExpression"


	// $ANTLR start "ruleSequenceReductionExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2721:1: ruleSequenceReductionExpression returns [EObject
	// current=null] : (otherlv_0= '->' otherlv_1= 'reduce' ( (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleSequenceReductionExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token lv_isOrdered_2_0 = null;
		EObject lv_behavior_3_0 = null;

		EObject lv_suffix_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2724:28: ( (otherlv_0= '->' otherlv_1= 'reduce' (
			// (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2725:1: (otherlv_0= '->' otherlv_1= 'reduce' (
			// (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2725:1: (otherlv_0= '->' otherlv_1= 'reduce' (
				// (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2725:3: otherlv_0= '->' otherlv_1= 'reduce' (
				// (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 49, FOLLOW_49_in_ruleSequenceReductionExpression5841);

					newLeafNode(otherlv_0, grammarAccess.getSequenceReductionExpressionAccess().getHyphenMinusGreaterThanSignKeyword_0());

					otherlv_1 = (Token) match(input, 50, FOLLOW_50_in_ruleSequenceReductionExpression5853);

					newLeafNode(otherlv_1, grammarAccess.getSequenceReductionExpressionAccess().getReduceKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2733:1: ( (lv_isOrdered_2_0= 'ordered' ) )?
					int alt44 = 2;
					int LA44_0 = input.LA(1);

					if ((LA44_0 == 51)) {
						alt44 = 1;
					}
					switch (alt44) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2734:1: (lv_isOrdered_2_0= 'ordered' )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2734:1: (lv_isOrdered_2_0= 'ordered' )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2735:3: lv_isOrdered_2_0= 'ordered'
						{
							lv_isOrdered_2_0 = (Token) match(input, 51, FOLLOW_51_in_ruleSequenceReductionExpression5871);

							newLeafNode(lv_isOrdered_2_0, grammarAccess.getSequenceReductionExpressionAccess().getIsOrderedOrderedKeyword_2_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getSequenceReductionExpressionRule());
							}
							setWithLastConsumed(current, "isOrdered", true, "ordered");


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2748:3: ( (lv_behavior_3_0=
					// ruleQualifiedNameWithBinding ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2749:1: (lv_behavior_3_0=
					// ruleQualifiedNameWithBinding )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2749:1: (lv_behavior_3_0=
						// ruleQualifiedNameWithBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2750:3: lv_behavior_3_0=
						// ruleQualifiedNameWithBinding
						{

							newCompositeNode(grammarAccess.getSequenceReductionExpressionAccess().getBehaviorQualifiedNameWithBindingParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleSequenceReductionExpression5906);
							lv_behavior_3_0 = ruleQualifiedNameWithBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSequenceReductionExpressionRule());
							}
							set(
									current,
									"behavior",
									lv_behavior_3_0,
									"QualifiedNameWithBinding");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2766:2: ( (lv_suffix_4_0= ruleSuffixExpression ) )?
					int alt45 = 2;
					int LA45_0 = input.LA(1);

					if ((LA45_0 == 46 || LA45_0 == 49)) {
						alt45 = 1;
					}
					switch (alt45) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2767:1: (lv_suffix_4_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2767:1: (lv_suffix_4_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2768:3: lv_suffix_4_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getSequenceReductionExpressionAccess().getSuffixSuffixExpressionParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleSequenceReductionExpression5927);
							lv_suffix_4_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSequenceReductionExpressionRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_4_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSequenceReductionExpression"


	// $ANTLR start "entryRuleSequenceExpansionExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2792:1: entryRuleSequenceExpansionExpression returns [EObject
	// current=null] : iv_ruleSequenceExpansionExpression= ruleSequenceExpansionExpression EOF ;
	public final EObject entryRuleSequenceExpansionExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSequenceExpansionExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2793:2: (iv_ruleSequenceExpansionExpression=
			// ruleSequenceExpansionExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2794:2: iv_ruleSequenceExpansionExpression=
			// ruleSequenceExpansionExpression EOF
			{
				newCompositeNode(grammarAccess.getSequenceExpansionExpressionRule());
				pushFollow(FOLLOW_ruleSequenceExpansionExpression_in_entryRuleSequenceExpansionExpression5964);
				iv_ruleSequenceExpansionExpression = ruleSequenceExpansionExpression();

				state._fsp--;

				current = iv_ruleSequenceExpansionExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSequenceExpansionExpression5974);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSequenceExpansionExpression"


	// $ANTLR start "ruleSequenceExpansionExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2801:1: ruleSequenceExpansionExpression returns [EObject
	// current=null] : (this_SelectOrRejectOperation_0= ruleSelectOrRejectOperation | this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation | this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation | this_IsUniqueOperation_3=
	// ruleIsUniqueOperation ) ;
	public final EObject ruleSequenceExpansionExpression() throws RecognitionException {
		EObject current = null;

		EObject this_SelectOrRejectOperation_0 = null;

		EObject this_CollectOrIterateOperation_1 = null;

		EObject this_ForAllOrExistsOrOneOperation_2 = null;

		EObject this_IsUniqueOperation_3 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2804:28: ( (this_SelectOrRejectOperation_0=
			// ruleSelectOrRejectOperation | this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation | this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation | this_IsUniqueOperation_3= ruleIsUniqueOperation ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2805:1: (this_SelectOrRejectOperation_0=
			// ruleSelectOrRejectOperation | this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation | this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation | this_IsUniqueOperation_3= ruleIsUniqueOperation )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2805:1: (this_SelectOrRejectOperation_0=
				// ruleSelectOrRejectOperation | this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation | this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation | this_IsUniqueOperation_3= ruleIsUniqueOperation )
				int alt46 = 4;
				int LA46_0 = input.LA(1);

				if ((LA46_0 == 49)) {
					switch (input.LA(2)) {
					case 88:
					case 89: {
						alt46 = 1;
					}
						break;
					case 90:
					case 91: {
						alt46 = 2;
					}
						break;
					case 52: {
						alt46 = 4;
					}
						break;
					case 92:
					case 93:
					case 94: {
						alt46 = 3;
					}
						break;
					default:
						NoViableAltException nvae =
								new NoViableAltException("", 46, 1, input);

						throw nvae;
					}

				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);

					throw nvae;
				}
				switch (alt46) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2806:5: this_SelectOrRejectOperation_0=
				// ruleSelectOrRejectOperation
				{

					newCompositeNode(grammarAccess.getSequenceExpansionExpressionAccess().getSelectOrRejectOperationParserRuleCall_0());

					pushFollow(FOLLOW_ruleSelectOrRejectOperation_in_ruleSequenceExpansionExpression6021);
					this_SelectOrRejectOperation_0 = ruleSelectOrRejectOperation();

					state._fsp--;


					current = this_SelectOrRejectOperation_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2816:5: this_CollectOrIterateOperation_1=
				// ruleCollectOrIterateOperation
				{

					newCompositeNode(grammarAccess.getSequenceExpansionExpressionAccess().getCollectOrIterateOperationParserRuleCall_1());

					pushFollow(FOLLOW_ruleCollectOrIterateOperation_in_ruleSequenceExpansionExpression6048);
					this_CollectOrIterateOperation_1 = ruleCollectOrIterateOperation();

					state._fsp--;


					current = this_CollectOrIterateOperation_1;
					afterParserOrEnumRuleCall();


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2826:5: this_ForAllOrExistsOrOneOperation_2=
				// ruleForAllOrExistsOrOneOperation
				{

					newCompositeNode(grammarAccess.getSequenceExpansionExpressionAccess().getForAllOrExistsOrOneOperationParserRuleCall_2());

					pushFollow(FOLLOW_ruleForAllOrExistsOrOneOperation_in_ruleSequenceExpansionExpression6075);
					this_ForAllOrExistsOrOneOperation_2 = ruleForAllOrExistsOrOneOperation();

					state._fsp--;


					current = this_ForAllOrExistsOrOneOperation_2;
					afterParserOrEnumRuleCall();


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2836:5: this_IsUniqueOperation_3= ruleIsUniqueOperation
				{

					newCompositeNode(grammarAccess.getSequenceExpansionExpressionAccess().getIsUniqueOperationParserRuleCall_3());

					pushFollow(FOLLOW_ruleIsUniqueOperation_in_ruleSequenceExpansionExpression6102);
					this_IsUniqueOperation_3 = ruleIsUniqueOperation();

					state._fsp--;


					current = this_IsUniqueOperation_3;
					afterParserOrEnumRuleCall();


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSequenceExpansionExpression"


	// $ANTLR start "entryRuleSelectOrRejectOperation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2852:1: entryRuleSelectOrRejectOperation returns [EObject
	// current=null] : iv_ruleSelectOrRejectOperation= ruleSelectOrRejectOperation EOF ;
	public final EObject entryRuleSelectOrRejectOperation() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSelectOrRejectOperation = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2853:2: (iv_ruleSelectOrRejectOperation=
			// ruleSelectOrRejectOperation EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2854:2: iv_ruleSelectOrRejectOperation=
			// ruleSelectOrRejectOperation EOF
			{
				newCompositeNode(grammarAccess.getSelectOrRejectOperationRule());
				pushFollow(FOLLOW_ruleSelectOrRejectOperation_in_entryRuleSelectOrRejectOperation6137);
				iv_ruleSelectOrRejectOperation = ruleSelectOrRejectOperation();

				state._fsp--;

				current = iv_ruleSelectOrRejectOperation;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSelectOrRejectOperation6147);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSelectOrRejectOperation"


	// $ANTLR start "ruleSelectOrRejectOperation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2861:1: ruleSelectOrRejectOperation returns [EObject current=null] :
	// (otherlv_0= '->' ( (lv_op_1_0= ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleSelectOrRejectOperation() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_2_0 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		Enumerator lv_op_1_0 = null;

		EObject lv_expr_4_0 = null;

		EObject lv_suffix_6_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2864:28: ( (otherlv_0= '->' ( (lv_op_1_0=
			// ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2865:1: (otherlv_0= '->' ( (lv_op_1_0=
			// ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2865:1: (otherlv_0= '->' ( (lv_op_1_0=
				// ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2865:3: otherlv_0= '->' ( (lv_op_1_0=
				// ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 49, FOLLOW_49_in_ruleSelectOrRejectOperation6184);

					newLeafNode(otherlv_0, grammarAccess.getSelectOrRejectOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2869:1: ( (lv_op_1_0= ruleSelectOrRejectOperator ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2870:1: (lv_op_1_0= ruleSelectOrRejectOperator )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2870:1: (lv_op_1_0= ruleSelectOrRejectOperator )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2871:3: lv_op_1_0= ruleSelectOrRejectOperator
						{

							newCompositeNode(grammarAccess.getSelectOrRejectOperationAccess().getOpSelectOrRejectOperatorEnumRuleCall_1_0());

							pushFollow(FOLLOW_ruleSelectOrRejectOperator_in_ruleSelectOrRejectOperation6205);
							lv_op_1_0 = ruleSelectOrRejectOperator();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSelectOrRejectOperationRule());
							}
							set(
									current,
									"op",
									lv_op_1_0,
									"SelectOrRejectOperator");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2887:2: ( (lv_name_2_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2888:1: (lv_name_2_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2888:1: (lv_name_2_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2889:3: lv_name_2_0= RULE_ID
						{
							lv_name_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleSelectOrRejectOperation6222);

							newLeafNode(lv_name_2_0, grammarAccess.getSelectOrRejectOperationAccess().getNameIDTerminalRuleCall_2_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getSelectOrRejectOperationRule());
							}
							setWithLastConsumed(
									current,
									"name",
									lv_name_2_0,
									"ID");


						}


					}

					otherlv_3 = (Token) match(input, 21, FOLLOW_21_in_ruleSelectOrRejectOperation6239);

					newLeafNode(otherlv_3, grammarAccess.getSelectOrRejectOperationAccess().getLeftParenthesisKeyword_3());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2909:1: ( (lv_expr_4_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2910:1: (lv_expr_4_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2910:1: (lv_expr_4_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2911:3: lv_expr_4_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getSelectOrRejectOperationAccess().getExprExpressionParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleSelectOrRejectOperation6260);
							lv_expr_4_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSelectOrRejectOperationRule());
							}
							set(
									current,
									"expr",
									lv_expr_4_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleSelectOrRejectOperation6272);

					newLeafNode(otherlv_5, grammarAccess.getSelectOrRejectOperationAccess().getRightParenthesisKeyword_5());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2931:1: ( (lv_suffix_6_0= ruleSuffixExpression ) )?
					int alt47 = 2;
					int LA47_0 = input.LA(1);

					if ((LA47_0 == 46 || LA47_0 == 49)) {
						alt47 = 1;
					}
					switch (alt47) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2932:1: (lv_suffix_6_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2932:1: (lv_suffix_6_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2933:3: lv_suffix_6_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getSelectOrRejectOperationAccess().getSuffixSuffixExpressionParserRuleCall_6_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleSelectOrRejectOperation6293);
							lv_suffix_6_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSelectOrRejectOperationRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_6_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSelectOrRejectOperation"


	// $ANTLR start "entryRuleCollectOrIterateOperation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2957:1: entryRuleCollectOrIterateOperation returns [EObject
	// current=null] : iv_ruleCollectOrIterateOperation= ruleCollectOrIterateOperation EOF ;
	public final EObject entryRuleCollectOrIterateOperation() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleCollectOrIterateOperation = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2958:2: (iv_ruleCollectOrIterateOperation=
			// ruleCollectOrIterateOperation EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2959:2: iv_ruleCollectOrIterateOperation=
			// ruleCollectOrIterateOperation EOF
			{
				newCompositeNode(grammarAccess.getCollectOrIterateOperationRule());
				pushFollow(FOLLOW_ruleCollectOrIterateOperation_in_entryRuleCollectOrIterateOperation6330);
				iv_ruleCollectOrIterateOperation = ruleCollectOrIterateOperation();

				state._fsp--;

				current = iv_ruleCollectOrIterateOperation;
				match(input, EOF, FOLLOW_EOF_in_entryRuleCollectOrIterateOperation6340);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleCollectOrIterateOperation"


	// $ANTLR start "ruleCollectOrIterateOperation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2966:1: ruleCollectOrIterateOperation returns [EObject current=null]
	// : (otherlv_0= '->' ( (lv_op_1_0= ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleCollectOrIterateOperation() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_2_0 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		Enumerator lv_op_1_0 = null;

		EObject lv_expr_4_0 = null;

		EObject lv_suffix_6_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2969:28: ( (otherlv_0= '->' ( (lv_op_1_0=
			// ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2970:1: (otherlv_0= '->' ( (lv_op_1_0=
			// ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2970:1: (otherlv_0= '->' ( (lv_op_1_0=
				// ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2970:3: otherlv_0= '->' ( (lv_op_1_0=
				// ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 49, FOLLOW_49_in_ruleCollectOrIterateOperation6377);

					newLeafNode(otherlv_0, grammarAccess.getCollectOrIterateOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2974:1: ( (lv_op_1_0= ruleCollectOrIterateOperator )
					// )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2975:1: (lv_op_1_0= ruleCollectOrIterateOperator )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2975:1: (lv_op_1_0= ruleCollectOrIterateOperator
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2976:3: lv_op_1_0= ruleCollectOrIterateOperator
						{

							newCompositeNode(grammarAccess.getCollectOrIterateOperationAccess().getOpCollectOrIterateOperatorEnumRuleCall_1_0());

							pushFollow(FOLLOW_ruleCollectOrIterateOperator_in_ruleCollectOrIterateOperation6398);
							lv_op_1_0 = ruleCollectOrIterateOperator();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getCollectOrIterateOperationRule());
							}
							set(
									current,
									"op",
									lv_op_1_0,
									"CollectOrIterateOperator");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2992:2: ( (lv_name_2_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2993:1: (lv_name_2_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2993:1: (lv_name_2_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:2994:3: lv_name_2_0= RULE_ID
						{
							lv_name_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleCollectOrIterateOperation6415);

							newLeafNode(lv_name_2_0, grammarAccess.getCollectOrIterateOperationAccess().getNameIDTerminalRuleCall_2_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getCollectOrIterateOperationRule());
							}
							setWithLastConsumed(
									current,
									"name",
									lv_name_2_0,
									"ID");


						}


					}

					otherlv_3 = (Token) match(input, 21, FOLLOW_21_in_ruleCollectOrIterateOperation6432);

					newLeafNode(otherlv_3, grammarAccess.getCollectOrIterateOperationAccess().getLeftParenthesisKeyword_3());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3014:1: ( (lv_expr_4_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3015:1: (lv_expr_4_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3015:1: (lv_expr_4_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3016:3: lv_expr_4_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getCollectOrIterateOperationAccess().getExprExpressionParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleCollectOrIterateOperation6453);
							lv_expr_4_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getCollectOrIterateOperationRule());
							}
							set(
									current,
									"expr",
									lv_expr_4_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleCollectOrIterateOperation6465);

					newLeafNode(otherlv_5, grammarAccess.getCollectOrIterateOperationAccess().getRightParenthesisKeyword_5());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3036:1: ( (lv_suffix_6_0= ruleSuffixExpression ) )?
					int alt48 = 2;
					int LA48_0 = input.LA(1);

					if ((LA48_0 == 46 || LA48_0 == 49)) {
						alt48 = 1;
					}
					switch (alt48) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3037:1: (lv_suffix_6_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3037:1: (lv_suffix_6_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3038:3: lv_suffix_6_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getCollectOrIterateOperationAccess().getSuffixSuffixExpressionParserRuleCall_6_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleCollectOrIterateOperation6486);
							lv_suffix_6_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getCollectOrIterateOperationRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_6_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleCollectOrIterateOperation"


	// $ANTLR start "entryRuleForAllOrExistsOrOneOperation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3062:1: entryRuleForAllOrExistsOrOneOperation returns [EObject
	// current=null] : iv_ruleForAllOrExistsOrOneOperation= ruleForAllOrExistsOrOneOperation EOF ;
	public final EObject entryRuleForAllOrExistsOrOneOperation() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleForAllOrExistsOrOneOperation = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3063:2: (iv_ruleForAllOrExistsOrOneOperation=
			// ruleForAllOrExistsOrOneOperation EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3064:2: iv_ruleForAllOrExistsOrOneOperation=
			// ruleForAllOrExistsOrOneOperation EOF
			{
				newCompositeNode(grammarAccess.getForAllOrExistsOrOneOperationRule());
				pushFollow(FOLLOW_ruleForAllOrExistsOrOneOperation_in_entryRuleForAllOrExistsOrOneOperation6523);
				iv_ruleForAllOrExistsOrOneOperation = ruleForAllOrExistsOrOneOperation();

				state._fsp--;

				current = iv_ruleForAllOrExistsOrOneOperation;
				match(input, EOF, FOLLOW_EOF_in_entryRuleForAllOrExistsOrOneOperation6533);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleForAllOrExistsOrOneOperation"


	// $ANTLR start "ruleForAllOrExistsOrOneOperation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3071:1: ruleForAllOrExistsOrOneOperation returns [EObject
	// current=null] : (otherlv_0= '->' ( (lv_op_1_0= ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleForAllOrExistsOrOneOperation() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_2_0 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		Enumerator lv_op_1_0 = null;

		EObject lv_expr_4_0 = null;

		EObject lv_suffix_6_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3074:28: ( (otherlv_0= '->' ( (lv_op_1_0=
			// ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3075:1: (otherlv_0= '->' ( (lv_op_1_0=
			// ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3075:1: (otherlv_0= '->' ( (lv_op_1_0=
				// ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3075:3: otherlv_0= '->' ( (lv_op_1_0=
				// ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 49, FOLLOW_49_in_ruleForAllOrExistsOrOneOperation6570);

					newLeafNode(otherlv_0, grammarAccess.getForAllOrExistsOrOneOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3079:1: ( (lv_op_1_0=
					// ruleForAllOrExistsOrOneOperator ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3080:1: (lv_op_1_0= ruleForAllOrExistsOrOneOperator
					// )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3080:1: (lv_op_1_0=
						// ruleForAllOrExistsOrOneOperator )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3081:3: lv_op_1_0=
						// ruleForAllOrExistsOrOneOperator
						{

							newCompositeNode(grammarAccess.getForAllOrExistsOrOneOperationAccess().getOpForAllOrExistsOrOneOperatorEnumRuleCall_1_0());

							pushFollow(FOLLOW_ruleForAllOrExistsOrOneOperator_in_ruleForAllOrExistsOrOneOperation6591);
							lv_op_1_0 = ruleForAllOrExistsOrOneOperator();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getForAllOrExistsOrOneOperationRule());
							}
							set(
									current,
									"op",
									lv_op_1_0,
									"ForAllOrExistsOrOneOperator");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3097:2: ( (lv_name_2_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3098:1: (lv_name_2_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3098:1: (lv_name_2_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3099:3: lv_name_2_0= RULE_ID
						{
							lv_name_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleForAllOrExistsOrOneOperation6608);

							newLeafNode(lv_name_2_0, grammarAccess.getForAllOrExistsOrOneOperationAccess().getNameIDTerminalRuleCall_2_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getForAllOrExistsOrOneOperationRule());
							}
							setWithLastConsumed(
									current,
									"name",
									lv_name_2_0,
									"ID");


						}


					}

					otherlv_3 = (Token) match(input, 21, FOLLOW_21_in_ruleForAllOrExistsOrOneOperation6625);

					newLeafNode(otherlv_3, grammarAccess.getForAllOrExistsOrOneOperationAccess().getLeftParenthesisKeyword_3());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3119:1: ( (lv_expr_4_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3120:1: (lv_expr_4_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3120:1: (lv_expr_4_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3121:3: lv_expr_4_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getForAllOrExistsOrOneOperationAccess().getExprExpressionParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleForAllOrExistsOrOneOperation6646);
							lv_expr_4_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getForAllOrExistsOrOneOperationRule());
							}
							set(
									current,
									"expr",
									lv_expr_4_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleForAllOrExistsOrOneOperation6658);

					newLeafNode(otherlv_5, grammarAccess.getForAllOrExistsOrOneOperationAccess().getRightParenthesisKeyword_5());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3141:1: ( (lv_suffix_6_0= ruleSuffixExpression ) )?
					int alt49 = 2;
					int LA49_0 = input.LA(1);

					if ((LA49_0 == 46 || LA49_0 == 49)) {
						alt49 = 1;
					}
					switch (alt49) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3142:1: (lv_suffix_6_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3142:1: (lv_suffix_6_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3143:3: lv_suffix_6_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getForAllOrExistsOrOneOperationAccess().getSuffixSuffixExpressionParserRuleCall_6_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleForAllOrExistsOrOneOperation6679);
							lv_suffix_6_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getForAllOrExistsOrOneOperationRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_6_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleForAllOrExistsOrOneOperation"


	// $ANTLR start "entryRuleIsUniqueOperation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3167:1: entryRuleIsUniqueOperation returns [EObject current=null] :
	// iv_ruleIsUniqueOperation= ruleIsUniqueOperation EOF ;
	public final EObject entryRuleIsUniqueOperation() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleIsUniqueOperation = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3168:2: (iv_ruleIsUniqueOperation= ruleIsUniqueOperation EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3169:2: iv_ruleIsUniqueOperation= ruleIsUniqueOperation EOF
			{
				newCompositeNode(grammarAccess.getIsUniqueOperationRule());
				pushFollow(FOLLOW_ruleIsUniqueOperation_in_entryRuleIsUniqueOperation6716);
				iv_ruleIsUniqueOperation = ruleIsUniqueOperation();

				state._fsp--;

				current = iv_ruleIsUniqueOperation;
				match(input, EOF, FOLLOW_EOF_in_entryRuleIsUniqueOperation6726);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleIsUniqueOperation"


	// $ANTLR start "ruleIsUniqueOperation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3176:1: ruleIsUniqueOperation returns [EObject current=null] :
	// (otherlv_0= '->' otherlv_1= 'isUnique' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleIsUniqueOperation() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token lv_name_2_0 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		EObject lv_expr_4_0 = null;

		EObject lv_suffix_6_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3179:28: ( (otherlv_0= '->' otherlv_1= 'isUnique' (
			// (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3180:1: (otherlv_0= '->' otherlv_1= 'isUnique' (
			// (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3180:1: (otherlv_0= '->' otherlv_1= 'isUnique' (
				// (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3180:3: otherlv_0= '->' otherlv_1= 'isUnique' (
				// (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 49, FOLLOW_49_in_ruleIsUniqueOperation6763);

					newLeafNode(otherlv_0, grammarAccess.getIsUniqueOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());

					otherlv_1 = (Token) match(input, 52, FOLLOW_52_in_ruleIsUniqueOperation6775);

					newLeafNode(otherlv_1, grammarAccess.getIsUniqueOperationAccess().getIsUniqueKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3188:1: ( (lv_name_2_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3189:1: (lv_name_2_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3189:1: (lv_name_2_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3190:3: lv_name_2_0= RULE_ID
						{
							lv_name_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleIsUniqueOperation6792);

							newLeafNode(lv_name_2_0, grammarAccess.getIsUniqueOperationAccess().getNameIDTerminalRuleCall_2_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getIsUniqueOperationRule());
							}
							setWithLastConsumed(
									current,
									"name",
									lv_name_2_0,
									"ID");


						}


					}

					otherlv_3 = (Token) match(input, 21, FOLLOW_21_in_ruleIsUniqueOperation6809);

					newLeafNode(otherlv_3, grammarAccess.getIsUniqueOperationAccess().getLeftParenthesisKeyword_3());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3210:1: ( (lv_expr_4_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3211:1: (lv_expr_4_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3211:1: (lv_expr_4_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3212:3: lv_expr_4_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getIsUniqueOperationAccess().getExprExpressionParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleIsUniqueOperation6830);
							lv_expr_4_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getIsUniqueOperationRule());
							}
							set(
									current,
									"expr",
									lv_expr_4_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleIsUniqueOperation6842);

					newLeafNode(otherlv_5, grammarAccess.getIsUniqueOperationAccess().getRightParenthesisKeyword_5());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3232:1: ( (lv_suffix_6_0= ruleSuffixExpression ) )?
					int alt50 = 2;
					int LA50_0 = input.LA(1);

					if ((LA50_0 == 46 || LA50_0 == 49)) {
						alt50 = 1;
					}
					switch (alt50) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3233:1: (lv_suffix_6_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3233:1: (lv_suffix_6_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3234:3: lv_suffix_6_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getIsUniqueOperationAccess().getSuffixSuffixExpressionParserRuleCall_6_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleIsUniqueOperation6863);
							lv_suffix_6_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getIsUniqueOperationRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_6_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleIsUniqueOperation"


	// $ANTLR start "entryRuleValueSpecification"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3258:1: entryRuleValueSpecification returns [EObject current=null] :
	// iv_ruleValueSpecification= ruleValueSpecification EOF ;
	public final EObject entryRuleValueSpecification() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleValueSpecification = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3259:2: (iv_ruleValueSpecification= ruleValueSpecification
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3260:2: iv_ruleValueSpecification= ruleValueSpecification
			// EOF
			{
				newCompositeNode(grammarAccess.getValueSpecificationRule());
				pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification6900);
				iv_ruleValueSpecification = ruleValueSpecification();

				state._fsp--;

				current = iv_ruleValueSpecification;
				match(input, EOF, FOLLOW_EOF_in_entryRuleValueSpecification6910);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleValueSpecification"


	// $ANTLR start "ruleValueSpecification"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3267:1: ruleValueSpecification returns [EObject current=null] :
	// (this_NameExpression_0= ruleNameExpression | this_LITERAL_1= ruleLITERAL | this_ThisExpression_2= ruleThisExpression | this_SuperInvocationExpression_3= ruleSuperInvocationExpression | this_InstanceCreationExpression_4= ruleInstanceCreationExpression |
	// this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_NullExpression_6= ruleNullExpression ) ;
	public final EObject ruleValueSpecification() throws RecognitionException {
		EObject current = null;

		EObject this_NameExpression_0 = null;

		EObject this_LITERAL_1 = null;

		EObject this_ThisExpression_2 = null;

		EObject this_SuperInvocationExpression_3 = null;

		EObject this_InstanceCreationExpression_4 = null;

		EObject this_ParenthesizedExpression_5 = null;

		EObject this_NullExpression_6 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3270:28: ( (this_NameExpression_0= ruleNameExpression |
			// this_LITERAL_1= ruleLITERAL | this_ThisExpression_2= ruleThisExpression | this_SuperInvocationExpression_3= ruleSuperInvocationExpression | this_InstanceCreationExpression_4= ruleInstanceCreationExpression | this_ParenthesizedExpression_5=
			// ruleParenthesizedExpression | this_NullExpression_6= ruleNullExpression ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3271:1: (this_NameExpression_0= ruleNameExpression |
			// this_LITERAL_1= ruleLITERAL | this_ThisExpression_2= ruleThisExpression | this_SuperInvocationExpression_3= ruleSuperInvocationExpression | this_InstanceCreationExpression_4= ruleInstanceCreationExpression | this_ParenthesizedExpression_5=
			// ruleParenthesizedExpression | this_NullExpression_6= ruleNullExpression )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3271:1: (this_NameExpression_0= ruleNameExpression |
				// this_LITERAL_1= ruleLITERAL | this_ThisExpression_2= ruleThisExpression | this_SuperInvocationExpression_3= ruleSuperInvocationExpression | this_InstanceCreationExpression_4= ruleInstanceCreationExpression | this_ParenthesizedExpression_5=
				// ruleParenthesizedExpression | this_NullExpression_6= ruleNullExpression )
				int alt51 = 7;
				switch (input.LA(1)) {
				case RULE_ID:
				case 14:
				case 15: {
					alt51 = 1;
				}
					break;
				case RULE_INTEGER_VALUE:
				case RULE_STRING:
				case 13:
				case 83:
				case 84: {
					alt51 = 2;
				}
					break;
				case 54: {
					alt51 = 3;
				}
					break;
				case 55: {
					alt51 = 4;
				}
					break;
				case 56: {
					alt51 = 5;
				}
					break;
				case 21: {
					alt51 = 6;
				}
					break;
				case 53: {
					alt51 = 7;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);

					throw nvae;
				}

				switch (alt51) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3272:5: this_NameExpression_0= ruleNameExpression
				{

					newCompositeNode(grammarAccess.getValueSpecificationAccess().getNameExpressionParserRuleCall_0());

					pushFollow(FOLLOW_ruleNameExpression_in_ruleValueSpecification6957);
					this_NameExpression_0 = ruleNameExpression();

					state._fsp--;


					current = this_NameExpression_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3282:5: this_LITERAL_1= ruleLITERAL
				{

					newCompositeNode(grammarAccess.getValueSpecificationAccess().getLITERALParserRuleCall_1());

					pushFollow(FOLLOW_ruleLITERAL_in_ruleValueSpecification6984);
					this_LITERAL_1 = ruleLITERAL();

					state._fsp--;


					current = this_LITERAL_1;
					afterParserOrEnumRuleCall();


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3292:5: this_ThisExpression_2= ruleThisExpression
				{

					newCompositeNode(grammarAccess.getValueSpecificationAccess().getThisExpressionParserRuleCall_2());

					pushFollow(FOLLOW_ruleThisExpression_in_ruleValueSpecification7011);
					this_ThisExpression_2 = ruleThisExpression();

					state._fsp--;


					current = this_ThisExpression_2;
					afterParserOrEnumRuleCall();


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3302:5: this_SuperInvocationExpression_3=
				// ruleSuperInvocationExpression
				{

					newCompositeNode(grammarAccess.getValueSpecificationAccess().getSuperInvocationExpressionParserRuleCall_3());

					pushFollow(FOLLOW_ruleSuperInvocationExpression_in_ruleValueSpecification7038);
					this_SuperInvocationExpression_3 = ruleSuperInvocationExpression();

					state._fsp--;


					current = this_SuperInvocationExpression_3;
					afterParserOrEnumRuleCall();


				}
					break;
				case 5:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3312:5: this_InstanceCreationExpression_4=
				// ruleInstanceCreationExpression
				{

					newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceCreationExpressionParserRuleCall_4());

					pushFollow(FOLLOW_ruleInstanceCreationExpression_in_ruleValueSpecification7065);
					this_InstanceCreationExpression_4 = ruleInstanceCreationExpression();

					state._fsp--;


					current = this_InstanceCreationExpression_4;
					afterParserOrEnumRuleCall();


				}
					break;
				case 6:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3322:5: this_ParenthesizedExpression_5=
				// ruleParenthesizedExpression
				{

					newCompositeNode(grammarAccess.getValueSpecificationAccess().getParenthesizedExpressionParserRuleCall_5());

					pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleValueSpecification7092);
					this_ParenthesizedExpression_5 = ruleParenthesizedExpression();

					state._fsp--;


					current = this_ParenthesizedExpression_5;
					afterParserOrEnumRuleCall();


				}
					break;
				case 7:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3332:5: this_NullExpression_6= ruleNullExpression
				{

					newCompositeNode(grammarAccess.getValueSpecificationAccess().getNullExpressionParserRuleCall_6());

					pushFollow(FOLLOW_ruleNullExpression_in_ruleValueSpecification7119);
					this_NullExpression_6 = ruleNullExpression();

					state._fsp--;


					current = this_NullExpression_6;
					afterParserOrEnumRuleCall();


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleValueSpecification"


	// $ANTLR start "entryRuleNonLiteralValueSpecification"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3348:1: entryRuleNonLiteralValueSpecification returns [EObject
	// current=null] : iv_ruleNonLiteralValueSpecification= ruleNonLiteralValueSpecification EOF ;
	public final EObject entryRuleNonLiteralValueSpecification() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNonLiteralValueSpecification = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3349:2: (iv_ruleNonLiteralValueSpecification=
			// ruleNonLiteralValueSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3350:2: iv_ruleNonLiteralValueSpecification=
			// ruleNonLiteralValueSpecification EOF
			{
				newCompositeNode(grammarAccess.getNonLiteralValueSpecificationRule());
				pushFollow(FOLLOW_ruleNonLiteralValueSpecification_in_entryRuleNonLiteralValueSpecification7154);
				iv_ruleNonLiteralValueSpecification = ruleNonLiteralValueSpecification();

				state._fsp--;

				current = iv_ruleNonLiteralValueSpecification;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNonLiteralValueSpecification7164);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNonLiteralValueSpecification"


	// $ANTLR start "ruleNonLiteralValueSpecification"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3357:1: ruleNonLiteralValueSpecification returns [EObject
	// current=null] : (this_NameExpression_0= ruleNameExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_ThisExpression_3= ruleThisExpression |
	// this_SuperInvocationExpression_4= ruleSuperInvocationExpression ) ;
	public final EObject ruleNonLiteralValueSpecification() throws RecognitionException {
		EObject current = null;

		EObject this_NameExpression_0 = null;

		EObject this_ParenthesizedExpression_1 = null;

		EObject this_InstanceCreationExpression_2 = null;

		EObject this_ThisExpression_3 = null;

		EObject this_SuperInvocationExpression_4 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3360:28: ( (this_NameExpression_0= ruleNameExpression |
			// this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_ThisExpression_3= ruleThisExpression | this_SuperInvocationExpression_4= ruleSuperInvocationExpression ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3361:1: (this_NameExpression_0= ruleNameExpression |
			// this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_ThisExpression_3= ruleThisExpression | this_SuperInvocationExpression_4= ruleSuperInvocationExpression )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3361:1: (this_NameExpression_0= ruleNameExpression |
				// this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_ThisExpression_3= ruleThisExpression | this_SuperInvocationExpression_4= ruleSuperInvocationExpression )
				int alt52 = 5;
				switch (input.LA(1)) {
				case RULE_ID:
				case 14:
				case 15: {
					alt52 = 1;
				}
					break;
				case 21: {
					alt52 = 2;
				}
					break;
				case 56: {
					alt52 = 3;
				}
					break;
				case 54: {
					alt52 = 4;
				}
					break;
				case 55: {
					alt52 = 5;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 52, 0, input);

					throw nvae;
				}

				switch (alt52) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3362:5: this_NameExpression_0= ruleNameExpression
				{

					newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getNameExpressionParserRuleCall_0());

					pushFollow(FOLLOW_ruleNameExpression_in_ruleNonLiteralValueSpecification7211);
					this_NameExpression_0 = ruleNameExpression();

					state._fsp--;


					current = this_NameExpression_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3372:5: this_ParenthesizedExpression_1=
				// ruleParenthesizedExpression
				{

					newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getParenthesizedExpressionParserRuleCall_1());

					pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleNonLiteralValueSpecification7238);
					this_ParenthesizedExpression_1 = ruleParenthesizedExpression();

					state._fsp--;


					current = this_ParenthesizedExpression_1;
					afterParserOrEnumRuleCall();


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3382:5: this_InstanceCreationExpression_2=
				// ruleInstanceCreationExpression
				{

					newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getInstanceCreationExpressionParserRuleCall_2());

					pushFollow(FOLLOW_ruleInstanceCreationExpression_in_ruleNonLiteralValueSpecification7265);
					this_InstanceCreationExpression_2 = ruleInstanceCreationExpression();

					state._fsp--;


					current = this_InstanceCreationExpression_2;
					afterParserOrEnumRuleCall();


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3392:5: this_ThisExpression_3= ruleThisExpression
				{

					newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getThisExpressionParserRuleCall_3());

					pushFollow(FOLLOW_ruleThisExpression_in_ruleNonLiteralValueSpecification7292);
					this_ThisExpression_3 = ruleThisExpression();

					state._fsp--;


					current = this_ThisExpression_3;
					afterParserOrEnumRuleCall();


				}
					break;
				case 5:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3402:5: this_SuperInvocationExpression_4=
				// ruleSuperInvocationExpression
				{

					newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getSuperInvocationExpressionParserRuleCall_4());

					pushFollow(FOLLOW_ruleSuperInvocationExpression_in_ruleNonLiteralValueSpecification7319);
					this_SuperInvocationExpression_4 = ruleSuperInvocationExpression();

					state._fsp--;


					current = this_SuperInvocationExpression_4;
					afterParserOrEnumRuleCall();


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleNonLiteralValueSpecification"


	// $ANTLR start "entryRuleParenthesizedExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3418:1: entryRuleParenthesizedExpression returns [EObject
	// current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
	public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleParenthesizedExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3419:2: (iv_ruleParenthesizedExpression=
			// ruleParenthesizedExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3420:2: iv_ruleParenthesizedExpression=
			// ruleParenthesizedExpression EOF
			{
				newCompositeNode(grammarAccess.getParenthesizedExpressionRule());
				pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7354);
				iv_ruleParenthesizedExpression = ruleParenthesizedExpression();

				state._fsp--;

				current = iv_ruleParenthesizedExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleParenthesizedExpression7364);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleParenthesizedExpression"


	// $ANTLR start "ruleParenthesizedExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3427:1: ruleParenthesizedExpression returns [EObject current=null] :
	// (otherlv_0= '(' ( (lv_expOrTypeCast_1_0= ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )? ) ;
	public final EObject ruleParenthesizedExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		EObject lv_expOrTypeCast_1_0 = null;

		EObject lv_casted_3_0 = null;

		EObject lv_suffix_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3430:28: ( (otherlv_0= '(' ( (lv_expOrTypeCast_1_0=
			// ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3431:1: (otherlv_0= '(' ( (lv_expOrTypeCast_1_0=
			// ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3431:1: (otherlv_0= '(' ( (lv_expOrTypeCast_1_0=
				// ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3431:3: otherlv_0= '(' ( (lv_expOrTypeCast_1_0=
				// ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )?
				{
					otherlv_0 = (Token) match(input, 21, FOLLOW_21_in_ruleParenthesizedExpression7401);

					newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3435:1: ( (lv_expOrTypeCast_1_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3436:1: (lv_expOrTypeCast_1_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3436:1: (lv_expOrTypeCast_1_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3437:3: lv_expOrTypeCast_1_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpOrTypeCastExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression7422);
							lv_expOrTypeCast_1_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
							}
							set(
									current,
									"expOrTypeCast",
									lv_expOrTypeCast_1_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_2 = (Token) match(input, 22, FOLLOW_22_in_ruleParenthesizedExpression7434);

					newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3457:1: ( ( (lv_casted_3_0=
					// ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )?
					int alt53 = 3;
					int LA53_0 = input.LA(1);

					if ((LA53_0 == RULE_ID || (LA53_0 >= 14 && LA53_0 <= 15) || LA53_0 == 21 || (LA53_0 >= 54 && LA53_0 <= 56))) {
						alt53 = 1;
					}
					else if ((LA53_0 == 46 || LA53_0 == 49)) {
						alt53 = 2;
					}
					switch (alt53) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3457:2: ( (lv_casted_3_0=
					// ruleNonLiteralValueSpecification ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3457:2: ( (lv_casted_3_0=
						// ruleNonLiteralValueSpecification ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3458:1: (lv_casted_3_0=
						// ruleNonLiteralValueSpecification )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3458:1: (lv_casted_3_0=
							// ruleNonLiteralValueSpecification )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3459:3: lv_casted_3_0=
							// ruleNonLiteralValueSpecification
							{

								newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getCastedNonLiteralValueSpecificationParserRuleCall_3_0_0());

								pushFollow(FOLLOW_ruleNonLiteralValueSpecification_in_ruleParenthesizedExpression7456);
								lv_casted_3_0 = ruleNonLiteralValueSpecification();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
								}
								set(
										current,
										"casted",
										lv_casted_3_0,
										"NonLiteralValueSpecification");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3476:6: ( (lv_suffix_4_0= ruleSuffixExpression ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3476:6: ( (lv_suffix_4_0= ruleSuffixExpression )
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3477:1: (lv_suffix_4_0= ruleSuffixExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3477:1: (lv_suffix_4_0= ruleSuffixExpression
							// )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3478:3: lv_suffix_4_0= ruleSuffixExpression
							{

								newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_1_0());

								pushFollow(FOLLOW_ruleSuffixExpression_in_ruleParenthesizedExpression7483);
								lv_suffix_4_0 = ruleSuffixExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
								}
								set(
										current,
										"suffix",
										lv_suffix_4_0,
										"SuffixExpression");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleParenthesizedExpression"


	// $ANTLR start "entryRuleNullExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3502:1: entryRuleNullExpression returns [EObject current=null] :
	// iv_ruleNullExpression= ruleNullExpression EOF ;
	public final EObject entryRuleNullExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNullExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3503:2: (iv_ruleNullExpression= ruleNullExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3504:2: iv_ruleNullExpression= ruleNullExpression EOF
			{
				newCompositeNode(grammarAccess.getNullExpressionRule());
				pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression7521);
				iv_ruleNullExpression = ruleNullExpression();

				state._fsp--;

				current = iv_ruleNullExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNullExpression7531);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNullExpression"


	// $ANTLR start "ruleNullExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3511:1: ruleNullExpression returns [EObject current=null] : ( ()
	// otherlv_1= 'null' ) ;
	public final EObject ruleNullExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3514:28: ( ( () otherlv_1= 'null' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3515:1: ( () otherlv_1= 'null' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3515:1: ( () otherlv_1= 'null' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3515:2: () otherlv_1= 'null'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3515:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3516:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 53, FOLLOW_53_in_ruleNullExpression7577);

					newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleNullExpression"


	// $ANTLR start "entryRuleThisExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3533:1: entryRuleThisExpression returns [EObject current=null] :
	// iv_ruleThisExpression= ruleThisExpression EOF ;
	public final EObject entryRuleThisExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleThisExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3534:2: (iv_ruleThisExpression= ruleThisExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3535:2: iv_ruleThisExpression= ruleThisExpression EOF
			{
				newCompositeNode(grammarAccess.getThisExpressionRule());
				pushFollow(FOLLOW_ruleThisExpression_in_entryRuleThisExpression7613);
				iv_ruleThisExpression = ruleThisExpression();

				state._fsp--;

				current = iv_ruleThisExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleThisExpression7623);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleThisExpression"


	// $ANTLR start "ruleThisExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3542:1: ruleThisExpression returns [EObject current=null] : ( ()
	// otherlv_1= 'this' ( (lv_suffix_2_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleThisExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_suffix_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3545:28: ( ( () otherlv_1= 'this' ( (lv_suffix_2_0=
			// ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3546:1: ( () otherlv_1= 'this' ( (lv_suffix_2_0=
			// ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3546:1: ( () otherlv_1= 'this' ( (lv_suffix_2_0=
				// ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3546:2: () otherlv_1= 'this' ( (lv_suffix_2_0=
				// ruleSuffixExpression ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3546:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3547:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getThisExpressionAccess().getThisExpressionAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 54, FOLLOW_54_in_ruleThisExpression7669);

					newLeafNode(otherlv_1, grammarAccess.getThisExpressionAccess().getThisKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3556:1: ( (lv_suffix_2_0= ruleSuffixExpression ) )?
					int alt54 = 2;
					int LA54_0 = input.LA(1);

					if ((LA54_0 == 46 || LA54_0 == 49)) {
						alt54 = 1;
					}
					switch (alt54) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3557:1: (lv_suffix_2_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3557:1: (lv_suffix_2_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3558:3: lv_suffix_2_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getThisExpressionAccess().getSuffixSuffixExpressionParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleThisExpression7690);
							lv_suffix_2_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getThisExpressionRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_2_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleThisExpression"


	// $ANTLR start "entryRuleSuperInvocationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3582:1: entryRuleSuperInvocationExpression returns [EObject
	// current=null] : iv_ruleSuperInvocationExpression= ruleSuperInvocationExpression EOF ;
	public final EObject entryRuleSuperInvocationExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSuperInvocationExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3583:2: (iv_ruleSuperInvocationExpression=
			// ruleSuperInvocationExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3584:2: iv_ruleSuperInvocationExpression=
			// ruleSuperInvocationExpression EOF
			{
				newCompositeNode(grammarAccess.getSuperInvocationExpressionRule());
				pushFollow(FOLLOW_ruleSuperInvocationExpression_in_entryRuleSuperInvocationExpression7727);
				iv_ruleSuperInvocationExpression = ruleSuperInvocationExpression();

				state._fsp--;

				current = iv_ruleSuperInvocationExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSuperInvocationExpression7737);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSuperInvocationExpression"


	// $ANTLR start "ruleSuperInvocationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3591:1: ruleSuperInvocationExpression returns [EObject current=null]
	// : (otherlv_0= 'super' ( ( (lv_tuple_1_0= ruleTuple ) ) | (otherlv_2= '.' ( (lv_operationName_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) ) ) ) ) ;
	public final EObject ruleSuperInvocationExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		EObject lv_tuple_1_0 = null;

		EObject lv_operationName_3_0 = null;

		EObject lv_tuple_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3594:28: ( (otherlv_0= 'super' ( ( (lv_tuple_1_0= ruleTuple
			// ) ) | (otherlv_2= '.' ( (lv_operationName_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) ) ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3595:1: (otherlv_0= 'super' ( ( (lv_tuple_1_0= ruleTuple ) )
			// | (otherlv_2= '.' ( (lv_operationName_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) ) ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3595:1: (otherlv_0= 'super' ( ( (lv_tuple_1_0= ruleTuple
				// ) ) | (otherlv_2= '.' ( (lv_operationName_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) ) ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3595:3: otherlv_0= 'super' ( ( (lv_tuple_1_0= ruleTuple
				// ) ) | (otherlv_2= '.' ( (lv_operationName_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) ) ) )
				{
					otherlv_0 = (Token) match(input, 55, FOLLOW_55_in_ruleSuperInvocationExpression7774);

					newLeafNode(otherlv_0, grammarAccess.getSuperInvocationExpressionAccess().getSuperKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3599:1: ( ( (lv_tuple_1_0= ruleTuple ) ) |
					// (otherlv_2= '.' ( (lv_operationName_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) ) ) )
					int alt55 = 2;
					int LA55_0 = input.LA(1);

					if ((LA55_0 == 21)) {
						alt55 = 1;
					}
					else if ((LA55_0 == 46)) {
						alt55 = 2;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 55, 0, input);

						throw nvae;
					}
					switch (alt55) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3599:2: ( (lv_tuple_1_0= ruleTuple ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3599:2: ( (lv_tuple_1_0= ruleTuple ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3600:1: (lv_tuple_1_0= ruleTuple )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3600:1: (lv_tuple_1_0= ruleTuple )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3601:3: lv_tuple_1_0= ruleTuple
							{

								newCompositeNode(grammarAccess.getSuperInvocationExpressionAccess().getTupleTupleParserRuleCall_1_0_0());

								pushFollow(FOLLOW_ruleTuple_in_ruleSuperInvocationExpression7796);
								lv_tuple_1_0 = ruleTuple();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getSuperInvocationExpressionRule());
								}
								set(
										current,
										"tuple",
										lv_tuple_1_0,
										"Tuple");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3618:6: (otherlv_2= '.' ( (lv_operationName_3_0=
					// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3618:6: (otherlv_2= '.' ( (lv_operationName_3_0=
						// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3618:8: otherlv_2= '.' ( (lv_operationName_3_0=
						// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_4_0= ruleTuple ) )
						{
							otherlv_2 = (Token) match(input, 46, FOLLOW_46_in_ruleSuperInvocationExpression7815);

							newLeafNode(otherlv_2, grammarAccess.getSuperInvocationExpressionAccess().getFullStopKeyword_1_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3622:1: ( (lv_operationName_3_0=
							// ruleQualifiedNameWithBinding ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3623:1: (lv_operationName_3_0=
							// ruleQualifiedNameWithBinding )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3623:1: (lv_operationName_3_0=
								// ruleQualifiedNameWithBinding )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3624:3: lv_operationName_3_0=
								// ruleQualifiedNameWithBinding
								{

									newCompositeNode(grammarAccess.getSuperInvocationExpressionAccess().getOperationNameQualifiedNameWithBindingParserRuleCall_1_1_1_0());

									pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleSuperInvocationExpression7836);
									lv_operationName_3_0 = ruleQualifiedNameWithBinding();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSuperInvocationExpressionRule());
									}
									set(
											current,
											"operationName",
											lv_operationName_3_0,
											"QualifiedNameWithBinding");
									afterParserOrEnumRuleCall();


								}


							}

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3640:2: ( (lv_tuple_4_0= ruleTuple ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3641:1: (lv_tuple_4_0= ruleTuple )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3641:1: (lv_tuple_4_0= ruleTuple )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3642:3: lv_tuple_4_0= ruleTuple
								{

									newCompositeNode(grammarAccess.getSuperInvocationExpressionAccess().getTupleTupleParserRuleCall_1_1_2_0());

									pushFollow(FOLLOW_ruleTuple_in_ruleSuperInvocationExpression7857);
									lv_tuple_4_0 = ruleTuple();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSuperInvocationExpressionRule());
									}
									set(
											current,
											"tuple",
											lv_tuple_4_0,
											"Tuple");
									afterParserOrEnumRuleCall();


								}


							}


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSuperInvocationExpression"


	// $ANTLR start "entryRuleInstanceCreationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3666:1: entryRuleInstanceCreationExpression returns [EObject
	// current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
	public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleInstanceCreationExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3667:2: (iv_ruleInstanceCreationExpression=
			// ruleInstanceCreationExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3668:2: iv_ruleInstanceCreationExpression=
			// ruleInstanceCreationExpression EOF
			{
				newCompositeNode(grammarAccess.getInstanceCreationExpressionRule());
				pushFollow(FOLLOW_ruleInstanceCreationExpression_in_entryRuleInstanceCreationExpression7895);
				iv_ruleInstanceCreationExpression = ruleInstanceCreationExpression();

				state._fsp--;

				current = iv_ruleInstanceCreationExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleInstanceCreationExpression7905);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleInstanceCreationExpression"


	// $ANTLR start "ruleInstanceCreationExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3675:1: ruleInstanceCreationExpression returns [EObject
	// current=null] : (otherlv_0= 'new' ( (lv_constructor_1_0= ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleInstanceCreationTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) ;
	public final EObject ruleInstanceCreationExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_constructor_1_0 = null;

		EObject lv_tuple_2_0 = null;

		EObject lv_suffix_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3678:28: ( (otherlv_0= 'new' ( (lv_constructor_1_0=
			// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleInstanceCreationTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3679:1: (otherlv_0= 'new' ( (lv_constructor_1_0=
			// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleInstanceCreationTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3679:1: (otherlv_0= 'new' ( (lv_constructor_1_0=
				// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleInstanceCreationTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3679:3: otherlv_0= 'new' ( (lv_constructor_1_0=
				// ruleQualifiedNameWithBinding ) ) ( (lv_tuple_2_0= ruleInstanceCreationTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )?
				{
					otherlv_0 = (Token) match(input, 56, FOLLOW_56_in_ruleInstanceCreationExpression7942);

					newLeafNode(otherlv_0, grammarAccess.getInstanceCreationExpressionAccess().getNewKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3683:1: ( (lv_constructor_1_0=
					// ruleQualifiedNameWithBinding ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3684:1: (lv_constructor_1_0=
					// ruleQualifiedNameWithBinding )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3684:1: (lv_constructor_1_0=
						// ruleQualifiedNameWithBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3685:3: lv_constructor_1_0=
						// ruleQualifiedNameWithBinding
						{

							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getConstructorQualifiedNameWithBindingParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleInstanceCreationExpression7963);
							lv_constructor_1_0 = ruleQualifiedNameWithBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
							}
							set(
									current,
									"constructor",
									lv_constructor_1_0,
									"QualifiedNameWithBinding");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3701:2: ( (lv_tuple_2_0= ruleInstanceCreationTuple )
					// )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3702:1: (lv_tuple_2_0= ruleInstanceCreationTuple )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3702:1: (lv_tuple_2_0= ruleInstanceCreationTuple
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3703:3: lv_tuple_2_0= ruleInstanceCreationTuple
						{

							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getTupleInstanceCreationTupleParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleInstanceCreationTuple_in_ruleInstanceCreationExpression7984);
							lv_tuple_2_0 = ruleInstanceCreationTuple();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
							}
							set(
									current,
									"tuple",
									lv_tuple_2_0,
									"InstanceCreationTuple");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3719:2: ( (lv_suffix_3_0= ruleSuffixExpression ) )?
					int alt56 = 2;
					int LA56_0 = input.LA(1);

					if ((LA56_0 == 46 || LA56_0 == 49)) {
						alt56 = 1;
					}
					switch (alt56) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3720:1: (lv_suffix_3_0= ruleSuffixExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3720:1: (lv_suffix_3_0= ruleSuffixExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3721:3: lv_suffix_3_0= ruleSuffixExpression
						{

							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleSuffixExpression_in_ruleInstanceCreationExpression8005);
							lv_suffix_3_0 = ruleSuffixExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
							}
							set(
									current,
									"suffix",
									lv_suffix_3_0,
									"SuffixExpression");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleInstanceCreationExpression"


	// $ANTLR start "entryRuleInstanceCreationTuple"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3745:1: entryRuleInstanceCreationTuple returns [EObject
	// current=null] : iv_ruleInstanceCreationTuple= ruleInstanceCreationTuple EOF ;
	public final EObject entryRuleInstanceCreationTuple() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleInstanceCreationTuple = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3746:2: (iv_ruleInstanceCreationTuple=
			// ruleInstanceCreationTuple EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3747:2: iv_ruleInstanceCreationTuple=
			// ruleInstanceCreationTuple EOF
			{
				newCompositeNode(grammarAccess.getInstanceCreationTupleRule());
				pushFollow(FOLLOW_ruleInstanceCreationTuple_in_entryRuleInstanceCreationTuple8042);
				iv_ruleInstanceCreationTuple = ruleInstanceCreationTuple();

				state._fsp--;

				current = iv_ruleInstanceCreationTuple;
				match(input, EOF, FOLLOW_EOF_in_entryRuleInstanceCreationTuple8052);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleInstanceCreationTuple"


	// $ANTLR start "ruleInstanceCreationTuple"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3754:1: ruleInstanceCreationTuple returns [EObject current=null] : (
	// () otherlv_1= '(' ( ( (lv_instanceCreationTupleElement_2_0= ruleInstanceCreationTupleElement ) ) (otherlv_3= ',' ( (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) ) )* )? otherlv_5= ')' ) ;
	public final EObject ruleInstanceCreationTuple() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		EObject lv_instanceCreationTupleElement_2_0 = null;

		EObject lv_instanceCreationTupleElement_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3757:28: ( ( () otherlv_1= '(' ( (
			// (lv_instanceCreationTupleElement_2_0= ruleInstanceCreationTupleElement ) ) (otherlv_3= ',' ( (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) ) )* )? otherlv_5= ')' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3758:1: ( () otherlv_1= '(' ( (
			// (lv_instanceCreationTupleElement_2_0= ruleInstanceCreationTupleElement ) ) (otherlv_3= ',' ( (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) ) )* )? otherlv_5= ')' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3758:1: ( () otherlv_1= '(' ( (
				// (lv_instanceCreationTupleElement_2_0= ruleInstanceCreationTupleElement ) ) (otherlv_3= ',' ( (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) ) )* )? otherlv_5= ')' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3758:2: () otherlv_1= '(' ( (
				// (lv_instanceCreationTupleElement_2_0= ruleInstanceCreationTupleElement ) ) (otherlv_3= ',' ( (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) ) )* )? otherlv_5= ')'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3758:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3759:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getInstanceCreationTupleAccess().getInstanceCreationTupleAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 21, FOLLOW_21_in_ruleInstanceCreationTuple8098);

					newLeafNode(otherlv_1, grammarAccess.getInstanceCreationTupleAccess().getLeftParenthesisKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3768:1: ( ( (lv_instanceCreationTupleElement_2_0=
					// ruleInstanceCreationTupleElement ) ) (otherlv_3= ',' ( (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) ) )* )?
					int alt58 = 2;
					int LA58_0 = input.LA(1);

					if ((LA58_0 == RULE_ID)) {
						alt58 = 1;
					}
					switch (alt58) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3768:2: ( (lv_instanceCreationTupleElement_2_0=
					// ruleInstanceCreationTupleElement ) ) (otherlv_3= ',' ( (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) ) )*
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3768:2: ( (lv_instanceCreationTupleElement_2_0=
						// ruleInstanceCreationTupleElement ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3769:1: (lv_instanceCreationTupleElement_2_0=
						// ruleInstanceCreationTupleElement )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3769:1:
							// (lv_instanceCreationTupleElement_2_0= ruleInstanceCreationTupleElement )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3770:3: lv_instanceCreationTupleElement_2_0=
							// ruleInstanceCreationTupleElement
							{

								newCompositeNode(grammarAccess.getInstanceCreationTupleAccess().getInstanceCreationTupleElementInstanceCreationTupleElementParserRuleCall_2_0_0());

								pushFollow(FOLLOW_ruleInstanceCreationTupleElement_in_ruleInstanceCreationTuple8120);
								lv_instanceCreationTupleElement_2_0 = ruleInstanceCreationTupleElement();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getInstanceCreationTupleRule());
								}
								add(
										current,
										"instanceCreationTupleElement",
										lv_instanceCreationTupleElement_2_0,
										"InstanceCreationTupleElement");
								afterParserOrEnumRuleCall();


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3786:2: (otherlv_3= ',' (
						// (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) ) )*
						loop57: do {
							int alt57 = 2;
							int LA57_0 = input.LA(1);

							if ((LA57_0 == 18)) {
								alt57 = 1;
							}


							switch (alt57) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3786:4: otherlv_3= ',' (
							// (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) )
							{
								otherlv_3 = (Token) match(input, 18, FOLLOW_18_in_ruleInstanceCreationTuple8133);

								newLeafNode(otherlv_3, grammarAccess.getInstanceCreationTupleAccess().getCommaKeyword_2_1_0());

								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3790:1: (
								// (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3791:1:
								// (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3791:1:
									// (lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement )
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3792:3:
									// lv_instanceCreationTupleElement_4_0= ruleInstanceCreationTupleElement
									{

										newCompositeNode(grammarAccess.getInstanceCreationTupleAccess().getInstanceCreationTupleElementInstanceCreationTupleElementParserRuleCall_2_1_1_0());

										pushFollow(FOLLOW_ruleInstanceCreationTupleElement_in_ruleInstanceCreationTuple8154);
										lv_instanceCreationTupleElement_4_0 = ruleInstanceCreationTupleElement();

										state._fsp--;


										if (current == null) {
											current = createModelElementForParent(grammarAccess.getInstanceCreationTupleRule());
										}
										add(
												current,
												"instanceCreationTupleElement",
												lv_instanceCreationTupleElement_4_0,
												"InstanceCreationTupleElement");
										afterParserOrEnumRuleCall();


									}


								}


							}
								break;

							default:
								break loop57;
							}
						} while (true);


					}
						break;

					}

					otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleInstanceCreationTuple8170);

					newLeafNode(otherlv_5, grammarAccess.getInstanceCreationTupleAccess().getRightParenthesisKeyword_3());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleInstanceCreationTuple"


	// $ANTLR start "entryRuleInstanceCreationTupleElement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3820:1: entryRuleInstanceCreationTupleElement returns [EObject
	// current=null] : iv_ruleInstanceCreationTupleElement= ruleInstanceCreationTupleElement EOF ;
	public final EObject entryRuleInstanceCreationTupleElement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleInstanceCreationTupleElement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3821:2: (iv_ruleInstanceCreationTupleElement=
			// ruleInstanceCreationTupleElement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3822:2: iv_ruleInstanceCreationTupleElement=
			// ruleInstanceCreationTupleElement EOF
			{
				newCompositeNode(grammarAccess.getInstanceCreationTupleElementRule());
				pushFollow(FOLLOW_ruleInstanceCreationTupleElement_in_entryRuleInstanceCreationTupleElement8206);
				iv_ruleInstanceCreationTupleElement = ruleInstanceCreationTupleElement();

				state._fsp--;

				current = iv_ruleInstanceCreationTupleElement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleInstanceCreationTupleElement8216);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleInstanceCreationTupleElement"


	// $ANTLR start "ruleInstanceCreationTupleElement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3829:1: ruleInstanceCreationTupleElement returns [EObject
	// current=null] : ( ( (lv_role_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_object_2_0= ruleExpression ) ) ) ;
	public final EObject ruleInstanceCreationTupleElement() throws RecognitionException {
		EObject current = null;

		Token lv_role_0_0 = null;
		Token otherlv_1 = null;
		EObject lv_object_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3832:28: ( ( ( (lv_role_0_0= RULE_ID ) ) otherlv_1= '=>' (
			// (lv_object_2_0= ruleExpression ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3833:1: ( ( (lv_role_0_0= RULE_ID ) ) otherlv_1= '=>' (
			// (lv_object_2_0= ruleExpression ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3833:1: ( ( (lv_role_0_0= RULE_ID ) ) otherlv_1= '=>' (
				// (lv_object_2_0= ruleExpression ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3833:2: ( (lv_role_0_0= RULE_ID ) ) otherlv_1= '=>' (
				// (lv_object_2_0= ruleExpression ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3833:2: ( (lv_role_0_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3834:1: (lv_role_0_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3834:1: (lv_role_0_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3835:3: lv_role_0_0= RULE_ID
						{
							lv_role_0_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleInstanceCreationTupleElement8258);

							newLeafNode(lv_role_0_0, grammarAccess.getInstanceCreationTupleElementAccess().getRoleIDTerminalRuleCall_0_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getInstanceCreationTupleElementRule());
							}
							setWithLastConsumed(
									current,
									"role",
									lv_role_0_0,
									"ID");


						}


					}

					otherlv_1 = (Token) match(input, 20, FOLLOW_20_in_ruleInstanceCreationTupleElement8275);

					newLeafNode(otherlv_1, grammarAccess.getInstanceCreationTupleElementAccess().getEqualsSignGreaterThanSignKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3855:1: ( (lv_object_2_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3856:1: (lv_object_2_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3856:1: (lv_object_2_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3857:3: lv_object_2_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getInstanceCreationTupleElementAccess().getObjectExpressionParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleInstanceCreationTupleElement8296);
							lv_object_2_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getInstanceCreationTupleElementRule());
							}
							set(
									current,
									"object",
									lv_object_2_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleInstanceCreationTupleElement"


	// $ANTLR start "entryRuleSequenceConstructionOrAccessCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3881:1: entryRuleSequenceConstructionOrAccessCompletion returns
	// [EObject current=null] : iv_ruleSequenceConstructionOrAccessCompletion= ruleSequenceConstructionOrAccessCompletion EOF ;
	public final EObject entryRuleSequenceConstructionOrAccessCompletion() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSequenceConstructionOrAccessCompletion = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3882:2: (iv_ruleSequenceConstructionOrAccessCompletion=
			// ruleSequenceConstructionOrAccessCompletion EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3883:2: iv_ruleSequenceConstructionOrAccessCompletion=
			// ruleSequenceConstructionOrAccessCompletion EOF
			{
				newCompositeNode(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
				pushFollow(FOLLOW_ruleSequenceConstructionOrAccessCompletion_in_entryRuleSequenceConstructionOrAccessCompletion8332);
				iv_ruleSequenceConstructionOrAccessCompletion = ruleSequenceConstructionOrAccessCompletion();

				state._fsp--;

				current = iv_ruleSequenceConstructionOrAccessCompletion;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSequenceConstructionOrAccessCompletion8342);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSequenceConstructionOrAccessCompletion"


	// $ANTLR start "ruleSequenceConstructionOrAccessCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3890:1: ruleSequenceConstructionOrAccessCompletion returns [EObject
	// current=null] : ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) ) | ( (lv_expression_3_0=
	// ruleSequenceConstructionExpression ) ) ) ;
	public final EObject ruleSequenceConstructionOrAccessCompletion() throws RecognitionException {
		EObject current = null;

		Token lv_multiplicityIndicator_0_0 = null;
		EObject lv_accessCompletion_1_0 = null;

		EObject lv_sequenceCompletion_2_0 = null;

		EObject lv_expression_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3893:28: ( ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( (
			// (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) ) | ( (lv_expression_3_0= ruleSequenceConstructionExpression ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3894:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( (
			// (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) ) | ( (lv_expression_3_0= ruleSequenceConstructionExpression ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3894:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( (
				// (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) ) | ( (lv_expression_3_0= ruleSequenceConstructionExpression ) ) )
				int alt60 = 2;
				int LA60_0 = input.LA(1);

				if ((LA60_0 == 47)) {
					alt60 = 1;
				}
				else if ((LA60_0 == 57)) {
					alt60 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 60, 0, input);

					throw nvae;
				}
				switch (alt60) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3894:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( (
				// (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3894:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) ) (
					// ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3894:3: ( (lv_multiplicityIndicator_0_0= '[' ) ) ( (
					// (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3894:3: ( (lv_multiplicityIndicator_0_0= '[' ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3895:1: (lv_multiplicityIndicator_0_0= '[' )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3895:1: (lv_multiplicityIndicator_0_0= '[' )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3896:3: lv_multiplicityIndicator_0_0= '['
							{
								lv_multiplicityIndicator_0_0 = (Token) match(input, 47, FOLLOW_47_in_ruleSequenceConstructionOrAccessCompletion8386);

								newLeafNode(lv_multiplicityIndicator_0_0, grammarAccess.getSequenceConstructionOrAccessCompletionAccess().getMultiplicityIndicatorLeftSquareBracketKeyword_0_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
								}
								setWithLastConsumed(current, "multiplicityIndicator", true, "[");


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3909:2: ( ( (lv_accessCompletion_1_0=
						// ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) )
						int alt59 = 2;
						int LA59_0 = input.LA(1);

						if (((LA59_0 >= RULE_INTEGER_VALUE && LA59_0 <= RULE_ID) || (LA59_0 >= 13 && LA59_0 <= 15) || LA59_0 == 21 || (LA59_0 >= 39 && LA59_0 <= 40) || (LA59_0 >= 43 && LA59_0 <= 45) || (LA59_0 >= 53 && LA59_0 <= 56) || (LA59_0 >= 83 && LA59_0 <= 84))) {
							alt59 = 1;
						}
						else if ((LA59_0 == 48)) {
							alt59 = 2;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 59, 0, input);

							throw nvae;
						}
						switch (alt59) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3909:3: ( (lv_accessCompletion_1_0=
						// ruleAccessCompletion ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3909:3: ( (lv_accessCompletion_1_0=
							// ruleAccessCompletion ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3910:1: (lv_accessCompletion_1_0=
							// ruleAccessCompletion )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3910:1: (lv_accessCompletion_1_0=
								// ruleAccessCompletion )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3911:3: lv_accessCompletion_1_0=
								// ruleAccessCompletion
								{

									newCompositeNode(grammarAccess.getSequenceConstructionOrAccessCompletionAccess().getAccessCompletionAccessCompletionParserRuleCall_0_1_0_0());

									pushFollow(FOLLOW_ruleAccessCompletion_in_ruleSequenceConstructionOrAccessCompletion8421);
									lv_accessCompletion_1_0 = ruleAccessCompletion();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
									}
									set(
											current,
											"accessCompletion",
											lv_accessCompletion_1_0,
											"AccessCompletion");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;
						case 2:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3928:6: ( (lv_sequenceCompletion_2_0=
						// rulePartialSequenceConstructionCompletion ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3928:6: ( (lv_sequenceCompletion_2_0=
							// rulePartialSequenceConstructionCompletion ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3929:1: (lv_sequenceCompletion_2_0=
							// rulePartialSequenceConstructionCompletion )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3929:1: (lv_sequenceCompletion_2_0=
								// rulePartialSequenceConstructionCompletion )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3930:3: lv_sequenceCompletion_2_0=
								// rulePartialSequenceConstructionCompletion
								{

									newCompositeNode(grammarAccess.getSequenceConstructionOrAccessCompletionAccess().getSequenceCompletionPartialSequenceConstructionCompletionParserRuleCall_0_1_1_0());

									pushFollow(FOLLOW_rulePartialSequenceConstructionCompletion_in_ruleSequenceConstructionOrAccessCompletion8448);
									lv_sequenceCompletion_2_0 = rulePartialSequenceConstructionCompletion();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
									}
									set(
											current,
											"sequenceCompletion",
											lv_sequenceCompletion_2_0,
											"PartialSequenceConstructionCompletion");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						}


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3947:6: ( (lv_expression_3_0=
				// ruleSequenceConstructionExpression ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3947:6: ( (lv_expression_3_0=
					// ruleSequenceConstructionExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3948:1: (lv_expression_3_0=
					// ruleSequenceConstructionExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3948:1: (lv_expression_3_0=
						// ruleSequenceConstructionExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3949:3: lv_expression_3_0=
						// ruleSequenceConstructionExpression
						{

							newCompositeNode(grammarAccess.getSequenceConstructionOrAccessCompletionAccess().getExpressionSequenceConstructionExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceConstructionOrAccessCompletion8477);
							lv_expression_3_0 = ruleSequenceConstructionExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
							}
							set(
									current,
									"expression",
									lv_expression_3_0,
									"SequenceConstructionExpression");
							afterParserOrEnumRuleCall();


						}


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSequenceConstructionOrAccessCompletion"


	// $ANTLR start "entryRuleAccessCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3973:1: entryRuleAccessCompletion returns [EObject current=null] :
	// iv_ruleAccessCompletion= ruleAccessCompletion EOF ;
	public final EObject entryRuleAccessCompletion() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAccessCompletion = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3974:2: (iv_ruleAccessCompletion= ruleAccessCompletion EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3975:2: iv_ruleAccessCompletion= ruleAccessCompletion EOF
			{
				newCompositeNode(grammarAccess.getAccessCompletionRule());
				pushFollow(FOLLOW_ruleAccessCompletion_in_entryRuleAccessCompletion8513);
				iv_ruleAccessCompletion = ruleAccessCompletion();

				state._fsp--;

				current = iv_ruleAccessCompletion;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAccessCompletion8523);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAccessCompletion"


	// $ANTLR start "ruleAccessCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3982:1: ruleAccessCompletion returns [EObject current=null] : ( (
	// (lv_accessIndex_0_0= ruleExpression ) ) otherlv_1= ']' ) ;
	public final EObject ruleAccessCompletion() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_accessIndex_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3985:28: ( ( ( (lv_accessIndex_0_0= ruleExpression ) )
			// otherlv_1= ']' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3986:1: ( ( (lv_accessIndex_0_0= ruleExpression ) )
			// otherlv_1= ']' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3986:1: ( ( (lv_accessIndex_0_0= ruleExpression ) )
				// otherlv_1= ']' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3986:2: ( (lv_accessIndex_0_0= ruleExpression ) )
				// otherlv_1= ']'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3986:2: ( (lv_accessIndex_0_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3987:1: (lv_accessIndex_0_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3987:1: (lv_accessIndex_0_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:3988:3: lv_accessIndex_0_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getAccessCompletionAccess().getAccessIndexExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleAccessCompletion8569);
							lv_accessIndex_0_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAccessCompletionRule());
							}
							set(
									current,
									"accessIndex",
									lv_accessIndex_0_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_1 = (Token) match(input, 48, FOLLOW_48_in_ruleAccessCompletion8581);

					newLeafNode(otherlv_1, grammarAccess.getAccessCompletionAccess().getRightSquareBracketKeyword_1());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAccessCompletion"


	// $ANTLR start "entryRulePartialSequenceConstructionCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4016:1: entryRulePartialSequenceConstructionCompletion returns
	// [EObject current=null] : iv_rulePartialSequenceConstructionCompletion= rulePartialSequenceConstructionCompletion EOF ;
	public final EObject entryRulePartialSequenceConstructionCompletion() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePartialSequenceConstructionCompletion = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4017:2: (iv_rulePartialSequenceConstructionCompletion=
			// rulePartialSequenceConstructionCompletion EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4018:2: iv_rulePartialSequenceConstructionCompletion=
			// rulePartialSequenceConstructionCompletion EOF
			{
				newCompositeNode(grammarAccess.getPartialSequenceConstructionCompletionRule());
				pushFollow(FOLLOW_rulePartialSequenceConstructionCompletion_in_entryRulePartialSequenceConstructionCompletion8617);
				iv_rulePartialSequenceConstructionCompletion = rulePartialSequenceConstructionCompletion();

				state._fsp--;

				current = iv_rulePartialSequenceConstructionCompletion;
				match(input, EOF, FOLLOW_EOF_in_entryRulePartialSequenceConstructionCompletion8627);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRulePartialSequenceConstructionCompletion"


	// $ANTLR start "rulePartialSequenceConstructionCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4025:1: rulePartialSequenceConstructionCompletion returns [EObject
	// current=null] : (otherlv_0= ']' ( (lv_expression_1_0= ruleSequenceConstructionExpression ) ) ) ;
	public final EObject rulePartialSequenceConstructionCompletion() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_expression_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4028:28: ( (otherlv_0= ']' ( (lv_expression_1_0=
			// ruleSequenceConstructionExpression ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4029:1: (otherlv_0= ']' ( (lv_expression_1_0=
			// ruleSequenceConstructionExpression ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4029:1: (otherlv_0= ']' ( (lv_expression_1_0=
				// ruleSequenceConstructionExpression ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4029:3: otherlv_0= ']' ( (lv_expression_1_0=
				// ruleSequenceConstructionExpression ) )
				{
					otherlv_0 = (Token) match(input, 48, FOLLOW_48_in_rulePartialSequenceConstructionCompletion8664);

					newLeafNode(otherlv_0, grammarAccess.getPartialSequenceConstructionCompletionAccess().getRightSquareBracketKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4033:1: ( (lv_expression_1_0=
					// ruleSequenceConstructionExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4034:1: (lv_expression_1_0=
					// ruleSequenceConstructionExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4034:1: (lv_expression_1_0=
						// ruleSequenceConstructionExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4035:3: lv_expression_1_0=
						// ruleSequenceConstructionExpression
						{

							newCompositeNode(grammarAccess.getPartialSequenceConstructionCompletionAccess().getExpressionSequenceConstructionExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_rulePartialSequenceConstructionCompletion8685);
							lv_expression_1_0 = ruleSequenceConstructionExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPartialSequenceConstructionCompletionRule());
							}
							set(
									current,
									"expression",
									lv_expression_1_0,
									"SequenceConstructionExpression");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "rulePartialSequenceConstructionCompletion"


	// $ANTLR start "entryRuleSequenceConstructionExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4059:1: entryRuleSequenceConstructionExpression returns [EObject
	// current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
	public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSequenceConstructionExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4060:2: (iv_ruleSequenceConstructionExpression=
			// ruleSequenceConstructionExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4061:2: iv_ruleSequenceConstructionExpression=
			// ruleSequenceConstructionExpression EOF
			{
				newCompositeNode(grammarAccess.getSequenceConstructionExpressionRule());
				pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_entryRuleSequenceConstructionExpression8721);
				iv_ruleSequenceConstructionExpression = ruleSequenceConstructionExpression();

				state._fsp--;

				current = iv_ruleSequenceConstructionExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSequenceConstructionExpression8731);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSequenceConstructionExpression"


	// $ANTLR start "ruleSequenceConstructionExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4068:1: ruleSequenceConstructionExpression returns [EObject
	// current=null] : (otherlv_0= '{' ( (lv_sequenceElement_1_0= ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}' ) ;
	public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		Token otherlv_6 = null;
		EObject lv_sequenceElement_1_0 = null;

		EObject lv_sequenceElement_3_0 = null;

		EObject lv_rangeUpper_5_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4071:28: ( (otherlv_0= '{' ( (lv_sequenceElement_1_0=
			// ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4072:1: (otherlv_0= '{' ( (lv_sequenceElement_1_0=
			// ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4072:1: (otherlv_0= '{' ( (lv_sequenceElement_1_0=
				// ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4072:3: otherlv_0= '{' ( (lv_sequenceElement_1_0=
				// ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}'
				{
					otherlv_0 = (Token) match(input, 57, FOLLOW_57_in_ruleSequenceConstructionExpression8768);

					newLeafNode(otherlv_0, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4076:1: ( (lv_sequenceElement_1_0=
					// ruleSequenceElement ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4077:1: (lv_sequenceElement_1_0= ruleSequenceElement
					// )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4077:1: (lv_sequenceElement_1_0=
						// ruleSequenceElement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4078:3: lv_sequenceElement_1_0=
						// ruleSequenceElement
						{

							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceElementSequenceElementParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleSequenceElement_in_ruleSequenceConstructionExpression8789);
							lv_sequenceElement_1_0 = ruleSequenceElement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
							}
							add(
									current,
									"sequenceElement",
									lv_sequenceElement_1_0,
									"SequenceElement");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4094:2: ( (otherlv_2= ',' ( (lv_sequenceElement_3_0=
					// ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) )
					int alt62 = 2;
					int LA62_0 = input.LA(1);

					if ((LA62_0 == 18 || LA62_0 == 59)) {
						alt62 = 1;
					}
					else if ((LA62_0 == 58)) {
						alt62 = 2;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 62, 0, input);

						throw nvae;
					}
					switch (alt62) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4094:3: (otherlv_2= ',' ( (lv_sequenceElement_3_0=
					// ruleSequenceElement ) ) )*
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4094:3: (otherlv_2= ',' (
						// (lv_sequenceElement_3_0= ruleSequenceElement ) ) )*
						loop61: do {
							int alt61 = 2;
							int LA61_0 = input.LA(1);

							if ((LA61_0 == 18)) {
								alt61 = 1;
							}


							switch (alt61) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4094:5: otherlv_2= ',' (
							// (lv_sequenceElement_3_0= ruleSequenceElement ) )
							{
								otherlv_2 = (Token) match(input, 18, FOLLOW_18_in_ruleSequenceConstructionExpression8803);

								newLeafNode(otherlv_2, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_0_0());

								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4098:1: ( (lv_sequenceElement_3_0=
								// ruleSequenceElement ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4099:1: (lv_sequenceElement_3_0=
								// ruleSequenceElement )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4099:1: (lv_sequenceElement_3_0=
									// ruleSequenceElement )
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4100:3: lv_sequenceElement_3_0=
									// ruleSequenceElement
									{

										newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceElementSequenceElementParserRuleCall_2_0_1_0());

										pushFollow(FOLLOW_ruleSequenceElement_in_ruleSequenceConstructionExpression8824);
										lv_sequenceElement_3_0 = ruleSequenceElement();

										state._fsp--;


										if (current == null) {
											current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
										}
										add(
												current,
												"sequenceElement",
												lv_sequenceElement_3_0,
												"SequenceElement");
										afterParserOrEnumRuleCall();


									}


								}


							}
								break;

							default:
								break loop61;
							}
						} while (true);


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4117:6: (otherlv_4= '..' ( (lv_rangeUpper_5_0=
					// ruleExpression ) ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4117:6: (otherlv_4= '..' ( (lv_rangeUpper_5_0=
						// ruleExpression ) ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4117:8: otherlv_4= '..' ( (lv_rangeUpper_5_0=
						// ruleExpression ) )
						{
							otherlv_4 = (Token) match(input, 58, FOLLOW_58_in_ruleSequenceConstructionExpression8845);

							newLeafNode(otherlv_4, grammarAccess.getSequenceConstructionExpressionAccess().getFullStopFullStopKeyword_2_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4121:1: ( (lv_rangeUpper_5_0= ruleExpression
							// ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4122:1: (lv_rangeUpper_5_0= ruleExpression )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4122:1: (lv_rangeUpper_5_0=
								// ruleExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4123:3: lv_rangeUpper_5_0=
								// ruleExpression
								{

									newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getRangeUpperExpressionParserRuleCall_2_1_1_0());

									pushFollow(FOLLOW_ruleExpression_in_ruleSequenceConstructionExpression8866);
									lv_rangeUpper_5_0 = ruleExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
									}
									set(
											current,
											"rangeUpper",
											lv_rangeUpper_5_0,
											"Expression");
									afterParserOrEnumRuleCall();


								}


							}


						}


					}
						break;

					}

					otherlv_6 = (Token) match(input, 59, FOLLOW_59_in_ruleSequenceConstructionExpression8880);

					newLeafNode(otherlv_6, grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSequenceConstructionExpression"


	// $ANTLR start "entryRuleSequenceElement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4151:1: entryRuleSequenceElement returns [EObject current=null] :
	// iv_ruleSequenceElement= ruleSequenceElement EOF ;
	public final EObject entryRuleSequenceElement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSequenceElement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4152:2: (iv_ruleSequenceElement= ruleSequenceElement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4153:2: iv_ruleSequenceElement= ruleSequenceElement EOF
			{
				newCompositeNode(grammarAccess.getSequenceElementRule());
				pushFollow(FOLLOW_ruleSequenceElement_in_entryRuleSequenceElement8916);
				iv_ruleSequenceElement = ruleSequenceElement();

				state._fsp--;

				current = iv_ruleSequenceElement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSequenceElement8926);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSequenceElement"


	// $ANTLR start "ruleSequenceElement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4160:1: ruleSequenceElement returns [EObject current=null] :
	// (this_Expression_0= ruleExpression | this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression ) ;
	public final EObject ruleSequenceElement() throws RecognitionException {
		EObject current = null;

		EObject this_Expression_0 = null;

		EObject this_SequenceConstructionExpression_1 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4163:28: ( (this_Expression_0= ruleExpression |
			// this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4164:1: (this_Expression_0= ruleExpression |
			// this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4164:1: (this_Expression_0= ruleExpression |
				// this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression )
				int alt63 = 2;
				int LA63_0 = input.LA(1);

				if (((LA63_0 >= RULE_INTEGER_VALUE && LA63_0 <= RULE_ID) || (LA63_0 >= 13 && LA63_0 <= 15) || LA63_0 == 21 || (LA63_0 >= 39 && LA63_0 <= 40) || (LA63_0 >= 43 && LA63_0 <= 45) || (LA63_0 >= 53 && LA63_0 <= 56) || (LA63_0 >= 83 && LA63_0 <= 84))) {
					alt63 = 1;
				}
				else if ((LA63_0 == 57)) {
					alt63 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 63, 0, input);

					throw nvae;
				}
				switch (alt63) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4165:5: this_Expression_0= ruleExpression
				{

					newCompositeNode(grammarAccess.getSequenceElementAccess().getExpressionParserRuleCall_0());

					pushFollow(FOLLOW_ruleExpression_in_ruleSequenceElement8973);
					this_Expression_0 = ruleExpression();

					state._fsp--;


					current = this_Expression_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4175:5: this_SequenceConstructionExpression_1=
				// ruleSequenceConstructionExpression
				{

					newCompositeNode(grammarAccess.getSequenceElementAccess().getSequenceConstructionExpressionParserRuleCall_1());

					pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceElement9000);
					this_SequenceConstructionExpression_1 = ruleSequenceConstructionExpression();

					state._fsp--;


					current = this_SequenceConstructionExpression_1;
					afterParserOrEnumRuleCall();


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSequenceElement"


	// $ANTLR start "entryRuleClassExtentExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4191:1: entryRuleClassExtentExpression returns [EObject
	// current=null] : iv_ruleClassExtentExpression= ruleClassExtentExpression EOF ;
	public final EObject entryRuleClassExtentExpression() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleClassExtentExpression = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4192:2: (iv_ruleClassExtentExpression=
			// ruleClassExtentExpression EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4193:2: iv_ruleClassExtentExpression=
			// ruleClassExtentExpression EOF
			{
				newCompositeNode(grammarAccess.getClassExtentExpressionRule());
				pushFollow(FOLLOW_ruleClassExtentExpression_in_entryRuleClassExtentExpression9035);
				iv_ruleClassExtentExpression = ruleClassExtentExpression();

				state._fsp--;

				current = iv_ruleClassExtentExpression;
				match(input, EOF, FOLLOW_EOF_in_entryRuleClassExtentExpression9045);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleClassExtentExpression"


	// $ANTLR start "ruleClassExtentExpression"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4200:1: ruleClassExtentExpression returns [EObject current=null] : (
	// () otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' ) ;
	public final EObject ruleClassExtentExpression() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4203:28: ( ( () otherlv_1= '.' otherlv_2= 'allInstances'
			// otherlv_3= '(' otherlv_4= ')' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4204:1: ( () otherlv_1= '.' otherlv_2= 'allInstances'
			// otherlv_3= '(' otherlv_4= ')' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4204:1: ( () otherlv_1= '.' otherlv_2= 'allInstances'
				// otherlv_3= '(' otherlv_4= ')' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4204:2: () otherlv_1= '.' otherlv_2= 'allInstances'
				// otherlv_3= '(' otherlv_4= ')'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4204:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4205:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getClassExtentExpressionAccess().getClassExtentExpressionAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 46, FOLLOW_46_in_ruleClassExtentExpression9091);

					newLeafNode(otherlv_1, grammarAccess.getClassExtentExpressionAccess().getFullStopKeyword_1());

					otherlv_2 = (Token) match(input, 60, FOLLOW_60_in_ruleClassExtentExpression9103);

					newLeafNode(otherlv_2, grammarAccess.getClassExtentExpressionAccess().getAllInstancesKeyword_2());

					otherlv_3 = (Token) match(input, 21, FOLLOW_21_in_ruleClassExtentExpression9115);

					newLeafNode(otherlv_3, grammarAccess.getClassExtentExpressionAccess().getLeftParenthesisKeyword_3());

					otherlv_4 = (Token) match(input, 22, FOLLOW_22_in_ruleClassExtentExpression9127);

					newLeafNode(otherlv_4, grammarAccess.getClassExtentExpressionAccess().getRightParenthesisKeyword_4());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleClassExtentExpression"


	// $ANTLR start "entryRuleBlock"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4234:1: entryRuleBlock returns [EObject current=null] :
	// iv_ruleBlock= ruleBlock EOF ;
	public final EObject entryRuleBlock() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBlock = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4235:2: (iv_ruleBlock= ruleBlock EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4236:2: iv_ruleBlock= ruleBlock EOF
			{
				newCompositeNode(grammarAccess.getBlockRule());
				pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock9163);
				iv_ruleBlock = ruleBlock();

				state._fsp--;

				current = iv_ruleBlock;
				match(input, EOF, FOLLOW_EOF_in_entryRuleBlock9173);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleBlock"


	// $ANTLR start "ruleBlock"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4243:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{'
	// () ( (lv_sequence_2_0= ruleStatementSequence ) )? otherlv_3= '}' ) ;
	public final EObject ruleBlock() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_3 = null;
		EObject lv_sequence_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4246:28: ( (otherlv_0= '{' () ( (lv_sequence_2_0=
			// ruleStatementSequence ) )? otherlv_3= '}' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4247:1: (otherlv_0= '{' () ( (lv_sequence_2_0=
			// ruleStatementSequence ) )? otherlv_3= '}' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4247:1: (otherlv_0= '{' () ( (lv_sequence_2_0=
				// ruleStatementSequence ) )? otherlv_3= '}' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4247:3: otherlv_0= '{' () ( (lv_sequence_2_0=
				// ruleStatementSequence ) )? otherlv_3= '}'
				{
					otherlv_0 = (Token) match(input, 57, FOLLOW_57_in_ruleBlock9210);

					newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4251:1: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4252:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getBlockAccess().getBlockAction_1(),
								current);


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4257:2: ( (lv_sequence_2_0= ruleStatementSequence )
					// )?
					int alt64 = 2;
					int LA64_0 = input.LA(1);

					if (((LA64_0 >= RULE_ID && LA64_0 <= RULE_SL_COMMENT) || (LA64_0 >= 14 && LA64_0 <= 15) || (LA64_0 >= 54 && LA64_0 <= 57) || LA64_0 == 61 || (LA64_0 >= 64 && LA64_0 <= 67) || LA64_0 == 70 || (LA64_0 >= 73 && LA64_0 <= 75) || (LA64_0 >= 77 && LA64_0 <= 80))) {
						alt64 = 1;
					}
					switch (alt64) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4258:1: (lv_sequence_2_0= ruleStatementSequence )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4258:1: (lv_sequence_2_0= ruleStatementSequence
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4259:3: lv_sequence_2_0= ruleStatementSequence
						{

							newCompositeNode(grammarAccess.getBlockAccess().getSequenceStatementSequenceParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleStatementSequence_in_ruleBlock9240);
							lv_sequence_2_0 = ruleStatementSequence();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getBlockRule());
							}
							set(
									current,
									"sequence",
									lv_sequence_2_0,
									"StatementSequence");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					otherlv_3 = (Token) match(input, 59, FOLLOW_59_in_ruleBlock9253);

					newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleBlock"


	// $ANTLR start "entryRuleStatementSequence"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4287:1: entryRuleStatementSequence returns [EObject current=null] :
	// iv_ruleStatementSequence= ruleStatementSequence EOF ;
	public final EObject entryRuleStatementSequence() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleStatementSequence = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4288:2: (iv_ruleStatementSequence= ruleStatementSequence EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4289:2: iv_ruleStatementSequence= ruleStatementSequence EOF
			{
				newCompositeNode(grammarAccess.getStatementSequenceRule());
				pushFollow(FOLLOW_ruleStatementSequence_in_entryRuleStatementSequence9289);
				iv_ruleStatementSequence = ruleStatementSequence();

				state._fsp--;

				current = iv_ruleStatementSequence;
				match(input, EOF, FOLLOW_EOF_in_entryRuleStatementSequence9299);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleStatementSequence"


	// $ANTLR start "ruleStatementSequence"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4296:1: ruleStatementSequence returns [EObject current=null] : (
	// (lv_statements_0_0= ruleDocumentedStatement ) )+ ;
	public final EObject ruleStatementSequence() throws RecognitionException {
		EObject current = null;

		EObject lv_statements_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4299:28: ( ( (lv_statements_0_0= ruleDocumentedStatement )
			// )+ )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4300:1: ( (lv_statements_0_0= ruleDocumentedStatement ) )+
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4300:1: ( (lv_statements_0_0= ruleDocumentedStatement )
				// )+
				int cnt65 = 0;
				loop65: do {
					int alt65 = 2;
					int LA65_0 = input.LA(1);

					if (((LA65_0 >= RULE_ID && LA65_0 <= RULE_SL_COMMENT) || (LA65_0 >= 14 && LA65_0 <= 15) || (LA65_0 >= 54 && LA65_0 <= 57) || LA65_0 == 61 || (LA65_0 >= 64 && LA65_0 <= 67) || LA65_0 == 70 || (LA65_0 >= 73 && LA65_0 <= 75) || (LA65_0 >= 77 && LA65_0 <= 80))) {
						alt65 = 1;
					}


					switch (alt65) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4301:1: (lv_statements_0_0= ruleDocumentedStatement
					// )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4301:1: (lv_statements_0_0=
						// ruleDocumentedStatement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4302:3: lv_statements_0_0=
						// ruleDocumentedStatement
						{

							newCompositeNode(grammarAccess.getStatementSequenceAccess().getStatementsDocumentedStatementParserRuleCall_0());

							pushFollow(FOLLOW_ruleDocumentedStatement_in_ruleStatementSequence9344);
							lv_statements_0_0 = ruleDocumentedStatement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getStatementSequenceRule());
							}
							add(
									current,
									"statements",
									lv_statements_0_0,
									"DocumentedStatement");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					default:
						if (cnt65 >= 1) {
							break loop65;
						}
						EarlyExitException eee =
								new EarlyExitException(65, input);
						throw eee;
					}
					cnt65++;
				} while (true);


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleStatementSequence"


	// $ANTLR start "entryRuleDocumentedStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4326:1: entryRuleDocumentedStatement returns [EObject current=null]
	// : iv_ruleDocumentedStatement= ruleDocumentedStatement EOF ;
	public final EObject entryRuleDocumentedStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleDocumentedStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4327:2: (iv_ruleDocumentedStatement= ruleDocumentedStatement
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4328:2: iv_ruleDocumentedStatement= ruleDocumentedStatement
			// EOF
			{
				newCompositeNode(grammarAccess.getDocumentedStatementRule());
				pushFollow(FOLLOW_ruleDocumentedStatement_in_entryRuleDocumentedStatement9380);
				iv_ruleDocumentedStatement = ruleDocumentedStatement();

				state._fsp--;

				current = iv_ruleDocumentedStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleDocumentedStatement9390);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleDocumentedStatement"


	// $ANTLR start "ruleDocumentedStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4335:1: ruleDocumentedStatement returns [EObject current=null] : ( (
	// ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) ) ) ;
	public final EObject ruleDocumentedStatement() throws RecognitionException {
		EObject current = null;

		Token lv_comment_0_1 = null;
		Token lv_comment_0_2 = null;
		EObject lv_statement_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4338:28: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT |
			// lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4339:1: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT |
			// lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4339:1: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT |
				// lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4339:2: ( ( (lv_comment_0_1= RULE_ML_COMMENT |
				// lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4339:2: ( ( (lv_comment_0_1= RULE_ML_COMMENT |
					// lv_comment_0_2= RULE_SL_COMMENT ) ) )?
					int alt67 = 2;
					int LA67_0 = input.LA(1);

					if (((LA67_0 >= RULE_ML_COMMENT && LA67_0 <= RULE_SL_COMMENT))) {
						alt67 = 1;
					}
					switch (alt67) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4340:1: ( (lv_comment_0_1= RULE_ML_COMMENT |
					// lv_comment_0_2= RULE_SL_COMMENT ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4340:1: ( (lv_comment_0_1= RULE_ML_COMMENT |
						// lv_comment_0_2= RULE_SL_COMMENT ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4341:1: (lv_comment_0_1= RULE_ML_COMMENT |
						// lv_comment_0_2= RULE_SL_COMMENT )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4341:1: (lv_comment_0_1= RULE_ML_COMMENT |
							// lv_comment_0_2= RULE_SL_COMMENT )
							int alt66 = 2;
							int LA66_0 = input.LA(1);

							if ((LA66_0 == RULE_ML_COMMENT)) {
								alt66 = 1;
							}
							else if ((LA66_0 == RULE_SL_COMMENT)) {
								alt66 = 2;
							}
							else {
								NoViableAltException nvae =
										new NoViableAltException("", 66, 0, input);

								throw nvae;
							}
							switch (alt66) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4342:3: lv_comment_0_1= RULE_ML_COMMENT
							{
								lv_comment_0_1 = (Token) match(input, RULE_ML_COMMENT, FOLLOW_RULE_ML_COMMENT_in_ruleDocumentedStatement9434);

								newLeafNode(lv_comment_0_1, grammarAccess.getDocumentedStatementAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getDocumentedStatementRule());
								}
								setWithLastConsumed(
										current,
										"comment",
										lv_comment_0_1,
										"ML_COMMENT");


							}
								break;
							case 2:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4357:8: lv_comment_0_2= RULE_SL_COMMENT
							{
								lv_comment_0_2 = (Token) match(input, RULE_SL_COMMENT, FOLLOW_RULE_SL_COMMENT_in_ruleDocumentedStatement9454);

								newLeafNode(lv_comment_0_2, grammarAccess.getDocumentedStatementAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1());


								if (current == null) {
									current = createModelElement(grammarAccess.getDocumentedStatementRule());
								}
								setWithLastConsumed(
										current,
										"comment",
										lv_comment_0_2,
										"SL_COMMENT");


							}
								break;

							}


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4375:3: ( (lv_statement_1_0= ruleStatement ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4376:1: (lv_statement_1_0= ruleStatement )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4376:1: (lv_statement_1_0= ruleStatement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4377:3: lv_statement_1_0= ruleStatement
						{

							newCompositeNode(grammarAccess.getDocumentedStatementAccess().getStatementStatementParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleStatement_in_ruleDocumentedStatement9484);
							lv_statement_1_0 = ruleStatement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getDocumentedStatementRule());
							}
							set(
									current,
									"statement",
									lv_statement_1_0,
									"Statement");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleDocumentedStatement"


	// $ANTLR start "entryRuleInlineStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4401:1: entryRuleInlineStatement returns [EObject current=null] :
	// iv_ruleInlineStatement= ruleInlineStatement EOF ;
	public final EObject entryRuleInlineStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleInlineStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4402:2: (iv_ruleInlineStatement= ruleInlineStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4403:2: iv_ruleInlineStatement= ruleInlineStatement EOF
			{
				newCompositeNode(grammarAccess.getInlineStatementRule());
				pushFollow(FOLLOW_ruleInlineStatement_in_entryRuleInlineStatement9520);
				iv_ruleInlineStatement = ruleInlineStatement();

				state._fsp--;

				current = iv_ruleInlineStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleInlineStatement9530);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleInlineStatement"


	// $ANTLR start "ruleInlineStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4410:1: ruleInlineStatement returns [EObject current=null] :
	// (otherlv_0= '/*@' otherlv_1= 'inline' otherlv_2= '(' ( (lv_langageName_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_body_5_0= RULE_STRING ) ) otherlv_6= '*/' ) ;
	public final EObject ruleInlineStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_2 = null;
		Token lv_langageName_3_0 = null;
		Token otherlv_4 = null;
		Token lv_body_5_0 = null;
		Token otherlv_6 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4413:28: ( (otherlv_0= '/*@' otherlv_1= 'inline' otherlv_2=
			// '(' ( (lv_langageName_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_body_5_0= RULE_STRING ) ) otherlv_6= '*/' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4414:1: (otherlv_0= '/*@' otherlv_1= 'inline' otherlv_2= '('
			// ( (lv_langageName_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_body_5_0= RULE_STRING ) ) otherlv_6= '*/' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4414:1: (otherlv_0= '/*@' otherlv_1= 'inline' otherlv_2=
				// '(' ( (lv_langageName_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_body_5_0= RULE_STRING ) ) otherlv_6= '*/' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4414:3: otherlv_0= '/*@' otherlv_1= 'inline' otherlv_2=
				// '(' ( (lv_langageName_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_body_5_0= RULE_STRING ) ) otherlv_6= '*/'
				{
					otherlv_0 = (Token) match(input, 61, FOLLOW_61_in_ruleInlineStatement9567);

					newLeafNode(otherlv_0, grammarAccess.getInlineStatementAccess().getSolidusAsteriskCommercialAtKeyword_0());

					otherlv_1 = (Token) match(input, 62, FOLLOW_62_in_ruleInlineStatement9579);

					newLeafNode(otherlv_1, grammarAccess.getInlineStatementAccess().getInlineKeyword_1());

					otherlv_2 = (Token) match(input, 21, FOLLOW_21_in_ruleInlineStatement9591);

					newLeafNode(otherlv_2, grammarAccess.getInlineStatementAccess().getLeftParenthesisKeyword_2());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4426:1: ( (lv_langageName_3_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4427:1: (lv_langageName_3_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4427:1: (lv_langageName_3_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4428:3: lv_langageName_3_0= RULE_ID
						{
							lv_langageName_3_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleInlineStatement9608);

							newLeafNode(lv_langageName_3_0, grammarAccess.getInlineStatementAccess().getLangageNameIDTerminalRuleCall_3_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getInlineStatementRule());
							}
							setWithLastConsumed(
									current,
									"langageName",
									lv_langageName_3_0,
									"ID");


						}


					}

					otherlv_4 = (Token) match(input, 22, FOLLOW_22_in_ruleInlineStatement9625);

					newLeafNode(otherlv_4, grammarAccess.getInlineStatementAccess().getRightParenthesisKeyword_4());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4448:1: ( (lv_body_5_0= RULE_STRING ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4449:1: (lv_body_5_0= RULE_STRING )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4449:1: (lv_body_5_0= RULE_STRING )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4450:3: lv_body_5_0= RULE_STRING
						{
							lv_body_5_0 = (Token) match(input, RULE_STRING, FOLLOW_RULE_STRING_in_ruleInlineStatement9642);

							newLeafNode(lv_body_5_0, grammarAccess.getInlineStatementAccess().getBodySTRINGTerminalRuleCall_5_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getInlineStatementRule());
							}
							setWithLastConsumed(
									current,
									"body",
									lv_body_5_0,
									"STRING");


						}


					}

					otherlv_6 = (Token) match(input, 63, FOLLOW_63_in_ruleInlineStatement9659);

					newLeafNode(otherlv_6, grammarAccess.getInlineStatementAccess().getAsteriskSolidusKeyword_6());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleInlineStatement"


	// $ANTLR start "entryRuleAnnotatedStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4478:1: entryRuleAnnotatedStatement returns [EObject current=null] :
	// iv_ruleAnnotatedStatement= ruleAnnotatedStatement EOF ;
	public final EObject entryRuleAnnotatedStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAnnotatedStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4479:2: (iv_ruleAnnotatedStatement= ruleAnnotatedStatement
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4480:2: iv_ruleAnnotatedStatement= ruleAnnotatedStatement
			// EOF
			{
				newCompositeNode(grammarAccess.getAnnotatedStatementRule());
				pushFollow(FOLLOW_ruleAnnotatedStatement_in_entryRuleAnnotatedStatement9695);
				iv_ruleAnnotatedStatement = ruleAnnotatedStatement();

				state._fsp--;

				current = iv_ruleAnnotatedStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAnnotatedStatement9705);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAnnotatedStatement"


	// $ANTLR start "ruleAnnotatedStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4487:1: ruleAnnotatedStatement returns [EObject current=null] :
	// (otherlv_0= '//@' ( (lv_annotation_1_0= ruleAnnotation ) ) ( (lv_statement_2_0= ruleStatement ) ) ) ;
	public final EObject ruleAnnotatedStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_annotation_1_0 = null;

		EObject lv_statement_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4490:28: ( (otherlv_0= '//@' ( (lv_annotation_1_0=
			// ruleAnnotation ) ) ( (lv_statement_2_0= ruleStatement ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4491:1: (otherlv_0= '//@' ( (lv_annotation_1_0=
			// ruleAnnotation ) ) ( (lv_statement_2_0= ruleStatement ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4491:1: (otherlv_0= '//@' ( (lv_annotation_1_0=
				// ruleAnnotation ) ) ( (lv_statement_2_0= ruleStatement ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4491:3: otherlv_0= '//@' ( (lv_annotation_1_0=
				// ruleAnnotation ) ) ( (lv_statement_2_0= ruleStatement ) )
				{
					otherlv_0 = (Token) match(input, 64, FOLLOW_64_in_ruleAnnotatedStatement9742);

					newLeafNode(otherlv_0, grammarAccess.getAnnotatedStatementAccess().getSolidusSolidusCommercialAtKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4495:1: ( (lv_annotation_1_0= ruleAnnotation ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4496:1: (lv_annotation_1_0= ruleAnnotation )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4496:1: (lv_annotation_1_0= ruleAnnotation )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4497:3: lv_annotation_1_0= ruleAnnotation
						{

							newCompositeNode(grammarAccess.getAnnotatedStatementAccess().getAnnotationAnnotationParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotatedStatement9763);
							lv_annotation_1_0 = ruleAnnotation();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAnnotatedStatementRule());
							}
							set(
									current,
									"annotation",
									lv_annotation_1_0,
									"Annotation");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4513:2: ( (lv_statement_2_0= ruleStatement ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4514:1: (lv_statement_2_0= ruleStatement )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4514:1: (lv_statement_2_0= ruleStatement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4515:3: lv_statement_2_0= ruleStatement
						{

							newCompositeNode(grammarAccess.getAnnotatedStatementAccess().getStatementStatementParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleStatement_in_ruleAnnotatedStatement9784);
							lv_statement_2_0 = ruleStatement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAnnotatedStatementRule());
							}
							set(
									current,
									"statement",
									lv_statement_2_0,
									"Statement");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAnnotatedStatement"


	// $ANTLR start "entryRuleStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4539:1: entryRuleStatement returns [EObject current=null] :
	// iv_ruleStatement= ruleStatement EOF ;
	public final EObject entryRuleStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4540:2: (iv_ruleStatement= ruleStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4541:2: iv_ruleStatement= ruleStatement EOF
			{
				newCompositeNode(grammarAccess.getStatementRule());
				pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement9820);
				iv_ruleStatement = ruleStatement();

				state._fsp--;

				current = iv_ruleStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleStatement9830);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleStatement"


	// $ANTLR start "ruleStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4548:1: ruleStatement returns [EObject current=null] :
	// (this_AnnotatedStatement_0= ruleAnnotatedStatement | this_InlineStatement_1= ruleInlineStatement | this_BlockStatement_2= ruleBlockStatement | this_EmptyStatement_3= ruleEmptyStatement | this_LocalNameDeclarationStatement_4=
	// ruleLocalNameDeclarationStatement | this_IfStatement_5= ruleIfStatement | this_SwitchStatement_6= ruleSwitchStatement | this_WhileStatement_7= ruleWhileStatement | this_DoStatement_8= ruleDoStatement | this_ForStatement_9= ruleForStatement |
	// this_BreakStatement_10= ruleBreakStatement | this_ReturnStatement_11= ruleReturnStatement | this_AcceptStatement_12= ruleAcceptStatement | this_ClassifyStatement_13= ruleClassifyStatement | this_InvocationOrAssignementOrDeclarationStatement_14=
	// ruleInvocationOrAssignementOrDeclarationStatement | this_SuperInvocationStatement_15= ruleSuperInvocationStatement | this_ThisInvocationStatement_16= ruleThisInvocationStatement | this_InstanceCreationInvocationStatement_17=
	// ruleInstanceCreationInvocationStatement ) ;
	public final EObject ruleStatement() throws RecognitionException {
		EObject current = null;

		EObject this_AnnotatedStatement_0 = null;

		EObject this_InlineStatement_1 = null;

		EObject this_BlockStatement_2 = null;

		EObject this_EmptyStatement_3 = null;

		EObject this_LocalNameDeclarationStatement_4 = null;

		EObject this_IfStatement_5 = null;

		EObject this_SwitchStatement_6 = null;

		EObject this_WhileStatement_7 = null;

		EObject this_DoStatement_8 = null;

		EObject this_ForStatement_9 = null;

		EObject this_BreakStatement_10 = null;

		EObject this_ReturnStatement_11 = null;

		EObject this_AcceptStatement_12 = null;

		EObject this_ClassifyStatement_13 = null;

		EObject this_InvocationOrAssignementOrDeclarationStatement_14 = null;

		EObject this_SuperInvocationStatement_15 = null;

		EObject this_ThisInvocationStatement_16 = null;

		EObject this_InstanceCreationInvocationStatement_17 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4551:28: ( (this_AnnotatedStatement_0=
			// ruleAnnotatedStatement | this_InlineStatement_1= ruleInlineStatement | this_BlockStatement_2= ruleBlockStatement | this_EmptyStatement_3= ruleEmptyStatement | this_LocalNameDeclarationStatement_4= ruleLocalNameDeclarationStatement |
			// this_IfStatement_5= ruleIfStatement | this_SwitchStatement_6= ruleSwitchStatement | this_WhileStatement_7= ruleWhileStatement | this_DoStatement_8= ruleDoStatement | this_ForStatement_9= ruleForStatement | this_BreakStatement_10=
			// ruleBreakStatement | this_ReturnStatement_11= ruleReturnStatement | this_AcceptStatement_12= ruleAcceptStatement | this_ClassifyStatement_13= ruleClassifyStatement | this_InvocationOrAssignementOrDeclarationStatement_14=
			// ruleInvocationOrAssignementOrDeclarationStatement | this_SuperInvocationStatement_15= ruleSuperInvocationStatement | this_ThisInvocationStatement_16= ruleThisInvocationStatement | this_InstanceCreationInvocationStatement_17=
			// ruleInstanceCreationInvocationStatement ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4552:1: (this_AnnotatedStatement_0= ruleAnnotatedStatement |
			// this_InlineStatement_1= ruleInlineStatement | this_BlockStatement_2= ruleBlockStatement | this_EmptyStatement_3= ruleEmptyStatement | this_LocalNameDeclarationStatement_4= ruleLocalNameDeclarationStatement | this_IfStatement_5= ruleIfStatement |
			// this_SwitchStatement_6= ruleSwitchStatement | this_WhileStatement_7= ruleWhileStatement | this_DoStatement_8= ruleDoStatement | this_ForStatement_9= ruleForStatement | this_BreakStatement_10= ruleBreakStatement | this_ReturnStatement_11=
			// ruleReturnStatement | this_AcceptStatement_12= ruleAcceptStatement | this_ClassifyStatement_13= ruleClassifyStatement | this_InvocationOrAssignementOrDeclarationStatement_14= ruleInvocationOrAssignementOrDeclarationStatement |
			// this_SuperInvocationStatement_15= ruleSuperInvocationStatement | this_ThisInvocationStatement_16= ruleThisInvocationStatement | this_InstanceCreationInvocationStatement_17= ruleInstanceCreationInvocationStatement )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4552:1: (this_AnnotatedStatement_0=
				// ruleAnnotatedStatement | this_InlineStatement_1= ruleInlineStatement | this_BlockStatement_2= ruleBlockStatement | this_EmptyStatement_3= ruleEmptyStatement | this_LocalNameDeclarationStatement_4= ruleLocalNameDeclarationStatement |
				// this_IfStatement_5= ruleIfStatement | this_SwitchStatement_6= ruleSwitchStatement | this_WhileStatement_7= ruleWhileStatement | this_DoStatement_8= ruleDoStatement | this_ForStatement_9= ruleForStatement | this_BreakStatement_10=
				// ruleBreakStatement | this_ReturnStatement_11= ruleReturnStatement | this_AcceptStatement_12= ruleAcceptStatement | this_ClassifyStatement_13= ruleClassifyStatement | this_InvocationOrAssignementOrDeclarationStatement_14=
				// ruleInvocationOrAssignementOrDeclarationStatement | this_SuperInvocationStatement_15= ruleSuperInvocationStatement | this_ThisInvocationStatement_16= ruleThisInvocationStatement | this_InstanceCreationInvocationStatement_17=
				// ruleInstanceCreationInvocationStatement )
				int alt68 = 18;
				switch (input.LA(1)) {
				case 64: {
					alt68 = 1;
				}
					break;
				case 61: {
					alt68 = 2;
				}
					break;
				case 57: {
					alt68 = 3;
				}
					break;
				case 65: {
					alt68 = 4;
				}
					break;
				case 66: {
					alt68 = 5;
				}
					break;
				case 67: {
					alt68 = 6;
				}
					break;
				case 70: {
					alt68 = 7;
				}
					break;
				case 73: {
					alt68 = 8;
				}
					break;
				case 74: {
					alt68 = 9;
				}
					break;
				case 75: {
					alt68 = 10;
				}
					break;
				case 77: {
					alt68 = 11;
				}
					break;
				case 78: {
					alt68 = 12;
				}
					break;
				case 79: {
					alt68 = 13;
				}
					break;
				case 80: {
					alt68 = 14;
				}
					break;
				case RULE_ID:
				case 14:
				case 15: {
					alt68 = 15;
				}
					break;
				case 55: {
					alt68 = 16;
				}
					break;
				case 54: {
					alt68 = 17;
				}
					break;
				case 56: {
					alt68 = 18;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 68, 0, input);

					throw nvae;
				}

				switch (alt68) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4553:5: this_AnnotatedStatement_0=
				// ruleAnnotatedStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getAnnotatedStatementParserRuleCall_0());

					pushFollow(FOLLOW_ruleAnnotatedStatement_in_ruleStatement9877);
					this_AnnotatedStatement_0 = ruleAnnotatedStatement();

					state._fsp--;


					current = this_AnnotatedStatement_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4563:5: this_InlineStatement_1= ruleInlineStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getInlineStatementParserRuleCall_1());

					pushFollow(FOLLOW_ruleInlineStatement_in_ruleStatement9904);
					this_InlineStatement_1 = ruleInlineStatement();

					state._fsp--;


					current = this_InlineStatement_1;
					afterParserOrEnumRuleCall();


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4573:5: this_BlockStatement_2= ruleBlockStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getBlockStatementParserRuleCall_2());

					pushFollow(FOLLOW_ruleBlockStatement_in_ruleStatement9931);
					this_BlockStatement_2 = ruleBlockStatement();

					state._fsp--;


					current = this_BlockStatement_2;
					afterParserOrEnumRuleCall();


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4583:5: this_EmptyStatement_3= ruleEmptyStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getEmptyStatementParserRuleCall_3());

					pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatement9958);
					this_EmptyStatement_3 = ruleEmptyStatement();

					state._fsp--;


					current = this_EmptyStatement_3;
					afterParserOrEnumRuleCall();


				}
					break;
				case 5:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4593:5: this_LocalNameDeclarationStatement_4=
				// ruleLocalNameDeclarationStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getLocalNameDeclarationStatementParserRuleCall_4());

					pushFollow(FOLLOW_ruleLocalNameDeclarationStatement_in_ruleStatement9985);
					this_LocalNameDeclarationStatement_4 = ruleLocalNameDeclarationStatement();

					state._fsp--;


					current = this_LocalNameDeclarationStatement_4;
					afterParserOrEnumRuleCall();


				}
					break;
				case 6:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4603:5: this_IfStatement_5= ruleIfStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_5());

					pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement10012);
					this_IfStatement_5 = ruleIfStatement();

					state._fsp--;


					current = this_IfStatement_5;
					afterParserOrEnumRuleCall();


				}
					break;
				case 7:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4613:5: this_SwitchStatement_6= ruleSwitchStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_6());

					pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement10039);
					this_SwitchStatement_6 = ruleSwitchStatement();

					state._fsp--;


					current = this_SwitchStatement_6;
					afterParserOrEnumRuleCall();


				}
					break;
				case 8:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4623:5: this_WhileStatement_7= ruleWhileStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_7());

					pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement10066);
					this_WhileStatement_7 = ruleWhileStatement();

					state._fsp--;


					current = this_WhileStatement_7;
					afterParserOrEnumRuleCall();


				}
					break;
				case 9:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4633:5: this_DoStatement_8= ruleDoStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getDoStatementParserRuleCall_8());

					pushFollow(FOLLOW_ruleDoStatement_in_ruleStatement10093);
					this_DoStatement_8 = ruleDoStatement();

					state._fsp--;


					current = this_DoStatement_8;
					afterParserOrEnumRuleCall();


				}
					break;
				case 10:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4643:5: this_ForStatement_9= ruleForStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_9());

					pushFollow(FOLLOW_ruleForStatement_in_ruleStatement10120);
					this_ForStatement_9 = ruleForStatement();

					state._fsp--;


					current = this_ForStatement_9;
					afterParserOrEnumRuleCall();


				}
					break;
				case 11:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4653:5: this_BreakStatement_10= ruleBreakStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_10());

					pushFollow(FOLLOW_ruleBreakStatement_in_ruleStatement10147);
					this_BreakStatement_10 = ruleBreakStatement();

					state._fsp--;


					current = this_BreakStatement_10;
					afterParserOrEnumRuleCall();


				}
					break;
				case 12:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4663:5: this_ReturnStatement_11= ruleReturnStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_11());

					pushFollow(FOLLOW_ruleReturnStatement_in_ruleStatement10174);
					this_ReturnStatement_11 = ruleReturnStatement();

					state._fsp--;


					current = this_ReturnStatement_11;
					afterParserOrEnumRuleCall();


				}
					break;
				case 13:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4673:5: this_AcceptStatement_12= ruleAcceptStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getAcceptStatementParserRuleCall_12());

					pushFollow(FOLLOW_ruleAcceptStatement_in_ruleStatement10201);
					this_AcceptStatement_12 = ruleAcceptStatement();

					state._fsp--;


					current = this_AcceptStatement_12;
					afterParserOrEnumRuleCall();


				}
					break;
				case 14:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4683:5: this_ClassifyStatement_13= ruleClassifyStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getClassifyStatementParserRuleCall_13());

					pushFollow(FOLLOW_ruleClassifyStatement_in_ruleStatement10228);
					this_ClassifyStatement_13 = ruleClassifyStatement();

					state._fsp--;


					current = this_ClassifyStatement_13;
					afterParserOrEnumRuleCall();


				}
					break;
				case 15:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4693:5:
				// this_InvocationOrAssignementOrDeclarationStatement_14= ruleInvocationOrAssignementOrDeclarationStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getInvocationOrAssignementOrDeclarationStatementParserRuleCall_14());

					pushFollow(FOLLOW_ruleInvocationOrAssignementOrDeclarationStatement_in_ruleStatement10255);
					this_InvocationOrAssignementOrDeclarationStatement_14 = ruleInvocationOrAssignementOrDeclarationStatement();

					state._fsp--;


					current = this_InvocationOrAssignementOrDeclarationStatement_14;
					afterParserOrEnumRuleCall();


				}
					break;
				case 16:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4703:5: this_SuperInvocationStatement_15=
				// ruleSuperInvocationStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getSuperInvocationStatementParserRuleCall_15());

					pushFollow(FOLLOW_ruleSuperInvocationStatement_in_ruleStatement10282);
					this_SuperInvocationStatement_15 = ruleSuperInvocationStatement();

					state._fsp--;


					current = this_SuperInvocationStatement_15;
					afterParserOrEnumRuleCall();


				}
					break;
				case 17:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4713:5: this_ThisInvocationStatement_16=
				// ruleThisInvocationStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getThisInvocationStatementParserRuleCall_16());

					pushFollow(FOLLOW_ruleThisInvocationStatement_in_ruleStatement10309);
					this_ThisInvocationStatement_16 = ruleThisInvocationStatement();

					state._fsp--;


					current = this_ThisInvocationStatement_16;
					afterParserOrEnumRuleCall();


				}
					break;
				case 18:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4723:5: this_InstanceCreationInvocationStatement_17=
				// ruleInstanceCreationInvocationStatement
				{

					newCompositeNode(grammarAccess.getStatementAccess().getInstanceCreationInvocationStatementParserRuleCall_17());

					pushFollow(FOLLOW_ruleInstanceCreationInvocationStatement_in_ruleStatement10336);
					this_InstanceCreationInvocationStatement_17 = ruleInstanceCreationInvocationStatement();

					state._fsp--;


					current = this_InstanceCreationInvocationStatement_17;
					afterParserOrEnumRuleCall();


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleStatement"


	// $ANTLR start "entryRuleAnnotation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4739:1: entryRuleAnnotation returns [EObject current=null] :
	// iv_ruleAnnotation= ruleAnnotation EOF ;
	public final EObject entryRuleAnnotation() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAnnotation = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4740:2: (iv_ruleAnnotation= ruleAnnotation EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4741:2: iv_ruleAnnotation= ruleAnnotation EOF
			{
				newCompositeNode(grammarAccess.getAnnotationRule());
				pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation10371);
				iv_ruleAnnotation = ruleAnnotation();

				state._fsp--;

				current = iv_ruleAnnotation;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAnnotation10381);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAnnotation"


	// $ANTLR start "ruleAnnotation"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4748:1: ruleAnnotation returns [EObject current=null] : ( (
	// (lv_kind_0_0= ruleAnnotationKind ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )? ) ;
	public final EObject ruleAnnotation() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token lv_args_2_0 = null;
		Token otherlv_3 = null;
		Token lv_args_4_0 = null;
		Token otherlv_5 = null;
		Enumerator lv_kind_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4751:28: ( ( ( (lv_kind_0_0= ruleAnnotationKind ) )
			// (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4752:1: ( ( (lv_kind_0_0= ruleAnnotationKind ) ) (otherlv_1=
			// '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4752:1: ( ( (lv_kind_0_0= ruleAnnotationKind ) )
				// (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4752:2: ( (lv_kind_0_0= ruleAnnotationKind ) )
				// (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )?
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4752:2: ( (lv_kind_0_0= ruleAnnotationKind ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4753:1: (lv_kind_0_0= ruleAnnotationKind )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4753:1: (lv_kind_0_0= ruleAnnotationKind )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4754:3: lv_kind_0_0= ruleAnnotationKind
						{

							newCompositeNode(grammarAccess.getAnnotationAccess().getKindAnnotationKindEnumRuleCall_0_0());

							pushFollow(FOLLOW_ruleAnnotationKind_in_ruleAnnotation10427);
							lv_kind_0_0 = ruleAnnotationKind();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAnnotationRule());
							}
							set(
									current,
									"kind",
									lv_kind_0_0,
									"AnnotationKind");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4770:2: (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) )
					// (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )?
					int alt70 = 2;
					int LA70_0 = input.LA(1);

					if ((LA70_0 == 21)) {
						alt70 = 1;
					}
					switch (alt70) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4770:4: otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) )
					// (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')'
					{
						otherlv_1 = (Token) match(input, 21, FOLLOW_21_in_ruleAnnotation10440);

						newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1_0());

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4774:1: ( (lv_args_2_0= RULE_ID ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4775:1: (lv_args_2_0= RULE_ID )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4775:1: (lv_args_2_0= RULE_ID )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4776:3: lv_args_2_0= RULE_ID
							{
								lv_args_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleAnnotation10457);

								newLeafNode(lv_args_2_0, grammarAccess.getAnnotationAccess().getArgsIDTerminalRuleCall_1_1_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getAnnotationRule());
								}
								addWithLastConsumed(
										current,
										"args",
										lv_args_2_0,
										"ID");


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4792:2: (otherlv_3= ',' ( (lv_args_4_0= RULE_ID
						// ) ) )*
						loop69: do {
							int alt69 = 2;
							int LA69_0 = input.LA(1);

							if ((LA69_0 == 18)) {
								alt69 = 1;
							}


							switch (alt69) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4792:4: otherlv_3= ',' ( (lv_args_4_0=
							// RULE_ID ) )
							{
								otherlv_3 = (Token) match(input, 18, FOLLOW_18_in_ruleAnnotation10475);

								newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getCommaKeyword_1_2_0());

								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4796:1: ( (lv_args_4_0= RULE_ID ) )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4797:1: (lv_args_4_0= RULE_ID )
								{
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4797:1: (lv_args_4_0= RULE_ID )
									// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4798:3: lv_args_4_0= RULE_ID
									{
										lv_args_4_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleAnnotation10492);

										newLeafNode(lv_args_4_0, grammarAccess.getAnnotationAccess().getArgsIDTerminalRuleCall_1_2_1_0());


										if (current == null) {
											current = createModelElement(grammarAccess.getAnnotationRule());
										}
										addWithLastConsumed(
												current,
												"args",
												lv_args_4_0,
												"ID");


									}


								}


							}
								break;

							default:
								break loop69;
							}
						} while (true);

						otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleAnnotation10511);

						newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_1_3());


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAnnotation"


	// $ANTLR start "entryRuleBlockStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4826:1: entryRuleBlockStatement returns [EObject current=null] :
	// iv_ruleBlockStatement= ruleBlockStatement EOF ;
	public final EObject entryRuleBlockStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBlockStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4827:2: (iv_ruleBlockStatement= ruleBlockStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4828:2: iv_ruleBlockStatement= ruleBlockStatement EOF
			{
				newCompositeNode(grammarAccess.getBlockStatementRule());
				pushFollow(FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement10549);
				iv_ruleBlockStatement = ruleBlockStatement();

				state._fsp--;

				current = iv_ruleBlockStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleBlockStatement10559);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleBlockStatement"


	// $ANTLR start "ruleBlockStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4835:1: ruleBlockStatement returns [EObject current=null] : (
	// (lv_block_0_0= ruleBlock ) ) ;
	public final EObject ruleBlockStatement() throws RecognitionException {
		EObject current = null;

		EObject lv_block_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4838:28: ( ( (lv_block_0_0= ruleBlock ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4839:1: ( (lv_block_0_0= ruleBlock ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4839:1: ( (lv_block_0_0= ruleBlock ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4840:1: (lv_block_0_0= ruleBlock )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4840:1: (lv_block_0_0= ruleBlock )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4841:3: lv_block_0_0= ruleBlock
					{

						newCompositeNode(grammarAccess.getBlockStatementAccess().getBlockBlockParserRuleCall_0());

						pushFollow(FOLLOW_ruleBlock_in_ruleBlockStatement10604);
						lv_block_0_0 = ruleBlock();

						state._fsp--;


						if (current == null) {
							current = createModelElementForParent(grammarAccess.getBlockStatementRule());
						}
						set(
								current,
								"block",
								lv_block_0_0,
								"Block");
						afterParserOrEnumRuleCall();


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleBlockStatement"


	// $ANTLR start "entryRuleEmptyStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4865:1: entryRuleEmptyStatement returns [EObject current=null] :
	// iv_ruleEmptyStatement= ruleEmptyStatement EOF ;
	public final EObject entryRuleEmptyStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleEmptyStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4866:2: (iv_ruleEmptyStatement= ruleEmptyStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4867:2: iv_ruleEmptyStatement= ruleEmptyStatement EOF
			{
				newCompositeNode(grammarAccess.getEmptyStatementRule());
				pushFollow(FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement10639);
				iv_ruleEmptyStatement = ruleEmptyStatement();

				state._fsp--;

				current = iv_ruleEmptyStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleEmptyStatement10649);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleEmptyStatement"


	// $ANTLR start "ruleEmptyStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4874:1: ruleEmptyStatement returns [EObject current=null] : ( ()
	// otherlv_1= ';' ) ;
	public final EObject ruleEmptyStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4877:28: ( ( () otherlv_1= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4878:1: ( () otherlv_1= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4878:1: ( () otherlv_1= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4878:2: () otherlv_1= ';'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4878:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4879:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getEmptyStatementAccess().getEmptyStatementAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 65, FOLLOW_65_in_ruleEmptyStatement10695);

					newLeafNode(otherlv_1, grammarAccess.getEmptyStatementAccess().getSemicolonKeyword_1());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleEmptyStatement"


	// $ANTLR start "entryRuleLocalNameDeclarationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4896:1: entryRuleLocalNameDeclarationStatement returns [EObject
	// current=null] : iv_ruleLocalNameDeclarationStatement= ruleLocalNameDeclarationStatement EOF ;
	public final EObject entryRuleLocalNameDeclarationStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLocalNameDeclarationStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4897:2: (iv_ruleLocalNameDeclarationStatement=
			// ruleLocalNameDeclarationStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4898:2: iv_ruleLocalNameDeclarationStatement=
			// ruleLocalNameDeclarationStatement EOF
			{
				newCompositeNode(grammarAccess.getLocalNameDeclarationStatementRule());
				pushFollow(FOLLOW_ruleLocalNameDeclarationStatement_in_entryRuleLocalNameDeclarationStatement10731);
				iv_ruleLocalNameDeclarationStatement = ruleLocalNameDeclarationStatement();

				state._fsp--;

				current = iv_ruleLocalNameDeclarationStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleLocalNameDeclarationStatement10741);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleLocalNameDeclarationStatement"


	// $ANTLR start "ruleLocalNameDeclarationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4905:1: ruleLocalNameDeclarationStatement returns [EObject
	// current=null] : (otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleSequenceElement ) )
	// otherlv_8= ';' ) ;
	public final EObject ruleLocalNameDeclarationStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_varName_1_0 = null;
		Token otherlv_2 = null;
		Token lv_multiplicityIndicator_4_0 = null;
		Token otherlv_5 = null;
		Token otherlv_6 = null;
		Token otherlv_8 = null;
		EObject lv_type_3_0 = null;

		EObject lv_init_7_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4908:28: ( (otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) )
			// otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleSequenceElement ) ) otherlv_8= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4909:1: (otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) )
			// otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleSequenceElement ) ) otherlv_8= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4909:1: (otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) )
				// otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleSequenceElement ) ) otherlv_8= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4909:3: otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) )
				// otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleSequenceElement ) ) otherlv_8= ';'
				{
					otherlv_0 = (Token) match(input, 66, FOLLOW_66_in_ruleLocalNameDeclarationStatement10778);

					newLeafNode(otherlv_0, grammarAccess.getLocalNameDeclarationStatementAccess().getLetKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4913:1: ( (lv_varName_1_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4914:1: (lv_varName_1_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4914:1: (lv_varName_1_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4915:3: lv_varName_1_0= RULE_ID
						{
							lv_varName_1_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleLocalNameDeclarationStatement10795);

							newLeafNode(lv_varName_1_0, grammarAccess.getLocalNameDeclarationStatementAccess().getVarNameIDTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getLocalNameDeclarationStatementRule());
							}
							setWithLastConsumed(
									current,
									"varName",
									lv_varName_1_0,
									"ID");


						}


					}

					otherlv_2 = (Token) match(input, 24, FOLLOW_24_in_ruleLocalNameDeclarationStatement10812);

					newLeafNode(otherlv_2, grammarAccess.getLocalNameDeclarationStatementAccess().getColonKeyword_2());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4935:1: ( (lv_type_3_0= ruleQualifiedNameWithBinding
					// ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4936:1: (lv_type_3_0= ruleQualifiedNameWithBinding )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4936:1: (lv_type_3_0=
						// ruleQualifiedNameWithBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4937:3: lv_type_3_0=
						// ruleQualifiedNameWithBinding
						{

							newCompositeNode(grammarAccess.getLocalNameDeclarationStatementAccess().getTypeQualifiedNameWithBindingParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleLocalNameDeclarationStatement10833);
							lv_type_3_0 = ruleQualifiedNameWithBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getLocalNameDeclarationStatementRule());
							}
							set(
									current,
									"type",
									lv_type_3_0,
									"QualifiedNameWithBinding");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4953:2: ( ( (lv_multiplicityIndicator_4_0= '[' ) )
					// otherlv_5= ']' )?
					int alt71 = 2;
					int LA71_0 = input.LA(1);

					if ((LA71_0 == 47)) {
						alt71 = 1;
					}
					switch (alt71) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4953:3: ( (lv_multiplicityIndicator_4_0= '[' ) )
					// otherlv_5= ']'
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4953:3: ( (lv_multiplicityIndicator_4_0= '[' ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4954:1: (lv_multiplicityIndicator_4_0= '[' )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4954:1: (lv_multiplicityIndicator_4_0= '[' )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4955:3: lv_multiplicityIndicator_4_0= '['
							{
								lv_multiplicityIndicator_4_0 = (Token) match(input, 47, FOLLOW_47_in_ruleLocalNameDeclarationStatement10852);

								newLeafNode(lv_multiplicityIndicator_4_0, grammarAccess.getLocalNameDeclarationStatementAccess().getMultiplicityIndicatorLeftSquareBracketKeyword_4_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getLocalNameDeclarationStatementRule());
								}
								setWithLastConsumed(current, "multiplicityIndicator", true, "[");


							}


						}

						otherlv_5 = (Token) match(input, 48, FOLLOW_48_in_ruleLocalNameDeclarationStatement10877);

						newLeafNode(otherlv_5, grammarAccess.getLocalNameDeclarationStatementAccess().getRightSquareBracketKeyword_4_1());


					}
						break;

					}

					otherlv_6 = (Token) match(input, 12, FOLLOW_12_in_ruleLocalNameDeclarationStatement10891);

					newLeafNode(otherlv_6, grammarAccess.getLocalNameDeclarationStatementAccess().getEqualsSignKeyword_5());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4976:1: ( (lv_init_7_0= ruleSequenceElement ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4977:1: (lv_init_7_0= ruleSequenceElement )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4977:1: (lv_init_7_0= ruleSequenceElement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:4978:3: lv_init_7_0= ruleSequenceElement
						{

							newCompositeNode(grammarAccess.getLocalNameDeclarationStatementAccess().getInitSequenceElementParserRuleCall_6_0());

							pushFollow(FOLLOW_ruleSequenceElement_in_ruleLocalNameDeclarationStatement10912);
							lv_init_7_0 = ruleSequenceElement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getLocalNameDeclarationStatementRule());
							}
							set(
									current,
									"init",
									lv_init_7_0,
									"SequenceElement");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_8 = (Token) match(input, 65, FOLLOW_65_in_ruleLocalNameDeclarationStatement10924);

					newLeafNode(otherlv_8, grammarAccess.getLocalNameDeclarationStatementAccess().getSemicolonKeyword_7());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleLocalNameDeclarationStatement"


	// $ANTLR start "entryRuleIfStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5006:1: entryRuleIfStatement returns [EObject current=null] :
	// iv_ruleIfStatement= ruleIfStatement EOF ;
	public final EObject entryRuleIfStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleIfStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5007:2: (iv_ruleIfStatement= ruleIfStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5008:2: iv_ruleIfStatement= ruleIfStatement EOF
			{
				newCompositeNode(grammarAccess.getIfStatementRule());
				pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement10960);
				iv_ruleIfStatement = ruleIfStatement();

				state._fsp--;

				current = iv_ruleIfStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleIfStatement10970);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleIfStatement"


	// $ANTLR start "ruleIfStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5015:1: ruleIfStatement returns [EObject current=null] : (otherlv_0=
	// 'if' ( (lv_sequentialClausses_1_0= ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )? ) ;
	public final EObject ruleIfStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_sequentialClausses_1_0 = null;

		EObject lv_finalClause_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5018:28: ( (otherlv_0= 'if' ( (lv_sequentialClausses_1_0=
			// ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5019:1: (otherlv_0= 'if' ( (lv_sequentialClausses_1_0=
			// ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5019:1: (otherlv_0= 'if' ( (lv_sequentialClausses_1_0=
				// ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )? )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5019:3: otherlv_0= 'if' ( (lv_sequentialClausses_1_0=
				// ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )?
				{
					otherlv_0 = (Token) match(input, 67, FOLLOW_67_in_ruleIfStatement11007);

					newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5023:1: ( (lv_sequentialClausses_1_0=
					// ruleSequentialClauses ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5024:1: (lv_sequentialClausses_1_0=
					// ruleSequentialClauses )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5024:1: (lv_sequentialClausses_1_0=
						// ruleSequentialClauses )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5025:3: lv_sequentialClausses_1_0=
						// ruleSequentialClauses
						{

							newCompositeNode(grammarAccess.getIfStatementAccess().getSequentialClaussesSequentialClausesParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleSequentialClauses_in_ruleIfStatement11028);
							lv_sequentialClausses_1_0 = ruleSequentialClauses();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getIfStatementRule());
							}
							set(
									current,
									"sequentialClausses",
									lv_sequentialClausses_1_0,
									"SequentialClauses");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5041:2: ( (lv_finalClause_2_0= ruleFinalClause ) )?
					int alt72 = 2;
					int LA72_0 = input.LA(1);

					if ((LA72_0 == 68)) {
						alt72 = 1;
					}
					switch (alt72) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5042:1: (lv_finalClause_2_0= ruleFinalClause )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5042:1: (lv_finalClause_2_0= ruleFinalClause )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5043:3: lv_finalClause_2_0= ruleFinalClause
						{

							newCompositeNode(grammarAccess.getIfStatementAccess().getFinalClauseFinalClauseParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleFinalClause_in_ruleIfStatement11049);
							lv_finalClause_2_0 = ruleFinalClause();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getIfStatementRule());
							}
							set(
									current,
									"finalClause",
									lv_finalClause_2_0,
									"FinalClause");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleIfStatement"


	// $ANTLR start "entryRuleSequentialClauses"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5067:1: entryRuleSequentialClauses returns [EObject current=null] :
	// iv_ruleSequentialClauses= ruleSequentialClauses EOF ;
	public final EObject entryRuleSequentialClauses() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSequentialClauses = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5068:2: (iv_ruleSequentialClauses= ruleSequentialClauses EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5069:2: iv_ruleSequentialClauses= ruleSequentialClauses EOF
			{
				newCompositeNode(grammarAccess.getSequentialClausesRule());
				pushFollow(FOLLOW_ruleSequentialClauses_in_entryRuleSequentialClauses11086);
				iv_ruleSequentialClauses = ruleSequentialClauses();

				state._fsp--;

				current = iv_ruleSequentialClauses;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSequentialClauses11096);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSequentialClauses"


	// $ANTLR start "ruleSequentialClauses"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5076:1: ruleSequentialClauses returns [EObject current=null] : ( (
	// (lv_conccurentClauses_0_0= ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )* ) ;
	public final EObject ruleSequentialClauses() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_2 = null;
		EObject lv_conccurentClauses_0_0 = null;

		EObject lv_conccurentClauses_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5079:28: ( ( ( (lv_conccurentClauses_0_0=
			// ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5080:1: ( ( (lv_conccurentClauses_0_0= ruleConcurrentClauses
			// ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5080:1: ( ( (lv_conccurentClauses_0_0=
				// ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5080:2: ( (lv_conccurentClauses_0_0=
				// ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5080:2: ( (lv_conccurentClauses_0_0=
					// ruleConcurrentClauses ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5081:1: (lv_conccurentClauses_0_0=
					// ruleConcurrentClauses )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5081:1: (lv_conccurentClauses_0_0=
						// ruleConcurrentClauses )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5082:3: lv_conccurentClauses_0_0=
						// ruleConcurrentClauses
						{

							newCompositeNode(grammarAccess.getSequentialClausesAccess().getConccurentClausesConcurrentClausesParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleConcurrentClauses_in_ruleSequentialClauses11142);
							lv_conccurentClauses_0_0 = ruleConcurrentClauses();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSequentialClausesRule());
							}
							add(
									current,
									"conccurentClauses",
									lv_conccurentClauses_0_0,
									"ConcurrentClauses");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5098:2: (otherlv_1= 'else' otherlv_2= 'if' (
					// (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )*
					loop73: do {
						int alt73 = 2;
						int LA73_0 = input.LA(1);

						if ((LA73_0 == 68)) {
							int LA73_1 = input.LA(2);

							if ((LA73_1 == 67)) {
								alt73 = 1;
							}


						}


						switch (alt73) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5098:4: otherlv_1= 'else' otherlv_2= 'if' (
						// (lv_conccurentClauses_3_0= ruleConcurrentClauses ) )
						{
							otherlv_1 = (Token) match(input, 68, FOLLOW_68_in_ruleSequentialClauses11155);

							newLeafNode(otherlv_1, grammarAccess.getSequentialClausesAccess().getElseKeyword_1_0());

							otherlv_2 = (Token) match(input, 67, FOLLOW_67_in_ruleSequentialClauses11167);

							newLeafNode(otherlv_2, grammarAccess.getSequentialClausesAccess().getIfKeyword_1_1());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5106:1: ( (lv_conccurentClauses_3_0=
							// ruleConcurrentClauses ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5107:1: (lv_conccurentClauses_3_0=
							// ruleConcurrentClauses )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5107:1: (lv_conccurentClauses_3_0=
								// ruleConcurrentClauses )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5108:3: lv_conccurentClauses_3_0=
								// ruleConcurrentClauses
								{

									newCompositeNode(grammarAccess.getSequentialClausesAccess().getConccurentClausesConcurrentClausesParserRuleCall_1_2_0());

									pushFollow(FOLLOW_ruleConcurrentClauses_in_ruleSequentialClauses11188);
									lv_conccurentClauses_3_0 = ruleConcurrentClauses();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getSequentialClausesRule());
									}
									add(
											current,
											"conccurentClauses",
											lv_conccurentClauses_3_0,
											"ConcurrentClauses");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop73;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSequentialClauses"


	// $ANTLR start "entryRuleConcurrentClauses"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5132:1: entryRuleConcurrentClauses returns [EObject current=null] :
	// iv_ruleConcurrentClauses= ruleConcurrentClauses EOF ;
	public final EObject entryRuleConcurrentClauses() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleConcurrentClauses = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5133:2: (iv_ruleConcurrentClauses= ruleConcurrentClauses EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5134:2: iv_ruleConcurrentClauses= ruleConcurrentClauses EOF
			{
				newCompositeNode(grammarAccess.getConcurrentClausesRule());
				pushFollow(FOLLOW_ruleConcurrentClauses_in_entryRuleConcurrentClauses11226);
				iv_ruleConcurrentClauses = ruleConcurrentClauses();

				state._fsp--;

				current = iv_ruleConcurrentClauses;
				match(input, EOF, FOLLOW_EOF_in_entryRuleConcurrentClauses11236);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleConcurrentClauses"


	// $ANTLR start "ruleConcurrentClauses"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5141:1: ruleConcurrentClauses returns [EObject current=null] : ( (
	// (lv_nonFinalClause_0_0= ruleNonFinalClause ) ) (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )* ) ;
	public final EObject ruleConcurrentClauses() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_2 = null;
		EObject lv_nonFinalClause_0_0 = null;

		EObject lv_nonFinalClause_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5144:28: ( ( ( (lv_nonFinalClause_0_0= ruleNonFinalClause )
			// ) (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5145:1: ( ( (lv_nonFinalClause_0_0= ruleNonFinalClause ) )
			// (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5145:1: ( ( (lv_nonFinalClause_0_0= ruleNonFinalClause )
				// ) (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5145:2: ( (lv_nonFinalClause_0_0= ruleNonFinalClause ) )
				// (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5145:2: ( (lv_nonFinalClause_0_0= ruleNonFinalClause
					// ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5146:1: (lv_nonFinalClause_0_0= ruleNonFinalClause )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5146:1: (lv_nonFinalClause_0_0=
						// ruleNonFinalClause )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5147:3: lv_nonFinalClause_0_0=
						// ruleNonFinalClause
						{

							newCompositeNode(grammarAccess.getConcurrentClausesAccess().getNonFinalClauseNonFinalClauseParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleNonFinalClause_in_ruleConcurrentClauses11282);
							lv_nonFinalClause_0_0 = ruleNonFinalClause();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getConcurrentClausesRule());
							}
							add(
									current,
									"nonFinalClause",
									lv_nonFinalClause_0_0,
									"NonFinalClause");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5163:2: (otherlv_1= 'or' otherlv_2= 'if' (
					// (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )*
					loop74: do {
						int alt74 = 2;
						int LA74_0 = input.LA(1);

						if ((LA74_0 == 69)) {
							alt74 = 1;
						}


						switch (alt74) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5163:4: otherlv_1= 'or' otherlv_2= 'if' (
						// (lv_nonFinalClause_3_0= ruleNonFinalClause ) )
						{
							otherlv_1 = (Token) match(input, 69, FOLLOW_69_in_ruleConcurrentClauses11295);

							newLeafNode(otherlv_1, grammarAccess.getConcurrentClausesAccess().getOrKeyword_1_0());

							otherlv_2 = (Token) match(input, 67, FOLLOW_67_in_ruleConcurrentClauses11307);

							newLeafNode(otherlv_2, grammarAccess.getConcurrentClausesAccess().getIfKeyword_1_1());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5171:1: ( (lv_nonFinalClause_3_0=
							// ruleNonFinalClause ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5172:1: (lv_nonFinalClause_3_0=
							// ruleNonFinalClause )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5172:1: (lv_nonFinalClause_3_0=
								// ruleNonFinalClause )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5173:3: lv_nonFinalClause_3_0=
								// ruleNonFinalClause
								{

									newCompositeNode(grammarAccess.getConcurrentClausesAccess().getNonFinalClauseNonFinalClauseParserRuleCall_1_2_0());

									pushFollow(FOLLOW_ruleNonFinalClause_in_ruleConcurrentClauses11328);
									lv_nonFinalClause_3_0 = ruleNonFinalClause();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getConcurrentClausesRule());
									}
									add(
											current,
											"nonFinalClause",
											lv_nonFinalClause_3_0,
											"NonFinalClause");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop74;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleConcurrentClauses"


	// $ANTLR start "entryRuleNonFinalClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5197:1: entryRuleNonFinalClause returns [EObject current=null] :
	// iv_ruleNonFinalClause= ruleNonFinalClause EOF ;
	public final EObject entryRuleNonFinalClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNonFinalClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5198:2: (iv_ruleNonFinalClause= ruleNonFinalClause EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5199:2: iv_ruleNonFinalClause= ruleNonFinalClause EOF
			{
				newCompositeNode(grammarAccess.getNonFinalClauseRule());
				pushFollow(FOLLOW_ruleNonFinalClause_in_entryRuleNonFinalClause11366);
				iv_ruleNonFinalClause = ruleNonFinalClause();

				state._fsp--;

				current = iv_ruleNonFinalClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNonFinalClause11376);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNonFinalClause"


	// $ANTLR start "ruleNonFinalClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5206:1: ruleNonFinalClause returns [EObject current=null] :
	// (otherlv_0= '(' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) ) ) ;
	public final EObject ruleNonFinalClause() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		EObject lv_condition_1_0 = null;

		EObject lv_block_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5209:28: ( (otherlv_0= '(' ( (lv_condition_1_0=
			// ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5210:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleExpression
			// ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5210:1: (otherlv_0= '(' ( (lv_condition_1_0=
				// ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5210:3: otherlv_0= '(' ( (lv_condition_1_0=
				// ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) )
				{
					otherlv_0 = (Token) match(input, 21, FOLLOW_21_in_ruleNonFinalClause11413);

					newLeafNode(otherlv_0, grammarAccess.getNonFinalClauseAccess().getLeftParenthesisKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5214:1: ( (lv_condition_1_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5215:1: (lv_condition_1_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5215:1: (lv_condition_1_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5216:3: lv_condition_1_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getNonFinalClauseAccess().getConditionExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleNonFinalClause11434);
							lv_condition_1_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getNonFinalClauseRule());
							}
							set(
									current,
									"condition",
									lv_condition_1_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_2 = (Token) match(input, 22, FOLLOW_22_in_ruleNonFinalClause11446);

					newLeafNode(otherlv_2, grammarAccess.getNonFinalClauseAccess().getRightParenthesisKeyword_2());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5236:1: ( (lv_block_3_0= ruleBlock ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5237:1: (lv_block_3_0= ruleBlock )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5237:1: (lv_block_3_0= ruleBlock )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5238:3: lv_block_3_0= ruleBlock
						{

							newCompositeNode(grammarAccess.getNonFinalClauseAccess().getBlockBlockParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleBlock_in_ruleNonFinalClause11467);
							lv_block_3_0 = ruleBlock();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getNonFinalClauseRule());
							}
							set(
									current,
									"block",
									lv_block_3_0,
									"Block");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleNonFinalClause"


	// $ANTLR start "entryRuleFinalClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5262:1: entryRuleFinalClause returns [EObject current=null] :
	// iv_ruleFinalClause= ruleFinalClause EOF ;
	public final EObject entryRuleFinalClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleFinalClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5263:2: (iv_ruleFinalClause= ruleFinalClause EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5264:2: iv_ruleFinalClause= ruleFinalClause EOF
			{
				newCompositeNode(grammarAccess.getFinalClauseRule());
				pushFollow(FOLLOW_ruleFinalClause_in_entryRuleFinalClause11503);
				iv_ruleFinalClause = ruleFinalClause();

				state._fsp--;

				current = iv_ruleFinalClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleFinalClause11513);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleFinalClause"


	// $ANTLR start "ruleFinalClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5271:1: ruleFinalClause returns [EObject current=null] : (otherlv_0=
	// 'else' ( (lv_block_1_0= ruleBlock ) ) ) ;
	public final EObject ruleFinalClause() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_block_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5274:28: ( (otherlv_0= 'else' ( (lv_block_1_0= ruleBlock ) )
			// ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5275:1: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlock ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5275:1: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlock )
				// ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5275:3: otherlv_0= 'else' ( (lv_block_1_0= ruleBlock ) )
				{
					otherlv_0 = (Token) match(input, 68, FOLLOW_68_in_ruleFinalClause11550);

					newLeafNode(otherlv_0, grammarAccess.getFinalClauseAccess().getElseKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5279:1: ( (lv_block_1_0= ruleBlock ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5280:1: (lv_block_1_0= ruleBlock )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5280:1: (lv_block_1_0= ruleBlock )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5281:3: lv_block_1_0= ruleBlock
						{

							newCompositeNode(grammarAccess.getFinalClauseAccess().getBlockBlockParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleBlock_in_ruleFinalClause11571);
							lv_block_1_0 = ruleBlock();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getFinalClauseRule());
							}
							set(
									current,
									"block",
									lv_block_1_0,
									"Block");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleFinalClause"


	// $ANTLR start "entryRuleSwitchStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5305:1: entryRuleSwitchStatement returns [EObject current=null] :
	// iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
	public final EObject entryRuleSwitchStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSwitchStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5306:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5307:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
			{
				newCompositeNode(grammarAccess.getSwitchStatementRule());
				pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement11607);
				iv_ruleSwitchStatement = ruleSwitchStatement();

				state._fsp--;

				current = iv_ruleSwitchStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSwitchStatement11617);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSwitchStatement"


	// $ANTLR start "ruleSwitchStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5314:1: ruleSwitchStatement returns [EObject current=null] :
	// (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}' ) ;
	public final EObject ruleSwitchStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token otherlv_4 = null;
		Token otherlv_7 = null;
		EObject lv_expression_2_0 = null;

		EObject lv_switchClause_5_0 = null;

		EObject lv_defaultClause_6_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5317:28: ( (otherlv_0= 'switch' otherlv_1= '(' (
			// (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5318:1: (otherlv_0= 'switch' otherlv_1= '(' (
			// (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5318:1: (otherlv_0= 'switch' otherlv_1= '(' (
				// (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5318:3: otherlv_0= 'switch' otherlv_1= '(' (
				// (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}'
				{
					otherlv_0 = (Token) match(input, 70, FOLLOW_70_in_ruleSwitchStatement11654);

					newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());

					otherlv_1 = (Token) match(input, 21, FOLLOW_21_in_ruleSwitchStatement11666);

					newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5326:1: ( (lv_expression_2_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5327:1: (lv_expression_2_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5327:1: (lv_expression_2_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5328:3: lv_expression_2_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getSwitchStatementAccess().getExpressionExpressionParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleSwitchStatement11687);
							lv_expression_2_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
							}
							set(
									current,
									"expression",
									lv_expression_2_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_3 = (Token) match(input, 22, FOLLOW_22_in_ruleSwitchStatement11699);

					newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());

					otherlv_4 = (Token) match(input, 57, FOLLOW_57_in_ruleSwitchStatement11711);

					newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5352:1: ( (lv_switchClause_5_0= ruleSwitchClause )
					// )*
					loop75: do {
						int alt75 = 2;
						int LA75_0 = input.LA(1);

						if ((LA75_0 == 71)) {
							alt75 = 1;
						}


						switch (alt75) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5353:1: (lv_switchClause_5_0= ruleSwitchClause )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5353:1: (lv_switchClause_5_0=
							// ruleSwitchClause )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5354:3: lv_switchClause_5_0=
							// ruleSwitchClause
							{

								newCompositeNode(grammarAccess.getSwitchStatementAccess().getSwitchClauseSwitchClauseParserRuleCall_5_0());

								pushFollow(FOLLOW_ruleSwitchClause_in_ruleSwitchStatement11732);
								lv_switchClause_5_0 = ruleSwitchClause();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
								}
								add(
										current,
										"switchClause",
										lv_switchClause_5_0,
										"SwitchClause");
								afterParserOrEnumRuleCall();


							}


						}
							break;

						default:
							break loop75;
						}
					} while (true);

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5370:3: ( (lv_defaultClause_6_0=
					// ruleSwitchDefaultClause ) )?
					int alt76 = 2;
					int LA76_0 = input.LA(1);

					if ((LA76_0 == 72)) {
						alt76 = 1;
					}
					switch (alt76) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5371:1: (lv_defaultClause_6_0=
					// ruleSwitchDefaultClause )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5371:1: (lv_defaultClause_6_0=
						// ruleSwitchDefaultClause )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5372:3: lv_defaultClause_6_0=
						// ruleSwitchDefaultClause
						{

							newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultClauseSwitchDefaultClauseParserRuleCall_6_0());

							pushFollow(FOLLOW_ruleSwitchDefaultClause_in_ruleSwitchStatement11754);
							lv_defaultClause_6_0 = ruleSwitchDefaultClause();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
							}
							set(
									current,
									"defaultClause",
									lv_defaultClause_6_0,
									"SwitchDefaultClause");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					otherlv_7 = (Token) match(input, 59, FOLLOW_59_in_ruleSwitchStatement11767);

					newLeafNode(otherlv_7, grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_7());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSwitchStatement"


	// $ANTLR start "entryRuleSwitchClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5400:1: entryRuleSwitchClause returns [EObject current=null] :
	// iv_ruleSwitchClause= ruleSwitchClause EOF ;
	public final EObject entryRuleSwitchClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSwitchClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5401:2: (iv_ruleSwitchClause= ruleSwitchClause EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5402:2: iv_ruleSwitchClause= ruleSwitchClause EOF
			{
				newCompositeNode(grammarAccess.getSwitchClauseRule());
				pushFollow(FOLLOW_ruleSwitchClause_in_entryRuleSwitchClause11803);
				iv_ruleSwitchClause = ruleSwitchClause();

				state._fsp--;

				current = iv_ruleSwitchClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSwitchClause11813);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSwitchClause"


	// $ANTLR start "ruleSwitchClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5409:1: ruleSwitchClause returns [EObject current=null] : ( (
	// (lv_switchCase_0_0= ruleSwitchCase ) ) ( (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) ) ;
	public final EObject ruleSwitchClause() throws RecognitionException {
		EObject current = null;

		EObject lv_switchCase_0_0 = null;

		EObject lv_switchCase_1_0 = null;

		EObject lv_statementSequence_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5412:28: ( ( ( (lv_switchCase_0_0= ruleSwitchCase ) ) (
			// (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5413:1: ( ( (lv_switchCase_0_0= ruleSwitchCase ) ) (
			// (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5413:1: ( ( (lv_switchCase_0_0= ruleSwitchCase ) ) (
				// (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5413:2: ( (lv_switchCase_0_0= ruleSwitchCase ) ) (
				// (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5413:2: ( (lv_switchCase_0_0= ruleSwitchCase ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5414:1: (lv_switchCase_0_0= ruleSwitchCase )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5414:1: (lv_switchCase_0_0= ruleSwitchCase )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5415:3: lv_switchCase_0_0= ruleSwitchCase
						{

							newCompositeNode(grammarAccess.getSwitchClauseAccess().getSwitchCaseSwitchCaseParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitchClause11859);
							lv_switchCase_0_0 = ruleSwitchCase();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSwitchClauseRule());
							}
							add(
									current,
									"switchCase",
									lv_switchCase_0_0,
									"SwitchCase");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5431:2: ( (lv_switchCase_1_0= ruleSwitchCase ) )*
					loop77: do {
						int alt77 = 2;
						int LA77_0 = input.LA(1);

						if ((LA77_0 == 71)) {
							alt77 = 1;
						}


						switch (alt77) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5432:1: (lv_switchCase_1_0= ruleSwitchCase )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5432:1: (lv_switchCase_1_0= ruleSwitchCase )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5433:3: lv_switchCase_1_0= ruleSwitchCase
							{

								newCompositeNode(grammarAccess.getSwitchClauseAccess().getSwitchCaseSwitchCaseParserRuleCall_1_0());

								pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitchClause11880);
								lv_switchCase_1_0 = ruleSwitchCase();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getSwitchClauseRule());
								}
								add(
										current,
										"switchCase",
										lv_switchCase_1_0,
										"SwitchCase");
								afterParserOrEnumRuleCall();


							}


						}
							break;

						default:
							break loop77;
						}
					} while (true);

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5449:3: ( (lv_statementSequence_2_0=
					// ruleNonEmptyStatementSequence ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5450:1: (lv_statementSequence_2_0=
					// ruleNonEmptyStatementSequence )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5450:1: (lv_statementSequence_2_0=
						// ruleNonEmptyStatementSequence )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5451:3: lv_statementSequence_2_0=
						// ruleNonEmptyStatementSequence
						{

							newCompositeNode(grammarAccess.getSwitchClauseAccess().getStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleNonEmptyStatementSequence_in_ruleSwitchClause11902);
							lv_statementSequence_2_0 = ruleNonEmptyStatementSequence();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSwitchClauseRule());
							}
							set(
									current,
									"statementSequence",
									lv_statementSequence_2_0,
									"NonEmptyStatementSequence");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSwitchClause"


	// $ANTLR start "entryRuleSwitchCase"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5475:1: entryRuleSwitchCase returns [EObject current=null] :
	// iv_ruleSwitchCase= ruleSwitchCase EOF ;
	public final EObject entryRuleSwitchCase() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSwitchCase = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5476:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5477:2: iv_ruleSwitchCase= ruleSwitchCase EOF
			{
				newCompositeNode(grammarAccess.getSwitchCaseRule());
				pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase11938);
				iv_ruleSwitchCase = ruleSwitchCase();

				state._fsp--;

				current = iv_ruleSwitchCase;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSwitchCase11948);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSwitchCase"


	// $ANTLR start "ruleSwitchCase"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5484:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0=
	// 'case' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ':' ) ;
	public final EObject ruleSwitchCase() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		EObject lv_expression_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5487:28: ( (otherlv_0= 'case' ( (lv_expression_1_0=
			// ruleExpression ) ) otherlv_2= ':' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5488:1: (otherlv_0= 'case' ( (lv_expression_1_0=
			// ruleExpression ) ) otherlv_2= ':' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5488:1: (otherlv_0= 'case' ( (lv_expression_1_0=
				// ruleExpression ) ) otherlv_2= ':' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5488:3: otherlv_0= 'case' ( (lv_expression_1_0=
				// ruleExpression ) ) otherlv_2= ':'
				{
					otherlv_0 = (Token) match(input, 71, FOLLOW_71_in_ruleSwitchCase11985);

					newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getCaseKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5492:1: ( (lv_expression_1_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5493:1: (lv_expression_1_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5493:1: (lv_expression_1_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5494:3: lv_expression_1_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getSwitchCaseAccess().getExpressionExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleSwitchCase12006);
							lv_expression_1_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
							}
							set(
									current,
									"expression",
									lv_expression_1_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_2 = (Token) match(input, 24, FOLLOW_24_in_ruleSwitchCase12018);

					newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getColonKeyword_2());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSwitchCase"


	// $ANTLR start "entryRuleSwitchDefaultClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5522:1: entryRuleSwitchDefaultClause returns [EObject current=null]
	// : iv_ruleSwitchDefaultClause= ruleSwitchDefaultClause EOF ;
	public final EObject entryRuleSwitchDefaultClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSwitchDefaultClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5523:2: (iv_ruleSwitchDefaultClause= ruleSwitchDefaultClause
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5524:2: iv_ruleSwitchDefaultClause= ruleSwitchDefaultClause
			// EOF
			{
				newCompositeNode(grammarAccess.getSwitchDefaultClauseRule());
				pushFollow(FOLLOW_ruleSwitchDefaultClause_in_entryRuleSwitchDefaultClause12054);
				iv_ruleSwitchDefaultClause = ruleSwitchDefaultClause();

				state._fsp--;

				current = iv_ruleSwitchDefaultClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSwitchDefaultClause12064);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSwitchDefaultClause"


	// $ANTLR start "ruleSwitchDefaultClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5531:1: ruleSwitchDefaultClause returns [EObject current=null] :
	// (otherlv_0= 'default' otherlv_1= ':' ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) ) ;
	public final EObject ruleSwitchDefaultClause() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		EObject lv_statementSequence_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5534:28: ( (otherlv_0= 'default' otherlv_1= ':' (
			// (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5535:1: (otherlv_0= 'default' otherlv_1= ':' (
			// (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5535:1: (otherlv_0= 'default' otherlv_1= ':' (
				// (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5535:3: otherlv_0= 'default' otherlv_1= ':' (
				// (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) )
				{
					otherlv_0 = (Token) match(input, 72, FOLLOW_72_in_ruleSwitchDefaultClause12101);

					newLeafNode(otherlv_0, grammarAccess.getSwitchDefaultClauseAccess().getDefaultKeyword_0());

					otherlv_1 = (Token) match(input, 24, FOLLOW_24_in_ruleSwitchDefaultClause12113);

					newLeafNode(otherlv_1, grammarAccess.getSwitchDefaultClauseAccess().getColonKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5543:1: ( (lv_statementSequence_2_0=
					// ruleNonEmptyStatementSequence ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5544:1: (lv_statementSequence_2_0=
					// ruleNonEmptyStatementSequence )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5544:1: (lv_statementSequence_2_0=
						// ruleNonEmptyStatementSequence )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5545:3: lv_statementSequence_2_0=
						// ruleNonEmptyStatementSequence
						{

							newCompositeNode(grammarAccess.getSwitchDefaultClauseAccess().getStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleNonEmptyStatementSequence_in_ruleSwitchDefaultClause12134);
							lv_statementSequence_2_0 = ruleNonEmptyStatementSequence();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSwitchDefaultClauseRule());
							}
							set(
									current,
									"statementSequence",
									lv_statementSequence_2_0,
									"NonEmptyStatementSequence");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSwitchDefaultClause"


	// $ANTLR start "entryRuleNonEmptyStatementSequence"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5569:1: entryRuleNonEmptyStatementSequence returns [EObject
	// current=null] : iv_ruleNonEmptyStatementSequence= ruleNonEmptyStatementSequence EOF ;
	public final EObject entryRuleNonEmptyStatementSequence() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNonEmptyStatementSequence = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5570:2: (iv_ruleNonEmptyStatementSequence=
			// ruleNonEmptyStatementSequence EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5571:2: iv_ruleNonEmptyStatementSequence=
			// ruleNonEmptyStatementSequence EOF
			{
				newCompositeNode(grammarAccess.getNonEmptyStatementSequenceRule());
				pushFollow(FOLLOW_ruleNonEmptyStatementSequence_in_entryRuleNonEmptyStatementSequence12170);
				iv_ruleNonEmptyStatementSequence = ruleNonEmptyStatementSequence();

				state._fsp--;

				current = iv_ruleNonEmptyStatementSequence;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNonEmptyStatementSequence12180);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNonEmptyStatementSequence"


	// $ANTLR start "ruleNonEmptyStatementSequence"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5578:1: ruleNonEmptyStatementSequence returns [EObject current=null]
	// : ( (lv_statement_0_0= ruleDocumentedStatement ) )+ ;
	public final EObject ruleNonEmptyStatementSequence() throws RecognitionException {
		EObject current = null;

		EObject lv_statement_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5581:28: ( ( (lv_statement_0_0= ruleDocumentedStatement ) )+
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5582:1: ( (lv_statement_0_0= ruleDocumentedStatement ) )+
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5582:1: ( (lv_statement_0_0= ruleDocumentedStatement )
				// )+
				int cnt78 = 0;
				loop78: do {
					int alt78 = 2;
					int LA78_0 = input.LA(1);

					if (((LA78_0 >= RULE_ID && LA78_0 <= RULE_SL_COMMENT) || (LA78_0 >= 14 && LA78_0 <= 15) || (LA78_0 >= 54 && LA78_0 <= 57) || LA78_0 == 61 || (LA78_0 >= 64 && LA78_0 <= 67) || LA78_0 == 70 || (LA78_0 >= 73 && LA78_0 <= 75) || (LA78_0 >= 77 && LA78_0 <= 80))) {
						alt78 = 1;
					}


					switch (alt78) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5583:1: (lv_statement_0_0= ruleDocumentedStatement )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5583:1: (lv_statement_0_0=
						// ruleDocumentedStatement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5584:3: lv_statement_0_0=
						// ruleDocumentedStatement
						{

							newCompositeNode(grammarAccess.getNonEmptyStatementSequenceAccess().getStatementDocumentedStatementParserRuleCall_0());

							pushFollow(FOLLOW_ruleDocumentedStatement_in_ruleNonEmptyStatementSequence12225);
							lv_statement_0_0 = ruleDocumentedStatement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getNonEmptyStatementSequenceRule());
							}
							add(
									current,
									"statement",
									lv_statement_0_0,
									"DocumentedStatement");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					default:
						if (cnt78 >= 1) {
							break loop78;
						}
						EarlyExitException eee =
								new EarlyExitException(78, input);
						throw eee;
					}
					cnt78++;
				} while (true);


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleNonEmptyStatementSequence"


	// $ANTLR start "entryRuleWhileStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5608:1: entryRuleWhileStatement returns [EObject current=null] :
	// iv_ruleWhileStatement= ruleWhileStatement EOF ;
	public final EObject entryRuleWhileStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleWhileStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5609:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5610:2: iv_ruleWhileStatement= ruleWhileStatement EOF
			{
				newCompositeNode(grammarAccess.getWhileStatementRule());
				pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement12261);
				iv_ruleWhileStatement = ruleWhileStatement();

				state._fsp--;

				current = iv_ruleWhileStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleWhileStatement12271);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleWhileStatement"


	// $ANTLR start "ruleWhileStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5617:1: ruleWhileStatement returns [EObject current=null] :
	// (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
	public final EObject ruleWhileStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_condition_2_0 = null;

		EObject lv_block_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5620:28: ( (otherlv_0= 'while' otherlv_1= '(' (
			// (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5621:1: (otherlv_0= 'while' otherlv_1= '(' (
			// (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5621:1: (otherlv_0= 'while' otherlv_1= '(' (
				// (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5621:3: otherlv_0= 'while' otherlv_1= '(' (
				// (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
				{
					otherlv_0 = (Token) match(input, 73, FOLLOW_73_in_ruleWhileStatement12308);

					newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());

					otherlv_1 = (Token) match(input, 21, FOLLOW_21_in_ruleWhileStatement12320);

					newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5629:1: ( (lv_condition_2_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5630:1: (lv_condition_2_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5630:1: (lv_condition_2_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5631:3: lv_condition_2_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleWhileStatement12341);
							lv_condition_2_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getWhileStatementRule());
							}
							set(
									current,
									"condition",
									lv_condition_2_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_3 = (Token) match(input, 22, FOLLOW_22_in_ruleWhileStatement12353);

					newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5651:1: ( (lv_block_4_0= ruleBlock ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5652:1: (lv_block_4_0= ruleBlock )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5652:1: (lv_block_4_0= ruleBlock )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5653:3: lv_block_4_0= ruleBlock
						{

							newCompositeNode(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleBlock_in_ruleWhileStatement12374);
							lv_block_4_0 = ruleBlock();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getWhileStatementRule());
							}
							set(
									current,
									"block",
									lv_block_4_0,
									"Block");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleWhileStatement"


	// $ANTLR start "entryRuleDoStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5677:1: entryRuleDoStatement returns [EObject current=null] :
	// iv_ruleDoStatement= ruleDoStatement EOF ;
	public final EObject entryRuleDoStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleDoStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5678:2: (iv_ruleDoStatement= ruleDoStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5679:2: iv_ruleDoStatement= ruleDoStatement EOF
			{
				newCompositeNode(grammarAccess.getDoStatementRule());
				pushFollow(FOLLOW_ruleDoStatement_in_entryRuleDoStatement12410);
				iv_ruleDoStatement = ruleDoStatement();

				state._fsp--;

				current = iv_ruleDoStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleDoStatement12420);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleDoStatement"


	// $ANTLR start "ruleDoStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5686:1: ruleDoStatement returns [EObject current=null] : (otherlv_0=
	// 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
	public final EObject ruleDoStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		Token otherlv_6 = null;
		EObject lv_block_1_0 = null;

		EObject lv_condition_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5689:28: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) )
			// otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5690:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) )
			// otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5690:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) )
				// otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5690:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) )
				// otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';'
				{
					otherlv_0 = (Token) match(input, 74, FOLLOW_74_in_ruleDoStatement12457);

					newLeafNode(otherlv_0, grammarAccess.getDoStatementAccess().getDoKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5694:1: ( (lv_block_1_0= ruleBlock ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5695:1: (lv_block_1_0= ruleBlock )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5695:1: (lv_block_1_0= ruleBlock )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5696:3: lv_block_1_0= ruleBlock
						{

							newCompositeNode(grammarAccess.getDoStatementAccess().getBlockBlockParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleBlock_in_ruleDoStatement12478);
							lv_block_1_0 = ruleBlock();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getDoStatementRule());
							}
							set(
									current,
									"block",
									lv_block_1_0,
									"Block");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_2 = (Token) match(input, 73, FOLLOW_73_in_ruleDoStatement12490);

					newLeafNode(otherlv_2, grammarAccess.getDoStatementAccess().getWhileKeyword_2());

					otherlv_3 = (Token) match(input, 21, FOLLOW_21_in_ruleDoStatement12502);

					newLeafNode(otherlv_3, grammarAccess.getDoStatementAccess().getLeftParenthesisKeyword_3());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5720:1: ( (lv_condition_4_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5721:1: (lv_condition_4_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5721:1: (lv_condition_4_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5722:3: lv_condition_4_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getDoStatementAccess().getConditionExpressionParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleDoStatement12523);
							lv_condition_4_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getDoStatementRule());
							}
							set(
									current,
									"condition",
									lv_condition_4_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleDoStatement12535);

					newLeafNode(otherlv_5, grammarAccess.getDoStatementAccess().getRightParenthesisKeyword_5());

					otherlv_6 = (Token) match(input, 65, FOLLOW_65_in_ruleDoStatement12547);

					newLeafNode(otherlv_6, grammarAccess.getDoStatementAccess().getSemicolonKeyword_6());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleDoStatement"


	// $ANTLR start "entryRuleForStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5754:1: entryRuleForStatement returns [EObject current=null] :
	// iv_ruleForStatement= ruleForStatement EOF ;
	public final EObject entryRuleForStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleForStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5755:2: (iv_ruleForStatement= ruleForStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5756:2: iv_ruleForStatement= ruleForStatement EOF
			{
				newCompositeNode(grammarAccess.getForStatementRule());
				pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement12583);
				iv_ruleForStatement = ruleForStatement();

				state._fsp--;

				current = iv_ruleForStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleForStatement12593);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleForStatement"


	// $ANTLR start "ruleForStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5763:1: ruleForStatement returns [EObject current=null] :
	// (otherlv_0= 'for' otherlv_1= '(' ( (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
	public final EObject ruleForStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_control_2_0 = null;

		EObject lv_block_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5766:28: ( (otherlv_0= 'for' otherlv_1= '(' (
			// (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5767:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_control_2_0=
			// ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5767:1: (otherlv_0= 'for' otherlv_1= '(' (
				// (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5767:3: otherlv_0= 'for' otherlv_1= '(' (
				// (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
				{
					otherlv_0 = (Token) match(input, 75, FOLLOW_75_in_ruleForStatement12630);

					newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());

					otherlv_1 = (Token) match(input, 21, FOLLOW_21_in_ruleForStatement12642);

					newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5775:1: ( (lv_control_2_0= ruleForControl ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5776:1: (lv_control_2_0= ruleForControl )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5776:1: (lv_control_2_0= ruleForControl )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5777:3: lv_control_2_0= ruleForControl
						{

							newCompositeNode(grammarAccess.getForStatementAccess().getControlForControlParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleForControl_in_ruleForStatement12663);
							lv_control_2_0 = ruleForControl();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getForStatementRule());
							}
							set(
									current,
									"control",
									lv_control_2_0,
									"ForControl");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_3 = (Token) match(input, 22, FOLLOW_22_in_ruleForStatement12675);

					newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_3());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5797:1: ( (lv_block_4_0= ruleBlock ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5798:1: (lv_block_4_0= ruleBlock )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5798:1: (lv_block_4_0= ruleBlock )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5799:3: lv_block_4_0= ruleBlock
						{

							newCompositeNode(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleBlock_in_ruleForStatement12696);
							lv_block_4_0 = ruleBlock();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getForStatementRule());
							}
							set(
									current,
									"block",
									lv_block_4_0,
									"Block");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleForStatement"


	// $ANTLR start "entryRuleForControl"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5823:1: entryRuleForControl returns [EObject current=null] :
	// iv_ruleForControl= ruleForControl EOF ;
	public final EObject entryRuleForControl() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleForControl = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5824:2: (iv_ruleForControl= ruleForControl EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5825:2: iv_ruleForControl= ruleForControl EOF
			{
				newCompositeNode(grammarAccess.getForControlRule());
				pushFollow(FOLLOW_ruleForControl_in_entryRuleForControl12732);
				iv_ruleForControl = ruleForControl();

				state._fsp--;

				current = iv_ruleForControl;
				match(input, EOF, FOLLOW_EOF_in_entryRuleForControl12742);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleForControl"


	// $ANTLR start "ruleForControl"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5832:1: ruleForControl returns [EObject current=null] : ( (
	// (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )* ) ;
	public final EObject ruleForControl() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_loopVariableDefinition_0_0 = null;

		EObject lv_loopVariableDefinition_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5835:28: ( ( ( (lv_loopVariableDefinition_0_0=
			// ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5836:1: ( ( (lv_loopVariableDefinition_0_0=
			// ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5836:1: ( ( (lv_loopVariableDefinition_0_0=
				// ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5836:2: ( (lv_loopVariableDefinition_0_0=
				// ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5836:2: ( (lv_loopVariableDefinition_0_0=
					// ruleLoopVariableDefinition ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5837:1: (lv_loopVariableDefinition_0_0=
					// ruleLoopVariableDefinition )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5837:1: (lv_loopVariableDefinition_0_0=
						// ruleLoopVariableDefinition )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5838:3: lv_loopVariableDefinition_0_0=
						// ruleLoopVariableDefinition
						{

							newCompositeNode(grammarAccess.getForControlAccess().getLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleLoopVariableDefinition_in_ruleForControl12788);
							lv_loopVariableDefinition_0_0 = ruleLoopVariableDefinition();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getForControlRule());
							}
							add(
									current,
									"loopVariableDefinition",
									lv_loopVariableDefinition_0_0,
									"LoopVariableDefinition");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5854:2: (otherlv_1= ',' (
					// (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )*
					loop79: do {
						int alt79 = 2;
						int LA79_0 = input.LA(1);

						if ((LA79_0 == 18)) {
							alt79 = 1;
						}


						switch (alt79) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5854:4: otherlv_1= ',' (
						// (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) )
						{
							otherlv_1 = (Token) match(input, 18, FOLLOW_18_in_ruleForControl12801);

							newLeafNode(otherlv_1, grammarAccess.getForControlAccess().getCommaKeyword_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5858:1: ( (lv_loopVariableDefinition_2_0=
							// ruleLoopVariableDefinition ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5859:1: (lv_loopVariableDefinition_2_0=
							// ruleLoopVariableDefinition )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5859:1: (lv_loopVariableDefinition_2_0=
								// ruleLoopVariableDefinition )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5860:3: lv_loopVariableDefinition_2_0=
								// ruleLoopVariableDefinition
								{

									newCompositeNode(grammarAccess.getForControlAccess().getLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleLoopVariableDefinition_in_ruleForControl12822);
									lv_loopVariableDefinition_2_0 = ruleLoopVariableDefinition();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getForControlRule());
									}
									add(
											current,
											"loopVariableDefinition",
											lv_loopVariableDefinition_2_0,
											"LoopVariableDefinition");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop79;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleForControl"


	// $ANTLR start "entryRuleLoopVariableDefinition"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5884:1: entryRuleLoopVariableDefinition returns [EObject
	// current=null] : iv_ruleLoopVariableDefinition= ruleLoopVariableDefinition EOF ;
	public final EObject entryRuleLoopVariableDefinition() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleLoopVariableDefinition = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5885:2: (iv_ruleLoopVariableDefinition=
			// ruleLoopVariableDefinition EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5886:2: iv_ruleLoopVariableDefinition=
			// ruleLoopVariableDefinition EOF
			{
				newCompositeNode(grammarAccess.getLoopVariableDefinitionRule());
				pushFollow(FOLLOW_ruleLoopVariableDefinition_in_entryRuleLoopVariableDefinition12860);
				iv_ruleLoopVariableDefinition = ruleLoopVariableDefinition();

				state._fsp--;

				current = iv_ruleLoopVariableDefinition;
				match(input, EOF, FOLLOW_EOF_in_entryRuleLoopVariableDefinition12870);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleLoopVariableDefinition"


	// $ANTLR start "ruleLoopVariableDefinition"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5893:1: ruleLoopVariableDefinition returns [EObject current=null] :
	// ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? ) | ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' (
	// (lv_expression_8_0= ruleExpression ) ) ) ) ;
	public final EObject ruleLoopVariableDefinition() throws RecognitionException {
		EObject current = null;

		Token lv_name_0_0 = null;
		Token otherlv_1 = null;
		Token otherlv_3 = null;
		Token lv_name_6_0 = null;
		Token otherlv_7 = null;
		EObject lv_expression1_2_0 = null;

		EObject lv_expression2_4_0 = null;

		EObject lv_type_5_0 = null;

		EObject lv_expression_8_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5896:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' (
			// (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? ) | ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) ) )
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5897:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' (
			// (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? ) | ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5897:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in'
				// ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? ) | ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression )
				// ) ) )
				int alt81 = 2;
				int LA81_0 = input.LA(1);

				if ((LA81_0 == RULE_ID)) {
					int LA81_1 = input.LA(2);

					if ((LA81_1 == 76)) {
						alt81 = 1;
					}
					else if ((LA81_1 == RULE_ID || (LA81_1 >= 16 && LA81_1 <= 17))) {
						alt81 = 2;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 81, 1, input);

						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 81, 0, input);

					throw nvae;
				}
				switch (alt81) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5897:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' (
				// (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5897:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1=
					// 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5897:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in'
					// ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )?
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5897:3: ( (lv_name_0_0= RULE_ID ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5898:1: (lv_name_0_0= RULE_ID )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5898:1: (lv_name_0_0= RULE_ID )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5899:3: lv_name_0_0= RULE_ID
							{
								lv_name_0_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleLoopVariableDefinition12913);

								newLeafNode(lv_name_0_0, grammarAccess.getLoopVariableDefinitionAccess().getNameIDTerminalRuleCall_0_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getLoopVariableDefinitionRule());
								}
								setWithLastConsumed(
										current,
										"name",
										lv_name_0_0,
										"ID");


							}


						}

						otherlv_1 = (Token) match(input, 76, FOLLOW_76_in_ruleLoopVariableDefinition12930);

						newLeafNode(otherlv_1, grammarAccess.getLoopVariableDefinitionAccess().getInKeyword_0_1());

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5919:1: ( (lv_expression1_2_0= ruleExpression )
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5920:1: (lv_expression1_2_0= ruleExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5920:1: (lv_expression1_2_0= ruleExpression
							// )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5921:3: lv_expression1_2_0= ruleExpression
							{

								newCompositeNode(grammarAccess.getLoopVariableDefinitionAccess().getExpression1ExpressionParserRuleCall_0_2_0());

								pushFollow(FOLLOW_ruleExpression_in_ruleLoopVariableDefinition12951);
								lv_expression1_2_0 = ruleExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLoopVariableDefinitionRule());
								}
								set(
										current,
										"expression1",
										lv_expression1_2_0,
										"Expression");
								afterParserOrEnumRuleCall();


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5937:2: (otherlv_3= '..' ( (lv_expression2_4_0=
						// ruleExpression ) ) )?
						int alt80 = 2;
						int LA80_0 = input.LA(1);

						if ((LA80_0 == 58)) {
							alt80 = 1;
						}
						switch (alt80) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5937:4: otherlv_3= '..' ( (lv_expression2_4_0=
						// ruleExpression ) )
						{
							otherlv_3 = (Token) match(input, 58, FOLLOW_58_in_ruleLoopVariableDefinition12964);

							newLeafNode(otherlv_3, grammarAccess.getLoopVariableDefinitionAccess().getFullStopFullStopKeyword_0_3_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5941:1: ( (lv_expression2_4_0=
							// ruleExpression ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5942:1: (lv_expression2_4_0= ruleExpression
							// )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5942:1: (lv_expression2_4_0=
								// ruleExpression )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5943:3: lv_expression2_4_0=
								// ruleExpression
								{

									newCompositeNode(grammarAccess.getLoopVariableDefinitionAccess().getExpression2ExpressionParserRuleCall_0_3_1_0());

									pushFollow(FOLLOW_ruleExpression_in_ruleLoopVariableDefinition12985);
									lv_expression2_4_0 = ruleExpression();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getLoopVariableDefinitionRule());
									}
									set(
											current,
											"expression2",
											lv_expression2_4_0,
											"Expression");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						}


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5960:6: ( ( (lv_type_5_0= ruleQualifiedNameWithBinding )
				// ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5960:6: ( ( (lv_type_5_0=
					// ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5960:7: ( (lv_type_5_0= ruleQualifiedNameWithBinding
					// ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5960:7: ( (lv_type_5_0=
						// ruleQualifiedNameWithBinding ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5961:1: (lv_type_5_0=
						// ruleQualifiedNameWithBinding )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5961:1: (lv_type_5_0=
							// ruleQualifiedNameWithBinding )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5962:3: lv_type_5_0=
							// ruleQualifiedNameWithBinding
							{

								newCompositeNode(grammarAccess.getLoopVariableDefinitionAccess().getTypeQualifiedNameWithBindingParserRuleCall_1_0_0());

								pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleLoopVariableDefinition13016);
								lv_type_5_0 = ruleQualifiedNameWithBinding();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLoopVariableDefinitionRule());
								}
								set(
										current,
										"type",
										lv_type_5_0,
										"QualifiedNameWithBinding");
								afterParserOrEnumRuleCall();


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5978:2: ( (lv_name_6_0= RULE_ID ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5979:1: (lv_name_6_0= RULE_ID )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5979:1: (lv_name_6_0= RULE_ID )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:5980:3: lv_name_6_0= RULE_ID
							{
								lv_name_6_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleLoopVariableDefinition13033);

								newLeafNode(lv_name_6_0, grammarAccess.getLoopVariableDefinitionAccess().getNameIDTerminalRuleCall_1_1_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getLoopVariableDefinitionRule());
								}
								setWithLastConsumed(
										current,
										"name",
										lv_name_6_0,
										"ID");


							}


						}

						otherlv_7 = (Token) match(input, 24, FOLLOW_24_in_ruleLoopVariableDefinition13050);

						newLeafNode(otherlv_7, grammarAccess.getLoopVariableDefinitionAccess().getColonKeyword_1_2());

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6000:1: ( (lv_expression_8_0= ruleExpression ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6001:1: (lv_expression_8_0= ruleExpression )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6001:1: (lv_expression_8_0= ruleExpression )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6002:3: lv_expression_8_0= ruleExpression
							{

								newCompositeNode(grammarAccess.getLoopVariableDefinitionAccess().getExpressionExpressionParserRuleCall_1_3_0());

								pushFollow(FOLLOW_ruleExpression_in_ruleLoopVariableDefinition13071);
								lv_expression_8_0 = ruleExpression();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getLoopVariableDefinitionRule());
								}
								set(
										current,
										"expression",
										lv_expression_8_0,
										"Expression");
								afterParserOrEnumRuleCall();


							}


						}


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleLoopVariableDefinition"


	// $ANTLR start "entryRuleBreakStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6026:1: entryRuleBreakStatement returns [EObject current=null] :
	// iv_ruleBreakStatement= ruleBreakStatement EOF ;
	public final EObject entryRuleBreakStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBreakStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6027:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6028:2: iv_ruleBreakStatement= ruleBreakStatement EOF
			{
				newCompositeNode(grammarAccess.getBreakStatementRule());
				pushFollow(FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement13108);
				iv_ruleBreakStatement = ruleBreakStatement();

				state._fsp--;

				current = iv_ruleBreakStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleBreakStatement13118);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleBreakStatement"


	// $ANTLR start "ruleBreakStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6035:1: ruleBreakStatement returns [EObject current=null] : ( ()
	// otherlv_1= 'break' otherlv_2= ';' ) ;
	public final EObject ruleBreakStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_2 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6038:28: ( ( () otherlv_1= 'break' otherlv_2= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6039:1: ( () otherlv_1= 'break' otherlv_2= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6039:1: ( () otherlv_1= 'break' otherlv_2= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6039:2: () otherlv_1= 'break' otherlv_2= ';'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6039:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6040:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 77, FOLLOW_77_in_ruleBreakStatement13164);

					newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());

					otherlv_2 = (Token) match(input, 65, FOLLOW_65_in_ruleBreakStatement13176);

					newLeafNode(otherlv_2, grammarAccess.getBreakStatementAccess().getSemicolonKeyword_2());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleBreakStatement"


	// $ANTLR start "entryRuleReturnStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6061:1: entryRuleReturnStatement returns [EObject current=null] :
	// iv_ruleReturnStatement= ruleReturnStatement EOF ;
	public final EObject entryRuleReturnStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleReturnStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6062:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6063:2: iv_ruleReturnStatement= ruleReturnStatement EOF
			{
				newCompositeNode(grammarAccess.getReturnStatementRule());
				pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement13212);
				iv_ruleReturnStatement = ruleReturnStatement();

				state._fsp--;

				current = iv_ruleReturnStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleReturnStatement13222);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleReturnStatement"


	// $ANTLR start "ruleReturnStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6070:1: ruleReturnStatement returns [EObject current=null] :
	// (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
	public final EObject ruleReturnStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		EObject lv_expression_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6073:28: ( (otherlv_0= 'return' ( (lv_expression_1_0=
			// ruleExpression ) ) otherlv_2= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6074:1: (otherlv_0= 'return' ( (lv_expression_1_0=
			// ruleExpression ) ) otherlv_2= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6074:1: (otherlv_0= 'return' ( (lv_expression_1_0=
				// ruleExpression ) ) otherlv_2= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6074:3: otherlv_0= 'return' ( (lv_expression_1_0=
				// ruleExpression ) ) otherlv_2= ';'
				{
					otherlv_0 = (Token) match(input, 78, FOLLOW_78_in_ruleReturnStatement13259);

					newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6078:1: ( (lv_expression_1_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6079:1: (lv_expression_1_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6079:1: (lv_expression_1_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6080:3: lv_expression_1_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement13280);
							lv_expression_1_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getReturnStatementRule());
							}
							set(
									current,
									"expression",
									lv_expression_1_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_2 = (Token) match(input, 65, FOLLOW_65_in_ruleReturnStatement13292);

					newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_2());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleReturnStatement"


	// $ANTLR start "entryRuleAcceptStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6108:1: entryRuleAcceptStatement returns [EObject current=null] :
	// iv_ruleAcceptStatement= ruleAcceptStatement EOF ;
	public final EObject entryRuleAcceptStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAcceptStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6109:2: (iv_ruleAcceptStatement= ruleAcceptStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6110:2: iv_ruleAcceptStatement= ruleAcceptStatement EOF
			{
				newCompositeNode(grammarAccess.getAcceptStatementRule());
				pushFollow(FOLLOW_ruleAcceptStatement_in_entryRuleAcceptStatement13328);
				iv_ruleAcceptStatement = ruleAcceptStatement();

				state._fsp--;

				current = iv_ruleAcceptStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAcceptStatement13338);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAcceptStatement"


	// $ANTLR start "ruleAcceptStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6117:1: ruleAcceptStatement returns [EObject current=null] : ( (
	// (lv_clause_0_0= ruleAcceptClause ) ) ( ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) ) ) ;
	public final EObject ruleAcceptStatement() throws RecognitionException {
		EObject current = null;

		EObject lv_clause_0_0 = null;

		EObject lv_simpleAccept_1_0 = null;

		EObject lv_compoundAccept_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6120:28: ( ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( (
			// (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6121:1: ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( (
			// (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6121:1: ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( (
				// (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6121:2: ( (lv_clause_0_0= ruleAcceptClause ) ) ( (
				// (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6121:2: ( (lv_clause_0_0= ruleAcceptClause ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6122:1: (lv_clause_0_0= ruleAcceptClause )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6122:1: (lv_clause_0_0= ruleAcceptClause )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6123:3: lv_clause_0_0= ruleAcceptClause
						{

							newCompositeNode(grammarAccess.getAcceptStatementAccess().getClauseAcceptClauseParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleAcceptClause_in_ruleAcceptStatement13384);
							lv_clause_0_0 = ruleAcceptClause();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAcceptStatementRule());
							}
							set(
									current,
									"clause",
									lv_clause_0_0,
									"AcceptClause");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6139:2: ( ( (lv_simpleAccept_1_0=
					// ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) )
					int alt82 = 2;
					int LA82_0 = input.LA(1);

					if ((LA82_0 == 65)) {
						alt82 = 1;
					}
					else if ((LA82_0 == 57)) {
						alt82 = 2;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 82, 0, input);

						throw nvae;
					}
					switch (alt82) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6139:3: ( (lv_simpleAccept_1_0=
					// ruleSimpleAcceptStatementCompletion ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6139:3: ( (lv_simpleAccept_1_0=
						// ruleSimpleAcceptStatementCompletion ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6140:1: (lv_simpleAccept_1_0=
						// ruleSimpleAcceptStatementCompletion )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6140:1: (lv_simpleAccept_1_0=
							// ruleSimpleAcceptStatementCompletion )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6141:3: lv_simpleAccept_1_0=
							// ruleSimpleAcceptStatementCompletion
							{

								newCompositeNode(grammarAccess.getAcceptStatementAccess().getSimpleAcceptSimpleAcceptStatementCompletionParserRuleCall_1_0_0());

								pushFollow(FOLLOW_ruleSimpleAcceptStatementCompletion_in_ruleAcceptStatement13406);
								lv_simpleAccept_1_0 = ruleSimpleAcceptStatementCompletion();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getAcceptStatementRule());
								}
								set(
										current,
										"simpleAccept",
										lv_simpleAccept_1_0,
										"SimpleAcceptStatementCompletion");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6158:6: ( (lv_compoundAccept_2_0=
					// ruleCompoundAcceptStatementCompletion ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6158:6: ( (lv_compoundAccept_2_0=
						// ruleCompoundAcceptStatementCompletion ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6159:1: (lv_compoundAccept_2_0=
						// ruleCompoundAcceptStatementCompletion )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6159:1: (lv_compoundAccept_2_0=
							// ruleCompoundAcceptStatementCompletion )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6160:3: lv_compoundAccept_2_0=
							// ruleCompoundAcceptStatementCompletion
							{

								newCompositeNode(grammarAccess.getAcceptStatementAccess().getCompoundAcceptCompoundAcceptStatementCompletionParserRuleCall_1_1_0());

								pushFollow(FOLLOW_ruleCompoundAcceptStatementCompletion_in_ruleAcceptStatement13433);
								lv_compoundAccept_2_0 = ruleCompoundAcceptStatementCompletion();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getAcceptStatementRule());
								}
								set(
										current,
										"compoundAccept",
										lv_compoundAccept_2_0,
										"CompoundAcceptStatementCompletion");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAcceptStatement"


	// $ANTLR start "entryRuleSimpleAcceptStatementCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6184:1: entryRuleSimpleAcceptStatementCompletion returns [EObject
	// current=null] : iv_ruleSimpleAcceptStatementCompletion= ruleSimpleAcceptStatementCompletion EOF ;
	public final EObject entryRuleSimpleAcceptStatementCompletion() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSimpleAcceptStatementCompletion = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6185:2: (iv_ruleSimpleAcceptStatementCompletion=
			// ruleSimpleAcceptStatementCompletion EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6186:2: iv_ruleSimpleAcceptStatementCompletion=
			// ruleSimpleAcceptStatementCompletion EOF
			{
				newCompositeNode(grammarAccess.getSimpleAcceptStatementCompletionRule());
				pushFollow(FOLLOW_ruleSimpleAcceptStatementCompletion_in_entryRuleSimpleAcceptStatementCompletion13470);
				iv_ruleSimpleAcceptStatementCompletion = ruleSimpleAcceptStatementCompletion();

				state._fsp--;

				current = iv_ruleSimpleAcceptStatementCompletion;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSimpleAcceptStatementCompletion13480);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSimpleAcceptStatementCompletion"


	// $ANTLR start "ruleSimpleAcceptStatementCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6193:1: ruleSimpleAcceptStatementCompletion returns [EObject
	// current=null] : ( () otherlv_1= ';' ) ;
	public final EObject ruleSimpleAcceptStatementCompletion() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6196:28: ( ( () otherlv_1= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6197:1: ( () otherlv_1= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6197:1: ( () otherlv_1= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6197:2: () otherlv_1= ';'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6197:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6198:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getSimpleAcceptStatementCompletionAccess().getSimpleAcceptStatementCompletionAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 65, FOLLOW_65_in_ruleSimpleAcceptStatementCompletion13526);

					newLeafNode(otherlv_1, grammarAccess.getSimpleAcceptStatementCompletionAccess().getSemicolonKeyword_1());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSimpleAcceptStatementCompletion"


	// $ANTLR start "entryRuleCompoundAcceptStatementCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6215:1: entryRuleCompoundAcceptStatementCompletion returns [EObject
	// current=null] : iv_ruleCompoundAcceptStatementCompletion= ruleCompoundAcceptStatementCompletion EOF ;
	public final EObject entryRuleCompoundAcceptStatementCompletion() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleCompoundAcceptStatementCompletion = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6216:2: (iv_ruleCompoundAcceptStatementCompletion=
			// ruleCompoundAcceptStatementCompletion EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6217:2: iv_ruleCompoundAcceptStatementCompletion=
			// ruleCompoundAcceptStatementCompletion EOF
			{
				newCompositeNode(grammarAccess.getCompoundAcceptStatementCompletionRule());
				pushFollow(FOLLOW_ruleCompoundAcceptStatementCompletion_in_entryRuleCompoundAcceptStatementCompletion13562);
				iv_ruleCompoundAcceptStatementCompletion = ruleCompoundAcceptStatementCompletion();

				state._fsp--;

				current = iv_ruleCompoundAcceptStatementCompletion;
				match(input, EOF, FOLLOW_EOF_in_entryRuleCompoundAcceptStatementCompletion13572);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleCompoundAcceptStatementCompletion"


	// $ANTLR start "ruleCompoundAcceptStatementCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6224:1: ruleCompoundAcceptStatementCompletion returns [EObject
	// current=null] : ( ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )* ) ;
	public final EObject ruleCompoundAcceptStatementCompletion() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_block_0_0 = null;

		EObject lv_acceptBlock_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6227:28: ( ( ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or'
			// ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6228:1: ( ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or' (
			// (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6228:1: ( ( (lv_block_0_0= ruleBlock ) ) (otherlv_1=
				// 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6228:2: ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or'
				// ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6228:2: ( (lv_block_0_0= ruleBlock ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6229:1: (lv_block_0_0= ruleBlock )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6229:1: (lv_block_0_0= ruleBlock )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6230:3: lv_block_0_0= ruleBlock
						{

							newCompositeNode(grammarAccess.getCompoundAcceptStatementCompletionAccess().getBlockBlockParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleBlock_in_ruleCompoundAcceptStatementCompletion13618);
							lv_block_0_0 = ruleBlock();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getCompoundAcceptStatementCompletionRule());
							}
							set(
									current,
									"block",
									lv_block_0_0,
									"Block");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6246:2: (otherlv_1= 'or' ( (lv_acceptBlock_2_0=
					// ruleAcceptBlock ) ) )*
					loop83: do {
						int alt83 = 2;
						int LA83_0 = input.LA(1);

						if ((LA83_0 == 69)) {
							alt83 = 1;
						}


						switch (alt83) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6246:4: otherlv_1= 'or' ( (lv_acceptBlock_2_0=
						// ruleAcceptBlock ) )
						{
							otherlv_1 = (Token) match(input, 69, FOLLOW_69_in_ruleCompoundAcceptStatementCompletion13631);

							newLeafNode(otherlv_1, grammarAccess.getCompoundAcceptStatementCompletionAccess().getOrKeyword_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6250:1: ( (lv_acceptBlock_2_0=
							// ruleAcceptBlock ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6251:1: (lv_acceptBlock_2_0= ruleAcceptBlock
							// )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6251:1: (lv_acceptBlock_2_0=
								// ruleAcceptBlock )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6252:3: lv_acceptBlock_2_0=
								// ruleAcceptBlock
								{

									newCompositeNode(grammarAccess.getCompoundAcceptStatementCompletionAccess().getAcceptBlockAcceptBlockParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleAcceptBlock_in_ruleCompoundAcceptStatementCompletion13652);
									lv_acceptBlock_2_0 = ruleAcceptBlock();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getCompoundAcceptStatementCompletionRule());
									}
									add(
											current,
											"acceptBlock",
											lv_acceptBlock_2_0,
											"AcceptBlock");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop83;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleCompoundAcceptStatementCompletion"


	// $ANTLR start "entryRuleAcceptBlock"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6276:1: entryRuleAcceptBlock returns [EObject current=null] :
	// iv_ruleAcceptBlock= ruleAcceptBlock EOF ;
	public final EObject entryRuleAcceptBlock() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAcceptBlock = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6277:2: (iv_ruleAcceptBlock= ruleAcceptBlock EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6278:2: iv_ruleAcceptBlock= ruleAcceptBlock EOF
			{
				newCompositeNode(grammarAccess.getAcceptBlockRule());
				pushFollow(FOLLOW_ruleAcceptBlock_in_entryRuleAcceptBlock13690);
				iv_ruleAcceptBlock = ruleAcceptBlock();

				state._fsp--;

				current = iv_ruleAcceptBlock;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAcceptBlock13700);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAcceptBlock"


	// $ANTLR start "ruleAcceptBlock"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6285:1: ruleAcceptBlock returns [EObject current=null] : ( (
	// (lv_clause_0_0= ruleAcceptClause ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
	public final EObject ruleAcceptBlock() throws RecognitionException {
		EObject current = null;

		EObject lv_clause_0_0 = null;

		EObject lv_block_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6288:28: ( ( ( (lv_clause_0_0= ruleAcceptClause ) ) (
			// (lv_block_1_0= ruleBlock ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6289:1: ( ( (lv_clause_0_0= ruleAcceptClause ) ) (
			// (lv_block_1_0= ruleBlock ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6289:1: ( ( (lv_clause_0_0= ruleAcceptClause ) ) (
				// (lv_block_1_0= ruleBlock ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6289:2: ( (lv_clause_0_0= ruleAcceptClause ) ) (
				// (lv_block_1_0= ruleBlock ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6289:2: ( (lv_clause_0_0= ruleAcceptClause ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6290:1: (lv_clause_0_0= ruleAcceptClause )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6290:1: (lv_clause_0_0= ruleAcceptClause )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6291:3: lv_clause_0_0= ruleAcceptClause
						{

							newCompositeNode(grammarAccess.getAcceptBlockAccess().getClauseAcceptClauseParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleAcceptClause_in_ruleAcceptBlock13746);
							lv_clause_0_0 = ruleAcceptClause();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAcceptBlockRule());
							}
							set(
									current,
									"clause",
									lv_clause_0_0,
									"AcceptClause");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6307:2: ( (lv_block_1_0= ruleBlock ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6308:1: (lv_block_1_0= ruleBlock )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6308:1: (lv_block_1_0= ruleBlock )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6309:3: lv_block_1_0= ruleBlock
						{

							newCompositeNode(grammarAccess.getAcceptBlockAccess().getBlockBlockParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleBlock_in_ruleAcceptBlock13767);
							lv_block_1_0 = ruleBlock();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAcceptBlockRule());
							}
							set(
									current,
									"block",
									lv_block_1_0,
									"Block");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAcceptBlock"


	// $ANTLR start "entryRuleAcceptClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6333:1: entryRuleAcceptClause returns [EObject current=null] :
	// iv_ruleAcceptClause= ruleAcceptClause EOF ;
	public final EObject entryRuleAcceptClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAcceptClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6334:2: (iv_ruleAcceptClause= ruleAcceptClause EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6335:2: iv_ruleAcceptClause= ruleAcceptClause EOF
			{
				newCompositeNode(grammarAccess.getAcceptClauseRule());
				pushFollow(FOLLOW_ruleAcceptClause_in_entryRuleAcceptClause13803);
				iv_ruleAcceptClause = ruleAcceptClause();

				state._fsp--;

				current = iv_ruleAcceptClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAcceptClause13813);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAcceptClause"


	// $ANTLR start "ruleAcceptClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6342:1: ruleAcceptClause returns [EObject current=null] :
	// (otherlv_0= 'accept' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')' ) ;
	public final EObject ruleAcceptClause() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		Token lv_name_2_0 = null;
		Token otherlv_3 = null;
		Token otherlv_5 = null;
		EObject lv_qualifiedNameList_4_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6345:28: ( (otherlv_0= 'accept' otherlv_1= '(' ( (
			// (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6346:1: (otherlv_0= 'accept' otherlv_1= '(' ( (
			// (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6346:1: (otherlv_0= 'accept' otherlv_1= '(' ( (
				// (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6346:3: otherlv_0= 'accept' otherlv_1= '(' ( (
				// (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')'
				{
					otherlv_0 = (Token) match(input, 79, FOLLOW_79_in_ruleAcceptClause13850);

					newLeafNode(otherlv_0, grammarAccess.getAcceptClauseAccess().getAcceptKeyword_0());

					otherlv_1 = (Token) match(input, 21, FOLLOW_21_in_ruleAcceptClause13862);

					newLeafNode(otherlv_1, grammarAccess.getAcceptClauseAccess().getLeftParenthesisKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6354:1: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':'
					// )?
					int alt84 = 2;
					int LA84_0 = input.LA(1);

					if ((LA84_0 == RULE_ID)) {
						int LA84_1 = input.LA(2);

						if ((LA84_1 == 24)) {
							alt84 = 1;
						}
					}
					switch (alt84) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6354:2: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':'
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6354:2: ( (lv_name_2_0= RULE_ID ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6355:1: (lv_name_2_0= RULE_ID )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6355:1: (lv_name_2_0= RULE_ID )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6356:3: lv_name_2_0= RULE_ID
							{
								lv_name_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleAcceptClause13880);

								newLeafNode(lv_name_2_0, grammarAccess.getAcceptClauseAccess().getNameIDTerminalRuleCall_2_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getAcceptClauseRule());
								}
								setWithLastConsumed(
										current,
										"name",
										lv_name_2_0,
										"ID");


							}


						}

						otherlv_3 = (Token) match(input, 24, FOLLOW_24_in_ruleAcceptClause13897);

						newLeafNode(otherlv_3, grammarAccess.getAcceptClauseAccess().getColonKeyword_2_1());


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6376:3: ( (lv_qualifiedNameList_4_0=
					// ruleQualifiedNameList ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6377:1: (lv_qualifiedNameList_4_0=
					// ruleQualifiedNameList )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6377:1: (lv_qualifiedNameList_4_0=
						// ruleQualifiedNameList )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6378:3: lv_qualifiedNameList_4_0=
						// ruleQualifiedNameList
						{

							newCompositeNode(grammarAccess.getAcceptClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_3_0());

							pushFollow(FOLLOW_ruleQualifiedNameList_in_ruleAcceptClause13920);
							lv_qualifiedNameList_4_0 = ruleQualifiedNameList();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAcceptClauseRule());
							}
							set(
									current,
									"qualifiedNameList",
									lv_qualifiedNameList_4_0,
									"QualifiedNameList");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_5 = (Token) match(input, 22, FOLLOW_22_in_ruleAcceptClause13932);

					newLeafNode(otherlv_5, grammarAccess.getAcceptClauseAccess().getRightParenthesisKeyword_4());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAcceptClause"


	// $ANTLR start "entryRuleClassifyStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6406:1: entryRuleClassifyStatement returns [EObject current=null] :
	// iv_ruleClassifyStatement= ruleClassifyStatement EOF ;
	public final EObject entryRuleClassifyStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleClassifyStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6407:2: (iv_ruleClassifyStatement= ruleClassifyStatement EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6408:2: iv_ruleClassifyStatement= ruleClassifyStatement EOF
			{
				newCompositeNode(grammarAccess.getClassifyStatementRule());
				pushFollow(FOLLOW_ruleClassifyStatement_in_entryRuleClassifyStatement13968);
				iv_ruleClassifyStatement = ruleClassifyStatement();

				state._fsp--;

				current = iv_ruleClassifyStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleClassifyStatement13978);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleClassifyStatement"


	// $ANTLR start "ruleClassifyStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6415:1: ruleClassifyStatement returns [EObject current=null] :
	// (otherlv_0= 'classify' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';' ) ;
	public final EObject ruleClassifyStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_3 = null;
		EObject lv_expression_1_0 = null;

		EObject lv_clause_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6418:28: ( (otherlv_0= 'classify' ( (lv_expression_1_0=
			// ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6419:1: (otherlv_0= 'classify' ( (lv_expression_1_0=
			// ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6419:1: (otherlv_0= 'classify' ( (lv_expression_1_0=
				// ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6419:3: otherlv_0= 'classify' ( (lv_expression_1_0=
				// ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';'
				{
					otherlv_0 = (Token) match(input, 80, FOLLOW_80_in_ruleClassifyStatement14015);

					newLeafNode(otherlv_0, grammarAccess.getClassifyStatementAccess().getClassifyKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6423:1: ( (lv_expression_1_0= ruleExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6424:1: (lv_expression_1_0= ruleExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6424:1: (lv_expression_1_0= ruleExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6425:3: lv_expression_1_0= ruleExpression
						{

							newCompositeNode(grammarAccess.getClassifyStatementAccess().getExpressionExpressionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleExpression_in_ruleClassifyStatement14036);
							lv_expression_1_0 = ruleExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getClassifyStatementRule());
							}
							set(
									current,
									"expression",
									lv_expression_1_0,
									"Expression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6441:2: ( (lv_clause_2_0= ruleClassificationClause )
					// )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6442:1: (lv_clause_2_0= ruleClassificationClause )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6442:1: (lv_clause_2_0= ruleClassificationClause
						// )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6443:3: lv_clause_2_0= ruleClassificationClause
						{

							newCompositeNode(grammarAccess.getClassifyStatementAccess().getClauseClassificationClauseParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleClassificationClause_in_ruleClassifyStatement14057);
							lv_clause_2_0 = ruleClassificationClause();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getClassifyStatementRule());
							}
							set(
									current,
									"clause",
									lv_clause_2_0,
									"ClassificationClause");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_3 = (Token) match(input, 65, FOLLOW_65_in_ruleClassifyStatement14069);

					newLeafNode(otherlv_3, grammarAccess.getClassifyStatementAccess().getSemicolonKeyword_3());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleClassifyStatement"


	// $ANTLR start "entryRuleClassificationClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6471:1: entryRuleClassificationClause returns [EObject current=null]
	// : iv_ruleClassificationClause= ruleClassificationClause EOF ;
	public final EObject entryRuleClassificationClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleClassificationClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6472:2: (iv_ruleClassificationClause=
			// ruleClassificationClause EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6473:2: iv_ruleClassificationClause=
			// ruleClassificationClause EOF
			{
				newCompositeNode(grammarAccess.getClassificationClauseRule());
				pushFollow(FOLLOW_ruleClassificationClause_in_entryRuleClassificationClause14105);
				iv_ruleClassificationClause = ruleClassificationClause();

				state._fsp--;

				current = iv_ruleClassificationClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleClassificationClause14115);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleClassificationClause"


	// $ANTLR start "ruleClassificationClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6480:1: ruleClassificationClause returns [EObject current=null] : (
	// ( ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? ) | ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) ) ) ;
	public final EObject ruleClassificationClause() throws RecognitionException {
		EObject current = null;

		EObject lv_classifyFromClause_0_0 = null;

		EObject lv_classifyToClause_1_0 = null;

		EObject lv_reclassyAllClause_2_0 = null;

		EObject lv_classifyToClause_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6483:28: ( ( ( ( (lv_classifyFromClause_0_0=
			// ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? ) | ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6484:1: ( ( ( (lv_classifyFromClause_0_0=
			// ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? ) | ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6484:1: ( ( ( (lv_classifyFromClause_0_0=
				// ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? ) | ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) ) )
				int alt87 = 2;
				int LA87_0 = input.LA(1);

				if ((LA87_0 == 81)) {
					int LA87_1 = input.LA(2);

					if ((LA87_1 == 13)) {
						alt87 = 2;
					}
					else if ((LA87_1 == RULE_ID)) {
						alt87 = 1;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 87, 1, input);

						throw nvae;
					}
				}
				else if ((LA87_0 == 82)) {
					alt87 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 87, 0, input);

					throw nvae;
				}
				switch (alt87) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6484:2: ( ( (lv_classifyFromClause_0_0=
				// ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6484:2: ( ( (lv_classifyFromClause_0_0=
					// ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6484:3: ( (lv_classifyFromClause_0_0=
					// ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )?
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6484:3: ( (lv_classifyFromClause_0_0=
						// ruleClassificationFromClause ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6485:1: (lv_classifyFromClause_0_0=
						// ruleClassificationFromClause )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6485:1: (lv_classifyFromClause_0_0=
							// ruleClassificationFromClause )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6486:3: lv_classifyFromClause_0_0=
							// ruleClassificationFromClause
							{

								newCompositeNode(grammarAccess.getClassificationClauseAccess().getClassifyFromClauseClassificationFromClauseParserRuleCall_0_0_0());

								pushFollow(FOLLOW_ruleClassificationFromClause_in_ruleClassificationClause14162);
								lv_classifyFromClause_0_0 = ruleClassificationFromClause();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getClassificationClauseRule());
								}
								set(
										current,
										"classifyFromClause",
										lv_classifyFromClause_0_0,
										"ClassificationFromClause");
								afterParserOrEnumRuleCall();


							}


						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6502:2: ( (lv_classifyToClause_1_0=
						// ruleClassificationToClause ) )?
						int alt85 = 2;
						int LA85_0 = input.LA(1);

						if ((LA85_0 == 82)) {
							alt85 = 1;
						}
						switch (alt85) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6503:1: (lv_classifyToClause_1_0=
						// ruleClassificationToClause )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6503:1: (lv_classifyToClause_1_0=
							// ruleClassificationToClause )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6504:3: lv_classifyToClause_1_0=
							// ruleClassificationToClause
							{

								newCompositeNode(grammarAccess.getClassificationClauseAccess().getClassifyToClauseClassificationToClauseParserRuleCall_0_1_0());

								pushFollow(FOLLOW_ruleClassificationToClause_in_ruleClassificationClause14183);
								lv_classifyToClause_1_0 = ruleClassificationToClause();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getClassificationClauseRule());
								}
								set(
										current,
										"classifyToClause",
										lv_classifyToClause_1_0,
										"ClassificationToClause");
								afterParserOrEnumRuleCall();


							}


						}
							break;

						}


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6521:6: ( ( (lv_reclassyAllClause_2_0=
				// ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6521:6: ( ( (lv_reclassyAllClause_2_0=
					// ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6521:7: ( (lv_reclassyAllClause_2_0=
					// ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6521:7: ( (lv_reclassyAllClause_2_0=
						// ruleReclassifyAllClause ) )?
						int alt86 = 2;
						int LA86_0 = input.LA(1);

						if ((LA86_0 == 81)) {
							alt86 = 1;
						}
						switch (alt86) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6522:1: (lv_reclassyAllClause_2_0=
						// ruleReclassifyAllClause )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6522:1: (lv_reclassyAllClause_2_0=
							// ruleReclassifyAllClause )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6523:3: lv_reclassyAllClause_2_0=
							// ruleReclassifyAllClause
							{

								newCompositeNode(grammarAccess.getClassificationClauseAccess().getReclassyAllClauseReclassifyAllClauseParserRuleCall_1_0_0());

								pushFollow(FOLLOW_ruleReclassifyAllClause_in_ruleClassificationClause14213);
								lv_reclassyAllClause_2_0 = ruleReclassifyAllClause();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getClassificationClauseRule());
								}
								set(
										current,
										"reclassyAllClause",
										lv_reclassyAllClause_2_0,
										"ReclassifyAllClause");
								afterParserOrEnumRuleCall();


							}


						}
							break;

						}

						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6539:3: ( (lv_classifyToClause_3_0=
						// ruleClassificationToClause ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6540:1: (lv_classifyToClause_3_0=
						// ruleClassificationToClause )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6540:1: (lv_classifyToClause_3_0=
							// ruleClassificationToClause )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6541:3: lv_classifyToClause_3_0=
							// ruleClassificationToClause
							{

								newCompositeNode(grammarAccess.getClassificationClauseAccess().getClassifyToClauseClassificationToClauseParserRuleCall_1_1_0());

								pushFollow(FOLLOW_ruleClassificationToClause_in_ruleClassificationClause14235);
								lv_classifyToClause_3_0 = ruleClassificationToClause();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getClassificationClauseRule());
								}
								set(
										current,
										"classifyToClause",
										lv_classifyToClause_3_0,
										"ClassificationToClause");
								afterParserOrEnumRuleCall();


							}


						}


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleClassificationClause"


	// $ANTLR start "entryRuleClassificationFromClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6565:1: entryRuleClassificationFromClause returns [EObject
	// current=null] : iv_ruleClassificationFromClause= ruleClassificationFromClause EOF ;
	public final EObject entryRuleClassificationFromClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleClassificationFromClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6566:2: (iv_ruleClassificationFromClause=
			// ruleClassificationFromClause EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6567:2: iv_ruleClassificationFromClause=
			// ruleClassificationFromClause EOF
			{
				newCompositeNode(grammarAccess.getClassificationFromClauseRule());
				pushFollow(FOLLOW_ruleClassificationFromClause_in_entryRuleClassificationFromClause14272);
				iv_ruleClassificationFromClause = ruleClassificationFromClause();

				state._fsp--;

				current = iv_ruleClassificationFromClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleClassificationFromClause14282);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleClassificationFromClause"


	// $ANTLR start "ruleClassificationFromClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6574:1: ruleClassificationFromClause returns [EObject current=null]
	// : (otherlv_0= 'from' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) ) ;
	public final EObject ruleClassificationFromClause() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_qualifiedNameList_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6577:28: ( (otherlv_0= 'from' ( (lv_qualifiedNameList_1_0=
			// ruleQualifiedNameList ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6578:1: (otherlv_0= 'from' ( (lv_qualifiedNameList_1_0=
			// ruleQualifiedNameList ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6578:1: (otherlv_0= 'from' ( (lv_qualifiedNameList_1_0=
				// ruleQualifiedNameList ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6578:3: otherlv_0= 'from' ( (lv_qualifiedNameList_1_0=
				// ruleQualifiedNameList ) )
				{
					otherlv_0 = (Token) match(input, 81, FOLLOW_81_in_ruleClassificationFromClause14319);

					newLeafNode(otherlv_0, grammarAccess.getClassificationFromClauseAccess().getFromKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6582:1: ( (lv_qualifiedNameList_1_0=
					// ruleQualifiedNameList ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6583:1: (lv_qualifiedNameList_1_0=
					// ruleQualifiedNameList )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6583:1: (lv_qualifiedNameList_1_0=
						// ruleQualifiedNameList )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6584:3: lv_qualifiedNameList_1_0=
						// ruleQualifiedNameList
						{

							newCompositeNode(grammarAccess.getClassificationFromClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleQualifiedNameList_in_ruleClassificationFromClause14340);
							lv_qualifiedNameList_1_0 = ruleQualifiedNameList();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getClassificationFromClauseRule());
							}
							set(
									current,
									"qualifiedNameList",
									lv_qualifiedNameList_1_0,
									"QualifiedNameList");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleClassificationFromClause"


	// $ANTLR start "entryRuleClassificationToClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6608:1: entryRuleClassificationToClause returns [EObject
	// current=null] : iv_ruleClassificationToClause= ruleClassificationToClause EOF ;
	public final EObject entryRuleClassificationToClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleClassificationToClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6609:2: (iv_ruleClassificationToClause=
			// ruleClassificationToClause EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6610:2: iv_ruleClassificationToClause=
			// ruleClassificationToClause EOF
			{
				newCompositeNode(grammarAccess.getClassificationToClauseRule());
				pushFollow(FOLLOW_ruleClassificationToClause_in_entryRuleClassificationToClause14376);
				iv_ruleClassificationToClause = ruleClassificationToClause();

				state._fsp--;

				current = iv_ruleClassificationToClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleClassificationToClause14386);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleClassificationToClause"


	// $ANTLR start "ruleClassificationToClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6617:1: ruleClassificationToClause returns [EObject current=null] :
	// (otherlv_0= 'to' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) ) ;
	public final EObject ruleClassificationToClause() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_qualifiedNameList_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6620:28: ( (otherlv_0= 'to' ( (lv_qualifiedNameList_1_0=
			// ruleQualifiedNameList ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6621:1: (otherlv_0= 'to' ( (lv_qualifiedNameList_1_0=
			// ruleQualifiedNameList ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6621:1: (otherlv_0= 'to' ( (lv_qualifiedNameList_1_0=
				// ruleQualifiedNameList ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6621:3: otherlv_0= 'to' ( (lv_qualifiedNameList_1_0=
				// ruleQualifiedNameList ) )
				{
					otherlv_0 = (Token) match(input, 82, FOLLOW_82_in_ruleClassificationToClause14423);

					newLeafNode(otherlv_0, grammarAccess.getClassificationToClauseAccess().getToKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6625:1: ( (lv_qualifiedNameList_1_0=
					// ruleQualifiedNameList ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6626:1: (lv_qualifiedNameList_1_0=
					// ruleQualifiedNameList )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6626:1: (lv_qualifiedNameList_1_0=
						// ruleQualifiedNameList )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6627:3: lv_qualifiedNameList_1_0=
						// ruleQualifiedNameList
						{

							newCompositeNode(grammarAccess.getClassificationToClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleQualifiedNameList_in_ruleClassificationToClause14444);
							lv_qualifiedNameList_1_0 = ruleQualifiedNameList();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getClassificationToClauseRule());
							}
							set(
									current,
									"qualifiedNameList",
									lv_qualifiedNameList_1_0,
									"QualifiedNameList");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleClassificationToClause"


	// $ANTLR start "entryRuleReclassifyAllClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6651:1: entryRuleReclassifyAllClause returns [EObject current=null]
	// : iv_ruleReclassifyAllClause= ruleReclassifyAllClause EOF ;
	public final EObject entryRuleReclassifyAllClause() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleReclassifyAllClause = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6652:2: (iv_ruleReclassifyAllClause= ruleReclassifyAllClause
			// EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6653:2: iv_ruleReclassifyAllClause= ruleReclassifyAllClause
			// EOF
			{
				newCompositeNode(grammarAccess.getReclassifyAllClauseRule());
				pushFollow(FOLLOW_ruleReclassifyAllClause_in_entryRuleReclassifyAllClause14480);
				iv_ruleReclassifyAllClause = ruleReclassifyAllClause();

				state._fsp--;

				current = iv_ruleReclassifyAllClause;
				match(input, EOF, FOLLOW_EOF_in_entryRuleReclassifyAllClause14490);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleReclassifyAllClause"


	// $ANTLR start "ruleReclassifyAllClause"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6660:1: ruleReclassifyAllClause returns [EObject current=null] : (
	// () otherlv_1= 'from' otherlv_2= '*' ) ;
	public final EObject ruleReclassifyAllClause() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_2 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6663:28: ( ( () otherlv_1= 'from' otherlv_2= '*' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6664:1: ( () otherlv_1= 'from' otherlv_2= '*' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6664:1: ( () otherlv_1= 'from' otherlv_2= '*' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6664:2: () otherlv_1= 'from' otherlv_2= '*'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6664:2: ()
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6665:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getReclassifyAllClauseAccess().getReclassifyAllClauseAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 81, FOLLOW_81_in_ruleReclassifyAllClause14536);

					newLeafNode(otherlv_1, grammarAccess.getReclassifyAllClauseAccess().getFromKeyword_1());

					otherlv_2 = (Token) match(input, 13, FOLLOW_13_in_ruleReclassifyAllClause14548);

					newLeafNode(otherlv_2, grammarAccess.getReclassifyAllClauseAccess().getAsteriskKeyword_2());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleReclassifyAllClause"


	// $ANTLR start "entryRuleQualifiedNameList"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6686:1: entryRuleQualifiedNameList returns [EObject current=null] :
	// iv_ruleQualifiedNameList= ruleQualifiedNameList EOF ;
	public final EObject entryRuleQualifiedNameList() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleQualifiedNameList = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6687:2: (iv_ruleQualifiedNameList= ruleQualifiedNameList EOF
			// )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6688:2: iv_ruleQualifiedNameList= ruleQualifiedNameList EOF
			{
				newCompositeNode(grammarAccess.getQualifiedNameListRule());
				pushFollow(FOLLOW_ruleQualifiedNameList_in_entryRuleQualifiedNameList14584);
				iv_ruleQualifiedNameList = ruleQualifiedNameList();

				state._fsp--;

				current = iv_ruleQualifiedNameList;
				match(input, EOF, FOLLOW_EOF_in_entryRuleQualifiedNameList14594);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleQualifiedNameList"


	// $ANTLR start "ruleQualifiedNameList"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6695:1: ruleQualifiedNameList returns [EObject current=null] : ( (
	// (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )* ) ;
	public final EObject ruleQualifiedNameList() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_qualifiedName_0_0 = null;

		EObject lv_qualifiedName_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6698:28: ( ( ( (lv_qualifiedName_0_0=
			// ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6699:1: ( ( (lv_qualifiedName_0_0=
			// ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6699:1: ( ( (lv_qualifiedName_0_0=
				// ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )* )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6699:2: ( (lv_qualifiedName_0_0=
				// ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6699:2: ( (lv_qualifiedName_0_0=
					// ruleQualifiedNameWithBinding ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6700:1: (lv_qualifiedName_0_0=
					// ruleQualifiedNameWithBinding )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6700:1: (lv_qualifiedName_0_0=
						// ruleQualifiedNameWithBinding )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6701:3: lv_qualifiedName_0_0=
						// ruleQualifiedNameWithBinding
						{

							newCompositeNode(grammarAccess.getQualifiedNameListAccess().getQualifiedNameQualifiedNameWithBindingParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameList14640);
							lv_qualifiedName_0_0 = ruleQualifiedNameWithBinding();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getQualifiedNameListRule());
							}
							add(
									current,
									"qualifiedName",
									lv_qualifiedName_0_0,
									"QualifiedNameWithBinding");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6717:2: (otherlv_1= ',' ( (lv_qualifiedName_2_0=
					// ruleQualifiedNameWithBinding ) ) )*
					loop88: do {
						int alt88 = 2;
						int LA88_0 = input.LA(1);

						if ((LA88_0 == 18)) {
							alt88 = 1;
						}


						switch (alt88) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6717:4: otherlv_1= ',' ( (lv_qualifiedName_2_0=
						// ruleQualifiedNameWithBinding ) )
						{
							otherlv_1 = (Token) match(input, 18, FOLLOW_18_in_ruleQualifiedNameList14653);

							newLeafNode(otherlv_1, grammarAccess.getQualifiedNameListAccess().getCommaKeyword_1_0());

							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6721:1: ( (lv_qualifiedName_2_0=
							// ruleQualifiedNameWithBinding ) )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6722:1: (lv_qualifiedName_2_0=
							// ruleQualifiedNameWithBinding )
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6722:1: (lv_qualifiedName_2_0=
								// ruleQualifiedNameWithBinding )
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6723:3: lv_qualifiedName_2_0=
								// ruleQualifiedNameWithBinding
								{

									newCompositeNode(grammarAccess.getQualifiedNameListAccess().getQualifiedNameQualifiedNameWithBindingParserRuleCall_1_1_0());

									pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameList14674);
									lv_qualifiedName_2_0 = ruleQualifiedNameWithBinding();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getQualifiedNameListRule());
									}
									add(
											current,
											"qualifiedName",
											lv_qualifiedName_2_0,
											"QualifiedNameWithBinding");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop88;
						}
					} while (true);


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleQualifiedNameList"


	// $ANTLR start "entryRuleInvocationOrAssignementOrDeclarationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6747:1: entryRuleInvocationOrAssignementOrDeclarationStatement
	// returns [EObject current=null] : iv_ruleInvocationOrAssignementOrDeclarationStatement= ruleInvocationOrAssignementOrDeclarationStatement EOF ;
	public final EObject entryRuleInvocationOrAssignementOrDeclarationStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleInvocationOrAssignementOrDeclarationStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6748:2:
			// (iv_ruleInvocationOrAssignementOrDeclarationStatement= ruleInvocationOrAssignementOrDeclarationStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6749:2:
			// iv_ruleInvocationOrAssignementOrDeclarationStatement= ruleInvocationOrAssignementOrDeclarationStatement EOF
			{
				newCompositeNode(grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule());
				pushFollow(FOLLOW_ruleInvocationOrAssignementOrDeclarationStatement_in_entryRuleInvocationOrAssignementOrDeclarationStatement14712);
				iv_ruleInvocationOrAssignementOrDeclarationStatement = ruleInvocationOrAssignementOrDeclarationStatement();

				state._fsp--;

				current = iv_ruleInvocationOrAssignementOrDeclarationStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleInvocationOrAssignementOrDeclarationStatement14722);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleInvocationOrAssignementOrDeclarationStatement"


	// $ANTLR start "ruleInvocationOrAssignementOrDeclarationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6756:1: ruleInvocationOrAssignementOrDeclarationStatement returns
	// [EObject current=null] : ( ( (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )?
	// otherlv_3= ';' ) ;
	public final EObject ruleInvocationOrAssignementOrDeclarationStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_3 = null;
		EObject lv_typePart_OR_assignedPart_OR_invocationPart_0_0 = null;

		EObject lv_variableDeclarationCompletion_1_0 = null;

		EObject lv_assignmentCompletion_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6759:28: ( ( (
			// (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6760:1: ( (
			// (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6760:1: ( (
				// (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6760:2: (
				// (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6760:2: (
					// (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6761:1:
					// (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6761:1:
						// (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6762:3:
						// lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression
						{

							newCompositeNode(grammarAccess.getInvocationOrAssignementOrDeclarationStatementAccess().getTypePart_OR_assignedPart_OR_invocationPartNameExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleNameExpression_in_ruleInvocationOrAssignementOrDeclarationStatement14768);
							lv_typePart_OR_assignedPart_OR_invocationPart_0_0 = ruleNameExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule());
							}
							set(
									current,
									"typePart_OR_assignedPart_OR_invocationPart",
									lv_typePart_OR_assignedPart_OR_invocationPart_0_0,
									"NameExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6778:2: ( ( (lv_variableDeclarationCompletion_1_0=
					// ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )?
					int alt89 = 3;
					int LA89_0 = input.LA(1);

					if ((LA89_0 == RULE_ID || LA89_0 == 47)) {
						alt89 = 1;
					}
					else if ((LA89_0 == 12 || (LA89_0 >= 99 && LA89_0 <= 109))) {
						alt89 = 2;
					}
					switch (alt89) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6778:3: ( (lv_variableDeclarationCompletion_1_0=
					// ruleVariableDeclarationCompletion ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6778:3: ( (lv_variableDeclarationCompletion_1_0=
						// ruleVariableDeclarationCompletion ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6779:1: (lv_variableDeclarationCompletion_1_0=
						// ruleVariableDeclarationCompletion )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6779:1:
							// (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6780:3:
							// lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion
							{

								newCompositeNode(grammarAccess.getInvocationOrAssignementOrDeclarationStatementAccess().getVariableDeclarationCompletionVariableDeclarationCompletionParserRuleCall_1_0_0());

								pushFollow(FOLLOW_ruleVariableDeclarationCompletion_in_ruleInvocationOrAssignementOrDeclarationStatement14790);
								lv_variableDeclarationCompletion_1_0 = ruleVariableDeclarationCompletion();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule());
								}
								set(
										current,
										"variableDeclarationCompletion",
										lv_variableDeclarationCompletion_1_0,
										"VariableDeclarationCompletion");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6797:6: ( (lv_assignmentCompletion_2_0=
					// ruleAssignmentCompletion ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6797:6: ( (lv_assignmentCompletion_2_0=
						// ruleAssignmentCompletion ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6798:1: (lv_assignmentCompletion_2_0=
						// ruleAssignmentCompletion )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6798:1: (lv_assignmentCompletion_2_0=
							// ruleAssignmentCompletion )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6799:3: lv_assignmentCompletion_2_0=
							// ruleAssignmentCompletion
							{

								newCompositeNode(grammarAccess.getInvocationOrAssignementOrDeclarationStatementAccess().getAssignmentCompletionAssignmentCompletionParserRuleCall_1_1_0());

								pushFollow(FOLLOW_ruleAssignmentCompletion_in_ruleInvocationOrAssignementOrDeclarationStatement14817);
								lv_assignmentCompletion_2_0 = ruleAssignmentCompletion();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule());
								}
								set(
										current,
										"assignmentCompletion",
										lv_assignmentCompletion_2_0,
										"AssignmentCompletion");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}

					otherlv_3 = (Token) match(input, 65, FOLLOW_65_in_ruleInvocationOrAssignementOrDeclarationStatement14831);

					newLeafNode(otherlv_3, grammarAccess.getInvocationOrAssignementOrDeclarationStatementAccess().getSemicolonKeyword_2());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleInvocationOrAssignementOrDeclarationStatement"


	// $ANTLR start "entryRuleSuperInvocationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6827:1: entryRuleSuperInvocationStatement returns [EObject
	// current=null] : iv_ruleSuperInvocationStatement= ruleSuperInvocationStatement EOF ;
	public final EObject entryRuleSuperInvocationStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSuperInvocationStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6828:2: (iv_ruleSuperInvocationStatement=
			// ruleSuperInvocationStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6829:2: iv_ruleSuperInvocationStatement=
			// ruleSuperInvocationStatement EOF
			{
				newCompositeNode(grammarAccess.getSuperInvocationStatementRule());
				pushFollow(FOLLOW_ruleSuperInvocationStatement_in_entryRuleSuperInvocationStatement14867);
				iv_ruleSuperInvocationStatement = ruleSuperInvocationStatement();

				state._fsp--;

				current = iv_ruleSuperInvocationStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSuperInvocationStatement14877);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSuperInvocationStatement"


	// $ANTLR start "ruleSuperInvocationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6836:1: ruleSuperInvocationStatement returns [EObject current=null]
	// : ( ( (lv__super_0_0= ruleSuperInvocationExpression ) ) otherlv_1= ';' ) ;
	public final EObject ruleSuperInvocationStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv__super_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6839:28: ( ( ( (lv__super_0_0= ruleSuperInvocationExpression
			// ) ) otherlv_1= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6840:1: ( ( (lv__super_0_0= ruleSuperInvocationExpression )
			// ) otherlv_1= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6840:1: ( ( (lv__super_0_0=
				// ruleSuperInvocationExpression ) ) otherlv_1= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6840:2: ( (lv__super_0_0= ruleSuperInvocationExpression
				// ) ) otherlv_1= ';'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6840:2: ( (lv__super_0_0=
					// ruleSuperInvocationExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6841:1: (lv__super_0_0=
					// ruleSuperInvocationExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6841:1: (lv__super_0_0=
						// ruleSuperInvocationExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6842:3: lv__super_0_0=
						// ruleSuperInvocationExpression
						{

							newCompositeNode(grammarAccess.getSuperInvocationStatementAccess().get_superSuperInvocationExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleSuperInvocationExpression_in_ruleSuperInvocationStatement14923);
							lv__super_0_0 = ruleSuperInvocationExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getSuperInvocationStatementRule());
							}
							set(
									current,
									"_super",
									lv__super_0_0,
									"SuperInvocationExpression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_1 = (Token) match(input, 65, FOLLOW_65_in_ruleSuperInvocationStatement14935);

					newLeafNode(otherlv_1, grammarAccess.getSuperInvocationStatementAccess().getSemicolonKeyword_1());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSuperInvocationStatement"


	// $ANTLR start "entryRuleThisInvocationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6870:1: entryRuleThisInvocationStatement returns [EObject
	// current=null] : iv_ruleThisInvocationStatement= ruleThisInvocationStatement EOF ;
	public final EObject entryRuleThisInvocationStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleThisInvocationStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6871:2: (iv_ruleThisInvocationStatement=
			// ruleThisInvocationStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6872:2: iv_ruleThisInvocationStatement=
			// ruleThisInvocationStatement EOF
			{
				newCompositeNode(grammarAccess.getThisInvocationStatementRule());
				pushFollow(FOLLOW_ruleThisInvocationStatement_in_entryRuleThisInvocationStatement14971);
				iv_ruleThisInvocationStatement = ruleThisInvocationStatement();

				state._fsp--;

				current = iv_ruleThisInvocationStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleThisInvocationStatement14981);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleThisInvocationStatement"


	// $ANTLR start "ruleThisInvocationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6879:1: ruleThisInvocationStatement returns [EObject current=null] :
	// ( ( (lv__this_0_0= ruleThisExpression ) ) ( (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';' ) ;
	public final EObject ruleThisInvocationStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_2 = null;
		EObject lv__this_0_0 = null;

		EObject lv_assignmentCompletion_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6882:28: ( ( ( (lv__this_0_0= ruleThisExpression ) ) (
			// (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6883:1: ( ( (lv__this_0_0= ruleThisExpression ) ) (
			// (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6883:1: ( ( (lv__this_0_0= ruleThisExpression ) ) (
				// (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6883:2: ( (lv__this_0_0= ruleThisExpression ) ) (
				// (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6883:2: ( (lv__this_0_0= ruleThisExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6884:1: (lv__this_0_0= ruleThisExpression )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6884:1: (lv__this_0_0= ruleThisExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6885:3: lv__this_0_0= ruleThisExpression
						{

							newCompositeNode(grammarAccess.getThisInvocationStatementAccess().get_thisThisExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleThisExpression_in_ruleThisInvocationStatement15027);
							lv__this_0_0 = ruleThisExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getThisInvocationStatementRule());
							}
							set(
									current,
									"_this",
									lv__this_0_0,
									"ThisExpression");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6901:2: ( (lv_assignmentCompletion_1_0=
					// ruleAssignmentCompletion ) )?
					int alt90 = 2;
					int LA90_0 = input.LA(1);

					if ((LA90_0 == 12 || (LA90_0 >= 99 && LA90_0 <= 109))) {
						alt90 = 1;
					}
					switch (alt90) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6902:1: (lv_assignmentCompletion_1_0=
					// ruleAssignmentCompletion )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6902:1: (lv_assignmentCompletion_1_0=
						// ruleAssignmentCompletion )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6903:3: lv_assignmentCompletion_1_0=
						// ruleAssignmentCompletion
						{

							newCompositeNode(grammarAccess.getThisInvocationStatementAccess().getAssignmentCompletionAssignmentCompletionParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleAssignmentCompletion_in_ruleThisInvocationStatement15048);
							lv_assignmentCompletion_1_0 = ruleAssignmentCompletion();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getThisInvocationStatementRule());
							}
							set(
									current,
									"assignmentCompletion",
									lv_assignmentCompletion_1_0,
									"AssignmentCompletion");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					otherlv_2 = (Token) match(input, 65, FOLLOW_65_in_ruleThisInvocationStatement15061);

					newLeafNode(otherlv_2, grammarAccess.getThisInvocationStatementAccess().getSemicolonKeyword_2());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleThisInvocationStatement"


	// $ANTLR start "entryRuleInstanceCreationInvocationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6931:1: entryRuleInstanceCreationInvocationStatement returns
	// [EObject current=null] : iv_ruleInstanceCreationInvocationStatement= ruleInstanceCreationInvocationStatement EOF ;
	public final EObject entryRuleInstanceCreationInvocationStatement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleInstanceCreationInvocationStatement = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6932:2: (iv_ruleInstanceCreationInvocationStatement=
			// ruleInstanceCreationInvocationStatement EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6933:2: iv_ruleInstanceCreationInvocationStatement=
			// ruleInstanceCreationInvocationStatement EOF
			{
				newCompositeNode(grammarAccess.getInstanceCreationInvocationStatementRule());
				pushFollow(FOLLOW_ruleInstanceCreationInvocationStatement_in_entryRuleInstanceCreationInvocationStatement15097);
				iv_ruleInstanceCreationInvocationStatement = ruleInstanceCreationInvocationStatement();

				state._fsp--;

				current = iv_ruleInstanceCreationInvocationStatement;
				match(input, EOF, FOLLOW_EOF_in_entryRuleInstanceCreationInvocationStatement15107);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleInstanceCreationInvocationStatement"


	// $ANTLR start "ruleInstanceCreationInvocationStatement"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6940:1: ruleInstanceCreationInvocationStatement returns [EObject
	// current=null] : ( ( (lv__new_0_0= ruleInstanceCreationExpression ) ) otherlv_1= ';' ) ;
	public final EObject ruleInstanceCreationInvocationStatement() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv__new_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6943:28: ( ( ( (lv__new_0_0= ruleInstanceCreationExpression
			// ) ) otherlv_1= ';' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6944:1: ( ( (lv__new_0_0= ruleInstanceCreationExpression ) )
			// otherlv_1= ';' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6944:1: ( ( (lv__new_0_0= ruleInstanceCreationExpression
				// ) ) otherlv_1= ';' )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6944:2: ( (lv__new_0_0= ruleInstanceCreationExpression )
				// ) otherlv_1= ';'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6944:2: ( (lv__new_0_0=
					// ruleInstanceCreationExpression ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6945:1: (lv__new_0_0= ruleInstanceCreationExpression
					// )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6945:1: (lv__new_0_0=
						// ruleInstanceCreationExpression )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6946:3: lv__new_0_0=
						// ruleInstanceCreationExpression
						{

							newCompositeNode(grammarAccess.getInstanceCreationInvocationStatementAccess().get_newInstanceCreationExpressionParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleInstanceCreationExpression_in_ruleInstanceCreationInvocationStatement15153);
							lv__new_0_0 = ruleInstanceCreationExpression();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getInstanceCreationInvocationStatementRule());
							}
							set(
									current,
									"_new",
									lv__new_0_0,
									"InstanceCreationExpression");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_1 = (Token) match(input, 65, FOLLOW_65_in_ruleInstanceCreationInvocationStatement15165);

					newLeafNode(otherlv_1, grammarAccess.getInstanceCreationInvocationStatementAccess().getSemicolonKeyword_1());


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleInstanceCreationInvocationStatement"


	// $ANTLR start "entryRuleVariableDeclarationCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6974:1: entryRuleVariableDeclarationCompletion returns [EObject
	// current=null] : iv_ruleVariableDeclarationCompletion= ruleVariableDeclarationCompletion EOF ;
	public final EObject entryRuleVariableDeclarationCompletion() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleVariableDeclarationCompletion = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6975:2: (iv_ruleVariableDeclarationCompletion=
			// ruleVariableDeclarationCompletion EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6976:2: iv_ruleVariableDeclarationCompletion=
			// ruleVariableDeclarationCompletion EOF
			{
				newCompositeNode(grammarAccess.getVariableDeclarationCompletionRule());
				pushFollow(FOLLOW_ruleVariableDeclarationCompletion_in_entryRuleVariableDeclarationCompletion15201);
				iv_ruleVariableDeclarationCompletion = ruleVariableDeclarationCompletion();

				state._fsp--;

				current = iv_ruleVariableDeclarationCompletion;
				match(input, EOF, FOLLOW_EOF_in_entryRuleVariableDeclarationCompletion15211);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleVariableDeclarationCompletion"


	// $ANTLR start "ruleVariableDeclarationCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6983:1: ruleVariableDeclarationCompletion returns [EObject
	// current=null] : ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) ) ) ;
	public final EObject ruleVariableDeclarationCompletion() throws RecognitionException {
		EObject current = null;

		Token lv_multiplicityIndicator_0_0 = null;
		Token otherlv_1 = null;
		Token lv_variableName_2_0 = null;
		EObject lv_initValue_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6986:28: ( ( ( ( (lv_multiplicityIndicator_0_0= '[' ) )
			// otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6987:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) )
			// otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6987:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) )
				// otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6987:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) )
				// otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6987:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) )
					// otherlv_1= ']' )?
					int alt91 = 2;
					int LA91_0 = input.LA(1);

					if ((LA91_0 == 47)) {
						alt91 = 1;
					}
					switch (alt91) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6987:3: ( (lv_multiplicityIndicator_0_0= '[' ) )
					// otherlv_1= ']'
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6987:3: ( (lv_multiplicityIndicator_0_0= '[' ) )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6988:1: (lv_multiplicityIndicator_0_0= '[' )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6988:1: (lv_multiplicityIndicator_0_0= '[' )
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:6989:3: lv_multiplicityIndicator_0_0= '['
							{
								lv_multiplicityIndicator_0_0 = (Token) match(input, 47, FOLLOW_47_in_ruleVariableDeclarationCompletion15255);

								newLeafNode(lv_multiplicityIndicator_0_0, grammarAccess.getVariableDeclarationCompletionAccess().getMultiplicityIndicatorLeftSquareBracketKeyword_0_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getVariableDeclarationCompletionRule());
								}
								setWithLastConsumed(current, "multiplicityIndicator", true, "[");


							}


						}

						otherlv_1 = (Token) match(input, 48, FOLLOW_48_in_ruleVariableDeclarationCompletion15280);

						newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationCompletionAccess().getRightSquareBracketKeyword_0_1());


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7006:3: ( (lv_variableName_2_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7007:1: (lv_variableName_2_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7007:1: (lv_variableName_2_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7008:3: lv_variableName_2_0= RULE_ID
						{
							lv_variableName_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleVariableDeclarationCompletion15299);

							newLeafNode(lv_variableName_2_0, grammarAccess.getVariableDeclarationCompletionAccess().getVariableNameIDTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getVariableDeclarationCompletionRule());
							}
							setWithLastConsumed(
									current,
									"variableName",
									lv_variableName_2_0,
									"ID");


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7024:2: ( (lv_initValue_3_0=
					// ruleAssignmentCompletion ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7025:1: (lv_initValue_3_0= ruleAssignmentCompletion
					// )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7025:1: (lv_initValue_3_0=
						// ruleAssignmentCompletion )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7026:3: lv_initValue_3_0=
						// ruleAssignmentCompletion
						{

							newCompositeNode(grammarAccess.getVariableDeclarationCompletionAccess().getInitValueAssignmentCompletionParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleAssignmentCompletion_in_ruleVariableDeclarationCompletion15325);
							lv_initValue_3_0 = ruleAssignmentCompletion();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getVariableDeclarationCompletionRule());
							}
							set(
									current,
									"initValue",
									lv_initValue_3_0,
									"AssignmentCompletion");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleVariableDeclarationCompletion"


	// $ANTLR start "entryRuleAssignmentCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7050:1: entryRuleAssignmentCompletion returns [EObject current=null]
	// : iv_ruleAssignmentCompletion= ruleAssignmentCompletion EOF ;
	public final EObject entryRuleAssignmentCompletion() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleAssignmentCompletion = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7051:2: (iv_ruleAssignmentCompletion=
			// ruleAssignmentCompletion EOF )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7052:2: iv_ruleAssignmentCompletion=
			// ruleAssignmentCompletion EOF
			{
				newCompositeNode(grammarAccess.getAssignmentCompletionRule());
				pushFollow(FOLLOW_ruleAssignmentCompletion_in_entryRuleAssignmentCompletion15361);
				iv_ruleAssignmentCompletion = ruleAssignmentCompletion();

				state._fsp--;

				current = iv_ruleAssignmentCompletion;
				match(input, EOF, FOLLOW_EOF_in_entryRuleAssignmentCompletion15371);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleAssignmentCompletion"


	// $ANTLR start "ruleAssignmentCompletion"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7059:1: ruleAssignmentCompletion returns [EObject current=null] : (
	// ( (lv_op_0_0= ruleAssignmentOperator ) ) ( (lv_rightHandSide_1_0= ruleSequenceElement ) ) ) ;
	public final EObject ruleAssignmentCompletion() throws RecognitionException {
		EObject current = null;

		Enumerator lv_op_0_0 = null;

		EObject lv_rightHandSide_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7062:28: ( ( ( (lv_op_0_0= ruleAssignmentOperator ) ) (
			// (lv_rightHandSide_1_0= ruleSequenceElement ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7063:1: ( ( (lv_op_0_0= ruleAssignmentOperator ) ) (
			// (lv_rightHandSide_1_0= ruleSequenceElement ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7063:1: ( ( (lv_op_0_0= ruleAssignmentOperator ) ) (
				// (lv_rightHandSide_1_0= ruleSequenceElement ) ) )
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7063:2: ( (lv_op_0_0= ruleAssignmentOperator ) ) (
				// (lv_rightHandSide_1_0= ruleSequenceElement ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7063:2: ( (lv_op_0_0= ruleAssignmentOperator ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7064:1: (lv_op_0_0= ruleAssignmentOperator )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7064:1: (lv_op_0_0= ruleAssignmentOperator )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7065:3: lv_op_0_0= ruleAssignmentOperator
						{

							newCompositeNode(grammarAccess.getAssignmentCompletionAccess().getOpAssignmentOperatorEnumRuleCall_0_0());

							pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentCompletion15417);
							lv_op_0_0 = ruleAssignmentOperator();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAssignmentCompletionRule());
							}
							set(
									current,
									"op",
									lv_op_0_0,
									"AssignmentOperator");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7081:2: ( (lv_rightHandSide_1_0= ruleSequenceElement
					// ) )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7082:1: (lv_rightHandSide_1_0= ruleSequenceElement )
					{
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7082:1: (lv_rightHandSide_1_0=
						// ruleSequenceElement )
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7083:3: lv_rightHandSide_1_0=
						// ruleSequenceElement
						{

							newCompositeNode(grammarAccess.getAssignmentCompletionAccess().getRightHandSideSequenceElementParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleSequenceElement_in_ruleAssignmentCompletion15438);
							lv_rightHandSide_1_0 = ruleSequenceElement();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getAssignmentCompletionRule());
							}
							set(
									current,
									"rightHandSide",
									lv_rightHandSide_1_0,
									"SequenceElement");
							afterParserOrEnumRuleCall();


						}


					}


				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAssignmentCompletion"


	// $ANTLR start "ruleBooleanValue"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7107:1: ruleBooleanValue returns [Enumerator current=null] : (
	// (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
	public final Enumerator ruleBooleanValue() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7109:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1=
			// 'false' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7110:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false'
			// ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7110:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1=
				// 'false' ) )
				int alt92 = 2;
				int LA92_0 = input.LA(1);

				if ((LA92_0 == 83)) {
					alt92 = 1;
				}
				else if ((LA92_0 == 84)) {
					alt92 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 92, 0, input);

					throw nvae;
				}
				switch (alt92) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7110:2: (enumLiteral_0= 'true' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7110:2: (enumLiteral_0= 'true' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7110:4: enumLiteral_0= 'true'
					{
						enumLiteral_0 = (Token) match(input, 83, FOLLOW_83_in_ruleBooleanValue15488);

						current = grammarAccess.getBooleanValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTRUEEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7116:6: (enumLiteral_1= 'false' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7116:6: (enumLiteral_1= 'false' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7116:8: enumLiteral_1= 'false'
					{
						enumLiteral_1 = (Token) match(input, 84, FOLLOW_84_in_ruleBooleanValue15505);

						current = grammarAccess.getBooleanValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getBooleanValueAccess().getFALSEEnumLiteralDeclaration_1());


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleBooleanValue"


	// $ANTLR start "ruleLinkOperationKind"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7126:1: ruleLinkOperationKind returns [Enumerator current=null] : (
	// (enumLiteral_0= 'createLink' ) | (enumLiteral_1= 'destroyLink' ) | (enumLiteral_2= 'clearAssoc' ) ) ;
	public final Enumerator ruleLinkOperationKind() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;
		Token enumLiteral_2 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7128:28: ( ( (enumLiteral_0= 'createLink' ) |
			// (enumLiteral_1= 'destroyLink' ) | (enumLiteral_2= 'clearAssoc' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7129:1: ( (enumLiteral_0= 'createLink' ) | (enumLiteral_1=
			// 'destroyLink' ) | (enumLiteral_2= 'clearAssoc' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7129:1: ( (enumLiteral_0= 'createLink' ) |
				// (enumLiteral_1= 'destroyLink' ) | (enumLiteral_2= 'clearAssoc' ) )
				int alt93 = 3;
				switch (input.LA(1)) {
				case 85: {
					alt93 = 1;
				}
					break;
				case 86: {
					alt93 = 2;
				}
					break;
				case 87: {
					alt93 = 3;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 93, 0, input);

					throw nvae;
				}

				switch (alt93) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7129:2: (enumLiteral_0= 'createLink' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7129:2: (enumLiteral_0= 'createLink' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7129:4: enumLiteral_0= 'createLink'
					{
						enumLiteral_0 = (Token) match(input, 85, FOLLOW_85_in_ruleLinkOperationKind15550);

						current = grammarAccess.getLinkOperationKindAccess().getCREATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getLinkOperationKindAccess().getCREATEEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7135:6: (enumLiteral_1= 'destroyLink' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7135:6: (enumLiteral_1= 'destroyLink' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7135:8: enumLiteral_1= 'destroyLink'
					{
						enumLiteral_1 = (Token) match(input, 86, FOLLOW_86_in_ruleLinkOperationKind15567);

						current = grammarAccess.getLinkOperationKindAccess().getDESTROYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getLinkOperationKindAccess().getDESTROYEnumLiteralDeclaration_1());


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7141:6: (enumLiteral_2= 'clearAssoc' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7141:6: (enumLiteral_2= 'clearAssoc' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7141:8: enumLiteral_2= 'clearAssoc'
					{
						enumLiteral_2 = (Token) match(input, 87, FOLLOW_87_in_ruleLinkOperationKind15584);

						current = grammarAccess.getLinkOperationKindAccess().getCLEAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_2, grammarAccess.getLinkOperationKindAccess().getCLEAREnumLiteralDeclaration_2());


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleLinkOperationKind"


	// $ANTLR start "ruleSelectOrRejectOperator"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7151:1: ruleSelectOrRejectOperator returns [Enumerator current=null]
	// : ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) ) ;
	public final Enumerator ruleSelectOrRejectOperator() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7153:28: ( ( (enumLiteral_0= 'select' ) | (enumLiteral_1=
			// 'reject' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7154:1: ( (enumLiteral_0= 'select' ) | (enumLiteral_1=
			// 'reject' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7154:1: ( (enumLiteral_0= 'select' ) | (enumLiteral_1=
				// 'reject' ) )
				int alt94 = 2;
				int LA94_0 = input.LA(1);

				if ((LA94_0 == 88)) {
					alt94 = 1;
				}
				else if ((LA94_0 == 89)) {
					alt94 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 94, 0, input);

					throw nvae;
				}
				switch (alt94) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7154:2: (enumLiteral_0= 'select' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7154:2: (enumLiteral_0= 'select' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7154:4: enumLiteral_0= 'select'
					{
						enumLiteral_0 = (Token) match(input, 88, FOLLOW_88_in_ruleSelectOrRejectOperator15629);

						current = grammarAccess.getSelectOrRejectOperatorAccess().getSELECTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getSelectOrRejectOperatorAccess().getSELECTEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7160:6: (enumLiteral_1= 'reject' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7160:6: (enumLiteral_1= 'reject' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7160:8: enumLiteral_1= 'reject'
					{
						enumLiteral_1 = (Token) match(input, 89, FOLLOW_89_in_ruleSelectOrRejectOperator15646);

						current = grammarAccess.getSelectOrRejectOperatorAccess().getREJECTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getSelectOrRejectOperatorAccess().getREJECTEnumLiteralDeclaration_1());


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleSelectOrRejectOperator"


	// $ANTLR start "ruleCollectOrIterateOperator"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7170:1: ruleCollectOrIterateOperator returns [Enumerator
	// current=null] : ( (enumLiteral_0= 'collect' ) | (enumLiteral_1= 'iterate' ) ) ;
	public final Enumerator ruleCollectOrIterateOperator() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7172:28: ( ( (enumLiteral_0= 'collect' ) | (enumLiteral_1=
			// 'iterate' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7173:1: ( (enumLiteral_0= 'collect' ) | (enumLiteral_1=
			// 'iterate' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7173:1: ( (enumLiteral_0= 'collect' ) | (enumLiteral_1=
				// 'iterate' ) )
				int alt95 = 2;
				int LA95_0 = input.LA(1);

				if ((LA95_0 == 90)) {
					alt95 = 1;
				}
				else if ((LA95_0 == 91)) {
					alt95 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 95, 0, input);

					throw nvae;
				}
				switch (alt95) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7173:2: (enumLiteral_0= 'collect' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7173:2: (enumLiteral_0= 'collect' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7173:4: enumLiteral_0= 'collect'
					{
						enumLiteral_0 = (Token) match(input, 90, FOLLOW_90_in_ruleCollectOrIterateOperator15691);

						current = grammarAccess.getCollectOrIterateOperatorAccess().getCOLLECTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getCollectOrIterateOperatorAccess().getCOLLECTEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7179:6: (enumLiteral_1= 'iterate' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7179:6: (enumLiteral_1= 'iterate' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7179:8: enumLiteral_1= 'iterate'
					{
						enumLiteral_1 = (Token) match(input, 91, FOLLOW_91_in_ruleCollectOrIterateOperator15708);

						current = grammarAccess.getCollectOrIterateOperatorAccess().getITERATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getCollectOrIterateOperatorAccess().getITERATEEnumLiteralDeclaration_1());


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleCollectOrIterateOperator"


	// $ANTLR start "ruleForAllOrExistsOrOneOperator"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7189:1: ruleForAllOrExistsOrOneOperator returns [Enumerator
	// current=null] : ( (enumLiteral_0= 'forAll' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'one' ) ) ;
	public final Enumerator ruleForAllOrExistsOrOneOperator() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;
		Token enumLiteral_2 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7191:28: ( ( (enumLiteral_0= 'forAll' ) | (enumLiteral_1=
			// 'exists' ) | (enumLiteral_2= 'one' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7192:1: ( (enumLiteral_0= 'forAll' ) | (enumLiteral_1=
			// 'exists' ) | (enumLiteral_2= 'one' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7192:1: ( (enumLiteral_0= 'forAll' ) | (enumLiteral_1=
				// 'exists' ) | (enumLiteral_2= 'one' ) )
				int alt96 = 3;
				switch (input.LA(1)) {
				case 92: {
					alt96 = 1;
				}
					break;
				case 93: {
					alt96 = 2;
				}
					break;
				case 94: {
					alt96 = 3;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 96, 0, input);

					throw nvae;
				}

				switch (alt96) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7192:2: (enumLiteral_0= 'forAll' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7192:2: (enumLiteral_0= 'forAll' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7192:4: enumLiteral_0= 'forAll'
					{
						enumLiteral_0 = (Token) match(input, 92, FOLLOW_92_in_ruleForAllOrExistsOrOneOperator15753);

						current = grammarAccess.getForAllOrExistsOrOneOperatorAccess().getFORALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getForAllOrExistsOrOneOperatorAccess().getFORALLEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7198:6: (enumLiteral_1= 'exists' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7198:6: (enumLiteral_1= 'exists' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7198:8: enumLiteral_1= 'exists'
					{
						enumLiteral_1 = (Token) match(input, 93, FOLLOW_93_in_ruleForAllOrExistsOrOneOperator15770);

						current = grammarAccess.getForAllOrExistsOrOneOperatorAccess().getEXISTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getForAllOrExistsOrOneOperatorAccess().getEXISTSEnumLiteralDeclaration_1());


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7204:6: (enumLiteral_2= 'one' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7204:6: (enumLiteral_2= 'one' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7204:8: enumLiteral_2= 'one'
					{
						enumLiteral_2 = (Token) match(input, 94, FOLLOW_94_in_ruleForAllOrExistsOrOneOperator15787);

						current = grammarAccess.getForAllOrExistsOrOneOperatorAccess().getONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_2, grammarAccess.getForAllOrExistsOrOneOperatorAccess().getONEEnumLiteralDeclaration_2());


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleForAllOrExistsOrOneOperator"


	// $ANTLR start "ruleAnnotationKind"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7214:1: ruleAnnotationKind returns [Enumerator current=null] : (
	// (enumLiteral_0= 'isolated' ) | (enumLiteral_1= 'determined' ) | (enumLiteral_2= 'assured' ) | (enumLiteral_3= 'parallel' ) ) ;
	public final Enumerator ruleAnnotationKind() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;
		Token enumLiteral_2 = null;
		Token enumLiteral_3 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7216:28: ( ( (enumLiteral_0= 'isolated' ) | (enumLiteral_1=
			// 'determined' ) | (enumLiteral_2= 'assured' ) | (enumLiteral_3= 'parallel' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7217:1: ( (enumLiteral_0= 'isolated' ) | (enumLiteral_1=
			// 'determined' ) | (enumLiteral_2= 'assured' ) | (enumLiteral_3= 'parallel' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7217:1: ( (enumLiteral_0= 'isolated' ) | (enumLiteral_1=
				// 'determined' ) | (enumLiteral_2= 'assured' ) | (enumLiteral_3= 'parallel' ) )
				int alt97 = 4;
				switch (input.LA(1)) {
				case 95: {
					alt97 = 1;
				}
					break;
				case 96: {
					alt97 = 2;
				}
					break;
				case 97: {
					alt97 = 3;
				}
					break;
				case 98: {
					alt97 = 4;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 97, 0, input);

					throw nvae;
				}

				switch (alt97) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7217:2: (enumLiteral_0= 'isolated' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7217:2: (enumLiteral_0= 'isolated' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7217:4: enumLiteral_0= 'isolated'
					{
						enumLiteral_0 = (Token) match(input, 95, FOLLOW_95_in_ruleAnnotationKind15832);

						current = grammarAccess.getAnnotationKindAccess().getISOLATEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getAnnotationKindAccess().getISOLATEDEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7223:6: (enumLiteral_1= 'determined' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7223:6: (enumLiteral_1= 'determined' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7223:8: enumLiteral_1= 'determined'
					{
						enumLiteral_1 = (Token) match(input, 96, FOLLOW_96_in_ruleAnnotationKind15849);

						current = grammarAccess.getAnnotationKindAccess().getDETERMINEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getAnnotationKindAccess().getDETERMINEDEnumLiteralDeclaration_1());


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7229:6: (enumLiteral_2= 'assured' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7229:6: (enumLiteral_2= 'assured' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7229:8: enumLiteral_2= 'assured'
					{
						enumLiteral_2 = (Token) match(input, 97, FOLLOW_97_in_ruleAnnotationKind15866);

						current = grammarAccess.getAnnotationKindAccess().getASSUREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_2, grammarAccess.getAnnotationKindAccess().getASSUREDEnumLiteralDeclaration_2());


					}


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7235:6: (enumLiteral_3= 'parallel' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7235:6: (enumLiteral_3= 'parallel' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7235:8: enumLiteral_3= 'parallel'
					{
						enumLiteral_3 = (Token) match(input, 98, FOLLOW_98_in_ruleAnnotationKind15883);

						current = grammarAccess.getAnnotationKindAccess().getPARALLELEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_3, grammarAccess.getAnnotationKindAccess().getPARALLELEnumLiteralDeclaration_3());


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAnnotationKind"


	// $ANTLR start "ruleAssignmentOperator"
	// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7245:1: ruleAssignmentOperator returns [Enumerator current=null] : (
	// (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '%=' ) | (enumLiteral_5= '/=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) |
	// (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) ) ;
	public final Enumerator ruleAssignmentOperator() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;
		Token enumLiteral_2 = null;
		Token enumLiteral_3 = null;
		Token enumLiteral_4 = null;
		Token enumLiteral_5 = null;
		Token enumLiteral_6 = null;
		Token enumLiteral_7 = null;
		Token enumLiteral_8 = null;
		Token enumLiteral_9 = null;
		Token enumLiteral_10 = null;
		Token enumLiteral_11 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7247:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' )
			// | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '%=' ) | (enumLiteral_5= '/=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) |
			// (enumLiteral_11= '>>>=' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7248:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) |
			// (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '%=' ) | (enumLiteral_5= '/=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11=
			// '>>>=' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7248:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' )
				// | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '%=' ) | (enumLiteral_5= '/=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) |
				// (enumLiteral_11= '>>>=' ) )
				int alt98 = 12;
				switch (input.LA(1)) {
				case 12: {
					alt98 = 1;
				}
					break;
				case 99: {
					alt98 = 2;
				}
					break;
				case 100: {
					alt98 = 3;
				}
					break;
				case 101: {
					alt98 = 4;
				}
					break;
				case 102: {
					alt98 = 5;
				}
					break;
				case 103: {
					alt98 = 6;
				}
					break;
				case 104: {
					alt98 = 7;
				}
					break;
				case 105: {
					alt98 = 8;
				}
					break;
				case 106: {
					alt98 = 9;
				}
					break;
				case 107: {
					alt98 = 10;
				}
					break;
				case 108: {
					alt98 = 11;
				}
					break;
				case 109: {
					alt98 = 12;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 98, 0, input);

					throw nvae;
				}

				switch (alt98) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7248:2: (enumLiteral_0= '=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7248:2: (enumLiteral_0= '=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7248:4: enumLiteral_0= '='
					{
						enumLiteral_0 = (Token) match(input, 12, FOLLOW_12_in_ruleAssignmentOperator15928);

						current = grammarAccess.getAssignmentOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getASSIGNEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7254:6: (enumLiteral_1= '+=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7254:6: (enumLiteral_1= '+=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7254:8: enumLiteral_1= '+='
					{
						enumLiteral_1 = (Token) match(input, 99, FOLLOW_99_in_ruleAssignmentOperator15945);

						current = grammarAccess.getAssignmentOperatorAccess().getPLUSASSIGNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getPLUSASSIGNEnumLiteralDeclaration_1());


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7260:6: (enumLiteral_2= '-=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7260:6: (enumLiteral_2= '-=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7260:8: enumLiteral_2= '-='
					{
						enumLiteral_2 = (Token) match(input, 100, FOLLOW_100_in_ruleAssignmentOperator15962);

						current = grammarAccess.getAssignmentOperatorAccess().getMINUSASSIGNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getMINUSASSIGNEnumLiteralDeclaration_2());


					}


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7266:6: (enumLiteral_3= '*=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7266:6: (enumLiteral_3= '*=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7266:8: enumLiteral_3= '*='
					{
						enumLiteral_3 = (Token) match(input, 101, FOLLOW_101_in_ruleAssignmentOperator15979);

						current = grammarAccess.getAssignmentOperatorAccess().getMULTASSIGNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getMULTASSIGNEnumLiteralDeclaration_3());


					}


				}
					break;
				case 5:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7272:6: (enumLiteral_4= '%=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7272:6: (enumLiteral_4= '%=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7272:8: enumLiteral_4= '%='
					{
						enumLiteral_4 = (Token) match(input, 102, FOLLOW_102_in_ruleAssignmentOperator15996);

						current = grammarAccess.getAssignmentOperatorAccess().getMODASSIGNEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getMODASSIGNEnumLiteralDeclaration_4());


					}


				}
					break;
				case 6:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7278:6: (enumLiteral_5= '/=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7278:6: (enumLiteral_5= '/=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7278:8: enumLiteral_5= '/='
					{
						enumLiteral_5 = (Token) match(input, 103, FOLLOW_103_in_ruleAssignmentOperator16013);

						current = grammarAccess.getAssignmentOperatorAccess().getDIVASSIGNEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getDIVASSIGNEnumLiteralDeclaration_5());


					}


				}
					break;
				case 7:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7284:6: (enumLiteral_6= '&=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7284:6: (enumLiteral_6= '&=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7284:8: enumLiteral_6= '&='
					{
						enumLiteral_6 = (Token) match(input, 104, FOLLOW_104_in_ruleAssignmentOperator16030);

						current = grammarAccess.getAssignmentOperatorAccess().getANDASSIGNEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getANDASSIGNEnumLiteralDeclaration_6());


					}


				}
					break;
				case 8:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7290:6: (enumLiteral_7= '|=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7290:6: (enumLiteral_7= '|=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7290:8: enumLiteral_7= '|='
					{
						enumLiteral_7 = (Token) match(input, 105, FOLLOW_105_in_ruleAssignmentOperator16047);

						current = grammarAccess.getAssignmentOperatorAccess().getORASSIGNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getORASSIGNEnumLiteralDeclaration_7());


					}


				}
					break;
				case 9:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7296:6: (enumLiteral_8= '^=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7296:6: (enumLiteral_8= '^=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7296:8: enumLiteral_8= '^='
					{
						enumLiteral_8 = (Token) match(input, 106, FOLLOW_106_in_ruleAssignmentOperator16064);

						current = grammarAccess.getAssignmentOperatorAccess().getXORASSIGNEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getXORASSIGNEnumLiteralDeclaration_8());


					}


				}
					break;
				case 10:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7302:6: (enumLiteral_9= '<<=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7302:6: (enumLiteral_9= '<<=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7302:8: enumLiteral_9= '<<='
					{
						enumLiteral_9 = (Token) match(input, 107, FOLLOW_107_in_ruleAssignmentOperator16081);

						current = grammarAccess.getAssignmentOperatorAccess().getLSHIFTASSIGNEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getLSHIFTASSIGNEnumLiteralDeclaration_9());


					}


				}
					break;
				case 11:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7308:6: (enumLiteral_10= '>>=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7308:6: (enumLiteral_10= '>>=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7308:8: enumLiteral_10= '>>='
					{
						enumLiteral_10 = (Token) match(input, 108, FOLLOW_108_in_ruleAssignmentOperator16098);

						current = grammarAccess.getAssignmentOperatorAccess().getRSHIFTASSIGNEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOperatorAccess().getRSHIFTASSIGNEnumLiteralDeclaration_10());


					}


				}
					break;
				case 12:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7314:6: (enumLiteral_11= '>>>=' )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7314:6: (enumLiteral_11= '>>>=' )
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/parser/antlr/internal/InternalAppliedStereotypeProperty.g:7314:8: enumLiteral_11= '>>>='
					{
						enumLiteral_11 = (Token) match(input, 109, FOLLOW_109_in_ruleAssignmentOperator16115);

						current = grammarAccess.getAssignmentOperatorAccess().getURSHIFTASSIGNEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_11, grammarAccess.getAssignmentOperatorAccess().getURSHIFTASSIGNEnumLiteralDeclaration_11());


					}


				}
					break;

				}


			}

			leaveRule();
		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "ruleAssignmentOperator"

	// Delegated rules


	protected DFA37 dfa37 = new DFA37(this);
	static final String DFA37_eotS =
			"\13\uffff";
	static final String DFA37_eofS =
			"\3\uffff\1\12\7\uffff";
	static final String DFA37_minS =
			"\1\56\3\6\7\uffff";
	static final String DFA37_maxS =
			"\1\61\1\127\1\136\1\155\7\uffff";
	static final String DFA37_acceptS =
			"\4\uffff\1\3\1\7\1\6\1\5\1\4\1\1\1\2";
	static final String DFA37_specialS =
			"\13\uffff}>";
	static final String[] DFA37_transitionS = {
			"\1\1\2\uffff\1\2",
			"\1\3\65\uffff\1\5\30\uffff\3\4",
			"\1\10\53\uffff\1\7\1\uffff\1\6\43\uffff\7\6",
			"\1\12\5\uffff\2\12\3\uffff\3\12\1\uffff\1\11\25\12\3\uffff" +
					"\4\12\10\uffff\2\12\5\uffff\1\12\17\uffff\2\12\20\uffff\13\12",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
	static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
	static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
	static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
	static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
	static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
	static final short[][] DFA37_transition;

	static {
		int numStates = DFA37_transitionS.length;
		DFA37_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
		}
	}

	class DFA37 extends DFA {

		public DFA37(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 37;
			this.eot = DFA37_eot;
			this.eof = DFA37_eof;
			this.min = DFA37_min;
			this.max = DFA37_max;
			this.accept = DFA37_accept;
			this.special = DFA37_special;
			this.transition = DFA37_transition;
		}

		@Override
		public String getDescription() {
			return "2173:1: (this_OperationCallExpression_0= ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression | this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression )";
		}
	}


	public static final BitSet FOLLOW_ruleAppliedStereotypePropertyRule_in_entryRuleAppliedStereotypePropertyRule75 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAppliedStereotypePropertyRule85 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpressionValueRule_in_ruleAppliedStereotypePropertyRule130 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpressionValueRule_in_entryRuleExpressionValueRule165 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleExpressionValueRule175 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_12_in_ruleExpressionValueRule212 = new BitSet(new long[] { 0x03E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleSequenceElement_in_ruleExpressionValueRule233 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLITERAL_in_entryRuleLITERAL271 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleLITERAL281 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_ruleLITERAL328 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleLITERAL355 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSTRING_LITERAL_in_ruleLITERAL382 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL417 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL427 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanValue_in_ruleBOOLEAN_LITERAL472 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL507 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL517 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleINTEGER_LITERAL_in_ruleNUMBER_LITERAL564 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUNLIMITED_LITERAL_in_ruleNUMBER_LITERAL591 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleINTEGER_LITERAL_in_entryRuleINTEGER_LITERAL626 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER_LITERAL636 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INTEGER_VALUE_in_ruleINTEGER_LITERAL677 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUNLIMITED_LITERAL_in_entryRuleUNLIMITED_LITERAL717 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleUNLIMITED_LITERAL727 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_13_in_ruleUNLIMITED_LITERAL769 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSTRING_LITERAL_in_entryRuleSTRING_LITERAL817 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSTRING_LITERAL827 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_ruleSTRING_LITERAL868 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNameExpression_in_entryRuleNameExpression908 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNameExpression918 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_14_in_ruleNameExpression965 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_15_in_ruleNameExpression994 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNamePath_in_ruleNameExpression1031 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleNameExpression1049 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleQualifiedNamePath_in_ruleNameExpression1083 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleNameExpression1101 = new BitSet(new long[] { 0x03E2F9800020E072L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleTuple_in_ruleNameExpression1128 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSequenceConstructionOrAccessCompletion_in_ruleNameExpression1155 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_14_in_ruleNameExpression1181 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_15_in_ruleNameExpression1210 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleNameExpression1251 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedNamePath_in_entryRuleQualifiedNamePath1288 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamePath1298 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnqualifiedName_in_ruleQualifiedNamePath1344 = new BitSet(new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_16_in_ruleQualifiedNamePath1356 = new BitSet(new long[] { 0x0000000000000042L });
	public static final BitSet FOLLOW_ruleUnqualifiedName_in_entryRuleUnqualifiedName1393 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedName1403 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleUnqualifiedName1445 = new BitSet(new long[] { 0x0000000000020002L });
	public static final BitSet FOLLOW_ruleTemplateBinding_in_ruleUnqualifiedName1471 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTemplateBinding_in_entryRuleTemplateBinding1508 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleTemplateBinding1518 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_17_in_ruleTemplateBinding1555 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleNamedTemplateBinding_in_ruleTemplateBinding1576 = new BitSet(new long[] { 0x00000000000C0000L });
	public static final BitSet FOLLOW_18_in_ruleTemplateBinding1589 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleNamedTemplateBinding_in_ruleTemplateBinding1610 = new BitSet(new long[] { 0x00000000000C0000L });
	public static final BitSet FOLLOW_19_in_ruleTemplateBinding1624 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNamedTemplateBinding_in_entryRuleNamedTemplateBinding1660 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNamedTemplateBinding1670 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleNamedTemplateBinding1712 = new BitSet(new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_20_in_ruleNamedTemplateBinding1729 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleNamedTemplateBinding1750 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_entryRuleQualifiedNameWithBinding1786 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithBinding1796 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithBinding1838 = new BitSet(new long[] { 0x0000000000030002L });
	public static final BitSet FOLLOW_ruleTemplateBinding_in_ruleQualifiedNameWithBinding1864 = new BitSet(new long[] { 0x0000000000010002L });
	public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithBinding1878 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameWithBinding1899 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple1937 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleTuple1947 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_ruleTuple1993 = new BitSet(new long[] { 0x01E039800060E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleTupleElement_in_ruleTuple2015 = new BitSet(new long[] { 0x0000000000440000L });
	public static final BitSet FOLLOW_18_in_ruleTuple2028 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleTupleElement_in_ruleTuple2049 = new BitSet(new long[] { 0x0000000000440000L });
	public static final BitSet FOLLOW_22_in_ruleTuple2065 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTupleElement_in_entryRuleTupleElement2101 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleTupleElement2111 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleTupleElement2156 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2191 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleExpression2201 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleConditionalTestExpression_in_ruleExpression2247 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleConditionalTestExpression_in_entryRuleConditionalTestExpression2281 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleConditionalTestExpression2291 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleConditionalTestExpression2337 = new BitSet(new long[] { 0x0000000000800002L });
	public static final BitSet FOLLOW_23_in_ruleConditionalTestExpression2350 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleConditionalTestExpression_in_ruleConditionalTestExpression2371 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_24_in_ruleConditionalTestExpression2383 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleConditionalTestExpression_in_ruleConditionalTestExpression2404 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression2442 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression2452 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2498 = new BitSet(new long[] { 0x0000000002000002L });
	public static final BitSet FOLLOW_25_in_ruleConditionalOrExpression2511 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2532 = new BitSet(new long[] { 0x0000000002000002L });
	public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression2570 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression2580 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInclusiveOrExpression_in_ruleConditionalAndExpression2626 = new BitSet(new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_26_in_ruleConditionalAndExpression2639 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleInclusiveOrExpression_in_ruleConditionalAndExpression2660 = new BitSet(new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_ruleInclusiveOrExpression_in_entryRuleInclusiveOrExpression2698 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleInclusiveOrExpression2708 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_ruleInclusiveOrExpression2754 = new BitSet(new long[] { 0x0000000008000002L });
	public static final BitSet FOLLOW_27_in_ruleInclusiveOrExpression2767 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_ruleInclusiveOrExpression2788 = new BitSet(new long[] { 0x0000000008000002L });
	public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_entryRuleExclusiveOrExpression2826 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleExclusiveOrExpression2836 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAndExpression_in_ruleExclusiveOrExpression2882 = new BitSet(new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_28_in_ruleExclusiveOrExpression2895 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleAndExpression_in_ruleExclusiveOrExpression2916 = new BitSet(new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2954 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2964 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression3010 = new BitSet(new long[] { 0x0000000020000002L });
	public static final BitSet FOLLOW_29_in_ruleAndExpression3023 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression3044 = new BitSet(new long[] { 0x0000000020000002L });
	public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression3082 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression3092 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassificationExpression_in_ruleEqualityExpression3138 = new BitSet(new long[] { 0x00000000C0000002L });
	public static final BitSet FOLLOW_30_in_ruleEqualityExpression3159 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_31_in_ruleEqualityExpression3188 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleClassificationExpression_in_ruleEqualityExpression3225 = new BitSet(new long[] { 0x00000000C0000002L });
	public static final BitSet FOLLOW_ruleClassificationExpression_in_entryRuleClassificationExpression3263 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleClassificationExpression3273 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleClassificationExpression3319 = new BitSet(new long[] { 0x0000000300000002L });
	public static final BitSet FOLLOW_32_in_ruleClassificationExpression3340 = new BitSet(new long[] { 0x000000000000C040L });
	public static final BitSet FOLLOW_33_in_ruleClassificationExpression3369 = new BitSet(new long[] { 0x000000000000C040L });
	public static final BitSet FOLLOW_ruleNameExpression_in_ruleClassificationExpression3406 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3444 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression3454 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleShiftExpression_in_ruleRelationalExpression3500 = new BitSet(new long[] { 0x0000000C000A0002L });
	public static final BitSet FOLLOW_17_in_ruleRelationalExpression3521 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_19_in_ruleRelationalExpression3550 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_34_in_ruleRelationalExpression3579 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_35_in_ruleRelationalExpression3608 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleShiftExpression_in_ruleRelationalExpression3645 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression3683 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression3693 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression3739 = new BitSet(new long[] { 0x0000007000000002L });
	public static final BitSet FOLLOW_36_in_ruleShiftExpression3760 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_37_in_ruleShiftExpression3789 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_38_in_ruleShiftExpression3818 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression3855 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3893 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression3903 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3949 = new BitSet(new long[] { 0x0000018000000002L });
	public static final BitSet FOLLOW_39_in_ruleAdditiveExpression3970 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_40_in_ruleAdditiveExpression3999 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4036 = new BitSet(new long[] { 0x0000018000000002L });
	public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression4074 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression4084 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression4130 = new BitSet(new long[] { 0x0000060000002002L });
	public static final BitSet FOLLOW_13_in_ruleMultiplicativeExpression4151 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_41_in_ruleMultiplicativeExpression4180 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_42_in_ruleMultiplicativeExpression4209 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression4246 = new BitSet(new long[] { 0x0000060000002002L });
	public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4284 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4294 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_43_in_ruleUnaryExpression4339 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_40_in_ruleUnaryExpression4368 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_39_in_ruleUnaryExpression4397 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_44_in_ruleUnaryExpression4426 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_45_in_ruleUnaryExpression4455 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression4493 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4529 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4539 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleValueSpecification_in_rulePrimaryExpression4584 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_entryRuleSuffixExpression4619 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSuffixExpression4629 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleOperationCallExpression_in_ruleSuffixExpression4676 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePropertyCallExpression_in_ruleSuffixExpression4703 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLinkOperationExpression_in_ruleSuffixExpression4730 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceOperationExpression_in_ruleSuffixExpression4757 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceReductionExpression_in_ruleSuffixExpression4784 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceExpansionExpression_in_ruleSuffixExpression4811 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassExtentExpression_in_ruleSuffixExpression4838 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleOperationCallExpression_in_entryRuleOperationCallExpression4873 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallExpression4883 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_46_in_ruleOperationCallExpression4920 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleOperationCallExpression4937 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_ruleTuple_in_ruleOperationCallExpression4963 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleOperationCallExpression4984 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePropertyCallExpression_in_entryRulePropertyCallExpression5021 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePropertyCallExpression5031 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_46_in_rulePropertyCallExpression5068 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_rulePropertyCallExpression5085 = new BitSet(new long[] { 0x0002C00000000002L });
	public static final BitSet FOLLOW_47_in_rulePropertyCallExpression5103 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_rulePropertyCallExpression5124 = new BitSet(new long[] { 0x0001000000000000L });
	public static final BitSet FOLLOW_48_in_rulePropertyCallExpression5136 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_rulePropertyCallExpression5159 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLinkOperationExpression_in_entryRuleLinkOperationExpression5196 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleLinkOperationExpression5206 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_46_in_ruleLinkOperationExpression5243 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000E00000L });
	public static final BitSet FOLLOW_ruleLinkOperationKind_in_ruleLinkOperationExpression5264 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_ruleLinkOperationTuple_in_ruleLinkOperationExpression5285 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLinkOperationTuple_in_entryRuleLinkOperationTuple5321 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleLinkOperationTuple5331 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_ruleLinkOperationTuple5368 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleLinkOperationTupleElement_in_ruleLinkOperationTuple5389 = new BitSet(new long[] { 0x0000000000440000L });
	public static final BitSet FOLLOW_18_in_ruleLinkOperationTuple5402 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleLinkOperationTupleElement_in_ruleLinkOperationTuple5423 = new BitSet(new long[] { 0x0000000000440000L });
	public static final BitSet FOLLOW_22_in_ruleLinkOperationTuple5437 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLinkOperationTupleElement_in_entryRuleLinkOperationTupleElement5473 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleLinkOperationTupleElement5483 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleLinkOperationTupleElement5525 = new BitSet(new long[] { 0x0000800000100000L });
	public static final BitSet FOLLOW_47_in_ruleLinkOperationTupleElement5543 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleLinkOperationTupleElement5564 = new BitSet(new long[] { 0x0001000000000000L });
	public static final BitSet FOLLOW_48_in_ruleLinkOperationTupleElement5576 = new BitSet(new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_20_in_ruleLinkOperationTupleElement5590 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleLinkOperationTupleElement5611 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceOperationExpression_in_entryRuleSequenceOperationExpression5647 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSequenceOperationExpression5657 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_49_in_ruleSequenceOperationExpression5694 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleSequenceOperationExpression5715 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_ruleTuple_in_ruleSequenceOperationExpression5736 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleSequenceOperationExpression5757 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceReductionExpression_in_entryRuleSequenceReductionExpression5794 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSequenceReductionExpression5804 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_49_in_ruleSequenceReductionExpression5841 = new BitSet(new long[] { 0x0004000000000000L });
	public static final BitSet FOLLOW_50_in_ruleSequenceReductionExpression5853 = new BitSet(new long[] { 0x0008000000000040L });
	public static final BitSet FOLLOW_51_in_ruleSequenceReductionExpression5871 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleSequenceReductionExpression5906 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleSequenceReductionExpression5927 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceExpansionExpression_in_entryRuleSequenceExpansionExpression5964 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSequenceExpansionExpression5974 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelectOrRejectOperation_in_ruleSequenceExpansionExpression6021 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCollectOrIterateOperation_in_ruleSequenceExpansionExpression6048 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleForAllOrExistsOrOneOperation_in_ruleSequenceExpansionExpression6075 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIsUniqueOperation_in_ruleSequenceExpansionExpression6102 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelectOrRejectOperation_in_entryRuleSelectOrRejectOperation6137 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSelectOrRejectOperation6147 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_49_in_ruleSelectOrRejectOperation6184 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000003000000L });
	public static final BitSet FOLLOW_ruleSelectOrRejectOperator_in_ruleSelectOrRejectOperation6205 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleSelectOrRejectOperation6222 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleSelectOrRejectOperation6239 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleSelectOrRejectOperation6260 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleSelectOrRejectOperation6272 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleSelectOrRejectOperation6293 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCollectOrIterateOperation_in_entryRuleCollectOrIterateOperation6330 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleCollectOrIterateOperation6340 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_49_in_ruleCollectOrIterateOperation6377 = new BitSet(new long[] { 0x0000000000000000L, 0x000000000C000000L });
	public static final BitSet FOLLOW_ruleCollectOrIterateOperator_in_ruleCollectOrIterateOperation6398 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleCollectOrIterateOperation6415 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleCollectOrIterateOperation6432 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleCollectOrIterateOperation6453 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleCollectOrIterateOperation6465 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleCollectOrIterateOperation6486 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleForAllOrExistsOrOneOperation_in_entryRuleForAllOrExistsOrOneOperation6523 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleForAllOrExistsOrOneOperation6533 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_49_in_ruleForAllOrExistsOrOneOperation6570 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000070000000L });
	public static final BitSet FOLLOW_ruleForAllOrExistsOrOneOperator_in_ruleForAllOrExistsOrOneOperation6591 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleForAllOrExistsOrOneOperation6608 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleForAllOrExistsOrOneOperation6625 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleForAllOrExistsOrOneOperation6646 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleForAllOrExistsOrOneOperation6658 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleForAllOrExistsOrOneOperation6679 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIsUniqueOperation_in_entryRuleIsUniqueOperation6716 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleIsUniqueOperation6726 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_49_in_ruleIsUniqueOperation6763 = new BitSet(new long[] { 0x0010000000000000L });
	public static final BitSet FOLLOW_52_in_ruleIsUniqueOperation6775 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleIsUniqueOperation6792 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleIsUniqueOperation6809 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleIsUniqueOperation6830 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleIsUniqueOperation6842 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleIsUniqueOperation6863 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification6900 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification6910 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNameExpression_in_ruleValueSpecification6957 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLITERAL_in_ruleValueSpecification6984 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleThisExpression_in_ruleValueSpecification7011 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSuperInvocationExpression_in_ruleValueSpecification7038 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInstanceCreationExpression_in_ruleValueSpecification7065 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleValueSpecification7092 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNullExpression_in_ruleValueSpecification7119 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNonLiteralValueSpecification_in_entryRuleNonLiteralValueSpecification7154 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNonLiteralValueSpecification7164 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNameExpression_in_ruleNonLiteralValueSpecification7211 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleNonLiteralValueSpecification7238 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInstanceCreationExpression_in_ruleNonLiteralValueSpecification7265 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleThisExpression_in_ruleNonLiteralValueSpecification7292 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSuperInvocationExpression_in_ruleNonLiteralValueSpecification7319 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7354 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7364 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_ruleParenthesizedExpression7401 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression7422 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleParenthesizedExpression7434 = new BitSet(new long[] { 0x01C240000020C042L });
	public static final BitSet FOLLOW_ruleNonLiteralValueSpecification_in_ruleParenthesizedExpression7456 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleParenthesizedExpression7483 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression7521 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression7531 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_53_in_ruleNullExpression7577 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleThisExpression_in_entryRuleThisExpression7613 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleThisExpression7623 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_54_in_ruleThisExpression7669 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleThisExpression7690 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSuperInvocationExpression_in_entryRuleSuperInvocationExpression7727 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSuperInvocationExpression7737 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_55_in_ruleSuperInvocationExpression7774 = new BitSet(new long[] { 0x0000400000200000L });
	public static final BitSet FOLLOW_ruleTuple_in_ruleSuperInvocationExpression7796 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_46_in_ruleSuperInvocationExpression7815 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleSuperInvocationExpression7836 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_ruleTuple_in_ruleSuperInvocationExpression7857 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInstanceCreationExpression_in_entryRuleInstanceCreationExpression7895 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleInstanceCreationExpression7905 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_56_in_ruleInstanceCreationExpression7942 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleInstanceCreationExpression7963 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_ruleInstanceCreationTuple_in_ruleInstanceCreationExpression7984 = new BitSet(new long[] { 0x0002400000000002L });
	public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleInstanceCreationExpression8005 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInstanceCreationTuple_in_entryRuleInstanceCreationTuple8042 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleInstanceCreationTuple8052 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_ruleInstanceCreationTuple8098 = new BitSet(new long[] { 0x0000000000400040L });
	public static final BitSet FOLLOW_ruleInstanceCreationTupleElement_in_ruleInstanceCreationTuple8120 = new BitSet(new long[] { 0x0000000000440000L });
	public static final BitSet FOLLOW_18_in_ruleInstanceCreationTuple8133 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleInstanceCreationTupleElement_in_ruleInstanceCreationTuple8154 = new BitSet(new long[] { 0x0000000000440000L });
	public static final BitSet FOLLOW_22_in_ruleInstanceCreationTuple8170 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInstanceCreationTupleElement_in_entryRuleInstanceCreationTupleElement8206 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleInstanceCreationTupleElement8216 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleInstanceCreationTupleElement8258 = new BitSet(new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_20_in_ruleInstanceCreationTupleElement8275 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleInstanceCreationTupleElement8296 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceConstructionOrAccessCompletion_in_entryRuleSequenceConstructionOrAccessCompletion8332 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSequenceConstructionOrAccessCompletion8342 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_47_in_ruleSequenceConstructionOrAccessCompletion8386 = new BitSet(new long[] { 0x01E139800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleAccessCompletion_in_ruleSequenceConstructionOrAccessCompletion8421 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePartialSequenceConstructionCompletion_in_ruleSequenceConstructionOrAccessCompletion8448 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceConstructionOrAccessCompletion8477 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAccessCompletion_in_entryRuleAccessCompletion8513 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAccessCompletion8523 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleAccessCompletion8569 = new BitSet(new long[] { 0x0001000000000000L });
	public static final BitSet FOLLOW_48_in_ruleAccessCompletion8581 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePartialSequenceConstructionCompletion_in_entryRulePartialSequenceConstructionCompletion8617 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePartialSequenceConstructionCompletion8627 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_48_in_rulePartialSequenceConstructionCompletion8664 = new BitSet(new long[] { 0x03E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_rulePartialSequenceConstructionCompletion8685 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_entryRuleSequenceConstructionExpression8721 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSequenceConstructionExpression8731 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_57_in_ruleSequenceConstructionExpression8768 = new BitSet(new long[] { 0x03E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleSequenceElement_in_ruleSequenceConstructionExpression8789 = new BitSet(new long[] { 0x0C00000000040000L });
	public static final BitSet FOLLOW_18_in_ruleSequenceConstructionExpression8803 = new BitSet(new long[] { 0x03E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleSequenceElement_in_ruleSequenceConstructionExpression8824 = new BitSet(new long[] { 0x0800000000040000L });
	public static final BitSet FOLLOW_58_in_ruleSequenceConstructionExpression8845 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleSequenceConstructionExpression8866 = new BitSet(new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_59_in_ruleSequenceConstructionExpression8880 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceElement_in_entryRuleSequenceElement8916 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSequenceElement8926 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleSequenceElement8973 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceElement9000 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassExtentExpression_in_entryRuleClassExtentExpression9035 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleClassExtentExpression9045 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_46_in_ruleClassExtentExpression9091 = new BitSet(new long[] { 0x1000000000000000L });
	public static final BitSet FOLLOW_60_in_ruleClassExtentExpression9103 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleClassExtentExpression9115 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleClassExtentExpression9127 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock9163 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBlock9173 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_57_in_ruleBlock9210 = new BitSet(new long[] { 0x2BC000000000C1C0L, 0x000000000001EE4FL });
	public static final BitSet FOLLOW_ruleStatementSequence_in_ruleBlock9240 = new BitSet(new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_59_in_ruleBlock9253 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStatementSequence_in_entryRuleStatementSequence9289 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleStatementSequence9299 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDocumentedStatement_in_ruleStatementSequence9344 = new BitSet(new long[] { 0x23C000000000C1C2L, 0x000000000001EE4FL });
	public static final BitSet FOLLOW_ruleDocumentedStatement_in_entryRuleDocumentedStatement9380 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleDocumentedStatement9390 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleDocumentedStatement9434 = new BitSet(new long[] { 0x23C000000000C1C0L, 0x000000000001EE4FL });
	public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleDocumentedStatement9454 = new BitSet(new long[] { 0x23C000000000C1C0L, 0x000000000001EE4FL });
	public static final BitSet FOLLOW_ruleStatement_in_ruleDocumentedStatement9484 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInlineStatement_in_entryRuleInlineStatement9520 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleInlineStatement9530 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_61_in_ruleInlineStatement9567 = new BitSet(new long[] { 0x4000000000000000L });
	public static final BitSet FOLLOW_62_in_ruleInlineStatement9579 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleInlineStatement9591 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleInlineStatement9608 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleInlineStatement9625 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RULE_STRING_in_ruleInlineStatement9642 = new BitSet(new long[] { 0x8000000000000000L });
	public static final BitSet FOLLOW_63_in_ruleInlineStatement9659 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAnnotatedStatement_in_entryRuleAnnotatedStatement9695 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAnnotatedStatement9705 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_64_in_ruleAnnotatedStatement9742 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000780000000L });
	public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotatedStatement9763 = new BitSet(new long[] { 0x23C000000000C1C0L, 0x000000000001EE4FL });
	public static final BitSet FOLLOW_ruleStatement_in_ruleAnnotatedStatement9784 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement9820 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleStatement9830 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAnnotatedStatement_in_ruleStatement9877 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInlineStatement_in_ruleStatement9904 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBlockStatement_in_ruleStatement9931 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatement9958 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLocalNameDeclarationStatement_in_ruleStatement9985 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement10012 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement10039 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement10066 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDoStatement_in_ruleStatement10093 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement10120 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBreakStatement_in_ruleStatement10147 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleReturnStatement_in_ruleStatement10174 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAcceptStatement_in_ruleStatement10201 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassifyStatement_in_ruleStatement10228 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInvocationOrAssignementOrDeclarationStatement_in_ruleStatement10255 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSuperInvocationStatement_in_ruleStatement10282 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleThisInvocationStatement_in_ruleStatement10309 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInstanceCreationInvocationStatement_in_ruleStatement10336 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation10371 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation10381 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAnnotationKind_in_ruleAnnotation10427 = new BitSet(new long[] { 0x0000000000200002L });
	public static final BitSet FOLLOW_21_in_ruleAnnotation10440 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation10457 = new BitSet(new long[] { 0x0000000000440000L });
	public static final BitSet FOLLOW_18_in_ruleAnnotation10475 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation10492 = new BitSet(new long[] { 0x0000000000440000L });
	public static final BitSet FOLLOW_22_in_ruleAnnotation10511 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement10549 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBlockStatement10559 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBlock_in_ruleBlockStatement10604 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement10639 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleEmptyStatement10649 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleEmptyStatement10695 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLocalNameDeclarationStatement_in_entryRuleLocalNameDeclarationStatement10731 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleLocalNameDeclarationStatement10741 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_66_in_ruleLocalNameDeclarationStatement10778 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleLocalNameDeclarationStatement10795 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_24_in_ruleLocalNameDeclarationStatement10812 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleLocalNameDeclarationStatement10833 = new BitSet(new long[] { 0x0000800000001000L });
	public static final BitSet FOLLOW_47_in_ruleLocalNameDeclarationStatement10852 = new BitSet(new long[] { 0x0001000000000000L });
	public static final BitSet FOLLOW_48_in_ruleLocalNameDeclarationStatement10877 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_ruleLocalNameDeclarationStatement10891 = new BitSet(new long[] { 0x03E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleSequenceElement_in_ruleLocalNameDeclarationStatement10912 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleLocalNameDeclarationStatement10924 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement10960 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement10970 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_67_in_ruleIfStatement11007 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_ruleSequentialClauses_in_ruleIfStatement11028 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000010L });
	public static final BitSet FOLLOW_ruleFinalClause_in_ruleIfStatement11049 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSequentialClauses_in_entryRuleSequentialClauses11086 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSequentialClauses11096 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleConcurrentClauses_in_ruleSequentialClauses11142 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000010L });
	public static final BitSet FOLLOW_68_in_ruleSequentialClauses11155 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
	public static final BitSet FOLLOW_67_in_ruleSequentialClauses11167 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_ruleConcurrentClauses_in_ruleSequentialClauses11188 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000010L });
	public static final BitSet FOLLOW_ruleConcurrentClauses_in_entryRuleConcurrentClauses11226 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleConcurrentClauses11236 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNonFinalClause_in_ruleConcurrentClauses11282 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000020L });
	public static final BitSet FOLLOW_69_in_ruleConcurrentClauses11295 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
	public static final BitSet FOLLOW_67_in_ruleConcurrentClauses11307 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_ruleNonFinalClause_in_ruleConcurrentClauses11328 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000020L });
	public static final BitSet FOLLOW_ruleNonFinalClause_in_entryRuleNonFinalClause11366 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNonFinalClause11376 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_ruleNonFinalClause11413 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleNonFinalClause11434 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleNonFinalClause11446 = new BitSet(new long[] { 0x0200000000000000L });
	public static final BitSet FOLLOW_ruleBlock_in_ruleNonFinalClause11467 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleFinalClause_in_entryRuleFinalClause11503 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleFinalClause11513 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_68_in_ruleFinalClause11550 = new BitSet(new long[] { 0x0200000000000000L });
	public static final BitSet FOLLOW_ruleBlock_in_ruleFinalClause11571 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement11607 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement11617 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_70_in_ruleSwitchStatement11654 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleSwitchStatement11666 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchStatement11687 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleSwitchStatement11699 = new BitSet(new long[] { 0x0200000000000000L });
	public static final BitSet FOLLOW_57_in_ruleSwitchStatement11711 = new BitSet(new long[] { 0x0800000000000000L, 0x0000000000000180L });
	public static final BitSet FOLLOW_ruleSwitchClause_in_ruleSwitchStatement11732 = new BitSet(new long[] { 0x0800000000000000L, 0x0000000000000180L });
	public static final BitSet FOLLOW_ruleSwitchDefaultClause_in_ruleSwitchStatement11754 = new BitSet(new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_59_in_ruleSwitchStatement11767 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSwitchClause_in_entryRuleSwitchClause11803 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSwitchClause11813 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitchClause11859 = new BitSet(new long[] { 0x23C000000000C1C0L, 0x000000000001EECFL });
	public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitchClause11880 = new BitSet(new long[] { 0x23C000000000C1C0L, 0x000000000001EECFL });
	public static final BitSet FOLLOW_ruleNonEmptyStatementSequence_in_ruleSwitchClause11902 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase11938 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase11948 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_71_in_ruleSwitchCase11985 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchCase12006 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_24_in_ruleSwitchCase12018 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSwitchDefaultClause_in_entryRuleSwitchDefaultClause12054 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSwitchDefaultClause12064 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_72_in_ruleSwitchDefaultClause12101 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_24_in_ruleSwitchDefaultClause12113 = new BitSet(new long[] { 0x23C000000000C1C0L, 0x000000000001EECFL });
	public static final BitSet FOLLOW_ruleNonEmptyStatementSequence_in_ruleSwitchDefaultClause12134 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNonEmptyStatementSequence_in_entryRuleNonEmptyStatementSequence12170 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNonEmptyStatementSequence12180 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDocumentedStatement_in_ruleNonEmptyStatementSequence12225 = new BitSet(new long[] { 0x23C000000000C1C2L, 0x000000000001EE4FL });
	public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement12261 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement12271 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_73_in_ruleWhileStatement12308 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleWhileStatement12320 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleWhileStatement12341 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleWhileStatement12353 = new BitSet(new long[] { 0x0200000000000000L });
	public static final BitSet FOLLOW_ruleBlock_in_ruleWhileStatement12374 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDoStatement_in_entryRuleDoStatement12410 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleDoStatement12420 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_74_in_ruleDoStatement12457 = new BitSet(new long[] { 0x0200000000000000L });
	public static final BitSet FOLLOW_ruleBlock_in_ruleDoStatement12478 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000200L });
	public static final BitSet FOLLOW_73_in_ruleDoStatement12490 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleDoStatement12502 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleDoStatement12523 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleDoStatement12535 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleDoStatement12547 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement12583 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleForStatement12593 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_75_in_ruleForStatement12630 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleForStatement12642 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleForControl_in_ruleForStatement12663 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleForStatement12675 = new BitSet(new long[] { 0x0200000000000000L });
	public static final BitSet FOLLOW_ruleBlock_in_ruleForStatement12696 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleForControl_in_entryRuleForControl12732 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleForControl12742 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLoopVariableDefinition_in_ruleForControl12788 = new BitSet(new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_18_in_ruleForControl12801 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleLoopVariableDefinition_in_ruleForControl12822 = new BitSet(new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_ruleLoopVariableDefinition_in_entryRuleLoopVariableDefinition12860 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleLoopVariableDefinition12870 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleLoopVariableDefinition12913 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000001000L });
	public static final BitSet FOLLOW_76_in_ruleLoopVariableDefinition12930 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleLoopVariableDefinition12951 = new BitSet(new long[] { 0x0400000000000002L });
	public static final BitSet FOLLOW_58_in_ruleLoopVariableDefinition12964 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleLoopVariableDefinition12985 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleLoopVariableDefinition13016 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleLoopVariableDefinition13033 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_24_in_ruleLoopVariableDefinition13050 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleLoopVariableDefinition13071 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement13108 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBreakStatement13118 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_77_in_ruleBreakStatement13164 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleBreakStatement13176 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement13212 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement13222 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_78_in_ruleReturnStatement13259 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement13280 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleReturnStatement13292 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAcceptStatement_in_entryRuleAcceptStatement13328 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAcceptStatement13338 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAcceptClause_in_ruleAcceptStatement13384 = new BitSet(new long[] { 0x0200000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSimpleAcceptStatementCompletion_in_ruleAcceptStatement13406 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCompoundAcceptStatementCompletion_in_ruleAcceptStatement13433 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSimpleAcceptStatementCompletion_in_entryRuleSimpleAcceptStatementCompletion13470 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAcceptStatementCompletion13480 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleSimpleAcceptStatementCompletion13526 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCompoundAcceptStatementCompletion_in_entryRuleCompoundAcceptStatementCompletion13562 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleCompoundAcceptStatementCompletion13572 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBlock_in_ruleCompoundAcceptStatementCompletion13618 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000020L });
	public static final BitSet FOLLOW_69_in_ruleCompoundAcceptStatementCompletion13631 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000008000L });
	public static final BitSet FOLLOW_ruleAcceptBlock_in_ruleCompoundAcceptStatementCompletion13652 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000020L });
	public static final BitSet FOLLOW_ruleAcceptBlock_in_entryRuleAcceptBlock13690 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAcceptBlock13700 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAcceptClause_in_ruleAcceptBlock13746 = new BitSet(new long[] { 0x0200000000000000L });
	public static final BitSet FOLLOW_ruleBlock_in_ruleAcceptBlock13767 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAcceptClause_in_entryRuleAcceptClause13803 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAcceptClause13813 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_79_in_ruleAcceptClause13850 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ruleAcceptClause13862 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleAcceptClause13880 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_24_in_ruleAcceptClause13897 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameList_in_ruleAcceptClause13920 = new BitSet(new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_ruleAcceptClause13932 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassifyStatement_in_entryRuleClassifyStatement13968 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleClassifyStatement13978 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_80_in_ruleClassifyStatement14015 = new BitSet(new long[] { 0x01E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleExpression_in_ruleClassifyStatement14036 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000060000L });
	public static final BitSet FOLLOW_ruleClassificationClause_in_ruleClassifyStatement14057 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleClassifyStatement14069 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassificationClause_in_entryRuleClassificationClause14105 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleClassificationClause14115 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassificationFromClause_in_ruleClassificationClause14162 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000060000L });
	public static final BitSet FOLLOW_ruleClassificationToClause_in_ruleClassificationClause14183 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleReclassifyAllClause_in_ruleClassificationClause14213 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000060000L });
	public static final BitSet FOLLOW_ruleClassificationToClause_in_ruleClassificationClause14235 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassificationFromClause_in_entryRuleClassificationFromClause14272 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleClassificationFromClause14282 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_81_in_ruleClassificationFromClause14319 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameList_in_ruleClassificationFromClause14340 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClassificationToClause_in_entryRuleClassificationToClause14376 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleClassificationToClause14386 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_82_in_ruleClassificationToClause14423 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameList_in_ruleClassificationToClause14444 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleReclassifyAllClause_in_entryRuleReclassifyAllClause14480 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleReclassifyAllClause14490 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_81_in_ruleReclassifyAllClause14536 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_13_in_ruleReclassifyAllClause14548 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedNameList_in_entryRuleQualifiedNameList14584 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameList14594 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameList14640 = new BitSet(new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_18_in_ruleQualifiedNameList14653 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameList14674 = new BitSet(new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_ruleInvocationOrAssignementOrDeclarationStatement_in_entryRuleInvocationOrAssignementOrDeclarationStatement14712 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleInvocationOrAssignementOrDeclarationStatement14722 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNameExpression_in_ruleInvocationOrAssignementOrDeclarationStatement14768 = new BitSet(new long[] { 0x0000800000001040L, 0x00003FF800000002L });
	public static final BitSet FOLLOW_ruleVariableDeclarationCompletion_in_ruleInvocationOrAssignementOrDeclarationStatement14790 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAssignmentCompletion_in_ruleInvocationOrAssignementOrDeclarationStatement14817 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleInvocationOrAssignementOrDeclarationStatement14831 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSuperInvocationStatement_in_entryRuleSuperInvocationStatement14867 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSuperInvocationStatement14877 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSuperInvocationExpression_in_ruleSuperInvocationStatement14923 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleSuperInvocationStatement14935 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleThisInvocationStatement_in_entryRuleThisInvocationStatement14971 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleThisInvocationStatement14981 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleThisExpression_in_ruleThisInvocationStatement15027 = new BitSet(new long[] { 0x0000000000001000L, 0x00003FF800000002L });
	public static final BitSet FOLLOW_ruleAssignmentCompletion_in_ruleThisInvocationStatement15048 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleThisInvocationStatement15061 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInstanceCreationInvocationStatement_in_entryRuleInstanceCreationInvocationStatement15097 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleInstanceCreationInvocationStatement15107 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleInstanceCreationExpression_in_ruleInstanceCreationInvocationStatement15153 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000002L });
	public static final BitSet FOLLOW_65_in_ruleInstanceCreationInvocationStatement15165 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVariableDeclarationCompletion_in_entryRuleVariableDeclarationCompletion15201 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarationCompletion15211 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_47_in_ruleVariableDeclarationCompletion15255 = new BitSet(new long[] { 0x0001000000000000L });
	public static final BitSet FOLLOW_48_in_ruleVariableDeclarationCompletion15280 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclarationCompletion15299 = new BitSet(new long[] { 0x0000000000001000L, 0x00003FF800000000L });
	public static final BitSet FOLLOW_ruleAssignmentCompletion_in_ruleVariableDeclarationCompletion15325 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAssignmentCompletion_in_entryRuleAssignmentCompletion15361 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentCompletion15371 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentCompletion15417 = new BitSet(new long[] { 0x03E039800020E070L, 0x0000000000180000L });
	public static final BitSet FOLLOW_ruleSequenceElement_in_ruleAssignmentCompletion15438 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_83_in_ruleBooleanValue15488 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_84_in_ruleBooleanValue15505 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_85_in_ruleLinkOperationKind15550 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_86_in_ruleLinkOperationKind15567 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_87_in_ruleLinkOperationKind15584 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_88_in_ruleSelectOrRejectOperator15629 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_89_in_ruleSelectOrRejectOperator15646 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_90_in_ruleCollectOrIterateOperator15691 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_91_in_ruleCollectOrIterateOperator15708 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_92_in_ruleForAllOrExistsOrOneOperator15753 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_93_in_ruleForAllOrExistsOrOneOperator15770 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_94_in_ruleForAllOrExistsOrOneOperator15787 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_95_in_ruleAnnotationKind15832 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_96_in_ruleAnnotationKind15849 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_97_in_ruleAnnotationKind15866 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_98_in_ruleAnnotationKind15883 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_12_in_ruleAssignmentOperator15928 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_99_in_ruleAssignmentOperator15945 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_100_in_ruleAssignmentOperator15962 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_101_in_ruleAssignmentOperator15979 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_102_in_ruleAssignmentOperator15996 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_103_in_ruleAssignmentOperator16013 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_104_in_ruleAssignmentOperator16030 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_105_in_ruleAssignmentOperator16047 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_106_in_ruleAssignmentOperator16064 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_107_in_ruleAssignmentOperator16081 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_108_in_ruleAssignmentOperator16098 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_109_in_ruleAssignmentOperator16115 = new BitSet(new long[] { 0x0000000000000002L });

}