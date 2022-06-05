import dependencies.AppDependencies
import dependencies.AppDependenciesLibs
import extensions.implementations

plugins {
    id("module-domain")
}

dependencies {

    implementation(AppDependencies.moshi)
    implementations(AppDependenciesLibs.roomLibs)

}