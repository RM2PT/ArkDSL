/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.DomainModel;
import arkuimodel.arkUIModel.OperationLibray;
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
 * An implementation of the model object '<em><b>Operation Libray</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.OperationLibrayImpl#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.OperationLibrayImpl#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.OperationLibrayImpl#getProjectparameters <em>Projectparameters</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.OperationLibrayImpl#getDomainmodel <em>Domainmodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationLibrayImpl extends MinimalEObjectImpl.Container implements OperationLibray {
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
	 * The cached value of the '{@link #getWorkflows() <em>Workflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflows()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkFlow> workflows;

	/**
	 * The cached value of the '{@link #getProjectparameters() <em>Projectparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> projectparameters;

	/**
	 * The cached value of the '{@link #getDomainmodel() <em>Domainmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainmodel()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domainmodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationLibrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.OPERATION_LIBRAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.OPERATION_LIBRAY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkFlow> getWorkflows() {
		if (workflows == null) {
			workflows = new EObjectContainmentEList<WorkFlow>(WorkFlow.class, this,
					ArkUIModelPackage.OPERATION_LIBRAY__WORKFLOWS);
		}
		return workflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getProjectparameters() {
		if (projectparameters == null) {
			projectparameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					ArkUIModelPackage.OPERATION_LIBRAY__PROJECTPARAMETERS);
		}
		return projectparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getDomainmodel() {
		return domainmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainmodel(DomainModel newDomainmodel, NotificationChain msgs) {
		DomainModel oldDomainmodel = domainmodel;
		domainmodel = newDomainmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL, oldDomainmodel, newDomainmodel);
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
	public void setDomainmodel(DomainModel newDomainmodel) {
		if (newDomainmodel != domainmodel) {
			NotificationChain msgs = null;
			if (domainmodel != null)
				msgs = ((InternalEObject) domainmodel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL, null, msgs);
			if (newDomainmodel != null)
				msgs = ((InternalEObject) newDomainmodel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL, null, msgs);
			msgs = basicSetDomainmodel(newDomainmodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL,
					newDomainmodel, newDomainmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.OPERATION_LIBRAY__WORKFLOWS:
			return ((InternalEList<?>) getWorkflows()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.OPERATION_LIBRAY__PROJECTPARAMETERS:
			return ((InternalEList<?>) getProjectparameters()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL:
			return basicSetDomainmodel(null, msgs);
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
		case ArkUIModelPackage.OPERATION_LIBRAY__NAME:
			return getName();
		case ArkUIModelPackage.OPERATION_LIBRAY__WORKFLOWS:
			return getWorkflows();
		case ArkUIModelPackage.OPERATION_LIBRAY__PROJECTPARAMETERS:
			return getProjectparameters();
		case ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL:
			return getDomainmodel();
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
		case ArkUIModelPackage.OPERATION_LIBRAY__NAME:
			setName((String) newValue);
			return;
		case ArkUIModelPackage.OPERATION_LIBRAY__WORKFLOWS:
			getWorkflows().clear();
			getWorkflows().addAll((Collection<? extends WorkFlow>) newValue);
			return;
		case ArkUIModelPackage.OPERATION_LIBRAY__PROJECTPARAMETERS:
			getProjectparameters().clear();
			getProjectparameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL:
			setDomainmodel((DomainModel) newValue);
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
		case ArkUIModelPackage.OPERATION_LIBRAY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.OPERATION_LIBRAY__WORKFLOWS:
			getWorkflows().clear();
			return;
		case ArkUIModelPackage.OPERATION_LIBRAY__PROJECTPARAMETERS:
			getProjectparameters().clear();
			return;
		case ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL:
			setDomainmodel((DomainModel) null);
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
		case ArkUIModelPackage.OPERATION_LIBRAY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArkUIModelPackage.OPERATION_LIBRAY__WORKFLOWS:
			return workflows != null && !workflows.isEmpty();
		case ArkUIModelPackage.OPERATION_LIBRAY__PROJECTPARAMETERS:
			return projectparameters != null && !projectparameters.isEmpty();
		case ArkUIModelPackage.OPERATION_LIBRAY__DOMAINMODEL:
			return domainmodel != null;
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

} //OperationLibrayImpl
