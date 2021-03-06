dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "DiningFinder"
include(
    ":app",
    ":depconstraints",
    ":shared",
    ":model",
    ":test-shared"
)