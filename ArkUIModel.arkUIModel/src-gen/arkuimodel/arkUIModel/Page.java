/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.Page#getPageTitle <em>Page Title</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Page#isIsHome <em>Is Home</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Page#getFileName <em>File Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Page#getUilogic <em>Uilogic</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Page#getUidesign <em>Uidesign</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Page#getSubpages <em>Subpages</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.Page#getPageroute <em>Pageroute</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Page Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Title</em>' attribute.
	 * @see #setPageTitle(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPage_PageTitle()
	 * @model
	 * @generated
	 */
	String getPageTitle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Page#getPageTitle <em>Page Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Title</em>' attribute.
	 * @see #getPageTitle()
	 * @generated
	 */
	void setPageTitle(String value);

	/**
	 * Returns the value of the '<em><b>Is Home</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Home</em>' attribute.
	 * @see #setIsHome(boolean)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPage_IsHome()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsHome();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Page#isIsHome <em>Is Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Home</em>' attribute.
	 * @see #isIsHome()
	 * @generated
	 */
	void setIsHome(boolean value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPage_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Page#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Uilogic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uilogic</em>' reference.
	 * @see #setUilogic(UILogic)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPage_Uilogic()
	 * @model
	 * @generated
	 */
	UILogic getUilogic();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Page#getUilogic <em>Uilogic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uilogic</em>' reference.
	 * @see #getUilogic()
	 * @generated
	 */
	void setUilogic(UILogic value);

	/**
	 * Returns the value of the '<em><b>Uidesign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uidesign</em>' reference.
	 * @see #setUidesign(UIDesign)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPage_Uidesign()
	 * @model
	 * @generated
	 */
	UIDesign getUidesign();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.Page#getUidesign <em>Uidesign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uidesign</em>' reference.
	 * @see #getUidesign()
	 * @generated
	 */
	void setUidesign(UIDesign value);

	/**
	 * Returns the value of the '<em><b>Subpages</b></em>' reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpages</em>' reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPage_Subpages()
	 * @model
	 * @generated
	 */
	EList<Page> getSubpages();

	/**
	 * Returns the value of the '<em><b>Pageroute</b></em>' reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageroute</em>' reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPage_Pageroute()
	 * @model
	 * @generated
	 */
	EList<Page> getPageroute();

} // Page
