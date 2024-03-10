/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ScrollStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scroll Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollStyleImpl#getScrollable <em>Scrollable</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollStyleImpl#getScrollBar <em>Scroll Bar</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollStyleImpl#getScrollBarColor <em>Scroll Bar Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollStyleImpl#getScrollBarWidth <em>Scroll Bar Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollStyleImpl#getEdgeEffect <em>Edge Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrollStyleImpl extends StyleClassImpl implements ScrollStyle {
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
	 * The default value of the '{@link #getScrollBar() <em>Scroll Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollBar()
	 * @generated
	 * @ordered
	 */
	protected static final String SCROLL_BAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScrollBar() <em>Scroll Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollBar()
	 * @generated
	 * @ordered
	 */
	protected String scrollBar = SCROLL_BAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getScrollBarColor() <em>Scroll Bar Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollBarColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SCROLL_BAR_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScrollBarColor() <em>Scroll Bar Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollBarColor()
	 * @generated
	 * @ordered
	 */
	protected String scrollBarColor = SCROLL_BAR_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getScrollBarWidth() <em>Scroll Bar Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollBarWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String SCROLL_BAR_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScrollBarWidth() <em>Scroll Bar Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollBarWidth()
	 * @generated
	 * @ordered
	 */
	protected String scrollBarWidth = SCROLL_BAR_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdgeEffect() <em>Edge Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EDGE_EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdgeEffect() <em>Edge Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeEffect()
	 * @generated
	 * @ordered
	 */
	protected String edgeEffect = EDGE_EFFECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SCROLL_STYLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_STYLE__SCROLLABLE,
					oldScrollable, scrollable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScrollBar() {
		return scrollBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollBar(String newScrollBar) {
		String oldScrollBar = scrollBar;
		scrollBar = newScrollBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR,
					oldScrollBar, scrollBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScrollBarColor() {
		return scrollBarColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollBarColor(String newScrollBarColor) {
		String oldScrollBarColor = scrollBarColor;
		scrollBarColor = newScrollBarColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_COLOR,
					oldScrollBarColor, scrollBarColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScrollBarWidth() {
		return scrollBarWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollBarWidth(String newScrollBarWidth) {
		String oldScrollBarWidth = scrollBarWidth;
		scrollBarWidth = newScrollBarWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_WIDTH,
					oldScrollBarWidth, scrollBarWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdgeEffect() {
		return edgeEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeEffect(String newEdgeEffect) {
		String oldEdgeEffect = edgeEffect;
		edgeEffect = newEdgeEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_STYLE__EDGE_EFFECT,
					oldEdgeEffect, edgeEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.SCROLL_STYLE__SCROLLABLE:
			return getScrollable();
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR:
			return getScrollBar();
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_COLOR:
			return getScrollBarColor();
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_WIDTH:
			return getScrollBarWidth();
		case ArkUIModelPackage.SCROLL_STYLE__EDGE_EFFECT:
			return getEdgeEffect();
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
		case ArkUIModelPackage.SCROLL_STYLE__SCROLLABLE:
			setScrollable((String) newValue);
			return;
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR:
			setScrollBar((String) newValue);
			return;
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_COLOR:
			setScrollBarColor((String) newValue);
			return;
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_WIDTH:
			setScrollBarWidth((String) newValue);
			return;
		case ArkUIModelPackage.SCROLL_STYLE__EDGE_EFFECT:
			setEdgeEffect((String) newValue);
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
		case ArkUIModelPackage.SCROLL_STYLE__SCROLLABLE:
			setScrollable(SCROLLABLE_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR:
			setScrollBar(SCROLL_BAR_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_COLOR:
			setScrollBarColor(SCROLL_BAR_COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_WIDTH:
			setScrollBarWidth(SCROLL_BAR_WIDTH_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLL_STYLE__EDGE_EFFECT:
			setEdgeEffect(EDGE_EFFECT_EDEFAULT);
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
		case ArkUIModelPackage.SCROLL_STYLE__SCROLLABLE:
			return SCROLLABLE_EDEFAULT == null ? scrollable != null : !SCROLLABLE_EDEFAULT.equals(scrollable);
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR:
			return SCROLL_BAR_EDEFAULT == null ? scrollBar != null : !SCROLL_BAR_EDEFAULT.equals(scrollBar);
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_COLOR:
			return SCROLL_BAR_COLOR_EDEFAULT == null ? scrollBarColor != null
					: !SCROLL_BAR_COLOR_EDEFAULT.equals(scrollBarColor);
		case ArkUIModelPackage.SCROLL_STYLE__SCROLL_BAR_WIDTH:
			return SCROLL_BAR_WIDTH_EDEFAULT == null ? scrollBarWidth != null
					: !SCROLL_BAR_WIDTH_EDEFAULT.equals(scrollBarWidth);
		case ArkUIModelPackage.SCROLL_STYLE__EDGE_EFFECT:
			return EDGE_EFFECT_EDEFAULT == null ? edgeEffect != null : !EDGE_EFFECT_EDEFAULT.equals(edgeEffect);
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
		result.append(", scrollBar: ");
		result.append(scrollBar);
		result.append(", scrollBarColor: ");
		result.append(scrollBarColor);
		result.append(", scrollBarWidth: ");
		result.append(scrollBarWidth);
		result.append(", edgeEffect: ");
		result.append(edgeEffect);
		result.append(')');
		return result.toString();
	}

} //ScrollStyleImpl
