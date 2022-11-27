package com.dreamtea.villager;

import net.minecraft.village.VillageGossipType;
import net.minecraft.village.VillagerGossips;

import java.util.UUID;
import java.util.function.Predicate;

public interface IGenerallyFriendly {
  public int getBestReputationOfOthers(UUID target, Predicate<VillageGossipType> gossipTypeFilter);
}
