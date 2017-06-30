package SampleSpringBootApp

import SampleSpringBootApp.buildTypes.*
import SampleSpringBootApp.vcsRoots.*
import SampleSpringBootApp.vcsRoots.SampleSpringBootApp_HttpsGithubComThejamesthomasSampleSpringBootAppRefsHeadsMast
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "e0f7f8f7-3435-4a7d-b1b1-f063ae8a2c67"
    extId = "SampleSpringBootApp"
    parentId = "_Root"
    name = "Sample Spring Boot App"

    vcsRoot(SampleSpringBootApp_HttpsGithubComThejamesthomasSampleSpringBootAppRefsHeadsMast)

    buildType(SampleSpringBootApp_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = SampleSpringBootApp_HttpsGithubComThejamesthomasSampleSpringBootAppRefsHeadsMast.extId
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }
})
