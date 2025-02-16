package nodrop;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class nodrop extends  implements Listener {

    public boolean allowDrops = false;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("toggledrops")) { // If the player typed /basic then do the following, note: If you only registered this executor for one command, you don't need this
            if (allowDrops == false) {
                sender.sendMessage(ChatColor.GREEN + "Dropping and picking up items has been enabled!");
                allowDrops = true;
            } else {
                sender.sendMessage(ChatColor.GREEN + "Dropping and picking up items has been disabled!");
                allowDrops = false;
            }
            return true;
        }
        return false;
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent evt) {
        if (!allowDrops) {
            evt.setCancelled(true);
        }
    }

    @EventHandler
    public void onItemPickup(PlayerPickupItemEvent evt) {
        if (!allowDrops) {
            evt.setCancelled(true);
        }
    }
}
