/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.FlowLine#getSource <em>Source</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlowLine#getTarget <em>Target</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlowLine#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.FlowLine#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlowLine()
 * @model
 * @generated
 */
public interface FlowLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Function)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlowLine_Source()
	 * @model
	 * @generated
	 */
	Function getSource();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlowLine#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Function value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Function)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlowLine_Target()
	 * @model
	 * @generated
	 */
	Function getTarget();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlowLine#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Function value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link arkuimodel.arkUIModel.LineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see arkuimodel.arkUIModel.LineType
	 * @see #setType(LineType)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlowLine_Type()
	 * @model default=""
	 * @generated
	 */
	LineType getType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlowLine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see arkuimodel.arkUIModel.LineType
	 * @see #getType()
	 * @generated
	 */
	void setType(LineType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getFlowLine_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.FlowLine#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // FlowLine
