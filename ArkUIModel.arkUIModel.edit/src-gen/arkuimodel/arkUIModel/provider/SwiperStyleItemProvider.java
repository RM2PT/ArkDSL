/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.SwiperStyle;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.SwiperStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwiperStyleItemProvider extends StyleClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiperStyleItemProvider(AdapterFactory adapterFactory) {
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

			addIndexPropertyDescriptor(object);
			addAutoPlayPropertyDescriptor(object);
			addIntervalPropertyDescriptor(object);
			addIndicatorPropertyDescriptor(object);
			addLoopPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addVerticalPropertyDescriptor(object);
			addItemSpacePropertyDescriptor(object);
			addDisplayModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_index_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_index_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__INDEX, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Auto Play feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoPlayPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_autoPlay_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_autoPlay_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__AUTO_PLAY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_interval_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_interval_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__INTERVAL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Indicator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndicatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_indicator_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_indicator_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__INDICATOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Loop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_loop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_loop_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__LOOP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_duration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_duration_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__DURATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vertical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_vertical_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_vertical_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__VERTICAL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Item Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_itemSpace_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_itemSpace_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__ITEM_SPACE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Display Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayModePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SwiperStyle_displayMode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SwiperStyle_displayMode_feature",
								"_UI_SwiperStyle_type"),
						ArkUIModelPackage.Literals.SWIPER_STYLE__DISPLAY_MODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SwiperStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwiperStyle"));
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
		String label = ((SwiperStyle) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_SwiperStyle_type")
				: getString("_UI_SwiperStyle_type") + " " + label;
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

		switch (notification.getFeatureID(SwiperStyle.class)) {
		case ArkUIModelPackage.SWIPER_STYLE__INDEX:
		case ArkUIModelPackage.SWIPER_STYLE__AUTO_PLAY:
		case ArkUIModelPackage.SWIPER_STYLE__INTERVAL:
		case ArkUIModelPackage.SWIPER_STYLE__INDICATOR:
		case ArkUIModelPackage.SWIPER_STYLE__LOOP:
		case ArkUIModelPackage.SWIPER_STYLE__DURATION:
		case ArkUIModelPackage.SWIPER_STYLE__VERTICAL:
		case ArkUIModelPackage.SWIPER_STYLE__ITEM_SPACE:
		case ArkUIModelPackage.SWIPER_STYLE__DISPLAY_MODE:
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
