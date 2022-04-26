/**
 * This file is part of RunForMoney-API.
 *
 * RunForMoney-API is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * RunForMoney-API is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with RunForMoney-API. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * 玩家弃权事件。
 * <p>
 * 此事件产生时机: 玩家成功挖掘了弃权方块，但仍未被移除逃走队员列表。
 * <p>
 * 此事件完成后，玩家正式弃权。
 */
public final class PlayerExitRFMEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;

    public PlayerExitRFMEvent(Player whoExited) {
        super(whoExited);
    }

    /**
     * 获取弃权者。
     *
     * @return 弃权者
     * @deprecated 严格意义上来说，这应该是一个 {@link PlayerEvent} 的子类，所以您应该使用 {@link PlayerEvent#getPlayer()} 方法。但此方法仍然可用，返回值与其相同。
     */
    @Deprecated
    public Player getWhoExited() {
        return getPlayer();
    }


    /**
     * 获取该玩家最终能获得的 B币 。
     *
     * @param multiplier 决定获得的数据是否被处理过 (即是否受到插件配置 "coin_multiplier_on_be_caught" 的影响)
     * @return 该玩家最终获得的 B币 数量。
     */
    public double getCoinEarned(boolean multiplier) {
        throw new UnsupportedOperationException();
    }

    /**
     * 设置该玩家最终能获得的 B币 。
     * <p>
     * <b>注意，此方法被成功调用后，{@link PlayerExitRFMEvent#getCoinEarned(boolean)} 方法始终返回提供给此方法的值。</b>
     *
     * @param coin 玩家将获得的 B币 。
     * @throws IllegalArgumentException 当 <code>coin</code> 是负数或是 NaN 时抛出
     */
    public void setCoinEarned(double coin) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    /**
     * 返回此事件的 B币 值是否已被修改。
     * @return 此事件的 B币 值是否已被修改
     */
    public boolean isModified() {
        throw new UnsupportedOperationException();
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
