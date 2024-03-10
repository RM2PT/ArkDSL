/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextPickerEvent;
import arkuimodel.arkUIModel.TextPickerStyle;
import arkuimodel.arkUIModel.TextPickerWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Picker Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextPickerWidgetImpl#getTextpickerevent <em>Textpickerevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextPickerWidgetImpl#getTextpickerstyle <em>Textpickerstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextPickerWidgetImpl extends WidgetImpl implements TextPickerWidget {
	/**
	 * The cached value of the '{@link #getTextpickerevent() <em>Textpickerevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextpickerevent()
	 * @generated
	 * @ordered
	 */
	protected TextPickerEvent textpickerevent;

	/**
	 * The cached value of the '{@link #getTextpickerstyle() <em>Textpickerstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextpickerstyle()
	 * @generated
	 * @ordered
	 */
	protected TextPickerStyle textpickerstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextPickerWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TEXT_PICKER_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPickerEvent getTextpickerevent() {
		return textpickerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextpickerevent(TextPickerEvent newTextpickerevent, NotificationChain msgs) {
		TextPickerEvent oldTextpickerevent = textpickerevent;
		textpickerevent = newTextpickerevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT, oldTextpickerevent, newTextpickerevent);
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
	public void setTextpickerevent(TextPickerEvent newTextpickerevent) {
		if (newTextpickerevent != textpickerevent) {
			NotificationChain msgs = null;
			if (textpickerevent != null)
				msgs = ((InternalEObject) textpickerevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT, null, msgs);
			if (newTextpickerevent != null)
				msgs = ((InternalEObject) newTextpickerevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT, null, msgs);
			msgs = basicSetTextpickerevent(newTextpickerevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT,
					newTextpickerevent, newTextpickerevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPickerStyle getTextpickerstyle() {
		return textpickerstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextpickerstyle(TextPickerStyle newTextpickerstyle, NotificationChain msgs) {
		TextPickerStyle oldTextpickerstyle = textpickerstyle;
		textpickerstyle = newTextpickerstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE, oldTextpickerstyle, newTextpickerstyle);
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
	public void setTextpickerstyle(TextPickerStyle newTextpickerstyle) {
		if (newTextpickerstyle != textpickerstyle) {
			NotificationChain msgs = null;
			if (textpickerstyle != null)
				msgs = ((InternalEObject) textpickerstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE, null, msgs);
			if (newTextpickerstyle != null)
				msgs = ((InternalEObject) newTextpickerstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE, null, msgs);
			msgs = basicSetTextpickerstyle(newTextpickerstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE,
					newTextpickerstyle, newTextpickerstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT:
			return basicSetTextpickerevent(null, msgs);
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE:
			return basicSetTextpickerstyle(null, msgs);
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
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT:
			return getTextpickerevent();
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE:
			return getTextpickerstyle();
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
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT:
			setTextpickerevent((TextPickerEvent) newValue);
			return;
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE:
			setTextpickerstyle((TextPickerStyle) newValue);
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
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT:
			setTextpickerevent((TextPickerEvent) null);
			return;
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE:
			setTextpickerstyle((TextPickerStyle) null);
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
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKEREVENT:
			return textpickerevent != null;
		case ArkUIModelPackage.TEXT_PICKER_WIDGET__TEXTPICKERSTYLE:
			return textpickerstyle != null;
		}
		return super.eIsSet(featureID);
	}

} //TextPickerWidgetImpl
