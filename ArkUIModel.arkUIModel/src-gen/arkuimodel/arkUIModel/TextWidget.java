/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.TextWidget#getContent <em>Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TextWidget#getTextevent <em>Textevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TextWidget#getTextstyle <em>Textstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextWidget()
 * @model
 * @generated
 */
public interface TextWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextWidget_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextWidget#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Textevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textevent</em>' containment reference.
	 * @see #setTextevent(TextEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextWidget_Textevent()
	 * @model containment="true"
	 * @generated
	 */
	TextEvent getTextevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextWidget#getTextevent <em>Textevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textevent</em>' containment reference.
	 * @see #getTextevent()
	 * @generated
	 */
	void setTextevent(TextEvent value);

	/**
	 * Returns the value of the '<em><b>Textstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textstyle</em>' containment reference.
	 * @see #setTextstyle(TextStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTextWidget_Textstyle()
	 * @model containment="true"
	 * @generated
	 */
	TextStyle getTextstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TextWidget#getTextstyle <em>Textstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textstyle</em>' containment reference.
	 * @see #getTextstyle()
	 * @generated
	 */
	void setTextstyle(TextStyle value);

} // TextWidget
