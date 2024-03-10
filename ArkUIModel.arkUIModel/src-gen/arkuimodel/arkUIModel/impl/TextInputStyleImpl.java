/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextInputStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getPlaceholderColor <em>Placeholder Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getPlaceholderFont <em>Placeholder Font</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getEnterKeyType <em>Enter Key Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getCaretColor <em>Caret Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl#getInputFilter <em>Input Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextInputStyleImpl extends StyleClassImpl implements TextInputStyle {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholderColor() <em>Placeholder Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderColor()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderColor() <em>Placeholder Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderColor()
	 * @generated
	 * @ordered
	 */
	protected String placeholderColor = PLACEHOLDER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholderFont() <em>Placeholder Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderFont()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderFont() <em>Placeholder Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderFont()
	 * @generated
	 * @ordered
	 */
	protected String placeholderFont = PLACEHOLDER_FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnterKeyType() <em>Enter Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterKeyType()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTER_KEY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterKeyType() <em>Enter Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterKeyType()
	 * @generated
	 * @ordered
	 */
	protected String enterKeyType = ENTER_KEY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaretColor() <em>Caret Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaretColor()
	 * @generated
	 * @ordered
	 */
	protected static final String CARET_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaretColor() <em>Caret Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaretColor()
	 * @generated
	 * @ordered
	 */
	protected String caretColor = CARET_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected String maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected String fontColor = FONT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected String fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected String fontStyle = FONT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected String fontWeight = FONT_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected String fontFamily = FONT_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputFilter() <em>Input Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputFilter() <em>Input Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFilter()
	 * @generated
	 * @ordered
	 */
	protected String inputFilter = INPUT_FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TEXT_INPUT_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholderColor() {
		return placeholderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholderColor(String newPlaceholderColor) {
		String oldPlaceholderColor = placeholderColor;
		placeholderColor = newPlaceholderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_COLOR,
					oldPlaceholderColor, placeholderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholderFont() {
		return placeholderFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholderFont(String newPlaceholderFont) {
		String oldPlaceholderFont = placeholderFont;
		placeholderFont = newPlaceholderFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_FONT,
					oldPlaceholderFont, placeholderFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnterKeyType() {
		return enterKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterKeyType(String newEnterKeyType) {
		String oldEnterKeyType = enterKeyType;
		enterKeyType = newEnterKeyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__ENTER_KEY_TYPE,
					oldEnterKeyType, enterKeyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaretColor() {
		return caretColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaretColor(String newCaretColor) {
		String oldCaretColor = caretColor;
		caretColor = newCaretColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__CARET_COLOR,
					oldCaretColor, caretColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(String newMaxLength) {
		String oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__MAX_LENGTH,
					oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontColor() {
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontColor(String newFontColor) {
		String oldFontColor = fontColor;
		fontColor = newFontColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_COLOR,
					oldFontColor, fontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(String newFontSize) {
		String oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_SIZE,
					oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyle() {
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(String newFontStyle) {
		String oldFontStyle = fontStyle;
		fontStyle = newFontStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_STYLE,
					oldFontStyle, fontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontWeight() {
		return fontWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(String newFontWeight) {
		String oldFontWeight = fontWeight;
		fontWeight = newFontWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_WEIGHT,
					oldFontWeight, fontWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamily() {
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(String newFontFamily) {
		String oldFontFamily = fontFamily;
		fontFamily = newFontFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_FAMILY,
					oldFontFamily, fontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputFilter() {
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFilter(String newInputFilter) {
		String oldInputFilter = inputFilter;
		inputFilter = newInputFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_STYLE__INPUT_FILTER,
					oldInputFilter, inputFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.TEXT_INPUT_STYLE__TYPE:
			return getType();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_COLOR:
			return getPlaceholderColor();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_FONT:
			return getPlaceholderFont();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__ENTER_KEY_TYPE:
			return getEnterKeyType();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__CARET_COLOR:
			return getCaretColor();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__MAX_LENGTH:
			return getMaxLength();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_COLOR:
			return getFontColor();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_SIZE:
			return getFontSize();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_STYLE:
			return getFontStyle();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_WEIGHT:
			return getFontWeight();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_FAMILY:
			return getFontFamily();
		case ArkUIModelPackage.TEXT_INPUT_STYLE__INPUT_FILTER:
			return getInputFilter();
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
		case ArkUIModelPackage.TEXT_INPUT_STYLE__TYPE:
			setType((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_COLOR:
			setPlaceholderColor((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_FONT:
			setPlaceholderFont((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__ENTER_KEY_TYPE:
			setEnterKeyType((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__CARET_COLOR:
			setCaretColor((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__MAX_LENGTH:
			setMaxLength((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_COLOR:
			setFontColor((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_SIZE:
			setFontSize((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_STYLE:
			setFontStyle((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_WEIGHT:
			setFontWeight((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_FAMILY:
			setFontFamily((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__INPUT_FILTER:
			setInputFilter((String) newValue);
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
		case ArkUIModelPackage.TEXT_INPUT_STYLE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_COLOR:
			setPlaceholderColor(PLACEHOLDER_COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_FONT:
			setPlaceholderFont(PLACEHOLDER_FONT_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__ENTER_KEY_TYPE:
			setEnterKeyType(ENTER_KEY_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__CARET_COLOR:
			setCaretColor(CARET_COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__MAX_LENGTH:
			setMaxLength(MAX_LENGTH_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_COLOR:
			setFontColor(FONT_COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_SIZE:
			setFontSize(FONT_SIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_STYLE:
			setFontStyle(FONT_STYLE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_WEIGHT:
			setFontWeight(FONT_WEIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_FAMILY:
			setFontFamily(FONT_FAMILY_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_STYLE__INPUT_FILTER:
			setInputFilter(INPUT_FILTER_EDEFAULT);
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
		case ArkUIModelPackage.TEXT_INPUT_STYLE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_COLOR:
			return PLACEHOLDER_COLOR_EDEFAULT == null ? placeholderColor != null
					: !PLACEHOLDER_COLOR_EDEFAULT.equals(placeholderColor);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_FONT:
			return PLACEHOLDER_FONT_EDEFAULT == null ? placeholderFont != null
					: !PLACEHOLDER_FONT_EDEFAULT.equals(placeholderFont);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__ENTER_KEY_TYPE:
			return ENTER_KEY_TYPE_EDEFAULT == null ? enterKeyType != null
					: !ENTER_KEY_TYPE_EDEFAULT.equals(enterKeyType);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__CARET_COLOR:
			return CARET_COLOR_EDEFAULT == null ? caretColor != null : !CARET_COLOR_EDEFAULT.equals(caretColor);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__MAX_LENGTH:
			return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_COLOR:
			return FONT_COLOR_EDEFAULT == null ? fontColor != null : !FONT_COLOR_EDEFAULT.equals(fontColor);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_SIZE:
			return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_STYLE:
			return FONT_STYLE_EDEFAULT == null ? fontStyle != null : !FONT_STYLE_EDEFAULT.equals(fontStyle);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_WEIGHT:
			return FONT_WEIGHT_EDEFAULT == null ? fontWeight != null : !FONT_WEIGHT_EDEFAULT.equals(fontWeight);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_FAMILY:
			return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
		case ArkUIModelPackage.TEXT_INPUT_STYLE__INPUT_FILTER:
			return INPUT_FILTER_EDEFAULT == null ? inputFilter != null : !INPUT_FILTER_EDEFAULT.equals(inputFilter);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", placeholderColor: ");
		result.append(placeholderColor);
		result.append(", placeholderFont: ");
		result.append(placeholderFont);
		result.append(", enterKeyType: ");
		result.append(enterKeyType);
		result.append(", caretColor: ");
		result.append(caretColor);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", fontColor: ");
		result.append(fontColor);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", fontStyle: ");
		result.append(fontStyle);
		result.append(", fontWeight: ");
		result.append(fontWeight);
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", inputFilter: ");
		result.append(inputFilter);
		result.append(')');
		return result.toString();
	}

} //TextInputStyleImpl
