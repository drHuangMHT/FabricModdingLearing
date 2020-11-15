package com.dht.testmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.Block;


public class dhttestmod implements ModInitializer {

	private static final Item testitem = new testitemItem(new Item.Settings() .group(ItemGroup.MATERIALS) .maxCount(16));
	private static final Item testfood = new testfoodItem(new Item.Settings() .group(ItemGroup.FOOD) .maxCount(64));
	private static final Block testblock = new testblockBlock(FabricBlockSettings.of(Material.METAL));


	@Override

	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier("dhttestmod", "testitem"), testitem);
		Registry.register(Registry.ITEM, new Identifier("dhttestmod", "testfood"), testfood);
		Registry.register(Registry.BLOCK, new Identifier("dhttestmod", "testblock"), testblock);
		Registry.register(Registry.ITEM, new Identifier("dhttestmod","testblock"), new BlockItem(testblock, new Item.Settings() .group(ItemGroup.BUILDING_BLOCKS) .maxCount(64)));

		System.out.println("Hello Fabric world!");
		System.out.println("You've successfully installed this test mod if you see this message.");
	}
}
