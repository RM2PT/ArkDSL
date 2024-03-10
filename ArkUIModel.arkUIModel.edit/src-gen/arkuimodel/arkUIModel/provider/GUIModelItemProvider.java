/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelFactory;
import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.GUIModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.GUIModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GUIModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIModelItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_GUIModel_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GUIModel_name_feature",
								"_UI_GUIModel_type"),
						ArkUIModelPackage.Literals.GUI_MODEL__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GUIModel_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GUIModel_description_feature",
								"_UI_GUIModel_type"),
						ArkUIModelPackage.Literals.GUI_MODEL__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GUIModel_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GUIModel_type_feature",
								"_UI_GUIModel_type"),
						ArkUIModelPackage.Literals.GUI_MODEL__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ArkUIModelPackage.Literals.GUI_MODEL__STYLELIBRAY);
			childrenFeatures.add(ArkUIModelPackage.Literals.GUI_MODEL__ROOTPAGE);
			childrenFeatures.add(ArkUIModelPackage.Literals.GUI_MODEL__TRIGGEREVENT);
			childrenFeatures.add(ArkUIModelPackage.Literals.GUI_MODEL__ANIMATIONLIBRAY);
			childrenFeatures.add(ArkUIModelPackage.Literals.GUI_MODEL__UILOGIC);
			childrenFeatures.add(ArkUIModelPackage.Literals.GUI_MODEL__UIDESIGN);
			childrenFeatures.add(ArkUIModelPackage.Literals.GUI_MODEL__OPERATIONLIBRAY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GUIModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GUIModel"));
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
		String label = ((GUIModel) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_GUIModel_type")
				: getString("_UI_GUIModel_type") + " " + label;
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

		switch (notification.getFeatureID(GUIModel.class)) {
		case ArkUIModelPackage.GUI_MODEL__NAME:
		case ArkUIModelPackage.GUI_MODEL__DESCRIPTION:
		case ArkUIModelPackage.GUI_MODEL__TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ArkUIModelPackage.GUI_MODEL__STYLELIBRAY:
		case ArkUIModelPackage.GUI_MODEL__ROOTPAGE:
		case ArkUIModelPackage.GUI_MODEL__TRIGGEREVENT:
		case ArkUIModelPackage.GUI_MODEL__ANIMATIONLIBRAY:
		case ArkUIModelPackage.GUI_MODEL__UILOGIC:
		case ArkUIModelPackage.GUI_MODEL__UIDESIGN:
		case ArkUIModelPackage.GUI_MODEL__OPERATIONLIBRAY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GUI_MODEL__STYLELIBRAY,
				ArkUIModelFactory.eINSTANCE.createStyleLibray()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GUI_MODEL__ROOTPAGE,
				ArkUIModelFactory.eINSTANCE.createUIStruct()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GUI_MODEL__TRIGGEREVENT,
				ArkUIModelFactory.eINSTANCE.createTriggerEvent()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GUI_MODEL__ANIMATIONLIBRAY,
				ArkUIModelFactory.eINSTANCE.createAnimationLibray()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GUI_MODEL__UILOGIC,
				ArkUIModelFactory.eINSTANCE.createUILogic()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GUI_MODEL__UIDESIGN,
				ArkUIModelFactory.eINSTANCE.createUIDesign()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GUI_MODEL__OPERATIONLIBRAY,
				ArkUIModelFactory.eINSTANCE.createOperationLibray()));
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
