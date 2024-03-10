/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextPickerStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Picker Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextPickerStyleImpl#getRange <em>Range</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextPickerStyleImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextPickerStyleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextPickerStyleImpl#getDefaultPickerItemHeight <em>Default Picker Item Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextPickerStyleImpl extends StyleClassImpl implements TextPickerStyle {
	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected String range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected String selected = SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPickerItemHeight() <em>Default Picker Item Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPickerItemHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PICKER_ITEM_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultPickerItemHeight() <em>Default Picker Item Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPickerItemHeight()
	 * @generated
	 * @ordered
	 */
	protected String defaultPickerItemHeight = DEFAULT_PICKER_ITEM_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextPickerStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TEXT_PICKER_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(String newRange) {
		String oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_PICKER_STYLE__RANGE, oldRange,
					range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(String newSelected) {
		String oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_PICKER_STYLE__SELECTED,
					oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_PICKER_STYLE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultPickerItemHeight() {
		return defaultPickerItemHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPickerItemHeight(String newDefaultPickerItemHeight) {
		String oldDefaultPickerItemHeight = defaultPickerItemHeight;
		defaultPickerItemHeight = newDefaultPickerItemHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TEXT_PICKER_STYLE__DEFAULT_PICKER_ITEM_HEIGHT, oldDefaultPickerItemHeight,
					defaultPickerItemHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.TEXT_PICKER_STYLE__RANGE:
			return getRange();
		case ArkUIModelPackage.TEXT_PICKER_STYLE__SELECTED:
			return getSelected();
		case ArkUIModelPackage.TEXT_PICKER_STYLE__VALUE:
			return getValue();
		case ArkUIModelPackage.TEXT_PICKER_STYLE__DEFAULT_PICKER_ITEM_HEIGHT:
			return getDefaultPickerItemHeight();
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
		case ArkUIModelPackage.TEXT_PICKER_STYLE__RANGE:
			setRange((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_PICKER_STYLE__SELECTED:
			setSelected((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_PICKER_STYLE__VALUE:
			setValue((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_PICKER_STYLE__DEFAULT_PICKER_ITEM_HEIGHT:
			setDefaultPickerItemHeight((String) newValue);
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
		case ArkUIModelPackage.TEXT_PICKER_STYLE__RANGE:
			setRange(RANGE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_PICKER_STYLE__SELECTED:
			setSelected(SELECTED_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_PICKER_STYLE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_PICKER_STYLE__DEFAULT_PICKER_ITEM_HEIGHT:
			setDefaultPickerItemHeight(DEFAULT_PICKER_ITEM_HEIGHT_EDEFAULT);
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
		case ArkUIModelPackage.TEXT_PICKER_STYLE__RANGE:
			return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
		case ArkUIModelPackage.TEXT_PICKER_STYLE__SELECTED:
			return SELECTED_EDEFAULT == null ? selected != null : !SELECTED_EDEFAULT.equals(selected);
		case ArkUIModelPackage.TEXT_PICKER_STYLE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ArkUIModelPackage.TEXT_PICKER_STYLE__DEFAULT_PICKER_ITEM_HEIGHT:
			return DEFAULT_PICKER_ITEM_HEIGHT_EDEFAULT == null ? defaultPickerItemHeight != null
					: !DEFAULT_PICKER_ITEM_HEIGHT_EDEFAULT.equals(defaultPickerItemHeight);
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
		result.append(" (range: ");
		result.append(range);
		result.append(", selected: ");
		result.append(selected);
		result.append(", value: ");
		result.append(value);
		result.append(", defaultPickerItemHeight: ");
		result.append(defaultPickerItemHeight);
		result.append(')');
		return result.toString();
	}

} //TextPickerStyleImpl
