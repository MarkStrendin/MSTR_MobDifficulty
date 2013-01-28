package ca.strendin.MSTR_MobDifficulty;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class MSTR_MobDifficulty extends JavaPlugin {

	@Override
	public void onDisable() {
        MSTR_Comms.logThis(this.getDescription().getName() + " disabled");  
	}

	@Override
	public void onEnable() {
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new MSTR_PlayerListener(this), this);
		

        getCommand("diff").setExecutor(new MSTR_DiffCommand(this));
		
        MSTR_Comms.logThis(this.getDescription().getName() + " enabled"); 		
	}

}
