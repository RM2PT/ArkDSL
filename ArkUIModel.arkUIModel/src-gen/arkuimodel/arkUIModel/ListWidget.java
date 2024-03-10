/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ListWidget#getInitialIndex <em>Initial Index</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ListWidget#getSpace <em>Space</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ListWidget#getScroller <em>Scroller</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ListWidget#getListitemwidget <em>Listitemwidget</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ListWidget#getListevent <em>Listevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ListWidget#getListstyle <em>Liststyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListWidget()
 * @model
 * @generated
 */
public interface ListWidget extends Container {
	/**
	 * Returns the value of the '<em><b>Initial Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Index</em>' attribute.
	 * @see #setInitialIndex(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListWidget_InitialIndex()
	 * @model
	 * @generated
	 */
	String getInitialIndex();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ListWidget#getInitialIndex <em>Initial Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Index</em>' attribute.
	 * @see #getInitialIndex()
	 * @generated
	 */
	void setInitialIndex(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see #setSpace(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListWidget_Space()
	 * @model
	 * @generated
	 */
	String getSpace();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ListWidget#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(String value);

	/**
	 * Returns the value of the '<em><b>Scroller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scroller</em>' attribute.
	 * @see #setScroller(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListWidget_Scroller()
	 * @model
	 * @generated
	 */
	String getScroller();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ListWidget#getScroller <em>Scroller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scroller</em>' attribute.
	 * @see #getScroller()
	 * @generated
	 */
	void setScroller(String value);

	/**
	 * Returns the value of the '<em><b>Listitemwidget</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.ListItemWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitemwidget</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListWidget_Listitemwidget()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItemWidget> getListitemwidget();

	/**
	 * Returns the value of the '<em><b>Listevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listevent</em>' containment reference.
	 * @see #setListevent(ListEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListWidget_Listevent()
	 * @model containment="true"
	 * @generated
	 */
	ListEvent getListevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ListWidget#getListevent <em>Listevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listevent</em>' containment reference.
	 * @see #getListevent()
	 * @generated
	 */
	void setListevent(ListEvent value);

	/**
	 * Returns the value of the '<em><b>Liststyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liststyle</em>' containment reference.
	 * @see #setListstyle(ListStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getListWidget_Liststyle()
	 * @model containment="true"
	 * @generated
	 */
	ListStyle getListstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ListWidget#getListstyle <em>Liststyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liststyle</em>' containment reference.
	 * @see #getListstyle()
	 * @generated
	 */
	void setListstyle(ListStyle value);

} // ListWidget
