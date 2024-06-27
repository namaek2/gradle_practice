plugins {
    kotlin("jvm") version "2.0.0"
    id("org.namyoku.fPlugin")
}

group = "org.namyoku"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}


tasks.named("printHello") {
    doLast {
        println("Running printHello")
    }
}