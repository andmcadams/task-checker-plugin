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

public class RedeemableQuestItemsTaskList extends TaskList
{

	public RedeemableQuestItemsTaskList()
	{
		super("Redeemable quest items");
		initTasks();
	}

	public void initTasks()
	{

		Task tradeDiaryOfHerbiFlax = new Task.TaskBuilder()
			.name("Trade the diary of Herbi Flax to the Apothecary")
			.bitVar(false, Varplayers.MORTTON_STATE.getId(), 30)
			.build();

		Task tradeWeissFireNotes = new Task.TaskBuilder()
			.name("Trade the Weiss fire notes to Burntmeat")
			.switchVar(true, Varbits.GAVE_WEISS_FIRE_NOTES_TO_BURNTMEAT.getId())
			.build();

		Task tradeBlackPrism = new Task.TaskBuilder()
			.name("Trade the black prism to Yanni Salika or Zavistic Rarve")
			.switchVar(true, Varbits.GAVE_BLACK_PRISM_AWAY.getId())
			.build();

		add(tradeDiaryOfHerbiFlax);
		add(tradeWeissFireNotes);
		add(tradeBlackPrism);
	}
}
