package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'add'", "'remove'", "'>'", "'<'", "'>='", "'<='", "'=='", "'<>'", "'state'", "'start'", "'final'", "';'", "'item'", "'set'", "'action'", "'in'", "'do'", "'end'", "'check'", "'then'", "'endcheck'", "'else'", "'show'", "'goto'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDndGame"
    // InternalMyDsl.g:53:1: entryRuleDndGame : ruleDndGame EOF ;
    public final void entryRuleDndGame() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDndGame EOF )
            // InternalMyDsl.g:55:1: ruleDndGame EOF
            {
             before(grammarAccess.getDndGameRule()); 
            pushFollow(FOLLOW_1);
            ruleDndGame();

            state._fsp--;

             after(grammarAccess.getDndGameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDndGame"


    // $ANTLR start "ruleDndGame"
    // InternalMyDsl.g:62:1: ruleDndGame : ( ( rule__DndGame__Group__0 ) ) ;
    public final void ruleDndGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__DndGame__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__DndGame__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__DndGame__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__DndGame__Group__0 )
            {
             before(grammarAccess.getDndGameAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__DndGame__Group__0 )
            // InternalMyDsl.g:69:4: rule__DndGame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DndGame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDndGameAccess().getGroup()); 

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
    // $ANTLR end "ruleDndGame"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:78:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleState EOF )
            // InternalMyDsl.g:80:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:87:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__State__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__State__Group__0 )
            // InternalMyDsl.g:94:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleItem"
    // InternalMyDsl.g:103:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleItem EOF )
            // InternalMyDsl.g:105:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalMyDsl.g:112:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Item__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Item__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Item__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Item__Group__0 )
            // InternalMyDsl.g:119:4: rule__Item__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAction EOF )
            // InternalMyDsl.g:130:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:137:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Action__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Action__Group__0 )
            // InternalMyDsl.g:144:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:153:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleStatement EOF )
            // InternalMyDsl.g:155:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:162:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Statement__Alternatives )
            // InternalMyDsl.g:169:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignment"
    // InternalMyDsl.g:178:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAssignment EOF )
            // InternalMyDsl.g:180:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMyDsl.g:187:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Assignment__Group__0 )
            // InternalMyDsl.g:194:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // InternalMyDsl.g:203:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleConditional EOF )
            // InternalMyDsl.g:205:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalMyDsl.g:212:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Conditional__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Conditional__Group__0 )
            // InternalMyDsl.g:219:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleExpression EOF )
            // InternalMyDsl.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:237:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Expression__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Expression__Group__0 )
            // InternalMyDsl.g:244:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:253:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleTerm EOF )
            // InternalMyDsl.g:255:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:262:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Term__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Term__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Term__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__Term__Alternatives )
            // InternalMyDsl.g:269:4: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalMyDsl.g:278:1: entryRuleRelationalOperator : ruleRelationalOperator EOF ;
    public final void entryRuleRelationalOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleRelationalOperator EOF )
            // InternalMyDsl.g:280:1: ruleRelationalOperator EOF
            {
             before(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getRelationalOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalMyDsl.g:287:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__RelationalOperator__Alternatives )
            // InternalMyDsl.g:294:4: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:303:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleBlock EOF )
            // InternalMyDsl.g:305:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMyDsl.g:312:1: ruleBlock : ( ( rule__Block__StatementsAssignment )* ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Block__StatementsAssignment )* ) )
            // InternalMyDsl.g:317:2: ( ( rule__Block__StatementsAssignment )* )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Block__StatementsAssignment )* )
            // InternalMyDsl.g:318:3: ( rule__Block__StatementsAssignment )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment()); 
            // InternalMyDsl.g:319:3: ( rule__Block__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==29||(LA1_0>=33 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:319:4: rule__Block__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Block__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:328:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( rulePrint EOF )
            // InternalMyDsl.g:330:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMyDsl.g:337:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Print__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Print__Group__0 )
            // InternalMyDsl.g:344:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleSimpleAction"
    // InternalMyDsl.g:353:1: entryRuleSimpleAction : ruleSimpleAction EOF ;
    public final void entryRuleSimpleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleSimpleAction EOF )
            // InternalMyDsl.g:355:1: ruleSimpleAction EOF
            {
             before(grammarAccess.getSimpleActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleAction();

            state._fsp--;

             after(grammarAccess.getSimpleActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleAction"


    // $ANTLR start "ruleSimpleAction"
    // InternalMyDsl.g:362:1: ruleSimpleAction : ( ( rule__SimpleAction__Group__0 ) ) ;
    public final void ruleSimpleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__SimpleAction__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__SimpleAction__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__SimpleAction__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__SimpleAction__Group__0 )
            {
             before(grammarAccess.getSimpleActionAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__SimpleAction__Group__0 )
            // InternalMyDsl.g:369:4: rule__SimpleAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleActionAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleAction"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyDsl.g:377:1: rule__Statement__Alternatives : ( ( ( rule__Statement__AssignmentAssignment_0 ) ) | ( ( rule__Statement__ConditionalAssignment_1 ) ) | ( ( rule__Statement__ActionAssignment_2 ) ) | ( ( rule__Statement__PrintAssignment_3 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:381:1: ( ( ( rule__Statement__AssignmentAssignment_0 ) ) | ( ( rule__Statement__ConditionalAssignment_1 ) ) | ( ( rule__Statement__ActionAssignment_2 ) ) | ( ( rule__Statement__PrintAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 33:
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
                    // InternalMyDsl.g:382:2: ( ( rule__Statement__AssignmentAssignment_0 ) )
                    {
                    // InternalMyDsl.g:382:2: ( ( rule__Statement__AssignmentAssignment_0 ) )
                    // InternalMyDsl.g:383:3: ( rule__Statement__AssignmentAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentAssignment_0()); 
                    // InternalMyDsl.g:384:3: ( rule__Statement__AssignmentAssignment_0 )
                    // InternalMyDsl.g:384:4: rule__Statement__AssignmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__AssignmentAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getAssignmentAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:388:2: ( ( rule__Statement__ConditionalAssignment_1 ) )
                    {
                    // InternalMyDsl.g:388:2: ( ( rule__Statement__ConditionalAssignment_1 ) )
                    // InternalMyDsl.g:389:3: ( rule__Statement__ConditionalAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getConditionalAssignment_1()); 
                    // InternalMyDsl.g:390:3: ( rule__Statement__ConditionalAssignment_1 )
                    // InternalMyDsl.g:390:4: rule__Statement__ConditionalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__ConditionalAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getConditionalAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:394:2: ( ( rule__Statement__ActionAssignment_2 ) )
                    {
                    // InternalMyDsl.g:394:2: ( ( rule__Statement__ActionAssignment_2 ) )
                    // InternalMyDsl.g:395:3: ( rule__Statement__ActionAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getActionAssignment_2()); 
                    // InternalMyDsl.g:396:3: ( rule__Statement__ActionAssignment_2 )
                    // InternalMyDsl.g:396:4: rule__Statement__ActionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__ActionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getActionAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:400:2: ( ( rule__Statement__PrintAssignment_3 ) )
                    {
                    // InternalMyDsl.g:400:2: ( ( rule__Statement__PrintAssignment_3 ) )
                    // InternalMyDsl.g:401:3: ( rule__Statement__PrintAssignment_3 )
                    {
                     before(grammarAccess.getStatementAccess().getPrintAssignment_3()); 
                    // InternalMyDsl.g:402:3: ( rule__Statement__PrintAssignment_3 )
                    // InternalMyDsl.g:402:4: rule__Statement__PrintAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__PrintAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getPrintAssignment_3()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Assignment__Alternatives_1"
    // InternalMyDsl.g:410:1: rule__Assignment__Alternatives_1 : ( ( 'add' ) | ( 'remove' ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( ( 'add' ) | ( 'remove' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:415:2: ( 'add' )
                    {
                    // InternalMyDsl.g:415:2: ( 'add' )
                    // InternalMyDsl.g:416:3: 'add'
                    {
                     before(grammarAccess.getAssignmentAccess().getAddKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAssignmentAccess().getAddKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:421:2: ( 'remove' )
                    {
                    // InternalMyDsl.g:421:2: ( 'remove' )
                    // InternalMyDsl.g:422:3: 'remove'
                    {
                     before(grammarAccess.getAssignmentAccess().getRemoveKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAssignmentAccess().getRemoveKeyword_1_1()); 

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
    // $ANTLR end "rule__Assignment__Alternatives_1"


    // $ANTLR start "rule__Term__Alternatives"
    // InternalMyDsl.g:431:1: rule__Term__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:435:1: ( ( RULE_INT ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:436:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:436:2: ( RULE_INT )
                    // InternalMyDsl.g:437:3: RULE_INT
                    {
                     before(grammarAccess.getTermAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTermAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:442:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:442:2: ( RULE_ID )
                    // InternalMyDsl.g:443:3: RULE_ID
                    {
                     before(grammarAccess.getTermAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTermAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__RelationalOperator__Alternatives"
    // InternalMyDsl.g:452:1: rule__RelationalOperator__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) | ( '<>' ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:456:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) | ( '<>' ) )
            int alt5=6;
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
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
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
                    // InternalMyDsl.g:457:2: ( '>' )
                    {
                    // InternalMyDsl.g:457:2: ( '>' )
                    // InternalMyDsl.g:458:3: '>'
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:463:2: ( '<' )
                    {
                    // InternalMyDsl.g:463:2: ( '<' )
                    // InternalMyDsl.g:464:3: '<'
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:469:2: ( '>=' )
                    {
                    // InternalMyDsl.g:469:2: ( '>=' )
                    // InternalMyDsl.g:470:3: '>='
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:475:2: ( '<=' )
                    {
                    // InternalMyDsl.g:475:2: ( '<=' )
                    // InternalMyDsl.g:476:3: '<='
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:481:2: ( '==' )
                    {
                    // InternalMyDsl.g:481:2: ( '==' )
                    // InternalMyDsl.g:482:3: '=='
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:487:2: ( '<>' )
                    {
                    // InternalMyDsl.g:487:2: ( '<>' )
                    // InternalMyDsl.g:488:3: '<>'
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getRelationalOperatorAccess().getLessThanSignGreaterThanSignKeyword_5()); 

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
    // $ANTLR end "rule__RelationalOperator__Alternatives"


    // $ANTLR start "rule__DndGame__Group__0"
    // InternalMyDsl.g:497:1: rule__DndGame__Group__0 : rule__DndGame__Group__0__Impl rule__DndGame__Group__1 ;
    public final void rule__DndGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__DndGame__Group__0__Impl rule__DndGame__Group__1 )
            // InternalMyDsl.g:502:2: rule__DndGame__Group__0__Impl rule__DndGame__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DndGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DndGame__Group__1();

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
    // $ANTLR end "rule__DndGame__Group__0"


    // $ANTLR start "rule__DndGame__Group__0__Impl"
    // InternalMyDsl.g:509:1: rule__DndGame__Group__0__Impl : ( ( rule__DndGame__StatesAssignment_0 )* ) ;
    public final void rule__DndGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( ( ( rule__DndGame__StatesAssignment_0 )* ) )
            // InternalMyDsl.g:514:1: ( ( rule__DndGame__StatesAssignment_0 )* )
            {
            // InternalMyDsl.g:514:1: ( ( rule__DndGame__StatesAssignment_0 )* )
            // InternalMyDsl.g:515:2: ( rule__DndGame__StatesAssignment_0 )*
            {
             before(grammarAccess.getDndGameAccess().getStatesAssignment_0()); 
            // InternalMyDsl.g:516:2: ( rule__DndGame__StatesAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:516:3: rule__DndGame__StatesAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DndGame__StatesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDndGameAccess().getStatesAssignment_0()); 

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
    // $ANTLR end "rule__DndGame__Group__0__Impl"


    // $ANTLR start "rule__DndGame__Group__1"
    // InternalMyDsl.g:524:1: rule__DndGame__Group__1 : rule__DndGame__Group__1__Impl rule__DndGame__Group__2 ;
    public final void rule__DndGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__DndGame__Group__1__Impl rule__DndGame__Group__2 )
            // InternalMyDsl.g:529:2: rule__DndGame__Group__1__Impl rule__DndGame__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DndGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DndGame__Group__2();

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
    // $ANTLR end "rule__DndGame__Group__1"


    // $ANTLR start "rule__DndGame__Group__1__Impl"
    // InternalMyDsl.g:536:1: rule__DndGame__Group__1__Impl : ( ( rule__DndGame__ItemsAssignment_1 )* ) ;
    public final void rule__DndGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( ( rule__DndGame__ItemsAssignment_1 )* ) )
            // InternalMyDsl.g:541:1: ( ( rule__DndGame__ItemsAssignment_1 )* )
            {
            // InternalMyDsl.g:541:1: ( ( rule__DndGame__ItemsAssignment_1 )* )
            // InternalMyDsl.g:542:2: ( rule__DndGame__ItemsAssignment_1 )*
            {
             before(grammarAccess.getDndGameAccess().getItemsAssignment_1()); 
            // InternalMyDsl.g:543:2: ( rule__DndGame__ItemsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:543:3: rule__DndGame__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DndGame__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDndGameAccess().getItemsAssignment_1()); 

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
    // $ANTLR end "rule__DndGame__Group__1__Impl"


    // $ANTLR start "rule__DndGame__Group__2"
    // InternalMyDsl.g:551:1: rule__DndGame__Group__2 : rule__DndGame__Group__2__Impl ;
    public final void rule__DndGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__DndGame__Group__2__Impl )
            // InternalMyDsl.g:556:2: rule__DndGame__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DndGame__Group__2__Impl();

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
    // $ANTLR end "rule__DndGame__Group__2"


    // $ANTLR start "rule__DndGame__Group__2__Impl"
    // InternalMyDsl.g:562:1: rule__DndGame__Group__2__Impl : ( ( rule__DndGame__ActionsAssignment_2 )* ) ;
    public final void rule__DndGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( ( ( rule__DndGame__ActionsAssignment_2 )* ) )
            // InternalMyDsl.g:567:1: ( ( rule__DndGame__ActionsAssignment_2 )* )
            {
            // InternalMyDsl.g:567:1: ( ( rule__DndGame__ActionsAssignment_2 )* )
            // InternalMyDsl.g:568:2: ( rule__DndGame__ActionsAssignment_2 )*
            {
             before(grammarAccess.getDndGameAccess().getActionsAssignment_2()); 
            // InternalMyDsl.g:569:2: ( rule__DndGame__ActionsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:569:3: rule__DndGame__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DndGame__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDndGameAccess().getActionsAssignment_2()); 

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
    // $ANTLR end "rule__DndGame__Group__2__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMyDsl.g:578:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMyDsl.g:583:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalMyDsl.g:590:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( 'state' ) )
            // InternalMyDsl.g:595:1: ( 'state' )
            {
            // InternalMyDsl.g:595:1: ( 'state' )
            // InternalMyDsl.g:596:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

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
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalMyDsl.g:605:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalMyDsl.g:610:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalMyDsl.g:617:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalMyDsl.g:622:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:622:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalMyDsl.g:623:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:624:2: ( rule__State__NameAssignment_1 )
            // InternalMyDsl.g:624:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalMyDsl.g:632:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalMyDsl.g:637:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

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
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalMyDsl.g:644:1: rule__State__Group__2__Impl : ( ( 'start' )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( ( 'start' )? ) )
            // InternalMyDsl.g:649:1: ( ( 'start' )? )
            {
            // InternalMyDsl.g:649:1: ( ( 'start' )? )
            // InternalMyDsl.g:650:2: ( 'start' )?
            {
             before(grammarAccess.getStateAccess().getStartKeyword_2()); 
            // InternalMyDsl.g:651:2: ( 'start' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:651:3: 'start'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getStartKeyword_2()); 

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
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalMyDsl.g:659:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalMyDsl.g:664:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

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
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalMyDsl.g:671:1: rule__State__Group__3__Impl : ( ( 'final' )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( ( 'final' )? ) )
            // InternalMyDsl.g:676:1: ( ( 'final' )? )
            {
            // InternalMyDsl.g:676:1: ( ( 'final' )? )
            // InternalMyDsl.g:677:2: ( 'final' )?
            {
             before(grammarAccess.getStateAccess().getFinalKeyword_3()); 
            // InternalMyDsl.g:678:2: ( 'final' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:678:3: 'final'
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getFinalKeyword_3()); 

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
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalMyDsl.g:686:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalMyDsl.g:691:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

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
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalMyDsl.g:698:1: rule__State__Group__4__Impl : ( ( rule__State__DescriptionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ( rule__State__DescriptionAssignment_4 ) ) )
            // InternalMyDsl.g:703:1: ( ( rule__State__DescriptionAssignment_4 ) )
            {
            // InternalMyDsl.g:703:1: ( ( rule__State__DescriptionAssignment_4 ) )
            // InternalMyDsl.g:704:2: ( rule__State__DescriptionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getDescriptionAssignment_4()); 
            // InternalMyDsl.g:705:2: ( rule__State__DescriptionAssignment_4 )
            // InternalMyDsl.g:705:3: rule__State__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__State__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalMyDsl.g:713:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__State__Group__5__Impl )
            // InternalMyDsl.g:718:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

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
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalMyDsl.g:724:1: rule__State__Group__5__Impl : ( ';' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( ( ';' ) )
            // InternalMyDsl.g:729:1: ( ';' )
            {
            // InternalMyDsl.g:729:1: ( ';' )
            // InternalMyDsl.g:730:2: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // InternalMyDsl.g:740:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalMyDsl.g:745:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__1();

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
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // InternalMyDsl.g:752:1: rule__Item__Group__0__Impl : ( 'item' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( 'item' ) )
            // InternalMyDsl.g:757:1: ( 'item' )
            {
            // InternalMyDsl.g:757:1: ( 'item' )
            // InternalMyDsl.g:758:2: 'item'
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getItemKeyword_0()); 

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
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // InternalMyDsl.g:767:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalMyDsl.g:772:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Item__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__2();

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
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // InternalMyDsl.g:779:1: rule__Item__Group__1__Impl : ( ( rule__Item__NameAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( ( rule__Item__NameAssignment_1 ) ) )
            // InternalMyDsl.g:784:1: ( ( rule__Item__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:784:1: ( ( rule__Item__NameAssignment_1 ) )
            // InternalMyDsl.g:785:2: ( rule__Item__NameAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:786:2: ( rule__Item__NameAssignment_1 )
            // InternalMyDsl.g:786:3: rule__Item__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Item__Group__2"
    // InternalMyDsl.g:794:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalMyDsl.g:799:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Item__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__3();

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
    // $ANTLR end "rule__Item__Group__2"


    // $ANTLR start "rule__Item__Group__2__Impl"
    // InternalMyDsl.g:806:1: rule__Item__Group__2__Impl : ( 'set' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( 'set' ) )
            // InternalMyDsl.g:811:1: ( 'set' )
            {
            // InternalMyDsl.g:811:1: ( 'set' )
            // InternalMyDsl.g:812:2: 'set'
            {
             before(grammarAccess.getItemAccess().getSetKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getSetKeyword_2()); 

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
    // $ANTLR end "rule__Item__Group__2__Impl"


    // $ANTLR start "rule__Item__Group__3"
    // InternalMyDsl.g:821:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // InternalMyDsl.g:826:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Item__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__4();

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
    // $ANTLR end "rule__Item__Group__3"


    // $ANTLR start "rule__Item__Group__3__Impl"
    // InternalMyDsl.g:833:1: rule__Item__Group__3__Impl : ( ( rule__Item__ValueAssignment_3 ) ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ( rule__Item__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:838:1: ( ( rule__Item__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:838:1: ( ( rule__Item__ValueAssignment_3 ) )
            // InternalMyDsl.g:839:2: ( rule__Item__ValueAssignment_3 )
            {
             before(grammarAccess.getItemAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:840:2: ( rule__Item__ValueAssignment_3 )
            // InternalMyDsl.g:840:3: rule__Item__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Item__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Item__Group__3__Impl"


    // $ANTLR start "rule__Item__Group__4"
    // InternalMyDsl.g:848:1: rule__Item__Group__4 : rule__Item__Group__4__Impl ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__Item__Group__4__Impl )
            // InternalMyDsl.g:853:2: rule__Item__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__4__Impl();

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
    // $ANTLR end "rule__Item__Group__4"


    // $ANTLR start "rule__Item__Group__4__Impl"
    // InternalMyDsl.g:859:1: rule__Item__Group__4__Impl : ( ';' ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( ( ';' ) )
            // InternalMyDsl.g:864:1: ( ';' )
            {
            // InternalMyDsl.g:864:1: ( ';' )
            // InternalMyDsl.g:865:2: ';'
            {
             before(grammarAccess.getItemAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Item__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalMyDsl.g:875:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMyDsl.g:880:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalMyDsl.g:887:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( 'action' ) )
            // InternalMyDsl.g:892:1: ( 'action' )
            {
            // InternalMyDsl.g:892:1: ( 'action' )
            // InternalMyDsl.g:893:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalMyDsl.g:902:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMyDsl.g:907:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalMyDsl.g:914:1: rule__Action__Group__1__Impl : ( 'in' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( 'in' ) )
            // InternalMyDsl.g:919:1: ( 'in' )
            {
            // InternalMyDsl.g:919:1: ( 'in' )
            // InternalMyDsl.g:920:2: 'in'
            {
             before(grammarAccess.getActionAccess().getInKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalMyDsl.g:929:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalMyDsl.g:934:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalMyDsl.g:941:1: rule__Action__Group__2__Impl : ( ( rule__Action__StateAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( ( rule__Action__StateAssignment_2 ) ) )
            // InternalMyDsl.g:946:1: ( ( rule__Action__StateAssignment_2 ) )
            {
            // InternalMyDsl.g:946:1: ( ( rule__Action__StateAssignment_2 ) )
            // InternalMyDsl.g:947:2: ( rule__Action__StateAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getStateAssignment_2()); 
            // InternalMyDsl.g:948:2: ( rule__Action__StateAssignment_2 )
            // InternalMyDsl.g:948:3: rule__Action__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getStateAssignment_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalMyDsl.g:956:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalMyDsl.g:961:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

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
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalMyDsl.g:968:1: rule__Action__Group__3__Impl : ( ( rule__Action__DescriptionAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ( rule__Action__DescriptionAssignment_3 ) ) )
            // InternalMyDsl.g:973:1: ( ( rule__Action__DescriptionAssignment_3 ) )
            {
            // InternalMyDsl.g:973:1: ( ( rule__Action__DescriptionAssignment_3 ) )
            // InternalMyDsl.g:974:2: ( rule__Action__DescriptionAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getDescriptionAssignment_3()); 
            // InternalMyDsl.g:975:2: ( rule__Action__DescriptionAssignment_3 )
            // InternalMyDsl.g:975:3: rule__Action__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Action__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalMyDsl.g:983:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalMyDsl.g:988:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

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
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalMyDsl.g:995:1: rule__Action__Group__4__Impl : ( 'do' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( 'do' ) )
            // InternalMyDsl.g:1000:1: ( 'do' )
            {
            // InternalMyDsl.g:1000:1: ( 'do' )
            // InternalMyDsl.g:1001:2: 'do'
            {
             before(grammarAccess.getActionAccess().getDoKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDoKeyword_4()); 

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
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalMyDsl.g:1010:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalMyDsl.g:1015:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

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
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalMyDsl.g:1022:1: rule__Action__Group__5__Impl : ( ( rule__Action__StatementsAssignment_5 )* ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ( rule__Action__StatementsAssignment_5 )* ) )
            // InternalMyDsl.g:1027:1: ( ( rule__Action__StatementsAssignment_5 )* )
            {
            // InternalMyDsl.g:1027:1: ( ( rule__Action__StatementsAssignment_5 )* )
            // InternalMyDsl.g:1028:2: ( rule__Action__StatementsAssignment_5 )*
            {
             before(grammarAccess.getActionAccess().getStatementsAssignment_5()); 
            // InternalMyDsl.g:1029:2: ( rule__Action__StatementsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==29||(LA11_0>=33 && LA11_0<=34)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1029:3: rule__Action__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Action__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalMyDsl.g:1037:1: rule__Action__Group__6 : rule__Action__Group__6__Impl ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__Action__Group__6__Impl )
            // InternalMyDsl.g:1042:2: rule__Action__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__6__Impl();

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
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalMyDsl.g:1048:1: rule__Action__Group__6__Impl : ( 'end' ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( ( 'end' ) )
            // InternalMyDsl.g:1053:1: ( 'end' )
            {
            // InternalMyDsl.g:1053:1: ( 'end' )
            // InternalMyDsl.g:1054:2: 'end'
            {
             before(grammarAccess.getActionAccess().getEndKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEndKeyword_6()); 

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
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMyDsl.g:1064:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMyDsl.g:1069:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalMyDsl.g:1076:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMyDsl.g:1081:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMyDsl.g:1081:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMyDsl.g:1082:2: ( rule__Assignment__TargetAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            // InternalMyDsl.g:1083:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMyDsl.g:1083:3: rule__Assignment__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 

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
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalMyDsl.g:1091:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMyDsl.g:1096:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalMyDsl.g:1103:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // InternalMyDsl.g:1108:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1108:1: ( ( rule__Assignment__Alternatives_1 ) )
            // InternalMyDsl.g:1109:2: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1110:2: ( rule__Assignment__Alternatives_1 )
            // InternalMyDsl.g:1110:3: rule__Assignment__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalMyDsl.g:1118:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalMyDsl.g:1123:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalMyDsl.g:1130:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1135:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1135:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMyDsl.g:1136:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1137:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMyDsl.g:1137:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalMyDsl.g:1145:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__Assignment__Group__3__Impl )
            // InternalMyDsl.g:1150:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3__Impl();

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
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalMyDsl.g:1156:1: rule__Assignment__Group__3__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( ( ';' ) )
            // InternalMyDsl.g:1161:1: ( ';' )
            {
            // InternalMyDsl.g:1161:1: ( ';' )
            // InternalMyDsl.g:1162:2: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalMyDsl.g:1172:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalMyDsl.g:1177:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

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
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalMyDsl.g:1184:1: rule__Conditional__Group__0__Impl : ( 'check' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( 'check' ) )
            // InternalMyDsl.g:1189:1: ( 'check' )
            {
            // InternalMyDsl.g:1189:1: ( 'check' )
            // InternalMyDsl.g:1190:2: 'check'
            {
             before(grammarAccess.getConditionalAccess().getCheckKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getCheckKeyword_0()); 

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
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalMyDsl.g:1199:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalMyDsl.g:1204:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2();

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
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalMyDsl.g:1211:1: rule__Conditional__Group__1__Impl : ( ( rule__Conditional__ExpressionAssignment_1 ) ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( ( ( rule__Conditional__ExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:1216:1: ( ( rule__Conditional__ExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:1216:1: ( ( rule__Conditional__ExpressionAssignment_1 ) )
            // InternalMyDsl.g:1217:2: ( rule__Conditional__ExpressionAssignment_1 )
            {
             before(grammarAccess.getConditionalAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:1218:2: ( rule__Conditional__ExpressionAssignment_1 )
            // InternalMyDsl.g:1218:3: rule__Conditional__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // InternalMyDsl.g:1226:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalMyDsl.g:1231:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Conditional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__3();

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
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // InternalMyDsl.g:1238:1: rule__Conditional__Group__2__Impl : ( 'then' ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( 'then' ) )
            // InternalMyDsl.g:1243:1: ( 'then' )
            {
            // InternalMyDsl.g:1243:1: ( 'then' )
            // InternalMyDsl.g:1244:2: 'then'
            {
             before(grammarAccess.getConditionalAccess().getThenKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getThenKeyword_2()); 

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
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // InternalMyDsl.g:1253:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalMyDsl.g:1258:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Conditional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__4();

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
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // InternalMyDsl.g:1265:1: rule__Conditional__Group__3__Impl : ( ( rule__Conditional__BodyAssignment_3 ) ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( ( rule__Conditional__BodyAssignment_3 ) ) )
            // InternalMyDsl.g:1270:1: ( ( rule__Conditional__BodyAssignment_3 ) )
            {
            // InternalMyDsl.g:1270:1: ( ( rule__Conditional__BodyAssignment_3 ) )
            // InternalMyDsl.g:1271:2: ( rule__Conditional__BodyAssignment_3 )
            {
             before(grammarAccess.getConditionalAccess().getBodyAssignment_3()); 
            // InternalMyDsl.g:1272:2: ( rule__Conditional__BodyAssignment_3 )
            // InternalMyDsl.g:1272:3: rule__Conditional__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // InternalMyDsl.g:1280:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalMyDsl.g:1285:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Conditional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5();

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
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // InternalMyDsl.g:1292:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__Group_4__0 )? ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( ( rule__Conditional__Group_4__0 )? ) )
            // InternalMyDsl.g:1297:1: ( ( rule__Conditional__Group_4__0 )? )
            {
            // InternalMyDsl.g:1297:1: ( ( rule__Conditional__Group_4__0 )? )
            // InternalMyDsl.g:1298:2: ( rule__Conditional__Group_4__0 )?
            {
             before(grammarAccess.getConditionalAccess().getGroup_4()); 
            // InternalMyDsl.g:1299:2: ( rule__Conditional__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1299:3: rule__Conditional__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // InternalMyDsl.g:1307:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__Conditional__Group__5__Impl )
            // InternalMyDsl.g:1312:2: rule__Conditional__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5__Impl();

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
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // InternalMyDsl.g:1318:1: rule__Conditional__Group__5__Impl : ( 'endcheck' ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( 'endcheck' ) )
            // InternalMyDsl.g:1323:1: ( 'endcheck' )
            {
            // InternalMyDsl.g:1323:1: ( 'endcheck' )
            // InternalMyDsl.g:1324:2: 'endcheck'
            {
             before(grammarAccess.getConditionalAccess().getEndcheckKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getEndcheckKeyword_5()); 

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
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__Conditional__Group_4__0"
    // InternalMyDsl.g:1334:1: rule__Conditional__Group_4__0 : rule__Conditional__Group_4__0__Impl rule__Conditional__Group_4__1 ;
    public final void rule__Conditional__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( rule__Conditional__Group_4__0__Impl rule__Conditional__Group_4__1 )
            // InternalMyDsl.g:1339:2: rule__Conditional__Group_4__0__Impl rule__Conditional__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Conditional__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group_4__1();

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
    // $ANTLR end "rule__Conditional__Group_4__0"


    // $ANTLR start "rule__Conditional__Group_4__0__Impl"
    // InternalMyDsl.g:1346:1: rule__Conditional__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( 'else' ) )
            // InternalMyDsl.g:1351:1: ( 'else' )
            {
            // InternalMyDsl.g:1351:1: ( 'else' )
            // InternalMyDsl.g:1352:2: 'else'
            {
             before(grammarAccess.getConditionalAccess().getElseKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getElseKeyword_4_0()); 

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
    // $ANTLR end "rule__Conditional__Group_4__0__Impl"


    // $ANTLR start "rule__Conditional__Group_4__1"
    // InternalMyDsl.g:1361:1: rule__Conditional__Group_4__1 : rule__Conditional__Group_4__1__Impl ;
    public final void rule__Conditional__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( rule__Conditional__Group_4__1__Impl )
            // InternalMyDsl.g:1366:2: rule__Conditional__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group_4__1__Impl();

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
    // $ANTLR end "rule__Conditional__Group_4__1"


    // $ANTLR start "rule__Conditional__Group_4__1__Impl"
    // InternalMyDsl.g:1372:1: rule__Conditional__Group_4__1__Impl : ( ( rule__Conditional__ElseAssignment_4_1 ) ) ;
    public final void rule__Conditional__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( ( rule__Conditional__ElseAssignment_4_1 ) ) )
            // InternalMyDsl.g:1377:1: ( ( rule__Conditional__ElseAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1377:1: ( ( rule__Conditional__ElseAssignment_4_1 ) )
            // InternalMyDsl.g:1378:2: ( rule__Conditional__ElseAssignment_4_1 )
            {
             before(grammarAccess.getConditionalAccess().getElseAssignment_4_1()); 
            // InternalMyDsl.g:1379:2: ( rule__Conditional__ElseAssignment_4_1 )
            // InternalMyDsl.g:1379:3: rule__Conditional__ElseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__ElseAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getElseAssignment_4_1()); 

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
    // $ANTLR end "rule__Conditional__Group_4__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:1388:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:1393:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:1400:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // InternalMyDsl.g:1405:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // InternalMyDsl.g:1405:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // InternalMyDsl.g:1406:2: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // InternalMyDsl.g:1407:2: ( rule__Expression__LeftAssignment_0 )
            // InternalMyDsl.g:1407:3: rule__Expression__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:1415:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalMyDsl.g:1420:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__2();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:1427:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__OperatorAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( ( rule__Expression__OperatorAssignment_1 ) ) )
            // InternalMyDsl.g:1432:1: ( ( rule__Expression__OperatorAssignment_1 ) )
            {
            // InternalMyDsl.g:1432:1: ( ( rule__Expression__OperatorAssignment_1 ) )
            // InternalMyDsl.g:1433:2: ( rule__Expression__OperatorAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1()); 
            // InternalMyDsl.g:1434:2: ( rule__Expression__OperatorAssignment_1 )
            // InternalMyDsl.g:1434:3: rule__Expression__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // InternalMyDsl.g:1442:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( rule__Expression__Group__2__Impl )
            // InternalMyDsl.g:1447:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__2__Impl();

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
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalMyDsl.g:1453:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__RightAssignment_2 ) ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( ( ( rule__Expression__RightAssignment_2 ) ) )
            // InternalMyDsl.g:1458:1: ( ( rule__Expression__RightAssignment_2 ) )
            {
            // InternalMyDsl.g:1458:1: ( ( rule__Expression__RightAssignment_2 ) )
            // InternalMyDsl.g:1459:2: ( rule__Expression__RightAssignment_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_2()); 
            // InternalMyDsl.g:1460:2: ( rule__Expression__RightAssignment_2 )
            // InternalMyDsl.g:1460:3: rule__Expression__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalMyDsl.g:1469:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyDsl.g:1474:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

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
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalMyDsl.g:1481:1: rule__Print__Group__0__Impl : ( 'show' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( ( 'show' ) )
            // InternalMyDsl.g:1486:1: ( 'show' )
            {
            // InternalMyDsl.g:1486:1: ( 'show' )
            // InternalMyDsl.g:1487:2: 'show'
            {
             before(grammarAccess.getPrintAccess().getShowKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getShowKeyword_0()); 

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
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalMyDsl.g:1496:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalMyDsl.g:1501:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Print__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__2();

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
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalMyDsl.g:1508:1: rule__Print__Group__1__Impl : ( ( rule__Print__DescriptionAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( ( ( rule__Print__DescriptionAssignment_1 ) ) )
            // InternalMyDsl.g:1513:1: ( ( rule__Print__DescriptionAssignment_1 ) )
            {
            // InternalMyDsl.g:1513:1: ( ( rule__Print__DescriptionAssignment_1 ) )
            // InternalMyDsl.g:1514:2: ( rule__Print__DescriptionAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getDescriptionAssignment_1()); 
            // InternalMyDsl.g:1515:2: ( rule__Print__DescriptionAssignment_1 )
            // InternalMyDsl.g:1515:3: rule__Print__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__2"
    // InternalMyDsl.g:1523:1: rule__Print__Group__2 : rule__Print__Group__2__Impl ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( rule__Print__Group__2__Impl )
            // InternalMyDsl.g:1528:2: rule__Print__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__2__Impl();

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
    // $ANTLR end "rule__Print__Group__2"


    // $ANTLR start "rule__Print__Group__2__Impl"
    // InternalMyDsl.g:1534:1: rule__Print__Group__2__Impl : ( ';' ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( ( ';' ) )
            // InternalMyDsl.g:1539:1: ( ';' )
            {
            // InternalMyDsl.g:1539:1: ( ';' )
            // InternalMyDsl.g:1540:2: ';'
            {
             before(grammarAccess.getPrintAccess().getSemicolonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Print__Group__2__Impl"


    // $ANTLR start "rule__SimpleAction__Group__0"
    // InternalMyDsl.g:1550:1: rule__SimpleAction__Group__0 : rule__SimpleAction__Group__0__Impl rule__SimpleAction__Group__1 ;
    public final void rule__SimpleAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( rule__SimpleAction__Group__0__Impl rule__SimpleAction__Group__1 )
            // InternalMyDsl.g:1555:2: rule__SimpleAction__Group__0__Impl rule__SimpleAction__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SimpleAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__1();

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
    // $ANTLR end "rule__SimpleAction__Group__0"


    // $ANTLR start "rule__SimpleAction__Group__0__Impl"
    // InternalMyDsl.g:1562:1: rule__SimpleAction__Group__0__Impl : ( 'goto' ) ;
    public final void rule__SimpleAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1566:1: ( ( 'goto' ) )
            // InternalMyDsl.g:1567:1: ( 'goto' )
            {
            // InternalMyDsl.g:1567:1: ( 'goto' )
            // InternalMyDsl.g:1568:2: 'goto'
            {
             before(grammarAccess.getSimpleActionAccess().getGotoKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSimpleActionAccess().getGotoKeyword_0()); 

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
    // $ANTLR end "rule__SimpleAction__Group__0__Impl"


    // $ANTLR start "rule__SimpleAction__Group__1"
    // InternalMyDsl.g:1577:1: rule__SimpleAction__Group__1 : rule__SimpleAction__Group__1__Impl rule__SimpleAction__Group__2 ;
    public final void rule__SimpleAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( rule__SimpleAction__Group__1__Impl rule__SimpleAction__Group__2 )
            // InternalMyDsl.g:1582:2: rule__SimpleAction__Group__1__Impl rule__SimpleAction__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SimpleAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__2();

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
    // $ANTLR end "rule__SimpleAction__Group__1"


    // $ANTLR start "rule__SimpleAction__Group__1__Impl"
    // InternalMyDsl.g:1589:1: rule__SimpleAction__Group__1__Impl : ( ( rule__SimpleAction__StateAssignment_1 ) ) ;
    public final void rule__SimpleAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ( rule__SimpleAction__StateAssignment_1 ) ) )
            // InternalMyDsl.g:1594:1: ( ( rule__SimpleAction__StateAssignment_1 ) )
            {
            // InternalMyDsl.g:1594:1: ( ( rule__SimpleAction__StateAssignment_1 ) )
            // InternalMyDsl.g:1595:2: ( rule__SimpleAction__StateAssignment_1 )
            {
             before(grammarAccess.getSimpleActionAccess().getStateAssignment_1()); 
            // InternalMyDsl.g:1596:2: ( rule__SimpleAction__StateAssignment_1 )
            // InternalMyDsl.g:1596:3: rule__SimpleAction__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleActionAccess().getStateAssignment_1()); 

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
    // $ANTLR end "rule__SimpleAction__Group__1__Impl"


    // $ANTLR start "rule__SimpleAction__Group__2"
    // InternalMyDsl.g:1604:1: rule__SimpleAction__Group__2 : rule__SimpleAction__Group__2__Impl ;
    public final void rule__SimpleAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( rule__SimpleAction__Group__2__Impl )
            // InternalMyDsl.g:1609:2: rule__SimpleAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__2__Impl();

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
    // $ANTLR end "rule__SimpleAction__Group__2"


    // $ANTLR start "rule__SimpleAction__Group__2__Impl"
    // InternalMyDsl.g:1615:1: rule__SimpleAction__Group__2__Impl : ( ';' ) ;
    public final void rule__SimpleAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( ';' ) )
            // InternalMyDsl.g:1620:1: ( ';' )
            {
            // InternalMyDsl.g:1620:1: ( ';' )
            // InternalMyDsl.g:1621:2: ';'
            {
             before(grammarAccess.getSimpleActionAccess().getSemicolonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSimpleActionAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__SimpleAction__Group__2__Impl"


    // $ANTLR start "rule__DndGame__StatesAssignment_0"
    // InternalMyDsl.g:1631:1: rule__DndGame__StatesAssignment_0 : ( ruleState ) ;
    public final void rule__DndGame__StatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( ( ruleState ) )
            // InternalMyDsl.g:1636:2: ( ruleState )
            {
            // InternalMyDsl.g:1636:2: ( ruleState )
            // InternalMyDsl.g:1637:3: ruleState
            {
             before(grammarAccess.getDndGameAccess().getStatesStateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getDndGameAccess().getStatesStateParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DndGame__StatesAssignment_0"


    // $ANTLR start "rule__DndGame__ItemsAssignment_1"
    // InternalMyDsl.g:1646:1: rule__DndGame__ItemsAssignment_1 : ( ruleItem ) ;
    public final void rule__DndGame__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( ruleItem ) )
            // InternalMyDsl.g:1651:2: ( ruleItem )
            {
            // InternalMyDsl.g:1651:2: ( ruleItem )
            // InternalMyDsl.g:1652:3: ruleItem
            {
             before(grammarAccess.getDndGameAccess().getItemsItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getDndGameAccess().getItemsItemParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DndGame__ItemsAssignment_1"


    // $ANTLR start "rule__DndGame__ActionsAssignment_2"
    // InternalMyDsl.g:1661:1: rule__DndGame__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__DndGame__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( ( ruleAction ) )
            // InternalMyDsl.g:1666:2: ( ruleAction )
            {
            // InternalMyDsl.g:1666:2: ( ruleAction )
            // InternalMyDsl.g:1667:3: ruleAction
            {
             before(grammarAccess.getDndGameAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getDndGameAccess().getActionsActionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DndGame__ActionsAssignment_2"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalMyDsl.g:1676:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1680:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1681:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1681:2: ( RULE_ID )
            // InternalMyDsl.g:1682:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__DescriptionAssignment_4"
    // InternalMyDsl.g:1691:1: rule__State__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__State__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1696:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1696:2: ( RULE_STRING )
            // InternalMyDsl.g:1697:3: RULE_STRING
            {
             before(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__State__DescriptionAssignment_4"


    // $ANTLR start "rule__Item__NameAssignment_1"
    // InternalMyDsl.g:1706:1: rule__Item__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Item__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1711:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1711:2: ( RULE_ID )
            // InternalMyDsl.g:1712:3: RULE_ID
            {
             before(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Item__NameAssignment_1"


    // $ANTLR start "rule__Item__ValueAssignment_3"
    // InternalMyDsl.g:1721:1: rule__Item__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__Item__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1726:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1726:2: ( RULE_INT )
            // InternalMyDsl.g:1727:3: RULE_INT
            {
             before(grammarAccess.getItemAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getValueINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Item__ValueAssignment_3"


    // $ANTLR start "rule__Action__StateAssignment_2"
    // InternalMyDsl.g:1736:1: rule__Action__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Action__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1740:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1741:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1741:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1742:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getStateStateCrossReference_2_0()); 
            // InternalMyDsl.g:1743:3: ( RULE_ID )
            // InternalMyDsl.g:1744:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getActionAccess().getStateStateCrossReference_2_0()); 

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
    // $ANTLR end "rule__Action__StateAssignment_2"


    // $ANTLR start "rule__Action__DescriptionAssignment_3"
    // InternalMyDsl.g:1755:1: rule__Action__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Action__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1760:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1760:2: ( RULE_STRING )
            // InternalMyDsl.g:1761:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Action__DescriptionAssignment_3"


    // $ANTLR start "rule__Action__StatementsAssignment_5"
    // InternalMyDsl.g:1770:1: rule__Action__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Action__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1774:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:1775:2: ( ruleStatement )
            {
            // InternalMyDsl.g:1775:2: ( ruleStatement )
            // InternalMyDsl.g:1776:3: ruleStatement
            {
             before(grammarAccess.getActionAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getActionAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Action__StatementsAssignment_5"


    // $ANTLR start "rule__Statement__AssignmentAssignment_0"
    // InternalMyDsl.g:1785:1: rule__Statement__AssignmentAssignment_0 : ( ruleAssignment ) ;
    public final void rule__Statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( ( ruleAssignment ) )
            // InternalMyDsl.g:1790:2: ( ruleAssignment )
            {
            // InternalMyDsl.g:1790:2: ( ruleAssignment )
            // InternalMyDsl.g:1791:3: ruleAssignment
            {
             before(grammarAccess.getStatementAccess().getAssignmentAssignmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getAssignmentAssignmentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Statement__AssignmentAssignment_0"


    // $ANTLR start "rule__Statement__ConditionalAssignment_1"
    // InternalMyDsl.g:1800:1: rule__Statement__ConditionalAssignment_1 : ( ruleConditional ) ;
    public final void rule__Statement__ConditionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( ruleConditional ) )
            // InternalMyDsl.g:1805:2: ( ruleConditional )
            {
            // InternalMyDsl.g:1805:2: ( ruleConditional )
            // InternalMyDsl.g:1806:3: ruleConditional
            {
             before(grammarAccess.getStatementAccess().getConditionalConditionalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getConditionalConditionalParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement__ConditionalAssignment_1"


    // $ANTLR start "rule__Statement__ActionAssignment_2"
    // InternalMyDsl.g:1815:1: rule__Statement__ActionAssignment_2 : ( ruleSimpleAction ) ;
    public final void rule__Statement__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( ruleSimpleAction ) )
            // InternalMyDsl.g:1820:2: ( ruleSimpleAction )
            {
            // InternalMyDsl.g:1820:2: ( ruleSimpleAction )
            // InternalMyDsl.g:1821:3: ruleSimpleAction
            {
             before(grammarAccess.getStatementAccess().getActionSimpleActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleAction();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getActionSimpleActionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Statement__ActionAssignment_2"


    // $ANTLR start "rule__Statement__PrintAssignment_3"
    // InternalMyDsl.g:1830:1: rule__Statement__PrintAssignment_3 : ( rulePrint ) ;
    public final void rule__Statement__PrintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( rulePrint ) )
            // InternalMyDsl.g:1835:2: ( rulePrint )
            {
            // InternalMyDsl.g:1835:2: ( rulePrint )
            // InternalMyDsl.g:1836:3: rulePrint
            {
             before(grammarAccess.getStatementAccess().getPrintPrintParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getPrintPrintParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Statement__PrintAssignment_3"


    // $ANTLR start "rule__Assignment__TargetAssignment_0"
    // InternalMyDsl.g:1845:1: rule__Assignment__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1850:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1850:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1851:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTargetItemCrossReference_0_0()); 
            // InternalMyDsl.g:1852:3: ( RULE_ID )
            // InternalMyDsl.g:1853:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getTargetItemIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getTargetItemIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getTargetItemCrossReference_0_0()); 

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
    // $ANTLR end "rule__Assignment__TargetAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalMyDsl.g:1864:1: rule__Assignment__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1869:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1869:2: ( RULE_INT )
            // InternalMyDsl.g:1870:3: RULE_INT
            {
             before(grammarAccess.getAssignmentAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getValueINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__Conditional__ExpressionAssignment_1"
    // InternalMyDsl.g:1879:1: rule__Conditional__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Conditional__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1883:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:1884:2: ( ruleExpression )
            {
            // InternalMyDsl.g:1884:2: ( ruleExpression )
            // InternalMyDsl.g:1885:3: ruleExpression
            {
             before(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Conditional__ExpressionAssignment_1"


    // $ANTLR start "rule__Conditional__BodyAssignment_3"
    // InternalMyDsl.g:1894:1: rule__Conditional__BodyAssignment_3 : ( ruleBlock ) ;
    public final void rule__Conditional__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1898:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:1899:2: ( ruleBlock )
            {
            // InternalMyDsl.g:1899:2: ( ruleBlock )
            // InternalMyDsl.g:1900:3: ruleBlock
            {
             before(grammarAccess.getConditionalAccess().getBodyBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getBodyBlockParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Conditional__BodyAssignment_3"


    // $ANTLR start "rule__Conditional__ElseAssignment_4_1"
    // InternalMyDsl.g:1909:1: rule__Conditional__ElseAssignment_4_1 : ( ruleBlock ) ;
    public final void rule__Conditional__ElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:1914:2: ( ruleBlock )
            {
            // InternalMyDsl.g:1914:2: ( ruleBlock )
            // InternalMyDsl.g:1915:3: ruleBlock
            {
             before(grammarAccess.getConditionalAccess().getElseBlockParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getElseBlockParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Conditional__ElseAssignment_4_1"


    // $ANTLR start "rule__Expression__LeftAssignment_0"
    // InternalMyDsl.g:1924:1: rule__Expression__LeftAssignment_0 : ( ruleTerm ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1929:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1929:2: ( ruleTerm )
            // InternalMyDsl.g:1930:3: ruleTerm
            {
             before(grammarAccess.getExpressionAccess().getLeftTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression__LeftAssignment_0"


    // $ANTLR start "rule__Expression__OperatorAssignment_1"
    // InternalMyDsl.g:1939:1: rule__Expression__OperatorAssignment_1 : ( ruleRelationalOperator ) ;
    public final void rule__Expression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1943:1: ( ( ruleRelationalOperator ) )
            // InternalMyDsl.g:1944:2: ( ruleRelationalOperator )
            {
            // InternalMyDsl.g:1944:2: ( ruleRelationalOperator )
            // InternalMyDsl.g:1945:3: ruleRelationalOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__OperatorAssignment_1"


    // $ANTLR start "rule__Expression__RightAssignment_2"
    // InternalMyDsl.g:1954:1: rule__Expression__RightAssignment_2 : ( ruleTerm ) ;
    public final void rule__Expression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1959:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1959:2: ( ruleTerm )
            // InternalMyDsl.g:1960:3: ruleTerm
            {
             before(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_2"


    // $ANTLR start "rule__Block__StatementsAssignment"
    // InternalMyDsl.g:1969:1: rule__Block__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:1974:2: ( ruleStatement )
            {
            // InternalMyDsl.g:1974:2: ( ruleStatement )
            // InternalMyDsl.g:1975:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Block__StatementsAssignment"


    // $ANTLR start "rule__Print__DescriptionAssignment_1"
    // InternalMyDsl.g:1984:1: rule__Print__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Print__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1989:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1989:2: ( RULE_STRING )
            // InternalMyDsl.g:1990:3: RULE_STRING
            {
             before(grammarAccess.getPrintAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Print__DescriptionAssignment_1"


    // $ANTLR start "rule__SimpleAction__StateAssignment_1"
    // InternalMyDsl.g:1999:1: rule__SimpleAction__StateAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleAction__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2004:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2004:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2005:3: ( RULE_ID )
            {
             before(grammarAccess.getSimpleActionAccess().getStateStateCrossReference_1_0()); 
            // InternalMyDsl.g:2006:3: ( RULE_ID )
            // InternalMyDsl.g:2007:4: RULE_ID
            {
             before(grammarAccess.getSimpleActionAccess().getStateStateIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleActionAccess().getStateStateIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSimpleActionAccess().getStateStateCrossReference_1_0()); 

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
    // $ANTLR end "rule__SimpleAction__StateAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000620000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000630000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000620000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000007E000L});

}