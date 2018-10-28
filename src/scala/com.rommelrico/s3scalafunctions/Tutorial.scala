package com.rommelrico.s3scalafunctions

object Tutorial extends App {

  // Defining an increment function.
  val increment = (x:Int) => x + 1

  // Testing
  val y = increment(12)
  println(s"Y is: $y")
  println(s"Increment type is: ${increment.getClass.getName}") // It's a Lambda!

}
