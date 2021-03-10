name := "hackerrand_functional"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(

	"ch.qos.logback" % "logback-classic" % "1.2.3",
	"com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",

	"org.scalactic" %% "scalactic" % "3.2.5",
	"org.scalatest" %% "scalatest" % "3.2.5" % "test"
)