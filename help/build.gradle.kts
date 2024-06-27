plugins {
    kotlin("jvm") version "2.0.0"
    `java-gradle-plugin`
    `maven-publish`
}

group = "org.namyoku"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(gradleApi())
    implementation(localGroovy())
}

gradlePlugin {
    plugins {
        create("fPlugin") {
            id = "org.namyoku.fPlugin"
            implementationClass = "org.namyoku.Fplugin"
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}