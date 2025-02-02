/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.DomainModel#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.DomainModel#getLabel <em>Label</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.DomainModel#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDomainModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DomainModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDomainModel_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DomainModel#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDomainModel_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

} // DomainModel
