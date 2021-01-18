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

public class DoomsayerToggleTaskList extends TaskList
{

	public DoomsayerToggleTaskList()
	{
		super("Doomsayer Toggles");
		initTasks();
	}

	public void initTasks()
	{

		Task unlockAllWarningToggles = new Task.TaskBuilder()
			.name("Unlock all Doomsayer warning toggles")
			.geVar(true, Varbits.WARNING_DKS_LADDER.getId(), 6)
			.geVar(true, Varbits.WARNING_CONTACT_DUNGEON_LADDER.getId(), 6)
			.geVar(true, Varbits.WARNING_FALADOR_MOLE_LAIR.getId(), 6)
			.geVar(true, Varbits.WARNING_STRONGHOLD_OF_SECURITY_LADDERS.getId(), 6)
			.geVar(true, Varbits.WARNING_PLAYER_OWNED_HOUSES.getId(), 6)
			.geVar(true, Varbits.WARNING_DROPPED_ITEMS_IN_RANDOM_EVENTS.getId(), 6)
			.geVar(true, Varbits.WARNING_WILDERNESS_DITCH.getId(), 6)
			.geVar(true, Varbits.WARNING_TROLLHEIM_WILDERNESS_ENTRANCE.getId(), 6)
			.geVar(true, Varbits.WARNING_OBSERVATORY_STAIRS.getId(), 6)
			.geVar(true, Varbits.WARNING_SHANTAY_PASS.getId(), 6)
			.geVar(true, Varbits.WARNING_ICY_PATH_AREA.getId(), 6)
			.geVar(true, Varbits.WARNING_WATCHTOWER_SHAMAN_CAVE.getId(), 6)
			.geVar(true, Varbits.WARNING_LUMBRIDGE_SWAMP_CAVE_ROPE.getId(), 6)
			.geVar(true, Varbits.WARNING_HAM_TUNNEL_FROM_MILL.getId(), 6)
			.geVar(true, Varbits.WARNING_FAIRY_RING_TO_DORGESH.getId(), 6)
			.geVar(true, Varbits.WARNING_LUMBRIDGE_CELLAR.getId(), 6)
			.geVar(true, Varbits.WARNING_ELID_GENIE_CAVE.getId(), 6)
			.geVar(true, Varbits.WARNING_DORGESH_TUNNEL_TO_KALPHITES.getId(), 6)
			.geVar(true, Varbits.WARNING_DORGESH_CITY_EXIT.getId(), 6)
			.geVar(true, Varbits.WARNING_MORT_MYRE.getId(), 6)
			.geVar(true, Varbits.WARNING_RANGING_GUILD_TOWER.getId(), 6)
			.geVar(true, Varbits.WARNING_DEATH_PLATEAU.getId(), 6)
			.geVar(true, Varbits.WARNING_GWD_WILDERNESS_AGILITY_ROUTE.getId(), 6)
			.build();

		add(unlockAllWarningToggles);
	}

}
