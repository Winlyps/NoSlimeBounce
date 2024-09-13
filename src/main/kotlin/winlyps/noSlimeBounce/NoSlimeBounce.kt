package winlyps.noSlimeBounce

import org.bukkit.plugin.java.JavaPlugin

class NoSlimeBounce : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(SlimeBlockListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}