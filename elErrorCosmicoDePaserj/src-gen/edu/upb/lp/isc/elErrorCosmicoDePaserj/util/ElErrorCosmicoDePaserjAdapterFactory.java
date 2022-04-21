/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.elErrorCosmicoDePaserj.util;

import edu.upb.lp.isc.elErrorCosmicoDePaserj.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage
 * @generated
 */
public class ElErrorCosmicoDePaserjAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ElErrorCosmicoDePaserjPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElErrorCosmicoDePaserjAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ElErrorCosmicoDePaserjPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElErrorCosmicoDePaserjSwitch<Adapter> modelSwitch =
    new ElErrorCosmicoDePaserjSwitch<Adapter>()
    {
      @Override
      public Adapter caseMyRacketProgram(MyRacketProgram object)
      {
        return createMyRacketProgramAdapter();
      }
      @Override
      public Adapter caseDefine(Define object)
      {
        return createDefineAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSimpleExpression(SimpleExpression object)
      {
        return createSimpleExpressionAdapter();
      }
      @Override
      public Adapter caseIntExpression(IntExpression object)
      {
        return createIntExpressionAdapter();
      }
      @Override
      public Adapter caseArithExpression(ArithExpression object)
      {
        return createArithExpressionAdapter();
      }
      @Override
      public Adapter caseIfExpression(IfExpression object)
      {
        return createIfExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionCallExpression(FunctionCallExpression object)
      {
        return createFunctionCallExpressionAdapter();
      }
      @Override
      public Adapter caseStringExpression(StringExpression object)
      {
        return createStringExpressionAdapter();
      }
      @Override
      public Adapter caseParamsExpression(ParamsExpression object)
      {
        return createParamsExpressionAdapter();
      }
      @Override
      public Adapter caseParamsCallExpression(ParamsCallExpression object)
      {
        return createParamsCallExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanConstant(BooleanConstant object)
      {
        return createBooleanConstantAdapter();
      }
      @Override
      public Adapter caseBooleanOpExpression(BooleanOpExpression object)
      {
        return createBooleanOpExpressionAdapter();
      }
      @Override
      public Adapter caseComparisonExpression(ComparisonExpression object)
      {
        return createComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseStringEqualsExpression(StringEqualsExpression object)
      {
        return createStringEqualsExpressionAdapter();
      }
      @Override
      public Adapter caseListIsEmptyExpression(ListIsEmptyExpression object)
      {
        return createListIsEmptyExpressionAdapter();
      }
      @Override
      public Adapter caseListExpression(ListExpression object)
      {
        return createListExpressionAdapter();
      }
      @Override
      public Adapter caseSimpleList(SimpleList object)
      {
        return createSimpleListAdapter();
      }
      @Override
      public Adapter caseLinkedList(LinkedList object)
      {
        return createLinkedListAdapter();
      }
      @Override
      public Adapter caseListOperationExpression(ListOperationExpression object)
      {
        return createListOperationExpressionAdapter();
      }
      @Override
      public Adapter caseListHeadOp(ListHeadOp object)
      {
        return createListHeadOpAdapter();
      }
      @Override
      public Adapter caseListTailOp(ListTailOp object)
      {
        return createListTailOpAdapter();
      }
      @Override
      public Adapter caseListConsOp(ListConsOp object)
      {
        return createListConsOpAdapter();
      }
      @Override
      public Adapter caseListLengthOp(ListLengthOp object)
      {
        return createListLengthOpAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.MyRacketProgram <em>My Racket Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.MyRacketProgram
   * @generated
   */
  public Adapter createMyRacketProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.Define
   * @generated
   */
  public Adapter createDefineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.SimpleExpression
   * @generated
   */
  public Adapter createSimpleExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.IntExpression <em>Int Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.IntExpression
   * @generated
   */
  public Adapter createIntExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ArithExpression <em>Arith Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ArithExpression
   * @generated
   */
  public Adapter createArithExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.IfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.IfExpression
   * @generated
   */
  public Adapter createIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.FunctionCallExpression <em>Function Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.FunctionCallExpression
   * @generated
   */
  public Adapter createFunctionCallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.StringExpression
   * @generated
   */
  public Adapter createStringExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ParamsExpression <em>Params Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ParamsExpression
   * @generated
   */
  public Adapter createParamsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ParamsCallExpression <em>Params Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ParamsCallExpression
   * @generated
   */
  public Adapter createParamsCallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanConstant <em>Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanConstant
   * @generated
   */
  public Adapter createBooleanConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanOpExpression <em>Boolean Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanOpExpression
   * @generated
   */
  public Adapter createBooleanOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ComparisonExpression <em>Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ComparisonExpression
   * @generated
   */
  public Adapter createComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.StringEqualsExpression <em>String Equals Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.StringEqualsExpression
   * @generated
   */
  public Adapter createStringEqualsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ListIsEmptyExpression <em>List Is Empty Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ListIsEmptyExpression
   * @generated
   */
  public Adapter createListIsEmptyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ListExpression <em>List Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ListExpression
   * @generated
   */
  public Adapter createListExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.SimpleList <em>Simple List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.SimpleList
   * @generated
   */
  public Adapter createSimpleListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.LinkedList <em>Linked List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.LinkedList
   * @generated
   */
  public Adapter createLinkedListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ListOperationExpression <em>List Operation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ListOperationExpression
   * @generated
   */
  public Adapter createListOperationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ListHeadOp <em>List Head Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ListHeadOp
   * @generated
   */
  public Adapter createListHeadOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ListTailOp <em>List Tail Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ListTailOp
   * @generated
   */
  public Adapter createListTailOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ListConsOp <em>List Cons Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ListConsOp
   * @generated
   */
  public Adapter createListConsOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.elErrorCosmicoDePaserj.ListLengthOp <em>List Length Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.elErrorCosmicoDePaserj.ListLengthOp
   * @generated
   */
  public Adapter createListLengthOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ElErrorCosmicoDePaserjAdapterFactory
