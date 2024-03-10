/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.GridContainer#getColumnsTemplate <em>Columns Template</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridContainer#getRowsTemplate <em>Rows Template</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridContainer#getColumnsGap <em>Columns Gap</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridContainer#getRowsGap <em>Rows Gap</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridContainer#getGridevent <em>Gridevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridContainer#getGridstyle <em>Gridstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridContainer#getGriditemcontainer <em>Griditemcontainer</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GridContainer#getCachedCount <em>Cached Count</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer()
 * @model
 * @generated
 */
public interface GridContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Columns Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns Template</em>' attribute.
	 * @see #setColumnsTemplate(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer_ColumnsTemplate()
	 * @model
	 * @generated
	 */
	String getColumnsTemplate();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridContainer#getColumnsTemplate <em>Columns Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns Template</em>' attribute.
	 * @see #getColumnsTemplate()
	 * @generated
	 */
	void setColumnsTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Rows Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows Template</em>' attribute.
	 * @see #setRowsTemplate(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer_RowsTemplate()
	 * @model
	 * @generated
	 */
	String getRowsTemplate();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridContainer#getRowsTemplate <em>Rows Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows Template</em>' attribute.
	 * @see #getRowsTemplate()
	 * @generated
	 */
	void setRowsTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Columns Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns Gap</em>' attribute.
	 * @see #setColumnsGap(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer_ColumnsGap()
	 * @model
	 * @generated
	 */
	String getColumnsGap();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridContainer#getColumnsGap <em>Columns Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns Gap</em>' attribute.
	 * @see #getColumnsGap()
	 * @generated
	 */
	void setColumnsGap(String value);

	/**
	 * Returns the value of the '<em><b>Rows Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows Gap</em>' attribute.
	 * @see #setRowsGap(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer_RowsGap()
	 * @model
	 * @generated
	 */
	String getRowsGap();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridContainer#getRowsGap <em>Rows Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows Gap</em>' attribute.
	 * @see #getRowsGap()
	 * @generated
	 */
	void setRowsGap(String value);

	/**
	 * Returns the value of the '<em><b>Gridevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridevent</em>' containment reference.
	 * @see #setGridevent(GridEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer_Gridevent()
	 * @model containment="true"
	 * @generated
	 */
	GridEvent getGridevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridContainer#getGridevent <em>Gridevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gridevent</em>' containment reference.
	 * @see #getGridevent()
	 * @generated
	 */
	void setGridevent(GridEvent value);

	/**
	 * Returns the value of the '<em><b>Gridstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridstyle</em>' containment reference.
	 * @see #setGridstyle(GridStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer_Gridstyle()
	 * @model containment="true"
	 * @generated
	 */
	GridStyle getGridstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridContainer#getGridstyle <em>Gridstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gridstyle</em>' containment reference.
	 * @see #getGridstyle()
	 * @generated
	 */
	void setGridstyle(GridStyle value);

	/**
	 * Returns the value of the '<em><b>Griditemcontainer</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.GridItemContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Griditemcontainer</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer_Griditemcontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<GridItemContainer> getGriditemcontainer();

	/**
	 * Returns the value of the '<em><b>Cached Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Count</em>' attribute.
	 * @see #setCachedCount(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGridContainer_CachedCount()
	 * @model
	 * @generated
	 */
	String getCachedCount();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GridContainer#getCachedCount <em>Cached Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Count</em>' attribute.
	 * @see #getCachedCount()
	 * @generated
	 */
	void setCachedCount(String value);

} // GridContainer
