/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Item Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.GridItemContainer#getRowStart <em>Row Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridItemContainer#getRowEnd <em>Row End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridItemContainer#getColumnStart <em>Column Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridItemContainer#getColumnEnd <em>Column End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridItemContainer#getForceRebuild <em>Force Rebuild</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridItemContainer#getGriditemstyle <em>Griditemstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridItemContainer#getGriditemevent <em>Griditemevent</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridItemContainer()
 * @model
 * @generated
 */
public interface GridItemContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Row Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Start</em>' attribute.
	 * @see #setRowStart(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridItemContainer_RowStart()
	 * @model
	 * @generated
	 */
	String getRowStart();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridItemContainer#getRowStart <em>Row Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Start</em>' attribute.
	 * @see #getRowStart()
	 * @generated
	 */
	void setRowStart(String value);

	/**
	 * Returns the value of the '<em><b>Row End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row End</em>' attribute.
	 * @see #setRowEnd(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridItemContainer_RowEnd()
	 * @model
	 * @generated
	 */
	String getRowEnd();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridItemContainer#getRowEnd <em>Row End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row End</em>' attribute.
	 * @see #getRowEnd()
	 * @generated
	 */
	void setRowEnd(String value);

	/**
	 * Returns the value of the '<em><b>Column Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Start</em>' attribute.
	 * @see #setColumnStart(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridItemContainer_ColumnStart()
	 * @model
	 * @generated
	 */
	String getColumnStart();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridItemContainer#getColumnStart <em>Column Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Start</em>' attribute.
	 * @see #getColumnStart()
	 * @generated
	 */
	void setColumnStart(String value);

	/**
	 * Returns the value of the '<em><b>Column End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column End</em>' attribute.
	 * @see #setColumnEnd(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridItemContainer_ColumnEnd()
	 * @model
	 * @generated
	 */
	String getColumnEnd();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridItemContainer#getColumnEnd <em>Column End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column End</em>' attribute.
	 * @see #getColumnEnd()
	 * @generated
	 */
	void setColumnEnd(String value);

	/**
	 * Returns the value of the '<em><b>Force Rebuild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Rebuild</em>' attribute.
	 * @see #setForceRebuild(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridItemContainer_ForceRebuild()
	 * @model
	 * @generated
	 */
	String getForceRebuild();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridItemContainer#getForceRebuild <em>Force Rebuild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Rebuild</em>' attribute.
	 * @see #getForceRebuild()
	 * @generated
	 */
	void setForceRebuild(String value);

	/**
	 * Returns the value of the '<em><b>Griditemstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Griditemstyle</em>' containment reference.
	 * @see #setGriditemstyle(GridItemStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridItemContainer_Griditemstyle()
	 * @model containment="true"
	 * @generated
	 */
	GridItemStyle getGriditemstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridItemContainer#getGriditemstyle <em>Griditemstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Griditemstyle</em>' containment reference.
	 * @see #getGriditemstyle()
	 * @generated
	 */
	void setGriditemstyle(GridItemStyle value);

	/**
	 * Returns the value of the '<em><b>Griditemevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Griditemevent</em>' containment reference.
	 * @see #setGriditemevent(GridItemEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridItemContainer_Griditemevent()
	 * @model containment="true"
	 * @generated
	 */
	GridItemEvent getGriditemevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridItemContainer#getGriditemevent <em>Griditemevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Griditemevent</em>' containment reference.
	 * @see #getGriditemevent()
	 * @generated
	 */
	void setGriditemevent(GridItemEvent value);

} // GridItemContainer
