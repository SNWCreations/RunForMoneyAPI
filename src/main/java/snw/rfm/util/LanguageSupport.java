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
 * 多国语言支持模块。
 * <p>
 * 这个模块只是为 "逃走中" 插件本体服务的，你可以通过此类获得插件本体的本地化字符串键所对应的翻译。
 * <p>
 * 本地化字符串键可通过位于 Github 仓库上的 <a href="https://github.com/SNWCreations/RunForMoney/tree/main/src/main/resources/lang">本地化翻译</a> 文件夹里的文件找到。
 */
public final class LanguageSupport {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private static final Map<String, String> langStrings = new HashMap<>(); // the update will be completed by plugin.

    // private constructor.
    private LanguageSupport() {
        throw new UnsupportedOperationException("No snw.rfm.util.LanguageSupport instances for you!");
    }

    // if you see the plugin's NickSupport class,
    // you will find that a method "loadLanguage(String)" is not defined there.
    // because the developers should not access load feature.
    // we should use the language requested by the configuration only.
    // this method is implemented by plugin.

    /**
     * 替换提供的字符串所包含的本地化字符串为对应翻译。
     *
     * @param stringToProcess 将被处理的字符串
     * @return 处理好的字符串
     */
    @NotNull
    public static String replacePlaceHolder(@NotNull String stringToProcess) {
        Validate.notNull(stringToProcess, "No string to process?");
        String result = stringToProcess;
        for (Map.Entry<String, String> entry : langStrings.entrySet()) {
            result = result.replace("$" + entry.getKey() + "$", entry.getValue());
        }
        return result;
    }

    /**
     * 获取某本地化字符串键 (不用 $ 包裹) 对应的翻译，提供的字符串不存在时返回其本身。
     *
     * @param translateKey 一个本地化字符串键
     * @return 与其对应的翻译
     */
    @NotNull
    public static String getTranslation(@NotNull String translateKey) {
        Validate.notNull(translateKey, "No key?");
        return langStrings.getOrDefault(translateKey, translateKey);
    }
}
