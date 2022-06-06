import dependencies.AppDependencies.picasso

plugins {
    id("module-ui")
}

dependencies {

    implementation(picasso)
    implementation(projects.home.domain)
    implementation(projects.core.data)

}