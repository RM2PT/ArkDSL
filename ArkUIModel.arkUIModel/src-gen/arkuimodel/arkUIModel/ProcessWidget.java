/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ProcessWidget#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProcessWidget#getTotal <em>Total</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProcessWidget#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProcessWidget#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProcessWidget#getProcessevent <em>Processevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ProcessWidget#getProcessstyle <em>Processstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProcessWidget()
 * @model
 * @generated
 */
public interface ProcessWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProcessWidget_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProcessWidget#getValue <em>Value</em>}' attribute.
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
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProcessWidget_Total()
	 * @model
	 * @generated
	 */
	String getTotal();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProcessWidget#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(String value);

	/**
	 * Returns the value of the '<em><b>Process Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Type</em>' attribute.
	 * @see #setProcessType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProcessWidget_ProcessType()
	 * @model
	 * @generated
	 */
	String getProcessType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProcessWidget#getProcessType <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Type</em>' attribute.
	 * @see #getProcessType()
	 * @generated
	 */
	void setProcessType(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProcessWidget_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProcessWidget#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Processevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processevent</em>' containment reference.
	 * @see #setProcessevent(ProcessEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProcessWidget_Processevent()
	 * @model containment="true"
	 * @generated
	 */
	ProcessEvent getProcessevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProcessWidget#getProcessevent <em>Processevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processevent</em>' containment reference.
	 * @see #getProcessevent()
	 * @generated
	 */
	void setProcessevent(ProcessEvent value);

	/**
	 * Returns the value of the '<em><b>Processstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processstyle</em>' containment reference.
	 * @see #setProcessstyle(ProcessStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getProcessWidget_Processstyle()
	 * @model containment="true"
	 * @generated
	 */
	ProcessStyle getProcessstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ProcessWidget#getProcessstyle <em>Processstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processstyle</em>' containment reference.
	 * @see #getProcessstyle()
	 * @generated
	 */
	void setProcessstyle(ProcessStyle value);

} // ProcessWidget
