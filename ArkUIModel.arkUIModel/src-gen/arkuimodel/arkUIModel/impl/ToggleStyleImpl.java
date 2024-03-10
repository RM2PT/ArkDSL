/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ToggleStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toggle Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ToggleStyleImpl#getSelectedColor <em>Selected Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ToggleStyleImpl#getSwitchPointColor <em>Switch Point Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToggleStyleImpl extends StyleClassImpl implements ToggleStyle {
	/**
	 * The default value of the '{@link #getSelectedColor() <em>Selected Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedColor() <em>Selected Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedColor()
	 * @generated
	 * @ordered
	 */
	protected String selectedColor = SELECTED_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchPointColor() <em>Switch Point Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchPointColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SWITCH_POINT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchPointColor() <em>Switch Point Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchPointColor()
	 * @generated
	 * @ordered
	 */
	protected String switchPointColor = SWITCH_POINT_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToggleStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TOGGLE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectedColor() {
		return selectedColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedColor(String newSelectedColor) {
		String oldSelectedColor = selectedColor;
		selectedColor = newSelectedColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TOGGLE_STYLE__SELECTED_COLOR,
					oldSelectedColor, selectedColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwitchPointColor() {
		return switchPointColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchPointColor(String newSwitchPointColor) {
		String oldSwitchPointColor = switchPointColor;
		switchPointColor = newSwitchPointColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TOGGLE_STYLE__SWITCH_POINT_COLOR,
					oldSwitchPointColor, switchPointColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.TOGGLE_STYLE__SELECTED_COLOR:
			return getSelectedColor();
		case ArkUIModelPackage.TOGGLE_STYLE__SWITCH_POINT_COLOR:
			return getSwitchPointColor();
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
		case ArkUIModelPackage.TOGGLE_STYLE__SELECTED_COLOR:
			setSelectedColor((String) newValue);
			return;
		case ArkUIModelPackage.TOGGLE_STYLE__SWITCH_POINT_COLOR:
			setSwitchPointColor((String) newValue);
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
		case ArkUIModelPackage.TOGGLE_STYLE__SELECTED_COLOR:
			setSelectedColor(SELECTED_COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.TOGGLE_STYLE__SWITCH_POINT_COLOR:
			setSwitchPointColor(SWITCH_POINT_COLOR_EDEFAULT);
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
		case ArkUIModelPackage.TOGGLE_STYLE__SELECTED_COLOR:
			return SELECTED_COLOR_EDEFAULT == null ? selectedColor != null
					: !SELECTED_COLOR_EDEFAULT.equals(selectedColor);
		case ArkUIModelPackage.TOGGLE_STYLE__SWITCH_POINT_COLOR:
			return SWITCH_POINT_COLOR_EDEFAULT == null ? switchPointColor != null
					: !SWITCH_POINT_COLOR_EDEFAULT.equals(switchPointColor);
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
		result.append(" (selectedColor: ");
		result.append(selectedColor);
		result.append(", switchPointColor: ");
		result.append(switchPointColor);
		result.append(')');
		return result.toString();
	}

} //ToggleStyleImpl
