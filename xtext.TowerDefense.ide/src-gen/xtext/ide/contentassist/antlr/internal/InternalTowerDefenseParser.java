package xtext.ide.contentassist.antlr.internal;

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
import xtext.services.TowerDefenseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTowerDefenseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procheFirst'", "'faibleFirst'", "'fortFirst'", "'entree'", "'sortie'", "'chemin'", "'camp'", "'deco'", "'facile'", "'moyen'", "'difficile'", "'Jeu'", "'{'", "'}'", "'Partie'", "'Obstacle'", "'Campement'", "'PVmax'", "'Tactique'", "'Mobile'", "'F'", "'V'", "'NumVague'", "'In'", "'Out'", "'Projectile'", "'Portee'", "'Masse'", "'Vitesse'", "'Position'", "'Direction'", "'Degat'", "'NatureTerrain'", "'Volume'", "'Type'", "'FatigueEntree'", "'Niveau'", "'DureePauses'", "'Argent'", "'MobSortisMax'", "'Carte'", "'Lignes'", "'Colonnes'", "'Cases'", "'Vague'", "'Mobiles'", "'Obstacles'", "'Gain'", "'infini'"
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

    	public void setGrammarAccess(TowerDefenseGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJeu"
    // InternalTowerDefense.g:53:1: entryRuleJeu : ruleJeu EOF ;
    public final void entryRuleJeu() throws RecognitionException {
        try {
            // InternalTowerDefense.g:54:1: ( ruleJeu EOF )
            // InternalTowerDefense.g:55:1: ruleJeu EOF
            {
             before(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            ruleJeu();

            state._fsp--;

             after(grammarAccess.getJeuRule()); 
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
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalTowerDefense.g:62:1: ruleJeu : ( ( rule__Jeu__Group__0 ) ) ;
    public final void ruleJeu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:66:2: ( ( ( rule__Jeu__Group__0 ) ) )
            // InternalTowerDefense.g:67:2: ( ( rule__Jeu__Group__0 ) )
            {
            // InternalTowerDefense.g:67:2: ( ( rule__Jeu__Group__0 ) )
            // InternalTowerDefense.g:68:3: ( rule__Jeu__Group__0 )
            {
             before(grammarAccess.getJeuAccess().getGroup()); 
            // InternalTowerDefense.g:69:3: ( rule__Jeu__Group__0 )
            // InternalTowerDefense.g:69:4: rule__Jeu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getGroup()); 

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
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRulePartie"
    // InternalTowerDefense.g:78:1: entryRulePartie : rulePartie EOF ;
    public final void entryRulePartie() throws RecognitionException {
        try {
            // InternalTowerDefense.g:79:1: ( rulePartie EOF )
            // InternalTowerDefense.g:80:1: rulePartie EOF
            {
             before(grammarAccess.getPartieRule()); 
            pushFollow(FOLLOW_1);
            rulePartie();

            state._fsp--;

             after(grammarAccess.getPartieRule()); 
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
    // $ANTLR end "entryRulePartie"


    // $ANTLR start "rulePartie"
    // InternalTowerDefense.g:87:1: rulePartie : ( ( rule__Partie__Group__0 ) ) ;
    public final void rulePartie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:91:2: ( ( ( rule__Partie__Group__0 ) ) )
            // InternalTowerDefense.g:92:2: ( ( rule__Partie__Group__0 ) )
            {
            // InternalTowerDefense.g:92:2: ( ( rule__Partie__Group__0 ) )
            // InternalTowerDefense.g:93:3: ( rule__Partie__Group__0 )
            {
             before(grammarAccess.getPartieAccess().getGroup()); 
            // InternalTowerDefense.g:94:3: ( rule__Partie__Group__0 )
            // InternalTowerDefense.g:94:4: rule__Partie__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Partie__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartieAccess().getGroup()); 

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
    // $ANTLR end "rulePartie"


    // $ANTLR start "entryRulePartieElement"
    // InternalTowerDefense.g:103:1: entryRulePartieElement : rulePartieElement EOF ;
    public final void entryRulePartieElement() throws RecognitionException {
        try {
            // InternalTowerDefense.g:104:1: ( rulePartieElement EOF )
            // InternalTowerDefense.g:105:1: rulePartieElement EOF
            {
             before(grammarAccess.getPartieElementRule()); 
            pushFollow(FOLLOW_1);
            rulePartieElement();

            state._fsp--;

             after(grammarAccess.getPartieElementRule()); 
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
    // $ANTLR end "entryRulePartieElement"


    // $ANTLR start "rulePartieElement"
    // InternalTowerDefense.g:112:1: rulePartieElement : ( ( rule__PartieElement__Alternatives ) ) ;
    public final void rulePartieElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:116:2: ( ( ( rule__PartieElement__Alternatives ) ) )
            // InternalTowerDefense.g:117:2: ( ( rule__PartieElement__Alternatives ) )
            {
            // InternalTowerDefense.g:117:2: ( ( rule__PartieElement__Alternatives ) )
            // InternalTowerDefense.g:118:3: ( rule__PartieElement__Alternatives )
            {
             before(grammarAccess.getPartieElementAccess().getAlternatives()); 
            // InternalTowerDefense.g:119:3: ( rule__PartieElement__Alternatives )
            // InternalTowerDefense.g:119:4: rule__PartieElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PartieElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartieElementAccess().getAlternatives()); 

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
    // $ANTLR end "rulePartieElement"


    // $ANTLR start "entryRuleEnergie"
    // InternalTowerDefense.g:128:1: entryRuleEnergie : ruleEnergie EOF ;
    public final void entryRuleEnergie() throws RecognitionException {
        try {
            // InternalTowerDefense.g:129:1: ( ruleEnergie EOF )
            // InternalTowerDefense.g:130:1: ruleEnergie EOF
            {
             before(grammarAccess.getEnergieRule()); 
            pushFollow(FOLLOW_1);
            ruleEnergie();

            state._fsp--;

             after(grammarAccess.getEnergieRule()); 
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
    // $ANTLR end "entryRuleEnergie"


    // $ANTLR start "ruleEnergie"
    // InternalTowerDefense.g:137:1: ruleEnergie : ( ( rule__Energie__Alternatives ) ) ;
    public final void ruleEnergie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:141:2: ( ( ( rule__Energie__Alternatives ) ) )
            // InternalTowerDefense.g:142:2: ( ( rule__Energie__Alternatives ) )
            {
            // InternalTowerDefense.g:142:2: ( ( rule__Energie__Alternatives ) )
            // InternalTowerDefense.g:143:3: ( rule__Energie__Alternatives )
            {
             before(grammarAccess.getEnergieAccess().getAlternatives()); 
            // InternalTowerDefense.g:144:3: ( rule__Energie__Alternatives )
            // InternalTowerDefense.g:144:4: rule__Energie__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Energie__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnergieAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEnergie"


    // $ANTLR start "entryRuleObstacle"
    // InternalTowerDefense.g:153:1: entryRuleObstacle : ruleObstacle EOF ;
    public final void entryRuleObstacle() throws RecognitionException {
        try {
            // InternalTowerDefense.g:154:1: ( ruleObstacle EOF )
            // InternalTowerDefense.g:155:1: ruleObstacle EOF
            {
             before(grammarAccess.getObstacleRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacle();

            state._fsp--;

             after(grammarAccess.getObstacleRule()); 
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
    // $ANTLR end "entryRuleObstacle"


    // $ANTLR start "ruleObstacle"
    // InternalTowerDefense.g:162:1: ruleObstacle : ( ( rule__Obstacle__Group__0 ) ) ;
    public final void ruleObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:166:2: ( ( ( rule__Obstacle__Group__0 ) ) )
            // InternalTowerDefense.g:167:2: ( ( rule__Obstacle__Group__0 ) )
            {
            // InternalTowerDefense.g:167:2: ( ( rule__Obstacle__Group__0 ) )
            // InternalTowerDefense.g:168:3: ( rule__Obstacle__Group__0 )
            {
             before(grammarAccess.getObstacleAccess().getGroup()); 
            // InternalTowerDefense.g:169:3: ( rule__Obstacle__Group__0 )
            // InternalTowerDefense.g:169:4: rule__Obstacle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getGroup()); 

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
    // $ANTLR end "ruleObstacle"


    // $ANTLR start "entryRuleMobile"
    // InternalTowerDefense.g:178:1: entryRuleMobile : ruleMobile EOF ;
    public final void entryRuleMobile() throws RecognitionException {
        try {
            // InternalTowerDefense.g:179:1: ( ruleMobile EOF )
            // InternalTowerDefense.g:180:1: ruleMobile EOF
            {
             before(grammarAccess.getMobileRule()); 
            pushFollow(FOLLOW_1);
            ruleMobile();

            state._fsp--;

             after(grammarAccess.getMobileRule()); 
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
    // $ANTLR end "entryRuleMobile"


    // $ANTLR start "ruleMobile"
    // InternalTowerDefense.g:187:1: ruleMobile : ( ( rule__Mobile__Group__0 ) ) ;
    public final void ruleMobile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:191:2: ( ( ( rule__Mobile__Group__0 ) ) )
            // InternalTowerDefense.g:192:2: ( ( rule__Mobile__Group__0 ) )
            {
            // InternalTowerDefense.g:192:2: ( ( rule__Mobile__Group__0 ) )
            // InternalTowerDefense.g:193:3: ( rule__Mobile__Group__0 )
            {
             before(grammarAccess.getMobileAccess().getGroup()); 
            // InternalTowerDefense.g:194:3: ( rule__Mobile__Group__0 )
            // InternalTowerDefense.g:194:4: rule__Mobile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getGroup()); 

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
    // $ANTLR end "ruleMobile"


    // $ANTLR start "entryRuleProjectile"
    // InternalTowerDefense.g:203:1: entryRuleProjectile : ruleProjectile EOF ;
    public final void entryRuleProjectile() throws RecognitionException {
        try {
            // InternalTowerDefense.g:204:1: ( ruleProjectile EOF )
            // InternalTowerDefense.g:205:1: ruleProjectile EOF
            {
             before(grammarAccess.getProjectileRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectile();

            state._fsp--;

             after(grammarAccess.getProjectileRule()); 
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
    // $ANTLR end "entryRuleProjectile"


    // $ANTLR start "ruleProjectile"
    // InternalTowerDefense.g:212:1: ruleProjectile : ( ( rule__Projectile__Group__0 ) ) ;
    public final void ruleProjectile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:216:2: ( ( ( rule__Projectile__Group__0 ) ) )
            // InternalTowerDefense.g:217:2: ( ( rule__Projectile__Group__0 ) )
            {
            // InternalTowerDefense.g:217:2: ( ( rule__Projectile__Group__0 ) )
            // InternalTowerDefense.g:218:3: ( rule__Projectile__Group__0 )
            {
             before(grammarAccess.getProjectileAccess().getGroup()); 
            // InternalTowerDefense.g:219:3: ( rule__Projectile__Group__0 )
            // InternalTowerDefense.g:219:4: rule__Projectile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectileAccess().getGroup()); 

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
    // $ANTLR end "ruleProjectile"


    // $ANTLR start "entryRuleNatureTerrain"
    // InternalTowerDefense.g:228:1: entryRuleNatureTerrain : ruleNatureTerrain EOF ;
    public final void entryRuleNatureTerrain() throws RecognitionException {
        try {
            // InternalTowerDefense.g:229:1: ( ruleNatureTerrain EOF )
            // InternalTowerDefense.g:230:1: ruleNatureTerrain EOF
            {
             before(grammarAccess.getNatureTerrainRule()); 
            pushFollow(FOLLOW_1);
            ruleNatureTerrain();

            state._fsp--;

             after(grammarAccess.getNatureTerrainRule()); 
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
    // $ANTLR end "entryRuleNatureTerrain"


    // $ANTLR start "ruleNatureTerrain"
    // InternalTowerDefense.g:237:1: ruleNatureTerrain : ( ( rule__NatureTerrain__Group__0 ) ) ;
    public final void ruleNatureTerrain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:241:2: ( ( ( rule__NatureTerrain__Group__0 ) ) )
            // InternalTowerDefense.g:242:2: ( ( rule__NatureTerrain__Group__0 ) )
            {
            // InternalTowerDefense.g:242:2: ( ( rule__NatureTerrain__Group__0 ) )
            // InternalTowerDefense.g:243:3: ( rule__NatureTerrain__Group__0 )
            {
             before(grammarAccess.getNatureTerrainAccess().getGroup()); 
            // InternalTowerDefense.g:244:3: ( rule__NatureTerrain__Group__0 )
            // InternalTowerDefense.g:244:4: rule__NatureTerrain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getGroup()); 

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
    // $ANTLR end "ruleNatureTerrain"


    // $ANTLR start "entryRuleNiveau"
    // InternalTowerDefense.g:253:1: entryRuleNiveau : ruleNiveau EOF ;
    public final void entryRuleNiveau() throws RecognitionException {
        try {
            // InternalTowerDefense.g:254:1: ( ruleNiveau EOF )
            // InternalTowerDefense.g:255:1: ruleNiveau EOF
            {
             before(grammarAccess.getNiveauRule()); 
            pushFollow(FOLLOW_1);
            ruleNiveau();

            state._fsp--;

             after(grammarAccess.getNiveauRule()); 
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
    // $ANTLR end "entryRuleNiveau"


    // $ANTLR start "ruleNiveau"
    // InternalTowerDefense.g:262:1: ruleNiveau : ( ( rule__Niveau__Group__0 ) ) ;
    public final void ruleNiveau() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:266:2: ( ( ( rule__Niveau__Group__0 ) ) )
            // InternalTowerDefense.g:267:2: ( ( rule__Niveau__Group__0 ) )
            {
            // InternalTowerDefense.g:267:2: ( ( rule__Niveau__Group__0 ) )
            // InternalTowerDefense.g:268:3: ( rule__Niveau__Group__0 )
            {
             before(grammarAccess.getNiveauAccess().getGroup()); 
            // InternalTowerDefense.g:269:3: ( rule__Niveau__Group__0 )
            // InternalTowerDefense.g:269:4: rule__Niveau__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getGroup()); 

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
    // $ANTLR end "ruleNiveau"


    // $ANTLR start "entryRuleCarte"
    // InternalTowerDefense.g:278:1: entryRuleCarte : ruleCarte EOF ;
    public final void entryRuleCarte() throws RecognitionException {
        try {
            // InternalTowerDefense.g:279:1: ( ruleCarte EOF )
            // InternalTowerDefense.g:280:1: ruleCarte EOF
            {
             before(grammarAccess.getCarteRule()); 
            pushFollow(FOLLOW_1);
            ruleCarte();

            state._fsp--;

             after(grammarAccess.getCarteRule()); 
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
    // $ANTLR end "entryRuleCarte"


    // $ANTLR start "ruleCarte"
    // InternalTowerDefense.g:287:1: ruleCarte : ( ( rule__Carte__Group__0 ) ) ;
    public final void ruleCarte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:291:2: ( ( ( rule__Carte__Group__0 ) ) )
            // InternalTowerDefense.g:292:2: ( ( rule__Carte__Group__0 ) )
            {
            // InternalTowerDefense.g:292:2: ( ( rule__Carte__Group__0 ) )
            // InternalTowerDefense.g:293:3: ( rule__Carte__Group__0 )
            {
             before(grammarAccess.getCarteAccess().getGroup()); 
            // InternalTowerDefense.g:294:3: ( rule__Carte__Group__0 )
            // InternalTowerDefense.g:294:4: rule__Carte__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Carte__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarteAccess().getGroup()); 

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
    // $ANTLR end "ruleCarte"


    // $ANTLR start "entryRuleCase"
    // InternalTowerDefense.g:303:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalTowerDefense.g:304:1: ( ruleCase EOF )
            // InternalTowerDefense.g:305:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalTowerDefense.g:312:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:316:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalTowerDefense.g:317:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalTowerDefense.g:317:2: ( ( rule__Case__Group__0 ) )
            // InternalTowerDefense.g:318:3: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalTowerDefense.g:319:3: ( rule__Case__Group__0 )
            // InternalTowerDefense.g:319:4: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleVague"
    // InternalTowerDefense.g:328:1: entryRuleVague : ruleVague EOF ;
    public final void entryRuleVague() throws RecognitionException {
        try {
            // InternalTowerDefense.g:329:1: ( ruleVague EOF )
            // InternalTowerDefense.g:330:1: ruleVague EOF
            {
             before(grammarAccess.getVagueRule()); 
            pushFollow(FOLLOW_1);
            ruleVague();

            state._fsp--;

             after(grammarAccess.getVagueRule()); 
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
    // $ANTLR end "entryRuleVague"


    // $ANTLR start "ruleVague"
    // InternalTowerDefense.g:337:1: ruleVague : ( ( rule__Vague__Group__0 ) ) ;
    public final void ruleVague() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:341:2: ( ( ( rule__Vague__Group__0 ) ) )
            // InternalTowerDefense.g:342:2: ( ( rule__Vague__Group__0 ) )
            {
            // InternalTowerDefense.g:342:2: ( ( rule__Vague__Group__0 ) )
            // InternalTowerDefense.g:343:3: ( rule__Vague__Group__0 )
            {
             before(grammarAccess.getVagueAccess().getGroup()); 
            // InternalTowerDefense.g:344:3: ( rule__Vague__Group__0 )
            // InternalTowerDefense.g:344:4: rule__Vague__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vague__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVagueAccess().getGroup()); 

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
    // $ANTLR end "ruleVague"


    // $ANTLR start "ruleTactiqueType"
    // InternalTowerDefense.g:353:1: ruleTactiqueType : ( ( rule__TactiqueType__Alternatives ) ) ;
    public final void ruleTactiqueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:357:1: ( ( ( rule__TactiqueType__Alternatives ) ) )
            // InternalTowerDefense.g:358:2: ( ( rule__TactiqueType__Alternatives ) )
            {
            // InternalTowerDefense.g:358:2: ( ( rule__TactiqueType__Alternatives ) )
            // InternalTowerDefense.g:359:3: ( rule__TactiqueType__Alternatives )
            {
             before(grammarAccess.getTactiqueTypeAccess().getAlternatives()); 
            // InternalTowerDefense.g:360:3: ( rule__TactiqueType__Alternatives )
            // InternalTowerDefense.g:360:4: rule__TactiqueType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TactiqueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTactiqueTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTactiqueType"


    // $ANTLR start "ruleTYPE_TERRAIN"
    // InternalTowerDefense.g:369:1: ruleTYPE_TERRAIN : ( ( rule__TYPE_TERRAIN__Alternatives ) ) ;
    public final void ruleTYPE_TERRAIN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:373:1: ( ( ( rule__TYPE_TERRAIN__Alternatives ) ) )
            // InternalTowerDefense.g:374:2: ( ( rule__TYPE_TERRAIN__Alternatives ) )
            {
            // InternalTowerDefense.g:374:2: ( ( rule__TYPE_TERRAIN__Alternatives ) )
            // InternalTowerDefense.g:375:3: ( rule__TYPE_TERRAIN__Alternatives )
            {
             before(grammarAccess.getTYPE_TERRAINAccess().getAlternatives()); 
            // InternalTowerDefense.g:376:3: ( rule__TYPE_TERRAIN__Alternatives )
            // InternalTowerDefense.g:376:4: rule__TYPE_TERRAIN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_TERRAIN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_TERRAINAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTYPE_TERRAIN"


    // $ANTLR start "ruleDifficulte"
    // InternalTowerDefense.g:385:1: ruleDifficulte : ( ( rule__Difficulte__Alternatives ) ) ;
    public final void ruleDifficulte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:389:1: ( ( ( rule__Difficulte__Alternatives ) ) )
            // InternalTowerDefense.g:390:2: ( ( rule__Difficulte__Alternatives ) )
            {
            // InternalTowerDefense.g:390:2: ( ( rule__Difficulte__Alternatives ) )
            // InternalTowerDefense.g:391:3: ( rule__Difficulte__Alternatives )
            {
             before(grammarAccess.getDifficulteAccess().getAlternatives()); 
            // InternalTowerDefense.g:392:3: ( rule__Difficulte__Alternatives )
            // InternalTowerDefense.g:392:4: rule__Difficulte__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Difficulte__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDifficulteAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDifficulte"


    // $ANTLR start "rule__PartieElement__Alternatives"
    // InternalTowerDefense.g:400:1: rule__PartieElement__Alternatives : ( ( ruleObstacle ) | ( ruleMobile ) | ( ruleProjectile ) | ( ruleNatureTerrain ) );
    public final void rule__PartieElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:404:1: ( ( ruleObstacle ) | ( ruleMobile ) | ( ruleProjectile ) | ( ruleNatureTerrain ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 36:
                {
                alt1=3;
                }
                break;
            case 43:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTowerDefense.g:405:2: ( ruleObstacle )
                    {
                    // InternalTowerDefense.g:405:2: ( ruleObstacle )
                    // InternalTowerDefense.g:406:3: ruleObstacle
                    {
                     before(grammarAccess.getPartieElementAccess().getObstacleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObstacle();

                    state._fsp--;

                     after(grammarAccess.getPartieElementAccess().getObstacleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:411:2: ( ruleMobile )
                    {
                    // InternalTowerDefense.g:411:2: ( ruleMobile )
                    // InternalTowerDefense.g:412:3: ruleMobile
                    {
                     before(grammarAccess.getPartieElementAccess().getMobileParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMobile();

                    state._fsp--;

                     after(grammarAccess.getPartieElementAccess().getMobileParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:417:2: ( ruleProjectile )
                    {
                    // InternalTowerDefense.g:417:2: ( ruleProjectile )
                    // InternalTowerDefense.g:418:3: ruleProjectile
                    {
                     before(grammarAccess.getPartieElementAccess().getProjectileParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProjectile();

                    state._fsp--;

                     after(grammarAccess.getPartieElementAccess().getProjectileParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTowerDefense.g:423:2: ( ruleNatureTerrain )
                    {
                    // InternalTowerDefense.g:423:2: ( ruleNatureTerrain )
                    // InternalTowerDefense.g:424:3: ruleNatureTerrain
                    {
                     before(grammarAccess.getPartieElementAccess().getNatureTerrainParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNatureTerrain();

                    state._fsp--;

                     after(grammarAccess.getPartieElementAccess().getNatureTerrainParserRuleCall_3()); 

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
    // $ANTLR end "rule__PartieElement__Alternatives"


    // $ANTLR start "rule__Energie__Alternatives"
    // InternalTowerDefense.g:433:1: rule__Energie__Alternatives : ( ( ( rule__Energie__InfiniAssignment_0 ) ) | ( ( rule__Energie__ValeurAssignment_1 ) ) );
    public final void rule__Energie__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:437:1: ( ( ( rule__Energie__InfiniAssignment_0 ) ) | ( ( rule__Energie__ValeurAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==59) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTowerDefense.g:438:2: ( ( rule__Energie__InfiniAssignment_0 ) )
                    {
                    // InternalTowerDefense.g:438:2: ( ( rule__Energie__InfiniAssignment_0 ) )
                    // InternalTowerDefense.g:439:3: ( rule__Energie__InfiniAssignment_0 )
                    {
                     before(grammarAccess.getEnergieAccess().getInfiniAssignment_0()); 
                    // InternalTowerDefense.g:440:3: ( rule__Energie__InfiniAssignment_0 )
                    // InternalTowerDefense.g:440:4: rule__Energie__InfiniAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Energie__InfiniAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnergieAccess().getInfiniAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:444:2: ( ( rule__Energie__ValeurAssignment_1 ) )
                    {
                    // InternalTowerDefense.g:444:2: ( ( rule__Energie__ValeurAssignment_1 ) )
                    // InternalTowerDefense.g:445:3: ( rule__Energie__ValeurAssignment_1 )
                    {
                     before(grammarAccess.getEnergieAccess().getValeurAssignment_1()); 
                    // InternalTowerDefense.g:446:3: ( rule__Energie__ValeurAssignment_1 )
                    // InternalTowerDefense.g:446:4: rule__Energie__ValeurAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Energie__ValeurAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnergieAccess().getValeurAssignment_1()); 

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
    // $ANTLR end "rule__Energie__Alternatives"


    // $ANTLR start "rule__TactiqueType__Alternatives"
    // InternalTowerDefense.g:454:1: rule__TactiqueType__Alternatives : ( ( ( 'procheFirst' ) ) | ( ( 'faibleFirst' ) ) | ( ( 'fortFirst' ) ) );
    public final void rule__TactiqueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:458:1: ( ( ( 'procheFirst' ) ) | ( ( 'faibleFirst' ) ) | ( ( 'fortFirst' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
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
                    // InternalTowerDefense.g:459:2: ( ( 'procheFirst' ) )
                    {
                    // InternalTowerDefense.g:459:2: ( ( 'procheFirst' ) )
                    // InternalTowerDefense.g:460:3: ( 'procheFirst' )
                    {
                     before(grammarAccess.getTactiqueTypeAccess().getProcheEnumLiteralDeclaration_0()); 
                    // InternalTowerDefense.g:461:3: ( 'procheFirst' )
                    // InternalTowerDefense.g:461:4: 'procheFirst'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTactiqueTypeAccess().getProcheEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:465:2: ( ( 'faibleFirst' ) )
                    {
                    // InternalTowerDefense.g:465:2: ( ( 'faibleFirst' ) )
                    // InternalTowerDefense.g:466:3: ( 'faibleFirst' )
                    {
                     before(grammarAccess.getTactiqueTypeAccess().getFaibleEnumLiteralDeclaration_1()); 
                    // InternalTowerDefense.g:467:3: ( 'faibleFirst' )
                    // InternalTowerDefense.g:467:4: 'faibleFirst'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTactiqueTypeAccess().getFaibleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:471:2: ( ( 'fortFirst' ) )
                    {
                    // InternalTowerDefense.g:471:2: ( ( 'fortFirst' ) )
                    // InternalTowerDefense.g:472:3: ( 'fortFirst' )
                    {
                     before(grammarAccess.getTactiqueTypeAccess().getFortEnumLiteralDeclaration_2()); 
                    // InternalTowerDefense.g:473:3: ( 'fortFirst' )
                    // InternalTowerDefense.g:473:4: 'fortFirst'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTactiqueTypeAccess().getFortEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TactiqueType__Alternatives"


    // $ANTLR start "rule__TYPE_TERRAIN__Alternatives"
    // InternalTowerDefense.g:481:1: rule__TYPE_TERRAIN__Alternatives : ( ( ( 'entree' ) ) | ( ( 'sortie' ) ) | ( ( 'chemin' ) ) | ( ( 'camp' ) ) | ( ( 'deco' ) ) );
    public final void rule__TYPE_TERRAIN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:485:1: ( ( ( 'entree' ) ) | ( ( 'sortie' ) ) | ( ( 'chemin' ) ) | ( ( 'camp' ) ) | ( ( 'deco' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTowerDefense.g:486:2: ( ( 'entree' ) )
                    {
                    // InternalTowerDefense.g:486:2: ( ( 'entree' ) )
                    // InternalTowerDefense.g:487:3: ( 'entree' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0()); 
                    // InternalTowerDefense.g:488:3: ( 'entree' )
                    // InternalTowerDefense.g:488:4: 'entree'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:492:2: ( ( 'sortie' ) )
                    {
                    // InternalTowerDefense.g:492:2: ( ( 'sortie' ) )
                    // InternalTowerDefense.g:493:3: ( 'sortie' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1()); 
                    // InternalTowerDefense.g:494:3: ( 'sortie' )
                    // InternalTowerDefense.g:494:4: 'sortie'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:498:2: ( ( 'chemin' ) )
                    {
                    // InternalTowerDefense.g:498:2: ( ( 'chemin' ) )
                    // InternalTowerDefense.g:499:3: ( 'chemin' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2()); 
                    // InternalTowerDefense.g:500:3: ( 'chemin' )
                    // InternalTowerDefense.g:500:4: 'chemin'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTowerDefense.g:504:2: ( ( 'camp' ) )
                    {
                    // InternalTowerDefense.g:504:2: ( ( 'camp' ) )
                    // InternalTowerDefense.g:505:3: ( 'camp' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3()); 
                    // InternalTowerDefense.g:506:3: ( 'camp' )
                    // InternalTowerDefense.g:506:4: 'camp'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTowerDefense.g:510:2: ( ( 'deco' ) )
                    {
                    // InternalTowerDefense.g:510:2: ( ( 'deco' ) )
                    // InternalTowerDefense.g:511:3: ( 'deco' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getDecorationEnumLiteralDeclaration_4()); 
                    // InternalTowerDefense.g:512:3: ( 'deco' )
                    // InternalTowerDefense.g:512:4: 'deco'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getDecorationEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__TYPE_TERRAIN__Alternatives"


    // $ANTLR start "rule__Difficulte__Alternatives"
    // InternalTowerDefense.g:520:1: rule__Difficulte__Alternatives : ( ( ( 'facile' ) ) | ( ( 'moyen' ) ) | ( ( 'difficile' ) ) );
    public final void rule__Difficulte__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:524:1: ( ( ( 'facile' ) ) | ( ( 'moyen' ) ) | ( ( 'difficile' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
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
                    // InternalTowerDefense.g:525:2: ( ( 'facile' ) )
                    {
                    // InternalTowerDefense.g:525:2: ( ( 'facile' ) )
                    // InternalTowerDefense.g:526:3: ( 'facile' )
                    {
                     before(grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0()); 
                    // InternalTowerDefense.g:527:3: ( 'facile' )
                    // InternalTowerDefense.g:527:4: 'facile'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:531:2: ( ( 'moyen' ) )
                    {
                    // InternalTowerDefense.g:531:2: ( ( 'moyen' ) )
                    // InternalTowerDefense.g:532:3: ( 'moyen' )
                    {
                     before(grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1()); 
                    // InternalTowerDefense.g:533:3: ( 'moyen' )
                    // InternalTowerDefense.g:533:4: 'moyen'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:537:2: ( ( 'difficile' ) )
                    {
                    // InternalTowerDefense.g:537:2: ( ( 'difficile' ) )
                    // InternalTowerDefense.g:538:3: ( 'difficile' )
                    {
                     before(grammarAccess.getDifficulteAccess().getDifficileEnumLiteralDeclaration_2()); 
                    // InternalTowerDefense.g:539:3: ( 'difficile' )
                    // InternalTowerDefense.g:539:4: 'difficile'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficulteAccess().getDifficileEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Difficulte__Alternatives"


    // $ANTLR start "rule__Jeu__Group__0"
    // InternalTowerDefense.g:547:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:551:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalTowerDefense.g:552:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Jeu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__1();

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
    // $ANTLR end "rule__Jeu__Group__0"


    // $ANTLR start "rule__Jeu__Group__0__Impl"
    // InternalTowerDefense.g:559:1: rule__Jeu__Group__0__Impl : ( 'Jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:563:1: ( ( 'Jeu' ) )
            // InternalTowerDefense.g:564:1: ( 'Jeu' )
            {
            // InternalTowerDefense.g:564:1: ( 'Jeu' )
            // InternalTowerDefense.g:565:2: 'Jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getJeuKeyword_0()); 

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
    // $ANTLR end "rule__Jeu__Group__0__Impl"


    // $ANTLR start "rule__Jeu__Group__1"
    // InternalTowerDefense.g:574:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:578:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalTowerDefense.g:579:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Jeu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__2();

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
    // $ANTLR end "rule__Jeu__Group__1"


    // $ANTLR start "rule__Jeu__Group__1__Impl"
    // InternalTowerDefense.g:586:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:590:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:591:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:591:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalTowerDefense.g:592:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:593:2: ( rule__Jeu__NameAssignment_1 )
            // InternalTowerDefense.g:593:3: rule__Jeu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Jeu__Group__1__Impl"


    // $ANTLR start "rule__Jeu__Group__2"
    // InternalTowerDefense.g:601:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:605:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalTowerDefense.g:606:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__3();

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
    // $ANTLR end "rule__Jeu__Group__2"


    // $ANTLR start "rule__Jeu__Group__2__Impl"
    // InternalTowerDefense.g:613:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:617:1: ( ( '{' ) )
            // InternalTowerDefense.g:618:1: ( '{' )
            {
            // InternalTowerDefense.g:618:1: ( '{' )
            // InternalTowerDefense.g:619:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Jeu__Group__2__Impl"


    // $ANTLR start "rule__Jeu__Group__3"
    // InternalTowerDefense.g:628:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:632:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalTowerDefense.g:633:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__4();

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
    // $ANTLR end "rule__Jeu__Group__3"


    // $ANTLR start "rule__Jeu__Group__3__Impl"
    // InternalTowerDefense.g:640:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__PartiesAssignment_3 )* ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:644:1: ( ( ( rule__Jeu__PartiesAssignment_3 )* ) )
            // InternalTowerDefense.g:645:1: ( ( rule__Jeu__PartiesAssignment_3 )* )
            {
            // InternalTowerDefense.g:645:1: ( ( rule__Jeu__PartiesAssignment_3 )* )
            // InternalTowerDefense.g:646:2: ( rule__Jeu__PartiesAssignment_3 )*
            {
             before(grammarAccess.getJeuAccess().getPartiesAssignment_3()); 
            // InternalTowerDefense.g:647:2: ( rule__Jeu__PartiesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTowerDefense.g:647:3: rule__Jeu__PartiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Jeu__PartiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getPartiesAssignment_3()); 

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
    // $ANTLR end "rule__Jeu__Group__3__Impl"


    // $ANTLR start "rule__Jeu__Group__4"
    // InternalTowerDefense.g:655:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:659:1: ( rule__Jeu__Group__4__Impl )
            // InternalTowerDefense.g:660:2: rule__Jeu__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__4__Impl();

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
    // $ANTLR end "rule__Jeu__Group__4"


    // $ANTLR start "rule__Jeu__Group__4__Impl"
    // InternalTowerDefense.g:666:1: rule__Jeu__Group__4__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:670:1: ( ( '}' ) )
            // InternalTowerDefense.g:671:1: ( '}' )
            {
            // InternalTowerDefense.g:671:1: ( '}' )
            // InternalTowerDefense.g:672:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Jeu__Group__4__Impl"


    // $ANTLR start "rule__Partie__Group__0"
    // InternalTowerDefense.g:682:1: rule__Partie__Group__0 : rule__Partie__Group__0__Impl rule__Partie__Group__1 ;
    public final void rule__Partie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:686:1: ( rule__Partie__Group__0__Impl rule__Partie__Group__1 )
            // InternalTowerDefense.g:687:2: rule__Partie__Group__0__Impl rule__Partie__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Partie__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partie__Group__1();

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
    // $ANTLR end "rule__Partie__Group__0"


    // $ANTLR start "rule__Partie__Group__0__Impl"
    // InternalTowerDefense.g:694:1: rule__Partie__Group__0__Impl : ( 'Partie' ) ;
    public final void rule__Partie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:698:1: ( ( 'Partie' ) )
            // InternalTowerDefense.g:699:1: ( 'Partie' )
            {
            // InternalTowerDefense.g:699:1: ( 'Partie' )
            // InternalTowerDefense.g:700:2: 'Partie'
            {
             before(grammarAccess.getPartieAccess().getPartieKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPartieAccess().getPartieKeyword_0()); 

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
    // $ANTLR end "rule__Partie__Group__0__Impl"


    // $ANTLR start "rule__Partie__Group__1"
    // InternalTowerDefense.g:709:1: rule__Partie__Group__1 : rule__Partie__Group__1__Impl rule__Partie__Group__2 ;
    public final void rule__Partie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:713:1: ( rule__Partie__Group__1__Impl rule__Partie__Group__2 )
            // InternalTowerDefense.g:714:2: rule__Partie__Group__1__Impl rule__Partie__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Partie__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partie__Group__2();

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
    // $ANTLR end "rule__Partie__Group__1"


    // $ANTLR start "rule__Partie__Group__1__Impl"
    // InternalTowerDefense.g:721:1: rule__Partie__Group__1__Impl : ( ( rule__Partie__NameAssignment_1 ) ) ;
    public final void rule__Partie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:725:1: ( ( ( rule__Partie__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:726:1: ( ( rule__Partie__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:726:1: ( ( rule__Partie__NameAssignment_1 ) )
            // InternalTowerDefense.g:727:2: ( rule__Partie__NameAssignment_1 )
            {
             before(grammarAccess.getPartieAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:728:2: ( rule__Partie__NameAssignment_1 )
            // InternalTowerDefense.g:728:3: rule__Partie__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Partie__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartieAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Partie__Group__1__Impl"


    // $ANTLR start "rule__Partie__Group__2"
    // InternalTowerDefense.g:736:1: rule__Partie__Group__2 : rule__Partie__Group__2__Impl rule__Partie__Group__3 ;
    public final void rule__Partie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:740:1: ( rule__Partie__Group__2__Impl rule__Partie__Group__3 )
            // InternalTowerDefense.g:741:2: rule__Partie__Group__2__Impl rule__Partie__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Partie__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partie__Group__3();

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
    // $ANTLR end "rule__Partie__Group__2"


    // $ANTLR start "rule__Partie__Group__2__Impl"
    // InternalTowerDefense.g:748:1: rule__Partie__Group__2__Impl : ( '{' ) ;
    public final void rule__Partie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:752:1: ( ( '{' ) )
            // InternalTowerDefense.g:753:1: ( '{' )
            {
            // InternalTowerDefense.g:753:1: ( '{' )
            // InternalTowerDefense.g:754:2: '{'
            {
             before(grammarAccess.getPartieAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPartieAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Partie__Group__2__Impl"


    // $ANTLR start "rule__Partie__Group__3"
    // InternalTowerDefense.g:763:1: rule__Partie__Group__3 : rule__Partie__Group__3__Impl rule__Partie__Group__4 ;
    public final void rule__Partie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:767:1: ( rule__Partie__Group__3__Impl rule__Partie__Group__4 )
            // InternalTowerDefense.g:768:2: rule__Partie__Group__3__Impl rule__Partie__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Partie__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partie__Group__4();

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
    // $ANTLR end "rule__Partie__Group__3"


    // $ANTLR start "rule__Partie__Group__3__Impl"
    // InternalTowerDefense.g:775:1: rule__Partie__Group__3__Impl : ( ( rule__Partie__CasesAssignment_3 )* ) ;
    public final void rule__Partie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:779:1: ( ( ( rule__Partie__CasesAssignment_3 )* ) )
            // InternalTowerDefense.g:780:1: ( ( rule__Partie__CasesAssignment_3 )* )
            {
            // InternalTowerDefense.g:780:1: ( ( rule__Partie__CasesAssignment_3 )* )
            // InternalTowerDefense.g:781:2: ( rule__Partie__CasesAssignment_3 )*
            {
             before(grammarAccess.getPartieAccess().getCasesAssignment_3()); 
            // InternalTowerDefense.g:782:2: ( rule__Partie__CasesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTowerDefense.g:782:3: rule__Partie__CasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Partie__CasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPartieAccess().getCasesAssignment_3()); 

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
    // $ANTLR end "rule__Partie__Group__3__Impl"


    // $ANTLR start "rule__Partie__Group__4"
    // InternalTowerDefense.g:790:1: rule__Partie__Group__4 : rule__Partie__Group__4__Impl rule__Partie__Group__5 ;
    public final void rule__Partie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:794:1: ( rule__Partie__Group__4__Impl rule__Partie__Group__5 )
            // InternalTowerDefense.g:795:2: rule__Partie__Group__4__Impl rule__Partie__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Partie__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partie__Group__5();

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
    // $ANTLR end "rule__Partie__Group__4"


    // $ANTLR start "rule__Partie__Group__4__Impl"
    // InternalTowerDefense.g:802:1: rule__Partie__Group__4__Impl : ( ( rule__Partie__CartesAssignment_4 )* ) ;
    public final void rule__Partie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:806:1: ( ( ( rule__Partie__CartesAssignment_4 )* ) )
            // InternalTowerDefense.g:807:1: ( ( rule__Partie__CartesAssignment_4 )* )
            {
            // InternalTowerDefense.g:807:1: ( ( rule__Partie__CartesAssignment_4 )* )
            // InternalTowerDefense.g:808:2: ( rule__Partie__CartesAssignment_4 )*
            {
             before(grammarAccess.getPartieAccess().getCartesAssignment_4()); 
            // InternalTowerDefense.g:809:2: ( rule__Partie__CartesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==51) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTowerDefense.g:809:3: rule__Partie__CartesAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Partie__CartesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPartieAccess().getCartesAssignment_4()); 

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
    // $ANTLR end "rule__Partie__Group__4__Impl"


    // $ANTLR start "rule__Partie__Group__5"
    // InternalTowerDefense.g:817:1: rule__Partie__Group__5 : rule__Partie__Group__5__Impl rule__Partie__Group__6 ;
    public final void rule__Partie__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:821:1: ( rule__Partie__Group__5__Impl rule__Partie__Group__6 )
            // InternalTowerDefense.g:822:2: rule__Partie__Group__5__Impl rule__Partie__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Partie__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partie__Group__6();

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
    // $ANTLR end "rule__Partie__Group__5"


    // $ANTLR start "rule__Partie__Group__5__Impl"
    // InternalTowerDefense.g:829:1: rule__Partie__Group__5__Impl : ( ( rule__Partie__PartieElementsAssignment_5 )* ) ;
    public final void rule__Partie__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:833:1: ( ( ( rule__Partie__PartieElementsAssignment_5 )* ) )
            // InternalTowerDefense.g:834:1: ( ( rule__Partie__PartieElementsAssignment_5 )* )
            {
            // InternalTowerDefense.g:834:1: ( ( rule__Partie__PartieElementsAssignment_5 )* )
            // InternalTowerDefense.g:835:2: ( rule__Partie__PartieElementsAssignment_5 )*
            {
             before(grammarAccess.getPartieAccess().getPartieElementsAssignment_5()); 
            // InternalTowerDefense.g:836:2: ( rule__Partie__PartieElementsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26||LA9_0==30||LA9_0==36||LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTowerDefense.g:836:3: rule__Partie__PartieElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Partie__PartieElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPartieAccess().getPartieElementsAssignment_5()); 

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
    // $ANTLR end "rule__Partie__Group__5__Impl"


    // $ANTLR start "rule__Partie__Group__6"
    // InternalTowerDefense.g:844:1: rule__Partie__Group__6 : rule__Partie__Group__6__Impl rule__Partie__Group__7 ;
    public final void rule__Partie__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:848:1: ( rule__Partie__Group__6__Impl rule__Partie__Group__7 )
            // InternalTowerDefense.g:849:2: rule__Partie__Group__6__Impl rule__Partie__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Partie__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partie__Group__7();

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
    // $ANTLR end "rule__Partie__Group__6"


    // $ANTLR start "rule__Partie__Group__6__Impl"
    // InternalTowerDefense.g:856:1: rule__Partie__Group__6__Impl : ( ( rule__Partie__NiveauxAssignment_6 )* ) ;
    public final void rule__Partie__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:860:1: ( ( ( rule__Partie__NiveauxAssignment_6 )* ) )
            // InternalTowerDefense.g:861:1: ( ( rule__Partie__NiveauxAssignment_6 )* )
            {
            // InternalTowerDefense.g:861:1: ( ( rule__Partie__NiveauxAssignment_6 )* )
            // InternalTowerDefense.g:862:2: ( rule__Partie__NiveauxAssignment_6 )*
            {
             before(grammarAccess.getPartieAccess().getNiveauxAssignment_6()); 
            // InternalTowerDefense.g:863:2: ( rule__Partie__NiveauxAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==47) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTowerDefense.g:863:3: rule__Partie__NiveauxAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Partie__NiveauxAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPartieAccess().getNiveauxAssignment_6()); 

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
    // $ANTLR end "rule__Partie__Group__6__Impl"


    // $ANTLR start "rule__Partie__Group__7"
    // InternalTowerDefense.g:871:1: rule__Partie__Group__7 : rule__Partie__Group__7__Impl ;
    public final void rule__Partie__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:875:1: ( rule__Partie__Group__7__Impl )
            // InternalTowerDefense.g:876:2: rule__Partie__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Partie__Group__7__Impl();

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
    // $ANTLR end "rule__Partie__Group__7"


    // $ANTLR start "rule__Partie__Group__7__Impl"
    // InternalTowerDefense.g:882:1: rule__Partie__Group__7__Impl : ( '}' ) ;
    public final void rule__Partie__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:886:1: ( ( '}' ) )
            // InternalTowerDefense.g:887:1: ( '}' )
            {
            // InternalTowerDefense.g:887:1: ( '}' )
            // InternalTowerDefense.g:888:2: '}'
            {
             before(grammarAccess.getPartieAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPartieAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Partie__Group__7__Impl"


    // $ANTLR start "rule__Obstacle__Group__0"
    // InternalTowerDefense.g:898:1: rule__Obstacle__Group__0 : rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1 ;
    public final void rule__Obstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:902:1: ( rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1 )
            // InternalTowerDefense.g:903:2: rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Obstacle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__1();

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
    // $ANTLR end "rule__Obstacle__Group__0"


    // $ANTLR start "rule__Obstacle__Group__0__Impl"
    // InternalTowerDefense.g:910:1: rule__Obstacle__Group__0__Impl : ( 'Obstacle' ) ;
    public final void rule__Obstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:914:1: ( ( 'Obstacle' ) )
            // InternalTowerDefense.g:915:1: ( 'Obstacle' )
            {
            // InternalTowerDefense.g:915:1: ( 'Obstacle' )
            // InternalTowerDefense.g:916:2: 'Obstacle'
            {
             before(grammarAccess.getObstacleAccess().getObstacleKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getObstacleKeyword_0()); 

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
    // $ANTLR end "rule__Obstacle__Group__0__Impl"


    // $ANTLR start "rule__Obstacle__Group__1"
    // InternalTowerDefense.g:925:1: rule__Obstacle__Group__1 : rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2 ;
    public final void rule__Obstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:929:1: ( rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2 )
            // InternalTowerDefense.g:930:2: rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Obstacle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__2();

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
    // $ANTLR end "rule__Obstacle__Group__1"


    // $ANTLR start "rule__Obstacle__Group__1__Impl"
    // InternalTowerDefense.g:937:1: rule__Obstacle__Group__1__Impl : ( ( rule__Obstacle__NameAssignment_1 ) ) ;
    public final void rule__Obstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:941:1: ( ( ( rule__Obstacle__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:942:1: ( ( rule__Obstacle__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:942:1: ( ( rule__Obstacle__NameAssignment_1 ) )
            // InternalTowerDefense.g:943:2: ( rule__Obstacle__NameAssignment_1 )
            {
             before(grammarAccess.getObstacleAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:944:2: ( rule__Obstacle__NameAssignment_1 )
            // InternalTowerDefense.g:944:3: rule__Obstacle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Obstacle__Group__1__Impl"


    // $ANTLR start "rule__Obstacle__Group__2"
    // InternalTowerDefense.g:952:1: rule__Obstacle__Group__2 : rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3 ;
    public final void rule__Obstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:956:1: ( rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3 )
            // InternalTowerDefense.g:957:2: rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Obstacle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__3();

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
    // $ANTLR end "rule__Obstacle__Group__2"


    // $ANTLR start "rule__Obstacle__Group__2__Impl"
    // InternalTowerDefense.g:964:1: rule__Obstacle__Group__2__Impl : ( '{' ) ;
    public final void rule__Obstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:968:1: ( ( '{' ) )
            // InternalTowerDefense.g:969:1: ( '{' )
            {
            // InternalTowerDefense.g:969:1: ( '{' )
            // InternalTowerDefense.g:970:2: '{'
            {
             before(grammarAccess.getObstacleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Obstacle__Group__2__Impl"


    // $ANTLR start "rule__Obstacle__Group__3"
    // InternalTowerDefense.g:979:1: rule__Obstacle__Group__3 : rule__Obstacle__Group__3__Impl rule__Obstacle__Group__4 ;
    public final void rule__Obstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:983:1: ( rule__Obstacle__Group__3__Impl rule__Obstacle__Group__4 )
            // InternalTowerDefense.g:984:2: rule__Obstacle__Group__3__Impl rule__Obstacle__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Obstacle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__4();

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
    // $ANTLR end "rule__Obstacle__Group__3"


    // $ANTLR start "rule__Obstacle__Group__3__Impl"
    // InternalTowerDefense.g:991:1: rule__Obstacle__Group__3__Impl : ( 'Campement' ) ;
    public final void rule__Obstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:995:1: ( ( 'Campement' ) )
            // InternalTowerDefense.g:996:1: ( 'Campement' )
            {
            // InternalTowerDefense.g:996:1: ( 'Campement' )
            // InternalTowerDefense.g:997:2: 'Campement'
            {
             before(grammarAccess.getObstacleAccess().getCampementKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getCampementKeyword_3()); 

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
    // $ANTLR end "rule__Obstacle__Group__3__Impl"


    // $ANTLR start "rule__Obstacle__Group__4"
    // InternalTowerDefense.g:1006:1: rule__Obstacle__Group__4 : rule__Obstacle__Group__4__Impl rule__Obstacle__Group__5 ;
    public final void rule__Obstacle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1010:1: ( rule__Obstacle__Group__4__Impl rule__Obstacle__Group__5 )
            // InternalTowerDefense.g:1011:2: rule__Obstacle__Group__4__Impl rule__Obstacle__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Obstacle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__5();

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
    // $ANTLR end "rule__Obstacle__Group__4"


    // $ANTLR start "rule__Obstacle__Group__4__Impl"
    // InternalTowerDefense.g:1018:1: rule__Obstacle__Group__4__Impl : ( ( rule__Obstacle__CampementAssignment_4 ) ) ;
    public final void rule__Obstacle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1022:1: ( ( ( rule__Obstacle__CampementAssignment_4 ) ) )
            // InternalTowerDefense.g:1023:1: ( ( rule__Obstacle__CampementAssignment_4 ) )
            {
            // InternalTowerDefense.g:1023:1: ( ( rule__Obstacle__CampementAssignment_4 ) )
            // InternalTowerDefense.g:1024:2: ( rule__Obstacle__CampementAssignment_4 )
            {
             before(grammarAccess.getObstacleAccess().getCampementAssignment_4()); 
            // InternalTowerDefense.g:1025:2: ( rule__Obstacle__CampementAssignment_4 )
            // InternalTowerDefense.g:1025:3: rule__Obstacle__CampementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__CampementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getCampementAssignment_4()); 

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
    // $ANTLR end "rule__Obstacle__Group__4__Impl"


    // $ANTLR start "rule__Obstacle__Group__5"
    // InternalTowerDefense.g:1033:1: rule__Obstacle__Group__5 : rule__Obstacle__Group__5__Impl rule__Obstacle__Group__6 ;
    public final void rule__Obstacle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1037:1: ( rule__Obstacle__Group__5__Impl rule__Obstacle__Group__6 )
            // InternalTowerDefense.g:1038:2: rule__Obstacle__Group__5__Impl rule__Obstacle__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Obstacle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__6();

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
    // $ANTLR end "rule__Obstacle__Group__5"


    // $ANTLR start "rule__Obstacle__Group__5__Impl"
    // InternalTowerDefense.g:1045:1: rule__Obstacle__Group__5__Impl : ( 'PVmax' ) ;
    public final void rule__Obstacle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1049:1: ( ( 'PVmax' ) )
            // InternalTowerDefense.g:1050:1: ( 'PVmax' )
            {
            // InternalTowerDefense.g:1050:1: ( 'PVmax' )
            // InternalTowerDefense.g:1051:2: 'PVmax'
            {
             before(grammarAccess.getObstacleAccess().getPVmaxKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getPVmaxKeyword_5()); 

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
    // $ANTLR end "rule__Obstacle__Group__5__Impl"


    // $ANTLR start "rule__Obstacle__Group__6"
    // InternalTowerDefense.g:1060:1: rule__Obstacle__Group__6 : rule__Obstacle__Group__6__Impl rule__Obstacle__Group__7 ;
    public final void rule__Obstacle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1064:1: ( rule__Obstacle__Group__6__Impl rule__Obstacle__Group__7 )
            // InternalTowerDefense.g:1065:2: rule__Obstacle__Group__6__Impl rule__Obstacle__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Obstacle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__7();

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
    // $ANTLR end "rule__Obstacle__Group__6"


    // $ANTLR start "rule__Obstacle__Group__6__Impl"
    // InternalTowerDefense.g:1072:1: rule__Obstacle__Group__6__Impl : ( ( rule__Obstacle__QuantiteEnergieMaxAssignment_6 ) ) ;
    public final void rule__Obstacle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1076:1: ( ( ( rule__Obstacle__QuantiteEnergieMaxAssignment_6 ) ) )
            // InternalTowerDefense.g:1077:1: ( ( rule__Obstacle__QuantiteEnergieMaxAssignment_6 ) )
            {
            // InternalTowerDefense.g:1077:1: ( ( rule__Obstacle__QuantiteEnergieMaxAssignment_6 ) )
            // InternalTowerDefense.g:1078:2: ( rule__Obstacle__QuantiteEnergieMaxAssignment_6 )
            {
             before(grammarAccess.getObstacleAccess().getQuantiteEnergieMaxAssignment_6()); 
            // InternalTowerDefense.g:1079:2: ( rule__Obstacle__QuantiteEnergieMaxAssignment_6 )
            // InternalTowerDefense.g:1079:3: rule__Obstacle__QuantiteEnergieMaxAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__QuantiteEnergieMaxAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getQuantiteEnergieMaxAssignment_6()); 

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
    // $ANTLR end "rule__Obstacle__Group__6__Impl"


    // $ANTLR start "rule__Obstacle__Group__7"
    // InternalTowerDefense.g:1087:1: rule__Obstacle__Group__7 : rule__Obstacle__Group__7__Impl rule__Obstacle__Group__8 ;
    public final void rule__Obstacle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1091:1: ( rule__Obstacle__Group__7__Impl rule__Obstacle__Group__8 )
            // InternalTowerDefense.g:1092:2: rule__Obstacle__Group__7__Impl rule__Obstacle__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Obstacle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__8();

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
    // $ANTLR end "rule__Obstacle__Group__7"


    // $ANTLR start "rule__Obstacle__Group__7__Impl"
    // InternalTowerDefense.g:1099:1: rule__Obstacle__Group__7__Impl : ( 'Tactique' ) ;
    public final void rule__Obstacle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1103:1: ( ( 'Tactique' ) )
            // InternalTowerDefense.g:1104:1: ( 'Tactique' )
            {
            // InternalTowerDefense.g:1104:1: ( 'Tactique' )
            // InternalTowerDefense.g:1105:2: 'Tactique'
            {
             before(grammarAccess.getObstacleAccess().getTactiqueKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getTactiqueKeyword_7()); 

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
    // $ANTLR end "rule__Obstacle__Group__7__Impl"


    // $ANTLR start "rule__Obstacle__Group__8"
    // InternalTowerDefense.g:1114:1: rule__Obstacle__Group__8 : rule__Obstacle__Group__8__Impl rule__Obstacle__Group__9 ;
    public final void rule__Obstacle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1118:1: ( rule__Obstacle__Group__8__Impl rule__Obstacle__Group__9 )
            // InternalTowerDefense.g:1119:2: rule__Obstacle__Group__8__Impl rule__Obstacle__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Obstacle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__9();

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
    // $ANTLR end "rule__Obstacle__Group__8"


    // $ANTLR start "rule__Obstacle__Group__8__Impl"
    // InternalTowerDefense.g:1126:1: rule__Obstacle__Group__8__Impl : ( ( rule__Obstacle__TactiqueAssignment_8 ) ) ;
    public final void rule__Obstacle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1130:1: ( ( ( rule__Obstacle__TactiqueAssignment_8 ) ) )
            // InternalTowerDefense.g:1131:1: ( ( rule__Obstacle__TactiqueAssignment_8 ) )
            {
            // InternalTowerDefense.g:1131:1: ( ( rule__Obstacle__TactiqueAssignment_8 ) )
            // InternalTowerDefense.g:1132:2: ( rule__Obstacle__TactiqueAssignment_8 )
            {
             before(grammarAccess.getObstacleAccess().getTactiqueAssignment_8()); 
            // InternalTowerDefense.g:1133:2: ( rule__Obstacle__TactiqueAssignment_8 )
            // InternalTowerDefense.g:1133:3: rule__Obstacle__TactiqueAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__TactiqueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getTactiqueAssignment_8()); 

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
    // $ANTLR end "rule__Obstacle__Group__8__Impl"


    // $ANTLR start "rule__Obstacle__Group__9"
    // InternalTowerDefense.g:1141:1: rule__Obstacle__Group__9 : rule__Obstacle__Group__9__Impl ;
    public final void rule__Obstacle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1145:1: ( rule__Obstacle__Group__9__Impl )
            // InternalTowerDefense.g:1146:2: rule__Obstacle__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__9__Impl();

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
    // $ANTLR end "rule__Obstacle__Group__9"


    // $ANTLR start "rule__Obstacle__Group__9__Impl"
    // InternalTowerDefense.g:1152:1: rule__Obstacle__Group__9__Impl : ( '}' ) ;
    public final void rule__Obstacle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1156:1: ( ( '}' ) )
            // InternalTowerDefense.g:1157:1: ( '}' )
            {
            // InternalTowerDefense.g:1157:1: ( '}' )
            // InternalTowerDefense.g:1158:2: '}'
            {
             before(grammarAccess.getObstacleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Obstacle__Group__9__Impl"


    // $ANTLR start "rule__Mobile__Group__0"
    // InternalTowerDefense.g:1168:1: rule__Mobile__Group__0 : rule__Mobile__Group__0__Impl rule__Mobile__Group__1 ;
    public final void rule__Mobile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1172:1: ( rule__Mobile__Group__0__Impl rule__Mobile__Group__1 )
            // InternalTowerDefense.g:1173:2: rule__Mobile__Group__0__Impl rule__Mobile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mobile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__1();

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
    // $ANTLR end "rule__Mobile__Group__0"


    // $ANTLR start "rule__Mobile__Group__0__Impl"
    // InternalTowerDefense.g:1180:1: rule__Mobile__Group__0__Impl : ( 'Mobile' ) ;
    public final void rule__Mobile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1184:1: ( ( 'Mobile' ) )
            // InternalTowerDefense.g:1185:1: ( 'Mobile' )
            {
            // InternalTowerDefense.g:1185:1: ( 'Mobile' )
            // InternalTowerDefense.g:1186:2: 'Mobile'
            {
             before(grammarAccess.getMobileAccess().getMobileKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getMobileKeyword_0()); 

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
    // $ANTLR end "rule__Mobile__Group__0__Impl"


    // $ANTLR start "rule__Mobile__Group__1"
    // InternalTowerDefense.g:1195:1: rule__Mobile__Group__1 : rule__Mobile__Group__1__Impl rule__Mobile__Group__2 ;
    public final void rule__Mobile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1199:1: ( rule__Mobile__Group__1__Impl rule__Mobile__Group__2 )
            // InternalTowerDefense.g:1200:2: rule__Mobile__Group__1__Impl rule__Mobile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Mobile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__2();

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
    // $ANTLR end "rule__Mobile__Group__1"


    // $ANTLR start "rule__Mobile__Group__1__Impl"
    // InternalTowerDefense.g:1207:1: rule__Mobile__Group__1__Impl : ( ( rule__Mobile__NameAssignment_1 ) ) ;
    public final void rule__Mobile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1211:1: ( ( ( rule__Mobile__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:1212:1: ( ( rule__Mobile__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:1212:1: ( ( rule__Mobile__NameAssignment_1 ) )
            // InternalTowerDefense.g:1213:2: ( rule__Mobile__NameAssignment_1 )
            {
             before(grammarAccess.getMobileAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:1214:2: ( rule__Mobile__NameAssignment_1 )
            // InternalTowerDefense.g:1214:3: rule__Mobile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Mobile__Group__1__Impl"


    // $ANTLR start "rule__Mobile__Group__2"
    // InternalTowerDefense.g:1222:1: rule__Mobile__Group__2 : rule__Mobile__Group__2__Impl rule__Mobile__Group__3 ;
    public final void rule__Mobile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1226:1: ( rule__Mobile__Group__2__Impl rule__Mobile__Group__3 )
            // InternalTowerDefense.g:1227:2: rule__Mobile__Group__2__Impl rule__Mobile__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Mobile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__3();

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
    // $ANTLR end "rule__Mobile__Group__2"


    // $ANTLR start "rule__Mobile__Group__2__Impl"
    // InternalTowerDefense.g:1234:1: rule__Mobile__Group__2__Impl : ( '{' ) ;
    public final void rule__Mobile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1238:1: ( ( '{' ) )
            // InternalTowerDefense.g:1239:1: ( '{' )
            {
            // InternalTowerDefense.g:1239:1: ( '{' )
            // InternalTowerDefense.g:1240:2: '{'
            {
             before(grammarAccess.getMobileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Mobile__Group__2__Impl"


    // $ANTLR start "rule__Mobile__Group__3"
    // InternalTowerDefense.g:1249:1: rule__Mobile__Group__3 : rule__Mobile__Group__3__Impl rule__Mobile__Group__4 ;
    public final void rule__Mobile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1253:1: ( rule__Mobile__Group__3__Impl rule__Mobile__Group__4 )
            // InternalTowerDefense.g:1254:2: rule__Mobile__Group__3__Impl rule__Mobile__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Mobile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__4();

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
    // $ANTLR end "rule__Mobile__Group__3"


    // $ANTLR start "rule__Mobile__Group__3__Impl"
    // InternalTowerDefense.g:1261:1: rule__Mobile__Group__3__Impl : ( 'F' ) ;
    public final void rule__Mobile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1265:1: ( ( 'F' ) )
            // InternalTowerDefense.g:1266:1: ( 'F' )
            {
            // InternalTowerDefense.g:1266:1: ( 'F' )
            // InternalTowerDefense.g:1267:2: 'F'
            {
             before(grammarAccess.getMobileAccess().getFKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getFKeyword_3()); 

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
    // $ANTLR end "rule__Mobile__Group__3__Impl"


    // $ANTLR start "rule__Mobile__Group__4"
    // InternalTowerDefense.g:1276:1: rule__Mobile__Group__4 : rule__Mobile__Group__4__Impl rule__Mobile__Group__5 ;
    public final void rule__Mobile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1280:1: ( rule__Mobile__Group__4__Impl rule__Mobile__Group__5 )
            // InternalTowerDefense.g:1281:2: rule__Mobile__Group__4__Impl rule__Mobile__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Mobile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__5();

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
    // $ANTLR end "rule__Mobile__Group__4"


    // $ANTLR start "rule__Mobile__Group__4__Impl"
    // InternalTowerDefense.g:1288:1: rule__Mobile__Group__4__Impl : ( ( rule__Mobile__ForceAssignment_4 ) ) ;
    public final void rule__Mobile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1292:1: ( ( ( rule__Mobile__ForceAssignment_4 ) ) )
            // InternalTowerDefense.g:1293:1: ( ( rule__Mobile__ForceAssignment_4 ) )
            {
            // InternalTowerDefense.g:1293:1: ( ( rule__Mobile__ForceAssignment_4 ) )
            // InternalTowerDefense.g:1294:2: ( rule__Mobile__ForceAssignment_4 )
            {
             before(grammarAccess.getMobileAccess().getForceAssignment_4()); 
            // InternalTowerDefense.g:1295:2: ( rule__Mobile__ForceAssignment_4 )
            // InternalTowerDefense.g:1295:3: rule__Mobile__ForceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__ForceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getForceAssignment_4()); 

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
    // $ANTLR end "rule__Mobile__Group__4__Impl"


    // $ANTLR start "rule__Mobile__Group__5"
    // InternalTowerDefense.g:1303:1: rule__Mobile__Group__5 : rule__Mobile__Group__5__Impl rule__Mobile__Group__6 ;
    public final void rule__Mobile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1307:1: ( rule__Mobile__Group__5__Impl rule__Mobile__Group__6 )
            // InternalTowerDefense.g:1308:2: rule__Mobile__Group__5__Impl rule__Mobile__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Mobile__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__6();

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
    // $ANTLR end "rule__Mobile__Group__5"


    // $ANTLR start "rule__Mobile__Group__5__Impl"
    // InternalTowerDefense.g:1315:1: rule__Mobile__Group__5__Impl : ( 'V' ) ;
    public final void rule__Mobile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1319:1: ( ( 'V' ) )
            // InternalTowerDefense.g:1320:1: ( 'V' )
            {
            // InternalTowerDefense.g:1320:1: ( 'V' )
            // InternalTowerDefense.g:1321:2: 'V'
            {
             before(grammarAccess.getMobileAccess().getVKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getVKeyword_5()); 

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
    // $ANTLR end "rule__Mobile__Group__5__Impl"


    // $ANTLR start "rule__Mobile__Group__6"
    // InternalTowerDefense.g:1330:1: rule__Mobile__Group__6 : rule__Mobile__Group__6__Impl rule__Mobile__Group__7 ;
    public final void rule__Mobile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1334:1: ( rule__Mobile__Group__6__Impl rule__Mobile__Group__7 )
            // InternalTowerDefense.g:1335:2: rule__Mobile__Group__6__Impl rule__Mobile__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Mobile__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__7();

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
    // $ANTLR end "rule__Mobile__Group__6"


    // $ANTLR start "rule__Mobile__Group__6__Impl"
    // InternalTowerDefense.g:1342:1: rule__Mobile__Group__6__Impl : ( ( rule__Mobile__VolumeAssignment_6 ) ) ;
    public final void rule__Mobile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1346:1: ( ( ( rule__Mobile__VolumeAssignment_6 ) ) )
            // InternalTowerDefense.g:1347:1: ( ( rule__Mobile__VolumeAssignment_6 ) )
            {
            // InternalTowerDefense.g:1347:1: ( ( rule__Mobile__VolumeAssignment_6 ) )
            // InternalTowerDefense.g:1348:2: ( rule__Mobile__VolumeAssignment_6 )
            {
             before(grammarAccess.getMobileAccess().getVolumeAssignment_6()); 
            // InternalTowerDefense.g:1349:2: ( rule__Mobile__VolumeAssignment_6 )
            // InternalTowerDefense.g:1349:3: rule__Mobile__VolumeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__VolumeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getVolumeAssignment_6()); 

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
    // $ANTLR end "rule__Mobile__Group__6__Impl"


    // $ANTLR start "rule__Mobile__Group__7"
    // InternalTowerDefense.g:1357:1: rule__Mobile__Group__7 : rule__Mobile__Group__7__Impl rule__Mobile__Group__8 ;
    public final void rule__Mobile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1361:1: ( rule__Mobile__Group__7__Impl rule__Mobile__Group__8 )
            // InternalTowerDefense.g:1362:2: rule__Mobile__Group__7__Impl rule__Mobile__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Mobile__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__8();

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
    // $ANTLR end "rule__Mobile__Group__7"


    // $ANTLR start "rule__Mobile__Group__7__Impl"
    // InternalTowerDefense.g:1369:1: rule__Mobile__Group__7__Impl : ( 'NumVague' ) ;
    public final void rule__Mobile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1373:1: ( ( 'NumVague' ) )
            // InternalTowerDefense.g:1374:1: ( 'NumVague' )
            {
            // InternalTowerDefense.g:1374:1: ( 'NumVague' )
            // InternalTowerDefense.g:1375:2: 'NumVague'
            {
             before(grammarAccess.getMobileAccess().getNumVagueKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getNumVagueKeyword_7()); 

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
    // $ANTLR end "rule__Mobile__Group__7__Impl"


    // $ANTLR start "rule__Mobile__Group__8"
    // InternalTowerDefense.g:1384:1: rule__Mobile__Group__8 : rule__Mobile__Group__8__Impl rule__Mobile__Group__9 ;
    public final void rule__Mobile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1388:1: ( rule__Mobile__Group__8__Impl rule__Mobile__Group__9 )
            // InternalTowerDefense.g:1389:2: rule__Mobile__Group__8__Impl rule__Mobile__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Mobile__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__9();

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
    // $ANTLR end "rule__Mobile__Group__8"


    // $ANTLR start "rule__Mobile__Group__8__Impl"
    // InternalTowerDefense.g:1396:1: rule__Mobile__Group__8__Impl : ( ( rule__Mobile__NumVagueAssignment_8 ) ) ;
    public final void rule__Mobile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1400:1: ( ( ( rule__Mobile__NumVagueAssignment_8 ) ) )
            // InternalTowerDefense.g:1401:1: ( ( rule__Mobile__NumVagueAssignment_8 ) )
            {
            // InternalTowerDefense.g:1401:1: ( ( rule__Mobile__NumVagueAssignment_8 ) )
            // InternalTowerDefense.g:1402:2: ( rule__Mobile__NumVagueAssignment_8 )
            {
             before(grammarAccess.getMobileAccess().getNumVagueAssignment_8()); 
            // InternalTowerDefense.g:1403:2: ( rule__Mobile__NumVagueAssignment_8 )
            // InternalTowerDefense.g:1403:3: rule__Mobile__NumVagueAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__NumVagueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getNumVagueAssignment_8()); 

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
    // $ANTLR end "rule__Mobile__Group__8__Impl"


    // $ANTLR start "rule__Mobile__Group__9"
    // InternalTowerDefense.g:1411:1: rule__Mobile__Group__9 : rule__Mobile__Group__9__Impl rule__Mobile__Group__10 ;
    public final void rule__Mobile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1415:1: ( rule__Mobile__Group__9__Impl rule__Mobile__Group__10 )
            // InternalTowerDefense.g:1416:2: rule__Mobile__Group__9__Impl rule__Mobile__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__Mobile__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__10();

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
    // $ANTLR end "rule__Mobile__Group__9"


    // $ANTLR start "rule__Mobile__Group__9__Impl"
    // InternalTowerDefense.g:1423:1: rule__Mobile__Group__9__Impl : ( 'In' ) ;
    public final void rule__Mobile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1427:1: ( ( 'In' ) )
            // InternalTowerDefense.g:1428:1: ( 'In' )
            {
            // InternalTowerDefense.g:1428:1: ( 'In' )
            // InternalTowerDefense.g:1429:2: 'In'
            {
             before(grammarAccess.getMobileAccess().getInKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getInKeyword_9()); 

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
    // $ANTLR end "rule__Mobile__Group__9__Impl"


    // $ANTLR start "rule__Mobile__Group__10"
    // InternalTowerDefense.g:1438:1: rule__Mobile__Group__10 : rule__Mobile__Group__10__Impl rule__Mobile__Group__11 ;
    public final void rule__Mobile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1442:1: ( rule__Mobile__Group__10__Impl rule__Mobile__Group__11 )
            // InternalTowerDefense.g:1443:2: rule__Mobile__Group__10__Impl rule__Mobile__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__Mobile__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__11();

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
    // $ANTLR end "rule__Mobile__Group__10"


    // $ANTLR start "rule__Mobile__Group__10__Impl"
    // InternalTowerDefense.g:1450:1: rule__Mobile__Group__10__Impl : ( ( rule__Mobile__CaseEntreeAssignment_10 ) ) ;
    public final void rule__Mobile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1454:1: ( ( ( rule__Mobile__CaseEntreeAssignment_10 ) ) )
            // InternalTowerDefense.g:1455:1: ( ( rule__Mobile__CaseEntreeAssignment_10 ) )
            {
            // InternalTowerDefense.g:1455:1: ( ( rule__Mobile__CaseEntreeAssignment_10 ) )
            // InternalTowerDefense.g:1456:2: ( rule__Mobile__CaseEntreeAssignment_10 )
            {
             before(grammarAccess.getMobileAccess().getCaseEntreeAssignment_10()); 
            // InternalTowerDefense.g:1457:2: ( rule__Mobile__CaseEntreeAssignment_10 )
            // InternalTowerDefense.g:1457:3: rule__Mobile__CaseEntreeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__CaseEntreeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getCaseEntreeAssignment_10()); 

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
    // $ANTLR end "rule__Mobile__Group__10__Impl"


    // $ANTLR start "rule__Mobile__Group__11"
    // InternalTowerDefense.g:1465:1: rule__Mobile__Group__11 : rule__Mobile__Group__11__Impl rule__Mobile__Group__12 ;
    public final void rule__Mobile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1469:1: ( rule__Mobile__Group__11__Impl rule__Mobile__Group__12 )
            // InternalTowerDefense.g:1470:2: rule__Mobile__Group__11__Impl rule__Mobile__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__Mobile__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__12();

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
    // $ANTLR end "rule__Mobile__Group__11"


    // $ANTLR start "rule__Mobile__Group__11__Impl"
    // InternalTowerDefense.g:1477:1: rule__Mobile__Group__11__Impl : ( 'Out' ) ;
    public final void rule__Mobile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1481:1: ( ( 'Out' ) )
            // InternalTowerDefense.g:1482:1: ( 'Out' )
            {
            // InternalTowerDefense.g:1482:1: ( 'Out' )
            // InternalTowerDefense.g:1483:2: 'Out'
            {
             before(grammarAccess.getMobileAccess().getOutKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getOutKeyword_11()); 

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
    // $ANTLR end "rule__Mobile__Group__11__Impl"


    // $ANTLR start "rule__Mobile__Group__12"
    // InternalTowerDefense.g:1492:1: rule__Mobile__Group__12 : rule__Mobile__Group__12__Impl rule__Mobile__Group__13 ;
    public final void rule__Mobile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1496:1: ( rule__Mobile__Group__12__Impl rule__Mobile__Group__13 )
            // InternalTowerDefense.g:1497:2: rule__Mobile__Group__12__Impl rule__Mobile__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Mobile__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__13();

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
    // $ANTLR end "rule__Mobile__Group__12"


    // $ANTLR start "rule__Mobile__Group__12__Impl"
    // InternalTowerDefense.g:1504:1: rule__Mobile__Group__12__Impl : ( ( rule__Mobile__CaseSortieAssignment_12 ) ) ;
    public final void rule__Mobile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1508:1: ( ( ( rule__Mobile__CaseSortieAssignment_12 ) ) )
            // InternalTowerDefense.g:1509:1: ( ( rule__Mobile__CaseSortieAssignment_12 ) )
            {
            // InternalTowerDefense.g:1509:1: ( ( rule__Mobile__CaseSortieAssignment_12 ) )
            // InternalTowerDefense.g:1510:2: ( rule__Mobile__CaseSortieAssignment_12 )
            {
             before(grammarAccess.getMobileAccess().getCaseSortieAssignment_12()); 
            // InternalTowerDefense.g:1511:2: ( rule__Mobile__CaseSortieAssignment_12 )
            // InternalTowerDefense.g:1511:3: rule__Mobile__CaseSortieAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__CaseSortieAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getCaseSortieAssignment_12()); 

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
    // $ANTLR end "rule__Mobile__Group__12__Impl"


    // $ANTLR start "rule__Mobile__Group__13"
    // InternalTowerDefense.g:1519:1: rule__Mobile__Group__13 : rule__Mobile__Group__13__Impl rule__Mobile__Group__14 ;
    public final void rule__Mobile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1523:1: ( rule__Mobile__Group__13__Impl rule__Mobile__Group__14 )
            // InternalTowerDefense.g:1524:2: rule__Mobile__Group__13__Impl rule__Mobile__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Mobile__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__14();

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
    // $ANTLR end "rule__Mobile__Group__13"


    // $ANTLR start "rule__Mobile__Group__13__Impl"
    // InternalTowerDefense.g:1531:1: rule__Mobile__Group__13__Impl : ( 'PVmax' ) ;
    public final void rule__Mobile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1535:1: ( ( 'PVmax' ) )
            // InternalTowerDefense.g:1536:1: ( 'PVmax' )
            {
            // InternalTowerDefense.g:1536:1: ( 'PVmax' )
            // InternalTowerDefense.g:1537:2: 'PVmax'
            {
             before(grammarAccess.getMobileAccess().getPVmaxKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getPVmaxKeyword_13()); 

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
    // $ANTLR end "rule__Mobile__Group__13__Impl"


    // $ANTLR start "rule__Mobile__Group__14"
    // InternalTowerDefense.g:1546:1: rule__Mobile__Group__14 : rule__Mobile__Group__14__Impl rule__Mobile__Group__15 ;
    public final void rule__Mobile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1550:1: ( rule__Mobile__Group__14__Impl rule__Mobile__Group__15 )
            // InternalTowerDefense.g:1551:2: rule__Mobile__Group__14__Impl rule__Mobile__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__Mobile__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__15();

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
    // $ANTLR end "rule__Mobile__Group__14"


    // $ANTLR start "rule__Mobile__Group__14__Impl"
    // InternalTowerDefense.g:1558:1: rule__Mobile__Group__14__Impl : ( ( rule__Mobile__QuantiteEnergieMaxAssignment_14 ) ) ;
    public final void rule__Mobile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1562:1: ( ( ( rule__Mobile__QuantiteEnergieMaxAssignment_14 ) ) )
            // InternalTowerDefense.g:1563:1: ( ( rule__Mobile__QuantiteEnergieMaxAssignment_14 ) )
            {
            // InternalTowerDefense.g:1563:1: ( ( rule__Mobile__QuantiteEnergieMaxAssignment_14 ) )
            // InternalTowerDefense.g:1564:2: ( rule__Mobile__QuantiteEnergieMaxAssignment_14 )
            {
             before(grammarAccess.getMobileAccess().getQuantiteEnergieMaxAssignment_14()); 
            // InternalTowerDefense.g:1565:2: ( rule__Mobile__QuantiteEnergieMaxAssignment_14 )
            // InternalTowerDefense.g:1565:3: rule__Mobile__QuantiteEnergieMaxAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__QuantiteEnergieMaxAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getQuantiteEnergieMaxAssignment_14()); 

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
    // $ANTLR end "rule__Mobile__Group__14__Impl"


    // $ANTLR start "rule__Mobile__Group__15"
    // InternalTowerDefense.g:1573:1: rule__Mobile__Group__15 : rule__Mobile__Group__15__Impl rule__Mobile__Group__16 ;
    public final void rule__Mobile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1577:1: ( rule__Mobile__Group__15__Impl rule__Mobile__Group__16 )
            // InternalTowerDefense.g:1578:2: rule__Mobile__Group__15__Impl rule__Mobile__Group__16
            {
            pushFollow(FOLLOW_16);
            rule__Mobile__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__16();

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
    // $ANTLR end "rule__Mobile__Group__15"


    // $ANTLR start "rule__Mobile__Group__15__Impl"
    // InternalTowerDefense.g:1585:1: rule__Mobile__Group__15__Impl : ( 'Tactique' ) ;
    public final void rule__Mobile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1589:1: ( ( 'Tactique' ) )
            // InternalTowerDefense.g:1590:1: ( 'Tactique' )
            {
            // InternalTowerDefense.g:1590:1: ( 'Tactique' )
            // InternalTowerDefense.g:1591:2: 'Tactique'
            {
             before(grammarAccess.getMobileAccess().getTactiqueKeyword_15()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getTactiqueKeyword_15()); 

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
    // $ANTLR end "rule__Mobile__Group__15__Impl"


    // $ANTLR start "rule__Mobile__Group__16"
    // InternalTowerDefense.g:1600:1: rule__Mobile__Group__16 : rule__Mobile__Group__16__Impl rule__Mobile__Group__17 ;
    public final void rule__Mobile__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1604:1: ( rule__Mobile__Group__16__Impl rule__Mobile__Group__17 )
            // InternalTowerDefense.g:1605:2: rule__Mobile__Group__16__Impl rule__Mobile__Group__17
            {
            pushFollow(FOLLOW_17);
            rule__Mobile__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__17();

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
    // $ANTLR end "rule__Mobile__Group__16"


    // $ANTLR start "rule__Mobile__Group__16__Impl"
    // InternalTowerDefense.g:1612:1: rule__Mobile__Group__16__Impl : ( ( rule__Mobile__TactiqueAssignment_16 ) ) ;
    public final void rule__Mobile__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1616:1: ( ( ( rule__Mobile__TactiqueAssignment_16 ) ) )
            // InternalTowerDefense.g:1617:1: ( ( rule__Mobile__TactiqueAssignment_16 ) )
            {
            // InternalTowerDefense.g:1617:1: ( ( rule__Mobile__TactiqueAssignment_16 ) )
            // InternalTowerDefense.g:1618:2: ( rule__Mobile__TactiqueAssignment_16 )
            {
             before(grammarAccess.getMobileAccess().getTactiqueAssignment_16()); 
            // InternalTowerDefense.g:1619:2: ( rule__Mobile__TactiqueAssignment_16 )
            // InternalTowerDefense.g:1619:3: rule__Mobile__TactiqueAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__TactiqueAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getTactiqueAssignment_16()); 

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
    // $ANTLR end "rule__Mobile__Group__16__Impl"


    // $ANTLR start "rule__Mobile__Group__17"
    // InternalTowerDefense.g:1627:1: rule__Mobile__Group__17 : rule__Mobile__Group__17__Impl ;
    public final void rule__Mobile__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1631:1: ( rule__Mobile__Group__17__Impl )
            // InternalTowerDefense.g:1632:2: rule__Mobile__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__Group__17__Impl();

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
    // $ANTLR end "rule__Mobile__Group__17"


    // $ANTLR start "rule__Mobile__Group__17__Impl"
    // InternalTowerDefense.g:1638:1: rule__Mobile__Group__17__Impl : ( '}' ) ;
    public final void rule__Mobile__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1642:1: ( ( '}' ) )
            // InternalTowerDefense.g:1643:1: ( '}' )
            {
            // InternalTowerDefense.g:1643:1: ( '}' )
            // InternalTowerDefense.g:1644:2: '}'
            {
             before(grammarAccess.getMobileAccess().getRightCurlyBracketKeyword_17()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__Mobile__Group__17__Impl"


    // $ANTLR start "rule__Projectile__Group__0"
    // InternalTowerDefense.g:1654:1: rule__Projectile__Group__0 : rule__Projectile__Group__0__Impl rule__Projectile__Group__1 ;
    public final void rule__Projectile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1658:1: ( rule__Projectile__Group__0__Impl rule__Projectile__Group__1 )
            // InternalTowerDefense.g:1659:2: rule__Projectile__Group__0__Impl rule__Projectile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Projectile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__1();

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
    // $ANTLR end "rule__Projectile__Group__0"


    // $ANTLR start "rule__Projectile__Group__0__Impl"
    // InternalTowerDefense.g:1666:1: rule__Projectile__Group__0__Impl : ( 'Projectile' ) ;
    public final void rule__Projectile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1670:1: ( ( 'Projectile' ) )
            // InternalTowerDefense.g:1671:1: ( 'Projectile' )
            {
            // InternalTowerDefense.g:1671:1: ( 'Projectile' )
            // InternalTowerDefense.g:1672:2: 'Projectile'
            {
             before(grammarAccess.getProjectileAccess().getProjectileKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getProjectileKeyword_0()); 

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
    // $ANTLR end "rule__Projectile__Group__0__Impl"


    // $ANTLR start "rule__Projectile__Group__1"
    // InternalTowerDefense.g:1681:1: rule__Projectile__Group__1 : rule__Projectile__Group__1__Impl rule__Projectile__Group__2 ;
    public final void rule__Projectile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1685:1: ( rule__Projectile__Group__1__Impl rule__Projectile__Group__2 )
            // InternalTowerDefense.g:1686:2: rule__Projectile__Group__1__Impl rule__Projectile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Projectile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__2();

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
    // $ANTLR end "rule__Projectile__Group__1"


    // $ANTLR start "rule__Projectile__Group__1__Impl"
    // InternalTowerDefense.g:1693:1: rule__Projectile__Group__1__Impl : ( ( rule__Projectile__NameAssignment_1 ) ) ;
    public final void rule__Projectile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1697:1: ( ( ( rule__Projectile__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:1698:1: ( ( rule__Projectile__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:1698:1: ( ( rule__Projectile__NameAssignment_1 ) )
            // InternalTowerDefense.g:1699:2: ( rule__Projectile__NameAssignment_1 )
            {
             before(grammarAccess.getProjectileAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:1700:2: ( rule__Projectile__NameAssignment_1 )
            // InternalTowerDefense.g:1700:3: rule__Projectile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectileAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Projectile__Group__1__Impl"


    // $ANTLR start "rule__Projectile__Group__2"
    // InternalTowerDefense.g:1708:1: rule__Projectile__Group__2 : rule__Projectile__Group__2__Impl rule__Projectile__Group__3 ;
    public final void rule__Projectile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1712:1: ( rule__Projectile__Group__2__Impl rule__Projectile__Group__3 )
            // InternalTowerDefense.g:1713:2: rule__Projectile__Group__2__Impl rule__Projectile__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Projectile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__3();

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
    // $ANTLR end "rule__Projectile__Group__2"


    // $ANTLR start "rule__Projectile__Group__2__Impl"
    // InternalTowerDefense.g:1720:1: rule__Projectile__Group__2__Impl : ( '{' ) ;
    public final void rule__Projectile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1724:1: ( ( '{' ) )
            // InternalTowerDefense.g:1725:1: ( '{' )
            {
            // InternalTowerDefense.g:1725:1: ( '{' )
            // InternalTowerDefense.g:1726:2: '{'
            {
             before(grammarAccess.getProjectileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Projectile__Group__2__Impl"


    // $ANTLR start "rule__Projectile__Group__3"
    // InternalTowerDefense.g:1735:1: rule__Projectile__Group__3 : rule__Projectile__Group__3__Impl rule__Projectile__Group__4 ;
    public final void rule__Projectile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1739:1: ( rule__Projectile__Group__3__Impl rule__Projectile__Group__4 )
            // InternalTowerDefense.g:1740:2: rule__Projectile__Group__3__Impl rule__Projectile__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Projectile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__4();

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
    // $ANTLR end "rule__Projectile__Group__3"


    // $ANTLR start "rule__Projectile__Group__3__Impl"
    // InternalTowerDefense.g:1747:1: rule__Projectile__Group__3__Impl : ( 'Portee' ) ;
    public final void rule__Projectile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1751:1: ( ( 'Portee' ) )
            // InternalTowerDefense.g:1752:1: ( 'Portee' )
            {
            // InternalTowerDefense.g:1752:1: ( 'Portee' )
            // InternalTowerDefense.g:1753:2: 'Portee'
            {
             before(grammarAccess.getProjectileAccess().getPorteeKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getPorteeKeyword_3()); 

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
    // $ANTLR end "rule__Projectile__Group__3__Impl"


    // $ANTLR start "rule__Projectile__Group__4"
    // InternalTowerDefense.g:1762:1: rule__Projectile__Group__4 : rule__Projectile__Group__4__Impl rule__Projectile__Group__5 ;
    public final void rule__Projectile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1766:1: ( rule__Projectile__Group__4__Impl rule__Projectile__Group__5 )
            // InternalTowerDefense.g:1767:2: rule__Projectile__Group__4__Impl rule__Projectile__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Projectile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__5();

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
    // $ANTLR end "rule__Projectile__Group__4"


    // $ANTLR start "rule__Projectile__Group__4__Impl"
    // InternalTowerDefense.g:1774:1: rule__Projectile__Group__4__Impl : ( ( rule__Projectile__PorteeAssignment_4 ) ) ;
    public final void rule__Projectile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1778:1: ( ( ( rule__Projectile__PorteeAssignment_4 ) ) )
            // InternalTowerDefense.g:1779:1: ( ( rule__Projectile__PorteeAssignment_4 ) )
            {
            // InternalTowerDefense.g:1779:1: ( ( rule__Projectile__PorteeAssignment_4 ) )
            // InternalTowerDefense.g:1780:2: ( rule__Projectile__PorteeAssignment_4 )
            {
             before(grammarAccess.getProjectileAccess().getPorteeAssignment_4()); 
            // InternalTowerDefense.g:1781:2: ( rule__Projectile__PorteeAssignment_4 )
            // InternalTowerDefense.g:1781:3: rule__Projectile__PorteeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__PorteeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProjectileAccess().getPorteeAssignment_4()); 

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
    // $ANTLR end "rule__Projectile__Group__4__Impl"


    // $ANTLR start "rule__Projectile__Group__5"
    // InternalTowerDefense.g:1789:1: rule__Projectile__Group__5 : rule__Projectile__Group__5__Impl rule__Projectile__Group__6 ;
    public final void rule__Projectile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1793:1: ( rule__Projectile__Group__5__Impl rule__Projectile__Group__6 )
            // InternalTowerDefense.g:1794:2: rule__Projectile__Group__5__Impl rule__Projectile__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Projectile__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__6();

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
    // $ANTLR end "rule__Projectile__Group__5"


    // $ANTLR start "rule__Projectile__Group__5__Impl"
    // InternalTowerDefense.g:1801:1: rule__Projectile__Group__5__Impl : ( 'Masse' ) ;
    public final void rule__Projectile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1805:1: ( ( 'Masse' ) )
            // InternalTowerDefense.g:1806:1: ( 'Masse' )
            {
            // InternalTowerDefense.g:1806:1: ( 'Masse' )
            // InternalTowerDefense.g:1807:2: 'Masse'
            {
             before(grammarAccess.getProjectileAccess().getMasseKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getMasseKeyword_5()); 

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
    // $ANTLR end "rule__Projectile__Group__5__Impl"


    // $ANTLR start "rule__Projectile__Group__6"
    // InternalTowerDefense.g:1816:1: rule__Projectile__Group__6 : rule__Projectile__Group__6__Impl rule__Projectile__Group__7 ;
    public final void rule__Projectile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1820:1: ( rule__Projectile__Group__6__Impl rule__Projectile__Group__7 )
            // InternalTowerDefense.g:1821:2: rule__Projectile__Group__6__Impl rule__Projectile__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Projectile__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__7();

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
    // $ANTLR end "rule__Projectile__Group__6"


    // $ANTLR start "rule__Projectile__Group__6__Impl"
    // InternalTowerDefense.g:1828:1: rule__Projectile__Group__6__Impl : ( ( rule__Projectile__MasseAssignment_6 ) ) ;
    public final void rule__Projectile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1832:1: ( ( ( rule__Projectile__MasseAssignment_6 ) ) )
            // InternalTowerDefense.g:1833:1: ( ( rule__Projectile__MasseAssignment_6 ) )
            {
            // InternalTowerDefense.g:1833:1: ( ( rule__Projectile__MasseAssignment_6 ) )
            // InternalTowerDefense.g:1834:2: ( rule__Projectile__MasseAssignment_6 )
            {
             before(grammarAccess.getProjectileAccess().getMasseAssignment_6()); 
            // InternalTowerDefense.g:1835:2: ( rule__Projectile__MasseAssignment_6 )
            // InternalTowerDefense.g:1835:3: rule__Projectile__MasseAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__MasseAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProjectileAccess().getMasseAssignment_6()); 

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
    // $ANTLR end "rule__Projectile__Group__6__Impl"


    // $ANTLR start "rule__Projectile__Group__7"
    // InternalTowerDefense.g:1843:1: rule__Projectile__Group__7 : rule__Projectile__Group__7__Impl rule__Projectile__Group__8 ;
    public final void rule__Projectile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1847:1: ( rule__Projectile__Group__7__Impl rule__Projectile__Group__8 )
            // InternalTowerDefense.g:1848:2: rule__Projectile__Group__7__Impl rule__Projectile__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Projectile__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__8();

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
    // $ANTLR end "rule__Projectile__Group__7"


    // $ANTLR start "rule__Projectile__Group__7__Impl"
    // InternalTowerDefense.g:1855:1: rule__Projectile__Group__7__Impl : ( 'Vitesse' ) ;
    public final void rule__Projectile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1859:1: ( ( 'Vitesse' ) )
            // InternalTowerDefense.g:1860:1: ( 'Vitesse' )
            {
            // InternalTowerDefense.g:1860:1: ( 'Vitesse' )
            // InternalTowerDefense.g:1861:2: 'Vitesse'
            {
             before(grammarAccess.getProjectileAccess().getVitesseKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getVitesseKeyword_7()); 

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
    // $ANTLR end "rule__Projectile__Group__7__Impl"


    // $ANTLR start "rule__Projectile__Group__8"
    // InternalTowerDefense.g:1870:1: rule__Projectile__Group__8 : rule__Projectile__Group__8__Impl rule__Projectile__Group__9 ;
    public final void rule__Projectile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1874:1: ( rule__Projectile__Group__8__Impl rule__Projectile__Group__9 )
            // InternalTowerDefense.g:1875:2: rule__Projectile__Group__8__Impl rule__Projectile__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Projectile__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__9();

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
    // $ANTLR end "rule__Projectile__Group__8"


    // $ANTLR start "rule__Projectile__Group__8__Impl"
    // InternalTowerDefense.g:1882:1: rule__Projectile__Group__8__Impl : ( ( rule__Projectile__VitesseAssignment_8 ) ) ;
    public final void rule__Projectile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1886:1: ( ( ( rule__Projectile__VitesseAssignment_8 ) ) )
            // InternalTowerDefense.g:1887:1: ( ( rule__Projectile__VitesseAssignment_8 ) )
            {
            // InternalTowerDefense.g:1887:1: ( ( rule__Projectile__VitesseAssignment_8 ) )
            // InternalTowerDefense.g:1888:2: ( rule__Projectile__VitesseAssignment_8 )
            {
             before(grammarAccess.getProjectileAccess().getVitesseAssignment_8()); 
            // InternalTowerDefense.g:1889:2: ( rule__Projectile__VitesseAssignment_8 )
            // InternalTowerDefense.g:1889:3: rule__Projectile__VitesseAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__VitesseAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProjectileAccess().getVitesseAssignment_8()); 

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
    // $ANTLR end "rule__Projectile__Group__8__Impl"


    // $ANTLR start "rule__Projectile__Group__9"
    // InternalTowerDefense.g:1897:1: rule__Projectile__Group__9 : rule__Projectile__Group__9__Impl rule__Projectile__Group__10 ;
    public final void rule__Projectile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1901:1: ( rule__Projectile__Group__9__Impl rule__Projectile__Group__10 )
            // InternalTowerDefense.g:1902:2: rule__Projectile__Group__9__Impl rule__Projectile__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__Projectile__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__10();

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
    // $ANTLR end "rule__Projectile__Group__9"


    // $ANTLR start "rule__Projectile__Group__9__Impl"
    // InternalTowerDefense.g:1909:1: rule__Projectile__Group__9__Impl : ( 'Position' ) ;
    public final void rule__Projectile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1913:1: ( ( 'Position' ) )
            // InternalTowerDefense.g:1914:1: ( 'Position' )
            {
            // InternalTowerDefense.g:1914:1: ( 'Position' )
            // InternalTowerDefense.g:1915:2: 'Position'
            {
             before(grammarAccess.getProjectileAccess().getPositionKeyword_9()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getPositionKeyword_9()); 

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
    // $ANTLR end "rule__Projectile__Group__9__Impl"


    // $ANTLR start "rule__Projectile__Group__10"
    // InternalTowerDefense.g:1924:1: rule__Projectile__Group__10 : rule__Projectile__Group__10__Impl rule__Projectile__Group__11 ;
    public final void rule__Projectile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1928:1: ( rule__Projectile__Group__10__Impl rule__Projectile__Group__11 )
            // InternalTowerDefense.g:1929:2: rule__Projectile__Group__10__Impl rule__Projectile__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Projectile__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__11();

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
    // $ANTLR end "rule__Projectile__Group__10"


    // $ANTLR start "rule__Projectile__Group__10__Impl"
    // InternalTowerDefense.g:1936:1: rule__Projectile__Group__10__Impl : ( ( rule__Projectile__CaseAssignment_10 ) ) ;
    public final void rule__Projectile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1940:1: ( ( ( rule__Projectile__CaseAssignment_10 ) ) )
            // InternalTowerDefense.g:1941:1: ( ( rule__Projectile__CaseAssignment_10 ) )
            {
            // InternalTowerDefense.g:1941:1: ( ( rule__Projectile__CaseAssignment_10 ) )
            // InternalTowerDefense.g:1942:2: ( rule__Projectile__CaseAssignment_10 )
            {
             before(grammarAccess.getProjectileAccess().getCaseAssignment_10()); 
            // InternalTowerDefense.g:1943:2: ( rule__Projectile__CaseAssignment_10 )
            // InternalTowerDefense.g:1943:3: rule__Projectile__CaseAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__CaseAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getProjectileAccess().getCaseAssignment_10()); 

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
    // $ANTLR end "rule__Projectile__Group__10__Impl"


    // $ANTLR start "rule__Projectile__Group__11"
    // InternalTowerDefense.g:1951:1: rule__Projectile__Group__11 : rule__Projectile__Group__11__Impl rule__Projectile__Group__12 ;
    public final void rule__Projectile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1955:1: ( rule__Projectile__Group__11__Impl rule__Projectile__Group__12 )
            // InternalTowerDefense.g:1956:2: rule__Projectile__Group__11__Impl rule__Projectile__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__Projectile__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__12();

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
    // $ANTLR end "rule__Projectile__Group__11"


    // $ANTLR start "rule__Projectile__Group__11__Impl"
    // InternalTowerDefense.g:1963:1: rule__Projectile__Group__11__Impl : ( 'Direction' ) ;
    public final void rule__Projectile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1967:1: ( ( 'Direction' ) )
            // InternalTowerDefense.g:1968:1: ( 'Direction' )
            {
            // InternalTowerDefense.g:1968:1: ( 'Direction' )
            // InternalTowerDefense.g:1969:2: 'Direction'
            {
             before(grammarAccess.getProjectileAccess().getDirectionKeyword_11()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getDirectionKeyword_11()); 

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
    // $ANTLR end "rule__Projectile__Group__11__Impl"


    // $ANTLR start "rule__Projectile__Group__12"
    // InternalTowerDefense.g:1978:1: rule__Projectile__Group__12 : rule__Projectile__Group__12__Impl rule__Projectile__Group__13 ;
    public final void rule__Projectile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1982:1: ( rule__Projectile__Group__12__Impl rule__Projectile__Group__13 )
            // InternalTowerDefense.g:1983:2: rule__Projectile__Group__12__Impl rule__Projectile__Group__13
            {
            pushFollow(FOLLOW_29);
            rule__Projectile__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__13();

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
    // $ANTLR end "rule__Projectile__Group__12"


    // $ANTLR start "rule__Projectile__Group__12__Impl"
    // InternalTowerDefense.g:1990:1: rule__Projectile__Group__12__Impl : ( ( rule__Projectile__CibleAssignment_12 ) ) ;
    public final void rule__Projectile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1994:1: ( ( ( rule__Projectile__CibleAssignment_12 ) ) )
            // InternalTowerDefense.g:1995:1: ( ( rule__Projectile__CibleAssignment_12 ) )
            {
            // InternalTowerDefense.g:1995:1: ( ( rule__Projectile__CibleAssignment_12 ) )
            // InternalTowerDefense.g:1996:2: ( rule__Projectile__CibleAssignment_12 )
            {
             before(grammarAccess.getProjectileAccess().getCibleAssignment_12()); 
            // InternalTowerDefense.g:1997:2: ( rule__Projectile__CibleAssignment_12 )
            // InternalTowerDefense.g:1997:3: rule__Projectile__CibleAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__CibleAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getProjectileAccess().getCibleAssignment_12()); 

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
    // $ANTLR end "rule__Projectile__Group__12__Impl"


    // $ANTLR start "rule__Projectile__Group__13"
    // InternalTowerDefense.g:2005:1: rule__Projectile__Group__13 : rule__Projectile__Group__13__Impl rule__Projectile__Group__14 ;
    public final void rule__Projectile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2009:1: ( rule__Projectile__Group__13__Impl rule__Projectile__Group__14 )
            // InternalTowerDefense.g:2010:2: rule__Projectile__Group__13__Impl rule__Projectile__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Projectile__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__14();

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
    // $ANTLR end "rule__Projectile__Group__13"


    // $ANTLR start "rule__Projectile__Group__13__Impl"
    // InternalTowerDefense.g:2017:1: rule__Projectile__Group__13__Impl : ( 'Degat' ) ;
    public final void rule__Projectile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2021:1: ( ( 'Degat' ) )
            // InternalTowerDefense.g:2022:1: ( 'Degat' )
            {
            // InternalTowerDefense.g:2022:1: ( 'Degat' )
            // InternalTowerDefense.g:2023:2: 'Degat'
            {
             before(grammarAccess.getProjectileAccess().getDegatKeyword_13()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getDegatKeyword_13()); 

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
    // $ANTLR end "rule__Projectile__Group__13__Impl"


    // $ANTLR start "rule__Projectile__Group__14"
    // InternalTowerDefense.g:2032:1: rule__Projectile__Group__14 : rule__Projectile__Group__14__Impl rule__Projectile__Group__15 ;
    public final void rule__Projectile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2036:1: ( rule__Projectile__Group__14__Impl rule__Projectile__Group__15 )
            // InternalTowerDefense.g:2037:2: rule__Projectile__Group__14__Impl rule__Projectile__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__Projectile__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projectile__Group__15();

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
    // $ANTLR end "rule__Projectile__Group__14"


    // $ANTLR start "rule__Projectile__Group__14__Impl"
    // InternalTowerDefense.g:2044:1: rule__Projectile__Group__14__Impl : ( ( rule__Projectile__DegatAssignment_14 ) ) ;
    public final void rule__Projectile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2048:1: ( ( ( rule__Projectile__DegatAssignment_14 ) ) )
            // InternalTowerDefense.g:2049:1: ( ( rule__Projectile__DegatAssignment_14 ) )
            {
            // InternalTowerDefense.g:2049:1: ( ( rule__Projectile__DegatAssignment_14 ) )
            // InternalTowerDefense.g:2050:2: ( rule__Projectile__DegatAssignment_14 )
            {
             before(grammarAccess.getProjectileAccess().getDegatAssignment_14()); 
            // InternalTowerDefense.g:2051:2: ( rule__Projectile__DegatAssignment_14 )
            // InternalTowerDefense.g:2051:3: rule__Projectile__DegatAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__DegatAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getProjectileAccess().getDegatAssignment_14()); 

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
    // $ANTLR end "rule__Projectile__Group__14__Impl"


    // $ANTLR start "rule__Projectile__Group__15"
    // InternalTowerDefense.g:2059:1: rule__Projectile__Group__15 : rule__Projectile__Group__15__Impl ;
    public final void rule__Projectile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2063:1: ( rule__Projectile__Group__15__Impl )
            // InternalTowerDefense.g:2064:2: rule__Projectile__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Projectile__Group__15__Impl();

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
    // $ANTLR end "rule__Projectile__Group__15"


    // $ANTLR start "rule__Projectile__Group__15__Impl"
    // InternalTowerDefense.g:2070:1: rule__Projectile__Group__15__Impl : ( '}' ) ;
    public final void rule__Projectile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2074:1: ( ( '}' ) )
            // InternalTowerDefense.g:2075:1: ( '}' )
            {
            // InternalTowerDefense.g:2075:1: ( '}' )
            // InternalTowerDefense.g:2076:2: '}'
            {
             before(grammarAccess.getProjectileAccess().getRightCurlyBracketKeyword_15()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Projectile__Group__15__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__0"
    // InternalTowerDefense.g:2086:1: rule__NatureTerrain__Group__0 : rule__NatureTerrain__Group__0__Impl rule__NatureTerrain__Group__1 ;
    public final void rule__NatureTerrain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2090:1: ( rule__NatureTerrain__Group__0__Impl rule__NatureTerrain__Group__1 )
            // InternalTowerDefense.g:2091:2: rule__NatureTerrain__Group__0__Impl rule__NatureTerrain__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NatureTerrain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__1();

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
    // $ANTLR end "rule__NatureTerrain__Group__0"


    // $ANTLR start "rule__NatureTerrain__Group__0__Impl"
    // InternalTowerDefense.g:2098:1: rule__NatureTerrain__Group__0__Impl : ( 'NatureTerrain' ) ;
    public final void rule__NatureTerrain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2102:1: ( ( 'NatureTerrain' ) )
            // InternalTowerDefense.g:2103:1: ( 'NatureTerrain' )
            {
            // InternalTowerDefense.g:2103:1: ( 'NatureTerrain' )
            // InternalTowerDefense.g:2104:2: 'NatureTerrain'
            {
             before(grammarAccess.getNatureTerrainAccess().getNatureTerrainKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getNatureTerrainKeyword_0()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__0__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__1"
    // InternalTowerDefense.g:2113:1: rule__NatureTerrain__Group__1 : rule__NatureTerrain__Group__1__Impl rule__NatureTerrain__Group__2 ;
    public final void rule__NatureTerrain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2117:1: ( rule__NatureTerrain__Group__1__Impl rule__NatureTerrain__Group__2 )
            // InternalTowerDefense.g:2118:2: rule__NatureTerrain__Group__1__Impl rule__NatureTerrain__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NatureTerrain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__2();

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
    // $ANTLR end "rule__NatureTerrain__Group__1"


    // $ANTLR start "rule__NatureTerrain__Group__1__Impl"
    // InternalTowerDefense.g:2125:1: rule__NatureTerrain__Group__1__Impl : ( ( rule__NatureTerrain__NameAssignment_1 ) ) ;
    public final void rule__NatureTerrain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2129:1: ( ( ( rule__NatureTerrain__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:2130:1: ( ( rule__NatureTerrain__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:2130:1: ( ( rule__NatureTerrain__NameAssignment_1 ) )
            // InternalTowerDefense.g:2131:2: ( rule__NatureTerrain__NameAssignment_1 )
            {
             before(grammarAccess.getNatureTerrainAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:2132:2: ( rule__NatureTerrain__NameAssignment_1 )
            // InternalTowerDefense.g:2132:3: rule__NatureTerrain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__1__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__2"
    // InternalTowerDefense.g:2140:1: rule__NatureTerrain__Group__2 : rule__NatureTerrain__Group__2__Impl rule__NatureTerrain__Group__3 ;
    public final void rule__NatureTerrain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2144:1: ( rule__NatureTerrain__Group__2__Impl rule__NatureTerrain__Group__3 )
            // InternalTowerDefense.g:2145:2: rule__NatureTerrain__Group__2__Impl rule__NatureTerrain__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__NatureTerrain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__3();

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
    // $ANTLR end "rule__NatureTerrain__Group__2"


    // $ANTLR start "rule__NatureTerrain__Group__2__Impl"
    // InternalTowerDefense.g:2152:1: rule__NatureTerrain__Group__2__Impl : ( '{' ) ;
    public final void rule__NatureTerrain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2156:1: ( ( '{' ) )
            // InternalTowerDefense.g:2157:1: ( '{' )
            {
            // InternalTowerDefense.g:2157:1: ( '{' )
            // InternalTowerDefense.g:2158:2: '{'
            {
             before(grammarAccess.getNatureTerrainAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__2__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__3"
    // InternalTowerDefense.g:2167:1: rule__NatureTerrain__Group__3 : rule__NatureTerrain__Group__3__Impl rule__NatureTerrain__Group__4 ;
    public final void rule__NatureTerrain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2171:1: ( rule__NatureTerrain__Group__3__Impl rule__NatureTerrain__Group__4 )
            // InternalTowerDefense.g:2172:2: rule__NatureTerrain__Group__3__Impl rule__NatureTerrain__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__NatureTerrain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__4();

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
    // $ANTLR end "rule__NatureTerrain__Group__3"


    // $ANTLR start "rule__NatureTerrain__Group__3__Impl"
    // InternalTowerDefense.g:2179:1: rule__NatureTerrain__Group__3__Impl : ( 'Volume' ) ;
    public final void rule__NatureTerrain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2183:1: ( ( 'Volume' ) )
            // InternalTowerDefense.g:2184:1: ( 'Volume' )
            {
            // InternalTowerDefense.g:2184:1: ( 'Volume' )
            // InternalTowerDefense.g:2185:2: 'Volume'
            {
             before(grammarAccess.getNatureTerrainAccess().getVolumeKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getVolumeKeyword_3()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__3__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__4"
    // InternalTowerDefense.g:2194:1: rule__NatureTerrain__Group__4 : rule__NatureTerrain__Group__4__Impl rule__NatureTerrain__Group__5 ;
    public final void rule__NatureTerrain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2198:1: ( rule__NatureTerrain__Group__4__Impl rule__NatureTerrain__Group__5 )
            // InternalTowerDefense.g:2199:2: rule__NatureTerrain__Group__4__Impl rule__NatureTerrain__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__NatureTerrain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__5();

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
    // $ANTLR end "rule__NatureTerrain__Group__4"


    // $ANTLR start "rule__NatureTerrain__Group__4__Impl"
    // InternalTowerDefense.g:2206:1: rule__NatureTerrain__Group__4__Impl : ( ( rule__NatureTerrain__VolumeAssignment_4 ) ) ;
    public final void rule__NatureTerrain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2210:1: ( ( ( rule__NatureTerrain__VolumeAssignment_4 ) ) )
            // InternalTowerDefense.g:2211:1: ( ( rule__NatureTerrain__VolumeAssignment_4 ) )
            {
            // InternalTowerDefense.g:2211:1: ( ( rule__NatureTerrain__VolumeAssignment_4 ) )
            // InternalTowerDefense.g:2212:2: ( rule__NatureTerrain__VolumeAssignment_4 )
            {
             before(grammarAccess.getNatureTerrainAccess().getVolumeAssignment_4()); 
            // InternalTowerDefense.g:2213:2: ( rule__NatureTerrain__VolumeAssignment_4 )
            // InternalTowerDefense.g:2213:3: rule__NatureTerrain__VolumeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__VolumeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getVolumeAssignment_4()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__4__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__5"
    // InternalTowerDefense.g:2221:1: rule__NatureTerrain__Group__5 : rule__NatureTerrain__Group__5__Impl rule__NatureTerrain__Group__6 ;
    public final void rule__NatureTerrain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2225:1: ( rule__NatureTerrain__Group__5__Impl rule__NatureTerrain__Group__6 )
            // InternalTowerDefense.g:2226:2: rule__NatureTerrain__Group__5__Impl rule__NatureTerrain__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__NatureTerrain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__6();

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
    // $ANTLR end "rule__NatureTerrain__Group__5"


    // $ANTLR start "rule__NatureTerrain__Group__5__Impl"
    // InternalTowerDefense.g:2233:1: rule__NatureTerrain__Group__5__Impl : ( 'Type' ) ;
    public final void rule__NatureTerrain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2237:1: ( ( 'Type' ) )
            // InternalTowerDefense.g:2238:1: ( 'Type' )
            {
            // InternalTowerDefense.g:2238:1: ( 'Type' )
            // InternalTowerDefense.g:2239:2: 'Type'
            {
             before(grammarAccess.getNatureTerrainAccess().getTypeKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getTypeKeyword_5()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__5__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__6"
    // InternalTowerDefense.g:2248:1: rule__NatureTerrain__Group__6 : rule__NatureTerrain__Group__6__Impl rule__NatureTerrain__Group__7 ;
    public final void rule__NatureTerrain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2252:1: ( rule__NatureTerrain__Group__6__Impl rule__NatureTerrain__Group__7 )
            // InternalTowerDefense.g:2253:2: rule__NatureTerrain__Group__6__Impl rule__NatureTerrain__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__NatureTerrain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__7();

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
    // $ANTLR end "rule__NatureTerrain__Group__6"


    // $ANTLR start "rule__NatureTerrain__Group__6__Impl"
    // InternalTowerDefense.g:2260:1: rule__NatureTerrain__Group__6__Impl : ( ( rule__NatureTerrain__TypeAssignment_6 ) ) ;
    public final void rule__NatureTerrain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2264:1: ( ( ( rule__NatureTerrain__TypeAssignment_6 ) ) )
            // InternalTowerDefense.g:2265:1: ( ( rule__NatureTerrain__TypeAssignment_6 ) )
            {
            // InternalTowerDefense.g:2265:1: ( ( rule__NatureTerrain__TypeAssignment_6 ) )
            // InternalTowerDefense.g:2266:2: ( rule__NatureTerrain__TypeAssignment_6 )
            {
             before(grammarAccess.getNatureTerrainAccess().getTypeAssignment_6()); 
            // InternalTowerDefense.g:2267:2: ( rule__NatureTerrain__TypeAssignment_6 )
            // InternalTowerDefense.g:2267:3: rule__NatureTerrain__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getTypeAssignment_6()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__6__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__7"
    // InternalTowerDefense.g:2275:1: rule__NatureTerrain__Group__7 : rule__NatureTerrain__Group__7__Impl rule__NatureTerrain__Group__8 ;
    public final void rule__NatureTerrain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2279:1: ( rule__NatureTerrain__Group__7__Impl rule__NatureTerrain__Group__8 )
            // InternalTowerDefense.g:2280:2: rule__NatureTerrain__Group__7__Impl rule__NatureTerrain__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__NatureTerrain__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__8();

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
    // $ANTLR end "rule__NatureTerrain__Group__7"


    // $ANTLR start "rule__NatureTerrain__Group__7__Impl"
    // InternalTowerDefense.g:2287:1: rule__NatureTerrain__Group__7__Impl : ( 'FatigueEntree' ) ;
    public final void rule__NatureTerrain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2291:1: ( ( 'FatigueEntree' ) )
            // InternalTowerDefense.g:2292:1: ( 'FatigueEntree' )
            {
            // InternalTowerDefense.g:2292:1: ( 'FatigueEntree' )
            // InternalTowerDefense.g:2293:2: 'FatigueEntree'
            {
             before(grammarAccess.getNatureTerrainAccess().getFatigueEntreeKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getFatigueEntreeKeyword_7()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__7__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__8"
    // InternalTowerDefense.g:2302:1: rule__NatureTerrain__Group__8 : rule__NatureTerrain__Group__8__Impl rule__NatureTerrain__Group__9 ;
    public final void rule__NatureTerrain__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2306:1: ( rule__NatureTerrain__Group__8__Impl rule__NatureTerrain__Group__9 )
            // InternalTowerDefense.g:2307:2: rule__NatureTerrain__Group__8__Impl rule__NatureTerrain__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__NatureTerrain__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__9();

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
    // $ANTLR end "rule__NatureTerrain__Group__8"


    // $ANTLR start "rule__NatureTerrain__Group__8__Impl"
    // InternalTowerDefense.g:2314:1: rule__NatureTerrain__Group__8__Impl : ( ( rule__NatureTerrain__FatigueAssignment_8 ) ) ;
    public final void rule__NatureTerrain__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2318:1: ( ( ( rule__NatureTerrain__FatigueAssignment_8 ) ) )
            // InternalTowerDefense.g:2319:1: ( ( rule__NatureTerrain__FatigueAssignment_8 ) )
            {
            // InternalTowerDefense.g:2319:1: ( ( rule__NatureTerrain__FatigueAssignment_8 ) )
            // InternalTowerDefense.g:2320:2: ( rule__NatureTerrain__FatigueAssignment_8 )
            {
             before(grammarAccess.getNatureTerrainAccess().getFatigueAssignment_8()); 
            // InternalTowerDefense.g:2321:2: ( rule__NatureTerrain__FatigueAssignment_8 )
            // InternalTowerDefense.g:2321:3: rule__NatureTerrain__FatigueAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__FatigueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getFatigueAssignment_8()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__8__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__9"
    // InternalTowerDefense.g:2329:1: rule__NatureTerrain__Group__9 : rule__NatureTerrain__Group__9__Impl ;
    public final void rule__NatureTerrain__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2333:1: ( rule__NatureTerrain__Group__9__Impl )
            // InternalTowerDefense.g:2334:2: rule__NatureTerrain__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__9__Impl();

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
    // $ANTLR end "rule__NatureTerrain__Group__9"


    // $ANTLR start "rule__NatureTerrain__Group__9__Impl"
    // InternalTowerDefense.g:2340:1: rule__NatureTerrain__Group__9__Impl : ( '}' ) ;
    public final void rule__NatureTerrain__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2344:1: ( ( '}' ) )
            // InternalTowerDefense.g:2345:1: ( '}' )
            {
            // InternalTowerDefense.g:2345:1: ( '}' )
            // InternalTowerDefense.g:2346:2: '}'
            {
             before(grammarAccess.getNatureTerrainAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__NatureTerrain__Group__9__Impl"


    // $ANTLR start "rule__Niveau__Group__0"
    // InternalTowerDefense.g:2356:1: rule__Niveau__Group__0 : rule__Niveau__Group__0__Impl rule__Niveau__Group__1 ;
    public final void rule__Niveau__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2360:1: ( rule__Niveau__Group__0__Impl rule__Niveau__Group__1 )
            // InternalTowerDefense.g:2361:2: rule__Niveau__Group__0__Impl rule__Niveau__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Niveau__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__1();

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
    // $ANTLR end "rule__Niveau__Group__0"


    // $ANTLR start "rule__Niveau__Group__0__Impl"
    // InternalTowerDefense.g:2368:1: rule__Niveau__Group__0__Impl : ( 'Niveau' ) ;
    public final void rule__Niveau__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2372:1: ( ( 'Niveau' ) )
            // InternalTowerDefense.g:2373:1: ( 'Niveau' )
            {
            // InternalTowerDefense.g:2373:1: ( 'Niveau' )
            // InternalTowerDefense.g:2374:2: 'Niveau'
            {
             before(grammarAccess.getNiveauAccess().getNiveauKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getNiveauKeyword_0()); 

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
    // $ANTLR end "rule__Niveau__Group__0__Impl"


    // $ANTLR start "rule__Niveau__Group__1"
    // InternalTowerDefense.g:2383:1: rule__Niveau__Group__1 : rule__Niveau__Group__1__Impl rule__Niveau__Group__2 ;
    public final void rule__Niveau__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2387:1: ( rule__Niveau__Group__1__Impl rule__Niveau__Group__2 )
            // InternalTowerDefense.g:2388:2: rule__Niveau__Group__1__Impl rule__Niveau__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Niveau__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__2();

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
    // $ANTLR end "rule__Niveau__Group__1"


    // $ANTLR start "rule__Niveau__Group__1__Impl"
    // InternalTowerDefense.g:2395:1: rule__Niveau__Group__1__Impl : ( ( rule__Niveau__NameAssignment_1 ) ) ;
    public final void rule__Niveau__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2399:1: ( ( ( rule__Niveau__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:2400:1: ( ( rule__Niveau__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:2400:1: ( ( rule__Niveau__NameAssignment_1 ) )
            // InternalTowerDefense.g:2401:2: ( rule__Niveau__NameAssignment_1 )
            {
             before(grammarAccess.getNiveauAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:2402:2: ( rule__Niveau__NameAssignment_1 )
            // InternalTowerDefense.g:2402:3: rule__Niveau__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Niveau__Group__1__Impl"


    // $ANTLR start "rule__Niveau__Group__2"
    // InternalTowerDefense.g:2410:1: rule__Niveau__Group__2 : rule__Niveau__Group__2__Impl rule__Niveau__Group__3 ;
    public final void rule__Niveau__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2414:1: ( rule__Niveau__Group__2__Impl rule__Niveau__Group__3 )
            // InternalTowerDefense.g:2415:2: rule__Niveau__Group__2__Impl rule__Niveau__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Niveau__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__3();

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
    // $ANTLR end "rule__Niveau__Group__2"


    // $ANTLR start "rule__Niveau__Group__2__Impl"
    // InternalTowerDefense.g:2422:1: rule__Niveau__Group__2__Impl : ( ( rule__Niveau__DifficulteAssignment_2 ) ) ;
    public final void rule__Niveau__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2426:1: ( ( ( rule__Niveau__DifficulteAssignment_2 ) ) )
            // InternalTowerDefense.g:2427:1: ( ( rule__Niveau__DifficulteAssignment_2 ) )
            {
            // InternalTowerDefense.g:2427:1: ( ( rule__Niveau__DifficulteAssignment_2 ) )
            // InternalTowerDefense.g:2428:2: ( rule__Niveau__DifficulteAssignment_2 )
            {
             before(grammarAccess.getNiveauAccess().getDifficulteAssignment_2()); 
            // InternalTowerDefense.g:2429:2: ( rule__Niveau__DifficulteAssignment_2 )
            // InternalTowerDefense.g:2429:3: rule__Niveau__DifficulteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__DifficulteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getDifficulteAssignment_2()); 

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
    // $ANTLR end "rule__Niveau__Group__2__Impl"


    // $ANTLR start "rule__Niveau__Group__3"
    // InternalTowerDefense.g:2437:1: rule__Niveau__Group__3 : rule__Niveau__Group__3__Impl rule__Niveau__Group__4 ;
    public final void rule__Niveau__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2441:1: ( rule__Niveau__Group__3__Impl rule__Niveau__Group__4 )
            // InternalTowerDefense.g:2442:2: rule__Niveau__Group__3__Impl rule__Niveau__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Niveau__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__4();

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
    // $ANTLR end "rule__Niveau__Group__3"


    // $ANTLR start "rule__Niveau__Group__3__Impl"
    // InternalTowerDefense.g:2449:1: rule__Niveau__Group__3__Impl : ( '{' ) ;
    public final void rule__Niveau__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2453:1: ( ( '{' ) )
            // InternalTowerDefense.g:2454:1: ( '{' )
            {
            // InternalTowerDefense.g:2454:1: ( '{' )
            // InternalTowerDefense.g:2455:2: '{'
            {
             before(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Niveau__Group__3__Impl"


    // $ANTLR start "rule__Niveau__Group__4"
    // InternalTowerDefense.g:2464:1: rule__Niveau__Group__4 : rule__Niveau__Group__4__Impl rule__Niveau__Group__5 ;
    public final void rule__Niveau__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2468:1: ( rule__Niveau__Group__4__Impl rule__Niveau__Group__5 )
            // InternalTowerDefense.g:2469:2: rule__Niveau__Group__4__Impl rule__Niveau__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Niveau__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__5();

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
    // $ANTLR end "rule__Niveau__Group__4"


    // $ANTLR start "rule__Niveau__Group__4__Impl"
    // InternalTowerDefense.g:2476:1: rule__Niveau__Group__4__Impl : ( 'DureePauses' ) ;
    public final void rule__Niveau__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2480:1: ( ( 'DureePauses' ) )
            // InternalTowerDefense.g:2481:1: ( 'DureePauses' )
            {
            // InternalTowerDefense.g:2481:1: ( 'DureePauses' )
            // InternalTowerDefense.g:2482:2: 'DureePauses'
            {
             before(grammarAccess.getNiveauAccess().getDureePausesKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getDureePausesKeyword_4()); 

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
    // $ANTLR end "rule__Niveau__Group__4__Impl"


    // $ANTLR start "rule__Niveau__Group__5"
    // InternalTowerDefense.g:2491:1: rule__Niveau__Group__5 : rule__Niveau__Group__5__Impl rule__Niveau__Group__6 ;
    public final void rule__Niveau__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2495:1: ( rule__Niveau__Group__5__Impl rule__Niveau__Group__6 )
            // InternalTowerDefense.g:2496:2: rule__Niveau__Group__5__Impl rule__Niveau__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Niveau__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__6();

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
    // $ANTLR end "rule__Niveau__Group__5"


    // $ANTLR start "rule__Niveau__Group__5__Impl"
    // InternalTowerDefense.g:2503:1: rule__Niveau__Group__5__Impl : ( ( rule__Niveau__DureePauseAssignment_5 ) ) ;
    public final void rule__Niveau__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2507:1: ( ( ( rule__Niveau__DureePauseAssignment_5 ) ) )
            // InternalTowerDefense.g:2508:1: ( ( rule__Niveau__DureePauseAssignment_5 ) )
            {
            // InternalTowerDefense.g:2508:1: ( ( rule__Niveau__DureePauseAssignment_5 ) )
            // InternalTowerDefense.g:2509:2: ( rule__Niveau__DureePauseAssignment_5 )
            {
             before(grammarAccess.getNiveauAccess().getDureePauseAssignment_5()); 
            // InternalTowerDefense.g:2510:2: ( rule__Niveau__DureePauseAssignment_5 )
            // InternalTowerDefense.g:2510:3: rule__Niveau__DureePauseAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__DureePauseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getDureePauseAssignment_5()); 

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
    // $ANTLR end "rule__Niveau__Group__5__Impl"


    // $ANTLR start "rule__Niveau__Group__6"
    // InternalTowerDefense.g:2518:1: rule__Niveau__Group__6 : rule__Niveau__Group__6__Impl rule__Niveau__Group__7 ;
    public final void rule__Niveau__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2522:1: ( rule__Niveau__Group__6__Impl rule__Niveau__Group__7 )
            // InternalTowerDefense.g:2523:2: rule__Niveau__Group__6__Impl rule__Niveau__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Niveau__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__7();

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
    // $ANTLR end "rule__Niveau__Group__6"


    // $ANTLR start "rule__Niveau__Group__6__Impl"
    // InternalTowerDefense.g:2530:1: rule__Niveau__Group__6__Impl : ( 'Argent' ) ;
    public final void rule__Niveau__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2534:1: ( ( 'Argent' ) )
            // InternalTowerDefense.g:2535:1: ( 'Argent' )
            {
            // InternalTowerDefense.g:2535:1: ( 'Argent' )
            // InternalTowerDefense.g:2536:2: 'Argent'
            {
             before(grammarAccess.getNiveauAccess().getArgentKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getArgentKeyword_6()); 

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
    // $ANTLR end "rule__Niveau__Group__6__Impl"


    // $ANTLR start "rule__Niveau__Group__7"
    // InternalTowerDefense.g:2545:1: rule__Niveau__Group__7 : rule__Niveau__Group__7__Impl rule__Niveau__Group__8 ;
    public final void rule__Niveau__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2549:1: ( rule__Niveau__Group__7__Impl rule__Niveau__Group__8 )
            // InternalTowerDefense.g:2550:2: rule__Niveau__Group__7__Impl rule__Niveau__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__Niveau__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__8();

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
    // $ANTLR end "rule__Niveau__Group__7"


    // $ANTLR start "rule__Niveau__Group__7__Impl"
    // InternalTowerDefense.g:2557:1: rule__Niveau__Group__7__Impl : ( ( rule__Niveau__ArgentAssignment_7 ) ) ;
    public final void rule__Niveau__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2561:1: ( ( ( rule__Niveau__ArgentAssignment_7 ) ) )
            // InternalTowerDefense.g:2562:1: ( ( rule__Niveau__ArgentAssignment_7 ) )
            {
            // InternalTowerDefense.g:2562:1: ( ( rule__Niveau__ArgentAssignment_7 ) )
            // InternalTowerDefense.g:2563:2: ( rule__Niveau__ArgentAssignment_7 )
            {
             before(grammarAccess.getNiveauAccess().getArgentAssignment_7()); 
            // InternalTowerDefense.g:2564:2: ( rule__Niveau__ArgentAssignment_7 )
            // InternalTowerDefense.g:2564:3: rule__Niveau__ArgentAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__ArgentAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getArgentAssignment_7()); 

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
    // $ANTLR end "rule__Niveau__Group__7__Impl"


    // $ANTLR start "rule__Niveau__Group__8"
    // InternalTowerDefense.g:2572:1: rule__Niveau__Group__8 : rule__Niveau__Group__8__Impl rule__Niveau__Group__9 ;
    public final void rule__Niveau__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2576:1: ( rule__Niveau__Group__8__Impl rule__Niveau__Group__9 )
            // InternalTowerDefense.g:2577:2: rule__Niveau__Group__8__Impl rule__Niveau__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Niveau__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__9();

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
    // $ANTLR end "rule__Niveau__Group__8"


    // $ANTLR start "rule__Niveau__Group__8__Impl"
    // InternalTowerDefense.g:2584:1: rule__Niveau__Group__8__Impl : ( 'MobSortisMax' ) ;
    public final void rule__Niveau__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2588:1: ( ( 'MobSortisMax' ) )
            // InternalTowerDefense.g:2589:1: ( 'MobSortisMax' )
            {
            // InternalTowerDefense.g:2589:1: ( 'MobSortisMax' )
            // InternalTowerDefense.g:2590:2: 'MobSortisMax'
            {
             before(grammarAccess.getNiveauAccess().getMobSortisMaxKeyword_8()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getMobSortisMaxKeyword_8()); 

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
    // $ANTLR end "rule__Niveau__Group__8__Impl"


    // $ANTLR start "rule__Niveau__Group__9"
    // InternalTowerDefense.g:2599:1: rule__Niveau__Group__9 : rule__Niveau__Group__9__Impl rule__Niveau__Group__10 ;
    public final void rule__Niveau__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2603:1: ( rule__Niveau__Group__9__Impl rule__Niveau__Group__10 )
            // InternalTowerDefense.g:2604:2: rule__Niveau__Group__9__Impl rule__Niveau__Group__10
            {
            pushFollow(FOLLOW_38);
            rule__Niveau__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__10();

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
    // $ANTLR end "rule__Niveau__Group__9"


    // $ANTLR start "rule__Niveau__Group__9__Impl"
    // InternalTowerDefense.g:2611:1: rule__Niveau__Group__9__Impl : ( ( rule__Niveau__MobSortisLimiteAssignment_9 ) ) ;
    public final void rule__Niveau__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2615:1: ( ( ( rule__Niveau__MobSortisLimiteAssignment_9 ) ) )
            // InternalTowerDefense.g:2616:1: ( ( rule__Niveau__MobSortisLimiteAssignment_9 ) )
            {
            // InternalTowerDefense.g:2616:1: ( ( rule__Niveau__MobSortisLimiteAssignment_9 ) )
            // InternalTowerDefense.g:2617:2: ( rule__Niveau__MobSortisLimiteAssignment_9 )
            {
             before(grammarAccess.getNiveauAccess().getMobSortisLimiteAssignment_9()); 
            // InternalTowerDefense.g:2618:2: ( rule__Niveau__MobSortisLimiteAssignment_9 )
            // InternalTowerDefense.g:2618:3: rule__Niveau__MobSortisLimiteAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__MobSortisLimiteAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getMobSortisLimiteAssignment_9()); 

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
    // $ANTLR end "rule__Niveau__Group__9__Impl"


    // $ANTLR start "rule__Niveau__Group__10"
    // InternalTowerDefense.g:2626:1: rule__Niveau__Group__10 : rule__Niveau__Group__10__Impl rule__Niveau__Group__11 ;
    public final void rule__Niveau__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2630:1: ( rule__Niveau__Group__10__Impl rule__Niveau__Group__11 )
            // InternalTowerDefense.g:2631:2: rule__Niveau__Group__10__Impl rule__Niveau__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Niveau__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__11();

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
    // $ANTLR end "rule__Niveau__Group__10"


    // $ANTLR start "rule__Niveau__Group__10__Impl"
    // InternalTowerDefense.g:2638:1: rule__Niveau__Group__10__Impl : ( 'Carte' ) ;
    public final void rule__Niveau__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2642:1: ( ( 'Carte' ) )
            // InternalTowerDefense.g:2643:1: ( 'Carte' )
            {
            // InternalTowerDefense.g:2643:1: ( 'Carte' )
            // InternalTowerDefense.g:2644:2: 'Carte'
            {
             before(grammarAccess.getNiveauAccess().getCarteKeyword_10()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getCarteKeyword_10()); 

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
    // $ANTLR end "rule__Niveau__Group__10__Impl"


    // $ANTLR start "rule__Niveau__Group__11"
    // InternalTowerDefense.g:2653:1: rule__Niveau__Group__11 : rule__Niveau__Group__11__Impl rule__Niveau__Group__12 ;
    public final void rule__Niveau__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2657:1: ( rule__Niveau__Group__11__Impl rule__Niveau__Group__12 )
            // InternalTowerDefense.g:2658:2: rule__Niveau__Group__11__Impl rule__Niveau__Group__12
            {
            pushFollow(FOLLOW_39);
            rule__Niveau__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__12();

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
    // $ANTLR end "rule__Niveau__Group__11"


    // $ANTLR start "rule__Niveau__Group__11__Impl"
    // InternalTowerDefense.g:2665:1: rule__Niveau__Group__11__Impl : ( ( rule__Niveau__CarteAssignment_11 ) ) ;
    public final void rule__Niveau__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2669:1: ( ( ( rule__Niveau__CarteAssignment_11 ) ) )
            // InternalTowerDefense.g:2670:1: ( ( rule__Niveau__CarteAssignment_11 ) )
            {
            // InternalTowerDefense.g:2670:1: ( ( rule__Niveau__CarteAssignment_11 ) )
            // InternalTowerDefense.g:2671:2: ( rule__Niveau__CarteAssignment_11 )
            {
             before(grammarAccess.getNiveauAccess().getCarteAssignment_11()); 
            // InternalTowerDefense.g:2672:2: ( rule__Niveau__CarteAssignment_11 )
            // InternalTowerDefense.g:2672:3: rule__Niveau__CarteAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__CarteAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getCarteAssignment_11()); 

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
    // $ANTLR end "rule__Niveau__Group__11__Impl"


    // $ANTLR start "rule__Niveau__Group__12"
    // InternalTowerDefense.g:2680:1: rule__Niveau__Group__12 : rule__Niveau__Group__12__Impl rule__Niveau__Group__13 ;
    public final void rule__Niveau__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2684:1: ( rule__Niveau__Group__12__Impl rule__Niveau__Group__13 )
            // InternalTowerDefense.g:2685:2: rule__Niveau__Group__12__Impl rule__Niveau__Group__13
            {
            pushFollow(FOLLOW_39);
            rule__Niveau__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__13();

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
    // $ANTLR end "rule__Niveau__Group__12"


    // $ANTLR start "rule__Niveau__Group__12__Impl"
    // InternalTowerDefense.g:2692:1: rule__Niveau__Group__12__Impl : ( ( rule__Niveau__VaguesAssignment_12 )* ) ;
    public final void rule__Niveau__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2696:1: ( ( ( rule__Niveau__VaguesAssignment_12 )* ) )
            // InternalTowerDefense.g:2697:1: ( ( rule__Niveau__VaguesAssignment_12 )* )
            {
            // InternalTowerDefense.g:2697:1: ( ( rule__Niveau__VaguesAssignment_12 )* )
            // InternalTowerDefense.g:2698:2: ( rule__Niveau__VaguesAssignment_12 )*
            {
             before(grammarAccess.getNiveauAccess().getVaguesAssignment_12()); 
            // InternalTowerDefense.g:2699:2: ( rule__Niveau__VaguesAssignment_12 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==55) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTowerDefense.g:2699:3: rule__Niveau__VaguesAssignment_12
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Niveau__VaguesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNiveauAccess().getVaguesAssignment_12()); 

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
    // $ANTLR end "rule__Niveau__Group__12__Impl"


    // $ANTLR start "rule__Niveau__Group__13"
    // InternalTowerDefense.g:2707:1: rule__Niveau__Group__13 : rule__Niveau__Group__13__Impl ;
    public final void rule__Niveau__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2711:1: ( rule__Niveau__Group__13__Impl )
            // InternalTowerDefense.g:2712:2: rule__Niveau__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group__13__Impl();

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
    // $ANTLR end "rule__Niveau__Group__13"


    // $ANTLR start "rule__Niveau__Group__13__Impl"
    // InternalTowerDefense.g:2718:1: rule__Niveau__Group__13__Impl : ( '}' ) ;
    public final void rule__Niveau__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2722:1: ( ( '}' ) )
            // InternalTowerDefense.g:2723:1: ( '}' )
            {
            // InternalTowerDefense.g:2723:1: ( '}' )
            // InternalTowerDefense.g:2724:2: '}'
            {
             before(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Niveau__Group__13__Impl"


    // $ANTLR start "rule__Carte__Group__0"
    // InternalTowerDefense.g:2734:1: rule__Carte__Group__0 : rule__Carte__Group__0__Impl rule__Carte__Group__1 ;
    public final void rule__Carte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2738:1: ( rule__Carte__Group__0__Impl rule__Carte__Group__1 )
            // InternalTowerDefense.g:2739:2: rule__Carte__Group__0__Impl rule__Carte__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Carte__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__1();

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
    // $ANTLR end "rule__Carte__Group__0"


    // $ANTLR start "rule__Carte__Group__0__Impl"
    // InternalTowerDefense.g:2746:1: rule__Carte__Group__0__Impl : ( 'Carte' ) ;
    public final void rule__Carte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2750:1: ( ( 'Carte' ) )
            // InternalTowerDefense.g:2751:1: ( 'Carte' )
            {
            // InternalTowerDefense.g:2751:1: ( 'Carte' )
            // InternalTowerDefense.g:2752:2: 'Carte'
            {
             before(grammarAccess.getCarteAccess().getCarteKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getCarteKeyword_0()); 

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
    // $ANTLR end "rule__Carte__Group__0__Impl"


    // $ANTLR start "rule__Carte__Group__1"
    // InternalTowerDefense.g:2761:1: rule__Carte__Group__1 : rule__Carte__Group__1__Impl rule__Carte__Group__2 ;
    public final void rule__Carte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2765:1: ( rule__Carte__Group__1__Impl rule__Carte__Group__2 )
            // InternalTowerDefense.g:2766:2: rule__Carte__Group__1__Impl rule__Carte__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Carte__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__2();

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
    // $ANTLR end "rule__Carte__Group__1"


    // $ANTLR start "rule__Carte__Group__1__Impl"
    // InternalTowerDefense.g:2773:1: rule__Carte__Group__1__Impl : ( ( rule__Carte__NameAssignment_1 ) ) ;
    public final void rule__Carte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2777:1: ( ( ( rule__Carte__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:2778:1: ( ( rule__Carte__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:2778:1: ( ( rule__Carte__NameAssignment_1 ) )
            // InternalTowerDefense.g:2779:2: ( rule__Carte__NameAssignment_1 )
            {
             before(grammarAccess.getCarteAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:2780:2: ( rule__Carte__NameAssignment_1 )
            // InternalTowerDefense.g:2780:3: rule__Carte__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Carte__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCarteAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Carte__Group__1__Impl"


    // $ANTLR start "rule__Carte__Group__2"
    // InternalTowerDefense.g:2788:1: rule__Carte__Group__2 : rule__Carte__Group__2__Impl rule__Carte__Group__3 ;
    public final void rule__Carte__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2792:1: ( rule__Carte__Group__2__Impl rule__Carte__Group__3 )
            // InternalTowerDefense.g:2793:2: rule__Carte__Group__2__Impl rule__Carte__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Carte__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__3();

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
    // $ANTLR end "rule__Carte__Group__2"


    // $ANTLR start "rule__Carte__Group__2__Impl"
    // InternalTowerDefense.g:2800:1: rule__Carte__Group__2__Impl : ( '{' ) ;
    public final void rule__Carte__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2804:1: ( ( '{' ) )
            // InternalTowerDefense.g:2805:1: ( '{' )
            {
            // InternalTowerDefense.g:2805:1: ( '{' )
            // InternalTowerDefense.g:2806:2: '{'
            {
             before(grammarAccess.getCarteAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Carte__Group__2__Impl"


    // $ANTLR start "rule__Carte__Group__3"
    // InternalTowerDefense.g:2815:1: rule__Carte__Group__3 : rule__Carte__Group__3__Impl rule__Carte__Group__4 ;
    public final void rule__Carte__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2819:1: ( rule__Carte__Group__3__Impl rule__Carte__Group__4 )
            // InternalTowerDefense.g:2820:2: rule__Carte__Group__3__Impl rule__Carte__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Carte__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__4();

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
    // $ANTLR end "rule__Carte__Group__3"


    // $ANTLR start "rule__Carte__Group__3__Impl"
    // InternalTowerDefense.g:2827:1: rule__Carte__Group__3__Impl : ( 'Lignes' ) ;
    public final void rule__Carte__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2831:1: ( ( 'Lignes' ) )
            // InternalTowerDefense.g:2832:1: ( 'Lignes' )
            {
            // InternalTowerDefense.g:2832:1: ( 'Lignes' )
            // InternalTowerDefense.g:2833:2: 'Lignes'
            {
             before(grammarAccess.getCarteAccess().getLignesKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getLignesKeyword_3()); 

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
    // $ANTLR end "rule__Carte__Group__3__Impl"


    // $ANTLR start "rule__Carte__Group__4"
    // InternalTowerDefense.g:2842:1: rule__Carte__Group__4 : rule__Carte__Group__4__Impl rule__Carte__Group__5 ;
    public final void rule__Carte__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2846:1: ( rule__Carte__Group__4__Impl rule__Carte__Group__5 )
            // InternalTowerDefense.g:2847:2: rule__Carte__Group__4__Impl rule__Carte__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__Carte__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__5();

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
    // $ANTLR end "rule__Carte__Group__4"


    // $ANTLR start "rule__Carte__Group__4__Impl"
    // InternalTowerDefense.g:2854:1: rule__Carte__Group__4__Impl : ( ( rule__Carte__NbLignesAssignment_4 ) ) ;
    public final void rule__Carte__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2858:1: ( ( ( rule__Carte__NbLignesAssignment_4 ) ) )
            // InternalTowerDefense.g:2859:1: ( ( rule__Carte__NbLignesAssignment_4 ) )
            {
            // InternalTowerDefense.g:2859:1: ( ( rule__Carte__NbLignesAssignment_4 ) )
            // InternalTowerDefense.g:2860:2: ( rule__Carte__NbLignesAssignment_4 )
            {
             before(grammarAccess.getCarteAccess().getNbLignesAssignment_4()); 
            // InternalTowerDefense.g:2861:2: ( rule__Carte__NbLignesAssignment_4 )
            // InternalTowerDefense.g:2861:3: rule__Carte__NbLignesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Carte__NbLignesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCarteAccess().getNbLignesAssignment_4()); 

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
    // $ANTLR end "rule__Carte__Group__4__Impl"


    // $ANTLR start "rule__Carte__Group__5"
    // InternalTowerDefense.g:2869:1: rule__Carte__Group__5 : rule__Carte__Group__5__Impl rule__Carte__Group__6 ;
    public final void rule__Carte__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2873:1: ( rule__Carte__Group__5__Impl rule__Carte__Group__6 )
            // InternalTowerDefense.g:2874:2: rule__Carte__Group__5__Impl rule__Carte__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Carte__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__6();

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
    // $ANTLR end "rule__Carte__Group__5"


    // $ANTLR start "rule__Carte__Group__5__Impl"
    // InternalTowerDefense.g:2881:1: rule__Carte__Group__5__Impl : ( 'Colonnes' ) ;
    public final void rule__Carte__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2885:1: ( ( 'Colonnes' ) )
            // InternalTowerDefense.g:2886:1: ( 'Colonnes' )
            {
            // InternalTowerDefense.g:2886:1: ( 'Colonnes' )
            // InternalTowerDefense.g:2887:2: 'Colonnes'
            {
             before(grammarAccess.getCarteAccess().getColonnesKeyword_5()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getColonnesKeyword_5()); 

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
    // $ANTLR end "rule__Carte__Group__5__Impl"


    // $ANTLR start "rule__Carte__Group__6"
    // InternalTowerDefense.g:2896:1: rule__Carte__Group__6 : rule__Carte__Group__6__Impl rule__Carte__Group__7 ;
    public final void rule__Carte__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2900:1: ( rule__Carte__Group__6__Impl rule__Carte__Group__7 )
            // InternalTowerDefense.g:2901:2: rule__Carte__Group__6__Impl rule__Carte__Group__7
            {
            pushFollow(FOLLOW_43);
            rule__Carte__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__7();

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
    // $ANTLR end "rule__Carte__Group__6"


    // $ANTLR start "rule__Carte__Group__6__Impl"
    // InternalTowerDefense.g:2908:1: rule__Carte__Group__6__Impl : ( ( rule__Carte__NbColonnesAssignment_6 ) ) ;
    public final void rule__Carte__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2912:1: ( ( ( rule__Carte__NbColonnesAssignment_6 ) ) )
            // InternalTowerDefense.g:2913:1: ( ( rule__Carte__NbColonnesAssignment_6 ) )
            {
            // InternalTowerDefense.g:2913:1: ( ( rule__Carte__NbColonnesAssignment_6 ) )
            // InternalTowerDefense.g:2914:2: ( rule__Carte__NbColonnesAssignment_6 )
            {
             before(grammarAccess.getCarteAccess().getNbColonnesAssignment_6()); 
            // InternalTowerDefense.g:2915:2: ( rule__Carte__NbColonnesAssignment_6 )
            // InternalTowerDefense.g:2915:3: rule__Carte__NbColonnesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Carte__NbColonnesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCarteAccess().getNbColonnesAssignment_6()); 

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
    // $ANTLR end "rule__Carte__Group__6__Impl"


    // $ANTLR start "rule__Carte__Group__7"
    // InternalTowerDefense.g:2923:1: rule__Carte__Group__7 : rule__Carte__Group__7__Impl rule__Carte__Group__8 ;
    public final void rule__Carte__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2927:1: ( rule__Carte__Group__7__Impl rule__Carte__Group__8 )
            // InternalTowerDefense.g:2928:2: rule__Carte__Group__7__Impl rule__Carte__Group__8
            {
            pushFollow(FOLLOW_44);
            rule__Carte__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__8();

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
    // $ANTLR end "rule__Carte__Group__7"


    // $ANTLR start "rule__Carte__Group__7__Impl"
    // InternalTowerDefense.g:2935:1: rule__Carte__Group__7__Impl : ( 'Cases' ) ;
    public final void rule__Carte__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2939:1: ( ( 'Cases' ) )
            // InternalTowerDefense.g:2940:1: ( 'Cases' )
            {
            // InternalTowerDefense.g:2940:1: ( 'Cases' )
            // InternalTowerDefense.g:2941:2: 'Cases'
            {
             before(grammarAccess.getCarteAccess().getCasesKeyword_7()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getCasesKeyword_7()); 

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
    // $ANTLR end "rule__Carte__Group__7__Impl"


    // $ANTLR start "rule__Carte__Group__8"
    // InternalTowerDefense.g:2950:1: rule__Carte__Group__8 : rule__Carte__Group__8__Impl rule__Carte__Group__9 ;
    public final void rule__Carte__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2954:1: ( rule__Carte__Group__8__Impl rule__Carte__Group__9 )
            // InternalTowerDefense.g:2955:2: rule__Carte__Group__8__Impl rule__Carte__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__Carte__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group__9();

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
    // $ANTLR end "rule__Carte__Group__8"


    // $ANTLR start "rule__Carte__Group__8__Impl"
    // InternalTowerDefense.g:2962:1: rule__Carte__Group__8__Impl : ( ( rule__Carte__CasesAssignment_8 )* ) ;
    public final void rule__Carte__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2966:1: ( ( ( rule__Carte__CasesAssignment_8 )* ) )
            // InternalTowerDefense.g:2967:1: ( ( rule__Carte__CasesAssignment_8 )* )
            {
            // InternalTowerDefense.g:2967:1: ( ( rule__Carte__CasesAssignment_8 )* )
            // InternalTowerDefense.g:2968:2: ( rule__Carte__CasesAssignment_8 )*
            {
             before(grammarAccess.getCarteAccess().getCasesAssignment_8()); 
            // InternalTowerDefense.g:2969:2: ( rule__Carte__CasesAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTowerDefense.g:2969:3: rule__Carte__CasesAssignment_8
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Carte__CasesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCarteAccess().getCasesAssignment_8()); 

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
    // $ANTLR end "rule__Carte__Group__8__Impl"


    // $ANTLR start "rule__Carte__Group__9"
    // InternalTowerDefense.g:2977:1: rule__Carte__Group__9 : rule__Carte__Group__9__Impl ;
    public final void rule__Carte__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2981:1: ( rule__Carte__Group__9__Impl )
            // InternalTowerDefense.g:2982:2: rule__Carte__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Carte__Group__9__Impl();

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
    // $ANTLR end "rule__Carte__Group__9"


    // $ANTLR start "rule__Carte__Group__9__Impl"
    // InternalTowerDefense.g:2988:1: rule__Carte__Group__9__Impl : ( '}' ) ;
    public final void rule__Carte__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2992:1: ( ( '}' ) )
            // InternalTowerDefense.g:2993:1: ( '}' )
            {
            // InternalTowerDefense.g:2993:1: ( '}' )
            // InternalTowerDefense.g:2994:2: '}'
            {
             before(grammarAccess.getCarteAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Carte__Group__9__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalTowerDefense.g:3004:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3008:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalTowerDefense.g:3009:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__1();

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
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // InternalTowerDefense.g:3016:1: rule__Case__Group__0__Impl : ( ( rule__Case__NameAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3020:1: ( ( ( rule__Case__NameAssignment_0 ) ) )
            // InternalTowerDefense.g:3021:1: ( ( rule__Case__NameAssignment_0 ) )
            {
            // InternalTowerDefense.g:3021:1: ( ( rule__Case__NameAssignment_0 ) )
            // InternalTowerDefense.g:3022:2: ( rule__Case__NameAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_0()); 
            // InternalTowerDefense.g:3023:2: ( rule__Case__NameAssignment_0 )
            // InternalTowerDefense.g:3023:3: rule__Case__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Case__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // InternalTowerDefense.g:3031:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3035:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalTowerDefense.g:3036:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__2();

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
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // InternalTowerDefense.g:3043:1: rule__Case__Group__1__Impl : ( ( rule__Case__IAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3047:1: ( ( ( rule__Case__IAssignment_1 ) ) )
            // InternalTowerDefense.g:3048:1: ( ( rule__Case__IAssignment_1 ) )
            {
            // InternalTowerDefense.g:3048:1: ( ( rule__Case__IAssignment_1 ) )
            // InternalTowerDefense.g:3049:2: ( rule__Case__IAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getIAssignment_1()); 
            // InternalTowerDefense.g:3050:2: ( rule__Case__IAssignment_1 )
            // InternalTowerDefense.g:3050:3: rule__Case__IAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Case__IAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getIAssignment_1()); 

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
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // InternalTowerDefense.g:3058:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3062:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalTowerDefense.g:3063:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Case__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__3();

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
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // InternalTowerDefense.g:3070:1: rule__Case__Group__2__Impl : ( ( rule__Case__JAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3074:1: ( ( ( rule__Case__JAssignment_2 ) ) )
            // InternalTowerDefense.g:3075:1: ( ( rule__Case__JAssignment_2 ) )
            {
            // InternalTowerDefense.g:3075:1: ( ( rule__Case__JAssignment_2 ) )
            // InternalTowerDefense.g:3076:2: ( rule__Case__JAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getJAssignment_2()); 
            // InternalTowerDefense.g:3077:2: ( rule__Case__JAssignment_2 )
            // InternalTowerDefense.g:3077:3: rule__Case__JAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Case__JAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getJAssignment_2()); 

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
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__3"
    // InternalTowerDefense.g:3085:1: rule__Case__Group__3 : rule__Case__Group__3__Impl ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3089:1: ( rule__Case__Group__3__Impl )
            // InternalTowerDefense.g:3090:2: rule__Case__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__3__Impl();

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
    // $ANTLR end "rule__Case__Group__3"


    // $ANTLR start "rule__Case__Group__3__Impl"
    // InternalTowerDefense.g:3096:1: rule__Case__Group__3__Impl : ( ( rule__Case__NatureDuTerrainAssignment_3 ) ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3100:1: ( ( ( rule__Case__NatureDuTerrainAssignment_3 ) ) )
            // InternalTowerDefense.g:3101:1: ( ( rule__Case__NatureDuTerrainAssignment_3 ) )
            {
            // InternalTowerDefense.g:3101:1: ( ( rule__Case__NatureDuTerrainAssignment_3 ) )
            // InternalTowerDefense.g:3102:2: ( rule__Case__NatureDuTerrainAssignment_3 )
            {
             before(grammarAccess.getCaseAccess().getNatureDuTerrainAssignment_3()); 
            // InternalTowerDefense.g:3103:2: ( rule__Case__NatureDuTerrainAssignment_3 )
            // InternalTowerDefense.g:3103:3: rule__Case__NatureDuTerrainAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Case__NatureDuTerrainAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getNatureDuTerrainAssignment_3()); 

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
    // $ANTLR end "rule__Case__Group__3__Impl"


    // $ANTLR start "rule__Vague__Group__0"
    // InternalTowerDefense.g:3112:1: rule__Vague__Group__0 : rule__Vague__Group__0__Impl rule__Vague__Group__1 ;
    public final void rule__Vague__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3116:1: ( rule__Vague__Group__0__Impl rule__Vague__Group__1 )
            // InternalTowerDefense.g:3117:2: rule__Vague__Group__0__Impl rule__Vague__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Vague__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__1();

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
    // $ANTLR end "rule__Vague__Group__0"


    // $ANTLR start "rule__Vague__Group__0__Impl"
    // InternalTowerDefense.g:3124:1: rule__Vague__Group__0__Impl : ( 'Vague' ) ;
    public final void rule__Vague__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3128:1: ( ( 'Vague' ) )
            // InternalTowerDefense.g:3129:1: ( 'Vague' )
            {
            // InternalTowerDefense.g:3129:1: ( 'Vague' )
            // InternalTowerDefense.g:3130:2: 'Vague'
            {
             before(grammarAccess.getVagueAccess().getVagueKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getVagueKeyword_0()); 

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
    // $ANTLR end "rule__Vague__Group__0__Impl"


    // $ANTLR start "rule__Vague__Group__1"
    // InternalTowerDefense.g:3139:1: rule__Vague__Group__1 : rule__Vague__Group__1__Impl rule__Vague__Group__2 ;
    public final void rule__Vague__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3143:1: ( rule__Vague__Group__1__Impl rule__Vague__Group__2 )
            // InternalTowerDefense.g:3144:2: rule__Vague__Group__1__Impl rule__Vague__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Vague__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__2();

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
    // $ANTLR end "rule__Vague__Group__1"


    // $ANTLR start "rule__Vague__Group__1__Impl"
    // InternalTowerDefense.g:3151:1: rule__Vague__Group__1__Impl : ( ( rule__Vague__NameAssignment_1 ) ) ;
    public final void rule__Vague__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3155:1: ( ( ( rule__Vague__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:3156:1: ( ( rule__Vague__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:3156:1: ( ( rule__Vague__NameAssignment_1 ) )
            // InternalTowerDefense.g:3157:2: ( rule__Vague__NameAssignment_1 )
            {
             before(grammarAccess.getVagueAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:3158:2: ( rule__Vague__NameAssignment_1 )
            // InternalTowerDefense.g:3158:3: rule__Vague__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vague__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVagueAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Vague__Group__1__Impl"


    // $ANTLR start "rule__Vague__Group__2"
    // InternalTowerDefense.g:3166:1: rule__Vague__Group__2 : rule__Vague__Group__2__Impl rule__Vague__Group__3 ;
    public final void rule__Vague__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3170:1: ( rule__Vague__Group__2__Impl rule__Vague__Group__3 )
            // InternalTowerDefense.g:3171:2: rule__Vague__Group__2__Impl rule__Vague__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Vague__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__3();

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
    // $ANTLR end "rule__Vague__Group__2"


    // $ANTLR start "rule__Vague__Group__2__Impl"
    // InternalTowerDefense.g:3178:1: rule__Vague__Group__2__Impl : ( '{' ) ;
    public final void rule__Vague__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3182:1: ( ( '{' ) )
            // InternalTowerDefense.g:3183:1: ( '{' )
            {
            // InternalTowerDefense.g:3183:1: ( '{' )
            // InternalTowerDefense.g:3184:2: '{'
            {
             before(grammarAccess.getVagueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Vague__Group__2__Impl"


    // $ANTLR start "rule__Vague__Group__3"
    // InternalTowerDefense.g:3193:1: rule__Vague__Group__3 : rule__Vague__Group__3__Impl rule__Vague__Group__4 ;
    public final void rule__Vague__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3197:1: ( rule__Vague__Group__3__Impl rule__Vague__Group__4 )
            // InternalTowerDefense.g:3198:2: rule__Vague__Group__3__Impl rule__Vague__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__Vague__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__4();

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
    // $ANTLR end "rule__Vague__Group__3"


    // $ANTLR start "rule__Vague__Group__3__Impl"
    // InternalTowerDefense.g:3205:1: rule__Vague__Group__3__Impl : ( 'Mobiles' ) ;
    public final void rule__Vague__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3209:1: ( ( 'Mobiles' ) )
            // InternalTowerDefense.g:3210:1: ( 'Mobiles' )
            {
            // InternalTowerDefense.g:3210:1: ( 'Mobiles' )
            // InternalTowerDefense.g:3211:2: 'Mobiles'
            {
             before(grammarAccess.getVagueAccess().getMobilesKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getMobilesKeyword_3()); 

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
    // $ANTLR end "rule__Vague__Group__3__Impl"


    // $ANTLR start "rule__Vague__Group__4"
    // InternalTowerDefense.g:3220:1: rule__Vague__Group__4 : rule__Vague__Group__4__Impl rule__Vague__Group__5 ;
    public final void rule__Vague__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3224:1: ( rule__Vague__Group__4__Impl rule__Vague__Group__5 )
            // InternalTowerDefense.g:3225:2: rule__Vague__Group__4__Impl rule__Vague__Group__5
            {
            pushFollow(FOLLOW_46);
            rule__Vague__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__5();

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
    // $ANTLR end "rule__Vague__Group__4"


    // $ANTLR start "rule__Vague__Group__4__Impl"
    // InternalTowerDefense.g:3232:1: rule__Vague__Group__4__Impl : ( ( rule__Vague__MobilesAssignment_4 )* ) ;
    public final void rule__Vague__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3236:1: ( ( ( rule__Vague__MobilesAssignment_4 )* ) )
            // InternalTowerDefense.g:3237:1: ( ( rule__Vague__MobilesAssignment_4 )* )
            {
            // InternalTowerDefense.g:3237:1: ( ( rule__Vague__MobilesAssignment_4 )* )
            // InternalTowerDefense.g:3238:2: ( rule__Vague__MobilesAssignment_4 )*
            {
             before(grammarAccess.getVagueAccess().getMobilesAssignment_4()); 
            // InternalTowerDefense.g:3239:2: ( rule__Vague__MobilesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTowerDefense.g:3239:3: rule__Vague__MobilesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Vague__MobilesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getVagueAccess().getMobilesAssignment_4()); 

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
    // $ANTLR end "rule__Vague__Group__4__Impl"


    // $ANTLR start "rule__Vague__Group__5"
    // InternalTowerDefense.g:3247:1: rule__Vague__Group__5 : rule__Vague__Group__5__Impl rule__Vague__Group__6 ;
    public final void rule__Vague__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3251:1: ( rule__Vague__Group__5__Impl rule__Vague__Group__6 )
            // InternalTowerDefense.g:3252:2: rule__Vague__Group__5__Impl rule__Vague__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__Vague__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__6();

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
    // $ANTLR end "rule__Vague__Group__5"


    // $ANTLR start "rule__Vague__Group__5__Impl"
    // InternalTowerDefense.g:3259:1: rule__Vague__Group__5__Impl : ( 'Obstacles' ) ;
    public final void rule__Vague__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3263:1: ( ( 'Obstacles' ) )
            // InternalTowerDefense.g:3264:1: ( 'Obstacles' )
            {
            // InternalTowerDefense.g:3264:1: ( 'Obstacles' )
            // InternalTowerDefense.g:3265:2: 'Obstacles'
            {
             before(grammarAccess.getVagueAccess().getObstaclesKeyword_5()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getObstaclesKeyword_5()); 

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
    // $ANTLR end "rule__Vague__Group__5__Impl"


    // $ANTLR start "rule__Vague__Group__6"
    // InternalTowerDefense.g:3274:1: rule__Vague__Group__6 : rule__Vague__Group__6__Impl rule__Vague__Group__7 ;
    public final void rule__Vague__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3278:1: ( rule__Vague__Group__6__Impl rule__Vague__Group__7 )
            // InternalTowerDefense.g:3279:2: rule__Vague__Group__6__Impl rule__Vague__Group__7
            {
            pushFollow(FOLLOW_47);
            rule__Vague__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__7();

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
    // $ANTLR end "rule__Vague__Group__6"


    // $ANTLR start "rule__Vague__Group__6__Impl"
    // InternalTowerDefense.g:3286:1: rule__Vague__Group__6__Impl : ( ( rule__Vague__ObstaclesAssignment_6 )* ) ;
    public final void rule__Vague__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3290:1: ( ( ( rule__Vague__ObstaclesAssignment_6 )* ) )
            // InternalTowerDefense.g:3291:1: ( ( rule__Vague__ObstaclesAssignment_6 )* )
            {
            // InternalTowerDefense.g:3291:1: ( ( rule__Vague__ObstaclesAssignment_6 )* )
            // InternalTowerDefense.g:3292:2: ( rule__Vague__ObstaclesAssignment_6 )*
            {
             before(grammarAccess.getVagueAccess().getObstaclesAssignment_6()); 
            // InternalTowerDefense.g:3293:2: ( rule__Vague__ObstaclesAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTowerDefense.g:3293:3: rule__Vague__ObstaclesAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Vague__ObstaclesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getVagueAccess().getObstaclesAssignment_6()); 

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
    // $ANTLR end "rule__Vague__Group__6__Impl"


    // $ANTLR start "rule__Vague__Group__7"
    // InternalTowerDefense.g:3301:1: rule__Vague__Group__7 : rule__Vague__Group__7__Impl rule__Vague__Group__8 ;
    public final void rule__Vague__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3305:1: ( rule__Vague__Group__7__Impl rule__Vague__Group__8 )
            // InternalTowerDefense.g:3306:2: rule__Vague__Group__7__Impl rule__Vague__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Vague__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__8();

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
    // $ANTLR end "rule__Vague__Group__7"


    // $ANTLR start "rule__Vague__Group__7__Impl"
    // InternalTowerDefense.g:3313:1: rule__Vague__Group__7__Impl : ( 'Gain' ) ;
    public final void rule__Vague__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3317:1: ( ( 'Gain' ) )
            // InternalTowerDefense.g:3318:1: ( 'Gain' )
            {
            // InternalTowerDefense.g:3318:1: ( 'Gain' )
            // InternalTowerDefense.g:3319:2: 'Gain'
            {
             before(grammarAccess.getVagueAccess().getGainKeyword_7()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getGainKeyword_7()); 

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
    // $ANTLR end "rule__Vague__Group__7__Impl"


    // $ANTLR start "rule__Vague__Group__8"
    // InternalTowerDefense.g:3328:1: rule__Vague__Group__8 : rule__Vague__Group__8__Impl rule__Vague__Group__9 ;
    public final void rule__Vague__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3332:1: ( rule__Vague__Group__8__Impl rule__Vague__Group__9 )
            // InternalTowerDefense.g:3333:2: rule__Vague__Group__8__Impl rule__Vague__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Vague__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vague__Group__9();

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
    // $ANTLR end "rule__Vague__Group__8"


    // $ANTLR start "rule__Vague__Group__8__Impl"
    // InternalTowerDefense.g:3340:1: rule__Vague__Group__8__Impl : ( ( rule__Vague__GainVictoireAssignment_8 ) ) ;
    public final void rule__Vague__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3344:1: ( ( ( rule__Vague__GainVictoireAssignment_8 ) ) )
            // InternalTowerDefense.g:3345:1: ( ( rule__Vague__GainVictoireAssignment_8 ) )
            {
            // InternalTowerDefense.g:3345:1: ( ( rule__Vague__GainVictoireAssignment_8 ) )
            // InternalTowerDefense.g:3346:2: ( rule__Vague__GainVictoireAssignment_8 )
            {
             before(grammarAccess.getVagueAccess().getGainVictoireAssignment_8()); 
            // InternalTowerDefense.g:3347:2: ( rule__Vague__GainVictoireAssignment_8 )
            // InternalTowerDefense.g:3347:3: rule__Vague__GainVictoireAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Vague__GainVictoireAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getVagueAccess().getGainVictoireAssignment_8()); 

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
    // $ANTLR end "rule__Vague__Group__8__Impl"


    // $ANTLR start "rule__Vague__Group__9"
    // InternalTowerDefense.g:3355:1: rule__Vague__Group__9 : rule__Vague__Group__9__Impl ;
    public final void rule__Vague__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3359:1: ( rule__Vague__Group__9__Impl )
            // InternalTowerDefense.g:3360:2: rule__Vague__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vague__Group__9__Impl();

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
    // $ANTLR end "rule__Vague__Group__9"


    // $ANTLR start "rule__Vague__Group__9__Impl"
    // InternalTowerDefense.g:3366:1: rule__Vague__Group__9__Impl : ( '}' ) ;
    public final void rule__Vague__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3370:1: ( ( '}' ) )
            // InternalTowerDefense.g:3371:1: ( '}' )
            {
            // InternalTowerDefense.g:3371:1: ( '}' )
            // InternalTowerDefense.g:3372:2: '}'
            {
             before(grammarAccess.getVagueAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Vague__Group__9__Impl"


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalTowerDefense.g:3382:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3386:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3387:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:3387:2: ( RULE_ID )
            // InternalTowerDefense.g:3388:3: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Jeu__NameAssignment_1"


    // $ANTLR start "rule__Jeu__PartiesAssignment_3"
    // InternalTowerDefense.g:3397:1: rule__Jeu__PartiesAssignment_3 : ( rulePartie ) ;
    public final void rule__Jeu__PartiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3401:1: ( ( rulePartie ) )
            // InternalTowerDefense.g:3402:2: ( rulePartie )
            {
            // InternalTowerDefense.g:3402:2: ( rulePartie )
            // InternalTowerDefense.g:3403:3: rulePartie
            {
             before(grammarAccess.getJeuAccess().getPartiesPartieParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePartie();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getPartiesPartieParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Jeu__PartiesAssignment_3"


    // $ANTLR start "rule__Partie__NameAssignment_1"
    // InternalTowerDefense.g:3412:1: rule__Partie__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Partie__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3416:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3417:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:3417:2: ( RULE_ID )
            // InternalTowerDefense.g:3418:3: RULE_ID
            {
             before(grammarAccess.getPartieAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartieAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Partie__NameAssignment_1"


    // $ANTLR start "rule__Partie__CasesAssignment_3"
    // InternalTowerDefense.g:3427:1: rule__Partie__CasesAssignment_3 : ( ruleCase ) ;
    public final void rule__Partie__CasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3431:1: ( ( ruleCase ) )
            // InternalTowerDefense.g:3432:2: ( ruleCase )
            {
            // InternalTowerDefense.g:3432:2: ( ruleCase )
            // InternalTowerDefense.g:3433:3: ruleCase
            {
             before(grammarAccess.getPartieAccess().getCasesCaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getPartieAccess().getCasesCaseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Partie__CasesAssignment_3"


    // $ANTLR start "rule__Partie__CartesAssignment_4"
    // InternalTowerDefense.g:3442:1: rule__Partie__CartesAssignment_4 : ( ruleCarte ) ;
    public final void rule__Partie__CartesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3446:1: ( ( ruleCarte ) )
            // InternalTowerDefense.g:3447:2: ( ruleCarte )
            {
            // InternalTowerDefense.g:3447:2: ( ruleCarte )
            // InternalTowerDefense.g:3448:3: ruleCarte
            {
             before(grammarAccess.getPartieAccess().getCartesCarteParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCarte();

            state._fsp--;

             after(grammarAccess.getPartieAccess().getCartesCarteParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Partie__CartesAssignment_4"


    // $ANTLR start "rule__Partie__PartieElementsAssignment_5"
    // InternalTowerDefense.g:3457:1: rule__Partie__PartieElementsAssignment_5 : ( rulePartieElement ) ;
    public final void rule__Partie__PartieElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3461:1: ( ( rulePartieElement ) )
            // InternalTowerDefense.g:3462:2: ( rulePartieElement )
            {
            // InternalTowerDefense.g:3462:2: ( rulePartieElement )
            // InternalTowerDefense.g:3463:3: rulePartieElement
            {
             before(grammarAccess.getPartieAccess().getPartieElementsPartieElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePartieElement();

            state._fsp--;

             after(grammarAccess.getPartieAccess().getPartieElementsPartieElementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Partie__PartieElementsAssignment_5"


    // $ANTLR start "rule__Partie__NiveauxAssignment_6"
    // InternalTowerDefense.g:3472:1: rule__Partie__NiveauxAssignment_6 : ( ruleNiveau ) ;
    public final void rule__Partie__NiveauxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3476:1: ( ( ruleNiveau ) )
            // InternalTowerDefense.g:3477:2: ( ruleNiveau )
            {
            // InternalTowerDefense.g:3477:2: ( ruleNiveau )
            // InternalTowerDefense.g:3478:3: ruleNiveau
            {
             before(grammarAccess.getPartieAccess().getNiveauxNiveauParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleNiveau();

            state._fsp--;

             after(grammarAccess.getPartieAccess().getNiveauxNiveauParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Partie__NiveauxAssignment_6"


    // $ANTLR start "rule__Energie__InfiniAssignment_0"
    // InternalTowerDefense.g:3487:1: rule__Energie__InfiniAssignment_0 : ( ( 'infini' ) ) ;
    public final void rule__Energie__InfiniAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3491:1: ( ( ( 'infini' ) ) )
            // InternalTowerDefense.g:3492:2: ( ( 'infini' ) )
            {
            // InternalTowerDefense.g:3492:2: ( ( 'infini' ) )
            // InternalTowerDefense.g:3493:3: ( 'infini' )
            {
             before(grammarAccess.getEnergieAccess().getInfiniInfiniKeyword_0_0()); 
            // InternalTowerDefense.g:3494:3: ( 'infini' )
            // InternalTowerDefense.g:3495:4: 'infini'
            {
             before(grammarAccess.getEnergieAccess().getInfiniInfiniKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getEnergieAccess().getInfiniInfiniKeyword_0_0()); 

            }

             after(grammarAccess.getEnergieAccess().getInfiniInfiniKeyword_0_0()); 

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
    // $ANTLR end "rule__Energie__InfiniAssignment_0"


    // $ANTLR start "rule__Energie__ValeurAssignment_1"
    // InternalTowerDefense.g:3506:1: rule__Energie__ValeurAssignment_1 : ( RULE_INT ) ;
    public final void rule__Energie__ValeurAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3510:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3511:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3511:2: ( RULE_INT )
            // InternalTowerDefense.g:3512:3: RULE_INT
            {
             before(grammarAccess.getEnergieAccess().getValeurINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnergieAccess().getValeurINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Energie__ValeurAssignment_1"


    // $ANTLR start "rule__Obstacle__NameAssignment_1"
    // InternalTowerDefense.g:3521:1: rule__Obstacle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Obstacle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3525:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3526:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:3526:2: ( RULE_ID )
            // InternalTowerDefense.g:3527:3: RULE_ID
            {
             before(grammarAccess.getObstacleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Obstacle__NameAssignment_1"


    // $ANTLR start "rule__Obstacle__CampementAssignment_4"
    // InternalTowerDefense.g:3536:1: rule__Obstacle__CampementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Obstacle__CampementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3540:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:3541:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:3541:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3542:3: ( RULE_ID )
            {
             before(grammarAccess.getObstacleAccess().getCampementCaseCrossReference_4_0()); 
            // InternalTowerDefense.g:3543:3: ( RULE_ID )
            // InternalTowerDefense.g:3544:4: RULE_ID
            {
             before(grammarAccess.getObstacleAccess().getCampementCaseIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getCampementCaseIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getObstacleAccess().getCampementCaseCrossReference_4_0()); 

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
    // $ANTLR end "rule__Obstacle__CampementAssignment_4"


    // $ANTLR start "rule__Obstacle__QuantiteEnergieMaxAssignment_6"
    // InternalTowerDefense.g:3555:1: rule__Obstacle__QuantiteEnergieMaxAssignment_6 : ( ruleEnergie ) ;
    public final void rule__Obstacle__QuantiteEnergieMaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3559:1: ( ( ruleEnergie ) )
            // InternalTowerDefense.g:3560:2: ( ruleEnergie )
            {
            // InternalTowerDefense.g:3560:2: ( ruleEnergie )
            // InternalTowerDefense.g:3561:3: ruleEnergie
            {
             before(grammarAccess.getObstacleAccess().getQuantiteEnergieMaxEnergieParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEnergie();

            state._fsp--;

             after(grammarAccess.getObstacleAccess().getQuantiteEnergieMaxEnergieParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Obstacle__QuantiteEnergieMaxAssignment_6"


    // $ANTLR start "rule__Obstacle__TactiqueAssignment_8"
    // InternalTowerDefense.g:3570:1: rule__Obstacle__TactiqueAssignment_8 : ( ruleTactiqueType ) ;
    public final void rule__Obstacle__TactiqueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3574:1: ( ( ruleTactiqueType ) )
            // InternalTowerDefense.g:3575:2: ( ruleTactiqueType )
            {
            // InternalTowerDefense.g:3575:2: ( ruleTactiqueType )
            // InternalTowerDefense.g:3576:3: ruleTactiqueType
            {
             before(grammarAccess.getObstacleAccess().getTactiqueTactiqueTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTactiqueType();

            state._fsp--;

             after(grammarAccess.getObstacleAccess().getTactiqueTactiqueTypeEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Obstacle__TactiqueAssignment_8"


    // $ANTLR start "rule__Mobile__NameAssignment_1"
    // InternalTowerDefense.g:3585:1: rule__Mobile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mobile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3589:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3590:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:3590:2: ( RULE_ID )
            // InternalTowerDefense.g:3591:3: RULE_ID
            {
             before(grammarAccess.getMobileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mobile__NameAssignment_1"


    // $ANTLR start "rule__Mobile__ForceAssignment_4"
    // InternalTowerDefense.g:3600:1: rule__Mobile__ForceAssignment_4 : ( RULE_INT ) ;
    public final void rule__Mobile__ForceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3604:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3605:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3605:2: ( RULE_INT )
            // InternalTowerDefense.g:3606:3: RULE_INT
            {
             before(grammarAccess.getMobileAccess().getForceINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getForceINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Mobile__ForceAssignment_4"


    // $ANTLR start "rule__Mobile__VolumeAssignment_6"
    // InternalTowerDefense.g:3615:1: rule__Mobile__VolumeAssignment_6 : ( RULE_INT ) ;
    public final void rule__Mobile__VolumeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3619:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3620:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3620:2: ( RULE_INT )
            // InternalTowerDefense.g:3621:3: RULE_INT
            {
             before(grammarAccess.getMobileAccess().getVolumeINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getVolumeINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Mobile__VolumeAssignment_6"


    // $ANTLR start "rule__Mobile__NumVagueAssignment_8"
    // InternalTowerDefense.g:3630:1: rule__Mobile__NumVagueAssignment_8 : ( RULE_INT ) ;
    public final void rule__Mobile__NumVagueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3634:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3635:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3635:2: ( RULE_INT )
            // InternalTowerDefense.g:3636:3: RULE_INT
            {
             before(grammarAccess.getMobileAccess().getNumVagueINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getNumVagueINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Mobile__NumVagueAssignment_8"


    // $ANTLR start "rule__Mobile__CaseEntreeAssignment_10"
    // InternalTowerDefense.g:3645:1: rule__Mobile__CaseEntreeAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Mobile__CaseEntreeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3649:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:3650:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:3650:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3651:3: ( RULE_ID )
            {
             before(grammarAccess.getMobileAccess().getCaseEntreeCaseCrossReference_10_0()); 
            // InternalTowerDefense.g:3652:3: ( RULE_ID )
            // InternalTowerDefense.g:3653:4: RULE_ID
            {
             before(grammarAccess.getMobileAccess().getCaseEntreeCaseIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getCaseEntreeCaseIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getMobileAccess().getCaseEntreeCaseCrossReference_10_0()); 

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
    // $ANTLR end "rule__Mobile__CaseEntreeAssignment_10"


    // $ANTLR start "rule__Mobile__CaseSortieAssignment_12"
    // InternalTowerDefense.g:3664:1: rule__Mobile__CaseSortieAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Mobile__CaseSortieAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3668:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:3669:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:3669:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3670:3: ( RULE_ID )
            {
             before(grammarAccess.getMobileAccess().getCaseSortieCaseCrossReference_12_0()); 
            // InternalTowerDefense.g:3671:3: ( RULE_ID )
            // InternalTowerDefense.g:3672:4: RULE_ID
            {
             before(grammarAccess.getMobileAccess().getCaseSortieCaseIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getCaseSortieCaseIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getMobileAccess().getCaseSortieCaseCrossReference_12_0()); 

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
    // $ANTLR end "rule__Mobile__CaseSortieAssignment_12"


    // $ANTLR start "rule__Mobile__QuantiteEnergieMaxAssignment_14"
    // InternalTowerDefense.g:3683:1: rule__Mobile__QuantiteEnergieMaxAssignment_14 : ( ruleEnergie ) ;
    public final void rule__Mobile__QuantiteEnergieMaxAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3687:1: ( ( ruleEnergie ) )
            // InternalTowerDefense.g:3688:2: ( ruleEnergie )
            {
            // InternalTowerDefense.g:3688:2: ( ruleEnergie )
            // InternalTowerDefense.g:3689:3: ruleEnergie
            {
             before(grammarAccess.getMobileAccess().getQuantiteEnergieMaxEnergieParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEnergie();

            state._fsp--;

             after(grammarAccess.getMobileAccess().getQuantiteEnergieMaxEnergieParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Mobile__QuantiteEnergieMaxAssignment_14"


    // $ANTLR start "rule__Mobile__TactiqueAssignment_16"
    // InternalTowerDefense.g:3698:1: rule__Mobile__TactiqueAssignment_16 : ( ruleTactiqueType ) ;
    public final void rule__Mobile__TactiqueAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3702:1: ( ( ruleTactiqueType ) )
            // InternalTowerDefense.g:3703:2: ( ruleTactiqueType )
            {
            // InternalTowerDefense.g:3703:2: ( ruleTactiqueType )
            // InternalTowerDefense.g:3704:3: ruleTactiqueType
            {
             before(grammarAccess.getMobileAccess().getTactiqueTactiqueTypeEnumRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleTactiqueType();

            state._fsp--;

             after(grammarAccess.getMobileAccess().getTactiqueTactiqueTypeEnumRuleCall_16_0()); 

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
    // $ANTLR end "rule__Mobile__TactiqueAssignment_16"


    // $ANTLR start "rule__Projectile__NameAssignment_1"
    // InternalTowerDefense.g:3713:1: rule__Projectile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Projectile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3717:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3718:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:3718:2: ( RULE_ID )
            // InternalTowerDefense.g:3719:3: RULE_ID
            {
             before(grammarAccess.getProjectileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Projectile__NameAssignment_1"


    // $ANTLR start "rule__Projectile__PorteeAssignment_4"
    // InternalTowerDefense.g:3728:1: rule__Projectile__PorteeAssignment_4 : ( RULE_INT ) ;
    public final void rule__Projectile__PorteeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3732:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3733:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3733:2: ( RULE_INT )
            // InternalTowerDefense.g:3734:3: RULE_INT
            {
             before(grammarAccess.getProjectileAccess().getPorteeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getPorteeINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Projectile__PorteeAssignment_4"


    // $ANTLR start "rule__Projectile__MasseAssignment_6"
    // InternalTowerDefense.g:3743:1: rule__Projectile__MasseAssignment_6 : ( RULE_INT ) ;
    public final void rule__Projectile__MasseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3747:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3748:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3748:2: ( RULE_INT )
            // InternalTowerDefense.g:3749:3: RULE_INT
            {
             before(grammarAccess.getProjectileAccess().getMasseINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getMasseINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Projectile__MasseAssignment_6"


    // $ANTLR start "rule__Projectile__VitesseAssignment_8"
    // InternalTowerDefense.g:3758:1: rule__Projectile__VitesseAssignment_8 : ( RULE_INT ) ;
    public final void rule__Projectile__VitesseAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3762:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3763:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3763:2: ( RULE_INT )
            // InternalTowerDefense.g:3764:3: RULE_INT
            {
             before(grammarAccess.getProjectileAccess().getVitesseINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getVitesseINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Projectile__VitesseAssignment_8"


    // $ANTLR start "rule__Projectile__CaseAssignment_10"
    // InternalTowerDefense.g:3773:1: rule__Projectile__CaseAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Projectile__CaseAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3777:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:3778:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:3778:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3779:3: ( RULE_ID )
            {
             before(grammarAccess.getProjectileAccess().getCaseCaseCrossReference_10_0()); 
            // InternalTowerDefense.g:3780:3: ( RULE_ID )
            // InternalTowerDefense.g:3781:4: RULE_ID
            {
             before(grammarAccess.getProjectileAccess().getCaseCaseIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getCaseCaseIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getProjectileAccess().getCaseCaseCrossReference_10_0()); 

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
    // $ANTLR end "rule__Projectile__CaseAssignment_10"


    // $ANTLR start "rule__Projectile__CibleAssignment_12"
    // InternalTowerDefense.g:3792:1: rule__Projectile__CibleAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Projectile__CibleAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3796:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:3797:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:3797:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3798:3: ( RULE_ID )
            {
             before(grammarAccess.getProjectileAccess().getCibleCaseCrossReference_12_0()); 
            // InternalTowerDefense.g:3799:3: ( RULE_ID )
            // InternalTowerDefense.g:3800:4: RULE_ID
            {
             before(grammarAccess.getProjectileAccess().getCibleCaseIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectileAccess().getCibleCaseIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getProjectileAccess().getCibleCaseCrossReference_12_0()); 

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
    // $ANTLR end "rule__Projectile__CibleAssignment_12"


    // $ANTLR start "rule__Projectile__DegatAssignment_14"
    // InternalTowerDefense.g:3811:1: rule__Projectile__DegatAssignment_14 : ( ruleEnergie ) ;
    public final void rule__Projectile__DegatAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3815:1: ( ( ruleEnergie ) )
            // InternalTowerDefense.g:3816:2: ( ruleEnergie )
            {
            // InternalTowerDefense.g:3816:2: ( ruleEnergie )
            // InternalTowerDefense.g:3817:3: ruleEnergie
            {
             before(grammarAccess.getProjectileAccess().getDegatEnergieParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEnergie();

            state._fsp--;

             after(grammarAccess.getProjectileAccess().getDegatEnergieParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Projectile__DegatAssignment_14"


    // $ANTLR start "rule__NatureTerrain__NameAssignment_1"
    // InternalTowerDefense.g:3826:1: rule__NatureTerrain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NatureTerrain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3830:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3831:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:3831:2: ( RULE_ID )
            // InternalTowerDefense.g:3832:3: RULE_ID
            {
             before(grammarAccess.getNatureTerrainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NatureTerrain__NameAssignment_1"


    // $ANTLR start "rule__NatureTerrain__VolumeAssignment_4"
    // InternalTowerDefense.g:3841:1: rule__NatureTerrain__VolumeAssignment_4 : ( RULE_INT ) ;
    public final void rule__NatureTerrain__VolumeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3845:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3846:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3846:2: ( RULE_INT )
            // InternalTowerDefense.g:3847:3: RULE_INT
            {
             before(grammarAccess.getNatureTerrainAccess().getVolumeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getVolumeINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__NatureTerrain__VolumeAssignment_4"


    // $ANTLR start "rule__NatureTerrain__TypeAssignment_6"
    // InternalTowerDefense.g:3856:1: rule__NatureTerrain__TypeAssignment_6 : ( ruleTYPE_TERRAIN ) ;
    public final void rule__NatureTerrain__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3860:1: ( ( ruleTYPE_TERRAIN ) )
            // InternalTowerDefense.g:3861:2: ( ruleTYPE_TERRAIN )
            {
            // InternalTowerDefense.g:3861:2: ( ruleTYPE_TERRAIN )
            // InternalTowerDefense.g:3862:3: ruleTYPE_TERRAIN
            {
             before(grammarAccess.getNatureTerrainAccess().getTypeTYPE_TERRAINEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_TERRAIN();

            state._fsp--;

             after(grammarAccess.getNatureTerrainAccess().getTypeTYPE_TERRAINEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__NatureTerrain__TypeAssignment_6"


    // $ANTLR start "rule__NatureTerrain__FatigueAssignment_8"
    // InternalTowerDefense.g:3871:1: rule__NatureTerrain__FatigueAssignment_8 : ( ruleEnergie ) ;
    public final void rule__NatureTerrain__FatigueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3875:1: ( ( ruleEnergie ) )
            // InternalTowerDefense.g:3876:2: ( ruleEnergie )
            {
            // InternalTowerDefense.g:3876:2: ( ruleEnergie )
            // InternalTowerDefense.g:3877:3: ruleEnergie
            {
             before(grammarAccess.getNatureTerrainAccess().getFatigueEnergieParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEnergie();

            state._fsp--;

             after(grammarAccess.getNatureTerrainAccess().getFatigueEnergieParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__NatureTerrain__FatigueAssignment_8"


    // $ANTLR start "rule__Niveau__NameAssignment_1"
    // InternalTowerDefense.g:3886:1: rule__Niveau__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Niveau__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3890:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3891:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:3891:2: ( RULE_ID )
            // InternalTowerDefense.g:3892:3: RULE_ID
            {
             before(grammarAccess.getNiveauAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Niveau__NameAssignment_1"


    // $ANTLR start "rule__Niveau__DifficulteAssignment_2"
    // InternalTowerDefense.g:3901:1: rule__Niveau__DifficulteAssignment_2 : ( ruleDifficulte ) ;
    public final void rule__Niveau__DifficulteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3905:1: ( ( ruleDifficulte ) )
            // InternalTowerDefense.g:3906:2: ( ruleDifficulte )
            {
            // InternalTowerDefense.g:3906:2: ( ruleDifficulte )
            // InternalTowerDefense.g:3907:3: ruleDifficulte
            {
             before(grammarAccess.getNiveauAccess().getDifficulteDifficulteEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDifficulte();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getDifficulteDifficulteEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Niveau__DifficulteAssignment_2"


    // $ANTLR start "rule__Niveau__DureePauseAssignment_5"
    // InternalTowerDefense.g:3916:1: rule__Niveau__DureePauseAssignment_5 : ( RULE_INT ) ;
    public final void rule__Niveau__DureePauseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3920:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3921:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3921:2: ( RULE_INT )
            // InternalTowerDefense.g:3922:3: RULE_INT
            {
             before(grammarAccess.getNiveauAccess().getDureePauseINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getDureePauseINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Niveau__DureePauseAssignment_5"


    // $ANTLR start "rule__Niveau__ArgentAssignment_7"
    // InternalTowerDefense.g:3931:1: rule__Niveau__ArgentAssignment_7 : ( RULE_INT ) ;
    public final void rule__Niveau__ArgentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3935:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3936:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3936:2: ( RULE_INT )
            // InternalTowerDefense.g:3937:3: RULE_INT
            {
             before(grammarAccess.getNiveauAccess().getArgentINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getArgentINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Niveau__ArgentAssignment_7"


    // $ANTLR start "rule__Niveau__MobSortisLimiteAssignment_9"
    // InternalTowerDefense.g:3946:1: rule__Niveau__MobSortisLimiteAssignment_9 : ( RULE_INT ) ;
    public final void rule__Niveau__MobSortisLimiteAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3950:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:3951:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:3951:2: ( RULE_INT )
            // InternalTowerDefense.g:3952:3: RULE_INT
            {
             before(grammarAccess.getNiveauAccess().getMobSortisLimiteINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getMobSortisLimiteINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Niveau__MobSortisLimiteAssignment_9"


    // $ANTLR start "rule__Niveau__CarteAssignment_11"
    // InternalTowerDefense.g:3961:1: rule__Niveau__CarteAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Niveau__CarteAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3965:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:3966:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:3966:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:3967:3: ( RULE_ID )
            {
             before(grammarAccess.getNiveauAccess().getCarteCarteCrossReference_11_0()); 
            // InternalTowerDefense.g:3968:3: ( RULE_ID )
            // InternalTowerDefense.g:3969:4: RULE_ID
            {
             before(grammarAccess.getNiveauAccess().getCarteCarteIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getCarteCarteIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getNiveauAccess().getCarteCarteCrossReference_11_0()); 

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
    // $ANTLR end "rule__Niveau__CarteAssignment_11"


    // $ANTLR start "rule__Niveau__VaguesAssignment_12"
    // InternalTowerDefense.g:3980:1: rule__Niveau__VaguesAssignment_12 : ( ruleVague ) ;
    public final void rule__Niveau__VaguesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3984:1: ( ( ruleVague ) )
            // InternalTowerDefense.g:3985:2: ( ruleVague )
            {
            // InternalTowerDefense.g:3985:2: ( ruleVague )
            // InternalTowerDefense.g:3986:3: ruleVague
            {
             before(grammarAccess.getNiveauAccess().getVaguesVagueParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleVague();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getVaguesVagueParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Niveau__VaguesAssignment_12"


    // $ANTLR start "rule__Carte__NameAssignment_1"
    // InternalTowerDefense.g:3995:1: rule__Carte__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Carte__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:3999:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:4000:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:4000:2: ( RULE_ID )
            // InternalTowerDefense.g:4001:3: RULE_ID
            {
             before(grammarAccess.getCarteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Carte__NameAssignment_1"


    // $ANTLR start "rule__Carte__NbLignesAssignment_4"
    // InternalTowerDefense.g:4010:1: rule__Carte__NbLignesAssignment_4 : ( RULE_INT ) ;
    public final void rule__Carte__NbLignesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4014:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:4015:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:4015:2: ( RULE_INT )
            // InternalTowerDefense.g:4016:3: RULE_INT
            {
             before(grammarAccess.getCarteAccess().getNbLignesINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getNbLignesINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Carte__NbLignesAssignment_4"


    // $ANTLR start "rule__Carte__NbColonnesAssignment_6"
    // InternalTowerDefense.g:4025:1: rule__Carte__NbColonnesAssignment_6 : ( RULE_INT ) ;
    public final void rule__Carte__NbColonnesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4029:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:4030:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:4030:2: ( RULE_INT )
            // InternalTowerDefense.g:4031:3: RULE_INT
            {
             before(grammarAccess.getCarteAccess().getNbColonnesINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getNbColonnesINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Carte__NbColonnesAssignment_6"


    // $ANTLR start "rule__Carte__CasesAssignment_8"
    // InternalTowerDefense.g:4040:1: rule__Carte__CasesAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Carte__CasesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4044:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:4045:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:4045:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:4046:3: ( RULE_ID )
            {
             before(grammarAccess.getCarteAccess().getCasesCaseCrossReference_8_0()); 
            // InternalTowerDefense.g:4047:3: ( RULE_ID )
            // InternalTowerDefense.g:4048:4: RULE_ID
            {
             before(grammarAccess.getCarteAccess().getCasesCaseIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCarteAccess().getCasesCaseIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getCarteAccess().getCasesCaseCrossReference_8_0()); 

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
    // $ANTLR end "rule__Carte__CasesAssignment_8"


    // $ANTLR start "rule__Case__NameAssignment_0"
    // InternalTowerDefense.g:4059:1: rule__Case__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Case__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4063:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:4064:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:4064:2: ( RULE_ID )
            // InternalTowerDefense.g:4065:3: RULE_ID
            {
             before(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Case__NameAssignment_0"


    // $ANTLR start "rule__Case__IAssignment_1"
    // InternalTowerDefense.g:4074:1: rule__Case__IAssignment_1 : ( RULE_INT ) ;
    public final void rule__Case__IAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4078:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:4079:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:4079:2: ( RULE_INT )
            // InternalTowerDefense.g:4080:3: RULE_INT
            {
             before(grammarAccess.getCaseAccess().getIINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getIINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Case__IAssignment_1"


    // $ANTLR start "rule__Case__JAssignment_2"
    // InternalTowerDefense.g:4089:1: rule__Case__JAssignment_2 : ( RULE_INT ) ;
    public final void rule__Case__JAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4093:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:4094:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:4094:2: ( RULE_INT )
            // InternalTowerDefense.g:4095:3: RULE_INT
            {
             before(grammarAccess.getCaseAccess().getJINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getJINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Case__JAssignment_2"


    // $ANTLR start "rule__Case__NatureDuTerrainAssignment_3"
    // InternalTowerDefense.g:4104:1: rule__Case__NatureDuTerrainAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Case__NatureDuTerrainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4108:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:4109:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:4109:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:4110:3: ( RULE_ID )
            {
             before(grammarAccess.getCaseAccess().getNatureDuTerrainNatureTerrainCrossReference_3_0()); 
            // InternalTowerDefense.g:4111:3: ( RULE_ID )
            // InternalTowerDefense.g:4112:4: RULE_ID
            {
             before(grammarAccess.getCaseAccess().getNatureDuTerrainNatureTerrainIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getNatureDuTerrainNatureTerrainIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCaseAccess().getNatureDuTerrainNatureTerrainCrossReference_3_0()); 

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
    // $ANTLR end "rule__Case__NatureDuTerrainAssignment_3"


    // $ANTLR start "rule__Vague__NameAssignment_1"
    // InternalTowerDefense.g:4123:1: rule__Vague__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vague__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4127:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:4128:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:4128:2: ( RULE_ID )
            // InternalTowerDefense.g:4129:3: RULE_ID
            {
             before(grammarAccess.getVagueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Vague__NameAssignment_1"


    // $ANTLR start "rule__Vague__MobilesAssignment_4"
    // InternalTowerDefense.g:4138:1: rule__Vague__MobilesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Vague__MobilesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4142:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:4143:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:4143:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:4144:3: ( RULE_ID )
            {
             before(grammarAccess.getVagueAccess().getMobilesMobileCrossReference_4_0()); 
            // InternalTowerDefense.g:4145:3: ( RULE_ID )
            // InternalTowerDefense.g:4146:4: RULE_ID
            {
             before(grammarAccess.getVagueAccess().getMobilesMobileIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getMobilesMobileIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getVagueAccess().getMobilesMobileCrossReference_4_0()); 

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
    // $ANTLR end "rule__Vague__MobilesAssignment_4"


    // $ANTLR start "rule__Vague__ObstaclesAssignment_6"
    // InternalTowerDefense.g:4157:1: rule__Vague__ObstaclesAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Vague__ObstaclesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4161:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:4162:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:4162:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:4163:3: ( RULE_ID )
            {
             before(grammarAccess.getVagueAccess().getObstaclesObstacleCrossReference_6_0()); 
            // InternalTowerDefense.g:4164:3: ( RULE_ID )
            // InternalTowerDefense.g:4165:4: RULE_ID
            {
             before(grammarAccess.getVagueAccess().getObstaclesObstacleIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getObstaclesObstacleIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getVagueAccess().getObstaclesObstacleCrossReference_6_0()); 

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
    // $ANTLR end "rule__Vague__ObstaclesAssignment_6"


    // $ANTLR start "rule__Vague__GainVictoireAssignment_8"
    // InternalTowerDefense.g:4176:1: rule__Vague__GainVictoireAssignment_8 : ( RULE_INT ) ;
    public final void rule__Vague__GainVictoireAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:4180:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:4181:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:4181:2: ( RULE_INT )
            // InternalTowerDefense.g:4182:3: RULE_INT
            {
             before(grammarAccess.getVagueAccess().getGainVictoireINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getGainVictoireINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Vague__GainVictoireAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008881045000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000081044000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0800000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000000010L});

}