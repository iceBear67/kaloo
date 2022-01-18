import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.compose") version "1.0.0"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "io.ib67"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation("org.ktorm:ktorm-core:3.4.1")
    val miraiVersion = "2.9.2"
    api("net.mamoe", "mirai-core-api", miraiVersion)     // 编译代码使用
    runtimeOnly("net.mamoe", "mirai-core", miraiVersion) // 运行时使用
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "kaloo.Kaloo"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "kaloo"
            packageVersion = "1.0.0"
        }
    }
}