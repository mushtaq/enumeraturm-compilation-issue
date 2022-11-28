val scala3Version = "3.2.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "enumeraturm-compilation-issue",
    version := "0.1.0-SNAPSHOT",
    resolvers += "jitpack" at "https://jitpack.io",

    scalaVersion := scala3Version,

    libraryDependencies += "com.github.mushtaq.enumeratum" %% "enumeratum" % "3d87c50",
  )
