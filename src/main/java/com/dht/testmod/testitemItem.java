package com.dht.testmod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class testitemItem extends Item{
    public testitemItem(Settings settings ) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if(hand == Hand.MAIN_HAND)
        {
            System.out.println("This is an item for testing.");
        }
        return super.use(world, playerEntity, hand);
    }
}
