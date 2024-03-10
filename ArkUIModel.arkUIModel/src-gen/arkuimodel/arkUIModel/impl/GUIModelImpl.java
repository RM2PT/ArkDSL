/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.AnimationLibray;
import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.DevicesType;
import arkuimodel.arkUIModel.GUIModel;
import arkuimodel.arkUIModel.OperationLibray;
import arkuimodel.arkUIModel.StyleLibray;
import arkuimodel.arkUIModel.TriggerEvent;
import arkuimodel.arkUIModel.UIDesign;
import arkuimodel.arkUIModel.UILogic;
import arkuimodel.arkUIModel.UIStruct;

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
 * An implementation of the model object '<em><b>GUI Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getStylelibray <em>Stylelibray</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getRootpage <em>Rootpage</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getTriggerevent <em>Triggerevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getAnimationlibray <em>Animationlibray</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getUilogic <em>Uilogic</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getUidesign <em>Uidesign</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.GUIModelImpl#getOperationlibray <em>Operationlibray</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GUIModelImpl extends MinimalEObjectImpl.Container implements GUIModel {
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
	 * The cached value of the '{@link #getStylelibray() <em>Stylelibray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylelibray()
	 * @generated
	 * @ordered
	 */
	protected StyleLibray stylelibray;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DevicesType TYPE_EDEFAULT = DevicesType.PHONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DevicesType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootpage() <em>Rootpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootpage()
	 * @generated
	 * @ordered
	 */
	protected UIStruct rootpage;

	/**
	 * The cached value of the '{@link #getTriggerevent() <em>Triggerevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerevent()
	 * @generated
	 * @ordered
	 */
	protected TriggerEvent triggerevent;

	/**
	 * The cached value of the '{@link #getAnimationlibray() <em>Animationlibray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationlibray()
	 * @generated
	 * @ordered
	 */
	protected AnimationLibray animationlibray;

	/**
	 * The cached value of the '{@link #getUilogic() <em>Uilogic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUilogic()
	 * @generated
	 * @ordered
	 */
	protected EList<UILogic> uilogic;

	/**
	 * The cached value of the '{@link #getUidesign() <em>Uidesign</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUidesign()
	 * @generated
	 * @ordered
	 */
	protected EList<UIDesign> uidesign;

	/**
	 * The cached value of the '{@link #getOperationlibray() <em>Operationlibray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationlibray()
	 * @generated
	 * @ordered
	 */
	protected OperationLibray operationlibray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.GUI_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GUI_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleLibray getStylelibray() {
		return stylelibray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStylelibray(StyleLibray newStylelibray, NotificationChain msgs) {
		StyleLibray oldStylelibray = stylelibray;
		stylelibray = newStylelibray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GUI_MODEL__STYLELIBRAY, oldStylelibray, newStylelibray);
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
	public void setStylelibray(StyleLibray newStylelibray) {
		if (newStylelibray != stylelibray) {
			NotificationChain msgs = null;
			if (stylelibray != null)
				msgs = ((InternalEObject) stylelibray).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__STYLELIBRAY, null, msgs);
			if (newStylelibray != null)
				msgs = ((InternalEObject) newStylelibray).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__STYLELIBRAY, null, msgs);
			msgs = basicSetStylelibray(newStylelibray, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GUI_MODEL__STYLELIBRAY,
					newStylelibray, newStylelibray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GUI_MODEL__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DevicesType newType) {
		DevicesType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GUI_MODEL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIStruct getRootpage() {
		return rootpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootpage(UIStruct newRootpage, NotificationChain msgs) {
		UIStruct oldRootpage = rootpage;
		rootpage = newRootpage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GUI_MODEL__ROOTPAGE, oldRootpage, newRootpage);
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
	public void setRootpage(UIStruct newRootpage) {
		if (newRootpage != rootpage) {
			NotificationChain msgs = null;
			if (rootpage != null)
				msgs = ((InternalEObject) rootpage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__ROOTPAGE, null, msgs);
			if (newRootpage != null)
				msgs = ((InternalEObject) newRootpage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__ROOTPAGE, null, msgs);
			msgs = basicSetRootpage(newRootpage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GUI_MODEL__ROOTPAGE, newRootpage,
					newRootpage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent getTriggerevent() {
		return triggerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerevent(TriggerEvent newTriggerevent, NotificationChain msgs) {
		TriggerEvent oldTriggerevent = triggerevent;
		triggerevent = newTriggerevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT, oldTriggerevent, newTriggerevent);
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
	public void setTriggerevent(TriggerEvent newTriggerevent) {
		if (newTriggerevent != triggerevent) {
			NotificationChain msgs = null;
			if (triggerevent != null)
				msgs = ((InternalEObject) triggerevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT, null, msgs);
			if (newTriggerevent != null)
				msgs = ((InternalEObject) newTriggerevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT, null, msgs);
			msgs = basicSetTriggerevent(newTriggerevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT,
					newTriggerevent, newTriggerevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationLibray getAnimationlibray() {
		return animationlibray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimationlibray(AnimationLibray newAnimationlibray, NotificationChain msgs) {
		AnimationLibray oldAnimationlibray = animationlibray;
		animationlibray = newAnimationlibray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY, oldAnimationlibray, newAnimationlibray);
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
	public void setAnimationlibray(AnimationLibray newAnimationlibray) {
		if (newAnimationlibray != animationlibray) {
			NotificationChain msgs = null;
			if (animationlibray != null)
				msgs = ((InternalEObject) animationlibray).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY, null, msgs);
			if (newAnimationlibray != null)
				msgs = ((InternalEObject) newAnimationlibray).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY, null, msgs);
			msgs = basicSetAnimationlibray(newAnimationlibray, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY,
					newAnimationlibray, newAnimationlibray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UILogic> getUilogic() {
		if (uilogic == null) {
			uilogic = new EObjectContainmentEList<UILogic>(UILogic.class, this, ArkUIModelPackage.GUI_MODEL__UILOGIC);
		}
		return uilogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIDesign> getUidesign() {
		if (uidesign == null) {
			uidesign = new EObjectContainmentEList<UIDesign>(UIDesign.class, this,
					ArkUIModelPackage.GUI_MODEL__UIDESIGN);
		}
		return uidesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationLibray getOperationlibray() {
		return operationlibray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationlibray(OperationLibray newOperationlibray, NotificationChain msgs) {
		OperationLibray oldOperationlibray = operationlibray;
		operationlibray = newOperationlibray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY, oldOperationlibray, newOperationlibray);
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
	public void setOperationlibray(OperationLibray newOperationlibray) {
		if (newOperationlibray != operationlibray) {
			NotificationChain msgs = null;
			if (operationlibray != null)
				msgs = ((InternalEObject) operationlibray).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY, null, msgs);
			if (newOperationlibray != null)
				msgs = ((InternalEObject) newOperationlibray).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY, null, msgs);
			msgs = basicSetOperationlibray(newOperationlibray, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY,
					newOperationlibray, newOperationlibray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.GUI_MODEL__STYLELIBRAY:
			return basicSetStylelibray(null, msgs);
		case ArkUIModelPackage.GUI_MODEL__ROOTPAGE:
			return basicSetRootpage(null, msgs);
		case ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT:
			return basicSetTriggerevent(null, msgs);
		case ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY:
			return basicSetAnimationlibray(null, msgs);
		case ArkUIModelPackage.GUI_MODEL__UILOGIC:
			return ((InternalEList<?>) getUilogic()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.GUI_MODEL__UIDESIGN:
			return ((InternalEList<?>) getUidesign()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY:
			return basicSetOperationlibray(null, msgs);
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
		case ArkUIModelPackage.GUI_MODEL__NAME:
			return getName();
		case ArkUIModelPackage.GUI_MODEL__STYLELIBRAY:
			return getStylelibray();
		case ArkUIModelPackage.GUI_MODEL__DESCRIPTION:
			return getDescription();
		case ArkUIModelPackage.GUI_MODEL__TYPE:
			return getType();
		case ArkUIModelPackage.GUI_MODEL__ROOTPAGE:
			return getRootpage();
		case ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT:
			return getTriggerevent();
		case ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY:
			return getAnimationlibray();
		case ArkUIModelPackage.GUI_MODEL__UILOGIC:
			return getUilogic();
		case ArkUIModelPackage.GUI_MODEL__UIDESIGN:
			return getUidesign();
		case ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY:
			return getOperationlibray();
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
		case ArkUIModelPackage.GUI_MODEL__NAME:
			setName((String) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__STYLELIBRAY:
			setStylelibray((StyleLibray) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__TYPE:
			setType((DevicesType) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__ROOTPAGE:
			setRootpage((UIStruct) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT:
			setTriggerevent((TriggerEvent) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY:
			setAnimationlibray((AnimationLibray) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__UILOGIC:
			getUilogic().clear();
			getUilogic().addAll((Collection<? extends UILogic>) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__UIDESIGN:
			getUidesign().clear();
			getUidesign().addAll((Collection<? extends UIDesign>) newValue);
			return;
		case ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY:
			setOperationlibray((OperationLibray) newValue);
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
		case ArkUIModelPackage.GUI_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.GUI_MODEL__STYLELIBRAY:
			setStylelibray((StyleLibray) null);
			return;
		case ArkUIModelPackage.GUI_MODEL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ArkUIModelPackage.GUI_MODEL__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.GUI_MODEL__ROOTPAGE:
			setRootpage((UIStruct) null);
			return;
		case ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT:
			setTriggerevent((TriggerEvent) null);
			return;
		case ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY:
			setAnimationlibray((AnimationLibray) null);
			return;
		case ArkUIModelPackage.GUI_MODEL__UILOGIC:
			getUilogic().clear();
			return;
		case ArkUIModelPackage.GUI_MODEL__UIDESIGN:
			getUidesign().clear();
			return;
		case ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY:
			setOperationlibray((OperationLibray) null);
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
		case ArkUIModelPackage.GUI_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArkUIModelPackage.GUI_MODEL__STYLELIBRAY:
			return stylelibray != null;
		case ArkUIModelPackage.GUI_MODEL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ArkUIModelPackage.GUI_MODEL__TYPE:
			return type != TYPE_EDEFAULT;
		case ArkUIModelPackage.GUI_MODEL__ROOTPAGE:
			return rootpage != null;
		case ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT:
			return triggerevent != null;
		case ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY:
			return animationlibray != null;
		case ArkUIModelPackage.GUI_MODEL__UILOGIC:
			return uilogic != null && !uilogic.isEmpty();
		case ArkUIModelPackage.GUI_MODEL__UIDESIGN:
			return uidesign != null && !uidesign.isEmpty();
		case ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY:
			return operationlibray != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GUIModelImpl
