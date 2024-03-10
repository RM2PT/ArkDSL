/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.SwiperStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swiper Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getAutoPlay <em>Auto Play</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getVertical <em>Vertical</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getItemSpace <em>Item Space</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl#getDisplayMode <em>Display Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwiperStyleImpl extends StyleClassImpl implements SwiperStyle {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoPlay() <em>Auto Play</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoPlay()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_PLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoPlay() <em>Auto Play</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoPlay()
	 * @generated
	 * @ordered
	 */
	protected String autoPlay = AUTO_PLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected String interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndicator() <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicator() <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected String indicator = INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoop()
	 * @generated
	 * @ordered
	 */
	protected static final String LOOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoop()
	 * @generated
	 * @ordered
	 */
	protected String loop = LOOP_EDEFAULT;

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
	 * The default value of the '{@link #getVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical()
	 * @generated
	 * @ordered
	 */
	protected static final String VERTICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical()
	 * @generated
	 * @ordered
	 */
	protected String vertical = VERTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemSpace() <em>Item Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemSpace() <em>Item Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSpace()
	 * @generated
	 * @ordered
	 */
	protected String itemSpace = ITEM_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayMode() <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayMode() <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected String displayMode = DISPLAY_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwiperStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SWIPER_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__INDEX, oldIndex,
					index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoPlay() {
		return autoPlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoPlay(String newAutoPlay) {
		String oldAutoPlay = autoPlay;
		autoPlay = newAutoPlay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__AUTO_PLAY,
					oldAutoPlay, autoPlay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(String newInterval) {
		String oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__INTERVAL, oldInterval,
					interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndicator() {
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicator(String newIndicator) {
		String oldIndicator = indicator;
		indicator = newIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__INDICATOR,
					oldIndicator, indicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoop() {
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(String newLoop) {
		String oldLoop = loop;
		loop = newLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__LOOP, oldLoop, loop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVertical() {
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertical(String newVertical) {
		String oldVertical = vertical;
		vertical = newVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__VERTICAL, oldVertical,
					vertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemSpace() {
		return itemSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemSpace(String newItemSpace) {
		String oldItemSpace = itemSpace;
		itemSpace = newItemSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__ITEM_SPACE,
					oldItemSpace, itemSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayMode() {
		return displayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayMode(String newDisplayMode) {
		String oldDisplayMode = displayMode;
		displayMode = newDisplayMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SWIPER_STYLE__DISPLAY_MODE,
					oldDisplayMode, displayMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.SWIPER_STYLE__INDEX:
			return getIndex();
		case ArkUIModelPackage.SWIPER_STYLE__AUTO_PLAY:
			return getAutoPlay();
		case ArkUIModelPackage.SWIPER_STYLE__INTERVAL:
			return getInterval();
		case ArkUIModelPackage.SWIPER_STYLE__INDICATOR:
			return getIndicator();
		case ArkUIModelPackage.SWIPER_STYLE__LOOP:
			return getLoop();
		case ArkUIModelPackage.SWIPER_STYLE__DURATION:
			return getDuration();
		case ArkUIModelPackage.SWIPER_STYLE__VERTICAL:
			return getVertical();
		case ArkUIModelPackage.SWIPER_STYLE__ITEM_SPACE:
			return getItemSpace();
		case ArkUIModelPackage.SWIPER_STYLE__DISPLAY_MODE:
			return getDisplayMode();
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
		case ArkUIModelPackage.SWIPER_STYLE__INDEX:
			setIndex((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__AUTO_PLAY:
			setAutoPlay((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__INTERVAL:
			setInterval((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__INDICATOR:
			setIndicator((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__LOOP:
			setLoop((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__DURATION:
			setDuration((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__VERTICAL:
			setVertical((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__ITEM_SPACE:
			setItemSpace((String) newValue);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__DISPLAY_MODE:
			setDisplayMode((String) newValue);
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
		case ArkUIModelPackage.SWIPER_STYLE__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__AUTO_PLAY:
			setAutoPlay(AUTO_PLAY_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__INTERVAL:
			setInterval(INTERVAL_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__INDICATOR:
			setIndicator(INDICATOR_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__LOOP:
			setLoop(LOOP_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__VERTICAL:
			setVertical(VERTICAL_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__ITEM_SPACE:
			setItemSpace(ITEM_SPACE_EDEFAULT);
			return;
		case ArkUIModelPackage.SWIPER_STYLE__DISPLAY_MODE:
			setDisplayMode(DISPLAY_MODE_EDEFAULT);
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
		case ArkUIModelPackage.SWIPER_STYLE__INDEX:
			return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
		case ArkUIModelPackage.SWIPER_STYLE__AUTO_PLAY:
			return AUTO_PLAY_EDEFAULT == null ? autoPlay != null : !AUTO_PLAY_EDEFAULT.equals(autoPlay);
		case ArkUIModelPackage.SWIPER_STYLE__INTERVAL:
			return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
		case ArkUIModelPackage.SWIPER_STYLE__INDICATOR:
			return INDICATOR_EDEFAULT == null ? indicator != null : !INDICATOR_EDEFAULT.equals(indicator);
		case ArkUIModelPackage.SWIPER_STYLE__LOOP:
			return LOOP_EDEFAULT == null ? loop != null : !LOOP_EDEFAULT.equals(loop);
		case ArkUIModelPackage.SWIPER_STYLE__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case ArkUIModelPackage.SWIPER_STYLE__VERTICAL:
			return VERTICAL_EDEFAULT == null ? vertical != null : !VERTICAL_EDEFAULT.equals(vertical);
		case ArkUIModelPackage.SWIPER_STYLE__ITEM_SPACE:
			return ITEM_SPACE_EDEFAULT == null ? itemSpace != null : !ITEM_SPACE_EDEFAULT.equals(itemSpace);
		case ArkUIModelPackage.SWIPER_STYLE__DISPLAY_MODE:
			return DISPLAY_MODE_EDEFAULT == null ? displayMode != null : !DISPLAY_MODE_EDEFAULT.equals(displayMode);
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
		result.append(" (index: ");
		result.append(index);
		result.append(", autoPlay: ");
		result.append(autoPlay);
		result.append(", interval: ");
		result.append(interval);
		result.append(", indicator: ");
		result.append(indicator);
		result.append(", loop: ");
		result.append(loop);
		result.append(", duration: ");
		result.append(duration);
		result.append(", vertical: ");
		result.append(vertical);
		result.append(", itemSpace: ");
		result.append(itemSpace);
		result.append(", displayMode: ");
		result.append(displayMode);
		result.append(')');
		return result.toString();
	}

} //SwiperStyleImpl
