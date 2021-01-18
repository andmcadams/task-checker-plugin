package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class HiddenShopsTaskList extends TaskList
{

	public HiddenShopsTaskList()
	{
		super("Hidden shops and trading services");
		initTasks();
	}

	public void initTasks()
	{

		// Unsure of what the varp for uglug is

		Task unlockValiggaShop = new Task.TaskBuilder()
			.name("Unlock Vanligga Gastfrihet's shop, Contraband yak produce")
			.eqVar(true, Varbits.VANLIGGA_STATE.getId(), 2)
			.build();

		add(unlockValiggaShop);
	}
}
