/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.SearchWidget#getHint <em>Hint</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SearchWidget#getSearchbutton <em>Searchbutton</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SearchWidget#getIcon <em>Icon</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SearchWidget#getSearchevent <em>Searchevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SearchWidget#getSearchstyle <em>Searchstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SearchWidget#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SearchWidget#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSearchWidget()
 * @model
 * @generated
 */
public interface SearchWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSearchWidget_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SearchWidget#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Searchbutton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchbutton</em>' attribute.
	 * @see #setSearchbutton(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSearchWidget_Searchbutton()
	 * @model
	 * @generated
	 */
	String getSearchbutton();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SearchWidget#getSearchbutton <em>Searchbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Searchbutton</em>' attribute.
	 * @see #getSearchbutton()
	 * @generated
	 */
	void setSearchbutton(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSearchWidget_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SearchWidget#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Searchevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchevent</em>' containment reference.
	 * @see #setSearchevent(SearchEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSearchWidget_Searchevent()
	 * @model containment="true"
	 * @generated
	 */
	SearchEvent getSearchevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SearchWidget#getSearchevent <em>Searchevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Searchevent</em>' containment reference.
	 * @see #getSearchevent()
	 * @generated
	 */
	void setSearchevent(SearchEvent value);

	/**
	 * Returns the value of the '<em><b>Searchstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchstyle</em>' containment reference.
	 * @see #setSearchstyle(SearchStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSearchWidget_Searchstyle()
	 * @model containment="true"
	 * @generated
	 */
	SearchStyle getSearchstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SearchWidget#getSearchstyle <em>Searchstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Searchstyle</em>' containment reference.
	 * @see #getSearchstyle()
	 * @generated
	 */
	void setSearchstyle(SearchStyle value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSearchWidget_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SearchWidget#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSearchWidget_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SearchWidget#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

} // SearchWidget
