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
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * 猎人抓到一个玩家时触发此事件。
 * <p>
 * 此事件产生时机: 玩家确认被抓捕，但仍未被移出逃走队员列表。
 * <p>
 * 此事件完成后，玩家被淘汰。
 */
public final class HunterCatchPlayerEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Player whoBeCaught;
    private final Player catcher;
    private final int playerRemaining;
    private boolean isCancelled = false;

    public HunterCatchPlayerEvent(Player caught, Player catcher, int playerRemaining) {
        this.whoBeCaught = caught;
        this.catcher = catcher;
        this.playerRemaining = playerRemaining;
    }

    /**
     * 获取被抓捕者。
     *
     * @return 被抓捕者
     */
    public Player getWhoBeCaught() {
        return whoBeCaught;
    }

    /**
     * 获取抓捕者。
     *
     * @return 抓捕者
     */
    public Player getCatcher() {
        return catcher;
    }

    /**
     * 获取剩余的玩家数。
     *
     * @return 剩余的玩家数
     */
    public int getPlayerRemaining() {
        return playerRemaining;
    }

    /**
     * 获取该玩家最终能获得的 B币 。
     * <p>
     * <i>因需要插件配置文件的配合，故 API 无法提供此方法的实现。</i>
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
     * <b>注意，此方法被成功调用后，无论向 {@link HunterCatchPlayerEvent#getCoinEarned(boolean)} 方法传递 <code>true</code> 还是 <code>false</code> ，返回值都始终会是提供给此方法的值。</b>
     *
     * @param coin 玩家将获得的 B币 。
     * @throws IllegalArgumentException 当 <code>coin</code> 是负数或是 NaN 时抛出
     */
    public void setCoinEarned(double coin) throws IllegalArgumentException {
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
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        isCancelled = cancel;
    }
}
