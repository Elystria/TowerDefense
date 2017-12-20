/*
 * generated by Xtext 2.12.0
 */
package xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xtext.ide.contentassist.antlr.internal.InternalTowerDefenseParser;
import xtext.services.TowerDefenseGrammarAccess;

public class TowerDefenseParser extends AbstractContentAssistParser {

	@Inject
	private TowerDefenseGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTowerDefenseParser createParser() {
		InternalTowerDefenseParser result = new InternalTowerDefenseParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPartieElementAccess().getAlternatives(), "rule__PartieElement__Alternatives");
					put(grammarAccess.getTactiqueTypeAccess().getAlternatives(), "rule__TactiqueType__Alternatives");
					put(grammarAccess.getTYPE_TERRAINAccess().getAlternatives(), "rule__TYPE_TERRAIN__Alternatives");
					put(grammarAccess.getDifficulteAccess().getAlternatives(), "rule__Difficulte__Alternatives");
					put(grammarAccess.getJeuAccess().getGroup(), "rule__Jeu__Group__0");
					put(grammarAccess.getPartieAccess().getGroup(), "rule__Partie__Group__0");
					put(grammarAccess.getEnergieAccess().getGroup(), "rule__Energie__Group__0");
					put(grammarAccess.getObstacleAccess().getGroup(), "rule__Obstacle__Group__0");
					put(grammarAccess.getMobileAccess().getGroup(), "rule__Mobile__Group__0");
					put(grammarAccess.getProjectileAccess().getGroup(), "rule__Projectile__Group__0");
					put(grammarAccess.getNatureTerrainAccess().getGroup(), "rule__NatureTerrain__Group__0");
					put(grammarAccess.getNiveauAccess().getGroup(), "rule__Niveau__Group__0");
					put(grammarAccess.getCarteAccess().getGroup(), "rule__Carte__Group__0");
					put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
					put(grammarAccess.getVagueAccess().getGroup(), "rule__Vague__Group__0");
					put(grammarAccess.getJeuAccess().getNameAssignment_1(), "rule__Jeu__NameAssignment_1");
					put(grammarAccess.getJeuAccess().getPartiesAssignment_3(), "rule__Jeu__PartiesAssignment_3");
					put(grammarAccess.getPartieAccess().getNameAssignment_1(), "rule__Partie__NameAssignment_1");
					put(grammarAccess.getPartieAccess().getCasesAssignment_3(), "rule__Partie__CasesAssignment_3");
					put(grammarAccess.getPartieAccess().getCartesAssignment_4(), "rule__Partie__CartesAssignment_4");
					put(grammarAccess.getPartieAccess().getEnergiesAssignment_5(), "rule__Partie__EnergiesAssignment_5");
					put(grammarAccess.getPartieAccess().getPartieElementsAssignment_6(), "rule__Partie__PartieElementsAssignment_6");
					put(grammarAccess.getPartieAccess().getNiveauxAssignment_7(), "rule__Partie__NiveauxAssignment_7");
					put(grammarAccess.getEnergieAccess().getNameAssignment_0(), "rule__Energie__NameAssignment_0");
					put(grammarAccess.getEnergieAccess().getValeurAssignment_1(), "rule__Energie__ValeurAssignment_1");
					put(grammarAccess.getObstacleAccess().getNameAssignment_1(), "rule__Obstacle__NameAssignment_1");
					put(grammarAccess.getObstacleAccess().getCampementAssignment_4(), "rule__Obstacle__CampementAssignment_4");
					put(grammarAccess.getObstacleAccess().getQuantiteEnergieMaxAssignment_6(), "rule__Obstacle__QuantiteEnergieMaxAssignment_6");
					put(grammarAccess.getObstacleAccess().getTactiqueAssignment_8(), "rule__Obstacle__TactiqueAssignment_8");
					put(grammarAccess.getMobileAccess().getNameAssignment_1(), "rule__Mobile__NameAssignment_1");
					put(grammarAccess.getMobileAccess().getForceAssignment_4(), "rule__Mobile__ForceAssignment_4");
					put(grammarAccess.getMobileAccess().getVolumeAssignment_6(), "rule__Mobile__VolumeAssignment_6");
					put(grammarAccess.getMobileAccess().getNumVagueAssignment_8(), "rule__Mobile__NumVagueAssignment_8");
					put(grammarAccess.getMobileAccess().getCaseEntreeAssignment_10(), "rule__Mobile__CaseEntreeAssignment_10");
					put(grammarAccess.getMobileAccess().getCaseSortieAssignment_12(), "rule__Mobile__CaseSortieAssignment_12");
					put(grammarAccess.getMobileAccess().getQuantiteEnergieMaxAssignment_14(), "rule__Mobile__QuantiteEnergieMaxAssignment_14");
					put(grammarAccess.getMobileAccess().getTactiqueAssignment_16(), "rule__Mobile__TactiqueAssignment_16");
					put(grammarAccess.getProjectileAccess().getNameAssignment_1(), "rule__Projectile__NameAssignment_1");
					put(grammarAccess.getProjectileAccess().getPorteeAssignment_4(), "rule__Projectile__PorteeAssignment_4");
					put(grammarAccess.getProjectileAccess().getMasseAssignment_6(), "rule__Projectile__MasseAssignment_6");
					put(grammarAccess.getProjectileAccess().getVitesseAssignment_8(), "rule__Projectile__VitesseAssignment_8");
					put(grammarAccess.getProjectileAccess().getCaseAssignment_10(), "rule__Projectile__CaseAssignment_10");
					put(grammarAccess.getProjectileAccess().getCibleAssignment_12(), "rule__Projectile__CibleAssignment_12");
					put(grammarAccess.getProjectileAccess().getDegatAssignment_14(), "rule__Projectile__DegatAssignment_14");
					put(grammarAccess.getNatureTerrainAccess().getNameAssignment_1(), "rule__NatureTerrain__NameAssignment_1");
					put(grammarAccess.getNatureTerrainAccess().getVolumeAssignment_4(), "rule__NatureTerrain__VolumeAssignment_4");
					put(grammarAccess.getNatureTerrainAccess().getTypeAssignment_6(), "rule__NatureTerrain__TypeAssignment_6");
					put(grammarAccess.getNatureTerrainAccess().getFatigueAssignment_8(), "rule__NatureTerrain__FatigueAssignment_8");
					put(grammarAccess.getNiveauAccess().getNameAssignment_1(), "rule__Niveau__NameAssignment_1");
					put(grammarAccess.getNiveauAccess().getDifficulteAssignment_2(), "rule__Niveau__DifficulteAssignment_2");
					put(grammarAccess.getNiveauAccess().getDureePauseAssignment_5(), "rule__Niveau__DureePauseAssignment_5");
					put(grammarAccess.getNiveauAccess().getArgentAssignment_7(), "rule__Niveau__ArgentAssignment_7");
					put(grammarAccess.getNiveauAccess().getMobSortisLimiteAssignment_9(), "rule__Niveau__MobSortisLimiteAssignment_9");
					put(grammarAccess.getNiveauAccess().getCarteAssignment_11(), "rule__Niveau__CarteAssignment_11");
					put(grammarAccess.getNiveauAccess().getVaguesAssignment_12(), "rule__Niveau__VaguesAssignment_12");
					put(grammarAccess.getCarteAccess().getNameAssignment_1(), "rule__Carte__NameAssignment_1");
					put(grammarAccess.getCarteAccess().getNbLignesAssignment_4(), "rule__Carte__NbLignesAssignment_4");
					put(grammarAccess.getCarteAccess().getNbColonnesAssignment_6(), "rule__Carte__NbColonnesAssignment_6");
					put(grammarAccess.getCarteAccess().getCasesAssignment_8(), "rule__Carte__CasesAssignment_8");
					put(grammarAccess.getCaseAccess().getNameAssignment_0(), "rule__Case__NameAssignment_0");
					put(grammarAccess.getCaseAccess().getIAssignment_1(), "rule__Case__IAssignment_1");
					put(grammarAccess.getCaseAccess().getJAssignment_2(), "rule__Case__JAssignment_2");
					put(grammarAccess.getCaseAccess().getNatureDuTerrainAssignment_3(), "rule__Case__NatureDuTerrainAssignment_3");
					put(grammarAccess.getVagueAccess().getNameAssignment_1(), "rule__Vague__NameAssignment_1");
					put(grammarAccess.getVagueAccess().getMobilesAssignment_4(), "rule__Vague__MobilesAssignment_4");
					put(grammarAccess.getVagueAccess().getObstaclesAssignment_6(), "rule__Vague__ObstaclesAssignment_6");
					put(grammarAccess.getVagueAccess().getGainVictoireAssignment_8(), "rule__Vague__GainVictoireAssignment_8");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TowerDefenseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TowerDefenseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
