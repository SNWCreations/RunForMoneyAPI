/**
 * This file is part of RunForMoney-API.
 * <p>
 * RunForMoney-API is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * <p>
 * RunForMoney-API is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along with RunForMoney-API. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import snw.rfm.api.GameController;

import java.util.Map;

public final class RunForMoney extends JavaPlugin {

    public static RunForMoney getInstance() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取游戏控制器实例。
     * @return 游戏控制器实例。
     * @see GameController
     */
    public GameController getGameController() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取B币榜的数据。
     * @return B币榜数据的 Map <b>(未排序)</b> 。
     */
    public Map<Player, Double> getCoinEarned() {
        throw new UnsupportedOperationException();
    }

}
