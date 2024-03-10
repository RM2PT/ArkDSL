/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.GridItemContainer;

import arkuimodel.arkUIModel.GridItemEvent;
import arkuimodel.arkUIModel.GridItemStyle;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Item Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl#getRowStart <em>Row Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl#getRowEnd <em>Row End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl#getColumnStart <em>Column Start</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl#getColumnEnd <em>Column End</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl#getForceRebuild <em>Force Rebuild</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl#getGriditemstyle <em>Griditemstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl#getGriditemevent <em>Griditemevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridItemContainerImpl extends ContainerImpl implements GridItemContainer {
	/**
	 * The default value of the '{@link #getRowStart() <em>Row Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowStart()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowStart() <em>Row Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowStart()
	 * @generated
	 * @ordered
	 */
	protected String rowStart = ROW_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowEnd() <em>Row End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowEnd() <em>Row End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowEnd()
	 * @generated
	 * @ordered
	 */
	protected String rowEnd = ROW_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnStart() <em>Column Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnStart()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnStart() <em>Column Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnStart()
	 * @generated
	 * @ordered
	 */
	protected String columnStart = COLUMN_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnEnd() <em>Column End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnEnd() <em>Column End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnEnd()
	 * @generated
	 * @ordered
	 */
	protected String columnEnd = COLUMN_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceRebuild() <em>Force Rebuild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceRebuild()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_REBUILD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceRebuild() <em>Force Rebuild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceRebuild()
	 * @generated
	 * @ordered
	 */
	protected String forceRebuild = FORCE_REBUILD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGriditemstyle() <em>Griditemstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGriditemstyle()
	 * @generated
	 * @ordered
	 */
	protected GridItemStyle griditemstyle;

	/**
	 * The cached value of the '{@link #getGriditemevent() <em>Griditemevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGriditemevent()
	 * @generated
	 * @ordered
	 */
	protected GridItemEvent griditemevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridItemContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.GRID_ITEM_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowStart() {
		return rowStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowStart(String newRowStart) {
		String oldRowStart = rowStart;
		rowStart = newRowStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_START,
					oldRowStart, rowStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowEnd() {
		return rowEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowEnd(String newRowEnd) {
		String oldRowEnd = rowEnd;
		rowEnd = newRowEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_END,
					oldRowEnd, rowEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnStart() {
		return columnStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnStart(String newColumnStart) {
		String oldColumnStart = columnStart;
		columnStart = newColumnStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_START,
					oldColumnStart, columnStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnEnd() {
		return columnEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnEnd(String newColumnEnd) {
		String oldColumnEnd = columnEnd;
		columnEnd = newColumnEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_END,
					oldColumnEnd, columnEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForceRebuild() {
		return forceRebuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceRebuild(String newForceRebuild) {
		String oldForceRebuild = forceRebuild;
		forceRebuild = newForceRebuild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_ITEM_CONTAINER__FORCE_REBUILD,
					oldForceRebuild, forceRebuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridItemStyle getGriditemstyle() {
		return griditemstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGriditemstyle(GridItemStyle newGriditemstyle, NotificationChain msgs) {
		GridItemStyle oldGriditemstyle = griditemstyle;
		griditemstyle = newGriditemstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE, oldGriditemstyle, newGriditemstyle);
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
	public void setGriditemstyle(GridItemStyle newGriditemstyle) {
		if (newGriditemstyle != griditemstyle) {
			NotificationChain msgs = null;
			if (griditemstyle != null)
				msgs = ((InternalEObject) griditemstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE, null, msgs);
			if (newGriditemstyle != null)
				msgs = ((InternalEObject) newGriditemstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE, null, msgs);
			msgs = basicSetGriditemstyle(newGriditemstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE,
					newGriditemstyle, newGriditemstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridItemEvent getGriditemevent() {
		return griditemevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGriditemevent(GridItemEvent newGriditemevent, NotificationChain msgs) {
		GridItemEvent oldGriditemevent = griditemevent;
		griditemevent = newGriditemevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT, oldGriditemevent, newGriditemevent);
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
	public void setGriditemevent(GridItemEvent newGriditemevent) {
		if (newGriditemevent != griditemevent) {
			NotificationChain msgs = null;
			if (griditemevent != null)
				msgs = ((InternalEObject) griditemevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT, null, msgs);
			if (newGriditemevent != null)
				msgs = ((InternalEObject) newGriditemevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT, null, msgs);
			msgs = basicSetGriditemevent(newGriditemevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT,
					newGriditemevent, newGriditemevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE:
			return basicSetGriditemstyle(null, msgs);
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT:
			return basicSetGriditemevent(null, msgs);
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
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_START:
			return getRowStart();
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_END:
			return getRowEnd();
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_START:
			return getColumnStart();
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_END:
			return getColumnEnd();
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__FORCE_REBUILD:
			return getForceRebuild();
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE:
			return getGriditemstyle();
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT:
			return getGriditemevent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_START:
			setRowStart((String) newValue);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_END:
			setRowEnd((String) newValue);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_START:
			setColumnStart((String) newValue);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_END:
			setColumnEnd((String) newValue);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__FORCE_REBUILD:
			setForceRebuild((String) newValue);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE:
			setGriditemstyle((GridItemStyle) newValue);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT:
			setGriditemevent((GridItemEvent) newValue);
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
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_START:
			setRowStart(ROW_START_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_END:
			setRowEnd(ROW_END_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_START:
			setColumnStart(COLUMN_START_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_END:
			setColumnEnd(COLUMN_END_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__FORCE_REBUILD:
			setForceRebuild(FORCE_REBUILD_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE:
			setGriditemstyle((GridItemStyle) null);
			return;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT:
			setGriditemevent((GridItemEvent) null);
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
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_START:
			return ROW_START_EDEFAULT == null ? rowStart != null : !ROW_START_EDEFAULT.equals(rowStart);
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__ROW_END:
			return ROW_END_EDEFAULT == null ? rowEnd != null : !ROW_END_EDEFAULT.equals(rowEnd);
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_START:
			return COLUMN_START_EDEFAULT == null ? columnStart != null : !COLUMN_START_EDEFAULT.equals(columnStart);
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__COLUMN_END:
			return COLUMN_END_EDEFAULT == null ? columnEnd != null : !COLUMN_END_EDEFAULT.equals(columnEnd);
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__FORCE_REBUILD:
			return FORCE_REBUILD_EDEFAULT == null ? forceRebuild != null : !FORCE_REBUILD_EDEFAULT.equals(forceRebuild);
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMSTYLE:
			return griditemstyle != null;
		case ArkUIModelPackage.GRID_ITEM_CONTAINER__GRIDITEMEVENT:
			return griditemevent != null;
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
		result.append(" (rowStart: ");
		result.append(rowStart);
		result.append(", rowEnd: ");
		result.append(rowEnd);
		result.append(", columnStart: ");
		result.append(columnStart);
		result.append(", columnEnd: ");
		result.append(columnEnd);
		result.append(", forceRebuild: ");
		result.append(forceRebuild);
		result.append(')');
		return result.toString();
	}

} //GridItemContainerImpl
