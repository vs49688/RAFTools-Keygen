/*
 * RAFTools Inibin Keygen - Copyright (C) 2015 Zane van Iperen.
 *    Contact: zane.vaniperen@uqconnect.edu.au
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2, and only
 * version 2 as published by the Free Software Foundation. 
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Any and all GPL restrictions may be circumvented with permission from the
 * the original author.
 */
package net.vs49688.raftools.inibin.keygen;

import java.io.*;

public class Keygen {
	
	private static final String[] dataValues = new String[] {
		"AbilityPowerIncPerLevel",
		"AcquisitionRange",
		"AllowPetControl",
		"AlwaysVisible",
		"Armor",
		"ArmorMaterial",
		"ArmorPerLevel",
		"AssetCategory",
		"AttackDelayCastOffsetPercent",
		"AttackDelayCastOffsetPercentAttackSpeedRatio",
		"AttackDelayOffsetPercent",
		"AttackRange",
		"AttackSpeed",
		"AttackSpeedPerLevel",
		"BackgroundTexBotU",
		"BackgroundTexBotV",
		"BackgroundTexChaosOffset",
		"BackgroundTexU",
		"BackgroundTexV",
		"Badge0TexU",
		"Badge0TexV",
		"Badge0_ID",
		"Badge1TexU",
		"Badge1TexV",
		"Badge1_ID",
		"Badge2TexU",
		"Badge2TexV",
		"Badge2_ID",
		"Badge3TexU",
		"Badge3TexV",
		"Badge3_ID",
		"BadgeBorderTexHeight",
		"BadgeBorderTexU",
		"BadgeBorderTexV",
		"BadgeBorderTexWidth",
		"BadgeTexHeight",
		"BadgeTexWidth",
		"BarTextUVs0u1",
		"BarTextUVs0u2",
		"BarTextUVs0v1",
		"BarTextUVs0v2",
		"BarTextUVs1u1",
		"BarTextUVs1u2",
		"BarTextUVs1v1",
		"BarTextUVs1v2",
		"BarTextUVs2u1",
		"BarTextUVs2u2",
		"BarTextUVs2v1",
		"BarTextUVs2v2",
		"BarTextUVs3u1",
		"BarTextUVs3u2",
		"BarTextUVs3v1",
		"BarTextUVs3v2",
		"BaseAbilityPower",
		"BaseAttack_Probability",
		"BaseCritChance",
		"BaseDamage",
		"BaseDodge",
		"BaseFactorHPRegen",
		"BaseFactorMPRegen",
		"BaseHP",
		"BaseMP",
		"BaseStaticHPRegen",
		"BaseStaticMPRegen",
		"CanBeDropped",
		"CanBeSold",
		"CardBarHeightFactor",
		"CardBarWidthFactor",
		"CardBarXFactor",
		"CardBarYFactor",
		"CardHeightFixed",
		"CardWidthFixed",
		"ChampionBoxHeight",
		"ChampionBoxWidth",
		"ChampionBoxX",
		"ChampionBoxY",
		"ChampionNameHeight",
		"ChampionNameHeightForLongString",
		"ChampionNameOffset",
		"ChampionTextBoxHeight",
		"ChampionTextBoxWidth",
		"ChampionTextBoxX",
		"ChampionTextBoxY",
		"Classification",
		"ClearUndoHistoryOnActivate",
		"Clickable",
		"Consumed",
		"CooldownShowDisabledDuration",
		"CritAttack",
		"CritAttack_AttackDelayCastOffsetPercent",
		"CritAttack_AttackDelayOffsetPercent",
		"CritAttack_Probability",
		"CritDamageBonus",
		"CritPerLevel",
		"CriticalAttack",
		"DamagePerLevel",
		"DeathEventListeningRadius",
		"DeathTime",
		"DebugNumberOnChoas",
		"DebugNumberOnOrder",
		"DebugPing",
		"DelayCastOffsetPercent",
		"DelayTotalTimePercent",
		"Description",
		"DisableAggroIndicator",
		"DisappersOnDeath",
		"DisplayName",
		"DrawParLikeHealth",
		"DropsOnDeath",
		"DynamicTooltip",
		"EffectRadius",
		"EnemyTooltip",
		"Epicness",
		"ExpGivenOnDeath",
		"ExperienceRadius",
		"ExtraAttack1",
		"ExtraAttack1_AttackDelayCastOffsetPercent",
		"ExtraAttack1_Probability",
		"ExtraAttack2",
		"ExtraAttack2_AttackDelayCastOffsetPercent",
		"ExtraAttack2_Probability",
		"ExtraAttack3",
		"ExtraAttack3_AttackDelayCastOffsetPercent",
		"ExtraAttack3_Probability",
		"ExtraAttack4",
		"ExtraAttack4_Probability",
		"ExtraAttack5",
		"ExtraAttack5_Probability",
		"ExtraAttack6",
		"ExtraAttack6_Probability",
		"ExtraAttack7",
		"ExtraAttack7_Probability",
		"ExtraAttack8",
		"ExtraAttack8_Probability",
		"ExtraCritAttack1",
		"ExtraCritAttack1_AttackDelayCastOffsetPercent",
		"ExtraCritAttack2",
		"ExtraCritAttack3",
		"ExtraSpell1",
		"ExtraSpell10",
		"ExtraSpell2",
		"ExtraSpell3",
		"ExtraSpell4",
		"ExtraSpell5",
		"ExtraSpell6",
		"ExtraSpell7",
		"ExtraSpell8",
		"ExtraSpell9",
		"FireworksEnabled",
		"FlatArmorMod",
		"FlatAttackSpeedMod",
		"FlatCritChanceMod",
		"FlatCritDamageMod",
		"FlatDodgeMod",
		"FlatEnergyPoolMod",
		"FlatEnergyRegenMod",
		"FlatHPPoolMod",
		"FlatHPRegenMod",
		"FlatMPPoolMod",
		"FlatMPRegenMod",
		"FlatMagicDamageMod",
		"FlatMovementSpeedMod",
		"FlatPhysicalDamageMod",
		"FlatSpellBlockMod",
		"FriendlyTooltip",
		"GameplayCollisionRadius",
		"GlobalExpGivenOnDeath",
		"GlobalGoldGivenOnDeath",
		"GoldGivenOnDeath",
		"HPPerLevel",
		"HPRegenPerLevel",
		"HitFxScale",
		"HoverIndicatorRadius",
		"HoverIndicatorTextureName",
		"HoverLineIndicatorBaseTextureName",
		"HoverLineIndicatorTargetTextureName",
		"HoverLineIndicatorWidth",
		"Image",
		"ImageHeight",
		"ImageWidth",
		"InStore",
		"InventoryIcon",
		"InventorySlotMax",
		"InventorySlotMin",
		"IsElite",
		"IsEpic",
		"IsImportantBotTarget",
		"IsMelee",
		"IsRecipe",
		"ItemCalloutPlayer",
		"ItemCalloutSpectator",
		"ItemClass",
		"ItemGroup",
		"ItemId",
		"ItemType",
		"LevelDodge",
		"LiveUpdate",
		"LocalExpGivenOnDeath",
		"LocalGoldGivenOnDeath",
		"LocalGoldSplitWithLastHitter",
		"LongChampionName",
		"Lore1",
		"MPPerLevel",
		"MPRegenPerLevel",
		"MaxGroupOwnable",
		"MaxLevels",
		"MaxStack",
		"MessageOffsetX",
		"MessageOffsetY",
		"Metadata",
		"MonsterDataTableId",
		"MoveSpeed",
		"Name",
		"NeverRender",
		"NoAutoAttack",
		"NoHealthBar",
		"OccludedUnitSelectableDistance",
		"PARColor",
		"PARDisplayThroughDeath",
		"PARFadeColor",
		"PARHasRegenText",
		"PARIncrements",
		"PARMaxSegments",
		"PARNameString",
		"PARType",
		"PassLev1Desc1",
		"PassLev1Desc2",
		"PassLev1Desc3",
		"PassLev1Desc4",
		"PassLev1Desc5",
		"Passive1Desc",
		"Passive1Icon",
		"Passive1Level1",
		"Passive1Level2",
		"Passive1Level3",
		"Passive1Level4",
		"Passive1Level5",
		"Passive1Level6",
		"Passive1LuaName",
		"Passive1Name",
		"Passive2Level1",
		"Passive2Level2",
		"Passive2Level3",
		"Passive2Level4",
		"Passive3Level1",
		"Passive4Level1",
		"PathfindingCollisionRadius",
		"PercentArmorMod",
		"PercentAttackSpeedMod",
		"PercentCooldownMod",
		"PercentCritChanceMod",
		"PercentCritDamageMod",
		"PercentEXPBonus",
		"PercentHPPoolMod",
		"PercentHPRegenMod",
		"PercentLifeStealMod",
		"PercentMPRegenMod",
		"PercentMagicDamageMod",
		"PercentMagicPenetrationMod",
		"PercentMovementSpeedMod",
		"PercentPhysicalDamageMod",
		"PercentSlowResistMod",
		"PercentSpellBlockMod",
		"PercentSpellVampMod",
		"PercentTenacityItemMod",
		"PercentageCompleteTextX",
		"PercentageCompleteTextY",
		"PercentageMarginBetweenCardsX",
		"PercentageOfScreenBottomMargin",
		"PercentageOfScreenMiddleMargin",
		"PercentageOfScreenTopMargin",
		"PerceptionBubbleRadius",
		"PingBarMarginX",
		"PingBarMarginY",
		"PingBoxHeightFactor",
		"PingBoxOffsetFactorX",
		"PingBoxOffsetFactorY",
		"PingBoxWidthFactor",
		"Price",
		"ProgressTextX",
		"ProgressTextY",
		"ProgressbarBorderTexBotU",
		"ProgressbarBorderTexBotV",
		"ProgressbarBorderTexChaosOffset",
		"ProgressbarBorderTexU",
		"ProgressbarBorderTexV",
		"ProgressbarTexBotU",
		"ProgressbarTexBotV",
		"ProgressbarTexChaosOffset",
		"ProgressbarTexU",
		"ProgressbarTexV",
		"RankingsTextureAtlas",
		"RankingsTextureX",
		"RankingsTextureY",
		"RecipeItem1",
		"RecipeItem2",
		"RecipeItem3",
		"RecipeItem4",
		"RequiredChampion",
		"RequiredItem1",
		"RequiredLevel",
		"SelectionHeight",
		"SelectionRadius",
		"SellBackModifier",
		"ServerOnly",
		"ShouldFaceTarget",
		"Significance",
		"SkipDrawOutline",
		"SpecialRecipe",
		"Spell1",
		"Spell2",
		"Spell3",
		"Spell4",
		"SpellBlock",
		"SpellBlockPerLevel",
		"SpellDelayCastTime",
		"SpellDelayTotalTime",
		"SpellName",
		"SpellSupLevels1",
		"SpellSupLevels2",
		"SpellSupLevels3",
		"SpellSupLevels4",
		"SummonerNameHeight",
		"SummonerNameOffset",
		"SummonorBoxHeight",
		"SummonorBoxWidth",
		"SummonorSpellBox2X",
		"SummonorSpellBoxX",
		"SummonorSpellBoxY",
		"TeamsTextHeight",
		"TextWidth",
		"TextureHeight",
		"TextureName",
		"TextureWidth",
		"Textures",
		"Tips1",
		"Tips2",
		"TipsTextHeight",
		"TowerTargetingPriorityBoost",
		"UsableInStore",
		"UseChampionVisibility",
		"UseSkinNames",
		"UseWhenAcquired",
		"VsBorderTexBotU",
		"VsBorderTexBotV",
		"VsBorderTexU",
		"VsBorderTexV",
		"VsHeightFactor",
		"VsWidthFactor",
		"WeaponMaterial",
		"WeaponMaterial1",
		"WeaponMaterial2",
		"WeaponMaterial3",
		"blackboxheight",
		"blackboxwidth",
		"blackboxx",
		"blackboxy",
		"championcardheightpercentage",
		"championcardhorizontallayout",
		"chaoscardheightpercentage",
		"chaoscardwidthpercentage",
		"chaoscardxpercentage",
		"chaoscardypercentage",
		"flatBlockMod",
		"flatEXPBonus",
		"hideFromAll",
		"imagePath",
		"ordercardheightpercentage",
		"ordercardwidthpercentage",
		"ordercardxpercentage",
		"ordercardypercentage",
		"passive1range",
		"percentBlockMod",
		"percentDodgeMod",
		"percentMPPoolMod",
		"percentagecompletenopingtexty",
		"profileiconheightfactor",
		"profileiconoffsetfactorx",
		"profileiconoffsetfactory",
		"profileiconwidthfactor",
		"rFlatArmorModPerLevel",
		"rFlatArmorPenetrationMod",
		"rFlatArmorPenetrationModPerLevel",
		"rFlatCritChanceModPerLevel",
		"rFlatCritDamageModPerLevel",
		"rFlatDodgeMod",
		"rFlatDodgeModPerLevel",
		"rFlatEnergyModPerLevel",
		"rFlatEnergyRegenModPerLevel",
		"rFlatGoldPer10Mod",
		"rFlatHPModPerLevel",
		"rFlatHPRegenModPerLevel",
		"rFlatMPModPerLevel",
		"rFlatMPRegenModPerLevel",
		"rFlatMagicDamageModPerLevel",
		"rFlatMagicPenetrationMod",
		"rFlatMagicPenetrationModPerLevel",
		"rFlatMovementSpeedModPerLevel",
		"rFlatPhysicalDamageModPerLevel",
		"rFlatSpellBlockModPerLevel",
		"rFlatTimeDeadMod",
		"rFlatTimeDeadModPerLevel",
		"rPercentArmorPenetrationMod",
		"rPercentArmorPenetrationModPerLevel",
		"rPercentAttackSpeedModPerLevel",
		"rPercentCooldownMod",
		"rPercentCooldownModPerLevel",
		"rPercentMagicPenetrationMod",
		"rPercentMagicPenetrationModPerLevel",
		"rPercentMovementSpeedModPerLevel",
		"rPercentTimeDeadMod",
		"rPercentTimeDeadModPerLevel"        	
	};
		
	private static final String[] spellDataValues = new String[] {
		"AIBlockLevel",
		"AIEndOnly",
		"AILifetime",
		"AIRadius",
		"AIRange",
		"AISendEvent",
		"AISpeed",
		"AfterEffectName",
		"AlternateName",
		"AlwaysSnapFacing",
		"AmmoCountHiddenInUI",
		"AmmoRechargeTime",
		"AmmoUsed",
		"AnimationLeadOutName",
		"AnimationLoopName",
		"AnimationName",
		"AnimationWinddownName",
		"ApplyAttackDamage",
		"ApplyAttackEffect",
		"ApplyMaterialOnHitSound",
		"AttackDelayCastOffsetPercent",
		"BelongsToAvatar",
		"BounceRadius",
		"CanCastWhileDisabled",
		"CanMoveWhileChanneling",
		"CanOnlyCastWhileDead",
		"CanOnlyCastWhileDisabled",
		"CancelChargeOnRecastTime",
		"CannotBeSuppressed",
		"CantCancelWhileChanneling",
		"CantCancelWhileWindingUp",
		"CantCastWhileRooted",
		"CastConeAngle",
		"CastConeDistance",
		"CastFrame",
		"CastRadius",
		"CastRadiusSecondary",
		"CastRadiusSecondaryTexture",
		"CastRadiusTexture",
		"CastRange",
		"CastRange1",
		"CastRange2",
		"CastRange3",
		"CastRange4",
		"CastRange5",
		"CastRange6",
		"CastRangeDisplayOverride",
		"CastRangeGrowthDuration",
		"CastRangeGrowthMax",
		"CastRangeTextureOverrideName",
		"CastRangeUseBoundingBoxes",
		"CastTargetAdditionalUnitsRadius",
		"CastType",
		"ChannelDuration",
		"ChannelDuration1",
		"ChannelDuration2",
		"ChannelDuration3",
		"ChannelDuration4",
		"ChannelDuration5",
		"ChannelDuration6",
		"ChargeUpdateInterval",
		"CircleMissileAngularVelocity",
		"CircleMissileRadialVelocity",
		"ClientOnlyMissileTargetBoneName",
		"Coefficient",
		"Coefficient2",
		"Cooldown",
		"Cooldown1",
		"Cooldown2",
		"Cooldown3",
		"Cooldown4",
		"Cooldown5",
		"Cooldown6",
		"CursorChangesInGrass",
		"CursorChangesInTerrain",
		"DeathRecapPriority",
		"DelayCastOffsetPercent",
		"DelayTotalTimePercent",
		"Description",
		"DisableCastBar",
		"DisplayName",
		"DoNotNeedToFaceTarget",
		"DoesntBreakChannels",
		"DrawSecondaryLineIndicator",
		"DynamicExtended",
		"DynamicTooltip",
		"Effect1Level0Amount",
		"Effect1Level1Amount",
		"Effect1Level2Amount",
		"Effect1Level3Amount",
		"Effect1Level4Amount",
		"Effect1Level5Amount",
		"Effect1Level6Amount",
		"Effect2Level0Amount",
		"Effect2Level1Amount",
		"Effect2Level2Amount",
		"Effect2Level3Amount",
		"Effect2Level4Amount",
		"Effect2Level5Amount",
		"Effect2Level6Amount",
		"Effect3Level0Amount",
		"Effect3Level1Amount",
		"Effect3Level2Amount",
		"Effect3Level3Amount",
		"Effect3Level4Amount",
		"Effect3Level5Amount",
		"Effect3Level6Amount",
		"Effect4Level0Amount",
		"Effect4Level1Amount",
		"Effect4Level2Amount",
		"Effect4Level3Amount",
		"Effect4Level4Amount",
		"Effect4Level5Amount",
		"Effect4Level6Amount",
		"Effect5Level0Amount",
		"Effect5Level1Amount",
		"Effect5Level2Amount",
		"Effect5Level3Amount",
		"Effect5Level4Amount",
		"Effect5Level5Amount",
		"Effect5Level6Amount",
		"Flags",
		"FloatStaticsDecimals1",
		"FloatStaticsDecimals2",
		"FloatStaticsDecimals3",
		"FloatStaticsDecimals4",
		"FloatStaticsDecimals5",
		"FloatStaticsDecimals6",
		"FloatVarsDecimals1",
		"FloatVarsDecimals2",
		"FloatVarsDecimals3",
		"FloatVarsDecimals4",
		"FloatVarsDecimals5",
		"FloatVarsDecimals6",
		"HaveAfterEffect",
		"HaveHitBone",
		"HaveHitEffect",
		"HavePointEffect",
		"HideRangeIndicatorWhenCasting",
		"HitBoneName",
		"HitEffectName",
		"HitEffectOrientType",
		"HitEffectPlayerName",
		"IgnoreAnimContinueUntilCastFrame",
		"IgnoreRangeCheck",
		"InventoryIcon",
		"InventoryIcon1",
		"InventoryIcon2",
		"IsDisabledWhileDead",
		"IsToggleSpell",
		"KeywordWhenAcquired",
		"Level1Desc",
		"Level2Desc",
		"Level3Desc",
		"Level4Desc",
		"Level5Desc",
		"Level6Desc",
		"LineDragLength",
		"LineMissileBounces",
		"LineMissileCollisionFromStartPoint",
		"LineMissileDelayDestroyAtEndSeconds",
		"LineMissileEndsAtTargetPoint",
		"LineMissileFollowsTerrainHeight",
		"LineMissileTargetHeightAugment",
		"LineMissileTimePulseBetweenCollisionSpellHits",
		"LineMissileTrackUnits",
		"LineMissileUsesAccelerationForBounce",
		"LineTargetingBaseTextureOverrideName",
		"LineTargetingTargetTextureOverrideName",
		"LineWidth",
		"LocationTargettingLength1",
		"LocationTargettingLength2",
		"LocationTargettingLength3",
		"LocationTargettingLength4",
		"LocationTargettingLength5",
		"LocationTargettingLength6",
		"LocationTargettingWidth1",
		"LocationTargettingWidth2",
		"LocationTargettingWidth3",
		"LocationTargettingWidth4",
		"LocationTargettingWidth5",
		"LocationTargettingWidth6",
		"LockConeToPlayer",
		"LookAtPolicy",
		"LuaOnMissileUpdateDistanceInterval",
		"ManaCost1",
		"ManaCost2",
		"ManaCost3",
		"ManaCost4",
		"ManaCost5",
		"ManaCost6",
		"MaxAmmo",
		"MaxGrowthRangeTextureName",
		"MinimapIcon",
		"MinimapIconDisplayFlag",
		"MinimapIconRotation",
		"MissileAccel",
		"MissileBoneName",
		"MissileEffect",
		"MissileEffectPlayer",
		"MissileFixedTravelTime",
		"MissileGravity",
		"MissileLifetime",
		"MissileMaxSpeed",
		"MissileMinSpeed",
		"MissileMinTravelTime",
		"MissilePerceptionBubbleRadius",
		"MissilePerceptionBubbleRevealsStealth",
		"MissileSpeed",
		"MissileTargetHeightAugment",
		"MissileUnblockable",
		"Name",
		"NoWinddownIfCancelled",
		"NumSpellTargeters",
		"OrientRadiusTextureFromPlayer",
		"OrientRangeIndicatorToCursor",
		"OrientRangeIndicatorToFacing",
		"OverrideCastTime",
		"ParticleStartOffset",
		"PointEffectName",
		"RangeIndicatorTextureName",
		"Ranks",
		"SelectionPreference",
		"Sound_CastName",
		"Sound_HitName",
		"Sound_VOEventCategory",
		"SpellCastTime",
		"SpellRevealsChampion",
		"SpellTotalTime",
		"StartCooldown",
		"SubjectToGlobalCooldown",
		"TargeterConstrainedToRange",
		"TargettingType",
		"TextFlags",
		"TriggersGlobalCooldown",
		"UseAnimatorFramerate",
		"UseAutoattackCastTime",
		"UseChargeChanneling",
		"UseChargeTargeting",
		"UseGlobalLineIndicator",
		"UseMinimapTargeting",
		"Version",
		"x1",
		"x2",
		"x3",
		"x4",
		"x5"
	};
		
	private static final String[] buffDataValues = new String[] {
		"AlternateName",
		"DynamicExtended",
		"DynamicTooltip",
		"FloatVarsDecimals1",
		"FloatVarsDecimals2",
		"FloatVarsDecimals3",
		"HideDurationInUI"
	};
	
	private static int hashString(String section, String variable) {
		int hash = 0;
		
		section = section.toLowerCase();
		variable = variable.toLowerCase();
		
		for(int i = 0; i < section.length(); ++i) {
			hash = section.charAt(i) + 65599 * hash;
		}
		
		hash = (65599 * hash + 42);
		
		for(int i = 0; i < variable.length(); ++i) {
			hash = variable.charAt(i) + 65599 * hash;
		}
		
		return hash;
	}

	private static void printHashArray(PrintStream outs, String section, String[] values) {
		
		outs.printf("[%s]\n", section);
		for(final String v : values)
			outs.printf("%s=%d\n", v, hashString(section, v));
		
		outs.printf("\n");
	}

	public static void main(String[] args) throws IOException {
		
		if(args.length != 1) {
			System.err.printf("Usage:\n");
			System.err.printf("RAFTools-Keygen.jar <output file|->\n");
			return;
		}
		
		if(args[0].equals("-")) {
			dumpToIni(System.out);
		} else try(PrintStream p = new PrintStream(new File(args[0]))) {
			dumpToIni(p);
		}
	}
	
	private static void dumpToIni(PrintStream s) {
		printHashArray(s, "Data", dataValues);
		printHashArray(s, "SpellData", spellDataValues);
		printHashArray(s, "BuffData", buffDataValues);
	}
}
