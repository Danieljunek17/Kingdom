package nl.republicmc.kingdom.feature.guild;

import nl.republicmc.kingdom.feature.economy.EconomyPermissions;
import nl.republicmc.kingdom.feature.economy.Vault;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Guild {

    private List<UUID> guildMembers;
    private Vault vault;


    public Guild(List<UUID> guildMembers, int currencyAmount) {
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
