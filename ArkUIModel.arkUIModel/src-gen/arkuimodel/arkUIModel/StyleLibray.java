/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Libray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.StyleLibray#getStyleclass <em>Styleclass</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.StyleLibray#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getStyleLibray()
 * @model
 * @generated
 */
public interface StyleLibray extends EObject {
	/**
	 * Returns the value of the '<em><b>Styleclass</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.StyleClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styleclass</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getStyleLibray_Styleclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleClass> getStyleclass();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getStyleLibray_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.StyleLibray#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StyleLibray
