/**
 */
package arkuimodel.arkUIModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see arkuimodel.arkUIModel.ArkUIModelFactory
 * @model kind="package"
 * @generated
 */
public interface ArkUIModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arkUIModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/arkUIModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arkUIModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArkUIModelPackage eINSTANCE = arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GUIModelImpl <em>GUI Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GUIModelImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGUIModel()
	 * @generated
	 */
	int GUI_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stylelibray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__STYLELIBRAY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Rootpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__ROOTPAGE = 4;

	/**
	 * The feature id for the '<em><b>Triggerevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__TRIGGEREVENT = 5;

	/**
	 * The feature id for the '<em><b>Animationlibray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__ANIMATIONLIBRAY = 6;

	/**
	 * The feature id for the '<em><b>Uilogic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__UILOGIC = 7;

	/**
	 * The feature id for the '<em><b>Uidesign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__UIDESIGN = 8;

	/**
	 * The feature id for the '<em><b>Operationlibray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__OPERATIONLIBRAY = 9;

	/**
	 * The number of structural features of the '<em>GUI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>GUI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.PageImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Page Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Is Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IS_HOME = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Uilogic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UILOGIC = 3;

	/**
	 * The feature id for the '<em><b>Uidesign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UIDESIGN = 4;

	/**
	 * The feature id for the '<em><b>Subpages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SUBPAGES = 5;

	/**
	 * The feature id for the '<em><b>Pageroute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGEROUTE = 6;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.UILogicImpl <em>UI Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.UILogicImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUILogic()
	 * @generated
	 */
	int UI_LOGIC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LOGIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LOGIC__WORKFLOW = 1;

	/**
	 * The feature id for the '<em><b>Pageparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LOGIC__PAGEPARAMETER = 2;

	/**
	 * The number of structural features of the '<em>UI Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LOGIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>UI Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LOGIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.UIDesignImpl <em>UI Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.UIDesignImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUIDesign()
	 * @generated
	 */
	int UI_DESIGN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESIGN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pageview</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESIGN__PAGEVIEW = 1;

	/**
	 * The number of structural features of the '<em>UI Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESIGN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UI Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.PageStructImpl <em>Page Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.PageStructImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPageStruct()
	 * @generated
	 */
	int PAGE_STRUCT = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STRUCT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STRUCT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STRUCT__WIDGETS = 2;

	/**
	 * The feature id for the '<em><b>Pageevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STRUCT__PAGEEVENT = 3;

	/**
	 * The number of structural features of the '<em>Page Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STRUCT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.UIComponentImpl <em>UI Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.UIComponentImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUIComponent()
	 * @generated
	 */
	int UI_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__WIDGET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__WIDGET = 2;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__FUNFLOW = 3;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__ROOT = 4;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__PAGEREFRENCE = 5;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__FOREACH = 6;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__IF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__NAME = 8;

	/**
	 * The number of structural features of the '<em>UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.WidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = UI_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGET_TYPE = UI_COMPONENT__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGET = UI_COMPONENT__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__FUNFLOW = UI_COMPONENT__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ROOT = UI_COMPONENT__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__PAGEREFRENCE = UI_COMPONENT__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__FOREACH = UI_COMPONENT__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IF = UI_COMPONENT__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = UI_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextWidgetImpl <em>Text Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextWidget()
	 * @generated
	 */
	int TEXT_WIDGET = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__CONTENT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Textevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__TEXTEVENT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Textstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__TEXTSTYLE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ButtonWidgetImpl <em>Button Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ButtonWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getButtonWidget()
	 * @generated
	 */
	int BUTTON_WIDGET = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__LABEL = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__STATE_EFFECT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__TYPE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Buttonevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__BUTTONEVENT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Buttonstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__BUTTONSTYLE = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Button Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Button Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = UI_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WIDGET_TYPE = UI_COMPONENT__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WIDGET = UI_COMPONENT__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FUNFLOW = UI_COMPONENT__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ROOT = UI_COMPONENT__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PAGEREFRENCE = UI_COMPONENT__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FOREACH = UI_COMPONENT__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IF = UI_COMPONENT__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = UI_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.FlexContainerImpl <em>Flex Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.FlexContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFlexContainer()
	 * @generated
	 */
	int FLEX_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__DIRECTION = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__WRAP = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Justify Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__JUSTIFY_CONTENT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Align Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__ALIGN_ITEMS = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Align Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__ALIGN_CONTENT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flexevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__FLEXEVENT = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flexstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER__FLEXSTYLE = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Flex Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Flex Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.StyleLibrayImpl <em>Style Libray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.StyleLibrayImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStyleLibray()
	 * @generated
	 */
	int STYLE_LIBRAY = 9;

	/**
	 * The feature id for the '<em><b>Styleclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIBRAY__STYLECLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIBRAY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Style Libray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIBRAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style Libray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIBRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.StyleClassImpl <em>Style Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.StyleClassImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStyleClass()
	 * @generated
	 */
	int STYLE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__ASPECT_RATIO = 2;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__PADDINGLEFT = 3;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__MARGINLEFT = 4;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__LAYOUT_WEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__ALIGN = 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__DIRECTION = 7;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__POSITION = 8;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__OFFSET = 9;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__BACKGROUND_COLOR = 10;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__BACKGROUND_IMAGE = 11;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__BORDER = 12;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__VISIBILITY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__NAME = 14;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__ANIMATIONCLASS = 15;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__ASSIGN = 16;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__PADDINGRIGHT = 17;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__PADDINGTOP = 18;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__PADDINGBOTTOM = 19;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__MARGINRIGHT = 20;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__MARGINTOP = 21;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__MARGINBOTTOM = 22;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__BORDER_RADIUS = 23;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__BACKGROUND_IMAGE_SIZE = 24;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__ROTATE = 25;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS__ZINDEX = 26;

	/**
	 * The number of structural features of the '<em>Style Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS_FEATURE_COUNT = 27;

	/**
	 * The number of operations of the '<em>Style Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.PrimitiveOperationImpl <em>Primitive Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.PrimitiveOperationImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPrimitiveOperation()
	 * @generated
	 */
	int PRIMITIVE_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION__CONTAINS = 1;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION__RETURNTYPE = 2;

	/**
	 * The number of structural features of the '<em>Primitive Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Primitive Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextInputWidgetImpl <em>Text Input Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextInputWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextInputWidget()
	 * @generated
	 */
	int TEXT_INPUT_WIDGET = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__PLACEHOLDER = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__CONTROLLER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Textinputevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__TEXTINPUTEVENT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Textinputstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET__TEXTINPUTSTYLE = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Text Input Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Text Input Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ListContainerImpl <em>List Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ListContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListContainer()
	 * @generated
	 */
	int LIST_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Initial Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__INITIAL_INDEX = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__SPACE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scroller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__SCROLLER = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Listitemcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__LISTITEMCONTAINER = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Listevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__LISTEVENT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Liststyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER__LISTSTYLE = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>List Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>List Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextStyleImpl <em>Text Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextStyle()
	 * @generated
	 */
	int TEXT_STYLE = 14;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_COLOR = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_SIZE = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__MIN_FONT_SIZE = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__MAX_FONT_SIZE = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_STYLE = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_WEIGHT = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_ALIGN = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__LINE_HEIGHT = STYLE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Text Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_OVERFLOW = STYLE_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_FAMILY = STYLE_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__MAX_LINES = STYLE_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__DECORATION_TYPE = STYLE_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Letter Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__LETTER_SPACING = STYLE_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Text Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_CASE = STYLE_CLASS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Baseline Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BASELINE_OFFSET = STYLE_CLASS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Decoration Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__DECORATION_COLOR = STYLE_CLASS_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl <em>Text Input Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextInputStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextInputStyle()
	 * @generated
	 */
	int TEXT_INPUT_STYLE = 15;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__TYPE = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__PLACEHOLDER_COLOR = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placeholder Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__PLACEHOLDER_FONT = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enter Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__ENTER_KEY_TYPE = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Caret Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__CARET_COLOR = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__MAX_LENGTH = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__FONT_COLOR = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__FONT_SIZE = STYLE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__FONT_STYLE = STYLE_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__FONT_WEIGHT = STYLE_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__FONT_FAMILY = STYLE_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE__INPUT_FILTER = STYLE_CLASS_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Text Input Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Text Input Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ParameterImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>PType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PTYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ASSIGN = 5;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONST = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STATE = 7;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TypeCSImpl <em>Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TypeCSImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTypeCS()
	 * @generated
	 */
	int TYPE_CS = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CS__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.RowContainerImpl <em>Row Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.RowContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRowContainer()
	 * @generated
	 */
	int ROW_CONTAINER = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__SPACE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__ALIGN_ITEMS = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Justify Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__JUSTIFY_CONTENT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rowevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__ROWEVENT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rowstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__ROWSTYLE = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bind Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER__BIND_MENU = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Row Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Row Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ColumnContainerImpl <em>Column Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ColumnContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getColumnContainer()
	 * @generated
	 */
	int COLUMN_CONTAINER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Justify Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__JUSTIFY_CONTENT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__ALIGN_ITEMS = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__SPACE = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columnevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__COLUMNEVENT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Columnstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER__COLUMNSTYLE = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Column Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Column Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ButtonStyleImpl <em>Button Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ButtonStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getButtonStyle()
	 * @generated
	 */
	int BUTTON_STYLE = 20;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The number of structural features of the '<em>Button Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.FlexStyleImpl <em>Flex Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.FlexStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFlexStyle()
	 * @generated
	 */
	int FLEX_STYLE = 21;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The number of structural features of the '<em>Flex Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flex Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.RowStyleImpl <em>Row Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.RowStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRowStyle()
	 * @generated
	 */
	int ROW_STYLE = 22;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The number of structural features of the '<em>Row Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Row Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ColumnStyleImpl <em>Column Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ColumnStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getColumnStyle()
	 * @generated
	 */
	int COLUMN_STYLE = 23;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The number of structural features of the '<em>Column Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ListStyleImpl <em>List Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ListStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListStyle()
	 * @generated
	 */
	int LIST_STYLE = 24;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>List Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__LIST_DIRECTION = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edge Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__EDGE_EFFECT = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Divider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__DIVIDER = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Edit Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__EDIT_MODE = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Chain Animation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__CHAIN_ANIMATION = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scroll Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__SCROLL_BAR = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cached Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__CACHED_COUNT = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__STROKE_WIDTH = STYLE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__COLOR = STYLE_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Start Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__START_MARGIN = STYLE_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>End Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__END_MARGIN = STYLE_CLASS_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>List Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>List Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ListItemStyleImpl <em>List Item Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ListItemStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListItemStyle()
	 * @generated
	 */
	int LIST_ITEM_STYLE = 25;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Sticky</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__STICKY = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE__EDITABLE = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Item Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Item Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ListItemContainerImpl <em>List Item Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ListItemContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListItemContainer()
	 * @generated
	 */
	int LIST_ITEM_CONTAINER = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__VALUE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Listitemevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__LISTITEMEVENT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Listitemstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER__LISTITEMSTYLE = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Item Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>List Item Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ImageWidgetImpl <em>Image Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ImageWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageWidget()
	 * @generated
	 */
	int IMAGE_WIDGET = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__SRC = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imageevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__IMAGEEVENT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imagestyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET__IMAGESTYLE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ImageStyleImpl <em>Image Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ImageStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageStyle()
	 * @generated
	 */
	int IMAGE_STYLE = 28;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__ALT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Text Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__MATCH_TEXT_DIRECTION = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fit Original Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__FIT_ORIGINAL_SIZE = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__FILL_COLOR = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Object Fit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__OBJECT_FIT = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Object Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__OBJECT_REPEAT = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto Resize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__AUTO_RESIZE = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Render Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__RENDER_MODE = STYLE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interpolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__INTERPOLATION = STYLE_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source Size Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__SOURCE_SIZE_HEIGHT = STYLE_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sync Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__SYNC_LOAD = STYLE_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Source Size Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__SOURCE_SIZE_WIDTH = STYLE_CLASS_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Image Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Image Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ControlFlowImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = PRIMITIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__CONTAINS = PRIMITIVE_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__RETURNTYPE = PRIMITIVE_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = PRIMITIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = PRIMITIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = PRIMITIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = PRIMITIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TriggerEventImpl <em>Trigger Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TriggerEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTriggerEvent()
	 * @generated
	 */
	int TRIGGER_EVENT = 30;

	/**
	 * The feature id for the '<em><b>Eventclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EVENT__EVENTCLASS = 0;

	/**
	 * The number of structural features of the '<em>Trigger Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.EventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 31;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_CLICK = 0;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_TOUCH = 1;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_DRAG_START = 2;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_DRAG_ENTER = 3;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_DRAG_MOVE = 4;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_DRAG_LEAVE = 5;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_DROP = 6;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_APPEAR = 7;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_DIS_APPEAR = 8;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_AREA_CHANGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 10;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.PageEventImpl <em>Page Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.PageEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPageEvent()
	 * @generated
	 */
	int PAGE_EVENT = 32;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Page Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_PAGE_HIDE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>About To Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ABOUT_TO_APPEAR = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Page Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_PAGE_SHOW = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Back Press</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ON_BACK_PRESS = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>About To Disappear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT__ABOUT_TO_DISAPPEAR = EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Page Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Page Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ColumnEventImpl <em>Column Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ColumnEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getColumnEvent()
	 * @generated
	 */
	int COLUMN_EVENT = 33;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Column Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.RowEventImpl <em>Row Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.RowEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRowEvent()
	 * @generated
	 */
	int ROW_EVENT = 34;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Row Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Row Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.FlexEventImpl <em>Flex Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.FlexEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFlexEvent()
	 * @generated
	 */
	int FLEX_EVENT = 35;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Flex Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flex Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ImageEventImpl <em>Image Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ImageEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageEvent()
	 * @generated
	 */
	int IMAGE_EVENT = 36;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_COMPLETE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_ERROR = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT__ON_FINISH = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextEventImpl <em>Text Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextEvent()
	 * @generated
	 */
	int TEXT_EVENT = 37;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_FOCUS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__ON_BLUR = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ButtonEventImpl <em>Button Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ButtonEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getButtonEvent()
	 * @generated
	 */
	int BUTTON_EVENT = 38;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_BLUR = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT__ON_FOCUS = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Button Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextInputEventImpl <em>Text Input Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextInputEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextInputEvent()
	 * @generated
	 */
	int TEXT_INPUT_EVENT = 39;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_CHANGE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Submit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_SUBMIT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_COPY = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Paste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_PASTE = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_CUT = EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>On Edit Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_EDIT_CHANGED = EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>On Edit Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT__ON_EDIT_CHANGE = EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Text Input Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Text Input Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ListEventImpl <em>List Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ListEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListEvent()
	 * @generated
	 */
	int LIST_EVENT = 40;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_SCROLL = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Scroll Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_SCROLL_INDEX = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Reach Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_REACH_START = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Reach End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_REACH_END = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Scroll Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_SCROLL_STOP = EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>On Item Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_ITEM_DELETE = EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>On Item Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_ITEM_MOVE = EVENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>On Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_BLUR = EVENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>On Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT__ON_FOCUS = EVENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>List Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>List Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ListItemEventImpl <em>List Item Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ListItemEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListItemEvent()
	 * @generated
	 */
	int LIST_ITEM_EVENT = 41;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>List Item Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Item Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.UIOperationImpl <em>UI Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.UIOperationImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUIOperation()
	 * @generated
	 */
	int UI_OPERATION = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION__NAME = PRIMITIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION__CONTAINS = PRIMITIVE_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION__RETURNTYPE = PRIMITIVE_OPERATION__RETURNTYPE;

	/**
	 * The number of structural features of the '<em>UI Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_FEATURE_COUNT = PRIMITIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_OPERATION_COUNT = PRIMITIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SeviceOperationImpl <em>Sevice Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SeviceOperationImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSeviceOperation()
	 * @generated
	 */
	int SEVICE_OPERATION = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVICE_OPERATION__NAME = PRIMITIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVICE_OPERATION__CONTAINS = PRIMITIVE_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVICE_OPERATION__RETURNTYPE = PRIMITIVE_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVICE_OPERATION__TYPE = PRIMITIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sevice Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVICE_OPERATION_FEATURE_COUNT = PRIMITIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sevice Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVICE_OPERATION_OPERATION_COUNT = PRIMITIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.LoopOpImpl <em>Loop Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.LoopOpImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLoopOp()
	 * @generated
	 */
	int LOOP_OP = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__NAME = CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__CONTAINS = CONTROL_FLOW__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__RETURNTYPE = CONTROL_FLOW__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__TARGET = CONTROL_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__SOURCE = CONTROL_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__START = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__END = CONTROL_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__STEP = CONTROL_FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP__EXPRESSION = CONTROL_FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Loop Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Loop Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OP_OPERATION_COUNT = CONTROL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.CaseOpImpl <em>Case Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.CaseOpImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCaseOp()
	 * @generated
	 */
	int CASE_OP = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OP__NAME = CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OP__CONTAINS = CONTROL_FLOW__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OP__RETURNTYPE = CONTROL_FLOW__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OP__TARGET = CONTROL_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OP__SOURCE = CONTROL_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OP__EXPRESSION = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OP_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Case Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OP_OPERATION_COUNT = CONTROL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.HttpOperationImpl <em>Http Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.HttpOperationImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getHttpOperation()
	 * @generated
	 */
	int HTTP_OPERATION = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__NAME = SEVICE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__CONTAINS = SEVICE_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__RETURNTYPE = SEVICE_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__TYPE = SEVICE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Http Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__HTTP_TYPE = SEVICE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__URL = SEVICE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__RES = SEVICE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Http Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION_FEATURE_COUNT = SEVICE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Http Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION_OPERATION_COUNT = SEVICE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GetParameterImpl <em>Get Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GetParameterImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGetParameter()
	 * @generated
	 */
	int GET_PARAMETER = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARAMETER__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARAMETER__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARAMETER__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Parm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARAMETER__PARM = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARAMETER__VALUE = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARAMETER_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Get Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PARAMETER_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SetParameterImpl <em>Set Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SetParameterImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSetParameter()
	 * @generated
	 */
	int SET_PARAMETER = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__VALUE = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__PARM = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.AnimationClassImpl <em>Animation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.AnimationClassImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getAnimationClass()
	 * @generated
	 */
	int ANIMATION_CLASS = 49;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_CLASS__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_CLASS__CURVE = 1;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_CLASS__DELAY = 2;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_CLASS__ITERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Play Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_CLASS__PLAY_MODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_CLASS__NAME = 5;

	/**
	 * The number of structural features of the '<em>Animation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_CLASS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Animation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ImageAnimatorImpl <em>Image Animator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ImageAnimatorImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageAnimator()
	 * @generated
	 */
	int IMAGE_ANIMATOR = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Imagesitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__IMAGESITEM = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imageanimatorevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__IMAGEANIMATOREVENT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imageanimatorstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR__IMAGEANIMATORSTYLE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image Animator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image Animator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ImagesItemImpl <em>Images Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ImagesItemImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImagesItem()
	 * @generated
	 */
	int IMAGES_ITEM = 51;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ITEM__SRC = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ITEM__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ITEM__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ITEM__TOP = 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ITEM__LEFT = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ITEM__DURATION = 5;

	/**
	 * The number of structural features of the '<em>Images Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ITEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Images Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl <em>Image Animator Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageAnimatorStyle()
	 * @generated
	 */
	int IMAGE_ANIMATOR_STYLE = 52;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__STATE = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__DURATION = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__REVERSE = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fixed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__FIXED_SIZE = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pre Decode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__PRE_DECODE = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__FILL_MODE = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE__ITERATIONS = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Image Animator Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Image Animator Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl <em>Image Animator Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageAnimatorEvent()
	 * @generated
	 */
	int IMAGE_ANIMATOR_EVENT = 53;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_START = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_PAUSE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_REPEAT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Cancel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_CANCEL = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT__ON_FINISH = EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Image Animator Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Image Animator Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ANIMATOR_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.RouteSkipImpl <em>Route Skip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.RouteSkipImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRouteSkip()
	 * @generated
	 */
	int ROUTE_SKIP = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP__TYPE = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP__URL = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP__VARIABLE = UI_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP__PAGE = UI_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Route Skip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Route Skip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SKIP_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GetRouteValueImpl <em>Get Route Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GetRouteValueImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGetRouteValue()
	 * @generated
	 */
	int GET_ROUTE_VALUE = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ROUTE_VALUE__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ROUTE_VALUE__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ROUTE_VALUE__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ROUTE_VALUE__VARIABLE = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Route Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ROUTE_VALUE_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Get Route Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ROUTE_VALUE_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ExtraOperationImpl <em>Extra Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ExtraOperationImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getExtraOperation()
	 * @generated
	 */
	int EXTRA_OPERATION = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_OPERATION__NAME = PRIMITIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_OPERATION__CONTAINS = PRIMITIVE_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_OPERATION__RETURNTYPE = PRIMITIVE_OPERATION__RETURNTYPE;

	/**
	 * The number of structural features of the '<em>Extra Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_OPERATION_FEATURE_COUNT = PRIMITIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extra Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_OPERATION_OPERATION_COUNT = PRIMITIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SeqOpImpl <em>Seq Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SeqOpImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSeqOp()
	 * @generated
	 */
	int SEQ_OP = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP__NAME = CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP__CONTAINS = CONTROL_FLOW__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP__RETURNTYPE = CONTROL_FLOW__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP__TARGET = CONTROL_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP__SOURCE = CONTROL_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP__TYPE = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP__VALUE = CONTROL_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Seq Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Seq Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OP_OPERATION_COUNT = CONTROL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.UIStructImpl <em>UI Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.UIStructImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUIStruct()
	 * @generated
	 */
	int UI_STRUCT = 58;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRUCT__PAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRUCT__NAME = 1;

	/**
	 * The number of structural features of the '<em>UI Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UI Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.AnimationLibrayImpl <em>Animation Libray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.AnimationLibrayImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getAnimationLibray()
	 * @generated
	 */
	int ANIMATION_LIBRAY = 59;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LIBRAY__ANIMATIONCLASS = 0;

	/**
	 * The number of structural features of the '<em>Animation Libray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LIBRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Animation Libray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_LIBRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.EntityImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 62;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE = TYPE_CS__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = TYPE_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = TYPE_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = TYPE_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPER_ENTITY = TYPE_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entityrefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITYREFRENCE = TYPE_CS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = TYPE_CS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = TYPE_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.EntityAttributeImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEntityAttribute()
	 * @generated
	 */
	int ENTITY_ATTRIBUTE = 63;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ArrayImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 64;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TYPE = TYPE_CS__TYPE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__LENGTH = TYPE_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ATYPE = TYPE_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = TYPE_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = TYPE_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.NavigationContainerImpl <em>Navigation Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.NavigationContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getNavigationContainer()
	 * @generated
	 */
	int NAVIGATION_CONTAINER = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Toolbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__TOOLBAR = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__MENU = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Navigationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__NAVIGATIONEVENT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Navigationstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__NAVIGATIONSTYLE = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER__TITLE = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Navigation Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Navigation Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.NavigationStyleImpl <em>Navigation Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.NavigationStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getNavigationStyle()
	 * @generated
	 */
	int NAVIGATION_STYLE = 66;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__TITLE = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__SUB_TITLE = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hide Title Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__HIDE_TITLE_BAR = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hide Back Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__HIDE_BACK_BUTTON = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__TITLE_MODE = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hide Tool Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE__HIDE_TOOL_BAR = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Navigation Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Navigation Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.NavigationEventImpl <em>Navigation Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.NavigationEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getNavigationEvent()
	 * @generated
	 */
	int NAVIGATION_EVENT = 67;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Title Mode Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__ON_TITLE_MODE_CHANGE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Navigation Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ContainerItemImpl <em>Container Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ContainerItemImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getContainerItem()
	 * @generated
	 */
	int CONTAINER_ITEM = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__VALUE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__ICON = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM__ACTION = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Container Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEM_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ContainerItemsImpl <em>Container Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ContainerItemsImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getContainerItems()
	 * @generated
	 */
	int CONTAINER_ITEMS = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__ITEMS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS__LABEL = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ITEMS_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.StartOpImpl <em>Start Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.StartOpImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStartOp()
	 * @generated
	 */
	int START_OP = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OP__NAME = CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OP__CONTAINS = CONTROL_FLOW__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OP__RETURNTYPE = CONTROL_FLOW__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OP__TARGET = CONTROL_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OP__SOURCE = CONTROL_FLOW__SOURCE;

	/**
	 * The number of structural features of the '<em>Start Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OP_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OP_OPERATION_COUNT = CONTROL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.EndOpImpl <em>End Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.EndOpImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEndOp()
	 * @generated
	 */
	int END_OP = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OP__NAME = CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OP__CONTAINS = CONTROL_FLOW__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OP__RETURNTYPE = CONTROL_FLOW__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OP__TARGET = CONTROL_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OP__SOURCE = CONTROL_FLOW__SOURCE;

	/**
	 * The number of structural features of the '<em>End Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OP_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OP_OPERATION_COUNT = CONTROL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.WorkFlowImpl <em>Work Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.WorkFlowImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getWorkFlow()
	 * @generated
	 */
	int WORK_FLOW = 72;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Flow Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__FLOW_NAME = 1;

	/**
	 * The feature id for the '<em><b>Flowline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__FLOWLINE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Workparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__WORKPARAMETER = 4;

	/**
	 * The number of structural features of the '<em>Work Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Work Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.CheckEqualImpl <em>Check Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.CheckEqualImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCheckEqual()
	 * @generated
	 */
	int CHECK_EQUAL = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EQUAL__NAME = EXTRA_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EQUAL__CONTAINS = EXTRA_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EQUAL__RETURNTYPE = EXTRA_OPERATION__RETURNTYPE;

	/**
	 * The number of structural features of the '<em>Check Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EQUAL_FEATURE_COUNT = EXTRA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Check Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_EQUAL_OPERATION_COUNT = EXTRA_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.FlowLineImpl <em>Flow Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.FlowLineImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFlowLine()
	 * @generated
	 */
	int FLOW_LINE = 74;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LINE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LINE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LINE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LINE__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Flow Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Flow Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ExpressionImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__UNION = 4;

	/**
	 * The feature id for the '<em><b>Express Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESS_TEXT = 5;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.FunctionImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 76;

	/**
	 * The feature id for the '<em><b>Function Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNCTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__WORKFLOW = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ForEachImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getForEach()
	 * @generated
	 */
	int FOR_EACH = 77;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ARRAY = 2;

	/**
	 * The feature id for the '<em><b>Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ARRAY_TYPE = 3;

	/**
	 * The number of structural features of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.IFImpl <em>IF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.IFImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getIF()
	 * @generated
	 */
	int IF = 78;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Auto Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__AUTO_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>IF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.CallFunImpl <em>Call Fun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.CallFunImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCallFun()
	 * @generated
	 */
	int CALL_FUN = 79;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUN__TYPE = TYPE_CS__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUN__NAME = TYPE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Fun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUN_FEATURE_COUNT = TYPE_CS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Fun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUN_OPERATION_COUNT = TYPE_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SwiperWidgetImpl <em>Swiper Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SwiperWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSwiperWidget()
	 * @generated
	 */
	int SWIPER_WIDGET = 80;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__CONTROLLER = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Swiperevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__SWIPEREVENT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Swiperstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET__SWIPERSTYLE = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Swiper Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Swiper Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_WIDGET_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl <em>Swiper Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SwiperStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSwiperStyle()
	 * @generated
	 */
	int SWIPER_STYLE = 81;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__INDEX = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Play</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__AUTO_PLAY = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__INTERVAL = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__INDICATOR = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__LOOP = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__DURATION = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__VERTICAL = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Item Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__ITEM_SPACE = STYLE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE__DISPLAY_MODE = STYLE_CLASS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Swiper Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Swiper Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SwiperEventImpl <em>Swiper Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SwiperEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSwiperEvent()
	 * @generated
	 */
	int SWIPER_EVENT = 82;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT__ON_CHANGE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swiper Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swiper Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPER_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.OperationLibrayImpl <em>Operation Libray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.OperationLibrayImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getOperationLibray()
	 * @generated
	 */
	int OPERATION_LIBRAY = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIBRAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIBRAY__WORKFLOWS = 1;

	/**
	 * The feature id for the '<em><b>Projectparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIBRAY__PROJECTPARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Domainmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIBRAY__DOMAINMODEL = 3;

	/**
	 * The number of structural features of the '<em>Operation Libray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIBRAY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operation Libray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIBRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.PageRefrenceImpl <em>Page Refrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.PageRefrenceImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPageRefrence()
	 * @generated
	 */
	int PAGE_REFRENCE = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFRENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFRENCE__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFRENCE__IF = 2;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFRENCE__FOREACH = 3;

	/**
	 * The feature id for the '<em><b>Pageevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFRENCE__PAGEEVENT = 4;

	/**
	 * The number of structural features of the '<em>Page Refrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFRENCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Page Refrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFRENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TabsContainerImpl <em>Tabs Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TabsContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabsContainer()
	 * @generated
	 */
	int TABS_CONTAINER = 85;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Bar Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__BAR_POSITION = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__INDEX = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__TABS = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tabsevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__TABSEVENT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tabsstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER__TABSSTYLE = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tabs Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Tabs Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TabContentImpl <em>Tab Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TabContentImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabContent()
	 * @generated
	 */
	int TAB_CONTENT = 86;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Tab Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__TAB_BAR = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tabcontentstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT__TABCONTENTSTYLE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tab Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tab Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TabsStyleImpl <em>Tabs Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TabsStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabsStyle()
	 * @generated
	 */
	int TABS_STYLE = 87;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__SCROLLABLE = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bar Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__BAR_MODE = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__VERTICAL = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bar Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__BAR_WIDTH = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bar Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__BAR_HEIGHT = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Animation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE__ANIMATION_DURATION = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tabs Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Tabs Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TabItemImpl <em>Tab Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TabItemImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabItem()
	 * @generated
	 */
	int TAB_ITEM = 88;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__TITLE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__IMAGE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM__SELECTED_IMAGE = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tab Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tab Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ITEM_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TabsEventImpl <em>Tabs Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TabsEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabsEvent()
	 * @generated
	 */
	int TABS_EVENT = 89;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT__ON_CHANGE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tabs Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tabs Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.StackContainerImpl <em>Stack Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.StackContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStackContainer()
	 * @generated
	 */
	int STACK_CONTAINER = 90;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Stackevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__STACKEVENT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stackstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER__STACKSTYLE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stack Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stack Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.StackEventImpl <em>Stack Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.StackEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStackEvent()
	 * @generated
	 */
	int STACK_EVENT = 91;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Stack Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stack Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.StackStyleImpl <em>Stack Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.StackStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStackStyle()
	 * @generated
	 */
	int STACK_STYLE = 92;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Align Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE__ALIGN_CONTENT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stack Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stack Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ScrollContainerImpl <em>Scroll Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ScrollContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getScrollContainer()
	 * @generated
	 */
	int SCROLL_CONTAINER = 93;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Scrollevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__SCROLLEVENT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scrollstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER__SCROLLSTYLE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scroll Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scroll Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ScrollEventImpl <em>Scroll Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ScrollEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getScrollEvent()
	 * @generated
	 */
	int SCROLL_EVENT = 94;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_SCROLL = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Scroll Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_SCROLL_EDGE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Scroll End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__ON_SCROLL_END = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scroll Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Scroll Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ScrollStyleImpl <em>Scroll Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ScrollStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getScrollStyle()
	 * @generated
	 */
	int SCROLL_STYLE = 95;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__SCROLLABLE = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scroll Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__SCROLL_BAR = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scroll Bar Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__SCROLL_BAR_COLOR = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scroll Bar Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__SCROLL_BAR_WIDTH = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Edge Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE__EDGE_EFFECT = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scroll Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Scroll Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ScrollerImpl <em>Scroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ScrollerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getScroller()
	 * @generated
	 */
	int SCROLLER = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Assgin Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__ASSGIN_SCROLL = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scroll Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__SCROLL_TYPE = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__XOFFSET = UI_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__YOFFSET = UI_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__DURATION = UI_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__CURVE = UI_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__EDGE = UI_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__NEXT = UI_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__DIRECTION = UI_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER__INDEX = UI_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Scroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Scroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ToggleWidgetImpl <em>Toggle Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ToggleWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getToggleWidget()
	 * @generated
	 */
	int TOGGLE_WIDGET = 97;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Is On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__IS_ON = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Toggle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__TOGGLE_TYPE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Toggleevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__TOGGLEEVENT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Togglestyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET__TOGGLESTYLE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Toggle Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Toggle Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ToggleEventImpl <em>Toggle Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ToggleEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getToggleEvent()
	 * @generated
	 */
	int TOGGLE_EVENT = 98;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT__ON_CHANGE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toggle Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Toggle Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ToggleStyleImpl <em>Toggle Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ToggleStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getToggleStyle()
	 * @generated
	 */
	int TOGGLE_STYLE = 99;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Selected Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__SELECTED_COLOR = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switch Point Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__SWITCH_POINT_COLOR = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Toggle Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Toggle Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TimePickerWidgetImpl <em>Time Picker Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TimePickerWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTimePickerWidget()
	 * @generated
	 */
	int TIME_PICKER_WIDGET = 100;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__SELECTED = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__START = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__END = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timepickerevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__TIMEPICKEREVENT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timepickerstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET__TIMEPICKERSTYLE = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Time Picker Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Time Picker Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TimePickerEventImpl <em>Time Picker Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TimePickerEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTimePickerEvent()
	 * @generated
	 */
	int TIME_PICKER_EVENT = 101;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT__ON_CHANGE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Picker Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Picker Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TimePickerStyleImpl <em>Time Picker Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TimePickerStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTimePickerStyle()
	 * @generated
	 */
	int TIME_PICKER_STYLE = 102;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Use Military Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE__USE_MILITARY_TIME = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Picker Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Picker Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.DatePickerWidgetImpl <em>Date Picker Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.DatePickerWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDatePickerWidget()
	 * @generated
	 */
	int DATE_PICKER_WIDGET = 103;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__SELECTED = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__START = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__END = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datepickerevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__DATEPICKEREVENT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datepickerstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET__DATEPICKERSTYLE = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Date Picker Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Date Picker Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.DatePickerEventImpl <em>Date Picker Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.DatePickerEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDatePickerEvent()
	 * @generated
	 */
	int DATE_PICKER_EVENT = 104;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT__ON_CHANGE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Picker Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Picker Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.DatePickerStyleImpl <em>Date Picker Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.DatePickerStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDatePickerStyle()
	 * @generated
	 */
	int DATE_PICKER_STYLE = 105;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Lunar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE__LUNAR = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Picker Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Picker Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextPickerWidgetImpl <em>Text Picker Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextPickerWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextPickerWidget()
	 * @generated
	 */
	int TEXT_PICKER_WIDGET = 106;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Textpickerevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__TEXTPICKEREVENT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Textpickerstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET__TEXTPICKERSTYLE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Picker Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Picker Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextPickerEventImpl <em>Text Picker Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextPickerEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextPickerEvent()
	 * @generated
	 */
	int TEXT_PICKER_EVENT = 107;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT__ON_CHANGE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Picker Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Picker Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TextPickerStyleImpl <em>Text Picker Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TextPickerStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextPickerStyle()
	 * @generated
	 */
	int TEXT_PICKER_STYLE = 108;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__RANGE = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__SELECTED = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__VALUE = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Picker Item Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE__DEFAULT_PICKER_ITEM_HEIGHT = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Text Picker Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Text Picker Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PICKER_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.DividerWidgetImpl <em>Divider Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.DividerWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDividerWidget()
	 * @generated
	 */
	int DIVIDER_WIDGET = 109;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Dividerstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET__DIVIDERSTYLE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Divider Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Divider Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.DividerStyleImpl <em>Divider Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.DividerStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDividerStyle()
	 * @generated
	 */
	int DIVIDER_STYLE = 110;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__VERTICAL = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__COLOR = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__STROKE_WIDTH = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE__LINE_CAP = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Divider Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Divider Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDER_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.CustomDialogContainerImpl <em>Custom Dialog Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.CustomDialogContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCustomDialogContainer()
	 * @generated
	 */
	int CUSTOM_DIALOG_CONTAINER = 111;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Customdialogstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customdialogevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Dialog Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Custom Dialog Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.CustomDialogStyleImpl <em>Custom Dialog Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.CustomDialogStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCustomDialogStyle()
	 * @generated
	 */
	int CUSTOM_DIALOG_STYLE = 112;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Auto Cancel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__AUTO_CANCEL = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__ALIGNMENT = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offsetx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__OFFSETX = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Offsety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__OFFSETY = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Custom Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__CUSTOM_STYLE = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grid Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE__GRID_COUNT = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Custom Dialog Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Custom Dialog Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.CustomDialogEventImpl <em>Custom Dialog Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.CustomDialogEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCustomDialogEvent()
	 * @generated
	 */
	int CUSTOM_DIALOG_EVENT = 113;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__CANCEL = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT__CONFIRM = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Dialog Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Custom Dialog Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DIALOG_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.OpenDialogImpl <em>Open Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.OpenDialogImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getOpenDialog()
	 * @generated
	 */
	int OPEN_DIALOG = 114;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIALOG__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIALOG__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIALOG__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Assign Dialog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIALOG__ASSIGN_DIALOG = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIALOG_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIALOG_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.CloseDialogImpl <em>Close Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.CloseDialogImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCloseDialog()
	 * @generated
	 */
	int CLOSE_DIALOG = 115;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_DIALOG__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_DIALOG__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_DIALOG__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Assign Dialog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_DIALOG__ASSIGN_DIALOG = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Close Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_DIALOG_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Close Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_DIALOG_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.DataPreferencesImpl <em>Data Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.DataPreferencesImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDataPreferences()
	 * @generated
	 */
	int DATA_PREFERENCES = 116;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREFERENCES__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREFERENCES__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREFERENCES__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Preferences Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREFERENCES__PREFERENCES_TYPE = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREFERENCES__PREFERENCES = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREFERENCES_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PREFERENCES_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TerminateSelfImpl <em>Terminate Self</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TerminateSelfImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTerminateSelf()
	 * @generated
	 */
	int TERMINATE_SELF = 117;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_SELF__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_SELF__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_SELF__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The number of structural features of the '<em>Terminate Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_SELF_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminate Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_SELF_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SetTimeOutImpl <em>Set Time Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SetTimeOutImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSetTimeOut()
	 * @generated
	 */
	int SET_TIME_OUT = 118;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_OUT__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_OUT__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_OUT__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_OUT__HANDLER = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_OUT__DELAY = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Time Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_OUT_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Time Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_OUT_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ClearTimeOutImpl <em>Clear Time Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ClearTimeOutImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getClearTimeOut()
	 * @generated
	 */
	int CLEAR_TIME_OUT = 119;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_TIME_OUT__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_TIME_OUT__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_TIME_OUT__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Timeout ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_TIME_OUT__TIMEOUT_ID = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clear Time Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_TIME_OUT_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clear Time Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_TIME_OUT_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ShowToastOptionsImpl <em>Show Toast Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ShowToastOptionsImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getShowToastOptions()
	 * @generated
	 */
	int SHOW_TOAST_OPTIONS = 120;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TOAST_OPTIONS__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TOAST_OPTIONS__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TOAST_OPTIONS__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TOAST_OPTIONS__MESSAGE = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TOAST_OPTIONS__DURATION = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TOAST_OPTIONS__BOTTOM = UI_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Show Toast Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TOAST_OPTIONS_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Show Toast Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TOAST_OPTIONS_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.DomainModelImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 121;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.EntityRefrenceImpl <em>Entity Refrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.EntityRefrenceImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEntityRefrence()
	 * @generated
	 */
	int ENTITY_REFRENCE = 122;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFRENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFRENCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFRENCE__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Entity Refrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFRENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity Refrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFRENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GridContainerImpl <em>Grid Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GridContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridContainer()
	 * @generated
	 */
	int GRID_CONTAINER = 123;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Columns Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__COLUMNS_TEMPLATE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ROWS_TEMPLATE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__COLUMNS_GAP = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rows Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__ROWS_GAP = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gridevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__GRIDEVENT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gridstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__GRIDSTYLE = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Griditemcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__GRIDITEMCONTAINER = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cached Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER__CACHED_COUNT = CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Grid Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Grid Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GridEventImpl <em>Grid Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GridEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridEvent()
	 * @generated
	 */
	int GRID_EVENT = 124;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Grid Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grid Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GridStyleImpl <em>Grid Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GridStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridStyle()
	 * @generated
	 */
	int GRID_STYLE = 125;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The number of structural features of the '<em>Grid Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grid Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ChangeIndexImpl <em>Change Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ChangeIndexImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getChangeIndex()
	 * @generated
	 */
	int CHANGE_INDEX = 126;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDEX__NAME = UI_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDEX__CONTAINS = UI_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDEX__RETURNTYPE = UI_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Tabs ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDEX__TABS_ID = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tab ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDEX__TAB_ID = UI_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDEX_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDEX_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.TabContentStyleImpl <em>Tab Content Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.TabContentStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabContentStyle()
	 * @generated
	 */
	int TAB_CONTENT_STYLE = 127;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The number of structural features of the '<em>Tab Content Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tab Content Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_CONTENT_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl <em>Grid Item Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GridItemContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridItemContainer()
	 * @generated
	 */
	int GRID_ITEM_CONTAINER = 128;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Row Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__ROW_START = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__ROW_END = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__COLUMN_START = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Column End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__COLUMN_END = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Force Rebuild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__FORCE_REBUILD = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Griditemstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__GRIDITEMSTYLE = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Griditemevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER__GRIDITEMEVENT = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Grid Item Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Grid Item Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl <em>Search Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SearchWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSearchWidget()
	 * @generated
	 */
	int SEARCH_WIDGET = 129;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__HINT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Searchbutton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__SEARCHBUTTON = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__ICON = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Searchevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__SEARCHEVENT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Searchstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__SEARCHSTYLE = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__VALUE = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET__PLACEHOLDER = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Search Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Search Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SearchEventImpl <em>Search Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SearchEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSearchEvent()
	 * @generated
	 */
	int SEARCH_EVENT = 130;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>On Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_SEARCH = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_CHANGE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_TRANSLATE = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_SHARE = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Submit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT__ON_SUBMIT = EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Search Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Search Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.SearchStyleImpl <em>Search Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.SearchStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSearchStyle()
	 * @generated
	 */
	int SEARCH_STYLE = 131;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__COLOR = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholdercolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__PLACEHOLDERCOLOR = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Caretcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__CARETCOLOR = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Placeholder Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__PLACEHOLDER_SIZE = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Placeholder Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE__PLACEHOLDER_WEIGHT = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Search Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Search Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.BlankWidgetImpl <em>Blank Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.BlankWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getBlankWidget()
	 * @generated
	 */
	int BLANK_WIDGET = 132;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__MIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blankstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET__BLANKSTYLE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Blank Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Blank Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.BlankStyleImpl <em>Blank Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.BlankStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getBlankStyle()
	 * @generated
	 */
	int BLANK_STYLE = 133;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE__COLOR = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blank Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blank Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ProgressWidgetImpl <em>Progress Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ProgressWidgetImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getProgressWidget()
	 * @generated
	 */
	int PROGRESS_WIDGET = 134;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__WIDGET = WIDGET__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__FUNFLOW = WIDGET__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__ROOT = WIDGET__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__PAGEREFRENCE = WIDGET__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__FOREACH = WIDGET__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__IF = WIDGET__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__TOTAL = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Progress Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__PROGRESS_TYPE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Show Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__SHOW_TYPE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Progressevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__PROGRESSEVENT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Progressstyle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET__PROGRESSSTYLE = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Progress Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Progress Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ProgressStyleImpl <em>Progress Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ProgressStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getProgressStyle()
	 * @generated
	 */
	int PROGRESS_STYLE = 135;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__VALUE = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__STROKE_WIDTH = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__SCALE_COUNT = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__SCALE_WIDTH = STYLE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE__COLOR = STYLE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Progress Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Progress Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.ProgressEventImpl <em>Progress Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.ProgressEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getProgressEvent()
	 * @generated
	 */
	int PROGRESS_EVENT = 136;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Progress Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Progress Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.LineContainerImpl <em>Line Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.LineContainerImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLineContainer()
	 * @generated
	 */
	int LINE_CONTAINER = 137;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__WIDGET_TYPE = CONTAINER__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__WIDGET = CONTAINER__WIDGET;

	/**
	 * The feature id for the '<em><b>Funflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__FUNFLOW = CONTAINER__FUNFLOW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__ROOT = CONTAINER__ROOT;

	/**
	 * The feature id for the '<em><b>Pagerefrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__PAGEREFRENCE = CONTAINER__PAGEREFRENCE;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__FOREACH = CONTAINER__FOREACH;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__IF = CONTAINER__IF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__WIDTH = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__HEIGHT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lineevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__LINEEVENT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Linestyle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER__LINESTYLE = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Line Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Line Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.LineEventImpl <em>Line Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.LineEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLineEvent()
	 * @generated
	 */
	int LINE_EVENT = 138;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Line Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.LineStyleImpl <em>Line Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.LineStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 139;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__START_POINT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__END_POINT = STYLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.WorkOperationImpl <em>Work Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.WorkOperationImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getWorkOperation()
	 * @generated
	 */
	int WORK_OPERATION = 140;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION__NAME = SEVICE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION__CONTAINS = SEVICE_OPERATION__CONTAINS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION__RETURNTYPE = SEVICE_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION__TYPE = SEVICE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION__TITLE = SEVICE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION_FEATURE_COUNT = SEVICE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION_OPERATION_COUNT = SEVICE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GridItemStyleImpl <em>Grid Item Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GridItemStyleImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridItemStyle()
	 * @generated
	 */
	int GRID_ITEM_STYLE = 141;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__WIDTH = STYLE_CLASS__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__HEIGHT = STYLE_CLASS__HEIGHT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__ASPECT_RATIO = STYLE_CLASS__ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Paddingleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__PADDINGLEFT = STYLE_CLASS__PADDINGLEFT;

	/**
	 * The feature id for the '<em><b>Marginleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__MARGINLEFT = STYLE_CLASS__MARGINLEFT;

	/**
	 * The feature id for the '<em><b>Layout Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__LAYOUT_WEIGHT = STYLE_CLASS__LAYOUT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__ALIGN = STYLE_CLASS__ALIGN;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__DIRECTION = STYLE_CLASS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__POSITION = STYLE_CLASS__POSITION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__OFFSET = STYLE_CLASS__OFFSET;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__BACKGROUND_COLOR = STYLE_CLASS__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__BACKGROUND_IMAGE = STYLE_CLASS__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__BORDER = STYLE_CLASS__BORDER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__VISIBILITY = STYLE_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__NAME = STYLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Animationclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__ANIMATIONCLASS = STYLE_CLASS__ANIMATIONCLASS;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__ASSIGN = STYLE_CLASS__ASSIGN;

	/**
	 * The feature id for the '<em><b>Paddingright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__PADDINGRIGHT = STYLE_CLASS__PADDINGRIGHT;

	/**
	 * The feature id for the '<em><b>Paddingtop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__PADDINGTOP = STYLE_CLASS__PADDINGTOP;

	/**
	 * The feature id for the '<em><b>Paddingbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__PADDINGBOTTOM = STYLE_CLASS__PADDINGBOTTOM;

	/**
	 * The feature id for the '<em><b>Marginright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__MARGINRIGHT = STYLE_CLASS__MARGINRIGHT;

	/**
	 * The feature id for the '<em><b>Margintop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__MARGINTOP = STYLE_CLASS__MARGINTOP;

	/**
	 * The feature id for the '<em><b>Marginbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__MARGINBOTTOM = STYLE_CLASS__MARGINBOTTOM;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__BORDER_RADIUS = STYLE_CLASS__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Background Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__BACKGROUND_IMAGE_SIZE = STYLE_CLASS__BACKGROUND_IMAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__ROTATE = STYLE_CLASS__ROTATE;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE__ZINDEX = STYLE_CLASS__ZINDEX;

	/**
	 * The number of structural features of the '<em>Grid Item Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE_FEATURE_COUNT = STYLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grid Item Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_STYLE_OPERATION_COUNT = STYLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.impl.GridItemEventImpl <em>Grid Item Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.impl.GridItemEventImpl
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridItemEvent()
	 * @generated
	 */
	int GRID_ITEM_EVENT = 142;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_CLICK = EVENT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>On Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_TOUCH = EVENT__ON_TOUCH;

	/**
	 * The feature id for the '<em><b>On Drag Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_DRAG_START = EVENT__ON_DRAG_START;

	/**
	 * The feature id for the '<em><b>On Drag Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_DRAG_ENTER = EVENT__ON_DRAG_ENTER;

	/**
	 * The feature id for the '<em><b>On Drag Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_DRAG_MOVE = EVENT__ON_DRAG_MOVE;

	/**
	 * The feature id for the '<em><b>On Drag Leave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_DRAG_LEAVE = EVENT__ON_DRAG_LEAVE;

	/**
	 * The feature id for the '<em><b>On Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_DROP = EVENT__ON_DROP;

	/**
	 * The feature id for the '<em><b>On Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_APPEAR = EVENT__ON_APPEAR;

	/**
	 * The feature id for the '<em><b>On Dis Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_DIS_APPEAR = EVENT__ON_DIS_APPEAR;

	/**
	 * The feature id for the '<em><b>On Area Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__ON_AREA_CHANGE = EVENT__ON_AREA_CHANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Grid Item Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grid Item Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_ITEM_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.DevicesType <em>Devices Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.DevicesType
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDevicesType()
	 * @generated
	 */
	int DEVICES_TYPE = 143;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.ExecuteType <em>Execute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.ExecuteType
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getExecuteType()
	 * @generated
	 */
	int EXECUTE_TYPE = 144;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.HttpType <em>Http Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.HttpType
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getHttpType()
	 * @generated
	 */
	int HTTP_TYPE = 145;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.VariableType
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 146;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.PType <em>PType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.PType
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPType()
	 * @generated
	 */
	int PTYPE = 147;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.LineType <em>Line Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.LineType
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLineType()
	 * @generated
	 */
	int LINE_TYPE = 148;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.RouteType <em>Route Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.RouteType
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRouteType()
	 * @generated
	 */
	int ROUTE_TYPE = 149;

	/**
	 * The meta object id for the '{@link arkuimodel.arkUIModel.UnionType <em>Union Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arkuimodel.arkUIModel.UnionType
	 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 150;

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GUIModel <em>GUI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Model</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel
	 * @generated
	 */
	EClass getGUIModel();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GUIModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getName()
	 * @see #getGUIModel()
	 * @generated
	 */
	EAttribute getGUIModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GUIModel#getStylelibray <em>Stylelibray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stylelibray</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getStylelibray()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Stylelibray();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GUIModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getDescription()
	 * @see #getGUIModel()
	 * @generated
	 */
	EAttribute getGUIModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GUIModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getType()
	 * @see #getGUIModel()
	 * @generated
	 */
	EAttribute getGUIModel_Type();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GUIModel#getRootpage <em>Rootpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rootpage</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getRootpage()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Rootpage();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GUIModel#getTriggerevent <em>Triggerevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triggerevent</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getTriggerevent()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Triggerevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GUIModel#getAnimationlibray <em>Animationlibray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animationlibray</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getAnimationlibray()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Animationlibray();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.GUIModel#getUilogic <em>Uilogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uilogic</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getUilogic()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Uilogic();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.GUIModel#getUidesign <em>Uidesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uidesign</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getUidesign()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Uidesign();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GUIModel#getOperationlibray <em>Operationlibray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operationlibray</em>'.
	 * @see arkuimodel.arkUIModel.GUIModel#getOperationlibray()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Operationlibray();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see arkuimodel.arkUIModel.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Page#getPageTitle <em>Page Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Title</em>'.
	 * @see arkuimodel.arkUIModel.Page#getPageTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_PageTitle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Page#isIsHome <em>Is Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Home</em>'.
	 * @see arkuimodel.arkUIModel.Page#isIsHome()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_IsHome();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Page#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see arkuimodel.arkUIModel.Page#getFileName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_FileName();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.Page#getUilogic <em>Uilogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uilogic</em>'.
	 * @see arkuimodel.arkUIModel.Page#getUilogic()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Uilogic();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.Page#getUidesign <em>Uidesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uidesign</em>'.
	 * @see arkuimodel.arkUIModel.Page#getUidesign()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Uidesign();

	/**
	 * Returns the meta object for the reference list '{@link arkuimodel.arkUIModel.Page#getSubpages <em>Subpages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subpages</em>'.
	 * @see arkuimodel.arkUIModel.Page#getSubpages()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Subpages();

	/**
	 * Returns the meta object for the reference list '{@link arkuimodel.arkUIModel.Page#getPageroute <em>Pageroute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pageroute</em>'.
	 * @see arkuimodel.arkUIModel.Page#getPageroute()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pageroute();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.UILogic <em>UI Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Logic</em>'.
	 * @see arkuimodel.arkUIModel.UILogic
	 * @generated
	 */
	EClass getUILogic();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.UILogic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.UILogic#getName()
	 * @see #getUILogic()
	 * @generated
	 */
	EAttribute getUILogic_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.UILogic#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow</em>'.
	 * @see arkuimodel.arkUIModel.UILogic#getWorkflow()
	 * @see #getUILogic()
	 * @generated
	 */
	EReference getUILogic_Workflow();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.UILogic#getPageparameter <em>Pageparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pageparameter</em>'.
	 * @see arkuimodel.arkUIModel.UILogic#getPageparameter()
	 * @see #getUILogic()
	 * @generated
	 */
	EReference getUILogic_Pageparameter();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.UIDesign <em>UI Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Design</em>'.
	 * @see arkuimodel.arkUIModel.UIDesign
	 * @generated
	 */
	EClass getUIDesign();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.UIDesign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.UIDesign#getName()
	 * @see #getUIDesign()
	 * @generated
	 */
	EAttribute getUIDesign_Name();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.UIDesign#getPageview <em>Pageview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pageview</em>'.
	 * @see arkuimodel.arkUIModel.UIDesign#getPageview()
	 * @see #getUIDesign()
	 * @generated
	 */
	EReference getUIDesign_Pageview();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.PageStruct <em>Page Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Struct</em>'.
	 * @see arkuimodel.arkUIModel.PageStruct
	 * @generated
	 */
	EClass getPageStruct();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PageStruct#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see arkuimodel.arkUIModel.PageStruct#getTitle()
	 * @see #getPageStruct()
	 * @generated
	 */
	EAttribute getPageStruct_Title();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PageStruct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.PageStruct#getType()
	 * @see #getPageStruct()
	 * @generated
	 */
	EAttribute getPageStruct_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.PageStruct#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see arkuimodel.arkUIModel.PageStruct#getWidgets()
	 * @see #getPageStruct()
	 * @generated
	 */
	EReference getPageStruct_Widgets();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.PageStruct#getPageevent <em>Pageevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pageevent</em>'.
	 * @see arkuimodel.arkUIModel.PageStruct#getPageevent()
	 * @see #getPageStruct()
	 * @generated
	 */
	EReference getPageStruct_Pageevent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.UIComponent <em>UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Component</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent
	 * @generated
	 */
	EClass getUIComponent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.UIComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getId()
	 * @see #getUIComponent()
	 * @generated
	 */
	EAttribute getUIComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.UIComponent#getWidgetType <em>Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widget Type</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getWidgetType()
	 * @see #getUIComponent()
	 * @generated
	 */
	EAttribute getUIComponent_WidgetType();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.UIComponent#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widget</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getWidget()
	 * @see #getUIComponent()
	 * @generated
	 */
	EReference getUIComponent_Widget();

	/**
	 * Returns the meta object for the reference list '{@link arkuimodel.arkUIModel.UIComponent#getFunflow <em>Funflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Funflow</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getFunflow()
	 * @see #getUIComponent()
	 * @generated
	 */
	EReference getUIComponent_Funflow();

	/**
	 * Returns the meta object for the reference list '{@link arkuimodel.arkUIModel.UIComponent#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getRoot()
	 * @see #getUIComponent()
	 * @generated
	 */
	EReference getUIComponent_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.UIComponent#getPagerefrence <em>Pagerefrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagerefrence</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getPagerefrence()
	 * @see #getUIComponent()
	 * @generated
	 */
	EReference getUIComponent_Pagerefrence();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.UIComponent#getForeach <em>Foreach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreach</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getForeach()
	 * @see #getUIComponent()
	 * @generated
	 */
	EReference getUIComponent_Foreach();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.UIComponent#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getIf()
	 * @see #getUIComponent()
	 * @generated
	 */
	EReference getUIComponent_If();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.UIComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.UIComponent#getName()
	 * @see #getUIComponent()
	 * @generated
	 */
	EAttribute getUIComponent_Name();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextWidget <em>Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Widget</em>'.
	 * @see arkuimodel.arkUIModel.TextWidget
	 * @generated
	 */
	EClass getTextWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextWidget#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see arkuimodel.arkUIModel.TextWidget#getContent()
	 * @see #getTextWidget()
	 * @generated
	 */
	EAttribute getTextWidget_Content();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TextWidget#getTextevent <em>Textevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textevent</em>'.
	 * @see arkuimodel.arkUIModel.TextWidget#getTextevent()
	 * @see #getTextWidget()
	 * @generated
	 */
	EReference getTextWidget_Textevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TextWidget#getTextstyle <em>Textstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textstyle</em>'.
	 * @see arkuimodel.arkUIModel.TextWidget#getTextstyle()
	 * @see #getTextWidget()
	 * @generated
	 */
	EReference getTextWidget_Textstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ButtonWidget <em>Button Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Widget</em>'.
	 * @see arkuimodel.arkUIModel.ButtonWidget
	 * @generated
	 */
	EClass getButtonWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ButtonWidget#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see arkuimodel.arkUIModel.ButtonWidget#getLabel()
	 * @see #getButtonWidget()
	 * @generated
	 */
	EAttribute getButtonWidget_Label();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ButtonWidget#getStateEffect <em>State Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Effect</em>'.
	 * @see arkuimodel.arkUIModel.ButtonWidget#getStateEffect()
	 * @see #getButtonWidget()
	 * @generated
	 */
	EAttribute getButtonWidget_StateEffect();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ButtonWidget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.ButtonWidget#getType()
	 * @see #getButtonWidget()
	 * @generated
	 */
	EAttribute getButtonWidget_Type();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ButtonWidget#getButtonevent <em>Buttonevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buttonevent</em>'.
	 * @see arkuimodel.arkUIModel.ButtonWidget#getButtonevent()
	 * @see #getButtonWidget()
	 * @generated
	 */
	EReference getButtonWidget_Buttonevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ButtonWidget#getButtonstyle <em>Buttonstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buttonstyle</em>'.
	 * @see arkuimodel.arkUIModel.ButtonWidget#getButtonstyle()
	 * @see #getButtonWidget()
	 * @generated
	 */
	EReference getButtonWidget_Buttonstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.FlexContainer <em>Flex Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flex Container</em>'.
	 * @see arkuimodel.arkUIModel.FlexContainer
	 * @generated
	 */
	EClass getFlexContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.FlexContainer#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see arkuimodel.arkUIModel.FlexContainer#getDirection()
	 * @see #getFlexContainer()
	 * @generated
	 */
	EAttribute getFlexContainer_Direction();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.FlexContainer#getWrap <em>Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap</em>'.
	 * @see arkuimodel.arkUIModel.FlexContainer#getWrap()
	 * @see #getFlexContainer()
	 * @generated
	 */
	EAttribute getFlexContainer_Wrap();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.FlexContainer#getJustifyContent <em>Justify Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify Content</em>'.
	 * @see arkuimodel.arkUIModel.FlexContainer#getJustifyContent()
	 * @see #getFlexContainer()
	 * @generated
	 */
	EAttribute getFlexContainer_JustifyContent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.FlexContainer#getAlignItems <em>Align Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align Items</em>'.
	 * @see arkuimodel.arkUIModel.FlexContainer#getAlignItems()
	 * @see #getFlexContainer()
	 * @generated
	 */
	EAttribute getFlexContainer_AlignItems();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.FlexContainer#getAlignContent <em>Align Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align Content</em>'.
	 * @see arkuimodel.arkUIModel.FlexContainer#getAlignContent()
	 * @see #getFlexContainer()
	 * @generated
	 */
	EAttribute getFlexContainer_AlignContent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.FlexContainer#getFlexevent <em>Flexevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flexevent</em>'.
	 * @see arkuimodel.arkUIModel.FlexContainer#getFlexevent()
	 * @see #getFlexContainer()
	 * @generated
	 */
	EReference getFlexContainer_Flexevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.FlexContainer#getFlexstyle <em>Flexstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flexstyle</em>'.
	 * @see arkuimodel.arkUIModel.FlexContainer#getFlexstyle()
	 * @see #getFlexContainer()
	 * @generated
	 */
	EReference getFlexContainer_Flexstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.StyleLibray <em>Style Libray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Libray</em>'.
	 * @see arkuimodel.arkUIModel.StyleLibray
	 * @generated
	 */
	EClass getStyleLibray();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.StyleLibray#getStyleclass <em>Styleclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styleclass</em>'.
	 * @see arkuimodel.arkUIModel.StyleLibray#getStyleclass()
	 * @see #getStyleLibray()
	 * @generated
	 */
	EReference getStyleLibray_Styleclass();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleLibray#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.StyleLibray#getName()
	 * @see #getStyleLibray()
	 * @generated
	 */
	EAttribute getStyleLibray_Name();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.StyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Class</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass
	 * @generated
	 */
	EClass getStyleClass();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getWidth()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Width();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getHeight()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Height();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getAspectRatio <em>Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Ratio</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getAspectRatio()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_AspectRatio();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getPaddingleft <em>Paddingleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paddingleft</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getPaddingleft()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Paddingleft();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getMarginleft <em>Marginleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marginleft</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getMarginleft()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Marginleft();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getLayoutWeight <em>Layout Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Weight</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getLayoutWeight()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_LayoutWeight();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getAlign()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Align();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getDirection()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Direction();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getPosition()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Position();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getOffset()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Offset();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getBackgroundColor()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getBackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Image</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getBackgroundImage()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_BackgroundImage();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getBorder()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Border();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getVisibility()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getName()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Name();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.StyleClass#getAnimationclass <em>Animationclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Animationclass</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getAnimationclass()
	 * @see #getStyleClass()
	 * @generated
	 */
	EReference getStyleClass_Animationclass();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getAssign()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Assign();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getPaddingright <em>Paddingright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paddingright</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getPaddingright()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Paddingright();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getPaddingtop <em>Paddingtop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paddingtop</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getPaddingtop()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Paddingtop();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getPaddingbottom <em>Paddingbottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paddingbottom</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getPaddingbottom()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Paddingbottom();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getMarginright <em>Marginright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marginright</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getMarginright()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Marginright();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getMargintop <em>Margintop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margintop</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getMargintop()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Margintop();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getMarginbottom <em>Marginbottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marginbottom</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getMarginbottom()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Marginbottom();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getBorderRadius <em>Border Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Radius</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getBorderRadius()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_BorderRadius();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getBackgroundImageSize <em>Background Image Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Image Size</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getBackgroundImageSize()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_BackgroundImageSize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotate</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getRotate()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_Rotate();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StyleClass#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see arkuimodel.arkUIModel.StyleClass#getZIndex()
	 * @see #getStyleClass()
	 * @generated
	 */
	EAttribute getStyleClass_ZIndex();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.PrimitiveOperation <em>Primitive Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Operation</em>'.
	 * @see arkuimodel.arkUIModel.PrimitiveOperation
	 * @generated
	 */
	EClass getPrimitiveOperation();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PrimitiveOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.PrimitiveOperation#getName()
	 * @see #getPrimitiveOperation()
	 * @generated
	 */
	EAttribute getPrimitiveOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.PrimitiveOperation#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see arkuimodel.arkUIModel.PrimitiveOperation#getContains()
	 * @see #getPrimitiveOperation()
	 * @generated
	 */
	EReference getPrimitiveOperation_Contains();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.PrimitiveOperation#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returntype</em>'.
	 * @see arkuimodel.arkUIModel.PrimitiveOperation#getReturntype()
	 * @see #getPrimitiveOperation()
	 * @generated
	 */
	EReference getPrimitiveOperation_Returntype();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextInputWidget <em>Text Input Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input Widget</em>'.
	 * @see arkuimodel.arkUIModel.TextInputWidget
	 * @generated
	 */
	EClass getTextInputWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputWidget#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see arkuimodel.arkUIModel.TextInputWidget#getText()
	 * @see #getTextInputWidget()
	 * @generated
	 */
	EAttribute getTextInputWidget_Text();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputWidget#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see arkuimodel.arkUIModel.TextInputWidget#getPlaceholder()
	 * @see #getTextInputWidget()
	 * @generated
	 */
	EAttribute getTextInputWidget_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputWidget#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller</em>'.
	 * @see arkuimodel.arkUIModel.TextInputWidget#getController()
	 * @see #getTextInputWidget()
	 * @generated
	 */
	EAttribute getTextInputWidget_Controller();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TextInputWidget#getTextinputevent <em>Textinputevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textinputevent</em>'.
	 * @see arkuimodel.arkUIModel.TextInputWidget#getTextinputevent()
	 * @see #getTextInputWidget()
	 * @generated
	 */
	EReference getTextInputWidget_Textinputevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TextInputWidget#getTextinputstyle <em>Textinputstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textinputstyle</em>'.
	 * @see arkuimodel.arkUIModel.TextInputWidget#getTextinputstyle()
	 * @see #getTextInputWidget()
	 * @generated
	 */
	EReference getTextInputWidget_Textinputstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ListContainer <em>List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Container</em>'.
	 * @see arkuimodel.arkUIModel.ListContainer
	 * @generated
	 */
	EClass getListContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListContainer#getInitialIndex <em>Initial Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Index</em>'.
	 * @see arkuimodel.arkUIModel.ListContainer#getInitialIndex()
	 * @see #getListContainer()
	 * @generated
	 */
	EAttribute getListContainer_InitialIndex();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListContainer#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see arkuimodel.arkUIModel.ListContainer#getSpace()
	 * @see #getListContainer()
	 * @generated
	 */
	EAttribute getListContainer_Space();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListContainer#getScroller <em>Scroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scroller</em>'.
	 * @see arkuimodel.arkUIModel.ListContainer#getScroller()
	 * @see #getListContainer()
	 * @generated
	 */
	EAttribute getListContainer_Scroller();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.ListContainer#getListitemcontainer <em>Listitemcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listitemcontainer</em>'.
	 * @see arkuimodel.arkUIModel.ListContainer#getListitemcontainer()
	 * @see #getListContainer()
	 * @generated
	 */
	EReference getListContainer_Listitemcontainer();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ListContainer#getListevent <em>Listevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listevent</em>'.
	 * @see arkuimodel.arkUIModel.ListContainer#getListevent()
	 * @see #getListContainer()
	 * @generated
	 */
	EReference getListContainer_Listevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ListContainer#getListstyle <em>Liststyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Liststyle</em>'.
	 * @see arkuimodel.arkUIModel.ListContainer#getListstyle()
	 * @see #getListContainer()
	 * @generated
	 */
	EReference getListContainer_Liststyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Style</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle
	 * @generated
	 */
	EClass getTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getFontColor()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getFontSize()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getMinFontSize <em>Min Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Font Size</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getMinFontSize()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_MinFontSize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getMaxFontSize <em>Max Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Font Size</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getMaxFontSize()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_MaxFontSize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getFontStyle()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getFontWeight()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getTextAlign <em>Text Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Align</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getTextAlign()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextAlign();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getLineHeight <em>Line Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Height</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getLineHeight()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_LineHeight();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getTextOverflow <em>Text Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Overflow</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getTextOverflow()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextOverflow();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getFontFamily()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getMaxLines <em>Max Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lines</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getMaxLines()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_MaxLines();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getDecorationType <em>Decoration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Type</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getDecorationType()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_DecorationType();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getLetterSpacing <em>Letter Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter Spacing</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getLetterSpacing()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_LetterSpacing();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getTextCase <em>Text Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Case</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getTextCase()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextCase();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getBaselineOffset <em>Baseline Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baseline Offset</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getBaselineOffset()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_BaselineOffset();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextStyle#getDecorationColor <em>Decoration Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Color</em>'.
	 * @see arkuimodel.arkUIModel.TextStyle#getDecorationColor()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_DecorationColor();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextInputStyle <em>Text Input Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input Style</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle
	 * @generated
	 */
	EClass getTextInputStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getType()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_Type();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getPlaceholderColor <em>Placeholder Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder Color</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getPlaceholderColor()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_PlaceholderColor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getPlaceholderFont <em>Placeholder Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder Font</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getPlaceholderFont()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_PlaceholderFont();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getEnterKeyType <em>Enter Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enter Key Type</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getEnterKeyType()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_EnterKeyType();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getCaretColor <em>Caret Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caret Color</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getCaretColor()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_CaretColor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getMaxLength()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getFontColor()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getFontSize()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getFontStyle()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getFontWeight()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getFontFamily()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputStyle#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Filter</em>'.
	 * @see arkuimodel.arkUIModel.TextInputStyle#getInputFilter()
	 * @see #getTextInputStyle()
	 * @generated
	 */
	EAttribute getTextInputStyle_InputFilter();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see arkuimodel.arkUIModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Parameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see arkuimodel.arkUIModel.Parameter#getParameterType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Parameter#getPType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PType</em>'.
	 * @see arkuimodel.arkUIModel.Parameter#getPType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_PType();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Parameter#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign</em>'.
	 * @see arkuimodel.arkUIModel.Parameter#getAssign()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Assign();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Parameter#isConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see arkuimodel.arkUIModel.Parameter#isConst()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Const();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Parameter#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see arkuimodel.arkUIModel.Parameter#getState()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_State();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TypeCS <em>Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type CS</em>'.
	 * @see arkuimodel.arkUIModel.TypeCS
	 * @generated
	 */
	EClass getTypeCS();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TypeCS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.TypeCS#getType()
	 * @see #getTypeCS()
	 * @generated
	 */
	EAttribute getTypeCS_Type();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.RowContainer <em>Row Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Container</em>'.
	 * @see arkuimodel.arkUIModel.RowContainer
	 * @generated
	 */
	EClass getRowContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.RowContainer#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see arkuimodel.arkUIModel.RowContainer#getSpace()
	 * @see #getRowContainer()
	 * @generated
	 */
	EAttribute getRowContainer_Space();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.RowContainer#getAlignItems <em>Align Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align Items</em>'.
	 * @see arkuimodel.arkUIModel.RowContainer#getAlignItems()
	 * @see #getRowContainer()
	 * @generated
	 */
	EAttribute getRowContainer_AlignItems();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.RowContainer#getJustifyContent <em>Justify Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify Content</em>'.
	 * @see arkuimodel.arkUIModel.RowContainer#getJustifyContent()
	 * @see #getRowContainer()
	 * @generated
	 */
	EAttribute getRowContainer_JustifyContent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.RowContainer#getRowevent <em>Rowevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rowevent</em>'.
	 * @see arkuimodel.arkUIModel.RowContainer#getRowevent()
	 * @see #getRowContainer()
	 * @generated
	 */
	EReference getRowContainer_Rowevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.RowContainer#getRowstyle <em>Rowstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rowstyle</em>'.
	 * @see arkuimodel.arkUIModel.RowContainer#getRowstyle()
	 * @see #getRowContainer()
	 * @generated
	 */
	EReference getRowContainer_Rowstyle();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.RowContainer#getBindMenu <em>Bind Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bind Menu</em>'.
	 * @see arkuimodel.arkUIModel.RowContainer#getBindMenu()
	 * @see #getRowContainer()
	 * @generated
	 */
	EReference getRowContainer_BindMenu();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ColumnContainer <em>Column Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Container</em>'.
	 * @see arkuimodel.arkUIModel.ColumnContainer
	 * @generated
	 */
	EClass getColumnContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ColumnContainer#getJustifyContent <em>Justify Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify Content</em>'.
	 * @see arkuimodel.arkUIModel.ColumnContainer#getJustifyContent()
	 * @see #getColumnContainer()
	 * @generated
	 */
	EAttribute getColumnContainer_JustifyContent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ColumnContainer#getAlignItems <em>Align Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align Items</em>'.
	 * @see arkuimodel.arkUIModel.ColumnContainer#getAlignItems()
	 * @see #getColumnContainer()
	 * @generated
	 */
	EAttribute getColumnContainer_AlignItems();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ColumnContainer#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see arkuimodel.arkUIModel.ColumnContainer#getSpace()
	 * @see #getColumnContainer()
	 * @generated
	 */
	EAttribute getColumnContainer_Space();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ColumnContainer#getColumnevent <em>Columnevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columnevent</em>'.
	 * @see arkuimodel.arkUIModel.ColumnContainer#getColumnevent()
	 * @see #getColumnContainer()
	 * @generated
	 */
	EReference getColumnContainer_Columnevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ColumnContainer#getColumnstyle <em>Columnstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columnstyle</em>'.
	 * @see arkuimodel.arkUIModel.ColumnContainer#getColumnstyle()
	 * @see #getColumnContainer()
	 * @generated
	 */
	EReference getColumnContainer_Columnstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Style</em>'.
	 * @see arkuimodel.arkUIModel.ButtonStyle
	 * @generated
	 */
	EClass getButtonStyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.FlexStyle <em>Flex Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flex Style</em>'.
	 * @see arkuimodel.arkUIModel.FlexStyle
	 * @generated
	 */
	EClass getFlexStyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.RowStyle <em>Row Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Style</em>'.
	 * @see arkuimodel.arkUIModel.RowStyle
	 * @generated
	 */
	EClass getRowStyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ColumnStyle <em>Column Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Style</em>'.
	 * @see arkuimodel.arkUIModel.ColumnStyle
	 * @generated
	 */
	EClass getColumnStyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Style</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle
	 * @generated
	 */
	EClass getListStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getListDirection <em>List Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Direction</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getListDirection()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_ListDirection();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getEdgeEffect <em>Edge Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Effect</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getEdgeEffect()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_EdgeEffect();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getDivider <em>Divider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Divider</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getDivider()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_Divider();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getEditMode <em>Edit Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Mode</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getEditMode()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_EditMode();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getChainAnimation <em>Chain Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain Animation</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getChainAnimation()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_ChainAnimation();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getScrollBar <em>Scroll Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scroll Bar</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getScrollBar()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_ScrollBar();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getCachedCount <em>Cached Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached Count</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getCachedCount()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_CachedCount();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getStrokeWidth()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getColor()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getStartMargin <em>Start Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Margin</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getStartMargin()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_StartMargin();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListStyle#getEndMargin <em>End Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Margin</em>'.
	 * @see arkuimodel.arkUIModel.ListStyle#getEndMargin()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_EndMargin();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ListItemStyle <em>List Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Style</em>'.
	 * @see arkuimodel.arkUIModel.ListItemStyle
	 * @generated
	 */
	EClass getListItemStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListItemStyle#getSticky <em>Sticky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sticky</em>'.
	 * @see arkuimodel.arkUIModel.ListItemStyle#getSticky()
	 * @see #getListItemStyle()
	 * @generated
	 */
	EAttribute getListItemStyle_Sticky();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListItemStyle#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see arkuimodel.arkUIModel.ListItemStyle#getEditable()
	 * @see #getListItemStyle()
	 * @generated
	 */
	EAttribute getListItemStyle_Editable();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ListItemContainer <em>List Item Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Container</em>'.
	 * @see arkuimodel.arkUIModel.ListItemContainer
	 * @generated
	 */
	EClass getListItemContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListItemContainer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.ListItemContainer#getValue()
	 * @see #getListItemContainer()
	 * @generated
	 */
	EAttribute getListItemContainer_Value();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ListItemContainer#getListitemevent <em>Listitemevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listitemevent</em>'.
	 * @see arkuimodel.arkUIModel.ListItemContainer#getListitemevent()
	 * @see #getListItemContainer()
	 * @generated
	 */
	EReference getListItemContainer_Listitemevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ListItemContainer#getListitemstyle <em>Listitemstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listitemstyle</em>'.
	 * @see arkuimodel.arkUIModel.ListItemContainer#getListitemstyle()
	 * @see #getListItemContainer()
	 * @generated
	 */
	EReference getListItemContainer_Listitemstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ImageWidget <em>Image Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Widget</em>'.
	 * @see arkuimodel.arkUIModel.ImageWidget
	 * @generated
	 */
	EClass getImageWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageWidget#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see arkuimodel.arkUIModel.ImageWidget#getSrc()
	 * @see #getImageWidget()
	 * @generated
	 */
	EAttribute getImageWidget_Src();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ImageWidget#getImageevent <em>Imageevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imageevent</em>'.
	 * @see arkuimodel.arkUIModel.ImageWidget#getImageevent()
	 * @see #getImageWidget()
	 * @generated
	 */
	EReference getImageWidget_Imageevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ImageWidget#getImagestyle <em>Imagestyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imagestyle</em>'.
	 * @see arkuimodel.arkUIModel.ImageWidget#getImagestyle()
	 * @see #getImageWidget()
	 * @generated
	 */
	EReference getImageWidget_Imagestyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ImageStyle <em>Image Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Style</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle
	 * @generated
	 */
	EClass getImageStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getAlt()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_Alt();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getMatchTextDirection <em>Match Text Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Text Direction</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getMatchTextDirection()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_MatchTextDirection();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getFitOriginalSize <em>Fit Original Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fit Original Size</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getFitOriginalSize()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_FitOriginalSize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getFillColor()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_FillColor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getObjectFit <em>Object Fit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Fit</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getObjectFit()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_ObjectFit();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getObjectRepeat <em>Object Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Repeat</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getObjectRepeat()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_ObjectRepeat();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getAutoResize <em>Auto Resize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Resize</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getAutoResize()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_AutoResize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getRenderMode <em>Render Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Render Mode</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getRenderMode()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_RenderMode();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getInterpolation <em>Interpolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getInterpolation()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_Interpolation();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getSourceSizeHeight <em>Source Size Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Size Height</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getSourceSizeHeight()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_SourceSizeHeight();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getSyncLoad <em>Sync Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Load</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getSyncLoad()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_SyncLoad();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageStyle#getSourceSizeWidth <em>Source Size Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Size Width</em>'.
	 * @see arkuimodel.arkUIModel.ImageStyle#getSourceSizeWidth()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_SourceSizeWidth();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see arkuimodel.arkUIModel.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.ControlFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see arkuimodel.arkUIModel.ControlFlow#getTarget()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Target();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.ControlFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see arkuimodel.arkUIModel.ControlFlow#getSource()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Source();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Event</em>'.
	 * @see arkuimodel.arkUIModel.TriggerEvent
	 * @generated
	 */
	EClass getTriggerEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.TriggerEvent#getEventclass <em>Eventclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eventclass</em>'.
	 * @see arkuimodel.arkUIModel.TriggerEvent#getEventclass()
	 * @see #getTriggerEvent()
	 * @generated
	 */
	EReference getTriggerEvent_Eventclass();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see arkuimodel.arkUIModel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnClick <em>On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Click</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnClick()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnClick();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnTouch <em>On Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Touch</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnTouch()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnTouch();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnDragStart <em>On Drag Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Drag Start</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnDragStart()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnDragStart();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnDragEnter <em>On Drag Enter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Drag Enter</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnDragEnter()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnDragEnter();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnDragMove <em>On Drag Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Drag Move</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnDragMove()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnDragMove();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnDragLeave <em>On Drag Leave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Drag Leave</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnDragLeave()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnDragLeave();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnDrop <em>On Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Drop</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnDrop()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnDrop();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnAppear <em>On Appear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Appear</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnAppear()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnAppear();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnDisAppear <em>On Dis Appear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Dis Appear</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnDisAppear()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnDisAppear();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getOnAreaChange <em>On Area Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Area Change</em>'.
	 * @see arkuimodel.arkUIModel.Event#getOnAreaChange()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_OnAreaChange();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.PageEvent <em>Page Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Event</em>'.
	 * @see arkuimodel.arkUIModel.PageEvent
	 * @generated
	 */
	EClass getPageEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PageEvent#getOnPageHide <em>On Page Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Page Hide</em>'.
	 * @see arkuimodel.arkUIModel.PageEvent#getOnPageHide()
	 * @see #getPageEvent()
	 * @generated
	 */
	EAttribute getPageEvent_OnPageHide();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PageEvent#getAboutToAppear <em>About To Appear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About To Appear</em>'.
	 * @see arkuimodel.arkUIModel.PageEvent#getAboutToAppear()
	 * @see #getPageEvent()
	 * @generated
	 */
	EAttribute getPageEvent_AboutToAppear();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PageEvent#getOnPageShow <em>On Page Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Page Show</em>'.
	 * @see arkuimodel.arkUIModel.PageEvent#getOnPageShow()
	 * @see #getPageEvent()
	 * @generated
	 */
	EAttribute getPageEvent_OnPageShow();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PageEvent#getOnBackPress <em>On Back Press</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Back Press</em>'.
	 * @see arkuimodel.arkUIModel.PageEvent#getOnBackPress()
	 * @see #getPageEvent()
	 * @generated
	 */
	EAttribute getPageEvent_OnBackPress();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PageEvent#getAboutToDisappear <em>About To Disappear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About To Disappear</em>'.
	 * @see arkuimodel.arkUIModel.PageEvent#getAboutToDisappear()
	 * @see #getPageEvent()
	 * @generated
	 */
	EAttribute getPageEvent_AboutToDisappear();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ColumnEvent <em>Column Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Event</em>'.
	 * @see arkuimodel.arkUIModel.ColumnEvent
	 * @generated
	 */
	EClass getColumnEvent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.RowEvent <em>Row Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Event</em>'.
	 * @see arkuimodel.arkUIModel.RowEvent
	 * @generated
	 */
	EClass getRowEvent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.FlexEvent <em>Flex Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flex Event</em>'.
	 * @see arkuimodel.arkUIModel.FlexEvent
	 * @generated
	 */
	EClass getFlexEvent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ImageEvent <em>Image Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Event</em>'.
	 * @see arkuimodel.arkUIModel.ImageEvent
	 * @generated
	 */
	EClass getImageEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageEvent#getOnComplete <em>On Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Complete</em>'.
	 * @see arkuimodel.arkUIModel.ImageEvent#getOnComplete()
	 * @see #getImageEvent()
	 * @generated
	 */
	EAttribute getImageEvent_OnComplete();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageEvent#getOnError <em>On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Error</em>'.
	 * @see arkuimodel.arkUIModel.ImageEvent#getOnError()
	 * @see #getImageEvent()
	 * @generated
	 */
	EAttribute getImageEvent_OnError();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageEvent#getOnFinish <em>On Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Finish</em>'.
	 * @see arkuimodel.arkUIModel.ImageEvent#getOnFinish()
	 * @see #getImageEvent()
	 * @generated
	 */
	EAttribute getImageEvent_OnFinish();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextEvent <em>Text Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Event</em>'.
	 * @see arkuimodel.arkUIModel.TextEvent
	 * @generated
	 */
	EClass getTextEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextEvent#getOnFocus <em>On Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Focus</em>'.
	 * @see arkuimodel.arkUIModel.TextEvent#getOnFocus()
	 * @see #getTextEvent()
	 * @generated
	 */
	EAttribute getTextEvent_OnFocus();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextEvent#getOnBlur <em>On Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Blur</em>'.
	 * @see arkuimodel.arkUIModel.TextEvent#getOnBlur()
	 * @see #getTextEvent()
	 * @generated
	 */
	EAttribute getTextEvent_OnBlur();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ButtonEvent <em>Button Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Event</em>'.
	 * @see arkuimodel.arkUIModel.ButtonEvent
	 * @generated
	 */
	EClass getButtonEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ButtonEvent#getOnBlur <em>On Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Blur</em>'.
	 * @see arkuimodel.arkUIModel.ButtonEvent#getOnBlur()
	 * @see #getButtonEvent()
	 * @generated
	 */
	EAttribute getButtonEvent_OnBlur();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ButtonEvent#getOnFocus <em>On Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Focus</em>'.
	 * @see arkuimodel.arkUIModel.ButtonEvent#getOnFocus()
	 * @see #getButtonEvent()
	 * @generated
	 */
	EAttribute getButtonEvent_OnFocus();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextInputEvent <em>Text Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input Event</em>'.
	 * @see arkuimodel.arkUIModel.TextInputEvent
	 * @generated
	 */
	EClass getTextInputEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputEvent#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see arkuimodel.arkUIModel.TextInputEvent#getOnChange()
	 * @see #getTextInputEvent()
	 * @generated
	 */
	EAttribute getTextInputEvent_OnChange();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputEvent#getOnSubmit <em>On Submit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Submit</em>'.
	 * @see arkuimodel.arkUIModel.TextInputEvent#getOnSubmit()
	 * @see #getTextInputEvent()
	 * @generated
	 */
	EAttribute getTextInputEvent_OnSubmit();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputEvent#getOnCopy <em>On Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Copy</em>'.
	 * @see arkuimodel.arkUIModel.TextInputEvent#getOnCopy()
	 * @see #getTextInputEvent()
	 * @generated
	 */
	EAttribute getTextInputEvent_OnCopy();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputEvent#getOnPaste <em>On Paste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Paste</em>'.
	 * @see arkuimodel.arkUIModel.TextInputEvent#getOnPaste()
	 * @see #getTextInputEvent()
	 * @generated
	 */
	EAttribute getTextInputEvent_OnPaste();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputEvent#getOnCut <em>On Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Cut</em>'.
	 * @see arkuimodel.arkUIModel.TextInputEvent#getOnCut()
	 * @see #getTextInputEvent()
	 * @generated
	 */
	EAttribute getTextInputEvent_OnCut();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputEvent#getOnEditChanged <em>On Edit Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Edit Changed</em>'.
	 * @see arkuimodel.arkUIModel.TextInputEvent#getOnEditChanged()
	 * @see #getTextInputEvent()
	 * @generated
	 */
	EAttribute getTextInputEvent_OnEditChanged();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextInputEvent#getOnEditChange <em>On Edit Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Edit Change</em>'.
	 * @see arkuimodel.arkUIModel.TextInputEvent#getOnEditChange()
	 * @see #getTextInputEvent()
	 * @generated
	 */
	EAttribute getTextInputEvent_OnEditChange();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ListEvent <em>List Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Event</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent
	 * @generated
	 */
	EClass getListEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnScroll <em>On Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Scroll</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnScroll()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnScroll();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnScrollIndex <em>On Scroll Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Scroll Index</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnScrollIndex()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnScrollIndex();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnReachStart <em>On Reach Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Reach Start</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnReachStart()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnReachStart();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnReachEnd <em>On Reach End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Reach End</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnReachEnd()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnReachEnd();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnScrollStop <em>On Scroll Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Scroll Stop</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnScrollStop()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnScrollStop();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnItemDelete <em>On Item Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Item Delete</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnItemDelete()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnItemDelete();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnItemMove <em>On Item Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Item Move</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnItemMove()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnItemMove();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnBlur <em>On Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Blur</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnBlur()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnBlur();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ListEvent#getOnFocus <em>On Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Focus</em>'.
	 * @see arkuimodel.arkUIModel.ListEvent#getOnFocus()
	 * @see #getListEvent()
	 * @generated
	 */
	EAttribute getListEvent_OnFocus();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ListItemEvent <em>List Item Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Event</em>'.
	 * @see arkuimodel.arkUIModel.ListItemEvent
	 * @generated
	 */
	EClass getListItemEvent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.UIOperation <em>UI Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Operation</em>'.
	 * @see arkuimodel.arkUIModel.UIOperation
	 * @generated
	 */
	EClass getUIOperation();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SeviceOperation <em>Sevice Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sevice Operation</em>'.
	 * @see arkuimodel.arkUIModel.SeviceOperation
	 * @generated
	 */
	EClass getSeviceOperation();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SeviceOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.SeviceOperation#getType()
	 * @see #getSeviceOperation()
	 * @generated
	 */
	EAttribute getSeviceOperation_Type();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.LoopOp <em>Loop Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Op</em>'.
	 * @see arkuimodel.arkUIModel.LoopOp
	 * @generated
	 */
	EClass getLoopOp();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.LoopOp#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see arkuimodel.arkUIModel.LoopOp#getStart()
	 * @see #getLoopOp()
	 * @generated
	 */
	EAttribute getLoopOp_Start();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.LoopOp#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see arkuimodel.arkUIModel.LoopOp#getEnd()
	 * @see #getLoopOp()
	 * @generated
	 */
	EAttribute getLoopOp_End();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.LoopOp#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see arkuimodel.arkUIModel.LoopOp#getStep()
	 * @see #getLoopOp()
	 * @generated
	 */
	EAttribute getLoopOp_Step();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.LoopOp#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see arkuimodel.arkUIModel.LoopOp#getExpression()
	 * @see #getLoopOp()
	 * @generated
	 */
	EReference getLoopOp_Expression();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.CaseOp <em>Case Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Op</em>'.
	 * @see arkuimodel.arkUIModel.CaseOp
	 * @generated
	 */
	EClass getCaseOp();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.CaseOp#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see arkuimodel.arkUIModel.CaseOp#getExpression()
	 * @see #getCaseOp()
	 * @generated
	 */
	EReference getCaseOp_Expression();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.HttpOperation <em>Http Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Operation</em>'.
	 * @see arkuimodel.arkUIModel.HttpOperation
	 * @generated
	 */
	EClass getHttpOperation();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.HttpOperation#getHttpType <em>Http Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Type</em>'.
	 * @see arkuimodel.arkUIModel.HttpOperation#getHttpType()
	 * @see #getHttpOperation()
	 * @generated
	 */
	EAttribute getHttpOperation_HttpType();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.HttpOperation#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see arkuimodel.arkUIModel.HttpOperation#getUrl()
	 * @see #getHttpOperation()
	 * @generated
	 */
	EAttribute getHttpOperation_Url();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.HttpOperation#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res</em>'.
	 * @see arkuimodel.arkUIModel.HttpOperation#getRes()
	 * @see #getHttpOperation()
	 * @generated
	 */
	EAttribute getHttpOperation_Res();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GetParameter <em>Get Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Parameter</em>'.
	 * @see arkuimodel.arkUIModel.GetParameter
	 * @generated
	 */
	EClass getGetParameter();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GetParameter#getParm <em>Parm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parm</em>'.
	 * @see arkuimodel.arkUIModel.GetParameter#getParm()
	 * @see #getGetParameter()
	 * @generated
	 */
	EAttribute getGetParameter_Parm();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GetParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.GetParameter#getValue()
	 * @see #getGetParameter()
	 * @generated
	 */
	EAttribute getGetParameter_Value();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Parameter</em>'.
	 * @see arkuimodel.arkUIModel.SetParameter
	 * @generated
	 */
	EClass getSetParameter();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SetParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.SetParameter#getValue()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SetParameter#getParm <em>Parm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parm</em>'.
	 * @see arkuimodel.arkUIModel.SetParameter#getParm()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_Parm();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.AnimationClass <em>Animation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation Class</em>'.
	 * @see arkuimodel.arkUIModel.AnimationClass
	 * @generated
	 */
	EClass getAnimationClass();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.AnimationClass#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see arkuimodel.arkUIModel.AnimationClass#getDuration()
	 * @see #getAnimationClass()
	 * @generated
	 */
	EAttribute getAnimationClass_Duration();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.AnimationClass#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve</em>'.
	 * @see arkuimodel.arkUIModel.AnimationClass#getCurve()
	 * @see #getAnimationClass()
	 * @generated
	 */
	EAttribute getAnimationClass_Curve();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.AnimationClass#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see arkuimodel.arkUIModel.AnimationClass#getDelay()
	 * @see #getAnimationClass()
	 * @generated
	 */
	EAttribute getAnimationClass_Delay();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.AnimationClass#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see arkuimodel.arkUIModel.AnimationClass#getIterations()
	 * @see #getAnimationClass()
	 * @generated
	 */
	EAttribute getAnimationClass_Iterations();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.AnimationClass#getPlayMode <em>Play Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Mode</em>'.
	 * @see arkuimodel.arkUIModel.AnimationClass#getPlayMode()
	 * @see #getAnimationClass()
	 * @generated
	 */
	EAttribute getAnimationClass_PlayMode();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.AnimationClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.AnimationClass#getName()
	 * @see #getAnimationClass()
	 * @generated
	 */
	EAttribute getAnimationClass_Name();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ImageAnimator <em>Image Animator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Animator</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimator
	 * @generated
	 */
	EClass getImageAnimator();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.ImageAnimator#getImagesitem <em>Imagesitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imagesitem</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimator#getImagesitem()
	 * @see #getImageAnimator()
	 * @generated
	 */
	EReference getImageAnimator_Imagesitem();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ImageAnimator#getImageanimatorevent <em>Imageanimatorevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imageanimatorevent</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimator#getImageanimatorevent()
	 * @see #getImageAnimator()
	 * @generated
	 */
	EReference getImageAnimator_Imageanimatorevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ImageAnimator#getImageanimatorstyle <em>Imageanimatorstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imageanimatorstyle</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimator#getImageanimatorstyle()
	 * @see #getImageAnimator()
	 * @generated
	 */
	EReference getImageAnimator_Imageanimatorstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ImagesItem <em>Images Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Images Item</em>'.
	 * @see arkuimodel.arkUIModel.ImagesItem
	 * @generated
	 */
	EClass getImagesItem();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImagesItem#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see arkuimodel.arkUIModel.ImagesItem#getSrc()
	 * @see #getImagesItem()
	 * @generated
	 */
	EAttribute getImagesItem_Src();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImagesItem#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see arkuimodel.arkUIModel.ImagesItem#getWidth()
	 * @see #getImagesItem()
	 * @generated
	 */
	EAttribute getImagesItem_Width();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImagesItem#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see arkuimodel.arkUIModel.ImagesItem#getHeight()
	 * @see #getImagesItem()
	 * @generated
	 */
	EAttribute getImagesItem_Height();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImagesItem#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see arkuimodel.arkUIModel.ImagesItem#getTop()
	 * @see #getImagesItem()
	 * @generated
	 */
	EAttribute getImagesItem_Top();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImagesItem#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see arkuimodel.arkUIModel.ImagesItem#getLeft()
	 * @see #getImagesItem()
	 * @generated
	 */
	EAttribute getImagesItem_Left();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImagesItem#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see arkuimodel.arkUIModel.ImagesItem#getDuration()
	 * @see #getImagesItem()
	 * @generated
	 */
	EAttribute getImagesItem_Duration();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ImageAnimatorStyle <em>Image Animator Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Animator Style</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle
	 * @generated
	 */
	EClass getImageAnimatorStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorStyle#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle#getState()
	 * @see #getImageAnimatorStyle()
	 * @generated
	 */
	EAttribute getImageAnimatorStyle_State();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorStyle#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle#getDuration()
	 * @see #getImageAnimatorStyle()
	 * @generated
	 */
	EAttribute getImageAnimatorStyle_Duration();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorStyle#getReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle#getReverse()
	 * @see #getImageAnimatorStyle()
	 * @generated
	 */
	EAttribute getImageAnimatorStyle_Reverse();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorStyle#getFixedSize <em>Fixed Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Size</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle#getFixedSize()
	 * @see #getImageAnimatorStyle()
	 * @generated
	 */
	EAttribute getImageAnimatorStyle_FixedSize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorStyle#getPreDecode <em>Pre Decode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Decode</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle#getPreDecode()
	 * @see #getImageAnimatorStyle()
	 * @generated
	 */
	EAttribute getImageAnimatorStyle_PreDecode();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorStyle#getFillMode <em>Fill Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Mode</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle#getFillMode()
	 * @see #getImageAnimatorStyle()
	 * @generated
	 */
	EAttribute getImageAnimatorStyle_FillMode();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorStyle#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle#getIterations()
	 * @see #getImageAnimatorStyle()
	 * @generated
	 */
	EAttribute getImageAnimatorStyle_Iterations();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ImageAnimatorEvent <em>Image Animator Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Animator Event</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorEvent
	 * @generated
	 */
	EClass getImageAnimatorEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorEvent#getOnStart <em>On Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Start</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorEvent#getOnStart()
	 * @see #getImageAnimatorEvent()
	 * @generated
	 */
	EAttribute getImageAnimatorEvent_OnStart();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorEvent#getOnPause <em>On Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Pause</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorEvent#getOnPause()
	 * @see #getImageAnimatorEvent()
	 * @generated
	 */
	EAttribute getImageAnimatorEvent_OnPause();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorEvent#getOnRepeat <em>On Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Repeat</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorEvent#getOnRepeat()
	 * @see #getImageAnimatorEvent()
	 * @generated
	 */
	EAttribute getImageAnimatorEvent_OnRepeat();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorEvent#getOnCancel <em>On Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Cancel</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorEvent#getOnCancel()
	 * @see #getImageAnimatorEvent()
	 * @generated
	 */
	EAttribute getImageAnimatorEvent_OnCancel();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ImageAnimatorEvent#getOnFinish <em>On Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Finish</em>'.
	 * @see arkuimodel.arkUIModel.ImageAnimatorEvent#getOnFinish()
	 * @see #getImageAnimatorEvent()
	 * @generated
	 */
	EAttribute getImageAnimatorEvent_OnFinish();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.RouteSkip <em>Route Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Skip</em>'.
	 * @see arkuimodel.arkUIModel.RouteSkip
	 * @generated
	 */
	EClass getRouteSkip();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.RouteSkip#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.RouteSkip#getType()
	 * @see #getRouteSkip()
	 * @generated
	 */
	EAttribute getRouteSkip_Type();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.RouteSkip#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see arkuimodel.arkUIModel.RouteSkip#getUrl()
	 * @see #getRouteSkip()
	 * @generated
	 */
	EAttribute getRouteSkip_Url();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.RouteSkip#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see arkuimodel.arkUIModel.RouteSkip#getVariable()
	 * @see #getRouteSkip()
	 * @generated
	 */
	EAttribute getRouteSkip_Variable();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.RouteSkip#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page</em>'.
	 * @see arkuimodel.arkUIModel.RouteSkip#getPage()
	 * @see #getRouteSkip()
	 * @generated
	 */
	EAttribute getRouteSkip_Page();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GetRouteValue <em>Get Route Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Route Value</em>'.
	 * @see arkuimodel.arkUIModel.GetRouteValue
	 * @generated
	 */
	EClass getGetRouteValue();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GetRouteValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see arkuimodel.arkUIModel.GetRouteValue#getVariable()
	 * @see #getGetRouteValue()
	 * @generated
	 */
	EAttribute getGetRouteValue_Variable();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ExtraOperation <em>Extra Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Operation</em>'.
	 * @see arkuimodel.arkUIModel.ExtraOperation
	 * @generated
	 */
	EClass getExtraOperation();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SeqOp <em>Seq Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Op</em>'.
	 * @see arkuimodel.arkUIModel.SeqOp
	 * @generated
	 */
	EClass getSeqOp();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SeqOp#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.SeqOp#getType()
	 * @see #getSeqOp()
	 * @generated
	 */
	EAttribute getSeqOp_Type();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SeqOp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.SeqOp#getValue()
	 * @see #getSeqOp()
	 * @generated
	 */
	EAttribute getSeqOp_Value();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.UIStruct <em>UI Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Struct</em>'.
	 * @see arkuimodel.arkUIModel.UIStruct
	 * @generated
	 */
	EClass getUIStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.UIStruct#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see arkuimodel.arkUIModel.UIStruct#getPage()
	 * @see #getUIStruct()
	 * @generated
	 */
	EReference getUIStruct_Page();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.UIStruct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.UIStruct#getName()
	 * @see #getUIStruct()
	 * @generated
	 */
	EAttribute getUIStruct_Name();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.AnimationLibray <em>Animation Libray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation Libray</em>'.
	 * @see arkuimodel.arkUIModel.AnimationLibray
	 * @generated
	 */
	EClass getAnimationLibray();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.AnimationLibray#getAnimationclass <em>Animationclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animationclass</em>'.
	 * @see arkuimodel.arkUIModel.AnimationLibray#getAnimationclass()
	 * @see #getAnimationLibray()
	 * @generated
	 */
	EReference getAnimationLibray_Animationclass();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see arkuimodel.arkUIModel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see arkuimodel.arkUIModel.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see arkuimodel.arkUIModel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Entity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see arkuimodel.arkUIModel.Entity#getDescription()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see arkuimodel.arkUIModel.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.Entity#getSuperEntity <em>Super Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Entity</em>'.
	 * @see arkuimodel.arkUIModel.Entity#getSuperEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SuperEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.Entity#getEntityrefrence <em>Entityrefrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entityrefrence</em>'.
	 * @see arkuimodel.arkUIModel.Entity#getEntityrefrence()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entityrefrence();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Attribute</em>'.
	 * @see arkuimodel.arkUIModel.EntityAttribute
	 * @generated
	 */
	EClass getEntityAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.EntityAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.EntityAttribute#getType()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EReference getEntityAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.EntityAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.EntityAttribute#getName()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EAttribute getEntityAttribute_Name();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see arkuimodel.arkUIModel.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Array#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see arkuimodel.arkUIModel.Array#getLength()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Length();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.Array#getAtype <em>Atype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atype</em>'.
	 * @see arkuimodel.arkUIModel.Array#getAtype()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Atype();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.NavigationContainer <em>Navigation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Container</em>'.
	 * @see arkuimodel.arkUIModel.NavigationContainer
	 * @generated
	 */
	EClass getNavigationContainer();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.NavigationContainer#getToolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toolbar</em>'.
	 * @see arkuimodel.arkUIModel.NavigationContainer#getToolbar()
	 * @see #getNavigationContainer()
	 * @generated
	 */
	EReference getNavigationContainer_Toolbar();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.NavigationContainer#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu</em>'.
	 * @see arkuimodel.arkUIModel.NavigationContainer#getMenu()
	 * @see #getNavigationContainer()
	 * @generated
	 */
	EReference getNavigationContainer_Menu();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.NavigationContainer#getNavigationevent <em>Navigationevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigationevent</em>'.
	 * @see arkuimodel.arkUIModel.NavigationContainer#getNavigationevent()
	 * @see #getNavigationContainer()
	 * @generated
	 */
	EReference getNavigationContainer_Navigationevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.NavigationContainer#getNavigationstyle <em>Navigationstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigationstyle</em>'.
	 * @see arkuimodel.arkUIModel.NavigationContainer#getNavigationstyle()
	 * @see #getNavigationContainer()
	 * @generated
	 */
	EReference getNavigationContainer_Navigationstyle();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.NavigationContainer#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see arkuimodel.arkUIModel.NavigationContainer#getTitle()
	 * @see #getNavigationContainer()
	 * @generated
	 */
	EReference getNavigationContainer_Title();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.NavigationStyle <em>Navigation Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Style</em>'.
	 * @see arkuimodel.arkUIModel.NavigationStyle
	 * @generated
	 */
	EClass getNavigationStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.NavigationStyle#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see arkuimodel.arkUIModel.NavigationStyle#getTitle()
	 * @see #getNavigationStyle()
	 * @generated
	 */
	EAttribute getNavigationStyle_Title();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.NavigationStyle#getSubTitle <em>Sub Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Title</em>'.
	 * @see arkuimodel.arkUIModel.NavigationStyle#getSubTitle()
	 * @see #getNavigationStyle()
	 * @generated
	 */
	EAttribute getNavigationStyle_SubTitle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.NavigationStyle#isHideTitleBar <em>Hide Title Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Title Bar</em>'.
	 * @see arkuimodel.arkUIModel.NavigationStyle#isHideTitleBar()
	 * @see #getNavigationStyle()
	 * @generated
	 */
	EAttribute getNavigationStyle_HideTitleBar();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.NavigationStyle#isHideBackButton <em>Hide Back Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Back Button</em>'.
	 * @see arkuimodel.arkUIModel.NavigationStyle#isHideBackButton()
	 * @see #getNavigationStyle()
	 * @generated
	 */
	EAttribute getNavigationStyle_HideBackButton();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.NavigationStyle#getTitleMode <em>Title Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Mode</em>'.
	 * @see arkuimodel.arkUIModel.NavigationStyle#getTitleMode()
	 * @see #getNavigationStyle()
	 * @generated
	 */
	EAttribute getNavigationStyle_TitleMode();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.NavigationStyle#isHideToolBar <em>Hide Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Tool Bar</em>'.
	 * @see arkuimodel.arkUIModel.NavigationStyle#isHideToolBar()
	 * @see #getNavigationStyle()
	 * @generated
	 */
	EAttribute getNavigationStyle_HideToolBar();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.NavigationEvent <em>Navigation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Event</em>'.
	 * @see arkuimodel.arkUIModel.NavigationEvent
	 * @generated
	 */
	EClass getNavigationEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.NavigationEvent#getOnTitleModeChange <em>On Title Mode Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Title Mode Change</em>'.
	 * @see arkuimodel.arkUIModel.NavigationEvent#getOnTitleModeChange()
	 * @see #getNavigationEvent()
	 * @generated
	 */
	EAttribute getNavigationEvent_OnTitleModeChange();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ContainerItem <em>Container Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Item</em>'.
	 * @see arkuimodel.arkUIModel.ContainerItem
	 * @generated
	 */
	EClass getContainerItem();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ContainerItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.ContainerItem#getValue()
	 * @see #getContainerItem()
	 * @generated
	 */
	EAttribute getContainerItem_Value();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ContainerItem#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see arkuimodel.arkUIModel.ContainerItem#getIcon()
	 * @see #getContainerItem()
	 * @generated
	 */
	EAttribute getContainerItem_Icon();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ContainerItem#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see arkuimodel.arkUIModel.ContainerItem#getAction()
	 * @see #getContainerItem()
	 * @generated
	 */
	EAttribute getContainerItem_Action();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ContainerItems <em>Container Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Items</em>'.
	 * @see arkuimodel.arkUIModel.ContainerItems
	 * @generated
	 */
	EClass getContainerItems();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.ContainerItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see arkuimodel.arkUIModel.ContainerItems#getItems()
	 * @see #getContainerItems()
	 * @generated
	 */
	EReference getContainerItems_Items();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ContainerItems#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see arkuimodel.arkUIModel.ContainerItems#getLabel()
	 * @see #getContainerItems()
	 * @generated
	 */
	EAttribute getContainerItems_Label();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.StartOp <em>Start Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Op</em>'.
	 * @see arkuimodel.arkUIModel.StartOp
	 * @generated
	 */
	EClass getStartOp();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.EndOp <em>End Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Op</em>'.
	 * @see arkuimodel.arkUIModel.EndOp
	 * @generated
	 */
	EClass getEndOp();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.WorkFlow <em>Work Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Flow</em>'.
	 * @see arkuimodel.arkUIModel.WorkFlow
	 * @generated
	 */
	EClass getWorkFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.WorkFlow#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see arkuimodel.arkUIModel.WorkFlow#getFunction()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Function();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.WorkFlow#getFlowName <em>Flow Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Name</em>'.
	 * @see arkuimodel.arkUIModel.WorkFlow#getFlowName()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EAttribute getWorkFlow_FlowName();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.WorkFlow#getFlowline <em>Flowline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flowline</em>'.
	 * @see arkuimodel.arkUIModel.WorkFlow#getFlowline()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Flowline();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.WorkFlow#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.WorkFlow#getType()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EAttribute getWorkFlow_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.WorkFlow#getWorkparameter <em>Workparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workparameter</em>'.
	 * @see arkuimodel.arkUIModel.WorkFlow#getWorkparameter()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Workparameter();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.CheckEqual <em>Check Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Equal</em>'.
	 * @see arkuimodel.arkUIModel.CheckEqual
	 * @generated
	 */
	EClass getCheckEqual();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.FlowLine <em>Flow Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Line</em>'.
	 * @see arkuimodel.arkUIModel.FlowLine
	 * @generated
	 */
	EClass getFlowLine();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.FlowLine#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see arkuimodel.arkUIModel.FlowLine#getSource()
	 * @see #getFlowLine()
	 * @generated
	 */
	EReference getFlowLine_Source();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.FlowLine#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see arkuimodel.arkUIModel.FlowLine#getTarget()
	 * @see #getFlowLine()
	 * @generated
	 */
	EReference getFlowLine_Target();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.FlowLine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.FlowLine#getType()
	 * @see #getFlowLine()
	 * @generated
	 */
	EAttribute getFlowLine_Type();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.FlowLine#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.FlowLine#getValue()
	 * @see #getFlowLine()
	 * @generated
	 */
	EAttribute getFlowLine_Value();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see arkuimodel.arkUIModel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Expression#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see arkuimodel.arkUIModel.Expression#getParameter()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Expression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see arkuimodel.arkUIModel.Expression#getCondition()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Condition();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Value();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Expression#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Union</em>'.
	 * @see arkuimodel.arkUIModel.Expression#getUnion()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Union();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Expression#getExpressText <em>Express Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Express Text</em>'.
	 * @see arkuimodel.arkUIModel.Expression#getExpressText()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ExpressText();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see arkuimodel.arkUIModel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Function#getFunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Type</em>'.
	 * @see arkuimodel.arkUIModel.Function#getFunctionType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_FunctionType();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.Function#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see arkuimodel.arkUIModel.Function#getOperation()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Operation();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.Function#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow</em>'.
	 * @see arkuimodel.arkUIModel.Function#getWorkflow()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Workflow();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see arkuimodel.arkUIModel.ForEach
	 * @generated
	 */
	EClass getForEach();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ForEach#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see arkuimodel.arkUIModel.ForEach#getItem()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_Item();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ForEach#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see arkuimodel.arkUIModel.ForEach#getExpression()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_Expression();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ForEach#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see arkuimodel.arkUIModel.ForEach#getArray()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_Array();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ForEach#getArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Type</em>'.
	 * @see arkuimodel.arkUIModel.ForEach#getArrayType()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_ArrayType();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.IF <em>IF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IF</em>'.
	 * @see arkuimodel.arkUIModel.IF
	 * @generated
	 */
	EClass getIF();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.IF#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see arkuimodel.arkUIModel.IF#getExpression()
	 * @see #getIF()
	 * @generated
	 */
	EReference getIF_Expression();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.IF#getAutoExpression <em>Auto Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Expression</em>'.
	 * @see arkuimodel.arkUIModel.IF#getAutoExpression()
	 * @see #getIF()
	 * @generated
	 */
	EAttribute getIF_AutoExpression();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.CallFun <em>Call Fun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Fun</em>'.
	 * @see arkuimodel.arkUIModel.CallFun
	 * @generated
	 */
	EClass getCallFun();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CallFun#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.CallFun#getName()
	 * @see #getCallFun()
	 * @generated
	 */
	EAttribute getCallFun_Name();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SwiperWidget <em>Swiper Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swiper Widget</em>'.
	 * @see arkuimodel.arkUIModel.SwiperWidget
	 * @generated
	 */
	EClass getSwiperWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperWidget#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller</em>'.
	 * @see arkuimodel.arkUIModel.SwiperWidget#getController()
	 * @see #getSwiperWidget()
	 * @generated
	 */
	EAttribute getSwiperWidget_Controller();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.SwiperWidget#getSwiperevent <em>Swiperevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Swiperevent</em>'.
	 * @see arkuimodel.arkUIModel.SwiperWidget#getSwiperevent()
	 * @see #getSwiperWidget()
	 * @generated
	 */
	EReference getSwiperWidget_Swiperevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.SwiperWidget#getSwiperstyle <em>Swiperstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Swiperstyle</em>'.
	 * @see arkuimodel.arkUIModel.SwiperWidget#getSwiperstyle()
	 * @see #getSwiperWidget()
	 * @generated
	 */
	EReference getSwiperWidget_Swiperstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SwiperStyle <em>Swiper Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swiper Style</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle
	 * @generated
	 */
	EClass getSwiperStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getIndex()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_Index();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getAutoPlay <em>Auto Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Play</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getAutoPlay()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_AutoPlay();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getInterval()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_Interval();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getIndicator()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getLoop()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_Loop();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getDuration()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_Duration();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getVertical()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getItemSpace <em>Item Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Space</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getItemSpace()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_ItemSpace();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperStyle#getDisplayMode <em>Display Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Mode</em>'.
	 * @see arkuimodel.arkUIModel.SwiperStyle#getDisplayMode()
	 * @see #getSwiperStyle()
	 * @generated
	 */
	EAttribute getSwiperStyle_DisplayMode();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SwiperEvent <em>Swiper Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swiper Event</em>'.
	 * @see arkuimodel.arkUIModel.SwiperEvent
	 * @generated
	 */
	EClass getSwiperEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SwiperEvent#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see arkuimodel.arkUIModel.SwiperEvent#getOnChange()
	 * @see #getSwiperEvent()
	 * @generated
	 */
	EAttribute getSwiperEvent_OnChange();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.OperationLibray <em>Operation Libray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Libray</em>'.
	 * @see arkuimodel.arkUIModel.OperationLibray
	 * @generated
	 */
	EClass getOperationLibray();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.OperationLibray#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.OperationLibray#getName()
	 * @see #getOperationLibray()
	 * @generated
	 */
	EAttribute getOperationLibray_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.OperationLibray#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflows</em>'.
	 * @see arkuimodel.arkUIModel.OperationLibray#getWorkflows()
	 * @see #getOperationLibray()
	 * @generated
	 */
	EReference getOperationLibray_Workflows();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.OperationLibray#getProjectparameters <em>Projectparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projectparameters</em>'.
	 * @see arkuimodel.arkUIModel.OperationLibray#getProjectparameters()
	 * @see #getOperationLibray()
	 * @generated
	 */
	EReference getOperationLibray_Projectparameters();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.OperationLibray#getDomainmodel <em>Domainmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domainmodel</em>'.
	 * @see arkuimodel.arkUIModel.OperationLibray#getDomainmodel()
	 * @see #getOperationLibray()
	 * @generated
	 */
	EReference getOperationLibray_Domainmodel();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.PageRefrence <em>Page Refrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Refrence</em>'.
	 * @see arkuimodel.arkUIModel.PageRefrence
	 * @generated
	 */
	EClass getPageRefrence();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.PageRefrence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.PageRefrence#getName()
	 * @see #getPageRefrence()
	 * @generated
	 */
	EAttribute getPageRefrence_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.PageRefrence#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see arkuimodel.arkUIModel.PageRefrence#getParameter()
	 * @see #getPageRefrence()
	 * @generated
	 */
	EReference getPageRefrence_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.PageRefrence#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see arkuimodel.arkUIModel.PageRefrence#getIf()
	 * @see #getPageRefrence()
	 * @generated
	 */
	EReference getPageRefrence_If();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.PageRefrence#getForeach <em>Foreach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreach</em>'.
	 * @see arkuimodel.arkUIModel.PageRefrence#getForeach()
	 * @see #getPageRefrence()
	 * @generated
	 */
	EReference getPageRefrence_Foreach();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.PageRefrence#getPageevent <em>Pageevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pageevent</em>'.
	 * @see arkuimodel.arkUIModel.PageRefrence#getPageevent()
	 * @see #getPageRefrence()
	 * @generated
	 */
	EReference getPageRefrence_Pageevent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TabsContainer <em>Tabs Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabs Container</em>'.
	 * @see arkuimodel.arkUIModel.TabsContainer
	 * @generated
	 */
	EClass getTabsContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsContainer#getBarPosition <em>Bar Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bar Position</em>'.
	 * @see arkuimodel.arkUIModel.TabsContainer#getBarPosition()
	 * @see #getTabsContainer()
	 * @generated
	 */
	EAttribute getTabsContainer_BarPosition();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsContainer#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see arkuimodel.arkUIModel.TabsContainer#getIndex()
	 * @see #getTabsContainer()
	 * @generated
	 */
	EAttribute getTabsContainer_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.TabsContainer#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see arkuimodel.arkUIModel.TabsContainer#getTabs()
	 * @see #getTabsContainer()
	 * @generated
	 */
	EReference getTabsContainer_Tabs();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TabsContainer#getTabsevent <em>Tabsevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tabsevent</em>'.
	 * @see arkuimodel.arkUIModel.TabsContainer#getTabsevent()
	 * @see #getTabsContainer()
	 * @generated
	 */
	EReference getTabsContainer_Tabsevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TabsContainer#getTabsstyle <em>Tabsstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tabsstyle</em>'.
	 * @see arkuimodel.arkUIModel.TabsContainer#getTabsstyle()
	 * @see #getTabsContainer()
	 * @generated
	 */
	EReference getTabsContainer_Tabsstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TabContent <em>Tab Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Content</em>'.
	 * @see arkuimodel.arkUIModel.TabContent
	 * @generated
	 */
	EClass getTabContent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TabContent#getTabBar <em>Tab Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tab Bar</em>'.
	 * @see arkuimodel.arkUIModel.TabContent#getTabBar()
	 * @see #getTabContent()
	 * @generated
	 */
	EReference getTabContent_TabBar();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TabContent#getTabcontentstyle <em>Tabcontentstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tabcontentstyle</em>'.
	 * @see arkuimodel.arkUIModel.TabContent#getTabcontentstyle()
	 * @see #getTabContent()
	 * @generated
	 */
	EReference getTabContent_Tabcontentstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TabsStyle <em>Tabs Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabs Style</em>'.
	 * @see arkuimodel.arkUIModel.TabsStyle
	 * @generated
	 */
	EClass getTabsStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsStyle#getScrollable <em>Scrollable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrollable</em>'.
	 * @see arkuimodel.arkUIModel.TabsStyle#getScrollable()
	 * @see #getTabsStyle()
	 * @generated
	 */
	EAttribute getTabsStyle_Scrollable();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsStyle#getBarMode <em>Bar Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bar Mode</em>'.
	 * @see arkuimodel.arkUIModel.TabsStyle#getBarMode()
	 * @see #getTabsStyle()
	 * @generated
	 */
	EAttribute getTabsStyle_BarMode();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsStyle#getVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see arkuimodel.arkUIModel.TabsStyle#getVertical()
	 * @see #getTabsStyle()
	 * @generated
	 */
	EAttribute getTabsStyle_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsStyle#getBarWidth <em>Bar Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bar Width</em>'.
	 * @see arkuimodel.arkUIModel.TabsStyle#getBarWidth()
	 * @see #getTabsStyle()
	 * @generated
	 */
	EAttribute getTabsStyle_BarWidth();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsStyle#getBarHeight <em>Bar Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bar Height</em>'.
	 * @see arkuimodel.arkUIModel.TabsStyle#getBarHeight()
	 * @see #getTabsStyle()
	 * @generated
	 */
	EAttribute getTabsStyle_BarHeight();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsStyle#getAnimationDuration <em>Animation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animation Duration</em>'.
	 * @see arkuimodel.arkUIModel.TabsStyle#getAnimationDuration()
	 * @see #getTabsStyle()
	 * @generated
	 */
	EAttribute getTabsStyle_AnimationDuration();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TabItem <em>Tab Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Item</em>'.
	 * @see arkuimodel.arkUIModel.TabItem
	 * @generated
	 */
	EClass getTabItem();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see arkuimodel.arkUIModel.TabItem#getTitle()
	 * @see #getTabItem()
	 * @generated
	 */
	EAttribute getTabItem_Title();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabItem#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see arkuimodel.arkUIModel.TabItem#getImage()
	 * @see #getTabItem()
	 * @generated
	 */
	EAttribute getTabItem_Image();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabItem#getSelectedImage <em>Selected Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Image</em>'.
	 * @see arkuimodel.arkUIModel.TabItem#getSelectedImage()
	 * @see #getTabItem()
	 * @generated
	 */
	EAttribute getTabItem_SelectedImage();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TabsEvent <em>Tabs Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabs Event</em>'.
	 * @see arkuimodel.arkUIModel.TabsEvent
	 * @generated
	 */
	EClass getTabsEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TabsEvent#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see arkuimodel.arkUIModel.TabsEvent#getOnChange()
	 * @see #getTabsEvent()
	 * @generated
	 */
	EAttribute getTabsEvent_OnChange();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.StackContainer <em>Stack Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Container</em>'.
	 * @see arkuimodel.arkUIModel.StackContainer
	 * @generated
	 */
	EClass getStackContainer();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.StackContainer#getStackevent <em>Stackevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stackevent</em>'.
	 * @see arkuimodel.arkUIModel.StackContainer#getStackevent()
	 * @see #getStackContainer()
	 * @generated
	 */
	EReference getStackContainer_Stackevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.StackContainer#getStackstyle <em>Stackstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stackstyle</em>'.
	 * @see arkuimodel.arkUIModel.StackContainer#getStackstyle()
	 * @see #getStackContainer()
	 * @generated
	 */
	EReference getStackContainer_Stackstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.StackEvent <em>Stack Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Event</em>'.
	 * @see arkuimodel.arkUIModel.StackEvent
	 * @generated
	 */
	EClass getStackEvent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.StackStyle <em>Stack Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Style</em>'.
	 * @see arkuimodel.arkUIModel.StackStyle
	 * @generated
	 */
	EClass getStackStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.StackStyle#getAlignContent <em>Align Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align Content</em>'.
	 * @see arkuimodel.arkUIModel.StackStyle#getAlignContent()
	 * @see #getStackStyle()
	 * @generated
	 */
	EAttribute getStackStyle_AlignContent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ScrollContainer <em>Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Container</em>'.
	 * @see arkuimodel.arkUIModel.ScrollContainer
	 * @generated
	 */
	EClass getScrollContainer();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ScrollContainer#getScrollevent <em>Scrollevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scrollevent</em>'.
	 * @see arkuimodel.arkUIModel.ScrollContainer#getScrollevent()
	 * @see #getScrollContainer()
	 * @generated
	 */
	EReference getScrollContainer_Scrollevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ScrollContainer#getScrollstyle <em>Scrollstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scrollstyle</em>'.
	 * @see arkuimodel.arkUIModel.ScrollContainer#getScrollstyle()
	 * @see #getScrollContainer()
	 * @generated
	 */
	EReference getScrollContainer_Scrollstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ScrollEvent <em>Scroll Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Event</em>'.
	 * @see arkuimodel.arkUIModel.ScrollEvent
	 * @generated
	 */
	EClass getScrollEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ScrollEvent#getOnScroll <em>On Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Scroll</em>'.
	 * @see arkuimodel.arkUIModel.ScrollEvent#getOnScroll()
	 * @see #getScrollEvent()
	 * @generated
	 */
	EAttribute getScrollEvent_OnScroll();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ScrollEvent#getOnScrollEdge <em>On Scroll Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Scroll Edge</em>'.
	 * @see arkuimodel.arkUIModel.ScrollEvent#getOnScrollEdge()
	 * @see #getScrollEvent()
	 * @generated
	 */
	EAttribute getScrollEvent_OnScrollEdge();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ScrollEvent#getOnScrollEnd <em>On Scroll End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Scroll End</em>'.
	 * @see arkuimodel.arkUIModel.ScrollEvent#getOnScrollEnd()
	 * @see #getScrollEvent()
	 * @generated
	 */
	EAttribute getScrollEvent_OnScrollEnd();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ScrollStyle <em>Scroll Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Style</em>'.
	 * @see arkuimodel.arkUIModel.ScrollStyle
	 * @generated
	 */
	EClass getScrollStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ScrollStyle#getScrollable <em>Scrollable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrollable</em>'.
	 * @see arkuimodel.arkUIModel.ScrollStyle#getScrollable()
	 * @see #getScrollStyle()
	 * @generated
	 */
	EAttribute getScrollStyle_Scrollable();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ScrollStyle#getScrollBar <em>Scroll Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scroll Bar</em>'.
	 * @see arkuimodel.arkUIModel.ScrollStyle#getScrollBar()
	 * @see #getScrollStyle()
	 * @generated
	 */
	EAttribute getScrollStyle_ScrollBar();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ScrollStyle#getScrollBarColor <em>Scroll Bar Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scroll Bar Color</em>'.
	 * @see arkuimodel.arkUIModel.ScrollStyle#getScrollBarColor()
	 * @see #getScrollStyle()
	 * @generated
	 */
	EAttribute getScrollStyle_ScrollBarColor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ScrollStyle#getScrollBarWidth <em>Scroll Bar Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scroll Bar Width</em>'.
	 * @see arkuimodel.arkUIModel.ScrollStyle#getScrollBarWidth()
	 * @see #getScrollStyle()
	 * @generated
	 */
	EAttribute getScrollStyle_ScrollBarWidth();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ScrollStyle#getEdgeEffect <em>Edge Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Effect</em>'.
	 * @see arkuimodel.arkUIModel.ScrollStyle#getEdgeEffect()
	 * @see #getScrollStyle()
	 * @generated
	 */
	EAttribute getScrollStyle_EdgeEffect();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.Scroller <em>Scroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroller</em>'.
	 * @see arkuimodel.arkUIModel.Scroller
	 * @generated
	 */
	EClass getScroller();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getAssginScroll <em>Assgin Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assgin Scroll</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getAssginScroll()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_AssginScroll();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getScrollType <em>Scroll Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scroll Type</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getScrollType()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_ScrollType();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getXOffset <em>XOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XOffset</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getXOffset()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_XOffset();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getYOffset <em>YOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YOffset</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getYOffset()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_YOffset();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getDuration()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_Duration();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getCurve()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_Curve();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getEdge()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_Edge();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getNext()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_Next();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getDirection()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_Direction();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.Scroller#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see arkuimodel.arkUIModel.Scroller#getIndex()
	 * @see #getScroller()
	 * @generated
	 */
	EAttribute getScroller_Index();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ToggleWidget <em>Toggle Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Widget</em>'.
	 * @see arkuimodel.arkUIModel.ToggleWidget
	 * @generated
	 */
	EClass getToggleWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ToggleWidget#getIsOn <em>Is On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is On</em>'.
	 * @see arkuimodel.arkUIModel.ToggleWidget#getIsOn()
	 * @see #getToggleWidget()
	 * @generated
	 */
	EAttribute getToggleWidget_IsOn();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ToggleWidget#getToggleType <em>Toggle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggle Type</em>'.
	 * @see arkuimodel.arkUIModel.ToggleWidget#getToggleType()
	 * @see #getToggleWidget()
	 * @generated
	 */
	EAttribute getToggleWidget_ToggleType();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ToggleWidget#getToggleevent <em>Toggleevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toggleevent</em>'.
	 * @see arkuimodel.arkUIModel.ToggleWidget#getToggleevent()
	 * @see #getToggleWidget()
	 * @generated
	 */
	EReference getToggleWidget_Toggleevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ToggleWidget#getTogglestyle <em>Togglestyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Togglestyle</em>'.
	 * @see arkuimodel.arkUIModel.ToggleWidget#getTogglestyle()
	 * @see #getToggleWidget()
	 * @generated
	 */
	EReference getToggleWidget_Togglestyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ToggleEvent <em>Toggle Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Event</em>'.
	 * @see arkuimodel.arkUIModel.ToggleEvent
	 * @generated
	 */
	EClass getToggleEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ToggleEvent#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see arkuimodel.arkUIModel.ToggleEvent#getOnChange()
	 * @see #getToggleEvent()
	 * @generated
	 */
	EAttribute getToggleEvent_OnChange();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ToggleStyle <em>Toggle Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Style</em>'.
	 * @see arkuimodel.arkUIModel.ToggleStyle
	 * @generated
	 */
	EClass getToggleStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ToggleStyle#getSelectedColor <em>Selected Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Color</em>'.
	 * @see arkuimodel.arkUIModel.ToggleStyle#getSelectedColor()
	 * @see #getToggleStyle()
	 * @generated
	 */
	EAttribute getToggleStyle_SelectedColor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ToggleStyle#getSwitchPointColor <em>Switch Point Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch Point Color</em>'.
	 * @see arkuimodel.arkUIModel.ToggleStyle#getSwitchPointColor()
	 * @see #getToggleStyle()
	 * @generated
	 */
	EAttribute getToggleStyle_SwitchPointColor();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TimePickerWidget <em>Time Picker Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Picker Widget</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerWidget
	 * @generated
	 */
	EClass getTimePickerWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TimePickerWidget#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerWidget#getSelected()
	 * @see #getTimePickerWidget()
	 * @generated
	 */
	EAttribute getTimePickerWidget_Selected();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TimePickerWidget#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerWidget#getStart()
	 * @see #getTimePickerWidget()
	 * @generated
	 */
	EAttribute getTimePickerWidget_Start();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TimePickerWidget#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerWidget#getEnd()
	 * @see #getTimePickerWidget()
	 * @generated
	 */
	EAttribute getTimePickerWidget_End();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TimePickerWidget#getTimepickerevent <em>Timepickerevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timepickerevent</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerWidget#getTimepickerevent()
	 * @see #getTimePickerWidget()
	 * @generated
	 */
	EReference getTimePickerWidget_Timepickerevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TimePickerWidget#getTimepickerstyle <em>Timepickerstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timepickerstyle</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerWidget#getTimepickerstyle()
	 * @see #getTimePickerWidget()
	 * @generated
	 */
	EReference getTimePickerWidget_Timepickerstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TimePickerEvent <em>Time Picker Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Picker Event</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerEvent
	 * @generated
	 */
	EClass getTimePickerEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TimePickerEvent#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerEvent#getOnChange()
	 * @see #getTimePickerEvent()
	 * @generated
	 */
	EAttribute getTimePickerEvent_OnChange();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TimePickerStyle <em>Time Picker Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Picker Style</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerStyle
	 * @generated
	 */
	EClass getTimePickerStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TimePickerStyle#getUseMilitaryTime <em>Use Military Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Military Time</em>'.
	 * @see arkuimodel.arkUIModel.TimePickerStyle#getUseMilitaryTime()
	 * @see #getTimePickerStyle()
	 * @generated
	 */
	EAttribute getTimePickerStyle_UseMilitaryTime();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.DatePickerWidget <em>Date Picker Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Picker Widget</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerWidget
	 * @generated
	 */
	EClass getDatePickerWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DatePickerWidget#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerWidget#getSelected()
	 * @see #getDatePickerWidget()
	 * @generated
	 */
	EAttribute getDatePickerWidget_Selected();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DatePickerWidget#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerWidget#getStart()
	 * @see #getDatePickerWidget()
	 * @generated
	 */
	EAttribute getDatePickerWidget_Start();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DatePickerWidget#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerWidget#getEnd()
	 * @see #getDatePickerWidget()
	 * @generated
	 */
	EAttribute getDatePickerWidget_End();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.DatePickerWidget#getDatepickerevent <em>Datepickerevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datepickerevent</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerWidget#getDatepickerevent()
	 * @see #getDatePickerWidget()
	 * @generated
	 */
	EReference getDatePickerWidget_Datepickerevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.DatePickerWidget#getDatepickerstyle <em>Datepickerstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datepickerstyle</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerWidget#getDatepickerstyle()
	 * @see #getDatePickerWidget()
	 * @generated
	 */
	EReference getDatePickerWidget_Datepickerstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.DatePickerEvent <em>Date Picker Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Picker Event</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerEvent
	 * @generated
	 */
	EClass getDatePickerEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DatePickerEvent#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerEvent#getOnChange()
	 * @see #getDatePickerEvent()
	 * @generated
	 */
	EAttribute getDatePickerEvent_OnChange();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.DatePickerStyle <em>Date Picker Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Picker Style</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerStyle
	 * @generated
	 */
	EClass getDatePickerStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DatePickerStyle#getLunar <em>Lunar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lunar</em>'.
	 * @see arkuimodel.arkUIModel.DatePickerStyle#getLunar()
	 * @see #getDatePickerStyle()
	 * @generated
	 */
	EAttribute getDatePickerStyle_Lunar();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextPickerWidget <em>Text Picker Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Picker Widget</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerWidget
	 * @generated
	 */
	EClass getTextPickerWidget();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TextPickerWidget#getTextpickerevent <em>Textpickerevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textpickerevent</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerWidget#getTextpickerevent()
	 * @see #getTextPickerWidget()
	 * @generated
	 */
	EReference getTextPickerWidget_Textpickerevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.TextPickerWidget#getTextpickerstyle <em>Textpickerstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textpickerstyle</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerWidget#getTextpickerstyle()
	 * @see #getTextPickerWidget()
	 * @generated
	 */
	EReference getTextPickerWidget_Textpickerstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextPickerEvent <em>Text Picker Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Picker Event</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerEvent
	 * @generated
	 */
	EClass getTextPickerEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextPickerEvent#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerEvent#getOnChange()
	 * @see #getTextPickerEvent()
	 * @generated
	 */
	EAttribute getTextPickerEvent_OnChange();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TextPickerStyle <em>Text Picker Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Picker Style</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerStyle
	 * @generated
	 */
	EClass getTextPickerStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextPickerStyle#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerStyle#getRange()
	 * @see #getTextPickerStyle()
	 * @generated
	 */
	EAttribute getTextPickerStyle_Range();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextPickerStyle#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerStyle#getSelected()
	 * @see #getTextPickerStyle()
	 * @generated
	 */
	EAttribute getTextPickerStyle_Selected();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextPickerStyle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerStyle#getValue()
	 * @see #getTextPickerStyle()
	 * @generated
	 */
	EAttribute getTextPickerStyle_Value();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.TextPickerStyle#getDefaultPickerItemHeight <em>Default Picker Item Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Picker Item Height</em>'.
	 * @see arkuimodel.arkUIModel.TextPickerStyle#getDefaultPickerItemHeight()
	 * @see #getTextPickerStyle()
	 * @generated
	 */
	EAttribute getTextPickerStyle_DefaultPickerItemHeight();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.DividerWidget <em>Divider Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divider Widget</em>'.
	 * @see arkuimodel.arkUIModel.DividerWidget
	 * @generated
	 */
	EClass getDividerWidget();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.DividerWidget#getDividerstyle <em>Dividerstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dividerstyle</em>'.
	 * @see arkuimodel.arkUIModel.DividerWidget#getDividerstyle()
	 * @see #getDividerWidget()
	 * @generated
	 */
	EReference getDividerWidget_Dividerstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.DividerStyle <em>Divider Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divider Style</em>'.
	 * @see arkuimodel.arkUIModel.DividerStyle
	 * @generated
	 */
	EClass getDividerStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DividerStyle#getVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see arkuimodel.arkUIModel.DividerStyle#getVertical()
	 * @see #getDividerStyle()
	 * @generated
	 */
	EAttribute getDividerStyle_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DividerStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see arkuimodel.arkUIModel.DividerStyle#getColor()
	 * @see #getDividerStyle()
	 * @generated
	 */
	EAttribute getDividerStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DividerStyle#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see arkuimodel.arkUIModel.DividerStyle#getStrokeWidth()
	 * @see #getDividerStyle()
	 * @generated
	 */
	EAttribute getDividerStyle_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DividerStyle#getLineCap <em>Line Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Cap</em>'.
	 * @see arkuimodel.arkUIModel.DividerStyle#getLineCap()
	 * @see #getDividerStyle()
	 * @generated
	 */
	EAttribute getDividerStyle_LineCap();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.CustomDialogContainer <em>Custom Dialog Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Dialog Container</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogContainer
	 * @generated
	 */
	EClass getCustomDialogContainer();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.CustomDialogContainer#getCustomdialogstyle <em>Customdialogstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customdialogstyle</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogContainer#getCustomdialogstyle()
	 * @see #getCustomDialogContainer()
	 * @generated
	 */
	EReference getCustomDialogContainer_Customdialogstyle();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.CustomDialogContainer#getCustomdialogevent <em>Customdialogevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customdialogevent</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogContainer#getCustomdialogevent()
	 * @see #getCustomDialogContainer()
	 * @generated
	 */
	EReference getCustomDialogContainer_Customdialogevent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.CustomDialogStyle <em>Custom Dialog Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Dialog Style</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogStyle
	 * @generated
	 */
	EClass getCustomDialogStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CustomDialogStyle#getAutoCancel <em>Auto Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Cancel</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogStyle#getAutoCancel()
	 * @see #getCustomDialogStyle()
	 * @generated
	 */
	EAttribute getCustomDialogStyle_AutoCancel();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CustomDialogStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogStyle#getAlignment()
	 * @see #getCustomDialogStyle()
	 * @generated
	 */
	EAttribute getCustomDialogStyle_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CustomDialogStyle#getOffsetx <em>Offsetx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offsetx</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogStyle#getOffsetx()
	 * @see #getCustomDialogStyle()
	 * @generated
	 */
	EAttribute getCustomDialogStyle_Offsetx();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CustomDialogStyle#getOffsety <em>Offsety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offsety</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogStyle#getOffsety()
	 * @see #getCustomDialogStyle()
	 * @generated
	 */
	EAttribute getCustomDialogStyle_Offsety();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CustomDialogStyle#getCustomStyle <em>Custom Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Style</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogStyle#getCustomStyle()
	 * @see #getCustomDialogStyle()
	 * @generated
	 */
	EAttribute getCustomDialogStyle_CustomStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CustomDialogStyle#getGridCount <em>Grid Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Count</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogStyle#getGridCount()
	 * @see #getCustomDialogStyle()
	 * @generated
	 */
	EAttribute getCustomDialogStyle_GridCount();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.CustomDialogEvent <em>Custom Dialog Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Dialog Event</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogEvent
	 * @generated
	 */
	EClass getCustomDialogEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CustomDialogEvent#getCancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogEvent#getCancel()
	 * @see #getCustomDialogEvent()
	 * @generated
	 */
	EAttribute getCustomDialogEvent_Cancel();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CustomDialogEvent#getConfirm <em>Confirm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm</em>'.
	 * @see arkuimodel.arkUIModel.CustomDialogEvent#getConfirm()
	 * @see #getCustomDialogEvent()
	 * @generated
	 */
	EAttribute getCustomDialogEvent_Confirm();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.OpenDialog <em>Open Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Dialog</em>'.
	 * @see arkuimodel.arkUIModel.OpenDialog
	 * @generated
	 */
	EClass getOpenDialog();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.OpenDialog#getAssignDialog <em>Assign Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign Dialog</em>'.
	 * @see arkuimodel.arkUIModel.OpenDialog#getAssignDialog()
	 * @see #getOpenDialog()
	 * @generated
	 */
	EAttribute getOpenDialog_AssignDialog();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.CloseDialog <em>Close Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Dialog</em>'.
	 * @see arkuimodel.arkUIModel.CloseDialog
	 * @generated
	 */
	EClass getCloseDialog();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.CloseDialog#getAssignDialog <em>Assign Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign Dialog</em>'.
	 * @see arkuimodel.arkUIModel.CloseDialog#getAssignDialog()
	 * @see #getCloseDialog()
	 * @generated
	 */
	EAttribute getCloseDialog_AssignDialog();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.DataPreferences <em>Data Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Preferences</em>'.
	 * @see arkuimodel.arkUIModel.DataPreferences
	 * @generated
	 */
	EClass getDataPreferences();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DataPreferences#getPreferencesType <em>Preferences Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferences Type</em>'.
	 * @see arkuimodel.arkUIModel.DataPreferences#getPreferencesType()
	 * @see #getDataPreferences()
	 * @generated
	 */
	EAttribute getDataPreferences_PreferencesType();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DataPreferences#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferences</em>'.
	 * @see arkuimodel.arkUIModel.DataPreferences#getPreferences()
	 * @see #getDataPreferences()
	 * @generated
	 */
	EAttribute getDataPreferences_Preferences();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TerminateSelf <em>Terminate Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate Self</em>'.
	 * @see arkuimodel.arkUIModel.TerminateSelf
	 * @generated
	 */
	EClass getTerminateSelf();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SetTimeOut <em>Set Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Time Out</em>'.
	 * @see arkuimodel.arkUIModel.SetTimeOut
	 * @generated
	 */
	EClass getSetTimeOut();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SetTimeOut#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler</em>'.
	 * @see arkuimodel.arkUIModel.SetTimeOut#getHandler()
	 * @see #getSetTimeOut()
	 * @generated
	 */
	EAttribute getSetTimeOut_Handler();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SetTimeOut#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see arkuimodel.arkUIModel.SetTimeOut#getDelay()
	 * @see #getSetTimeOut()
	 * @generated
	 */
	EAttribute getSetTimeOut_Delay();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ClearTimeOut <em>Clear Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Time Out</em>'.
	 * @see arkuimodel.arkUIModel.ClearTimeOut
	 * @generated
	 */
	EClass getClearTimeOut();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ClearTimeOut#getTimeoutID <em>Timeout ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout ID</em>'.
	 * @see arkuimodel.arkUIModel.ClearTimeOut#getTimeoutID()
	 * @see #getClearTimeOut()
	 * @generated
	 */
	EAttribute getClearTimeOut_TimeoutID();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ShowToastOptions <em>Show Toast Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Toast Options</em>'.
	 * @see arkuimodel.arkUIModel.ShowToastOptions
	 * @generated
	 */
	EClass getShowToastOptions();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ShowToastOptions#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see arkuimodel.arkUIModel.ShowToastOptions#getMessage()
	 * @see #getShowToastOptions()
	 * @generated
	 */
	EAttribute getShowToastOptions_Message();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ShowToastOptions#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see arkuimodel.arkUIModel.ShowToastOptions#getDuration()
	 * @see #getShowToastOptions()
	 * @generated
	 */
	EAttribute getShowToastOptions_Duration();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ShowToastOptions#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see arkuimodel.arkUIModel.ShowToastOptions#getBottom()
	 * @see #getShowToastOptions()
	 * @generated
	 */
	EAttribute getShowToastOptions_Bottom();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see arkuimodel.arkUIModel.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DomainModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.DomainModel#getName()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.DomainModel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see arkuimodel.arkUIModel.DomainModel#getLabel()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.DomainModel#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see arkuimodel.arkUIModel.DomainModel#getEntity()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Entity();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.EntityRefrence <em>Entity Refrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Refrence</em>'.
	 * @see arkuimodel.arkUIModel.EntityRefrence
	 * @generated
	 */
	EClass getEntityRefrence();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.EntityRefrence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arkuimodel.arkUIModel.EntityRefrence#getName()
	 * @see #getEntityRefrence()
	 * @generated
	 */
	EAttribute getEntityRefrence_Name();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.EntityRefrence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arkuimodel.arkUIModel.EntityRefrence#getType()
	 * @see #getEntityRefrence()
	 * @generated
	 */
	EAttribute getEntityRefrence_Type();

	/**
	 * Returns the meta object for the reference '{@link arkuimodel.arkUIModel.EntityRefrence#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see arkuimodel.arkUIModel.EntityRefrence#getEntity()
	 * @see #getEntityRefrence()
	 * @generated
	 */
	EReference getEntityRefrence_Entity();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GridContainer <em>Grid Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Container</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer
	 * @generated
	 */
	EClass getGridContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridContainer#getColumnsTemplate <em>Columns Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns Template</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer#getColumnsTemplate()
	 * @see #getGridContainer()
	 * @generated
	 */
	EAttribute getGridContainer_ColumnsTemplate();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridContainer#getRowsTemplate <em>Rows Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows Template</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer#getRowsTemplate()
	 * @see #getGridContainer()
	 * @generated
	 */
	EAttribute getGridContainer_RowsTemplate();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridContainer#getColumnsGap <em>Columns Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns Gap</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer#getColumnsGap()
	 * @see #getGridContainer()
	 * @generated
	 */
	EAttribute getGridContainer_ColumnsGap();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridContainer#getRowsGap <em>Rows Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows Gap</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer#getRowsGap()
	 * @see #getGridContainer()
	 * @generated
	 */
	EAttribute getGridContainer_RowsGap();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GridContainer#getGridevent <em>Gridevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gridevent</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer#getGridevent()
	 * @see #getGridContainer()
	 * @generated
	 */
	EReference getGridContainer_Gridevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GridContainer#getGridstyle <em>Gridstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gridstyle</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer#getGridstyle()
	 * @see #getGridContainer()
	 * @generated
	 */
	EReference getGridContainer_Gridstyle();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.GridContainer#getGriditemcontainer <em>Griditemcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Griditemcontainer</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer#getGriditemcontainer()
	 * @see #getGridContainer()
	 * @generated
	 */
	EReference getGridContainer_Griditemcontainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridContainer#getCachedCount <em>Cached Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached Count</em>'.
	 * @see arkuimodel.arkUIModel.GridContainer#getCachedCount()
	 * @see #getGridContainer()
	 * @generated
	 */
	EAttribute getGridContainer_CachedCount();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GridEvent <em>Grid Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Event</em>'.
	 * @see arkuimodel.arkUIModel.GridEvent
	 * @generated
	 */
	EClass getGridEvent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GridStyle <em>Grid Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Style</em>'.
	 * @see arkuimodel.arkUIModel.GridStyle
	 * @generated
	 */
	EClass getGridStyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ChangeIndex <em>Change Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Index</em>'.
	 * @see arkuimodel.arkUIModel.ChangeIndex
	 * @generated
	 */
	EClass getChangeIndex();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ChangeIndex#getTabsID <em>Tabs ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabs ID</em>'.
	 * @see arkuimodel.arkUIModel.ChangeIndex#getTabsID()
	 * @see #getChangeIndex()
	 * @generated
	 */
	EAttribute getChangeIndex_TabsID();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ChangeIndex#getTabID <em>Tab ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab ID</em>'.
	 * @see arkuimodel.arkUIModel.ChangeIndex#getTabID()
	 * @see #getChangeIndex()
	 * @generated
	 */
	EAttribute getChangeIndex_TabID();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.TabContentStyle <em>Tab Content Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Content Style</em>'.
	 * @see arkuimodel.arkUIModel.TabContentStyle
	 * @generated
	 */
	EClass getTabContentStyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GridItemContainer <em>Grid Item Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Item Container</em>'.
	 * @see arkuimodel.arkUIModel.GridItemContainer
	 * @generated
	 */
	EClass getGridItemContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridItemContainer#getRowStart <em>Row Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Start</em>'.
	 * @see arkuimodel.arkUIModel.GridItemContainer#getRowStart()
	 * @see #getGridItemContainer()
	 * @generated
	 */
	EAttribute getGridItemContainer_RowStart();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridItemContainer#getRowEnd <em>Row End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row End</em>'.
	 * @see arkuimodel.arkUIModel.GridItemContainer#getRowEnd()
	 * @see #getGridItemContainer()
	 * @generated
	 */
	EAttribute getGridItemContainer_RowEnd();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridItemContainer#getColumnStart <em>Column Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Start</em>'.
	 * @see arkuimodel.arkUIModel.GridItemContainer#getColumnStart()
	 * @see #getGridItemContainer()
	 * @generated
	 */
	EAttribute getGridItemContainer_ColumnStart();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridItemContainer#getColumnEnd <em>Column End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column End</em>'.
	 * @see arkuimodel.arkUIModel.GridItemContainer#getColumnEnd()
	 * @see #getGridItemContainer()
	 * @generated
	 */
	EAttribute getGridItemContainer_ColumnEnd();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.GridItemContainer#getForceRebuild <em>Force Rebuild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Rebuild</em>'.
	 * @see arkuimodel.arkUIModel.GridItemContainer#getForceRebuild()
	 * @see #getGridItemContainer()
	 * @generated
	 */
	EAttribute getGridItemContainer_ForceRebuild();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GridItemContainer#getGriditemstyle <em>Griditemstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Griditemstyle</em>'.
	 * @see arkuimodel.arkUIModel.GridItemContainer#getGriditemstyle()
	 * @see #getGridItemContainer()
	 * @generated
	 */
	EReference getGridItemContainer_Griditemstyle();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.GridItemContainer#getGriditemevent <em>Griditemevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Griditemevent</em>'.
	 * @see arkuimodel.arkUIModel.GridItemContainer#getGriditemevent()
	 * @see #getGridItemContainer()
	 * @generated
	 */
	EReference getGridItemContainer_Griditemevent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SearchWidget <em>Search Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Widget</em>'.
	 * @see arkuimodel.arkUIModel.SearchWidget
	 * @generated
	 */
	EClass getSearchWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchWidget#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see arkuimodel.arkUIModel.SearchWidget#getHint()
	 * @see #getSearchWidget()
	 * @generated
	 */
	EAttribute getSearchWidget_Hint();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchWidget#getSearchbutton <em>Searchbutton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Searchbutton</em>'.
	 * @see arkuimodel.arkUIModel.SearchWidget#getSearchbutton()
	 * @see #getSearchWidget()
	 * @generated
	 */
	EAttribute getSearchWidget_Searchbutton();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchWidget#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see arkuimodel.arkUIModel.SearchWidget#getIcon()
	 * @see #getSearchWidget()
	 * @generated
	 */
	EAttribute getSearchWidget_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.SearchWidget#getSearchevent <em>Searchevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Searchevent</em>'.
	 * @see arkuimodel.arkUIModel.SearchWidget#getSearchevent()
	 * @see #getSearchWidget()
	 * @generated
	 */
	EReference getSearchWidget_Searchevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.SearchWidget#getSearchstyle <em>Searchstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Searchstyle</em>'.
	 * @see arkuimodel.arkUIModel.SearchWidget#getSearchstyle()
	 * @see #getSearchWidget()
	 * @generated
	 */
	EReference getSearchWidget_Searchstyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchWidget#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.SearchWidget#getValue()
	 * @see #getSearchWidget()
	 * @generated
	 */
	EAttribute getSearchWidget_Value();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchWidget#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see arkuimodel.arkUIModel.SearchWidget#getPlaceholder()
	 * @see #getSearchWidget()
	 * @generated
	 */
	EAttribute getSearchWidget_Placeholder();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SearchEvent <em>Search Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Event</em>'.
	 * @see arkuimodel.arkUIModel.SearchEvent
	 * @generated
	 */
	EClass getSearchEvent();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchEvent#getOnSearch <em>On Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Search</em>'.
	 * @see arkuimodel.arkUIModel.SearchEvent#getOnSearch()
	 * @see #getSearchEvent()
	 * @generated
	 */
	EAttribute getSearchEvent_OnSearch();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchEvent#getOnChange <em>On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Change</em>'.
	 * @see arkuimodel.arkUIModel.SearchEvent#getOnChange()
	 * @see #getSearchEvent()
	 * @generated
	 */
	EAttribute getSearchEvent_OnChange();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchEvent#getOnTranslate <em>On Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Translate</em>'.
	 * @see arkuimodel.arkUIModel.SearchEvent#getOnTranslate()
	 * @see #getSearchEvent()
	 * @generated
	 */
	EAttribute getSearchEvent_OnTranslate();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchEvent#getOnShare <em>On Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Share</em>'.
	 * @see arkuimodel.arkUIModel.SearchEvent#getOnShare()
	 * @see #getSearchEvent()
	 * @generated
	 */
	EAttribute getSearchEvent_OnShare();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchEvent#getOnSubmit <em>On Submit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Submit</em>'.
	 * @see arkuimodel.arkUIModel.SearchEvent#getOnSubmit()
	 * @see #getSearchEvent()
	 * @generated
	 */
	EAttribute getSearchEvent_OnSubmit();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.SearchStyle <em>Search Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Style</em>'.
	 * @see arkuimodel.arkUIModel.SearchStyle
	 * @generated
	 */
	EClass getSearchStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see arkuimodel.arkUIModel.SearchStyle#getColor()
	 * @see #getSearchStyle()
	 * @generated
	 */
	EAttribute getSearchStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchStyle#getPlaceholdercolor <em>Placeholdercolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholdercolor</em>'.
	 * @see arkuimodel.arkUIModel.SearchStyle#getPlaceholdercolor()
	 * @see #getSearchStyle()
	 * @generated
	 */
	EAttribute getSearchStyle_Placeholdercolor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchStyle#getCaretcolor <em>Caretcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caretcolor</em>'.
	 * @see arkuimodel.arkUIModel.SearchStyle#getCaretcolor()
	 * @see #getSearchStyle()
	 * @generated
	 */
	EAttribute getSearchStyle_Caretcolor();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchStyle#getPlaceholderSize <em>Placeholder Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder Size</em>'.
	 * @see arkuimodel.arkUIModel.SearchStyle#getPlaceholderSize()
	 * @see #getSearchStyle()
	 * @generated
	 */
	EAttribute getSearchStyle_PlaceholderSize();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.SearchStyle#getPlaceholderWeight <em>Placeholder Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder Weight</em>'.
	 * @see arkuimodel.arkUIModel.SearchStyle#getPlaceholderWeight()
	 * @see #getSearchStyle()
	 * @generated
	 */
	EAttribute getSearchStyle_PlaceholderWeight();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.BlankWidget <em>Blank Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blank Widget</em>'.
	 * @see arkuimodel.arkUIModel.BlankWidget
	 * @generated
	 */
	EClass getBlankWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.BlankWidget#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see arkuimodel.arkUIModel.BlankWidget#getMin()
	 * @see #getBlankWidget()
	 * @generated
	 */
	EAttribute getBlankWidget_Min();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.BlankWidget#getBlankstyle <em>Blankstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blankstyle</em>'.
	 * @see arkuimodel.arkUIModel.BlankWidget#getBlankstyle()
	 * @see #getBlankWidget()
	 * @generated
	 */
	EReference getBlankWidget_Blankstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.BlankStyle <em>Blank Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blank Style</em>'.
	 * @see arkuimodel.arkUIModel.BlankStyle
	 * @generated
	 */
	EClass getBlankStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.BlankStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see arkuimodel.arkUIModel.BlankStyle#getColor()
	 * @see #getBlankStyle()
	 * @generated
	 */
	EAttribute getBlankStyle_Color();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ProgressWidget <em>Progress Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Widget</em>'.
	 * @see arkuimodel.arkUIModel.ProgressWidget
	 * @generated
	 */
	EClass getProgressWidget();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressWidget#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.ProgressWidget#getValue()
	 * @see #getProgressWidget()
	 * @generated
	 */
	EAttribute getProgressWidget_Value();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressWidget#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see arkuimodel.arkUIModel.ProgressWidget#getTotal()
	 * @see #getProgressWidget()
	 * @generated
	 */
	EAttribute getProgressWidget_Total();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressWidget#getProgressType <em>Progress Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Type</em>'.
	 * @see arkuimodel.arkUIModel.ProgressWidget#getProgressType()
	 * @see #getProgressWidget()
	 * @generated
	 */
	EAttribute getProgressWidget_ProgressType();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressWidget#getShowType <em>Show Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Type</em>'.
	 * @see arkuimodel.arkUIModel.ProgressWidget#getShowType()
	 * @see #getProgressWidget()
	 * @generated
	 */
	EAttribute getProgressWidget_ShowType();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ProgressWidget#getProgressevent <em>Progressevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Progressevent</em>'.
	 * @see arkuimodel.arkUIModel.ProgressWidget#getProgressevent()
	 * @see #getProgressWidget()
	 * @generated
	 */
	EReference getProgressWidget_Progressevent();

	/**
	 * Returns the meta object for the containment reference '{@link arkuimodel.arkUIModel.ProgressWidget#getProgressstyle <em>Progressstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Progressstyle</em>'.
	 * @see arkuimodel.arkUIModel.ProgressWidget#getProgressstyle()
	 * @see #getProgressWidget()
	 * @generated
	 */
	EReference getProgressWidget_Progressstyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ProgressStyle <em>Progress Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Style</em>'.
	 * @see arkuimodel.arkUIModel.ProgressStyle
	 * @generated
	 */
	EClass getProgressStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressStyle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arkuimodel.arkUIModel.ProgressStyle#getValue()
	 * @see #getProgressStyle()
	 * @generated
	 */
	EAttribute getProgressStyle_Value();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressStyle#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see arkuimodel.arkUIModel.ProgressStyle#getStrokeWidth()
	 * @see #getProgressStyle()
	 * @generated
	 */
	EAttribute getProgressStyle_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressStyle#getScaleCount <em>Scale Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Count</em>'.
	 * @see arkuimodel.arkUIModel.ProgressStyle#getScaleCount()
	 * @see #getProgressStyle()
	 * @generated
	 */
	EAttribute getProgressStyle_ScaleCount();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressStyle#getScaleWidth <em>Scale Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Width</em>'.
	 * @see arkuimodel.arkUIModel.ProgressStyle#getScaleWidth()
	 * @see #getProgressStyle()
	 * @generated
	 */
	EAttribute getProgressStyle_ScaleWidth();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.ProgressStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see arkuimodel.arkUIModel.ProgressStyle#getColor()
	 * @see #getProgressStyle()
	 * @generated
	 */
	EAttribute getProgressStyle_Color();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.ProgressEvent <em>Progress Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Event</em>'.
	 * @see arkuimodel.arkUIModel.ProgressEvent
	 * @generated
	 */
	EClass getProgressEvent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.LineContainer <em>Line Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Container</em>'.
	 * @see arkuimodel.arkUIModel.LineContainer
	 * @generated
	 */
	EClass getLineContainer();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.LineContainer#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see arkuimodel.arkUIModel.LineContainer#getWidth()
	 * @see #getLineContainer()
	 * @generated
	 */
	EAttribute getLineContainer_Width();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.LineContainer#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see arkuimodel.arkUIModel.LineContainer#getHeight()
	 * @see #getLineContainer()
	 * @generated
	 */
	EAttribute getLineContainer_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.LineContainer#getLineevent <em>Lineevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lineevent</em>'.
	 * @see arkuimodel.arkUIModel.LineContainer#getLineevent()
	 * @see #getLineContainer()
	 * @generated
	 */
	EReference getLineContainer_Lineevent();

	/**
	 * Returns the meta object for the containment reference list '{@link arkuimodel.arkUIModel.LineContainer#getLinestyle <em>Linestyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linestyle</em>'.
	 * @see arkuimodel.arkUIModel.LineContainer#getLinestyle()
	 * @see #getLineContainer()
	 * @generated
	 */
	EReference getLineContainer_Linestyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.LineEvent <em>Line Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Event</em>'.
	 * @see arkuimodel.arkUIModel.LineEvent
	 * @generated
	 */
	EClass getLineEvent();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style</em>'.
	 * @see arkuimodel.arkUIModel.LineStyle
	 * @generated
	 */
	EClass getLineStyle();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.LineStyle#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Point</em>'.
	 * @see arkuimodel.arkUIModel.LineStyle#getStartPoint()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_StartPoint();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.LineStyle#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see arkuimodel.arkUIModel.LineStyle#getEndPoint()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_EndPoint();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.WorkOperation <em>Work Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Operation</em>'.
	 * @see arkuimodel.arkUIModel.WorkOperation
	 * @generated
	 */
	EClass getWorkOperation();

	/**
	 * Returns the meta object for the attribute '{@link arkuimodel.arkUIModel.WorkOperation#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see arkuimodel.arkUIModel.WorkOperation#getTitle()
	 * @see #getWorkOperation()
	 * @generated
	 */
	EAttribute getWorkOperation_Title();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GridItemStyle <em>Grid Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Item Style</em>'.
	 * @see arkuimodel.arkUIModel.GridItemStyle
	 * @generated
	 */
	EClass getGridItemStyle();

	/**
	 * Returns the meta object for class '{@link arkuimodel.arkUIModel.GridItemEvent <em>Grid Item Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Item Event</em>'.
	 * @see arkuimodel.arkUIModel.GridItemEvent
	 * @generated
	 */
	EClass getGridItemEvent();

	/**
	 * Returns the meta object for enum '{@link arkuimodel.arkUIModel.DevicesType <em>Devices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Devices Type</em>'.
	 * @see arkuimodel.arkUIModel.DevicesType
	 * @generated
	 */
	EEnum getDevicesType();

	/**
	 * Returns the meta object for enum '{@link arkuimodel.arkUIModel.ExecuteType <em>Execute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execute Type</em>'.
	 * @see arkuimodel.arkUIModel.ExecuteType
	 * @generated
	 */
	EEnum getExecuteType();

	/**
	 * Returns the meta object for enum '{@link arkuimodel.arkUIModel.HttpType <em>Http Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Type</em>'.
	 * @see arkuimodel.arkUIModel.HttpType
	 * @generated
	 */
	EEnum getHttpType();

	/**
	 * Returns the meta object for enum '{@link arkuimodel.arkUIModel.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see arkuimodel.arkUIModel.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link arkuimodel.arkUIModel.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PType</em>'.
	 * @see arkuimodel.arkUIModel.PType
	 * @generated
	 */
	EEnum getPType();

	/**
	 * Returns the meta object for enum '{@link arkuimodel.arkUIModel.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Type</em>'.
	 * @see arkuimodel.arkUIModel.LineType
	 * @generated
	 */
	EEnum getLineType();

	/**
	 * Returns the meta object for enum '{@link arkuimodel.arkUIModel.RouteType <em>Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Route Type</em>'.
	 * @see arkuimodel.arkUIModel.RouteType
	 * @generated
	 */
	EEnum getRouteType();

	/**
	 * Returns the meta object for enum '{@link arkuimodel.arkUIModel.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Union Type</em>'.
	 * @see arkuimodel.arkUIModel.UnionType
	 * @generated
	 */
	EEnum getUnionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArkUIModelFactory getArkUIModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GUIModelImpl <em>GUI Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GUIModelImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGUIModel()
		 * @generated
		 */
		EClass GUI_MODEL = eINSTANCE.getGUIModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODEL__NAME = eINSTANCE.getGUIModel_Name();

		/**
		 * The meta object literal for the '<em><b>Stylelibray</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__STYLELIBRAY = eINSTANCE.getGUIModel_Stylelibray();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODEL__DESCRIPTION = eINSTANCE.getGUIModel_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODEL__TYPE = eINSTANCE.getGUIModel_Type();

		/**
		 * The meta object literal for the '<em><b>Rootpage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__ROOTPAGE = eINSTANCE.getGUIModel_Rootpage();

		/**
		 * The meta object literal for the '<em><b>Triggerevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__TRIGGEREVENT = eINSTANCE.getGUIModel_Triggerevent();

		/**
		 * The meta object literal for the '<em><b>Animationlibray</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__ANIMATIONLIBRAY = eINSTANCE.getGUIModel_Animationlibray();

		/**
		 * The meta object literal for the '<em><b>Uilogic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__UILOGIC = eINSTANCE.getGUIModel_Uilogic();

		/**
		 * The meta object literal for the '<em><b>Uidesign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__UIDESIGN = eINSTANCE.getGUIModel_Uidesign();

		/**
		 * The meta object literal for the '<em><b>Operationlibray</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__OPERATIONLIBRAY = eINSTANCE.getGUIModel_Operationlibray();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.PageImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Page Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PAGE_TITLE = eINSTANCE.getPage_PageTitle();

		/**
		 * The meta object literal for the '<em><b>Is Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__IS_HOME = eINSTANCE.getPage_IsHome();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__FILE_NAME = eINSTANCE.getPage_FileName();

		/**
		 * The meta object literal for the '<em><b>Uilogic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__UILOGIC = eINSTANCE.getPage_Uilogic();

		/**
		 * The meta object literal for the '<em><b>Uidesign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__UIDESIGN = eINSTANCE.getPage_Uidesign();

		/**
		 * The meta object literal for the '<em><b>Subpages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SUBPAGES = eINSTANCE.getPage_Subpages();

		/**
		 * The meta object literal for the '<em><b>Pageroute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGEROUTE = eINSTANCE.getPage_Pageroute();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.UILogicImpl <em>UI Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.UILogicImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUILogic()
		 * @generated
		 */
		EClass UI_LOGIC = eINSTANCE.getUILogic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_LOGIC__NAME = eINSTANCE.getUILogic_Name();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LOGIC__WORKFLOW = eINSTANCE.getUILogic_Workflow();

		/**
		 * The meta object literal for the '<em><b>Pageparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LOGIC__PAGEPARAMETER = eINSTANCE.getUILogic_Pageparameter();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.UIDesignImpl <em>UI Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.UIDesignImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUIDesign()
		 * @generated
		 */
		EClass UI_DESIGN = eINSTANCE.getUIDesign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_DESIGN__NAME = eINSTANCE.getUIDesign_Name();

		/**
		 * The meta object literal for the '<em><b>Pageview</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DESIGN__PAGEVIEW = eINSTANCE.getUIDesign_Pageview();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.PageStructImpl <em>Page Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.PageStructImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPageStruct()
		 * @generated
		 */
		EClass PAGE_STRUCT = eINSTANCE.getPageStruct();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_STRUCT__TITLE = eINSTANCE.getPageStruct_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_STRUCT__TYPE = eINSTANCE.getPageStruct_Type();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_STRUCT__WIDGETS = eINSTANCE.getPageStruct_Widgets();

		/**
		 * The meta object literal for the '<em><b>Pageevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_STRUCT__PAGEEVENT = eINSTANCE.getPageStruct_Pageevent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.UIComponentImpl <em>UI Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.UIComponentImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUIComponent()
		 * @generated
		 */
		EClass UI_COMPONENT = eINSTANCE.getUIComponent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT__ID = eINSTANCE.getUIComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Widget Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT__WIDGET_TYPE = eINSTANCE.getUIComponent_WidgetType();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_COMPONENT__WIDGET = eINSTANCE.getUIComponent_Widget();

		/**
		 * The meta object literal for the '<em><b>Funflow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_COMPONENT__FUNFLOW = eINSTANCE.getUIComponent_Funflow();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_COMPONENT__ROOT = eINSTANCE.getUIComponent_Root();

		/**
		 * The meta object literal for the '<em><b>Pagerefrence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_COMPONENT__PAGEREFRENCE = eINSTANCE.getUIComponent_Pagerefrence();

		/**
		 * The meta object literal for the '<em><b>Foreach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_COMPONENT__FOREACH = eINSTANCE.getUIComponent_Foreach();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_COMPONENT__IF = eINSTANCE.getUIComponent_If();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT__NAME = eINSTANCE.getUIComponent_Name();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextWidgetImpl <em>Text Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextWidget()
		 * @generated
		 */
		EClass TEXT_WIDGET = eINSTANCE.getTextWidget();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_WIDGET__CONTENT = eINSTANCE.getTextWidget_Content();

		/**
		 * The meta object literal for the '<em><b>Textevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_WIDGET__TEXTEVENT = eINSTANCE.getTextWidget_Textevent();

		/**
		 * The meta object literal for the '<em><b>Textstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_WIDGET__TEXTSTYLE = eINSTANCE.getTextWidget_Textstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ButtonWidgetImpl <em>Button Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ButtonWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getButtonWidget()
		 * @generated
		 */
		EClass BUTTON_WIDGET = eINSTANCE.getButtonWidget();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_WIDGET__LABEL = eINSTANCE.getButtonWidget_Label();

		/**
		 * The meta object literal for the '<em><b>State Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_WIDGET__STATE_EFFECT = eINSTANCE.getButtonWidget_StateEffect();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_WIDGET__TYPE = eINSTANCE.getButtonWidget_Type();

		/**
		 * The meta object literal for the '<em><b>Buttonevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_WIDGET__BUTTONEVENT = eINSTANCE.getButtonWidget_Buttonevent();

		/**
		 * The meta object literal for the '<em><b>Buttonstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_WIDGET__BUTTONSTYLE = eINSTANCE.getButtonWidget_Buttonstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.FlexContainerImpl <em>Flex Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.FlexContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFlexContainer()
		 * @generated
		 */
		EClass FLEX_CONTAINER = eINSTANCE.getFlexContainer();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_CONTAINER__DIRECTION = eINSTANCE.getFlexContainer_Direction();

		/**
		 * The meta object literal for the '<em><b>Wrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_CONTAINER__WRAP = eINSTANCE.getFlexContainer_Wrap();

		/**
		 * The meta object literal for the '<em><b>Justify Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_CONTAINER__JUSTIFY_CONTENT = eINSTANCE.getFlexContainer_JustifyContent();

		/**
		 * The meta object literal for the '<em><b>Align Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_CONTAINER__ALIGN_ITEMS = eINSTANCE.getFlexContainer_AlignItems();

		/**
		 * The meta object literal for the '<em><b>Align Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_CONTAINER__ALIGN_CONTENT = eINSTANCE.getFlexContainer_AlignContent();

		/**
		 * The meta object literal for the '<em><b>Flexevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLEX_CONTAINER__FLEXEVENT = eINSTANCE.getFlexContainer_Flexevent();

		/**
		 * The meta object literal for the '<em><b>Flexstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLEX_CONTAINER__FLEXSTYLE = eINSTANCE.getFlexContainer_Flexstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.StyleLibrayImpl <em>Style Libray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.StyleLibrayImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStyleLibray()
		 * @generated
		 */
		EClass STYLE_LIBRAY = eINSTANCE.getStyleLibray();

		/**
		 * The meta object literal for the '<em><b>Styleclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_LIBRAY__STYLECLASS = eINSTANCE.getStyleLibray_Styleclass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_LIBRAY__NAME = eINSTANCE.getStyleLibray_Name();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.StyleClassImpl <em>Style Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.StyleClassImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStyleClass()
		 * @generated
		 */
		EClass STYLE_CLASS = eINSTANCE.getStyleClass();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__WIDTH = eINSTANCE.getStyleClass_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__HEIGHT = eINSTANCE.getStyleClass_Height();

		/**
		 * The meta object literal for the '<em><b>Aspect Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__ASPECT_RATIO = eINSTANCE.getStyleClass_AspectRatio();

		/**
		 * The meta object literal for the '<em><b>Paddingleft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__PADDINGLEFT = eINSTANCE.getStyleClass_Paddingleft();

		/**
		 * The meta object literal for the '<em><b>Marginleft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__MARGINLEFT = eINSTANCE.getStyleClass_Marginleft();

		/**
		 * The meta object literal for the '<em><b>Layout Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__LAYOUT_WEIGHT = eINSTANCE.getStyleClass_LayoutWeight();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__ALIGN = eINSTANCE.getStyleClass_Align();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__DIRECTION = eINSTANCE.getStyleClass_Direction();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__POSITION = eINSTANCE.getStyleClass_Position();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__OFFSET = eINSTANCE.getStyleClass_Offset();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__BACKGROUND_COLOR = eINSTANCE.getStyleClass_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Background Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__BACKGROUND_IMAGE = eINSTANCE.getStyleClass_BackgroundImage();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__BORDER = eINSTANCE.getStyleClass_Border();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__VISIBILITY = eINSTANCE.getStyleClass_Visibility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__NAME = eINSTANCE.getStyleClass_Name();

		/**
		 * The meta object literal for the '<em><b>Animationclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_CLASS__ANIMATIONCLASS = eINSTANCE.getStyleClass_Animationclass();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__ASSIGN = eINSTANCE.getStyleClass_Assign();

		/**
		 * The meta object literal for the '<em><b>Paddingright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__PADDINGRIGHT = eINSTANCE.getStyleClass_Paddingright();

		/**
		 * The meta object literal for the '<em><b>Paddingtop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__PADDINGTOP = eINSTANCE.getStyleClass_Paddingtop();

		/**
		 * The meta object literal for the '<em><b>Paddingbottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__PADDINGBOTTOM = eINSTANCE.getStyleClass_Paddingbottom();

		/**
		 * The meta object literal for the '<em><b>Marginright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__MARGINRIGHT = eINSTANCE.getStyleClass_Marginright();

		/**
		 * The meta object literal for the '<em><b>Margintop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__MARGINTOP = eINSTANCE.getStyleClass_Margintop();

		/**
		 * The meta object literal for the '<em><b>Marginbottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__MARGINBOTTOM = eINSTANCE.getStyleClass_Marginbottom();

		/**
		 * The meta object literal for the '<em><b>Border Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__BORDER_RADIUS = eINSTANCE.getStyleClass_BorderRadius();

		/**
		 * The meta object literal for the '<em><b>Background Image Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__BACKGROUND_IMAGE_SIZE = eINSTANCE.getStyleClass_BackgroundImageSize();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__ROTATE = eINSTANCE.getStyleClass_Rotate();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_CLASS__ZINDEX = eINSTANCE.getStyleClass_ZIndex();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.PrimitiveOperationImpl <em>Primitive Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.PrimitiveOperationImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPrimitiveOperation()
		 * @generated
		 */
		EClass PRIMITIVE_OPERATION = eINSTANCE.getPrimitiveOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_OPERATION__NAME = eINSTANCE.getPrimitiveOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_OPERATION__CONTAINS = eINSTANCE.getPrimitiveOperation_Contains();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_OPERATION__RETURNTYPE = eINSTANCE.getPrimitiveOperation_Returntype();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextInputWidgetImpl <em>Text Input Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextInputWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextInputWidget()
		 * @generated
		 */
		EClass TEXT_INPUT_WIDGET = eINSTANCE.getTextInputWidget();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_WIDGET__TEXT = eINSTANCE.getTextInputWidget_Text();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_WIDGET__PLACEHOLDER = eINSTANCE.getTextInputWidget_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_WIDGET__CONTROLLER = eINSTANCE.getTextInputWidget_Controller();

		/**
		 * The meta object literal for the '<em><b>Textinputevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_INPUT_WIDGET__TEXTINPUTEVENT = eINSTANCE.getTextInputWidget_Textinputevent();

		/**
		 * The meta object literal for the '<em><b>Textinputstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_INPUT_WIDGET__TEXTINPUTSTYLE = eINSTANCE.getTextInputWidget_Textinputstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ListContainerImpl <em>List Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ListContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListContainer()
		 * @generated
		 */
		EClass LIST_CONTAINER = eINSTANCE.getListContainer();

		/**
		 * The meta object literal for the '<em><b>Initial Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_CONTAINER__INITIAL_INDEX = eINSTANCE.getListContainer_InitialIndex();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_CONTAINER__SPACE = eINSTANCE.getListContainer_Space();

		/**
		 * The meta object literal for the '<em><b>Scroller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_CONTAINER__SCROLLER = eINSTANCE.getListContainer_Scroller();

		/**
		 * The meta object literal for the '<em><b>Listitemcontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_CONTAINER__LISTITEMCONTAINER = eINSTANCE.getListContainer_Listitemcontainer();

		/**
		 * The meta object literal for the '<em><b>Listevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_CONTAINER__LISTEVENT = eINSTANCE.getListContainer_Listevent();

		/**
		 * The meta object literal for the '<em><b>Liststyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_CONTAINER__LISTSTYLE = eINSTANCE.getListContainer_Liststyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextStyleImpl <em>Text Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextStyle()
		 * @generated
		 */
		EClass TEXT_STYLE = eINSTANCE.getTextStyle();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_COLOR = eINSTANCE.getTextStyle_FontColor();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_SIZE = eINSTANCE.getTextStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Min Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__MIN_FONT_SIZE = eINSTANCE.getTextStyle_MinFontSize();

		/**
		 * The meta object literal for the '<em><b>Max Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__MAX_FONT_SIZE = eINSTANCE.getTextStyle_MaxFontSize();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_STYLE = eINSTANCE.getTextStyle_FontStyle();

		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_WEIGHT = eINSTANCE.getTextStyle_FontWeight();

		/**
		 * The meta object literal for the '<em><b>Text Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_ALIGN = eINSTANCE.getTextStyle_TextAlign();

		/**
		 * The meta object literal for the '<em><b>Line Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__LINE_HEIGHT = eINSTANCE.getTextStyle_LineHeight();

		/**
		 * The meta object literal for the '<em><b>Text Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_OVERFLOW = eINSTANCE.getTextStyle_TextOverflow();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_FAMILY = eINSTANCE.getTextStyle_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Max Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__MAX_LINES = eINSTANCE.getTextStyle_MaxLines();

		/**
		 * The meta object literal for the '<em><b>Decoration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__DECORATION_TYPE = eINSTANCE.getTextStyle_DecorationType();

		/**
		 * The meta object literal for the '<em><b>Letter Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__LETTER_SPACING = eINSTANCE.getTextStyle_LetterSpacing();

		/**
		 * The meta object literal for the '<em><b>Text Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_CASE = eINSTANCE.getTextStyle_TextCase();

		/**
		 * The meta object literal for the '<em><b>Baseline Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BASELINE_OFFSET = eINSTANCE.getTextStyle_BaselineOffset();

		/**
		 * The meta object literal for the '<em><b>Decoration Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__DECORATION_COLOR = eINSTANCE.getTextStyle_DecorationColor();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextInputStyleImpl <em>Text Input Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextInputStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextInputStyle()
		 * @generated
		 */
		EClass TEXT_INPUT_STYLE = eINSTANCE.getTextInputStyle();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__TYPE = eINSTANCE.getTextInputStyle_Type();

		/**
		 * The meta object literal for the '<em><b>Placeholder Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__PLACEHOLDER_COLOR = eINSTANCE.getTextInputStyle_PlaceholderColor();

		/**
		 * The meta object literal for the '<em><b>Placeholder Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__PLACEHOLDER_FONT = eINSTANCE.getTextInputStyle_PlaceholderFont();

		/**
		 * The meta object literal for the '<em><b>Enter Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__ENTER_KEY_TYPE = eINSTANCE.getTextInputStyle_EnterKeyType();

		/**
		 * The meta object literal for the '<em><b>Caret Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__CARET_COLOR = eINSTANCE.getTextInputStyle_CaretColor();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__MAX_LENGTH = eINSTANCE.getTextInputStyle_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__FONT_COLOR = eINSTANCE.getTextInputStyle_FontColor();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__FONT_SIZE = eINSTANCE.getTextInputStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__FONT_STYLE = eINSTANCE.getTextInputStyle_FontStyle();

		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__FONT_WEIGHT = eINSTANCE.getTextInputStyle_FontWeight();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__FONT_FAMILY = eINSTANCE.getTextInputStyle_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_STYLE__INPUT_FILTER = eINSTANCE.getTextInputStyle_InputFilter();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ParameterImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>PType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PTYPE = eINSTANCE.getParameter_PType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ASSIGN = eINSTANCE.getParameter_Assign();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CONST = eINSTANCE.getParameter_Const();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STATE = eINSTANCE.getParameter_State();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TypeCSImpl <em>Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TypeCSImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTypeCS()
		 * @generated
		 */
		EClass TYPE_CS = eINSTANCE.getTypeCS();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_CS__TYPE = eINSTANCE.getTypeCS_Type();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.RowContainerImpl <em>Row Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.RowContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRowContainer()
		 * @generated
		 */
		EClass ROW_CONTAINER = eINSTANCE.getRowContainer();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_CONTAINER__SPACE = eINSTANCE.getRowContainer_Space();

		/**
		 * The meta object literal for the '<em><b>Align Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_CONTAINER__ALIGN_ITEMS = eINSTANCE.getRowContainer_AlignItems();

		/**
		 * The meta object literal for the '<em><b>Justify Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_CONTAINER__JUSTIFY_CONTENT = eINSTANCE.getRowContainer_JustifyContent();

		/**
		 * The meta object literal for the '<em><b>Rowevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_CONTAINER__ROWEVENT = eINSTANCE.getRowContainer_Rowevent();

		/**
		 * The meta object literal for the '<em><b>Rowstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_CONTAINER__ROWSTYLE = eINSTANCE.getRowContainer_Rowstyle();

		/**
		 * The meta object literal for the '<em><b>Bind Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_CONTAINER__BIND_MENU = eINSTANCE.getRowContainer_BindMenu();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ColumnContainerImpl <em>Column Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ColumnContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getColumnContainer()
		 * @generated
		 */
		EClass COLUMN_CONTAINER = eINSTANCE.getColumnContainer();

		/**
		 * The meta object literal for the '<em><b>Justify Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONTAINER__JUSTIFY_CONTENT = eINSTANCE.getColumnContainer_JustifyContent();

		/**
		 * The meta object literal for the '<em><b>Align Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONTAINER__ALIGN_ITEMS = eINSTANCE.getColumnContainer_AlignItems();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONTAINER__SPACE = eINSTANCE.getColumnContainer_Space();

		/**
		 * The meta object literal for the '<em><b>Columnevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_CONTAINER__COLUMNEVENT = eINSTANCE.getColumnContainer_Columnevent();

		/**
		 * The meta object literal for the '<em><b>Columnstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_CONTAINER__COLUMNSTYLE = eINSTANCE.getColumnContainer_Columnstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ButtonStyleImpl <em>Button Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ButtonStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getButtonStyle()
		 * @generated
		 */
		EClass BUTTON_STYLE = eINSTANCE.getButtonStyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.FlexStyleImpl <em>Flex Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.FlexStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFlexStyle()
		 * @generated
		 */
		EClass FLEX_STYLE = eINSTANCE.getFlexStyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.RowStyleImpl <em>Row Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.RowStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRowStyle()
		 * @generated
		 */
		EClass ROW_STYLE = eINSTANCE.getRowStyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ColumnStyleImpl <em>Column Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ColumnStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getColumnStyle()
		 * @generated
		 */
		EClass COLUMN_STYLE = eINSTANCE.getColumnStyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ListStyleImpl <em>List Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ListStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListStyle()
		 * @generated
		 */
		EClass LIST_STYLE = eINSTANCE.getListStyle();

		/**
		 * The meta object literal for the '<em><b>List Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__LIST_DIRECTION = eINSTANCE.getListStyle_ListDirection();

		/**
		 * The meta object literal for the '<em><b>Edge Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__EDGE_EFFECT = eINSTANCE.getListStyle_EdgeEffect();

		/**
		 * The meta object literal for the '<em><b>Divider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__DIVIDER = eINSTANCE.getListStyle_Divider();

		/**
		 * The meta object literal for the '<em><b>Edit Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__EDIT_MODE = eINSTANCE.getListStyle_EditMode();

		/**
		 * The meta object literal for the '<em><b>Chain Animation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__CHAIN_ANIMATION = eINSTANCE.getListStyle_ChainAnimation();

		/**
		 * The meta object literal for the '<em><b>Scroll Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__SCROLL_BAR = eINSTANCE.getListStyle_ScrollBar();

		/**
		 * The meta object literal for the '<em><b>Cached Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__CACHED_COUNT = eINSTANCE.getListStyle_CachedCount();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__STROKE_WIDTH = eINSTANCE.getListStyle_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__COLOR = eINSTANCE.getListStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Start Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__START_MARGIN = eINSTANCE.getListStyle_StartMargin();

		/**
		 * The meta object literal for the '<em><b>End Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__END_MARGIN = eINSTANCE.getListStyle_EndMargin();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ListItemStyleImpl <em>List Item Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ListItemStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListItemStyle()
		 * @generated
		 */
		EClass LIST_ITEM_STYLE = eINSTANCE.getListItemStyle();

		/**
		 * The meta object literal for the '<em><b>Sticky</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM_STYLE__STICKY = eINSTANCE.getListItemStyle_Sticky();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM_STYLE__EDITABLE = eINSTANCE.getListItemStyle_Editable();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ListItemContainerImpl <em>List Item Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ListItemContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListItemContainer()
		 * @generated
		 */
		EClass LIST_ITEM_CONTAINER = eINSTANCE.getListItemContainer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM_CONTAINER__VALUE = eINSTANCE.getListItemContainer_Value();

		/**
		 * The meta object literal for the '<em><b>Listitemevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM_CONTAINER__LISTITEMEVENT = eINSTANCE.getListItemContainer_Listitemevent();

		/**
		 * The meta object literal for the '<em><b>Listitemstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM_CONTAINER__LISTITEMSTYLE = eINSTANCE.getListItemContainer_Listitemstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ImageWidgetImpl <em>Image Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ImageWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageWidget()
		 * @generated
		 */
		EClass IMAGE_WIDGET = eINSTANCE.getImageWidget();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_WIDGET__SRC = eINSTANCE.getImageWidget_Src();

		/**
		 * The meta object literal for the '<em><b>Imageevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_WIDGET__IMAGEEVENT = eINSTANCE.getImageWidget_Imageevent();

		/**
		 * The meta object literal for the '<em><b>Imagestyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_WIDGET__IMAGESTYLE = eINSTANCE.getImageWidget_Imagestyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ImageStyleImpl <em>Image Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ImageStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageStyle()
		 * @generated
		 */
		EClass IMAGE_STYLE = eINSTANCE.getImageStyle();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__ALT = eINSTANCE.getImageStyle_Alt();

		/**
		 * The meta object literal for the '<em><b>Match Text Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__MATCH_TEXT_DIRECTION = eINSTANCE.getImageStyle_MatchTextDirection();

		/**
		 * The meta object literal for the '<em><b>Fit Original Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__FIT_ORIGINAL_SIZE = eINSTANCE.getImageStyle_FitOriginalSize();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__FILL_COLOR = eINSTANCE.getImageStyle_FillColor();

		/**
		 * The meta object literal for the '<em><b>Object Fit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__OBJECT_FIT = eINSTANCE.getImageStyle_ObjectFit();

		/**
		 * The meta object literal for the '<em><b>Object Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__OBJECT_REPEAT = eINSTANCE.getImageStyle_ObjectRepeat();

		/**
		 * The meta object literal for the '<em><b>Auto Resize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__AUTO_RESIZE = eINSTANCE.getImageStyle_AutoResize();

		/**
		 * The meta object literal for the '<em><b>Render Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__RENDER_MODE = eINSTANCE.getImageStyle_RenderMode();

		/**
		 * The meta object literal for the '<em><b>Interpolation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__INTERPOLATION = eINSTANCE.getImageStyle_Interpolation();

		/**
		 * The meta object literal for the '<em><b>Source Size Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__SOURCE_SIZE_HEIGHT = eINSTANCE.getImageStyle_SourceSizeHeight();

		/**
		 * The meta object literal for the '<em><b>Sync Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__SYNC_LOAD = eINSTANCE.getImageStyle_SyncLoad();

		/**
		 * The meta object literal for the '<em><b>Source Size Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__SOURCE_SIZE_WIDTH = eINSTANCE.getImageStyle_SourceSizeWidth();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ControlFlowImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__TARGET = eINSTANCE.getControlFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__SOURCE = eINSTANCE.getControlFlow_Source();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TriggerEventImpl <em>Trigger Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TriggerEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTriggerEvent()
		 * @generated
		 */
		EClass TRIGGER_EVENT = eINSTANCE.getTriggerEvent();

		/**
		 * The meta object literal for the '<em><b>Eventclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_EVENT__EVENTCLASS = eINSTANCE.getTriggerEvent_Eventclass();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.EventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>On Click</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_CLICK = eINSTANCE.getEvent_OnClick();

		/**
		 * The meta object literal for the '<em><b>On Touch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_TOUCH = eINSTANCE.getEvent_OnTouch();

		/**
		 * The meta object literal for the '<em><b>On Drag Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_DRAG_START = eINSTANCE.getEvent_OnDragStart();

		/**
		 * The meta object literal for the '<em><b>On Drag Enter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_DRAG_ENTER = eINSTANCE.getEvent_OnDragEnter();

		/**
		 * The meta object literal for the '<em><b>On Drag Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_DRAG_MOVE = eINSTANCE.getEvent_OnDragMove();

		/**
		 * The meta object literal for the '<em><b>On Drag Leave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_DRAG_LEAVE = eINSTANCE.getEvent_OnDragLeave();

		/**
		 * The meta object literal for the '<em><b>On Drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_DROP = eINSTANCE.getEvent_OnDrop();

		/**
		 * The meta object literal for the '<em><b>On Appear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_APPEAR = eINSTANCE.getEvent_OnAppear();

		/**
		 * The meta object literal for the '<em><b>On Dis Appear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_DIS_APPEAR = eINSTANCE.getEvent_OnDisAppear();

		/**
		 * The meta object literal for the '<em><b>On Area Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ON_AREA_CHANGE = eINSTANCE.getEvent_OnAreaChange();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.PageEventImpl <em>Page Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.PageEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPageEvent()
		 * @generated
		 */
		EClass PAGE_EVENT = eINSTANCE.getPageEvent();

		/**
		 * The meta object literal for the '<em><b>On Page Hide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_EVENT__ON_PAGE_HIDE = eINSTANCE.getPageEvent_OnPageHide();

		/**
		 * The meta object literal for the '<em><b>About To Appear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_EVENT__ABOUT_TO_APPEAR = eINSTANCE.getPageEvent_AboutToAppear();

		/**
		 * The meta object literal for the '<em><b>On Page Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_EVENT__ON_PAGE_SHOW = eINSTANCE.getPageEvent_OnPageShow();

		/**
		 * The meta object literal for the '<em><b>On Back Press</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_EVENT__ON_BACK_PRESS = eINSTANCE.getPageEvent_OnBackPress();

		/**
		 * The meta object literal for the '<em><b>About To Disappear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_EVENT__ABOUT_TO_DISAPPEAR = eINSTANCE.getPageEvent_AboutToDisappear();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ColumnEventImpl <em>Column Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ColumnEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getColumnEvent()
		 * @generated
		 */
		EClass COLUMN_EVENT = eINSTANCE.getColumnEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.RowEventImpl <em>Row Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.RowEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRowEvent()
		 * @generated
		 */
		EClass ROW_EVENT = eINSTANCE.getRowEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.FlexEventImpl <em>Flex Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.FlexEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFlexEvent()
		 * @generated
		 */
		EClass FLEX_EVENT = eINSTANCE.getFlexEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ImageEventImpl <em>Image Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ImageEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageEvent()
		 * @generated
		 */
		EClass IMAGE_EVENT = eINSTANCE.getImageEvent();

		/**
		 * The meta object literal for the '<em><b>On Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_EVENT__ON_COMPLETE = eINSTANCE.getImageEvent_OnComplete();

		/**
		 * The meta object literal for the '<em><b>On Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_EVENT__ON_ERROR = eINSTANCE.getImageEvent_OnError();

		/**
		 * The meta object literal for the '<em><b>On Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_EVENT__ON_FINISH = eINSTANCE.getImageEvent_OnFinish();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextEventImpl <em>Text Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextEvent()
		 * @generated
		 */
		EClass TEXT_EVENT = eINSTANCE.getTextEvent();

		/**
		 * The meta object literal for the '<em><b>On Focus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_EVENT__ON_FOCUS = eINSTANCE.getTextEvent_OnFocus();

		/**
		 * The meta object literal for the '<em><b>On Blur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_EVENT__ON_BLUR = eINSTANCE.getTextEvent_OnBlur();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ButtonEventImpl <em>Button Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ButtonEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getButtonEvent()
		 * @generated
		 */
		EClass BUTTON_EVENT = eINSTANCE.getButtonEvent();

		/**
		 * The meta object literal for the '<em><b>On Blur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_EVENT__ON_BLUR = eINSTANCE.getButtonEvent_OnBlur();

		/**
		 * The meta object literal for the '<em><b>On Focus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_EVENT__ON_FOCUS = eINSTANCE.getButtonEvent_OnFocus();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextInputEventImpl <em>Text Input Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextInputEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextInputEvent()
		 * @generated
		 */
		EClass TEXT_INPUT_EVENT = eINSTANCE.getTextInputEvent();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_EVENT__ON_CHANGE = eINSTANCE.getTextInputEvent_OnChange();

		/**
		 * The meta object literal for the '<em><b>On Submit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_EVENT__ON_SUBMIT = eINSTANCE.getTextInputEvent_OnSubmit();

		/**
		 * The meta object literal for the '<em><b>On Copy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_EVENT__ON_COPY = eINSTANCE.getTextInputEvent_OnCopy();

		/**
		 * The meta object literal for the '<em><b>On Paste</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_EVENT__ON_PASTE = eINSTANCE.getTextInputEvent_OnPaste();

		/**
		 * The meta object literal for the '<em><b>On Cut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_EVENT__ON_CUT = eINSTANCE.getTextInputEvent_OnCut();

		/**
		 * The meta object literal for the '<em><b>On Edit Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_EVENT__ON_EDIT_CHANGED = eINSTANCE.getTextInputEvent_OnEditChanged();

		/**
		 * The meta object literal for the '<em><b>On Edit Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_EVENT__ON_EDIT_CHANGE = eINSTANCE.getTextInputEvent_OnEditChange();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ListEventImpl <em>List Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ListEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListEvent()
		 * @generated
		 */
		EClass LIST_EVENT = eINSTANCE.getListEvent();

		/**
		 * The meta object literal for the '<em><b>On Scroll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_SCROLL = eINSTANCE.getListEvent_OnScroll();

		/**
		 * The meta object literal for the '<em><b>On Scroll Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_SCROLL_INDEX = eINSTANCE.getListEvent_OnScrollIndex();

		/**
		 * The meta object literal for the '<em><b>On Reach Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_REACH_START = eINSTANCE.getListEvent_OnReachStart();

		/**
		 * The meta object literal for the '<em><b>On Reach End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_REACH_END = eINSTANCE.getListEvent_OnReachEnd();

		/**
		 * The meta object literal for the '<em><b>On Scroll Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_SCROLL_STOP = eINSTANCE.getListEvent_OnScrollStop();

		/**
		 * The meta object literal for the '<em><b>On Item Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_ITEM_DELETE = eINSTANCE.getListEvent_OnItemDelete();

		/**
		 * The meta object literal for the '<em><b>On Item Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_ITEM_MOVE = eINSTANCE.getListEvent_OnItemMove();

		/**
		 * The meta object literal for the '<em><b>On Blur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_BLUR = eINSTANCE.getListEvent_OnBlur();

		/**
		 * The meta object literal for the '<em><b>On Focus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EVENT__ON_FOCUS = eINSTANCE.getListEvent_OnFocus();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ListItemEventImpl <em>List Item Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ListItemEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getListItemEvent()
		 * @generated
		 */
		EClass LIST_ITEM_EVENT = eINSTANCE.getListItemEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.UIOperationImpl <em>UI Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.UIOperationImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUIOperation()
		 * @generated
		 */
		EClass UI_OPERATION = eINSTANCE.getUIOperation();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SeviceOperationImpl <em>Sevice Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SeviceOperationImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSeviceOperation()
		 * @generated
		 */
		EClass SEVICE_OPERATION = eINSTANCE.getSeviceOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEVICE_OPERATION__TYPE = eINSTANCE.getSeviceOperation_Type();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.LoopOpImpl <em>Loop Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.LoopOpImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLoopOp()
		 * @generated
		 */
		EClass LOOP_OP = eINSTANCE.getLoopOp();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OP__START = eINSTANCE.getLoopOp_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OP__END = eINSTANCE.getLoopOp_End();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OP__STEP = eINSTANCE.getLoopOp_Step();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OP__EXPRESSION = eINSTANCE.getLoopOp_Expression();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.CaseOpImpl <em>Case Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.CaseOpImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCaseOp()
		 * @generated
		 */
		EClass CASE_OP = eINSTANCE.getCaseOp();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_OP__EXPRESSION = eINSTANCE.getCaseOp_Expression();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.HttpOperationImpl <em>Http Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.HttpOperationImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getHttpOperation()
		 * @generated
		 */
		EClass HTTP_OPERATION = eINSTANCE.getHttpOperation();

		/**
		 * The meta object literal for the '<em><b>Http Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_OPERATION__HTTP_TYPE = eINSTANCE.getHttpOperation_HttpType();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_OPERATION__URL = eINSTANCE.getHttpOperation_Url();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_OPERATION__RES = eINSTANCE.getHttpOperation_Res();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GetParameterImpl <em>Get Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GetParameterImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGetParameter()
		 * @generated
		 */
		EClass GET_PARAMETER = eINSTANCE.getGetParameter();

		/**
		 * The meta object literal for the '<em><b>Parm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PARAMETER__PARM = eINSTANCE.getGetParameter_Parm();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PARAMETER__VALUE = eINSTANCE.getGetParameter_Value();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SetParameterImpl <em>Set Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SetParameterImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSetParameter()
		 * @generated
		 */
		EClass SET_PARAMETER = eINSTANCE.getSetParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__VALUE = eINSTANCE.getSetParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Parm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__PARM = eINSTANCE.getSetParameter_Parm();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.AnimationClassImpl <em>Animation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.AnimationClassImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getAnimationClass()
		 * @generated
		 */
		EClass ANIMATION_CLASS = eINSTANCE.getAnimationClass();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION_CLASS__DURATION = eINSTANCE.getAnimationClass_Duration();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION_CLASS__CURVE = eINSTANCE.getAnimationClass_Curve();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION_CLASS__DELAY = eINSTANCE.getAnimationClass_Delay();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION_CLASS__ITERATIONS = eINSTANCE.getAnimationClass_Iterations();

		/**
		 * The meta object literal for the '<em><b>Play Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION_CLASS__PLAY_MODE = eINSTANCE.getAnimationClass_PlayMode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION_CLASS__NAME = eINSTANCE.getAnimationClass_Name();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ImageAnimatorImpl <em>Image Animator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ImageAnimatorImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageAnimator()
		 * @generated
		 */
		EClass IMAGE_ANIMATOR = eINSTANCE.getImageAnimator();

		/**
		 * The meta object literal for the '<em><b>Imagesitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_ANIMATOR__IMAGESITEM = eINSTANCE.getImageAnimator_Imagesitem();

		/**
		 * The meta object literal for the '<em><b>Imageanimatorevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_ANIMATOR__IMAGEANIMATOREVENT = eINSTANCE.getImageAnimator_Imageanimatorevent();

		/**
		 * The meta object literal for the '<em><b>Imageanimatorstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_ANIMATOR__IMAGEANIMATORSTYLE = eINSTANCE.getImageAnimator_Imageanimatorstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ImagesItemImpl <em>Images Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ImagesItemImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImagesItem()
		 * @generated
		 */
		EClass IMAGES_ITEM = eINSTANCE.getImagesItem();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGES_ITEM__SRC = eINSTANCE.getImagesItem_Src();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGES_ITEM__WIDTH = eINSTANCE.getImagesItem_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGES_ITEM__HEIGHT = eINSTANCE.getImagesItem_Height();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGES_ITEM__TOP = eINSTANCE.getImagesItem_Top();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGES_ITEM__LEFT = eINSTANCE.getImagesItem_Left();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGES_ITEM__DURATION = eINSTANCE.getImagesItem_Duration();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl <em>Image Animator Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ImageAnimatorStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageAnimatorStyle()
		 * @generated
		 */
		EClass IMAGE_ANIMATOR_STYLE = eINSTANCE.getImageAnimatorStyle();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_STYLE__STATE = eINSTANCE.getImageAnimatorStyle_State();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_STYLE__DURATION = eINSTANCE.getImageAnimatorStyle_Duration();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_STYLE__REVERSE = eINSTANCE.getImageAnimatorStyle_Reverse();

		/**
		 * The meta object literal for the '<em><b>Fixed Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_STYLE__FIXED_SIZE = eINSTANCE.getImageAnimatorStyle_FixedSize();

		/**
		 * The meta object literal for the '<em><b>Pre Decode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_STYLE__PRE_DECODE = eINSTANCE.getImageAnimatorStyle_PreDecode();

		/**
		 * The meta object literal for the '<em><b>Fill Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_STYLE__FILL_MODE = eINSTANCE.getImageAnimatorStyle_FillMode();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_STYLE__ITERATIONS = eINSTANCE.getImageAnimatorStyle_Iterations();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl <em>Image Animator Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ImageAnimatorEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getImageAnimatorEvent()
		 * @generated
		 */
		EClass IMAGE_ANIMATOR_EVENT = eINSTANCE.getImageAnimatorEvent();

		/**
		 * The meta object literal for the '<em><b>On Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_EVENT__ON_START = eINSTANCE.getImageAnimatorEvent_OnStart();

		/**
		 * The meta object literal for the '<em><b>On Pause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_EVENT__ON_PAUSE = eINSTANCE.getImageAnimatorEvent_OnPause();

		/**
		 * The meta object literal for the '<em><b>On Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_EVENT__ON_REPEAT = eINSTANCE.getImageAnimatorEvent_OnRepeat();

		/**
		 * The meta object literal for the '<em><b>On Cancel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_EVENT__ON_CANCEL = eINSTANCE.getImageAnimatorEvent_OnCancel();

		/**
		 * The meta object literal for the '<em><b>On Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_ANIMATOR_EVENT__ON_FINISH = eINSTANCE.getImageAnimatorEvent_OnFinish();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.RouteSkipImpl <em>Route Skip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.RouteSkipImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRouteSkip()
		 * @generated
		 */
		EClass ROUTE_SKIP = eINSTANCE.getRouteSkip();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_SKIP__TYPE = eINSTANCE.getRouteSkip_Type();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_SKIP__URL = eINSTANCE.getRouteSkip_Url();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_SKIP__VARIABLE = eINSTANCE.getRouteSkip_Variable();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_SKIP__PAGE = eINSTANCE.getRouteSkip_Page();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GetRouteValueImpl <em>Get Route Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GetRouteValueImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGetRouteValue()
		 * @generated
		 */
		EClass GET_ROUTE_VALUE = eINSTANCE.getGetRouteValue();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ROUTE_VALUE__VARIABLE = eINSTANCE.getGetRouteValue_Variable();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ExtraOperationImpl <em>Extra Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ExtraOperationImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getExtraOperation()
		 * @generated
		 */
		EClass EXTRA_OPERATION = eINSTANCE.getExtraOperation();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SeqOpImpl <em>Seq Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SeqOpImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSeqOp()
		 * @generated
		 */
		EClass SEQ_OP = eINSTANCE.getSeqOp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_OP__TYPE = eINSTANCE.getSeqOp_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQ_OP__VALUE = eINSTANCE.getSeqOp_Value();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.UIStructImpl <em>UI Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.UIStructImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUIStruct()
		 * @generated
		 */
		EClass UI_STRUCT = eINSTANCE.getUIStruct();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STRUCT__PAGE = eINSTANCE.getUIStruct_Page();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_STRUCT__NAME = eINSTANCE.getUIStruct_Name();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.AnimationLibrayImpl <em>Animation Libray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.AnimationLibrayImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getAnimationLibray()
		 * @generated
		 */
		EClass ANIMATION_LIBRAY = eINSTANCE.getAnimationLibray();

		/**
		 * The meta object literal for the '<em><b>Animationclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMATION_LIBRAY__ANIMATIONCLASS = eINSTANCE.getAnimationLibray_Animationclass();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.WidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.EntityImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Super Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPER_ENTITY = eINSTANCE.getEntity_SuperEntity();

		/**
		 * The meta object literal for the '<em><b>Entityrefrence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITYREFRENCE = eINSTANCE.getEntity_Entityrefrence();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.EntityAttributeImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEntityAttribute()
		 * @generated
		 */
		EClass ENTITY_ATTRIBUTE = eINSTANCE.getEntityAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ATTRIBUTE__TYPE = eINSTANCE.getEntityAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ATTRIBUTE__NAME = eINSTANCE.getEntityAttribute_Name();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ArrayImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__LENGTH = eINSTANCE.getArray_Length();

		/**
		 * The meta object literal for the '<em><b>Atype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__ATYPE = eINSTANCE.getArray_Atype();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.NavigationContainerImpl <em>Navigation Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.NavigationContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getNavigationContainer()
		 * @generated
		 */
		EClass NAVIGATION_CONTAINER = eINSTANCE.getNavigationContainer();

		/**
		 * The meta object literal for the '<em><b>Toolbar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_CONTAINER__TOOLBAR = eINSTANCE.getNavigationContainer_Toolbar();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_CONTAINER__MENU = eINSTANCE.getNavigationContainer_Menu();

		/**
		 * The meta object literal for the '<em><b>Navigationevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_CONTAINER__NAVIGATIONEVENT = eINSTANCE.getNavigationContainer_Navigationevent();

		/**
		 * The meta object literal for the '<em><b>Navigationstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_CONTAINER__NAVIGATIONSTYLE = eINSTANCE.getNavigationContainer_Navigationstyle();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_CONTAINER__TITLE = eINSTANCE.getNavigationContainer_Title();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.NavigationStyleImpl <em>Navigation Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.NavigationStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getNavigationStyle()
		 * @generated
		 */
		EClass NAVIGATION_STYLE = eINSTANCE.getNavigationStyle();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_STYLE__TITLE = eINSTANCE.getNavigationStyle_Title();

		/**
		 * The meta object literal for the '<em><b>Sub Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_STYLE__SUB_TITLE = eINSTANCE.getNavigationStyle_SubTitle();

		/**
		 * The meta object literal for the '<em><b>Hide Title Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_STYLE__HIDE_TITLE_BAR = eINSTANCE.getNavigationStyle_HideTitleBar();

		/**
		 * The meta object literal for the '<em><b>Hide Back Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_STYLE__HIDE_BACK_BUTTON = eINSTANCE.getNavigationStyle_HideBackButton();

		/**
		 * The meta object literal for the '<em><b>Title Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_STYLE__TITLE_MODE = eINSTANCE.getNavigationStyle_TitleMode();

		/**
		 * The meta object literal for the '<em><b>Hide Tool Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_STYLE__HIDE_TOOL_BAR = eINSTANCE.getNavigationStyle_HideToolBar();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.NavigationEventImpl <em>Navigation Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.NavigationEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getNavigationEvent()
		 * @generated
		 */
		EClass NAVIGATION_EVENT = eINSTANCE.getNavigationEvent();

		/**
		 * The meta object literal for the '<em><b>On Title Mode Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_EVENT__ON_TITLE_MODE_CHANGE = eINSTANCE.getNavigationEvent_OnTitleModeChange();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ContainerItemImpl <em>Container Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ContainerItemImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getContainerItem()
		 * @generated
		 */
		EClass CONTAINER_ITEM = eINSTANCE.getContainerItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ITEM__VALUE = eINSTANCE.getContainerItem_Value();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ITEM__ICON = eINSTANCE.getContainerItem_Icon();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ITEM__ACTION = eINSTANCE.getContainerItem_Action();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ContainerItemsImpl <em>Container Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ContainerItemsImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getContainerItems()
		 * @generated
		 */
		EClass CONTAINER_ITEMS = eINSTANCE.getContainerItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ITEMS__ITEMS = eINSTANCE.getContainerItems_Items();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ITEMS__LABEL = eINSTANCE.getContainerItems_Label();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.StartOpImpl <em>Start Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.StartOpImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStartOp()
		 * @generated
		 */
		EClass START_OP = eINSTANCE.getStartOp();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.EndOpImpl <em>End Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.EndOpImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEndOp()
		 * @generated
		 */
		EClass END_OP = eINSTANCE.getEndOp();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.WorkFlowImpl <em>Work Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.WorkFlowImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getWorkFlow()
		 * @generated
		 */
		EClass WORK_FLOW = eINSTANCE.getWorkFlow();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__FUNCTION = eINSTANCE.getWorkFlow_Function();

		/**
		 * The meta object literal for the '<em><b>Flow Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_FLOW__FLOW_NAME = eINSTANCE.getWorkFlow_FlowName();

		/**
		 * The meta object literal for the '<em><b>Flowline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__FLOWLINE = eINSTANCE.getWorkFlow_Flowline();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_FLOW__TYPE = eINSTANCE.getWorkFlow_Type();

		/**
		 * The meta object literal for the '<em><b>Workparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__WORKPARAMETER = eINSTANCE.getWorkFlow_Workparameter();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.CheckEqualImpl <em>Check Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.CheckEqualImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCheckEqual()
		 * @generated
		 */
		EClass CHECK_EQUAL = eINSTANCE.getCheckEqual();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.FlowLineImpl <em>Flow Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.FlowLineImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFlowLine()
		 * @generated
		 */
		EClass FLOW_LINE = eINSTANCE.getFlowLine();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_LINE__SOURCE = eINSTANCE.getFlowLine_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_LINE__TARGET = eINSTANCE.getFlowLine_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LINE__TYPE = eINSTANCE.getFlowLine_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LINE__VALUE = eINSTANCE.getFlowLine_Value();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ExpressionImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__PARAMETER = eINSTANCE.getExpression_Parameter();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__CONDITION = eINSTANCE.getExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__UNION = eINSTANCE.getExpression_Union();

		/**
		 * The meta object literal for the '<em><b>Express Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESS_TEXT = eINSTANCE.getExpression_ExpressText();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.FunctionImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Function Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__FUNCTION_TYPE = eINSTANCE.getFunction_FunctionType();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__OPERATION = eINSTANCE.getFunction_Operation();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__WORKFLOW = eINSTANCE.getFunction_Workflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ForEachImpl <em>For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ForEachImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getForEach()
		 * @generated
		 */
		EClass FOR_EACH = eINSTANCE.getForEach();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__ITEM = eINSTANCE.getForEach_Item();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__EXPRESSION = eINSTANCE.getForEach_Expression();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__ARRAY = eINSTANCE.getForEach_Array();

		/**
		 * The meta object literal for the '<em><b>Array Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__ARRAY_TYPE = eINSTANCE.getForEach_ArrayType();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.IFImpl <em>IF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.IFImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getIF()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIF();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__EXPRESSION = eINSTANCE.getIF_Expression();

		/**
		 * The meta object literal for the '<em><b>Auto Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__AUTO_EXPRESSION = eINSTANCE.getIF_AutoExpression();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.CallFunImpl <em>Call Fun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.CallFunImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCallFun()
		 * @generated
		 */
		EClass CALL_FUN = eINSTANCE.getCallFun();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_FUN__NAME = eINSTANCE.getCallFun_Name();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SwiperWidgetImpl <em>Swiper Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SwiperWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSwiperWidget()
		 * @generated
		 */
		EClass SWIPER_WIDGET = eINSTANCE.getSwiperWidget();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_WIDGET__CONTROLLER = eINSTANCE.getSwiperWidget_Controller();

		/**
		 * The meta object literal for the '<em><b>Swiperevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIPER_WIDGET__SWIPEREVENT = eINSTANCE.getSwiperWidget_Swiperevent();

		/**
		 * The meta object literal for the '<em><b>Swiperstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIPER_WIDGET__SWIPERSTYLE = eINSTANCE.getSwiperWidget_Swiperstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SwiperStyleImpl <em>Swiper Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SwiperStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSwiperStyle()
		 * @generated
		 */
		EClass SWIPER_STYLE = eINSTANCE.getSwiperStyle();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__INDEX = eINSTANCE.getSwiperStyle_Index();

		/**
		 * The meta object literal for the '<em><b>Auto Play</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__AUTO_PLAY = eINSTANCE.getSwiperStyle_AutoPlay();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__INTERVAL = eINSTANCE.getSwiperStyle_Interval();

		/**
		 * The meta object literal for the '<em><b>Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__INDICATOR = eINSTANCE.getSwiperStyle_Indicator();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__LOOP = eINSTANCE.getSwiperStyle_Loop();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__DURATION = eINSTANCE.getSwiperStyle_Duration();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__VERTICAL = eINSTANCE.getSwiperStyle_Vertical();

		/**
		 * The meta object literal for the '<em><b>Item Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__ITEM_SPACE = eINSTANCE.getSwiperStyle_ItemSpace();

		/**
		 * The meta object literal for the '<em><b>Display Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_STYLE__DISPLAY_MODE = eINSTANCE.getSwiperStyle_DisplayMode();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SwiperEventImpl <em>Swiper Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SwiperEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSwiperEvent()
		 * @generated
		 */
		EClass SWIPER_EVENT = eINSTANCE.getSwiperEvent();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPER_EVENT__ON_CHANGE = eINSTANCE.getSwiperEvent_OnChange();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.OperationLibrayImpl <em>Operation Libray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.OperationLibrayImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getOperationLibray()
		 * @generated
		 */
		EClass OPERATION_LIBRAY = eINSTANCE.getOperationLibray();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_LIBRAY__NAME = eINSTANCE.getOperationLibray_Name();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_LIBRAY__WORKFLOWS = eINSTANCE.getOperationLibray_Workflows();

		/**
		 * The meta object literal for the '<em><b>Projectparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_LIBRAY__PROJECTPARAMETERS = eINSTANCE.getOperationLibray_Projectparameters();

		/**
		 * The meta object literal for the '<em><b>Domainmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_LIBRAY__DOMAINMODEL = eINSTANCE.getOperationLibray_Domainmodel();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.PageRefrenceImpl <em>Page Refrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.PageRefrenceImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPageRefrence()
		 * @generated
		 */
		EClass PAGE_REFRENCE = eINSTANCE.getPageRefrence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_REFRENCE__NAME = eINSTANCE.getPageRefrence_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_REFRENCE__PARAMETER = eINSTANCE.getPageRefrence_Parameter();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_REFRENCE__IF = eINSTANCE.getPageRefrence_If();

		/**
		 * The meta object literal for the '<em><b>Foreach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_REFRENCE__FOREACH = eINSTANCE.getPageRefrence_Foreach();

		/**
		 * The meta object literal for the '<em><b>Pageevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_REFRENCE__PAGEEVENT = eINSTANCE.getPageRefrence_Pageevent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TabsContainerImpl <em>Tabs Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TabsContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabsContainer()
		 * @generated
		 */
		EClass TABS_CONTAINER = eINSTANCE.getTabsContainer();

		/**
		 * The meta object literal for the '<em><b>Bar Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_CONTAINER__BAR_POSITION = eINSTANCE.getTabsContainer_BarPosition();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_CONTAINER__INDEX = eINSTANCE.getTabsContainer_Index();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABS_CONTAINER__TABS = eINSTANCE.getTabsContainer_Tabs();

		/**
		 * The meta object literal for the '<em><b>Tabsevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABS_CONTAINER__TABSEVENT = eINSTANCE.getTabsContainer_Tabsevent();

		/**
		 * The meta object literal for the '<em><b>Tabsstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABS_CONTAINER__TABSSTYLE = eINSTANCE.getTabsContainer_Tabsstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TabContentImpl <em>Tab Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TabContentImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabContent()
		 * @generated
		 */
		EClass TAB_CONTENT = eINSTANCE.getTabContent();

		/**
		 * The meta object literal for the '<em><b>Tab Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_CONTENT__TAB_BAR = eINSTANCE.getTabContent_TabBar();

		/**
		 * The meta object literal for the '<em><b>Tabcontentstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_CONTENT__TABCONTENTSTYLE = eINSTANCE.getTabContent_Tabcontentstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TabsStyleImpl <em>Tabs Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TabsStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabsStyle()
		 * @generated
		 */
		EClass TABS_STYLE = eINSTANCE.getTabsStyle();

		/**
		 * The meta object literal for the '<em><b>Scrollable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_STYLE__SCROLLABLE = eINSTANCE.getTabsStyle_Scrollable();

		/**
		 * The meta object literal for the '<em><b>Bar Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_STYLE__BAR_MODE = eINSTANCE.getTabsStyle_BarMode();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_STYLE__VERTICAL = eINSTANCE.getTabsStyle_Vertical();

		/**
		 * The meta object literal for the '<em><b>Bar Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_STYLE__BAR_WIDTH = eINSTANCE.getTabsStyle_BarWidth();

		/**
		 * The meta object literal for the '<em><b>Bar Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_STYLE__BAR_HEIGHT = eINSTANCE.getTabsStyle_BarHeight();

		/**
		 * The meta object literal for the '<em><b>Animation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_STYLE__ANIMATION_DURATION = eINSTANCE.getTabsStyle_AnimationDuration();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TabItemImpl <em>Tab Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TabItemImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabItem()
		 * @generated
		 */
		EClass TAB_ITEM = eINSTANCE.getTabItem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_ITEM__TITLE = eINSTANCE.getTabItem_Title();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_ITEM__IMAGE = eINSTANCE.getTabItem_Image();

		/**
		 * The meta object literal for the '<em><b>Selected Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_ITEM__SELECTED_IMAGE = eINSTANCE.getTabItem_SelectedImage();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TabsEventImpl <em>Tabs Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TabsEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabsEvent()
		 * @generated
		 */
		EClass TABS_EVENT = eINSTANCE.getTabsEvent();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS_EVENT__ON_CHANGE = eINSTANCE.getTabsEvent_OnChange();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.StackContainerImpl <em>Stack Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.StackContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStackContainer()
		 * @generated
		 */
		EClass STACK_CONTAINER = eINSTANCE.getStackContainer();

		/**
		 * The meta object literal for the '<em><b>Stackevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_CONTAINER__STACKEVENT = eINSTANCE.getStackContainer_Stackevent();

		/**
		 * The meta object literal for the '<em><b>Stackstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_CONTAINER__STACKSTYLE = eINSTANCE.getStackContainer_Stackstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.StackEventImpl <em>Stack Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.StackEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStackEvent()
		 * @generated
		 */
		EClass STACK_EVENT = eINSTANCE.getStackEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.StackStyleImpl <em>Stack Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.StackStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getStackStyle()
		 * @generated
		 */
		EClass STACK_STYLE = eINSTANCE.getStackStyle();

		/**
		 * The meta object literal for the '<em><b>Align Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_STYLE__ALIGN_CONTENT = eINSTANCE.getStackStyle_AlignContent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ScrollContainerImpl <em>Scroll Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ScrollContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getScrollContainer()
		 * @generated
		 */
		EClass SCROLL_CONTAINER = eINSTANCE.getScrollContainer();

		/**
		 * The meta object literal for the '<em><b>Scrollevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCROLL_CONTAINER__SCROLLEVENT = eINSTANCE.getScrollContainer_Scrollevent();

		/**
		 * The meta object literal for the '<em><b>Scrollstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCROLL_CONTAINER__SCROLLSTYLE = eINSTANCE.getScrollContainer_Scrollstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ScrollEventImpl <em>Scroll Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ScrollEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getScrollEvent()
		 * @generated
		 */
		EClass SCROLL_EVENT = eINSTANCE.getScrollEvent();

		/**
		 * The meta object literal for the '<em><b>On Scroll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_EVENT__ON_SCROLL = eINSTANCE.getScrollEvent_OnScroll();

		/**
		 * The meta object literal for the '<em><b>On Scroll Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_EVENT__ON_SCROLL_EDGE = eINSTANCE.getScrollEvent_OnScrollEdge();

		/**
		 * The meta object literal for the '<em><b>On Scroll End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_EVENT__ON_SCROLL_END = eINSTANCE.getScrollEvent_OnScrollEnd();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ScrollStyleImpl <em>Scroll Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ScrollStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getScrollStyle()
		 * @generated
		 */
		EClass SCROLL_STYLE = eINSTANCE.getScrollStyle();

		/**
		 * The meta object literal for the '<em><b>Scrollable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_STYLE__SCROLLABLE = eINSTANCE.getScrollStyle_Scrollable();

		/**
		 * The meta object literal for the '<em><b>Scroll Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_STYLE__SCROLL_BAR = eINSTANCE.getScrollStyle_ScrollBar();

		/**
		 * The meta object literal for the '<em><b>Scroll Bar Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_STYLE__SCROLL_BAR_COLOR = eINSTANCE.getScrollStyle_ScrollBarColor();

		/**
		 * The meta object literal for the '<em><b>Scroll Bar Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_STYLE__SCROLL_BAR_WIDTH = eINSTANCE.getScrollStyle_ScrollBarWidth();

		/**
		 * The meta object literal for the '<em><b>Edge Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL_STYLE__EDGE_EFFECT = eINSTANCE.getScrollStyle_EdgeEffect();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ScrollerImpl <em>Scroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ScrollerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getScroller()
		 * @generated
		 */
		EClass SCROLLER = eINSTANCE.getScroller();

		/**
		 * The meta object literal for the '<em><b>Assgin Scroll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__ASSGIN_SCROLL = eINSTANCE.getScroller_AssginScroll();

		/**
		 * The meta object literal for the '<em><b>Scroll Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__SCROLL_TYPE = eINSTANCE.getScroller_ScrollType();

		/**
		 * The meta object literal for the '<em><b>XOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__XOFFSET = eINSTANCE.getScroller_XOffset();

		/**
		 * The meta object literal for the '<em><b>YOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__YOFFSET = eINSTANCE.getScroller_YOffset();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__DURATION = eINSTANCE.getScroller_Duration();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__CURVE = eINSTANCE.getScroller_Curve();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__EDGE = eINSTANCE.getScroller_Edge();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__NEXT = eINSTANCE.getScroller_Next();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__DIRECTION = eINSTANCE.getScroller_Direction();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLLER__INDEX = eINSTANCE.getScroller_Index();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ToggleWidgetImpl <em>Toggle Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ToggleWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getToggleWidget()
		 * @generated
		 */
		EClass TOGGLE_WIDGET = eINSTANCE.getToggleWidget();

		/**
		 * The meta object literal for the '<em><b>Is On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_WIDGET__IS_ON = eINSTANCE.getToggleWidget_IsOn();

		/**
		 * The meta object literal for the '<em><b>Toggle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_WIDGET__TOGGLE_TYPE = eINSTANCE.getToggleWidget_ToggleType();

		/**
		 * The meta object literal for the '<em><b>Toggleevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOGGLE_WIDGET__TOGGLEEVENT = eINSTANCE.getToggleWidget_Toggleevent();

		/**
		 * The meta object literal for the '<em><b>Togglestyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOGGLE_WIDGET__TOGGLESTYLE = eINSTANCE.getToggleWidget_Togglestyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ToggleEventImpl <em>Toggle Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ToggleEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getToggleEvent()
		 * @generated
		 */
		EClass TOGGLE_EVENT = eINSTANCE.getToggleEvent();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_EVENT__ON_CHANGE = eINSTANCE.getToggleEvent_OnChange();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ToggleStyleImpl <em>Toggle Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ToggleStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getToggleStyle()
		 * @generated
		 */
		EClass TOGGLE_STYLE = eINSTANCE.getToggleStyle();

		/**
		 * The meta object literal for the '<em><b>Selected Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_STYLE__SELECTED_COLOR = eINSTANCE.getToggleStyle_SelectedColor();

		/**
		 * The meta object literal for the '<em><b>Switch Point Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_STYLE__SWITCH_POINT_COLOR = eINSTANCE.getToggleStyle_SwitchPointColor();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TimePickerWidgetImpl <em>Time Picker Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TimePickerWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTimePickerWidget()
		 * @generated
		 */
		EClass TIME_PICKER_WIDGET = eINSTANCE.getTimePickerWidget();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PICKER_WIDGET__SELECTED = eINSTANCE.getTimePickerWidget_Selected();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PICKER_WIDGET__START = eINSTANCE.getTimePickerWidget_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PICKER_WIDGET__END = eINSTANCE.getTimePickerWidget_End();

		/**
		 * The meta object literal for the '<em><b>Timepickerevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PICKER_WIDGET__TIMEPICKEREVENT = eINSTANCE.getTimePickerWidget_Timepickerevent();

		/**
		 * The meta object literal for the '<em><b>Timepickerstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PICKER_WIDGET__TIMEPICKERSTYLE = eINSTANCE.getTimePickerWidget_Timepickerstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TimePickerEventImpl <em>Time Picker Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TimePickerEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTimePickerEvent()
		 * @generated
		 */
		EClass TIME_PICKER_EVENT = eINSTANCE.getTimePickerEvent();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PICKER_EVENT__ON_CHANGE = eINSTANCE.getTimePickerEvent_OnChange();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TimePickerStyleImpl <em>Time Picker Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TimePickerStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTimePickerStyle()
		 * @generated
		 */
		EClass TIME_PICKER_STYLE = eINSTANCE.getTimePickerStyle();

		/**
		 * The meta object literal for the '<em><b>Use Military Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PICKER_STYLE__USE_MILITARY_TIME = eINSTANCE.getTimePickerStyle_UseMilitaryTime();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.DatePickerWidgetImpl <em>Date Picker Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.DatePickerWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDatePickerWidget()
		 * @generated
		 */
		EClass DATE_PICKER_WIDGET = eINSTANCE.getDatePickerWidget();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PICKER_WIDGET__SELECTED = eINSTANCE.getDatePickerWidget_Selected();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PICKER_WIDGET__START = eINSTANCE.getDatePickerWidget_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PICKER_WIDGET__END = eINSTANCE.getDatePickerWidget_End();

		/**
		 * The meta object literal for the '<em><b>Datepickerevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_PICKER_WIDGET__DATEPICKEREVENT = eINSTANCE.getDatePickerWidget_Datepickerevent();

		/**
		 * The meta object literal for the '<em><b>Datepickerstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_PICKER_WIDGET__DATEPICKERSTYLE = eINSTANCE.getDatePickerWidget_Datepickerstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.DatePickerEventImpl <em>Date Picker Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.DatePickerEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDatePickerEvent()
		 * @generated
		 */
		EClass DATE_PICKER_EVENT = eINSTANCE.getDatePickerEvent();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PICKER_EVENT__ON_CHANGE = eINSTANCE.getDatePickerEvent_OnChange();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.DatePickerStyleImpl <em>Date Picker Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.DatePickerStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDatePickerStyle()
		 * @generated
		 */
		EClass DATE_PICKER_STYLE = eINSTANCE.getDatePickerStyle();

		/**
		 * The meta object literal for the '<em><b>Lunar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PICKER_STYLE__LUNAR = eINSTANCE.getDatePickerStyle_Lunar();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextPickerWidgetImpl <em>Text Picker Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextPickerWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextPickerWidget()
		 * @generated
		 */
		EClass TEXT_PICKER_WIDGET = eINSTANCE.getTextPickerWidget();

		/**
		 * The meta object literal for the '<em><b>Textpickerevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PICKER_WIDGET__TEXTPICKEREVENT = eINSTANCE.getTextPickerWidget_Textpickerevent();

		/**
		 * The meta object literal for the '<em><b>Textpickerstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PICKER_WIDGET__TEXTPICKERSTYLE = eINSTANCE.getTextPickerWidget_Textpickerstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextPickerEventImpl <em>Text Picker Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextPickerEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextPickerEvent()
		 * @generated
		 */
		EClass TEXT_PICKER_EVENT = eINSTANCE.getTextPickerEvent();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PICKER_EVENT__ON_CHANGE = eINSTANCE.getTextPickerEvent_OnChange();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TextPickerStyleImpl <em>Text Picker Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TextPickerStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTextPickerStyle()
		 * @generated
		 */
		EClass TEXT_PICKER_STYLE = eINSTANCE.getTextPickerStyle();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PICKER_STYLE__RANGE = eINSTANCE.getTextPickerStyle_Range();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PICKER_STYLE__SELECTED = eINSTANCE.getTextPickerStyle_Selected();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PICKER_STYLE__VALUE = eINSTANCE.getTextPickerStyle_Value();

		/**
		 * The meta object literal for the '<em><b>Default Picker Item Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PICKER_STYLE__DEFAULT_PICKER_ITEM_HEIGHT = eINSTANCE
				.getTextPickerStyle_DefaultPickerItemHeight();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.DividerWidgetImpl <em>Divider Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.DividerWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDividerWidget()
		 * @generated
		 */
		EClass DIVIDER_WIDGET = eINSTANCE.getDividerWidget();

		/**
		 * The meta object literal for the '<em><b>Dividerstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVIDER_WIDGET__DIVIDERSTYLE = eINSTANCE.getDividerWidget_Dividerstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.DividerStyleImpl <em>Divider Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.DividerStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDividerStyle()
		 * @generated
		 */
		EClass DIVIDER_STYLE = eINSTANCE.getDividerStyle();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVIDER_STYLE__VERTICAL = eINSTANCE.getDividerStyle_Vertical();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVIDER_STYLE__COLOR = eINSTANCE.getDividerStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVIDER_STYLE__STROKE_WIDTH = eINSTANCE.getDividerStyle_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Line Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVIDER_STYLE__LINE_CAP = eINSTANCE.getDividerStyle_LineCap();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.CustomDialogContainerImpl <em>Custom Dialog Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.CustomDialogContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCustomDialogContainer()
		 * @generated
		 */
		EClass CUSTOM_DIALOG_CONTAINER = eINSTANCE.getCustomDialogContainer();

		/**
		 * The meta object literal for the '<em><b>Customdialogstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGSTYLE = eINSTANCE.getCustomDialogContainer_Customdialogstyle();

		/**
		 * The meta object literal for the '<em><b>Customdialogevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_DIALOG_CONTAINER__CUSTOMDIALOGEVENT = eINSTANCE.getCustomDialogContainer_Customdialogevent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.CustomDialogStyleImpl <em>Custom Dialog Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.CustomDialogStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCustomDialogStyle()
		 * @generated
		 */
		EClass CUSTOM_DIALOG_STYLE = eINSTANCE.getCustomDialogStyle();

		/**
		 * The meta object literal for the '<em><b>Auto Cancel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DIALOG_STYLE__AUTO_CANCEL = eINSTANCE.getCustomDialogStyle_AutoCancel();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DIALOG_STYLE__ALIGNMENT = eINSTANCE.getCustomDialogStyle_Alignment();

		/**
		 * The meta object literal for the '<em><b>Offsetx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DIALOG_STYLE__OFFSETX = eINSTANCE.getCustomDialogStyle_Offsetx();

		/**
		 * The meta object literal for the '<em><b>Offsety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DIALOG_STYLE__OFFSETY = eINSTANCE.getCustomDialogStyle_Offsety();

		/**
		 * The meta object literal for the '<em><b>Custom Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DIALOG_STYLE__CUSTOM_STYLE = eINSTANCE.getCustomDialogStyle_CustomStyle();

		/**
		 * The meta object literal for the '<em><b>Grid Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DIALOG_STYLE__GRID_COUNT = eINSTANCE.getCustomDialogStyle_GridCount();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.CustomDialogEventImpl <em>Custom Dialog Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.CustomDialogEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCustomDialogEvent()
		 * @generated
		 */
		EClass CUSTOM_DIALOG_EVENT = eINSTANCE.getCustomDialogEvent();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DIALOG_EVENT__CANCEL = eINSTANCE.getCustomDialogEvent_Cancel();

		/**
		 * The meta object literal for the '<em><b>Confirm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DIALOG_EVENT__CONFIRM = eINSTANCE.getCustomDialogEvent_Confirm();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.OpenDialogImpl <em>Open Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.OpenDialogImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getOpenDialog()
		 * @generated
		 */
		EClass OPEN_DIALOG = eINSTANCE.getOpenDialog();

		/**
		 * The meta object literal for the '<em><b>Assign Dialog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DIALOG__ASSIGN_DIALOG = eINSTANCE.getOpenDialog_AssignDialog();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.CloseDialogImpl <em>Close Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.CloseDialogImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getCloseDialog()
		 * @generated
		 */
		EClass CLOSE_DIALOG = eINSTANCE.getCloseDialog();

		/**
		 * The meta object literal for the '<em><b>Assign Dialog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSE_DIALOG__ASSIGN_DIALOG = eINSTANCE.getCloseDialog_AssignDialog();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.DataPreferencesImpl <em>Data Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.DataPreferencesImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDataPreferences()
		 * @generated
		 */
		EClass DATA_PREFERENCES = eINSTANCE.getDataPreferences();

		/**
		 * The meta object literal for the '<em><b>Preferences Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PREFERENCES__PREFERENCES_TYPE = eINSTANCE.getDataPreferences_PreferencesType();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PREFERENCES__PREFERENCES = eINSTANCE.getDataPreferences_Preferences();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TerminateSelfImpl <em>Terminate Self</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TerminateSelfImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTerminateSelf()
		 * @generated
		 */
		EClass TERMINATE_SELF = eINSTANCE.getTerminateSelf();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SetTimeOutImpl <em>Set Time Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SetTimeOutImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSetTimeOut()
		 * @generated
		 */
		EClass SET_TIME_OUT = eINSTANCE.getSetTimeOut();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TIME_OUT__HANDLER = eINSTANCE.getSetTimeOut_Handler();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TIME_OUT__DELAY = eINSTANCE.getSetTimeOut_Delay();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ClearTimeOutImpl <em>Clear Time Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ClearTimeOutImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getClearTimeOut()
		 * @generated
		 */
		EClass CLEAR_TIME_OUT = eINSTANCE.getClearTimeOut();

		/**
		 * The meta object literal for the '<em><b>Timeout ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR_TIME_OUT__TIMEOUT_ID = eINSTANCE.getClearTimeOut_TimeoutID();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ShowToastOptionsImpl <em>Show Toast Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ShowToastOptionsImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getShowToastOptions()
		 * @generated
		 */
		EClass SHOW_TOAST_OPTIONS = eINSTANCE.getShowToastOptions();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TOAST_OPTIONS__MESSAGE = eINSTANCE.getShowToastOptions_Message();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TOAST_OPTIONS__DURATION = eINSTANCE.getShowToastOptions_Duration();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_TOAST_OPTIONS__BOTTOM = eINSTANCE.getShowToastOptions_Bottom();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.DomainModelImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__NAME = eINSTANCE.getDomainModel_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__LABEL = eINSTANCE.getDomainModel_Label();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__ENTITY = eINSTANCE.getDomainModel_Entity();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.EntityRefrenceImpl <em>Entity Refrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.EntityRefrenceImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getEntityRefrence()
		 * @generated
		 */
		EClass ENTITY_REFRENCE = eINSTANCE.getEntityRefrence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_REFRENCE__NAME = eINSTANCE.getEntityRefrence_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_REFRENCE__TYPE = eINSTANCE.getEntityRefrence_Type();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_REFRENCE__ENTITY = eINSTANCE.getEntityRefrence_Entity();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GridContainerImpl <em>Grid Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GridContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridContainer()
		 * @generated
		 */
		EClass GRID_CONTAINER = eINSTANCE.getGridContainer();

		/**
		 * The meta object literal for the '<em><b>Columns Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CONTAINER__COLUMNS_TEMPLATE = eINSTANCE.getGridContainer_ColumnsTemplate();

		/**
		 * The meta object literal for the '<em><b>Rows Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CONTAINER__ROWS_TEMPLATE = eINSTANCE.getGridContainer_RowsTemplate();

		/**
		 * The meta object literal for the '<em><b>Columns Gap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CONTAINER__COLUMNS_GAP = eINSTANCE.getGridContainer_ColumnsGap();

		/**
		 * The meta object literal for the '<em><b>Rows Gap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CONTAINER__ROWS_GAP = eINSTANCE.getGridContainer_RowsGap();

		/**
		 * The meta object literal for the '<em><b>Gridevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_CONTAINER__GRIDEVENT = eINSTANCE.getGridContainer_Gridevent();

		/**
		 * The meta object literal for the '<em><b>Gridstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_CONTAINER__GRIDSTYLE = eINSTANCE.getGridContainer_Gridstyle();

		/**
		 * The meta object literal for the '<em><b>Griditemcontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_CONTAINER__GRIDITEMCONTAINER = eINSTANCE.getGridContainer_Griditemcontainer();

		/**
		 * The meta object literal for the '<em><b>Cached Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CONTAINER__CACHED_COUNT = eINSTANCE.getGridContainer_CachedCount();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GridEventImpl <em>Grid Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GridEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridEvent()
		 * @generated
		 */
		EClass GRID_EVENT = eINSTANCE.getGridEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GridStyleImpl <em>Grid Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GridStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridStyle()
		 * @generated
		 */
		EClass GRID_STYLE = eINSTANCE.getGridStyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ChangeIndexImpl <em>Change Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ChangeIndexImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getChangeIndex()
		 * @generated
		 */
		EClass CHANGE_INDEX = eINSTANCE.getChangeIndex();

		/**
		 * The meta object literal for the '<em><b>Tabs ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_INDEX__TABS_ID = eINSTANCE.getChangeIndex_TabsID();

		/**
		 * The meta object literal for the '<em><b>Tab ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_INDEX__TAB_ID = eINSTANCE.getChangeIndex_TabID();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.TabContentStyleImpl <em>Tab Content Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.TabContentStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getTabContentStyle()
		 * @generated
		 */
		EClass TAB_CONTENT_STYLE = eINSTANCE.getTabContentStyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GridItemContainerImpl <em>Grid Item Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GridItemContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridItemContainer()
		 * @generated
		 */
		EClass GRID_ITEM_CONTAINER = eINSTANCE.getGridItemContainer();

		/**
		 * The meta object literal for the '<em><b>Row Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM_CONTAINER__ROW_START = eINSTANCE.getGridItemContainer_RowStart();

		/**
		 * The meta object literal for the '<em><b>Row End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM_CONTAINER__ROW_END = eINSTANCE.getGridItemContainer_RowEnd();

		/**
		 * The meta object literal for the '<em><b>Column Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM_CONTAINER__COLUMN_START = eINSTANCE.getGridItemContainer_ColumnStart();

		/**
		 * The meta object literal for the '<em><b>Column End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM_CONTAINER__COLUMN_END = eINSTANCE.getGridItemContainer_ColumnEnd();

		/**
		 * The meta object literal for the '<em><b>Force Rebuild</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_ITEM_CONTAINER__FORCE_REBUILD = eINSTANCE.getGridItemContainer_ForceRebuild();

		/**
		 * The meta object literal for the '<em><b>Griditemstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_ITEM_CONTAINER__GRIDITEMSTYLE = eINSTANCE.getGridItemContainer_Griditemstyle();

		/**
		 * The meta object literal for the '<em><b>Griditemevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_ITEM_CONTAINER__GRIDITEMEVENT = eINSTANCE.getGridItemContainer_Griditemevent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SearchWidgetImpl <em>Search Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SearchWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSearchWidget()
		 * @generated
		 */
		EClass SEARCH_WIDGET = eINSTANCE.getSearchWidget();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_WIDGET__HINT = eINSTANCE.getSearchWidget_Hint();

		/**
		 * The meta object literal for the '<em><b>Searchbutton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_WIDGET__SEARCHBUTTON = eINSTANCE.getSearchWidget_Searchbutton();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_WIDGET__ICON = eINSTANCE.getSearchWidget_Icon();

		/**
		 * The meta object literal for the '<em><b>Searchevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_WIDGET__SEARCHEVENT = eINSTANCE.getSearchWidget_Searchevent();

		/**
		 * The meta object literal for the '<em><b>Searchstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_WIDGET__SEARCHSTYLE = eINSTANCE.getSearchWidget_Searchstyle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_WIDGET__VALUE = eINSTANCE.getSearchWidget_Value();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_WIDGET__PLACEHOLDER = eINSTANCE.getSearchWidget_Placeholder();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SearchEventImpl <em>Search Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SearchEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSearchEvent()
		 * @generated
		 */
		EClass SEARCH_EVENT = eINSTANCE.getSearchEvent();

		/**
		 * The meta object literal for the '<em><b>On Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_EVENT__ON_SEARCH = eINSTANCE.getSearchEvent_OnSearch();

		/**
		 * The meta object literal for the '<em><b>On Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_EVENT__ON_CHANGE = eINSTANCE.getSearchEvent_OnChange();

		/**
		 * The meta object literal for the '<em><b>On Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_EVENT__ON_TRANSLATE = eINSTANCE.getSearchEvent_OnTranslate();

		/**
		 * The meta object literal for the '<em><b>On Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_EVENT__ON_SHARE = eINSTANCE.getSearchEvent_OnShare();

		/**
		 * The meta object literal for the '<em><b>On Submit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_EVENT__ON_SUBMIT = eINSTANCE.getSearchEvent_OnSubmit();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.SearchStyleImpl <em>Search Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.SearchStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getSearchStyle()
		 * @generated
		 */
		EClass SEARCH_STYLE = eINSTANCE.getSearchStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STYLE__COLOR = eINSTANCE.getSearchStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Placeholdercolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STYLE__PLACEHOLDERCOLOR = eINSTANCE.getSearchStyle_Placeholdercolor();

		/**
		 * The meta object literal for the '<em><b>Caretcolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STYLE__CARETCOLOR = eINSTANCE.getSearchStyle_Caretcolor();

		/**
		 * The meta object literal for the '<em><b>Placeholder Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STYLE__PLACEHOLDER_SIZE = eINSTANCE.getSearchStyle_PlaceholderSize();

		/**
		 * The meta object literal for the '<em><b>Placeholder Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STYLE__PLACEHOLDER_WEIGHT = eINSTANCE.getSearchStyle_PlaceholderWeight();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.BlankWidgetImpl <em>Blank Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.BlankWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getBlankWidget()
		 * @generated
		 */
		EClass BLANK_WIDGET = eINSTANCE.getBlankWidget();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLANK_WIDGET__MIN = eINSTANCE.getBlankWidget_Min();

		/**
		 * The meta object literal for the '<em><b>Blankstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLANK_WIDGET__BLANKSTYLE = eINSTANCE.getBlankWidget_Blankstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.BlankStyleImpl <em>Blank Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.BlankStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getBlankStyle()
		 * @generated
		 */
		EClass BLANK_STYLE = eINSTANCE.getBlankStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLANK_STYLE__COLOR = eINSTANCE.getBlankStyle_Color();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ProgressWidgetImpl <em>Progress Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ProgressWidgetImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getProgressWidget()
		 * @generated
		 */
		EClass PROGRESS_WIDGET = eINSTANCE.getProgressWidget();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_WIDGET__VALUE = eINSTANCE.getProgressWidget_Value();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_WIDGET__TOTAL = eINSTANCE.getProgressWidget_Total();

		/**
		 * The meta object literal for the '<em><b>Progress Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_WIDGET__PROGRESS_TYPE = eINSTANCE.getProgressWidget_ProgressType();

		/**
		 * The meta object literal for the '<em><b>Show Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_WIDGET__SHOW_TYPE = eINSTANCE.getProgressWidget_ShowType();

		/**
		 * The meta object literal for the '<em><b>Progressevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS_WIDGET__PROGRESSEVENT = eINSTANCE.getProgressWidget_Progressevent();

		/**
		 * The meta object literal for the '<em><b>Progressstyle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS_WIDGET__PROGRESSSTYLE = eINSTANCE.getProgressWidget_Progressstyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ProgressStyleImpl <em>Progress Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ProgressStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getProgressStyle()
		 * @generated
		 */
		EClass PROGRESS_STYLE = eINSTANCE.getProgressStyle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_STYLE__VALUE = eINSTANCE.getProgressStyle_Value();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_STYLE__STROKE_WIDTH = eINSTANCE.getProgressStyle_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Scale Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_STYLE__SCALE_COUNT = eINSTANCE.getProgressStyle_ScaleCount();

		/**
		 * The meta object literal for the '<em><b>Scale Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_STYLE__SCALE_WIDTH = eINSTANCE.getProgressStyle_ScaleWidth();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_STYLE__COLOR = eINSTANCE.getProgressStyle_Color();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.ProgressEventImpl <em>Progress Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.ProgressEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getProgressEvent()
		 * @generated
		 */
		EClass PROGRESS_EVENT = eINSTANCE.getProgressEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.LineContainerImpl <em>Line Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.LineContainerImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLineContainer()
		 * @generated
		 */
		EClass LINE_CONTAINER = eINSTANCE.getLineContainer();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_CONTAINER__WIDTH = eINSTANCE.getLineContainer_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_CONTAINER__HEIGHT = eINSTANCE.getLineContainer_Height();

		/**
		 * The meta object literal for the '<em><b>Lineevent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_CONTAINER__LINEEVENT = eINSTANCE.getLineContainer_Lineevent();

		/**
		 * The meta object literal for the '<em><b>Linestyle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_CONTAINER__LINESTYLE = eINSTANCE.getLineContainer_Linestyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.LineEventImpl <em>Line Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.LineEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLineEvent()
		 * @generated
		 */
		EClass LINE_EVENT = eINSTANCE.getLineEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.LineStyleImpl <em>Line Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.LineStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLineStyle()
		 * @generated
		 */
		EClass LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '<em><b>Start Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__START_POINT = eINSTANCE.getLineStyle_StartPoint();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__END_POINT = eINSTANCE.getLineStyle_EndPoint();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.WorkOperationImpl <em>Work Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.WorkOperationImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getWorkOperation()
		 * @generated
		 */
		EClass WORK_OPERATION = eINSTANCE.getWorkOperation();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_OPERATION__TITLE = eINSTANCE.getWorkOperation_Title();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GridItemStyleImpl <em>Grid Item Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GridItemStyleImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridItemStyle()
		 * @generated
		 */
		EClass GRID_ITEM_STYLE = eINSTANCE.getGridItemStyle();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.impl.GridItemEventImpl <em>Grid Item Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.impl.GridItemEventImpl
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getGridItemEvent()
		 * @generated
		 */
		EClass GRID_ITEM_EVENT = eINSTANCE.getGridItemEvent();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.DevicesType <em>Devices Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.DevicesType
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getDevicesType()
		 * @generated
		 */
		EEnum DEVICES_TYPE = eINSTANCE.getDevicesType();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.ExecuteType <em>Execute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.ExecuteType
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getExecuteType()
		 * @generated
		 */
		EEnum EXECUTE_TYPE = eINSTANCE.getExecuteType();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.HttpType <em>Http Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.HttpType
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getHttpType()
		 * @generated
		 */
		EEnum HTTP_TYPE = eINSTANCE.getHttpType();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.VariableType
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.PType <em>PType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.PType
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getPType()
		 * @generated
		 */
		EEnum PTYPE = eINSTANCE.getPType();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.LineType <em>Line Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.LineType
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getLineType()
		 * @generated
		 */
		EEnum LINE_TYPE = eINSTANCE.getLineType();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.RouteType <em>Route Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.RouteType
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getRouteType()
		 * @generated
		 */
		EEnum ROUTE_TYPE = eINSTANCE.getRouteType();

		/**
		 * The meta object literal for the '{@link arkuimodel.arkUIModel.UnionType <em>Union Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arkuimodel.arkUIModel.UnionType
		 * @see arkuimodel.arkUIModel.impl.ArkUIModelPackageImpl#getUnionType()
		 * @generated
		 */
		EEnum UNION_TYPE = eINSTANCE.getUnionType();

	}

} //ArkUIModelPackage
