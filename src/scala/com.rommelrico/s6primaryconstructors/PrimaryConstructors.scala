package com.rommelrico.s6primaryconstructors

object PrimaryConstructors extends App {

  println("Start")
  val t = new StringHolder()
  println("End")

}

class StringHolder {
  println("Creating object instance")
}
