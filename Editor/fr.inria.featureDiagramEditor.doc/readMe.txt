/*******************************************************************************
 * Copyright (c) 2007-2012 Marie Gouyette.
 * INRIA-IRISA-Triskell
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     INRIA-IRISA- Triskell
 *     Marie Gouyette 
 *      - initial API and implementation
 *     contact marie.gouyette@gmail.com
 ******************************************************************************/

To use this plugin you need to generate again the documentation. To do this right click on each ant script on src/ Run As -> External Tool Configuration. Create a new Ant build.
On the target select preparedbk, eclipse.help (necessary) and pdf.fop. On clathPath add on Ant home the jar resolver.jar from ant-docbook-styler/ant-extensions.

Do not forget to copy eclipse.help and pdf.fop or any other documentation you to the help folder after generating new documentation.
Do not commit build folder.