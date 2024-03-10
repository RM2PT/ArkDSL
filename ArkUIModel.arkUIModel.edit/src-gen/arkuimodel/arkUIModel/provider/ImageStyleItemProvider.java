/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ImageStyle;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.ImageStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageStyleItemProvider extends StyleClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageStyleItemProvider(AdapterFactory adapterFactory) {
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

			addAltPropertyDescriptor(object);
			addMatchTextDirectionPropertyDescriptor(object);
			addFitOriginalSizePropertyDescriptor(object);
			addFillColorPropertyDescriptor(object);
			addObjectFitPropertyDescriptor(object);
			addObjectRepeatPropertyDescriptor(object);
			addAutoResizePropertyDescriptor(object);
			addRenderModePropertyDescriptor(object);
			addInterpolationPropertyDescriptor(object);
			addSourceSizeHeightPropertyDescriptor(object);
			addSyncLoadPropertyDescriptor(object);
			addSourceSizeWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Alt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAltPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_alt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_alt_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__ALT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Match Text Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMatchTextDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_matchTextDirection_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_matchTextDirection_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__MATCH_TEXT_DIRECTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fit Original Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFitOriginalSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_fitOriginalSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_fitOriginalSize_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__FIT_ORIGINAL_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fill Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_fillColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_fillColor_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__FILL_COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Object Fit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectFitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_objectFit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_objectFit_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__OBJECT_FIT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Object Repeat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectRepeatPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_objectRepeat_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_objectRepeat_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__OBJECT_REPEAT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Auto Resize feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoResizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_autoResize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_autoResize_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__AUTO_RESIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Render Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRenderModePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_renderMode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_renderMode_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__RENDER_MODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Interpolation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterpolationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_interpolation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_interpolation_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__INTERPOLATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Source Size Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceSizeHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_sourceSizeHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_sourceSizeHeight_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__SOURCE_SIZE_HEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sync Load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSyncLoadPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_syncLoad_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_syncLoad_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__SYNC_LOAD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Source Size Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceSizeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ImageStyle_sourceSizeWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ImageStyle_sourceSizeWidth_feature",
								"_UI_ImageStyle_type"),
						ArkUIModelPackage.Literals.IMAGE_STYLE__SOURCE_SIZE_WIDTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ImageStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageStyle"));
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
		String label = ((ImageStyle) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ImageStyle_type")
				: getString("_UI_ImageStyle_type") + " " + label;
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

		switch (notification.getFeatureID(ImageStyle.class)) {
		case ArkUIModelPackage.IMAGE_STYLE__ALT:
		case ArkUIModelPackage.IMAGE_STYLE__MATCH_TEXT_DIRECTION:
		case ArkUIModelPackage.IMAGE_STYLE__FIT_ORIGINAL_SIZE:
		case ArkUIModelPackage.IMAGE_STYLE__FILL_COLOR:
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_FIT:
		case ArkUIModelPackage.IMAGE_STYLE__OBJECT_REPEAT:
		case ArkUIModelPackage.IMAGE_STYLE__AUTO_RESIZE:
		case ArkUIModelPackage.IMAGE_STYLE__RENDER_MODE:
		case ArkUIModelPackage.IMAGE_STYLE__INTERPOLATION:
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_HEIGHT:
		case ArkUIModelPackage.IMAGE_STYLE__SYNC_LOAD:
		case ArkUIModelPackage.IMAGE_STYLE__SOURCE_SIZE_WIDTH:
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
