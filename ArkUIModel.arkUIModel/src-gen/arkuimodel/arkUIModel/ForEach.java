/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ForEach#getItem <em>Item</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ForEach#getExpression <em>Expression</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ForEach#getArray <em>Array</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ForEach#getArrayType <em>Array Type</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' attribute.
	 * @see #setItem(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getForEach_Item()
	 * @model
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ForEach#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getForEach_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ForEach#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getForEach_Array()
	 * @model
	 * @generated
	 */
	String getArray();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ForEach#getArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(String value);

	/**
	 * Returns the value of the '<em><b>Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Type</em>' attribute.
	 * @see #setArrayType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getForEach_ArrayType()
	 * @model
	 * @generated
	 */
	String getArrayType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ForEach#getArrayType <em>Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Type</em>' attribute.
	 * @see #getArrayType()
	 * @generated
	 */
	void setArrayType(String value);

} // ForEach
