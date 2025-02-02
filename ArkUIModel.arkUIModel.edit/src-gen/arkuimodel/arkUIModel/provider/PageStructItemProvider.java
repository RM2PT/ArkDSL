/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelFactory;
import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.PageStruct;

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
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.PageStruct} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PageStructItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageStructItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PageStruct_title_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PageStruct_title_feature",
								"_UI_PageStruct_type"),
						ArkUIModelPackage.Literals.PAGE_STRUCT__TITLE, true, false, false,
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
						getResourceLocator(), getString("_UI_PageStruct_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PageStruct_type_feature",
								"_UI_PageStruct_type"),
						ArkUIModelPackage.Literals.PAGE_STRUCT__TYPE, true, false, false,
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
			childrenFeatures.add(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS);
			childrenFeatures.add(ArkUIModelPackage.Literals.PAGE_STRUCT__PAGEEVENT);
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
	 * This returns PageStruct.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PageStruct"));
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
		String label = ((PageStruct) object).getTitle();
		return label == null || label.length() == 0 ? getString("_UI_PageStruct_type")
				: getString("_UI_PageStruct_type") + " " + label;
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

		switch (notification.getFeatureID(PageStruct.class)) {
		case ArkUIModelPackage.PAGE_STRUCT__TITLE:
		case ArkUIModelPackage.PAGE_STRUCT__TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ArkUIModelPackage.PAGE_STRUCT__WIDGETS:
		case ArkUIModelPackage.PAGE_STRUCT__PAGEEVENT:
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

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createTextWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createButtonWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createFlexContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createTextInputWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createListContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createRowContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createColumnContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createListItemContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createImageWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createImageAnimator()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createNavigationContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createContainerItem()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createContainerItems()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createSwiperWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createTabsContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createTabContent()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createTabItem()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createStackContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createScrollContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createToggleWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createTimePickerWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createDatePickerWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createTextPickerWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createDividerWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createCustomDialogContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createGridContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createGridItemContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createSearchWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createBlankWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createProgressWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__WIDGETS,
				ArkUIModelFactory.eINSTANCE.createLineContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.PAGE_STRUCT__PAGEEVENT,
				ArkUIModelFactory.eINSTANCE.createPageEvent()));
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
