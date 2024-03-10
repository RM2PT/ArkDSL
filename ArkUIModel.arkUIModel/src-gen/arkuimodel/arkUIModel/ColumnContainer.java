/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ColumnContainer#getJustifyContent <em>Justify Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ColumnContainer#getAlignItems <em>Align Items</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ColumnContainer#getSpace <em>Space</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ColumnContainer#getColumnevent <em>Columnevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ColumnContainer#getColumnstyle <em>Columnstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getColumnContainer()
 * @model
 * @generated
 */
public interface ColumnContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Justify Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify Content</em>' attribute.
	 * @see #setJustifyContent(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getColumnContainer_JustifyContent()
	 * @model
	 * @generated
	 */
	String getJustifyContent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ColumnContainer#getJustifyContent <em>Justify Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify Content</em>' attribute.
	 * @see #getJustifyContent()
	 * @generated
	 */
	void setJustifyContent(String value);

	/**
	 * Returns the value of the '<em><b>Align Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align Items</em>' attribute.
	 * @see #setAlignItems(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getColumnContainer_AlignItems()
	 * @model
	 * @generated
	 */
	String getAlignItems();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ColumnContainer#getAlignItems <em>Align Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align Items</em>' attribute.
	 * @see #getAlignItems()
	 * @generated
	 */
	void setAlignItems(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see #setSpace(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getColumnContainer_Space()
	 * @model
	 * @generated
	 */
	String getSpace();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ColumnContainer#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(String value);

	/**
	 * Returns the value of the '<em><b>Columnevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnevent</em>' containment reference.
	 * @see #setColumnevent(ColumnEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getColumnContainer_Columnevent()
	 * @model containment="true"
	 * @generated
	 */
	ColumnEvent getColumnevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ColumnContainer#getColumnevent <em>Columnevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnevent</em>' containment reference.
	 * @see #getColumnevent()
	 * @generated
	 */
	void setColumnevent(ColumnEvent value);

	/**
	 * Returns the value of the '<em><b>Columnstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnstyle</em>' containment reference.
	 * @see #setColumnstyle(ColumnStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getColumnContainer_Columnstyle()
	 * @model containment="true"
	 * @generated
	 */
	ColumnStyle getColumnstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ColumnContainer#getColumnstyle <em>Columnstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnstyle</em>' containment reference.
	 * @see #getColumnstyle()
	 * @generated
	 */
	void setColumnstyle(ColumnStyle value);

} // ColumnContainer
