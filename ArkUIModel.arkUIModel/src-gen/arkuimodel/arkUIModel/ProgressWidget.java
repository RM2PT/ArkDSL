/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ProgressWidget#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProgressWidget#getTotal <em>Total</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProgressWidget#getProgressType <em>Progress Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProgressWidget#getShowType <em>Show Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProgressWidget#getProgressevent <em>Progressevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProgressWidget#getProgressstyle <em>Progressstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProgressWidget()
 * @model
 * @generated
 */
public interface ProgressWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProgressWidget_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProgressWidget#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProgressWidget_Total()
	 * @model
	 * @generated
	 */
	String getTotal();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProgressWidget#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(String value);

	/**
	 * Returns the value of the '<em><b>Progress Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Type</em>' attribute.
	 * @see #setProgressType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProgressWidget_ProgressType()
	 * @model
	 * @generated
	 */
	String getProgressType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProgressWidget#getProgressType <em>Progress Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Type</em>' attribute.
	 * @see #getProgressType()
	 * @generated
	 */
	void setProgressType(String value);

	/**
	 * Returns the value of the '<em><b>Show Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Type</em>' attribute.
	 * @see #setShowType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProgressWidget_ShowType()
	 * @model
	 * @generated
	 */
	String getShowType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProgressWidget#getShowType <em>Show Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Type</em>' attribute.
	 * @see #getShowType()
	 * @generated
	 */
	void setShowType(String value);

	/**
	 * Returns the value of the '<em><b>Progressevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progressevent</em>' containment reference.
	 * @see #setProgressevent(ProgressEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProgressWidget_Progressevent()
	 * @model containment="true"
	 * @generated
	 */
	ProgressEvent getProgressevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProgressWidget#getProgressevent <em>Progressevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progressevent</em>' containment reference.
	 * @see #getProgressevent()
	 * @generated
	 */
	void setProgressevent(ProgressEvent value);

	/**
	 * Returns the value of the '<em><b>Progressstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progressstyle</em>' containment reference.
	 * @see #setProgressstyle(ProgressStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProgressWidget_Progressstyle()
	 * @model containment="true"
	 * @generated
	 */
	ProgressStyle getProgressstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProgressWidget#getProgressstyle <em>Progressstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progressstyle</em>' containment reference.
	 * @see #getProgressstyle()
	 * @generated
	 */
	void setProgressstyle(ProgressStyle value);

} // ProgressWidget
