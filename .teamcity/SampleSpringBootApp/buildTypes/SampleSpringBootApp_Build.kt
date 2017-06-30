package SampleSpringBootApp.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object SampleSpringBootApp_Build : BuildType({
    uuid = "e26bffc1-eb3d-4edd-9b80-54b33016b0b9"
    extId = "SampleSpringBootApp_Build"
    name = "Build"

    vcs {
        root(SampleSpringBootApp.vcsRoots.SampleSpringBootApp_HttpsGithubComThejamesthomasSampleSpringBootAppRefsHeadsMast)

    }

    triggers {
        vcs {
        }
    }
})
