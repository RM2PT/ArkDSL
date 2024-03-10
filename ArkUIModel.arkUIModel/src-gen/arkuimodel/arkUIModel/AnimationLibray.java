/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation Libray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.AnimationLibray#getAnimationclass <em>Animationclass</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getAnimationLibray()
 * @model
 * @generated
 */
public interface AnimationLibray extends EObject {
	/**
	 * Returns the value of the '<em><b>Animationclass</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.AnimationClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animationclass</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getAnimationLibray_Animationclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnimationClass> getAnimationclass();

} // AnimationLibray
