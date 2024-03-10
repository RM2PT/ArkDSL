/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.CustomDialogEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Dialog Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogEventImpl#getCancel <em>Cancel</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogEventImpl#getConfirm <em>Confirm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomDialogEventImpl extends EventImpl implements CustomDialogEvent {
	/**
	 * The default value of the '{@link #getCancel() <em>Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancel() <em>Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel()
	 * @generated
	 * @ordered
	 */
	protected String cancel = CANCEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfirm() <em>Confirm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirm()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirm() <em>Confirm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirm()
	 * @generated
	 * @ordered
	 */
	protected String confirm = CONFIRM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomDialogEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.CUSTOM_DIALOG_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCancel() {
		return cancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancel(String newCancel) {
		String oldCancel = cancel;
		cancel = newCancel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CANCEL,
					oldCancel, cancel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfirm() {
		return confirm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirm(String newConfirm) {
		String oldConfirm = confirm;
		confirm = newConfirm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CONFIRM,
					oldConfirm, confirm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CANCEL:
			return getCancel();
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CONFIRM:
			return getConfirm();
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
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CANCEL:
			setCancel((String) newValue);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CONFIRM:
			setConfirm((String) newValue);
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
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CANCEL:
			setCancel(CANCEL_EDEFAULT);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CONFIRM:
			setConfirm(CONFIRM_EDEFAULT);
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
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CANCEL:
			return CANCEL_EDEFAULT == null ? cancel != null : !CANCEL_EDEFAULT.equals(cancel);
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT__CONFIRM:
			return CONFIRM_EDEFAULT == null ? confirm != null : !CONFIRM_EDEFAULT.equals(confirm);
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
		result.append(" (cancel: ");
		result.append(cancel);
		result.append(", confirm: ");
		result.append(confirm);
		result.append(')');
		return result.toString();
	}

} //CustomDialogEventImpl
