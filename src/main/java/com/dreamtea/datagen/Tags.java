package com.dreamtea.datagen;

import com.dreamtea.utils.TagUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;

import static com.dreamtea.GlitterDots.NAMESPACE;
import static net.minecraft.item.Items.ANCIENT_DEBRIS;
import static net.minecraft.item.Items.NETHERITE_AXE;
import static net.minecraft.item.Items.NETHERITE_BLOCK;
import static net.minecraft.item.Items.NETHERITE_BOOTS;
import static net.minecraft.item.Items.NETHERITE_CHESTPLATE;
import static net.minecraft.item.Items.NETHERITE_HELMET;
import static net.minecraft.item.Items.NETHERITE_HOE;
import static net.minecraft.item.Items.NETHERITE_INGOT;
import static net.minecraft.item.Items.NETHERITE_LEGGINGS;
import static net.minecraft.item.Items.NETHERITE_PICKAXE;
import static net.minecraft.item.Items.NETHERITE_SCRAP;
import static net.minecraft.item.Items.NETHERITE_SHOVEL;
import static net.minecraft.item.Items.NETHERITE_SWORD;

public class Tags extends FabricTagProvider.ItemTagProvider {

  public static Identifier ZOMBIE_NO_PICKUP = new Identifier(NAMESPACE, "zombie_cannot_pickup");
  public static TagKey<Item> ZOMBIE_NO_PICKUP_TAG = TagUtils.createItemTag(ZOMBIE_NO_PICKUP);
  public static TagKey<Item> FIREPROOF = TagUtils.createItemTag(new Identifier(NAMESPACE, "fireproof"));

  public Tags(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    getOrCreateTagBuilder(ZOMBIE_NO_PICKUP_TAG).add(
      Items.GLOW_INK_SAC,
      Items.BONE,
      Items.SPIDER_EYE,
      Items.STRING,
      Items.ROTTEN_FLESH,
      Items.ENDER_PEARL,
      Items.DIRT,
      Items.GRASS_BLOCK,
      Items.CHICKEN,
      Items.COOKED_CHICKEN,
      Items.EGG,
      Items.FEATHER,
      Items.TROPICAL_FISH,
      Items.KELP,
      Items.ARROW);

    this.getOrCreateTagBuilder(FIREPROOF)
      .add(Items.DISC_FRAGMENT_5,
        ANCIENT_DEBRIS,
        NETHERITE_INGOT,
        NETHERITE_BLOCK,
        NETHERITE_AXE,
        NETHERITE_BOOTS,
        NETHERITE_CHESTPLATE,
        NETHERITE_HELMET,
        NETHERITE_HOE,
        NETHERITE_LEGGINGS,
        NETHERITE_PICKAXE,
        NETHERITE_SCRAP,
        NETHERITE_SHOVEL,
        NETHERITE_SWORD);
  }
}
