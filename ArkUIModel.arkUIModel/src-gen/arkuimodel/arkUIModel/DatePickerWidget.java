/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Picker Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.DatePickerWidget#getSelected <em>Selected</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.DatePickerWidget#getStart <em>Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.DatePickerWidget#getEnd <em>End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.DatePickerWidget#getDatepickerevent <em>Datepickerevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.DatePickerWidget#getDatepickerstyle <em>Datepickerstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDatePickerWidget()
 * @model
 * @generated
 */
public interface DatePickerWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDatePickerWidget_Selected()
	 * @model
	 * @generated
	 */
	String getSelected();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DatePickerWidget#getSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDatePickerWidget_Start()
	 * @model
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DatePickerWidget#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDatePickerWidget_End()
	 * @model
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DatePickerWidget#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Datepickerevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datepickerevent</em>' containment reference.
	 * @see #setDatepickerevent(DatePickerEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDatePickerWidget_Datepickerevent()
	 * @model containment="true"
	 * @generated
	 */
	DatePickerEvent getDatepickerevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DatePickerWidget#getDatepickerevent <em>Datepickerevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datepickerevent</em>' containment reference.
	 * @see #getDatepickerevent()
	 * @generated
	 */
	void setDatepickerevent(DatePickerEvent value);

	/**
	 * Returns the value of the '<em><b>Datepickerstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datepickerstyle</em>' containment reference.
	 * @see #setDatepickerstyle(DatePickerStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDatePickerWidget_Datepickerstyle()
	 * @model containment="true"
	 * @generated
	 */
	DatePickerStyle getDatepickerstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DatePickerWidget#getDatepickerstyle <em>Datepickerstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datepickerstyle</em>' containment reference.
	 * @see #getDatepickerstyle()
	 * @generated
	 */
	void setDatepickerstyle(DatePickerStyle value);

} // DatePickerWidget
