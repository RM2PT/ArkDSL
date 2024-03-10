/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ImageAnimatorStyle;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.ImageAnimatorStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageAnimatorStyleItemProvider extends StyleClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAnimatorStyleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStatePropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addReversePropertyDescriptor(object);
			addFixedSizePropertyDescriptor(object);
			addPreDecodePropertyDescriptor(object);
			addFillModePropertyDescriptor(object);
			addIterationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageAnimatorStyle_state_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageAnimatorStyle_state_feature",
								"_UI_ImageAnimatorStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_ANIMATOR_STYLE__STATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ImageAnimatorStyle_duration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ImageAnimatorStyle_duration_feature",
						"_UI_ImageAnimatorStyle_type"),
				ArkUIModelPackage.Literals.IMAGE_ANIMATOR_STYLE__DURATION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ImageAnimatorStyle_reverse_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ImageAnimatorStyle_reverse_feature",
						"_UI_ImageAnimatorStyle_type"),
				ArkUIModelPackage.Literals.IMAGE_ANIMATOR_STYLE__REVERSE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fixed Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ImageAnimatorStyle_fixedSize_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ImageAnimatorStyle_fixedSize_feature",
						"_UI_ImageAnimatorStyle_type"),
				ArkUIModelPackage.Literals.IMAGE_ANIMATOR_STYLE__FIXED_SIZE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pre Decode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreDecodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ImageAnimatorStyle_preDecode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ImageAnimatorStyle_preDecode_feature",
						"_UI_ImageAnimatorStyle_type"),
				ArkUIModelPackage.Literals.IMAGE_ANIMATOR_STYLE__PRE_DECODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fill Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ImageAnimatorStyle_fillMode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ImageAnimatorStyle_fillMode_feature",
						"_UI_ImageAnimatorStyle_type"),
				ArkUIModelPackage.Literals.IMAGE_ANIMATOR_STYLE__FILL_MODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Iterations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIterationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ImageAnimatorStyle_iterations_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ImageAnimatorStyle_iterations_feature",
						"_UI_ImageAnimatorStyle_type"),
				ArkUIModelPackage.Literals.IMAGE_ANIMATOR_STYLE__ITERATIONS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ImageAnimatorStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageAnimatorStyle"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ImageAnimatorStyle) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ImageAnimatorStyle_type")
				: getString("_UI_ImageAnimatorStyle_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ImageAnimatorStyle.class)) {
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__STATE:
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__DURATION:
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__REVERSE:
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FIXED_SIZE:
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__PRE_DECODE:
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__FILL_MODE:
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE__ITERATIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
