/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Picker Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.TextPickerWidget#getTextpickerevent <em>Textpickerevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TextPickerWidget#getTextpickerstyle <em>Textpickerstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextPickerWidget()
 * @model
 * @generated
 */
public interface TextPickerWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Textpickerevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textpickerevent</em>' containment reference.
	 * @see #setTextpickerevent(TextPickerEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextPickerWidget_Textpickerevent()
	 * @model containment="true"
	 * @generated
	 */
	TextPickerEvent getTextpickerevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextPickerWidget#getTextpickerevent <em>Textpickerevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textpickerevent</em>' containment reference.
	 * @see #getTextpickerevent()
	 * @generated
	 */
	void setTextpickerevent(TextPickerEvent value);

	/**
	 * Returns the value of the '<em><b>Textpickerstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textpickerstyle</em>' containment reference.
	 * @see #setTextpickerstyle(TextPickerStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextPickerWidget_Textpickerstyle()
	 * @model containment="true"
	 * @generated
	 */
	TextPickerStyle getTextpickerstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextPickerWidget#getTextpickerstyle <em>Textpickerstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textpickerstyle</em>' containment reference.
	 * @see #getTextpickerstyle()
	 * @generated
	 */
	void setTextpickerstyle(TextPickerStyle value);

} // TextPickerWidget
