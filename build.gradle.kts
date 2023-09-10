/**
 *
 */
val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

val exposed_version: String by project
val h2_version: String by project
plugins {
    kotlin("jvm") version "1.9.0"
    id("io.ktor.plugin") version "2.3.3"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.0"
}

group = "com.hewdev"
version = "0.0.1"

application {
    mainClass.set("com.hewdev.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm")  // Core module of the Ktor framework for server functionality.
    implementation("io.ktor:ktor-server-content-negotiation-jvm")  // Adds content negotiation support.
    implementation("io.ktor:ktor-serialization-jackson-jvm")  // Jackson serialization support.
    implementation("io.ktor:ktor-serialization-gson-jvm")  // Gson serialization support.
    implementation("io.ktor:ktor-server-auth-jvm")  // Authentication and authorization features.
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm")  // kotlinx.serialization support for JSON.
    implementation("io.ktor:ktor-server-status-pages:$ktor_version")  // Status pages for server health info.
    implementation("io.ktor:ktor-server-default-headers:$ktor_version")  // Default headers for responses.
    implementation("org.jetbrains.exposed:exposed-core:$exposed_version")  // Exposed SQL library core.
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposed_version")  // Exposed JDBC driver support.
    implementation("org.jetbrains.exposed:exposed-dao:$exposed_version")  // Exposed Data Access Object (DAO) extension.
    implementation("org.jetbrains.exposed:exposed-java-time:0.42.1")  // Exposed extension for Java Time.
    implementation("joda-time:joda-time:2.12.5")  // Joda-Time library for date and time.
    implementation("io.ktor:ktor-features:1.6.8")  // Additional features for Ktor.
    implementation("org.xerial:sqlite-jdbc:3.34.0")  // JDBC driver for SQLite.
    implementation("io.ktor:ktor-server-websockets-jvm")  // WebSocket support for Ktor.
    implementation("io.ktor:ktor-server-netty-jvm")  // Netty engine support for Ktor.
    implementation("ch.qos.logback:logback-classic:$logback_version")  // Logback Classic logging.
    testImplementation("io.ktor:ktor-server-tests-jvm")  // Testing support for Ktor.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")  // Kotlin testing with JUnit.
}
