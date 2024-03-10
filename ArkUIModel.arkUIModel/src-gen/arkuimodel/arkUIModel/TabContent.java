/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.TabContent#getTabBar <em>Tab Bar</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TabContent#getTabcontentstyle <em>Tabcontentstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabContent()
 * @model
 * @generated
 */
public interface TabContent extends Container {
	/**
	 * Returns the value of the '<em><b>Tab Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Bar</em>' containment reference.
	 * @see #setTabBar(TabItem)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabContent_TabBar()
	 * @model containment="true"
	 * @generated
	 */
	TabItem getTabBar();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TabContent#getTabBar <em>Tab Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Bar</em>' containment reference.
	 * @see #getTabBar()
	 * @generated
	 */
	void setTabBar(TabItem value);

	/**
	 * Returns the value of the '<em><b>Tabcontentstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabcontentstyle</em>' containment reference.
	 * @see #setTabcontentstyle(TabContentStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTabContent_Tabcontentstyle()
	 * @model containment="true"
	 * @generated
	 */
	TabContentStyle getTabcontentstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TabContent#getTabcontentstyle <em>Tabcontentstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabcontentstyle</em>' containment reference.
	 * @see #getTabcontentstyle()
	 * @generated
	 */
	void setTabcontentstyle(TabContentStyle value);

} // TabContent
