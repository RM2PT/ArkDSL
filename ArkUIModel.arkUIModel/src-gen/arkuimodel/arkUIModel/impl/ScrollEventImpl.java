/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ScrollEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scroll Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollEventImpl#getOnScroll <em>On Scroll</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollEventImpl#getOnScrollEdge <em>On Scroll Edge</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollEventImpl#getOnScrollEnd <em>On Scroll End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrollEventImpl extends EventImpl implements ScrollEvent {
	/**
	 * The default value of the '{@link #getOnScroll() <em>On Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScroll()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SCROLL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnScroll() <em>On Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScroll()
	 * @generated
	 * @ordered
	 */
	protected String onScroll = ON_SCROLL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnScrollEdge() <em>On Scroll Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScrollEdge()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SCROLL_EDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnScrollEdge() <em>On Scroll Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScrollEdge()
	 * @generated
	 * @ordered
	 */
	protected String onScrollEdge = ON_SCROLL_EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnScrollEnd() <em>On Scroll End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScrollEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SCROLL_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnScrollEnd() <em>On Scroll End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScrollEnd()
	 * @generated
	 * @ordered
	 */
	protected String onScrollEnd = ON_SCROLL_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SCROLL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnScroll() {
		return onScroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnScroll(String newOnScroll) {
		String oldOnScroll = onScroll;
		onScroll = newOnScroll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL,
					oldOnScroll, onScroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnScrollEdge() {
		return onScrollEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnScrollEdge(String newOnScrollEdge) {
		String oldOnScrollEdge = onScrollEdge;
		onScrollEdge = newOnScrollEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_EDGE,
					oldOnScrollEdge, onScrollEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnScrollEnd() {
		return onScrollEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnScrollEnd(String newOnScrollEnd) {
		String oldOnScrollEnd = onScrollEnd;
		onScrollEnd = newOnScrollEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_END,
					oldOnScrollEnd, onScrollEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL:
			return getOnScroll();
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_EDGE:
			return getOnScrollEdge();
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_END:
			return getOnScrollEnd();
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
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL:
			setOnScroll((String) newValue);
			return;
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_EDGE:
			setOnScrollEdge((String) newValue);
			return;
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_END:
			setOnScrollEnd((String) newValue);
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
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL:
			setOnScroll(ON_SCROLL_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_EDGE:
			setOnScrollEdge(ON_SCROLL_EDGE_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_END:
			setOnScrollEnd(ON_SCROLL_END_EDEFAULT);
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
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL:
			return ON_SCROLL_EDEFAULT == null ? onScroll != null : !ON_SCROLL_EDEFAULT.equals(onScroll);
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_EDGE:
			return ON_SCROLL_EDGE_EDEFAULT == null ? onScrollEdge != null
					: !ON_SCROLL_EDGE_EDEFAULT.equals(onScrollEdge);
		case ArkUIModelPackage.SCROLL_EVENT__ON_SCROLL_END:
			return ON_SCROLL_END_EDEFAULT == null ? onScrollEnd != null : !ON_SCROLL_END_EDEFAULT.equals(onScrollEnd);
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
		result.append(" (onScroll: ");
		result.append(onScroll);
		result.append(", onScrollEdge: ");
		result.append(onScrollEdge);
		result.append(", onScrollEnd: ");
		result.append(onScrollEnd);
		result.append(')');
		return result.toString();
	}

} //ScrollEventImpl
