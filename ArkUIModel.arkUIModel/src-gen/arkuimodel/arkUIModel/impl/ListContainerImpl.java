/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ListContainer;
import arkuimodel.arkUIModel.ListEvent;
import arkuimodel.arkUIModel.ListItemContainer;
import arkuimodel.arkUIModel.ListStyle;

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
 * An implementation of the model object '<em><b>List Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListContainerImpl#getInitialIndex <em>Initial Index</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListContainerImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListContainerImpl#getScroller <em>Scroller</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListContainerImpl#getListitemcontainer <em>Listitemcontainer</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListContainerImpl#getListevent <em>Listevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ListContainerImpl#getListstyle <em>Liststyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListContainerImpl extends ContainerImpl implements ListContainer {
	/**
	 * The default value of the '{@link #getInitialIndex() <em>Initial Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialIndex() <em>Initial Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialIndex()
	 * @generated
	 * @ordered
	 */
	protected String initialIndex = INITIAL_INDEX_EDEFAULT;

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
	 * The default value of the '{@link #getScroller() <em>Scroller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScroller()
	 * @generated
	 * @ordered
	 */
	protected static final String SCROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScroller() <em>Scroller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScroller()
	 * @generated
	 * @ordered
	 */
	protected String scroller = SCROLLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListitemcontainer() <em>Listitemcontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListitemcontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ListItemContainer> listitemcontainer;

	/**
	 * The cached value of the '{@link #getListevent() <em>Listevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListevent()
	 * @generated
	 * @ordered
	 */
	protected ListEvent listevent;

	/**
	 * The cached value of the '{@link #getListstyle() <em>Liststyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListstyle()
	 * @generated
	 * @ordered
	 */
	protected ListStyle liststyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.LIST_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialIndex() {
		return initialIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialIndex(String newInitialIndex) {
		String oldInitialIndex = initialIndex;
		initialIndex = newInitialIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_CONTAINER__INITIAL_INDEX,
					oldInitialIndex, initialIndex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_CONTAINER__SPACE, oldSpace,
					space));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScroller() {
		return scroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScroller(String newScroller) {
		String oldScroller = scroller;
		scroller = newScroller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_CONTAINER__SCROLLER,
					oldScroller, scroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListItemContainer> getListitemcontainer() {
		if (listitemcontainer == null) {
			listitemcontainer = new EObjectContainmentEList<ListItemContainer>(ListItemContainer.class, this,
					ArkUIModelPackage.LIST_CONTAINER__LISTITEMCONTAINER);
		}
		return listitemcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEvent getListevent() {
		return listevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListevent(ListEvent newListevent, NotificationChain msgs) {
		ListEvent oldListevent = listevent;
		listevent = newListevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.LIST_CONTAINER__LISTEVENT, oldListevent, newListevent);
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
	public void setListevent(ListEvent newListevent) {
		if (newListevent != listevent) {
			NotificationChain msgs = null;
			if (listevent != null)
				msgs = ((InternalEObject) listevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.LIST_CONTAINER__LISTEVENT, null, msgs);
			if (newListevent != null)
				msgs = ((InternalEObject) newListevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.LIST_CONTAINER__LISTEVENT, null, msgs);
			msgs = basicSetListevent(newListevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_CONTAINER__LISTEVENT,
					newListevent, newListevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyle getListstyle() {
		return liststyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListstyle(ListStyle newListstyle, NotificationChain msgs) {
		ListStyle oldListstyle = liststyle;
		liststyle = newListstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE, oldListstyle, newListstyle);
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
	public void setListstyle(ListStyle newListstyle) {
		if (newListstyle != liststyle) {
			NotificationChain msgs = null;
			if (liststyle != null)
				msgs = ((InternalEObject) liststyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE, null, msgs);
			if (newListstyle != null)
				msgs = ((InternalEObject) newListstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE, null, msgs);
			msgs = basicSetListstyle(newListstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE,
					newListstyle, newListstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.LIST_CONTAINER__LISTITEMCONTAINER:
			return ((InternalEList<?>) getListitemcontainer()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.LIST_CONTAINER__LISTEVENT:
			return basicSetListevent(null, msgs);
		case ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE:
			return basicSetListstyle(null, msgs);
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
		case ArkUIModelPackage.LIST_CONTAINER__INITIAL_INDEX:
			return getInitialIndex();
		case ArkUIModelPackage.LIST_CONTAINER__SPACE:
			return getSpace();
		case ArkUIModelPackage.LIST_CONTAINER__SCROLLER:
			return getScroller();
		case ArkUIModelPackage.LIST_CONTAINER__LISTITEMCONTAINER:
			return getListitemcontainer();
		case ArkUIModelPackage.LIST_CONTAINER__LISTEVENT:
			return getListevent();
		case ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE:
			return getListstyle();
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
		case ArkUIModelPackage.LIST_CONTAINER__INITIAL_INDEX:
			setInitialIndex((String) newValue);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__SPACE:
			setSpace((String) newValue);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__SCROLLER:
			setScroller((String) newValue);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__LISTITEMCONTAINER:
			getListitemcontainer().clear();
			getListitemcontainer().addAll((Collection<? extends ListItemContainer>) newValue);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__LISTEVENT:
			setListevent((ListEvent) newValue);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE:
			setListstyle((ListStyle) newValue);
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
		case ArkUIModelPackage.LIST_CONTAINER__INITIAL_INDEX:
			setInitialIndex(INITIAL_INDEX_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__SPACE:
			setSpace(SPACE_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__SCROLLER:
			setScroller(SCROLLER_EDEFAULT);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__LISTITEMCONTAINER:
			getListitemcontainer().clear();
			return;
		case ArkUIModelPackage.LIST_CONTAINER__LISTEVENT:
			setListevent((ListEvent) null);
			return;
		case ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE:
			setListstyle((ListStyle) null);
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
		case ArkUIModelPackage.LIST_CONTAINER__INITIAL_INDEX:
			return INITIAL_INDEX_EDEFAULT == null ? initialIndex != null : !INITIAL_INDEX_EDEFAULT.equals(initialIndex);
		case ArkUIModelPackage.LIST_CONTAINER__SPACE:
			return SPACE_EDEFAULT == null ? space != null : !SPACE_EDEFAULT.equals(space);
		case ArkUIModelPackage.LIST_CONTAINER__SCROLLER:
			return SCROLLER_EDEFAULT == null ? scroller != null : !SCROLLER_EDEFAULT.equals(scroller);
		case ArkUIModelPackage.LIST_CONTAINER__LISTITEMCONTAINER:
			return listitemcontainer != null && !listitemcontainer.isEmpty();
		case ArkUIModelPackage.LIST_CONTAINER__LISTEVENT:
			return listevent != null;
		case ArkUIModelPackage.LIST_CONTAINER__LISTSTYLE:
			return liststyle != null;
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
		result.append(" (initialIndex: ");
		result.append(initialIndex);
		result.append(", space: ");
		result.append(space);
		result.append(", scroller: ");
		result.append(scroller);
		result.append(')');
		return result.toString();
	}

} //ListContainerImpl
