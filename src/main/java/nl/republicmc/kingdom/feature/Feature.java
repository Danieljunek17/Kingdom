package nl.republicmc.kingdom.feature;

import nl.republicmc.kingdom.KingdomPlugin;

public abstract class Feature {

    private final KingdomPlugin plugin;

    public Feature(KingdomPlugin plugin) {
        this.plugin = plugin;
    }

    public abstract void enable();

    public abstract void disable();
}
