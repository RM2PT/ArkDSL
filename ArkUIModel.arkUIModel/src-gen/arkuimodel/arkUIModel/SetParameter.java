/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.SetParameter#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SetParameter#getParm <em>Parm</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSetParameter()
 * @model
 * @generated
 */
public interface SetParameter extends UIOperation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSetParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SetParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Parm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parm</em>' attribute.
	 * @see #setParm(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSetParameter_Parm()
	 * @model
	 * @generated
	 */
	String getParm();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SetParameter#getParm <em>Parm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parm</em>' attribute.
	 * @see #getParm()
	 * @generated
	 */
	void setParm(String value);

} // SetParameter
