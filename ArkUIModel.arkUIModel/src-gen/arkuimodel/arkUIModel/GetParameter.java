/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.GetParameter#getParm <em>Parm</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GetParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGetParameter()
 * @model
 * @generated
 */
public interface GetParameter extends UIOperation {

	/**
	 * Returns the value of the '<em><b>Parm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parm</em>' attribute.
	 * @see #setParm(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGetParameter_Parm()
	 * @model
	 * @generated
	 */
	String getParm();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GetParameter#getParm <em>Parm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parm</em>' attribute.
	 * @see #getParm()
	 * @generated
	 */
	void setParm(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGetParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GetParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);
} // GetParameter
