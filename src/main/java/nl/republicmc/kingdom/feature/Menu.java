package nl.republicmc.kingdom.feature;

import de.themoep.inventorygui.InventoryGui;
import org.bukkit.entity.Player;

public abstract class Menu {

    public abstract void show(Player player);

    public abstract InventoryGui getGui();

}
