/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.Function#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Function#getOperation <em>Operation</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Function#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Function#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Type</em>' attribute.
	 * @see #setFunctionType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFunction_FunctionType()
	 * @model
	 * @generated
	 */
	String getFunctionType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Function#getFunctionType <em>Function Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Type</em>' attribute.
	 * @see #getFunctionType()
	 * @generated
	 */
	void setFunctionType(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(PrimitiveOperation)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFunction_Operation()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveOperation getOperation();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Function#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(PrimitiveOperation value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference.
	 * @see #setWorkflow(WorkFlow)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFunction_Workflow()
	 * @model
	 * @generated
	 */
	WorkFlow getWorkflow();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Function#getWorkflow <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(WorkFlow value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Function
