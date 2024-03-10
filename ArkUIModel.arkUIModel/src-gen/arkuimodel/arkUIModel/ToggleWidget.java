/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toggle Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ToggleWidget#getIsOn <em>Is On</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ToggleWidget#getToggleType <em>Toggle Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ToggleWidget#getToggleevent <em>Toggleevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ToggleWidget#getTogglestyle <em>Togglestyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getToggleWidget()
 * @model
 * @generated
 */
public interface ToggleWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Is On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is On</em>' attribute.
	 * @see #setIsOn(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getToggleWidget_IsOn()
	 * @model
	 * @generated
	 */
	String getIsOn();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ToggleWidget#getIsOn <em>Is On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is On</em>' attribute.
	 * @see #getIsOn()
	 * @generated
	 */
	void setIsOn(String value);

	/**
	 * Returns the value of the '<em><b>Toggle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggle Type</em>' attribute.
	 * @see #setToggleType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getToggleWidget_ToggleType()
	 * @model
	 * @generated
	 */
	String getToggleType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ToggleWidget#getToggleType <em>Toggle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggle Type</em>' attribute.
	 * @see #getToggleType()
	 * @generated
	 */
	void setToggleType(String value);

	/**
	 * Returns the value of the '<em><b>Toggleevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggleevent</em>' containment reference.
	 * @see #setToggleevent(ToggleEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getToggleWidget_Toggleevent()
	 * @model containment="true"
	 * @generated
	 */
	ToggleEvent getToggleevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ToggleWidget#getToggleevent <em>Toggleevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggleevent</em>' containment reference.
	 * @see #getToggleevent()
	 * @generated
	 */
	void setToggleevent(ToggleEvent value);

	/**
	 * Returns the value of the '<em><b>Togglestyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Togglestyle</em>' containment reference.
	 * @see #setTogglestyle(ToggleStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getToggleWidget_Togglestyle()
	 * @model containment="true"
	 * @generated
	 */
	ToggleStyle getTogglestyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ToggleWidget#getTogglestyle <em>Togglestyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Togglestyle</em>' containment reference.
	 * @see #getTogglestyle()
	 * @generated
	 */
	void setTogglestyle(ToggleStyle value);

} // ToggleWidget
