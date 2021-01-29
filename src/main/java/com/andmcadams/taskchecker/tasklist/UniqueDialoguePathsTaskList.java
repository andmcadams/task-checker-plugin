/*
 * Copyright (c) 2021, Andrew McAdams
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
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
		Task listenToCatExplain = new Task.TaskBuilder()
			.name("Listen to your cat explain Icthlarin and the devourer again")
			.eqVar(true, Varbits.ASKED_CAT_ABOUT_DESTROYER.getId(), 3)
			.build();

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

		Task meetFairyAeryka = new Task.TaskBuilder()
			.name("Listen to Fairy Aeryka's Puro-Puro introduction")
			.switchVar(true, Varbits.MET_FAIRY_AERYKA.getId())
			.build();

		Task meetSilasDahcsnu = new Task.TaskBuilder()
			.name("Listen to Sil'as Dahcsnu's initial dialogue")
			.switchVar(true, Varbits.MET_SILAS_DAHCSNU.getId())
			.build();

		add(unlockRosie);
		add(getDirectionsFromBaraek);
		add(buyStaffFromEblis);
		add(askBrundtAboutMtnCamp);
		add(talkToTrufitus);
		add(listenToCatExplain);
		add(askDwarvenBoatmanAboutGold);
		add(tellThreeDwarves);
		add(askStreetUrchinToLureAgain);
		add(informKnightOfVarlamore);
		add(meetFairyAeryka);
		add(meetSilasDahcsnu);
	}

}
