# Run For Money - API

此 API 是从 [RunForMoney](https://github.com/SNWCreations/RunForMoney) 插件本体内分割出来的。

开发者可以直接使用此 API 开发插件，从而干涉"逃走中"游戏。

## 用法

具体请见代码内容。

如需监听游戏内的事件，请到 snw.rfm.api.events 包下寻找您需要的事件。

如需对游戏进行修改，请见 snw.rfm.api.GameController 接口。

如需注册和监听道具，请见 snw.rfm.ItemRegistry 和 snw.rfm.api.ItemEventListener 接口。

## 添加依赖

无论您使用哪种方法，请向 plugin.yml 里的 depend 项和 loadbefore 项添加 "RunForMoney" 以保证您的插件正常工作。

记得把示范文本里的 (LATEST VERSION) 替换成最新版本，版本号可以在 Releases 里找到，我每个版本都会打 Tag 。

**注意: 请不要使用此 API 的 Beta 版 (版本号格式为: X.X.X-betaX，其中 X 为数字) 。虽然我不会直接发布 Beta 版，但如果不小心发布了，请不要使用。**

**Beta 版 API 极其不稳定，您所调用的来自 Beta 版 API 的方法可能在下一个 Beta 版就会被标记为 @Deprecated 或者更名，甚至直接移除。**

### Maven

把此 API 添加到你的 pom.xml 里的 dependencies 项，然后把 JitPack 服务器添加到 repositories 即可。

完整 pom.xml 的示例是这样的:

    <project>
        ...
        <dependencies>
            ...
            <dependency>
                <groupId>com.github.SNWCreations</groupId>
                <artifactId>RunForMoneyAPI</artifactId>
                <version>(LATEST VERSION)</version>
                <scope>provided</scope>
            </dependency>
            ...
        </dependencies>
        ...
        <repositories>
            ....
            <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
            </repository>
        </repositories>
    </project>

### Gradle

因作者没用过 Gradle，以下内容选自网络，对有效性不做保证。

在 dependencies 部分里加上对此工件的引用。

    dependencies {
        ...
        compileOnly 'com.github.SNWCreations:RunForMoneyAPI:(LATEST VERSION)'
    }

还要在 repositories 里增加对 JitPack 服务器的引用。

    repositories {
        maven { url 'https://jitpack.io' }
        ...
    }


### 过去的方法

以下方法已经过时。且我的 Maven 私服不再更新，因此您将不能从我的私服获得 v1.5.1 之后 (包括 v1.5.1) 版本的 API 。

#### Maven

把此 API 添加到你的 pom.xml 里的 dependencies 项，然后把我的 Maven 私服添加到 repositories 即可。

完整 pom.xml 的示例是这样的:

    <project>
        ...
        <dependencies>
            ...
            <dependency>
                <groupId>snw</groupId>
                <artifactId>rfm-api</artifactId>
                <version>(LATEST VERSION)</version>
                <scope>provided</scope>
            </dependency>
            ...
        </dependencies>
        ...
        <repositories>
            ....
            <repository>
                <id>snw-personal-repo</id>
                <url>https://ghproxy.com/https://raw.githubusercontent.com/SNWCreations/mvn-repo/main/</url>
            </repository>
        </repositories>
    </project>

#### Gradle

因作者没用过 Gradle，以下内容选自网络，对有效性不做保证。

在 dependencies 部分里加上对此工件的引用。

    dependencies {
        ...
        compileOnly 'snw:rfm-api:(LATEST VERSION)'
    }

还要在 repositories 里增加对我的 Maven 私服的引用。

    repositories {
        maven {
            url "https://ghproxy.com/https://raw.githubusercontent.com/SNWCreations/mvn-repo/main"
        }
        ...
    }
