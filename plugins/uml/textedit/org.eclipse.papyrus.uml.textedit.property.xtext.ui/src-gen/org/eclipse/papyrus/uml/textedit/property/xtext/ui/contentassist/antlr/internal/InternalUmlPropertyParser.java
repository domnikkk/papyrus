package org.eclipse.papyrus.uml.textedit.property.xtext.ui.contentassist.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.papyrus.uml.textedit.property.xtext.services.UmlPropertyGrammarAccess;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class InternalUmlPropertyParser extends AbstractInternalContentAssistParser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INTEGER_VALUE", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'+'", "'-'", "'#'", "'~'", "'readOnly'", "'union'", "'ordered'",
			"'unique'", "'true'", "'false'", "':'", "'::'", "'['", "']'", "'..'", "'{'", "'}'", "','", "'redefines'", "'subsets'", "'='", "'.'", "'null'", "'none'", "'/'", "'<Undefined>'"
	};
	public static final int RULE_ID = 5;
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
	public static final int RULE_INT = 4;
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
		return "../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g";
	}



	private UmlPropertyGrammarAccess grammarAccess;

	public void setGrammarAccess(UmlPropertyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}




	// $ANTLR start "entryRulePropertyRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:60:1: entryRulePropertyRule : rulePropertyRule EOF ;
	public final void entryRulePropertyRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:61:1: ( rulePropertyRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:62:1: rulePropertyRule EOF
			{
				before(grammarAccess.getPropertyRuleRule());
				pushFollow(FOLLOW_rulePropertyRule_in_entryRulePropertyRule61);
				rulePropertyRule();

				state._fsp--;

				after(grammarAccess.getPropertyRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRulePropertyRule68);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRulePropertyRule"


	// $ANTLR start "rulePropertyRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:69:1: rulePropertyRule : ( ( rule__PropertyRule__Group__0 ) ) ;
	public final void rulePropertyRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:73:2: ( ( ( rule__PropertyRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:74:1: ( ( rule__PropertyRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:74:1: ( ( rule__PropertyRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:75:1: ( rule__PropertyRule__Group__0 )
				{
					before(grammarAccess.getPropertyRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:76:1: ( rule__PropertyRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:76:2: rule__PropertyRule__Group__0
					{
						pushFollow(FOLLOW_rule__PropertyRule__Group__0_in_rulePropertyRule94);
						rule__PropertyRule__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getPropertyRuleAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rulePropertyRule"


	// $ANTLR start "entryRuleVisibilityRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:88:1: entryRuleVisibilityRule : ruleVisibilityRule EOF ;
	public final void entryRuleVisibilityRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:89:1: ( ruleVisibilityRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:90:1: ruleVisibilityRule EOF
			{
				before(grammarAccess.getVisibilityRuleRule());
				pushFollow(FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule121);
				ruleVisibilityRule();

				state._fsp--;

				after(grammarAccess.getVisibilityRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleVisibilityRule128);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleVisibilityRule"


	// $ANTLR start "ruleVisibilityRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:97:1: ruleVisibilityRule : ( ( rule__VisibilityRule__VisibilityAssignment ) ) ;
	public final void ruleVisibilityRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:101:2: ( ( ( rule__VisibilityRule__VisibilityAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:102:1: ( ( rule__VisibilityRule__VisibilityAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:102:1: ( ( rule__VisibilityRule__VisibilityAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:103:1: ( rule__VisibilityRule__VisibilityAssignment )
				{
					before(grammarAccess.getVisibilityRuleAccess().getVisibilityAssignment());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:104:1: ( rule__VisibilityRule__VisibilityAssignment )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:104:2: rule__VisibilityRule__VisibilityAssignment
					{
						pushFollow(FOLLOW_rule__VisibilityRule__VisibilityAssignment_in_ruleVisibilityRule154);
						rule__VisibilityRule__VisibilityAssignment();

						state._fsp--;


					}

					after(grammarAccess.getVisibilityRuleAccess().getVisibilityAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleVisibilityRule"


	// $ANTLR start "entryRuleTypeRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:116:1: entryRuleTypeRule : ruleTypeRule EOF ;
	public final void entryRuleTypeRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:117:1: ( ruleTypeRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:118:1: ruleTypeRule EOF
			{
				before(grammarAccess.getTypeRuleRule());
				pushFollow(FOLLOW_ruleTypeRule_in_entryRuleTypeRule181);
				ruleTypeRule();

				state._fsp--;

				after(grammarAccess.getTypeRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleTypeRule188);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleTypeRule"


	// $ANTLR start "ruleTypeRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:125:1: ruleTypeRule : ( ( rule__TypeRule__Group__0 ) ) ;
	public final void ruleTypeRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:129:2: ( ( ( rule__TypeRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:130:1: ( ( rule__TypeRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:130:1: ( ( rule__TypeRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:131:1: ( rule__TypeRule__Group__0 )
				{
					before(grammarAccess.getTypeRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:132:1: ( rule__TypeRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:132:2: rule__TypeRule__Group__0
					{
						pushFollow(FOLLOW_rule__TypeRule__Group__0_in_ruleTypeRule214);
						rule__TypeRule__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getTypeRuleAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleTypeRule"


	// $ANTLR start "entryRuleQualifiedName"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
	public final void entryRuleQualifiedName() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:145:1: ( ruleQualifiedName EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:146:1: ruleQualifiedName EOF
			{
				before(grammarAccess.getQualifiedNameRule());
				pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241);
				ruleQualifiedName();

				state._fsp--;

				after(grammarAccess.getQualifiedNameRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleQualifiedName248);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleQualifiedName"


	// $ANTLR start "ruleQualifiedName"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
	public final void ruleQualifiedName() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:159:1: ( rule__QualifiedName__Group__0 )
				{
					before(grammarAccess.getQualifiedNameAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:160:1: ( rule__QualifiedName__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:160:2: rule__QualifiedName__Group__0
					{
						pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274);
						rule__QualifiedName__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getQualifiedNameAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleQualifiedName"


	// $ANTLR start "entryRuleMultiplicityRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:172:1: entryRuleMultiplicityRule : ruleMultiplicityRule EOF ;
	public final void entryRuleMultiplicityRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:173:1: ( ruleMultiplicityRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:174:1: ruleMultiplicityRule EOF
			{
				before(grammarAccess.getMultiplicityRuleRule());
				pushFollow(FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule301);
				ruleMultiplicityRule();

				state._fsp--;

				after(grammarAccess.getMultiplicityRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleMultiplicityRule308);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleMultiplicityRule"


	// $ANTLR start "ruleMultiplicityRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:181:1: ruleMultiplicityRule : ( ( rule__MultiplicityRule__Group__0 ) ) ;
	public final void ruleMultiplicityRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:185:2: ( ( ( rule__MultiplicityRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:186:1: ( ( rule__MultiplicityRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:186:1: ( ( rule__MultiplicityRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:187:1: ( rule__MultiplicityRule__Group__0 )
				{
					before(grammarAccess.getMultiplicityRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:188:1: ( rule__MultiplicityRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:188:2: rule__MultiplicityRule__Group__0
					{
						pushFollow(FOLLOW_rule__MultiplicityRule__Group__0_in_ruleMultiplicityRule334);
						rule__MultiplicityRule__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getMultiplicityRuleAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleMultiplicityRule"


	// $ANTLR start "entryRuleBoundSpecification"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:200:1: entryRuleBoundSpecification : ruleBoundSpecification EOF ;
	public final void entryRuleBoundSpecification() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:201:1: ( ruleBoundSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:202:1: ruleBoundSpecification EOF
			{
				before(grammarAccess.getBoundSpecificationRule());
				pushFollow(FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification361);
				ruleBoundSpecification();

				state._fsp--;

				after(grammarAccess.getBoundSpecificationRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleBoundSpecification368);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleBoundSpecification"


	// $ANTLR start "ruleBoundSpecification"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:209:1: ruleBoundSpecification : ( ( rule__BoundSpecification__ValueAssignment ) ) ;
	public final void ruleBoundSpecification() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:213:2: ( ( ( rule__BoundSpecification__ValueAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:214:1: ( ( rule__BoundSpecification__ValueAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:214:1: ( ( rule__BoundSpecification__ValueAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:215:1: ( rule__BoundSpecification__ValueAssignment )
				{
					before(grammarAccess.getBoundSpecificationAccess().getValueAssignment());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:216:1: ( rule__BoundSpecification__ValueAssignment )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:216:2: rule__BoundSpecification__ValueAssignment
					{
						pushFollow(FOLLOW_rule__BoundSpecification__ValueAssignment_in_ruleBoundSpecification394);
						rule__BoundSpecification__ValueAssignment();

						state._fsp--;


					}

					after(grammarAccess.getBoundSpecificationAccess().getValueAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleBoundSpecification"


	// $ANTLR start "entryRuleUnlimitedLiteral"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:228:1: entryRuleUnlimitedLiteral : ruleUnlimitedLiteral EOF ;
	public final void entryRuleUnlimitedLiteral() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:229:1: ( ruleUnlimitedLiteral EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:230:1: ruleUnlimitedLiteral EOF
			{
				before(grammarAccess.getUnlimitedLiteralRule());
				pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral421);
				ruleUnlimitedLiteral();

				state._fsp--;

				after(grammarAccess.getUnlimitedLiteralRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleUnlimitedLiteral428);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleUnlimitedLiteral"


	// $ANTLR start "ruleUnlimitedLiteral"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:237:1: ruleUnlimitedLiteral : ( ( rule__UnlimitedLiteral__Alternatives ) ) ;
	public final void ruleUnlimitedLiteral() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:241:2: ( ( ( rule__UnlimitedLiteral__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:242:1: ( ( rule__UnlimitedLiteral__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:242:1: ( ( rule__UnlimitedLiteral__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:243:1: ( rule__UnlimitedLiteral__Alternatives )
				{
					before(grammarAccess.getUnlimitedLiteralAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:244:1: ( rule__UnlimitedLiteral__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:244:2: rule__UnlimitedLiteral__Alternatives
					{
						pushFollow(FOLLOW_rule__UnlimitedLiteral__Alternatives_in_ruleUnlimitedLiteral454);
						rule__UnlimitedLiteral__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getUnlimitedLiteralAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleUnlimitedLiteral"


	// $ANTLR start "entryRuleModifiersRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:256:1: entryRuleModifiersRule : ruleModifiersRule EOF ;
	public final void entryRuleModifiersRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:257:1: ( ruleModifiersRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:258:1: ruleModifiersRule EOF
			{
				before(grammarAccess.getModifiersRuleRule());
				pushFollow(FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule481);
				ruleModifiersRule();

				state._fsp--;

				after(grammarAccess.getModifiersRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleModifiersRule488);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleModifiersRule"


	// $ANTLR start "ruleModifiersRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:265:1: ruleModifiersRule : ( ( rule__ModifiersRule__Group__0 ) ) ;
	public final void ruleModifiersRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:269:2: ( ( ( rule__ModifiersRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:270:1: ( ( rule__ModifiersRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:270:1: ( ( rule__ModifiersRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:271:1: ( rule__ModifiersRule__Group__0 )
				{
					before(grammarAccess.getModifiersRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:272:1: ( rule__ModifiersRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:272:2: rule__ModifiersRule__Group__0
					{
						pushFollow(FOLLOW_rule__ModifiersRule__Group__0_in_ruleModifiersRule514);
						rule__ModifiersRule__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getModifiersRuleAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleModifiersRule"


	// $ANTLR start "entryRuleModifierSpecification"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:284:1: entryRuleModifierSpecification : ruleModifierSpecification EOF ;
	public final void entryRuleModifierSpecification() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:285:1: ( ruleModifierSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:286:1: ruleModifierSpecification EOF
			{
				before(grammarAccess.getModifierSpecificationRule());
				pushFollow(FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification541);
				ruleModifierSpecification();

				state._fsp--;

				after(grammarAccess.getModifierSpecificationRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleModifierSpecification548);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleModifierSpecification"


	// $ANTLR start "ruleModifierSpecification"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:293:1: ruleModifierSpecification : ( ( rule__ModifierSpecification__Alternatives ) ) ;
	public final void ruleModifierSpecification() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:297:2: ( ( ( rule__ModifierSpecification__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:298:1: ( ( rule__ModifierSpecification__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:298:1: ( ( rule__ModifierSpecification__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:299:1: ( rule__ModifierSpecification__Alternatives )
				{
					before(grammarAccess.getModifierSpecificationAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:300:1: ( rule__ModifierSpecification__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:300:2: rule__ModifierSpecification__Alternatives
					{
						pushFollow(FOLLOW_rule__ModifierSpecification__Alternatives_in_ruleModifierSpecification574);
						rule__ModifierSpecification__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getModifierSpecificationAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleModifierSpecification"


	// $ANTLR start "entryRuleRedefinesRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:312:1: entryRuleRedefinesRule : ruleRedefinesRule EOF ;
	public final void entryRuleRedefinesRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:313:1: ( ruleRedefinesRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:314:1: ruleRedefinesRule EOF
			{
				before(grammarAccess.getRedefinesRuleRule());
				pushFollow(FOLLOW_ruleRedefinesRule_in_entryRuleRedefinesRule601);
				ruleRedefinesRule();

				state._fsp--;

				after(grammarAccess.getRedefinesRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleRedefinesRule608);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleRedefinesRule"


	// $ANTLR start "ruleRedefinesRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:321:1: ruleRedefinesRule : ( ( rule__RedefinesRule__Group__0 ) ) ;
	public final void ruleRedefinesRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:325:2: ( ( ( rule__RedefinesRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:326:1: ( ( rule__RedefinesRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:326:1: ( ( rule__RedefinesRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:327:1: ( rule__RedefinesRule__Group__0 )
				{
					before(grammarAccess.getRedefinesRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:328:1: ( rule__RedefinesRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:328:2: rule__RedefinesRule__Group__0
					{
						pushFollow(FOLLOW_rule__RedefinesRule__Group__0_in_ruleRedefinesRule634);
						rule__RedefinesRule__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getRedefinesRuleAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleRedefinesRule"


	// $ANTLR start "entryRuleSubsetsRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:340:1: entryRuleSubsetsRule : ruleSubsetsRule EOF ;
	public final void entryRuleSubsetsRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:341:1: ( ruleSubsetsRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:342:1: ruleSubsetsRule EOF
			{
				before(grammarAccess.getSubsetsRuleRule());
				pushFollow(FOLLOW_ruleSubsetsRule_in_entryRuleSubsetsRule661);
				ruleSubsetsRule();

				state._fsp--;

				after(grammarAccess.getSubsetsRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleSubsetsRule668);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleSubsetsRule"


	// $ANTLR start "ruleSubsetsRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:349:1: ruleSubsetsRule : ( ( rule__SubsetsRule__Group__0 ) ) ;
	public final void ruleSubsetsRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:353:2: ( ( ( rule__SubsetsRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:354:1: ( ( rule__SubsetsRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:354:1: ( ( rule__SubsetsRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:355:1: ( rule__SubsetsRule__Group__0 )
				{
					before(grammarAccess.getSubsetsRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:356:1: ( rule__SubsetsRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:356:2: rule__SubsetsRule__Group__0
					{
						pushFollow(FOLLOW_rule__SubsetsRule__Group__0_in_ruleSubsetsRule694);
						rule__SubsetsRule__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getSubsetsRuleAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleSubsetsRule"


	// $ANTLR start "entryRuleDefaultValueRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:368:1: entryRuleDefaultValueRule : ruleDefaultValueRule EOF ;
	public final void entryRuleDefaultValueRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:369:1: ( ruleDefaultValueRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:370:1: ruleDefaultValueRule EOF
			{
				before(grammarAccess.getDefaultValueRuleRule());
				pushFollow(FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule721);
				ruleDefaultValueRule();

				state._fsp--;

				after(grammarAccess.getDefaultValueRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleDefaultValueRule728);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleDefaultValueRule"


	// $ANTLR start "ruleDefaultValueRule"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:377:1: ruleDefaultValueRule : ( ( rule__DefaultValueRule__Group__0 ) ) ;
	public final void ruleDefaultValueRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:381:2: ( ( ( rule__DefaultValueRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:382:1: ( ( rule__DefaultValueRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:382:1: ( ( rule__DefaultValueRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:383:1: ( rule__DefaultValueRule__Group__0 )
				{
					before(grammarAccess.getDefaultValueRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:384:1: ( rule__DefaultValueRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:384:2: rule__DefaultValueRule__Group__0
					{
						pushFollow(FOLLOW_rule__DefaultValueRule__Group__0_in_ruleDefaultValueRule754);
						rule__DefaultValueRule__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getDefaultValueRuleAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleDefaultValueRule"


	// $ANTLR start "entryRuleValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:396:1: entryRuleValue : ruleValue EOF ;
	public final void entryRuleValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:397:1: ( ruleValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:398:1: ruleValue EOF
			{
				before(grammarAccess.getValueRule());
				pushFollow(FOLLOW_ruleValue_in_entryRuleValue781);
				ruleValue();

				state._fsp--;

				after(grammarAccess.getValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleValue788);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleValue"


	// $ANTLR start "ruleValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:405:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
	public final void ruleValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:409:2: ( ( ( rule__Value__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:410:1: ( ( rule__Value__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:410:1: ( ( rule__Value__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:411:1: ( rule__Value__Alternatives )
				{
					before(grammarAccess.getValueAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:412:1: ( rule__Value__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:412:2: rule__Value__Alternatives
					{
						pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue814);
						rule__Value__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getValueAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleValue"


	// $ANTLR start "entryRuleIntValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:424:1: entryRuleIntValue : ruleIntValue EOF ;
	public final void entryRuleIntValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:425:1: ( ruleIntValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:426:1: ruleIntValue EOF
			{
				before(grammarAccess.getIntValueRule());
				pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue841);
				ruleIntValue();

				state._fsp--;

				after(grammarAccess.getIntValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleIntValue848);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleIntValue"


	// $ANTLR start "ruleIntValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:433:1: ruleIntValue : ( ( rule__IntValue__LiteralIntegerAssignment ) ) ;
	public final void ruleIntValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:437:2: ( ( ( rule__IntValue__LiteralIntegerAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:438:1: ( ( rule__IntValue__LiteralIntegerAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:438:1: ( ( rule__IntValue__LiteralIntegerAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:439:1: ( rule__IntValue__LiteralIntegerAssignment )
				{
					before(grammarAccess.getIntValueAccess().getLiteralIntegerAssignment());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:440:1: ( rule__IntValue__LiteralIntegerAssignment )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:440:2: rule__IntValue__LiteralIntegerAssignment
					{
						pushFollow(FOLLOW_rule__IntValue__LiteralIntegerAssignment_in_ruleIntValue874);
						rule__IntValue__LiteralIntegerAssignment();

						state._fsp--;


					}

					after(grammarAccess.getIntValueAccess().getLiteralIntegerAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleIntValue"


	// $ANTLR start "entryRuleStringValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:452:1: entryRuleStringValue : ruleStringValue EOF ;
	public final void entryRuleStringValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:453:1: ( ruleStringValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:454:1: ruleStringValue EOF
			{
				before(grammarAccess.getStringValueRule());
				pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue901);
				ruleStringValue();

				state._fsp--;

				after(grammarAccess.getStringValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleStringValue908);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleStringValue"


	// $ANTLR start "ruleStringValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:461:1: ruleStringValue : ( ( rule__StringValue__LiteralStringAssignment ) ) ;
	public final void ruleStringValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:465:2: ( ( ( rule__StringValue__LiteralStringAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:466:1: ( ( rule__StringValue__LiteralStringAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:466:1: ( ( rule__StringValue__LiteralStringAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:467:1: ( rule__StringValue__LiteralStringAssignment )
				{
					before(grammarAccess.getStringValueAccess().getLiteralStringAssignment());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:468:1: ( rule__StringValue__LiteralStringAssignment )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:468:2: rule__StringValue__LiteralStringAssignment
					{
						pushFollow(FOLLOW_rule__StringValue__LiteralStringAssignment_in_ruleStringValue934);
						rule__StringValue__LiteralStringAssignment();

						state._fsp--;


					}

					after(grammarAccess.getStringValueAccess().getLiteralStringAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleStringValue"


	// $ANTLR start "entryRuleBooleanValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:480:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
	public final void entryRuleBooleanValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:481:1: ( ruleBooleanValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:482:1: ruleBooleanValue EOF
			{
				before(grammarAccess.getBooleanValueRule());
				pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue961);
				ruleBooleanValue();

				state._fsp--;

				after(grammarAccess.getBooleanValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleBooleanValue968);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleBooleanValue"


	// $ANTLR start "ruleBooleanValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:489:1: ruleBooleanValue : ( ( rule__BooleanValue__LiteralBooleanAssignment ) ) ;
	public final void ruleBooleanValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:493:2: ( ( ( rule__BooleanValue__LiteralBooleanAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:494:1: ( ( rule__BooleanValue__LiteralBooleanAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:494:1: ( ( rule__BooleanValue__LiteralBooleanAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:495:1: ( rule__BooleanValue__LiteralBooleanAssignment )
				{
					before(grammarAccess.getBooleanValueAccess().getLiteralBooleanAssignment());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:496:1: ( rule__BooleanValue__LiteralBooleanAssignment )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:496:2: rule__BooleanValue__LiteralBooleanAssignment
					{
						pushFollow(FOLLOW_rule__BooleanValue__LiteralBooleanAssignment_in_ruleBooleanValue994);
						rule__BooleanValue__LiteralBooleanAssignment();

						state._fsp--;


					}

					after(grammarAccess.getBooleanValueAccess().getLiteralBooleanAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleBooleanValue"


	// $ANTLR start "entryRuleRealValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:508:1: entryRuleRealValue : ruleRealValue EOF ;
	public final void entryRuleRealValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:509:1: ( ruleRealValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:510:1: ruleRealValue EOF
			{
				before(grammarAccess.getRealValueRule());
				pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue1021);
				ruleRealValue();

				state._fsp--;

				after(grammarAccess.getRealValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleRealValue1028);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleRealValue"


	// $ANTLR start "ruleRealValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:517:1: ruleRealValue : ( ( rule__RealValue__Alternatives ) ) ;
	public final void ruleRealValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:521:2: ( ( ( rule__RealValue__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:522:1: ( ( rule__RealValue__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:522:1: ( ( rule__RealValue__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:523:1: ( rule__RealValue__Alternatives )
				{
					before(grammarAccess.getRealValueAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:524:1: ( rule__RealValue__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:524:2: rule__RealValue__Alternatives
					{
						pushFollow(FOLLOW_rule__RealValue__Alternatives_in_ruleRealValue1054);
						rule__RealValue__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getRealValueAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleRealValue"


	// $ANTLR start "entryRuleNullValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:536:1: entryRuleNullValue : ruleNullValue EOF ;
	public final void entryRuleNullValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:537:1: ( ruleNullValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:538:1: ruleNullValue EOF
			{
				before(grammarAccess.getNullValueRule());
				pushFollow(FOLLOW_ruleNullValue_in_entryRuleNullValue1081);
				ruleNullValue();

				state._fsp--;

				after(grammarAccess.getNullValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleNullValue1088);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleNullValue"


	// $ANTLR start "ruleNullValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:545:1: ruleNullValue : ( ( rule__NullValue__Group__0 ) ) ;
	public final void ruleNullValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:549:2: ( ( ( rule__NullValue__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:550:1: ( ( rule__NullValue__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:550:1: ( ( rule__NullValue__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:551:1: ( rule__NullValue__Group__0 )
				{
					before(grammarAccess.getNullValueAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:552:1: ( rule__NullValue__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:552:2: rule__NullValue__Group__0
					{
						pushFollow(FOLLOW_rule__NullValue__Group__0_in_ruleNullValue1114);
						rule__NullValue__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getNullValueAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleNullValue"


	// $ANTLR start "entryRuleNoValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:564:1: entryRuleNoValue : ruleNoValue EOF ;
	public final void entryRuleNoValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:565:1: ( ruleNoValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:566:1: ruleNoValue EOF
			{
				before(grammarAccess.getNoValueRule());
				pushFollow(FOLLOW_ruleNoValue_in_entryRuleNoValue1141);
				ruleNoValue();

				state._fsp--;

				after(grammarAccess.getNoValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleNoValue1148);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleNoValue"


	// $ANTLR start "ruleNoValue"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:573:1: ruleNoValue : ( ( rule__NoValue__Group__0 ) ) ;
	public final void ruleNoValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:577:2: ( ( ( rule__NoValue__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:578:1: ( ( rule__NoValue__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:578:1: ( ( rule__NoValue__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:579:1: ( rule__NoValue__Group__0 )
				{
					before(grammarAccess.getNoValueAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:580:1: ( rule__NoValue__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:580:2: rule__NoValue__Group__0
					{
						pushFollow(FOLLOW_rule__NoValue__Group__0_in_ruleNoValue1174);
						rule__NoValue__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getNoValueAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleNoValue"


	// $ANTLR start "ruleVisibilityKind"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:593:1: ruleVisibilityKind : ( ( rule__VisibilityKind__Alternatives ) ) ;
	public final void ruleVisibilityKind() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:597:1: ( ( ( rule__VisibilityKind__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:598:1: ( ( rule__VisibilityKind__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:598:1: ( ( rule__VisibilityKind__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:599:1: ( rule__VisibilityKind__Alternatives )
				{
					before(grammarAccess.getVisibilityKindAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:600:1: ( rule__VisibilityKind__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:600:2: rule__VisibilityKind__Alternatives
					{
						pushFollow(FOLLOW_rule__VisibilityKind__Alternatives_in_ruleVisibilityKind1211);
						rule__VisibilityKind__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getVisibilityKindAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleVisibilityKind"


	// $ANTLR start "ruleModifierKind"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:612:1: ruleModifierKind : ( ( rule__ModifierKind__Alternatives ) ) ;
	public final void ruleModifierKind() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:616:1: ( ( ( rule__ModifierKind__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:617:1: ( ( rule__ModifierKind__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:617:1: ( ( rule__ModifierKind__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:618:1: ( rule__ModifierKind__Alternatives )
				{
					before(grammarAccess.getModifierKindAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:619:1: ( rule__ModifierKind__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:619:2: rule__ModifierKind__Alternatives
					{
						pushFollow(FOLLOW_rule__ModifierKind__Alternatives_in_ruleModifierKind1247);
						rule__ModifierKind__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getModifierKindAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleModifierKind"


	// $ANTLR start "ruleBooleanLiterals"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:631:1: ruleBooleanLiterals : ( ( rule__BooleanLiterals__Alternatives ) ) ;
	public final void ruleBooleanLiterals() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:635:1: ( ( ( rule__BooleanLiterals__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:636:1: ( ( rule__BooleanLiterals__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:636:1: ( ( rule__BooleanLiterals__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:637:1: ( rule__BooleanLiterals__Alternatives )
				{
					before(grammarAccess.getBooleanLiteralsAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:638:1: ( rule__BooleanLiterals__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:638:2: rule__BooleanLiterals__Alternatives
					{
						pushFollow(FOLLOW_rule__BooleanLiterals__Alternatives_in_ruleBooleanLiterals1283);
						rule__BooleanLiterals__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getBooleanLiteralsAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleBooleanLiterals"


	// $ANTLR start "rule__PropertyRule__Alternatives_3_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:649:1: rule__PropertyRule__Alternatives_3_1 : ( ( (
	// rule__PropertyRule__TypeAssignment_3_1_0 ) ) | ( ( rule__PropertyRule__TypeUndefinedAssignment_3_1_1 ) ) );
	public final void rule__PropertyRule__Alternatives_3_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:653:1: ( ( ( rule__PropertyRule__TypeAssignment_3_1_0 ) ) | ( (
			// rule__PropertyRule__TypeUndefinedAssignment_3_1_1 ) ) )
			int alt1 = 2;
			int LA1_0 = input.LA(1);

			if ((LA1_0 == RULE_ID)) {
				alt1 = 1;
			}
			else if ((LA1_0 == 38)) {
				alt1 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 1, 0, input);

				throw nvae;
			}
			switch (alt1) {
			case 1:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:654:1: ( ( rule__PropertyRule__TypeAssignment_3_1_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:654:1: ( ( rule__PropertyRule__TypeAssignment_3_1_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:655:1: ( rule__PropertyRule__TypeAssignment_3_1_0 )
				{
					before(grammarAccess.getPropertyRuleAccess().getTypeAssignment_3_1_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:656:1: ( rule__PropertyRule__TypeAssignment_3_1_0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:656:2: rule__PropertyRule__TypeAssignment_3_1_0
					{
						pushFollow(FOLLOW_rule__PropertyRule__TypeAssignment_3_1_0_in_rule__PropertyRule__Alternatives_3_11318);
						rule__PropertyRule__TypeAssignment_3_1_0();

						state._fsp--;


					}

					after(grammarAccess.getPropertyRuleAccess().getTypeAssignment_3_1_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:660:6: ( ( rule__PropertyRule__TypeUndefinedAssignment_3_1_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:660:6: ( ( rule__PropertyRule__TypeUndefinedAssignment_3_1_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:661:1: ( rule__PropertyRule__TypeUndefinedAssignment_3_1_1 )
				{
					before(grammarAccess.getPropertyRuleAccess().getTypeUndefinedAssignment_3_1_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:662:1: ( rule__PropertyRule__TypeUndefinedAssignment_3_1_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:662:2: rule__PropertyRule__TypeUndefinedAssignment_3_1_1
					{
						pushFollow(FOLLOW_rule__PropertyRule__TypeUndefinedAssignment_3_1_1_in_rule__PropertyRule__Alternatives_3_11336);
						rule__PropertyRule__TypeUndefinedAssignment_3_1_1();

						state._fsp--;


					}

					after(grammarAccess.getPropertyRuleAccess().getTypeUndefinedAssignment_3_1_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Alternatives_3_1"


	// $ANTLR start "rule__UnlimitedLiteral__Alternatives"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:671:1: rule__UnlimitedLiteral__Alternatives : ( ( RULE_INT ) | ( '*' ) );
	public final void rule__UnlimitedLiteral__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:675:1: ( ( RULE_INT ) | ( '*' ) )
			int alt2 = 2;
			int LA2_0 = input.LA(1);

			if ((LA2_0 == RULE_INT)) {
				alt2 = 1;
			}
			else if ((LA2_0 == 12)) {
				alt2 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 2, 0, input);

				throw nvae;
			}
			switch (alt2) {
			case 1:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:676:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:676:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:677:1: RULE_INT
				{
					before(grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__UnlimitedLiteral__Alternatives1369);
					after(grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:682:6: ( '*' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:682:6: ( '*' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:683:1: '*'
				{
					before(grammarAccess.getUnlimitedLiteralAccess().getAsteriskKeyword_1());
					match(input, 12, FOLLOW_12_in_rule__UnlimitedLiteral__Alternatives1387);
					after(grammarAccess.getUnlimitedLiteralAccess().getAsteriskKeyword_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__UnlimitedLiteral__Alternatives"


	// $ANTLR start "rule__ModifierSpecification__Alternatives"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:695:1: rule__ModifierSpecification__Alternatives : ( ( (
	// rule__ModifierSpecification__ValueAssignment_0 ) ) | ( ( rule__ModifierSpecification__RedefinesAssignment_1 ) ) | ( ( rule__ModifierSpecification__SubsetsAssignment_2 ) ) );
	public final void rule__ModifierSpecification__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:699:1: ( ( ( rule__ModifierSpecification__ValueAssignment_0 ) ) | ( (
			// rule__ModifierSpecification__RedefinesAssignment_1 ) ) | ( ( rule__ModifierSpecification__SubsetsAssignment_2 ) ) )
			int alt3 = 3;
			switch (input.LA(1)) {
			case 17:
			case 18:
			case 19:
			case 20: {
				alt3 = 1;
			}
				break;
			case 31: {
				alt3 = 2;
			}
				break;
			case 32: {
				alt3 = 3;
			}
				break;
			default:
				NoViableAltException nvae =
						new NoViableAltException("", 3, 0, input);

				throw nvae;
			}

			switch (alt3) {
			case 1:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:700:1: ( ( rule__ModifierSpecification__ValueAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:700:1: ( ( rule__ModifierSpecification__ValueAssignment_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:701:1: ( rule__ModifierSpecification__ValueAssignment_0 )
				{
					before(grammarAccess.getModifierSpecificationAccess().getValueAssignment_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:702:1: ( rule__ModifierSpecification__ValueAssignment_0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:702:2: rule__ModifierSpecification__ValueAssignment_0
					{
						pushFollow(FOLLOW_rule__ModifierSpecification__ValueAssignment_0_in_rule__ModifierSpecification__Alternatives1421);
						rule__ModifierSpecification__ValueAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getModifierSpecificationAccess().getValueAssignment_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:706:6: ( ( rule__ModifierSpecification__RedefinesAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:706:6: ( ( rule__ModifierSpecification__RedefinesAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:707:1: ( rule__ModifierSpecification__RedefinesAssignment_1 )
				{
					before(grammarAccess.getModifierSpecificationAccess().getRedefinesAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:708:1: ( rule__ModifierSpecification__RedefinesAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:708:2: rule__ModifierSpecification__RedefinesAssignment_1
					{
						pushFollow(FOLLOW_rule__ModifierSpecification__RedefinesAssignment_1_in_rule__ModifierSpecification__Alternatives1439);
						rule__ModifierSpecification__RedefinesAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getModifierSpecificationAccess().getRedefinesAssignment_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:712:6: ( ( rule__ModifierSpecification__SubsetsAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:712:6: ( ( rule__ModifierSpecification__SubsetsAssignment_2 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:713:1: ( rule__ModifierSpecification__SubsetsAssignment_2 )
				{
					before(grammarAccess.getModifierSpecificationAccess().getSubsetsAssignment_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:714:1: ( rule__ModifierSpecification__SubsetsAssignment_2 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:714:2: rule__ModifierSpecification__SubsetsAssignment_2
					{
						pushFollow(FOLLOW_rule__ModifierSpecification__SubsetsAssignment_2_in_rule__ModifierSpecification__Alternatives1457);
						rule__ModifierSpecification__SubsetsAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getModifierSpecificationAccess().getSubsetsAssignment_2());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifierSpecification__Alternatives"


	// $ANTLR start "rule__Value__Alternatives"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:723:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | (
	// ruleBooleanValue ) | ( ruleRealValue ) | ( ruleNullValue ) | ( ruleNoValue ) );
	public final void rule__Value__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:727:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | (
			// ruleRealValue ) | ( ruleNullValue ) | ( ruleNoValue ) )
			int alt4 = 6;
			switch (input.LA(1)) {
			case RULE_INT: {
				int LA4_1 = input.LA(2);

				if ((LA4_1 == 34)) {
					alt4 = 4;
				}
				else if ((LA4_1 == EOF)) {
					alt4 = 1;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);

					throw nvae;
				}
			}
				break;
			case RULE_STRING: {
				alt4 = 2;
			}
				break;
			case 21:
			case 22: {
				alt4 = 3;
			}
				break;
			case 34: {
				alt4 = 4;
			}
				break;
			case 35: {
				alt4 = 5;
			}
				break;
			case 36: {
				alt4 = 6;
			}
				break;
			default:
				NoViableAltException nvae =
						new NoViableAltException("", 4, 0, input);

				throw nvae;
			}

			switch (alt4) {
			case 1:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:728:1: ( ruleIntValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:728:1: ( ruleIntValue )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:729:1: ruleIntValue
				{
					before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0());
					pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives1490);
					ruleIntValue();

					state._fsp--;

					after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:734:6: ( ruleStringValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:734:6: ( ruleStringValue )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:735:1: ruleStringValue
				{
					before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1());
					pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives1507);
					ruleStringValue();

					state._fsp--;

					after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:740:6: ( ruleBooleanValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:740:6: ( ruleBooleanValue )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:741:1: ruleBooleanValue
				{
					before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2());
					pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives1524);
					ruleBooleanValue();

					state._fsp--;

					after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2());

				}


			}
				break;
			case 4:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:746:6: ( ruleRealValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:746:6: ( ruleRealValue )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:747:1: ruleRealValue
				{
					before(grammarAccess.getValueAccess().getRealValueParserRuleCall_3());
					pushFollow(FOLLOW_ruleRealValue_in_rule__Value__Alternatives1541);
					ruleRealValue();

					state._fsp--;

					after(grammarAccess.getValueAccess().getRealValueParserRuleCall_3());

				}


			}
				break;
			case 5:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:752:6: ( ruleNullValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:752:6: ( ruleNullValue )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:753:1: ruleNullValue
				{
					before(grammarAccess.getValueAccess().getNullValueParserRuleCall_4());
					pushFollow(FOLLOW_ruleNullValue_in_rule__Value__Alternatives1558);
					ruleNullValue();

					state._fsp--;

					after(grammarAccess.getValueAccess().getNullValueParserRuleCall_4());

				}


			}
				break;
			case 6:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:758:6: ( ruleNoValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:758:6: ( ruleNoValue )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:759:1: ruleNoValue
				{
					before(grammarAccess.getValueAccess().getNoValueParserRuleCall_5());
					pushFollow(FOLLOW_ruleNoValue_in_rule__Value__Alternatives1575);
					ruleNoValue();

					state._fsp--;

					after(grammarAccess.getValueAccess().getNoValueParserRuleCall_5());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Value__Alternatives"


	// $ANTLR start "rule__RealValue__Alternatives"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:769:1: rule__RealValue__Alternatives : ( ( ( rule__RealValue__Group_0__0 ) ) | ( (
	// rule__RealValue__Group_1__0 ) ) | ( ( rule__RealValue__Group_2__0 ) ) );
	public final void rule__RealValue__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:773:1: ( ( ( rule__RealValue__Group_0__0 ) ) | ( ( rule__RealValue__Group_1__0 )
			// ) | ( ( rule__RealValue__Group_2__0 ) ) )
			int alt5 = 3;
			int LA5_0 = input.LA(1);

			if ((LA5_0 == RULE_INT)) {
				int LA5_1 = input.LA(2);

				if ((LA5_1 == 34)) {
					int LA5_3 = input.LA(3);

					if ((LA5_3 == EOF)) {
						alt5 = 1;
					}
					else if ((LA5_3 == RULE_INT)) {
						alt5 = 3;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 5, 3, input);

						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);

					throw nvae;
				}
			}
			else if ((LA5_0 == 34)) {
				alt5 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 5, 0, input);

				throw nvae;
			}
			switch (alt5) {
			case 1:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:774:1: ( ( rule__RealValue__Group_0__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:774:1: ( ( rule__RealValue__Group_0__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:775:1: ( rule__RealValue__Group_0__0 )
				{
					before(grammarAccess.getRealValueAccess().getGroup_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:776:1: ( rule__RealValue__Group_0__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:776:2: rule__RealValue__Group_0__0
					{
						pushFollow(FOLLOW_rule__RealValue__Group_0__0_in_rule__RealValue__Alternatives1607);
						rule__RealValue__Group_0__0();

						state._fsp--;


					}

					after(grammarAccess.getRealValueAccess().getGroup_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:780:6: ( ( rule__RealValue__Group_1__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:780:6: ( ( rule__RealValue__Group_1__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:781:1: ( rule__RealValue__Group_1__0 )
				{
					before(grammarAccess.getRealValueAccess().getGroup_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:782:1: ( rule__RealValue__Group_1__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:782:2: rule__RealValue__Group_1__0
					{
						pushFollow(FOLLOW_rule__RealValue__Group_1__0_in_rule__RealValue__Alternatives1625);
						rule__RealValue__Group_1__0();

						state._fsp--;


					}

					after(grammarAccess.getRealValueAccess().getGroup_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:786:6: ( ( rule__RealValue__Group_2__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:786:6: ( ( rule__RealValue__Group_2__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:787:1: ( rule__RealValue__Group_2__0 )
				{
					before(grammarAccess.getRealValueAccess().getGroup_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:788:1: ( rule__RealValue__Group_2__0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:788:2: rule__RealValue__Group_2__0
					{
						pushFollow(FOLLOW_rule__RealValue__Group_2__0_in_rule__RealValue__Alternatives1643);
						rule__RealValue__Group_2__0();

						state._fsp--;


					}

					after(grammarAccess.getRealValueAccess().getGroup_2());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Alternatives"


	// $ANTLR start "rule__VisibilityKind__Alternatives"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:797:1: rule__VisibilityKind__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | (
	// ( '~' ) ) );
	public final void rule__VisibilityKind__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:801:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) )
			int alt6 = 4;
			switch (input.LA(1)) {
			case 13: {
				alt6 = 1;
			}
				break;
			case 14: {
				alt6 = 2;
			}
				break;
			case 15: {
				alt6 = 3;
			}
				break;
			case 16: {
				alt6 = 4;
			}
				break;
			default:
				NoViableAltException nvae =
						new NoViableAltException("", 6, 0, input);

				throw nvae;
			}

			switch (alt6) {
			case 1:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:802:1: ( ( '+' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:802:1: ( ( '+' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:803:1: ( '+' )
				{
					before(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:804:1: ( '+' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:804:3: '+'
					{
						match(input, 13, FOLLOW_13_in_rule__VisibilityKind__Alternatives1677);

					}

					after(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:809:6: ( ( '-' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:809:6: ( ( '-' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:810:1: ( '-' )
				{
					before(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:811:1: ( '-' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:811:3: '-'
					{
						match(input, 14, FOLLOW_14_in_rule__VisibilityKind__Alternatives1698);

					}

					after(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:816:6: ( ( '#' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:816:6: ( ( '#' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:817:1: ( '#' )
				{
					before(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:818:1: ( '#' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:818:3: '#'
					{
						match(input, 15, FOLLOW_15_in_rule__VisibilityKind__Alternatives1719);

					}

					after(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());

				}


			}
				break;
			case 4:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:823:6: ( ( '~' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:823:6: ( ( '~' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:824:1: ( '~' )
				{
					before(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:825:1: ( '~' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:825:3: '~'
					{
						match(input, 16, FOLLOW_16_in_rule__VisibilityKind__Alternatives1740);

					}

					after(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__VisibilityKind__Alternatives"


	// $ANTLR start "rule__ModifierKind__Alternatives"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:835:1: rule__ModifierKind__Alternatives : ( ( ( 'readOnly' ) ) | ( ( 'union' ) ) | ( (
	// 'ordered' ) ) | ( ( 'unique' ) ) );
	public final void rule__ModifierKind__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:839:1: ( ( ( 'readOnly' ) ) | ( ( 'union' ) ) | ( ( 'ordered' ) ) | ( ( 'unique'
			// ) ) )
			int alt7 = 4;
			switch (input.LA(1)) {
			case 17: {
				alt7 = 1;
			}
				break;
			case 18: {
				alt7 = 2;
			}
				break;
			case 19: {
				alt7 = 3;
			}
				break;
			case 20: {
				alt7 = 4;
			}
				break;
			default:
				NoViableAltException nvae =
						new NoViableAltException("", 7, 0, input);

				throw nvae;
			}

			switch (alt7) {
			case 1:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:840:1: ( ( 'readOnly' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:840:1: ( ( 'readOnly' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:841:1: ( 'readOnly' )
				{
					before(grammarAccess.getModifierKindAccess().getReadOnlyEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:842:1: ( 'readOnly' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:842:3: 'readOnly'
					{
						match(input, 17, FOLLOW_17_in_rule__ModifierKind__Alternatives1776);

					}

					after(grammarAccess.getModifierKindAccess().getReadOnlyEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:847:6: ( ( 'union' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:847:6: ( ( 'union' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:848:1: ( 'union' )
				{
					before(grammarAccess.getModifierKindAccess().getUnionEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:849:1: ( 'union' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:849:3: 'union'
					{
						match(input, 18, FOLLOW_18_in_rule__ModifierKind__Alternatives1797);

					}

					after(grammarAccess.getModifierKindAccess().getUnionEnumLiteralDeclaration_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:854:6: ( ( 'ordered' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:854:6: ( ( 'ordered' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:855:1: ( 'ordered' )
				{
					before(grammarAccess.getModifierKindAccess().getOrderedEnumLiteralDeclaration_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:856:1: ( 'ordered' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:856:3: 'ordered'
					{
						match(input, 19, FOLLOW_19_in_rule__ModifierKind__Alternatives1818);

					}

					after(grammarAccess.getModifierKindAccess().getOrderedEnumLiteralDeclaration_2());

				}


			}
				break;
			case 4:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:861:6: ( ( 'unique' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:861:6: ( ( 'unique' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:862:1: ( 'unique' )
				{
					before(grammarAccess.getModifierKindAccess().getUniqueEnumLiteralDeclaration_3());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:863:1: ( 'unique' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:863:3: 'unique'
					{
						match(input, 20, FOLLOW_20_in_rule__ModifierKind__Alternatives1839);

					}

					after(grammarAccess.getModifierKindAccess().getUniqueEnumLiteralDeclaration_3());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifierKind__Alternatives"


	// $ANTLR start "rule__BooleanLiterals__Alternatives"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:873:1: rule__BooleanLiterals__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
	public final void rule__BooleanLiterals__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:877:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
			int alt8 = 2;
			int LA8_0 = input.LA(1);

			if ((LA8_0 == 21)) {
				alt8 = 1;
			}
			else if ((LA8_0 == 22)) {
				alt8 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 8, 0, input);

				throw nvae;
			}
			switch (alt8) {
			case 1:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:878:1: ( ( 'true' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:878:1: ( ( 'true' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:879:1: ( 'true' )
				{
					before(grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:880:1: ( 'true' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:880:3: 'true'
					{
						match(input, 21, FOLLOW_21_in_rule__BooleanLiterals__Alternatives1875);

					}

					after(grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:885:6: ( ( 'false' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:885:6: ( ( 'false' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:886:1: ( 'false' )
				{
					before(grammarAccess.getBooleanLiteralsAccess().getFalseEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:887:1: ( 'false' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:887:3: 'false'
					{
						match(input, 22, FOLLOW_22_in_rule__BooleanLiterals__Alternatives1896);

					}

					after(grammarAccess.getBooleanLiteralsAccess().getFalseEnumLiteralDeclaration_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__BooleanLiterals__Alternatives"


	// $ANTLR start "rule__PropertyRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:899:1: rule__PropertyRule__Group__0 : rule__PropertyRule__Group__0__Impl
	// rule__PropertyRule__Group__1 ;
	public final void rule__PropertyRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:903:1: ( rule__PropertyRule__Group__0__Impl rule__PropertyRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:904:2: rule__PropertyRule__Group__0__Impl rule__PropertyRule__Group__1
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group__0__Impl_in_rule__PropertyRule__Group__01929);
				rule__PropertyRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PropertyRule__Group__1_in_rule__PropertyRule__Group__01932);
				rule__PropertyRule__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__0"


	// $ANTLR start "rule__PropertyRule__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:911:1: rule__PropertyRule__Group__0__Impl : ( (
	// rule__PropertyRule__VisibilityAssignment_0 )? ) ;
	public final void rule__PropertyRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:915:1: ( ( ( rule__PropertyRule__VisibilityAssignment_0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:916:1: ( ( rule__PropertyRule__VisibilityAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:916:1: ( ( rule__PropertyRule__VisibilityAssignment_0 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:917:1: ( rule__PropertyRule__VisibilityAssignment_0 )?
				{
					before(grammarAccess.getPropertyRuleAccess().getVisibilityAssignment_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:918:1: ( rule__PropertyRule__VisibilityAssignment_0 )?
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if (((LA9_0 >= 13 && LA9_0 <= 16))) {
						alt9 = 1;
					}
					switch (alt9) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:918:2: rule__PropertyRule__VisibilityAssignment_0
					{
						pushFollow(FOLLOW_rule__PropertyRule__VisibilityAssignment_0_in_rule__PropertyRule__Group__0__Impl1959);
						rule__PropertyRule__VisibilityAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPropertyRuleAccess().getVisibilityAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__0__Impl"


	// $ANTLR start "rule__PropertyRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:928:1: rule__PropertyRule__Group__1 : rule__PropertyRule__Group__1__Impl
	// rule__PropertyRule__Group__2 ;
	public final void rule__PropertyRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:932:1: ( rule__PropertyRule__Group__1__Impl rule__PropertyRule__Group__2 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:933:2: rule__PropertyRule__Group__1__Impl rule__PropertyRule__Group__2
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group__1__Impl_in_rule__PropertyRule__Group__11990);
				rule__PropertyRule__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PropertyRule__Group__2_in_rule__PropertyRule__Group__11993);
				rule__PropertyRule__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__1"


	// $ANTLR start "rule__PropertyRule__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:940:1: rule__PropertyRule__Group__1__Impl : ( ( rule__PropertyRule__DerivedAssignment_1
	// )? ) ;
	public final void rule__PropertyRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:944:1: ( ( ( rule__PropertyRule__DerivedAssignment_1 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:945:1: ( ( rule__PropertyRule__DerivedAssignment_1 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:945:1: ( ( rule__PropertyRule__DerivedAssignment_1 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:946:1: ( rule__PropertyRule__DerivedAssignment_1 )?
				{
					before(grammarAccess.getPropertyRuleAccess().getDerivedAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:947:1: ( rule__PropertyRule__DerivedAssignment_1 )?
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == 37)) {
						alt10 = 1;
					}
					switch (alt10) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:947:2: rule__PropertyRule__DerivedAssignment_1
					{
						pushFollow(FOLLOW_rule__PropertyRule__DerivedAssignment_1_in_rule__PropertyRule__Group__1__Impl2020);
						rule__PropertyRule__DerivedAssignment_1();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPropertyRuleAccess().getDerivedAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__1__Impl"


	// $ANTLR start "rule__PropertyRule__Group__2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:957:1: rule__PropertyRule__Group__2 : rule__PropertyRule__Group__2__Impl
	// rule__PropertyRule__Group__3 ;
	public final void rule__PropertyRule__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:961:1: ( rule__PropertyRule__Group__2__Impl rule__PropertyRule__Group__3 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:962:2: rule__PropertyRule__Group__2__Impl rule__PropertyRule__Group__3
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group__2__Impl_in_rule__PropertyRule__Group__22051);
				rule__PropertyRule__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PropertyRule__Group__3_in_rule__PropertyRule__Group__22054);
				rule__PropertyRule__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__2"


	// $ANTLR start "rule__PropertyRule__Group__2__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:969:1: rule__PropertyRule__Group__2__Impl : ( ( rule__PropertyRule__NameAssignment_2 ) )
	// ;
	public final void rule__PropertyRule__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:973:1: ( ( ( rule__PropertyRule__NameAssignment_2 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:974:1: ( ( rule__PropertyRule__NameAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:974:1: ( ( rule__PropertyRule__NameAssignment_2 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:975:1: ( rule__PropertyRule__NameAssignment_2 )
				{
					before(grammarAccess.getPropertyRuleAccess().getNameAssignment_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:976:1: ( rule__PropertyRule__NameAssignment_2 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:976:2: rule__PropertyRule__NameAssignment_2
					{
						pushFollow(FOLLOW_rule__PropertyRule__NameAssignment_2_in_rule__PropertyRule__Group__2__Impl2081);
						rule__PropertyRule__NameAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getPropertyRuleAccess().getNameAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__2__Impl"


	// $ANTLR start "rule__PropertyRule__Group__3"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:986:1: rule__PropertyRule__Group__3 : rule__PropertyRule__Group__3__Impl
	// rule__PropertyRule__Group__4 ;
	public final void rule__PropertyRule__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:990:1: ( rule__PropertyRule__Group__3__Impl rule__PropertyRule__Group__4 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:991:2: rule__PropertyRule__Group__3__Impl rule__PropertyRule__Group__4
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group__3__Impl_in_rule__PropertyRule__Group__32111);
				rule__PropertyRule__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PropertyRule__Group__4_in_rule__PropertyRule__Group__32114);
				rule__PropertyRule__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__3"


	// $ANTLR start "rule__PropertyRule__Group__3__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:998:1: rule__PropertyRule__Group__3__Impl : ( ( rule__PropertyRule__Group_3__0 )? ) ;
	public final void rule__PropertyRule__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1002:1: ( ( ( rule__PropertyRule__Group_3__0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1003:1: ( ( rule__PropertyRule__Group_3__0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1003:1: ( ( rule__PropertyRule__Group_3__0 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1004:1: ( rule__PropertyRule__Group_3__0 )?
				{
					before(grammarAccess.getPropertyRuleAccess().getGroup_3());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1005:1: ( rule__PropertyRule__Group_3__0 )?
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == 23)) {
						alt11 = 1;
					}
					switch (alt11) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1005:2: rule__PropertyRule__Group_3__0
					{
						pushFollow(FOLLOW_rule__PropertyRule__Group_3__0_in_rule__PropertyRule__Group__3__Impl2141);
						rule__PropertyRule__Group_3__0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPropertyRuleAccess().getGroup_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__3__Impl"


	// $ANTLR start "rule__PropertyRule__Group__4"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1015:1: rule__PropertyRule__Group__4 : rule__PropertyRule__Group__4__Impl
	// rule__PropertyRule__Group__5 ;
	public final void rule__PropertyRule__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1019:1: ( rule__PropertyRule__Group__4__Impl rule__PropertyRule__Group__5 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1020:2: rule__PropertyRule__Group__4__Impl rule__PropertyRule__Group__5
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group__4__Impl_in_rule__PropertyRule__Group__42172);
				rule__PropertyRule__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PropertyRule__Group__5_in_rule__PropertyRule__Group__42175);
				rule__PropertyRule__Group__5();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__4"


	// $ANTLR start "rule__PropertyRule__Group__4__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1027:1: rule__PropertyRule__Group__4__Impl : ( (
	// rule__PropertyRule__MultiplicityAssignment_4 )? ) ;
	public final void rule__PropertyRule__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1031:1: ( ( ( rule__PropertyRule__MultiplicityAssignment_4 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1032:1: ( ( rule__PropertyRule__MultiplicityAssignment_4 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1032:1: ( ( rule__PropertyRule__MultiplicityAssignment_4 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1033:1: ( rule__PropertyRule__MultiplicityAssignment_4 )?
				{
					before(grammarAccess.getPropertyRuleAccess().getMultiplicityAssignment_4());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1034:1: ( rule__PropertyRule__MultiplicityAssignment_4 )?
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if ((LA12_0 == 25)) {
						alt12 = 1;
					}
					switch (alt12) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1034:2: rule__PropertyRule__MultiplicityAssignment_4
					{
						pushFollow(FOLLOW_rule__PropertyRule__MultiplicityAssignment_4_in_rule__PropertyRule__Group__4__Impl2202);
						rule__PropertyRule__MultiplicityAssignment_4();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPropertyRuleAccess().getMultiplicityAssignment_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__4__Impl"


	// $ANTLR start "rule__PropertyRule__Group__5"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1044:1: rule__PropertyRule__Group__5 : rule__PropertyRule__Group__5__Impl
	// rule__PropertyRule__Group__6 ;
	public final void rule__PropertyRule__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1048:1: ( rule__PropertyRule__Group__5__Impl rule__PropertyRule__Group__6 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1049:2: rule__PropertyRule__Group__5__Impl rule__PropertyRule__Group__6
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group__5__Impl_in_rule__PropertyRule__Group__52233);
				rule__PropertyRule__Group__5__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PropertyRule__Group__6_in_rule__PropertyRule__Group__52236);
				rule__PropertyRule__Group__6();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__5"


	// $ANTLR start "rule__PropertyRule__Group__5__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1056:1: rule__PropertyRule__Group__5__Impl : ( (
	// rule__PropertyRule__ModifiersAssignment_5 )? ) ;
	public final void rule__PropertyRule__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1060:1: ( ( ( rule__PropertyRule__ModifiersAssignment_5 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1061:1: ( ( rule__PropertyRule__ModifiersAssignment_5 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1061:1: ( ( rule__PropertyRule__ModifiersAssignment_5 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1062:1: ( rule__PropertyRule__ModifiersAssignment_5 )?
				{
					before(grammarAccess.getPropertyRuleAccess().getModifiersAssignment_5());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1063:1: ( rule__PropertyRule__ModifiersAssignment_5 )?
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if ((LA13_0 == 28)) {
						alt13 = 1;
					}
					switch (alt13) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1063:2: rule__PropertyRule__ModifiersAssignment_5
					{
						pushFollow(FOLLOW_rule__PropertyRule__ModifiersAssignment_5_in_rule__PropertyRule__Group__5__Impl2263);
						rule__PropertyRule__ModifiersAssignment_5();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPropertyRuleAccess().getModifiersAssignment_5());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__5__Impl"


	// $ANTLR start "rule__PropertyRule__Group__6"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1073:1: rule__PropertyRule__Group__6 : rule__PropertyRule__Group__6__Impl ;
	public final void rule__PropertyRule__Group__6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1077:1: ( rule__PropertyRule__Group__6__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1078:2: rule__PropertyRule__Group__6__Impl
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group__6__Impl_in_rule__PropertyRule__Group__62294);
				rule__PropertyRule__Group__6__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__6"


	// $ANTLR start "rule__PropertyRule__Group__6__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1084:1: rule__PropertyRule__Group__6__Impl : ( ( rule__PropertyRule__DefaultAssignment_6
	// )? ) ;
	public final void rule__PropertyRule__Group__6__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1088:1: ( ( ( rule__PropertyRule__DefaultAssignment_6 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1089:1: ( ( rule__PropertyRule__DefaultAssignment_6 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1089:1: ( ( rule__PropertyRule__DefaultAssignment_6 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1090:1: ( rule__PropertyRule__DefaultAssignment_6 )?
				{
					before(grammarAccess.getPropertyRuleAccess().getDefaultAssignment_6());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1091:1: ( rule__PropertyRule__DefaultAssignment_6 )?
					int alt14 = 2;
					int LA14_0 = input.LA(1);

					if ((LA14_0 == 33)) {
						alt14 = 1;
					}
					switch (alt14) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1091:2: rule__PropertyRule__DefaultAssignment_6
					{
						pushFollow(FOLLOW_rule__PropertyRule__DefaultAssignment_6_in_rule__PropertyRule__Group__6__Impl2321);
						rule__PropertyRule__DefaultAssignment_6();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPropertyRuleAccess().getDefaultAssignment_6());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group__6__Impl"


	// $ANTLR start "rule__PropertyRule__Group_3__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1115:1: rule__PropertyRule__Group_3__0 : rule__PropertyRule__Group_3__0__Impl
	// rule__PropertyRule__Group_3__1 ;
	public final void rule__PropertyRule__Group_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1119:1: ( rule__PropertyRule__Group_3__0__Impl rule__PropertyRule__Group_3__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1120:2: rule__PropertyRule__Group_3__0__Impl rule__PropertyRule__Group_3__1
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group_3__0__Impl_in_rule__PropertyRule__Group_3__02366);
				rule__PropertyRule__Group_3__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PropertyRule__Group_3__1_in_rule__PropertyRule__Group_3__02369);
				rule__PropertyRule__Group_3__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group_3__0"


	// $ANTLR start "rule__PropertyRule__Group_3__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1127:1: rule__PropertyRule__Group_3__0__Impl : ( ':' ) ;
	public final void rule__PropertyRule__Group_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1131:1: ( ( ':' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1132:1: ( ':' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1132:1: ( ':' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1133:1: ':'
				{
					before(grammarAccess.getPropertyRuleAccess().getColonKeyword_3_0());
					match(input, 23, FOLLOW_23_in_rule__PropertyRule__Group_3__0__Impl2397);
					after(grammarAccess.getPropertyRuleAccess().getColonKeyword_3_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group_3__0__Impl"


	// $ANTLR start "rule__PropertyRule__Group_3__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1146:1: rule__PropertyRule__Group_3__1 : rule__PropertyRule__Group_3__1__Impl ;
	public final void rule__PropertyRule__Group_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1150:1: ( rule__PropertyRule__Group_3__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1151:2: rule__PropertyRule__Group_3__1__Impl
			{
				pushFollow(FOLLOW_rule__PropertyRule__Group_3__1__Impl_in_rule__PropertyRule__Group_3__12428);
				rule__PropertyRule__Group_3__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group_3__1"


	// $ANTLR start "rule__PropertyRule__Group_3__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1157:1: rule__PropertyRule__Group_3__1__Impl : ( ( rule__PropertyRule__Alternatives_3_1 )
	// ) ;
	public final void rule__PropertyRule__Group_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1161:1: ( ( ( rule__PropertyRule__Alternatives_3_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1162:1: ( ( rule__PropertyRule__Alternatives_3_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1162:1: ( ( rule__PropertyRule__Alternatives_3_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1163:1: ( rule__PropertyRule__Alternatives_3_1 )
				{
					before(grammarAccess.getPropertyRuleAccess().getAlternatives_3_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1164:1: ( rule__PropertyRule__Alternatives_3_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1164:2: rule__PropertyRule__Alternatives_3_1
					{
						pushFollow(FOLLOW_rule__PropertyRule__Alternatives_3_1_in_rule__PropertyRule__Group_3__1__Impl2455);
						rule__PropertyRule__Alternatives_3_1();

						state._fsp--;


					}

					after(grammarAccess.getPropertyRuleAccess().getAlternatives_3_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__Group_3__1__Impl"


	// $ANTLR start "rule__TypeRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1178:1: rule__TypeRule__Group__0 : rule__TypeRule__Group__0__Impl
	// rule__TypeRule__Group__1 ;
	public final void rule__TypeRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1182:1: ( rule__TypeRule__Group__0__Impl rule__TypeRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1183:2: rule__TypeRule__Group__0__Impl rule__TypeRule__Group__1
			{
				pushFollow(FOLLOW_rule__TypeRule__Group__0__Impl_in_rule__TypeRule__Group__02489);
				rule__TypeRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__TypeRule__Group__1_in_rule__TypeRule__Group__02492);
				rule__TypeRule__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__TypeRule__Group__0"


	// $ANTLR start "rule__TypeRule__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1190:1: rule__TypeRule__Group__0__Impl : ( ( rule__TypeRule__PathAssignment_0 )? ) ;
	public final void rule__TypeRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1194:1: ( ( ( rule__TypeRule__PathAssignment_0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1195:1: ( ( rule__TypeRule__PathAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1195:1: ( ( rule__TypeRule__PathAssignment_0 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1196:1: ( rule__TypeRule__PathAssignment_0 )?
				{
					before(grammarAccess.getTypeRuleAccess().getPathAssignment_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1197:1: ( rule__TypeRule__PathAssignment_0 )?
					int alt15 = 2;
					int LA15_0 = input.LA(1);

					if ((LA15_0 == RULE_ID)) {
						int LA15_1 = input.LA(2);

						if ((LA15_1 == 24)) {
							alt15 = 1;
						}
					}
					switch (alt15) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1197:2: rule__TypeRule__PathAssignment_0
					{
						pushFollow(FOLLOW_rule__TypeRule__PathAssignment_0_in_rule__TypeRule__Group__0__Impl2519);
						rule__TypeRule__PathAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getTypeRuleAccess().getPathAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__TypeRule__Group__0__Impl"


	// $ANTLR start "rule__TypeRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1207:1: rule__TypeRule__Group__1 : rule__TypeRule__Group__1__Impl ;
	public final void rule__TypeRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1211:1: ( rule__TypeRule__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1212:2: rule__TypeRule__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__TypeRule__Group__1__Impl_in_rule__TypeRule__Group__12550);
				rule__TypeRule__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__TypeRule__Group__1"


	// $ANTLR start "rule__TypeRule__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1218:1: rule__TypeRule__Group__1__Impl : ( ( rule__TypeRule__TypeAssignment_1 ) ) ;
	public final void rule__TypeRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1222:1: ( ( ( rule__TypeRule__TypeAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1223:1: ( ( rule__TypeRule__TypeAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1223:1: ( ( rule__TypeRule__TypeAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1224:1: ( rule__TypeRule__TypeAssignment_1 )
				{
					before(grammarAccess.getTypeRuleAccess().getTypeAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1225:1: ( rule__TypeRule__TypeAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1225:2: rule__TypeRule__TypeAssignment_1
					{
						pushFollow(FOLLOW_rule__TypeRule__TypeAssignment_1_in_rule__TypeRule__Group__1__Impl2577);
						rule__TypeRule__TypeAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getTypeRuleAccess().getTypeAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__TypeRule__Group__1__Impl"


	// $ANTLR start "rule__QualifiedName__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1239:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl
	// rule__QualifiedName__Group__1 ;
	public final void rule__QualifiedName__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1243:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1244:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
			{
				pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02611);
				rule__QualifiedName__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02614);
				rule__QualifiedName__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__QualifiedName__Group__0"


	// $ANTLR start "rule__QualifiedName__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1251:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__PathAssignment_0 )
	// ) ;
	public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1255:1: ( ( ( rule__QualifiedName__PathAssignment_0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1256:1: ( ( rule__QualifiedName__PathAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1256:1: ( ( rule__QualifiedName__PathAssignment_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1257:1: ( rule__QualifiedName__PathAssignment_0 )
				{
					before(grammarAccess.getQualifiedNameAccess().getPathAssignment_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1258:1: ( rule__QualifiedName__PathAssignment_0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1258:2: rule__QualifiedName__PathAssignment_0
					{
						pushFollow(FOLLOW_rule__QualifiedName__PathAssignment_0_in_rule__QualifiedName__Group__0__Impl2641);
						rule__QualifiedName__PathAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getQualifiedNameAccess().getPathAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__QualifiedName__Group__0__Impl"


	// $ANTLR start "rule__QualifiedName__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1268:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl
	// rule__QualifiedName__Group__2 ;
	public final void rule__QualifiedName__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1272:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1273:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
			{
				pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12671);
				rule__QualifiedName__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__12674);
				rule__QualifiedName__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__QualifiedName__Group__1"


	// $ANTLR start "rule__QualifiedName__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1280:1: rule__QualifiedName__Group__1__Impl : ( '::' ) ;
	public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1284:1: ( ( '::' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1285:1: ( '::' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1285:1: ( '::' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1286:1: '::'
				{
					before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1());
					match(input, 24, FOLLOW_24_in_rule__QualifiedName__Group__1__Impl2702);
					after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__QualifiedName__Group__1__Impl"


	// $ANTLR start "rule__QualifiedName__Group__2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1299:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
	public final void rule__QualifiedName__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1303:1: ( rule__QualifiedName__Group__2__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1304:2: rule__QualifiedName__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__22733);
				rule__QualifiedName__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__QualifiedName__Group__2"


	// $ANTLR start "rule__QualifiedName__Group__2__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1310:1: rule__QualifiedName__Group__2__Impl : ( (
	// rule__QualifiedName__RemainingAssignment_2 )? ) ;
	public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1314:1: ( ( ( rule__QualifiedName__RemainingAssignment_2 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1315:1: ( ( rule__QualifiedName__RemainingAssignment_2 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1315:1: ( ( rule__QualifiedName__RemainingAssignment_2 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1316:1: ( rule__QualifiedName__RemainingAssignment_2 )?
				{
					before(grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1317:1: ( rule__QualifiedName__RemainingAssignment_2 )?
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if ((LA16_0 == RULE_ID)) {
						int LA16_1 = input.LA(2);

						if ((LA16_1 == 24)) {
							alt16 = 1;
						}
					}
					switch (alt16) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1317:2: rule__QualifiedName__RemainingAssignment_2
					{
						pushFollow(FOLLOW_rule__QualifiedName__RemainingAssignment_2_in_rule__QualifiedName__Group__2__Impl2760);
						rule__QualifiedName__RemainingAssignment_2();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__QualifiedName__Group__2__Impl"


	// $ANTLR start "rule__MultiplicityRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1333:1: rule__MultiplicityRule__Group__0 : rule__MultiplicityRule__Group__0__Impl
	// rule__MultiplicityRule__Group__1 ;
	public final void rule__MultiplicityRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1337:1: ( rule__MultiplicityRule__Group__0__Impl rule__MultiplicityRule__Group__1
			// )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1338:2: rule__MultiplicityRule__Group__0__Impl rule__MultiplicityRule__Group__1
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group__0__Impl_in_rule__MultiplicityRule__Group__02797);
				rule__MultiplicityRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__MultiplicityRule__Group__1_in_rule__MultiplicityRule__Group__02800);
				rule__MultiplicityRule__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group__0"


	// $ANTLR start "rule__MultiplicityRule__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1345:1: rule__MultiplicityRule__Group__0__Impl : ( '[' ) ;
	public final void rule__MultiplicityRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1349:1: ( ( '[' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1350:1: ( '[' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1350:1: ( '[' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1351:1: '['
				{
					before(grammarAccess.getMultiplicityRuleAccess().getLeftSquareBracketKeyword_0());
					match(input, 25, FOLLOW_25_in_rule__MultiplicityRule__Group__0__Impl2828);
					after(grammarAccess.getMultiplicityRuleAccess().getLeftSquareBracketKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group__0__Impl"


	// $ANTLR start "rule__MultiplicityRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1364:1: rule__MultiplicityRule__Group__1 : rule__MultiplicityRule__Group__1__Impl
	// rule__MultiplicityRule__Group__2 ;
	public final void rule__MultiplicityRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1368:1: ( rule__MultiplicityRule__Group__1__Impl rule__MultiplicityRule__Group__2
			// )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1369:2: rule__MultiplicityRule__Group__1__Impl rule__MultiplicityRule__Group__2
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group__1__Impl_in_rule__MultiplicityRule__Group__12859);
				rule__MultiplicityRule__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__MultiplicityRule__Group__2_in_rule__MultiplicityRule__Group__12862);
				rule__MultiplicityRule__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group__1"


	// $ANTLR start "rule__MultiplicityRule__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1376:1: rule__MultiplicityRule__Group__1__Impl : ( (
	// rule__MultiplicityRule__BoundsAssignment_1 ) ) ;
	public final void rule__MultiplicityRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1380:1: ( ( ( rule__MultiplicityRule__BoundsAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1381:1: ( ( rule__MultiplicityRule__BoundsAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1381:1: ( ( rule__MultiplicityRule__BoundsAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1382:1: ( rule__MultiplicityRule__BoundsAssignment_1 )
				{
					before(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1383:1: ( rule__MultiplicityRule__BoundsAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1383:2: rule__MultiplicityRule__BoundsAssignment_1
					{
						pushFollow(FOLLOW_rule__MultiplicityRule__BoundsAssignment_1_in_rule__MultiplicityRule__Group__1__Impl2889);
						rule__MultiplicityRule__BoundsAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group__1__Impl"


	// $ANTLR start "rule__MultiplicityRule__Group__2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1393:1: rule__MultiplicityRule__Group__2 : rule__MultiplicityRule__Group__2__Impl
	// rule__MultiplicityRule__Group__3 ;
	public final void rule__MultiplicityRule__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1397:1: ( rule__MultiplicityRule__Group__2__Impl rule__MultiplicityRule__Group__3
			// )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1398:2: rule__MultiplicityRule__Group__2__Impl rule__MultiplicityRule__Group__3
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group__2__Impl_in_rule__MultiplicityRule__Group__22919);
				rule__MultiplicityRule__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__MultiplicityRule__Group__3_in_rule__MultiplicityRule__Group__22922);
				rule__MultiplicityRule__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group__2"


	// $ANTLR start "rule__MultiplicityRule__Group__2__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1405:1: rule__MultiplicityRule__Group__2__Impl : ( ( rule__MultiplicityRule__Group_2__0
	// )? ) ;
	public final void rule__MultiplicityRule__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1409:1: ( ( ( rule__MultiplicityRule__Group_2__0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1410:1: ( ( rule__MultiplicityRule__Group_2__0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1410:1: ( ( rule__MultiplicityRule__Group_2__0 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1411:1: ( rule__MultiplicityRule__Group_2__0 )?
				{
					before(grammarAccess.getMultiplicityRuleAccess().getGroup_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1412:1: ( rule__MultiplicityRule__Group_2__0 )?
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if ((LA17_0 == 27)) {
						alt17 = 1;
					}
					switch (alt17) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1412:2: rule__MultiplicityRule__Group_2__0
					{
						pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__0_in_rule__MultiplicityRule__Group__2__Impl2949);
						rule__MultiplicityRule__Group_2__0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getMultiplicityRuleAccess().getGroup_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group__2__Impl"


	// $ANTLR start "rule__MultiplicityRule__Group__3"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1422:1: rule__MultiplicityRule__Group__3 : rule__MultiplicityRule__Group__3__Impl ;
	public final void rule__MultiplicityRule__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1426:1: ( rule__MultiplicityRule__Group__3__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1427:2: rule__MultiplicityRule__Group__3__Impl
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group__3__Impl_in_rule__MultiplicityRule__Group__32980);
				rule__MultiplicityRule__Group__3__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group__3"


	// $ANTLR start "rule__MultiplicityRule__Group__3__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1433:1: rule__MultiplicityRule__Group__3__Impl : ( ']' ) ;
	public final void rule__MultiplicityRule__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1437:1: ( ( ']' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1438:1: ( ']' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1438:1: ( ']' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1439:1: ']'
				{
					before(grammarAccess.getMultiplicityRuleAccess().getRightSquareBracketKeyword_3());
					match(input, 26, FOLLOW_26_in_rule__MultiplicityRule__Group__3__Impl3008);
					after(grammarAccess.getMultiplicityRuleAccess().getRightSquareBracketKeyword_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group__3__Impl"


	// $ANTLR start "rule__MultiplicityRule__Group_2__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1460:1: rule__MultiplicityRule__Group_2__0 : rule__MultiplicityRule__Group_2__0__Impl
	// rule__MultiplicityRule__Group_2__1 ;
	public final void rule__MultiplicityRule__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1464:1: ( rule__MultiplicityRule__Group_2__0__Impl
			// rule__MultiplicityRule__Group_2__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1465:2: rule__MultiplicityRule__Group_2__0__Impl
			// rule__MultiplicityRule__Group_2__1
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__0__Impl_in_rule__MultiplicityRule__Group_2__03047);
				rule__MultiplicityRule__Group_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__1_in_rule__MultiplicityRule__Group_2__03050);
				rule__MultiplicityRule__Group_2__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group_2__0"


	// $ANTLR start "rule__MultiplicityRule__Group_2__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1472:1: rule__MultiplicityRule__Group_2__0__Impl : ( '..' ) ;
	public final void rule__MultiplicityRule__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1476:1: ( ( '..' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1477:1: ( '..' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1477:1: ( '..' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1478:1: '..'
				{
					before(grammarAccess.getMultiplicityRuleAccess().getFullStopFullStopKeyword_2_0());
					match(input, 27, FOLLOW_27_in_rule__MultiplicityRule__Group_2__0__Impl3078);
					after(grammarAccess.getMultiplicityRuleAccess().getFullStopFullStopKeyword_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group_2__0__Impl"


	// $ANTLR start "rule__MultiplicityRule__Group_2__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1491:1: rule__MultiplicityRule__Group_2__1 : rule__MultiplicityRule__Group_2__1__Impl ;
	public final void rule__MultiplicityRule__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1495:1: ( rule__MultiplicityRule__Group_2__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1496:2: rule__MultiplicityRule__Group_2__1__Impl
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__1__Impl_in_rule__MultiplicityRule__Group_2__13109);
				rule__MultiplicityRule__Group_2__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group_2__1"


	// $ANTLR start "rule__MultiplicityRule__Group_2__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1502:1: rule__MultiplicityRule__Group_2__1__Impl : ( (
	// rule__MultiplicityRule__BoundsAssignment_2_1 ) ) ;
	public final void rule__MultiplicityRule__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1506:1: ( ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1507:1: ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1507:1: ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1508:1: ( rule__MultiplicityRule__BoundsAssignment_2_1 )
				{
					before(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_2_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1509:1: ( rule__MultiplicityRule__BoundsAssignment_2_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1509:2: rule__MultiplicityRule__BoundsAssignment_2_1
					{
						pushFollow(FOLLOW_rule__MultiplicityRule__BoundsAssignment_2_1_in_rule__MultiplicityRule__Group_2__1__Impl3136);
						rule__MultiplicityRule__BoundsAssignment_2_1();

						state._fsp--;


					}

					after(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_2_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__Group_2__1__Impl"


	// $ANTLR start "rule__ModifiersRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1523:1: rule__ModifiersRule__Group__0 : rule__ModifiersRule__Group__0__Impl
	// rule__ModifiersRule__Group__1 ;
	public final void rule__ModifiersRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1527:1: ( rule__ModifiersRule__Group__0__Impl rule__ModifiersRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1528:2: rule__ModifiersRule__Group__0__Impl rule__ModifiersRule__Group__1
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group__0__Impl_in_rule__ModifiersRule__Group__03170);
				rule__ModifiersRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group__1_in_rule__ModifiersRule__Group__03173);
				rule__ModifiersRule__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group__0"


	// $ANTLR start "rule__ModifiersRule__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1535:1: rule__ModifiersRule__Group__0__Impl : ( () ) ;
	public final void rule__ModifiersRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1539:1: ( ( () ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1540:1: ( () )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1540:1: ( () )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1541:1: ()
				{
					before(grammarAccess.getModifiersRuleAccess().getModifiersRuleAction_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1542:1: ()
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1544:1:
					{
					}

					after(grammarAccess.getModifiersRuleAccess().getModifiersRuleAction_0());

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group__0__Impl"


	// $ANTLR start "rule__ModifiersRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1554:1: rule__ModifiersRule__Group__1 : rule__ModifiersRule__Group__1__Impl
	// rule__ModifiersRule__Group__2 ;
	public final void rule__ModifiersRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1558:1: ( rule__ModifiersRule__Group__1__Impl rule__ModifiersRule__Group__2 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1559:2: rule__ModifiersRule__Group__1__Impl rule__ModifiersRule__Group__2
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group__1__Impl_in_rule__ModifiersRule__Group__13231);
				rule__ModifiersRule__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group__2_in_rule__ModifiersRule__Group__13234);
				rule__ModifiersRule__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group__1"


	// $ANTLR start "rule__ModifiersRule__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1566:1: rule__ModifiersRule__Group__1__Impl : ( '{' ) ;
	public final void rule__ModifiersRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1570:1: ( ( '{' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1571:1: ( '{' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1571:1: ( '{' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1572:1: '{'
				{
					before(grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_1());
					match(input, 28, FOLLOW_28_in_rule__ModifiersRule__Group__1__Impl3262);
					after(grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group__1__Impl"


	// $ANTLR start "rule__ModifiersRule__Group__2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1585:1: rule__ModifiersRule__Group__2 : rule__ModifiersRule__Group__2__Impl
	// rule__ModifiersRule__Group__3 ;
	public final void rule__ModifiersRule__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1589:1: ( rule__ModifiersRule__Group__2__Impl rule__ModifiersRule__Group__3 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1590:2: rule__ModifiersRule__Group__2__Impl rule__ModifiersRule__Group__3
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group__2__Impl_in_rule__ModifiersRule__Group__23293);
				rule__ModifiersRule__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group__3_in_rule__ModifiersRule__Group__23296);
				rule__ModifiersRule__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group__2"


	// $ANTLR start "rule__ModifiersRule__Group__2__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1597:1: rule__ModifiersRule__Group__2__Impl : ( ( rule__ModifiersRule__Group_2__0 )? ) ;
	public final void rule__ModifiersRule__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1601:1: ( ( ( rule__ModifiersRule__Group_2__0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1602:1: ( ( rule__ModifiersRule__Group_2__0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1602:1: ( ( rule__ModifiersRule__Group_2__0 )? )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1603:1: ( rule__ModifiersRule__Group_2__0 )?
				{
					before(grammarAccess.getModifiersRuleAccess().getGroup_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1604:1: ( rule__ModifiersRule__Group_2__0 )?
					int alt18 = 2;
					int LA18_0 = input.LA(1);

					if (((LA18_0 >= 17 && LA18_0 <= 20) || (LA18_0 >= 31 && LA18_0 <= 32))) {
						alt18 = 1;
					}
					switch (alt18) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1604:2: rule__ModifiersRule__Group_2__0
					{
						pushFollow(FOLLOW_rule__ModifiersRule__Group_2__0_in_rule__ModifiersRule__Group__2__Impl3323);
						rule__ModifiersRule__Group_2__0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getModifiersRuleAccess().getGroup_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group__2__Impl"


	// $ANTLR start "rule__ModifiersRule__Group__3"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1614:1: rule__ModifiersRule__Group__3 : rule__ModifiersRule__Group__3__Impl ;
	public final void rule__ModifiersRule__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1618:1: ( rule__ModifiersRule__Group__3__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1619:2: rule__ModifiersRule__Group__3__Impl
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group__3__Impl_in_rule__ModifiersRule__Group__33354);
				rule__ModifiersRule__Group__3__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group__3"


	// $ANTLR start "rule__ModifiersRule__Group__3__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1625:1: rule__ModifiersRule__Group__3__Impl : ( '}' ) ;
	public final void rule__ModifiersRule__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1629:1: ( ( '}' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1630:1: ( '}' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1630:1: ( '}' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1631:1: '}'
				{
					before(grammarAccess.getModifiersRuleAccess().getRightCurlyBracketKeyword_3());
					match(input, 29, FOLLOW_29_in_rule__ModifiersRule__Group__3__Impl3382);
					after(grammarAccess.getModifiersRuleAccess().getRightCurlyBracketKeyword_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group__3__Impl"


	// $ANTLR start "rule__ModifiersRule__Group_2__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1652:1: rule__ModifiersRule__Group_2__0 : rule__ModifiersRule__Group_2__0__Impl
	// rule__ModifiersRule__Group_2__1 ;
	public final void rule__ModifiersRule__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1656:1: ( rule__ModifiersRule__Group_2__0__Impl rule__ModifiersRule__Group_2__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1657:2: rule__ModifiersRule__Group_2__0__Impl rule__ModifiersRule__Group_2__1
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group_2__0__Impl_in_rule__ModifiersRule__Group_2__03421);
				rule__ModifiersRule__Group_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group_2__1_in_rule__ModifiersRule__Group_2__03424);
				rule__ModifiersRule__Group_2__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group_2__0"


	// $ANTLR start "rule__ModifiersRule__Group_2__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1664:1: rule__ModifiersRule__Group_2__0__Impl : ( (
	// rule__ModifiersRule__ValuesAssignment_2_0 ) ) ;
	public final void rule__ModifiersRule__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1668:1: ( ( ( rule__ModifiersRule__ValuesAssignment_2_0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1669:1: ( ( rule__ModifiersRule__ValuesAssignment_2_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1669:1: ( ( rule__ModifiersRule__ValuesAssignment_2_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1670:1: ( rule__ModifiersRule__ValuesAssignment_2_0 )
				{
					before(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1671:1: ( rule__ModifiersRule__ValuesAssignment_2_0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1671:2: rule__ModifiersRule__ValuesAssignment_2_0
					{
						pushFollow(FOLLOW_rule__ModifiersRule__ValuesAssignment_2_0_in_rule__ModifiersRule__Group_2__0__Impl3451);
						rule__ModifiersRule__ValuesAssignment_2_0();

						state._fsp--;


					}

					after(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group_2__0__Impl"


	// $ANTLR start "rule__ModifiersRule__Group_2__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1681:1: rule__ModifiersRule__Group_2__1 : rule__ModifiersRule__Group_2__1__Impl ;
	public final void rule__ModifiersRule__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1685:1: ( rule__ModifiersRule__Group_2__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1686:2: rule__ModifiersRule__Group_2__1__Impl
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group_2__1__Impl_in_rule__ModifiersRule__Group_2__13481);
				rule__ModifiersRule__Group_2__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group_2__1"


	// $ANTLR start "rule__ModifiersRule__Group_2__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1692:1: rule__ModifiersRule__Group_2__1__Impl : ( ( rule__ModifiersRule__Group_2_1__0 )*
	// ) ;
	public final void rule__ModifiersRule__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1696:1: ( ( ( rule__ModifiersRule__Group_2_1__0 )* ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1697:1: ( ( rule__ModifiersRule__Group_2_1__0 )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1697:1: ( ( rule__ModifiersRule__Group_2_1__0 )* )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1698:1: ( rule__ModifiersRule__Group_2_1__0 )*
				{
					before(grammarAccess.getModifiersRuleAccess().getGroup_2_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1699:1: ( rule__ModifiersRule__Group_2_1__0 )*
					loop19: do {
						int alt19 = 2;
						int LA19_0 = input.LA(1);

						if ((LA19_0 == 30)) {
							alt19 = 1;
						}


						switch (alt19) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1699:2: rule__ModifiersRule__Group_2_1__0
						{
							pushFollow(FOLLOW_rule__ModifiersRule__Group_2_1__0_in_rule__ModifiersRule__Group_2__1__Impl3508);
							rule__ModifiersRule__Group_2_1__0();

							state._fsp--;


						}
							break;

						default:
							break loop19;
						}
					} while (true);

					after(grammarAccess.getModifiersRuleAccess().getGroup_2_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group_2__1__Impl"


	// $ANTLR start "rule__ModifiersRule__Group_2_1__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1713:1: rule__ModifiersRule__Group_2_1__0 : rule__ModifiersRule__Group_2_1__0__Impl
	// rule__ModifiersRule__Group_2_1__1 ;
	public final void rule__ModifiersRule__Group_2_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1717:1: ( rule__ModifiersRule__Group_2_1__0__Impl
			// rule__ModifiersRule__Group_2_1__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1718:2: rule__ModifiersRule__Group_2_1__0__Impl rule__ModifiersRule__Group_2_1__1
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group_2_1__0__Impl_in_rule__ModifiersRule__Group_2_1__03543);
				rule__ModifiersRule__Group_2_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group_2_1__1_in_rule__ModifiersRule__Group_2_1__03546);
				rule__ModifiersRule__Group_2_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group_2_1__0"


	// $ANTLR start "rule__ModifiersRule__Group_2_1__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1725:1: rule__ModifiersRule__Group_2_1__0__Impl : ( ',' ) ;
	public final void rule__ModifiersRule__Group_2_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1729:1: ( ( ',' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1730:1: ( ',' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1730:1: ( ',' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1731:1: ','
				{
					before(grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_1_0());
					match(input, 30, FOLLOW_30_in_rule__ModifiersRule__Group_2_1__0__Impl3574);
					after(grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group_2_1__0__Impl"


	// $ANTLR start "rule__ModifiersRule__Group_2_1__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1744:1: rule__ModifiersRule__Group_2_1__1 : rule__ModifiersRule__Group_2_1__1__Impl ;
	public final void rule__ModifiersRule__Group_2_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1748:1: ( rule__ModifiersRule__Group_2_1__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1749:2: rule__ModifiersRule__Group_2_1__1__Impl
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group_2_1__1__Impl_in_rule__ModifiersRule__Group_2_1__13605);
				rule__ModifiersRule__Group_2_1__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group_2_1__1"


	// $ANTLR start "rule__ModifiersRule__Group_2_1__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1755:1: rule__ModifiersRule__Group_2_1__1__Impl : ( (
	// rule__ModifiersRule__ValuesAssignment_2_1_1 ) ) ;
	public final void rule__ModifiersRule__Group_2_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1759:1: ( ( ( rule__ModifiersRule__ValuesAssignment_2_1_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1760:1: ( ( rule__ModifiersRule__ValuesAssignment_2_1_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1760:1: ( ( rule__ModifiersRule__ValuesAssignment_2_1_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1761:1: ( rule__ModifiersRule__ValuesAssignment_2_1_1 )
				{
					before(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_1_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1762:1: ( rule__ModifiersRule__ValuesAssignment_2_1_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1762:2: rule__ModifiersRule__ValuesAssignment_2_1_1
					{
						pushFollow(FOLLOW_rule__ModifiersRule__ValuesAssignment_2_1_1_in_rule__ModifiersRule__Group_2_1__1__Impl3632);
						rule__ModifiersRule__ValuesAssignment_2_1_1();

						state._fsp--;


					}

					after(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__Group_2_1__1__Impl"


	// $ANTLR start "rule__RedefinesRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1776:1: rule__RedefinesRule__Group__0 : rule__RedefinesRule__Group__0__Impl
	// rule__RedefinesRule__Group__1 ;
	public final void rule__RedefinesRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1780:1: ( rule__RedefinesRule__Group__0__Impl rule__RedefinesRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1781:2: rule__RedefinesRule__Group__0__Impl rule__RedefinesRule__Group__1
			{
				pushFollow(FOLLOW_rule__RedefinesRule__Group__0__Impl_in_rule__RedefinesRule__Group__03666);
				rule__RedefinesRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RedefinesRule__Group__1_in_rule__RedefinesRule__Group__03669);
				rule__RedefinesRule__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RedefinesRule__Group__0"


	// $ANTLR start "rule__RedefinesRule__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1788:1: rule__RedefinesRule__Group__0__Impl : ( 'redefines' ) ;
	public final void rule__RedefinesRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1792:1: ( ( 'redefines' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1793:1: ( 'redefines' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1793:1: ( 'redefines' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1794:1: 'redefines'
				{
					before(grammarAccess.getRedefinesRuleAccess().getRedefinesKeyword_0());
					match(input, 31, FOLLOW_31_in_rule__RedefinesRule__Group__0__Impl3697);
					after(grammarAccess.getRedefinesRuleAccess().getRedefinesKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RedefinesRule__Group__0__Impl"


	// $ANTLR start "rule__RedefinesRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1807:1: rule__RedefinesRule__Group__1 : rule__RedefinesRule__Group__1__Impl ;
	public final void rule__RedefinesRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1811:1: ( rule__RedefinesRule__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1812:2: rule__RedefinesRule__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__RedefinesRule__Group__1__Impl_in_rule__RedefinesRule__Group__13728);
				rule__RedefinesRule__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RedefinesRule__Group__1"


	// $ANTLR start "rule__RedefinesRule__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1818:1: rule__RedefinesRule__Group__1__Impl : ( (
	// rule__RedefinesRule__PropertyAssignment_1 ) ) ;
	public final void rule__RedefinesRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1822:1: ( ( ( rule__RedefinesRule__PropertyAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1823:1: ( ( rule__RedefinesRule__PropertyAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1823:1: ( ( rule__RedefinesRule__PropertyAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1824:1: ( rule__RedefinesRule__PropertyAssignment_1 )
				{
					before(grammarAccess.getRedefinesRuleAccess().getPropertyAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1825:1: ( rule__RedefinesRule__PropertyAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1825:2: rule__RedefinesRule__PropertyAssignment_1
					{
						pushFollow(FOLLOW_rule__RedefinesRule__PropertyAssignment_1_in_rule__RedefinesRule__Group__1__Impl3755);
						rule__RedefinesRule__PropertyAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getRedefinesRuleAccess().getPropertyAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RedefinesRule__Group__1__Impl"


	// $ANTLR start "rule__SubsetsRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1839:1: rule__SubsetsRule__Group__0 : rule__SubsetsRule__Group__0__Impl
	// rule__SubsetsRule__Group__1 ;
	public final void rule__SubsetsRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1843:1: ( rule__SubsetsRule__Group__0__Impl rule__SubsetsRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1844:2: rule__SubsetsRule__Group__0__Impl rule__SubsetsRule__Group__1
			{
				pushFollow(FOLLOW_rule__SubsetsRule__Group__0__Impl_in_rule__SubsetsRule__Group__03789);
				rule__SubsetsRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__SubsetsRule__Group__1_in_rule__SubsetsRule__Group__03792);
				rule__SubsetsRule__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SubsetsRule__Group__0"


	// $ANTLR start "rule__SubsetsRule__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1851:1: rule__SubsetsRule__Group__0__Impl : ( 'subsets' ) ;
	public final void rule__SubsetsRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1855:1: ( ( 'subsets' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1856:1: ( 'subsets' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1856:1: ( 'subsets' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1857:1: 'subsets'
				{
					before(grammarAccess.getSubsetsRuleAccess().getSubsetsKeyword_0());
					match(input, 32, FOLLOW_32_in_rule__SubsetsRule__Group__0__Impl3820);
					after(grammarAccess.getSubsetsRuleAccess().getSubsetsKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SubsetsRule__Group__0__Impl"


	// $ANTLR start "rule__SubsetsRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1870:1: rule__SubsetsRule__Group__1 : rule__SubsetsRule__Group__1__Impl ;
	public final void rule__SubsetsRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1874:1: ( rule__SubsetsRule__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1875:2: rule__SubsetsRule__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__SubsetsRule__Group__1__Impl_in_rule__SubsetsRule__Group__13851);
				rule__SubsetsRule__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SubsetsRule__Group__1"


	// $ANTLR start "rule__SubsetsRule__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1881:1: rule__SubsetsRule__Group__1__Impl : ( ( rule__SubsetsRule__PropertyAssignment_1 )
	// ) ;
	public final void rule__SubsetsRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1885:1: ( ( ( rule__SubsetsRule__PropertyAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1886:1: ( ( rule__SubsetsRule__PropertyAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1886:1: ( ( rule__SubsetsRule__PropertyAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1887:1: ( rule__SubsetsRule__PropertyAssignment_1 )
				{
					before(grammarAccess.getSubsetsRuleAccess().getPropertyAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1888:1: ( rule__SubsetsRule__PropertyAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1888:2: rule__SubsetsRule__PropertyAssignment_1
					{
						pushFollow(FOLLOW_rule__SubsetsRule__PropertyAssignment_1_in_rule__SubsetsRule__Group__1__Impl3878);
						rule__SubsetsRule__PropertyAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getSubsetsRuleAccess().getPropertyAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SubsetsRule__Group__1__Impl"


	// $ANTLR start "rule__DefaultValueRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1902:1: rule__DefaultValueRule__Group__0 : rule__DefaultValueRule__Group__0__Impl
	// rule__DefaultValueRule__Group__1 ;
	public final void rule__DefaultValueRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1906:1: ( rule__DefaultValueRule__Group__0__Impl rule__DefaultValueRule__Group__1
			// )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1907:2: rule__DefaultValueRule__Group__0__Impl rule__DefaultValueRule__Group__1
			{
				pushFollow(FOLLOW_rule__DefaultValueRule__Group__0__Impl_in_rule__DefaultValueRule__Group__03912);
				rule__DefaultValueRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__DefaultValueRule__Group__1_in_rule__DefaultValueRule__Group__03915);
				rule__DefaultValueRule__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__DefaultValueRule__Group__0"


	// $ANTLR start "rule__DefaultValueRule__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1914:1: rule__DefaultValueRule__Group__0__Impl : ( '=' ) ;
	public final void rule__DefaultValueRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1918:1: ( ( '=' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1919:1: ( '=' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1919:1: ( '=' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1920:1: '='
				{
					before(grammarAccess.getDefaultValueRuleAccess().getEqualsSignKeyword_0());
					match(input, 33, FOLLOW_33_in_rule__DefaultValueRule__Group__0__Impl3943);
					after(grammarAccess.getDefaultValueRuleAccess().getEqualsSignKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__DefaultValueRule__Group__0__Impl"


	// $ANTLR start "rule__DefaultValueRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1933:1: rule__DefaultValueRule__Group__1 : rule__DefaultValueRule__Group__1__Impl ;
	public final void rule__DefaultValueRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1937:1: ( rule__DefaultValueRule__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1938:2: rule__DefaultValueRule__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__DefaultValueRule__Group__1__Impl_in_rule__DefaultValueRule__Group__13974);
				rule__DefaultValueRule__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__DefaultValueRule__Group__1"


	// $ANTLR start "rule__DefaultValueRule__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1944:1: rule__DefaultValueRule__Group__1__Impl : ( (
	// rule__DefaultValueRule__DefaultAssignment_1 ) ) ;
	public final void rule__DefaultValueRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1948:1: ( ( ( rule__DefaultValueRule__DefaultAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1949:1: ( ( rule__DefaultValueRule__DefaultAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1949:1: ( ( rule__DefaultValueRule__DefaultAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1950:1: ( rule__DefaultValueRule__DefaultAssignment_1 )
				{
					before(grammarAccess.getDefaultValueRuleAccess().getDefaultAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1951:1: ( rule__DefaultValueRule__DefaultAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1951:2: rule__DefaultValueRule__DefaultAssignment_1
					{
						pushFollow(FOLLOW_rule__DefaultValueRule__DefaultAssignment_1_in_rule__DefaultValueRule__Group__1__Impl4001);
						rule__DefaultValueRule__DefaultAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getDefaultValueRuleAccess().getDefaultAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__DefaultValueRule__Group__1__Impl"


	// $ANTLR start "rule__RealValue__Group_0__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1965:1: rule__RealValue__Group_0__0 : rule__RealValue__Group_0__0__Impl
	// rule__RealValue__Group_0__1 ;
	public final void rule__RealValue__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1969:1: ( rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1970:2: rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1
			{
				pushFollow(FOLLOW_rule__RealValue__Group_0__0__Impl_in_rule__RealValue__Group_0__04035);
				rule__RealValue__Group_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RealValue__Group_0__1_in_rule__RealValue__Group_0__04038);
				rule__RealValue__Group_0__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_0__0"


	// $ANTLR start "rule__RealValue__Group_0__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1977:1: rule__RealValue__Group_0__0__Impl : ( ( rule__RealValue__IntegerAssignment_0_0 )
	// ) ;
	public final void rule__RealValue__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1981:1: ( ( ( rule__RealValue__IntegerAssignment_0_0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1982:1: ( ( rule__RealValue__IntegerAssignment_0_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1982:1: ( ( rule__RealValue__IntegerAssignment_0_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1983:1: ( rule__RealValue__IntegerAssignment_0_0 )
				{
					before(grammarAccess.getRealValueAccess().getIntegerAssignment_0_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1984:1: ( rule__RealValue__IntegerAssignment_0_0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1984:2: rule__RealValue__IntegerAssignment_0_0
					{
						pushFollow(FOLLOW_rule__RealValue__IntegerAssignment_0_0_in_rule__RealValue__Group_0__0__Impl4065);
						rule__RealValue__IntegerAssignment_0_0();

						state._fsp--;


					}

					after(grammarAccess.getRealValueAccess().getIntegerAssignment_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_0__0__Impl"


	// $ANTLR start "rule__RealValue__Group_0__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1994:1: rule__RealValue__Group_0__1 : rule__RealValue__Group_0__1__Impl ;
	public final void rule__RealValue__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1998:1: ( rule__RealValue__Group_0__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:1999:2: rule__RealValue__Group_0__1__Impl
			{
				pushFollow(FOLLOW_rule__RealValue__Group_0__1__Impl_in_rule__RealValue__Group_0__14095);
				rule__RealValue__Group_0__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_0__1"


	// $ANTLR start "rule__RealValue__Group_0__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2005:1: rule__RealValue__Group_0__1__Impl : ( '.' ) ;
	public final void rule__RealValue__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2009:1: ( ( '.' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2010:1: ( '.' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2010:1: ( '.' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2011:1: '.'
				{
					before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
					match(input, 34, FOLLOW_34_in_rule__RealValue__Group_0__1__Impl4123);
					after(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_0__1__Impl"


	// $ANTLR start "rule__RealValue__Group_1__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2028:1: rule__RealValue__Group_1__0 : rule__RealValue__Group_1__0__Impl
	// rule__RealValue__Group_1__1 ;
	public final void rule__RealValue__Group_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2032:1: ( rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2033:2: rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1
			{
				pushFollow(FOLLOW_rule__RealValue__Group_1__0__Impl_in_rule__RealValue__Group_1__04158);
				rule__RealValue__Group_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RealValue__Group_1__1_in_rule__RealValue__Group_1__04161);
				rule__RealValue__Group_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_1__0"


	// $ANTLR start "rule__RealValue__Group_1__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2040:1: rule__RealValue__Group_1__0__Impl : ( '.' ) ;
	public final void rule__RealValue__Group_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2044:1: ( ( '.' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2045:1: ( '.' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2045:1: ( '.' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2046:1: '.'
				{
					before(grammarAccess.getRealValueAccess().getFullStopKeyword_1_0());
					match(input, 34, FOLLOW_34_in_rule__RealValue__Group_1__0__Impl4189);
					after(grammarAccess.getRealValueAccess().getFullStopKeyword_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_1__0__Impl"


	// $ANTLR start "rule__RealValue__Group_1__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2059:1: rule__RealValue__Group_1__1 : rule__RealValue__Group_1__1__Impl ;
	public final void rule__RealValue__Group_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2063:1: ( rule__RealValue__Group_1__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2064:2: rule__RealValue__Group_1__1__Impl
			{
				pushFollow(FOLLOW_rule__RealValue__Group_1__1__Impl_in_rule__RealValue__Group_1__14220);
				rule__RealValue__Group_1__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_1__1"


	// $ANTLR start "rule__RealValue__Group_1__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2070:1: rule__RealValue__Group_1__1__Impl : ( ( rule__RealValue__FractionAssignment_1_1 )
	// ) ;
	public final void rule__RealValue__Group_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2074:1: ( ( ( rule__RealValue__FractionAssignment_1_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2075:1: ( ( rule__RealValue__FractionAssignment_1_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2075:1: ( ( rule__RealValue__FractionAssignment_1_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2076:1: ( rule__RealValue__FractionAssignment_1_1 )
				{
					before(grammarAccess.getRealValueAccess().getFractionAssignment_1_1());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2077:1: ( rule__RealValue__FractionAssignment_1_1 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2077:2: rule__RealValue__FractionAssignment_1_1
					{
						pushFollow(FOLLOW_rule__RealValue__FractionAssignment_1_1_in_rule__RealValue__Group_1__1__Impl4247);
						rule__RealValue__FractionAssignment_1_1();

						state._fsp--;


					}

					after(grammarAccess.getRealValueAccess().getFractionAssignment_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_1__1__Impl"


	// $ANTLR start "rule__RealValue__Group_2__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2091:1: rule__RealValue__Group_2__0 : rule__RealValue__Group_2__0__Impl
	// rule__RealValue__Group_2__1 ;
	public final void rule__RealValue__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2095:1: ( rule__RealValue__Group_2__0__Impl rule__RealValue__Group_2__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2096:2: rule__RealValue__Group_2__0__Impl rule__RealValue__Group_2__1
			{
				pushFollow(FOLLOW_rule__RealValue__Group_2__0__Impl_in_rule__RealValue__Group_2__04281);
				rule__RealValue__Group_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RealValue__Group_2__1_in_rule__RealValue__Group_2__04284);
				rule__RealValue__Group_2__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_2__0"


	// $ANTLR start "rule__RealValue__Group_2__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2103:1: rule__RealValue__Group_2__0__Impl : ( ( rule__RealValue__IntegerAssignment_2_0 )
	// ) ;
	public final void rule__RealValue__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2107:1: ( ( ( rule__RealValue__IntegerAssignment_2_0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2108:1: ( ( rule__RealValue__IntegerAssignment_2_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2108:1: ( ( rule__RealValue__IntegerAssignment_2_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2109:1: ( rule__RealValue__IntegerAssignment_2_0 )
				{
					before(grammarAccess.getRealValueAccess().getIntegerAssignment_2_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2110:1: ( rule__RealValue__IntegerAssignment_2_0 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2110:2: rule__RealValue__IntegerAssignment_2_0
					{
						pushFollow(FOLLOW_rule__RealValue__IntegerAssignment_2_0_in_rule__RealValue__Group_2__0__Impl4311);
						rule__RealValue__IntegerAssignment_2_0();

						state._fsp--;


					}

					after(grammarAccess.getRealValueAccess().getIntegerAssignment_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_2__0__Impl"


	// $ANTLR start "rule__RealValue__Group_2__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2120:1: rule__RealValue__Group_2__1 : rule__RealValue__Group_2__1__Impl
	// rule__RealValue__Group_2__2 ;
	public final void rule__RealValue__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2124:1: ( rule__RealValue__Group_2__1__Impl rule__RealValue__Group_2__2 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2125:2: rule__RealValue__Group_2__1__Impl rule__RealValue__Group_2__2
			{
				pushFollow(FOLLOW_rule__RealValue__Group_2__1__Impl_in_rule__RealValue__Group_2__14341);
				rule__RealValue__Group_2__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RealValue__Group_2__2_in_rule__RealValue__Group_2__14344);
				rule__RealValue__Group_2__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_2__1"


	// $ANTLR start "rule__RealValue__Group_2__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2132:1: rule__RealValue__Group_2__1__Impl : ( '.' ) ;
	public final void rule__RealValue__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2136:1: ( ( '.' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2137:1: ( '.' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2137:1: ( '.' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2138:1: '.'
				{
					before(grammarAccess.getRealValueAccess().getFullStopKeyword_2_1());
					match(input, 34, FOLLOW_34_in_rule__RealValue__Group_2__1__Impl4372);
					after(grammarAccess.getRealValueAccess().getFullStopKeyword_2_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_2__1__Impl"


	// $ANTLR start "rule__RealValue__Group_2__2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2151:1: rule__RealValue__Group_2__2 : rule__RealValue__Group_2__2__Impl ;
	public final void rule__RealValue__Group_2__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2155:1: ( rule__RealValue__Group_2__2__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2156:2: rule__RealValue__Group_2__2__Impl
			{
				pushFollow(FOLLOW_rule__RealValue__Group_2__2__Impl_in_rule__RealValue__Group_2__24403);
				rule__RealValue__Group_2__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_2__2"


	// $ANTLR start "rule__RealValue__Group_2__2__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2162:1: rule__RealValue__Group_2__2__Impl : ( ( rule__RealValue__FractionAssignment_2_2 )
	// ) ;
	public final void rule__RealValue__Group_2__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2166:1: ( ( ( rule__RealValue__FractionAssignment_2_2 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2167:1: ( ( rule__RealValue__FractionAssignment_2_2 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2167:1: ( ( rule__RealValue__FractionAssignment_2_2 ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2168:1: ( rule__RealValue__FractionAssignment_2_2 )
				{
					before(grammarAccess.getRealValueAccess().getFractionAssignment_2_2());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2169:1: ( rule__RealValue__FractionAssignment_2_2 )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2169:2: rule__RealValue__FractionAssignment_2_2
					{
						pushFollow(FOLLOW_rule__RealValue__FractionAssignment_2_2_in_rule__RealValue__Group_2__2__Impl4430);
						rule__RealValue__FractionAssignment_2_2();

						state._fsp--;


					}

					after(grammarAccess.getRealValueAccess().getFractionAssignment_2_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__Group_2__2__Impl"


	// $ANTLR start "rule__NullValue__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2185:1: rule__NullValue__Group__0 : rule__NullValue__Group__0__Impl
	// rule__NullValue__Group__1 ;
	public final void rule__NullValue__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2189:1: ( rule__NullValue__Group__0__Impl rule__NullValue__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2190:2: rule__NullValue__Group__0__Impl rule__NullValue__Group__1
			{
				pushFollow(FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__04466);
				rule__NullValue__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__04469);
				rule__NullValue__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__NullValue__Group__0"


	// $ANTLR start "rule__NullValue__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2197:1: rule__NullValue__Group__0__Impl : ( () ) ;
	public final void rule__NullValue__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2201:1: ( ( () ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2202:1: ( () )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2202:1: ( () )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2203:1: ()
				{
					before(grammarAccess.getNullValueAccess().getNullValueAction_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2204:1: ()
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2206:1:
					{
					}

					after(grammarAccess.getNullValueAccess().getNullValueAction_0());

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__NullValue__Group__0__Impl"


	// $ANTLR start "rule__NullValue__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2216:1: rule__NullValue__Group__1 : rule__NullValue__Group__1__Impl ;
	public final void rule__NullValue__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2220:1: ( rule__NullValue__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2221:2: rule__NullValue__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__14527);
				rule__NullValue__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__NullValue__Group__1"


	// $ANTLR start "rule__NullValue__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2227:1: rule__NullValue__Group__1__Impl : ( 'null' ) ;
	public final void rule__NullValue__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2231:1: ( ( 'null' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2232:1: ( 'null' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2232:1: ( 'null' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2233:1: 'null'
				{
					before(grammarAccess.getNullValueAccess().getNullKeyword_1());
					match(input, 35, FOLLOW_35_in_rule__NullValue__Group__1__Impl4555);
					after(grammarAccess.getNullValueAccess().getNullKeyword_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__NullValue__Group__1__Impl"


	// $ANTLR start "rule__NoValue__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2250:1: rule__NoValue__Group__0 : rule__NoValue__Group__0__Impl rule__NoValue__Group__1 ;
	public final void rule__NoValue__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2254:1: ( rule__NoValue__Group__0__Impl rule__NoValue__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2255:2: rule__NoValue__Group__0__Impl rule__NoValue__Group__1
			{
				pushFollow(FOLLOW_rule__NoValue__Group__0__Impl_in_rule__NoValue__Group__04590);
				rule__NoValue__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__NoValue__Group__1_in_rule__NoValue__Group__04593);
				rule__NoValue__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__NoValue__Group__0"


	// $ANTLR start "rule__NoValue__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2262:1: rule__NoValue__Group__0__Impl : ( () ) ;
	public final void rule__NoValue__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2266:1: ( ( () ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2267:1: ( () )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2267:1: ( () )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2268:1: ()
				{
					before(grammarAccess.getNoValueAccess().getNoValueAction_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2269:1: ()
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2271:1:
					{
					}

					after(grammarAccess.getNoValueAccess().getNoValueAction_0());

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__NoValue__Group__0__Impl"


	// $ANTLR start "rule__NoValue__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2281:1: rule__NoValue__Group__1 : rule__NoValue__Group__1__Impl ;
	public final void rule__NoValue__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2285:1: ( rule__NoValue__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2286:2: rule__NoValue__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__NoValue__Group__1__Impl_in_rule__NoValue__Group__14651);
				rule__NoValue__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__NoValue__Group__1"


	// $ANTLR start "rule__NoValue__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2292:1: rule__NoValue__Group__1__Impl : ( 'none' ) ;
	public final void rule__NoValue__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2296:1: ( ( 'none' ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2297:1: ( 'none' )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2297:1: ( 'none' )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2298:1: 'none'
				{
					before(grammarAccess.getNoValueAccess().getNoneKeyword_1());
					match(input, 36, FOLLOW_36_in_rule__NoValue__Group__1__Impl4679);
					after(grammarAccess.getNoValueAccess().getNoneKeyword_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__NoValue__Group__1__Impl"


	// $ANTLR start "rule__PropertyRule__VisibilityAssignment_0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2316:1: rule__PropertyRule__VisibilityAssignment_0 : ( ruleVisibilityRule ) ;
	public final void rule__PropertyRule__VisibilityAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2320:1: ( ( ruleVisibilityRule ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2321:1: ( ruleVisibilityRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2321:1: ( ruleVisibilityRule )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2322:1: ruleVisibilityRule
				{
					before(grammarAccess.getPropertyRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleVisibilityRule_in_rule__PropertyRule__VisibilityAssignment_04719);
					ruleVisibilityRule();

					state._fsp--;

					after(grammarAccess.getPropertyRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__VisibilityAssignment_0"


	// $ANTLR start "rule__PropertyRule__DerivedAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2331:1: rule__PropertyRule__DerivedAssignment_1 : ( ( '/' ) ) ;
	public final void rule__PropertyRule__DerivedAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2335:1: ( ( ( '/' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2336:1: ( ( '/' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2336:1: ( ( '/' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2337:1: ( '/' )
				{
					before(grammarAccess.getPropertyRuleAccess().getDerivedSolidusKeyword_1_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2338:1: ( '/' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2339:1: '/'
					{
						before(grammarAccess.getPropertyRuleAccess().getDerivedSolidusKeyword_1_0());
						match(input, 37, FOLLOW_37_in_rule__PropertyRule__DerivedAssignment_14755);
						after(grammarAccess.getPropertyRuleAccess().getDerivedSolidusKeyword_1_0());

					}

					after(grammarAccess.getPropertyRuleAccess().getDerivedSolidusKeyword_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__DerivedAssignment_1"


	// $ANTLR start "rule__PropertyRule__NameAssignment_2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2354:1: rule__PropertyRule__NameAssignment_2 : ( RULE_ID ) ;
	public final void rule__PropertyRule__NameAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2358:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2359:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2359:1: ( RULE_ID )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2360:1: RULE_ID
				{
					before(grammarAccess.getPropertyRuleAccess().getNameIDTerminalRuleCall_2_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__PropertyRule__NameAssignment_24794);
					after(grammarAccess.getPropertyRuleAccess().getNameIDTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__NameAssignment_2"


	// $ANTLR start "rule__PropertyRule__TypeAssignment_3_1_0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2369:1: rule__PropertyRule__TypeAssignment_3_1_0 : ( ruleTypeRule ) ;
	public final void rule__PropertyRule__TypeAssignment_3_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2373:1: ( ( ruleTypeRule ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2374:1: ( ruleTypeRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2374:1: ( ruleTypeRule )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2375:1: ruleTypeRule
				{
					before(grammarAccess.getPropertyRuleAccess().getTypeTypeRuleParserRuleCall_3_1_0_0());
					pushFollow(FOLLOW_ruleTypeRule_in_rule__PropertyRule__TypeAssignment_3_1_04825);
					ruleTypeRule();

					state._fsp--;

					after(grammarAccess.getPropertyRuleAccess().getTypeTypeRuleParserRuleCall_3_1_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__TypeAssignment_3_1_0"


	// $ANTLR start "rule__PropertyRule__TypeUndefinedAssignment_3_1_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2384:1: rule__PropertyRule__TypeUndefinedAssignment_3_1_1 : ( ( '<Undefined>' ) ) ;
	public final void rule__PropertyRule__TypeUndefinedAssignment_3_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2388:1: ( ( ( '<Undefined>' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2389:1: ( ( '<Undefined>' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2389:1: ( ( '<Undefined>' ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2390:1: ( '<Undefined>' )
				{
					before(grammarAccess.getPropertyRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2391:1: ( '<Undefined>' )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2392:1: '<Undefined>'
					{
						before(grammarAccess.getPropertyRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0());
						match(input, 38, FOLLOW_38_in_rule__PropertyRule__TypeUndefinedAssignment_3_1_14861);
						after(grammarAccess.getPropertyRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0());

					}

					after(grammarAccess.getPropertyRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__TypeUndefinedAssignment_3_1_1"


	// $ANTLR start "rule__PropertyRule__MultiplicityAssignment_4"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2407:1: rule__PropertyRule__MultiplicityAssignment_4 : ( ruleMultiplicityRule ) ;
	public final void rule__PropertyRule__MultiplicityAssignment_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2411:1: ( ( ruleMultiplicityRule ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2412:1: ( ruleMultiplicityRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2412:1: ( ruleMultiplicityRule )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2413:1: ruleMultiplicityRule
				{
					before(grammarAccess.getPropertyRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0());
					pushFollow(FOLLOW_ruleMultiplicityRule_in_rule__PropertyRule__MultiplicityAssignment_44900);
					ruleMultiplicityRule();

					state._fsp--;

					after(grammarAccess.getPropertyRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__MultiplicityAssignment_4"


	// $ANTLR start "rule__PropertyRule__ModifiersAssignment_5"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2422:1: rule__PropertyRule__ModifiersAssignment_5 : ( ruleModifiersRule ) ;
	public final void rule__PropertyRule__ModifiersAssignment_5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2426:1: ( ( ruleModifiersRule ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2427:1: ( ruleModifiersRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2427:1: ( ruleModifiersRule )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2428:1: ruleModifiersRule
				{
					before(grammarAccess.getPropertyRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0());
					pushFollow(FOLLOW_ruleModifiersRule_in_rule__PropertyRule__ModifiersAssignment_54931);
					ruleModifiersRule();

					state._fsp--;

					after(grammarAccess.getPropertyRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__ModifiersAssignment_5"


	// $ANTLR start "rule__PropertyRule__DefaultAssignment_6"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2437:1: rule__PropertyRule__DefaultAssignment_6 : ( ruleDefaultValueRule ) ;
	public final void rule__PropertyRule__DefaultAssignment_6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2441:1: ( ( ruleDefaultValueRule ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2442:1: ( ruleDefaultValueRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2442:1: ( ruleDefaultValueRule )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2443:1: ruleDefaultValueRule
				{
					before(grammarAccess.getPropertyRuleAccess().getDefaultDefaultValueRuleParserRuleCall_6_0());
					pushFollow(FOLLOW_ruleDefaultValueRule_in_rule__PropertyRule__DefaultAssignment_64962);
					ruleDefaultValueRule();

					state._fsp--;

					after(grammarAccess.getPropertyRuleAccess().getDefaultDefaultValueRuleParserRuleCall_6_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PropertyRule__DefaultAssignment_6"


	// $ANTLR start "rule__VisibilityRule__VisibilityAssignment"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2452:1: rule__VisibilityRule__VisibilityAssignment : ( ruleVisibilityKind ) ;
	public final void rule__VisibilityRule__VisibilityAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2456:1: ( ( ruleVisibilityKind ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2457:1: ( ruleVisibilityKind )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2457:1: ( ruleVisibilityKind )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2458:1: ruleVisibilityKind
				{
					before(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0());
					pushFollow(FOLLOW_ruleVisibilityKind_in_rule__VisibilityRule__VisibilityAssignment4993);
					ruleVisibilityKind();

					state._fsp--;

					after(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__VisibilityRule__VisibilityAssignment"


	// $ANTLR start "rule__TypeRule__PathAssignment_0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2467:1: rule__TypeRule__PathAssignment_0 : ( ruleQualifiedName ) ;
	public final void rule__TypeRule__PathAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2471:1: ( ( ruleQualifiedName ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2472:1: ( ruleQualifiedName )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2472:1: ( ruleQualifiedName )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2473:1: ruleQualifiedName
				{
					before(grammarAccess.getTypeRuleAccess().getPathQualifiedNameParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRule__PathAssignment_05024);
					ruleQualifiedName();

					state._fsp--;

					after(grammarAccess.getTypeRuleAccess().getPathQualifiedNameParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__TypeRule__PathAssignment_0"


	// $ANTLR start "rule__TypeRule__TypeAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2482:1: rule__TypeRule__TypeAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__TypeRule__TypeAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2486:1: ( ( ( RULE_ID ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2487:1: ( ( RULE_ID ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2487:1: ( ( RULE_ID ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2488:1: ( RULE_ID )
				{
					before(grammarAccess.getTypeRuleAccess().getTypeClassifierCrossReference_1_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2489:1: ( RULE_ID )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2490:1: RULE_ID
					{
						before(grammarAccess.getTypeRuleAccess().getTypeClassifierIDTerminalRuleCall_1_0_1());
						match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__TypeRule__TypeAssignment_15059);
						after(grammarAccess.getTypeRuleAccess().getTypeClassifierIDTerminalRuleCall_1_0_1());

					}

					after(grammarAccess.getTypeRuleAccess().getTypeClassifierCrossReference_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__TypeRule__TypeAssignment_1"


	// $ANTLR start "rule__QualifiedName__PathAssignment_0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2501:1: rule__QualifiedName__PathAssignment_0 : ( ( RULE_ID ) ) ;
	public final void rule__QualifiedName__PathAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2505:1: ( ( ( RULE_ID ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2506:1: ( ( RULE_ID ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2506:1: ( ( RULE_ID ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2507:1: ( RULE_ID )
				{
					before(grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2508:1: ( RULE_ID )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2509:1: RULE_ID
					{
						before(grammarAccess.getQualifiedNameAccess().getPathNamespaceIDTerminalRuleCall_0_0_1());
						match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__QualifiedName__PathAssignment_05098);
						after(grammarAccess.getQualifiedNameAccess().getPathNamespaceIDTerminalRuleCall_0_0_1());

					}

					after(grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__QualifiedName__PathAssignment_0"


	// $ANTLR start "rule__QualifiedName__RemainingAssignment_2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2520:1: rule__QualifiedName__RemainingAssignment_2 : ( ruleQualifiedName ) ;
	public final void rule__QualifiedName__RemainingAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2524:1: ( ( ruleQualifiedName ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2525:1: ( ruleQualifiedName )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2525:1: ( ruleQualifiedName )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2526:1: ruleQualifiedName
				{
					before(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0());
					pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedName__RemainingAssignment_25133);
					ruleQualifiedName();

					state._fsp--;

					after(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__QualifiedName__RemainingAssignment_2"


	// $ANTLR start "rule__MultiplicityRule__BoundsAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2535:1: rule__MultiplicityRule__BoundsAssignment_1 : ( ruleBoundSpecification ) ;
	public final void rule__MultiplicityRule__BoundsAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2539:1: ( ( ruleBoundSpecification ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2540:1: ( ruleBoundSpecification )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2540:1: ( ruleBoundSpecification )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2541:1: ruleBoundSpecification
				{
					before(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_15164);
					ruleBoundSpecification();

					state._fsp--;

					after(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__BoundsAssignment_1"


	// $ANTLR start "rule__MultiplicityRule__BoundsAssignment_2_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2550:1: rule__MultiplicityRule__BoundsAssignment_2_1 : ( ruleBoundSpecification ) ;
	public final void rule__MultiplicityRule__BoundsAssignment_2_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2554:1: ( ( ruleBoundSpecification ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2555:1: ( ruleBoundSpecification )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2555:1: ( ruleBoundSpecification )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2556:1: ruleBoundSpecification
				{
					before(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_2_1_0());
					pushFollow(FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_2_15195);
					ruleBoundSpecification();

					state._fsp--;

					after(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_2_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__MultiplicityRule__BoundsAssignment_2_1"


	// $ANTLR start "rule__BoundSpecification__ValueAssignment"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2565:1: rule__BoundSpecification__ValueAssignment : ( ruleUnlimitedLiteral ) ;
	public final void rule__BoundSpecification__ValueAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2569:1: ( ( ruleUnlimitedLiteral ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2570:1: ( ruleUnlimitedLiteral )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2570:1: ( ruleUnlimitedLiteral )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2571:1: ruleUnlimitedLiteral
				{
					before(grammarAccess.getBoundSpecificationAccess().getValueUnlimitedLiteralParserRuleCall_0());
					pushFollow(FOLLOW_ruleUnlimitedLiteral_in_rule__BoundSpecification__ValueAssignment5226);
					ruleUnlimitedLiteral();

					state._fsp--;

					after(grammarAccess.getBoundSpecificationAccess().getValueUnlimitedLiteralParserRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__BoundSpecification__ValueAssignment"


	// $ANTLR start "rule__ModifiersRule__ValuesAssignment_2_0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2580:1: rule__ModifiersRule__ValuesAssignment_2_0 : ( ruleModifierSpecification ) ;
	public final void rule__ModifiersRule__ValuesAssignment_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2584:1: ( ( ruleModifierSpecification ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2585:1: ( ruleModifierSpecification )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2585:1: ( ruleModifierSpecification )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2586:1: ruleModifierSpecification
				{
					before(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_0_0());
					pushFollow(FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_05257);
					ruleModifierSpecification();

					state._fsp--;

					after(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__ValuesAssignment_2_0"


	// $ANTLR start "rule__ModifiersRule__ValuesAssignment_2_1_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2595:1: rule__ModifiersRule__ValuesAssignment_2_1_1 : ( ruleModifierSpecification ) ;
	public final void rule__ModifiersRule__ValuesAssignment_2_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2599:1: ( ( ruleModifierSpecification ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2600:1: ( ruleModifierSpecification )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2600:1: ( ruleModifierSpecification )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2601:1: ruleModifierSpecification
				{
					before(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_1_0());
					pushFollow(FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_1_15288);
					ruleModifierSpecification();

					state._fsp--;

					after(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifiersRule__ValuesAssignment_2_1_1"


	// $ANTLR start "rule__ModifierSpecification__ValueAssignment_0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2610:1: rule__ModifierSpecification__ValueAssignment_0 : ( ruleModifierKind ) ;
	public final void rule__ModifierSpecification__ValueAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2614:1: ( ( ruleModifierKind ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2615:1: ( ruleModifierKind )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2615:1: ( ruleModifierKind )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2616:1: ruleModifierKind
				{
					before(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0_0());
					pushFollow(FOLLOW_ruleModifierKind_in_rule__ModifierSpecification__ValueAssignment_05319);
					ruleModifierKind();

					state._fsp--;

					after(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifierSpecification__ValueAssignment_0"


	// $ANTLR start "rule__ModifierSpecification__RedefinesAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2625:1: rule__ModifierSpecification__RedefinesAssignment_1 : ( ruleRedefinesRule ) ;
	public final void rule__ModifierSpecification__RedefinesAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2629:1: ( ( ruleRedefinesRule ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2630:1: ( ruleRedefinesRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2630:1: ( ruleRedefinesRule )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2631:1: ruleRedefinesRule
				{
					before(grammarAccess.getModifierSpecificationAccess().getRedefinesRedefinesRuleParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleRedefinesRule_in_rule__ModifierSpecification__RedefinesAssignment_15350);
					ruleRedefinesRule();

					state._fsp--;

					after(grammarAccess.getModifierSpecificationAccess().getRedefinesRedefinesRuleParserRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifierSpecification__RedefinesAssignment_1"


	// $ANTLR start "rule__ModifierSpecification__SubsetsAssignment_2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2640:1: rule__ModifierSpecification__SubsetsAssignment_2 : ( ruleSubsetsRule ) ;
	public final void rule__ModifierSpecification__SubsetsAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2644:1: ( ( ruleSubsetsRule ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2645:1: ( ruleSubsetsRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2645:1: ( ruleSubsetsRule )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2646:1: ruleSubsetsRule
				{
					before(grammarAccess.getModifierSpecificationAccess().getSubsetsSubsetsRuleParserRuleCall_2_0());
					pushFollow(FOLLOW_ruleSubsetsRule_in_rule__ModifierSpecification__SubsetsAssignment_25381);
					ruleSubsetsRule();

					state._fsp--;

					after(grammarAccess.getModifierSpecificationAccess().getSubsetsSubsetsRuleParserRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ModifierSpecification__SubsetsAssignment_2"


	// $ANTLR start "rule__RedefinesRule__PropertyAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2655:1: rule__RedefinesRule__PropertyAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__RedefinesRule__PropertyAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2659:1: ( ( ( RULE_ID ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2660:1: ( ( RULE_ID ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2660:1: ( ( RULE_ID ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2661:1: ( RULE_ID )
				{
					before(grammarAccess.getRedefinesRuleAccess().getPropertyPropertyCrossReference_1_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2662:1: ( RULE_ID )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2663:1: RULE_ID
					{
						before(grammarAccess.getRedefinesRuleAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1());
						match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__RedefinesRule__PropertyAssignment_15416);
						after(grammarAccess.getRedefinesRuleAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1());

					}

					after(grammarAccess.getRedefinesRuleAccess().getPropertyPropertyCrossReference_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RedefinesRule__PropertyAssignment_1"


	// $ANTLR start "rule__SubsetsRule__PropertyAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2674:1: rule__SubsetsRule__PropertyAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__SubsetsRule__PropertyAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2678:1: ( ( ( RULE_ID ) ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2679:1: ( ( RULE_ID ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2679:1: ( ( RULE_ID ) )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2680:1: ( RULE_ID )
				{
					before(grammarAccess.getSubsetsRuleAccess().getPropertyPropertyCrossReference_1_0());
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2681:1: ( RULE_ID )
					// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2682:1: RULE_ID
					{
						before(grammarAccess.getSubsetsRuleAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1());
						match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__SubsetsRule__PropertyAssignment_15455);
						after(grammarAccess.getSubsetsRuleAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1());

					}

					after(grammarAccess.getSubsetsRuleAccess().getPropertyPropertyCrossReference_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SubsetsRule__PropertyAssignment_1"


	// $ANTLR start "rule__DefaultValueRule__DefaultAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2693:1: rule__DefaultValueRule__DefaultAssignment_1 : ( ruleValue ) ;
	public final void rule__DefaultValueRule__DefaultAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2697:1: ( ( ruleValue ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2698:1: ( ruleValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2698:1: ( ruleValue )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2699:1: ruleValue
				{
					before(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleValue_in_rule__DefaultValueRule__DefaultAssignment_15490);
					ruleValue();

					state._fsp--;

					after(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__DefaultValueRule__DefaultAssignment_1"


	// $ANTLR start "rule__IntValue__LiteralIntegerAssignment"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2708:1: rule__IntValue__LiteralIntegerAssignment : ( RULE_INT ) ;
	public final void rule__IntValue__LiteralIntegerAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2712:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2713:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2713:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2714:1: RULE_INT
				{
					before(grammarAccess.getIntValueAccess().getLiteralIntegerINTTerminalRuleCall_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__IntValue__LiteralIntegerAssignment5521);
					after(grammarAccess.getIntValueAccess().getLiteralIntegerINTTerminalRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__IntValue__LiteralIntegerAssignment"


	// $ANTLR start "rule__StringValue__LiteralStringAssignment"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2723:1: rule__StringValue__LiteralStringAssignment : ( RULE_STRING ) ;
	public final void rule__StringValue__LiteralStringAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2727:1: ( ( RULE_STRING ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2728:1: ( RULE_STRING )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2728:1: ( RULE_STRING )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2729:1: RULE_STRING
				{
					before(grammarAccess.getStringValueAccess().getLiteralStringSTRINGTerminalRuleCall_0());
					match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__StringValue__LiteralStringAssignment5552);
					after(grammarAccess.getStringValueAccess().getLiteralStringSTRINGTerminalRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__StringValue__LiteralStringAssignment"


	// $ANTLR start "rule__BooleanValue__LiteralBooleanAssignment"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2738:1: rule__BooleanValue__LiteralBooleanAssignment : ( ruleBooleanLiterals ) ;
	public final void rule__BooleanValue__LiteralBooleanAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2742:1: ( ( ruleBooleanLiterals ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2743:1: ( ruleBooleanLiterals )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2743:1: ( ruleBooleanLiterals )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2744:1: ruleBooleanLiterals
				{
					before(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0());
					pushFollow(FOLLOW_ruleBooleanLiterals_in_rule__BooleanValue__LiteralBooleanAssignment5583);
					ruleBooleanLiterals();

					state._fsp--;

					after(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__BooleanValue__LiteralBooleanAssignment"


	// $ANTLR start "rule__RealValue__IntegerAssignment_0_0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2753:1: rule__RealValue__IntegerAssignment_0_0 : ( RULE_INT ) ;
	public final void rule__RealValue__IntegerAssignment_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2757:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2758:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2758:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2759:1: RULE_INT
				{
					before(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_0_0_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_0_05614);
					after(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_0_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__IntegerAssignment_0_0"


	// $ANTLR start "rule__RealValue__FractionAssignment_1_1"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2768:1: rule__RealValue__FractionAssignment_1_1 : ( RULE_INT ) ;
	public final void rule__RealValue__FractionAssignment_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2772:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2773:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2773:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2774:1: RULE_INT
				{
					before(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_1_1_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_1_15645);
					after(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__FractionAssignment_1_1"


	// $ANTLR start "rule__RealValue__IntegerAssignment_2_0"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2783:1: rule__RealValue__IntegerAssignment_2_0 : ( RULE_INT ) ;
	public final void rule__RealValue__IntegerAssignment_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2787:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2788:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2788:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2789:1: RULE_INT
				{
					before(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_2_0_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_2_05676);
					after(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_2_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__IntegerAssignment_2_0"


	// $ANTLR start "rule__RealValue__FractionAssignment_2_2"
	// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2798:1: rule__RealValue__FractionAssignment_2_2 : ( RULE_INT ) ;
	public final void rule__RealValue__FractionAssignment_2_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2802:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2803:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2803:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.property.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/property/xtext/ui/contentassist/antlr/internal/InternalUmlProperty.g:2804:1: RULE_INT
				{
					before(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_2_2_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_2_25707);
					after(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_2_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__RealValue__FractionAssignment_2_2"

	// Delegated rules




	public static final BitSet FOLLOW_rulePropertyRule_in_entryRulePropertyRule61 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePropertyRule68 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__0_in_rulePropertyRule94 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule121 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityRule128 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__VisibilityRule__VisibilityAssignment_in_ruleVisibilityRule154 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTypeRule_in_entryRuleTypeRule181 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleTypeRule188 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__Group__0_in_ruleTypeRule214 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule301 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityRule308 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__0_in_ruleMultiplicityRule334 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification361 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBoundSpecification368 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__BoundSpecification__ValueAssignment_in_ruleBoundSpecification394 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral421 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral428 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__UnlimitedLiteral__Alternatives_in_ruleUnlimitedLiteral454 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule481 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleModifiersRule488 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__0_in_ruleModifiersRule514 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification541 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleModifierSpecification548 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifierSpecification__Alternatives_in_ruleModifierSpecification574 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRedefinesRule_in_entryRuleRedefinesRule601 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleRedefinesRule608 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RedefinesRule__Group__0_in_ruleRedefinesRule634 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubsetsRule_in_entryRuleSubsetsRule661 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSubsetsRule668 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SubsetsRule__Group__0_in_ruleSubsetsRule694 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule721 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueRule728 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__Group__0_in_ruleDefaultValueRule754 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleValue_in_entryRuleValue781 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleValue788 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue814 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue841 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleIntValue848 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__IntValue__LiteralIntegerAssignment_in_ruleIntValue874 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue901 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleStringValue908 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__StringValue__LiteralStringAssignment_in_ruleStringValue934 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue961 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue968 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__BooleanValue__LiteralBooleanAssignment_in_ruleBooleanValue994 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue1021 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleRealValue1028 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Alternatives_in_ruleRealValue1054 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNullValue_in_entryRuleNullValue1081 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNullValue1088 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NullValue__Group__0_in_ruleNullValue1114 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNoValue_in_entryRuleNoValue1141 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNoValue1148 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NoValue__Group__0_in_ruleNoValue1174 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__VisibilityKind__Alternatives_in_ruleVisibilityKind1211 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifierKind__Alternatives_in_ruleModifierKind1247 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__BooleanLiterals__Alternatives_in_ruleBooleanLiterals1283 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__TypeAssignment_3_1_0_in_rule__PropertyRule__Alternatives_3_11318 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__TypeUndefinedAssignment_3_1_1_in_rule__PropertyRule__Alternatives_3_11336 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__UnlimitedLiteral__Alternatives1369 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_12_in_rule__UnlimitedLiteral__Alternatives1387 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifierSpecification__ValueAssignment_0_in_rule__ModifierSpecification__Alternatives1421 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifierSpecification__RedefinesAssignment_1_in_rule__ModifierSpecification__Alternatives1439 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifierSpecification__SubsetsAssignment_2_in_rule__ModifierSpecification__Alternatives1457 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives1490 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives1507 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives1524 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRealValue_in_rule__Value__Alternatives1541 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNullValue_in_rule__Value__Alternatives1558 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNoValue_in_rule__Value__Alternatives1575 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_0__0_in_rule__RealValue__Alternatives1607 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_1__0_in_rule__RealValue__Alternatives1625 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__0_in_rule__RealValue__Alternatives1643 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_13_in_rule__VisibilityKind__Alternatives1677 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_14_in_rule__VisibilityKind__Alternatives1698 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_15_in_rule__VisibilityKind__Alternatives1719 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_16_in_rule__VisibilityKind__Alternatives1740 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_17_in_rule__ModifierKind__Alternatives1776 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_18_in_rule__ModifierKind__Alternatives1797 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_19_in_rule__ModifierKind__Alternatives1818 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_20_in_rule__ModifierKind__Alternatives1839 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_rule__BooleanLiterals__Alternatives1875 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_22_in_rule__BooleanLiterals__Alternatives1896 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__0__Impl_in_rule__PropertyRule__Group__01929 = new BitSet(new long[] { 0x0000002000000020L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__1_in_rule__PropertyRule__Group__01932 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__VisibilityAssignment_0_in_rule__PropertyRule__Group__0__Impl1959 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__1__Impl_in_rule__PropertyRule__Group__11990 = new BitSet(new long[] { 0x0000002000000020L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__2_in_rule__PropertyRule__Group__11993 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__DerivedAssignment_1_in_rule__PropertyRule__Group__1__Impl2020 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__2__Impl_in_rule__PropertyRule__Group__22051 = new BitSet(new long[] { 0x0000000212800000L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__3_in_rule__PropertyRule__Group__22054 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__NameAssignment_2_in_rule__PropertyRule__Group__2__Impl2081 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__3__Impl_in_rule__PropertyRule__Group__32111 = new BitSet(new long[] { 0x0000000212800000L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__4_in_rule__PropertyRule__Group__32114 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group_3__0_in_rule__PropertyRule__Group__3__Impl2141 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__4__Impl_in_rule__PropertyRule__Group__42172 = new BitSet(new long[] { 0x0000000212800000L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__5_in_rule__PropertyRule__Group__42175 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__MultiplicityAssignment_4_in_rule__PropertyRule__Group__4__Impl2202 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__5__Impl_in_rule__PropertyRule__Group__52233 = new BitSet(new long[] { 0x0000000212800000L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__6_in_rule__PropertyRule__Group__52236 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__ModifiersAssignment_5_in_rule__PropertyRule__Group__5__Impl2263 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group__6__Impl_in_rule__PropertyRule__Group__62294 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__DefaultAssignment_6_in_rule__PropertyRule__Group__6__Impl2321 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group_3__0__Impl_in_rule__PropertyRule__Group_3__02366 = new BitSet(new long[] { 0x0000004000000020L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group_3__1_in_rule__PropertyRule__Group_3__02369 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_23_in_rule__PropertyRule__Group_3__0__Impl2397 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Group_3__1__Impl_in_rule__PropertyRule__Group_3__12428 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PropertyRule__Alternatives_3_1_in_rule__PropertyRule__Group_3__1__Impl2455 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__Group__0__Impl_in_rule__TypeRule__Group__02489 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_rule__TypeRule__Group__1_in_rule__TypeRule__Group__02492 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__PathAssignment_0_in_rule__TypeRule__Group__0__Impl2519 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__Group__1__Impl_in_rule__TypeRule__Group__12550 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__TypeAssignment_1_in_rule__TypeRule__Group__1__Impl2577 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02611 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02614 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__PathAssignment_0_in_rule__QualifiedName__Group__0__Impl2641 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12671 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__12674 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_24_in_rule__QualifiedName__Group__1__Impl2702 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__22733 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__RemainingAssignment_2_in_rule__QualifiedName__Group__2__Impl2760 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__0__Impl_in_rule__MultiplicityRule__Group__02797 = new BitSet(new long[] { 0x0000000000001010L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__1_in_rule__MultiplicityRule__Group__02800 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_25_in_rule__MultiplicityRule__Group__0__Impl2828 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__1__Impl_in_rule__MultiplicityRule__Group__12859 = new BitSet(new long[] { 0x000000000C000000L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__2_in_rule__MultiplicityRule__Group__12862 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__BoundsAssignment_1_in_rule__MultiplicityRule__Group__1__Impl2889 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__2__Impl_in_rule__MultiplicityRule__Group__22919 = new BitSet(new long[] { 0x000000000C000000L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__3_in_rule__MultiplicityRule__Group__22922 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__0_in_rule__MultiplicityRule__Group__2__Impl2949 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__3__Impl_in_rule__MultiplicityRule__Group__32980 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_26_in_rule__MultiplicityRule__Group__3__Impl3008 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__0__Impl_in_rule__MultiplicityRule__Group_2__03047 = new BitSet(new long[] { 0x0000000000001010L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__1_in_rule__MultiplicityRule__Group_2__03050 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_27_in_rule__MultiplicityRule__Group_2__0__Impl3078 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__1__Impl_in_rule__MultiplicityRule__Group_2__13109 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__BoundsAssignment_2_1_in_rule__MultiplicityRule__Group_2__1__Impl3136 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__0__Impl_in_rule__ModifiersRule__Group__03170 = new BitSet(new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__1_in_rule__ModifiersRule__Group__03173 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__1__Impl_in_rule__ModifiersRule__Group__13231 = new BitSet(new long[] { 0x00000001A01E0000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__2_in_rule__ModifiersRule__Group__13234 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_28_in_rule__ModifiersRule__Group__1__Impl3262 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__2__Impl_in_rule__ModifiersRule__Group__23293 = new BitSet(new long[] { 0x00000001A01E0000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__3_in_rule__ModifiersRule__Group__23296 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__0_in_rule__ModifiersRule__Group__2__Impl3323 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__3__Impl_in_rule__ModifiersRule__Group__33354 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_29_in_rule__ModifiersRule__Group__3__Impl3382 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__0__Impl_in_rule__ModifiersRule__Group_2__03421 = new BitSet(new long[] { 0x0000000040000000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__1_in_rule__ModifiersRule__Group_2__03424 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__ValuesAssignment_2_0_in_rule__ModifiersRule__Group_2__0__Impl3451 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__1__Impl_in_rule__ModifiersRule__Group_2__13481 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2_1__0_in_rule__ModifiersRule__Group_2__1__Impl3508 = new BitSet(new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2_1__0__Impl_in_rule__ModifiersRule__Group_2_1__03543 = new BitSet(new long[] { 0x00000001801E0000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2_1__1_in_rule__ModifiersRule__Group_2_1__03546 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_rule__ModifiersRule__Group_2_1__0__Impl3574 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2_1__1__Impl_in_rule__ModifiersRule__Group_2_1__13605 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__ValuesAssignment_2_1_1_in_rule__ModifiersRule__Group_2_1__1__Impl3632 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RedefinesRule__Group__0__Impl_in_rule__RedefinesRule__Group__03666 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_rule__RedefinesRule__Group__1_in_rule__RedefinesRule__Group__03669 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_31_in_rule__RedefinesRule__Group__0__Impl3697 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RedefinesRule__Group__1__Impl_in_rule__RedefinesRule__Group__13728 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RedefinesRule__PropertyAssignment_1_in_rule__RedefinesRule__Group__1__Impl3755 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SubsetsRule__Group__0__Impl_in_rule__SubsetsRule__Group__03789 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_rule__SubsetsRule__Group__1_in_rule__SubsetsRule__Group__03792 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_rule__SubsetsRule__Group__0__Impl3820 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SubsetsRule__Group__1__Impl_in_rule__SubsetsRule__Group__13851 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SubsetsRule__PropertyAssignment_1_in_rule__SubsetsRule__Group__1__Impl3878 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__Group__0__Impl_in_rule__DefaultValueRule__Group__03912 = new BitSet(new long[] { 0x0000001C00600050L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__Group__1_in_rule__DefaultValueRule__Group__03915 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_33_in_rule__DefaultValueRule__Group__0__Impl3943 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__Group__1__Impl_in_rule__DefaultValueRule__Group__13974 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__DefaultAssignment_1_in_rule__DefaultValueRule__Group__1__Impl4001 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_0__0__Impl_in_rule__RealValue__Group_0__04035 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_rule__RealValue__Group_0__1_in_rule__RealValue__Group_0__04038 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__IntegerAssignment_0_0_in_rule__RealValue__Group_0__0__Impl4065 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_0__1__Impl_in_rule__RealValue__Group_0__14095 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__RealValue__Group_0__1__Impl4123 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_1__0__Impl_in_rule__RealValue__Group_1__04158 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__RealValue__Group_1__1_in_rule__RealValue__Group_1__04161 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__RealValue__Group_1__0__Impl4189 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_1__1__Impl_in_rule__RealValue__Group_1__14220 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__FractionAssignment_1_1_in_rule__RealValue__Group_1__1__Impl4247 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__0__Impl_in_rule__RealValue__Group_2__04281 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__1_in_rule__RealValue__Group_2__04284 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__IntegerAssignment_2_0_in_rule__RealValue__Group_2__0__Impl4311 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__1__Impl_in_rule__RealValue__Group_2__14341 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__2_in_rule__RealValue__Group_2__14344 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__RealValue__Group_2__1__Impl4372 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__2__Impl_in_rule__RealValue__Group_2__24403 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__FractionAssignment_2_2_in_rule__RealValue__Group_2__2__Impl4430 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__04466 = new BitSet(new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__04469 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__14527 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_35_in_rule__NullValue__Group__1__Impl4555 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NoValue__Group__0__Impl_in_rule__NoValue__Group__04590 = new BitSet(new long[] { 0x0000001C00600050L });
	public static final BitSet FOLLOW_rule__NoValue__Group__1_in_rule__NoValue__Group__04593 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NoValue__Group__1__Impl_in_rule__NoValue__Group__14651 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_36_in_rule__NoValue__Group__1__Impl4679 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityRule_in_rule__PropertyRule__VisibilityAssignment_04719 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_37_in_rule__PropertyRule__DerivedAssignment_14755 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyRule__NameAssignment_24794 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTypeRule_in_rule__PropertyRule__TypeAssignment_3_1_04825 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_38_in_rule__PropertyRule__TypeUndefinedAssignment_3_1_14861 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleMultiplicityRule_in_rule__PropertyRule__MultiplicityAssignment_44900 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifiersRule_in_rule__PropertyRule__ModifiersAssignment_54931 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDefaultValueRule_in_rule__PropertyRule__DefaultAssignment_64962 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__VisibilityRule__VisibilityAssignment4993 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRule__PathAssignment_05024 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__TypeRule__TypeAssignment_15059 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__PathAssignment_05098 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedName__RemainingAssignment_25133 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_15164 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_2_15195 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_rule__BoundSpecification__ValueAssignment5226 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_05257 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_1_15288 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierKind_in_rule__ModifierSpecification__ValueAssignment_05319 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRedefinesRule_in_rule__ModifierSpecification__RedefinesAssignment_15350 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubsetsRule_in_rule__ModifierSpecification__SubsetsAssignment_25381 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__RedefinesRule__PropertyAssignment_15416 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__SubsetsRule__PropertyAssignment_15455 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleValue_in_rule__DefaultValueRule__DefaultAssignment_15490 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__LiteralIntegerAssignment5521 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__LiteralStringAssignment5552 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanLiterals_in_rule__BooleanValue__LiteralBooleanAssignment5583 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_0_05614 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_1_15645 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_2_05676 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_2_25707 = new BitSet(new long[] { 0x0000000000000002L });

}