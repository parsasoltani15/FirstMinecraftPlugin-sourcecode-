package Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.Plugin.mainclass;
import net.md_5.bungee.api.ChatColor;

public class PlayerJoinListener implements Listener {
	
	private mainclass plugin = mainclass.getPlugin();
	String msg = color(plugin.getConfig().getString("joinmessage"));
	
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		String lastmsg  = msg.replace("%USERNAME%", event.getPlayer().getName());
		
		event.setJoinMessage(lastmsg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	private String color(String str) {
		
		
		
		return ChatColor.translateAlternateColorCodes('&', str);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
