/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ForEach;
import arkuimodel.arkUIModel.IF;
import arkuimodel.arkUIModel.PageEvent;
import arkuimodel.arkUIModel.PageRefrence;
import arkuimodel.arkUIModel.Parameter;

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
 * An implementation of the model object '<em><b>Page Refrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageRefrenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageRefrenceImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageRefrenceImpl#getIf <em>If</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageRefrenceImpl#getForeach <em>Foreach</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.PageRefrenceImpl#getPageevent <em>Pageevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageRefrenceImpl extends MinimalEObjectImpl.Container implements PageRefrence {
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
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

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
	 * The cached value of the '{@link #getForeach() <em>Foreach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeach()
	 * @generated
	 * @ordered
	 */
	protected ForEach foreach;

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
	protected PageRefrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.PAGE_REFRENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_REFRENCE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					ArkUIModelPackage.PAGE_REFRENCE__PARAMETER);
		}
		return parameter;
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
					ArkUIModelPackage.PAGE_REFRENCE__IF, oldIf, newIf);
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
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PAGE_REFRENCE__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PAGE_REFRENCE__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_REFRENCE__IF, newIf, newIf));
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
					ArkUIModelPackage.PAGE_REFRENCE__FOREACH, oldForeach, newForeach);
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
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PAGE_REFRENCE__FOREACH, null, msgs);
			if (newForeach != null)
				msgs = ((InternalEObject) newForeach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PAGE_REFRENCE__FOREACH, null, msgs);
			msgs = basicSetForeach(newForeach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_REFRENCE__FOREACH, newForeach,
					newForeach));
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
					ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT, oldPageevent, newPageevent);
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
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT, null, msgs);
			if (newPageevent != null)
				msgs = ((InternalEObject) newPageevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT, null, msgs);
			msgs = basicSetPageevent(newPageevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT,
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
		case ArkUIModelPackage.PAGE_REFRENCE__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.PAGE_REFRENCE__IF:
			return basicSetIf(null, msgs);
		case ArkUIModelPackage.PAGE_REFRENCE__FOREACH:
			return basicSetForeach(null, msgs);
		case ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT:
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
		case ArkUIModelPackage.PAGE_REFRENCE__NAME:
			return getName();
		case ArkUIModelPackage.PAGE_REFRENCE__PARAMETER:
			return getParameter();
		case ArkUIModelPackage.PAGE_REFRENCE__IF:
			return getIf();
		case ArkUIModelPackage.PAGE_REFRENCE__FOREACH:
			return getForeach();
		case ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT:
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
		case ArkUIModelPackage.PAGE_REFRENCE__NAME:
			setName((String) newValue);
			return;
		case ArkUIModelPackage.PAGE_REFRENCE__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		case ArkUIModelPackage.PAGE_REFRENCE__IF:
			setIf((IF) newValue);
			return;
		case ArkUIModelPackage.PAGE_REFRENCE__FOREACH:
			setForeach((ForEach) newValue);
			return;
		case ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT:
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
		case ArkUIModelPackage.PAGE_REFRENCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.PAGE_REFRENCE__PARAMETER:
			getParameter().clear();
			return;
		case ArkUIModelPackage.PAGE_REFRENCE__IF:
			setIf((IF) null);
			return;
		case ArkUIModelPackage.PAGE_REFRENCE__FOREACH:
			setForeach((ForEach) null);
			return;
		case ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT:
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
		case ArkUIModelPackage.PAGE_REFRENCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArkUIModelPackage.PAGE_REFRENCE__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case ArkUIModelPackage.PAGE_REFRENCE__IF:
			return if_ != null;
		case ArkUIModelPackage.PAGE_REFRENCE__FOREACH:
			return foreach != null;
		case ArkUIModelPackage.PAGE_REFRENCE__PAGEEVENT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PageRefrenceImpl
