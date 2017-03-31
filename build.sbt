name := "monument"

version := "0.0.1"

libraryDependencies ++= Seq(
    "io.dropwizard" % "dropwizard-core" % "1.1.0",
    "io.swagger" % "swagger-jaxrs" % "1.5.12",
    "com.smoketurner" % "dropwizard-swagger" % "1.1.0-1"
)

autoScalaLibrary := false

crossPaths := false

publishMavenStyle := true

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

enablePlugins(JavaAppPackaging)
