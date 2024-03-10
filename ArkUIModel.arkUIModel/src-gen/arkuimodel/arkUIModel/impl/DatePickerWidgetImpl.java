/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.DatePickerEvent;
import arkuimodel.arkUIModel.DatePickerStyle;
import arkuimodel.arkUIModel.DatePickerWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Picker Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.DatePickerWidgetImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.DatePickerWidgetImpl#getStart <em>Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.DatePickerWidgetImpl#getEnd <em>End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.DatePickerWidgetImpl#getDatepickerevent <em>Datepickerevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.DatePickerWidgetImpl#getDatepickerstyle <em>Datepickerstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatePickerWidgetImpl extends WidgetImpl implements DatePickerWidget {
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
	 * The cached value of the '{@link #getDatepickerevent() <em>Datepickerevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatepickerevent()
	 * @generated
	 * @ordered
	 */
	protected DatePickerEvent datepickerevent;

	/**
	 * The cached value of the '{@link #getDatepickerstyle() <em>Datepickerstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatepickerstyle()
	 * @generated
	 * @ordered
	 */
	protected DatePickerStyle datepickerstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatePickerWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.DATE_PICKER_WIDGET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DATE_PICKER_WIDGET__SELECTED,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DATE_PICKER_WIDGET__START, oldStart,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DATE_PICKER_WIDGET__END, oldEnd,
					end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePickerEvent getDatepickerevent() {
		return datepickerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatepickerevent(DatePickerEvent newDatepickerevent, NotificationChain msgs) {
		DatePickerEvent oldDatepickerevent = datepickerevent;
		datepickerevent = newDatepickerevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT, oldDatepickerevent, newDatepickerevent);
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
	public void setDatepickerevent(DatePickerEvent newDatepickerevent) {
		if (newDatepickerevent != datepickerevent) {
			NotificationChain msgs = null;
			if (datepickerevent != null)
				msgs = ((InternalEObject) datepickerevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT, null, msgs);
			if (newDatepickerevent != null)
				msgs = ((InternalEObject) newDatepickerevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT, null, msgs);
			msgs = basicSetDatepickerevent(newDatepickerevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT,
					newDatepickerevent, newDatepickerevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePickerStyle getDatepickerstyle() {
		return datepickerstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatepickerstyle(DatePickerStyle newDatepickerstyle, NotificationChain msgs) {
		DatePickerStyle oldDatepickerstyle = datepickerstyle;
		datepickerstyle = newDatepickerstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE, oldDatepickerstyle, newDatepickerstyle);
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
	public void setDatepickerstyle(DatePickerStyle newDatepickerstyle) {
		if (newDatepickerstyle != datepickerstyle) {
			NotificationChain msgs = null;
			if (datepickerstyle != null)
				msgs = ((InternalEObject) datepickerstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE, null, msgs);
			if (newDatepickerstyle != null)
				msgs = ((InternalEObject) newDatepickerstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE, null, msgs);
			msgs = basicSetDatepickerstyle(newDatepickerstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE,
					newDatepickerstyle, newDatepickerstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT:
			return basicSetDatepickerevent(null, msgs);
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE:
			return basicSetDatepickerstyle(null, msgs);
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
		case ArkUIModelPackage.DATE_PICKER_WIDGET__SELECTED:
			return getSelected();
		case ArkUIModelPackage.DATE_PICKER_WIDGET__START:
			return getStart();
		case ArkUIModelPackage.DATE_PICKER_WIDGET__END:
			return getEnd();
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT:
			return getDatepickerevent();
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE:
			return getDatepickerstyle();
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
		case ArkUIModelPackage.DATE_PICKER_WIDGET__SELECTED:
			setSelected((String) newValue);
			return;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__START:
			setStart((String) newValue);
			return;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__END:
			setEnd((String) newValue);
			return;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT:
			setDatepickerevent((DatePickerEvent) newValue);
			return;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE:
			setDatepickerstyle((DatePickerStyle) newValue);
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
		case ArkUIModelPackage.DATE_PICKER_WIDGET__SELECTED:
			setSelected(SELECTED_EDEFAULT);
			return;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__START:
			setStart(START_EDEFAULT);
			return;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__END:
			setEnd(END_EDEFAULT);
			return;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT:
			setDatepickerevent((DatePickerEvent) null);
			return;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE:
			setDatepickerstyle((DatePickerStyle) null);
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
		case ArkUIModelPackage.DATE_PICKER_WIDGET__SELECTED:
			return SELECTED_EDEFAULT == null ? selected != null : !SELECTED_EDEFAULT.equals(selected);
		case ArkUIModelPackage.DATE_PICKER_WIDGET__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case ArkUIModelPackage.DATE_PICKER_WIDGET__END:
			return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKEREVENT:
			return datepickerevent != null;
		case ArkUIModelPackage.DATE_PICKER_WIDGET__DATEPICKERSTYLE:
			return datepickerstyle != null;
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

} //DatePickerWidgetImpl
