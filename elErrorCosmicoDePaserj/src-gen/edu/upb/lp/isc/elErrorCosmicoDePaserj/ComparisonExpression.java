/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.elErrorCosmicoDePaserj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ComparisonExpression#getEvaluator <em>Evaluator</em>}</li>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ComparisonExpression#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getComparisonExpression()
 * @model
 * @generated
 */
public interface ComparisonExpression extends BooleanExpression
{
  /**
   * Returns the value of the '<em><b>Evaluator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluator</em>' attribute.
   * @see #setEvaluator(String)
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getComparisonExpression_Evaluator()
   * @model
   * @generated
   */
  String getEvaluator();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ComparisonExpression#getEvaluator <em>Evaluator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluator</em>' attribute.
   * @see #getEvaluator()
   * @generated
   */
  void setEvaluator(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.elErrorCosmicoDePaserj.IntExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getComparisonExpression_Args()
   * @model containment="true"
   * @generated
   */
  EList<IntExpression> getArgs();

} // ComparisonExpression
