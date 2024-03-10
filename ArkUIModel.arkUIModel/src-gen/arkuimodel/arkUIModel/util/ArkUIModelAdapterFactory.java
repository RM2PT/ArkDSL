/**
 */
package arkuimodel.arkUIModel.util;

import arkuimodel.arkUIModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arkuimodel.arkUIModel.ArkUIModelPackage
 * @generated
 */
public class ArkUIModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArkUIModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArkUIModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArkUIModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArkUIModelSwitch<Adapter> modelSwitch = new ArkUIModelSwitch<Adapter>() {
		@Override
		public Adapter caseGUIModel(GUIModel object) {
			return createGUIModelAdapter();
		}

		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter caseUILogic(UILogic object) {
			return createUILogicAdapter();
		}

		@Override
		public Adapter caseUIDesign(UIDesign object) {
			return createUIDesignAdapter();
		}

		@Override
		public Adapter casePageStruct(PageStruct object) {
			return createPageStructAdapter();
		}

		@Override
		public Adapter caseUIComponent(UIComponent object) {
			return createUIComponentAdapter();
		}

		@Override
		public Adapter caseTextWidget(TextWidget object) {
			return createTextWidgetAdapter();
		}

		@Override
		public Adapter caseButtonWidget(ButtonWidget object) {
			return createButtonWidgetAdapter();
		}

		@Override
		public Adapter caseFlexContainer(FlexContainer object) {
			return createFlexContainerAdapter();
		}

		@Override
		public Adapter caseStyleLibray(StyleLibray object) {
			return createStyleLibrayAdapter();
		}

		@Override
		public Adapter caseStyleClass(StyleClass object) {
			return createStyleClassAdapter();
		}

		@Override
		public Adapter casePrimitiveOperation(PrimitiveOperation object) {
			return createPrimitiveOperationAdapter();
		}

		@Override
		public Adapter caseTextInputWidget(TextInputWidget object) {
			return createTextInputWidgetAdapter();
		}

		@Override
		public Adapter caseListContainer(ListContainer object) {
			return createListContainerAdapter();
		}

		@Override
		public Adapter caseTextStyle(TextStyle object) {
			return createTextStyleAdapter();
		}

		@Override
		public Adapter caseTextInputStyle(TextInputStyle object) {
			return createTextInputStyleAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseTypeCS(TypeCS object) {
			return createTypeCSAdapter();
		}

		@Override
		public Adapter caseRowContainer(RowContainer object) {
			return createRowContainerAdapter();
		}

		@Override
		public Adapter caseColumnContainer(ColumnContainer object) {
			return createColumnContainerAdapter();
		}

		@Override
		public Adapter caseButtonStyle(ButtonStyle object) {
			return createButtonStyleAdapter();
		}

		@Override
		public Adapter caseFlexStyle(FlexStyle object) {
			return createFlexStyleAdapter();
		}

		@Override
		public Adapter caseRowStyle(RowStyle object) {
			return createRowStyleAdapter();
		}

		@Override
		public Adapter caseColumnStyle(ColumnStyle object) {
			return createColumnStyleAdapter();
		}

		@Override
		public Adapter caseListStyle(ListStyle object) {
			return createListStyleAdapter();
		}

		@Override
		public Adapter caseListItemStyle(ListItemStyle object) {
			return createListItemStyleAdapter();
		}

		@Override
		public Adapter caseListItemContainer(ListItemContainer object) {
			return createListItemContainerAdapter();
		}

		@Override
		public Adapter caseImageWidget(ImageWidget object) {
			return createImageWidgetAdapter();
		}

		@Override
		public Adapter caseImageStyle(ImageStyle object) {
			return createImageStyleAdapter();
		}

		@Override
		public Adapter caseControlFlow(ControlFlow object) {
			return createControlFlowAdapter();
		}

		@Override
		public Adapter caseTriggerEvent(TriggerEvent object) {
			return createTriggerEventAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter casePageEvent(PageEvent object) {
			return createPageEventAdapter();
		}

		@Override
		public Adapter caseColumnEvent(ColumnEvent object) {
			return createColumnEventAdapter();
		}

		@Override
		public Adapter caseRowEvent(RowEvent object) {
			return createRowEventAdapter();
		}

		@Override
		public Adapter caseFlexEvent(FlexEvent object) {
			return createFlexEventAdapter();
		}

		@Override
		public Adapter caseImageEvent(ImageEvent object) {
			return createImageEventAdapter();
		}

		@Override
		public Adapter caseTextEvent(TextEvent object) {
			return createTextEventAdapter();
		}

		@Override
		public Adapter caseButtonEvent(ButtonEvent object) {
			return createButtonEventAdapter();
		}

		@Override
		public Adapter caseTextInputEvent(TextInputEvent object) {
			return createTextInputEventAdapter();
		}

		@Override
		public Adapter caseListEvent(ListEvent object) {
			return createListEventAdapter();
		}

		@Override
		public Adapter caseListItemEvent(ListItemEvent object) {
			return createListItemEventAdapter();
		}

		@Override
		public Adapter caseUIOperation(UIOperation object) {
			return createUIOperationAdapter();
		}

		@Override
		public Adapter caseSeviceOperation(SeviceOperation object) {
			return createSeviceOperationAdapter();
		}

		@Override
		public Adapter caseLoopOp(LoopOp object) {
			return createLoopOpAdapter();
		}

		@Override
		public Adapter caseCaseOp(CaseOp object) {
			return createCaseOpAdapter();
		}

		@Override
		public Adapter caseHttpOperation(HttpOperation object) {
			return createHttpOperationAdapter();
		}

		@Override
		public Adapter caseGetParameter(GetParameter object) {
			return createGetParameterAdapter();
		}

		@Override
		public Adapter caseSetParameter(SetParameter object) {
			return createSetParameterAdapter();
		}

		@Override
		public Adapter caseAnimationClass(AnimationClass object) {
			return createAnimationClassAdapter();
		}

		@Override
		public Adapter caseImageAnimator(ImageAnimator object) {
			return createImageAnimatorAdapter();
		}

		@Override
		public Adapter caseImagesItem(ImagesItem object) {
			return createImagesItemAdapter();
		}

		@Override
		public Adapter caseImageAnimatorStyle(ImageAnimatorStyle object) {
			return createImageAnimatorStyleAdapter();
		}

		@Override
		public Adapter caseImageAnimatorEvent(ImageAnimatorEvent object) {
			return createImageAnimatorEventAdapter();
		}

		@Override
		public Adapter caseRouteSkip(RouteSkip object) {
			return createRouteSkipAdapter();
		}

		@Override
		public Adapter caseGetRouteValue(GetRouteValue object) {
			return createGetRouteValueAdapter();
		}

		@Override
		public Adapter caseExtraOperation(ExtraOperation object) {
			return createExtraOperationAdapter();
		}

		@Override
		public Adapter caseSeqOp(SeqOp object) {
			return createSeqOpAdapter();
		}

		@Override
		public Adapter caseUIStruct(UIStruct object) {
			return createUIStructAdapter();
		}

		@Override
		public Adapter caseAnimationLibray(AnimationLibray object) {
			return createAnimationLibrayAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter caseWidget(Widget object) {
			return createWidgetAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseEntityAttribute(EntityAttribute object) {
			return createEntityAttributeAdapter();
		}

		@Override
		public Adapter caseArray(Array object) {
			return createArrayAdapter();
		}

		@Override
		public Adapter caseNavigationContainer(NavigationContainer object) {
			return createNavigationContainerAdapter();
		}

		@Override
		public Adapter caseNavigationStyle(NavigationStyle object) {
			return createNavigationStyleAdapter();
		}

		@Override
		public Adapter caseNavigationEvent(NavigationEvent object) {
			return createNavigationEventAdapter();
		}

		@Override
		public Adapter caseContainerItem(ContainerItem object) {
			return createContainerItemAdapter();
		}

		@Override
		public Adapter caseContainerItems(ContainerItems object) {
			return createContainerItemsAdapter();
		}

		@Override
		public Adapter caseStartOp(StartOp object) {
			return createStartOpAdapter();
		}

		@Override
		public Adapter caseEndOp(EndOp object) {
			return createEndOpAdapter();
		}

		@Override
		public Adapter caseWorkFlow(WorkFlow object) {
			return createWorkFlowAdapter();
		}

		@Override
		public Adapter caseCheckEqual(CheckEqual object) {
			return createCheckEqualAdapter();
		}

		@Override
		public Adapter caseFlowLine(FlowLine object) {
			return createFlowLineAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseForEach(ForEach object) {
			return createForEachAdapter();
		}

		@Override
		public Adapter caseIF(IF object) {
			return createIFAdapter();
		}

		@Override
		public Adapter caseCallFun(CallFun object) {
			return createCallFunAdapter();
		}

		@Override
		public Adapter caseSwiperWidget(SwiperWidget object) {
			return createSwiperWidgetAdapter();
		}

		@Override
		public Adapter caseSwiperStyle(SwiperStyle object) {
			return createSwiperStyleAdapter();
		}

		@Override
		public Adapter caseSwiperEvent(SwiperEvent object) {
			return createSwiperEventAdapter();
		}

		@Override
		public Adapter caseOperationLibray(OperationLibray object) {
			return createOperationLibrayAdapter();
		}

		@Override
		public Adapter casePageRefrence(PageRefrence object) {
			return createPageRefrenceAdapter();
		}

		@Override
		public Adapter caseTabsContainer(TabsContainer object) {
			return createTabsContainerAdapter();
		}

		@Override
		public Adapter caseTabContent(TabContent object) {
			return createTabContentAdapter();
		}

		@Override
		public Adapter caseTabsStyle(TabsStyle object) {
			return createTabsStyleAdapter();
		}

		@Override
		public Adapter caseTabItem(TabItem object) {
			return createTabItemAdapter();
		}

		@Override
		public Adapter caseTabsEvent(TabsEvent object) {
			return createTabsEventAdapter();
		}

		@Override
		public Adapter caseStackContainer(StackContainer object) {
			return createStackContainerAdapter();
		}

		@Override
		public Adapter caseStackEvent(StackEvent object) {
			return createStackEventAdapter();
		}

		@Override
		public Adapter caseStackStyle(StackStyle object) {
			return createStackStyleAdapter();
		}

		@Override
		public Adapter caseScrollContainer(ScrollContainer object) {
			return createScrollContainerAdapter();
		}

		@Override
		public Adapter caseScrollEvent(ScrollEvent object) {
			return createScrollEventAdapter();
		}

		@Override
		public Adapter caseScrollStyle(ScrollStyle object) {
			return createScrollStyleAdapter();
		}

		@Override
		public Adapter caseScroller(Scroller object) {
			return createScrollerAdapter();
		}

		@Override
		public Adapter caseToggleWidget(ToggleWidget object) {
			return createToggleWidgetAdapter();
		}

		@Override
		public Adapter caseToggleEvent(ToggleEvent object) {
			return createToggleEventAdapter();
		}

		@Override
		public Adapter caseToggleStyle(ToggleStyle object) {
			return createToggleStyleAdapter();
		}

		@Override
		public Adapter caseTimePickerWidget(TimePickerWidget object) {
			return createTimePickerWidgetAdapter();
		}

		@Override
		public Adapter caseTimePickerEvent(TimePickerEvent object) {
			return createTimePickerEventAdapter();
		}

		@Override
		public Adapter caseTimePickerStyle(TimePickerStyle object) {
			return createTimePickerStyleAdapter();
		}

		@Override
		public Adapter caseDatePickerWidget(DatePickerWidget object) {
			return createDatePickerWidgetAdapter();
		}

		@Override
		public Adapter caseDatePickerEvent(DatePickerEvent object) {
			return createDatePickerEventAdapter();
		}

		@Override
		public Adapter caseDatePickerStyle(DatePickerStyle object) {
			return createDatePickerStyleAdapter();
		}

		@Override
		public Adapter caseTextPickerWidget(TextPickerWidget object) {
			return createTextPickerWidgetAdapter();
		}

		@Override
		public Adapter caseTextPickerEvent(TextPickerEvent object) {
			return createTextPickerEventAdapter();
		}

		@Override
		public Adapter caseTextPickerStyle(TextPickerStyle object) {
			return createTextPickerStyleAdapter();
		}

		@Override
		public Adapter caseDividerWidget(DividerWidget object) {
			return createDividerWidgetAdapter();
		}

		@Override
		public Adapter caseDividerStyle(DividerStyle object) {
			return createDividerStyleAdapter();
		}

		@Override
		public Adapter caseCustomDialogContainer(CustomDialogContainer object) {
			return createCustomDialogContainerAdapter();
		}

		@Override
		public Adapter caseCustomDialogStyle(CustomDialogStyle object) {
			return createCustomDialogStyleAdapter();
		}

		@Override
		public Adapter caseCustomDialogEvent(CustomDialogEvent object) {
			return createCustomDialogEventAdapter();
		}

		@Override
		public Adapter caseOpenDialog(OpenDialog object) {
			return createOpenDialogAdapter();
		}

		@Override
		public Adapter caseCloseDialog(CloseDialog object) {
			return createCloseDialogAdapter();
		}

		@Override
		public Adapter caseDataPreferences(DataPreferences object) {
			return createDataPreferencesAdapter();
		}

		@Override
		public Adapter caseTerminateSelf(TerminateSelf object) {
			return createTerminateSelfAdapter();
		}

		@Override
		public Adapter caseSetTimeOut(SetTimeOut object) {
			return createSetTimeOutAdapter();
		}

		@Override
		public Adapter caseClearTimeOut(ClearTimeOut object) {
			return createClearTimeOutAdapter();
		}

		@Override
		public Adapter caseShowToastOptions(ShowToastOptions object) {
			return createShowToastOptionsAdapter();
		}

		@Override
		public Adapter caseDomainModel(DomainModel object) {
			return createDomainModelAdapter();
		}

		@Override
		public Adapter caseEntityRefrence(EntityRefrence object) {
			return createEntityRefrenceAdapter();
		}

		@Override
		public Adapter caseGridContainer(GridContainer object) {
			return createGridContainerAdapter();
		}

		@Override
		public Adapter caseGridEvent(GridEvent object) {
			return createGridEventAdapter();
		}

		@Override
		public Adapter caseGridStyle(GridStyle object) {
			return createGridStyleAdapter();
		}

		@Override
		public Adapter caseChangeIndex(ChangeIndex object) {
			return createChangeIndexAdapter();
		}

		@Override
		public Adapter caseTabContentStyle(TabContentStyle object) {
			return createTabContentStyleAdapter();
		}

		@Override
		public Adapter caseGridItemContainer(GridItemContainer object) {
			return createGridItemContainerAdapter();
		}

		@Override
		public Adapter caseSearchWidget(SearchWidget object) {
			return createSearchWidgetAdapter();
		}

		@Override
		public Adapter caseSearchEvent(SearchEvent object) {
			return createSearchEventAdapter();
		}

		@Override
		public Adapter caseSearchStyle(SearchStyle object) {
			return createSearchStyleAdapter();
		}

		@Override
		public Adapter caseBlankWidget(BlankWidget object) {
			return createBlankWidgetAdapter();
		}

		@Override
		public Adapter caseBlankStyle(BlankStyle object) {
			return createBlankStyleAdapter();
		}

		@Override
		public Adapter caseProgressWidget(ProgressWidget object) {
			return createProgressWidgetAdapter();
		}

		@Override
		public Adapter caseProgressStyle(ProgressStyle object) {
			return createProgressStyleAdapter();
		}

		@Override
		public Adapter caseProgressEvent(ProgressEvent object) {
			return createProgressEventAdapter();
		}

		@Override
		public Adapter caseLineContainer(LineContainer object) {
			return createLineContainerAdapter();
		}

		@Override
		public Adapter caseLineEvent(LineEvent object) {
			return createLineEventAdapter();
		}

		@Override
		public Adapter caseLineStyle(LineStyle object) {
			return createLineStyleAdapter();
		}

		@Override
		public Adapter caseWorkOperation(WorkOperation object) {
			return createWorkOperationAdapter();
		}

		@Override
		public Adapter caseGridItemStyle(GridItemStyle object) {
			return createGridItemStyleAdapter();
		}

		@Override
		public Adapter caseGridItemEvent(GridItemEvent object) {
			return createGridItemEventAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GUIModel <em>GUI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GUIModel
	 * @generated
	 */
	public Adapter createGUIModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.UILogic <em>UI Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.UILogic
	 * @generated
	 */
	public Adapter createUILogicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.UIDesign <em>UI Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.UIDesign
	 * @generated
	 */
	public Adapter createUIDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.PageStruct <em>Page Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.PageStruct
	 * @generated
	 */
	public Adapter createPageStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.UIComponent <em>UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.UIComponent
	 * @generated
	 */
	public Adapter createUIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextWidget <em>Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextWidget
	 * @generated
	 */
	public Adapter createTextWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ButtonWidget <em>Button Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ButtonWidget
	 * @generated
	 */
	public Adapter createButtonWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.FlexContainer <em>Flex Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.FlexContainer
	 * @generated
	 */
	public Adapter createFlexContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.StyleLibray <em>Style Libray</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.StyleLibray
	 * @generated
	 */
	public Adapter createStyleLibrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.StyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.StyleClass
	 * @generated
	 */
	public Adapter createStyleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.PrimitiveOperation <em>Primitive Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.PrimitiveOperation
	 * @generated
	 */
	public Adapter createPrimitiveOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextInputWidget <em>Text Input Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextInputWidget
	 * @generated
	 */
	public Adapter createTextInputWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ListContainer <em>List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ListContainer
	 * @generated
	 */
	public Adapter createListContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextStyle
	 * @generated
	 */
	public Adapter createTextStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextInputStyle <em>Text Input Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextInputStyle
	 * @generated
	 */
	public Adapter createTextInputStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TypeCS <em>Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TypeCS
	 * @generated
	 */
	public Adapter createTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.RowContainer <em>Row Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.RowContainer
	 * @generated
	 */
	public Adapter createRowContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ColumnContainer <em>Column Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ColumnContainer
	 * @generated
	 */
	public Adapter createColumnContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ButtonStyle
	 * @generated
	 */
	public Adapter createButtonStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.FlexStyle <em>Flex Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.FlexStyle
	 * @generated
	 */
	public Adapter createFlexStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.RowStyle <em>Row Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.RowStyle
	 * @generated
	 */
	public Adapter createRowStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ColumnStyle <em>Column Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ColumnStyle
	 * @generated
	 */
	public Adapter createColumnStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ListStyle
	 * @generated
	 */
	public Adapter createListStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ListItemStyle <em>List Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ListItemStyle
	 * @generated
	 */
	public Adapter createListItemStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ListItemContainer <em>List Item Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ListItemContainer
	 * @generated
	 */
	public Adapter createListItemContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ImageWidget <em>Image Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ImageWidget
	 * @generated
	 */
	public Adapter createImageWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ImageStyle <em>Image Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ImageStyle
	 * @generated
	 */
	public Adapter createImageStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TriggerEvent
	 * @generated
	 */
	public Adapter createTriggerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.PageEvent <em>Page Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.PageEvent
	 * @generated
	 */
	public Adapter createPageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ColumnEvent <em>Column Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ColumnEvent
	 * @generated
	 */
	public Adapter createColumnEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.RowEvent <em>Row Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.RowEvent
	 * @generated
	 */
	public Adapter createRowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.FlexEvent <em>Flex Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.FlexEvent
	 * @generated
	 */
	public Adapter createFlexEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ImageEvent <em>Image Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ImageEvent
	 * @generated
	 */
	public Adapter createImageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextEvent <em>Text Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextEvent
	 * @generated
	 */
	public Adapter createTextEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ButtonEvent <em>Button Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ButtonEvent
	 * @generated
	 */
	public Adapter createButtonEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextInputEvent <em>Text Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextInputEvent
	 * @generated
	 */
	public Adapter createTextInputEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ListEvent <em>List Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ListEvent
	 * @generated
	 */
	public Adapter createListEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ListItemEvent <em>List Item Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ListItemEvent
	 * @generated
	 */
	public Adapter createListItemEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.UIOperation <em>UI Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.UIOperation
	 * @generated
	 */
	public Adapter createUIOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SeviceOperation <em>Sevice Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SeviceOperation
	 * @generated
	 */
	public Adapter createSeviceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.LoopOp <em>Loop Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.LoopOp
	 * @generated
	 */
	public Adapter createLoopOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.CaseOp <em>Case Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.CaseOp
	 * @generated
	 */
	public Adapter createCaseOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.HttpOperation <em>Http Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.HttpOperation
	 * @generated
	 */
	public Adapter createHttpOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GetParameter <em>Get Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GetParameter
	 * @generated
	 */
	public Adapter createGetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SetParameter
	 * @generated
	 */
	public Adapter createSetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.AnimationClass <em>Animation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.AnimationClass
	 * @generated
	 */
	public Adapter createAnimationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ImageAnimator <em>Image Animator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ImageAnimator
	 * @generated
	 */
	public Adapter createImageAnimatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ImagesItem <em>Images Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ImagesItem
	 * @generated
	 */
	public Adapter createImagesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ImageAnimatorStyle <em>Image Animator Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ImageAnimatorStyle
	 * @generated
	 */
	public Adapter createImageAnimatorStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ImageAnimatorEvent <em>Image Animator Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ImageAnimatorEvent
	 * @generated
	 */
	public Adapter createImageAnimatorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.RouteSkip <em>Route Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.RouteSkip
	 * @generated
	 */
	public Adapter createRouteSkipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GetRouteValue <em>Get Route Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GetRouteValue
	 * @generated
	 */
	public Adapter createGetRouteValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ExtraOperation <em>Extra Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ExtraOperation
	 * @generated
	 */
	public Adapter createExtraOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SeqOp <em>Seq Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SeqOp
	 * @generated
	 */
	public Adapter createSeqOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.UIStruct <em>UI Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.UIStruct
	 * @generated
	 */
	public Adapter createUIStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.AnimationLibray <em>Animation Libray</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.AnimationLibray
	 * @generated
	 */
	public Adapter createAnimationLibrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.EntityAttribute
	 * @generated
	 */
	public Adapter createEntityAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.NavigationContainer <em>Navigation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.NavigationContainer
	 * @generated
	 */
	public Adapter createNavigationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.NavigationStyle <em>Navigation Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.NavigationStyle
	 * @generated
	 */
	public Adapter createNavigationStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.NavigationEvent <em>Navigation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.NavigationEvent
	 * @generated
	 */
	public Adapter createNavigationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ContainerItem <em>Container Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ContainerItem
	 * @generated
	 */
	public Adapter createContainerItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ContainerItems <em>Container Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ContainerItems
	 * @generated
	 */
	public Adapter createContainerItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.StartOp <em>Start Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.StartOp
	 * @generated
	 */
	public Adapter createStartOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.EndOp <em>End Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.EndOp
	 * @generated
	 */
	public Adapter createEndOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.WorkFlow <em>Work Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.WorkFlow
	 * @generated
	 */
	public Adapter createWorkFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.CheckEqual <em>Check Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.CheckEqual
	 * @generated
	 */
	public Adapter createCheckEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.FlowLine <em>Flow Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.FlowLine
	 * @generated
	 */
	public Adapter createFlowLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ForEach
	 * @generated
	 */
	public Adapter createForEachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.IF <em>IF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.IF
	 * @generated
	 */
	public Adapter createIFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.CallFun <em>Call Fun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.CallFun
	 * @generated
	 */
	public Adapter createCallFunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SwiperWidget <em>Swiper Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SwiperWidget
	 * @generated
	 */
	public Adapter createSwiperWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SwiperStyle <em>Swiper Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SwiperStyle
	 * @generated
	 */
	public Adapter createSwiperStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SwiperEvent <em>Swiper Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SwiperEvent
	 * @generated
	 */
	public Adapter createSwiperEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.OperationLibray <em>Operation Libray</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.OperationLibray
	 * @generated
	 */
	public Adapter createOperationLibrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.PageRefrence <em>Page Refrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.PageRefrence
	 * @generated
	 */
	public Adapter createPageRefrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TabsContainer <em>Tabs Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TabsContainer
	 * @generated
	 */
	public Adapter createTabsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TabContent <em>Tab Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TabContent
	 * @generated
	 */
	public Adapter createTabContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TabsStyle <em>Tabs Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TabsStyle
	 * @generated
	 */
	public Adapter createTabsStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TabItem <em>Tab Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TabItem
	 * @generated
	 */
	public Adapter createTabItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TabsEvent <em>Tabs Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TabsEvent
	 * @generated
	 */
	public Adapter createTabsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.StackContainer <em>Stack Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.StackContainer
	 * @generated
	 */
	public Adapter createStackContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.StackEvent <em>Stack Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.StackEvent
	 * @generated
	 */
	public Adapter createStackEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.StackStyle <em>Stack Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.StackStyle
	 * @generated
	 */
	public Adapter createStackStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ScrollContainer <em>Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ScrollContainer
	 * @generated
	 */
	public Adapter createScrollContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ScrollEvent <em>Scroll Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ScrollEvent
	 * @generated
	 */
	public Adapter createScrollEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ScrollStyle <em>Scroll Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ScrollStyle
	 * @generated
	 */
	public Adapter createScrollStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.Scroller <em>Scroller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.Scroller
	 * @generated
	 */
	public Adapter createScrollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ToggleWidget <em>Toggle Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ToggleWidget
	 * @generated
	 */
	public Adapter createToggleWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ToggleEvent <em>Toggle Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ToggleEvent
	 * @generated
	 */
	public Adapter createToggleEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ToggleStyle <em>Toggle Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ToggleStyle
	 * @generated
	 */
	public Adapter createToggleStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TimePickerWidget <em>Time Picker Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TimePickerWidget
	 * @generated
	 */
	public Adapter createTimePickerWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TimePickerEvent <em>Time Picker Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TimePickerEvent
	 * @generated
	 */
	public Adapter createTimePickerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TimePickerStyle <em>Time Picker Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TimePickerStyle
	 * @generated
	 */
	public Adapter createTimePickerStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.DatePickerWidget <em>Date Picker Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.DatePickerWidget
	 * @generated
	 */
	public Adapter createDatePickerWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.DatePickerEvent <em>Date Picker Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.DatePickerEvent
	 * @generated
	 */
	public Adapter createDatePickerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.DatePickerStyle <em>Date Picker Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.DatePickerStyle
	 * @generated
	 */
	public Adapter createDatePickerStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextPickerWidget <em>Text Picker Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextPickerWidget
	 * @generated
	 */
	public Adapter createTextPickerWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextPickerEvent <em>Text Picker Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextPickerEvent
	 * @generated
	 */
	public Adapter createTextPickerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TextPickerStyle <em>Text Picker Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TextPickerStyle
	 * @generated
	 */
	public Adapter createTextPickerStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.DividerWidget <em>Divider Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.DividerWidget
	 * @generated
	 */
	public Adapter createDividerWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.DividerStyle <em>Divider Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.DividerStyle
	 * @generated
	 */
	public Adapter createDividerStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.CustomDialogContainer <em>Custom Dialog Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.CustomDialogContainer
	 * @generated
	 */
	public Adapter createCustomDialogContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.CustomDialogStyle <em>Custom Dialog Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.CustomDialogStyle
	 * @generated
	 */
	public Adapter createCustomDialogStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.CustomDialogEvent <em>Custom Dialog Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.CustomDialogEvent
	 * @generated
	 */
	public Adapter createCustomDialogEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.OpenDialog <em>Open Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.OpenDialog
	 * @generated
	 */
	public Adapter createOpenDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.CloseDialog <em>Close Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.CloseDialog
	 * @generated
	 */
	public Adapter createCloseDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.DataPreferences <em>Data Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.DataPreferences
	 * @generated
	 */
	public Adapter createDataPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TerminateSelf <em>Terminate Self</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TerminateSelf
	 * @generated
	 */
	public Adapter createTerminateSelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SetTimeOut <em>Set Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SetTimeOut
	 * @generated
	 */
	public Adapter createSetTimeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ClearTimeOut <em>Clear Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ClearTimeOut
	 * @generated
	 */
	public Adapter createClearTimeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ShowToastOptions <em>Show Toast Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ShowToastOptions
	 * @generated
	 */
	public Adapter createShowToastOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.EntityRefrence <em>Entity Refrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.EntityRefrence
	 * @generated
	 */
	public Adapter createEntityRefrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GridContainer <em>Grid Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GridContainer
	 * @generated
	 */
	public Adapter createGridContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GridEvent <em>Grid Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GridEvent
	 * @generated
	 */
	public Adapter createGridEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GridStyle <em>Grid Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GridStyle
	 * @generated
	 */
	public Adapter createGridStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ChangeIndex <em>Change Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ChangeIndex
	 * @generated
	 */
	public Adapter createChangeIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.TabContentStyle <em>Tab Content Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.TabContentStyle
	 * @generated
	 */
	public Adapter createTabContentStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GridItemContainer <em>Grid Item Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GridItemContainer
	 * @generated
	 */
	public Adapter createGridItemContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SearchWidget <em>Search Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SearchWidget
	 * @generated
	 */
	public Adapter createSearchWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SearchEvent <em>Search Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SearchEvent
	 * @generated
	 */
	public Adapter createSearchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.SearchStyle <em>Search Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.SearchStyle
	 * @generated
	 */
	public Adapter createSearchStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.BlankWidget <em>Blank Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.BlankWidget
	 * @generated
	 */
	public Adapter createBlankWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.BlankStyle <em>Blank Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.BlankStyle
	 * @generated
	 */
	public Adapter createBlankStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ProgressWidget <em>Progress Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ProgressWidget
	 * @generated
	 */
	public Adapter createProgressWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ProgressStyle <em>Progress Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ProgressStyle
	 * @generated
	 */
	public Adapter createProgressStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.ProgressEvent <em>Progress Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.ProgressEvent
	 * @generated
	 */
	public Adapter createProgressEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.LineContainer <em>Line Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.LineContainer
	 * @generated
	 */
	public Adapter createLineContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.LineEvent <em>Line Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.LineEvent
	 * @generated
	 */
	public Adapter createLineEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.LineStyle
	 * @generated
	 */
	public Adapter createLineStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.WorkOperation <em>Work Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.WorkOperation
	 * @generated
	 */
	public Adapter createWorkOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GridItemStyle <em>Grid Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GridItemStyle
	 * @generated
	 */
	public Adapter createGridItemStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arkuimodel.arkUIModel.GridItemEvent <em>Grid Item Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arkuimodel.arkUIModel.GridItemEvent
	 * @generated
	 */
	public Adapter createGridItemEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArkUIModelAdapterFactory
