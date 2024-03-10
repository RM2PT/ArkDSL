/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.HttpOperation#getHttpType <em>Http Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.HttpOperation#getUrl <em>Url</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.HttpOperation#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getHttpOperation()
 * @model
 * @generated
 */
public interface HttpOperation extends SeviceOperation {
	/**
	 * Returns the value of the '<em><b>Http Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Type</em>' attribute.
	 * @see #setHttpType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getHttpOperation_HttpType()
	 * @model default=""
	 * @generated
	 */
	String getHttpType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.HttpOperation#getHttpType <em>Http Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Type</em>' attribute.
	 * @see #getHttpType()
	 * @generated
	 */
	void setHttpType(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getHttpOperation_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.HttpOperation#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res</em>' attribute.
	 * @see #setRes(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getHttpOperation_Res()
	 * @model
	 * @generated
	 */
	String getRes();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.HttpOperation#getRes <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res</em>' attribute.
	 * @see #getRes()
	 * @generated
	 */
	void setRes(String value);

} // HttpOperation
