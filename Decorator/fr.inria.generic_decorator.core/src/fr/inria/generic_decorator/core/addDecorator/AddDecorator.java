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
package fr.inria.generic_decorator.core.addDecorator;



import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.viewpoint.Decoration;
import fr.obeo.dsl.viewpoint.ViewpointFactory;
import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.description.DecorationDescriptionsSet;
import fr.obeo.dsl.viewpoint.description.DescriptionFactory;
import fr.obeo.dsl.viewpoint.description.DiagramDescription;
import fr.obeo.dsl.viewpoint.description.OptionalLayer;
import fr.obeo.dsl.viewpoint.description.Position;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.description.SemanticBasedDecoration;
import fr.obeo.dsl.viewpoint.description.Viewpoint;


/** 
 * This method adds a given decorator to some  kind of objects according  to a given condition.
 * The decorator is not serialized, we need to call these methods at all begin of Eclipse
 * @author mgouyett
 *
 */
public class AddDecorator  {
	
	
	/** Adds a given decorator to some  kind of objects according  to a given condition
	 @param decoratorPath : path to the decorator icon such as /myProject/icons/MyIcon.png 
	 @param postion : position where the decorator will be added ( NORTH, SOUTH ...)
	 @param preconditionExpression : expression in Acceleo to define when we want to display the decorator
	 @param domainClass : the domainClass on which a decorator will be applied
	 @param session : the session that contains diagram on which this decorator will be applied
	 @param typeDecoratorName : the name of the type of the decorator (to be added in the layer name)
	 
	 */
	public void addDecorator (String decoratorPath, Position position, String preconditionExpression, String domainClass, Session session, String typeDecoratorName) {
	

		for ( Viewpoint viewpoint : session.getSelectedViewpoints()) {
		// Determines whether the viewpoint has a diagram view
		//String viewpointPath = viewpoint.eResource().getURI().path().toString();
		
		for (RepresentationDescription representation : viewpoint.getOwnedRepresentations()) {
			if (isDiagramRepresentation(representation)) {
				addDecoratorLayer ((DiagramDescription) representation, viewpoint.getName(), decoratorPath, position,  preconditionExpression,  domainClass, typeDecoratorName);
			}
			else {
				
			} 
		}
		
		
		
	}
	}
	
	/** Determines whether a given RepresentationDescription is for a diagram or not
	 @param desc : the tested RepresentationDescritption
	 @result : true if the representation is a diagram, false otherwise */
	public boolean isDiagramRepresentation(RepresentationDescription desc) {
		return desc instanceof DiagramDescription;
	}
	
	
	/** Add a new layer with the new decorator to a given digram
	 @param diagramDescription : the diagramDescritption of the selected DiagramRepresentation
	 @param viewpointName : the name of the viewpoint that has this diagram representation
	 @param decoratorPath : the path to the decorator icon
	 @param position : the future position of the decorator
	 @param preconditionExpression : expression in Acceleo to define when we want to display the decorator
	 @param domainClass : the domainClass on which a decorator will be applied 
	 */
	public void addDecoratorLayer (DiagramDescription diagramDescription, String viewpointName, String decoratorPath, Position position, String preconditionExpression, String domainClass,  String typeDecoratorName)
		 {
		// Create a new optional layer for the viewpoint
		OptionalLayer optionalLayer =  DescriptionFactory.eINSTANCE.createOptionalLayer();
		optionalLayer.setName(viewpointName +  " " +typeDecoratorName +  " decorator");
		optionalLayer.setLabel(viewpointName +  " " +typeDecoratorName +  " decorator");
		// later setIcon
		
		// Add a decoration element
		Decoration decoration = ViewpointFactory.eINSTANCE.createDecoration();
		
		//Add the semantic based decoration element
		SemanticBasedDecoration semBaseDecoration = DescriptionFactory.eINSTANCE.createSemanticBasedDecoration();
		semBaseDecoration.setName(viewpointName + " decorator");
		semBaseDecoration.setDomainClass(domainClass);
		semBaseDecoration.setPosition(position);
		semBaseDecoration.setDecoratorPath(decoratorPath);
		semBaseDecoration.setPreconditionExpression(preconditionExpression);
		decoration.setDescription(semBaseDecoration);
		
		// Add decoration to a DecorationDescriptionsSet
		DecorationDescriptionsSet decSet = DescriptionFactory.eINSTANCE.createDecorationDescriptionsSet();
		decSet.getDecorationDescriptions().add(semBaseDecoration);
		
		// Add DecorationDescriptionsSet to the optional layer
		optionalLayer.setDecorationDescriptionsSet(decSet);
		
		// add the optional layer to the diagram representation
		diagramDescription.getOptionalLayers().add(optionalLayer);
		optionalLayer.setActiveByDefault(true);
	}

	

}
