/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ButtonEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ButtonEventImpl#getOnBlur <em>On Blur</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ButtonEventImpl#getOnFocus <em>On Focus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonEventImpl extends EventImpl implements ButtonEvent {
	/**
	 * The default value of the '{@link #getOnBlur() <em>On Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBlur()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_BLUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnBlur() <em>On Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBlur()
	 * @generated
	 * @ordered
	 */
	protected String onBlur = ON_BLUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnFocus() <em>On Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFocus()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_FOCUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnFocus() <em>On Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFocus()
	 * @generated
	 * @ordered
	 */
	protected String onFocus = ON_FOCUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.BUTTON_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnBlur() {
		return onBlur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBlur(String newOnBlur) {
		String oldOnBlur = onBlur;
		onBlur = newOnBlur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.BUTTON_EVENT__ON_BLUR, oldOnBlur,
					onBlur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnFocus() {
		return onFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFocus(String newOnFocus) {
		String oldOnFocus = onFocus;
		onFocus = newOnFocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.BUTTON_EVENT__ON_FOCUS, oldOnFocus,
					onFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.BUTTON_EVENT__ON_BLUR:
			return getOnBlur();
		case ArkUIModelPackage.BUTTON_EVENT__ON_FOCUS:
			return getOnFocus();
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
		case ArkUIModelPackage.BUTTON_EVENT__ON_BLUR:
			setOnBlur((String) newValue);
			return;
		case ArkUIModelPackage.BUTTON_EVENT__ON_FOCUS:
			setOnFocus((String) newValue);
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
		case ArkUIModelPackage.BUTTON_EVENT__ON_BLUR:
			setOnBlur(ON_BLUR_EDEFAULT);
			return;
		case ArkUIModelPackage.BUTTON_EVENT__ON_FOCUS:
			setOnFocus(ON_FOCUS_EDEFAULT);
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
		case ArkUIModelPackage.BUTTON_EVENT__ON_BLUR:
			return ON_BLUR_EDEFAULT == null ? onBlur != null : !ON_BLUR_EDEFAULT.equals(onBlur);
		case ArkUIModelPackage.BUTTON_EVENT__ON_FOCUS:
			return ON_FOCUS_EDEFAULT == null ? onFocus != null : !ON_FOCUS_EDEFAULT.equals(onFocus);
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
		result.append(" (onBlur: ");
		result.append(onBlur);
		result.append(", onFocus: ");
		result.append(onFocus);
		result.append(')');
		return result.toString();
	}

} //ButtonEventImpl
