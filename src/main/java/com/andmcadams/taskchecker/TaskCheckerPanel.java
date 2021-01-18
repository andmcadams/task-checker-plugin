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
package com.andmcadams.taskchecker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.PluginPanel;
import com.andmcadams.taskchecker.tasklist.TaskList;

@Slf4j
public class TaskCheckerPanel extends PluginPanel
{

	TaskCheckerPlugin taskCheckerPlugin;
	ArrayList<TaskPanel> taskPanelList = new ArrayList<>();

	private JScrollPane scrollPane;

	public TaskCheckerPanel(TaskCheckerPlugin taskCheckerPlugin, ArrayList<TaskList> taskLists)
	{
		super(false);

		this.taskCheckerPlugin = taskCheckerPlugin;

		setBackground(ColorScheme.DARK_GRAY_COLOR);
		setLayout(new BorderLayout());

		// Create the container for the title and refresh task button
		JPanel topContainer = new JPanel();
		topContainer.setLayout(new BorderLayout());

		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		titlePanel.setLayout(new BorderLayout());

		JLabel title = new JLabel();
		title.setText("Task Checker");
		title.setForeground(Color.WHITE);
		titlePanel.add(title, BorderLayout.WEST);
		topContainer.add(titlePanel, BorderLayout.NORTH);

		JButton calculateTasksButton = new JButton("Check tasks");
		calculateTasksButton.setBorder(new EmptyBorder(10, 10, 10, 10));
		calculateTasksButton.setLayout(new BorderLayout());
		calculateTasksButton.addActionListener((event) -> this.checkTasks());
		topContainer.add(calculateTasksButton, BorderLayout.SOUTH);

		add(topContainer, BorderLayout.NORTH);

		// Create the task list panel
		FixedWidthPanel taskListPanel = new FixedWidthPanel();
		taskListPanel.setLayout(new DynamicGridLayout(0, 1, 0, 2));

		for (TaskList taskList : taskLists)
		{
			addTaskListHeader(taskListPanel, taskList.getName());
			for (Task task : taskList.getTasks())
			{
				addTask(taskListPanel, task);
			}
		}

		scrollPane = new JScrollPane(taskListPanel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new EmptyBorder(2, 2, 2, 2));
		scrollPane.setBackground(ColorScheme.DARK_GRAY_COLOR);

		add(scrollPane, BorderLayout.CENTER);

	}

	public void addTaskListHeader(JPanel taskListPanel, String name)
	{
		TaskListHeaderPanel taskListHeaderPanel = new TaskListHeaderPanel(name);
		taskListPanel.add(taskListHeaderPanel);
	}

	public void addTask(JPanel taskListPanel, Task task)
	{
		TaskPanel taskPanel = new TaskPanel(task);
		taskPanelList.add(taskPanel);
		taskListPanel.add(taskPanel);
	}

	public void checkTasks()
	{
		this.taskCheckerPlugin.checkTasks();
	}

	public void refresh()
	{

		for (TaskPanel taskPanel : taskPanelList)
		{
			taskPanel.updateCompletion();
		}

		repaint();
		revalidate();
	}
}
