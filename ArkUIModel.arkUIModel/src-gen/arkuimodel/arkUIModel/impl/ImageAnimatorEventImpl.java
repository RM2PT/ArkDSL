/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ImageAnimatorEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Animator Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl#getOnStart <em>On Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl#getOnPause <em>On Pause</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl#getOnRepeat <em>On Repeat</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl#getOnCancel <em>On Cancel</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl#getOnFinish <em>On Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageAnimatorEventImpl extends EventImpl implements ImageAnimatorEvent {
	/**
	 * The default value of the '{@link #getOnStart() <em>On Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnStart()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnStart() <em>On Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnStart()
	 * @generated
	 * @ordered
	 */
	protected String onStart = ON_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnPause() <em>On Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPause()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPause() <em>On Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPause()
	 * @generated
	 * @ordered
	 */
	protected String onPause = ON_PAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnRepeat() <em>On Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_REPEAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnRepeat() <em>On Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRepeat()
	 * @generated
	 * @ordered
	 */
	protected String onRepeat = ON_REPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnCancel() <em>On Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCancel()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CANCEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnCancel() <em>On Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCancel()
	 * @generated
	 * @ordered
	 */
	protected String onCancel = ON_CANCEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnFinish() <em>On Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFinish()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnFinish() <em>On Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFinish()
	 * @generated
	 * @ordered
	 */
	protected String onFinish = ON_FINISH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageAnimatorEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.IMAGE_ANIMATOR_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnStart() {
		return onStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnStart(String newOnStart) {
		String oldOnStart = onStart;
		onStart = newOnStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_START,
					oldOnStart, onStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnPause() {
		return onPause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPause(String newOnPause) {
		String oldOnPause = onPause;
		onPause = newOnPause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_PAUSE,
					oldOnPause, onPause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnRepeat() {
		return onRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnRepeat(String newOnRepeat) {
		String oldOnRepeat = onRepeat;
		onRepeat = newOnRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_REPEAT,
					oldOnRepeat, onRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnCancel() {
		return onCancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCancel(String newOnCancel) {
		String oldOnCancel = onCancel;
		onCancel = newOnCancel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_CANCEL,
					oldOnCancel, onCancel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnFinish() {
		return onFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFinish(String newOnFinish) {
		String oldOnFinish = onFinish;
		onFinish = newOnFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_FINISH,
					oldOnFinish, onFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_START:
			return getOnStart();
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_PAUSE:
			return getOnPause();
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_REPEAT:
			return getOnRepeat();
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_CANCEL:
			return getOnCancel();
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_FINISH:
			return getOnFinish();
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
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_START:
			setOnStart((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_PAUSE:
			setOnPause((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_REPEAT:
			setOnRepeat((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_CANCEL:
			setOnCancel((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_FINISH:
			setOnFinish((String) newValue);
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
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_START:
			setOnStart(ON_START_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_PAUSE:
			setOnPause(ON_PAUSE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_REPEAT:
			setOnRepeat(ON_REPEAT_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_CANCEL:
			setOnCancel(ON_CANCEL_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_FINISH:
			setOnFinish(ON_FINISH_EDEFAULT);
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
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_START:
			return ON_START_EDEFAULT == null ? onStart != null : !ON_START_EDEFAULT.equals(onStart);
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_PAUSE:
			return ON_PAUSE_EDEFAULT == null ? onPause != null : !ON_PAUSE_EDEFAULT.equals(onPause);
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_REPEAT:
			return ON_REPEAT_EDEFAULT == null ? onRepeat != null : !ON_REPEAT_EDEFAULT.equals(onRepeat);
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_CANCEL:
			return ON_CANCEL_EDEFAULT == null ? onCancel != null : !ON_CANCEL_EDEFAULT.equals(onCancel);
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT__ON_FINISH:
			return ON_FINISH_EDEFAULT == null ? onFinish != null : !ON_FINISH_EDEFAULT.equals(onFinish);
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
		result.append(" (onStart: ");
		result.append(onStart);
		result.append(", onPause: ");
		result.append(onPause);
		result.append(", onRepeat: ");
		result.append(onRepeat);
		result.append(", onCancel: ");
		result.append(onCancel);
		result.append(", onFinish: ");
		result.append(onFinish);
		result.append(')');
		return result.toString();
	}

} //ImageAnimatorEventImpl
