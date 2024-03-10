/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ButtonWidget#getLabel <em>Label</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ButtonWidget#getStateEffect <em>State Effect</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ButtonWidget#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ButtonWidget#getButtonevent <em>Buttonevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ButtonWidget#getButtonstyle <em>Buttonstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getButtonWidget()
 * @model
 * @generated
 */
public interface ButtonWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getButtonWidget_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ButtonWidget#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>State Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Effect</em>' attribute.
	 * @see #setStateEffect(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getButtonWidget_StateEffect()
	 * @model
	 * @generated
	 */
	String getStateEffect();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ButtonWidget#getStateEffect <em>State Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Effect</em>' attribute.
	 * @see #getStateEffect()
	 * @generated
	 */
	void setStateEffect(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getButtonWidget_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ButtonWidget#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Buttonevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttonevent</em>' containment reference.
	 * @see #setButtonevent(ButtonEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getButtonWidget_Buttonevent()
	 * @model containment="true"
	 * @generated
	 */
	ButtonEvent getButtonevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ButtonWidget#getButtonevent <em>Buttonevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buttonevent</em>' containment reference.
	 * @see #getButtonevent()
	 * @generated
	 */
	void setButtonevent(ButtonEvent value);

	/**
	 * Returns the value of the '<em><b>Buttonstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttonstyle</em>' containment reference.
	 * @see #setButtonstyle(ButtonStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getButtonWidget_Buttonstyle()
	 * @model containment="true"
	 * @generated
	 */
	ButtonStyle getButtonstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ButtonWidget#getButtonstyle <em>Buttonstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buttonstyle</em>' containment reference.
	 * @see #getButtonstyle()
	 * @generated
	 */
	void setButtonstyle(ButtonStyle value);

} // ButtonWidget
