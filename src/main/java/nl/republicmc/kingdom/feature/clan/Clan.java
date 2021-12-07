package nl.republicmc.kingdom.feature.clan;

import nl.republicmc.kingdom.feature.economy.Vault;

import java.util.List;
import java.util.UUID;

public class Clan {

    private List<UUID> guildMembers;
    private Vault vault;


    public Clan(List<UUID> guildMembers, int currencyAmount) {
        this.guildMembers = guildMembers;
        //TODO: add vault to guilds
    }

    public List<UUID> getGuildMembers() {
        return guildMembers;
    }

    public Vault getVault() {
        return vault;
    }
}
