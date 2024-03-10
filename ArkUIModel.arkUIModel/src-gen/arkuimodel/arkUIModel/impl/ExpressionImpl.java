/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.Expression;
import arkuimodel.arkUIModel.UnionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ExpressionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ExpressionImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.ExpressionImpl#getExpressText <em>Express Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnion() <em>Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected static final UnionType UNION_EDEFAULT = UnionType.AND;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected UnionType union = UNION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressText() <em>Express Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressText()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESS_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressText() <em>Express Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressText()
	 * @generated
	 * @ordered
	 */
	protected String expressText = EXPRESS_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EXPRESSION__PARAMETER, oldParameter,
					parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EXPRESSION__CONDITION, oldCondition,
					condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EXPRESSION__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionType getUnion() {
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnion(UnionType newUnion) {
		UnionType oldUnion = union;
		union = newUnion == null ? UNION_EDEFAULT : newUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EXPRESSION__UNION, oldUnion,
					union));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressText() {
		return expressText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressText(String newExpressText) {
		String oldExpressText = expressText;
		expressText = newExpressText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.EXPRESSION__EXPRESS_TEXT,
					oldExpressText, expressText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.EXPRESSION__NAME:
			return getName();
		case ArkUIModelPackage.EXPRESSION__PARAMETER:
			return getParameter();
		case ArkUIModelPackage.EXPRESSION__CONDITION:
			return getCondition();
		case ArkUIModelPackage.EXPRESSION__VALUE:
			return getValue();
		case ArkUIModelPackage.EXPRESSION__UNION:
			return getUnion();
		case ArkUIModelPackage.EXPRESSION__EXPRESS_TEXT:
			return getExpressText();
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
		case ArkUIModelPackage.EXPRESSION__NAME:
			setName((String) newValue);
			return;
		case ArkUIModelPackage.EXPRESSION__PARAMETER:
			setParameter((String) newValue);
			return;
		case ArkUIModelPackage.EXPRESSION__CONDITION:
			setCondition((String) newValue);
			return;
		case ArkUIModelPackage.EXPRESSION__VALUE:
			setValue((String) newValue);
			return;
		case ArkUIModelPackage.EXPRESSION__UNION:
			setUnion((UnionType) newValue);
			return;
		case ArkUIModelPackage.EXPRESSION__EXPRESS_TEXT:
			setExpressText((String) newValue);
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
		case ArkUIModelPackage.EXPRESSION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.EXPRESSION__PARAMETER:
			setParameter(PARAMETER_EDEFAULT);
			return;
		case ArkUIModelPackage.EXPRESSION__CONDITION:
			setCondition(CONDITION_EDEFAULT);
			return;
		case ArkUIModelPackage.EXPRESSION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ArkUIModelPackage.EXPRESSION__UNION:
			setUnion(UNION_EDEFAULT);
			return;
		case ArkUIModelPackage.EXPRESSION__EXPRESS_TEXT:
			setExpressText(EXPRESS_TEXT_EDEFAULT);
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
		case ArkUIModelPackage.EXPRESSION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArkUIModelPackage.EXPRESSION__PARAMETER:
			return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
		case ArkUIModelPackage.EXPRESSION__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		case ArkUIModelPackage.EXPRESSION__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ArkUIModelPackage.EXPRESSION__UNION:
			return union != UNION_EDEFAULT;
		case ArkUIModelPackage.EXPRESSION__EXPRESS_TEXT:
			return EXPRESS_TEXT_EDEFAULT == null ? expressText != null : !EXPRESS_TEXT_EDEFAULT.equals(expressText);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(", condition: ");
		result.append(condition);
		result.append(", value: ");
		result.append(value);
		result.append(", union: ");
		result.append(union);
		result.append(", expressText: ");
		result.append(expressText);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
