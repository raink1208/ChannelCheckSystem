plugins {
    kotlin("jvm")
}

group = "com.github.raink1208.channelchecksystem"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(":common")
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}