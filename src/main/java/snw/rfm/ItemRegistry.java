/*
 * This file is part of RunForMoney-API.
 *
 * RunForMoney-API is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * RunForMoney-API is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with RunForMoney-API. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import snw.rfm.api.ItemEventListener;

import java.util.List;
import java.util.Set;

/**
 * 物品事件注册表。
 *
 * @see snw.rfm.api.ItemEventListener
 */
public final class ItemRegistry {
    /**
     * 此方法用于注册一个道具。
     * <p>
     * 注意: 针对一个道具物品实例，可能有多个内部名称与其对应。
     *
     * @param name 将被注册的内部名称
     * @param item 将被注册的道具实例
     * @throws IllegalArgumentException 当内部名称不是由纯英文和数字时引发
     * @throws IllegalStateException 提供的内部名称或道具实例已被注册时引发
     * @since 插件 v1.1.8
     */
    public static void registerItem(@NotNull String name, @NotNull ItemStack item) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /**
     * 此方法用于注册一个道具。
     * <p>
     * 这个重载版可以视为 这个方法的原始版 + registerItemEvent 方法 。
     *
     * @param name 将被注册的内部名称
     * @param item 将被注册的道具实例
     * @param listener 监听器实例
     * @throws IllegalArgumentException 当内部名称不是由纯英文和数字时引发
     * @throws IllegalStateException 提供的内部名称已被注册时引发
     * @since 插件 v1.1.8
     */
    public static void registerItem(@NotNull String name, @NotNull ItemStack item, @NotNull ItemEventListener listener) throws IllegalArgumentException, IllegalStateException {
        registerItem(name, item);
        registerItemEvent(item, listener);
    }

    /**
     * 此方法用于注册一个对特定道具的监听器。
     * @param item 将被监听的物品
     * @param listener 监听器实例
     * @since 插件 v1.1.6
     */
    public static void registerItemEvent(@NotNull ItemStack item, @NotNull ItemEventListener listener) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取对特定道具的监听器。
     * @param item 用于查询的道具实例
     * @return 所有针对目标道具的监听器实例 (列表内可能无元素) 。
     * @since 插件 v1.1.6
     */
    @NotNull
    public static List<ItemEventListener> getProcessorByItem(@NotNull ItemStack item) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取特定内部名称指定的道具的监听器。
     * <p>
     * 本质是先获取道具实例再获取监听器实例列表。
     *
     * @param name 道具的内部名称
     * @return 道具对应的监听器实例的列表
     */
    @NotNull
    public static List<ItemEventListener> getProcessorByName(@NotNull String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获得所有已注册道具的内部名称。
     * @return 所有已注册道具的内部名称
     */
    @NotNull
    public static Set<String> getRegisteredItemNames() {
        throw new UnsupportedOperationException();
    }

    /**
     * 用内部名称获取某个道具物品的实例。
     * @param name 目标物品的内部名称
     * @return 目标物品 (可能因不存在返回 null)
     */
    @Nullable
    public static ItemStack getRegisteredItemByName(@NotNull String name) {
        throw new UnsupportedOperationException();
    }
}
