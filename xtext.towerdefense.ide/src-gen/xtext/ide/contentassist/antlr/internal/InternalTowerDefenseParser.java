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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entree'", "'sortie'", "'chemin'", "'camp'", "'deco'", "'facile'", "'moyen'", "'difficile'", "'Jeu'", "'{'", "'}'", "'Partie'", "'Tactique'", "'Volume'", "'Type'", "'FatigueEntree'", "'Niveau'", "'Difficulte'", "'DureePauses'", "'Argent'", "'MobSortisMax'", "'Vague'", "'Terrain'", "'i'", "'j'", "'Mobiles'", "'Obstacles'", "'Gain'", "'Obstacle'", "'Mobile'", "'Projectile'", "'Nature'", "'procheFirst'", "'faibleFirst'", "'fortFirst'"
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


    // $ANTLR start "entryRuleTactique"
    // InternalTowerDefense.g:128:1: entryRuleTactique : ruleTactique EOF ;
    public final void entryRuleTactique() throws RecognitionException {
        try {
            // InternalTowerDefense.g:129:1: ( ruleTactique EOF )
            // InternalTowerDefense.g:130:1: ruleTactique EOF
            {
             before(grammarAccess.getTactiqueRule()); 
            pushFollow(FOLLOW_1);
            ruleTactique();

            state._fsp--;

             after(grammarAccess.getTactiqueRule()); 
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
    // $ANTLR end "entryRuleTactique"


    // $ANTLR start "ruleTactique"
    // InternalTowerDefense.g:137:1: ruleTactique : ( ( rule__Tactique__Alternatives ) ) ;
    public final void ruleTactique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:141:2: ( ( ( rule__Tactique__Alternatives ) ) )
            // InternalTowerDefense.g:142:2: ( ( rule__Tactique__Alternatives ) )
            {
            // InternalTowerDefense.g:142:2: ( ( rule__Tactique__Alternatives ) )
            // InternalTowerDefense.g:143:3: ( rule__Tactique__Alternatives )
            {
             before(grammarAccess.getTactiqueAccess().getAlternatives()); 
            // InternalTowerDefense.g:144:3: ( rule__Tactique__Alternatives )
            // InternalTowerDefense.g:144:4: rule__Tactique__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tactique__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTactiqueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTactique"


    // $ANTLR start "entryRuleNatureTerrain"
    // InternalTowerDefense.g:153:1: entryRuleNatureTerrain : ruleNatureTerrain EOF ;
    public final void entryRuleNatureTerrain() throws RecognitionException {
        try {
            // InternalTowerDefense.g:154:1: ( ruleNatureTerrain EOF )
            // InternalTowerDefense.g:155:1: ruleNatureTerrain EOF
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
    // InternalTowerDefense.g:162:1: ruleNatureTerrain : ( ( rule__NatureTerrain__Group__0 ) ) ;
    public final void ruleNatureTerrain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:166:2: ( ( ( rule__NatureTerrain__Group__0 ) ) )
            // InternalTowerDefense.g:167:2: ( ( rule__NatureTerrain__Group__0 ) )
            {
            // InternalTowerDefense.g:167:2: ( ( rule__NatureTerrain__Group__0 ) )
            // InternalTowerDefense.g:168:3: ( rule__NatureTerrain__Group__0 )
            {
             before(grammarAccess.getNatureTerrainAccess().getGroup()); 
            // InternalTowerDefense.g:169:3: ( rule__NatureTerrain__Group__0 )
            // InternalTowerDefense.g:169:4: rule__NatureTerrain__Group__0
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
    // InternalTowerDefense.g:178:1: entryRuleNiveau : ruleNiveau EOF ;
    public final void entryRuleNiveau() throws RecognitionException {
        try {
            // InternalTowerDefense.g:179:1: ( ruleNiveau EOF )
            // InternalTowerDefense.g:180:1: ruleNiveau EOF
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
    // InternalTowerDefense.g:187:1: ruleNiveau : ( ( rule__Niveau__Group__0 ) ) ;
    public final void ruleNiveau() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:191:2: ( ( ( rule__Niveau__Group__0 ) ) )
            // InternalTowerDefense.g:192:2: ( ( rule__Niveau__Group__0 ) )
            {
            // InternalTowerDefense.g:192:2: ( ( rule__Niveau__Group__0 ) )
            // InternalTowerDefense.g:193:3: ( rule__Niveau__Group__0 )
            {
             before(grammarAccess.getNiveauAccess().getGroup()); 
            // InternalTowerDefense.g:194:3: ( rule__Niveau__Group__0 )
            // InternalTowerDefense.g:194:4: rule__Niveau__Group__0
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


    // $ANTLR start "entryRuleTerrainDeJeu"
    // InternalTowerDefense.g:203:1: entryRuleTerrainDeJeu : ruleTerrainDeJeu EOF ;
    public final void entryRuleTerrainDeJeu() throws RecognitionException {
        try {
            // InternalTowerDefense.g:204:1: ( ruleTerrainDeJeu EOF )
            // InternalTowerDefense.g:205:1: ruleTerrainDeJeu EOF
            {
             before(grammarAccess.getTerrainDeJeuRule()); 
            pushFollow(FOLLOW_1);
            ruleTerrainDeJeu();

            state._fsp--;

             after(grammarAccess.getTerrainDeJeuRule()); 
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
    // $ANTLR end "entryRuleTerrainDeJeu"


    // $ANTLR start "ruleTerrainDeJeu"
    // InternalTowerDefense.g:212:1: ruleTerrainDeJeu : ( ( rule__TerrainDeJeu__Group__0 ) ) ;
    public final void ruleTerrainDeJeu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:216:2: ( ( ( rule__TerrainDeJeu__Group__0 ) ) )
            // InternalTowerDefense.g:217:2: ( ( rule__TerrainDeJeu__Group__0 ) )
            {
            // InternalTowerDefense.g:217:2: ( ( rule__TerrainDeJeu__Group__0 ) )
            // InternalTowerDefense.g:218:3: ( rule__TerrainDeJeu__Group__0 )
            {
             before(grammarAccess.getTerrainDeJeuAccess().getGroup()); 
            // InternalTowerDefense.g:219:3: ( rule__TerrainDeJeu__Group__0 )
            // InternalTowerDefense.g:219:4: rule__TerrainDeJeu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TerrainDeJeu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerrainDeJeuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerrainDeJeu"


    // $ANTLR start "entryRuleCase"
    // InternalTowerDefense.g:228:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalTowerDefense.g:229:1: ( ruleCase EOF )
            // InternalTowerDefense.g:230:1: ruleCase EOF
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
    // InternalTowerDefense.g:237:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:241:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalTowerDefense.g:242:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalTowerDefense.g:242:2: ( ( rule__Case__Group__0 ) )
            // InternalTowerDefense.g:243:3: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalTowerDefense.g:244:3: ( rule__Case__Group__0 )
            // InternalTowerDefense.g:244:4: rule__Case__Group__0
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
    // InternalTowerDefense.g:253:1: entryRuleVague : ruleVague EOF ;
    public final void entryRuleVague() throws RecognitionException {
        try {
            // InternalTowerDefense.g:254:1: ( ruleVague EOF )
            // InternalTowerDefense.g:255:1: ruleVague EOF
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
    // InternalTowerDefense.g:262:1: ruleVague : ( ( rule__Vague__Group__0 ) ) ;
    public final void ruleVague() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:266:2: ( ( ( rule__Vague__Group__0 ) ) )
            // InternalTowerDefense.g:267:2: ( ( rule__Vague__Group__0 ) )
            {
            // InternalTowerDefense.g:267:2: ( ( rule__Vague__Group__0 ) )
            // InternalTowerDefense.g:268:3: ( rule__Vague__Group__0 )
            {
             before(grammarAccess.getVagueAccess().getGroup()); 
            // InternalTowerDefense.g:269:3: ( rule__Vague__Group__0 )
            // InternalTowerDefense.g:269:4: rule__Vague__Group__0
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


    // $ANTLR start "ruleTYPE_TERRAIN"
    // InternalTowerDefense.g:278:1: ruleTYPE_TERRAIN : ( ( rule__TYPE_TERRAIN__Alternatives ) ) ;
    public final void ruleTYPE_TERRAIN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:282:1: ( ( ( rule__TYPE_TERRAIN__Alternatives ) ) )
            // InternalTowerDefense.g:283:2: ( ( rule__TYPE_TERRAIN__Alternatives ) )
            {
            // InternalTowerDefense.g:283:2: ( ( rule__TYPE_TERRAIN__Alternatives ) )
            // InternalTowerDefense.g:284:3: ( rule__TYPE_TERRAIN__Alternatives )
            {
             before(grammarAccess.getTYPE_TERRAINAccess().getAlternatives()); 
            // InternalTowerDefense.g:285:3: ( rule__TYPE_TERRAIN__Alternatives )
            // InternalTowerDefense.g:285:4: rule__TYPE_TERRAIN__Alternatives
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
    // InternalTowerDefense.g:294:1: ruleDifficulte : ( ( rule__Difficulte__Alternatives ) ) ;
    public final void ruleDifficulte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:298:1: ( ( ( rule__Difficulte__Alternatives ) ) )
            // InternalTowerDefense.g:299:2: ( ( rule__Difficulte__Alternatives ) )
            {
            // InternalTowerDefense.g:299:2: ( ( rule__Difficulte__Alternatives ) )
            // InternalTowerDefense.g:300:3: ( rule__Difficulte__Alternatives )
            {
             before(grammarAccess.getDifficulteAccess().getAlternatives()); 
            // InternalTowerDefense.g:301:3: ( rule__Difficulte__Alternatives )
            // InternalTowerDefense.g:301:4: rule__Difficulte__Alternatives
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
    // InternalTowerDefense.g:309:1: rule__PartieElement__Alternatives : ( ( ( rule__PartieElement__ObstacleAssignment_0 ) ) | ( ( rule__PartieElement__MobileAssignment_1 ) ) | ( ( rule__PartieElement__ProjectileAssignment_2 ) ) | ( ( rule__PartieElement__NatureAssignment_3 ) ) );
    public final void rule__PartieElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:313:1: ( ( ( rule__PartieElement__ObstacleAssignment_0 ) ) | ( ( rule__PartieElement__MobileAssignment_1 ) ) | ( ( rule__PartieElement__ProjectileAssignment_2 ) ) | ( ( rule__PartieElement__NatureAssignment_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            case 42:
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
                    // InternalTowerDefense.g:314:2: ( ( rule__PartieElement__ObstacleAssignment_0 ) )
                    {
                    // InternalTowerDefense.g:314:2: ( ( rule__PartieElement__ObstacleAssignment_0 ) )
                    // InternalTowerDefense.g:315:3: ( rule__PartieElement__ObstacleAssignment_0 )
                    {
                     before(grammarAccess.getPartieElementAccess().getObstacleAssignment_0()); 
                    // InternalTowerDefense.g:316:3: ( rule__PartieElement__ObstacleAssignment_0 )
                    // InternalTowerDefense.g:316:4: rule__PartieElement__ObstacleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartieElement__ObstacleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartieElementAccess().getObstacleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:320:2: ( ( rule__PartieElement__MobileAssignment_1 ) )
                    {
                    // InternalTowerDefense.g:320:2: ( ( rule__PartieElement__MobileAssignment_1 ) )
                    // InternalTowerDefense.g:321:3: ( rule__PartieElement__MobileAssignment_1 )
                    {
                     before(grammarAccess.getPartieElementAccess().getMobileAssignment_1()); 
                    // InternalTowerDefense.g:322:3: ( rule__PartieElement__MobileAssignment_1 )
                    // InternalTowerDefense.g:322:4: rule__PartieElement__MobileAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartieElement__MobileAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartieElementAccess().getMobileAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:326:2: ( ( rule__PartieElement__ProjectileAssignment_2 ) )
                    {
                    // InternalTowerDefense.g:326:2: ( ( rule__PartieElement__ProjectileAssignment_2 ) )
                    // InternalTowerDefense.g:327:3: ( rule__PartieElement__ProjectileAssignment_2 )
                    {
                     before(grammarAccess.getPartieElementAccess().getProjectileAssignment_2()); 
                    // InternalTowerDefense.g:328:3: ( rule__PartieElement__ProjectileAssignment_2 )
                    // InternalTowerDefense.g:328:4: rule__PartieElement__ProjectileAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartieElement__ProjectileAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartieElementAccess().getProjectileAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTowerDefense.g:332:2: ( ( rule__PartieElement__NatureAssignment_3 ) )
                    {
                    // InternalTowerDefense.g:332:2: ( ( rule__PartieElement__NatureAssignment_3 ) )
                    // InternalTowerDefense.g:333:3: ( rule__PartieElement__NatureAssignment_3 )
                    {
                     before(grammarAccess.getPartieElementAccess().getNatureAssignment_3()); 
                    // InternalTowerDefense.g:334:3: ( rule__PartieElement__NatureAssignment_3 )
                    // InternalTowerDefense.g:334:4: rule__PartieElement__NatureAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartieElement__NatureAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartieElementAccess().getNatureAssignment_3()); 

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


    // $ANTLR start "rule__Tactique__Alternatives"
    // InternalTowerDefense.g:342:1: rule__Tactique__Alternatives : ( ( ( rule__Tactique__Group_0__0 ) ) | ( ( rule__Tactique__FaibleAssignment_1 ) ) | ( ( rule__Tactique__FortAssignment_2 ) ) );
    public final void rule__Tactique__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:346:1: ( ( ( rule__Tactique__Group_0__0 ) ) | ( ( rule__Tactique__FaibleAssignment_1 ) ) | ( ( rule__Tactique__FortAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case 45:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTowerDefense.g:347:2: ( ( rule__Tactique__Group_0__0 ) )
                    {
                    // InternalTowerDefense.g:347:2: ( ( rule__Tactique__Group_0__0 ) )
                    // InternalTowerDefense.g:348:3: ( rule__Tactique__Group_0__0 )
                    {
                     before(grammarAccess.getTactiqueAccess().getGroup_0()); 
                    // InternalTowerDefense.g:349:3: ( rule__Tactique__Group_0__0 )
                    // InternalTowerDefense.g:349:4: rule__Tactique__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tactique__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTactiqueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:353:2: ( ( rule__Tactique__FaibleAssignment_1 ) )
                    {
                    // InternalTowerDefense.g:353:2: ( ( rule__Tactique__FaibleAssignment_1 ) )
                    // InternalTowerDefense.g:354:3: ( rule__Tactique__FaibleAssignment_1 )
                    {
                     before(grammarAccess.getTactiqueAccess().getFaibleAssignment_1()); 
                    // InternalTowerDefense.g:355:3: ( rule__Tactique__FaibleAssignment_1 )
                    // InternalTowerDefense.g:355:4: rule__Tactique__FaibleAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tactique__FaibleAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTactiqueAccess().getFaibleAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:359:2: ( ( rule__Tactique__FortAssignment_2 ) )
                    {
                    // InternalTowerDefense.g:359:2: ( ( rule__Tactique__FortAssignment_2 ) )
                    // InternalTowerDefense.g:360:3: ( rule__Tactique__FortAssignment_2 )
                    {
                     before(grammarAccess.getTactiqueAccess().getFortAssignment_2()); 
                    // InternalTowerDefense.g:361:3: ( rule__Tactique__FortAssignment_2 )
                    // InternalTowerDefense.g:361:4: rule__Tactique__FortAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tactique__FortAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTactiqueAccess().getFortAssignment_2()); 

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
    // $ANTLR end "rule__Tactique__Alternatives"


    // $ANTLR start "rule__TYPE_TERRAIN__Alternatives"
    // InternalTowerDefense.g:369:1: rule__TYPE_TERRAIN__Alternatives : ( ( ( 'entree' ) ) | ( ( 'sortie' ) ) | ( ( 'chemin' ) ) | ( ( 'camp' ) ) | ( ( 'deco' ) ) );
    public final void rule__TYPE_TERRAIN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:373:1: ( ( ( 'entree' ) ) | ( ( 'sortie' ) ) | ( ( 'chemin' ) ) | ( ( 'camp' ) ) | ( ( 'deco' ) ) )
            int alt3=5;
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
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTowerDefense.g:374:2: ( ( 'entree' ) )
                    {
                    // InternalTowerDefense.g:374:2: ( ( 'entree' ) )
                    // InternalTowerDefense.g:375:3: ( 'entree' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0()); 
                    // InternalTowerDefense.g:376:3: ( 'entree' )
                    // InternalTowerDefense.g:376:4: 'entree'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:380:2: ( ( 'sortie' ) )
                    {
                    // InternalTowerDefense.g:380:2: ( ( 'sortie' ) )
                    // InternalTowerDefense.g:381:3: ( 'sortie' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1()); 
                    // InternalTowerDefense.g:382:3: ( 'sortie' )
                    // InternalTowerDefense.g:382:4: 'sortie'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:386:2: ( ( 'chemin' ) )
                    {
                    // InternalTowerDefense.g:386:2: ( ( 'chemin' ) )
                    // InternalTowerDefense.g:387:3: ( 'chemin' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2()); 
                    // InternalTowerDefense.g:388:3: ( 'chemin' )
                    // InternalTowerDefense.g:388:4: 'chemin'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTowerDefense.g:392:2: ( ( 'camp' ) )
                    {
                    // InternalTowerDefense.g:392:2: ( ( 'camp' ) )
                    // InternalTowerDefense.g:393:3: ( 'camp' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3()); 
                    // InternalTowerDefense.g:394:3: ( 'camp' )
                    // InternalTowerDefense.g:394:4: 'camp'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTowerDefense.g:398:2: ( ( 'deco' ) )
                    {
                    // InternalTowerDefense.g:398:2: ( ( 'deco' ) )
                    // InternalTowerDefense.g:399:3: ( 'deco' )
                    {
                     before(grammarAccess.getTYPE_TERRAINAccess().getDecorationEnumLiteralDeclaration_4()); 
                    // InternalTowerDefense.g:400:3: ( 'deco' )
                    // InternalTowerDefense.g:400:4: 'deco'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalTowerDefense.g:408:1: rule__Difficulte__Alternatives : ( ( ( 'facile' ) ) | ( ( 'moyen' ) ) | ( ( 'difficile' ) ) );
    public final void rule__Difficulte__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:412:1: ( ( ( 'facile' ) ) | ( ( 'moyen' ) ) | ( ( 'difficile' ) ) )
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
                    // InternalTowerDefense.g:413:2: ( ( 'facile' ) )
                    {
                    // InternalTowerDefense.g:413:2: ( ( 'facile' ) )
                    // InternalTowerDefense.g:414:3: ( 'facile' )
                    {
                     before(grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0()); 
                    // InternalTowerDefense.g:415:3: ( 'facile' )
                    // InternalTowerDefense.g:415:4: 'facile'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTowerDefense.g:419:2: ( ( 'moyen' ) )
                    {
                    // InternalTowerDefense.g:419:2: ( ( 'moyen' ) )
                    // InternalTowerDefense.g:420:3: ( 'moyen' )
                    {
                     before(grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1()); 
                    // InternalTowerDefense.g:421:3: ( 'moyen' )
                    // InternalTowerDefense.g:421:4: 'moyen'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTowerDefense.g:425:2: ( ( 'difficile' ) )
                    {
                    // InternalTowerDefense.g:425:2: ( ( 'difficile' ) )
                    // InternalTowerDefense.g:426:3: ( 'difficile' )
                    {
                     before(grammarAccess.getDifficulteAccess().getDifficileEnumLiteralDeclaration_2()); 
                    // InternalTowerDefense.g:427:3: ( 'difficile' )
                    // InternalTowerDefense.g:427:4: 'difficile'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalTowerDefense.g:435:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:439:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalTowerDefense.g:440:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
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
    // InternalTowerDefense.g:447:1: rule__Jeu__Group__0__Impl : ( 'Jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:451:1: ( ( 'Jeu' ) )
            // InternalTowerDefense.g:452:1: ( 'Jeu' )
            {
            // InternalTowerDefense.g:452:1: ( 'Jeu' )
            // InternalTowerDefense.g:453:2: 'Jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTowerDefense.g:462:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:466:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalTowerDefense.g:467:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
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
    // InternalTowerDefense.g:474:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:478:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:479:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:479:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalTowerDefense.g:480:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:481:2: ( rule__Jeu__NameAssignment_1 )
            // InternalTowerDefense.g:481:3: rule__Jeu__NameAssignment_1
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
    // InternalTowerDefense.g:489:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:493:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalTowerDefense.g:494:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
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
    // InternalTowerDefense.g:501:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:505:1: ( ( '{' ) )
            // InternalTowerDefense.g:506:1: ( '{' )
            {
            // InternalTowerDefense.g:506:1: ( '{' )
            // InternalTowerDefense.g:507:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTowerDefense.g:516:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:520:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalTowerDefense.g:521:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
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
    // InternalTowerDefense.g:528:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__PartiesAssignment_3 )* ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:532:1: ( ( ( rule__Jeu__PartiesAssignment_3 )* ) )
            // InternalTowerDefense.g:533:1: ( ( rule__Jeu__PartiesAssignment_3 )* )
            {
            // InternalTowerDefense.g:533:1: ( ( rule__Jeu__PartiesAssignment_3 )* )
            // InternalTowerDefense.g:534:2: ( rule__Jeu__PartiesAssignment_3 )*
            {
             before(grammarAccess.getJeuAccess().getPartiesAssignment_3()); 
            // InternalTowerDefense.g:535:2: ( rule__Jeu__PartiesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTowerDefense.g:535:3: rule__Jeu__PartiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Jeu__PartiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalTowerDefense.g:543:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:547:1: ( rule__Jeu__Group__4__Impl )
            // InternalTowerDefense.g:548:2: rule__Jeu__Group__4__Impl
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
    // InternalTowerDefense.g:554:1: rule__Jeu__Group__4__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:558:1: ( ( '}' ) )
            // InternalTowerDefense.g:559:1: ( '}' )
            {
            // InternalTowerDefense.g:559:1: ( '}' )
            // InternalTowerDefense.g:560:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTowerDefense.g:570:1: rule__Partie__Group__0 : rule__Partie__Group__0__Impl rule__Partie__Group__1 ;
    public final void rule__Partie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:574:1: ( rule__Partie__Group__0__Impl rule__Partie__Group__1 )
            // InternalTowerDefense.g:575:2: rule__Partie__Group__0__Impl rule__Partie__Group__1
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
    // InternalTowerDefense.g:582:1: rule__Partie__Group__0__Impl : ( 'Partie' ) ;
    public final void rule__Partie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:586:1: ( ( 'Partie' ) )
            // InternalTowerDefense.g:587:1: ( 'Partie' )
            {
            // InternalTowerDefense.g:587:1: ( 'Partie' )
            // InternalTowerDefense.g:588:2: 'Partie'
            {
             before(grammarAccess.getPartieAccess().getPartieKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTowerDefense.g:597:1: rule__Partie__Group__1 : rule__Partie__Group__1__Impl rule__Partie__Group__2 ;
    public final void rule__Partie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:601:1: ( rule__Partie__Group__1__Impl rule__Partie__Group__2 )
            // InternalTowerDefense.g:602:2: rule__Partie__Group__1__Impl rule__Partie__Group__2
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
    // InternalTowerDefense.g:609:1: rule__Partie__Group__1__Impl : ( ( rule__Partie__NameAssignment_1 ) ) ;
    public final void rule__Partie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:613:1: ( ( ( rule__Partie__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:614:1: ( ( rule__Partie__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:614:1: ( ( rule__Partie__NameAssignment_1 ) )
            // InternalTowerDefense.g:615:2: ( rule__Partie__NameAssignment_1 )
            {
             before(grammarAccess.getPartieAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:616:2: ( rule__Partie__NameAssignment_1 )
            // InternalTowerDefense.g:616:3: rule__Partie__NameAssignment_1
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
    // InternalTowerDefense.g:624:1: rule__Partie__Group__2 : rule__Partie__Group__2__Impl rule__Partie__Group__3 ;
    public final void rule__Partie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:628:1: ( rule__Partie__Group__2__Impl rule__Partie__Group__3 )
            // InternalTowerDefense.g:629:2: rule__Partie__Group__2__Impl rule__Partie__Group__3
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
    // InternalTowerDefense.g:636:1: rule__Partie__Group__2__Impl : ( '{' ) ;
    public final void rule__Partie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:640:1: ( ( '{' ) )
            // InternalTowerDefense.g:641:1: ( '{' )
            {
            // InternalTowerDefense.g:641:1: ( '{' )
            // InternalTowerDefense.g:642:2: '{'
            {
             before(grammarAccess.getPartieAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTowerDefense.g:651:1: rule__Partie__Group__3 : rule__Partie__Group__3__Impl rule__Partie__Group__4 ;
    public final void rule__Partie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:655:1: ( rule__Partie__Group__3__Impl rule__Partie__Group__4 )
            // InternalTowerDefense.g:656:2: rule__Partie__Group__3__Impl rule__Partie__Group__4
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
    // InternalTowerDefense.g:663:1: rule__Partie__Group__3__Impl : ( ( rule__Partie__PartiesElementsAssignment_3 )* ) ;
    public final void rule__Partie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:667:1: ( ( ( rule__Partie__PartiesElementsAssignment_3 )* ) )
            // InternalTowerDefense.g:668:1: ( ( rule__Partie__PartiesElementsAssignment_3 )* )
            {
            // InternalTowerDefense.g:668:1: ( ( rule__Partie__PartiesElementsAssignment_3 )* )
            // InternalTowerDefense.g:669:2: ( rule__Partie__PartiesElementsAssignment_3 )*
            {
             before(grammarAccess.getPartieAccess().getPartiesElementsAssignment_3()); 
            // InternalTowerDefense.g:670:2: ( rule__Partie__PartiesElementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=39 && LA6_0<=42)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTowerDefense.g:670:3: rule__Partie__PartiesElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Partie__PartiesElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPartieAccess().getPartiesElementsAssignment_3()); 

            }


            }

        }
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
    // InternalTowerDefense.g:678:1: rule__Partie__Group__4 : rule__Partie__Group__4__Impl rule__Partie__Group__5 ;
    public final void rule__Partie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:682:1: ( rule__Partie__Group__4__Impl rule__Partie__Group__5 )
            // InternalTowerDefense.g:683:2: rule__Partie__Group__4__Impl rule__Partie__Group__5
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
    // InternalTowerDefense.g:690:1: rule__Partie__Group__4__Impl : ( ( rule__Partie__NiveauxAssignment_4 )* ) ;
    public final void rule__Partie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:694:1: ( ( ( rule__Partie__NiveauxAssignment_4 )* ) )
            // InternalTowerDefense.g:695:1: ( ( rule__Partie__NiveauxAssignment_4 )* )
            {
            // InternalTowerDefense.g:695:1: ( ( rule__Partie__NiveauxAssignment_4 )* )
            // InternalTowerDefense.g:696:2: ( rule__Partie__NiveauxAssignment_4 )*
            {
             before(grammarAccess.getPartieAccess().getNiveauxAssignment_4()); 
            // InternalTowerDefense.g:697:2: ( rule__Partie__NiveauxAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTowerDefense.g:697:3: rule__Partie__NiveauxAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Partie__NiveauxAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPartieAccess().getNiveauxAssignment_4()); 

            }


            }

        }
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
    // InternalTowerDefense.g:705:1: rule__Partie__Group__5 : rule__Partie__Group__5__Impl ;
    public final void rule__Partie__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:709:1: ( rule__Partie__Group__5__Impl )
            // InternalTowerDefense.g:710:2: rule__Partie__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Partie__Group__5__Impl();

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
    // InternalTowerDefense.g:716:1: rule__Partie__Group__5__Impl : ( '}' ) ;
    public final void rule__Partie__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:720:1: ( ( '}' ) )
            // InternalTowerDefense.g:721:1: ( '}' )
            {
            // InternalTowerDefense.g:721:1: ( '}' )
            // InternalTowerDefense.g:722:2: '}'
            {
             before(grammarAccess.getPartieAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPartieAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tactique__Group_0__0"
    // InternalTowerDefense.g:732:1: rule__Tactique__Group_0__0 : rule__Tactique__Group_0__0__Impl rule__Tactique__Group_0__1 ;
    public final void rule__Tactique__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:736:1: ( rule__Tactique__Group_0__0__Impl rule__Tactique__Group_0__1 )
            // InternalTowerDefense.g:737:2: rule__Tactique__Group_0__0__Impl rule__Tactique__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Tactique__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tactique__Group_0__1();

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
    // $ANTLR end "rule__Tactique__Group_0__0"


    // $ANTLR start "rule__Tactique__Group_0__0__Impl"
    // InternalTowerDefense.g:744:1: rule__Tactique__Group_0__0__Impl : ( 'Tactique' ) ;
    public final void rule__Tactique__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:748:1: ( ( 'Tactique' ) )
            // InternalTowerDefense.g:749:1: ( 'Tactique' )
            {
            // InternalTowerDefense.g:749:1: ( 'Tactique' )
            // InternalTowerDefense.g:750:2: 'Tactique'
            {
             before(grammarAccess.getTactiqueAccess().getTactiqueKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTactiqueAccess().getTactiqueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tactique__Group_0__0__Impl"


    // $ANTLR start "rule__Tactique__Group_0__1"
    // InternalTowerDefense.g:759:1: rule__Tactique__Group_0__1 : rule__Tactique__Group_0__1__Impl ;
    public final void rule__Tactique__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:763:1: ( rule__Tactique__Group_0__1__Impl )
            // InternalTowerDefense.g:764:2: rule__Tactique__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tactique__Group_0__1__Impl();

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
    // $ANTLR end "rule__Tactique__Group_0__1"


    // $ANTLR start "rule__Tactique__Group_0__1__Impl"
    // InternalTowerDefense.g:770:1: rule__Tactique__Group_0__1__Impl : ( ( rule__Tactique__ProcheAssignment_0_1 ) ) ;
    public final void rule__Tactique__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:774:1: ( ( ( rule__Tactique__ProcheAssignment_0_1 ) ) )
            // InternalTowerDefense.g:775:1: ( ( rule__Tactique__ProcheAssignment_0_1 ) )
            {
            // InternalTowerDefense.g:775:1: ( ( rule__Tactique__ProcheAssignment_0_1 ) )
            // InternalTowerDefense.g:776:2: ( rule__Tactique__ProcheAssignment_0_1 )
            {
             before(grammarAccess.getTactiqueAccess().getProcheAssignment_0_1()); 
            // InternalTowerDefense.g:777:2: ( rule__Tactique__ProcheAssignment_0_1 )
            // InternalTowerDefense.g:777:3: rule__Tactique__ProcheAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Tactique__ProcheAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTactiqueAccess().getProcheAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tactique__Group_0__1__Impl"


    // $ANTLR start "rule__NatureTerrain__Group__0"
    // InternalTowerDefense.g:786:1: rule__NatureTerrain__Group__0 : rule__NatureTerrain__Group__0__Impl rule__NatureTerrain__Group__1 ;
    public final void rule__NatureTerrain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:790:1: ( rule__NatureTerrain__Group__0__Impl rule__NatureTerrain__Group__1 )
            // InternalTowerDefense.g:791:2: rule__NatureTerrain__Group__0__Impl rule__NatureTerrain__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTowerDefense.g:798:1: rule__NatureTerrain__Group__0__Impl : ( ( rule__NatureTerrain__NameAssignment_0 ) ) ;
    public final void rule__NatureTerrain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:802:1: ( ( ( rule__NatureTerrain__NameAssignment_0 ) ) )
            // InternalTowerDefense.g:803:1: ( ( rule__NatureTerrain__NameAssignment_0 ) )
            {
            // InternalTowerDefense.g:803:1: ( ( rule__NatureTerrain__NameAssignment_0 ) )
            // InternalTowerDefense.g:804:2: ( rule__NatureTerrain__NameAssignment_0 )
            {
             before(grammarAccess.getNatureTerrainAccess().getNameAssignment_0()); 
            // InternalTowerDefense.g:805:2: ( rule__NatureTerrain__NameAssignment_0 )
            // InternalTowerDefense.g:805:3: rule__NatureTerrain__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalTowerDefense.g:813:1: rule__NatureTerrain__Group__1 : rule__NatureTerrain__Group__1__Impl rule__NatureTerrain__Group__2 ;
    public final void rule__NatureTerrain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:817:1: ( rule__NatureTerrain__Group__1__Impl rule__NatureTerrain__Group__2 )
            // InternalTowerDefense.g:818:2: rule__NatureTerrain__Group__1__Impl rule__NatureTerrain__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalTowerDefense.g:825:1: rule__NatureTerrain__Group__1__Impl : ( '{' ) ;
    public final void rule__NatureTerrain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:829:1: ( ( '{' ) )
            // InternalTowerDefense.g:830:1: ( '{' )
            {
            // InternalTowerDefense.g:830:1: ( '{' )
            // InternalTowerDefense.g:831:2: '{'
            {
             before(grammarAccess.getNatureTerrainAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalTowerDefense.g:840:1: rule__NatureTerrain__Group__2 : rule__NatureTerrain__Group__2__Impl rule__NatureTerrain__Group__3 ;
    public final void rule__NatureTerrain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:844:1: ( rule__NatureTerrain__Group__2__Impl rule__NatureTerrain__Group__3 )
            // InternalTowerDefense.g:845:2: rule__NatureTerrain__Group__2__Impl rule__NatureTerrain__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalTowerDefense.g:852:1: rule__NatureTerrain__Group__2__Impl : ( 'Volume' ) ;
    public final void rule__NatureTerrain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:856:1: ( ( 'Volume' ) )
            // InternalTowerDefense.g:857:1: ( 'Volume' )
            {
            // InternalTowerDefense.g:857:1: ( 'Volume' )
            // InternalTowerDefense.g:858:2: 'Volume'
            {
             before(grammarAccess.getNatureTerrainAccess().getVolumeKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getVolumeKeyword_2()); 

            }


            }

        }
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
    // InternalTowerDefense.g:867:1: rule__NatureTerrain__Group__3 : rule__NatureTerrain__Group__3__Impl rule__NatureTerrain__Group__4 ;
    public final void rule__NatureTerrain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:871:1: ( rule__NatureTerrain__Group__3__Impl rule__NatureTerrain__Group__4 )
            // InternalTowerDefense.g:872:2: rule__NatureTerrain__Group__3__Impl rule__NatureTerrain__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalTowerDefense.g:879:1: rule__NatureTerrain__Group__3__Impl : ( ( rule__NatureTerrain__VolumeAssignment_3 ) ) ;
    public final void rule__NatureTerrain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:883:1: ( ( ( rule__NatureTerrain__VolumeAssignment_3 ) ) )
            // InternalTowerDefense.g:884:1: ( ( rule__NatureTerrain__VolumeAssignment_3 ) )
            {
            // InternalTowerDefense.g:884:1: ( ( rule__NatureTerrain__VolumeAssignment_3 ) )
            // InternalTowerDefense.g:885:2: ( rule__NatureTerrain__VolumeAssignment_3 )
            {
             before(grammarAccess.getNatureTerrainAccess().getVolumeAssignment_3()); 
            // InternalTowerDefense.g:886:2: ( rule__NatureTerrain__VolumeAssignment_3 )
            // InternalTowerDefense.g:886:3: rule__NatureTerrain__VolumeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__VolumeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getVolumeAssignment_3()); 

            }


            }

        }
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
    // InternalTowerDefense.g:894:1: rule__NatureTerrain__Group__4 : rule__NatureTerrain__Group__4__Impl rule__NatureTerrain__Group__5 ;
    public final void rule__NatureTerrain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:898:1: ( rule__NatureTerrain__Group__4__Impl rule__NatureTerrain__Group__5 )
            // InternalTowerDefense.g:899:2: rule__NatureTerrain__Group__4__Impl rule__NatureTerrain__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalTowerDefense.g:906:1: rule__NatureTerrain__Group__4__Impl : ( 'Type' ) ;
    public final void rule__NatureTerrain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:910:1: ( ( 'Type' ) )
            // InternalTowerDefense.g:911:1: ( 'Type' )
            {
            // InternalTowerDefense.g:911:1: ( 'Type' )
            // InternalTowerDefense.g:912:2: 'Type'
            {
             before(grammarAccess.getNatureTerrainAccess().getTypeKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getTypeKeyword_4()); 

            }


            }

        }
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
    // InternalTowerDefense.g:921:1: rule__NatureTerrain__Group__5 : rule__NatureTerrain__Group__5__Impl rule__NatureTerrain__Group__6 ;
    public final void rule__NatureTerrain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:925:1: ( rule__NatureTerrain__Group__5__Impl rule__NatureTerrain__Group__6 )
            // InternalTowerDefense.g:926:2: rule__NatureTerrain__Group__5__Impl rule__NatureTerrain__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalTowerDefense.g:933:1: rule__NatureTerrain__Group__5__Impl : ( ( rule__NatureTerrain__TypeAssignment_5 ) ) ;
    public final void rule__NatureTerrain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:937:1: ( ( ( rule__NatureTerrain__TypeAssignment_5 ) ) )
            // InternalTowerDefense.g:938:1: ( ( rule__NatureTerrain__TypeAssignment_5 ) )
            {
            // InternalTowerDefense.g:938:1: ( ( rule__NatureTerrain__TypeAssignment_5 ) )
            // InternalTowerDefense.g:939:2: ( rule__NatureTerrain__TypeAssignment_5 )
            {
             before(grammarAccess.getNatureTerrainAccess().getTypeAssignment_5()); 
            // InternalTowerDefense.g:940:2: ( rule__NatureTerrain__TypeAssignment_5 )
            // InternalTowerDefense.g:940:3: rule__NatureTerrain__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getTypeAssignment_5()); 

            }


            }

        }
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
    // InternalTowerDefense.g:948:1: rule__NatureTerrain__Group__6 : rule__NatureTerrain__Group__6__Impl rule__NatureTerrain__Group__7 ;
    public final void rule__NatureTerrain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:952:1: ( rule__NatureTerrain__Group__6__Impl rule__NatureTerrain__Group__7 )
            // InternalTowerDefense.g:953:2: rule__NatureTerrain__Group__6__Impl rule__NatureTerrain__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalTowerDefense.g:960:1: rule__NatureTerrain__Group__6__Impl : ( 'FatigueEntree' ) ;
    public final void rule__NatureTerrain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:964:1: ( ( 'FatigueEntree' ) )
            // InternalTowerDefense.g:965:1: ( 'FatigueEntree' )
            {
            // InternalTowerDefense.g:965:1: ( 'FatigueEntree' )
            // InternalTowerDefense.g:966:2: 'FatigueEntree'
            {
             before(grammarAccess.getNatureTerrainAccess().getFatigueEntreeKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getFatigueEntreeKeyword_6()); 

            }


            }

        }
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
    // InternalTowerDefense.g:975:1: rule__NatureTerrain__Group__7 : rule__NatureTerrain__Group__7__Impl rule__NatureTerrain__Group__8 ;
    public final void rule__NatureTerrain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:979:1: ( rule__NatureTerrain__Group__7__Impl rule__NatureTerrain__Group__8 )
            // InternalTowerDefense.g:980:2: rule__NatureTerrain__Group__7__Impl rule__NatureTerrain__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalTowerDefense.g:987:1: rule__NatureTerrain__Group__7__Impl : ( ( rule__NatureTerrain__FatigueAssignment_7 ) ) ;
    public final void rule__NatureTerrain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:991:1: ( ( ( rule__NatureTerrain__FatigueAssignment_7 ) ) )
            // InternalTowerDefense.g:992:1: ( ( rule__NatureTerrain__FatigueAssignment_7 ) )
            {
            // InternalTowerDefense.g:992:1: ( ( rule__NatureTerrain__FatigueAssignment_7 ) )
            // InternalTowerDefense.g:993:2: ( rule__NatureTerrain__FatigueAssignment_7 )
            {
             before(grammarAccess.getNatureTerrainAccess().getFatigueAssignment_7()); 
            // InternalTowerDefense.g:994:2: ( rule__NatureTerrain__FatigueAssignment_7 )
            // InternalTowerDefense.g:994:3: rule__NatureTerrain__FatigueAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__FatigueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNatureTerrainAccess().getFatigueAssignment_7()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1002:1: rule__NatureTerrain__Group__8 : rule__NatureTerrain__Group__8__Impl ;
    public final void rule__NatureTerrain__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1006:1: ( rule__NatureTerrain__Group__8__Impl )
            // InternalTowerDefense.g:1007:2: rule__NatureTerrain__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NatureTerrain__Group__8__Impl();

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
    // InternalTowerDefense.g:1013:1: rule__NatureTerrain__Group__8__Impl : ( '}' ) ;
    public final void rule__NatureTerrain__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1017:1: ( ( '}' ) )
            // InternalTowerDefense.g:1018:1: ( '}' )
            {
            // InternalTowerDefense.g:1018:1: ( '}' )
            // InternalTowerDefense.g:1019:2: '}'
            {
             before(grammarAccess.getNatureTerrainAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Niveau__Group__0"
    // InternalTowerDefense.g:1029:1: rule__Niveau__Group__0 : rule__Niveau__Group__0__Impl rule__Niveau__Group__1 ;
    public final void rule__Niveau__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1033:1: ( rule__Niveau__Group__0__Impl rule__Niveau__Group__1 )
            // InternalTowerDefense.g:1034:2: rule__Niveau__Group__0__Impl rule__Niveau__Group__1
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
    // InternalTowerDefense.g:1041:1: rule__Niveau__Group__0__Impl : ( 'Niveau' ) ;
    public final void rule__Niveau__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1045:1: ( ( 'Niveau' ) )
            // InternalTowerDefense.g:1046:1: ( 'Niveau' )
            {
            // InternalTowerDefense.g:1046:1: ( 'Niveau' )
            // InternalTowerDefense.g:1047:2: 'Niveau'
            {
             before(grammarAccess.getNiveauAccess().getNiveauKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTowerDefense.g:1056:1: rule__Niveau__Group__1 : rule__Niveau__Group__1__Impl rule__Niveau__Group__2 ;
    public final void rule__Niveau__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1060:1: ( rule__Niveau__Group__1__Impl rule__Niveau__Group__2 )
            // InternalTowerDefense.g:1061:2: rule__Niveau__Group__1__Impl rule__Niveau__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalTowerDefense.g:1068:1: rule__Niveau__Group__1__Impl : ( ( rule__Niveau__NameAssignment_1 ) ) ;
    public final void rule__Niveau__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1072:1: ( ( ( rule__Niveau__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:1073:1: ( ( rule__Niveau__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:1073:1: ( ( rule__Niveau__NameAssignment_1 ) )
            // InternalTowerDefense.g:1074:2: ( rule__Niveau__NameAssignment_1 )
            {
             before(grammarAccess.getNiveauAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:1075:2: ( rule__Niveau__NameAssignment_1 )
            // InternalTowerDefense.g:1075:3: rule__Niveau__NameAssignment_1
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
    // InternalTowerDefense.g:1083:1: rule__Niveau__Group__2 : rule__Niveau__Group__2__Impl rule__Niveau__Group__3 ;
    public final void rule__Niveau__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1087:1: ( rule__Niveau__Group__2__Impl rule__Niveau__Group__3 )
            // InternalTowerDefense.g:1088:2: rule__Niveau__Group__2__Impl rule__Niveau__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalTowerDefense.g:1095:1: rule__Niveau__Group__2__Impl : ( '{' ) ;
    public final void rule__Niveau__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1099:1: ( ( '{' ) )
            // InternalTowerDefense.g:1100:1: ( '{' )
            {
            // InternalTowerDefense.g:1100:1: ( '{' )
            // InternalTowerDefense.g:1101:2: '{'
            {
             before(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1110:1: rule__Niveau__Group__3 : rule__Niveau__Group__3__Impl rule__Niveau__Group__4 ;
    public final void rule__Niveau__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1114:1: ( rule__Niveau__Group__3__Impl rule__Niveau__Group__4 )
            // InternalTowerDefense.g:1115:2: rule__Niveau__Group__3__Impl rule__Niveau__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalTowerDefense.g:1122:1: rule__Niveau__Group__3__Impl : ( 'Difficulte' ) ;
    public final void rule__Niveau__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1126:1: ( ( 'Difficulte' ) )
            // InternalTowerDefense.g:1127:1: ( 'Difficulte' )
            {
            // InternalTowerDefense.g:1127:1: ( 'Difficulte' )
            // InternalTowerDefense.g:1128:2: 'Difficulte'
            {
             before(grammarAccess.getNiveauAccess().getDifficulteKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getDifficulteKeyword_3()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1137:1: rule__Niveau__Group__4 : rule__Niveau__Group__4__Impl rule__Niveau__Group__5 ;
    public final void rule__Niveau__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1141:1: ( rule__Niveau__Group__4__Impl rule__Niveau__Group__5 )
            // InternalTowerDefense.g:1142:2: rule__Niveau__Group__4__Impl rule__Niveau__Group__5
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
    // InternalTowerDefense.g:1149:1: rule__Niveau__Group__4__Impl : ( ( rule__Niveau__DifficulteAssignment_4 ) ) ;
    public final void rule__Niveau__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1153:1: ( ( ( rule__Niveau__DifficulteAssignment_4 ) ) )
            // InternalTowerDefense.g:1154:1: ( ( rule__Niveau__DifficulteAssignment_4 ) )
            {
            // InternalTowerDefense.g:1154:1: ( ( rule__Niveau__DifficulteAssignment_4 ) )
            // InternalTowerDefense.g:1155:2: ( rule__Niveau__DifficulteAssignment_4 )
            {
             before(grammarAccess.getNiveauAccess().getDifficulteAssignment_4()); 
            // InternalTowerDefense.g:1156:2: ( rule__Niveau__DifficulteAssignment_4 )
            // InternalTowerDefense.g:1156:3: rule__Niveau__DifficulteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__DifficulteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getDifficulteAssignment_4()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1164:1: rule__Niveau__Group__5 : rule__Niveau__Group__5__Impl rule__Niveau__Group__6 ;
    public final void rule__Niveau__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1168:1: ( rule__Niveau__Group__5__Impl rule__Niveau__Group__6 )
            // InternalTowerDefense.g:1169:2: rule__Niveau__Group__5__Impl rule__Niveau__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalTowerDefense.g:1176:1: rule__Niveau__Group__5__Impl : ( 'DureePauses' ) ;
    public final void rule__Niveau__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1180:1: ( ( 'DureePauses' ) )
            // InternalTowerDefense.g:1181:1: ( 'DureePauses' )
            {
            // InternalTowerDefense.g:1181:1: ( 'DureePauses' )
            // InternalTowerDefense.g:1182:2: 'DureePauses'
            {
             before(grammarAccess.getNiveauAccess().getDureePausesKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getDureePausesKeyword_5()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1191:1: rule__Niveau__Group__6 : rule__Niveau__Group__6__Impl rule__Niveau__Group__7 ;
    public final void rule__Niveau__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1195:1: ( rule__Niveau__Group__6__Impl rule__Niveau__Group__7 )
            // InternalTowerDefense.g:1196:2: rule__Niveau__Group__6__Impl rule__Niveau__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalTowerDefense.g:1203:1: rule__Niveau__Group__6__Impl : ( ( rule__Niveau__DureePauseAssignment_6 ) ) ;
    public final void rule__Niveau__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1207:1: ( ( ( rule__Niveau__DureePauseAssignment_6 ) ) )
            // InternalTowerDefense.g:1208:1: ( ( rule__Niveau__DureePauseAssignment_6 ) )
            {
            // InternalTowerDefense.g:1208:1: ( ( rule__Niveau__DureePauseAssignment_6 ) )
            // InternalTowerDefense.g:1209:2: ( rule__Niveau__DureePauseAssignment_6 )
            {
             before(grammarAccess.getNiveauAccess().getDureePauseAssignment_6()); 
            // InternalTowerDefense.g:1210:2: ( rule__Niveau__DureePauseAssignment_6 )
            // InternalTowerDefense.g:1210:3: rule__Niveau__DureePauseAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__DureePauseAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getDureePauseAssignment_6()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1218:1: rule__Niveau__Group__7 : rule__Niveau__Group__7__Impl rule__Niveau__Group__8 ;
    public final void rule__Niveau__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1222:1: ( rule__Niveau__Group__7__Impl rule__Niveau__Group__8 )
            // InternalTowerDefense.g:1223:2: rule__Niveau__Group__7__Impl rule__Niveau__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalTowerDefense.g:1230:1: rule__Niveau__Group__7__Impl : ( 'Argent' ) ;
    public final void rule__Niveau__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1234:1: ( ( 'Argent' ) )
            // InternalTowerDefense.g:1235:1: ( 'Argent' )
            {
            // InternalTowerDefense.g:1235:1: ( 'Argent' )
            // InternalTowerDefense.g:1236:2: 'Argent'
            {
             before(grammarAccess.getNiveauAccess().getArgentKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getArgentKeyword_7()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1245:1: rule__Niveau__Group__8 : rule__Niveau__Group__8__Impl rule__Niveau__Group__9 ;
    public final void rule__Niveau__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1249:1: ( rule__Niveau__Group__8__Impl rule__Niveau__Group__9 )
            // InternalTowerDefense.g:1250:2: rule__Niveau__Group__8__Impl rule__Niveau__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalTowerDefense.g:1257:1: rule__Niveau__Group__8__Impl : ( ( rule__Niveau__ArgentAssignment_8 ) ) ;
    public final void rule__Niveau__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1261:1: ( ( ( rule__Niveau__ArgentAssignment_8 ) ) )
            // InternalTowerDefense.g:1262:1: ( ( rule__Niveau__ArgentAssignment_8 ) )
            {
            // InternalTowerDefense.g:1262:1: ( ( rule__Niveau__ArgentAssignment_8 ) )
            // InternalTowerDefense.g:1263:2: ( rule__Niveau__ArgentAssignment_8 )
            {
             before(grammarAccess.getNiveauAccess().getArgentAssignment_8()); 
            // InternalTowerDefense.g:1264:2: ( rule__Niveau__ArgentAssignment_8 )
            // InternalTowerDefense.g:1264:3: rule__Niveau__ArgentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__ArgentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getArgentAssignment_8()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1272:1: rule__Niveau__Group__9 : rule__Niveau__Group__9__Impl rule__Niveau__Group__10 ;
    public final void rule__Niveau__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1276:1: ( rule__Niveau__Group__9__Impl rule__Niveau__Group__10 )
            // InternalTowerDefense.g:1277:2: rule__Niveau__Group__9__Impl rule__Niveau__Group__10
            {
            pushFollow(FOLLOW_12);
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
    // InternalTowerDefense.g:1284:1: rule__Niveau__Group__9__Impl : ( 'MobSortisMax' ) ;
    public final void rule__Niveau__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1288:1: ( ( 'MobSortisMax' ) )
            // InternalTowerDefense.g:1289:1: ( 'MobSortisMax' )
            {
            // InternalTowerDefense.g:1289:1: ( 'MobSortisMax' )
            // InternalTowerDefense.g:1290:2: 'MobSortisMax'
            {
             before(grammarAccess.getNiveauAccess().getMobSortisMaxKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getMobSortisMaxKeyword_9()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1299:1: rule__Niveau__Group__10 : rule__Niveau__Group__10__Impl rule__Niveau__Group__11 ;
    public final void rule__Niveau__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1303:1: ( rule__Niveau__Group__10__Impl rule__Niveau__Group__11 )
            // InternalTowerDefense.g:1304:2: rule__Niveau__Group__10__Impl rule__Niveau__Group__11
            {
            pushFollow(FOLLOW_22);
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
    // InternalTowerDefense.g:1311:1: rule__Niveau__Group__10__Impl : ( ( rule__Niveau__MobSortisLimiteAssignment_10 ) ) ;
    public final void rule__Niveau__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1315:1: ( ( ( rule__Niveau__MobSortisLimiteAssignment_10 ) ) )
            // InternalTowerDefense.g:1316:1: ( ( rule__Niveau__MobSortisLimiteAssignment_10 ) )
            {
            // InternalTowerDefense.g:1316:1: ( ( rule__Niveau__MobSortisLimiteAssignment_10 ) )
            // InternalTowerDefense.g:1317:2: ( rule__Niveau__MobSortisLimiteAssignment_10 )
            {
             before(grammarAccess.getNiveauAccess().getMobSortisLimiteAssignment_10()); 
            // InternalTowerDefense.g:1318:2: ( rule__Niveau__MobSortisLimiteAssignment_10 )
            // InternalTowerDefense.g:1318:3: rule__Niveau__MobSortisLimiteAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__MobSortisLimiteAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getMobSortisLimiteAssignment_10()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1326:1: rule__Niveau__Group__11 : rule__Niveau__Group__11__Impl rule__Niveau__Group__12 ;
    public final void rule__Niveau__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1330:1: ( rule__Niveau__Group__11__Impl rule__Niveau__Group__12 )
            // InternalTowerDefense.g:1331:2: rule__Niveau__Group__11__Impl rule__Niveau__Group__12
            {
            pushFollow(FOLLOW_23);
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
    // InternalTowerDefense.g:1338:1: rule__Niveau__Group__11__Impl : ( ( rule__Niveau__TerrainAssignment_11 ) ) ;
    public final void rule__Niveau__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1342:1: ( ( ( rule__Niveau__TerrainAssignment_11 ) ) )
            // InternalTowerDefense.g:1343:1: ( ( rule__Niveau__TerrainAssignment_11 ) )
            {
            // InternalTowerDefense.g:1343:1: ( ( rule__Niveau__TerrainAssignment_11 ) )
            // InternalTowerDefense.g:1344:2: ( rule__Niveau__TerrainAssignment_11 )
            {
             before(grammarAccess.getNiveauAccess().getTerrainAssignment_11()); 
            // InternalTowerDefense.g:1345:2: ( rule__Niveau__TerrainAssignment_11 )
            // InternalTowerDefense.g:1345:3: rule__Niveau__TerrainAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__TerrainAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getTerrainAssignment_11()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1353:1: rule__Niveau__Group__12 : rule__Niveau__Group__12__Impl rule__Niveau__Group__13 ;
    public final void rule__Niveau__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1357:1: ( rule__Niveau__Group__12__Impl rule__Niveau__Group__13 )
            // InternalTowerDefense.g:1358:2: rule__Niveau__Group__12__Impl rule__Niveau__Group__13
            {
            pushFollow(FOLLOW_4);
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
    // InternalTowerDefense.g:1365:1: rule__Niveau__Group__12__Impl : ( 'Vague' ) ;
    public final void rule__Niveau__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1369:1: ( ( 'Vague' ) )
            // InternalTowerDefense.g:1370:1: ( 'Vague' )
            {
            // InternalTowerDefense.g:1370:1: ( 'Vague' )
            // InternalTowerDefense.g:1371:2: 'Vague'
            {
             before(grammarAccess.getNiveauAccess().getVagueKeyword_12()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getVagueKeyword_12()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1380:1: rule__Niveau__Group__13 : rule__Niveau__Group__13__Impl rule__Niveau__Group__14 ;
    public final void rule__Niveau__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1384:1: ( rule__Niveau__Group__13__Impl rule__Niveau__Group__14 )
            // InternalTowerDefense.g:1385:2: rule__Niveau__Group__13__Impl rule__Niveau__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__Niveau__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__14();

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
    // InternalTowerDefense.g:1392:1: rule__Niveau__Group__13__Impl : ( ( rule__Niveau__VaguesAssignment_13 ) ) ;
    public final void rule__Niveau__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1396:1: ( ( ( rule__Niveau__VaguesAssignment_13 ) ) )
            // InternalTowerDefense.g:1397:1: ( ( rule__Niveau__VaguesAssignment_13 ) )
            {
            // InternalTowerDefense.g:1397:1: ( ( rule__Niveau__VaguesAssignment_13 ) )
            // InternalTowerDefense.g:1398:2: ( rule__Niveau__VaguesAssignment_13 )
            {
             before(grammarAccess.getNiveauAccess().getVaguesAssignment_13()); 
            // InternalTowerDefense.g:1399:2: ( rule__Niveau__VaguesAssignment_13 )
            // InternalTowerDefense.g:1399:3: rule__Niveau__VaguesAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__VaguesAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getVaguesAssignment_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Niveau__Group__14"
    // InternalTowerDefense.g:1407:1: rule__Niveau__Group__14 : rule__Niveau__Group__14__Impl ;
    public final void rule__Niveau__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1411:1: ( rule__Niveau__Group__14__Impl )
            // InternalTowerDefense.g:1412:2: rule__Niveau__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group__14__Impl();

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
    // $ANTLR end "rule__Niveau__Group__14"


    // $ANTLR start "rule__Niveau__Group__14__Impl"
    // InternalTowerDefense.g:1418:1: rule__Niveau__Group__14__Impl : ( '}' ) ;
    public final void rule__Niveau__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1422:1: ( ( '}' ) )
            // InternalTowerDefense.g:1423:1: ( '}' )
            {
            // InternalTowerDefense.g:1423:1: ( '}' )
            // InternalTowerDefense.g:1424:2: '}'
            {
             before(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_14()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__14__Impl"


    // $ANTLR start "rule__TerrainDeJeu__Group__0"
    // InternalTowerDefense.g:1434:1: rule__TerrainDeJeu__Group__0 : rule__TerrainDeJeu__Group__0__Impl rule__TerrainDeJeu__Group__1 ;
    public final void rule__TerrainDeJeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1438:1: ( rule__TerrainDeJeu__Group__0__Impl rule__TerrainDeJeu__Group__1 )
            // InternalTowerDefense.g:1439:2: rule__TerrainDeJeu__Group__0__Impl rule__TerrainDeJeu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TerrainDeJeu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerrainDeJeu__Group__1();

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
    // $ANTLR end "rule__TerrainDeJeu__Group__0"


    // $ANTLR start "rule__TerrainDeJeu__Group__0__Impl"
    // InternalTowerDefense.g:1446:1: rule__TerrainDeJeu__Group__0__Impl : ( 'Terrain' ) ;
    public final void rule__TerrainDeJeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1450:1: ( ( 'Terrain' ) )
            // InternalTowerDefense.g:1451:1: ( 'Terrain' )
            {
            // InternalTowerDefense.g:1451:1: ( 'Terrain' )
            // InternalTowerDefense.g:1452:2: 'Terrain'
            {
             before(grammarAccess.getTerrainDeJeuAccess().getTerrainKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTerrainDeJeuAccess().getTerrainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerrainDeJeu__Group__0__Impl"


    // $ANTLR start "rule__TerrainDeJeu__Group__1"
    // InternalTowerDefense.g:1461:1: rule__TerrainDeJeu__Group__1 : rule__TerrainDeJeu__Group__1__Impl ;
    public final void rule__TerrainDeJeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1465:1: ( rule__TerrainDeJeu__Group__1__Impl )
            // InternalTowerDefense.g:1466:2: rule__TerrainDeJeu__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerrainDeJeu__Group__1__Impl();

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
    // $ANTLR end "rule__TerrainDeJeu__Group__1"


    // $ANTLR start "rule__TerrainDeJeu__Group__1__Impl"
    // InternalTowerDefense.g:1472:1: rule__TerrainDeJeu__Group__1__Impl : ( ( rule__TerrainDeJeu__DamierAssignment_1 ) ) ;
    public final void rule__TerrainDeJeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1476:1: ( ( ( rule__TerrainDeJeu__DamierAssignment_1 ) ) )
            // InternalTowerDefense.g:1477:1: ( ( rule__TerrainDeJeu__DamierAssignment_1 ) )
            {
            // InternalTowerDefense.g:1477:1: ( ( rule__TerrainDeJeu__DamierAssignment_1 ) )
            // InternalTowerDefense.g:1478:2: ( rule__TerrainDeJeu__DamierAssignment_1 )
            {
             before(grammarAccess.getTerrainDeJeuAccess().getDamierAssignment_1()); 
            // InternalTowerDefense.g:1479:2: ( rule__TerrainDeJeu__DamierAssignment_1 )
            // InternalTowerDefense.g:1479:3: rule__TerrainDeJeu__DamierAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TerrainDeJeu__DamierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTerrainDeJeuAccess().getDamierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerrainDeJeu__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalTowerDefense.g:1488:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1492:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalTowerDefense.g:1493:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTowerDefense.g:1500:1: rule__Case__Group__0__Impl : ( 'i' ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1504:1: ( ( 'i' ) )
            // InternalTowerDefense.g:1505:1: ( 'i' )
            {
            // InternalTowerDefense.g:1505:1: ( 'i' )
            // InternalTowerDefense.g:1506:2: 'i'
            {
             before(grammarAccess.getCaseAccess().getIKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getIKeyword_0()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1515:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1519:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalTowerDefense.g:1520:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalTowerDefense.g:1527:1: rule__Case__Group__1__Impl : ( ( rule__Case__IAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1531:1: ( ( ( rule__Case__IAssignment_1 ) ) )
            // InternalTowerDefense.g:1532:1: ( ( rule__Case__IAssignment_1 ) )
            {
            // InternalTowerDefense.g:1532:1: ( ( rule__Case__IAssignment_1 ) )
            // InternalTowerDefense.g:1533:2: ( rule__Case__IAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getIAssignment_1()); 
            // InternalTowerDefense.g:1534:2: ( rule__Case__IAssignment_1 )
            // InternalTowerDefense.g:1534:3: rule__Case__IAssignment_1
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
    // InternalTowerDefense.g:1542:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1546:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalTowerDefense.g:1547:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalTowerDefense.g:1554:1: rule__Case__Group__2__Impl : ( 'j' ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1558:1: ( ( 'j' ) )
            // InternalTowerDefense.g:1559:1: ( 'j' )
            {
            // InternalTowerDefense.g:1559:1: ( 'j' )
            // InternalTowerDefense.g:1560:2: 'j'
            {
             before(grammarAccess.getCaseAccess().getJKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getJKeyword_2()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1569:1: rule__Case__Group__3 : rule__Case__Group__3__Impl rule__Case__Group__4 ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1573:1: ( rule__Case__Group__3__Impl rule__Case__Group__4 )
            // InternalTowerDefense.g:1574:2: rule__Case__Group__3__Impl rule__Case__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Case__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__4();

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
    // InternalTowerDefense.g:1581:1: rule__Case__Group__3__Impl : ( ( rule__Case__JAssignment_3 ) ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1585:1: ( ( ( rule__Case__JAssignment_3 ) ) )
            // InternalTowerDefense.g:1586:1: ( ( rule__Case__JAssignment_3 ) )
            {
            // InternalTowerDefense.g:1586:1: ( ( rule__Case__JAssignment_3 ) )
            // InternalTowerDefense.g:1587:2: ( rule__Case__JAssignment_3 )
            {
             before(grammarAccess.getCaseAccess().getJAssignment_3()); 
            // InternalTowerDefense.g:1588:2: ( rule__Case__JAssignment_3 )
            // InternalTowerDefense.g:1588:3: rule__Case__JAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Case__JAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getJAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Case__Group__4"
    // InternalTowerDefense.g:1596:1: rule__Case__Group__4 : rule__Case__Group__4__Impl ;
    public final void rule__Case__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1600:1: ( rule__Case__Group__4__Impl )
            // InternalTowerDefense.g:1601:2: rule__Case__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__4__Impl();

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
    // $ANTLR end "rule__Case__Group__4"


    // $ANTLR start "rule__Case__Group__4__Impl"
    // InternalTowerDefense.g:1607:1: rule__Case__Group__4__Impl : ( ( rule__Case__NatureTerrainAssignment_4 ) ) ;
    public final void rule__Case__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1611:1: ( ( ( rule__Case__NatureTerrainAssignment_4 ) ) )
            // InternalTowerDefense.g:1612:1: ( ( rule__Case__NatureTerrainAssignment_4 ) )
            {
            // InternalTowerDefense.g:1612:1: ( ( rule__Case__NatureTerrainAssignment_4 ) )
            // InternalTowerDefense.g:1613:2: ( rule__Case__NatureTerrainAssignment_4 )
            {
             before(grammarAccess.getCaseAccess().getNatureTerrainAssignment_4()); 
            // InternalTowerDefense.g:1614:2: ( rule__Case__NatureTerrainAssignment_4 )
            // InternalTowerDefense.g:1614:3: rule__Case__NatureTerrainAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Case__NatureTerrainAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getNatureTerrainAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4__Impl"


    // $ANTLR start "rule__Vague__Group__0"
    // InternalTowerDefense.g:1623:1: rule__Vague__Group__0 : rule__Vague__Group__0__Impl rule__Vague__Group__1 ;
    public final void rule__Vague__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1627:1: ( rule__Vague__Group__0__Impl rule__Vague__Group__1 )
            // InternalTowerDefense.g:1628:2: rule__Vague__Group__0__Impl rule__Vague__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTowerDefense.g:1635:1: rule__Vague__Group__0__Impl : ( '{' ) ;
    public final void rule__Vague__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1639:1: ( ( '{' ) )
            // InternalTowerDefense.g:1640:1: ( '{' )
            {
            // InternalTowerDefense.g:1640:1: ( '{' )
            // InternalTowerDefense.g:1641:2: '{'
            {
             before(grammarAccess.getVagueAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1650:1: rule__Vague__Group__1 : rule__Vague__Group__1__Impl rule__Vague__Group__2 ;
    public final void rule__Vague__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1654:1: ( rule__Vague__Group__1__Impl rule__Vague__Group__2 )
            // InternalTowerDefense.g:1655:2: rule__Vague__Group__1__Impl rule__Vague__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalTowerDefense.g:1662:1: rule__Vague__Group__1__Impl : ( 'Mobiles' ) ;
    public final void rule__Vague__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1666:1: ( ( 'Mobiles' ) )
            // InternalTowerDefense.g:1667:1: ( 'Mobiles' )
            {
            // InternalTowerDefense.g:1667:1: ( 'Mobiles' )
            // InternalTowerDefense.g:1668:2: 'Mobiles'
            {
             before(grammarAccess.getVagueAccess().getMobilesKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getMobilesKeyword_1()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1677:1: rule__Vague__Group__2 : rule__Vague__Group__2__Impl rule__Vague__Group__3 ;
    public final void rule__Vague__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1681:1: ( rule__Vague__Group__2__Impl rule__Vague__Group__3 )
            // InternalTowerDefense.g:1682:2: rule__Vague__Group__2__Impl rule__Vague__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalTowerDefense.g:1689:1: rule__Vague__Group__2__Impl : ( ( rule__Vague__MobilesAssignment_2 )* ) ;
    public final void rule__Vague__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1693:1: ( ( ( rule__Vague__MobilesAssignment_2 )* ) )
            // InternalTowerDefense.g:1694:1: ( ( rule__Vague__MobilesAssignment_2 )* )
            {
            // InternalTowerDefense.g:1694:1: ( ( rule__Vague__MobilesAssignment_2 )* )
            // InternalTowerDefense.g:1695:2: ( rule__Vague__MobilesAssignment_2 )*
            {
             before(grammarAccess.getVagueAccess().getMobilesAssignment_2()); 
            // InternalTowerDefense.g:1696:2: ( rule__Vague__MobilesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTowerDefense.g:1696:3: rule__Vague__MobilesAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Vague__MobilesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getVagueAccess().getMobilesAssignment_2()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1704:1: rule__Vague__Group__3 : rule__Vague__Group__3__Impl rule__Vague__Group__4 ;
    public final void rule__Vague__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1708:1: ( rule__Vague__Group__3__Impl rule__Vague__Group__4 )
            // InternalTowerDefense.g:1709:2: rule__Vague__Group__3__Impl rule__Vague__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalTowerDefense.g:1716:1: rule__Vague__Group__3__Impl : ( 'Obstacles' ) ;
    public final void rule__Vague__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1720:1: ( ( 'Obstacles' ) )
            // InternalTowerDefense.g:1721:1: ( 'Obstacles' )
            {
            // InternalTowerDefense.g:1721:1: ( 'Obstacles' )
            // InternalTowerDefense.g:1722:2: 'Obstacles'
            {
             before(grammarAccess.getVagueAccess().getObstaclesKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getObstaclesKeyword_3()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1731:1: rule__Vague__Group__4 : rule__Vague__Group__4__Impl rule__Vague__Group__5 ;
    public final void rule__Vague__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1735:1: ( rule__Vague__Group__4__Impl rule__Vague__Group__5 )
            // InternalTowerDefense.g:1736:2: rule__Vague__Group__4__Impl rule__Vague__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalTowerDefense.g:1743:1: rule__Vague__Group__4__Impl : ( ( rule__Vague__ObstaclesAssignment_4 )* ) ;
    public final void rule__Vague__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1747:1: ( ( ( rule__Vague__ObstaclesAssignment_4 )* ) )
            // InternalTowerDefense.g:1748:1: ( ( rule__Vague__ObstaclesAssignment_4 )* )
            {
            // InternalTowerDefense.g:1748:1: ( ( rule__Vague__ObstaclesAssignment_4 )* )
            // InternalTowerDefense.g:1749:2: ( rule__Vague__ObstaclesAssignment_4 )*
            {
             before(grammarAccess.getVagueAccess().getObstaclesAssignment_4()); 
            // InternalTowerDefense.g:1750:2: ( rule__Vague__ObstaclesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTowerDefense.g:1750:3: rule__Vague__ObstaclesAssignment_4
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Vague__ObstaclesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getVagueAccess().getObstaclesAssignment_4()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1758:1: rule__Vague__Group__5 : rule__Vague__Group__5__Impl rule__Vague__Group__6 ;
    public final void rule__Vague__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1762:1: ( rule__Vague__Group__5__Impl rule__Vague__Group__6 )
            // InternalTowerDefense.g:1763:2: rule__Vague__Group__5__Impl rule__Vague__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalTowerDefense.g:1770:1: rule__Vague__Group__5__Impl : ( 'Gain' ) ;
    public final void rule__Vague__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1774:1: ( ( 'Gain' ) )
            // InternalTowerDefense.g:1775:1: ( 'Gain' )
            {
            // InternalTowerDefense.g:1775:1: ( 'Gain' )
            // InternalTowerDefense.g:1776:2: 'Gain'
            {
             before(grammarAccess.getVagueAccess().getGainKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getGainKeyword_5()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1785:1: rule__Vague__Group__6 : rule__Vague__Group__6__Impl rule__Vague__Group__7 ;
    public final void rule__Vague__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1789:1: ( rule__Vague__Group__6__Impl rule__Vague__Group__7 )
            // InternalTowerDefense.g:1790:2: rule__Vague__Group__6__Impl rule__Vague__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalTowerDefense.g:1797:1: rule__Vague__Group__6__Impl : ( ( rule__Vague__GainVictoireAssignment_6 ) ) ;
    public final void rule__Vague__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1801:1: ( ( ( rule__Vague__GainVictoireAssignment_6 ) ) )
            // InternalTowerDefense.g:1802:1: ( ( rule__Vague__GainVictoireAssignment_6 ) )
            {
            // InternalTowerDefense.g:1802:1: ( ( rule__Vague__GainVictoireAssignment_6 ) )
            // InternalTowerDefense.g:1803:2: ( rule__Vague__GainVictoireAssignment_6 )
            {
             before(grammarAccess.getVagueAccess().getGainVictoireAssignment_6()); 
            // InternalTowerDefense.g:1804:2: ( rule__Vague__GainVictoireAssignment_6 )
            // InternalTowerDefense.g:1804:3: rule__Vague__GainVictoireAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Vague__GainVictoireAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVagueAccess().getGainVictoireAssignment_6()); 

            }


            }

        }
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
    // InternalTowerDefense.g:1812:1: rule__Vague__Group__7 : rule__Vague__Group__7__Impl ;
    public final void rule__Vague__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1816:1: ( rule__Vague__Group__7__Impl )
            // InternalTowerDefense.g:1817:2: rule__Vague__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vague__Group__7__Impl();

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
    // InternalTowerDefense.g:1823:1: rule__Vague__Group__7__Impl : ( '}' ) ;
    public final void rule__Vague__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1827:1: ( ( '}' ) )
            // InternalTowerDefense.g:1828:1: ( '}' )
            {
            // InternalTowerDefense.g:1828:1: ( '}' )
            // InternalTowerDefense.g:1829:2: '}'
            {
             before(grammarAccess.getVagueAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalTowerDefense.g:1839:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1843:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:1844:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:1844:2: ( RULE_ID )
            // InternalTowerDefense.g:1845:3: RULE_ID
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
    // InternalTowerDefense.g:1854:1: rule__Jeu__PartiesAssignment_3 : ( rulePartie ) ;
    public final void rule__Jeu__PartiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1858:1: ( ( rulePartie ) )
            // InternalTowerDefense.g:1859:2: ( rulePartie )
            {
            // InternalTowerDefense.g:1859:2: ( rulePartie )
            // InternalTowerDefense.g:1860:3: rulePartie
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
    // InternalTowerDefense.g:1869:1: rule__Partie__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Partie__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1873:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:1874:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:1874:2: ( RULE_ID )
            // InternalTowerDefense.g:1875:3: RULE_ID
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


    // $ANTLR start "rule__Partie__PartiesElementsAssignment_3"
    // InternalTowerDefense.g:1884:1: rule__Partie__PartiesElementsAssignment_3 : ( rulePartieElement ) ;
    public final void rule__Partie__PartiesElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1888:1: ( ( rulePartieElement ) )
            // InternalTowerDefense.g:1889:2: ( rulePartieElement )
            {
            // InternalTowerDefense.g:1889:2: ( rulePartieElement )
            // InternalTowerDefense.g:1890:3: rulePartieElement
            {
             before(grammarAccess.getPartieAccess().getPartiesElementsPartieElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePartieElement();

            state._fsp--;

             after(grammarAccess.getPartieAccess().getPartiesElementsPartieElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partie__PartiesElementsAssignment_3"


    // $ANTLR start "rule__Partie__NiveauxAssignment_4"
    // InternalTowerDefense.g:1899:1: rule__Partie__NiveauxAssignment_4 : ( ruleNiveau ) ;
    public final void rule__Partie__NiveauxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1903:1: ( ( ruleNiveau ) )
            // InternalTowerDefense.g:1904:2: ( ruleNiveau )
            {
            // InternalTowerDefense.g:1904:2: ( ruleNiveau )
            // InternalTowerDefense.g:1905:3: ruleNiveau
            {
             before(grammarAccess.getPartieAccess().getNiveauxNiveauParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNiveau();

            state._fsp--;

             after(grammarAccess.getPartieAccess().getNiveauxNiveauParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partie__NiveauxAssignment_4"


    // $ANTLR start "rule__PartieElement__ObstacleAssignment_0"
    // InternalTowerDefense.g:1914:1: rule__PartieElement__ObstacleAssignment_0 : ( ( 'Obstacle' ) ) ;
    public final void rule__PartieElement__ObstacleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1918:1: ( ( ( 'Obstacle' ) ) )
            // InternalTowerDefense.g:1919:2: ( ( 'Obstacle' ) )
            {
            // InternalTowerDefense.g:1919:2: ( ( 'Obstacle' ) )
            // InternalTowerDefense.g:1920:3: ( 'Obstacle' )
            {
             before(grammarAccess.getPartieElementAccess().getObstacleObstacleKeyword_0_0()); 
            // InternalTowerDefense.g:1921:3: ( 'Obstacle' )
            // InternalTowerDefense.g:1922:4: 'Obstacle'
            {
             before(grammarAccess.getPartieElementAccess().getObstacleObstacleKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPartieElementAccess().getObstacleObstacleKeyword_0_0()); 

            }

             after(grammarAccess.getPartieElementAccess().getObstacleObstacleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieElement__ObstacleAssignment_0"


    // $ANTLR start "rule__PartieElement__MobileAssignment_1"
    // InternalTowerDefense.g:1933:1: rule__PartieElement__MobileAssignment_1 : ( ( 'Mobile' ) ) ;
    public final void rule__PartieElement__MobileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1937:1: ( ( ( 'Mobile' ) ) )
            // InternalTowerDefense.g:1938:2: ( ( 'Mobile' ) )
            {
            // InternalTowerDefense.g:1938:2: ( ( 'Mobile' ) )
            // InternalTowerDefense.g:1939:3: ( 'Mobile' )
            {
             before(grammarAccess.getPartieElementAccess().getMobileMobileKeyword_1_0()); 
            // InternalTowerDefense.g:1940:3: ( 'Mobile' )
            // InternalTowerDefense.g:1941:4: 'Mobile'
            {
             before(grammarAccess.getPartieElementAccess().getMobileMobileKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPartieElementAccess().getMobileMobileKeyword_1_0()); 

            }

             after(grammarAccess.getPartieElementAccess().getMobileMobileKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieElement__MobileAssignment_1"


    // $ANTLR start "rule__PartieElement__ProjectileAssignment_2"
    // InternalTowerDefense.g:1952:1: rule__PartieElement__ProjectileAssignment_2 : ( ( 'Projectile' ) ) ;
    public final void rule__PartieElement__ProjectileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1956:1: ( ( ( 'Projectile' ) ) )
            // InternalTowerDefense.g:1957:2: ( ( 'Projectile' ) )
            {
            // InternalTowerDefense.g:1957:2: ( ( 'Projectile' ) )
            // InternalTowerDefense.g:1958:3: ( 'Projectile' )
            {
             before(grammarAccess.getPartieElementAccess().getProjectileProjectileKeyword_2_0()); 
            // InternalTowerDefense.g:1959:3: ( 'Projectile' )
            // InternalTowerDefense.g:1960:4: 'Projectile'
            {
             before(grammarAccess.getPartieElementAccess().getProjectileProjectileKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPartieElementAccess().getProjectileProjectileKeyword_2_0()); 

            }

             after(grammarAccess.getPartieElementAccess().getProjectileProjectileKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieElement__ProjectileAssignment_2"


    // $ANTLR start "rule__PartieElement__NatureAssignment_3"
    // InternalTowerDefense.g:1971:1: rule__PartieElement__NatureAssignment_3 : ( ( 'Nature' ) ) ;
    public final void rule__PartieElement__NatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1975:1: ( ( ( 'Nature' ) ) )
            // InternalTowerDefense.g:1976:2: ( ( 'Nature' ) )
            {
            // InternalTowerDefense.g:1976:2: ( ( 'Nature' ) )
            // InternalTowerDefense.g:1977:3: ( 'Nature' )
            {
             before(grammarAccess.getPartieElementAccess().getNatureNatureKeyword_3_0()); 
            // InternalTowerDefense.g:1978:3: ( 'Nature' )
            // InternalTowerDefense.g:1979:4: 'Nature'
            {
             before(grammarAccess.getPartieElementAccess().getNatureNatureKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPartieElementAccess().getNatureNatureKeyword_3_0()); 

            }

             after(grammarAccess.getPartieElementAccess().getNatureNatureKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieElement__NatureAssignment_3"


    // $ANTLR start "rule__Tactique__ProcheAssignment_0_1"
    // InternalTowerDefense.g:1990:1: rule__Tactique__ProcheAssignment_0_1 : ( ( 'procheFirst' ) ) ;
    public final void rule__Tactique__ProcheAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:1994:1: ( ( ( 'procheFirst' ) ) )
            // InternalTowerDefense.g:1995:2: ( ( 'procheFirst' ) )
            {
            // InternalTowerDefense.g:1995:2: ( ( 'procheFirst' ) )
            // InternalTowerDefense.g:1996:3: ( 'procheFirst' )
            {
             before(grammarAccess.getTactiqueAccess().getProcheProcheFirstKeyword_0_1_0()); 
            // InternalTowerDefense.g:1997:3: ( 'procheFirst' )
            // InternalTowerDefense.g:1998:4: 'procheFirst'
            {
             before(grammarAccess.getTactiqueAccess().getProcheProcheFirstKeyword_0_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTactiqueAccess().getProcheProcheFirstKeyword_0_1_0()); 

            }

             after(grammarAccess.getTactiqueAccess().getProcheProcheFirstKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tactique__ProcheAssignment_0_1"


    // $ANTLR start "rule__Tactique__FaibleAssignment_1"
    // InternalTowerDefense.g:2009:1: rule__Tactique__FaibleAssignment_1 : ( ( 'faibleFirst' ) ) ;
    public final void rule__Tactique__FaibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2013:1: ( ( ( 'faibleFirst' ) ) )
            // InternalTowerDefense.g:2014:2: ( ( 'faibleFirst' ) )
            {
            // InternalTowerDefense.g:2014:2: ( ( 'faibleFirst' ) )
            // InternalTowerDefense.g:2015:3: ( 'faibleFirst' )
            {
             before(grammarAccess.getTactiqueAccess().getFaibleFaibleFirstKeyword_1_0()); 
            // InternalTowerDefense.g:2016:3: ( 'faibleFirst' )
            // InternalTowerDefense.g:2017:4: 'faibleFirst'
            {
             before(grammarAccess.getTactiqueAccess().getFaibleFaibleFirstKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTactiqueAccess().getFaibleFaibleFirstKeyword_1_0()); 

            }

             after(grammarAccess.getTactiqueAccess().getFaibleFaibleFirstKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tactique__FaibleAssignment_1"


    // $ANTLR start "rule__Tactique__FortAssignment_2"
    // InternalTowerDefense.g:2028:1: rule__Tactique__FortAssignment_2 : ( ( 'fortFirst' ) ) ;
    public final void rule__Tactique__FortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2032:1: ( ( ( 'fortFirst' ) ) )
            // InternalTowerDefense.g:2033:2: ( ( 'fortFirst' ) )
            {
            // InternalTowerDefense.g:2033:2: ( ( 'fortFirst' ) )
            // InternalTowerDefense.g:2034:3: ( 'fortFirst' )
            {
             before(grammarAccess.getTactiqueAccess().getFortFortFirstKeyword_2_0()); 
            // InternalTowerDefense.g:2035:3: ( 'fortFirst' )
            // InternalTowerDefense.g:2036:4: 'fortFirst'
            {
             before(grammarAccess.getTactiqueAccess().getFortFortFirstKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTactiqueAccess().getFortFortFirstKeyword_2_0()); 

            }

             after(grammarAccess.getTactiqueAccess().getFortFortFirstKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tactique__FortAssignment_2"


    // $ANTLR start "rule__NatureTerrain__NameAssignment_0"
    // InternalTowerDefense.g:2047:1: rule__NatureTerrain__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NatureTerrain__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2051:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:2052:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:2052:2: ( RULE_ID )
            // InternalTowerDefense.g:2053:3: RULE_ID
            {
             before(grammarAccess.getNatureTerrainAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NatureTerrain__NameAssignment_0"


    // $ANTLR start "rule__NatureTerrain__VolumeAssignment_3"
    // InternalTowerDefense.g:2062:1: rule__NatureTerrain__VolumeAssignment_3 : ( RULE_INT ) ;
    public final void rule__NatureTerrain__VolumeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2066:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:2067:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:2067:2: ( RULE_INT )
            // InternalTowerDefense.g:2068:3: RULE_INT
            {
             before(grammarAccess.getNatureTerrainAccess().getVolumeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getVolumeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NatureTerrain__VolumeAssignment_3"


    // $ANTLR start "rule__NatureTerrain__TypeAssignment_5"
    // InternalTowerDefense.g:2077:1: rule__NatureTerrain__TypeAssignment_5 : ( ruleTYPE_TERRAIN ) ;
    public final void rule__NatureTerrain__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2081:1: ( ( ruleTYPE_TERRAIN ) )
            // InternalTowerDefense.g:2082:2: ( ruleTYPE_TERRAIN )
            {
            // InternalTowerDefense.g:2082:2: ( ruleTYPE_TERRAIN )
            // InternalTowerDefense.g:2083:3: ruleTYPE_TERRAIN
            {
             before(grammarAccess.getNatureTerrainAccess().getTypeTYPE_TERRAINEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_TERRAIN();

            state._fsp--;

             after(grammarAccess.getNatureTerrainAccess().getTypeTYPE_TERRAINEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NatureTerrain__TypeAssignment_5"


    // $ANTLR start "rule__NatureTerrain__FatigueAssignment_7"
    // InternalTowerDefense.g:2092:1: rule__NatureTerrain__FatigueAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__NatureTerrain__FatigueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2096:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:2097:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:2097:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:2098:3: ( RULE_ID )
            {
             before(grammarAccess.getNatureTerrainAccess().getFatigueEnergieCrossReference_7_0()); 
            // InternalTowerDefense.g:2099:3: ( RULE_ID )
            // InternalTowerDefense.g:2100:4: RULE_ID
            {
             before(grammarAccess.getNatureTerrainAccess().getFatigueEnergieIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNatureTerrainAccess().getFatigueEnergieIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getNatureTerrainAccess().getFatigueEnergieCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NatureTerrain__FatigueAssignment_7"


    // $ANTLR start "rule__Niveau__NameAssignment_1"
    // InternalTowerDefense.g:2111:1: rule__Niveau__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Niveau__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2115:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:2116:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:2116:2: ( RULE_ID )
            // InternalTowerDefense.g:2117:3: RULE_ID
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


    // $ANTLR start "rule__Niveau__DifficulteAssignment_4"
    // InternalTowerDefense.g:2126:1: rule__Niveau__DifficulteAssignment_4 : ( ruleDifficulte ) ;
    public final void rule__Niveau__DifficulteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2130:1: ( ( ruleDifficulte ) )
            // InternalTowerDefense.g:2131:2: ( ruleDifficulte )
            {
            // InternalTowerDefense.g:2131:2: ( ruleDifficulte )
            // InternalTowerDefense.g:2132:3: ruleDifficulte
            {
             before(grammarAccess.getNiveauAccess().getDifficulteDifficulteEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDifficulte();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getDifficulteDifficulteEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__DifficulteAssignment_4"


    // $ANTLR start "rule__Niveau__DureePauseAssignment_6"
    // InternalTowerDefense.g:2141:1: rule__Niveau__DureePauseAssignment_6 : ( RULE_INT ) ;
    public final void rule__Niveau__DureePauseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2145:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:2146:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:2146:2: ( RULE_INT )
            // InternalTowerDefense.g:2147:3: RULE_INT
            {
             before(grammarAccess.getNiveauAccess().getDureePauseINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getDureePauseINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__DureePauseAssignment_6"


    // $ANTLR start "rule__Niveau__ArgentAssignment_8"
    // InternalTowerDefense.g:2156:1: rule__Niveau__ArgentAssignment_8 : ( RULE_INT ) ;
    public final void rule__Niveau__ArgentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2160:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:2161:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:2161:2: ( RULE_INT )
            // InternalTowerDefense.g:2162:3: RULE_INT
            {
             before(grammarAccess.getNiveauAccess().getArgentINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getArgentINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__ArgentAssignment_8"


    // $ANTLR start "rule__Niveau__MobSortisLimiteAssignment_10"
    // InternalTowerDefense.g:2171:1: rule__Niveau__MobSortisLimiteAssignment_10 : ( RULE_INT ) ;
    public final void rule__Niveau__MobSortisLimiteAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2175:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:2176:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:2176:2: ( RULE_INT )
            // InternalTowerDefense.g:2177:3: RULE_INT
            {
             before(grammarAccess.getNiveauAccess().getMobSortisLimiteINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getMobSortisLimiteINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__MobSortisLimiteAssignment_10"


    // $ANTLR start "rule__Niveau__TerrainAssignment_11"
    // InternalTowerDefense.g:2186:1: rule__Niveau__TerrainAssignment_11 : ( ruleTerrainDeJeu ) ;
    public final void rule__Niveau__TerrainAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2190:1: ( ( ruleTerrainDeJeu ) )
            // InternalTowerDefense.g:2191:2: ( ruleTerrainDeJeu )
            {
            // InternalTowerDefense.g:2191:2: ( ruleTerrainDeJeu )
            // InternalTowerDefense.g:2192:3: ruleTerrainDeJeu
            {
             before(grammarAccess.getNiveauAccess().getTerrainTerrainDeJeuParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleTerrainDeJeu();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getTerrainTerrainDeJeuParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__TerrainAssignment_11"


    // $ANTLR start "rule__Niveau__VaguesAssignment_13"
    // InternalTowerDefense.g:2201:1: rule__Niveau__VaguesAssignment_13 : ( ruleVague ) ;
    public final void rule__Niveau__VaguesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2205:1: ( ( ruleVague ) )
            // InternalTowerDefense.g:2206:2: ( ruleVague )
            {
            // InternalTowerDefense.g:2206:2: ( ruleVague )
            // InternalTowerDefense.g:2207:3: ruleVague
            {
             before(grammarAccess.getNiveauAccess().getVaguesVagueParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleVague();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getVaguesVagueParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__VaguesAssignment_13"


    // $ANTLR start "rule__TerrainDeJeu__DamierAssignment_1"
    // InternalTowerDefense.g:2216:1: rule__TerrainDeJeu__DamierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerrainDeJeu__DamierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2220:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:2221:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:2221:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:2222:3: ( RULE_ID )
            {
             before(grammarAccess.getTerrainDeJeuAccess().getDamierDamierCrossReference_1_0()); 
            // InternalTowerDefense.g:2223:3: ( RULE_ID )
            // InternalTowerDefense.g:2224:4: RULE_ID
            {
             before(grammarAccess.getTerrainDeJeuAccess().getDamierDamierIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerrainDeJeuAccess().getDamierDamierIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTerrainDeJeuAccess().getDamierDamierCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerrainDeJeu__DamierAssignment_1"


    // $ANTLR start "rule__Case__IAssignment_1"
    // InternalTowerDefense.g:2235:1: rule__Case__IAssignment_1 : ( RULE_INT ) ;
    public final void rule__Case__IAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2239:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:2240:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:2240:2: ( RULE_INT )
            // InternalTowerDefense.g:2241:3: RULE_INT
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


    // $ANTLR start "rule__Case__JAssignment_3"
    // InternalTowerDefense.g:2250:1: rule__Case__JAssignment_3 : ( RULE_INT ) ;
    public final void rule__Case__JAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2254:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:2255:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:2255:2: ( RULE_INT )
            // InternalTowerDefense.g:2256:3: RULE_INT
            {
             before(grammarAccess.getCaseAccess().getJINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getJINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__JAssignment_3"


    // $ANTLR start "rule__Case__NatureTerrainAssignment_4"
    // InternalTowerDefense.g:2265:1: rule__Case__NatureTerrainAssignment_4 : ( ruleNatureTerrain ) ;
    public final void rule__Case__NatureTerrainAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2269:1: ( ( ruleNatureTerrain ) )
            // InternalTowerDefense.g:2270:2: ( ruleNatureTerrain )
            {
            // InternalTowerDefense.g:2270:2: ( ruleNatureTerrain )
            // InternalTowerDefense.g:2271:3: ruleNatureTerrain
            {
             before(grammarAccess.getCaseAccess().getNatureTerrainNatureTerrainParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNatureTerrain();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getNatureTerrainNatureTerrainParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__NatureTerrainAssignment_4"


    // $ANTLR start "rule__Vague__MobilesAssignment_2"
    // InternalTowerDefense.g:2280:1: rule__Vague__MobilesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Vague__MobilesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2284:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:2285:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:2285:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:2286:3: ( RULE_ID )
            {
             before(grammarAccess.getVagueAccess().getMobilesMobileCrossReference_2_0()); 
            // InternalTowerDefense.g:2287:3: ( RULE_ID )
            // InternalTowerDefense.g:2288:4: RULE_ID
            {
             before(grammarAccess.getVagueAccess().getMobilesMobileIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getMobilesMobileIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getVagueAccess().getMobilesMobileCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vague__MobilesAssignment_2"


    // $ANTLR start "rule__Vague__ObstaclesAssignment_4"
    // InternalTowerDefense.g:2299:1: rule__Vague__ObstaclesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Vague__ObstaclesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2303:1: ( ( ( RULE_ID ) ) )
            // InternalTowerDefense.g:2304:2: ( ( RULE_ID ) )
            {
            // InternalTowerDefense.g:2304:2: ( ( RULE_ID ) )
            // InternalTowerDefense.g:2305:3: ( RULE_ID )
            {
             before(grammarAccess.getVagueAccess().getObstaclesObstacleCrossReference_4_0()); 
            // InternalTowerDefense.g:2306:3: ( RULE_ID )
            // InternalTowerDefense.g:2307:4: RULE_ID
            {
             before(grammarAccess.getVagueAccess().getObstaclesObstacleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getObstaclesObstacleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getVagueAccess().getObstaclesObstacleCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vague__ObstaclesAssignment_4"


    // $ANTLR start "rule__Vague__GainVictoireAssignment_6"
    // InternalTowerDefense.g:2318:1: rule__Vague__GainVictoireAssignment_6 : ( RULE_INT ) ;
    public final void rule__Vague__GainVictoireAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:2322:1: ( ( RULE_INT ) )
            // InternalTowerDefense.g:2323:2: ( RULE_INT )
            {
            // InternalTowerDefense.g:2323:2: ( RULE_INT )
            // InternalTowerDefense.g:2324:3: RULE_INT
            {
             before(grammarAccess.getVagueAccess().getGainVictoireINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVagueAccess().getGainVictoireINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vague__GainVictoireAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000078008200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000010L});

}