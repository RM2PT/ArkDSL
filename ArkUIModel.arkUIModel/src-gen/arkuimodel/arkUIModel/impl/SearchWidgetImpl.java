/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.SearchEvent;
import arkuimodel.arkUIModel.SearchStyle;
import arkuimodel.arkUIModel.SearchWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl#getSearchbutton <em>Searchbutton</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl#getSearchevent <em>Searchevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl#getSearchstyle <em>Searchstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchWidgetImpl extends WidgetImpl implements SearchWidget {
	/**
	 * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected static final String HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected String hint = HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchbutton() <em>Searchbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchbutton()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCHBUTTON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchbutton() <em>Searchbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchbutton()
	 * @generated
	 * @ordered
	 */
	protected String searchbutton = SEARCHBUTTON_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSearchevent() <em>Searchevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchevent()
	 * @generated
	 * @ordered
	 */
	protected SearchEvent searchevent;

	/**
	 * The cached value of the '{@link #getSearchstyle() <em>Searchstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchstyle()
	 * @generated
	 * @ordered
	 */
	protected SearchStyle searchstyle;

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
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SEARCH_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHint(String newHint) {
		String oldHint = hint;
		hint = newHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_WIDGET__HINT, oldHint,
					hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearchbutton() {
		return searchbutton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchbutton(String newSearchbutton) {
		String oldSearchbutton = searchbutton;
		searchbutton = newSearchbutton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_WIDGET__SEARCHBUTTON,
					oldSearchbutton, searchbutton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_WIDGET__ICON, oldIcon,
					icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEvent getSearchevent() {
		return searchevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchevent(SearchEvent newSearchevent, NotificationChain msgs) {
		SearchEvent oldSearchevent = searchevent;
		searchevent = newSearchevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT, oldSearchevent, newSearchevent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchevent(SearchEvent newSearchevent) {
		if (newSearchevent != searchevent) {
			NotificationChain msgs = null;
			if (searchevent != null)
				msgs = ((InternalEObject) searchevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT, null, msgs);
			if (newSearchevent != null)
				msgs = ((InternalEObject) newSearchevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT, null, msgs);
			msgs = basicSetSearchevent(newSearchevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT,
					newSearchevent, newSearchevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchStyle getSearchstyle() {
		return searchstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchstyle(SearchStyle newSearchstyle, NotificationChain msgs) {
		SearchStyle oldSearchstyle = searchstyle;
		searchstyle = newSearchstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE, oldSearchstyle, newSearchstyle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchstyle(SearchStyle newSearchstyle) {
		if (newSearchstyle != searchstyle) {
			NotificationChain msgs = null;
			if (searchstyle != null)
				msgs = ((InternalEObject) searchstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE, null, msgs);
			if (newSearchstyle != null)
				msgs = ((InternalEObject) newSearchstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE, null, msgs);
			msgs = basicSetSearchstyle(newSearchstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE,
					newSearchstyle, newSearchstyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_WIDGET__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_WIDGET__PLACEHOLDER,
					oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT:
			return basicSetSearchevent(null, msgs);
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE:
			return basicSetSearchstyle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.SEARCH_WIDGET__HINT:
			return getHint();
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHBUTTON:
			return getSearchbutton();
		case ArkUIModelPackage.SEARCH_WIDGET__ICON:
			return getIcon();
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT:
			return getSearchevent();
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE:
			return getSearchstyle();
		case ArkUIModelPackage.SEARCH_WIDGET__VALUE:
			return getValue();
		case ArkUIModelPackage.SEARCH_WIDGET__PLACEHOLDER:
			return getPlaceholder();
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
		case ArkUIModelPackage.SEARCH_WIDGET__HINT:
			setHint((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHBUTTON:
			setSearchbutton((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__ICON:
			setIcon((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT:
			setSearchevent((SearchEvent) newValue);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE:
			setSearchstyle((SearchStyle) newValue);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__VALUE:
			setValue((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__PLACEHOLDER:
			setPlaceholder((String) newValue);
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
		case ArkUIModelPackage.SEARCH_WIDGET__HINT:
			setHint(HINT_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHBUTTON:
			setSearchbutton(SEARCHBUTTON_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT:
			setSearchevent((SearchEvent) null);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE:
			setSearchstyle((SearchStyle) null);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_WIDGET__PLACEHOLDER:
			setPlaceholder(PLACEHOLDER_EDEFAULT);
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
		case ArkUIModelPackage.SEARCH_WIDGET__HINT:
			return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHBUTTON:
			return SEARCHBUTTON_EDEFAULT == null ? searchbutton != null : !SEARCHBUTTON_EDEFAULT.equals(searchbutton);
		case ArkUIModelPackage.SEARCH_WIDGET__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHEVENT:
			return searchevent != null;
		case ArkUIModelPackage.SEARCH_WIDGET__SEARCHSTYLE:
			return searchstyle != null;
		case ArkUIModelPackage.SEARCH_WIDGET__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ArkUIModelPackage.SEARCH_WIDGET__PLACEHOLDER:
			return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
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
		result.append(" (hint: ");
		result.append(hint);
		result.append(", searchbutton: ");
		result.append(searchbutton);
		result.append(", icon: ");
		result.append(icon);
		result.append(", value: ");
		result.append(value);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(')');
		return result.toString();
	}

} //SearchWidgetImpl
