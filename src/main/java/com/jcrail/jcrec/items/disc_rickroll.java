package com.jcrail.jcrec.items;

import com.jcrail.jcrec.JCRec;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class disc_rickroll extends ItemRecord {
    public disc_rickroll(String par0Str) {
        super(par0Str);
        setMaxStackSize(1);
        setUnlocalizedName("disc_rickroll");
        setCreativeTab(JCRec.jcrecCreativeTab);
    }

    //Icon Code
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(JCRec.MODID.toLowerCase() + ":disc_rickroll");
    }

    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation(JCRec.MODID + ":" + name);
    }
}
