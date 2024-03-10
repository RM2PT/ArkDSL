/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.ListEvent;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.ListEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListEventItemProvider extends EventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEventItemProvider(AdapterFactory adapterFactory) {
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

			addOnScrollPropertyDescriptor(object);
			addOnScrollIndexPropertyDescriptor(object);
			addOnReachStartPropertyDescriptor(object);
			addOnReachEndPropertyDescriptor(object);
			addOnScrollStopPropertyDescriptor(object);
			addOnItemDeletePropertyDescriptor(object);
			addOnItemMovePropertyDescriptor(object);
			addOnBlurPropertyDescriptor(object);
			addOnFocusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the On Scroll feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnScrollPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onScroll_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onScroll_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_SCROLL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Scroll Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnScrollIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onScrollIndex_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onScrollIndex_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_SCROLL_INDEX, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Reach Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnReachStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onReachStart_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onReachStart_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_REACH_START, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Reach End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnReachEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onReachEnd_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onReachEnd_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_REACH_END, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Scroll Stop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnScrollStopPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onScrollStop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onScrollStop_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_SCROLL_STOP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Item Delete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnItemDeletePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onItemDelete_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onItemDelete_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_ITEM_DELETE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Item Move feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnItemMovePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onItemMove_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onItemMove_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_ITEM_MOVE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Blur feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnBlurPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onBlur_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onBlur_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_BLUR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Focus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnFocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListEvent_onFocus_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListEvent_onFocus_feature",
								"_UI_ListEvent_type"),
						ArkUIModelPackage.Literals.LIST_EVENT__ON_FOCUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ListEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListEvent"));
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
		String label = ((ListEvent) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ListEvent_type")
				: getString("_UI_ListEvent_type") + " " + label;
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

		switch (notification.getFeatureID(ListEvent.class)) {
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL:
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_INDEX:
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_START:
		case ArkUIModelPackage.LIST_EVENT__ON_REACH_END:
		case ArkUIModelPackage.LIST_EVENT__ON_SCROLL_STOP:
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_DELETE:
		case ArkUIModelPackage.LIST_EVENT__ON_ITEM_MOVE:
		case ArkUIModelPackage.LIST_EVENT__ON_BLUR:
		case ArkUIModelPackage.LIST_EVENT__ON_FOCUS:
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
