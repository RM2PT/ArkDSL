/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.SearchEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchEventImpl#getOnSearch <em>On Search</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchEventImpl#getOnChange <em>On Change</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchEventImpl#getOnTranslate <em>On Translate</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchEventImpl#getOnShare <em>On Share</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchEventImpl#getOnSubmit <em>On Submit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchEventImpl extends EventImpl implements SearchEvent {
	/**
	 * The default value of the '{@link #getOnSearch() <em>On Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSearch()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SEARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnSearch() <em>On Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSearch()
	 * @generated
	 * @ordered
	 */
	protected String onSearch = ON_SEARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnChange() <em>On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChange()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnChange() <em>On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChange()
	 * @generated
	 * @ordered
	 */
	protected String onChange = ON_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnTranslate() <em>On Translate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTranslate()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_TRANSLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnTranslate() <em>On Translate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTranslate()
	 * @generated
	 * @ordered
	 */
	protected String onTranslate = ON_TRANSLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnShare() <em>On Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnShare()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SHARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnShare() <em>On Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnShare()
	 * @generated
	 * @ordered
	 */
	protected String onShare = ON_SHARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnSubmit() <em>On Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSubmit()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SUBMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnSubmit() <em>On Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSubmit()
	 * @generated
	 * @ordered
	 */
	protected String onSubmit = ON_SUBMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SEARCH_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSearch() {
		return onSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSearch(String newOnSearch) {
		String oldOnSearch = onSearch;
		onSearch = newOnSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_EVENT__ON_SEARCH,
					oldOnSearch, onSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnChange() {
		return onChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnChange(String newOnChange) {
		String oldOnChange = onChange;
		onChange = newOnChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_EVENT__ON_CHANGE,
					oldOnChange, onChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnTranslate() {
		return onTranslate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTranslate(String newOnTranslate) {
		String oldOnTranslate = onTranslate;
		onTranslate = newOnTranslate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_EVENT__ON_TRANSLATE,
					oldOnTranslate, onTranslate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnShare() {
		return onShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnShare(String newOnShare) {
		String oldOnShare = onShare;
		onShare = newOnShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_EVENT__ON_SHARE, oldOnShare,
					onShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSubmit() {
		return onSubmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSubmit(String newOnSubmit) {
		String oldOnSubmit = onSubmit;
		onSubmit = newOnSubmit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_EVENT__ON_SUBMIT,
					oldOnSubmit, onSubmit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.SEARCH_EVENT__ON_SEARCH:
			return getOnSearch();
		case ArkUIModelPackage.SEARCH_EVENT__ON_CHANGE:
			return getOnChange();
		case ArkUIModelPackage.SEARCH_EVENT__ON_TRANSLATE:
			return getOnTranslate();
		case ArkUIModelPackage.SEARCH_EVENT__ON_SHARE:
			return getOnShare();
		case ArkUIModelPackage.SEARCH_EVENT__ON_SUBMIT:
			return getOnSubmit();
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
		case ArkUIModelPackage.SEARCH_EVENT__ON_SEARCH:
			setOnSearch((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_EVENT__ON_CHANGE:
			setOnChange((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_EVENT__ON_TRANSLATE:
			setOnTranslate((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_EVENT__ON_SHARE:
			setOnShare((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_EVENT__ON_SUBMIT:
			setOnSubmit((String) newValue);
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
		case ArkUIModelPackage.SEARCH_EVENT__ON_SEARCH:
			setOnSearch(ON_SEARCH_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_EVENT__ON_CHANGE:
			setOnChange(ON_CHANGE_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_EVENT__ON_TRANSLATE:
			setOnTranslate(ON_TRANSLATE_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_EVENT__ON_SHARE:
			setOnShare(ON_SHARE_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_EVENT__ON_SUBMIT:
			setOnSubmit(ON_SUBMIT_EDEFAULT);
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
		case ArkUIModelPackage.SEARCH_EVENT__ON_SEARCH:
			return ON_SEARCH_EDEFAULT == null ? onSearch != null : !ON_SEARCH_EDEFAULT.equals(onSearch);
		case ArkUIModelPackage.SEARCH_EVENT__ON_CHANGE:
			return ON_CHANGE_EDEFAULT == null ? onChange != null : !ON_CHANGE_EDEFAULT.equals(onChange);
		case ArkUIModelPackage.SEARCH_EVENT__ON_TRANSLATE:
			return ON_TRANSLATE_EDEFAULT == null ? onTranslate != null : !ON_TRANSLATE_EDEFAULT.equals(onTranslate);
		case ArkUIModelPackage.SEARCH_EVENT__ON_SHARE:
			return ON_SHARE_EDEFAULT == null ? onShare != null : !ON_SHARE_EDEFAULT.equals(onShare);
		case ArkUIModelPackage.SEARCH_EVENT__ON_SUBMIT:
			return ON_SUBMIT_EDEFAULT == null ? onSubmit != null : !ON_SUBMIT_EDEFAULT.equals(onSubmit);
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
		result.append(" (onSearch: ");
		result.append(onSearch);
		result.append(", onChange: ");
		result.append(onChange);
		result.append(", onTranslate: ");
		result.append(onTranslate);
		result.append(", onShare: ");
		result.append(onShare);
		result.append(", onSubmit: ");
		result.append(onSubmit);
		result.append(')');
		return result.toString();
	}

} //SearchEventImpl
