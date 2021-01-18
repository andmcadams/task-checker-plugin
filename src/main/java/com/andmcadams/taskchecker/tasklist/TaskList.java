package com.andmcadams.taskchecker.tasklist;

import java.util.ArrayList;
import lombok.Getter;
import com.andmcadams.taskchecker.Task;

public class TaskList
{

	@Getter
	private String name;

	@Getter
	private ArrayList<Task> tasks = new ArrayList<>();

	public TaskList(String name)
	{
		this.name = name;
	}

	public boolean add(Task task)
	{
		return tasks.add(task);
	}

}
