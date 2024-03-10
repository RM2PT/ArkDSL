/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scroll Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ScrollEvent#getOnScroll <em>On Scroll</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ScrollEvent#getOnScrollEdge <em>On Scroll Edge</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ScrollEvent#getOnScrollEnd <em>On Scroll End</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getScrollEvent()
 * @model
 * @generated
 */
public interface ScrollEvent extends Event {
	/**
	 * Returns the value of the '<em><b>On Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Scroll</em>' attribute.
	 * @see #setOnScroll(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getScrollEvent_OnScroll()
	 * @model
	 * @generated
	 */
	String getOnScroll();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ScrollEvent#getOnScroll <em>On Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Scroll</em>' attribute.
	 * @see #getOnScroll()
	 * @generated
	 */
	void setOnScroll(String value);

	/**
	 * Returns the value of the '<em><b>On Scroll Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Scroll Edge</em>' attribute.
	 * @see #setOnScrollEdge(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getScrollEvent_OnScrollEdge()
	 * @model
	 * @generated
	 */
	String getOnScrollEdge();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ScrollEvent#getOnScrollEdge <em>On Scroll Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Scroll Edge</em>' attribute.
	 * @see #getOnScrollEdge()
	 * @generated
	 */
	void setOnScrollEdge(String value);

	/**
	 * Returns the value of the '<em><b>On Scroll End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Scroll End</em>' attribute.
	 * @see #setOnScrollEnd(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getScrollEvent_OnScrollEnd()
	 * @model
	 * @generated
	 */
	String getOnScrollEnd();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ScrollEvent#getOnScrollEnd <em>On Scroll End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Scroll End</em>' attribute.
	 * @see #getOnScrollEnd()
	 * @generated
	 */
	void setOnScrollEnd(String value);

} // ScrollEvent
