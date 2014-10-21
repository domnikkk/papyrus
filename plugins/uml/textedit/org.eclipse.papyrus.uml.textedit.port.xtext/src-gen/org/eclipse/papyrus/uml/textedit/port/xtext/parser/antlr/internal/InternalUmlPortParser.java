package org.eclipse.papyrus.uml.textedit.port.xtext.parser.antlr.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.papyrus.uml.textedit.port.xtext.services.UmlPortGrammarAccess;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class InternalUmlPortParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INTEGER_VALUE", "RULE_WS", "RULE_ANY_OTHER", "'/'", "':'", "'~'", "'<Undefined>'", "'::'", "'['", "'..'", "']'", "'*'",
			"'{'", "','", "'}'", "'redefines'", "'subsets'", "'='", "'.'", "'null'", "'none'", "'+'", "'-'", "'#'", "'readOnly'", "'union'", "'ordered'", "'unique'", "'true'", "'false'"
	};
	public static final int RULE_ID = 4;
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
	public static final int RULE_INTEGER_VALUE = 9;
	public static final int RULE_SL_COMMENT = 8;
	public static final int EOF = -1;
	public static final int RULE_ML_COMMENT = 7;
	public static final int T__30 = 30;
	public static final int T__19 = 19;
	public static final int T__31 = 31;
	public static final int RULE_STRING = 6;
	public static final int T__32 = 32;
	public static final int T__33 = 33;
	public static final int T__16 = 16;
	public static final int T__34 = 34;
	public static final int T__15 = 15;
	public static final int T__35 = 35;
	public static final int T__18 = 18;
	public static final int T__36 = 36;
	public static final int T__17 = 17;
	public static final int T__37 = 37;
	public static final int T__12 = 12;
	public static final int T__38 = 38;
	public static final int T__14 = 14;
	public static final int T__13 = 13;
	public static final int RULE_INT = 5;
	public static final int RULE_WS = 10;

	// delegates
	// delegators


	public InternalUmlPortParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalUmlPortParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}


	@Override
	public String[] getTokenNames() {
		return InternalUmlPortParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g";
	}



	private UmlPortGrammarAccess grammarAccess;

	public InternalUmlPortParser(TokenStream input, UmlPortGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}

	@Override
	protected String getFirstRuleName() {
		return "PortRule";
	}

	@Override
	protected UmlPortGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}



	// $ANTLR start "entryRulePortRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:68:1: entryRulePortRule returns [EObject current=null] : iv_rulePortRule= rulePortRule EOF ;
	public final EObject entryRulePortRule() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePortRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:69:2: (iv_rulePortRule= rulePortRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:70:2: iv_rulePortRule= rulePortRule EOF
			{
				newCompositeNode(grammarAccess.getPortRuleRule());
				pushFollow(FOLLOW_rulePortRule_in_entryRulePortRule75);
				iv_rulePortRule = rulePortRule();

				state._fsp--;

				current = iv_rulePortRule;
				match(input, EOF, FOLLOW_EOF_in_entryRulePortRule85);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRulePortRule"


	// $ANTLR start "rulePortRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:77:1: rulePortRule returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? (
	// (lv_derived_1_0= '/' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_conjugated_4_0= '~' ) )? ( ( (lv_type_5_0= ruleTypeRule ) ) | ( (lv_typeUndefined_6_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_7_0= ruleMultiplicityRule ) )? (
	// (lv_modifiers_8_0= ruleModifiersRule ) )? ( (lv_default_9_0= ruleDefaultValueRule ) )? ) ;
	public final EObject rulePortRule() throws RecognitionException {
		EObject current = null;

		Token lv_derived_1_0 = null;
		Token lv_name_2_0 = null;
		Token otherlv_3 = null;
		Token lv_conjugated_4_0 = null;
		Token lv_typeUndefined_6_0 = null;
		EObject lv_visibility_0_0 = null;

		EObject lv_type_5_0 = null;

		EObject lv_multiplicity_7_0 = null;

		EObject lv_modifiers_8_0 = null;

		EObject lv_default_9_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:80:28: ( ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_derived_1_0= '/' ) )? ( (lv_name_2_0=
			// RULE_ID ) ) (otherlv_3= ':' ( (lv_conjugated_4_0= '~' ) )? ( ( (lv_type_5_0= ruleTypeRule ) ) | ( (lv_typeUndefined_6_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_7_0= ruleMultiplicityRule ) )? ( (lv_modifiers_8_0= ruleModifiersRule ) )? (
			// (lv_default_9_0= ruleDefaultValueRule ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:81:1: ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_derived_1_0= '/' ) )? ( (lv_name_2_0= RULE_ID
			// ) ) (otherlv_3= ':' ( (lv_conjugated_4_0= '~' ) )? ( ( (lv_type_5_0= ruleTypeRule ) ) | ( (lv_typeUndefined_6_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_7_0= ruleMultiplicityRule ) )? ( (lv_modifiers_8_0= ruleModifiersRule ) )? (
			// (lv_default_9_0= ruleDefaultValueRule ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:81:1: ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_derived_1_0= '/' ) )? ( (lv_name_2_0=
				// RULE_ID ) ) (otherlv_3= ':' ( (lv_conjugated_4_0= '~' ) )? ( ( (lv_type_5_0= ruleTypeRule ) ) | ( (lv_typeUndefined_6_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_7_0= ruleMultiplicityRule ) )? ( (lv_modifiers_8_0= ruleModifiersRule ) )? (
				// (lv_default_9_0= ruleDefaultValueRule ) )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:81:2: ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_derived_1_0= '/' ) )? ( (lv_name_2_0=
				// RULE_ID ) ) (otherlv_3= ':' ( (lv_conjugated_4_0= '~' ) )? ( ( (lv_type_5_0= ruleTypeRule ) ) | ( (lv_typeUndefined_6_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_7_0= ruleMultiplicityRule ) )? ( (lv_modifiers_8_0= ruleModifiersRule ) )? (
				// (lv_default_9_0= ruleDefaultValueRule ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:81:2: ( (lv_visibility_0_0= ruleVisibilityRule ) )?
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if ((LA1_0 == 14 || (LA1_0 >= 30 && LA1_0 <= 32))) {
						alt1 = 1;
					}
					switch (alt1) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:82:1: (lv_visibility_0_0= ruleVisibilityRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:82:1: (lv_visibility_0_0= ruleVisibilityRule )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:83:3: lv_visibility_0_0= ruleVisibilityRule
						{

							newCompositeNode(grammarAccess.getPortRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleVisibilityRule_in_rulePortRule131);
							lv_visibility_0_0 = ruleVisibilityRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPortRuleRule());
							}
							set(
									current,
									"visibility",
									lv_visibility_0_0,
									"VisibilityRule");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:99:3: ( (lv_derived_1_0= '/' ) )?
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if ((LA2_0 == 12)) {
						alt2 = 1;
					}
					switch (alt2) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:100:1: (lv_derived_1_0= '/' )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:100:1: (lv_derived_1_0= '/' )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:101:3: lv_derived_1_0= '/'
						{
							lv_derived_1_0 = (Token) match(input, 12, FOLLOW_12_in_rulePortRule150);

							newLeafNode(lv_derived_1_0, grammarAccess.getPortRuleAccess().getDerivedSolidusKeyword_1_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getPortRuleRule());
							}
							setWithLastConsumed(current, "derived", true, "/");


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:114:3: ( (lv_name_2_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:115:1: (lv_name_2_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:115:1: (lv_name_2_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:116:3: lv_name_2_0= RULE_ID
						{
							lv_name_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_rulePortRule181);

							newLeafNode(lv_name_2_0, grammarAccess.getPortRuleAccess().getNameIDTerminalRuleCall_2_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getPortRuleRule());
							}
							setWithLastConsumed(
									current,
									"name",
									lv_name_2_0,
									"ID");


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:132:2: (otherlv_3= ':' ( (lv_conjugated_4_0= '~' ) )? ( ( (lv_type_5_0= ruleTypeRule ) ) | (
					// (lv_typeUndefined_6_0= '<Undefined>' ) ) ) )?
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == 13)) {
						alt5 = 1;
					}
					switch (alt5) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:132:4: otherlv_3= ':' ( (lv_conjugated_4_0= '~' ) )? ( ( (lv_type_5_0= ruleTypeRule ) ) | (
					// (lv_typeUndefined_6_0= '<Undefined>' ) ) )
					{
						otherlv_3 = (Token) match(input, 13, FOLLOW_13_in_rulePortRule199);

						newLeafNode(otherlv_3, grammarAccess.getPortRuleAccess().getColonKeyword_3_0());

						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:136:1: ( (lv_conjugated_4_0= '~' ) )?
						int alt3 = 2;
						int LA3_0 = input.LA(1);

						if ((LA3_0 == 14)) {
							alt3 = 1;
						}
						switch (alt3) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:137:1: (lv_conjugated_4_0= '~' )
						{
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:137:1: (lv_conjugated_4_0= '~' )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:138:3: lv_conjugated_4_0= '~'
							{
								lv_conjugated_4_0 = (Token) match(input, 14, FOLLOW_14_in_rulePortRule217);

								newLeafNode(lv_conjugated_4_0, grammarAccess.getPortRuleAccess().getConjugatedTildeKeyword_3_1_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getPortRuleRule());
								}
								setWithLastConsumed(current, "conjugated", true, "~");


							}


						}
							break;

						}

						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:151:3: ( ( (lv_type_5_0= ruleTypeRule ) ) | ( (lv_typeUndefined_6_0= '<Undefined>' ) ) )
						int alt4 = 2;
						int LA4_0 = input.LA(1);

						if ((LA4_0 == RULE_ID)) {
							alt4 = 1;
						}
						else if ((LA4_0 == 15)) {
							alt4 = 2;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);

							throw nvae;
						}
						switch (alt4) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:151:4: ( (lv_type_5_0= ruleTypeRule ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:151:4: ( (lv_type_5_0= ruleTypeRule ) )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:152:1: (lv_type_5_0= ruleTypeRule )
							{
								// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:152:1: (lv_type_5_0= ruleTypeRule )
								// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:153:3: lv_type_5_0= ruleTypeRule
								{

									newCompositeNode(grammarAccess.getPortRuleAccess().getTypeTypeRuleParserRuleCall_3_2_0_0());

									pushFollow(FOLLOW_ruleTypeRule_in_rulePortRule253);
									lv_type_5_0 = ruleTypeRule();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getPortRuleRule());
									}
									set(
											current,
											"type",
											lv_type_5_0,
											"TypeRule");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;
						case 2:
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:170:6: ( (lv_typeUndefined_6_0= '<Undefined>' ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:170:6: ( (lv_typeUndefined_6_0= '<Undefined>' ) )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:171:1: (lv_typeUndefined_6_0= '<Undefined>' )
							{
								// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:171:1: (lv_typeUndefined_6_0= '<Undefined>' )
								// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:172:3: lv_typeUndefined_6_0= '<Undefined>'
								{
									lv_typeUndefined_6_0 = (Token) match(input, 15, FOLLOW_15_in_rulePortRule277);

									newLeafNode(lv_typeUndefined_6_0, grammarAccess.getPortRuleAccess().getTypeUndefinedUndefinedKeyword_3_2_1_0());


									if (current == null) {
										current = createModelElement(grammarAccess.getPortRuleRule());
									}
									setWithLastConsumed(current, "typeUndefined", true, "<Undefined>");


								}


							}


						}
							break;

						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:185:5: ( (lv_multiplicity_7_0= ruleMultiplicityRule ) )?
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if ((LA6_0 == 17)) {
						alt6 = 1;
					}
					switch (alt6) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:186:1: (lv_multiplicity_7_0= ruleMultiplicityRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:186:1: (lv_multiplicity_7_0= ruleMultiplicityRule )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:187:3: lv_multiplicity_7_0= ruleMultiplicityRule
						{

							newCompositeNode(grammarAccess.getPortRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleMultiplicityRule_in_rulePortRule314);
							lv_multiplicity_7_0 = ruleMultiplicityRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPortRuleRule());
							}
							set(
									current,
									"multiplicity",
									lv_multiplicity_7_0,
									"MultiplicityRule");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:203:3: ( (lv_modifiers_8_0= ruleModifiersRule ) )?
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if ((LA7_0 == 21)) {
						alt7 = 1;
					}
					switch (alt7) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:204:1: (lv_modifiers_8_0= ruleModifiersRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:204:1: (lv_modifiers_8_0= ruleModifiersRule )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:205:3: lv_modifiers_8_0= ruleModifiersRule
						{

							newCompositeNode(grammarAccess.getPortRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0());

							pushFollow(FOLLOW_ruleModifiersRule_in_rulePortRule336);
							lv_modifiers_8_0 = ruleModifiersRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPortRuleRule());
							}
							set(
									current,
									"modifiers",
									lv_modifiers_8_0,
									"ModifiersRule");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:221:3: ( (lv_default_9_0= ruleDefaultValueRule ) )?
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if ((LA8_0 == 26)) {
						alt8 = 1;
					}
					switch (alt8) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:222:1: (lv_default_9_0= ruleDefaultValueRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:222:1: (lv_default_9_0= ruleDefaultValueRule )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:223:3: lv_default_9_0= ruleDefaultValueRule
						{

							newCompositeNode(grammarAccess.getPortRuleAccess().getDefaultDefaultValueRuleParserRuleCall_6_0());

							pushFollow(FOLLOW_ruleDefaultValueRule_in_rulePortRule358);
							lv_default_9_0 = ruleDefaultValueRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPortRuleRule());
							}
							set(
									current,
									"default",
									lv_default_9_0,
									"DefaultValueRule");
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

	// $ANTLR end "rulePortRule"


	// $ANTLR start "entryRuleVisibilityRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:247:1: entryRuleVisibilityRule returns [EObject current=null] : iv_ruleVisibilityRule= ruleVisibilityRule EOF ;
	public final EObject entryRuleVisibilityRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleVisibilityRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:248:2: (iv_ruleVisibilityRule= ruleVisibilityRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:249:2: iv_ruleVisibilityRule= ruleVisibilityRule EOF
			{
				newCompositeNode(grammarAccess.getVisibilityRuleRule());
				pushFollow(FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule395);
				iv_ruleVisibilityRule = ruleVisibilityRule();

				state._fsp--;

				current = iv_ruleVisibilityRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleVisibilityRule405);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleVisibilityRule"


	// $ANTLR start "ruleVisibilityRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:256:1: ruleVisibilityRule returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityKind ) ) ;
	public final EObject ruleVisibilityRule() throws RecognitionException {
		EObject current = null;

		Enumerator lv_visibility_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:259:28: ( ( (lv_visibility_0_0= ruleVisibilityKind ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:260:1: ( (lv_visibility_0_0= ruleVisibilityKind ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:260:1: ( (lv_visibility_0_0= ruleVisibilityKind ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:261:1: (lv_visibility_0_0= ruleVisibilityKind )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:261:1: (lv_visibility_0_0= ruleVisibilityKind )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:262:3: lv_visibility_0_0= ruleVisibilityKind
					{

						newCompositeNode(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0());

						pushFollow(FOLLOW_ruleVisibilityKind_in_ruleVisibilityRule450);
						lv_visibility_0_0 = ruleVisibilityKind();

						state._fsp--;


						if (current == null) {
							current = createModelElementForParent(grammarAccess.getVisibilityRuleRule());
						}
						set(
								current,
								"visibility",
								lv_visibility_0_0,
								"VisibilityKind");
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

	// $ANTLR end "ruleVisibilityRule"


	// $ANTLR start "entryRuleTypeRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:286:1: entryRuleTypeRule returns [EObject current=null] : iv_ruleTypeRule= ruleTypeRule EOF ;
	public final EObject entryRuleTypeRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTypeRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:287:2: (iv_ruleTypeRule= ruleTypeRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:288:2: iv_ruleTypeRule= ruleTypeRule EOF
			{
				newCompositeNode(grammarAccess.getTypeRuleRule());
				pushFollow(FOLLOW_ruleTypeRule_in_entryRuleTypeRule485);
				iv_ruleTypeRule = ruleTypeRule();

				state._fsp--;

				current = iv_ruleTypeRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleTypeRule495);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleTypeRule"


	// $ANTLR start "ruleTypeRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:295:1: ruleTypeRule returns [EObject current=null] : ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1=
	// RULE_ID ) ) ) ;
	public final EObject ruleTypeRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_path_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:298:28: ( ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:299:1: ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:299:1: ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:299:2: ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:299:2: ( (lv_path_0_0= ruleQualifiedName ) )?
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if ((LA9_0 == RULE_ID)) {
						int LA9_1 = input.LA(2);

						if ((LA9_1 == 16)) {
							alt9 = 1;
						}
					}
					switch (alt9) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:300:1: (lv_path_0_0= ruleQualifiedName )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:300:1: (lv_path_0_0= ruleQualifiedName )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:301:3: lv_path_0_0= ruleQualifiedName
						{

							newCompositeNode(grammarAccess.getTypeRuleAccess().getPathQualifiedNameParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRule541);
							lv_path_0_0 = ruleQualifiedName();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getTypeRuleRule());
							}
							set(
									current,
									"path",
									lv_path_0_0,
									"QualifiedName");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:317:3: ( (otherlv_1= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:318:1: (otherlv_1= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:318:1: (otherlv_1= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:319:3: otherlv_1= RULE_ID
						{

							if (current == null) {
								current = createModelElement(grammarAccess.getTypeRuleRule());
							}

							otherlv_1 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleTypeRule562);

							newLeafNode(otherlv_1, grammarAccess.getTypeRuleAccess().getTypeClassifierCrossReference_1_0());


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

	// $ANTLR end "ruleTypeRule"


	// $ANTLR start "entryRuleQualifiedName"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:338:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
	public final EObject entryRuleQualifiedName() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleQualifiedName = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:339:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:340:2: iv_ruleQualifiedName= ruleQualifiedName EOF
			{
				newCompositeNode(grammarAccess.getQualifiedNameRule());
				pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName598);
				iv_ruleQualifiedName = ruleQualifiedName();

				state._fsp--;

				current = iv_ruleQualifiedName;
				match(input, EOF, FOLLOW_EOF_in_entryRuleQualifiedName608);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleQualifiedName"


	// $ANTLR start "ruleQualifiedName"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:347:1: ruleQualifiedName returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' (
	// (lv_remaining_2_0= ruleQualifiedName ) )? ) ;
	public final EObject ruleQualifiedName() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		EObject lv_remaining_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:350:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:351:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:351:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:351:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:351:2: ( (otherlv_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:352:1: (otherlv_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:352:1: (otherlv_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:353:3: otherlv_0= RULE_ID
						{

							if (current == null) {
								current = createModelElement(grammarAccess.getQualifiedNameRule());
							}

							otherlv_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleQualifiedName653);

							newLeafNode(otherlv_0, grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0());


						}


					}

					otherlv_1 = (Token) match(input, 16, FOLLOW_16_in_ruleQualifiedName665);

					newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:368:1: ( (lv_remaining_2_0= ruleQualifiedName ) )?
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == RULE_ID)) {
						int LA10_1 = input.LA(2);

						if ((LA10_1 == 16)) {
							alt10 = 1;
						}
					}
					switch (alt10) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:369:1: (lv_remaining_2_0= ruleQualifiedName )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:369:1: (lv_remaining_2_0= ruleQualifiedName )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:370:3: lv_remaining_2_0= ruleQualifiedName
						{

							newCompositeNode(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedName686);
							lv_remaining_2_0 = ruleQualifiedName();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
							}
							set(
									current,
									"remaining",
									lv_remaining_2_0,
									"QualifiedName");
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

	// $ANTLR end "ruleQualifiedName"


	// $ANTLR start "entryRuleMultiplicityRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:394:1: entryRuleMultiplicityRule returns [EObject current=null] : iv_ruleMultiplicityRule= ruleMultiplicityRule
	// EOF ;
	public final EObject entryRuleMultiplicityRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleMultiplicityRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:395:2: (iv_ruleMultiplicityRule= ruleMultiplicityRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:396:2: iv_ruleMultiplicityRule= ruleMultiplicityRule EOF
			{
				newCompositeNode(grammarAccess.getMultiplicityRuleRule());
				pushFollow(FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule723);
				iv_ruleMultiplicityRule = ruleMultiplicityRule();

				state._fsp--;

				current = iv_ruleMultiplicityRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleMultiplicityRule733);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleMultiplicityRule"


	// $ANTLR start "ruleMultiplicityRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:403:1: ruleMultiplicityRule returns [EObject current=null] : (otherlv_0= '[' ( (lv_bounds_1_0=
	// ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']' ) ;
	public final EObject ruleMultiplicityRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_bounds_1_0 = null;

		EObject lv_bounds_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:406:28: ( (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0=
			// ruleBoundSpecification ) ) )? otherlv_4= ']' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:407:1: (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0=
			// ruleBoundSpecification ) ) )? otherlv_4= ']' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:407:1: (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0=
				// ruleBoundSpecification ) ) )? otherlv_4= ']' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:407:3: otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0=
				// ruleBoundSpecification ) ) )? otherlv_4= ']'
				{
					otherlv_0 = (Token) match(input, 17, FOLLOW_17_in_ruleMultiplicityRule770);

					newLeafNode(otherlv_0, grammarAccess.getMultiplicityRuleAccess().getLeftSquareBracketKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:411:1: ( (lv_bounds_1_0= ruleBoundSpecification ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:412:1: (lv_bounds_1_0= ruleBoundSpecification )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:412:1: (lv_bounds_1_0= ruleBoundSpecification )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:413:3: lv_bounds_1_0= ruleBoundSpecification
						{

							newCompositeNode(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule791);
							lv_bounds_1_0 = ruleBoundSpecification();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getMultiplicityRuleRule());
							}
							add(
									current,
									"bounds",
									lv_bounds_1_0,
									"BoundSpecification");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:429:2: (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )?
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == 18)) {
						alt11 = 1;
					}
					switch (alt11) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:429:4: otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) )
					{
						otherlv_2 = (Token) match(input, 18, FOLLOW_18_in_ruleMultiplicityRule804);

						newLeafNode(otherlv_2, grammarAccess.getMultiplicityRuleAccess().getFullStopFullStopKeyword_2_0());

						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:433:1: ( (lv_bounds_3_0= ruleBoundSpecification ) )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:434:1: (lv_bounds_3_0= ruleBoundSpecification )
						{
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:434:1: (lv_bounds_3_0= ruleBoundSpecification )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:435:3: lv_bounds_3_0= ruleBoundSpecification
							{

								newCompositeNode(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_2_1_0());

								pushFollow(FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule825);
								lv_bounds_3_0 = ruleBoundSpecification();

								state._fsp--;


								if (current == null) {
									current = createModelElementForParent(grammarAccess.getMultiplicityRuleRule());
								}
								add(
										current,
										"bounds",
										lv_bounds_3_0,
										"BoundSpecification");
								afterParserOrEnumRuleCall();


							}


						}


					}
						break;

					}

					otherlv_4 = (Token) match(input, 19, FOLLOW_19_in_ruleMultiplicityRule839);

					newLeafNode(otherlv_4, grammarAccess.getMultiplicityRuleAccess().getRightSquareBracketKeyword_3());


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

	// $ANTLR end "ruleMultiplicityRule"


	// $ANTLR start "entryRuleBoundSpecification"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:463:1: entryRuleBoundSpecification returns [EObject current=null] : iv_ruleBoundSpecification=
	// ruleBoundSpecification EOF ;
	public final EObject entryRuleBoundSpecification() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBoundSpecification = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:464:2: (iv_ruleBoundSpecification= ruleBoundSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:465:2: iv_ruleBoundSpecification= ruleBoundSpecification EOF
			{
				newCompositeNode(grammarAccess.getBoundSpecificationRule());
				pushFollow(FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification875);
				iv_ruleBoundSpecification = ruleBoundSpecification();

				state._fsp--;

				current = iv_ruleBoundSpecification;
				match(input, EOF, FOLLOW_EOF_in_entryRuleBoundSpecification885);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleBoundSpecification"


	// $ANTLR start "ruleBoundSpecification"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:472:1: ruleBoundSpecification returns [EObject current=null] : ( (lv_value_0_0= ruleUnlimitedLiteral ) ) ;
	public final EObject ruleBoundSpecification() throws RecognitionException {
		EObject current = null;

		AntlrDatatypeRuleToken lv_value_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:475:28: ( ( (lv_value_0_0= ruleUnlimitedLiteral ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:476:1: ( (lv_value_0_0= ruleUnlimitedLiteral ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:476:1: ( (lv_value_0_0= ruleUnlimitedLiteral ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:477:1: (lv_value_0_0= ruleUnlimitedLiteral )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:477:1: (lv_value_0_0= ruleUnlimitedLiteral )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:478:3: lv_value_0_0= ruleUnlimitedLiteral
					{

						newCompositeNode(grammarAccess.getBoundSpecificationAccess().getValueUnlimitedLiteralParserRuleCall_0());

						pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleBoundSpecification930);
						lv_value_0_0 = ruleUnlimitedLiteral();

						state._fsp--;


						if (current == null) {
							current = createModelElementForParent(grammarAccess.getBoundSpecificationRule());
						}
						set(
								current,
								"value",
								lv_value_0_0,
								"UnlimitedLiteral");
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

	// $ANTLR end "ruleBoundSpecification"


	// $ANTLR start "entryRuleUnlimitedLiteral"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:502:1: entryRuleUnlimitedLiteral returns [String current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
	// ;
	public final String entryRuleUnlimitedLiteral() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleUnlimitedLiteral = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:503:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:504:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
			{
				newCompositeNode(grammarAccess.getUnlimitedLiteralRule());
				pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral966);
				iv_ruleUnlimitedLiteral = ruleUnlimitedLiteral();

				state._fsp--;

				current = iv_ruleUnlimitedLiteral.getText();
				match(input, EOF, FOLLOW_EOF_in_entryRuleUnlimitedLiteral977);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleUnlimitedLiteral"


	// $ANTLR start "ruleUnlimitedLiteral"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:511:1: ruleUnlimitedLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0=
	// RULE_INT | kw= '*' ) ;
	public final AntlrDatatypeRuleToken ruleUnlimitedLiteral() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token this_INT_0 = null;
		Token kw = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:514:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:515:1: (this_INT_0= RULE_INT | kw= '*' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:515:1: (this_INT_0= RULE_INT | kw= '*' )
				int alt12 = 2;
				int LA12_0 = input.LA(1);

				if ((LA12_0 == RULE_INT)) {
					alt12 = 1;
				}
				else if ((LA12_0 == 20)) {
					alt12 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);

					throw nvae;
				}
				switch (alt12) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:515:6: this_INT_0= RULE_INT
				{
					this_INT_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleUnlimitedLiteral1017);

					current.merge(this_INT_0);


					newLeafNode(this_INT_0, grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0());


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:524:2: kw= '*'
				{
					kw = (Token) match(input, 20, FOLLOW_20_in_ruleUnlimitedLiteral1041);

					current.merge(kw);
					newLeafNode(kw, grammarAccess.getUnlimitedLiteralAccess().getAsteriskKeyword_1());


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

	// $ANTLR end "ruleUnlimitedLiteral"


	// $ANTLR start "entryRuleModifiersRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:537:1: entryRuleModifiersRule returns [EObject current=null] : iv_ruleModifiersRule= ruleModifiersRule EOF ;
	public final EObject entryRuleModifiersRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleModifiersRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:538:2: (iv_ruleModifiersRule= ruleModifiersRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:539:2: iv_ruleModifiersRule= ruleModifiersRule EOF
			{
				newCompositeNode(grammarAccess.getModifiersRuleRule());
				pushFollow(FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule1081);
				iv_ruleModifiersRule = ruleModifiersRule();

				state._fsp--;

				current = iv_ruleModifiersRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleModifiersRule1091);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleModifiersRule"


	// $ANTLR start "ruleModifiersRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:546:1: ruleModifiersRule returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0=
	// ruleModifierSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleModifierSpecification ) ) )* otherlv_4= '}' ) ;
	public final EObject ruleModifiersRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		Token otherlv_4 = null;
		EObject lv_values_1_0 = null;

		EObject lv_values_3_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:549:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleModifierSpecification ) ) (otherlv_2= ',' (
			// (lv_values_3_0= ruleModifierSpecification ) ) )* otherlv_4= '}' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:550:1: (otherlv_0= '{' ( (lv_values_1_0= ruleModifierSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0=
			// ruleModifierSpecification ) ) )* otherlv_4= '}' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:550:1: (otherlv_0= '{' ( (lv_values_1_0= ruleModifierSpecification ) ) (otherlv_2= ',' (
				// (lv_values_3_0= ruleModifierSpecification ) ) )* otherlv_4= '}' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:550:3: otherlv_0= '{' ( (lv_values_1_0= ruleModifierSpecification ) ) (otherlv_2= ',' (
				// (lv_values_3_0= ruleModifierSpecification ) ) )* otherlv_4= '}'
				{
					otherlv_0 = (Token) match(input, 21, FOLLOW_21_in_ruleModifiersRule1128);

					newLeafNode(otherlv_0, grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:554:1: ( (lv_values_1_0= ruleModifierSpecification ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:555:1: (lv_values_1_0= ruleModifierSpecification )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:555:1: (lv_values_1_0= ruleModifierSpecification )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:556:3: lv_values_1_0= ruleModifierSpecification
						{

							newCompositeNode(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleModifierSpecification_in_ruleModifiersRule1149);
							lv_values_1_0 = ruleModifierSpecification();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getModifiersRuleRule());
							}
							add(
									current,
									"values",
									lv_values_1_0,
									"ModifierSpecification");
							afterParserOrEnumRuleCall();


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:572:2: (otherlv_2= ',' ( (lv_values_3_0= ruleModifierSpecification ) ) )*
					loop13: do {
						int alt13 = 2;
						int LA13_0 = input.LA(1);

						if ((LA13_0 == 22)) {
							alt13 = 1;
						}


						switch (alt13) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:572:4: otherlv_2= ',' ( (lv_values_3_0= ruleModifierSpecification ) )
						{
							otherlv_2 = (Token) match(input, 22, FOLLOW_22_in_ruleModifiersRule1162);

							newLeafNode(otherlv_2, grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_0());

							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:576:1: ( (lv_values_3_0= ruleModifierSpecification ) )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:577:1: (lv_values_3_0= ruleModifierSpecification )
							{
								// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:577:1: (lv_values_3_0= ruleModifierSpecification )
								// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:578:3: lv_values_3_0= ruleModifierSpecification
								{

									newCompositeNode(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_0());

									pushFollow(FOLLOW_ruleModifierSpecification_in_ruleModifiersRule1183);
									lv_values_3_0 = ruleModifierSpecification();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getModifiersRuleRule());
									}
									add(
											current,
											"values",
											lv_values_3_0,
											"ModifierSpecification");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;

						default:
							break loop13;
						}
					} while (true);

					otherlv_4 = (Token) match(input, 23, FOLLOW_23_in_ruleModifiersRule1197);

					newLeafNode(otherlv_4, grammarAccess.getModifiersRuleAccess().getRightCurlyBracketKeyword_3());


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

	// $ANTLR end "ruleModifiersRule"


	// $ANTLR start "entryRuleModifierSpecification"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:606:1: entryRuleModifierSpecification returns [EObject current=null] : iv_ruleModifierSpecification=
	// ruleModifierSpecification EOF ;
	public final EObject entryRuleModifierSpecification() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleModifierSpecification = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:607:2: (iv_ruleModifierSpecification= ruleModifierSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:608:2: iv_ruleModifierSpecification= ruleModifierSpecification EOF
			{
				newCompositeNode(grammarAccess.getModifierSpecificationRule());
				pushFollow(FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification1233);
				iv_ruleModifierSpecification = ruleModifierSpecification();

				state._fsp--;

				current = iv_ruleModifierSpecification;
				match(input, EOF, FOLLOW_EOF_in_entryRuleModifierSpecification1243);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleModifierSpecification"


	// $ANTLR start "ruleModifierSpecification"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:615:1: ruleModifierSpecification returns [EObject current=null] : ( ( (lv_value_0_0= ruleModifierKind ) ) | (
	// (lv_redefines_1_0= ruleRedefinesRule ) ) | ( (lv_subsets_2_0= ruleSubsetsRule ) ) ) ;
	public final EObject ruleModifierSpecification() throws RecognitionException {
		EObject current = null;

		Enumerator lv_value_0_0 = null;

		EObject lv_redefines_1_0 = null;

		EObject lv_subsets_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:618:28: ( ( ( (lv_value_0_0= ruleModifierKind ) ) | ( (lv_redefines_1_0= ruleRedefinesRule ) ) | (
			// (lv_subsets_2_0= ruleSubsetsRule ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:619:1: ( ( (lv_value_0_0= ruleModifierKind ) ) | ( (lv_redefines_1_0= ruleRedefinesRule ) ) | (
			// (lv_subsets_2_0= ruleSubsetsRule ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:619:1: ( ( (lv_value_0_0= ruleModifierKind ) ) | ( (lv_redefines_1_0= ruleRedefinesRule ) ) | (
				// (lv_subsets_2_0= ruleSubsetsRule ) ) )
				int alt14 = 3;
				switch (input.LA(1)) {
				case 33:
				case 34:
				case 35:
				case 36: {
					alt14 = 1;
				}
					break;
				case 24: {
					alt14 = 2;
				}
					break;
				case 25: {
					alt14 = 3;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);

					throw nvae;
				}

				switch (alt14) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:619:2: ( (lv_value_0_0= ruleModifierKind ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:619:2: ( (lv_value_0_0= ruleModifierKind ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:620:1: (lv_value_0_0= ruleModifierKind )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:620:1: (lv_value_0_0= ruleModifierKind )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:621:3: lv_value_0_0= ruleModifierKind
						{

							newCompositeNode(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0_0());

							pushFollow(FOLLOW_ruleModifierKind_in_ruleModifierSpecification1289);
							lv_value_0_0 = ruleModifierKind();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getModifierSpecificationRule());
							}
							set(
									current,
									"value",
									lv_value_0_0,
									"ModifierKind");
							afterParserOrEnumRuleCall();


						}


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:638:6: ( (lv_redefines_1_0= ruleRedefinesRule ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:638:6: ( (lv_redefines_1_0= ruleRedefinesRule ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:639:1: (lv_redefines_1_0= ruleRedefinesRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:639:1: (lv_redefines_1_0= ruleRedefinesRule )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:640:3: lv_redefines_1_0= ruleRedefinesRule
						{

							newCompositeNode(grammarAccess.getModifierSpecificationAccess().getRedefinesRedefinesRuleParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleRedefinesRule_in_ruleModifierSpecification1316);
							lv_redefines_1_0 = ruleRedefinesRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getModifierSpecificationRule());
							}
							set(
									current,
									"redefines",
									lv_redefines_1_0,
									"RedefinesRule");
							afterParserOrEnumRuleCall();


						}


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:657:6: ( (lv_subsets_2_0= ruleSubsetsRule ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:657:6: ( (lv_subsets_2_0= ruleSubsetsRule ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:658:1: (lv_subsets_2_0= ruleSubsetsRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:658:1: (lv_subsets_2_0= ruleSubsetsRule )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:659:3: lv_subsets_2_0= ruleSubsetsRule
						{

							newCompositeNode(grammarAccess.getModifierSpecificationAccess().getSubsetsSubsetsRuleParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleSubsetsRule_in_ruleModifierSpecification1343);
							lv_subsets_2_0 = ruleSubsetsRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getModifierSpecificationRule());
							}
							set(
									current,
									"subsets",
									lv_subsets_2_0,
									"SubsetsRule");
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

	// $ANTLR end "ruleModifierSpecification"


	// $ANTLR start "entryRuleRedefinesRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:683:1: entryRuleRedefinesRule returns [EObject current=null] : iv_ruleRedefinesRule= ruleRedefinesRule EOF ;
	public final EObject entryRuleRedefinesRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRedefinesRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:684:2: (iv_ruleRedefinesRule= ruleRedefinesRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:685:2: iv_ruleRedefinesRule= ruleRedefinesRule EOF
			{
				newCompositeNode(grammarAccess.getRedefinesRuleRule());
				pushFollow(FOLLOW_ruleRedefinesRule_in_entryRuleRedefinesRule1379);
				iv_ruleRedefinesRule = ruleRedefinesRule();

				state._fsp--;

				current = iv_ruleRedefinesRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleRedefinesRule1389);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleRedefinesRule"


	// $ANTLR start "ruleRedefinesRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:692:1: ruleRedefinesRule returns [EObject current=null] : (otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) ) ) ;
	public final EObject ruleRedefinesRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:695:28: ( (otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:696:1: (otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:696:1: (otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:696:3: otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) )
				{
					otherlv_0 = (Token) match(input, 24, FOLLOW_24_in_ruleRedefinesRule1426);

					newLeafNode(otherlv_0, grammarAccess.getRedefinesRuleAccess().getRedefinesKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:700:1: ( (otherlv_1= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:701:1: (otherlv_1= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:701:1: (otherlv_1= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:702:3: otherlv_1= RULE_ID
						{

							if (current == null) {
								current = createModelElement(grammarAccess.getRedefinesRuleRule());
							}

							otherlv_1 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleRedefinesRule1446);

							newLeafNode(otherlv_1, grammarAccess.getRedefinesRuleAccess().getPortPortCrossReference_1_0());


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

	// $ANTLR end "ruleRedefinesRule"


	// $ANTLR start "entryRuleSubsetsRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:721:1: entryRuleSubsetsRule returns [EObject current=null] : iv_ruleSubsetsRule= ruleSubsetsRule EOF ;
	public final EObject entryRuleSubsetsRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSubsetsRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:722:2: (iv_ruleSubsetsRule= ruleSubsetsRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:723:2: iv_ruleSubsetsRule= ruleSubsetsRule EOF
			{
				newCompositeNode(grammarAccess.getSubsetsRuleRule());
				pushFollow(FOLLOW_ruleSubsetsRule_in_entryRuleSubsetsRule1482);
				iv_ruleSubsetsRule = ruleSubsetsRule();

				state._fsp--;

				current = iv_ruleSubsetsRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSubsetsRule1492);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleSubsetsRule"


	// $ANTLR start "ruleSubsetsRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:730:1: ruleSubsetsRule returns [EObject current=null] : (otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) ) ) ;
	public final EObject ruleSubsetsRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:733:28: ( (otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:734:1: (otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:734:1: (otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:734:3: otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) )
				{
					otherlv_0 = (Token) match(input, 25, FOLLOW_25_in_ruleSubsetsRule1529);

					newLeafNode(otherlv_0, grammarAccess.getSubsetsRuleAccess().getSubsetsKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:738:1: ( (otherlv_1= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:739:1: (otherlv_1= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:739:1: (otherlv_1= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:740:3: otherlv_1= RULE_ID
						{

							if (current == null) {
								current = createModelElement(grammarAccess.getSubsetsRuleRule());
							}

							otherlv_1 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleSubsetsRule1549);

							newLeafNode(otherlv_1, grammarAccess.getSubsetsRuleAccess().getPortPortCrossReference_1_0());


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

	// $ANTLR end "ruleSubsetsRule"


	// $ANTLR start "entryRuleDefaultValueRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:759:1: entryRuleDefaultValueRule returns [EObject current=null] : iv_ruleDefaultValueRule= ruleDefaultValueRule
	// EOF ;
	public final EObject entryRuleDefaultValueRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleDefaultValueRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:760:2: (iv_ruleDefaultValueRule= ruleDefaultValueRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:761:2: iv_ruleDefaultValueRule= ruleDefaultValueRule EOF
			{
				newCompositeNode(grammarAccess.getDefaultValueRuleRule());
				pushFollow(FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule1585);
				iv_ruleDefaultValueRule = ruleDefaultValueRule();

				state._fsp--;

				current = iv_ruleDefaultValueRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleDefaultValueRule1595);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleDefaultValueRule"


	// $ANTLR start "ruleDefaultValueRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:768:1: ruleDefaultValueRule returns [EObject current=null] : (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) ) ;
	public final EObject ruleDefaultValueRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_default_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:771:28: ( (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:772:1: (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:772:1: (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:772:3: otherlv_0= '=' ( (lv_default_1_0= ruleValue ) )
				{
					otherlv_0 = (Token) match(input, 26, FOLLOW_26_in_ruleDefaultValueRule1632);

					newLeafNode(otherlv_0, grammarAccess.getDefaultValueRuleAccess().getEqualsSignKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:776:1: ( (lv_default_1_0= ruleValue ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:777:1: (lv_default_1_0= ruleValue )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:777:1: (lv_default_1_0= ruleValue )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:778:3: lv_default_1_0= ruleValue
						{

							newCompositeNode(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleValue_in_ruleDefaultValueRule1653);
							lv_default_1_0 = ruleValue();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getDefaultValueRuleRule());
							}
							set(
									current,
									"default",
									lv_default_1_0,
									"Value");
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

	// $ANTLR end "ruleDefaultValueRule"


	// $ANTLR start "entryRuleValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:802:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
	public final EObject entryRuleValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:803:2: (iv_ruleValue= ruleValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:804:2: iv_ruleValue= ruleValue EOF
			{
				newCompositeNode(grammarAccess.getValueRule());
				pushFollow(FOLLOW_ruleValue_in_entryRuleValue1689);
				iv_ruleValue = ruleValue();

				state._fsp--;

				current = iv_ruleValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleValue1699);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleValue"


	// $ANTLR start "ruleValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:811:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1=
	// ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue ) ;
	public final EObject ruleValue() throws RecognitionException {
		EObject current = null;

		EObject this_IntValue_0 = null;

		EObject this_StringValue_1 = null;

		EObject this_BooleanValue_2 = null;

		EObject this_RealValue_3 = null;

		EObject this_NullValue_4 = null;

		EObject this_NoValue_5 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:814:28: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2=
			// ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:815:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2=
			// ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:815:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2=
				// ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue )
				int alt15 = 6;
				switch (input.LA(1)) {
				case RULE_INT: {
					int LA15_1 = input.LA(2);

					if ((LA15_1 == 27)) {
						alt15 = 4;
					}
					else if ((LA15_1 == EOF)) {
						alt15 = 1;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 15, 1, input);

						throw nvae;
					}
				}
					break;
				case RULE_STRING: {
					alt15 = 2;
				}
					break;
				case 37:
				case 38: {
					alt15 = 3;
				}
					break;
				case 27: {
					alt15 = 4;
				}
					break;
				case 28: {
					alt15 = 5;
				}
					break;
				case 29: {
					alt15 = 6;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);

					throw nvae;
				}

				switch (alt15) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:816:5: this_IntValue_0= ruleIntValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0());

					pushFollow(FOLLOW_ruleIntValue_in_ruleValue1746);
					this_IntValue_0 = ruleIntValue();

					state._fsp--;


					current = this_IntValue_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:826:5: this_StringValue_1= ruleStringValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1());

					pushFollow(FOLLOW_ruleStringValue_in_ruleValue1773);
					this_StringValue_1 = ruleStringValue();

					state._fsp--;


					current = this_StringValue_1;
					afterParserOrEnumRuleCall();


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:836:5: this_BooleanValue_2= ruleBooleanValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2());

					pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue1800);
					this_BooleanValue_2 = ruleBooleanValue();

					state._fsp--;


					current = this_BooleanValue_2;
					afterParserOrEnumRuleCall();


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:846:5: this_RealValue_3= ruleRealValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_3());

					pushFollow(FOLLOW_ruleRealValue_in_ruleValue1827);
					this_RealValue_3 = ruleRealValue();

					state._fsp--;


					current = this_RealValue_3;
					afterParserOrEnumRuleCall();


				}
					break;
				case 5:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:856:5: this_NullValue_4= ruleNullValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_4());

					pushFollow(FOLLOW_ruleNullValue_in_ruleValue1854);
					this_NullValue_4 = ruleNullValue();

					state._fsp--;


					current = this_NullValue_4;
					afterParserOrEnumRuleCall();


				}
					break;
				case 6:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:866:5: this_NoValue_5= ruleNoValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getNoValueParserRuleCall_5());

					pushFollow(FOLLOW_ruleNoValue_in_ruleValue1881);
					this_NoValue_5 = ruleNoValue();

					state._fsp--;


					current = this_NoValue_5;
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

	// $ANTLR end "ruleValue"


	// $ANTLR start "entryRuleIntValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:882:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
	public final EObject entryRuleIntValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleIntValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:883:2: (iv_ruleIntValue= ruleIntValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:884:2: iv_ruleIntValue= ruleIntValue EOF
			{
				newCompositeNode(grammarAccess.getIntValueRule());
				pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1916);
				iv_ruleIntValue = ruleIntValue();

				state._fsp--;

				current = iv_ruleIntValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleIntValue1926);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleIntValue"


	// $ANTLR start "ruleIntValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:891:1: ruleIntValue returns [EObject current=null] : ( (lv_literalInteger_0_0= RULE_INT ) ) ;
	public final EObject ruleIntValue() throws RecognitionException {
		EObject current = null;

		Token lv_literalInteger_0_0 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:894:28: ( ( (lv_literalInteger_0_0= RULE_INT ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:895:1: ( (lv_literalInteger_0_0= RULE_INT ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:895:1: ( (lv_literalInteger_0_0= RULE_INT ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:896:1: (lv_literalInteger_0_0= RULE_INT )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:896:1: (lv_literalInteger_0_0= RULE_INT )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:897:3: lv_literalInteger_0_0= RULE_INT
					{
						lv_literalInteger_0_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleIntValue1967);

						newLeafNode(lv_literalInteger_0_0, grammarAccess.getIntValueAccess().getLiteralIntegerINTTerminalRuleCall_0());


						if (current == null) {
							current = createModelElement(grammarAccess.getIntValueRule());
						}
						setWithLastConsumed(
								current,
								"literalInteger",
								lv_literalInteger_0_0,
								"INT");


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

	// $ANTLR end "ruleIntValue"


	// $ANTLR start "entryRuleStringValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:921:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
	public final EObject entryRuleStringValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleStringValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:922:2: (iv_ruleStringValue= ruleStringValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:923:2: iv_ruleStringValue= ruleStringValue EOF
			{
				newCompositeNode(grammarAccess.getStringValueRule());
				pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue2007);
				iv_ruleStringValue = ruleStringValue();

				state._fsp--;

				current = iv_ruleStringValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleStringValue2017);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleStringValue"


	// $ANTLR start "ruleStringValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:930:1: ruleStringValue returns [EObject current=null] : ( (lv_literalString_0_0= RULE_STRING ) ) ;
	public final EObject ruleStringValue() throws RecognitionException {
		EObject current = null;

		Token lv_literalString_0_0 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:933:28: ( ( (lv_literalString_0_0= RULE_STRING ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:934:1: ( (lv_literalString_0_0= RULE_STRING ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:934:1: ( (lv_literalString_0_0= RULE_STRING ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:935:1: (lv_literalString_0_0= RULE_STRING )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:935:1: (lv_literalString_0_0= RULE_STRING )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:936:3: lv_literalString_0_0= RULE_STRING
					{
						lv_literalString_0_0 = (Token) match(input, RULE_STRING, FOLLOW_RULE_STRING_in_ruleStringValue2058);

						newLeafNode(lv_literalString_0_0, grammarAccess.getStringValueAccess().getLiteralStringSTRINGTerminalRuleCall_0());


						if (current == null) {
							current = createModelElement(grammarAccess.getStringValueRule());
						}
						setWithLastConsumed(
								current,
								"literalString",
								lv_literalString_0_0,
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

	// $ANTLR end "ruleStringValue"


	// $ANTLR start "entryRuleBooleanValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:960:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
	public final EObject entryRuleBooleanValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBooleanValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:961:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:962:2: iv_ruleBooleanValue= ruleBooleanValue EOF
			{
				newCompositeNode(grammarAccess.getBooleanValueRule());
				pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2098);
				iv_ruleBooleanValue = ruleBooleanValue();

				state._fsp--;

				current = iv_ruleBooleanValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleBooleanValue2108);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleBooleanValue"


	// $ANTLR start "ruleBooleanValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:969:1: ruleBooleanValue returns [EObject current=null] : ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) ) ;
	public final EObject ruleBooleanValue() throws RecognitionException {
		EObject current = null;

		Enumerator lv_literalBoolean_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:972:28: ( ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:973:1: ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:973:1: ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:974:1: (lv_literalBoolean_0_0= ruleBooleanLiterals )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:974:1: (lv_literalBoolean_0_0= ruleBooleanLiterals )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:975:3: lv_literalBoolean_0_0= ruleBooleanLiterals
					{

						newCompositeNode(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0());

						pushFollow(FOLLOW_ruleBooleanLiterals_in_ruleBooleanValue2153);
						lv_literalBoolean_0_0 = ruleBooleanLiterals();

						state._fsp--;


						if (current == null) {
							current = createModelElementForParent(grammarAccess.getBooleanValueRule());
						}
						set(
								current,
								"literalBoolean",
								lv_literalBoolean_0_0,
								"BooleanLiterals");
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

	// $ANTLR end "ruleBooleanValue"


	// $ANTLR start "entryRuleRealValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:999:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
	public final EObject entryRuleRealValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRealValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1000:2: (iv_ruleRealValue= ruleRealValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1001:2: iv_ruleRealValue= ruleRealValue EOF
			{
				newCompositeNode(grammarAccess.getRealValueRule());
				pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue2188);
				iv_ruleRealValue = ruleRealValue();

				state._fsp--;

				current = iv_ruleRealValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleRealValue2198);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleRealValue"


	// $ANTLR start "ruleRealValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1008:1: ruleRealValue returns [EObject current=null] : ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) |
	// (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) ) ;
	public final EObject ruleRealValue() throws RecognitionException {
		EObject current = null;

		Token lv_integer_0_0 = null;
		Token otherlv_1 = null;
		Token otherlv_2 = null;
		Token lv_fraction_3_0 = null;
		Token lv_integer_4_0 = null;
		Token otherlv_5 = null;
		Token lv_fraction_6_0 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1011:28: ( ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' ( (lv_fraction_3_0=
			// RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1012:1: ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' ( (lv_fraction_3_0=
			// RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1012:1: ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' ( (lv_fraction_3_0=
				// RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) )
				int alt16 = 3;
				int LA16_0 = input.LA(1);

				if ((LA16_0 == RULE_INT)) {
					int LA16_1 = input.LA(2);

					if ((LA16_1 == 27)) {
						int LA16_3 = input.LA(3);

						if ((LA16_3 == EOF)) {
							alt16 = 1;
						}
						else if ((LA16_3 == RULE_INT)) {
							alt16 = 3;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 16, 3, input);

							throw nvae;
						}
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 16, 1, input);

						throw nvae;
					}
				}
				else if ((LA16_0 == 27)) {
					alt16 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);

					throw nvae;
				}
				switch (alt16) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1012:2: ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1012:2: ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1012:3: ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.'
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1012:3: ( (lv_integer_0_0= RULE_INT ) )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1013:1: (lv_integer_0_0= RULE_INT )
						{
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1013:1: (lv_integer_0_0= RULE_INT )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1014:3: lv_integer_0_0= RULE_INT
							{
								lv_integer_0_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleRealValue2241);

								newLeafNode(lv_integer_0_0, grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_0_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getRealValueRule());
								}
								setWithLastConsumed(
										current,
										"integer",
										lv_integer_0_0,
										"INT");


							}


						}

						otherlv_1 = (Token) match(input, 27, FOLLOW_27_in_ruleRealValue2258);

						newLeafNode(otherlv_1, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1035:6: (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1035:6: (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1035:8: otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) )
					{
						otherlv_2 = (Token) match(input, 27, FOLLOW_27_in_ruleRealValue2278);

						newLeafNode(otherlv_2, grammarAccess.getRealValueAccess().getFullStopKeyword_1_0());

						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1039:1: ( (lv_fraction_3_0= RULE_INT ) )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1040:1: (lv_fraction_3_0= RULE_INT )
						{
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1040:1: (lv_fraction_3_0= RULE_INT )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1041:3: lv_fraction_3_0= RULE_INT
							{
								lv_fraction_3_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleRealValue2295);

								newLeafNode(lv_fraction_3_0, grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_1_1_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getRealValueRule());
								}
								setWithLastConsumed(
										current,
										"fraction",
										lv_fraction_3_0,
										"INT");


							}


						}


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1058:6: ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1058:6: ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1058:7: ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) )
					{
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1058:7: ( (lv_integer_4_0= RULE_INT ) )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1059:1: (lv_integer_4_0= RULE_INT )
						{
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1059:1: (lv_integer_4_0= RULE_INT )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1060:3: lv_integer_4_0= RULE_INT
							{
								lv_integer_4_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleRealValue2325);

								newLeafNode(lv_integer_4_0, grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_2_0_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getRealValueRule());
								}
								setWithLastConsumed(
										current,
										"integer",
										lv_integer_4_0,
										"INT");


							}


						}

						otherlv_5 = (Token) match(input, 27, FOLLOW_27_in_ruleRealValue2342);

						newLeafNode(otherlv_5, grammarAccess.getRealValueAccess().getFullStopKeyword_2_1());

						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1080:1: ( (lv_fraction_6_0= RULE_INT ) )
						// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1081:1: (lv_fraction_6_0= RULE_INT )
						{
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1081:1: (lv_fraction_6_0= RULE_INT )
							// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1082:3: lv_fraction_6_0= RULE_INT
							{
								lv_fraction_6_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleRealValue2359);

								newLeafNode(lv_fraction_6_0, grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_2_2_0());


								if (current == null) {
									current = createModelElement(grammarAccess.getRealValueRule());
								}
								setWithLastConsumed(
										current,
										"fraction",
										lv_fraction_6_0,
										"INT");


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

	// $ANTLR end "ruleRealValue"


	// $ANTLR start "entryRuleNullValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1106:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
	public final EObject entryRuleNullValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNullValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1107:2: (iv_ruleNullValue= ruleNullValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1108:2: iv_ruleNullValue= ruleNullValue EOF
			{
				newCompositeNode(grammarAccess.getNullValueRule());
				pushFollow(FOLLOW_ruleNullValue_in_entryRuleNullValue2401);
				iv_ruleNullValue = ruleNullValue();

				state._fsp--;

				current = iv_ruleNullValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNullValue2411);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNullValue"


	// $ANTLR start "ruleNullValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1115:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
	public final EObject ruleNullValue() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1118:28: ( ( () otherlv_1= 'null' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1119:1: ( () otherlv_1= 'null' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1119:1: ( () otherlv_1= 'null' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1119:2: () otherlv_1= 'null'
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1119:2: ()
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1120:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getNullValueAccess().getNullValueAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 28, FOLLOW_28_in_ruleNullValue2457);

					newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());


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

	// $ANTLR end "ruleNullValue"


	// $ANTLR start "entryRuleNoValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1137:1: entryRuleNoValue returns [EObject current=null] : iv_ruleNoValue= ruleNoValue EOF ;
	public final EObject entryRuleNoValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNoValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1138:2: (iv_ruleNoValue= ruleNoValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1139:2: iv_ruleNoValue= ruleNoValue EOF
			{
				newCompositeNode(grammarAccess.getNoValueRule());
				pushFollow(FOLLOW_ruleNoValue_in_entryRuleNoValue2493);
				iv_ruleNoValue = ruleNoValue();

				state._fsp--;

				current = iv_ruleNoValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNoValue2503);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRuleNoValue"


	// $ANTLR start "ruleNoValue"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1146:1: ruleNoValue returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
	public final EObject ruleNoValue() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1149:28: ( ( () otherlv_1= 'none' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1150:1: ( () otherlv_1= 'none' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1150:1: ( () otherlv_1= 'none' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1150:2: () otherlv_1= 'none'
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1150:2: ()
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1151:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getNoValueAccess().getNoValueAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 29, FOLLOW_29_in_ruleNoValue2549);

					newLeafNode(otherlv_1, grammarAccess.getNoValueAccess().getNoneKeyword_1());


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

	// $ANTLR end "ruleNoValue"


	// $ANTLR start "ruleVisibilityKind"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1168:1: ruleVisibilityKind returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) |
	// (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
	public final Enumerator ruleVisibilityKind() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;
		Token enumLiteral_2 = null;
		Token enumLiteral_3 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1170:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' )
			// ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1171:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1171:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~'
				// ) )
				int alt17 = 4;
				switch (input.LA(1)) {
				case 30: {
					alt17 = 1;
				}
					break;
				case 31: {
					alt17 = 2;
				}
					break;
				case 32: {
					alt17 = 3;
				}
					break;
				case 14: {
					alt17 = 4;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);

					throw nvae;
				}

				switch (alt17) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1171:2: (enumLiteral_0= '+' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1171:2: (enumLiteral_0= '+' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1171:4: enumLiteral_0= '+'
					{
						enumLiteral_0 = (Token) match(input, 30, FOLLOW_30_in_ruleVisibilityKind2599);

						current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1177:6: (enumLiteral_1= '-' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1177:6: (enumLiteral_1= '-' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1177:8: enumLiteral_1= '-'
					{
						enumLiteral_1 = (Token) match(input, 31, FOLLOW_31_in_ruleVisibilityKind2616);

						current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1183:6: (enumLiteral_2= '#' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1183:6: (enumLiteral_2= '#' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1183:8: enumLiteral_2= '#'
					{
						enumLiteral_2 = (Token) match(input, 32, FOLLOW_32_in_ruleVisibilityKind2633);

						current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_2, grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());


					}


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1189:6: (enumLiteral_3= '~' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1189:6: (enumLiteral_3= '~' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1189:8: enumLiteral_3= '~'
					{
						enumLiteral_3 = (Token) match(input, 14, FOLLOW_14_in_ruleVisibilityKind2650);

						current = grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_3, grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3());


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

	// $ANTLR end "ruleVisibilityKind"


	// $ANTLR start "ruleModifierKind"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1199:1: ruleModifierKind returns [Enumerator current=null] : ( (enumLiteral_0= 'readOnly' ) | (enumLiteral_1=
	// 'union' ) | (enumLiteral_2= 'ordered' ) | (enumLiteral_3= 'unique' ) ) ;
	public final Enumerator ruleModifierKind() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;
		Token enumLiteral_2 = null;
		Token enumLiteral_3 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1201:28: ( ( (enumLiteral_0= 'readOnly' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'ordered' ) |
			// (enumLiteral_3= 'unique' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1202:1: ( (enumLiteral_0= 'readOnly' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'ordered' ) |
			// (enumLiteral_3= 'unique' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1202:1: ( (enumLiteral_0= 'readOnly' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'ordered' ) |
				// (enumLiteral_3= 'unique' ) )
				int alt18 = 4;
				switch (input.LA(1)) {
				case 33: {
					alt18 = 1;
				}
					break;
				case 34: {
					alt18 = 2;
				}
					break;
				case 35: {
					alt18 = 3;
				}
					break;
				case 36: {
					alt18 = 4;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);

					throw nvae;
				}

				switch (alt18) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1202:2: (enumLiteral_0= 'readOnly' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1202:2: (enumLiteral_0= 'readOnly' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1202:4: enumLiteral_0= 'readOnly'
					{
						enumLiteral_0 = (Token) match(input, 33, FOLLOW_33_in_ruleModifierKind2695);

						current = grammarAccess.getModifierKindAccess().getReadOnlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getModifierKindAccess().getReadOnlyEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1208:6: (enumLiteral_1= 'union' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1208:6: (enumLiteral_1= 'union' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1208:8: enumLiteral_1= 'union'
					{
						enumLiteral_1 = (Token) match(input, 34, FOLLOW_34_in_ruleModifierKind2712);

						current = grammarAccess.getModifierKindAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getModifierKindAccess().getUnionEnumLiteralDeclaration_1());


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1214:6: (enumLiteral_2= 'ordered' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1214:6: (enumLiteral_2= 'ordered' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1214:8: enumLiteral_2= 'ordered'
					{
						enumLiteral_2 = (Token) match(input, 35, FOLLOW_35_in_ruleModifierKind2729);

						current = grammarAccess.getModifierKindAccess().getOrderedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_2, grammarAccess.getModifierKindAccess().getOrderedEnumLiteralDeclaration_2());


					}


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1220:6: (enumLiteral_3= 'unique' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1220:6: (enumLiteral_3= 'unique' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1220:8: enumLiteral_3= 'unique'
					{
						enumLiteral_3 = (Token) match(input, 36, FOLLOW_36_in_ruleModifierKind2746);

						current = grammarAccess.getModifierKindAccess().getUniqueEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_3, grammarAccess.getModifierKindAccess().getUniqueEnumLiteralDeclaration_3());


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

	// $ANTLR end "ruleModifierKind"


	// $ANTLR start "ruleBooleanLiterals"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1230:1: ruleBooleanLiterals returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1=
	// 'false' ) ) ;
	public final Enumerator ruleBooleanLiterals() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1232:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1233:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1233:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
				int alt19 = 2;
				int LA19_0 = input.LA(1);

				if ((LA19_0 == 37)) {
					alt19 = 1;
				}
				else if ((LA19_0 == 38)) {
					alt19 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);

					throw nvae;
				}
				switch (alt19) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1233:2: (enumLiteral_0= 'true' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1233:2: (enumLiteral_0= 'true' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1233:4: enumLiteral_0= 'true'
					{
						enumLiteral_0 = (Token) match(input, 37, FOLLOW_37_in_ruleBooleanLiterals2791);

						current = grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1239:6: (enumLiteral_1= 'false' )
				{
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1239:6: (enumLiteral_1= 'false' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/parser/antlr/internal/InternalUmlPort.g:1239:8: enumLiteral_1= 'false'
					{
						enumLiteral_1 = (Token) match(input, 38, FOLLOW_38_in_ruleBooleanLiterals2808);

						current = grammarAccess.getBooleanLiteralsAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getBooleanLiteralsAccess().getFalseEnumLiteralDeclaration_1());


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

	// $ANTLR end "ruleBooleanLiterals"

	// Delegated rules




	public static final BitSet FOLLOW_rulePortRule_in_entryRulePortRule75 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePortRule85 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityRule_in_rulePortRule131 = new BitSet(new long[] { 0x0000000000001010L });
	public static final BitSet FOLLOW_12_in_rulePortRule150 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_RULE_ID_in_rulePortRule181 = new BitSet(new long[] { 0x0000000004222002L });
	public static final BitSet FOLLOW_13_in_rulePortRule199 = new BitSet(new long[] { 0x000000000000C010L });
	public static final BitSet FOLLOW_14_in_rulePortRule217 = new BitSet(new long[] { 0x0000000000008010L });
	public static final BitSet FOLLOW_ruleTypeRule_in_rulePortRule253 = new BitSet(new long[] { 0x0000000004220002L });
	public static final BitSet FOLLOW_15_in_rulePortRule277 = new BitSet(new long[] { 0x0000000004220002L });
	public static final BitSet FOLLOW_ruleMultiplicityRule_in_rulePortRule314 = new BitSet(new long[] { 0x0000000004200002L });
	public static final BitSet FOLLOW_ruleModifiersRule_in_rulePortRule336 = new BitSet(new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_ruleDefaultValueRule_in_rulePortRule358 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule395 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityRule405 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleVisibilityRule450 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTypeRule_in_entryRuleTypeRule485 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleTypeRule495 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRule541 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRule562 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName598 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName608 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName653 = new BitSet(new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_16_in_ruleQualifiedName665 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedName686 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule723 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityRule733 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_17_in_ruleMultiplicityRule770 = new BitSet(new long[] { 0x0000000000100020L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule791 = new BitSet(new long[] { 0x00000000000C0000L });
	public static final BitSet FOLLOW_18_in_ruleMultiplicityRule804 = new BitSet(new long[] { 0x0000000000100020L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule825 = new BitSet(new long[] { 0x0000000000080000L });
	public static final BitSet FOLLOW_19_in_ruleMultiplicityRule839 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification875 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBoundSpecification885 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleBoundSpecification930 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral966 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral977 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleUnlimitedLiteral1017 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_20_in_ruleUnlimitedLiteral1041 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule1081 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleModifiersRule1091 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_ruleModifiersRule1128 = new BitSet(new long[] { 0x0000001E03000000L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_ruleModifiersRule1149 = new BitSet(new long[] { 0x0000000000C00000L });
	public static final BitSet FOLLOW_22_in_ruleModifiersRule1162 = new BitSet(new long[] { 0x0000001E03000000L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_ruleModifiersRule1183 = new BitSet(new long[] { 0x0000000000C00000L });
	public static final BitSet FOLLOW_23_in_ruleModifiersRule1197 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification1233 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleModifierSpecification1243 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierKind_in_ruleModifierSpecification1289 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRedefinesRule_in_ruleModifierSpecification1316 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubsetsRule_in_ruleModifierSpecification1343 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRedefinesRule_in_entryRuleRedefinesRule1379 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleRedefinesRule1389 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_24_in_ruleRedefinesRule1426 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleRedefinesRule1446 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubsetsRule_in_entryRuleSubsetsRule1482 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSubsetsRule1492 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_25_in_ruleSubsetsRule1529 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleSubsetsRule1549 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule1585 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueRule1595 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_26_in_ruleDefaultValueRule1632 = new BitSet(new long[] { 0x0000006038000060L });
	public static final BitSet FOLLOW_ruleValue_in_ruleDefaultValueRule1653 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1689 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleValue1699 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIntValue_in_ruleValue1746 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStringValue_in_ruleValue1773 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue1800 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRealValue_in_ruleValue1827 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNullValue_in_ruleValue1854 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNoValue_in_ruleValue1881 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1916 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1926 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue1967 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue2007 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleStringValue2017 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue2058 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2098 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue2108 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanLiterals_in_ruleBooleanValue2153 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue2188 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleRealValue2198 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue2241 = new BitSet(new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_27_in_ruleRealValue2258 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_27_in_ruleRealValue2278 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue2295 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue2325 = new BitSet(new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_27_in_ruleRealValue2342 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue2359 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNullValue_in_entryRuleNullValue2401 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNullValue2411 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_28_in_ruleNullValue2457 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNoValue_in_entryRuleNoValue2493 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNoValue2503 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_29_in_ruleNoValue2549 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_ruleVisibilityKind2599 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_31_in_ruleVisibilityKind2616 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_ruleVisibilityKind2633 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_14_in_ruleVisibilityKind2650 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_33_in_ruleModifierKind2695 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_ruleModifierKind2712 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_35_in_ruleModifierKind2729 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_36_in_ruleModifierKind2746 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_37_in_ruleBooleanLiterals2791 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_38_in_ruleBooleanLiterals2808 = new BitSet(new long[] { 0x0000000000000002L });

}