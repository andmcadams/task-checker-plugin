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

public class InvisibleTaskList extends TaskList
{

	public InvisibleTaskList()
	{
		super("No known effect in game");
		this.initTasks();
	}

	public void initTasks()
	{

		Task ancientLetter = new Task.TaskBuilder()
			.name("Loot the Ancient letter from the Forsaken Tower")
			.switchVar(true, Varbits.ANCIENT_LETTER_FORSAKEN_TOWER.getId())
			.build();

		Task tattyNote = new Task.TaskBuilder()
			.name("Loot the Tatty note from the bed in the Kebos Lowlands")
			.switchVar(true, Varbits.TATTY_NOTE_KEBOS_LOWLANDS.getId())
			.build();

		Task pickpocketTeddy = new Task.TaskBuilder()
			.name("Pickpocket Teddy from the female student in the Digsite")
			.switchVar(true, Varbits.PICKPOCKETED_TEDDY.getId())
			.build();

		// Note that this doesn't actually change dialogue as far as I can tell.
		Task askBlackKnightFortressGuardAboutUniform = new Task.TaskBuilder()
			.name("Ask a Fortress guard about their uniform outside the Black Knights' Fortress")
			.switchVar(true, Varbits.ASKED_ABOUT_GUARD_UNIFORM.getId())
			.build();

		Task exitThroughSecretExit = new Task.TaskBuilder()
			.name("Exit through the Troll Stronghold's secret exit")
			.switchVar(true, Varbits.EXITED_THROUGH_TROLL_STRONGHOLD_SECRET_EXIT.getId())
			.build();

		Task enterTheWilderness = new Task.TaskBuilder()
			.name("Enter the Wilderness 1000 times")
			.eqVar(true, Varbits.ENTERED_WILDERNESS_COUNTER.getId(), 1000)
			.build();

		add(ancientLetter);
		add(tattyNote);
		add(pickpocketTeddy);
		add(askBlackKnightFortressGuardAboutUniform);
		add(exitThroughSecretExit);
		add(enterTheWilderness);
	}
}