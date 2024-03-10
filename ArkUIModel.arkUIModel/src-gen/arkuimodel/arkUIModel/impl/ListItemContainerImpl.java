/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ListItemContainer;
import arkuimodel.arkUIModel.ListItemEvent;
import arkuimodel.arkUIModel.ListItemStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Item Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListItemContainerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListItemContainerImpl#getListitemevent <em>Listitemevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListItemContainerImpl#getListitemstyle <em>Listitemstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListItemContainerImpl extends ContainerImpl implements ListItemContainer {
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
	 * The cached value of the '{@link #getListitemevent() <em>Listitemevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListitemevent()
	 * @generated
	 * @ordered
	 */
	protected ListItemEvent listitemevent;

	/**
	 * The cached value of the '{@link #getListitemstyle() <em>Listitemstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListitemstyle()
	 * @generated
	 * @ordered
	 */
	protected ListItemStyle listitemstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.LIST_ITEM_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_ITEM_CONTAINER__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemEvent getListitemevent() {
		return listitemevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListitemevent(ListItemEvent newListitemevent, NotificationChain msgs) {
		ListItemEvent oldListitemevent = listitemevent;
		listitemevent = newListitemevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT, oldListitemevent, newListitemevent);
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
	public void setListitemevent(ListItemEvent newListitemevent) {
		if (newListitemevent != listitemevent) {
			NotificationChain msgs = null;
			if (listitemevent != null)
				msgs = ((InternalEObject) listitemevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT, null, msgs);
			if (newListitemevent != null)
				msgs = ((InternalEObject) newListitemevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT, null, msgs);
			msgs = basicSetListitemevent(newListitemevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT,
					newListitemevent, newListitemevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemStyle getListitemstyle() {
		return listitemstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListitemstyle(ListItemStyle newListitemstyle, NotificationChain msgs) {
		ListItemStyle oldListitemstyle = listitemstyle;
		listitemstyle = newListitemstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE, oldListitemstyle, newListitemstyle);
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
	public void setListitemstyle(ListItemStyle newListitemstyle) {
		if (newListitemstyle != listitemstyle) {
			NotificationChain msgs = null;
			if (listitemstyle != null)
				msgs = ((InternalEObject) listitemstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE, null, msgs);
			if (newListitemstyle != null)
				msgs = ((InternalEObject) newListitemstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE, null, msgs);
			msgs = basicSetListitemstyle(newListitemstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE,
					newListitemstyle, newListitemstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT:
			return basicSetListitemevent(null, msgs);
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE:
			return basicSetListitemstyle(null, msgs);
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
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__VALUE:
			return getValue();
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT:
			return getListitemevent();
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE:
			return getListitemstyle();
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
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__VALUE:
			setValue((String) newValue);
			return;
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT:
			setListitemevent((ListItemEvent) newValue);
			return;
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE:
			setListitemstyle((ListItemStyle) newValue);
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
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT:
			setListitemevent((ListItemEvent) null);
			return;
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE:
			setListitemstyle((ListItemStyle) null);
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
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMEVENT:
			return listitemevent != null;
		case ArkUIModelPackage.LIST_ITEM_CONTAINER__LISTITEMSTYLE:
			return listitemstyle != null;
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
		result.append(')');
		return result.toString();
	}

} //ListItemContainerImpl
