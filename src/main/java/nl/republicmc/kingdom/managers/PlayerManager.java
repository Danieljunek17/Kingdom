package nl.republicmc.kingdom.managers;

import nl.republicmc.kingdom.feature.economy.managers.EconomyManager;

import java.util.UUID;

public class PlayerManager {

    private UUID uuid;
    private String name;
    private EconomyManager playerEco;

    PlayerManager(UUID uuid, String name, EconomyManager playerEco) {
        this.uuid = uuid;
        this.name = name;
        this.playerEco = playerEco;
    }
}
