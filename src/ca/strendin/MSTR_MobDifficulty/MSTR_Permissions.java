package ca.strendin.MSTR_MobDifficulty;

import org.bukkit.entity.Player;


public class MSTR_Permissions {
        
    private static boolean hasPermission(Player thisplayer, String permName) {
        return thisplayer.hasPermission(permName);
    }
    
    public static boolean hardModeOne(Player player) {
        return hasPermission(player,"mstr_mobdifficulty.hardmode.one");         
    }
    
    public static boolean hardModeTwo(Player player) {
        return hasPermission(player,"mstr_mobdifficulty.hardmode.two");         
    }
    
    public static boolean hardModeThree(Player player) {
        return hasPermission(player,"mstr_mobdifficulty.hardmode.three");         
    }
    
    public static boolean easyModeOne(Player player) {
        return hasPermission(player,"mstr_mobdifficulty.easymode.one");         
    }
    
    public static boolean easyModeTwo(Player player) {
        return hasPermission(player,"mstr_mobdifficulty.easymode.two");         
    }
    
    public static boolean easyModeThree(Player player) {
        return hasPermission(player,"mstr_mobdifficulty.easymode.three");         
    }
    
    public static boolean isDebugUser(Player player) {
        return hasPermission(player,"mstr_mobdifficulty.debug");         
    }
    
}
