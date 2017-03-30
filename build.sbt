name := "monument"

version := "0.0.1"

libraryDependencies ++= Seq(
    "com.yammer.dropwizard" % "dropwizard-core" % "0.9.2"
)

autoScalaLibrary := false

crossPaths := false

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

