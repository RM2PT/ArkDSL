/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextInputStyle;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.TextInputStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextInputStyleItemProvider extends StyleClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputStyleItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addPlaceholderColorPropertyDescriptor(object);
			addPlaceholderFontPropertyDescriptor(object);
			addEnterKeyTypePropertyDescriptor(object);
			addCaretColorPropertyDescriptor(object);
			addMaxLengthPropertyDescriptor(object);
			addFontColorPropertyDescriptor(object);
			addFontSizePropertyDescriptor(object);
			addFontStylePropertyDescriptor(object);
			addFontWeightPropertyDescriptor(object);
			addFontFamilyPropertyDescriptor(object);
			addInputFilterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_TextInputStyle_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_type_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Placeholder Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TextInputStyle_placeholderColor_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_placeholderColor_feature",
						"_UI_TextInputStyle_type"),
				ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__PLACEHOLDER_COLOR, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Placeholder Font feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderFontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TextInputStyle_placeholderFont_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_placeholderFont_feature",
						"_UI_TextInputStyle_type"),
				ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__PLACEHOLDER_FONT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enter Key Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnterKeyTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_enterKeyType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_enterKeyType_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__ENTER_KEY_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Caret Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaretColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_caretColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_caretColor_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__CARET_COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_maxLength_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_maxLength_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__MAX_LENGTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_fontColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_fontColor_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__FONT_COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_fontSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_fontSize_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__FONT_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_fontStyle_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_fontStyle_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__FONT_STYLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_fontWeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_fontWeight_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__FONT_WEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Family feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontFamilyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_fontFamily_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_fontFamily_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__FONT_FAMILY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Input Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextInputStyle_inputFilter_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextInputStyle_inputFilter_feature",
								"_UI_TextInputStyle_type"),
						ArkUIModelPackage.Literals.TEXT_INPUT_STYLE__INPUT_FILTER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns TextInputStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextInputStyle"));
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
		String label = ((TextInputStyle) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TextInputStyle_type")
				: getString("_UI_TextInputStyle_type") + " " + label;
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

		switch (notification.getFeatureID(TextInputStyle.class)) {
		case ArkUIModelPackage.TEXT_INPUT_STYLE__TYPE:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_COLOR:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__PLACEHOLDER_FONT:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__ENTER_KEY_TYPE:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__CARET_COLOR:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__MAX_LENGTH:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_COLOR:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_SIZE:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_STYLE:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_WEIGHT:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__FONT_FAMILY:
		case ArkUIModelPackage.TEXT_INPUT_STYLE__INPUT_FILTER:
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
