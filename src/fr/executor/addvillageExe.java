package fr.executor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class addvillageExe implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player)sender;
			if(cmd.getName().equalsIgnoreCase("addvillage")) {
				if(args != null && args.length == 3) {
					if(args[0].equalsIgnoreCase("add")) {
						System.out.println(p.getLocation());
					}else if(args[0].equalsIgnoreCase("remove")) {
						
					}
				}else {
					sender.sendMessage("§cMauvasi usage /addvillage add|remove equipe nom-village");
				}
			}
			
		}

		
		return false;
	}

}
