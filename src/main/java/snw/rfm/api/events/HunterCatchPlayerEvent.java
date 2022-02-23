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
    private final Player whoBeCatched;
    private final Player catcher;
    private final int playerRemaining;
    private boolean isCancelled = false;

    public HunterCatchPlayerEvent(Player catched, Player catcher, int playerRemaining) {
        this.whoBeCatched = catched;
        this.catcher = catcher;
        this.playerRemaining = playerRemaining;
    }

    /**
     * 获取被抓捕者。
     *
     * @return 被抓捕者
     */
    public Player getWhoBeCatched() {
        return whoBeCatched;
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
