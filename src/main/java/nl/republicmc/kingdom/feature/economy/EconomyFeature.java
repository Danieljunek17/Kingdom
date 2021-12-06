package nl.republicmc.kingdom.feature.economy;

import nl.republicmc.kingdom.KingdomPlugin;
import nl.republicmc.kingdom.feature.Feature;
import org.bukkit.command.*;
import org.bukkit.plugin.SimplePluginManager;

import java.lang.reflect.Field;
import java.util.List;

public final class EconomyFeature extends Feature<EconomyManager> implements CommandExecutor, TabCompleter {

    private final PluginCommand economyCommand;

    public EconomyFeature(KingdomPlugin plugin, EconomyManager manager) {
        super(plugin, manager);

        this.economyCommand = plugin.getCommand("economy");
    }

    @Override
    public void enable() {
        manager.enable();

        economyCommand.setExecutor(this);
        economyCommand.setTabCompleter(this);
    }

    @Override
    public void disable() {
        manager.disable();

        try {
            SimplePluginManager spm = (SimplePluginManager) plugin.getServer().getPluginManager();

            Field commandMapField = spm.getClass().getDeclaredField("commandMap");
            boolean accessible = commandMapField.isAccessible();
            commandMapField.setAccessible(true);

            SimpleCommandMap commandMap = (SimpleCommandMap) commandMapField.get(spm);

            economyCommand.unregister(commandMap);
            commandMapField.setAccessible(accessible);
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Cannot unregister commands", e);
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }
}
