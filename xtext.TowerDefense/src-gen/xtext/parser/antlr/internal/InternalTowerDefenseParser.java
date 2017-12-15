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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Jeu'", "'{'", "'}'", "'Partie'", "'infini'", "'Obstacle'", "'Campement'", "'PVmax'", "'PV'", "'PA'", "'Tactique'", "'Mobile'", "'F'", "'V'", "'NumVague'", "'In'", "'Out'", "'Projectile'", "'Portee'", "'Masse'", "'Vitesse'", "'Position'", "'Direction'", "'Degat'", "'NatureTerrain'", "'Volume'", "'Type'", "'FatigueEntree'", "'Niveau'", "'DureePauses'", "'Argent'", "'MobSortisMax'", "'Carte'", "'Vague'", "'Lignes'", "'Colonnes'", "'Cases'", "'Mobiles'", "'Obstacles'", "'Gain'", "'procheFirst'", "'faibleFirst'", "'fortFirst'", "'entree'", "'sortie'", "'chemin'", "'camp'", "'deco'", "'facile'", "'moyen'", "'difficile'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalTowerDefense.g:140:1: rulePartie returns [EObject current=null] : (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )* ( (lv_cartes_4_0= ruleCarte ) )* ( (lv_partieElements_5_0= rulePartieElement ) )* ( (lv_niveaux_6_0= ruleNiveau ) )* otherlv_7= '}' ) ;
    public final EObject rulePartie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_cases_3_0 = null;

        EObject lv_cartes_4_0 = null;

        EObject lv_partieElements_5_0 = null;

        EObject lv_niveaux_6_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:146:2: ( (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )* ( (lv_cartes_4_0= ruleCarte ) )* ( (lv_partieElements_5_0= rulePartieElement ) )* ( (lv_niveaux_6_0= ruleNiveau ) )* otherlv_7= '}' ) )
            // InternalTowerDefense.g:147:2: (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )* ( (lv_cartes_4_0= ruleCarte ) )* ( (lv_partieElements_5_0= rulePartieElement ) )* ( (lv_niveaux_6_0= ruleNiveau ) )* otherlv_7= '}' )
            {
            // InternalTowerDefense.g:147:2: (otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )* ( (lv_cartes_4_0= ruleCarte ) )* ( (lv_partieElements_5_0= rulePartieElement ) )* ( (lv_niveaux_6_0= ruleNiveau ) )* otherlv_7= '}' )
            // InternalTowerDefense.g:148:3: otherlv_0= 'Partie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )* ( (lv_cartes_4_0= ruleCarte ) )* ( (lv_partieElements_5_0= rulePartieElement ) )* ( (lv_niveaux_6_0= ruleNiveau ) )* otherlv_7= '}'
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
            		
            // InternalTowerDefense.g:174:3: ( (lv_cases_3_0= ruleCase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTowerDefense.g:175:4: (lv_cases_3_0= ruleCase )
            	    {
            	    // InternalTowerDefense.g:175:4: (lv_cases_3_0= ruleCase )
            	    // InternalTowerDefense.g:176:5: lv_cases_3_0= ruleCase
            	    {

            	    					newCompositeNode(grammarAccess.getPartieAccess().getCasesCaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_cases_3_0=ruleCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cases",
            	    						lv_cases_3_0,
            	    						"xtext.TowerDefense.Case");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTowerDefense.g:193:3: ( (lv_cartes_4_0= ruleCarte ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==43) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTowerDefense.g:194:4: (lv_cartes_4_0= ruleCarte )
            	    {
            	    // InternalTowerDefense.g:194:4: (lv_cartes_4_0= ruleCarte )
            	    // InternalTowerDefense.g:195:5: lv_cartes_4_0= ruleCarte
            	    {

            	    					newCompositeNode(grammarAccess.getPartieAccess().getCartesCarteParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_cartes_4_0=ruleCarte();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cartes",
            	    						lv_cartes_4_0,
            	    						"xtext.TowerDefense.Carte");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalTowerDefense.g:212:3: ( (lv_partieElements_5_0= rulePartieElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==22||LA4_0==28||LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTowerDefense.g:213:4: (lv_partieElements_5_0= rulePartieElement )
            	    {
            	    // InternalTowerDefense.g:213:4: (lv_partieElements_5_0= rulePartieElement )
            	    // InternalTowerDefense.g:214:5: lv_partieElements_5_0= rulePartieElement
            	    {

            	    					newCompositeNode(grammarAccess.getPartieAccess().getPartieElementsPartieElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_partieElements_5_0=rulePartieElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"partieElements",
            	    						lv_partieElements_5_0,
            	    						"xtext.TowerDefense.PartieElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalTowerDefense.g:231:3: ( (lv_niveaux_6_0= ruleNiveau ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==39) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTowerDefense.g:232:4: (lv_niveaux_6_0= ruleNiveau )
            	    {
            	    // InternalTowerDefense.g:232:4: (lv_niveaux_6_0= ruleNiveau )
            	    // InternalTowerDefense.g:233:5: lv_niveaux_6_0= ruleNiveau
            	    {

            	    					newCompositeNode(grammarAccess.getPartieAccess().getNiveauxNiveauParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_niveaux_6_0=ruleNiveau();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"niveaux",
            	    						lv_niveaux_6_0,
            	    						"xtext.TowerDefense.Niveau");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPartieAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalTowerDefense.g:258:1: entryRulePartieElement returns [EObject current=null] : iv_rulePartieElement= rulePartieElement EOF ;
    public final EObject entryRulePartieElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartieElement = null;


        try {
            // InternalTowerDefense.g:258:54: (iv_rulePartieElement= rulePartieElement EOF )
            // InternalTowerDefense.g:259:2: iv_rulePartieElement= rulePartieElement EOF
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
    // InternalTowerDefense.g:265:1: rulePartieElement returns [EObject current=null] : (this_Obstacle_0= ruleObstacle | this_Mobile_1= ruleMobile | this_Projectile_2= ruleProjectile | this_NatureTerrain_3= ruleNatureTerrain ) ;
    public final EObject rulePartieElement() throws RecognitionException {
        EObject current = null;

        EObject this_Obstacle_0 = null;

        EObject this_Mobile_1 = null;

        EObject this_Projectile_2 = null;

        EObject this_NatureTerrain_3 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:271:2: ( (this_Obstacle_0= ruleObstacle | this_Mobile_1= ruleMobile | this_Projectile_2= ruleProjectile | this_NatureTerrain_3= ruleNatureTerrain ) )
            // InternalTowerDefense.g:272:2: (this_Obstacle_0= ruleObstacle | this_Mobile_1= ruleMobile | this_Projectile_2= ruleProjectile | this_NatureTerrain_3= ruleNatureTerrain )
            {
            // InternalTowerDefense.g:272:2: (this_Obstacle_0= ruleObstacle | this_Mobile_1= ruleMobile | this_Projectile_2= ruleProjectile | this_NatureTerrain_3= ruleNatureTerrain )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 35:
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
                    // InternalTowerDefense.g:273:3: this_Obstacle_0= ruleObstacle
                    {

                    			newCompositeNode(grammarAccess.getPartieElementAccess().getObstacleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Obstacle_0=ruleObstacle();

                    state._fsp--;


                    			current = this_Obstacle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:282:3: this_Mobile_1= ruleMobile
                    {

                    			newCompositeNode(grammarAccess.getPartieElementAccess().getMobileParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mobile_1=ruleMobile();

                    state._fsp--;


                    			current = this_Mobile_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:291:3: this_Projectile_2= ruleProjectile
                    {

                    			newCompositeNode(grammarAccess.getPartieElementAccess().getProjectileParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Projectile_2=ruleProjectile();

                    state._fsp--;


                    			current = this_Projectile_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTowerDefense.g:300:3: this_NatureTerrain_3= ruleNatureTerrain
                    {

                    			newCompositeNode(grammarAccess.getPartieElementAccess().getNatureTerrainParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NatureTerrain_3=ruleNatureTerrain();

                    state._fsp--;


                    			current = this_NatureTerrain_3;
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
    // $ANTLR end "rulePartieElement"


    // $ANTLR start "entryRuleEnergie"
    // InternalTowerDefense.g:312:1: entryRuleEnergie returns [EObject current=null] : iv_ruleEnergie= ruleEnergie EOF ;
    public final EObject entryRuleEnergie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnergie = null;


        try {
            // InternalTowerDefense.g:312:48: (iv_ruleEnergie= ruleEnergie EOF )
            // InternalTowerDefense.g:313:2: iv_ruleEnergie= ruleEnergie EOF
            {
             newCompositeNode(grammarAccess.getEnergieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnergie=ruleEnergie();

            state._fsp--;

             current =iv_ruleEnergie; 
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
    // $ANTLR end "entryRuleEnergie"


    // $ANTLR start "ruleEnergie"
    // InternalTowerDefense.g:319:1: ruleEnergie returns [EObject current=null] : ( ( (lv_infini_0_0= 'infini' ) ) | ( (lv_valeur_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEnergie() throws RecognitionException {
        EObject current = null;

        Token lv_infini_0_0=null;
        Token lv_valeur_1_0=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:325:2: ( ( ( (lv_infini_0_0= 'infini' ) ) | ( (lv_valeur_1_0= RULE_INT ) ) ) )
            // InternalTowerDefense.g:326:2: ( ( (lv_infini_0_0= 'infini' ) ) | ( (lv_valeur_1_0= RULE_INT ) ) )
            {
            // InternalTowerDefense.g:326:2: ( ( (lv_infini_0_0= 'infini' ) ) | ( (lv_valeur_1_0= RULE_INT ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTowerDefense.g:327:3: ( (lv_infini_0_0= 'infini' ) )
                    {
                    // InternalTowerDefense.g:327:3: ( (lv_infini_0_0= 'infini' ) )
                    // InternalTowerDefense.g:328:4: (lv_infini_0_0= 'infini' )
                    {
                    // InternalTowerDefense.g:328:4: (lv_infini_0_0= 'infini' )
                    // InternalTowerDefense.g:329:5: lv_infini_0_0= 'infini'
                    {
                    lv_infini_0_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_infini_0_0, grammarAccess.getEnergieAccess().getInfiniInfiniKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnergieRule());
                    					}
                    					setWithLastConsumed(current, "infini", true, "infini");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:342:3: ( (lv_valeur_1_0= RULE_INT ) )
                    {
                    // InternalTowerDefense.g:342:3: ( (lv_valeur_1_0= RULE_INT ) )
                    // InternalTowerDefense.g:343:4: (lv_valeur_1_0= RULE_INT )
                    {
                    // InternalTowerDefense.g:343:4: (lv_valeur_1_0= RULE_INT )
                    // InternalTowerDefense.g:344:5: lv_valeur_1_0= RULE_INT
                    {
                    lv_valeur_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_valeur_1_0, grammarAccess.getEnergieAccess().getValeurINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnergieRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valeur",
                    						lv_valeur_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

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
    // $ANTLR end "ruleEnergie"


    // $ANTLR start "entryRuleObstacle"
    // InternalTowerDefense.g:364:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalTowerDefense.g:364:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalTowerDefense.g:365:2: iv_ruleObstacle= ruleObstacle EOF
            {
             newCompositeNode(grammarAccess.getObstacleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacle=ruleObstacle();

            state._fsp--;

             current =iv_ruleObstacle; 
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
    // $ANTLR end "entryRuleObstacle"


    // $ANTLR start "ruleObstacle"
    // InternalTowerDefense.g:371:1: ruleObstacle returns [EObject current=null] : (otherlv_0= 'Obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Campement' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'PVmax' ( (lv_quantiteEnergieMax_6_0= ruleEnergie ) ) otherlv_7= 'PV' ( (lv_quantiteEnergieCourant_8_0= ruleEnergie ) ) otherlv_9= 'PA' ( (lv_pontsAction_10_0= ruleEnergie ) ) otherlv_11= 'Tactique' ( (lv_tactique_12_0= ruleTactiqueType ) ) otherlv_13= '}' ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_quantiteEnergieMax_6_0 = null;

        EObject lv_quantiteEnergieCourant_8_0 = null;

        EObject lv_pontsAction_10_0 = null;

        Enumerator lv_tactique_12_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:377:2: ( (otherlv_0= 'Obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Campement' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'PVmax' ( (lv_quantiteEnergieMax_6_0= ruleEnergie ) ) otherlv_7= 'PV' ( (lv_quantiteEnergieCourant_8_0= ruleEnergie ) ) otherlv_9= 'PA' ( (lv_pontsAction_10_0= ruleEnergie ) ) otherlv_11= 'Tactique' ( (lv_tactique_12_0= ruleTactiqueType ) ) otherlv_13= '}' ) )
            // InternalTowerDefense.g:378:2: (otherlv_0= 'Obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Campement' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'PVmax' ( (lv_quantiteEnergieMax_6_0= ruleEnergie ) ) otherlv_7= 'PV' ( (lv_quantiteEnergieCourant_8_0= ruleEnergie ) ) otherlv_9= 'PA' ( (lv_pontsAction_10_0= ruleEnergie ) ) otherlv_11= 'Tactique' ( (lv_tactique_12_0= ruleTactiqueType ) ) otherlv_13= '}' )
            {
            // InternalTowerDefense.g:378:2: (otherlv_0= 'Obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Campement' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'PVmax' ( (lv_quantiteEnergieMax_6_0= ruleEnergie ) ) otherlv_7= 'PV' ( (lv_quantiteEnergieCourant_8_0= ruleEnergie ) ) otherlv_9= 'PA' ( (lv_pontsAction_10_0= ruleEnergie ) ) otherlv_11= 'Tactique' ( (lv_tactique_12_0= ruleTactiqueType ) ) otherlv_13= '}' )
            // InternalTowerDefense.g:379:3: otherlv_0= 'Obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Campement' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'PVmax' ( (lv_quantiteEnergieMax_6_0= ruleEnergie ) ) otherlv_7= 'PV' ( (lv_quantiteEnergieCourant_8_0= ruleEnergie ) ) otherlv_9= 'PA' ( (lv_pontsAction_10_0= ruleEnergie ) ) otherlv_11= 'Tactique' ( (lv_tactique_12_0= ruleTactiqueType ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObstacleAccess().getObstacleKeyword_0());
            		
            // InternalTowerDefense.g:383:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:384:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:384:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:385:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObstacleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleAccess().getCampementKeyword_3());
            		
            // InternalTowerDefense.g:409:3: ( (otherlv_4= RULE_ID ) )
            // InternalTowerDefense.g:410:4: (otherlv_4= RULE_ID )
            {
            // InternalTowerDefense.g:410:4: (otherlv_4= RULE_ID )
            // InternalTowerDefense.g:411:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getObstacleAccess().getCampementCaseCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getObstacleAccess().getPVmaxKeyword_5());
            		
            // InternalTowerDefense.g:426:3: ( (lv_quantiteEnergieMax_6_0= ruleEnergie ) )
            // InternalTowerDefense.g:427:4: (lv_quantiteEnergieMax_6_0= ruleEnergie )
            {
            // InternalTowerDefense.g:427:4: (lv_quantiteEnergieMax_6_0= ruleEnergie )
            // InternalTowerDefense.g:428:5: lv_quantiteEnergieMax_6_0= ruleEnergie
            {

            					newCompositeNode(grammarAccess.getObstacleAccess().getQuantiteEnergieMaxEnergieParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_quantiteEnergieMax_6_0=ruleEnergie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObstacleRule());
            					}
            					set(
            						current,
            						"quantiteEnergieMax",
            						lv_quantiteEnergieMax_6_0,
            						"xtext.TowerDefense.Energie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getObstacleAccess().getPVKeyword_7());
            		
            // InternalTowerDefense.g:449:3: ( (lv_quantiteEnergieCourant_8_0= ruleEnergie ) )
            // InternalTowerDefense.g:450:4: (lv_quantiteEnergieCourant_8_0= ruleEnergie )
            {
            // InternalTowerDefense.g:450:4: (lv_quantiteEnergieCourant_8_0= ruleEnergie )
            // InternalTowerDefense.g:451:5: lv_quantiteEnergieCourant_8_0= ruleEnergie
            {

            					newCompositeNode(grammarAccess.getObstacleAccess().getQuantiteEnergieCourantEnergieParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_quantiteEnergieCourant_8_0=ruleEnergie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObstacleRule());
            					}
            					set(
            						current,
            						"quantiteEnergieCourant",
            						lv_quantiteEnergieCourant_8_0,
            						"xtext.TowerDefense.Energie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getObstacleAccess().getPAKeyword_9());
            		
            // InternalTowerDefense.g:472:3: ( (lv_pontsAction_10_0= ruleEnergie ) )
            // InternalTowerDefense.g:473:4: (lv_pontsAction_10_0= ruleEnergie )
            {
            // InternalTowerDefense.g:473:4: (lv_pontsAction_10_0= ruleEnergie )
            // InternalTowerDefense.g:474:5: lv_pontsAction_10_0= ruleEnergie
            {

            					newCompositeNode(grammarAccess.getObstacleAccess().getPontsActionEnergieParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_15);
            lv_pontsAction_10_0=ruleEnergie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObstacleRule());
            					}
            					set(
            						current,
            						"pontsAction",
            						lv_pontsAction_10_0,
            						"xtext.TowerDefense.Energie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getObstacleAccess().getTactiqueKeyword_11());
            		
            // InternalTowerDefense.g:495:3: ( (lv_tactique_12_0= ruleTactiqueType ) )
            // InternalTowerDefense.g:496:4: (lv_tactique_12_0= ruleTactiqueType )
            {
            // InternalTowerDefense.g:496:4: (lv_tactique_12_0= ruleTactiqueType )
            // InternalTowerDefense.g:497:5: lv_tactique_12_0= ruleTactiqueType
            {

            					newCompositeNode(grammarAccess.getObstacleAccess().getTactiqueTactiqueTypeEnumRuleCall_12_0());
            				
            pushFollow(FOLLOW_17);
            lv_tactique_12_0=ruleTactiqueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObstacleRule());
            					}
            					set(
            						current,
            						"tactique",
            						lv_tactique_12_0,
            						"xtext.TowerDefense.TactiqueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getObstacleAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleObstacle"


    // $ANTLR start "entryRuleMobile"
    // InternalTowerDefense.g:522:1: entryRuleMobile returns [EObject current=null] : iv_ruleMobile= ruleMobile EOF ;
    public final EObject entryRuleMobile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobile = null;


        try {
            // InternalTowerDefense.g:522:47: (iv_ruleMobile= ruleMobile EOF )
            // InternalTowerDefense.g:523:2: iv_ruleMobile= ruleMobile EOF
            {
             newCompositeNode(grammarAccess.getMobileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobile=ruleMobile();

            state._fsp--;

             current =iv_ruleMobile; 
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
    // $ANTLR end "entryRuleMobile"


    // $ANTLR start "ruleMobile"
    // InternalTowerDefense.g:529:1: ruleMobile returns [EObject current=null] : (otherlv_0= 'Mobile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'F' ( (lv_force_4_0= RULE_INT ) ) otherlv_5= 'V' ( (lv_volume_6_0= RULE_INT ) ) otherlv_7= 'NumVague' ( (lv_numVague_8_0= RULE_INT ) ) otherlv_9= 'In' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Out' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'PVmax' ( (lv_quantiteEnergieMax_14_0= ruleEnergie ) ) otherlv_15= 'PV' ( (lv_quantiteEnergieCourant_16_0= ruleEnergie ) ) otherlv_17= 'PA' ( (lv_pointsAction_18_0= ruleEnergie ) ) otherlv_19= 'Tactique' ( (lv_tactique_20_0= ruleTactiqueType ) ) otherlv_21= '}' ) ;
    public final EObject ruleMobile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_force_4_0=null;
        Token otherlv_5=null;
        Token lv_volume_6_0=null;
        Token otherlv_7=null;
        Token lv_numVague_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_quantiteEnergieMax_14_0 = null;

        EObject lv_quantiteEnergieCourant_16_0 = null;

        EObject lv_pointsAction_18_0 = null;

        Enumerator lv_tactique_20_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:535:2: ( (otherlv_0= 'Mobile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'F' ( (lv_force_4_0= RULE_INT ) ) otherlv_5= 'V' ( (lv_volume_6_0= RULE_INT ) ) otherlv_7= 'NumVague' ( (lv_numVague_8_0= RULE_INT ) ) otherlv_9= 'In' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Out' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'PVmax' ( (lv_quantiteEnergieMax_14_0= ruleEnergie ) ) otherlv_15= 'PV' ( (lv_quantiteEnergieCourant_16_0= ruleEnergie ) ) otherlv_17= 'PA' ( (lv_pointsAction_18_0= ruleEnergie ) ) otherlv_19= 'Tactique' ( (lv_tactique_20_0= ruleTactiqueType ) ) otherlv_21= '}' ) )
            // InternalTowerDefense.g:536:2: (otherlv_0= 'Mobile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'F' ( (lv_force_4_0= RULE_INT ) ) otherlv_5= 'V' ( (lv_volume_6_0= RULE_INT ) ) otherlv_7= 'NumVague' ( (lv_numVague_8_0= RULE_INT ) ) otherlv_9= 'In' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Out' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'PVmax' ( (lv_quantiteEnergieMax_14_0= ruleEnergie ) ) otherlv_15= 'PV' ( (lv_quantiteEnergieCourant_16_0= ruleEnergie ) ) otherlv_17= 'PA' ( (lv_pointsAction_18_0= ruleEnergie ) ) otherlv_19= 'Tactique' ( (lv_tactique_20_0= ruleTactiqueType ) ) otherlv_21= '}' )
            {
            // InternalTowerDefense.g:536:2: (otherlv_0= 'Mobile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'F' ( (lv_force_4_0= RULE_INT ) ) otherlv_5= 'V' ( (lv_volume_6_0= RULE_INT ) ) otherlv_7= 'NumVague' ( (lv_numVague_8_0= RULE_INT ) ) otherlv_9= 'In' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Out' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'PVmax' ( (lv_quantiteEnergieMax_14_0= ruleEnergie ) ) otherlv_15= 'PV' ( (lv_quantiteEnergieCourant_16_0= ruleEnergie ) ) otherlv_17= 'PA' ( (lv_pointsAction_18_0= ruleEnergie ) ) otherlv_19= 'Tactique' ( (lv_tactique_20_0= ruleTactiqueType ) ) otherlv_21= '}' )
            // InternalTowerDefense.g:537:3: otherlv_0= 'Mobile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'F' ( (lv_force_4_0= RULE_INT ) ) otherlv_5= 'V' ( (lv_volume_6_0= RULE_INT ) ) otherlv_7= 'NumVague' ( (lv_numVague_8_0= RULE_INT ) ) otherlv_9= 'In' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Out' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'PVmax' ( (lv_quantiteEnergieMax_14_0= ruleEnergie ) ) otherlv_15= 'PV' ( (lv_quantiteEnergieCourant_16_0= ruleEnergie ) ) otherlv_17= 'PA' ( (lv_pointsAction_18_0= ruleEnergie ) ) otherlv_19= 'Tactique' ( (lv_tactique_20_0= ruleTactiqueType ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobileAccess().getMobileKeyword_0());
            		
            // InternalTowerDefense.g:541:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:542:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:542:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:543:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMobileAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getMobileAccess().getFKeyword_3());
            		
            // InternalTowerDefense.g:567:3: ( (lv_force_4_0= RULE_INT ) )
            // InternalTowerDefense.g:568:4: (lv_force_4_0= RULE_INT )
            {
            // InternalTowerDefense.g:568:4: (lv_force_4_0= RULE_INT )
            // InternalTowerDefense.g:569:5: lv_force_4_0= RULE_INT
            {
            lv_force_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_force_4_0, grammarAccess.getMobileAccess().getForceINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"force",
            						lv_force_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getMobileAccess().getVKeyword_5());
            		
            // InternalTowerDefense.g:589:3: ( (lv_volume_6_0= RULE_INT ) )
            // InternalTowerDefense.g:590:4: (lv_volume_6_0= RULE_INT )
            {
            // InternalTowerDefense.g:590:4: (lv_volume_6_0= RULE_INT )
            // InternalTowerDefense.g:591:5: lv_volume_6_0= RULE_INT
            {
            lv_volume_6_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_volume_6_0, grammarAccess.getMobileAccess().getVolumeINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"volume",
            						lv_volume_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getMobileAccess().getNumVagueKeyword_7());
            		
            // InternalTowerDefense.g:611:3: ( (lv_numVague_8_0= RULE_INT ) )
            // InternalTowerDefense.g:612:4: (lv_numVague_8_0= RULE_INT )
            {
            // InternalTowerDefense.g:612:4: (lv_numVague_8_0= RULE_INT )
            // InternalTowerDefense.g:613:5: lv_numVague_8_0= RULE_INT
            {
            lv_numVague_8_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_numVague_8_0, grammarAccess.getMobileAccess().getNumVagueINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numVague",
            						lv_numVague_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMobileAccess().getInKeyword_9());
            		
            // InternalTowerDefense.g:633:3: ( (otherlv_10= RULE_ID ) )
            // InternalTowerDefense.g:634:4: (otherlv_10= RULE_ID )
            {
            // InternalTowerDefense.g:634:4: (otherlv_10= RULE_ID )
            // InternalTowerDefense.g:635:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobileRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_10, grammarAccess.getMobileAccess().getCaseEntreeCaseCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getMobileAccess().getOutKeyword_11());
            		
            // InternalTowerDefense.g:650:3: ( (otherlv_12= RULE_ID ) )
            // InternalTowerDefense.g:651:4: (otherlv_12= RULE_ID )
            {
            // InternalTowerDefense.g:651:4: (otherlv_12= RULE_ID )
            // InternalTowerDefense.g:652:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobileRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_12, grammarAccess.getMobileAccess().getCaseSortieCaseCrossReference_12_0());
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getMobileAccess().getPVmaxKeyword_13());
            		
            // InternalTowerDefense.g:667:3: ( (lv_quantiteEnergieMax_14_0= ruleEnergie ) )
            // InternalTowerDefense.g:668:4: (lv_quantiteEnergieMax_14_0= ruleEnergie )
            {
            // InternalTowerDefense.g:668:4: (lv_quantiteEnergieMax_14_0= ruleEnergie )
            // InternalTowerDefense.g:669:5: lv_quantiteEnergieMax_14_0= ruleEnergie
            {

            					newCompositeNode(grammarAccess.getMobileAccess().getQuantiteEnergieMaxEnergieParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_13);
            lv_quantiteEnergieMax_14_0=ruleEnergie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMobileRule());
            					}
            					set(
            						current,
            						"quantiteEnergieMax",
            						lv_quantiteEnergieMax_14_0,
            						"xtext.TowerDefense.Energie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getMobileAccess().getPVKeyword_15());
            		
            // InternalTowerDefense.g:690:3: ( (lv_quantiteEnergieCourant_16_0= ruleEnergie ) )
            // InternalTowerDefense.g:691:4: (lv_quantiteEnergieCourant_16_0= ruleEnergie )
            {
            // InternalTowerDefense.g:691:4: (lv_quantiteEnergieCourant_16_0= ruleEnergie )
            // InternalTowerDefense.g:692:5: lv_quantiteEnergieCourant_16_0= ruleEnergie
            {

            					newCompositeNode(grammarAccess.getMobileAccess().getQuantiteEnergieCourantEnergieParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_14);
            lv_quantiteEnergieCourant_16_0=ruleEnergie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMobileRule());
            					}
            					set(
            						current,
            						"quantiteEnergieCourant",
            						lv_quantiteEnergieCourant_16_0,
            						"xtext.TowerDefense.Energie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getMobileAccess().getPAKeyword_17());
            		
            // InternalTowerDefense.g:713:3: ( (lv_pointsAction_18_0= ruleEnergie ) )
            // InternalTowerDefense.g:714:4: (lv_pointsAction_18_0= ruleEnergie )
            {
            // InternalTowerDefense.g:714:4: (lv_pointsAction_18_0= ruleEnergie )
            // InternalTowerDefense.g:715:5: lv_pointsAction_18_0= ruleEnergie
            {

            					newCompositeNode(grammarAccess.getMobileAccess().getPointsActionEnergieParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_15);
            lv_pointsAction_18_0=ruleEnergie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMobileRule());
            					}
            					set(
            						current,
            						"pointsAction",
            						lv_pointsAction_18_0,
            						"xtext.TowerDefense.Energie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_19, grammarAccess.getMobileAccess().getTactiqueKeyword_19());
            		
            // InternalTowerDefense.g:736:3: ( (lv_tactique_20_0= ruleTactiqueType ) )
            // InternalTowerDefense.g:737:4: (lv_tactique_20_0= ruleTactiqueType )
            {
            // InternalTowerDefense.g:737:4: (lv_tactique_20_0= ruleTactiqueType )
            // InternalTowerDefense.g:738:5: lv_tactique_20_0= ruleTactiqueType
            {

            					newCompositeNode(grammarAccess.getMobileAccess().getTactiqueTactiqueTypeEnumRuleCall_20_0());
            				
            pushFollow(FOLLOW_17);
            lv_tactique_20_0=ruleTactiqueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMobileRule());
            					}
            					set(
            						current,
            						"tactique",
            						lv_tactique_20_0,
            						"xtext.TowerDefense.TactiqueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getMobileAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleMobile"


    // $ANTLR start "entryRuleProjectile"
    // InternalTowerDefense.g:763:1: entryRuleProjectile returns [EObject current=null] : iv_ruleProjectile= ruleProjectile EOF ;
    public final EObject entryRuleProjectile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectile = null;


        try {
            // InternalTowerDefense.g:763:51: (iv_ruleProjectile= ruleProjectile EOF )
            // InternalTowerDefense.g:764:2: iv_ruleProjectile= ruleProjectile EOF
            {
             newCompositeNode(grammarAccess.getProjectileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectile=ruleProjectile();

            state._fsp--;

             current =iv_ruleProjectile; 
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
    // $ANTLR end "entryRuleProjectile"


    // $ANTLR start "ruleProjectile"
    // InternalTowerDefense.g:770:1: ruleProjectile returns [EObject current=null] : (otherlv_0= 'Projectile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Portee' ( (lv_portee_4_0= RULE_INT ) ) otherlv_5= 'Masse' ( (lv_masse_6_0= RULE_INT ) ) otherlv_7= 'Vitesse' ( (lv_vitesse_8_0= RULE_INT ) ) otherlv_9= 'Position' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Direction' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Degat' ( (lv_degat_14_0= ruleEnergie ) ) otherlv_15= '}' ) ;
    public final EObject ruleProjectile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_portee_4_0=null;
        Token otherlv_5=null;
        Token lv_masse_6_0=null;
        Token otherlv_7=null;
        Token lv_vitesse_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_degat_14_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:776:2: ( (otherlv_0= 'Projectile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Portee' ( (lv_portee_4_0= RULE_INT ) ) otherlv_5= 'Masse' ( (lv_masse_6_0= RULE_INT ) ) otherlv_7= 'Vitesse' ( (lv_vitesse_8_0= RULE_INT ) ) otherlv_9= 'Position' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Direction' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Degat' ( (lv_degat_14_0= ruleEnergie ) ) otherlv_15= '}' ) )
            // InternalTowerDefense.g:777:2: (otherlv_0= 'Projectile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Portee' ( (lv_portee_4_0= RULE_INT ) ) otherlv_5= 'Masse' ( (lv_masse_6_0= RULE_INT ) ) otherlv_7= 'Vitesse' ( (lv_vitesse_8_0= RULE_INT ) ) otherlv_9= 'Position' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Direction' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Degat' ( (lv_degat_14_0= ruleEnergie ) ) otherlv_15= '}' )
            {
            // InternalTowerDefense.g:777:2: (otherlv_0= 'Projectile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Portee' ( (lv_portee_4_0= RULE_INT ) ) otherlv_5= 'Masse' ( (lv_masse_6_0= RULE_INT ) ) otherlv_7= 'Vitesse' ( (lv_vitesse_8_0= RULE_INT ) ) otherlv_9= 'Position' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Direction' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Degat' ( (lv_degat_14_0= ruleEnergie ) ) otherlv_15= '}' )
            // InternalTowerDefense.g:778:3: otherlv_0= 'Projectile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Portee' ( (lv_portee_4_0= RULE_INT ) ) otherlv_5= 'Masse' ( (lv_masse_6_0= RULE_INT ) ) otherlv_7= 'Vitesse' ( (lv_vitesse_8_0= RULE_INT ) ) otherlv_9= 'Position' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Direction' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Degat' ( (lv_degat_14_0= ruleEnergie ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectileAccess().getProjectileKeyword_0());
            		
            // InternalTowerDefense.g:782:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:783:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:783:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:784:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectileAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectileAccess().getPorteeKeyword_3());
            		
            // InternalTowerDefense.g:808:3: ( (lv_portee_4_0= RULE_INT ) )
            // InternalTowerDefense.g:809:4: (lv_portee_4_0= RULE_INT )
            {
            // InternalTowerDefense.g:809:4: (lv_portee_4_0= RULE_INT )
            // InternalTowerDefense.g:810:5: lv_portee_4_0= RULE_INT
            {
            lv_portee_4_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_portee_4_0, grammarAccess.getProjectileAccess().getPorteeINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portee",
            						lv_portee_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectileAccess().getMasseKeyword_5());
            		
            // InternalTowerDefense.g:830:3: ( (lv_masse_6_0= RULE_INT ) )
            // InternalTowerDefense.g:831:4: (lv_masse_6_0= RULE_INT )
            {
            // InternalTowerDefense.g:831:4: (lv_masse_6_0= RULE_INT )
            // InternalTowerDefense.g:832:5: lv_masse_6_0= RULE_INT
            {
            lv_masse_6_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_masse_6_0, grammarAccess.getProjectileAccess().getMasseINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"masse",
            						lv_masse_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectileAccess().getVitesseKeyword_7());
            		
            // InternalTowerDefense.g:852:3: ( (lv_vitesse_8_0= RULE_INT ) )
            // InternalTowerDefense.g:853:4: (lv_vitesse_8_0= RULE_INT )
            {
            // InternalTowerDefense.g:853:4: (lv_vitesse_8_0= RULE_INT )
            // InternalTowerDefense.g:854:5: lv_vitesse_8_0= RULE_INT
            {
            lv_vitesse_8_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_vitesse_8_0, grammarAccess.getProjectileAccess().getVitesseINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vitesse",
            						lv_vitesse_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getProjectileAccess().getPositionKeyword_9());
            		
            // InternalTowerDefense.g:874:3: ( (otherlv_10= RULE_ID ) )
            // InternalTowerDefense.g:875:4: (otherlv_10= RULE_ID )
            {
            // InternalTowerDefense.g:875:4: (otherlv_10= RULE_ID )
            // InternalTowerDefense.g:876:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectileRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_10, grammarAccess.getProjectileAccess().getCaseCaseCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getProjectileAccess().getDirectionKeyword_11());
            		
            // InternalTowerDefense.g:891:3: ( (otherlv_12= RULE_ID ) )
            // InternalTowerDefense.g:892:4: (otherlv_12= RULE_ID )
            {
            // InternalTowerDefense.g:892:4: (otherlv_12= RULE_ID )
            // InternalTowerDefense.g:893:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectileRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_12, grammarAccess.getProjectileAccess().getCibleCaseCrossReference_12_0());
            				

            }


            }

            otherlv_13=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getProjectileAccess().getDegatKeyword_13());
            		
            // InternalTowerDefense.g:908:3: ( (lv_degat_14_0= ruleEnergie ) )
            // InternalTowerDefense.g:909:4: (lv_degat_14_0= ruleEnergie )
            {
            // InternalTowerDefense.g:909:4: (lv_degat_14_0= ruleEnergie )
            // InternalTowerDefense.g:910:5: lv_degat_14_0= ruleEnergie
            {

            					newCompositeNode(grammarAccess.getProjectileAccess().getDegatEnergieParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_17);
            lv_degat_14_0=ruleEnergie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectileRule());
            					}
            					set(
            						current,
            						"degat",
            						lv_degat_14_0,
            						"xtext.TowerDefense.Energie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getProjectileAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleProjectile"


    // $ANTLR start "entryRuleNatureTerrain"
    // InternalTowerDefense.g:935:1: entryRuleNatureTerrain returns [EObject current=null] : iv_ruleNatureTerrain= ruleNatureTerrain EOF ;
    public final EObject entryRuleNatureTerrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNatureTerrain = null;


        try {
            // InternalTowerDefense.g:935:54: (iv_ruleNatureTerrain= ruleNatureTerrain EOF )
            // InternalTowerDefense.g:936:2: iv_ruleNatureTerrain= ruleNatureTerrain EOF
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
    // InternalTowerDefense.g:942:1: ruleNatureTerrain returns [EObject current=null] : (otherlv_0= 'NatureTerrain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Volume' ( (lv_volume_4_0= RULE_INT ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleTYPE_TERRAIN ) ) otherlv_7= 'FatigueEntree' ( (lv_fatigue_8_0= ruleEnergie ) ) otherlv_9= '}' ) ;
    public final EObject ruleNatureTerrain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_volume_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_type_6_0 = null;

        EObject lv_fatigue_8_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:948:2: ( (otherlv_0= 'NatureTerrain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Volume' ( (lv_volume_4_0= RULE_INT ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleTYPE_TERRAIN ) ) otherlv_7= 'FatigueEntree' ( (lv_fatigue_8_0= ruleEnergie ) ) otherlv_9= '}' ) )
            // InternalTowerDefense.g:949:2: (otherlv_0= 'NatureTerrain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Volume' ( (lv_volume_4_0= RULE_INT ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleTYPE_TERRAIN ) ) otherlv_7= 'FatigueEntree' ( (lv_fatigue_8_0= ruleEnergie ) ) otherlv_9= '}' )
            {
            // InternalTowerDefense.g:949:2: (otherlv_0= 'NatureTerrain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Volume' ( (lv_volume_4_0= RULE_INT ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleTYPE_TERRAIN ) ) otherlv_7= 'FatigueEntree' ( (lv_fatigue_8_0= ruleEnergie ) ) otherlv_9= '}' )
            // InternalTowerDefense.g:950:3: otherlv_0= 'NatureTerrain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Volume' ( (lv_volume_4_0= RULE_INT ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleTYPE_TERRAIN ) ) otherlv_7= 'FatigueEntree' ( (lv_fatigue_8_0= ruleEnergie ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNatureTerrainAccess().getNatureTerrainKeyword_0());
            		
            // InternalTowerDefense.g:954:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:955:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:955:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:956:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNatureTerrainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNatureTerrainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getNatureTerrainAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getNatureTerrainAccess().getVolumeKeyword_3());
            		
            // InternalTowerDefense.g:980:3: ( (lv_volume_4_0= RULE_INT ) )
            // InternalTowerDefense.g:981:4: (lv_volume_4_0= RULE_INT )
            {
            // InternalTowerDefense.g:981:4: (lv_volume_4_0= RULE_INT )
            // InternalTowerDefense.g:982:5: lv_volume_4_0= RULE_INT
            {
            lv_volume_4_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            					newLeafNode(lv_volume_4_0, grammarAccess.getNatureTerrainAccess().getVolumeINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNatureTerrainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"volume",
            						lv_volume_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getNatureTerrainAccess().getTypeKeyword_5());
            		
            // InternalTowerDefense.g:1002:3: ( (lv_type_6_0= ruleTYPE_TERRAIN ) )
            // InternalTowerDefense.g:1003:4: (lv_type_6_0= ruleTYPE_TERRAIN )
            {
            // InternalTowerDefense.g:1003:4: (lv_type_6_0= ruleTYPE_TERRAIN )
            // InternalTowerDefense.g:1004:5: lv_type_6_0= ruleTYPE_TERRAIN
            {

            					newCompositeNode(grammarAccess.getNatureTerrainAccess().getTypeTYPE_TERRAINEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_type_6_0=ruleTYPE_TERRAIN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNatureTerrainRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"xtext.TowerDefense.TYPE_TERRAIN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getNatureTerrainAccess().getFatigueEntreeKeyword_7());
            		
            // InternalTowerDefense.g:1025:3: ( (lv_fatigue_8_0= ruleEnergie ) )
            // InternalTowerDefense.g:1026:4: (lv_fatigue_8_0= ruleEnergie )
            {
            // InternalTowerDefense.g:1026:4: (lv_fatigue_8_0= ruleEnergie )
            // InternalTowerDefense.g:1027:5: lv_fatigue_8_0= ruleEnergie
            {

            					newCompositeNode(grammarAccess.getNatureTerrainAccess().getFatigueEnergieParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_fatigue_8_0=ruleEnergie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNatureTerrainRule());
            					}
            					set(
            						current,
            						"fatigue",
            						lv_fatigue_8_0,
            						"xtext.TowerDefense.Energie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNatureTerrainAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalTowerDefense.g:1052:1: entryRuleNiveau returns [EObject current=null] : iv_ruleNiveau= ruleNiveau EOF ;
    public final EObject entryRuleNiveau() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNiveau = null;


        try {
            // InternalTowerDefense.g:1052:47: (iv_ruleNiveau= ruleNiveau EOF )
            // InternalTowerDefense.g:1053:2: iv_ruleNiveau= ruleNiveau EOF
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
    // InternalTowerDefense.g:1059:1: ruleNiveau returns [EObject current=null] : (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) ( (lv_difficulte_2_0= ruleDifficulte ) ) otherlv_3= '{' otherlv_4= 'DureePauses' ( (lv_dureePause_5_0= RULE_INT ) ) otherlv_6= 'Argent' ( (lv_argent_7_0= RULE_INT ) ) otherlv_8= 'MobSortisMax' ( (lv_mobSortisLimite_9_0= RULE_INT ) ) otherlv_10= 'Carte' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}' ) ;
    public final EObject ruleNiveau() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_dureePause_5_0=null;
        Token otherlv_6=null;
        Token lv_argent_7_0=null;
        Token otherlv_8=null;
        Token lv_mobSortisLimite_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_difficulte_2_0 = null;

        EObject lv_vagues_13_0 = null;



        	enterRule();

        try {
            // InternalTowerDefense.g:1065:2: ( (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) ( (lv_difficulte_2_0= ruleDifficulte ) ) otherlv_3= '{' otherlv_4= 'DureePauses' ( (lv_dureePause_5_0= RULE_INT ) ) otherlv_6= 'Argent' ( (lv_argent_7_0= RULE_INT ) ) otherlv_8= 'MobSortisMax' ( (lv_mobSortisLimite_9_0= RULE_INT ) ) otherlv_10= 'Carte' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}' ) )
            // InternalTowerDefense.g:1066:2: (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) ( (lv_difficulte_2_0= ruleDifficulte ) ) otherlv_3= '{' otherlv_4= 'DureePauses' ( (lv_dureePause_5_0= RULE_INT ) ) otherlv_6= 'Argent' ( (lv_argent_7_0= RULE_INT ) ) otherlv_8= 'MobSortisMax' ( (lv_mobSortisLimite_9_0= RULE_INT ) ) otherlv_10= 'Carte' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}' )
            {
            // InternalTowerDefense.g:1066:2: (otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) ( (lv_difficulte_2_0= ruleDifficulte ) ) otherlv_3= '{' otherlv_4= 'DureePauses' ( (lv_dureePause_5_0= RULE_INT ) ) otherlv_6= 'Argent' ( (lv_argent_7_0= RULE_INT ) ) otherlv_8= 'MobSortisMax' ( (lv_mobSortisLimite_9_0= RULE_INT ) ) otherlv_10= 'Carte' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}' )
            // InternalTowerDefense.g:1067:3: otherlv_0= 'Niveau' ( (lv_name_1_0= RULE_ID ) ) ( (lv_difficulte_2_0= ruleDifficulte ) ) otherlv_3= '{' otherlv_4= 'DureePauses' ( (lv_dureePause_5_0= RULE_INT ) ) otherlv_6= 'Argent' ( (lv_argent_7_0= RULE_INT ) ) otherlv_8= 'MobSortisMax' ( (lv_mobSortisLimite_9_0= RULE_INT ) ) otherlv_10= 'Carte' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'Vague' ( (lv_vagues_13_0= ruleVague ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNiveauAccess().getNiveauKeyword_0());
            		
            // InternalTowerDefense.g:1071:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:1072:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:1072:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:1073:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            // InternalTowerDefense.g:1089:3: ( (lv_difficulte_2_0= ruleDifficulte ) )
            // InternalTowerDefense.g:1090:4: (lv_difficulte_2_0= ruleDifficulte )
            {
            // InternalTowerDefense.g:1090:4: (lv_difficulte_2_0= ruleDifficulte )
            // InternalTowerDefense.g:1091:5: lv_difficulte_2_0= ruleDifficulte
            {

            					newCompositeNode(grammarAccess.getNiveauAccess().getDifficulteDifficulteEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_difficulte_2_0=ruleDifficulte();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNiveauRule());
            					}
            					set(
            						current,
            						"difficulte",
            						lv_difficulte_2_0,
            						"xtext.TowerDefense.Difficulte");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,40,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getNiveauAccess().getDureePausesKeyword_4());
            		
            // InternalTowerDefense.g:1116:3: ( (lv_dureePause_5_0= RULE_INT ) )
            // InternalTowerDefense.g:1117:4: (lv_dureePause_5_0= RULE_INT )
            {
            // InternalTowerDefense.g:1117:4: (lv_dureePause_5_0= RULE_INT )
            // InternalTowerDefense.g:1118:5: lv_dureePause_5_0= RULE_INT
            {
            lv_dureePause_5_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            					newLeafNode(lv_dureePause_5_0, grammarAccess.getNiveauAccess().getDureePauseINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNiveauRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dureePause",
            						lv_dureePause_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getNiveauAccess().getArgentKeyword_6());
            		
            // InternalTowerDefense.g:1138:3: ( (lv_argent_7_0= RULE_INT ) )
            // InternalTowerDefense.g:1139:4: (lv_argent_7_0= RULE_INT )
            {
            // InternalTowerDefense.g:1139:4: (lv_argent_7_0= RULE_INT )
            // InternalTowerDefense.g:1140:5: lv_argent_7_0= RULE_INT
            {
            lv_argent_7_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            					newLeafNode(lv_argent_7_0, grammarAccess.getNiveauAccess().getArgentINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNiveauRule());
            					}
            					setWithLastConsumed(
            						current,
            						"argent",
            						lv_argent_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getNiveauAccess().getMobSortisMaxKeyword_8());
            		
            // InternalTowerDefense.g:1160:3: ( (lv_mobSortisLimite_9_0= RULE_INT ) )
            // InternalTowerDefense.g:1161:4: (lv_mobSortisLimite_9_0= RULE_INT )
            {
            // InternalTowerDefense.g:1161:4: (lv_mobSortisLimite_9_0= RULE_INT )
            // InternalTowerDefense.g:1162:5: lv_mobSortisLimite_9_0= RULE_INT
            {
            lv_mobSortisLimite_9_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_mobSortisLimite_9_0, grammarAccess.getNiveauAccess().getMobSortisLimiteINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNiveauRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mobSortisLimite",
            						lv_mobSortisLimite_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getNiveauAccess().getCarteKeyword_10());
            		
            // InternalTowerDefense.g:1182:3: ( (otherlv_11= RULE_ID ) )
            // InternalTowerDefense.g:1183:4: (otherlv_11= RULE_ID )
            {
            // InternalTowerDefense.g:1183:4: (otherlv_11= RULE_ID )
            // InternalTowerDefense.g:1184:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNiveauRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_11, grammarAccess.getNiveauAccess().getCarteCarteCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getNiveauAccess().getVagueKeyword_12());
            		
            // InternalTowerDefense.g:1199:3: ( (lv_vagues_13_0= ruleVague ) )
            // InternalTowerDefense.g:1200:4: (lv_vagues_13_0= ruleVague )
            {
            // InternalTowerDefense.g:1200:4: (lv_vagues_13_0= ruleVague )
            // InternalTowerDefense.g:1201:5: lv_vagues_13_0= ruleVague
            {

            					newCompositeNode(grammarAccess.getNiveauAccess().getVaguesVagueParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_17);
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


    // $ANTLR start "entryRuleCarte"
    // InternalTowerDefense.g:1226:1: entryRuleCarte returns [EObject current=null] : iv_ruleCarte= ruleCarte EOF ;
    public final EObject entryRuleCarte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarte = null;


        try {
            // InternalTowerDefense.g:1226:46: (iv_ruleCarte= ruleCarte EOF )
            // InternalTowerDefense.g:1227:2: iv_ruleCarte= ruleCarte EOF
            {
             newCompositeNode(grammarAccess.getCarteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarte=ruleCarte();

            state._fsp--;

             current =iv_ruleCarte; 
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
    // $ANTLR end "entryRuleCarte"


    // $ANTLR start "ruleCarte"
    // InternalTowerDefense.g:1233:1: ruleCarte returns [EObject current=null] : (otherlv_0= 'Carte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Lignes' ( (lv_nbLignes_4_0= RULE_INT ) ) otherlv_5= 'Colonnes' ( (lv_nbColonnes_6_0= RULE_INT ) ) otherlv_7= 'Cases' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}' ) ;
    public final EObject ruleCarte() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nbLignes_4_0=null;
        Token otherlv_5=null;
        Token lv_nbColonnes_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:1239:2: ( (otherlv_0= 'Carte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Lignes' ( (lv_nbLignes_4_0= RULE_INT ) ) otherlv_5= 'Colonnes' ( (lv_nbColonnes_6_0= RULE_INT ) ) otherlv_7= 'Cases' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}' ) )
            // InternalTowerDefense.g:1240:2: (otherlv_0= 'Carte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Lignes' ( (lv_nbLignes_4_0= RULE_INT ) ) otherlv_5= 'Colonnes' ( (lv_nbColonnes_6_0= RULE_INT ) ) otherlv_7= 'Cases' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}' )
            {
            // InternalTowerDefense.g:1240:2: (otherlv_0= 'Carte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Lignes' ( (lv_nbLignes_4_0= RULE_INT ) ) otherlv_5= 'Colonnes' ( (lv_nbColonnes_6_0= RULE_INT ) ) otherlv_7= 'Cases' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}' )
            // InternalTowerDefense.g:1241:3: otherlv_0= 'Carte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Lignes' ( (lv_nbLignes_4_0= RULE_INT ) ) otherlv_5= 'Colonnes' ( (lv_nbColonnes_6_0= RULE_INT ) ) otherlv_7= 'Cases' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCarteAccess().getCarteKeyword_0());
            		
            // InternalTowerDefense.g:1245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTowerDefense.g:1246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTowerDefense.g:1246:4: (lv_name_1_0= RULE_ID )
            // InternalTowerDefense.g:1247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCarteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCarteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getCarteAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getCarteAccess().getLignesKeyword_3());
            		
            // InternalTowerDefense.g:1271:3: ( (lv_nbLignes_4_0= RULE_INT ) )
            // InternalTowerDefense.g:1272:4: (lv_nbLignes_4_0= RULE_INT )
            {
            // InternalTowerDefense.g:1272:4: (lv_nbLignes_4_0= RULE_INT )
            // InternalTowerDefense.g:1273:5: lv_nbLignes_4_0= RULE_INT
            {
            lv_nbLignes_4_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            					newLeafNode(lv_nbLignes_4_0, grammarAccess.getCarteAccess().getNbLignesINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCarteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nbLignes",
            						lv_nbLignes_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getCarteAccess().getColonnesKeyword_5());
            		
            // InternalTowerDefense.g:1293:3: ( (lv_nbColonnes_6_0= RULE_INT ) )
            // InternalTowerDefense.g:1294:4: (lv_nbColonnes_6_0= RULE_INT )
            {
            // InternalTowerDefense.g:1294:4: (lv_nbColonnes_6_0= RULE_INT )
            // InternalTowerDefense.g:1295:5: lv_nbColonnes_6_0= RULE_INT
            {
            lv_nbColonnes_6_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            					newLeafNode(lv_nbColonnes_6_0, grammarAccess.getCarteAccess().getNbColonnesINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCarteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nbColonnes",
            						lv_nbColonnes_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,47,FOLLOW_43); 

            			newLeafNode(otherlv_7, grammarAccess.getCarteAccess().getCasesKeyword_7());
            		
            // InternalTowerDefense.g:1315:3: ( (otherlv_8= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTowerDefense.g:1316:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalTowerDefense.g:1316:4: (otherlv_8= RULE_ID )
            	    // InternalTowerDefense.g:1317:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCarteRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    					newLeafNode(otherlv_8, grammarAccess.getCarteAccess().getCasesCaseCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCarteAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCarte"


    // $ANTLR start "entryRuleCase"
    // InternalTowerDefense.g:1336:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalTowerDefense.g:1336:45: (iv_ruleCase= ruleCase EOF )
            // InternalTowerDefense.g:1337:2: iv_ruleCase= ruleCase EOF
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
    // InternalTowerDefense.g:1343:1: ruleCase returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_i_1_0= RULE_INT ) ) ( (lv_j_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_i_1_0=null;
        Token lv_j_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:1349:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_i_1_0= RULE_INT ) ) ( (lv_j_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalTowerDefense.g:1350:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_i_1_0= RULE_INT ) ) ( (lv_j_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalTowerDefense.g:1350:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_i_1_0= RULE_INT ) ) ( (lv_j_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalTowerDefense.g:1351:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_i_1_0= RULE_INT ) ) ( (lv_j_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalTowerDefense.g:1351:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTowerDefense.g:1352:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTowerDefense.g:1352:4: (lv_name_0_0= RULE_ID )
            // InternalTowerDefense.g:1353:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTowerDefense.g:1369:3: ( (lv_i_1_0= RULE_INT ) )
            // InternalTowerDefense.g:1370:4: (lv_i_1_0= RULE_INT )
            {
            // InternalTowerDefense.g:1370:4: (lv_i_1_0= RULE_INT )
            // InternalTowerDefense.g:1371:5: lv_i_1_0= RULE_INT
            {
            lv_i_1_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            // InternalTowerDefense.g:1387:3: ( (lv_j_2_0= RULE_INT ) )
            // InternalTowerDefense.g:1388:4: (lv_j_2_0= RULE_INT )
            {
            // InternalTowerDefense.g:1388:4: (lv_j_2_0= RULE_INT )
            // InternalTowerDefense.g:1389:5: lv_j_2_0= RULE_INT
            {
            lv_j_2_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_j_2_0, grammarAccess.getCaseAccess().getJINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"j",
            						lv_j_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalTowerDefense.g:1405:3: ( (otherlv_3= RULE_ID ) )
            // InternalTowerDefense.g:1406:4: (otherlv_3= RULE_ID )
            {
            // InternalTowerDefense.g:1406:4: (otherlv_3= RULE_ID )
            // InternalTowerDefense.g:1407:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getNatureDuTerrainNatureTerrainCrossReference_3_0());
            				

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
    // InternalTowerDefense.g:1422:1: entryRuleVague returns [EObject current=null] : iv_ruleVague= ruleVague EOF ;
    public final EObject entryRuleVague() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVague = null;


        try {
            // InternalTowerDefense.g:1422:46: (iv_ruleVague= ruleVague EOF )
            // InternalTowerDefense.g:1423:2: iv_ruleVague= ruleVague EOF
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
    // InternalTowerDefense.g:1429:1: ruleVague returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}' ) ;
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
            // InternalTowerDefense.g:1435:2: ( (otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}' ) )
            // InternalTowerDefense.g:1436:2: (otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}' )
            {
            // InternalTowerDefense.g:1436:2: (otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}' )
            // InternalTowerDefense.g:1437:3: otherlv_0= '{' otherlv_1= 'Mobiles' ( (otherlv_2= RULE_ID ) )* otherlv_3= 'Obstacles' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'Gain' ( (lv_gainVictoire_6_0= RULE_INT ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getVagueAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getVagueAccess().getMobilesKeyword_1());
            		
            // InternalTowerDefense.g:1445:3: ( (otherlv_2= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTowerDefense.g:1446:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalTowerDefense.g:1446:4: (otherlv_2= RULE_ID )
            	    // InternalTowerDefense.g:1447:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVagueRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_45); 

            	    					newLeafNode(otherlv_2, grammarAccess.getVagueAccess().getMobilesMobileCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,49,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getVagueAccess().getObstaclesKeyword_3());
            		
            // InternalTowerDefense.g:1462:3: ( (otherlv_4= RULE_ID ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTowerDefense.g:1463:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalTowerDefense.g:1463:4: (otherlv_4= RULE_ID )
            	    // InternalTowerDefense.g:1464:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVagueRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_46); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVagueAccess().getObstaclesObstacleCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,50,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getVagueAccess().getGainKeyword_5());
            		
            // InternalTowerDefense.g:1479:3: ( (lv_gainVictoire_6_0= RULE_INT ) )
            // InternalTowerDefense.g:1480:4: (lv_gainVictoire_6_0= RULE_INT )
            {
            // InternalTowerDefense.g:1480:4: (lv_gainVictoire_6_0= RULE_INT )
            // InternalTowerDefense.g:1481:5: lv_gainVictoire_6_0= RULE_INT
            {
            lv_gainVictoire_6_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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


    // $ANTLR start "ruleTactiqueType"
    // InternalTowerDefense.g:1505:1: ruleTactiqueType returns [Enumerator current=null] : ( (enumLiteral_0= 'procheFirst' ) | (enumLiteral_1= 'faibleFirst' ) | (enumLiteral_2= 'fortFirst' ) ) ;
    public final Enumerator ruleTactiqueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:1511:2: ( ( (enumLiteral_0= 'procheFirst' ) | (enumLiteral_1= 'faibleFirst' ) | (enumLiteral_2= 'fortFirst' ) ) )
            // InternalTowerDefense.g:1512:2: ( (enumLiteral_0= 'procheFirst' ) | (enumLiteral_1= 'faibleFirst' ) | (enumLiteral_2= 'fortFirst' ) )
            {
            // InternalTowerDefense.g:1512:2: ( (enumLiteral_0= 'procheFirst' ) | (enumLiteral_1= 'faibleFirst' ) | (enumLiteral_2= 'fortFirst' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt11=1;
                }
                break;
            case 52:
                {
                alt11=2;
                }
                break;
            case 53:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTowerDefense.g:1513:3: (enumLiteral_0= 'procheFirst' )
                    {
                    // InternalTowerDefense.g:1513:3: (enumLiteral_0= 'procheFirst' )
                    // InternalTowerDefense.g:1514:4: enumLiteral_0= 'procheFirst'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTactiqueTypeAccess().getProcheEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTactiqueTypeAccess().getProcheEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:1521:3: (enumLiteral_1= 'faibleFirst' )
                    {
                    // InternalTowerDefense.g:1521:3: (enumLiteral_1= 'faibleFirst' )
                    // InternalTowerDefense.g:1522:4: enumLiteral_1= 'faibleFirst'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTactiqueTypeAccess().getFaibleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTactiqueTypeAccess().getFaibleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:1529:3: (enumLiteral_2= 'fortFirst' )
                    {
                    // InternalTowerDefense.g:1529:3: (enumLiteral_2= 'fortFirst' )
                    // InternalTowerDefense.g:1530:4: enumLiteral_2= 'fortFirst'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTactiqueTypeAccess().getFortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTactiqueTypeAccess().getFortEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTactiqueType"


    // $ANTLR start "ruleTYPE_TERRAIN"
    // InternalTowerDefense.g:1540:1: ruleTYPE_TERRAIN returns [Enumerator current=null] : ( (enumLiteral_0= 'entree' ) | (enumLiteral_1= 'sortie' ) | (enumLiteral_2= 'chemin' ) | (enumLiteral_3= 'camp' ) | (enumLiteral_4= 'deco' ) ) ;
    public final Enumerator ruleTYPE_TERRAIN() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:1546:2: ( ( (enumLiteral_0= 'entree' ) | (enumLiteral_1= 'sortie' ) | (enumLiteral_2= 'chemin' ) | (enumLiteral_3= 'camp' ) | (enumLiteral_4= 'deco' ) ) )
            // InternalTowerDefense.g:1547:2: ( (enumLiteral_0= 'entree' ) | (enumLiteral_1= 'sortie' ) | (enumLiteral_2= 'chemin' ) | (enumLiteral_3= 'camp' ) | (enumLiteral_4= 'deco' ) )
            {
            // InternalTowerDefense.g:1547:2: ( (enumLiteral_0= 'entree' ) | (enumLiteral_1= 'sortie' ) | (enumLiteral_2= 'chemin' ) | (enumLiteral_3= 'camp' ) | (enumLiteral_4= 'deco' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt12=1;
                }
                break;
            case 55:
                {
                alt12=2;
                }
                break;
            case 56:
                {
                alt12=3;
                }
                break;
            case 57:
                {
                alt12=4;
                }
                break;
            case 58:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTowerDefense.g:1548:3: (enumLiteral_0= 'entree' )
                    {
                    // InternalTowerDefense.g:1548:3: (enumLiteral_0= 'entree' )
                    // InternalTowerDefense.g:1549:4: enumLiteral_0= 'entree'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:1556:3: (enumLiteral_1= 'sortie' )
                    {
                    // InternalTowerDefense.g:1556:3: (enumLiteral_1= 'sortie' )
                    // InternalTowerDefense.g:1557:4: enumLiteral_1= 'sortie'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:1564:3: (enumLiteral_2= 'chemin' )
                    {
                    // InternalTowerDefense.g:1564:3: (enumLiteral_2= 'chemin' )
                    // InternalTowerDefense.g:1565:4: enumLiteral_2= 'chemin'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTowerDefense.g:1572:3: (enumLiteral_3= 'camp' )
                    {
                    // InternalTowerDefense.g:1572:3: (enumLiteral_3= 'camp' )
                    // InternalTowerDefense.g:1573:4: enumLiteral_3= 'camp'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTowerDefense.g:1580:3: (enumLiteral_4= 'deco' )
                    {
                    // InternalTowerDefense.g:1580:3: (enumLiteral_4= 'deco' )
                    // InternalTowerDefense.g:1581:4: enumLiteral_4= 'deco'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

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
    // InternalTowerDefense.g:1591:1: ruleDifficulte returns [Enumerator current=null] : ( (enumLiteral_0= 'facile' ) | (enumLiteral_1= 'moyen' ) | (enumLiteral_2= 'difficile' ) ) ;
    public final Enumerator ruleDifficulte() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTowerDefense.g:1597:2: ( ( (enumLiteral_0= 'facile' ) | (enumLiteral_1= 'moyen' ) | (enumLiteral_2= 'difficile' ) ) )
            // InternalTowerDefense.g:1598:2: ( (enumLiteral_0= 'facile' ) | (enumLiteral_1= 'moyen' ) | (enumLiteral_2= 'difficile' ) )
            {
            // InternalTowerDefense.g:1598:2: ( (enumLiteral_0= 'facile' ) | (enumLiteral_1= 'moyen' ) | (enumLiteral_2= 'difficile' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt13=1;
                }
                break;
            case 60:
                {
                alt13=2;
                }
                break;
            case 61:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTowerDefense.g:1599:3: (enumLiteral_0= 'facile' )
                    {
                    // InternalTowerDefense.g:1599:3: (enumLiteral_0= 'facile' )
                    // InternalTowerDefense.g:1600:4: enumLiteral_0= 'facile'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:1607:3: (enumLiteral_1= 'moyen' )
                    {
                    // InternalTowerDefense.g:1607:3: (enumLiteral_1= 'moyen' )
                    // InternalTowerDefense.g:1608:4: enumLiteral_1= 'moyen'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:1615:3: (enumLiteral_2= 'difficile' )
                    {
                    // InternalTowerDefense.g:1615:3: (enumLiteral_2= 'difficile' )
                    // InternalTowerDefense.g:1616:4: enumLiteral_2= 'difficile'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000088810412010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000088810412000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008810412000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000010L});

}