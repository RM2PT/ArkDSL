/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ImageEvent;
import arkuimodel.arkUIModel.ImageStyle;
import arkuimodel.arkUIModel.ImageWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageWidgetImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageWidgetImpl#getImageevent <em>Imageevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageWidgetImpl#getImagestyle <em>Imagestyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageWidgetImpl extends WidgetImpl implements ImageWidget {
	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImageevent() <em>Imageevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageevent()
	 * @generated
	 * @ordered
	 */
	protected ImageEvent imageevent;

	/**
	 * The cached value of the '{@link #getImagestyle() <em>Imagestyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagestyle()
	 * @generated
	 * @ordered
	 */
	protected ImageStyle imagestyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.IMAGE_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_WIDGET__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageEvent getImageevent() {
		return imageevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageevent(ImageEvent newImageevent, NotificationChain msgs) {
		ImageEvent oldImageevent = imageevent;
		imageevent = newImageevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT, oldImageevent, newImageevent);
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
	public void setImageevent(ImageEvent newImageevent) {
		if (newImageevent != imageevent) {
			NotificationChain msgs = null;
			if (imageevent != null)
				msgs = ((InternalEObject) imageevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT, null, msgs);
			if (newImageevent != null)
				msgs = ((InternalEObject) newImageevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT, null, msgs);
			msgs = basicSetImageevent(newImageevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT,
					newImageevent, newImageevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageStyle getImagestyle() {
		return imagestyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagestyle(ImageStyle newImagestyle, NotificationChain msgs) {
		ImageStyle oldImagestyle = imagestyle;
		imagestyle = newImagestyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE, oldImagestyle, newImagestyle);
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
	public void setImagestyle(ImageStyle newImagestyle) {
		if (newImagestyle != imagestyle) {
			NotificationChain msgs = null;
			if (imagestyle != null)
				msgs = ((InternalEObject) imagestyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE, null, msgs);
			if (newImagestyle != null)
				msgs = ((InternalEObject) newImagestyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE, null, msgs);
			msgs = basicSetImagestyle(newImagestyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE,
					newImagestyle, newImagestyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT:
			return basicSetImageevent(null, msgs);
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE:
			return basicSetImagestyle(null, msgs);
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
		case ArkUIModelPackage.IMAGE_WIDGET__SRC:
			return getSrc();
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT:
			return getImageevent();
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE:
			return getImagestyle();
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
		case ArkUIModelPackage.IMAGE_WIDGET__SRC:
			setSrc((String) newValue);
			return;
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT:
			setImageevent((ImageEvent) newValue);
			return;
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE:
			setImagestyle((ImageStyle) newValue);
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
		case ArkUIModelPackage.IMAGE_WIDGET__SRC:
			setSrc(SRC_EDEFAULT);
			return;
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT:
			setImageevent((ImageEvent) null);
			return;
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE:
			setImagestyle((ImageStyle) null);
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
		case ArkUIModelPackage.IMAGE_WIDGET__SRC:
			return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGEEVENT:
			return imageevent != null;
		case ArkUIModelPackage.IMAGE_WIDGET__IMAGESTYLE:
			return imagestyle != null;
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
		result.append(" (src: ");
		result.append(src);
		result.append(')');
		return result.toString();
	}

} //ImageWidgetImpl
