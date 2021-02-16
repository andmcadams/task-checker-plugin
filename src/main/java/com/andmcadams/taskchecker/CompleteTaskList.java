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
package com.andmcadams.taskchecker;

import java.util.ArrayList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import com.andmcadams.taskchecker.tasklist.*;

@Slf4j
public class CompleteTaskList
{

	private ArrayList<Task> tasks;

	@Getter
	private ArrayList<TaskList> taskLists = new ArrayList<>();

	public CompleteTaskList()
	{
		tasks = new ArrayList<>();
		this.initTasks();
	}

	public ArrayList<Task> getTasks()
	{
		// Shallow copy
		return (ArrayList<Task>) tasks.clone();
	}

	private void initTasks()
	{
		TaskList hallowedSepulchre = new HallowedSepulchreTaskList();
		TaskList titheFarm = new TitheFarmTaskList();
		TaskList motherlodeMine = new MotherlodeMineTaskList();
		TaskList forgottenPrayers = new ForgottenPrayerTaskList();
		TaskList treasureTrails = new TreasureTrailsTaskList();
		TaskList championsChallenge = new ChampionsChallengeTaskList();
		TaskList slayerRewards = new SlayerRewardsTaskList();
		TaskList entrancesAndObstacles = new EntrancesAndObstaclesTaskList();
		TaskList rightClick = new RightClickTaskList();
		TaskList doomsayerWarnings = new DoomsayerToggleTaskList();
		TaskList unlimitedServices = new UnlimitedServicesTaskList();
		TaskList minecartNetwork = new LovakengjMinecartNetworkTaskList();
		TaskList utilityItems = new UtilityItemTaskList();
		TaskList uniqueDialoguePaths = new UniqueDialoguePathsTaskList();
		TaskList loot = new LootTaskList();
		TaskList firePits = new FirePitsTaskList();
		TaskList paymentsAndInstantExperience = new PaymentsAndInstantExperienceTaskList();
		TaskList hiddenShops = new HiddenShopsTaskList();
		TaskList lostItems = new LostItemsTaskList();
		TaskList trappedSouls = new TrappedSoulsTaskList();
		TaskList redeemableQuestItems = new RedeemableQuestItemsTaskList();
		TaskList temporary = new TemporaryTaskList();
		TaskList invisible = new InvisibleTaskList();

		taskLists.add(hallowedSepulchre);
		taskLists.add(titheFarm);
		taskLists.add(motherlodeMine);
		taskLists.add(forgottenPrayers);
		taskLists.add(treasureTrails);
		taskLists.add(championsChallenge);
		taskLists.add(slayerRewards);
		taskLists.add(entrancesAndObstacles);
		taskLists.add(rightClick);
		taskLists.add(doomsayerWarnings);
		taskLists.add(unlimitedServices);
		taskLists.add(minecartNetwork);
		taskLists.add(utilityItems);
		taskLists.add(uniqueDialoguePaths);
		taskLists.add(loot);
		taskLists.add(firePits);
		taskLists.add(paymentsAndInstantExperience);
		taskLists.add(hiddenShops);
		taskLists.add(lostItems);
		taskLists.add(trappedSouls);
		taskLists.add(redeemableQuestItems);
		taskLists.add(temporary);
		taskLists.add(invisible);

		int sum = 0;
		for(TaskList taskList : taskLists)
			sum += taskList.getTasks().size();
		log.info("Loaded " + sum + " tasks.");

	}

}
