/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ScrollContainer;
import arkuimodel.arkUIModel.ScrollEvent;
import arkuimodel.arkUIModel.ScrollStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scroll Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollContainerImpl#getScrollevent <em>Scrollevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollContainerImpl#getScrollstyle <em>Scrollstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrollContainerImpl extends ContainerImpl implements ScrollContainer {
	/**
	 * The cached value of the '{@link #getScrollevent() <em>Scrollevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollevent()
	 * @generated
	 * @ordered
	 */
	protected ScrollEvent scrollevent;

	/**
	 * The cached value of the '{@link #getScrollstyle() <em>Scrollstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollstyle()
	 * @generated
	 * @ordered
	 */
	protected ScrollStyle scrollstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SCROLL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollEvent getScrollevent() {
		return scrollevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScrollevent(ScrollEvent newScrollevent, NotificationChain msgs) {
		ScrollEvent oldScrollevent = scrollevent;
		scrollevent = newScrollevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT, oldScrollevent, newScrollevent);
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
	public void setScrollevent(ScrollEvent newScrollevent) {
		if (newScrollevent != scrollevent) {
			NotificationChain msgs = null;
			if (scrollevent != null)
				msgs = ((InternalEObject) scrollevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT, null, msgs);
			if (newScrollevent != null)
				msgs = ((InternalEObject) newScrollevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT, null, msgs);
			msgs = basicSetScrollevent(newScrollevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT,
					newScrollevent, newScrollevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollStyle getScrollstyle() {
		return scrollstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScrollstyle(ScrollStyle newScrollstyle, NotificationChain msgs) {
		ScrollStyle oldScrollstyle = scrollstyle;
		scrollstyle = newScrollstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE, oldScrollstyle, newScrollstyle);
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
	public void setScrollstyle(ScrollStyle newScrollstyle) {
		if (newScrollstyle != scrollstyle) {
			NotificationChain msgs = null;
			if (scrollstyle != null)
				msgs = ((InternalEObject) scrollstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE, null, msgs);
			if (newScrollstyle != null)
				msgs = ((InternalEObject) newScrollstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE, null, msgs);
			msgs = basicSetScrollstyle(newScrollstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE,
					newScrollstyle, newScrollstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT:
			return basicSetScrollevent(null, msgs);
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE:
			return basicSetScrollstyle(null, msgs);
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
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT:
			return getScrollevent();
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE:
			return getScrollstyle();
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
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT:
			setScrollevent((ScrollEvent) newValue);
			return;
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE:
			setScrollstyle((ScrollStyle) newValue);
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
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT:
			setScrollevent((ScrollEvent) null);
			return;
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE:
			setScrollstyle((ScrollStyle) null);
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
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLEVENT:
			return scrollevent != null;
		case ArkUIModelPackage.SCROLL_CONTAINER__SCROLLSTYLE:
			return scrollstyle != null;
		}
		return super.eIsSet(featureID);
	}

} //ScrollContainerImpl
