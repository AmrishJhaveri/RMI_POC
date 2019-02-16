name := "HW3_RMI"

version := "0.1"

//scalaVersion := "2.12.8"

unmanagedSourceDirectories in Compile := (javaSource in Compile).value :: Nil

//libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.11.2"
//libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.11.2"

// https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.2"

libraryDependencies += "junit" % "junit" % "4.11" % Test

libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"
