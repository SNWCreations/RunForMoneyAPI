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
import org.jetbrains.annotations.Contract;

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
    @Contract("null -> fail")
    public boolean isRunner(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是不是猎人。
     *
     * @param player 玩家实例
     * @return 玩家是不是猎人
     */
    @Contract("null -> fail")
    public boolean isHunter(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是不是逃走队员。
     *
     * @param player 玩家名
     * @return 玩家是不是逃走队员
     */
    @Contract("null -> fail")
    public boolean isRunner(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是不是猎人。
     *
     * @param player 玩家名
     * @return 玩家是不是猎人
     */
    @Contract("null -> fail")
    public boolean isHunter(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是否不在游戏中 (不在猎人/逃走队员的队伍中) 。
     *
     * @param player 玩家实例
     * @return 玩家是否不在游戏中
     */
    @Contract("null -> fail")
    public boolean isNotInGame(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个玩家是否不在游戏中 (不在猎人/逃走队员的队伍中) 。
     *
     * @param player 玩家名
     * @return 玩家是否不在游戏中
     */
    @Contract("null -> fail")
    public boolean isNotInGame(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家成为猎人、若玩家是逃走队员，则TA将会从逃走队员的队伍中离开。
     *
     * @param player 玩家实例
     */
    @Contract("null -> fail")
    public void addHunter(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家成为逃走队员、若玩家是猎人，则TA将会从猎人的队伍中离开。如果TA在某个组中，TA也会从所在的组离开。
     *
     * @param player 玩家实例
     */
    @Contract("null -> fail")
    public void addRunner(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某个玩家不再是猎人。同时TA也会从所在的组(如果有)离开。
     *
     * @param player 玩家实例
     */
    @Contract("null -> fail")
    public void removeHunter(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某个玩家不再是逃走队员。
     *
     * @param player 玩家实例
     */
    @Contract("null -> fail")
    public void removeRunner(Player player) {
        throw new UnsupportedOperationException();
    }


    /**
     * 判断一个猎人是否已启用。
     *
     * @param player 玩家实例
     * @return 该猎人是否已启用 (玩家不是猎人时一定返回 <code>false</code>)
     */
    @Contract("null -> fail")
    public boolean isHunterEnabled(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断一个猎人是否已启用。
     *
     * @param player 玩家实例
     * @return 该猎人是否已启用 (玩家不是猎人时一定返回 <code>false</code>)
     */
    @Contract("null -> fail")
    public boolean isHunterEnabled(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 是否没有猎人<b>在线</b>。
     *
     * @return 是否没有猎人<b>在线</b>
     */
    public boolean isNoHunterFound() {
        throw new UnsupportedOperationException();
    }

    /**
     * 是否没有逃走队员<b>在线</b>。
     *
     * @return 是否没有逃走队员<b>在线</b>
     */
    public boolean isNoRunnerFound() {
        throw new UnsupportedOperationException();
    }

    /**
     * 启用某个猎人。
     *
     * @param player 将被启用的猎人
     */
    @Contract("null -> fail")
    public void addEnabledHunter(Player player) throws IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /**
     * 启用某个猎人。
     *
     * @param player 将被启用的猎人
     */
    @Contract("null -> fail")
    public void addEnabledHunter(String player) throws IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /**
     * 设置某玩家为弃权者。
     *
     * @param player 玩家名
     * @deprecated 此方法已经更名为 {@link TeamHolder#addGiveUpPlayer(String)} ，因为自插件 v1.8.4 开始支持多玩家弃权。
     */
    @Deprecated
    public void setGiveUpPlayer(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家被当做已被淘汰的玩家。
     *
     * @param player 玩家实例
     */
    @Contract("null -> fail")
    public void addOutPlayer(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家不再被当做已被淘汰的玩家。
     *
     * @param player 玩家实例
     */
    @Contract("null -> fail")
    public void removeOutPlayer(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家被当做已被淘汰的玩家。
     *
     * @param player 玩家名
     */
    @Contract("null -> fail")
    public void addOutPlayer(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家不再被当做已被淘汰的玩家。
     *
     * @param player 玩家名
     */
    @Contract("null -> fail")
    public void removeOutPlayer(String player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 禁用某个猎人。
     *
     * @param player 将被禁用的猎人的玩家实例
     */
    @Contract("null -> fail")
    public void removeEnabledHunter(Player player) {
        throw new UnsupportedOperationException();
    }

    /**
     * 禁用某个猎人。
     *
     * @param player 将被禁用的猎人的玩家名
     */
    @Contract("null -> fail")
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

    /**
     * 获取所有已被淘汰的玩家的名称。
     *
     * @return 所有已被淘汰的玩家的名称
     */
    public Set<String> getOutPlayers() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取弃权者的游戏名称。
     *
     * @return 弃权者的游戏名称
     * @deprecated 此方法自插件 v1.8.4 开始不再有效，并始终抛出 {@link UnsupportedOperationException} 。因为自插件 v1.8.4 开始允许多玩家弃权。
     */
    @Deprecated
    public String getGiveUpPlayer() {
        throw new UnsupportedOperationException();
    }

    /**
     * 返回所有已弃权玩家的名称。
     *
     * @return 所有已弃权玩家的名称
     */
    public Set<String> getGiveUpPlayers() {
        throw new UnsupportedOperationException();
    }

    /**
     * 使某玩家被当做已弃权玩家。
     *
     * @param player 此玩家的游戏名
     */
    public void addGiveUpPlayer(String player) {
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
