/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.Parameter;
import arkuimodel.arkUIModel.UILogic;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.UILogicImpl#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UILogicImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.UILogicImpl#getPageparameter <em>Pageparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UILogicImpl extends MinimalEObjectImpl.Container implements UILogic {
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
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkFlow> workflow;

	/**
	 * The cached value of the '{@link #getPageparameter() <em>Pageparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> pageparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UILogicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.UI_LOGIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.UI_LOGIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkFlow> getWorkflow() {
		if (workflow == null) {
			workflow = new EObjectContainmentEList<WorkFlow>(WorkFlow.class, this,
					ArkUIModelPackage.UI_LOGIC__WORKFLOW);
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getPageparameter() {
		if (pageparameter == null) {
			pageparameter = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					ArkUIModelPackage.UI_LOGIC__PAGEPARAMETER);
		}
		return pageparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.UI_LOGIC__WORKFLOW:
			return ((InternalEList<?>) getWorkflow()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.UI_LOGIC__PAGEPARAMETER:
			return ((InternalEList<?>) getPageparameter()).basicRemove(otherEnd, msgs);
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
		case ArkUIModelPackage.UI_LOGIC__NAME:
			return getName();
		case ArkUIModelPackage.UI_LOGIC__WORKFLOW:
			return getWorkflow();
		case ArkUIModelPackage.UI_LOGIC__PAGEPARAMETER:
			return getPageparameter();
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
		case ArkUIModelPackage.UI_LOGIC__NAME:
			setName((String) newValue);
			return;
		case ArkUIModelPackage.UI_LOGIC__WORKFLOW:
			getWorkflow().clear();
			getWorkflow().addAll((Collection<? extends WorkFlow>) newValue);
			return;
		case ArkUIModelPackage.UI_LOGIC__PAGEPARAMETER:
			getPageparameter().clear();
			getPageparameter().addAll((Collection<? extends Parameter>) newValue);
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
		case ArkUIModelPackage.UI_LOGIC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.UI_LOGIC__WORKFLOW:
			getWorkflow().clear();
			return;
		case ArkUIModelPackage.UI_LOGIC__PAGEPARAMETER:
			getPageparameter().clear();
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
		case ArkUIModelPackage.UI_LOGIC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArkUIModelPackage.UI_LOGIC__WORKFLOW:
			return workflow != null && !workflow.isEmpty();
		case ArkUIModelPackage.UI_LOGIC__PAGEPARAMETER:
			return pageparameter != null && !pageparameter.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //UILogicImpl
