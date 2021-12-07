package nl.republicmc.kingdom.feature;

import de.themoep.inventorygui.InventoryGui;
import nl.republicmc.kingdom.KingdomPlugin;
import org.bukkit.entity.Player;

public abstract class Menu {

    public KingdomPlugin plugin;

    public InventoryGui gui;

    public Menu(KingdomPlugin plugin) {
    }

    public abstract InventoryGui getGui();

    public abstract void show(Player player);
}
