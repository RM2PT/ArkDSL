/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.NavigationStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationStyleImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationStyleImpl#getSubTitle <em>Sub Title</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationStyleImpl#isHideTitleBar <em>Hide Title Bar</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationStyleImpl#isHideBackButton <em>Hide Back Button</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationStyleImpl#getTitleMode <em>Title Mode</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationStyleImpl#isHideToolBar <em>Hide Tool Bar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationStyleImpl extends StyleClassImpl implements NavigationStyle {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubTitle() <em>Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubTitle() <em>Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTitle()
	 * @generated
	 * @ordered
	 */
	protected String subTitle = SUB_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideTitleBar() <em>Hide Title Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideTitleBar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_TITLE_BAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideTitleBar() <em>Hide Title Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideTitleBar()
	 * @generated
	 * @ordered
	 */
	protected boolean hideTitleBar = HIDE_TITLE_BAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideBackButton() <em>Hide Back Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideBackButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_BACK_BUTTON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideBackButton() <em>Hide Back Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideBackButton()
	 * @generated
	 * @ordered
	 */
	protected boolean hideBackButton = HIDE_BACK_BUTTON_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleMode() <em>Title Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleMode()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleMode() <em>Title Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleMode()
	 * @generated
	 * @ordered
	 */
	protected String titleMode = TITLE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideToolBar() <em>Hide Tool Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideToolBar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_TOOL_BAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideToolBar() <em>Hide Tool Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideToolBar()
	 * @generated
	 * @ordered
	 */
	protected boolean hideToolBar = HIDE_TOOL_BAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.NAVIGATION_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_STYLE__TITLE, oldTitle,
					title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubTitle() {
		return subTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubTitle(String newSubTitle) {
		String oldSubTitle = subTitle;
		subTitle = newSubTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_STYLE__SUB_TITLE,
					oldSubTitle, subTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideTitleBar() {
		return hideTitleBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideTitleBar(boolean newHideTitleBar) {
		boolean oldHideTitleBar = hideTitleBar;
		hideTitleBar = newHideTitleBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TITLE_BAR,
					oldHideTitleBar, hideTitleBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideBackButton() {
		return hideBackButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideBackButton(boolean newHideBackButton) {
		boolean oldHideBackButton = hideBackButton;
		hideBackButton = newHideBackButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_STYLE__HIDE_BACK_BUTTON,
					oldHideBackButton, hideBackButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleMode() {
		return titleMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleMode(String newTitleMode) {
		String oldTitleMode = titleMode;
		titleMode = newTitleMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_STYLE__TITLE_MODE,
					oldTitleMode, titleMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideToolBar() {
		return hideToolBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideToolBar(boolean newHideToolBar) {
		boolean oldHideToolBar = hideToolBar;
		hideToolBar = newHideToolBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TOOL_BAR,
					oldHideToolBar, hideToolBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.NAVIGATION_STYLE__TITLE:
			return getTitle();
		case ArkUIModelPackage.NAVIGATION_STYLE__SUB_TITLE:
			return getSubTitle();
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TITLE_BAR:
			return isHideTitleBar();
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_BACK_BUTTON:
			return isHideBackButton();
		case ArkUIModelPackage.NAVIGATION_STYLE__TITLE_MODE:
			return getTitleMode();
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TOOL_BAR:
			return isHideToolBar();
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
		case ArkUIModelPackage.NAVIGATION_STYLE__TITLE:
			setTitle((String) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__SUB_TITLE:
			setSubTitle((String) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TITLE_BAR:
			setHideTitleBar((Boolean) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_BACK_BUTTON:
			setHideBackButton((Boolean) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__TITLE_MODE:
			setTitleMode((String) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TOOL_BAR:
			setHideToolBar((Boolean) newValue);
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
		case ArkUIModelPackage.NAVIGATION_STYLE__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__SUB_TITLE:
			setSubTitle(SUB_TITLE_EDEFAULT);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TITLE_BAR:
			setHideTitleBar(HIDE_TITLE_BAR_EDEFAULT);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_BACK_BUTTON:
			setHideBackButton(HIDE_BACK_BUTTON_EDEFAULT);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__TITLE_MODE:
			setTitleMode(TITLE_MODE_EDEFAULT);
			return;
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TOOL_BAR:
			setHideToolBar(HIDE_TOOL_BAR_EDEFAULT);
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
		case ArkUIModelPackage.NAVIGATION_STYLE__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ArkUIModelPackage.NAVIGATION_STYLE__SUB_TITLE:
			return SUB_TITLE_EDEFAULT == null ? subTitle != null : !SUB_TITLE_EDEFAULT.equals(subTitle);
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TITLE_BAR:
			return hideTitleBar != HIDE_TITLE_BAR_EDEFAULT;
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_BACK_BUTTON:
			return hideBackButton != HIDE_BACK_BUTTON_EDEFAULT;
		case ArkUIModelPackage.NAVIGATION_STYLE__TITLE_MODE:
			return TITLE_MODE_EDEFAULT == null ? titleMode != null : !TITLE_MODE_EDEFAULT.equals(titleMode);
		case ArkUIModelPackage.NAVIGATION_STYLE__HIDE_TOOL_BAR:
			return hideToolBar != HIDE_TOOL_BAR_EDEFAULT;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", subTitle: ");
		result.append(subTitle);
		result.append(", hideTitleBar: ");
		result.append(hideTitleBar);
		result.append(", hideBackButton: ");
		result.append(hideBackButton);
		result.append(", titleMode: ");
		result.append(titleMode);
		result.append(", hideToolBar: ");
		result.append(hideToolBar);
		result.append(')');
		return result.toString();
	}

} //NavigationStyleImpl
