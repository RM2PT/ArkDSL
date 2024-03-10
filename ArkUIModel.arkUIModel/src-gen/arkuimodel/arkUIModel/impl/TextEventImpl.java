/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextEventImpl#getOnFocus <em>On Focus</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextEventImpl#getOnBlur <em>On Blur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextEventImpl extends EventImpl implements TextEvent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TEXT_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_EVENT__ON_FOCUS, oldOnFocus,
					onFocus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_EVENT__ON_BLUR, oldOnBlur,
					onBlur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.TEXT_EVENT__ON_FOCUS:
			return getOnFocus();
		case ArkUIModelPackage.TEXT_EVENT__ON_BLUR:
			return getOnBlur();
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
		case ArkUIModelPackage.TEXT_EVENT__ON_FOCUS:
			setOnFocus((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_EVENT__ON_BLUR:
			setOnBlur((String) newValue);
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
		case ArkUIModelPackage.TEXT_EVENT__ON_FOCUS:
			setOnFocus(ON_FOCUS_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_EVENT__ON_BLUR:
			setOnBlur(ON_BLUR_EDEFAULT);
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
		case ArkUIModelPackage.TEXT_EVENT__ON_FOCUS:
			return ON_FOCUS_EDEFAULT == null ? onFocus != null : !ON_FOCUS_EDEFAULT.equals(onFocus);
		case ArkUIModelPackage.TEXT_EVENT__ON_BLUR:
			return ON_BLUR_EDEFAULT == null ? onBlur != null : !ON_BLUR_EDEFAULT.equals(onBlur);
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
		result.append(" (onFocus: ");
		result.append(onFocus);
		result.append(", onBlur: ");
		result.append(onBlur);
		result.append(')');
		return result.toString();
	}

} //TextEventImpl
