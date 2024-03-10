/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.CustomDialogStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Dialog Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogStyleImpl#getAutoCancel <em>Auto Cancel</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogStyleImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogStyleImpl#getOffsetx <em>Offsetx</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogStyleImpl#getOffsety <em>Offsety</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogStyleImpl#getCustomStyle <em>Custom Style</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogStyleImpl#getGridCount <em>Grid Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomDialogStyleImpl extends StyleClassImpl implements CustomDialogStyle {
	/**
	 * The default value of the '{@link #getAutoCancel() <em>Auto Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCancel()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_CANCEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoCancel() <em>Auto Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCancel()
	 * @generated
	 * @ordered
	 */
	protected String autoCancel = AUTO_CANCEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected String alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetx() <em>Offsetx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetx()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSETX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffsetx() <em>Offsetx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetx()
	 * @generated
	 * @ordered
	 */
	protected String offsetx = OFFSETX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsety() <em>Offsety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsety()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSETY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffsety() <em>Offsety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsety()
	 * @generated
	 * @ordered
	 */
	protected String offsety = OFFSETY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomStyle() <em>Custom Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomStyle() <em>Custom Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomStyle()
	 * @generated
	 * @ordered
	 */
	protected String customStyle = CUSTOM_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridCount() <em>Grid Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridCount()
	 * @generated
	 * @ordered
	 */
	protected static final String GRID_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGridCount() <em>Grid Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridCount()
	 * @generated
	 * @ordered
	 */
	protected String gridCount = GRID_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomDialogStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.CUSTOM_DIALOG_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoCancel() {
		return autoCancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoCancel(String newAutoCancel) {
		String oldAutoCancel = autoCancel;
		autoCancel = newAutoCancel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CUSTOM_DIALOG_STYLE__AUTO_CANCEL,
					oldAutoCancel, autoCancel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(String newAlignment) {
		String oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CUSTOM_DIALOG_STYLE__ALIGNMENT,
					oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffsetx() {
		return offsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetx(String newOffsetx) {
		String oldOffsetx = offsetx;
		offsetx = newOffsetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETX,
					oldOffsetx, offsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffsety() {
		return offsety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsety(String newOffsety) {
		String oldOffsety = offsety;
		offsety = newOffsety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETY,
					oldOffsety, offsety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomStyle() {
		return customStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomStyle(String newCustomStyle) {
		String oldCustomStyle = customStyle;
		customStyle = newCustomStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CUSTOM_DIALOG_STYLE__CUSTOM_STYLE,
					oldCustomStyle, customStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGridCount() {
		return gridCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridCount(String newGridCount) {
		String oldGridCount = gridCount;
		gridCount = newGridCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.CUSTOM_DIALOG_STYLE__GRID_COUNT,
					oldGridCount, gridCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__AUTO_CANCEL:
			return getAutoCancel();
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__ALIGNMENT:
			return getAlignment();
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETX:
			return getOffsetx();
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETY:
			return getOffsety();
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__CUSTOM_STYLE:
			return getCustomStyle();
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__GRID_COUNT:
			return getGridCount();
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
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__AUTO_CANCEL:
			setAutoCancel((String) newValue);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__ALIGNMENT:
			setAlignment((String) newValue);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETX:
			setOffsetx((String) newValue);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETY:
			setOffsety((String) newValue);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__CUSTOM_STYLE:
			setCustomStyle((String) newValue);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__GRID_COUNT:
			setGridCount((String) newValue);
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
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__AUTO_CANCEL:
			setAutoCancel(AUTO_CANCEL_EDEFAULT);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__ALIGNMENT:
			setAlignment(ALIGNMENT_EDEFAULT);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETX:
			setOffsetx(OFFSETX_EDEFAULT);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETY:
			setOffsety(OFFSETY_EDEFAULT);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__CUSTOM_STYLE:
			setCustomStyle(CUSTOM_STYLE_EDEFAULT);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__GRID_COUNT:
			setGridCount(GRID_COUNT_EDEFAULT);
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
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__AUTO_CANCEL:
			return AUTO_CANCEL_EDEFAULT == null ? autoCancel != null : !AUTO_CANCEL_EDEFAULT.equals(autoCancel);
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__ALIGNMENT:
			return ALIGNMENT_EDEFAULT == null ? alignment != null : !ALIGNMENT_EDEFAULT.equals(alignment);
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETX:
			return OFFSETX_EDEFAULT == null ? offsetx != null : !OFFSETX_EDEFAULT.equals(offsetx);
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETY:
			return OFFSETY_EDEFAULT == null ? offsety != null : !OFFSETY_EDEFAULT.equals(offsety);
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__CUSTOM_STYLE:
			return CUSTOM_STYLE_EDEFAULT == null ? customStyle != null : !CUSTOM_STYLE_EDEFAULT.equals(customStyle);
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__GRID_COUNT:
			return GRID_COUNT_EDEFAULT == null ? gridCount != null : !GRID_COUNT_EDEFAULT.equals(gridCount);
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
		result.append(" (autoCancel: ");
		result.append(autoCancel);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", offsetx: ");
		result.append(offsetx);
		result.append(", offsety: ");
		result.append(offsety);
		result.append(", customStyle: ");
		result.append(customStyle);
		result.append(", gridCount: ");
		result.append(gridCount);
		result.append(')');
		return result.toString();
	}

} //CustomDialogStyleImpl
