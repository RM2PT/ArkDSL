/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swiper Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.SwiperWidget#getController <em>Controller</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SwiperWidget#getSwiperevent <em>Swiperevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.SwiperWidget#getSwiperstyle <em>Swiperstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSwiperWidget()
 * @model
 * @generated
 */
public interface SwiperWidget extends Container {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see #setController(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSwiperWidget_Controller()
	 * @model
	 * @generated
	 */
	String getController();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SwiperWidget#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see #getController()
	 * @generated
	 */
	void setController(String value);

	/**
	 * Returns the value of the '<em><b>Swiperevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swiperevent</em>' containment reference.
	 * @see #setSwiperevent(SwiperEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSwiperWidget_Swiperevent()
	 * @model containment="true"
	 * @generated
	 */
	SwiperEvent getSwiperevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SwiperWidget#getSwiperevent <em>Swiperevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swiperevent</em>' containment reference.
	 * @see #getSwiperevent()
	 * @generated
	 */
	void setSwiperevent(SwiperEvent value);

	/**
	 * Returns the value of the '<em><b>Swiperstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swiperstyle</em>' containment reference.
	 * @see #setSwiperstyle(SwiperStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getSwiperWidget_Swiperstyle()
	 * @model containment="true"
	 * @generated
	 */
	SwiperStyle getSwiperstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.SwiperWidget#getSwiperstyle <em>Swiperstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swiperstyle</em>' containment reference.
	 * @see #getSwiperstyle()
	 * @generated
	 */
	void setSwiperstyle(SwiperStyle value);

} // SwiperWidget
