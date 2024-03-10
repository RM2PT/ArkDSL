/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TimePickerStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Picker Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TimePickerStyleImpl#getUseMilitaryTime <em>Use Military Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePickerStyleImpl extends StyleClassImpl implements TimePickerStyle {
	/**
	 * The default value of the '{@link #getUseMilitaryTime() <em>Use Military Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseMilitaryTime()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_MILITARY_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseMilitaryTime() <em>Use Military Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseMilitaryTime()
	 * @generated
	 * @ordered
	 */
	protected String useMilitaryTime = USE_MILITARY_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePickerStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TIME_PICKER_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseMilitaryTime() {
		return useMilitaryTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseMilitaryTime(String newUseMilitaryTime) {
		String oldUseMilitaryTime = useMilitaryTime;
		useMilitaryTime = newUseMilitaryTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TIME_PICKER_STYLE__USE_MILITARY_TIME, oldUseMilitaryTime, useMilitaryTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.TIME_PICKER_STYLE__USE_MILITARY_TIME:
			return getUseMilitaryTime();
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
		case ArkUIModelPackage.TIME_PICKER_STYLE__USE_MILITARY_TIME:
			setUseMilitaryTime((String) newValue);
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
		case ArkUIModelPackage.TIME_PICKER_STYLE__USE_MILITARY_TIME:
			setUseMilitaryTime(USE_MILITARY_TIME_EDEFAULT);
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
		case ArkUIModelPackage.TIME_PICKER_STYLE__USE_MILITARY_TIME:
			return USE_MILITARY_TIME_EDEFAULT == null ? useMilitaryTime != null
					: !USE_MILITARY_TIME_EDEFAULT.equals(useMilitaryTime);
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
		result.append(" (useMilitaryTime: ");
		result.append(useMilitaryTime);
		result.append(')');
		return result.toString();
	}

} //TimePickerStyleImpl
