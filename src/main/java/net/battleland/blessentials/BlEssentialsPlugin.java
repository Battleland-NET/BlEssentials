package net.battleland.blessentials;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BlEssentialsPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);
    }
}
