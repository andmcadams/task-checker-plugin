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

public class PaymentsAndInstantExperienceTaskList extends TaskList
{

	public PaymentsAndInstantExperienceTaskList()
	{
		super("Payments and Instant experience");
		initTasks();
	}

	public void initTasks()
	{

		Task observatoryQuestWineClaimed = new Task.TaskBuilder()
			.name("Claim wine from the Observatory assistant")
			.eqVar(false, Varplayers.OBSERVATORY_QUEST_PROGESS.getId(), 8)
			.build();

		Task cabinFeverRewardClaimed = new Task.TaskBuilder()
			.name("Claim coins from Bill Teach")
			.switchVar(true, Varbits.CABIN_FEVER_REWARD_CLAIMED.getId())
			.build();

		Task gettingAheadRewardClaimed = new Task.TaskBuilder()
			.name("Claim coins from Gordon")
			.switchVar(true, Varbits.GETTING_AHEAD_REWARD_CLAIMED.getId())
			.build();

		Task queenOfThievesRewardClaimed = new Task.TaskBuilder()
			.name("Claim coins from Lady Shauna Piscarillius")
			.switchVar(true, Varbits.QUEEN_OF_THIEVES_REWARD_CLAIMED.getId())
			.build();

		Task monkeyMadnessIIRewardClaimed = new Task.TaskBuilder()
			.name("Claim experience from Duke")
			.geVar(true, Varbits.MONKEY_MADNESS_II_PROGRESS.getId(), 200)
			.build();

		Task dragonSlayerIIRewardClaimed = new Task.TaskBuilder()
			.name("Claim experience from Ellen")
			.eqVar(true, Varbits.DRAGON_SLAYER_II_REWARD_CLAIMED.getId(), 4)
			.build();

		Task misthalinMysteryRewardClaimed = new Task.TaskBuilder()
			.name("Claim experience from Mandy")
			.switchVar(true, Varbits.MISTHALIN_MYSTERY_REWARD_CLAIMED.getId())
			.build();

		Task xMarksTheSpotClueScrollClaimed = new Task.TaskBuilder()
			.name("Claim a clue scroll (beginner) from Veos")
			.switchVar(true, Varbits.X_MARKS_THE_SPOT_CLUE_SCROLL_CLAIMED.getId())
			.build();

		Task theFeudBeerClaimedFromAli = new Task.TaskBuilder()
			.name("Claim a beer from Ali the Barman")
			.eqVar(true, Varbits.THE_FEUD_BEER_CLAIMED_FROM_ALI.getId(), 2)
			.build();

		add(observatoryQuestWineClaimed);
		add(cabinFeverRewardClaimed);
		add(gettingAheadRewardClaimed);
		add(queenOfThievesRewardClaimed);
		add(monkeyMadnessIIRewardClaimed);
		add(dragonSlayerIIRewardClaimed);
		add(misthalinMysteryRewardClaimed);
		add(xMarksTheSpotClueScrollClaimed);
		add(theFeudBeerClaimedFromAli);
	}
}
