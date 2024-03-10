/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Refrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.PageRefrence#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PageRefrence#getParameter <em>Parameter</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PageRefrence#getIf <em>If</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PageRefrence#getForeach <em>Foreach</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PageRefrence#getPageevent <em>Pageevent</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageRefrence()
 * @model
 * @generated
 */
public interface PageRefrence extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageRefrence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PageRefrence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageRefrence_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(IF)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageRefrence_If()
	 * @model containment="true"
	 * @generated
	 */
	IF getIf();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PageRefrence#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(IF value);

	/**
	 * Returns the value of the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreach</em>' containment reference.
	 * @see #setForeach(ForEach)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageRefrence_Foreach()
	 * @model containment="true"
	 * @generated
	 */
	ForEach getForeach();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PageRefrence#getForeach <em>Foreach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreach</em>' containment reference.
	 * @see #getForeach()
	 * @generated
	 */
	void setForeach(ForEach value);

	/**
	 * Returns the value of the '<em><b>Pageevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageevent</em>' containment reference.
	 * @see #setPageevent(PageEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageRefrence_Pageevent()
	 * @model containment="true"
	 * @generated
	 */
	PageEvent getPageevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PageRefrence#getPageevent <em>Pageevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pageevent</em>' containment reference.
	 * @see #getPageevent()
	 * @generated
	 */
	void setPageevent(PageEvent value);

} // PageRefrence
