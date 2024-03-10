/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ButtonEvent;
import arkuimodel.arkUIModel.ButtonStyle;
import arkuimodel.arkUIModel.ButtonWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ButtonWidgetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ButtonWidgetImpl#getStateEffect <em>State Effect</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ButtonWidgetImpl#getType <em>Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ButtonWidgetImpl#getButtonevent <em>Buttonevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ButtonWidgetImpl#getButtonstyle <em>Buttonstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonWidgetImpl extends WidgetImpl implements ButtonWidget {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateEffect() <em>State Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateEffect() <em>State Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateEffect()
	 * @generated
	 * @ordered
	 */
	protected String stateEffect = STATE_EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getButtonevent() <em>Buttonevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonevent()
	 * @generated
	 * @ordered
	 */
	protected ButtonEvent buttonevent;

	/**
	 * The cached value of the '{@link #getButtonstyle() <em>Buttonstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonstyle()
	 * @generated
	 * @ordered
	 */
	protected ButtonStyle buttonstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.BUTTON_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.BUTTON_WIDGET__LABEL, oldLabel,
					label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateEffect() {
		return stateEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateEffect(String newStateEffect) {
		String oldStateEffect = stateEffect;
		stateEffect = newStateEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.BUTTON_WIDGET__STATE_EFFECT,
					oldStateEffect, stateEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.BUTTON_WIDGET__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonEvent getButtonevent() {
		return buttonevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetButtonevent(ButtonEvent newButtonevent, NotificationChain msgs) {
		ButtonEvent oldButtonevent = buttonevent;
		buttonevent = newButtonevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT, oldButtonevent, newButtonevent);
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
	public void setButtonevent(ButtonEvent newButtonevent) {
		if (newButtonevent != buttonevent) {
			NotificationChain msgs = null;
			if (buttonevent != null)
				msgs = ((InternalEObject) buttonevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT, null, msgs);
			if (newButtonevent != null)
				msgs = ((InternalEObject) newButtonevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT, null, msgs);
			msgs = basicSetButtonevent(newButtonevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT,
					newButtonevent, newButtonevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonStyle getButtonstyle() {
		return buttonstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetButtonstyle(ButtonStyle newButtonstyle, NotificationChain msgs) {
		ButtonStyle oldButtonstyle = buttonstyle;
		buttonstyle = newButtonstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE, oldButtonstyle, newButtonstyle);
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
	public void setButtonstyle(ButtonStyle newButtonstyle) {
		if (newButtonstyle != buttonstyle) {
			NotificationChain msgs = null;
			if (buttonstyle != null)
				msgs = ((InternalEObject) buttonstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE, null, msgs);
			if (newButtonstyle != null)
				msgs = ((InternalEObject) newButtonstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE, null, msgs);
			msgs = basicSetButtonstyle(newButtonstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE,
					newButtonstyle, newButtonstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT:
			return basicSetButtonevent(null, msgs);
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE:
			return basicSetButtonstyle(null, msgs);
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
		case ArkUIModelPackage.BUTTON_WIDGET__LABEL:
			return getLabel();
		case ArkUIModelPackage.BUTTON_WIDGET__STATE_EFFECT:
			return getStateEffect();
		case ArkUIModelPackage.BUTTON_WIDGET__TYPE:
			return getType();
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT:
			return getButtonevent();
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE:
			return getButtonstyle();
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
		case ArkUIModelPackage.BUTTON_WIDGET__LABEL:
			setLabel((String) newValue);
			return;
		case ArkUIModelPackage.BUTTON_WIDGET__STATE_EFFECT:
			setStateEffect((String) newValue);
			return;
		case ArkUIModelPackage.BUTTON_WIDGET__TYPE:
			setType((String) newValue);
			return;
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT:
			setButtonevent((ButtonEvent) newValue);
			return;
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE:
			setButtonstyle((ButtonStyle) newValue);
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
		case ArkUIModelPackage.BUTTON_WIDGET__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case ArkUIModelPackage.BUTTON_WIDGET__STATE_EFFECT:
			setStateEffect(STATE_EFFECT_EDEFAULT);
			return;
		case ArkUIModelPackage.BUTTON_WIDGET__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT:
			setButtonevent((ButtonEvent) null);
			return;
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE:
			setButtonstyle((ButtonStyle) null);
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
		case ArkUIModelPackage.BUTTON_WIDGET__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case ArkUIModelPackage.BUTTON_WIDGET__STATE_EFFECT:
			return STATE_EFFECT_EDEFAULT == null ? stateEffect != null : !STATE_EFFECT_EDEFAULT.equals(stateEffect);
		case ArkUIModelPackage.BUTTON_WIDGET__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONEVENT:
			return buttonevent != null;
		case ArkUIModelPackage.BUTTON_WIDGET__BUTTONSTYLE:
			return buttonstyle != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", stateEffect: ");
		result.append(stateEffect);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ButtonWidgetImpl
