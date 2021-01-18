package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class SlayerRewardsTaskList extends TaskList
{

	public SlayerRewardsTaskList()
	{
		super("Slayer Rewards");
		initTasks();
	}

	public void initTasks()
	{

		Task unlockSlugSalter = new Task.TaskBuilder()
			.name("Unlock Slug Salter")
			.switchVar(true, Varbits.UNLOCKED_SLUG_SALTER.getId())
			.build();

		Task unlockShroomSprayer = new Task.TaskBuilder()
			.name("Unlock 'Shroom Sprayer")
			.switchVar(true, Varbits.UNLOCKED_SHROOM_SPRAYER.getId())
			.build();

		Task unlockDulyNoted = new Task.TaskBuilder()
			.name("Unlock Duly Noted")
			.switchVar(true, Varbits.UNLOCKED_DULY_NOTED.getId())
			.build();

		this.add(unlockSlugSalter);
		this.add(unlockShroomSprayer);
		this.add(unlockDulyNoted);

	}
}
