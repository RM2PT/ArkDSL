/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelFactory;
import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.UIComponent;

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
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.UIComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIComponentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponentItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addWidgetTypePropertyDescriptor(object);
			addFunflowPropertyDescriptor(object);
			addRootPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_UIComponent_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_UIComponent_id_feature",
								"_UI_UIComponent_type"),
						ArkUIModelPackage.Literals.UI_COMPONENT__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Widget Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidgetTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_UIComponent_widgetType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_UIComponent_widgetType_feature",
								"_UI_UIComponent_type"),
						ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Funflow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunflowPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_UIComponent_funflow_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_UIComponent_funflow_feature",
								"_UI_UIComponent_type"),
						ArkUIModelPackage.Literals.UI_COMPONENT__FUNFLOW, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_UIComponent_root_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_UIComponent_root_feature",
								"_UI_UIComponent_type"),
						ArkUIModelPackage.Literals.UI_COMPONENT__ROOT, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_UIComponent_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_UIComponent_name_feature",
								"_UI_UIComponent_type"),
						ArkUIModelPackage.Literals.UI_COMPONENT__NAME, true, false, false,
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
			childrenFeatures.add(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET);
			childrenFeatures.add(ArkUIModelPackage.Literals.UI_COMPONENT__PAGEREFRENCE);
			childrenFeatures.add(ArkUIModelPackage.Literals.UI_COMPONENT__FOREACH);
			childrenFeatures.add(ArkUIModelPackage.Literals.UI_COMPONENT__IF);
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
		String label = ((UIComponent) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_UIComponent_type")
				: getString("_UI_UIComponent_type") + " " + label;
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

		switch (notification.getFeatureID(UIComponent.class)) {
		case ArkUIModelPackage.UI_COMPONENT__ID:
		case ArkUIModelPackage.UI_COMPONENT__WIDGET_TYPE:
		case ArkUIModelPackage.UI_COMPONENT__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ArkUIModelPackage.UI_COMPONENT__WIDGET:
		case ArkUIModelPackage.UI_COMPONENT__PAGEREFRENCE:
		case ArkUIModelPackage.UI_COMPONENT__FOREACH:
		case ArkUIModelPackage.UI_COMPONENT__IF:
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

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createTextWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createButtonWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createFlexContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createTextInputWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createListContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createRowContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createColumnContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createListItemContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createImageWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createImageAnimator()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createNavigationContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createContainerItem()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createContainerItems()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createSwiperWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createTabsContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createTabContent()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createTabItem()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createStackContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createScrollContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createToggleWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createTimePickerWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createDatePickerWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createTextPickerWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createDividerWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createCustomDialogContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createGridContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createGridItemContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createSearchWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createBlankWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createProgressWidget()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET,
				ArkUIModelFactory.eINSTANCE.createLineContainer()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__PAGEREFRENCE,
				ArkUIModelFactory.eINSTANCE.createPageRefrence()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__FOREACH,
				ArkUIModelFactory.eINSTANCE.createForEach()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.UI_COMPONENT__IF,
				ArkUIModelFactory.eINSTANCE.createIF()));
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
