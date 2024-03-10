/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Animator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.ImageAnimator#getImagesitem <em>Imagesitem</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ImageAnimator#getImageanimatorevent <em>Imageanimatorevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.ImageAnimator#getImageanimatorstyle <em>Imageanimatorstyle</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageAnimator()
 * @model
 * @generated
 */
public interface ImageAnimator extends Widget {
	/**
	 * Returns the value of the '<em><b>Imagesitem</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.ImagesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagesitem</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageAnimator_Imagesitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImagesItem> getImagesitem();

	/**
	 * Returns the value of the '<em><b>Imageanimatorevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageanimatorevent</em>' containment reference.
	 * @see #setImageanimatorevent(ImageAnimatorEvent)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageAnimator_Imageanimatorevent()
	 * @model containment="true"
	 * @generated
	 */
	ImageAnimatorEvent getImageanimatorevent();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ImageAnimator#getImageanimatorevent <em>Imageanimatorevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imageanimatorevent</em>' containment reference.
	 * @see #getImageanimatorevent()
	 * @generated
	 */
	void setImageanimatorevent(ImageAnimatorEvent value);

	/**
	 * Returns the value of the '<em><b>Imageanimatorstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageanimatorstyle</em>' containment reference.
	 * @see #setImageanimatorstyle(ImageAnimatorStyle)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getImageAnimator_Imageanimatorstyle()
	 * @model containment="true"
	 * @generated
	 */
	ImageAnimatorStyle getImageanimatorstyle();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.ImageAnimator#getImageanimatorstyle <em>Imageanimatorstyle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imageanimatorstyle</em>' containment reference.
	 * @see #getImageanimatorstyle()
	 * @generated
	 */
	void setImageanimatorstyle(ImageAnimatorStyle value);

} // ImageAnimator
