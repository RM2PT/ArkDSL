/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.CaseOp#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getCaseOp()
 * @model
 * @generated
 */
public interface CaseOp extends ControlFlow {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getCaseOp_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // CaseOp
