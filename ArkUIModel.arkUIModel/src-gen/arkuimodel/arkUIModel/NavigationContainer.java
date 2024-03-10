/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.NavigationContainer#getToolbar <em>Toolbar</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.NavigationContainer#getMenu <em>Menu</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.NavigationContainer#getNavigationevent <em>Navigationevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.NavigationContainer#getNavigationstyle <em>Navigationstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.NavigationContainer#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getNavigationContainer()
 * @model
 * @generated
 */
public interface NavigationContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Toolbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolbar</em>' containment reference.
	 * @see #setToolbar(ContainerItems)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getNavigationContainer_Toolbar()
	 * @model containment="true"
	 * @generated
	 */
	ContainerItems getToolbar();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.NavigationContainer#getToolbar <em>Toolbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toolbar</em>' containment reference.
	 * @see #getToolbar()
	 * @generated
	 */
	void setToolbar(ContainerItems value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference.
	 * @see #setMenu(ContainerItems)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getNavigationContainer_Menu()
	 * @model containment="true"
	 * @generated
	 */
	ContainerItems getMenu();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.NavigationContainer#getMenu <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' containment reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(ContainerItems value);

	/**
	 * Returns the value of the '<em><b>Navigationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigationevent</em>' containment reference.
	 * @see #setNavigationevent(NavigationEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getNavigationContainer_Navigationevent()
	 * @model containment="true"
	 * @generated
	 */
	NavigationEvent getNavigationevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.NavigationContainer#getNavigationevent <em>Navigationevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigationevent</em>' containment reference.
	 * @see #getNavigationevent()
	 * @generated
	 */
	void setNavigationevent(NavigationEvent value);

	/**
	 * Returns the value of the '<em><b>Navigationstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigationstyle</em>' containment reference.
	 * @see #setNavigationstyle(NavigationStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getNavigationContainer_Navigationstyle()
	 * @model containment="true"
	 * @generated
	 */
	NavigationStyle getNavigationstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.NavigationContainer#getNavigationstyle <em>Navigationstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigationstyle</em>' containment reference.
	 * @see #getNavigationstyle()
	 * @generated
	 */
	void setNavigationstyle(NavigationStyle value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(ContainerItems)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getNavigationContainer_Title()
	 * @model containment="true"
	 * @generated
	 */
	ContainerItems getTitle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.NavigationContainer#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(ContainerItems value);

} // NavigationContainer
