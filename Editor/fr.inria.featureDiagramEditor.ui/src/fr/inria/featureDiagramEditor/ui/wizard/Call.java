/*******************************************************************************
 * Copyright (c) 2010-2012 Marie Gouyette.
 * INRIA-IRISA- Triskell
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     INRIA-IRISA- Triskell
 *     Marie Gouyette - initial API and implementation
 *     contact marie.gouyette@gmail.com
 ******************************************************************************/
package fr.inria.featureDiagramEditor.ui.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;


import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DView;
import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;
import fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction;
import fr.obeo.dsl.common.tools.api.interpreter.IInterpreter;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.*;

/** 
 * This class is called when an user right click on a feature in the Feature Diagram Editor -> Add Domain Model Element.
 * It references the Domain Model Element selected in a wizard in the feature.
 * This is an old way to reference Domain Model Elements in a feature. A better way is using a drag and drop as presented in the documentation.
 * */
public class Call implements IExternalJavaAction {
	
	/** Determines when this IExternalJavaAction can be executed, here always. */
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	/** This method defines the treatment during the execution of this action. */
	public void execute(Collection<? extends EObject> arg0,
			Map<String, Object> arg1) {
		Object [] listParameter = arg0.toArray();
		EObject model = (EObject)(listParameter[0]); // Retrieve the first parameter
		DomainModelElementTreatment treatment = DomainModelElementTreatment.getInstance();
		
		// Add the Domain Model Element in the Feature where popup menu was executed.
		treatment.addDomainModelElement(model);
		
		//ADDED TO RESOLVE A BUG
		treatment.setCanUse(!treatment.getCanUse());
	}
}
