/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ImageAnimator;
import arkuimodel.arkUIModel.ImageAnimatorEvent;
import arkuimodel.arkUIModel.ImageAnimatorStyle;
import arkuimodel.arkUIModel.ImagesItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Animator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorImpl#getImagesitem <em>Imagesitem</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorImpl#getImageanimatorevent <em>Imageanimatorevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ImageAnimatorImpl#getImageanimatorstyle <em>Imageanimatorstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageAnimatorImpl extends WidgetImpl implements ImageAnimator {
	/**
	 * The cached value of the '{@link #getImagesitem() <em>Imagesitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagesitem()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagesItem> imagesitem;

	/**
	 * The cached value of the '{@link #getImageanimatorevent() <em>Imageanimatorevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageanimatorevent()
	 * @generated
	 * @ordered
	 */
	protected ImageAnimatorEvent imageanimatorevent;

	/**
	 * The cached value of the '{@link #getImageanimatorstyle() <em>Imageanimatorstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageanimatorstyle()
	 * @generated
	 * @ordered
	 */
	protected ImageAnimatorStyle imageanimatorstyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageAnimatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.IMAGE_ANIMATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagesItem> getImagesitem() {
		if (imagesitem == null) {
			imagesitem = new EObjectContainmentEList<ImagesItem>(ImagesItem.class, this,
					ArkUIModelPackage.IMAGE_ANIMATOR__IMAGESITEM);
		}
		return imagesitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAnimatorEvent getImageanimatorevent() {
		return imageanimatorevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageanimatorevent(ImageAnimatorEvent newImageanimatorevent,
			NotificationChain msgs) {
		ImageAnimatorEvent oldImageanimatorevent = imageanimatorevent;
		imageanimatorevent = newImageanimatorevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT, oldImageanimatorevent, newImageanimatorevent);
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
	public void setImageanimatorevent(ImageAnimatorEvent newImageanimatorevent) {
		if (newImageanimatorevent != imageanimatorevent) {
			NotificationChain msgs = null;
			if (imageanimatorevent != null)
				msgs = ((InternalEObject) imageanimatorevent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT, null, msgs);
			if (newImageanimatorevent != null)
				msgs = ((InternalEObject) newImageanimatorevent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT, null, msgs);
			msgs = basicSetImageanimatorevent(newImageanimatorevent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT,
					newImageanimatorevent, newImageanimatorevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAnimatorStyle getImageanimatorstyle() {
		return imageanimatorstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageanimatorstyle(ImageAnimatorStyle newImageanimatorstyle,
			NotificationChain msgs) {
		ImageAnimatorStyle oldImageanimatorstyle = imageanimatorstyle;
		imageanimatorstyle = newImageanimatorstyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE, oldImageanimatorstyle, newImageanimatorstyle);
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
	public void setImageanimatorstyle(ImageAnimatorStyle newImageanimatorstyle) {
		if (newImageanimatorstyle != imageanimatorstyle) {
			NotificationChain msgs = null;
			if (imageanimatorstyle != null)
				msgs = ((InternalEObject) imageanimatorstyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE, null, msgs);
			if (newImageanimatorstyle != null)
				msgs = ((InternalEObject) newImageanimatorstyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE, null, msgs);
			msgs = basicSetImageanimatorstyle(newImageanimatorstyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE,
					newImageanimatorstyle, newImageanimatorstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGESITEM:
			return ((InternalEList<?>) getImagesitem()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT:
			return basicSetImageanimatorevent(null, msgs);
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE:
			return basicSetImageanimatorstyle(null, msgs);
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
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGESITEM:
			return getImagesitem();
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT:
			return getImageanimatorevent();
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE:
			return getImageanimatorstyle();
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
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGESITEM:
			getImagesitem().clear();
			getImagesitem().addAll((Collection<? extends ImagesItem>) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT:
			setImageanimatorevent((ImageAnimatorEvent) newValue);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE:
			setImageanimatorstyle((ImageAnimatorStyle) newValue);
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
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGESITEM:
			getImagesitem().clear();
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT:
			setImageanimatorevent((ImageAnimatorEvent) null);
			return;
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE:
			setImageanimatorstyle((ImageAnimatorStyle) null);
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
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGESITEM:
			return imagesitem != null && !imagesitem.isEmpty();
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATOREVENT:
			return imageanimatorevent != null;
		case ArkUIModelPackage.IMAGE_ANIMATOR__IMAGEANIMATORSTYLE:
			return imageanimatorstyle != null;
		}
		return super.eIsSet(featureID);
	}

} //ImageAnimatorImpl
