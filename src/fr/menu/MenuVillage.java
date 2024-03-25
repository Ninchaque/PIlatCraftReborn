package fr.menu;

import org.bukkit.ChatColor;
import org.bukkit.event.inventory.InventoryType;

import fr.minuskube.inv.SmartInventory;

public class MenuVillage {
	
	
	
	 public static final SmartInventory MenuVillage = SmartInventory.builder()
				.id("Inventario")
				.provider(new villageProvider())
				.size(6, 9)
				.type(InventoryType.CHEST)
				.closeable(true)
				.title(ChatColor.BLUE + "Téléportation des Villages")
				.build();

}
