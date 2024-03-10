/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.Expression#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Expression#getParameter <em>Parameter</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Expression#getCondition <em>Condition</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Expression#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Expression#getUnion <em>Union</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Expression#getExpressText <em>Express Text</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getExpression_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Expression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getExpression_Parameter()
	 * @model
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Expression#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getExpression_Condition()
	 * @model default=""
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Expression#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getExpression_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Expression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Union</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link arkuimodel.arkUIModel.UnionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' attribute.
	 * @see arkuimodel.arkUIModel.UnionType
	 * @see #setUnion(UnionType)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getExpression_Union()
	 * @model default=""
	 * @generated
	 */
	UnionType getUnion();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Expression#getUnion <em>Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Union</em>' attribute.
	 * @see arkuimodel.arkUIModel.UnionType
	 * @see #getUnion()
	 * @generated
	 */
	void setUnion(UnionType value);

	/**
	 * Returns the value of the '<em><b>Express Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Express Text</em>' attribute.
	 * @see #setExpressText(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getExpression_ExpressText()
	 * @model
	 * @generated
	 */
	String getExpressText();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Expression#getExpressText <em>Express Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Express Text</em>' attribute.
	 * @see #getExpressText()
	 * @generated
	 */
	void setExpressText(String value);

} // Expression
