/**
 * generated by Xtext 2.22.0
 */
package ac.soton.java.barebones.bareBones;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.java.barebones.bareBones.While#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see ac.soton.java.barebones.bareBones.BareBonesPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Statement
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link ac.soton.java.barebones.bareBones.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see ac.soton.java.barebones.bareBones.BareBonesPackage#getWhile_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // While