/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.HttpOperation;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arkuimodel.arkUIModel.impl.HttpOperationImpl#getHttpType <em>Http Type</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.HttpOperationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link arkuimodel.arkUIModel.impl.HttpOperationImpl#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpOperationImpl extends SeviceOperationImpl implements HttpOperation {
	/**
	 * The default value of the '{@link #getHttpType() <em>Http Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpType()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getHttpType() <em>Http Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpType()
	 * @generated
	 * @ordered
	 */
	protected String httpType = HTTP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected static final String RES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected String res = RES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArkUIModelPackage.Literals.HTTP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpType() {
		return httpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpType(String newHttpType) {
		String oldHttpType = httpType;
		httpType = newHttpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.HTTP_OPERATION__HTTP_TYPE,
					oldHttpType, httpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.HTTP_OPERATION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRes() {
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRes(String newRes) {
		String oldRes = res;
		res = newRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArkUIModelPackage.HTTP_OPERATION__RES, oldRes, res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArkUIModelPackage.HTTP_OPERATION__HTTP_TYPE:
			return getHttpType();
		case ArkUIModelPackage.HTTP_OPERATION__URL:
			return getUrl();
		case ArkUIModelPackage.HTTP_OPERATION__RES:
			return getRes();
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
		case ArkUIModelPackage.HTTP_OPERATION__HTTP_TYPE:
			setHttpType((String) newValue);
			return;
		case ArkUIModelPackage.HTTP_OPERATION__URL:
			setUrl((String) newValue);
			return;
		case ArkUIModelPackage.HTTP_OPERATION__RES:
			setRes((String) newValue);
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
		case ArkUIModelPackage.HTTP_OPERATION__HTTP_TYPE:
			setHttpType(HTTP_TYPE_EDEFAULT);
			return;
		case ArkUIModelPackage.HTTP_OPERATION__URL:
			setUrl(URL_EDEFAULT);
			return;
		case ArkUIModelPackage.HTTP_OPERATION__RES:
			setRes(RES_EDEFAULT);
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
		case ArkUIModelPackage.HTTP_OPERATION__HTTP_TYPE:
			return HTTP_TYPE_EDEFAULT == null ? httpType != null : !HTTP_TYPE_EDEFAULT.equals(httpType);
		case ArkUIModelPackage.HTTP_OPERATION__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case ArkUIModelPackage.HTTP_OPERATION__RES:
			return RES_EDEFAULT == null ? res != null : !RES_EDEFAULT.equals(res);
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
		result.append(" (httpType: ");
		result.append(httpType);
		result.append(", url: ");
		result.append(url);
		result.append(", res: ");
		result.append(res);
		result.append(')');
		return result.toString();
	}

} //HttpOperationImpl
