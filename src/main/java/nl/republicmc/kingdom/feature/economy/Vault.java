package nl.republicmc.kingdom.feature.economy;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Vault {

    private int currencyAmount;
    private Map<UUID, EconomyPermissions> allowedPlayers;

    public Vault(int currencyAmount, Map<UUID, EconomyPermissions> allowedPlayers) {
        this.currencyAmount = currencyAmount;
        this.allowedPlayers = allowedPlayers;
    }

    public int getCurrencyAmount() {
        return currencyAmount;
    }

    public void withdrawCurrency(int amount) {
        currencyAmount = currencyAmount - amount;
    }

    public void depositCurrency(int amount) {
        currencyAmount = currencyAmount + amount;
    }

    public Map<UUID, EconomyPermissions> getAllowedPlayers() {
        return allowedPlayers;
    }

    public void addAllowedPlayer(UUID uuid, EconomyPermissions economyPermissions) {
        allowedPlayers.put(uuid, economyPermissions);
    }

    public void removeAllowedPlayer(UUID uuid) {
        allowedPlayers.remove(uuid);
    }

    public boolean isAllowedPlayer(UUID uuid, EconomyPermissions permission) {
        return allowedPlayers.get(uuid).equals(permission);
    }
}
