/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.AnimationClass;
import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.StyleClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getAspectRatio <em>Aspect Ratio</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getPaddingleft <em>Paddingleft</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getMarginleft <em>Marginleft</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getLayoutWeight <em>Layout Weight</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getBackgroundImage <em>Background Image</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getAnimationclass <em>Animationclass</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getPaddingright <em>Paddingright</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getPaddingtop <em>Paddingtop</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getPaddingbottom <em>Paddingbottom</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getMarginright <em>Marginright</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getMargintop <em>Margintop</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getMarginbottom <em>Marginbottom</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getBorderRadius <em>Border Radius</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getBackgroundImageSize <em>Background Image Size</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StyleClassImpl#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleClassImpl extends MinimalEObjectImpl.Container implements StyleClass {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAspectRatio() <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspectRatio() <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected String aspectRatio = ASPECT_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingleft() <em>Paddingleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingleft()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDINGLEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingleft() <em>Paddingleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingleft()
	 * @generated
	 * @ordered
	 */
	protected String paddingleft = PADDINGLEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginleft() <em>Marginleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginleft()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGINLEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginleft() <em>Marginleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginleft()
	 * @generated
	 * @ordered
	 */
	protected String marginleft = MARGINLEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutWeight() <em>Layout Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayoutWeight() <em>Layout Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutWeight()
	 * @generated
	 * @ordered
	 */
	protected String layoutWeight = LAYOUT_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected String align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundImage() <em>Background Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundImage()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundImage() <em>Background Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundImage()
	 * @generated
	 * @ordered
	 */
	protected String backgroundImage = BACKGROUND_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected String border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

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
	 * The cached value of the '{@link #getAnimationclass() <em>Animationclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationclass()
	 * @generated
	 * @ordered
	 */
	protected AnimationClass animationclass;

	/**
	 * The default value of the '{@link #getAssign() <em>Assign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected String assign = ASSIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingright() <em>Paddingright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingright()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDINGRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingright() <em>Paddingright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingright()
	 * @generated
	 * @ordered
	 */
	protected String paddingright = PADDINGRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingtop() <em>Paddingtop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingtop()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDINGTOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingtop() <em>Paddingtop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingtop()
	 * @generated
	 * @ordered
	 */
	protected String paddingtop = PADDINGTOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingbottom() <em>Paddingbottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingbottom()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDINGBOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingbottom() <em>Paddingbottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingbottom()
	 * @generated
	 * @ordered
	 */
	protected String paddingbottom = PADDINGBOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginright() <em>Marginright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginright()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGINRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginright() <em>Marginright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginright()
	 * @generated
	 * @ordered
	 */
	protected String marginright = MARGINRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMargintop() <em>Margintop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargintop()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGINTOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMargintop() <em>Margintop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargintop()
	 * @generated
	 * @ordered
	 */
	protected String margintop = MARGINTOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginbottom() <em>Marginbottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginbottom()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGINBOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginbottom() <em>Marginbottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginbottom()
	 * @generated
	 * @ordered
	 */
	protected String marginbottom = MARGINBOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderRadius() <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderRadius() <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRadius()
	 * @generated
	 * @ordered
	 */
	protected String borderRadius = BORDER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundImageSize() <em>Background Image Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundImageSize()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_IMAGE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundImageSize() <em>Background Image Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundImageSize()
	 * @generated
	 * @ordered
	 */
	protected String backgroundImageSize = BACKGROUND_IMAGE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotate() <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotate()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotate() <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotate()
	 * @generated
	 * @ordered
	 */
	protected String rotate = ROTATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String ZINDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected String zIndex = ZINDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.STYLE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspectRatio() {
		return aspectRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectRatio(String newAspectRatio) {
		String oldAspectRatio = aspectRatio;
		aspectRatio = newAspectRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__ASPECT_RATIO,
					oldAspectRatio, aspectRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingleft() {
		return paddingleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingleft(String newPaddingleft) {
		String oldPaddingleft = paddingleft;
		paddingleft = newPaddingleft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__PADDINGLEFT,
					oldPaddingleft, paddingleft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginleft() {
		return marginleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginleft(String newMarginleft) {
		String oldMarginleft = marginleft;
		marginleft = newMarginleft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__MARGINLEFT,
					oldMarginleft, marginleft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutWeight() {
		return layoutWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutWeight(String newLayoutWeight) {
		String oldLayoutWeight = layoutWeight;
		layoutWeight = newLayoutWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__LAYOUT_WEIGHT,
					oldLayoutWeight, layoutWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(String newAlign) {
		String oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__ALIGN, oldAlign,
					align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__DIRECTION,
					oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__OFFSET, oldOffset,
					offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__BACKGROUND_COLOR,
					oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundImage() {
		return backgroundImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundImage(String newBackgroundImage) {
		String oldBackgroundImage = backgroundImage;
		backgroundImage = newBackgroundImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE,
					oldBackgroundImage, backgroundImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(String newBorder) {
		String oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__BORDER, oldBorder,
					border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__VISIBILITY,
					oldVisibility, visibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationClass getAnimationclass() {
		if (animationclass != null && animationclass.eIsProxy()) {
			InternalEObject oldAnimationclass = (InternalEObject) animationclass;
			animationclass = (AnimationClass) eResolveProxy(oldAnimationclass);
			if (animationclass != oldAnimationclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArkUIModelPackage.STYLE_CLASS__ANIMATIONCLASS, oldAnimationclass, animationclass));
			}
		}
		return animationclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationClass basicGetAnimationclass() {
		return animationclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimationclass(AnimationClass newAnimationclass) {
		AnimationClass oldAnimationclass = animationclass;
		animationclass = newAnimationclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__ANIMATIONCLASS,
					oldAnimationclass, animationclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssign() {
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssign(String newAssign) {
		String oldAssign = assign;
		assign = newAssign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__ASSIGN, oldAssign,
					assign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingright() {
		return paddingright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingright(String newPaddingright) {
		String oldPaddingright = paddingright;
		paddingright = newPaddingright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__PADDINGRIGHT,
					oldPaddingright, paddingright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingtop() {
		return paddingtop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingtop(String newPaddingtop) {
		String oldPaddingtop = paddingtop;
		paddingtop = newPaddingtop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__PADDINGTOP,
					oldPaddingtop, paddingtop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingbottom() {
		return paddingbottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingbottom(String newPaddingbottom) {
		String oldPaddingbottom = paddingbottom;
		paddingbottom = newPaddingbottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__PADDINGBOTTOM,
					oldPaddingbottom, paddingbottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginright() {
		return marginright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginright(String newMarginright) {
		String oldMarginright = marginright;
		marginright = newMarginright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__MARGINRIGHT,
					oldMarginright, marginright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMargintop() {
		return margintop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargintop(String newMargintop) {
		String oldMargintop = margintop;
		margintop = newMargintop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__MARGINTOP,
					oldMargintop, margintop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginbottom() {
		return marginbottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginbottom(String newMarginbottom) {
		String oldMarginbottom = marginbottom;
		marginbottom = newMarginbottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__MARGINBOTTOM,
					oldMarginbottom, marginbottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderRadius() {
		return borderRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderRadius(String newBorderRadius) {
		String oldBorderRadius = borderRadius;
		borderRadius = newBorderRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__BORDER_RADIUS,
					oldBorderRadius, borderRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundImageSize() {
		return backgroundImageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundImageSize(String newBackgroundImageSize) {
		String oldBackgroundImageSize = backgroundImageSize;
		backgroundImageSize = newBackgroundImageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE_SIZE,
					oldBackgroundImageSize, backgroundImageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotate() {
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotate(String newRotate) {
		String oldRotate = rotate;
		rotate = newRotate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__ROTATE, oldRotate,
					rotate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZIndex() {
		return zIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZIndex(String newZIndex) {
		String oldZIndex = zIndex;
		zIndex = newZIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STYLE_CLASS__ZINDEX, oldZIndex,
					zIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.STYLE_CLASS__WIDTH:
			return getWidth();
		case ArkUIModelPackage.STYLE_CLASS__HEIGHT:
			return getHeight();
		case ArkUIModelPackage.STYLE_CLASS__ASPECT_RATIO:
			return getAspectRatio();
		case ArkUIModelPackage.STYLE_CLASS__PADDINGLEFT:
			return getPaddingleft();
		case ArkUIModelPackage.STYLE_CLASS__MARGINLEFT:
			return getMarginleft();
		case ArkUIModelPackage.STYLE_CLASS__LAYOUT_WEIGHT:
			return getLayoutWeight();
		case ArkUIModelPackage.STYLE_CLASS__ALIGN:
			return getAlign();
		case ArkUIModelPackage.STYLE_CLASS__DIRECTION:
			return getDirection();
		case ArkUIModelPackage.STYLE_CLASS__POSITION:
			return getPosition();
		case ArkUIModelPackage.STYLE_CLASS__OFFSET:
			return getOffset();
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_COLOR:
			return getBackgroundColor();
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE:
			return getBackgroundImage();
		case ArkUIModelPackage.STYLE_CLASS__BORDER:
			return getBorder();
		case ArkUIModelPackage.STYLE_CLASS__VISIBILITY:
			return getVisibility();
		case ArkUIModelPackage.STYLE_CLASS__NAME:
			return getName();
		case ArkUIModelPackage.STYLE_CLASS__ANIMATIONCLASS:
			if (resolve)
				return getAnimationclass();
			return basicGetAnimationclass();
		case ArkUIModelPackage.STYLE_CLASS__ASSIGN:
			return getAssign();
		case ArkUIModelPackage.STYLE_CLASS__PADDINGRIGHT:
			return getPaddingright();
		case ArkUIModelPackage.STYLE_CLASS__PADDINGTOP:
			return getPaddingtop();
		case ArkUIModelPackage.STYLE_CLASS__PADDINGBOTTOM:
			return getPaddingbottom();
		case ArkUIModelPackage.STYLE_CLASS__MARGINRIGHT:
			return getMarginright();
		case ArkUIModelPackage.STYLE_CLASS__MARGINTOP:
			return getMargintop();
		case ArkUIModelPackage.STYLE_CLASS__MARGINBOTTOM:
			return getMarginbottom();
		case ArkUIModelPackage.STYLE_CLASS__BORDER_RADIUS:
			return getBorderRadius();
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE_SIZE:
			return getBackgroundImageSize();
		case ArkUIModelPackage.STYLE_CLASS__ROTATE:
			return getRotate();
		case ArkUIModelPackage.STYLE_CLASS__ZINDEX:
			return getZIndex();
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
		case ArkUIModelPackage.STYLE_CLASS__WIDTH:
			setWidth((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__HEIGHT:
			setHeight((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ASPECT_RATIO:
			setAspectRatio((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__PADDINGLEFT:
			setPaddingleft((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__MARGINLEFT:
			setMarginleft((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__LAYOUT_WEIGHT:
			setLayoutWeight((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ALIGN:
			setAlign((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__DIRECTION:
			setDirection((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__POSITION:
			setPosition((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__OFFSET:
			setOffset((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_COLOR:
			setBackgroundColor((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE:
			setBackgroundImage((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BORDER:
			setBorder((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__VISIBILITY:
			setVisibility((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__NAME:
			setName((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ANIMATIONCLASS:
			setAnimationclass((AnimationClass) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ASSIGN:
			setAssign((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__PADDINGRIGHT:
			setPaddingright((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__PADDINGTOP:
			setPaddingtop((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__PADDINGBOTTOM:
			setPaddingbottom((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__MARGINRIGHT:
			setMarginright((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__MARGINTOP:
			setMargintop((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__MARGINBOTTOM:
			setMarginbottom((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BORDER_RADIUS:
			setBorderRadius((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE_SIZE:
			setBackgroundImageSize((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ROTATE:
			setRotate((String) newValue);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ZINDEX:
			setZIndex((String) newValue);
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
		case ArkUIModelPackage.STYLE_CLASS__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ASPECT_RATIO:
			setAspectRatio(ASPECT_RATIO_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__PADDINGLEFT:
			setPaddingleft(PADDINGLEFT_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__MARGINLEFT:
			setMarginleft(MARGINLEFT_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__LAYOUT_WEIGHT:
			setLayoutWeight(LAYOUT_WEIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ALIGN:
			setAlign(ALIGN_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__OFFSET:
			setOffset(OFFSET_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_COLOR:
			setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE:
			setBackgroundImage(BACKGROUND_IMAGE_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BORDER:
			setBorder(BORDER_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ANIMATIONCLASS:
			setAnimationclass((AnimationClass) null);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ASSIGN:
			setAssign(ASSIGN_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__PADDINGRIGHT:
			setPaddingright(PADDINGRIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__PADDINGTOP:
			setPaddingtop(PADDINGTOP_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__PADDINGBOTTOM:
			setPaddingbottom(PADDINGBOTTOM_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__MARGINRIGHT:
			setMarginright(MARGINRIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__MARGINTOP:
			setMargintop(MARGINTOP_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__MARGINBOTTOM:
			setMarginbottom(MARGINBOTTOM_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BORDER_RADIUS:
			setBorderRadius(BORDER_RADIUS_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE_SIZE:
			setBackgroundImageSize(BACKGROUND_IMAGE_SIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ROTATE:
			setRotate(ROTATE_EDEFAULT);
			return;
		case ArkUIModelPackage.STYLE_CLASS__ZINDEX:
			setZIndex(ZINDEX_EDEFAULT);
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
		case ArkUIModelPackage.STYLE_CLASS__WIDTH:
			return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
		case ArkUIModelPackage.STYLE_CLASS__HEIGHT:
			return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
		case ArkUIModelPackage.STYLE_CLASS__ASPECT_RATIO:
			return ASPECT_RATIO_EDEFAULT == null ? aspectRatio != null : !ASPECT_RATIO_EDEFAULT.equals(aspectRatio);
		case ArkUIModelPackage.STYLE_CLASS__PADDINGLEFT:
			return PADDINGLEFT_EDEFAULT == null ? paddingleft != null : !PADDINGLEFT_EDEFAULT.equals(paddingleft);
		case ArkUIModelPackage.STYLE_CLASS__MARGINLEFT:
			return MARGINLEFT_EDEFAULT == null ? marginleft != null : !MARGINLEFT_EDEFAULT.equals(marginleft);
		case ArkUIModelPackage.STYLE_CLASS__LAYOUT_WEIGHT:
			return LAYOUT_WEIGHT_EDEFAULT == null ? layoutWeight != null : !LAYOUT_WEIGHT_EDEFAULT.equals(layoutWeight);
		case ArkUIModelPackage.STYLE_CLASS__ALIGN:
			return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
		case ArkUIModelPackage.STYLE_CLASS__DIRECTION:
			return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
		case ArkUIModelPackage.STYLE_CLASS__POSITION:
			return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
		case ArkUIModelPackage.STYLE_CLASS__OFFSET:
			return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_COLOR:
			return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null
					: !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE:
			return BACKGROUND_IMAGE_EDEFAULT == null ? backgroundImage != null
					: !BACKGROUND_IMAGE_EDEFAULT.equals(backgroundImage);
		case ArkUIModelPackage.STYLE_CLASS__BORDER:
			return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
		case ArkUIModelPackage.STYLE_CLASS__VISIBILITY:
			return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
		case ArkUIModelPackage.STYLE_CLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArkUIModelPackage.STYLE_CLASS__ANIMATIONCLASS:
			return animationclass != null;
		case ArkUIModelPackage.STYLE_CLASS__ASSIGN:
			return ASSIGN_EDEFAULT == null ? assign != null : !ASSIGN_EDEFAULT.equals(assign);
		case ArkUIModelPackage.STYLE_CLASS__PADDINGRIGHT:
			return PADDINGRIGHT_EDEFAULT == null ? paddingright != null : !PADDINGRIGHT_EDEFAULT.equals(paddingright);
		case ArkUIModelPackage.STYLE_CLASS__PADDINGTOP:
			return PADDINGTOP_EDEFAULT == null ? paddingtop != null : !PADDINGTOP_EDEFAULT.equals(paddingtop);
		case ArkUIModelPackage.STYLE_CLASS__PADDINGBOTTOM:
			return PADDINGBOTTOM_EDEFAULT == null ? paddingbottom != null
					: !PADDINGBOTTOM_EDEFAULT.equals(paddingbottom);
		case ArkUIModelPackage.STYLE_CLASS__MARGINRIGHT:
			return MARGINRIGHT_EDEFAULT == null ? marginright != null : !MARGINRIGHT_EDEFAULT.equals(marginright);
		case ArkUIModelPackage.STYLE_CLASS__MARGINTOP:
			return MARGINTOP_EDEFAULT == null ? margintop != null : !MARGINTOP_EDEFAULT.equals(margintop);
		case ArkUIModelPackage.STYLE_CLASS__MARGINBOTTOM:
			return MARGINBOTTOM_EDEFAULT == null ? marginbottom != null : !MARGINBOTTOM_EDEFAULT.equals(marginbottom);
		case ArkUIModelPackage.STYLE_CLASS__BORDER_RADIUS:
			return BORDER_RADIUS_EDEFAULT == null ? borderRadius != null : !BORDER_RADIUS_EDEFAULT.equals(borderRadius);
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE_SIZE:
			return BACKGROUND_IMAGE_SIZE_EDEFAULT == null ? backgroundImageSize != null
					: !BACKGROUND_IMAGE_SIZE_EDEFAULT.equals(backgroundImageSize);
		case ArkUIModelPackage.STYLE_CLASS__ROTATE:
			return ROTATE_EDEFAULT == null ? rotate != null : !ROTATE_EDEFAULT.equals(rotate);
		case ArkUIModelPackage.STYLE_CLASS__ZINDEX:
			return ZINDEX_EDEFAULT == null ? zIndex != null : !ZINDEX_EDEFAULT.equals(zIndex);
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", aspectRatio: ");
		result.append(aspectRatio);
		result.append(", paddingleft: ");
		result.append(paddingleft);
		result.append(", marginleft: ");
		result.append(marginleft);
		result.append(", layoutWeight: ");
		result.append(layoutWeight);
		result.append(", align: ");
		result.append(align);
		result.append(", direction: ");
		result.append(direction);
		result.append(", position: ");
		result.append(position);
		result.append(", offset: ");
		result.append(offset);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", backgroundImage: ");
		result.append(backgroundImage);
		result.append(", border: ");
		result.append(border);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", name: ");
		result.append(name);
		result.append(", assign: ");
		result.append(assign);
		result.append(", paddingright: ");
		result.append(paddingright);
		result.append(", paddingtop: ");
		result.append(paddingtop);
		result.append(", paddingbottom: ");
		result.append(paddingbottom);
		result.append(", marginright: ");
		result.append(marginright);
		result.append(", margintop: ");
		result.append(margintop);
		result.append(", marginbottom: ");
		result.append(marginbottom);
		result.append(", borderRadius: ");
		result.append(borderRadius);
		result.append(", backgroundImageSize: ");
		result.append(backgroundImageSize);
		result.append(", rotate: ");
		result.append(rotate);
		result.append(", zIndex: ");
		result.append(zIndex);
		result.append(')');
		return result.toString();
	}

} //StyleClassImpl
