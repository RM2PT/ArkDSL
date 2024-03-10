/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ChangeIndex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ChangeIndexImpl#getTabsID <em>Tabs ID</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ChangeIndexImpl#getTabID <em>Tab ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeIndexImpl extends UIOperationImpl implements ChangeIndex {
	/**
	 * The default value of the '{@link #getTabsID() <em>Tabs ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabsID()
	 * @generated
	 * @ordered
	 */
	protected static final String TABS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabsID() <em>Tabs ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabsID()
	 * @generated
	 * @ordered
	 */
	protected String tabsID = TABS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTabID() <em>Tab ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabID()
	 * @generated
	 * @ordered
	 */
	protected static final String TAB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabID() <em>Tab ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabID()
	 * @generated
	 * @ordered
	 */
	protected String tabID = TAB_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.CHANGE_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabsID() {
		return tabsID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabsID(String newTabsID) {
		String oldTabsID = tabsID;
		tabsID = newTabsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CHANGE_INDEX__TABS_ID, oldTabsID,
					tabsID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabID() {
		return tabID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabID(String newTabID) {
		String oldTabID = tabID;
		tabID = newTabID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CHANGE_INDEX__TAB_ID, oldTabID,
					tabID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.CHANGE_INDEX__TABS_ID:
			return getTabsID();
		case ArkUIModelPackage.CHANGE_INDEX__TAB_ID:
			return getTabID();
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
		case ArkUIModelPackage.CHANGE_INDEX__TABS_ID:
			setTabsID((String) newValue);
			return;
		case ArkUIModelPackage.CHANGE_INDEX__TAB_ID:
			setTabID((String) newValue);
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
		case ArkUIModelPackage.CHANGE_INDEX__TABS_ID:
			setTabsID(TABS_ID_EDEFAULT);
			return;
		case ArkUIModelPackage.CHANGE_INDEX__TAB_ID:
			setTabID(TAB_ID_EDEFAULT);
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
		case ArkUIModelPackage.CHANGE_INDEX__TABS_ID:
			return TABS_ID_EDEFAULT == null ? tabsID != null : !TABS_ID_EDEFAULT.equals(tabsID);
		case ArkUIModelPackage.CHANGE_INDEX__TAB_ID:
			return TAB_ID_EDEFAULT == null ? tabID != null : !TAB_ID_EDEFAULT.equals(tabID);
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
		result.append(" (tabsID: ");
		result.append(tabsID);
		result.append(", tabID: ");
		result.append(tabID);
		result.append(')');
		return result.toString();
	}

} //ChangeIndexImpl
