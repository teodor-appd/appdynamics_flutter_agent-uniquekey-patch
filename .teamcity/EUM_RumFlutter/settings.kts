package EUM_RumFlutter

import com.appdynamics.build.teamcity.pipelib.*

AppdBuildSettings.Builder(AppdBuild.PipeLibType.JAVA_LIB)
        .teamcityParent("EUM")
        .bitbucketProject("eum")
        .repo("rum-flutter")
        .projectID("EUM_RumFlutter")
        .testTargets()
        .buildTargets("build", "analyze", "runTests", ":example:buildAndroid", ":example:buildiOS")
        .simpleParams()
        .passwordParams()
        .checkboxParams()
        .selectParams()
        .projectName("Flutter Agent")
        .build()
