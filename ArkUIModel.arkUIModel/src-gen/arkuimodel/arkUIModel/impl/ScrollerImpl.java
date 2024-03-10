/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.Scroller;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scroller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getAssginScroll <em>Assgin Scroll</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getScrollType <em>Scroll Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getYOffset <em>YOffset</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getNext <em>Next</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ScrollerImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrollerImpl extends UIOperationImpl implements Scroller {
	/**
	 * The default value of the '{@link #getAssginScroll() <em>Assgin Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssginScroll()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSGIN_SCROLL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssginScroll() <em>Assgin Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssginScroll()
	 * @generated
	 * @ordered
	 */
	protected String assginScroll = ASSGIN_SCROLL_EDEFAULT;

	/**
	 * The default value of the '{@link #getScrollType() <em>Scroll Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollType()
	 * @generated
	 * @ordered
	 */
	protected static final String SCROLL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScrollType() <em>Scroll Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollType()
	 * @generated
	 * @ordered
	 */
	protected String scrollType = SCROLL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXOffset() <em>XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String XOFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXOffset() <em>XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXOffset()
	 * @generated
	 * @ordered
	 */
	protected String xOffset = XOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYOffset() <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String YOFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYOffset() <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected String yOffset = YOFFSET_EDEFAULT;

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
	 * The default value of the '{@link #getEdge() <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected static final String EDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected String edge = EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected String next = NEXT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SCROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssginScroll() {
		return assginScroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssginScroll(String newAssginScroll) {
		String oldAssginScroll = assginScroll;
		assginScroll = newAssginScroll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__ASSGIN_SCROLL,
					oldAssginScroll, assginScroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScrollType() {
		return scrollType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollType(String newScrollType) {
		String oldScrollType = scrollType;
		scrollType = newScrollType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__SCROLL_TYPE,
					oldScrollType, scrollType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXOffset() {
		return xOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXOffset(String newXOffset) {
		String oldXOffset = xOffset;
		xOffset = newXOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__XOFFSET, oldXOffset,
					xOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYOffset() {
		return yOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYOffset(String newYOffset) {
		String oldYOffset = yOffset;
		yOffset = newYOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__YOFFSET, oldYOffset,
					yOffset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__DURATION, oldDuration,
					duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__CURVE, oldCurve, curve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdge() {
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge(String newEdge) {
		String oldEdge = edge;
		edge = newEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__EDGE, oldEdge, edge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(String newNext) {
		String oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__NEXT, oldNext, next));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__DIRECTION, oldDirection,
					direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SCROLLER__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.SCROLLER__ASSGIN_SCROLL:
			return getAssginScroll();
		case ArkUIModelPackage.SCROLLER__SCROLL_TYPE:
			return getScrollType();
		case ArkUIModelPackage.SCROLLER__XOFFSET:
			return getXOffset();
		case ArkUIModelPackage.SCROLLER__YOFFSET:
			return getYOffset();
		case ArkUIModelPackage.SCROLLER__DURATION:
			return getDuration();
		case ArkUIModelPackage.SCROLLER__CURVE:
			return getCurve();
		case ArkUIModelPackage.SCROLLER__EDGE:
			return getEdge();
		case ArkUIModelPackage.SCROLLER__NEXT:
			return getNext();
		case ArkUIModelPackage.SCROLLER__DIRECTION:
			return getDirection();
		case ArkUIModelPackage.SCROLLER__INDEX:
			return getIndex();
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
		case ArkUIModelPackage.SCROLLER__ASSGIN_SCROLL:
			setAssginScroll((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__SCROLL_TYPE:
			setScrollType((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__XOFFSET:
			setXOffset((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__YOFFSET:
			setYOffset((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__DURATION:
			setDuration((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__CURVE:
			setCurve((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__EDGE:
			setEdge((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__NEXT:
			setNext((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__DIRECTION:
			setDirection((String) newValue);
			return;
		case ArkUIModelPackage.SCROLLER__INDEX:
			setIndex((String) newValue);
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
		case ArkUIModelPackage.SCROLLER__ASSGIN_SCROLL:
			setAssginScroll(ASSGIN_SCROLL_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__SCROLL_TYPE:
			setScrollType(SCROLL_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__XOFFSET:
			setXOffset(XOFFSET_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__YOFFSET:
			setYOffset(YOFFSET_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__CURVE:
			setCurve(CURVE_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__EDGE:
			setEdge(EDGE_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__NEXT:
			setNext(NEXT_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case ArkUIModelPackage.SCROLLER__INDEX:
			setIndex(INDEX_EDEFAULT);
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
		case ArkUIModelPackage.SCROLLER__ASSGIN_SCROLL:
			return ASSGIN_SCROLL_EDEFAULT == null ? assginScroll != null : !ASSGIN_SCROLL_EDEFAULT.equals(assginScroll);
		case ArkUIModelPackage.SCROLLER__SCROLL_TYPE:
			return SCROLL_TYPE_EDEFAULT == null ? scrollType != null : !SCROLL_TYPE_EDEFAULT.equals(scrollType);
		case ArkUIModelPackage.SCROLLER__XOFFSET:
			return XOFFSET_EDEFAULT == null ? xOffset != null : !XOFFSET_EDEFAULT.equals(xOffset);
		case ArkUIModelPackage.SCROLLER__YOFFSET:
			return YOFFSET_EDEFAULT == null ? yOffset != null : !YOFFSET_EDEFAULT.equals(yOffset);
		case ArkUIModelPackage.SCROLLER__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case ArkUIModelPackage.SCROLLER__CURVE:
			return CURVE_EDEFAULT == null ? curve != null : !CURVE_EDEFAULT.equals(curve);
		case ArkUIModelPackage.SCROLLER__EDGE:
			return EDGE_EDEFAULT == null ? edge != null : !EDGE_EDEFAULT.equals(edge);
		case ArkUIModelPackage.SCROLLER__NEXT:
			return NEXT_EDEFAULT == null ? next != null : !NEXT_EDEFAULT.equals(next);
		case ArkUIModelPackage.SCROLLER__DIRECTION:
			return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
		case ArkUIModelPackage.SCROLLER__INDEX:
			return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
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
		result.append(" (assginScroll: ");
		result.append(assginScroll);
		result.append(", scrollType: ");
		result.append(scrollType);
		result.append(", xOffset: ");
		result.append(xOffset);
		result.append(", yOffset: ");
		result.append(yOffset);
		result.append(", duration: ");
		result.append(duration);
		result.append(", curve: ");
		result.append(curve);
		result.append(", edge: ");
		result.append(edge);
		result.append(", next: ");
		result.append(next);
		result.append(", direction: ");
		result.append(direction);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //ScrollerImpl
