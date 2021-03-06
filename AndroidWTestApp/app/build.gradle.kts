import config.AppConfig
import extensions.implementations
import dependencies.AppDependenciesLibs.defaultAppLibs
import dependencies.AppDependenciesLibs.testLibs
import dependencies.AppDependenciesLibs.koinLibs
import dependencies.AppDependenciesLibs.lifecycleLibs

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = AppConfig.compileSDK

    defaultConfig {
        applicationId = "com.kat.androidwtest"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.androidJUnitRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementations(defaultAppLibs)
    implementations(testLibs)

    implementations(koinLibs)
    implementations(lifecycleLibs)

    implementation(projects.app.domain)

    implementation(projects.home.ui)
    implementation(projects.home.domain)

    implementation(projects.core.navigation)
    implementation(projects.core.network)
    implementation(projects.core.data)

}