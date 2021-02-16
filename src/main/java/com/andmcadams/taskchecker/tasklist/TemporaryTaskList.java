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

public class TemporaryTaskList extends TaskList
{

	public TemporaryTaskList()
	{
		super("Other tasks");
		initTasks();
	}

	public void initTasks()
	{
		Task meetFairyAeryka = new Task.TaskBuilder()
			.name("Listen to Fairy Aeryka's Puro-Puro introduction")
			.switchVar(true, Varbits.MET_FAIRY_AERYKA.getId())
			.build();

		Task meetSilasDahcsnu = new Task.TaskBuilder()
			.name("Listen to Sil'as Dahcsnu's initial dialogue")
			.switchVar(true, Varbits.MET_SILAS_DAHCSNU.getId())
			.build();

		Task meetDampe = new Task.TaskBuilder()
			.name("Listen to Dampe explain shade coffins")
			.switchVar(true, Varbits.MET_DAMPE.getId())
			.build();

		Task meetDrunkenDwarf = new Task.TaskBuilder()
			.name("Listen to the Drunken Dwarf talk about his relative")
			.switchVar(true, Varbits.MET_DRUNKEN_DWARF.getId())
			.build();

		Task receiveThanksFromHamal = new Task.TaskBuilder()
			.name("Receive thanks from Hamal after completing Mountain Daughter")
			.switchVar(true, Varbits.RECEIVE_THANKS_FROM_HAMAL.getId())
			.build();

		Task buyCandleFromCandleSeller = new Task.TaskBuilder()
			.name("Buy a candle from the Candle Seller in Lumbridge Swamp and listen to his warning")
			.switchVar(true, Varbits.BOUGHT_CANDLE_FROM_CANDLE_SELLER.getId())
			.build();

		Task claimRagAndBoneManIIRewards = new Task.TaskBuilder()
			.name("Claim the Rams skull helm and Bonesack from the Odd old man")
			.switchVar(true, Varbits.CLAIMED_RAMS_SKULL_HELM.getId())
			.switchVar(true, Varbits.CLAIMED_BONESACK.getId())
			.build();

		Task zeahWorkbenchNails = new Task.TaskBuilder()
			.name("Loot the workbench containing iron nails at Gordon's farm")
			.switchVar(true, Varbits.ZEAH_WORKBENCH_NAILS.getId())
			.build();

		Task piscatorisTools = new Task.TaskBuilder()
			.name("Loot the bronze axe and pickaxe in the Piscatoris fishing colony")
			.switchVar(true, Varbits.PISCATORIS_BRONZE_PICKAXE.getId())
			.switchVar(true, Varbits.PISCATORIS_BRONZE_AXE.getId())
			.build();

		add(meetFairyAeryka);
		add(meetSilasDahcsnu);
		add(meetDampe);
		add(meetDrunkenDwarf);
		add(receiveThanksFromHamal);
		add(buyCandleFromCandleSeller);
		add(claimRagAndBoneManIIRewards);
		add(zeahWorkbenchNails);
		add(piscatorisTools);
	}
}
