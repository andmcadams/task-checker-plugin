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

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Varplayers
{
	SHILO_VILLAGE_PROGRESS(116),
	SOA_PHOENIX_GANG_PROGRESS(145),

	// Beginner clues are varp 2201
	// Master clues are varp 2353
	MASTER_CASKETS_OPENED(2201),
	BEGINNER_CASKETS_OPENED(2353),

	// Cloister Bell, when ge than 5 quickstart is enabled
	GROTESQUE_GUARDIANS_KILLCOUNT(1669),

	// Mortton state varp
	// LO bits 5, 6 appear to be 208 on Ulsquire and Razmire, 8 appears to be looting the table
	// LO bit 30 seems to be returning the diary to the Apothecary
	MORTTON_STATE(340),

	HAUNTED_MINE_PROGRESS(382),

	// value 8 appears to be the assistant giving the player wine
	OBSERVATORY_QUEST_PROGESS(112);

	private final int id;
}
