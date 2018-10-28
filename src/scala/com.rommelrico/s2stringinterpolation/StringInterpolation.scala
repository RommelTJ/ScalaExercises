package com.rommelrico.s2stringinterpolation

object StringInterpolation extends App {

  val person = Person("Rommel", 30)
  println(s"Hello ${person.name}, how are you?")

}

case class Person(name: String, age: Int)
