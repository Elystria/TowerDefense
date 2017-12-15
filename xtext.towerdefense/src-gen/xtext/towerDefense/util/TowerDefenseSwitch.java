/**
 * generated by Xtext 2.12.0
 */
package xtext.towerDefense.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import xtext.towerDefense.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see xtext.towerDefense.TowerDefensePackage
 * @generated
 */
public class TowerDefenseSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TowerDefensePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TowerDefenseSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TowerDefensePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TowerDefensePackage.JEU:
      {
        Jeu jeu = (Jeu)theEObject;
        T result = caseJeu(jeu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.PARTIE:
      {
        Partie partie = (Partie)theEObject;
        T result = casePartie(partie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.PARTIE_ELEMENT:
      {
        PartieElement partieElement = (PartieElement)theEObject;
        T result = casePartieElement(partieElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.ENERGIE:
      {
        Energie energie = (Energie)theEObject;
        T result = caseEnergie(energie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.OBSTACLE:
      {
        Obstacle obstacle = (Obstacle)theEObject;
        T result = caseObstacle(obstacle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.TACTIQUE:
      {
        Tactique tactique = (Tactique)theEObject;
        T result = caseTactique(tactique);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.MOBILE:
      {
        Mobile mobile = (Mobile)theEObject;
        T result = caseMobile(mobile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.PROJECTILE:
      {
        Projectile projectile = (Projectile)theEObject;
        T result = caseProjectile(projectile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.NATURE_TERRAIN:
      {
        NatureTerrain natureTerrain = (NatureTerrain)theEObject;
        T result = caseNatureTerrain(natureTerrain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.NIVEAU:
      {
        Niveau niveau = (Niveau)theEObject;
        T result = caseNiveau(niveau);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.TERRAIN_DE_JEU:
      {
        TerrainDeJeu terrainDeJeu = (TerrainDeJeu)theEObject;
        T result = caseTerrainDeJeu(terrainDeJeu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.DAMIER:
      {
        Damier damier = (Damier)theEObject;
        T result = caseDamier(damier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TowerDefensePackage.VAGUE:
      {
        Vague vague = (Vague)theEObject;
        T result = caseVague(vague);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jeu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jeu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJeu(Jeu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartie(Partie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partie Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partie Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartieElement(PartieElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Energie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Energie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnergie(Energie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Obstacle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Obstacle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObstacle(Obstacle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tactique</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tactique</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTactique(Tactique object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mobile</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mobile</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMobile(Mobile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Projectile</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Projectile</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectile(Projectile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nature Terrain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nature Terrain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNatureTerrain(NatureTerrain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Niveau</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Niveau</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNiveau(Niveau object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terrain De Jeu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terrain De Jeu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerrainDeJeu(TerrainDeJeu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Damier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Damier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDamier(Damier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vague</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vague</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVague(Vague object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TowerDefenseSwitch
