/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getStylelibray <em>Stylelibray</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getDescription <em>Description</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getRootpage <em>Rootpage</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getTriggerevent <em>Triggerevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getAnimationlibray <em>Animationlibray</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getUilogic <em>Uilogic</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getUidesign <em>Uidesign</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.GUIModel#getOperationlibray <em>Operationlibray</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel()
 * @model
 * @generated
 */
public interface GUIModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GUIModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stylelibray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stylelibray</em>' containment reference.
	 * @see #setStylelibray(StyleLibray)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Stylelibray()
	 * @model containment="true"
	 * @generated
	 */
	StyleLibray getStylelibray();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GUIModel#getStylelibray <em>Stylelibray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stylelibray</em>' containment reference.
	 * @see #getStylelibray()
	 * @generated
	 */
	void setStylelibray(StyleLibray value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GUIModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link arkuimodel.arkUIModel.DevicesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see arkuimodel.arkUIModel.DevicesType
	 * @see #setType(DevicesType)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Type()
	 * @model default=""
	 * @generated
	 */
	DevicesType getType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GUIModel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see arkuimodel.arkUIModel.DevicesType
	 * @see #getType()
	 * @generated
	 */
	void setType(DevicesType value);

	/**
	 * Returns the value of the '<em><b>Rootpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootpage</em>' containment reference.
	 * @see #setRootpage(UIStruct)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Rootpage()
	 * @model containment="true"
	 * @generated
	 */
	UIStruct getRootpage();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GUIModel#getRootpage <em>Rootpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rootpage</em>' containment reference.
	 * @see #getRootpage()
	 * @generated
	 */
	void setRootpage(UIStruct value);

	/**
	 * Returns the value of the '<em><b>Triggerevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggerevent</em>' containment reference.
	 * @see #setTriggerevent(TriggerEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Triggerevent()
	 * @model containment="true"
	 * @generated
	 */
	TriggerEvent getTriggerevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GUIModel#getTriggerevent <em>Triggerevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggerevent</em>' containment reference.
	 * @see #getTriggerevent()
	 * @generated
	 */
	void setTriggerevent(TriggerEvent value);

	/**
	 * Returns the value of the '<em><b>Animationlibray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animationlibray</em>' containment reference.
	 * @see #setAnimationlibray(AnimationLibray)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Animationlibray()
	 * @model containment="true"
	 * @generated
	 */
	AnimationLibray getAnimationlibray();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GUIModel#getAnimationlibray <em>Animationlibray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animationlibray</em>' containment reference.
	 * @see #getAnimationlibray()
	 * @generated
	 */
	void setAnimationlibray(AnimationLibray value);

	/**
	 * Returns the value of the '<em><b>Uilogic</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.UILogic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uilogic</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Uilogic()
	 * @model containment="true"
	 * @generated
	 */
	EList<UILogic> getUilogic();

	/**
	 * Returns the value of the '<em><b>Uidesign</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.UIDesign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uidesign</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Uidesign()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIDesign> getUidesign();

	/**
	 * Returns the value of the '<em><b>Operationlibray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationlibray</em>' containment reference.
	 * @see #setOperationlibray(OperationLibray)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getGUIModel_Operationlibray()
	 * @model containment="true"
	 * @generated
	 */
	OperationLibray getOperationlibray();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.GUIModel#getOperationlibray <em>Operationlibray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationlibray</em>' containment reference.
	 * @see #getOperationlibray()
	 * @generated
	 */
	void setOperationlibray(OperationLibray value);

} // GUIModel
