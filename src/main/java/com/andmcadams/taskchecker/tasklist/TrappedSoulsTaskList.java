package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import com.andmcadams.taskchecker.Varplayers;

public class TrappedSoulsTaskList extends TaskList
{

	public TrappedSoulsTaskList()
	{
		super("Trapped souls and afflicted characters");
		initTasks();
	}

	public void initTasks()
	{
		Task freeKlenter = new Task.TaskBuilder()
			.name("Free Klenter's soul from Amascut's torment")
			.eqVar(true, Varbits.FREED_KLENTER.getId(), 0)
			.eqVar(true, Varbits.ICTHLARINS_LITTLE_HELPER_PROGRESS.getId(), 26)
			.build();

		Task freeDroalak = new Task.TaskBuilder()
			.name("Free Droalak's soul from his guilt of departure")
			.switchVar(true, Varbits.FREED_DROALAK.getId())
			.build();

		Task cureRazmireAndUlsquire = new Task.TaskBuilder()
			.name("Free Razmire Keelgan and Ulsquire Shauncy from affliction")
			.bitVar(false, Varplayers.MORTTON_STATE.getId(), 5)
			.bitVar(false, Varplayers.MORTTON_STATE.getId(), 6)
			.build();

		add(freeKlenter);
		add(freeDroalak);
		add(cureRazmireAndUlsquire);
	}
}
