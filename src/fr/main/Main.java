package fr.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import fr.executor.addvillageExe;
import fr.executor.villageExe;

public class Main extends JavaPlugin{

	
    public FileConfiguration config;
    private File configFile;
	
	public static  Main instance;

	public static HashMap<String, Location> LoupVillage = new HashMap<>();
	public static HashMap<String, Location> dragonVillage = new HashMap<>();
	public static HashMap<String, Location> poulpeVillage = new HashMap<>();
	public static HashMap<String, Location> taureauVillage = new HashMap<>();
	

	
	public void onEnable(){

		System.out.println("§c----------------§aLancement du MicroPlugin par Ninchaque !§c----------------");
		getCommand("village").setExecutor (new villageExe());
		//	getServer().getPluginManager().registerEvents(new menuExe(), this);
		getCommand("addvillage").setExecutor (new addvillageExe());



		 loadConfig();
		loadVillageConfig();
	
		
				
		instance = this;

		

        

		 saveConfig();
			
		}
		

	

	public void onDisable(){

		System.out.println("§c----------------§aSuspension du MicroPlugin par Ninchaque !§c----------------");


	}
	
	
	public void loadVillageConfig() {
		saveDefaultConfig();
		for(String village : getConfig().getStringList("loup")) {
			String[] parsed = village.split(":");		
			String villageNom = parsed[0];
			
			System.out.println(village);
			System.out.println( village.split(":"));
			System.out.println( village.split(":")[0]);
			System.out.println( village.split(":")[1]);
			
			String[] locparsed = parsed[1].split(",");				
			LoupVillage.put(villageNom, creatLocation(locparsed));
		
		}
		for(String village : getConfig().getStringList("poulpe")) {
			String[] parsed = village.split(":");		
			String villageNom = parsed[0];					
			String[] locparsed = parsed[1].split(",");				
			poulpeVillage.put(villageNom, creatLocation(locparsed));
		
		}

		for(String village : getConfig().getStringList("dragon")) {
			String[] parsed = village.split(":");		
			String villageNom = parsed[0];					
			String[] locparsed = parsed[1].split(",");				
			dragonVillage.put(villageNom, creatLocation(locparsed));
		
		}
		for(String village : getConfig().getStringList("taureau")) {
			String[] parsed = village.split(":");		
			String villageNom = parsed[0];					
			String[] locparsed = parsed[1].split(",");				
			taureauVillage.put(villageNom, creatLocation(locparsed));
		
		}
		
		
	}
	
	private Location creatLocation(String[] location) {
		Location villageLoc = new Location(null, 0, 0, 0);
		System.out.println(location[0]);
		System.out.println(location[0].split("{")[2]);
		
		
		villageLoc.setWorld(Bukkit.getServer().getWorld(location[0].split("}")[2].split("=")[1]));
		villageLoc.setX(Double.valueOf(location[1].split("=")[1]));
		villageLoc.setY(Double.valueOf(location[2].split("=")[1]));
		villageLoc.setZ(Double.valueOf(location[3].split("=")[1]));
			villageLoc.setPitch(Float.valueOf(location[4].split("=")[1]));
			villageLoc.setPitch(Float.valueOf(location[5].split("=")[1].split("}")[0]));
		return villageLoc; 
	}
	
	private void loadConfig() {
        configFile = new File(getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            configFile.getParentFile().mkdirs();
            saveResource("config.yml", false);
        }


        config = getConfig();
    }
	private void saveConfiguration() {
  
        try {
            config.save(configFile);
        } catch (IOException e) {
            getLogger().warning("Impossible de sauvegarder la configuration dans " + configFile.getName());
        }
    }
	
	
	public Main getInstance() {
		return instance;
	}

}
