name := """play-scala-starter-example"""

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(GitVersioning)

dockerExposedPorts := Seq(9000)

git.useGitDescribe := true

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.194"
