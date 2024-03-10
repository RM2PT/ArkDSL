package com.rm2pt.arkmodelproject.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MArea;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallbackWithConfimation;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import arkuimodel.arkUIModel.ArkUIModelPackage;
import arkuimodel.arkUIModel.GUIModel;


public class ArkmodelProjectWizard extends BasicNewProjectResourceWizard{
	
	protected WizardNewProjectCreationPage newProjectPage;

	private String modelProject;

	private String siriusProject;
	private String projectName;
	private IProject topProject;

	protected IWorkbench workbench;

	protected IStructuredSelection selection;

	protected IPath genModelProjectLocation;

	protected IPath genModelContainerPath;
	InitModel initModel;
	public ArkmodelProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		this.workbench = workbench;
		this.selection = selection;
	}
	
	@Override
	public void addPages() {
		// add first page, where user can input the project name
		newProjectPage = new WizardNewProjectCreationPage("Project") {

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);
				Composite control = (Composite) getControl();

				createWorkingSetGroup(control, new StructuredSelection(),
						new String[] { "org.eclipse.jdt.ui.JavaWorkingSetPage", //$NON-NLS-1$
								"org.eclipse.pde.ui.pluginWorkingSet", "org.eclipse.ui.resourceWorkingSetPage" }); //$NON-NLS-1$ //$NON-NLS-2$
			}
		};
		newProjectPage.setInitialProjectName("");
		newProjectPage.setTitle("Create a Arkmodel Modeling Project");
		newProjectPage.setDescription("Enter a project name");
		newProjectPage.setPageComplete(false);
		addPage(newProjectPage);

	}
	
	@Override
	public boolean canFinish() {
		// when we can Finish
		if (getContainer().getCurrentPage() == newProjectPage) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean performFinish() {
		// when we click Finish, what will happen
		try {
			projectName = newProjectPage.getProjectName();
			modelProject = newProjectPage.getProjectName() + ".arkuimodel";
			siriusProject = newProjectPage.getProjectName() + ".aird";
			createModel();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	private void createModel() {
		final IProject projectHandle = newProjectPage.getProjectHandle();
		java.net.URI location = null;
		if (!newProjectPage.useDefaults()) {
			location = newProjectPage.getLocationURI();
		}
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription description = workspace.newProjectDescription(projectName);
		System.out.println("path is " + projectName);
		description.setLocationURI(location);
		IRunnableWithProgress op = monitor -> {
			CreateProjectOperation op1 = new CreateProjectOperation(description,
					ResourceMessages.NewProject_windowTitle);
			try {
				op1.execute(monitor, WorkspaceUndoUtil.getUIInfoAdapter(getShell()));
				topProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				IFile file = topProject.getFile(new Path("/" + modelProject)); 
				InputStream stream = new ByteArrayInputStream(InitModel.init(projectName).toString().getBytes());
				if (file.exists()) { 
					file.setContents(stream, true, true, monitor);
				} else {
					file.create(stream, true, monitor); 
				} 
				stream.close();
				System.out.println("============" + file.toString());
				IFile fileAird = topProject.getFile(new Path("/" + siriusProject));
//				InputStream stream2 = new ByteArrayInputStream(InitModel.initAird(modelProject).toString().getBytes());
//				System.out.println("============" + fileAird.toString());
//				if (fileAird.exists()) {
//					fileAird.setContents(stream2, true, true, monitor);
//				} else {
//					fileAird.create(stream2, true, monitor);
//				}
//				stream2.close();
//				
				URI representationsURI = URI.createPlatformResourceURI(fileAird.toString().substring(1), true);
				System.out.println("============" + representationsURI.toString());
				URI fileURI = URI.createPlatformResourceURI(file.toString().substring(1), true);
				SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(representationsURI, monitor);
				sessionCreationOperation.execute();
				Session session = sessionCreationOperation.getCreatedSession();
				TransactionalEditingDomain transdomain = session.getTransactionalEditingDomain();
				CommandStack stack = transdomain.getCommandStack();
				stack.execute(new AddSemanticResourceCommand(session, fileURI, monitor));  //TODO:这里用到textualModelURI
				session.save(monitor);
				Set<Viewpoint> availableViewpoints = ViewpointSelection.getViewpoints("arkUIModel"); //TODO: 这里应该是填文件后缀
				if (availableViewpoints.isEmpty()) 
					throw new Exception("Could not found viewpoint for ReqModel");
				Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
				for (Viewpoint p : availableViewpoints)
					viewpoints.add(SiriusResourceHelper.getCorrespondingViewpoint(session, p));
				
				ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();
				@SuppressWarnings("restriction")
				RecordingCommand command = new ChangeViewpointSelectionCommand(session, callback, viewpoints, new HashSet<Viewpoint>(), true, monitor);
				stack.execute(command);
				
				Resource rs = session.getSemanticResources().stream().findAny().get();
				EList<EObject> rsList = rs.getContents();
				ArrayList<EObject> delList = new ArrayList<>();
				GUIModel guimodel = null;
				for (EObject p : rsList) {
					if (p.eClass().getName().equals("GUIModel")) {
						guimodel = (GUIModel) p;
						break;
					}
				}
				
				//create base type
				//guimodel.setDescription(projectName);
				createSirius(session,monitor, guimodel, stack, "GUIModel", false);
							
				session.save(monitor);
			}catch (Exception e) {
			    e.printStackTrace();
				throw new InvocationTargetException(e);
			}
			
		};
		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
//			Throwable t = e.getTargetException();
//			if (t instanceof ExecutionException && t.getCause() instanceof CoreException) {
//				CoreException cause = (CoreException) t.getCause();
//				StatusAdapter status;
//				if (cause.getStatus().getCode() == IResourceStatus.CASE_VARIANT_EXISTS) {
//					status = new StatusAdapter(StatusUtil.newStatus(IStatus.WARNING,
//							NLS.bind(ResourceMessages.NewProject_caseVariantExistsError, projectHandle.getName()),
//							cause));
//				} else {
//					status = new StatusAdapter(StatusUtil.newStatus(cause.getStatus().getSeverity(),
//							ResourceMessages.NewProject_errorMessage, cause));
//				}
//				status.setProperty(StatusAdapter.TITLE_PROPERTY, ResourceMessages.NewProject_errorMessage);
//				StatusManager.getManager().handle(status, StatusManager.BLOCK);
//			} else {
//				StatusAdapter status = new StatusAdapter(new Status(IStatus.WARNING, IDEWorkbenchPlugin.IDE_WORKBENCH,
//						0, NLS.bind(ResourceMessages.NewProject_internalError, t.getMessage()), t));
//				status.setProperty(StatusAdapter.TITLE_PROPERTY, ResourceMessages.NewProject_errorMessage);
//				StatusManager.getManager().handle(status, StatusManager.LOG | StatusManager.BLOCK);
//			}
			e.printStackTrace();
		}
	}
	private void createSirius(Session session, IProgressMonitor monitor, EObject o, CommandStack stack, String name, boolean isOpen) throws Exception {
		Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), o);
		if (descriptions.isEmpty())
			throw new Exception("Could not found " + name);
		for (RepresentationDescription description : descriptions) {
			System.out.println(description.getName());
			CreateRepresentationCommand createViewCommand = new CreateRepresentationCommand(session, description, o, name, monitor);
			stack.execute(createViewCommand);
			SessionManager.INSTANCE.notifyRepresentationCreated(session);
			System.out.println(name);
			if (!isOpen)
				continue;
			Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(description, session);
			DRepresentation myDiagramRepresentation = representations.iterator().next();
			DialectUIManager dialectUIManager = DialectUIManager.INSTANCE;
			final DialectEditor editor = (DialectEditor) dialectUIManager.openEditor(session, myDiagramRepresentation, monitor);	
		}
	}
	
}
