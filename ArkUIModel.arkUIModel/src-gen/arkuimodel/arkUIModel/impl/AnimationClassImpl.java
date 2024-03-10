/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.AnimationClass;
import arkuimodel.arkUIModel.ArkUIModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.AnimationClassImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.AnimationClassImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.AnimationClassImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.AnimationClassImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.AnimationClassImpl#getPlayMode <em>Play Mode</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.AnimationClassImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnimationClassImpl extends MinimalEObjectImpl.Container implements AnimationClass {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurve() <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected static final String CURVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected String curve = CURVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected String delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected String iterations = ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayMode() <em>Play Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayMode()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayMode() <em>Play Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayMode()
	 * @generated
	 * @ordered
	 */
	protected String playMode = PLAY_MODE_EDEFAULT;

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
	protected AnimationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.ANIMATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ANIMATION_CLASS__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurve() {
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurve(String newCurve) {
		String oldCurve = curve;
		curve = newCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ANIMATION_CLASS__CURVE, oldCurve,
					curve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(String newDelay) {
		String oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ANIMATION_CLASS__DELAY, oldDelay,
					delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(String newIterations) {
		String oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ANIMATION_CLASS__ITERATIONS,
					oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlayMode() {
		return playMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayMode(String newPlayMode) {
		String oldPlayMode = playMode;
		playMode = newPlayMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ANIMATION_CLASS__PLAY_MODE,
					oldPlayMode, playMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ANIMATION_CLASS__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.ANIMATION_CLASS__DURATION:
			return getDuration();
		case ArkUIModelPackage.ANIMATION_CLASS__CURVE:
			return getCurve();
		case ArkUIModelPackage.ANIMATION_CLASS__DELAY:
			return getDelay();
		case ArkUIModelPackage.ANIMATION_CLASS__ITERATIONS:
			return getIterations();
		case ArkUIModelPackage.ANIMATION_CLASS__PLAY_MODE:
			return getPlayMode();
		case ArkUIModelPackage.ANIMATION_CLASS__NAME:
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
		case ArkUIModelPackage.ANIMATION_CLASS__DURATION:
			setDuration((String) newValue);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__CURVE:
			setCurve((String) newValue);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__DELAY:
			setDelay((String) newValue);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__ITERATIONS:
			setIterations((String) newValue);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__PLAY_MODE:
			setPlayMode((String) newValue);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__NAME:
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
		case ArkUIModelPackage.ANIMATION_CLASS__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__CURVE:
			setCurve(CURVE_EDEFAULT);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__DELAY:
			setDelay(DELAY_EDEFAULT);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__ITERATIONS:
			setIterations(ITERATIONS_EDEFAULT);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__PLAY_MODE:
			setPlayMode(PLAY_MODE_EDEFAULT);
			return;
		case ArkUIModelPackage.ANIMATION_CLASS__NAME:
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
		case ArkUIModelPackage.ANIMATION_CLASS__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case ArkUIModelPackage.ANIMATION_CLASS__CURVE:
			return CURVE_EDEFAULT == null ? curve != null : !CURVE_EDEFAULT.equals(curve);
		case ArkUIModelPackage.ANIMATION_CLASS__DELAY:
			return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
		case ArkUIModelPackage.ANIMATION_CLASS__ITERATIONS:
			return ITERATIONS_EDEFAULT == null ? iterations != null : !ITERATIONS_EDEFAULT.equals(iterations);
		case ArkUIModelPackage.ANIMATION_CLASS__PLAY_MODE:
			return PLAY_MODE_EDEFAULT == null ? playMode != null : !PLAY_MODE_EDEFAULT.equals(playMode);
		case ArkUIModelPackage.ANIMATION_CLASS__NAME:
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", curve: ");
		result.append(curve);
		result.append(", delay: ");
		result.append(delay);
		result.append(", iterations: ");
		result.append(iterations);
		result.append(", playMode: ");
		result.append(playMode);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AnimationClassImpl
