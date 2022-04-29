# RunForMoney API - 更新日志

## v1.6.0

* 从插件本体同步了 TeamHolder 类的方法，部分仅内部可用的方法没有添加。

## v1.5.1

* **!破坏性更改!** 将 GameStopEvent 的 getWinner 方法返回值从 `Set<Player>` 改为 `Set<String>` 。
* 向 HunterCatchPlayerEvent 增加了 isModified 方法。
* 向 PlayerExitRFMEvent 增加了 setCoinEarned, isModified 方法。
* 现在 PlayerExitRFMEvent 可以被取消了。
* 增加了 LanguageSupport, NickSupport 类。
* 从插件本体复制了 TeamHolder 所拥有的大部分方法。
* 修订了部分方法的说明。

## v1.5.0

* **!破坏性更改!** 将所有拼写错误的 "catched" 改为 "caught" 。故部分方法被重命名。
* 向 HunterCatchPlayerEvent 增加方法 setCoinEarned(double coin) 方法。
* 移除了 snw.rfm.api.throwables 包，用 Java 原生异常替代相关用法。

## v1.4.1

* 向 GameController 增加了方法 addMoney(String player, double coin) ，作为 addMoney(Player player, double coin) 的父方法。
* RunForMoney#getCoinEarned 现在是一个 Deprecated 的方法。

## v1.4.0

* **!破坏性更改!** 改变了 GamePauseEvent 的触发时机。详情见其注释。
* **!破坏性更改!** 移除了 GameStartEvent ，因为其已经更名。
* 增加了 snw.rfm.game.TeamHolder ，用于在游戏运行时对玩家的身份进行判断。
* 向 GameController 增加了 5 个方法。
* 向 ScheduledRFMTask 增加了 isCancelled 方法。
* 向 Util 类增加了一个 private 的构造方法。此类本就不应被实例化。
* 现在 BaseCountDownTimer#start 方法返回与其实例相对应的 BukkitTask 。
* 修订了一些文档内容。

## v1.3.4 (2022/3/5)

* GameController#registerTimeEvent 返回值可能为 null ，于是我补上了 @Nullable 注解。

## v1.3.3 (2022/3/5)

* 修改了 ScheduledRFMTask 接口的一些 Javadoc 。

## v1.3.2 (2022/3/5)

* HunterCatchPlayerEvent#getCoinEarned 方法的返回值应该是 double ，而不是 int ，特此纠正。
* 向 PlayerExitRFMEvent 增加了方法 getCoinEarned(boolean multiplier) ，内部实现与 HunterCatchPlayerEvent#getCoinEarned 一致。

## v1.3.1 (2022/3/5)

* 移除了 HunterCatchPlayerEvent 构造方法的 coinEarned 参数。

## v1.3.0 (2022/3/5)

* 增加了事件 GamePauseEvent, GameResumeEvent, GamePostStartEvent 。
* 向 HunterCatchPlayerEvent 增加了方法 getCoinEarned(boolean multiplier) 。
* 向 snw.rfm.api.GameController 接口增加 registerRemainingTimeEvent 和 respawn 方法。
* 随着 GameController#registerRemainingTimeEvent 方法的增加，向 snw.rfm.tasks 包增加了接口 ScheduledRFMTask ，此接口的实现是该方法的返回值。
* GameStartEvent 更名为 GamePreStartEvent，原有类被标记为 Deprecated 。
* 移除了位于 snw.rfm.api.events 包的 package-info.java 。因为其无意义。

## v1.2.0 (2022/2/25)

* 向 snw.rfm.api.GameController 接口增加 clearCoin 方法，详情见 Javadoc 。
* 现在 BaseCountDownTimer#start 方法需要一个 Plugin 类型的参数。
* 现在 RunForMoney#getCoinEarned 方法的返回值类型是 Map<String, Double> 。

## v1.1.0 (2022/2/22)

* 向 snw.rfm.api.GameController 接口增加 setHunterNoMoveTime 方法，详情见 Javadoc 。
* 现在 snw.rfm.api.events.HunterCatchPlayerEvent 可以被取消。

## v1.0.1 (2022/2/20)

* 补齐 snw.rfm.ItemRegistry 的部分缺失的 Javadoc 。
* 向所有位于 snw.rfm.Util 类的方法增加了非 null 验证。
* 向 snw.rfm.api.GameController 接口的 setCoinPerSecond() 方法的签名增加了 "throws IllegalArgumentException" 。
* 废弃了 snw.rfm.api.GameController 接口的 setGameReversed 和 isGameReversed 方法。

## v1.0.0 (2022/2/18)

最初版本，分割自插件本体 v1.1.11 。