/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TabsStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabs Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsStyleImpl#getScrollable <em>Scrollable</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsStyleImpl#getBarMode <em>Bar Mode</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsStyleImpl#getVertical <em>Vertical</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsStyleImpl#getBarWidth <em>Bar Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsStyleImpl#getBarHeight <em>Bar Height</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsStyleImpl#getAnimationDuration <em>Animation Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabsStyleImpl extends StyleClassImpl implements TabsStyle {
	/**
	 * The default value of the '{@link #getScrollable() <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollable()
	 * @generated
	 * @ordered
	 */
	protected static final String SCROLLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScrollable() <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollable()
	 * @generated
	 * @ordered
	 */
	protected String scrollable = SCROLLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarMode() <em>Bar Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BAR_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarMode() <em>Bar Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarMode()
	 * @generated
	 * @ordered
	 */
	protected String barMode = BAR_MODE_EDEFAULT;

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
	 * The default value of the '{@link #getBarWidth() <em>Bar Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String BAR_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarWidth() <em>Bar Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarWidth()
	 * @generated
	 * @ordered
	 */
	protected String barWidth = BAR_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarHeight() <em>Bar Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String BAR_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarHeight() <em>Bar Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarHeight()
	 * @generated
	 * @ordered
	 */
	protected String barHeight = BAR_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnimationDuration() <em>Animation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String ANIMATION_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnimationDuration() <em>Animation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationDuration()
	 * @generated
	 * @ordered
	 */
	protected String animationDuration = ANIMATION_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabsStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TABS_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScrollable() {
		return scrollable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollable(String newScrollable) {
		String oldScrollable = scrollable;
		scrollable = newScrollable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_STYLE__SCROLLABLE,
					oldScrollable, scrollable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBarMode() {
		return barMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarMode(String newBarMode) {
		String oldBarMode = barMode;
		barMode = newBarMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_STYLE__BAR_MODE, oldBarMode,
					barMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_STYLE__VERTICAL, oldVertical,
					vertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBarWidth() {
		return barWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarWidth(String newBarWidth) {
		String oldBarWidth = barWidth;
		barWidth = newBarWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_STYLE__BAR_WIDTH, oldBarWidth,
					barWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBarHeight() {
		return barHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarHeight(String newBarHeight) {
		String oldBarHeight = barHeight;
		barHeight = newBarHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_STYLE__BAR_HEIGHT,
					oldBarHeight, barHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnimationDuration() {
		return animationDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimationDuration(String newAnimationDuration) {
		String oldAnimationDuration = animationDuration;
		animationDuration = newAnimationDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_STYLE__ANIMATION_DURATION,
					oldAnimationDuration, animationDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.TABS_STYLE__SCROLLABLE:
			return getScrollable();
		case ArkUIModelPackage.TABS_STYLE__BAR_MODE:
			return getBarMode();
		case ArkUIModelPackage.TABS_STYLE__VERTICAL:
			return getVertical();
		case ArkUIModelPackage.TABS_STYLE__BAR_WIDTH:
			return getBarWidth();
		case ArkUIModelPackage.TABS_STYLE__BAR_HEIGHT:
			return getBarHeight();
		case ArkUIModelPackage.TABS_STYLE__ANIMATION_DURATION:
			return getAnimationDuration();
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
		case ArkUIModelPackage.TABS_STYLE__SCROLLABLE:
			setScrollable((String) newValue);
			return;
		case ArkUIModelPackage.TABS_STYLE__BAR_MODE:
			setBarMode((String) newValue);
			return;
		case ArkUIModelPackage.TABS_STYLE__VERTICAL:
			setVertical((String) newValue);
			return;
		case ArkUIModelPackage.TABS_STYLE__BAR_WIDTH:
			setBarWidth((String) newValue);
			return;
		case ArkUIModelPackage.TABS_STYLE__BAR_HEIGHT:
			setBarHeight((String) newValue);
			return;
		case ArkUIModelPackage.TABS_STYLE__ANIMATION_DURATION:
			setAnimationDuration((String) newValue);
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
		case ArkUIModelPackage.TABS_STYLE__SCROLLABLE:
			setScrollable(SCROLLABLE_EDEFAULT);
			return;
		case ArkUIModelPackage.TABS_STYLE__BAR_MODE:
			setBarMode(BAR_MODE_EDEFAULT);
			return;
		case ArkUIModelPackage.TABS_STYLE__VERTICAL:
			setVertical(VERTICAL_EDEFAULT);
			return;
		case ArkUIModelPackage.TABS_STYLE__BAR_WIDTH:
			setBarWidth(BAR_WIDTH_EDEFAULT);
			return;
		case ArkUIModelPackage.TABS_STYLE__BAR_HEIGHT:
			setBarHeight(BAR_HEIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.TABS_STYLE__ANIMATION_DURATION:
			setAnimationDuration(ANIMATION_DURATION_EDEFAULT);
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
		case ArkUIModelPackage.TABS_STYLE__SCROLLABLE:
			return SCROLLABLE_EDEFAULT == null ? scrollable != null : !SCROLLABLE_EDEFAULT.equals(scrollable);
		case ArkUIModelPackage.TABS_STYLE__BAR_MODE:
			return BAR_MODE_EDEFAULT == null ? barMode != null : !BAR_MODE_EDEFAULT.equals(barMode);
		case ArkUIModelPackage.TABS_STYLE__VERTICAL:
			return VERTICAL_EDEFAULT == null ? vertical != null : !VERTICAL_EDEFAULT.equals(vertical);
		case ArkUIModelPackage.TABS_STYLE__BAR_WIDTH:
			return BAR_WIDTH_EDEFAULT == null ? barWidth != null : !BAR_WIDTH_EDEFAULT.equals(barWidth);
		case ArkUIModelPackage.TABS_STYLE__BAR_HEIGHT:
			return BAR_HEIGHT_EDEFAULT == null ? barHeight != null : !BAR_HEIGHT_EDEFAULT.equals(barHeight);
		case ArkUIModelPackage.TABS_STYLE__ANIMATION_DURATION:
			return ANIMATION_DURATION_EDEFAULT == null ? animationDuration != null
					: !ANIMATION_DURATION_EDEFAULT.equals(animationDuration);
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
		result.append(" (scrollable: ");
		result.append(scrollable);
		result.append(", barMode: ");
		result.append(barMode);
		result.append(", vertical: ");
		result.append(vertical);
		result.append(", barWidth: ");
		result.append(barWidth);
		result.append(", barHeight: ");
		result.append(barHeight);
		result.append(", animationDuration: ");
		result.append(animationDuration);
		result.append(')');
		return result.toString();
	}

} //TabsStyleImpl
