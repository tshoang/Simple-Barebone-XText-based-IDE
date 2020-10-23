/**
 * generated by Xtext 2.22.0
 */
package ac.soton.java.barebones.bareBones;

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
 * @see ac.soton.java.barebones.bareBones.BareBonesFactory
 * @model kind="package"
 * @generated
 */
public interface BareBonesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bareBones";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.soton.ac/java/barebones/BareBones";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bareBones";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BareBonesPackage eINSTANCE = ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl.init();

  /**
   * The meta object id for the '{@link ac.soton.java.barebones.bareBones.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.java.barebones.bareBones.impl.ProgramImpl
   * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ac.soton.java.barebones.bareBones.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.java.barebones.bareBones.impl.StatementImpl
   * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ac.soton.java.barebones.bareBones.impl.ClearImpl <em>Clear</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.java.barebones.bareBones.impl.ClearImpl
   * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getClear()
   * @generated
   */
  int CLEAR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__NAME = STATEMENT__NAME;

  /**
   * The number of structural features of the '<em>Clear</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ac.soton.java.barebones.bareBones.impl.IncrementImpl <em>Increment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.java.barebones.bareBones.impl.IncrementImpl
   * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getIncrement()
   * @generated
   */
  int INCREMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCREMENT__NAME = STATEMENT__NAME;

  /**
   * The number of structural features of the '<em>Increment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCREMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ac.soton.java.barebones.bareBones.impl.DecrementImpl <em>Decrement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.java.barebones.bareBones.impl.DecrementImpl
   * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getDecrement()
   * @generated
   */
  int DECREMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECREMENT__NAME = STATEMENT__NAME;

  /**
   * The number of structural features of the '<em>Decrement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECREMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ac.soton.java.barebones.bareBones.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ac.soton.java.barebones.bareBones.impl.WhileImpl
   * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link ac.soton.java.barebones.bareBones.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see ac.soton.java.barebones.bareBones.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link ac.soton.java.barebones.bareBones.Program#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see ac.soton.java.barebones.bareBones.Program#getStatements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Statements();

  /**
   * Returns the meta object for class '{@link ac.soton.java.barebones.bareBones.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see ac.soton.java.barebones.bareBones.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link ac.soton.java.barebones.bareBones.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ac.soton.java.barebones.bareBones.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

  /**
   * Returns the meta object for class '{@link ac.soton.java.barebones.bareBones.Clear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clear</em>'.
   * @see ac.soton.java.barebones.bareBones.Clear
   * @generated
   */
  EClass getClear();

  /**
   * Returns the meta object for class '{@link ac.soton.java.barebones.bareBones.Increment <em>Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Increment</em>'.
   * @see ac.soton.java.barebones.bareBones.Increment
   * @generated
   */
  EClass getIncrement();

  /**
   * Returns the meta object for class '{@link ac.soton.java.barebones.bareBones.Decrement <em>Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decrement</em>'.
   * @see ac.soton.java.barebones.bareBones.Decrement
   * @generated
   */
  EClass getDecrement();

  /**
   * Returns the meta object for class '{@link ac.soton.java.barebones.bareBones.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see ac.soton.java.barebones.bareBones.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference list '{@link ac.soton.java.barebones.bareBones.While#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see ac.soton.java.barebones.bareBones.While#getStatements()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Statements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BareBonesFactory getBareBonesFactory();

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
     * The meta object literal for the '{@link ac.soton.java.barebones.bareBones.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.java.barebones.bareBones.impl.ProgramImpl
     * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__STATEMENTS = eINSTANCE.getProgram_Statements();

    /**
     * The meta object literal for the '{@link ac.soton.java.barebones.bareBones.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.java.barebones.bareBones.impl.StatementImpl
     * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

    /**
     * The meta object literal for the '{@link ac.soton.java.barebones.bareBones.impl.ClearImpl <em>Clear</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.java.barebones.bareBones.impl.ClearImpl
     * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getClear()
     * @generated
     */
    EClass CLEAR = eINSTANCE.getClear();

    /**
     * The meta object literal for the '{@link ac.soton.java.barebones.bareBones.impl.IncrementImpl <em>Increment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.java.barebones.bareBones.impl.IncrementImpl
     * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getIncrement()
     * @generated
     */
    EClass INCREMENT = eINSTANCE.getIncrement();

    /**
     * The meta object literal for the '{@link ac.soton.java.barebones.bareBones.impl.DecrementImpl <em>Decrement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.java.barebones.bareBones.impl.DecrementImpl
     * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getDecrement()
     * @generated
     */
    EClass DECREMENT = eINSTANCE.getDecrement();

    /**
     * The meta object literal for the '{@link ac.soton.java.barebones.bareBones.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ac.soton.java.barebones.bareBones.impl.WhileImpl
     * @see ac.soton.java.barebones.bareBones.impl.BareBonesPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__STATEMENTS = eINSTANCE.getWhile_Statements();

  }

} //BareBonesPackage