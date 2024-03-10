/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ListItemStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Item Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListItemStyleImpl#getSticky <em>Sticky</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListItemStyleImpl#getEditable <em>Editable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListItemStyleImpl extends StyleClassImpl implements ListItemStyle {
	/**
	 * The default value of the '{@link #getSticky() <em>Sticky</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSticky()
	 * @generated
	 * @ordered
	 */
	protected static final String STICKY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSticky() <em>Sticky</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSticky()
	 * @generated
	 * @ordered
	 */
	protected String sticky = STICKY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected String editable = EDITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.LIST_ITEM_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSticky() {
		return sticky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSticky(String newSticky) {
		String oldSticky = sticky;
		sticky = newSticky;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_ITEM_STYLE__STICKY, oldSticky,
					sticky));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(String newEditable) {
		String oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_ITEM_STYLE__EDITABLE,
					oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.LIST_ITEM_STYLE__STICKY:
			return getSticky();
		case ArkUIModelPackage.LIST_ITEM_STYLE__EDITABLE:
			return getEditable();
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
		case ArkUIModelPackage.LIST_ITEM_STYLE__STICKY:
			setSticky((String) newValue);
			return;
		case ArkUIModelPackage.LIST_ITEM_STYLE__EDITABLE:
			setEditable((String) newValue);
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
		case ArkUIModelPackage.LIST_ITEM_STYLE__STICKY:
			setSticky(STICKY_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_ITEM_STYLE__EDITABLE:
			setEditable(EDITABLE_EDEFAULT);
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
		case ArkUIModelPackage.LIST_ITEM_STYLE__STICKY:
			return STICKY_EDEFAULT == null ? sticky != null : !STICKY_EDEFAULT.equals(sticky);
		case ArkUIModelPackage.LIST_ITEM_STYLE__EDITABLE:
			return EDITABLE_EDEFAULT == null ? editable != null : !EDITABLE_EDEFAULT.equals(editable);
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
		result.append(" (sticky: ");
		result.append(sticky);
		result.append(", editable: ");
		result.append(editable);
		result.append(')');
		return result.toString();
	}

} //ListItemStyleImpl
