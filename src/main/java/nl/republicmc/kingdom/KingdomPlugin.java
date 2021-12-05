package nl.republicmc.kingdom;

import nl.republicmc.kingdom.feature.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public final class KingdomPlugin extends JavaPlugin {

    private final Set<Feature> features = new LinkedHashSet<>();

    @Override
    public void onEnable() {
        features.addAll(Arrays.asList(
                new GuildSystemFeature(this),
                new EconomyFeature(this),
                new MapRestorerFeature(this),
                new OreGeneratorFeature(this)
        ));

        features.forEach(Feature::enable);
    }

    @Override
    public void onDisable() {
        features.forEach(Feature::disable);
    }
}
