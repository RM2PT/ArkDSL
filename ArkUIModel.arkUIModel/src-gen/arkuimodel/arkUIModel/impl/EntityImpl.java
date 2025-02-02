/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.Entity;
import arkuimodel.arkUIModel.EntityAttribute;
import arkuimodel.arkUIModel.EntityRefrence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EntityImpl#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.EntityImpl#getEntityrefrence <em>Entityrefrence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends TypeCSImpl implements Entity {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityAttribute> attributes;

	/**
	 * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity superEntity;

	/**
	 * The cached value of the '{@link #getEntityrefrence() <em>Entityrefrence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityrefrence()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityRefrence> entityrefrence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ENTITY__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<EntityAttribute>(EntityAttribute.class, this,
					ArkUIModelPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSuperEntity() {
		if (superEntity != null && superEntity.eIsProxy()) {
			InternalEObject oldSuperEntity = (InternalEObject) superEntity;
			superEntity = (Entity) eResolveProxy(oldSuperEntity);
			if (superEntity != oldSuperEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArkUIModelPackage.ENTITY__SUPER_ENTITY,
							oldSuperEntity, superEntity));
			}
		}
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSuperEntity() {
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperEntity(Entity newSuperEntity) {
		Entity oldSuperEntity = superEntity;
		superEntity = newSuperEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.ENTITY__SUPER_ENTITY,
					oldSuperEntity, superEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityRefrence> getEntityrefrence() {
		if (entityrefrence == null) {
			entityrefrence = new EObjectContainmentEList<EntityRefrence>(EntityRefrence.class, this,
					ArkUIModelPackage.ENTITY__ENTITYREFRENCE);
		}
		return entityrefrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.ENTITY__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.ENTITY__ENTITYREFRENCE:
			return ((InternalEList<?>) getEntityrefrence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.ENTITY__NAME:
			return getName();
		case ArkUIModelPackage.ENTITY__DESCRIPTION:
			return getDescription();
		case ArkUIModelPackage.ENTITY__ATTRIBUTES:
			return getAttributes();
		case ArkUIModelPackage.ENTITY__SUPER_ENTITY:
			if (resolve)
				return getSuperEntity();
			return basicGetSuperEntity();
		case ArkUIModelPackage.ENTITY__ENTITYREFRENCE:
			return getEntityrefrence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArkUIModelPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case ArkUIModelPackage.ENTITY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ArkUIModelPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends EntityAttribute>) newValue);
			return;
		case ArkUIModelPackage.ENTITY__SUPER_ENTITY:
			setSuperEntity((Entity) newValue);
			return;
		case ArkUIModelPackage.ENTITY__ENTITYREFRENCE:
			getEntityrefrence().clear();
			getEntityrefrence().addAll((Collection<? extends EntityRefrence>) newValue);
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
		case ArkUIModelPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArkUIModelPackage.ENTITY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ArkUIModelPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			return;
		case ArkUIModelPackage.ENTITY__SUPER_ENTITY:
			setSuperEntity((Entity) null);
			return;
		case ArkUIModelPackage.ENTITY__ENTITYREFRENCE:
			getEntityrefrence().clear();
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
		case ArkUIModelPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArkUIModelPackage.ENTITY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ArkUIModelPackage.ENTITY__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case ArkUIModelPackage.ENTITY__SUPER_ENTITY:
			return superEntity != null;
		case ArkUIModelPackage.ENTITY__ENTITYREFRENCE:
			return entityrefrence != null && !entityrefrence.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
