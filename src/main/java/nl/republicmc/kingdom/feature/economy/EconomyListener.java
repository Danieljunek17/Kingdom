package nl.republicmc.kingdom.feature.economy;

import nl.republicmc.kingdom.KingdomPlayer;
import nl.republicmc.kingdom.managers.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EconomyListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        PlayerManager kdPlayer = new PlayerManager(new KingdomPlayer (player.getUniqueId(), player.getName(), null, null));
    }

}
