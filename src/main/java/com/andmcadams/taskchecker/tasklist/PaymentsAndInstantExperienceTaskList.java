package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import com.andmcadams.taskchecker.Varplayers;

public class PaymentsAndInstantExperienceTaskList extends TaskList
{

	public PaymentsAndInstantExperienceTaskList()
	{
		super("Payments and Instant experience");
		initTasks();
	}

	public void initTasks()
	{

		Task observatoryQuestWineClaimed = new Task.TaskBuilder()
			.name("Claim wine from the Observatory assistant")
			.eqVar(false, Varplayers.OBSERVATORY_QUEST_PROGESS.getId(), 8)
			.build();

		Task cabinFeverRewardClaimed = new Task.TaskBuilder()
			.name("Claim coins from Bill Teach")
			.switchVar(true, Varbits.CABIN_FEVER_REWARD_CLAIMED.getId())
			.build();

		Task gettingAheadRewardClaimed = new Task.TaskBuilder()
			.name("Claim coins from Gordon")
			.switchVar(true, Varbits.GETTING_AHEAD_REWARD_CLAIMED.getId())
			.build();

		Task queenOfThievesRewardClaimed = new Task.TaskBuilder()
			.name("Claim coins from Lady Shauna Piscarillius")
			.switchVar(true, Varbits.QUEEN_OF_THIEVES_REWARD_CLAIMED.getId())
			.build();

		Task monkeyMadnessIIRewardClaimed = new Task.TaskBuilder()
			.name("Claim experience from Duke")
			.geVar(true, Varbits.MONKEY_MADNESS_II_PROGRESS.getId(), 200)
			.build();

		Task dragonSlayerIIRewardClaimed = new Task.TaskBuilder()
			.name("Claim experience from Ellen")
			.eqVar(true, Varbits.DRAGON_SLAYER_II_REWARD_CLAIMED.getId(), 4)
			.build();

		Task misthalinMysteryRewardClaimed = new Task.TaskBuilder()
			.name("Claim experience from Mandy")
			.switchVar(true, Varbits.MISTHALIN_MYSTERY_REWARD_CLAIMED.getId())
			.build();

		Task xMarksTheSpotClueScrollClaimed = new Task.TaskBuilder()
			.name("Claim a clue scroll (beginner) from Veos")
			.switchVar(true, Varbits.X_MARKS_THE_SPOT_CLUE_SCROLL_CLAIMED.getId())
			.build();

		Task theFeudBeerClaimedFromAli = new Task.TaskBuilder()
			.name("Claim a beer from Ali the Barman")
			.eqVar(true, Varbits.THE_FEUD_BEER_CLAIMED_FROM_ALI.getId(), 2)
			.build();

		add(observatoryQuestWineClaimed);
		add(cabinFeverRewardClaimed);
		add(gettingAheadRewardClaimed);
		add(queenOfThievesRewardClaimed);
		add(monkeyMadnessIIRewardClaimed);
		add(dragonSlayerIIRewardClaimed);
		add(misthalinMysteryRewardClaimed);
		add(xMarksTheSpotClueScrollClaimed);
		add(theFeudBeerClaimedFromAli);
	}
}
