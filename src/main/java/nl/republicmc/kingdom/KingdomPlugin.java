package nl.republicmc.kingdom;

import nl.republicmc.kingdom.feature.Feature;
import nl.republicmc.kingdom.feature.guild.GuildFeature;
import nl.republicmc.kingdom.feature.guild.GuildManager;
import nl.republicmc.kingdom.feature.maprestorer.MapRestorerFeature;
import nl.republicmc.kingdom.feature.oregenerator.OreGeneratorFeature;
import nl.republicmc.kingdom.feature.economy.EconomyFeature;
import nl.republicmc.kingdom.feature.economy.EconomyManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.LinkedHashSet;
import java.util.Set;

public final class KingdomPlugin extends JavaPlugin {

    private final Set<Feature<?>> features = new LinkedHashSet<>();

    @Override
    public void onEnable() {
        features.add(new GuildFeature(this, new GuildManager(this)));
        features.add(new EconomyFeature(this, new EconomyManager(this)));
        features.add(new MapRestorerFeature(this));
        features.add(new OreGeneratorFeature(this));

        features.forEach(Feature::enable);
    }

    @Override
    public void onDisable() {
        features.forEach(Feature::disable);
    }
}
