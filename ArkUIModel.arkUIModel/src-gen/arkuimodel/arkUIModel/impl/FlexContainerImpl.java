/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.FlexContainer;
import arkuimodel.arkUIModel.FlexEvent;
import arkuimodel.arkUIModel.FlexStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flex Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.FlexContainerImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.FlexContainerImpl#getWrap <em>Wrap</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.FlexContainerImpl#getJustifyContent <em>Justify Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.FlexContainerImpl#getAlignItems <em>Align Items</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.FlexContainerImpl#getAlignContent <em>Align Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.FlexContainerImpl#getFlexevent <em>Flexevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.FlexContainerImpl#getFlexstyle <em>Flexstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlexContainerImpl extends ContainerImpl implements FlexContainer {
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
	 * The default value of the '{@link #getWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrap()
	 * @generated
	 * @ordered
	 */
	protected static final String WRAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrap()
	 * @generated
	 * @ordered
	 */
	protected String wrap = WRAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustifyContent() <em>Justify Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifyContent()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFY_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustifyContent() <em>Justify Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifyContent()
	 * @generated
	 * @ordered
	 */
	protected String justifyContent = JUSTIFY_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignItems() <em>Align Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignItems()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGN_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignItems() <em>Align Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignItems()
	 * @generated
	 * @ordered
	 */
	protected String alignItems = ALIGN_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignContent() <em>Align Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignContent()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGN_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignContent() <em>Align Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignContent()
	 * @generated
	 * @ordered
	 */
	protected String alignContent = ALIGN_CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlexevent() <em>Flexevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexevent()
	 * @generated
	 * @ordered
	 */
	protected FlexEvent flexevent;

	/**
	 * The cached value of the '{@link #getFlexstyle() <em>Flexstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexstyle()
	 * @generated
	 * @ordered
	 */
	protected FlexStyle flexstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlexContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.FLEX_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.FLEX_CONTAINER__DIRECTION,
					oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrap() {
		return wrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrap(String newWrap) {
		String oldWrap = wrap;
		wrap = newWrap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.FLEX_CONTAINER__WRAP, oldWrap,
					wrap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustifyContent() {
		return justifyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustifyContent(String newJustifyContent) {
		String oldJustifyContent = justifyContent;
		justifyContent = newJustifyContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.FLEX_CONTAINER__JUSTIFY_CONTENT,
					oldJustifyContent, justifyContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlignItems() {
		return alignItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignItems(String newAlignItems) {
		String oldAlignItems = alignItems;
		alignItems = newAlignItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.FLEX_CONTAINER__ALIGN_ITEMS,
					oldAlignItems, alignItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlignContent() {
		return alignContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignContent(String newAlignContent) {
		String oldAlignContent = alignContent;
		alignContent = newAlignContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.FLEX_CONTAINER__ALIGN_CONTENT,
					oldAlignContent, alignContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexEvent getFlexevent() {
		return flexevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlexevent(FlexEvent newFlexevent, NotificationChain msgs) {
		FlexEvent oldFlexevent = flexevent;
		flexevent = newFlexevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT, oldFlexevent, newFlexevent);
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
	public void setFlexevent(FlexEvent newFlexevent) {
		if (newFlexevent != flexevent) {
			NotificationChain msgs = null;
			if (flexevent != null)
				msgs = ((InternalEObject) flexevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT, null, msgs);
			if (newFlexevent != null)
				msgs = ((InternalEObject) newFlexevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT, null, msgs);
			msgs = basicSetFlexevent(newFlexevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT,
					newFlexevent, newFlexevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexStyle getFlexstyle() {
		return flexstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlexstyle(FlexStyle newFlexstyle, NotificationChain msgs) {
		FlexStyle oldFlexstyle = flexstyle;
		flexstyle = newFlexstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE, oldFlexstyle, newFlexstyle);
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
	public void setFlexstyle(FlexStyle newFlexstyle) {
		if (newFlexstyle != flexstyle) {
			NotificationChain msgs = null;
			if (flexstyle != null)
				msgs = ((InternalEObject) flexstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE, null, msgs);
			if (newFlexstyle != null)
				msgs = ((InternalEObject) newFlexstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE, null, msgs);
			msgs = basicSetFlexstyle(newFlexstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE,
					newFlexstyle, newFlexstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT:
			return basicSetFlexevent(null, msgs);
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE:
			return basicSetFlexstyle(null, msgs);
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
		case ArkUIModelPackage.FLEX_CONTAINER__DIRECTION:
			return getDirection();
		case ArkUIModelPackage.FLEX_CONTAINER__WRAP:
			return getWrap();
		case ArkUIModelPackage.FLEX_CONTAINER__JUSTIFY_CONTENT:
			return getJustifyContent();
		case ArkUIModelPackage.FLEX_CONTAINER__ALIGN_ITEMS:
			return getAlignItems();
		case ArkUIModelPackage.FLEX_CONTAINER__ALIGN_CONTENT:
			return getAlignContent();
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT:
			return getFlexevent();
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE:
			return getFlexstyle();
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
		case ArkUIModelPackage.FLEX_CONTAINER__DIRECTION:
			setDirection((String) newValue);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__WRAP:
			setWrap((String) newValue);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__JUSTIFY_CONTENT:
			setJustifyContent((String) newValue);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__ALIGN_ITEMS:
			setAlignItems((String) newValue);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__ALIGN_CONTENT:
			setAlignContent((String) newValue);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT:
			setFlexevent((FlexEvent) newValue);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE:
			setFlexstyle((FlexStyle) newValue);
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
		case ArkUIModelPackage.FLEX_CONTAINER__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__WRAP:
			setWrap(WRAP_EDEFAULT);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__JUSTIFY_CONTENT:
			setJustifyContent(JUSTIFY_CONTENT_EDEFAULT);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__ALIGN_ITEMS:
			setAlignItems(ALIGN_ITEMS_EDEFAULT);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__ALIGN_CONTENT:
			setAlignContent(ALIGN_CONTENT_EDEFAULT);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT:
			setFlexevent((FlexEvent) null);
			return;
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE:
			setFlexstyle((FlexStyle) null);
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
		case ArkUIModelPackage.FLEX_CONTAINER__DIRECTION:
			return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
		case ArkUIModelPackage.FLEX_CONTAINER__WRAP:
			return WRAP_EDEFAULT == null ? wrap != null : !WRAP_EDEFAULT.equals(wrap);
		case ArkUIModelPackage.FLEX_CONTAINER__JUSTIFY_CONTENT:
			return JUSTIFY_CONTENT_EDEFAULT == null ? justifyContent != null
					: !JUSTIFY_CONTENT_EDEFAULT.equals(justifyContent);
		case ArkUIModelPackage.FLEX_CONTAINER__ALIGN_ITEMS:
			return ALIGN_ITEMS_EDEFAULT == null ? alignItems != null : !ALIGN_ITEMS_EDEFAULT.equals(alignItems);
		case ArkUIModelPackage.FLEX_CONTAINER__ALIGN_CONTENT:
			return ALIGN_CONTENT_EDEFAULT == null ? alignContent != null : !ALIGN_CONTENT_EDEFAULT.equals(alignContent);
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXEVENT:
			return flexevent != null;
		case ArkUIModelPackage.FLEX_CONTAINER__FLEXSTYLE:
			return flexstyle != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(", wrap: ");
		result.append(wrap);
		result.append(", justifyContent: ");
		result.append(justifyContent);
		result.append(", alignItems: ");
		result.append(alignItems);
		result.append(", alignContent: ");
		result.append(alignContent);
		result.append(')');
		return result.toString();
	}

} //FlexContainerImpl
