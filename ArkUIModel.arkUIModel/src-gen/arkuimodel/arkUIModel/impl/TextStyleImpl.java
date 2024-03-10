/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getMinFontSize <em>Min Font Size</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getMaxFontSize <em>Max Font Size</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getTextOverflow <em>Text Overflow</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getMaxLines <em>Max Lines</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getDecorationType <em>Decoration Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getTextCase <em>Text Case</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getBaselineOffset <em>Baseline Offset</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextStyleImpl#getDecorationColor <em>Decoration Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextStyleImpl extends StyleClassImpl implements TextStyle {
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
	 * The default value of the '{@link #getMinFontSize() <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinFontSize() <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFontSize()
	 * @generated
	 * @ordered
	 */
	protected String minFontSize = MIN_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxFontSize() <em>Max Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxFontSize() <em>Max Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFontSize()
	 * @generated
	 * @ordered
	 */
	protected String maxFontSize = MAX_FONT_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected String textAlign = TEXT_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineHeight() <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineHeight() <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected String lineHeight = LINE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextOverflow() <em>Text Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOverflow()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_OVERFLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextOverflow() <em>Text Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOverflow()
	 * @generated
	 * @ordered
	 */
	protected String textOverflow = TEXT_OVERFLOW_EDEFAULT;

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
	 * The default value of the '{@link #getMaxLines() <em>Max Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLines()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_LINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLines() <em>Max Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLines()
	 * @generated
	 * @ordered
	 */
	protected String maxLines = MAX_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecorationType() <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationType()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecorationType() <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationType()
	 * @generated
	 * @ordered
	 */
	protected String decorationType = DECORATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLetterSpacing() <em>Letter Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final String LETTER_SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLetterSpacing() <em>Letter Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterSpacing()
	 * @generated
	 * @ordered
	 */
	protected String letterSpacing = LETTER_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextCase() <em>Text Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCase()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextCase() <em>Text Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCase()
	 * @generated
	 * @ordered
	 */
	protected String textCase = TEXT_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaselineOffset() <em>Baseline Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String BASELINE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaselineOffset() <em>Baseline Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineOffset()
	 * @generated
	 * @ordered
	 */
	protected String baselineOffset = BASELINE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecorationColor() <em>Decoration Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationColor()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATION_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecorationColor() <em>Decoration Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationColor()
	 * @generated
	 * @ordered
	 */
	protected String decorationColor = DECORATION_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TEXT_STYLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__FONT_COLOR,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__FONT_SIZE, oldFontSize,
					fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinFontSize() {
		return minFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinFontSize(String newMinFontSize) {
		String oldMinFontSize = minFontSize;
		minFontSize = newMinFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__MIN_FONT_SIZE,
					oldMinFontSize, minFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxFontSize() {
		return maxFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFontSize(String newMaxFontSize) {
		String oldMaxFontSize = maxFontSize;
		maxFontSize = newMaxFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__MAX_FONT_SIZE,
					oldMaxFontSize, maxFontSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__FONT_STYLE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__FONT_WEIGHT,
					oldFontWeight, fontWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAlign() {
		return textAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlign(String newTextAlign) {
		String oldTextAlign = textAlign;
		textAlign = newTextAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__TEXT_ALIGN,
					oldTextAlign, textAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineHeight() {
		return lineHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineHeight(String newLineHeight) {
		String oldLineHeight = lineHeight;
		lineHeight = newLineHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__LINE_HEIGHT,
					oldLineHeight, lineHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextOverflow() {
		return textOverflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextOverflow(String newTextOverflow) {
		String oldTextOverflow = textOverflow;
		textOverflow = newTextOverflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__TEXT_OVERFLOW,
					oldTextOverflow, textOverflow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__FONT_FAMILY,
					oldFontFamily, fontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxLines() {
		return maxLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLines(String newMaxLines) {
		String oldMaxLines = maxLines;
		maxLines = newMaxLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__MAX_LINES, oldMaxLines,
					maxLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecorationType() {
		return decorationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorationType(String newDecorationType) {
		String oldDecorationType = decorationType;
		decorationType = newDecorationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__DECORATION_TYPE,
					oldDecorationType, decorationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLetterSpacing() {
		return letterSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetterSpacing(String newLetterSpacing) {
		String oldLetterSpacing = letterSpacing;
		letterSpacing = newLetterSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__LETTER_SPACING,
					oldLetterSpacing, letterSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextCase() {
		return textCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextCase(String newTextCase) {
		String oldTextCase = textCase;
		textCase = newTextCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__TEXT_CASE, oldTextCase,
					textCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaselineOffset() {
		return baselineOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaselineOffset(String newBaselineOffset) {
		String oldBaselineOffset = baselineOffset;
		baselineOffset = newBaselineOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__BASELINE_OFFSET,
					oldBaselineOffset, baselineOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecorationColor() {
		return decorationColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorationColor(String newDecorationColor) {
		String oldDecorationColor = decorationColor;
		decorationColor = newDecorationColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_STYLE__DECORATION_COLOR,
					oldDecorationColor, decorationColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.TEXT_STYLE__FONT_COLOR:
			return getFontColor();
		case ArkUIModelPackage.TEXT_STYLE__FONT_SIZE:
			return getFontSize();
		case ArkUIModelPackage.TEXT_STYLE__MIN_FONT_SIZE:
			return getMinFontSize();
		case ArkUIModelPackage.TEXT_STYLE__MAX_FONT_SIZE:
			return getMaxFontSize();
		case ArkUIModelPackage.TEXT_STYLE__FONT_STYLE:
			return getFontStyle();
		case ArkUIModelPackage.TEXT_STYLE__FONT_WEIGHT:
			return getFontWeight();
		case ArkUIModelPackage.TEXT_STYLE__TEXT_ALIGN:
			return getTextAlign();
		case ArkUIModelPackage.TEXT_STYLE__LINE_HEIGHT:
			return getLineHeight();
		case ArkUIModelPackage.TEXT_STYLE__TEXT_OVERFLOW:
			return getTextOverflow();
		case ArkUIModelPackage.TEXT_STYLE__FONT_FAMILY:
			return getFontFamily();
		case ArkUIModelPackage.TEXT_STYLE__MAX_LINES:
			return getMaxLines();
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_TYPE:
			return getDecorationType();
		case ArkUIModelPackage.TEXT_STYLE__LETTER_SPACING:
			return getLetterSpacing();
		case ArkUIModelPackage.TEXT_STYLE__TEXT_CASE:
			return getTextCase();
		case ArkUIModelPackage.TEXT_STYLE__BASELINE_OFFSET:
			return getBaselineOffset();
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_COLOR:
			return getDecorationColor();
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
		case ArkUIModelPackage.TEXT_STYLE__FONT_COLOR:
			setFontColor((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__FONT_SIZE:
			setFontSize((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__MIN_FONT_SIZE:
			setMinFontSize((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__MAX_FONT_SIZE:
			setMaxFontSize((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__FONT_STYLE:
			setFontStyle((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__FONT_WEIGHT:
			setFontWeight((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__TEXT_ALIGN:
			setTextAlign((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__LINE_HEIGHT:
			setLineHeight((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__TEXT_OVERFLOW:
			setTextOverflow((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__FONT_FAMILY:
			setFontFamily((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__MAX_LINES:
			setMaxLines((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_TYPE:
			setDecorationType((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__LETTER_SPACING:
			setLetterSpacing((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__TEXT_CASE:
			setTextCase((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__BASELINE_OFFSET:
			setBaselineOffset((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_COLOR:
			setDecorationColor((String) newValue);
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
		case ArkUIModelPackage.TEXT_STYLE__FONT_COLOR:
			setFontColor(FONT_COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__FONT_SIZE:
			setFontSize(FONT_SIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__MIN_FONT_SIZE:
			setMinFontSize(MIN_FONT_SIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__MAX_FONT_SIZE:
			setMaxFontSize(MAX_FONT_SIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__FONT_STYLE:
			setFontStyle(FONT_STYLE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__FONT_WEIGHT:
			setFontWeight(FONT_WEIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__TEXT_ALIGN:
			setTextAlign(TEXT_ALIGN_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__LINE_HEIGHT:
			setLineHeight(LINE_HEIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__TEXT_OVERFLOW:
			setTextOverflow(TEXT_OVERFLOW_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__FONT_FAMILY:
			setFontFamily(FONT_FAMILY_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__MAX_LINES:
			setMaxLines(MAX_LINES_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_TYPE:
			setDecorationType(DECORATION_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__LETTER_SPACING:
			setLetterSpacing(LETTER_SPACING_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__TEXT_CASE:
			setTextCase(TEXT_CASE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__BASELINE_OFFSET:
			setBaselineOffset(BASELINE_OFFSET_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_COLOR:
			setDecorationColor(DECORATION_COLOR_EDEFAULT);
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
		case ArkUIModelPackage.TEXT_STYLE__FONT_COLOR:
			return FONT_COLOR_EDEFAULT == null ? fontColor != null : !FONT_COLOR_EDEFAULT.equals(fontColor);
		case ArkUIModelPackage.TEXT_STYLE__FONT_SIZE:
			return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
		case ArkUIModelPackage.TEXT_STYLE__MIN_FONT_SIZE:
			return MIN_FONT_SIZE_EDEFAULT == null ? minFontSize != null : !MIN_FONT_SIZE_EDEFAULT.equals(minFontSize);
		case ArkUIModelPackage.TEXT_STYLE__MAX_FONT_SIZE:
			return MAX_FONT_SIZE_EDEFAULT == null ? maxFontSize != null : !MAX_FONT_SIZE_EDEFAULT.equals(maxFontSize);
		case ArkUIModelPackage.TEXT_STYLE__FONT_STYLE:
			return FONT_STYLE_EDEFAULT == null ? fontStyle != null : !FONT_STYLE_EDEFAULT.equals(fontStyle);
		case ArkUIModelPackage.TEXT_STYLE__FONT_WEIGHT:
			return FONT_WEIGHT_EDEFAULT == null ? fontWeight != null : !FONT_WEIGHT_EDEFAULT.equals(fontWeight);
		case ArkUIModelPackage.TEXT_STYLE__TEXT_ALIGN:
			return TEXT_ALIGN_EDEFAULT == null ? textAlign != null : !TEXT_ALIGN_EDEFAULT.equals(textAlign);
		case ArkUIModelPackage.TEXT_STYLE__LINE_HEIGHT:
			return LINE_HEIGHT_EDEFAULT == null ? lineHeight != null : !LINE_HEIGHT_EDEFAULT.equals(lineHeight);
		case ArkUIModelPackage.TEXT_STYLE__TEXT_OVERFLOW:
			return TEXT_OVERFLOW_EDEFAULT == null ? textOverflow != null : !TEXT_OVERFLOW_EDEFAULT.equals(textOverflow);
		case ArkUIModelPackage.TEXT_STYLE__FONT_FAMILY:
			return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
		case ArkUIModelPackage.TEXT_STYLE__MAX_LINES:
			return MAX_LINES_EDEFAULT == null ? maxLines != null : !MAX_LINES_EDEFAULT.equals(maxLines);
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_TYPE:
			return DECORATION_TYPE_EDEFAULT == null ? decorationType != null
					: !DECORATION_TYPE_EDEFAULT.equals(decorationType);
		case ArkUIModelPackage.TEXT_STYLE__LETTER_SPACING:
			return LETTER_SPACING_EDEFAULT == null ? letterSpacing != null
					: !LETTER_SPACING_EDEFAULT.equals(letterSpacing);
		case ArkUIModelPackage.TEXT_STYLE__TEXT_CASE:
			return TEXT_CASE_EDEFAULT == null ? textCase != null : !TEXT_CASE_EDEFAULT.equals(textCase);
		case ArkUIModelPackage.TEXT_STYLE__BASELINE_OFFSET:
			return BASELINE_OFFSET_EDEFAULT == null ? baselineOffset != null
					: !BASELINE_OFFSET_EDEFAULT.equals(baselineOffset);
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_COLOR:
			return DECORATION_COLOR_EDEFAULT == null ? decorationColor != null
					: !DECORATION_COLOR_EDEFAULT.equals(decorationColor);
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
		result.append(" (fontColor: ");
		result.append(fontColor);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", minFontSize: ");
		result.append(minFontSize);
		result.append(", maxFontSize: ");
		result.append(maxFontSize);
		result.append(", fontStyle: ");
		result.append(fontStyle);
		result.append(", fontWeight: ");
		result.append(fontWeight);
		result.append(", textAlign: ");
		result.append(textAlign);
		result.append(", lineHeight: ");
		result.append(lineHeight);
		result.append(", textOverflow: ");
		result.append(textOverflow);
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", maxLines: ");
		result.append(maxLines);
		result.append(", decorationType: ");
		result.append(decorationType);
		result.append(", letterSpacing: ");
		result.append(letterSpacing);
		result.append(", textCase: ");
		result.append(textCase);
		result.append(", baselineOffset: ");
		result.append(baselineOffset);
		result.append(", decorationColor: ");
		result.append(decorationColor);
		result.append(')');
		return result.toString();
	}

} //TextStyleImpl
