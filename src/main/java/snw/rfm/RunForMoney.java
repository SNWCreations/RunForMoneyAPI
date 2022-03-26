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

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;
import snw.rfm.api.GameController;

import java.util.Map;

public final class RunForMoney extends JavaPlugin {

    public static RunForMoney getInstance() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取游戏控制器实例。
     * <p>
     * 当游戏未在运行时，此方法返回 <code>null</code> 。
     * @return 游戏控制器实例。
     * @see GameController
     */
    @Nullable
    public GameController getGameController() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取B币榜的数据。
     *
     * @return B币榜数据的 {@link Map} 。
     * @deprecated 您不应该通过这个方法获取数据并进行操作，请使用 {@link GameController#addMoney(String, double)} 或 {@link GameController#clearCoin()} 之类的方法代替。
     */
    @Deprecated
    public Map<String, Double> getCoinEarned() {
        throw new UnsupportedOperationException();
    }

}
