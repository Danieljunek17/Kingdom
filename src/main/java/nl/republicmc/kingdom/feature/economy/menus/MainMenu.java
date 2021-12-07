package nl.republicmc.kingdom.feature.economy.menus;

import de.themoep.inventorygui.InventoryGui;
import nl.republicmc.kingdom.KingdomPlugin;
import nl.republicmc.kingdom.utils.ChatUtil;
import nl.republicmc.kingdom.utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class MainMenu {

    private final KingdomPlugin plugin;
    InventoryGui gui;

    private final String[] LAYOUT = {
        "         ",
        " a  a  a ",
        "         ",
    };

    public MainMenu(KingdomPlugin plugin) {
        this.plugin = plugin;
    }

    public InventoryGui MainMenu() {
        gui = new InventoryGui(plugin, ChatUtil.color("&cCOMMING SOON"), LAYOUT);

        gui.setFiller(ItemUtil.createItem(Material.GRAY_STAINED_GLASS_PANE, 1, true, 0, " "));

        //TODO add all code for clicking in the menu and create the menu (waiting on wouter)

        return gui;
    }

    public void show(Player player) {
        this.gui.show(player);
    }
}
