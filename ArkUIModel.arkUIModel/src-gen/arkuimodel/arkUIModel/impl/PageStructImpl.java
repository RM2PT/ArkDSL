/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.PageEvent;
import arkuimodel.arkUIModel.PageStruct;
import arkuimodel.arkUIModel.UIComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Struct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageStructImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageStructImpl#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageStructImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageStructImpl#getPageevent <em>Pageevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageStructImpl extends MinimalEObjectImpl.Container implements PageStruct {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<UIComponent> widgets;

	/**
	 * The cached value of the '{@link #getPageevent() <em>Pageevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageevent()
	 * @generated
	 * @ordered
	 */
	protected PageEvent pageevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageStructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.PAGE_STRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_STRUCT__TITLE, oldTitle,
					title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_STRUCT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIComponent> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<UIComponent>(UIComponent.class, this,
					ArkUIModelPackage.PAGE_STRUCT__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageEvent getPageevent() {
		return pageevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageevent(PageEvent newPageevent, NotificationChain msgs) {
		PageEvent oldPageevent = pageevent;
		pageevent = newPageevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT, oldPageevent, newPageevent);
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
	public void setPageevent(PageEvent newPageevent) {
		if (newPageevent != pageevent) {
			NotificationChain msgs = null;
			if (pageevent != null)
				msgs = ((InternalEObject) pageevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT, null, msgs);
			if (newPageevent != null)
				msgs = ((InternalEObject) newPageevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT, null, msgs);
			msgs = basicSetPageevent(newPageevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT,
					newPageevent, newPageevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.PAGE_STRUCT__WIDGETS:
			return ((InternalEList<?>) getWidgets()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT:
			return basicSetPageevent(null, msgs);
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
		case ArkUIModelPackage.PAGE_STRUCT__TITLE:
			return getTitle();
		case ArkUIModelPackage.PAGE_STRUCT__TYPE:
			return getType();
		case ArkUIModelPackage.PAGE_STRUCT__WIDGETS:
			return getWidgets();
		case ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT:
			return getPageevent();
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
		case ArkUIModelPackage.PAGE_STRUCT__TITLE:
			setTitle((String) newValue);
			return;
		case ArkUIModelPackage.PAGE_STRUCT__TYPE:
			setType((String) newValue);
			return;
		case ArkUIModelPackage.PAGE_STRUCT__WIDGETS:
			getWidgets().clear();
			getWidgets().addAll((Collection<? extends UIComponent>) newValue);
			return;
		case ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT:
			setPageevent((PageEvent) newValue);
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
		case ArkUIModelPackage.PAGE_STRUCT__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE_STRUCT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE_STRUCT__WIDGETS:
			getWidgets().clear();
			return;
		case ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT:
			setPageevent((PageEvent) null);
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
		case ArkUIModelPackage.PAGE_STRUCT__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ArkUIModelPackage.PAGE_STRUCT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ArkUIModelPackage.PAGE_STRUCT__WIDGETS:
			return widgets != null && !widgets.isEmpty();
		case ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT:
			return pageevent != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PageStructImpl
