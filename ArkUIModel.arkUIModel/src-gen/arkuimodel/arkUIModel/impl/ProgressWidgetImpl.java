/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ProgressEvent;
import arkuimodel.arkUIModel.ProgressStyle;
import arkuimodel.arkUIModel.ProgressWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressWidgetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressWidgetImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressWidgetImpl#getProgressType <em>Progress Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressWidgetImpl#getShowType <em>Show Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressWidgetImpl#getProgressevent <em>Progressevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ProgressWidgetImpl#getProgressstyle <em>Progressstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressWidgetImpl extends WidgetImpl implements ProgressWidget {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected String total = TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgressType() <em>Progress Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgressType() <em>Progress Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressType()
	 * @generated
	 * @ordered
	 */
	protected String progressType = PROGRESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowType() <em>Show Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowType()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOW_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowType() <em>Show Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowType()
	 * @generated
	 * @ordered
	 */
	protected String showType = SHOW_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgressevent() <em>Progressevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressevent()
	 * @generated
	 * @ordered
	 */
	protected ProgressEvent progressevent;

	/**
	 * The cached value of the '{@link #getProgressstyle() <em>Progressstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressstyle()
	 * @generated
	 * @ordered
	 */
	protected ProgressStyle progressstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.PROGRESS_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_WIDGET__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(String newTotal) {
		String oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_WIDGET__TOTAL, oldTotal,
					total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgressType() {
		return progressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgressType(String newProgressType) {
		String oldProgressType = progressType;
		progressType = newProgressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_WIDGET__PROGRESS_TYPE,
					oldProgressType, progressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShowType() {
		return showType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowType(String newShowType) {
		String oldShowType = showType;
		showType = newShowType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_WIDGET__SHOW_TYPE,
					oldShowType, showType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressEvent getProgressevent() {
		return progressevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgressevent(ProgressEvent newProgressevent, NotificationChain msgs) {
		ProgressEvent oldProgressevent = progressevent;
		progressevent = newProgressevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT, oldProgressevent, newProgressevent);
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
	public void setProgressevent(ProgressEvent newProgressevent) {
		if (newProgressevent != progressevent) {
			NotificationChain msgs = null;
			if (progressevent != null)
				msgs = ((InternalEObject) progressevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT, null, msgs);
			if (newProgressevent != null)
				msgs = ((InternalEObject) newProgressevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT, null, msgs);
			msgs = basicSetProgressevent(newProgressevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT,
					newProgressevent, newProgressevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressStyle getProgressstyle() {
		return progressstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgressstyle(ProgressStyle newProgressstyle, NotificationChain msgs) {
		ProgressStyle oldProgressstyle = progressstyle;
		progressstyle = newProgressstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE, oldProgressstyle, newProgressstyle);
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
	public void setProgressstyle(ProgressStyle newProgressstyle) {
		if (newProgressstyle != progressstyle) {
			NotificationChain msgs = null;
			if (progressstyle != null)
				msgs = ((InternalEObject) progressstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE, null, msgs);
			if (newProgressstyle != null)
				msgs = ((InternalEObject) newProgressstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE, null, msgs);
			msgs = basicSetProgressstyle(newProgressstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE,
					newProgressstyle, newProgressstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT:
			return basicSetProgressevent(null, msgs);
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE:
			return basicSetProgressstyle(null, msgs);
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
		case ArkUIModelPackage.PROGRESS_WIDGET__VALUE:
			return getValue();
		case ArkUIModelPackage.PROGRESS_WIDGET__TOTAL:
			return getTotal();
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESS_TYPE:
			return getProgressType();
		case ArkUIModelPackage.PROGRESS_WIDGET__SHOW_TYPE:
			return getShowType();
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT:
			return getProgressevent();
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE:
			return getProgressstyle();
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
		case ArkUIModelPackage.PROGRESS_WIDGET__VALUE:
			setValue((String) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__TOTAL:
			setTotal((String) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESS_TYPE:
			setProgressType((String) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__SHOW_TYPE:
			setShowType((String) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT:
			setProgressevent((ProgressEvent) newValue);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE:
			setProgressstyle((ProgressStyle) newValue);
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
		case ArkUIModelPackage.PROGRESS_WIDGET__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__TOTAL:
			setTotal(TOTAL_EDEFAULT);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESS_TYPE:
			setProgressType(PROGRESS_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__SHOW_TYPE:
			setShowType(SHOW_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT:
			setProgressevent((ProgressEvent) null);
			return;
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE:
			setProgressstyle((ProgressStyle) null);
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
		case ArkUIModelPackage.PROGRESS_WIDGET__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ArkUIModelPackage.PROGRESS_WIDGET__TOTAL:
			return TOTAL_EDEFAULT == null ? total != null : !TOTAL_EDEFAULT.equals(total);
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESS_TYPE:
			return PROGRESS_TYPE_EDEFAULT == null ? progressType != null : !PROGRESS_TYPE_EDEFAULT.equals(progressType);
		case ArkUIModelPackage.PROGRESS_WIDGET__SHOW_TYPE:
			return SHOW_TYPE_EDEFAULT == null ? showType != null : !SHOW_TYPE_EDEFAULT.equals(showType);
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSEVENT:
			return progressevent != null;
		case ArkUIModelPackage.PROGRESS_WIDGET__PROGRESSSTYLE:
			return progressstyle != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", total: ");
		result.append(total);
		result.append(", progressType: ");
		result.append(progressType);
		result.append(", showType: ");
		result.append(showType);
		result.append(')');
		return result.toString();
	}

} //ProgressWidgetImpl
