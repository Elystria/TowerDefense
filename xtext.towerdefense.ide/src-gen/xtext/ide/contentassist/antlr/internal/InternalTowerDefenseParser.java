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


    // $ANTLR start "entryRulePartieRule"
    // InternalTowerDefense.g:78:1: entryRulePartieRule : rulePartieRule EOF ;
    public final void entryRulePartieRule() throws RecognitionException {
        try {
            // InternalTowerDefense.g:79:1: ( rulePartieRule EOF )
            // InternalTowerDefense.g:80:1: rulePartieRule EOF
            {
             before(grammarAccess.getPartieRuleRule()); 
            pushFollow(FOLLOW_1);
            rulePartieRule();

            state._fsp--;

             after(grammarAccess.getPartieRuleRule()); 
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
    // $ANTLR end "entryRulePartieRule"


    // $ANTLR start "rulePartieRule"
    // InternalTowerDefense.g:87:1: rulePartieRule : ( ( rule__PartieRule__Group__0 ) ) ;
    public final void rulePartieRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:91:2: ( ( ( rule__PartieRule__Group__0 ) ) )
            // InternalTowerDefense.g:92:2: ( ( rule__PartieRule__Group__0 ) )
            {
            // InternalTowerDefense.g:92:2: ( ( rule__PartieRule__Group__0 ) )
            // InternalTowerDefense.g:93:3: ( rule__PartieRule__Group__0 )
            {
             before(grammarAccess.getPartieRuleAccess().getGroup()); 
            // InternalTowerDefense.g:94:3: ( rule__PartieRule__Group__0 )
            // InternalTowerDefense.g:94:4: rule__PartieRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartieRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartieRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartieRule"


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
    // InternalTowerDefense.g:112:1: rulePartieElement : ( ( rule__PartieElement__Group__0 ) ) ;
    public final void rulePartieElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:116:2: ( ( ( rule__PartieElement__Group__0 ) ) )
            // InternalTowerDefense.g:117:2: ( ( rule__PartieElement__Group__0 ) )
            {
            // InternalTowerDefense.g:117:2: ( ( rule__PartieElement__Group__0 ) )
            // InternalTowerDefense.g:118:3: ( rule__PartieElement__Group__0 )
            {
             before(grammarAccess.getPartieElementAccess().getGroup()); 
            // InternalTowerDefense.g:119:3: ( rule__PartieElement__Group__0 )
            // InternalTowerDefense.g:119:4: rule__PartieElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartieElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartieElementAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNiveau"
    // InternalTowerDefense.g:128:1: entryRuleNiveau : ruleNiveau EOF ;
    public final void entryRuleNiveau() throws RecognitionException {
        try {
            // InternalTowerDefense.g:129:1: ( ruleNiveau EOF )
            // InternalTowerDefense.g:130:1: ruleNiveau EOF
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
    // InternalTowerDefense.g:137:1: ruleNiveau : ( ( rule__Niveau__Group__0 ) ) ;
    public final void ruleNiveau() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:141:2: ( ( ( rule__Niveau__Group__0 ) ) )
            // InternalTowerDefense.g:142:2: ( ( rule__Niveau__Group__0 ) )
            {
            // InternalTowerDefense.g:142:2: ( ( rule__Niveau__Group__0 ) )
            // InternalTowerDefense.g:143:3: ( rule__Niveau__Group__0 )
            {
             before(grammarAccess.getNiveauAccess().getGroup()); 
            // InternalTowerDefense.g:144:3: ( rule__Niveau__Group__0 )
            // InternalTowerDefense.g:144:4: rule__Niveau__Group__0
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


    // $ANTLR start "rule__Jeu__Group__0"
    // InternalTowerDefense.g:152:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:156:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalTowerDefense.g:157:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
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
    // InternalTowerDefense.g:164:1: rule__Jeu__Group__0__Impl : ( 'Jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:168:1: ( ( 'Jeu' ) )
            // InternalTowerDefense.g:169:1: ( 'Jeu' )
            {
            // InternalTowerDefense.g:169:1: ( 'Jeu' )
            // InternalTowerDefense.g:170:2: 'Jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalTowerDefense.g:179:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:183:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalTowerDefense.g:184:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
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
    // InternalTowerDefense.g:191:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:195:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:196:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:196:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalTowerDefense.g:197:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:198:2: ( rule__Jeu__NameAssignment_1 )
            // InternalTowerDefense.g:198:3: rule__Jeu__NameAssignment_1
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
    // InternalTowerDefense.g:206:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:210:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalTowerDefense.g:211:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
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
    // InternalTowerDefense.g:218:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:222:1: ( ( '{' ) )
            // InternalTowerDefense.g:223:1: ( '{' )
            {
            // InternalTowerDefense.g:223:1: ( '{' )
            // InternalTowerDefense.g:224:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTowerDefense.g:233:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:237:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalTowerDefense.g:238:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
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
    // InternalTowerDefense.g:245:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__PartiesAssignment_3 )* ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:249:1: ( ( ( rule__Jeu__PartiesAssignment_3 )* ) )
            // InternalTowerDefense.g:250:1: ( ( rule__Jeu__PartiesAssignment_3 )* )
            {
            // InternalTowerDefense.g:250:1: ( ( rule__Jeu__PartiesAssignment_3 )* )
            // InternalTowerDefense.g:251:2: ( rule__Jeu__PartiesAssignment_3 )*
            {
             before(grammarAccess.getJeuAccess().getPartiesAssignment_3()); 
            // InternalTowerDefense.g:252:2: ( rule__Jeu__PartiesAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTowerDefense.g:252:3: rule__Jeu__PartiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Jeu__PartiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalTowerDefense.g:260:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:264:1: ( rule__Jeu__Group__4__Impl )
            // InternalTowerDefense.g:265:2: rule__Jeu__Group__4__Impl
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
    // InternalTowerDefense.g:271:1: rule__Jeu__Group__4__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:275:1: ( ( '}' ) )
            // InternalTowerDefense.g:276:1: ( '}' )
            {
            // InternalTowerDefense.g:276:1: ( '}' )
            // InternalTowerDefense.g:277:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__PartieRule__Group__0"
    // InternalTowerDefense.g:287:1: rule__PartieRule__Group__0 : rule__PartieRule__Group__0__Impl rule__PartieRule__Group__1 ;
    public final void rule__PartieRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:291:1: ( rule__PartieRule__Group__0__Impl rule__PartieRule__Group__1 )
            // InternalTowerDefense.g:292:2: rule__PartieRule__Group__0__Impl rule__PartieRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PartieRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartieRule__Group__1();

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
    // $ANTLR end "rule__PartieRule__Group__0"


    // $ANTLR start "rule__PartieRule__Group__0__Impl"
    // InternalTowerDefense.g:299:1: rule__PartieRule__Group__0__Impl : ( 'Partie' ) ;
    public final void rule__PartieRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:303:1: ( ( 'Partie' ) )
            // InternalTowerDefense.g:304:1: ( 'Partie' )
            {
            // InternalTowerDefense.g:304:1: ( 'Partie' )
            // InternalTowerDefense.g:305:2: 'Partie'
            {
             before(grammarAccess.getPartieRuleAccess().getPartieKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPartieRuleAccess().getPartieKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__Group__0__Impl"


    // $ANTLR start "rule__PartieRule__Group__1"
    // InternalTowerDefense.g:314:1: rule__PartieRule__Group__1 : rule__PartieRule__Group__1__Impl rule__PartieRule__Group__2 ;
    public final void rule__PartieRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:318:1: ( rule__PartieRule__Group__1__Impl rule__PartieRule__Group__2 )
            // InternalTowerDefense.g:319:2: rule__PartieRule__Group__1__Impl rule__PartieRule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PartieRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartieRule__Group__2();

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
    // $ANTLR end "rule__PartieRule__Group__1"


    // $ANTLR start "rule__PartieRule__Group__1__Impl"
    // InternalTowerDefense.g:326:1: rule__PartieRule__Group__1__Impl : ( ( rule__PartieRule__NameAssignment_1 ) ) ;
    public final void rule__PartieRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:330:1: ( ( ( rule__PartieRule__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:331:1: ( ( rule__PartieRule__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:331:1: ( ( rule__PartieRule__NameAssignment_1 ) )
            // InternalTowerDefense.g:332:2: ( rule__PartieRule__NameAssignment_1 )
            {
             before(grammarAccess.getPartieRuleAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:333:2: ( rule__PartieRule__NameAssignment_1 )
            // InternalTowerDefense.g:333:3: rule__PartieRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PartieRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartieRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__Group__1__Impl"


    // $ANTLR start "rule__PartieRule__Group__2"
    // InternalTowerDefense.g:341:1: rule__PartieRule__Group__2 : rule__PartieRule__Group__2__Impl rule__PartieRule__Group__3 ;
    public final void rule__PartieRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:345:1: ( rule__PartieRule__Group__2__Impl rule__PartieRule__Group__3 )
            // InternalTowerDefense.g:346:2: rule__PartieRule__Group__2__Impl rule__PartieRule__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__PartieRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartieRule__Group__3();

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
    // $ANTLR end "rule__PartieRule__Group__2"


    // $ANTLR start "rule__PartieRule__Group__2__Impl"
    // InternalTowerDefense.g:353:1: rule__PartieRule__Group__2__Impl : ( '{' ) ;
    public final void rule__PartieRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:357:1: ( ( '{' ) )
            // InternalTowerDefense.g:358:1: ( '{' )
            {
            // InternalTowerDefense.g:358:1: ( '{' )
            // InternalTowerDefense.g:359:2: '{'
            {
             before(grammarAccess.getPartieRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPartieRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__Group__2__Impl"


    // $ANTLR start "rule__PartieRule__Group__3"
    // InternalTowerDefense.g:368:1: rule__PartieRule__Group__3 : rule__PartieRule__Group__3__Impl rule__PartieRule__Group__4 ;
    public final void rule__PartieRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:372:1: ( rule__PartieRule__Group__3__Impl rule__PartieRule__Group__4 )
            // InternalTowerDefense.g:373:2: rule__PartieRule__Group__3__Impl rule__PartieRule__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PartieRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartieRule__Group__4();

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
    // $ANTLR end "rule__PartieRule__Group__3"


    // $ANTLR start "rule__PartieRule__Group__3__Impl"
    // InternalTowerDefense.g:380:1: rule__PartieRule__Group__3__Impl : ( ( rule__PartieRule__PartiesElementsAssignment_3 )* ) ;
    public final void rule__PartieRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:384:1: ( ( ( rule__PartieRule__PartiesElementsAssignment_3 )* ) )
            // InternalTowerDefense.g:385:1: ( ( rule__PartieRule__PartiesElementsAssignment_3 )* )
            {
            // InternalTowerDefense.g:385:1: ( ( rule__PartieRule__PartiesElementsAssignment_3 )* )
            // InternalTowerDefense.g:386:2: ( rule__PartieRule__PartiesElementsAssignment_3 )*
            {
             before(grammarAccess.getPartieRuleAccess().getPartiesElementsAssignment_3()); 
            // InternalTowerDefense.g:387:2: ( rule__PartieRule__PartiesElementsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTowerDefense.g:387:3: rule__PartieRule__PartiesElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PartieRule__PartiesElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPartieRuleAccess().getPartiesElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__Group__3__Impl"


    // $ANTLR start "rule__PartieRule__Group__4"
    // InternalTowerDefense.g:395:1: rule__PartieRule__Group__4 : rule__PartieRule__Group__4__Impl rule__PartieRule__Group__5 ;
    public final void rule__PartieRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:399:1: ( rule__PartieRule__Group__4__Impl rule__PartieRule__Group__5 )
            // InternalTowerDefense.g:400:2: rule__PartieRule__Group__4__Impl rule__PartieRule__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__PartieRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartieRule__Group__5();

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
    // $ANTLR end "rule__PartieRule__Group__4"


    // $ANTLR start "rule__PartieRule__Group__4__Impl"
    // InternalTowerDefense.g:407:1: rule__PartieRule__Group__4__Impl : ( ( rule__PartieRule__NiveauxAssignment_4 )* ) ;
    public final void rule__PartieRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:411:1: ( ( ( rule__PartieRule__NiveauxAssignment_4 )* ) )
            // InternalTowerDefense.g:412:1: ( ( rule__PartieRule__NiveauxAssignment_4 )* )
            {
            // InternalTowerDefense.g:412:1: ( ( rule__PartieRule__NiveauxAssignment_4 )* )
            // InternalTowerDefense.g:413:2: ( rule__PartieRule__NiveauxAssignment_4 )*
            {
             before(grammarAccess.getPartieRuleAccess().getNiveauxAssignment_4()); 
            // InternalTowerDefense.g:414:2: ( rule__PartieRule__NiveauxAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTowerDefense.g:414:3: rule__PartieRule__NiveauxAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PartieRule__NiveauxAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPartieRuleAccess().getNiveauxAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__Group__4__Impl"


    // $ANTLR start "rule__PartieRule__Group__5"
    // InternalTowerDefense.g:422:1: rule__PartieRule__Group__5 : rule__PartieRule__Group__5__Impl ;
    public final void rule__PartieRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:426:1: ( rule__PartieRule__Group__5__Impl )
            // InternalTowerDefense.g:427:2: rule__PartieRule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartieRule__Group__5__Impl();

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
    // $ANTLR end "rule__PartieRule__Group__5"


    // $ANTLR start "rule__PartieRule__Group__5__Impl"
    // InternalTowerDefense.g:433:1: rule__PartieRule__Group__5__Impl : ( '}' ) ;
    public final void rule__PartieRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:437:1: ( ( '}' ) )
            // InternalTowerDefense.g:438:1: ( '}' )
            {
            // InternalTowerDefense.g:438:1: ( '}' )
            // InternalTowerDefense.g:439:2: '}'
            {
             before(grammarAccess.getPartieRuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPartieRuleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__Group__5__Impl"


    // $ANTLR start "rule__PartieElement__Group__0"
    // InternalTowerDefense.g:449:1: rule__PartieElement__Group__0 : rule__PartieElement__Group__0__Impl rule__PartieElement__Group__1 ;
    public final void rule__PartieElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:453:1: ( rule__PartieElement__Group__0__Impl rule__PartieElement__Group__1 )
            // InternalTowerDefense.g:454:2: rule__PartieElement__Group__0__Impl rule__PartieElement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PartieElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartieElement__Group__1();

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
    // $ANTLR end "rule__PartieElement__Group__0"


    // $ANTLR start "rule__PartieElement__Group__0__Impl"
    // InternalTowerDefense.g:461:1: rule__PartieElement__Group__0__Impl : ( 'PartieElement' ) ;
    public final void rule__PartieElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:465:1: ( ( 'PartieElement' ) )
            // InternalTowerDefense.g:466:1: ( 'PartieElement' )
            {
            // InternalTowerDefense.g:466:1: ( 'PartieElement' )
            // InternalTowerDefense.g:467:2: 'PartieElement'
            {
             before(grammarAccess.getPartieElementAccess().getPartieElementKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPartieElementAccess().getPartieElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieElement__Group__0__Impl"


    // $ANTLR start "rule__PartieElement__Group__1"
    // InternalTowerDefense.g:476:1: rule__PartieElement__Group__1 : rule__PartieElement__Group__1__Impl ;
    public final void rule__PartieElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:480:1: ( rule__PartieElement__Group__1__Impl )
            // InternalTowerDefense.g:481:2: rule__PartieElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartieElement__Group__1__Impl();

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
    // $ANTLR end "rule__PartieElement__Group__1"


    // $ANTLR start "rule__PartieElement__Group__1__Impl"
    // InternalTowerDefense.g:487:1: rule__PartieElement__Group__1__Impl : ( ( rule__PartieElement__NameAssignment_1 ) ) ;
    public final void rule__PartieElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:491:1: ( ( ( rule__PartieElement__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:492:1: ( ( rule__PartieElement__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:492:1: ( ( rule__PartieElement__NameAssignment_1 ) )
            // InternalTowerDefense.g:493:2: ( rule__PartieElement__NameAssignment_1 )
            {
             before(grammarAccess.getPartieElementAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:494:2: ( rule__PartieElement__NameAssignment_1 )
            // InternalTowerDefense.g:494:3: rule__PartieElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PartieElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartieElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieElement__Group__1__Impl"


    // $ANTLR start "rule__Niveau__Group__0"
    // InternalTowerDefense.g:503:1: rule__Niveau__Group__0 : rule__Niveau__Group__0__Impl rule__Niveau__Group__1 ;
    public final void rule__Niveau__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:507:1: ( rule__Niveau__Group__0__Impl rule__Niveau__Group__1 )
            // InternalTowerDefense.g:508:2: rule__Niveau__Group__0__Impl rule__Niveau__Group__1
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
    // InternalTowerDefense.g:515:1: rule__Niveau__Group__0__Impl : ( 'Niveau' ) ;
    public final void rule__Niveau__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:519:1: ( ( 'Niveau' ) )
            // InternalTowerDefense.g:520:1: ( 'Niveau' )
            {
            // InternalTowerDefense.g:520:1: ( 'Niveau' )
            // InternalTowerDefense.g:521:2: 'Niveau'
            {
             before(grammarAccess.getNiveauAccess().getNiveauKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTowerDefense.g:530:1: rule__Niveau__Group__1 : rule__Niveau__Group__1__Impl ;
    public final void rule__Niveau__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:534:1: ( rule__Niveau__Group__1__Impl )
            // InternalTowerDefense.g:535:2: rule__Niveau__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group__1__Impl();

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
    // InternalTowerDefense.g:541:1: rule__Niveau__Group__1__Impl : ( ( rule__Niveau__NameAssignment_1 ) ) ;
    public final void rule__Niveau__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:545:1: ( ( ( rule__Niveau__NameAssignment_1 ) ) )
            // InternalTowerDefense.g:546:1: ( ( rule__Niveau__NameAssignment_1 ) )
            {
            // InternalTowerDefense.g:546:1: ( ( rule__Niveau__NameAssignment_1 ) )
            // InternalTowerDefense.g:547:2: ( rule__Niveau__NameAssignment_1 )
            {
             before(grammarAccess.getNiveauAccess().getNameAssignment_1()); 
            // InternalTowerDefense.g:548:2: ( rule__Niveau__NameAssignment_1 )
            // InternalTowerDefense.g:548:3: rule__Niveau__NameAssignment_1
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


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalTowerDefense.g:557:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:561:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:562:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:562:2: ( RULE_ID )
            // InternalTowerDefense.g:563:3: RULE_ID
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
    // InternalTowerDefense.g:572:1: rule__Jeu__PartiesAssignment_3 : ( rulePartieRule ) ;
    public final void rule__Jeu__PartiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:576:1: ( ( rulePartieRule ) )
            // InternalTowerDefense.g:577:2: ( rulePartieRule )
            {
            // InternalTowerDefense.g:577:2: ( rulePartieRule )
            // InternalTowerDefense.g:578:3: rulePartieRule
            {
             before(grammarAccess.getJeuAccess().getPartiesPartieRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePartieRule();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getPartiesPartieRuleParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PartieRule__NameAssignment_1"
    // InternalTowerDefense.g:587:1: rule__PartieRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PartieRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:591:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:592:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:592:2: ( RULE_ID )
            // InternalTowerDefense.g:593:3: RULE_ID
            {
             before(grammarAccess.getPartieRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartieRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__NameAssignment_1"


    // $ANTLR start "rule__PartieRule__PartiesElementsAssignment_3"
    // InternalTowerDefense.g:602:1: rule__PartieRule__PartiesElementsAssignment_3 : ( rulePartieElement ) ;
    public final void rule__PartieRule__PartiesElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:606:1: ( ( rulePartieElement ) )
            // InternalTowerDefense.g:607:2: ( rulePartieElement )
            {
            // InternalTowerDefense.g:607:2: ( rulePartieElement )
            // InternalTowerDefense.g:608:3: rulePartieElement
            {
             before(grammarAccess.getPartieRuleAccess().getPartiesElementsPartieElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePartieElement();

            state._fsp--;

             after(grammarAccess.getPartieRuleAccess().getPartiesElementsPartieElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__PartiesElementsAssignment_3"


    // $ANTLR start "rule__PartieRule__NiveauxAssignment_4"
    // InternalTowerDefense.g:617:1: rule__PartieRule__NiveauxAssignment_4 : ( ruleNiveau ) ;
    public final void rule__PartieRule__NiveauxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:621:1: ( ( ruleNiveau ) )
            // InternalTowerDefense.g:622:2: ( ruleNiveau )
            {
            // InternalTowerDefense.g:622:2: ( ruleNiveau )
            // InternalTowerDefense.g:623:3: ruleNiveau
            {
             before(grammarAccess.getPartieRuleAccess().getNiveauxNiveauParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNiveau();

            state._fsp--;

             after(grammarAccess.getPartieRuleAccess().getNiveauxNiveauParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieRule__NiveauxAssignment_4"


    // $ANTLR start "rule__PartieElement__NameAssignment_1"
    // InternalTowerDefense.g:632:1: rule__PartieElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PartieElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:636:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:637:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:637:2: ( RULE_ID )
            // InternalTowerDefense.g:638:3: RULE_ID
            {
             before(grammarAccess.getPartieElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartieElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartieElement__NameAssignment_1"


    // $ANTLR start "rule__Niveau__NameAssignment_1"
    // InternalTowerDefense.g:647:1: rule__Niveau__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Niveau__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTowerDefense.g:651:1: ( ( RULE_ID ) )
            // InternalTowerDefense.g:652:2: ( RULE_ID )
            {
            // InternalTowerDefense.g:652:2: ( RULE_ID )
            // InternalTowerDefense.g:653:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});

}