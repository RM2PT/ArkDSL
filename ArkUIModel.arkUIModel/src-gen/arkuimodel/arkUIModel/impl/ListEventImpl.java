/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ListEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnScroll <em>On Scroll</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnScrollIndex <em>On Scroll Index</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnReachStart <em>On Reach Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnReachEnd <em>On Reach End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnScrollStop <em>On Scroll Stop</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnItemDelete <em>On Item Delete</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnItemMove <em>On Item Move</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnBlur <em>On Blur</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListEventImpl#getOnFocus <em>On Focus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListEventImpl extends EventImpl implements ListEvent {
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
	 * The default value of the '{@link #getOnScrollIndex() <em>On Scroll Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScrollIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SCROLL_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnScrollIndex() <em>On Scroll Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScrollIndex()
	 * @generated
	 * @ordered
	 */
	protected String onScrollIndex = ON_SCROLL_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnReachStart() <em>On Reach Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReachStart()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_REACH_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnReachStart() <em>On Reach Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReachStart()
	 * @generated
	 * @ordered
	 */
	protected String onReachStart = ON_REACH_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnReachEnd() <em>On Reach End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReachEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_REACH_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnReachEnd() <em>On Reach End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnReachEnd()
	 * @generated
	 * @ordered
	 */
	protected String onReachEnd = ON_REACH_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnScrollStop() <em>On Scroll Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScrollStop()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SCROLL_STOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnScrollStop() <em>On Scroll Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnScrollStop()
	 * @generated
	 * @ordered
	 */
	protected String onScrollStop = ON_SCROLL_STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnItemDelete() <em>On Item Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnItemDelete()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_ITEM_DELETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnItemDelete() <em>On Item Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnItemDelete()
	 * @generated
	 * @ordered
	 */
	protected String onItemDelete = ON_ITEM_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnItemMove() <em>On Item Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnItemMove()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_ITEM_MOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnItemMove() <em>On Item Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnItemMove()
	 * @generated
	 * @ordered
	 */
	protected String onItemMove = ON_ITEM_MOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnBlur() <em>On Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBlur()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_BLUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnBlur() <em>On Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBlur()
	 * @generated
	 * @ordered
	 */
	protected String onBlur = ON_BLUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnFocus() <em>On Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFocus()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_FOCUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnFocus() <em>On Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFocus()
	 * @generated
	 * @ordered
	 */
	protected String onFocus = ON_FOCUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.LIST_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_SCROLL, oldOnScroll,
					onScroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnScrollIndex() {
		return onScrollIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnScrollIndex(String newOnScrollIndex) {
		String oldOnScrollIndex = onScrollIndex;
		onScrollIndex = newOnScrollIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_SCROLL_INDEX,
					oldOnScrollIndex, onScrollIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReachStart() {
		return onReachStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnReachStart(String newOnReachStart) {
		String oldOnReachStart = onReachStart;
		onReachStart = newOnReachStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_REACH_START,
					oldOnReachStart, onReachStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnReachEnd() {
		return onReachEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnReachEnd(String newOnReachEnd) {
		String oldOnReachEnd = onReachEnd;
		onReachEnd = newOnReachEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_REACH_END,
					oldOnReachEnd, onReachEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnScrollStop() {
		return onScrollStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnScrollStop(String newOnScrollStop) {
		String oldOnScrollStop = onScrollStop;
		onScrollStop = newOnScrollStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_SCROLL_STOP,
					oldOnScrollStop, onScrollStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnItemDelete() {
		return onItemDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnItemDelete(String newOnItemDelete) {
		String oldOnItemDelete = onItemDelete;
		onItemDelete = newOnItemDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_ITEM_DELETE,
					oldOnItemDelete, onItemDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnItemMove() {
		return onItemMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnItemMove(String newOnItemMove) {
		String oldOnItemMove = onItemMove;
		onItemMove = newOnItemMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_ITEM_MOVE,
					oldOnItemMove, onItemMove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnBlur() {
		return onBlur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBlur(String newOnBlur) {
		String oldOnBlur = onBlur;
		onBlur = newOnBlur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_BLUR, oldOnBlur,
					onBlur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnFocus() {
		return onFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFocus(String newOnFocus) {
		String oldOnFocus = onFocus;
		onFocus = newOnFocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_EVENT__ON_FOCUS, oldOnFocus,
					onFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL:
			return getOnScroll();
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_INDEX:
			return getOnScrollIndex();
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_START:
			return getOnReachStart();
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_END:
			return getOnReachEnd();
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_STOP:
			return getOnScrollStop();
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_DELETE:
			return getOnItemDelete();
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_MOVE:
			return getOnItemMove();
		case ArkUIModelPackage.LIST_EVENT__ON_BLUR:
			return getOnBlur();
		case ArkUIModelPackage.LIST_EVENT__ON_FOCUS:
			return getOnFocus();
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
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL:
			setOnScroll((String) newValue);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_INDEX:
			setOnScrollIndex((String) newValue);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_START:
			setOnReachStart((String) newValue);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_END:
			setOnReachEnd((String) newValue);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_STOP:
			setOnScrollStop((String) newValue);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_DELETE:
			setOnItemDelete((String) newValue);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_MOVE:
			setOnItemMove((String) newValue);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_BLUR:
			setOnBlur((String) newValue);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_FOCUS:
			setOnFocus((String) newValue);
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
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL:
			setOnScroll(ON_SCROLL_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_INDEX:
			setOnScrollIndex(ON_SCROLL_INDEX_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_START:
			setOnReachStart(ON_REACH_START_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_END:
			setOnReachEnd(ON_REACH_END_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_STOP:
			setOnScrollStop(ON_SCROLL_STOP_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_DELETE:
			setOnItemDelete(ON_ITEM_DELETE_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_MOVE:
			setOnItemMove(ON_ITEM_MOVE_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_BLUR:
			setOnBlur(ON_BLUR_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_EVENT__ON_FOCUS:
			setOnFocus(ON_FOCUS_EDEFAULT);
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
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL:
			return ON_SCROLL_EDEFAULT == null ? onScroll != null : !ON_SCROLL_EDEFAULT.equals(onScroll);
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_INDEX:
			return ON_SCROLL_INDEX_EDEFAULT == null ? onScrollIndex != null
					: !ON_SCROLL_INDEX_EDEFAULT.equals(onScrollIndex);
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_START:
			return ON_REACH_START_EDEFAULT == null ? onReachStart != null
					: !ON_REACH_START_EDEFAULT.equals(onReachStart);
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_END:
			return ON_REACH_END_EDEFAULT == null ? onReachEnd != null : !ON_REACH_END_EDEFAULT.equals(onReachEnd);
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_STOP:
			return ON_SCROLL_STOP_EDEFAULT == null ? onScrollStop != null
					: !ON_SCROLL_STOP_EDEFAULT.equals(onScrollStop);
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_DELETE:
			return ON_ITEM_DELETE_EDEFAULT == null ? onItemDelete != null
					: !ON_ITEM_DELETE_EDEFAULT.equals(onItemDelete);
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_MOVE:
			return ON_ITEM_MOVE_EDEFAULT == null ? onItemMove != null : !ON_ITEM_MOVE_EDEFAULT.equals(onItemMove);
		case ArkUIModelPackage.LIST_EVENT__ON_BLUR:
			return ON_BLUR_EDEFAULT == null ? onBlur != null : !ON_BLUR_EDEFAULT.equals(onBlur);
		case ArkUIModelPackage.LIST_EVENT__ON_FOCUS:
			return ON_FOCUS_EDEFAULT == null ? onFocus != null : !ON_FOCUS_EDEFAULT.equals(onFocus);
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
		result.append(", onScrollIndex: ");
		result.append(onScrollIndex);
		result.append(", onReachStart: ");
		result.append(onReachStart);
		result.append(", onReachEnd: ");
		result.append(onReachEnd);
		result.append(", onScrollStop: ");
		result.append(onScrollStop);
		result.append(", onItemDelete: ");
		result.append(onItemDelete);
		result.append(", onItemMove: ");
		result.append(onItemMove);
		result.append(", onBlur: ");
		result.append(onBlur);
		result.append(", onFocus: ");
		result.append(onFocus);
		result.append(')');
		return result.toString();
	}

} //ListEventImpl
