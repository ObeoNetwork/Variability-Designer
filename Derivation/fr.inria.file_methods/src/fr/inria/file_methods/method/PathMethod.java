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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import  org.eclipse.emf.ecore.resource.Resource;
import  org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;


/** 
 * On the selection and derivation engine we have four models :
 *  base model : the model on which we want to express variability
 *  feature model : the model used to express variability
 *  resolution model : the model used to store the user choices on the feature model
 *  resolved model: the model obtained after derivation. It conforms to the same metamodel as the base model.
 * */


public class PathMethod {
	
	/**
	 * Retrieve the folder path from the path of a given file
	 * @param filePath : the path of the selected file
	 * @return the path of the folder that contains this file
	 */
	public static String getFolderPath (String filePath) {
		String folderPath ="";
		String [] split = filePath.split("/"); // We need to separe the file name from the other part of the path
		for (int i  =0; i < split.length - 1; i++) { // We do not want the last split (the file name)
			if (split[i] != "") {
			folderPath = folderPath  + split[i] + "/";
			}
		}
		return folderPath ;
	}
	
	
	/** This method creates the resolution model path, to be able to add the 
	 * resolution model in the same folder as the feature model. 
	 * We give to it the same name as the feature model and we add the date 
	 * at the end to distinguish the different Resolution Model. 
	 * @param pathFeatureModel: the feature model path 
	 * @result the resolution model path */
	public static String getResolutionModelPath( String pathFeatureModel) {
		
        // Give it the same name as the resolution model
		// So retrieve the feature diagram name without the extension
		String [] split1 = pathFeatureModel.split("/");
		String featureName = split1[split1.length -1];
		String resolutionModelName = getResolutionModelName(featureName);
		System.out.println("resolution model name " + resolutionModelName );
		
        String pathResolutionModel = PathMethod.getFolderPath(pathFeatureModel)
        							+ resolutionModelName // the file name without the extension
        							+ displayDate() // we add the current date of the resolution model
        							+ ".resolutionmodel";
       return pathResolutionModel;
	}
	
	
/** This method gives the future resolution model name from feature model name without extension 
 * @param featureName : the feature model name
 * @result the name of the new resolution name*/
public static String getResolutionModelName (String featureName) {
		String resolutionModelName ="";
		
		if (! featureName.equals("")) {
			char c = featureName.charAt(0);
			int i =1;
			while (c != '.' && i < featureName.length()) {
				resolutionModelName += c;
				c = featureName.charAt(i);
				i++;
			}
		}
		return resolutionModelName;
	}
	
/**
 * Returns a String that represent the current date
 * @return the String that represents the current date
 */
	public static String displayDate() {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		String res = format.format(new Date());
		System.out.println(res);
		return res;
	}
	
	
	
	/**
	 * Create the resolved model path
	 * @param resolutionModelPath : the resolution model path
	 * @return the resolved model path
	 */
	public static String getResolvedModelPath(String resolutionModelPath, String file_extension) {
		// At the moment the resolved model is on the same directory as the resolution model
		String path =  getFolderPath(resolutionModelPath);
		System.out.println("path " + path);
		
		// We give the same name as the resolution model to the resolved model
		// So we need to retrieve the name of the resolution model
		String [] split = resolutionModelPath.split("/");
		// split[split.length -1] : name of the resolution model 
		// We need to remove the extension
		String resolvedModelName =  getResolutionModelName(split[split.length -1]); 
		System.out.println("resolvedModelName " + resolvedModelName );
		// Retrieve the base model extension in the resolution model
		//String extension = getBaseModelExtension(file);

		path = path + resolvedModelName + "." + file_extension;
		return path;
	}
	
	
	/** Obtain the resolved model path according to the resolution model path
	 * @param resolutionModelPath : the resolution model path
	 * @result the created resolvedModelPath */
	public static String getResolvedModelPath(String resolutionModelPath) {
		// At the moment the resolved model is on the same directory as the resolution model
		String path =  getFolderPath(resolutionModelPath);
		
		// We give the same name as the resolution model to the resolved model
		// So we need to retrieve the name of the resolution model
		String [] split = resolutionModelPath.split("/");
		
		// We need to remove the extension
		String resolvedModelName =  getResolutionModelName(split[split.length -1]); 
		
		path = path + resolvedModelName ;
		return path;
	}
	
	/**
	 * Retrieve the absolute path of the directory where the feature model is stored
	 * @param relativePath : the relative path to the feature model
	 */
	public static String getAbsolutePath(String relativePath) {
		// Retrieve the current workspace 
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		
		// We need to retrieve the name of the project where the file is stored
		String [] split = relativePath.split("/");
		String project_file_name = split[2]; // ""/resource/project_name : we need project_name
		
		// We need to retrieve the project where the selected model is stored
		IProject project = ws.getRoot().getProject(project_file_name);
		String path = project.getLocation().toString() +"/";
		
		// Add relative path
		for (int i = 3; i < split.length - 1; i++){
			path = path  + split[i] + "/";
		}
		// add file Name
		path = path + split[split.length - 1];
		return path;
		
	}

}
