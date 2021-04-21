lazy val root:Project= (project in file(".")).
	settings(
		name := "threejs-facade",
		version := "0.1-SNAPSHOT",
		scalaVersion:="2.13.1",
		scalacOptions ++= Seq( "-deprecation"),
		scalaJSStage in Global := FastOptStage
	).enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"


