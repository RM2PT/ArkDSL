/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.StackContainer;
import arkuimodel.arkUIModel.StackEvent;
import arkuimodel.arkUIModel.StackStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.StackContainerImpl#getStackevent <em>Stackevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.StackContainerImpl#getStackstyle <em>Stackstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackContainerImpl extends ContainerImpl implements StackContainer {
	/**
	 * The cached value of the '{@link #getStackevent() <em>Stackevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackevent()
	 * @generated
	 * @ordered
	 */
	protected StackEvent stackevent;

	/**
	 * The cached value of the '{@link #getStackstyle() <em>Stackstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackstyle()
	 * @generated
	 * @ordered
	 */
	protected StackStyle stackstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.STACK_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackEvent getStackevent() {
		return stackevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStackevent(StackEvent newStackevent, NotificationChain msgs) {
		StackEvent oldStackevent = stackevent;
		stackevent = newStackevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.STACK_CONTAINER__STACKEVENT, oldStackevent, newStackevent);
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
	public void setStackevent(StackEvent newStackevent) {
		if (newStackevent != stackevent) {
			NotificationChain msgs = null;
			if (stackevent != null)
				msgs = ((InternalEObject) stackevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.STACK_CONTAINER__STACKEVENT, null, msgs);
			if (newStackevent != null)
				msgs = ((InternalEObject) newStackevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.STACK_CONTAINER__STACKEVENT, null, msgs);
			msgs = basicSetStackevent(newStackevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STACK_CONTAINER__STACKEVENT,
					newStackevent, newStackevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackStyle getStackstyle() {
		return stackstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStackstyle(StackStyle newStackstyle, NotificationChain msgs) {
		StackStyle oldStackstyle = stackstyle;
		stackstyle = newStackstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE, oldStackstyle, newStackstyle);
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
	public void setStackstyle(StackStyle newStackstyle) {
		if (newStackstyle != stackstyle) {
			NotificationChain msgs = null;
			if (stackstyle != null)
				msgs = ((InternalEObject) stackstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE, null, msgs);
			if (newStackstyle != null)
				msgs = ((InternalEObject) newStackstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE, null, msgs);
			msgs = basicSetStackstyle(newStackstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE,
					newStackstyle, newStackstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.STACK_CONTAINER__STACKEVENT:
			return basicSetStackevent(null, msgs);
		case ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE:
			return basicSetStackstyle(null, msgs);
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
		case ArkUIModelPackage.STACK_CONTAINER__STACKEVENT:
			return getStackevent();
		case ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE:
			return getStackstyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArkUIModelPackage.STACK_CONTAINER__STACKEVENT:
			setStackevent((StackEvent) newValue);
			return;
		case ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE:
			setStackstyle((StackStyle) newValue);
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
		case ArkUIModelPackage.STACK_CONTAINER__STACKEVENT:
			setStackevent((StackEvent) null);
			return;
		case ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE:
			setStackstyle((StackStyle) null);
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
		case ArkUIModelPackage.STACK_CONTAINER__STACKEVENT:
			return stackevent != null;
		case ArkUIModelPackage.STACK_CONTAINER__STACKSTYLE:
			return stackstyle != null;
		}
		return super.eIsSet(featureID);
	}

} //StackContainerImpl
