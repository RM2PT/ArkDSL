/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ImageAnimatorStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Animator Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl#getState <em>State</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl#getReverse <em>Reverse</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl#getFixedSize <em>Fixed Size</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl#getPreDecode <em>Pre Decode</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl#getFillMode <em>Fill Mode</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageAnimatorStyleImpl extends StyleClassImpl implements ImageAnimatorStyle {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

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
	 * The default value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected static final String REVERSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected String reverse = REVERSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedSize() <em>Fixed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedSize() <em>Fixed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedSize()
	 * @generated
	 * @ordered
	 */
	protected String fixedSize = FIXED_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreDecode() <em>Pre Decode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDecode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_DECODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreDecode() <em>Pre Decode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDecode()
	 * @generated
	 * @ordered
	 */
	protected String preDecode = PRE_DECODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillMode() <em>Fill Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillMode()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillMode() <em>Fill Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillMode()
	 * @generated
	 * @ordered
	 */
	protected String fillMode = FILL_MODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageAnimatorStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.IMAGE_ANIMATOR_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__STATE,
					oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReverse() {
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverse(String newReverse) {
		String oldReverse = reverse;
		reverse = newReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__REVERSE,
					oldReverse, reverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFixedSize() {
		return fixedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedSize(String newFixedSize) {
		String oldFixedSize = fixedSize;
		fixedSize = newFixedSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FIXED_SIZE,
					oldFixedSize, fixedSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreDecode() {
		return preDecode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreDecode(String newPreDecode) {
		String oldPreDecode = preDecode;
		preDecode = newPreDecode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__PRE_DECODE,
					oldPreDecode, preDecode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillMode() {
		return fillMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillMode(String newFillMode) {
		String oldFillMode = fillMode;
		fillMode = newFillMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FILL_MODE,
					oldFillMode, fillMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__ITERATIONS,
					oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__STATE:
			return getState();
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__DURATION:
			return getDuration();
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__REVERSE:
			return getReverse();
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FIXED_SIZE:
			return getFixedSize();
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__PRE_DECODE:
			return getPreDecode();
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FILL_MODE:
			return getFillMode();
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__ITERATIONS:
			return getIterations();
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
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__STATE:
			setState((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__DURATION:
			setDuration((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__REVERSE:
			setReverse((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FIXED_SIZE:
			setFixedSize((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__PRE_DECODE:
			setPreDecode((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FILL_MODE:
			setFillMode((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__ITERATIONS:
			setIterations((String) newValue);
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
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__STATE:
			setState(STATE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__REVERSE:
			setReverse(REVERSE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FIXED_SIZE:
			setFixedSize(FIXED_SIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__PRE_DECODE:
			setPreDecode(PRE_DECODE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FILL_MODE:
			setFillMode(FILL_MODE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__ITERATIONS:
			setIterations(ITERATIONS_EDEFAULT);
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
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__REVERSE:
			return REVERSE_EDEFAULT == null ? reverse != null : !REVERSE_EDEFAULT.equals(reverse);
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FIXED_SIZE:
			return FIXED_SIZE_EDEFAULT == null ? fixedSize != null : !FIXED_SIZE_EDEFAULT.equals(fixedSize);
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__PRE_DECODE:
			return PRE_DECODE_EDEFAULT == null ? preDecode != null : !PRE_DECODE_EDEFAULT.equals(preDecode);
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FILL_MODE:
			return FILL_MODE_EDEFAULT == null ? fillMode != null : !FILL_MODE_EDEFAULT.equals(fillMode);
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__ITERATIONS:
			return ITERATIONS_EDEFAULT == null ? iterations != null : !ITERATIONS_EDEFAULT.equals(iterations);
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
		result.append(" (state: ");
		result.append(state);
		result.append(", duration: ");
		result.append(duration);
		result.append(", reverse: ");
		result.append(reverse);
		result.append(", fixedSize: ");
		result.append(fixedSize);
		result.append(", preDecode: ");
		result.append(preDecode);
		result.append(", fillMode: ");
		result.append(fillMode);
		result.append(", iterations: ");
		result.append(iterations);
		result.append(')');
		return result.toString();
	}

} //ImageAnimatorStyleImpl
