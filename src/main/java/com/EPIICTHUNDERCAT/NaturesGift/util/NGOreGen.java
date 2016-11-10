package com.EPIICTHUNDERCAT.NaturesGift.util;

import java.util.Random;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class NGOreGen implements IWorldGenerator {
	double l = Math.sin(1);

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: {
			WorldGenMinable PINK_DIAMOND_ORE = new WorldGenMinable(NGBlocks.PINK_DIAMOND_ORE.getDefaultState(), 9);
			for (int i = 0; i < 3; i++) {
				int x = chunkX * 16 + random.nextInt(16);
				int y = random.nextInt(1 + 2) + 2;
				int z = chunkZ * 16 + random.nextInt(16);
				PINK_DIAMOND_ORE.generate(world, random, new BlockPos(x, y, z));
			}
			break;
		}
		default: {
			break;
		}
		}

	}
}
