/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flex Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.FlexContainer#getDirection <em>Direction</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlexContainer#getWrap <em>Wrap</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlexContainer#getJustifyContent <em>Justify Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlexContainer#getAlignItems <em>Align Items</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlexContainer#getAlignContent <em>Align Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlexContainer#getFlexevent <em>Flexevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlexContainer#getFlexstyle <em>Flexstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlexContainer()
 * @model
 * @generated
 */
public interface FlexContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlexContainer_Direction()
	 * @model
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlexContainer#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Wrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap</em>' attribute.
	 * @see #setWrap(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlexContainer_Wrap()
	 * @model
	 * @generated
	 */
	String getWrap();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlexContainer#getWrap <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap</em>' attribute.
	 * @see #getWrap()
	 * @generated
	 */
	void setWrap(String value);

	/**
	 * Returns the value of the '<em><b>Justify Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify Content</em>' attribute.
	 * @see #setJustifyContent(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlexContainer_JustifyContent()
	 * @model
	 * @generated
	 */
	String getJustifyContent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlexContainer#getJustifyContent <em>Justify Content</em>}' attribute.
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
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlexContainer_AlignItems()
	 * @model
	 * @generated
	 */
	String getAlignItems();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlexContainer#getAlignItems <em>Align Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align Items</em>' attribute.
	 * @see #getAlignItems()
	 * @generated
	 */
	void setAlignItems(String value);

	/**
	 * Returns the value of the '<em><b>Align Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align Content</em>' attribute.
	 * @see #setAlignContent(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlexContainer_AlignContent()
	 * @model
	 * @generated
	 */
	String getAlignContent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlexContainer#getAlignContent <em>Align Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align Content</em>' attribute.
	 * @see #getAlignContent()
	 * @generated
	 */
	void setAlignContent(String value);

	/**
	 * Returns the value of the '<em><b>Flexevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flexevent</em>' containment reference.
	 * @see #setFlexevent(FlexEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlexContainer_Flexevent()
	 * @model containment="true"
	 * @generated
	 */
	FlexEvent getFlexevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlexContainer#getFlexevent <em>Flexevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flexevent</em>' containment reference.
	 * @see #getFlexevent()
	 * @generated
	 */
	void setFlexevent(FlexEvent value);

	/**
	 * Returns the value of the '<em><b>Flexstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flexstyle</em>' containment reference.
	 * @see #setFlexstyle(FlexStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlexContainer_Flexstyle()
	 * @model containment="true"
	 * @generated
	 */
	FlexStyle getFlexstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlexContainer#getFlexstyle <em>Flexstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flexstyle</em>' containment reference.
	 * @see #getFlexstyle()
	 * @generated
	 */
	void setFlexstyle(FlexStyle value);

} // FlexContainer
