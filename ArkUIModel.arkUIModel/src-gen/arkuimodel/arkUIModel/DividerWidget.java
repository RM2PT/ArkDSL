/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Divider Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.DividerWidget#getDividerstyle <em>Dividerstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDividerWidget()
 * @model
 * @generated
 */
public interface DividerWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Dividerstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dividerstyle</em>' containment reference.
	 * @see #setDividerstyle(DividerStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDividerWidget_Dividerstyle()
	 * @model containment="true"
	 * @generated
	 */
	DividerStyle getDividerstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DividerWidget#getDividerstyle <em>Dividerstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dividerstyle</em>' containment reference.
	 * @see #getDividerstyle()
	 * @generated
	 */
	void setDividerstyle(DividerStyle value);

} // DividerWidget
