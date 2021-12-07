package nl.republicmc.kingdom.feature.clan;

import nl.republicmc.kingdom.KingdomPlugin;
import nl.republicmc.kingdom.feature.Feature;
import org.bukkit.command.*;
import org.bukkit.plugin.SimplePluginManager;

import java.lang.reflect.Field;
import java.util.List;

public final class ClanFeature extends Feature<ClanManager> implements CommandExecutor, TabCompleter {

    private final PluginCommand guildCommand;

    public ClanFeature(KingdomPlugin plugin, ClanManager manager) {
        super(plugin, manager);

        this.guildCommand = plugin.getCommand("clan");
    }

    @Override
    public void enable() {
        manager.enable();

        guildCommand.setExecutor(this);
        guildCommand.setTabCompleter(this);
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

            guildCommand.unregister(commandMap);
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
