/**
 */
package arkuimodel.arkUIModel.util;

import arkuimodel.arkUIModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arkuimodel.arkUIModel.ArkUIModelPackage
 * @generated
 */
public class ArkUIModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArkUIModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArkUIModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ArkUIModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ArkUIModelPackage.GUI_MODEL: {
			GUIModel guiModel = (GUIModel) theEObject;
			T result = caseGUIModel(guiModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.UI_LOGIC: {
			UILogic uiLogic = (UILogic) theEObject;
			T result = caseUILogic(uiLogic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.UI_DESIGN: {
			UIDesign uiDesign = (UIDesign) theEObject;
			T result = caseUIDesign(uiDesign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PAGE_STRUCT: {
			PageStruct pageStruct = (PageStruct) theEObject;
			T result = casePageStruct(pageStruct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.UI_COMPONENT: {
			UIComponent uiComponent = (UIComponent) theEObject;
			T result = caseUIComponent(uiComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_WIDGET: {
			TextWidget textWidget = (TextWidget) theEObject;
			T result = caseTextWidget(textWidget);
			if (result == null)
				result = caseWidget(textWidget);
			if (result == null)
				result = caseUIComponent(textWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.BUTTON_WIDGET: {
			ButtonWidget buttonWidget = (ButtonWidget) theEObject;
			T result = caseButtonWidget(buttonWidget);
			if (result == null)
				result = caseWidget(buttonWidget);
			if (result == null)
				result = caseUIComponent(buttonWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.FLEX_CONTAINER: {
			FlexContainer flexContainer = (FlexContainer) theEObject;
			T result = caseFlexContainer(flexContainer);
			if (result == null)
				result = caseContainer(flexContainer);
			if (result == null)
				result = caseUIComponent(flexContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.STYLE_LIBRAY: {
			StyleLibray styleLibray = (StyleLibray) theEObject;
			T result = caseStyleLibray(styleLibray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.STYLE_CLASS: {
			StyleClass styleClass = (StyleClass) theEObject;
			T result = caseStyleClass(styleClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PRIMITIVE_OPERATION: {
			PrimitiveOperation primitiveOperation = (PrimitiveOperation) theEObject;
			T result = casePrimitiveOperation(primitiveOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_INPUT_WIDGET: {
			TextInputWidget textInputWidget = (TextInputWidget) theEObject;
			T result = caseTextInputWidget(textInputWidget);
			if (result == null)
				result = caseWidget(textInputWidget);
			if (result == null)
				result = caseUIComponent(textInputWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LIST_CONTAINER: {
			ListContainer listContainer = (ListContainer) theEObject;
			T result = caseListContainer(listContainer);
			if (result == null)
				result = caseContainer(listContainer);
			if (result == null)
				result = caseUIComponent(listContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_STYLE: {
			TextStyle textStyle = (TextStyle) theEObject;
			T result = caseTextStyle(textStyle);
			if (result == null)
				result = caseStyleClass(textStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_INPUT_STYLE: {
			TextInputStyle textInputStyle = (TextInputStyle) theEObject;
			T result = caseTextInputStyle(textInputStyle);
			if (result == null)
				result = caseStyleClass(textInputStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TYPE_CS: {
			TypeCS typeCS = (TypeCS) theEObject;
			T result = caseTypeCS(typeCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ROW_CONTAINER: {
			RowContainer rowContainer = (RowContainer) theEObject;
			T result = caseRowContainer(rowContainer);
			if (result == null)
				result = caseContainer(rowContainer);
			if (result == null)
				result = caseUIComponent(rowContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.COLUMN_CONTAINER: {
			ColumnContainer columnContainer = (ColumnContainer) theEObject;
			T result = caseColumnContainer(columnContainer);
			if (result == null)
				result = caseContainer(columnContainer);
			if (result == null)
				result = caseUIComponent(columnContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.BUTTON_STYLE: {
			ButtonStyle buttonStyle = (ButtonStyle) theEObject;
			T result = caseButtonStyle(buttonStyle);
			if (result == null)
				result = caseStyleClass(buttonStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.FLEX_STYLE: {
			FlexStyle flexStyle = (FlexStyle) theEObject;
			T result = caseFlexStyle(flexStyle);
			if (result == null)
				result = caseStyleClass(flexStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ROW_STYLE: {
			RowStyle rowStyle = (RowStyle) theEObject;
			T result = caseRowStyle(rowStyle);
			if (result == null)
				result = caseStyleClass(rowStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.COLUMN_STYLE: {
			ColumnStyle columnStyle = (ColumnStyle) theEObject;
			T result = caseColumnStyle(columnStyle);
			if (result == null)
				result = caseStyleClass(columnStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LIST_STYLE: {
			ListStyle listStyle = (ListStyle) theEObject;
			T result = caseListStyle(listStyle);
			if (result == null)
				result = caseStyleClass(listStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LIST_ITEM_STYLE: {
			ListItemStyle listItemStyle = (ListItemStyle) theEObject;
			T result = caseListItemStyle(listItemStyle);
			if (result == null)
				result = caseStyleClass(listItemStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LIST_ITEM_CONTAINER: {
			ListItemContainer listItemContainer = (ListItemContainer) theEObject;
			T result = caseListItemContainer(listItemContainer);
			if (result == null)
				result = caseContainer(listItemContainer);
			if (result == null)
				result = caseUIComponent(listItemContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.IMAGE_WIDGET: {
			ImageWidget imageWidget = (ImageWidget) theEObject;
			T result = caseImageWidget(imageWidget);
			if (result == null)
				result = caseWidget(imageWidget);
			if (result == null)
				result = caseUIComponent(imageWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.IMAGE_STYLE: {
			ImageStyle imageStyle = (ImageStyle) theEObject;
			T result = caseImageStyle(imageStyle);
			if (result == null)
				result = caseStyleClass(imageStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow(controlFlow);
			if (result == null)
				result = casePrimitiveOperation(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TRIGGER_EVENT: {
			TriggerEvent triggerEvent = (TriggerEvent) theEObject;
			T result = caseTriggerEvent(triggerEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PAGE_EVENT: {
			PageEvent pageEvent = (PageEvent) theEObject;
			T result = casePageEvent(pageEvent);
			if (result == null)
				result = caseEvent(pageEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.COLUMN_EVENT: {
			ColumnEvent columnEvent = (ColumnEvent) theEObject;
			T result = caseColumnEvent(columnEvent);
			if (result == null)
				result = caseEvent(columnEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ROW_EVENT: {
			RowEvent rowEvent = (RowEvent) theEObject;
			T result = caseRowEvent(rowEvent);
			if (result == null)
				result = caseEvent(rowEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.FLEX_EVENT: {
			FlexEvent flexEvent = (FlexEvent) theEObject;
			T result = caseFlexEvent(flexEvent);
			if (result == null)
				result = caseEvent(flexEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.IMAGE_EVENT: {
			ImageEvent imageEvent = (ImageEvent) theEObject;
			T result = caseImageEvent(imageEvent);
			if (result == null)
				result = caseEvent(imageEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_EVENT: {
			TextEvent textEvent = (TextEvent) theEObject;
			T result = caseTextEvent(textEvent);
			if (result == null)
				result = caseEvent(textEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.BUTTON_EVENT: {
			ButtonEvent buttonEvent = (ButtonEvent) theEObject;
			T result = caseButtonEvent(buttonEvent);
			if (result == null)
				result = caseEvent(buttonEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_INPUT_EVENT: {
			TextInputEvent textInputEvent = (TextInputEvent) theEObject;
			T result = caseTextInputEvent(textInputEvent);
			if (result == null)
				result = caseEvent(textInputEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LIST_EVENT: {
			ListEvent listEvent = (ListEvent) theEObject;
			T result = caseListEvent(listEvent);
			if (result == null)
				result = caseEvent(listEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LIST_ITEM_EVENT: {
			ListItemEvent listItemEvent = (ListItemEvent) theEObject;
			T result = caseListItemEvent(listItemEvent);
			if (result == null)
				result = caseEvent(listItemEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.UI_OPERATION: {
			UIOperation uiOperation = (UIOperation) theEObject;
			T result = caseUIOperation(uiOperation);
			if (result == null)
				result = casePrimitiveOperation(uiOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SEVICE_OPERATION: {
			SeviceOperation seviceOperation = (SeviceOperation) theEObject;
			T result = caseSeviceOperation(seviceOperation);
			if (result == null)
				result = casePrimitiveOperation(seviceOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LOOP_OP: {
			LoopOp loopOp = (LoopOp) theEObject;
			T result = caseLoopOp(loopOp);
			if (result == null)
				result = caseControlFlow(loopOp);
			if (result == null)
				result = casePrimitiveOperation(loopOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CASE_OP: {
			CaseOp caseOp = (CaseOp) theEObject;
			T result = caseCaseOp(caseOp);
			if (result == null)
				result = caseControlFlow(caseOp);
			if (result == null)
				result = casePrimitiveOperation(caseOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.HTTP_OPERATION: {
			HttpOperation httpOperation = (HttpOperation) theEObject;
			T result = caseHttpOperation(httpOperation);
			if (result == null)
				result = caseSeviceOperation(httpOperation);
			if (result == null)
				result = casePrimitiveOperation(httpOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.GET_PARAMETER: {
			GetParameter getParameter = (GetParameter) theEObject;
			T result = caseGetParameter(getParameter);
			if (result == null)
				result = caseUIOperation(getParameter);
			if (result == null)
				result = casePrimitiveOperation(getParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SET_PARAMETER: {
			SetParameter setParameter = (SetParameter) theEObject;
			T result = caseSetParameter(setParameter);
			if (result == null)
				result = caseUIOperation(setParameter);
			if (result == null)
				result = casePrimitiveOperation(setParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ANIMATION_CLASS: {
			AnimationClass animationClass = (AnimationClass) theEObject;
			T result = caseAnimationClass(animationClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.IMAGE_ANIMATOR: {
			ImageAnimator imageAnimator = (ImageAnimator) theEObject;
			T result = caseImageAnimator(imageAnimator);
			if (result == null)
				result = caseWidget(imageAnimator);
			if (result == null)
				result = caseUIComponent(imageAnimator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.IMAGES_ITEM: {
			ImagesItem imagesItem = (ImagesItem) theEObject;
			T result = caseImagesItem(imagesItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.IMAGE_ANIMATOR_STYLE: {
			ImageAnimatorStyle imageAnimatorStyle = (ImageAnimatorStyle) theEObject;
			T result = caseImageAnimatorStyle(imageAnimatorStyle);
			if (result == null)
				result = caseStyleClass(imageAnimatorStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.IMAGE_ANIMATOR_EVENT: {
			ImageAnimatorEvent imageAnimatorEvent = (ImageAnimatorEvent) theEObject;
			T result = caseImageAnimatorEvent(imageAnimatorEvent);
			if (result == null)
				result = caseEvent(imageAnimatorEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ROUTE_SKIP: {
			RouteSkip routeSkip = (RouteSkip) theEObject;
			T result = caseRouteSkip(routeSkip);
			if (result == null)
				result = caseUIOperation(routeSkip);
			if (result == null)
				result = casePrimitiveOperation(routeSkip);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.GET_ROUTE_VALUE: {
			GetRouteValue getRouteValue = (GetRouteValue) theEObject;
			T result = caseGetRouteValue(getRouteValue);
			if (result == null)
				result = caseUIOperation(getRouteValue);
			if (result == null)
				result = casePrimitiveOperation(getRouteValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.EXTRA_OPERATION: {
			ExtraOperation extraOperation = (ExtraOperation) theEObject;
			T result = caseExtraOperation(extraOperation);
			if (result == null)
				result = casePrimitiveOperation(extraOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SEQ_OP: {
			SeqOp seqOp = (SeqOp) theEObject;
			T result = caseSeqOp(seqOp);
			if (result == null)
				result = caseControlFlow(seqOp);
			if (result == null)
				result = casePrimitiveOperation(seqOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.UI_STRUCT: {
			UIStruct uiStruct = (UIStruct) theEObject;
			T result = caseUIStruct(uiStruct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ANIMATION_LIBRAY: {
			AnimationLibray animationLibray = (AnimationLibray) theEObject;
			T result = caseAnimationLibray(animationLibray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = caseUIComponent(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.WIDGET: {
			Widget widget = (Widget) theEObject;
			T result = caseWidget(widget);
			if (result == null)
				result = caseUIComponent(widget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = caseTypeCS(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ENTITY_ATTRIBUTE: {
			EntityAttribute entityAttribute = (EntityAttribute) theEObject;
			T result = caseEntityAttribute(entityAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ARRAY: {
			Array array = (Array) theEObject;
			T result = caseArray(array);
			if (result == null)
				result = caseTypeCS(array);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.NAVIGATION_CONTAINER: {
			NavigationContainer navigationContainer = (NavigationContainer) theEObject;
			T result = caseNavigationContainer(navigationContainer);
			if (result == null)
				result = caseContainer(navigationContainer);
			if (result == null)
				result = caseUIComponent(navigationContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.NAVIGATION_STYLE: {
			NavigationStyle navigationStyle = (NavigationStyle) theEObject;
			T result = caseNavigationStyle(navigationStyle);
			if (result == null)
				result = caseStyleClass(navigationStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.NAVIGATION_EVENT: {
			NavigationEvent navigationEvent = (NavigationEvent) theEObject;
			T result = caseNavigationEvent(navigationEvent);
			if (result == null)
				result = caseEvent(navigationEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CONTAINER_ITEM: {
			ContainerItem containerItem = (ContainerItem) theEObject;
			T result = caseContainerItem(containerItem);
			if (result == null)
				result = caseContainer(containerItem);
			if (result == null)
				result = caseUIComponent(containerItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CONTAINER_ITEMS: {
			ContainerItems containerItems = (ContainerItems) theEObject;
			T result = caseContainerItems(containerItems);
			if (result == null)
				result = caseContainer(containerItems);
			if (result == null)
				result = caseUIComponent(containerItems);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.START_OP: {
			StartOp startOp = (StartOp) theEObject;
			T result = caseStartOp(startOp);
			if (result == null)
				result = caseControlFlow(startOp);
			if (result == null)
				result = casePrimitiveOperation(startOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.END_OP: {
			EndOp endOp = (EndOp) theEObject;
			T result = caseEndOp(endOp);
			if (result == null)
				result = caseControlFlow(endOp);
			if (result == null)
				result = casePrimitiveOperation(endOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.WORK_FLOW: {
			WorkFlow workFlow = (WorkFlow) theEObject;
			T result = caseWorkFlow(workFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CHECK_EQUAL: {
			CheckEqual checkEqual = (CheckEqual) theEObject;
			T result = caseCheckEqual(checkEqual);
			if (result == null)
				result = caseExtraOperation(checkEqual);
			if (result == null)
				result = casePrimitiveOperation(checkEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.FLOW_LINE: {
			FlowLine flowLine = (FlowLine) theEObject;
			T result = caseFlowLine(flowLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.FOR_EACH: {
			ForEach forEach = (ForEach) theEObject;
			T result = caseForEach(forEach);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.IF: {
			IF if_ = (IF) theEObject;
			T result = caseIF(if_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CALL_FUN: {
			CallFun callFun = (CallFun) theEObject;
			T result = caseCallFun(callFun);
			if (result == null)
				result = caseTypeCS(callFun);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SWIPER_WIDGET: {
			SwiperWidget swiperWidget = (SwiperWidget) theEObject;
			T result = caseSwiperWidget(swiperWidget);
			if (result == null)
				result = caseContainer(swiperWidget);
			if (result == null)
				result = caseUIComponent(swiperWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SWIPER_STYLE: {
			SwiperStyle swiperStyle = (SwiperStyle) theEObject;
			T result = caseSwiperStyle(swiperStyle);
			if (result == null)
				result = caseStyleClass(swiperStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SWIPER_EVENT: {
			SwiperEvent swiperEvent = (SwiperEvent) theEObject;
			T result = caseSwiperEvent(swiperEvent);
			if (result == null)
				result = caseEvent(swiperEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.OPERATION_LIBRAY: {
			OperationLibray operationLibray = (OperationLibray) theEObject;
			T result = caseOperationLibray(operationLibray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PAGE_REFRENCE: {
			PageRefrence pageRefrence = (PageRefrence) theEObject;
			T result = casePageRefrence(pageRefrence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TABS_CONTAINER: {
			TabsContainer tabsContainer = (TabsContainer) theEObject;
			T result = caseTabsContainer(tabsContainer);
			if (result == null)
				result = caseContainer(tabsContainer);
			if (result == null)
				result = caseUIComponent(tabsContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TAB_CONTENT: {
			TabContent tabContent = (TabContent) theEObject;
			T result = caseTabContent(tabContent);
			if (result == null)
				result = caseContainer(tabContent);
			if (result == null)
				result = caseUIComponent(tabContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TABS_STYLE: {
			TabsStyle tabsStyle = (TabsStyle) theEObject;
			T result = caseTabsStyle(tabsStyle);
			if (result == null)
				result = caseStyleClass(tabsStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TAB_ITEM: {
			TabItem tabItem = (TabItem) theEObject;
			T result = caseTabItem(tabItem);
			if (result == null)
				result = caseContainer(tabItem);
			if (result == null)
				result = caseUIComponent(tabItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TABS_EVENT: {
			TabsEvent tabsEvent = (TabsEvent) theEObject;
			T result = caseTabsEvent(tabsEvent);
			if (result == null)
				result = caseEvent(tabsEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.STACK_CONTAINER: {
			StackContainer stackContainer = (StackContainer) theEObject;
			T result = caseStackContainer(stackContainer);
			if (result == null)
				result = caseContainer(stackContainer);
			if (result == null)
				result = caseUIComponent(stackContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.STACK_EVENT: {
			StackEvent stackEvent = (StackEvent) theEObject;
			T result = caseStackEvent(stackEvent);
			if (result == null)
				result = caseEvent(stackEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.STACK_STYLE: {
			StackStyle stackStyle = (StackStyle) theEObject;
			T result = caseStackStyle(stackStyle);
			if (result == null)
				result = caseStyleClass(stackStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SCROLL_CONTAINER: {
			ScrollContainer scrollContainer = (ScrollContainer) theEObject;
			T result = caseScrollContainer(scrollContainer);
			if (result == null)
				result = caseContainer(scrollContainer);
			if (result == null)
				result = caseUIComponent(scrollContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SCROLL_EVENT: {
			ScrollEvent scrollEvent = (ScrollEvent) theEObject;
			T result = caseScrollEvent(scrollEvent);
			if (result == null)
				result = caseEvent(scrollEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SCROLL_STYLE: {
			ScrollStyle scrollStyle = (ScrollStyle) theEObject;
			T result = caseScrollStyle(scrollStyle);
			if (result == null)
				result = caseStyleClass(scrollStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SCROLLER: {
			Scroller scroller = (Scroller) theEObject;
			T result = caseScroller(scroller);
			if (result == null)
				result = caseUIOperation(scroller);
			if (result == null)
				result = casePrimitiveOperation(scroller);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TOGGLE_WIDGET: {
			ToggleWidget toggleWidget = (ToggleWidget) theEObject;
			T result = caseToggleWidget(toggleWidget);
			if (result == null)
				result = caseWidget(toggleWidget);
			if (result == null)
				result = caseUIComponent(toggleWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TOGGLE_EVENT: {
			ToggleEvent toggleEvent = (ToggleEvent) theEObject;
			T result = caseToggleEvent(toggleEvent);
			if (result == null)
				result = caseEvent(toggleEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TOGGLE_STYLE: {
			ToggleStyle toggleStyle = (ToggleStyle) theEObject;
			T result = caseToggleStyle(toggleStyle);
			if (result == null)
				result = caseStyleClass(toggleStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TIME_PICKER_WIDGET: {
			TimePickerWidget timePickerWidget = (TimePickerWidget) theEObject;
			T result = caseTimePickerWidget(timePickerWidget);
			if (result == null)
				result = caseWidget(timePickerWidget);
			if (result == null)
				result = caseUIComponent(timePickerWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TIME_PICKER_EVENT: {
			TimePickerEvent timePickerEvent = (TimePickerEvent) theEObject;
			T result = caseTimePickerEvent(timePickerEvent);
			if (result == null)
				result = caseEvent(timePickerEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TIME_PICKER_STYLE: {
			TimePickerStyle timePickerStyle = (TimePickerStyle) theEObject;
			T result = caseTimePickerStyle(timePickerStyle);
			if (result == null)
				result = caseStyleClass(timePickerStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.DATE_PICKER_WIDGET: {
			DatePickerWidget datePickerWidget = (DatePickerWidget) theEObject;
			T result = caseDatePickerWidget(datePickerWidget);
			if (result == null)
				result = caseWidget(datePickerWidget);
			if (result == null)
				result = caseUIComponent(datePickerWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.DATE_PICKER_EVENT: {
			DatePickerEvent datePickerEvent = (DatePickerEvent) theEObject;
			T result = caseDatePickerEvent(datePickerEvent);
			if (result == null)
				result = caseEvent(datePickerEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.DATE_PICKER_STYLE: {
			DatePickerStyle datePickerStyle = (DatePickerStyle) theEObject;
			T result = caseDatePickerStyle(datePickerStyle);
			if (result == null)
				result = caseStyleClass(datePickerStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_PICKER_WIDGET: {
			TextPickerWidget textPickerWidget = (TextPickerWidget) theEObject;
			T result = caseTextPickerWidget(textPickerWidget);
			if (result == null)
				result = caseWidget(textPickerWidget);
			if (result == null)
				result = caseUIComponent(textPickerWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_PICKER_EVENT: {
			TextPickerEvent textPickerEvent = (TextPickerEvent) theEObject;
			T result = caseTextPickerEvent(textPickerEvent);
			if (result == null)
				result = caseEvent(textPickerEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TEXT_PICKER_STYLE: {
			TextPickerStyle textPickerStyle = (TextPickerStyle) theEObject;
			T result = caseTextPickerStyle(textPickerStyle);
			if (result == null)
				result = caseStyleClass(textPickerStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.DIVIDER_WIDGET: {
			DividerWidget dividerWidget = (DividerWidget) theEObject;
			T result = caseDividerWidget(dividerWidget);
			if (result == null)
				result = caseWidget(dividerWidget);
			if (result == null)
				result = caseUIComponent(dividerWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.DIVIDER_STYLE: {
			DividerStyle dividerStyle = (DividerStyle) theEObject;
			T result = caseDividerStyle(dividerStyle);
			if (result == null)
				result = caseStyleClass(dividerStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CUSTOM_DIALOG_CONTAINER: {
			CustomDialogContainer customDialogContainer = (CustomDialogContainer) theEObject;
			T result = caseCustomDialogContainer(customDialogContainer);
			if (result == null)
				result = caseContainer(customDialogContainer);
			if (result == null)
				result = caseUIComponent(customDialogContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CUSTOM_DIALOG_STYLE: {
			CustomDialogStyle customDialogStyle = (CustomDialogStyle) theEObject;
			T result = caseCustomDialogStyle(customDialogStyle);
			if (result == null)
				result = caseStyleClass(customDialogStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CUSTOM_DIALOG_EVENT: {
			CustomDialogEvent customDialogEvent = (CustomDialogEvent) theEObject;
			T result = caseCustomDialogEvent(customDialogEvent);
			if (result == null)
				result = caseEvent(customDialogEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.OPEN_DIALOG: {
			OpenDialog openDialog = (OpenDialog) theEObject;
			T result = caseOpenDialog(openDialog);
			if (result == null)
				result = caseUIOperation(openDialog);
			if (result == null)
				result = casePrimitiveOperation(openDialog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CLOSE_DIALOG: {
			CloseDialog closeDialog = (CloseDialog) theEObject;
			T result = caseCloseDialog(closeDialog);
			if (result == null)
				result = caseUIOperation(closeDialog);
			if (result == null)
				result = casePrimitiveOperation(closeDialog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.DATA_PREFERENCES: {
			DataPreferences dataPreferences = (DataPreferences) theEObject;
			T result = caseDataPreferences(dataPreferences);
			if (result == null)
				result = caseUIOperation(dataPreferences);
			if (result == null)
				result = casePrimitiveOperation(dataPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TERMINATE_SELF: {
			TerminateSelf terminateSelf = (TerminateSelf) theEObject;
			T result = caseTerminateSelf(terminateSelf);
			if (result == null)
				result = caseUIOperation(terminateSelf);
			if (result == null)
				result = casePrimitiveOperation(terminateSelf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SET_TIME_OUT: {
			SetTimeOut setTimeOut = (SetTimeOut) theEObject;
			T result = caseSetTimeOut(setTimeOut);
			if (result == null)
				result = caseUIOperation(setTimeOut);
			if (result == null)
				result = casePrimitiveOperation(setTimeOut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CLEAR_TIME_OUT: {
			ClearTimeOut clearTimeOut = (ClearTimeOut) theEObject;
			T result = caseClearTimeOut(clearTimeOut);
			if (result == null)
				result = caseUIOperation(clearTimeOut);
			if (result == null)
				result = casePrimitiveOperation(clearTimeOut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SHOW_TOAST_OPTIONS: {
			ShowToastOptions showToastOptions = (ShowToastOptions) theEObject;
			T result = caseShowToastOptions(showToastOptions);
			if (result == null)
				result = caseUIOperation(showToastOptions);
			if (result == null)
				result = casePrimitiveOperation(showToastOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.DOMAIN_MODEL: {
			DomainModel domainModel = (DomainModel) theEObject;
			T result = caseDomainModel(domainModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.ENTITY_REFRENCE: {
			EntityRefrence entityRefrence = (EntityRefrence) theEObject;
			T result = caseEntityRefrence(entityRefrence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.GRID_CONTAINER: {
			GridContainer gridContainer = (GridContainer) theEObject;
			T result = caseGridContainer(gridContainer);
			if (result == null)
				result = caseContainer(gridContainer);
			if (result == null)
				result = caseUIComponent(gridContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.GRID_EVENT: {
			GridEvent gridEvent = (GridEvent) theEObject;
			T result = caseGridEvent(gridEvent);
			if (result == null)
				result = caseEvent(gridEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.GRID_STYLE: {
			GridStyle gridStyle = (GridStyle) theEObject;
			T result = caseGridStyle(gridStyle);
			if (result == null)
				result = caseStyleClass(gridStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.CHANGE_INDEX: {
			ChangeIndex changeIndex = (ChangeIndex) theEObject;
			T result = caseChangeIndex(changeIndex);
			if (result == null)
				result = caseUIOperation(changeIndex);
			if (result == null)
				result = casePrimitiveOperation(changeIndex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.TAB_CONTENT_STYLE: {
			TabContentStyle tabContentStyle = (TabContentStyle) theEObject;
			T result = caseTabContentStyle(tabContentStyle);
			if (result == null)
				result = caseStyleClass(tabContentStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.GRID_ITEM_CONTAINER: {
			GridItemContainer gridItemContainer = (GridItemContainer) theEObject;
			T result = caseGridItemContainer(gridItemContainer);
			if (result == null)
				result = caseContainer(gridItemContainer);
			if (result == null)
				result = caseUIComponent(gridItemContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SEARCH_WIDGET: {
			SearchWidget searchWidget = (SearchWidget) theEObject;
			T result = caseSearchWidget(searchWidget);
			if (result == null)
				result = caseWidget(searchWidget);
			if (result == null)
				result = caseUIComponent(searchWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SEARCH_EVENT: {
			SearchEvent searchEvent = (SearchEvent) theEObject;
			T result = caseSearchEvent(searchEvent);
			if (result == null)
				result = caseEvent(searchEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.SEARCH_STYLE: {
			SearchStyle searchStyle = (SearchStyle) theEObject;
			T result = caseSearchStyle(searchStyle);
			if (result == null)
				result = caseStyleClass(searchStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.BLANK_WIDGET: {
			BlankWidget blankWidget = (BlankWidget) theEObject;
			T result = caseBlankWidget(blankWidget);
			if (result == null)
				result = caseWidget(blankWidget);
			if (result == null)
				result = caseUIComponent(blankWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.BLANK_STYLE: {
			BlankStyle blankStyle = (BlankStyle) theEObject;
			T result = caseBlankStyle(blankStyle);
			if (result == null)
				result = caseStyleClass(blankStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PROGRESS_WIDGET: {
			ProgressWidget progressWidget = (ProgressWidget) theEObject;
			T result = caseProgressWidget(progressWidget);
			if (result == null)
				result = caseWidget(progressWidget);
			if (result == null)
				result = caseUIComponent(progressWidget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PROGRESS_STYLE: {
			ProgressStyle progressStyle = (ProgressStyle) theEObject;
			T result = caseProgressStyle(progressStyle);
			if (result == null)
				result = caseStyleClass(progressStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.PROGRESS_EVENT: {
			ProgressEvent progressEvent = (ProgressEvent) theEObject;
			T result = caseProgressEvent(progressEvent);
			if (result == null)
				result = caseEvent(progressEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LINE_CONTAINER: {
			LineContainer lineContainer = (LineContainer) theEObject;
			T result = caseLineContainer(lineContainer);
			if (result == null)
				result = caseContainer(lineContainer);
			if (result == null)
				result = caseUIComponent(lineContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LINE_EVENT: {
			LineEvent lineEvent = (LineEvent) theEObject;
			T result = caseLineEvent(lineEvent);
			if (result == null)
				result = caseEvent(lineEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.LINE_STYLE: {
			LineStyle lineStyle = (LineStyle) theEObject;
			T result = caseLineStyle(lineStyle);
			if (result == null)
				result = caseStyleClass(lineStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.WORK_OPERATION: {
			WorkOperation workOperation = (WorkOperation) theEObject;
			T result = caseWorkOperation(workOperation);
			if (result == null)
				result = caseSeviceOperation(workOperation);
			if (result == null)
				result = casePrimitiveOperation(workOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.GRID_ITEM_STYLE: {
			GridItemStyle gridItemStyle = (GridItemStyle) theEObject;
			T result = caseGridItemStyle(gridItemStyle);
			if (result == null)
				result = caseStyleClass(gridItemStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArkUIModelPackage.GRID_ITEM_EVENT: {
			GridItemEvent gridItemEvent = (GridItemEvent) theEObject;
			T result = caseGridItemEvent(gridItemEvent);
			if (result == null)
				result = caseEvent(gridItemEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIModel(GUIModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Logic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Logic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUILogic(UILogic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIDesign(UIDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageStruct(PageStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIComponent(UIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextWidget(TextWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonWidget(ButtonWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flex Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flex Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlexContainer(FlexContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Libray</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Libray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleLibray(StyleLibray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleClass(StyleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveOperation(PrimitiveOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInputWidget(TextInputWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListContainer(ListContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextStyle(TextStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInputStyle(TextInputStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCS(TypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowContainer(RowContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnContainer(ColumnContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonStyle(ButtonStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flex Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flex Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlexStyle(FlexStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowStyle(RowStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnStyle(ColumnStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStyle(ListStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemStyle(ListItemStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemContainer(ListItemContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageWidget(ImageWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageStyle(ImageStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerEvent(TriggerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageEvent(PageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnEvent(ColumnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowEvent(RowEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flex Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flex Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlexEvent(FlexEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageEvent(ImageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextEvent(TextEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonEvent(ButtonEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInputEvent(TextInputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListEvent(ListEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemEvent(ListItemEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIOperation(UIOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sevice Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sevice Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeviceOperation(SeviceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopOp(LoopOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseOp(CaseOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpOperation(HttpOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetParameter(GetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetParameter(SetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animation Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animation Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimationClass(AnimationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Animator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Animator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageAnimator(ImageAnimator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Images Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Images Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagesItem(ImagesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Animator Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Animator Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageAnimatorStyle(ImageAnimatorStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Animator Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Animator Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageAnimatorEvent(ImageAnimatorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Skip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Skip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteSkip(RouteSkip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Route Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Route Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetRouteValue(GetRouteValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraOperation(ExtraOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seq Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeqOp(SeqOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIStruct(UIStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animation Libray</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animation Libray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimationLibray(AnimationLibray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAttribute(EntityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationContainer(NavigationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationStyle(NavigationStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationEvent(NavigationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerItem(ContainerItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerItems(ContainerItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartOp(StartOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndOp(EndOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkFlow(WorkFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckEqual(CheckEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLine(FlowLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEach(ForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIF(IF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Fun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Fun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallFun(CallFun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swiper Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swiper Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwiperWidget(SwiperWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swiper Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swiper Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwiperStyle(SwiperStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swiper Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swiper Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwiperEvent(SwiperEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Libray</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Libray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationLibray(OperationLibray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Refrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Refrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageRefrence(PageRefrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabs Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabs Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabsContainer(TabsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabContent(TabContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabs Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabs Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabsStyle(TabsStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabItem(TabItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabs Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabs Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabsEvent(TabsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackContainer(StackContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackEvent(StackEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackStyle(StackStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollContainer(ScrollContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollEvent(ScrollEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollStyle(ScrollStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScroller(Scroller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleWidget(ToggleWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleEvent(ToggleEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleStyle(ToggleStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Picker Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Picker Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePickerWidget(TimePickerWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Picker Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Picker Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePickerEvent(TimePickerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Picker Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Picker Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePickerStyle(TimePickerStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Picker Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Picker Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatePickerWidget(DatePickerWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Picker Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Picker Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatePickerEvent(DatePickerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Picker Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Picker Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatePickerStyle(DatePickerStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Picker Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Picker Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPickerWidget(TextPickerWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Picker Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Picker Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPickerEvent(TextPickerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Picker Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Picker Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPickerStyle(TextPickerStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divider Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divider Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDividerWidget(DividerWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divider Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divider Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDividerStyle(DividerStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Dialog Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Dialog Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDialogContainer(CustomDialogContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Dialog Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Dialog Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDialogStyle(CustomDialogStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Dialog Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Dialog Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDialogEvent(CustomDialogEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDialog(OpenDialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseDialog(CloseDialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPreferences(DataPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminate Self</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminate Self</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminateSelf(TerminateSelf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Time Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Time Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTimeOut(SetTimeOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Time Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Time Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearTimeOut(ClearTimeOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show Toast Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show Toast Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowToastOptions(ShowToastOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Refrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Refrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRefrence(EntityRefrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridContainer(GridContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridEvent(GridEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridStyle(GridStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeIndex(ChangeIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Content Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Content Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabContentStyle(TabContentStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Item Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Item Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridItemContainer(GridItemContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchWidget(SearchWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchEvent(SearchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchStyle(SearchStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlankWidget(BlankWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlankStyle(BlankStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressWidget(ProgressWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressStyle(ProgressStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressEvent(ProgressEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineContainer(LineContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineEvent(LineEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStyle(LineStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkOperation(WorkOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Item Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Item Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridItemStyle(GridItemStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Item Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Item Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridItemEvent(GridItemEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArkUIModelSwitch
