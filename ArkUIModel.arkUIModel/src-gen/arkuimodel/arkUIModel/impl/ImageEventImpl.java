/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ImageEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageEventImpl#getOnComplete <em>On Complete</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageEventImpl#getOnError <em>On Error</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageEventImpl#getOnFinish <em>On Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageEventImpl extends EventImpl implements ImageEvent {
	/**
	 * The default value of the '{@link #getOnComplete() <em>On Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnComplete()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnComplete() <em>On Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnComplete()
	 * @generated
	 * @ordered
	 */
	protected String onComplete = ON_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnError() <em>On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnError()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnError() <em>On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnError()
	 * @generated
	 * @ordered
	 */
	protected String onError = ON_ERROR_EDEFAULT;

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
	protected ImageEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.IMAGE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnComplete() {
		return onComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnComplete(String newOnComplete) {
		String oldOnComplete = onComplete;
		onComplete = newOnComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_EVENT__ON_COMPLETE,
					oldOnComplete, onComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnError() {
		return onError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnError(String newOnError) {
		String oldOnError = onError;
		onError = newOnError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_EVENT__ON_ERROR, oldOnError,
					onError));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_EVENT__ON_FINISH, oldOnFinish,
					onFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.IMAGE_EVENT__ON_COMPLETE:
			return getOnComplete();
		case ArkUIModelPackage.IMAGE_EVENT__ON_ERROR:
			return getOnError();
		case ArkUIModelPackage.IMAGE_EVENT__ON_FINISH:
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
		case ArkUIModelPackage.IMAGE_EVENT__ON_COMPLETE:
			setOnComplete((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_EVENT__ON_ERROR:
			setOnError((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_EVENT__ON_FINISH:
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
		case ArkUIModelPackage.IMAGE_EVENT__ON_COMPLETE:
			setOnComplete(ON_COMPLETE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_EVENT__ON_ERROR:
			setOnError(ON_ERROR_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_EVENT__ON_FINISH:
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
		case ArkUIModelPackage.IMAGE_EVENT__ON_COMPLETE:
			return ON_COMPLETE_EDEFAULT == null ? onComplete != null : !ON_COMPLETE_EDEFAULT.equals(onComplete);
		case ArkUIModelPackage.IMAGE_EVENT__ON_ERROR:
			return ON_ERROR_EDEFAULT == null ? onError != null : !ON_ERROR_EDEFAULT.equals(onError);
		case ArkUIModelPackage.IMAGE_EVENT__ON_FINISH:
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
		result.append(" (onComplete: ");
		result.append(onComplete);
		result.append(", onError: ");
		result.append(onError);
		result.append(", onFinish: ");
		result.append(onFinish);
		result.append(')');
		return result.toString();
	}

} //ImageEventImpl
