package bluesteel42.farmstorageblocks.registries;

import bluesteel42.farmstorageblocks.block.ModBlocks;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

public class ModRegistries {
    public static void registerCompostables() {
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.APPLE_BUSHEL, 0.85F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BEETROOT_BOX, 0.85F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CARROT_CRATE, 0.85F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.POTATO_SACK, 0.85F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.COCOA_BEANS_PAIL, 0.85F);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BEETROOT_SEED_PAIL, 0.50F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MELON_SEED_PAIL, 0.50F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PUMPKIN_SEED_PAIL, 0.50F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHEAT_SEED_PAIL, 0.50F);
    }
}
