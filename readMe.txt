/*******************************************************************************
 * Copyright (c) 2010-2012 mgouyett.
 * INRIA-IRISA- Triskell Team
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marie Gouyette - initial API and implementation
 * 	INRIA-IRISA- Triskell Team
 * 	contact : marie.gouyette@gmail.com
 ******************************************************************************/

All of these projects come from the INRIA Triskell team contribution on the ANR project MOVIDA.

On this variability tool we use four models :
Base model : model on which we would to add variability
Feature Model: model used to capture the variability from the base model
			   It is able to reference the base model
Resolution model : this model store choices made by the user on the feature model
Resolved model: (product model), model obtained after the resolution model derivation

The variability tool is divided between four parts:
Editor: the Obeo designer graphical editor for Feature Diagram

Derivation : the tool to select some features and store it in the resolution model 
			 and then derive this resolution model to obtain the resolved model

Decorator: this part enable addition of variability information on Obeo Designer base model modeller.
		   A decorator is added on Domain Model Elements associated with unselected features.
		   
OCL: This part contains the OCL constraints for the Feature Diagram Editor. You need installation of EMF Validation tool.

These projects does not contain the constraints for the Feature Diagram Editor written in Praxis.		   