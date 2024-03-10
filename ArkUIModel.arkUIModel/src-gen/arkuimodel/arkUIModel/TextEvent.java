/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.TextEvent#getOnFocus <em>On Focus</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TextEvent#getOnBlur <em>On Blur</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextEvent()
 * @model
 * @generated
 */
public interface TextEvent extends Event {
	/**
	 * Returns the value of the '<em><b>On Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Focus</em>' attribute.
	 * @see #setOnFocus(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextEvent_OnFocus()
	 * @model
	 * @generated
	 */
	String getOnFocus();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextEvent#getOnFocus <em>On Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Focus</em>' attribute.
	 * @see #getOnFocus()
	 * @generated
	 */
	void setOnFocus(String value);

	/**
	 * Returns the value of the '<em><b>On Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Blur</em>' attribute.
	 * @see #setOnBlur(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextEvent_OnBlur()
	 * @model
	 * @generated
	 */
	String getOnBlur();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextEvent#getOnBlur <em>On Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Blur</em>' attribute.
	 * @see #getOnBlur()
	 * @generated
	 */
	void setOnBlur(String value);

} // TextEvent
