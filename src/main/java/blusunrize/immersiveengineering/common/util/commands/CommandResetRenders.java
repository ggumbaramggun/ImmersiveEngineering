/*
 * BluSunrize
 * Copyright (c) 2017
 *
 * This code is licensed under "Blu's License of Common Sense"
 * Details can be found in the license file in the root folder of this project
 */

package blusunrize.immersiveengineering.common.util.commands;

import blusunrize.immersiveengineering.ImmersiveEngineering;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

/**
 * @author BluSunrize - 05.09.2016
 */
public class CommandResetRenders
{
	public static LiteralArgumentBuilder<CommandSource> create()
	{
		LiteralArgumentBuilder<CommandSource> ret = Commands.literal("resetrender");
		ret.executes(context -> {
			ImmersiveEngineering.proxy.clearRenderCaches();
			return Command.SINGLE_SUCCESS;
		});
		return ret;
	}
}
