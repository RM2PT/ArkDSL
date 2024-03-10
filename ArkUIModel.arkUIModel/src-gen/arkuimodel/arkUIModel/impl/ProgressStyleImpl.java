/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ProgressStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressStyleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressStyleImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressStyleImpl#getScaleCount <em>Scale Count</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressStyleImpl#getScaleWidth <em>Scale Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressStyleImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressStyleImpl extends StyleClassImpl implements ProgressStyle {
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
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected String strokeWidth = STROKE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleCount() <em>Scale Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleCount()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleCount() <em>Scale Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleCount()
	 * @generated
	 * @ordered
	 */
	protected String scaleCount = SCALE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleWidth() <em>Scale Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleWidth() <em>Scale Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleWidth()
	 * @generated
	 * @ordered
	 */
	protected String scaleWidth = SCALE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.PROGRESS_STYLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_STYLE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(String newStrokeWidth) {
		String oldStrokeWidth = strokeWidth;
		strokeWidth = newStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_STYLE__STROKE_WIDTH,
					oldStrokeWidth, strokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleCount() {
		return scaleCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleCount(String newScaleCount) {
		String oldScaleCount = scaleCount;
		scaleCount = newScaleCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_STYLE__SCALE_COUNT,
					oldScaleCount, scaleCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleWidth() {
		return scaleWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleWidth(String newScaleWidth) {
		String oldScaleWidth = scaleWidth;
		scaleWidth = newScaleWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_STYLE__SCALE_WIDTH,
					oldScaleWidth, scaleWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_STYLE__COLOR, oldColor,
					color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.PROGRESS_STYLE__VALUE:
			return getValue();
		case ArkUIModelPackage.PROGRESS_STYLE__STROKE_WIDTH:
			return getStrokeWidth();
		case ArkUIModelPackage.PROGRESS_STYLE__SCALE_COUNT:
			return getScaleCount();
		case ArkUIModelPackage.PROGRESS_STYLE__SCALE_WIDTH:
			return getScaleWidth();
		case ArkUIModelPackage.PROGRESS_STYLE__COLOR:
			return getColor();
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
		case ArkUIModelPackage.PROGRESS_STYLE__VALUE:
			setValue((String) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_STYLE__STROKE_WIDTH:
			setStrokeWidth((String) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_STYLE__SCALE_COUNT:
			setScaleCount((String) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_STYLE__SCALE_WIDTH:
			setScaleWidth((String) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_STYLE__COLOR:
			setColor((String) newValue);
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
		case ArkUIModelPackage.PROGRESS_STYLE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ArkUIModelPackage.PROGRESS_STYLE__STROKE_WIDTH:
			setStrokeWidth(STROKE_WIDTH_EDEFAULT);
			return;
		case ArkUIModelPackage.PROGRESS_STYLE__SCALE_COUNT:
			setScaleCount(SCALE_COUNT_EDEFAULT);
			return;
		case ArkUIModelPackage.PROGRESS_STYLE__SCALE_WIDTH:
			setScaleWidth(SCALE_WIDTH_EDEFAULT);
			return;
		case ArkUIModelPackage.PROGRESS_STYLE__COLOR:
			setColor(COLOR_EDEFAULT);
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
		case ArkUIModelPackage.PROGRESS_STYLE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ArkUIModelPackage.PROGRESS_STYLE__STROKE_WIDTH:
			return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
		case ArkUIModelPackage.PROGRESS_STYLE__SCALE_COUNT:
			return SCALE_COUNT_EDEFAULT == null ? scaleCount != null : !SCALE_COUNT_EDEFAULT.equals(scaleCount);
		case ArkUIModelPackage.PROGRESS_STYLE__SCALE_WIDTH:
			return SCALE_WIDTH_EDEFAULT == null ? scaleWidth != null : !SCALE_WIDTH_EDEFAULT.equals(scaleWidth);
		case ArkUIModelPackage.PROGRESS_STYLE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", strokeWidth: ");
		result.append(strokeWidth);
		result.append(", scaleCount: ");
		result.append(scaleCount);
		result.append(", scaleWidth: ");
		result.append(scaleWidth);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //ProgressStyleImpl
