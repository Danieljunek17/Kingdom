package nl.republicmc.kingdom.feature;

import nl.republicmc.kingdom.KingdomPlugin;

public abstract class Feature<M extends Manager> {

    protected final KingdomPlugin plugin;
    protected final M manager;

    public Feature(KingdomPlugin plugin, M manager) {
        this.plugin = plugin;
        this.manager = manager;
    }

    public abstract void enable();

    public abstract void disable();
}
