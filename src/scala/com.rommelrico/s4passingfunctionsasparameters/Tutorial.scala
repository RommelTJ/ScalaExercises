package com.rommelrico.s4passingfunctionsasparameters

object Tutorial extends App {

  def saySomething(): Unit = {
    println("Hi everyone!")
  }

  // Calls a function multiple times.
  def callFunctionNTimes(n: Int, callback: => Unit) {
    for (x <- 0.until(n)) {
      callback
    }
  }

}
