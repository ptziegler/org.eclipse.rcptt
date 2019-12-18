/*******************************************************************************
 * Copyright (c) 2009, 2019 Xored Software Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Xored Software Inc - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.rcptt.launching.autdetails;

import java.io.InputStream;
import java.util.Properties;

public interface IAutDetailsProcessor {
	void addFile(String name, InputStream stream);
	void addFile(String name, Properties properties);
	void closeStream();
}
