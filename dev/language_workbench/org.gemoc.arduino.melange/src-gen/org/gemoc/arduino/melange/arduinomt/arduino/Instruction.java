/**
 */
package org.gemoc.arduino.melange.arduinomt.arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.melange.arduinomt.arduino.Instruction#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.gemoc.arduino.melange.arduinomt.arduino.Instruction#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Instruction)
	 * @see org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage#getInstruction_Previous()
	 * @model
	 * @generated
	 */
	Instruction getPrevious();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.melange.arduinomt.arduino.Instruction#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Instruction value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Instruction)
	 * @see org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage#getInstruction_Next()
	 * @model
	 * @generated
	 */
	Instruction getNext();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.melange.arduinomt.arduino.Instruction#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Instruction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // Instruction
