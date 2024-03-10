/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextInputEvent;
import arkuimodel.arkUIModel.TextInputStyle;
import arkuimodel.arkUIModel.TextInputWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputWidgetImpl#getText <em>Text</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputWidgetImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputWidgetImpl#getController <em>Controller</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputWidgetImpl#getTextinputevent <em>Textinputevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputWidgetImpl#getTextinputstyle <em>Textinputstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextInputWidgetImpl extends WidgetImpl implements TextInputWidget {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected String controller = CONTROLLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextinputevent() <em>Textinputevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextinputevent()
	 * @generated
	 * @ordered
	 */
	protected TextInputEvent textinputevent;

	/**
	 * The cached value of the '{@link #getTextinputstyle() <em>Textinputstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextinputstyle()
	 * @generated
	 * @ordered
	 */
	protected TextInputStyle textinputstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TEXT_INPUT_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXT, oldText,
					text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_WIDGET__PLACEHOLDER,
					oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(String newController) {
		String oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_WIDGET__CONTROLLER,
					oldController, controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputEvent getTextinputevent() {
		return textinputevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextinputevent(TextInputEvent newTextinputevent, NotificationChain msgs) {
		TextInputEvent oldTextinputevent = textinputevent;
		textinputevent = newTextinputevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT, oldTextinputevent, newTextinputevent);
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
	public void setTextinputevent(TextInputEvent newTextinputevent) {
		if (newTextinputevent != textinputevent) {
			NotificationChain msgs = null;
			if (textinputevent != null)
				msgs = ((InternalEObject) textinputevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT, null, msgs);
			if (newTextinputevent != null)
				msgs = ((InternalEObject) newTextinputevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT, null, msgs);
			msgs = basicSetTextinputevent(newTextinputevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT,
					newTextinputevent, newTextinputevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputStyle getTextinputstyle() {
		return textinputstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextinputstyle(TextInputStyle newTextinputstyle, NotificationChain msgs) {
		TextInputStyle oldTextinputstyle = textinputstyle;
		textinputstyle = newTextinputstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE, oldTextinputstyle, newTextinputstyle);
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
	public void setTextinputstyle(TextInputStyle newTextinputstyle) {
		if (newTextinputstyle != textinputstyle) {
			NotificationChain msgs = null;
			if (textinputstyle != null)
				msgs = ((InternalEObject) textinputstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE, null, msgs);
			if (newTextinputstyle != null)
				msgs = ((InternalEObject) newTextinputstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE, null, msgs);
			msgs = basicSetTextinputstyle(newTextinputstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE,
					newTextinputstyle, newTextinputstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT:
			return basicSetTextinputevent(null, msgs);
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE:
			return basicSetTextinputstyle(null, msgs);
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
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXT:
			return getText();
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__PLACEHOLDER:
			return getPlaceholder();
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__CONTROLLER:
			return getController();
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT:
			return getTextinputevent();
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE:
			return getTextinputstyle();
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
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXT:
			setText((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__PLACEHOLDER:
			setPlaceholder((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__CONTROLLER:
			setController((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT:
			setTextinputevent((TextInputEvent) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE:
			setTextinputstyle((TextInputStyle) newValue);
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
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__PLACEHOLDER:
			setPlaceholder(PLACEHOLDER_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__CONTROLLER:
			setController(CONTROLLER_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT:
			setTextinputevent((TextInputEvent) null);
			return;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE:
			setTextinputstyle((TextInputStyle) null);
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
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__PLACEHOLDER:
			return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__CONTROLLER:
			return CONTROLLER_EDEFAULT == null ? controller != null : !CONTROLLER_EDEFAULT.equals(controller);
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTEVENT:
			return textinputevent != null;
		case ArkUIModelPackage.TEXT_INPUT_WIDGET__TEXTINPUTSTYLE:
			return textinputstyle != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", controller: ");
		result.append(controller);
		result.append(')');
		return result.toString();
	}

} //TextInputWidgetImpl
