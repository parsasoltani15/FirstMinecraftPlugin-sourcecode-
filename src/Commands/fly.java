package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.md_5.bungee.api.ChatColor;

public class fly implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender Sender, Command arg1, String arg2, String[] args) {
		
		
		// TODO Auto-generated method stub
		
		if (args.length == 1) {
			
			String esm = args[0];
			
			
			Player thatPlayer = Bukkit.getPlayer(esm);
			
			if (thatPlayer != null) {
				
				
				boolean isFlying = thatPlayer.isFlying();
				if (thatPlayer.hasPermission("Plugin.fly")) {
					
					
					
					if (!isFlying) {
						//set fly true
						thatPlayer.setAllowFlight(true);
						thatPlayer.setFlying(true);
						thatPlayer.sendMessage(ChatColor.GREEN + "you can now fly");
						
					} else {
						//set fly false
						thatPlayer.setAllowFlight(false);
						thatPlayer.setFlying(false);
						thatPlayer.sendMessage(ChatColor.RED + "you no longer can fly");
						
						
						
						
					}
					
					
					

			
				} else {
					//no permission
					thatPlayer.sendMessage(ChatColor.BLACK + "you don't have permission");
				}
				
				
				
				
				
				
			} else {
				Sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4this player is offline"));
			}
			
			
			
			
			
			
			
		} else {
			
			if (Sender instanceof Player) {
				Player player = (Player) Sender;
				
				boolean isFlying = player.isFlying();
				if (player.hasPermission("Plugin.fly")) {
					
					
					
					if (!isFlying) {
						//set fly true
						player.setAllowFlight(true);
						player.setFlying(true);
						player.sendMessage(ChatColor.GREEN + "you can now fly");
						
					} else {
						//set fly false
						player.setAllowFlight(false);
						player.setFlying(false);
						player.sendMessage(ChatColor.RED + "you no longer can fly");
						
						
						
						
					}
					
					
					

			
				} else {
					//no permission
					player.sendMessage(ChatColor.BLACK + "you don't have permission");
				}
				

				
				
				
			} else {
				Sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cyou have to choose player /fly [player]"));
				
				
				
			}
			
		
		
		
		
		
		
		
		} 
		
		
		
		
		
		
	
	return false;
	}
}
			

		
		
		
		
		
		
	
	
	
	
	
	
	


