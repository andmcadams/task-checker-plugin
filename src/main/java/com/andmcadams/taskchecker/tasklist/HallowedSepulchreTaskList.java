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
