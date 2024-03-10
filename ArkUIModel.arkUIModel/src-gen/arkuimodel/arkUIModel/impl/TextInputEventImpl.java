/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.TextInputEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputEventImpl#getOnChange <em>On Change</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputEventImpl#getOnSubmit <em>On Submit</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputEventImpl#getOnCopy <em>On Copy</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputEventImpl#getOnPaste <em>On Paste</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputEventImpl#getOnCut <em>On Cut</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputEventImpl#getOnEditChanged <em>On Edit Changed</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.TextInputEventImpl#getOnEditChange <em>On Edit Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextInputEventImpl extends EventImpl implements TextInputEvent {
	/**
	 * The default value of the '{@link #getOnChange() <em>On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChange()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnChange() <em>On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChange()
	 * @generated
	 * @ordered
	 */
	protected String onChange = ON_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnSubmit() <em>On Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSubmit()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_SUBMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnSubmit() <em>On Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSubmit()
	 * @generated
	 * @ordered
	 */
	protected String onSubmit = ON_SUBMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnCopy() <em>On Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCopy()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_COPY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnCopy() <em>On Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCopy()
	 * @generated
	 * @ordered
	 */
	protected String onCopy = ON_COPY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnPaste() <em>On Paste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPaste()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PASTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPaste() <em>On Paste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPaste()
	 * @generated
	 * @ordered
	 */
	protected String onPaste = ON_PASTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnCut() <em>On Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCut()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnCut() <em>On Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCut()
	 * @generated
	 * @ordered
	 */
	protected String onCut = ON_CUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnEditChanged() <em>On Edit Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEditChanged()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_EDIT_CHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnEditChanged() <em>On Edit Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEditChanged()
	 * @generated
	 * @ordered
	 */
	protected String onEditChanged = ON_EDIT_CHANGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnEditChange() <em>On Edit Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEditChange()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_EDIT_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnEditChange() <em>On Edit Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEditChange()
	 * @generated
	 * @ordered
	 */
	protected String onEditChange = ON_EDIT_CHANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.TEXT_INPUT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnChange() {
		return onChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnChange(String newOnChange) {
		String oldOnChange = onChange;
		onChange = newOnChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CHANGE,
					oldOnChange, onChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnSubmit() {
		return onSubmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSubmit(String newOnSubmit) {
		String oldOnSubmit = onSubmit;
		onSubmit = newOnSubmit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_EVENT__ON_SUBMIT,
					oldOnSubmit, onSubmit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnCopy() {
		return onCopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCopy(String newOnCopy) {
		String oldOnCopy = onCopy;
		onCopy = newOnCopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_EVENT__ON_COPY,
					oldOnCopy, onCopy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnPaste() {
		return onPaste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPaste(String newOnPaste) {
		String oldOnPaste = onPaste;
		onPaste = newOnPaste;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_EVENT__ON_PASTE,
					oldOnPaste, onPaste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnCut() {
		return onCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCut(String newOnCut) {
		String oldOnCut = onCut;
		onCut = newOnCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CUT, oldOnCut,
					onCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnEditChanged() {
		return onEditChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnEditChanged(String newOnEditChanged) {
		String oldOnEditChanged = onEditChanged;
		onEditChanged = newOnEditChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGED,
					oldOnEditChanged, onEditChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnEditChange() {
		return onEditChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnEditChange(String newOnEditChange) {
		String oldOnEditChange = onEditChange;
		onEditChange = newOnEditChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGE,
					oldOnEditChange, onEditChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CHANGE:
			return getOnChange();
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_SUBMIT:
			return getOnSubmit();
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_COPY:
			return getOnCopy();
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_PASTE:
			return getOnPaste();
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CUT:
			return getOnCut();
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGED:
			return getOnEditChanged();
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGE:
			return getOnEditChange();
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
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CHANGE:
			setOnChange((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_SUBMIT:
			setOnSubmit((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_COPY:
			setOnCopy((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_PASTE:
			setOnPaste((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CUT:
			setOnCut((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGED:
			setOnEditChanged((String) newValue);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGE:
			setOnEditChange((String) newValue);
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
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CHANGE:
			setOnChange(ON_CHANGE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_SUBMIT:
			setOnSubmit(ON_SUBMIT_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_COPY:
			setOnCopy(ON_COPY_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_PASTE:
			setOnPaste(ON_PASTE_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CUT:
			setOnCut(ON_CUT_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGED:
			setOnEditChanged(ON_EDIT_CHANGED_EDEFAULT);
			return;
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGE:
			setOnEditChange(ON_EDIT_CHANGE_EDEFAULT);
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
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CHANGE:
			return ON_CHANGE_EDEFAULT == null ? onChange != null : !ON_CHANGE_EDEFAULT.equals(onChange);
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_SUBMIT:
			return ON_SUBMIT_EDEFAULT == null ? onSubmit != null : !ON_SUBMIT_EDEFAULT.equals(onSubmit);
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_COPY:
			return ON_COPY_EDEFAULT == null ? onCopy != null : !ON_COPY_EDEFAULT.equals(onCopy);
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_PASTE:
			return ON_PASTE_EDEFAULT == null ? onPaste != null : !ON_PASTE_EDEFAULT.equals(onPaste);
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_CUT:
			return ON_CUT_EDEFAULT == null ? onCut != null : !ON_CUT_EDEFAULT.equals(onCut);
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGED:
			return ON_EDIT_CHANGED_EDEFAULT == null ? onEditChanged != null
					: !ON_EDIT_CHANGED_EDEFAULT.equals(onEditChanged);
		case ArkUIModelPackage.TEXT_INPUT_EVENT__ON_EDIT_CHANGE:
			return ON_EDIT_CHANGE_EDEFAULT == null ? onEditChange != null
					: !ON_EDIT_CHANGE_EDEFAULT.equals(onEditChange);
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
		result.append(" (onChange: ");
		result.append(onChange);
		result.append(", onSubmit: ");
		result.append(onSubmit);
		result.append(", onCopy: ");
		result.append(onCopy);
		result.append(", onPaste: ");
		result.append(onPaste);
		result.append(", onCut: ");
		result.append(onCut);
		result.append(", onEditChanged: ");
		result.append(onEditChanged);
		result.append(", onEditChange: ");
		result.append(onEditChange);
		result.append(')');
		return result.toString();
	}

} //TextInputEventImpl
