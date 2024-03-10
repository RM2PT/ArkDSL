/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Dialog Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.CustomDialogContainer#getCustomdialogstyle <em>Customdialogstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.CustomDialogContainer#getCustomdialogevent <em>Customdialogevent</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getCustomDialogContainer()
 * @model
 * @generated
 */
public interface CustomDialogContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Customdialogstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customdialogstyle</em>' containment reference.
	 * @see #setCustomdialogstyle(CustomDialogStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getCustomDialogContainer_Customdialogstyle()
	 * @model containment="true"
	 * @generated
	 */
	CustomDialogStyle getCustomdialogstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.CustomDialogContainer#getCustomdialogstyle <em>Customdialogstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customdialogstyle</em>' containment reference.
	 * @see #getCustomdialogstyle()
	 * @generated
	 */
	void setCustomdialogstyle(CustomDialogStyle value);

	/**
	 * Returns the value of the '<em><b>Customdialogevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customdialogevent</em>' containment reference.
	 * @see #setCustomdialogevent(CustomDialogEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getCustomDialogContainer_Customdialogevent()
	 * @model containment="true"
	 * @generated
	 */
	CustomDialogEvent getCustomdialogevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.CustomDialogContainer#getCustomdialogevent <em>Customdialogevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customdialogevent</em>' containment reference.
	 * @see #getCustomdialogevent()
	 * @generated
	 */
	void setCustomdialogevent(CustomDialogEvent value);

} // CustomDialogContainer
