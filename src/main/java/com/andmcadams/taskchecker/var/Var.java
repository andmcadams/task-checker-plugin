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
package com.andmcadams.taskchecker.var;

import java.util.function.BiFunction;
import lombok.Getter;
import net.runelite.api.Client;

public class Var
{
	private boolean isVarbit;
	private int varIndex;

	@Getter
	private int targetValue;

	private BiFunction<Integer, Integer, Boolean> targetFunction;

	@Getter
	private int currentValue;

	public Var(boolean isVarbit, int varIndex, int targetValue, BiFunction<Integer, Integer, Boolean> targetFunction)
	{
		this.isVarbit = isVarbit;
		this.varIndex = varIndex;
		this.targetValue = targetValue;
		this.targetFunction = targetFunction;
	}

	public int setCurrentValue(Client client)
	{
		if (this.isVarbit == true)
			currentValue = client.getVarbitValue(this.varIndex);
		else
			currentValue = client.getVarpValue(this.varIndex);
		return currentValue;
	}

	public boolean isComplete()
	{
		return this.targetFunction.apply(currentValue, targetValue);
	}

	public String toString()
	{
		String varType = this.isVarbit ? "Varbit" : "Varplayer";
		return varType + " " + this.varIndex;
	}

	public static boolean isEqualTargetValue(int currentValue, int targetValue)
	{
		return currentValue == targetValue;
	}

	public static boolean isAtLeastTargetValue(int currentValue, int targetValue)
	{
		return currentValue >= targetValue;
	}

	public static boolean hasBitFlipped(int currentValue, int bitPosition)
	{
		return (currentValue & (1 << bitPosition)) != 0;
	}
}
