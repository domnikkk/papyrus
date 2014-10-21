package org.eclipse.papyrus.uml.textedit.port.xtext.ui.contentassist.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.papyrus.uml.textedit.port.xtext.services.UmlPortGrammarAccess;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class InternalUmlPortParser extends AbstractInternalContentAssistParser {
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
		return "../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g";
	}



	private UmlPortGrammarAccess grammarAccess;

	public void setGrammarAccess(UmlPortGrammarAccess grammarAccess) {
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




	// $ANTLR start "entryRulePortRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:60:1: entryRulePortRule : rulePortRule EOF ;
	public final void entryRulePortRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:61:1: ( rulePortRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:62:1: rulePortRule EOF
			{
				before(grammarAccess.getPortRuleRule());
				pushFollow(FOLLOW_rulePortRule_in_entryRulePortRule61);
				rulePortRule();

				state._fsp--;

				after(grammarAccess.getPortRuleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRulePortRule68);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRulePortRule"


	// $ANTLR start "rulePortRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:69:1: rulePortRule : ( ( rule__PortRule__Group__0 ) ) ;
	public final void rulePortRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:73:2: ( ( ( rule__PortRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:74:1: ( ( rule__PortRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:74:1: ( ( rule__PortRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:75:1: ( rule__PortRule__Group__0 )
				{
					before(grammarAccess.getPortRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:76:1: ( rule__PortRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:76:2: rule__PortRule__Group__0
					{
						pushFollow(FOLLOW_rule__PortRule__Group__0_in_rulePortRule94);
						rule__PortRule__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getPortRuleAccess().getGroup());

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

	// $ANTLR end "rulePortRule"


	// $ANTLR start "entryRuleVisibilityRule"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:88:1: entryRuleVisibilityRule : ruleVisibilityRule EOF ;
	public final void entryRuleVisibilityRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:89:1: ( ruleVisibilityRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:90:1: ruleVisibilityRule EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:97:1: ruleVisibilityRule : ( ( rule__VisibilityRule__VisibilityAssignment ) ) ;
	public final void ruleVisibilityRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:101:2: ( ( ( rule__VisibilityRule__VisibilityAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:102:1: ( ( rule__VisibilityRule__VisibilityAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:102:1: ( ( rule__VisibilityRule__VisibilityAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:103:1: ( rule__VisibilityRule__VisibilityAssignment )
				{
					before(grammarAccess.getVisibilityRuleAccess().getVisibilityAssignment());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:104:1: ( rule__VisibilityRule__VisibilityAssignment )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:104:2: rule__VisibilityRule__VisibilityAssignment
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:116:1: entryRuleTypeRule : ruleTypeRule EOF ;
	public final void entryRuleTypeRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:117:1: ( ruleTypeRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:118:1: ruleTypeRule EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:125:1: ruleTypeRule : ( ( rule__TypeRule__Group__0 ) ) ;
	public final void ruleTypeRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:129:2: ( ( ( rule__TypeRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:130:1: ( ( rule__TypeRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:130:1: ( ( rule__TypeRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:131:1: ( rule__TypeRule__Group__0 )
				{
					before(grammarAccess.getTypeRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:132:1: ( rule__TypeRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:132:2: rule__TypeRule__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
	public final void entryRuleQualifiedName() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:145:1: ( ruleQualifiedName EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:146:1: ruleQualifiedName EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
	public final void ruleQualifiedName() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:159:1: ( rule__QualifiedName__Group__0 )
				{
					before(grammarAccess.getQualifiedNameAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:160:1: ( rule__QualifiedName__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:160:2: rule__QualifiedName__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:172:1: entryRuleMultiplicityRule : ruleMultiplicityRule EOF ;
	public final void entryRuleMultiplicityRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:173:1: ( ruleMultiplicityRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:174:1: ruleMultiplicityRule EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:181:1: ruleMultiplicityRule : ( ( rule__MultiplicityRule__Group__0 ) ) ;
	public final void ruleMultiplicityRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:185:2: ( ( ( rule__MultiplicityRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:186:1: ( ( rule__MultiplicityRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:186:1: ( ( rule__MultiplicityRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:187:1: ( rule__MultiplicityRule__Group__0 )
				{
					before(grammarAccess.getMultiplicityRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:188:1: ( rule__MultiplicityRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:188:2: rule__MultiplicityRule__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:200:1: entryRuleBoundSpecification : ruleBoundSpecification EOF ;
	public final void entryRuleBoundSpecification() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:201:1: ( ruleBoundSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:202:1: ruleBoundSpecification EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:209:1: ruleBoundSpecification : ( ( rule__BoundSpecification__ValueAssignment ) ) ;
	public final void ruleBoundSpecification() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:213:2: ( ( ( rule__BoundSpecification__ValueAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:214:1: ( ( rule__BoundSpecification__ValueAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:214:1: ( ( rule__BoundSpecification__ValueAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:215:1: ( rule__BoundSpecification__ValueAssignment )
				{
					before(grammarAccess.getBoundSpecificationAccess().getValueAssignment());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:216:1: ( rule__BoundSpecification__ValueAssignment )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:216:2: rule__BoundSpecification__ValueAssignment
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:228:1: entryRuleUnlimitedLiteral : ruleUnlimitedLiteral EOF ;
	public final void entryRuleUnlimitedLiteral() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:229:1: ( ruleUnlimitedLiteral EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:230:1: ruleUnlimitedLiteral EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:237:1: ruleUnlimitedLiteral : ( ( rule__UnlimitedLiteral__Alternatives ) ) ;
	public final void ruleUnlimitedLiteral() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:241:2: ( ( ( rule__UnlimitedLiteral__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:242:1: ( ( rule__UnlimitedLiteral__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:242:1: ( ( rule__UnlimitedLiteral__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:243:1: ( rule__UnlimitedLiteral__Alternatives )
				{
					before(grammarAccess.getUnlimitedLiteralAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:244:1: ( rule__UnlimitedLiteral__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:244:2: rule__UnlimitedLiteral__Alternatives
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:256:1: entryRuleModifiersRule : ruleModifiersRule EOF ;
	public final void entryRuleModifiersRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:257:1: ( ruleModifiersRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:258:1: ruleModifiersRule EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:265:1: ruleModifiersRule : ( ( rule__ModifiersRule__Group__0 ) ) ;
	public final void ruleModifiersRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:269:2: ( ( ( rule__ModifiersRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:270:1: ( ( rule__ModifiersRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:270:1: ( ( rule__ModifiersRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:271:1: ( rule__ModifiersRule__Group__0 )
				{
					before(grammarAccess.getModifiersRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:272:1: ( rule__ModifiersRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:272:2: rule__ModifiersRule__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:284:1: entryRuleModifierSpecification : ruleModifierSpecification EOF ;
	public final void entryRuleModifierSpecification() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:285:1: ( ruleModifierSpecification EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:286:1: ruleModifierSpecification EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:293:1: ruleModifierSpecification : ( ( rule__ModifierSpecification__Alternatives ) ) ;
	public final void ruleModifierSpecification() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:297:2: ( ( ( rule__ModifierSpecification__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:298:1: ( ( rule__ModifierSpecification__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:298:1: ( ( rule__ModifierSpecification__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:299:1: ( rule__ModifierSpecification__Alternatives )
				{
					before(grammarAccess.getModifierSpecificationAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:300:1: ( rule__ModifierSpecification__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:300:2: rule__ModifierSpecification__Alternatives
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:312:1: entryRuleRedefinesRule : ruleRedefinesRule EOF ;
	public final void entryRuleRedefinesRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:313:1: ( ruleRedefinesRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:314:1: ruleRedefinesRule EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:321:1: ruleRedefinesRule : ( ( rule__RedefinesRule__Group__0 ) ) ;
	public final void ruleRedefinesRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:325:2: ( ( ( rule__RedefinesRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:326:1: ( ( rule__RedefinesRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:326:1: ( ( rule__RedefinesRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:327:1: ( rule__RedefinesRule__Group__0 )
				{
					before(grammarAccess.getRedefinesRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:328:1: ( rule__RedefinesRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:328:2: rule__RedefinesRule__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:340:1: entryRuleSubsetsRule : ruleSubsetsRule EOF ;
	public final void entryRuleSubsetsRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:341:1: ( ruleSubsetsRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:342:1: ruleSubsetsRule EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:349:1: ruleSubsetsRule : ( ( rule__SubsetsRule__Group__0 ) ) ;
	public final void ruleSubsetsRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:353:2: ( ( ( rule__SubsetsRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:354:1: ( ( rule__SubsetsRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:354:1: ( ( rule__SubsetsRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:355:1: ( rule__SubsetsRule__Group__0 )
				{
					before(grammarAccess.getSubsetsRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:356:1: ( rule__SubsetsRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:356:2: rule__SubsetsRule__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:368:1: entryRuleDefaultValueRule : ruleDefaultValueRule EOF ;
	public final void entryRuleDefaultValueRule() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:369:1: ( ruleDefaultValueRule EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:370:1: ruleDefaultValueRule EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:377:1: ruleDefaultValueRule : ( ( rule__DefaultValueRule__Group__0 ) ) ;
	public final void ruleDefaultValueRule() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:381:2: ( ( ( rule__DefaultValueRule__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:382:1: ( ( rule__DefaultValueRule__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:382:1: ( ( rule__DefaultValueRule__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:383:1: ( rule__DefaultValueRule__Group__0 )
				{
					before(grammarAccess.getDefaultValueRuleAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:384:1: ( rule__DefaultValueRule__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:384:2: rule__DefaultValueRule__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:396:1: entryRuleValue : ruleValue EOF ;
	public final void entryRuleValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:397:1: ( ruleValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:398:1: ruleValue EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:405:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
	public final void ruleValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:409:2: ( ( ( rule__Value__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:410:1: ( ( rule__Value__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:410:1: ( ( rule__Value__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:411:1: ( rule__Value__Alternatives )
				{
					before(grammarAccess.getValueAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:412:1: ( rule__Value__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:412:2: rule__Value__Alternatives
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:424:1: entryRuleIntValue : ruleIntValue EOF ;
	public final void entryRuleIntValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:425:1: ( ruleIntValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:426:1: ruleIntValue EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:433:1: ruleIntValue : ( ( rule__IntValue__LiteralIntegerAssignment ) ) ;
	public final void ruleIntValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:437:2: ( ( ( rule__IntValue__LiteralIntegerAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:438:1: ( ( rule__IntValue__LiteralIntegerAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:438:1: ( ( rule__IntValue__LiteralIntegerAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:439:1: ( rule__IntValue__LiteralIntegerAssignment )
				{
					before(grammarAccess.getIntValueAccess().getLiteralIntegerAssignment());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:440:1: ( rule__IntValue__LiteralIntegerAssignment )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:440:2: rule__IntValue__LiteralIntegerAssignment
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:452:1: entryRuleStringValue : ruleStringValue EOF ;
	public final void entryRuleStringValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:453:1: ( ruleStringValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:454:1: ruleStringValue EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:461:1: ruleStringValue : ( ( rule__StringValue__LiteralStringAssignment ) ) ;
	public final void ruleStringValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:465:2: ( ( ( rule__StringValue__LiteralStringAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:466:1: ( ( rule__StringValue__LiteralStringAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:466:1: ( ( rule__StringValue__LiteralStringAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:467:1: ( rule__StringValue__LiteralStringAssignment )
				{
					before(grammarAccess.getStringValueAccess().getLiteralStringAssignment());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:468:1: ( rule__StringValue__LiteralStringAssignment )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:468:2: rule__StringValue__LiteralStringAssignment
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:480:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
	public final void entryRuleBooleanValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:481:1: ( ruleBooleanValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:482:1: ruleBooleanValue EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:489:1: ruleBooleanValue : ( ( rule__BooleanValue__LiteralBooleanAssignment ) ) ;
	public final void ruleBooleanValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:493:2: ( ( ( rule__BooleanValue__LiteralBooleanAssignment ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:494:1: ( ( rule__BooleanValue__LiteralBooleanAssignment ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:494:1: ( ( rule__BooleanValue__LiteralBooleanAssignment ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:495:1: ( rule__BooleanValue__LiteralBooleanAssignment )
				{
					before(grammarAccess.getBooleanValueAccess().getLiteralBooleanAssignment());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:496:1: ( rule__BooleanValue__LiteralBooleanAssignment )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:496:2: rule__BooleanValue__LiteralBooleanAssignment
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:508:1: entryRuleRealValue : ruleRealValue EOF ;
	public final void entryRuleRealValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:509:1: ( ruleRealValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:510:1: ruleRealValue EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:517:1: ruleRealValue : ( ( rule__RealValue__Alternatives ) ) ;
	public final void ruleRealValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:521:2: ( ( ( rule__RealValue__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:522:1: ( ( rule__RealValue__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:522:1: ( ( rule__RealValue__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:523:1: ( rule__RealValue__Alternatives )
				{
					before(grammarAccess.getRealValueAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:524:1: ( rule__RealValue__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:524:2: rule__RealValue__Alternatives
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:536:1: entryRuleNullValue : ruleNullValue EOF ;
	public final void entryRuleNullValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:537:1: ( ruleNullValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:538:1: ruleNullValue EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:545:1: ruleNullValue : ( ( rule__NullValue__Group__0 ) ) ;
	public final void ruleNullValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:549:2: ( ( ( rule__NullValue__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:550:1: ( ( rule__NullValue__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:550:1: ( ( rule__NullValue__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:551:1: ( rule__NullValue__Group__0 )
				{
					before(grammarAccess.getNullValueAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:552:1: ( rule__NullValue__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:552:2: rule__NullValue__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:564:1: entryRuleNoValue : ruleNoValue EOF ;
	public final void entryRuleNoValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:565:1: ( ruleNoValue EOF )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:566:1: ruleNoValue EOF
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:573:1: ruleNoValue : ( ( rule__NoValue__Group__0 ) ) ;
	public final void ruleNoValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:577:2: ( ( ( rule__NoValue__Group__0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:578:1: ( ( rule__NoValue__Group__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:578:1: ( ( rule__NoValue__Group__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:579:1: ( rule__NoValue__Group__0 )
				{
					before(grammarAccess.getNoValueAccess().getGroup());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:580:1: ( rule__NoValue__Group__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:580:2: rule__NoValue__Group__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:593:1: ruleVisibilityKind : ( ( rule__VisibilityKind__Alternatives ) ) ;
	public final void ruleVisibilityKind() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:597:1: ( ( ( rule__VisibilityKind__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:598:1: ( ( rule__VisibilityKind__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:598:1: ( ( rule__VisibilityKind__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:599:1: ( rule__VisibilityKind__Alternatives )
				{
					before(grammarAccess.getVisibilityKindAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:600:1: ( rule__VisibilityKind__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:600:2: rule__VisibilityKind__Alternatives
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:612:1: ruleModifierKind : ( ( rule__ModifierKind__Alternatives ) ) ;
	public final void ruleModifierKind() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:616:1: ( ( ( rule__ModifierKind__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:617:1: ( ( rule__ModifierKind__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:617:1: ( ( rule__ModifierKind__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:618:1: ( rule__ModifierKind__Alternatives )
				{
					before(grammarAccess.getModifierKindAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:619:1: ( rule__ModifierKind__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:619:2: rule__ModifierKind__Alternatives
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:631:1: ruleBooleanLiterals : ( ( rule__BooleanLiterals__Alternatives ) ) ;
	public final void ruleBooleanLiterals() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:635:1: ( ( ( rule__BooleanLiterals__Alternatives ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:636:1: ( ( rule__BooleanLiterals__Alternatives ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:636:1: ( ( rule__BooleanLiterals__Alternatives ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:637:1: ( rule__BooleanLiterals__Alternatives )
				{
					before(grammarAccess.getBooleanLiteralsAccess().getAlternatives());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:638:1: ( rule__BooleanLiterals__Alternatives )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:638:2: rule__BooleanLiterals__Alternatives
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


	// $ANTLR start "rule__PortRule__Alternatives_3_2"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:649:1: rule__PortRule__Alternatives_3_2 : ( ( ( rule__PortRule__TypeAssignment_3_2_0 ) ) | ( (
	// rule__PortRule__TypeUndefinedAssignment_3_2_1 ) ) );
	public final void rule__PortRule__Alternatives_3_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:653:1: ( ( ( rule__PortRule__TypeAssignment_3_2_0 ) ) | ( (
			// rule__PortRule__TypeUndefinedAssignment_3_2_1 ) ) )
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:654:1: ( ( rule__PortRule__TypeAssignment_3_2_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:654:1: ( ( rule__PortRule__TypeAssignment_3_2_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:655:1: ( rule__PortRule__TypeAssignment_3_2_0 )
				{
					before(grammarAccess.getPortRuleAccess().getTypeAssignment_3_2_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:656:1: ( rule__PortRule__TypeAssignment_3_2_0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:656:2: rule__PortRule__TypeAssignment_3_2_0
					{
						pushFollow(FOLLOW_rule__PortRule__TypeAssignment_3_2_0_in_rule__PortRule__Alternatives_3_21318);
						rule__PortRule__TypeAssignment_3_2_0();

						state._fsp--;


					}

					after(grammarAccess.getPortRuleAccess().getTypeAssignment_3_2_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:660:6: ( ( rule__PortRule__TypeUndefinedAssignment_3_2_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:660:6: ( ( rule__PortRule__TypeUndefinedAssignment_3_2_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:661:1: ( rule__PortRule__TypeUndefinedAssignment_3_2_1 )
				{
					before(grammarAccess.getPortRuleAccess().getTypeUndefinedAssignment_3_2_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:662:1: ( rule__PortRule__TypeUndefinedAssignment_3_2_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:662:2: rule__PortRule__TypeUndefinedAssignment_3_2_1
					{
						pushFollow(FOLLOW_rule__PortRule__TypeUndefinedAssignment_3_2_1_in_rule__PortRule__Alternatives_3_21336);
						rule__PortRule__TypeUndefinedAssignment_3_2_1();

						state._fsp--;


					}

					after(grammarAccess.getPortRuleAccess().getTypeUndefinedAssignment_3_2_1());

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

	// $ANTLR end "rule__PortRule__Alternatives_3_2"


	// $ANTLR start "rule__UnlimitedLiteral__Alternatives"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:671:1: rule__UnlimitedLiteral__Alternatives : ( ( RULE_INT ) | ( '*' ) );
	public final void rule__UnlimitedLiteral__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:675:1: ( ( RULE_INT ) | ( '*' ) )
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:676:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:676:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:677:1: RULE_INT
				{
					before(grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__UnlimitedLiteral__Alternatives1369);
					after(grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:682:6: ( '*' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:682:6: ( '*' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:683:1: '*'
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:695:1: rule__ModifierSpecification__Alternatives : ( ( (
	// rule__ModifierSpecification__ValueAssignment_0 ) ) | ( ( rule__ModifierSpecification__RedefinesAssignment_1 ) ) | ( ( rule__ModifierSpecification__SubsetsAssignment_2 ) ) );
	public final void rule__ModifierSpecification__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:699:1: ( ( ( rule__ModifierSpecification__ValueAssignment_0 ) ) | ( (
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:700:1: ( ( rule__ModifierSpecification__ValueAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:700:1: ( ( rule__ModifierSpecification__ValueAssignment_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:701:1: ( rule__ModifierSpecification__ValueAssignment_0 )
				{
					before(grammarAccess.getModifierSpecificationAccess().getValueAssignment_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:702:1: ( rule__ModifierSpecification__ValueAssignment_0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:702:2: rule__ModifierSpecification__ValueAssignment_0
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:706:6: ( ( rule__ModifierSpecification__RedefinesAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:706:6: ( ( rule__ModifierSpecification__RedefinesAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:707:1: ( rule__ModifierSpecification__RedefinesAssignment_1 )
				{
					before(grammarAccess.getModifierSpecificationAccess().getRedefinesAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:708:1: ( rule__ModifierSpecification__RedefinesAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:708:2: rule__ModifierSpecification__RedefinesAssignment_1
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:712:6: ( ( rule__ModifierSpecification__SubsetsAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:712:6: ( ( rule__ModifierSpecification__SubsetsAssignment_2 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:713:1: ( rule__ModifierSpecification__SubsetsAssignment_2 )
				{
					before(grammarAccess.getModifierSpecificationAccess().getSubsetsAssignment_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:714:1: ( rule__ModifierSpecification__SubsetsAssignment_2 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:714:2: rule__ModifierSpecification__SubsetsAssignment_2
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:723:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) |
	// ( ruleRealValue ) | ( ruleNullValue ) | ( ruleNoValue ) );
	public final void rule__Value__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:727:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleRealValue ) |
			// ( ruleNullValue ) | ( ruleNoValue ) )
			int alt4 = 6;
			switch (input.LA(1)) {
			case RULE_INT: {
				int LA4_1 = input.LA(2);

				if ((LA4_1 == EOF)) {
					alt4 = 1;
				}
				else if ((LA4_1 == 34)) {
					alt4 = 4;
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:728:1: ( ruleIntValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:728:1: ( ruleIntValue )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:729:1: ruleIntValue
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:734:6: ( ruleStringValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:734:6: ( ruleStringValue )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:735:1: ruleStringValue
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:740:6: ( ruleBooleanValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:740:6: ( ruleBooleanValue )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:741:1: ruleBooleanValue
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:746:6: ( ruleRealValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:746:6: ( ruleRealValue )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:747:1: ruleRealValue
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:752:6: ( ruleNullValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:752:6: ( ruleNullValue )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:753:1: ruleNullValue
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:758:6: ( ruleNoValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:758:6: ( ruleNoValue )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:759:1: ruleNoValue
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:769:1: rule__RealValue__Alternatives : ( ( ( rule__RealValue__Group_0__0 ) ) | ( (
	// rule__RealValue__Group_1__0 ) ) | ( ( rule__RealValue__Group_2__0 ) ) );
	public final void rule__RealValue__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:773:1: ( ( ( rule__RealValue__Group_0__0 ) ) | ( ( rule__RealValue__Group_1__0 ) ) | ( (
			// rule__RealValue__Group_2__0 ) ) )
			int alt5 = 3;
			int LA5_0 = input.LA(1);

			if ((LA5_0 == RULE_INT)) {
				int LA5_1 = input.LA(2);

				if ((LA5_1 == 34)) {
					int LA5_3 = input.LA(3);

					if ((LA5_3 == RULE_INT)) {
						alt5 = 3;
					}
					else if ((LA5_3 == EOF)) {
						alt5 = 1;
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:774:1: ( ( rule__RealValue__Group_0__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:774:1: ( ( rule__RealValue__Group_0__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:775:1: ( rule__RealValue__Group_0__0 )
				{
					before(grammarAccess.getRealValueAccess().getGroup_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:776:1: ( rule__RealValue__Group_0__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:776:2: rule__RealValue__Group_0__0
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:780:6: ( ( rule__RealValue__Group_1__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:780:6: ( ( rule__RealValue__Group_1__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:781:1: ( rule__RealValue__Group_1__0 )
				{
					before(grammarAccess.getRealValueAccess().getGroup_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:782:1: ( rule__RealValue__Group_1__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:782:2: rule__RealValue__Group_1__0
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:786:6: ( ( rule__RealValue__Group_2__0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:786:6: ( ( rule__RealValue__Group_2__0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:787:1: ( rule__RealValue__Group_2__0 )
				{
					before(grammarAccess.getRealValueAccess().getGroup_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:788:1: ( rule__RealValue__Group_2__0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:788:2: rule__RealValue__Group_2__0
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:797:1: rule__VisibilityKind__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) )
	// );
	public final void rule__VisibilityKind__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:801:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) )
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:802:1: ( ( '+' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:802:1: ( ( '+' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:803:1: ( '+' )
				{
					before(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:804:1: ( '+' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:804:3: '+'
					{
						match(input, 13, FOLLOW_13_in_rule__VisibilityKind__Alternatives1677);

					}

					after(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:809:6: ( ( '-' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:809:6: ( ( '-' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:810:1: ( '-' )
				{
					before(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:811:1: ( '-' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:811:3: '-'
					{
						match(input, 14, FOLLOW_14_in_rule__VisibilityKind__Alternatives1698);

					}

					after(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:816:6: ( ( '#' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:816:6: ( ( '#' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:817:1: ( '#' )
				{
					before(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:818:1: ( '#' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:818:3: '#'
					{
						match(input, 15, FOLLOW_15_in_rule__VisibilityKind__Alternatives1719);

					}

					after(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());

				}


			}
				break;
			case 4:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:823:6: ( ( '~' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:823:6: ( ( '~' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:824:1: ( '~' )
				{
					before(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:825:1: ( '~' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:825:3: '~'
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:835:1: rule__ModifierKind__Alternatives : ( ( ( 'readOnly' ) ) | ( ( 'union' ) ) | ( ( 'ordered' ) )
	// | ( ( 'unique' ) ) );
	public final void rule__ModifierKind__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:839:1: ( ( ( 'readOnly' ) ) | ( ( 'union' ) ) | ( ( 'ordered' ) ) | ( ( 'unique' ) ) )
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:840:1: ( ( 'readOnly' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:840:1: ( ( 'readOnly' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:841:1: ( 'readOnly' )
				{
					before(grammarAccess.getModifierKindAccess().getReadOnlyEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:842:1: ( 'readOnly' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:842:3: 'readOnly'
					{
						match(input, 17, FOLLOW_17_in_rule__ModifierKind__Alternatives1776);

					}

					after(grammarAccess.getModifierKindAccess().getReadOnlyEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:847:6: ( ( 'union' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:847:6: ( ( 'union' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:848:1: ( 'union' )
				{
					before(grammarAccess.getModifierKindAccess().getUnionEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:849:1: ( 'union' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:849:3: 'union'
					{
						match(input, 18, FOLLOW_18_in_rule__ModifierKind__Alternatives1797);

					}

					after(grammarAccess.getModifierKindAccess().getUnionEnumLiteralDeclaration_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:854:6: ( ( 'ordered' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:854:6: ( ( 'ordered' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:855:1: ( 'ordered' )
				{
					before(grammarAccess.getModifierKindAccess().getOrderedEnumLiteralDeclaration_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:856:1: ( 'ordered' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:856:3: 'ordered'
					{
						match(input, 19, FOLLOW_19_in_rule__ModifierKind__Alternatives1818);

					}

					after(grammarAccess.getModifierKindAccess().getOrderedEnumLiteralDeclaration_2());

				}


			}
				break;
			case 4:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:861:6: ( ( 'unique' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:861:6: ( ( 'unique' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:862:1: ( 'unique' )
				{
					before(grammarAccess.getModifierKindAccess().getUniqueEnumLiteralDeclaration_3());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:863:1: ( 'unique' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:863:3: 'unique'
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:873:1: rule__BooleanLiterals__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
	public final void rule__BooleanLiterals__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:877:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
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
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:878:1: ( ( 'true' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:878:1: ( ( 'true' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:879:1: ( 'true' )
				{
					before(grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:880:1: ( 'true' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:880:3: 'true'
					{
						match(input, 21, FOLLOW_21_in_rule__BooleanLiterals__Alternatives1875);

					}

					after(grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:885:6: ( ( 'false' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:885:6: ( ( 'false' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:886:1: ( 'false' )
				{
					before(grammarAccess.getBooleanLiteralsAccess().getFalseEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:887:1: ( 'false' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:887:3: 'false'
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


	// $ANTLR start "rule__PortRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:899:1: rule__PortRule__Group__0 : rule__PortRule__Group__0__Impl rule__PortRule__Group__1 ;
	public final void rule__PortRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:903:1: ( rule__PortRule__Group__0__Impl rule__PortRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:904:2: rule__PortRule__Group__0__Impl rule__PortRule__Group__1
			{
				pushFollow(FOLLOW_rule__PortRule__Group__0__Impl_in_rule__PortRule__Group__01929);
				rule__PortRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PortRule__Group__1_in_rule__PortRule__Group__01932);
				rule__PortRule__Group__1();

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

	// $ANTLR end "rule__PortRule__Group__0"


	// $ANTLR start "rule__PortRule__Group__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:911:1: rule__PortRule__Group__0__Impl : ( ( rule__PortRule__VisibilityAssignment_0 )? ) ;
	public final void rule__PortRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:915:1: ( ( ( rule__PortRule__VisibilityAssignment_0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:916:1: ( ( rule__PortRule__VisibilityAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:916:1: ( ( rule__PortRule__VisibilityAssignment_0 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:917:1: ( rule__PortRule__VisibilityAssignment_0 )?
				{
					before(grammarAccess.getPortRuleAccess().getVisibilityAssignment_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:918:1: ( rule__PortRule__VisibilityAssignment_0 )?
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if (((LA9_0 >= 13 && LA9_0 <= 16))) {
						alt9 = 1;
					}
					switch (alt9) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:918:2: rule__PortRule__VisibilityAssignment_0
					{
						pushFollow(FOLLOW_rule__PortRule__VisibilityAssignment_0_in_rule__PortRule__Group__0__Impl1959);
						rule__PortRule__VisibilityAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPortRuleAccess().getVisibilityAssignment_0());

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

	// $ANTLR end "rule__PortRule__Group__0__Impl"


	// $ANTLR start "rule__PortRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:928:1: rule__PortRule__Group__1 : rule__PortRule__Group__1__Impl rule__PortRule__Group__2 ;
	public final void rule__PortRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:932:1: ( rule__PortRule__Group__1__Impl rule__PortRule__Group__2 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:933:2: rule__PortRule__Group__1__Impl rule__PortRule__Group__2
			{
				pushFollow(FOLLOW_rule__PortRule__Group__1__Impl_in_rule__PortRule__Group__11990);
				rule__PortRule__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PortRule__Group__2_in_rule__PortRule__Group__11993);
				rule__PortRule__Group__2();

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

	// $ANTLR end "rule__PortRule__Group__1"


	// $ANTLR start "rule__PortRule__Group__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:940:1: rule__PortRule__Group__1__Impl : ( ( rule__PortRule__DerivedAssignment_1 )? ) ;
	public final void rule__PortRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:944:1: ( ( ( rule__PortRule__DerivedAssignment_1 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:945:1: ( ( rule__PortRule__DerivedAssignment_1 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:945:1: ( ( rule__PortRule__DerivedAssignment_1 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:946:1: ( rule__PortRule__DerivedAssignment_1 )?
				{
					before(grammarAccess.getPortRuleAccess().getDerivedAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:947:1: ( rule__PortRule__DerivedAssignment_1 )?
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == 37)) {
						alt10 = 1;
					}
					switch (alt10) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:947:2: rule__PortRule__DerivedAssignment_1
					{
						pushFollow(FOLLOW_rule__PortRule__DerivedAssignment_1_in_rule__PortRule__Group__1__Impl2020);
						rule__PortRule__DerivedAssignment_1();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPortRuleAccess().getDerivedAssignment_1());

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

	// $ANTLR end "rule__PortRule__Group__1__Impl"


	// $ANTLR start "rule__PortRule__Group__2"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:957:1: rule__PortRule__Group__2 : rule__PortRule__Group__2__Impl rule__PortRule__Group__3 ;
	public final void rule__PortRule__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:961:1: ( rule__PortRule__Group__2__Impl rule__PortRule__Group__3 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:962:2: rule__PortRule__Group__2__Impl rule__PortRule__Group__3
			{
				pushFollow(FOLLOW_rule__PortRule__Group__2__Impl_in_rule__PortRule__Group__22051);
				rule__PortRule__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PortRule__Group__3_in_rule__PortRule__Group__22054);
				rule__PortRule__Group__3();

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

	// $ANTLR end "rule__PortRule__Group__2"


	// $ANTLR start "rule__PortRule__Group__2__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:969:1: rule__PortRule__Group__2__Impl : ( ( rule__PortRule__NameAssignment_2 ) ) ;
	public final void rule__PortRule__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:973:1: ( ( ( rule__PortRule__NameAssignment_2 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:974:1: ( ( rule__PortRule__NameAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:974:1: ( ( rule__PortRule__NameAssignment_2 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:975:1: ( rule__PortRule__NameAssignment_2 )
				{
					before(grammarAccess.getPortRuleAccess().getNameAssignment_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:976:1: ( rule__PortRule__NameAssignment_2 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:976:2: rule__PortRule__NameAssignment_2
					{
						pushFollow(FOLLOW_rule__PortRule__NameAssignment_2_in_rule__PortRule__Group__2__Impl2081);
						rule__PortRule__NameAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getPortRuleAccess().getNameAssignment_2());

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

	// $ANTLR end "rule__PortRule__Group__2__Impl"


	// $ANTLR start "rule__PortRule__Group__3"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:986:1: rule__PortRule__Group__3 : rule__PortRule__Group__3__Impl rule__PortRule__Group__4 ;
	public final void rule__PortRule__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:990:1: ( rule__PortRule__Group__3__Impl rule__PortRule__Group__4 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:991:2: rule__PortRule__Group__3__Impl rule__PortRule__Group__4
			{
				pushFollow(FOLLOW_rule__PortRule__Group__3__Impl_in_rule__PortRule__Group__32111);
				rule__PortRule__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PortRule__Group__4_in_rule__PortRule__Group__32114);
				rule__PortRule__Group__4();

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

	// $ANTLR end "rule__PortRule__Group__3"


	// $ANTLR start "rule__PortRule__Group__3__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:998:1: rule__PortRule__Group__3__Impl : ( ( rule__PortRule__Group_3__0 )? ) ;
	public final void rule__PortRule__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1002:1: ( ( ( rule__PortRule__Group_3__0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1003:1: ( ( rule__PortRule__Group_3__0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1003:1: ( ( rule__PortRule__Group_3__0 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1004:1: ( rule__PortRule__Group_3__0 )?
				{
					before(grammarAccess.getPortRuleAccess().getGroup_3());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1005:1: ( rule__PortRule__Group_3__0 )?
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == 23)) {
						alt11 = 1;
					}
					switch (alt11) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1005:2: rule__PortRule__Group_3__0
					{
						pushFollow(FOLLOW_rule__PortRule__Group_3__0_in_rule__PortRule__Group__3__Impl2141);
						rule__PortRule__Group_3__0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPortRuleAccess().getGroup_3());

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

	// $ANTLR end "rule__PortRule__Group__3__Impl"


	// $ANTLR start "rule__PortRule__Group__4"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1015:1: rule__PortRule__Group__4 : rule__PortRule__Group__4__Impl rule__PortRule__Group__5 ;
	public final void rule__PortRule__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1019:1: ( rule__PortRule__Group__4__Impl rule__PortRule__Group__5 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1020:2: rule__PortRule__Group__4__Impl rule__PortRule__Group__5
			{
				pushFollow(FOLLOW_rule__PortRule__Group__4__Impl_in_rule__PortRule__Group__42172);
				rule__PortRule__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PortRule__Group__5_in_rule__PortRule__Group__42175);
				rule__PortRule__Group__5();

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

	// $ANTLR end "rule__PortRule__Group__4"


	// $ANTLR start "rule__PortRule__Group__4__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1027:1: rule__PortRule__Group__4__Impl : ( ( rule__PortRule__MultiplicityAssignment_4 )? ) ;
	public final void rule__PortRule__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1031:1: ( ( ( rule__PortRule__MultiplicityAssignment_4 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1032:1: ( ( rule__PortRule__MultiplicityAssignment_4 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1032:1: ( ( rule__PortRule__MultiplicityAssignment_4 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1033:1: ( rule__PortRule__MultiplicityAssignment_4 )?
				{
					before(grammarAccess.getPortRuleAccess().getMultiplicityAssignment_4());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1034:1: ( rule__PortRule__MultiplicityAssignment_4 )?
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if ((LA12_0 == 25)) {
						alt12 = 1;
					}
					switch (alt12) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1034:2: rule__PortRule__MultiplicityAssignment_4
					{
						pushFollow(FOLLOW_rule__PortRule__MultiplicityAssignment_4_in_rule__PortRule__Group__4__Impl2202);
						rule__PortRule__MultiplicityAssignment_4();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPortRuleAccess().getMultiplicityAssignment_4());

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

	// $ANTLR end "rule__PortRule__Group__4__Impl"


	// $ANTLR start "rule__PortRule__Group__5"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1044:1: rule__PortRule__Group__5 : rule__PortRule__Group__5__Impl rule__PortRule__Group__6 ;
	public final void rule__PortRule__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1048:1: ( rule__PortRule__Group__5__Impl rule__PortRule__Group__6 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1049:2: rule__PortRule__Group__5__Impl rule__PortRule__Group__6
			{
				pushFollow(FOLLOW_rule__PortRule__Group__5__Impl_in_rule__PortRule__Group__52233);
				rule__PortRule__Group__5__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PortRule__Group__6_in_rule__PortRule__Group__52236);
				rule__PortRule__Group__6();

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

	// $ANTLR end "rule__PortRule__Group__5"


	// $ANTLR start "rule__PortRule__Group__5__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1056:1: rule__PortRule__Group__5__Impl : ( ( rule__PortRule__ModifiersAssignment_5 )? ) ;
	public final void rule__PortRule__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1060:1: ( ( ( rule__PortRule__ModifiersAssignment_5 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1061:1: ( ( rule__PortRule__ModifiersAssignment_5 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1061:1: ( ( rule__PortRule__ModifiersAssignment_5 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1062:1: ( rule__PortRule__ModifiersAssignment_5 )?
				{
					before(grammarAccess.getPortRuleAccess().getModifiersAssignment_5());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1063:1: ( rule__PortRule__ModifiersAssignment_5 )?
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if ((LA13_0 == 28)) {
						alt13 = 1;
					}
					switch (alt13) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1063:2: rule__PortRule__ModifiersAssignment_5
					{
						pushFollow(FOLLOW_rule__PortRule__ModifiersAssignment_5_in_rule__PortRule__Group__5__Impl2263);
						rule__PortRule__ModifiersAssignment_5();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPortRuleAccess().getModifiersAssignment_5());

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

	// $ANTLR end "rule__PortRule__Group__5__Impl"


	// $ANTLR start "rule__PortRule__Group__6"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1073:1: rule__PortRule__Group__6 : rule__PortRule__Group__6__Impl ;
	public final void rule__PortRule__Group__6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1077:1: ( rule__PortRule__Group__6__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1078:2: rule__PortRule__Group__6__Impl
			{
				pushFollow(FOLLOW_rule__PortRule__Group__6__Impl_in_rule__PortRule__Group__62294);
				rule__PortRule__Group__6__Impl();

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

	// $ANTLR end "rule__PortRule__Group__6"


	// $ANTLR start "rule__PortRule__Group__6__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1084:1: rule__PortRule__Group__6__Impl : ( ( rule__PortRule__DefaultAssignment_6 )? ) ;
	public final void rule__PortRule__Group__6__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1088:1: ( ( ( rule__PortRule__DefaultAssignment_6 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1089:1: ( ( rule__PortRule__DefaultAssignment_6 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1089:1: ( ( rule__PortRule__DefaultAssignment_6 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1090:1: ( rule__PortRule__DefaultAssignment_6 )?
				{
					before(grammarAccess.getPortRuleAccess().getDefaultAssignment_6());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1091:1: ( rule__PortRule__DefaultAssignment_6 )?
					int alt14 = 2;
					int LA14_0 = input.LA(1);

					if ((LA14_0 == 33)) {
						alt14 = 1;
					}
					switch (alt14) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1091:2: rule__PortRule__DefaultAssignment_6
					{
						pushFollow(FOLLOW_rule__PortRule__DefaultAssignment_6_in_rule__PortRule__Group__6__Impl2321);
						rule__PortRule__DefaultAssignment_6();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPortRuleAccess().getDefaultAssignment_6());

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

	// $ANTLR end "rule__PortRule__Group__6__Impl"


	// $ANTLR start "rule__PortRule__Group_3__0"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1115:1: rule__PortRule__Group_3__0 : rule__PortRule__Group_3__0__Impl rule__PortRule__Group_3__1 ;
	public final void rule__PortRule__Group_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1119:1: ( rule__PortRule__Group_3__0__Impl rule__PortRule__Group_3__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1120:2: rule__PortRule__Group_3__0__Impl rule__PortRule__Group_3__1
			{
				pushFollow(FOLLOW_rule__PortRule__Group_3__0__Impl_in_rule__PortRule__Group_3__02366);
				rule__PortRule__Group_3__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PortRule__Group_3__1_in_rule__PortRule__Group_3__02369);
				rule__PortRule__Group_3__1();

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

	// $ANTLR end "rule__PortRule__Group_3__0"


	// $ANTLR start "rule__PortRule__Group_3__0__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1127:1: rule__PortRule__Group_3__0__Impl : ( ':' ) ;
	public final void rule__PortRule__Group_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1131:1: ( ( ':' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1132:1: ( ':' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1132:1: ( ':' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1133:1: ':'
				{
					before(grammarAccess.getPortRuleAccess().getColonKeyword_3_0());
					match(input, 23, FOLLOW_23_in_rule__PortRule__Group_3__0__Impl2397);
					after(grammarAccess.getPortRuleAccess().getColonKeyword_3_0());

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

	// $ANTLR end "rule__PortRule__Group_3__0__Impl"


	// $ANTLR start "rule__PortRule__Group_3__1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1146:1: rule__PortRule__Group_3__1 : rule__PortRule__Group_3__1__Impl rule__PortRule__Group_3__2 ;
	public final void rule__PortRule__Group_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1150:1: ( rule__PortRule__Group_3__1__Impl rule__PortRule__Group_3__2 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1151:2: rule__PortRule__Group_3__1__Impl rule__PortRule__Group_3__2
			{
				pushFollow(FOLLOW_rule__PortRule__Group_3__1__Impl_in_rule__PortRule__Group_3__12428);
				rule__PortRule__Group_3__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PortRule__Group_3__2_in_rule__PortRule__Group_3__12431);
				rule__PortRule__Group_3__2();

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

	// $ANTLR end "rule__PortRule__Group_3__1"


	// $ANTLR start "rule__PortRule__Group_3__1__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1158:1: rule__PortRule__Group_3__1__Impl : ( ( rule__PortRule__ConjugatedAssignment_3_1 )? ) ;
	public final void rule__PortRule__Group_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1162:1: ( ( ( rule__PortRule__ConjugatedAssignment_3_1 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1163:1: ( ( rule__PortRule__ConjugatedAssignment_3_1 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1163:1: ( ( rule__PortRule__ConjugatedAssignment_3_1 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1164:1: ( rule__PortRule__ConjugatedAssignment_3_1 )?
				{
					before(grammarAccess.getPortRuleAccess().getConjugatedAssignment_3_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1165:1: ( rule__PortRule__ConjugatedAssignment_3_1 )?
					int alt15 = 2;
					int LA15_0 = input.LA(1);

					if ((LA15_0 == 16)) {
						alt15 = 1;
					}
					switch (alt15) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1165:2: rule__PortRule__ConjugatedAssignment_3_1
					{
						pushFollow(FOLLOW_rule__PortRule__ConjugatedAssignment_3_1_in_rule__PortRule__Group_3__1__Impl2458);
						rule__PortRule__ConjugatedAssignment_3_1();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPortRuleAccess().getConjugatedAssignment_3_1());

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

	// $ANTLR end "rule__PortRule__Group_3__1__Impl"


	// $ANTLR start "rule__PortRule__Group_3__2"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1175:1: rule__PortRule__Group_3__2 : rule__PortRule__Group_3__2__Impl ;
	public final void rule__PortRule__Group_3__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1179:1: ( rule__PortRule__Group_3__2__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1180:2: rule__PortRule__Group_3__2__Impl
			{
				pushFollow(FOLLOW_rule__PortRule__Group_3__2__Impl_in_rule__PortRule__Group_3__22489);
				rule__PortRule__Group_3__2__Impl();

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

	// $ANTLR end "rule__PortRule__Group_3__2"


	// $ANTLR start "rule__PortRule__Group_3__2__Impl"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1186:1: rule__PortRule__Group_3__2__Impl : ( ( rule__PortRule__Alternatives_3_2 ) ) ;
	public final void rule__PortRule__Group_3__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1190:1: ( ( ( rule__PortRule__Alternatives_3_2 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1191:1: ( ( rule__PortRule__Alternatives_3_2 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1191:1: ( ( rule__PortRule__Alternatives_3_2 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1192:1: ( rule__PortRule__Alternatives_3_2 )
				{
					before(grammarAccess.getPortRuleAccess().getAlternatives_3_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1193:1: ( rule__PortRule__Alternatives_3_2 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1193:2: rule__PortRule__Alternatives_3_2
					{
						pushFollow(FOLLOW_rule__PortRule__Alternatives_3_2_in_rule__PortRule__Group_3__2__Impl2516);
						rule__PortRule__Alternatives_3_2();

						state._fsp--;


					}

					after(grammarAccess.getPortRuleAccess().getAlternatives_3_2());

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

	// $ANTLR end "rule__PortRule__Group_3__2__Impl"


	// $ANTLR start "rule__TypeRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1209:1: rule__TypeRule__Group__0 : rule__TypeRule__Group__0__Impl rule__TypeRule__Group__1 ;
	public final void rule__TypeRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1213:1: ( rule__TypeRule__Group__0__Impl rule__TypeRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1214:2: rule__TypeRule__Group__0__Impl rule__TypeRule__Group__1
			{
				pushFollow(FOLLOW_rule__TypeRule__Group__0__Impl_in_rule__TypeRule__Group__02552);
				rule__TypeRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__TypeRule__Group__1_in_rule__TypeRule__Group__02555);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1221:1: rule__TypeRule__Group__0__Impl : ( ( rule__TypeRule__PathAssignment_0 )? ) ;
	public final void rule__TypeRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1225:1: ( ( ( rule__TypeRule__PathAssignment_0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1226:1: ( ( rule__TypeRule__PathAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1226:1: ( ( rule__TypeRule__PathAssignment_0 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1227:1: ( rule__TypeRule__PathAssignment_0 )?
				{
					before(grammarAccess.getTypeRuleAccess().getPathAssignment_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1228:1: ( rule__TypeRule__PathAssignment_0 )?
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
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1228:2: rule__TypeRule__PathAssignment_0
					{
						pushFollow(FOLLOW_rule__TypeRule__PathAssignment_0_in_rule__TypeRule__Group__0__Impl2582);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1238:1: rule__TypeRule__Group__1 : rule__TypeRule__Group__1__Impl ;
	public final void rule__TypeRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1242:1: ( rule__TypeRule__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1243:2: rule__TypeRule__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__TypeRule__Group__1__Impl_in_rule__TypeRule__Group__12613);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1249:1: rule__TypeRule__Group__1__Impl : ( ( rule__TypeRule__TypeAssignment_1 ) ) ;
	public final void rule__TypeRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1253:1: ( ( ( rule__TypeRule__TypeAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1254:1: ( ( rule__TypeRule__TypeAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1254:1: ( ( rule__TypeRule__TypeAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1255:1: ( rule__TypeRule__TypeAssignment_1 )
				{
					before(grammarAccess.getTypeRuleAccess().getTypeAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1256:1: ( rule__TypeRule__TypeAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1256:2: rule__TypeRule__TypeAssignment_1
					{
						pushFollow(FOLLOW_rule__TypeRule__TypeAssignment_1_in_rule__TypeRule__Group__1__Impl2640);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1270:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl
	// rule__QualifiedName__Group__1 ;
	public final void rule__QualifiedName__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1274:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1275:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
			{
				pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02674);
				rule__QualifiedName__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02677);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1282:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__PathAssignment_0 ) ) ;
	public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1286:1: ( ( ( rule__QualifiedName__PathAssignment_0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1287:1: ( ( rule__QualifiedName__PathAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1287:1: ( ( rule__QualifiedName__PathAssignment_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1288:1: ( rule__QualifiedName__PathAssignment_0 )
				{
					before(grammarAccess.getQualifiedNameAccess().getPathAssignment_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1289:1: ( rule__QualifiedName__PathAssignment_0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1289:2: rule__QualifiedName__PathAssignment_0
					{
						pushFollow(FOLLOW_rule__QualifiedName__PathAssignment_0_in_rule__QualifiedName__Group__0__Impl2704);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1299:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl
	// rule__QualifiedName__Group__2 ;
	public final void rule__QualifiedName__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1303:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1304:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
			{
				pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12734);
				rule__QualifiedName__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__12737);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1311:1: rule__QualifiedName__Group__1__Impl : ( '::' ) ;
	public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1315:1: ( ( '::' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1316:1: ( '::' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1316:1: ( '::' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1317:1: '::'
				{
					before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1());
					match(input, 24, FOLLOW_24_in_rule__QualifiedName__Group__1__Impl2765);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1330:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
	public final void rule__QualifiedName__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1334:1: ( rule__QualifiedName__Group__2__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1335:2: rule__QualifiedName__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__22796);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1341:1: rule__QualifiedName__Group__2__Impl : ( ( rule__QualifiedName__RemainingAssignment_2 )? ) ;
	public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1345:1: ( ( ( rule__QualifiedName__RemainingAssignment_2 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1346:1: ( ( rule__QualifiedName__RemainingAssignment_2 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1346:1: ( ( rule__QualifiedName__RemainingAssignment_2 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1347:1: ( rule__QualifiedName__RemainingAssignment_2 )?
				{
					before(grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1348:1: ( rule__QualifiedName__RemainingAssignment_2 )?
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if ((LA17_0 == RULE_ID)) {
						int LA17_1 = input.LA(2);

						if ((LA17_1 == 24)) {
							alt17 = 1;
						}
					}
					switch (alt17) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1348:2: rule__QualifiedName__RemainingAssignment_2
					{
						pushFollow(FOLLOW_rule__QualifiedName__RemainingAssignment_2_in_rule__QualifiedName__Group__2__Impl2823);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1364:1: rule__MultiplicityRule__Group__0 : rule__MultiplicityRule__Group__0__Impl
	// rule__MultiplicityRule__Group__1 ;
	public final void rule__MultiplicityRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1368:1: ( rule__MultiplicityRule__Group__0__Impl rule__MultiplicityRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1369:2: rule__MultiplicityRule__Group__0__Impl rule__MultiplicityRule__Group__1
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group__0__Impl_in_rule__MultiplicityRule__Group__02860);
				rule__MultiplicityRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__MultiplicityRule__Group__1_in_rule__MultiplicityRule__Group__02863);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1376:1: rule__MultiplicityRule__Group__0__Impl : ( '[' ) ;
	public final void rule__MultiplicityRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1380:1: ( ( '[' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1381:1: ( '[' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1381:1: ( '[' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1382:1: '['
				{
					before(grammarAccess.getMultiplicityRuleAccess().getLeftSquareBracketKeyword_0());
					match(input, 25, FOLLOW_25_in_rule__MultiplicityRule__Group__0__Impl2891);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1395:1: rule__MultiplicityRule__Group__1 : rule__MultiplicityRule__Group__1__Impl
	// rule__MultiplicityRule__Group__2 ;
	public final void rule__MultiplicityRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1399:1: ( rule__MultiplicityRule__Group__1__Impl rule__MultiplicityRule__Group__2 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1400:2: rule__MultiplicityRule__Group__1__Impl rule__MultiplicityRule__Group__2
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group__1__Impl_in_rule__MultiplicityRule__Group__12922);
				rule__MultiplicityRule__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__MultiplicityRule__Group__2_in_rule__MultiplicityRule__Group__12925);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1407:1: rule__MultiplicityRule__Group__1__Impl : ( ( rule__MultiplicityRule__BoundsAssignment_1 ) ) ;
	public final void rule__MultiplicityRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1411:1: ( ( ( rule__MultiplicityRule__BoundsAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1412:1: ( ( rule__MultiplicityRule__BoundsAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1412:1: ( ( rule__MultiplicityRule__BoundsAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1413:1: ( rule__MultiplicityRule__BoundsAssignment_1 )
				{
					before(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1414:1: ( rule__MultiplicityRule__BoundsAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1414:2: rule__MultiplicityRule__BoundsAssignment_1
					{
						pushFollow(FOLLOW_rule__MultiplicityRule__BoundsAssignment_1_in_rule__MultiplicityRule__Group__1__Impl2952);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1424:1: rule__MultiplicityRule__Group__2 : rule__MultiplicityRule__Group__2__Impl
	// rule__MultiplicityRule__Group__3 ;
	public final void rule__MultiplicityRule__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1428:1: ( rule__MultiplicityRule__Group__2__Impl rule__MultiplicityRule__Group__3 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1429:2: rule__MultiplicityRule__Group__2__Impl rule__MultiplicityRule__Group__3
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group__2__Impl_in_rule__MultiplicityRule__Group__22982);
				rule__MultiplicityRule__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__MultiplicityRule__Group__3_in_rule__MultiplicityRule__Group__22985);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1436:1: rule__MultiplicityRule__Group__2__Impl : ( ( rule__MultiplicityRule__Group_2__0 )? ) ;
	public final void rule__MultiplicityRule__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1440:1: ( ( ( rule__MultiplicityRule__Group_2__0 )? ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1441:1: ( ( rule__MultiplicityRule__Group_2__0 )? )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1441:1: ( ( rule__MultiplicityRule__Group_2__0 )? )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1442:1: ( rule__MultiplicityRule__Group_2__0 )?
				{
					before(grammarAccess.getMultiplicityRuleAccess().getGroup_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1443:1: ( rule__MultiplicityRule__Group_2__0 )?
					int alt18 = 2;
					int LA18_0 = input.LA(1);

					if ((LA18_0 == 27)) {
						alt18 = 1;
					}
					switch (alt18) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1443:2: rule__MultiplicityRule__Group_2__0
					{
						pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__0_in_rule__MultiplicityRule__Group__2__Impl3012);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1453:1: rule__MultiplicityRule__Group__3 : rule__MultiplicityRule__Group__3__Impl ;
	public final void rule__MultiplicityRule__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1457:1: ( rule__MultiplicityRule__Group__3__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1458:2: rule__MultiplicityRule__Group__3__Impl
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group__3__Impl_in_rule__MultiplicityRule__Group__33043);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1464:1: rule__MultiplicityRule__Group__3__Impl : ( ']' ) ;
	public final void rule__MultiplicityRule__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1468:1: ( ( ']' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1469:1: ( ']' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1469:1: ( ']' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1470:1: ']'
				{
					before(grammarAccess.getMultiplicityRuleAccess().getRightSquareBracketKeyword_3());
					match(input, 26, FOLLOW_26_in_rule__MultiplicityRule__Group__3__Impl3071);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1491:1: rule__MultiplicityRule__Group_2__0 : rule__MultiplicityRule__Group_2__0__Impl
	// rule__MultiplicityRule__Group_2__1 ;
	public final void rule__MultiplicityRule__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1495:1: ( rule__MultiplicityRule__Group_2__0__Impl rule__MultiplicityRule__Group_2__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1496:2: rule__MultiplicityRule__Group_2__0__Impl rule__MultiplicityRule__Group_2__1
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__0__Impl_in_rule__MultiplicityRule__Group_2__03110);
				rule__MultiplicityRule__Group_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__1_in_rule__MultiplicityRule__Group_2__03113);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1503:1: rule__MultiplicityRule__Group_2__0__Impl : ( '..' ) ;
	public final void rule__MultiplicityRule__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1507:1: ( ( '..' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1508:1: ( '..' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1508:1: ( '..' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1509:1: '..'
				{
					before(grammarAccess.getMultiplicityRuleAccess().getFullStopFullStopKeyword_2_0());
					match(input, 27, FOLLOW_27_in_rule__MultiplicityRule__Group_2__0__Impl3141);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1522:1: rule__MultiplicityRule__Group_2__1 : rule__MultiplicityRule__Group_2__1__Impl ;
	public final void rule__MultiplicityRule__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1526:1: ( rule__MultiplicityRule__Group_2__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1527:2: rule__MultiplicityRule__Group_2__1__Impl
			{
				pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__1__Impl_in_rule__MultiplicityRule__Group_2__13172);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1533:1: rule__MultiplicityRule__Group_2__1__Impl : ( ( rule__MultiplicityRule__BoundsAssignment_2_1 )
	// ) ;
	public final void rule__MultiplicityRule__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1537:1: ( ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1538:1: ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1538:1: ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1539:1: ( rule__MultiplicityRule__BoundsAssignment_2_1 )
				{
					before(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_2_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1540:1: ( rule__MultiplicityRule__BoundsAssignment_2_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1540:2: rule__MultiplicityRule__BoundsAssignment_2_1
					{
						pushFollow(FOLLOW_rule__MultiplicityRule__BoundsAssignment_2_1_in_rule__MultiplicityRule__Group_2__1__Impl3199);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1554:1: rule__ModifiersRule__Group__0 : rule__ModifiersRule__Group__0__Impl
	// rule__ModifiersRule__Group__1 ;
	public final void rule__ModifiersRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1558:1: ( rule__ModifiersRule__Group__0__Impl rule__ModifiersRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1559:2: rule__ModifiersRule__Group__0__Impl rule__ModifiersRule__Group__1
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group__0__Impl_in_rule__ModifiersRule__Group__03233);
				rule__ModifiersRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group__1_in_rule__ModifiersRule__Group__03236);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1566:1: rule__ModifiersRule__Group__0__Impl : ( '{' ) ;
	public final void rule__ModifiersRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1570:1: ( ( '{' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1571:1: ( '{' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1571:1: ( '{' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1572:1: '{'
				{
					before(grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_0());
					match(input, 28, FOLLOW_28_in_rule__ModifiersRule__Group__0__Impl3264);
					after(grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_0());

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

	// $ANTLR end "rule__ModifiersRule__Group__0__Impl"


	// $ANTLR start "rule__ModifiersRule__Group__1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1585:1: rule__ModifiersRule__Group__1 : rule__ModifiersRule__Group__1__Impl
	// rule__ModifiersRule__Group__2 ;
	public final void rule__ModifiersRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1589:1: ( rule__ModifiersRule__Group__1__Impl rule__ModifiersRule__Group__2 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1590:2: rule__ModifiersRule__Group__1__Impl rule__ModifiersRule__Group__2
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group__1__Impl_in_rule__ModifiersRule__Group__13295);
				rule__ModifiersRule__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group__2_in_rule__ModifiersRule__Group__13298);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1597:1: rule__ModifiersRule__Group__1__Impl : ( ( rule__ModifiersRule__ValuesAssignment_1 ) ) ;
	public final void rule__ModifiersRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1601:1: ( ( ( rule__ModifiersRule__ValuesAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1602:1: ( ( rule__ModifiersRule__ValuesAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1602:1: ( ( rule__ModifiersRule__ValuesAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1603:1: ( rule__ModifiersRule__ValuesAssignment_1 )
				{
					before(grammarAccess.getModifiersRuleAccess().getValuesAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1604:1: ( rule__ModifiersRule__ValuesAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1604:2: rule__ModifiersRule__ValuesAssignment_1
					{
						pushFollow(FOLLOW_rule__ModifiersRule__ValuesAssignment_1_in_rule__ModifiersRule__Group__1__Impl3325);
						rule__ModifiersRule__ValuesAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getModifiersRuleAccess().getValuesAssignment_1());

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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1614:1: rule__ModifiersRule__Group__2 : rule__ModifiersRule__Group__2__Impl
	// rule__ModifiersRule__Group__3 ;
	public final void rule__ModifiersRule__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1618:1: ( rule__ModifiersRule__Group__2__Impl rule__ModifiersRule__Group__3 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1619:2: rule__ModifiersRule__Group__2__Impl rule__ModifiersRule__Group__3
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group__2__Impl_in_rule__ModifiersRule__Group__23355);
				rule__ModifiersRule__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group__3_in_rule__ModifiersRule__Group__23358);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1626:1: rule__ModifiersRule__Group__2__Impl : ( ( rule__ModifiersRule__Group_2__0 )* ) ;
	public final void rule__ModifiersRule__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1630:1: ( ( ( rule__ModifiersRule__Group_2__0 )* ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1631:1: ( ( rule__ModifiersRule__Group_2__0 )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1631:1: ( ( rule__ModifiersRule__Group_2__0 )* )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1632:1: ( rule__ModifiersRule__Group_2__0 )*
				{
					before(grammarAccess.getModifiersRuleAccess().getGroup_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1633:1: ( rule__ModifiersRule__Group_2__0 )*
					loop19: do {
						int alt19 = 2;
						int LA19_0 = input.LA(1);

						if ((LA19_0 == 30)) {
							alt19 = 1;
						}


						switch (alt19) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1633:2: rule__ModifiersRule__Group_2__0
						{
							pushFollow(FOLLOW_rule__ModifiersRule__Group_2__0_in_rule__ModifiersRule__Group__2__Impl3385);
							rule__ModifiersRule__Group_2__0();

							state._fsp--;


						}
							break;

						default:
							break loop19;
						}
					} while (true);

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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1643:1: rule__ModifiersRule__Group__3 : rule__ModifiersRule__Group__3__Impl ;
	public final void rule__ModifiersRule__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1647:1: ( rule__ModifiersRule__Group__3__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1648:2: rule__ModifiersRule__Group__3__Impl
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group__3__Impl_in_rule__ModifiersRule__Group__33416);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1654:1: rule__ModifiersRule__Group__3__Impl : ( '}' ) ;
	public final void rule__ModifiersRule__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1658:1: ( ( '}' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1659:1: ( '}' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1659:1: ( '}' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1660:1: '}'
				{
					before(grammarAccess.getModifiersRuleAccess().getRightCurlyBracketKeyword_3());
					match(input, 29, FOLLOW_29_in_rule__ModifiersRule__Group__3__Impl3444);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1681:1: rule__ModifiersRule__Group_2__0 : rule__ModifiersRule__Group_2__0__Impl
	// rule__ModifiersRule__Group_2__1 ;
	public final void rule__ModifiersRule__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1685:1: ( rule__ModifiersRule__Group_2__0__Impl rule__ModifiersRule__Group_2__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1686:2: rule__ModifiersRule__Group_2__0__Impl rule__ModifiersRule__Group_2__1
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group_2__0__Impl_in_rule__ModifiersRule__Group_2__03483);
				rule__ModifiersRule__Group_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__ModifiersRule__Group_2__1_in_rule__ModifiersRule__Group_2__03486);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1693:1: rule__ModifiersRule__Group_2__0__Impl : ( ',' ) ;
	public final void rule__ModifiersRule__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1697:1: ( ( ',' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1698:1: ( ',' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1698:1: ( ',' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1699:1: ','
				{
					before(grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_0());
					match(input, 30, FOLLOW_30_in_rule__ModifiersRule__Group_2__0__Impl3514);
					after(grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_0());

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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1712:1: rule__ModifiersRule__Group_2__1 : rule__ModifiersRule__Group_2__1__Impl ;
	public final void rule__ModifiersRule__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1716:1: ( rule__ModifiersRule__Group_2__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1717:2: rule__ModifiersRule__Group_2__1__Impl
			{
				pushFollow(FOLLOW_rule__ModifiersRule__Group_2__1__Impl_in_rule__ModifiersRule__Group_2__13545);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1723:1: rule__ModifiersRule__Group_2__1__Impl : ( ( rule__ModifiersRule__ValuesAssignment_2_1 ) ) ;
	public final void rule__ModifiersRule__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1727:1: ( ( ( rule__ModifiersRule__ValuesAssignment_2_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1728:1: ( ( rule__ModifiersRule__ValuesAssignment_2_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1728:1: ( ( rule__ModifiersRule__ValuesAssignment_2_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1729:1: ( rule__ModifiersRule__ValuesAssignment_2_1 )
				{
					before(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1730:1: ( rule__ModifiersRule__ValuesAssignment_2_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1730:2: rule__ModifiersRule__ValuesAssignment_2_1
					{
						pushFollow(FOLLOW_rule__ModifiersRule__ValuesAssignment_2_1_in_rule__ModifiersRule__Group_2__1__Impl3572);
						rule__ModifiersRule__ValuesAssignment_2_1();

						state._fsp--;


					}

					after(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_1());

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


	// $ANTLR start "rule__RedefinesRule__Group__0"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1744:1: rule__RedefinesRule__Group__0 : rule__RedefinesRule__Group__0__Impl
	// rule__RedefinesRule__Group__1 ;
	public final void rule__RedefinesRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1748:1: ( rule__RedefinesRule__Group__0__Impl rule__RedefinesRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1749:2: rule__RedefinesRule__Group__0__Impl rule__RedefinesRule__Group__1
			{
				pushFollow(FOLLOW_rule__RedefinesRule__Group__0__Impl_in_rule__RedefinesRule__Group__03606);
				rule__RedefinesRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RedefinesRule__Group__1_in_rule__RedefinesRule__Group__03609);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1756:1: rule__RedefinesRule__Group__0__Impl : ( 'redefines' ) ;
	public final void rule__RedefinesRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1760:1: ( ( 'redefines' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1761:1: ( 'redefines' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1761:1: ( 'redefines' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1762:1: 'redefines'
				{
					before(grammarAccess.getRedefinesRuleAccess().getRedefinesKeyword_0());
					match(input, 31, FOLLOW_31_in_rule__RedefinesRule__Group__0__Impl3637);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1775:1: rule__RedefinesRule__Group__1 : rule__RedefinesRule__Group__1__Impl ;
	public final void rule__RedefinesRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1779:1: ( rule__RedefinesRule__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1780:2: rule__RedefinesRule__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__RedefinesRule__Group__1__Impl_in_rule__RedefinesRule__Group__13668);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1786:1: rule__RedefinesRule__Group__1__Impl : ( ( rule__RedefinesRule__PortAssignment_1 ) ) ;
	public final void rule__RedefinesRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1790:1: ( ( ( rule__RedefinesRule__PortAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1791:1: ( ( rule__RedefinesRule__PortAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1791:1: ( ( rule__RedefinesRule__PortAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1792:1: ( rule__RedefinesRule__PortAssignment_1 )
				{
					before(grammarAccess.getRedefinesRuleAccess().getPortAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1793:1: ( rule__RedefinesRule__PortAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1793:2: rule__RedefinesRule__PortAssignment_1
					{
						pushFollow(FOLLOW_rule__RedefinesRule__PortAssignment_1_in_rule__RedefinesRule__Group__1__Impl3695);
						rule__RedefinesRule__PortAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getRedefinesRuleAccess().getPortAssignment_1());

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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1807:1: rule__SubsetsRule__Group__0 : rule__SubsetsRule__Group__0__Impl rule__SubsetsRule__Group__1 ;
	public final void rule__SubsetsRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1811:1: ( rule__SubsetsRule__Group__0__Impl rule__SubsetsRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1812:2: rule__SubsetsRule__Group__0__Impl rule__SubsetsRule__Group__1
			{
				pushFollow(FOLLOW_rule__SubsetsRule__Group__0__Impl_in_rule__SubsetsRule__Group__03729);
				rule__SubsetsRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__SubsetsRule__Group__1_in_rule__SubsetsRule__Group__03732);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1819:1: rule__SubsetsRule__Group__0__Impl : ( 'subsets' ) ;
	public final void rule__SubsetsRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1823:1: ( ( 'subsets' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1824:1: ( 'subsets' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1824:1: ( 'subsets' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1825:1: 'subsets'
				{
					before(grammarAccess.getSubsetsRuleAccess().getSubsetsKeyword_0());
					match(input, 32, FOLLOW_32_in_rule__SubsetsRule__Group__0__Impl3760);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1838:1: rule__SubsetsRule__Group__1 : rule__SubsetsRule__Group__1__Impl ;
	public final void rule__SubsetsRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1842:1: ( rule__SubsetsRule__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1843:2: rule__SubsetsRule__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__SubsetsRule__Group__1__Impl_in_rule__SubsetsRule__Group__13791);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1849:1: rule__SubsetsRule__Group__1__Impl : ( ( rule__SubsetsRule__PortAssignment_1 ) ) ;
	public final void rule__SubsetsRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1853:1: ( ( ( rule__SubsetsRule__PortAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1854:1: ( ( rule__SubsetsRule__PortAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1854:1: ( ( rule__SubsetsRule__PortAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1855:1: ( rule__SubsetsRule__PortAssignment_1 )
				{
					before(grammarAccess.getSubsetsRuleAccess().getPortAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1856:1: ( rule__SubsetsRule__PortAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1856:2: rule__SubsetsRule__PortAssignment_1
					{
						pushFollow(FOLLOW_rule__SubsetsRule__PortAssignment_1_in_rule__SubsetsRule__Group__1__Impl3818);
						rule__SubsetsRule__PortAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getSubsetsRuleAccess().getPortAssignment_1());

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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1870:1: rule__DefaultValueRule__Group__0 : rule__DefaultValueRule__Group__0__Impl
	// rule__DefaultValueRule__Group__1 ;
	public final void rule__DefaultValueRule__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1874:1: ( rule__DefaultValueRule__Group__0__Impl rule__DefaultValueRule__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1875:2: rule__DefaultValueRule__Group__0__Impl rule__DefaultValueRule__Group__1
			{
				pushFollow(FOLLOW_rule__DefaultValueRule__Group__0__Impl_in_rule__DefaultValueRule__Group__03852);
				rule__DefaultValueRule__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__DefaultValueRule__Group__1_in_rule__DefaultValueRule__Group__03855);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1882:1: rule__DefaultValueRule__Group__0__Impl : ( '=' ) ;
	public final void rule__DefaultValueRule__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1886:1: ( ( '=' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1887:1: ( '=' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1887:1: ( '=' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1888:1: '='
				{
					before(grammarAccess.getDefaultValueRuleAccess().getEqualsSignKeyword_0());
					match(input, 33, FOLLOW_33_in_rule__DefaultValueRule__Group__0__Impl3883);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1901:1: rule__DefaultValueRule__Group__1 : rule__DefaultValueRule__Group__1__Impl ;
	public final void rule__DefaultValueRule__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1905:1: ( rule__DefaultValueRule__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1906:2: rule__DefaultValueRule__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__DefaultValueRule__Group__1__Impl_in_rule__DefaultValueRule__Group__13914);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1912:1: rule__DefaultValueRule__Group__1__Impl : ( ( rule__DefaultValueRule__DefaultAssignment_1 ) )
	// ;
	public final void rule__DefaultValueRule__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1916:1: ( ( ( rule__DefaultValueRule__DefaultAssignment_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1917:1: ( ( rule__DefaultValueRule__DefaultAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1917:1: ( ( rule__DefaultValueRule__DefaultAssignment_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1918:1: ( rule__DefaultValueRule__DefaultAssignment_1 )
				{
					before(grammarAccess.getDefaultValueRuleAccess().getDefaultAssignment_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1919:1: ( rule__DefaultValueRule__DefaultAssignment_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1919:2: rule__DefaultValueRule__DefaultAssignment_1
					{
						pushFollow(FOLLOW_rule__DefaultValueRule__DefaultAssignment_1_in_rule__DefaultValueRule__Group__1__Impl3941);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1933:1: rule__RealValue__Group_0__0 : rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 ;
	public final void rule__RealValue__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1937:1: ( rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1938:2: rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1
			{
				pushFollow(FOLLOW_rule__RealValue__Group_0__0__Impl_in_rule__RealValue__Group_0__03975);
				rule__RealValue__Group_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RealValue__Group_0__1_in_rule__RealValue__Group_0__03978);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1945:1: rule__RealValue__Group_0__0__Impl : ( ( rule__RealValue__IntegerAssignment_0_0 ) ) ;
	public final void rule__RealValue__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1949:1: ( ( ( rule__RealValue__IntegerAssignment_0_0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1950:1: ( ( rule__RealValue__IntegerAssignment_0_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1950:1: ( ( rule__RealValue__IntegerAssignment_0_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1951:1: ( rule__RealValue__IntegerAssignment_0_0 )
				{
					before(grammarAccess.getRealValueAccess().getIntegerAssignment_0_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1952:1: ( rule__RealValue__IntegerAssignment_0_0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1952:2: rule__RealValue__IntegerAssignment_0_0
					{
						pushFollow(FOLLOW_rule__RealValue__IntegerAssignment_0_0_in_rule__RealValue__Group_0__0__Impl4005);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1962:1: rule__RealValue__Group_0__1 : rule__RealValue__Group_0__1__Impl ;
	public final void rule__RealValue__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1966:1: ( rule__RealValue__Group_0__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1967:2: rule__RealValue__Group_0__1__Impl
			{
				pushFollow(FOLLOW_rule__RealValue__Group_0__1__Impl_in_rule__RealValue__Group_0__14035);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1973:1: rule__RealValue__Group_0__1__Impl : ( '.' ) ;
	public final void rule__RealValue__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1977:1: ( ( '.' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1978:1: ( '.' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1978:1: ( '.' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1979:1: '.'
				{
					before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
					match(input, 34, FOLLOW_34_in_rule__RealValue__Group_0__1__Impl4063);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:1996:1: rule__RealValue__Group_1__0 : rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 ;
	public final void rule__RealValue__Group_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2000:1: ( rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2001:2: rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1
			{
				pushFollow(FOLLOW_rule__RealValue__Group_1__0__Impl_in_rule__RealValue__Group_1__04098);
				rule__RealValue__Group_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RealValue__Group_1__1_in_rule__RealValue__Group_1__04101);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2008:1: rule__RealValue__Group_1__0__Impl : ( '.' ) ;
	public final void rule__RealValue__Group_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2012:1: ( ( '.' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2013:1: ( '.' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2013:1: ( '.' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2014:1: '.'
				{
					before(grammarAccess.getRealValueAccess().getFullStopKeyword_1_0());
					match(input, 34, FOLLOW_34_in_rule__RealValue__Group_1__0__Impl4129);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2027:1: rule__RealValue__Group_1__1 : rule__RealValue__Group_1__1__Impl ;
	public final void rule__RealValue__Group_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2031:1: ( rule__RealValue__Group_1__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2032:2: rule__RealValue__Group_1__1__Impl
			{
				pushFollow(FOLLOW_rule__RealValue__Group_1__1__Impl_in_rule__RealValue__Group_1__14160);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2038:1: rule__RealValue__Group_1__1__Impl : ( ( rule__RealValue__FractionAssignment_1_1 ) ) ;
	public final void rule__RealValue__Group_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2042:1: ( ( ( rule__RealValue__FractionAssignment_1_1 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2043:1: ( ( rule__RealValue__FractionAssignment_1_1 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2043:1: ( ( rule__RealValue__FractionAssignment_1_1 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2044:1: ( rule__RealValue__FractionAssignment_1_1 )
				{
					before(grammarAccess.getRealValueAccess().getFractionAssignment_1_1());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2045:1: ( rule__RealValue__FractionAssignment_1_1 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2045:2: rule__RealValue__FractionAssignment_1_1
					{
						pushFollow(FOLLOW_rule__RealValue__FractionAssignment_1_1_in_rule__RealValue__Group_1__1__Impl4187);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2059:1: rule__RealValue__Group_2__0 : rule__RealValue__Group_2__0__Impl rule__RealValue__Group_2__1 ;
	public final void rule__RealValue__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2063:1: ( rule__RealValue__Group_2__0__Impl rule__RealValue__Group_2__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2064:2: rule__RealValue__Group_2__0__Impl rule__RealValue__Group_2__1
			{
				pushFollow(FOLLOW_rule__RealValue__Group_2__0__Impl_in_rule__RealValue__Group_2__04221);
				rule__RealValue__Group_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RealValue__Group_2__1_in_rule__RealValue__Group_2__04224);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2071:1: rule__RealValue__Group_2__0__Impl : ( ( rule__RealValue__IntegerAssignment_2_0 ) ) ;
	public final void rule__RealValue__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2075:1: ( ( ( rule__RealValue__IntegerAssignment_2_0 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2076:1: ( ( rule__RealValue__IntegerAssignment_2_0 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2076:1: ( ( rule__RealValue__IntegerAssignment_2_0 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2077:1: ( rule__RealValue__IntegerAssignment_2_0 )
				{
					before(grammarAccess.getRealValueAccess().getIntegerAssignment_2_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2078:1: ( rule__RealValue__IntegerAssignment_2_0 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2078:2: rule__RealValue__IntegerAssignment_2_0
					{
						pushFollow(FOLLOW_rule__RealValue__IntegerAssignment_2_0_in_rule__RealValue__Group_2__0__Impl4251);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2088:1: rule__RealValue__Group_2__1 : rule__RealValue__Group_2__1__Impl rule__RealValue__Group_2__2 ;
	public final void rule__RealValue__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2092:1: ( rule__RealValue__Group_2__1__Impl rule__RealValue__Group_2__2 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2093:2: rule__RealValue__Group_2__1__Impl rule__RealValue__Group_2__2
			{
				pushFollow(FOLLOW_rule__RealValue__Group_2__1__Impl_in_rule__RealValue__Group_2__14281);
				rule__RealValue__Group_2__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__RealValue__Group_2__2_in_rule__RealValue__Group_2__14284);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2100:1: rule__RealValue__Group_2__1__Impl : ( '.' ) ;
	public final void rule__RealValue__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2104:1: ( ( '.' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2105:1: ( '.' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2105:1: ( '.' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2106:1: '.'
				{
					before(grammarAccess.getRealValueAccess().getFullStopKeyword_2_1());
					match(input, 34, FOLLOW_34_in_rule__RealValue__Group_2__1__Impl4312);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2119:1: rule__RealValue__Group_2__2 : rule__RealValue__Group_2__2__Impl ;
	public final void rule__RealValue__Group_2__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2123:1: ( rule__RealValue__Group_2__2__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2124:2: rule__RealValue__Group_2__2__Impl
			{
				pushFollow(FOLLOW_rule__RealValue__Group_2__2__Impl_in_rule__RealValue__Group_2__24343);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2130:1: rule__RealValue__Group_2__2__Impl : ( ( rule__RealValue__FractionAssignment_2_2 ) ) ;
	public final void rule__RealValue__Group_2__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2134:1: ( ( ( rule__RealValue__FractionAssignment_2_2 ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2135:1: ( ( rule__RealValue__FractionAssignment_2_2 ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2135:1: ( ( rule__RealValue__FractionAssignment_2_2 ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2136:1: ( rule__RealValue__FractionAssignment_2_2 )
				{
					before(grammarAccess.getRealValueAccess().getFractionAssignment_2_2());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2137:1: ( rule__RealValue__FractionAssignment_2_2 )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2137:2: rule__RealValue__FractionAssignment_2_2
					{
						pushFollow(FOLLOW_rule__RealValue__FractionAssignment_2_2_in_rule__RealValue__Group_2__2__Impl4370);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2153:1: rule__NullValue__Group__0 : rule__NullValue__Group__0__Impl rule__NullValue__Group__1 ;
	public final void rule__NullValue__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2157:1: ( rule__NullValue__Group__0__Impl rule__NullValue__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2158:2: rule__NullValue__Group__0__Impl rule__NullValue__Group__1
			{
				pushFollow(FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__04406);
				rule__NullValue__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__04409);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2165:1: rule__NullValue__Group__0__Impl : ( () ) ;
	public final void rule__NullValue__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2169:1: ( ( () ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2170:1: ( () )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2170:1: ( () )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2171:1: ()
				{
					before(grammarAccess.getNullValueAccess().getNullValueAction_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2172:1: ()
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2174:1:
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2184:1: rule__NullValue__Group__1 : rule__NullValue__Group__1__Impl ;
	public final void rule__NullValue__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2188:1: ( rule__NullValue__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2189:2: rule__NullValue__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__14467);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2195:1: rule__NullValue__Group__1__Impl : ( 'null' ) ;
	public final void rule__NullValue__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2199:1: ( ( 'null' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2200:1: ( 'null' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2200:1: ( 'null' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2201:1: 'null'
				{
					before(grammarAccess.getNullValueAccess().getNullKeyword_1());
					match(input, 35, FOLLOW_35_in_rule__NullValue__Group__1__Impl4495);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2218:1: rule__NoValue__Group__0 : rule__NoValue__Group__0__Impl rule__NoValue__Group__1 ;
	public final void rule__NoValue__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2222:1: ( rule__NoValue__Group__0__Impl rule__NoValue__Group__1 )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2223:2: rule__NoValue__Group__0__Impl rule__NoValue__Group__1
			{
				pushFollow(FOLLOW_rule__NoValue__Group__0__Impl_in_rule__NoValue__Group__04530);
				rule__NoValue__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__NoValue__Group__1_in_rule__NoValue__Group__04533);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2230:1: rule__NoValue__Group__0__Impl : ( () ) ;
	public final void rule__NoValue__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2234:1: ( ( () ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2235:1: ( () )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2235:1: ( () )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2236:1: ()
				{
					before(grammarAccess.getNoValueAccess().getNoValueAction_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2237:1: ()
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2239:1:
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2249:1: rule__NoValue__Group__1 : rule__NoValue__Group__1__Impl ;
	public final void rule__NoValue__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2253:1: ( rule__NoValue__Group__1__Impl )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2254:2: rule__NoValue__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__NoValue__Group__1__Impl_in_rule__NoValue__Group__14591);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2260:1: rule__NoValue__Group__1__Impl : ( 'none' ) ;
	public final void rule__NoValue__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2264:1: ( ( 'none' ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2265:1: ( 'none' )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2265:1: ( 'none' )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2266:1: 'none'
				{
					before(grammarAccess.getNoValueAccess().getNoneKeyword_1());
					match(input, 36, FOLLOW_36_in_rule__NoValue__Group__1__Impl4619);
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


	// $ANTLR start "rule__PortRule__VisibilityAssignment_0"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2284:1: rule__PortRule__VisibilityAssignment_0 : ( ruleVisibilityRule ) ;
	public final void rule__PortRule__VisibilityAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2288:1: ( ( ruleVisibilityRule ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2289:1: ( ruleVisibilityRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2289:1: ( ruleVisibilityRule )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2290:1: ruleVisibilityRule
				{
					before(grammarAccess.getPortRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleVisibilityRule_in_rule__PortRule__VisibilityAssignment_04659);
					ruleVisibilityRule();

					state._fsp--;

					after(grammarAccess.getPortRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0());

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

	// $ANTLR end "rule__PortRule__VisibilityAssignment_0"


	// $ANTLR start "rule__PortRule__DerivedAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2299:1: rule__PortRule__DerivedAssignment_1 : ( ( '/' ) ) ;
	public final void rule__PortRule__DerivedAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2303:1: ( ( ( '/' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2304:1: ( ( '/' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2304:1: ( ( '/' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2305:1: ( '/' )
				{
					before(grammarAccess.getPortRuleAccess().getDerivedSolidusKeyword_1_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2306:1: ( '/' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2307:1: '/'
					{
						before(grammarAccess.getPortRuleAccess().getDerivedSolidusKeyword_1_0());
						match(input, 37, FOLLOW_37_in_rule__PortRule__DerivedAssignment_14695);
						after(grammarAccess.getPortRuleAccess().getDerivedSolidusKeyword_1_0());

					}

					after(grammarAccess.getPortRuleAccess().getDerivedSolidusKeyword_1_0());

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

	// $ANTLR end "rule__PortRule__DerivedAssignment_1"


	// $ANTLR start "rule__PortRule__NameAssignment_2"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2322:1: rule__PortRule__NameAssignment_2 : ( RULE_ID ) ;
	public final void rule__PortRule__NameAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2326:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2327:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2327:1: ( RULE_ID )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2328:1: RULE_ID
				{
					before(grammarAccess.getPortRuleAccess().getNameIDTerminalRuleCall_2_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__PortRule__NameAssignment_24734);
					after(grammarAccess.getPortRuleAccess().getNameIDTerminalRuleCall_2_0());

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

	// $ANTLR end "rule__PortRule__NameAssignment_2"


	// $ANTLR start "rule__PortRule__ConjugatedAssignment_3_1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2337:1: rule__PortRule__ConjugatedAssignment_3_1 : ( ( '~' ) ) ;
	public final void rule__PortRule__ConjugatedAssignment_3_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2341:1: ( ( ( '~' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2342:1: ( ( '~' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2342:1: ( ( '~' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2343:1: ( '~' )
				{
					before(grammarAccess.getPortRuleAccess().getConjugatedTildeKeyword_3_1_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2344:1: ( '~' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2345:1: '~'
					{
						before(grammarAccess.getPortRuleAccess().getConjugatedTildeKeyword_3_1_0());
						match(input, 16, FOLLOW_16_in_rule__PortRule__ConjugatedAssignment_3_14770);
						after(grammarAccess.getPortRuleAccess().getConjugatedTildeKeyword_3_1_0());

					}

					after(grammarAccess.getPortRuleAccess().getConjugatedTildeKeyword_3_1_0());

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

	// $ANTLR end "rule__PortRule__ConjugatedAssignment_3_1"


	// $ANTLR start "rule__PortRule__TypeAssignment_3_2_0"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2360:1: rule__PortRule__TypeAssignment_3_2_0 : ( ruleTypeRule ) ;
	public final void rule__PortRule__TypeAssignment_3_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2364:1: ( ( ruleTypeRule ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2365:1: ( ruleTypeRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2365:1: ( ruleTypeRule )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2366:1: ruleTypeRule
				{
					before(grammarAccess.getPortRuleAccess().getTypeTypeRuleParserRuleCall_3_2_0_0());
					pushFollow(FOLLOW_ruleTypeRule_in_rule__PortRule__TypeAssignment_3_2_04809);
					ruleTypeRule();

					state._fsp--;

					after(grammarAccess.getPortRuleAccess().getTypeTypeRuleParserRuleCall_3_2_0_0());

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

	// $ANTLR end "rule__PortRule__TypeAssignment_3_2_0"


	// $ANTLR start "rule__PortRule__TypeUndefinedAssignment_3_2_1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2375:1: rule__PortRule__TypeUndefinedAssignment_3_2_1 : ( ( '<Undefined>' ) ) ;
	public final void rule__PortRule__TypeUndefinedAssignment_3_2_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2379:1: ( ( ( '<Undefined>' ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2380:1: ( ( '<Undefined>' ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2380:1: ( ( '<Undefined>' ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2381:1: ( '<Undefined>' )
				{
					before(grammarAccess.getPortRuleAccess().getTypeUndefinedUndefinedKeyword_3_2_1_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2382:1: ( '<Undefined>' )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2383:1: '<Undefined>'
					{
						before(grammarAccess.getPortRuleAccess().getTypeUndefinedUndefinedKeyword_3_2_1_0());
						match(input, 38, FOLLOW_38_in_rule__PortRule__TypeUndefinedAssignment_3_2_14845);
						after(grammarAccess.getPortRuleAccess().getTypeUndefinedUndefinedKeyword_3_2_1_0());

					}

					after(grammarAccess.getPortRuleAccess().getTypeUndefinedUndefinedKeyword_3_2_1_0());

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

	// $ANTLR end "rule__PortRule__TypeUndefinedAssignment_3_2_1"


	// $ANTLR start "rule__PortRule__MultiplicityAssignment_4"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2398:1: rule__PortRule__MultiplicityAssignment_4 : ( ruleMultiplicityRule ) ;
	public final void rule__PortRule__MultiplicityAssignment_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2402:1: ( ( ruleMultiplicityRule ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2403:1: ( ruleMultiplicityRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2403:1: ( ruleMultiplicityRule )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2404:1: ruleMultiplicityRule
				{
					before(grammarAccess.getPortRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0());
					pushFollow(FOLLOW_ruleMultiplicityRule_in_rule__PortRule__MultiplicityAssignment_44884);
					ruleMultiplicityRule();

					state._fsp--;

					after(grammarAccess.getPortRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0());

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

	// $ANTLR end "rule__PortRule__MultiplicityAssignment_4"


	// $ANTLR start "rule__PortRule__ModifiersAssignment_5"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2413:1: rule__PortRule__ModifiersAssignment_5 : ( ruleModifiersRule ) ;
	public final void rule__PortRule__ModifiersAssignment_5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2417:1: ( ( ruleModifiersRule ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2418:1: ( ruleModifiersRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2418:1: ( ruleModifiersRule )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2419:1: ruleModifiersRule
				{
					before(grammarAccess.getPortRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0());
					pushFollow(FOLLOW_ruleModifiersRule_in_rule__PortRule__ModifiersAssignment_54915);
					ruleModifiersRule();

					state._fsp--;

					after(grammarAccess.getPortRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0());

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

	// $ANTLR end "rule__PortRule__ModifiersAssignment_5"


	// $ANTLR start "rule__PortRule__DefaultAssignment_6"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2428:1: rule__PortRule__DefaultAssignment_6 : ( ruleDefaultValueRule ) ;
	public final void rule__PortRule__DefaultAssignment_6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2432:1: ( ( ruleDefaultValueRule ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2433:1: ( ruleDefaultValueRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2433:1: ( ruleDefaultValueRule )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2434:1: ruleDefaultValueRule
				{
					before(grammarAccess.getPortRuleAccess().getDefaultDefaultValueRuleParserRuleCall_6_0());
					pushFollow(FOLLOW_ruleDefaultValueRule_in_rule__PortRule__DefaultAssignment_64946);
					ruleDefaultValueRule();

					state._fsp--;

					after(grammarAccess.getPortRuleAccess().getDefaultDefaultValueRuleParserRuleCall_6_0());

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

	// $ANTLR end "rule__PortRule__DefaultAssignment_6"


	// $ANTLR start "rule__VisibilityRule__VisibilityAssignment"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2443:1: rule__VisibilityRule__VisibilityAssignment : ( ruleVisibilityKind ) ;
	public final void rule__VisibilityRule__VisibilityAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2447:1: ( ( ruleVisibilityKind ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2448:1: ( ruleVisibilityKind )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2448:1: ( ruleVisibilityKind )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2449:1: ruleVisibilityKind
				{
					before(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0());
					pushFollow(FOLLOW_ruleVisibilityKind_in_rule__VisibilityRule__VisibilityAssignment4977);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2458:1: rule__TypeRule__PathAssignment_0 : ( ruleQualifiedName ) ;
	public final void rule__TypeRule__PathAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2462:1: ( ( ruleQualifiedName ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2463:1: ( ruleQualifiedName )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2463:1: ( ruleQualifiedName )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2464:1: ruleQualifiedName
				{
					before(grammarAccess.getTypeRuleAccess().getPathQualifiedNameParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRule__PathAssignment_05008);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2473:1: rule__TypeRule__TypeAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__TypeRule__TypeAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2477:1: ( ( ( RULE_ID ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2478:1: ( ( RULE_ID ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2478:1: ( ( RULE_ID ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2479:1: ( RULE_ID )
				{
					before(grammarAccess.getTypeRuleAccess().getTypeClassifierCrossReference_1_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2480:1: ( RULE_ID )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2481:1: RULE_ID
					{
						before(grammarAccess.getTypeRuleAccess().getTypeClassifierIDTerminalRuleCall_1_0_1());
						match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__TypeRule__TypeAssignment_15043);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2492:1: rule__QualifiedName__PathAssignment_0 : ( ( RULE_ID ) ) ;
	public final void rule__QualifiedName__PathAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2496:1: ( ( ( RULE_ID ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2497:1: ( ( RULE_ID ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2497:1: ( ( RULE_ID ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2498:1: ( RULE_ID )
				{
					before(grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2499:1: ( RULE_ID )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2500:1: RULE_ID
					{
						before(grammarAccess.getQualifiedNameAccess().getPathNamespaceIDTerminalRuleCall_0_0_1());
						match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__QualifiedName__PathAssignment_05082);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2511:1: rule__QualifiedName__RemainingAssignment_2 : ( ruleQualifiedName ) ;
	public final void rule__QualifiedName__RemainingAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2515:1: ( ( ruleQualifiedName ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2516:1: ( ruleQualifiedName )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2516:1: ( ruleQualifiedName )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2517:1: ruleQualifiedName
				{
					before(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0());
					pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedName__RemainingAssignment_25117);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2526:1: rule__MultiplicityRule__BoundsAssignment_1 : ( ruleBoundSpecification ) ;
	public final void rule__MultiplicityRule__BoundsAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2530:1: ( ( ruleBoundSpecification ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2531:1: ( ruleBoundSpecification )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2531:1: ( ruleBoundSpecification )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2532:1: ruleBoundSpecification
				{
					before(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_15148);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2541:1: rule__MultiplicityRule__BoundsAssignment_2_1 : ( ruleBoundSpecification ) ;
	public final void rule__MultiplicityRule__BoundsAssignment_2_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2545:1: ( ( ruleBoundSpecification ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2546:1: ( ruleBoundSpecification )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2546:1: ( ruleBoundSpecification )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2547:1: ruleBoundSpecification
				{
					before(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_2_1_0());
					pushFollow(FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_2_15179);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2556:1: rule__BoundSpecification__ValueAssignment : ( ruleUnlimitedLiteral ) ;
	public final void rule__BoundSpecification__ValueAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2560:1: ( ( ruleUnlimitedLiteral ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2561:1: ( ruleUnlimitedLiteral )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2561:1: ( ruleUnlimitedLiteral )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2562:1: ruleUnlimitedLiteral
				{
					before(grammarAccess.getBoundSpecificationAccess().getValueUnlimitedLiteralParserRuleCall_0());
					pushFollow(FOLLOW_ruleUnlimitedLiteral_in_rule__BoundSpecification__ValueAssignment5210);
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


	// $ANTLR start "rule__ModifiersRule__ValuesAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2571:1: rule__ModifiersRule__ValuesAssignment_1 : ( ruleModifierSpecification ) ;
	public final void rule__ModifiersRule__ValuesAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2575:1: ( ( ruleModifierSpecification ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2576:1: ( ruleModifierSpecification )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2576:1: ( ruleModifierSpecification )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2577:1: ruleModifierSpecification
				{
					before(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_15241);
					ruleModifierSpecification();

					state._fsp--;

					after(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_1_0());

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

	// $ANTLR end "rule__ModifiersRule__ValuesAssignment_1"


	// $ANTLR start "rule__ModifiersRule__ValuesAssignment_2_1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2586:1: rule__ModifiersRule__ValuesAssignment_2_1 : ( ruleModifierSpecification ) ;
	public final void rule__ModifiersRule__ValuesAssignment_2_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2590:1: ( ( ruleModifierSpecification ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2591:1: ( ruleModifierSpecification )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2591:1: ( ruleModifierSpecification )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2592:1: ruleModifierSpecification
				{
					before(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_0());
					pushFollow(FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_15272);
					ruleModifierSpecification();

					state._fsp--;

					after(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_0());

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

	// $ANTLR end "rule__ModifiersRule__ValuesAssignment_2_1"


	// $ANTLR start "rule__ModifierSpecification__ValueAssignment_0"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2601:1: rule__ModifierSpecification__ValueAssignment_0 : ( ruleModifierKind ) ;
	public final void rule__ModifierSpecification__ValueAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2605:1: ( ( ruleModifierKind ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2606:1: ( ruleModifierKind )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2606:1: ( ruleModifierKind )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2607:1: ruleModifierKind
				{
					before(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0_0());
					pushFollow(FOLLOW_ruleModifierKind_in_rule__ModifierSpecification__ValueAssignment_05303);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2616:1: rule__ModifierSpecification__RedefinesAssignment_1 : ( ruleRedefinesRule ) ;
	public final void rule__ModifierSpecification__RedefinesAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2620:1: ( ( ruleRedefinesRule ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2621:1: ( ruleRedefinesRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2621:1: ( ruleRedefinesRule )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2622:1: ruleRedefinesRule
				{
					before(grammarAccess.getModifierSpecificationAccess().getRedefinesRedefinesRuleParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleRedefinesRule_in_rule__ModifierSpecification__RedefinesAssignment_15334);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2631:1: rule__ModifierSpecification__SubsetsAssignment_2 : ( ruleSubsetsRule ) ;
	public final void rule__ModifierSpecification__SubsetsAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2635:1: ( ( ruleSubsetsRule ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2636:1: ( ruleSubsetsRule )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2636:1: ( ruleSubsetsRule )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2637:1: ruleSubsetsRule
				{
					before(grammarAccess.getModifierSpecificationAccess().getSubsetsSubsetsRuleParserRuleCall_2_0());
					pushFollow(FOLLOW_ruleSubsetsRule_in_rule__ModifierSpecification__SubsetsAssignment_25365);
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


	// $ANTLR start "rule__RedefinesRule__PortAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2646:1: rule__RedefinesRule__PortAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__RedefinesRule__PortAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2650:1: ( ( ( RULE_ID ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2651:1: ( ( RULE_ID ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2651:1: ( ( RULE_ID ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2652:1: ( RULE_ID )
				{
					before(grammarAccess.getRedefinesRuleAccess().getPortPortCrossReference_1_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2653:1: ( RULE_ID )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2654:1: RULE_ID
					{
						before(grammarAccess.getRedefinesRuleAccess().getPortPortIDTerminalRuleCall_1_0_1());
						match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__RedefinesRule__PortAssignment_15400);
						after(grammarAccess.getRedefinesRuleAccess().getPortPortIDTerminalRuleCall_1_0_1());

					}

					after(grammarAccess.getRedefinesRuleAccess().getPortPortCrossReference_1_0());

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

	// $ANTLR end "rule__RedefinesRule__PortAssignment_1"


	// $ANTLR start "rule__SubsetsRule__PortAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2665:1: rule__SubsetsRule__PortAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__SubsetsRule__PortAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2669:1: ( ( ( RULE_ID ) ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2670:1: ( ( RULE_ID ) )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2670:1: ( ( RULE_ID ) )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2671:1: ( RULE_ID )
				{
					before(grammarAccess.getSubsetsRuleAccess().getPortPortCrossReference_1_0());
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2672:1: ( RULE_ID )
					// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2673:1: RULE_ID
					{
						before(grammarAccess.getSubsetsRuleAccess().getPortPortIDTerminalRuleCall_1_0_1());
						match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__SubsetsRule__PortAssignment_15439);
						after(grammarAccess.getSubsetsRuleAccess().getPortPortIDTerminalRuleCall_1_0_1());

					}

					after(grammarAccess.getSubsetsRuleAccess().getPortPortCrossReference_1_0());

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

	// $ANTLR end "rule__SubsetsRule__PortAssignment_1"


	// $ANTLR start "rule__DefaultValueRule__DefaultAssignment_1"
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2684:1: rule__DefaultValueRule__DefaultAssignment_1 : ( ruleValue ) ;
	public final void rule__DefaultValueRule__DefaultAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2688:1: ( ( ruleValue ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2689:1: ( ruleValue )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2689:1: ( ruleValue )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2690:1: ruleValue
				{
					before(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleValue_in_rule__DefaultValueRule__DefaultAssignment_15474);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2699:1: rule__IntValue__LiteralIntegerAssignment : ( RULE_INT ) ;
	public final void rule__IntValue__LiteralIntegerAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2703:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2704:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2704:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2705:1: RULE_INT
				{
					before(grammarAccess.getIntValueAccess().getLiteralIntegerINTTerminalRuleCall_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__IntValue__LiteralIntegerAssignment5505);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2714:1: rule__StringValue__LiteralStringAssignment : ( RULE_STRING ) ;
	public final void rule__StringValue__LiteralStringAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2718:1: ( ( RULE_STRING ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2719:1: ( RULE_STRING )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2719:1: ( RULE_STRING )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2720:1: RULE_STRING
				{
					before(grammarAccess.getStringValueAccess().getLiteralStringSTRINGTerminalRuleCall_0());
					match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__StringValue__LiteralStringAssignment5536);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2729:1: rule__BooleanValue__LiteralBooleanAssignment : ( ruleBooleanLiterals ) ;
	public final void rule__BooleanValue__LiteralBooleanAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2733:1: ( ( ruleBooleanLiterals ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2734:1: ( ruleBooleanLiterals )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2734:1: ( ruleBooleanLiterals )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2735:1: ruleBooleanLiterals
				{
					before(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0());
					pushFollow(FOLLOW_ruleBooleanLiterals_in_rule__BooleanValue__LiteralBooleanAssignment5567);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2744:1: rule__RealValue__IntegerAssignment_0_0 : ( RULE_INT ) ;
	public final void rule__RealValue__IntegerAssignment_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2748:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2749:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2749:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2750:1: RULE_INT
				{
					before(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_0_0_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_0_05598);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2759:1: rule__RealValue__FractionAssignment_1_1 : ( RULE_INT ) ;
	public final void rule__RealValue__FractionAssignment_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2763:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2764:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2764:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2765:1: RULE_INT
				{
					before(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_1_1_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_1_15629);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2774:1: rule__RealValue__IntegerAssignment_2_0 : ( RULE_INT ) ;
	public final void rule__RealValue__IntegerAssignment_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2778:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2779:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2779:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2780:1: RULE_INT
				{
					before(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_2_0_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_2_05660);
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
	// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2789:1: rule__RealValue__FractionAssignment_2_2 : ( RULE_INT ) ;
	public final void rule__RealValue__FractionAssignment_2_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2793:1: ( ( RULE_INT ) )
			// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2794:1: ( RULE_INT )
			{
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2794:1: ( RULE_INT )
				// ../org.eclipse.papyrus.uml.textedit.port.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/port/xtext/ui/contentassist/antlr/internal/InternalUmlPort.g:2795:1: RULE_INT
				{
					before(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_2_2_0());
					match(input, RULE_INT, FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_2_25691);
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




	public static final BitSet FOLLOW_rulePortRule_in_entryRulePortRule61 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePortRule68 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group__0_in_rulePortRule94 = new BitSet(new long[] { 0x0000000000000002L });
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
	public static final BitSet FOLLOW_rule__PortRule__TypeAssignment_3_2_0_in_rule__PortRule__Alternatives_3_21318 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__TypeUndefinedAssignment_3_2_1_in_rule__PortRule__Alternatives_3_21336 = new BitSet(new long[] { 0x0000000000000002L });
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
	public static final BitSet FOLLOW_rule__PortRule__Group__0__Impl_in_rule__PortRule__Group__01929 = new BitSet(new long[] { 0x0000002000000020L });
	public static final BitSet FOLLOW_rule__PortRule__Group__1_in_rule__PortRule__Group__01932 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__VisibilityAssignment_0_in_rule__PortRule__Group__0__Impl1959 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group__1__Impl_in_rule__PortRule__Group__11990 = new BitSet(new long[] { 0x0000002000000020L });
	public static final BitSet FOLLOW_rule__PortRule__Group__2_in_rule__PortRule__Group__11993 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__DerivedAssignment_1_in_rule__PortRule__Group__1__Impl2020 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group__2__Impl_in_rule__PortRule__Group__22051 = new BitSet(new long[] { 0x0000000212800000L });
	public static final BitSet FOLLOW_rule__PortRule__Group__3_in_rule__PortRule__Group__22054 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__NameAssignment_2_in_rule__PortRule__Group__2__Impl2081 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group__3__Impl_in_rule__PortRule__Group__32111 = new BitSet(new long[] { 0x0000000212800000L });
	public static final BitSet FOLLOW_rule__PortRule__Group__4_in_rule__PortRule__Group__32114 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group_3__0_in_rule__PortRule__Group__3__Impl2141 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group__4__Impl_in_rule__PortRule__Group__42172 = new BitSet(new long[] { 0x0000000212800000L });
	public static final BitSet FOLLOW_rule__PortRule__Group__5_in_rule__PortRule__Group__42175 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__MultiplicityAssignment_4_in_rule__PortRule__Group__4__Impl2202 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group__5__Impl_in_rule__PortRule__Group__52233 = new BitSet(new long[] { 0x0000000212800000L });
	public static final BitSet FOLLOW_rule__PortRule__Group__6_in_rule__PortRule__Group__52236 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__ModifiersAssignment_5_in_rule__PortRule__Group__5__Impl2263 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group__6__Impl_in_rule__PortRule__Group__62294 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__DefaultAssignment_6_in_rule__PortRule__Group__6__Impl2321 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group_3__0__Impl_in_rule__PortRule__Group_3__02366 = new BitSet(new long[] { 0x0000004000010020L });
	public static final BitSet FOLLOW_rule__PortRule__Group_3__1_in_rule__PortRule__Group_3__02369 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_23_in_rule__PortRule__Group_3__0__Impl2397 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group_3__1__Impl_in_rule__PortRule__Group_3__12428 = new BitSet(new long[] { 0x0000004000010020L });
	public static final BitSet FOLLOW_rule__PortRule__Group_3__2_in_rule__PortRule__Group_3__12431 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__ConjugatedAssignment_3_1_in_rule__PortRule__Group_3__1__Impl2458 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Group_3__2__Impl_in_rule__PortRule__Group_3__22489 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PortRule__Alternatives_3_2_in_rule__PortRule__Group_3__2__Impl2516 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__Group__0__Impl_in_rule__TypeRule__Group__02552 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_rule__TypeRule__Group__1_in_rule__TypeRule__Group__02555 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__PathAssignment_0_in_rule__TypeRule__Group__0__Impl2582 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__Group__1__Impl_in_rule__TypeRule__Group__12613 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__TypeRule__TypeAssignment_1_in_rule__TypeRule__Group__1__Impl2640 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02674 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02677 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__PathAssignment_0_in_rule__QualifiedName__Group__0__Impl2704 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12734 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__12737 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_24_in_rule__QualifiedName__Group__1__Impl2765 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__22796 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__QualifiedName__RemainingAssignment_2_in_rule__QualifiedName__Group__2__Impl2823 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__0__Impl_in_rule__MultiplicityRule__Group__02860 = new BitSet(new long[] { 0x0000000000001010L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__1_in_rule__MultiplicityRule__Group__02863 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_25_in_rule__MultiplicityRule__Group__0__Impl2891 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__1__Impl_in_rule__MultiplicityRule__Group__12922 = new BitSet(new long[] { 0x000000000C000000L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__2_in_rule__MultiplicityRule__Group__12925 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__BoundsAssignment_1_in_rule__MultiplicityRule__Group__1__Impl2952 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__2__Impl_in_rule__MultiplicityRule__Group__22982 = new BitSet(new long[] { 0x000000000C000000L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__3_in_rule__MultiplicityRule__Group__22985 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__0_in_rule__MultiplicityRule__Group__2__Impl3012 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group__3__Impl_in_rule__MultiplicityRule__Group__33043 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_26_in_rule__MultiplicityRule__Group__3__Impl3071 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__0__Impl_in_rule__MultiplicityRule__Group_2__03110 = new BitSet(new long[] { 0x0000000000001010L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__1_in_rule__MultiplicityRule__Group_2__03113 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_27_in_rule__MultiplicityRule__Group_2__0__Impl3141 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__1__Impl_in_rule__MultiplicityRule__Group_2__13172 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__MultiplicityRule__BoundsAssignment_2_1_in_rule__MultiplicityRule__Group_2__1__Impl3199 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__0__Impl_in_rule__ModifiersRule__Group__03233 = new BitSet(new long[] { 0x00000001801E0000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__1_in_rule__ModifiersRule__Group__03236 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_28_in_rule__ModifiersRule__Group__0__Impl3264 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__1__Impl_in_rule__ModifiersRule__Group__13295 = new BitSet(new long[] { 0x0000000060000000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__2_in_rule__ModifiersRule__Group__13298 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__ValuesAssignment_1_in_rule__ModifiersRule__Group__1__Impl3325 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__2__Impl_in_rule__ModifiersRule__Group__23355 = new BitSet(new long[] { 0x0000000060000000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__3_in_rule__ModifiersRule__Group__23358 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__0_in_rule__ModifiersRule__Group__2__Impl3385 = new BitSet(new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group__3__Impl_in_rule__ModifiersRule__Group__33416 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_29_in_rule__ModifiersRule__Group__3__Impl3444 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__0__Impl_in_rule__ModifiersRule__Group_2__03483 = new BitSet(new long[] { 0x00000001801E0000L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__1_in_rule__ModifiersRule__Group_2__03486 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_rule__ModifiersRule__Group_2__0__Impl3514 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__1__Impl_in_rule__ModifiersRule__Group_2__13545 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ModifiersRule__ValuesAssignment_2_1_in_rule__ModifiersRule__Group_2__1__Impl3572 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RedefinesRule__Group__0__Impl_in_rule__RedefinesRule__Group__03606 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_rule__RedefinesRule__Group__1_in_rule__RedefinesRule__Group__03609 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_31_in_rule__RedefinesRule__Group__0__Impl3637 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RedefinesRule__Group__1__Impl_in_rule__RedefinesRule__Group__13668 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RedefinesRule__PortAssignment_1_in_rule__RedefinesRule__Group__1__Impl3695 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SubsetsRule__Group__0__Impl_in_rule__SubsetsRule__Group__03729 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_rule__SubsetsRule__Group__1_in_rule__SubsetsRule__Group__03732 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_rule__SubsetsRule__Group__0__Impl3760 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SubsetsRule__Group__1__Impl_in_rule__SubsetsRule__Group__13791 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SubsetsRule__PortAssignment_1_in_rule__SubsetsRule__Group__1__Impl3818 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__Group__0__Impl_in_rule__DefaultValueRule__Group__03852 = new BitSet(new long[] { 0x0000001C00600050L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__Group__1_in_rule__DefaultValueRule__Group__03855 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_33_in_rule__DefaultValueRule__Group__0__Impl3883 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__Group__1__Impl_in_rule__DefaultValueRule__Group__13914 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__DefaultValueRule__DefaultAssignment_1_in_rule__DefaultValueRule__Group__1__Impl3941 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_0__0__Impl_in_rule__RealValue__Group_0__03975 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_rule__RealValue__Group_0__1_in_rule__RealValue__Group_0__03978 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__IntegerAssignment_0_0_in_rule__RealValue__Group_0__0__Impl4005 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_0__1__Impl_in_rule__RealValue__Group_0__14035 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__RealValue__Group_0__1__Impl4063 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_1__0__Impl_in_rule__RealValue__Group_1__04098 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__RealValue__Group_1__1_in_rule__RealValue__Group_1__04101 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__RealValue__Group_1__0__Impl4129 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_1__1__Impl_in_rule__RealValue__Group_1__14160 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__FractionAssignment_1_1_in_rule__RealValue__Group_1__1__Impl4187 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__0__Impl_in_rule__RealValue__Group_2__04221 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__1_in_rule__RealValue__Group_2__04224 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__IntegerAssignment_2_0_in_rule__RealValue__Group_2__0__Impl4251 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__1__Impl_in_rule__RealValue__Group_2__14281 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__2_in_rule__RealValue__Group_2__14284 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__RealValue__Group_2__1__Impl4312 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__Group_2__2__Impl_in_rule__RealValue__Group_2__24343 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__RealValue__FractionAssignment_2_2_in_rule__RealValue__Group_2__2__Impl4370 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__04406 = new BitSet(new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__04409 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__14467 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_35_in_rule__NullValue__Group__1__Impl4495 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NoValue__Group__0__Impl_in_rule__NoValue__Group__04530 = new BitSet(new long[] { 0x0000001C00600050L });
	public static final BitSet FOLLOW_rule__NoValue__Group__1_in_rule__NoValue__Group__04533 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__NoValue__Group__1__Impl_in_rule__NoValue__Group__14591 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_36_in_rule__NoValue__Group__1__Impl4619 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityRule_in_rule__PortRule__VisibilityAssignment_04659 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_37_in_rule__PortRule__DerivedAssignment_14695 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__PortRule__NameAssignment_24734 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_16_in_rule__PortRule__ConjugatedAssignment_3_14770 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTypeRule_in_rule__PortRule__TypeAssignment_3_2_04809 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_38_in_rule__PortRule__TypeUndefinedAssignment_3_2_14845 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleMultiplicityRule_in_rule__PortRule__MultiplicityAssignment_44884 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifiersRule_in_rule__PortRule__ModifiersAssignment_54915 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDefaultValueRule_in_rule__PortRule__DefaultAssignment_64946 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__VisibilityRule__VisibilityAssignment4977 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRule__PathAssignment_05008 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__TypeRule__TypeAssignment_15043 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__PathAssignment_05082 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedName__RemainingAssignment_25117 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_15148 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_2_15179 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_rule__BoundSpecification__ValueAssignment5210 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_15241 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_15272 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleModifierKind_in_rule__ModifierSpecification__ValueAssignment_05303 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRedefinesRule_in_rule__ModifierSpecification__RedefinesAssignment_15334 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubsetsRule_in_rule__ModifierSpecification__SubsetsAssignment_25365 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__RedefinesRule__PortAssignment_15400 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__SubsetsRule__PortAssignment_15439 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleValue_in_rule__DefaultValueRule__DefaultAssignment_15474 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__LiteralIntegerAssignment5505 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__LiteralStringAssignment5536 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleBooleanLiterals_in_rule__BooleanValue__LiteralBooleanAssignment5567 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_0_05598 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_1_15629 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_2_05660 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_2_25691 = new BitSet(new long[] { 0x0000000000000002L });

}