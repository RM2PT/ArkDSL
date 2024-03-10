/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.NavigationEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationEventImpl#getOnTitleModeChange <em>On Title Mode Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationEventImpl extends EventImpl implements NavigationEvent {
	/**
	 * The default value of the '{@link #getOnTitleModeChange() <em>On Title Mode Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTitleModeChange()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_TITLE_MODE_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnTitleModeChange() <em>On Title Mode Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTitleModeChange()
	 * @generated
	 * @ordered
	 */
	protected String onTitleModeChange = ON_TITLE_MODE_CHANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.NAVIGATION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnTitleModeChange() {
		return onTitleModeChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTitleModeChange(String newOnTitleModeChange) {
		String oldOnTitleModeChange = onTitleModeChange;
		onTitleModeChange = newOnTitleModeChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.NAVIGATION_EVENT__ON_TITLE_MODE_CHANGE, oldOnTitleModeChange, onTitleModeChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.NAVIGATION_EVENT__ON_TITLE_MODE_CHANGE:
			return getOnTitleModeChange();
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
		case ArkUIModelPackage.NAVIGATION_EVENT__ON_TITLE_MODE_CHANGE:
			setOnTitleModeChange((String) newValue);
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
		case ArkUIModelPackage.NAVIGATION_EVENT__ON_TITLE_MODE_CHANGE:
			setOnTitleModeChange(ON_TITLE_MODE_CHANGE_EDEFAULT);
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
		case ArkUIModelPackage.NAVIGATION_EVENT__ON_TITLE_MODE_CHANGE:
			return ON_TITLE_MODE_CHANGE_EDEFAULT == null ? onTitleModeChange != null
					: !ON_TITLE_MODE_CHANGE_EDEFAULT.equals(onTitleModeChange);
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
		result.append(" (onTitleModeChange: ");
		result.append(onTitleModeChange);
		result.append(')');
		return result.toString();
	}

} //NavigationEventImpl
