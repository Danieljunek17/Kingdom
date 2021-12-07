package nl.republicmc.kingdom.managers;

import nl.republicmc.kingdom.KingdomPlayer;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PlayerManager {

    private Set<KingdomPlayer> Players = new HashSet<>();

    public void addPlayer(KingdomPlayer player) {
        this.Players.add(player);
    }

    public void removePlayer(KingdomPlayer player) {
        this.Players.remove(player);
    }

    public KingdomPlayer getPlayer(UUID uuid) {
        return Players.stream().filter(player -> player.getId() == uuid).findFirst().get();
    }

    public void getPlayer(Player player) {
        getPlayer(player.getUniqueId());
    }

    public boolean exists(UUID uuid) {
        return Players.stream().anyMatch(player -> player.getId() == uuid);
    }
}
