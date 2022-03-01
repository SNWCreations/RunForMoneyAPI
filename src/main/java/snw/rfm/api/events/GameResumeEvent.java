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

/**
 * 此事件在管理员请求继续"逃走中"游戏且<b>操作成功</b>后产生。
 *
 * @since 1.3.0
 */
public final class GameResumeEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
