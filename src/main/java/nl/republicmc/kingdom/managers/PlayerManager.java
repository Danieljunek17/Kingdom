package nl.republicmc.kingdom.managers;

import nl.republicmc.kingdom.KingdomPlayer;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PlayerManager {

    private Set<KingdomPlayer> kdPlayers = new HashSet<>();

    public void addKDPlayer(KingdomPlayer kdPlayer) {
        this.kdPlayers.add(kdPlayer);
    }

    public boolean excists(UUID uuid) {
        return kdPlayers.stream().anyMatch(player -> player.getId() == uuid);
    }
}
