/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.elErrorCosmicoDePaserj.impl;

import edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.Expression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.IfExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.impl.IfExpressionImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.impl.IfExpressionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.impl.IfExpressionImpl#getSino <em>Sino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfExpressionImpl extends ExpressionImpl implements IfExpression
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected BooleanExpression cond;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected Expression then;

  /**
   * The cached value of the '{@link #getSino() <em>Sino</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSino()
   * @generated
   * @ordered
   */
  protected Expression sino;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfExpressionImpl()
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
    return ElErrorCosmicoDePaserjPackage.Literals.IF_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpression getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(BooleanExpression newCond, NotificationChain msgs)
  {
    BooleanExpression oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCond(BooleanExpression newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(Expression newThen, NotificationChain msgs)
  {
    Expression oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setThen(Expression newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getSino()
  {
    return sino;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSino(Expression newSino, NotificationChain msgs)
  {
    Expression oldSino = sino;
    sino = newSino;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO, oldSino, newSino);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSino(Expression newSino)
  {
    if (newSino != sino)
    {
      NotificationChain msgs = null;
      if (sino != null)
        msgs = ((InternalEObject)sino).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO, null, msgs);
      if (newSino != null)
        msgs = ((InternalEObject)newSino).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO, null, msgs);
      msgs = basicSetSino(newSino, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO, newSino, newSino));
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
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND:
        return basicSetCond(null, msgs);
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN:
        return basicSetThen(null, msgs);
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO:
        return basicSetSino(null, msgs);
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
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND:
        return getCond();
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN:
        return getThen();
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO:
        return getSino();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND:
        setCond((BooleanExpression)newValue);
        return;
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN:
        setThen((Expression)newValue);
        return;
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO:
        setSino((Expression)newValue);
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
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND:
        setCond((BooleanExpression)null);
        return;
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN:
        setThen((Expression)null);
        return;
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO:
        setSino((Expression)null);
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
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__COND:
        return cond != null;
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__THEN:
        return then != null;
      case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION__SINO:
        return sino != null;
    }
    return super.eIsSet(featureID);
  }

} //IfExpressionImpl
