package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class UtilityItemTaskList extends TaskList
{

	public UtilityItemTaskList()
	{
		super("Utility items");
		initTasks();
	}

	public void initTasks()
	{

		Task attachKalphiteRopes = new Task.TaskBuilder()
			.name("Attach ropes to both Kalphite Hives tunnel entrances")
			.switchVar(true, Varbits.KALPHITE_LAIR_OUTSIDE_ROPE.getId())
			.geVar(true, Varbits.KALPHITE_LAIR_INSIDE_ROPE.getId(), 1)
			.build();

		Task attachObservatoryGrapple = new Task.TaskBuilder()
			.name("Attach a grapple to the rocks next to the Observatory")
			.switchVar(true, Varbits.OBSERVATORY_GRAPPLE.getId())
			.build();

		Task attachDarkmeyerRopes = new Task.TaskBuilder()
			.name("Attach both long ropes to both sides of the Darkmeyer wall")
			.switchVar(true, Varbits.DARKMEYER_WEST_ROPE.getId())
			.switchVar(true, Varbits.DARKMEYER_EAST_ROPE.getId())
			.build();

		add(attachKalphiteRopes);
		add(attachObservatoryGrapple);
		add(attachDarkmeyerRopes);
	}
}
