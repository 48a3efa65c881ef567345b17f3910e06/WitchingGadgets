package witchinggadgets.common.recipes.other;

import static witchinggadgets.common.recipes.WG_other_recipes.registerCompoundRecipe;
import static witchinggadgets.common.recipes.WG_other_recipes.registerShapedOreRecipe;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import witchinggadgets.common.WGContent;

public class WG_other_gemcutting {

    public static void registerGemcutting() {
        registerShapedOreRecipe(
                "GEMCUTTING",
                "_TOOLS",
                new ItemStack(WGContent.ItemMaterial, 1, 8),
                "qfi",
                "sss",
                'q',
                GT_OreDictUnificator.get(OrePrefixes.gemChipped, Materials.Ruby, 1L),
                'f',
                GT_OreDictUnificator.get(OrePrefixes.gemChipped, Materials.Diamond, 1L),
                'i',
                GT_OreDictUnificator.get(OrePrefixes.gemChipped, Materials.Emerald, 1L),
                's',
                GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Thaumium, 1L));

        registerCompoundRecipe(
                "GEMCUTTING",
                "",
                new AspectList(),
                1,
                2,
                1,
                new ItemStack(WGContent.ItemMaterial, 1, 8),
                new ItemStack(ConfigBlocks.blockTable));
    }
}
