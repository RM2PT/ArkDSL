/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.Parameter;
import arkuimodel.arkUIModel.PrimitiveOperation;

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
 * An implementation of the model object '<em><b>Primitive Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.PrimitiveOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PrimitiveOperationImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PrimitiveOperationImpl#getReturntype <em>Returntype</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PrimitiveOperationImpl extends MinimalEObjectImpl.Container implements PrimitiveOperation {
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
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> contains;

	/**
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected Parameter returntype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.PRIMITIVE_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PRIMITIVE_OPERATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					ArkUIModelPackage.PRIMITIVE_OPERATION__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReturntype() {
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturntype(Parameter newReturntype, NotificationChain msgs) {
		Parameter oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE, oldReturntype, newReturntype);
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
	public void setReturntype(Parameter newReturntype) {
		if (newReturntype != returntype) {
			NotificationChain msgs = null;
			if (returntype != null)
				msgs = ((InternalEObject) returntype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE, null, msgs);
			if (newReturntype != null)
				msgs = ((InternalEObject) newReturntype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE, null, msgs);
			msgs = basicSetReturntype(newReturntype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE,
					newReturntype, newReturntype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.PRIMITIVE_OPERATION__CONTAINS:
			return ((InternalEList<?>) getContains()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE:
			return basicSetReturntype(null, msgs);
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
		case ArkUIModelPackage.PRIMITIVE_OPERATION__NAME:
			return getName();
		case ArkUIModelPackage.PRIMITIVE_OPERATION__CONTAINS:
			return getContains();
		case ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE:
			return getReturntype();
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
		case ArkUIModelPackage.PRIMITIVE_OPERATION__NAME:
			setName((String) newValue);
			return;
		case ArkUIModelPackage.PRIMITIVE_OPERATION__CONTAINS:
			getContains().clear();
			getContains().addAll((Collection<? extends Parameter>) newValue);
			return;
		case ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE:
			setReturntype((Parameter) newValue);
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
		case ArkUIModelPackage.PRIMITIVE_OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.PRIMITIVE_OPERATION__CONTAINS:
			getContains().clear();
			return;
		case ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE:
			setReturntype((Parameter) null);
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
		case ArkUIModelPackage.PRIMITIVE_OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArkUIModelPackage.PRIMITIVE_OPERATION__CONTAINS:
			return contains != null && !contains.isEmpty();
		case ArkUIModelPackage.PRIMITIVE_OPERATION__RETURNTYPE:
			return returntype != null;
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

} //PrimitiveOperationImpl
