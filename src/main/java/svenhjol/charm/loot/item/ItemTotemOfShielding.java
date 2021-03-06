package svenhjol.charm.loot.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import svenhjol.charm.Charm;
import svenhjol.charm.loot.feature.TotemOfShielding;
import svenhjol.meson.IMesonItem;

public class ItemTotemOfShielding extends Item implements IMesonItem
{
    public ItemTotemOfShielding()
    {
        register("totem_of_shielding");
        setMaxStackSize(1);
        setMaxDamage(TotemOfShielding.maxHealth);
        setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public String getModId()
    {
        return Charm.MOD_ID;
    }
}