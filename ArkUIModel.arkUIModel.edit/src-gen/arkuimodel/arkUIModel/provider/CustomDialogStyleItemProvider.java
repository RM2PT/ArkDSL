/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.CustomDialogStyle;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.CustomDialogStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomDialogStyleItemProvider extends StyleClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDialogStyleItemProvider(AdapterFactory adapterFactory) {
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

			addAutoCancelPropertyDescriptor(object);
			addAlignmentPropertyDescriptor(object);
			addOffsetxPropertyDescriptor(object);
			addOffsetyPropertyDescriptor(object);
			addCustomStylePropertyDescriptor(object);
			addGridCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Cancel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoCancelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomDialogStyle_autoCancel_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CustomDialogStyle_autoCancel_feature",
						"_UI_CustomDialogStyle_type"),
				ArkUIModelPackage.Literals.CUSTOM_DIALOG_STYLE__AUTO_CANCEL, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomDialogStyle_alignment_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CustomDialogStyle_alignment_feature",
						"_UI_CustomDialogStyle_type"),
				ArkUIModelPackage.Literals.CUSTOM_DIALOG_STYLE__ALIGNMENT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Offsetx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetxPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CustomDialogStyle_offsetx_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CustomDialogStyle_offsetx_feature",
								"_UI_CustomDialogStyle_type"),
						ArkUIModelPackage.Literals.CUSTOM_DIALOG_STYLE__OFFSETX, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Offsety feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CustomDialogStyle_offsety_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CustomDialogStyle_offsety_feature",
								"_UI_CustomDialogStyle_type"),
						ArkUIModelPackage.Literals.CUSTOM_DIALOG_STYLE__OFFSETY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Custom Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomDialogStyle_customStyle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CustomDialogStyle_customStyle_feature",
						"_UI_CustomDialogStyle_type"),
				ArkUIModelPackage.Literals.CUSTOM_DIALOG_STYLE__CUSTOM_STYLE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Grid Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomDialogStyle_gridCount_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CustomDialogStyle_gridCount_feature",
						"_UI_CustomDialogStyle_type"),
				ArkUIModelPackage.Literals.CUSTOM_DIALOG_STYLE__GRID_COUNT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CustomDialogStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CustomDialogStyle"));
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
		String label = ((CustomDialogStyle) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CustomDialogStyle_type")
				: getString("_UI_CustomDialogStyle_type") + " " + label;
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

		switch (notification.getFeatureID(CustomDialogStyle.class)) {
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__AUTO_CANCEL:
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__ALIGNMENT:
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETX:
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__OFFSETY:
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__CUSTOM_STYLE:
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE__GRID_COUNT:
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
