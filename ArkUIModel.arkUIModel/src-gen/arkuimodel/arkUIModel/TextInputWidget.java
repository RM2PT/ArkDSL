/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.TextInputWidget#getText <em>Text</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TextInputWidget#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TextInputWidget#getController <em>Controller</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TextInputWidget#getTextinputevent <em>Textinputevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TextInputWidget#getTextinputstyle <em>Textinputstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextInputWidget()
 * @model
 * @generated
 */
public interface TextInputWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextInputWidget_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextInputWidget#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextInputWidget_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextInputWidget#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see #setController(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextInputWidget_Controller()
	 * @model
	 * @generated
	 */
	String getController();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextInputWidget#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see #getController()
	 * @generated
	 */
	void setController(String value);

	/**
	 * Returns the value of the '<em><b>Textinputevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textinputevent</em>' containment reference.
	 * @see #setTextinputevent(TextInputEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextInputWidget_Textinputevent()
	 * @model containment="true"
	 * @generated
	 */
	TextInputEvent getTextinputevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextInputWidget#getTextinputevent <em>Textinputevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textinputevent</em>' containment reference.
	 * @see #getTextinputevent()
	 * @generated
	 */
	void setTextinputevent(TextInputEvent value);

	/**
	 * Returns the value of the '<em><b>Textinputstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textinputstyle</em>' containment reference.
	 * @see #setTextinputstyle(TextInputStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextInputWidget_Textinputstyle()
	 * @model containment="true"
	 * @generated
	 */
	TextInputStyle getTextinputstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextInputWidget#getTextinputstyle <em>Textinputstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textinputstyle</em>' containment reference.
	 * @see #getTextinputstyle()
	 * @generated
	 */
	void setTextinputstyle(TextInputStyle value);

} // TextInputWidget
