/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Logic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.UILogic#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UILogic#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UILogic#getPageparameter <em>Pageparameter</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUILogic()
 * @model
 * @generated
 */
public interface UILogic extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUILogic_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.UILogic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.WorkFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUILogic_Workflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkFlow> getWorkflow();

	/**
	 * Returns the value of the '<em><b>Pageparameter</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageparameter</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUILogic_Pageparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getPageparameter();

} // UILogic
