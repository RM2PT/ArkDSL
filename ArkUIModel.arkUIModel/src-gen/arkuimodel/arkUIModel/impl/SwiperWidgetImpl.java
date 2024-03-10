/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.SwiperEvent;
import arkuimodel.arkUIModel.SwiperStyle;
import arkuimodel.arkUIModel.SwiperWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swiper Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperWidgetImpl#getController <em>Controller</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperWidgetImpl#getSwiperevent <em>Swiperevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperWidgetImpl#getSwiperstyle <em>Swiperstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwiperWidgetImpl extends ContainerImpl implements SwiperWidget {
	/**
	 * The default value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected String controller = CONTROLLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwiperevent() <em>Swiperevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwiperevent()
	 * @generated
	 * @ordered
	 */
	protected SwiperEvent swiperevent;

	/**
	 * The cached value of the '{@link #getSwiperstyle() <em>Swiperstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwiperstyle()
	 * @generated
	 * @ordered
	 */
	protected SwiperStyle swiperstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwiperWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SWIPER_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(String newController) {
		String oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_WIDGET__CONTROLLER,
					oldController, controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiperEvent getSwiperevent() {
		return swiperevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwiperevent(SwiperEvent newSwiperevent, NotificationChain msgs) {
		SwiperEvent oldSwiperevent = swiperevent;
		swiperevent = newSwiperevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT, oldSwiperevent, newSwiperevent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwiperevent(SwiperEvent newSwiperevent) {
		if (newSwiperevent != swiperevent) {
			NotificationChain msgs = null;
			if (swiperevent != null)
				msgs = ((InternalEObject) swiperevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT, null, msgs);
			if (newSwiperevent != null)
				msgs = ((InternalEObject) newSwiperevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT, null, msgs);
			msgs = basicSetSwiperevent(newSwiperevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT,
					newSwiperevent, newSwiperevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiperStyle getSwiperstyle() {
		return swiperstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwiperstyle(SwiperStyle newSwiperstyle, NotificationChain msgs) {
		SwiperStyle oldSwiperstyle = swiperstyle;
		swiperstyle = newSwiperstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE, oldSwiperstyle, newSwiperstyle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwiperstyle(SwiperStyle newSwiperstyle) {
		if (newSwiperstyle != swiperstyle) {
			NotificationChain msgs = null;
			if (swiperstyle != null)
				msgs = ((InternalEObject) swiperstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE, null, msgs);
			if (newSwiperstyle != null)
				msgs = ((InternalEObject) newSwiperstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE, null, msgs);
			msgs = basicSetSwiperstyle(newSwiperstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE,
					newSwiperstyle, newSwiperstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT:
			return basicSetSwiperevent(null, msgs);
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE:
			return basicSetSwiperstyle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.SWIPER_WIDGET__CONTROLLER:
			return getController();
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT:
			return getSwiperevent();
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE:
			return getSwiperstyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArkUIModelPackage.SWIPER_WIDGET__CONTROLLER:
			setController((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT:
			setSwiperevent((SwiperEvent) newValue);
			return;
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE:
			setSwiperstyle((SwiperStyle) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArkUIModelPackage.SWIPER_WIDGET__CONTROLLER:
			setController(CONTROLLER_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT:
			setSwiperevent((SwiperEvent) null);
			return;
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE:
			setSwiperstyle((SwiperStyle) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArkUIModelPackage.SWIPER_WIDGET__CONTROLLER:
			return CONTROLLER_EDEFAULT == null ? controller != null : !CONTROLLER_EDEFAULT.equals(controller);
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPEREVENT:
			return swiperevent != null;
		case ArkUIModelPackage.SWIPER_WIDGET__SWIPERSTYLE:
			return swiperstyle != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (controller: ");
		result.append(controller);
		result.append(')');
		return result.toString();
	}

} //SwiperWidgetImpl
