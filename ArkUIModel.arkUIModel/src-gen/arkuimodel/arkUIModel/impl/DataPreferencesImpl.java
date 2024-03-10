/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.DataPreferences;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.DataPreferencesImpl#getPreferencesType <em>Preferences Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.DataPreferencesImpl#getPreferences <em>Preferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPreferencesImpl extends UIOperationImpl implements DataPreferences {
	/**
	 * The default value of the '{@link #getPreferencesType() <em>Preferences Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferencesType()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERENCES_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferencesType() <em>Preferences Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferencesType()
	 * @generated
	 * @ordered
	 */
	protected String preferencesType = PREFERENCES_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferences() <em>Preferences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferences()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferences()
	 * @generated
	 * @ordered
	 */
	protected String preferences = PREFERENCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.DATA_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreferencesType() {
		return preferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferencesType(String newPreferencesType) {
		String oldPreferencesType = preferencesType;
		preferencesType = newPreferencesType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES_TYPE,
					oldPreferencesType, preferencesType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreferences() {
		return preferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferences(String newPreferences) {
		String oldPreferences = preferences;
		preferences = newPreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES,
					oldPreferences, preferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES_TYPE:
			return getPreferencesType();
		case ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES:
			return getPreferences();
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
		case ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES_TYPE:
			setPreferencesType((String) newValue);
			return;
		case ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES:
			setPreferences((String) newValue);
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
		case ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES_TYPE:
			setPreferencesType(PREFERENCES_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES:
			setPreferences(PREFERENCES_EDEFAULT);
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
		case ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES_TYPE:
			return PREFERENCES_TYPE_EDEFAULT == null ? preferencesType != null
					: !PREFERENCES_TYPE_EDEFAULT.equals(preferencesType);
		case ArkUIModelPackage.DATA_PREFERENCES__PREFERENCES:
			return PREFERENCES_EDEFAULT == null ? preferences != null : !PREFERENCES_EDEFAULT.equals(preferences);
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
		result.append(" (preferencesType: ");
		result.append(preferencesType);
		result.append(", preferences: ");
		result.append(preferences);
		result.append(')');
		return result.toString();
	}

} //DataPreferencesImpl
