name := "SBT_Assignment"

version := "0.1"

scalaVersion := "2.13.6"
lazy val common = project.in(file("common"))
  .settings(
    libraryDependencies ++= Seq( "net.manub" % "scalatest-embedded-kafka-streams_2.11" % "2.0.0",
                                "org.json4s" %% "json4s-jackson" % "3.1.0",
                                "org.scalactic" %% "scalactic" % "3.2.9",
                                "org.scalatest" %% "scalatest" % "2.2.2" % "Test",
                                "org.mockito" %% "mockito-scala" % "1.16.37" % "Test",
    )
  )

lazy val actor = project.in(file("actor"))
  .settings(
    libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor-typed" % "2.6.6",
                                "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.10",
                                "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.12" % "Test",
                                "org.scalatest" %% "scalatest" % "2.2.2" % "Test",
    )
  )
lazy val root = project.in(file(".")).aggregate(common, actor)