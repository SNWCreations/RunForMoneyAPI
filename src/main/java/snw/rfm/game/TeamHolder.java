/**
 * This file is part of RunForMoney-API.
 *
 * RunForMoney-API is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * RunForMoney-API is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with RunForMoney-API. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm.game;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * 猎人/逃走队员 队伍类。
 * <p>
 * <b>注意: 除非特殊说明，否则以下方法需要传入的 String 类型参数都是大小写敏感的。</b>
 */
public final class TeamHolder {

    // The instance of this class should be created by RunForMoney plugin only.
    private TeamHolder() {
        throw new UnsupportedOperationException();
    }

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
     * @param player 玩家名
     * @return 玩家是不是逃走队员
     */
    public boolean isRunner(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是不是猎人。
     *
     * @param player 玩家名
     * @return 玩家是不是猎人
     */
    public boolean isHunter(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是否不在游戏中 (不在猎人/逃走队员的队伍中) 。
     * @param player 玩家实例
     * @return 玩家是否不在游戏中
     */
    public boolean isNotInGame(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是否不在游戏中 (不在猎人/逃走队员的队伍中) 。
     * @param player 玩家名
     * @return 玩家是否不在游戏中
     */
    public boolean isNotInGame(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家成为猎人、若玩家是逃走队员，则TA将会从逃走队员的队伍中离开。
     * @param player 玩家实例
     */
    public void addHunter(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家成为逃走队员、若玩家是猎人，则TA将会从猎人的队伍中离开。如果TA在某个组中，TA也会从所在的组离开。
     * @param player 玩家实例
     */
    public void addRunner(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某个玩家不再是猎人。同时TA也会从所在的组(如果有)离开。
     * @param player 玩家实例
     */
    public void removeHunter(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某个玩家不再是逃走队员。
     * @param player 玩家实例
     */
    public void removeRunner(Player player) {
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
     * 判断一个猎人是否已启用。
     *
     * @param player 玩家实例
     * @return 该猎人是否已启用 (玩家不是猎人时一定返回 <code>false</code>)
     */
    public boolean isHunterEnabled(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 是否没有猎人<b>在线</b>。
     * @return 是否没有猎人<b>在线</b>
     */
    public boolean isNoHunterFound() {
        throw new UnsupportedOperationException();
    }

    /**
     * 是否没有逃走队员<b>在线</b>。
     * @return 是否没有逃走队员<b>在线</b>
     */
    public boolean isNoRunnerFound() {
        throw new UnsupportedOperationException();
    }

    /**
     * 启用某个猎人。
     * @param player 将被启用的猎人
     */
    public void addEnabledHunter(Player player) throws IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /**
     * 启用某个猎人。
     * @param player 将被启用的猎人
     */
    public void addEnabledHunter(String player) throws IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /**
     * 设置某玩家为弃权者。在 <code>{@link TeamHolder#getGiveUpPlayer()} != null</code> 时调用此方法无效。
     * @param player 玩家名
     */
    public void setGiveUpPlayer(@Nullable String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家被当做已被淘汰的玩家。
     * @param player 玩家实例
     */
    public void addOutPlayer(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家不再被当做已被淘汰的玩家。
     * @param player 玩家实例
     */
    public void removeOutPlayer(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家被当做已被淘汰的玩家。
     * @param player 玩家名
     */
    public void addOutPlayer(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家不再被当做已被淘汰的玩家。
     * @param player 玩家名
     */
    public void removeOutPlayer(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 禁用某个猎人。
     * @param player 将被禁用的猎人的玩家实例
     */
    public void removeEnabledHunter(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 禁用某个猎人。
     * @param player 将被禁用的猎人的玩家名
     */
    public void removeEnabledHunter(String player) {
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

    public Set<String> getOutPlayers() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取弃权者的游戏名称。
     * @return 弃权者的游戏名称
     */
    public String getGiveUpPlayer() {
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
