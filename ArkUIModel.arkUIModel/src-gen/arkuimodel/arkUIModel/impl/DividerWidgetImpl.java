/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.DividerStyle;
import arkuimodel.arkUIModel.DividerWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Divider Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.DividerWidgetImpl#getDividerstyle <em>Dividerstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DividerWidgetImpl extends WidgetImpl implements DividerWidget {
	/**
	 * The cached value of the '{@link #getDividerstyle() <em>Dividerstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerstyle()
	 * @generated
	 * @ordered
	 */
	protected DividerStyle dividerstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DividerWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.DIVIDER_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DividerStyle getDividerstyle() {
		return dividerstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDividerstyle(DividerStyle newDividerstyle, NotificationChain msgs) {
		DividerStyle oldDividerstyle = dividerstyle;
		dividerstyle = newDividerstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE, oldDividerstyle, newDividerstyle);
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
	public void setDividerstyle(DividerStyle newDividerstyle) {
		if (newDividerstyle != dividerstyle) {
			NotificationChain msgs = null;
			if (dividerstyle != null)
				msgs = ((InternalEObject) dividerstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE, null, msgs);
			if (newDividerstyle != null)
				msgs = ((InternalEObject) newDividerstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE, null, msgs);
			msgs = basicSetDividerstyle(newDividerstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE,
					newDividerstyle, newDividerstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE:
			return basicSetDividerstyle(null, msgs);
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
		case ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE:
			return getDividerstyle();
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
		case ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE:
			setDividerstyle((DividerStyle) newValue);
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
		case ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE:
			setDividerstyle((DividerStyle) null);
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
		case ArkUIModelPackage.DIVIDER_WIDGET__DIVIDERSTYLE:
			return dividerstyle != null;
		}
		return super.eIsSet(featureID);
	}

} //DividerWidgetImpl
