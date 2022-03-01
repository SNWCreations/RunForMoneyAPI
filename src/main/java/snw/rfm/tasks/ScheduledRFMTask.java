/**
 * This file is part of RunForMoney-API.
 *
 * RunForMoney-API is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * RunForMoney-API is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with RunForMoney-API. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm.tasks;

import snw.rfm.api.GameController;

/**
 * 这是对一个已经通过 {@link GameController#registerRemainingTimeEvent(int, Runnable)} 注册的，将被执行的 {@link Runnable} 的包装。
 * @since 1.3.0
 */
public interface ScheduledRFMTask {

    /**
     * 取消这个计划任务。此包装的计时器将会停止运行并被插件移除。
     */
    void cancel();

    /**
     * 返回此计划任务是否已被执行。
     * @return 此计划任务是否已被执行
     */
    boolean isExecuted();

    /**
     * 返回距离该任务被执行的时间，秒为单位。
     * @return 距离该任务被执行的时间
     */
    int getRemainingTime();

    /**
     * 立刻执行此计划任务。同时此包装的计时器将会停止运行并被插件移除。
     * <p>
     * 此实例的 {@link ScheduledRFMTask#isExecuted()} 方法的返回值在调用此方法后一定返回 true 。
     */
    void executeItNow();
}