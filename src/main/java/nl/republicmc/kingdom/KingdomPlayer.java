package nl.republicmc.kingdom;

import org.bukkit.entity.Player;

import java.util.UUID;

public final class KingdomPlayer {

    private final UUID id;
    private final String name;

    public KingdomPlayer(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public KingdomPlayer(Player player) {
        this(player.getUniqueId(), player.getName());
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
