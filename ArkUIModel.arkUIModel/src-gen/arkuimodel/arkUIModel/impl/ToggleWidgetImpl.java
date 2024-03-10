/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ToggleEvent;
import arkuimodel.arkUIModel.ToggleStyle;
import arkuimodel.arkUIModel.ToggleWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toggle Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ToggleWidgetImpl#getIsOn <em>Is On</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ToggleWidgetImpl#getToggleType <em>Toggle Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ToggleWidgetImpl#getToggleevent <em>Toggleevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ToggleWidgetImpl#getTogglestyle <em>Togglestyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToggleWidgetImpl extends WidgetImpl implements ToggleWidget {
	/**
	 * The default value of the '{@link #getIsOn() <em>Is On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOn()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOn() <em>Is On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOn()
	 * @generated
	 * @ordered
	 */
	protected String isOn = IS_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getToggleType() <em>Toggle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToggleType()
	 * @generated
	 * @ordered
	 */
	protected static final String TOGGLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToggleType() <em>Toggle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToggleType()
	 * @generated
	 * @ordered
	 */
	protected String toggleType = TOGGLE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToggleevent() <em>Toggleevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToggleevent()
	 * @generated
	 * @ordered
	 */
	protected ToggleEvent toggleevent;

	/**
	 * The cached value of the '{@link #getTogglestyle() <em>Togglestyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTogglestyle()
	 * @generated
	 * @ordered
	 */
	protected ToggleStyle togglestyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToggleWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TOGGLE_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsOn() {
		return isOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOn(String newIsOn) {
		String oldIsOn = isOn;
		isOn = newIsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TOGGLE_WIDGET__IS_ON, oldIsOn,
					isOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToggleType() {
		return toggleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToggleType(String newToggleType) {
		String oldToggleType = toggleType;
		toggleType = newToggleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TOGGLE_WIDGET__TOGGLE_TYPE,
					oldToggleType, toggleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleEvent getToggleevent() {
		return toggleevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToggleevent(ToggleEvent newToggleevent, NotificationChain msgs) {
		ToggleEvent oldToggleevent = toggleevent;
		toggleevent = newToggleevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT, oldToggleevent, newToggleevent);
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
	public void setToggleevent(ToggleEvent newToggleevent) {
		if (newToggleevent != toggleevent) {
			NotificationChain msgs = null;
			if (toggleevent != null)
				msgs = ((InternalEObject) toggleevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT, null, msgs);
			if (newToggleevent != null)
				msgs = ((InternalEObject) newToggleevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT, null, msgs);
			msgs = basicSetToggleevent(newToggleevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT,
					newToggleevent, newToggleevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleStyle getTogglestyle() {
		return togglestyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTogglestyle(ToggleStyle newTogglestyle, NotificationChain msgs) {
		ToggleStyle oldTogglestyle = togglestyle;
		togglestyle = newTogglestyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE, oldTogglestyle, newTogglestyle);
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
	public void setTogglestyle(ToggleStyle newTogglestyle) {
		if (newTogglestyle != togglestyle) {
			NotificationChain msgs = null;
			if (togglestyle != null)
				msgs = ((InternalEObject) togglestyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE, null, msgs);
			if (newTogglestyle != null)
				msgs = ((InternalEObject) newTogglestyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE, null, msgs);
			msgs = basicSetTogglestyle(newTogglestyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE,
					newTogglestyle, newTogglestyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT:
			return basicSetToggleevent(null, msgs);
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE:
			return basicSetTogglestyle(null, msgs);
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
		case ArkUIModelPackage.TOGGLE_WIDGET__IS_ON:
			return getIsOn();
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLE_TYPE:
			return getToggleType();
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT:
			return getToggleevent();
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE:
			return getTogglestyle();
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
		case ArkUIModelPackage.TOGGLE_WIDGET__IS_ON:
			setIsOn((String) newValue);
			return;
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLE_TYPE:
			setToggleType((String) newValue);
			return;
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT:
			setToggleevent((ToggleEvent) newValue);
			return;
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE:
			setTogglestyle((ToggleStyle) newValue);
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
		case ArkUIModelPackage.TOGGLE_WIDGET__IS_ON:
			setIsOn(IS_ON_EDEFAULT);
			return;
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLE_TYPE:
			setToggleType(TOGGLE_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT:
			setToggleevent((ToggleEvent) null);
			return;
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE:
			setTogglestyle((ToggleStyle) null);
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
		case ArkUIModelPackage.TOGGLE_WIDGET__IS_ON:
			return IS_ON_EDEFAULT == null ? isOn != null : !IS_ON_EDEFAULT.equals(isOn);
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLE_TYPE:
			return TOGGLE_TYPE_EDEFAULT == null ? toggleType != null : !TOGGLE_TYPE_EDEFAULT.equals(toggleType);
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLEEVENT:
			return toggleevent != null;
		case ArkUIModelPackage.TOGGLE_WIDGET__TOGGLESTYLE:
			return togglestyle != null;
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
		result.append(" (isOn: ");
		result.append(isOn);
		result.append(", toggleType: ");
		result.append(toggleType);
		result.append(')');
		return result.toString();
	}

} //ToggleWidgetImpl
