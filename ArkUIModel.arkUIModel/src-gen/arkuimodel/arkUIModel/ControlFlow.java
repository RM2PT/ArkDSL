/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ControlFlow#getTarget <em>Target</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ControlFlow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getControlFlow()
 * @model abstract="true"
 * @generated
 */
public interface ControlFlow extends PrimitiveOperation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Function)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getControlFlow_Target()
	 * @model
	 * @generated
	 */
	Function getTarget();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ControlFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Function value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Function)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getControlFlow_Source()
	 * @model
	 * @generated
	 */
	Function getSource();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ControlFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Function value);

} // ControlFlow
