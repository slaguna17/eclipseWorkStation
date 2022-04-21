/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.elErrorCosmicoDePaserj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Racket Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.MyRacketProgram#getDefines <em>Defines</em>}</li>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.MyRacketProgram#getExecutions <em>Executions</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getMyRacketProgram()
 * @model
 * @generated
 */
public interface MyRacketProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Defines</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.elErrorCosmicoDePaserj.Define}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defines</em>' containment reference list.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getMyRacketProgram_Defines()
   * @model containment="true"
   * @generated
   */
  EList<Define> getDefines();

  /**
   * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.elErrorCosmicoDePaserj.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executions</em>' containment reference list.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getMyRacketProgram_Executions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExecutions();

} // MyRacketProgram
