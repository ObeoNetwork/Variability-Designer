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
package fr.inria.product_derivation_engine.decorator.actions;

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
 * This class defines an action that can be called though a menu. It add the decorator on a given representation.
 * This code is interpreted and not serialized, we need to call this action at each start of Eclipse.
 * @author mgouyett
 *
 */
public class AddDerivationDecoratorAction implements IExternalJavaAction {
	
	
	public final String FEATURE_DIAGRAM = "FeatureDiagram";

	/* (non-Javadoc)
	 * @see fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction#canExecute(java.util.Collection)
	 */

	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	/* (non-Javadoc)
	 * @see fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction#execute(java.util.Collection, java.util.Map)
	 */
	
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		// Bug execution Obeo
		//------------------------------------------------------------------
	if (SolveTwoTimes.getInstance().getCanExecute()){
		//------------------------------------------------------------------
		 EObject featureDiagram = (EObject)  parameters.get(FEATURE_DIAGRAM);
		 Session session = SessionManager.INSTANCE.getSession(featureDiagram);
		
		 AddDecorator addDecorator = new AddDecorator();
		 String decoratorPath = "/fr.inria.product_derivation_engine.decorator/icons/unselected.png";
		 Position position = Position.SOUTH_EAST_LITERAL;
		 String preconditionExpression = "<%(self + self.ancestor).~modelElements.~feature.state == \"unselected\"%>";
		 String typeDecoratorName = "Derivation";
		 addDecorator.addDecorator(decoratorPath, position, preconditionExpression, "EObject", session, typeDecoratorName);
		
		 // Says to user that decorator is added
		 MessageDialog.openInformation(
					new Shell(),
					"Add  derivation decorator",
					"Derivation Decorator added");	
		 
		
		//----------------------------------------------------------
		}
		SolveTwoTimes.getInstance().setCanExecute(SolveTwoTimes.getInstance().getCanExecute());
		//----------------------------------------------------------
		
	} 

}

