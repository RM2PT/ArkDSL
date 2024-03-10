/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.PrimitiveOperation#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PrimitiveOperation#getContains <em>Contains</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PrimitiveOperation#getReturntype <em>Returntype</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPrimitiveOperation()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPrimitiveOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PrimitiveOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPrimitiveOperation_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getContains();

	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' containment reference.
	 * @see #setReturntype(Parameter)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPrimitiveOperation_Returntype()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getReturntype();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PrimitiveOperation#getReturntype <em>Returntype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' containment reference.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(Parameter value);

} // PrimitiveOperation
