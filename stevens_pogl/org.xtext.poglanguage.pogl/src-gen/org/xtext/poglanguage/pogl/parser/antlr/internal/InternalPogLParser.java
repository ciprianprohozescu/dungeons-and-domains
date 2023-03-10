package org.xtext.poglanguage.pogl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.poglanguage.pogl.services.PogLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPogLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'State'", "';'", "'start'", "'final'", "'Item'", "'set'", "'add'", "'remove'", "'goto'", "'Show'", "'<'", "'>'", "'='", "'check'", "'then'", "'else'", "'endcheck'", "'Action'", "'in'", "'do'", "'end'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPogLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPogLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPogLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPogL.g"; }



     	private PogLGrammarAccess grammarAccess;

        public InternalPogLParser(TokenStream input, PogLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected PogLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalPogL.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalPogL.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalPogL.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalPogL.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_models_0_0= ruleModel ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_models_0_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:77:2: ( ( (lv_models_0_0= ruleModel ) )* )
            // InternalPogL.g:78:2: ( (lv_models_0_0= ruleModel ) )*
            {
            // InternalPogL.g:78:2: ( (lv_models_0_0= ruleModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==24||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPogL.g:79:3: (lv_models_0_0= ruleModel )
            	    {
            	    // InternalPogL.g:79:3: (lv_models_0_0= ruleModel )
            	    // InternalPogL.g:80:4: lv_models_0_0= ruleModel
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getModelsModelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_models_0_0=ruleModel();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"models",
            	    					lv_models_0_0,
            	    					"org.xtext.poglanguage.pogl.PogL.Model");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleModel"
    // InternalPogL.g:100:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPogL.g:100:46: (iv_ruleModel= ruleModel EOF )
            // InternalPogL.g:101:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPogL.g:107:1: ruleModel returns [EObject current=null] : ( ( (lv_model_0_1= ruleState | lv_model_0_2= ruleItem | lv_model_0_3= ruleCheck | lv_model_0_4= ruleAction ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_1 = null;

        EObject lv_model_0_2 = null;

        EObject lv_model_0_3 = null;

        EObject lv_model_0_4 = null;



        	enterRule();

        try {
            // InternalPogL.g:113:2: ( ( ( (lv_model_0_1= ruleState | lv_model_0_2= ruleItem | lv_model_0_3= ruleCheck | lv_model_0_4= ruleAction ) ) ) )
            // InternalPogL.g:114:2: ( ( (lv_model_0_1= ruleState | lv_model_0_2= ruleItem | lv_model_0_3= ruleCheck | lv_model_0_4= ruleAction ) ) )
            {
            // InternalPogL.g:114:2: ( ( (lv_model_0_1= ruleState | lv_model_0_2= ruleItem | lv_model_0_3= ruleCheck | lv_model_0_4= ruleAction ) ) )
            // InternalPogL.g:115:3: ( (lv_model_0_1= ruleState | lv_model_0_2= ruleItem | lv_model_0_3= ruleCheck | lv_model_0_4= ruleAction ) )
            {
            // InternalPogL.g:115:3: ( (lv_model_0_1= ruleState | lv_model_0_2= ruleItem | lv_model_0_3= ruleCheck | lv_model_0_4= ruleAction ) )
            // InternalPogL.g:116:4: (lv_model_0_1= ruleState | lv_model_0_2= ruleItem | lv_model_0_3= ruleCheck | lv_model_0_4= ruleAction )
            {
            // InternalPogL.g:116:4: (lv_model_0_1= ruleState | lv_model_0_2= ruleItem | lv_model_0_3= ruleCheck | lv_model_0_4= ruleAction )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPogL.g:117:5: lv_model_0_1= ruleState
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getModelStateParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_model_0_1=ruleState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"model",
                    						lv_model_0_1,
                    						"org.xtext.poglanguage.pogl.PogL.State");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalPogL.g:133:5: lv_model_0_2= ruleItem
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getModelItemParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_model_0_2=ruleItem();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"model",
                    						lv_model_0_2,
                    						"org.xtext.poglanguage.pogl.PogL.Item");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalPogL.g:149:5: lv_model_0_3= ruleCheck
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getModelCheckParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_model_0_3=ruleCheck();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"model",
                    						lv_model_0_3,
                    						"org.xtext.poglanguage.pogl.PogL.Check");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalPogL.g:165:5: lv_model_0_4= ruleAction
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getModelActionParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_model_0_4=ruleAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"model",
                    						lv_model_0_4,
                    						"org.xtext.poglanguage.pogl.PogL.Action");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleState"
    // InternalPogL.g:186:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalPogL.g:186:46: (iv_ruleState= ruleState EOF )
            // InternalPogL.g:187:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalPogL.g:193:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' this_Fstate_1= ruleFstate otherlv_2= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Fstate_1 = null;



        	enterRule();

        try {
            // InternalPogL.g:199:2: ( (otherlv_0= 'State' this_Fstate_1= ruleFstate otherlv_2= ';' ) )
            // InternalPogL.g:200:2: (otherlv_0= 'State' this_Fstate_1= ruleFstate otherlv_2= ';' )
            {
            // InternalPogL.g:200:2: (otherlv_0= 'State' this_Fstate_1= ruleFstate otherlv_2= ';' )
            // InternalPogL.g:201:3: otherlv_0= 'State' this_Fstate_1= ruleFstate otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getStateAccess().getFstateParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_Fstate_1=ruleFstate();

            state._fsp--;


            			current = this_Fstate_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleFstate"
    // InternalPogL.g:221:1: entryRuleFstate returns [EObject current=null] : iv_ruleFstate= ruleFstate EOF ;
    public final EObject entryRuleFstate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFstate = null;


        try {
            // InternalPogL.g:221:47: (iv_ruleFstate= ruleFstate EOF )
            // InternalPogL.g:222:2: iv_ruleFstate= ruleFstate EOF
            {
             newCompositeNode(grammarAccess.getFstateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFstate=ruleFstate();

            state._fsp--;

             current =iv_ruleFstate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFstate"


    // $ANTLR start "ruleFstate"
    // InternalPogL.g:228:1: ruleFstate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fstate_name_1_0= ruleFstate_name ) ) ) ;
    public final EObject ruleFstate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_Fstate_name_1_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:234:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fstate_name_1_0= ruleFstate_name ) ) ) )
            // InternalPogL.g:235:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fstate_name_1_0= ruleFstate_name ) ) )
            {
            // InternalPogL.g:235:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fstate_name_1_0= ruleFstate_name ) ) )
            // InternalPogL.g:236:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fstate_name_1_0= ruleFstate_name ) )
            {
            // InternalPogL.g:236:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPogL.g:237:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPogL.g:237:4: (lv_name_0_0= RULE_ID )
            // InternalPogL.g:238:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFstateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFstateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPogL.g:254:3: ( (lv_Fstate_name_1_0= ruleFstate_name ) )
            // InternalPogL.g:255:4: (lv_Fstate_name_1_0= ruleFstate_name )
            {
            // InternalPogL.g:255:4: (lv_Fstate_name_1_0= ruleFstate_name )
            // InternalPogL.g:256:5: lv_Fstate_name_1_0= ruleFstate_name
            {

            					newCompositeNode(grammarAccess.getFstateAccess().getFstate_nameFstate_nameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Fstate_name_1_0=ruleFstate_name();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFstateRule());
            					}
            					set(
            						current,
            						"Fstate_name",
            						lv_Fstate_name_1_0,
            						"org.xtext.poglanguage.pogl.PogL.Fstate_name");
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
    // $ANTLR end "ruleFstate"


    // $ANTLR start "entryRuleFstate_name"
    // InternalPogL.g:277:1: entryRuleFstate_name returns [EObject current=null] : iv_ruleFstate_name= ruleFstate_name EOF ;
    public final EObject entryRuleFstate_name() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFstate_name = null;


        try {
            // InternalPogL.g:277:52: (iv_ruleFstate_name= ruleFstate_name EOF )
            // InternalPogL.g:278:2: iv_ruleFstate_name= ruleFstate_name EOF
            {
             newCompositeNode(grammarAccess.getFstate_nameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFstate_name=ruleFstate_name();

            state._fsp--;

             current =iv_ruleFstate_name; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFstate_name"


    // $ANTLR start "ruleFstate_name"
    // InternalPogL.g:284:1: ruleFstate_name returns [EObject current=null] : ( (otherlv_0= 'start' ( (lv_description_1_0= RULE_STRING ) ) ) | (otherlv_2= 'final' ( (lv_description_3_0= RULE_STRING ) ) ) | ( (lv_description_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleFstate_name() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalPogL.g:290:2: ( ( (otherlv_0= 'start' ( (lv_description_1_0= RULE_STRING ) ) ) | (otherlv_2= 'final' ( (lv_description_3_0= RULE_STRING ) ) ) | ( (lv_description_4_0= RULE_STRING ) ) ) )
            // InternalPogL.g:291:2: ( (otherlv_0= 'start' ( (lv_description_1_0= RULE_STRING ) ) ) | (otherlv_2= 'final' ( (lv_description_3_0= RULE_STRING ) ) ) | ( (lv_description_4_0= RULE_STRING ) ) )
            {
            // InternalPogL.g:291:2: ( (otherlv_0= 'start' ( (lv_description_1_0= RULE_STRING ) ) ) | (otherlv_2= 'final' ( (lv_description_3_0= RULE_STRING ) ) ) | ( (lv_description_4_0= RULE_STRING ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPogL.g:292:3: (otherlv_0= 'start' ( (lv_description_1_0= RULE_STRING ) ) )
                    {
                    // InternalPogL.g:292:3: (otherlv_0= 'start' ( (lv_description_1_0= RULE_STRING ) ) )
                    // InternalPogL.g:293:4: otherlv_0= 'start' ( (lv_description_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getFstate_nameAccess().getStartKeyword_0_0());
                    			
                    // InternalPogL.g:297:4: ( (lv_description_1_0= RULE_STRING ) )
                    // InternalPogL.g:298:5: (lv_description_1_0= RULE_STRING )
                    {
                    // InternalPogL.g:298:5: (lv_description_1_0= RULE_STRING )
                    // InternalPogL.g:299:6: lv_description_1_0= RULE_STRING
                    {
                    lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_1_0, grammarAccess.getFstate_nameAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFstate_nameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPogL.g:317:3: (otherlv_2= 'final' ( (lv_description_3_0= RULE_STRING ) ) )
                    {
                    // InternalPogL.g:317:3: (otherlv_2= 'final' ( (lv_description_3_0= RULE_STRING ) ) )
                    // InternalPogL.g:318:4: otherlv_2= 'final' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getFstate_nameAccess().getFinalKeyword_1_0());
                    			
                    // InternalPogL.g:322:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalPogL.g:323:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalPogL.g:323:5: (lv_description_3_0= RULE_STRING )
                    // InternalPogL.g:324:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getFstate_nameAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFstate_nameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPogL.g:342:3: ( (lv_description_4_0= RULE_STRING ) )
                    {
                    // InternalPogL.g:342:3: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalPogL.g:343:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalPogL.g:343:4: (lv_description_4_0= RULE_STRING )
                    // InternalPogL.g:344:5: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_description_4_0, grammarAccess.getFstate_nameAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFstate_nameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleFstate_name"


    // $ANTLR start "entryRuleItem"
    // InternalPogL.g:364:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalPogL.g:364:45: (iv_ruleItem= ruleItem EOF )
            // InternalPogL.g:365:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalPogL.g:371:1: ruleItem returns [EObject current=null] : (otherlv_0= 'Item' this_Fitem_1= ruleFitem otherlv_2= ';' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Fitem_1 = null;



        	enterRule();

        try {
            // InternalPogL.g:377:2: ( (otherlv_0= 'Item' this_Fitem_1= ruleFitem otherlv_2= ';' ) )
            // InternalPogL.g:378:2: (otherlv_0= 'Item' this_Fitem_1= ruleFitem otherlv_2= ';' )
            {
            // InternalPogL.g:378:2: (otherlv_0= 'Item' this_Fitem_1= ruleFitem otherlv_2= ';' )
            // InternalPogL.g:379:3: otherlv_0= 'Item' this_Fitem_1= ruleFitem otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemAccess().getItemKeyword_0());
            		

            			newCompositeNode(grammarAccess.getItemAccess().getFitemParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_Fitem_1=ruleFitem();

            state._fsp--;


            			current = this_Fitem_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getItemAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleFitem"
    // InternalPogL.g:399:1: entryRuleFitem returns [EObject current=null] : iv_ruleFitem= ruleFitem EOF ;
    public final EObject entryRuleFitem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFitem = null;


        try {
            // InternalPogL.g:399:46: (iv_ruleFitem= ruleFitem EOF )
            // InternalPogL.g:400:2: iv_ruleFitem= ruleFitem EOF
            {
             newCompositeNode(grammarAccess.getFitemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFitem=ruleFitem();

            state._fsp--;

             current =iv_ruleFitem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFitem"


    // $ANTLR start "ruleFitem"
    // InternalPogL.g:406:1: ruleFitem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fitem_name_1_0= ruleFitem_name ) ) ) ;
    public final EObject ruleFitem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_Fitem_name_1_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:412:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fitem_name_1_0= ruleFitem_name ) ) ) )
            // InternalPogL.g:413:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fitem_name_1_0= ruleFitem_name ) ) )
            {
            // InternalPogL.g:413:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fitem_name_1_0= ruleFitem_name ) ) )
            // InternalPogL.g:414:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_Fitem_name_1_0= ruleFitem_name ) )
            {
            // InternalPogL.g:414:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPogL.g:415:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPogL.g:415:4: (lv_name_0_0= RULE_ID )
            // InternalPogL.g:416:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFitemAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFitemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPogL.g:432:3: ( (lv_Fitem_name_1_0= ruleFitem_name ) )
            // InternalPogL.g:433:4: (lv_Fitem_name_1_0= ruleFitem_name )
            {
            // InternalPogL.g:433:4: (lv_Fitem_name_1_0= ruleFitem_name )
            // InternalPogL.g:434:5: lv_Fitem_name_1_0= ruleFitem_name
            {

            					newCompositeNode(grammarAccess.getFitemAccess().getFitem_nameFitem_nameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Fitem_name_1_0=ruleFitem_name();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFitemRule());
            					}
            					set(
            						current,
            						"Fitem_name",
            						lv_Fitem_name_1_0,
            						"org.xtext.poglanguage.pogl.PogL.Fitem_name");
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
    // $ANTLR end "ruleFitem"


    // $ANTLR start "entryRuleFitem_name"
    // InternalPogL.g:455:1: entryRuleFitem_name returns [EObject current=null] : iv_ruleFitem_name= ruleFitem_name EOF ;
    public final EObject entryRuleFitem_name() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFitem_name = null;


        try {
            // InternalPogL.g:455:51: (iv_ruleFitem_name= ruleFitem_name EOF )
            // InternalPogL.g:456:2: iv_ruleFitem_name= ruleFitem_name EOF
            {
             newCompositeNode(grammarAccess.getFitem_nameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFitem_name=ruleFitem_name();

            state._fsp--;

             current =iv_ruleFitem_name; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFitem_name"


    // $ANTLR start "ruleFitem_name"
    // InternalPogL.g:462:1: ruleFitem_name returns [EObject current=null] : ( (otherlv_0= 'set' ( (lv_amount_1_0= RULE_INT ) ) ) | (otherlv_2= 'add' ( (lv_amount_3_0= RULE_INT ) ) ) | (otherlv_4= 'remove' ( (lv_amount_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleFitem_name() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;
        Token otherlv_2=null;
        Token lv_amount_3_0=null;
        Token otherlv_4=null;
        Token lv_amount_5_0=null;


        	enterRule();

        try {
            // InternalPogL.g:468:2: ( ( (otherlv_0= 'set' ( (lv_amount_1_0= RULE_INT ) ) ) | (otherlv_2= 'add' ( (lv_amount_3_0= RULE_INT ) ) ) | (otherlv_4= 'remove' ( (lv_amount_5_0= RULE_INT ) ) ) ) )
            // InternalPogL.g:469:2: ( (otherlv_0= 'set' ( (lv_amount_1_0= RULE_INT ) ) ) | (otherlv_2= 'add' ( (lv_amount_3_0= RULE_INT ) ) ) | (otherlv_4= 'remove' ( (lv_amount_5_0= RULE_INT ) ) ) )
            {
            // InternalPogL.g:469:2: ( (otherlv_0= 'set' ( (lv_amount_1_0= RULE_INT ) ) ) | (otherlv_2= 'add' ( (lv_amount_3_0= RULE_INT ) ) ) | (otherlv_4= 'remove' ( (lv_amount_5_0= RULE_INT ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPogL.g:470:3: (otherlv_0= 'set' ( (lv_amount_1_0= RULE_INT ) ) )
                    {
                    // InternalPogL.g:470:3: (otherlv_0= 'set' ( (lv_amount_1_0= RULE_INT ) ) )
                    // InternalPogL.g:471:4: otherlv_0= 'set' ( (lv_amount_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getFitem_nameAccess().getSetKeyword_0_0());
                    			
                    // InternalPogL.g:475:4: ( (lv_amount_1_0= RULE_INT ) )
                    // InternalPogL.g:476:5: (lv_amount_1_0= RULE_INT )
                    {
                    // InternalPogL.g:476:5: (lv_amount_1_0= RULE_INT )
                    // InternalPogL.g:477:6: lv_amount_1_0= RULE_INT
                    {
                    lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_amount_1_0, grammarAccess.getFitem_nameAccess().getAmountINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFitem_nameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"amount",
                    							lv_amount_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPogL.g:495:3: (otherlv_2= 'add' ( (lv_amount_3_0= RULE_INT ) ) )
                    {
                    // InternalPogL.g:495:3: (otherlv_2= 'add' ( (lv_amount_3_0= RULE_INT ) ) )
                    // InternalPogL.g:496:4: otherlv_2= 'add' ( (lv_amount_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getFitem_nameAccess().getAddKeyword_1_0());
                    			
                    // InternalPogL.g:500:4: ( (lv_amount_3_0= RULE_INT ) )
                    // InternalPogL.g:501:5: (lv_amount_3_0= RULE_INT )
                    {
                    // InternalPogL.g:501:5: (lv_amount_3_0= RULE_INT )
                    // InternalPogL.g:502:6: lv_amount_3_0= RULE_INT
                    {
                    lv_amount_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_amount_3_0, grammarAccess.getFitem_nameAccess().getAmountINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFitem_nameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"amount",
                    							lv_amount_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPogL.g:520:3: (otherlv_4= 'remove' ( (lv_amount_5_0= RULE_INT ) ) )
                    {
                    // InternalPogL.g:520:3: (otherlv_4= 'remove' ( (lv_amount_5_0= RULE_INT ) ) )
                    // InternalPogL.g:521:4: otherlv_4= 'remove' ( (lv_amount_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getFitem_nameAccess().getRemoveKeyword_2_0());
                    			
                    // InternalPogL.g:525:4: ( (lv_amount_5_0= RULE_INT ) )
                    // InternalPogL.g:526:5: (lv_amount_5_0= RULE_INT )
                    {
                    // InternalPogL.g:526:5: (lv_amount_5_0= RULE_INT )
                    // InternalPogL.g:527:6: lv_amount_5_0= RULE_INT
                    {
                    lv_amount_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_amount_5_0, grammarAccess.getFitem_nameAccess().getAmountINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFitem_nameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"amount",
                    							lv_amount_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleFitem_name"


    // $ANTLR start "entryRuleGoto"
    // InternalPogL.g:548:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // InternalPogL.g:548:45: (iv_ruleGoto= ruleGoto EOF )
            // InternalPogL.g:549:2: iv_ruleGoto= ruleGoto EOF
            {
             newCompositeNode(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoto=ruleGoto();

            state._fsp--;

             current =iv_ruleGoto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // InternalPogL.g:555:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPogL.g:561:2: ( (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalPogL.g:562:2: (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalPogL.g:562:2: (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalPogL.g:563:3: otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
            		
            // InternalPogL.g:567:3: ( (otherlv_1= RULE_ID ) )
            // InternalPogL.g:568:4: (otherlv_1= RULE_ID )
            {
            // InternalPogL.g:568:4: (otherlv_1= RULE_ID )
            // InternalPogL.g:569:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGotoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getGotoAccess().getState_nameFstateCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGotoAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleShow"
    // InternalPogL.g:588:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // InternalPogL.g:588:45: (iv_ruleShow= ruleShow EOF )
            // InternalPogL.g:589:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalPogL.g:595:1: ruleShow returns [EObject current=null] : (otherlv_0= 'Show' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPogL.g:601:2: ( (otherlv_0= 'Show' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalPogL.g:602:2: (otherlv_0= 'Show' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalPogL.g:602:2: (otherlv_0= 'Show' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalPogL.g:603:3: otherlv_0= 'Show' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getShowAccess().getShowKeyword_0());
            		
            // InternalPogL.g:607:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalPogL.g:608:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalPogL.g:608:4: (lv_text_1_0= RULE_STRING )
            // InternalPogL.g:609:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_text_1_0, grammarAccess.getShowAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getShowAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleOperation"
    // InternalPogL.g:633:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalPogL.g:633:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalPogL.g:634:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalPogL.g:640:1: ruleOperation returns [EObject current=null] : (this_State_0= ruleState | this_Item_1= ruleItem | this_Action_2= ruleAction | this_Check_3= ruleCheck | this_Goto_4= ruleGoto | this_Show_5= ruleShow ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Item_1 = null;

        EObject this_Action_2 = null;

        EObject this_Check_3 = null;

        EObject this_Goto_4 = null;

        EObject this_Show_5 = null;



        	enterRule();

        try {
            // InternalPogL.g:646:2: ( (this_State_0= ruleState | this_Item_1= ruleItem | this_Action_2= ruleAction | this_Check_3= ruleCheck | this_Goto_4= ruleGoto | this_Show_5= ruleShow ) )
            // InternalPogL.g:647:2: (this_State_0= ruleState | this_Item_1= ruleItem | this_Action_2= ruleAction | this_Check_3= ruleCheck | this_Goto_4= ruleGoto | this_Show_5= ruleShow )
            {
            // InternalPogL.g:647:2: (this_State_0= ruleState | this_Item_1= ruleItem | this_Action_2= ruleAction | this_Check_3= ruleCheck | this_Goto_4= ruleGoto | this_Show_5= ruleShow )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPogL.g:648:3: this_State_0= ruleState
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_0=ruleState();

                    state._fsp--;


                    			current = this_State_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPogL.g:657:3: this_Item_1= ruleItem
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Item_1=ruleItem();

                    state._fsp--;


                    			current = this_Item_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPogL.g:666:3: this_Action_2= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_2=ruleAction();

                    state._fsp--;


                    			current = this_Action_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPogL.g:675:3: this_Check_3= ruleCheck
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getCheckParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Check_3=ruleCheck();

                    state._fsp--;


                    			current = this_Check_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPogL.g:684:3: this_Goto_4= ruleGoto
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getGotoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Goto_4=ruleGoto();

                    state._fsp--;


                    			current = this_Goto_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPogL.g:693:3: this_Show_5= ruleShow
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getShowParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Show_5=ruleShow();

                    state._fsp--;


                    			current = this_Show_5;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperations"
    // InternalPogL.g:705:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalPogL.g:705:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalPogL.g:706:2: iv_ruleOperations= ruleOperations EOF
            {
             newCompositeNode(grammarAccess.getOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperations=ruleOperations();

            state._fsp--;

             current =iv_ruleOperations; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalPogL.g:712:1: ruleOperations returns [EObject current=null] : ( ( (lv_operation_0_0= ruleOperation ) ) ( (lv_Foperations_1_0= ruleFOperations ) )? ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_Foperations_1_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:718:2: ( ( ( (lv_operation_0_0= ruleOperation ) ) ( (lv_Foperations_1_0= ruleFOperations ) )? ) )
            // InternalPogL.g:719:2: ( ( (lv_operation_0_0= ruleOperation ) ) ( (lv_Foperations_1_0= ruleFOperations ) )? )
            {
            // InternalPogL.g:719:2: ( ( (lv_operation_0_0= ruleOperation ) ) ( (lv_Foperations_1_0= ruleFOperations ) )? )
            // InternalPogL.g:720:3: ( (lv_operation_0_0= ruleOperation ) ) ( (lv_Foperations_1_0= ruleFOperations ) )?
            {
            // InternalPogL.g:720:3: ( (lv_operation_0_0= ruleOperation ) )
            // InternalPogL.g:721:4: (lv_operation_0_0= ruleOperation )
            {
            // InternalPogL.g:721:4: (lv_operation_0_0= ruleOperation )
            // InternalPogL.g:722:5: lv_operation_0_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getOperationsAccess().getOperationOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_operation_0_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_0_0,
            						"org.xtext.poglanguage.pogl.PogL.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPogL.g:739:3: ( (lv_Foperations_1_0= ruleFOperations ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11||LA6_0==15||(LA6_0>=19 && LA6_0<=20)||LA6_0==24||LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPogL.g:740:4: (lv_Foperations_1_0= ruleFOperations )
                    {
                    // InternalPogL.g:740:4: (lv_Foperations_1_0= ruleFOperations )
                    // InternalPogL.g:741:5: lv_Foperations_1_0= ruleFOperations
                    {

                    					newCompositeNode(grammarAccess.getOperationsAccess().getFoperationsFOperationsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_Foperations_1_0=ruleFOperations();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationsRule());
                    					}
                    					set(
                    						current,
                    						"Foperations",
                    						lv_Foperations_1_0,
                    						"org.xtext.poglanguage.pogl.PogL.FOperations");
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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleFOperations"
    // InternalPogL.g:762:1: entryRuleFOperations returns [EObject current=null] : iv_ruleFOperations= ruleFOperations EOF ;
    public final EObject entryRuleFOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFOperations = null;


        try {
            // InternalPogL.g:762:52: (iv_ruleFOperations= ruleFOperations EOF )
            // InternalPogL.g:763:2: iv_ruleFOperations= ruleFOperations EOF
            {
             newCompositeNode(grammarAccess.getFOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFOperations=ruleFOperations();

            state._fsp--;

             current =iv_ruleFOperations; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFOperations"


    // $ANTLR start "ruleFOperations"
    // InternalPogL.g:769:1: ruleFOperations returns [EObject current=null] : ( (lv_operations_0_0= ruleOperations ) ) ;
    public final EObject ruleFOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:775:2: ( ( (lv_operations_0_0= ruleOperations ) ) )
            // InternalPogL.g:776:2: ( (lv_operations_0_0= ruleOperations ) )
            {
            // InternalPogL.g:776:2: ( (lv_operations_0_0= ruleOperations ) )
            // InternalPogL.g:777:3: (lv_operations_0_0= ruleOperations )
            {
            // InternalPogL.g:777:3: (lv_operations_0_0= ruleOperations )
            // InternalPogL.g:778:4: lv_operations_0_0= ruleOperations
            {

            				newCompositeNode(grammarAccess.getFOperationsAccess().getOperationsOperationsParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_operations_0_0=ruleOperations();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFOperationsRule());
            				}
            				set(
            					current,
            					"operations",
            					lv_operations_0_0,
            					"org.xtext.poglanguage.pogl.PogL.Operations");
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
    // $ANTLR end "ruleFOperations"


    // $ANTLR start "entryRuleComparisonOperators"
    // InternalPogL.g:798:1: entryRuleComparisonOperators returns [String current=null] : iv_ruleComparisonOperators= ruleComparisonOperators EOF ;
    public final String entryRuleComparisonOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperators = null;


        try {
            // InternalPogL.g:798:59: (iv_ruleComparisonOperators= ruleComparisonOperators EOF )
            // InternalPogL.g:799:2: iv_ruleComparisonOperators= ruleComparisonOperators EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperators=ruleComparisonOperators();

            state._fsp--;

             current =iv_ruleComparisonOperators.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonOperators"


    // $ANTLR start "ruleComparisonOperators"
    // InternalPogL.g:805:1: ruleComparisonOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPogL.g:811:2: ( (kw= '<' | kw= '>' | kw= '=' ) )
            // InternalPogL.g:812:2: (kw= '<' | kw= '>' | kw= '=' )
            {
            // InternalPogL.g:812:2: (kw= '<' | kw= '>' | kw= '=' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPogL.g:813:3: kw= '<'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorsAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPogL.g:819:3: kw= '>'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPogL.g:825:3: kw= '='
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorsAccess().getEqualsSignKeyword_2());
                    		

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
    // $ANTLR end "ruleComparisonOperators"


    // $ANTLR start "entryRuleCheck"
    // InternalPogL.g:834:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalPogL.g:834:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalPogL.g:835:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalPogL.g:841:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' ( (lv_Fcheck_1_0= ruleFCheck ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_Fcheck_1_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:847:2: ( (otherlv_0= 'check' ( (lv_Fcheck_1_0= ruleFCheck ) ) ) )
            // InternalPogL.g:848:2: (otherlv_0= 'check' ( (lv_Fcheck_1_0= ruleFCheck ) ) )
            {
            // InternalPogL.g:848:2: (otherlv_0= 'check' ( (lv_Fcheck_1_0= ruleFCheck ) ) )
            // InternalPogL.g:849:3: otherlv_0= 'check' ( (lv_Fcheck_1_0= ruleFCheck ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalPogL.g:853:3: ( (lv_Fcheck_1_0= ruleFCheck ) )
            // InternalPogL.g:854:4: (lv_Fcheck_1_0= ruleFCheck )
            {
            // InternalPogL.g:854:4: (lv_Fcheck_1_0= ruleFCheck )
            // InternalPogL.g:855:5: lv_Fcheck_1_0= ruleFCheck
            {

            					newCompositeNode(grammarAccess.getCheckAccess().getFcheckFCheckParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Fcheck_1_0=ruleFCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckRule());
            					}
            					set(
            						current,
            						"Fcheck",
            						lv_Fcheck_1_0,
            						"org.xtext.poglanguage.pogl.PogL.FCheck");
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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleFCheck"
    // InternalPogL.g:876:1: entryRuleFCheck returns [EObject current=null] : iv_ruleFCheck= ruleFCheck EOF ;
    public final EObject entryRuleFCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFCheck = null;


        try {
            // InternalPogL.g:876:47: (iv_ruleFCheck= ruleFCheck EOF )
            // InternalPogL.g:877:2: iv_ruleFCheck= ruleFCheck EOF
            {
             newCompositeNode(grammarAccess.getFCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFCheck=ruleFCheck();

            state._fsp--;

             current =iv_ruleFCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFCheck"


    // $ANTLR start "ruleFCheck"
    // InternalPogL.g:883:1: ruleFCheck returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_FCheck_item_1_0= ruleFCheck_item ) ) ) ;
    public final EObject ruleFCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_FCheck_item_1_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:889:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_FCheck_item_1_0= ruleFCheck_item ) ) ) )
            // InternalPogL.g:890:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_FCheck_item_1_0= ruleFCheck_item ) ) )
            {
            // InternalPogL.g:890:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_FCheck_item_1_0= ruleFCheck_item ) ) )
            // InternalPogL.g:891:3: ( (otherlv_0= RULE_ID ) ) ( (lv_FCheck_item_1_0= ruleFCheck_item ) )
            {
            // InternalPogL.g:891:3: ( (otherlv_0= RULE_ID ) )
            // InternalPogL.g:892:4: (otherlv_0= RULE_ID )
            {
            // InternalPogL.g:892:4: (otherlv_0= RULE_ID )
            // InternalPogL.g:893:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFCheckRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getFCheckAccess().getItemFitemCrossReference_0_0());
            				

            }


            }

            // InternalPogL.g:904:3: ( (lv_FCheck_item_1_0= ruleFCheck_item ) )
            // InternalPogL.g:905:4: (lv_FCheck_item_1_0= ruleFCheck_item )
            {
            // InternalPogL.g:905:4: (lv_FCheck_item_1_0= ruleFCheck_item )
            // InternalPogL.g:906:5: lv_FCheck_item_1_0= ruleFCheck_item
            {

            					newCompositeNode(grammarAccess.getFCheckAccess().getFCheck_itemFCheck_itemParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_FCheck_item_1_0=ruleFCheck_item();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFCheckRule());
            					}
            					set(
            						current,
            						"FCheck_item",
            						lv_FCheck_item_1_0,
            						"org.xtext.poglanguage.pogl.PogL.FCheck_item");
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
    // $ANTLR end "ruleFCheck"


    // $ANTLR start "entryRuleFCheck_item"
    // InternalPogL.g:927:1: entryRuleFCheck_item returns [EObject current=null] : iv_ruleFCheck_item= ruleFCheck_item EOF ;
    public final EObject entryRuleFCheck_item() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFCheck_item = null;


        try {
            // InternalPogL.g:927:52: (iv_ruleFCheck_item= ruleFCheck_item EOF )
            // InternalPogL.g:928:2: iv_ruleFCheck_item= ruleFCheck_item EOF
            {
             newCompositeNode(grammarAccess.getFCheck_itemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFCheck_item=ruleFCheck_item();

            state._fsp--;

             current =iv_ruleFCheck_item; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFCheck_item"


    // $ANTLR start "ruleFCheck_item"
    // InternalPogL.g:934:1: ruleFCheck_item returns [EObject current=null] : ( ( (lv_comparisonOperator_0_0= ruleComparisonOperators ) ) ( (lv_FComparison_Operators_1_0= ruleFComparison_Operators ) ) ) ;
    public final EObject ruleFCheck_item() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_comparisonOperator_0_0 = null;

        EObject lv_FComparison_Operators_1_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:940:2: ( ( ( (lv_comparisonOperator_0_0= ruleComparisonOperators ) ) ( (lv_FComparison_Operators_1_0= ruleFComparison_Operators ) ) ) )
            // InternalPogL.g:941:2: ( ( (lv_comparisonOperator_0_0= ruleComparisonOperators ) ) ( (lv_FComparison_Operators_1_0= ruleFComparison_Operators ) ) )
            {
            // InternalPogL.g:941:2: ( ( (lv_comparisonOperator_0_0= ruleComparisonOperators ) ) ( (lv_FComparison_Operators_1_0= ruleFComparison_Operators ) ) )
            // InternalPogL.g:942:3: ( (lv_comparisonOperator_0_0= ruleComparisonOperators ) ) ( (lv_FComparison_Operators_1_0= ruleFComparison_Operators ) )
            {
            // InternalPogL.g:942:3: ( (lv_comparisonOperator_0_0= ruleComparisonOperators ) )
            // InternalPogL.g:943:4: (lv_comparisonOperator_0_0= ruleComparisonOperators )
            {
            // InternalPogL.g:943:4: (lv_comparisonOperator_0_0= ruleComparisonOperators )
            // InternalPogL.g:944:5: lv_comparisonOperator_0_0= ruleComparisonOperators
            {

            					newCompositeNode(grammarAccess.getFCheck_itemAccess().getComparisonOperatorComparisonOperatorsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_comparisonOperator_0_0=ruleComparisonOperators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFCheck_itemRule());
            					}
            					set(
            						current,
            						"comparisonOperator",
            						lv_comparisonOperator_0_0,
            						"org.xtext.poglanguage.pogl.PogL.ComparisonOperators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPogL.g:961:3: ( (lv_FComparison_Operators_1_0= ruleFComparison_Operators ) )
            // InternalPogL.g:962:4: (lv_FComparison_Operators_1_0= ruleFComparison_Operators )
            {
            // InternalPogL.g:962:4: (lv_FComparison_Operators_1_0= ruleFComparison_Operators )
            // InternalPogL.g:963:5: lv_FComparison_Operators_1_0= ruleFComparison_Operators
            {

            					newCompositeNode(grammarAccess.getFCheck_itemAccess().getFComparison_OperatorsFComparison_OperatorsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_FComparison_Operators_1_0=ruleFComparison_Operators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFCheck_itemRule());
            					}
            					set(
            						current,
            						"FComparison_Operators",
            						lv_FComparison_Operators_1_0,
            						"org.xtext.poglanguage.pogl.PogL.FComparison_Operators");
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
    // $ANTLR end "ruleFCheck_item"


    // $ANTLR start "entryRuleFComparison_Operators"
    // InternalPogL.g:984:1: entryRuleFComparison_Operators returns [EObject current=null] : iv_ruleFComparison_Operators= ruleFComparison_Operators EOF ;
    public final EObject entryRuleFComparison_Operators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFComparison_Operators = null;


        try {
            // InternalPogL.g:984:62: (iv_ruleFComparison_Operators= ruleFComparison_Operators EOF )
            // InternalPogL.g:985:2: iv_ruleFComparison_Operators= ruleFComparison_Operators EOF
            {
             newCompositeNode(grammarAccess.getFComparison_OperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFComparison_Operators=ruleFComparison_Operators();

            state._fsp--;

             current =iv_ruleFComparison_Operators; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFComparison_Operators"


    // $ANTLR start "ruleFComparison_Operators"
    // InternalPogL.g:991:1: ruleFComparison_Operators returns [EObject current=null] : (this_INT_0= RULE_INT this_FINT_1= ruleFINT ) ;
    public final EObject ruleFComparison_Operators() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        EObject this_FINT_1 = null;



        	enterRule();

        try {
            // InternalPogL.g:997:2: ( (this_INT_0= RULE_INT this_FINT_1= ruleFINT ) )
            // InternalPogL.g:998:2: (this_INT_0= RULE_INT this_FINT_1= ruleFINT )
            {
            // InternalPogL.g:998:2: (this_INT_0= RULE_INT this_FINT_1= ruleFINT )
            // InternalPogL.g:999:3: this_INT_0= RULE_INT this_FINT_1= ruleFINT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            			newLeafNode(this_INT_0, grammarAccess.getFComparison_OperatorsAccess().getINTTerminalRuleCall_0());
            		

            			newCompositeNode(grammarAccess.getFComparison_OperatorsAccess().getFINTParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_FINT_1=ruleFINT();

            state._fsp--;


            			current = this_FINT_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleFComparison_Operators"


    // $ANTLR start "entryRuleFINT"
    // InternalPogL.g:1015:1: entryRuleFINT returns [EObject current=null] : iv_ruleFINT= ruleFINT EOF ;
    public final EObject entryRuleFINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFINT = null;


        try {
            // InternalPogL.g:1015:45: (iv_ruleFINT= ruleFINT EOF )
            // InternalPogL.g:1016:2: iv_ruleFINT= ruleFINT EOF
            {
             newCompositeNode(grammarAccess.getFINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFINT=ruleFINT();

            state._fsp--;

             current =iv_ruleFINT; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFINT"


    // $ANTLR start "ruleFINT"
    // InternalPogL.g:1022:1: ruleFINT returns [EObject current=null] : (otherlv_0= 'then' this_Fthen_1= ruleFthen ) ;
    public final EObject ruleFINT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Fthen_1 = null;



        	enterRule();

        try {
            // InternalPogL.g:1028:2: ( (otherlv_0= 'then' this_Fthen_1= ruleFthen ) )
            // InternalPogL.g:1029:2: (otherlv_0= 'then' this_Fthen_1= ruleFthen )
            {
            // InternalPogL.g:1029:2: (otherlv_0= 'then' this_Fthen_1= ruleFthen )
            // InternalPogL.g:1030:3: otherlv_0= 'then' this_Fthen_1= ruleFthen
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFINTAccess().getThenKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFINTAccess().getFthenParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Fthen_1=ruleFthen();

            state._fsp--;


            			current = this_Fthen_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleFINT"


    // $ANTLR start "entryRuleFthen"
    // InternalPogL.g:1046:1: entryRuleFthen returns [EObject current=null] : iv_ruleFthen= ruleFthen EOF ;
    public final EObject entryRuleFthen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFthen = null;


        try {
            // InternalPogL.g:1046:46: (iv_ruleFthen= ruleFthen EOF )
            // InternalPogL.g:1047:2: iv_ruleFthen= ruleFthen EOF
            {
             newCompositeNode(grammarAccess.getFthenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFthen=ruleFthen();

            state._fsp--;

             current =iv_ruleFthen; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFthen"


    // $ANTLR start "ruleFthen"
    // InternalPogL.g:1053:1: ruleFthen returns [EObject current=null] : ( ( (lv_operationtrue_0_0= ruleOperations ) ) ( (lv_FThenOperations_1_0= ruleFThenOperations ) ) ) ;
    public final EObject ruleFthen() throws RecognitionException {
        EObject current = null;

        EObject lv_operationtrue_0_0 = null;

        EObject lv_FThenOperations_1_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:1059:2: ( ( ( (lv_operationtrue_0_0= ruleOperations ) ) ( (lv_FThenOperations_1_0= ruleFThenOperations ) ) ) )
            // InternalPogL.g:1060:2: ( ( (lv_operationtrue_0_0= ruleOperations ) ) ( (lv_FThenOperations_1_0= ruleFThenOperations ) ) )
            {
            // InternalPogL.g:1060:2: ( ( (lv_operationtrue_0_0= ruleOperations ) ) ( (lv_FThenOperations_1_0= ruleFThenOperations ) ) )
            // InternalPogL.g:1061:3: ( (lv_operationtrue_0_0= ruleOperations ) ) ( (lv_FThenOperations_1_0= ruleFThenOperations ) )
            {
            // InternalPogL.g:1061:3: ( (lv_operationtrue_0_0= ruleOperations ) )
            // InternalPogL.g:1062:4: (lv_operationtrue_0_0= ruleOperations )
            {
            // InternalPogL.g:1062:4: (lv_operationtrue_0_0= ruleOperations )
            // InternalPogL.g:1063:5: lv_operationtrue_0_0= ruleOperations
            {

            					newCompositeNode(grammarAccess.getFthenAccess().getOperationtrueOperationsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_operationtrue_0_0=ruleOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFthenRule());
            					}
            					set(
            						current,
            						"operationtrue",
            						lv_operationtrue_0_0,
            						"org.xtext.poglanguage.pogl.PogL.Operations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPogL.g:1080:3: ( (lv_FThenOperations_1_0= ruleFThenOperations ) )
            // InternalPogL.g:1081:4: (lv_FThenOperations_1_0= ruleFThenOperations )
            {
            // InternalPogL.g:1081:4: (lv_FThenOperations_1_0= ruleFThenOperations )
            // InternalPogL.g:1082:5: lv_FThenOperations_1_0= ruleFThenOperations
            {

            					newCompositeNode(grammarAccess.getFthenAccess().getFThenOperationsFThenOperationsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_FThenOperations_1_0=ruleFThenOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFthenRule());
            					}
            					set(
            						current,
            						"FThenOperations",
            						lv_FThenOperations_1_0,
            						"org.xtext.poglanguage.pogl.PogL.FThenOperations");
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
    // $ANTLR end "ruleFthen"


    // $ANTLR start "entryRuleFThenOperations"
    // InternalPogL.g:1103:1: entryRuleFThenOperations returns [EObject current=null] : iv_ruleFThenOperations= ruleFThenOperations EOF ;
    public final EObject entryRuleFThenOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFThenOperations = null;


        try {
            // InternalPogL.g:1103:56: (iv_ruleFThenOperations= ruleFThenOperations EOF )
            // InternalPogL.g:1104:2: iv_ruleFThenOperations= ruleFThenOperations EOF
            {
             newCompositeNode(grammarAccess.getFThenOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFThenOperations=ruleFThenOperations();

            state._fsp--;

             current =iv_ruleFThenOperations; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFThenOperations"


    // $ANTLR start "ruleFThenOperations"
    // InternalPogL.g:1110:1: ruleFThenOperations returns [EObject current=null] : ( (otherlv_0= 'else' ( (lv_operationfalse_1_0= ruleOperations ) ) otherlv_2= 'endcheck' ) | ( () otherlv_4= 'endcheck' ) ) ;
    public final EObject ruleFThenOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operationfalse_1_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:1116:2: ( ( (otherlv_0= 'else' ( (lv_operationfalse_1_0= ruleOperations ) ) otherlv_2= 'endcheck' ) | ( () otherlv_4= 'endcheck' ) ) )
            // InternalPogL.g:1117:2: ( (otherlv_0= 'else' ( (lv_operationfalse_1_0= ruleOperations ) ) otherlv_2= 'endcheck' ) | ( () otherlv_4= 'endcheck' ) )
            {
            // InternalPogL.g:1117:2: ( (otherlv_0= 'else' ( (lv_operationfalse_1_0= ruleOperations ) ) otherlv_2= 'endcheck' ) | ( () otherlv_4= 'endcheck' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPogL.g:1118:3: (otherlv_0= 'else' ( (lv_operationfalse_1_0= ruleOperations ) ) otherlv_2= 'endcheck' )
                    {
                    // InternalPogL.g:1118:3: (otherlv_0= 'else' ( (lv_operationfalse_1_0= ruleOperations ) ) otherlv_2= 'endcheck' )
                    // InternalPogL.g:1119:4: otherlv_0= 'else' ( (lv_operationfalse_1_0= ruleOperations ) ) otherlv_2= 'endcheck'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getFThenOperationsAccess().getElseKeyword_0_0());
                    			
                    // InternalPogL.g:1123:4: ( (lv_operationfalse_1_0= ruleOperations ) )
                    // InternalPogL.g:1124:5: (lv_operationfalse_1_0= ruleOperations )
                    {
                    // InternalPogL.g:1124:5: (lv_operationfalse_1_0= ruleOperations )
                    // InternalPogL.g:1125:6: lv_operationfalse_1_0= ruleOperations
                    {

                    						newCompositeNode(grammarAccess.getFThenOperationsAccess().getOperationfalseOperationsParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_operationfalse_1_0=ruleOperations();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFThenOperationsRule());
                    						}
                    						set(
                    							current,
                    							"operationfalse",
                    							lv_operationfalse_1_0,
                    							"org.xtext.poglanguage.pogl.PogL.Operations");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFThenOperationsAccess().getEndcheckKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPogL.g:1148:3: ( () otherlv_4= 'endcheck' )
                    {
                    // InternalPogL.g:1148:3: ( () otherlv_4= 'endcheck' )
                    // InternalPogL.g:1149:4: () otherlv_4= 'endcheck'
                    {
                    // InternalPogL.g:1149:4: ()
                    // InternalPogL.g:1150:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFThenOperationsAccess().getFThenOperationsAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFThenOperationsAccess().getEndcheckKeyword_1_1());
                    			

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
    // $ANTLR end "ruleFThenOperations"


    // $ANTLR start "entryRuleAction"
    // InternalPogL.g:1165:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPogL.g:1165:47: (iv_ruleAction= ruleAction EOF )
            // InternalPogL.g:1166:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPogL.g:1172:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' otherlv_1= 'in' ( (lv_state_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_operations_5_0= ruleOperations ) )? otherlv_6= 'end' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_state_name_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_operations_5_0 = null;



        	enterRule();

        try {
            // InternalPogL.g:1178:2: ( (otherlv_0= 'Action' otherlv_1= 'in' ( (lv_state_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_operations_5_0= ruleOperations ) )? otherlv_6= 'end' ) )
            // InternalPogL.g:1179:2: (otherlv_0= 'Action' otherlv_1= 'in' ( (lv_state_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_operations_5_0= ruleOperations ) )? otherlv_6= 'end' )
            {
            // InternalPogL.g:1179:2: (otherlv_0= 'Action' otherlv_1= 'in' ( (lv_state_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_operations_5_0= ruleOperations ) )? otherlv_6= 'end' )
            // InternalPogL.g:1180:3: otherlv_0= 'Action' otherlv_1= 'in' ( (lv_state_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_operations_5_0= ruleOperations ) )? otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getInKeyword_1());
            		
            // InternalPogL.g:1188:3: ( (lv_state_name_2_0= RULE_ID ) )
            // InternalPogL.g:1189:4: (lv_state_name_2_0= RULE_ID )
            {
            // InternalPogL.g:1189:4: (lv_state_name_2_0= RULE_ID )
            // InternalPogL.g:1190:5: lv_state_name_2_0= RULE_ID
            {
            lv_state_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_state_name_2_0, grammarAccess.getActionAccess().getState_nameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"state_name",
            						lv_state_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPogL.g:1206:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalPogL.g:1207:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalPogL.g:1207:4: (lv_description_3_0= RULE_STRING )
            // InternalPogL.g:1208:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_description_3_0, grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getDoKeyword_4());
            		
            // InternalPogL.g:1228:3: ( (lv_operations_5_0= ruleOperations ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11||LA9_0==15||(LA9_0>=19 && LA9_0<=20)||LA9_0==24||LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPogL.g:1229:4: (lv_operations_5_0= ruleOperations )
                    {
                    // InternalPogL.g:1229:4: (lv_operations_5_0= ruleOperations )
                    // InternalPogL.g:1230:5: lv_operations_5_0= ruleOperations
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getOperationsOperationsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_operations_5_0=ruleOperations();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"operations",
                    						lv_operations_5_0,
                    						"org.xtext.poglanguage.pogl.PogL.Operations");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000011008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000011188802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000011188800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000091188800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});

}