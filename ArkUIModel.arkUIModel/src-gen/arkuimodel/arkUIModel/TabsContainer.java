/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabs Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.TabsContainer#getBarPosition <em>Bar Position</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TabsContainer#getIndex <em>Index</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TabsContainer#getTabs <em>Tabs</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TabsContainer#getTabsevent <em>Tabsevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TabsContainer#getTabsstyle <em>Tabsstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabsContainer()
 * @model
 * @generated
 */
public interface TabsContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Bar Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Position</em>' attribute.
	 * @see #setBarPosition(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabsContainer_BarPosition()
	 * @model
	 * @generated
	 */
	String getBarPosition();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TabsContainer#getBarPosition <em>Bar Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Position</em>' attribute.
	 * @see #getBarPosition()
	 * @generated
	 */
	void setBarPosition(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabsContainer_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TabsContainer#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.TabContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabsContainer_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TabContent> getTabs();

	/**
	 * Returns the value of the '<em><b>Tabsevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabsevent</em>' containment reference.
	 * @see #setTabsevent(TabsEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabsContainer_Tabsevent()
	 * @model containment="true"
	 * @generated
	 */
	TabsEvent getTabsevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TabsContainer#getTabsevent <em>Tabsevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabsevent</em>' containment reference.
	 * @see #getTabsevent()
	 * @generated
	 */
	void setTabsevent(TabsEvent value);

	/**
	 * Returns the value of the '<em><b>Tabsstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabsstyle</em>' containment reference.
	 * @see #setTabsstyle(TabsStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabsContainer_Tabsstyle()
	 * @model containment="true"
	 * @generated
	 */
	TabsStyle getTabsstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TabsContainer#getTabsstyle <em>Tabsstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabsstyle</em>' containment reference.
	 * @see #getTabsstyle()
	 * @generated
	 */
	void setTabsstyle(TabsStyle value);

} // TabsContainer
