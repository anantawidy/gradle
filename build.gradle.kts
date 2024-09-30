plugins {
    id("java")
}

group = "org.ananta"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.13.2")
    testImplementation("com.google.guava:guava:33.3.1-jre")
}

tasks.test {
    useJUnitPlatform()
}

tasks.register("greetingTask") {
    doLast {
        val nama: String = if (project.hasProperty("nama")) project.property("nama").toString() else "Gradle User"
        println("Hello, $nama! Welcome to Gradle World!")
    }
}