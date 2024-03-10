/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ListStyle;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.ListStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListStyleItemProvider extends StyleClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyleItemProvider(AdapterFactory adapterFactory) {
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

			addListDirectionPropertyDescriptor(object);
			addEdgeEffectPropertyDescriptor(object);
			addDividerPropertyDescriptor(object);
			addEditModePropertyDescriptor(object);
			addChainAnimationPropertyDescriptor(object);
			addScrollBarPropertyDescriptor(object);
			addCachedCountPropertyDescriptor(object);
			addStrokeWidthPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addStartMarginPropertyDescriptor(object);
			addEndMarginPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the List Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_listDirection_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_listDirection_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__LIST_DIRECTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Edge Effect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgeEffectPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_edgeEffect_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_edgeEffect_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__EDGE_EFFECT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Divider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDividerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_divider_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_divider_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__DIVIDER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Edit Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditModePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_editMode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_editMode_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__EDIT_MODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Chain Animation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChainAnimationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_chainAnimation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_chainAnimation_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__CHAIN_ANIMATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scroll Bar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScrollBarPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_scrollBar_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_scrollBar_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__SCROLL_BAR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cached Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCachedCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_cachedCount_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_cachedCount_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__CACHED_COUNT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stroke Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_strokeWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_strokeWidth_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__STROKE_WIDTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_color_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_color_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Start Margin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartMarginPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_startMargin_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_startMargin_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__START_MARGIN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the End Margin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndMarginPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListStyle_endMargin_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListStyle_endMargin_feature",
								"_UI_ListStyle_type"),
						ArkUIModelPackage.Literals.LIST_STYLE__END_MARGIN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ListStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListStyle"));
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
		String label = ((ListStyle) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ListStyle_type")
				: getString("_UI_ListStyle_type") + " " + label;
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

		switch (notification.getFeatureID(ListStyle.class)) {
		case ArkUIModelPackage.LIST_STYLE__LIST_DIRECTION:
		case ArkUIModelPackage.LIST_STYLE__EDGE_EFFECT:
		case ArkUIModelPackage.LIST_STYLE__DIVIDER:
		case ArkUIModelPackage.LIST_STYLE__EDIT_MODE:
		case ArkUIModelPackage.LIST_STYLE__CHAIN_ANIMATION:
		case ArkUIModelPackage.LIST_STYLE__SCROLL_BAR:
		case ArkUIModelPackage.LIST_STYLE__CACHED_COUNT:
		case ArkUIModelPackage.LIST_STYLE__STROKE_WIDTH:
		case ArkUIModelPackage.LIST_STYLE__COLOR:
		case ArkUIModelPackage.LIST_STYLE__START_MARGIN:
		case ArkUIModelPackage.LIST_STYLE__END_MARGIN:
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
