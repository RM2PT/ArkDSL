/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.UIDesign#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIDesign#getPageview <em>Pageview</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIDesign()
 * @model
 * @generated
 */
public interface UIDesign extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIDesign_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.UIDesign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pageview</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageview</em>' containment reference.
	 * @see #setPageview(PageStruct)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIDesign_Pageview()
	 * @model containment="true"
	 * @generated
	 */
	PageStruct getPageview();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.UIDesign#getPageview <em>Pageview</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pageview</em>' containment reference.
	 * @see #getPageview()
	 * @generated
	 */
	void setPageview(PageStruct value);

} // UIDesign
