/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.elErrorCosmicoDePaserj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Equals Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.StringEqualsExpression#getOp <em>Op</em>}</li>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.StringEqualsExpression#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getStringEqualsExpression()
 * @model
 * @generated
 */
public interface StringEqualsExpression extends BooleanExpression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getStringEqualsExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.StringEqualsExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.elErrorCosmicoDePaserj.StringExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage#getStringEqualsExpression_Args()
   * @model containment="true"
   * @generated
   */
  EList<StringExpression> getArgs();

} // StringEqualsExpression
