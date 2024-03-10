/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ClearTimeOut;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clear Time Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ClearTimeOutImpl#getTimeoutID <em>Timeout ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearTimeOutImpl extends UIOperationImpl implements ClearTimeOut {
	/**
	 * The default value of the '{@link #getTimeoutID() <em>Timeout ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutID()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutID() <em>Timeout ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutID()
	 * @generated
	 * @ordered
	 */
	protected String timeoutID = TIMEOUT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearTimeOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.CLEAR_TIME_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeoutID() {
		return timeoutID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutID(String newTimeoutID) {
		String oldTimeoutID = timeoutID;
		timeoutID = newTimeoutID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CLEAR_TIME_OUT__TIMEOUT_ID,
					oldTimeoutID, timeoutID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.CLEAR_TIME_OUT__TIMEOUT_ID:
			return getTimeoutID();
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
		case ArkUIModelPackage.CLEAR_TIME_OUT__TIMEOUT_ID:
			setTimeoutID((String) newValue);
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
		case ArkUIModelPackage.CLEAR_TIME_OUT__TIMEOUT_ID:
			setTimeoutID(TIMEOUT_ID_EDEFAULT);
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
		case ArkUIModelPackage.CLEAR_TIME_OUT__TIMEOUT_ID:
			return TIMEOUT_ID_EDEFAULT == null ? timeoutID != null : !TIMEOUT_ID_EDEFAULT.equals(timeoutID);
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
		result.append(" (timeoutID: ");
		result.append(timeoutID);
		result.append(')');
		return result.toString();
	}

} //ClearTimeOutImpl
