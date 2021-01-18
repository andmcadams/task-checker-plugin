package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import com.andmcadams.taskchecker.Varplayers;

public class RightClickTaskList extends TaskList
{

	public RightClickTaskList()
	{
		super("Right click menu options");
		initTasks();
	}

	public void initTasks()
	{
		Task unlockJarvaldTravel = new Task.TaskBuilder()
			.name("Unlock Jarvald's travel option")
			.switchVar(true, Varbits.UNLOCKED_JARVALD_TRAVEL.getId())
			.build();

		Task unlockMaryTan = new Task.TaskBuilder()
			.name("Unlock Mary's trade option")
			.switchVar(true, Varbits.UNLOCKED_MARY_TANNING.getId())
			.build();

		Task unlockIlfeenEnchant = new Task.TaskBuilder()
			.name("Unlock Ilfeen's enchant option")
			.switchVar(true, Varbits.UNLOCKED_ILFEEN_ENCHANT.getId())
			.build();

		Task unlockConwennaAndReeseSing = new Task.TaskBuilder()
			.name("Unlock Conwenna and Reese's sing option")
			.switchVar(true, Varbits.UNLOCKED_CONWENNA_AND_REESE_SING.getId())
			.build();

		Task unlockNorannaConvertShards = new Task.TaskBuilder()
			.name("Unlock Noranna Tytanin's convert-shards option")
			.switchVar(true, Varbits.UNLOCKED_NORANNA_CONVERT_SHARDS.getId())
			.build();

		Task unlockMountainGuideTravel = new Task.TaskBuilder()
			.name("Unlock the Mountain Guide's travel option")
			.switchVar(true, Varbits.UNLOCKED_MOUNTAIN_GUIDE_TRAVEL.getId())
			.build();

		Task unlockCloisterBellQuickStart = new Task.TaskBuilder()
			.name("Unlock the Cloister Bell's quick-start option")
			.geVar(false, Varplayers.GROTESQUE_GUARDIANS_KILLCOUNT.getId(), 5)
			.build();


		Task unlockJewelleryBoxLastTeleport = new Task.TaskBuilder()
			.name("Unlock the Jewellery Box's previous teleport option")
			.geVar(true, Varbits.LAST_JEWELLERY_BOX_TELEPORT.getId(), 1)
			.build();

		Task unlockCharterShipLastDestination = new Task.TaskBuilder()
			.name("Unlock the Charter Ship's previous destination option")
			.geVar(true, Varbits.LAST_CHARTER_SHIP_DESTINATION.getId(), 1)
			.build();

		add(unlockJarvaldTravel);
		add(unlockMaryTan);
		add(unlockIlfeenEnchant);
		add(unlockConwennaAndReeseSing);
		add(unlockNorannaConvertShards);
		add(unlockMountainGuideTravel);
		add(unlockCloisterBellQuickStart);
		add(unlockJewelleryBoxLastTeleport);
		add(unlockCharterShipLastDestination);

	}
}
