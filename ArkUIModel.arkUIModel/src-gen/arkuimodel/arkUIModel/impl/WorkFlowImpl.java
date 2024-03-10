/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ExecuteType;
import arkuimodel.arkUIModel.FlowLine;
import arkuimodel.arkUIModel.Function;
import arkuimodel.arkUIModel.Parameter;
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
 * An implementation of the model object '<em><b>Work Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.WorkFlowImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.WorkFlowImpl#getFlowName <em>Flow Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.WorkFlowImpl#getFlowline <em>Flowline</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.WorkFlowImpl#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.WorkFlowImpl#getWorkparameter <em>Workparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkFlowImpl extends MinimalEObjectImpl.Container implements WorkFlow {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * The default value of the '{@link #getFlowName() <em>Flow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowName()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowName() <em>Flow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowName()
	 * @generated
	 * @ordered
	 */
	protected String flowName = FLOW_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowline() <em>Flowline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowline()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowLine> flowline;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ExecuteType TYPE_EDEFAULT = ExecuteType.SYN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExecuteType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkparameter() <em>Workparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> workparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.WORK_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<Function>(Function.class, this,
					ArkUIModelPackage.WORK_FLOW__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlowName() {
		return flowName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowName(String newFlowName) {
		String oldFlowName = flowName;
		flowName = newFlowName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.WORK_FLOW__FLOW_NAME, oldFlowName,
					flowName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowLine> getFlowline() {
		if (flowline == null) {
			flowline = new EObjectContainmentEList<FlowLine>(FlowLine.class, this,
					ArkUIModelPackage.WORK_FLOW__FLOWLINE);
		}
		return flowline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExecuteType newType) {
		ExecuteType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.WORK_FLOW__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getWorkparameter() {
		if (workparameter == null) {
			workparameter = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					ArkUIModelPackage.WORK_FLOW__WORKPARAMETER);
		}
		return workparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.WORK_FLOW__FUNCTION:
			return ((InternalEList<?>) getFunction()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.WORK_FLOW__FLOWLINE:
			return ((InternalEList<?>) getFlowline()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.WORK_FLOW__WORKPARAMETER:
			return ((InternalEList<?>) getWorkparameter()).basicRemove(otherEnd, msgs);
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
		case ArkUIModelPackage.WORK_FLOW__FUNCTION:
			return getFunction();
		case ArkUIModelPackage.WORK_FLOW__FLOW_NAME:
			return getFlowName();
		case ArkUIModelPackage.WORK_FLOW__FLOWLINE:
			return getFlowline();
		case ArkUIModelPackage.WORK_FLOW__TYPE:
			return getType();
		case ArkUIModelPackage.WORK_FLOW__WORKPARAMETER:
			return getWorkparameter();
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
		case ArkUIModelPackage.WORK_FLOW__FUNCTION:
			getFunction().clear();
			getFunction().addAll((Collection<? extends Function>) newValue);
			return;
		case ArkUIModelPackage.WORK_FLOW__FLOW_NAME:
			setFlowName((String) newValue);
			return;
		case ArkUIModelPackage.WORK_FLOW__FLOWLINE:
			getFlowline().clear();
			getFlowline().addAll((Collection<? extends FlowLine>) newValue);
			return;
		case ArkUIModelPackage.WORK_FLOW__TYPE:
			setType((ExecuteType) newValue);
			return;
		case ArkUIModelPackage.WORK_FLOW__WORKPARAMETER:
			getWorkparameter().clear();
			getWorkparameter().addAll((Collection<? extends Parameter>) newValue);
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
		case ArkUIModelPackage.WORK_FLOW__FUNCTION:
			getFunction().clear();
			return;
		case ArkUIModelPackage.WORK_FLOW__FLOW_NAME:
			setFlowName(FLOW_NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.WORK_FLOW__FLOWLINE:
			getFlowline().clear();
			return;
		case ArkUIModelPackage.WORK_FLOW__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.WORK_FLOW__WORKPARAMETER:
			getWorkparameter().clear();
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
		case ArkUIModelPackage.WORK_FLOW__FUNCTION:
			return function != null && !function.isEmpty();
		case ArkUIModelPackage.WORK_FLOW__FLOW_NAME:
			return FLOW_NAME_EDEFAULT == null ? flowName != null : !FLOW_NAME_EDEFAULT.equals(flowName);
		case ArkUIModelPackage.WORK_FLOW__FLOWLINE:
			return flowline != null && !flowline.isEmpty();
		case ArkUIModelPackage.WORK_FLOW__TYPE:
			return type != TYPE_EDEFAULT;
		case ArkUIModelPackage.WORK_FLOW__WORKPARAMETER:
			return workparameter != null && !workparameter.isEmpty();
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
		result.append(" (flowName: ");
		result.append(flowName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //WorkFlowImpl
