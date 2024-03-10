/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Parameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Parameter#getPType <em>PType</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Parameter#getAssign <em>Assign</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Parameter#isConst <em>Const</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Parameter#getState <em>State</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeCS)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeCS getType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Parameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeCS value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link arkuimodel.arkUIModel.PType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see arkuimodel.arkUIModel.PType
	 * @see #setParameterType(PType)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter_ParameterType()
	 * @model default=""
	 * @generated
	 */
	PType getParameterType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Parameter#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see arkuimodel.arkUIModel.PType
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(PType value);

	/**
	 * Returns the value of the '<em><b>PType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PType</em>' attribute.
	 * @see #setPType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter_PType()
	 * @model
	 * @generated
	 */
	String getPType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Parameter#getPType <em>PType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PType</em>' attribute.
	 * @see #getPType()
	 * @generated
	 */
	void setPType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign</em>' attribute.
	 * @see #setAssign(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter_Assign()
	 * @model
	 * @generated
	 */
	String getAssign();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Parameter#getAssign <em>Assign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign</em>' attribute.
	 * @see #getAssign()
	 * @generated
	 */
	void setAssign(String value);

	/**
	 * Returns the value of the '<em><b>Const</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' attribute.
	 * @see #setConst(boolean)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter_Const()
	 * @model default="false"
	 * @generated
	 */
	boolean isConst();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Parameter#isConst <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' attribute.
	 * @see #isConst()
	 * @generated
	 */
	void setConst(boolean value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getParameter_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Parameter#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // Parameter
