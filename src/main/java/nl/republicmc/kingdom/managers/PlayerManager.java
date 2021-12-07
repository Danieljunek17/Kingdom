package nl.republicmc.kingdom.managers;

import nl.republicmc.kingdom.KingdomPlayer;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PlayerManager {

    private Set<KingdomPlayer> kdPlayers = new HashSet<>();

    public void addKDPlayer(KingdomPlayer kdPlayer) {
        this.kdPlayers.add(kdPlayer);
    }

    public void removeKDPlayer(KingdomPlayer kdPlayer) {
        this.kdPlayers.remove(kdPlayer);
    }

    public KingdomPlayer getKDPlayer(UUID uuid) {
        if(kdPlayers.stream().noneMatch(kdPlayer -> kdPlayer.getId() == uuid)) return null;
        return kdPlayers.stream().filter(kdPlayer -> kdPlayer.getId() == uuid).findFirst().get();
    }

    public void getKDPlayer(Player player) {
        getKDPlayer(player.getUniqueId());
    }

    public boolean exists(UUID uuid) {
        return kdPlayers.stream().anyMatch(kdPlayer -> kdPlayer.getId() == uuid);
    }
}
