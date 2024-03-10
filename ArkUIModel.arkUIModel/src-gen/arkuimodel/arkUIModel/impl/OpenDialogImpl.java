/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.OpenDialog;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Dialog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.OpenDialogImpl#getAssignDialog <em>Assign Dialog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenDialogImpl extends UIOperationImpl implements OpenDialog {
	/**
	 * The default value of the '{@link #getAssignDialog() <em>Assign Dialog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignDialog()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGN_DIALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignDialog() <em>Assign Dialog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignDialog()
	 * @generated
	 * @ordered
	 */
	protected String assignDialog = ASSIGN_DIALOG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDialogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.OPEN_DIALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignDialog() {
		return assignDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignDialog(String newAssignDialog) {
		String oldAssignDialog = assignDialog;
		assignDialog = newAssignDialog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.OPEN_DIALOG__ASSIGN_DIALOG,
					oldAssignDialog, assignDialog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.OPEN_DIALOG__ASSIGN_DIALOG:
			return getAssignDialog();
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
		case ArkUIModelPackage.OPEN_DIALOG__ASSIGN_DIALOG:
			setAssignDialog((String) newValue);
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
		case ArkUIModelPackage.OPEN_DIALOG__ASSIGN_DIALOG:
			setAssignDialog(ASSIGN_DIALOG_EDEFAULT);
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
		case ArkUIModelPackage.OPEN_DIALOG__ASSIGN_DIALOG:
			return ASSIGN_DIALOG_EDEFAULT == null ? assignDialog != null : !ASSIGN_DIALOG_EDEFAULT.equals(assignDialog);
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
		result.append(" (assignDialog: ");
		result.append(assignDialog);
		result.append(')');
		return result.toString();
	}

} //OpenDialogImpl
