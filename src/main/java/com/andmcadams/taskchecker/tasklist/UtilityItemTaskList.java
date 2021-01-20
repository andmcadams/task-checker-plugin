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

public class UtilityItemTaskList extends TaskList
{

	public UtilityItemTaskList()
	{
		super("Utility items");
		initTasks();
	}

	public void initTasks()
	{

		Task attachKalphiteRopes = new Task.TaskBuilder()
			.name("Attach ropes to both Kalphite Hives tunnel entrances (you may need to enter the Kalphite Hive)")
			.switchVar(true, Varbits.KALPHITE_LAIR_OUTSIDE_ROPE.getId())
			.geVar(true, Varbits.KALPHITE_LAIR_INSIDE_ROPE.getId(), 1)
			.build();

		Task attachObservatoryGrapple = new Task.TaskBuilder()
			.name("Attach a grapple to the rocks next to the Observatory")
			.switchVar(true, Varbits.OBSERVATORY_GRAPPLE.getId())
			.build();

		Task attachDarkmeyerRopes = new Task.TaskBuilder()
			.name("Attach both long ropes to both sides of the Darkmeyer wall")
			.switchVar(true, Varbits.DARKMEYER_WEST_ROPE.getId())
			.switchVar(true, Varbits.DARKMEYER_EAST_ROPE.getId())
			.build();

		add(attachKalphiteRopes);
		add(attachObservatoryGrapple);
		add(attachDarkmeyerRopes);
	}
}
