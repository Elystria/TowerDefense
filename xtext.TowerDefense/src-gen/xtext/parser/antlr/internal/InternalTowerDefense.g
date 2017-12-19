/*
 * generated by Xtext 2.12.0
 */
grammar InternalTowerDefense;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleJeu
entryRuleJeu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJeuRule()); }
	iv_ruleJeu=ruleJeu
	{ $current=$iv_ruleJeu.current; }
	EOF;

// Rule Jeu
ruleJeu returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Jeu'
		{
			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJeuRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJeuAccess().getPartiesPartieParserRuleCall_3_0());
				}
				lv_parties_3_0=rulePartie
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJeuRule());
					}
					add(
						$current,
						"parties",
						lv_parties_3_0,
						"xtext.TowerDefense.Partie");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePartie
entryRulePartie returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPartieRule()); }
	iv_rulePartie=rulePartie
	{ $current=$iv_rulePartie.current; }
	EOF;

// Rule Partie
rulePartie returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Partie'
		{
			newLeafNode(otherlv_0, grammarAccess.getPartieAccess().getPartieKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPartieAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPartieRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPartieAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPartieAccess().getCasesCaseParserRuleCall_3_0());
				}
				lv_cases_3_0=ruleCase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartieRule());
					}
					add(
						$current,
						"cases",
						lv_cases_3_0,
						"xtext.TowerDefense.Case");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getPartieAccess().getCartesCarteParserRuleCall_4_0());
				}
				lv_cartes_4_0=ruleCarte
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartieRule());
					}
					add(
						$current,
						"cartes",
						lv_cartes_4_0,
						"xtext.TowerDefense.Carte");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getPartieAccess().getPartieElementsPartieElementParserRuleCall_5_0());
				}
				lv_partieElements_5_0=rulePartieElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartieRule());
					}
					add(
						$current,
						"partieElements",
						lv_partieElements_5_0,
						"xtext.TowerDefense.PartieElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getPartieAccess().getNiveauxNiveauParserRuleCall_6_0());
				}
				lv_niveaux_6_0=ruleNiveau
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartieRule());
					}
					add(
						$current,
						"niveaux",
						lv_niveaux_6_0,
						"xtext.TowerDefense.Niveau");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getPartieAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRulePartieElement
entryRulePartieElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPartieElementRule()); }
	iv_rulePartieElement=rulePartieElement
	{ $current=$iv_rulePartieElement.current; }
	EOF;

// Rule PartieElement
rulePartieElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPartieElementAccess().getObstacleParserRuleCall_0());
		}
		this_Obstacle_0=ruleObstacle
		{
			$current = $this_Obstacle_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPartieElementAccess().getMobileParserRuleCall_1());
		}
		this_Mobile_1=ruleMobile
		{
			$current = $this_Mobile_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPartieElementAccess().getProjectileParserRuleCall_2());
		}
		this_Projectile_2=ruleProjectile
		{
			$current = $this_Projectile_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPartieElementAccess().getNatureTerrainParserRuleCall_3());
		}
		this_NatureTerrain_3=ruleNatureTerrain
		{
			$current = $this_NatureTerrain_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEnergie
entryRuleEnergie returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnergieRule()); }
	iv_ruleEnergie=ruleEnergie
	{ $current=$iv_ruleEnergie.current; }
	EOF;

// Rule Energie
ruleEnergie returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_infini_0_0='infini'
				{
					newLeafNode(lv_infini_0_0, grammarAccess.getEnergieAccess().getInfiniInfiniKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnergieRule());
					}
					setWithLastConsumed($current, "infini", true, "infini");
				}
			)
		)
		    |
		(
			(
				lv_valeur_1_0=RULE_INT
				{
					newLeafNode(lv_valeur_1_0, grammarAccess.getEnergieAccess().getValeurINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnergieRule());
					}
					setWithLastConsumed(
						$current,
						"valeur",
						lv_valeur_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleObstacle
entryRuleObstacle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObstacleRule()); }
	iv_ruleObstacle=ruleObstacle
	{ $current=$iv_ruleObstacle.current; }
	EOF;

// Rule Obstacle
ruleObstacle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Obstacle'
		{
			newLeafNode(otherlv_0, grammarAccess.getObstacleAccess().getObstacleKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getObstacleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObstacleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='Campement'
		{
			newLeafNode(otherlv_3, grammarAccess.getObstacleAccess().getCampementKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObstacleRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getObstacleAccess().getCampementCaseCrossReference_4_0());
				}
			)
		)
		otherlv_5='PVmax'
		{
			newLeafNode(otherlv_5, grammarAccess.getObstacleAccess().getPVmaxKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getObstacleAccess().getQuantiteEnergieMaxEnergieParserRuleCall_6_0());
				}
				lv_quantiteEnergieMax_6_0=ruleEnergie
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObstacleRule());
					}
					set(
						$current,
						"quantiteEnergieMax",
						lv_quantiteEnergieMax_6_0,
						"xtext.TowerDefense.Energie");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='Tactique'
		{
			newLeafNode(otherlv_7, grammarAccess.getObstacleAccess().getTactiqueKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getObstacleAccess().getTactiqueTactiqueTypeEnumRuleCall_8_0());
				}
				lv_tactique_8_0=ruleTactiqueType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObstacleRule());
					}
					set(
						$current,
						"tactique",
						lv_tactique_8_0,
						"xtext.TowerDefense.TactiqueType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getObstacleAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleMobile
entryRuleMobile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMobileRule()); }
	iv_ruleMobile=ruleMobile
	{ $current=$iv_ruleMobile.current; }
	EOF;

// Rule Mobile
ruleMobile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Mobile'
		{
			newLeafNode(otherlv_0, grammarAccess.getMobileAccess().getMobileKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMobileAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMobileRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMobileAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='F'
		{
			newLeafNode(otherlv_3, grammarAccess.getMobileAccess().getFKeyword_3());
		}
		(
			(
				lv_force_4_0=RULE_INT
				{
					newLeafNode(lv_force_4_0, grammarAccess.getMobileAccess().getForceINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMobileRule());
					}
					setWithLastConsumed(
						$current,
						"force",
						lv_force_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='V'
		{
			newLeafNode(otherlv_5, grammarAccess.getMobileAccess().getVKeyword_5());
		}
		(
			(
				lv_volume_6_0=RULE_INT
				{
					newLeafNode(lv_volume_6_0, grammarAccess.getMobileAccess().getVolumeINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMobileRule());
					}
					setWithLastConsumed(
						$current,
						"volume",
						lv_volume_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='NumVague'
		{
			newLeafNode(otherlv_7, grammarAccess.getMobileAccess().getNumVagueKeyword_7());
		}
		(
			(
				lv_numVague_8_0=RULE_INT
				{
					newLeafNode(lv_numVague_8_0, grammarAccess.getMobileAccess().getNumVagueINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMobileRule());
					}
					setWithLastConsumed(
						$current,
						"numVague",
						lv_numVague_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9='In'
		{
			newLeafNode(otherlv_9, grammarAccess.getMobileAccess().getInKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMobileRule());
					}
				}
				otherlv_10=RULE_ID
				{
					newLeafNode(otherlv_10, grammarAccess.getMobileAccess().getCaseEntreeCaseCrossReference_10_0());
				}
			)
		)
		otherlv_11='Out'
		{
			newLeafNode(otherlv_11, grammarAccess.getMobileAccess().getOutKeyword_11());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMobileRule());
					}
				}
				otherlv_12=RULE_ID
				{
					newLeafNode(otherlv_12, grammarAccess.getMobileAccess().getCaseSortieCaseCrossReference_12_0());
				}
			)
		)
		otherlv_13='PVmax'
		{
			newLeafNode(otherlv_13, grammarAccess.getMobileAccess().getPVmaxKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMobileAccess().getQuantiteEnergieMaxEnergieParserRuleCall_14_0());
				}
				lv_quantiteEnergieMax_14_0=ruleEnergie
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMobileRule());
					}
					set(
						$current,
						"quantiteEnergieMax",
						lv_quantiteEnergieMax_14_0,
						"xtext.TowerDefense.Energie");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='Tactique'
		{
			newLeafNode(otherlv_15, grammarAccess.getMobileAccess().getTactiqueKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMobileAccess().getTactiqueTactiqueTypeEnumRuleCall_16_0());
				}
				lv_tactique_16_0=ruleTactiqueType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMobileRule());
					}
					set(
						$current,
						"tactique",
						lv_tactique_16_0,
						"xtext.TowerDefense.TactiqueType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getMobileAccess().getRightCurlyBracketKeyword_17());
		}
	)
;

// Entry rule entryRuleProjectile
entryRuleProjectile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProjectileRule()); }
	iv_ruleProjectile=ruleProjectile
	{ $current=$iv_ruleProjectile.current; }
	EOF;

// Rule Projectile
ruleProjectile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Projectile'
		{
			newLeafNode(otherlv_0, grammarAccess.getProjectileAccess().getProjectileKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProjectileAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProjectileRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProjectileAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='Portee'
		{
			newLeafNode(otherlv_3, grammarAccess.getProjectileAccess().getPorteeKeyword_3());
		}
		(
			(
				lv_portee_4_0=RULE_INT
				{
					newLeafNode(lv_portee_4_0, grammarAccess.getProjectileAccess().getPorteeINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProjectileRule());
					}
					setWithLastConsumed(
						$current,
						"portee",
						lv_portee_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='Masse'
		{
			newLeafNode(otherlv_5, grammarAccess.getProjectileAccess().getMasseKeyword_5());
		}
		(
			(
				lv_masse_6_0=RULE_INT
				{
					newLeafNode(lv_masse_6_0, grammarAccess.getProjectileAccess().getMasseINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProjectileRule());
					}
					setWithLastConsumed(
						$current,
						"masse",
						lv_masse_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='Vitesse'
		{
			newLeafNode(otherlv_7, grammarAccess.getProjectileAccess().getVitesseKeyword_7());
		}
		(
			(
				lv_vitesse_8_0=RULE_INT
				{
					newLeafNode(lv_vitesse_8_0, grammarAccess.getProjectileAccess().getVitesseINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProjectileRule());
					}
					setWithLastConsumed(
						$current,
						"vitesse",
						lv_vitesse_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9='Position'
		{
			newLeafNode(otherlv_9, grammarAccess.getProjectileAccess().getPositionKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProjectileRule());
					}
				}
				otherlv_10=RULE_ID
				{
					newLeafNode(otherlv_10, grammarAccess.getProjectileAccess().getCaseCaseCrossReference_10_0());
				}
			)
		)
		otherlv_11='Direction'
		{
			newLeafNode(otherlv_11, grammarAccess.getProjectileAccess().getDirectionKeyword_11());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProjectileRule());
					}
				}
				otherlv_12=RULE_ID
				{
					newLeafNode(otherlv_12, grammarAccess.getProjectileAccess().getCibleCaseCrossReference_12_0());
				}
			)
		)
		otherlv_13='Degat'
		{
			newLeafNode(otherlv_13, grammarAccess.getProjectileAccess().getDegatKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectileAccess().getDegatEnergieParserRuleCall_14_0());
				}
				lv_degat_14_0=ruleEnergie
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectileRule());
					}
					set(
						$current,
						"degat",
						lv_degat_14_0,
						"xtext.TowerDefense.Energie");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getProjectileAccess().getRightCurlyBracketKeyword_15());
		}
	)
;

// Entry rule entryRuleNatureTerrain
entryRuleNatureTerrain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNatureTerrainRule()); }
	iv_ruleNatureTerrain=ruleNatureTerrain
	{ $current=$iv_ruleNatureTerrain.current; }
	EOF;

// Rule NatureTerrain
ruleNatureTerrain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NatureTerrain'
		{
			newLeafNode(otherlv_0, grammarAccess.getNatureTerrainAccess().getNatureTerrainKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNatureTerrainAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNatureTerrainRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNatureTerrainAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='Volume'
		{
			newLeafNode(otherlv_3, grammarAccess.getNatureTerrainAccess().getVolumeKeyword_3());
		}
		(
			(
				lv_volume_4_0=RULE_INT
				{
					newLeafNode(lv_volume_4_0, grammarAccess.getNatureTerrainAccess().getVolumeINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNatureTerrainRule());
					}
					setWithLastConsumed(
						$current,
						"volume",
						lv_volume_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='Type'
		{
			newLeafNode(otherlv_5, grammarAccess.getNatureTerrainAccess().getTypeKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNatureTerrainAccess().getTypeTYPE_TERRAINEnumRuleCall_6_0());
				}
				lv_type_6_0=ruleTYPE_TERRAIN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNatureTerrainRule());
					}
					set(
						$current,
						"type",
						lv_type_6_0,
						"xtext.TowerDefense.TYPE_TERRAIN");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='FatigueEntree'
		{
			newLeafNode(otherlv_7, grammarAccess.getNatureTerrainAccess().getFatigueEntreeKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNatureTerrainAccess().getFatigueEnergieParserRuleCall_8_0());
				}
				lv_fatigue_8_0=ruleEnergie
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNatureTerrainRule());
					}
					set(
						$current,
						"fatigue",
						lv_fatigue_8_0,
						"xtext.TowerDefense.Energie");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getNatureTerrainAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleNiveau
entryRuleNiveau returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNiveauRule()); }
	iv_ruleNiveau=ruleNiveau
	{ $current=$iv_ruleNiveau.current; }
	EOF;

// Rule Niveau
ruleNiveau returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Niveau'
		{
			newLeafNode(otherlv_0, grammarAccess.getNiveauAccess().getNiveauKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNiveauAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNiveauRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNiveauAccess().getDifficulteDifficulteEnumRuleCall_2_0());
				}
				lv_difficulte_2_0=ruleDifficulte
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNiveauRule());
					}
					set(
						$current,
						"difficulte",
						lv_difficulte_2_0,
						"xtext.TowerDefense.Difficulte");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='DureePauses'
		{
			newLeafNode(otherlv_4, grammarAccess.getNiveauAccess().getDureePausesKeyword_4());
		}
		(
			(
				lv_dureePause_5_0=RULE_INT
				{
					newLeafNode(lv_dureePause_5_0, grammarAccess.getNiveauAccess().getDureePauseINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNiveauRule());
					}
					setWithLastConsumed(
						$current,
						"dureePause",
						lv_dureePause_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6='Argent'
		{
			newLeafNode(otherlv_6, grammarAccess.getNiveauAccess().getArgentKeyword_6());
		}
		(
			(
				lv_argent_7_0=RULE_INT
				{
					newLeafNode(lv_argent_7_0, grammarAccess.getNiveauAccess().getArgentINTTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNiveauRule());
					}
					setWithLastConsumed(
						$current,
						"argent",
						lv_argent_7_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_8='MobSortisMax'
		{
			newLeafNode(otherlv_8, grammarAccess.getNiveauAccess().getMobSortisMaxKeyword_8());
		}
		(
			(
				lv_mobSortisLimite_9_0=RULE_INT
				{
					newLeafNode(lv_mobSortisLimite_9_0, grammarAccess.getNiveauAccess().getMobSortisLimiteINTTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNiveauRule());
					}
					setWithLastConsumed(
						$current,
						"mobSortisLimite",
						lv_mobSortisLimite_9_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_10='Carte'
		{
			newLeafNode(otherlv_10, grammarAccess.getNiveauAccess().getCarteKeyword_10());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNiveauRule());
					}
				}
				otherlv_11=RULE_ID
				{
					newLeafNode(otherlv_11, grammarAccess.getNiveauAccess().getCarteCarteCrossReference_11_0());
				}
			)
		)
		otherlv_12='Vague'
		{
			newLeafNode(otherlv_12, grammarAccess.getNiveauAccess().getVagueKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNiveauAccess().getVaguesVagueParserRuleCall_13_0());
				}
				lv_vagues_13_0=ruleVague
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNiveauRule());
					}
					add(
						$current,
						"vagues",
						lv_vagues_13_0,
						"xtext.TowerDefense.Vague");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_14());
		}
	)
;

// Entry rule entryRuleCarte
entryRuleCarte returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCarteRule()); }
	iv_ruleCarte=ruleCarte
	{ $current=$iv_ruleCarte.current; }
	EOF;

// Rule Carte
ruleCarte returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Carte'
		{
			newLeafNode(otherlv_0, grammarAccess.getCarteAccess().getCarteKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCarteAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCarteRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCarteAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='Lignes'
		{
			newLeafNode(otherlv_3, grammarAccess.getCarteAccess().getLignesKeyword_3());
		}
		(
			(
				lv_nbLignes_4_0=RULE_INT
				{
					newLeafNode(lv_nbLignes_4_0, grammarAccess.getCarteAccess().getNbLignesINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCarteRule());
					}
					setWithLastConsumed(
						$current,
						"nbLignes",
						lv_nbLignes_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='Colonnes'
		{
			newLeafNode(otherlv_5, grammarAccess.getCarteAccess().getColonnesKeyword_5());
		}
		(
			(
				lv_nbColonnes_6_0=RULE_INT
				{
					newLeafNode(lv_nbColonnes_6_0, grammarAccess.getCarteAccess().getNbColonnesINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCarteRule());
					}
					setWithLastConsumed(
						$current,
						"nbColonnes",
						lv_nbColonnes_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='Cases'
		{
			newLeafNode(otherlv_7, grammarAccess.getCarteAccess().getCasesKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCarteRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getCarteAccess().getCasesCaseCrossReference_8_0());
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getCarteAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleCase
entryRuleCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCaseRule()); }
	iv_ruleCase=ruleCase
	{ $current=$iv_ruleCase.current; }
	EOF;

// Rule Case
ruleCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_i_1_0=RULE_INT
				{
					newLeafNode(lv_i_1_0, grammarAccess.getCaseAccess().getIINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseRule());
					}
					setWithLastConsumed(
						$current,
						"i",
						lv_i_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_j_2_0=RULE_INT
				{
					newLeafNode(lv_j_2_0, grammarAccess.getCaseAccess().getJINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseRule());
					}
					setWithLastConsumed(
						$current,
						"j",
						lv_j_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getNatureDuTerrainNatureTerrainCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleVague
entryRuleVague returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVagueRule()); }
	iv_ruleVague=ruleVague
	{ $current=$iv_ruleVague.current; }
	EOF;

// Rule Vague
ruleVague returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getVagueAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVagueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVagueAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='Mobiles'
		{
			newLeafNode(otherlv_2, grammarAccess.getVagueAccess().getMobilesKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVagueRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getVagueAccess().getMobilesMobileCrossReference_3_0());
				}
			)
		)*
		otherlv_4='Obstacles'
		{
			newLeafNode(otherlv_4, grammarAccess.getVagueAccess().getObstaclesKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVagueRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getVagueAccess().getObstaclesObstacleCrossReference_5_0());
				}
			)
		)*
		otherlv_6='Gain'
		{
			newLeafNode(otherlv_6, grammarAccess.getVagueAccess().getGainKeyword_6());
		}
		(
			(
				lv_gainVictoire_7_0=RULE_INT
				{
					newLeafNode(lv_gainVictoire_7_0, grammarAccess.getVagueAccess().getGainVictoireINTTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVagueRule());
					}
					setWithLastConsumed(
						$current,
						"gainVictoire",
						lv_gainVictoire_7_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVagueAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Rule TactiqueType
ruleTactiqueType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='procheFirst'
			{
				$current = grammarAccess.getTactiqueTypeAccess().getProcheEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTactiqueTypeAccess().getProcheEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='faibleFirst'
			{
				$current = grammarAccess.getTactiqueTypeAccess().getFaibleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTactiqueTypeAccess().getFaibleEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='fortFirst'
			{
				$current = grammarAccess.getTactiqueTypeAccess().getFortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTactiqueTypeAccess().getFortEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule TYPE_TERRAIN
ruleTYPE_TERRAIN returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='entree'
			{
				$current = grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTYPE_TERRAINAccess().getEntreeEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='sortie'
			{
				$current = grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTYPE_TERRAINAccess().getSortieEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='chemin'
			{
				$current = grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTYPE_TERRAINAccess().getCheminEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='camp'
			{
				$current = grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTYPE_TERRAINAccess().getCampementEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='deco'
			{
				$current = grammarAccess.getTYPE_TERRAINAccess().getDecorationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTYPE_TERRAINAccess().getDecorationEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule Difficulte
ruleDifficulte returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='facile'
			{
				$current = grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDifficulteAccess().getFacileEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='moyen'
			{
				$current = grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDifficulteAccess().getMoyenEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='difficile'
			{
				$current = grammarAccess.getDifficulteAccess().getDifficileEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDifficulteAccess().getDifficileEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
