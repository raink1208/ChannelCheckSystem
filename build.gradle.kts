plugins {
    kotlin("jvm") version "1.7.20" apply false
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}