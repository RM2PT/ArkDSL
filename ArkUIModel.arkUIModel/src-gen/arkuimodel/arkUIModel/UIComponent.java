/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getId <em>Id</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getWidget <em>Widget</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getFunflow <em>Funflow</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getRoot <em>Root</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getPagerefrence <em>Pagerefrence</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getForeach <em>Foreach</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getIf <em>If</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.UIComponent#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent()
 * @model abstract="true"
 * @generated
 */
public interface UIComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.UIComponent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget Type</em>' attribute.
	 * @see #setWidgetType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_WidgetType()
	 * @model
	 * @generated
	 */
	String getWidgetType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.UIComponent#getWidgetType <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget Type</em>' attribute.
	 * @see #getWidgetType()
	 * @generated
	 */
	void setWidgetType(String value);

	/**
	 * Returns the value of the '<em><b>Widget</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.UIComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_Widget()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIComponent> getWidget();

	/**
	 * Returns the value of the '<em><b>Funflow</b></em>' reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.WorkFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funflow</em>' reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_Funflow()
	 * @model
	 * @generated
	 */
	EList<WorkFlow> getFunflow();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.PageStruct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_Root()
	 * @model
	 * @generated
	 */
	EList<PageStruct> getRoot();

	/**
	 * Returns the value of the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.PageRefrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagerefrence</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_Pagerefrence()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageRefrence> getPagerefrence();

	/**
	 * Returns the value of the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreach</em>' containment reference.
	 * @see #setForeach(ForEach)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_Foreach()
	 * @model containment="true"
	 * @generated
	 */
	ForEach getForeach();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.UIComponent#getForeach <em>Foreach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreach</em>' containment reference.
	 * @see #getForeach()
	 * @generated
	 */
	void setForeach(ForEach value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(IF)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_If()
	 * @model containment="true"
	 * @generated
	 */
	IF getIf();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.UIComponent#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(IF value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getUIComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.UIComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // UIComponent
