/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextEvent;
import arkuimodel.arkUIModel.TextStyle;
import arkuimodel.arkUIModel.TextWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextWidgetImpl#getContent <em>Content</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextWidgetImpl#getTextevent <em>Textevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextWidgetImpl#getTextstyle <em>Textstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextWidgetImpl extends WidgetImpl implements TextWidget {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextevent() <em>Textevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextevent()
	 * @generated
	 * @ordered
	 */
	protected TextEvent textevent;

	/**
	 * The cached value of the '{@link #getTextstyle() <em>Textstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextstyle()
	 * @generated
	 * @ordered
	 */
	protected TextStyle textstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TEXT_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_WIDGET__CONTENT, oldContent,
					content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextEvent getTextevent() {
		return textevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextevent(TextEvent newTextevent, NotificationChain msgs) {
		TextEvent oldTextevent = textevent;
		textevent = newTextevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT, oldTextevent, newTextevent);
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
	public void setTextevent(TextEvent newTextevent) {
		if (newTextevent != textevent) {
			NotificationChain msgs = null;
			if (textevent != null)
				msgs = ((InternalEObject) textevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT, null, msgs);
			if (newTextevent != null)
				msgs = ((InternalEObject) newTextevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT, null, msgs);
			msgs = basicSetTextevent(newTextevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT,
					newTextevent, newTextevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyle getTextstyle() {
		return textstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextstyle(TextStyle newTextstyle, NotificationChain msgs) {
		TextStyle oldTextstyle = textstyle;
		textstyle = newTextstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE, oldTextstyle, newTextstyle);
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
	public void setTextstyle(TextStyle newTextstyle) {
		if (newTextstyle != textstyle) {
			NotificationChain msgs = null;
			if (textstyle != null)
				msgs = ((InternalEObject) textstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE, null, msgs);
			if (newTextstyle != null)
				msgs = ((InternalEObject) newTextstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE, null, msgs);
			msgs = basicSetTextstyle(newTextstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE,
					newTextstyle, newTextstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT:
			return basicSetTextevent(null, msgs);
		case ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE:
			return basicSetTextstyle(null, msgs);
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
		case ArkUIModelPackage.TEXT_WIDGET__CONTENT:
			return getContent();
		case ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT:
			return getTextevent();
		case ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE:
			return getTextstyle();
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
		case ArkUIModelPackage.TEXT_WIDGET__CONTENT:
			setContent((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT:
			setTextevent((TextEvent) newValue);
			return;
		case ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE:
			setTextstyle((TextStyle) newValue);
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
		case ArkUIModelPackage.TEXT_WIDGET__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT:
			setTextevent((TextEvent) null);
			return;
		case ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE:
			setTextstyle((TextStyle) null);
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
		case ArkUIModelPackage.TEXT_WIDGET__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case ArkUIModelPackage.TEXT_WIDGET__TEXTEVENT:
			return textevent != null;
		case ArkUIModelPackage.TEXT_WIDGET__TEXTSTYLE:
			return textstyle != null;
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
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //TextWidgetImpl
