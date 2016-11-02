name := """play_agenda"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.webjars.bower" % "compass-mixins" % "0.12.7",
  "org.webjars.bower" % "bootstrap-sass" % "3.3.6"
)

