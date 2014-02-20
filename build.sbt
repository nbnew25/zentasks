import play.Project._

name := "orcadsymbol"

version := "1.0"

libraryDependencies ++= Seq(
	javaJdbc, 
	javaEbean,
	"mysql" % "mysql-connector-java" % "5.1.18")     

playJavaSettings
