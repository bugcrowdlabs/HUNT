plugins {
    kotlin("jvm") version "1.3.72"
    id("org.zaproxy.add-on") version "0.4.0"
}

version = "2.2.0"
description = "HUNT Scanner"

zapAddOn {
    addOnName.set("HUNT")
    addOnStatus.set(org.zaproxy.gradle.addon.AddOnStatus.ALPHA)
    zapVersion.set("2.9.0")

    manifest {
        author.set("Caleb Kinney")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}