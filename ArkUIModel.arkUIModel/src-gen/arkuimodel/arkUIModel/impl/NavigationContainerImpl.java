/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ContainerItems;
import arkuimodel.arkUIModel.NavigationContainer;
import arkuimodel.arkUIModel.NavigationEvent;
import arkuimodel.arkUIModel.NavigationStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationContainerImpl#getToolbar <em>Toolbar</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationContainerImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationContainerImpl#getNavigationevent <em>Navigationevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationContainerImpl#getNavigationstyle <em>Navigationstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.NavigationContainerImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationContainerImpl extends ContainerImpl implements NavigationContainer {
	/**
	 * The cached value of the '{@link #getToolbar() <em>Toolbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolbar()
	 * @generated
	 * @ordered
	 */
	protected ContainerItems toolbar;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected ContainerItems menu;

	/**
	 * The cached value of the '{@link #getNavigationevent() <em>Navigationevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationevent()
	 * @generated
	 * @ordered
	 */
	protected NavigationEvent navigationevent;

	/**
	 * The cached value of the '{@link #getNavigationstyle() <em>Navigationstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationstyle()
	 * @generated
	 * @ordered
	 */
	protected NavigationStyle navigationstyle;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected ContainerItems title;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.NAVIGATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItems getToolbar() {
		return toolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolbar(ContainerItems newToolbar, NotificationChain msgs) {
		ContainerItems oldToolbar = toolbar;
		toolbar = newToolbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR, oldToolbar, newToolbar);
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
	public void setToolbar(ContainerItems newToolbar) {
		if (newToolbar != toolbar) {
			NotificationChain msgs = null;
			if (toolbar != null)
				msgs = ((InternalEObject) toolbar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR, null, msgs);
			if (newToolbar != null)
				msgs = ((InternalEObject) newToolbar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR, null, msgs);
			msgs = basicSetToolbar(newToolbar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR,
					newToolbar, newToolbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItems getMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenu(ContainerItems newMenu, NotificationChain msgs) {
		ContainerItems oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.NAVIGATION_CONTAINER__MENU, oldMenu, newMenu);
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
	public void setMenu(ContainerItems newMenu) {
		if (newMenu != menu) {
			NotificationChain msgs = null;
			if (menu != null)
				msgs = ((InternalEObject) menu).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__MENU, null, msgs);
			if (newMenu != null)
				msgs = ((InternalEObject) newMenu).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__MENU, null, msgs);
			msgs = basicSetMenu(newMenu, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_CONTAINER__MENU, newMenu,
					newMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationEvent getNavigationevent() {
		return navigationevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationevent(NavigationEvent newNavigationevent, NotificationChain msgs) {
		NavigationEvent oldNavigationevent = navigationevent;
		navigationevent = newNavigationevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT, oldNavigationevent, newNavigationevent);
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
	public void setNavigationevent(NavigationEvent newNavigationevent) {
		if (newNavigationevent != navigationevent) {
			NotificationChain msgs = null;
			if (navigationevent != null)
				msgs = ((InternalEObject) navigationevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT, null, msgs);
			if (newNavigationevent != null)
				msgs = ((InternalEObject) newNavigationevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT, null, msgs);
			msgs = basicSetNavigationevent(newNavigationevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT, newNavigationevent, newNavigationevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationStyle getNavigationstyle() {
		return navigationstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationstyle(NavigationStyle newNavigationstyle, NotificationChain msgs) {
		NavigationStyle oldNavigationstyle = navigationstyle;
		navigationstyle = newNavigationstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE, oldNavigationstyle, newNavigationstyle);
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
	public void setNavigationstyle(NavigationStyle newNavigationstyle) {
		if (newNavigationstyle != navigationstyle) {
			NotificationChain msgs = null;
			if (navigationstyle != null)
				msgs = ((InternalEObject) navigationstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE, null, msgs);
			if (newNavigationstyle != null)
				msgs = ((InternalEObject) newNavigationstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE, null, msgs);
			msgs = basicSetNavigationstyle(newNavigationstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE, newNavigationstyle, newNavigationstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItems getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(ContainerItems newTitle, NotificationChain msgs) {
		ContainerItems oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE, oldTitle, newTitle);
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
	public void setTitle(ContainerItems newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject) title).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject) newTitle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE,
					newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR:
			return basicSetToolbar(null, msgs);
		case ArkUIModelPackage.NAVIGATION_CONTAINER__MENU:
			return basicSetMenu(null, msgs);
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT:
			return basicSetNavigationevent(null, msgs);
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE:
			return basicSetNavigationstyle(null, msgs);
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE:
			return basicSetTitle(null, msgs);
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
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR:
			return getToolbar();
		case ArkUIModelPackage.NAVIGATION_CONTAINER__MENU:
			return getMenu();
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT:
			return getNavigationevent();
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE:
			return getNavigationstyle();
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE:
			return getTitle();
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
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR:
			setToolbar((ContainerItems) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__MENU:
			setMenu((ContainerItems) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT:
			setNavigationevent((NavigationEvent) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE:
			setNavigationstyle((NavigationStyle) newValue);
			return;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE:
			setTitle((ContainerItems) newValue);
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
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR:
			setToolbar((ContainerItems) null);
			return;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__MENU:
			setMenu((ContainerItems) null);
			return;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT:
			setNavigationevent((NavigationEvent) null);
			return;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE:
			setNavigationstyle((NavigationStyle) null);
			return;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE:
			setTitle((ContainerItems) null);
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
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR:
			return toolbar != null;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__MENU:
			return menu != null;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT:
			return navigationevent != null;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE:
			return navigationstyle != null;
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE:
			return title != null;
		}
		return super.eIsSet(featureID);
	}

} //NavigationContainerImpl
