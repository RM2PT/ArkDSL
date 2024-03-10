/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.TriggerEvent#getEventclass <em>Eventclass</em>}</li>
 * </ul>
 *
 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTriggerEvent()
 * @model
 * @generated
 */
public interface TriggerEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Eventclass</b></em>' containment reference list.
	 * The list contents are of type {@link arkuimodel.arkUIModel.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventclass</em>' containment reference list.
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#getTriggerEvent_Eventclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEventclass();

} // TriggerEvent
