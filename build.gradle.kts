plugins {
    kotlin("jvm") version "1.3.70"
    id("org.jetbrains.kotlin.plugin.spring") version "1.3.70"
}

group = "io.hugogu"
version = "1.0-SNAPSHOT"

subprojects {
    apply {
        plugin("kotlin")
        plugin("kotlin-spring")
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("reflect"))
        implementation(kotlin("stdlib-jdk8"))
    }

    tasks {
        compileKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
        compileTestKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
}
