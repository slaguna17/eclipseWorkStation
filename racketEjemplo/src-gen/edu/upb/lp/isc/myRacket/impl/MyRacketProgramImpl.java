/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.myRacket.impl;

import edu.upb.lp.isc.myRacket.Define;
import edu.upb.lp.isc.myRacket.MyRacketPackage;
import edu.upb.lp.isc.myRacket.MyRacketProgram;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.myRacket.impl.MyRacketProgramImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link edu.upb.lp.isc.myRacket.impl.MyRacketProgramImpl#getExecutions <em>Executions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MyRacketProgramImpl extends MinimalEObjectImpl.Container implements MyRacketProgram
{
  /**
   * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefines()
   * @generated
   * @ordered
   */
  protected EList<Define> defines;

  /**
   * The cached value of the '{@link #getExecutions() <em>Executions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutions()
   * @generated
   * @ordered
   */
  protected EList<String> executions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyRacketProgramImpl()
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
    return MyRacketPackage.Literals.MY_RACKET_PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Define> getDefines()
  {
    if (defines == null)
    {
      defines = new EObjectContainmentEList<Define>(Define.class, this, MyRacketPackage.MY_RACKET_PROGRAM__DEFINES);
    }
    return defines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getExecutions()
  {
    if (executions == null)
    {
      executions = new EDataTypeEList<String>(String.class, this, MyRacketPackage.MY_RACKET_PROGRAM__EXECUTIONS);
    }
    return executions;
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
      case MyRacketPackage.MY_RACKET_PROGRAM__DEFINES:
        return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
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
      case MyRacketPackage.MY_RACKET_PROGRAM__DEFINES:
        return getDefines();
      case MyRacketPackage.MY_RACKET_PROGRAM__EXECUTIONS:
        return getExecutions();
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
      case MyRacketPackage.MY_RACKET_PROGRAM__DEFINES:
        getDefines().clear();
        getDefines().addAll((Collection<? extends Define>)newValue);
        return;
      case MyRacketPackage.MY_RACKET_PROGRAM__EXECUTIONS:
        getExecutions().clear();
        getExecutions().addAll((Collection<? extends String>)newValue);
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
      case MyRacketPackage.MY_RACKET_PROGRAM__DEFINES:
        getDefines().clear();
        return;
      case MyRacketPackage.MY_RACKET_PROGRAM__EXECUTIONS:
        getExecutions().clear();
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
      case MyRacketPackage.MY_RACKET_PROGRAM__DEFINES:
        return defines != null && !defines.isEmpty();
      case MyRacketPackage.MY_RACKET_PROGRAM__EXECUTIONS:
        return executions != null && !executions.isEmpty();
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
    result.append(" (executions: ");
    result.append(executions);
    result.append(')');
    return result.toString();
  }

} //MyRacketProgramImpl
