package Listeners;


import java.util.HashMap;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.Plugin.mainclass;
import net.md_5.bungee.api.ChatColor;

public class BlockBreackerListener implements Listener { 
	
	
	
	public HashMap<Player, Integer> database = new HashMap<>();
	
	private mainclass Plugin = mainclass.getPlugin();
	
	
	
	
	
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
	
		if (database.containsKey(event.getPlayer())) {
			
			int tedadblockkande = database.get(event.getPlayer());
			
			int configcount = Plugin.getConfig().getInt("blockcount");
			
			
			if (tedadblockkande == configcount) {
				
				event.getPlayer().sendMessage(ChatColor.GREEN + "you mined 5 more blocks");
				database.put(event.getPlayer(), 0);
				
				
				
			} else {
				
				database.put(event.getPlayer(), tedadblockkande + 1);
				
				
				
				
			}
			
			
		} else {
			//for the first time
			database.put(event.getPlayer(), 1);
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	}

}
