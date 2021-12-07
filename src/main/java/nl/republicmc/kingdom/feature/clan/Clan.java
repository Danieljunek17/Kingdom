package nl.republicmc.kingdom.feature.clan;

import nl.republicmc.kingdom.feature.economy.Vault;

import java.util.List;
import java.util.UUID;

public class Clan {

    private List<UUID> clanMembers;
    private Vault vault;


    public Clan(List<UUID> guildMembers, int currencyAmount) {
        this.clanMembers = guildMembers;
        //TODO: add vault to guilds
    }

    public List<UUID> getClanMembers() {
        return clanMembers;
    }

    public Vault getVault() {
        return vault;
    }
}
