/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xtext.towerDefense.Carte;
import xtext.towerDefense.Case;
import xtext.towerDefense.Difficulte;
import xtext.towerDefense.Energie;
import xtext.towerDefense.Jeu;
import xtext.towerDefense.Mobile;
import xtext.towerDefense.NatureTerrain;
import xtext.towerDefense.Niveau;
import xtext.towerDefense.Obstacle;
import xtext.towerDefense.Partie;
import xtext.towerDefense.PartieElement;
import xtext.towerDefense.Projectile;
import xtext.towerDefense.TactiqueType;
import xtext.towerDefense.TowerDefenseFactory;
import xtext.towerDefense.TowerDefensePackage;
import xtext.towerDefense.Vague;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TowerDefensePackageImpl extends EPackageImpl implements TowerDefensePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jeuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partieElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass energieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass obstacleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mobileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass natureTerrainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass niveauEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass carteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vagueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum tactiqueTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typE_TERRAINEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum difficulteEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see xtext.towerDefense.TowerDefensePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TowerDefensePackageImpl()
  {
    super(eNS_URI, TowerDefenseFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TowerDefensePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TowerDefensePackage init()
  {
    if (isInited) return (TowerDefensePackage)EPackage.Registry.INSTANCE.getEPackage(TowerDefensePackage.eNS_URI);

    // Obtain or create and register package
    TowerDefensePackageImpl theTowerDefensePackage = (TowerDefensePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TowerDefensePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TowerDefensePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTowerDefensePackage.createPackageContents();

    // Initialize created meta-data
    theTowerDefensePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTowerDefensePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TowerDefensePackage.eNS_URI, theTowerDefensePackage);
    return theTowerDefensePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJeu()
  {
    return jeuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJeu_Name()
  {
    return (EAttribute)jeuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJeu_Parties()
  {
    return (EReference)jeuEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartie()
  {
    return partieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartie_Name()
  {
    return (EAttribute)partieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartie_Cases()
  {
    return (EReference)partieEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartie_Cartes()
  {
    return (EReference)partieEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartie_PartieElements()
  {
    return (EReference)partieEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartie_Niveaux()
  {
    return (EReference)partieEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartieElement()
  {
    return partieElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartieElement_Name()
  {
    return (EAttribute)partieElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnergie()
  {
    return energieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnergie_Infini()
  {
    return (EAttribute)energieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnergie_Valeur()
  {
    return (EAttribute)energieEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObstacle()
  {
    return obstacleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObstacle_Campement()
  {
    return (EReference)obstacleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObstacle_QuantiteEnergieMax()
  {
    return (EReference)obstacleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObstacle_Tactique()
  {
    return (EAttribute)obstacleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMobile()
  {
    return mobileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobile_Force()
  {
    return (EAttribute)mobileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobile_Volume()
  {
    return (EAttribute)mobileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobile_NumVague()
  {
    return (EAttribute)mobileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobile_CaseEntree()
  {
    return (EReference)mobileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobile_CaseSortie()
  {
    return (EReference)mobileEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobile_QuantiteEnergieMax()
  {
    return (EReference)mobileEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobile_Tactique()
  {
    return (EAttribute)mobileEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectile()
  {
    return projectileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectile_Portee()
  {
    return (EAttribute)projectileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectile_Masse()
  {
    return (EAttribute)projectileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectile_Vitesse()
  {
    return (EAttribute)projectileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectile_Case()
  {
    return (EReference)projectileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectile_Cible()
  {
    return (EReference)projectileEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectile_Degat()
  {
    return (EReference)projectileEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNatureTerrain()
  {
    return natureTerrainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNatureTerrain_Volume()
  {
    return (EAttribute)natureTerrainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNatureTerrain_Type()
  {
    return (EAttribute)natureTerrainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNatureTerrain_Fatigue()
  {
    return (EReference)natureTerrainEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNiveau()
  {
    return niveauEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNiveau_Name()
  {
    return (EAttribute)niveauEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNiveau_Difficulte()
  {
    return (EAttribute)niveauEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNiveau_DureePause()
  {
    return (EAttribute)niveauEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNiveau_Argent()
  {
    return (EAttribute)niveauEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNiveau_MobSortisLimite()
  {
    return (EAttribute)niveauEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNiveau_Carte()
  {
    return (EReference)niveauEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNiveau_Vagues()
  {
    return (EReference)niveauEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCarte()
  {
    return carteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCarte_Name()
  {
    return (EAttribute)carteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCarte_NbLignes()
  {
    return (EAttribute)carteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCarte_NbColonnes()
  {
    return (EAttribute)carteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCarte_Cases()
  {
    return (EReference)carteEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCase_Name()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCase_I()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCase_J()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_NatureDuTerrain()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVague()
  {
    return vagueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVague_Name()
  {
    return (EAttribute)vagueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVague_Mobiles()
  {
    return (EReference)vagueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVague_Obstacles()
  {
    return (EReference)vagueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVague_GainVictoire()
  {
    return (EAttribute)vagueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTactiqueType()
  {
    return tactiqueTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTYPE_TERRAIN()
  {
    return typE_TERRAINEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDifficulte()
  {
    return difficulteEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TowerDefenseFactory getTowerDefenseFactory()
  {
    return (TowerDefenseFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jeuEClass = createEClass(JEU);
    createEAttribute(jeuEClass, JEU__NAME);
    createEReference(jeuEClass, JEU__PARTIES);

    partieEClass = createEClass(PARTIE);
    createEAttribute(partieEClass, PARTIE__NAME);
    createEReference(partieEClass, PARTIE__CASES);
    createEReference(partieEClass, PARTIE__CARTES);
    createEReference(partieEClass, PARTIE__PARTIE_ELEMENTS);
    createEReference(partieEClass, PARTIE__NIVEAUX);

    partieElementEClass = createEClass(PARTIE_ELEMENT);
    createEAttribute(partieElementEClass, PARTIE_ELEMENT__NAME);

    energieEClass = createEClass(ENERGIE);
    createEAttribute(energieEClass, ENERGIE__INFINI);
    createEAttribute(energieEClass, ENERGIE__VALEUR);

    obstacleEClass = createEClass(OBSTACLE);
    createEReference(obstacleEClass, OBSTACLE__CAMPEMENT);
    createEReference(obstacleEClass, OBSTACLE__QUANTITE_ENERGIE_MAX);
    createEAttribute(obstacleEClass, OBSTACLE__TACTIQUE);

    mobileEClass = createEClass(MOBILE);
    createEAttribute(mobileEClass, MOBILE__FORCE);
    createEAttribute(mobileEClass, MOBILE__VOLUME);
    createEAttribute(mobileEClass, MOBILE__NUM_VAGUE);
    createEReference(mobileEClass, MOBILE__CASE_ENTREE);
    createEReference(mobileEClass, MOBILE__CASE_SORTIE);
    createEReference(mobileEClass, MOBILE__QUANTITE_ENERGIE_MAX);
    createEAttribute(mobileEClass, MOBILE__TACTIQUE);

    projectileEClass = createEClass(PROJECTILE);
    createEAttribute(projectileEClass, PROJECTILE__PORTEE);
    createEAttribute(projectileEClass, PROJECTILE__MASSE);
    createEAttribute(projectileEClass, PROJECTILE__VITESSE);
    createEReference(projectileEClass, PROJECTILE__CASE);
    createEReference(projectileEClass, PROJECTILE__CIBLE);
    createEReference(projectileEClass, PROJECTILE__DEGAT);

    natureTerrainEClass = createEClass(NATURE_TERRAIN);
    createEAttribute(natureTerrainEClass, NATURE_TERRAIN__VOLUME);
    createEAttribute(natureTerrainEClass, NATURE_TERRAIN__TYPE);
    createEReference(natureTerrainEClass, NATURE_TERRAIN__FATIGUE);

    niveauEClass = createEClass(NIVEAU);
    createEAttribute(niveauEClass, NIVEAU__NAME);
    createEAttribute(niveauEClass, NIVEAU__DIFFICULTE);
    createEAttribute(niveauEClass, NIVEAU__DUREE_PAUSE);
    createEAttribute(niveauEClass, NIVEAU__ARGENT);
    createEAttribute(niveauEClass, NIVEAU__MOB_SORTIS_LIMITE);
    createEReference(niveauEClass, NIVEAU__CARTE);
    createEReference(niveauEClass, NIVEAU__VAGUES);

    carteEClass = createEClass(CARTE);
    createEAttribute(carteEClass, CARTE__NAME);
    createEAttribute(carteEClass, CARTE__NB_LIGNES);
    createEAttribute(carteEClass, CARTE__NB_COLONNES);
    createEReference(carteEClass, CARTE__CASES);

    caseEClass = createEClass(CASE);
    createEAttribute(caseEClass, CASE__NAME);
    createEAttribute(caseEClass, CASE__I);
    createEAttribute(caseEClass, CASE__J);
    createEReference(caseEClass, CASE__NATURE_DU_TERRAIN);

    vagueEClass = createEClass(VAGUE);
    createEAttribute(vagueEClass, VAGUE__NAME);
    createEReference(vagueEClass, VAGUE__MOBILES);
    createEReference(vagueEClass, VAGUE__OBSTACLES);
    createEAttribute(vagueEClass, VAGUE__GAIN_VICTOIRE);

    // Create enums
    tactiqueTypeEEnum = createEEnum(TACTIQUE_TYPE);
    typE_TERRAINEEnum = createEEnum(TYPE_TERRAIN);
    difficulteEEnum = createEEnum(DIFFICULTE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    obstacleEClass.getESuperTypes().add(this.getPartieElement());
    mobileEClass.getESuperTypes().add(this.getPartieElement());
    projectileEClass.getESuperTypes().add(this.getPartieElement());
    natureTerrainEClass.getESuperTypes().add(this.getPartieElement());

    // Initialize classes and features; add operations and parameters
    initEClass(jeuEClass, Jeu.class, "Jeu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJeu_Name(), ecorePackage.getEString(), "name", null, 0, 1, Jeu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJeu_Parties(), this.getPartie(), null, "parties", null, 0, -1, Jeu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partieEClass, Partie.class, "Partie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartie_Name(), ecorePackage.getEString(), "name", null, 0, 1, Partie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartie_Cases(), this.getCase(), null, "cases", null, 0, -1, Partie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartie_Cartes(), this.getCarte(), null, "cartes", null, 0, -1, Partie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartie_PartieElements(), this.getPartieElement(), null, "partieElements", null, 0, -1, Partie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartie_Niveaux(), this.getNiveau(), null, "niveaux", null, 0, -1, Partie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partieElementEClass, PartieElement.class, "PartieElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartieElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PartieElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(energieEClass, Energie.class, "Energie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnergie_Infini(), ecorePackage.getEBoolean(), "infini", null, 0, 1, Energie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnergie_Valeur(), ecorePackage.getEInt(), "valeur", null, 0, 1, Energie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(obstacleEClass, Obstacle.class, "Obstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObstacle_Campement(), this.getCase(), null, "campement", null, 0, 1, Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObstacle_QuantiteEnergieMax(), this.getEnergie(), null, "quantiteEnergieMax", null, 0, 1, Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObstacle_Tactique(), this.getTactiqueType(), "tactique", null, 0, 1, Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mobileEClass, Mobile.class, "Mobile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMobile_Force(), ecorePackage.getEInt(), "force", null, 0, 1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMobile_Volume(), ecorePackage.getEInt(), "volume", null, 0, 1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMobile_NumVague(), ecorePackage.getEInt(), "numVague", null, 0, 1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobile_CaseEntree(), this.getCase(), null, "caseEntree", null, 0, 1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobile_CaseSortie(), this.getCase(), null, "caseSortie", null, 0, 1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobile_QuantiteEnergieMax(), this.getEnergie(), null, "quantiteEnergieMax", null, 0, 1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMobile_Tactique(), this.getTactiqueType(), "tactique", null, 0, 1, Mobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectileEClass, Projectile.class, "Projectile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProjectile_Portee(), ecorePackage.getEInt(), "portee", null, 0, 1, Projectile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProjectile_Masse(), ecorePackage.getEInt(), "masse", null, 0, 1, Projectile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProjectile_Vitesse(), ecorePackage.getEInt(), "vitesse", null, 0, 1, Projectile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectile_Case(), this.getCase(), null, "case", null, 0, 1, Projectile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectile_Cible(), this.getCase(), null, "cible", null, 0, 1, Projectile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectile_Degat(), this.getEnergie(), null, "degat", null, 0, 1, Projectile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(natureTerrainEClass, NatureTerrain.class, "NatureTerrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNatureTerrain_Volume(), ecorePackage.getEInt(), "volume", null, 0, 1, NatureTerrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNatureTerrain_Type(), this.getTYPE_TERRAIN(), "type", null, 0, 1, NatureTerrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNatureTerrain_Fatigue(), this.getEnergie(), null, "fatigue", null, 0, 1, NatureTerrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(niveauEClass, Niveau.class, "Niveau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNiveau_Name(), ecorePackage.getEString(), "name", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNiveau_Difficulte(), this.getDifficulte(), "difficulte", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNiveau_DureePause(), ecorePackage.getEInt(), "dureePause", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNiveau_Argent(), ecorePackage.getEInt(), "argent", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNiveau_MobSortisLimite(), ecorePackage.getEInt(), "mobSortisLimite", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNiveau_Carte(), this.getCarte(), null, "carte", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNiveau_Vagues(), this.getVague(), null, "vagues", null, 0, -1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(carteEClass, Carte.class, "Carte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCarte_Name(), ecorePackage.getEString(), "name", null, 0, 1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCarte_NbLignes(), ecorePackage.getEInt(), "nbLignes", null, 0, 1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCarte_NbColonnes(), ecorePackage.getEInt(), "nbColonnes", null, 0, 1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCarte_Cases(), this.getCase(), null, "cases", null, 0, -1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCase_I(), ecorePackage.getEInt(), "i", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCase_J(), ecorePackage.getEInt(), "j", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_NatureDuTerrain(), this.getNatureTerrain(), null, "natureDuTerrain", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vagueEClass, Vague.class, "Vague", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVague_Name(), ecorePackage.getEString(), "name", null, 0, 1, Vague.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVague_Mobiles(), this.getMobile(), null, "mobiles", null, 0, -1, Vague.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVague_Obstacles(), this.getObstacle(), null, "obstacles", null, 0, -1, Vague.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVague_GainVictoire(), ecorePackage.getEInt(), "gainVictoire", null, 0, 1, Vague.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(tactiqueTypeEEnum, TactiqueType.class, "TactiqueType");
    addEEnumLiteral(tactiqueTypeEEnum, TactiqueType.PROCHE);
    addEEnumLiteral(tactiqueTypeEEnum, TactiqueType.FAIBLE);
    addEEnumLiteral(tactiqueTypeEEnum, TactiqueType.FORT);

    initEEnum(typE_TERRAINEEnum, xtext.towerDefense.TYPE_TERRAIN.class, "TYPE_TERRAIN");
    addEEnumLiteral(typE_TERRAINEEnum, xtext.towerDefense.TYPE_TERRAIN.ENTREE);
    addEEnumLiteral(typE_TERRAINEEnum, xtext.towerDefense.TYPE_TERRAIN.SORTIE);
    addEEnumLiteral(typE_TERRAINEEnum, xtext.towerDefense.TYPE_TERRAIN.CHEMIN);
    addEEnumLiteral(typE_TERRAINEEnum, xtext.towerDefense.TYPE_TERRAIN.CAMPEMENT);
    addEEnumLiteral(typE_TERRAINEEnum, xtext.towerDefense.TYPE_TERRAIN.DECORATION);

    initEEnum(difficulteEEnum, Difficulte.class, "Difficulte");
    addEEnumLiteral(difficulteEEnum, Difficulte.FACILE);
    addEEnumLiteral(difficulteEEnum, Difficulte.MOYEN);
    addEEnumLiteral(difficulteEEnum, Difficulte.DIFFICILE);

    // Create resource
    createResource(eNS_URI);
  }

} //TowerDefensePackageImpl
