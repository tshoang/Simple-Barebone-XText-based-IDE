package ac.soton.java.barebones.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.java.barebones.services.BareBonesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBareBonesParser extends AbstractInternalAntlrParser {
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

        public InternalBareBonesParser(TokenStream input, BareBonesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected BareBonesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalBareBones.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalBareBones.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalBareBones.g:65:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalBareBones.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalBareBones.g:78:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalBareBones.g:78:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBareBones.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalBareBones.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalBareBones.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"ac.soton.java.barebones.BareBones.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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


    // $ANTLR start "entryRuleStatement"
    // InternalBareBones.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBareBones.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalBareBones.g:101:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalBareBones.g:107:1: ruleStatement returns [EObject current=null] : (this_Clear_0= ruleClear | this_Increment_1= ruleIncrement | this_Decrement_2= ruleDecrement | this_While_3= ruleWhile ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Clear_0 = null;

        EObject this_Increment_1 = null;

        EObject this_Decrement_2 = null;

        EObject this_While_3 = null;



        	enterRule();

        try {
            // InternalBareBones.g:113:2: ( (this_Clear_0= ruleClear | this_Increment_1= ruleIncrement | this_Decrement_2= ruleDecrement | this_While_3= ruleWhile ) )
            // InternalBareBones.g:114:2: (this_Clear_0= ruleClear | this_Increment_1= ruleIncrement | this_Decrement_2= ruleDecrement | this_While_3= ruleWhile )
            {
            // InternalBareBones.g:114:2: (this_Clear_0= ruleClear | this_Increment_1= ruleIncrement | this_Decrement_2= ruleDecrement | this_While_3= ruleWhile )
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
                    // InternalBareBones.g:115:3: this_Clear_0= ruleClear
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getClearParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clear_0=ruleClear();

                    state._fsp--;


                    			current = this_Clear_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBareBones.g:124:3: this_Increment_1= ruleIncrement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIncrementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Increment_1=ruleIncrement();

                    state._fsp--;


                    			current = this_Increment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBareBones.g:133:3: this_Decrement_2= ruleDecrement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDecrementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decrement_2=ruleDecrement();

                    state._fsp--;


                    			current = this_Decrement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBareBones.g:142:3: this_While_3= ruleWhile
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_While_3=ruleWhile();

                    state._fsp--;


                    			current = this_While_3;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleClear"
    // InternalBareBones.g:154:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // InternalBareBones.g:154:46: (iv_ruleClear= ruleClear EOF )
            // InternalBareBones.g:155:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
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
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // InternalBareBones.g:161:1: ruleClear returns [EObject current=null] : ( () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBareBones.g:167:2: ( ( () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalBareBones.g:168:2: ( () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalBareBones.g:168:2: ( () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalBareBones.g:169:3: () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalBareBones.g:169:3: ()
            // InternalBareBones.g:170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearAccess().getClearAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getClearAccess().getClearKeyword_1());
            		
            // InternalBareBones.g:180:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBareBones.g:181:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBareBones.g:181:4: (lv_name_2_0= RULE_ID )
            // InternalBareBones.g:182:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClearAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClearRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClearAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleIncrement"
    // InternalBareBones.g:206:1: entryRuleIncrement returns [EObject current=null] : iv_ruleIncrement= ruleIncrement EOF ;
    public final EObject entryRuleIncrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncrement = null;


        try {
            // InternalBareBones.g:206:50: (iv_ruleIncrement= ruleIncrement EOF )
            // InternalBareBones.g:207:2: iv_ruleIncrement= ruleIncrement EOF
            {
             newCompositeNode(grammarAccess.getIncrementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncrement=ruleIncrement();

            state._fsp--;

             current =iv_ruleIncrement; 
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
    // $ANTLR end "entryRuleIncrement"


    // $ANTLR start "ruleIncrement"
    // InternalBareBones.g:213:1: ruleIncrement returns [EObject current=null] : ( () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleIncrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBareBones.g:219:2: ( ( () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalBareBones.g:220:2: ( () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalBareBones.g:220:2: ( () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalBareBones.g:221:3: () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalBareBones.g:221:3: ()
            // InternalBareBones.g:222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIncrementAccess().getIncrementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIncrementAccess().getIncrKeyword_1());
            		
            // InternalBareBones.g:232:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBareBones.g:233:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBareBones.g:233:4: (lv_name_2_0= RULE_ID )
            // InternalBareBones.g:234:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIncrementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncrementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getIncrementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleIncrement"


    // $ANTLR start "entryRuleDecrement"
    // InternalBareBones.g:258:1: entryRuleDecrement returns [EObject current=null] : iv_ruleDecrement= ruleDecrement EOF ;
    public final EObject entryRuleDecrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecrement = null;


        try {
            // InternalBareBones.g:258:50: (iv_ruleDecrement= ruleDecrement EOF )
            // InternalBareBones.g:259:2: iv_ruleDecrement= ruleDecrement EOF
            {
             newCompositeNode(grammarAccess.getDecrementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecrement=ruleDecrement();

            state._fsp--;

             current =iv_ruleDecrement; 
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
    // $ANTLR end "entryRuleDecrement"


    // $ANTLR start "ruleDecrement"
    // InternalBareBones.g:265:1: ruleDecrement returns [EObject current=null] : ( () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleDecrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBareBones.g:271:2: ( ( () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalBareBones.g:272:2: ( () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalBareBones.g:272:2: ( () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalBareBones.g:273:3: () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalBareBones.g:273:3: ()
            // InternalBareBones.g:274:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecrementAccess().getDecrementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDecrementAccess().getDecrKeyword_1());
            		
            // InternalBareBones.g:284:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBareBones.g:285:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBareBones.g:285:4: (lv_name_2_0= RULE_ID )
            // InternalBareBones.g:286:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDecrementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecrementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDecrementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDecrement"


    // $ANTLR start "entryRuleWhile"
    // InternalBareBones.g:310:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalBareBones.g:310:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalBareBones.g:311:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalBareBones.g:317:1: ruleWhile returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'not' otherlv_4= '0' otherlv_5= 'do' otherlv_6= ';' ( (lv_statements_7_0= ruleStatement ) )+ otherlv_8= 'end' otherlv_9= ';' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_statements_7_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:323:2: ( ( () otherlv_1= 'while' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'not' otherlv_4= '0' otherlv_5= 'do' otherlv_6= ';' ( (lv_statements_7_0= ruleStatement ) )+ otherlv_8= 'end' otherlv_9= ';' ) )
            // InternalBareBones.g:324:2: ( () otherlv_1= 'while' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'not' otherlv_4= '0' otherlv_5= 'do' otherlv_6= ';' ( (lv_statements_7_0= ruleStatement ) )+ otherlv_8= 'end' otherlv_9= ';' )
            {
            // InternalBareBones.g:324:2: ( () otherlv_1= 'while' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'not' otherlv_4= '0' otherlv_5= 'do' otherlv_6= ';' ( (lv_statements_7_0= ruleStatement ) )+ otherlv_8= 'end' otherlv_9= ';' )
            // InternalBareBones.g:325:3: () otherlv_1= 'while' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'not' otherlv_4= '0' otherlv_5= 'do' otherlv_6= ';' ( (lv_statements_7_0= ruleStatement ) )+ otherlv_8= 'end' otherlv_9= ';'
            {
            // InternalBareBones.g:325:3: ()
            // InternalBareBones.g:326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileAccess().getWhileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getWhileKeyword_1());
            		
            // InternalBareBones.g:336:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBareBones.g:337:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBareBones.g:337:4: (lv_name_2_0= RULE_ID )
            // InternalBareBones.g:338:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getWhileAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getNotKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getDigitZeroKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileAccess().getDoKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileAccess().getSemicolonKeyword_6());
            		
            // InternalBareBones.g:370:3: ( (lv_statements_7_0= ruleStatement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||(LA3_0>=13 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBareBones.g:371:4: (lv_statements_7_0= ruleStatement )
            	    {
            	    // InternalBareBones.g:371:4: (lv_statements_7_0= ruleStatement )
            	    // InternalBareBones.g:372:5: lv_statements_7_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileAccess().getStatementsStatementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_7_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_7_0,
            	    						"ac.soton.java.barebones.BareBones.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getWhileAccess().getEndKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWhileAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleWhile"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000E802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000008E800L});

}