/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TimePickerEvent;
import arkuimodel.arkUIModel.TimePickerStyle;
import arkuimodel.arkUIModel.TimePickerWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Picker Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TimePickerWidgetImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TimePickerWidgetImpl#getStart <em>Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TimePickerWidgetImpl#getEnd <em>End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TimePickerWidgetImpl#getTimepickerevent <em>Timepickerevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TimePickerWidgetImpl#getTimepickerstyle <em>Timepickerstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePickerWidgetImpl extends WidgetImpl implements TimePickerWidget {
	/**
	 * The default value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected String selected = SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimepickerevent() <em>Timepickerevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimepickerevent()
	 * @generated
	 * @ordered
	 */
	protected TimePickerEvent timepickerevent;

	/**
	 * The cached value of the '{@link #getTimepickerstyle() <em>Timepickerstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimepickerstyle()
	 * @generated
	 * @ordered
	 */
	protected TimePickerStyle timepickerstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePickerWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TIME_PICKER_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(String newSelected) {
		String oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TIME_PICKER_WIDGET__SELECTED,
					oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TIME_PICKER_WIDGET__START, oldStart,
					start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TIME_PICKER_WIDGET__END, oldEnd,
					end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePickerEvent getTimepickerevent() {
		return timepickerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimepickerevent(TimePickerEvent newTimepickerevent, NotificationChain msgs) {
		TimePickerEvent oldTimepickerevent = timepickerevent;
		timepickerevent = newTimepickerevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT, oldTimepickerevent, newTimepickerevent);
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
	public void setTimepickerevent(TimePickerEvent newTimepickerevent) {
		if (newTimepickerevent != timepickerevent) {
			NotificationChain msgs = null;
			if (timepickerevent != null)
				msgs = ((InternalEObject) timepickerevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT, null, msgs);
			if (newTimepickerevent != null)
				msgs = ((InternalEObject) newTimepickerevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT, null, msgs);
			msgs = basicSetTimepickerevent(newTimepickerevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT,
					newTimepickerevent, newTimepickerevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePickerStyle getTimepickerstyle() {
		return timepickerstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimepickerstyle(TimePickerStyle newTimepickerstyle, NotificationChain msgs) {
		TimePickerStyle oldTimepickerstyle = timepickerstyle;
		timepickerstyle = newTimepickerstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE, oldTimepickerstyle, newTimepickerstyle);
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
	public void setTimepickerstyle(TimePickerStyle newTimepickerstyle) {
		if (newTimepickerstyle != timepickerstyle) {
			NotificationChain msgs = null;
			if (timepickerstyle != null)
				msgs = ((InternalEObject) timepickerstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE, null, msgs);
			if (newTimepickerstyle != null)
				msgs = ((InternalEObject) newTimepickerstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE, null, msgs);
			msgs = basicSetTimepickerstyle(newTimepickerstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE,
					newTimepickerstyle, newTimepickerstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT:
			return basicSetTimepickerevent(null, msgs);
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE:
			return basicSetTimepickerstyle(null, msgs);
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
		case ArkUIModelPackage.TIME_PICKER_WIDGET__SELECTED:
			return getSelected();
		case ArkUIModelPackage.TIME_PICKER_WIDGET__START:
			return getStart();
		case ArkUIModelPackage.TIME_PICKER_WIDGET__END:
			return getEnd();
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT:
			return getTimepickerevent();
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE:
			return getTimepickerstyle();
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
		case ArkUIModelPackage.TIME_PICKER_WIDGET__SELECTED:
			setSelected((String) newValue);
			return;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__START:
			setStart((String) newValue);
			return;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__END:
			setEnd((String) newValue);
			return;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT:
			setTimepickerevent((TimePickerEvent) newValue);
			return;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE:
			setTimepickerstyle((TimePickerStyle) newValue);
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
		case ArkUIModelPackage.TIME_PICKER_WIDGET__SELECTED:
			setSelected(SELECTED_EDEFAULT);
			return;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__START:
			setStart(START_EDEFAULT);
			return;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__END:
			setEnd(END_EDEFAULT);
			return;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT:
			setTimepickerevent((TimePickerEvent) null);
			return;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE:
			setTimepickerstyle((TimePickerStyle) null);
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
		case ArkUIModelPackage.TIME_PICKER_WIDGET__SELECTED:
			return SELECTED_EDEFAULT == null ? selected != null : !SELECTED_EDEFAULT.equals(selected);
		case ArkUIModelPackage.TIME_PICKER_WIDGET__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case ArkUIModelPackage.TIME_PICKER_WIDGET__END:
			return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKEREVENT:
			return timepickerevent != null;
		case ArkUIModelPackage.TIME_PICKER_WIDGET__TIMEPICKERSTYLE:
			return timepickerstyle != null;
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
		result.append(" (selected: ");
		result.append(selected);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //TimePickerWidgetImpl
