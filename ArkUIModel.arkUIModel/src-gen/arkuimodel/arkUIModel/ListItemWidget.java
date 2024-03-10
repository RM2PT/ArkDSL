/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ListItemWidget#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ListItemWidget#getListitemevent <em>Listitemevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ListItemWidget#getListitemstyle <em>Listitemstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListItemWidget()
 * @model
 * @generated
 */
public interface ListItemWidget extends Container {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListItemWidget_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ListItemWidget#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Listitemevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitemevent</em>' containment reference.
	 * @see #setListitemevent(ListItemEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListItemWidget_Listitemevent()
	 * @model containment="true"
	 * @generated
	 */
	ListItemEvent getListitemevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ListItemWidget#getListitemevent <em>Listitemevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listitemevent</em>' containment reference.
	 * @see #getListitemevent()
	 * @generated
	 */
	void setListitemevent(ListItemEvent value);

	/**
	 * Returns the value of the '<em><b>Listitemstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitemstyle</em>' containment reference.
	 * @see #setListitemstyle(ListItemStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListItemWidget_Listitemstyle()
	 * @model containment="true"
	 * @generated
	 */
	ListItemStyle getListitemstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ListItemWidget#getListitemstyle <em>Listitemstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listitemstyle</em>' containment reference.
	 * @see #getListitemstyle()
	 * @generated
	 */
	void setListitemstyle(ListItemStyle value);

} // ListItemWidget
