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

import java.util.ArrayList;
import lombok.Getter;
import net.runelite.api.Client;
import com.andmcadams.taskchecker.var.Var;

public class Task
{
	@Getter
	private String name;

	private ArrayList<Var> varsToCheck;

	// Main constructor, can be used with arbitrary numbers of vars with any checks.
	public Task(String name, ArrayList<Var> varsToCheck)
	{
		this.name = name;
		this.varsToCheck = varsToCheck;
	}

	public void setCurrentValues(Client client)
	{
		for (Var v : varsToCheck)
		{
			v.setCurrentValue(client);
		}
	}

	public boolean isComplete()
	{
		for (Var v : varsToCheck)
		{
			if (!v.isComplete())
				return false;
		}
		return true;
	}

	public ArrayList<Var> getVarsToCheck()
	{
		return (ArrayList<Var>) varsToCheck.clone();
	}

	public static class TaskBuilder
	{
		private String name;
		private ArrayList<Var> varsToCheck;

		public TaskBuilder()
		{
			varsToCheck = new ArrayList<>();
		}

		public TaskBuilder name(String name)
		{
			this.name = name;
			return this;
		}

		public TaskBuilder switchVar(boolean isVarbit, int varIndex)
		{
			Var v = new Var(isVarbit, varIndex, 1, Var::isEqualTargetValue);
			varsToCheck.add(v);
			return this;
		}

		public TaskBuilder eqVar(boolean isVarbit, int varIndex, int targetValue)
		{
			Var v = new Var(isVarbit, varIndex, targetValue, Var::isEqualTargetValue);
			varsToCheck.add(v);
			return this;
		}

		public TaskBuilder geVar(boolean isVarbit, int varIndex, int targetValue)
		{
			Var v = new Var(isVarbit, varIndex, targetValue, Var::isAtLeastTargetValue);
			varsToCheck.add(v);
			return this;
		}

		// This is a bit of a hack to make bitmaps easy to read.
		public TaskBuilder bitVar(boolean isVarbit, int varIndex, int bitPosition)
		{
			Var v = new Var(isVarbit, varIndex, bitPosition, Var::hasBitFlipped);
			varsToCheck.add(v);
			return this;
		}

		public Task build()
		{
			Task task = new Task(name, varsToCheck);
			return task;
		}
	}

}
