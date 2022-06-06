plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {

    val androidVersion = config.Version.androidVersion
    val kotlinVersion = config.Version.kotlinVersion

    implementation("com.android.tools.build:gradle:$androidVersion")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
}

kotlin {
    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}