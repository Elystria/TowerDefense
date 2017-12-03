package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.TowerDefenseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTowerDefenseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Jeu'", "'{'", "'}'", "'Partie'", "'PartieElement'", "'Niveau'"
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


        public InternalTowerDefenseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTowerDefenseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTowerDefenseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTowerDefense.g"; }



     	private TowerDefenseGrammarAccess grammarAccess;

        public InternalTowerDefenseParser(TokenStream input, TowerDefenseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Jeu";
       	}

       	@Override
       	protected TowerDefenseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJeu"
    // InternalTowerDefense.g:64:1: entryRuleJeu returns [EObject current=null] : iv_ruleJeu= ruleJeu EOF ;
    public final EObject entryRuleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeu = null;


        try {
            // InternalTowerDefense.g:64:44: (iv_ruleJeu= ruleJeu EOF )
            // InternalTowerDefense.g:65:2: iv_ruleJeu= ruleJeu EOF
            {
             newCompositeNode(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeu=ruleJeu();

            state._fsp--;

             current =iv_ruleJeu; 
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
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalTowerDefense.g:71:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartieRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parties_3_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:77:2: ( (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartieRule ) )* otherlv_4= '}' ) )
            // InternalTowerDefense.g:78:2: (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartieRule ) )* otherlv_4= '}' )
            {
            // InternalTowerDefense.g:78:2: (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartieRule ) )* otherlv_4= '}' )
            // InternalTowerDefense.g:79:3: otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartieRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalTowerDefense.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTowerDefense.g:105:3: ( (lv_parties_3_0= rulePartieRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTowerDefense.g:106:4: (lv_parties_3_0= rulePartieRule )
            	    {
            	    // InternalTowerDefense.g:106:4: (lv_parties_3_0= rulePartieRule )
            	    // InternalTowerDefense.g:107:5: lv_parties_3_0= rulePartieRule
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getPartiesPartieRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_parties_3_0=rulePartieRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parties",
            	    						lv_parties_3_0,
            	    						"xtext.TowerDefense.PartieRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRulePartieRule"
    // InternalTowerDefense.g:132:1: entryRulePartieRule returns [EObject current=null] : iv_rulePartieRule= rulePartieRule EOF ;
    public final EObject entryRulePartieRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartieRule = null;


        try {
            // InternalTowerDefense.g:132:51: (iv_rulePartieRule= rulePartieRule EOF )
            // InternalTowerDefense.g:133:2: iv_rulePartieRule= rulePartieRule EOF
            {
             newCompositeNode(grammarAccess.getPartieRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartieRule=rulePartieRule();

            state._fsp--;

             current =iv_rulePartieRule; 
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
    // $ANTLR end "entryRulePartieRule"


    // $ANTLR start "rulePartieRule"
    // InternalTowerDefense.g:139:1: rulePartieRule returns [EObject current=null] : (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}' ) ;
    public final EObject rulePartieRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_partiesElements_3_0 = null;

        EObject lv_niveaux_4_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:145:2: ( (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}' ) )
            // InternalTowerDefense.g:146:2: (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}' )
            {
            // InternalTowerDefense.g:146:2: (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}' )
            // InternalTowerDefense.g:147:3: otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPartieRuleAccess().getPartieKeyword_0());
            		
            // InternalTowerDefense.g:151:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:152:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:152:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:153:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartieRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartieRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPartieRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTowerDefense.g:173:3: ( (lv_partiesElements_3_0= rulePartieElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTowerDefense.g:174:4: (lv_partiesElements_3_0= rulePartieElement )
            	    {
            	    // InternalTowerDefense.g:174:4: (lv_partiesElements_3_0= rulePartieElement )
            	    // InternalTowerDefense.g:175:5: lv_partiesElements_3_0= rulePartieElement
            	    {

            	    					newCompositeNode(grammarAccess.getPartieRuleAccess().getPartiesElementsPartieElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_partiesElements_3_0=rulePartieElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartieRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"partiesElements",
            	    						lv_partiesElements_3_0,
            	    						"xtext.TowerDefense.PartieElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTowerDefense.g:192:3: ( (lv_niveaux_4_0= ruleNiveau ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTowerDefense.g:193:4: (lv_niveaux_4_0= ruleNiveau )
            	    {
            	    // InternalTowerDefense.g:193:4: (lv_niveaux_4_0= ruleNiveau )
            	    // InternalTowerDefense.g:194:5: lv_niveaux_4_0= ruleNiveau
            	    {

            	    					newCompositeNode(grammarAccess.getPartieRuleAccess().getNiveauxNiveauParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_niveaux_4_0=ruleNiveau();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartieRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"niveaux",
            	    						lv_niveaux_4_0,
            	    						"xtext.TowerDefense.Niveau");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPartieRuleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePartieRule"


    // $ANTLR start "entryRulePartieElement"
    // InternalTowerDefense.g:219:1: entryRulePartieElement returns [EObject current=null] : iv_rulePartieElement= rulePartieElement EOF ;
    public final EObject entryRulePartieElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartieElement = null;


        try {
            // InternalTowerDefense.g:219:54: (iv_rulePartieElement= rulePartieElement EOF )
            // InternalTowerDefense.g:220:2: iv_rulePartieElement= rulePartieElement EOF
            {
             newCompositeNode(grammarAccess.getPartieElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartieElement=rulePartieElement();

            state._fsp--;

             current =iv_rulePartieElement; 
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
    // $ANTLR end "entryRulePartieElement"


    // $ANTLR start "rulePartieElement"
    // InternalTowerDefense.g:226:1: rulePartieElement returns [EObject current=null] : (otherlv_0= 'PartieElement' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePartieElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:232:2: ( (otherlv_0= 'PartieElement' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalTowerDefense.g:233:2: (otherlv_0= 'PartieElement' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalTowerDefense.g:233:2: (otherlv_0= 'PartieElement' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalTowerDefense.g:234:3: otherlv_0= 'PartieElement' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPartieElementAccess().getPartieElementKeyword_0());
            		
            // InternalTowerDefense.g:238:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:239:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:239:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:240:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartieElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartieElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulePartieElement"


    // $ANTLR start "entryRuleNiveau"
    // InternalTowerDefense.g:260:1: entryRuleNiveau returns [EObject current=null] : iv_ruleNiveau= ruleNiveau EOF ;
    public final EObject entryRuleNiveau() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNiveau = null;


        try {
            // InternalTowerDefense.g:260:47: (iv_ruleNiveau= ruleNiveau EOF )
            // InternalTowerDefense.g:261:2: iv_ruleNiveau= ruleNiveau EOF
            {
             newCompositeNode(grammarAccess.getNiveauRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNiveau=ruleNiveau();

            state._fsp--;

             current =iv_ruleNiveau; 
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
    // $ANTLR end "entryRuleNiveau"


    // $ANTLR start "ruleNiveau"
    // InternalTowerDefense.g:267:1: ruleNiveau returns [EObject current=null] : (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNiveau() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:273:2: ( (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalTowerDefense.g:274:2: (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalTowerDefense.g:274:2: (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalTowerDefense.g:275:3: otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNiveauAccess().getNiveauKeyword_0());
            		
            // InternalTowerDefense.g:279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:280:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNiveauAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNiveauRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleNiveau"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000012000L});

}