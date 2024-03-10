/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextInputEvent;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.TextInputEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextInputEventItemProvider extends EventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputEventItemProvider(AdapterFactory adapterFactory) {
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

			addOnChangePropertyDescriptor(object);
			addOnSubmitPropertyDescriptor(object);
			addOnCopyPropertyDescriptor(object);
			addOnPastePropertyDescriptor(object);
			addOnCutPropertyDescriptor(object);
			addOnEditChangedPropertyDescriptor(object);
			addOnEditChangePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the On Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputEvent_onChange_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputEvent_onChange_feature",
								"_UI_TextInputEvent_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_EVENT__ON_CHANGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Submit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnSubmitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputEvent_onSubmit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputEvent_onSubmit_feature",
								"_UI_TextInputEvent_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_EVENT__ON_SUBMIT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Copy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnCopyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputEvent_onCopy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputEvent_onCopy_feature",
								"_UI_TextInputEvent_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_EVENT__ON_COPY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Paste feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnPastePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputEvent_onPaste_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputEvent_onPaste_feature",
								"_UI_TextInputEvent_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_EVENT__ON_PASTE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Cut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnCutPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputEvent_onCut_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputEvent_onCut_feature",
								"_UI_TextInputEvent_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_EVENT__ON_CUT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Edit Changed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnEditChangedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TextInputEvent_onEditChanged_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TextInputEvent_onEditChanged_feature",
						"_UI_TextInputEvent_type"),
				ArkUIModelPackage.Literals.TEXT_INPUT_EVENT__ON_EDIT_CHANGED, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Edit Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnEditChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputEvent_onEditChange_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputEvent_onEditChange_feature",
								"_UI_TextInputEvent_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_EVENT__ON_EDIT_CHANGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns TextInputEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextInputEvent"));
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
		String label = ((TextInputEvent) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TextInputEvent_type")
				: getString("_UI_TextInputEvent_type") + " " + label;
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

		switch (notification.getFeatureID(TextInputEvent.class)) {
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CHANGE:
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_SUBMIT:
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_COPY:
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_PASTE:
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CUT:
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGED:
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGE:
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
