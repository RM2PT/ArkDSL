/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.AnimationClass;
import arkuimodel.arkUIModel.AnimationLibray;
import arkuimodel.arkUIModel.ArkUIModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation Libray</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.AnimationLibrayImpl#getAnimationclass <em>Animationclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnimationLibrayImpl extends MinimalEObjectImpl.Container implements AnimationLibray {
	/**
	 * The cached value of the '{@link #getAnimationclass() <em>Animationclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationclass()
	 * @generated
	 * @ordered
	 */
	protected EList<AnimationClass> animationclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationLibrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.ANIMATION_LIBRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnimationClass> getAnimationclass() {
		if (animationclass == null) {
			animationclass = new EObjectContainmentEList<AnimationClass>(AnimationClass.class, this,
					ArkUIModelPackage.ANIMATION_LIBRAY__ANIMATIONCLASS);
		}
		return animationclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.ANIMATION_LIBRAY__ANIMATIONCLASS:
			return ((InternalEList<?>) getAnimationclass()).basicRemove(otherEnd, msgs);
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
		case ArkUIModelPackage.ANIMATION_LIBRAY__ANIMATIONCLASS:
			return getAnimationclass();
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
		case ArkUIModelPackage.ANIMATION_LIBRAY__ANIMATIONCLASS:
			getAnimationclass().clear();
			getAnimationclass().addAll((Collection<? extends AnimationClass>) newValue);
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
		case ArkUIModelPackage.ANIMATION_LIBRAY__ANIMATIONCLASS:
			getAnimationclass().clear();
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
		case ArkUIModelPackage.ANIMATION_LIBRAY__ANIMATIONCLASS:
			return animationclass != null && !animationclass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnimationLibrayImpl
