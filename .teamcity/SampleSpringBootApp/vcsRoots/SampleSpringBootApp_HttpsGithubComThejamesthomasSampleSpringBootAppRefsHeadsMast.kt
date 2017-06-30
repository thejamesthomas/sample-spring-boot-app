package SampleSpringBootApp.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object SampleSpringBootApp_HttpsGithubComThejamesthomasSampleSpringBootAppRefsHeadsMast : GitVcsRoot({
    uuid = "fedea065-695f-4b82-92b7-0e6009801200"
    extId = "SampleSpringBootApp_HttpsGithubComThejamesthomasSampleSpringBootAppRefsHeadsMast"
    name = "https://github.com/thejamesthomas/sample-spring-boot-app#refs/heads/master"
    url = "https://github.com/thejamesthomas/sample-spring-boot-app"
    authMethod = password {
        userName = "thejamesthomas"
        password = "credentialsJSON:def84ecb-b66a-449d-9b39-d0b9a21f7214"
    }
})
