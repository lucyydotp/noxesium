package com.noxcrew.noxesium.mixin.component;

import net.minecraft.client.gui.font.FontManager;
import net.minecraft.client.gui.font.FontSet;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(FontManager.class)
public interface FontManagerExt {

    @Accessor("fontSets")
    Map<ResourceLocation, FontSet> getFontSets();
}
