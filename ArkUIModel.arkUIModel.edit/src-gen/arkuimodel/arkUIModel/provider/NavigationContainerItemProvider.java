/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelFactory;
import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.NavigationContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.NavigationContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationContainerItemProvider extends ContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationContainerItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__TOOLBAR);
			childrenFeatures.add(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__MENU);
			childrenFeatures.add(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__NAVIGATIONEVENT);
			childrenFeatures.add(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__NAVIGATIONSTYLE);
			childrenFeatures.add(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__TITLE);
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
	 * This returns NavigationContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NavigationContainer"));
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
		String label = ((NavigationContainer) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NavigationContainer_type")
				: getString("_UI_NavigationContainer_type") + " " + label;
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

		switch (notification.getFeatureID(NavigationContainer.class)) {
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TOOLBAR:
		case ArkUIModelPackage.NAVIGATION_CONTAINER__MENU:
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONEVENT:
		case ArkUIModelPackage.NAVIGATION_CONTAINER__NAVIGATIONSTYLE:
		case ArkUIModelPackage.NAVIGATION_CONTAINER__TITLE:
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

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__TOOLBAR,
				ArkUIModelFactory.eINSTANCE.createContainerItems()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__MENU,
				ArkUIModelFactory.eINSTANCE.createContainerItems()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__NAVIGATIONEVENT,
				ArkUIModelFactory.eINSTANCE.createNavigationEvent()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__NAVIGATIONSTYLE,
				ArkUIModelFactory.eINSTANCE.createNavigationStyle()));

		newChildDescriptors.add(createChildParameter(ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__TITLE,
				ArkUIModelFactory.eINSTANCE.createContainerItems()));
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
				|| childFeature == ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__TOOLBAR
				|| childFeature == ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__MENU
				|| childFeature == ArkUIModelPackage.Literals.NAVIGATION_CONTAINER__TITLE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
