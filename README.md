# Run For Money - API

此 API 是从 [RunForMoney](https://github.com/SNWCreations/RunForMoney) 插件本体内分割出来的。

开发者可以直接使用此 API 开发插件，从而干涉"逃走中"游戏。

## 用法

具体请见代码内容。

## 添加依赖

无论您使用哪种方法，请向 plugin.yml 里的 depend 项和 loadbefore 项添加 "RunForMoney" 以保证您的插件正常工作。

### Maven

把此 API 添加到你的 pom.xml 里的 dependencies 项，然后把我的 Maven 私服添加到 repositories 即可。
记得把示范文本里的 (LATEST VERSION) 替换成最新版本，版本号可以在 Releases 里找到，我每个版本都会打 Tag 。

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
                <url>https://raw.github.com/SNWCreations/mvn-repo/main/</url>
            </repository>
        </repositories>
    </project>

### Gradle

因作者没用过 Gradle，以下内容选自网络，对有效性不做保证。

在 dependencies 部分里加上对此工件的引用。

    dependencies {
        ...
        compileOnly 'snw:rfm-api:(LATEST VERSION)'
    }

还要在 repositories 里增加对我的 Maven 私服的引用。

    repositories {
        maven {
            url "https://raw.github.com/SNWCreations/mvn-repo/main"
        ...
    }
