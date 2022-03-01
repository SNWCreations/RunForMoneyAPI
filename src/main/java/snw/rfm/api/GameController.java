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
import snw.rfm.RunForMoney;
import snw.rfm.api.throwables.AlreadyPausedException;
import snw.rfm.api.throwables.AlreadyRunningException;
import snw.rfm.tasks.ScheduledRFMTask;

/**
 * 游戏控制器。可以对游戏进行一些修改。
 *
 * @see RunForMoney#getGameController()
 */
public interface GameController {

    /**
     * 设置每秒增加的B币数量。
     * @param cps 每秒增加的B币数量
     * @throws IllegalArgumentException 当尝试向此方法的实现的参数 cps 传递 0 时引发
     */
    void setCoinPerSecond(int cps) throws IllegalArgumentException;

    /**
     * 获取每秒增加的B币数量。
     * @return 每秒增加的B币数量
     */
    int getCoinPerSecond();

    /**
     * 设置时间是否倒流。
     * @param isGameReversed 时间是否倒流
     * @deprecated 自 v1.1.11 起可以通过向 {@link GameController#setCoinPerSecond} 方法的实现传递负值实现时间倒流。
     */
    @Deprecated
    void setGameReversed(boolean isGameReversed);

    /**
     * 获取时间是否正在倒流。
     * @return 时间是否正在倒流
     * @deprecated 自 v1.1.11 起，可以通过调用 {@link GameController#getCoinPerSecond()} 方法的实现，并判断其返回值是否为负来确定时间是否正在倒流。
     */
    @Deprecated
    boolean isGameReversed();

    /**
     * 暂停游戏。
     *
     * @throws AlreadyPausedException 当游戏进程实例已经被暂停时又一次调用此方法时引发此异常。
     */
    void pause() throws AlreadyPausedException;

    /**
     * 继续游戏。
     *
     * @throws AlreadyRunningException 当游戏进程实例已经在运行但又一次调用此方法时引发此异常。
     */
    void resume() throws AlreadyRunningException;

    /**
     * 获取游戏是否已经暂停。
     * @return 游戏是否已经暂停
     */
    boolean isPaused();

    /**
     * 使全体猎人不能移动，可以指定时长。
     * @param time 时长 (秒为单位，当提供的值不是正数时取消禁止移动)
     * @since 1.1.0
     */
    void setHunterNoMoveTime(int time);

    /**
     * 使所有仍存活的玩家 (排除已被捕或弃权的玩家) 所拥有的 B币 数量归零。谨慎操作。
     * @since 1.2.0
     */
    void clearCoin();

    /**
     * 使一个 {@link Runnable} 在游戏剩余 remaining 分钟时被调用。
     *
     * @param remaining 目标的剩余时间 (单位: 分钟)
     * @param runnable 将被调用的 {@link Runnable}
     * @return runnable 的一个包装，详见 {@link ScheduledRFMTask}
     * @since 1.3.0
     */
    ScheduledRFMTask registerRemainingTimeEvent(int remaining, Runnable runnable);

    /**
     * 使 player 重新回到逃走中游戏。
     * @param player 将被复活的玩家
     * @return 操作是否成功，如果返回 false ，则该玩家可能不在线或仍存活
     * @since 1.3.0
     */
    boolean respawn(Player player);
}
