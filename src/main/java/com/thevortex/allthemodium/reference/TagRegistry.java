package com.thevortex.allthemodium.reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagManager;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class TagRegistry {

    public static final Tag.Named<Block> ALLTHEMODIUM_ORE = BlockTags.createOptional(Reference.ore("allthemodium"));
    public static final Tag.Named<Block> VIBRANIUM_ORE = BlockTags.createOptional(Reference.ore("vibranium"));
    public static final Tag.Named<Block> UNOBTAINIUM_ORE = BlockTags.createOptional(Reference.ore("unobtainium"));

    public static final Tag.Named<Item> ALLTHEMODIUM_ORE_ITEM = ItemTags.createOptional(Reference.ore("allthemodium"));
    public static final Tag.Named<Item> VIBRANIUM_ORE_ITEM = ItemTags.createOptional(Reference.ore("vibranium"));
    public static final Tag.Named<Item> UNOBTAINIUM_ORE_ITEM = ItemTags.createOptional(Reference.ore("unobtainium"));

    public static final Tag.Named<Block> ALLTHEMODIUM_BLOCK = BlockTags.createOptional(Reference.block("allthemodium"));
    public static final Tag.Named<Block> VIBRANIUM_BLOCK = BlockTags.createOptional(Reference.block("vibranium"));
    public static final Tag.Named<Block> UNOBTAINIUM_BLOCK = BlockTags.createOptional(Reference.block("unobtainium"));

    public static final Tag.Named<Item> ALLTHEMODIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("allthemodium"));
    public static final Tag.Named<Item> VIBRANIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("vibranium"));
    public static final Tag.Named<Item> UNOBTAINIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("unobtainium"));

    public static final Tag.Named<Item> ALLTHEMODIUM_INGOT = ItemTags.createOptional(Reference.ingot("allthemodium"));
    public static final Tag.Named<Item> VIBRANIUM_INGOT = ItemTags.createOptional(Reference.ingot("vibranium"));
    public static final Tag.Named<Item> UNOBTAINIUM_INGOT = ItemTags.createOptional(Reference.ingot("unobtainium"));

    public static final Tag.Named<Item> ALLTHEMODIUM_DUST = ItemTags.createOptional(Reference.dust("allthemodium"));
    public static final Tag.Named<Item> VIBRANIUM_DUST = ItemTags.createOptional(Reference.dust("vibranium"));
    public static final Tag.Named<Item> UNOBTAINIUM_DUST = ItemTags.createOptional(Reference.dust("unobtainium"));

    public static final Tag.Named<Item> ALLTHEMODIUM_NUGGET = ItemTags.createOptional(Reference.nugget("allthemodium"));
    public static final Tag.Named<Item> VIBRANIUM_NUGGET = ItemTags.createOptional(Reference.nugget("vibranium"));
    public static final Tag.Named<Item> UNOBTAINIUM_NUGGET = ItemTags.createOptional(Reference.nugget("unobtainium"));



    private static Tags.IOptionalNamedTag<Item> forge(String name)
    {
        return net.minecraft.tags.ItemTags.createOptional(new ResourceLocation("forge", name));
    }
}
