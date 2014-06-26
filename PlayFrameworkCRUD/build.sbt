name := "PlayFrameworkCRUD"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc4",
  "mysql" % "mysql-connector-java" % "5.1.31" 
)     

play.Project.playJavaSettings
