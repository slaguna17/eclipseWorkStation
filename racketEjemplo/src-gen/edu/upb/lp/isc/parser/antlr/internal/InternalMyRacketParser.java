package edu.upb.lp.isc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.upb.lp.isc.services.MyRacketGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyRacketParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Definitions'", "'Executions'", "'('", "'define'", "')'", "'TODO'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyRacketParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyRacketParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyRacketParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyRacket.g"; }



     	private MyRacketGrammarAccess grammarAccess;

        public InternalMyRacketParser(TokenStream input, MyRacketGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MyRacketProgram";
       	}

       	@Override
       	protected MyRacketGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMyRacketProgram"
    // InternalMyRacket.g:64:1: entryRuleMyRacketProgram returns [EObject current=null] : iv_ruleMyRacketProgram= ruleMyRacketProgram EOF ;
    public final EObject entryRuleMyRacketProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyRacketProgram = null;


        try {
            // InternalMyRacket.g:64:56: (iv_ruleMyRacketProgram= ruleMyRacketProgram EOF )
            // InternalMyRacket.g:65:2: iv_ruleMyRacketProgram= ruleMyRacketProgram EOF
            {
             newCompositeNode(grammarAccess.getMyRacketProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyRacketProgram=ruleMyRacketProgram();

            state._fsp--;

             current =iv_ruleMyRacketProgram; 
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
    // $ANTLR end "entryRuleMyRacketProgram"


    // $ANTLR start "ruleMyRacketProgram"
    // InternalMyRacket.g:71:1: ruleMyRacketProgram returns [EObject current=null] : ( (otherlv_0= 'Definitions' ( (lv_defines_1_0= ruleDefine ) )+ )? otherlv_2= 'Executions' ( (lv_executions_3_0= ruleExpression ) )+ ) ;
    public final EObject ruleMyRacketProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_defines_1_0 = null;

        AntlrDatatypeRuleToken lv_executions_3_0 = null;



        	enterRule();

        try {
            // InternalMyRacket.g:77:2: ( ( (otherlv_0= 'Definitions' ( (lv_defines_1_0= ruleDefine ) )+ )? otherlv_2= 'Executions' ( (lv_executions_3_0= ruleExpression ) )+ ) )
            // InternalMyRacket.g:78:2: ( (otherlv_0= 'Definitions' ( (lv_defines_1_0= ruleDefine ) )+ )? otherlv_2= 'Executions' ( (lv_executions_3_0= ruleExpression ) )+ )
            {
            // InternalMyRacket.g:78:2: ( (otherlv_0= 'Definitions' ( (lv_defines_1_0= ruleDefine ) )+ )? otherlv_2= 'Executions' ( (lv_executions_3_0= ruleExpression ) )+ )
            // InternalMyRacket.g:79:3: (otherlv_0= 'Definitions' ( (lv_defines_1_0= ruleDefine ) )+ )? otherlv_2= 'Executions' ( (lv_executions_3_0= ruleExpression ) )+
            {
            // InternalMyRacket.g:79:3: (otherlv_0= 'Definitions' ( (lv_defines_1_0= ruleDefine ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyRacket.g:80:4: otherlv_0= 'Definitions' ( (lv_defines_1_0= ruleDefine ) )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getMyRacketProgramAccess().getDefinitionsKeyword_0_0());
                    			
                    // InternalMyRacket.g:84:4: ( (lv_defines_1_0= ruleDefine ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyRacket.g:85:5: (lv_defines_1_0= ruleDefine )
                    	    {
                    	    // InternalMyRacket.g:85:5: (lv_defines_1_0= ruleDefine )
                    	    // InternalMyRacket.g:86:6: lv_defines_1_0= ruleDefine
                    	    {

                    	    						newCompositeNode(grammarAccess.getMyRacketProgramAccess().getDefinesDefineParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_defines_1_0=ruleDefine();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMyRacketProgramRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"defines",
                    	    							lv_defines_1_0,
                    	    							"edu.upb.lp.isc.MyRacket.Define");
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
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMyRacketProgramAccess().getExecutionsKeyword_1());
            		
            // InternalMyRacket.g:108:3: ( (lv_executions_3_0= ruleExpression ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyRacket.g:109:4: (lv_executions_3_0= ruleExpression )
            	    {
            	    // InternalMyRacket.g:109:4: (lv_executions_3_0= ruleExpression )
            	    // InternalMyRacket.g:110:5: lv_executions_3_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getMyRacketProgramAccess().getExecutionsExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_executions_3_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMyRacketProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"executions",
            	    						lv_executions_3_0,
            	    						"edu.upb.lp.isc.MyRacket.Expression");
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
    // $ANTLR end "ruleMyRacketProgram"


    // $ANTLR start "entryRuleDefine"
    // InternalMyRacket.g:131:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalMyRacket.g:131:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalMyRacket.g:132:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalMyRacket.g:138:1: ruleDefine returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'define' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= RULE_ID ) )* otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_params_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalMyRacket.g:144:2: ( (otherlv_0= '(' otherlv_1= 'define' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= RULE_ID ) )* otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalMyRacket.g:145:2: (otherlv_0= '(' otherlv_1= 'define' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= RULE_ID ) )* otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalMyRacket.g:145:2: (otherlv_0= '(' otherlv_1= 'define' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= RULE_ID ) )* otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalMyRacket.g:146:3: otherlv_0= '(' otherlv_1= 'define' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= RULE_ID ) )* otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineAccess().getDefineKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyRacket.g:158:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyRacket.g:159:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyRacket.g:159:4: (lv_name_3_0= RULE_ID )
            // InternalMyRacket.g:160:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyRacket.g:176:3: ( (lv_params_4_0= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyRacket.g:177:4: (lv_params_4_0= RULE_ID )
            	    {
            	    // InternalMyRacket.g:177:4: (lv_params_4_0= RULE_ID )
            	    // InternalMyRacket.g:178:5: lv_params_4_0= RULE_ID
            	    {
            	    lv_params_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(lv_params_4_0, grammarAccess.getDefineAccess().getParamsIDTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDefineRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"params",
            	    						lv_params_4_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getDefineAccess().getRightParenthesisKeyword_5());
            		
            // InternalMyRacket.g:198:3: ( (lv_body_6_0= ruleExpression ) )
            // InternalMyRacket.g:199:4: (lv_body_6_0= ruleExpression )
            {
            // InternalMyRacket.g:199:4: (lv_body_6_0= ruleExpression )
            // InternalMyRacket.g:200:5: lv_body_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDefineAccess().getBodyExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_body_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"edu.upb.lp.isc.MyRacket.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDefineAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleExpression"
    // InternalMyRacket.g:225:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalMyRacket.g:225:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyRacket.g:226:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
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
    // InternalMyRacket.g:232:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TODO' ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyRacket.g:238:2: (kw= 'TODO' )
            // InternalMyRacket.g:239:2: kw= 'TODO'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getExpressionAccess().getTODOKeyword());
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});

}