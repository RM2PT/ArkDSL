/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ImageEvent#getOnComplete <em>On Complete</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ImageEvent#getOnError <em>On Error</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ImageEvent#getOnFinish <em>On Finish</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageEvent()
 * @model
 * @generated
 */
public interface ImageEvent extends Event {
	/**
	 * Returns the value of the '<em><b>On Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Complete</em>' attribute.
	 * @see #setOnComplete(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageEvent_OnComplete()
	 * @model
	 * @generated
	 */
	String getOnComplete();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ImageEvent#getOnComplete <em>On Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Complete</em>' attribute.
	 * @see #getOnComplete()
	 * @generated
	 */
	void setOnComplete(String value);

	/**
	 * Returns the value of the '<em><b>On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Error</em>' attribute.
	 * @see #setOnError(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageEvent_OnError()
	 * @model
	 * @generated
	 */
	String getOnError();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ImageEvent#getOnError <em>On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Error</em>' attribute.
	 * @see #getOnError()
	 * @generated
	 */
	void setOnError(String value);

	/**
	 * Returns the value of the '<em><b>On Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Finish</em>' attribute.
	 * @see #setOnFinish(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageEvent_OnFinish()
	 * @model
	 * @generated
	 */
	String getOnFinish();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ImageEvent#getOnFinish <em>On Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Finish</em>' attribute.
	 * @see #getOnFinish()
	 * @generated
	 */
	void setOnFinish(String value);

} // ImageEvent
