/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ColumnContainer;
import arkuimodel.arkUIModel.ColumnEvent;
import arkuimodel.arkUIModel.ColumnStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ColumnContainerImpl#getJustifyContent <em>Justify Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ColumnContainerImpl#getAlignItems <em>Align Items</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ColumnContainerImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ColumnContainerImpl#getColumnevent <em>Columnevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ColumnContainerImpl#getColumnstyle <em>Columnstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnContainerImpl extends ContainerImpl implements ColumnContainer {
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
	 * The cached value of the '{@link #getColumnevent() <em>Columnevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnevent()
	 * @generated
	 * @ordered
	 */
	protected ColumnEvent columnevent;

	/**
	 * The cached value of the '{@link #getColumnstyle() <em>Columnstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnstyle()
	 * @generated
	 * @ordered
	 */
	protected ColumnStyle columnstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.COLUMN_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.COLUMN_CONTAINER__JUSTIFY_CONTENT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.COLUMN_CONTAINER__ALIGN_ITEMS,
					oldAlignItems, alignItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.COLUMN_CONTAINER__SPACE, oldSpace,
					space));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnEvent getColumnevent() {
		return columnevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnevent(ColumnEvent newColumnevent, NotificationChain msgs) {
		ColumnEvent oldColumnevent = columnevent;
		columnevent = newColumnevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT, oldColumnevent, newColumnevent);
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
	public void setColumnevent(ColumnEvent newColumnevent) {
		if (newColumnevent != columnevent) {
			NotificationChain msgs = null;
			if (columnevent != null)
				msgs = ((InternalEObject) columnevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT, null, msgs);
			if (newColumnevent != null)
				msgs = ((InternalEObject) newColumnevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT, null, msgs);
			msgs = basicSetColumnevent(newColumnevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT,
					newColumnevent, newColumnevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnStyle getColumnstyle() {
		return columnstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnstyle(ColumnStyle newColumnstyle, NotificationChain msgs) {
		ColumnStyle oldColumnstyle = columnstyle;
		columnstyle = newColumnstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE, oldColumnstyle, newColumnstyle);
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
	public void setColumnstyle(ColumnStyle newColumnstyle) {
		if (newColumnstyle != columnstyle) {
			NotificationChain msgs = null;
			if (columnstyle != null)
				msgs = ((InternalEObject) columnstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE, null, msgs);
			if (newColumnstyle != null)
				msgs = ((InternalEObject) newColumnstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE, null, msgs);
			msgs = basicSetColumnstyle(newColumnstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE,
					newColumnstyle, newColumnstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT:
			return basicSetColumnevent(null, msgs);
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE:
			return basicSetColumnstyle(null, msgs);
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
		case ArkUIModelPackage.COLUMN_CONTAINER__JUSTIFY_CONTENT:
			return getJustifyContent();
		case ArkUIModelPackage.COLUMN_CONTAINER__ALIGN_ITEMS:
			return getAlignItems();
		case ArkUIModelPackage.COLUMN_CONTAINER__SPACE:
			return getSpace();
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT:
			return getColumnevent();
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE:
			return getColumnstyle();
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
		case ArkUIModelPackage.COLUMN_CONTAINER__JUSTIFY_CONTENT:
			setJustifyContent((String) newValue);
			return;
		case ArkUIModelPackage.COLUMN_CONTAINER__ALIGN_ITEMS:
			setAlignItems((String) newValue);
			return;
		case ArkUIModelPackage.COLUMN_CONTAINER__SPACE:
			setSpace((String) newValue);
			return;
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT:
			setColumnevent((ColumnEvent) newValue);
			return;
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE:
			setColumnstyle((ColumnStyle) newValue);
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
		case ArkUIModelPackage.COLUMN_CONTAINER__JUSTIFY_CONTENT:
			setJustifyContent(JUSTIFY_CONTENT_EDEFAULT);
			return;
		case ArkUIModelPackage.COLUMN_CONTAINER__ALIGN_ITEMS:
			setAlignItems(ALIGN_ITEMS_EDEFAULT);
			return;
		case ArkUIModelPackage.COLUMN_CONTAINER__SPACE:
			setSpace(SPACE_EDEFAULT);
			return;
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT:
			setColumnevent((ColumnEvent) null);
			return;
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE:
			setColumnstyle((ColumnStyle) null);
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
		case ArkUIModelPackage.COLUMN_CONTAINER__JUSTIFY_CONTENT:
			return JUSTIFY_CONTENT_EDEFAULT == null ? justifyContent != null
					: !JUSTIFY_CONTENT_EDEFAULT.equals(justifyContent);
		case ArkUIModelPackage.COLUMN_CONTAINER__ALIGN_ITEMS:
			return ALIGN_ITEMS_EDEFAULT == null ? alignItems != null : !ALIGN_ITEMS_EDEFAULT.equals(alignItems);
		case ArkUIModelPackage.COLUMN_CONTAINER__SPACE:
			return SPACE_EDEFAULT == null ? space != null : !SPACE_EDEFAULT.equals(space);
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNEVENT:
			return columnevent != null;
		case ArkUIModelPackage.COLUMN_CONTAINER__COLUMNSTYLE:
			return columnstyle != null;
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
		result.append(" (justifyContent: ");
		result.append(justifyContent);
		result.append(", alignItems: ");
		result.append(alignItems);
		result.append(", space: ");
		result.append(space);
		result.append(')');
		return result.toString();
	}

} //ColumnContainerImpl
