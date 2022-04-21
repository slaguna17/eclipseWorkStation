/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.elErrorCosmicoDePaserj.impl;

import edu.upb.lp.isc.elErrorCosmicoDePaserj.ComparisonExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.IntExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.impl.ComparisonExpressionImpl#getEvaluator <em>Evaluator</em>}</li>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.impl.ComparisonExpressionImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonExpressionImpl extends BooleanExpressionImpl implements ComparisonExpression
{
  /**
   * The default value of the '{@link #getEvaluator() <em>Evaluator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluator()
   * @generated
   * @ordered
   */
  protected static final String EVALUATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvaluator() <em>Evaluator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluator()
   * @generated
   * @ordered
   */
  protected String evaluator = EVALUATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<IntExpression> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparisonExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ElErrorCosmicoDePaserjPackage.Literals.COMPARISON_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEvaluator()
  {
    return evaluator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEvaluator(String newEvaluator)
  {
    String oldEvaluator = evaluator;
    evaluator = newEvaluator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__EVALUATOR, oldEvaluator, evaluator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IntExpression> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<IntExpression>(IntExpression.class, this, ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__EVALUATOR:
        return getEvaluator();
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__EVALUATOR:
        setEvaluator((String)newValue);
        return;
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends IntExpression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__EVALUATOR:
        setEvaluator(EVALUATOR_EDEFAULT);
        return;
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__ARGS:
        getArgs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__EVALUATOR:
        return EVALUATOR_EDEFAULT == null ? evaluator != null : !EVALUATOR_EDEFAULT.equals(evaluator);
      case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (evaluator: ");
    result.append(evaluator);
    result.append(')');
    return result.toString();
  }

} //ComparisonExpressionImpl
