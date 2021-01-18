package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class ForgottenPrayerTaskList extends TaskList
{

	public ForgottenPrayerTaskList()
	{
		super("Forgotten Prayers");
		initTasks();
	}

	public void initTasks()
	{
		Task unlockRigour = new Task.TaskBuilder()
			.name("Unlock Rigour")
			.switchVar(true, Varbits.UNLOCKED_RIGOUR.getId())
			.build();

		Task unlockAugury = new Task.TaskBuilder()
			.name("Unlock Augury")
			.switchVar(true, Varbits.UNLOCKED_AUGURY.getId())
			.build();

		Task unlockPreserve = new Task.TaskBuilder()
			.name("Unlock Preserve")
			.switchVar(true, Varbits.UNLOCKED_PRESERVE.getId())
			.build();

		this.add(unlockPreserve);
		this.add(unlockRigour);
		this.add(unlockAugury);
	}
}
