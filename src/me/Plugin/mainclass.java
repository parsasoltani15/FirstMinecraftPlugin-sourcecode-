package me.Plugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import Commands.fly;
import Listeners.BlockBreackerListener;
import Listeners.PlayerJoinListener;
import Listeners.mainevents;

public class mainclass extends JavaPlugin {
	
	public static mainclass Plugin;
	public static mainclass getPlugin() {
		return Plugin;
	}
	
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		Plugin = this;
		
		getServer().getPluginManager().registerEvents(new mainevents(),this);
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "Plugin is running");
		getServer().getPluginCommand("fly").setExecutor(new fly());
		getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
		getServer().getPluginManager().registerEvents(new BlockBreackerListener(), this);
		
	
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "plugin is disabling");
		
		
	} 


}
