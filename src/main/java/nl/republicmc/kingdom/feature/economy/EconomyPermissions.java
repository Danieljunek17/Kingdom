package nl.republicmc.kingdom.feature.economy;

import nl.republicmc.kingdom.KingdomPlugin;

public enum EconomyPermissions {
    WITHDRAW("economy.withdraw"),
    DEPOSIT("economy.deposit");

    private final String permission;

    EconomyPermissions(String permission) {
        this.permission = permission;
    }
}
