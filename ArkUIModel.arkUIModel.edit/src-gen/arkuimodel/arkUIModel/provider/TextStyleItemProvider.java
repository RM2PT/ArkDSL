/**
 */
package arkuimodel.arkUIModel.provider;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextStyle;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arkuimodel.arkUIModel.TextStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextStyleItemProvider extends StyleClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyleItemProvider(AdapterFactory adapterFactory) {
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

			addFontColorPropertyDescriptor(object);
			addFontSizePropertyDescriptor(object);
			addMinFontSizePropertyDescriptor(object);
			addMaxFontSizePropertyDescriptor(object);
			addFontStylePropertyDescriptor(object);
			addFontWeightPropertyDescriptor(object);
			addTextAlignPropertyDescriptor(object);
			addLineHeightPropertyDescriptor(object);
			addTextOverflowPropertyDescriptor(object);
			addFontFamilyPropertyDescriptor(object);
			addMaxLinesPropertyDescriptor(object);
			addDecorationTypePropertyDescriptor(object);
			addLetterSpacingPropertyDescriptor(object);
			addTextCasePropertyDescriptor(object);
			addBaselineOffsetPropertyDescriptor(object);
			addDecorationColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_TextStyle_fontColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_fontColor_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__FONT_COLOR, true, false, false,
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
						getResourceLocator(), getString("_UI_TextStyle_fontSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_fontSize_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__FONT_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_minFontSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_minFontSize_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__MIN_FONT_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_maxFontSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_maxFontSize_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__MAX_FONT_SIZE, true, false, false,
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
						getResourceLocator(), getString("_UI_TextStyle_fontStyle_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_fontStyle_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__FONT_STYLE, true, false, false,
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
						getResourceLocator(), getString("_UI_TextStyle_fontWeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_fontWeight_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__FONT_WEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Text Align feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextAlignPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_textAlign_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_textAlign_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__TEXT_ALIGN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Line Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_lineHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_lineHeight_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__LINE_HEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Text Overflow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextOverflowPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_textOverflow_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_textOverflow_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__TEXT_OVERFLOW, true, false, false,
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
						getResourceLocator(), getString("_UI_TextStyle_fontFamily_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_fontFamily_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__FONT_FAMILY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Lines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_maxLines_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_maxLines_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__MAX_LINES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Decoration Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecorationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_decorationType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_decorationType_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__DECORATION_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Letter Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLetterSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_letterSpacing_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_letterSpacing_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__LETTER_SPACING, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Text Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_textCase_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_textCase_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__TEXT_CASE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Baseline Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaselineOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_baselineOffset_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_baselineOffset_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__BASELINE_OFFSET, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Decoration Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecorationColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextStyle_decorationColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextStyle_decorationColor_feature",
								"_UI_TextStyle_type"),
						ArkUIModelPackage.Literals.TEXT_STYLE__DECORATION_COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns TextStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextStyle"));
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
		String label = ((TextStyle) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TextStyle_type")
				: getString("_UI_TextStyle_type") + " " + label;
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

		switch (notification.getFeatureID(TextStyle.class)) {
		case ArkUIModelPackage.TEXT_STYLE__FONT_COLOR:
		case ArkUIModelPackage.TEXT_STYLE__FONT_SIZE:
		case ArkUIModelPackage.TEXT_STYLE__MIN_FONT_SIZE:
		case ArkUIModelPackage.TEXT_STYLE__MAX_FONT_SIZE:
		case ArkUIModelPackage.TEXT_STYLE__FONT_STYLE:
		case ArkUIModelPackage.TEXT_STYLE__FONT_WEIGHT:
		case ArkUIModelPackage.TEXT_STYLE__TEXT_ALIGN:
		case ArkUIModelPackage.TEXT_STYLE__LINE_HEIGHT:
		case ArkUIModelPackage.TEXT_STYLE__TEXT_OVERFLOW:
		case ArkUIModelPackage.TEXT_STYLE__FONT_FAMILY:
		case ArkUIModelPackage.TEXT_STYLE__MAX_LINES:
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_TYPE:
		case ArkUIModelPackage.TEXT_STYLE__LETTER_SPACING:
		case ArkUIModelPackage.TEXT_STYLE__TEXT_CASE:
		case ArkUIModelPackage.TEXT_STYLE__BASELINE_OFFSET:
		case ArkUIModelPackage.TEXT_STYLE__DECORATION_COLOR:
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
