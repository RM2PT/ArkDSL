/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ImageStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getMatchTextDirection <em>Match Text Direction</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getFitOriginalSize <em>Fit Original Size</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getObjectFit <em>Object Fit</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getObjectRepeat <em>Object Repeat</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getAutoResize <em>Auto Resize</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getRenderMode <em>Render Mode</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getSourceSizeHeight <em>Source Size Height</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getSyncLoad <em>Sync Load</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageStyleImpl#getSourceSizeWidth <em>Source Size Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageStyleImpl extends StyleClassImpl implements ImageStyle {
	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected String alt = ALT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchTextDirection() <em>Match Text Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchTextDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_TEXT_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchTextDirection() <em>Match Text Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchTextDirection()
	 * @generated
	 * @ordered
	 */
	protected String matchTextDirection = MATCH_TEXT_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFitOriginalSize() <em>Fit Original Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitOriginalSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FIT_ORIGINAL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFitOriginalSize() <em>Fit Original Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitOriginalSize()
	 * @generated
	 * @ordered
	 */
	protected String fitOriginalSize = FIT_ORIGINAL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected String fillColor = FILL_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectFit() <em>Object Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectFit()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_FIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectFit() <em>Object Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectFit()
	 * @generated
	 * @ordered
	 */
	protected String objectFit = OBJECT_FIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectRepeat() <em>Object Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_REPEAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectRepeat() <em>Object Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRepeat()
	 * @generated
	 * @ordered
	 */
	protected String objectRepeat = OBJECT_REPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoResize() <em>Auto Resize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoResize()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_RESIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoResize() <em>Auto Resize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoResize()
	 * @generated
	 * @ordered
	 */
	protected String autoResize = AUTO_RESIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenderMode() <em>Render Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderMode()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDER_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenderMode() <em>Render Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderMode()
	 * @generated
	 * @ordered
	 */
	protected String renderMode = RENDER_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPOLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected String interpolation = INTERPOLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceSizeHeight() <em>Source Size Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSizeHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_SIZE_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceSizeHeight() <em>Source Size Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSizeHeight()
	 * @generated
	 * @ordered
	 */
	protected String sourceSizeHeight = SOURCE_SIZE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncLoad() <em>Sync Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncLoad()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNC_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyncLoad() <em>Sync Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncLoad()
	 * @generated
	 * @ordered
	 */
	protected String syncLoad = SYNC_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceSizeWidth() <em>Source Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSizeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_SIZE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceSizeWidth() <em>Source Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSizeWidth()
	 * @generated
	 * @ordered
	 */
	protected String sourceSizeWidth = SOURCE_SIZE_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.IMAGE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(String newAlt) {
		String oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__ALT, oldAlt, alt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchTextDirection() {
		return matchTextDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchTextDirection(String newMatchTextDirection) {
		String oldMatchTextDirection = matchTextDirection;
		matchTextDirection = newMatchTextDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__MATCH_TEXT_DIRECTION,
					oldMatchTextDirection, matchTextDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFitOriginalSize() {
		return fitOriginalSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitOriginalSize(String newFitOriginalSize) {
		String oldFitOriginalSize = fitOriginalSize;
		fitOriginalSize = newFitOriginalSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__FIT_ORIGINAL_SIZE,
					oldFitOriginalSize, fitOriginalSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(String newFillColor) {
		String oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__FILL_COLOR,
					oldFillColor, fillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectFit() {
		return objectFit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectFit(String newObjectFit) {
		String oldObjectFit = objectFit;
		objectFit = newObjectFit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__OBJECT_FIT,
					oldObjectFit, objectFit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectRepeat() {
		return objectRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRepeat(String newObjectRepeat) {
		String oldObjectRepeat = objectRepeat;
		objectRepeat = newObjectRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__OBJECT_REPEAT,
					oldObjectRepeat, objectRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoResize() {
		return autoResize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoResize(String newAutoResize) {
		String oldAutoResize = autoResize;
		autoResize = newAutoResize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__AUTO_RESIZE,
					oldAutoResize, autoResize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRenderMode() {
		return renderMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderMode(String newRenderMode) {
		String oldRenderMode = renderMode;
		renderMode = newRenderMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__RENDER_MODE,
					oldRenderMode, renderMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolation(String newInterpolation) {
		String oldInterpolation = interpolation;
		interpolation = newInterpolation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__INTERPOLATION,
					oldInterpolation, interpolation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceSizeHeight() {
		return sourceSizeHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSizeHeight(String newSourceSizeHeight) {
		String oldSourceSizeHeight = sourceSizeHeight;
		sourceSizeHeight = newSourceSizeHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_HEIGHT,
					oldSourceSizeHeight, sourceSizeHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyncLoad() {
		return syncLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncLoad(String newSyncLoad) {
		String oldSyncLoad = syncLoad;
		syncLoad = newSyncLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__SYNC_LOAD, oldSyncLoad,
					syncLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceSizeWidth() {
		return sourceSizeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSizeWidth(String newSourceSizeWidth) {
		String oldSourceSizeWidth = sourceSizeWidth;
		sourceSizeWidth = newSourceSizeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_WIDTH,
					oldSourceSizeWidth, sourceSizeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.IMAGE_STYLE__ALT:
			return getAlt();
		case ArkUIModelPackage.IMAGE_STYLE__MATCH_TEXT_DIRECTION:
			return getMatchTextDirection();
		case ArkUIModelPackage.IMAGE_STYLE__FIT_ORIGINAL_SIZE:
			return getFitOriginalSize();
		case ArkUIModelPackage.IMAGE_STYLE__FILL_COLOR:
			return getFillColor();
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_FIT:
			return getObjectFit();
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_REPEAT:
			return getObjectRepeat();
		case ArkUIModelPackage.IMAGE_STYLE__AUTO_RESIZE:
			return getAutoResize();
		case ArkUIModelPackage.IMAGE_STYLE__RENDER_MODE:
			return getRenderMode();
		case ArkUIModelPackage.IMAGE_STYLE__INTERPOLATION:
			return getInterpolation();
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_HEIGHT:
			return getSourceSizeHeight();
		case ArkUIModelPackage.IMAGE_STYLE__SYNC_LOAD:
			return getSyncLoad();
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_WIDTH:
			return getSourceSizeWidth();
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
		case ArkUIModelPackage.IMAGE_STYLE__ALT:
			setAlt((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__MATCH_TEXT_DIRECTION:
			setMatchTextDirection((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__FIT_ORIGINAL_SIZE:
			setFitOriginalSize((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__FILL_COLOR:
			setFillColor((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_FIT:
			setObjectFit((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_REPEAT:
			setObjectRepeat((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__AUTO_RESIZE:
			setAutoResize((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__RENDER_MODE:
			setRenderMode((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__INTERPOLATION:
			setInterpolation((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_HEIGHT:
			setSourceSizeHeight((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__SYNC_LOAD:
			setSyncLoad((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_WIDTH:
			setSourceSizeWidth((String) newValue);
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
		case ArkUIModelPackage.IMAGE_STYLE__ALT:
			setAlt(ALT_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__MATCH_TEXT_DIRECTION:
			setMatchTextDirection(MATCH_TEXT_DIRECTION_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__FIT_ORIGINAL_SIZE:
			setFitOriginalSize(FIT_ORIGINAL_SIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__FILL_COLOR:
			setFillColor(FILL_COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_FIT:
			setObjectFit(OBJECT_FIT_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_REPEAT:
			setObjectRepeat(OBJECT_REPEAT_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__AUTO_RESIZE:
			setAutoResize(AUTO_RESIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__RENDER_MODE:
			setRenderMode(RENDER_MODE_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__INTERPOLATION:
			setInterpolation(INTERPOLATION_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_HEIGHT:
			setSourceSizeHeight(SOURCE_SIZE_HEIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__SYNC_LOAD:
			setSyncLoad(SYNC_LOAD_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_WIDTH:
			setSourceSizeWidth(SOURCE_SIZE_WIDTH_EDEFAULT);
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
		case ArkUIModelPackage.IMAGE_STYLE__ALT:
			return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
		case ArkUIModelPackage.IMAGE_STYLE__MATCH_TEXT_DIRECTION:
			return MATCH_TEXT_DIRECTION_EDEFAULT == null ? matchTextDirection != null
					: !MATCH_TEXT_DIRECTION_EDEFAULT.equals(matchTextDirection);
		case ArkUIModelPackage.IMAGE_STYLE__FIT_ORIGINAL_SIZE:
			return FIT_ORIGINAL_SIZE_EDEFAULT == null ? fitOriginalSize != null
					: !FIT_ORIGINAL_SIZE_EDEFAULT.equals(fitOriginalSize);
		case ArkUIModelPackage.IMAGE_STYLE__FILL_COLOR:
			return FILL_COLOR_EDEFAULT == null ? fillColor != null : !FILL_COLOR_EDEFAULT.equals(fillColor);
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_FIT:
			return OBJECT_FIT_EDEFAULT == null ? objectFit != null : !OBJECT_FIT_EDEFAULT.equals(objectFit);
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_REPEAT:
			return OBJECT_REPEAT_EDEFAULT == null ? objectRepeat != null : !OBJECT_REPEAT_EDEFAULT.equals(objectRepeat);
		case ArkUIModelPackage.IMAGE_STYLE__AUTO_RESIZE:
			return AUTO_RESIZE_EDEFAULT == null ? autoResize != null : !AUTO_RESIZE_EDEFAULT.equals(autoResize);
		case ArkUIModelPackage.IMAGE_STYLE__RENDER_MODE:
			return RENDER_MODE_EDEFAULT == null ? renderMode != null : !RENDER_MODE_EDEFAULT.equals(renderMode);
		case ArkUIModelPackage.IMAGE_STYLE__INTERPOLATION:
			return INTERPOLATION_EDEFAULT == null ? interpolation != null
					: !INTERPOLATION_EDEFAULT.equals(interpolation);
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_HEIGHT:
			return SOURCE_SIZE_HEIGHT_EDEFAULT == null ? sourceSizeHeight != null
					: !SOURCE_SIZE_HEIGHT_EDEFAULT.equals(sourceSizeHeight);
		case ArkUIModelPackage.IMAGE_STYLE__SYNC_LOAD:
			return SYNC_LOAD_EDEFAULT == null ? syncLoad != null : !SYNC_LOAD_EDEFAULT.equals(syncLoad);
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_WIDTH:
			return SOURCE_SIZE_WIDTH_EDEFAULT == null ? sourceSizeWidth != null
					: !SOURCE_SIZE_WIDTH_EDEFAULT.equals(sourceSizeWidth);
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
		result.append(" (alt: ");
		result.append(alt);
		result.append(", matchTextDirection: ");
		result.append(matchTextDirection);
		result.append(", fitOriginalSize: ");
		result.append(fitOriginalSize);
		result.append(", fillColor: ");
		result.append(fillColor);
		result.append(", objectFit: ");
		result.append(objectFit);
		result.append(", objectRepeat: ");
		result.append(objectRepeat);
		result.append(", autoResize: ");
		result.append(autoResize);
		result.append(", renderMode: ");
		result.append(renderMode);
		result.append(", interpolation: ");
		result.append(interpolation);
		result.append(", sourceSizeHeight: ");
		result.append(sourceSizeHeight);
		result.append(", syncLoad: ");
		result.append(syncLoad);
		result.append(", sourceSizeWidth: ");
		result.append(sourceSizeWidth);
		result.append(')');
		return result.toString();
	}

} //ImageStyleImpl
