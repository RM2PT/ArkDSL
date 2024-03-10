/**
 */
package arkuimodel.arkUIModel.impl;

import arkuimodel.arkUIModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArkUIModelFactoryImpl extends EFactoryImpl implements ArkUIModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArkUIModelFactory init() {
		try {
			ArkUIModelFactory theArkUIModelFactory = (ArkUIModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ArkUIModelPackage.eNS_URI);
			if (theArkUIModelFactory != null) {
				return theArkUIModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArkUIModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArkUIModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ArkUIModelPackage.GUI_MODEL:
			return createGUIModel();
		case ArkUIModelPackage.PAGE:
			return createPage();
		case ArkUIModelPackage.UI_LOGIC:
			return createUILogic();
		case ArkUIModelPackage.UI_DESIGN:
			return createUIDesign();
		case ArkUIModelPackage.PAGE_STRUCT:
			return createPageStruct();
		case ArkUIModelPackage.TEXT_WIDGET:
			return createTextWidget();
		case ArkUIModelPackage.BUTTON_WIDGET:
			return createButtonWidget();
		case ArkUIModelPackage.FLEX_CONTAINER:
			return createFlexContainer();
		case ArkUIModelPackage.STYLE_LIBRAY:
			return createStyleLibray();
		case ArkUIModelPackage.STYLE_CLASS:
			return createStyleClass();
		case ArkUIModelPackage.TEXT_INPUT_WIDGET:
			return createTextInputWidget();
		case ArkUIModelPackage.LIST_CONTAINER:
			return createListContainer();
		case ArkUIModelPackage.TEXT_STYLE:
			return createTextStyle();
		case ArkUIModelPackage.TEXT_INPUT_STYLE:
			return createTextInputStyle();
		case ArkUIModelPackage.PARAMETER:
			return createParameter();
		case ArkUIModelPackage.TYPE_CS:
			return createTypeCS();
		case ArkUIModelPackage.ROW_CONTAINER:
			return createRowContainer();
		case ArkUIModelPackage.COLUMN_CONTAINER:
			return createColumnContainer();
		case ArkUIModelPackage.BUTTON_STYLE:
			return createButtonStyle();
		case ArkUIModelPackage.FLEX_STYLE:
			return createFlexStyle();
		case ArkUIModelPackage.ROW_STYLE:
			return createRowStyle();
		case ArkUIModelPackage.COLUMN_STYLE:
			return createColumnStyle();
		case ArkUIModelPackage.LIST_STYLE:
			return createListStyle();
		case ArkUIModelPackage.LIST_ITEM_STYLE:
			return createListItemStyle();
		case ArkUIModelPackage.LIST_ITEM_CONTAINER:
			return createListItemContainer();
		case ArkUIModelPackage.IMAGE_WIDGET:
			return createImageWidget();
		case ArkUIModelPackage.IMAGE_STYLE:
			return createImageStyle();
		case ArkUIModelPackage.TRIGGER_EVENT:
			return createTriggerEvent();
		case ArkUIModelPackage.EVENT:
			return createEvent();
		case ArkUIModelPackage.PAGE_EVENT:
			return createPageEvent();
		case ArkUIModelPackage.COLUMN_EVENT:
			return createColumnEvent();
		case ArkUIModelPackage.ROW_EVENT:
			return createRowEvent();
		case ArkUIModelPackage.FLEX_EVENT:
			return createFlexEvent();
		case ArkUIModelPackage.IMAGE_EVENT:
			return createImageEvent();
		case ArkUIModelPackage.TEXT_EVENT:
			return createTextEvent();
		case ArkUIModelPackage.BUTTON_EVENT:
			return createButtonEvent();
		case ArkUIModelPackage.TEXT_INPUT_EVENT:
			return createTextInputEvent();
		case ArkUIModelPackage.LIST_EVENT:
			return createListEvent();
		case ArkUIModelPackage.LIST_ITEM_EVENT:
			return createListItemEvent();
		case ArkUIModelPackage.LOOP_OP:
			return createLoopOp();
		case ArkUIModelPackage.CASE_OP:
			return createCaseOp();
		case ArkUIModelPackage.HTTP_OPERATION:
			return createHttpOperation();
		case ArkUIModelPackage.GET_PARAMETER:
			return createGetParameter();
		case ArkUIModelPackage.SET_PARAMETER:
			return createSetParameter();
		case ArkUIModelPackage.ANIMATION_CLASS:
			return createAnimationClass();
		case ArkUIModelPackage.IMAGE_ANIMATOR:
			return createImageAnimator();
		case ArkUIModelPackage.IMAGES_ITEM:
			return createImagesItem();
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE:
			return createImageAnimatorStyle();
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT:
			return createImageAnimatorEvent();
		case ArkUIModelPackage.ROUTE_SKIP:
			return createRouteSkip();
		case ArkUIModelPackage.GET_ROUTE_VALUE:
			return createGetRouteValue();
		case ArkUIModelPackage.SEQ_OP:
			return createSeqOp();
		case ArkUIModelPackage.UI_STRUCT:
			return createUIStruct();
		case ArkUIModelPackage.ANIMATION_LIBRAY:
			return createAnimationLibray();
		case ArkUIModelPackage.ENTITY:
			return createEntity();
		case ArkUIModelPackage.ENTITY_ATTRIBUTE:
			return createEntityAttribute();
		case ArkUIModelPackage.ARRAY:
			return createArray();
		case ArkUIModelPackage.NAVIGATION_CONTAINER:
			return createNavigationContainer();
		case ArkUIModelPackage.NAVIGATION_STYLE:
			return createNavigationStyle();
		case ArkUIModelPackage.NAVIGATION_EVENT:
			return createNavigationEvent();
		case ArkUIModelPackage.CONTAINER_ITEM:
			return createContainerItem();
		case ArkUIModelPackage.CONTAINER_ITEMS:
			return createContainerItems();
		case ArkUIModelPackage.START_OP:
			return createStartOp();
		case ArkUIModelPackage.END_OP:
			return createEndOp();
		case ArkUIModelPackage.WORK_FLOW:
			return createWorkFlow();
		case ArkUIModelPackage.CHECK_EQUAL:
			return createCheckEqual();
		case ArkUIModelPackage.FLOW_LINE:
			return createFlowLine();
		case ArkUIModelPackage.EXPRESSION:
			return createExpression();
		case ArkUIModelPackage.FUNCTION:
			return createFunction();
		case ArkUIModelPackage.FOR_EACH:
			return createForEach();
		case ArkUIModelPackage.IF:
			return createIF();
		case ArkUIModelPackage.CALL_FUN:
			return createCallFun();
		case ArkUIModelPackage.SWIPER_WIDGET:
			return createSwiperWidget();
		case ArkUIModelPackage.SWIPER_STYLE:
			return createSwiperStyle();
		case ArkUIModelPackage.SWIPER_EVENT:
			return createSwiperEvent();
		case ArkUIModelPackage.OPERATION_LIBRAY:
			return createOperationLibray();
		case ArkUIModelPackage.PAGE_REFRENCE:
			return createPageRefrence();
		case ArkUIModelPackage.TABS_CONTAINER:
			return createTabsContainer();
		case ArkUIModelPackage.TAB_CONTENT:
			return createTabContent();
		case ArkUIModelPackage.TABS_STYLE:
			return createTabsStyle();
		case ArkUIModelPackage.TAB_ITEM:
			return createTabItem();
		case ArkUIModelPackage.TABS_EVENT:
			return createTabsEvent();
		case ArkUIModelPackage.STACK_CONTAINER:
			return createStackContainer();
		case ArkUIModelPackage.STACK_EVENT:
			return createStackEvent();
		case ArkUIModelPackage.STACK_STYLE:
			return createStackStyle();
		case ArkUIModelPackage.SCROLL_CONTAINER:
			return createScrollContainer();
		case ArkUIModelPackage.SCROLL_EVENT:
			return createScrollEvent();
		case ArkUIModelPackage.SCROLL_STYLE:
			return createScrollStyle();
		case ArkUIModelPackage.SCROLLER:
			return createScroller();
		case ArkUIModelPackage.TOGGLE_WIDGET:
			return createToggleWidget();
		case ArkUIModelPackage.TOGGLE_EVENT:
			return createToggleEvent();
		case ArkUIModelPackage.TOGGLE_STYLE:
			return createToggleStyle();
		case ArkUIModelPackage.TIME_PICKER_WIDGET:
			return createTimePickerWidget();
		case ArkUIModelPackage.TIME_PICKER_EVENT:
			return createTimePickerEvent();
		case ArkUIModelPackage.TIME_PICKER_STYLE:
			return createTimePickerStyle();
		case ArkUIModelPackage.DATE_PICKER_WIDGET:
			return createDatePickerWidget();
		case ArkUIModelPackage.DATE_PICKER_EVENT:
			return createDatePickerEvent();
		case ArkUIModelPackage.DATE_PICKER_STYLE:
			return createDatePickerStyle();
		case ArkUIModelPackage.TEXT_PICKER_WIDGET:
			return createTextPickerWidget();
		case ArkUIModelPackage.TEXT_PICKER_EVENT:
			return createTextPickerEvent();
		case ArkUIModelPackage.TEXT_PICKER_STYLE:
			return createTextPickerStyle();
		case ArkUIModelPackage.DIVIDER_WIDGET:
			return createDividerWidget();
		case ArkUIModelPackage.DIVIDER_STYLE:
			return createDividerStyle();
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER:
			return createCustomDialogContainer();
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE:
			return createCustomDialogStyle();
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT:
			return createCustomDialogEvent();
		case ArkUIModelPackage.OPEN_DIALOG:
			return createOpenDialog();
		case ArkUIModelPackage.CLOSE_DIALOG:
			return createCloseDialog();
		case ArkUIModelPackage.DATA_PREFERENCES:
			return createDataPreferences();
		case ArkUIModelPackage.TERMINATE_SELF:
			return createTerminateSelf();
		case ArkUIModelPackage.SET_TIME_OUT:
			return createSetTimeOut();
		case ArkUIModelPackage.CLEAR_TIME_OUT:
			return createClearTimeOut();
		case ArkUIModelPackage.SHOW_TOAST_OPTIONS:
			return createShowToastOptions();
		case ArkUIModelPackage.DOMAIN_MODEL:
			return createDomainModel();
		case ArkUIModelPackage.ENTITY_REFRENCE:
			return createEntityRefrence();
		case ArkUIModelPackage.GRID_CONTAINER:
			return createGridContainer();
		case ArkUIModelPackage.GRID_EVENT:
			return createGridEvent();
		case ArkUIModelPackage.GRID_STYLE:
			return createGridStyle();
		case ArkUIModelPackage.CHANGE_INDEX:
			return createChangeIndex();
		case ArkUIModelPackage.TAB_CONTENT_STYLE:
			return createTabContentStyle();
		case ArkUIModelPackage.GRID_ITEM_CONTAINER:
			return createGridItemContainer();
		case ArkUIModelPackage.SEARCH_WIDGET:
			return createSearchWidget();
		case ArkUIModelPackage.SEARCH_EVENT:
			return createSearchEvent();
		case ArkUIModelPackage.SEARCH_STYLE:
			return createSearchStyle();
		case ArkUIModelPackage.BLANK_WIDGET:
			return createBlankWidget();
		case ArkUIModelPackage.BLANK_STYLE:
			return createBlankStyle();
		case ArkUIModelPackage.PROGRESS_WIDGET:
			return createProgressWidget();
		case ArkUIModelPackage.PROGRESS_STYLE:
			return createProgressStyle();
		case ArkUIModelPackage.PROGRESS_EVENT:
			return createProgressEvent();
		case ArkUIModelPackage.LINE_CONTAINER:
			return createLineContainer();
		case ArkUIModelPackage.LINE_EVENT:
			return createLineEvent();
		case ArkUIModelPackage.LINE_STYLE:
			return createLineStyle();
		case ArkUIModelPackage.WORK_OPERATION:
			return createWorkOperation();
		case ArkUIModelPackage.GRID_ITEM_STYLE:
			return createGridItemStyle();
		case ArkUIModelPackage.GRID_ITEM_EVENT:
			return createGridItemEvent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ArkUIModelPackage.DEVICES_TYPE:
			return createDevicesTypeFromString(eDataType, initialValue);
		case ArkUIModelPackage.EXECUTE_TYPE:
			return createExecuteTypeFromString(eDataType, initialValue);
		case ArkUIModelPackage.HTTP_TYPE:
			return createHttpTypeFromString(eDataType, initialValue);
		case ArkUIModelPackage.VARIABLE_TYPE:
			return createVariableTypeFromString(eDataType, initialValue);
		case ArkUIModelPackage.PTYPE:
			return createPTypeFromString(eDataType, initialValue);
		case ArkUIModelPackage.LINE_TYPE:
			return createLineTypeFromString(eDataType, initialValue);
		case ArkUIModelPackage.ROUTE_TYPE:
			return createRouteTypeFromString(eDataType, initialValue);
		case ArkUIModelPackage.UNION_TYPE:
			return createUnionTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ArkUIModelPackage.DEVICES_TYPE:
			return convertDevicesTypeToString(eDataType, instanceValue);
		case ArkUIModelPackage.EXECUTE_TYPE:
			return convertExecuteTypeToString(eDataType, instanceValue);
		case ArkUIModelPackage.HTTP_TYPE:
			return convertHttpTypeToString(eDataType, instanceValue);
		case ArkUIModelPackage.VARIABLE_TYPE:
			return convertVariableTypeToString(eDataType, instanceValue);
		case ArkUIModelPackage.PTYPE:
			return convertPTypeToString(eDataType, instanceValue);
		case ArkUIModelPackage.LINE_TYPE:
			return convertLineTypeToString(eDataType, instanceValue);
		case ArkUIModelPackage.ROUTE_TYPE:
			return convertRouteTypeToString(eDataType, instanceValue);
		case ArkUIModelPackage.UNION_TYPE:
			return convertUnionTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIModel createGUIModel() {
		GUIModelImpl guiModel = new GUIModelImpl();
		return guiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UILogic createUILogic() {
		UILogicImpl uiLogic = new UILogicImpl();
		return uiLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDesign createUIDesign() {
		UIDesignImpl uiDesign = new UIDesignImpl();
		return uiDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageStruct createPageStruct() {
		PageStructImpl pageStruct = new PageStructImpl();
		return pageStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextWidget createTextWidget() {
		TextWidgetImpl textWidget = new TextWidgetImpl();
		return textWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonWidget createButtonWidget() {
		ButtonWidgetImpl buttonWidget = new ButtonWidgetImpl();
		return buttonWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexContainer createFlexContainer() {
		FlexContainerImpl flexContainer = new FlexContainerImpl();
		return flexContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleLibray createStyleLibray() {
		StyleLibrayImpl styleLibray = new StyleLibrayImpl();
		return styleLibray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleClass createStyleClass() {
		StyleClassImpl styleClass = new StyleClassImpl();
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputWidget createTextInputWidget() {
		TextInputWidgetImpl textInputWidget = new TextInputWidgetImpl();
		return textInputWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListContainer createListContainer() {
		ListContainerImpl listContainer = new ListContainerImpl();
		return listContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyle createTextStyle() {
		TextStyleImpl textStyle = new TextStyleImpl();
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputStyle createTextInputStyle() {
		TextInputStyleImpl textInputStyle = new TextInputStyleImpl();
		return textInputStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCS createTypeCS() {
		TypeCSImpl typeCS = new TypeCSImpl();
		return typeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowContainer createRowContainer() {
		RowContainerImpl rowContainer = new RowContainerImpl();
		return rowContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnContainer createColumnContainer() {
		ColumnContainerImpl columnContainer = new ColumnContainerImpl();
		return columnContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonStyle createButtonStyle() {
		ButtonStyleImpl buttonStyle = new ButtonStyleImpl();
		return buttonStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexStyle createFlexStyle() {
		FlexStyleImpl flexStyle = new FlexStyleImpl();
		return flexStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowStyle createRowStyle() {
		RowStyleImpl rowStyle = new RowStyleImpl();
		return rowStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnStyle createColumnStyle() {
		ColumnStyleImpl columnStyle = new ColumnStyleImpl();
		return columnStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyle createListStyle() {
		ListStyleImpl listStyle = new ListStyleImpl();
		return listStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemStyle createListItemStyle() {
		ListItemStyleImpl listItemStyle = new ListItemStyleImpl();
		return listItemStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemContainer createListItemContainer() {
		ListItemContainerImpl listItemContainer = new ListItemContainerImpl();
		return listItemContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageWidget createImageWidget() {
		ImageWidgetImpl imageWidget = new ImageWidgetImpl();
		return imageWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageStyle createImageStyle() {
		ImageStyleImpl imageStyle = new ImageStyleImpl();
		return imageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent createTriggerEvent() {
		TriggerEventImpl triggerEvent = new TriggerEventImpl();
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageEvent createPageEvent() {
		PageEventImpl pageEvent = new PageEventImpl();
		return pageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnEvent createColumnEvent() {
		ColumnEventImpl columnEvent = new ColumnEventImpl();
		return columnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowEvent createRowEvent() {
		RowEventImpl rowEvent = new RowEventImpl();
		return rowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexEvent createFlexEvent() {
		FlexEventImpl flexEvent = new FlexEventImpl();
		return flexEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageEvent createImageEvent() {
		ImageEventImpl imageEvent = new ImageEventImpl();
		return imageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextEvent createTextEvent() {
		TextEventImpl textEvent = new TextEventImpl();
		return textEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonEvent createButtonEvent() {
		ButtonEventImpl buttonEvent = new ButtonEventImpl();
		return buttonEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputEvent createTextInputEvent() {
		TextInputEventImpl textInputEvent = new TextInputEventImpl();
		return textInputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEvent createListEvent() {
		ListEventImpl listEvent = new ListEventImpl();
		return listEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemEvent createListItemEvent() {
		ListItemEventImpl listItemEvent = new ListItemEventImpl();
		return listItemEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopOp createLoopOp() {
		LoopOpImpl loopOp = new LoopOpImpl();
		return loopOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseOp createCaseOp() {
		CaseOpImpl caseOp = new CaseOpImpl();
		return caseOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpOperation createHttpOperation() {
		HttpOperationImpl httpOperation = new HttpOperationImpl();
		return httpOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetParameter createGetParameter() {
		GetParameterImpl getParameter = new GetParameterImpl();
		return getParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetParameter createSetParameter() {
		SetParameterImpl setParameter = new SetParameterImpl();
		return setParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationClass createAnimationClass() {
		AnimationClassImpl animationClass = new AnimationClassImpl();
		return animationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAnimator createImageAnimator() {
		ImageAnimatorImpl imageAnimator = new ImageAnimatorImpl();
		return imageAnimator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagesItem createImagesItem() {
		ImagesItemImpl imagesItem = new ImagesItemImpl();
		return imagesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAnimatorStyle createImageAnimatorStyle() {
		ImageAnimatorStyleImpl imageAnimatorStyle = new ImageAnimatorStyleImpl();
		return imageAnimatorStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAnimatorEvent createImageAnimatorEvent() {
		ImageAnimatorEventImpl imageAnimatorEvent = new ImageAnimatorEventImpl();
		return imageAnimatorEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteSkip createRouteSkip() {
		RouteSkipImpl routeSkip = new RouteSkipImpl();
		return routeSkip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetRouteValue createGetRouteValue() {
		GetRouteValueImpl getRouteValue = new GetRouteValueImpl();
		return getRouteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqOp createSeqOp() {
		SeqOpImpl seqOp = new SeqOpImpl();
		return seqOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIStruct createUIStruct() {
		UIStructImpl uiStruct = new UIStructImpl();
		return uiStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationLibray createAnimationLibray() {
		AnimationLibrayImpl animationLibray = new AnimationLibrayImpl();
		return animationLibray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAttribute createEntityAttribute() {
		EntityAttributeImpl entityAttribute = new EntityAttributeImpl();
		return entityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationContainer createNavigationContainer() {
		NavigationContainerImpl navigationContainer = new NavigationContainerImpl();
		return navigationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationStyle createNavigationStyle() {
		NavigationStyleImpl navigationStyle = new NavigationStyleImpl();
		return navigationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationEvent createNavigationEvent() {
		NavigationEventImpl navigationEvent = new NavigationEventImpl();
		return navigationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItem createContainerItem() {
		ContainerItemImpl containerItem = new ContainerItemImpl();
		return containerItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItems createContainerItems() {
		ContainerItemsImpl containerItems = new ContainerItemsImpl();
		return containerItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOp createStartOp() {
		StartOpImpl startOp = new StartOpImpl();
		return startOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOp createEndOp() {
		EndOpImpl endOp = new EndOpImpl();
		return endOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlow createWorkFlow() {
		WorkFlowImpl workFlow = new WorkFlowImpl();
		return workFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckEqual createCheckEqual() {
		CheckEqualImpl checkEqual = new CheckEqualImpl();
		return checkEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLine createFlowLine() {
		FlowLineImpl flowLine = new FlowLineImpl();
		return flowLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach createForEach() {
		ForEachImpl forEach = new ForEachImpl();
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IF createIF() {
		IFImpl if_ = new IFImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallFun createCallFun() {
		CallFunImpl callFun = new CallFunImpl();
		return callFun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiperWidget createSwiperWidget() {
		SwiperWidgetImpl swiperWidget = new SwiperWidgetImpl();
		return swiperWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiperStyle createSwiperStyle() {
		SwiperStyleImpl swiperStyle = new SwiperStyleImpl();
		return swiperStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiperEvent createSwiperEvent() {
		SwiperEventImpl swiperEvent = new SwiperEventImpl();
		return swiperEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationLibray createOperationLibray() {
		OperationLibrayImpl operationLibray = new OperationLibrayImpl();
		return operationLibray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageRefrence createPageRefrence() {
		PageRefrenceImpl pageRefrence = new PageRefrenceImpl();
		return pageRefrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabsContainer createTabsContainer() {
		TabsContainerImpl tabsContainer = new TabsContainerImpl();
		return tabsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabContent createTabContent() {
		TabContentImpl tabContent = new TabContentImpl();
		return tabContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabsStyle createTabsStyle() {
		TabsStyleImpl tabsStyle = new TabsStyleImpl();
		return tabsStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabItem createTabItem() {
		TabItemImpl tabItem = new TabItemImpl();
		return tabItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabsEvent createTabsEvent() {
		TabsEventImpl tabsEvent = new TabsEventImpl();
		return tabsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackContainer createStackContainer() {
		StackContainerImpl stackContainer = new StackContainerImpl();
		return stackContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackEvent createStackEvent() {
		StackEventImpl stackEvent = new StackEventImpl();
		return stackEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackStyle createStackStyle() {
		StackStyleImpl stackStyle = new StackStyleImpl();
		return stackStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollContainer createScrollContainer() {
		ScrollContainerImpl scrollContainer = new ScrollContainerImpl();
		return scrollContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollEvent createScrollEvent() {
		ScrollEventImpl scrollEvent = new ScrollEventImpl();
		return scrollEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollStyle createScrollStyle() {
		ScrollStyleImpl scrollStyle = new ScrollStyleImpl();
		return scrollStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scroller createScroller() {
		ScrollerImpl scroller = new ScrollerImpl();
		return scroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleWidget createToggleWidget() {
		ToggleWidgetImpl toggleWidget = new ToggleWidgetImpl();
		return toggleWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleEvent createToggleEvent() {
		ToggleEventImpl toggleEvent = new ToggleEventImpl();
		return toggleEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleStyle createToggleStyle() {
		ToggleStyleImpl toggleStyle = new ToggleStyleImpl();
		return toggleStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePickerWidget createTimePickerWidget() {
		TimePickerWidgetImpl timePickerWidget = new TimePickerWidgetImpl();
		return timePickerWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePickerEvent createTimePickerEvent() {
		TimePickerEventImpl timePickerEvent = new TimePickerEventImpl();
		return timePickerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePickerStyle createTimePickerStyle() {
		TimePickerStyleImpl timePickerStyle = new TimePickerStyleImpl();
		return timePickerStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePickerWidget createDatePickerWidget() {
		DatePickerWidgetImpl datePickerWidget = new DatePickerWidgetImpl();
		return datePickerWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePickerEvent createDatePickerEvent() {
		DatePickerEventImpl datePickerEvent = new DatePickerEventImpl();
		return datePickerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePickerStyle createDatePickerStyle() {
		DatePickerStyleImpl datePickerStyle = new DatePickerStyleImpl();
		return datePickerStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPickerWidget createTextPickerWidget() {
		TextPickerWidgetImpl textPickerWidget = new TextPickerWidgetImpl();
		return textPickerWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPickerEvent createTextPickerEvent() {
		TextPickerEventImpl textPickerEvent = new TextPickerEventImpl();
		return textPickerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPickerStyle createTextPickerStyle() {
		TextPickerStyleImpl textPickerStyle = new TextPickerStyleImpl();
		return textPickerStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DividerWidget createDividerWidget() {
		DividerWidgetImpl dividerWidget = new DividerWidgetImpl();
		return dividerWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DividerStyle createDividerStyle() {
		DividerStyleImpl dividerStyle = new DividerStyleImpl();
		return dividerStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDialogContainer createCustomDialogContainer() {
		CustomDialogContainerImpl customDialogContainer = new CustomDialogContainerImpl();
		return customDialogContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDialogStyle createCustomDialogStyle() {
		CustomDialogStyleImpl customDialogStyle = new CustomDialogStyleImpl();
		return customDialogStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDialogEvent createCustomDialogEvent() {
		CustomDialogEventImpl customDialogEvent = new CustomDialogEventImpl();
		return customDialogEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDialog createOpenDialog() {
		OpenDialogImpl openDialog = new OpenDialogImpl();
		return openDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseDialog createCloseDialog() {
		CloseDialogImpl closeDialog = new CloseDialogImpl();
		return closeDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPreferences createDataPreferences() {
		DataPreferencesImpl dataPreferences = new DataPreferencesImpl();
		return dataPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminateSelf createTerminateSelf() {
		TerminateSelfImpl terminateSelf = new TerminateSelfImpl();
		return terminateSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTimeOut createSetTimeOut() {
		SetTimeOutImpl setTimeOut = new SetTimeOutImpl();
		return setTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearTimeOut createClearTimeOut() {
		ClearTimeOutImpl clearTimeOut = new ClearTimeOutImpl();
		return clearTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowToastOptions createShowToastOptions() {
		ShowToastOptionsImpl showToastOptions = new ShowToastOptionsImpl();
		return showToastOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRefrence createEntityRefrence() {
		EntityRefrenceImpl entityRefrence = new EntityRefrenceImpl();
		return entityRefrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridContainer createGridContainer() {
		GridContainerImpl gridContainer = new GridContainerImpl();
		return gridContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridEvent createGridEvent() {
		GridEventImpl gridEvent = new GridEventImpl();
		return gridEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridStyle createGridStyle() {
		GridStyleImpl gridStyle = new GridStyleImpl();
		return gridStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeIndex createChangeIndex() {
		ChangeIndexImpl changeIndex = new ChangeIndexImpl();
		return changeIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabContentStyle createTabContentStyle() {
		TabContentStyleImpl tabContentStyle = new TabContentStyleImpl();
		return tabContentStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridItemContainer createGridItemContainer() {
		GridItemContainerImpl gridItemContainer = new GridItemContainerImpl();
		return gridItemContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchWidget createSearchWidget() {
		SearchWidgetImpl searchWidget = new SearchWidgetImpl();
		return searchWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEvent createSearchEvent() {
		SearchEventImpl searchEvent = new SearchEventImpl();
		return searchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchStyle createSearchStyle() {
		SearchStyleImpl searchStyle = new SearchStyleImpl();
		return searchStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlankWidget createBlankWidget() {
		BlankWidgetImpl blankWidget = new BlankWidgetImpl();
		return blankWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlankStyle createBlankStyle() {
		BlankStyleImpl blankStyle = new BlankStyleImpl();
		return blankStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressWidget createProgressWidget() {
		ProgressWidgetImpl progressWidget = new ProgressWidgetImpl();
		return progressWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressStyle createProgressStyle() {
		ProgressStyleImpl progressStyle = new ProgressStyleImpl();
		return progressStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressEvent createProgressEvent() {
		ProgressEventImpl progressEvent = new ProgressEventImpl();
		return progressEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineContainer createLineContainer() {
		LineContainerImpl lineContainer = new LineContainerImpl();
		return lineContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineEvent createLineEvent() {
		LineEventImpl lineEvent = new LineEventImpl();
		return lineEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle createLineStyle() {
		LineStyleImpl lineStyle = new LineStyleImpl();
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkOperation createWorkOperation() {
		WorkOperationImpl workOperation = new WorkOperationImpl();
		return workOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridItemStyle createGridItemStyle() {
		GridItemStyleImpl gridItemStyle = new GridItemStyleImpl();
		return gridItemStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridItemEvent createGridItemEvent() {
		GridItemEventImpl gridItemEvent = new GridItemEventImpl();
		return gridItemEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesType createDevicesTypeFromString(EDataType eDataType, String initialValue) {
		DevicesType result = DevicesType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDevicesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteType createExecuteTypeFromString(EDataType eDataType, String initialValue) {
		ExecuteType result = ExecuteType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecuteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpType createHttpTypeFromString(EDataType eDataType, String initialValue) {
		HttpType result = HttpType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue) {
		VariableType result = VariableType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType createPTypeFromString(EDataType eDataType, String initialValue) {
		PType result = PType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType createLineTypeFromString(EDataType eDataType, String initialValue) {
		LineType result = LineType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteType createRouteTypeFromString(EDataType eDataType, String initialValue) {
		RouteType result = RouteType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionType createUnionTypeFromString(EDataType eDataType, String initialValue) {
		UnionType result = UnionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArkUIModelPackage getArkUIModelPackage() {
		return (ArkUIModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArkUIModelPackage getPackage() {
		return ArkUIModelPackage.eINSTANCE;
	}

} //ArkUIModelFactoryImpl
