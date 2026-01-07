package net.nhatjs.nextgen_furniture.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
            super(packOutput, provider);
        }

        @Override
        public RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "NhatJSNextGenFurnitureMod Recipes";
        }
    }

    @Override
    public void buildRecipes() {
        //wood
        Block planksBirch = Blocks.BIRCH_PLANKS;
        Block planksOak = Blocks.OAK_PLANKS;

        //stone
        Block buttonStone = Blocks.STONE_BUTTON;

        //wool
        Block woolGray = Blocks.GRAY_WOOL;
        Block woolWhite = Blocks.WHITE_WOOL;

        //banner

        //concrete
        Block concreteBlack = Blocks.BLACK_CONCRETE;
        Block concreteWhite = Blocks.WHITE_CONCRETE;

        //terracotta
        Block terracottaCyan = Blocks.CYAN_TERRACOTTA;

        //dye
        Item dyeBlack = Items.BLACK_DYE;
        Item dyeWhite = Items.WHITE_DYE;

        //misc
        Item stick = Items.STICK;
        Item ingotIron = Items.IRON_INGOT;
        Block blockIron = Blocks.IRON_BLOCK;

        //glass pane
        Block glassPaneStainedBlack = Blocks.BLACK_STAINED_GLASS_PANE;

        //electronic
        Item redstone = Items.REDSTONE;
        Block redstoneLamp = Blocks.REDSTONE_LAMP;
        Block redstoneComparator = Blocks.COMPARATOR;
        Block hopper = Blocks.HOPPER;

        //furniture mod
        DeferredBlock<Block> table1x1Black = ModBlocks.TABLE_1X1_BLACK;
        DeferredBlock<Block> table1x1White = ModBlocks.TABLE_1X1_WHITE;
        DeferredBlock<Block> monitorGamingMinimalist = ModBlocks.MONITOR_GAMING_MINIMALIST;
        DeferredBlock<Block> keyboardMechanicalBlack = ModBlocks.KEYBOARD_MECHANICAL_BLACK;
        DeferredBlock<Block> mouseGamingBlack = ModBlocks.MOUSE_GAMING_BLACK;
        DeferredItem<Item> computerFanBladeWhite = ModItems.COMPUTER_FAN_BLADE_WHITE;
        DeferredItem<Item> drawerWhite = ModItems.DRAWER_WHITE;
        DeferredBlock<Block> drawer3KMWoodOakBase = ModBlocks.DRAWER_3_K_M_WOOD_OAK_BASE;
        DeferredBlock<Block> drawer3KMWoodBirchBase = ModBlocks.DRAWER_3_K_M_WOOD_BIRCH_BASE;
        DeferredBlock<Block> drawer2KMWoodOakBase = ModBlocks.DRAWER_2_K_M_WOOD_OAK_BASE;
        DeferredBlock<Block> drawer2KMWoodBirchBase = ModBlocks.DRAWER_2_K_M_WOOD_BIRCH_BASE;
        DeferredBlock<Block> table1x1WoodOak = ModBlocks.TABLE_1X1_WOOD_OAK;
        DeferredBlock<Block> table1x1WoodBirch = ModBlocks.TABLE_1X1_WOOD_BIRCH;

        //others
        Block bedGray = Blocks.GRAY_BED;
        Block bedWhite = Blocks.WHITE_BED;
        Block noteBlock = Blocks.NOTE_BLOCK;
        Item endCrystal = Items.END_CRYSTAL;
        Block chest = Blocks.CHEST;
        Item painting = Items.PAINTING;
        Item string = Items.STRING;

        shaped(RecipeCategory.DECORATIONS, ModBlocks.AIO_COOLER_3_FANS)
                .pattern("111")
                .pattern("222")
                .pattern("31 ")
                .define('1', concreteBlack)
                .define('2', computerFanBladeWhite)
                .define('3', string)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_white_blade_computer_fan", has(computerFanBladeWhite))
                .unlockedBy("has_string", has(string))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.BED_GRAY_WOOD_BIRCH)
                .pattern("121")
                .define('1', planksBirch)
                .define('2', bedGray)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_gray_bed", has(bedGray))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.BED_GRAY_WOOD_OAK)
                .pattern("121")
                .define('1', planksOak)
                .define('2', bedGray)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_gray_bed", has(bedGray))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.BED_WHITE_WOOD_BIRCH)
                .pattern("121")
                .define('1', planksBirch)
                .define('2', bedWhite)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_white_bed", has(bedWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.BED_WHITE_WOOD_OAK)
                .pattern("121")
                .define('1', planksOak)
                .define('2', bedWhite)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_white_bed", has(bedWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_2_WHITE_GRAY, 2)
                .pattern("1  ")
                .pattern("111")
                .pattern("2 2")
                .define('1', woolGray)
                .define('2', concreteWhite)
                .unlockedBy("has_gray_wool", has(woolGray))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_2_WHITE_WHITE, 2)
                .pattern("1  ")
                .pattern("111")
                .pattern("2 2")
                .define('1', woolWhite)
                .define('2', concreteWhite)
                .unlockedBy("has_white_wool", has(woolWhite))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_2_WOOD_BIRCH_GRAY, 2)
                .pattern("1  ")
                .pattern("111")
                .pattern("2 2")
                .define('1', woolGray)
                .define('2', planksBirch)
                .unlockedBy("has_gray_wool", has(woolGray))
                .unlockedBy("has_birch_planks", has(planksBirch))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_2_WOOD_BIRCH_WHITE, 2)
                .pattern("1  ")
                .pattern("111")
                .pattern("2 2")
                .define('1', woolWhite)
                .define('2', planksBirch)
                .unlockedBy("has_white_wool", has(woolWhite))
                .unlockedBy("has_birch_planks", has(planksBirch))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_2_WOOD_OAK_GRAY, 2)
                .pattern("1  ")
                .pattern("111")
                .pattern("2 2")
                .define('1', woolGray)
                .define('2', planksOak)
                .unlockedBy("has_gray_wool", has(woolGray))
                .unlockedBy("has_oak_planks", has(planksOak))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_2_WOOD_OAK_WHITE, 2)
                .pattern("1  ")
                .pattern("111")
                .pattern("2 2")
                .define('1', woolWhite)
                .define('2', planksOak)
                .unlockedBy("has_white_wool", has(woolWhite))
                .unlockedBy("has_oak_planks", has(planksOak))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_WHITE, 2)
                .pattern("2  ")
                .pattern("211")
                .pattern("2 2")
                .define('1', concreteWhite)
                .define('2', stick)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_WOOD_BIRCH, 2)
                .pattern("2  ")
                .pattern("211")
                .pattern("2 2")
                .define('1', planksBirch)
                .define('2', stick)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CHAIR_WOOD_OAK, 2)
                .pattern("2  ")
                .pattern("211")
                .pattern("2 2")
                .define('1', planksOak)
                .define('2', stick)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.COFFEE_TABLE_WHITE, 2)
                .pattern("111")
                .define('1', concreteWhite)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.COMPUTER_CASE_GAMING)
                .pattern("143")
                .pattern("123")
                .pattern("113")
                .define('1', concreteBlack)
                .define('2', redstone)
                .define('3', computerFanBladeWhite)
                .define('4', buttonStone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_white_blade_computer_fan", has(computerFanBladeWhite))
                .unlockedBy("has_stone_button", has(buttonStone))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.COMPUTER_CPU)
                .pattern(" 2 ")
                .pattern("212")
                .pattern(" 2 ")
                .define('1', endCrystal)
                .define('2', ingotIron)
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_iron_ingot", has(ingotIron))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.COMPUTER_FAN_BLADE_WHITE, 3)
                .pattern("121")
                .pattern("212")
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', ingotIron)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_iron_ingot", has(ingotIron))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.COMPUTER_POWER_SUPPLY)
                .pattern("111")
                .pattern("432")
                .pattern("151")
                .define('1', concreteBlack)
                .define('2', redstone)
                .define('3', endCrystal)
                .define('4', buttonStone)
                .define('5', redstoneComparator)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_white_blade_computer_fan", has(computerFanBladeWhite))
                .unlockedBy("has_stone_button", has(buttonStone))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.COMPUTER_RAM_GAMING, 2)
                .pattern("111")
                .pattern("222")
                .define('1', dyeBlack)
                .define('2', ingotIron)
                .unlockedBy("has_black_dye", has(dyeBlack))
                .unlockedBy("has_iron_ingot", has(ingotIron))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.DRAWER_WHITE, 3)
                .pattern("1 1")
                .pattern("111")
                .define('1', concreteWhite)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.DRAWER_2_K_M_WOOD_BIRCH_BASE, 2)
                .pattern("111")
                .pattern("2 2")
                .pattern("222")
                .define('1', planksBirch)
                .define('2', concreteWhite)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.DRAWER_2_K_M_WOOD_BIRCH)
                .pattern("1 ")
                .pattern("12")
                .define('1', drawerWhite)
                .define('2', drawer2KMWoodBirchBase)
                .unlockedBy("has_white_drawer", has(drawerWhite))
                .unlockedBy("has_drawer2KMWoodBirchBase", has(drawer2KMWoodBirchBase))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.DRAWER_2_K_M_WOOD_OAK_BASE, 2)
                .pattern("111")
                .pattern("2 2")
                .pattern("222")
                .define('1', planksOak)
                .define('2', concreteWhite)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.DRAWER_2_K_M_WOOD_OAK)
                .pattern("1 ")
                .pattern("12")
                .define('1', drawerWhite)
                .define('2', drawer2KMWoodOakBase)
                .unlockedBy("has_white_drawer", has(drawerWhite))
                .unlockedBy("has_drawer2KMWoodOakBase", has(drawer2KMWoodOakBase))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.DRAWER_3_K_M_WOOD_BIRCH_BASE, 2)
                .pattern("111")
                .pattern("222")
                .pattern("222")
                .define('1', planksBirch)
                .define('2', concreteWhite)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.DRAWER_3_K_M_WOOD_BIRCH)
                .pattern("1 ")
                .pattern("12")
                .pattern("1 ")
                .define('1', drawerWhite)
                .define('2', drawer3KMWoodBirchBase)
                .unlockedBy("has_white_drawer", has(drawerWhite))
                .unlockedBy("has_drawer3KMWoodBirchBase", has(drawer3KMWoodBirchBase))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.DRAWER_3_K_M_WOOD_OAK_BASE, 2)
                .pattern("111")
                .pattern("222")
                .pattern("222")
                .define('1', planksOak)
                .define('2', concreteWhite)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.DRAWER_3_K_M_WOOD_OAK)
                .pattern("1 ")
                .pattern("12")
                .pattern("1 ")
                .define('1', drawerWhite)
                .define('2', drawer3KMWoodOakBase)
                .unlockedBy("has_white_drawer", has(drawerWhite))
                .unlockedBy("has_drawer3KMWoodOakBase", has(drawer3KMWoodOakBase))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.FLOOR_LAMP)
                .pattern(" 2 ")
                .pattern(" 1 ")
                .pattern("3 3")
                .define('1', planksOak)
                .define('2', redstoneLamp)
                .define('3', stick)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_redstone_lamp", has(redstoneLamp))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.FLOOR_LAMP_B)
                .pattern(" 2 ")
                .pattern(" 1 ")
                .pattern("3 3")
                .define('1', planksBirch)
                .define('2', redstoneLamp)
                .define('3', stick)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_redstone_lamp", has(redstoneLamp))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.GAME_CONSOLE)
                .pattern("121")
                .pattern("141")
                .pattern("131")
                .define('1', concreteBlack)
                .define('2', redstone)
                .define('3', endCrystal)
                .define('4', buttonStone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_stone_button", has(buttonStone))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.GRAPHICS_CARD_GAMING)
                .pattern("121")
                .pattern("333")
                .pattern("411")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', ingotIron)
                .define('4', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_iron_ingot", has(ingotIron))
                .unlockedBy("has_redstone", has(redstone))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.KEYBOARD_MECHANICAL_BLACK)
                .pattern("222")
                .pattern("313")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', dyeWhite)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_white_dye", has(dyeWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_OAK)
                .pattern("222")
                .pattern("313")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', planksOak)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_oak_planks", has(planksOak))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_BIRCH)
                .pattern("222")
                .pattern("313")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', planksBirch)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_birch_planks", has(planksBirch))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.LAPTOP)
                .pattern("131")
                .pattern("567")
                .pattern("242")
                .define('1', concreteBlack)
                .define('2', concreteWhite)
                .define('3', glassPaneStainedBlack)
                .define('4', redstone)
                .define('5', noteBlock)
                .define('6', endCrystal)
                .define('7', buttonStone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_black_stained_glass_pane", has(glassPaneStainedBlack))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_note_block", has(noteBlock))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_stone_button", has(buttonStone))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_MODERN, 2)
                .pattern(" 1 ")
                .pattern("121")
                .pattern(" 1 ")
                .define('1', ingotIron)
                .define('2', redstoneLamp)
                .unlockedBy("has_iron_ingot", has(ingotIron))
                .unlockedBy("has_redstone_lamp", has(redstoneLamp))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.MAINBOARD_GAMING)
                .pattern("311")
                .pattern("321")
                .pattern("141")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', redstone)
                .define('4', hopper)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_hopper", has(hopper))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR)
                .pattern("1 ")
                .pattern("23")
                .define('1', monitorGamingMinimalist)
                .define('2', keyboardMechanicalBlack)
                .define('3', mouseGamingBlack)
                .unlockedBy("has_minimalist_gaming_monitor", has(monitorGamingMinimalist))
                .unlockedBy("has_black_mechanical_keyboard", has(keyboardMechanicalBlack))
                .unlockedBy("has_black_gaming_mouse", has(mouseGamingBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR_DUAL)
                .pattern("11")
                .pattern("23")
                .define('1', monitorGamingMinimalist)
                .define('2', keyboardMechanicalBlack)
                .define('3', mouseGamingBlack)
                .unlockedBy("has_minimalist_gaming_monitor", has(monitorGamingMinimalist))
                .unlockedBy("has_black_mechanical_keyboard", has(keyboardMechanicalBlack))
                .unlockedBy("has_black_gaming_mouse", has(mouseGamingBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR_GAMING_MINIMALIST)
                .pattern("141")
                .pattern("121")
                .pattern(" 3 ")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', terracottaCyan)
                .define('4', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_cyan_terracotta", has(terracottaCyan))
                .unlockedBy("has_redstone", has(redstone))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.MOUSE_GAMING_BLACK)
                .pattern(" 1 ")
                .pattern("324")
                .pattern(" 1 ")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', buttonStone)
                .define('4', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_redstone", has(redstone))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.PICTURE_FRAME)
                .pattern("121")
                .define('1', planksOak)
                .define('2', painting)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_painting", has(painting))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.SCREWDRIVER)
                .pattern("1  ")
                .pattern(" 12")
                .pattern(" 21")
                .define('1', ingotIron)
                .define('2', dyeBlack)
                .unlockedBy("has_iron_ingot", has(ingotIron))
                .unlockedBy("has_black_dye", has(dyeBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.SOFA_GRAY, 2)
                .pattern("111")
                .pattern("111")
                .define('1', woolGray)
                .unlockedBy("has_gray_wool", has(woolGray))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.SOFA_WHITE, 2)
                .pattern("111")
                .pattern("111")
                .define('1', woolWhite)
                .unlockedBy("has_white_wool", has(woolWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_1X1_BLACK, 2)
                .pattern("11")
                .pattern("22")
                .define('1', concreteBlack)
                .define('2', stick)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_1X1_WHITE, 2)
                .pattern("11")
                .pattern("22")
                .define('1', concreteWhite)
                .define('2', stick)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_1X1_WOOD_BIRCH, 2)
                .pattern("11")
                .pattern("22")
                .define('1', planksBirch)
                .define('2', stick)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_1X1_WOOD_OAK, 2)
                .pattern("11")
                .pattern("22")
                .define('1', planksOak)
                .define('2', stick)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_stick", has(stick))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_2X1_BLACK)
                .pattern("11")
                .define('1', table1x1Black)
                .unlockedBy("has_black_1x1_table", has(table1x1Black))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_2X1_WHITE)
                .pattern("11")
                .define('1', table1x1White)
                .unlockedBy("has_white_1x1_table", has(table1x1White))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_2X1_WOOD_BIRCH)
                .pattern("11")
                .define('1', table1x1WoodBirch)
                .unlockedBy("has_birch_wood_1x1_table", has(table1x1WoodBirch))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_2X1_WOOD_OAK)
                .pattern("11")
                .define('1', table1x1WoodOak)
                .unlockedBy("has_oak_wood_1x1_table", has(table1x1WoodOak))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_DINING_WHITE, 2)
                .pattern("111")
                .pattern("2 2")
                .define('1', concreteWhite)
                .define('2', concreteBlack)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_DINING_WOOD_BIRCH, 2)
                .pattern("111")
                .pattern("2 2")
                .define('1', planksBirch)
                .define('2', concreteBlack)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TABLE_DINING_WOOD_OAK, 2)
                .pattern("111")
                .pattern("2 2")
                .define('1', planksOak)
                .define('2', concreteBlack)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TRASH_CAN_BLACK, 2)
                .pattern("1")
                .pattern("1")
                .define('1', concreteBlack)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TRASH_CAN_WHITE, 2)
                .pattern("1")
                .pattern("1")
                .define('1', concreteWhite)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TV_OLED)
                .pattern("111")
                .pattern("121")
                .pattern("131")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_redstone", has(redstone))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TV_STAND_WOOD_BIRCH)
                .pattern("121")
                .pattern("3 3")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteBlack)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.TV_STAND_WOOD_OAK)
                .pattern("121")
                .pattern("3 3")
                .define('1', planksOak)
                .define('2', chest)
                .define('3', concreteBlack)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_LEFT)
                .pattern("111")
                .pattern("123")
                .pattern("113")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteBlack)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.WARDROBE_MODERN_WOOD_OAK_LEFT)
                .pattern("111")
                .pattern("123")
                .pattern("113")
                .define('1', planksOak)
                .define('2', chest)
                .define('3', concreteBlack)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_RIGHT)
                .pattern("111")
                .pattern("321")
                .pattern("311")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteBlack)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.WARDROBE_MODERN_WOOD_OAK_RIGHT)
                .pattern("111")
                .pattern("321")
                .pattern("311")
                .define('1', planksOak)
                .define('2', chest)
                .define('3', concreteBlack)
                .unlockedBy("has_oak_planks", has(planksOak))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.WASHING_MACHINE)
                .pattern("121")
                .pattern("434")
                .pattern("141")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', blockIron)
                .define('4', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_iron_block", has(blockIron))
                .unlockedBy("has_redstone", has(redstone))
                .save(output);
    }
}