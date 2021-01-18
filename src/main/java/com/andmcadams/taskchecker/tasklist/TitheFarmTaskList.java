package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class TitheFarmTaskList extends TaskList
{
	public TitheFarmTaskList()
	{
		super("Tithe Farm");
		this.initTasks();
	}

	public void initTasks()
	{

		Task autoWeedUnlocked = new Task.TaskBuilder()
			.name("Unlocked Autoweed")
			.geVar(true, Varbits.AUTOWEED.getId(), 1)
			.build();

		Task bologaBlessingUnlocked = new Task.TaskBuilder()
			.name("Paid Bologa for the ability to purchase Bologa's blessings")
			.eqVar(true, Varbits.BOLOGA_STATE.getId(), 2)
			.build();

		this.add(autoWeedUnlocked);
		this.add(bologaBlessingUnlocked);

	}
}
