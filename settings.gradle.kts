rootProject.name = "stripe"

buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("gradle.plugin.net.vivin:gradle-semantic-build-versioning:4.0.0")
    }
}

apply(plugin = "net.vivin.gradle-semantic-build-versioning")