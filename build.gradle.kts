import org.jetbrains.kotlin.js.translate.context.Namer.kotlin

plugins {
    id("java")
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.seleniumhq.selenium:selenium-java:3.141.59")
    testImplementation("org.testng:testng:7.7.1")
    implementation(kotlin("stdlib-jdk8"))
    implementation("commons-io:commons-io:2.11.0")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}