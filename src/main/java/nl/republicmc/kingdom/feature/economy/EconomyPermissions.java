package nl.republicmc.kingdom.feature.economy;

public enum EconomyPermissions {
    WITHDRAW("economy.withdraw"),
    DEPOSIT("economy.deposit");

    private final String permission;

    EconomyPermissions(String permission) {
        this.permission = permission;
    }
}
