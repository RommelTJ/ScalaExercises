package com.rommelrico.s6primaryconstructors

object PrimaryConstructors extends App {

  println("Start")
  val t = new StringHolder("This is a test")
  println("End")

}

class StringHolder(text: String) {
  println(s"Holding string of ${text.length} chars")
}
