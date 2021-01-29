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
import com.andmcadams.taskchecker.var.Var;

public class SlayerRewardsTaskList extends TaskList
{

	public SlayerRewardsTaskList()
	{
		super("Slayer Rewards");
		initTasks();
	}

	public void initTasks()
	{

		Task unlockGargoyleSmasher = new Task.TaskBuilder()
			.name("Unlock Gargoyle Smasher")
			.switchVar(true, Varbits.UNLOCKED_GARGOYLE_SMASHER.getId())
			.build();

		Task unlockSlugSalter = new Task.TaskBuilder()
			.name("Unlock Slug Salter")
			.switchVar(true, Varbits.UNLOCKED_SLUG_SALTER.getId())
			.build();

		Task unlockReptileFreezer = new Task.TaskBuilder()
			.name("Unlock Reptile Freezer")
			.switchVar(true, Varbits.UNLOCKED_REPTILE_FREEZER.getId())
			.build();

		Task unlockShroomSprayer = new Task.TaskBuilder()
			.name("Unlock 'Shroom Sprayer")
			.switchVar(true, Varbits.UNLOCKED_SHROOM_SPRAYER.getId())
			.build();

		Task unlockBroaderFletching = new Task.TaskBuilder()
			.name("Unlock Broader Fletching")
			.switchVar(true, Varbits.UNLOCKED_BROADER_FLETCHING.getId())
			.build();

		Task unlockMalevolentMasquerade = new Task.TaskBuilder()
			.name("Unlock Malevolent Masquerade")
			.switchVar(true, Varbits.UNLOCKED_MALEVOLENT_MASQUERADE.getId())
			.build();

		Task unlockRingBling = new Task.TaskBuilder()
			.name("Unlock Ring Bling")
			.switchVar(true, Varbits.UNLOCKED_RING_BLING.getId())
			.build();

		Task unlockBiggerAndBadder = new Task.TaskBuilder()
			.name("Unlock Bigger and Badder")
			.switchVar(true, Varbits.UNLOCKED_BIGGER_AND_BADDER.getId())
			.build();

		Task unlockKingBlackBonnet = new Task.TaskBuilder()
			.name("Unlock King Black Bonnet")
			.switchVar(true, Varbits.UNLOCKED_KING_BLACK_BONNET.getId())
			.build();

		Task unlockKalphiteKhat = new Task.TaskBuilder()
			.name("Unlock Kalphite Khat")
			.switchVar(true, Varbits.UNLOCKED_KALPHITE_KHAT.getId())
			.build();

		Task unlockUnholyHelmet = new Task.TaskBuilder()
			.name("Unlock Unholy Helmet")
			.switchVar(true, Varbits.UNLOCKED_UNHOLY_HELMET.getId())
			.build();

		Task unlockDarkMantle = new Task.TaskBuilder()
			.name("Unlock Dark Mantle")
			.switchVar(true, Varbits.UNLOCKED_DARK_MANTLE.getId())
			.build();

		Task unlockUndeadHead = new Task.TaskBuilder()
			.name("Unlock Undead Head")
			.switchVar(true, Varbits.UNLOCKED_UNDEAD_HEAD.getId())
			.build();

		Task unlockUseMoreHead = new Task.TaskBuilder()
			.name("Unlock Use More Head")
			.switchVar(true, Varbits.UNLOCKED_USE_MORE_HEAD.getId())
			.build();

		Task unlockDulyNoted = new Task.TaskBuilder()
			.name("Unlock Duly Noted")
			.switchVar(true, Varbits.UNLOCKED_DULY_NOTED.getId())
			.build();

		Task unlockStopTheWyvern = new Task.TaskBuilder()
			.name("Unlock Stop the Wyvern")
			.switchVar(true, Varbits.UNLOCKED_STOP_THE_WYVERN.getId())
			.build();

		Task unlockTwistedVision = new Task.TaskBuilder()
			.name("Unlock Twisted Vision")
			.switchVar(true, Varbits.UNLOCKED_TWISTED_VISION.getId())
			.build();

		add(unlockGargoyleSmasher);
		add(unlockSlugSalter);
		add(unlockReptileFreezer);
		add(unlockShroomSprayer);
		add(unlockBroaderFletching);
		add(unlockMalevolentMasquerade);
		add(unlockRingBling);
		add(unlockBiggerAndBadder);
		add(unlockKingBlackBonnet);
		add(unlockKalphiteKhat);
		add(unlockUnholyHelmet);
		add(unlockDarkMantle);
		add(unlockUndeadHead);
		add(unlockUseMoreHead);
		add(unlockDulyNoted);
		add(unlockStopTheWyvern);
		add(unlockTwistedVision);

	}
}
