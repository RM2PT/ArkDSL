/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.LineContainer;
import arkuimodel.arkUIModel.LineEvent;
import arkuimodel.arkUIModel.LineStyle;

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
 * An implementation of the model object '<em><b>Line Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.LineContainerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.LineContainerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.LineContainerImpl#getLineevent <em>Lineevent</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.LineContainerImpl#getLinestyle <em>Linestyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineContainerImpl extends ContainerImpl implements LineContainer {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLineevent() <em>Lineevent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineevent()
	 * @generated
	 * @ordered
	 */
	protected EList<LineEvent> lineevent;

	/**
	 * The cached value of the '{@link #getLinestyle() <em>Linestyle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinestyle()
	 * @generated
	 * @ordered
	 */
	protected EList<LineStyle> linestyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.LINE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LINE_CONTAINER__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.LINE_CONTAINER__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineEvent> getLineevent() {
		if (lineevent == null) {
			lineevent = new EObjectContainmentEList<LineEvent>(LineEvent.class, this,
					ArkUIModelPackage.LINE_CONTAINER__LINEEVENT);
		}
		return lineevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineStyle> getLinestyle() {
		if (linestyle == null) {
			linestyle = new EObjectContainmentEList<LineStyle>(LineStyle.class, this,
					ArkUIModelPackage.LINE_CONTAINER__LINESTYLE);
		}
		return linestyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArkUIModelPackage.LINE_CONTAINER__LINEEVENT:
			return ((InternalEList<?>) getLineevent()).basicRemove(otherEnd, msgs);
		case ArkUIModelPackage.LINE_CONTAINER__LINESTYLE:
			return ((InternalEList<?>) getLinestyle()).basicRemove(otherEnd, msgs);
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
		case ArkUIModelPackage.LINE_CONTAINER__WIDTH:
			return getWidth();
		case ArkUIModelPackage.LINE_CONTAINER__HEIGHT:
			return getHeight();
		case ArkUIModelPackage.LINE_CONTAINER__LINEEVENT:
			return getLineevent();
		case ArkUIModelPackage.LINE_CONTAINER__LINESTYLE:
			return getLinestyle();
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
		case ArkUIModelPackage.LINE_CONTAINER__WIDTH:
			setWidth((String) newValue);
			return;
		case ArkUIModelPackage.LINE_CONTAINER__HEIGHT:
			setHeight((String) newValue);
			return;
		case ArkUIModelPackage.LINE_CONTAINER__LINEEVENT:
			getLineevent().clear();
			getLineevent().addAll((Collection<? extends LineEvent>) newValue);
			return;
		case ArkUIModelPackage.LINE_CONTAINER__LINESTYLE:
			getLinestyle().clear();
			getLinestyle().addAll((Collection<? extends LineStyle>) newValue);
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
		case ArkUIModelPackage.LINE_CONTAINER__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case ArkUIModelPackage.LINE_CONTAINER__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case ArkUIModelPackage.LINE_CONTAINER__LINEEVENT:
			getLineevent().clear();
			return;
		case ArkUIModelPackage.LINE_CONTAINER__LINESTYLE:
			getLinestyle().clear();
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
		case ArkUIModelPackage.LINE_CONTAINER__WIDTH:
			return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
		case ArkUIModelPackage.LINE_CONTAINER__HEIGHT:
			return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
		case ArkUIModelPackage.LINE_CONTAINER__LINEEVENT:
			return lineevent != null && !lineevent.isEmpty();
		case ArkUIModelPackage.LINE_CONTAINER__LINESTYLE:
			return linestyle != null && !linestyle.isEmpty();
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //LineContainerImpl
