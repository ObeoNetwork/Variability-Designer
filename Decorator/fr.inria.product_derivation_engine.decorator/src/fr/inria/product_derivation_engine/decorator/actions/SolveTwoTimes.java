/*******************************************************************************
 * Copyright (c) 2010-2012  mgouyett.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marie Gouyette - initial API and implementation
 *      contact marie.gouyette@gmail.com
 ******************************************************************************/
package fr.inria.product_derivation_engine.decorator.actions;

/**
 * This class exists only to solve a bug (the IExternalJavaAction is called twice by Obeo Designer)
 * It uses the singleton pattern
 * @author mgouyett
 *
 */
public class SolveTwoTimes {
	
	/**
	 * Determine whether action can be executed or not
	 */
	private  boolean canExecute = true;
	
	public static SolveTwoTimes instance = new SolveTwoTimes();
	
	/**
	 * Retrieve the instance of this class
	 * @return
	 */
	public static synchronized SolveTwoTimes getInstance() {
		return instance;
	}
	
	
	/**
	 * Retrieve the value of the canExecute attribute
	 * @return the value of the canExecute attribute
	 */
	public synchronized boolean  getCanExecute() {
		return canExecute;
	}
	
	/**
	 * Set the value of the canExecute attribute 
	 * @param canExecute : the new value of the canExecute attribute
	 */
	public synchronized void setCanExecute( boolean canExecute) {
		this.canExecute = !canExecute;
	}

}
