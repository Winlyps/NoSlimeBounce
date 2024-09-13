package winlyps.noSlimeBounce

import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.util.Vector

class SlimeBlockListener(private val plugin: JavaPlugin) : Listener {

    @EventHandler
    fun onPlayerMove(event: PlayerMoveEvent) {
        val player: Player = event.player
        val toBlock: Block = player.location.block.getRelative(0, -1, 0)

        if (toBlock.type == Material.SLIME_BLOCK) {
            // Prevent jumping by setting the player's velocity to zero
            player.velocity = Vector(0.0, 0.0, 0.0)
        }
    }
}