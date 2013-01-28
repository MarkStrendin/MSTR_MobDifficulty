package ca.strendin.MSTR_MobDifficulty;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MSTR_PlayerListener implements Listener {

	public MSTR_PlayerListener(MSTR_MobDifficulty mstr_MobDifficulty) {}
	
	
	private int convertSecondsToTicks(int seconds) {
		return seconds * 20;
	}
	
	
	@EventHandler        
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
		if (event.getEntity() instanceof Player) {	
			Player player = (Player)event.getEntity();		
			
			
			
			if (!player.isBlocking()) {
				if (MSTR_Permissions.easyModeThree(player)) {
					event.setDamage((int)Math.round(event.getDamage() * 0.25));				
				} else if (MSTR_Permissions.easyModeTwo(player)) {
					event.setDamage((int)Math.round(event.getDamage() * 0.50));				
				} else if (MSTR_Permissions.easyModeOne(player)) {
					event.setDamage((int)Math.round(event.getDamage() * 0.75));				
				} else if (MSTR_Permissions.hardModeOne(player)) {			
					if (event.getDamager().getType() == EntityType.ZOMBIE) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, convertSecondsToTicks(10), 3));
					} else if (event.getDamager().getType() == EntityType.CAVE_SPIDER) {
					} else if (event.getDamager().getType() == EntityType.BLAZE) {
					} else if (event.getDamager().getType() == EntityType.ENDERMAN) {
					} else if (event.getDamager().getType() == EntityType.MAGMA_CUBE) {
					} else if (event.getDamager().getType() == EntityType.SLIME) {						
					} else if (event.getDamager().getType() == EntityType.CREEPER) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, convertSecondsToTicks(2), 4));
					} else if (event.getDamager().getType() == EntityType.SPIDER) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, convertSecondsToTicks(3), 0));
					}						
				} else if (MSTR_Permissions.hardModeTwo(player)) {
					if (event.getDamager().getType() == EntityType.ZOMBIE) {
						event.setDamage((int)Math.round(event.getDamage() * 1.50));
						player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, convertSecondsToTicks(15), 4));
					} else if (event.getDamager().getType() == EntityType.CAVE_SPIDER) {
					} else if (event.getDamager().getType() == EntityType.BLAZE) {
					} else if (event.getDamager().getType() == EntityType.ENDERMAN) {
					} else if (event.getDamager().getType() == EntityType.MAGMA_CUBE) {
					} else if (event.getDamager().getType() == EntityType.SLIME) {						
					} else if (event.getDamager().getType() == EntityType.CREEPER) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, convertSecondsToTicks(4), 4));
					} else if (event.getDamager().getType() == EntityType.SPIDER) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, convertSecondsToTicks(7), 0));
					}
									
				} else if (MSTR_Permissions.hardModeThree(player)) {
					if (event.getDamager().getType() == EntityType.ZOMBIE) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, convertSecondsToTicks(25), 5));
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, convertSecondsToTicks(5), 1));
					} else if (event.getDamager().getType() == EntityType.CAVE_SPIDER) {
					} else if (event.getDamager().getType() == EntityType.BLAZE) {
					} else if (event.getDamager().getType() == EntityType.ENDERMAN) {
					} else if (event.getDamager().getType() == EntityType.MAGMA_CUBE) {
					} else if (event.getDamager().getType() == EntityType.SLIME) {						
					} else if (event.getDamager().getType() == EntityType.CREEPER) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, convertSecondsToTicks(6), 4));						
					} else if (event.getDamager().getType() == EntityType.SPIDER) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, convertSecondsToTicks(15), 0));
					}
											
				}
			}
				
			
		}
	}
}
