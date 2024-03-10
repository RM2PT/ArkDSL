/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.StackContainer#getStackevent <em>Stackevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.StackContainer#getStackstyle <em>Stackstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getStackContainer()
 * @model
 * @generated
 */
public interface StackContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Stackevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stackevent</em>' containment reference.
	 * @see #setStackevent(StackEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getStackContainer_Stackevent()
	 * @model containment="true"
	 * @generated
	 */
	StackEvent getStackevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.StackContainer#getStackevent <em>Stackevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stackevent</em>' containment reference.
	 * @see #getStackevent()
	 * @generated
	 */
	void setStackevent(StackEvent value);

	/**
	 * Returns the value of the '<em><b>Stackstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stackstyle</em>' containment reference.
	 * @see #setStackstyle(StackStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getStackContainer_Stackstyle()
	 * @model containment="true"
	 * @generated
	 */
	StackStyle getStackstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.StackContainer#getStackstyle <em>Stackstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stackstyle</em>' containment reference.
	 * @see #getStackstyle()
	 * @generated
	 */
	void setStackstyle(StackStyle value);

} // StackContainer
