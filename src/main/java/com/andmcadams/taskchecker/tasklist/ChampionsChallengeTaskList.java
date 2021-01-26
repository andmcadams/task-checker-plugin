package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;

public class ChampionsChallengeTaskList extends TaskList
{

	public ChampionsChallengeTaskList()
	{
		super("Champions' Challenge");
		initTasks();
	}

	public void initTasks()
	{

		// Earth warrior, ghoul, hill giant, goblin, hobgoblin, imp, jogre, lesser demon, skeleton, zombie
		Task earthWarriorLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the earth warrior champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 0)
			.build();

		Task ghoulLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the ghoul champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 1)
			.build();

		Task giantLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the giant champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 2)
			.build();

		Task goblinLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the goblin champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 3)
			.build();

		Task hobgoblinLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the hobgoblin champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 4)
			.build();

		Task impLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the imp champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 5)
			.build();

		Task jogreLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the jogre champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 6)
			.build();

		Task lesserDemonLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the lesser demon champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 7)
			.build();

		Task skeletonLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the skeleton champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 8)
			.build();

		Task zombieLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the zombie champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 9)
			.build();

		Task humanLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the human champion")
			.bitVar(true, Varbits.CHAMPIONS_CHALLENGE_LAMPS_BITMAP.getId(), 10)
			.build();

		add(earthWarriorLampUsed);
		add(ghoulLampUsed);
		add(giantLampUsed);
		add(goblinLampUsed);
		add(hobgoblinLampUsed);
		add(impLampUsed);
		add(jogreLampUsed);
		add(lesserDemonLampUsed);
		add(skeletonLampUsed);
		add(zombieLampUsed);
		add(humanLampUsed);
	}
}
