/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.CustomDialogContainer;
import arkuimodel.arkUIModel.CustomDialogEvent;
import arkuimodel.arkUIModel.CustomDialogStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Dialog Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogContainerImpl#getCustomdialogstyle <em>Customdialogstyle</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.CustomDialogContainerImpl#getCustomdialogevent <em>Customdialogevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomDialogContainerImpl extends ContainerImpl implements CustomDialogContainer {
	/**
	 * The cached value of the '{@link #getCustomdialogstyle() <em>Customdialogstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomdialogstyle()
	 * @generated
	 * @ordered
	 */
	protected CustomDialogStyle customdialogstyle;

	/**
	 * The cached value of the '{@link #getCustomdialogevent() <em>Customdialogevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomdialogevent()
	 * @generated
	 * @ordered
	 */
	protected CustomDialogEvent customdialogevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomDialogContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.CUSTOM_DIALOG_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDialogStyle getCustomdialogstyle() {
		return customdialogstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomdialogstyle(CustomDialogStyle newCustomdialogstyle, NotificationChain msgs) {
		CustomDialogStyle oldCustomdialogstyle = customdialogstyle;
		customdialogstyle = newCustomdialogstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE, oldCustomdialogstyle,
					newCustomdialogstyle);
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
	public void setCustomdialogstyle(CustomDialogStyle newCustomdialogstyle) {
		if (newCustomdialogstyle != customdialogstyle) {
			NotificationChain msgs = null;
			if (customdialogstyle != null)
				msgs = ((InternalEObject) customdialogstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE, null,
						msgs);
			if (newCustomdialogstyle != null)
				msgs = ((InternalEObject) newCustomdialogstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE, null,
						msgs);
			msgs = basicSetCustomdialogstyle(newCustomdialogstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE, newCustomdialogstyle,
					newCustomdialogstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDialogEvent getCustomdialogevent() {
		return customdialogevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomdialogevent(CustomDialogEvent newCustomdialogevent, NotificationChain msgs) {
		CustomDialogEvent oldCustomdialogevent = customdialogevent;
		customdialogevent = newCustomdialogevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT, oldCustomdialogevent,
					newCustomdialogevent);
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
	public void setCustomdialogevent(CustomDialogEvent newCustomdialogevent) {
		if (newCustomdialogevent != customdialogevent) {
			NotificationChain msgs = null;
			if (customdialogevent != null)
				msgs = ((InternalEObject) customdialogevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT, null,
						msgs);
			if (newCustomdialogevent != null)
				msgs = ((InternalEObject) newCustomdialogevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT, null,
						msgs);
			msgs = basicSetCustomdialogevent(newCustomdialogevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT, newCustomdialogevent,
					newCustomdialogevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE:
			return basicSetCustomdialogstyle(null, msgs);
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT:
			return basicSetCustomdialogevent(null, msgs);
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
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE:
			return getCustomdialogstyle();
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT:
			return getCustomdialogevent();
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
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE:
			setCustomdialogstyle((CustomDialogStyle) newValue);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT:
			setCustomdialogevent((CustomDialogEvent) newValue);
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
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE:
			setCustomdialogstyle((CustomDialogStyle) null);
			return;
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT:
			setCustomdialogevent((CustomDialogEvent) null);
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
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE:
			return customdialogstyle != null;
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT:
			return customdialogevent != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomDialogContainerImpl
