package ac.soton.java.barebones.ide.contentassist.antlr.internal;

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
import ac.soton.java.barebones.services.BareBonesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBareBonesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'clear'", "';'", "'incr'", "'decr'", "'while'", "'not'", "'0'", "'do'", "'end'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalBareBonesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBareBonesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBareBonesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBareBones.g"; }


    	private BareBonesGrammarAccess grammarAccess;

    	public void setGrammarAccess(BareBonesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalBareBones.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalBareBones.g:54:1: ( ruleProgram EOF )
            // InternalBareBones.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalBareBones.g:62:1: ruleProgram : ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:66:2: ( ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) ) )
            // InternalBareBones.g:67:2: ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) )
            {
            // InternalBareBones.g:67:2: ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) )
            // InternalBareBones.g:68:3: ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* )
            {
            // InternalBareBones.g:68:3: ( ( rule__Program__StatementsAssignment ) )
            // InternalBareBones.g:69:4: ( rule__Program__StatementsAssignment )
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // InternalBareBones.g:70:4: ( rule__Program__StatementsAssignment )
            // InternalBareBones.g:70:5: rule__Program__StatementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

            }

            // InternalBareBones.g:73:3: ( ( rule__Program__StatementsAssignment )* )
            // InternalBareBones.g:74:4: ( rule__Program__StatementsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // InternalBareBones.g:75:4: ( rule__Program__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBareBones.g:75:5: rule__Program__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

            }


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalBareBones.g:85:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalBareBones.g:86:1: ( ruleStatement EOF )
            // InternalBareBones.g:87:1: ruleStatement EOF
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
    // InternalBareBones.g:94:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:98:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalBareBones.g:99:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalBareBones.g:99:2: ( ( rule__Statement__Alternatives ) )
            // InternalBareBones.g:100:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalBareBones.g:101:3: ( rule__Statement__Alternatives )
            // InternalBareBones.g:101:4: rule__Statement__Alternatives
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


    // $ANTLR start "entryRuleClear"
    // InternalBareBones.g:110:1: entryRuleClear : ruleClear EOF ;
    public final void entryRuleClear() throws RecognitionException {
        try {
            // InternalBareBones.g:111:1: ( ruleClear EOF )
            // InternalBareBones.g:112:1: ruleClear EOF
            {
             before(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_1);
            ruleClear();

            state._fsp--;

             after(grammarAccess.getClearRule()); 
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
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // InternalBareBones.g:119:1: ruleClear : ( ( rule__Clear__Group__0 ) ) ;
    public final void ruleClear() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:123:2: ( ( ( rule__Clear__Group__0 ) ) )
            // InternalBareBones.g:124:2: ( ( rule__Clear__Group__0 ) )
            {
            // InternalBareBones.g:124:2: ( ( rule__Clear__Group__0 ) )
            // InternalBareBones.g:125:3: ( rule__Clear__Group__0 )
            {
             before(grammarAccess.getClearAccess().getGroup()); 
            // InternalBareBones.g:126:3: ( rule__Clear__Group__0 )
            // InternalBareBones.g:126:4: rule__Clear__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getGroup()); 

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
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleIncrement"
    // InternalBareBones.g:135:1: entryRuleIncrement : ruleIncrement EOF ;
    public final void entryRuleIncrement() throws RecognitionException {
        try {
            // InternalBareBones.g:136:1: ( ruleIncrement EOF )
            // InternalBareBones.g:137:1: ruleIncrement EOF
            {
             before(grammarAccess.getIncrementRule()); 
            pushFollow(FOLLOW_1);
            ruleIncrement();

            state._fsp--;

             after(grammarAccess.getIncrementRule()); 
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
    // $ANTLR end "entryRuleIncrement"


    // $ANTLR start "ruleIncrement"
    // InternalBareBones.g:144:1: ruleIncrement : ( ( rule__Increment__Group__0 ) ) ;
    public final void ruleIncrement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:148:2: ( ( ( rule__Increment__Group__0 ) ) )
            // InternalBareBones.g:149:2: ( ( rule__Increment__Group__0 ) )
            {
            // InternalBareBones.g:149:2: ( ( rule__Increment__Group__0 ) )
            // InternalBareBones.g:150:3: ( rule__Increment__Group__0 )
            {
             before(grammarAccess.getIncrementAccess().getGroup()); 
            // InternalBareBones.g:151:3: ( rule__Increment__Group__0 )
            // InternalBareBones.g:151:4: rule__Increment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Increment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncrementAccess().getGroup()); 

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
    // $ANTLR end "ruleIncrement"


    // $ANTLR start "entryRuleDecrement"
    // InternalBareBones.g:160:1: entryRuleDecrement : ruleDecrement EOF ;
    public final void entryRuleDecrement() throws RecognitionException {
        try {
            // InternalBareBones.g:161:1: ( ruleDecrement EOF )
            // InternalBareBones.g:162:1: ruleDecrement EOF
            {
             before(grammarAccess.getDecrementRule()); 
            pushFollow(FOLLOW_1);
            ruleDecrement();

            state._fsp--;

             after(grammarAccess.getDecrementRule()); 
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
    // $ANTLR end "entryRuleDecrement"


    // $ANTLR start "ruleDecrement"
    // InternalBareBones.g:169:1: ruleDecrement : ( ( rule__Decrement__Group__0 ) ) ;
    public final void ruleDecrement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:173:2: ( ( ( rule__Decrement__Group__0 ) ) )
            // InternalBareBones.g:174:2: ( ( rule__Decrement__Group__0 ) )
            {
            // InternalBareBones.g:174:2: ( ( rule__Decrement__Group__0 ) )
            // InternalBareBones.g:175:3: ( rule__Decrement__Group__0 )
            {
             before(grammarAccess.getDecrementAccess().getGroup()); 
            // InternalBareBones.g:176:3: ( rule__Decrement__Group__0 )
            // InternalBareBones.g:176:4: rule__Decrement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decrement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecrementAccess().getGroup()); 

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
    // $ANTLR end "ruleDecrement"


    // $ANTLR start "entryRuleWhile"
    // InternalBareBones.g:185:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalBareBones.g:186:1: ( ruleWhile EOF )
            // InternalBareBones.g:187:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalBareBones.g:194:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:198:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalBareBones.g:199:2: ( ( rule__While__Group__0 ) )
            {
            // InternalBareBones.g:199:2: ( ( rule__While__Group__0 ) )
            // InternalBareBones.g:200:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalBareBones.g:201:3: ( rule__While__Group__0 )
            // InternalBareBones.g:201:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalBareBones.g:209:1: rule__Statement__Alternatives : ( ( ruleClear ) | ( ruleIncrement ) | ( ruleDecrement ) | ( ruleWhile ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:213:1: ( ( ruleClear ) | ( ruleIncrement ) | ( ruleDecrement ) | ( ruleWhile ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
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
                    // InternalBareBones.g:214:2: ( ruleClear )
                    {
                    // InternalBareBones.g:214:2: ( ruleClear )
                    // InternalBareBones.g:215:3: ruleClear
                    {
                     before(grammarAccess.getStatementAccess().getClearParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClear();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getClearParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBareBones.g:220:2: ( ruleIncrement )
                    {
                    // InternalBareBones.g:220:2: ( ruleIncrement )
                    // InternalBareBones.g:221:3: ruleIncrement
                    {
                     before(grammarAccess.getStatementAccess().getIncrementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIncrement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIncrementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBareBones.g:226:2: ( ruleDecrement )
                    {
                    // InternalBareBones.g:226:2: ( ruleDecrement )
                    // InternalBareBones.g:227:3: ruleDecrement
                    {
                     before(grammarAccess.getStatementAccess().getDecrementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDecrement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDecrementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBareBones.g:232:2: ( ruleWhile )
                    {
                    // InternalBareBones.g:232:2: ( ruleWhile )
                    // InternalBareBones.g:233:3: ruleWhile
                    {
                     before(grammarAccess.getStatementAccess().getWhileParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileParserRuleCall_3()); 

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


    // $ANTLR start "rule__Clear__Group__0"
    // InternalBareBones.g:242:1: rule__Clear__Group__0 : rule__Clear__Group__0__Impl rule__Clear__Group__1 ;
    public final void rule__Clear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:246:1: ( rule__Clear__Group__0__Impl rule__Clear__Group__1 )
            // InternalBareBones.g:247:2: rule__Clear__Group__0__Impl rule__Clear__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Clear__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clear__Group__1();

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
    // $ANTLR end "rule__Clear__Group__0"


    // $ANTLR start "rule__Clear__Group__0__Impl"
    // InternalBareBones.g:254:1: rule__Clear__Group__0__Impl : ( () ) ;
    public final void rule__Clear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:258:1: ( ( () ) )
            // InternalBareBones.g:259:1: ( () )
            {
            // InternalBareBones.g:259:1: ( () )
            // InternalBareBones.g:260:2: ()
            {
             before(grammarAccess.getClearAccess().getClearAction_0()); 
            // InternalBareBones.g:261:2: ()
            // InternalBareBones.g:261:3: 
            {
            }

             after(grammarAccess.getClearAccess().getClearAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__0__Impl"


    // $ANTLR start "rule__Clear__Group__1"
    // InternalBareBones.g:269:1: rule__Clear__Group__1 : rule__Clear__Group__1__Impl rule__Clear__Group__2 ;
    public final void rule__Clear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:273:1: ( rule__Clear__Group__1__Impl rule__Clear__Group__2 )
            // InternalBareBones.g:274:2: rule__Clear__Group__1__Impl rule__Clear__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Clear__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clear__Group__2();

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
    // $ANTLR end "rule__Clear__Group__1"


    // $ANTLR start "rule__Clear__Group__1__Impl"
    // InternalBareBones.g:281:1: rule__Clear__Group__1__Impl : ( 'clear' ) ;
    public final void rule__Clear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:285:1: ( ( 'clear' ) )
            // InternalBareBones.g:286:1: ( 'clear' )
            {
            // InternalBareBones.g:286:1: ( 'clear' )
            // InternalBareBones.g:287:2: 'clear'
            {
             before(grammarAccess.getClearAccess().getClearKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClearAccess().getClearKeyword_1()); 

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
    // $ANTLR end "rule__Clear__Group__1__Impl"


    // $ANTLR start "rule__Clear__Group__2"
    // InternalBareBones.g:296:1: rule__Clear__Group__2 : rule__Clear__Group__2__Impl rule__Clear__Group__3 ;
    public final void rule__Clear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:300:1: ( rule__Clear__Group__2__Impl rule__Clear__Group__3 )
            // InternalBareBones.g:301:2: rule__Clear__Group__2__Impl rule__Clear__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Clear__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clear__Group__3();

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
    // $ANTLR end "rule__Clear__Group__2"


    // $ANTLR start "rule__Clear__Group__2__Impl"
    // InternalBareBones.g:308:1: rule__Clear__Group__2__Impl : ( ( rule__Clear__NameAssignment_2 ) ) ;
    public final void rule__Clear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:312:1: ( ( ( rule__Clear__NameAssignment_2 ) ) )
            // InternalBareBones.g:313:1: ( ( rule__Clear__NameAssignment_2 ) )
            {
            // InternalBareBones.g:313:1: ( ( rule__Clear__NameAssignment_2 ) )
            // InternalBareBones.g:314:2: ( rule__Clear__NameAssignment_2 )
            {
             before(grammarAccess.getClearAccess().getNameAssignment_2()); 
            // InternalBareBones.g:315:2: ( rule__Clear__NameAssignment_2 )
            // InternalBareBones.g:315:3: rule__Clear__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Clear__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Clear__Group__2__Impl"


    // $ANTLR start "rule__Clear__Group__3"
    // InternalBareBones.g:323:1: rule__Clear__Group__3 : rule__Clear__Group__3__Impl ;
    public final void rule__Clear__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:327:1: ( rule__Clear__Group__3__Impl )
            // InternalBareBones.g:328:2: rule__Clear__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clear__Group__3__Impl();

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
    // $ANTLR end "rule__Clear__Group__3"


    // $ANTLR start "rule__Clear__Group__3__Impl"
    // InternalBareBones.g:334:1: rule__Clear__Group__3__Impl : ( ';' ) ;
    public final void rule__Clear__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:338:1: ( ( ';' ) )
            // InternalBareBones.g:339:1: ( ';' )
            {
            // InternalBareBones.g:339:1: ( ';' )
            // InternalBareBones.g:340:2: ';'
            {
             before(grammarAccess.getClearAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClearAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Clear__Group__3__Impl"


    // $ANTLR start "rule__Increment__Group__0"
    // InternalBareBones.g:350:1: rule__Increment__Group__0 : rule__Increment__Group__0__Impl rule__Increment__Group__1 ;
    public final void rule__Increment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:354:1: ( rule__Increment__Group__0__Impl rule__Increment__Group__1 )
            // InternalBareBones.g:355:2: rule__Increment__Group__0__Impl rule__Increment__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Increment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Increment__Group__1();

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
    // $ANTLR end "rule__Increment__Group__0"


    // $ANTLR start "rule__Increment__Group__0__Impl"
    // InternalBareBones.g:362:1: rule__Increment__Group__0__Impl : ( () ) ;
    public final void rule__Increment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:366:1: ( ( () ) )
            // InternalBareBones.g:367:1: ( () )
            {
            // InternalBareBones.g:367:1: ( () )
            // InternalBareBones.g:368:2: ()
            {
             before(grammarAccess.getIncrementAccess().getIncrementAction_0()); 
            // InternalBareBones.g:369:2: ()
            // InternalBareBones.g:369:3: 
            {
            }

             after(grammarAccess.getIncrementAccess().getIncrementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Increment__Group__0__Impl"


    // $ANTLR start "rule__Increment__Group__1"
    // InternalBareBones.g:377:1: rule__Increment__Group__1 : rule__Increment__Group__1__Impl rule__Increment__Group__2 ;
    public final void rule__Increment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:381:1: ( rule__Increment__Group__1__Impl rule__Increment__Group__2 )
            // InternalBareBones.g:382:2: rule__Increment__Group__1__Impl rule__Increment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Increment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Increment__Group__2();

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
    // $ANTLR end "rule__Increment__Group__1"


    // $ANTLR start "rule__Increment__Group__1__Impl"
    // InternalBareBones.g:389:1: rule__Increment__Group__1__Impl : ( 'incr' ) ;
    public final void rule__Increment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:393:1: ( ( 'incr' ) )
            // InternalBareBones.g:394:1: ( 'incr' )
            {
            // InternalBareBones.g:394:1: ( 'incr' )
            // InternalBareBones.g:395:2: 'incr'
            {
             before(grammarAccess.getIncrementAccess().getIncrKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIncrementAccess().getIncrKeyword_1()); 

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
    // $ANTLR end "rule__Increment__Group__1__Impl"


    // $ANTLR start "rule__Increment__Group__2"
    // InternalBareBones.g:404:1: rule__Increment__Group__2 : rule__Increment__Group__2__Impl rule__Increment__Group__3 ;
    public final void rule__Increment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:408:1: ( rule__Increment__Group__2__Impl rule__Increment__Group__3 )
            // InternalBareBones.g:409:2: rule__Increment__Group__2__Impl rule__Increment__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Increment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Increment__Group__3();

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
    // $ANTLR end "rule__Increment__Group__2"


    // $ANTLR start "rule__Increment__Group__2__Impl"
    // InternalBareBones.g:416:1: rule__Increment__Group__2__Impl : ( ( rule__Increment__NameAssignment_2 ) ) ;
    public final void rule__Increment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:420:1: ( ( ( rule__Increment__NameAssignment_2 ) ) )
            // InternalBareBones.g:421:1: ( ( rule__Increment__NameAssignment_2 ) )
            {
            // InternalBareBones.g:421:1: ( ( rule__Increment__NameAssignment_2 ) )
            // InternalBareBones.g:422:2: ( rule__Increment__NameAssignment_2 )
            {
             before(grammarAccess.getIncrementAccess().getNameAssignment_2()); 
            // InternalBareBones.g:423:2: ( rule__Increment__NameAssignment_2 )
            // InternalBareBones.g:423:3: rule__Increment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Increment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIncrementAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Increment__Group__2__Impl"


    // $ANTLR start "rule__Increment__Group__3"
    // InternalBareBones.g:431:1: rule__Increment__Group__3 : rule__Increment__Group__3__Impl ;
    public final void rule__Increment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:435:1: ( rule__Increment__Group__3__Impl )
            // InternalBareBones.g:436:2: rule__Increment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Increment__Group__3__Impl();

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
    // $ANTLR end "rule__Increment__Group__3"


    // $ANTLR start "rule__Increment__Group__3__Impl"
    // InternalBareBones.g:442:1: rule__Increment__Group__3__Impl : ( ';' ) ;
    public final void rule__Increment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:446:1: ( ( ';' ) )
            // InternalBareBones.g:447:1: ( ';' )
            {
            // InternalBareBones.g:447:1: ( ';' )
            // InternalBareBones.g:448:2: ';'
            {
             before(grammarAccess.getIncrementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIncrementAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Increment__Group__3__Impl"


    // $ANTLR start "rule__Decrement__Group__0"
    // InternalBareBones.g:458:1: rule__Decrement__Group__0 : rule__Decrement__Group__0__Impl rule__Decrement__Group__1 ;
    public final void rule__Decrement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:462:1: ( rule__Decrement__Group__0__Impl rule__Decrement__Group__1 )
            // InternalBareBones.g:463:2: rule__Decrement__Group__0__Impl rule__Decrement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Decrement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decrement__Group__1();

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
    // $ANTLR end "rule__Decrement__Group__0"


    // $ANTLR start "rule__Decrement__Group__0__Impl"
    // InternalBareBones.g:470:1: rule__Decrement__Group__0__Impl : ( () ) ;
    public final void rule__Decrement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:474:1: ( ( () ) )
            // InternalBareBones.g:475:1: ( () )
            {
            // InternalBareBones.g:475:1: ( () )
            // InternalBareBones.g:476:2: ()
            {
             before(grammarAccess.getDecrementAccess().getDecrementAction_0()); 
            // InternalBareBones.g:477:2: ()
            // InternalBareBones.g:477:3: 
            {
            }

             after(grammarAccess.getDecrementAccess().getDecrementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decrement__Group__0__Impl"


    // $ANTLR start "rule__Decrement__Group__1"
    // InternalBareBones.g:485:1: rule__Decrement__Group__1 : rule__Decrement__Group__1__Impl rule__Decrement__Group__2 ;
    public final void rule__Decrement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:489:1: ( rule__Decrement__Group__1__Impl rule__Decrement__Group__2 )
            // InternalBareBones.g:490:2: rule__Decrement__Group__1__Impl rule__Decrement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Decrement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decrement__Group__2();

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
    // $ANTLR end "rule__Decrement__Group__1"


    // $ANTLR start "rule__Decrement__Group__1__Impl"
    // InternalBareBones.g:497:1: rule__Decrement__Group__1__Impl : ( 'decr' ) ;
    public final void rule__Decrement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:501:1: ( ( 'decr' ) )
            // InternalBareBones.g:502:1: ( 'decr' )
            {
            // InternalBareBones.g:502:1: ( 'decr' )
            // InternalBareBones.g:503:2: 'decr'
            {
             before(grammarAccess.getDecrementAccess().getDecrKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDecrementAccess().getDecrKeyword_1()); 

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
    // $ANTLR end "rule__Decrement__Group__1__Impl"


    // $ANTLR start "rule__Decrement__Group__2"
    // InternalBareBones.g:512:1: rule__Decrement__Group__2 : rule__Decrement__Group__2__Impl rule__Decrement__Group__3 ;
    public final void rule__Decrement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:516:1: ( rule__Decrement__Group__2__Impl rule__Decrement__Group__3 )
            // InternalBareBones.g:517:2: rule__Decrement__Group__2__Impl rule__Decrement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Decrement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decrement__Group__3();

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
    // $ANTLR end "rule__Decrement__Group__2"


    // $ANTLR start "rule__Decrement__Group__2__Impl"
    // InternalBareBones.g:524:1: rule__Decrement__Group__2__Impl : ( ( rule__Decrement__NameAssignment_2 ) ) ;
    public final void rule__Decrement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:528:1: ( ( ( rule__Decrement__NameAssignment_2 ) ) )
            // InternalBareBones.g:529:1: ( ( rule__Decrement__NameAssignment_2 ) )
            {
            // InternalBareBones.g:529:1: ( ( rule__Decrement__NameAssignment_2 ) )
            // InternalBareBones.g:530:2: ( rule__Decrement__NameAssignment_2 )
            {
             before(grammarAccess.getDecrementAccess().getNameAssignment_2()); 
            // InternalBareBones.g:531:2: ( rule__Decrement__NameAssignment_2 )
            // InternalBareBones.g:531:3: rule__Decrement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Decrement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecrementAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Decrement__Group__2__Impl"


    // $ANTLR start "rule__Decrement__Group__3"
    // InternalBareBones.g:539:1: rule__Decrement__Group__3 : rule__Decrement__Group__3__Impl ;
    public final void rule__Decrement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:543:1: ( rule__Decrement__Group__3__Impl )
            // InternalBareBones.g:544:2: rule__Decrement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decrement__Group__3__Impl();

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
    // $ANTLR end "rule__Decrement__Group__3"


    // $ANTLR start "rule__Decrement__Group__3__Impl"
    // InternalBareBones.g:550:1: rule__Decrement__Group__3__Impl : ( ';' ) ;
    public final void rule__Decrement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:554:1: ( ( ';' ) )
            // InternalBareBones.g:555:1: ( ';' )
            {
            // InternalBareBones.g:555:1: ( ';' )
            // InternalBareBones.g:556:2: ';'
            {
             before(grammarAccess.getDecrementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDecrementAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Decrement__Group__3__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalBareBones.g:566:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:570:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalBareBones.g:571:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__1();

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
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalBareBones.g:578:1: rule__While__Group__0__Impl : ( () ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:582:1: ( ( () ) )
            // InternalBareBones.g:583:1: ( () )
            {
            // InternalBareBones.g:583:1: ( () )
            // InternalBareBones.g:584:2: ()
            {
             before(grammarAccess.getWhileAccess().getWhileAction_0()); 
            // InternalBareBones.g:585:2: ()
            // InternalBareBones.g:585:3: 
            {
            }

             after(grammarAccess.getWhileAccess().getWhileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalBareBones.g:593:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:597:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalBareBones.g:598:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__2();

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
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalBareBones.g:605:1: rule__While__Group__1__Impl : ( 'while' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:609:1: ( ( 'while' ) )
            // InternalBareBones.g:610:1: ( 'while' )
            {
            // InternalBareBones.g:610:1: ( 'while' )
            // InternalBareBones.g:611:2: 'while'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_1()); 

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
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // InternalBareBones.g:620:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:624:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalBareBones.g:625:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__While__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__3();

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
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // InternalBareBones.g:632:1: rule__While__Group__2__Impl : ( ( rule__While__NameAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:636:1: ( ( ( rule__While__NameAssignment_2 ) ) )
            // InternalBareBones.g:637:1: ( ( rule__While__NameAssignment_2 ) )
            {
            // InternalBareBones.g:637:1: ( ( rule__While__NameAssignment_2 ) )
            // InternalBareBones.g:638:2: ( rule__While__NameAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getNameAssignment_2()); 
            // InternalBareBones.g:639:2: ( rule__While__NameAssignment_2 )
            // InternalBareBones.g:639:3: rule__While__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__While__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // InternalBareBones.g:647:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:651:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // InternalBareBones.g:652:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__While__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__4();

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
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // InternalBareBones.g:659:1: rule__While__Group__3__Impl : ( 'not' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:663:1: ( ( 'not' ) )
            // InternalBareBones.g:664:1: ( 'not' )
            {
            // InternalBareBones.g:664:1: ( 'not' )
            // InternalBareBones.g:665:2: 'not'
            {
             before(grammarAccess.getWhileAccess().getNotKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getNotKeyword_3()); 

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
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // InternalBareBones.g:674:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:678:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // InternalBareBones.g:679:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__While__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__5();

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
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // InternalBareBones.g:686:1: rule__While__Group__4__Impl : ( '0' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:690:1: ( ( '0' ) )
            // InternalBareBones.g:691:1: ( '0' )
            {
            // InternalBareBones.g:691:1: ( '0' )
            // InternalBareBones.g:692:2: '0'
            {
             before(grammarAccess.getWhileAccess().getDigitZeroKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getDigitZeroKeyword_4()); 

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
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__While__Group__5"
    // InternalBareBones.g:701:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:705:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // InternalBareBones.g:706:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__While__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__6();

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
    // $ANTLR end "rule__While__Group__5"


    // $ANTLR start "rule__While__Group__5__Impl"
    // InternalBareBones.g:713:1: rule__While__Group__5__Impl : ( 'do' ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:717:1: ( ( 'do' ) )
            // InternalBareBones.g:718:1: ( 'do' )
            {
            // InternalBareBones.g:718:1: ( 'do' )
            // InternalBareBones.g:719:2: 'do'
            {
             before(grammarAccess.getWhileAccess().getDoKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getDoKeyword_5()); 

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
    // $ANTLR end "rule__While__Group__5__Impl"


    // $ANTLR start "rule__While__Group__6"
    // InternalBareBones.g:728:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:732:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // InternalBareBones.g:733:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__While__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__7();

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
    // $ANTLR end "rule__While__Group__6"


    // $ANTLR start "rule__While__Group__6__Impl"
    // InternalBareBones.g:740:1: rule__While__Group__6__Impl : ( ';' ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:744:1: ( ( ';' ) )
            // InternalBareBones.g:745:1: ( ';' )
            {
            // InternalBareBones.g:745:1: ( ';' )
            // InternalBareBones.g:746:2: ';'
            {
             before(grammarAccess.getWhileAccess().getSemicolonKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__While__Group__6__Impl"


    // $ANTLR start "rule__While__Group__7"
    // InternalBareBones.g:755:1: rule__While__Group__7 : rule__While__Group__7__Impl rule__While__Group__8 ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:759:1: ( rule__While__Group__7__Impl rule__While__Group__8 )
            // InternalBareBones.g:760:2: rule__While__Group__7__Impl rule__While__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__While__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__8();

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
    // $ANTLR end "rule__While__Group__7"


    // $ANTLR start "rule__While__Group__7__Impl"
    // InternalBareBones.g:767:1: rule__While__Group__7__Impl : ( ( ( rule__While__StatementsAssignment_7 ) ) ( ( rule__While__StatementsAssignment_7 )* ) ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:771:1: ( ( ( ( rule__While__StatementsAssignment_7 ) ) ( ( rule__While__StatementsAssignment_7 )* ) ) )
            // InternalBareBones.g:772:1: ( ( ( rule__While__StatementsAssignment_7 ) ) ( ( rule__While__StatementsAssignment_7 )* ) )
            {
            // InternalBareBones.g:772:1: ( ( ( rule__While__StatementsAssignment_7 ) ) ( ( rule__While__StatementsAssignment_7 )* ) )
            // InternalBareBones.g:773:2: ( ( rule__While__StatementsAssignment_7 ) ) ( ( rule__While__StatementsAssignment_7 )* )
            {
            // InternalBareBones.g:773:2: ( ( rule__While__StatementsAssignment_7 ) )
            // InternalBareBones.g:774:3: ( rule__While__StatementsAssignment_7 )
            {
             before(grammarAccess.getWhileAccess().getStatementsAssignment_7()); 
            // InternalBareBones.g:775:3: ( rule__While__StatementsAssignment_7 )
            // InternalBareBones.g:775:4: rule__While__StatementsAssignment_7
            {
            pushFollow(FOLLOW_3);
            rule__While__StatementsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getStatementsAssignment_7()); 

            }

            // InternalBareBones.g:778:2: ( ( rule__While__StatementsAssignment_7 )* )
            // InternalBareBones.g:779:3: ( rule__While__StatementsAssignment_7 )*
            {
             before(grammarAccess.getWhileAccess().getStatementsAssignment_7()); 
            // InternalBareBones.g:780:3: ( rule__While__StatementsAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||(LA3_0>=13 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBareBones.g:780:4: rule__While__StatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__While__StatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWhileAccess().getStatementsAssignment_7()); 

            }


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
    // $ANTLR end "rule__While__Group__7__Impl"


    // $ANTLR start "rule__While__Group__8"
    // InternalBareBones.g:789:1: rule__While__Group__8 : rule__While__Group__8__Impl rule__While__Group__9 ;
    public final void rule__While__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:793:1: ( rule__While__Group__8__Impl rule__While__Group__9 )
            // InternalBareBones.g:794:2: rule__While__Group__8__Impl rule__While__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__While__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__9();

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
    // $ANTLR end "rule__While__Group__8"


    // $ANTLR start "rule__While__Group__8__Impl"
    // InternalBareBones.g:801:1: rule__While__Group__8__Impl : ( 'end' ) ;
    public final void rule__While__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:805:1: ( ( 'end' ) )
            // InternalBareBones.g:806:1: ( 'end' )
            {
            // InternalBareBones.g:806:1: ( 'end' )
            // InternalBareBones.g:807:2: 'end'
            {
             before(grammarAccess.getWhileAccess().getEndKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getEndKeyword_8()); 

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
    // $ANTLR end "rule__While__Group__8__Impl"


    // $ANTLR start "rule__While__Group__9"
    // InternalBareBones.g:816:1: rule__While__Group__9 : rule__While__Group__9__Impl ;
    public final void rule__While__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:820:1: ( rule__While__Group__9__Impl )
            // InternalBareBones.g:821:2: rule__While__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__9__Impl();

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
    // $ANTLR end "rule__While__Group__9"


    // $ANTLR start "rule__While__Group__9__Impl"
    // InternalBareBones.g:827:1: rule__While__Group__9__Impl : ( ';' ) ;
    public final void rule__While__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:831:1: ( ( ';' ) )
            // InternalBareBones.g:832:1: ( ';' )
            {
            // InternalBareBones.g:832:1: ( ';' )
            // InternalBareBones.g:833:2: ';'
            {
             before(grammarAccess.getWhileAccess().getSemicolonKeyword_9()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getSemicolonKeyword_9()); 

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
    // $ANTLR end "rule__While__Group__9__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment"
    // InternalBareBones.g:843:1: rule__Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:847:1: ( ( ruleStatement ) )
            // InternalBareBones.g:848:2: ( ruleStatement )
            {
            // InternalBareBones.g:848:2: ( ruleStatement )
            // InternalBareBones.g:849:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__StatementsAssignment"


    // $ANTLR start "rule__Clear__NameAssignment_2"
    // InternalBareBones.g:858:1: rule__Clear__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Clear__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:862:1: ( ( RULE_ID ) )
            // InternalBareBones.g:863:2: ( RULE_ID )
            {
            // InternalBareBones.g:863:2: ( RULE_ID )
            // InternalBareBones.g:864:3: RULE_ID
            {
             before(grammarAccess.getClearAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClearAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Clear__NameAssignment_2"


    // $ANTLR start "rule__Increment__NameAssignment_2"
    // InternalBareBones.g:873:1: rule__Increment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Increment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:877:1: ( ( RULE_ID ) )
            // InternalBareBones.g:878:2: ( RULE_ID )
            {
            // InternalBareBones.g:878:2: ( RULE_ID )
            // InternalBareBones.g:879:3: RULE_ID
            {
             before(grammarAccess.getIncrementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncrementAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Increment__NameAssignment_2"


    // $ANTLR start "rule__Decrement__NameAssignment_2"
    // InternalBareBones.g:888:1: rule__Decrement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Decrement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:892:1: ( ( RULE_ID ) )
            // InternalBareBones.g:893:2: ( RULE_ID )
            {
            // InternalBareBones.g:893:2: ( RULE_ID )
            // InternalBareBones.g:894:3: RULE_ID
            {
             before(grammarAccess.getDecrementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDecrementAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Decrement__NameAssignment_2"


    // $ANTLR start "rule__While__NameAssignment_2"
    // InternalBareBones.g:903:1: rule__While__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__While__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:907:1: ( ( RULE_ID ) )
            // InternalBareBones.g:908:2: ( RULE_ID )
            {
            // InternalBareBones.g:908:2: ( RULE_ID )
            // InternalBareBones.g:909:3: RULE_ID
            {
             before(grammarAccess.getWhileAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__While__NameAssignment_2"


    // $ANTLR start "rule__While__StatementsAssignment_7"
    // InternalBareBones.g:918:1: rule__While__StatementsAssignment_7 : ( ruleStatement ) ;
    public final void rule__While__StatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:922:1: ( ( ruleStatement ) )
            // InternalBareBones.g:923:2: ( ruleStatement )
            {
            // InternalBareBones.g:923:2: ( ruleStatement )
            // InternalBareBones.g:924:3: ruleStatement
            {
             before(grammarAccess.getWhileAccess().getStatementsStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getStatementsStatementParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__While__StatementsAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000E802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});

}