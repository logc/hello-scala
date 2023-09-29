ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "3.3.1"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "hello-scala",
  )

Compile / doc / target := file("docs")
Compile / doc / scalacOptions ++= Seq(
  "-siteroot", "src/docs",
  "-snippet-compiler:compile",
  "-doc-root-content", "readme.md"
  )
