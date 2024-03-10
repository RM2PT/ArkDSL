/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blank Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.BlankWidget#getMin <em>Min</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.BlankWidget#getBlankstyle <em>Blankstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getBlankWidget()
 * @model
 * @generated
 */
public interface BlankWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getBlankWidget_Min()
	 * @model
	 * @generated
	 */
	String getMin();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.BlankWidget#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(String value);

	/**
	 * Returns the value of the '<em><b>Blankstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blankstyle</em>' containment reference.
	 * @see #setBlankstyle(BlankStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getBlankWidget_Blankstyle()
	 * @model containment="true"
	 * @generated
	 */
	BlankStyle getBlankstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.BlankWidget#getBlankstyle <em>Blankstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blankstyle</em>' containment reference.
	 * @see #getBlankstyle()
	 * @generated
	 */
	void setBlankstyle(BlankStyle value);

} // BlankWidget
