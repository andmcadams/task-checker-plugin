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

public class SlayerRewardsTaskList extends TaskList
{

	public SlayerRewardsTaskList()
	{
		super("Slayer Rewards");
		initTasks();
	}

	public void initTasks()
	{

		Task unlockSlugSalter = new Task.TaskBuilder()
			.name("Unlock Slug Salter")
			.switchVar(true, Varbits.UNLOCKED_SLUG_SALTER.getId())
			.build();

		Task unlockShroomSprayer = new Task.TaskBuilder()
			.name("Unlock 'Shroom Sprayer")
			.switchVar(true, Varbits.UNLOCKED_SHROOM_SPRAYER.getId())
			.build();

		Task unlockDulyNoted = new Task.TaskBuilder()
			.name("Unlock Duly Noted")
			.switchVar(true, Varbits.UNLOCKED_DULY_NOTED.getId())
			.build();

		this.add(unlockSlugSalter);
		this.add(unlockShroomSprayer);
		this.add(unlockDulyNoted);

	}
}
