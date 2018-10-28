package com.rommelrico.s5scalabasictypes

object BasicTypes extends App {

  // Scala has 8 ‘basic types’ corresponding to the Java primitive types:
  // Byte, Short, Int, Long, Float, Double, Boolean, Char.

  val x = 100
  val y = 100L
  println(s"x = $x and is a ${x.getClass}")
  println(s"y = $y and is a ${y.getClass}")

}
