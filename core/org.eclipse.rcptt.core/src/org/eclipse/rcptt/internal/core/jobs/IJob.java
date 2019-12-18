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
package org.eclipse.rcptt.internal.core.jobs;

import org.eclipse.core.runtime.IProgressMonitor;

public interface IJob {

	/* Waiting policies */
	int ForceImmediate = 1;
	int CancelIfNotReady = 2;
	int WaitUntilReady = 3;

	/* Job's result */
	boolean FAILED = false;
	boolean COMPLETE = true;

	/**
	 * Answer true if the job belongs to a given family (tag)
	 */
	public boolean belongsTo(String jobFamily);

	/**
	 * Asks this job to cancel its execution. The cancellation can take an
	 * undertermined amount of time.
	 */
	public void cancel();

	/**
	 * Ensures that this job is ready to run.
	 */
	public void ensureReadyToRun();

	/**
	 * Execute the current job, answer whether it was successful.
	 */
	public boolean execute(IProgressMonitor progress);
}
