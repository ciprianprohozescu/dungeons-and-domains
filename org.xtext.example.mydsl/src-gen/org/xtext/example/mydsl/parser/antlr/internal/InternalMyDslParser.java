package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "'start'", "'final'", "';'", "'item'", "'set'", "'action'", "'in'", "'do'", "'end'", "'add'", "'remove'", "'check'", "'then'", "'else'", "'endcheck'", "'>'", "'<'", "'>='", "'<='", "'=='", "'<>'", "'show'", "'goto'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DndGame";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDndGame"
    // InternalMyDsl.g:64:1: entryRuleDndGame returns [EObject current=null] : iv_ruleDndGame= ruleDndGame EOF ;
    public final EObject entryRuleDndGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDndGame = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleDndGame= ruleDndGame EOF )
            // InternalMyDsl.g:65:2: iv_ruleDndGame= ruleDndGame EOF
            {
             newCompositeNode(grammarAccess.getDndGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDndGame=ruleDndGame();

            state._fsp--;

             current =iv_ruleDndGame; 
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
    // $ANTLR end "entryRuleDndGame"


    // $ANTLR start "ruleDndGame"
    // InternalMyDsl.g:71:1: ruleDndGame returns [EObject current=null] : ( ( (lv_states_0_0= ruleState ) )* ( (lv_items_1_0= ruleItem ) )* ( (lv_actions_2_0= ruleAction ) )* ) ;
    public final EObject ruleDndGame() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;

        EObject lv_items_1_0 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_states_0_0= ruleState ) )* ( (lv_items_1_0= ruleItem ) )* ( (lv_actions_2_0= ruleAction ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_states_0_0= ruleState ) )* ( (lv_items_1_0= ruleItem ) )* ( (lv_actions_2_0= ruleAction ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_states_0_0= ruleState ) )* ( (lv_items_1_0= ruleItem ) )* ( (lv_actions_2_0= ruleAction ) )* )
            // InternalMyDsl.g:79:3: ( (lv_states_0_0= ruleState ) )* ( (lv_items_1_0= ruleItem ) )* ( (lv_actions_2_0= ruleAction ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_states_0_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_states_0_0= ruleState )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_states_0_0= ruleState )
            	    // InternalMyDsl.g:81:5: lv_states_0_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getDndGameAccess().getStatesStateParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_states_0_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDndGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_items_1_0= ruleItem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_items_1_0= ruleItem )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_items_1_0= ruleItem )
            	    // InternalMyDsl.g:100:5: lv_items_1_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getDndGameAccess().getItemsItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_items_1_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDndGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:117:3: ( (lv_actions_2_0= ruleAction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:118:4: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:118:4: (lv_actions_2_0= ruleAction )
            	    // InternalMyDsl.g:119:5: lv_actions_2_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getDndGameAccess().getActionsActionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDndGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleDndGame"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:140:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:140:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:141:2: iv_ruleState= ruleState EOF
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
    // InternalMyDsl.g:147:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'start' )? (otherlv_3= 'final' )? ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:153:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'start' )? (otherlv_3= 'final' )? ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            // InternalMyDsl.g:154:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'start' )? (otherlv_3= 'final' )? ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )
            {
            // InternalMyDsl.g:154:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'start' )? (otherlv_3= 'final' )? ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )
            // InternalMyDsl.g:155:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'start' )? (otherlv_3= 'final' )? ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMyDsl.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:161:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:177:3: (otherlv_2= 'start' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:178:4: otherlv_2= 'start'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStartKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:183:3: (otherlv_3= 'final' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:184:4: otherlv_3= 'final'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getFinalKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:189:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalMyDsl.g:190:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:190:4: (lv_description_4_0= RULE_STRING )
            // InternalMyDsl.g:191:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_4_0, grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleItem"
    // InternalMyDsl.g:215:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalMyDsl.g:215:45: (iv_ruleItem= ruleItem EOF )
            // InternalMyDsl.g:216:2: iv_ruleItem= ruleItem EOF
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
    // InternalMyDsl.g:222:1: ruleItem returns [EObject current=null] : (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'set' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:228:2: ( (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'set' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:229:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'set' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:229:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'set' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';' )
            // InternalMyDsl.g:230:3: otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'set' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getItemAccess().getItemKeyword_0());
            		
            // InternalMyDsl.g:234:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:235:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:235:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:236:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getItemAccess().getSetKeyword_2());
            		
            // InternalMyDsl.g:256:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalMyDsl.g:257:4: (lv_value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:257:4: (lv_value_3_0= RULE_INT )
            // InternalMyDsl.g:258:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_value_3_0, grammarAccess.getItemAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getItemAccess().getSemicolonKeyword_4());
            		

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


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:282:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:282:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:283:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:289:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'end' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:295:2: ( (otherlv_0= 'action' otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'end' ) )
            // InternalMyDsl.g:296:2: (otherlv_0= 'action' otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'end' )
            {
            // InternalMyDsl.g:296:2: (otherlv_0= 'action' otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'end' )
            // InternalMyDsl.g:297:3: otherlv_0= 'action' otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'do' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getInKeyword_1());
            		
            // InternalMyDsl.g:305:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:306:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:306:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:307:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getActionAccess().getStateStateCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:318:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalMyDsl.g:319:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:319:4: (lv_description_3_0= RULE_STRING )
            // InternalMyDsl.g:320:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_4=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getDoKeyword_4());
            		
            // InternalMyDsl.g:340:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==23||(LA6_0>=33 && LA6_0<=34)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:341:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:341:4: (lv_statements_5_0= ruleStatement )
            	    // InternalMyDsl.g:342:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:367:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:367:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:368:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:374:1: ruleStatement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleAssignment ) ) | ( (lv_conditional_1_0= ruleConditional ) ) | ( (lv_action_2_0= ruleSimpleAction ) ) | ( (lv_print_3_0= rulePrint ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;

        EObject lv_conditional_1_0 = null;

        EObject lv_action_2_0 = null;

        EObject lv_print_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:380:2: ( ( ( (lv_assignment_0_0= ruleAssignment ) ) | ( (lv_conditional_1_0= ruleConditional ) ) | ( (lv_action_2_0= ruleSimpleAction ) ) | ( (lv_print_3_0= rulePrint ) ) ) )
            // InternalMyDsl.g:381:2: ( ( (lv_assignment_0_0= ruleAssignment ) ) | ( (lv_conditional_1_0= ruleConditional ) ) | ( (lv_action_2_0= ruleSimpleAction ) ) | ( (lv_print_3_0= rulePrint ) ) )
            {
            // InternalMyDsl.g:381:2: ( ( (lv_assignment_0_0= ruleAssignment ) ) | ( (lv_conditional_1_0= ruleConditional ) ) | ( (lv_action_2_0= ruleSimpleAction ) ) | ( (lv_print_3_0= rulePrint ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            case 33:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:382:3: ( (lv_assignment_0_0= ruleAssignment ) )
                    {
                    // InternalMyDsl.g:382:3: ( (lv_assignment_0_0= ruleAssignment ) )
                    // InternalMyDsl.g:383:4: (lv_assignment_0_0= ruleAssignment )
                    {
                    // InternalMyDsl.g:383:4: (lv_assignment_0_0= ruleAssignment )
                    // InternalMyDsl.g:384:5: lv_assignment_0_0= ruleAssignment
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getAssignmentAssignmentParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignment_0_0=ruleAssignment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"assignment",
                    						lv_assignment_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Assignment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:402:3: ( (lv_conditional_1_0= ruleConditional ) )
                    {
                    // InternalMyDsl.g:402:3: ( (lv_conditional_1_0= ruleConditional ) )
                    // InternalMyDsl.g:403:4: (lv_conditional_1_0= ruleConditional )
                    {
                    // InternalMyDsl.g:403:4: (lv_conditional_1_0= ruleConditional )
                    // InternalMyDsl.g:404:5: lv_conditional_1_0= ruleConditional
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getConditionalConditionalParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_1_0=ruleConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Conditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:422:3: ( (lv_action_2_0= ruleSimpleAction ) )
                    {
                    // InternalMyDsl.g:422:3: ( (lv_action_2_0= ruleSimpleAction ) )
                    // InternalMyDsl.g:423:4: (lv_action_2_0= ruleSimpleAction )
                    {
                    // InternalMyDsl.g:423:4: (lv_action_2_0= ruleSimpleAction )
                    // InternalMyDsl.g:424:5: lv_action_2_0= ruleSimpleAction
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getActionSimpleActionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_action_2_0=ruleSimpleAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"action",
                    						lv_action_2_0,
                    						"org.xtext.example.mydsl.MyDsl.SimpleAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:442:3: ( (lv_print_3_0= rulePrint ) )
                    {
                    // InternalMyDsl.g:442:3: ( (lv_print_3_0= rulePrint ) )
                    // InternalMyDsl.g:443:4: (lv_print_3_0= rulePrint )
                    {
                    // InternalMyDsl.g:443:4: (lv_print_3_0= rulePrint )
                    // InternalMyDsl.g:444:5: lv_print_3_0= rulePrint
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getPrintPrintParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_print_3_0=rulePrint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"print",
                    						lv_print_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Print");
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignment"
    // InternalMyDsl.g:465:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMyDsl.g:465:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMyDsl.g:466:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMyDsl.g:472:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'add' | otherlv_2= 'remove' ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:478:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'add' | otherlv_2= 'remove' ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:479:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'add' | otherlv_2= 'remove' ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:479:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'add' | otherlv_2= 'remove' ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';' )
            // InternalMyDsl.g:480:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'add' | otherlv_2= 'remove' ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            // InternalMyDsl.g:480:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:481:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:481:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:482:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getTargetItemCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:493:3: (otherlv_1= 'add' | otherlv_2= 'remove' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:494:4: otherlv_1= 'add'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getAddKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:499:4: otherlv_2= 'remove'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getRemoveKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:504:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalMyDsl.g:505:4: (lv_value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:505:4: (lv_value_3_0= RULE_INT )
            // InternalMyDsl.g:506:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_value_3_0, grammarAccess.getAssignmentAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // InternalMyDsl.g:530:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalMyDsl.g:530:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalMyDsl.g:531:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalMyDsl.g:537:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleBlock ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruleBlock ) ) )? otherlv_6= 'endcheck' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_1_0 = null;

        EObject lv_body_3_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:543:2: ( (otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleBlock ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruleBlock ) ) )? otherlv_6= 'endcheck' ) )
            // InternalMyDsl.g:544:2: (otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleBlock ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruleBlock ) ) )? otherlv_6= 'endcheck' )
            {
            // InternalMyDsl.g:544:2: (otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleBlock ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruleBlock ) ) )? otherlv_6= 'endcheck' )
            // InternalMyDsl.g:545:3: otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleBlock ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruleBlock ) ) )? otherlv_6= 'endcheck'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getCheckKeyword_0());
            		
            // InternalMyDsl.g:549:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMyDsl.g:550:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:550:4: (lv_expression_1_0= ruleExpression )
            // InternalMyDsl.g:551:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
            		
            // InternalMyDsl.g:572:3: ( (lv_body_3_0= ruleBlock ) )
            // InternalMyDsl.g:573:4: (lv_body_3_0= ruleBlock )
            {
            // InternalMyDsl.g:573:4: (lv_body_3_0= ruleBlock )
            // InternalMyDsl.g:574:5: lv_body_3_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getBodyBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_body_3_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:591:3: (otherlv_4= 'else' ( (lv_else_5_0= ruleBlock ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:592:4: otherlv_4= 'else' ( (lv_else_5_0= ruleBlock ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getElseKeyword_4_0());
                    			
                    // InternalMyDsl.g:596:4: ( (lv_else_5_0= ruleBlock ) )
                    // InternalMyDsl.g:597:5: (lv_else_5_0= ruleBlock )
                    {
                    // InternalMyDsl.g:597:5: (lv_else_5_0= ruleBlock )
                    // InternalMyDsl.g:598:6: lv_else_5_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getElseBlockParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_else_5_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalRule());
                    						}
                    						set(
                    							current,
                    							"else",
                    							lv_else_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getEndcheckKeyword_5());
            		

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:624:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:624:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:625:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:631:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleTerm ) ) ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_right_2_0= ruleTerm ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:637:2: ( ( ( (lv_left_0_0= ruleTerm ) ) ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_right_2_0= ruleTerm ) ) ) )
            // InternalMyDsl.g:638:2: ( ( (lv_left_0_0= ruleTerm ) ) ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_right_2_0= ruleTerm ) ) )
            {
            // InternalMyDsl.g:638:2: ( ( (lv_left_0_0= ruleTerm ) ) ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_right_2_0= ruleTerm ) ) )
            // InternalMyDsl.g:639:3: ( (lv_left_0_0= ruleTerm ) ) ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_right_2_0= ruleTerm ) )
            {
            // InternalMyDsl.g:639:3: ( (lv_left_0_0= ruleTerm ) )
            // InternalMyDsl.g:640:4: (lv_left_0_0= ruleTerm )
            {
            // InternalMyDsl.g:640:4: (lv_left_0_0= ruleTerm )
            // InternalMyDsl.g:641:5: lv_left_0_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_left_0_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.mydsl.MyDsl.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:658:3: ( (lv_operator_1_0= ruleRelationalOperator ) )
            // InternalMyDsl.g:659:4: (lv_operator_1_0= ruleRelationalOperator )
            {
            // InternalMyDsl.g:659:4: (lv_operator_1_0= ruleRelationalOperator )
            // InternalMyDsl.g:660:5: lv_operator_1_0= ruleRelationalOperator
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_operator_1_0=ruleRelationalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.xtext.example.mydsl.MyDsl.RelationalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:677:3: ( (lv_right_2_0= ruleTerm ) )
            // InternalMyDsl.g:678:4: (lv_right_2_0= ruleTerm )
            {
            // InternalMyDsl.g:678:4: (lv_right_2_0= ruleTerm )
            // InternalMyDsl.g:679:5: lv_right_2_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.example.mydsl.MyDsl.Term");
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:700:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            // InternalMyDsl.g:700:44: (iv_ruleTerm= ruleTerm EOF )
            // InternalMyDsl.g:701:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm.getText(); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:707:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:713:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:714:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:714:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:715:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getTermAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:723:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getTermAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalMyDsl.g:734:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalMyDsl.g:734:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalMyDsl.g:735:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator.getText(); 
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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalMyDsl.g:741:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:747:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '<>' ) )
            // InternalMyDsl.g:748:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '<>' )
            {
            // InternalMyDsl.g:748:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '<>' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case 31:
                {
                alt11=5;
                }
                break;
            case 32:
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
                    // InternalMyDsl.g:749:3: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:755:3: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:761:3: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:767:3: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:773:3: kw= '=='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:779:3: kw= '<>'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignGreaterThanSignKeyword_5());
                    		

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:788:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMyDsl.g:788:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMyDsl.g:789:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMyDsl.g:795:1: ruleBlock returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:801:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalMyDsl.g:802:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalMyDsl.g:802:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==23||(LA12_0>=33 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:803:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:803:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMyDsl.g:804:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_24);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getBlockRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:824:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:824:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:825:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMyDsl.g:831:1: rulePrint returns [EObject current=null] : (otherlv_0= 'show' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:837:2: ( (otherlv_0= 'show' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:838:2: (otherlv_0= 'show' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:838:2: (otherlv_0= 'show' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalMyDsl.g:839:3: otherlv_0= 'show' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getShowKeyword_0());
            		
            // InternalMyDsl.g:843:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalMyDsl.g:844:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:844:4: (lv_description_1_0= RULE_STRING )
            // InternalMyDsl.g:845:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_1_0, grammarAccess.getPrintAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleSimpleAction"
    // InternalMyDsl.g:869:1: entryRuleSimpleAction returns [EObject current=null] : iv_ruleSimpleAction= ruleSimpleAction EOF ;
    public final EObject entryRuleSimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAction = null;


        try {
            // InternalMyDsl.g:869:53: (iv_ruleSimpleAction= ruleSimpleAction EOF )
            // InternalMyDsl.g:870:2: iv_ruleSimpleAction= ruleSimpleAction EOF
            {
             newCompositeNode(grammarAccess.getSimpleActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAction=ruleSimpleAction();

            state._fsp--;

             current =iv_ruleSimpleAction; 
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
    // $ANTLR end "entryRuleSimpleAction"


    // $ANTLR start "ruleSimpleAction"
    // InternalMyDsl.g:876:1: ruleSimpleAction returns [EObject current=null] : (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleSimpleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:882:2: ( (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:883:2: (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:883:2: (otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:884:3: otherlv_0= 'goto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleActionAccess().getGotoKeyword_0());
            		
            // InternalMyDsl.g:888:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:889:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:889:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:890:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleActionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getSimpleActionAccess().getStateStateCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleActionAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleSimpleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600900010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000606800010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000604800010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000600800012L});

}