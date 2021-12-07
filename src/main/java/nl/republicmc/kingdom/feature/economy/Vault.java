package nl.republicmc.kingdom.feature.economy;

import java.util.List;
import java.util.UUID;

public class Vault {

    private int currencyAmount;
    private List<UUID> allowedPlayers;
    private VaultType vaultType;

    public Vault(int currencyAmount, List<UUID> allowedPlayers, VaultType vaultType) {
        this.currencyAmount = currencyAmount;
        this.allowedPlayers = allowedPlayers;
        this.vaultType = vaultType;
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

    public List<UUID> getAllowedPlayers() {
        return allowedPlayers;
    }

    public void addAllowedPlayer(UUID uuid) {
        allowedPlayers.add(uuid);
    }

    public void removeAllowedPlayer(UUID uuid) {
        allowedPlayers.remove(uuid);
    }

    public boolean isAllowedPlayer(UUID uuid) {
        return allowedPlayers.contains(uuid);
    }

    public VaultType getVaultType() {
        return vaultType;
    }
}
