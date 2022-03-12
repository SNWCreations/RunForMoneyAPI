/**
 * This file is part of RunForMoney.
 *
 * RunForMoney is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * RunForMoney is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with RunForMoney. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm.game;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Set;

/**
 * 猎人/逃走队员 队伍类。具体实现不提供，
 */
public final class TeamHolder {

    /**
     * 判断一个玩家是不是逃走队员。
     *
     * @param player 玩家实例
     * @return 玩家是不是逃走队员
     */
    public boolean isRunner(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是不是猎人。
     *
     * @param player 玩家实例
     * @return 玩家是不是猎人
     */
    public boolean isHunter(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是不是逃走队员。
     *
     * @param player 玩家名 <b>(区分大小写)</b>
     * @return 玩家是不是逃走队员
     */
    public boolean isRunner(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是不是猎人。
     *
     * @param player 玩家名 <b>(区分大小写)</b>
     * @return 玩家是不是猎人
     */
    public boolean isHunter(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个猎人是否已启用。
     *
     * @param player 玩家实例
     * @return 该猎人是否已启用 (玩家不是猎人时一定返回 <code>false</code>)
     */
    public boolean isHunterEnabled(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取所有猎人的<b>游戏名</b>。
     * <p>
     * 如果需要对玩家实例进行操作，请用 {@link Bukkit#getPlayerExact(String)} 来获取玩家实例。
     *
     * @return 所有猎人的<b>游戏名</b>
     */
    public Set<String> getHunters() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取所有逃走队员的<b>游戏名</b>。
     * <p>
     * 如果需要对玩家实例进行操作，请用 {@link Bukkit#getPlayerExact(String)} 来获取玩家实例。
     *
     * @return 所有逃走队员的<b>游戏名</b>
     */
    public Set<String> getRunners() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取此类的实例。
     *
     * @return 此类的实例
     */
    public static TeamHolder getInstance() {
        throw new UnsupportedOperationException();
    }

}
