/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Picker Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.TimePickerWidget#getSelected <em>Selected</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TimePickerWidget#getStart <em>Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TimePickerWidget#getEnd <em>End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TimePickerWidget#getTimepickerevent <em>Timepickerevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.TimePickerWidget#getTimepickerstyle <em>Timepickerstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTimePickerWidget()
 * @model
 * @generated
 */
public interface TimePickerWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTimePickerWidget_Selected()
	 * @model
	 * @generated
	 */
	String getSelected();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TimePickerWidget#getSelected <em>Selected</em>}' attribute.
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
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTimePickerWidget_Start()
	 * @model
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TimePickerWidget#getStart <em>Start</em>}' attribute.
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
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTimePickerWidget_End()
	 * @model
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TimePickerWidget#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Timepickerevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timepickerevent</em>' containment reference.
	 * @see #setTimepickerevent(TimePickerEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTimePickerWidget_Timepickerevent()
	 * @model containment="true"
	 * @generated
	 */
	TimePickerEvent getTimepickerevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TimePickerWidget#getTimepickerevent <em>Timepickerevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timepickerevent</em>' containment reference.
	 * @see #getTimepickerevent()
	 * @generated
	 */
	void setTimepickerevent(TimePickerEvent value);

	/**
	 * Returns the value of the '<em><b>Timepickerstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timepickerstyle</em>' containment reference.
	 * @see #setTimepickerstyle(TimePickerStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTimePickerWidget_Timepickerstyle()
	 * @model containment="true"
	 * @generated
	 */
	TimePickerStyle getTimepickerstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.TimePickerWidget#getTimepickerstyle <em>Timepickerstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timepickerstyle</em>' containment reference.
	 * @see #getTimepickerstyle()
	 * @generated
	 */
	void setTimepickerstyle(TimePickerStyle value);

} // TimePickerWidget
