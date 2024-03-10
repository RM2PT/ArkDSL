/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.Page;
import arkuimodel.arkUIModel.UIDesign;
import arkuimodel.arkUIModel.UILogic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageImpl#getPageTitle <em>Page Title</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageImpl#isIsHome <em>Is Home</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageImpl#getUilogic <em>Uilogic</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageImpl#getUidesign <em>Uidesign</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageImpl#getSubpages <em>Subpages</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageImpl#getPageroute <em>Pageroute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #getPageTitle() <em>Page Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageTitle() <em>Page Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTitle()
	 * @generated
	 * @ordered
	 */
	protected String pageTitle = PAGE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHome() <em>Is Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHome()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HOME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHome() <em>Is Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHome()
	 * @generated
	 * @ordered
	 */
	protected boolean isHome = IS_HOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUilogic() <em>Uilogic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUilogic()
	 * @generated
	 * @ordered
	 */
	protected UILogic uilogic;

	/**
	 * The cached value of the '{@link #getUidesign() <em>Uidesign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUidesign()
	 * @generated
	 * @ordered
	 */
	protected UIDesign uidesign;

	/**
	 * The cached value of the '{@link #getSubpages() <em>Subpages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> subpages;

	/**
	 * The cached value of the '{@link #getPageroute() <em>Pageroute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageroute()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pageroute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageTitle() {
		return pageTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageTitle(String newPageTitle) {
		String oldPageTitle = pageTitle;
		pageTitle = newPageTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE__PAGE_TITLE, oldPageTitle,
					pageTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHome() {
		return isHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHome(boolean newIsHome) {
		boolean oldIsHome = isHome;
		isHome = newIsHome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE__IS_HOME, oldIsHome, isHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE__FILE_NAME, oldFileName,
					fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UILogic getUilogic() {
		if (uilogic != null && uilogic.eIsProxy()) {
			InternalEObject oldUilogic = (InternalEObject) uilogic;
			uilogic = (UILogic) eResolveProxy(oldUilogic);
			if (uilogic != oldUilogic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArkUIModelPackage.PAGE__UILOGIC,
							oldUilogic, uilogic));
			}
		}
		return uilogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UILogic basicGetUilogic() {
		return uilogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUilogic(UILogic newUilogic) {
		UILogic oldUilogic = uilogic;
		uilogic = newUilogic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE__UILOGIC, oldUilogic,
					uilogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDesign getUidesign() {
		if (uidesign != null && uidesign.eIsProxy()) {
			InternalEObject oldUidesign = (InternalEObject) uidesign;
			uidesign = (UIDesign) eResolveProxy(oldUidesign);
			if (uidesign != oldUidesign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArkUIModelPackage.PAGE__UIDESIGN,
							oldUidesign, uidesign));
			}
		}
		return uidesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDesign basicGetUidesign() {
		return uidesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUidesign(UIDesign newUidesign) {
		UIDesign oldUidesign = uidesign;
		uidesign = newUidesign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE__UIDESIGN, oldUidesign,
					uidesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getSubpages() {
		if (subpages == null) {
			subpages = new EObjectResolvingEList<Page>(Page.class, this, ArkUIModelPackage.PAGE__SUBPAGES);
		}
		return subpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPageroute() {
		if (pageroute == null) {
			pageroute = new EObjectResolvingEList<Page>(Page.class, this, ArkUIModelPackage.PAGE__PAGEROUTE);
		}
		return pageroute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.PAGE__PAGE_TITLE:
			return getPageTitle();
		case ArkUIModelPackage.PAGE__IS_HOME:
			return isIsHome();
		case ArkUIModelPackage.PAGE__FILE_NAME:
			return getFileName();
		case ArkUIModelPackage.PAGE__UILOGIC:
			if (resolve)
				return getUilogic();
			return basicGetUilogic();
		case ArkUIModelPackage.PAGE__UIDESIGN:
			if (resolve)
				return getUidesign();
			return basicGetUidesign();
		case ArkUIModelPackage.PAGE__SUBPAGES:
			return getSubpages();
		case ArkUIModelPackage.PAGE__PAGEROUTE:
			return getPageroute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArkUIModelPackage.PAGE__PAGE_TITLE:
			setPageTitle((String) newValue);
			return;
		case ArkUIModelPackage.PAGE__IS_HOME:
			setIsHome((Boolean) newValue);
			return;
		case ArkUIModelPackage.PAGE__FILE_NAME:
			setFileName((String) newValue);
			return;
		case ArkUIModelPackage.PAGE__UILOGIC:
			setUilogic((UILogic) newValue);
			return;
		case ArkUIModelPackage.PAGE__UIDESIGN:
			setUidesign((UIDesign) newValue);
			return;
		case ArkUIModelPackage.PAGE__SUBPAGES:
			getSubpages().clear();
			getSubpages().addAll((Collection<? extends Page>) newValue);
			return;
		case ArkUIModelPackage.PAGE__PAGEROUTE:
			getPageroute().clear();
			getPageroute().addAll((Collection<? extends Page>) newValue);
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
		case ArkUIModelPackage.PAGE__PAGE_TITLE:
			setPageTitle(PAGE_TITLE_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE__IS_HOME:
			setIsHome(IS_HOME_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE__FILE_NAME:
			setFileName(FILE_NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE__UILOGIC:
			setUilogic((UILogic) null);
			return;
		case ArkUIModelPackage.PAGE__UIDESIGN:
			setUidesign((UIDesign) null);
			return;
		case ArkUIModelPackage.PAGE__SUBPAGES:
			getSubpages().clear();
			return;
		case ArkUIModelPackage.PAGE__PAGEROUTE:
			getPageroute().clear();
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
		case ArkUIModelPackage.PAGE__PAGE_TITLE:
			return PAGE_TITLE_EDEFAULT == null ? pageTitle != null : !PAGE_TITLE_EDEFAULT.equals(pageTitle);
		case ArkUIModelPackage.PAGE__IS_HOME:
			return isHome != IS_HOME_EDEFAULT;
		case ArkUIModelPackage.PAGE__FILE_NAME:
			return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
		case ArkUIModelPackage.PAGE__UILOGIC:
			return uilogic != null;
		case ArkUIModelPackage.PAGE__UIDESIGN:
			return uidesign != null;
		case ArkUIModelPackage.PAGE__SUBPAGES:
			return subpages != null && !subpages.isEmpty();
		case ArkUIModelPackage.PAGE__PAGEROUTE:
			return pageroute != null && !pageroute.isEmpty();
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
		result.append(" (pageTitle: ");
		result.append(pageTitle);
		result.append(", isHome: ");
		result.append(isHome);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //PageImpl
