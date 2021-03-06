/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.myRacket;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.upb.lp.isc.myRacket.MyRacketFactory
 * @model kind="package"
 * @generated
 */
public interface MyRacketPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myRacket";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.upb.edu/lp/isc/MyRacket";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myRacket";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyRacketPackage eINSTANCE = edu.upb.lp.isc.myRacket.impl.MyRacketPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.upb.lp.isc.myRacket.impl.MyRacketProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.isc.myRacket.impl.MyRacketProgramImpl
   * @see edu.upb.lp.isc.myRacket.impl.MyRacketPackageImpl#getMyRacketProgram()
   * @generated
   */
  int MY_RACKET_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Defines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_RACKET_PROGRAM__DEFINES = 0;

  /**
   * The feature id for the '<em><b>Executions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_RACKET_PROGRAM__EXECUTIONS = 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_RACKET_PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.upb.lp.isc.myRacket.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.isc.myRacket.impl.DefineImpl
   * @see edu.upb.lp.isc.myRacket.impl.MyRacketPackageImpl#getDefine()
   * @generated
   */
  int DEFINE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__BODY = 2;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link edu.upb.lp.isc.myRacket.MyRacketProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see edu.upb.lp.isc.myRacket.MyRacketProgram
   * @generated
   */
  EClass getMyRacketProgram();

  /**
   * Returns the meta object for the containment reference list '{@link edu.upb.lp.isc.myRacket.MyRacketProgram#getDefines <em>Defines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defines</em>'.
   * @see edu.upb.lp.isc.myRacket.MyRacketProgram#getDefines()
   * @see #getMyRacketProgram()
   * @generated
   */
  EReference getMyRacketProgram_Defines();

  /**
   * Returns the meta object for the attribute list '{@link edu.upb.lp.isc.myRacket.MyRacketProgram#getExecutions <em>Executions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Executions</em>'.
   * @see edu.upb.lp.isc.myRacket.MyRacketProgram#getExecutions()
   * @see #getMyRacketProgram()
   * @generated
   */
  EAttribute getMyRacketProgram_Executions();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.isc.myRacket.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see edu.upb.lp.isc.myRacket.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.isc.myRacket.Define#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.upb.lp.isc.myRacket.Define#getName()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Name();

  /**
   * Returns the meta object for the attribute list '{@link edu.upb.lp.isc.myRacket.Define#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see edu.upb.lp.isc.myRacket.Define#getParams()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Params();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.isc.myRacket.Define#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see edu.upb.lp.isc.myRacket.Define#getBody()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Body();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyRacketFactory getMyRacketFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.upb.lp.isc.myRacket.impl.MyRacketProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.isc.myRacket.impl.MyRacketProgramImpl
     * @see edu.upb.lp.isc.myRacket.impl.MyRacketPackageImpl#getMyRacketProgram()
     * @generated
     */
    EClass MY_RACKET_PROGRAM = eINSTANCE.getMyRacketProgram();

    /**
     * The meta object literal for the '<em><b>Defines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_RACKET_PROGRAM__DEFINES = eINSTANCE.getMyRacketProgram_Defines();

    /**
     * The meta object literal for the '<em><b>Executions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_RACKET_PROGRAM__EXECUTIONS = eINSTANCE.getMyRacketProgram_Executions();

    /**
     * The meta object literal for the '{@link edu.upb.lp.isc.myRacket.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.isc.myRacket.impl.DefineImpl
     * @see edu.upb.lp.isc.myRacket.impl.MyRacketPackageImpl#getDefine()
     * @generated
     */
    EClass DEFINE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE__NAME = eINSTANCE.getDefine_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE__PARAMS = eINSTANCE.getDefine_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE__BODY = eINSTANCE.getDefine_Body();

  }

} //MyRacketPackage
