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

public class LostItemsTaskList extends TaskList
{

	public LostItemsTaskList()
	{
		super("Lost items");
		initTasks();
	}

	public void initTasks()
	{

		Task returnCoppersCollar = new Task.TaskBuilder()
			.name("Deliver Copper's crimson collar to Veos")
			.eqVar(true, Varbits.VEOS_COLLAR_PROGRESS.getId(), 2)
			.build();

		Task returnZealotsKey = new Task.TaskBuilder()
			.name("Deliver Zealot's key to Zealot")
			.eqVar(true, Varbits.ZEALOT_KEY.getId(), 0)
			.eqVar(false, Varplayers.HAUNTED_MINE_PROGRESS.getId(), 11)
			.build();

		Task returnMistagsBrooch = new Task.TaskBuilder()
			.name("Return the brooch to Mistag")
			.switchVar(true, Varbits.BROOCH_RETURNED_TO_MISTAG.getId())
			.build();

		add(returnCoppersCollar);
		add(returnZealotsKey);
		add(returnMistagsBrooch);
	}

}
