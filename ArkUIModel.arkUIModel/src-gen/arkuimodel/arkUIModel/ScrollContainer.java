/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scroll Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ScrollContainer#getScrollevent <em>Scrollevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ScrollContainer#getScrollstyle <em>Scrollstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getScrollContainer()
 * @model
 * @generated
 */
public interface ScrollContainer extends Container {
	/**
	 * Returns the value of the '<em><b>Scrollevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrollevent</em>' containment reference.
	 * @see #setScrollevent(ScrollEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getScrollContainer_Scrollevent()
	 * @model containment="true"
	 * @generated
	 */
	ScrollEvent getScrollevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ScrollContainer#getScrollevent <em>Scrollevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrollevent</em>' containment reference.
	 * @see #getScrollevent()
	 * @generated
	 */
	void setScrollevent(ScrollEvent value);

	/**
	 * Returns the value of the '<em><b>Scrollstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrollstyle</em>' containment reference.
	 * @see #setScrollstyle(ScrollStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getScrollContainer_Scrollstyle()
	 * @model containment="true"
	 * @generated
	 */
	ScrollStyle getScrollstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ScrollContainer#getScrollstyle <em>Scrollstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrollstyle</em>' containment reference.
	 * @see #getScrollstyle()
	 * @generated
	 */
	void setScrollstyle(ScrollStyle value);

} // ScrollContainer
