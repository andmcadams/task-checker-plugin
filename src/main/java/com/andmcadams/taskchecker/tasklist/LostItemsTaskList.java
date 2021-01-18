package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import com.andmcadams.taskchecker.Varplayers;

public class LostItemsTaskList extends TaskList
{

	public LostItemsTaskList()
	{
		super("Lost items");
		initTasks();
	}

	public void initTasks()
	{

		Task returnCoppersCollar = new Task.TaskBuilder()
			.name("Deliver Copper's crimson collar to Veos")
			.eqVar(true, Varbits.VEOS_COLLAR_PROGRESS.getId(), 2)
			.build();

		Task returnZealotsKey = new Task.TaskBuilder()
			.name("Deliver Zealot's key to Zealot")
			.eqVar(true, Varbits.ZEALOT_KEY.getId(), 0)
			.eqVar(false, Varplayers.HAUNTED_MINE_PROGRESS.getId(), 11)
			.build();

		Task returnMistagsBrooch = new Task.TaskBuilder()
			.name("Return the brooch to Mistag")
			.switchVar(true, Varbits.BROOCH_RETURNED_TO_MISTAG.getId())
			.build();

		add(returnCoppersCollar);
		add(returnZealotsKey);
		add(returnMistagsBrooch);
	}

}
