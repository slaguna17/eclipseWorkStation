/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.myRacket.impl;

import edu.upb.lp.isc.myRacket.Define;
import edu.upb.lp.isc.myRacket.MyRacketFactory;
import edu.upb.lp.isc.myRacket.MyRacketPackage;
import edu.upb.lp.isc.myRacket.MyRacketProgram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyRacketPackageImpl extends EPackageImpl implements MyRacketPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myRacketProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defineEClass = null;

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
   * @see edu.upb.lp.isc.myRacket.MyRacketPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyRacketPackageImpl()
  {
    super(eNS_URI, MyRacketFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MyRacketPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyRacketPackage init()
  {
    if (isInited) return (MyRacketPackage)EPackage.Registry.INSTANCE.getEPackage(MyRacketPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMyRacketPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MyRacketPackageImpl theMyRacketPackage = registeredMyRacketPackage instanceof MyRacketPackageImpl ? (MyRacketPackageImpl)registeredMyRacketPackage : new MyRacketPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMyRacketPackage.createPackageContents();

    // Initialize created meta-data
    theMyRacketPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyRacketPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyRacketPackage.eNS_URI, theMyRacketPackage);
    return theMyRacketPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMyRacketProgram()
  {
    return myRacketProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMyRacketProgram_Defines()
  {
    return (EReference)myRacketProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMyRacketProgram_Executions()
  {
    return (EAttribute)myRacketProgramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefine()
  {
    return defineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefine_Name()
  {
    return (EAttribute)defineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefine_Params()
  {
    return (EAttribute)defineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefine_Body()
  {
    return (EAttribute)defineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyRacketFactory getMyRacketFactory()
  {
    return (MyRacketFactory)getEFactoryInstance();
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
    myRacketProgramEClass = createEClass(MY_RACKET_PROGRAM);
    createEReference(myRacketProgramEClass, MY_RACKET_PROGRAM__DEFINES);
    createEAttribute(myRacketProgramEClass, MY_RACKET_PROGRAM__EXECUTIONS);

    defineEClass = createEClass(DEFINE);
    createEAttribute(defineEClass, DEFINE__NAME);
    createEAttribute(defineEClass, DEFINE__PARAMS);
    createEAttribute(defineEClass, DEFINE__BODY);
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

    // Initialize classes and features; add operations and parameters
    initEClass(myRacketProgramEClass, MyRacketProgram.class, "MyRacketProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMyRacketProgram_Defines(), this.getDefine(), null, "defines", null, 0, -1, MyRacketProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMyRacketProgram_Executions(), ecorePackage.getEString(), "executions", null, 0, -1, MyRacketProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defineEClass, Define.class, "Define", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefine_Name(), ecorePackage.getEString(), "name", null, 0, 1, Define.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefine_Params(), ecorePackage.getEString(), "params", null, 0, -1, Define.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefine_Body(), ecorePackage.getEString(), "body", null, 0, 1, Define.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyRacketPackageImpl