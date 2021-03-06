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

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import snw.rfm.game.TeamHolder;

import java.util.Set;

/**
 * 游戏停止事件。
 * <p>
 * 此事件产生时机: 游戏应该结束，但游戏进程仍未停止。
 * <p>
 * 此事件完成后，游戏正式结束。
 */
public final class GameStopEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    
    /**
     * 获取获胜者集合。
     *
     * @return 获胜者集合。但返回的集合可能不包含任何元素 (当所有玩家均被捕时可能产生此情况) 。
     * @deprecated 此事件发生时，您应该调用 {@link TeamHolder#getRunners()} 方法。此方法的本质也是这样。
     */
    @Deprecated
    @NotNull
    public Set<String> getWinner() {
        return TeamHolder.getInstance().getRunners();
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
