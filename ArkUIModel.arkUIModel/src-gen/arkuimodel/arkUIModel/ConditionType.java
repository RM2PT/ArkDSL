/**
 */
package arkuimodel.arkUIModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getConditionType()
 * @model
 * @generated
 */
public enum ConditionType implements Enumerator {
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "equal", "equal"),

	/**
	 * The '<em><b>Unequal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNEQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNEQUAL(1, "unequal", "unequal"),

	/**
	 * The '<em><b>Greaterthan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHAN(2, "greaterthan", "greaterthan"),

	/**
	 * The '<em><b>Greaterandequal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERANDEQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERANDEQUAL(3, "greaterandequal", "greaterandequal"),

	/**
	 * The '<em><b>Lessthan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHAN(4, "lessthan", "lessthan"),

	/**
	 * The '<em><b>Lessandequal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSANDEQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESSANDEQUAL(5, "lessandequal", "lessandequal");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>Unequal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNEQUAL
	 * @model name="unequal"
	 * @generated
	 * @ordered
	 */
	public static final int UNEQUAL_VALUE = 1;

	/**
	 * The '<em><b>Greaterthan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN
	 * @model name="greaterthan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHAN_VALUE = 2;

	/**
	 * The '<em><b>Greaterandequal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERANDEQUAL
	 * @model name="greaterandequal"
	 * @generated
	 * @ordered
	 */
	public static final int GREATERANDEQUAL_VALUE = 3;

	/**
	 * The '<em><b>Lessthan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN
	 * @model name="lessthan"
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHAN_VALUE = 4;

	/**
	 * The '<em><b>Lessandequal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSANDEQUAL
	 * @model name="lessandequal"
	 * @generated
	 * @ordered
	 */
	public static final int LESSANDEQUAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionType[] VALUES_ARRAY = new ConditionType[] { EQUAL, UNEQUAL, GREATERTHAN,
			GREATERANDEQUAL, LESSTHAN, LESSANDEQUAL, };

	/**
	 * A public read-only list of all the '<em><b>Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType get(int value) {
		switch (value) {
		case EQUAL_VALUE:
			return EQUAL;
		case UNEQUAL_VALUE:
			return UNEQUAL;
		case GREATERTHAN_VALUE:
			return GREATERTHAN;
		case GREATERANDEQUAL_VALUE:
			return GREATERANDEQUAL;
		case LESSTHAN_VALUE:
			return LESSTHAN;
		case LESSANDEQUAL_VALUE:
			return LESSANDEQUAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConditionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ConditionType
