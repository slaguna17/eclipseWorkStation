/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.elErrorCosmicoDePaserj.impl;

import edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ListExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.SimpleList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.impl.ListExpressionImpl#getSimple <em>Simple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListExpressionImpl extends ExpressionImpl implements ListExpression
{
  /**
   * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple()
   * @generated
   * @ordered
   */
  protected SimpleList simple;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListExpressionImpl()
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
    return ElErrorCosmicoDePaserjPackage.Literals.LIST_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleList getSimple()
  {
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimple(SimpleList newSimple, NotificationChain msgs)
  {
    SimpleList oldSimple = simple;
    simple = newSimple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE, oldSimple, newSimple);
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
  public void setSimple(SimpleList newSimple)
  {
    if (newSimple != simple)
    {
      NotificationChain msgs = null;
      if (simple != null)
        msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE, null, msgs);
      if (newSimple != null)
        msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE, null, msgs);
      msgs = basicSetSimple(newSimple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE, newSimple, newSimple));
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
      case ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE:
        return basicSetSimple(null, msgs);
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
      case ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE:
        return getSimple();
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
      case ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE:
        setSimple((SimpleList)newValue);
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
      case ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE:
        setSimple((SimpleList)null);
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
      case ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION__SIMPLE:
        return simple != null;
    }
    return super.eIsSet(featureID);
  }

} //ListExpressionImpl