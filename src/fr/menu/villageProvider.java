package fr.menu;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;

public class villageProvider implements InventoryProvider {

	@Override
	public void init(Player arg0, InventoryContents arg1) {
		// 

	}

	@Override
	public void update(Player player, InventoryContents contents) {
		  contents.set(1, 0, ClickableItem.empty(getItem(Material.PORK, "§eConfig des drops des cochons V")));
		  contents.set(1, 1, ClickableItem.empty(getItem(Material.LEATHER, "§eConfig des drops des vaches V")));
		  contents.set(1, 2, ClickableItem.empty(getItem(Material.WOOL, "§eConfig des drops des moutons V")));
		  contents.set(1, 3, ClickableItem.empty(getItem(Material.SADDLE, "§eConfig des drops des chevaux V")));
		  contents.set(1, 5, ClickableItem.empty(getItem(Material.FEATHER, "§eConfig des drops des poules V ")));
		  contents.set(1, 4, ClickableItem.empty(getItem(Material.RABBIT_FOOT, "§e<-- Config des drops des lapins V ")));
		  contents.fillRect(1, 6, 5, 6,  ClickableItem.empty(new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15)));
		  contents.fillColumn(6, ClickableItem.empty(new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15)));
		  contents.fillRect(0, 0, 0, 8, ClickableItem.empty(new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15)));
		  contents.fillRect(4, 0, 4, 5, ClickableItem.empty(new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15)));
		  contents.set(4, 8, ClickableItem.empty(getItem(Material.IRON_ORE, "§e<-- Config CutClean pour le fer")));
		  contents.set(5, 8, ClickableItem.empty(getItem(Material.GOLD_ORE, "§e<-- Config CutClean pour l'or")));
		  contents.set(3, 8, ClickableItem.empty(getItem(Material.COAL_ORE, "§e<-- Config CutClean pour le charbon")));
		  contents.set(1, 8, ClickableItem.empty(getItem(Material.SAND, "§e<-- Config CutClean pour le sable")));
		  contents.set(2, 8, ClickableItem.empty(getItem(Material.GRAVEL, "§e<-- Config CutClean pour le gravier")));
		  contents.set(5, 0, ClickableItem.empty(new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15 )));

		 
		  

	}

	
	public ItemStack getItem(Material material,String customName) {
		ItemStack it = new ItemStack(material, 1);
		ItemMeta itM = it.getItemMeta();
		if(customName !=null) itM.setDisplayName(customName);
		it.setItemMeta(itM);
		return it;
		
	}
	
	

}
