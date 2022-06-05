enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "AndroidWTest"
include(
    ":app",
    ":app:domain"
)
include(
    ":core:navigation",
    ":core:network",
    ":core:data"
)
include(
    ":home:domain",
    ":home:ui"
)