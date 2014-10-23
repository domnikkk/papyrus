package org.eclipse.papyrus.uml.textedit.parameter.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.papyrus.uml.textedit.parameter.xtext.services.UmlParameterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlParameterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INTEGER_VALUE", "RULE_WS", "RULE_ANY_OTHER", "':'", "'<Undefined>'", "'{'", "','", "'}'", "'effect:'", "'='", "'.'", "'null'", "'none'", "'::'", "'['", "'..'", "']'", "'*'", "'exception'", "'stream'", "'ordered'", "'unique'", "'create'", "'read'", "'update'", "'delete'", "'true'", "'false'", "'+'", "'-'", "'#'", "'~'", "'in'", "'out'", "'inout'", "'return'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g"; }



     	private UmlParameterGrammarAccess grammarAccess;
     	
        public InternalUmlParameterParser(TokenStream input, UmlParameterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ParameterRule";	
       	}
       	
       	@Override
       	protected UmlParameterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleParameterRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:68:1: entryRuleParameterRule returns [EObject current=null] : iv_ruleParameterRule= ruleParameterRule EOF ;
    public final EObject entryRuleParameterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRule = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:69:2: (iv_ruleParameterRule= ruleParameterRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:70:2: iv_ruleParameterRule= ruleParameterRule EOF
            {
             newCompositeNode(grammarAccess.getParameterRuleRule()); 
            pushFollow(FOLLOW_ruleParameterRule_in_entryRuleParameterRule75);
            iv_ruleParameterRule=ruleParameterRule();

            state._fsp--;

             current =iv_ruleParameterRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterRule85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterRule"


    // $ANTLR start "ruleParameterRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:77:1: ruleParameterRule returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_direction_1_0= ruleDirectionRule ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_effect_8_0= ruleEffectRule ) )? ( (lv_defaultValue_9_0= ruleDefaultValueRule ) )? ) ;
    public final EObject ruleParameterRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_typeUndefined_5_0=null;
        EObject lv_visibility_0_0 = null;

        EObject lv_direction_1_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_multiplicity_6_0 = null;

        EObject lv_modifiers_7_0 = null;

        EObject lv_effect_8_0 = null;

        EObject lv_defaultValue_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:80:28: ( ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_direction_1_0= ruleDirectionRule ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_effect_8_0= ruleEffectRule ) )? ( (lv_defaultValue_9_0= ruleDefaultValueRule ) )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:81:1: ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_direction_1_0= ruleDirectionRule ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_effect_8_0= ruleEffectRule ) )? ( (lv_defaultValue_9_0= ruleDefaultValueRule ) )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:81:1: ( ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_direction_1_0= ruleDirectionRule ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_effect_8_0= ruleEffectRule ) )? ( (lv_defaultValue_9_0= ruleDefaultValueRule ) )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:81:2: ( (lv_visibility_0_0= ruleVisibilityRule ) )? ( (lv_direction_1_0= ruleDirectionRule ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )? ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )? ( (lv_modifiers_7_0= ruleModifiersRule ) )? ( (lv_effect_8_0= ruleEffectRule ) )? ( (lv_defaultValue_9_0= ruleDefaultValueRule ) )?
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:81:2: ( (lv_visibility_0_0= ruleVisibilityRule ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=37 && LA1_0<=40)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:82:1: (lv_visibility_0_0= ruleVisibilityRule )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:82:1: (lv_visibility_0_0= ruleVisibilityRule )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:83:3: lv_visibility_0_0= ruleVisibilityRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterRuleAccess().getVisibilityVisibilityRuleParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibilityRule_in_ruleParameterRule131);
                    lv_visibility_0_0=ruleVisibilityRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRuleRule());
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

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:99:3: ( (lv_direction_1_0= ruleDirectionRule ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=41 && LA2_0<=44)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:100:1: (lv_direction_1_0= ruleDirectionRule )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:100:1: (lv_direction_1_0= ruleDirectionRule )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:101:3: lv_direction_1_0= ruleDirectionRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterRuleAccess().getDirectionDirectionRuleParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDirectionRule_in_ruleParameterRule153);
                    lv_direction_1_0=ruleDirectionRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"direction",
                            		lv_direction_1_0, 
                            		"DirectionRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:117:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:118:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:118:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:119:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterRule171); 

            			newLeafNode(lv_name_2_0, grammarAccess.getParameterRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:135:2: (otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:135:4: otherlv_3= ':' ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleParameterRule189); 

                        	newLeafNode(otherlv_3, grammarAccess.getParameterRuleAccess().getColonKeyword_3_0());
                        
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:139:1: ( ( (lv_type_4_0= ruleTypeRule ) ) | ( (lv_typeUndefined_5_0= '<Undefined>' ) ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==13) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:139:2: ( (lv_type_4_0= ruleTypeRule ) )
                            {
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:139:2: ( (lv_type_4_0= ruleTypeRule ) )
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:140:1: (lv_type_4_0= ruleTypeRule )
                            {
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:140:1: (lv_type_4_0= ruleTypeRule )
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:141:3: lv_type_4_0= ruleTypeRule
                            {
                             
                            	        newCompositeNode(grammarAccess.getParameterRuleAccess().getTypeTypeRuleParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeRule_in_ruleParameterRule211);
                            lv_type_4_0=ruleTypeRule();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getParameterRuleRule());
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
                        case 2 :
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:158:6: ( (lv_typeUndefined_5_0= '<Undefined>' ) )
                            {
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:158:6: ( (lv_typeUndefined_5_0= '<Undefined>' ) )
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:159:1: (lv_typeUndefined_5_0= '<Undefined>' )
                            {
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:159:1: (lv_typeUndefined_5_0= '<Undefined>' )
                            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:160:3: lv_typeUndefined_5_0= '<Undefined>'
                            {
                            lv_typeUndefined_5_0=(Token)match(input,13,FOLLOW_13_in_ruleParameterRule235); 

                                    newLeafNode(lv_typeUndefined_5_0, grammarAccess.getParameterRuleAccess().getTypeUndefinedUndefinedKeyword_3_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParameterRuleRule());
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

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:173:5: ( (lv_multiplicity_6_0= ruleMultiplicityRule ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:174:1: (lv_multiplicity_6_0= ruleMultiplicityRule )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:174:1: (lv_multiplicity_6_0= ruleMultiplicityRule )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:175:3: lv_multiplicity_6_0= ruleMultiplicityRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterRuleAccess().getMultiplicityMultiplicityRuleParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicityRule_in_ruleParameterRule272);
                    lv_multiplicity_6_0=ruleMultiplicityRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRuleRule());
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

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:191:3: ( (lv_modifiers_7_0= ruleModifiersRule ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==16||(LA6_1>=27 && LA6_1<=30)) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:192:1: (lv_modifiers_7_0= ruleModifiersRule )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:192:1: (lv_modifiers_7_0= ruleModifiersRule )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:193:3: lv_modifiers_7_0= ruleModifiersRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterRuleAccess().getModifiersModifiersRuleParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModifiersRule_in_ruleParameterRule294);
                    lv_modifiers_7_0=ruleModifiersRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRuleRule());
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

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:209:3: ( (lv_effect_8_0= ruleEffectRule ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:210:1: (lv_effect_8_0= ruleEffectRule )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:210:1: (lv_effect_8_0= ruleEffectRule )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:211:3: lv_effect_8_0= ruleEffectRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterRuleAccess().getEffectEffectRuleParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEffectRule_in_ruleParameterRule316);
                    lv_effect_8_0=ruleEffectRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"effect",
                            		lv_effect_8_0, 
                            		"EffectRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:227:3: ( (lv_defaultValue_9_0= ruleDefaultValueRule ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:228:1: (lv_defaultValue_9_0= ruleDefaultValueRule )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:228:1: (lv_defaultValue_9_0= ruleDefaultValueRule )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:229:3: lv_defaultValue_9_0= ruleDefaultValueRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterRuleAccess().getDefaultValueDefaultValueRuleParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultValueRule_in_ruleParameterRule338);
                    lv_defaultValue_9_0=ruleDefaultValueRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_9_0, 
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterRule"


    // $ANTLR start "entryRuleModifiersRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:253:1: entryRuleModifiersRule returns [EObject current=null] : iv_ruleModifiersRule= ruleModifiersRule EOF ;
    public final EObject entryRuleModifiersRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiersRule = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:254:2: (iv_ruleModifiersRule= ruleModifiersRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:255:2: iv_ruleModifiersRule= ruleModifiersRule EOF
            {
             newCompositeNode(grammarAccess.getModifiersRuleRule()); 
            pushFollow(FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule375);
            iv_ruleModifiersRule=ruleModifiersRule();

            state._fsp--;

             current =iv_ruleModifiersRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifiersRule385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifiersRule"


    // $ANTLR start "ruleModifiersRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:262:1: ruleModifiersRule returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleModifierSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleModifiersRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:265:28: ( ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleModifierSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) ) )* )? otherlv_5= '}' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:266:1: ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleModifierSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) ) )* )? otherlv_5= '}' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:266:1: ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleModifierSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) ) )* )? otherlv_5= '}' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:266:2: () otherlv_1= '{' ( ( (lv_values_2_0= ruleModifierSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) ) )* )? otherlv_5= '}'
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:266:2: ()
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:267:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModifiersRuleAccess().getModifiersRuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleModifiersRule431); 

                	newLeafNode(otherlv_1, grammarAccess.getModifiersRuleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:276:1: ( ( (lv_values_2_0= ruleModifierSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=27 && LA10_0<=30)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:276:2: ( (lv_values_2_0= ruleModifierSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) ) )*
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:276:2: ( (lv_values_2_0= ruleModifierSpecification ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:277:1: (lv_values_2_0= ruleModifierSpecification )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:277:1: (lv_values_2_0= ruleModifierSpecification )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:278:3: lv_values_2_0= ruleModifierSpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModifierSpecification_in_ruleModifiersRule453);
                    lv_values_2_0=ruleModifierSpecification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModifiersRuleRule());
                    	        }
                           		add(
                           			current, 
                           			"values",
                            		lv_values_2_0, 
                            		"ModifierSpecification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:294:2: (otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:294:4: otherlv_3= ',' ( (lv_values_4_0= ruleModifierSpecification ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleModifiersRule466); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getModifiersRuleAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:298:1: ( (lv_values_4_0= ruleModifierSpecification ) )
                    	    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:299:1: (lv_values_4_0= ruleModifierSpecification )
                    	    {
                    	    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:299:1: (lv_values_4_0= ruleModifierSpecification )
                    	    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:300:3: lv_values_4_0= ruleModifierSpecification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModifiersRuleAccess().getValuesModifierSpecificationParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModifierSpecification_in_ruleModifiersRule487);
                    	    lv_values_4_0=ruleModifierSpecification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModifiersRuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_4_0, 
                    	            		"ModifierSpecification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleModifiersRule503); 

                	newLeafNode(otherlv_5, grammarAccess.getModifiersRuleAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifiersRule"


    // $ANTLR start "entryRuleModifierSpecification"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:328:1: entryRuleModifierSpecification returns [EObject current=null] : iv_ruleModifierSpecification= ruleModifierSpecification EOF ;
    public final EObject entryRuleModifierSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierSpecification = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:329:2: (iv_ruleModifierSpecification= ruleModifierSpecification EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:330:2: iv_ruleModifierSpecification= ruleModifierSpecification EOF
            {
             newCompositeNode(grammarAccess.getModifierSpecificationRule()); 
            pushFollow(FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification539);
            iv_ruleModifierSpecification=ruleModifierSpecification();

            state._fsp--;

             current =iv_ruleModifierSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierSpecification549); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifierSpecification"


    // $ANTLR start "ruleModifierSpecification"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:337:1: ruleModifierSpecification returns [EObject current=null] : ( (lv_value_0_0= ruleModifierKind ) ) ;
    public final EObject ruleModifierSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:340:28: ( ( (lv_value_0_0= ruleModifierKind ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:341:1: ( (lv_value_0_0= ruleModifierKind ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:341:1: ( (lv_value_0_0= ruleModifierKind ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:342:1: (lv_value_0_0= ruleModifierKind )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:342:1: (lv_value_0_0= ruleModifierKind )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:343:3: lv_value_0_0= ruleModifierKind
            {
             
            	        newCompositeNode(grammarAccess.getModifierSpecificationAccess().getValueModifierKindEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleModifierKind_in_ruleModifierSpecification594);
            lv_value_0_0=ruleModifierKind();

            state._fsp--;


            	        if (current==null) {
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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifierSpecification"


    // $ANTLR start "entryRuleVisibilityRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:367:1: entryRuleVisibilityRule returns [EObject current=null] : iv_ruleVisibilityRule= ruleVisibilityRule EOF ;
    public final EObject entryRuleVisibilityRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilityRule = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:368:2: (iv_ruleVisibilityRule= ruleVisibilityRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:369:2: iv_ruleVisibilityRule= ruleVisibilityRule EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRuleRule()); 
            pushFollow(FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule629);
            iv_ruleVisibilityRule=ruleVisibilityRule();

            state._fsp--;

             current =iv_ruleVisibilityRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibilityRule639); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilityRule"


    // $ANTLR start "ruleVisibilityRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:376:1: ruleVisibilityRule returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityKind ) ) ;
    public final EObject ruleVisibilityRule() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:379:28: ( ( (lv_visibility_0_0= ruleVisibilityKind ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:380:1: ( (lv_visibility_0_0= ruleVisibilityKind ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:380:1: ( (lv_visibility_0_0= ruleVisibilityKind ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:381:1: (lv_visibility_0_0= ruleVisibilityKind )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:381:1: (lv_visibility_0_0= ruleVisibilityKind )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:382:3: lv_visibility_0_0= ruleVisibilityKind
            {
             
            	        newCompositeNode(grammarAccess.getVisibilityRuleAccess().getVisibilityVisibilityKindEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleVisibilityKind_in_ruleVisibilityRule684);
            lv_visibility_0_0=ruleVisibilityKind();

            state._fsp--;


            	        if (current==null) {
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityRule"


    // $ANTLR start "entryRuleDirectionRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:406:1: entryRuleDirectionRule returns [EObject current=null] : iv_ruleDirectionRule= ruleDirectionRule EOF ;
    public final EObject entryRuleDirectionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionRule = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:407:2: (iv_ruleDirectionRule= ruleDirectionRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:408:2: iv_ruleDirectionRule= ruleDirectionRule EOF
            {
             newCompositeNode(grammarAccess.getDirectionRuleRule()); 
            pushFollow(FOLLOW_ruleDirectionRule_in_entryRuleDirectionRule719);
            iv_ruleDirectionRule=ruleDirectionRule();

            state._fsp--;

             current =iv_ruleDirectionRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectionRule729); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectionRule"


    // $ANTLR start "ruleDirectionRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:415:1: ruleDirectionRule returns [EObject current=null] : ( (lv_direction_0_0= ruleDirection ) ) ;
    public final EObject ruleDirectionRule() throws RecognitionException {
        EObject current = null;

        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:418:28: ( ( (lv_direction_0_0= ruleDirection ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:419:1: ( (lv_direction_0_0= ruleDirection ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:419:1: ( (lv_direction_0_0= ruleDirection ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:420:1: (lv_direction_0_0= ruleDirection )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:420:1: (lv_direction_0_0= ruleDirection )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:421:3: lv_direction_0_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getDirectionRuleAccess().getDirectionDirectionEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDirection_in_ruleDirectionRule774);
            lv_direction_0_0=ruleDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDirectionRuleRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_0_0, 
                    		"Direction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectionRule"


    // $ANTLR start "entryRuleEffectRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:445:1: entryRuleEffectRule returns [EObject current=null] : iv_ruleEffectRule= ruleEffectRule EOF ;
    public final EObject entryRuleEffectRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectRule = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:446:2: (iv_ruleEffectRule= ruleEffectRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:447:2: iv_ruleEffectRule= ruleEffectRule EOF
            {
             newCompositeNode(grammarAccess.getEffectRuleRule()); 
            pushFollow(FOLLOW_ruleEffectRule_in_entryRuleEffectRule809);
            iv_ruleEffectRule=ruleEffectRule();

            state._fsp--;

             current =iv_ruleEffectRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectRule819); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectRule"


    // $ANTLR start "ruleEffectRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:454:1: ruleEffectRule returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'effect:' ( (lv_effectKind_2_0= ruleEffectKind ) ) otherlv_3= '}' ) ;
    public final EObject ruleEffectRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_effectKind_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:457:28: ( (otherlv_0= '{' otherlv_1= 'effect:' ( (lv_effectKind_2_0= ruleEffectKind ) ) otherlv_3= '}' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:458:1: (otherlv_0= '{' otherlv_1= 'effect:' ( (lv_effectKind_2_0= ruleEffectKind ) ) otherlv_3= '}' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:458:1: (otherlv_0= '{' otherlv_1= 'effect:' ( (lv_effectKind_2_0= ruleEffectKind ) ) otherlv_3= '}' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:458:3: otherlv_0= '{' otherlv_1= 'effect:' ( (lv_effectKind_2_0= ruleEffectKind ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEffectRule856); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectRuleAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEffectRule868); 

                	newLeafNode(otherlv_1, grammarAccess.getEffectRuleAccess().getEffectKeyword_1());
                
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:466:1: ( (lv_effectKind_2_0= ruleEffectKind ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:467:1: (lv_effectKind_2_0= ruleEffectKind )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:467:1: (lv_effectKind_2_0= ruleEffectKind )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:468:3: lv_effectKind_2_0= ruleEffectKind
            {
             
            	        newCompositeNode(grammarAccess.getEffectRuleAccess().getEffectKindEffectKindEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEffectKind_in_ruleEffectRule889);
            lv_effectKind_2_0=ruleEffectKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEffectRuleRule());
            	        }
                   		set(
                   			current, 
                   			"effectKind",
                    		lv_effectKind_2_0, 
                    		"EffectKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleEffectRule901); 

                	newLeafNode(otherlv_3, grammarAccess.getEffectRuleAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectRule"


    // $ANTLR start "entryRuleDefaultValueRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:496:1: entryRuleDefaultValueRule returns [EObject current=null] : iv_ruleDefaultValueRule= ruleDefaultValueRule EOF ;
    public final EObject entryRuleDefaultValueRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValueRule = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:497:2: (iv_ruleDefaultValueRule= ruleDefaultValueRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:498:2: iv_ruleDefaultValueRule= ruleDefaultValueRule EOF
            {
             newCompositeNode(grammarAccess.getDefaultValueRuleRule()); 
            pushFollow(FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule937);
            iv_ruleDefaultValueRule=ruleDefaultValueRule();

            state._fsp--;

             current =iv_ruleDefaultValueRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValueRule947); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultValueRule"


    // $ANTLR start "ruleDefaultValueRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:505:1: ruleDefaultValueRule returns [EObject current=null] : (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) ) ;
    public final EObject ruleDefaultValueRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_default_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:508:28: ( (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:509:1: (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:509:1: (otherlv_0= '=' ( (lv_default_1_0= ruleValue ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:509:3: otherlv_0= '=' ( (lv_default_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDefaultValueRule984); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultValueRuleAccess().getEqualsSignKeyword_0());
                
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:513:1: ( (lv_default_1_0= ruleValue ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:514:1: (lv_default_1_0= ruleValue )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:514:1: (lv_default_1_0= ruleValue )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:515:3: lv_default_1_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getDefaultValueRuleAccess().getDefaultValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleDefaultValueRule1005);
            lv_default_1_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultValueRule"


    // $ANTLR start "entryRuleValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:539:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:540:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:541:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1041);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1051); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:548:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue ) ;
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
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:551:28: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:552:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:552:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_RealValue_3= ruleRealValue | this_NullValue_4= ruleNullValue | this_NoValue_5= ruleNoValue )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==19) ) {
                    alt11=4;
                }
                else if ( (LA11_1==EOF) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case 35:
            case 36:
                {
                alt11=3;
                }
                break;
            case 19:
                {
                alt11=4;
                }
                break;
            case 20:
                {
                alt11=5;
                }
                break;
            case 21:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:553:5: this_IntValue_0= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue1098);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:563:5: this_StringValue_1= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue1125);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:573:5: this_BooleanValue_2= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue1152);
                    this_BooleanValue_2=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:583:5: this_RealValue_3= ruleRealValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getRealValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRealValue_in_ruleValue1179);
                    this_RealValue_3=ruleRealValue();

                    state._fsp--;

                     
                            current = this_RealValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:593:5: this_NullValue_4= ruleNullValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleNullValue_in_ruleValue1206);
                    this_NullValue_4=ruleNullValue();

                    state._fsp--;

                     
                            current = this_NullValue_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:603:5: this_NoValue_5= ruleNoValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNoValueParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleNoValue_in_ruleValue1233);
                    this_NoValue_5=ruleNoValue();

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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:619:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:620:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:621:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1268);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:628:1: ruleIntValue returns [EObject current=null] : ( (lv_literalInteger_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_literalInteger_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:631:28: ( ( (lv_literalInteger_0_0= RULE_INT ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:632:1: ( (lv_literalInteger_0_0= RULE_INT ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:632:1: ( (lv_literalInteger_0_0= RULE_INT ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:633:1: (lv_literalInteger_0_0= RULE_INT )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:633:1: (lv_literalInteger_0_0= RULE_INT )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:634:3: lv_literalInteger_0_0= RULE_INT
            {
            lv_literalInteger_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue1319); 

            			newLeafNode(lv_literalInteger_0_0, grammarAccess.getIntValueAccess().getLiteralIntegerINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:658:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:659:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:660:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1359);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:667:1: ruleStringValue returns [EObject current=null] : ( (lv_literalString_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_literalString_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:670:28: ( ( (lv_literalString_0_0= RULE_STRING ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:671:1: ( (lv_literalString_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:671:1: ( (lv_literalString_0_0= RULE_STRING ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:672:1: (lv_literalString_0_0= RULE_STRING )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:672:1: (lv_literalString_0_0= RULE_STRING )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:673:3: lv_literalString_0_0= RULE_STRING
            {
            lv_literalString_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue1410); 

            			newLeafNode(lv_literalString_0_0, grammarAccess.getStringValueAccess().getLiteralStringSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:697:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:698:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:699:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1450);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:706:1: ruleBooleanValue returns [EObject current=null] : ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_literalBoolean_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:709:28: ( ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:710:1: ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:710:1: ( (lv_literalBoolean_0_0= ruleBooleanLiterals ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:711:1: (lv_literalBoolean_0_0= ruleBooleanLiterals )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:711:1: (lv_literalBoolean_0_0= ruleBooleanLiterals )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:712:3: lv_literalBoolean_0_0= ruleBooleanLiterals
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getLiteralBooleanBooleanLiteralsEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanLiterals_in_ruleBooleanValue1505);
            lv_literalBoolean_0_0=ruleBooleanLiterals();

            state._fsp--;


            	        if (current==null) {
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleRealValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:736:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:737:2: (iv_ruleRealValue= ruleRealValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:738:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_ruleRealValue_in_entryRuleRealValue1540);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealValue1550); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:745:1: ruleRealValue returns [EObject current=null] : ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_fraction_3_0=null;
        Token lv_integer_4_0=null;
        Token otherlv_5=null;
        Token lv_fraction_6_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:748:28: ( ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:749:1: ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:749:1: ( ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' ) | (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) ) | ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==19) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_INT) ) {
                        alt12=3;
                    }
                    else if ( (LA12_3==EOF) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:749:2: ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:749:2: ( ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:749:3: ( (lv_integer_0_0= RULE_INT ) ) otherlv_1= '.'
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:749:3: ( (lv_integer_0_0= RULE_INT ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:750:1: (lv_integer_0_0= RULE_INT )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:750:1: (lv_integer_0_0= RULE_INT )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:751:3: lv_integer_0_0= RULE_INT
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRealValue1593); 

                    			newLeafNode(lv_integer_0_0, grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRealValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"integer",
                            		lv_integer_0_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRealValue1610); 

                        	newLeafNode(otherlv_1, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:772:6: (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:772:6: (otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:772:8: otherlv_2= '.' ( (lv_fraction_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRealValue1630); 

                        	newLeafNode(otherlv_2, grammarAccess.getRealValueAccess().getFullStopKeyword_1_0());
                        
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:776:1: ( (lv_fraction_3_0= RULE_INT ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:777:1: (lv_fraction_3_0= RULE_INT )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:777:1: (lv_fraction_3_0= RULE_INT )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:778:3: lv_fraction_3_0= RULE_INT
                    {
                    lv_fraction_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRealValue1647); 

                    			newLeafNode(lv_fraction_3_0, grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
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
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:795:6: ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:795:6: ( ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:795:7: ( (lv_integer_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fraction_6_0= RULE_INT ) )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:795:7: ( (lv_integer_4_0= RULE_INT ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:796:1: (lv_integer_4_0= RULE_INT )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:796:1: (lv_integer_4_0= RULE_INT )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:797:3: lv_integer_4_0= RULE_INT
                    {
                    lv_integer_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRealValue1677); 

                    			newLeafNode(lv_integer_4_0, grammarAccess.getRealValueAccess().getIntegerINTTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRealValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"integer",
                            		lv_integer_4_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRealValue1694); 

                        	newLeafNode(otherlv_5, grammarAccess.getRealValueAccess().getFullStopKeyword_2_1());
                        
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:817:1: ( (lv_fraction_6_0= RULE_INT ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:818:1: (lv_fraction_6_0= RULE_INT )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:818:1: (lv_fraction_6_0= RULE_INT )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:819:3: lv_fraction_6_0= RULE_INT
                    {
                    lv_fraction_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRealValue1711); 

                    			newLeafNode(lv_fraction_6_0, grammarAccess.getRealValueAccess().getFractionINTTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleNullValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:843:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:844:2: (iv_ruleNullValue= ruleNullValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:845:2: iv_ruleNullValue= ruleNullValue EOF
            {
             newCompositeNode(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_ruleNullValue_in_entryRuleNullValue1753);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;

             current =iv_ruleNullValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullValue1763); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:852:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:855:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:856:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:856:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:856:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:856:2: ()
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:857:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullValueAccess().getNullValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleNullValue1809); 

                	newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleNoValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:874:1: entryRuleNoValue returns [EObject current=null] : iv_ruleNoValue= ruleNoValue EOF ;
    public final EObject entryRuleNoValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoValue = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:875:2: (iv_ruleNoValue= ruleNoValue EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:876:2: iv_ruleNoValue= ruleNoValue EOF
            {
             newCompositeNode(grammarAccess.getNoValueRule()); 
            pushFollow(FOLLOW_ruleNoValue_in_entryRuleNoValue1845);
            iv_ruleNoValue=ruleNoValue();

            state._fsp--;

             current =iv_ruleNoValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoValue1855); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoValue"


    // $ANTLR start "ruleNoValue"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:883:1: ruleNoValue returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
    public final EObject ruleNoValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:886:28: ( ( () otherlv_1= 'none' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:887:1: ( () otherlv_1= 'none' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:887:1: ( () otherlv_1= 'none' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:887:2: () otherlv_1= 'none'
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:887:2: ()
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:888:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNoValueAccess().getNoValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleNoValue1901); 

                	newLeafNode(otherlv_1, grammarAccess.getNoValueAccess().getNoneKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoValue"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:905:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:906:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:907:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1937);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1947); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:914:1: ruleQualifiedName returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )? ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_remaining_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:917:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )? ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:918:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )? )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:918:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )? )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:918:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' ( (lv_remaining_2_0= ruleQualifiedName ) )?
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:918:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:919:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:919:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:920:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1992); 

            		newLeafNode(otherlv_0, grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName2004); 

                	newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1());
                
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:935:1: ( (lv_remaining_2_0= ruleQualifiedName ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==22) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:936:1: (lv_remaining_2_0= ruleQualifiedName )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:936:1: (lv_remaining_2_0= ruleQualifiedName )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:937:3: lv_remaining_2_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedName2025);
                    lv_remaining_2_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleTypeRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:961:1: entryRuleTypeRule returns [EObject current=null] : iv_ruleTypeRule= ruleTypeRule EOF ;
    public final EObject entryRuleTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRule = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:962:2: (iv_ruleTypeRule= ruleTypeRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:963:2: iv_ruleTypeRule= ruleTypeRule EOF
            {
             newCompositeNode(grammarAccess.getTypeRuleRule()); 
            pushFollow(FOLLOW_ruleTypeRule_in_entryRuleTypeRule2062);
            iv_ruleTypeRule=ruleTypeRule();

            state._fsp--;

             current =iv_ruleTypeRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRule2072); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRule"


    // $ANTLR start "ruleTypeRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:970:1: ruleTypeRule returns [EObject current=null] : ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:973:28: ( ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:974:1: ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:974:1: ( ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:974:2: ( (lv_path_0_0= ruleQualifiedName ) )? ( (otherlv_1= RULE_ID ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:974:2: ( (lv_path_0_0= ruleQualifiedName ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==22) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:975:1: (lv_path_0_0= ruleQualifiedName )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:975:1: (lv_path_0_0= ruleQualifiedName )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:976:3: lv_path_0_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeRuleAccess().getPathQualifiedNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRule2118);
                    lv_path_0_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
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

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:992:3: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:993:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:993:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:994:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRuleRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeRule2139); 

            		newLeafNode(otherlv_1, grammarAccess.getTypeRuleAccess().getTypeTypeCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRule"


    // $ANTLR start "entryRuleMultiplicityRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1013:1: entryRuleMultiplicityRule returns [EObject current=null] : iv_ruleMultiplicityRule= ruleMultiplicityRule EOF ;
    public final EObject entryRuleMultiplicityRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityRule = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1014:2: (iv_ruleMultiplicityRule= ruleMultiplicityRule EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1015:2: iv_ruleMultiplicityRule= ruleMultiplicityRule EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRuleRule()); 
            pushFollow(FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule2175);
            iv_ruleMultiplicityRule=ruleMultiplicityRule();

            state._fsp--;

             current =iv_ruleMultiplicityRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityRule2185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityRule"


    // $ANTLR start "ruleMultiplicityRule"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1022:1: ruleMultiplicityRule returns [EObject current=null] : (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMultiplicityRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_bounds_1_0 = null;

        EObject lv_bounds_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1025:28: ( (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1026:1: (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1026:1: (otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']' )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1026:3: otherlv_0= '[' ( (lv_bounds_1_0= ruleBoundSpecification ) ) (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMultiplicityRule2222); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicityRuleAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1030:1: ( (lv_bounds_1_0= ruleBoundSpecification ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1031:1: (lv_bounds_1_0= ruleBoundSpecification )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1031:1: (lv_bounds_1_0= ruleBoundSpecification )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1032:3: lv_bounds_1_0= ruleBoundSpecification
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule2243);
            lv_bounds_1_0=ruleBoundSpecification();

            state._fsp--;


            	        if (current==null) {
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

            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1048:2: (otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1048:4: otherlv_2= '..' ( (lv_bounds_3_0= ruleBoundSpecification ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMultiplicityRule2256); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiplicityRuleAccess().getFullStopFullStopKeyword_2_0());
                        
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1052:1: ( (lv_bounds_3_0= ruleBoundSpecification ) )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1053:1: (lv_bounds_3_0= ruleBoundSpecification )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1053:1: (lv_bounds_3_0= ruleBoundSpecification )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1054:3: lv_bounds_3_0= ruleBoundSpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicityRuleAccess().getBoundsBoundSpecificationParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule2277);
                    lv_bounds_3_0=ruleBoundSpecification();

                    state._fsp--;


                    	        if (current==null) {
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicityRule2291); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiplicityRuleAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityRule"


    // $ANTLR start "entryRuleBoundSpecification"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1082:1: entryRuleBoundSpecification returns [EObject current=null] : iv_ruleBoundSpecification= ruleBoundSpecification EOF ;
    public final EObject entryRuleBoundSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundSpecification = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1083:2: (iv_ruleBoundSpecification= ruleBoundSpecification EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1084:2: iv_ruleBoundSpecification= ruleBoundSpecification EOF
            {
             newCompositeNode(grammarAccess.getBoundSpecificationRule()); 
            pushFollow(FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification2327);
            iv_ruleBoundSpecification=ruleBoundSpecification();

            state._fsp--;

             current =iv_ruleBoundSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoundSpecification2337); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoundSpecification"


    // $ANTLR start "ruleBoundSpecification"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1091:1: ruleBoundSpecification returns [EObject current=null] : ( (lv_value_0_0= ruleUnlimitedLiteral ) ) ;
    public final EObject ruleBoundSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1094:28: ( ( (lv_value_0_0= ruleUnlimitedLiteral ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1095:1: ( (lv_value_0_0= ruleUnlimitedLiteral ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1095:1: ( (lv_value_0_0= ruleUnlimitedLiteral ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1096:1: (lv_value_0_0= ruleUnlimitedLiteral )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1096:1: (lv_value_0_0= ruleUnlimitedLiteral )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1097:3: lv_value_0_0= ruleUnlimitedLiteral
            {
             
            	        newCompositeNode(grammarAccess.getBoundSpecificationAccess().getValueUnlimitedLiteralParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleBoundSpecification2382);
            lv_value_0_0=ruleUnlimitedLiteral();

            state._fsp--;


            	        if (current==null) {
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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoundSpecification"


    // $ANTLR start "entryRuleUnlimitedLiteral"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1121:1: entryRuleUnlimitedLiteral returns [String current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final String entryRuleUnlimitedLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnlimitedLiteral = null;


        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1122:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1123:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral2418);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;

             current =iv_ruleUnlimitedLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral2429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnlimitedLiteral"


    // $ANTLR start "ruleUnlimitedLiteral"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1130:1: ruleUnlimitedLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUnlimitedLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1133:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1134:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1134:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1134:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnlimitedLiteral2469); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getUnlimitedLiteralAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1143:2: kw= '*'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleUnlimitedLiteral2493); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnlimitedLiteralAccess().getAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnlimitedLiteral"


    // $ANTLR start "ruleModifierKind"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1156:1: ruleModifierKind returns [Enumerator current=null] : ( (enumLiteral_0= 'exception' ) | (enumLiteral_1= 'stream' ) | (enumLiteral_2= 'ordered' ) | (enumLiteral_3= 'unique' ) ) ;
    public final Enumerator ruleModifierKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1158:28: ( ( (enumLiteral_0= 'exception' ) | (enumLiteral_1= 'stream' ) | (enumLiteral_2= 'ordered' ) | (enumLiteral_3= 'unique' ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1159:1: ( (enumLiteral_0= 'exception' ) | (enumLiteral_1= 'stream' ) | (enumLiteral_2= 'ordered' ) | (enumLiteral_3= 'unique' ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1159:1: ( (enumLiteral_0= 'exception' ) | (enumLiteral_1= 'stream' ) | (enumLiteral_2= 'ordered' ) | (enumLiteral_3= 'unique' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case 29:
                {
                alt17=3;
                }
                break;
            case 30:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1159:2: (enumLiteral_0= 'exception' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1159:2: (enumLiteral_0= 'exception' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1159:4: enumLiteral_0= 'exception'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleModifierKind2547); 

                            current = grammarAccess.getModifierKindAccess().getEXCEPTIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getModifierKindAccess().getEXCEPTIONEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1165:6: (enumLiteral_1= 'stream' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1165:6: (enumLiteral_1= 'stream' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1165:8: enumLiteral_1= 'stream'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_ruleModifierKind2564); 

                            current = grammarAccess.getModifierKindAccess().getSTREAMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getModifierKindAccess().getSTREAMEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1171:6: (enumLiteral_2= 'ordered' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1171:6: (enumLiteral_2= 'ordered' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1171:8: enumLiteral_2= 'ordered'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleModifierKind2581); 

                            current = grammarAccess.getModifierKindAccess().getORDEREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getModifierKindAccess().getORDEREDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1177:6: (enumLiteral_3= 'unique' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1177:6: (enumLiteral_3= 'unique' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1177:8: enumLiteral_3= 'unique'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_30_in_ruleModifierKind2598); 

                            current = grammarAccess.getModifierKindAccess().getUNIQUEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getModifierKindAccess().getUNIQUEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifierKind"


    // $ANTLR start "ruleEffectKind"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1187:1: ruleEffectKind returns [Enumerator current=null] : ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'delete' ) ) ;
    public final Enumerator ruleEffectKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1189:28: ( ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'delete' ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1190:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'delete' ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1190:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'delete' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 34:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1190:2: (enumLiteral_0= 'create' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1190:2: (enumLiteral_0= 'create' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1190:4: enumLiteral_0= 'create'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleEffectKind2643); 

                            current = grammarAccess.getEffectKindAccess().getCREATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEffectKindAccess().getCREATEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1196:6: (enumLiteral_1= 'read' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1196:6: (enumLiteral_1= 'read' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1196:8: enumLiteral_1= 'read'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleEffectKind2660); 

                            current = grammarAccess.getEffectKindAccess().getREADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEffectKindAccess().getREADEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1202:6: (enumLiteral_2= 'update' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1202:6: (enumLiteral_2= 'update' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1202:8: enumLiteral_2= 'update'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_33_in_ruleEffectKind2677); 

                            current = grammarAccess.getEffectKindAccess().getUPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEffectKindAccess().getUPDATEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1208:6: (enumLiteral_3= 'delete' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1208:6: (enumLiteral_3= 'delete' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1208:8: enumLiteral_3= 'delete'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_34_in_ruleEffectKind2694); 

                            current = grammarAccess.getEffectKindAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEffectKindAccess().getDELETEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectKind"


    // $ANTLR start "ruleBooleanLiterals"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1218:1: ruleBooleanLiterals returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiterals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1220:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1221:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1221:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1221:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1221:2: (enumLiteral_0= 'true' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1221:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_35_in_ruleBooleanLiterals2739); 

                            current = grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralsAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1227:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1227:6: (enumLiteral_1= 'false' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1227:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_36_in_ruleBooleanLiterals2756); 

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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiterals"


    // $ANTLR start "ruleVisibilityKind"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1237:1: ruleVisibilityKind returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibilityKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1239:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1240:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1240:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt20=1;
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            case 39:
                {
                alt20=3;
                }
                break;
            case 40:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1240:2: (enumLiteral_0= '+' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1240:2: (enumLiteral_0= '+' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1240:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleVisibilityKind2801); 

                            current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1246:6: (enumLiteral_1= '-' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1246:6: (enumLiteral_1= '-' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1246:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleVisibilityKind2818); 

                            current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1252:6: (enumLiteral_2= '#' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1252:6: (enumLiteral_2= '#' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1252:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleVisibilityKind2835); 

                            current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1258:6: (enumLiteral_3= '~' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1258:6: (enumLiteral_3= '~' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1258:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_40_in_ruleVisibilityKind2852); 

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
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityKind"


    // $ANTLR start "ruleDirection"
    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1268:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) | (enumLiteral_3= 'return' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1270:28: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) | (enumLiteral_3= 'return' ) ) )
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1271:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) | (enumLiteral_3= 'return' ) )
            {
            // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1271:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) | (enumLiteral_3= 'return' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case 44:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1271:2: (enumLiteral_0= 'in' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1271:2: (enumLiteral_0= 'in' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1271:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleDirection2897); 

                            current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1277:6: (enumLiteral_1= 'out' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1277:6: (enumLiteral_1= 'out' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1277:8: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleDirection2914); 

                            current = grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1283:6: (enumLiteral_2= 'inout' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1283:6: (enumLiteral_2= 'inout' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1283:8: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleDirection2931); 

                            current = grammarAccess.getDirectionAccess().getINOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getINOUTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1289:6: (enumLiteral_3= 'return' )
                    {
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1289:6: (enumLiteral_3= 'return' )
                    // ../org.eclipse.papyrus.uml.textedit.parameter.xtext/src-gen/org/eclipse/papyrus/uml/textedit/parameter/xtext/parser/antlr/internal/InternalUmlParameter.g:1289:8: enumLiteral_3= 'return'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_44_in_ruleDirection2948); 

                            current = grammarAccess.getDirectionAccess().getRETURNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getRETURNEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleParameterRule_in_entryRuleParameterRule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterRule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityRule_in_ruleParameterRule131 = new BitSet(new long[]{0x00001E0000000010L});
    public static final BitSet FOLLOW_ruleDirectionRule_in_ruleParameterRule153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterRule171 = new BitSet(new long[]{0x0000000000845002L});
    public static final BitSet FOLLOW_12_in_ruleParameterRule189 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypeRule_in_ruleParameterRule211 = new BitSet(new long[]{0x0000000000844002L});
    public static final BitSet FOLLOW_13_in_ruleParameterRule235 = new BitSet(new long[]{0x0000000000844002L});
    public static final BitSet FOLLOW_ruleMultiplicityRule_in_ruleParameterRule272 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_ruleModifiersRule_in_ruleParameterRule294 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_ruleEffectRule_in_ruleParameterRule316 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleDefaultValueRule_in_ruleParameterRule338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifiersRule_in_entryRuleModifiersRule375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifiersRule385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModifiersRule431 = new BitSet(new long[]{0x0000000078010000L});
    public static final BitSet FOLLOW_ruleModifierSpecification_in_ruleModifiersRule453 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleModifiersRule466 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_ruleModifierSpecification_in_ruleModifiersRule487 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleModifiersRule503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierSpecification_in_entryRuleModifierSpecification539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierSpecification549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierKind_in_ruleModifierSpecification594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityRule_in_entryRuleVisibilityRule629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityRule639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleVisibilityRule684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectionRule_in_entryRuleDirectionRule719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectionRule729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleDirectionRule774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRule_in_entryRuleEffectRule809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectRule819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEffectRule856 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEffectRule868 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_ruleEffectKind_in_ruleEffectRule889 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEffectRule901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValueRule_in_entryRuleDefaultValueRule937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValueRule947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDefaultValueRule984 = new BitSet(new long[]{0x0000001800380060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDefaultValueRule1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_ruleValue1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_ruleValue1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoValue_in_ruleValue1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiterals_in_ruleBooleanValue1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealValue_in_entryRuleRealValue1540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealValue1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue1593 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRealValue1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRealValue1630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue1677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRealValue1694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRealValue1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullValue_in_entryRuleNullValue1753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullValue1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNullValue1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoValue_in_entryRuleNoValue1845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoValue1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNoValue1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1992 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName2004 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedName2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRule_in_entryRuleTypeRule2062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRule2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRule2118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRule2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityRule_in_entryRuleMultiplicityRule2175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityRule2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMultiplicityRule2222 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule2243 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleMultiplicityRule2256 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleBoundSpecification_in_ruleMultiplicityRule2277 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicityRule2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoundSpecification_in_entryRuleBoundSpecification2327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoundSpecification2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleBoundSpecification2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnlimitedLiteral2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUnlimitedLiteral2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleModifierKind2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleModifierKind2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleModifierKind2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleModifierKind2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEffectKind2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEffectKind2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEffectKind2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEffectKind2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBooleanLiterals2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBooleanLiterals2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVisibilityKind2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVisibilityKind2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVisibilityKind2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVisibilityKind2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDirection2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDirection2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDirection2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDirection2948 = new BitSet(new long[]{0x0000000000000002L});

}