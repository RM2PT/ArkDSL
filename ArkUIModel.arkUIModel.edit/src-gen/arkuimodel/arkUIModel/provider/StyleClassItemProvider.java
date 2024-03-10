/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.StyleClass;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.StyleClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StyleClassItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleClassItemProvider(AdapterFactory adapterFactory) {
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

			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addAspectRatioPropertyDescriptor(object);
			addPaddingleftPropertyDescriptor(object);
			addMarginleftPropertyDescriptor(object);
			addLayoutWeightPropertyDescriptor(object);
			addAlignPropertyDescriptor(object);
			addDirectionPropertyDescriptor(object);
			addPositionPropertyDescriptor(object);
			addOffsetPropertyDescriptor(object);
			addBackgroundColorPropertyDescriptor(object);
			addBackgroundImagePropertyDescriptor(object);
			addBorderPropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addAnimationclassPropertyDescriptor(object);
			addAssignPropertyDescriptor(object);
			addPaddingrightPropertyDescriptor(object);
			addPaddingtopPropertyDescriptor(object);
			addPaddingbottomPropertyDescriptor(object);
			addMarginrightPropertyDescriptor(object);
			addMargintopPropertyDescriptor(object);
			addMarginbottomPropertyDescriptor(object);
			addBorderRadiusPropertyDescriptor(object);
			addBackgroundImageSizePropertyDescriptor(object);
			addRotatePropertyDescriptor(object);
			addZIndexPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_width_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_width_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__WIDTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_height_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_height_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__HEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Aspect Ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAspectRatioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_aspectRatio_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_aspectRatio_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__ASPECT_RATIO, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Paddingleft feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaddingleftPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_paddingleft_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_paddingleft_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__PADDINGLEFT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Marginleft feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarginleftPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_marginleft_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_marginleft_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__MARGINLEFT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Layout Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_layoutWeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_layoutWeight_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__LAYOUT_WEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Align feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlignPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_align_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_align_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__ALIGN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_direction_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_direction_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__DIRECTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_position_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_position_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__POSITION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_offset_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_offset_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__OFFSET, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Background Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_backgroundColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_backgroundColor_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__BACKGROUND_COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Background Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_backgroundImage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_backgroundImage_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__BACKGROUND_IMAGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Border feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_border_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_border_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__BORDER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_visibility_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_visibility_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__VISIBILITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_name_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Animationclass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnimationclassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_animationclass_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_animationclass_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__ANIMATIONCLASS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Assign feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_assign_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_assign_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__ASSIGN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Paddingright feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaddingrightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_paddingright_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_paddingright_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__PADDINGRIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Paddingtop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaddingtopPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_paddingtop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_paddingtop_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__PADDINGTOP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Paddingbottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaddingbottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_paddingbottom_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_paddingbottom_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__PADDINGBOTTOM, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Marginright feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarginrightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_marginright_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_marginright_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__MARGINRIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Margintop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMargintopPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_margintop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_margintop_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__MARGINTOP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Marginbottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarginbottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_marginbottom_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_marginbottom_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__MARGINBOTTOM, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Border Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_borderRadius_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_borderRadius_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__BORDER_RADIUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Background Image Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundImageSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_backgroundImageSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_backgroundImageSize_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__BACKGROUND_IMAGE_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rotate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_rotate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_rotate_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__ROTATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the ZIndex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StyleClass_zIndex_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleClass_zIndex_feature",
								"_UI_StyleClass_type"),
						ArkUIModelPackage.Literals.STYLE_CLASS__ZINDEX, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns StyleClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StyleClass"));
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
		String label = ((StyleClass) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_StyleClass_type")
				: getString("_UI_StyleClass_type") + " " + label;
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

		switch (notification.getFeatureID(StyleClass.class)) {
		case ArkUIModelPackage.STYLE_CLASS__WIDTH:
		case ArkUIModelPackage.STYLE_CLASS__HEIGHT:
		case ArkUIModelPackage.STYLE_CLASS__ASPECT_RATIO:
		case ArkUIModelPackage.STYLE_CLASS__PADDINGLEFT:
		case ArkUIModelPackage.STYLE_CLASS__MARGINLEFT:
		case ArkUIModelPackage.STYLE_CLASS__LAYOUT_WEIGHT:
		case ArkUIModelPackage.STYLE_CLASS__ALIGN:
		case ArkUIModelPackage.STYLE_CLASS__DIRECTION:
		case ArkUIModelPackage.STYLE_CLASS__POSITION:
		case ArkUIModelPackage.STYLE_CLASS__OFFSET:
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_COLOR:
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE:
		case ArkUIModelPackage.STYLE_CLASS__BORDER:
		case ArkUIModelPackage.STYLE_CLASS__VISIBILITY:
		case ArkUIModelPackage.STYLE_CLASS__NAME:
		case ArkUIModelPackage.STYLE_CLASS__ASSIGN:
		case ArkUIModelPackage.STYLE_CLASS__PADDINGRIGHT:
		case ArkUIModelPackage.STYLE_CLASS__PADDINGTOP:
		case ArkUIModelPackage.STYLE_CLASS__PADDINGBOTTOM:
		case ArkUIModelPackage.STYLE_CLASS__MARGINRIGHT:
		case ArkUIModelPackage.STYLE_CLASS__MARGINTOP:
		case ArkUIModelPackage.STYLE_CLASS__MARGINBOTTOM:
		case ArkUIModelPackage.STYLE_CLASS__BORDER_RADIUS:
		case ArkUIModelPackage.STYLE_CLASS__BACKGROUND_IMAGE_SIZE:
		case ArkUIModelPackage.STYLE_CLASS__ROTATE:
		case ArkUIModelPackage.STYLE_CLASS__ZINDEX:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArkUIModelEditPlugin.INSTANCE;
	}

}
