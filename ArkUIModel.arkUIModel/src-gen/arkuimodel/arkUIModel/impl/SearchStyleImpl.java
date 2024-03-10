/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.SearchStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchStyleImpl#getPlaceholdercolor <em>Placeholdercolor</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchStyleImpl#getCaretcolor <em>Caretcolor</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchStyleImpl#getPlaceholderSize <em>Placeholder Size</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.SearchStyleImpl#getPlaceholderWeight <em>Placeholder Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchStyleImpl extends StyleClassImpl implements SearchStyle {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholdercolor() <em>Placeholdercolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholdercolor()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDERCOLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholdercolor() <em>Placeholdercolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholdercolor()
	 * @generated
	 * @ordered
	 */
	protected String placeholdercolor = PLACEHOLDERCOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaretcolor() <em>Caretcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaretcolor()
	 * @generated
	 * @ordered
	 */
	protected static final String CARETCOLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaretcolor() <em>Caretcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaretcolor()
	 * @generated
	 * @ordered
	 */
	protected String caretcolor = CARETCOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholderSize() <em>Placeholder Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderSize()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderSize() <em>Placeholder Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderSize()
	 * @generated
	 * @ordered
	 */
	protected String placeholderSize = PLACEHOLDER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholderWeight() <em>Placeholder Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderWeight() <em>Placeholder Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderWeight()
	 * @generated
	 * @ordered
	 */
	protected String placeholderWeight = PLACEHOLDER_WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.SEARCH_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_STYLE__COLOR, oldColor,
					color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholdercolor() {
		return placeholdercolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholdercolor(String newPlaceholdercolor) {
		String oldPlaceholdercolor = placeholdercolor;
		placeholdercolor = newPlaceholdercolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDERCOLOR,
					oldPlaceholdercolor, placeholdercolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaretcolor() {
		return caretcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaretcolor(String newCaretcolor) {
		String oldCaretcolor = caretcolor;
		caretcolor = newCaretcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_STYLE__CARETCOLOR,
					oldCaretcolor, caretcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholderSize() {
		return placeholderSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholderSize(String newPlaceholderSize) {
		String oldPlaceholderSize = placeholderSize;
		placeholderSize = newPlaceholderSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_SIZE,
					oldPlaceholderSize, placeholderSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholderWeight() {
		return placeholderWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholderWeight(String newPlaceholderWeight) {
		String oldPlaceholderWeight = placeholderWeight;
		placeholderWeight = newPlaceholderWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_WEIGHT,
					oldPlaceholderWeight, placeholderWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.SEARCH_STYLE__COLOR:
			return getColor();
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDERCOLOR:
			return getPlaceholdercolor();
		case ArkUIModelPackage.SEARCH_STYLE__CARETCOLOR:
			return getCaretcolor();
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_SIZE:
			return getPlaceholderSize();
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_WEIGHT:
			return getPlaceholderWeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArkUIModelPackage.SEARCH_STYLE__COLOR:
			setColor((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDERCOLOR:
			setPlaceholdercolor((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_STYLE__CARETCOLOR:
			setCaretcolor((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_SIZE:
			setPlaceholderSize((String) newValue);
			return;
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_WEIGHT:
			setPlaceholderWeight((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArkUIModelPackage.SEARCH_STYLE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDERCOLOR:
			setPlaceholdercolor(PLACEHOLDERCOLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_STYLE__CARETCOLOR:
			setCaretcolor(CARETCOLOR_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_SIZE:
			setPlaceholderSize(PLACEHOLDER_SIZE_EDEFAULT);
			return;
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_WEIGHT:
			setPlaceholderWeight(PLACEHOLDER_WEIGHT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArkUIModelPackage.SEARCH_STYLE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDERCOLOR:
			return PLACEHOLDERCOLOR_EDEFAULT == null ? placeholdercolor != null
					: !PLACEHOLDERCOLOR_EDEFAULT.equals(placeholdercolor);
		case ArkUIModelPackage.SEARCH_STYLE__CARETCOLOR:
			return CARETCOLOR_EDEFAULT == null ? caretcolor != null : !CARETCOLOR_EDEFAULT.equals(caretcolor);
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_SIZE:
			return PLACEHOLDER_SIZE_EDEFAULT == null ? placeholderSize != null
					: !PLACEHOLDER_SIZE_EDEFAULT.equals(placeholderSize);
		case ArkUIModelPackage.SEARCH_STYLE__PLACEHOLDER_WEIGHT:
			return PLACEHOLDER_WEIGHT_EDEFAULT == null ? placeholderWeight != null
					: !PLACEHOLDER_WEIGHT_EDEFAULT.equals(placeholderWeight);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", placeholdercolor: ");
		result.append(placeholdercolor);
		result.append(", caretcolor: ");
		result.append(caretcolor);
		result.append(", placeholderSize: ");
		result.append(placeholderSize);
		result.append(", placeholderWeight: ");
		result.append(placeholderWeight);
		result.append(')');
		return result.toString();
	}

} //SearchStyleImpl
