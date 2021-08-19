name := "SBT_Assignment"

version := "0.1"

scalaVersion := "2.13.6"
lazy val common = project.in(file("common"))
  .settings(
    libraryDependencies += "net.manub" % "scalatest-embedded-kafka-streams_2.11" % "2.0.0",
    libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.1.0",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9",
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "Test",
    libraryDependencies +="org.mockito" %% "mockito-scala" % "1.16.37" % "Test",
)

lazy val actor = project.in(file("actor"))
  .settings(
    libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.6",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.15",
    libraryDependencies += "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.10",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.12" % "Test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "Test",
)