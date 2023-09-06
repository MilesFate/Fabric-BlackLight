package shyly.mymod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import shyly.mymod.Item.ModItems;
import shyly.mymod.block.ModBlocks;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerSmelting(exporter, List.of(ModItems.RAW_BLACKLIGHT), RecipeCategory.MISC, ModItems.BLACKLIGHT,0.7f,200,"blacklight");
        offerBlasting(exporter, List.of(ModItems.RAW_BLACKLIGHT), RecipeCategory.MISC, ModItems.BLACKLIGHT,0.7f,100,"blacklight");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACKLIGHT, RecipeCategory.DECORATIONS, ModBlocks.BLACKLIGHT_BLOCK);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.BLACKLIGHT_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ModBlocks.BLACKLIGHT_BLOCK)
                .input('#', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BLACKLIGHT_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.BLACKLIGHT_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BLACKLIGHT_SWORD)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.BLACKLIGHT_HAT)
                .pattern("XXX")
                .pattern("X X")
                .input('X', ModItems.BLACKLIGHT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BLACKLIGHT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BLACKLIGHT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BLACKLIGHT_HAT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.BLACKLIGHT_JACKET)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.BLACKLIGHT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BLACKLIGHT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BLACKLIGHT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BLACKLIGHT_JACKET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.BLACKLIGHT_TROUSER)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.BLACKLIGHT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BLACKLIGHT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BLACKLIGHT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BLACKLIGHT_TROUSER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.BLACKLIGHT_SHOES)
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.BLACKLIGHT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BLACKLIGHT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BLACKLIGHT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BLACKLIGHT_SHOES)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BLACKLIGHT_SLURRY)
                .pattern("XXX")
                .pattern("XBX")
                .pattern("XXX")
                .input('X', ModItems.BLACKLIGHT)
                .input('B', Items.WATER_BUCKET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BLACKLIGHT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BLACKLIGHT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BLACKLIGHT_SLURRY)));

        offerSmelting(exporter, List.of(ModItems.BLACKLIGHT_SLURRY), RecipeCategory.MISC, ModItems.FIGGY_PUDDING,0.7f,200,"figgy_puddying");

    }
}
