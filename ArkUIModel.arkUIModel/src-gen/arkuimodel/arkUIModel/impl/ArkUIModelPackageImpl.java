/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.*;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArkUIModelPackageImpl extends EPackageImpl implements ArkUIModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLogicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageStructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flexContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleLibrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flexStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flexEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seviceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageAnimatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageAnimatorStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageAnimatorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeSkipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getRouteValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiStructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationLibrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callFunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swiperWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swiperStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swiperEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationLibrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageRefrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabsStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabsEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePickerWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePickerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePickerStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datePickerWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datePickerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datePickerStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPickerWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPickerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPickerStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dividerWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dividerStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDialogContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDialogStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDialogEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeDialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminateSelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTimeOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearTimeOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showToastOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRefrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabContentStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridItemContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blankWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blankStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridItemStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridItemEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum devicesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see arkuimodel.arkUIModel.ArkUIModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArkUIModelPackageImpl() {
		super(eNS_URI, ArkUIModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArkUIModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArkUIModelPackage init() {
		if (isInited)
			return (ArkUIModelPackage) EPackage.Registry.INSTANCE.getEPackage(ArkUIModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArkUIModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArkUIModelPackageImpl theArkUIModelPackage = registeredArkUIModelPackage instanceof ArkUIModelPackageImpl
				? (ArkUIModelPackageImpl) registeredArkUIModelPackage
				: new ArkUIModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theArkUIModelPackage.createPackageContents();

		// Initialize created meta-data
		theArkUIModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArkUIModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArkUIModelPackage.eNS_URI, theArkUIModelPackage);
		return theArkUIModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUIModel() {
		return guiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIModel_Name() {
		return (EAttribute) guiModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Stylelibray() {
		return (EReference) guiModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIModel_Description() {
		return (EAttribute) guiModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIModel_Type() {
		return (EAttribute) guiModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Rootpage() {
		return (EReference) guiModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Triggerevent() {
		return (EReference) guiModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Animationlibray() {
		return (EReference) guiModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Uilogic() {
		return (EReference) guiModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Uidesign() {
		return (EReference) guiModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Operationlibray() {
		return (EReference) guiModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_PageTitle() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_IsHome() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_FileName() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Uilogic() {
		return (EReference) pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Uidesign() {
		return (EReference) pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Subpages() {
		return (EReference) pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Pageroute() {
		return (EReference) pageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUILogic() {
		return uiLogicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUILogic_Name() {
		return (EAttribute) uiLogicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUILogic_Workflow() {
		return (EReference) uiLogicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUILogic_Pageparameter() {
		return (EReference) uiLogicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIDesign() {
		return uiDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIDesign_Name() {
		return (EAttribute) uiDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIDesign_Pageview() {
		return (EReference) uiDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageStruct() {
		return pageStructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageStruct_Title() {
		return (EAttribute) pageStructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageStruct_Type() {
		return (EAttribute) pageStructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageStruct_Widgets() {
		return (EReference) pageStructEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageStruct_Pageevent() {
		return (EReference) pageStructEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIComponent() {
		return uiComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponent_Id() {
		return (EAttribute) uiComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponent_WidgetType() {
		return (EAttribute) uiComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIComponent_Widget() {
		return (EReference) uiComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIComponent_Funflow() {
		return (EReference) uiComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIComponent_Root() {
		return (EReference) uiComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIComponent_Pagerefrence() {
		return (EReference) uiComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIComponent_Foreach() {
		return (EReference) uiComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIComponent_If() {
		return (EReference) uiComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponent_Name() {
		return (EAttribute) uiComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextWidget() {
		return textWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextWidget_Content() {
		return (EAttribute) textWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextWidget_Textevent() {
		return (EReference) textWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextWidget_Textstyle() {
		return (EReference) textWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonWidget() {
		return buttonWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonWidget_Label() {
		return (EAttribute) buttonWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonWidget_StateEffect() {
		return (EAttribute) buttonWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonWidget_Type() {
		return (EAttribute) buttonWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonWidget_Buttonevent() {
		return (EReference) buttonWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonWidget_Buttonstyle() {
		return (EReference) buttonWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlexContainer() {
		return flexContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlexContainer_Direction() {
		return (EAttribute) flexContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlexContainer_Wrap() {
		return (EAttribute) flexContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlexContainer_JustifyContent() {
		return (EAttribute) flexContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlexContainer_AlignItems() {
		return (EAttribute) flexContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlexContainer_AlignContent() {
		return (EAttribute) flexContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlexContainer_Flexevent() {
		return (EReference) flexContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlexContainer_Flexstyle() {
		return (EReference) flexContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleLibray() {
		return styleLibrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleLibray_Styleclass() {
		return (EReference) styleLibrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLibray_Name() {
		return (EAttribute) styleLibrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleClass() {
		return styleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Width() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Height() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_AspectRatio() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Paddingleft() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Marginleft() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_LayoutWeight() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Align() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Direction() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Position() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Offset() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_BackgroundColor() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_BackgroundImage() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Border() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Visibility() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Name() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleClass_Animationclass() {
		return (EReference) styleClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Assign() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Paddingright() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Paddingtop() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Paddingbottom() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Marginright() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Margintop() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Marginbottom() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_BorderRadius() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_BackgroundImageSize() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_Rotate() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleClass_ZIndex() {
		return (EAttribute) styleClassEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveOperation() {
		return primitiveOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveOperation_Name() {
		return (EAttribute) primitiveOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveOperation_Contains() {
		return (EReference) primitiveOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveOperation_Returntype() {
		return (EReference) primitiveOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInputWidget() {
		return textInputWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputWidget_Text() {
		return (EAttribute) textInputWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputWidget_Placeholder() {
		return (EAttribute) textInputWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputWidget_Controller() {
		return (EAttribute) textInputWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextInputWidget_Textinputevent() {
		return (EReference) textInputWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextInputWidget_Textinputstyle() {
		return (EReference) textInputWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListContainer() {
		return listContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListContainer_InitialIndex() {
		return (EAttribute) listContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListContainer_Space() {
		return (EAttribute) listContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListContainer_Scroller() {
		return (EAttribute) listContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListContainer_Listitemcontainer() {
		return (EReference) listContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListContainer_Listevent() {
		return (EReference) listContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListContainer_Liststyle() {
		return (EReference) listContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextStyle() {
		return textStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_FontColor() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_FontSize() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_MinFontSize() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_MaxFontSize() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_FontStyle() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_FontWeight() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_TextAlign() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_LineHeight() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_TextOverflow() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_FontFamily() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_MaxLines() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_DecorationType() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_LetterSpacing() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_TextCase() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_BaselineOffset() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyle_DecorationColor() {
		return (EAttribute) textStyleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInputStyle() {
		return textInputStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_Type() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_PlaceholderColor() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_PlaceholderFont() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_EnterKeyType() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_CaretColor() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_MaxLength() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_FontColor() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_FontSize() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_FontStyle() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_FontWeight() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_FontFamily() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputStyle_InputFilter() {
		return (EAttribute) textInputStyleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ParameterType() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_PType() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Assign() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Const() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_State() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeCS() {
		return typeCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeCS_Type() {
		return (EAttribute) typeCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowContainer() {
		return rowContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowContainer_Space() {
		return (EAttribute) rowContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowContainer_AlignItems() {
		return (EAttribute) rowContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowContainer_JustifyContent() {
		return (EAttribute) rowContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowContainer_Rowevent() {
		return (EReference) rowContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowContainer_Rowstyle() {
		return (EReference) rowContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowContainer_BindMenu() {
		return (EReference) rowContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnContainer() {
		return columnContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnContainer_JustifyContent() {
		return (EAttribute) columnContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnContainer_AlignItems() {
		return (EAttribute) columnContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnContainer_Space() {
		return (EAttribute) columnContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnContainer_Columnevent() {
		return (EReference) columnContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnContainer_Columnstyle() {
		return (EReference) columnContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonStyle() {
		return buttonStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlexStyle() {
		return flexStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowStyle() {
		return rowStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnStyle() {
		return columnStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListStyle() {
		return listStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_ListDirection() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_EdgeEffect() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_Divider() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_EditMode() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_ChainAnimation() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_ScrollBar() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_CachedCount() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_StrokeWidth() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_Color() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_StartMargin() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_EndMargin() {
		return (EAttribute) listStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItemStyle() {
		return listItemStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListItemStyle_Sticky() {
		return (EAttribute) listItemStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListItemStyle_Editable() {
		return (EAttribute) listItemStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItemContainer() {
		return listItemContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListItemContainer_Value() {
		return (EAttribute) listItemContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListItemContainer_Listitemevent() {
		return (EReference) listItemContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListItemContainer_Listitemstyle() {
		return (EReference) listItemContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageWidget() {
		return imageWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageWidget_Src() {
		return (EAttribute) imageWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageWidget_Imageevent() {
		return (EReference) imageWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageWidget_Imagestyle() {
		return (EReference) imageWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageStyle() {
		return imageStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_Alt() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_MatchTextDirection() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_FitOriginalSize() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_FillColor() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_ObjectFit() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_ObjectRepeat() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_AutoResize() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_RenderMode() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_Interpolation() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_SourceSizeHeight() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_SyncLoad() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_SourceSizeWidth() {
		return (EAttribute) imageStyleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Target() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Source() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerEvent() {
		return triggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerEvent_Eventclass() {
		return (EReference) triggerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnClick() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnTouch() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnDragStart() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnDragEnter() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnDragMove() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnDragLeave() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnDrop() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnAppear() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnDisAppear() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_OnAreaChange() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageEvent() {
		return pageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageEvent_OnPageHide() {
		return (EAttribute) pageEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageEvent_AboutToAppear() {
		return (EAttribute) pageEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageEvent_OnPageShow() {
		return (EAttribute) pageEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageEvent_OnBackPress() {
		return (EAttribute) pageEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageEvent_AboutToDisappear() {
		return (EAttribute) pageEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnEvent() {
		return columnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowEvent() {
		return rowEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlexEvent() {
		return flexEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageEvent() {
		return imageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageEvent_OnComplete() {
		return (EAttribute) imageEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageEvent_OnError() {
		return (EAttribute) imageEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageEvent_OnFinish() {
		return (EAttribute) imageEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextEvent() {
		return textEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextEvent_OnFocus() {
		return (EAttribute) textEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextEvent_OnBlur() {
		return (EAttribute) textEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonEvent() {
		return buttonEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonEvent_OnBlur() {
		return (EAttribute) buttonEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonEvent_OnFocus() {
		return (EAttribute) buttonEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInputEvent() {
		return textInputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputEvent_OnChange() {
		return (EAttribute) textInputEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputEvent_OnSubmit() {
		return (EAttribute) textInputEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputEvent_OnCopy() {
		return (EAttribute) textInputEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputEvent_OnPaste() {
		return (EAttribute) textInputEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputEvent_OnCut() {
		return (EAttribute) textInputEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputEvent_OnEditChanged() {
		return (EAttribute) textInputEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputEvent_OnEditChange() {
		return (EAttribute) textInputEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListEvent() {
		return listEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnScroll() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnScrollIndex() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnReachStart() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnReachEnd() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnScrollStop() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnItemDelete() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnItemMove() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnBlur() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListEvent_OnFocus() {
		return (EAttribute) listEventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItemEvent() {
		return listItemEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIOperation() {
		return uiOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeviceOperation() {
		return seviceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeviceOperation_Type() {
		return (EAttribute) seviceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopOp() {
		return loopOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOp_Start() {
		return (EAttribute) loopOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOp_End() {
		return (EAttribute) loopOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOp_Step() {
		return (EAttribute) loopOpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopOp_Expression() {
		return (EReference) loopOpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseOp() {
		return caseOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseOp_Expression() {
		return (EReference) caseOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpOperation() {
		return httpOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpOperation_HttpType() {
		return (EAttribute) httpOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpOperation_Url() {
		return (EAttribute) httpOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpOperation_Res() {
		return (EAttribute) httpOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetParameter() {
		return getParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameter_Parm() {
		return (EAttribute) getParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameter_Value() {
		return (EAttribute) getParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetParameter() {
		return setParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetParameter_Value() {
		return (EAttribute) setParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetParameter_Parm() {
		return (EAttribute) setParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationClass() {
		return animationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClass_Duration() {
		return (EAttribute) animationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClass_Curve() {
		return (EAttribute) animationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClass_Delay() {
		return (EAttribute) animationClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClass_Iterations() {
		return (EAttribute) animationClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClass_PlayMode() {
		return (EAttribute) animationClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClass_Name() {
		return (EAttribute) animationClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageAnimator() {
		return imageAnimatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageAnimator_Imagesitem() {
		return (EReference) imageAnimatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageAnimator_Imageanimatorevent() {
		return (EReference) imageAnimatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageAnimator_Imageanimatorstyle() {
		return (EReference) imageAnimatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagesItem() {
		return imagesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagesItem_Src() {
		return (EAttribute) imagesItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagesItem_Width() {
		return (EAttribute) imagesItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagesItem_Height() {
		return (EAttribute) imagesItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagesItem_Top() {
		return (EAttribute) imagesItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagesItem_Left() {
		return (EAttribute) imagesItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagesItem_Duration() {
		return (EAttribute) imagesItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageAnimatorStyle() {
		return imageAnimatorStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorStyle_State() {
		return (EAttribute) imageAnimatorStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorStyle_Duration() {
		return (EAttribute) imageAnimatorStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorStyle_Reverse() {
		return (EAttribute) imageAnimatorStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorStyle_FixedSize() {
		return (EAttribute) imageAnimatorStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorStyle_PreDecode() {
		return (EAttribute) imageAnimatorStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorStyle_FillMode() {
		return (EAttribute) imageAnimatorStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorStyle_Iterations() {
		return (EAttribute) imageAnimatorStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageAnimatorEvent() {
		return imageAnimatorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorEvent_OnStart() {
		return (EAttribute) imageAnimatorEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorEvent_OnPause() {
		return (EAttribute) imageAnimatorEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorEvent_OnRepeat() {
		return (EAttribute) imageAnimatorEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorEvent_OnCancel() {
		return (EAttribute) imageAnimatorEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageAnimatorEvent_OnFinish() {
		return (EAttribute) imageAnimatorEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteSkip() {
		return routeSkipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteSkip_Type() {
		return (EAttribute) routeSkipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteSkip_Url() {
		return (EAttribute) routeSkipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteSkip_Variable() {
		return (EAttribute) routeSkipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteSkip_Page() {
		return (EAttribute) routeSkipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetRouteValue() {
		return getRouteValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetRouteValue_Variable() {
		return (EAttribute) getRouteValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraOperation() {
		return extraOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeqOp() {
		return seqOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqOp_Type() {
		return (EAttribute) seqOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqOp_Value() {
		return (EAttribute) seqOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIStruct() {
		return uiStructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIStruct_Page() {
		return (EReference) uiStructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIStruct_Name() {
		return (EAttribute) uiStructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationLibray() {
		return animationLibrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationLibray_Animationclass() {
		return (EReference) animationLibrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Description() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference) entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SuperEntity() {
		return (EReference) entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Entityrefrence() {
		return (EReference) entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityAttribute() {
		return entityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAttribute_Type() {
		return (EReference) entityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAttribute_Name() {
		return (EAttribute) entityAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Length() {
		return (EAttribute) arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Atype() {
		return (EReference) arrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationContainer() {
		return navigationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationContainer_Toolbar() {
		return (EReference) navigationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationContainer_Menu() {
		return (EReference) navigationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationContainer_Navigationevent() {
		return (EReference) navigationContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationContainer_Navigationstyle() {
		return (EReference) navigationContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationContainer_Title() {
		return (EReference) navigationContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationStyle() {
		return navigationStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationStyle_Title() {
		return (EAttribute) navigationStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationStyle_SubTitle() {
		return (EAttribute) navigationStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationStyle_HideTitleBar() {
		return (EAttribute) navigationStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationStyle_HideBackButton() {
		return (EAttribute) navigationStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationStyle_TitleMode() {
		return (EAttribute) navigationStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationStyle_HideToolBar() {
		return (EAttribute) navigationStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationEvent() {
		return navigationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationEvent_OnTitleModeChange() {
		return (EAttribute) navigationEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerItem() {
		return containerItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerItem_Value() {
		return (EAttribute) containerItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerItem_Icon() {
		return (EAttribute) containerItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerItem_Action() {
		return (EAttribute) containerItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerItems() {
		return containerItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerItems_Items() {
		return (EReference) containerItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerItems_Label() {
		return (EAttribute) containerItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartOp() {
		return startOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndOp() {
		return endOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkFlow() {
		return workFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_Function() {
		return (EReference) workFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkFlow_FlowName() {
		return (EAttribute) workFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_Flowline() {
		return (EReference) workFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkFlow_Type() {
		return (EAttribute) workFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_Workparameter() {
		return (EReference) workFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckEqual() {
		return checkEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowLine() {
		return flowLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowLine_Source() {
		return (EReference) flowLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowLine_Target() {
		return (EReference) flowLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowLine_Type() {
		return (EAttribute) flowLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowLine_Value() {
		return (EAttribute) flowLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Name() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Parameter() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Condition() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Value() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Union() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_ExpressText() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_FunctionType() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Operation() {
		return (EReference) functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Workflow() {
		return (EReference) functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEach() {
		return forEachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEach_Item() {
		return (EAttribute) forEachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEach_Expression() {
		return (EAttribute) forEachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEach_Array() {
		return (EAttribute) forEachEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEach_ArrayType() {
		return (EAttribute) forEachEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIF() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIF_Expression() {
		return (EReference) ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIF_AutoExpression() {
		return (EAttribute) ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallFun() {
		return callFunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallFun_Name() {
		return (EAttribute) callFunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwiperWidget() {
		return swiperWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperWidget_Controller() {
		return (EAttribute) swiperWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwiperWidget_Swiperevent() {
		return (EReference) swiperWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwiperWidget_Swiperstyle() {
		return (EReference) swiperWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwiperStyle() {
		return swiperStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_Index() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_AutoPlay() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_Interval() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_Indicator() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_Loop() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_Duration() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_Vertical() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_ItemSpace() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperStyle_DisplayMode() {
		return (EAttribute) swiperStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwiperEvent() {
		return swiperEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwiperEvent_OnChange() {
		return (EAttribute) swiperEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationLibray() {
		return operationLibrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationLibray_Name() {
		return (EAttribute) operationLibrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationLibray_Workflows() {
		return (EReference) operationLibrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationLibray_Projectparameters() {
		return (EReference) operationLibrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationLibray_Domainmodel() {
		return (EReference) operationLibrayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageRefrence() {
		return pageRefrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageRefrence_Name() {
		return (EAttribute) pageRefrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageRefrence_Parameter() {
		return (EReference) pageRefrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageRefrence_If() {
		return (EReference) pageRefrenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageRefrence_Foreach() {
		return (EReference) pageRefrenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageRefrence_Pageevent() {
		return (EReference) pageRefrenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabsContainer() {
		return tabsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsContainer_BarPosition() {
		return (EAttribute) tabsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsContainer_Index() {
		return (EAttribute) tabsContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabsContainer_Tabs() {
		return (EReference) tabsContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabsContainer_Tabsevent() {
		return (EReference) tabsContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabsContainer_Tabsstyle() {
		return (EReference) tabsContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabContent() {
		return tabContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabContent_TabBar() {
		return (EReference) tabContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabContent_Tabcontentstyle() {
		return (EReference) tabContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabsStyle() {
		return tabsStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsStyle_Scrollable() {
		return (EAttribute) tabsStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsStyle_BarMode() {
		return (EAttribute) tabsStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsStyle_Vertical() {
		return (EAttribute) tabsStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsStyle_BarWidth() {
		return (EAttribute) tabsStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsStyle_BarHeight() {
		return (EAttribute) tabsStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsStyle_AnimationDuration() {
		return (EAttribute) tabsStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabItem() {
		return tabItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabItem_Title() {
		return (EAttribute) tabItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabItem_Image() {
		return (EAttribute) tabItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabItem_SelectedImage() {
		return (EAttribute) tabItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabsEvent() {
		return tabsEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabsEvent_OnChange() {
		return (EAttribute) tabsEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStackContainer() {
		return stackContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStackContainer_Stackevent() {
		return (EReference) stackContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStackContainer_Stackstyle() {
		return (EReference) stackContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStackEvent() {
		return stackEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStackStyle() {
		return stackStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStackStyle_AlignContent() {
		return (EAttribute) stackStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollContainer() {
		return scrollContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScrollContainer_Scrollevent() {
		return (EReference) scrollContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScrollContainer_Scrollstyle() {
		return (EReference) scrollContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollEvent() {
		return scrollEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollEvent_OnScroll() {
		return (EAttribute) scrollEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollEvent_OnScrollEdge() {
		return (EAttribute) scrollEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollEvent_OnScrollEnd() {
		return (EAttribute) scrollEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollStyle() {
		return scrollStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollStyle_Scrollable() {
		return (EAttribute) scrollStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollStyle_ScrollBar() {
		return (EAttribute) scrollStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollStyle_ScrollBarColor() {
		return (EAttribute) scrollStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollStyle_ScrollBarWidth() {
		return (EAttribute) scrollStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollStyle_EdgeEffect() {
		return (EAttribute) scrollStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScroller() {
		return scrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_AssginScroll() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_ScrollType() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_XOffset() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_YOffset() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_Duration() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_Curve() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_Edge() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_Next() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_Direction() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroller_Index() {
		return (EAttribute) scrollerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggleWidget() {
		return toggleWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleWidget_IsOn() {
		return (EAttribute) toggleWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleWidget_ToggleType() {
		return (EAttribute) toggleWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToggleWidget_Toggleevent() {
		return (EReference) toggleWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToggleWidget_Togglestyle() {
		return (EReference) toggleWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggleEvent() {
		return toggleEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleEvent_OnChange() {
		return (EAttribute) toggleEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggleStyle() {
		return toggleStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleStyle_SelectedColor() {
		return (EAttribute) toggleStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleStyle_SwitchPointColor() {
		return (EAttribute) toggleStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePickerWidget() {
		return timePickerWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePickerWidget_Selected() {
		return (EAttribute) timePickerWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePickerWidget_Start() {
		return (EAttribute) timePickerWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePickerWidget_End() {
		return (EAttribute) timePickerWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePickerWidget_Timepickerevent() {
		return (EReference) timePickerWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePickerWidget_Timepickerstyle() {
		return (EReference) timePickerWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePickerEvent() {
		return timePickerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePickerEvent_OnChange() {
		return (EAttribute) timePickerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePickerStyle() {
		return timePickerStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePickerStyle_UseMilitaryTime() {
		return (EAttribute) timePickerStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatePickerWidget() {
		return datePickerWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatePickerWidget_Selected() {
		return (EAttribute) datePickerWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatePickerWidget_Start() {
		return (EAttribute) datePickerWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatePickerWidget_End() {
		return (EAttribute) datePickerWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatePickerWidget_Datepickerevent() {
		return (EReference) datePickerWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatePickerWidget_Datepickerstyle() {
		return (EReference) datePickerWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatePickerEvent() {
		return datePickerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatePickerEvent_OnChange() {
		return (EAttribute) datePickerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatePickerStyle() {
		return datePickerStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatePickerStyle_Lunar() {
		return (EAttribute) datePickerStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPickerWidget() {
		return textPickerWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextPickerWidget_Textpickerevent() {
		return (EReference) textPickerWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextPickerWidget_Textpickerstyle() {
		return (EReference) textPickerWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPickerEvent() {
		return textPickerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPickerEvent_OnChange() {
		return (EAttribute) textPickerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPickerStyle() {
		return textPickerStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPickerStyle_Range() {
		return (EAttribute) textPickerStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPickerStyle_Selected() {
		return (EAttribute) textPickerStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPickerStyle_Value() {
		return (EAttribute) textPickerStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPickerStyle_DefaultPickerItemHeight() {
		return (EAttribute) textPickerStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDividerWidget() {
		return dividerWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDividerWidget_Dividerstyle() {
		return (EReference) dividerWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDividerStyle() {
		return dividerStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDividerStyle_Vertical() {
		return (EAttribute) dividerStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDividerStyle_Color() {
		return (EAttribute) dividerStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDividerStyle_StrokeWidth() {
		return (EAttribute) dividerStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDividerStyle_LineCap() {
		return (EAttribute) dividerStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDialogContainer() {
		return customDialogContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomDialogContainer_Customdialogstyle() {
		return (EReference) customDialogContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomDialogContainer_Customdialogevent() {
		return (EReference) customDialogContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDialogStyle() {
		return customDialogStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDialogStyle_AutoCancel() {
		return (EAttribute) customDialogStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDialogStyle_Alignment() {
		return (EAttribute) customDialogStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDialogStyle_Offsetx() {
		return (EAttribute) customDialogStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDialogStyle_Offsety() {
		return (EAttribute) customDialogStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDialogStyle_CustomStyle() {
		return (EAttribute) customDialogStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDialogStyle_GridCount() {
		return (EAttribute) customDialogStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDialogEvent() {
		return customDialogEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDialogEvent_Cancel() {
		return (EAttribute) customDialogEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDialogEvent_Confirm() {
		return (EAttribute) customDialogEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDialog() {
		return openDialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDialog_AssignDialog() {
		return (EAttribute) openDialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseDialog() {
		return closeDialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloseDialog_AssignDialog() {
		return (EAttribute) closeDialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPreferences() {
		return dataPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPreferences_PreferencesType() {
		return (EAttribute) dataPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPreferences_Preferences() {
		return (EAttribute) dataPreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminateSelf() {
		return terminateSelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTimeOut() {
		return setTimeOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTimeOut_Handler() {
		return (EAttribute) setTimeOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTimeOut_Delay() {
		return (EAttribute) setTimeOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearTimeOut() {
		return clearTimeOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearTimeOut_TimeoutID() {
		return (EAttribute) clearTimeOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShowToastOptions() {
		return showToastOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowToastOptions_Message() {
		return (EAttribute) showToastOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowToastOptions_Duration() {
		return (EAttribute) showToastOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowToastOptions_Bottom() {
		return (EAttribute) showToastOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModel_Name() {
		return (EAttribute) domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModel_Label() {
		return (EAttribute) domainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Entity() {
		return (EReference) domainModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRefrence() {
		return entityRefrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRefrence_Name() {
		return (EAttribute) entityRefrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRefrence_Type() {
		return (EAttribute) entityRefrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRefrence_Entity() {
		return (EReference) entityRefrenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridContainer() {
		return gridContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridContainer_ColumnsTemplate() {
		return (EAttribute) gridContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridContainer_RowsTemplate() {
		return (EAttribute) gridContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridContainer_ColumnsGap() {
		return (EAttribute) gridContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridContainer_RowsGap() {
		return (EAttribute) gridContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridContainer_Gridevent() {
		return (EReference) gridContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridContainer_Gridstyle() {
		return (EReference) gridContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridContainer_Griditemcontainer() {
		return (EReference) gridContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridContainer_CachedCount() {
		return (EAttribute) gridContainerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridEvent() {
		return gridEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridStyle() {
		return gridStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeIndex() {
		return changeIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeIndex_TabsID() {
		return (EAttribute) changeIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeIndex_TabID() {
		return (EAttribute) changeIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabContentStyle() {
		return tabContentStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridItemContainer() {
		return gridItemContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridItemContainer_RowStart() {
		return (EAttribute) gridItemContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridItemContainer_RowEnd() {
		return (EAttribute) gridItemContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridItemContainer_ColumnStart() {
		return (EAttribute) gridItemContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridItemContainer_ColumnEnd() {
		return (EAttribute) gridItemContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridItemContainer_ForceRebuild() {
		return (EAttribute) gridItemContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridItemContainer_Griditemstyle() {
		return (EReference) gridItemContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridItemContainer_Griditemevent() {
		return (EReference) gridItemContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchWidget() {
		return searchWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchWidget_Hint() {
		return (EAttribute) searchWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchWidget_Searchbutton() {
		return (EAttribute) searchWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchWidget_Icon() {
		return (EAttribute) searchWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchWidget_Searchevent() {
		return (EReference) searchWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchWidget_Searchstyle() {
		return (EReference) searchWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchWidget_Value() {
		return (EAttribute) searchWidgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchWidget_Placeholder() {
		return (EAttribute) searchWidgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchEvent() {
		return searchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchEvent_OnSearch() {
		return (EAttribute) searchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchEvent_OnChange() {
		return (EAttribute) searchEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchEvent_OnTranslate() {
		return (EAttribute) searchEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchEvent_OnShare() {
		return (EAttribute) searchEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchEvent_OnSubmit() {
		return (EAttribute) searchEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchStyle() {
		return searchStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStyle_Color() {
		return (EAttribute) searchStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStyle_Placeholdercolor() {
		return (EAttribute) searchStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStyle_Caretcolor() {
		return (EAttribute) searchStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStyle_PlaceholderSize() {
		return (EAttribute) searchStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStyle_PlaceholderWeight() {
		return (EAttribute) searchStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlankWidget() {
		return blankWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlankWidget_Min() {
		return (EAttribute) blankWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlankWidget_Blankstyle() {
		return (EReference) blankWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlankStyle() {
		return blankStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlankStyle_Color() {
		return (EAttribute) blankStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressWidget() {
		return progressWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressWidget_Value() {
		return (EAttribute) progressWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressWidget_Total() {
		return (EAttribute) progressWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressWidget_ProgressType() {
		return (EAttribute) progressWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressWidget_ShowType() {
		return (EAttribute) progressWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgressWidget_Progressevent() {
		return (EReference) progressWidgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgressWidget_Progressstyle() {
		return (EReference) progressWidgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressStyle() {
		return progressStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressStyle_Value() {
		return (EAttribute) progressStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressStyle_StrokeWidth() {
		return (EAttribute) progressStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressStyle_ScaleCount() {
		return (EAttribute) progressStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressStyle_ScaleWidth() {
		return (EAttribute) progressStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressStyle_Color() {
		return (EAttribute) progressStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressEvent() {
		return progressEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineContainer() {
		return lineContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineContainer_Width() {
		return (EAttribute) lineContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineContainer_Height() {
		return (EAttribute) lineContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineContainer_Lineevent() {
		return (EReference) lineContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineContainer_Linestyle() {
		return (EReference) lineContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineEvent() {
		return lineEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStyle() {
		return lineStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStyle_StartPoint() {
		return (EAttribute) lineStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStyle_EndPoint() {
		return (EAttribute) lineStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkOperation() {
		return workOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkOperation_Title() {
		return (EAttribute) workOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridItemStyle() {
		return gridItemStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridItemEvent() {
		return gridItemEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDevicesType() {
		return devicesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecuteType() {
		return executeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpType() {
		return httpTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableType() {
		return variableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPType() {
		return pTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineType() {
		return lineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRouteType() {
		return routeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnionType() {
		return unionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArkUIModelFactory getArkUIModelFactory() {
		return (ArkUIModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		guiModelEClass = createEClass(GUI_MODEL);
		createEAttribute(guiModelEClass, GUI_MODEL__NAME);
		createEReference(guiModelEClass, GUI_MODEL__STYLELIBRAY);
		createEAttribute(guiModelEClass, GUI_MODEL__DESCRIPTION);
		createEAttribute(guiModelEClass, GUI_MODEL__TYPE);
		createEReference(guiModelEClass, GUI_MODEL__ROOTPAGE);
		createEReference(guiModelEClass, GUI_MODEL__TRIGGEREVENT);
		createEReference(guiModelEClass, GUI_MODEL__ANIMATIONLIBRAY);
		createEReference(guiModelEClass, GUI_MODEL__UILOGIC);
		createEReference(guiModelEClass, GUI_MODEL__UIDESIGN);
		createEReference(guiModelEClass, GUI_MODEL__OPERATIONLIBRAY);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__PAGE_TITLE);
		createEAttribute(pageEClass, PAGE__IS_HOME);
		createEAttribute(pageEClass, PAGE__FILE_NAME);
		createEReference(pageEClass, PAGE__UILOGIC);
		createEReference(pageEClass, PAGE__UIDESIGN);
		createEReference(pageEClass, PAGE__SUBPAGES);
		createEReference(pageEClass, PAGE__PAGEROUTE);

		uiLogicEClass = createEClass(UI_LOGIC);
		createEAttribute(uiLogicEClass, UI_LOGIC__NAME);
		createEReference(uiLogicEClass, UI_LOGIC__WORKFLOW);
		createEReference(uiLogicEClass, UI_LOGIC__PAGEPARAMETER);

		uiDesignEClass = createEClass(UI_DESIGN);
		createEAttribute(uiDesignEClass, UI_DESIGN__NAME);
		createEReference(uiDesignEClass, UI_DESIGN__PAGEVIEW);

		pageStructEClass = createEClass(PAGE_STRUCT);
		createEAttribute(pageStructEClass, PAGE_STRUCT__TITLE);
		createEAttribute(pageStructEClass, PAGE_STRUCT__TYPE);
		createEReference(pageStructEClass, PAGE_STRUCT__WIDGETS);
		createEReference(pageStructEClass, PAGE_STRUCT__PAGEEVENT);

		uiComponentEClass = createEClass(UI_COMPONENT);
		createEAttribute(uiComponentEClass, UI_COMPONENT__ID);
		createEAttribute(uiComponentEClass, UI_COMPONENT__WIDGET_TYPE);
		createEReference(uiComponentEClass, UI_COMPONENT__WIDGET);
		createEReference(uiComponentEClass, UI_COMPONENT__FUNFLOW);
		createEReference(uiComponentEClass, UI_COMPONENT__ROOT);
		createEReference(uiComponentEClass, UI_COMPONENT__PAGEREFRENCE);
		createEReference(uiComponentEClass, UI_COMPONENT__FOREACH);
		createEReference(uiComponentEClass, UI_COMPONENT__IF);
		createEAttribute(uiComponentEClass, UI_COMPONENT__NAME);

		textWidgetEClass = createEClass(TEXT_WIDGET);
		createEAttribute(textWidgetEClass, TEXT_WIDGET__CONTENT);
		createEReference(textWidgetEClass, TEXT_WIDGET__TEXTEVENT);
		createEReference(textWidgetEClass, TEXT_WIDGET__TEXTSTYLE);

		buttonWidgetEClass = createEClass(BUTTON_WIDGET);
		createEAttribute(buttonWidgetEClass, BUTTON_WIDGET__LABEL);
		createEAttribute(buttonWidgetEClass, BUTTON_WIDGET__STATE_EFFECT);
		createEAttribute(buttonWidgetEClass, BUTTON_WIDGET__TYPE);
		createEReference(buttonWidgetEClass, BUTTON_WIDGET__BUTTONEVENT);
		createEReference(buttonWidgetEClass, BUTTON_WIDGET__BUTTONSTYLE);

		flexContainerEClass = createEClass(FLEX_CONTAINER);
		createEAttribute(flexContainerEClass, FLEX_CONTAINER__DIRECTION);
		createEAttribute(flexContainerEClass, FLEX_CONTAINER__WRAP);
		createEAttribute(flexContainerEClass, FLEX_CONTAINER__JUSTIFY_CONTENT);
		createEAttribute(flexContainerEClass, FLEX_CONTAINER__ALIGN_ITEMS);
		createEAttribute(flexContainerEClass, FLEX_CONTAINER__ALIGN_CONTENT);
		createEReference(flexContainerEClass, FLEX_CONTAINER__FLEXEVENT);
		createEReference(flexContainerEClass, FLEX_CONTAINER__FLEXSTYLE);

		styleLibrayEClass = createEClass(STYLE_LIBRAY);
		createEReference(styleLibrayEClass, STYLE_LIBRAY__STYLECLASS);
		createEAttribute(styleLibrayEClass, STYLE_LIBRAY__NAME);

		styleClassEClass = createEClass(STYLE_CLASS);
		createEAttribute(styleClassEClass, STYLE_CLASS__WIDTH);
		createEAttribute(styleClassEClass, STYLE_CLASS__HEIGHT);
		createEAttribute(styleClassEClass, STYLE_CLASS__ASPECT_RATIO);
		createEAttribute(styleClassEClass, STYLE_CLASS__PADDINGLEFT);
		createEAttribute(styleClassEClass, STYLE_CLASS__MARGINLEFT);
		createEAttribute(styleClassEClass, STYLE_CLASS__LAYOUT_WEIGHT);
		createEAttribute(styleClassEClass, STYLE_CLASS__ALIGN);
		createEAttribute(styleClassEClass, STYLE_CLASS__DIRECTION);
		createEAttribute(styleClassEClass, STYLE_CLASS__POSITION);
		createEAttribute(styleClassEClass, STYLE_CLASS__OFFSET);
		createEAttribute(styleClassEClass, STYLE_CLASS__BACKGROUND_COLOR);
		createEAttribute(styleClassEClass, STYLE_CLASS__BACKGROUND_IMAGE);
		createEAttribute(styleClassEClass, STYLE_CLASS__BORDER);
		createEAttribute(styleClassEClass, STYLE_CLASS__VISIBILITY);
		createEAttribute(styleClassEClass, STYLE_CLASS__NAME);
		createEReference(styleClassEClass, STYLE_CLASS__ANIMATIONCLASS);
		createEAttribute(styleClassEClass, STYLE_CLASS__ASSIGN);
		createEAttribute(styleClassEClass, STYLE_CLASS__PADDINGRIGHT);
		createEAttribute(styleClassEClass, STYLE_CLASS__PADDINGTOP);
		createEAttribute(styleClassEClass, STYLE_CLASS__PADDINGBOTTOM);
		createEAttribute(styleClassEClass, STYLE_CLASS__MARGINRIGHT);
		createEAttribute(styleClassEClass, STYLE_CLASS__MARGINTOP);
		createEAttribute(styleClassEClass, STYLE_CLASS__MARGINBOTTOM);
		createEAttribute(styleClassEClass, STYLE_CLASS__BORDER_RADIUS);
		createEAttribute(styleClassEClass, STYLE_CLASS__BACKGROUND_IMAGE_SIZE);
		createEAttribute(styleClassEClass, STYLE_CLASS__ROTATE);
		createEAttribute(styleClassEClass, STYLE_CLASS__ZINDEX);

		primitiveOperationEClass = createEClass(PRIMITIVE_OPERATION);
		createEAttribute(primitiveOperationEClass, PRIMITIVE_OPERATION__NAME);
		createEReference(primitiveOperationEClass, PRIMITIVE_OPERATION__CONTAINS);
		createEReference(primitiveOperationEClass, PRIMITIVE_OPERATION__RETURNTYPE);

		textInputWidgetEClass = createEClass(TEXT_INPUT_WIDGET);
		createEAttribute(textInputWidgetEClass, TEXT_INPUT_WIDGET__TEXT);
		createEAttribute(textInputWidgetEClass, TEXT_INPUT_WIDGET__PLACEHOLDER);
		createEAttribute(textInputWidgetEClass, TEXT_INPUT_WIDGET__CONTROLLER);
		createEReference(textInputWidgetEClass, TEXT_INPUT_WIDGET__TEXTINPUTEVENT);
		createEReference(textInputWidgetEClass, TEXT_INPUT_WIDGET__TEXTINPUTSTYLE);

		listContainerEClass = createEClass(LIST_CONTAINER);
		createEAttribute(listContainerEClass, LIST_CONTAINER__INITIAL_INDEX);
		createEAttribute(listContainerEClass, LIST_CONTAINER__SPACE);
		createEAttribute(listContainerEClass, LIST_CONTAINER__SCROLLER);
		createEReference(listContainerEClass, LIST_CONTAINER__LISTITEMCONTAINER);
		createEReference(listContainerEClass, LIST_CONTAINER__LISTEVENT);
		createEReference(listContainerEClass, LIST_CONTAINER__LISTSTYLE);

		textStyleEClass = createEClass(TEXT_STYLE);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_COLOR);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_SIZE);
		createEAttribute(textStyleEClass, TEXT_STYLE__MIN_FONT_SIZE);
		createEAttribute(textStyleEClass, TEXT_STYLE__MAX_FONT_SIZE);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_STYLE);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_WEIGHT);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_ALIGN);
		createEAttribute(textStyleEClass, TEXT_STYLE__LINE_HEIGHT);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_OVERFLOW);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_FAMILY);
		createEAttribute(textStyleEClass, TEXT_STYLE__MAX_LINES);
		createEAttribute(textStyleEClass, TEXT_STYLE__DECORATION_TYPE);
		createEAttribute(textStyleEClass, TEXT_STYLE__LETTER_SPACING);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_CASE);
		createEAttribute(textStyleEClass, TEXT_STYLE__BASELINE_OFFSET);
		createEAttribute(textStyleEClass, TEXT_STYLE__DECORATION_COLOR);

		textInputStyleEClass = createEClass(TEXT_INPUT_STYLE);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__TYPE);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__PLACEHOLDER_COLOR);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__PLACEHOLDER_FONT);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__ENTER_KEY_TYPE);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__CARET_COLOR);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__MAX_LENGTH);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__FONT_COLOR);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__FONT_SIZE);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__FONT_STYLE);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__FONT_WEIGHT);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__FONT_FAMILY);
		createEAttribute(textInputStyleEClass, TEXT_INPUT_STYLE__INPUT_FILTER);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__PARAMETER_TYPE);
		createEAttribute(parameterEClass, PARAMETER__PTYPE);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__ASSIGN);
		createEAttribute(parameterEClass, PARAMETER__CONST);
		createEAttribute(parameterEClass, PARAMETER__STATE);

		typeCSEClass = createEClass(TYPE_CS);
		createEAttribute(typeCSEClass, TYPE_CS__TYPE);

		rowContainerEClass = createEClass(ROW_CONTAINER);
		createEAttribute(rowContainerEClass, ROW_CONTAINER__SPACE);
		createEAttribute(rowContainerEClass, ROW_CONTAINER__ALIGN_ITEMS);
		createEAttribute(rowContainerEClass, ROW_CONTAINER__JUSTIFY_CONTENT);
		createEReference(rowContainerEClass, ROW_CONTAINER__ROWEVENT);
		createEReference(rowContainerEClass, ROW_CONTAINER__ROWSTYLE);
		createEReference(rowContainerEClass, ROW_CONTAINER__BIND_MENU);

		columnContainerEClass = createEClass(COLUMN_CONTAINER);
		createEAttribute(columnContainerEClass, COLUMN_CONTAINER__JUSTIFY_CONTENT);
		createEAttribute(columnContainerEClass, COLUMN_CONTAINER__ALIGN_ITEMS);
		createEAttribute(columnContainerEClass, COLUMN_CONTAINER__SPACE);
		createEReference(columnContainerEClass, COLUMN_CONTAINER__COLUMNEVENT);
		createEReference(columnContainerEClass, COLUMN_CONTAINER__COLUMNSTYLE);

		buttonStyleEClass = createEClass(BUTTON_STYLE);

		flexStyleEClass = createEClass(FLEX_STYLE);

		rowStyleEClass = createEClass(ROW_STYLE);

		columnStyleEClass = createEClass(COLUMN_STYLE);

		listStyleEClass = createEClass(LIST_STYLE);
		createEAttribute(listStyleEClass, LIST_STYLE__LIST_DIRECTION);
		createEAttribute(listStyleEClass, LIST_STYLE__EDGE_EFFECT);
		createEAttribute(listStyleEClass, LIST_STYLE__DIVIDER);
		createEAttribute(listStyleEClass, LIST_STYLE__EDIT_MODE);
		createEAttribute(listStyleEClass, LIST_STYLE__CHAIN_ANIMATION);
		createEAttribute(listStyleEClass, LIST_STYLE__SCROLL_BAR);
		createEAttribute(listStyleEClass, LIST_STYLE__CACHED_COUNT);
		createEAttribute(listStyleEClass, LIST_STYLE__STROKE_WIDTH);
		createEAttribute(listStyleEClass, LIST_STYLE__COLOR);
		createEAttribute(listStyleEClass, LIST_STYLE__START_MARGIN);
		createEAttribute(listStyleEClass, LIST_STYLE__END_MARGIN);

		listItemStyleEClass = createEClass(LIST_ITEM_STYLE);
		createEAttribute(listItemStyleEClass, LIST_ITEM_STYLE__STICKY);
		createEAttribute(listItemStyleEClass, LIST_ITEM_STYLE__EDITABLE);

		listItemContainerEClass = createEClass(LIST_ITEM_CONTAINER);
		createEAttribute(listItemContainerEClass, LIST_ITEM_CONTAINER__VALUE);
		createEReference(listItemContainerEClass, LIST_ITEM_CONTAINER__LISTITEMEVENT);
		createEReference(listItemContainerEClass, LIST_ITEM_CONTAINER__LISTITEMSTYLE);

		imageWidgetEClass = createEClass(IMAGE_WIDGET);
		createEAttribute(imageWidgetEClass, IMAGE_WIDGET__SRC);
		createEReference(imageWidgetEClass, IMAGE_WIDGET__IMAGEEVENT);
		createEReference(imageWidgetEClass, IMAGE_WIDGET__IMAGESTYLE);

		imageStyleEClass = createEClass(IMAGE_STYLE);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__ALT);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__MATCH_TEXT_DIRECTION);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__FIT_ORIGINAL_SIZE);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__FILL_COLOR);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__OBJECT_FIT);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__OBJECT_REPEAT);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__AUTO_RESIZE);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__RENDER_MODE);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__INTERPOLATION);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__SOURCE_SIZE_HEIGHT);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__SYNC_LOAD);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__SOURCE_SIZE_WIDTH);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEReference(controlFlowEClass, CONTROL_FLOW__TARGET);
		createEReference(controlFlowEClass, CONTROL_FLOW__SOURCE);

		triggerEventEClass = createEClass(TRIGGER_EVENT);
		createEReference(triggerEventEClass, TRIGGER_EVENT__EVENTCLASS);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__ON_CLICK);
		createEAttribute(eventEClass, EVENT__ON_TOUCH);
		createEAttribute(eventEClass, EVENT__ON_DRAG_START);
		createEAttribute(eventEClass, EVENT__ON_DRAG_ENTER);
		createEAttribute(eventEClass, EVENT__ON_DRAG_MOVE);
		createEAttribute(eventEClass, EVENT__ON_DRAG_LEAVE);
		createEAttribute(eventEClass, EVENT__ON_DROP);
		createEAttribute(eventEClass, EVENT__ON_APPEAR);
		createEAttribute(eventEClass, EVENT__ON_DIS_APPEAR);
		createEAttribute(eventEClass, EVENT__ON_AREA_CHANGE);
		createEAttribute(eventEClass, EVENT__NAME);

		pageEventEClass = createEClass(PAGE_EVENT);
		createEAttribute(pageEventEClass, PAGE_EVENT__ON_PAGE_HIDE);
		createEAttribute(pageEventEClass, PAGE_EVENT__ABOUT_TO_APPEAR);
		createEAttribute(pageEventEClass, PAGE_EVENT__ON_PAGE_SHOW);
		createEAttribute(pageEventEClass, PAGE_EVENT__ON_BACK_PRESS);
		createEAttribute(pageEventEClass, PAGE_EVENT__ABOUT_TO_DISAPPEAR);

		columnEventEClass = createEClass(COLUMN_EVENT);

		rowEventEClass = createEClass(ROW_EVENT);

		flexEventEClass = createEClass(FLEX_EVENT);

		imageEventEClass = createEClass(IMAGE_EVENT);
		createEAttribute(imageEventEClass, IMAGE_EVENT__ON_COMPLETE);
		createEAttribute(imageEventEClass, IMAGE_EVENT__ON_ERROR);
		createEAttribute(imageEventEClass, IMAGE_EVENT__ON_FINISH);

		textEventEClass = createEClass(TEXT_EVENT);
		createEAttribute(textEventEClass, TEXT_EVENT__ON_FOCUS);
		createEAttribute(textEventEClass, TEXT_EVENT__ON_BLUR);

		buttonEventEClass = createEClass(BUTTON_EVENT);
		createEAttribute(buttonEventEClass, BUTTON_EVENT__ON_BLUR);
		createEAttribute(buttonEventEClass, BUTTON_EVENT__ON_FOCUS);

		textInputEventEClass = createEClass(TEXT_INPUT_EVENT);
		createEAttribute(textInputEventEClass, TEXT_INPUT_EVENT__ON_CHANGE);
		createEAttribute(textInputEventEClass, TEXT_INPUT_EVENT__ON_SUBMIT);
		createEAttribute(textInputEventEClass, TEXT_INPUT_EVENT__ON_COPY);
		createEAttribute(textInputEventEClass, TEXT_INPUT_EVENT__ON_PASTE);
		createEAttribute(textInputEventEClass, TEXT_INPUT_EVENT__ON_CUT);
		createEAttribute(textInputEventEClass, TEXT_INPUT_EVENT__ON_EDIT_CHANGED);
		createEAttribute(textInputEventEClass, TEXT_INPUT_EVENT__ON_EDIT_CHANGE);

		listEventEClass = createEClass(LIST_EVENT);
		createEAttribute(listEventEClass, LIST_EVENT__ON_SCROLL);
		createEAttribute(listEventEClass, LIST_EVENT__ON_SCROLL_INDEX);
		createEAttribute(listEventEClass, LIST_EVENT__ON_REACH_START);
		createEAttribute(listEventEClass, LIST_EVENT__ON_REACH_END);
		createEAttribute(listEventEClass, LIST_EVENT__ON_SCROLL_STOP);
		createEAttribute(listEventEClass, LIST_EVENT__ON_ITEM_DELETE);
		createEAttribute(listEventEClass, LIST_EVENT__ON_ITEM_MOVE);
		createEAttribute(listEventEClass, LIST_EVENT__ON_BLUR);
		createEAttribute(listEventEClass, LIST_EVENT__ON_FOCUS);

		listItemEventEClass = createEClass(LIST_ITEM_EVENT);

		uiOperationEClass = createEClass(UI_OPERATION);

		seviceOperationEClass = createEClass(SEVICE_OPERATION);
		createEAttribute(seviceOperationEClass, SEVICE_OPERATION__TYPE);

		loopOpEClass = createEClass(LOOP_OP);
		createEAttribute(loopOpEClass, LOOP_OP__START);
		createEAttribute(loopOpEClass, LOOP_OP__END);
		createEAttribute(loopOpEClass, LOOP_OP__STEP);
		createEReference(loopOpEClass, LOOP_OP__EXPRESSION);

		caseOpEClass = createEClass(CASE_OP);
		createEReference(caseOpEClass, CASE_OP__EXPRESSION);

		httpOperationEClass = createEClass(HTTP_OPERATION);
		createEAttribute(httpOperationEClass, HTTP_OPERATION__HTTP_TYPE);
		createEAttribute(httpOperationEClass, HTTP_OPERATION__URL);
		createEAttribute(httpOperationEClass, HTTP_OPERATION__RES);

		getParameterEClass = createEClass(GET_PARAMETER);
		createEAttribute(getParameterEClass, GET_PARAMETER__PARM);
		createEAttribute(getParameterEClass, GET_PARAMETER__VALUE);

		setParameterEClass = createEClass(SET_PARAMETER);
		createEAttribute(setParameterEClass, SET_PARAMETER__VALUE);
		createEAttribute(setParameterEClass, SET_PARAMETER__PARM);

		animationClassEClass = createEClass(ANIMATION_CLASS);
		createEAttribute(animationClassEClass, ANIMATION_CLASS__DURATION);
		createEAttribute(animationClassEClass, ANIMATION_CLASS__CURVE);
		createEAttribute(animationClassEClass, ANIMATION_CLASS__DELAY);
		createEAttribute(animationClassEClass, ANIMATION_CLASS__ITERATIONS);
		createEAttribute(animationClassEClass, ANIMATION_CLASS__PLAY_MODE);
		createEAttribute(animationClassEClass, ANIMATION_CLASS__NAME);

		imageAnimatorEClass = createEClass(IMAGE_ANIMATOR);
		createEReference(imageAnimatorEClass, IMAGE_ANIMATOR__IMAGESITEM);
		createEReference(imageAnimatorEClass, IMAGE_ANIMATOR__IMAGEANIMATOREVENT);
		createEReference(imageAnimatorEClass, IMAGE_ANIMATOR__IMAGEANIMATORSTYLE);

		imagesItemEClass = createEClass(IMAGES_ITEM);
		createEAttribute(imagesItemEClass, IMAGES_ITEM__SRC);
		createEAttribute(imagesItemEClass, IMAGES_ITEM__WIDTH);
		createEAttribute(imagesItemEClass, IMAGES_ITEM__HEIGHT);
		createEAttribute(imagesItemEClass, IMAGES_ITEM__TOP);
		createEAttribute(imagesItemEClass, IMAGES_ITEM__LEFT);
		createEAttribute(imagesItemEClass, IMAGES_ITEM__DURATION);

		imageAnimatorStyleEClass = createEClass(IMAGE_ANIMATOR_STYLE);
		createEAttribute(imageAnimatorStyleEClass, IMAGE_ANIMATOR_STYLE__STATE);
		createEAttribute(imageAnimatorStyleEClass, IMAGE_ANIMATOR_STYLE__DURATION);
		createEAttribute(imageAnimatorStyleEClass, IMAGE_ANIMATOR_STYLE__REVERSE);
		createEAttribute(imageAnimatorStyleEClass, IMAGE_ANIMATOR_STYLE__FIXED_SIZE);
		createEAttribute(imageAnimatorStyleEClass, IMAGE_ANIMATOR_STYLE__PRE_DECODE);
		createEAttribute(imageAnimatorStyleEClass, IMAGE_ANIMATOR_STYLE__FILL_MODE);
		createEAttribute(imageAnimatorStyleEClass, IMAGE_ANIMATOR_STYLE__ITERATIONS);

		imageAnimatorEventEClass = createEClass(IMAGE_ANIMATOR_EVENT);
		createEAttribute(imageAnimatorEventEClass, IMAGE_ANIMATOR_EVENT__ON_START);
		createEAttribute(imageAnimatorEventEClass, IMAGE_ANIMATOR_EVENT__ON_PAUSE);
		createEAttribute(imageAnimatorEventEClass, IMAGE_ANIMATOR_EVENT__ON_REPEAT);
		createEAttribute(imageAnimatorEventEClass, IMAGE_ANIMATOR_EVENT__ON_CANCEL);
		createEAttribute(imageAnimatorEventEClass, IMAGE_ANIMATOR_EVENT__ON_FINISH);

		routeSkipEClass = createEClass(ROUTE_SKIP);
		createEAttribute(routeSkipEClass, ROUTE_SKIP__TYPE);
		createEAttribute(routeSkipEClass, ROUTE_SKIP__URL);
		createEAttribute(routeSkipEClass, ROUTE_SKIP__VARIABLE);
		createEAttribute(routeSkipEClass, ROUTE_SKIP__PAGE);

		getRouteValueEClass = createEClass(GET_ROUTE_VALUE);
		createEAttribute(getRouteValueEClass, GET_ROUTE_VALUE__VARIABLE);

		extraOperationEClass = createEClass(EXTRA_OPERATION);

		seqOpEClass = createEClass(SEQ_OP);
		createEAttribute(seqOpEClass, SEQ_OP__TYPE);
		createEAttribute(seqOpEClass, SEQ_OP__VALUE);

		uiStructEClass = createEClass(UI_STRUCT);
		createEReference(uiStructEClass, UI_STRUCT__PAGE);
		createEAttribute(uiStructEClass, UI_STRUCT__NAME);

		animationLibrayEClass = createEClass(ANIMATION_LIBRAY);
		createEReference(animationLibrayEClass, ANIMATION_LIBRAY__ANIMATIONCLASS);

		containerEClass = createEClass(CONTAINER);

		widgetEClass = createEClass(WIDGET);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEAttribute(entityEClass, ENTITY__DESCRIPTION);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEReference(entityEClass, ENTITY__SUPER_ENTITY);
		createEReference(entityEClass, ENTITY__ENTITYREFRENCE);

		entityAttributeEClass = createEClass(ENTITY_ATTRIBUTE);
		createEReference(entityAttributeEClass, ENTITY_ATTRIBUTE__TYPE);
		createEAttribute(entityAttributeEClass, ENTITY_ATTRIBUTE__NAME);

		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__LENGTH);
		createEReference(arrayEClass, ARRAY__ATYPE);

		navigationContainerEClass = createEClass(NAVIGATION_CONTAINER);
		createEReference(navigationContainerEClass, NAVIGATION_CONTAINER__TOOLBAR);
		createEReference(navigationContainerEClass, NAVIGATION_CONTAINER__MENU);
		createEReference(navigationContainerEClass, NAVIGATION_CONTAINER__NAVIGATIONEVENT);
		createEReference(navigationContainerEClass, NAVIGATION_CONTAINER__NAVIGATIONSTYLE);
		createEReference(navigationContainerEClass, NAVIGATION_CONTAINER__TITLE);

		navigationStyleEClass = createEClass(NAVIGATION_STYLE);
		createEAttribute(navigationStyleEClass, NAVIGATION_STYLE__TITLE);
		createEAttribute(navigationStyleEClass, NAVIGATION_STYLE__SUB_TITLE);
		createEAttribute(navigationStyleEClass, NAVIGATION_STYLE__HIDE_TITLE_BAR);
		createEAttribute(navigationStyleEClass, NAVIGATION_STYLE__HIDE_BACK_BUTTON);
		createEAttribute(navigationStyleEClass, NAVIGATION_STYLE__TITLE_MODE);
		createEAttribute(navigationStyleEClass, NAVIGATION_STYLE__HIDE_TOOL_BAR);

		navigationEventEClass = createEClass(NAVIGATION_EVENT);
		createEAttribute(navigationEventEClass, NAVIGATION_EVENT__ON_TITLE_MODE_CHANGE);

		containerItemEClass = createEClass(CONTAINER_ITEM);
		createEAttribute(containerItemEClass, CONTAINER_ITEM__VALUE);
		createEAttribute(containerItemEClass, CONTAINER_ITEM__ICON);
		createEAttribute(containerItemEClass, CONTAINER_ITEM__ACTION);

		containerItemsEClass = createEClass(CONTAINER_ITEMS);
		createEReference(containerItemsEClass, CONTAINER_ITEMS__ITEMS);
		createEAttribute(containerItemsEClass, CONTAINER_ITEMS__LABEL);

		startOpEClass = createEClass(START_OP);

		endOpEClass = createEClass(END_OP);

		workFlowEClass = createEClass(WORK_FLOW);
		createEReference(workFlowEClass, WORK_FLOW__FUNCTION);
		createEAttribute(workFlowEClass, WORK_FLOW__FLOW_NAME);
		createEReference(workFlowEClass, WORK_FLOW__FLOWLINE);
		createEAttribute(workFlowEClass, WORK_FLOW__TYPE);
		createEReference(workFlowEClass, WORK_FLOW__WORKPARAMETER);

		checkEqualEClass = createEClass(CHECK_EQUAL);

		flowLineEClass = createEClass(FLOW_LINE);
		createEReference(flowLineEClass, FLOW_LINE__SOURCE);
		createEReference(flowLineEClass, FLOW_LINE__TARGET);
		createEAttribute(flowLineEClass, FLOW_LINE__TYPE);
		createEAttribute(flowLineEClass, FLOW_LINE__VALUE);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__NAME);
		createEAttribute(expressionEClass, EXPRESSION__PARAMETER);
		createEAttribute(expressionEClass, EXPRESSION__CONDITION);
		createEAttribute(expressionEClass, EXPRESSION__VALUE);
		createEAttribute(expressionEClass, EXPRESSION__UNION);
		createEAttribute(expressionEClass, EXPRESSION__EXPRESS_TEXT);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__FUNCTION_TYPE);
		createEReference(functionEClass, FUNCTION__OPERATION);
		createEReference(functionEClass, FUNCTION__WORKFLOW);
		createEAttribute(functionEClass, FUNCTION__NAME);

		forEachEClass = createEClass(FOR_EACH);
		createEAttribute(forEachEClass, FOR_EACH__ITEM);
		createEAttribute(forEachEClass, FOR_EACH__EXPRESSION);
		createEAttribute(forEachEClass, FOR_EACH__ARRAY);
		createEAttribute(forEachEClass, FOR_EACH__ARRAY_TYPE);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__EXPRESSION);
		createEAttribute(ifEClass, IF__AUTO_EXPRESSION);

		callFunEClass = createEClass(CALL_FUN);
		createEAttribute(callFunEClass, CALL_FUN__NAME);

		swiperWidgetEClass = createEClass(SWIPER_WIDGET);
		createEAttribute(swiperWidgetEClass, SWIPER_WIDGET__CONTROLLER);
		createEReference(swiperWidgetEClass, SWIPER_WIDGET__SWIPEREVENT);
		createEReference(swiperWidgetEClass, SWIPER_WIDGET__SWIPERSTYLE);

		swiperStyleEClass = createEClass(SWIPER_STYLE);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__INDEX);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__AUTO_PLAY);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__INTERVAL);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__INDICATOR);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__LOOP);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__DURATION);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__VERTICAL);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__ITEM_SPACE);
		createEAttribute(swiperStyleEClass, SWIPER_STYLE__DISPLAY_MODE);

		swiperEventEClass = createEClass(SWIPER_EVENT);
		createEAttribute(swiperEventEClass, SWIPER_EVENT__ON_CHANGE);

		operationLibrayEClass = createEClass(OPERATION_LIBRAY);
		createEAttribute(operationLibrayEClass, OPERATION_LIBRAY__NAME);
		createEReference(operationLibrayEClass, OPERATION_LIBRAY__WORKFLOWS);
		createEReference(operationLibrayEClass, OPERATION_LIBRAY__PROJECTPARAMETERS);
		createEReference(operationLibrayEClass, OPERATION_LIBRAY__DOMAINMODEL);

		pageRefrenceEClass = createEClass(PAGE_REFRENCE);
		createEAttribute(pageRefrenceEClass, PAGE_REFRENCE__NAME);
		createEReference(pageRefrenceEClass, PAGE_REFRENCE__PARAMETER);
		createEReference(pageRefrenceEClass, PAGE_REFRENCE__IF);
		createEReference(pageRefrenceEClass, PAGE_REFRENCE__FOREACH);
		createEReference(pageRefrenceEClass, PAGE_REFRENCE__PAGEEVENT);

		tabsContainerEClass = createEClass(TABS_CONTAINER);
		createEAttribute(tabsContainerEClass, TABS_CONTAINER__BAR_POSITION);
		createEAttribute(tabsContainerEClass, TABS_CONTAINER__INDEX);
		createEReference(tabsContainerEClass, TABS_CONTAINER__TABS);
		createEReference(tabsContainerEClass, TABS_CONTAINER__TABSEVENT);
		createEReference(tabsContainerEClass, TABS_CONTAINER__TABSSTYLE);

		tabContentEClass = createEClass(TAB_CONTENT);
		createEReference(tabContentEClass, TAB_CONTENT__TAB_BAR);
		createEReference(tabContentEClass, TAB_CONTENT__TABCONTENTSTYLE);

		tabsStyleEClass = createEClass(TABS_STYLE);
		createEAttribute(tabsStyleEClass, TABS_STYLE__SCROLLABLE);
		createEAttribute(tabsStyleEClass, TABS_STYLE__BAR_MODE);
		createEAttribute(tabsStyleEClass, TABS_STYLE__VERTICAL);
		createEAttribute(tabsStyleEClass, TABS_STYLE__BAR_WIDTH);
		createEAttribute(tabsStyleEClass, TABS_STYLE__BAR_HEIGHT);
		createEAttribute(tabsStyleEClass, TABS_STYLE__ANIMATION_DURATION);

		tabItemEClass = createEClass(TAB_ITEM);
		createEAttribute(tabItemEClass, TAB_ITEM__TITLE);
		createEAttribute(tabItemEClass, TAB_ITEM__IMAGE);
		createEAttribute(tabItemEClass, TAB_ITEM__SELECTED_IMAGE);

		tabsEventEClass = createEClass(TABS_EVENT);
		createEAttribute(tabsEventEClass, TABS_EVENT__ON_CHANGE);

		stackContainerEClass = createEClass(STACK_CONTAINER);
		createEReference(stackContainerEClass, STACK_CONTAINER__STACKEVENT);
		createEReference(stackContainerEClass, STACK_CONTAINER__STACKSTYLE);

		stackEventEClass = createEClass(STACK_EVENT);

		stackStyleEClass = createEClass(STACK_STYLE);
		createEAttribute(stackStyleEClass, STACK_STYLE__ALIGN_CONTENT);

		scrollContainerEClass = createEClass(SCROLL_CONTAINER);
		createEReference(scrollContainerEClass, SCROLL_CONTAINER__SCROLLEVENT);
		createEReference(scrollContainerEClass, SCROLL_CONTAINER__SCROLLSTYLE);

		scrollEventEClass = createEClass(SCROLL_EVENT);
		createEAttribute(scrollEventEClass, SCROLL_EVENT__ON_SCROLL);
		createEAttribute(scrollEventEClass, SCROLL_EVENT__ON_SCROLL_EDGE);
		createEAttribute(scrollEventEClass, SCROLL_EVENT__ON_SCROLL_END);

		scrollStyleEClass = createEClass(SCROLL_STYLE);
		createEAttribute(scrollStyleEClass, SCROLL_STYLE__SCROLLABLE);
		createEAttribute(scrollStyleEClass, SCROLL_STYLE__SCROLL_BAR);
		createEAttribute(scrollStyleEClass, SCROLL_STYLE__SCROLL_BAR_COLOR);
		createEAttribute(scrollStyleEClass, SCROLL_STYLE__SCROLL_BAR_WIDTH);
		createEAttribute(scrollStyleEClass, SCROLL_STYLE__EDGE_EFFECT);

		scrollerEClass = createEClass(SCROLLER);
		createEAttribute(scrollerEClass, SCROLLER__ASSGIN_SCROLL);
		createEAttribute(scrollerEClass, SCROLLER__SCROLL_TYPE);
		createEAttribute(scrollerEClass, SCROLLER__XOFFSET);
		createEAttribute(scrollerEClass, SCROLLER__YOFFSET);
		createEAttribute(scrollerEClass, SCROLLER__DURATION);
		createEAttribute(scrollerEClass, SCROLLER__CURVE);
		createEAttribute(scrollerEClass, SCROLLER__EDGE);
		createEAttribute(scrollerEClass, SCROLLER__NEXT);
		createEAttribute(scrollerEClass, SCROLLER__DIRECTION);
		createEAttribute(scrollerEClass, SCROLLER__INDEX);

		toggleWidgetEClass = createEClass(TOGGLE_WIDGET);
		createEAttribute(toggleWidgetEClass, TOGGLE_WIDGET__IS_ON);
		createEAttribute(toggleWidgetEClass, TOGGLE_WIDGET__TOGGLE_TYPE);
		createEReference(toggleWidgetEClass, TOGGLE_WIDGET__TOGGLEEVENT);
		createEReference(toggleWidgetEClass, TOGGLE_WIDGET__TOGGLESTYLE);

		toggleEventEClass = createEClass(TOGGLE_EVENT);
		createEAttribute(toggleEventEClass, TOGGLE_EVENT__ON_CHANGE);

		toggleStyleEClass = createEClass(TOGGLE_STYLE);
		createEAttribute(toggleStyleEClass, TOGGLE_STYLE__SELECTED_COLOR);
		createEAttribute(toggleStyleEClass, TOGGLE_STYLE__SWITCH_POINT_COLOR);

		timePickerWidgetEClass = createEClass(TIME_PICKER_WIDGET);
		createEAttribute(timePickerWidgetEClass, TIME_PICKER_WIDGET__SELECTED);
		createEAttribute(timePickerWidgetEClass, TIME_PICKER_WIDGET__START);
		createEAttribute(timePickerWidgetEClass, TIME_PICKER_WIDGET__END);
		createEReference(timePickerWidgetEClass, TIME_PICKER_WIDGET__TIMEPICKEREVENT);
		createEReference(timePickerWidgetEClass, TIME_PICKER_WIDGET__TIMEPICKERSTYLE);

		timePickerEventEClass = createEClass(TIME_PICKER_EVENT);
		createEAttribute(timePickerEventEClass, TIME_PICKER_EVENT__ON_CHANGE);

		timePickerStyleEClass = createEClass(TIME_PICKER_STYLE);
		createEAttribute(timePickerStyleEClass, TIME_PICKER_STYLE__USE_MILITARY_TIME);

		datePickerWidgetEClass = createEClass(DATE_PICKER_WIDGET);
		createEAttribute(datePickerWidgetEClass, DATE_PICKER_WIDGET__SELECTED);
		createEAttribute(datePickerWidgetEClass, DATE_PICKER_WIDGET__START);
		createEAttribute(datePickerWidgetEClass, DATE_PICKER_WIDGET__END);
		createEReference(datePickerWidgetEClass, DATE_PICKER_WIDGET__DATEPICKEREVENT);
		createEReference(datePickerWidgetEClass, DATE_PICKER_WIDGET__DATEPICKERSTYLE);

		datePickerEventEClass = createEClass(DATE_PICKER_EVENT);
		createEAttribute(datePickerEventEClass, DATE_PICKER_EVENT__ON_CHANGE);

		datePickerStyleEClass = createEClass(DATE_PICKER_STYLE);
		createEAttribute(datePickerStyleEClass, DATE_PICKER_STYLE__LUNAR);

		textPickerWidgetEClass = createEClass(TEXT_PICKER_WIDGET);
		createEReference(textPickerWidgetEClass, TEXT_PICKER_WIDGET__TEXTPICKEREVENT);
		createEReference(textPickerWidgetEClass, TEXT_PICKER_WIDGET__TEXTPICKERSTYLE);

		textPickerEventEClass = createEClass(TEXT_PICKER_EVENT);
		createEAttribute(textPickerEventEClass, TEXT_PICKER_EVENT__ON_CHANGE);

		textPickerStyleEClass = createEClass(TEXT_PICKER_STYLE);
		createEAttribute(textPickerStyleEClass, TEXT_PICKER_STYLE__RANGE);
		createEAttribute(textPickerStyleEClass, TEXT_PICKER_STYLE__SELECTED);
		createEAttribute(textPickerStyleEClass, TEXT_PICKER_STYLE__VALUE);
		createEAttribute(textPickerStyleEClass, TEXT_PICKER_STYLE__DEFAULT_PICKER_ITEM_HEIGHT);

		dividerWidgetEClass = createEClass(DIVIDER_WIDGET);
		createEReference(dividerWidgetEClass, DIVIDER_WIDGET__DIVIDERSTYLE);

		dividerStyleEClass = createEClass(DIVIDER_STYLE);
		createEAttribute(dividerStyleEClass, DIVIDER_STYLE__VERTICAL);
		createEAttribute(dividerStyleEClass, DIVIDER_STYLE__COLOR);
		createEAttribute(dividerStyleEClass, DIVIDER_STYLE__STROKE_WIDTH);
		createEAttribute(dividerStyleEClass, DIVIDER_STYLE__LINE_CAP);

		customDialogContainerEClass = createEClass(CUSTOM_DIALOG_CONTAINER);
		createEReference(customDialogContainerEClass, CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE);
		createEReference(customDialogContainerEClass, CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT);

		customDialogStyleEClass = createEClass(CUSTOM_DIALOG_STYLE);
		createEAttribute(customDialogStyleEClass, CUSTOM_DIALOG_STYLE__AUTO_CANCEL);
		createEAttribute(customDialogStyleEClass, CUSTOM_DIALOG_STYLE__ALIGNMENT);
		createEAttribute(customDialogStyleEClass, CUSTOM_DIALOG_STYLE__OFFSETX);
		createEAttribute(customDialogStyleEClass, CUSTOM_DIALOG_STYLE__OFFSETY);
		createEAttribute(customDialogStyleEClass, CUSTOM_DIALOG_STYLE__CUSTOM_STYLE);
		createEAttribute(customDialogStyleEClass, CUSTOM_DIALOG_STYLE__GRID_COUNT);

		customDialogEventEClass = createEClass(CUSTOM_DIALOG_EVENT);
		createEAttribute(customDialogEventEClass, CUSTOM_DIALOG_EVENT__CANCEL);
		createEAttribute(customDialogEventEClass, CUSTOM_DIALOG_EVENT__CONFIRM);

		openDialogEClass = createEClass(OPEN_DIALOG);
		createEAttribute(openDialogEClass, OPEN_DIALOG__ASSIGN_DIALOG);

		closeDialogEClass = createEClass(CLOSE_DIALOG);
		createEAttribute(closeDialogEClass, CLOSE_DIALOG__ASSIGN_DIALOG);

		dataPreferencesEClass = createEClass(DATA_PREFERENCES);
		createEAttribute(dataPreferencesEClass, DATA_PREFERENCES__PREFERENCES_TYPE);
		createEAttribute(dataPreferencesEClass, DATA_PREFERENCES__PREFERENCES);

		terminateSelfEClass = createEClass(TERMINATE_SELF);

		setTimeOutEClass = createEClass(SET_TIME_OUT);
		createEAttribute(setTimeOutEClass, SET_TIME_OUT__HANDLER);
		createEAttribute(setTimeOutEClass, SET_TIME_OUT__DELAY);

		clearTimeOutEClass = createEClass(CLEAR_TIME_OUT);
		createEAttribute(clearTimeOutEClass, CLEAR_TIME_OUT__TIMEOUT_ID);

		showToastOptionsEClass = createEClass(SHOW_TOAST_OPTIONS);
		createEAttribute(showToastOptionsEClass, SHOW_TOAST_OPTIONS__MESSAGE);
		createEAttribute(showToastOptionsEClass, SHOW_TOAST_OPTIONS__DURATION);
		createEAttribute(showToastOptionsEClass, SHOW_TOAST_OPTIONS__BOTTOM);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEAttribute(domainModelEClass, DOMAIN_MODEL__NAME);
		createEAttribute(domainModelEClass, DOMAIN_MODEL__LABEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__ENTITY);

		entityRefrenceEClass = createEClass(ENTITY_REFRENCE);
		createEAttribute(entityRefrenceEClass, ENTITY_REFRENCE__NAME);
		createEAttribute(entityRefrenceEClass, ENTITY_REFRENCE__TYPE);
		createEReference(entityRefrenceEClass, ENTITY_REFRENCE__ENTITY);

		gridContainerEClass = createEClass(GRID_CONTAINER);
		createEAttribute(gridContainerEClass, GRID_CONTAINER__COLUMNS_TEMPLATE);
		createEAttribute(gridContainerEClass, GRID_CONTAINER__ROWS_TEMPLATE);
		createEAttribute(gridContainerEClass, GRID_CONTAINER__COLUMNS_GAP);
		createEAttribute(gridContainerEClass, GRID_CONTAINER__ROWS_GAP);
		createEReference(gridContainerEClass, GRID_CONTAINER__GRIDEVENT);
		createEReference(gridContainerEClass, GRID_CONTAINER__GRIDSTYLE);
		createEReference(gridContainerEClass, GRID_CONTAINER__GRIDITEMCONTAINER);
		createEAttribute(gridContainerEClass, GRID_CONTAINER__CACHED_COUNT);

		gridEventEClass = createEClass(GRID_EVENT);

		gridStyleEClass = createEClass(GRID_STYLE);

		changeIndexEClass = createEClass(CHANGE_INDEX);
		createEAttribute(changeIndexEClass, CHANGE_INDEX__TABS_ID);
		createEAttribute(changeIndexEClass, CHANGE_INDEX__TAB_ID);

		tabContentStyleEClass = createEClass(TAB_CONTENT_STYLE);

		gridItemContainerEClass = createEClass(GRID_ITEM_CONTAINER);
		createEAttribute(gridItemContainerEClass, GRID_ITEM_CONTAINER__ROW_START);
		createEAttribute(gridItemContainerEClass, GRID_ITEM_CONTAINER__ROW_END);
		createEAttribute(gridItemContainerEClass, GRID_ITEM_CONTAINER__COLUMN_START);
		createEAttribute(gridItemContainerEClass, GRID_ITEM_CONTAINER__COLUMN_END);
		createEAttribute(gridItemContainerEClass, GRID_ITEM_CONTAINER__FORCE_REBUILD);
		createEReference(gridItemContainerEClass, GRID_ITEM_CONTAINER__GRIDITEMSTYLE);
		createEReference(gridItemContainerEClass, GRID_ITEM_CONTAINER__GRIDITEMEVENT);

		searchWidgetEClass = createEClass(SEARCH_WIDGET);
		createEAttribute(searchWidgetEClass, SEARCH_WIDGET__HINT);
		createEAttribute(searchWidgetEClass, SEARCH_WIDGET__SEARCHBUTTON);
		createEAttribute(searchWidgetEClass, SEARCH_WIDGET__ICON);
		createEReference(searchWidgetEClass, SEARCH_WIDGET__SEARCHEVENT);
		createEReference(searchWidgetEClass, SEARCH_WIDGET__SEARCHSTYLE);
		createEAttribute(searchWidgetEClass, SEARCH_WIDGET__VALUE);
		createEAttribute(searchWidgetEClass, SEARCH_WIDGET__PLACEHOLDER);

		searchEventEClass = createEClass(SEARCH_EVENT);
		createEAttribute(searchEventEClass, SEARCH_EVENT__ON_SEARCH);
		createEAttribute(searchEventEClass, SEARCH_EVENT__ON_CHANGE);
		createEAttribute(searchEventEClass, SEARCH_EVENT__ON_TRANSLATE);
		createEAttribute(searchEventEClass, SEARCH_EVENT__ON_SHARE);
		createEAttribute(searchEventEClass, SEARCH_EVENT__ON_SUBMIT);

		searchStyleEClass = createEClass(SEARCH_STYLE);
		createEAttribute(searchStyleEClass, SEARCH_STYLE__COLOR);
		createEAttribute(searchStyleEClass, SEARCH_STYLE__PLACEHOLDERCOLOR);
		createEAttribute(searchStyleEClass, SEARCH_STYLE__CARETCOLOR);
		createEAttribute(searchStyleEClass, SEARCH_STYLE__PLACEHOLDER_SIZE);
		createEAttribute(searchStyleEClass, SEARCH_STYLE__PLACEHOLDER_WEIGHT);

		blankWidgetEClass = createEClass(BLANK_WIDGET);
		createEAttribute(blankWidgetEClass, BLANK_WIDGET__MIN);
		createEReference(blankWidgetEClass, BLANK_WIDGET__BLANKSTYLE);

		blankStyleEClass = createEClass(BLANK_STYLE);
		createEAttribute(blankStyleEClass, BLANK_STYLE__COLOR);

		progressWidgetEClass = createEClass(PROGRESS_WIDGET);
		createEAttribute(progressWidgetEClass, PROGRESS_WIDGET__VALUE);
		createEAttribute(progressWidgetEClass, PROGRESS_WIDGET__TOTAL);
		createEAttribute(progressWidgetEClass, PROGRESS_WIDGET__PROGRESS_TYPE);
		createEAttribute(progressWidgetEClass, PROGRESS_WIDGET__SHOW_TYPE);
		createEReference(progressWidgetEClass, PROGRESS_WIDGET__PROGRESSEVENT);
		createEReference(progressWidgetEClass, PROGRESS_WIDGET__PROGRESSSTYLE);

		progressStyleEClass = createEClass(PROGRESS_STYLE);
		createEAttribute(progressStyleEClass, PROGRESS_STYLE__VALUE);
		createEAttribute(progressStyleEClass, PROGRESS_STYLE__STROKE_WIDTH);
		createEAttribute(progressStyleEClass, PROGRESS_STYLE__SCALE_COUNT);
		createEAttribute(progressStyleEClass, PROGRESS_STYLE__SCALE_WIDTH);
		createEAttribute(progressStyleEClass, PROGRESS_STYLE__COLOR);

		progressEventEClass = createEClass(PROGRESS_EVENT);

		lineContainerEClass = createEClass(LINE_CONTAINER);
		createEAttribute(lineContainerEClass, LINE_CONTAINER__WIDTH);
		createEAttribute(lineContainerEClass, LINE_CONTAINER__HEIGHT);
		createEReference(lineContainerEClass, LINE_CONTAINER__LINEEVENT);
		createEReference(lineContainerEClass, LINE_CONTAINER__LINESTYLE);

		lineEventEClass = createEClass(LINE_EVENT);

		lineStyleEClass = createEClass(LINE_STYLE);
		createEAttribute(lineStyleEClass, LINE_STYLE__START_POINT);
		createEAttribute(lineStyleEClass, LINE_STYLE__END_POINT);

		workOperationEClass = createEClass(WORK_OPERATION);
		createEAttribute(workOperationEClass, WORK_OPERATION__TITLE);

		gridItemStyleEClass = createEClass(GRID_ITEM_STYLE);

		gridItemEventEClass = createEClass(GRID_ITEM_EVENT);

		// Create enums
		devicesTypeEEnum = createEEnum(DEVICES_TYPE);
		executeTypeEEnum = createEEnum(EXECUTE_TYPE);
		httpTypeEEnum = createEEnum(HTTP_TYPE);
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);
		pTypeEEnum = createEEnum(PTYPE);
		lineTypeEEnum = createEEnum(LINE_TYPE);
		routeTypeEEnum = createEEnum(ROUTE_TYPE);
		unionTypeEEnum = createEEnum(UNION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textWidgetEClass.getESuperTypes().add(this.getWidget());
		buttonWidgetEClass.getESuperTypes().add(this.getWidget());
		flexContainerEClass.getESuperTypes().add(this.getContainer());
		textInputWidgetEClass.getESuperTypes().add(this.getWidget());
		listContainerEClass.getESuperTypes().add(this.getContainer());
		textStyleEClass.getESuperTypes().add(this.getStyleClass());
		textInputStyleEClass.getESuperTypes().add(this.getStyleClass());
		rowContainerEClass.getESuperTypes().add(this.getContainer());
		columnContainerEClass.getESuperTypes().add(this.getContainer());
		buttonStyleEClass.getESuperTypes().add(this.getStyleClass());
		flexStyleEClass.getESuperTypes().add(this.getStyleClass());
		rowStyleEClass.getESuperTypes().add(this.getStyleClass());
		columnStyleEClass.getESuperTypes().add(this.getStyleClass());
		listStyleEClass.getESuperTypes().add(this.getStyleClass());
		listItemStyleEClass.getESuperTypes().add(this.getStyleClass());
		listItemContainerEClass.getESuperTypes().add(this.getContainer());
		imageWidgetEClass.getESuperTypes().add(this.getWidget());
		imageStyleEClass.getESuperTypes().add(this.getStyleClass());
		controlFlowEClass.getESuperTypes().add(this.getPrimitiveOperation());
		pageEventEClass.getESuperTypes().add(this.getEvent());
		columnEventEClass.getESuperTypes().add(this.getEvent());
		rowEventEClass.getESuperTypes().add(this.getEvent());
		flexEventEClass.getESuperTypes().add(this.getEvent());
		imageEventEClass.getESuperTypes().add(this.getEvent());
		textEventEClass.getESuperTypes().add(this.getEvent());
		buttonEventEClass.getESuperTypes().add(this.getEvent());
		textInputEventEClass.getESuperTypes().add(this.getEvent());
		listEventEClass.getESuperTypes().add(this.getEvent());
		listItemEventEClass.getESuperTypes().add(this.getEvent());
		uiOperationEClass.getESuperTypes().add(this.getPrimitiveOperation());
		seviceOperationEClass.getESuperTypes().add(this.getPrimitiveOperation());
		loopOpEClass.getESuperTypes().add(this.getControlFlow());
		caseOpEClass.getESuperTypes().add(this.getControlFlow());
		httpOperationEClass.getESuperTypes().add(this.getSeviceOperation());
		getParameterEClass.getESuperTypes().add(this.getUIOperation());
		setParameterEClass.getESuperTypes().add(this.getUIOperation());
		imageAnimatorEClass.getESuperTypes().add(this.getWidget());
		imageAnimatorStyleEClass.getESuperTypes().add(this.getStyleClass());
		imageAnimatorEventEClass.getESuperTypes().add(this.getEvent());
		routeSkipEClass.getESuperTypes().add(this.getUIOperation());
		getRouteValueEClass.getESuperTypes().add(this.getUIOperation());
		extraOperationEClass.getESuperTypes().add(this.getPrimitiveOperation());
		seqOpEClass.getESuperTypes().add(this.getControlFlow());
		containerEClass.getESuperTypes().add(this.getUIComponent());
		widgetEClass.getESuperTypes().add(this.getUIComponent());
		entityEClass.getESuperTypes().add(this.getTypeCS());
		arrayEClass.getESuperTypes().add(this.getTypeCS());
		navigationContainerEClass.getESuperTypes().add(this.getContainer());
		navigationStyleEClass.getESuperTypes().add(this.getStyleClass());
		navigationEventEClass.getESuperTypes().add(this.getEvent());
		containerItemEClass.getESuperTypes().add(this.getContainer());
		containerItemsEClass.getESuperTypes().add(this.getContainer());
		startOpEClass.getESuperTypes().add(this.getControlFlow());
		endOpEClass.getESuperTypes().add(this.getControlFlow());
		checkEqualEClass.getESuperTypes().add(this.getExtraOperation());
		callFunEClass.getESuperTypes().add(this.getTypeCS());
		swiperWidgetEClass.getESuperTypes().add(this.getContainer());
		swiperStyleEClass.getESuperTypes().add(this.getStyleClass());
		swiperEventEClass.getESuperTypes().add(this.getEvent());
		tabsContainerEClass.getESuperTypes().add(this.getContainer());
		tabContentEClass.getESuperTypes().add(this.getContainer());
		tabsStyleEClass.getESuperTypes().add(this.getStyleClass());
		tabItemEClass.getESuperTypes().add(this.getContainer());
		tabsEventEClass.getESuperTypes().add(this.getEvent());
		stackContainerEClass.getESuperTypes().add(this.getContainer());
		stackEventEClass.getESuperTypes().add(this.getEvent());
		stackStyleEClass.getESuperTypes().add(this.getStyleClass());
		scrollContainerEClass.getESuperTypes().add(this.getContainer());
		scrollEventEClass.getESuperTypes().add(this.getEvent());
		scrollStyleEClass.getESuperTypes().add(this.getStyleClass());
		scrollerEClass.getESuperTypes().add(this.getUIOperation());
		toggleWidgetEClass.getESuperTypes().add(this.getWidget());
		toggleEventEClass.getESuperTypes().add(this.getEvent());
		toggleStyleEClass.getESuperTypes().add(this.getStyleClass());
		timePickerWidgetEClass.getESuperTypes().add(this.getWidget());
		timePickerEventEClass.getESuperTypes().add(this.getEvent());
		timePickerStyleEClass.getESuperTypes().add(this.getStyleClass());
		datePickerWidgetEClass.getESuperTypes().add(this.getWidget());
		datePickerEventEClass.getESuperTypes().add(this.getEvent());
		datePickerStyleEClass.getESuperTypes().add(this.getStyleClass());
		textPickerWidgetEClass.getESuperTypes().add(this.getWidget());
		textPickerEventEClass.getESuperTypes().add(this.getEvent());
		textPickerStyleEClass.getESuperTypes().add(this.getStyleClass());
		dividerWidgetEClass.getESuperTypes().add(this.getWidget());
		dividerStyleEClass.getESuperTypes().add(this.getStyleClass());
		customDialogContainerEClass.getESuperTypes().add(this.getContainer());
		customDialogStyleEClass.getESuperTypes().add(this.getStyleClass());
		customDialogEventEClass.getESuperTypes().add(this.getEvent());
		openDialogEClass.getESuperTypes().add(this.getUIOperation());
		closeDialogEClass.getESuperTypes().add(this.getUIOperation());
		dataPreferencesEClass.getESuperTypes().add(this.getUIOperation());
		terminateSelfEClass.getESuperTypes().add(this.getUIOperation());
		setTimeOutEClass.getESuperTypes().add(this.getUIOperation());
		clearTimeOutEClass.getESuperTypes().add(this.getUIOperation());
		showToastOptionsEClass.getESuperTypes().add(this.getUIOperation());
		gridContainerEClass.getESuperTypes().add(this.getContainer());
		gridEventEClass.getESuperTypes().add(this.getEvent());
		gridStyleEClass.getESuperTypes().add(this.getStyleClass());
		changeIndexEClass.getESuperTypes().add(this.getUIOperation());
		tabContentStyleEClass.getESuperTypes().add(this.getStyleClass());
		gridItemContainerEClass.getESuperTypes().add(this.getContainer());
		searchWidgetEClass.getESuperTypes().add(this.getWidget());
		searchEventEClass.getESuperTypes().add(this.getEvent());
		searchStyleEClass.getESuperTypes().add(this.getStyleClass());
		blankWidgetEClass.getESuperTypes().add(this.getWidget());
		blankStyleEClass.getESuperTypes().add(this.getStyleClass());
		progressWidgetEClass.getESuperTypes().add(this.getWidget());
		progressStyleEClass.getESuperTypes().add(this.getStyleClass());
		progressEventEClass.getESuperTypes().add(this.getEvent());
		lineContainerEClass.getESuperTypes().add(this.getContainer());
		lineEventEClass.getESuperTypes().add(this.getEvent());
		lineStyleEClass.getESuperTypes().add(this.getStyleClass());
		workOperationEClass.getESuperTypes().add(this.getSeviceOperation());
		gridItemStyleEClass.getESuperTypes().add(this.getStyleClass());
		gridItemEventEClass.getESuperTypes().add(this.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(guiModelEClass, GUIModel.class, "GUIModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGUIModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, GUIModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Stylelibray(), this.getStyleLibray(), null, "stylelibray", null, 0, 1,
				GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, GUIModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIModel_Type(), this.getDevicesType(), "type", "", 0, 1, GUIModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Rootpage(), this.getUIStruct(), null, "rootpage", null, 0, 1, GUIModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Triggerevent(), this.getTriggerEvent(), null, "triggerevent", null, 0, 1,
				GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Animationlibray(), this.getAnimationLibray(), null, "animationlibray", null, 0, 1,
				GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Uilogic(), this.getUILogic(), null, "uilogic", null, 0, -1, GUIModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Uidesign(), this.getUIDesign(), null, "uidesign", null, 0, -1, GUIModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Operationlibray(), this.getOperationLibray(), null, "operationlibray", null, 0, 1,
				GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_PageTitle(), ecorePackage.getEString(), "pageTitle", null, 0, 1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_IsHome(), ecorePackage.getEBoolean(), "isHome", "false", 0, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Uilogic(), this.getUILogic(), null, "uilogic", null, 0, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPage_Uidesign(), this.getUIDesign(), null, "uidesign", null, 0, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPage_Subpages(), this.getPage(), null, "subpages", null, 0, -1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPage_Pageroute(), this.getPage(), null, "pageroute", null, 0, -1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(uiLogicEClass, UILogic.class, "UILogic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUILogic_Name(), ecorePackage.getEString(), "name", null, 0, 1, UILogic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUILogic_Workflow(), this.getWorkFlow(), null, "workflow", null, 0, -1, UILogic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUILogic_Pageparameter(), this.getParameter(), null, "pageparameter", null, 0, -1,
				UILogic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDesignEClass, UIDesign.class, "UIDesign", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIDesign_Name(), ecorePackage.getEString(), "name", null, 0, 1, UIDesign.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIDesign_Pageview(), this.getPageStruct(), null, "pageview", null, 0, 1, UIDesign.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageStructEClass, PageStruct.class, "PageStruct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPageStruct_Title(), ecorePackage.getEString(), "title", null, 0, 1, PageStruct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageStruct_Type(), ecorePackage.getEString(), "type", null, 0, 1, PageStruct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageStruct_Widgets(), this.getUIComponent(), null, "widgets", null, 0, -1, PageStruct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageStruct_Pageevent(), this.getPageEvent(), null, "pageevent", null, 0, 1, PageStruct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiComponentEClass, UIComponent.class, "UIComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIComponent_Id(), ecorePackage.getEString(), "id", null, 0, 1, UIComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIComponent_WidgetType(), ecorePackage.getEString(), "widgetType", null, 0, 1,
				UIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUIComponent_Widget(), this.getUIComponent(), null, "widget", null, 0, -1, UIComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIComponent_Funflow(), this.getWorkFlow(), null, "funflow", null, 0, -1, UIComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIComponent_Root(), this.getPageStruct(), null, "root", null, 0, -1, UIComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIComponent_Pagerefrence(), this.getPageRefrence(), null, "pagerefrence", null, 0, -1,
				UIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIComponent_Foreach(), this.getForEach(), null, "foreach", null, 0, 1, UIComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIComponent_If(), this.getIF(), null, "if", null, 0, 1, UIComponent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUIComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, UIComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textWidgetEClass, TextWidget.class, "TextWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextWidget_Content(), ecorePackage.getEString(), "content", null, 0, 1, TextWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextWidget_Textevent(), this.getTextEvent(), null, "textevent", null, 0, 1, TextWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextWidget_Textstyle(), this.getTextStyle(), null, "textstyle", null, 0, 1, TextWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonWidgetEClass, ButtonWidget.class, "ButtonWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonWidget_Label(), ecorePackage.getEString(), "label", null, 0, 1, ButtonWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButtonWidget_StateEffect(), ecorePackage.getEString(), "stateEffect", null, 0, 1,
				ButtonWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getButtonWidget_Type(), ecorePackage.getEString(), "type", null, 0, 1, ButtonWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButtonWidget_Buttonevent(), this.getButtonEvent(), null, "buttonevent", null, 0, 1,
				ButtonWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButtonWidget_Buttonstyle(), this.getButtonStyle(), null, "buttonstyle", null, 0, 1,
				ButtonWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flexContainerEClass, FlexContainer.class, "FlexContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlexContainer_Direction(), ecorePackage.getEString(), "direction", null, 0, 1,
				FlexContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlexContainer_Wrap(), ecorePackage.getEString(), "wrap", null, 0, 1, FlexContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlexContainer_JustifyContent(), ecorePackage.getEString(), "justifyContent", null, 0, 1,
				FlexContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlexContainer_AlignItems(), ecorePackage.getEString(), "alignItems", null, 0, 1,
				FlexContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlexContainer_AlignContent(), ecorePackage.getEString(), "alignContent", null, 0, 1,
				FlexContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFlexContainer_Flexevent(), this.getFlexEvent(), null, "flexevent", null, 0, 1,
				FlexContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlexContainer_Flexstyle(), this.getFlexStyle(), null, "flexstyle", null, 0, 1,
				FlexContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleLibrayEClass, StyleLibray.class, "StyleLibray", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleLibray_Styleclass(), this.getStyleClass(), null, "styleclass", null, 0, -1,
				StyleLibray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLibray_Name(), ecorePackage.getEString(), "name", null, 0, 1, StyleLibray.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleClassEClass, StyleClass.class, "StyleClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleClass_Width(), ecorePackage.getEString(), "width", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Height(), ecorePackage.getEString(), "height", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_AspectRatio(), ecorePackage.getEString(), "aspectRatio", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Paddingleft(), ecorePackage.getEString(), "paddingleft", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Marginleft(), ecorePackage.getEString(), "marginleft", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_LayoutWeight(), ecorePackage.getEString(), "layoutWeight", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Align(), ecorePackage.getEString(), "align", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Position(), ecorePackage.getEString(), "position", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_BackgroundImage(), ecorePackage.getEString(), "backgroundImage", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Border(), ecorePackage.getEString(), "border", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Visibility(), ecorePackage.getEString(), "visibility", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleClass_Animationclass(), this.getAnimationClass(), null, "animationclass", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Assign(), ecorePackage.getEString(), "assign", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Paddingright(), ecorePackage.getEString(), "paddingright", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Paddingtop(), ecorePackage.getEString(), "paddingtop", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Paddingbottom(), ecorePackage.getEString(), "paddingbottom", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Marginright(), ecorePackage.getEString(), "marginright", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Margintop(), ecorePackage.getEString(), "margintop", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Marginbottom(), ecorePackage.getEString(), "marginbottom", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_BorderRadius(), ecorePackage.getEString(), "borderRadius", null, 0, 1,
				StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_BackgroundImageSize(), ecorePackage.getEString(), "backgroundImageSize", null, 0,
				1, StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_Rotate(), ecorePackage.getEString(), "rotate", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleClass_ZIndex(), ecorePackage.getEString(), "zIndex", null, 0, 1, StyleClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveOperationEClass, PrimitiveOperation.class, "PrimitiveOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PrimitiveOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveOperation_Contains(), this.getParameter(), null, "contains", null, 0, -1,
				PrimitiveOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveOperation_Returntype(), this.getParameter(), null, "returntype", null, 0, 1,
				PrimitiveOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputWidgetEClass, TextInputWidget.class, "TextInputWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInputWidget_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextInputWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputWidget_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1,
				TextInputWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputWidget_Controller(), ecorePackage.getEString(), "controller", null, 0, 1,
				TextInputWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTextInputWidget_Textinputevent(), this.getTextInputEvent(), null, "textinputevent", null, 0,
				1, TextInputWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextInputWidget_Textinputstyle(), this.getTextInputStyle(), null, "textinputstyle", null, 0,
				1, TextInputWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listContainerEClass, ListContainer.class, "ListContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListContainer_InitialIndex(), ecorePackage.getEString(), "initialIndex", null, 0, 1,
				ListContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListContainer_Space(), ecorePackage.getEString(), "space", null, 0, 1, ListContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListContainer_Scroller(), ecorePackage.getEString(), "scroller", null, 0, 1,
				ListContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getListContainer_Listitemcontainer(), this.getListItemContainer(), null, "listitemcontainer",
				null, 0, -1, ListContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListContainer_Listevent(), this.getListEvent(), null, "listevent", null, 0, 1,
				ListContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListContainer_Liststyle(), this.getListStyle(), null, "liststyle", null, 0, 1,
				ListContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textStyleEClass, TextStyle.class, "TextStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextStyle_FontColor(), ecorePackage.getEString(), "fontColor", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontSize(), ecorePackage.getEString(), "fontSize", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_MinFontSize(), ecorePackage.getEString(), "minFontSize", null, 0, 1,
				TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_MaxFontSize(), ecorePackage.getEString(), "maxFontSize", null, 0, 1,
				TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontStyle(), ecorePackage.getEString(), "fontStyle", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontWeight(), ecorePackage.getEString(), "fontWeight", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextAlign(), ecorePackage.getEString(), "textAlign", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_LineHeight(), ecorePackage.getEString(), "lineHeight", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextOverflow(), ecorePackage.getEString(), "textOverflow", null, 0, 1,
				TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontFamily(), ecorePackage.getEString(), "fontFamily", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_MaxLines(), ecorePackage.getEString(), "maxLines", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_DecorationType(), ecorePackage.getEString(), "decorationType", null, 0, 1,
				TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_LetterSpacing(), ecorePackage.getEString(), "letterSpacing", null, 0, 1,
				TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextCase(), ecorePackage.getEString(), "textCase", null, 0, 1, TextStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_BaselineOffset(), ecorePackage.getEString(), "baselineOffset", null, 0, 1,
				TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_DecorationColor(), ecorePackage.getEString(), "decorationColor", null, 0, 1,
				TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(textInputStyleEClass, TextInputStyle.class, "TextInputStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInputStyle_Type(), ecorePackage.getEString(), "type", null, 0, 1, TextInputStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_PlaceholderColor(), ecorePackage.getEString(), "placeholderColor", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_PlaceholderFont(), ecorePackage.getEString(), "placeholderFont", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_EnterKeyType(), ecorePackage.getEString(), "enterKeyType", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_CaretColor(), ecorePackage.getEString(), "caretColor", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_MaxLength(), ecorePackage.getEString(), "maxLength", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_FontColor(), ecorePackage.getEString(), "fontColor", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_FontSize(), ecorePackage.getEString(), "fontSize", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_FontStyle(), ecorePackage.getEString(), "fontStyle", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_FontWeight(), ecorePackage.getEString(), "fontWeight", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_FontFamily(), ecorePackage.getEString(), "fontFamily", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputStyle_InputFilter(), ecorePackage.getEString(), "inputFilter", null, 0, 1,
				TextInputStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getTypeCS(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getParameter_ParameterType(), this.getPType(), "parameterType", "", 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_PType(), ecorePackage.getEString(), "pType", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Assign(), ecorePackage.getEString(), "assign", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Const(), ecorePackage.getEBoolean(), "const", "false", 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_State(), ecorePackage.getEString(), "state", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeCSEClass, TypeCS.class, "TypeCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeCS_Type(), ecorePackage.getEString(), "type", "", 0, 1, TypeCS.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowContainerEClass, RowContainer.class, "RowContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRowContainer_Space(), ecorePackage.getEString(), "space", null, 0, 1, RowContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowContainer_AlignItems(), ecorePackage.getEString(), "alignItems", null, 0, 1,
				RowContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowContainer_JustifyContent(), ecorePackage.getEString(), "justifyContent", null, 0, 1,
				RowContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRowContainer_Rowevent(), this.getRowEvent(), null, "rowevent", null, 0, 1, RowContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRowContainer_Rowstyle(), this.getRowStyle(), null, "rowstyle", null, 0, 1, RowContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRowContainer_BindMenu(), this.getContainerItems(), null, "bindMenu", null, 0, 1,
				RowContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnContainerEClass, ColumnContainer.class, "ColumnContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnContainer_JustifyContent(), ecorePackage.getEString(), "justifyContent", null, 0, 1,
				ColumnContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnContainer_AlignItems(), ecorePackage.getEString(), "alignItems", null, 0, 1,
				ColumnContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnContainer_Space(), ecorePackage.getEString(), "space", null, 0, 1,
				ColumnContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getColumnContainer_Columnevent(), this.getColumnEvent(), null, "columnevent", null, 0, 1,
				ColumnContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnContainer_Columnstyle(), this.getColumnStyle(), null, "columnstyle", null, 0, 1,
				ColumnContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonStyleEClass, ButtonStyle.class, "ButtonStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(flexStyleEClass, FlexStyle.class, "FlexStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rowStyleEClass, RowStyle.class, "RowStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnStyleEClass, ColumnStyle.class, "ColumnStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(listStyleEClass, ListStyle.class, "ListStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListStyle_ListDirection(), ecorePackage.getEString(), "listDirection", null, 0, 1,
				ListStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_EdgeEffect(), ecorePackage.getEString(), "edgeEffect", null, 0, 1, ListStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_Divider(), ecorePackage.getEString(), "divider", null, 0, 1, ListStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_EditMode(), ecorePackage.getEString(), "editMode", null, 0, 1, ListStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_ChainAnimation(), ecorePackage.getEString(), "chainAnimation", null, 0, 1,
				ListStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_ScrollBar(), ecorePackage.getEString(), "scrollBar", null, 0, 1, ListStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_CachedCount(), ecorePackage.getEString(), "cachedCount", null, 0, 1,
				ListStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_StrokeWidth(), ecorePackage.getEString(), "strokeWidth", null, 0, 1,
				ListStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, ListStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_StartMargin(), ecorePackage.getEString(), "startMargin", null, 0, 1,
				ListStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_EndMargin(), ecorePackage.getEString(), "endMargin", null, 0, 1, ListStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemStyleEClass, ListItemStyle.class, "ListItemStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItemStyle_Sticky(), ecorePackage.getEString(), "sticky", null, 0, 1, ListItemStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListItemStyle_Editable(), ecorePackage.getEString(), "editable", null, 0, 1,
				ListItemStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(listItemContainerEClass, ListItemContainer.class, "ListItemContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItemContainer_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				ListItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getListItemContainer_Listitemevent(), this.getListItemEvent(), null, "listitemevent", null, 0, 1,
				ListItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListItemContainer_Listitemstyle(), this.getListItemStyle(), null, "listitemstyle", null, 0, 1,
				ListItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageWidgetEClass, ImageWidget.class, "ImageWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageWidget_Src(), ecorePackage.getEString(), "src", null, 0, 1, ImageWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageWidget_Imageevent(), this.getImageEvent(), null, "imageevent", null, 0, 1,
				ImageWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageWidget_Imagestyle(), this.getImageStyle(), null, "imagestyle", null, 0, 1,
				ImageWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageStyleEClass, ImageStyle.class, "ImageStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageStyle_Alt(), ecorePackage.getEString(), "alt", null, 0, 1, ImageStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_MatchTextDirection(), ecorePackage.getEString(), "matchTextDirection", null, 0, 1,
				ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_FitOriginalSize(), ecorePackage.getEString(), "fitOriginalSize", null, 0, 1,
				ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_FillColor(), ecorePackage.getEString(), "fillColor", null, 0, 1, ImageStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_ObjectFit(), ecorePackage.getEString(), "objectFit", null, 0, 1, ImageStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_ObjectRepeat(), ecorePackage.getEString(), "objectRepeat", null, 0, 1,
				ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_AutoResize(), ecorePackage.getEString(), "autoResize", null, 0, 1,
				ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_RenderMode(), ecorePackage.getEString(), "renderMode", null, 0, 1,
				ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_Interpolation(), ecorePackage.getEString(), "interpolation", null, 0, 1,
				ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_SourceSizeHeight(), ecorePackage.getEString(), "sourceSizeHeight", null, 0, 1,
				ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_SyncLoad(), ecorePackage.getEString(), "syncLoad", null, 0, 1, ImageStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageStyle_SourceSizeWidth(), ecorePackage.getEString(), "sourceSizeWidth", null, 0, 1,
				ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlow_Target(), this.getFunction(), null, "target", null, 0, 1, ControlFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Source(), this.getFunction(), null, "source", null, 0, 1, ControlFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEventEClass, TriggerEvent.class, "TriggerEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerEvent_Eventclass(), this.getEvent(), null, "eventclass", null, 0, -1,
				TriggerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_OnClick(), ecorePackage.getEString(), "onClick", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnTouch(), ecorePackage.getEString(), "onTouch", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnDragStart(), ecorePackage.getEString(), "onDragStart", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnDragEnter(), ecorePackage.getEString(), "onDragEnter", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnDragMove(), ecorePackage.getEString(), "onDragMove", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnDragLeave(), ecorePackage.getEString(), "onDragLeave", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnDrop(), ecorePackage.getEString(), "onDrop", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnAppear(), ecorePackage.getEString(), "onAppear", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnDisAppear(), ecorePackage.getEString(), "onDisAppear", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_OnAreaChange(), ecorePackage.getEString(), "onAreaChange", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEventEClass, PageEvent.class, "PageEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPageEvent_OnPageHide(), ecorePackage.getEString(), "onPageHide", null, 0, 1, PageEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageEvent_AboutToAppear(), ecorePackage.getEString(), "aboutToAppear", null, 0, 1,
				PageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageEvent_OnPageShow(), ecorePackage.getEString(), "onPageShow", null, 0, 1, PageEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageEvent_OnBackPress(), ecorePackage.getEString(), "onBackPress", null, 0, 1,
				PageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageEvent_AboutToDisappear(), ecorePackage.getEString(), "aboutToDisappear", null, 0, 1,
				PageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(columnEventEClass, ColumnEvent.class, "ColumnEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rowEventEClass, RowEvent.class, "RowEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(flexEventEClass, FlexEvent.class, "FlexEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEventEClass, ImageEvent.class, "ImageEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageEvent_OnComplete(), ecorePackage.getEString(), "onComplete", null, 0, 1,
				ImageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageEvent_OnError(), ecorePackage.getEString(), "onError", null, 0, 1, ImageEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageEvent_OnFinish(), ecorePackage.getEString(), "onFinish", null, 0, 1, ImageEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEventEClass, TextEvent.class, "TextEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextEvent_OnFocus(), ecorePackage.getEString(), "onFocus", null, 0, 1, TextEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextEvent_OnBlur(), ecorePackage.getEString(), "onBlur", null, 0, 1, TextEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEventEClass, ButtonEvent.class, "ButtonEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonEvent_OnBlur(), ecorePackage.getEString(), "onBlur", null, 0, 1, ButtonEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButtonEvent_OnFocus(), ecorePackage.getEString(), "onFocus", null, 0, 1, ButtonEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputEventEClass, TextInputEvent.class, "TextInputEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInputEvent_OnChange(), ecorePackage.getEString(), "onChange", null, 0, 1,
				TextInputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputEvent_OnSubmit(), ecorePackage.getEString(), "onSubmit", null, 0, 1,
				TextInputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputEvent_OnCopy(), ecorePackage.getEString(), "onCopy", null, 0, 1,
				TextInputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputEvent_OnPaste(), ecorePackage.getEString(), "onPaste", null, 0, 1,
				TextInputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputEvent_OnCut(), ecorePackage.getEString(), "onCut", null, 0, 1, TextInputEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputEvent_OnEditChanged(), ecorePackage.getEString(), "onEditChanged", null, 0, 1,
				TextInputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputEvent_OnEditChange(), ecorePackage.getEString(), "onEditChange", null, 0, 1,
				TextInputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(listEventEClass, ListEvent.class, "ListEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListEvent_OnScroll(), ecorePackage.getEString(), "onScroll", null, 0, 1, ListEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListEvent_OnScrollIndex(), ecorePackage.getEString(), "onScrollIndex", null, 0, 1,
				ListEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListEvent_OnReachStart(), ecorePackage.getEString(), "onReachStart", null, 0, 1,
				ListEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListEvent_OnReachEnd(), ecorePackage.getEString(), "onReachEnd", null, 0, 1, ListEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListEvent_OnScrollStop(), ecorePackage.getEString(), "onScrollStop", null, 0, 1,
				ListEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListEvent_OnItemDelete(), ecorePackage.getEString(), "onItemDelete", null, 0, 1,
				ListEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListEvent_OnItemMove(), ecorePackage.getEString(), "onItemMove", null, 0, 1, ListEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListEvent_OnBlur(), ecorePackage.getEString(), "onBlur", null, 0, 1, ListEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListEvent_OnFocus(), ecorePackage.getEString(), "onFocus", null, 0, 1, ListEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemEventEClass, ListItemEvent.class, "ListItemEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiOperationEClass, UIOperation.class, "UIOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(seviceOperationEClass, SeviceOperation.class, "SeviceOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeviceOperation_Type(), ecorePackage.getEString(), "type", "", 0, 1, SeviceOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopOpEClass, LoopOp.class, "LoopOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoopOp_Start(), ecorePackage.getEString(), "start", null, 0, 1, LoopOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOp_End(), ecorePackage.getEString(), "end", null, 0, 1, LoopOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOp_Step(), ecorePackage.getEString(), "step", null, 0, 1, LoopOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopOp_Expression(), this.getExpression(), null, "expression", null, 0, 1, LoopOp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseOpEClass, CaseOp.class, "CaseOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseOp_Expression(), this.getExpression(), null, "expression", null, 0, -1, CaseOp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpOperationEClass, HttpOperation.class, "HttpOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpOperation_HttpType(), ecorePackage.getEString(), "httpType", "", 0, 1,
				HttpOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpOperation_Url(), ecorePackage.getEString(), "url", null, 0, 1, HttpOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpOperation_Res(), ecorePackage.getEString(), "res", null, 0, 1, HttpOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getParameterEClass, GetParameter.class, "GetParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetParameter_Parm(), ecorePackage.getEString(), "parm", null, 0, 1, GetParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, GetParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setParameterEClass, SetParameter.class, "SetParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, SetParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetParameter_Parm(), ecorePackage.getEString(), "parm", null, 0, 1, SetParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animationClassEClass, AnimationClass.class, "AnimationClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimationClass_Duration(), ecorePackage.getEString(), "duration", null, 0, 1,
				AnimationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimationClass_Curve(), ecorePackage.getEString(), "curve", null, 0, 1, AnimationClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimationClass_Delay(), ecorePackage.getEString(), "delay", null, 0, 1, AnimationClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimationClass_Iterations(), ecorePackage.getEString(), "iterations", null, 0, 1,
				AnimationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimationClass_PlayMode(), ecorePackage.getEString(), "playMode", null, 0, 1,
				AnimationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimationClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, AnimationClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageAnimatorEClass, ImageAnimator.class, "ImageAnimator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageAnimator_Imagesitem(), this.getImagesItem(), null, "imagesitem", null, 0, -1,
				ImageAnimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageAnimator_Imageanimatorevent(), this.getImageAnimatorEvent(), null, "imageanimatorevent",
				null, 0, 1, ImageAnimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageAnimator_Imageanimatorstyle(), this.getImageAnimatorStyle(), null, "imageanimatorstyle",
				null, 0, 1, ImageAnimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagesItemEClass, ImagesItem.class, "ImagesItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImagesItem_Src(), ecorePackage.getEString(), "src", null, 0, 1, ImagesItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagesItem_Width(), ecorePackage.getEString(), "width", null, 0, 1, ImagesItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagesItem_Height(), ecorePackage.getEString(), "height", null, 0, 1, ImagesItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagesItem_Top(), ecorePackage.getEString(), "top", null, 0, 1, ImagesItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagesItem_Left(), ecorePackage.getEString(), "left", null, 0, 1, ImagesItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagesItem_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, ImagesItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageAnimatorStyleEClass, ImageAnimatorStyle.class, "ImageAnimatorStyle", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageAnimatorStyle_State(), ecorePackage.getEString(), "state", null, 0, 1,
				ImageAnimatorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorStyle_Duration(), ecorePackage.getEString(), "duration", null, 0, 1,
				ImageAnimatorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorStyle_Reverse(), ecorePackage.getEString(), "reverse", null, 0, 1,
				ImageAnimatorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorStyle_FixedSize(), ecorePackage.getEString(), "fixedSize", null, 0, 1,
				ImageAnimatorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorStyle_PreDecode(), ecorePackage.getEString(), "preDecode", null, 0, 1,
				ImageAnimatorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorStyle_FillMode(), ecorePackage.getEString(), "fillMode", null, 0, 1,
				ImageAnimatorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorStyle_Iterations(), ecorePackage.getEString(), "iterations", null, 0, 1,
				ImageAnimatorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(imageAnimatorEventEClass, ImageAnimatorEvent.class, "ImageAnimatorEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageAnimatorEvent_OnStart(), ecorePackage.getEString(), "onStart", null, 0, 1,
				ImageAnimatorEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorEvent_OnPause(), ecorePackage.getEString(), "onPause", null, 0, 1,
				ImageAnimatorEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorEvent_OnRepeat(), ecorePackage.getEString(), "onRepeat", null, 0, 1,
				ImageAnimatorEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorEvent_OnCancel(), ecorePackage.getEString(), "onCancel", null, 0, 1,
				ImageAnimatorEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageAnimatorEvent_OnFinish(), ecorePackage.getEString(), "onFinish", null, 0, 1,
				ImageAnimatorEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(routeSkipEClass, RouteSkip.class, "RouteSkip", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouteSkip_Type(), ecorePackage.getEString(), "type", "", 0, 1, RouteSkip.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteSkip_Url(), ecorePackage.getEString(), "url", null, 0, 1, RouteSkip.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteSkip_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, RouteSkip.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteSkip_Page(), ecorePackage.getEString(), "page", null, 0, 1, RouteSkip.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getRouteValueEClass, GetRouteValue.class, "GetRouteValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetRouteValue_Variable(), ecorePackage.getEString(), "variable", null, 0, 1,
				GetRouteValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(extraOperationEClass, ExtraOperation.class, "ExtraOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(seqOpEClass, SeqOp.class, "SeqOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeqOp_Type(), this.getLineType(), "type", "", 0, 1, SeqOp.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqOp_Value(), ecorePackage.getEString(), "value", null, 0, 1, SeqOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiStructEClass, UIStruct.class, "UIStruct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIStruct_Page(), this.getPage(), null, "page", null, 0, -1, UIStruct.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUIStruct_Name(), ecorePackage.getEString(), "name", null, 0, 1, UIStruct.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animationLibrayEClass, AnimationLibray.class, "AnimationLibray", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnimationLibray_Animationclass(), this.getAnimationClass(), null, "animationclass", null, 0,
				-1, AnimationLibray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, arkuimodel.arkUIModel.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Attributes(), this.getEntityAttribute(), null, "attributes", null, 0, -1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SuperEntity(), this.getEntity(), null, "superEntity", null, 0, 1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Entityrefrence(), this.getEntityRefrence(), null, "entityrefrence", null, 0, -1,
				Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityAttributeEClass, EntityAttribute.class, "EntityAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityAttribute_Type(), this.getTypeCS(), null, "type", null, 0, 1, EntityAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Array.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArray_Atype(), this.getTypeCS(), null, "atype", null, 0, 1, Array.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(navigationContainerEClass, NavigationContainer.class, "NavigationContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationContainer_Toolbar(), this.getContainerItems(), null, "toolbar", null, 0, 1,
				NavigationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationContainer_Menu(), this.getContainerItems(), null, "menu", null, 0, 1,
				NavigationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationContainer_Navigationevent(), this.getNavigationEvent(), null, "navigationevent",
				null, 0, 1, NavigationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationContainer_Navigationstyle(), this.getNavigationStyle(), null, "navigationstyle",
				null, 0, 1, NavigationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationContainer_Title(), this.getContainerItems(), null, "title", null, 0, 1,
				NavigationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationStyleEClass, NavigationStyle.class, "NavigationStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationStyle_Title(), ecorePackage.getEString(), "title", null, 0, 1,
				NavigationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationStyle_SubTitle(), ecorePackage.getEString(), "subTitle", null, 0, 1,
				NavigationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationStyle_HideTitleBar(), ecorePackage.getEBoolean(), "hideTitleBar", null, 0, 1,
				NavigationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationStyle_HideBackButton(), ecorePackage.getEBoolean(), "hideBackButton", null, 0, 1,
				NavigationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationStyle_TitleMode(), ecorePackage.getEString(), "titleMode", null, 0, 1,
				NavigationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationStyle_HideToolBar(), ecorePackage.getEBoolean(), "hideToolBar", null, 0, 1,
				NavigationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(navigationEventEClass, NavigationEvent.class, "NavigationEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationEvent_OnTitleModeChange(), ecorePackage.getEString(), "onTitleModeChange", null, 0,
				1, NavigationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(containerItemEClass, ContainerItem.class, "ContainerItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, ContainerItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerItem_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, ContainerItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerItem_Action(), ecorePackage.getEString(), "action", null, 0, 1, ContainerItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerItemsEClass, ContainerItems.class, "ContainerItems", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerItems_Items(), this.getContainerItem(), null, "items", null, 0, -1,
				ContainerItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerItems_Label(), ecorePackage.getEString(), "label", null, 0, 1, ContainerItems.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startOpEClass, StartOp.class, "StartOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endOpEClass, EndOp.class, "EndOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workFlowEClass, WorkFlow.class, "WorkFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkFlow_Function(), this.getFunction(), null, "function", null, 0, -1, WorkFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkFlow_FlowName(), ecorePackage.getEString(), "flowName", null, 0, 1, WorkFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlow_Flowline(), this.getFlowLine(), null, "flowline", null, 0, -1, WorkFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkFlow_Type(), this.getExecuteType(), "type", "", 0, 1, WorkFlow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlow_Workparameter(), this.getParameter(), null, "workparameter", null, 0, -1,
				WorkFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEqualEClass, CheckEqual.class, "CheckEqual", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowLineEClass, FlowLine.class, "FlowLine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowLine_Source(), this.getFunction(), null, "source", null, 0, 1, FlowLine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowLine_Target(), this.getFunction(), null, "target", null, 0, 1, FlowLine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLine_Type(), this.getLineType(), "type", "", 0, 1, FlowLine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLine_Value(), ecorePackage.getEString(), "value", null, 0, 1, FlowLine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, Expression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, Expression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Condition(), ecorePackage.getEString(), "condition", "", 0, 1, Expression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, Expression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Union(), this.getUnionType(), "union", "", 0, 1, Expression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_ExpressText(), ecorePackage.getEString(), "expressText", null, 0, 1,
				Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_FunctionType(), ecorePackage.getEString(), "functionType", null, 0, 1,
				Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Operation(), this.getPrimitiveOperation(), null, "operation", null, 0, 1,
				Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Workflow(), this.getWorkFlow(), null, "workflow", null, 0, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachEClass, ForEach.class, "ForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForEach_Item(), ecorePackage.getEString(), "item", null, 0, 1, ForEach.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEach_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, ForEach.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEach_Array(), ecorePackage.getEString(), "array", null, 0, 1, ForEach.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEach_ArrayType(), ecorePackage.getEString(), "arrayType", null, 0, 1, ForEach.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, arkuimodel.arkUIModel.IF.class, "IF", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIF_Expression(), this.getExpression(), null, "expression", null, 0, -1,
				arkuimodel.arkUIModel.IF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIF_AutoExpression(), ecorePackage.getEString(), "autoExpression", null, 0, 1,
				arkuimodel.arkUIModel.IF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callFunEClass, CallFun.class, "CallFun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallFun_Name(), ecorePackage.getEString(), "name", null, 0, 1, CallFun.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swiperWidgetEClass, SwiperWidget.class, "SwiperWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwiperWidget_Controller(), ecorePackage.getEString(), "controller", null, 0, 1,
				SwiperWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSwiperWidget_Swiperevent(), this.getSwiperEvent(), null, "swiperevent", null, 0, 1,
				SwiperWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwiperWidget_Swiperstyle(), this.getSwiperStyle(), null, "swiperstyle", null, 0, 1,
				SwiperWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swiperStyleEClass, SwiperStyle.class, "SwiperStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwiperStyle_Index(), ecorePackage.getEString(), "index", null, 0, 1, SwiperStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwiperStyle_AutoPlay(), ecorePackage.getEString(), "autoPlay", null, 0, 1, SwiperStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwiperStyle_Interval(), ecorePackage.getEString(), "interval", null, 0, 1, SwiperStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwiperStyle_Indicator(), ecorePackage.getEString(), "indicator", null, 0, 1,
				SwiperStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwiperStyle_Loop(), ecorePackage.getEString(), "loop", null, 0, 1, SwiperStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwiperStyle_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, SwiperStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwiperStyle_Vertical(), ecorePackage.getEString(), "vertical", null, 0, 1, SwiperStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwiperStyle_ItemSpace(), ecorePackage.getEString(), "itemSpace", null, 0, 1,
				SwiperStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwiperStyle_DisplayMode(), ecorePackage.getEString(), "displayMode", null, 0, 1,
				SwiperStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(swiperEventEClass, SwiperEvent.class, "SwiperEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwiperEvent_OnChange(), ecorePackage.getEString(), "onChange", null, 0, 1, SwiperEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationLibrayEClass, OperationLibray.class, "OperationLibray", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationLibray_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperationLibray.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationLibray_Workflows(), this.getWorkFlow(), null, "workflows", null, 0, -1,
				OperationLibray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationLibray_Projectparameters(), this.getParameter(), null, "projectparameters", null, 0,
				-1, OperationLibray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationLibray_Domainmodel(), this.getDomainModel(), null, "domainmodel", null, 0, 1,
				OperationLibray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageRefrenceEClass, PageRefrence.class, "PageRefrence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPageRefrence_Name(), ecorePackage.getEString(), "name", null, 0, 1, PageRefrence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageRefrence_Parameter(), this.getParameter(), null, "parameter", null, 0, -1,
				PageRefrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageRefrence_If(), this.getIF(), null, "if", null, 0, 1, PageRefrence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPageRefrence_Foreach(), this.getForEach(), null, "foreach", null, 0, 1, PageRefrence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageRefrence_Pageevent(), this.getPageEvent(), null, "pageevent", null, 0, 1,
				PageRefrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabsContainerEClass, TabsContainer.class, "TabsContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabsContainer_BarPosition(), ecorePackage.getEString(), "barPosition", null, 0, 1,
				TabsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabsContainer_Index(), ecorePackage.getEString(), "index", null, 0, 1, TabsContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabsContainer_Tabs(), this.getTabContent(), null, "tabs", null, 0, -1, TabsContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabsContainer_Tabsevent(), this.getTabsEvent(), null, "tabsevent", null, 0, 1,
				TabsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabsContainer_Tabsstyle(), this.getTabsStyle(), null, "tabsstyle", null, 0, 1,
				TabsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabContentEClass, TabContent.class, "TabContent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabContent_TabBar(), this.getTabItem(), null, "tabBar", null, 0, 1, TabContent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabContent_Tabcontentstyle(), this.getTabContentStyle(), null, "tabcontentstyle", null, 0, 1,
				TabContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabsStyleEClass, TabsStyle.class, "TabsStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabsStyle_Scrollable(), ecorePackage.getEString(), "scrollable", null, 0, 1, TabsStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabsStyle_BarMode(), ecorePackage.getEString(), "barMode", null, 0, 1, TabsStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabsStyle_Vertical(), ecorePackage.getEString(), "vertical", null, 0, 1, TabsStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabsStyle_BarWidth(), ecorePackage.getEString(), "barWidth", null, 0, 1, TabsStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabsStyle_BarHeight(), ecorePackage.getEString(), "barHeight", null, 0, 1, TabsStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabsStyle_AnimationDuration(), ecorePackage.getEString(), "animationDuration", null, 0, 1,
				TabsStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(tabItemEClass, TabItem.class, "TabItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabItem_Title(), ecorePackage.getEString(), "title", null, 0, 1, TabItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabItem_Image(), ecorePackage.getEString(), "image", null, 0, 1, TabItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabItem_SelectedImage(), ecorePackage.getEString(), "selectedImage", null, 0, 1,
				TabItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(tabsEventEClass, TabsEvent.class, "TabsEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabsEvent_OnChange(), ecorePackage.getEString(), "onChange", null, 0, 1, TabsEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackContainerEClass, StackContainer.class, "StackContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStackContainer_Stackevent(), this.getStackEvent(), null, "stackevent", null, 0, 1,
				StackContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStackContainer_Stackstyle(), this.getStackStyle(), null, "stackstyle", null, 0, 1,
				StackContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackEventEClass, StackEvent.class, "StackEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stackStyleEClass, StackStyle.class, "StackStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackStyle_AlignContent(), ecorePackage.getEString(), "alignContent", null, 0, 1,
				StackStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(scrollContainerEClass, ScrollContainer.class, "ScrollContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScrollContainer_Scrollevent(), this.getScrollEvent(), null, "scrollevent", null, 0, 1,
				ScrollContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScrollContainer_Scrollstyle(), this.getScrollStyle(), null, "scrollstyle", null, 0, 1,
				ScrollContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scrollEventEClass, ScrollEvent.class, "ScrollEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScrollEvent_OnScroll(), ecorePackage.getEString(), "onScroll", null, 0, 1, ScrollEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollEvent_OnScrollEdge(), ecorePackage.getEString(), "onScrollEdge", null, 0, 1,
				ScrollEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollEvent_OnScrollEnd(), ecorePackage.getEString(), "onScrollEnd", null, 0, 1,
				ScrollEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(scrollStyleEClass, ScrollStyle.class, "ScrollStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScrollStyle_Scrollable(), ecorePackage.getEString(), "scrollable", null, 0, 1,
				ScrollStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollStyle_ScrollBar(), ecorePackage.getEString(), "scrollBar", null, 0, 1,
				ScrollStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollStyle_ScrollBarColor(), ecorePackage.getEString(), "scrollBarColor", null, 0, 1,
				ScrollStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollStyle_ScrollBarWidth(), ecorePackage.getEString(), "scrollBarWidth", null, 0, 1,
				ScrollStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScrollStyle_EdgeEffect(), ecorePackage.getEString(), "edgeEffect", null, 0, 1,
				ScrollStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(scrollerEClass, Scroller.class, "Scroller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScroller_AssginScroll(), ecorePackage.getEString(), "assginScroll", null, 0, 1,
				Scroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_ScrollType(), ecorePackage.getEString(), "scrollType", null, 0, 1, Scroller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_XOffset(), ecorePackage.getEString(), "xOffset", null, 0, 1, Scroller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_YOffset(), ecorePackage.getEString(), "yOffset", null, 0, 1, Scroller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, Scroller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_Curve(), ecorePackage.getEString(), "curve", null, 0, 1, Scroller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_Edge(), ecorePackage.getEString(), "edge", null, 0, 1, Scroller.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_Next(), ecorePackage.getEString(), "next", null, 0, 1, Scroller.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, Scroller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScroller_Index(), ecorePackage.getEString(), "index", null, 0, 1, Scroller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleWidgetEClass, ToggleWidget.class, "ToggleWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleWidget_IsOn(), ecorePackage.getEString(), "isOn", null, 0, 1, ToggleWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToggleWidget_ToggleType(), ecorePackage.getEString(), "toggleType", null, 0, 1,
				ToggleWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getToggleWidget_Toggleevent(), this.getToggleEvent(), null, "toggleevent", null, 0, 1,
				ToggleWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToggleWidget_Togglestyle(), this.getToggleStyle(), null, "togglestyle", null, 0, 1,
				ToggleWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleEventEClass, ToggleEvent.class, "ToggleEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleEvent_OnChange(), ecorePackage.getEString(), "onChange", null, 0, 1, ToggleEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleStyleEClass, ToggleStyle.class, "ToggleStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleStyle_SelectedColor(), ecorePackage.getEString(), "selectedColor", null, 0, 1,
				ToggleStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getToggleStyle_SwitchPointColor(), ecorePackage.getEString(), "switchPointColor", null, 0, 1,
				ToggleStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(timePickerWidgetEClass, TimePickerWidget.class, "TimePickerWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimePickerWidget_Selected(), ecorePackage.getEString(), "selected", null, 0, 1,
				TimePickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePickerWidget_Start(), ecorePackage.getEString(), "start", null, 0, 1,
				TimePickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePickerWidget_End(), ecorePackage.getEString(), "end", null, 0, 1, TimePickerWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimePickerWidget_Timepickerevent(), this.getTimePickerEvent(), null, "timepickerevent", null,
				0, 1, TimePickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimePickerWidget_Timepickerstyle(), this.getTimePickerStyle(), null, "timepickerstyle", null,
				0, 1, TimePickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timePickerEventEClass, TimePickerEvent.class, "TimePickerEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimePickerEvent_OnChange(), ecorePackage.getEString(), "onChange", null, 0, 1,
				TimePickerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(timePickerStyleEClass, TimePickerStyle.class, "TimePickerStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimePickerStyle_UseMilitaryTime(), ecorePackage.getEString(), "useMilitaryTime", null, 0, 1,
				TimePickerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(datePickerWidgetEClass, DatePickerWidget.class, "DatePickerWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatePickerWidget_Selected(), ecorePackage.getEString(), "selected", null, 0, 1,
				DatePickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatePickerWidget_Start(), ecorePackage.getEString(), "start", null, 0, 1,
				DatePickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatePickerWidget_End(), ecorePackage.getEString(), "end", null, 0, 1, DatePickerWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatePickerWidget_Datepickerevent(), this.getDatePickerEvent(), null, "datepickerevent", null,
				0, 1, DatePickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatePickerWidget_Datepickerstyle(), this.getDatePickerStyle(), null, "datepickerstyle", null,
				0, 1, DatePickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datePickerEventEClass, DatePickerEvent.class, "DatePickerEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatePickerEvent_OnChange(), ecorePackage.getEString(), "onChange", null, 0, 1,
				DatePickerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(datePickerStyleEClass, DatePickerStyle.class, "DatePickerStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatePickerStyle_Lunar(), ecorePackage.getEString(), "lunar", null, 0, 1,
				DatePickerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(textPickerWidgetEClass, TextPickerWidget.class, "TextPickerWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextPickerWidget_Textpickerevent(), this.getTextPickerEvent(), null, "textpickerevent", null,
				0, 1, TextPickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextPickerWidget_Textpickerstyle(), this.getTextPickerStyle(), null, "textpickerstyle", null,
				0, 1, TextPickerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textPickerEventEClass, TextPickerEvent.class, "TextPickerEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextPickerEvent_OnChange(), ecorePackage.getEString(), "onChange", null, 0, 1,
				TextPickerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(textPickerStyleEClass, TextPickerStyle.class, "TextPickerStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextPickerStyle_Range(), ecorePackage.getEString(), "range", null, 0, 1,
				TextPickerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextPickerStyle_Selected(), ecorePackage.getEString(), "selected", null, 0, 1,
				TextPickerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextPickerStyle_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				TextPickerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextPickerStyle_DefaultPickerItemHeight(), ecorePackage.getEString(),
				"defaultPickerItemHeight", null, 0, 1, TextPickerStyle.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dividerWidgetEClass, DividerWidget.class, "DividerWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDividerWidget_Dividerstyle(), this.getDividerStyle(), null, "dividerstyle", null, 0, 1,
				DividerWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dividerStyleEClass, DividerStyle.class, "DividerStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDividerStyle_Vertical(), ecorePackage.getEString(), "vertical", null, 0, 1,
				DividerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDividerStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, DividerStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDividerStyle_StrokeWidth(), ecorePackage.getEString(), "strokeWidth", null, 0, 1,
				DividerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDividerStyle_LineCap(), ecorePackage.getEString(), "lineCap", null, 0, 1, DividerStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customDialogContainerEClass, CustomDialogContainer.class, "CustomDialogContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomDialogContainer_Customdialogstyle(), this.getCustomDialogStyle(), null,
				"customdialogstyle", null, 0, 1, CustomDialogContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomDialogContainer_Customdialogevent(), this.getCustomDialogEvent(), null,
				"customdialogevent", null, 0, 1, CustomDialogContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customDialogStyleEClass, CustomDialogStyle.class, "CustomDialogStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomDialogStyle_AutoCancel(), ecorePackage.getEString(), "autoCancel", null, 0, 1,
				CustomDialogStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomDialogStyle_Alignment(), ecorePackage.getEString(), "alignment", null, 0, 1,
				CustomDialogStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomDialogStyle_Offsetx(), ecorePackage.getEString(), "offsetx", null, 0, 1,
				CustomDialogStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomDialogStyle_Offsety(), ecorePackage.getEString(), "offsety", null, 0, 1,
				CustomDialogStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomDialogStyle_CustomStyle(), ecorePackage.getEString(), "customStyle", null, 0, 1,
				CustomDialogStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomDialogStyle_GridCount(), ecorePackage.getEString(), "gridCount", null, 0, 1,
				CustomDialogStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(customDialogEventEClass, CustomDialogEvent.class, "CustomDialogEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomDialogEvent_Cancel(), ecorePackage.getEString(), "cancel", null, 0, 1,
				CustomDialogEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomDialogEvent_Confirm(), ecorePackage.getEString(), "confirm", null, 0, 1,
				CustomDialogEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(openDialogEClass, OpenDialog.class, "OpenDialog", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenDialog_AssignDialog(), ecorePackage.getEString(), "assignDialog", null, 0, 1,
				OpenDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(closeDialogEClass, CloseDialog.class, "CloseDialog", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloseDialog_AssignDialog(), ecorePackage.getEString(), "assignDialog", null, 0, 1,
				CloseDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataPreferencesEClass, DataPreferences.class, "DataPreferences", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPreferences_PreferencesType(), ecorePackage.getEString(), "preferencesType", null, 0, 1,
				DataPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPreferences_Preferences(), ecorePackage.getEString(), "preferences", null, 0, 1,
				DataPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(terminateSelfEClass, TerminateSelf.class, "TerminateSelf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTimeOutEClass, SetTimeOut.class, "SetTimeOut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetTimeOut_Handler(), ecorePackage.getEString(), "handler", null, 0, 1, SetTimeOut.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetTimeOut_Delay(), ecorePackage.getEString(), "delay", null, 0, 1, SetTimeOut.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearTimeOutEClass, ClearTimeOut.class, "ClearTimeOut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClearTimeOut_TimeoutID(), ecorePackage.getEString(), "timeoutID", null, 0, 1,
				ClearTimeOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(showToastOptionsEClass, ShowToastOptions.class, "ShowToastOptions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShowToastOptions_Message(), ecorePackage.getEString(), "message", null, 0, 1,
				ShowToastOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowToastOptions_Duration(), ecorePackage.getEString(), "duration", null, 0, 1,
				ShowToastOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowToastOptions_Bottom(), ecorePackage.getEString(), "bottom", null, 0, 1,
				ShowToastOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainModel_Label(), ecorePackage.getEString(), "label", null, 0, 1, DomainModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_Entity(), this.getEntity(), null, "entity", null, 0, -1, DomainModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityRefrenceEClass, EntityRefrence.class, "EntityRefrence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityRefrence_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityRefrence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRefrence_Type(), ecorePackage.getEString(), "type", null, 0, 1, EntityRefrence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRefrence_Entity(), this.getEntity(), null, "entity", null, 0, 1, EntityRefrence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridContainerEClass, GridContainer.class, "GridContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridContainer_ColumnsTemplate(), ecorePackage.getEString(), "columnsTemplate", null, 0, 1,
				GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridContainer_RowsTemplate(), ecorePackage.getEString(), "rowsTemplate", null, 0, 1,
				GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridContainer_ColumnsGap(), ecorePackage.getEString(), "columnsGap", null, 0, 1,
				GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridContainer_RowsGap(), ecorePackage.getEString(), "rowsGap", null, 0, 1,
				GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGridContainer_Gridevent(), this.getGridEvent(), null, "gridevent", null, 0, 1,
				GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridContainer_Gridstyle(), this.getGridStyle(), null, "gridstyle", null, 0, 1,
				GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridContainer_Griditemcontainer(), this.getGridItemContainer(), null, "griditemcontainer",
				null, 0, -1, GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridContainer_CachedCount(), ecorePackage.getEString(), "cachedCount", null, 0, 1,
				GridContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(gridEventEClass, GridEvent.class, "GridEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridStyleEClass, GridStyle.class, "GridStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeIndexEClass, ChangeIndex.class, "ChangeIndex", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeIndex_TabsID(), ecorePackage.getEString(), "tabsID", null, 0, 1, ChangeIndex.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeIndex_TabID(), ecorePackage.getEString(), "tabID", null, 0, 1, ChangeIndex.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabContentStyleEClass, TabContentStyle.class, "TabContentStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridItemContainerEClass, GridItemContainer.class, "GridItemContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridItemContainer_RowStart(), ecorePackage.getEString(), "rowStart", null, 0, 1,
				GridItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItemContainer_RowEnd(), ecorePackage.getEString(), "rowEnd", null, 0, 1,
				GridItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItemContainer_ColumnStart(), ecorePackage.getEString(), "columnStart", null, 0, 1,
				GridItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItemContainer_ColumnEnd(), ecorePackage.getEString(), "columnEnd", null, 0, 1,
				GridItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridItemContainer_ForceRebuild(), ecorePackage.getEString(), "forceRebuild", null, 0, 1,
				GridItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGridItemContainer_Griditemstyle(), this.getGridItemStyle(), null, "griditemstyle", null, 0, 1,
				GridItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridItemContainer_Griditemevent(), this.getGridItemEvent(), null, "griditemevent", null, 0, 1,
				GridItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchWidgetEClass, SearchWidget.class, "SearchWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchWidget_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, SearchWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchWidget_Searchbutton(), ecorePackage.getEString(), "searchbutton", null, 0, 1,
				SearchWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchWidget_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, SearchWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchWidget_Searchevent(), this.getSearchEvent(), null, "searchevent", null, 0, 1,
				SearchWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchWidget_Searchstyle(), this.getSearchStyle(), null, "searchstyle", null, 0, 1,
				SearchWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchWidget_Value(), ecorePackage.getEString(), "value", null, 0, 1, SearchWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchWidget_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1,
				SearchWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(searchEventEClass, SearchEvent.class, "SearchEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchEvent_OnSearch(), ecorePackage.getEString(), "onSearch", null, 0, 1, SearchEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchEvent_OnChange(), ecorePackage.getEString(), "onChange", null, 0, 1, SearchEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchEvent_OnTranslate(), ecorePackage.getEString(), "onTranslate", null, 0, 1,
				SearchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchEvent_OnShare(), ecorePackage.getEString(), "onShare", null, 0, 1, SearchEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchEvent_OnSubmit(), ecorePackage.getEString(), "onSubmit", null, 0, 1, SearchEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchStyleEClass, SearchStyle.class, "SearchStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, SearchStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStyle_Placeholdercolor(), ecorePackage.getEString(), "placeholdercolor", null, 0, 1,
				SearchStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStyle_Caretcolor(), ecorePackage.getEString(), "caretcolor", null, 0, 1,
				SearchStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStyle_PlaceholderSize(), ecorePackage.getEString(), "placeholderSize", null, 0, 1,
				SearchStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStyle_PlaceholderWeight(), ecorePackage.getEString(), "placeholderWeight", null, 0, 1,
				SearchStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(blankWidgetEClass, BlankWidget.class, "BlankWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlankWidget_Min(), ecorePackage.getEString(), "min", null, 0, 1, BlankWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlankWidget_Blankstyle(), this.getBlankStyle(), null, "blankstyle", null, 0, 1,
				BlankWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blankStyleEClass, BlankStyle.class, "BlankStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlankStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, BlankStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressWidgetEClass, ProgressWidget.class, "ProgressWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgressWidget_Value(), ecorePackage.getEString(), "value", null, 0, 1, ProgressWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressWidget_Total(), ecorePackage.getEString(), "total", null, 0, 1, ProgressWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressWidget_ProgressType(), ecorePackage.getEString(), "progressType", null, 0, 1,
				ProgressWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressWidget_ShowType(), ecorePackage.getEString(), "showType", null, 0, 1,
				ProgressWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProgressWidget_Progressevent(), this.getProgressEvent(), null, "progressevent", null, 0, 1,
				ProgressWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgressWidget_Progressstyle(), this.getProgressStyle(), null, "progressstyle", null, 0, 1,
				ProgressWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressStyleEClass, ProgressStyle.class, "ProgressStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgressStyle_Value(), ecorePackage.getEString(), "value", null, 0, 1, ProgressStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressStyle_StrokeWidth(), ecorePackage.getEString(), "strokeWidth", null, 0, 1,
				ProgressStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressStyle_ScaleCount(), ecorePackage.getEString(), "scaleCount", null, 0, 1,
				ProgressStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressStyle_ScaleWidth(), ecorePackage.getEString(), "scaleWidth", null, 0, 1,
				ProgressStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, ProgressStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressEventEClass, ProgressEvent.class, "ProgressEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineContainerEClass, LineContainer.class, "LineContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineContainer_Width(), ecorePackage.getEString(), "width", null, 0, 1, LineContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineContainer_Height(), ecorePackage.getEString(), "height", null, 0, 1, LineContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineContainer_Lineevent(), this.getLineEvent(), null, "lineevent", null, 0, -1,
				LineContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineContainer_Linestyle(), this.getLineStyle(), null, "linestyle", null, 0, -1,
				LineContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEventEClass, LineEvent.class, "LineEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineStyleEClass, LineStyle.class, "LineStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineStyle_StartPoint(), ecorePackage.getEString(), "startPoint", null, 0, 1, LineStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_EndPoint(), ecorePackage.getEString(), "endPoint", null, 0, 1, LineStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workOperationEClass, WorkOperation.class, "WorkOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkOperation_Title(), ecorePackage.getEString(), "title", null, 0, 1, WorkOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridItemStyleEClass, GridItemStyle.class, "GridItemStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridItemEventEClass, GridItemEvent.class, "GridItemEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(devicesTypeEEnum, DevicesType.class, "DevicesType");
		addEEnumLiteral(devicesTypeEEnum, DevicesType.PHONE);
		addEEnumLiteral(devicesTypeEEnum, DevicesType.TABLET);
		addEEnumLiteral(devicesTypeEEnum, DevicesType.COMPUTER);

		initEEnum(executeTypeEEnum, ExecuteType.class, "ExecuteType");
		addEEnumLiteral(executeTypeEEnum, ExecuteType.SYN);
		addEEnumLiteral(executeTypeEEnum, ExecuteType.ASYNC);

		initEEnum(httpTypeEEnum, HttpType.class, "HttpType");
		addEEnumLiteral(httpTypeEEnum, HttpType.GET);
		addEEnumLiteral(httpTypeEEnum, HttpType.POST);
		addEEnumLiteral(httpTypeEEnum, HttpType.HEAD);

		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.CLASS);
		addEEnumLiteral(variableTypeEEnum, VariableType.NUMBER);
		addEEnumLiteral(variableTypeEEnum, VariableType.STRING);
		addEEnumLiteral(variableTypeEEnum, VariableType.BOOLEAN);
		addEEnumLiteral(variableTypeEEnum, VariableType.ARRAY);
		addEEnumLiteral(variableTypeEEnum, VariableType.CALLFUN);
		addEEnumLiteral(variableTypeEEnum, VariableType.RESOURCE);
		addEEnumLiteral(variableTypeEEnum, VariableType.ANY);

		initEEnum(pTypeEEnum, PType.class, "PType");
		addEEnumLiteral(pTypeEEnum, PType.INPUT);
		addEEnumLiteral(pTypeEEnum, PType.OUTPUT);

		initEEnum(lineTypeEEnum, LineType.class, "LineType");
		addEEnumLiteral(lineTypeEEnum, LineType.SEQUENCE);
		addEEnumLiteral(lineTypeEEnum, LineType.CONTINUE);
		addEEnumLiteral(lineTypeEEnum, LineType.CONDITION);
		addEEnumLiteral(lineTypeEEnum, LineType.EXCEPTION);

		initEEnum(routeTypeEEnum, RouteType.class, "RouteType");
		addEEnumLiteral(routeTypeEEnum, RouteType.PUSH);
		addEEnumLiteral(routeTypeEEnum, RouteType.BACK);

		initEEnum(unionTypeEEnum, UnionType.class, "UnionType");
		addEEnumLiteral(unionTypeEEnum, UnionType.AND);
		addEEnumLiteral(unionTypeEEnum, UnionType.OR);
		addEEnumLiteral(unionTypeEEnum, UnionType.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //ArkUIModelPackageImpl
