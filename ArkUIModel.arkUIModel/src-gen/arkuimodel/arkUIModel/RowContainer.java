/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.RowContainer#getSpace <em>Space</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.RowContainer#getAlignItems <em>Align Items</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.RowContainer#getJustifyContent <em>Justify Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.RowContainer#getRowevent <em>Rowevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.RowContainer#getRowstyle <em>Rowstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.RowContainer#getBindMenu <em>Bind Menu</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getRowContainer()
 * @model
 * @generated
 */
public interface RowContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see #setSpace(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getRowContainer_Space()
	 * @model
	 * @generated
	 */
	String getSpace();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.RowContainer#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(String value);

	/**
	 * Returns the value of the '<em><b>Align Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align Items</em>' attribute.
	 * @see #setAlignItems(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getRowContainer_AlignItems()
	 * @model
	 * @generated
	 */
	String getAlignItems();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.RowContainer#getAlignItems <em>Align Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align Items</em>' attribute.
	 * @see #getAlignItems()
	 * @generated
	 */
	void setAlignItems(String value);

	/**
	 * Returns the value of the '<em><b>Justify Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify Content</em>' attribute.
	 * @see #setJustifyContent(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getRowContainer_JustifyContent()
	 * @model
	 * @generated
	 */
	String getJustifyContent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.RowContainer#getJustifyContent <em>Justify Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify Content</em>' attribute.
	 * @see #getJustifyContent()
	 * @generated
	 */
	void setJustifyContent(String value);

	/**
	 * Returns the value of the '<em><b>Rowevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowevent</em>' containment reference.
	 * @see #setRowevent(RowEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getRowContainer_Rowevent()
	 * @model containment="true"
	 * @generated
	 */
	RowEvent getRowevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.RowContainer#getRowevent <em>Rowevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowevent</em>' containment reference.
	 * @see #getRowevent()
	 * @generated
	 */
	void setRowevent(RowEvent value);

	/**
	 * Returns the value of the '<em><b>Rowstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowstyle</em>' containment reference.
	 * @see #setRowstyle(RowStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getRowContainer_Rowstyle()
	 * @model containment="true"
	 * @generated
	 */
	RowStyle getRowstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.RowContainer#getRowstyle <em>Rowstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowstyle</em>' containment reference.
	 * @see #getRowstyle()
	 * @generated
	 */
	void setRowstyle(RowStyle value);

	/**
	 * Returns the value of the '<em><b>Bind Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Menu</em>' containment reference.
	 * @see #setBindMenu(ContainerItems)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getRowContainer_BindMenu()
	 * @model containment="true"
	 * @generated
	 */
	ContainerItems getBindMenu();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.RowContainer#getBindMenu <em>Bind Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Menu</em>' containment reference.
	 * @see #getBindMenu()
	 * @generated
	 */
	void setBindMenu(ContainerItems value);

} // RowContainer
