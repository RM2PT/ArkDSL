/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Libray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.OperationLibray#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.OperationLibray#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.OperationLibray#getProjectparameters <em>Projectparameters</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.OperationLibray#getDomainmodel <em>Domainmodel</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getOperationLibray()
 * @model
 * @generated
 */
public interface OperationLibray extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getOperationLibray_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.OperationLibray#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.WorkFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getOperationLibray_Workflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkFlow> getWorkflows();

	/**
	 * Returns the value of the '<em><b>Projectparameters</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectparameters</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getOperationLibray_Projectparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getProjectparameters();

	/**
	 * Returns the value of the '<em><b>Domainmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainmodel</em>' containment reference.
	 * @see #setDomainmodel(DomainModel)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getOperationLibray_Domainmodel()
	 * @model containment="true"
	 * @generated
	 */
	DomainModel getDomainmodel();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.OperationLibray#getDomainmodel <em>Domainmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domainmodel</em>' containment reference.
	 * @see #getDomainmodel()
	 * @generated
	 */
	void setDomainmodel(DomainModel value);

} // OperationLibray
