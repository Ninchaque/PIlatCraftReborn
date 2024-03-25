package fr.executor;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.main.Main;

public class addvillageExe implements CommandExecutor {

	private List<String> loupListeTemp = new ArrayList<>();
	private List<String> taureauxListeTemp = new ArrayList<>();
	private List<String> poulpeListeTemp = new ArrayList<>();
	private List<String> dragonListeTemp = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player)sender;
			if(cmd.getName().equalsIgnoreCase("addvillage")) {
				if(args != null && args.length == 3) {
					if(args[0].equalsIgnoreCase("add")) {
						if(args[1].equalsIgnoreCase("loup")) {
							loupListeTemp.add(args[2] + ":" + p.getLocation().toString());
							Main.instance.config.set("loup", loupListeTemp);
							Main.instance.saveConfig();
						}
						else if(args[1].equalsIgnoreCase("dragon")){
							dragonListeTemp.add(args[2] + ":" + p.getLocation().toString());
							Main.instance.config.set("dragon", dragonListeTemp);
							Main.instance.saveConfig();
						}
						else if(args[1].equalsIgnoreCase("taureau")){
							taureauxListeTemp.add(args[2] + ":" + p.getLocation().toString());
							Main.instance.config.set("taureau", taureauxListeTemp);
							Main.instance.saveConfig();
						}
						else if(args[1].equalsIgnoreCase("poulpe")){
							poulpeListeTemp.add(args[2] + ":" + p.getLocation().toString());
							Main.instance.config.set("poulpe", poulpeListeTemp);
							Main.instance.saveConfig();
						}
						
						
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
