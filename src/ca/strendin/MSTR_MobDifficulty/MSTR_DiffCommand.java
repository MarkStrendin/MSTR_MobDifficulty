package ca.strendin.MSTR_MobDifficulty;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MSTR_DiffCommand implements CommandExecutor {

	public MSTR_DiffCommand(MSTR_MobDifficulty mstr_MobDifficulty) {}

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2,
			String[] arg3) {

		if (sender instanceof Player) {
			Player player = (Player)sender;
			if (MSTR_Permissions.easyModeThree(player)) {
				MSTR_Comms.sendPlayerInfo(player, "Your difficulty modifier: " + ChatColor.AQUA + "Easy mode 3");
			} else if (MSTR_Permissions.easyModeTwo(player)) {
				MSTR_Comms.sendPlayerInfo(player, "Your difficulty modifier: " + ChatColor.DARK_AQUA + "Easy mode 2");
			} else if (MSTR_Permissions.easyModeOne(player)) {				
				MSTR_Comms.sendPlayerInfo(player, "Your difficulty modifier: " + ChatColor.BLUE + "Easy mode 1");
			} else if (MSTR_Permissions.hardModeOne(player)) {
				MSTR_Comms.sendPlayerInfo(player, "Your difficulty modifier: " + ChatColor.YELLOW + "Hard mode 1");
			} else if (MSTR_Permissions.hardModeTwo(player)) {
				MSTR_Comms.sendPlayerInfo(player, "Your difficulty modifier: " + ChatColor.GOLD + "Hard mode 2");
			} else if (MSTR_Permissions.hardModeThree(player)) {						
				MSTR_Comms.sendPlayerInfo(player, "Your difficulty modifier: " + ChatColor.DARK_RED + "Hard mode 3");
			} else {
				MSTR_Comms.sendPlayerInfo(player, "Your difficulty level is not being modified");
			}
		} else {
			MSTR_Comms.logThis("Player only command!");
		}
		
		return true;
	}

}
