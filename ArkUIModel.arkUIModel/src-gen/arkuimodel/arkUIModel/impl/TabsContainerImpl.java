/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TabContent;
import arkuimodel.arkUIModel.TabsContainer;
import arkuimodel.arkUIModel.TabsEvent;
import arkuimodel.arkUIModel.TabsStyle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabs Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsContainerImpl#getBarPosition <em>Bar Position</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsContainerImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsContainerImpl#getTabs <em>Tabs</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsContainerImpl#getTabsevent <em>Tabsevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabsContainerImpl#getTabsstyle <em>Tabsstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabsContainerImpl extends ContainerImpl implements TabsContainer {
	/**
	 * The default value of the '{@link #getBarPosition() <em>Bar Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String BAR_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarPosition() <em>Bar Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarPosition()
	 * @generated
	 * @ordered
	 */
	protected String barPosition = BAR_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<TabContent> tabs;

	/**
	 * The cached value of the '{@link #getTabsevent() <em>Tabsevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabsevent()
	 * @generated
	 * @ordered
	 */
	protected TabsEvent tabsevent;

	/**
	 * The cached value of the '{@link #getTabsstyle() <em>Tabsstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabsstyle()
	 * @generated
	 * @ordered
	 */
	protected TabsStyle tabsstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TABS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBarPosition() {
		return barPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarPosition(String newBarPosition) {
		String oldBarPosition = barPosition;
		barPosition = newBarPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_CONTAINER__BAR_POSITION,
					oldBarPosition, barPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_CONTAINER__INDEX, oldIndex,
					index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TabContent> getTabs() {
		if (tabs == null) {
			tabs = new EObjectContainmentEList<TabContent>(TabContent.class, this,
					ArkUIModelPackage.TABS_CONTAINER__TABS);
		}
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabsEvent getTabsevent() {
		return tabsevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabsevent(TabsEvent newTabsevent, NotificationChain msgs) {
		TabsEvent oldTabsevent = tabsevent;
		tabsevent = newTabsevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TABS_CONTAINER__TABSEVENT, oldTabsevent, newTabsevent);
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
	public void setTabsevent(TabsEvent newTabsevent) {
		if (newTabsevent != tabsevent) {
			NotificationChain msgs = null;
			if (tabsevent != null)
				msgs = ((InternalEObject) tabsevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TABS_CONTAINER__TABSEVENT, null, msgs);
			if (newTabsevent != null)
				msgs = ((InternalEObject) newTabsevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TABS_CONTAINER__TABSEVENT, null, msgs);
			msgs = basicSetTabsevent(newTabsevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_CONTAINER__TABSEVENT,
					newTabsevent, newTabsevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabsStyle getTabsstyle() {
		return tabsstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabsstyle(TabsStyle newTabsstyle, NotificationChain msgs) {
		TabsStyle oldTabsstyle = tabsstyle;
		tabsstyle = newTabsstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE, oldTabsstyle, newTabsstyle);
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
	public void setTabsstyle(TabsStyle newTabsstyle) {
		if (newTabsstyle != tabsstyle) {
			NotificationChain msgs = null;
			if (tabsstyle != null)
				msgs = ((InternalEObject) tabsstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE, null, msgs);
			if (newTabsstyle != null)
				msgs = ((InternalEObject) newTabsstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE, null, msgs);
			msgs = basicSetTabsstyle(newTabsstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE,
					newTabsstyle, newTabsstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.TABS_CONTAINER__TABS:
			return ((InternalEList<?>) getTabs()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.TABS_CONTAINER__TABSEVENT:
			return basicSetTabsevent(null, msgs);
		case ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE:
			return basicSetTabsstyle(null, msgs);
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
		case ArkUIModelPackage.TABS_CONTAINER__BAR_POSITION:
			return getBarPosition();
		case ArkUIModelPackage.TABS_CONTAINER__INDEX:
			return getIndex();
		case ArkUIModelPackage.TABS_CONTAINER__TABS:
			return getTabs();
		case ArkUIModelPackage.TABS_CONTAINER__TABSEVENT:
			return getTabsevent();
		case ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE:
			return getTabsstyle();
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
		case ArkUIModelPackage.TABS_CONTAINER__BAR_POSITION:
			setBarPosition((String) newValue);
			return;
		case ArkUIModelPackage.TABS_CONTAINER__INDEX:
			setIndex((String) newValue);
			return;
		case ArkUIModelPackage.TABS_CONTAINER__TABS:
			getTabs().clear();
			getTabs().addAll((Collection<? extends TabContent>) newValue);
			return;
		case ArkUIModelPackage.TABS_CONTAINER__TABSEVENT:
			setTabsevent((TabsEvent) newValue);
			return;
		case ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE:
			setTabsstyle((TabsStyle) newValue);
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
		case ArkUIModelPackage.TABS_CONTAINER__BAR_POSITION:
			setBarPosition(BAR_POSITION_EDEFAULT);
			return;
		case ArkUIModelPackage.TABS_CONTAINER__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case ArkUIModelPackage.TABS_CONTAINER__TABS:
			getTabs().clear();
			return;
		case ArkUIModelPackage.TABS_CONTAINER__TABSEVENT:
			setTabsevent((TabsEvent) null);
			return;
		case ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE:
			setTabsstyle((TabsStyle) null);
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
		case ArkUIModelPackage.TABS_CONTAINER__BAR_POSITION:
			return BAR_POSITION_EDEFAULT == null ? barPosition != null : !BAR_POSITION_EDEFAULT.equals(barPosition);
		case ArkUIModelPackage.TABS_CONTAINER__INDEX:
			return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
		case ArkUIModelPackage.TABS_CONTAINER__TABS:
			return tabs != null && !tabs.isEmpty();
		case ArkUIModelPackage.TABS_CONTAINER__TABSEVENT:
			return tabsevent != null;
		case ArkUIModelPackage.TABS_CONTAINER__TABSSTYLE:
			return tabsstyle != null;
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
		result.append(" (barPosition: ");
		result.append(barPosition);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //TabsContainerImpl
