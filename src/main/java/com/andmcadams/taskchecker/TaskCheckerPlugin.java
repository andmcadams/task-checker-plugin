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

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import com.andmcadams.taskchecker.tasklist.TaskList;

@Slf4j
@PluginDescriptor(
	name = "Task Checker"
)
public class TaskCheckerPlugin extends Plugin
{
	@Inject
	private Client client;
	@Inject
	private ClientThread clientThread;
	@Inject
	private ClientToolbar clientToolbar;

	private CompleteTaskList tasks;
	private TaskCheckerPanel taskCheckerPanel;
	private NavigationButton navButton;
	private ArrayList<TaskList> tasksCopy;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Task Checker started!");
		tasks = new CompleteTaskList();
		tasksCopy = tasks.getTaskLists();
		taskCheckerPanel = new TaskCheckerPanel(this, tasksCopy);

		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(getClass(), "/task_icon.png");
		navButton = NavigationButton.builder().tooltip("Task Checker").icon(icon).priority(7).panel(taskCheckerPanel).build();
		clientToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Task Checker stopped!");
		clientToolbar.removeNavigation(navButton);
	}

	public void checkTasks()
	{
		clientThread.invoke(() -> {
			for (TaskList taskList : tasksCopy)
				for (Task task : taskList.getTasks())
					task.setCurrentValues(client);
			SwingUtilities.invokeLater(() -> taskCheckerPanel.refresh());
		});
	}
}
