/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.LineStyle#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.LineStyle#getEndPoint <em>End Point</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getLineStyle()
 * @model
 * @generated
 */
public interface LineStyle extends StyleClass {
	/**
	 * Returns the value of the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point</em>' attribute.
	 * @see #setStartPoint(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getLineStyle_StartPoint()
	 * @model
	 * @generated
	 */
	String getStartPoint();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.LineStyle#getStartPoint <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point</em>' attribute.
	 * @see #getStartPoint()
	 * @generated
	 */
	void setStartPoint(String value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getLineStyle_EndPoint()
	 * @model
	 * @generated
	 */
	String getEndPoint();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.LineStyle#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(String value);

} // LineStyle
