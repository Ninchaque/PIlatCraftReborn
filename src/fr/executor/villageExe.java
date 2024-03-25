package fr.executor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.main.Main;
import fr.menu.MenuVillage;

public class villageExe implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			if(cmd.getName().equals("village")) {
				Main.instance.loadVillageConfig();
				MenuVillage.MenuVillage.open((Player)sender);
				return true;
			}
	
		}

		return false;
	}

}
