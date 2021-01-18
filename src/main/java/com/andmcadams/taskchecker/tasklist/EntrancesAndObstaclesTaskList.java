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

public class EntrancesAndObstaclesTaskList extends TaskList
{

	public EntrancesAndObstaclesTaskList()
	{
		super("Entrances and Obstacles");
		initTasks();
	}

	public void initTasks()
	{

		Task unblockLumbridgeSwampCavesHole = new Task.TaskBuilder()
			.name("Unblock the hole leading to the Lumbridge Swamp Caves")
			.switchVar(true, Varbits.UNBLOCKED_LUMBRIDGE_SWAMP_CAVE_HOLE.getId())
			.build();

		Task unblockEagleTransport = new Task.TaskBuilder()
			.name("Unblock both obstructed eagle transport route entrances")
			.switchVar(true, Varbits.MOVED_BOULDER_TO_DESERT_EAGLE.getId())
			.eqVar(true, Varbits.VINE_TO_EAGLE_STATE.getId(), 3)
			.build();

		Task unblockKourendCatacombsEntrances = new Task.TaskBuilder()
			.name("Unblock all four additional entrances to the Kourend Catacombs")
			.switchVar(true, Varbits.UNLOCKED_HOSIDIUS_CATACOMBS_ENTRANCE.getId())
			.switchVar(true, Varbits.UNLOCKED_SHAYZIEN_CATACOMBS_ENTRANCE.getId())
			.switchVar(true, Varbits.UNLOCKED_ARCEUUS_CATACOMBS_ENTRANCE.getId())
			.switchVar(true, Varbits.UNLOCKED_LOVAKENGJ_CATACOMBS_ENTRANCE.getId())
			.build();

		Task unlockAccessToHarisArea = new Task.TaskBuilder()
			.name("Unlock access to Haris's resource area in Corsair Cove")
			.switchVar(true, Varbits.UNLOCKED_HARIS_RESOURCE_AREA.getId())
			.build();

		Task unblockKrukDungeonPassage = new Task.TaskBuilder()
			.name("Unlock the hidden passage to the entrance of Kruk's lair")
			.switchVar(true, Varbits.UNBLOCKED_KRUKS_LAIR_PASSAGE.getId())
			.build();

		Task unlockDoorToEodan = new Task.TaskBuilder()
			.name("Unlock the door to Eodan in the Forthos Dungeon")
			.switchVar(true, Varbits.UNLOCKED_CENTRAL_FORTHOS_DOOR.getId())
			.build();

		Task unlockForthosDungeonDoors = new Task.TaskBuilder()
			.name("Unlock both Temple Doors in the Forthos Dungeon")
			.switchVar(true, Varbits.UNLOCKED_EAST_FORTHOS_DOOR.getId())
			.switchVar(true, Varbits.UNLOCKED_WEST_FORTHOS_DOOR.getId())
			.build();

		Task unlockEnakhrasTempleEntrances = new Task.TaskBuilder()
			.name("Unlock all four secret entrances to Enakhra's Temple")
			.switchVar(true, Varbits.OPENED_ENAKHRAS_TEMPLE_NW_ENTRANCE.getId())
			.switchVar(true, Varbits.OPENED_ENAKHRAS_TEMPLE_NE_ENTRANCE.getId())
			.switchVar(true, Varbits.OPENED_ENAKHRAS_TEMPLE_SE_ENTRANCE.getId())
			.switchVar(true, Varbits.OPENED_ENAKHRAS_TEMPLE_SW_ENTRANCE.getId())
			.build();

		Task unlockEnakhrasTempleSigilDoors = new Task.TaskBuilder()
			.name("Unlock all four sigil-locked doors in Enakhra's Temple")
			.switchVar(true, Varbits.UNLOCKED_ENAKHRAS_TEMPLE_S_DOOR.getId())
			.switchVar(true, Varbits.UNLOCKED_ENAKHRAS_TEMPLE_W_DOOR.getId())
			.switchVar(true, Varbits.UNLOCKED_ENAKHRAS_TEMPLE_N_DOOR.getId())
			.switchVar(true, Varbits.UNLOCKED_ENAKHRAS_TEMPLE_E_DOOR.getId())
			.build();

		this.add(unblockLumbridgeSwampCavesHole);
		this.add(unblockEagleTransport);
		this.add(unblockKourendCatacombsEntrances);
		this.add(unlockAccessToHarisArea);
		this.add(unblockKrukDungeonPassage);
		this.add(unlockDoorToEodan);
		this.add(unlockForthosDungeonDoors);
		this.add(unlockEnakhrasTempleEntrances);
		this.add(unlockEnakhrasTempleSigilDoors);

	}
}
