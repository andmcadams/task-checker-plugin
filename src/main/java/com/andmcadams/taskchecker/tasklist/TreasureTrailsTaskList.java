package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import com.andmcadams.taskchecker.Varplayers;

public class TreasureTrailsTaskList extends TaskList
{

	public TreasureTrailsTaskList()
	{
		super("Treasure Trails");
		initTasks();
	}

	public void initTasks()
	{

		Task unlockExploreEmote = new Task.TaskBuilder()
			.name("Unlock the Explore emote")
			.geVar(false, Varplayers.BEGINNER_CASKETS_OPENED.getId(), 600)
			.build();

		Task unlockLargeSpade = new Task.TaskBuilder()
			.name("Unlock the Large spade")
			.geVar(true, Varbits.EASY_CASKETS_OPENED.getId(), 500)
			.build();

		Task unlockCluelessScroll = new Task.TaskBuilder()
			.name("Unlock the Clueless scroll")
			.geVar(true, Varbits.MEDIUM_CASKETS_OPENED.getId(), 400)
			.build();

		Task unlockUriTransformEmote = new Task.TaskBuilder()
			.name("Unlock the Uri transform emote")
			.geVar(true, Varbits.HARD_CASKETS_OPENED.getId(), 300)
			.build();

		Task unlockHeavyCasket = new Task.TaskBuilder()
			.name("Unlock the Heavy casket")
			.geVar(true, Varbits.ELITE_CASKETS_OPENED.getId(), 200)
			.build();

		Task unlockScrollSack = new Task.TaskBuilder()
			.name("Unlock the Scroll sack")
			.geVar(false, Varplayers.MASTER_CASKETS_OPENED.getId(), 100)
			.build();

		this.add(unlockExploreEmote);
		this.add(unlockLargeSpade);
		this.add(unlockCluelessScroll);
		this.add(unlockUriTransformEmote);
		this.add(unlockHeavyCasket);
		this.add(unlockScrollSack);
	}
}
