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
