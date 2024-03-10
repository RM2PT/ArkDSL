/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ContainerItems;
import arkuimodel.arkUIModel.RowContainer;
import arkuimodel.arkUIModel.RowEvent;
import arkuimodel.arkUIModel.RowStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.RowContainerImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.RowContainerImpl#getAlignItems <em>Align Items</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.RowContainerImpl#getJustifyContent <em>Justify Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.RowContainerImpl#getRowevent <em>Rowevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.RowContainerImpl#getRowstyle <em>Rowstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.RowContainerImpl#getBindMenu <em>Bind Menu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowContainerImpl extends ContainerImpl implements RowContainer {
	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected String space = SPACE_EDEFAULT;

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
	 * The cached value of the '{@link #getRowevent() <em>Rowevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowevent()
	 * @generated
	 * @ordered
	 */
	protected RowEvent rowevent;

	/**
	 * The cached value of the '{@link #getRowstyle() <em>Rowstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowstyle()
	 * @generated
	 * @ordered
	 */
	protected RowStyle rowstyle;

	/**
	 * The cached value of the '{@link #getBindMenu() <em>Bind Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindMenu()
	 * @generated
	 * @ordered
	 */
	protected ContainerItems bindMenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.ROW_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(String newSpace) {
		String oldSpace = space;
		space = newSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ROW_CONTAINER__SPACE, oldSpace,
					space));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ROW_CONTAINER__ALIGN_ITEMS,
					oldAlignItems, alignItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ROW_CONTAINER__JUSTIFY_CONTENT,
					oldJustifyContent, justifyContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowEvent getRowevent() {
		return rowevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRowevent(RowEvent newRowevent, NotificationChain msgs) {
		RowEvent oldRowevent = rowevent;
		rowevent = newRowevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.ROW_CONTAINER__ROWEVENT, oldRowevent, newRowevent);
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
	public void setRowevent(RowEvent newRowevent) {
		if (newRowevent != rowevent) {
			NotificationChain msgs = null;
			if (rowevent != null)
				msgs = ((InternalEObject) rowevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.ROW_CONTAINER__ROWEVENT, null, msgs);
			if (newRowevent != null)
				msgs = ((InternalEObject) newRowevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.ROW_CONTAINER__ROWEVENT, null, msgs);
			msgs = basicSetRowevent(newRowevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ROW_CONTAINER__ROWEVENT,
					newRowevent, newRowevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowStyle getRowstyle() {
		return rowstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRowstyle(RowStyle newRowstyle, NotificationChain msgs) {
		RowStyle oldRowstyle = rowstyle;
		rowstyle = newRowstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE, oldRowstyle, newRowstyle);
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
	public void setRowstyle(RowStyle newRowstyle) {
		if (newRowstyle != rowstyle) {
			NotificationChain msgs = null;
			if (rowstyle != null)
				msgs = ((InternalEObject) rowstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE, null, msgs);
			if (newRowstyle != null)
				msgs = ((InternalEObject) newRowstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE, null, msgs);
			msgs = basicSetRowstyle(newRowstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE,
					newRowstyle, newRowstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItems getBindMenu() {
		return bindMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindMenu(ContainerItems newBindMenu, NotificationChain msgs) {
		ContainerItems oldBindMenu = bindMenu;
		bindMenu = newBindMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.ROW_CONTAINER__BIND_MENU, oldBindMenu, newBindMenu);
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
	public void setBindMenu(ContainerItems newBindMenu) {
		if (newBindMenu != bindMenu) {
			NotificationChain msgs = null;
			if (bindMenu != null)
				msgs = ((InternalEObject) bindMenu).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.ROW_CONTAINER__BIND_MENU, null, msgs);
			if (newBindMenu != null)
				msgs = ((InternalEObject) newBindMenu).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.ROW_CONTAINER__BIND_MENU, null, msgs);
			msgs = basicSetBindMenu(newBindMenu, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ROW_CONTAINER__BIND_MENU,
					newBindMenu, newBindMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.ROW_CONTAINER__ROWEVENT:
			return basicSetRowevent(null, msgs);
		case ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE:
			return basicSetRowstyle(null, msgs);
		case ArkUIModelPackage.ROW_CONTAINER__BIND_MENU:
			return basicSetBindMenu(null, msgs);
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
		case ArkUIModelPackage.ROW_CONTAINER__SPACE:
			return getSpace();
		case ArkUIModelPackage.ROW_CONTAINER__ALIGN_ITEMS:
			return getAlignItems();
		case ArkUIModelPackage.ROW_CONTAINER__JUSTIFY_CONTENT:
			return getJustifyContent();
		case ArkUIModelPackage.ROW_CONTAINER__ROWEVENT:
			return getRowevent();
		case ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE:
			return getRowstyle();
		case ArkUIModelPackage.ROW_CONTAINER__BIND_MENU:
			return getBindMenu();
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
		case ArkUIModelPackage.ROW_CONTAINER__SPACE:
			setSpace((String) newValue);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__ALIGN_ITEMS:
			setAlignItems((String) newValue);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__JUSTIFY_CONTENT:
			setJustifyContent((String) newValue);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__ROWEVENT:
			setRowevent((RowEvent) newValue);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE:
			setRowstyle((RowStyle) newValue);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__BIND_MENU:
			setBindMenu((ContainerItems) newValue);
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
		case ArkUIModelPackage.ROW_CONTAINER__SPACE:
			setSpace(SPACE_EDEFAULT);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__ALIGN_ITEMS:
			setAlignItems(ALIGN_ITEMS_EDEFAULT);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__JUSTIFY_CONTENT:
			setJustifyContent(JUSTIFY_CONTENT_EDEFAULT);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__ROWEVENT:
			setRowevent((RowEvent) null);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE:
			setRowstyle((RowStyle) null);
			return;
		case ArkUIModelPackage.ROW_CONTAINER__BIND_MENU:
			setBindMenu((ContainerItems) null);
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
		case ArkUIModelPackage.ROW_CONTAINER__SPACE:
			return SPACE_EDEFAULT == null ? space != null : !SPACE_EDEFAULT.equals(space);
		case ArkUIModelPackage.ROW_CONTAINER__ALIGN_ITEMS:
			return ALIGN_ITEMS_EDEFAULT == null ? alignItems != null : !ALIGN_ITEMS_EDEFAULT.equals(alignItems);
		case ArkUIModelPackage.ROW_CONTAINER__JUSTIFY_CONTENT:
			return JUSTIFY_CONTENT_EDEFAULT == null ? justifyContent != null
					: !JUSTIFY_CONTENT_EDEFAULT.equals(justifyContent);
		case ArkUIModelPackage.ROW_CONTAINER__ROWEVENT:
			return rowevent != null;
		case ArkUIModelPackage.ROW_CONTAINER__ROWSTYLE:
			return rowstyle != null;
		case ArkUIModelPackage.ROW_CONTAINER__BIND_MENU:
			return bindMenu != null;
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
		result.append(" (space: ");
		result.append(space);
		result.append(", alignItems: ");
		result.append(alignItems);
		result.append(", justifyContent: ");
		result.append(justifyContent);
		result.append(')');
		return result.toString();
	}

} //RowContainerImpl
