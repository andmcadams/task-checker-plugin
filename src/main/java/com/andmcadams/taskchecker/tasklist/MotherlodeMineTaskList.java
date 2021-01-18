package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class MotherlodeMineTaskList extends TaskList
{

	public MotherlodeMineTaskList()
	{
		super("Motherlode Mine");
		initTasks();
	}

	public void initTasks()
	{
//		Task getAccessToUpperMine = new Task.TaskBuilder()
//			.name("Pay Prospector Percy for access to the upper levels of the mine")
//			.switchVar(true, Varbits.PAID_FOR_UPPER_MINE.getId())
//			.build();

		Task upgradeSack = new Task.TaskBuilder()
			.name("Pay Prospector Percy for the bigger sack capacity")
			.switchVar(true, Varbits.UPGRADED_MLM_SACK.getId())
			.build();

//		this.add(getAccessToUpperMine);
		this.add(upgradeSack);

	}
}
