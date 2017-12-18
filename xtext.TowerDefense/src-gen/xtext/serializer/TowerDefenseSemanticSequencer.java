/*
 * generated by Xtext 2.12.0
 */
package xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import xtext.services.TowerDefenseGrammarAccess;
import xtext.towerDefense.Carte;
import xtext.towerDefense.Case;
import xtext.towerDefense.Energie;
import xtext.towerDefense.Jeu;
import xtext.towerDefense.Mobile;
import xtext.towerDefense.NatureTerrain;
import xtext.towerDefense.Niveau;
import xtext.towerDefense.Obstacle;
import xtext.towerDefense.Partie;
import xtext.towerDefense.Projectile;
import xtext.towerDefense.TowerDefensePackage;
import xtext.towerDefense.Vague;

@SuppressWarnings("all")
public class TowerDefenseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TowerDefenseGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TowerDefensePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TowerDefensePackage.CARTE:
				sequence_Carte(context, (Carte) semanticObject); 
				return; 
			case TowerDefensePackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case TowerDefensePackage.ENERGIE:
				sequence_Energie(context, (Energie) semanticObject); 
				return; 
			case TowerDefensePackage.JEU:
				sequence_Jeu(context, (Jeu) semanticObject); 
				return; 
			case TowerDefensePackage.MOBILE:
				sequence_Mobile(context, (Mobile) semanticObject); 
				return; 
			case TowerDefensePackage.NATURE_TERRAIN:
				sequence_NatureTerrain(context, (NatureTerrain) semanticObject); 
				return; 
			case TowerDefensePackage.NIVEAU:
				sequence_Niveau(context, (Niveau) semanticObject); 
				return; 
			case TowerDefensePackage.OBSTACLE:
				sequence_Obstacle(context, (Obstacle) semanticObject); 
				return; 
			case TowerDefensePackage.PARTIE:
				sequence_Partie(context, (Partie) semanticObject); 
				return; 
			case TowerDefensePackage.PROJECTILE:
				sequence_Projectile(context, (Projectile) semanticObject); 
				return; 
			case TowerDefensePackage.VAGUE:
				sequence_Vague(context, (Vague) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Carte returns Carte
	 *
	 * Constraint:
	 *     (name=ID nbLignes=INT nbColonnes=INT cases+=[Case|ID]*)
	 */
	protected void sequence_Carte(ISerializationContext context, Carte semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Case returns Case
	 *
	 * Constraint:
	 *     (name=ID i=INT j=INT natureDuTerrain=[NatureTerrain|ID])
	 */
	protected void sequence_Case(ISerializationContext context, Case semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.CASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.CASE__NAME));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.CASE__I) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.CASE__I));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.CASE__J) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.CASE__J));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.CASE__NATURE_DU_TERRAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.CASE__NATURE_DU_TERRAIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCaseAccess().getIINTTerminalRuleCall_1_0(), semanticObject.getI());
		feeder.accept(grammarAccess.getCaseAccess().getJINTTerminalRuleCall_2_0(), semanticObject.getJ());
		feeder.accept(grammarAccess.getCaseAccess().getNatureDuTerrainNatureTerrainIDTerminalRuleCall_3_0_1(), semanticObject.eGet(TowerDefensePackage.Literals.CASE__NATURE_DU_TERRAIN, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Energie returns Energie
	 *
	 * Constraint:
	 *     (infini?='infini' | valeur=INT)
	 */
	protected void sequence_Energie(ISerializationContext context, Energie semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Jeu returns Jeu
	 *
	 * Constraint:
	 *     (name=ID parties+=Partie*)
	 */
	protected void sequence_Jeu(ISerializationContext context, Jeu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PartieElement returns Mobile
	 *     Mobile returns Mobile
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         force=INT 
	 *         volume=INT 
	 *         numVague=INT 
	 *         caseEntree=[Case|ID] 
	 *         caseSortie=[Case|ID] 
	 *         quantiteEnergieMax=Energie 
	 *         tactique=TactiqueType
	 *     )
	 */
	protected void sequence_Mobile(ISerializationContext context, Mobile semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PARTIE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PARTIE_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.MOBILE__FORCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.MOBILE__FORCE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.MOBILE__VOLUME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.MOBILE__VOLUME));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.MOBILE__NUM_VAGUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.MOBILE__NUM_VAGUE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.MOBILE__CASE_ENTREE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.MOBILE__CASE_ENTREE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.MOBILE__CASE_SORTIE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.MOBILE__CASE_SORTIE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.MOBILE__QUANTITE_ENERGIE_MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.MOBILE__QUANTITE_ENERGIE_MAX));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.MOBILE__TACTIQUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.MOBILE__TACTIQUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMobileAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMobileAccess().getForceINTTerminalRuleCall_4_0(), semanticObject.getForce());
		feeder.accept(grammarAccess.getMobileAccess().getVolumeINTTerminalRuleCall_6_0(), semanticObject.getVolume());
		feeder.accept(grammarAccess.getMobileAccess().getNumVagueINTTerminalRuleCall_8_0(), semanticObject.getNumVague());
		feeder.accept(grammarAccess.getMobileAccess().getCaseEntreeCaseIDTerminalRuleCall_10_0_1(), semanticObject.eGet(TowerDefensePackage.Literals.MOBILE__CASE_ENTREE, false));
		feeder.accept(grammarAccess.getMobileAccess().getCaseSortieCaseIDTerminalRuleCall_12_0_1(), semanticObject.eGet(TowerDefensePackage.Literals.MOBILE__CASE_SORTIE, false));
		feeder.accept(grammarAccess.getMobileAccess().getQuantiteEnergieMaxEnergieParserRuleCall_14_0(), semanticObject.getQuantiteEnergieMax());
		feeder.accept(grammarAccess.getMobileAccess().getTactiqueTactiqueTypeEnumRuleCall_16_0(), semanticObject.getTactique());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PartieElement returns NatureTerrain
	 *     NatureTerrain returns NatureTerrain
	 *
	 * Constraint:
	 *     (name=ID volume=INT type=TYPE_TERRAIN fatigue=Energie)
	 */
	protected void sequence_NatureTerrain(ISerializationContext context, NatureTerrain semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PARTIE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PARTIE_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.NATURE_TERRAIN__VOLUME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.NATURE_TERRAIN__VOLUME));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.NATURE_TERRAIN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.NATURE_TERRAIN__TYPE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.NATURE_TERRAIN__FATIGUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.NATURE_TERRAIN__FATIGUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNatureTerrainAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNatureTerrainAccess().getVolumeINTTerminalRuleCall_4_0(), semanticObject.getVolume());
		feeder.accept(grammarAccess.getNatureTerrainAccess().getTypeTYPE_TERRAINEnumRuleCall_6_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getNatureTerrainAccess().getFatigueEnergieParserRuleCall_8_0(), semanticObject.getFatigue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Niveau returns Niveau
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         difficulte=Difficulte 
	 *         dureePause=INT 
	 *         argent=INT 
	 *         mobSortisLimite=INT 
	 *         carte=[Carte|ID] 
	 *         vagues+=Vague
	 *     )
	 */
	protected void sequence_Niveau(ISerializationContext context, Niveau semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PartieElement returns Obstacle
	 *     Obstacle returns Obstacle
	 *
	 * Constraint:
	 *     (name=ID campement=[Case|ID] quantiteEnergieMax=Energie tactique=TactiqueType)
	 */
	protected void sequence_Obstacle(ISerializationContext context, Obstacle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PARTIE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PARTIE_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.OBSTACLE__CAMPEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.OBSTACLE__CAMPEMENT));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.OBSTACLE__QUANTITE_ENERGIE_MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.OBSTACLE__QUANTITE_ENERGIE_MAX));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.OBSTACLE__TACTIQUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.OBSTACLE__TACTIQUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObstacleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getObstacleAccess().getCampementCaseIDTerminalRuleCall_4_0_1(), semanticObject.eGet(TowerDefensePackage.Literals.OBSTACLE__CAMPEMENT, false));
		feeder.accept(grammarAccess.getObstacleAccess().getQuantiteEnergieMaxEnergieParserRuleCall_6_0(), semanticObject.getQuantiteEnergieMax());
		feeder.accept(grammarAccess.getObstacleAccess().getTactiqueTactiqueTypeEnumRuleCall_8_0(), semanticObject.getTactique());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Partie returns Partie
	 *
	 * Constraint:
	 *     (name=ID cases+=Case* cartes+=Carte* partieElements+=PartieElement* niveaux+=Niveau*)
	 */
	protected void sequence_Partie(ISerializationContext context, Partie semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PartieElement returns Projectile
	 *     Projectile returns Projectile
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         portee=INT 
	 *         masse=INT 
	 *         vitesse=INT 
	 *         case=[Case|ID] 
	 *         cible=[Case|ID] 
	 *         degat=Energie
	 *     )
	 */
	protected void sequence_Projectile(ISerializationContext context, Projectile semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PARTIE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PARTIE_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PROJECTILE__PORTEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PROJECTILE__PORTEE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PROJECTILE__MASSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PROJECTILE__MASSE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PROJECTILE__VITESSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PROJECTILE__VITESSE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PROJECTILE__CASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PROJECTILE__CASE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PROJECTILE__CIBLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PROJECTILE__CIBLE));
			if (transientValues.isValueTransient(semanticObject, TowerDefensePackage.Literals.PROJECTILE__DEGAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TowerDefensePackage.Literals.PROJECTILE__DEGAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProjectileAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProjectileAccess().getPorteeINTTerminalRuleCall_4_0(), semanticObject.getPortee());
		feeder.accept(grammarAccess.getProjectileAccess().getMasseINTTerminalRuleCall_6_0(), semanticObject.getMasse());
		feeder.accept(grammarAccess.getProjectileAccess().getVitesseINTTerminalRuleCall_8_0(), semanticObject.getVitesse());
		feeder.accept(grammarAccess.getProjectileAccess().getCaseCaseIDTerminalRuleCall_10_0_1(), semanticObject.eGet(TowerDefensePackage.Literals.PROJECTILE__CASE, false));
		feeder.accept(grammarAccess.getProjectileAccess().getCibleCaseIDTerminalRuleCall_12_0_1(), semanticObject.eGet(TowerDefensePackage.Literals.PROJECTILE__CIBLE, false));
		feeder.accept(grammarAccess.getProjectileAccess().getDegatEnergieParserRuleCall_14_0(), semanticObject.getDegat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Vague returns Vague
	 *
	 * Constraint:
	 *     (name=ID mobiles+=[Mobile|ID]* obstacles+=[Obstacle|ID]* gainVictoire=INT)
	 */
	protected void sequence_Vague(ISerializationContext context, Vague semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
