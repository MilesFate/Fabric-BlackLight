package shyly.mymod.world.gen;

import shyly.mymod.world.ModOrePlacement;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();
    }
}