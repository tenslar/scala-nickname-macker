lazy val root = (project in file("."))
  .settings(
    name := "NickNameMacker",
    scalaVersion := "2.12.2",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % Test,
    publishTo := Some(Resolver.file("file",file("repo")))
  )
