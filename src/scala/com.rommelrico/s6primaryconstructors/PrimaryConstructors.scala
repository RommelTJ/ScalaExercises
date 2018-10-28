package com.rommelrico.s6primaryconstructors

object PrimaryConstructors extends App {

  println("Start")
  val t = new StringHolder("This is a test")
  println("End")

  println("Start")
  val y = new StringHolder()
  println("End")

}

class StringHolder(text: String = "lorem ipsum") {
  println(s"Holding string of ${text.length} chars")
}
