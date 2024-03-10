/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TabContent;
import arkuimodel.arkUIModel.TabContentStyle;
import arkuimodel.arkUIModel.TabItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabContentImpl#getTabBar <em>Tab Bar</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TabContentImpl#getTabcontentstyle <em>Tabcontentstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabContentImpl extends ContainerImpl implements TabContent {
	/**
	 * The cached value of the '{@link #getTabBar() <em>Tab Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabBar()
	 * @generated
	 * @ordered
	 */
	protected TabItem tabBar;

	/**
	 * The cached value of the '{@link #getTabcontentstyle() <em>Tabcontentstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabcontentstyle()
	 * @generated
	 * @ordered
	 */
	protected TabContentStyle tabcontentstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TAB_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabItem getTabBar() {
		return tabBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabBar(TabItem newTabBar, NotificationChain msgs) {
		TabItem oldTabBar = tabBar;
		tabBar = newTabBar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TAB_CONTENT__TAB_BAR, oldTabBar, newTabBar);
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
	public void setTabBar(TabItem newTabBar) {
		if (newTabBar != tabBar) {
			NotificationChain msgs = null;
			if (tabBar != null)
				msgs = ((InternalEObject) tabBar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TAB_CONTENT__TAB_BAR, null, msgs);
			if (newTabBar != null)
				msgs = ((InternalEObject) newTabBar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TAB_CONTENT__TAB_BAR, null, msgs);
			msgs = basicSetTabBar(newTabBar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TAB_CONTENT__TAB_BAR, newTabBar,
					newTabBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabContentStyle getTabcontentstyle() {
		return tabcontentstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabcontentstyle(TabContentStyle newTabcontentstyle, NotificationChain msgs) {
		TabContentStyle oldTabcontentstyle = tabcontentstyle;
		tabcontentstyle = newTabcontentstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE, oldTabcontentstyle, newTabcontentstyle);
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
	public void setTabcontentstyle(TabContentStyle newTabcontentstyle) {
		if (newTabcontentstyle != tabcontentstyle) {
			NotificationChain msgs = null;
			if (tabcontentstyle != null)
				msgs = ((InternalEObject) tabcontentstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE, null, msgs);
			if (newTabcontentstyle != null)
				msgs = ((InternalEObject) newTabcontentstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE, null, msgs);
			msgs = basicSetTabcontentstyle(newTabcontentstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE,
					newTabcontentstyle, newTabcontentstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.TAB_CONTENT__TAB_BAR:
			return basicSetTabBar(null, msgs);
		case ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE:
			return basicSetTabcontentstyle(null, msgs);
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
		case ArkUIModelPackage.TAB_CONTENT__TAB_BAR:
			return getTabBar();
		case ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE:
			return getTabcontentstyle();
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
		case ArkUIModelPackage.TAB_CONTENT__TAB_BAR:
			setTabBar((TabItem) newValue);
			return;
		case ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE:
			setTabcontentstyle((TabContentStyle) newValue);
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
		case ArkUIModelPackage.TAB_CONTENT__TAB_BAR:
			setTabBar((TabItem) null);
			return;
		case ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE:
			setTabcontentstyle((TabContentStyle) null);
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
		case ArkUIModelPackage.TAB_CONTENT__TAB_BAR:
			return tabBar != null;
		case ArkUIModelPackage.TAB_CONTENT__TABCONTENTSTYLE:
			return tabcontentstyle != null;
		}
		return super.eIsSet(featureID);
	}

} //TabContentImpl
