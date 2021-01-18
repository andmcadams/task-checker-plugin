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
