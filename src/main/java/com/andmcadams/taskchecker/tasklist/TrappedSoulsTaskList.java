/*
 * Copyright (c) 2021, Andrew McAdams
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import com.andmcadams.taskchecker.Varplayers;

public class TrappedSoulsTaskList extends TaskList
{

	public TrappedSoulsTaskList()
	{
		super("Trapped souls and afflicted characters");
		initTasks();
	}

	public void initTasks()
	{
		Task freeKlenter = new Task.TaskBuilder()
			.name("Free Klenter's soul from Amascut's torment")
			.eqVar(true, Varbits.FREED_KLENTER.getId(), 0)
			.eqVar(true, Varbits.ICTHLARINS_LITTLE_HELPER_PROGRESS.getId(), 26)
			.build();

		Task freeDroalak = new Task.TaskBuilder()
			.name("Free Droalak's soul from his guilt of departure")
			.switchVar(true, Varbits.FREED_DROALAK.getId())
			.build();

		Task cureRazmireAndUlsquire = new Task.TaskBuilder()
			.name("Free Razmire Keelgan and Ulsquire Shauncy from affliction")
			.bitVar(false, Varplayers.MORTTON_STATE.getId(), 5)
			.bitVar(false, Varplayers.MORTTON_STATE.getId(), 6)
			.build();

		add(freeKlenter);
		add(freeDroalak);
		add(cureRazmireAndUlsquire);
	}
}
