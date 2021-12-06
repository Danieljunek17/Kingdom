package nl.republicmc.kingdom.feature;

import nl.republicmc.kingdom.KingdomPlugin;

/**
 * Class that manages data and states.
 */
public abstract class Manager {

    protected final KingdomPlugin plugin;

    public Manager(KingdomPlugin plugin) {
        this.plugin = plugin;
    }

    /**
     * On enabling the manager.
     *
     * @implNote Should be called in {@link Feature#enable()}
     */
    public abstract void enable();

    /**
     * On disabling the manager.
     *
     * @implNote Should be called in {@link Feature#disable()}
     */
    public abstract void disable();
}
