package nl.republicmc.kingdom.feature.economy;

import nl.republicmc.kingdom.KingdomPlayer;
import nl.republicmc.kingdom.KingdomPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EconomyListener implements Listener {

    private final KingdomPlugin plugin;

    public EconomyListener(KingdomPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        plugin.getPlayerManager().addPlayer(new KingdomPlayer (player.getUniqueId(), player.getName(), null, null));
    }

}
