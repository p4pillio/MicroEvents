package me.p4pillio.microevents;

import me.p4pillio.microevents.commands.MainCommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class MicroEvents extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new MainCommands(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
