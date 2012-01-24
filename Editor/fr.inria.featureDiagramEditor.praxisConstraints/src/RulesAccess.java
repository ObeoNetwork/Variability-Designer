/*******************************************************************************
 * Copyright (c) 2010-2012 Marie Gouyette
 * INRIA-IRISA-Triskell Team 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marie Gouyette - initial API and implementation
 *     INRIA-IRISA-Triskell Team
 *     Contact: marie.gouyette@gmail.com
 ******************************************************************************/
import java.util.ArrayList;

import org.eclipse.core.runtime.Plugin;

import praxis.consistency.core.IRulesAccess;

public class RulesAccess implements IRulesAccess {
	
	public String getRuPath() {
		return "/rules/rules.rulesetmodel";
	}

	public ArrayList<String> getRules() {
		ArrayList<String> a = new ArrayList<String>();
		a.add("/rules/rules.pl");
		a.add("/rules/library.pl");
		return a;
	}
	
	public Plugin getPlugin() {
		
		return Activator.getDefault();
	}

}
