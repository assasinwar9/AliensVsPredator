package org.avp.entities.living;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.avp.AliensVsPredator;
import org.avp.EntityItemDrops;
import org.avp.client.Sounds;
import org.avp.entities.EntityBullet;
import org.avp.entities.EntityLiquidPool;
import org.avp.world.MarineTypes;

import com.google.common.base.Predicate;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityMarine extends EntityCreature implements IMob, IRangedAttackMob, Predicate<EntityLivingBase>
{
    private DataParameter<Boolean> FIRING = EntityDataManager.createKey(EntityMarine.class, DataSerializers.BOOLEAN);
    private DataParameter<Integer> TYPE   = EntityDataManager.createKey(EntityMarine.class, DataSerializers.VARINT);
    private EntityAIBase           rangedAttackAI;
    private long                   lastShotFired;

    public EntityMarine(World world)
    {
        super(world);
        this.rangedAttackAI = new EntityAIAttackRanged(this, 0.4D, (int) getMarineType().getFirearmItem().getProfile().getShotsPerTick(), 24);
        this.experienceValue = 5;
        this.tasks.addTask(1, this.rangedAttackAI);
        this.tasks.addTask(2, new EntityAIWander(this, this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
        this.tasks.addTask(3, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.getDataManager().register(FIRING, false);
        this.getDataManager().register(TYPE, new Random(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).nextInt(MarineTypes.values().length));
    }

    @Override
    public boolean apply(EntityLivingBase entity)
    {
        if (entity instanceof EntitySpeciesAlien)
            return true;

        if (entity instanceof EntityMob)
            return true;

        if (entity instanceof EntityYautja)
            return true;

        if (entity instanceof EntityGolem)
            return true;

        if (entity instanceof EntityXenomorph)
            return true;

        if (entity instanceof EntityLiquidPool)
            return false;

        if (entity instanceof EntityPlayer)
            return false;

        if (entity instanceof EntityMarine)
            return false;

        if (entity instanceof EntityCombatSynthetic)
            return false;

        return false;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6499999761581421D);
    }

    @Override
    public float getBlockPathWeight(BlockPos pos)
    {
        return 0.5F - this.worldObj.getLightBrightness(pos);
    }

    @Override
    public int getTotalArmorValue()
    {
        return 10;
    }

    @Override
    protected SoundEvent getHurtSound()
    {
        return Sounds.SOUND_MARINE_HURT.event();
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return Sounds.SOUND_MARINE_DEATH.event();
    }

    @Override
    public ItemStack getHeldItemMainhand()
    {
        return new ItemStack(AliensVsPredator.items().itemM41A);
    }

    @Override
    protected void updateAITasks()
    {
        super.updateAITasks();
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();

        if (!this.worldObj.isRemote)
        {
            this.getDataManager().set(FIRING, !(System.currentTimeMillis() - getLastShotFired() >= 1000 * 3));
        }
    }

    @Override
    public void onDeath(DamageSource source)
    {
        super.onDeath(source);
        EntityItemDrops.AMMUNITION.tryDrop(this);
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase targetEntity, float damage)
    {
        if (this.getAttackTarget() != null)
        {
            this.lastShotFired = System.currentTimeMillis();
            EntityBullet entityBullet = new EntityBullet(this.worldObj, this, targetEntity, 10F, 0.0000001F);
            this.worldObj.spawnEntityInWorld(entityBullet);
            this.playSound(getMarineType().getGunfireSound(), 0.7F, 1F);
            this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + this.getEyeHeight(), this.posZ, 1, 1, 1);
        }
    }
    
    public MarineTypes getMarineType()
    {
        return MarineTypes.getTypeForId(this.getDataManager().get(TYPE));
    }

    public boolean isFiring()
    {
        return this.getDataManager().get(FIRING);
    }

    public long getLastShotFired()
    {
        return this.lastShotFired;
    }
}
