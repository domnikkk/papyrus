package org.eclipse.papyrus.uml.textedit.parameter.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.services.UmlParameterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlParameterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INTEGER_VALUE", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'exception'", "'stream'", "'ordered'", "'unique'", "'create'", "'read'", "'update'", "'delete'", "'true'", "'false'", "'+'", "'-'", "'#'", "'~'", "'in'", "'out'", "'inout'", "'return'", "':'", "'{'", "'}'", "','", "'effect:'", "'='", "'.'", "'null'", "'none'", "'::'", "'['", "']'", "'..'", "'<Undefined>'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_INTEGER_VALUE=9;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalUmlParameterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUmlParameterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUmlParameterParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g"; }


     
     	private UmlParameterGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(UmlParameterGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleParameterRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:60:1: entryRuleParameterRule : ruleParameterRule EOF ;
    public final void entryRuleParameterRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:61:1: ( ruleParameterRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:62:1: ruleParameterRule EOF
            {
             before(grammarAccess.getParameterRuleRule()); 
            pushFollow(FOLLOW_ruleParameterRule_in_entryRuleParameterRule61);
            ruleParameterRule();

            state._fsp--;

             after(grammarAccess.getParameterRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterRule68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterRule"


    // $ANTLR start "ruleParameterRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:69:1: ruleParameterRule : ( ( rule__ParameterRule__Group__0 ) ) ;
    public final void ruleParameterRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:73:2: ( ( ( rule__ParameterRule__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:74:1: ( ( rule__ParameterRule__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:74:1: ( ( rule__ParameterRule__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:75:1: ( rule__ParameterRule__Group__0 )
            {
             before(grammarAccess.getParameterRuleAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:76:1: ( rule__ParameterRule__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:76:2: rule__ParameterRule__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__0_in_ruleParameterRule94);
            rule__ParameterRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterRule"


    // $ANTLR start "entryRuleModifiersRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:88:1: entryRuleModifiersRule : ruleModifiersRule EOF ;
    public final void entryRuleModifiersRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:89:1: ( ruleModifiersRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:90:1: ruleModifiersRule EOF
            {
             before(grammarAccess.getModifiersRuleRule()); 
            pushFollow(FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule121);
            ruleModifiersRule();

            state._fsp--;

             after(grammarAccess.getModifiersRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifiersRule128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifiersRule"


    // $ANTLR start "ruleModifiersRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:97:1: ruleModifiersRule : ( ( rule__ModifiersRule__Group__0 ) ) ;
    public final void ruleModifiersRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:101:2: ( ( ( rule__ModifiersRule__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:102:1: ( ( rule__ModifiersRule__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:102:1: ( ( rule__ModifiersRule__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:103:1: ( rule__ModifiersRule__Group__0 )
            {
             before(grammarAccess.getModifiersRuleAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:104:1: ( rule__ModifiersRule__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:104:2: rule__ModifiersRule__Group__0
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group__0_in_ruleModifiersRule154);
            rule__ModifiersRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifiersRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifiersRule"


    // $ANTLR start "entryRuleModifierSpecification"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:116:1: entryRuleModifierSpecification : ruleModifierSpecification EOF ;
    public final void entryRuleModifierSpecification() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:117:1: ( ruleModifierSpecification EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:118:1: ruleModifierSpecification EOF
            {
             before(grammarAccess.getModifierSpecificationRule()); 
            pushFollow(FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification181);
            ruleModifierSpecification();

            state._fsp--;

             after(grammarAccess.getModifierSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierSpecification188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifierSpecification"


    // $ANTLR start "ruleModifierSpecification"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:125:1: ruleModifierSpecification : ( ( rule__ModifierSpecification__ValueAssignment ) ) ;
    public final void ruleModifierSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:129:2: ( ( ( rule__ModifierSpecification__ValueAssignment ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:130:1: ( ( rule__ModifierSpecification__ValueAssignment ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:130:1: ( ( rule__ModifierSpecification__ValueAssignment ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:131:1: ( rule__ModifierSpecification__ValueAssignment )
            {
             before(grammarAccess.getModifierSpecificationAccess().getValueAssignment()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:132:1: ( rule__ModifierSpecification__ValueAssignment )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:132:2: rule__ModifierSpecification__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ModifierSpecification__ValueAssignment_in_ruleModifierSpecification214);
            rule__ModifierSpecification__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModifierSpecificationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifierSpecification"


    // $ANTLR start "entryRuleVisibilityRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:144:1: entryRuleVisibilityRule : ruleVisibilityRule EOF ;
    public final void entryRuleVisibilityRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:145:1: ( ruleVisibilityRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:146:1: ruleVisibilityRule EOF
            {
             before(grammarAccess.getVisibilityRuleRule()); 
            pushFollow(FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule241);
            ruleVisibilityRule();

            state._fsp--;

             after(grammarAccess.getVisibilityRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibilityRule248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisibilityRule"


    // $ANTLR start "ruleVisibilityRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:153:1: ruleVisibilityRule : ( ( rule__VisibilityRule__VisibilityAssignment ) ) ;
    public final void ruleVisibilityRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:157:2: ( ( ( rule__VisibilityRule__VisibilityAssignment ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:158:1: ( ( rule__VisibilityRule__VisibilityAssignment ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:158:1: ( ( rule__VisibilityRule__VisibilityAssignment ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:159:1: ( rule__VisibilityRule__VisibilityAssignment )
            {
             before(grammarAccess.getVisibilityRuleAccess().getVisibilityAssignment()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:160:1: ( rule__VisibilityRule__VisibilityAssignment )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:160:2: rule__VisibilityRule__VisibilityAssignment
            {
            pushFollow(FOLLOW_rule__VisibilityRule__VisibilityAssignment_in_ruleVisibilityRule274);
            rule__VisibilityRule__VisibilityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityRuleAccess().getVisibilityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilityRule"


    // $ANTLR start "entryRuleDirectionRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:172:1: entryRuleDirectionRule : ruleDirectionRule EOF ;
    public final void entryRuleDirectionRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:173:1: ( ruleDirectionRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:174:1: ruleDirectionRule EOF
            {
             before(grammarAccess.getDirectionRuleRule()); 
            pushFollow(FOLLOW_ruleDirectionRule_in_entryRuleDirectionRule301);
            ruleDirectionRule();

            state._fsp--;

             after(grammarAccess.getDirectionRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectionRule308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectionRule"


    // $ANTLR start "ruleDirectionRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:181:1: ruleDirectionRule : ( ( rule__DirectionRule__DirectionAssignment ) ) ;
    public final void ruleDirectionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:185:2: ( ( ( rule__DirectionRule__DirectionAssignment ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:186:1: ( ( rule__DirectionRule__DirectionAssignment ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:186:1: ( ( rule__DirectionRule__DirectionAssignment ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:187:1: ( rule__DirectionRule__DirectionAssignment )
            {
             before(grammarAccess.getDirectionRuleAccess().getDirectionAssignment()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:188:1: ( rule__DirectionRule__DirectionAssignment )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:188:2: rule__DirectionRule__DirectionAssignment
            {
            pushFollow(FOLLOW_rule__DirectionRule__DirectionAssignment_in_ruleDirectionRule334);
            rule__DirectionRule__DirectionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDirectionRuleAccess().getDirectionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectionRule"


    // $ANTLR start "entryRuleEffectRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:200:1: entryRuleEffectRule : ruleEffectRule EOF ;
    public final void entryRuleEffectRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:201:1: ( ruleEffectRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:202:1: ruleEffectRule EOF
            {
             before(grammarAccess.getEffectRuleRule()); 
            pushFollow(FOLLOW_ruleEffectRule_in_entryRuleEffectRule361);
            ruleEffectRule();

            state._fsp--;

             after(grammarAccess.getEffectRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectRule368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectRule"


    // $ANTLR start "ruleEffectRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:209:1: ruleEffectRule : ( ( rule__EffectRule__Group__0 ) ) ;
    public final void ruleEffectRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:213:2: ( ( ( rule__EffectRule__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:214:1: ( ( rule__EffectRule__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:214:1: ( ( rule__EffectRule__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:215:1: ( rule__EffectRule__Group__0 )
            {
             before(grammarAccess.getEffectRuleAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:216:1: ( rule__EffectRule__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:216:2: rule__EffectRule__Group__0
            {
            pushFollow(FOLLOW_rule__EffectRule__Group__0_in_ruleEffectRule394);
            rule__EffectRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectRule"


    // $ANTLR start "entryRuleDefaultValueRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:228:1: entryRuleDefaultValueRule : ruleDefaultValueRule EOF ;
    public final void entryRuleDefaultValueRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:229:1: ( ruleDefaultValueRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:230:1: ruleDefaultValueRule EOF
            {
             before(grammarAccess.getDefaultValueRuleRule()); 
            pushFollow(FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule421);
            ruleDefaultValueRule();

            state._fsp--;

             after(grammarAccess.getDefaultValueRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueRule428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultValueRule"


    // $ANTLR start "ruleDefaultValueRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:237:1: ruleDefaultValueRule : ( ( rule__DefaultValueRule__Group__0 ) ) ;
    public final void ruleDefaultValueRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:241:2: ( ( ( rule__DefaultValueRule__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:242:1: ( ( rule__DefaultValueRule__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:242:1: ( ( rule__DefaultValueRule__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:243:1: ( rule__DefaultValueRule__Group__0 )
            {
             before(grammarAccess.getDefaultValueRuleAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:244:1: ( rule__DefaultValueRule__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:244:2: rule__DefaultValueRule__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultValueRule__Group__0_in_ruleDefaultValueRule454);
            rule__DefaultValueRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultValueRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultValueRule"


    // $ANTLR start "entryRuleValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:256:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:257:1: ( ruleValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:258:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue481);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:265:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:269:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:270:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:270:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:271:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:272:1: ( rule__Value__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:272:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue514);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:284:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:285:1: ( ruleIntValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:286:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue541);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:293:1: ruleIntValue : ( ( rule__IntValue__LiteralIntegerAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:297:2: ( ( ( rule__IntValue__LiteralIntegerAssignment ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:298:1: ( ( rule__IntValue__LiteralIntegerAssignment ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:298:1: ( ( rule__IntValue__LiteralIntegerAssignment ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:299:1: ( rule__IntValue__LiteralIntegerAssignment )
            {
             before(grammarAccess.getIntValueAccess().getLiteralIntegerAssignment()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:300:1: ( rule__IntValue__LiteralIntegerAssignment )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:300:2: rule__IntValue__LiteralIntegerAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__LiteralIntegerAssignment_in_ruleIntValue574);
            rule__IntValue__LiteralIntegerAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getLiteralIntegerAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:312:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:313:1: ( ruleStringValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:314:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue601);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:321:1: ruleStringValue : ( ( rule__StringValue__LiteralStringAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:325:2: ( ( ( rule__StringValue__LiteralStringAssignment ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:326:1: ( ( rule__StringValue__LiteralStringAssignment ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:326:1: ( ( rule__StringValue__LiteralStringAssignment ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:327:1: ( rule__StringValue__LiteralStringAssignment )
            {
             before(grammarAccess.getStringValueAccess().getLiteralStringAssignment()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:328:1: ( rule__StringValue__LiteralStringAssignment )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:328:2: rule__StringValue__LiteralStringAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__LiteralStringAssignment_in_ruleStringValue634);
            rule__StringValue__LiteralStringAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getLiteralStringAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:340:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:341:1: ( ruleBooleanValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:342:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue661);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:349:1: ruleBooleanValue : ( ( rule__BooleanValue__LiteralBooleanAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:353:2: ( ( ( rule__BooleanValue__LiteralBooleanAssignment ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:354:1: ( ( rule__BooleanValue__LiteralBooleanAssignment ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:354:1: ( ( rule__BooleanValue__LiteralBooleanAssignment ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:355:1: ( rule__BooleanValue__LiteralBooleanAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getLiteralBooleanAssignment()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:356:1: ( rule__BooleanValue__LiteralBooleanAssignment )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:356:2: rule__BooleanValue__LiteralBooleanAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__LiteralBooleanAssignment_in_ruleBooleanValue694);
            rule__BooleanValue__LiteralBooleanAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getLiteralBooleanAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleRealValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:368:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:369:1: ( ruleRealValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:370:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue721);
            ruleRealValue();

            state._fsp--;

             after(grammarAccess.getRealValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:377:1: ruleRealValue : ( ( rule__RealValue__Alternatives ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:381:2: ( ( ( rule__RealValue__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:382:1: ( ( rule__RealValue__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:382:1: ( ( rule__RealValue__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:383:1: ( rule__RealValue__Alternatives )
            {
             before(grammarAccess.getRealValueAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:384:1: ( rule__RealValue__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:384:2: rule__RealValue__Alternatives
            {
            pushFollow(FOLLOW_rule__RealValue__Alternatives_in_ruleRealValue754);
            rule__RealValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleNullValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:396:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:397:1: ( ruleNullValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:398:1: ruleNullValue EOF
            {
             before(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_ruleNullValue_in_entryRuleNullValue781);
            ruleNullValue();

            state._fsp--;

             after(grammarAccess.getNullValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullValue788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:405:1: ruleNullValue : ( ( rule__NullValue__Group__0 ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:409:2: ( ( ( rule__NullValue__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:410:1: ( ( rule__NullValue__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:410:1: ( ( rule__NullValue__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:411:1: ( rule__NullValue__Group__0 )
            {
             before(grammarAccess.getNullValueAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:412:1: ( rule__NullValue__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:412:2: rule__NullValue__Group__0
            {
            pushFollow(FOLLOW_rule__NullValue__Group__0_in_ruleNullValue814);
            rule__NullValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleNoValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:424:1: entryRuleNoValue : ruleNoValue EOF ;
    public final void entryRuleNoValue() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:425:1: ( ruleNoValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:426:1: ruleNoValue EOF
            {
             before(grammarAccess.getNoValueRule()); 
            pushFollow(FOLLOW_ruleNoValue_in_entryRuleNoValue841);
            ruleNoValue();

            state._fsp--;

             after(grammarAccess.getNoValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoValue848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoValue"


    // $ANTLR start "ruleNoValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:433:1: ruleNoValue : ( ( rule__NoValue__Group__0 ) ) ;
    public final void ruleNoValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:437:2: ( ( ( rule__NoValue__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:438:1: ( ( rule__NoValue__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:438:1: ( ( rule__NoValue__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:439:1: ( rule__NoValue__Group__0 )
            {
             before(grammarAccess.getNoValueAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:440:1: ( rule__NoValue__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:440:2: rule__NoValue__Group__0
            {
            pushFollow(FOLLOW_rule__NoValue__Group__0_in_ruleNoValue874);
            rule__NoValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoValue"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:452:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:453:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:454:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:461:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:465:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:466:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:466:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:467:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:468:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:468:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleTypeRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:480:1: entryRuleTypeRule : ruleTypeRule EOF ;
    public final void entryRuleTypeRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:481:1: ( ruleTypeRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:482:1: ruleTypeRule EOF
            {
             before(grammarAccess.getTypeRuleRule()); 
            pushFollow(FOLLOW_ruleTypeRule_in_entryRuleTypeRule961);
            ruleTypeRule();

            state._fsp--;

             after(grammarAccess.getTypeRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRule968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeRule"


    // $ANTLR start "ruleTypeRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:489:1: ruleTypeRule : ( ( rule__TypeRule__Group__0 ) ) ;
    public final void ruleTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:493:2: ( ( ( rule__TypeRule__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:494:1: ( ( rule__TypeRule__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:494:1: ( ( rule__TypeRule__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:495:1: ( rule__TypeRule__Group__0 )
            {
             before(grammarAccess.getTypeRuleAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:496:1: ( rule__TypeRule__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:496:2: rule__TypeRule__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRule__Group__0_in_ruleTypeRule994);
            rule__TypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRule"


    // $ANTLR start "entryRuleMultiplicityRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:508:1: entryRuleMultiplicityRule : ruleMultiplicityRule EOF ;
    public final void entryRuleMultiplicityRule() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:509:1: ( ruleMultiplicityRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:510:1: ruleMultiplicityRule EOF
            {
             before(grammarAccess.getMultiplicityRuleRule()); 
            pushFollow(FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule1021);
            ruleMultiplicityRule();

            state._fsp--;

             after(grammarAccess.getMultiplicityRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityRule1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicityRule"


    // $ANTLR start "ruleMultiplicityRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:517:1: ruleMultiplicityRule : ( ( rule__MultiplicityRule__Group__0 ) ) ;
    public final void ruleMultiplicityRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:521:2: ( ( ( rule__MultiplicityRule__Group__0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:522:1: ( ( rule__MultiplicityRule__Group__0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:522:1: ( ( rule__MultiplicityRule__Group__0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:523:1: ( rule__MultiplicityRule__Group__0 )
            {
             before(grammarAccess.getMultiplicityRuleAccess().getGroup()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:524:1: ( rule__MultiplicityRule__Group__0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:524:2: rule__MultiplicityRule__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__Group__0_in_ruleMultiplicityRule1054);
            rule__MultiplicityRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicityRule"


    // $ANTLR start "entryRuleBoundSpecification"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:536:1: entryRuleBoundSpecification : ruleBoundSpecification EOF ;
    public final void entryRuleBoundSpecification() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:537:1: ( ruleBoundSpecification EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:538:1: ruleBoundSpecification EOF
            {
             before(grammarAccess.getBoundSpecificationRule()); 
            pushFollow(FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification1081);
            ruleBoundSpecification();

            state._fsp--;

             after(grammarAccess.getBoundSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoundSpecification1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundSpecification"


    // $ANTLR start "ruleBoundSpecification"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:545:1: ruleBoundSpecification : ( ( rule__BoundSpecification__ValueAssignment ) ) ;
    public final void ruleBoundSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:549:2: ( ( ( rule__BoundSpecification__ValueAssignment ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:550:1: ( ( rule__BoundSpecification__ValueAssignment ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:550:1: ( ( rule__BoundSpecification__ValueAssignment ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:551:1: ( rule__BoundSpecification__ValueAssignment )
            {
             before(grammarAccess.getBoundSpecificationAccess().getValueAssignment()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:552:1: ( rule__BoundSpecification__ValueAssignment )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:552:2: rule__BoundSpecification__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BoundSpecification__ValueAssignment_in_ruleBoundSpecification1114);
            rule__BoundSpecification__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBoundSpecificationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundSpecification"


    // $ANTLR start "entryRuleUnlimitedLiteral"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:564:1: entryRuleUnlimitedLiteral : ruleUnlimitedLiteral EOF ;
    public final void entryRuleUnlimitedLiteral() throws RecognitionException {
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:565:1: ( ruleUnlimitedLiteral EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:566:1: ruleUnlimitedLiteral EOF
            {
             before(grammarAccess.getUnlimitedLiteralRule()); 
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral1141);
            ruleUnlimitedLiteral();

            state._fsp--;

             after(grammarAccess.getUnlimitedLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnlimitedLiteral"


    // $ANTLR start "ruleUnlimitedLiteral"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:573:1: ruleUnlimitedLiteral : ( ( rule__UnlimitedLiteral__Alternatives ) ) ;
    public final void ruleUnlimitedLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:577:2: ( ( ( rule__UnlimitedLiteral__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:578:1: ( ( rule__UnlimitedLiteral__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:578:1: ( ( rule__UnlimitedLiteral__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:579:1: ( rule__UnlimitedLiteral__Alternatives )
            {
             before(grammarAccess.getUnlimitedLiteralAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:580:1: ( rule__UnlimitedLiteral__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:580:2: rule__UnlimitedLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__UnlimitedLiteral__Alternatives_in_ruleUnlimitedLiteral1174);
            rule__UnlimitedLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnlimitedLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnlimitedLiteral"


    // $ANTLR start "ruleModifierKind"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:593:1: ruleModifierKind : ( ( rule__ModifierKind__Alternatives ) ) ;
    public final void ruleModifierKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:597:1: ( ( ( rule__ModifierKind__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:598:1: ( ( rule__ModifierKind__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:598:1: ( ( rule__ModifierKind__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:599:1: ( rule__ModifierKind__Alternatives )
            {
             before(grammarAccess.getModifierKindAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:600:1: ( rule__ModifierKind__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:600:2: rule__ModifierKind__Alternatives
            {
            pushFollow(FOLLOW_rule__ModifierKind__Alternatives_in_ruleModifierKind1211);
            rule__ModifierKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifierKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifierKind"


    // $ANTLR start "ruleEffectKind"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:612:1: ruleEffectKind : ( ( rule__EffectKind__Alternatives ) ) ;
    public final void ruleEffectKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:616:1: ( ( ( rule__EffectKind__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:617:1: ( ( rule__EffectKind__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:617:1: ( ( rule__EffectKind__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:618:1: ( rule__EffectKind__Alternatives )
            {
             before(grammarAccess.getEffectKindAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:619:1: ( rule__EffectKind__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:619:2: rule__EffectKind__Alternatives
            {
            pushFollow(FOLLOW_rule__EffectKind__Alternatives_in_ruleEffectKind1247);
            rule__EffectKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectKind"


    // $ANTLR start "ruleBooleanLiterals"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:631:1: ruleBooleanLiterals : ( ( rule__BooleanLiterals__Alternatives ) ) ;
    public final void ruleBooleanLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:635:1: ( ( ( rule__BooleanLiterals__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:636:1: ( ( rule__BooleanLiterals__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:636:1: ( ( rule__BooleanLiterals__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:637:1: ( rule__BooleanLiterals__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralsAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:638:1: ( rule__BooleanLiterals__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:638:2: rule__BooleanLiterals__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanLiterals__Alternatives_in_ruleBooleanLiterals1283);
            rule__BooleanLiterals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiterals"


    // $ANTLR start "ruleVisibilityKind"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:650:1: ruleVisibilityKind : ( ( rule__VisibilityKind__Alternatives ) ) ;
    public final void ruleVisibilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:654:1: ( ( ( rule__VisibilityKind__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:655:1: ( ( rule__VisibilityKind__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:655:1: ( ( rule__VisibilityKind__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:656:1: ( rule__VisibilityKind__Alternatives )
            {
             before(grammarAccess.getVisibilityKindAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:657:1: ( rule__VisibilityKind__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:657:2: rule__VisibilityKind__Alternatives
            {
            pushFollow(FOLLOW_rule__VisibilityKind__Alternatives_in_ruleVisibilityKind1319);
            rule__VisibilityKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilityKind"


    // $ANTLR start "ruleDirection"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:669:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:673:1: ( ( ( rule__Direction__Alternatives ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:674:1: ( ( rule__Direction__Alternatives ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:674:1: ( ( rule__Direction__Alternatives ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:675:1: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:676:1: ( rule__Direction__Alternatives )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:676:2: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_rule__Direction__Alternatives_in_ruleDirection1355);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__ParameterRule__Alternatives_3_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:687:1: rule__ParameterRule__Alternatives_3_1 : ( ( ( rule__ParameterRule__TypeAssignment_3_1_0 ) ) | ( ( rule__ParameterRule__TypeUndefinedAssignment_3_1_1 ) ) );
    public final void rule__ParameterRule__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:691:1: ( ( ( rule__ParameterRule__TypeAssignment_3_1_0 ) ) | ( ( rule__ParameterRule__TypeUndefinedAssignment_3_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==44) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:692:1: ( ( rule__ParameterRule__TypeAssignment_3_1_0 ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:692:1: ( ( rule__ParameterRule__TypeAssignment_3_1_0 ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:693:1: ( rule__ParameterRule__TypeAssignment_3_1_0 )
                    {
                     before(grammarAccess.getParameterRuleAccess().getTypeAssignment_3_1_0()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:694:1: ( rule__ParameterRule__TypeAssignment_3_1_0 )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:694:2: rule__ParameterRule__TypeAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__TypeAssignment_3_1_0_in_rule__ParameterRule__Alternatives_3_11390);
                    rule__ParameterRule__TypeAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterRuleAccess().getTypeAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:698:6: ( ( rule__ParameterRule__TypeUndefinedAssignment_3_1_1 ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:698:6: ( ( rule__ParameterRule__TypeUndefinedAssignment_3_1_1 ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:699:1: ( rule__ParameterRule__TypeUndefinedAssignment_3_1_1 )
                    {
                     before(grammarAccess.getParameterRuleAccess().getTypeUndefinedAssignment_3_1_1()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:700:1: ( rule__ParameterRule__TypeUndefinedAssignment_3_1_1 )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:700:2: rule__ParameterRule__TypeUndefinedAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__TypeUndefinedAssignment_3_1_1_in_rule__ParameterRule__Alternatives_3_11408);
                    rule__ParameterRule__TypeUndefinedAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterRuleAccess().getTypeUndefinedAssignment_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Alternatives_3_1"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:709:1: rule__Value__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleRealValue ) | ( ruleNullValue ) | ( ruleNoValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:713:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleRealValue ) | ( ruleNullValue ) | ( ruleNoValue ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==37) ) {
                    alt2=4;
                }
                else if ( (LA2_1==EOF) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case 21:
            case 22:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case 39:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:714:1: ( ruleIntValue )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:714:1: ( ruleIntValue )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:715:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives1441);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:720:6: ( ruleStringValue )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:720:6: ( ruleStringValue )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:721:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives1458);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:726:6: ( ruleBooleanValue )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:726:6: ( ruleBooleanValue )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:727:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives1475);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:732:6: ( ruleRealValue )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:732:6: ( ruleRealValue )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:733:1: ruleRealValue
                    {
                     before(grammarAccess.getValueAccess().getRealValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRealValue_in_rule__Value__Alternatives1492);
                    ruleRealValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getRealValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:738:6: ( ruleNullValue )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:738:6: ( ruleNullValue )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:739:1: ruleNullValue
                    {
                     before(grammarAccess.getValueAccess().getNullValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleNullValue_in_rule__Value__Alternatives1509);
                    ruleNullValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:744:6: ( ruleNoValue )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:744:6: ( ruleNoValue )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:745:1: ruleNoValue
                    {
                     before(grammarAccess.getValueAccess().getNoValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleNoValue_in_rule__Value__Alternatives1526);
                    ruleNoValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNoValueParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__RealValue__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:755:1: rule__RealValue__Alternatives : ( ( ( rule__RealValue__Group_0__0 ) ) | ( ( rule__RealValue__Group_1__0 ) ) | ( ( rule__RealValue__Group_2__0 ) ) );
    public final void rule__RealValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:759:1: ( ( ( rule__RealValue__Group_0__0 ) ) | ( ( rule__RealValue__Group_1__0 ) ) | ( ( rule__RealValue__Group_2__0 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==37) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==EOF) ) {
                        alt3=1;
                    }
                    else if ( (LA3_3==RULE_INT) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==37) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:760:1: ( ( rule__RealValue__Group_0__0 ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:760:1: ( ( rule__RealValue__Group_0__0 ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:761:1: ( rule__RealValue__Group_0__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_0()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:762:1: ( rule__RealValue__Group_0__0 )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:762:2: rule__RealValue__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RealValue__Group_0__0_in_rule__RealValue__Alternatives1558);
                    rule__RealValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:766:6: ( ( rule__RealValue__Group_1__0 ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:766:6: ( ( rule__RealValue__Group_1__0 ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:767:1: ( rule__RealValue__Group_1__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_1()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:768:1: ( rule__RealValue__Group_1__0 )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:768:2: rule__RealValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RealValue__Group_1__0_in_rule__RealValue__Alternatives1576);
                    rule__RealValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:772:6: ( ( rule__RealValue__Group_2__0 ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:772:6: ( ( rule__RealValue__Group_2__0 ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:773:1: ( rule__RealValue__Group_2__0 )
                    {
                     before(grammarAccess.getRealValueAccess().getGroup_2()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:774:1: ( rule__RealValue__Group_2__0 )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:774:2: rule__RealValue__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RealValue__Group_2__0_in_rule__RealValue__Alternatives1594);
                    rule__RealValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealValueAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Alternatives"


    // $ANTLR start "rule__UnlimitedLiteral__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:783:1: rule__UnlimitedLiteral__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__UnlimitedLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:787:1: ( ( RULE_INT ) | ( '*' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:788:1: ( RULE_INT )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:788:1: ( RULE_INT )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:789:1: RULE_INT
                    {
                     before(grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__UnlimitedLiteral__Alternatives1627); 
                     after(grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:794:6: ( '*' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:794:6: ( '*' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:795:1: '*'
                    {
                     before(grammarAccess.getUnlimitedLiteralAccess().getAsteriskKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__UnlimitedLiteral__Alternatives1645); 
                     after(grammarAccess.getUnlimitedLiteralAccess().getAsteriskKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnlimitedLiteral__Alternatives"


    // $ANTLR start "rule__ModifierKind__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:807:1: rule__ModifierKind__Alternatives : ( ( ( 'exception' ) ) | ( ( 'stream' ) ) | ( ( 'ordered' ) ) | ( ( 'unique' ) ) );
    public final void rule__ModifierKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:811:1: ( ( ( 'exception' ) ) | ( ( 'stream' ) ) | ( ( 'ordered' ) ) | ( ( 'unique' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:812:1: ( ( 'exception' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:812:1: ( ( 'exception' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:813:1: ( 'exception' )
                    {
                     before(grammarAccess.getModifierKindAccess().getEXCEPTIONEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:814:1: ( 'exception' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:814:3: 'exception'
                    {
                    match(input,13,FOLLOW_13_in_rule__ModifierKind__Alternatives1680); 

                    }

                     after(grammarAccess.getModifierKindAccess().getEXCEPTIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:819:6: ( ( 'stream' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:819:6: ( ( 'stream' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:820:1: ( 'stream' )
                    {
                     before(grammarAccess.getModifierKindAccess().getSTREAMEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:821:1: ( 'stream' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:821:3: 'stream'
                    {
                    match(input,14,FOLLOW_14_in_rule__ModifierKind__Alternatives1701); 

                    }

                     after(grammarAccess.getModifierKindAccess().getSTREAMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:826:6: ( ( 'ordered' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:826:6: ( ( 'ordered' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:827:1: ( 'ordered' )
                    {
                     before(grammarAccess.getModifierKindAccess().getORDEREDEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:828:1: ( 'ordered' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:828:3: 'ordered'
                    {
                    match(input,15,FOLLOW_15_in_rule__ModifierKind__Alternatives1722); 

                    }

                     after(grammarAccess.getModifierKindAccess().getORDEREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:833:6: ( ( 'unique' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:833:6: ( ( 'unique' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:834:1: ( 'unique' )
                    {
                     before(grammarAccess.getModifierKindAccess().getUNIQUEEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:835:1: ( 'unique' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:835:3: 'unique'
                    {
                    match(input,16,FOLLOW_16_in_rule__ModifierKind__Alternatives1743); 

                    }

                     after(grammarAccess.getModifierKindAccess().getUNIQUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierKind__Alternatives"


    // $ANTLR start "rule__EffectKind__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:845:1: rule__EffectKind__Alternatives : ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) );
    public final void rule__EffectKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:849:1: ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:850:1: ( ( 'create' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:850:1: ( ( 'create' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:851:1: ( 'create' )
                    {
                     before(grammarAccess.getEffectKindAccess().getCREATEEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:852:1: ( 'create' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:852:3: 'create'
                    {
                    match(input,17,FOLLOW_17_in_rule__EffectKind__Alternatives1779); 

                    }

                     after(grammarAccess.getEffectKindAccess().getCREATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:857:6: ( ( 'read' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:857:6: ( ( 'read' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:858:1: ( 'read' )
                    {
                     before(grammarAccess.getEffectKindAccess().getREADEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:859:1: ( 'read' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:859:3: 'read'
                    {
                    match(input,18,FOLLOW_18_in_rule__EffectKind__Alternatives1800); 

                    }

                     after(grammarAccess.getEffectKindAccess().getREADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:864:6: ( ( 'update' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:864:6: ( ( 'update' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:865:1: ( 'update' )
                    {
                     before(grammarAccess.getEffectKindAccess().getUPDATEEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:866:1: ( 'update' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:866:3: 'update'
                    {
                    match(input,19,FOLLOW_19_in_rule__EffectKind__Alternatives1821); 

                    }

                     after(grammarAccess.getEffectKindAccess().getUPDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:871:6: ( ( 'delete' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:871:6: ( ( 'delete' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:872:1: ( 'delete' )
                    {
                     before(grammarAccess.getEffectKindAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:873:1: ( 'delete' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:873:3: 'delete'
                    {
                    match(input,20,FOLLOW_20_in_rule__EffectKind__Alternatives1842); 

                    }

                     after(grammarAccess.getEffectKindAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectKind__Alternatives"


    // $ANTLR start "rule__BooleanLiterals__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:883:1: rule__BooleanLiterals__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanLiterals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:887:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:888:1: ( ( 'true' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:888:1: ( ( 'true' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:889:1: ( 'true' )
                    {
                     before(grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:890:1: ( 'true' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:890:3: 'true'
                    {
                    match(input,21,FOLLOW_21_in_rule__BooleanLiterals__Alternatives1878); 

                    }

                     after(grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:895:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:895:6: ( ( 'false' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:896:1: ( 'false' )
                    {
                     before(grammarAccess.getBooleanLiteralsAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:897:1: ( 'false' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:897:3: 'false'
                    {
                    match(input,22,FOLLOW_22_in_rule__BooleanLiterals__Alternatives1899); 

                    }

                     after(grammarAccess.getBooleanLiteralsAccess().getFalseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiterals__Alternatives"


    // $ANTLR start "rule__VisibilityKind__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:907:1: rule__VisibilityKind__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) );
    public final void rule__VisibilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:911:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:912:1: ( ( '+' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:912:1: ( ( '+' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:913:1: ( '+' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:914:1: ( '+' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:914:3: '+'
                    {
                    match(input,23,FOLLOW_23_in_rule__VisibilityKind__Alternatives1935); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:919:6: ( ( '-' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:919:6: ( ( '-' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:920:1: ( '-' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:921:1: ( '-' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:921:3: '-'
                    {
                    match(input,24,FOLLOW_24_in_rule__VisibilityKind__Alternatives1956); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:926:6: ( ( '#' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:926:6: ( ( '#' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:927:1: ( '#' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:928:1: ( '#' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:928:3: '#'
                    {
                    match(input,25,FOLLOW_25_in_rule__VisibilityKind__Alternatives1977); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:933:6: ( ( '~' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:933:6: ( ( '~' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:934:1: ( '~' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:935:1: ( '~' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:935:3: '~'
                    {
                    match(input,26,FOLLOW_26_in_rule__VisibilityKind__Alternatives1998); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibilityKind__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:945:1: rule__Direction__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) | ( ( 'return' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:949:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'inout' ) ) | ( ( 'return' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:950:1: ( ( 'in' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:950:1: ( ( 'in' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:951:1: ( 'in' )
                    {
                     before(grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:952:1: ( 'in' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:952:3: 'in'
                    {
                    match(input,27,FOLLOW_27_in_rule__Direction__Alternatives2034); 

                    }

                     after(grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:957:6: ( ( 'out' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:957:6: ( ( 'out' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:958:1: ( 'out' )
                    {
                     before(grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:959:1: ( 'out' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:959:3: 'out'
                    {
                    match(input,28,FOLLOW_28_in_rule__Direction__Alternatives2055); 

                    }

                     after(grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:964:6: ( ( 'inout' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:964:6: ( ( 'inout' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:965:1: ( 'inout' )
                    {
                     before(grammarAccess.getDirectionAccess().getINOUTEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:966:1: ( 'inout' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:966:3: 'inout'
                    {
                    match(input,29,FOLLOW_29_in_rule__Direction__Alternatives2076); 

                    }

                     after(grammarAccess.getDirectionAccess().getINOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:971:6: ( ( 'return' ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:971:6: ( ( 'return' ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:972:1: ( 'return' )
                    {
                     before(grammarAccess.getDirectionAccess().getRETURNEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:973:1: ( 'return' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:973:3: 'return'
                    {
                    match(input,30,FOLLOW_30_in_rule__Direction__Alternatives2097); 

                    }

                     after(grammarAccess.getDirectionAccess().getRETURNEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__ParameterRule__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:985:1: rule__ParameterRule__Group__0 : rule__ParameterRule__Group__0__Impl rule__ParameterRule__Group__1 ;
    public final void rule__ParameterRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:989:1: ( rule__ParameterRule__Group__0__Impl rule__ParameterRule__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:990:2: rule__ParameterRule__Group__0__Impl rule__ParameterRule__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__0__Impl_in_rule__ParameterRule__Group__02130);
            rule__ParameterRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterRule__Group__1_in_rule__ParameterRule__Group__02133);
            rule__ParameterRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__0"


    // $ANTLR start "rule__ParameterRule__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:997:1: rule__ParameterRule__Group__0__Impl : ( ( rule__ParameterRule__VisibilityAssignment_0 )? ) ;
    public final void rule__ParameterRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1001:1: ( ( ( rule__ParameterRule__VisibilityAssignment_0 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1002:1: ( ( rule__ParameterRule__VisibilityAssignment_0 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1002:1: ( ( rule__ParameterRule__VisibilityAssignment_0 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1003:1: ( rule__ParameterRule__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterRuleAccess().getVisibilityAssignment_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1004:1: ( rule__ParameterRule__VisibilityAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=26)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1004:2: rule__ParameterRule__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__VisibilityAssignment_0_in_rule__ParameterRule__Group__0__Impl2160);
                    rule__ParameterRule__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterRuleAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__0__Impl"


    // $ANTLR start "rule__ParameterRule__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1014:1: rule__ParameterRule__Group__1 : rule__ParameterRule__Group__1__Impl rule__ParameterRule__Group__2 ;
    public final void rule__ParameterRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1018:1: ( rule__ParameterRule__Group__1__Impl rule__ParameterRule__Group__2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1019:2: rule__ParameterRule__Group__1__Impl rule__ParameterRule__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__1__Impl_in_rule__ParameterRule__Group__12191);
            rule__ParameterRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterRule__Group__2_in_rule__ParameterRule__Group__12194);
            rule__ParameterRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__1"


    // $ANTLR start "rule__ParameterRule__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1026:1: rule__ParameterRule__Group__1__Impl : ( ( rule__ParameterRule__DirectionAssignment_1 )? ) ;
    public final void rule__ParameterRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1030:1: ( ( ( rule__ParameterRule__DirectionAssignment_1 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1031:1: ( ( rule__ParameterRule__DirectionAssignment_1 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1031:1: ( ( rule__ParameterRule__DirectionAssignment_1 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1032:1: ( rule__ParameterRule__DirectionAssignment_1 )?
            {
             before(grammarAccess.getParameterRuleAccess().getDirectionAssignment_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1033:1: ( rule__ParameterRule__DirectionAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=27 && LA11_0<=30)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1033:2: rule__ParameterRule__DirectionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__DirectionAssignment_1_in_rule__ParameterRule__Group__1__Impl2221);
                    rule__ParameterRule__DirectionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterRuleAccess().getDirectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__1__Impl"


    // $ANTLR start "rule__ParameterRule__Group__2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1043:1: rule__ParameterRule__Group__2 : rule__ParameterRule__Group__2__Impl rule__ParameterRule__Group__3 ;
    public final void rule__ParameterRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1047:1: ( rule__ParameterRule__Group__2__Impl rule__ParameterRule__Group__3 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1048:2: rule__ParameterRule__Group__2__Impl rule__ParameterRule__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__2__Impl_in_rule__ParameterRule__Group__22252);
            rule__ParameterRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterRule__Group__3_in_rule__ParameterRule__Group__22255);
            rule__ParameterRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__2"


    // $ANTLR start "rule__ParameterRule__Group__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1055:1: rule__ParameterRule__Group__2__Impl : ( ( rule__ParameterRule__NameAssignment_2 ) ) ;
    public final void rule__ParameterRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1059:1: ( ( ( rule__ParameterRule__NameAssignment_2 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1060:1: ( ( rule__ParameterRule__NameAssignment_2 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1060:1: ( ( rule__ParameterRule__NameAssignment_2 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1061:1: ( rule__ParameterRule__NameAssignment_2 )
            {
             before(grammarAccess.getParameterRuleAccess().getNameAssignment_2()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1062:1: ( rule__ParameterRule__NameAssignment_2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1062:2: rule__ParameterRule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterRule__NameAssignment_2_in_rule__ParameterRule__Group__2__Impl2282);
            rule__ParameterRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__2__Impl"


    // $ANTLR start "rule__ParameterRule__Group__3"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1072:1: rule__ParameterRule__Group__3 : rule__ParameterRule__Group__3__Impl rule__ParameterRule__Group__4 ;
    public final void rule__ParameterRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1076:1: ( rule__ParameterRule__Group__3__Impl rule__ParameterRule__Group__4 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1077:2: rule__ParameterRule__Group__3__Impl rule__ParameterRule__Group__4
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__3__Impl_in_rule__ParameterRule__Group__32312);
            rule__ParameterRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterRule__Group__4_in_rule__ParameterRule__Group__32315);
            rule__ParameterRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__3"


    // $ANTLR start "rule__ParameterRule__Group__3__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1084:1: rule__ParameterRule__Group__3__Impl : ( ( rule__ParameterRule__Group_3__0 )? ) ;
    public final void rule__ParameterRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1088:1: ( ( ( rule__ParameterRule__Group_3__0 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1089:1: ( ( rule__ParameterRule__Group_3__0 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1089:1: ( ( rule__ParameterRule__Group_3__0 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1090:1: ( rule__ParameterRule__Group_3__0 )?
            {
             before(grammarAccess.getParameterRuleAccess().getGroup_3()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1091:1: ( rule__ParameterRule__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1091:2: rule__ParameterRule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__Group_3__0_in_rule__ParameterRule__Group__3__Impl2342);
                    rule__ParameterRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__3__Impl"


    // $ANTLR start "rule__ParameterRule__Group__4"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1101:1: rule__ParameterRule__Group__4 : rule__ParameterRule__Group__4__Impl rule__ParameterRule__Group__5 ;
    public final void rule__ParameterRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1105:1: ( rule__ParameterRule__Group__4__Impl rule__ParameterRule__Group__5 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1106:2: rule__ParameterRule__Group__4__Impl rule__ParameterRule__Group__5
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__4__Impl_in_rule__ParameterRule__Group__42373);
            rule__ParameterRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterRule__Group__5_in_rule__ParameterRule__Group__42376);
            rule__ParameterRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__4"


    // $ANTLR start "rule__ParameterRule__Group__4__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1113:1: rule__ParameterRule__Group__4__Impl : ( ( rule__ParameterRule__MultiplicityAssignment_4 )? ) ;
    public final void rule__ParameterRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1117:1: ( ( ( rule__ParameterRule__MultiplicityAssignment_4 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1118:1: ( ( rule__ParameterRule__MultiplicityAssignment_4 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1118:1: ( ( rule__ParameterRule__MultiplicityAssignment_4 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1119:1: ( rule__ParameterRule__MultiplicityAssignment_4 )?
            {
             before(grammarAccess.getParameterRuleAccess().getMultiplicityAssignment_4()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1120:1: ( rule__ParameterRule__MultiplicityAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1120:2: rule__ParameterRule__MultiplicityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__MultiplicityAssignment_4_in_rule__ParameterRule__Group__4__Impl2403);
                    rule__ParameterRule__MultiplicityAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterRuleAccess().getMultiplicityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__4__Impl"


    // $ANTLR start "rule__ParameterRule__Group__5"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1130:1: rule__ParameterRule__Group__5 : rule__ParameterRule__Group__5__Impl rule__ParameterRule__Group__6 ;
    public final void rule__ParameterRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1134:1: ( rule__ParameterRule__Group__5__Impl rule__ParameterRule__Group__6 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1135:2: rule__ParameterRule__Group__5__Impl rule__ParameterRule__Group__6
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__5__Impl_in_rule__ParameterRule__Group__52434);
            rule__ParameterRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterRule__Group__6_in_rule__ParameterRule__Group__52437);
            rule__ParameterRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__5"


    // $ANTLR start "rule__ParameterRule__Group__5__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1142:1: rule__ParameterRule__Group__5__Impl : ( ( rule__ParameterRule__ModifiersAssignment_5 )? ) ;
    public final void rule__ParameterRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1146:1: ( ( ( rule__ParameterRule__ModifiersAssignment_5 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1147:1: ( ( rule__ParameterRule__ModifiersAssignment_5 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1147:1: ( ( rule__ParameterRule__ModifiersAssignment_5 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1148:1: ( rule__ParameterRule__ModifiersAssignment_5 )?
            {
             before(grammarAccess.getParameterRuleAccess().getModifiersAssignment_5()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1149:1: ( rule__ParameterRule__ModifiersAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=13 && LA14_1<=16)||LA14_1==33) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1149:2: rule__ParameterRule__ModifiersAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__ModifiersAssignment_5_in_rule__ParameterRule__Group__5__Impl2464);
                    rule__ParameterRule__ModifiersAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterRuleAccess().getModifiersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__5__Impl"


    // $ANTLR start "rule__ParameterRule__Group__6"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1159:1: rule__ParameterRule__Group__6 : rule__ParameterRule__Group__6__Impl rule__ParameterRule__Group__7 ;
    public final void rule__ParameterRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1163:1: ( rule__ParameterRule__Group__6__Impl rule__ParameterRule__Group__7 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1164:2: rule__ParameterRule__Group__6__Impl rule__ParameterRule__Group__7
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__6__Impl_in_rule__ParameterRule__Group__62495);
            rule__ParameterRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterRule__Group__7_in_rule__ParameterRule__Group__62498);
            rule__ParameterRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__6"


    // $ANTLR start "rule__ParameterRule__Group__6__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1171:1: rule__ParameterRule__Group__6__Impl : ( ( rule__ParameterRule__EffectAssignment_6 )? ) ;
    public final void rule__ParameterRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1175:1: ( ( ( rule__ParameterRule__EffectAssignment_6 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1176:1: ( ( rule__ParameterRule__EffectAssignment_6 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1176:1: ( ( rule__ParameterRule__EffectAssignment_6 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1177:1: ( rule__ParameterRule__EffectAssignment_6 )?
            {
             before(grammarAccess.getParameterRuleAccess().getEffectAssignment_6()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1178:1: ( rule__ParameterRule__EffectAssignment_6 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1178:2: rule__ParameterRule__EffectAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__EffectAssignment_6_in_rule__ParameterRule__Group__6__Impl2525);
                    rule__ParameterRule__EffectAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterRuleAccess().getEffectAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__6__Impl"


    // $ANTLR start "rule__ParameterRule__Group__7"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1188:1: rule__ParameterRule__Group__7 : rule__ParameterRule__Group__7__Impl ;
    public final void rule__ParameterRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1192:1: ( rule__ParameterRule__Group__7__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1193:2: rule__ParameterRule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group__7__Impl_in_rule__ParameterRule__Group__72556);
            rule__ParameterRule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__7"


    // $ANTLR start "rule__ParameterRule__Group__7__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1199:1: rule__ParameterRule__Group__7__Impl : ( ( rule__ParameterRule__DefaultValueAssignment_7 )? ) ;
    public final void rule__ParameterRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1203:1: ( ( ( rule__ParameterRule__DefaultValueAssignment_7 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1204:1: ( ( rule__ParameterRule__DefaultValueAssignment_7 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1204:1: ( ( rule__ParameterRule__DefaultValueAssignment_7 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1205:1: ( rule__ParameterRule__DefaultValueAssignment_7 )?
            {
             before(grammarAccess.getParameterRuleAccess().getDefaultValueAssignment_7()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1206:1: ( rule__ParameterRule__DefaultValueAssignment_7 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1206:2: rule__ParameterRule__DefaultValueAssignment_7
                    {
                    pushFollow(FOLLOW_rule__ParameterRule__DefaultValueAssignment_7_in_rule__ParameterRule__Group__7__Impl2583);
                    rule__ParameterRule__DefaultValueAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterRuleAccess().getDefaultValueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group__7__Impl"


    // $ANTLR start "rule__ParameterRule__Group_3__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1232:1: rule__ParameterRule__Group_3__0 : rule__ParameterRule__Group_3__0__Impl rule__ParameterRule__Group_3__1 ;
    public final void rule__ParameterRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1236:1: ( rule__ParameterRule__Group_3__0__Impl rule__ParameterRule__Group_3__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1237:2: rule__ParameterRule__Group_3__0__Impl rule__ParameterRule__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group_3__0__Impl_in_rule__ParameterRule__Group_3__02630);
            rule__ParameterRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterRule__Group_3__1_in_rule__ParameterRule__Group_3__02633);
            rule__ParameterRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group_3__0"


    // $ANTLR start "rule__ParameterRule__Group_3__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1244:1: rule__ParameterRule__Group_3__0__Impl : ( ':' ) ;
    public final void rule__ParameterRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1248:1: ( ( ':' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1249:1: ( ':' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1249:1: ( ':' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1250:1: ':'
            {
             before(grammarAccess.getParameterRuleAccess().getColonKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__ParameterRule__Group_3__0__Impl2661); 
             after(grammarAccess.getParameterRuleAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterRule__Group_3__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1263:1: rule__ParameterRule__Group_3__1 : rule__ParameterRule__Group_3__1__Impl ;
    public final void rule__ParameterRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1267:1: ( rule__ParameterRule__Group_3__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1268:2: rule__ParameterRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterRule__Group_3__1__Impl_in_rule__ParameterRule__Group_3__12692);
            rule__ParameterRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group_3__1"


    // $ANTLR start "rule__ParameterRule__Group_3__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1274:1: rule__ParameterRule__Group_3__1__Impl : ( ( rule__ParameterRule__Alternatives_3_1 ) ) ;
    public final void rule__ParameterRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1278:1: ( ( ( rule__ParameterRule__Alternatives_3_1 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1279:1: ( ( rule__ParameterRule__Alternatives_3_1 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1279:1: ( ( rule__ParameterRule__Alternatives_3_1 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1280:1: ( rule__ParameterRule__Alternatives_3_1 )
            {
             before(grammarAccess.getParameterRuleAccess().getAlternatives_3_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1281:1: ( rule__ParameterRule__Alternatives_3_1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1281:2: rule__ParameterRule__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__ParameterRule__Alternatives_3_1_in_rule__ParameterRule__Group_3__1__Impl2719);
            rule__ParameterRule__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterRuleAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__Group_3__1__Impl"


    // $ANTLR start "rule__ModifiersRule__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1295:1: rule__ModifiersRule__Group__0 : rule__ModifiersRule__Group__0__Impl rule__ModifiersRule__Group__1 ;
    public final void rule__ModifiersRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1299:1: ( rule__ModifiersRule__Group__0__Impl rule__ModifiersRule__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1300:2: rule__ModifiersRule__Group__0__Impl rule__ModifiersRule__Group__1
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group__0__Impl_in_rule__ModifiersRule__Group__02753);
            rule__ModifiersRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifiersRule__Group__1_in_rule__ModifiersRule__Group__02756);
            rule__ModifiersRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group__0"


    // $ANTLR start "rule__ModifiersRule__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1307:1: rule__ModifiersRule__Group__0__Impl : ( () ) ;
    public final void rule__ModifiersRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1311:1: ( ( () ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1312:1: ( () )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1312:1: ( () )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1313:1: ()
            {
             before(grammarAccess.getModifiersRuleAccess().getModifiersRuleAction_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1314:1: ()
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1316:1: 
            {
            }

             after(grammarAccess.getModifiersRuleAccess().getModifiersRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group__0__Impl"


    // $ANTLR start "rule__ModifiersRule__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1326:1: rule__ModifiersRule__Group__1 : rule__ModifiersRule__Group__1__Impl rule__ModifiersRule__Group__2 ;
    public final void rule__ModifiersRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1330:1: ( rule__ModifiersRule__Group__1__Impl rule__ModifiersRule__Group__2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1331:2: rule__ModifiersRule__Group__1__Impl rule__ModifiersRule__Group__2
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group__1__Impl_in_rule__ModifiersRule__Group__12814);
            rule__ModifiersRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifiersRule__Group__2_in_rule__ModifiersRule__Group__12817);
            rule__ModifiersRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group__1"


    // $ANTLR start "rule__ModifiersRule__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1338:1: rule__ModifiersRule__Group__1__Impl : ( '{' ) ;
    public final void rule__ModifiersRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1342:1: ( ( '{' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1343:1: ( '{' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1343:1: ( '{' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1344:1: '{'
            {
             before(grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__ModifiersRule__Group__1__Impl2845); 
             after(grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group__1__Impl"


    // $ANTLR start "rule__ModifiersRule__Group__2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1357:1: rule__ModifiersRule__Group__2 : rule__ModifiersRule__Group__2__Impl rule__ModifiersRule__Group__3 ;
    public final void rule__ModifiersRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1361:1: ( rule__ModifiersRule__Group__2__Impl rule__ModifiersRule__Group__3 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1362:2: rule__ModifiersRule__Group__2__Impl rule__ModifiersRule__Group__3
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group__2__Impl_in_rule__ModifiersRule__Group__22876);
            rule__ModifiersRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifiersRule__Group__3_in_rule__ModifiersRule__Group__22879);
            rule__ModifiersRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group__2"


    // $ANTLR start "rule__ModifiersRule__Group__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1369:1: rule__ModifiersRule__Group__2__Impl : ( ( rule__ModifiersRule__Group_2__0 )? ) ;
    public final void rule__ModifiersRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1373:1: ( ( ( rule__ModifiersRule__Group_2__0 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1374:1: ( ( rule__ModifiersRule__Group_2__0 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1374:1: ( ( rule__ModifiersRule__Group_2__0 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1375:1: ( rule__ModifiersRule__Group_2__0 )?
            {
             before(grammarAccess.getModifiersRuleAccess().getGroup_2()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1376:1: ( rule__ModifiersRule__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=13 && LA17_0<=16)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1376:2: rule__ModifiersRule__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ModifiersRule__Group_2__0_in_rule__ModifiersRule__Group__2__Impl2906);
                    rule__ModifiersRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModifiersRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group__2__Impl"


    // $ANTLR start "rule__ModifiersRule__Group__3"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1386:1: rule__ModifiersRule__Group__3 : rule__ModifiersRule__Group__3__Impl ;
    public final void rule__ModifiersRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1390:1: ( rule__ModifiersRule__Group__3__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1391:2: rule__ModifiersRule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group__3__Impl_in_rule__ModifiersRule__Group__32937);
            rule__ModifiersRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group__3"


    // $ANTLR start "rule__ModifiersRule__Group__3__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1397:1: rule__ModifiersRule__Group__3__Impl : ( '}' ) ;
    public final void rule__ModifiersRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1401:1: ( ( '}' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1402:1: ( '}' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1402:1: ( '}' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1403:1: '}'
            {
             before(grammarAccess.getModifiersRuleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__ModifiersRule__Group__3__Impl2965); 
             after(grammarAccess.getModifiersRuleAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group__3__Impl"


    // $ANTLR start "rule__ModifiersRule__Group_2__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1424:1: rule__ModifiersRule__Group_2__0 : rule__ModifiersRule__Group_2__0__Impl rule__ModifiersRule__Group_2__1 ;
    public final void rule__ModifiersRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1428:1: ( rule__ModifiersRule__Group_2__0__Impl rule__ModifiersRule__Group_2__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1429:2: rule__ModifiersRule__Group_2__0__Impl rule__ModifiersRule__Group_2__1
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group_2__0__Impl_in_rule__ModifiersRule__Group_2__03004);
            rule__ModifiersRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifiersRule__Group_2__1_in_rule__ModifiersRule__Group_2__03007);
            rule__ModifiersRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group_2__0"


    // $ANTLR start "rule__ModifiersRule__Group_2__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1436:1: rule__ModifiersRule__Group_2__0__Impl : ( ( rule__ModifiersRule__ValuesAssignment_2_0 ) ) ;
    public final void rule__ModifiersRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1440:1: ( ( ( rule__ModifiersRule__ValuesAssignment_2_0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1441:1: ( ( rule__ModifiersRule__ValuesAssignment_2_0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1441:1: ( ( rule__ModifiersRule__ValuesAssignment_2_0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1442:1: ( rule__ModifiersRule__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1443:1: ( rule__ModifiersRule__ValuesAssignment_2_0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1443:2: rule__ModifiersRule__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ModifiersRule__ValuesAssignment_2_0_in_rule__ModifiersRule__Group_2__0__Impl3034);
            rule__ModifiersRule__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group_2__0__Impl"


    // $ANTLR start "rule__ModifiersRule__Group_2__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1453:1: rule__ModifiersRule__Group_2__1 : rule__ModifiersRule__Group_2__1__Impl ;
    public final void rule__ModifiersRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1457:1: ( rule__ModifiersRule__Group_2__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1458:2: rule__ModifiersRule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group_2__1__Impl_in_rule__ModifiersRule__Group_2__13064);
            rule__ModifiersRule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group_2__1"


    // $ANTLR start "rule__ModifiersRule__Group_2__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1464:1: rule__ModifiersRule__Group_2__1__Impl : ( ( rule__ModifiersRule__Group_2_1__0 )* ) ;
    public final void rule__ModifiersRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1468:1: ( ( ( rule__ModifiersRule__Group_2_1__0 )* ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1469:1: ( ( rule__ModifiersRule__Group_2_1__0 )* )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1469:1: ( ( rule__ModifiersRule__Group_2_1__0 )* )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1470:1: ( rule__ModifiersRule__Group_2_1__0 )*
            {
             before(grammarAccess.getModifiersRuleAccess().getGroup_2_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1471:1: ( rule__ModifiersRule__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1471:2: rule__ModifiersRule__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ModifiersRule__Group_2_1__0_in_rule__ModifiersRule__Group_2__1__Impl3091);
            	    rule__ModifiersRule__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModifiersRuleAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group_2__1__Impl"


    // $ANTLR start "rule__ModifiersRule__Group_2_1__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1485:1: rule__ModifiersRule__Group_2_1__0 : rule__ModifiersRule__Group_2_1__0__Impl rule__ModifiersRule__Group_2_1__1 ;
    public final void rule__ModifiersRule__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1489:1: ( rule__ModifiersRule__Group_2_1__0__Impl rule__ModifiersRule__Group_2_1__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1490:2: rule__ModifiersRule__Group_2_1__0__Impl rule__ModifiersRule__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group_2_1__0__Impl_in_rule__ModifiersRule__Group_2_1__03126);
            rule__ModifiersRule__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifiersRule__Group_2_1__1_in_rule__ModifiersRule__Group_2_1__03129);
            rule__ModifiersRule__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group_2_1__0"


    // $ANTLR start "rule__ModifiersRule__Group_2_1__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1497:1: rule__ModifiersRule__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ModifiersRule__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1501:1: ( ( ',' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1502:1: ( ',' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1502:1: ( ',' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1503:1: ','
            {
             before(grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_1_0()); 
            match(input,34,FOLLOW_34_in_rule__ModifiersRule__Group_2_1__0__Impl3157); 
             after(grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group_2_1__0__Impl"


    // $ANTLR start "rule__ModifiersRule__Group_2_1__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1516:1: rule__ModifiersRule__Group_2_1__1 : rule__ModifiersRule__Group_2_1__1__Impl ;
    public final void rule__ModifiersRule__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1520:1: ( rule__ModifiersRule__Group_2_1__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1521:2: rule__ModifiersRule__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ModifiersRule__Group_2_1__1__Impl_in_rule__ModifiersRule__Group_2_1__13188);
            rule__ModifiersRule__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group_2_1__1"


    // $ANTLR start "rule__ModifiersRule__Group_2_1__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1527:1: rule__ModifiersRule__Group_2_1__1__Impl : ( ( rule__ModifiersRule__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__ModifiersRule__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1531:1: ( ( ( rule__ModifiersRule__ValuesAssignment_2_1_1 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1532:1: ( ( rule__ModifiersRule__ValuesAssignment_2_1_1 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1532:1: ( ( rule__ModifiersRule__ValuesAssignment_2_1_1 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1533:1: ( rule__ModifiersRule__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_1_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1534:1: ( rule__ModifiersRule__ValuesAssignment_2_1_1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1534:2: rule__ModifiersRule__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ModifiersRule__ValuesAssignment_2_1_1_in_rule__ModifiersRule__Group_2_1__1__Impl3215);
            rule__ModifiersRule__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModifiersRuleAccess().getValuesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__Group_2_1__1__Impl"


    // $ANTLR start "rule__EffectRule__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1548:1: rule__EffectRule__Group__0 : rule__EffectRule__Group__0__Impl rule__EffectRule__Group__1 ;
    public final void rule__EffectRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1552:1: ( rule__EffectRule__Group__0__Impl rule__EffectRule__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1553:2: rule__EffectRule__Group__0__Impl rule__EffectRule__Group__1
            {
            pushFollow(FOLLOW_rule__EffectRule__Group__0__Impl_in_rule__EffectRule__Group__03249);
            rule__EffectRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectRule__Group__1_in_rule__EffectRule__Group__03252);
            rule__EffectRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__Group__0"


    // $ANTLR start "rule__EffectRule__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1560:1: rule__EffectRule__Group__0__Impl : ( '{' ) ;
    public final void rule__EffectRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1564:1: ( ( '{' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1565:1: ( '{' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1565:1: ( '{' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1566:1: '{'
            {
             before(grammarAccess.getEffectRuleAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__EffectRule__Group__0__Impl3280); 
             after(grammarAccess.getEffectRuleAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__Group__0__Impl"


    // $ANTLR start "rule__EffectRule__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1579:1: rule__EffectRule__Group__1 : rule__EffectRule__Group__1__Impl rule__EffectRule__Group__2 ;
    public final void rule__EffectRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1583:1: ( rule__EffectRule__Group__1__Impl rule__EffectRule__Group__2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1584:2: rule__EffectRule__Group__1__Impl rule__EffectRule__Group__2
            {
            pushFollow(FOLLOW_rule__EffectRule__Group__1__Impl_in_rule__EffectRule__Group__13311);
            rule__EffectRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectRule__Group__2_in_rule__EffectRule__Group__13314);
            rule__EffectRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__Group__1"


    // $ANTLR start "rule__EffectRule__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1591:1: rule__EffectRule__Group__1__Impl : ( 'effect:' ) ;
    public final void rule__EffectRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1595:1: ( ( 'effect:' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1596:1: ( 'effect:' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1596:1: ( 'effect:' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1597:1: 'effect:'
            {
             before(grammarAccess.getEffectRuleAccess().getEffectKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__EffectRule__Group__1__Impl3342); 
             after(grammarAccess.getEffectRuleAccess().getEffectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__Group__1__Impl"


    // $ANTLR start "rule__EffectRule__Group__2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1610:1: rule__EffectRule__Group__2 : rule__EffectRule__Group__2__Impl rule__EffectRule__Group__3 ;
    public final void rule__EffectRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1614:1: ( rule__EffectRule__Group__2__Impl rule__EffectRule__Group__3 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1615:2: rule__EffectRule__Group__2__Impl rule__EffectRule__Group__3
            {
            pushFollow(FOLLOW_rule__EffectRule__Group__2__Impl_in_rule__EffectRule__Group__23373);
            rule__EffectRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectRule__Group__3_in_rule__EffectRule__Group__23376);
            rule__EffectRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__Group__2"


    // $ANTLR start "rule__EffectRule__Group__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1622:1: rule__EffectRule__Group__2__Impl : ( ( rule__EffectRule__EffectKindAssignment_2 ) ) ;
    public final void rule__EffectRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1626:1: ( ( ( rule__EffectRule__EffectKindAssignment_2 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1627:1: ( ( rule__EffectRule__EffectKindAssignment_2 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1627:1: ( ( rule__EffectRule__EffectKindAssignment_2 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1628:1: ( rule__EffectRule__EffectKindAssignment_2 )
            {
             before(grammarAccess.getEffectRuleAccess().getEffectKindAssignment_2()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1629:1: ( rule__EffectRule__EffectKindAssignment_2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1629:2: rule__EffectRule__EffectKindAssignment_2
            {
            pushFollow(FOLLOW_rule__EffectRule__EffectKindAssignment_2_in_rule__EffectRule__Group__2__Impl3403);
            rule__EffectRule__EffectKindAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectRuleAccess().getEffectKindAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__Group__2__Impl"


    // $ANTLR start "rule__EffectRule__Group__3"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1639:1: rule__EffectRule__Group__3 : rule__EffectRule__Group__3__Impl ;
    public final void rule__EffectRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1643:1: ( rule__EffectRule__Group__3__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1644:2: rule__EffectRule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EffectRule__Group__3__Impl_in_rule__EffectRule__Group__33433);
            rule__EffectRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__Group__3"


    // $ANTLR start "rule__EffectRule__Group__3__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1650:1: rule__EffectRule__Group__3__Impl : ( '}' ) ;
    public final void rule__EffectRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1654:1: ( ( '}' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1655:1: ( '}' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1655:1: ( '}' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1656:1: '}'
            {
             before(grammarAccess.getEffectRuleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__EffectRule__Group__3__Impl3461); 
             after(grammarAccess.getEffectRuleAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__Group__3__Impl"


    // $ANTLR start "rule__DefaultValueRule__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1677:1: rule__DefaultValueRule__Group__0 : rule__DefaultValueRule__Group__0__Impl rule__DefaultValueRule__Group__1 ;
    public final void rule__DefaultValueRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1681:1: ( rule__DefaultValueRule__Group__0__Impl rule__DefaultValueRule__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1682:2: rule__DefaultValueRule__Group__0__Impl rule__DefaultValueRule__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultValueRule__Group__0__Impl_in_rule__DefaultValueRule__Group__03500);
            rule__DefaultValueRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultValueRule__Group__1_in_rule__DefaultValueRule__Group__03503);
            rule__DefaultValueRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueRule__Group__0"


    // $ANTLR start "rule__DefaultValueRule__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1689:1: rule__DefaultValueRule__Group__0__Impl : ( '=' ) ;
    public final void rule__DefaultValueRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1693:1: ( ( '=' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1694:1: ( '=' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1694:1: ( '=' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1695:1: '='
            {
             before(grammarAccess.getDefaultValueRuleAccess().getEqualsSignKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__DefaultValueRule__Group__0__Impl3531); 
             after(grammarAccess.getDefaultValueRuleAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueRule__Group__0__Impl"


    // $ANTLR start "rule__DefaultValueRule__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1708:1: rule__DefaultValueRule__Group__1 : rule__DefaultValueRule__Group__1__Impl ;
    public final void rule__DefaultValueRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1712:1: ( rule__DefaultValueRule__Group__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1713:2: rule__DefaultValueRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DefaultValueRule__Group__1__Impl_in_rule__DefaultValueRule__Group__13562);
            rule__DefaultValueRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueRule__Group__1"


    // $ANTLR start "rule__DefaultValueRule__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1719:1: rule__DefaultValueRule__Group__1__Impl : ( ( rule__DefaultValueRule__DefaultAssignment_1 ) ) ;
    public final void rule__DefaultValueRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1723:1: ( ( ( rule__DefaultValueRule__DefaultAssignment_1 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1724:1: ( ( rule__DefaultValueRule__DefaultAssignment_1 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1724:1: ( ( rule__DefaultValueRule__DefaultAssignment_1 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1725:1: ( rule__DefaultValueRule__DefaultAssignment_1 )
            {
             before(grammarAccess.getDefaultValueRuleAccess().getDefaultAssignment_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1726:1: ( rule__DefaultValueRule__DefaultAssignment_1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1726:2: rule__DefaultValueRule__DefaultAssignment_1
            {
            pushFollow(FOLLOW_rule__DefaultValueRule__DefaultAssignment_1_in_rule__DefaultValueRule__Group__1__Impl3589);
            rule__DefaultValueRule__DefaultAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultValueRuleAccess().getDefaultAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueRule__Group__1__Impl"


    // $ANTLR start "rule__RealValue__Group_0__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1740:1: rule__RealValue__Group_0__0 : rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 ;
    public final void rule__RealValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1744:1: ( rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1745:2: rule__RealValue__Group_0__0__Impl rule__RealValue__Group_0__1
            {
            pushFollow(FOLLOW_rule__RealValue__Group_0__0__Impl_in_rule__RealValue__Group_0__03623);
            rule__RealValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RealValue__Group_0__1_in_rule__RealValue__Group_0__03626);
            rule__RealValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__0"


    // $ANTLR start "rule__RealValue__Group_0__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1752:1: rule__RealValue__Group_0__0__Impl : ( ( rule__RealValue__IntegerAssignment_0_0 ) ) ;
    public final void rule__RealValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1756:1: ( ( ( rule__RealValue__IntegerAssignment_0_0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1757:1: ( ( rule__RealValue__IntegerAssignment_0_0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1757:1: ( ( rule__RealValue__IntegerAssignment_0_0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1758:1: ( rule__RealValue__IntegerAssignment_0_0 )
            {
             before(grammarAccess.getRealValueAccess().getIntegerAssignment_0_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1759:1: ( rule__RealValue__IntegerAssignment_0_0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1759:2: rule__RealValue__IntegerAssignment_0_0
            {
            pushFollow(FOLLOW_rule__RealValue__IntegerAssignment_0_0_in_rule__RealValue__Group_0__0__Impl3653);
            rule__RealValue__IntegerAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getIntegerAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__0__Impl"


    // $ANTLR start "rule__RealValue__Group_0__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1769:1: rule__RealValue__Group_0__1 : rule__RealValue__Group_0__1__Impl ;
    public final void rule__RealValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1773:1: ( rule__RealValue__Group_0__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1774:2: rule__RealValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__RealValue__Group_0__1__Impl_in_rule__RealValue__Group_0__13683);
            rule__RealValue__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__1"


    // $ANTLR start "rule__RealValue__Group_0__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1780:1: rule__RealValue__Group_0__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1784:1: ( ( '.' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1785:1: ( '.' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1785:1: ( '.' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1786:1: '.'
            {
             before(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1()); 
            match(input,37,FOLLOW_37_in_rule__RealValue__Group_0__1__Impl3711); 
             after(grammarAccess.getRealValueAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_0__1__Impl"


    // $ANTLR start "rule__RealValue__Group_1__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1803:1: rule__RealValue__Group_1__0 : rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 ;
    public final void rule__RealValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1807:1: ( rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1808:2: rule__RealValue__Group_1__0__Impl rule__RealValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__RealValue__Group_1__0__Impl_in_rule__RealValue__Group_1__03746);
            rule__RealValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RealValue__Group_1__1_in_rule__RealValue__Group_1__03749);
            rule__RealValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__0"


    // $ANTLR start "rule__RealValue__Group_1__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1815:1: rule__RealValue__Group_1__0__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1819:1: ( ( '.' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1820:1: ( '.' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1820:1: ( '.' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1821:1: '.'
            {
             before(grammarAccess.getRealValueAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__RealValue__Group_1__0__Impl3777); 
             after(grammarAccess.getRealValueAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__0__Impl"


    // $ANTLR start "rule__RealValue__Group_1__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1834:1: rule__RealValue__Group_1__1 : rule__RealValue__Group_1__1__Impl ;
    public final void rule__RealValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1838:1: ( rule__RealValue__Group_1__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1839:2: rule__RealValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RealValue__Group_1__1__Impl_in_rule__RealValue__Group_1__13808);
            rule__RealValue__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__1"


    // $ANTLR start "rule__RealValue__Group_1__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1845:1: rule__RealValue__Group_1__1__Impl : ( ( rule__RealValue__FractionAssignment_1_1 ) ) ;
    public final void rule__RealValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1849:1: ( ( ( rule__RealValue__FractionAssignment_1_1 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1850:1: ( ( rule__RealValue__FractionAssignment_1_1 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1850:1: ( ( rule__RealValue__FractionAssignment_1_1 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1851:1: ( rule__RealValue__FractionAssignment_1_1 )
            {
             before(grammarAccess.getRealValueAccess().getFractionAssignment_1_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1852:1: ( rule__RealValue__FractionAssignment_1_1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1852:2: rule__RealValue__FractionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RealValue__FractionAssignment_1_1_in_rule__RealValue__Group_1__1__Impl3835);
            rule__RealValue__FractionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getFractionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_1__1__Impl"


    // $ANTLR start "rule__RealValue__Group_2__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1866:1: rule__RealValue__Group_2__0 : rule__RealValue__Group_2__0__Impl rule__RealValue__Group_2__1 ;
    public final void rule__RealValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1870:1: ( rule__RealValue__Group_2__0__Impl rule__RealValue__Group_2__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1871:2: rule__RealValue__Group_2__0__Impl rule__RealValue__Group_2__1
            {
            pushFollow(FOLLOW_rule__RealValue__Group_2__0__Impl_in_rule__RealValue__Group_2__03869);
            rule__RealValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RealValue__Group_2__1_in_rule__RealValue__Group_2__03872);
            rule__RealValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_2__0"


    // $ANTLR start "rule__RealValue__Group_2__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1878:1: rule__RealValue__Group_2__0__Impl : ( ( rule__RealValue__IntegerAssignment_2_0 ) ) ;
    public final void rule__RealValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1882:1: ( ( ( rule__RealValue__IntegerAssignment_2_0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1883:1: ( ( rule__RealValue__IntegerAssignment_2_0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1883:1: ( ( rule__RealValue__IntegerAssignment_2_0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1884:1: ( rule__RealValue__IntegerAssignment_2_0 )
            {
             before(grammarAccess.getRealValueAccess().getIntegerAssignment_2_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1885:1: ( rule__RealValue__IntegerAssignment_2_0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1885:2: rule__RealValue__IntegerAssignment_2_0
            {
            pushFollow(FOLLOW_rule__RealValue__IntegerAssignment_2_0_in_rule__RealValue__Group_2__0__Impl3899);
            rule__RealValue__IntegerAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getIntegerAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_2__0__Impl"


    // $ANTLR start "rule__RealValue__Group_2__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1895:1: rule__RealValue__Group_2__1 : rule__RealValue__Group_2__1__Impl rule__RealValue__Group_2__2 ;
    public final void rule__RealValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1899:1: ( rule__RealValue__Group_2__1__Impl rule__RealValue__Group_2__2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1900:2: rule__RealValue__Group_2__1__Impl rule__RealValue__Group_2__2
            {
            pushFollow(FOLLOW_rule__RealValue__Group_2__1__Impl_in_rule__RealValue__Group_2__13929);
            rule__RealValue__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RealValue__Group_2__2_in_rule__RealValue__Group_2__13932);
            rule__RealValue__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_2__1"


    // $ANTLR start "rule__RealValue__Group_2__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1907:1: rule__RealValue__Group_2__1__Impl : ( '.' ) ;
    public final void rule__RealValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1911:1: ( ( '.' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1912:1: ( '.' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1912:1: ( '.' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1913:1: '.'
            {
             before(grammarAccess.getRealValueAccess().getFullStopKeyword_2_1()); 
            match(input,37,FOLLOW_37_in_rule__RealValue__Group_2__1__Impl3960); 
             after(grammarAccess.getRealValueAccess().getFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_2__1__Impl"


    // $ANTLR start "rule__RealValue__Group_2__2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1926:1: rule__RealValue__Group_2__2 : rule__RealValue__Group_2__2__Impl ;
    public final void rule__RealValue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1930:1: ( rule__RealValue__Group_2__2__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1931:2: rule__RealValue__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__RealValue__Group_2__2__Impl_in_rule__RealValue__Group_2__23991);
            rule__RealValue__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_2__2"


    // $ANTLR start "rule__RealValue__Group_2__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1937:1: rule__RealValue__Group_2__2__Impl : ( ( rule__RealValue__FractionAssignment_2_2 ) ) ;
    public final void rule__RealValue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1941:1: ( ( ( rule__RealValue__FractionAssignment_2_2 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1942:1: ( ( rule__RealValue__FractionAssignment_2_2 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1942:1: ( ( rule__RealValue__FractionAssignment_2_2 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1943:1: ( rule__RealValue__FractionAssignment_2_2 )
            {
             before(grammarAccess.getRealValueAccess().getFractionAssignment_2_2()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1944:1: ( rule__RealValue__FractionAssignment_2_2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1944:2: rule__RealValue__FractionAssignment_2_2
            {
            pushFollow(FOLLOW_rule__RealValue__FractionAssignment_2_2_in_rule__RealValue__Group_2__2__Impl4018);
            rule__RealValue__FractionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getFractionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group_2__2__Impl"


    // $ANTLR start "rule__NullValue__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1960:1: rule__NullValue__Group__0 : rule__NullValue__Group__0__Impl rule__NullValue__Group__1 ;
    public final void rule__NullValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1964:1: ( rule__NullValue__Group__0__Impl rule__NullValue__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1965:2: rule__NullValue__Group__0__Impl rule__NullValue__Group__1
            {
            pushFollow(FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__04054);
            rule__NullValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__04057);
            rule__NullValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__0"


    // $ANTLR start "rule__NullValue__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1972:1: rule__NullValue__Group__0__Impl : ( () ) ;
    public final void rule__NullValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1976:1: ( ( () ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1977:1: ( () )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1977:1: ( () )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1978:1: ()
            {
             before(grammarAccess.getNullValueAccess().getNullValueAction_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1979:1: ()
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1981:1: 
            {
            }

             after(grammarAccess.getNullValueAccess().getNullValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__0__Impl"


    // $ANTLR start "rule__NullValue__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1991:1: rule__NullValue__Group__1 : rule__NullValue__Group__1__Impl ;
    public final void rule__NullValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1995:1: ( rule__NullValue__Group__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:1996:2: rule__NullValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__14115);
            rule__NullValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__1"


    // $ANTLR start "rule__NullValue__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2002:1: rule__NullValue__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2006:1: ( ( 'null' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2007:1: ( 'null' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2007:1: ( 'null' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2008:1: 'null'
            {
             before(grammarAccess.getNullValueAccess().getNullKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__NullValue__Group__1__Impl4143); 
             after(grammarAccess.getNullValueAccess().getNullKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__1__Impl"


    // $ANTLR start "rule__NoValue__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2025:1: rule__NoValue__Group__0 : rule__NoValue__Group__0__Impl rule__NoValue__Group__1 ;
    public final void rule__NoValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2029:1: ( rule__NoValue__Group__0__Impl rule__NoValue__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2030:2: rule__NoValue__Group__0__Impl rule__NoValue__Group__1
            {
            pushFollow(FOLLOW_rule__NoValue__Group__0__Impl_in_rule__NoValue__Group__04178);
            rule__NoValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoValue__Group__1_in_rule__NoValue__Group__04181);
            rule__NoValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoValue__Group__0"


    // $ANTLR start "rule__NoValue__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2037:1: rule__NoValue__Group__0__Impl : ( () ) ;
    public final void rule__NoValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2041:1: ( ( () ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2042:1: ( () )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2042:1: ( () )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2043:1: ()
            {
             before(grammarAccess.getNoValueAccess().getNoValueAction_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2044:1: ()
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2046:1: 
            {
            }

             after(grammarAccess.getNoValueAccess().getNoValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoValue__Group__0__Impl"


    // $ANTLR start "rule__NoValue__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2056:1: rule__NoValue__Group__1 : rule__NoValue__Group__1__Impl ;
    public final void rule__NoValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2060:1: ( rule__NoValue__Group__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2061:2: rule__NoValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoValue__Group__1__Impl_in_rule__NoValue__Group__14239);
            rule__NoValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoValue__Group__1"


    // $ANTLR start "rule__NoValue__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2067:1: rule__NoValue__Group__1__Impl : ( 'none' ) ;
    public final void rule__NoValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2071:1: ( ( 'none' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2072:1: ( 'none' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2072:1: ( 'none' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2073:1: 'none'
            {
             before(grammarAccess.getNoValueAccess().getNoneKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__NoValue__Group__1__Impl4267); 
             after(grammarAccess.getNoValueAccess().getNoneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoValue__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2090:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2094:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2095:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04302);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04305);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2102:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__PathAssignment_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2106:1: ( ( ( rule__QualifiedName__PathAssignment_0 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2107:1: ( ( rule__QualifiedName__PathAssignment_0 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2107:1: ( ( rule__QualifiedName__PathAssignment_0 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2108:1: ( rule__QualifiedName__PathAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getPathAssignment_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2109:1: ( rule__QualifiedName__PathAssignment_0 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2109:2: rule__QualifiedName__PathAssignment_0
            {
            pushFollow(FOLLOW_rule__QualifiedName__PathAssignment_0_in_rule__QualifiedName__Group__0__Impl4332);
            rule__QualifiedName__PathAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getPathAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2119:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2123:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2124:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14362);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__14365);
            rule__QualifiedName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2131:1: rule__QualifiedName__Group__1__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2135:1: ( ( '::' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2136:1: ( '::' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2136:1: ( '::' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2137:1: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__QualifiedName__Group__1__Impl4393); 
             after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2150:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
    public final void rule__QualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2154:1: ( rule__QualifiedName__Group__2__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2155:2: rule__QualifiedName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__24424);
            rule__QualifiedName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2"


    // $ANTLR start "rule__QualifiedName__Group__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2161:1: rule__QualifiedName__Group__2__Impl : ( ( rule__QualifiedName__RemainingAssignment_2 )? ) ;
    public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2165:1: ( ( ( rule__QualifiedName__RemainingAssignment_2 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2166:1: ( ( rule__QualifiedName__RemainingAssignment_2 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2166:1: ( ( rule__QualifiedName__RemainingAssignment_2 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2167:1: ( rule__QualifiedName__RemainingAssignment_2 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2168:1: ( rule__QualifiedName__RemainingAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==40) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2168:2: rule__QualifiedName__RemainingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__QualifiedName__RemainingAssignment_2_in_rule__QualifiedName__Group__2__Impl4451);
                    rule__QualifiedName__RemainingAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2__Impl"


    // $ANTLR start "rule__TypeRule__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2184:1: rule__TypeRule__Group__0 : rule__TypeRule__Group__0__Impl rule__TypeRule__Group__1 ;
    public final void rule__TypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2188:1: ( rule__TypeRule__Group__0__Impl rule__TypeRule__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2189:2: rule__TypeRule__Group__0__Impl rule__TypeRule__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRule__Group__0__Impl_in_rule__TypeRule__Group__04488);
            rule__TypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRule__Group__1_in_rule__TypeRule__Group__04491);
            rule__TypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRule__Group__0"


    // $ANTLR start "rule__TypeRule__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2196:1: rule__TypeRule__Group__0__Impl : ( ( rule__TypeRule__PathAssignment_0 )? ) ;
    public final void rule__TypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2200:1: ( ( ( rule__TypeRule__PathAssignment_0 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2201:1: ( ( rule__TypeRule__PathAssignment_0 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2201:1: ( ( rule__TypeRule__PathAssignment_0 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2202:1: ( rule__TypeRule__PathAssignment_0 )?
            {
             before(grammarAccess.getTypeRuleAccess().getPathAssignment_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2203:1: ( rule__TypeRule__PathAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==40) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2203:2: rule__TypeRule__PathAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeRule__PathAssignment_0_in_rule__TypeRule__Group__0__Impl4518);
                    rule__TypeRule__PathAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRuleAccess().getPathAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRule__Group__0__Impl"


    // $ANTLR start "rule__TypeRule__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2213:1: rule__TypeRule__Group__1 : rule__TypeRule__Group__1__Impl ;
    public final void rule__TypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2217:1: ( rule__TypeRule__Group__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2218:2: rule__TypeRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRule__Group__1__Impl_in_rule__TypeRule__Group__14549);
            rule__TypeRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRule__Group__1"


    // $ANTLR start "rule__TypeRule__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2224:1: rule__TypeRule__Group__1__Impl : ( ( rule__TypeRule__TypeAssignment_1 ) ) ;
    public final void rule__TypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2228:1: ( ( ( rule__TypeRule__TypeAssignment_1 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2229:1: ( ( rule__TypeRule__TypeAssignment_1 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2229:1: ( ( rule__TypeRule__TypeAssignment_1 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2230:1: ( rule__TypeRule__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeRuleAccess().getTypeAssignment_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2231:1: ( rule__TypeRule__TypeAssignment_1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2231:2: rule__TypeRule__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeRule__TypeAssignment_1_in_rule__TypeRule__Group__1__Impl4576);
            rule__TypeRule__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeRuleAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRule__Group__1__Impl"


    // $ANTLR start "rule__MultiplicityRule__Group__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2245:1: rule__MultiplicityRule__Group__0 : rule__MultiplicityRule__Group__0__Impl rule__MultiplicityRule__Group__1 ;
    public final void rule__MultiplicityRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2249:1: ( rule__MultiplicityRule__Group__0__Impl rule__MultiplicityRule__Group__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2250:2: rule__MultiplicityRule__Group__0__Impl rule__MultiplicityRule__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__Group__0__Impl_in_rule__MultiplicityRule__Group__04610);
            rule__MultiplicityRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityRule__Group__1_in_rule__MultiplicityRule__Group__04613);
            rule__MultiplicityRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group__0"


    // $ANTLR start "rule__MultiplicityRule__Group__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2257:1: rule__MultiplicityRule__Group__0__Impl : ( '[' ) ;
    public final void rule__MultiplicityRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2261:1: ( ( '[' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2262:1: ( '[' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2262:1: ( '[' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2263:1: '['
            {
             before(grammarAccess.getMultiplicityRuleAccess().getLeftSquareBracketKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__MultiplicityRule__Group__0__Impl4641); 
             after(grammarAccess.getMultiplicityRuleAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group__0__Impl"


    // $ANTLR start "rule__MultiplicityRule__Group__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2276:1: rule__MultiplicityRule__Group__1 : rule__MultiplicityRule__Group__1__Impl rule__MultiplicityRule__Group__2 ;
    public final void rule__MultiplicityRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2280:1: ( rule__MultiplicityRule__Group__1__Impl rule__MultiplicityRule__Group__2 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2281:2: rule__MultiplicityRule__Group__1__Impl rule__MultiplicityRule__Group__2
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__Group__1__Impl_in_rule__MultiplicityRule__Group__14672);
            rule__MultiplicityRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityRule__Group__2_in_rule__MultiplicityRule__Group__14675);
            rule__MultiplicityRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group__1"


    // $ANTLR start "rule__MultiplicityRule__Group__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2288:1: rule__MultiplicityRule__Group__1__Impl : ( ( rule__MultiplicityRule__BoundsAssignment_1 ) ) ;
    public final void rule__MultiplicityRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2292:1: ( ( ( rule__MultiplicityRule__BoundsAssignment_1 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2293:1: ( ( rule__MultiplicityRule__BoundsAssignment_1 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2293:1: ( ( rule__MultiplicityRule__BoundsAssignment_1 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2294:1: ( rule__MultiplicityRule__BoundsAssignment_1 )
            {
             before(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2295:1: ( rule__MultiplicityRule__BoundsAssignment_1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2295:2: rule__MultiplicityRule__BoundsAssignment_1
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__BoundsAssignment_1_in_rule__MultiplicityRule__Group__1__Impl4702);
            rule__MultiplicityRule__BoundsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group__1__Impl"


    // $ANTLR start "rule__MultiplicityRule__Group__2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2305:1: rule__MultiplicityRule__Group__2 : rule__MultiplicityRule__Group__2__Impl rule__MultiplicityRule__Group__3 ;
    public final void rule__MultiplicityRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2309:1: ( rule__MultiplicityRule__Group__2__Impl rule__MultiplicityRule__Group__3 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2310:2: rule__MultiplicityRule__Group__2__Impl rule__MultiplicityRule__Group__3
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__Group__2__Impl_in_rule__MultiplicityRule__Group__24732);
            rule__MultiplicityRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityRule__Group__3_in_rule__MultiplicityRule__Group__24735);
            rule__MultiplicityRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group__2"


    // $ANTLR start "rule__MultiplicityRule__Group__2__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2317:1: rule__MultiplicityRule__Group__2__Impl : ( ( rule__MultiplicityRule__Group_2__0 )? ) ;
    public final void rule__MultiplicityRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2321:1: ( ( ( rule__MultiplicityRule__Group_2__0 )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2322:1: ( ( rule__MultiplicityRule__Group_2__0 )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2322:1: ( ( rule__MultiplicityRule__Group_2__0 )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2323:1: ( rule__MultiplicityRule__Group_2__0 )?
            {
             before(grammarAccess.getMultiplicityRuleAccess().getGroup_2()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2324:1: ( rule__MultiplicityRule__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2324:2: rule__MultiplicityRule__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__0_in_rule__MultiplicityRule__Group__2__Impl4762);
                    rule__MultiplicityRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicityRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group__2__Impl"


    // $ANTLR start "rule__MultiplicityRule__Group__3"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2334:1: rule__MultiplicityRule__Group__3 : rule__MultiplicityRule__Group__3__Impl ;
    public final void rule__MultiplicityRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2338:1: ( rule__MultiplicityRule__Group__3__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2339:2: rule__MultiplicityRule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__Group__3__Impl_in_rule__MultiplicityRule__Group__34793);
            rule__MultiplicityRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group__3"


    // $ANTLR start "rule__MultiplicityRule__Group__3__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2345:1: rule__MultiplicityRule__Group__3__Impl : ( ']' ) ;
    public final void rule__MultiplicityRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2349:1: ( ( ']' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2350:1: ( ']' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2350:1: ( ']' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2351:1: ']'
            {
             before(grammarAccess.getMultiplicityRuleAccess().getRightSquareBracketKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__MultiplicityRule__Group__3__Impl4821); 
             after(grammarAccess.getMultiplicityRuleAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group__3__Impl"


    // $ANTLR start "rule__MultiplicityRule__Group_2__0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2372:1: rule__MultiplicityRule__Group_2__0 : rule__MultiplicityRule__Group_2__0__Impl rule__MultiplicityRule__Group_2__1 ;
    public final void rule__MultiplicityRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2376:1: ( rule__MultiplicityRule__Group_2__0__Impl rule__MultiplicityRule__Group_2__1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2377:2: rule__MultiplicityRule__Group_2__0__Impl rule__MultiplicityRule__Group_2__1
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__0__Impl_in_rule__MultiplicityRule__Group_2__04860);
            rule__MultiplicityRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__1_in_rule__MultiplicityRule__Group_2__04863);
            rule__MultiplicityRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group_2__0"


    // $ANTLR start "rule__MultiplicityRule__Group_2__0__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2384:1: rule__MultiplicityRule__Group_2__0__Impl : ( '..' ) ;
    public final void rule__MultiplicityRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2388:1: ( ( '..' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2389:1: ( '..' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2389:1: ( '..' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2390:1: '..'
            {
             before(grammarAccess.getMultiplicityRuleAccess().getFullStopFullStopKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__MultiplicityRule__Group_2__0__Impl4891); 
             after(grammarAccess.getMultiplicityRuleAccess().getFullStopFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group_2__0__Impl"


    // $ANTLR start "rule__MultiplicityRule__Group_2__1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2403:1: rule__MultiplicityRule__Group_2__1 : rule__MultiplicityRule__Group_2__1__Impl ;
    public final void rule__MultiplicityRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2407:1: ( rule__MultiplicityRule__Group_2__1__Impl )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2408:2: rule__MultiplicityRule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__Group_2__1__Impl_in_rule__MultiplicityRule__Group_2__14922);
            rule__MultiplicityRule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group_2__1"


    // $ANTLR start "rule__MultiplicityRule__Group_2__1__Impl"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2414:1: rule__MultiplicityRule__Group_2__1__Impl : ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) ) ;
    public final void rule__MultiplicityRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2418:1: ( ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2419:1: ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2419:1: ( ( rule__MultiplicityRule__BoundsAssignment_2_1 ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2420:1: ( rule__MultiplicityRule__BoundsAssignment_2_1 )
            {
             before(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_2_1()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2421:1: ( rule__MultiplicityRule__BoundsAssignment_2_1 )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2421:2: rule__MultiplicityRule__BoundsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MultiplicityRule__BoundsAssignment_2_1_in_rule__MultiplicityRule__Group_2__1__Impl4949);
            rule__MultiplicityRule__BoundsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityRuleAccess().getBoundsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterRule__VisibilityAssignment_0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2436:1: rule__ParameterRule__VisibilityAssignment_0 : ( ruleVisibilityRule ) ;
    public final void rule__ParameterRule__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2440:1: ( ( ruleVisibilityRule ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2441:1: ( ruleVisibilityRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2441:1: ( ruleVisibilityRule )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2442:1: ruleVisibilityRule
            {
             before(grammarAccess.getParameterRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibilityRule_in_rule__ParameterRule__VisibilityAssignment_04988);
            ruleVisibilityRule();

            state._fsp--;

             after(grammarAccess.getParameterRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__VisibilityAssignment_0"


    // $ANTLR start "rule__ParameterRule__DirectionAssignment_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2451:1: rule__ParameterRule__DirectionAssignment_1 : ( ruleDirectionRule ) ;
    public final void rule__ParameterRule__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2455:1: ( ( ruleDirectionRule ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2456:1: ( ruleDirectionRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2456:1: ( ruleDirectionRule )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2457:1: ruleDirectionRule
            {
             before(grammarAccess.getParameterRuleAccess().getDirectionDirectionRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDirectionRule_in_rule__ParameterRule__DirectionAssignment_15019);
            ruleDirectionRule();

            state._fsp--;

             after(grammarAccess.getParameterRuleAccess().getDirectionDirectionRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__DirectionAssignment_1"


    // $ANTLR start "rule__ParameterRule__NameAssignment_2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2466:1: rule__ParameterRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2470:1: ( ( RULE_ID ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2471:1: ( RULE_ID )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2471:1: ( RULE_ID )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2472:1: RULE_ID
            {
             before(grammarAccess.getParameterRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterRule__NameAssignment_25050); 
             after(grammarAccess.getParameterRuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__NameAssignment_2"


    // $ANTLR start "rule__ParameterRule__TypeAssignment_3_1_0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2481:1: rule__ParameterRule__TypeAssignment_3_1_0 : ( ruleTypeRule ) ;
    public final void rule__ParameterRule__TypeAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2485:1: ( ( ruleTypeRule ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2486:1: ( ruleTypeRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2486:1: ( ruleTypeRule )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2487:1: ruleTypeRule
            {
             before(grammarAccess.getParameterRuleAccess().getTypeTypeRuleParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleTypeRule_in_rule__ParameterRule__TypeAssignment_3_1_05081);
            ruleTypeRule();

            state._fsp--;

             after(grammarAccess.getParameterRuleAccess().getTypeTypeRuleParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__TypeAssignment_3_1_0"


    // $ANTLR start "rule__ParameterRule__TypeUndefinedAssignment_3_1_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2496:1: rule__ParameterRule__TypeUndefinedAssignment_3_1_1 : ( ( '<Undefined>' ) ) ;
    public final void rule__ParameterRule__TypeUndefinedAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2500:1: ( ( ( '<Undefined>' ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2501:1: ( ( '<Undefined>' ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2501:1: ( ( '<Undefined>' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2502:1: ( '<Undefined>' )
            {
             before(grammarAccess.getParameterRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2503:1: ( '<Undefined>' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2504:1: '<Undefined>'
            {
             before(grammarAccess.getParameterRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ParameterRule__TypeUndefinedAssignment_3_1_15117); 
             after(grammarAccess.getParameterRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0()); 

            }

             after(grammarAccess.getParameterRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__TypeUndefinedAssignment_3_1_1"


    // $ANTLR start "rule__ParameterRule__MultiplicityAssignment_4"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2519:1: rule__ParameterRule__MultiplicityAssignment_4 : ( ruleMultiplicityRule ) ;
    public final void rule__ParameterRule__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2523:1: ( ( ruleMultiplicityRule ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2524:1: ( ruleMultiplicityRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2524:1: ( ruleMultiplicityRule )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2525:1: ruleMultiplicityRule
            {
             before(grammarAccess.getParameterRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMultiplicityRule_in_rule__ParameterRule__MultiplicityAssignment_45156);
            ruleMultiplicityRule();

            state._fsp--;

             after(grammarAccess.getParameterRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__MultiplicityAssignment_4"


    // $ANTLR start "rule__ParameterRule__ModifiersAssignment_5"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2534:1: rule__ParameterRule__ModifiersAssignment_5 : ( ruleModifiersRule ) ;
    public final void rule__ParameterRule__ModifiersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2538:1: ( ( ruleModifiersRule ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2539:1: ( ruleModifiersRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2539:1: ( ruleModifiersRule )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2540:1: ruleModifiersRule
            {
             before(grammarAccess.getParameterRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModifiersRule_in_rule__ParameterRule__ModifiersAssignment_55187);
            ruleModifiersRule();

            state._fsp--;

             after(grammarAccess.getParameterRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__ModifiersAssignment_5"


    // $ANTLR start "rule__ParameterRule__EffectAssignment_6"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2549:1: rule__ParameterRule__EffectAssignment_6 : ( ruleEffectRule ) ;
    public final void rule__ParameterRule__EffectAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2553:1: ( ( ruleEffectRule ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2554:1: ( ruleEffectRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2554:1: ( ruleEffectRule )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2555:1: ruleEffectRule
            {
             before(grammarAccess.getParameterRuleAccess().getEffectEffectRuleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEffectRule_in_rule__ParameterRule__EffectAssignment_65218);
            ruleEffectRule();

            state._fsp--;

             after(grammarAccess.getParameterRuleAccess().getEffectEffectRuleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__EffectAssignment_6"


    // $ANTLR start "rule__ParameterRule__DefaultValueAssignment_7"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2564:1: rule__ParameterRule__DefaultValueAssignment_7 : ( ruleDefaultValueRule ) ;
    public final void rule__ParameterRule__DefaultValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2568:1: ( ( ruleDefaultValueRule ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2569:1: ( ruleDefaultValueRule )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2569:1: ( ruleDefaultValueRule )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2570:1: ruleDefaultValueRule
            {
             before(grammarAccess.getParameterRuleAccess().getDefaultValueDefaultValueRuleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDefaultValueRule_in_rule__ParameterRule__DefaultValueAssignment_75249);
            ruleDefaultValueRule();

            state._fsp--;

             after(grammarAccess.getParameterRuleAccess().getDefaultValueDefaultValueRuleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRule__DefaultValueAssignment_7"


    // $ANTLR start "rule__ModifiersRule__ValuesAssignment_2_0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2579:1: rule__ModifiersRule__ValuesAssignment_2_0 : ( ruleModifierSpecification ) ;
    public final void rule__ModifiersRule__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2583:1: ( ( ruleModifierSpecification ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2584:1: ( ruleModifierSpecification )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2584:1: ( ruleModifierSpecification )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2585:1: ruleModifierSpecification
            {
             before(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_05280);
            ruleModifierSpecification();

            state._fsp--;

             after(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__ValuesAssignment_2_0"


    // $ANTLR start "rule__ModifiersRule__ValuesAssignment_2_1_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2594:1: rule__ModifiersRule__ValuesAssignment_2_1_1 : ( ruleModifierSpecification ) ;
    public final void rule__ModifiersRule__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2598:1: ( ( ruleModifierSpecification ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2599:1: ( ruleModifierSpecification )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2599:1: ( ruleModifierSpecification )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2600:1: ruleModifierSpecification
            {
             before(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_1_15311);
            ruleModifierSpecification();

            state._fsp--;

             after(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiersRule__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__ModifierSpecification__ValueAssignment"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2609:1: rule__ModifierSpecification__ValueAssignment : ( ruleModifierKind ) ;
    public final void rule__ModifierSpecification__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2613:1: ( ( ruleModifierKind ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2614:1: ( ruleModifierKind )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2614:1: ( ruleModifierKind )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2615:1: ruleModifierKind
            {
             before(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleModifierKind_in_rule__ModifierSpecification__ValueAssignment5342);
            ruleModifierKind();

            state._fsp--;

             after(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierSpecification__ValueAssignment"


    // $ANTLR start "rule__VisibilityRule__VisibilityAssignment"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2624:1: rule__VisibilityRule__VisibilityAssignment : ( ruleVisibilityKind ) ;
    public final void rule__VisibilityRule__VisibilityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2628:1: ( ( ruleVisibilityKind ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2629:1: ( ruleVisibilityKind )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2629:1: ( ruleVisibilityKind )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2630:1: ruleVisibilityKind
            {
             before(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleVisibilityKind_in_rule__VisibilityRule__VisibilityAssignment5373);
            ruleVisibilityKind();

            state._fsp--;

             after(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibilityRule__VisibilityAssignment"


    // $ANTLR start "rule__DirectionRule__DirectionAssignment"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2639:1: rule__DirectionRule__DirectionAssignment : ( ruleDirection ) ;
    public final void rule__DirectionRule__DirectionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2643:1: ( ( ruleDirection ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2644:1: ( ruleDirection )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2644:1: ( ruleDirection )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2645:1: ruleDirection
            {
             before(grammarAccess.getDirectionRuleAccess().getDirectionDirectionEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleDirection_in_rule__DirectionRule__DirectionAssignment5404);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRuleAccess().getDirectionDirectionEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionRule__DirectionAssignment"


    // $ANTLR start "rule__EffectRule__EffectKindAssignment_2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2654:1: rule__EffectRule__EffectKindAssignment_2 : ( ruleEffectKind ) ;
    public final void rule__EffectRule__EffectKindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2658:1: ( ( ruleEffectKind ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2659:1: ( ruleEffectKind )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2659:1: ( ruleEffectKind )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2660:1: ruleEffectKind
            {
             before(grammarAccess.getEffectRuleAccess().getEffectKindEffectKindEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEffectKind_in_rule__EffectRule__EffectKindAssignment_25435);
            ruleEffectKind();

            state._fsp--;

             after(grammarAccess.getEffectRuleAccess().getEffectKindEffectKindEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRule__EffectKindAssignment_2"


    // $ANTLR start "rule__DefaultValueRule__DefaultAssignment_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2669:1: rule__DefaultValueRule__DefaultAssignment_1 : ( ruleValue ) ;
    public final void rule__DefaultValueRule__DefaultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2673:1: ( ( ruleValue ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2674:1: ( ruleValue )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2674:1: ( ruleValue )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2675:1: ruleValue
            {
             before(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__DefaultValueRule__DefaultAssignment_15466);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValueRule__DefaultAssignment_1"


    // $ANTLR start "rule__IntValue__LiteralIntegerAssignment"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2684:1: rule__IntValue__LiteralIntegerAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__LiteralIntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2688:1: ( ( RULE_INT ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2689:1: ( RULE_INT )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2689:1: ( RULE_INT )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2690:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getLiteralIntegerINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__LiteralIntegerAssignment5497); 
             after(grammarAccess.getIntValueAccess().getLiteralIntegerINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__LiteralIntegerAssignment"


    // $ANTLR start "rule__StringValue__LiteralStringAssignment"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2699:1: rule__StringValue__LiteralStringAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__LiteralStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2703:1: ( ( RULE_STRING ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2704:1: ( RULE_STRING )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2704:1: ( RULE_STRING )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2705:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getLiteralStringSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__LiteralStringAssignment5528); 
             after(grammarAccess.getStringValueAccess().getLiteralStringSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__LiteralStringAssignment"


    // $ANTLR start "rule__BooleanValue__LiteralBooleanAssignment"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2714:1: rule__BooleanValue__LiteralBooleanAssignment : ( ruleBooleanLiterals ) ;
    public final void rule__BooleanValue__LiteralBooleanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2718:1: ( ( ruleBooleanLiterals ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2719:1: ( ruleBooleanLiterals )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2719:1: ( ruleBooleanLiterals )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2720:1: ruleBooleanLiterals
            {
             before(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBooleanLiterals_in_rule__BooleanValue__LiteralBooleanAssignment5559);
            ruleBooleanLiterals();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__LiteralBooleanAssignment"


    // $ANTLR start "rule__RealValue__IntegerAssignment_0_0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2729:1: rule__RealValue__IntegerAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__RealValue__IntegerAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2733:1: ( ( RULE_INT ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2734:1: ( RULE_INT )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2734:1: ( RULE_INT )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2735:1: RULE_INT
            {
             before(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_0_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_0_05590); 
             after(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__IntegerAssignment_0_0"


    // $ANTLR start "rule__RealValue__FractionAssignment_1_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2744:1: rule__RealValue__FractionAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__RealValue__FractionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2748:1: ( ( RULE_INT ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2749:1: ( RULE_INT )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2749:1: ( RULE_INT )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2750:1: RULE_INT
            {
             before(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_1_15621); 
             after(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__FractionAssignment_1_1"


    // $ANTLR start "rule__RealValue__IntegerAssignment_2_0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2759:1: rule__RealValue__IntegerAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__RealValue__IntegerAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2763:1: ( ( RULE_INT ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2764:1: ( RULE_INT )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2764:1: ( RULE_INT )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2765:1: RULE_INT
            {
             before(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_2_05652); 
             after(grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__IntegerAssignment_2_0"


    // $ANTLR start "rule__RealValue__FractionAssignment_2_2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2774:1: rule__RealValue__FractionAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__RealValue__FractionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2778:1: ( ( RULE_INT ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2779:1: ( RULE_INT )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2779:1: ( RULE_INT )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2780:1: RULE_INT
            {
             before(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_2_25683); 
             after(grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__FractionAssignment_2_2"


    // $ANTLR start "rule__QualifiedName__PathAssignment_0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2789:1: rule__QualifiedName__PathAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__QualifiedName__PathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2793:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2794:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2794:1: ( ( RULE_ID ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2795:1: ( RULE_ID )
            {
             before(grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2796:1: ( RULE_ID )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2797:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getPathNamespaceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__PathAssignment_05718); 
             after(grammarAccess.getQualifiedNameAccess().getPathNamespaceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__PathAssignment_0"


    // $ANTLR start "rule__QualifiedName__RemainingAssignment_2"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2808:1: rule__QualifiedName__RemainingAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__QualifiedName__RemainingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2812:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2813:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2813:1: ( ruleQualifiedName )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2814:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedName__RemainingAssignment_25753);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__RemainingAssignment_2"


    // $ANTLR start "rule__TypeRule__PathAssignment_0"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2823:1: rule__TypeRule__PathAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__TypeRule__PathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2827:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2828:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2828:1: ( ruleQualifiedName )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2829:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRuleAccess().getPathQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRule__PathAssignment_05784);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeRuleAccess().getPathQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRule__PathAssignment_0"


    // $ANTLR start "rule__TypeRule__TypeAssignment_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2838:1: rule__TypeRule__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeRule__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2842:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2843:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2843:1: ( ( RULE_ID ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2844:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeRuleAccess().getTypeTypeCrossReference_1_0()); 
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2845:1: ( RULE_ID )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2846:1: RULE_ID
            {
             before(grammarAccess.getTypeRuleAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeRule__TypeAssignment_15819); 
             after(grammarAccess.getTypeRuleAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTypeRuleAccess().getTypeTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRule__TypeAssignment_1"


    // $ANTLR start "rule__MultiplicityRule__BoundsAssignment_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2857:1: rule__MultiplicityRule__BoundsAssignment_1 : ( ruleBoundSpecification ) ;
    public final void rule__MultiplicityRule__BoundsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2861:1: ( ( ruleBoundSpecification ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2862:1: ( ruleBoundSpecification )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2862:1: ( ruleBoundSpecification )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2863:1: ruleBoundSpecification
            {
             before(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_15854);
            ruleBoundSpecification();

            state._fsp--;

             after(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__BoundsAssignment_1"


    // $ANTLR start "rule__MultiplicityRule__BoundsAssignment_2_1"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2872:1: rule__MultiplicityRule__BoundsAssignment_2_1 : ( ruleBoundSpecification ) ;
    public final void rule__MultiplicityRule__BoundsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2876:1: ( ( ruleBoundSpecification ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2877:1: ( ruleBoundSpecification )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2877:1: ( ruleBoundSpecification )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2878:1: ruleBoundSpecification
            {
             before(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_2_15885);
            ruleBoundSpecification();

            state._fsp--;

             after(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityRule__BoundsAssignment_2_1"


    // $ANTLR start "rule__BoundSpecification__ValueAssignment"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2887:1: rule__BoundSpecification__ValueAssignment : ( ruleUnlimitedLiteral ) ;
    public final void rule__BoundSpecification__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2891:1: ( ( ruleUnlimitedLiteral ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2892:1: ( ruleUnlimitedLiteral )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2892:1: ( ruleUnlimitedLiteral )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/ui/contentassist/antlr/internal/InternalUmlParameter.g:2893:1: ruleUnlimitedLiteral
            {
             before(grammarAccess.getBoundSpecificationAccess().getValueUnlimitedLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_rule__BoundSpecification__ValueAssignment5916);
            ruleUnlimitedLiteral();

            state._fsp--;

             after(grammarAccess.getBoundSpecificationAccess().getValueUnlimitedLiteralParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundSpecification__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleParameterRule_in_entryRuleParameterRule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterRule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__0_in_ruleParameterRule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifiersRule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group__0_in_ruleModifiersRule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierSpecification188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierSpecification__ValueAssignment_in_ruleModifierSpecification214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityRule248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibilityRule__VisibilityAssignment_in_ruleVisibilityRule274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectionRule_in_entryRuleDirectionRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectionRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectionRule__DirectionAssignment_in_ruleDirectionRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRule_in_entryRuleEffectRule361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectRule368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRule__Group__0_in_ruleEffectRule394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueRule428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueRule__Group__0_in_ruleDefaultValueRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__LiteralIntegerAssignment_in_ruleIntValue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__LiteralStringAssignment_in_ruleStringValue634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__LiteralBooleanAssignment_in_ruleBooleanValue694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Alternatives_in_ruleRealValue754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_entryRuleNullValue781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullValue788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullValue__Group__0_in_ruleNullValue814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoValue_in_entryRuleNoValue841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoValue848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoValue__Group__0_in_ruleNoValue874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRule_in_entryRuleTypeRule961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRule968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRule__Group__0_in_ruleTypeRule994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityRule1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group__0_in_ruleMultiplicityRule1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoundSpecification1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundSpecification__ValueAssignment_in_ruleBoundSpecification1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnlimitedLiteral__Alternatives_in_ruleUnlimitedLiteral1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierKind__Alternatives_in_ruleModifierKind1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectKind__Alternatives_in_ruleEffectKind1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiterals__Alternatives_in_ruleBooleanLiterals1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibilityKind__Alternatives_in_ruleVisibilityKind1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Alternatives_in_ruleDirection1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__TypeAssignment_3_1_0_in_rule__ParameterRule__Alternatives_3_11390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__TypeUndefinedAssignment_3_1_1_in_rule__ParameterRule__Alternatives_3_11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_rule__Value__Alternatives1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_rule__Value__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoValue_in_rule__Value__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_0__0_in_rule__RealValue__Alternatives1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_1__0_in_rule__RealValue__Alternatives1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_2__0_in_rule__RealValue__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__UnlimitedLiteral__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UnlimitedLiteral__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ModifierKind__Alternatives1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModifierKind__Alternatives1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModifierKind__Alternatives1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModifierKind__Alternatives1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EffectKind__Alternatives1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EffectKind__Alternatives1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EffectKind__Alternatives1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EffectKind__Alternatives1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BooleanLiterals__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BooleanLiterals__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VisibilityKind__Alternatives1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VisibilityKind__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VisibilityKind__Alternatives1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VisibilityKind__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Direction__Alternatives2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Direction__Alternatives2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Direction__Alternatives2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Direction__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__0__Impl_in_rule__ParameterRule__Group__02130 = new BitSet(new long[]{0x0000000078000020L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__1_in_rule__ParameterRule__Group__02133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__VisibilityAssignment_0_in_rule__ParameterRule__Group__0__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__1__Impl_in_rule__ParameterRule__Group__12191 = new BitSet(new long[]{0x0000000078000020L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__2_in_rule__ParameterRule__Group__12194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__DirectionAssignment_1_in_rule__ParameterRule__Group__1__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__2__Impl_in_rule__ParameterRule__Group__22252 = new BitSet(new long[]{0x0000021180000000L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__3_in_rule__ParameterRule__Group__22255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__NameAssignment_2_in_rule__ParameterRule__Group__2__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__3__Impl_in_rule__ParameterRule__Group__32312 = new BitSet(new long[]{0x0000021180000000L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__4_in_rule__ParameterRule__Group__32315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group_3__0_in_rule__ParameterRule__Group__3__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__4__Impl_in_rule__ParameterRule__Group__42373 = new BitSet(new long[]{0x0000021180000000L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__5_in_rule__ParameterRule__Group__42376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__MultiplicityAssignment_4_in_rule__ParameterRule__Group__4__Impl2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__5__Impl_in_rule__ParameterRule__Group__52434 = new BitSet(new long[]{0x0000021180000000L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__6_in_rule__ParameterRule__Group__52437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__ModifiersAssignment_5_in_rule__ParameterRule__Group__5__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__6__Impl_in_rule__ParameterRule__Group__62495 = new BitSet(new long[]{0x0000021180000000L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__7_in_rule__ParameterRule__Group__62498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__EffectAssignment_6_in_rule__ParameterRule__Group__6__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group__7__Impl_in_rule__ParameterRule__Group__72556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__DefaultValueAssignment_7_in_rule__ParameterRule__Group__7__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group_3__0__Impl_in_rule__ParameterRule__Group_3__02630 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group_3__1_in_rule__ParameterRule__Group_3__02633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParameterRule__Group_3__0__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Group_3__1__Impl_in_rule__ParameterRule__Group_3__12692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRule__Alternatives_3_1_in_rule__ParameterRule__Group_3__1__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group__0__Impl_in_rule__ModifiersRule__Group__02753 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group__1_in_rule__ModifiersRule__Group__02756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group__1__Impl_in_rule__ModifiersRule__Group__12814 = new BitSet(new long[]{0x000000020001E000L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group__2_in_rule__ModifiersRule__Group__12817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModifiersRule__Group__1__Impl2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group__2__Impl_in_rule__ModifiersRule__Group__22876 = new BitSet(new long[]{0x000000020001E000L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group__3_in_rule__ModifiersRule__Group__22879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__0_in_rule__ModifiersRule__Group__2__Impl2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group__3__Impl_in_rule__ModifiersRule__Group__32937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModifiersRule__Group__3__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__0__Impl_in_rule__ModifiersRule__Group_2__03004 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__1_in_rule__ModifiersRule__Group_2__03007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__ValuesAssignment_2_0_in_rule__ModifiersRule__Group_2__0__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group_2__1__Impl_in_rule__ModifiersRule__Group_2__13064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group_2_1__0_in_rule__ModifiersRule__Group_2__1__Impl3091 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group_2_1__0__Impl_in_rule__ModifiersRule__Group_2_1__03126 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group_2_1__1_in_rule__ModifiersRule__Group_2_1__03129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModifiersRule__Group_2_1__0__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__Group_2_1__1__Impl_in_rule__ModifiersRule__Group_2_1__13188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifiersRule__ValuesAssignment_2_1_1_in_rule__ModifiersRule__Group_2_1__1__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRule__Group__0__Impl_in_rule__EffectRule__Group__03249 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EffectRule__Group__1_in_rule__EffectRule__Group__03252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EffectRule__Group__0__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRule__Group__1__Impl_in_rule__EffectRule__Group__13311 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__EffectRule__Group__2_in_rule__EffectRule__Group__13314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EffectRule__Group__1__Impl3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRule__Group__2__Impl_in_rule__EffectRule__Group__23373 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EffectRule__Group__3_in_rule__EffectRule__Group__23376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRule__EffectKindAssignment_2_in_rule__EffectRule__Group__2__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRule__Group__3__Impl_in_rule__EffectRule__Group__33433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EffectRule__Group__3__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueRule__Group__0__Impl_in_rule__DefaultValueRule__Group__03500 = new BitSet(new long[]{0x000000E000600050L});
    public static final BitSet FOLLOW_rule__DefaultValueRule__Group__1_in_rule__DefaultValueRule__Group__03503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DefaultValueRule__Group__0__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueRule__Group__1__Impl_in_rule__DefaultValueRule__Group__13562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValueRule__DefaultAssignment_1_in_rule__DefaultValueRule__Group__1__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_0__0__Impl_in_rule__RealValue__Group_0__03623 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__RealValue__Group_0__1_in_rule__RealValue__Group_0__03626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__IntegerAssignment_0_0_in_rule__RealValue__Group_0__0__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_0__1__Impl_in_rule__RealValue__Group_0__13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RealValue__Group_0__1__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_1__0__Impl_in_rule__RealValue__Group_1__03746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RealValue__Group_1__1_in_rule__RealValue__Group_1__03749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RealValue__Group_1__0__Impl3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_1__1__Impl_in_rule__RealValue__Group_1__13808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__FractionAssignment_1_1_in_rule__RealValue__Group_1__1__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_2__0__Impl_in_rule__RealValue__Group_2__03869 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__RealValue__Group_2__1_in_rule__RealValue__Group_2__03872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__IntegerAssignment_2_0_in_rule__RealValue__Group_2__0__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_2__1__Impl_in_rule__RealValue__Group_2__13929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RealValue__Group_2__2_in_rule__RealValue__Group_2__13932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RealValue__Group_2__1__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__Group_2__2__Impl_in_rule__RealValue__Group_2__23991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RealValue__FractionAssignment_2_2_in_rule__RealValue__Group_2__2__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullValue__Group__0__Impl_in_rule__NullValue__Group__04054 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__NullValue__Group__1_in_rule__NullValue__Group__04057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullValue__Group__1__Impl_in_rule__NullValue__Group__14115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__NullValue__Group__1__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoValue__Group__0__Impl_in_rule__NoValue__Group__04178 = new BitSet(new long[]{0x000000E000600050L});
    public static final BitSet FOLLOW_rule__NoValue__Group__1_in_rule__NoValue__Group__04181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoValue__Group__1__Impl_in_rule__NoValue__Group__14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__NoValue__Group__1__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04302 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__PathAssignment_0_in_rule__QualifiedName__Group__0__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__14365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedName__Group__1__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__24424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__RemainingAssignment_2_in_rule__QualifiedName__Group__2__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRule__Group__0__Impl_in_rule__TypeRule__Group__04488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TypeRule__Group__1_in_rule__TypeRule__Group__04491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRule__PathAssignment_0_in_rule__TypeRule__Group__0__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRule__Group__1__Impl_in_rule__TypeRule__Group__14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRule__TypeAssignment_1_in_rule__TypeRule__Group__1__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group__0__Impl_in_rule__MultiplicityRule__Group__04610 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group__1_in_rule__MultiplicityRule__Group__04613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MultiplicityRule__Group__0__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group__1__Impl_in_rule__MultiplicityRule__Group__14672 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group__2_in_rule__MultiplicityRule__Group__14675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__BoundsAssignment_1_in_rule__MultiplicityRule__Group__1__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group__2__Impl_in_rule__MultiplicityRule__Group__24732 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group__3_in_rule__MultiplicityRule__Group__24735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__0_in_rule__MultiplicityRule__Group__2__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group__3__Impl_in_rule__MultiplicityRule__Group__34793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MultiplicityRule__Group__3__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__0__Impl_in_rule__MultiplicityRule__Group_2__04860 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__1_in_rule__MultiplicityRule__Group_2__04863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MultiplicityRule__Group_2__0__Impl4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__Group_2__1__Impl_in_rule__MultiplicityRule__Group_2__14922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityRule__BoundsAssignment_2_1_in_rule__MultiplicityRule__Group_2__1__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityRule_in_rule__ParameterRule__VisibilityAssignment_04988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectionRule_in_rule__ParameterRule__DirectionAssignment_15019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterRule__NameAssignment_25050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRule_in_rule__ParameterRule__TypeAssignment_3_1_05081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ParameterRule__TypeUndefinedAssignment_3_1_15117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityRule_in_rule__ParameterRule__MultiplicityAssignment_45156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifiersRule_in_rule__ParameterRule__ModifiersAssignment_55187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRule_in_rule__ParameterRule__EffectAssignment_65218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueRule_in_rule__ParameterRule__DefaultValueAssignment_75249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_05280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierSpecification_in_rule__ModifiersRule__ValuesAssignment_2_1_15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierKind_in_rule__ModifierSpecification__ValueAssignment5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__VisibilityRule__VisibilityAssignment5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rule__DirectionRule__DirectionAssignment5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectKind_in_rule__EffectRule__EffectKindAssignment_25435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__DefaultValueRule__DefaultAssignment_15466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__LiteralIntegerAssignment5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__LiteralStringAssignment5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiterals_in_rule__BooleanValue__LiteralBooleanAssignment5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_0_05590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_1_15621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__IntegerAssignment_2_05652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RealValue__FractionAssignment_2_25683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__PathAssignment_05718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedName__RemainingAssignment_25753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRule__PathAssignment_05784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeRule__TypeAssignment_15819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoundSpecification_in_rule__MultiplicityRule__BoundsAssignment_2_15885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_rule__BoundSpecification__ValueAssignment5916 = new BitSet(new long[]{0x0000000000000002L});

}