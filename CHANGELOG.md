# RunForMoney API - 更新日志

## v1.0.1 (2022/2/20)

* 补齐 snw.rfm.ItemRegistry 的部分缺失的 Javadoc 。
* 向所有位于 snw.rfm.Util 类的方法增加了非 null 验证。
* 向 snw.rfm.api.GameController 接口的 setCoinPerSecond() 方法的签名增加了 "throws IllegalArgumentException" 。
* 废弃了 snw.rfm.api.GameController 接口的 setGameReversed 和 isGameReversed 方法。

## v1.0.0 (2022/2/18)

最初版本，分割自插件本体 v1.1.11 。