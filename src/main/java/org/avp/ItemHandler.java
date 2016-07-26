package org.avp;

import org.avp.entities.mob.EntityAqua;
import org.avp.entities.mob.EntityChestburster;
import org.avp.entities.mob.EntityCombatSynthetic;
import org.avp.entities.mob.EntityCrusher;
import org.avp.entities.mob.EntityDeaconShark;
import org.avp.entities.mob.EntityDrone;
import org.avp.entities.mob.EntityEngineer;
import org.avp.entities.mob.EntityFacehugger;
import org.avp.entities.mob.EntityHammerpede;
import org.avp.entities.mob.EntityMarine;
import org.avp.entities.mob.EntityOvamorph;
import org.avp.entities.mob.EntityPraetorian;
import org.avp.entities.mob.EntityPredalien;
import org.avp.entities.mob.EntityProtomorph;
import org.avp.entities.mob.EntityQueen;
import org.avp.entities.mob.EntityRoyalFacehugger;
import org.avp.entities.mob.EntityRunnerDrone;
import org.avp.entities.mob.EntityRunnerWarrior;
import org.avp.entities.mob.EntitySpaceJockey;
import org.avp.entities.mob.EntitySpitter;
import org.avp.entities.mob.EntityTrilobite;
import org.avp.entities.mob.EntityWarrior;
import org.avp.entities.mob.EntityYautja;
import org.avp.entities.mob.EntityYautjaBerserker;
import org.avp.items.ItemAPC;
import org.avp.items.ItemArmorMarine;
import org.avp.items.ItemArmorPressureSuit;
import org.avp.items.ItemArmorTitanium;
import org.avp.items.ItemArmorXeno;
import org.avp.items.ItemDisc;
import org.avp.items.ItemEntitySummoner;
import org.avp.items.ItemFirearm;
import org.avp.items.ItemFirearm.ItemAmmo;
import org.avp.items.ItemGrenade;
import org.avp.items.ItemIngotLithium;
import org.avp.items.ItemLaserMine;
import org.avp.items.ItemM240IncineratorUnit;
import org.avp.items.ItemMaintenanceJack;
import org.avp.items.ItemNostromoFlamethrower;
import org.avp.items.ItemPlasmaCaster;
import org.avp.items.ItemShuriken;
import org.avp.items.ItemSpear;
import org.avp.items.ItemStorageDevice;
import org.avp.items.ItemSupplyChute;
import org.avp.items.ItemWristbracer;

import com.arisux.airi.AIRI;
import com.arisux.airi.lib.ItemTypes.HookedItem;
import com.arisux.airi.lib.ItemTypes.HookedItemAxe;
import com.arisux.airi.lib.ItemTypes.HookedItemPickaxe;
import com.arisux.airi.lib.ModUtil.IBHandler;
import com.arisux.airi.lib.interfaces.IInitializable;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class ItemHandler extends IBHandler implements IInitializable
{
    public static ItemHandler instance                    = new ItemHandler();

    public Item               helmXeno                    = (new ItemArmorXeno(AliensVsPredator.materials().armors().chitin, 4, 0));
    public Item               plateXeno                   = (new ItemArmorXeno(AliensVsPredator.materials().armors().chitin, 4, 1));
    public Item               legsXeno                    = (new ItemArmorXeno(AliensVsPredator.materials().armors().chitin, 4, 2));
    public Item               bootsXeno                   = (new ItemArmorXeno(AliensVsPredator.materials().armors().chitin, 4, 3));
    public Item               pressureMask                = new ItemArmorPressureSuit(AliensVsPredator.materials().armors().pressuresuit, 4, 0);
    public Item               pressureChest               = new ItemArmorPressureSuit(AliensVsPredator.materials().armors().pressuresuit, 4, 1);
    public Item               pressurePants               = new ItemArmorPressureSuit(AliensVsPredator.materials().armors().pressuresuit, 4, 2);
    public Item               pressureBoots               = new ItemArmorPressureSuit(AliensVsPredator.materials().armors().pressuresuit, 4, 3);
    public Item               helmMarine                  = (new ItemArmorMarine(AliensVsPredator.materials().armors().kevlar, 4, 0));
    public Item               plateMarine                 = (new ItemArmorMarine(AliensVsPredator.materials().armors().kevlar, 4, 1));
    public Item               legsMarine                  = (new ItemArmorMarine(AliensVsPredator.materials().armors().kevlar, 4, 2));
    public Item               bootsMarine                 = (new ItemArmorMarine(AliensVsPredator.materials().armors().kevlar, 4, 3));
    public Item               helmTitanium                = (new ItemArmorTitanium(AliensVsPredator.materials().armors().celtic, 4, 0));
    public Item               legsTitanium                = (new ItemArmorTitanium(AliensVsPredator.materials().armors().celtic, 4, 2));
    public Item               plateTitanium               = (new ItemArmorTitanium(AliensVsPredator.materials().armors().celtic, 4, 1));
    public Item               bootsTitanium               = (new ItemArmorTitanium(AliensVsPredator.materials().armors().celtic, 4, 3));
    public Item               shovelTitanium              = (new ItemSpade(AliensVsPredator.materials().tools().celtic));
    public Item               pickaxeTitanium             = (new HookedItemPickaxe(AliensVsPredator.materials().tools().celtic));
    public Item               axeTitanium                 = (new HookedItemAxe(AliensVsPredator.materials().tools().celtic));
    public Item               swordTitanium               = (new ItemSword(AliensVsPredator.materials().tools().celtic));
    public Item               hoeTitanium                 = (new ItemHoe(AliensVsPredator.materials().tools().celtic));
    public Item               itemSpear                   = (new ItemSpear(AliensVsPredator.materials().tools().celtic));
    public Item               itemWristBlade              = (new ItemWristbracer()).setDescription("Applies " + ItemWristbracer.getDamageToApply() + " damage to any entity, regardless of their armor, while blades are inserted.").setMaxStackSize(1);
    public Item               itemWristbracerBlades       = (new HookedItem()).disableIcon().setDescription("Place these in the first slot of your wristbracer").setMaxStackSize(1).setMaxDurability(AliensVsPredator.materials().tools().celtic.getMaxUses());
    public Item               itemPlasmaCaster            = (new ItemPlasmaCaster()).setFull3D();
    public Item               itemProximityMine           = (new ItemLaserMine());
    public Item               itemDisc                    = (new ItemDisc());
    public Item               itemShuriken                = (new ItemShuriken());
    public Item               itemGrenade                 = (new ItemGrenade(false));
    public Item               itemIncendiaryGrenade       = (new ItemGrenade(true));
    public Item               itemAmmoPistol              = ((HookedItem) (new ItemAmmo(1.0F))).setDescription("A magazine classified for use with pistols.");
    public Item               itemPistolStock             = (new HookedItem()).disableIcon().setDescription("A Pistol stock for use in assembling pistols.").setMaxStackSize(64);
    public Item               itemPistolBarrel            = (new HookedItem()).disableIcon().setDescription("A Pistol barrel for use in assembling pistols.").setMaxStackSize(64);
    public Item               itemPistolAction            = (new HookedItem()).disableIcon().setDescription("A Pistol action for use in assembling pistols.").setMaxStackSize(64);
    public Item               itemAmmoAR                  = ((HookedItem) (new ItemAmmo(2.0F))).setDescription("A magazine classified for use with assault rifles.");
    public Item               itemAmmoAC                  = ((HookedItem) (new ItemAmmo(2.5F))).setDescription("A magazine classified for use with assault carbines.");
    public Item               itemAmmoSMG                 = ((HookedItem) (new ItemAmmo(4.5F))).setDescription("A magazine classified for use with sub machine-guns.");
    public Item               itemAmmoSniper              = ((HookedItem) (new ItemAmmo(18.0F))).setDescription("A magazine classified for use with sniper rifles.");
    public Item               itemFuelTank                = (new HookedItem()).setDescription("Pressurized fuel tank.").setMaxStackSize(1).setMaxDurability(64);
    public Item               itemM240ICU                 = (new ItemM240IncineratorUnit(itemFuelTank)).disableIcon().setDescription("M240 Incinerator Unit");
    public Item               itemNostromoFlamethrower    = (new ItemNostromoFlamethrower(itemFuelTank)).disableIcon().setDescription("Flame Thrower (Nostromo)");
    public Item               itemPistol                  = (new ItemFirearm(12, 2.0F, 15, 120, (ItemAmmo) itemAmmoPistol, AliensVsPredator.properties().SOUND_WEAPON_GUNSHOT));
    public Item               itemM4                      = (new ItemFirearm(24, 0.5F, 3, 120, (ItemAmmo) itemAmmoAR, AliensVsPredator.properties().SOUND_WEAPON_GUNSHOT).setSoundLength(0.75D).disableIcon()).setFull3D();
    public Item               itemM4Stock                 = (new HookedItem()).disableIcon().setDescription("An M4 stock for use in assembling M4's.").setMaxStackSize(64);
    public Item               itemM4Barrel                = (new HookedItem()).disableIcon().setDescription("An M4 barrel for use in assembling M4's.").setMaxStackSize(64);
    public Item               itemM4Action                = (new HookedItem()).disableIcon().setDescription("An M4 action for use in assembling M4's.").setMaxStackSize(64);
    public Item               itemSniper                  = (new ItemFirearm(6, 1.8F, 40, 150, (ItemAmmo) itemAmmoSniper, AliensVsPredator.properties().SOUND_WEAPON_SNIPER).disableIcon()).setFull3D();
    public Item               itemSniperStock             = (new HookedItem()).disableIcon().setDescription("A Sniper Rifle stock for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item               itemSniperBarrel            = (new HookedItem()).disableIcon().setDescription("A Sniper Rifle barrel for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item               itemSniperAction            = (new HookedItem()).disableIcon().setDescription("A Sniper Rifle action for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item               itemSniperScope             = (new HookedItem()).disableIcon().setDescription("A Sniper Rifle scope for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item               itemSniperPeripherals       = (new HookedItem()).disableIcon().setDescription("Sniper Rifle peripherals for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item               itemM41A                    = (new ItemFirearm(99, 0.5F, 2, 120, (ItemAmmo) itemAmmoAC, AliensVsPredator.properties().SOUND_WEAPON_PULSERIFLE).setSoundLength(1.25D).disableIcon()).setFull3D();
    public Item               itemM41AStock               = (new HookedItem()).disableIcon().setDescription("An M41A stock for use in assembling M41A's.").setMaxStackSize(64);
    public Item               itemM41ABarrel              = (new HookedItem()).disableIcon().setDescription("An M41A barrel for use in assembling M41A's.").setMaxStackSize(64);
    public Item               itemM41AAction              = (new HookedItem()).disableIcon().setDescription("An M41A action for use in assembling M41A's.").setMaxStackSize(64);
    public Item               itemM41APeripherals         = (new HookedItem()).disableIcon().setDescription("M41A peripherals for use in assembling M41A's.").setMaxStackSize(64);
    public Item               itemM56SG                   = (new ItemFirearm(128, 0.2F, 2, 120, (ItemAmmo) itemAmmoSMG, AliensVsPredator.properties().SOUND_WEAPON_M56SG).disableIcon()).setFull3D();
    public Item               itemM56SGStock              = (new HookedItem()).disableIcon().setDescription("An M56SG stock for use in assembling M56SG's.").setMaxStackSize(64);
    public Item               itemM56SGBarrel             = (new HookedItem()).disableIcon().setDescription("An M56SG barrel for use in assembling M56SG's.").setMaxStackSize(64);
    public Item               itemM56SGAction             = (new HookedItem()).disableIcon().setDescription("An M56SG action for use in assembling M56SG's.").setMaxStackSize(64);
    public Item               itemM56SGSupportFrame       = (new HookedItem()).disableIcon().setDescription("An M56SG support frame for use in assembling M56SG's.").setMaxStackSize(64);
    public Item               itemM56SGAimingModule       = (new HookedItem()).disableIcon().setDescription("An M56SG aiming module for use in assembling M56SG's.").setMaxStackSize(64);
    public Item               itemAK47                    = (new ItemFirearm(32, 0.6F, 3, 110, (ItemAmmo) itemAmmoAR, AliensVsPredator.properties().SOUND_WEAPON_GUNSHOT).disableIcon()).setFull3D();
    public Item               itemAK47Stock               = (new HookedItem()).disableIcon().setDescription("An AK47 stock for use in assembling AK-47's").setMaxStackSize(64);
    public Item               itemAK47Barrel              = (new HookedItem()).disableIcon().setDescription("An AK47 barrel for use in assembling AK-47's.").setMaxStackSize(64);
    public Item               itemAK47Action              = (new HookedItem()).disableIcon().setDescription("An AK47 action for use in assembling AK-47's.").setMaxStackSize(64);
    public Item               itemDoritos                 = (new ItemFood(8, true)).setAlwaysEdible();
    public Item               itemDoritosCoolRanch        = (new ItemFood(8, true)).setAlwaysEdible();
    public Item               itemCapacitor               = (new HookedItem()).setDescription("An electrical component used to store energy temporarily.").setMaxStackSize(64);
    public Item               itemTransistor              = (new HookedItem()).setDescription("A semiconductor used to amplify or switch signals and power.").setMaxStackSize(64);
    public Item               itemRAM                     = (new HookedItem()).setMaxStackSize(64);
    public Item               itemResistor                = (new HookedItem()).setDescription("An electrical component that reduces current flow.").setMaxStackSize(64);
    public Item               itemArtifactTech            = (new HookedItem()).setDescription("An unknown piece of technology acquired from the Yautja species.").setMaxStackSize(64);
    public Item               itemProcessor               = (new HookedItem()).setDescription("CPU");
    public Item               itemSolidStateDrive         = (new HookedItem());
    public Item               itemDiode                   = (new HookedItem()).setDescription("An electrical component that conducts in one direction.").setMaxStackSize(64);
    public Item               itemMotherboard             = (new HookedItem());
    public Item               itemPowerSupply             = (new HookedItem());
    public Item               itemSupplyChute             = new ItemSupplyChute().disableIcon();
    public Item               itemFlashDrive              = (new ItemStorageDevice()).setDescription("Strange Engineer technology, found at snowy elevations.").setMaxStackSize(64);
    public Item               itemVoltageRegulator        = (new HookedItem()).setDescription("An electrical component that maintains a constant voltage level.").setMaxStackSize(64);
    public Item               itemLed                     = (new HookedItem()).setMaxStackSize(64);
    public Item               itemLedDisplay              = (new HookedItem());
    public Item               itemCarbon                  = (new HookedItem()).setDescription("Used in the crafting of several electrical components.").setMaxStackSize(64);
    public Item               itemIntegratedCircuit       = (new HookedItem());
    public Item               itemAPC                     = new ItemAPC().disableIcon();
    public Item               itemSilicon                 = new HookedItem().setDescription("A few chunks of silicon, for use with electronics.");
    public Item               itemIngotAluminum           = new HookedItem().setDescription("An ingot melted down from bauxite ore, for use with guns.");
    public Item               itemIngotCopper             = new HookedItem().setDescription("An ingot melted down from copper ore, for use with electronics.");
    public Item               itemIngotLithium            = ((HookedItem) new ItemIngotLithium()).setDescription("An ingot of lithium. Depletes quickly after processing.");
    public Item               itemMotionTracker           = ((HookedItem) (new HookedItem()).disableIcon()).setDescription("Tracks movement by detecting changes in air density.");
    public Item               itemPolycarbonate           = (new HookedItem()).setDescription("Polycarbonate (A hard plastic used in the crafting of many items/blocks)");
    public Item               itemRoyalJelly              = (new HookedItem()).setDescription("Royal Jelly (A potent, transformative substance produced by a Xenomorph Queen)").setMaxStackSize(64);
    public Item               itemBlackGoo                = (new HookedItem()).setDescription("Black Goo (A0-3959X.91 ? 15)");
    public Item               itemPhial                   = (new HookedItem()).setDescription("A mysterious substance fills this phial");
    public Item               itemPhialEmpty              = (new HookedItem()).setDescription("An empty glass container of unknown origin");
    public Item               itemMaintenanceJack         = (new ItemMaintenanceJack()).setDescription("Used to manually pry open blast doors.");
    public Item               blackGooBucket              = (new ItemBucket(AliensVsPredator.blocks().blockBlackGoo));
    public Item               mistBucket                  = (new ItemBucket(AliensVsPredator.blocks().blockMist));
    public ItemEntitySummoner itemSummonerDrone           = (new ItemEntitySummoner(this.getMod().domain(), EntityDrone.class));
    public ItemEntitySummoner itemSummonerAqua            = (new ItemEntitySummoner(this.getMod().domain(), EntityAqua.class));
    public ItemEntitySummoner itemSummonerWarrior         = (new ItemEntitySummoner(this.getMod().domain(), EntityWarrior.class));
    public ItemEntitySummoner itemSummonerCrusher         = (new ItemEntitySummoner(this.getMod().domain(), EntityCrusher.class));
    public ItemEntitySummoner itemSummonerSpitter         = (new ItemEntitySummoner(this.getMod().domain(), EntitySpitter.class));
    public ItemEntitySummoner itemSummonerPraetorian      = (new ItemEntitySummoner(this.getMod().domain(), EntityPraetorian.class));
    public ItemEntitySummoner itemSummonerQueen           = (new ItemEntitySummoner(this.getMod().domain(), EntityQueen.class));
    public ItemEntitySummoner itemSummonerChestburster    = (new ItemEntitySummoner(this.getMod().domain(), EntityChestburster.class));
    public ItemEntitySummoner itemSummonerFacehugger      = (new ItemEntitySummoner(this.getMod().domain(), EntityFacehugger.class));
    public ItemEntitySummoner itemSummonerMarine          = (new ItemEntitySummoner(this.getMod().domain(), EntityMarine.class));
    public ItemEntitySummoner itemSummonerOvamorph        = (new ItemEntitySummoner(this.getMod().domain(), EntityOvamorph.class));
    public ItemEntitySummoner itemSummonerRoyalFacehugger = (new ItemEntitySummoner(this.getMod().domain(), EntityRoyalFacehugger.class));
    public ItemEntitySummoner itemSummonerYautja          = (new ItemEntitySummoner(this.getMod().domain(), EntityYautja.class));
    public ItemEntitySummoner itemSummonerPredalien       = (new ItemEntitySummoner(this.getMod().domain(), EntityPredalien.class));
    public ItemEntitySummoner itemSummonerCombatSynthetic = (new ItemEntitySummoner(this.getMod().domain(), EntityCombatSynthetic.class));
    public ItemEntitySummoner itemSummonerProtomorph      = (new ItemEntitySummoner(this.getMod().domain(), EntityProtomorph.class));
    public ItemEntitySummoner itemSummonerHammerpede      = (new ItemEntitySummoner(this.getMod().domain(), EntityHammerpede.class));
    public ItemEntitySummoner itemSummonerTrilobite       = (new ItemEntitySummoner(this.getMod().domain(), EntityTrilobite.class));
    public ItemEntitySummoner itemSummonerYautjaBerserker = (new ItemEntitySummoner(this.getMod().domain(), EntityYautjaBerserker.class));
    public ItemEntitySummoner itemSummonerSpaceJockey     = (new ItemEntitySummoner(this.getMod().domain(), EntitySpaceJockey.class));
    public ItemEntitySummoner itemSummonerEngineer        = (new ItemEntitySummoner(this.getMod().domain(), EntityEngineer.class));
    public ItemEntitySummoner itemSummonerDeaconShark     = (new ItemEntitySummoner(this.getMod().domain(), EntityDeaconShark.class));
    public ItemEntitySummoner itemSummonerRunnerDrone     = (new ItemEntitySummoner(this.getMod().domain(), EntityRunnerDrone.class));
    public ItemEntitySummoner itemSummonerRunnerWarrior   = (new ItemEntitySummoner(this.getMod().domain(), EntityRunnerWarrior.class));

	public ItemHandler()
	{
		super(AliensVsPredator.instance());
	}

	public void registerOldMappings()
	{
		AIRI.remappingApi().registerMappingInfo("blackGooBucket", "bucket.blackgoo", AliensVsPredator.ID);
	}

	@Override
	public void initialize(FMLInitializationEvent event)
	{
		this.registerOldMappings();

		registerItem(itemSummonerDrone, "summon.drone");
		registerItem(itemSummonerWarrior, "summon.warrior");
		registerItem(itemSummonerRunnerDrone, "summon.runner.drone");
		registerItem(itemSummonerRunnerWarrior, "summon.runner.warrior");
		registerItem(itemSummonerCrusher, "summon.crusher");
		registerItem(itemSummonerSpitter, "summon.spitter");
		registerItem(itemSummonerPraetorian, "summon.praetorian");
		registerItem(itemSummonerQueen, "summon.queen");
		registerItem(itemSummonerPredalien, "summon.predalien");
		registerItem(itemSummonerProtomorph, "summon.protomorph");
		registerItem(itemSummonerDeaconShark, "summon.deaconshark");
		registerItem(itemSummonerHammerpede, "summon.hammerpede");
		registerItem(itemSummonerTrilobite, "summon.trilobite");
		registerItem(itemSummonerEngineer, "summon.engineer");
		registerItem(itemSummonerSpaceJockey, "summon.spacejockey");
		registerItem(itemSummonerOvamorph, "summon.ovamorph");
		registerItem(itemSummonerFacehugger, "summon.facehugger");
		registerItem(itemSummonerRoyalFacehugger, "summon.royalfacehugger");
		registerItem(itemSummonerChestburster, "summon.chestburster");
		registerItem(itemSummonerYautja, "summon.yautja");
		registerItem(itemSummonerYautjaBerserker, "summon.yautja.berserker");
		registerItem(itemSummonerMarine, "summon.marine");
		registerItem(itemSummonerCombatSynthetic, "summon.synthetic.combat");
		registerItem(itemSummonerAqua, "summon.aqua");
		registerItem(pressureMask, "helm.pressure");
		registerItem(pressureChest, "body.pressure");
		registerItem(pressurePants, "legwear.pressure");
		registerItem(pressureBoots, "boots.pressure");
		registerItem(helmMarine, "helm.tactical");
		registerItem(plateMarine, "body.tactical");
		registerItem(legsMarine, "legwear.tactical");
		registerItem(bootsMarine, "boots.tactical");
		registerItem(helmXeno, "helm.xeno");
		registerItem(plateXeno, "body.xeno");
		registerItem(legsXeno, "legwear.xeno");
		registerItem(bootsXeno, "boots.xeno");
		registerItem(helmTitanium, "helm.celtic");
		registerItem(plateTitanium, "body.celtic");
		registerItem(legsTitanium, "legwear.celtic");
		registerItem(bootsTitanium, "boots.celtic");
		registerItem(itemM240ICU, "gun.m240icu");
		registerItem(itemNostromoFlamethrower, "gun.flamethrower.nostromo");
		registerItem(itemPistol, "gun.pistol");
		registerItem(itemM4, "gun.m4");
		registerItem(itemSniper, "gun.sniper");
		registerItem(itemM41A, "gun.m41a");
		registerItem(itemM56SG, "gun.m56sg");
		registerItem(itemAK47, "gun.ak47");
		registerItem(blackGooBucket, "bucket.blackgoo");
		registerItem(mistBucket, "bucket.mist");
		registerItem(itemAmmoAR, "ammo.ar");
		registerItem(itemAmmoAC, "ammo.ac");
		registerItem(itemAmmoPistol, "ammo.pistol");
		registerItem(itemAmmoSMG, "ammo.smg");
		registerItem(itemAmmoSniper, "ammo.sniper");
		registerItem(itemFuelTank, "ammo.flamethrower");
		registerItem(itemGrenade, "grenade.m40");
		registerItem(itemIncendiaryGrenade, "grenade.incindiary");
		registerItem(itemWristBlade, "wristblade");
		registerItem(itemPlasmaCaster, "plasmacaster");
		registerItem(itemProximityMine, "mine.laser");
		registerItem(itemDisc, "smartdisc");
		registerItem(itemShuriken, "shuriken");
		registerItem(itemSpear, "tool.celtic.spear");
		registerItem(shovelTitanium, "tool.celtic.shovel");
		registerItem(swordTitanium, "tool.celtic.sword");
		registerItem(hoeTitanium, "tool.celtic.hoe");
		registerItem(axeTitanium, "tool.celtic.axe");
		registerItem(pickaxeTitanium, "tool.celtic.pick");
		registerItem(itemArtifactTech, "artifact.tech");
		registerItem(itemDoritos, "food.doritos");
		registerItem(itemDoritosCoolRanch, "food.doritos.coolranch");
		registerItem(itemFlashDrive, "device.nbtdrive");
		registerItem(itemSupplyChute, "device.supplychute");
		registerItem(itemProcessor, "part.processor");
		registerItem(itemSolidStateDrive, "part.solidstatedrive");
		registerItem(itemVoltageRegulator, "part.regulator");
		registerItem(itemCapacitor, "part.capacitor");
		registerItem(itemTransistor, "part.transistor");
		registerItem(itemMotherboard, "part.motherboard");
		registerItem(itemRAM, "part.ram");
		registerItem(itemResistor, "part.resistor");
		registerItem(itemLed, "part.led");
		registerItem(itemDiode, "part.diode");
		registerItem(itemPowerSupply, "part.powersupply");
		registerItem(itemLedDisplay, "part.led.display");
		registerItem(itemPistolStock, "part.pistol.stock");
		registerItem(itemPistolBarrel, "part.pistol.barrel");
		registerItem(itemPistolAction, "part.pistol.action");
		registerItem(itemSniperStock, "part.sniper.stock");
		registerItem(itemSniperBarrel, "part.sniper.barrel");
		registerItem(itemSniperAction, "part.sniper.action");
		registerItem(itemSniperScope, "part.sniper.scope");
		registerItem(itemSniperPeripherals, "part.sniper.peripherals");
		registerItem(itemM41AStock, "part.m41a.stock");
		registerItem(itemM41AAction, "part.m41a.action");
		registerItem(itemM41ABarrel, "part.m41a.barrel");
		registerItem(itemM41APeripherals, "part.m41a.peripherals");
		registerItem(itemM56SGStock, "part.m56sg.stock");
		registerItem(itemM56SGAction, "part.m56sg.action");
		registerItem(itemM56SGBarrel, "part.m56sg.barrel");
		registerItem(itemM56SGSupportFrame, "part.m56sg.supportframe");
		registerItem(itemM56SGAimingModule, "part.m56sg.aimingmodule");
		registerItem(itemM4Stock, "part.m4.stock");
		registerItem(itemM4Action, "part.m4.action");
		registerItem(itemM4Barrel, "part.m4.barrel");
		registerItem(itemAK47Action, "part.ak47.action");
		registerItem(itemAK47Stock, "part.ak47.stock");
		registerItem(itemAK47Barrel, "part.ak47.barrel");
		registerItem(itemIntegratedCircuit, "part.ic");
		registerItem(itemIngotCopper, "ingot.copper");
		registerItem(itemIngotLithium, "ingot.lithium");
		registerItem(itemIngotAluminum, "ingot.aluminum");
		registerItem(itemSilicon, "silicon");
		registerItem(itemCarbon, "carbon");
		registerItem(itemAPC, "apc");
		registerItem(itemMotionTracker, "motiontracker");
		registerItem(itemWristbracerBlades, "wristbracer.blades");
		registerItem(itemPolycarbonate, "polycarbonate");
		registerItem(itemRoyalJelly, "royaljelly");
		registerItem(itemBlackGoo, "blackgoo.item");
		registerItem(itemPhial, "phial.goo");
		registerItem(itemPhialEmpty, "phial.empty");
		registerItem(itemMaintenanceJack, "tool.maintenancejack");
	}
}
