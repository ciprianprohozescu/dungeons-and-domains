/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getConditional <em>Conditional</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getPrint <em>Print</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(Assignment)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Assignment()
   * @model containment="true"
   * @generated
   */
  Assignment getAssignment();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(Assignment value);

  /**
   * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' containment reference.
   * @see #setConditional(Conditional)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Conditional()
   * @model containment="true"
   * @generated
   */
  Conditional getConditional();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(Conditional value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(SimpleAction)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Action()
   * @model containment="true"
   * @generated
   */
  SimpleAction getAction();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(SimpleAction value);

  /**
   * Returns the value of the '<em><b>Print</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print</em>' containment reference.
   * @see #setPrint(Print)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Print()
   * @model containment="true"
   * @generated
   */
  Print getPrint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getPrint <em>Print</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Print</em>' containment reference.
   * @see #getPrint()
   * @generated
   */
  void setPrint(Print value);

} // Statement
