/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.LineContainer#getWidth <em>Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.LineContainer#getHeight <em>Height</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.LineContainer#getLineevent <em>Lineevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.LineContainer#getLinestyle <em>Linestyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getLineContainer()
 * @model
 * @generated
 */
public interface LineContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getLineContainer_Width()
	 * @model
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.LineContainer#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getLineContainer_Height()
	 * @model
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.LineContainer#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Lineevent</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.LineEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineevent</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getLineContainer_Lineevent()
	 * @model containment="true"
	 * @generated
	 */
	EList<LineEvent> getLineevent();

	/**
	 * Returns the value of the '<em><b>Linestyle</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linestyle</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getLineContainer_Linestyle()
	 * @model containment="true"
	 * @generated
	 */
	EList<LineStyle> getLinestyle();

} // LineContainer
