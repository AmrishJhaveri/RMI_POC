name := "HW3_RMI"

version := "0.1"

unmanagedSourceDirectories in Compile := (javaSource in Compile).value :: Nil

// https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.2"

libraryDependencies += "junit" % "junit" % "4.11" % Test

libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"
