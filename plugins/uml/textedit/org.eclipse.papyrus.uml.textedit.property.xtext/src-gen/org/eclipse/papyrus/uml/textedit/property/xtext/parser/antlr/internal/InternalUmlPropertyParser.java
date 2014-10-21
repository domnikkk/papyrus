package org.eclipse.papyrus.uml.textedit.property.xtext.parser.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.textedit.property.xtext.services.UmlPropertyGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;

@SuppressWarnings("all")
public class InternalUmlPropertyParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INTEGER_VALUE", "RULE_WS", "RULE_ANY_OTHER", "'/'", "':'", "'<Undefined>'", "'::'", "'['", "'..'", "']'", "'*'", "'{'",
			"','", "'}'", "'redefines'", "'subsets'", "'='", "'.'", "'null'", "'none'", "'+'", "'-'", "'#'", "'~'", "'readOnly'", "'union'", "'ordered'", "'unique'", "'true'", "'false'"
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


	public InternalUmlPropertyParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalUmlPropertyParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}


	@Override
	public String[] getTokenNames() {
		return InternalUmlPropertyParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g";
	}



	private UmlPropertyGrammarAccess grammarAccess;

	public InternalUmlPropertyParser(TokenStream input, UmlPropertyGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}

	@Override
	protected String getFirstRuleName() {
		return "PropertyRule";
	}

	@Override
	protected UmlPropertyGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}



	// $ANTLR start "entryRulePropertyRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:68:1: entryRulePropertyRule returns [EObject current=null] : iv_rulePropertyRule= rulePropertyRule EOF
	// ;
	public final EObject entryRulePropertyRule() throws RecognitionException {
		EObject current = null;

		EObject iv_rulePropertyRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:69:2: (iv_rulePropertyRule= rulePropertyRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:70:2: iv_rulePropertyRule= rulePropertyRule EOF
			{
				newCompositeNode(grammarAccess.getPropertyRuleRule());
				pushFollow(FOLLOW_rulePropertyRule_in_entryRulePropertyRule75);
				iv_rulePropertyRule = rulePropertyRule();

				state._fsp--;

				current = iv_rulePropertyRule;
				match(input, EOF, FOLLOW_EOF_in_entryRulePropertyRule85);

			}

		}

		catch (RecognitionException re) {
			recover(input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}

	// $ANTLR end "entryRulePropertyRule"


	// $ANTLR start "rulePropertyRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:77:1: rulePropertyRule returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityRule )
	// )? ( (lv_derived_1_0= '/' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )?
	// ( (lv_default_8_0= ruleDefaultValueRule ) )? ) ;
	public final EObject rulePropertyRule() throws RecognitionException {
		EObject current = null;

		Token lv_derived_1_0 = null;
		Token lv_name_2_0 = null;
		Token otherlv_3 = null;
		Token lv_typeUndefined_5_0 = null;
		EObject lv_visibility_0_0 = null;

		EObject lv_type_4_0 = null;

		EObject lv_multiplicity_6_0 = null;

		EObject lv_modifiers_7_0 = null;

		EObject lv_default_8_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:80:28: ( ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_derived_1_0= '/' ) )? (
			// (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_default_8_0=
			// ruleDefaultValueRule ) )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:81:1: ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_derived_1_0= '/' ) )? (
			// (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_default_8_0=
			// ruleDefaultValueRule ) )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:81:1: ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_derived_1_0= '/' ) )? (
				// (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_default_8_0=
				// ruleDefaultValueRule ) )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:81:2: ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_derived_1_0= '/' ) )? (
				// (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_default_8_0=
				// ruleDefaultValueRule ) )?
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:81:2: ( (lv_visibility_0_0= ruleVisibilityRule ) )?
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if (((LA1_0 >= 29 && LA1_0 <= 32))) {
						alt1 = 1;
					}
					switch (alt1) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:82:1: (lv_visibility_0_0= ruleVisibilityRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:82:1: (lv_visibility_0_0= ruleVisibilityRule )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:83:3: lv_visibility_0_0= ruleVisibilityRule
						{

							newCompositeNode(grammarAccess.getPropertyRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleVisibilityRule_in_rulePropertyRule131);
							lv_visibility_0_0 = ruleVisibilityRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPropertyRuleRule());
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

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:99:3: ( (lv_derived_1_0= '/' ) )?
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if ((LA2_0 == 12)) {
						alt2 = 1;
					}
					switch (alt2) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:100:1: (lv_derived_1_0= '/' )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:100:1: (lv_derived_1_0= '/' )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:101:3: lv_derived_1_0= '/'
						{
							lv_derived_1_0 = (Token) match(input, 12, FOLLOW_12_in_rulePropertyRule150);

							newLeafNode(lv_derived_1_0, grammarAccess.getPropertyRuleAccess().getDerivedSolidusKeyword_1_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getPropertyRuleRule());
							}
							setWithLastConsumed(current, "derived", true, "/");


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:114:3: ( (lv_name_2_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:115:1: (lv_name_2_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:115:1: (lv_name_2_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:116:3: lv_name_2_0= RULE_ID
						{
							lv_name_2_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_rulePropertyRule181);

							newLeafNode(lv_name_2_0, grammarAccess.getPropertyRuleAccess().getNameIDTerminalRuleCall_2_0());


							if (current == null) {
								current = createModelElement(grammarAccess.getPropertyRuleRule());
							}
							setWithLastConsumed(
									current,
									"name",
									lv_name_2_0,
									"ID");


						}


					}

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:132:2: (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0=
					// '<Undefined>' ) ) ) )?
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if ((LA4_0 == 13)) {
						alt4 = 1;
					}
					switch (alt4) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:132:4: otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0=
					// '<Undefined>' ) ) )
					{
						otherlv_3 = (Token) match(input, 13, FOLLOW_13_in_rulePropertyRule199);

						newLeafNode(otherlv_3, grammarAccess.getPropertyRuleAccess().getColonKeyword_3_0());

						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:136:1: ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>'
						// ) ) )
						int alt3 = 2;
						int LA3_0 = input.LA(1);

						if ((LA3_0 == RULE_ID)) {
							alt3 = 1;
						}
						else if ((LA3_0 == 14)) {
							alt3 = 2;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);

							throw nvae;
						}
						switch (alt3) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:136:2: ( (lv_type_4_0= ruleTypeRule ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:136:2: ( (lv_type_4_0= ruleTypeRule ) )
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:137:1: (lv_type_4_0= ruleTypeRule )
							{
								// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:137:1: (lv_type_4_0= ruleTypeRule )
								// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:138:3: lv_type_4_0= ruleTypeRule
								{

									newCompositeNode(grammarAccess.getPropertyRuleAccess().getTypeTypeRuleParserRuleCall_3_1_0_0());

									pushFollow(FOLLOW_ruleTypeRule_in_rulePropertyRule221);
									lv_type_4_0 = ruleTypeRule();

									state._fsp--;


									if (current == null) {
										current = createModelElementForParent(grammarAccess.getPropertyRuleRule());
									}
									set(
											current,
											"type",
											lv_type_4_0,
											"TypeRule");
									afterParserOrEnumRuleCall();


								}


							}


						}
							break;
						case 2:
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:155:6: ( (lv_typeUndefined_5_0= '<Undefined>' ) )
						{
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:155:6: ( (lv_typeUndefined_5_0= '<Undefined>' ) )
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:156:1: (lv_typeUndefined_5_0= '<Undefined>' )
							{
								// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:156:1: (lv_typeUndefined_5_0= '<Undefined>' )
								// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:157:3: lv_typeUndefined_5_0= '<Undefined>'
								{
									lv_typeUndefined_5_0 = (Token) match(input, 14, FOLLOW_14_in_rulePropertyRule245);

									newLeafNode(lv_typeUndefined_5_0, grammarAccess.getPropertyRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0());


									if (current == null) {
										current = createModelElement(grammarAccess.getPropertyRuleRule());
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

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:170:5: ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )?
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == 16)) {
						alt5 = 1;
					}
					switch (alt5) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:171:1: (lv_multiplicity_6_0= ruleMultiplicityRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:171:1: (lv_multiplicity_6_0= ruleMultiplicityRule )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:172:3: lv_multiplicity_6_0= ruleMultiplicityRule
						{

							newCompositeNode(grammarAccess.getPropertyRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0());

							pushFollow(FOLLOW_ruleMultiplicityRule_in_rulePropertyRule282);
							lv_multiplicity_6_0 = ruleMultiplicityRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPropertyRuleRule());
							}
							set(
									current,
									"multiplicity",
									lv_multiplicity_6_0,
									"MultiplicityRule");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:188:3: ( (lv_modifiers_7_0= ruleModifiersRule ) )?
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if ((LA6_0 == 20)) {
						alt6 = 1;
					}
					switch (alt6) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:189:1: (lv_modifiers_7_0= ruleModifiersRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:189:1: (lv_modifiers_7_0= ruleModifiersRule )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:190:3: lv_modifiers_7_0= ruleModifiersRule
						{

							newCompositeNode(grammarAccess.getPropertyRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0());

							pushFollow(FOLLOW_ruleModifiersRule_in_rulePropertyRule304);
							lv_modifiers_7_0 = ruleModifiersRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPropertyRuleRule());
							}
							set(
									current,
									"modifiers",
									lv_modifiers_7_0,
									"ModifiersRule");
							afterParserOrEnumRuleCall();


						}


					}
						break;

					}

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:206:3: ( (lv_default_8_0= ruleDefaultValueRule ) )?
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if ((LA7_0 == 25)) {
						alt7 = 1;
					}
					switch (alt7) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:207:1: (lv_default_8_0= ruleDefaultValueRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:207:1: (lv_default_8_0= ruleDefaultValueRule )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:208:3: lv_default_8_0= ruleDefaultValueRule
						{

							newCompositeNode(grammarAccess.getPropertyRuleAccess().getDefaultDefaultValueRuleParserRuleCall_6_0());

							pushFollow(FOLLOW_ruleDefaultValueRule_in_rulePropertyRule326);
							lv_default_8_0 = ruleDefaultValueRule();

							state._fsp--;


							if (current == null) {
								current = createModelElementForParent(grammarAccess.getPropertyRuleRule());
							}
							set(
									current,
									"default",
									lv_default_8_0,
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

	// $ANTLR end "rulePropertyRule"


	// $ANTLR start "entryRuleVisibilityRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:232:1: entryRuleVisibilityRule returns [EObject current=null] : iv_ruleVisibilityRule=
	// ruleVisibilityRule EOF ;
	public final EObject entryRuleVisibilityRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleVisibilityRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:233:2: (iv_ruleVisibilityRule= ruleVisibilityRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:234:2: iv_ruleVisibilityRule= ruleVisibilityRule EOF
			{
				newCompositeNode(grammarAccess.getVisibilityRuleRule());
				pushFollow(FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule363);
				iv_ruleVisibilityRule = ruleVisibilityRule();

				state._fsp--;

				current = iv_ruleVisibilityRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleVisibilityRule373);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:241:1: ruleVisibilityRule returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityKind )
	// ) ;
	public final EObject ruleVisibilityRule() throws RecognitionException {
		EObject current = null;

		Enumerator lv_visibility_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:244:28: ( ( (lv_visibility_0_0= ruleVisibilityKind ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:245:1: ( (lv_visibility_0_0= ruleVisibilityKind ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:245:1: ( (lv_visibility_0_0= ruleVisibilityKind ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:246:1: (lv_visibility_0_0= ruleVisibilityKind )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:246:1: (lv_visibility_0_0= ruleVisibilityKind )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:247:3: lv_visibility_0_0= ruleVisibilityKind
					{

						newCompositeNode(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0());

						pushFollow(FOLLOW_ruleVisibilityKind_in_ruleVisibilityRule418);
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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:271:1: entryRuleTypeRule returns [EObject current=null] : iv_ruleTypeRule= ruleTypeRule EOF ;
	public final EObject entryRuleTypeRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTypeRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:272:2: (iv_ruleTypeRule= ruleTypeRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:273:2: iv_ruleTypeRule= ruleTypeRule EOF
			{
				newCompositeNode(grammarAccess.getTypeRuleRule());
				pushFollow(FOLLOW_ruleTypeRule_in_entryRuleTypeRule453);
				iv_ruleTypeRule = ruleTypeRule();

				state._fsp--;

				current = iv_ruleTypeRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleTypeRule463);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:280:1: ruleTypeRule returns [EObject current=null] : ( ( (lv_path_0_0= ruleQualifiedName ) )? (
	// (otherlv_1= RULE_ID ) ) ) ;
	public final EObject ruleTypeRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		EObject lv_path_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:283:28: ( ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:284:1: ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:284:1: ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:284:2: ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:284:2: ( (lv_path_0_0= ruleQualifiedName ) )?
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if ((LA8_0 == RULE_ID)) {
						int LA8_1 = input.LA(2);

						if ((LA8_1 == 15)) {
							alt8 = 1;
						}
					}
					switch (alt8) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:285:1: (lv_path_0_0= ruleQualifiedName )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:285:1: (lv_path_0_0= ruleQualifiedName )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:286:3: lv_path_0_0= ruleQualifiedName
						{

							newCompositeNode(grammarAccess.getTypeRuleAccess().getPathQualifiedNameParserRuleCall_0_0());

							pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRule509);
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

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:302:3: ( (otherlv_1= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:303:1: (otherlv_1= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:303:1: (otherlv_1= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:304:3: otherlv_1= RULE_ID
						{

							if (current == null) {
								current = createModelElement(grammarAccess.getTypeRuleRule());
							}

							otherlv_1 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleTypeRule530);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:323:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName
	// EOF ;
	public final EObject entryRuleQualifiedName() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleQualifiedName = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:324:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:325:2: iv_ruleQualifiedName= ruleQualifiedName EOF
			{
				newCompositeNode(grammarAccess.getQualifiedNameRule());
				pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName566);
				iv_ruleQualifiedName = ruleQualifiedName();

				state._fsp--;

				current = iv_ruleQualifiedName;
				match(input, EOF, FOLLOW_EOF_in_entryRuleQualifiedName576);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:332:1: ruleQualifiedName returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
	// ( (lv_remaining_2_0= ruleQualifiedName ) )? ) ;
	public final EObject ruleQualifiedName() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;
		EObject lv_remaining_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:335:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName )
			// )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:336:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )?
			// )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:336:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName
				// ) )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:336:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName )
				// )?
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:336:2: ( (otherlv_0= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:337:1: (otherlv_0= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:337:1: (otherlv_0= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:338:3: otherlv_0= RULE_ID
						{

							if (current == null) {
								current = createModelElement(grammarAccess.getQualifiedNameRule());
							}

							otherlv_0 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleQualifiedName621);

							newLeafNode(otherlv_0, grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0());


						}


					}

					otherlv_1 = (Token) match(input, 15, FOLLOW_15_in_ruleQualifiedName633);

					newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1());

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:353:1: ( (lv_remaining_2_0= ruleQualifiedName ) )?
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if ((LA9_0 == RULE_ID)) {
						int LA9_1 = input.LA(2);

						if ((LA9_1 == 15)) {
							alt9 = 1;
						}
					}
					switch (alt9) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:354:1: (lv_remaining_2_0= ruleQualifiedName )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:354:1: (lv_remaining_2_0= ruleQualifiedName )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:355:3: lv_remaining_2_0= ruleQualifiedName
						{

							newCompositeNode(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedName654);
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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:379:1: entryRuleMultiplicityRule returns [EObject current=null] : iv_ruleMultiplicityRule=
	// ruleMultiplicityRule EOF ;
	public final EObject entryRuleMultiplicityRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleMultiplicityRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:380:2: (iv_ruleMultiplicityRule= ruleMultiplicityRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:381:2: iv_ruleMultiplicityRule= ruleMultiplicityRule EOF
			{
				newCompositeNode(grammarAccess.getMultiplicityRuleRule());
				pushFollow(FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule691);
				iv_ruleMultiplicityRule = ruleMultiplicityRule();

				state._fsp--;

				current = iv_ruleMultiplicityRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleMultiplicityRule701);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:388:1: ruleMultiplicityRule returns [EObject current=null] : (otherlv_0= '[' ( (lv_bounds_1_0=
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
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:391:28: ( (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' (
			// (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:392:1: (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' (
			// (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:392:1: (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' (
				// (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:392:3: otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' (
				// (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']'
				{
					otherlv_0 = (Token) match(input, 16, FOLLOW_16_in_ruleMultiplicityRule738);

					newLeafNode(otherlv_0, grammarAccess.getMultiplicityRuleAccess().getLeftSquareBracketKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:396:1: ( (lv_bounds_1_0= ruleBoundSpecification ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:397:1: (lv_bounds_1_0= ruleBoundSpecification )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:397:1: (lv_bounds_1_0= ruleBoundSpecification )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:398:3: lv_bounds_1_0= ruleBoundSpecification
						{

							newCompositeNode(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule759);
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

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:414:2: (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )?
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == 17)) {
						alt10 = 1;
					}
					switch (alt10) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:414:4: otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) )
					{
						otherlv_2 = (Token) match(input, 17, FOLLOW_17_in_ruleMultiplicityRule772);

						newLeafNode(otherlv_2, grammarAccess.getMultiplicityRuleAccess().getFullStopFullStopKeyword_2_0());

						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:418:1: ( (lv_bounds_3_0= ruleBoundSpecification ) )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:419:1: (lv_bounds_3_0= ruleBoundSpecification )
						{
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:419:1: (lv_bounds_3_0= ruleBoundSpecification )
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:420:3: lv_bounds_3_0= ruleBoundSpecification
							{

								newCompositeNode(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_2_1_0());

								pushFollow(FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule793);
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

					otherlv_4 = (Token) match(input, 18, FOLLOW_18_in_ruleMultiplicityRule807);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:448:1: entryRuleBoundSpecification returns [EObject current=null] : iv_ruleBoundSpecification=
	// ruleBoundSpecification EOF ;
	public final EObject entryRuleBoundSpecification() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBoundSpecification = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:449:2: (iv_ruleBoundSpecification= ruleBoundSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:450:2: iv_ruleBoundSpecification= ruleBoundSpecification EOF
			{
				newCompositeNode(grammarAccess.getBoundSpecificationRule());
				pushFollow(FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification843);
				iv_ruleBoundSpecification = ruleBoundSpecification();

				state._fsp--;

				current = iv_ruleBoundSpecification;
				match(input, EOF, FOLLOW_EOF_in_entryRuleBoundSpecification853);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:457:1: ruleBoundSpecification returns [EObject current=null] : ( (lv_value_0_0= ruleUnlimitedLiteral )
	// ) ;
	public final EObject ruleBoundSpecification() throws RecognitionException {
		EObject current = null;

		AntlrDatatypeRuleToken lv_value_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:460:28: ( ( (lv_value_0_0= ruleUnlimitedLiteral ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:461:1: ( (lv_value_0_0= ruleUnlimitedLiteral ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:461:1: ( (lv_value_0_0= ruleUnlimitedLiteral ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:462:1: (lv_value_0_0= ruleUnlimitedLiteral )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:462:1: (lv_value_0_0= ruleUnlimitedLiteral )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:463:3: lv_value_0_0= ruleUnlimitedLiteral
					{

						newCompositeNode(grammarAccess.getBoundSpecificationAccess().getValueUnlimitedLiteralParserRuleCall_0());

						pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleBoundSpecification898);
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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:487:1: entryRuleUnlimitedLiteral returns [String current=null] : iv_ruleUnlimitedLiteral=
	// ruleUnlimitedLiteral EOF ;
	public final String entryRuleUnlimitedLiteral() throws RecognitionException {
		String current = null;

		AntlrDatatypeRuleToken iv_ruleUnlimitedLiteral = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:488:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:489:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
			{
				newCompositeNode(grammarAccess.getUnlimitedLiteralRule());
				pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral934);
				iv_ruleUnlimitedLiteral = ruleUnlimitedLiteral();

				state._fsp--;

				current = iv_ruleUnlimitedLiteral.getText();
				match(input, EOF, FOLLOW_EOF_in_entryRuleUnlimitedLiteral945);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:496:1: ruleUnlimitedLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] :
	// (this_INT_0= RULE_INT | kw= '*' ) ;
	public final AntlrDatatypeRuleToken ruleUnlimitedLiteral() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

		Token this_INT_0 = null;
		Token kw = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:499:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:500:1: (this_INT_0= RULE_INT | kw= '*' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:500:1: (this_INT_0= RULE_INT | kw= '*' )
				int alt11 = 2;
				int LA11_0 = input.LA(1);

				if ((LA11_0 == RULE_INT)) {
					alt11 = 1;
				}
				else if ((LA11_0 == 19)) {
					alt11 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);

					throw nvae;
				}
				switch (alt11) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:500:6: this_INT_0= RULE_INT
				{
					this_INT_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleUnlimitedLiteral985);

					current.merge(this_INT_0);


					newLeafNode(this_INT_0, grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0());


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:509:2: kw= '*'
				{
					kw = (Token) match(input, 19, FOLLOW_19_in_ruleUnlimitedLiteral1009);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:522:1: entryRuleModifiersRule returns [EObject current=null] : iv_ruleModifiersRule= ruleModifiersRule
	// EOF ;
	public final EObject entryRuleModifiersRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleModifiersRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:523:2: (iv_ruleModifiersRule= ruleModifiersRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:524:2: iv_ruleModifiersRule= ruleModifiersRule EOF
			{
				newCompositeNode(grammarAccess.getModifiersRuleRule());
				pushFollow(FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule1049);
				iv_ruleModifiersRule = ruleModifiersRule();

				state._fsp--;

				current = iv_ruleModifiersRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleModifiersRule1059);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:531:1: ruleModifiersRule returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0=
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
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:534:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleModifierSpecification ) ) (otherlv_2= ',' (
			// (lv_values_3_0= ruleModifierSpecification ) ) )* otherlv_4= '}' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:535:1: (otherlv_0= '{' ( (lv_values_1_0= ruleModifierSpecification ) ) (otherlv_2= ',' (
			// (lv_values_3_0= ruleModifierSpecification ) ) )* otherlv_4= '}' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:535:1: (otherlv_0= '{' ( (lv_values_1_0= ruleModifierSpecification ) ) (otherlv_2= ',' (
				// (lv_values_3_0= ruleModifierSpecification ) ) )* otherlv_4= '}' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:535:3: otherlv_0= '{' ( (lv_values_1_0= ruleModifierSpecification ) ) (otherlv_2= ',' (
				// (lv_values_3_0= ruleModifierSpecification ) ) )* otherlv_4= '}'
				{
					otherlv_0 = (Token) match(input, 20, FOLLOW_20_in_ruleModifiersRule1096);

					newLeafNode(otherlv_0, grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:539:1: ( (lv_values_1_0= ruleModifierSpecification ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:540:1: (lv_values_1_0= ruleModifierSpecification )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:540:1: (lv_values_1_0= ruleModifierSpecification )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:541:3: lv_values_1_0= ruleModifierSpecification
						{

							newCompositeNode(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleModifierSpecification_in_ruleModifiersRule1117);
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

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:557:2: (otherlv_2= ',' ( (lv_values_3_0= ruleModifierSpecification ) ) )*
					loop12: do {
						int alt12 = 2;
						int LA12_0 = input.LA(1);

						if ((LA12_0 == 21)) {
							alt12 = 1;
						}


						switch (alt12) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:557:4: otherlv_2= ',' ( (lv_values_3_0= ruleModifierSpecification ) )
						{
							otherlv_2 = (Token) match(input, 21, FOLLOW_21_in_ruleModifiersRule1130);

							newLeafNode(otherlv_2, grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_0());

							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:561:1: ( (lv_values_3_0= ruleModifierSpecification ) )
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:562:1: (lv_values_3_0= ruleModifierSpecification )
							{
								// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:562:1: (lv_values_3_0= ruleModifierSpecification )
								// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:563:3: lv_values_3_0= ruleModifierSpecification
								{

									newCompositeNode(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_0());

									pushFollow(FOLLOW_ruleModifierSpecification_in_ruleModifiersRule1151);
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
							break loop12;
						}
					} while (true);

					otherlv_4 = (Token) match(input, 22, FOLLOW_22_in_ruleModifiersRule1165);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:591:1: entryRuleModifierSpecification returns [EObject current=null] : iv_ruleModifierSpecification=
	// ruleModifierSpecification EOF ;
	public final EObject entryRuleModifierSpecification() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleModifierSpecification = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:592:2: (iv_ruleModifierSpecification= ruleModifierSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:593:2: iv_ruleModifierSpecification= ruleModifierSpecification EOF
			{
				newCompositeNode(grammarAccess.getModifierSpecificationRule());
				pushFollow(FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification1201);
				iv_ruleModifierSpecification = ruleModifierSpecification();

				state._fsp--;

				current = iv_ruleModifierSpecification;
				match(input, EOF, FOLLOW_EOF_in_entryRuleModifierSpecification1211);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:600:1: ruleModifierSpecification returns [EObject current=null] : ( ( (lv_value_0_0= ruleModifierKind
	// ) ) | ( (lv_redefines_1_0= ruleRedefinesRule ) ) | ( (lv_subsets_2_0= ruleSubsetsRule ) ) ) ;
	public final EObject ruleModifierSpecification() throws RecognitionException {
		EObject current = null;

		Enumerator lv_value_0_0 = null;

		EObject lv_redefines_1_0 = null;

		EObject lv_subsets_2_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:603:28: ( ( ( (lv_value_0_0= ruleModifierKind ) ) | ( (lv_redefines_1_0= ruleRedefinesRule ) )
			// | ( (lv_subsets_2_0= ruleSubsetsRule ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:604:1: ( ( (lv_value_0_0= ruleModifierKind ) ) | ( (lv_redefines_1_0= ruleRedefinesRule ) ) |
			// ( (lv_subsets_2_0= ruleSubsetsRule ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:604:1: ( ( (lv_value_0_0= ruleModifierKind ) ) | ( (lv_redefines_1_0= ruleRedefinesRule )
				// ) | ( (lv_subsets_2_0= ruleSubsetsRule ) ) )
				int alt13 = 3;
				switch (input.LA(1)) {
				case 33:
				case 34:
				case 35:
				case 36: {
					alt13 = 1;
				}
					break;
				case 23: {
					alt13 = 2;
				}
					break;
				case 24: {
					alt13 = 3;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);

					throw nvae;
				}

				switch (alt13) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:604:2: ( (lv_value_0_0= ruleModifierKind ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:604:2: ( (lv_value_0_0= ruleModifierKind ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:605:1: (lv_value_0_0= ruleModifierKind )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:605:1: (lv_value_0_0= ruleModifierKind )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:606:3: lv_value_0_0= ruleModifierKind
						{

							newCompositeNode(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0_0());

							pushFollow(FOLLOW_ruleModifierKind_in_ruleModifierSpecification1257);
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
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:623:6: ( (lv_redefines_1_0= ruleRedefinesRule ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:623:6: ( (lv_redefines_1_0= ruleRedefinesRule ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:624:1: (lv_redefines_1_0= ruleRedefinesRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:624:1: (lv_redefines_1_0= ruleRedefinesRule )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:625:3: lv_redefines_1_0= ruleRedefinesRule
						{

							newCompositeNode(grammarAccess.getModifierSpecificationAccess().getRedefinesRedefinesRuleParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleRedefinesRule_in_ruleModifierSpecification1284);
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
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:642:6: ( (lv_subsets_2_0= ruleSubsetsRule ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:642:6: ( (lv_subsets_2_0= ruleSubsetsRule ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:643:1: (lv_subsets_2_0= ruleSubsetsRule )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:643:1: (lv_subsets_2_0= ruleSubsetsRule )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:644:3: lv_subsets_2_0= ruleSubsetsRule
						{

							newCompositeNode(grammarAccess.getModifierSpecificationAccess().getSubsetsSubsetsRuleParserRuleCall_2_0());

							pushFollow(FOLLOW_ruleSubsetsRule_in_ruleModifierSpecification1311);
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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:668:1: entryRuleRedefinesRule returns [EObject current=null] : iv_ruleRedefinesRule= ruleRedefinesRule
	// EOF ;
	public final EObject entryRuleRedefinesRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRedefinesRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:669:2: (iv_ruleRedefinesRule= ruleRedefinesRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:670:2: iv_ruleRedefinesRule= ruleRedefinesRule EOF
			{
				newCompositeNode(grammarAccess.getRedefinesRuleRule());
				pushFollow(FOLLOW_ruleRedefinesRule_in_entryRuleRedefinesRule1347);
				iv_ruleRedefinesRule = ruleRedefinesRule();

				state._fsp--;

				current = iv_ruleRedefinesRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleRedefinesRule1357);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:677:1: ruleRedefinesRule returns [EObject current=null] : (otherlv_0= 'redefines' ( (otherlv_1=
	// RULE_ID ) ) ) ;
	public final EObject ruleRedefinesRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:680:28: ( (otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:681:1: (otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:681:1: (otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:681:3: otherlv_0= 'redefines' ( (otherlv_1= RULE_ID ) )
				{
					otherlv_0 = (Token) match(input, 23, FOLLOW_23_in_ruleRedefinesRule1394);

					newLeafNode(otherlv_0, grammarAccess.getRedefinesRuleAccess().getRedefinesKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:685:1: ( (otherlv_1= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:686:1: (otherlv_1= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:686:1: (otherlv_1= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:687:3: otherlv_1= RULE_ID
						{

							if (current == null) {
								current = createModelElement(grammarAccess.getRedefinesRuleRule());
							}

							otherlv_1 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleRedefinesRule1414);

							newLeafNode(otherlv_1, grammarAccess.getRedefinesRuleAccess().getPropertyPropertyCrossReference_1_0());


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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:706:1: entryRuleSubsetsRule returns [EObject current=null] : iv_ruleSubsetsRule= ruleSubsetsRule EOF ;
	public final EObject entryRuleSubsetsRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleSubsetsRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:707:2: (iv_ruleSubsetsRule= ruleSubsetsRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:708:2: iv_ruleSubsetsRule= ruleSubsetsRule EOF
			{
				newCompositeNode(grammarAccess.getSubsetsRuleRule());
				pushFollow(FOLLOW_ruleSubsetsRule_in_entryRuleSubsetsRule1450);
				iv_ruleSubsetsRule = ruleSubsetsRule();

				state._fsp--;

				current = iv_ruleSubsetsRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleSubsetsRule1460);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:715:1: ruleSubsetsRule returns [EObject current=null] : (otherlv_0= 'subsets' ( (otherlv_1= RULE_ID )
	// ) ) ;
	public final EObject ruleSubsetsRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:718:28: ( (otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:719:1: (otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:719:1: (otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:719:3: otherlv_0= 'subsets' ( (otherlv_1= RULE_ID ) )
				{
					otherlv_0 = (Token) match(input, 24, FOLLOW_24_in_ruleSubsetsRule1497);

					newLeafNode(otherlv_0, grammarAccess.getSubsetsRuleAccess().getSubsetsKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:723:1: ( (otherlv_1= RULE_ID ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:724:1: (otherlv_1= RULE_ID )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:724:1: (otherlv_1= RULE_ID )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:725:3: otherlv_1= RULE_ID
						{

							if (current == null) {
								current = createModelElement(grammarAccess.getSubsetsRuleRule());
							}

							otherlv_1 = (Token) match(input, RULE_ID, FOLLOW_RULE_ID_in_ruleSubsetsRule1517);

							newLeafNode(otherlv_1, grammarAccess.getSubsetsRuleAccess().getPropertyPropertyCrossReference_1_0());


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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:744:1: entryRuleDefaultValueRule returns [EObject current=null] : iv_ruleDefaultValueRule=
	// ruleDefaultValueRule EOF ;
	public final EObject entryRuleDefaultValueRule() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleDefaultValueRule = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:745:2: (iv_ruleDefaultValueRule= ruleDefaultValueRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:746:2: iv_ruleDefaultValueRule= ruleDefaultValueRule EOF
			{
				newCompositeNode(grammarAccess.getDefaultValueRuleRule());
				pushFollow(FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule1553);
				iv_ruleDefaultValueRule = ruleDefaultValueRule();

				state._fsp--;

				current = iv_ruleDefaultValueRule;
				match(input, EOF, FOLLOW_EOF_in_entryRuleDefaultValueRule1563);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:753:1: ruleDefaultValueRule returns [EObject current=null] : (otherlv_0= '=' ( (lv_default_1_0=
	// ruleValue ) ) ) ;
	public final EObject ruleDefaultValueRule() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		EObject lv_default_1_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:756:28: ( (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:757:1: (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:757:1: (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:757:3: otherlv_0= '=' ( (lv_default_1_0= ruleValue ) )
				{
					otherlv_0 = (Token) match(input, 25, FOLLOW_25_in_ruleDefaultValueRule1600);

					newLeafNode(otherlv_0, grammarAccess.getDefaultValueRuleAccess().getEqualsSignKeyword_0());

					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:761:1: ( (lv_default_1_0= ruleValue ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:762:1: (lv_default_1_0= ruleValue )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:762:1: (lv_default_1_0= ruleValue )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:763:3: lv_default_1_0= ruleValue
						{

							newCompositeNode(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0());

							pushFollow(FOLLOW_ruleValue_in_ruleDefaultValueRule1621);
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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:787:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
	public final EObject entryRuleValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:788:2: (iv_ruleValue= ruleValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:789:2: iv_ruleValue= ruleValue EOF
			{
				newCompositeNode(grammarAccess.getValueRule());
				pushFollow(FOLLOW_ruleValue_in_entryRuleValue1657);
				iv_ruleValue = ruleValue();

				state._fsp--;

				current = iv_ruleValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleValue1667);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:796:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1=
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
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:799:28: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue |
			// this_BooleanValue_2= ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:800:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue |
			// this_BooleanValue_2= ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:800:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue |
				// this_BooleanValue_2= ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue )
				int alt14 = 6;
				switch (input.LA(1)) {
				case RULE_INT: {
					int LA14_1 = input.LA(2);

					if ((LA14_1 == 26)) {
						alt14 = 4;
					}
					else if ((LA14_1 == EOF)) {
						alt14 = 1;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 14, 1, input);

						throw nvae;
					}
				}
					break;
				case RULE_STRING: {
					alt14 = 2;
				}
					break;
				case 37:
				case 38: {
					alt14 = 3;
				}
					break;
				case 26: {
					alt14 = 4;
				}
					break;
				case 27: {
					alt14 = 5;
				}
					break;
				case 28: {
					alt14 = 6;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);

					throw nvae;
				}

				switch (alt14) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:801:5: this_IntValue_0= ruleIntValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0());

					pushFollow(FOLLOW_ruleIntValue_in_ruleValue1714);
					this_IntValue_0 = ruleIntValue();

					state._fsp--;


					current = this_IntValue_0;
					afterParserOrEnumRuleCall();


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:811:5: this_StringValue_1= ruleStringValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1());

					pushFollow(FOLLOW_ruleStringValue_in_ruleValue1741);
					this_StringValue_1 = ruleStringValue();

					state._fsp--;


					current = this_StringValue_1;
					afterParserOrEnumRuleCall();


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:821:5: this_BooleanValue_2= ruleBooleanValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2());

					pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue1768);
					this_BooleanValue_2 = ruleBooleanValue();

					state._fsp--;


					current = this_BooleanValue_2;
					afterParserOrEnumRuleCall();


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:831:5: this_RealValue_3= ruleRealValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_3());

					pushFollow(FOLLOW_ruleRealValue_in_ruleValue1795);
					this_RealValue_3 = ruleRealValue();

					state._fsp--;


					current = this_RealValue_3;
					afterParserOrEnumRuleCall();


				}
					break;
				case 5:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:841:5: this_NullValue_4= ruleNullValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_4());

					pushFollow(FOLLOW_ruleNullValue_in_ruleValue1822);
					this_NullValue_4 = ruleNullValue();

					state._fsp--;


					current = this_NullValue_4;
					afterParserOrEnumRuleCall();


				}
					break;
				case 6:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:851:5: this_NoValue_5= ruleNoValue
				{

					newCompositeNode(grammarAccess.getValueAccess().getNoValueParserRuleCall_5());

					pushFollow(FOLLOW_ruleNoValue_in_ruleValue1849);
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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:867:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
	public final EObject entryRuleIntValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleIntValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:868:2: (iv_ruleIntValue= ruleIntValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:869:2: iv_ruleIntValue= ruleIntValue EOF
			{
				newCompositeNode(grammarAccess.getIntValueRule());
				pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1884);
				iv_ruleIntValue = ruleIntValue();

				state._fsp--;

				current = iv_ruleIntValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleIntValue1894);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:876:1: ruleIntValue returns [EObject current=null] : ( (lv_literalInteger_0_0= RULE_INT ) ) ;
	public final EObject ruleIntValue() throws RecognitionException {
		EObject current = null;

		Token lv_literalInteger_0_0 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:879:28: ( ( (lv_literalInteger_0_0= RULE_INT ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:880:1: ( (lv_literalInteger_0_0= RULE_INT ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:880:1: ( (lv_literalInteger_0_0= RULE_INT ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:881:1: (lv_literalInteger_0_0= RULE_INT )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:881:1: (lv_literalInteger_0_0= RULE_INT )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:882:3: lv_literalInteger_0_0= RULE_INT
					{
						lv_literalInteger_0_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleIntValue1935);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:906:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
	public final EObject entryRuleStringValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleStringValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:907:2: (iv_ruleStringValue= ruleStringValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:908:2: iv_ruleStringValue= ruleStringValue EOF
			{
				newCompositeNode(grammarAccess.getStringValueRule());
				pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1975);
				iv_ruleStringValue = ruleStringValue();

				state._fsp--;

				current = iv_ruleStringValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleStringValue1985);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:915:1: ruleStringValue returns [EObject current=null] : ( (lv_literalString_0_0= RULE_STRING ) ) ;
	public final EObject ruleStringValue() throws RecognitionException {
		EObject current = null;

		Token lv_literalString_0_0 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:918:28: ( ( (lv_literalString_0_0= RULE_STRING ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:919:1: ( (lv_literalString_0_0= RULE_STRING ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:919:1: ( (lv_literalString_0_0= RULE_STRING ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:920:1: (lv_literalString_0_0= RULE_STRING )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:920:1: (lv_literalString_0_0= RULE_STRING )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:921:3: lv_literalString_0_0= RULE_STRING
					{
						lv_literalString_0_0 = (Token) match(input, RULE_STRING, FOLLOW_RULE_STRING_in_ruleStringValue2026);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:945:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue
	// EOF ;
	public final EObject entryRuleBooleanValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBooleanValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:946:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:947:2: iv_ruleBooleanValue= ruleBooleanValue EOF
			{
				newCompositeNode(grammarAccess.getBooleanValueRule());
				pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2066);
				iv_ruleBooleanValue = ruleBooleanValue();

				state._fsp--;

				current = iv_ruleBooleanValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleBooleanValue2076);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:954:1: ruleBooleanValue returns [EObject current=null] : ( (lv_literalBoolean_0_0= ruleBooleanLiterals
	// ) ) ;
	public final EObject ruleBooleanValue() throws RecognitionException {
		EObject current = null;

		Enumerator lv_literalBoolean_0_0 = null;


		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:957:28: ( ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:958:1: ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:958:1: ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:959:1: (lv_literalBoolean_0_0= ruleBooleanLiterals )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:959:1: (lv_literalBoolean_0_0= ruleBooleanLiterals )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:960:3: lv_literalBoolean_0_0= ruleBooleanLiterals
					{

						newCompositeNode(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0());

						pushFollow(FOLLOW_ruleBooleanLiterals_in_ruleBooleanValue2121);
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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:984:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
	public final EObject entryRuleRealValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleRealValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:985:2: (iv_ruleRealValue= ruleRealValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:986:2: iv_ruleRealValue= ruleRealValue EOF
			{
				newCompositeNode(grammarAccess.getRealValueRule());
				pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue2156);
				iv_ruleRealValue = ruleRealValue();

				state._fsp--;

				current = iv_ruleRealValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleRealValue2166);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:993:1: ruleRealValue returns [EObject current=null] : ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1=
	// '.' ) | (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) ) ;
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
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:996:28: ( ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' (
			// (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:997:1: ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' (
			// (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:997:1: ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' (
				// (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) )
				int alt15 = 3;
				int LA15_0 = input.LA(1);

				if ((LA15_0 == RULE_INT)) {
					int LA15_1 = input.LA(2);

					if ((LA15_1 == 26)) {
						int LA15_3 = input.LA(3);

						if ((LA15_3 == EOF)) {
							alt15 = 1;
						}
						else if ((LA15_3 == RULE_INT)) {
							alt15 = 3;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 15, 3, input);

							throw nvae;
						}
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 15, 1, input);

						throw nvae;
					}
				}
				else if ((LA15_0 == 26)) {
					alt15 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);

					throw nvae;
				}
				switch (alt15) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:997:2: ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:997:2: ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:997:3: ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.'
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:997:3: ( (lv_integer_0_0= RULE_INT ) )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:998:1: (lv_integer_0_0= RULE_INT )
						{
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:998:1: (lv_integer_0_0= RULE_INT )
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:999:3: lv_integer_0_0= RULE_INT
							{
								lv_integer_0_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleRealValue2209);

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

						otherlv_1 = (Token) match(input, 26, FOLLOW_26_in_ruleRealValue2226);

						newLeafNode(otherlv_1, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1020:6: (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1020:6: (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1020:8: otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) )
					{
						otherlv_2 = (Token) match(input, 26, FOLLOW_26_in_ruleRealValue2246);

						newLeafNode(otherlv_2, grammarAccess.getRealValueAccess().getFullStopKeyword_1_0());

						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1024:1: ( (lv_fraction_3_0= RULE_INT ) )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1025:1: (lv_fraction_3_0= RULE_INT )
						{
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1025:1: (lv_fraction_3_0= RULE_INT )
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1026:3: lv_fraction_3_0= RULE_INT
							{
								lv_fraction_3_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleRealValue2263);

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
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1043:6: ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) )
				// )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1043:6: ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT
					// ) ) )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1043:7: ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT )
					// )
					{
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1043:7: ( (lv_integer_4_0= RULE_INT ) )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1044:1: (lv_integer_4_0= RULE_INT )
						{
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1044:1: (lv_integer_4_0= RULE_INT )
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1045:3: lv_integer_4_0= RULE_INT
							{
								lv_integer_4_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleRealValue2293);

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

						otherlv_5 = (Token) match(input, 26, FOLLOW_26_in_ruleRealValue2310);

						newLeafNode(otherlv_5, grammarAccess.getRealValueAccess().getFullStopKeyword_2_1());

						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1065:1: ( (lv_fraction_6_0= RULE_INT ) )
						// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1066:1: (lv_fraction_6_0= RULE_INT )
						{
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1066:1: (lv_fraction_6_0= RULE_INT )
							// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1067:3: lv_fraction_6_0= RULE_INT
							{
								lv_fraction_6_0 = (Token) match(input, RULE_INT, FOLLOW_RULE_INT_in_ruleRealValue2327);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1091:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
	public final EObject entryRuleNullValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNullValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1092:2: (iv_ruleNullValue= ruleNullValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1093:2: iv_ruleNullValue= ruleNullValue EOF
			{
				newCompositeNode(grammarAccess.getNullValueRule());
				pushFollow(FOLLOW_ruleNullValue_in_entryRuleNullValue2369);
				iv_ruleNullValue = ruleNullValue();

				state._fsp--;

				current = iv_ruleNullValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNullValue2379);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1100:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
	public final EObject ruleNullValue() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1103:28: ( ( () otherlv_1= 'null' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1104:1: ( () otherlv_1= 'null' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1104:1: ( () otherlv_1= 'null' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1104:2: () otherlv_1= 'null'
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1104:2: ()
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1105:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getNullValueAccess().getNullValueAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 27, FOLLOW_27_in_ruleNullValue2425);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1122:1: entryRuleNoValue returns [EObject current=null] : iv_ruleNoValue= ruleNoValue EOF ;
	public final EObject entryRuleNoValue() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleNoValue = null;


		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1123:2: (iv_ruleNoValue= ruleNoValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1124:2: iv_ruleNoValue= ruleNoValue EOF
			{
				newCompositeNode(grammarAccess.getNoValueRule());
				pushFollow(FOLLOW_ruleNoValue_in_entryRuleNoValue2461);
				iv_ruleNoValue = ruleNoValue();

				state._fsp--;

				current = iv_ruleNoValue;
				match(input, EOF, FOLLOW_EOF_in_entryRuleNoValue2471);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1131:1: ruleNoValue returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
	public final EObject ruleNoValue() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;

		enterRule();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1134:28: ( ( () otherlv_1= 'none' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1135:1: ( () otherlv_1= 'none' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1135:1: ( () otherlv_1= 'none' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1135:2: () otherlv_1= 'none'
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1135:2: ()
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1136:5:
					{

						current = forceCreateModelElement(
								grammarAccess.getNoValueAccess().getNoValueAction_0(),
								current);


					}

					otherlv_1 = (Token) match(input, 28, FOLLOW_28_in_ruleNoValue2517);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1153:1: ruleVisibilityKind returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) |
	// (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
	public final Enumerator ruleVisibilityKind() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;
		Token enumLiteral_2 = null;
		Token enumLiteral_3 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1155:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) |
			// (enumLiteral_3= '~' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1156:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) |
			// (enumLiteral_3= '~' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1156:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) |
				// (enumLiteral_3= '~' ) )
				int alt16 = 4;
				switch (input.LA(1)) {
				case 29: {
					alt16 = 1;
				}
					break;
				case 30: {
					alt16 = 2;
				}
					break;
				case 31: {
					alt16 = 3;
				}
					break;
				case 32: {
					alt16 = 4;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);

					throw nvae;
				}

				switch (alt16) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1156:2: (enumLiteral_0= '+' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1156:2: (enumLiteral_0= '+' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1156:4: enumLiteral_0= '+'
					{
						enumLiteral_0 = (Token) match(input, 29, FOLLOW_29_in_ruleVisibilityKind2567);

						current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1162:6: (enumLiteral_1= '-' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1162:6: (enumLiteral_1= '-' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1162:8: enumLiteral_1= '-'
					{
						enumLiteral_1 = (Token) match(input, 30, FOLLOW_30_in_ruleVisibilityKind2584);

						current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1168:6: (enumLiteral_2= '#' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1168:6: (enumLiteral_2= '#' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1168:8: enumLiteral_2= '#'
					{
						enumLiteral_2 = (Token) match(input, 31, FOLLOW_31_in_ruleVisibilityKind2601);

						current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_2, grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());


					}


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1174:6: (enumLiteral_3= '~' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1174:6: (enumLiteral_3= '~' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1174:8: enumLiteral_3= '~'
					{
						enumLiteral_3 = (Token) match(input, 32, FOLLOW_32_in_ruleVisibilityKind2618);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1184:1: ruleModifierKind returns [Enumerator current=null] : ( (enumLiteral_0= 'readOnly' ) |
	// (enumLiteral_1= 'union' ) | (enumLiteral_2= 'ordered' ) | (enumLiteral_3= 'unique' ) ) ;
	public final Enumerator ruleModifierKind() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;
		Token enumLiteral_2 = null;
		Token enumLiteral_3 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1186:28: ( ( (enumLiteral_0= 'readOnly' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2=
			// 'ordered' ) | (enumLiteral_3= 'unique' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1187:1: ( (enumLiteral_0= 'readOnly' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'ordered'
			// ) | (enumLiteral_3= 'unique' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1187:1: ( (enumLiteral_0= 'readOnly' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2=
				// 'ordered' ) | (enumLiteral_3= 'unique' ) )
				int alt17 = 4;
				switch (input.LA(1)) {
				case 33: {
					alt17 = 1;
				}
					break;
				case 34: {
					alt17 = 2;
				}
					break;
				case 35: {
					alt17 = 3;
				}
					break;
				case 36: {
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
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1187:2: (enumLiteral_0= 'readOnly' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1187:2: (enumLiteral_0= 'readOnly' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1187:4: enumLiteral_0= 'readOnly'
					{
						enumLiteral_0 = (Token) match(input, 33, FOLLOW_33_in_ruleModifierKind2663);

						current = grammarAccess.getModifierKindAccess().getReadOnlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getModifierKindAccess().getReadOnlyEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1193:6: (enumLiteral_1= 'union' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1193:6: (enumLiteral_1= 'union' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1193:8: enumLiteral_1= 'union'
					{
						enumLiteral_1 = (Token) match(input, 34, FOLLOW_34_in_ruleModifierKind2680);

						current = grammarAccess.getModifierKindAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_1, grammarAccess.getModifierKindAccess().getUnionEnumLiteralDeclaration_1());


					}


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1199:6: (enumLiteral_2= 'ordered' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1199:6: (enumLiteral_2= 'ordered' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1199:8: enumLiteral_2= 'ordered'
					{
						enumLiteral_2 = (Token) match(input, 35, FOLLOW_35_in_ruleModifierKind2697);

						current = grammarAccess.getModifierKindAccess().getOrderedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_2, grammarAccess.getModifierKindAccess().getOrderedEnumLiteralDeclaration_2());


					}


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1205:6: (enumLiteral_3= 'unique' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1205:6: (enumLiteral_3= 'unique' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1205:8: enumLiteral_3= 'unique'
					{
						enumLiteral_3 = (Token) match(input, 36, FOLLOW_36_in_ruleModifierKind2714);

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
	// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1215:1: ruleBooleanLiterals returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) |
	// (enumLiteral_1= 'false' ) ) ;
	public final Enumerator ruleBooleanLiterals() throws RecognitionException {
		Enumerator current = null;

		Token enumLiteral_0 = null;
		Token enumLiteral_1 = null;

		enterRule();
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1217:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1218:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1218:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
				int alt18 = 2;
				int LA18_0 = input.LA(1);

				if ((LA18_0 == 37)) {
					alt18 = 1;
				}
				else if ((LA18_0 == 38)) {
					alt18 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);

					throw nvae;
				}
				switch (alt18) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1218:2: (enumLiteral_0= 'true' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1218:2: (enumLiteral_0= 'true' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1218:4: enumLiteral_0= 'true'
					{
						enumLiteral_0 = (Token) match(input, 37, FOLLOW_37_in_ruleBooleanLiterals2759);

						current = grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
						newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0());


					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1224:6: (enumLiteral_1= 'false' )
				{
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1224:6: (enumLiteral_1= 'false' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/parser/antlr/internal/InternalUmlProperty.g:1224:8: enumLiteral_1= 'false'
					{
						enumLiteral_1 = (Token) match(input, 38, FOLLOW_38_in_ruleBooleanLiterals2776);

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




	public static final BitSet FOLLOW_rulePropertyRule_in_entryRulePropertyRule75 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePropertyRule85 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityRule_in_rulePropertyRule131 = new BitSet(new long[] { 0x0000000000001010L });
	public static final BitSet FOLLOW_12_in_rulePropertyRule150 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_RULE_ID_in_rulePropertyRule181 = new BitSet(new long[] { 0x0000000002112002L });
	public static final BitSet FOLLOW_13_in_rulePropertyRule199 = new BitSet(new long[] { 0x0000000000004010L });
	public static final BitSet FOLLOW_ruleTypeRule_in_rulePropertyRule221 = new BitSet(new long[] { 0x0000000002110002L });
	public static final BitSet FOLLOW_14_in_rulePropertyRule245 = new BitSet(new long[] { 0x0000000002110002L });
	public static final BitSet FOLLOW_ruleMultiplicityRule_in_rulePropertyRule282 = new BitSet(new long[] { 0x0000000002100002L });
	public static final BitSet FOLLOW_ruleModifiersRule_in_rulePropertyRule304 = new BitSet(new long[] { 0x0000000002000002L });
	public static final BitSet FOLLOW_ruleDefaultValueRule_in_rulePropertyRule326 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule363 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityRule373 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleVisibilityRule418 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTypeRule_in_entryRuleTypeRule453 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleTypeRule463 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRule509 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRule530 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName566 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName576 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName621 = new BitSet(new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_15_in_ruleQualifiedName633 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedName654 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule691 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityRule701 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_16_in_ruleMultiplicityRule738 = new BitSet(new long[] { 0x0000000000080020L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule759 = new BitSet(new long[] { 0x0000000000060000L });
	public static final BitSet FOLLOW_17_in_ruleMultiplicityRule772 = new BitSet(new long[] { 0x0000000000080020L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule793 = new BitSet(new long[] { 0x0000000000040000L });
	public static final BitSet FOLLOW_18_in_ruleMultiplicityRule807 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification843 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBoundSpecification853 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleBoundSpecification898 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral934 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral945 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleUnlimitedLiteral985 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_19_in_ruleUnlimitedLiteral1009 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule1049 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleModifiersRule1059 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_20_in_ruleModifiersRule1096 = new BitSet(new long[] { 0x0000001E01800000L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_ruleModifiersRule1117 = new BitSet(new long[] { 0x0000000000600000L });
	public static final BitSet FOLLOW_21_in_ruleModifiersRule1130 = new BitSet(new long[] { 0x0000001E01800000L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_ruleModifiersRule1151 = new BitSet(new long[] { 0x0000000000600000L });
	public static final BitSet FOLLOW_22_in_ruleModifiersRule1165 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification1201 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleModifierSpecification1211 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierKind_in_ruleModifierSpecification1257 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRedefinesRule_in_ruleModifierSpecification1284 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubsetsRule_in_ruleModifierSpecification1311 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRedefinesRule_in_entryRuleRedefinesRule1347 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleRedefinesRule1357 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_23_in_ruleRedefinesRule1394 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleRedefinesRule1414 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubsetsRule_in_entryRuleSubsetsRule1450 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSubsetsRule1460 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_24_in_ruleSubsetsRule1497 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_RULE_ID_in_ruleSubsetsRule1517 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule1553 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueRule1563 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_25_in_ruleDefaultValueRule1600 = new BitSet(new long[] { 0x000000601C000060L });
	public static final BitSet FOLLOW_ruleValue_in_ruleDefaultValueRule1621 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1657 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleValue1667 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIntValue_in_ruleValue1714 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStringValue_in_ruleValue1741 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue1768 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRealValue_in_ruleValue1795 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNullValue_in_ruleValue1822 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNoValue_in_ruleValue1849 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1884 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1894 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue1935 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1975 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1985 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue2026 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2066 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue2076 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanLiterals_in_ruleBooleanValue2121 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue2156 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleRealValue2166 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue2209 = new BitSet(new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_26_in_ruleRealValue2226 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_26_in_ruleRealValue2246 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue2263 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue2293 = new BitSet(new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_26_in_ruleRealValue2310 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue2327 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNullValue_in_entryRuleNullValue2369 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNullValue2379 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_27_in_ruleNullValue2425 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNoValue_in_entryRuleNoValue2461 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNoValue2471 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_28_in_ruleNoValue2517 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_29_in_ruleVisibilityKind2567 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_ruleVisibilityKind2584 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_31_in_ruleVisibilityKind2601 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_ruleVisibilityKind2618 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_33_in_ruleModifierKind2663 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_ruleModifierKind2680 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_35_in_ruleModifierKind2697 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_36_in_ruleModifierKind2714 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_37_in_ruleBooleanLiterals2759 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_38_in_ruleBooleanLiterals2776 = new BitSet(new long[] { 0x0000000000000002L });

}