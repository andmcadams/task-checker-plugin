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

public class LootTaskList extends TaskList
{

	public LootTaskList()
	{
		super("Loot crates, chests, and miscellaneous items");
		initTasks();
	}

	public void initTasks()
	{

		// Search tasks
		Task openMarlosCrate = new Task.TaskBuilder()
			.name("Open Marlo's crate")
			.eqVar(true, Varbits.DADDYS_HOME_PROGRESS.getId(), 14)
			.build();

		// MORTON_TABLE - UNKNOWN
		Task searchMorttonTable = new Task.TaskBuilder()
			.name("Loot the smashed table containing herbs in Mort'ton")
			.bitVar(false, Varplayers.MORTTON_STATE.getId(), 8)
			.build();

		Task undergroundPassCrate = new Task.TaskBuilder()
			.name("Searched the crate in the Underground Pass")
			.switchVar(true, Varbits.UNDERGROUND_PASS_CRATE.getId())
			.build();

		Task elementalWorkshopCrate = new Task.TaskBuilder()
			.name("Searched the crate in the Elemental Workshop for leather")
			.switchVar(true, Varbits.ELEMENTAL_WORKSHOP_CRATE.getId())
			.build();

		Task meiyerditchLabRuneCase = new Task.TaskBuilder()
			.name("Searched the broken rune case in the Meiyerditch lab")
			.switchVar(true, Varbits.MEIYERDITCH_LABS_RUNE_CASE.getId())
			.build();

		Task canifisHideoutGarlic = new Task.TaskBuilder()
			.name("Searched the chest in the Canifis Myreque hideout for three garlic bulbs")
			.eqVar(true, Varbits.CANIFIS_HIDEOUT_GARLIC_COUNTER.getId(), 3)
			.build();

		Task klenterPyramidChest = new Task.TaskBuilder()
			.name("Searched the chest in Klenter's pyramid for 50 coins")
			.switchVar(true, Varbits.KLENTER_PYRAMID_COINS.getId())
			.build();

		Task enakhraSandstone = new Task.TaskBuilder()
			.name("Collected 5 sandstone from Enakhra's temple")
			.eqVar(true, Varbits.ENAKHRAS_TEMPLE_SANDSTONE_COUNTER.getId(), 5)
			.build();

		Task agrithNaarThrone = new Task.TaskBuilder()
			.name("Collected the gems from Agrith Naar's throne")
			.switchVar(true, Varbits.AGRITH_NAAR_THRONE.getId())
			.build();

		Task fenkenstrainClockLetter = new Task.TaskBuilder()
			.name("Searched the clock in Fenkenstrain's castle")
			.switchVar(true, Varbits.FENKENSTRAIN_CLOCK_LETTER.getId())
			.build();

		Task goblinVillageGoblinMail = new Task.TaskBuilder()
			.name("Loot the 3 pieces of goblin mail in the Goblin Village")
			.switchVar(true, Varbits.GOBLIN_MAIL_NORTH.getId())
			.switchVar(true, Varbits.GOBLIN_MAIL_WEST.getId())
			.switchVar(true, Varbits.GOBLIN_MAIL_UPSTAIRS.getId())
			.build();

		Task observatorySpiderChests = new Task.TaskBuilder()
			.name("Loot the 7 spider chests in the Observatory dungeon")
			.switchVar(true, Varbits.OBSERVATORY_SPIDER_CHEST_1.getId())
			.switchVar(true, Varbits.OBSERVATORY_SPIDER_CHEST_2.getId())
			.switchVar(true, Varbits.OBSERVATORY_SPIDER_CHEST_3.getId())
			.switchVar(true, Varbits.OBSERVATORY_SPIDER_CHEST_4.getId())
			.switchVar(true, Varbits.OBSERVATORY_SPIDER_CHEST_5.getId())
			.switchVar(true, Varbits.OBSERVATORY_SPIDER_CHEST_6.getId())
			.switchVar(true, Varbits.OBSERVATORY_SPIDER_CHEST_7.getId())
			.build();

		Task zeahWorkbenchNails = new Task.TaskBuilder()
			.name("Loot the workbench containing iron nails at Gordon's farm")
			.switchVar(true, Varbits.ZEAH_WORKBENCH_NAILS.getId())
			.build();

		Task piscatorisTools = new Task.TaskBuilder()
			.name("Loot the bronze axe and pickaxe in the Piscatoris fishing colony")
			.switchVar(true, Varbits.PISCATORIS_BRONZE_PICKAXE.getId())
			.switchVar(true, Varbits.PISCATORIS_BRONZE_AXE.getId())
			.build();

		add(openMarlosCrate);
		add(searchMorttonTable);
		add(undergroundPassCrate);
		add(elementalWorkshopCrate);
		add(meiyerditchLabRuneCase);
		add(canifisHideoutGarlic);
		add(klenterPyramidChest);
		add(enakhraSandstone);
		add(agrithNaarThrone);
		add(fenkenstrainClockLetter);
		add(goblinVillageGoblinMail);
		add(observatorySpiderChests);
		add(zeahWorkbenchNails);
		add(piscatorisTools);
	}
}
