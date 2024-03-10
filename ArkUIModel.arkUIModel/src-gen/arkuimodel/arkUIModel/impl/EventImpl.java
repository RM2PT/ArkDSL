/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.Event;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnClick <em>On Click</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnTouch <em>On Touch</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnDragStart <em>On Drag Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnDragEnter <em>On Drag Enter</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnDragMove <em>On Drag Move</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnDragLeave <em>On Drag Leave</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnDrop <em>On Drop</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnAppear <em>On Appear</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnDisAppear <em>On Dis Appear</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getOnAreaChange <em>On Area Change</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EventImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The default value of the '{@link #getOnClick() <em>On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClick()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnClick() <em>On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClick()
	 * @generated
	 * @ordered
	 */
	protected String onClick = ON_CLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnTouch() <em>On Touch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTouch()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_TOUCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnTouch() <em>On Touch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTouch()
	 * @generated
	 * @ordered
	 */
	protected String onTouch = ON_TOUCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDragStart() <em>On Drag Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDragStart()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_DRAG_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnDragStart() <em>On Drag Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDragStart()
	 * @generated
	 * @ordered
	 */
	protected String onDragStart = ON_DRAG_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDragEnter() <em>On Drag Enter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDragEnter()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_DRAG_ENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnDragEnter() <em>On Drag Enter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDragEnter()
	 * @generated
	 * @ordered
	 */
	protected String onDragEnter = ON_DRAG_ENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDragMove() <em>On Drag Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDragMove()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_DRAG_MOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnDragMove() <em>On Drag Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDragMove()
	 * @generated
	 * @ordered
	 */
	protected String onDragMove = ON_DRAG_MOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDragLeave() <em>On Drag Leave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDragLeave()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_DRAG_LEAVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnDragLeave() <em>On Drag Leave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDragLeave()
	 * @generated
	 * @ordered
	 */
	protected String onDragLeave = ON_DRAG_LEAVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDrop() <em>On Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDrop()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_DROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnDrop() <em>On Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDrop()
	 * @generated
	 * @ordered
	 */
	protected String onDrop = ON_DROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnAppear() <em>On Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAppear()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_APPEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnAppear() <em>On Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAppear()
	 * @generated
	 * @ordered
	 */
	protected String onAppear = ON_APPEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDisAppear() <em>On Dis Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDisAppear()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_DIS_APPEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnDisAppear() <em>On Dis Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDisAppear()
	 * @generated
	 * @ordered
	 */
	protected String onDisAppear = ON_DIS_APPEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnAreaChange() <em>On Area Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAreaChange()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_AREA_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnAreaChange() <em>On Area Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAreaChange()
	 * @generated
	 * @ordered
	 */
	protected String onAreaChange = ON_AREA_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnClick() {
		return onClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnClick(String newOnClick) {
		String oldOnClick = onClick;
		onClick = newOnClick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_CLICK, oldOnClick,
					onClick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnTouch() {
		return onTouch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTouch(String newOnTouch) {
		String oldOnTouch = onTouch;
		onTouch = newOnTouch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_TOUCH, oldOnTouch,
					onTouch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnDragStart() {
		return onDragStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDragStart(String newOnDragStart) {
		String oldOnDragStart = onDragStart;
		onDragStart = newOnDragStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_DRAG_START,
					oldOnDragStart, onDragStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnDragEnter() {
		return onDragEnter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDragEnter(String newOnDragEnter) {
		String oldOnDragEnter = onDragEnter;
		onDragEnter = newOnDragEnter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_DRAG_ENTER,
					oldOnDragEnter, onDragEnter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnDragMove() {
		return onDragMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDragMove(String newOnDragMove) {
		String oldOnDragMove = onDragMove;
		onDragMove = newOnDragMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_DRAG_MOVE, oldOnDragMove,
					onDragMove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnDragLeave() {
		return onDragLeave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDragLeave(String newOnDragLeave) {
		String oldOnDragLeave = onDragLeave;
		onDragLeave = newOnDragLeave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_DRAG_LEAVE,
					oldOnDragLeave, onDragLeave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnDrop() {
		return onDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDrop(String newOnDrop) {
		String oldOnDrop = onDrop;
		onDrop = newOnDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_DROP, oldOnDrop, onDrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnAppear() {
		return onAppear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnAppear(String newOnAppear) {
		String oldOnAppear = onAppear;
		onAppear = newOnAppear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_APPEAR, oldOnAppear,
					onAppear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnDisAppear() {
		return onDisAppear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDisAppear(String newOnDisAppear) {
		String oldOnDisAppear = onDisAppear;
		onDisAppear = newOnDisAppear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_DIS_APPEAR,
					oldOnDisAppear, onDisAppear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnAreaChange() {
		return onAreaChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnAreaChange(String newOnAreaChange) {
		String oldOnAreaChange = onAreaChange;
		onAreaChange = newOnAreaChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__ON_AREA_CHANGE,
					oldOnAreaChange, onAreaChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.EVENT__ON_CLICK:
			return getOnClick();
		case ArkUIModelPackage.EVENT__ON_TOUCH:
			return getOnTouch();
		case ArkUIModelPackage.EVENT__ON_DRAG_START:
			return getOnDragStart();
		case ArkUIModelPackage.EVENT__ON_DRAG_ENTER:
			return getOnDragEnter();
		case ArkUIModelPackage.EVENT__ON_DRAG_MOVE:
			return getOnDragMove();
		case ArkUIModelPackage.EVENT__ON_DRAG_LEAVE:
			return getOnDragLeave();
		case ArkUIModelPackage.EVENT__ON_DROP:
			return getOnDrop();
		case ArkUIModelPackage.EVENT__ON_APPEAR:
			return getOnAppear();
		case ArkUIModelPackage.EVENT__ON_DIS_APPEAR:
			return getOnDisAppear();
		case ArkUIModelPackage.EVENT__ON_AREA_CHANGE:
			return getOnAreaChange();
		case ArkUIModelPackage.EVENT__NAME:
			return getName();
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
		case ArkUIModelPackage.EVENT__ON_CLICK:
			setOnClick((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_TOUCH:
			setOnTouch((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_DRAG_START:
			setOnDragStart((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_DRAG_ENTER:
			setOnDragEnter((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_DRAG_MOVE:
			setOnDragMove((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_DRAG_LEAVE:
			setOnDragLeave((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_DROP:
			setOnDrop((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_APPEAR:
			setOnAppear((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_DIS_APPEAR:
			setOnDisAppear((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__ON_AREA_CHANGE:
			setOnAreaChange((String) newValue);
			return;
		case ArkUIModelPackage.EVENT__NAME:
			setName((String) newValue);
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
		case ArkUIModelPackage.EVENT__ON_CLICK:
			setOnClick(ON_CLICK_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_TOUCH:
			setOnTouch(ON_TOUCH_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_DRAG_START:
			setOnDragStart(ON_DRAG_START_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_DRAG_ENTER:
			setOnDragEnter(ON_DRAG_ENTER_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_DRAG_MOVE:
			setOnDragMove(ON_DRAG_MOVE_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_DRAG_LEAVE:
			setOnDragLeave(ON_DRAG_LEAVE_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_DROP:
			setOnDrop(ON_DROP_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_APPEAR:
			setOnAppear(ON_APPEAR_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_DIS_APPEAR:
			setOnDisAppear(ON_DIS_APPEAR_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__ON_AREA_CHANGE:
			setOnAreaChange(ON_AREA_CHANGE_EDEFAULT);
			return;
		case ArkUIModelPackage.EVENT__NAME:
			setName(NAME_EDEFAULT);
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
		case ArkUIModelPackage.EVENT__ON_CLICK:
			return ON_CLICK_EDEFAULT == null ? onClick != null : !ON_CLICK_EDEFAULT.equals(onClick);
		case ArkUIModelPackage.EVENT__ON_TOUCH:
			return ON_TOUCH_EDEFAULT == null ? onTouch != null : !ON_TOUCH_EDEFAULT.equals(onTouch);
		case ArkUIModelPackage.EVENT__ON_DRAG_START:
			return ON_DRAG_START_EDEFAULT == null ? onDragStart != null : !ON_DRAG_START_EDEFAULT.equals(onDragStart);
		case ArkUIModelPackage.EVENT__ON_DRAG_ENTER:
			return ON_DRAG_ENTER_EDEFAULT == null ? onDragEnter != null : !ON_DRAG_ENTER_EDEFAULT.equals(onDragEnter);
		case ArkUIModelPackage.EVENT__ON_DRAG_MOVE:
			return ON_DRAG_MOVE_EDEFAULT == null ? onDragMove != null : !ON_DRAG_MOVE_EDEFAULT.equals(onDragMove);
		case ArkUIModelPackage.EVENT__ON_DRAG_LEAVE:
			return ON_DRAG_LEAVE_EDEFAULT == null ? onDragLeave != null : !ON_DRAG_LEAVE_EDEFAULT.equals(onDragLeave);
		case ArkUIModelPackage.EVENT__ON_DROP:
			return ON_DROP_EDEFAULT == null ? onDrop != null : !ON_DROP_EDEFAULT.equals(onDrop);
		case ArkUIModelPackage.EVENT__ON_APPEAR:
			return ON_APPEAR_EDEFAULT == null ? onAppear != null : !ON_APPEAR_EDEFAULT.equals(onAppear);
		case ArkUIModelPackage.EVENT__ON_DIS_APPEAR:
			return ON_DIS_APPEAR_EDEFAULT == null ? onDisAppear != null : !ON_DIS_APPEAR_EDEFAULT.equals(onDisAppear);
		case ArkUIModelPackage.EVENT__ON_AREA_CHANGE:
			return ON_AREA_CHANGE_EDEFAULT == null ? onAreaChange != null
					: !ON_AREA_CHANGE_EDEFAULT.equals(onAreaChange);
		case ArkUIModelPackage.EVENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (onClick: ");
		result.append(onClick);
		result.append(", onTouch: ");
		result.append(onTouch);
		result.append(", onDragStart: ");
		result.append(onDragStart);
		result.append(", onDragEnter: ");
		result.append(onDragEnter);
		result.append(", onDragMove: ");
		result.append(onDragMove);
		result.append(", onDragLeave: ");
		result.append(onDragLeave);
		result.append(", onDrop: ");
		result.append(onDrop);
		result.append(", onAppear: ");
		result.append(onAppear);
		result.append(", onDisAppear: ");
		result.append(onDisAppear);
		result.append(", onAreaChange: ");
		result.append(onAreaChange);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EventImpl
