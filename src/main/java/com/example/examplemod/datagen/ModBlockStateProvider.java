package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, ExampleMod.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels(){
    }
}
