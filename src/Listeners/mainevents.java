package Listeners;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerRespawnEvent;




public class mainevents implements Listener {
		@EventHandler
		public void onEvent(PlayerRespawnEvent event) {
			
			Player player = (Player) event.getPlayer(); 
			player.sendMessage(ChatColor.GREEN + "you respawned");
		
			
		}
			
		
		
		
		
		
	

		@EventHandler
		public void onEvent(PlayerBedEnterEvent event) {
			Player player = (Player) event.getPlayer();
			player.sendMessage(ChatColor.YELLOW + "good night");
			
			
			
			
			
			}
		
		








}


			

		
			
			



