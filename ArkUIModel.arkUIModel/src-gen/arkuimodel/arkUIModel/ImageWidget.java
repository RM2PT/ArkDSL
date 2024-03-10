/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ImageWidget#getSrc <em>Src</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ImageWidget#getImageevent <em>Imageevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ImageWidget#getImagestyle <em>Imagestyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageWidget()
 * @model
 * @generated
 */
public interface ImageWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageWidget_Src()
	 * @model
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ImageWidget#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Imageevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageevent</em>' containment reference.
	 * @see #setImageevent(ImageEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageWidget_Imageevent()
	 * @model containment="true"
	 * @generated
	 */
	ImageEvent getImageevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ImageWidget#getImageevent <em>Imageevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imageevent</em>' containment reference.
	 * @see #getImageevent()
	 * @generated
	 */
	void setImageevent(ImageEvent value);

	/**
	 * Returns the value of the '<em><b>Imagestyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagestyle</em>' containment reference.
	 * @see #setImagestyle(ImageStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageWidget_Imagestyle()
	 * @model containment="true"
	 * @generated
	 */
	ImageStyle getImagestyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ImageWidget#getImagestyle <em>Imagestyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagestyle</em>' containment reference.
	 * @see #getImagestyle()
	 * @generated
	 */
	void setImagestyle(ImageStyle value);

} // ImageWidget
