name := "NickNameMacker"
organization := "com.github.tenslar"

licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
homepage := Some(url("https://github.com/tenslar/scala-nickname-macker"))

scalaVersion := "2.12.2"
crossScalaVersions := Seq("2.12.12", "2.13.4")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % Test



// Release
import ReleaseTransformations._

releaseCrossBuild := true // true if you cross-build the project for multiple Scala versions
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  // For non cross-build projects, use releaseStepCommand("publishSigned")
  releaseStepCommandAndRemaining("+publishSigned"),
  setNextVersion,
  commitNextVersion,
  releaseStepCommand("sonatypeReleaseAll"),
  pushChanges
)

// Publishing
publishMavenStyle := true
publishArtifact in Test := false
publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/tenslar/scala-nickname-macker"),
    "scm:git@github.com:tenslar/scala-nickname-macker.git"
  )
)

developers := List(
  Developer(
    id    = "tenslar",
    name  = "tensler",
    email = "tensler906@gmail.com",
    url   = url("https://github.com/tenslar")
  )
)
