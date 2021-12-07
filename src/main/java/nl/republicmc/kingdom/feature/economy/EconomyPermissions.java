package nl.republicmc.kingdom.feature.economy;

import nl.republicmc.kingdom.feature.PermissionBase;

public enum EconomyPermissions implements PermissionBase {
    WITHDRAW("economy.withdraw"),
    DEPOSIT("economy.deposit");

    private final String permission;

    EconomyPermissions(String permission) {
        this.permission = permission;
    }

    @Override
    public String getPermission() {
        return permission;
    }
}
