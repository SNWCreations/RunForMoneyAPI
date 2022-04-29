/*
 * This file is part of RunForMoney.
 *
 * RunForMoney is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * RunForMoney is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with RunForMoney. If not, see <https://www.gnu.org/licenses/>.
 */

package snw.rfm.util;

import org.apache.commons.lang.Validate;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * 语言支持模块。
 *
 * @see NickSupport#getNickName(String)
 */
public final class NickSupport {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private static final Map<String, String> nickMap = new HashMap<>(); // the update will be completed by plugin.

    /* Utility class should not be initialized. */
    private NickSupport() {
        throw new UnsupportedOperationException("No snw.rfm.util.NickSupport instances for you!");
    }

    // init() method is not defined there. that method should be used by plugin (not yours) only.

    /**
     * 获取某玩家的别称。
     * <p>
     * <b>当你的插件想要通告信息时，所有的玩家名应该尽可能使用其别称。</b>
     *
     * @param playerName 某玩家的文件名 (区分大小写)
     * @return 此玩家的别称 (如果有), 否则原样返回。
     */
    @NotNull
    public static String getNickName(@NotNull String playerName) {
        Validate.notNull(playerName, "A player name is required!");
        return nickMap.getOrDefault(playerName, playerName);
    }
}
