package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class LovakengjMinecartNetworkTaskList extends TaskList
{

	public LovakengjMinecartNetworkTaskList()
	{
		super("Lovakengj Minecart Network");
		initTasks();
	}

	public void initTasks()
	{

		Task payMiriam = new Task.TaskBuilder()
			.name("Pay Miriam for free minecart rides")
			.eqVar(true, Varbits.PAID_MIRIAM_FOR_MINECART_USAGE.getId(), 2)
			.build();

		add(payMiriam);
	}
}
