package com.rommelrico.s2stringinterpolation

object StringInterpolation extends App {

  val person = Person("Rommel", 30)
  println(s"Hello ${person.name}, how are you?")
  println(s"You are ${person.age} years old")
  println("You are " + person.age + " years old")

  // C-style printf substitutions
  val height = 1.9d
  val name = "James"
  println(f"$name%s is $height%2.2f meters tall")

}

case class Person(name: String, age: Int)
