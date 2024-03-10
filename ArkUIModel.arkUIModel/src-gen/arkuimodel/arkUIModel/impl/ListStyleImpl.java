/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ListStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getListDirection <em>List Direction</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getEdgeEffect <em>Edge Effect</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getDivider <em>Divider</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getEditMode <em>Edit Mode</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getChainAnimation <em>Chain Animation</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getScrollBar <em>Scroll Bar</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getCachedCount <em>Cached Count</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getStartMargin <em>Start Margin</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListStyleImpl#getEndMargin <em>End Margin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListStyleImpl extends StyleClassImpl implements ListStyle {
	/**
	 * The default value of the '{@link #getListDirection() <em>List Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListDirection() <em>List Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListDirection()
	 * @generated
	 * @ordered
	 */
	protected String listDirection = LIST_DIRECTION_EDEFAULT;

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
	 * The default value of the '{@link #getDivider() <em>Divider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivider()
	 * @generated
	 * @ordered
	 */
	protected static final String DIVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDivider() <em>Divider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivider()
	 * @generated
	 * @ordered
	 */
	protected String divider = DIVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditMode() <em>Edit Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditMode()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditMode() <em>Edit Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditMode()
	 * @generated
	 * @ordered
	 */
	protected String editMode = EDIT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChainAnimation() <em>Chain Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainAnimation()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAIN_ANIMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChainAnimation() <em>Chain Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainAnimation()
	 * @generated
	 * @ordered
	 */
	protected String chainAnimation = CHAIN_ANIMATION_EDEFAULT;

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
	 * The default value of the '{@link #getCachedCount() <em>Cached Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedCount()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHED_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCachedCount() <em>Cached Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedCount()
	 * @generated
	 * @ordered
	 */
	protected String cachedCount = CACHED_COUNT_EDEFAULT;

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
	 * The default value of the '{@link #getStartMargin() <em>Start Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMargin()
	 * @generated
	 * @ordered
	 */
	protected static final String START_MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartMargin() <em>Start Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMargin()
	 * @generated
	 * @ordered
	 */
	protected String startMargin = START_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndMargin() <em>End Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndMargin()
	 * @generated
	 * @ordered
	 */
	protected static final String END_MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndMargin() <em>End Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndMargin()
	 * @generated
	 * @ordered
	 */
	protected String endMargin = END_MARGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.LIST_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListDirection() {
		return listDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListDirection(String newListDirection) {
		String oldListDirection = listDirection;
		listDirection = newListDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__LIST_DIRECTION,
					oldListDirection, listDirection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__EDGE_EFFECT,
					oldEdgeEffect, edgeEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDivider() {
		return divider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivider(String newDivider) {
		String oldDivider = divider;
		divider = newDivider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__DIVIDER, oldDivider,
					divider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditMode() {
		return editMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditMode(String newEditMode) {
		String oldEditMode = editMode;
		editMode = newEditMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__EDIT_MODE, oldEditMode,
					editMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChainAnimation() {
		return chainAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainAnimation(String newChainAnimation) {
		String oldChainAnimation = chainAnimation;
		chainAnimation = newChainAnimation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__CHAIN_ANIMATION,
					oldChainAnimation, chainAnimation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__SCROLL_BAR,
					oldScrollBar, scrollBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCachedCount() {
		return cachedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCachedCount(String newCachedCount) {
		String oldCachedCount = cachedCount;
		cachedCount = newCachedCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__CACHED_COUNT,
					oldCachedCount, cachedCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__STROKE_WIDTH,
					oldStrokeWidth, strokeWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__COLOR, oldColor,
					color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartMargin() {
		return startMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMargin(String newStartMargin) {
		String oldStartMargin = startMargin;
		startMargin = newStartMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__START_MARGIN,
					oldStartMargin, startMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndMargin() {
		return endMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndMargin(String newEndMargin) {
		String oldEndMargin = endMargin;
		endMargin = newEndMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_STYLE__END_MARGIN,
					oldEndMargin, endMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.LIST_STYLE__LIST_DIRECTION:
			return getListDirection();
		case ArkUIModelPackage.LIST_STYLE__EDGE_EFFECT:
			return getEdgeEffect();
		case ArkUIModelPackage.LIST_STYLE__DIVIDER:
			return getDivider();
		case ArkUIModelPackage.LIST_STYLE__EDIT_MODE:
			return getEditMode();
		case ArkUIModelPackage.LIST_STYLE__CHAIN_ANIMATION:
			return getChainAnimation();
		case ArkUIModelPackage.LIST_STYLE__SCROLL_BAR:
			return getScrollBar();
		case ArkUIModelPackage.LIST_STYLE__CACHED_COUNT:
			return getCachedCount();
		case ArkUIModelPackage.LIST_STYLE__STROKE_WIDTH:
			return getStrokeWidth();
		case ArkUIModelPackage.LIST_STYLE__COLOR:
			return getColor();
		case ArkUIModelPackage.LIST_STYLE__START_MARGIN:
			return getStartMargin();
		case ArkUIModelPackage.LIST_STYLE__END_MARGIN:
			return getEndMargin();
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
		case ArkUIModelPackage.LIST_STYLE__LIST_DIRECTION:
			setListDirection((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__EDGE_EFFECT:
			setEdgeEffect((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__DIVIDER:
			setDivider((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__EDIT_MODE:
			setEditMode((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__CHAIN_ANIMATION:
			setChainAnimation((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__SCROLL_BAR:
			setScrollBar((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__CACHED_COUNT:
			setCachedCount((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__STROKE_WIDTH:
			setStrokeWidth((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__COLOR:
			setColor((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__START_MARGIN:
			setStartMargin((String) newValue);
			return;
		case ArkUIModelPackage.LIST_STYLE__END_MARGIN:
			setEndMargin((String) newValue);
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
		case ArkUIModelPackage.LIST_STYLE__LIST_DIRECTION:
			setListDirection(LIST_DIRECTION_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__EDGE_EFFECT:
			setEdgeEffect(EDGE_EFFECT_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__DIVIDER:
			setDivider(DIVIDER_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__EDIT_MODE:
			setEditMode(EDIT_MODE_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__CHAIN_ANIMATION:
			setChainAnimation(CHAIN_ANIMATION_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__SCROLL_BAR:
			setScrollBar(SCROLL_BAR_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__CACHED_COUNT:
			setCachedCount(CACHED_COUNT_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__STROKE_WIDTH:
			setStrokeWidth(STROKE_WIDTH_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__START_MARGIN:
			setStartMargin(START_MARGIN_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_STYLE__END_MARGIN:
			setEndMargin(END_MARGIN_EDEFAULT);
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
		case ArkUIModelPackage.LIST_STYLE__LIST_DIRECTION:
			return LIST_DIRECTION_EDEFAULT == null ? listDirection != null
					: !LIST_DIRECTION_EDEFAULT.equals(listDirection);
		case ArkUIModelPackage.LIST_STYLE__EDGE_EFFECT:
			return EDGE_EFFECT_EDEFAULT == null ? edgeEffect != null : !EDGE_EFFECT_EDEFAULT.equals(edgeEffect);
		case ArkUIModelPackage.LIST_STYLE__DIVIDER:
			return DIVIDER_EDEFAULT == null ? divider != null : !DIVIDER_EDEFAULT.equals(divider);
		case ArkUIModelPackage.LIST_STYLE__EDIT_MODE:
			return EDIT_MODE_EDEFAULT == null ? editMode != null : !EDIT_MODE_EDEFAULT.equals(editMode);
		case ArkUIModelPackage.LIST_STYLE__CHAIN_ANIMATION:
			return CHAIN_ANIMATION_EDEFAULT == null ? chainAnimation != null
					: !CHAIN_ANIMATION_EDEFAULT.equals(chainAnimation);
		case ArkUIModelPackage.LIST_STYLE__SCROLL_BAR:
			return SCROLL_BAR_EDEFAULT == null ? scrollBar != null : !SCROLL_BAR_EDEFAULT.equals(scrollBar);
		case ArkUIModelPackage.LIST_STYLE__CACHED_COUNT:
			return CACHED_COUNT_EDEFAULT == null ? cachedCount != null : !CACHED_COUNT_EDEFAULT.equals(cachedCount);
		case ArkUIModelPackage.LIST_STYLE__STROKE_WIDTH:
			return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
		case ArkUIModelPackage.LIST_STYLE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case ArkUIModelPackage.LIST_STYLE__START_MARGIN:
			return START_MARGIN_EDEFAULT == null ? startMargin != null : !START_MARGIN_EDEFAULT.equals(startMargin);
		case ArkUIModelPackage.LIST_STYLE__END_MARGIN:
			return END_MARGIN_EDEFAULT == null ? endMargin != null : !END_MARGIN_EDEFAULT.equals(endMargin);
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
		result.append(" (listDirection: ");
		result.append(listDirection);
		result.append(", edgeEffect: ");
		result.append(edgeEffect);
		result.append(", divider: ");
		result.append(divider);
		result.append(", editMode: ");
		result.append(editMode);
		result.append(", chainAnimation: ");
		result.append(chainAnimation);
		result.append(", scrollBar: ");
		result.append(scrollBar);
		result.append(", cachedCount: ");
		result.append(cachedCount);
		result.append(", strokeWidth: ");
		result.append(strokeWidth);
		result.append(", color: ");
		result.append(color);
		result.append(", startMargin: ");
		result.append(startMargin);
		result.append(", endMargin: ");
		result.append(endMargin);
		result.append(')');
		return result.toString();
	}

} //ListStyleImpl
