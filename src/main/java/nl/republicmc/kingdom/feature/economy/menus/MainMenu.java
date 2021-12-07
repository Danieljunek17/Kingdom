package nl.republicmc.kingdom.feature.economy.menus;

import de.themoep.inventorygui.InventoryGui;
import nl.republicmc.kingdom.KingdomPlugin;
import nl.republicmc.kingdom.feature.Menu;
import nl.republicmc.kingdom.utils.ChatUtil;
import nl.republicmc.kingdom.utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public final class MainMenu extends Menu {

    private final KingdomPlugin plugin;
    private InventoryGui gui;

    private final String[] LAYOUT = {
        "         ",
        " a  a  a ",
        "         ",
    };

    public MainMenu(KingdomPlugin plugin) {
        this.plugin = plugin;
    }

    public InventoryGui getGui() {
        gui = new InventoryGui(plugin, ChatUtil.color("&cCOMMING SOON"), LAYOUT);

        gui.setFiller(ItemUtil.createItem(Material.GRAY_STAINED_GLASS_PANE, 1, true, 0, " "));

        //TODO add all code for clicking in the menu and create the menu (waiting on wouter)

        return gui;
    }

    @Override
    public void show(Player player) {
        getGui().show(player);
    }

}
