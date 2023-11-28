package net.takie.takieterra.world.gen;

public class TakieTerraWorldGeneration {
    public static void generateTakieTerraWorldGeneration() {
        TakieTerraTreeGeneration.generateTrees();
        TakieTerraOreGeneration.generateOres();
        TakieTerraFlowerGeneration.generateFlowers();
        TakieTerraGeodeGeneration.generateGeodes();
    }
}
