/**
 * This file is part of RunForMoney-API.
 *
 * RunForMoney-API is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * RunForMoney-API is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with RunForMoney-API. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm;

import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 此插件的实用类。
 * <p>
 * 当然，你也可以用用。
 */
public final class Util {

    /**
     * 一个 <code>private</code> 的构造方法。这是个实用工具类，不应该被实例化。
     */
    private Util() {
        throw new UnsupportedOperationException("No snw.rfm.Util instances for you!");
    }

    /**
     * 获取 b 中所有以 a 的值开头的字符串。
     * @param a 示例值
     * @param b 将被筛选的列表
     * @param ignoreCase 是否忽略大小写
     * @return 筛选后的列表 (可能为空) 。
     */
    @NotNull
    public static List<String> getAllTheStringsStartingWithListInTheList(@NotNull String a, @NotNull Collection<String> b, boolean ignoreCase) {
        Validate.notNull(a);
        Validate.notNull(b);
        return b.stream().filter(IT -> ((ignoreCase) ? IT.toLowerCase() : IT).startsWith((ignoreCase) ? a.toLowerCase() : a)).collect(Collectors.toList());
    }

    /**
     * 获取所有玩家的名字。
     * @return 包含了所有玩家的名字的 {@link List} (内部实现返回的是 {@link java.util.ArrayList}) 。
     */
    @NotNull
    public static List<String> getAllPlayersName() {
        List<String> result = new ArrayList<>();
        Bukkit.getOnlinePlayers().forEach((player -> result.add(player.getName())));
        return result;
    }

    /**
     * {@link Map} 的降序排序。
     * @param map 将被排序的 {@link Map}
     * @param <K> 任意值
     * @param <V> 任意值，但需要实现 {@link Comparable} 接口
     * @return 一个降序排序的 {@link Map} ({@link java.util.LinkedHashMap}) 。
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> sortDescend(@NotNull Map<K, V> map) {
        Validate.notNull(map);
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            int compare = (o1.getValue()).compareTo(o2.getValue());
            return -compare;
        });

        Map<K, V> returnMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            returnMap.put(entry.getKey(), entry.getValue());
        }
        return returnMap;
    }

    /**
     * 将提供的字符串解析为 {@link org.bukkit.Location} ，Yaw 和 Pitch 均为 0 。
     * <p>
     * 格式要求: "X Y Z"
     * @param loc 位置字符串
     * @return 解析后的位置
     */
    public static Location parseXYZStringIntoLocation(@NotNull String loc) {
        Validate.notNull(loc);
        String[] loc_split = loc.split(" ");
        return new Location(Bukkit.getWorld("world"), Integer.parseInt(loc_split[0]), Integer.parseInt(loc_split[1]), Integer.parseInt(loc_split[2]));
    }

    /**
     * 移除某玩家的所有状态效果。
     * @param player 目标玩家
     */
    public static void removeAllPotionEffect(@NotNull Player player) {
        Validate.notNull(player);
        Arrays.stream(PotionEffectType.values()).forEach(player::removePotionEffect);
    }
}
