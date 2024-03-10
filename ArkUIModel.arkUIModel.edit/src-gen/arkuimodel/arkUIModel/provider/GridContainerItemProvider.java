/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelFactory;
import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.GridContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.GridContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GridContainerItemProvider extends ContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridContainerItemProvider(AdapterFactory adapterFactory) {
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

			addColumnsTemplatePropertyDescriptor(object);
			addRowsTemplatePropertyDescriptor(object);
			addColumnsGapPropertyDescriptor(object);
			addRowsGapPropertyDescriptor(object);
			addCachedCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Columns Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnsTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GridContainer_columnsTemplate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GridContainer_columnsTemplate_feature",
								"_UI_GridContainer_type"),
						ArkUIModelPackage.Literals.GRID_CONTAINER__COLUMNS_TEMPLATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rows Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowsTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GridContainer_rowsTemplate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GridContainer_rowsTemplate_feature",
								"_UI_GridContainer_type"),
						ArkUIModelPackage.Literals.GRID_CONTAINER__ROWS_TEMPLATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Columns Gap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnsGapPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GridContainer_columnsGap_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GridContainer_columnsGap_feature",
								"_UI_GridContainer_type"),
						ArkUIModelPackage.Literals.GRID_CONTAINER__COLUMNS_GAP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rows Gap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowsGapPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GridContainer_rowsGap_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GridContainer_rowsGap_feature",
								"_UI_GridContainer_type"),
						ArkUIModelPackage.Literals.GRID_CONTAINER__ROWS_GAP, true, false, false,
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
						getResourceLocator(), getString("_UI_GridContainer_cachedCount_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GridContainer_cachedCount_feature",
								"_UI_GridContainer_type"),
						ArkUIModelPackage.Literals.GRID_CONTAINER__CACHED_COUNT, true, false, false,
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
			childrenFeatures.add(ArkUIModelPackage.Literals.GRID_CONTAINER__GRIDEVENT);
			childrenFeatures.add(ArkUIModelPackage.Literals.GRID_CONTAINER__GRIDSTYLE);
			childrenFeatures.add(ArkUIModelPackage.Literals.GRID_CONTAINER__GRIDITEMCONTAINER);
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
	 * This returns GridContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GridContainer"));
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
		String label = ((GridContainer) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_GridContainer_type")
				: getString("_UI_GridContainer_type") + " " + label;
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

		switch (notification.getFeatureID(GridContainer.class)) {
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_TEMPLATE:
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_TEMPLATE:
		case ArkUIModelPackage.GRID_CONTAINER__COLUMNS_GAP:
		case ArkUIModelPackage.GRID_CONTAINER__ROWS_GAP:
		case ArkUIModelPackage.GRID_CONTAINER__CACHED_COUNT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ArkUIModelPackage.GRID_CONTAINER__GRIDEVENT:
		case ArkUIModelPackage.GRID_CONTAINER__GRIDSTYLE:
		case ArkUIModelPackage.GRID_CONTAINER__GRIDITEMCONTAINER:
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

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GRID_CONTAINER__GRIDEVENT,
				ArkUIModelFactory.eINSTANCE.createGridEvent()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GRID_CONTAINER__GRIDSTYLE,
				ArkUIModelFactory.eINSTANCE.createGridStyle()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.GRID_CONTAINER__GRIDITEMCONTAINER,
				ArkUIModelFactory.eINSTANCE.createGridItemContainer()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == ArkUIModelPackage.Literals.UI_COMPONENT__WIDGET
				|| childFeature == ArkUIModelPackage.Literals.GRID_CONTAINER__GRIDITEMCONTAINER;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
