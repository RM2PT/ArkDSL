/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.PageStruct#getTitle <em>Title</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PageStruct#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PageStruct#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.PageStruct#getPageevent <em>Pageevent</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageStruct()
 * @model
 * @generated
 */
public interface PageStruct extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageStruct_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PageStruct#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageStruct_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PageStruct#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.UIComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageStruct_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIComponent> getWidgets();

	/**
	 * Returns the value of the '<em><b>Pageevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageevent</em>' containment reference.
	 * @see #setPageevent(PageEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getPageStruct_Pageevent()
	 * @model containment="true"
	 * @generated
	 */
	PageEvent getPageevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.PageStruct#getPageevent <em>Pageevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pageevent</em>' containment reference.
	 * @see #getPageevent()
	 * @generated
	 */
	void setPageevent(PageEvent value);

} // PageStruct
