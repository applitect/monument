name := "monument"

version := "0.0.1"

libraryDependencies ++= Seq(
    "io.dropwizard" % "dropwizard-core" % "1.1.0"
)

autoScalaLibrary := false

crossPaths := false

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

