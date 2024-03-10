/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Dialog Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.CustomDialogEvent#getCancel <em>Cancel</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.CustomDialogEvent#getConfirm <em>Confirm</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getCustomDialogEvent()
 * @model
 * @generated
 */
public interface CustomDialogEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Cancel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel</em>' attribute.
	 * @see #setCancel(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getCustomDialogEvent_Cancel()
	 * @model
	 * @generated
	 */
	String getCancel();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.CustomDialogEvent#getCancel <em>Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel</em>' attribute.
	 * @see #getCancel()
	 * @generated
	 */
	void setCancel(String value);

	/**
	 * Returns the value of the '<em><b>Confirm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm</em>' attribute.
	 * @see #setConfirm(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getCustomDialogEvent_Confirm()
	 * @model
	 * @generated
	 */
	String getConfirm();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.CustomDialogEvent#getConfirm <em>Confirm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm</em>' attribute.
	 * @see #getConfirm()
	 * @generated
	 */
	void setConfirm(String value);

} // CustomDialogEvent
