/********************************************************************************
 * Copyright (c) 2010-2011 INRIA/IRISA. MOVIDA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marie Gouyette - initial API and implementation
*      marie.gouyette@inria.fr
 ******************************************************************************/
package fr.inria.baseModelOptionalDecorator.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import fr.inria.generic_decorator.core.addDecorator.AddDecorator;
import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;
import fr.obeo.dsl.viewpoint.description.Position;
import fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction;

/**
 * @author mgouyett
 * This class defines an action that can be called though a menu. It add the decorator on a given representation.
 * This code is interpreted and not serialized, we need to call this action at each start of Eclipse.
 *
 */
public class OptionalDecoratorAction implements IExternalJavaAction {
	
	public final String FEATURE_DIAGRAM = "FeatureDiagram";

	/* (non-Javadoc)
	 * @see fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction#canExecute(java.util.Collection)
	 */
	
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction#execute(java.util.Collection, java.util.Map)
	 */
	
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		// Bug execution Obeo
		//------------------------------------------------------------------
		if (SolveBugTwoTimes.getInstance().getCanExecute()){
		//------------------------------------------------------------------
		 // Retrieve Feature Diagram object
		 EObject featureDiagram = (EObject)  parameters.get(FEATURE_DIAGRAM);
		 // Retrieve Obeo Designer session
		 Session session = SessionManager.INSTANCE.getSession(featureDiagram);
		
		 // AddDecorator : class used to add a decorator dynamically
		 AddDecorator addDecorator = new AddDecorator();
		 
		 // Icon decorator path
		 String decoratorPath = "/fr.inria.baseModelOptionalDecorator/icons/optional.png";
		 // Position where decorator will be added
		 Position position = Position.NORTH_EAST_LITERAL;
		 // Precondition where a decorator will be displayed
		 String preconditionExpression = "<%(self + self.ancestor).~modelElements.owningOperator.filter(\"Opt\") > 0%>";
		 // Name that will be used in the Obeo Designer 's layers to display your new layer 
		 String typeDecoratorName = "Optional";
		 
		 // This method adds dynamically a decorator on object of a given metaclass (here EObject for all objects in the model)
		 addDecorator.addDecorator(decoratorPath, position, preconditionExpression, "EObject", session, typeDecoratorName);
		
		 // Says to user that decorator is added
		 MessageDialog.openInformation(
					new Shell(),
					"Add  optional 2 decorator",
					"Optional Decorator added");	
		 
		 System.out.println("ADD OPTIONAL DECORATOR EXECUTED");
		
		//----------------------------------------------------------
		}
		SolveBugTwoTimes.getInstance().setCanExecute(SolveBugTwoTimes.getInstance().getCanExecute());
		//----------------------------------------------------------
		
	}

}

