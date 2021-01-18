package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import com.andmcadams.taskchecker.Varplayers;

public class UniqueDialoguePathsTaskList extends TaskList
{

	public UniqueDialoguePathsTaskList()
	{
		super("Unique dialogue paths");
		initTasks();
	}

	public void initTasks()
	{

		Task unlockRosie = new Task.TaskBuilder()
			.name("Unlocked Rosie")
			.switchVar(true, Varbits.UNLOCKED_ROSIE.getId())
			.build();

		Task getDirectionsFromBaraek = new Task.TaskBuilder()
			.name("Get directions from Baraek")
			.geVar(false, Varplayers.SOA_PHOENIX_GANG_PROGRESS.getId(), 4)
			.build();

		Task buyStaffFromEblis = new Task.TaskBuilder()
			.name("Pay Eblis for an ancient staff")
			.switchVar(true, Varbits.BOUGHT_STAFF_FROM_EBLIS.getId())
			.build();

		Task askBrundtAboutMtnCamp = new Task.TaskBuilder()
			.name("Asked Chieftain Brundt about the Mountain Camp")
			.switchVar(true, Varbits.ASKED_BRUNDT_ABOUT_MTN_CAMP.getId())
			.build();

		// Unsure about this one, but looks this way from chisel data
		Task talkToTrufitus = new Task.TaskBuilder()
			.name("Talk to Trufitus after completing Shilo Village")
			.eqVar(false, Varplayers.SHILO_VILLAGE_PROGRESS.getId(), 17)
			.build();

		// CAT - UNKNOWN
		// ZOOKNOCK - UNKNOWN

		Task askDwarvenBoatmanAboutGold = new Task.TaskBuilder()
			.name("Asked the Dwarven Boatman about transporting gold")
			.switchVar(true, Varbits.ASKED_DWARVEN_BOATMAN_ABOUT_GOLD.getId())
			.build();

		Task tellThreeDwarves = new Task.TaskBuilder()
			.name("Tell the three dwarven boatmen about the dwarven quests")
			.switchVar(true, Varbits.TOLD_THREE_DWARVES_BETWEEN_A_ROCK.getId())
			.switchVar(true, Varbits.TOLD_THREE_DWARVES_GIANT_DWARF.getId())
			.switchVar(true, Varbits.TOLD_THREE_DWARVES_FORGETTABLE_TALE.getId())
			.build();

		// MIAZRQA - UNKNOWN

		Task askStreetUrchinToLureAgain = new Task.TaskBuilder()
			.name("Tell the Street urchin to lure another villager")
			.switchVar(true, Varbits.ASKED_STREET_URCHIN_TO_LURE_AGAIN.getId())
			.build();

		Task informKnightOfVarlamore = new Task.TaskBuilder()
			.name("Tell the Knight of Varlamore about the sun altar")
			.switchVar(true, Varbits.INFORMED_KNIGHT_OF_VARLAMORE.getId())
			.build();

		add(unlockRosie);
		add(getDirectionsFromBaraek);
		add(buyStaffFromEblis);
		add(askBrundtAboutMtnCamp);
		add(talkToTrufitus);
		add(askDwarvenBoatmanAboutGold);
		add(tellThreeDwarves);
		add(askStreetUrchinToLureAgain);
		add(informKnightOfVarlamore);
	}

}
