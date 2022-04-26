/*
 * This file is part of RunForMoney-API.
 *
 * RunForMoney-API is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * RunForMoney-API is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with RunForMoney-API. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * 此接口的实现可以在"逃走中"游戏<b>运行时</b>监听玩家使用特定道具并作出一些操作。
 *
 * @see snw.rfm.ItemRegistry#registerItemEvent(ItemStack, ItemEventListener)
 */
public interface ItemEventListener {

    /**
     * 此方法在一个开发者定义的道具被使用 (右键) 时调用。
     * <p>
     * 如果希望操作后物品被消耗，请返回 true ，反之返回 false 。
     *
     * @param player 物品使用者
     * @return 物品是否应该被消耗
     * @see snw.rfm.ItemRegistry#registerItemEvent(ItemStack, ItemEventListener)
     */
    boolean onPlayerUseRequiredItem(@NotNull Player player);
}
