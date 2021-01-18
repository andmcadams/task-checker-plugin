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

public class HallowedSepulchreTaskList extends TaskList
{

	public HallowedSepulchreTaskList()
	{
		super("Hallowed Sepulchre");
		this.initTasks();
	}

	private void initTasks()
	{
		/**
		 * Hallowed Sepulchre
		 */
		// Squirrel metamorph?
		Task freeDarkmeyerSlave = new Task.TaskBuilder()
			.name("Give the Darkmeyer Slave 100 Hallowed Marks")
			.switchVar(true, Varbits.FREED_DARKMEYER_SLAVE.getId())
			.build();
		// Fastest run varb?

		Task freeKnightOfTheOwl = new Task.TaskBuilder()
			.name("Free the Knight of the Owl")
			.switchVar(true, Varbits.FREED_KNIGHT_OF_THE_OWL.getId())
			.build();

		Task freeKnightOfTheLion = new Task.TaskBuilder()
			.name("Free the Knight of the Lion")
			.switchVar(true, Varbits.FREED_KNIGHT_OF_THE_LION.getId())
			.build();

		Task freeKnightOfTheWolf = new Task.TaskBuilder()
			.name("Free the Knight of the Wolf")
			.switchVar(true, Varbits.FREED_KNIGHT_OF_THE_WOLF.getId())
			.build();

		Task freeKnightOfTheUnicorn = new Task.TaskBuilder()
			.name("Free the Knight of the Unicorn")
			.switchVar(true, Varbits.FREED_KNIGHT_OF_THE_UNICORN.getId())
			.build();

		Task freeArchpriestOfTheUnicorn = new Task.TaskBuilder()
			.name("Free the Archpriest of the Unicorn")
			.switchVar(true, Varbits.FREED_ARCHPRIEST_OF_THE_UNICORN.getId())
			.build();

		this.add(freeDarkmeyerSlave);
		this.add(freeKnightOfTheLion);
		this.add(freeKnightOfTheOwl);
		this.add(freeKnightOfTheUnicorn);
		this.add(freeKnightOfTheWolf);
		this.add(freeArchpriestOfTheUnicorn);

	}
}
