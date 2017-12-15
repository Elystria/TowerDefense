package xtext.parser.antlr.internal;

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
import xtext.services.TowerDefenseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTowerDefenseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Jeu'", "'{'", "'}'", "'Partie'", "'Obstacle'", "'Mobile'", "'Projectile'", "'Nature'", "'Tactique'", "'procheFirst'", "'faibleFirst'", "'fortFirst'", "'Volume'", "'Type'", "'FatigueEntree'", "'Niveau'", "'Difficulte'", "'DureePauses'", "'Argent'", "'MobSortisMax'", "'Vague'", "'Terrain'", "'i'", "'j'", "'Mobiles'", "'Obstacles'", "'Gain'", "'entree'", "'sortie'", "'chemin'", "'camp'", "'deco'", "'facile'", "'moyen'", "'difficile'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalTowerDefense.g:65:1: entryRuleJeu returns [EObject current=null] : iv_ruleJeu= ruleJeu EOF ;
    public final EObject entryRuleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeu = null;


        try {
            // InternalTowerDefense.g:65:44: (iv_ruleJeu= ruleJeu EOF )
            // InternalTowerDefense.g:66:2: iv_ruleJeu= ruleJeu EOF
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
    // InternalTowerDefense.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartie ) )* otherlv_4= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parties_3_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:78:2: ( (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartie ) )* otherlv_4= '}' ) )
            // InternalTowerDefense.g:79:2: (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartie ) )* otherlv_4= '}' )
            {
            // InternalTowerDefense.g:79:2: (otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartie ) )* otherlv_4= '}' )
            // InternalTowerDefense.g:80:3: otherlv_0= 'Jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parties_3_0= rulePartie ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalTowerDefense.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:86:5: lv_name_1_0= RULE_ID
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
            		
            // InternalTowerDefense.g:106:3: ( (lv_parties_3_0= rulePartie ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTowerDefense.g:107:4: (lv_parties_3_0= rulePartie )
            	    {
            	    // InternalTowerDefense.g:107:4: (lv_parties_3_0= rulePartie )
            	    // InternalTowerDefense.g:108:5: lv_parties_3_0= rulePartie
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getPartiesPartieParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_parties_3_0=rulePartie();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parties",
            	    						lv_parties_3_0,
            	    						"xtext.TowerDefense.Partie");
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


    // $ANTLR start "entryRulePartie"
    // InternalTowerDefense.g:133:1: entryRulePartie returns [EObject current=null] : iv_rulePartie= rulePartie EOF ;
    public final EObject entryRulePartie() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartie = null;


        try {
            // InternalTowerDefense.g:133:47: (iv_rulePartie= rulePartie EOF )
            // InternalTowerDefense.g:134:2: iv_rulePartie= rulePartie EOF
            {
             newCompositeNode(grammarAccess.getPartieRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartie=rulePartie();

            state._fsp--;

             current =iv_rulePartie; 
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
    // $ANTLR end "entryRulePartie"


    // $ANTLR start "rulePartie"
    // InternalTowerDefense.g:140:1: rulePartie returns [EObject current=null] : (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}' ) ;
    public final EObject rulePartie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_partiesElements_3_0 = null;

        EObject lv_niveaux_4_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:146:2: ( (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}' ) )
            // InternalTowerDefense.g:147:2: (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}' )
            {
            // InternalTowerDefense.g:147:2: (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}' )
            // InternalTowerDefense.g:148:3: otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_partiesElements_3_0= rulePartieElement ) )* ( (lv_niveaux_4_0= ruleNiveau ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPartieAccess().getPartieKeyword_0());
            		
            // InternalTowerDefense.g:152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:153:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartieAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartieRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPartieAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTowerDefense.g:174:3: ( (lv_partiesElements_3_0= rulePartieElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTowerDefense.g:175:4: (lv_partiesElements_3_0= rulePartieElement )
            	    {
            	    // InternalTowerDefense.g:175:4: (lv_partiesElements_3_0= rulePartieElement )
            	    // InternalTowerDefense.g:176:5: lv_partiesElements_3_0= rulePartieElement
            	    {

            	    					newCompositeNode(grammarAccess.getPartieAccess().getPartiesElementsPartieElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_partiesElements_3_0=rulePartieElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartieRule());
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

            // InternalTowerDefense.g:193:3: ( (lv_niveaux_4_0= ruleNiveau ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTowerDefense.g:194:4: (lv_niveaux_4_0= ruleNiveau )
            	    {
            	    // InternalTowerDefense.g:194:4: (lv_niveaux_4_0= ruleNiveau )
            	    // InternalTowerDefense.g:195:5: lv_niveaux_4_0= ruleNiveau
            	    {

            	    					newCompositeNode(grammarAccess.getPartieAccess().getNiveauxNiveauParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_niveaux_4_0=ruleNiveau();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartieRule());
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

            			newLeafNode(otherlv_5, grammarAccess.getPartieAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePartie"


    // $ANTLR start "entryRulePartieElement"
    // InternalTowerDefense.g:220:1: entryRulePartieElement returns [EObject current=null] : iv_rulePartieElement= rulePartieElement EOF ;
    public final EObject entryRulePartieElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartieElement = null;


        try {
            // InternalTowerDefense.g:220:54: (iv_rulePartieElement= rulePartieElement EOF )
            // InternalTowerDefense.g:221:2: iv_rulePartieElement= rulePartieElement EOF
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
    // InternalTowerDefense.g:227:1: rulePartieElement returns [EObject current=null] : ( ( (lv_Obstacle_0_0= 'Obstacle' ) ) | ( (lv_Mobile_1_0= 'Mobile' ) ) | ( (lv_Projectile_2_0= 'Projectile' ) ) | ( (lv_Nature_3_0= 'Nature' ) ) ) ;
    public final EObject rulePartieElement() throws RecognitionException {
        EObject current = null;

        Token lv_Obstacle_0_0=null;
        Token lv_Mobile_1_0=null;
        Token lv_Projectile_2_0=null;
        Token lv_Nature_3_0=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:233:2: ( ( ( (lv_Obstacle_0_0= 'Obstacle' ) ) | ( (lv_Mobile_1_0= 'Mobile' ) ) | ( (lv_Projectile_2_0= 'Projectile' ) ) | ( (lv_Nature_3_0= 'Nature' ) ) ) )
            // InternalTowerDefense.g:234:2: ( ( (lv_Obstacle_0_0= 'Obstacle' ) ) | ( (lv_Mobile_1_0= 'Mobile' ) ) | ( (lv_Projectile_2_0= 'Projectile' ) ) | ( (lv_Nature_3_0= 'Nature' ) ) )
            {
            // InternalTowerDefense.g:234:2: ( ( (lv_Obstacle_0_0= 'Obstacle' ) ) | ( (lv_Mobile_1_0= 'Mobile' ) ) | ( (lv_Projectile_2_0= 'Projectile' ) ) | ( (lv_Nature_3_0= 'Nature' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTowerDefense.g:235:3: ( (lv_Obstacle_0_0= 'Obstacle' ) )
                    {
                    // InternalTowerDefense.g:235:3: ( (lv_Obstacle_0_0= 'Obstacle' ) )
                    // InternalTowerDefense.g:236:4: (lv_Obstacle_0_0= 'Obstacle' )
                    {
                    // InternalTowerDefense.g:236:4: (lv_Obstacle_0_0= 'Obstacle' )
                    // InternalTowerDefense.g:237:5: lv_Obstacle_0_0= 'Obstacle'
                    {
                    lv_Obstacle_0_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_Obstacle_0_0, grammarAccess.getPartieElementAccess().getObstacleObstacleKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPartieElementRule());
                    					}
                    					setWithLastConsumed(current, "Obstacle", lv_Obstacle_0_0, "Obstacle");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:250:3: ( (lv_Mobile_1_0= 'Mobile' ) )
                    {
                    // InternalTowerDefense.g:250:3: ( (lv_Mobile_1_0= 'Mobile' ) )
                    // InternalTowerDefense.g:251:4: (lv_Mobile_1_0= 'Mobile' )
                    {
                    // InternalTowerDefense.g:251:4: (lv_Mobile_1_0= 'Mobile' )
                    // InternalTowerDefense.g:252:5: lv_Mobile_1_0= 'Mobile'
                    {
                    lv_Mobile_1_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_Mobile_1_0, grammarAccess.getPartieElementAccess().getMobileMobileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPartieElementRule());
                    					}
                    					setWithLastConsumed(current, "Mobile", lv_Mobile_1_0, "Mobile");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:265:3: ( (lv_Projectile_2_0= 'Projectile' ) )
                    {
                    // InternalTowerDefense.g:265:3: ( (lv_Projectile_2_0= 'Projectile' ) )
                    // InternalTowerDefense.g:266:4: (lv_Projectile_2_0= 'Projectile' )
                    {
                    // InternalTowerDefense.g:266:4: (lv_Projectile_2_0= 'Projectile' )
                    // InternalTowerDefense.g:267:5: lv_Projectile_2_0= 'Projectile'
                    {
                    lv_Projectile_2_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_Projectile_2_0, grammarAccess.getPartieElementAccess().getProjectileProjectileKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPartieElementRule());
                    					}
                    					setWithLastConsumed(current, "Projectile", lv_Projectile_2_0, "Projectile");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTowerDefense.g:280:3: ( (lv_Nature_3_0= 'Nature' ) )
                    {
                    // InternalTowerDefense.g:280:3: ( (lv_Nature_3_0= 'Nature' ) )
                    // InternalTowerDefense.g:281:4: (lv_Nature_3_0= 'Nature' )
                    {
                    // InternalTowerDefense.g:281:4: (lv_Nature_3_0= 'Nature' )
                    // InternalTowerDefense.g:282:5: lv_Nature_3_0= 'Nature'
                    {
                    lv_Nature_3_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_Nature_3_0, grammarAccess.getPartieElementAccess().getNatureNatureKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPartieElementRule());
                    					}
                    					setWithLastConsumed(current, "Nature", lv_Nature_3_0, "Nature");
                    				

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
    // $ANTLR end "rulePartieElement"


    // $ANTLR start "entryRuleTactique"
    // InternalTowerDefense.g:298:1: entryRuleTactique returns [EObject current=null] : iv_ruleTactique= ruleTactique EOF ;
    public final EObject entryRuleTactique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTactique = null;


        try {
            // InternalTowerDefense.g:298:49: (iv_ruleTactique= ruleTactique EOF )
            // InternalTowerDefense.g:299:2: iv_ruleTactique= ruleTactique EOF
            {
             newCompositeNode(grammarAccess.getTactiqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTactique=ruleTactique();

            state._fsp--;

             current =iv_ruleTactique; 
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
    // $ANTLR end "entryRuleTactique"


    // $ANTLR start "ruleTactique"
    // InternalTowerDefense.g:305:1: ruleTactique returns [EObject current=null] : ( (otherlv_0= 'Tactique' ( (lv_proche_1_0= 'procheFirst' ) ) ) | ( (lv_faible_2_0= 'faibleFirst' ) ) | ( (lv_fort_3_0= 'fortFirst' ) ) ) ;
    public final EObject ruleTactique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_proche_1_0=null;
        Token lv_faible_2_0=null;
        Token lv_fort_3_0=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:311:2: ( ( (otherlv_0= 'Tactique' ( (lv_proche_1_0= 'procheFirst' ) ) ) | ( (lv_faible_2_0= 'faibleFirst' ) ) | ( (lv_fort_3_0= 'fortFirst' ) ) ) )
            // InternalTowerDefense.g:312:2: ( (otherlv_0= 'Tactique' ( (lv_proche_1_0= 'procheFirst' ) ) ) | ( (lv_faible_2_0= 'faibleFirst' ) ) | ( (lv_fort_3_0= 'fortFirst' ) ) )
            {
            // InternalTowerDefense.g:312:2: ( (otherlv_0= 'Tactique' ( (lv_proche_1_0= 'procheFirst' ) ) ) | ( (lv_faible_2_0= 'faibleFirst' ) ) | ( (lv_fort_3_0= 'fortFirst' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTowerDefense.g:313:3: (otherlv_0= 'Tactique' ( (lv_proche_1_0= 'procheFirst' ) ) )
                    {
                    // InternalTowerDefense.g:313:3: (otherlv_0= 'Tactique' ( (lv_proche_1_0= 'procheFirst' ) ) )
                    // InternalTowerDefense.g:314:4: otherlv_0= 'Tactique' ( (lv_proche_1_0= 'procheFirst' ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getTactiqueAccess().getTactiqueKeyword_0_0());
                    			
                    // InternalTowerDefense.g:318:4: ( (lv_proche_1_0= 'procheFirst' ) )
                    // InternalTowerDefense.g:319:5: (lv_proche_1_0= 'procheFirst' )
                    {
                    // InternalTowerDefense.g:319:5: (lv_proche_1_0= 'procheFirst' )
                    // InternalTowerDefense.g:320:6: lv_proche_1_0= 'procheFirst'
                    {
                    lv_proche_1_0=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_proche_1_0, grammarAccess.getTactiqueAccess().getProcheProcheFirstKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTactiqueRule());
                    						}
                    						setWithLastConsumed(current, "proche", lv_proche_1_0, "procheFirst");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:334:3: ( (lv_faible_2_0= 'faibleFirst' ) )
                    {
                    // InternalTowerDefense.g:334:3: ( (lv_faible_2_0= 'faibleFirst' ) )
                    // InternalTowerDefense.g:335:4: (lv_faible_2_0= 'faibleFirst' )
                    {
                    // InternalTowerDefense.g:335:4: (lv_faible_2_0= 'faibleFirst' )
                    // InternalTowerDefense.g:336:5: lv_faible_2_0= 'faibleFirst'
                    {
                    lv_faible_2_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_faible_2_0, grammarAccess.getTactiqueAccess().getFaibleFaibleFirstKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTactiqueRule());
                    					}
                    					setWithLastConsumed(current, "faible", lv_faible_2_0, "faibleFirst");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:349:3: ( (lv_fort_3_0= 'fortFirst' ) )
                    {
                    // InternalTowerDefense.g:349:3: ( (lv_fort_3_0= 'fortFirst' ) )
                    // InternalTowerDefense.g:350:4: (lv_fort_3_0= 'fortFirst' )
                    {
                    // InternalTowerDefense.g:350:4: (lv_fort_3_0= 'fortFirst' )
                    // InternalTowerDefense.g:351:5: lv_fort_3_0= 'fortFirst'
                    {
                    lv_fort_3_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_fort_3_0, grammarAccess.getTactiqueAccess().getFortFortFirstKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTactiqueRule());
                    					}
                    					setWithLastConsumed(current, "fort", lv_fort_3_0, "fortFirst");
                    				

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
    // $ANTLR end "ruleTactique"


    // $ANTLR start "entryRuleNatureTerrain"
    // InternalTowerDefense.g:367:1: entryRuleNatureTerrain returns [EObject current=null] : iv_ruleNatureTerrain= ruleNatureTerrain EOF ;
    public final EObject entryRuleNatureTerrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNatureTerrain = null;


        try {
            // InternalTowerDefense.g:367:54: (iv_ruleNatureTerrain= ruleNatureTerrain EOF )
            // InternalTowerDefense.g:368:2: iv_ruleNatureTerrain= ruleNatureTerrain EOF
            {
             newCompositeNode(grammarAccess.getNatureTerrainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNatureTerrain=ruleNatureTerrain();

            state._fsp--;

             current =iv_ruleNatureTerrain; 
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
    // $ANTLR end "entryRuleNatureTerrain"


    // $ANTLR start "ruleNatureTerrain"
    // InternalTowerDefense.g:374:1: ruleNatureTerrain returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'Volume' ( (lv_volume_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_type_5_0= ruleTYPE_TERRAIN ) ) otherlv_6= 'FatigueEntree' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleNatureTerrain() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_volume_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:380:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'Volume' ( (lv_volume_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_type_5_0= ruleTYPE_TERRAIN ) ) otherlv_6= 'FatigueEntree' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalTowerDefense.g:381:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'Volume' ( (lv_volume_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_type_5_0= ruleTYPE_TERRAIN ) ) otherlv_6= 'FatigueEntree' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalTowerDefense.g:381:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'Volume' ( (lv_volume_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_type_5_0= ruleTYPE_TERRAIN ) ) otherlv_6= 'FatigueEntree' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalTowerDefense.g:382:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'Volume' ( (lv_volume_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_type_5_0= ruleTYPE_TERRAIN ) ) otherlv_6= 'FatigueEntree' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            // InternalTowerDefense.g:382:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTowerDefense.g:383:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTowerDefense.g:383:4: (lv_name_0_0= RULE_ID )
            // InternalTowerDefense.g:384:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNatureTerrainAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNatureTerrainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNatureTerrainAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNatureTerrainAccess().getVolumeKeyword_2());
            		
            // InternalTowerDefense.g:408:3: ( (lv_volume_3_0= RULE_INT ) )
            // InternalTowerDefense.g:409:4: (lv_volume_3_0= RULE_INT )
            {
            // InternalTowerDefense.g:409:4: (lv_volume_3_0= RULE_INT )
            // InternalTowerDefense.g:410:5: lv_volume_3_0= RULE_INT
            {
            lv_volume_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_volume_3_0, grammarAccess.getNatureTerrainAccess().getVolumeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNatureTerrainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"volume",
            						lv_volume_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getNatureTerrainAccess().getTypeKeyword_4());
            		
            // InternalTowerDefense.g:430:3: ( (lv_type_5_0= ruleTYPE_TERRAIN ) )
            // InternalTowerDefense.g:431:4: (lv_type_5_0= ruleTYPE_TERRAIN )
            {
            // InternalTowerDefense.g:431:4: (lv_type_5_0= ruleTYPE_TERRAIN )
            // InternalTowerDefense.g:432:5: lv_type_5_0= ruleTYPE_TERRAIN
            {

            					newCompositeNode(grammarAccess.getNatureTerrainAccess().getTypeTYPE_TERRAINEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_5_0=ruleTYPE_TERRAIN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNatureTerrainRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"xtext.TowerDefense.TYPE_TERRAIN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getNatureTerrainAccess().getFatigueEntreeKeyword_6());
            		
            // InternalTowerDefense.g:453:3: ( (otherlv_7= RULE_ID ) )
            // InternalTowerDefense.g:454:4: (otherlv_7= RULE_ID )
            {
            // InternalTowerDefense.g:454:4: (otherlv_7= RULE_ID )
            // InternalTowerDefense.g:455:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNatureTerrainRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_7, grammarAccess.getNatureTerrainAccess().getFatigueEnergieCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getNatureTerrainAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleNatureTerrain"


    // $ANTLR start "entryRuleNiveau"
    // InternalTowerDefense.g:474:1: entryRuleNiveau returns [EObject current=null] : iv_ruleNiveau= ruleNiveau EOF ;
    public final EObject entryRuleNiveau() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNiveau = null;


        try {
            // InternalTowerDefense.g:474:47: (iv_ruleNiveau= ruleNiveau EOF )
            // InternalTowerDefense.g:475:2: iv_ruleNiveau= ruleNiveau EOF
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
    // InternalTowerDefense.g:481:1: ruleNiveau returns [EObject current=null] : (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Difficulte' ( (lv_difficulte_4_0= ruleDifficulte ) ) otherlv_5= 'DureePauses' ( (lv_dureePause_6_0= RULE_INT ) ) otherlv_7= 'Argent' ( (lv_argent_8_0= RULE_INT ) ) otherlv_9= 'MobSortisMax' ( (lv_mobSortisLimite_10_0= RULE_INT ) ) ( (lv_terrain_11_0= ruleTerrainDeJeu ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}' ) ;
    public final EObject ruleNiveau() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_dureePause_6_0=null;
        Token otherlv_7=null;
        Token lv_argent_8_0=null;
        Token otherlv_9=null;
        Token lv_mobSortisLimite_10_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_difficulte_4_0 = null;

        EObject lv_terrain_11_0 = null;

        EObject lv_vagues_13_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:487:2: ( (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Difficulte' ( (lv_difficulte_4_0= ruleDifficulte ) ) otherlv_5= 'DureePauses' ( (lv_dureePause_6_0= RULE_INT ) ) otherlv_7= 'Argent' ( (lv_argent_8_0= RULE_INT ) ) otherlv_9= 'MobSortisMax' ( (lv_mobSortisLimite_10_0= RULE_INT ) ) ( (lv_terrain_11_0= ruleTerrainDeJeu ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}' ) )
            // InternalTowerDefense.g:488:2: (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Difficulte' ( (lv_difficulte_4_0= ruleDifficulte ) ) otherlv_5= 'DureePauses' ( (lv_dureePause_6_0= RULE_INT ) ) otherlv_7= 'Argent' ( (lv_argent_8_0= RULE_INT ) ) otherlv_9= 'MobSortisMax' ( (lv_mobSortisLimite_10_0= RULE_INT ) ) ( (lv_terrain_11_0= ruleTerrainDeJeu ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}' )
            {
            // InternalTowerDefense.g:488:2: (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Difficulte' ( (lv_difficulte_4_0= ruleDifficulte ) ) otherlv_5= 'DureePauses' ( (lv_dureePause_6_0= RULE_INT ) ) otherlv_7= 'Argent' ( (lv_argent_8_0= RULE_INT ) ) otherlv_9= 'MobSortisMax' ( (lv_mobSortisLimite_10_0= RULE_INT ) ) ( (lv_terrain_11_0= ruleTerrainDeJeu ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}' )
            // InternalTowerDefense.g:489:3: otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Difficulte' ( (lv_difficulte_4_0= ruleDifficulte ) ) otherlv_5= 'DureePauses' ( (lv_dureePause_6_0= RULE_INT ) ) otherlv_7= 'Argent' ( (lv_argent_8_0= RULE_INT ) ) otherlv_9= 'MobSortisMax' ( (lv_mobSortisLimite_10_0= RULE_INT ) ) ( (lv_terrain_11_0= ruleTerrainDeJeu ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNiveauAccess().getNiveauKeyword_0());
            		
            // InternalTowerDefense.g:493:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:494:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:494:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:495:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getNiveauAccess().getDifficulteKeyword_3());
            		
            // InternalTowerDefense.g:519:3: ( (lv_difficulte_4_0= ruleDifficulte ) )
            // InternalTowerDefense.g:520:4: (lv_difficulte_4_0= ruleDifficulte )
            {
            // InternalTowerDefense.g:520:4: (lv_difficulte_4_0= ruleDifficulte )
            // InternalTowerDefense.g:521:5: lv_difficulte_4_0= ruleDifficulte
            {

            					newCompositeNode(grammarAccess.getNiveauAccess().getDifficulteDifficulteEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_difficulte_4_0=ruleDifficulte();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNiveauRule());
            					}
            					set(
            						current,
            						"difficulte",
            						lv_difficulte_4_0,
            						"xtext.TowerDefense.Difficulte");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getNiveauAccess().getDureePausesKeyword_5());
            		
            // InternalTowerDefense.g:542:3: ( (lv_dureePause_6_0= RULE_INT ) )
            // InternalTowerDefense.g:543:4: (lv_dureePause_6_0= RULE_INT )
            {
            // InternalTowerDefense.g:543:4: (lv_dureePause_6_0= RULE_INT )
            // InternalTowerDefense.g:544:5: lv_dureePause_6_0= RULE_INT
            {
            lv_dureePause_6_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_dureePause_6_0, grammarAccess.getNiveauAccess().getDureePauseINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNiveauRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dureePause",
            						lv_dureePause_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getNiveauAccess().getArgentKeyword_7());
            		
            // InternalTowerDefense.g:564:3: ( (lv_argent_8_0= RULE_INT ) )
            // InternalTowerDefense.g:565:4: (lv_argent_8_0= RULE_INT )
            {
            // InternalTowerDefense.g:565:4: (lv_argent_8_0= RULE_INT )
            // InternalTowerDefense.g:566:5: lv_argent_8_0= RULE_INT
            {
            lv_argent_8_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_argent_8_0, grammarAccess.getNiveauAccess().getArgentINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNiveauRule());
            					}
            					setWithLastConsumed(
            						current,
            						"argent",
            						lv_argent_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getNiveauAccess().getMobSortisMaxKeyword_9());
            		
            // InternalTowerDefense.g:586:3: ( (lv_mobSortisLimite_10_0= RULE_INT ) )
            // InternalTowerDefense.g:587:4: (lv_mobSortisLimite_10_0= RULE_INT )
            {
            // InternalTowerDefense.g:587:4: (lv_mobSortisLimite_10_0= RULE_INT )
            // InternalTowerDefense.g:588:5: lv_mobSortisLimite_10_0= RULE_INT
            {
            lv_mobSortisLimite_10_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_mobSortisLimite_10_0, grammarAccess.getNiveauAccess().getMobSortisLimiteINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNiveauRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mobSortisLimite",
            						lv_mobSortisLimite_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalTowerDefense.g:604:3: ( (lv_terrain_11_0= ruleTerrainDeJeu ) )
            // InternalTowerDefense.g:605:4: (lv_terrain_11_0= ruleTerrainDeJeu )
            {
            // InternalTowerDefense.g:605:4: (lv_terrain_11_0= ruleTerrainDeJeu )
            // InternalTowerDefense.g:606:5: lv_terrain_11_0= ruleTerrainDeJeu
            {

            					newCompositeNode(grammarAccess.getNiveauAccess().getTerrainTerrainDeJeuParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_21);
            lv_terrain_11_0=ruleTerrainDeJeu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNiveauRule());
            					}
            					set(
            						current,
            						"terrain",
            						lv_terrain_11_0,
            						"xtext.TowerDefense.TerrainDeJeu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getNiveauAccess().getVagueKeyword_12());
            		
            // InternalTowerDefense.g:627:3: ( (lv_vagues_13_0= ruleVague ) )
            // InternalTowerDefense.g:628:4: (lv_vagues_13_0= ruleVague )
            {
            // InternalTowerDefense.g:628:4: (lv_vagues_13_0= ruleVague )
            // InternalTowerDefense.g:629:5: lv_vagues_13_0= ruleVague
            {

            					newCompositeNode(grammarAccess.getNiveauAccess().getVaguesVagueParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_14);
            lv_vagues_13_0=ruleVague();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNiveauRule());
            					}
            					add(
            						current,
            						"vagues",
            						lv_vagues_13_0,
            						"xtext.TowerDefense.Vague");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_14());
            		

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


    // $ANTLR start "entryRuleTerrainDeJeu"
    // InternalTowerDefense.g:654:1: entryRuleTerrainDeJeu returns [EObject current=null] : iv_ruleTerrainDeJeu= ruleTerrainDeJeu EOF ;
    public final EObject entryRuleTerrainDeJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerrainDeJeu = null;


        try {
            // InternalTowerDefense.g:654:53: (iv_ruleTerrainDeJeu= ruleTerrainDeJeu EOF )
            // InternalTowerDefense.g:655:2: iv_ruleTerrainDeJeu= ruleTerrainDeJeu EOF
            {
             newCompositeNode(grammarAccess.getTerrainDeJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerrainDeJeu=ruleTerrainDeJeu();

            state._fsp--;

             current =iv_ruleTerrainDeJeu; 
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
    // $ANTLR end "entryRuleTerrainDeJeu"


    // $ANTLR start "ruleTerrainDeJeu"
    // InternalTowerDefense.g:661:1: ruleTerrainDeJeu returns [EObject current=null] : (otherlv_0= 'Terrain' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTerrainDeJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:667:2: ( (otherlv_0= 'Terrain' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalTowerDefense.g:668:2: (otherlv_0= 'Terrain' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalTowerDefense.g:668:2: (otherlv_0= 'Terrain' ( (otherlv_1= RULE_ID ) ) )
            // InternalTowerDefense.g:669:3: otherlv_0= 'Terrain' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTerrainDeJeuAccess().getTerrainKeyword_0());
            		
            // InternalTowerDefense.g:673:3: ( (otherlv_1= RULE_ID ) )
            // InternalTowerDefense.g:674:4: (otherlv_1= RULE_ID )
            {
            // InternalTowerDefense.g:674:4: (otherlv_1= RULE_ID )
            // InternalTowerDefense.g:675:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerrainDeJeuRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getTerrainDeJeuAccess().getDamierDamierCrossReference_1_0());
            				

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
    // $ANTLR end "ruleTerrainDeJeu"


    // $ANTLR start "entryRuleCase"
    // InternalTowerDefense.g:690:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalTowerDefense.g:690:45: (iv_ruleCase= ruleCase EOF )
            // InternalTowerDefense.g:691:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalTowerDefense.g:697:1: ruleCase returns [EObject current=null] : (otherlv_0= 'i' ( (lv_i_1_0= RULE_INT ) ) otherlv_2= 'j' ( (lv_j_3_0= RULE_INT ) ) ( (lv_natureTerrain_4_0= ruleNatureTerrain ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_i_1_0=null;
        Token otherlv_2=null;
        Token lv_j_3_0=null;
        EObject lv_natureTerrain_4_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:703:2: ( (otherlv_0= 'i' ( (lv_i_1_0= RULE_INT ) ) otherlv_2= 'j' ( (lv_j_3_0= RULE_INT ) ) ( (lv_natureTerrain_4_0= ruleNatureTerrain ) ) ) )
            // InternalTowerDefense.g:704:2: (otherlv_0= 'i' ( (lv_i_1_0= RULE_INT ) ) otherlv_2= 'j' ( (lv_j_3_0= RULE_INT ) ) ( (lv_natureTerrain_4_0= ruleNatureTerrain ) ) )
            {
            // InternalTowerDefense.g:704:2: (otherlv_0= 'i' ( (lv_i_1_0= RULE_INT ) ) otherlv_2= 'j' ( (lv_j_3_0= RULE_INT ) ) ( (lv_natureTerrain_4_0= ruleNatureTerrain ) ) )
            // InternalTowerDefense.g:705:3: otherlv_0= 'i' ( (lv_i_1_0= RULE_INT ) ) otherlv_2= 'j' ( (lv_j_3_0= RULE_INT ) ) ( (lv_natureTerrain_4_0= ruleNatureTerrain ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getIKeyword_0());
            		
            // InternalTowerDefense.g:709:3: ( (lv_i_1_0= RULE_INT ) )
            // InternalTowerDefense.g:710:4: (lv_i_1_0= RULE_INT )
            {
            // InternalTowerDefense.g:710:4: (lv_i_1_0= RULE_INT )
            // InternalTowerDefense.g:711:5: lv_i_1_0= RULE_INT
            {
            lv_i_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_i_1_0, grammarAccess.getCaseAccess().getIINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"i",
            						lv_i_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getJKeyword_2());
            		
            // InternalTowerDefense.g:731:3: ( (lv_j_3_0= RULE_INT ) )
            // InternalTowerDefense.g:732:4: (lv_j_3_0= RULE_INT )
            {
            // InternalTowerDefense.g:732:4: (lv_j_3_0= RULE_INT )
            // InternalTowerDefense.g:733:5: lv_j_3_0= RULE_INT
            {
            lv_j_3_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_j_3_0, grammarAccess.getCaseAccess().getJINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"j",
            						lv_j_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalTowerDefense.g:749:3: ( (lv_natureTerrain_4_0= ruleNatureTerrain ) )
            // InternalTowerDefense.g:750:4: (lv_natureTerrain_4_0= ruleNatureTerrain )
            {
            // InternalTowerDefense.g:750:4: (lv_natureTerrain_4_0= ruleNatureTerrain )
            // InternalTowerDefense.g:751:5: lv_natureTerrain_4_0= ruleNatureTerrain
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getNatureTerrainNatureTerrainParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_natureTerrain_4_0=ruleNatureTerrain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					set(
            						current,
            						"natureTerrain",
            						lv_natureTerrain_4_0,
            						"xtext.TowerDefense.NatureTerrain");
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleVague"
    // InternalTowerDefense.g:772:1: entryRuleVague returns [EObject current=null] : iv_ruleVague= ruleVague EOF ;
    public final EObject entryRuleVague() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVague = null;


        try {
            // InternalTowerDefense.g:772:46: (iv_ruleVague= ruleVague EOF )
            // InternalTowerDefense.g:773:2: iv_ruleVague= ruleVague EOF
            {
             newCompositeNode(grammarAccess.getVagueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVague=ruleVague();

            state._fsp--;

             current =iv_ruleVague; 
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
    // $ANTLR end "entryRuleVague"


    // $ANTLR start "ruleVague"
    // InternalTowerDefense.g:779:1: ruleVague returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}' ) ;
    public final EObject ruleVague() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_gainVictoire_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:785:2: ( (otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}' ) )
            // InternalTowerDefense.g:786:2: (otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}' )
            {
            // InternalTowerDefense.g:786:2: (otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}' )
            // InternalTowerDefense.g:787:3: otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getVagueAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getVagueAccess().getMobilesKeyword_1());
            		
            // InternalTowerDefense.g:795:3: ( (otherlv_2= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTowerDefense.g:796:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalTowerDefense.g:796:4: (otherlv_2= RULE_ID )
            	    // InternalTowerDefense.g:797:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVagueRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    					newLeafNode(otherlv_2, grammarAccess.getVagueAccess().getMobilesMobileCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getVagueAccess().getObstaclesKeyword_3());
            		
            // InternalTowerDefense.g:812:3: ( (otherlv_4= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTowerDefense.g:813:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalTowerDefense.g:813:4: (otherlv_4= RULE_ID )
            	    // InternalTowerDefense.g:814:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVagueRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVagueAccess().getObstaclesObstacleCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getVagueAccess().getGainKeyword_5());
            		
            // InternalTowerDefense.g:829:3: ( (lv_gainVictoire_6_0= RULE_INT ) )
            // InternalTowerDefense.g:830:4: (lv_gainVictoire_6_0= RULE_INT )
            {
            // InternalTowerDefense.g:830:4: (lv_gainVictoire_6_0= RULE_INT )
            // InternalTowerDefense.g:831:5: lv_gainVictoire_6_0= RULE_INT
            {
            lv_gainVictoire_6_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_gainVictoire_6_0, grammarAccess.getVagueAccess().getGainVictoireINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVagueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"gainVictoire",
            						lv_gainVictoire_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVagueAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleVague"


    // $ANTLR start "ruleTYPE_TERRAIN"
    // InternalTowerDefense.g:855:1: ruleTYPE_TERRAIN returns [Enumerator current=null] : ( (enumLiteral_0= 'entree' ) | (enumLiteral_1= 'sortie' ) | (enumLiteral_2= 'chemin' ) | (enumLiteral_3= 'camp' ) | (enumLiteral_4= 'deco' ) ) ;
    public final Enumerator ruleTYPE_TERRAIN() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:861:2: ( ( (enumLiteral_0= 'entree' ) | (enumLiteral_1= 'sortie' ) | (enumLiteral_2= 'chemin' ) | (enumLiteral_3= 'camp' ) | (enumLiteral_4= 'deco' ) ) )
            // InternalTowerDefense.g:862:2: ( (enumLiteral_0= 'entree' ) | (enumLiteral_1= 'sortie' ) | (enumLiteral_2= 'chemin' ) | (enumLiteral_3= 'camp' ) | (enumLiteral_4= 'deco' ) )
            {
            // InternalTowerDefense.g:862:2: ( (enumLiteral_0= 'entree' ) | (enumLiteral_1= 'sortie' ) | (enumLiteral_2= 'chemin' ) | (enumLiteral_3= 'camp' ) | (enumLiteral_4= 'deco' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            case 42:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTowerDefense.g:863:3: (enumLiteral_0= 'entree' )
                    {
                    // InternalTowerDefense.g:863:3: (enumLiteral_0= 'entree' )
                    // InternalTowerDefense.g:864:4: enumLiteral_0= 'entree'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:871:3: (enumLiteral_1= 'sortie' )
                    {
                    // InternalTowerDefense.g:871:3: (enumLiteral_1= 'sortie' )
                    // InternalTowerDefense.g:872:4: enumLiteral_1= 'sortie'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:879:3: (enumLiteral_2= 'chemin' )
                    {
                    // InternalTowerDefense.g:879:3: (enumLiteral_2= 'chemin' )
                    // InternalTowerDefense.g:880:4: enumLiteral_2= 'chemin'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTowerDefense.g:887:3: (enumLiteral_3= 'camp' )
                    {
                    // InternalTowerDefense.g:887:3: (enumLiteral_3= 'camp' )
                    // InternalTowerDefense.g:888:4: enumLiteral_3= 'camp'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTowerDefense.g:895:3: (enumLiteral_4= 'deco' )
                    {
                    // InternalTowerDefense.g:895:3: (enumLiteral_4= 'deco' )
                    // InternalTowerDefense.g:896:4: enumLiteral_4= 'deco'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getDecorationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTYPE_TERRAINAccess().getDecorationEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleTYPE_TERRAIN"


    // $ANTLR start "ruleDifficulte"
    // InternalTowerDefense.g:906:1: ruleDifficulte returns [Enumerator current=null] : ( (enumLiteral_0= 'facile' ) | (enumLiteral_1= 'moyen' ) | (enumLiteral_2= 'difficile' ) ) ;
    public final Enumerator ruleDifficulte() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:912:2: ( ( (enumLiteral_0= 'facile' ) | (enumLiteral_1= 'moyen' ) | (enumLiteral_2= 'difficile' ) ) )
            // InternalTowerDefense.g:913:2: ( (enumLiteral_0= 'facile' ) | (enumLiteral_1= 'moyen' ) | (enumLiteral_2= 'difficile' ) )
            {
            // InternalTowerDefense.g:913:2: ( (enumLiteral_0= 'facile' ) | (enumLiteral_1= 'moyen' ) | (enumLiteral_2= 'difficile' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt9=1;
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case 45:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTowerDefense.g:914:3: (enumLiteral_0= 'facile' )
                    {
                    // InternalTowerDefense.g:914:3: (enumLiteral_0= 'facile' )
                    // InternalTowerDefense.g:915:4: enumLiteral_0= 'facile'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:922:3: (enumLiteral_1= 'moyen' )
                    {
                    // InternalTowerDefense.g:922:3: (enumLiteral_1= 'moyen' )
                    // InternalTowerDefense.g:923:4: enumLiteral_1= 'moyen'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:930:3: (enumLiteral_2= 'difficile' )
                    {
                    // InternalTowerDefense.g:930:3: (enumLiteral_2= 'difficile' )
                    // InternalTowerDefense.g:931:4: enumLiteral_2= 'difficile'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDifficulteAccess().getDifficileEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDifficulteAccess().getDifficileEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDifficulte"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000407A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000007C000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000010L});

}