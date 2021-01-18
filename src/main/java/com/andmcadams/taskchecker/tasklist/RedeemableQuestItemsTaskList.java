package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import com.andmcadams.taskchecker.Varplayers;

public class RedeemableQuestItemsTaskList extends TaskList
{

	public RedeemableQuestItemsTaskList()
	{
		super("Redeemable quest items");
		initTasks();
	}

	public void initTasks()
	{

		Task tradeDiaryOfHerbiFlax = new Task.TaskBuilder()
			.name("Trade the diary of Herbi Flax to the Apothecary")
			.bitVar(false, Varplayers.MORTTON_STATE.getId(), 30)
			.build();

		Task tradeWeissFireNotes = new Task.TaskBuilder()
			.name("Trade the Weiss fire notes to Burntmeat")
			.switchVar(true, Varbits.GAVE_WEISS_FIRE_NOTES_TO_BURNTMEAT.getId())
			.build();

		Task tradeBlackPrism = new Task.TaskBuilder()
			.name("Trade the black prism to Yanni Salika or Zavistic Rarve")
			.switchVar(true, Varbits.GAVE_BLACK_PRISM_AWAY.getId())
			.build();

		add(tradeDiaryOfHerbiFlax);
		add(tradeWeissFireNotes);
		add(tradeBlackPrism);
	}
}
