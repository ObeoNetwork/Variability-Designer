/*******************************************************************************
 * Copyright (c) 2010-2012 mgouyett.
 * INRIA-IRISA- Triskell Team
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     mgouyett - initial API and implementation
 * 	INRIA-IRISA- Triskell Team
 * 	contact : marie.gouyette@gmail.com
 ******************************************************************************/
package fr.inria.file_methods.method;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;

/**
 * This class is used to retrieve directory container of a given file
 * @author mgouyett
 *
 */
public class RetrievePath {
	
	
	
	/**
	 * Retrieve the folder path from the path of a given file
	 * @param filePath : the path of the selected file
	 * @return the path of the folder that contains this file
	 */
	public static String getFolderPath (String filePath) {
		String folderPath ="";
		String [] split = filePath.split("/"); // We need to separe the file name from the other part of the path
		for (int i  =1; i < split.length - 1; i++) { // We do not want the last split (the file name)
			// i = 1 : Not consider first split ""
			if (split[i] != "") {
			folderPath = folderPath + "/" + split[i];
			}
		}
		return folderPath + "/";
	}
	
	/**
	 * Retrieve the absolute path of the directory where the feature model is stored
	 * @param relativePath : the relative path to the feature model
	 */
	public static String getAbsolutePathDirectory(String relativePath) {
		// Retrieve the current workspace 
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		
		// We need to retrieve the name of the project where the file is stored
		String [] split = relativePath.split("/");
		String project_file_name = split[2]; // ""/resource/project_name : we need project_name
		
		// We need to retrieve the project where the selected model is stored
		IProject project = ws.getRoot().getProject(project_file_name);
		String path = project.getLocation().toString() + "/";
		
		return path;
		
	}

}
