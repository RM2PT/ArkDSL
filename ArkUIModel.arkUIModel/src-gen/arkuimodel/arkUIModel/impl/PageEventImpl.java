/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.PageEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageEventImpl#getOnPageHide <em>On Page Hide</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageEventImpl#getAboutToAppear <em>About To Appear</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageEventImpl#getOnPageShow <em>On Page Show</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageEventImpl#getOnBackPress <em>On Back Press</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageEventImpl#getAboutToDisappear <em>About To Disappear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageEventImpl extends EventImpl implements PageEvent {
	/**
	 * The default value of the '{@link #getOnPageHide() <em>On Page Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPageHide()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PAGE_HIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPageHide() <em>On Page Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPageHide()
	 * @generated
	 * @ordered
	 */
	protected String onPageHide = ON_PAGE_HIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAboutToAppear() <em>About To Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAboutToAppear()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_TO_APPEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAboutToAppear() <em>About To Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAboutToAppear()
	 * @generated
	 * @ordered
	 */
	protected String aboutToAppear = ABOUT_TO_APPEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnPageShow() <em>On Page Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPageShow()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PAGE_SHOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPageShow() <em>On Page Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPageShow()
	 * @generated
	 * @ordered
	 */
	protected String onPageShow = ON_PAGE_SHOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnBackPress() <em>On Back Press</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBackPress()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_BACK_PRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnBackPress() <em>On Back Press</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBackPress()
	 * @generated
	 * @ordered
	 */
	protected String onBackPress = ON_BACK_PRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAboutToDisappear() <em>About To Disappear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAboutToDisappear()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_TO_DISAPPEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAboutToDisappear() <em>About To Disappear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAboutToDisappear()
	 * @generated
	 * @ordered
	 */
	protected String aboutToDisappear = ABOUT_TO_DISAPPEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.PAGE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnPageHide() {
		return onPageHide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPageHide(String newOnPageHide) {
		String oldOnPageHide = onPageHide;
		onPageHide = newOnPageHide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_EVENT__ON_PAGE_HIDE,
					oldOnPageHide, onPageHide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAboutToAppear() {
		return aboutToAppear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAboutToAppear(String newAboutToAppear) {
		String oldAboutToAppear = aboutToAppear;
		aboutToAppear = newAboutToAppear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_APPEAR,
					oldAboutToAppear, aboutToAppear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnPageShow() {
		return onPageShow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPageShow(String newOnPageShow) {
		String oldOnPageShow = onPageShow;
		onPageShow = newOnPageShow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_EVENT__ON_PAGE_SHOW,
					oldOnPageShow, onPageShow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnBackPress() {
		return onBackPress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBackPress(String newOnBackPress) {
		String oldOnBackPress = onBackPress;
		onBackPress = newOnBackPress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_EVENT__ON_BACK_PRESS,
					oldOnBackPress, onBackPress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAboutToDisappear() {
		return aboutToDisappear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAboutToDisappear(String newAboutToDisappear) {
		String oldAboutToDisappear = aboutToDisappear;
		aboutToDisappear = newAboutToDisappear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_DISAPPEAR,
					oldAboutToDisappear, aboutToDisappear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.PAGE_EVENT__ON_PAGE_HIDE:
			return getOnPageHide();
		case ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_APPEAR:
			return getAboutToAppear();
		case ArkUIModelPackage.PAGE_EVENT__ON_PAGE_SHOW:
			return getOnPageShow();
		case ArkUIModelPackage.PAGE_EVENT__ON_BACK_PRESS:
			return getOnBackPress();
		case ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_DISAPPEAR:
			return getAboutToDisappear();
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
		case ArkUIModelPackage.PAGE_EVENT__ON_PAGE_HIDE:
			setOnPageHide((String) newValue);
			return;
		case ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_APPEAR:
			setAboutToAppear((String) newValue);
			return;
		case ArkUIModelPackage.PAGE_EVENT__ON_PAGE_SHOW:
			setOnPageShow((String) newValue);
			return;
		case ArkUIModelPackage.PAGE_EVENT__ON_BACK_PRESS:
			setOnBackPress((String) newValue);
			return;
		case ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_DISAPPEAR:
			setAboutToDisappear((String) newValue);
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
		case ArkUIModelPackage.PAGE_EVENT__ON_PAGE_HIDE:
			setOnPageHide(ON_PAGE_HIDE_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_APPEAR:
			setAboutToAppear(ABOUT_TO_APPEAR_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE_EVENT__ON_PAGE_SHOW:
			setOnPageShow(ON_PAGE_SHOW_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE_EVENT__ON_BACK_PRESS:
			setOnBackPress(ON_BACK_PRESS_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_DISAPPEAR:
			setAboutToDisappear(ABOUT_TO_DISAPPEAR_EDEFAULT);
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
		case ArkUIModelPackage.PAGE_EVENT__ON_PAGE_HIDE:
			return ON_PAGE_HIDE_EDEFAULT == null ? onPageHide != null : !ON_PAGE_HIDE_EDEFAULT.equals(onPageHide);
		case ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_APPEAR:
			return ABOUT_TO_APPEAR_EDEFAULT == null ? aboutToAppear != null
					: !ABOUT_TO_APPEAR_EDEFAULT.equals(aboutToAppear);
		case ArkUIModelPackage.PAGE_EVENT__ON_PAGE_SHOW:
			return ON_PAGE_SHOW_EDEFAULT == null ? onPageShow != null : !ON_PAGE_SHOW_EDEFAULT.equals(onPageShow);
		case ArkUIModelPackage.PAGE_EVENT__ON_BACK_PRESS:
			return ON_BACK_PRESS_EDEFAULT == null ? onBackPress != null : !ON_BACK_PRESS_EDEFAULT.equals(onBackPress);
		case ArkUIModelPackage.PAGE_EVENT__ABOUT_TO_DISAPPEAR:
			return ABOUT_TO_DISAPPEAR_EDEFAULT == null ? aboutToDisappear != null
					: !ABOUT_TO_DISAPPEAR_EDEFAULT.equals(aboutToDisappear);
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
		result.append(" (onPageHide: ");
		result.append(onPageHide);
		result.append(", aboutToAppear: ");
		result.append(aboutToAppear);
		result.append(", onPageShow: ");
		result.append(onPageShow);
		result.append(", onBackPress: ");
		result.append(onBackPress);
		result.append(", aboutToDisappear: ");
		result.append(aboutToDisappear);
		result.append(')');
		return result.toString();
	}

} //PageEventImpl
