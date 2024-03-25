package fr.menu;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.main.Main;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;

public class villageProvider implements InventoryProvider {

	@Override
	public void init(Player player, InventoryContents contents) {
		for(String village : Main.LoupVillage.keySet()) {	
			  contents.add(ClickableItem.of(getItem(Material.LEAVES, "§cTélméportation à " + village), e -> {
				 
		            if(e.isLeftClick()) {
		            	player.teleport(Main.LoupVillage.get(village));		                
		            }

		        }));
		  }
		for(String village : Main.dragonVillage.keySet()) {	
			  contents.add(ClickableItem.of(getItem(Material.NETHER_BRICK, "§cTélméportation à " + village), e -> {
				 
		            if(e.isLeftClick()) {
		            	player.teleport(Main.dragonVillage.get(village));		                
		            }

		        }));
		  }
		for(String village : Main.poulpeVillage.keySet()) {	
			  contents.add(ClickableItem.of(getItem(Material.PRISMARINE, "§cTélméportation à " + village), e -> {
				 
		            if(e.isLeftClick()) {
		            	player.teleport(Main.poulpeVillage.get(village));		                
		            }

		        }));
		  }
		for(String village : Main.taureauVillage.keySet()) {	
			  contents.add(ClickableItem.of(getItem(Material.HAY_BLOCK, "§cTélméportation à " + village), e -> {
				 
		            if(e.isLeftClick()) {
		            	player.teleport(Main.taureauVillage.get(village));		                
		            }

		        }));
		  }

	}
	
	
	public static int nbLoup = 0;
	@Override
	public void update(Player player, InventoryContents contents) {
		
		  
		  }

		 
		  

	

	
	public ItemStack getItem(Material material,String customName) {
		ItemStack it = new ItemStack(material, 1);
		ItemMeta itM = it.getItemMeta();
		if(customName !=null) itM.setDisplayName(customName);
		it.setItemMeta(itM);
		return it;
		
	}
	
	

}
