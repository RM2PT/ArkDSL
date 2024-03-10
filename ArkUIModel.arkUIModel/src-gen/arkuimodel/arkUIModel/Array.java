/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.Array#getLength <em>Length</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Array#getAtype <em>Atype</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends TypeCS {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getArray_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Array#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Atype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atype</em>' containment reference.
	 * @see #setAtype(TypeCS)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getArray_Atype()
	 * @model containment="true"
	 * @generated
	 */
	TypeCS getAtype();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Array#getAtype <em>Atype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atype</em>' containment reference.
	 * @see #getAtype()
	 * @generated
	 */
	void setAtype(TypeCS value);

} // Array
