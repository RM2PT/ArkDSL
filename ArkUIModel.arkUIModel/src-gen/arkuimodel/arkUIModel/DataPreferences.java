/**
 */
package arkuimodel.arkUIModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.DataPreferences#getPreferencesType <em>Preferences Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.DataPreferences#getPreferences <em>Preferences</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDataPreferences()
 * @model
 * @generated
 */
public interface DataPreferences extends UIOperation {
	/**
	 * Returns the value of the '<em><b>Preferences Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences Type</em>' attribute.
	 * @see #setPreferencesType(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDataPreferences_PreferencesType()
	 * @model
	 * @generated
	 */
	String getPreferencesType();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DataPreferences#getPreferencesType <em>Preferences Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferences Type</em>' attribute.
	 * @see #getPreferencesType()
	 * @generated
	 */
	void setPreferencesType(String value);

	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' attribute.
	 * @see #setPreferences(String)
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getDataPreferences_Preferences()
	 * @model
	 * @generated
	 */
	String getPreferences();

	/**
	 * Sets the value of the '{@link arkuimodel.arkUIModel.DataPreferences#getPreferences <em>Preferences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferences</em>' attribute.
	 * @see #getPreferences()
	 * @generated
	 */
	void setPreferences(String value);

} // DataPreferences
