package fr.main;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

import fr.executor.addvillageExe;
import fr.executor.villageExe;

public class Main extends JavaPlugin{

	public static Main instance;

	public HashMap<String, Location> LoupVillage = new HashMap<>();
	public HashMap<String, Location> dragonVillage = new HashMap<>();
	public HashMap<String, Location> poulpeVillage = new HashMap<>();
	public HashMap<String, Location> taurauxVillage = new HashMap<>();

	public void onEnable(){

		System.out.println("§c----------------§aLancement du MicroPlugin par Ninchaque !§c----------------");
		getCommand("village").setExecutor (new villageExe());
		//	getServer().getPluginManager().registerEvents(new menuExe(), this);
		getCommand("addvillage").setExecutor (new addvillageExe());




		loadConfig();
	
		
				




			
		}
		

	

	public void onDisable(){

		System.out.println("§c----------------§aSuspension du MicroPlugin par Ninchaque !§c----------------");


	}
	
	
	public void loadConfig() {
		saveDefaultConfig();
		ConfigurationSection sectionLoup = getConfig().getConfigurationSection("loup");
		for(String village : getConfig().getStringList("loup")) {
			System.out.println(village);
			
			
				
				
		
		}
		
		
	}
	

}
