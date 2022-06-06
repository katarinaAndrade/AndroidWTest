import extensions.implementations
import dependencies.AppDependenciesLibs

plugins {
    id("module-domain")
}

dependencies {

    implementation(projects.core.data)
    implementations(AppDependenciesLibs.networkLibs)

}