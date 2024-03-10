/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.DividerStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Divider Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.DividerStyleImpl#getVertical <em>Vertical</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.DividerStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.DividerStyleImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.DividerStyleImpl#getLineCap <em>Line Cap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DividerStyleImpl extends StyleClassImpl implements DividerStyle {
	/**
	 * The default value of the '{@link #getVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical()
	 * @generated
	 * @ordered
	 */
	protected static final String VERTICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical()
	 * @generated
	 * @ordered
	 */
	protected String vertical = VERTICAL_EDEFAULT;

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
	 * The default value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCap()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_CAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCap()
	 * @generated
	 * @ordered
	 */
	protected String lineCap = LINE_CAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DividerStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.DIVIDER_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVertical() {
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertical(String newVertical) {
		String oldVertical = vertical;
		vertical = newVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DIVIDER_STYLE__VERTICAL,
					oldVertical, vertical));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DIVIDER_STYLE__COLOR, oldColor,
					color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DIVIDER_STYLE__STROKE_WIDTH,
					oldStrokeWidth, strokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineCap() {
		return lineCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineCap(String newLineCap) {
		String oldLineCap = lineCap;
		lineCap = newLineCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DIVIDER_STYLE__LINE_CAP, oldLineCap,
					lineCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.DIVIDER_STYLE__VERTICAL:
			return getVertical();
		case ArkUIModelPackage.DIVIDER_STYLE__COLOR:
			return getColor();
		case ArkUIModelPackage.DIVIDER_STYLE__STROKE_WIDTH:
			return getStrokeWidth();
		case ArkUIModelPackage.DIVIDER_STYLE__LINE_CAP:
			return getLineCap();
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
		case ArkUIModelPackage.DIVIDER_STYLE__VERTICAL:
			setVertical((String) newValue);
			return;
		case ArkUIModelPackage.DIVIDER_STYLE__COLOR:
			setColor((String) newValue);
			return;
		case ArkUIModelPackage.DIVIDER_STYLE__STROKE_WIDTH:
			setStrokeWidth((String) newValue);
			return;
		case ArkUIModelPackage.DIVIDER_STYLE__LINE_CAP:
			setLineCap((String) newValue);
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
		case ArkUIModelPackage.DIVIDER_STYLE__VERTICAL:
			setVertical(VERTICAL_EDEFAULT);
			return;
		case ArkUIModelPackage.DIVIDER_STYLE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.DIVIDER_STYLE__STROKE_WIDTH:
			setStrokeWidth(STROKE_WIDTH_EDEFAULT);
			return;
		case ArkUIModelPackage.DIVIDER_STYLE__LINE_CAP:
			setLineCap(LINE_CAP_EDEFAULT);
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
		case ArkUIModelPackage.DIVIDER_STYLE__VERTICAL:
			return VERTICAL_EDEFAULT == null ? vertical != null : !VERTICAL_EDEFAULT.equals(vertical);
		case ArkUIModelPackage.DIVIDER_STYLE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case ArkUIModelPackage.DIVIDER_STYLE__STROKE_WIDTH:
			return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
		case ArkUIModelPackage.DIVIDER_STYLE__LINE_CAP:
			return LINE_CAP_EDEFAULT == null ? lineCap != null : !LINE_CAP_EDEFAULT.equals(lineCap);
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
		result.append(" (vertical: ");
		result.append(vertical);
		result.append(", color: ");
		result.append(color);
		result.append(", strokeWidth: ");
		result.append(strokeWidth);
		result.append(", lineCap: ");
		result.append(lineCap);
		result.append(')');
		return result.toString();
	}

} //DividerStyleImpl
