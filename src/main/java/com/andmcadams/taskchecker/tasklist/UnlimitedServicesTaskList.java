package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class UnlimitedServicesTaskList extends TaskList
{

	public UnlimitedServicesTaskList()
	{
		super("Unlimited services");
		initTasks();
	}

	public void initTasks()
	{

		Task enhanceCamulet = new Task.TaskBuilder()
			.name("Enhance the Camulet for one million coins")
			.eqVar(true, Varbits.CAMULET_CHARGES.getId(), 7)
			.build();

		Task paySaniboch = new Task.TaskBuilder()
			.name("Pay Saniboch one million coins for permanent access to Brimhaven dungeon")
			.switchVar(true, Varbits.PERMANENT_ACCESS_BRIMHAVEN_DUNGEON.getId())
			.build();

		Task payAndras = new Task.TaskBuilder()
			.name("Pay Andras for free trips to Slepe")
			.switchVar(true, Varbits.PERMANENT_PAYMENT_SLEPE_BOAT.getId())
			.build();

		add(enhanceCamulet);
		add(paySaniboch);
		add(payAndras);
	}
}
