package nl.republicmc.kingdom.feature;

import nl.republicmc.kingdom.KingdomPlugin;
import org.bukkit.command.*;
import org.bukkit.plugin.SimplePluginManager;

import java.lang.reflect.Field;
import java.util.List;

public final class GuildSystemFeature extends Feature implements CommandExecutor, TabCompleter {

    private final PluginCommand guildCommand;

    public GuildSystemFeature(KingdomPlugin plugin) {
        super(plugin);

        this.guildCommand = plugin.getCommand("guild");
    }

    @Override
    public void enable() {
        guildCommand.setExecutor(this);
        guildCommand.setTabCompleter(this);
    }

    @Override
    public void disable() {
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
