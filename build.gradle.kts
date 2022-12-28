plugins {
    kotlin("jvm") version "1.7.20" apply false
}

ext["grpcVersion"] = "1.51.1"
ext["grpcKotlinVersion"] = "1.3.0"
ext["protobufVersion"] = "3.21.12"
ext["coroutinesVersion"] = "1.6.4"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}