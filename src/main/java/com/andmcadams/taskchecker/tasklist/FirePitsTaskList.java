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

public class FirePitsTaskList extends TaskList
{

	public FirePitsTaskList()
	{
		super("Fire pits");
		initTasks();
	}

	public void initTasks()
	{

		Task moleHolePit = new Task.TaskBuilder()
			.name("Build the fire pit in the Mole Hole")
			.switchVar(true, Varbits.MOLE_HOLE_FIRE_PIT.getId())
			.build();

		Task lumbridgeSwampCavesPit = new Task.TaskBuilder()
			.name("Build the fire pit in the Lumbridge Swamp Caves")
			.switchVar(true, Varbits.LUMBRIDGE_SWAMP_CAVES_FIRE_PIT.getId())
			.build();

		Task mosLeHarmlessCavePit = new Task.TaskBuilder()
			.name("Build the fire pit in the Mos Le'Harmless Cave")
			.switchVar(true, Varbits.MOS_LE_HARMLESS_CAVE_FIRE_PIT.getId())
			.build();

		Task mortMyrePit = new Task.TaskBuilder()
			.name("Build the fire pit in the Mort Myre Swamp")
			.switchVar(true, Varbits.MORT_MYRE_SWAMP_FIRE_PIT.getId())
			.build();

		Task weissHerbPatchPit = new Task.TaskBuilder()
			.name("Build the fire pit near the Weiss herb patch")
			.geVar(true, Varbits.MAKING_FRIENDS_WITH_MY_ARM_PROGRESS.getId(), 205)
			.build();

		Task gwdEntrancePit = new Task.TaskBuilder()
			.name("Build the fire pit by the God Wars Dungeon entrance")
			.switchVar(true, Varbits.GWD_ENTRANCE_FIRE_PIT.getId())
			.build();

		add(moleHolePit);
		add(lumbridgeSwampCavesPit);
		add(mosLeHarmlessCavePit);
		add(mortMyrePit);
		add(weissHerbPatchPit);
		add(gwdEntrancePit);
	}

}
