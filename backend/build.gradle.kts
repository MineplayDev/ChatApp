plugins {
    kotlin("jvm")
    java
    application
}

group = "link.mineplay.chatapp"
version = "1.0.0-alpha.1"

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(project(":shared"))

    implementation(kotlin("stdlib"))

    implementation("ch.qos.logback:logback-classic:1.2.10")

    val ktor = "1.6.7"
    implementation("io.ktor:ktor-server-core:$ktor")
    implementation("io.ktor:ktor-auth:$ktor")
    implementation("io.ktor:ktor-server-sessions:$ktor")
    implementation("io.ktor:ktor-locations:$ktor")
    implementation("io.ktor:ktor-server-host-common:$ktor")
    implementation("io.ktor:ktor-serialization:$ktor")
    implementation("io.ktor:ktor-server-netty:$ktor")
    testImplementation("io.ktor:ktor-server-tests:$ktor")

    testImplementation("org.assertj:assertj-core:3.21.0")
    testImplementation("org.mockito.kotlin:mockito-kotlin:4.0.0")

    val junit = "5.8.2"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junit")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junit")
}