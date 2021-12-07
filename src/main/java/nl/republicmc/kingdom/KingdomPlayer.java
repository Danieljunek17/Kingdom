package nl.republicmc.kingdom;

import nl.republicmc.kingdom.feature.PermissionBase;
import nl.republicmc.kingdom.feature.clan.Clan;
import nl.republicmc.kingdom.feature.economy.Vault;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Objects;
import java.util.UUID;

public final class KingdomPlayer {

    private final UUID id;
    private final String name;
    private Clan clan;
    private Vault vault;

    public KingdomPlayer(UUID id, String name, Clan clan, Vault vault) {
        this.id = id;
        this.name = name;
        this.clan = clan;
        this.vault = vault;
    }

    public KingdomPlayer(Player player) {
        this(player.getUniqueId(), player.getName(), null, null);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public <P extends Enum<?> & PermissionBase> boolean hasPermission(P permission) {
        return Objects.requireNonNull(Bukkit.getPlayer(id)).hasPermission(permission.getPermission());
    }
}
