/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.GridContainer;
import arkuimodel.arkUIModel.GridEvent;
import arkuimodel.arkUIModel.GridItemContainer;
import arkuimodel.arkUIModel.GridStyle;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridContainerImpl#getColumnsTemplate <em>Columns Template</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridContainerImpl#getRowsTemplate <em>Rows Template</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridContainerImpl#getColumnsGap <em>Columns Gap</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridContainerImpl#getRowsGap <em>Rows Gap</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridContainerImpl#getGridevent <em>Gridevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridContainerImpl#getGridstyle <em>Gridstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridContainerImpl#getGriditemcontainer <em>Griditemcontainer</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GridContainerImpl#getCachedCount <em>Cached Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridContainerImpl extends ContainerImpl implements GridContainer {
	/**
	 * The default value of the '{@link #getColumnsTemplate() <em>Columns Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMNS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnsTemplate() <em>Columns Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsTemplate()
	 * @generated
	 * @ordered
	 */
	protected String columnsTemplate = COLUMNS_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowsTemplate() <em>Rows Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowsTemplate() <em>Rows Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsTemplate()
	 * @generated
	 * @ordered
	 */
	protected String rowsTemplate = ROWS_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnsGap() <em>Columns Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsGap()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMNS_GAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnsGap() <em>Columns Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsGap()
	 * @generated
	 * @ordered
	 */
	protected String columnsGap = COLUMNS_GAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowsGap() <em>Rows Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsGap()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWS_GAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowsGap() <em>Rows Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsGap()
	 * @generated
	 * @ordered
	 */
	protected String rowsGap = ROWS_GAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGridevent() <em>Gridevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridevent()
	 * @generated
	 * @ordered
	 */
	protected GridEvent gridevent;

	/**
	 * The cached value of the '{@link #getGridstyle() <em>Gridstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridstyle()
	 * @generated
	 * @ordered
	 */
	protected GridStyle gridstyle;

	/**
	 * The cached value of the '{@link #getGriditemcontainer() <em>Griditemcontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGriditemcontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<GridItemContainer> griditemcontainer;

	/**
	 * The default value of the '{@link #getCachedCount() <em>Cached Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedCount()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHED_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCachedCount() <em>Cached Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedCount()
	 * @generated
	 * @ordered
	 */
	protected String cachedCount = CACHED_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.GRID_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnsTemplate() {
		return columnsTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnsTemplate(String newColumnsTemplate) {
		String oldColumnsTemplate = columnsTemplate;
		columnsTemplate = newColumnsTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_CONTAINER__COLUMNS_TEMPLATE,
					oldColumnsTemplate, columnsTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowsTemplate() {
		return rowsTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowsTemplate(String newRowsTemplate) {
		String oldRowsTemplate = rowsTemplate;
		rowsTemplate = newRowsTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_CONTAINER__ROWS_TEMPLATE,
					oldRowsTemplate, rowsTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnsGap() {
		return columnsGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnsGap(String newColumnsGap) {
		String oldColumnsGap = columnsGap;
		columnsGap = newColumnsGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_CONTAINER__COLUMNS_GAP,
					oldColumnsGap, columnsGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowsGap() {
		return rowsGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowsGap(String newRowsGap) {
		String oldRowsGap = rowsGap;
		rowsGap = newRowsGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_CONTAINER__ROWS_GAP,
					oldRowsGap, rowsGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridEvent getGridevent() {
		return gridevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridevent(GridEvent newGridevent, NotificationChain msgs) {
		GridEvent oldGridevent = gridevent;
		gridevent = newGridevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT, oldGridevent, newGridevent);
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
	public void setGridevent(GridEvent newGridevent) {
		if (newGridevent != gridevent) {
			NotificationChain msgs = null;
			if (gridevent != null)
				msgs = ((InternalEObject) gridevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT, null, msgs);
			if (newGridevent != null)
				msgs = ((InternalEObject) newGridevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT, null, msgs);
			msgs = basicSetGridevent(newGridevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT,
					newGridevent, newGridevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridStyle getGridstyle() {
		return gridstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridstyle(GridStyle newGridstyle, NotificationChain msgs) {
		GridStyle oldGridstyle = gridstyle;
		gridstyle = newGridstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE, oldGridstyle, newGridstyle);
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
	public void setGridstyle(GridStyle newGridstyle) {
		if (newGridstyle != gridstyle) {
			NotificationChain msgs = null;
			if (gridstyle != null)
				msgs = ((InternalEObject) gridstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE, null, msgs);
			if (newGridstyle != null)
				msgs = ((InternalEObject) newGridstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE, null, msgs);
			msgs = basicSetGridstyle(newGridstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE,
					newGridstyle, newGridstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridItemContainer> getGriditemcontainer() {
		if (griditemcontainer == null) {
			griditemcontainer = new EObjectContainmentEList<GridItemContainer>(GridItemContainer.class, this,
					ArkUIModelPackage.GRID_CONTAINER__GRIDITEMCONTAINER);
		}
		return griditemcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCachedCount() {
		return cachedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCachedCount(String newCachedCount) {
		String oldCachedCount = cachedCount;
		cachedCount = newCachedCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GRID_CONTAINER__CACHED_COUNT,
					oldCachedCount, cachedCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT:
			return basicSetGridevent(null, msgs);
		case ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE:
			return basicSetGridstyle(null, msgs);
		case ArkUIModelPackage.GRID_CONTAINER__GRIDITEMCONTAINER:
			return ((InternalEList<?>) getGriditemcontainer()).basicRemove(otherEnd, msgs);
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
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_TEMPLATE:
			return getColumnsTemplate();
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_TEMPLATE:
			return getRowsTemplate();
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_GAP:
			return getColumnsGap();
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_GAP:
			return getRowsGap();
		case ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT:
			return getGridevent();
		case ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE:
			return getGridstyle();
		case ArkUIModelPackage.GRID_CONTAINER__GRIDITEMCONTAINER:
			return getGriditemcontainer();
		case ArkUIModelPackage.GRID_CONTAINER__CACHED_COUNT:
			return getCachedCount();
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
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_TEMPLATE:
			setColumnsTemplate((String) newValue);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_TEMPLATE:
			setRowsTemplate((String) newValue);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_GAP:
			setColumnsGap((String) newValue);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_GAP:
			setRowsGap((String) newValue);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT:
			setGridevent((GridEvent) newValue);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE:
			setGridstyle((GridStyle) newValue);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDITEMCONTAINER:
			getGriditemcontainer().clear();
			getGriditemcontainer().addAll((Collection<? extends GridItemContainer>) newValue);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__CACHED_COUNT:
			setCachedCount((String) newValue);
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
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_TEMPLATE:
			setColumnsTemplate(COLUMNS_TEMPLATE_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_TEMPLATE:
			setRowsTemplate(ROWS_TEMPLATE_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_GAP:
			setColumnsGap(COLUMNS_GAP_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_GAP:
			setRowsGap(ROWS_GAP_EDEFAULT);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT:
			setGridevent((GridEvent) null);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE:
			setGridstyle((GridStyle) null);
			return;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDITEMCONTAINER:
			getGriditemcontainer().clear();
			return;
		case ArkUIModelPackage.GRID_CONTAINER__CACHED_COUNT:
			setCachedCount(CACHED_COUNT_EDEFAULT);
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
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_TEMPLATE:
			return COLUMNS_TEMPLATE_EDEFAULT == null ? columnsTemplate != null
					: !COLUMNS_TEMPLATE_EDEFAULT.equals(columnsTemplate);
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_TEMPLATE:
			return ROWS_TEMPLATE_EDEFAULT == null ? rowsTemplate != null : !ROWS_TEMPLATE_EDEFAULT.equals(rowsTemplate);
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_GAP:
			return COLUMNS_GAP_EDEFAULT == null ? columnsGap != null : !COLUMNS_GAP_EDEFAULT.equals(columnsGap);
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_GAP:
			return ROWS_GAP_EDEFAULT == null ? rowsGap != null : !ROWS_GAP_EDEFAULT.equals(rowsGap);
		case ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT:
			return gridevent != null;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE:
			return gridstyle != null;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDITEMCONTAINER:
			return griditemcontainer != null && !griditemcontainer.isEmpty();
		case ArkUIModelPackage.GRID_CONTAINER__CACHED_COUNT:
			return CACHED_COUNT_EDEFAULT == null ? cachedCount != null : !CACHED_COUNT_EDEFAULT.equals(cachedCount);
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
		result.append(" (columnsTemplate: ");
		result.append(columnsTemplate);
		result.append(", rowsTemplate: ");
		result.append(rowsTemplate);
		result.append(", columnsGap: ");
		result.append(columnsGap);
		result.append(", rowsGap: ");
		result.append(rowsGap);
		result.append(", cachedCount: ");
		result.append(cachedCount);
		result.append(')');
		return result.toString();
	}

} //GridContainerImpl
