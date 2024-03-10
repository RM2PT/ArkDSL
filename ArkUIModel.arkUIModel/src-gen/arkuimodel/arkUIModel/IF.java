/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.IF#getExpression <em>Expression</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.IF#getAutoExpression <em>Auto Expression</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getIF()
 * @model
 * @generated
 */
public interface IF extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getIF_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Auto Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Expression</em>' attribute.
	 * @see #setAutoExpression(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getIF_AutoExpression()
	 * @model
	 * @generated
	 */
	String getAutoExpression();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.IF#getAutoExpression <em>Auto Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Expression</em>' attribute.
	 * @see #getAutoExpression()
	 * @generated
	 */
	void setAutoExpression(String value);

} // IF
