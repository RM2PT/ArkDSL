/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ForEach;
import arkuimodel.arkUIModel.IF;
import arkuimodel.arkUIModel.PageRefrence;
import arkuimodel.arkUIModel.PageStruct;
import arkuimodel.arkUIModel.UIComponent;
import arkuimodel.arkUIModel.WorkFlow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getWidget <em>Widget</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getFunflow <em>Funflow</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getPagerefrence <em>Pagerefrence</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getForeach <em>Foreach</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getIf <em>If</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UIComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UIComponentImpl extends MinimalEObjectImpl.Container implements UIComponent {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDGET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected String widgetType = WIDGET_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected EList<UIComponent> widget;

	/**
	 * The cached value of the '{@link #getFunflow() <em>Funflow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunflow()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkFlow> funflow;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<PageStruct> root;

	/**
	 * The cached value of the '{@link #getPagerefrence() <em>Pagerefrence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagerefrence()
	 * @generated
	 * @ordered
	 */
	protected EList<PageRefrence> pagerefrence;

	/**
	 * The cached value of the '{@link #getForeach() <em>Foreach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeach()
	 * @generated
	 * @ordered
	 */
	protected ForEach foreach;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected IF if_;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.UI_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.UI_COMPONENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidgetType() {
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetType(String newWidgetType) {
		String oldWidgetType = widgetType;
		widgetType = newWidgetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.UI_COMPONENT__WIDGET_TYPE,
					oldWidgetType, widgetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIComponent> getWidget() {
		if (widget == null) {
			widget = new EObjectContainmentEList<UIComponent>(UIComponent.class, this,
					ArkUIModelPackage.UI_COMPONENT__WIDGET);
		}
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkFlow> getFunflow() {
		if (funflow == null) {
			funflow = new EObjectResolvingEList<WorkFlow>(WorkFlow.class, this,
					ArkUIModelPackage.UI_COMPONENT__FUNFLOW);
		}
		return funflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageStruct> getRoot() {
		if (root == null) {
			root = new EObjectResolvingEList<PageStruct>(PageStruct.class, this, ArkUIModelPackage.UI_COMPONENT__ROOT);
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageRefrence> getPagerefrence() {
		if (pagerefrence == null) {
			pagerefrence = new EObjectContainmentEList<PageRefrence>(PageRefrence.class, this,
					ArkUIModelPackage.UI_COMPONENT__PAGEREFRENCE);
		}
		return pagerefrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach getForeach() {
		return foreach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeach(ForEach newForeach, NotificationChain msgs) {
		ForEach oldForeach = foreach;
		foreach = newForeach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.UI_COMPONENT__FOREACH, oldForeach, newForeach);
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
	public void setForeach(ForEach newForeach) {
		if (newForeach != foreach) {
			NotificationChain msgs = null;
			if (foreach != null)
				msgs = ((InternalEObject) foreach).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.UI_COMPONENT__FOREACH, null, msgs);
			if (newForeach != null)
				msgs = ((InternalEObject) newForeach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.UI_COMPONENT__FOREACH, null, msgs);
			msgs = basicSetForeach(newForeach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.UI_COMPONENT__FOREACH, newForeach,
					newForeach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IF getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(IF newIf, NotificationChain msgs) {
		IF oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.UI_COMPONENT__IF, oldIf, newIf);
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
	public void setIf(IF newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject) if_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.UI_COMPONENT__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.UI_COMPONENT__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.UI_COMPONENT__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.UI_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.UI_COMPONENT__WIDGET:
			return ((InternalEList<?>) getWidget()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.UI_COMPONENT__PAGEREFRENCE:
			return ((InternalEList<?>) getPagerefrence()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.UI_COMPONENT__FOREACH:
			return basicSetForeach(null, msgs);
		case ArkUIModelPackage.UI_COMPONENT__IF:
			return basicSetIf(null, msgs);
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
		case ArkUIModelPackage.UI_COMPONENT__ID:
			return getId();
		case ArkUIModelPackage.UI_COMPONENT__WIDGET_TYPE:
			return getWidgetType();
		case ArkUIModelPackage.UI_COMPONENT__WIDGET:
			return getWidget();
		case ArkUIModelPackage.UI_COMPONENT__FUNFLOW:
			return getFunflow();
		case ArkUIModelPackage.UI_COMPONENT__ROOT:
			return getRoot();
		case ArkUIModelPackage.UI_COMPONENT__PAGEREFRENCE:
			return getPagerefrence();
		case ArkUIModelPackage.UI_COMPONENT__FOREACH:
			return getForeach();
		case ArkUIModelPackage.UI_COMPONENT__IF:
			return getIf();
		case ArkUIModelPackage.UI_COMPONENT__NAME:
			return getName();
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
		case ArkUIModelPackage.UI_COMPONENT__ID:
			setId((String) newValue);
			return;
		case ArkUIModelPackage.UI_COMPONENT__WIDGET_TYPE:
			setWidgetType((String) newValue);
			return;
		case ArkUIModelPackage.UI_COMPONENT__WIDGET:
			getWidget().clear();
			getWidget().addAll((Collection<? extends UIComponent>) newValue);
			return;
		case ArkUIModelPackage.UI_COMPONENT__FUNFLOW:
			getFunflow().clear();
			getFunflow().addAll((Collection<? extends WorkFlow>) newValue);
			return;
		case ArkUIModelPackage.UI_COMPONENT__ROOT:
			getRoot().clear();
			getRoot().addAll((Collection<? extends PageStruct>) newValue);
			return;
		case ArkUIModelPackage.UI_COMPONENT__PAGEREFRENCE:
			getPagerefrence().clear();
			getPagerefrence().addAll((Collection<? extends PageRefrence>) newValue);
			return;
		case ArkUIModelPackage.UI_COMPONENT__FOREACH:
			setForeach((ForEach) newValue);
			return;
		case ArkUIModelPackage.UI_COMPONENT__IF:
			setIf((IF) newValue);
			return;
		case ArkUIModelPackage.UI_COMPONENT__NAME:
			setName((String) newValue);
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
		case ArkUIModelPackage.UI_COMPONENT__ID:
			setId(ID_EDEFAULT);
			return;
		case ArkUIModelPackage.UI_COMPONENT__WIDGET_TYPE:
			setWidgetType(WIDGET_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.UI_COMPONENT__WIDGET:
			getWidget().clear();
			return;
		case ArkUIModelPackage.UI_COMPONENT__FUNFLOW:
			getFunflow().clear();
			return;
		case ArkUIModelPackage.UI_COMPONENT__ROOT:
			getRoot().clear();
			return;
		case ArkUIModelPackage.UI_COMPONENT__PAGEREFRENCE:
			getPagerefrence().clear();
			return;
		case ArkUIModelPackage.UI_COMPONENT__FOREACH:
			setForeach((ForEach) null);
			return;
		case ArkUIModelPackage.UI_COMPONENT__IF:
			setIf((IF) null);
			return;
		case ArkUIModelPackage.UI_COMPONENT__NAME:
			setName(NAME_EDEFAULT);
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
		case ArkUIModelPackage.UI_COMPONENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ArkUIModelPackage.UI_COMPONENT__WIDGET_TYPE:
			return WIDGET_TYPE_EDEFAULT == null ? widgetType != null : !WIDGET_TYPE_EDEFAULT.equals(widgetType);
		case ArkUIModelPackage.UI_COMPONENT__WIDGET:
			return widget != null && !widget.isEmpty();
		case ArkUIModelPackage.UI_COMPONENT__FUNFLOW:
			return funflow != null && !funflow.isEmpty();
		case ArkUIModelPackage.UI_COMPONENT__ROOT:
			return root != null && !root.isEmpty();
		case ArkUIModelPackage.UI_COMPONENT__PAGEREFRENCE:
			return pagerefrence != null && !pagerefrence.isEmpty();
		case ArkUIModelPackage.UI_COMPONENT__FOREACH:
			return foreach != null;
		case ArkUIModelPackage.UI_COMPONENT__IF:
			return if_ != null;
		case ArkUIModelPackage.UI_COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", widgetType: ");
		result.append(widgetType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UIComponentImpl
