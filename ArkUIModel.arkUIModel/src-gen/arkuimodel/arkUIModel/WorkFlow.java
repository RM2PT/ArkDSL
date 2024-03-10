/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.WorkFlow#getFunction <em>Function</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.WorkFlow#getFlowName <em>Flow Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.WorkFlow#getFlowline <em>Flowline</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.WorkFlow#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.WorkFlow#getWorkparameter <em>Workparameter</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getWorkFlow()
 * @model
 * @generated
 */
public interface WorkFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getWorkFlow_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunction();

	/**
	 * Returns the value of the '<em><b>Flow Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Name</em>' attribute.
	 * @see #setFlowName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getWorkFlow_FlowName()
	 * @model
	 * @generated
	 */
	String getFlowName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.WorkFlow#getFlowName <em>Flow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Name</em>' attribute.
	 * @see #getFlowName()
	 * @generated
	 */
	void setFlowName(String value);

	/**
	 * Returns the value of the '<em><b>Flowline</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.FlowLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowline</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getWorkFlow_Flowline()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowLine> getFlowline();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link arkuimodel.arkUIModel.ExecuteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see arkuimodel.arkUIModel.ExecuteType
	 * @see #setType(ExecuteType)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getWorkFlow_Type()
	 * @model default=""
	 * @generated
	 */
	ExecuteType getType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.WorkFlow#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see arkuimodel.arkUIModel.ExecuteType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExecuteType value);

	/**
	 * Returns the value of the '<em><b>Workparameter</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workparameter</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getWorkFlow_Workparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getWorkparameter();

} // WorkFlow
