**Referential Integrity in RMI:** 

If two references to an object are passed from one JVM to another JVM in parameters (or in the return value) in a single remote method call and those references refer to the same object in the sending JVM, those references will refer to a single copy of the object in the receiving JVM.



**To test:**

`sbt clean compile test`

**To run Server:**

`sbt clean compile "runMain Server"` 
or
`sbt clean compile run` (select Server i.e option 2)


**To run Client:**

`sbt "runMain Client"`
or
`sbt run` (select Client i.e option 1)

